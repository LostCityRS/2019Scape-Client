package com.jagex;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.questtype.QuestType;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;

import java.util.Iterator;
import java.util.List;

@ObfuscatedName("o")
public class MiniMenu {

	@ObfuscatedName("o.k")
	public static int field536 = 16;

	@ObfuscatedName("o.l")
	public static boolean field562 = false;

	@ObfuscatedName("o.u")
	public static boolean field540 = false;

	@ObfuscatedName("o.z")
	public static MinimenuSubmenu field541 = null;

	@ObfuscatedName("o.r")
	public static int field545 = 0;

	@ObfuscatedName("o.q")
	public static int field546 = 0;

	@ObfuscatedName("o.x")
	public static int field543 = 0;

	@ObfuscatedName("o.b")
	public static IterableQueue field542 = new IterableQueue();

	@ObfuscatedName("o.h")
	public static IterableMap field549 = new IterableMap(16);

	@ObfuscatedName("o.a")
	public static DualIterableQueue field550 = new DualIterableQueue();

	@ObfuscatedName("o.g")
	public static IterableQueue field538 = new IterableQueue();

	@ObfuscatedName("o.i")
	public static IterableQueue field552 = new IterableQueue();

	@ObfuscatedName("o.j")
	public static WeightedCache field534 = new WeightedCache(30);

	@ObfuscatedName("o.as")
	public static Component field576 = null;

	@ObfuscatedName("o.at")
	public static int field556 = -1;

	@ObfuscatedName("o.ad")
	public static int field557 = -1;

	@ObfuscatedName("o.am")
	public static int field563 = -1;

	@ObfuscatedName("o.au")
	public static int field559 = -1;

	@ObfuscatedName("o.ar")
	public static int field560 = 0;

	@ObfuscatedName("o.ap")
	public static int field561 = 0;

	@ObfuscatedName("o.aq")
	public static Matrix4x4 field553 = null;

	@ObfuscatedName("o.ax")
	public static Matrix4x4 field555 = new Matrix4x4();

	@ObfuscatedName("o.av")
	public static Matrix4x3 field572 = new Matrix4x3();

	@ObfuscatedName("o.ao")
	public static boolean field564 = false;

	@ObfuscatedName("o.by")
	public static int field567 = 0;

	@ObfuscatedName("o.bw")
	public static int field568 = -1;

	@ObfuscatedName("o.bz")
	public static float[] field569 = new float[4];

	public MiniMenu() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aba.e(I)Z")
	public static boolean method14766() {
		return Statics.method15214(Statics.field1971.field7664);
	}

	@ObfuscatedName("rd.n(B)Z")
	public static boolean method7893() {
		return Statics.method15214(Statics.field1971.field7663);
	}

	@ObfuscatedName("ng.m(B)Z")
	public static boolean method6035() {
		return Statics.method15214(Statics.field1971.field7659);
	}

	@ObfuscatedName("gp.f(Lvt;Lakm;I)Z")
	public static boolean method3483(Binding arg0, MouseEvent arg1) {
		return arg0 != null && arg0.method9396(arg1, client.field11024, client.field10822, Statics.field11931);
	}

