package com.jagex.game.world.entity;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.defaults.WearposDefaults;
import com.jagex.game.config.idktype.IDKType;
import com.jagex.game.config.idktype.IDKTypeList;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.npctype.NPCTypeList;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.objtype.ObjTypeList;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("xg")
public class PlayerModel {

	@ObfuscatedName("xg.u")
	public int field7891;

	@ObfuscatedName("xg.z")
	public int[] field7890;

	@ObfuscatedName("xg.p")
	public ObjTypeCustomisation[] field7887;

	@ObfuscatedName("xg.d")
	public int[] field7894;

	@ObfuscatedName("xg.c")
	public int[] field7895;

	@ObfuscatedName("xg.r")
	public boolean isFemale;

	@ObfuscatedName("xg.v")
	public int field7892 = -1;

	@ObfuscatedName("xg.o")
	public long field7888;

	@ObfuscatedName("xg.s")
	public long field7899;

	@ObfuscatedName("vn.y")
	public static short[][] field7577;

	@ObfuscatedName("dk.q")
	public static short[][][] field1434;

	@ObfuscatedName("aip.x")
	public static short[][] field10766;

	@ObfuscatedName("adm.b")
	public static short[][][] field9259;

	@ObfuscatedName("xg.h")
	public static final int[] field7900 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@ObfuscatedName("xg.a")
	public static SoftLruHashTable field7901 = new SoftLruHashTable(260);

	@ObfuscatedName("xg.g")
	public static SoftLruHashTable field7902 = new SoftLruHashTable(5);

	@ObfuscatedName("ns.i")
	public static int field4037;

	@ObfuscatedName("xg.e(I[I[Labw;[I[IZII)V")
	public void setAppearance(int arg0, int[] arg1, ObjTypeCustomisation[] arg2, int[] arg3, int[] arg4, boolean arg5, int arg6) {
		if (this.field7891 != arg0) {
			this.field7891 = arg0;
		}
		this.field7890 = arg1;
		this.field7887 = arg2;
		this.field7894 = arg3;
		this.field7895 = arg4;
		this.isFemale = arg5;
		this.field7892 = arg6;
		this.method10118();
	}

	@ObfuscatedName("xg.n(IILaov;I)V")
	public void setIDKPart(int arg0, int arg1, IDKTypeList arg2) {
		int var4 = field7900[arg0];
		if (arg2.list(arg1) != null) {
			this.field7890[var4] = arg1 | Integer.MIN_VALUE;
			this.method10118();
		}
	}

	@ObfuscatedName("xg.m(III)V")
	public void setIDKRecolourSlot(int arg0, int arg1) {
		this.field7894[arg0] = arg1;
		this.method10118();
	}

	@ObfuscatedName("xg.k(IIB)V")
	public void setIDKRematerialSlot(int arg0, int arg1) {
		this.field7895[arg0] = arg1;
		this.method10118();
	}

	@ObfuscatedName("xg.f(ZB)V")
	public void setGender(boolean arg0) {
		this.isFemale = arg0;
		this.method10118();
	}

	@ObfuscatedName("xg.w(IILaon;B)V")
	public void setObject(int arg0, int arg1, ObjTypeList arg2) {
		if (arg1 == -1) {
			this.field7890[arg0] = 0;
		} else if (arg2.list(arg1) == null) {
			return;
		} else {
			this.field7890[arg0] = arg1 | 0x40000000;
			this.method10118();
		}
	}

