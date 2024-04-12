package com.jagex.game.client;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.invtype.InvType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.world.entity.PlayerModel;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ajo")
public class ClientInvCache extends Node {

	@ObfuscatedName("ajo.k")
	public static final HashTable recentUse = new HashTable(32);

	@ObfuscatedName("ajo.f")
	public static final SoftLruHashTable modelCache = new SoftLruHashTable(10);

	@ObfuscatedName("ajo.w")
	public static int field11222;

	@ObfuscatedName("ajo.l")
	public int[] invSlotObjId = new int[] { -1 };

	@ObfuscatedName("ajo.u")
	public int[] invSlotObjCount = new int[] { 0 };

	@ObfuscatedName("ajo.z")
	public VarContainerSparse[] vars = null;

	@ObfuscatedName("aau.e(IIZI)I")
	public static int getObj(int invId, int slot, boolean arg2) {
		ClientInvCache inv = getCachedInvs(invId, arg2);
		if (inv == null) {
			return -1;
		} else if (slot >= 0 && slot < inv.invSlotObjId.length) {
			return inv.invSlotObjId[slot];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aal.n(IIZI)I")
	public static int getNum(int invId, int slot, boolean arg2) {
		ClientInvCache inv = getCachedInvs(invId, arg2);
		if (inv == null) {
			return 0;
		} else if (slot >= 0 && slot < inv.invSlotObjCount.length) {
			return inv.invSlotObjCount[slot];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("adr.m(IIIZB)I")
	public static int getVar(int invId, int slot, int varbitId, boolean arg3) {
		VarBitType varbit = (VarBitType) Client.varBitTypeList.list(varbitId);
		VarType baseVar = varbit.baseVar;
		ClientInvCache inv = getCachedInvs(invId, arg3);
		int var7;
		if (inv == null || slot < 0 || slot >= inv.invSlotObjCount.length || inv.vars == null || inv.vars[slot] == null) {
			var7 = (Integer) baseVar.getDefaultValue();
		} else {
			var7 = inv.vars[slot].getVarValueInt(baseVar.id);
		}
		return varbit.getVarbitValue(var7);
	}

	@ObfuscatedName("na.k(IIZB)I")
	public static int total(int invId, int slot, boolean arg2) {
		ClientInvCache inv = getCachedInvs(invId, arg2);
		if (inv == null) {
			return 0;
		} else if (slot == -1) {
			return 0;
		} else {
			int total = 0;
			for (int index = 0; index < inv.invSlotObjCount.length; index++) {
				if (inv.invSlotObjId[index] == slot) {
					total += inv.invSlotObjCount[index];
				}
			}
			return total;
		}
	}

	@ObfuscatedName("abe.f(IIZI)I")
	public static int totalCat(int invId, int categoryId, boolean arg2) {
		int total = 0;
		ClientInvCache inv = getCachedInvs(invId, arg2);
		if (inv == null) {
			return 0;
		}
		for (int slot = 0; slot < inv.invSlotObjId.length; slot++) {
			if (inv.invSlotObjId[slot] >= 0 && ((ObjType) Client.objTypeList.list(inv.invSlotObjId[slot])).category == categoryId) {
				total += getNum(invId, slot, arg2);
			}
		}
		return total;
	}

	@ObfuscatedName("pu.w(IIZZI)I")
	public static int totalParam(int invId, int paramId, boolean stack, boolean arg3) {
		ClientInvCache var4 = getCachedInvs(invId, arg3);
		if (var4 == null) {
			return 0;
		}
		int total = 0;
		for (int slot = 0; slot < var4.invSlotObjId.length; slot++) {
			if (var4.invSlotObjId[slot] >= 0 && var4.invSlotObjId[slot] < Client.objTypeList.num) {
				ObjType objType = (ObjType) Client.objTypeList.list(var4.invSlotObjId[slot]);
				int value = objType.getParam(paramId, ((ParamType) Client.paramTypeList.list(paramId)).defaultint);
				if (stack) {
					total += var4.invSlotObjCount[slot] * value;
				} else if (var4.invSlotObjCount[slot] > 0) {
					total += value;
				}
			}
		}
		return total;
	}

	@ObfuscatedName("pf.l(IZS)I")
	public static int freespace(int invId, boolean arg1) {
		if (arg1) {
			return 0;
		}
		ClientInvCache inv = getCachedInvs(invId, arg1);
		if (inv == null) {
			return ((InvType) Client.invTypeList.list(invId)).size;
		}
		int total = 0;
		for (int var4 = 0; var4 < inv.invSlotObjId.length; var4++) {
			if (inv.invSlotObjId[var4] == -1) {
				total++;
			}
		}
		return total + (((InvType) Client.invTypeList.list(invId)).size - inv.invSlotObjId.length);
	}

	@ObfuscatedName("so.u(IZS)Lajo;")
	public static ClientInvCache getCachedInvs(int arg0, boolean arg1) {
		long var2 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (ClientInvCache) recentUse.get(var2);
	}

	@ObfuscatedName("hg.z(IIIILabn;ZI)V")
	public static void update(int arg0, int arg1, int arg2, int arg3, VarContainerSparse arg4, boolean arg5) {
		long var6 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		ClientInvCache var8 = (ClientInvCache) recentUse.get(var6);
		if (var8 == null) {
			var8 = new ClientInvCache();
			recentUse.put(var8, var6);
		}
		if (var8.invSlotObjId.length <= arg1) {
			int[] var9 = new int[arg1 + 1];
			int[] var10 = new int[arg1 + 1];
			VarContainerSparse[] var11 = null;
			if (var8.vars != null) {
				var11 = new VarContainerSparse[arg1 + 1];
			}
			for (int var12 = 0; var12 < var8.invSlotObjId.length; var12++) {
				var9[var12] = var8.invSlotObjId[var12];
				var10[var12] = var8.invSlotObjCount[var12];
				if (var8.vars != null) {
					var11[var12] = var8.vars[var12];
				}
			}
			for (int var13 = var8.invSlotObjId.length; var13 < arg1; var13++) {
				var9[var13] = -1;
				var10[var13] = 0;
			}
			var8.invSlotObjId = var9;
			var8.invSlotObjCount = var10;
			var8.vars = var11;
		}
		var8.invSlotObjId[arg1] = arg2;
		var8.invSlotObjCount[arg1] = arg3;
		if (arg4 != null) {
			if (var8.vars == null) {
				var8.vars = new VarContainerSparse[var8.invSlotObjId.length];
			}
			var8.vars[arg1] = arg4;
		} else if (var8.vars != null) {
			var8.vars[arg1] = null;
		}
	}

	@ObfuscatedName("qe.p(IZB)V")
	public static void clear(int arg0, boolean arg1) {
		ClientInvCache inv = getCachedInvs(arg0, arg1);
		if (inv == null) {
			return;
		}
		for (int slot = 0; slot < inv.invSlotObjId.length; slot++) {
			inv.invSlotObjId[slot] = -1;
			inv.invSlotObjCount[slot] = 0;
		}
		inv.vars = null;
	}

	@ObfuscatedName("xj.d(IZB)V")
	public static void remove(int arg0, boolean arg1) {
		ClientInvCache var2 = getCachedInvs(arg0, arg1);
		if (var2 != null) {
			var2.unlink();
		}
	}

	@ObfuscatedName("ei.c(B)V")
	public static void removeAll() {
		recentUse.removeAll();
	}

	@ObfuscatedName("ajo.r([II[IZI)J")
	public long method17471(int[] arg0, int arg1, int[] arg2, boolean arg3) {
		long[] var5 = Packet.crc64table;
		long var6 = -1L;
		long var8 = var6 >>> 8 ^ var5[(int) ((var6 ^ (long) (arg1 >> 8)) & 0xFFL)];
		long var10 = var8 >>> 8 ^ var5[(int) ((var8 ^ (long) arg1) & 0xFFL)];
		for (int var12 = 0; var12 < arg0.length; var12++) {
			long var13 = var10 >>> 8 ^ var5[(int) ((var10 ^ (long) (arg0[var12] >> 24)) & 0xFFL)];
			long var15 = var13 >>> 8 ^ var5[(int) ((var13 ^ (long) (arg0[var12] >> 16)) & 0xFFL)];
			long var17 = var15 >>> 8 ^ var5[(int) ((var15 ^ (long) (arg0[var12] >> 8)) & 0xFFL)];
			var10 = var17 >>> 8 ^ var5[(int) ((var17 ^ (long) arg0[var12]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (int var19 = 0; var19 < 5; var19++) {
				var10 = var10 >>> 8 ^ var5[(int) ((var10 ^ (long) arg2[var19]) & 0xFFL)];
			}
		}
		return var10 >>> 8 ^ var5[(int) ((var10 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@ObfuscatedName("ajo.v(Ldh;ILaaq;IZLxg;I)Ldo;")
	public final Model method17475(Toolkit arg0, int arg1, AnimationNode arg2, int arg3, boolean arg4, PlayerModel arg5) {
		Model var7 = null;
		int var8 = arg1;
		BASType var9 = null;
		if (arg3 != -1) {
			var9 = (BASType) Client.basTypeList.list(arg3);
		}
		int[] var10 = this.invSlotObjId;
		if (var9 != null && var9.field7318 != null) {
			var10 = new int[var9.field7318.length];
			for (int var11 = 0; var11 < var9.field7318.length; var11++) {
				int var12 = var9.field7318[var11];
				if (var12 >= 0 && var12 < this.invSlotObjId.length) {
					var10[var11] = this.invSlotObjId[var12];
				} else {
					var10[var11] = -1;
				}
			}
		}
		if (arg2 != null) {
			var8 = arg1 | arg2.method14358();
		}
		long var13 = this.method17471(var10, arg3, arg5 == null ? null : arg5.field7894, arg4);
		if (modelCache != null) {
			var7 = (Model) modelCache.get(var13);
		}
		if (var7 == null || arg0.method2394(var7.method1691(), var8) != 0) {
			if (var7 != null) {
				var8 = arg0.method2213(var8, var7.method1691());
			}
			int var15 = var8;
			boolean var16 = false;
			for (int var17 = 0; var17 < var10.length; var17++) {
				if (var10[var17] != -1 && !((ObjType) Client.objTypeList.list(var10[var17])).method14649(arg4, null)) {
					var16 = true;
				}
			}
			if (var16) {
				return null;
			}
			ModelUnlit[] var18 = new ModelUnlit[var10.length];
			for (int var19 = 0; var19 < var10.length; var19++) {
				if (var10[var19] != -1) {
					var18[var19] = ((ObjType) Client.objTypeList.list(var10[var19])).method14650(arg4, null);
				}
			}
			if (var9 != null && var9.field7357 != null) {
				for (int var20 = 0; var20 < var9.field7357.length; var20++) {
					if (var9.field7357[var20] != null && var18[var20] != null) {
						int var21 = var9.field7357[var20][0];
						int var22 = var9.field7357[var20][1];
						int var23 = var9.field7357[var20][2];
						int var24 = var9.field7357[var20][3];
						int var25 = var9.field7357[var20][4];
						int var26 = var9.field7357[var20][5];
						if (var24 != 0 || var25 != 0 || var26 != 0) {
							var18[var20].method1946(var24, var25, var26);
						}
						if (var21 != 0 || var22 != 0 || var23 != 0) {
							var18[var20].method1945(var21, var22, var23);
						}
					}
				}
			}
			ModelUnlit var27 = new ModelUnlit(var18, var18.length);
			if (arg5 != null) {
				var15 = var8 | 0x4000;
			}
			var7 = arg0.createModel(var27, var15, field11222, 65, 852);
			if (arg5 != null) {
				int var28 = 0;
				label123: while (true) {
					if (var28 >= 10) {
						int var30 = 0;
						while (true) {
							if (var30 >= 10) {
								break label123;
							}
							for (int var31 = 0; var31 < PlayerModel.field10766[var30].length; var31++) {
								if (arg5.field7895[var30] < PlayerModel.field9259[var30][var31].length) {
									var7.retexture(PlayerModel.field10766[var30][var31], PlayerModel.field9259[var30][var31][arg5.field7895[var30]]);
								}
							}
							var30++;
						}
					}
					for (int var29 = 0; var29 < PlayerModel.field7577[var28].length; var29++) {
						if (arg5.field7894[var28] < PlayerModel.field1434[var28][var29].length) {
							var7.recolor(PlayerModel.field7577[var28][var29], PlayerModel.field1434[var28][var29][arg5.field7894[var28]]);
						}
					}
					var28++;
				}
			}
			if (modelCache != null) {
				var7.method1690(var8);
				modelCache.put(var7, var13);
			}
		}
		if (arg2 == null) {
			return var7;
		} else {
			Model var32 = var7.method1773((byte) 1, var8, true);
			arg2.method14359(var32, 0);
			return var32;
		}
	}

	@ObfuscatedName("ku.y(IB)V")
	public static void resetModelCache(int arg0) {
		field11222 = arg0;
		modelCache.reset();
	}

	@ObfuscatedName("acd.x(I)V")
	public static void cacheReset() {
		modelCache.reset();
	}
}