	@ObfuscatedName("sf.w(B)V")
	public static void method8326() {
		Statics.field8348 = new MinimenuEntry(LocalisedText.CANCEL.method15021(Statics.field1680), "", client.field10970, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@ObfuscatedName("uf.l(B)V")
	public static void method9026() {
		if (client.field10862 >= 0) {
			return;
		}
		FontMetrics var0 = method16902();
		if (!field562) {
			field540 = field568 != -1 && field546 >= field568 || (field564 ? 26 : 22) + field546 * field536 > Statics.canvasHei;
		}
		field538.method14152();
		field552.method14152();
		for (MinimenuEntry var1 = (MinimenuEntry) field542.method14191(); var1 != null; var1 = (MinimenuEntry) field542.method14161()) {
			int var2 = var1.field12307;
			if (var2 < 1000) {
				var1.method8440();
				if (var2 == 59 || var2 == 2 || var2 == 8 || var2 == 17 || var2 == 15 || var2 == 16 || var2 == 58) {
					field552.method14153(var1);
				} else {
					field538.method14153(var1);
				}
			}
		}
		field538.method14207(field542);
		field552.method14207(field542);
		if (field546 > 1) {
			if (method7893() && field546 > 2) {
				Statics.field11913 = (MinimenuEntry) field542.field8482.field6762.field6762;
			} else {
				Statics.field11913 = (MinimenuEntry) field542.field8482.field6762;
			}
			Statics.field7100 = (MinimenuEntry) field542.field8482.field6762;
			if (field546 > 2) {
				Statics.field1846 = (MinimenuEntry) Statics.field7100.field6762;
			} else {
				Statics.field1846 = null;
			}
		} else {
			Statics.field11913 = null;
			Statics.field7100 = null;
			Statics.field1846 = null;
		}
		MouseEvent var3 = (MouseEvent) client.field10816.method14191();
		int var4;
		int var5;
		if (var3 == null) {
			var4 = Statics.field9182.method9086();
			var5 = Statics.field9182.method9092();
		} else {
			var4 = var3.method17831();
			var5 = var3.method17832();
		}
		if (!field562) {
			boolean var36 = method3483(Statics.field1971.field7667, var3);
			boolean var37 = method3483(Statics.field1971.field7660, var3);
			boolean var38 = method3483(Statics.field1971.field7666, var3);
			if ((var36 || var37) && (client.field10968 == 1 && field546 > 2 || method6848())) {
				var38 = true;
			}
			if (var38 && field546 > 0) {
				if (client.field10989 == null && client.field11003 == 0) {
					method14926(var4, var5);
				} else {
					field545 = 2;
				}
			} else if (var37) {
				if (Statics.field1846 != null) {
					method923(Statics.field1846, var4, var5, false);
				}
			} else if (var36) {
				if (Statics.field11913 != null) {
					boolean var39 = client.field10989 != null || client.field11003 > 0;
					if (var39) {
						field545 = 1;
						Statics.field1280 = Statics.field11913;
					} else {
						method923(Statics.field11913, var4, var5, false);
					}
				} else if (client.field10973) {
					client.method9403();
				}
			}
			if (client.field10989 == null && client.field11003 == 0) {
				field545 = 0;
				Statics.field1280 = null;
			}
		} else if (!method3483(Statics.field1971.field7662, var3)) {
			boolean var27 = false;
			if (field541 != null) {
				if (var4 >= Statics.field1981 - 10 && var4 <= Statics.field554 + Statics.field1981 + 10 && var5 >= Statics.field2433 - 10 && var5 <= Statics.field3005 + Statics.field2433 + 10) {
					var27 = true;
				} else {
					method1594();
				}
			}
			if (!var27) {
				if (var4 < Statics.field11738 - 10 || var4 > Statics.field1289 + Statics.field11738 + 10 || var5 < Statics.field2960 - 10 || var5 > Statics.field2960 + Statics.field2576 + 10) {
					method6031();
				} else if (field540) {
					int var28 = -1;
					int var29 = -1;
					for (int var30 = 0; var30 < field543; var30++) {
						if (field564) {
							int var31 = field536 * var30 + var0.field8562 + Statics.field2960 + 20 + 1;
							if (var5 > var31 - var0.field8562 - 1 && var5 < var0.field8569 + var31) {
								var28 = var30;
								var29 = var31 - var0.field8562 - 1;
								break;
							}
						} else {
							int var32 = field536 * var30 + Statics.field2960 + 31;
							if (var5 > var32 - 13 && var5 < var32 + 3) {
								var28 = var30;
								var29 = var32 - 13;
								break;
							}
						}
					}
					if (var28 != -1) {
						int var33 = 0;
						DualIterableQueueIterator var34 = new DualIterableQueueIterator(field550);
						for (MinimenuSubmenu var35 = (MinimenuSubmenu) var34.method14301(); var35 != null; var35 = (MinimenuSubmenu) var34.next()) {
							if (var28 == var33) {
								if (var35.field12310 > 1) {
									method4629(var35, var29);
								}
								break;
							}
							var33++;
						}
					}
				}
			}
		} else if (field541 != null && var4 >= Statics.field1981 && var4 <= Statics.field554 + Statics.field1981 && var5 >= Statics.field2433 && var5 <= Statics.field3005 + Statics.field2433) {
			int var6 = -1;
			for (int var7 = 0; var7 < field541.field12310; var7++) {
				if (field564) {
					int var8 = field536 * var7 + var0.field8562 + Statics.field2433 + 20 + 1;
					if (var5 > var8 - var0.field8562 - 1 && var5 < var0.field8569 + var8) {
						var6 = var7;
					}
				} else {
					int var9 = field536 * var7 + Statics.field2433 + 31;
					if (var5 > var9 - 13 && var5 < var9 + 3) {
						var6 = var7;
					}
				}
			}
			if (var6 != -1) {
				int var10 = 0;
				DualIterableQueueIterator var11 = new DualIterableQueueIterator(field541.field12312);
				for (MinimenuEntry var12 = (MinimenuEntry) var11.method14301(); var12 != null; var12 = (MinimenuEntry) var11.next()) {
					if (var6 == var10) {
						method923(var12, var4, var5, true);
						break;
					}
					var10++;
				}
			}
			method6031();
		} else if (var4 >= Statics.field11738 && var4 <= Statics.field1289 + Statics.field11738 && var5 >= Statics.field2960 && var5 <= Statics.field2960 + Statics.field2576) {
			if (field540) {
				int var20 = -1;
				for (int var21 = 0; var21 < field543; var21++) {
					if (field564) {
						int var22 = field536 * var21 + var0.field8562 + Statics.field2960 + 20 + 1;
						if (var5 > var22 - var0.field8562 - 1 && var5 < var0.field8569 + var22) {
							var20 = var21;
							break;
						}
					} else {
						int var23 = field536 * var21 + Statics.field2960 + 31;
						if (var5 > var23 - 13 && var5 < var23 + 3) {
							var20 = var21;
							break;
						}
					}
				}
				if (var20 != -1) {
					int var24 = 0;
					DualIterableQueueIterator var25 = new DualIterableQueueIterator(field550);
					for (MinimenuSubmenu var26 = (MinimenuSubmenu) var25.method14301(); var26 != null; var26 = (MinimenuSubmenu) var25.next()) {
						if (var20 == var24) {
							method923((MinimenuEntry) var26.field12312.field8497.field11439, var4, var5, true);
							method6031();
							break;
						}
						var24++;
					}
				}
			} else {
				int var13 = -1;
				for (int var14 = 0; var14 < field546; var14++) {
					if (field564) {
						int var15 = field536 * (field546 - 1 - var14) + var0.field8562 + Statics.field2960 + 20 + 1;
						if (var5 > var15 - var0.field8562 - 1 && var5 < var0.field8569 + var15) {
							var13 = var14;
						}
					} else {
						int var16 = field536 * (field546 - 1 - var14) + Statics.field2960 + 31;
						if (var5 > var16 - 13 && var5 < var16 + 3) {
							var13 = var14;
						}
					}
				}
				if (var13 != -1) {
					int var17 = 0;
					IterableQueueIterator var18 = new IterableQueueIterator(field542);
					for (MinimenuEntry var19 = (MinimenuEntry) var18.method14294(); var19 != null; var19 = (MinimenuEntry) var18.next()) {
						if (var13 == var17) {
							method923(var19, var4, var5, true);
							break;
						}
						var17++;
					}
				}
				method6031();
			}
		}
	}

	@ObfuscatedName("ps.z(B)Z")
	public static boolean method6848() {
		if (Statics.field7100 == null) {
			return false;
		} else {
			if (Statics.field7100.field12307 >= 2000) {
				Statics.field7100.field12307 -= 2000;
			}
			return Statics.field7100.field12307 == 1007;
		}
	}

	@ObfuscatedName("abd.p(IIS)V")
	public static void method14926(int arg0, int arg1) {
		if (!Statics.field11389.field7727) {
			if (field546 == 1) {
				return;
			}
			if (Statics.field7446 && field546 == 2 && Statics.field7100.field12297.equals(LocalisedText.FACEHERE.method15021(Statics.field1680))) {
				return;
			}
		}
		FontMetrics var2 = method16902();
		int var3 = var2.method14532(LocalisedText.CHOOSEOPTION.method15021(Statics.field1680));
		int var6;
		if (field540) {
			for (MinimenuSubmenu var7 = (MinimenuSubmenu) field550.method14317(); var7 != null; var7 = (MinimenuSubmenu) field550.method14324()) {
				int var8;
				if (var7.field12310 == 1) {
					var8 = method4610((MinimenuEntry) var7.field12312.field8497.field11439, var2);
				} else {
					var8 = method16910(var7, var2);
				}
				if (var8 > var3) {
					var3 = var8;
				}
			}
			var3 += 8;
			var6 = field543 * field536 + 21;
			Statics.field2576 = (field564 ? 26 : 22) + field543 * field536;
		} else {
			for (MinimenuEntry var4 = (MinimenuEntry) field542.method14191(); var4 != null; var4 = (MinimenuEntry) field542.method14161()) {
				int var5 = method4610(var4, var2);
				if (var5 > var3) {
					var3 = var5;
				}
			}
			var3 += 8;
			var6 = field546 * field536 + 21;
			Statics.field2576 = field546 * field536 + (field564 ? 26 : 22);
		}
		var3 += 10;
		int var9 = arg0 - var3 / 2;
		if (var3 + var9 > Statics.canvasWid) {
			var9 = Statics.canvasWid - var3;
		}
		if (var9 < 0) {
			var9 = 0;
		}
		int var10 = arg1;
		if (var6 + arg1 > Statics.canvasHei) {
			var10 = Statics.canvasHei - var6;
		}
		if (var10 < 0) {
			var10 = 0;
		}
		Statics.field11738 = var9;
		Statics.field2960 = var10;
		Statics.field1289 = var3;
		field567 = (int) (Math.random() * 24.0D);
		field562 = true;
	}

	@ObfuscatedName("im.d(Larn;IB)V")
	public static void method4629(MinimenuSubmenu arg0, int arg1) {
		if (!field562) {
			return;
		}
		FontMetrics var2 = method16902();
		int var3 = 0;
		for (MinimenuEntry var4 = (MinimenuEntry) arg0.field12312.method14317(); var4 != null; var4 = (MinimenuEntry) arg0.field12312.method14324()) {
			int var5 = method4610(var4, var2);
			if (var5 > var3) {
				var3 = var5;
			}
		}
		var3 += 8;
		int var6 = field536 * arg0.field12310 + 21;
		Statics.field3005 = field536 * arg0.field12310 + (field564 ? 26 : 22);
		int var7 = Statics.field1289 + Statics.field11738;
		if (var3 + var7 > Statics.canvasWid) {
			var7 = Statics.field11738 - var3;
		}
		if (var7 < 0) {
			var7 = 0;
		}
		int var8 = field564 ? var2.field8562 + 20 + 1 : 31;
		int var9 = var2.field8562 + (arg1 - var8) + 1;
		if (var6 + var9 > Statics.canvasHei) {
			var9 = Statics.canvasHei - var6;
		}
		if (var9 < 0) {
			var9 = 0;
		}
		Statics.field1981 = var7;
		Statics.field2433 = var9;
		Statics.field554 = var3;
		field541 = arg0;
	}

	@ObfuscatedName("aih.c(B)Laac;")
	public static FontMetrics method16902() {
		FontMetrics var0;
		if (!field564) {
			var0 = Statics.field10268;
		} else if (Statics.field1841 == null || Statics.field8786 == null) {
			var0 = Statics.field10268;
		} else {
			var0 = Statics.field8786;
		}
		field536 = var0.field8569 + var0.field8562;
		return var0;
	}

	@ObfuscatedName("ng.r(I)V")
	public static void method6031() {
		method1594();
		field562 = false;
		client.method3066(Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576);
		Statics.field11913 = null;
		Statics.field1846 = null;
	}

	@ObfuscatedName("cz.v(I)V")
	public static void method1594() {
		if (field541 != null) {
			field541 = null;
			client.method3066(Statics.field1981, Statics.field2433, Statics.field554, Statics.field3005);
		}
	}

	@ObfuscatedName("fz.o(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZB)V")
	public static void method3042(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
		if (!field562 && field546 < 505) {
			int var14 = arg2 == -1 ? client.field10970 : arg2;
			MinimenuEntry var15 = new MinimenuEntry(arg0, arg1, var14, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			method2771(var15);
		}
	}

	@ObfuscatedName("ej.s(Larm;B)V")
	public static void method2771(MinimenuEntry arg0) {
		if (arg0 == null) {
			return;
		}
		field542.method14153(arg0);
		field546++;
		Object var1 = null;
		MinimenuSubmenu var4;
		if (arg0.field12306 || "".equals(arg0.field12301)) {
			var4 = new MinimenuSubmenu(arg0.field12301);
			field543++;
		} else {
			long var2 = arg0.field12305;
			for (var4 = (MinimenuSubmenu) field549.method14495(var2); var4 != null && !var4.field12311.equals(arg0.field12301); var4 = (MinimenuSubmenu) field549.method14496()) {
			}
			if (var4 == null) {
				var4 = (MinimenuSubmenu) field534.method2930(var2);
				if (var4 != null && !var4.field12311.equals(arg0.field12301)) {
					var4 = null;
				}
				if (var4 == null) {
					var4 = new MinimenuSubmenu(arg0.field12301);
				}
				field549.method14501(var4, var2);
				field543++;
			}
		}
		if (var4.method19373(arg0)) {
			method5924(var4);
		}
	}

	@ObfuscatedName("mj.y(Larn;I)V")
	public static void method5924(MinimenuSubmenu arg0) {
		boolean var1 = false;
		arg0.method17806();
		for (MinimenuSubmenu var2 = (MinimenuSubmenu) field550.method14317(); var2 != null; var2 = (MinimenuSubmenu) field550.method14324()) {
			if (method18853(arg0.method19375(), var2.method19375())) {
				DualIterableQueue.method10144(arg0, var2);
				var1 = true;
				break;
			}
		}
		if (!var1) {
			field550.method14339(arg0);
		}
	}

	@ObfuscatedName("ew.x(Lahm;B)V")
	public static void method2897(PathingEntity arg0) {
		if (arg0 instanceof NpcEntity) {
			NpcEntity var1 = (NpcEntity) arg0;
			if (var1.field12083 != null) {
				method10152(var1, Statics.field4490.field11717 != var1.field11717);
			}
		} else if (arg0 instanceof PlayerEntity) {
			PlayerEntity var2 = (PlayerEntity) arg0;
			method3542(var2, Statics.field4490.field11717 != var2.field11717);
		}
	}

	@ObfuscatedName("nt.b(Ldh;I)V")
	public static void method6036(Renderer arg0) {
		if (field553 != null) {
			arg0.method2220(field553);
			arg0.method2217(field572);
			arg0.method2168(field563, field559, field563 + field560, field561 + field559);
			arg0.method2164(field563, field559, field560, field561);
		}
	}

	@ObfuscatedName("ja.h(Ldh;IIB)V")
	public static void method5015(Renderer arg0, int arg1, int arg2) {
		if (arg1 < 0 || arg2 < 0 || field553 == null) {
			return;
		}
		CoordGrid var3 = client.world.method7727();
		Matrix4x4 var4 = arg0.method2208();
		method6036(arg0);
		var4.method6609(field572);
		var4.method6720(field553);
		var4.method6611();
		int var5 = arg1 - field563;
		int var6 = arg2 - field559;
		if (client.world.method7743() == null) {
			return;
		}
		if (!client.field10973 || (Statics.field1765 & 0x40) != 0) {
			int var7 = -1;
			int var8 = -1;
			float var9 = (float) var5 * 2.0F / (float) field560 - 1.0F;
			float var10 = (float) var6 * 2.0F / (float) field561 - 1.0F;
			var4.method6614(var9, var10, -1.0F, field569);
			float var11 = field569[0] / field569[3];
			float var12 = field569[1] / field569[3];
			float var13 = field569[2] / field569[3];
			var4.method6614(var9, var10, 1.0F, field569);
			float var14 = field569[0] / field569[3];
			float var15 = field569[1] / field569[3];
			float var16 = field569[2] / field569[3];
			float var17 = method7009(var11, var12, var13, var14, var15, var16, 4);
			if (var17 > 0.0F) {
				float var18 = var14 - var11;
				float var19 = var16 - var13;
				int var20 = (int) (var17 * var18 + var11);
				int var21 = (int) (var17 * var19 + var13);
				var7 = var20 + (Statics.field4490.method16546() - 1 << 8) >> 9;
				var8 = var21 + (Statics.field4490.method16546() - 1 << 8) >> 9;
				byte var22 = Statics.field4490.field11717;
				if (var22 < 3 && (client.world.method7793().field4487[1][var20 >> 9][var21 >> 9] & 0x2) != 0) {
					int var91 = var22 + 1;
				}
			}
			if (var7 != -1 && var8 != -1) {
				if (client.field10973 && (Statics.field1765 & 0x40) != 0) {
					Component var23 = Component.method16682(Statics.field6707, client.field10974);
					if (var23 == null) {
						client.method9403();
					} else {
						method3042(client.field11039, " " + TextUtil.ARROW + " ", Statics.field1844, 59, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
					}
				} else {
					if (Statics.field7446) {
						method3042(LocalisedText.FACEHERE.method15021(Statics.field1680), "", -1, 60, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
					}
					method3042(Statics.field4868, "", client.field10963, 23, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
				}
			}
		}
		PickableEntityList var24 = client.world.method7743().field6959;
		int var25 = arg1;
		int var26 = arg2;
		List var27 = var24.field6885;
		Iterator var28 = var27.iterator();
		while (true) {
			int var32;
			int var33;
			Location var83;
			LocType var84;
			String[] var86;
			do {
				PickableEntity var29;
				do {
					do {
						do {
							while (true) {
								while (true) {
									do {
										do {
											if (!var28.hasNext()) {
												return;
											}
											var29 = (PickableEntity) var28.next();
										} while (!client.field10809 && Statics.field4490.field11717 != var29.field6978.field11717);
									} while (!var29.method8889(arg0, var25, var26));
									boolean var30 = false;
									boolean var31 = false;
									if (var29.field6978 instanceof PrimaryLayerEntity) {
										var32 = ((PrimaryLayerEntity) var29.field6978).field12471;
										var33 = ((PrimaryLayerEntity) var29.field6978).field12468;
									} else {
										Vector3 var34 = var29.field6978.method10536().field4298;
										var32 = (int) var34.field4308 >> 9;
										var33 = (int) var34.field4313 >> 9;
									}
									if (!(var29.field6978 instanceof PlayerEntity)) {
										break;
									}
									PlayerEntity var35 = (PlayerEntity) var29.field6978;
									int var36 = var35.method16546();
									Vector3 var37 = var35.method10536().field4298;
									if ((var36 & 0x1) == 0 && ((int) var37.field4308 & 0x1FF) == 0 && ((int) var37.field4313 & 0x1FF) == 0 || (var36 & 0x1) == 1 && ((int) var37.field4308 & 0x1FF) == 256 && ((int) var37.field4313 & 0x1FF) == 256) {
										int var38 = (int) var37.field4308 - (var35.method16546() - 1 << 8);
										int var39 = (int) var37.field4313 - (var35.method16546() - 1 << 8);
										for (int var40 = 0; var40 < client.field11011; var40++) {
											ObjectWrapper var41 = (ObjectWrapper) client.field10838.method14495((long) client.field11036[var40]);
											if (var41 != null) {
												NpcEntity var42 = (NpcEntity) var41.field11436;
												if (var42.field10403 != client.field10903 && var42.field10452) {
													Vector3 var43 = var42.method10536().field4298;
													int var44 = (int) var43.field4308 - (var42.field12083.field2699 - 1 << 8);
													int var45 = (int) var43.field4313 - (var42.field12083.field2699 - 1 << 8);
													if (var44 >= var38 && var42.field12083.field2699 <= var35.method16546() - (var44 - var38 >> 9) && var45 >= var39 && var42.field12083.field2699 <= var35.method16546() - (var45 - var39 >> 9)) {
														method10152(var42, Statics.field4490.field11717 != var29.field6978.field11717);
														var42.field10403 = client.field10903;
													}
												}
											}
										}
										int var46 = ReceivePlayerPositions.field698;
										int[] var47 = ReceivePlayerPositions.field703;
										for (int var48 = 0; var48 < var46; var48++) {
											PlayerEntity var49 = client.field10944[var47[var48]];
											if (var49 != null && var49.field10403 != client.field10903 && var35 != var49 && var49.field10452) {
												Vector3 var50 = var49.method10536().field4298;
												int var51 = (int) var50.field4308 - (var49.method16546() - 1 << 8);
												int var52 = (int) var50.field4313 - (var49.method16546() - 1 << 8);
												if (var51 >= var38 && var49.method16546() <= var35.method16546() - (var51 - var38 >> 9) && var52 >= var39 && var49.method16546() <= var35.method16546() - (var52 - var39 >> 9)) {
													method3542(var49, Statics.field4490.field11717 != var29.field6978.field11717);
													var49.field10403 = client.field10903;
												}
											}
										}
									}
									if (var35.field10403 != client.field10903) {
										method3542(var35, Statics.field4490.field11717 != var29.field6978.field11717);
										var35.field10403 = client.field10903;
										break;
									}
								}
								if (!(var29.field6978 instanceof NpcEntity)) {
									break;
								}
								NpcEntity var53 = (NpcEntity) var29.field6978;
								if (var53.field12083 == null) {
									break;
								}
								Vector3 var54 = var53.method10536().field4298;
								if ((var53.field12083.field2699 & 0x1) == 0 && ((int) var54.field4308 & 0x1FF) == 0 && ((int) var54.field4313 & 0x1FF) == 0 || (var53.field12083.field2699 & 0x1) == 1 && ((int) var54.field4308 & 0x1FF) == 256 && ((int) var54.field4313 & 0x1FF) == 256) {
									int var55 = (int) var54.field4308 - (var53.field12083.field2699 - 1 << 8);
									int var56 = (int) var54.field4313 - (var53.field12083.field2699 - 1 << 8);
									for (int var57 = 0; var57 < client.field11011; var57++) {
										ObjectWrapper var58 = (ObjectWrapper) client.field10838.method14495((long) client.field11036[var57]);
										if (var58 != null) {
											NpcEntity var59 = (NpcEntity) var58.field11436;
											if (var59.field10403 != client.field10903 && var53 != var59 && var59.field10452) {
												Vector3 var60 = var59.method10536().field4298;
												int var61 = (int) var60.field4308 - (var59.field12083.field2699 - 1 << 8);
												int var62 = (int) var60.field4313 - (var59.field12083.field2699 - 1 << 8);
												if (var61 >= var55 && var59.field12083.field2699 <= var53.field12083.field2699 - (var61 - var55 >> 9) && var62 >= var56 && var59.field12083.field2699 <= var53.field12083.field2699 - (var62 - var56 >> 9)) {
													method10152(var59, Statics.field4490.field11717 != var29.field6978.field11717);
													var59.field10403 = client.field10903;
												}
											}
										}
									}
									int var63 = ReceivePlayerPositions.field698;
									int[] var64 = ReceivePlayerPositions.field703;
									for (int var65 = 0; var65 < var63; var65++) {
										PlayerEntity var66 = client.field10944[var64[var65]];
										if (var66 != null && var66.field10403 != client.field10903 && var66.field10452) {
											Vector3 var67 = var66.method10536().field4298;
											int var68 = (int) var67.field4308 - (var66.method16546() - 1 << 8);
											int var69 = (int) var67.field4313 - (var66.method16546() - 1 << 8);
											if (var68 >= var55 && var66.method16546() <= var53.field12083.field2699 - (var68 - var55 >> 9) && var69 >= var56 && var66.method16546() <= var53.field12083.field2699 - (var69 - var56 >> 9)) {
												method3542(var66, Statics.field4490.field11717 != var29.field6978.field11717);
												var66.field10403 = client.field10903;
											}
										}
									}
								}
								if (var53.field10403 != client.field10903) {
									method10152(var53, Statics.field4490.field11717 != var29.field6978.field11717);
									var53.field10403 = client.field10903;
									break;
								}
							}
							if (var29.field6978 instanceof ObjStackEntity) {
								int var70 = var3.field7426 + var32;
								int var71 = var3.field7427 + var33;
								ObjList var72 = (ObjList) client.field10964.method14495((long) (var29.field6978.field11717 << 28 | var71 << 14 | var70));
								if (var72 != null) {
									int var73 = 0;
									Obj var74 = (Obj) var72.field11263.method14159();
									while (var74 != null) {
										ObjType var75 = (ObjType) Statics.field1842.get(var74.field11261);
										int var76;
										if (var75.field8680) {
											var76 = var75.field8696;
										} else if (var75.field8684) {
											var76 = Statics.field1971.field7665;
										} else {
											var76 = Statics.field1971.field7661;
										}
										if (client.field10973 && Statics.field4490.field11717 == var29.field6978.field11717) {
											ParamType var77 = (ParamType) (Statics.field7677 == -1 ? null : Statics.field3086.get(Statics.field7677));
											if ((Statics.field1765 & 0x1) != 0 && (var77 == null || var75.method14677(Statics.field7677, var77.field9172) != var77.field9172)) {
												method3042(client.field11039, client.field10977 + " " + TextUtil.ARROW + " " + Statics.method596(var76) + var75.field8630, Statics.field1844, 17, -1, (long) var74.field11261, var32, var33, true, false, (long) var73, false);
											}
										}
										if (Statics.field4490.field11717 == var29.field6978.field11717) {
											String[] var78 = var75.field8647;
											for (int var79 = var78.length - 1; var79 >= 0; var79--) {
												if (var78[var79] != null) {
													short var80 = 0;
													int var81 = client.field10971;
													if (var79 == 0) {
														var80 = 18;
													}
													if (var79 == 1) {
														var80 = 19;
													}
													if (var79 == 2) {
														var80 = 20;
													}
													if (var79 == 3) {
														var80 = 21;
													}
													if (var79 == 4) {
														var80 = 22;
													}
													if (var79 == 5) {
														var80 = 1004;
													}
													int var82 = var75.method14642(var79);
													if (var82 != -1) {
														var81 = var82;
													}
													method3042(var78[var79], Statics.method596(var76) + var75.field8630, var81, var80, -1, (long) var74.field11261, var32, var33, true, false, (long) var73, false);
												}
											}
										}
										var74 = (Obj) var72.field11263.method14170();
										var73++;
									}
								}
							}
						} while (!(var29.field6978 instanceof Location));
						var83 = (Location) var29.field6978;
						var84 = (LocType) client.world.method7750().get(var83.method8223());
						if (var84.field7505 != null) {
							var84 = var84.method9477(Statics.field7410, Statics.field7410);
						}
					} while (var84 == null);
					if (client.field10973 && Statics.field4490.field11717 == var29.field6978.field11717) {
						ParamType var85 = (ParamType) (Statics.field7677 == -1 ? null : Statics.field3086.get(Statics.field7677));
						if ((Statics.field1765 & 0x4) != 0 && (var85 == null || var84.method9481(Statics.field7677, var85.field9172) != var85.field9172)) {
							method3042(client.field11039, client.field10977 + " " + TextUtil.ARROW + " " + Statics.method596(65535) + var84.field7517, Statics.field1844, 2, -1, method6964(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
						}
					}
				} while (Statics.field4490.field11717 != var29.field6978.field11717);
				var86 = var84.field7483;
			} while (var86 == null);
			for (int var87 = var86.length - 1; var87 >= 0; var87--) {
				if (var86[var87] != null) {
					short var88 = 0;
					int var89 = client.field10971;
					if (var87 == 0) {
						var88 = 3;
					}
					if (var87 == 1) {
						var88 = 4;
					}
					if (var87 == 2) {
						var88 = 5;
					}
					if (var87 == 3) {
						var88 = 6;
					}
					if (var87 == 4) {
						var88 = 1001;
					}
					if (var87 == 5) {
						var88 = 1002;
					}
					int var90 = var84.method9486(var87);
					if (var90 != -1) {
						var89 = var90;
					}
					method3042(var86[var87], Statics.method596(65535) + var84.field7517, var89, var88, -1, method6964(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
				}
			}
		}
	}

	@ObfuscatedName("py.a(Lst;III)J")
	public static long method6964(Location arg0, int arg1, int arg2) {
		long var3 = 4194304L;
		long var5 = Long.MIN_VALUE;
		LocType var7 = (LocType) client.world.method7750().get(arg0.method8223());
		long var8 = (long) (arg1 | arg2 << 7 | arg0.method8220() << 14 | arg0.method8204() << 20 | 0x40000000);
		if (var7.field7470 == 0) {
			var8 |= var5;
		}
		if (var7.field7503 == 1) {
			var8 |= var3;
		}
		return var8 | (long) arg0.method8223() << 32;
	}

	@ObfuscatedName("wb.g(Larm;I)V")
	public static void method9773(MinimenuEntry arg0) {
		if (field562) {
			return;
		}
		arg0.method8440();
		field546--;
		if (!arg0.field12306) {
			long var1 = arg0.field12305;
			MinimenuSubmenu var3;
			for (var3 = (MinimenuSubmenu) field549.method14495(var1); var3 != null && !var3.field12311.equals(arg0.field12301); var3 = (MinimenuSubmenu) field549.method14496()) {
			}
			if (var3 != null && var3.method19374(arg0)) {
				method5924(var3);
			}
			return;
		}
		for (MinimenuSubmenu var4 = (MinimenuSubmenu) field550.method14317(); var4 != null; var4 = (MinimenuSubmenu) field550.method14324()) {
			if (var4.field12311.equals(arg0.field12301)) {
				boolean var5 = false;
				for (MinimenuEntry var6 = (MinimenuEntry) var4.field12312.method14317(); var6 != null; var6 = (MinimenuEntry) var4.field12312.method14324()) {
					if (arg0 == var6) {
						if (var4.method19374(arg0)) {
							method5924(var4);
						}
						var5 = true;
						break;
					}
				}
				if (var5) {
					break;
				}
			}
		}
	}

	@ObfuscatedName("acz.i(IB)V")
	public static void method15023(int arg0) {
		for (MinimenuEntry var1 = (MinimenuEntry) field542.method14191(); var1 != null; var1 = (MinimenuEntry) field542.method14161()) {
			if (Statics.method13985(var1.field12307) && var1.field12302 >> 16 == arg0) {
				method9773(var1);
			}
		}
	}

	@ObfuscatedName("tb.j(IB)Z")
	public static boolean method8494(int arg0) {
		for (MinimenuEntry var1 = (MinimenuEntry) field542.method14191(); var1 != null; var1 = (MinimenuEntry) field542.method14161()) {
			if (method16450(var1.field12307) && var1.field12300 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("qm.ae(Ldh;I)V")
	public static void method7316(Renderer arg0) {
		if (field562) {
			method5200(arg0);
		} else {
			method9594(arg0);
		}
	}

	@ObfuscatedName("fi.ag(B)V")
	public static void method3074() {
		for (MinimenuSubmenu var0 = (MinimenuSubmenu) field550.method14317(); var0 != null; var0 = (MinimenuSubmenu) field550.method14324()) {
			if (var0.field12310 > 1) {
				var0.field12310 = 0;
				field534.method2921(var0, ((MinimenuEntry) var0.field12312.field8497.field11439).field12305);
				var0.field12312.method14316();
			}
		}
		field543 = 0;
		field546 = 0;
		field542.method14152();
		field549.method14499();
		field550.method14316();
		method2771(Statics.field8348);
	}

	@ObfuscatedName("ki.ah(B)V")
	public static void method5175() {
		for (MinimenuSubmenu var0 = (MinimenuSubmenu) field550.method14317(); var0 != null; var0 = (MinimenuSubmenu) field550.method14324()) {
			if (var0.field12310 > 1) {
				var0.field12310 = 0;
				field534.method2921(var0, ((MinimenuEntry) var0.field12312.field8497.field11439).field12305);
				var0.field12312.method14316();
			}
		}
		field543 = 0;
		field546 = 0;
		field542.method14152();
		field549.method14499();
		field550.method14316();
		field562 = false;
	}

	@ObfuscatedName("rk.al(I)V")
	public static void method7617() {
		Statics.field8480 = null;
		Statics.field3568 = null;
		Statics.field9253 = null;
		Statics.field10568 = null;
		Statics.field566 = null;
		Statics.field1224 = null;
		Statics.field11699 = null;
		Statics.field11831 = null;
		Statics.field1841 = null;
		Statics.field8786 = null;
	}

	@ObfuscatedName("ku.ac(B)V")
	public static void method5147() {
		method7617();
	}

	@ObfuscatedName("py.ai(IIB)V")
	public static void method6967(int arg0, int arg1) {
		field563 = arg0;
		field559 = arg1;
	}

	@ObfuscatedName("aoq.aw(Lhf;IIB)V")
	public static void method18919(Component arg0, int arg1, int arg2) {
		field576 = arg0;
		field556 = arg1;
		field557 = arg2;
	}

	@ObfuscatedName("ap.as(I)I")
	public static int method895() {
		if (client.field10989 == null) {
			if (field562) {
				FontMetrics var0 = method16902();
				int var1 = Statics.field9182.method9086();
				int var2 = Statics.field9182.method9092();
				if (field540) {
					if (var1 > Statics.field11738 && var1 < Statics.field1289 + Statics.field11738) {
						int var10 = -1;
						for (int var11 = 0; var11 < field543; var11++) {
							if (field564) {
								int var12 = field536 * var11 + var0.field8562 + Statics.field2960 + 20 + 1;
								if (var2 > var12 - var0.field8562 - 1 && var2 < var0.field8569 + var12) {
									var10 = var11;
								}
							} else {
								int var13 = field536 * var11 + Statics.field2960 + 31;
								if (var2 > var13 - var0.field8562 - 1 && var2 < var0.field8569 + var13) {
									var10 = var11;
								}
							}
						}
						if (var10 != -1) {
							int var14 = 0;
							DualIterableQueueIterator var15 = new DualIterableQueueIterator(field550);
							for (MinimenuSubmenu var16 = (MinimenuSubmenu) var15.method14301(); var16 != null; var16 = (MinimenuSubmenu) var15.next()) {
								if (var14++ == var10) {
									return ((MinimenuEntry) var16.field12312.field8497.field11439).field12298;
								}
							}
						}
					} else if (field541 != null && var1 > Statics.field1981 && var1 < Statics.field554 + Statics.field1981) {
						int var17 = -1;
						for (int var18 = 0; var18 < field541.field12310; var18++) {
							if (field564) {
								int var19 = field536 * var18 + var0.field8562 + Statics.field2433 + 20 + 1;
								if (var2 > var19 - var0.field8562 - 1 && var2 < var0.field8569 + var19) {
									var17 = var18;
								}
							} else {
								int var20 = field536 * var18 + Statics.field2433 + 31;
								if (var2 > var20 - var0.field8562 - 1 && var2 < var0.field8569 + var20) {
									var17 = var18;
								}
							}
						}
						if (var17 != -1) {
							int var21 = 0;
							DualIterableQueueIterator var22 = new DualIterableQueueIterator(field541.field12312);
							for (MinimenuEntry var23 = (MinimenuEntry) var22.method14301(); var23 != null; var23 = (MinimenuEntry) var22.next()) {
								if (var21++ == var17) {
									return var23.field12298;
								}
							}
						}
					}
				} else if (var1 > Statics.field11738 && var1 < Statics.field1289 + Statics.field11738) {
					int var3 = -1;
					for (int var4 = 0; var4 < field546; var4++) {
						if (field564) {
							int var5 = field536 * (field546 - 1 - var4) + var0.field8562 + Statics.field2960 + 20 + 1;
							if (var2 > var5 - var0.field8562 - 1 && var2 < var0.field8569 + var5) {
								var3 = var4;
							}
						} else {
							int var6 = field536 * (field546 - 1 - var4) + Statics.field2960 + 31;
							if (var2 > var6 - var0.field8562 - 1 && var2 < var0.field8569 + var6) {
								var3 = var4;
							}
						}
					}
					if (var3 != -1) {
						int var7 = 0;
						IterableQueueIterator var8 = new IterableQueueIterator(field542);
						for (MinimenuEntry var9 = (MinimenuEntry) var8.method14294(); var9 != null; var9 = (MinimenuEntry) var8.next()) {
							if (var7++ == var3) {
								return var9.field12298;
							}
						}
					}
				}
			} else if (Statics.field1971.field7668) {
				if (Statics.field1846 != null) {
					return Statics.field1846.field12298;
				}
			} else if (Statics.field11913 != null) {
				return Statics.field11913.field12298;
			}
		}
		return -1;
	}

	@ObfuscatedName("ax.at(IIB)Z")
	public static boolean method961(int arg0, int arg1) {
		if (!field562) {
			return false;
		}
		int var2 = arg0 >> 16;
		int var3 = arg0 & 0xFFFF;
		if (Statics.field11725[var2] == null || Statics.field11725[var2].field2151[var3] == null) {
			return false;
		}
		Component var4 = Statics.field11725[var2].field2151[var3];
		if (arg1 == -1 && var4.field2184 == 0) {
			for (MinimenuEntry var5 = (MinimenuEntry) field542.method14191(); var5 != null; var5 = (MinimenuEntry) field542.method14161()) {
				if (var5.field12307 == 58 || var5.field12307 == 1007 || var5.field12307 == 25 || var5.field12307 == 57 || var5.field12307 == 30) {
					for (Component var6 = Component.method10202(var5.field12302); var6 != null; var6 = client.method6000(Statics.field11725[var6.field2158 >> 16], var6)) {
						if (var4.field2158 == var6.field2158) {
							return true;
						}
					}
				}
			}
		} else {
			for (MinimenuEntry var7 = (MinimenuEntry) field542.method14191(); var7 != null; var7 = (MinimenuEntry) field542.method14161()) {
				if (var7.field12304 == arg1 && var4.field2158 == var7.field12302 && (var7.field12307 == 58 || var7.field12307 == 1007 || var7.field12307 == 25 || var7.field12307 == 57 || var7.field12307 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("jw.ad(I)Larm;")
	public static MinimenuEntry method4924() {
		return Statics.field11913;
	}

	@ObfuscatedName("ge.am(I)Larm;")
	public static MinimenuEntry method3558() {
		return Statics.field1846;
	}

	@ObfuscatedName("jd.au(Larm;I)Ljava/lang/String;")
	public static String method4642(MinimenuEntry arg0) {
		return field562 || arg0 == null ? "" : arg0.field12297;
	}

	@ObfuscatedName("nw.ar(Larm;B)Ljava/lang/String;")
	public static String method6018(MinimenuEntry arg0) {
		if (field562 || arg0 == null) {
			return "";
		} else if ((arg0.field12301 == null || arg0.field12301.length() == 0) && arg0.field12296 != null && arg0.field12296.length() > 0) {
			return arg0.field12296;
		} else {
			return arg0.field12301;
		}
	}

	@ObfuscatedName("amn.ap(Larm;I)I")
	public static int method18429(MinimenuEntry arg0) {
		if (field562) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			int var1 = arg0.field12307;
			if (Statics.method13985(var1)) {
				return 1;
			} else if (method9907(var1)) {
				return 2;
			} else if (method4053(var1)) {
				return 3;
			} else if (method16450(var1)) {
				return 4;
			} else if (method5944(var1)) {
				return 7;
			} else if (var1 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@ObfuscatedName("c.aq(Larm;I)Ljava/lang/String;")
	public static String method313(MinimenuEntry arg0) {
		if (field562 || arg0 == null) {
			return "";
		} else {
			int[] var1 = method7096(arg0);
			return var1 == null ? "" : method14480(var1);
		}
	}

	@ObfuscatedName("mw.ax(Lou;Lpq;IIB)V")
	public static void method5928(Matrix4x3 arg0, Matrix4x4 arg1, int arg2, int arg3) {
		if (field553 == null) {
			field553 = new Matrix4x4(arg1);
		} else {
			field553.method6604(arg1);
		}
		field572.method6292(arg0);
		field560 = arg2;
		field561 = arg3;
	}

	@ObfuscatedName("xl.av(Lpq;B)V")
	public static void method9927(Matrix4x4 arg0) {
		field555.method6604(arg0);
	}

	@ObfuscatedName("kh.ao(Ldh;I)V")
	public static void method5200(Renderer arg0) {
		if (field564) {
			method17807(arg0);
		} else {
			method213(arg0);
		}
	}

	@ObfuscatedName("vf.aj(Ldh;I)V")
	public static void method9594(Renderer arg0) {
		if (field546 < 2 && !client.field10973 || client.field10989 != null) {
			return;
		}
		String var1;
		if (client.field10973 && field546 < 2) {
			var1 = client.field11039 + LocalisedText.MINISEPERATOR.method15021(Statics.field1680) + client.field10977 + " " + TextUtil.ARROW;
		} else if (method7893() && field546 > 2) {
			var1 = method16451(Statics.field11913);
		} else {
			MinimenuEntry var2 = Statics.field11913;
			if (var2 == null) {
				return;
			}
			var1 = method16451(var2);
			int[] var3 = method7096(var2);
			if (var3 != null) {
				var1 = var1 + method14480(var3);
			}
		}
		if (field546 > 2) {
			var1 = var1 + Statics.method596(16777215) + " / " + (field546 - 2) + LocalisedText.MOREOPTIONS.method15021(Statics.field1680);
		}
		if (field576 == null) {
			return;
		}
		Font var4 = field576.method3942(Statics.field7538, client.field10833);
		if (var4 == null) {
			var4 = Statics.field10355;
		}
		var4.method2700(var1, field556, field557, field576.field2196, field576.field2197, field576.field2210, field576.field2219, field576.field2223, field576.field2264, client.field10890, Statics.field1681, client.field11042, Statics.field10302, null);
		client.method3066(client.field11042[0], client.field11042[1], client.field11042[2], client.field11042[3]);
	}

	@ObfuscatedName("hp.ay(Ldh;IIIIIII)V")
	public static void method4064(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		arg0.method2301(arg1, arg2, arg3, arg4, arg5);
		arg0.method2301(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
		arg0.method2173(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
	}

	@ObfuscatedName("pc.ab(Larm;I)[I")
	public static int[] method7096(MinimenuEntry arg0) {
		int[] var1 = null;
		if (method9907(arg0.field12307)) {
			var1 = ((ObjType) Statics.field1842.get((int) arg0.field12300)).field8691;
		} else if (arg0.field12303 != -1) {
			var1 = ((ObjType) Statics.field1842.get(arg0.field12303)).field8691;
		} else if (method16450(arg0.field12307)) {
			ObjectWrapper var2 = (ObjectWrapper) client.field10838.method14495((long) arg0.field12300);
			if (var2 != null) {
				NpcEntity var3 = (NpcEntity) var2.field11436;
				NPCType var4 = var3.field12083;
				if (var4.field2735 != null) {
					var4 = var4.method4547(Statics.field7410, Statics.field7410);
				}
				if (var4 != null) {
					var1 = var4.field2757;
				}
			}
		} else if (method4053(arg0.field12307)) {
			LocType var5 = (LocType) client.world.method7750().get((int) (arg0.field12300 >>> 32 & 0x7FFFFFFFL));
			if (var5.field7505 != null) {
				var5 = var5.method9477(Statics.field7410, Statics.field7410);
			}
			if (var5 != null) {
				var1 = var5.field7484;
			}
		}
		return var1;
	}

	@ObfuscatedName("vl.az(IIIIIIILarm;Leu;Laac;IIS)V")
	public static void method9284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, MinimenuEntry arg7, Font arg8, FontMetrics arg9, int arg10, int arg11) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field8562 - 1 && arg1 < arg9.field8569 + arg6 && arg7.field12308) {
			arg10 = arg11;
		}
		int[] var12 = method7096(arg7);
		String var13 = method16451(arg7);
		if (var12 != null) {
			var13 = var13 + method14480(var12);
		}
		arg8.method2689(var13, arg2 + 3, arg6, arg10, 0, client.field10890, Statics.field1681, Statics.field10302, null);
		if (arg7.field12299) {
			Statics.field1940.method1439(arg2 + 5 + arg9.method14533(var13, Statics.field10302), arg6 - arg9.field8562);
		}
	}

	@ObfuscatedName("k.af(Ldh;I)V")
	public static void method213(Renderer arg0) {
		int var1 = -10660793;
		method4064(arg0, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var1, -16777216);
		Statics.field10355.method2681(LocalisedText.CHOOSEOPTION.method15021(Statics.field1680), Statics.field11738 + 3, Statics.field2960 + 14, var1, -1);
		int var2 = Statics.field9182.method9086();
		int var3 = Statics.field9182.method9092();
		if (!field540) {
			int var4 = 0;
			for (MinimenuEntry var5 = (MinimenuEntry) field542.method14191(); var5 != null; var5 = (MinimenuEntry) field542.method14161()) {
				int var6 = field536 * (field546 - 1 - var4) + Statics.field2960 + 31;
				method9284(var2, var3, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var6, var5, Statics.field10355, Statics.field10268, -1, -256);
				var4++;
			}
			return;
		}
		int var7 = 0;
		for (MinimenuSubmenu var8 = (MinimenuSubmenu) field550.method14317(); var8 != null; var8 = (MinimenuSubmenu) field550.method14324()) {
			int var9 = field536 * var7 + Statics.field2960 + 31;
			if (var8.field12310 == 1) {
				method9284(var2, var3, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var9, (MinimenuEntry) var8.field12312.field8497.field11439, Statics.field10355, Statics.field10268, -1, -256);
			} else {
				Statics.method16748(var2, var3, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var9, var8, Statics.field10355, Statics.field10268, -1, -256);
			}
			var7++;
		}
		if (field541 == null) {
			return;
		}
		method4064(arg0, Statics.field1981, Statics.field2433, Statics.field554, Statics.field3005, var1, -16777216);
		Statics.field10355.method2681(field541.field12311, Statics.field1981 + 3, Statics.field2433 + 14, var1, -1);
		int var10 = 0;
		for (MinimenuEntry var11 = (MinimenuEntry) field541.field12312.method14317(); var11 != null; var11 = (MinimenuEntry) field541.field12312.method14324()) {
			int var12 = field536 * var10 + Statics.field2433 + 31;
			method9284(var2, var3, Statics.field1981, Statics.field2433, Statics.field554, Statics.field3005, var12, var11, Statics.field10355, Statics.field10268, -1, -256);
			var10++;
		}
	}

	@ObfuscatedName("gl.ak(Ldh;IIIIILeu;Laac;Ljava/lang/String;I)V")
	public static void method3469(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Font arg6, FontMetrics arg7, String arg8) {
		int var9 = 255 - Statics.field4488 - field567;
		if (var9 < 0) {
			var9 = 0;
		}
		if (Statics.field9253 == null || Statics.field8480 == null) {
			if (Statics.field10317.method6889(Statics.field12340) && Statics.field10317.method6889(Statics.field740)) {
				Statics.field9253 = arg0.method2200(SpriteDataProvider.method1609(Statics.field10317, Statics.field12340, 0), true);
				SpriteData var10 = SpriteDataProvider.method1609(Statics.field10317, Statics.field740, 0);
				Statics.field8480 = arg0.method2200(var10, true);
				var10.method2601();
				Statics.field3568 = arg0.method2200(var10, true);
			} else {
				arg0.method2354(arg1, arg2, arg3, arg5, var9 << 24 | Statics.field7676, 1);
			}
		}
		if (Statics.field9253 != null && Statics.field8480 != null) {
			int var11 = (arg3 - Statics.field8480.method1459() * 2) / Statics.field9253.method1459();
			for (int var12 = 0; var12 < var11; var12++) {
				Statics.field9253.method1439(arg1 + Statics.field8480.method1459() + var12 * Statics.field9253.method1459(), arg2);
			}
			Statics.field8480.method1439(arg1, arg2);
			Statics.field3568.method1439(arg1 + arg3 - Statics.field3568.method1459(), arg2);
		}
		arg6.method2681(arg8, arg1 + 3, (20 - arg7.field8562) / 2 + arg7.field8562 + arg2, Statics.field1266 | 0xFF000000, -1);
		arg0.method2354(arg1, arg2 + arg5, arg3, arg4 - arg5, var9 << 24 | Statics.field7676, 1);
	}

	@ObfuscatedName("tm.an(Ldh;IIIIII)V")
	public static void method8462(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((Statics.field1224 == null || Statics.field10568 == null || Statics.field11699 == null) && Statics.field10317.method6889(Statics.field11642) && Statics.field10317.method6889(Statics.field1748) && Statics.field10317.method6889(Statics.field1847)) {
			SpriteData var6 = SpriteDataProvider.method1609(Statics.field10317, Statics.field1748, 0);
			Statics.field10568 = arg0.method2200(var6, true);
			var6.method2601();
			Statics.field566 = arg0.method2200(var6, true);
			Statics.field1224 = arg0.method2200(SpriteDataProvider.method1609(Statics.field10317, Statics.field11642, 0), true);
			SpriteData var7 = SpriteDataProvider.method1609(Statics.field10317, Statics.field1847, 0);
			Statics.field11699 = arg0.method2200(var7, true);
			var7.method2601();
			Statics.field11831 = arg0.method2200(var7, true);
		}
		if (Statics.field1224 == null || Statics.field10568 == null || Statics.field11699 == null) {
			return;
		}
		int var8 = (arg3 - Statics.field11699.method1459() * 2) / Statics.field1224.method1459();
		for (int var9 = 0; var9 < var8; var9++) {
			Statics.field1224.method1439(arg1 + Statics.field11699.method1459() + var9 * Statics.field1224.method1459(), arg2 + arg4 - Statics.field1224.method1435());
		}
		int var10 = (arg4 - arg5 - Statics.field11699.method1435()) / Statics.field10568.method1435();
		for (int var11 = 0; var11 < var10; var11++) {
			Statics.field10568.method1439(arg1, arg2 + arg5 + var11 * Statics.field10568.method1435());
			Statics.field566.method1439(arg1 + arg3 - Statics.field566.method1459(), arg2 + arg5 + var11 * Statics.field10568.method1435());
		}
		Statics.field11699.method1439(arg1, arg2 + arg4 - Statics.field11699.method1435());
		Statics.field11831.method1439(arg1 + arg3 - Statics.field11699.method1459(), arg2 + arg4 - Statics.field11699.method1435());
	}

	@ObfuscatedName("aky.bf(Ldh;I)V")
	public static void method17807(Renderer arg0) {
		int var1 = Statics.field11738;
		int var2 = Statics.field2960;
		int var3 = Statics.field1289;
		int var4 = Statics.field2576 - 3;
		byte var5 = 20;
		if (Statics.field1841 == null || Statics.field8786 == null) {
			Statics.field1841 = (Font) Statics.field7538.method6188(client.field10833, Statics.field8463, true, true);
			Statics.field8786 = Statics.field7538.method6163(client.field10833, Statics.field8463);
			if (Statics.field1841 != null && Statics.field8786 != null) {
				method6031();
				int var6 = var3 / 2 + var1;
				if (var3 + var6 > Statics.canvasWid) {
					var6 = Statics.canvasWid - var3;
				}
				if (var6 < 0) {
					var6 = 0;
				}
				method14926(var6, Statics.field2960);
				return;
			}
		}
		Font var7;
		if (Statics.field1841 == null || Statics.field8786 == null) {
			var7 = Statics.field10355;
		} else {
			var7 = Statics.field1841;
		}
		FontMetrics var8 = method16902();
		method3469(arg0, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var5, var7, var8, LocalisedText.CHOOSEOPTION.method15021(Statics.field1680));
		int var9 = 255 - Statics.field11830 - field567;
		if (var9 < 0) {
			var9 = 0;
		}
		int var10 = Statics.field9182.method9086();
		int var11 = Statics.field9182.method9092();
		if (field540) {
			int var15 = 0;
			for (MinimenuSubmenu var16 = (MinimenuSubmenu) field550.method14317(); var16 != null; var16 = (MinimenuSubmenu) field550.method14324()) {
				int var17 = field536 * var15 + var8.field8562 + var2 + var5 + 1;
				if (var10 > Statics.field11738 && var10 < Statics.field1289 + Statics.field11738 && var11 > var17 - var8.field8562 - 1 && var11 < var8.field8569 + var17 && (var16.field12310 > 1 || ((MinimenuEntry) var16.field12312.field8497.field11439).field12308)) {
					arg0.method2354(Statics.field11738, var17 - var8.field8562, Statics.field1289, field536, var9 << 24 | Statics.field6708, 1);
				}
				var15++;
			}
			if (field541 != null) {
				method3469(arg0, Statics.field1981, Statics.field2433, Statics.field554, Statics.field3005, var5, var7, var8, field541.field12311);
				int var18 = 0;
				for (MinimenuEntry var19 = (MinimenuEntry) field541.field12312.method14317(); var19 != null; var19 = (MinimenuEntry) field541.field12312.method14324()) {
					int var20 = field536 * var18 + var8.field8562 + Statics.field2433 + var5 + 1;
					if (var10 > Statics.field1981 && var10 < Statics.field554 + Statics.field1981 && var11 > var20 - var8.field8562 - 1 && var11 < var8.field8569 + var20 && var19.field12308) {
						arg0.method2354(Statics.field1981, var20 - var8.field8562, Statics.field554, field536, var9 << 24 | Statics.field6708, 1);
					}
					var18++;
				}
				method8462(arg0, Statics.field1981, Statics.field2433, Statics.field554, Statics.field3005, var5);
			}
		} else {
			int var12 = 0;
			for (MinimenuEntry var13 = (MinimenuEntry) field542.method14191(); var13 != null; var13 = (MinimenuEntry) field542.method14161()) {
				int var14 = field536 * (field546 - 1 - var12) + var8.field8562 + var2 + var5 + 1;
				if (var10 > Statics.field11738 && var10 < Statics.field1289 + Statics.field11738 && var11 > var14 - var8.field8562 - 1 && var11 < var8.field8569 + var14 && var13.field12308) {
					arg0.method2354(Statics.field11738, var14 - var8.field8562, Statics.field1289, field536, var9 << 24 | Statics.field6708, 1);
				}
				var12++;
			}
		}
		method8462(arg0, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var5);
		if (!field540) {
			int var21 = 0;
			for (MinimenuEntry var22 = (MinimenuEntry) field542.method14191(); var22 != null; var22 = (MinimenuEntry) field542.method14161()) {
				int var23 = field536 * (field546 - 1 - var21) + var8.field8562 + var2 + var5 + 1;
				method9284(var10, var11, var1, var2, var3, var4, var23, var22, var7, var8, Statics.field1266 | 0xFF000000, Statics.field2901 | 0xFF000000);
				var21++;
			}
			return;
		}
		int var24 = 0;
		for (MinimenuSubmenu var25 = (MinimenuSubmenu) field550.method14317(); var25 != null; var25 = (MinimenuSubmenu) field550.method14324()) {
			int var26 = field536 * var24 + var8.field8562 + Statics.field2960 + var5 + 1;
			if (var25.field12310 == 1) {
				method9284(var10, var11, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var26, (MinimenuEntry) var25.field12312.field8497.field11439, var7, var8, Statics.field1266 | 0xFF000000, Statics.field2901 | 0xFF000000);
			} else {
				Statics.method16748(var10, var11, Statics.field11738, Statics.field2960, Statics.field1289, Statics.field2576, var26, var25, var7, var8, Statics.field1266 | 0xFF000000, Statics.field2901 | 0xFF000000);
			}
			var24++;
		}
		if (field541 == null) {
			return;
		}
		int var27 = 0;
		for (MinimenuEntry var28 = (MinimenuEntry) field541.field12312.method14317(); var28 != null; var28 = (MinimenuEntry) field541.field12312.method14324()) {
			int var29 = field536 * var27 + var8.field8562 + Statics.field2433 + var5 + 1;
			method9284(var10, var11, Statics.field1981, Statics.field2433, Statics.field554, Statics.field3005, var29, var28, var7, var8, Statics.field1266 | 0xFF000000, Statics.field2901 | 0xFF000000);
			var27++;
		}
	}

	@ObfuscatedName("agw.bl(Larm;I)Ljava/lang/String;")
	public static String method16451(MinimenuEntry arg0) {
		if (arg0.field12296 == null || arg0.field12296.length() == 0) {
			return arg0.field12301 == null || arg0.field12301.length() <= 0 ? arg0.field12297 : arg0.field12297 + LocalisedText.MINISEPERATOR.method15021(Statics.field1680) + arg0.field12301;
		} else if (arg0.field12301 == null || arg0.field12301.length() <= 0) {
			return arg0.field12297 + LocalisedText.MINISEPERATOR.method15021(Statics.field1680) + arg0.field12296;
		} else {
			return arg0.field12297 + LocalisedText.MINISEPERATOR.method15021(Statics.field1680) + arg0.field12301 + LocalisedText.MINISEPERATOR.method15021(Statics.field1680) + arg0.field12296;
		}
	}

	@ObfuscatedName("adf.bk(Larn;B)Ljava/lang/String;")
	public static String method15244(MinimenuSubmenu arg0) {
		return arg0.field12311 + Statics.method596(16777215) + " >";
	}

	@ObfuscatedName("aiv.bh(Larn;Laac;B)I")
	public static int method16910(MinimenuSubmenu arg0, FontMetrics arg1) {
		String var2 = method15244(arg0);
		return arg1.method14533(var2, Statics.field10302);
	}

	@ObfuscatedName("ii.bx(Larm;Laac;I)I")
	public static int method4610(MinimenuEntry arg0, FontMetrics arg1) {
		String var2 = method16451(arg0);
		int[] var3 = method7096(arg0);
		if (var3 != null) {
			var2 = var2 + method14480(var3);
		}
		int var4 = arg1.method14533(var2, Statics.field10302);
		if (arg0.field12299) {
			var4 += Statics.field1940.method1459() + 4;
		}
		return var4;
	}

	@ObfuscatedName("aae.bd([II)Ljava/lang/String;")
	public static String method14480(int[] arg0) {
		StringBuilder var1 = new StringBuilder();
		for (int var2 = 0; var2 < arg0.length; var2++) {
			QuestType var3 = (QuestType) Statics.field1972.get(arg0[var2]);
			if (var3.field2651 != -1) {
				var1.append(" <sprite=").append(var3.field2651).append(">");
			}
		}
		return var1.toString();
	}

	@ObfuscatedName("xm.bi(II)Z")
	public static boolean method9907(int arg0) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@ObfuscatedName("agb.bn(IB)Z")
	public static boolean method16450(int arg0) {
		if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@ObfuscatedName("ne.bt(II)Z")
	public static boolean method5944(int arg0) {
		return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
	}

	@ObfuscatedName("hh.bq(IB)Z")
	public static boolean method4053(int arg0) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@ObfuscatedName("xi.bm(Laqc;ZI)V")
	public static void method10152(NpcEntity arg0, boolean arg1) {
		if (field546 >= 407) {
			return;
		}
		NPCType var2 = arg0.field12083;
		String var3 = arg0.field12082;
		if (var2.field2735 != null) {
			var2 = var2.method4547(Statics.field7410, Statics.field7410);
			if (var2 == null) {
				return;
			}
			var3 = var2.field2703;
		}
		if (!var2.field2734) {
			return;
		}
		if (arg0.field12081 != 0) {
			String var4 = client.field10768 == ModeGame.STELLARDAWN ? LocalisedText.RATING.method15021(Statics.field1680) : LocalisedText.LEVEL.method15021(Statics.field1680);
			var3 = var3 + Statics.method17760(arg0.field12081, Statics.field4490.field12064) + TextUtil.OPEN_PARENTHESIS + var4 + arg0.field12081 + TextUtil.CLOSE_PARENTHESIS;
		}
		if (client.field10973 && !arg1) {
			ParamType var5 = (ParamType) (Statics.field7677 == -1 ? null : Statics.field3086.get(Statics.field7677));
			if ((Statics.field1765 & 0x2) != 0 && (var5 == null || var2.method4551(Statics.field7677, var5.field9172) != var5.field9172)) {
				method3042(client.field11039, client.field10977 + " " + TextUtil.ARROW + " " + Statics.method596(16776960) + var3, Statics.field1844, 8, -1, (long) arg0.field10406, 0, 0, true, false, (long) arg0.field10406, false);
			}
		}
		if (arg1) {
			return;
		}
		String[] var6 = var2.field2692;
		boolean var7 = false;
		if (client.field10985) {
			var6 = client.method18725(var6);
		}
		if (var6 == null) {
			return;
		}
		for (int var8 = var6.length - 1; var8 >= 0; var8--) {
			if (var6[var8] != null && (arg0.field12090 & 0x1 << var8) == 0) {
				short var9 = client.field10959[var8];
				int var10 = client.field10971;
				int var11 = var2.method4563(var8);
				if (var11 != -1) {
					var10 = var11;
				}
				boolean var12 = var6[var8].equalsIgnoreCase(LocalisedText.ATTACK.method15021(Statics.field1680));
				boolean var13 = var6[var8].equalsIgnoreCase(LocalisedText.EXAMINE.method15021(Statics.field1680));
				if (var12 || var13) {
					if (var7) {
						continue;
					}
					switch(client.field10955.field7905) {
						case 0:
							if (var12) {
								continue;
							}
							break;
						case 1:
						case 2:
							if (var2.field2758 == 1) {
								var7 = true;
								continue;
							}
							break;
						case 3:
							var7 = true;
							continue;
					}
					if (var12) {
						var10 = var2.field2717;
					}
				}
				method3042(var6[var8], Statics.method596(16776960) + var3, var10, var9, -1, (long) arg0.field10406, 0, 0, true, false, (long) arg0.field10406, false);
			}
		}
		if (!var7) {
			return;
		}
		for (int var14 = 0; var14 < var6.length; var14++) {
			if (var6[var14] != null && (arg0.field12090 & 0x1 << var14) == 0) {
				boolean var15 = var6[var14].equalsIgnoreCase(LocalisedText.ATTACK.method15021(Statics.field1680));
				boolean var16 = var6[var14].equalsIgnoreCase(LocalisedText.EXAMINE.method15021(Statics.field1680));
				if (var15 || var16) {
					short var17 = client.field10959[var14];
					int var18 = client.field10971;
					int var19 = var2.method4563(var14);
					if (var19 != -1) {
						var18 = var19;
					}
					if (client.field10955 == AttackOpPriority.field7909 || client.field10955 == AttackOpPriority.field7908 && arg0.field12081 > Statics.field4490.field12064) {
						var17 = (short) (var17 + 2000);
					}
					if (var15) {
						var18 = var2.field2717;
					}
					method3042(var6[var14], Statics.method596(16776960) + var3, var18, var17, -1, (long) arg0.field10406, 0, 0, true, false, (long) arg0.field10406, false);
				}
			}
		}
	}

	@ObfuscatedName("ga.bb(Laqk;ZI)V")
	public static void method3542(PlayerEntity arg0, boolean arg1) {
		if (field546 >= 407) {
			return;
		}
		if (Statics.field4490 != arg0) {
			String var6;
			if (arg0.field12059 == 0) {
				boolean var2 = true;
				if (Statics.field4490.field12058 != -1 && arg0.field12058 != -1) {
					int var3 = Statics.field4490.field12058 < arg0.field12058 ? Statics.field4490.field12058 : arg0.field12058;
					int var4 = Statics.field4490.field12064 - arg0.field12064;
					if (var4 < 0) {
						var4 = -var4;
					}
					if (var4 > var3) {
						var2 = false;
					}
				}
				String var5 = client.field10768 == ModeGame.STELLARDAWN ? LocalisedText.RATING.method15021(Statics.field1680) : LocalisedText.LEVEL.method15021(Statics.field1680);
				if (arg0.field12064 >= arg0.field12072) {
					var6 = arg0.method19115(true) + (var2 ? Statics.method17760(arg0.field12064, Statics.field4490.field12064) : Statics.method596(16777215)) + TextUtil.OPEN_PARENTHESIS + var5 + arg0.field12064 + TextUtil.CLOSE_PARENTHESIS;
				} else {
					var6 = arg0.method19115(true) + (var2 ? Statics.method17760(arg0.field12064, Statics.field4490.field12064) : Statics.method596(16777215)) + TextUtil.OPEN_PARENTHESIS + var5 + arg0.field12064 + "+" + (arg0.field12072 - arg0.field12064) + TextUtil.CLOSE_PARENTHESIS;
				}
			} else if (arg0.field12059 == -1) {
				var6 = arg0.method19115(true);
			} else {
				var6 = arg0.method19115(true) + TextUtil.OPEN_PARENTHESIS + LocalisedText.SKILL.method15021(Statics.field1680) + arg0.field12059 + TextUtil.CLOSE_PARENTHESIS;
			}
			boolean var7 = false;
			if (arg0.field12061 != null && arg0.field12061.field7892 != -1) {
				NPCType var8 = (NPCType) Statics.field7961.get(arg0.field12061.field7892);
				if (var8.field2690) {
					var7 = true;
					var6 = ((NPCType) Statics.field7961.get(arg0.field12061.field7892)).field2703;
					if (var8.field2719 != 0) {
						String var9 = client.field10768 == ModeGame.STELLARDAWN ? LocalisedText.RATING.method15021(Statics.field1680) : LocalisedText.LEVEL.method15021(Statics.field1680);
						var6 = var6 + Statics.method17760(var8.field2719, Statics.field4490.field12064) + TextUtil.OPEN_PARENTHESIS + var9 + var8.field2719 + TextUtil.CLOSE_PARENTHESIS;
					}
				}
			}
			if (client.field10973 && !arg1 && (Statics.field1765 & 0x8) != 0) {
				method3042(client.field11039, client.field10977 + " " + TextUtil.ARROW + " " + Statics.method596(16777215) + var6, Statics.field1844, 15, -1, (long) arg0.field10406, 0, 0, true, false, (long) arg0.field10406, false);
			}
			if (!arg1) {
				for (int var10 = 7; var10 >= 0; var10--) {
					if (client.field10961[var10] != null) {
						short var11 = 0;
						if (client.field10961[var10].equalsIgnoreCase(LocalisedText.ATTACK.method15021(Statics.field1680))) {
							if (client.field10954 == AttackOpPriority.field7907) {
								continue;
							}
							if (client.field10954 == AttackOpPriority.field7909) {
								var11 = 2000;
							} else if (client.field10954 == AttackOpPriority.field7908 && arg0.field12064 > Statics.field4490.field12064) {
								var11 = 2000;
							}
							if (Statics.field4490.field12060 == 0 || arg0.field12060 == 0) {
								if (arg0.field12048) {
									var11 = 2000;
								}
							} else if (Statics.field4490.field12060 == arg0.field12060) {
								var11 = 2000;
							} else {
								var11 = 0;
							}
						} else if (client.field10962[var10]) {
							var11 = 2000;
						}
						short var12 = (short) (client.field10958[var10] + var11);
						int var13 = client.field10832[var10] == -1 ? client.field10971 : client.field10832[var10];
						int var14 = var7 ? 16776960 : 16777215;
						method3042(client.field10961[var10], Statics.method596(var14) + var6, var13, var12, -1, (long) arg0.field10406, 0, 0, true, false, (long) arg0.field10406, false);
					}
				}
			} else if (!var7) {
				method3042(Statics.method596(13421772) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long) arg0.field10406, false);
			}
			if (!arg1 && !var7) {
				for (MinimenuEntry var15 = (MinimenuEntry) field542.method14191(); var15 != null; var15 = (MinimenuEntry) field542.method14161()) {
					if (var15.field12307 == 23) {
						var15.field12296 = Statics.method596(16777215) + var6;
						break;
					}
				}
			}
		} else if (client.field10973 && (Statics.field1765 & 0x10) != 0) {
			method3042(client.field11039, client.field10977 + " " + TextUtil.ARROW + " " + Statics.method596(16777215) + LocalisedText.SELF.method15021(Statics.field1680), Statics.field1844, 16, -1, 0L, 0, 0, true, false, (long) arg0.field10406, false);
		}
	}

	@ObfuscatedName("ez.be(Lhf;II)Ljava/lang/String;")
	public static String method2846(Component arg0, int arg1) {
		if (!client.method17197(arg0).method17690(arg1) && arg0.field2315 == null) {
			return null;
		} else if (arg0.field2321 == null || arg0.field2321.length <= arg1 || arg0.field2321[arg1] == null || arg0.field2321[arg1].trim().length() == 0) {
			return client.field10881 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.field2321[arg1];
		}
	}

	@ObfuscatedName("aq.bu(Larm;IIZI)V")
	public static void method923(MinimenuEntry arg0, int arg1, int arg2, boolean arg3) {
		if (arg0 == null || field542.field8482 == arg0) {
			return;
		}
		int var4 = arg0.field12304;
		int var5 = arg0.field12302;
		int var6 = arg0.field12307;
		int var7 = (int) arg0.field12300;
		long var8 = arg0.field12300;
		if (var6 >= 2000) {
			var6 -= 2000;
		}
		CoordGrid var10 = client.world.method7727();
		if (var6 == 1008 || var6 == 1009 || var6 == 1010 || var6 == 1011 || var6 == 1012) {
			Statics.method15110(var6, var7, var4);
		}
		if (var6 == 58) {
			Component var11 = Component.method16682(var5, var4);
			if (var11 != null) {
				Statics.method5926(var11);
			}
		}
		if (var6 == 57 || var6 == 1007) {
			Statics.method4527(var7, var5, var4, arg0.field12301);
		}
		if (var6 == 25) {
			Component var12 = Component.method16682(var5, var4);
			if (var12 != null) {
				client.method9403();
				ServerActiveProperties var13 = client.method17197(var12);
				client.method10592(var12, var13.method17691(), var13.field11381);
				client.field11039 = client.method9557(var12);
				if (client.field11039 == null) {
					client.field11039 = "Null";
				}
				client.field10977 = var12.field2279 + Statics.method596(16777215);
			}
			return;
		}
		ClientProt var14 = null;
		if (var6 == 44) {
			var14 = ClientProt.OPPLAYER1;
		} else if (var6 == 45) {
			var14 = ClientProt.OPPLAYER2;
		} else if (var6 == 46) {
			var14 = ClientProt.OPPLAYER3;
		} else if (var6 == 47) {
			var14 = ClientProt.OPPLAYER4;
		} else if (var6 == 48) {
			var14 = ClientProt.OPPLAYER5;
		} else if (var6 == 49) {
			var14 = ClientProt.OPPLAYER6;
		} else if (var6 == 50) {
			var14 = ClientProt.OPPLAYER7;
		} else if (var6 == 51) {
			var14 = ClientProt.OPPLAYER8;
		} else if (var6 == 52) {
			var14 = ClientProt.OPPLAYER9;
		} else if (var6 == 53) {
			var14 = ClientProt.OPPLAYER10;
		}
		if (var14 != null) {
			PlayerEntity var15 = client.field10944[var7];
			if (var15 != null) {
				client.field10866 = arg1;
				client.field10924 = arg2;
				client.field10926 = 2;
				client.field10925 = 0;
				ClientMessage var16 = Statics.method1604(var14, client.field10849.field794);
				var16.field11432.p2(var7);
				var16.field11432.p1_alt1(method14766() ? 1 : 0);
				client.field10849.method934(var16);
				client.method6820(var15.field10450[0], var15.field10448[0]);
			}
		}
		ClientProt var17 = null;
		if (var6 == 3) {
			var17 = ClientProt.OPLOC1;
		} else if (var6 == 4) {
			var17 = ClientProt.OPLOC2;
		} else if (var6 == 5) {
			var17 = ClientProt.OPLOC3;
		} else if (var6 == 6) {
			var17 = ClientProt.OPLOC4;
		} else if (var6 == 1001) {
			var17 = ClientProt.OPLOC5;
		} else if (var6 == 1002) {
			var17 = ClientProt.OPLOC6;
		}
		if (var17 != null) {
			client.field10866 = arg1;
			client.field10924 = arg2;
			client.field10926 = 2;
			client.field10925 = 0;
			ClientMessage var18 = Statics.method1604(var17, client.field10849.field794);
			var18.field11432.p1_alt2(method14766() ? 1 : 0);
			var18.field11432.p2(var10.field7427 + var5);
			var18.field11432.p4((int) (var8 >>> 32) & Integer.MAX_VALUE);
			var18.field11432.p2_alt3(var10.field7426 + var4);
			client.field10849.method934(var18);
			client.method6820(var4, var5);
		}
		if (var6 == 23) {
			if (client.field10949 > 0 && method6035()) {
				client.method10445(Statics.field4490.field11717, var10.field7426 + var4, var10.field7427 + var5);
			} else {
				ClientMessage var19 = method9839(var4, var5, var7);
				if (var7 == 1) {
					var19.field11432.p1(-1);
					var19.field11432.p1(-1);
					var19.field11432.p2((int) client.field10895);
					var19.field11432.p1(57);
					var19.field11432.p1(client.field10885);
					var19.field11432.p1(client.field10887);
					var19.field11432.p1(89);
					Vector3 var20 = Statics.field4490.method10536().field4298;
					var19.field11432.p2((int) var20.field4308);
					var19.field11432.p2((int) var20.field4313);
					var19.field11432.p1(63);
				} else {
					client.field10866 = arg1;
					client.field10924 = arg2;
					client.field10926 = 1;
					client.field10925 = 0;
				}
				client.field10849.method934(var19);
				client.method6820(var4, var5);
			}
		}
		ClientProt var21 = null;
		if (var6 == 9) {
			var21 = ClientProt.OPNPC1;
		} else if (var6 == 10) {
			var21 = ClientProt.OPNPC2;
		} else if (var6 == 11) {
			var21 = ClientProt.OPNPC3;
		} else if (var6 == 12) {
			var21 = ClientProt.OPNPC4;
		} else if (var6 == 13) {
			var21 = ClientProt.OPNPC5;
		} else if (var6 == 1003) {
			var21 = ClientProt.OPNPC6;
		}
		if (var21 != null) {
			ObjectWrapper var22 = (ObjectWrapper) client.field10838.method14495((long) var7);
			if (var22 != null) {
				NpcEntity var23 = (NpcEntity) var22.field11436;
				client.field10866 = arg1;
				client.field10924 = arg2;
				client.field10926 = 2;
				client.field10925 = 0;
				ClientMessage var24 = Statics.method1604(var21, client.field10849.field794);
				var24.field11432.p1_alt3(method14766() ? 1 : 0);
				var24.field11432.p2_alt2(var7);
				client.field10849.method934(var24);
				client.method6820(var23.field10450[0], var23.field10448[0]);
			}
		}
		if (var6 == 17) {
			client.field10866 = arg1;
			client.field10924 = arg2;
			client.field10926 = 2;
			client.field10925 = 0;
			ClientMessage var25 = Statics.method1604(ClientProt.OPOBJT, client.field10849.field794);
			var25.field11432.p2_alt1(var7);
			var25.field11432.p1_alt1(method14766() ? 1 : 0);
			var25.field11432.p2_alt1(client.field10975);
			var25.field11432.p2_alt1(var10.field7427 + var5);
			var25.field11432.p2_alt1(var10.field7426 + var4);
			var25.field11432.p4_alt2(Statics.field6707);
			var25.field11432.p2_alt3(client.field10974);
			client.field10849.method934(var25);
			client.method6820(var4, var5);
		}
		if (var6 == 8) {
			ObjectWrapper var26 = (ObjectWrapper) client.field10838.method14495((long) var7);
			if (var26 != null) {
				NpcEntity var27 = (NpcEntity) var26.field11436;
				client.field10866 = arg1;
				client.field10924 = arg2;
				client.field10926 = 2;
				client.field10925 = 0;
				ClientMessage var28 = Statics.method1604(ClientProt.OPNPCT, client.field10849.field794);
				var28.field11432.p4(Statics.field6707);
				var28.field11432.p2(var7);
				var28.field11432.p1_alt1(method14766() ? 1 : 0);
				var28.field11432.p2_alt1(client.field10975);
				var28.field11432.p2(client.field10974);
				client.field10849.method934(var28);
				client.method6820(var27.field10450[0], var27.field10448[0]);
			}
		}
		if (var6 == 2) {
			client.field10866 = arg1;
			client.field10924 = arg2;
			client.field10926 = 2;
			client.field10925 = 0;
			ClientMessage var29 = Statics.method1604(ClientProt.OPLOCT, client.field10849.field794);
			var29.field11432.p1_alt1(method14766() ? 1 : 0);
			var29.field11432.p2_alt1(var10.field7426 + var4);
			var29.field11432.p2_alt1(client.field10975);
			var29.field11432.p2_alt3(var10.field7427 + var5);
			var29.field11432.p4_alt1(Statics.field6707);
			var29.field11432.p4_alt2((int) (var8 >>> 32) & Integer.MAX_VALUE);
			var29.field11432.p2(client.field10974);
			client.field10849.method934(var29);
			client.method6820(var4, var5);
		}
		if (var6 == 60) {
			if (client.field10949 > 0 && method6035()) {
				client.method10445(Statics.field4490.field11717, var10.field7426 + var4, var10.field7427 + var5);
			} else {
				client.field10866 = arg1;
				client.field10924 = arg2;
				client.field10926 = 1;
				client.field10925 = 0;
				ClientMessage var30 = Statics.method1604(ClientProt.FACE_SQUARE, client.field10849.field794);
				var30.field11432.p2_alt2(var10.field7427 + var5);
				var30.field11432.p2_alt3(var10.field7426 + var4);
				client.field10849.method934(var30);
			}
		}
		if (var6 == 16) {
			client.field10866 = arg1;
			client.field10924 = arg2;
			client.field10926 = 2;
			client.field10925 = 0;
			ClientMessage var31 = Statics.method1604(ClientProt.OPPLAYERT, client.field10849.field794);
			var31.field11432.p2(client.field10974);
			var31.field11432.p1_alt1(method14766() ? 1 : 0);
			var31.field11432.p2_alt1(client.field10975);
			var31.field11432.p2_alt3(Statics.field4490.field10406);
			var31.field11432.p4_alt2(Statics.field6707);
			client.field10849.method934(var31);
		}
		ClientProt var32 = null;
		if (var6 == 18) {
			var32 = ClientProt.OPOBJ1;
		} else if (var6 == 19) {
			var32 = ClientProt.OPOBJ2;
		} else if (var6 == 20) {
			var32 = ClientProt.OPOBJ3;
		} else if (var6 == 21) {
			var32 = ClientProt.OPOBJ4;
		} else if (var6 == 22) {
			var32 = ClientProt.OPOBJ5;
		} else if (var6 == 1004) {
			var32 = ClientProt.OPOBJ6;
		}
		if (var32 != null) {
			client.field10866 = arg1;
			client.field10924 = arg2;
			client.field10926 = 2;
			client.field10925 = 0;
			ClientMessage var33 = Statics.method1604(var32, client.field10849.field794);
			var33.field11432.p2_alt1(var7);
			var33.field11432.p2_alt1(var10.field7426 + var4);
			var33.field11432.p2(var10.field7427 + var5);
			var33.field11432.p1_alt3((arg3 ? 2 : 0) | (method14766() ? 1 : 0));
			client.field10849.method934(var33);
			client.method6820(var4, var5);
		}
		if (var6 == 15) {
			PlayerEntity var34 = client.field10944[var7];
			if (var34 != null) {
				client.field10866 = arg1;
				client.field10924 = arg2;
				client.field10926 = 2;
				client.field10925 = 0;
				ClientMessage var35 = Statics.method1604(ClientProt.OPPLAYERT, client.field10849.field794);
				var35.field11432.p2(client.field10974);
				var35.field11432.p1_alt1(method14766() ? 1 : 0);
				var35.field11432.p2_alt1(client.field10975);
				var35.field11432.p2_alt3(var7);
				var35.field11432.p4_alt2(Statics.field6707);
				client.field10849.method934(var35);
				client.method6820(var34.field10450[0], var34.field10448[0]);
			}
		}
		if (var6 == 59) {
			client.field10866 = arg1;
			client.field10924 = arg2;
			client.field10926 = 1;
			client.field10925 = 0;
			ClientMessage var36 = Statics.method1604(ClientProt.APCOORDT, client.field10849.field794);
			var36.field11432.p2_alt2(var10.field7426 + var4);
			var36.field11432.p4_alt1(Statics.field6707);
			var36.field11432.p2(client.field10975);
			var36.field11432.p2_alt2(var10.field7427 + var5);
			var36.field11432.p2_alt2(client.field10974);
			client.field10849.method934(var36);
			client.method6820(var4, var5);
		}
		if (var6 == 30 && client.field11056 == null) {
			client.method612(var5, var4);
			client.field11056 = Component.method16682(var5, var4);
			if (client.field11056 != null) {
				client.method4616(client.field11056);
			}
		}
		if (client.field10973) {
			client.method9403();
		}
		if (Statics.field7285 != null && client.field10927 == 0) {
			client.method4616(Statics.field7285);
		}
	}

	@ObfuscatedName("wc.bw(IIII)Lakl;")
	public static ClientMessage method9839(int arg0, int arg1, int arg2) {
		ClientMessage var3 = null;
		if (arg2 == 0) {
			var3 = Statics.method1604(ClientProt.MOVE_GAMECLICK, client.field10849.field794);
		}
		if (arg2 == 1) {
			var3 = Statics.method1604(ClientProt.MOVE_MINIMAPCLICK, client.field10849.field794);
		}
		CoordGrid var4 = client.world.method7727();
		var3.field11432.p2(var4.field7427 + arg1);
		var3.field11432.p1(method14766() ? 1 : 0);
		var3.field11432.p2_alt3(var4.field7426 + arg0);
		Minimap.field731 = arg0;
		Minimap.field718 = arg1;
		Minimap.field730 = false;
		DelayedStateChange.method14036();
		return var3;
	}

	@ObfuscatedName("aoy.bo(III)Z")
	public static boolean method18853(int arg0, int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (method7715(arg0)) {
			return true;
		} else {
			return !method7715(arg1);
		}
	}

	@ObfuscatedName("re.bz(II)Z")
	public static boolean method7715(int arg0) {
		return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
	}

	@ObfuscatedName("pf.bv(FFFFFFII)F")
	public static float method7009(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
		float var7 = 0.0F;
		float var8 = arg3 - arg0;
		float var9 = arg4 - arg1;
		float var10 = arg5 - arg2;
		float var11 = 0.0F;
		float var12 = 0.0F;
		float var13 = 0.0F;
		Scene var14 = client.world.method7743();
		while (var7 < 1.1F) {
			float var15 = var7 * var8 + arg0;
			float var16 = var7 * var9 + arg1;
			float var17 = var7 * var10 + arg2;
			int var18 = (int) var15 >> 9;
			int var19 = (int) var17 >> 9;
			if (var18 > 0 && var19 > 0 && var18 < client.world.method7728() && var19 < client.world.method7758()) {
				int var20 = Statics.field4490.field11717;
				if (var20 < 3 && (client.world.method7793().field4487[1][var18][var19] & 0x2) != 0) {
					var20++;
				}
				int var21 = var14.field6915[var20].method1527((int) var15, (int) var17);
				if ((float) var21 < var16) {
					if (arg6 >= 2) {
						return var7 - 0.1F + method7009(var11, var12, var13, var15, var16, var17, arg6 - 1) * 0.1F;
					}
					return var7;
				}
			}
			var11 = var15;
			var12 = var16;
			var13 = var17;
			var7 += 0.1F;
		}
		return -1.0F;
	}
}