	@ObfuscatedName("xg.l(I)V")
	public void method10118() {
		long[] var1 = Packet.crc64table;
		this.field7888 = -1L;
		this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7891 >> 8)) & 0xFFL)];
		this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7891) & 0xFFL)];
		for (int var2 = 0; var2 < this.field7890.length; var2++) {
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7890[var2] >> 24)) & 0xFFL)];
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7890[var2] >> 16)) & 0xFFL)];
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7890[var2] >> 8)) & 0xFFL)];
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7890[var2]) & 0xFFL)];
		}
		if (this.field7887 != null) {
			for (int var3 = 0; var3 < this.field7887.length; var3++) {
				if (this.field7887[var3] != null) {
					int[] var4;
					int[] var5;
					if (this.isFemale) {
						var4 = this.field7887[var3].field8708;
						var5 = this.field7887[var3].field8713;
					} else {
						var4 = this.field7887[var3].field8710;
						var5 = this.field7887[var3].field8709;
					}
					if (var4 != null) {
						for (int var6 = 0; var6 < var4.length; var6++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (var4[var6] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) var4[var6]) & 0xFFL)];
						}
					}
					if (var5 != null) {
						for (int var7 = 0; var7 < var5.length; var7++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (var5[var7] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) var5[var7]) & 0xFFL)];
						}
					}
					if (this.field7887[var3].field8714 != null) {
						for (int var8 = 0; var8 < this.field7887[var3].field8714.length; var8++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7887[var3].field8714[var8] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7887[var3].field8714[var8]) & 0xFFL)];
						}
					}
					if (this.field7887[var3].field8715 != null) {
						for (int var9 = 0; var9 < this.field7887[var3].field8715.length; var9++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7887[var3].field8715[var9] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7887[var3].field8715[var9]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (int var10 = 0; var10 < 10; var10++) {
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7894[var10]) & 0xFFL)];
		}
		for (int var11 = 0; var11 < 10; var11++) {
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7895[var11]) & 0xFFL)];
		}
		this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.isFemale ? 1 : 0)) & 0xFFL)];
	}

	@ObfuscatedName("xg.u(Ldh;ILaof;Laov;Laod;Laon;Lem;Lep;Laaq;Laaq;[Laaq;[IIZLwy;B)Ldo;")
	public Model getBodyModel(Toolkit arg0, int arg1, BASTypeList arg2, IDKTypeList arg3, NPCTypeList arg4, ObjTypeList arg5, VariableTypeProvider arg6, VarIntDomain arg7, AnimationNode arg8, AnimationNode arg9, AnimationNode[] arg10, int[] arg11, int arg12, boolean arg13, WearposDefaults arg14) {
		if (this.field7892 != -1) {
			return ((NPCType) arg4.list(this.field7892)).getSequencedModel(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		int var16 = arg1;
		long var17 = this.field7888;
		int[] var19 = this.field7890;
		boolean var20 = false;
		boolean var21 = false;
		if (arg8 != null) {
			SeqType var22 = arg8.getSeqType();
			if (var22 != null && (var22.mainhand >= 0 || var22.offhand >= 0)) {
				var19 = new int[this.field7890.length];
				for (int var23 = 0; var23 < var19.length; var23++) {
					var19[var23] = this.field7890[var23];
				}
				if (var22.mainhand >= 0 && arg14.mainhand != -1) {
					var20 = true;
					if (var22.mainhand == 65535) {
						var19[arg14.mainhand] = 0;
						for (int var24 = 0; var24 < arg14.field7769.length; var24++) {
							var19[arg14.field7769[var24]] = 0;
						}
						var17 ^= 0xFFFFFFFF00000000L;
					} else {
						var19[arg14.mainhand] = var22.mainhand | 0x40000000;
						for (int var25 = 0; var25 < arg14.field7769.length; var25++) {
							var19[arg14.field7769[var25]] = 0;
						}
						var17 ^= (long) var19[arg14.mainhand] << 32;
					}
				}
				if (var22.offhand >= 0 && arg14.offhand != -1) {
					var21 = true;
					if (var22.offhand == 65535) {
						var19[arg14.offhand] = 0;
						for (int var26 = 0; var26 < arg14.field7767.length; var26++) {
							var19[arg14.field7767[var26]] = 0;
						}
						var17 ^= 0xFFFFFFFFL;
					} else {
						var19[arg14.offhand] = var22.offhand | 0x40000000;
						for (int var27 = 0; var27 < arg14.field7767.length; var27++) {
							var19[arg14.field7767[var27]] = 0;
						}
						var17 ^= var19[arg14.offhand];
					}
				}
			}
		}
		boolean var28 = false;
		int var29 = arg10 == null ? 0 : arg10.length;
		for (int var30 = 0; var30 < var29; var30++) {
			if (arg10[var30] != null) {
				var16 |= arg10[var30].method14358();
				var28 = true;
			}
		}
		if (arg8 != null) {
			var16 |= arg8.method14358();
			var28 = true;
		}
		if (arg9 != null) {
			var16 |= arg9.method14358();
			var28 = true;
		}
		boolean var31 = false;
		if (arg11 != null) {
			for (int var32 = 0; var32 < arg11.length; var32++) {
				if (arg11[var32] != -1) {
					var16 |= 0x20;
					var31 = true;
				}
			}
		}
		SoftLruHashTable var33 = field7901;
		Model var34;
		synchronized (field7901) {
			var34 = (Model) field7901.get(var17);
		}
		BASType var36 = null;
		if (this.field7891 != -1) {
			var36 = (BASType) arg2.list(this.field7891);
		}
		if (var34 == null || arg0.method2394(var34.method1691(), var16) != 0) {
			if (var34 != null) {
				var16 = arg0.method2213(var16, var34.method1691());
			}
			boolean var38 = false;
			int var39 = 0;
			while (true) {
				if (var39 >= var19.length) {
					if (var38) {
						if (this.field7899 != -1L) {
							SoftLruHashTable var45 = field7901;
							synchronized (field7901) {
								var34 = (Model) field7901.get(this.field7899);
							}
						}
						if (var34 == null || arg0.method2394(var34.method1691(), var16) != 0) {
							return null;
						}
					} else {
						ModelUnlit[] var47 = new ModelUnlit[var19.length];
						for (int var48 = 0; var48 < var19.length; var48++) {
							int var49 = var19[var48];
							ObjTypeCustomisation var50 = null;
							boolean var51 = var48 == 5 && var20 || var48 == 3 && var21;
							if ((var49 & 0x40000000) != 0) {
								if (!var51 && this.field7887 != null && this.field7887[var48] != null) {
									var50 = this.field7887[var48];
								}
								ModelUnlit var52 = ((ObjType) arg5.list(var49 & 0x3FFFFFFF)).method14650(this.isFemale, var50);
								if (var52 != null) {
									var47[var48] = var52;
								}
							} else if ((var49 & Integer.MIN_VALUE) != 0) {
								ModelUnlit var53 = ((IDKType) arg3.list(var49 & 0x3FFFFFFF)).getModel();
								if (var53 != null) {
									var47[var48] = var53;
								}
							}
						}
						if (var36 != null && var36.field7357 != null) {
							for (int var54 = 0; var54 < var36.field7357.length; var54++) {
								if (var47[var54] != null) {
									int var55 = 0;
									int var56 = 0;
									int var57 = 0;
									int var58 = 0;
									int var59 = 0;
									int var60 = 0;
									if (var36.field7357[var54] != null) {
										var55 = var36.field7357[var54][0];
										var56 = var36.field7357[var54][1];
										var57 = var36.field7357[var54][2];
										var58 = var36.field7357[var54][3] << 3;
										var59 = var36.field7357[var54][4] << 3;
										var60 = var36.field7357[var54][5] << 3;
									}
									if (var58 != 0 || var59 != 0 || var60 != 0) {
										var47[var54].method1946(var58, var59, var60);
									}
									if (var55 != 0 || var56 != 0 || var57 != 0) {
										var47[var54].method1945(var55, var56, var57);
									}
								}
							}
						}
						ModelUnlit var61 = new ModelUnlit(var47, var47.length);
						int var62 = var16 | 0x4000;
						var34 = arg0.createModel(var61, var62, field4037, 64, 850);
						for (int var63 = 0; var63 < 10; var63++) {
							for (int var64 = 0; var64 < field7577[var63].length; var64++) {
								if (this.field7894[var63] < field1434[var63][var64].length) {
									var34.recolor(field7577[var63][var64], field1434[var63][var64][this.field7894[var63]]);
								}
							}
						}
						for (int var65 = 0; var65 < 10; var65++) {
							for (int var66 = 0; var66 < field10766[var65].length; var66++) {
								if (this.field7895[var65] < field9259[var65][var66].length) {
									var34.retexture(field10766[var65][var66], field9259[var65][var66][this.field7895[var65]]);
								}
							}
						}
						var34.method1736();
						if (arg13) {
							var34.method1690(var16);
							SoftLruHashTable var67 = field7901;
							synchronized (field7901) {
								field7901.put(var34, var17);
							}
							this.field7899 = var17;
						}
					}
					break;
				}
				int var40 = var19[var39];
				ObjTypeCustomisation var41 = null;
				boolean var42 = false;
				if (var20) {
					if (arg14.mainhand == var39) {
						var42 = true;
					} else {
						for (int var43 = 0; var43 < arg14.field7769.length; var43++) {
							if (arg14.field7769[var43] == var39) {
								var42 = true;
								break;
							}
						}
					}
				}
				if (var21) {
					if (arg14.offhand == var39) {
						var42 = true;
					} else {
						for (int var44 = 0; var44 < arg14.field7767.length; var44++) {
							if (arg14.field7767[var44] == var39) {
								var42 = true;
								break;
							}
						}
					}
				}
				if ((var40 & 0x40000000) != 0) {
					if (!var42 && this.field7887 != null && this.field7887[var39] != null) {
						var41 = this.field7887[var39];
					}
					if (!((ObjType) arg5.list(var40 & 0x3FFFFFFF)).method14649(this.isFemale, var41)) {
						var38 = true;
					}
				} else if ((var40 & Integer.MIN_VALUE) != 0 && !((IDKType) arg3.list(var40 & 0x3FFFFFFF)).hasReadyModels()) {
					var38 = true;
				}
				var39++;
			}
		}
		Model var69 = var34.method1773((byte) 4, var16, true);
		if (!var28 && !var31) {
			return var69;
		}
		Matrix4x3[] var70 = null;
		if (var36 != null) {
			var70 = var36.method9291();
		}
		if (var31 && var70 != null) {
			for (int var71 = 0; var71 < arg11.length; var71++) {
				if (var70[var71] != null) {
					var69.method1771(var70[var71], 0x1 << var71, true);
				}
			}
		}
		int var72 = 0;
		int var73 = 1;
		while (var72 < var29) {
			if (arg10[var72] != null) {
				arg10[var72].method14360(var69, 0, var73);
			}
			var72++;
			var73 <<= 0x1;
		}
		if (var31) {
			for (int var74 = 0; var74 < arg11.length; var74++) {
				if (arg11[var74] != -1) {
					int var75 = arg11[var74] - arg12;
					int var76 = var75 & 0x3FFF;
					Matrix4x3 var77 = new Matrix4x3();
					var77.setToRotation(0.0F, 1.0F, 0.0F, Trig1.radians(var76));
					var69.method1771(var77, 0x1 << var74, false);
				}
			}
		}
		if (var31 && var70 != null) {
			for (int var78 = 0; var78 < arg11.length; var78++) {
				if (var70[var78] != null) {
					var69.method1771(var70[var78], 0x1 << var78, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			AnimationNode.method2099(var69, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method14359(var69, 0);
		} else if (arg9 != null) {
			arg9.method14359(var69, 0);
		}
		return var69;
	}

	@ObfuscatedName("xg.z(Ldh;ILaov;Laod;Laon;Lem;Lep;Laaq;B)Ldo;")
	public Model getHeadModel(Toolkit arg0, int arg1, IDKTypeList arg2, NPCTypeList arg3, ObjTypeList arg4, VariableTypeProvider arg5, VarIntDomain arg6, AnimationNode arg7) {
		if (this.field7892 != -1) {
			return ((NPCType) arg3.list(this.field7892)).getHeadModel(arg0, arg1, arg5, arg6, arg7, null);
		}
		int var9 = arg7 == null ? arg1 : arg1 | arg7.method14358();
		SoftLruHashTable var10 = field7902;
		Model var11;
		synchronized (field7902) {
			var11 = (Model) field7902.get(this.field7888);
		}
		if (var11 == null || arg0.method2394(var11.method1691(), var9) != 0) {
			if (var11 != null) {
				var9 = arg0.method2213(var9, var11.method1691());
			}
			boolean var14 = false;
			for (int var15 = 0; var15 < this.field7890.length; var15++) {
				int var16 = this.field7890[var15];
				ObjTypeCustomisation var17 = null;
				if ((var16 & 0x40000000) != 0) {
					if (this.field7887 != null && this.field7887[var15] != null) {
						var17 = this.field7887[var15];
					}
					if (!((ObjType) arg4.list(var16 & 0x3FFFFFFF)).method14651(this.isFemale, var17)) {
						var14 = true;
					}
				} else if ((var16 & Integer.MIN_VALUE) != 0 && !((IDKType) arg2.list(var16 & 0x3FFFFFFF)).hasReadyHeads()) {
					var14 = true;
				}
			}
			if (var14) {
				return null;
			}
			ModelUnlit[] var18 = new ModelUnlit[this.field7890.length];
			int var19 = 0;
			for (int var20 = 0; var20 < this.field7890.length; var20++) {
				int var21 = this.field7890[var20];
				ObjTypeCustomisation var22 = null;
				if ((var21 & 0x40000000) != 0) {
					if (this.field7887 != null && this.field7887[var20] != null) {
						var22 = this.field7887[var20];
					}
					ModelUnlit var23 = ((ObjType) arg4.list(var21 & 0x3FFFFFFF)).method14652(this.isFemale, var22);
					if (var23 != null) {
						var18[var19++] = var23;
					}
				} else if ((var21 & Integer.MIN_VALUE) != 0) {
					ModelUnlit var24 = ((IDKType) arg2.list(var21 & 0x3FFFFFFF)).getHeadModel();
					if (var24 != null) {
						var18[var19++] = var24;
					}
				}
			}
			ModelUnlit var25 = new ModelUnlit(var18, var19);
			int var26 = var9 | 0x4000;
			var11 = arg0.createModel(var25, var26, field4037, 64, 768);
			for (int var27 = 0; var27 < 10; var27++) {
				for (int var28 = 0; var28 < field7577[var27].length; var28++) {
					if (this.field7894[var27] < field1434[var27][var28].length) {
						var11.recolor(field7577[var27][var28], field1434[var27][var28][this.field7894[var27]]);
					}
				}
			}
			for (int var29 = 0; var29 < 10; var29++) {
				for (int var30 = 0; var30 < field10766[var29].length; var30++) {
					if (this.field7895[var29] < field9259[var29][var30].length) {
						var11.retexture(field10766[var29][var30], field9259[var29][var30][this.field7895[var29]]);
					}
				}
			}
			var11.method1690(var9);
			SoftLruHashTable var31 = field7902;
			synchronized (field7902) {
				field7902.put(var11, this.field7888);
			}
		}
		if (arg7 == null) {
			return var11;
		} else {
			Model var33 = var11.method1773((byte) 4, var9, true);
			arg7.method14359(var33, 0);
			return var33;
		}
	}

	@ObfuscatedName("xg.p(Ldh;ILaov;Laos;Laaq;IIIB)Ldo;")
	public Model method10130(Toolkit arg0, int arg1, IDKTypeList arg2, SeqTypeList arg3, AnimationNode arg4, int arg5, int arg6, int arg7) {
		int var9 = arg4 == null ? arg1 : arg1 | arg4.method14358();
		long var10 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		SoftLruHashTable var12 = field7902;
		Model var13;
		synchronized (field7902) {
			var13 = (Model) field7902.get(var10);
		}
		if (var13 == null || arg0.method2394(var13.method1691(), var9) != 0) {
			if (var13 != null) {
				var9 = arg0.method2213(var9, var13.method1691());
			}
			ModelUnlit[] var16 = new ModelUnlit[3];
			int var17 = 0;
			if (!((IDKType) arg2.list(arg5)).hasReadyHeads() || !((IDKType) arg2.list(arg6)).hasReadyHeads() || !((IDKType) arg2.list(arg7)).hasReadyHeads()) {
				return null;
			}
			ModelUnlit var18 = ((IDKType) arg2.list(arg5)).getHeadModel();
			if (var18 != null) {
				var16[var17++] = var18;
			}
			ModelUnlit var19 = ((IDKType) arg2.list(arg6)).getHeadModel();
			if (var19 != null) {
				var16[var17++] = var19;
			}
			ModelUnlit var20 = ((IDKType) arg2.list(arg7)).getHeadModel();
			if (var20 != null) {
				var16[var17++] = var20;
			}
			ModelUnlit var21 = new ModelUnlit(var16, var17);
			int var22 = var9 | 0x4000;
			var13 = arg0.createModel(var21, var22, field4037, 64, 768);
			for (int var23 = 0; var23 < 10; var23++) {
				for (int var24 = 0; var24 < field7577[var23].length; var24++) {
					if (this.field7894[var23] < field1434[var23][var24].length) {
						var13.recolor(field7577[var23][var24], field1434[var23][var24][this.field7894[var23]]);
					}
				}
			}
			for (int var25 = 0; var25 < 10; var25++) {
				for (int var26 = 0; var26 < field10766[var25].length; var26++) {
					if (this.field7895[var25] < field9259[var25][var26].length) {
						var13.retexture(field10766[var25][var26], field9259[var25][var26][this.field7895[var25]]);
					}
				}
			}
			var13.method1690(var9);
			SoftLruHashTable var27 = field7902;
			synchronized (field7902) {
				field7902.put(var13, var10);
			}
		}
		if (arg4 == null) {
			return var13;
		} else {
			Model var29 = var13.method1773((byte) 4, var9, true);
			arg4.method14359(var29, 0);
			return var29;
		}
	}

	@ObfuscatedName("alb.d(I)I")
	public static int method18304() {
		SoftLruHashTable var0 = field7901;
		synchronized (field7901) {
			return field7901.count();
		}
	}

	@ObfuscatedName("eg.c(IS)V")
	public static void resetModelCache(int arg0) {
		field4037 = arg0;
		SoftLruHashTable var1 = field7902;
		synchronized (field7902) {
			field7902.reset();
		}
		SoftLruHashTable var3 = field7901;
		synchronized (field7901) {
			field7901.reset();
		}
	}

	@ObfuscatedName("ada.r(I)V")
	public static void cacheReset() {
		SoftLruHashTable var0 = field7901;
		synchronized (field7901) {
			field7901.reset();
		}
		SoftLruHashTable var2 = field7902;
		synchronized (field7902) {
			field7902.reset();
		}
	}

	@ObfuscatedName("xw.v(IB)V")
	public static void cacheClean(int arg0) {
		SoftLruHashTable var1 = field7901;
		synchronized (field7901) {
			field7901.clean(arg0);
		}
		SoftLruHashTable var3 = field7902;
		synchronized (field7902) {
			field7902.clean(arg0);
		}
	}

	@ObfuscatedName("sc.o(S)V")
	public static void cacheRemoveSoftReferences() {
		SoftLruHashTable var0 = field7901;
		synchronized (field7901) {
			field7901.clear();
		}
		SoftLruHashTable var2 = field7902;
		synchronized (field7902) {
			field7902.clear();
		}
	}
}
