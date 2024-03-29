package com.jagex.graphics;

import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.*;
import com.jagex.core.utils.TextUtil;
import com.jagex.game.client.*;
import com.jagex.game.config.defaults.Binding;
import com.jagex.game.config.defaults.MiniMenuDefaults;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.componentproperties.ServerKeyProperties;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.questtype.QuestType;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.player.AttackOpPriority;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.DelayedStateChange;
import rs2.client.scene.ObjStackList;
import rs2.client.scene.entities.NpcEntity;
import rs2.client.scene.entities.PathingEntity;

import java.util.Iterator;
import java.util.List;

@ObfuscatedName("o")
public class MiniMenu {

	@ObfuscatedName("zc.m")
	public static MinimenuEntry field8348;

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

	@ObfuscatedName("cj.v")
	public static MinimenuEntry field1280;

	@ObfuscatedName("apn.o")
	public static MinimenuEntry field11913;

	@ObfuscatedName("ug.s")
	public static MinimenuEntry field7100;

	@ObfuscatedName("fq.y")
	public static MinimenuEntry field1846;

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

	@ObfuscatedName("amq.t")
	public static int field11738;

	@ObfuscatedName("jv.ae")
	public static int field2960;

	@ObfuscatedName("da.ag")
	public static int field1289;

	@ObfuscatedName("ho.ah")
	public static int field2576;

	@ObfuscatedName("gv.al")
	public static int field1981;

	@ObfuscatedName("hn.ac")
	public static int field2433;

	@ObfuscatedName("o.ai")
	public static int field554;

	@ObfuscatedName("jg.aw")
	public static int field3005;

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

	@ObfuscatedName("wx.aj")
	public static int field7676;

	@ObfuscatedName("qx.ay")
	public static int field4488;

	@ObfuscatedName("sy.ab")
	public static int field6708;

	@ObfuscatedName("ank.az")
	public static int field11830;

	@ObfuscatedName("am.aa")
	public static int field740;

	@ObfuscatedName("asg.af")
	public static int field12340;

	@ObfuscatedName("ea.ak")
	public static int field1748;

	@ObfuscatedName("alk.an")
	public static int field11642;

	@ObfuscatedName("fl.bf")
	public static int field1847;

	@ObfuscatedName("aak.bl")
	public static int field8463;

	@ObfuscatedName("aax.bk")
	public static Sprite field8480;

	@ObfuscatedName("nl.bh")
	public static Sprite field3568;

	@ObfuscatedName("adw.bx")
	public static Sprite field9253;

	@ObfuscatedName("ahn.bd")
	public static Sprite field10568;

	@ObfuscatedName("o.bc")
	public static Sprite field566;

	@ObfuscatedName("cr.bi")
	public static Sprite field1224;

	@ObfuscatedName("alv.bn")
	public static Sprite field11699;

	@ObfuscatedName("ank.bt")
	public static Sprite field11831;

	@ObfuscatedName("cz.bq")
	public static int field1266;

	@ObfuscatedName("jm.bm")
	public static int field2901;

	@ObfuscatedName("fv.bb")
	public static Font field1841;

	@ObfuscatedName("abx.be")
	public static FontMetrics field8786;

	@ObfuscatedName("o.by")
	public static int field567 = 0;

	@ObfuscatedName("vp.bu")
	public static boolean field7446;

	@ObfuscatedName("o.bw")
	public static int minLength = -1;

	@ObfuscatedName("gh.bo")
	public static MiniMenuDefaults field1971;

	@ObfuscatedName("o.bz")
	public static float[] field569 = new float[4];

	public MiniMenu() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aba.e(I)Z")
	public static boolean method14766() {
		return method15214(field1971.field7664);
	}

	@ObfuscatedName("rd.n(B)Z")
	public static boolean method7893() {
		return method15214(field1971.field7663);
	}

	@ObfuscatedName("ng.m(B)Z")
	public static boolean method6035() {
		return method15214(field1971.field7659);
	}

	@ObfuscatedName("ads.k(Lvy;I)Z")
	public static boolean method15214(KeyHeldBinding arg0) {
		return method3483(arg0, null);
	}

	@ObfuscatedName("gp.f(Lvt;Lakm;I)Z")
	public static boolean method3483(Binding arg0, MouseEvent arg1) {
		return arg0 != null && arg0.method9396(arg1, Client.field11024, Client.field10822, Client.keyboard);
	}

	@ObfuscatedName("sf.w(B)V")
	public static void method8326() {
		field8348 = new MinimenuEntry(LocalisedText.CANCEL.forLang(Client.language), "", Client.field10970, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@ObfuscatedName("uf.l(B)V")
	public static void method9026() {
		if (Client.field10862 >= 0) {
			return;
		}
		FontMetrics var0 = method16902();
		if (!field562) {
			field540 = minLength != -1 && field546 >= minLength || (field564 ? 26 : 22) + field546 * field536 > GameShell.canvasHei;
		}
		field538.removeAll();
		field552.removeAll();
		for (MinimenuEntry var1 = (MinimenuEntry) field542.peekFront(); var1 != null; var1 = (MinimenuEntry) field542.prev()) {
			int var2 = var1.field12307;
			if (var2 < 1000) {
				var1.remove();
				if (var2 == 59 || var2 == 2 || var2 == 8 || var2 == 17 || var2 == 15 || var2 == 16 || var2 == 58) {
					field552.pushBack(var1);
				} else {
					field538.pushBack(var1);
				}
			}
		}
		field538.merge(field542);
		field552.merge(field542);
		if (field546 > 1) {
			if (method7893() && field546 > 2) {
				field11913 = (MinimenuEntry) field542.head.next.next;
			} else {
				field11913 = (MinimenuEntry) field542.head.next;
			}
			field7100 = (MinimenuEntry) field542.head.next;
			if (field546 > 2) {
				field1846 = (MinimenuEntry) field7100.next;
			} else {
				field1846 = null;
			}
		} else {
			field11913 = null;
			field7100 = null;
			field1846 = null;
		}
		MouseEvent var3 = (MouseEvent) Client.mouseEvents.peekFront();
		int var4;
		int var5;
		if (var3 == null) {
			var4 = Client.mouse.method9086();
			var5 = Client.mouse.method9092();
		} else {
			var4 = var3.method17831();
			var5 = var3.method17832();
		}
		if (!field562) {
			boolean var36 = method3483(field1971.field7667, var3);
			boolean var37 = method3483(field1971.field7660, var3);
			boolean var38 = method3483(field1971.field7666, var3);
			if ((var36 || var37) && (Client.field10968 == 1 && field546 > 2 || method6848())) {
				var38 = true;
			}
			if (var38 && field546 > 0) {
				if (Client.field10989 == null && Client.field11003 == 0) {
					method14926(var4, var5);
				} else {
					field545 = 2;
				}
			} else if (var37) {
				if (field1846 != null) {
					method923(field1846, var4, var5, false);
				}
			} else if (var36) {
				if (field11913 != null) {
					boolean var39 = Client.field10989 != null || Client.field11003 > 0;
					if (var39) {
						field545 = 1;
						field1280 = field11913;
					} else {
						method923(field11913, var4, var5, false);
					}
				} else if (Client.targetModeActive) {
					Client.method9403();
				}
			}
			if (Client.field10989 == null && Client.field11003 == 0) {
				field545 = 0;
				field1280 = null;
			}
		} else if (!method3483(field1971.field7662, var3)) {
			boolean var27 = false;
			if (field541 != null) {
				if (var4 >= field1981 - 10 && var4 <= field554 + field1981 + 10 && var5 >= field2433 - 10 && var5 <= field3005 + field2433 + 10) {
					var27 = true;
				} else {
					method1594();
				}
			}
			if (!var27) {
				if (var4 < field11738 - 10 || var4 > field1289 + field11738 + 10 || var5 < field2960 - 10 || var5 > field2960 + field2576 + 10) {
					method6031();
				} else if (field540) {
					int var28 = -1;
					int var29 = -1;
					for (int var30 = 0; var30 < field543; var30++) {
						if (field564) {
							int var31 = field536 * var30 + var0.field8562 + field2960 + 20 + 1;
							if (var5 > var31 - var0.field8562 - 1 && var5 < var0.field8569 + var31) {
								var28 = var30;
								var29 = var31 - var0.field8562 - 1;
								break;
							}
						} else {
							int var32 = field536 * var30 + field2960 + 31;
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
						for (MinimenuSubmenu var35 = (MinimenuSubmenu) var34.nextNode(); var35 != null; var35 = (MinimenuSubmenu) var34.next()) {
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
		} else if (field541 != null && var4 >= field1981 && var4 <= field554 + field1981 && var5 >= field2433 && var5 <= field3005 + field2433) {
			int var6 = -1;
			for (int var7 = 0; var7 < field541.field12310; var7++) {
				if (field564) {
					int var8 = field536 * var7 + var0.field8562 + field2433 + 20 + 1;
					if (var5 > var8 - var0.field8562 - 1 && var5 < var0.field8569 + var8) {
						var6 = var7;
					}
				} else {
					int var9 = field536 * var7 + field2433 + 31;
					if (var5 > var9 - 13 && var5 < var9 + 3) {
						var6 = var7;
					}
				}
			}
			if (var6 != -1) {
				int var10 = 0;
				DualIterableQueueIterator var11 = new DualIterableQueueIterator(field541.field12312);
				for (MinimenuEntry var12 = (MinimenuEntry) var11.nextNode(); var12 != null; var12 = (MinimenuEntry) var11.next()) {
					if (var6 == var10) {
						method923(var12, var4, var5, true);
						break;
					}
					var10++;
				}
			}
			method6031();
		} else if (var4 >= field11738 && var4 <= field1289 + field11738 && var5 >= field2960 && var5 <= field2960 + field2576) {
			if (field540) {
				int var20 = -1;
				for (int var21 = 0; var21 < field543; var21++) {
					if (field564) {
						int var22 = field536 * var21 + var0.field8562 + field2960 + 20 + 1;
						if (var5 > var22 - var0.field8562 - 1 && var5 < var0.field8569 + var22) {
							var20 = var21;
							break;
						}
					} else {
						int var23 = field536 * var21 + field2960 + 31;
						if (var5 > var23 - 13 && var5 < var23 + 3) {
							var20 = var21;
							break;
						}
					}
				}
				if (var20 != -1) {
					int var24 = 0;
					DualIterableQueueIterator var25 = new DualIterableQueueIterator(field550);
					for (MinimenuSubmenu var26 = (MinimenuSubmenu) var25.nextNode(); var26 != null; var26 = (MinimenuSubmenu) var25.next()) {
						if (var20 == var24) {
							method923((MinimenuEntry) var26.field12312.head.secondaryPrev, var4, var5, true);
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
						int var15 = field536 * (field546 - 1 - var14) + var0.field8562 + field2960 + 20 + 1;
						if (var5 > var15 - var0.field8562 - 1 && var5 < var0.field8569 + var15) {
							var13 = var14;
						}
					} else {
						int var16 = field536 * (field546 - 1 - var14) + field2960 + 31;
						if (var5 > var16 - 13 && var5 < var16 + 3) {
							var13 = var14;
						}
					}
				}
				if (var13 != -1) {
					int var17 = 0;
					IterableQueueIterator var18 = new IterableQueueIterator(field542);
					for (MinimenuEntry var19 = (MinimenuEntry) var18.nextNode(); var19 != null; var19 = (MinimenuEntry) var18.next()) {
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

	@ObfuscatedName("xh.u(IIB)V")
	public static void method10201(int arg0, int arg1) {
		if (field545 == 1) {
			method923(field1280, arg0, arg1, false);
		} else if (field545 == 2) {
			method14926(arg0, arg1);
		}
		field545 = 0;
		field1280 = null;
	}

	@ObfuscatedName("ps.z(B)Z")
	public static boolean method6848() {
		if (field7100 == null) {
			return false;
		} else {
			if (field7100.field12307 >= 2000) {
				field7100.field12307 -= 2000;
			}
			return field7100.field12307 == 1007;
		}
	}

	@ObfuscatedName("abd.p(IIS)V")
	public static void method14926(int arg0, int arg1) {
		if (!Client.graphicsDefaults.field7727) {
			if (field546 == 1) {
				return;
			}
			if (field7446 && field546 == 2 && field7100.field12297.equals(LocalisedText.FACEHERE.forLang(Client.language))) {
				return;
			}
		}
		FontMetrics var2 = method16902();
		int var3 = var2.method14532(LocalisedText.CHOOSEOPTION.forLang(Client.language));
		int var6;
		if (field540) {
			for (MinimenuSubmenu var7 = (MinimenuSubmenu) field550.peekFront(); var7 != null; var7 = (MinimenuSubmenu) field550.prev()) {
				int var8;
				if (var7.field12310 == 1) {
					var8 = method4610((MinimenuEntry) var7.field12312.head.secondaryPrev, var2);
				} else {
					var8 = method16910(var7, var2);
				}
				if (var8 > var3) {
					var3 = var8;
				}
			}
			var3 += 8;
			var6 = field543 * field536 + 21;
			field2576 = (field564 ? 26 : 22) + field543 * field536;
		} else {
			for (MinimenuEntry var4 = (MinimenuEntry) field542.peekFront(); var4 != null; var4 = (MinimenuEntry) field542.prev()) {
				int var5 = method4610(var4, var2);
				if (var5 > var3) {
					var3 = var5;
				}
			}
			var3 += 8;
			var6 = field546 * field536 + 21;
			field2576 = field546 * field536 + (field564 ? 26 : 22);
		}
		var3 += 10;
		int var9 = arg0 - var3 / 2;
		if (var3 + var9 > GameShell.canvasWid) {
			var9 = GameShell.canvasWid - var3;
		}
		if (var9 < 0) {
			var9 = 0;
		}
		int var10 = arg1;
		if (var6 + arg1 > GameShell.canvasHei) {
			var10 = GameShell.canvasHei - var6;
		}
		if (var10 < 0) {
			var10 = 0;
		}
		field11738 = var9;
		field2960 = var10;
		field1289 = var3;
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
		for (MinimenuEntry var4 = (MinimenuEntry) arg0.field12312.peekFront(); var4 != null; var4 = (MinimenuEntry) arg0.field12312.prev()) {
			int var5 = method4610(var4, var2);
			if (var5 > var3) {
				var3 = var5;
			}
		}
		var3 += 8;
		int var6 = field536 * arg0.field12310 + 21;
		field3005 = field536 * arg0.field12310 + (field564 ? 26 : 22);
		int var7 = field1289 + field11738;
		if (var3 + var7 > GameShell.canvasWid) {
			var7 = field11738 - var3;
		}
		if (var7 < 0) {
			var7 = 0;
		}
		int var8 = field564 ? var2.field8562 + 20 + 1 : 31;
		int var9 = var2.field8562 + (arg1 - var8) + 1;
		if (var6 + var9 > GameShell.canvasHei) {
			var9 = GameShell.canvasHei - var6;
		}
		if (var9 < 0) {
			var9 = 0;
		}
		field1981 = var7;
		field2433 = var9;
		field554 = var3;
		field541 = arg0;
	}

	@ObfuscatedName("aih.c(B)Laac;")
	public static FontMetrics method16902() {
		FontMetrics var0;
		if (!field564) {
			var0 = DefaultSprites.field10268;
		} else if (field1841 == null || field8786 == null) {
			var0 = DefaultSprites.field10268;
		} else {
			var0 = field8786;
		}
		field536 = var0.field8569 + var0.field8562;
		return var0;
	}

	@ObfuscatedName("ng.r(I)V")
	public static void method6031() {
		method1594();
		field562 = false;
		Client.method3066(field11738, field2960, field1289, field2576);
		field11913 = null;
		field1846 = null;
	}

	@ObfuscatedName("cz.v(I)V")
	public static void method1594() {
		if (field541 != null) {
			field541 = null;
			Client.method3066(field1981, field2433, field554, field3005);
		}
	}

	@ObfuscatedName("fz.o(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZB)V")
	public static void method3042(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
		if (!field562 && field546 < 505) {
			int var14 = arg2 == -1 ? Client.field10970 : arg2;
			MinimenuEntry var15 = new MinimenuEntry(arg0, arg1, var14, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			method2771(var15);
		}
	}

	@ObfuscatedName("ej.s(Larm;B)V")
	public static void method2771(MinimenuEntry arg0) {
		if (arg0 == null) {
			return;
		}
		field542.pushBack(arg0);
		field546++;
		Object var1 = null;
		MinimenuSubmenu var4;
		if (arg0.field12306 || "".equals(arg0.field12301)) {
			var4 = new MinimenuSubmenu(arg0.field12301);
			field543++;
		} else {
			long var2 = arg0.field12305;
			for (var4 = (MinimenuSubmenu) field549.getNode(var2); var4 != null && !var4.field12311.equals(arg0.field12301); var4 = (MinimenuSubmenu) field549.next()) {
			}
			if (var4 == null) {
				var4 = (MinimenuSubmenu) field534.get(var2);
				if (var4 != null && !var4.field12311.equals(arg0.field12301)) {
					var4 = null;
				}
				if (var4 == null) {
					var4 = new MinimenuSubmenu(arg0.field12301);
				}
				field549.pushNode(var4, var2);
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
		arg0.secondaryRemove();
		for (MinimenuSubmenu var2 = (MinimenuSubmenu) field550.peekFront(); var2 != null; var2 = (MinimenuSubmenu) field550.prev()) {
			if (method18853(arg0.method19375(), var2.method19375())) {
				DualIterableQueue.method10144(arg0, var2);
				var1 = true;
				break;
			}
		}
		if (!var1) {
			field550.pushBack(arg0);
		}
	}

	@ObfuscatedName("rm.q(Lhf;III)V")
	public static void method7624(Component arg0, int arg1, int arg2) {
		if (Client.targetModeActive) {
			ParamType var3 = (ParamType) (Client.field7677 == -1 ? null : Client.paramTypeList.list(Client.field7677));
			if (Client.method17197(arg0).method17708() && (Client.field1765 & 0x20) != 0 && (var3 == null || arg0.method3950(Client.field7677, var3.defaultint) != var3.defaultint)) {
				method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + arg0.field2279, Client.field1844, 58, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		for (int var4 = 9; var4 >= 5; var4--) {
			String var5 = method2846(arg0, var4);
			if (var5 != null) {
				method3042(var5, arg0.field2279, Client.method17826(arg0, var4), 1007, arg0.field2334, (long) (var4 + 1), arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		String var6 = Client.method9557(arg0);
		if (var6 != null) {
			method3042(var6, arg0.field2279, arg0.field2283, 25, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		}
		for (int var7 = 4; var7 >= 0; var7--) {
			String var8 = method2846(arg0, var7);
			if (var8 != null) {
				method3042(var8, arg0.field2279, Client.method17826(arg0, var7), 57, arg0.field2334, (long) (var7 + 1), arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		if (!Client.method17197(arg0).method17689()) {
			return;
		}
		if (arg0.field2180 == null) {
			method3042(LocalisedText.CONTINUE.forLang(Client.language), "", -1, 30, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		} else {
			method3042(arg0.field2180, "", -1, 30, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		}
	}

	@ObfuscatedName("ew.x(Lahm;B)V")
	public static void method2897(PathingEntity arg0) {
		if (arg0 instanceof NpcEntity) {
			NpcEntity var1 = (NpcEntity) arg0;
			if (var1.npcType != null) {
				method10152(var1, Client.localPlayerEntity.level != var1.level);
			}
		} else if (arg0 instanceof PlayerEntity) {
			PlayerEntity var2 = (PlayerEntity) arg0;
			method3542(var2, Client.localPlayerEntity.level != var2.level);
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
		CoordGrid var3 = Client.world.method7727();
		Matrix4x4 var4 = arg0.method2208();
		method6036(arg0);
		var4.setToMatrix4x3(field572);
		var4.multiply(field553);
		var4.method6611();
		int var5 = arg1 - field563;
		int var6 = arg2 - field559;
		if (Client.world.getScene() == null) {
			return;
		}
		if (!Client.targetModeActive || (Client.field1765 & 0x40) != 0) {
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
				var7 = var20 + (Client.localPlayerEntity.size() - 1 << 8) >> 9;
				var8 = var21 + (Client.localPlayerEntity.size() - 1 << 8) >> 9;
				byte var22 = Client.localPlayerEntity.level;
				if (var22 < 3 && (Client.world.method7793().levelTileFlags[1][var20 >> 9][var21 >> 9] & 0x2) != 0) {
					int var91 = var22 + 1;
				}
			}
			if (var7 != -1 && var8 != -1) {
				if (Client.targetModeActive && (Client.field1765 & 0x40) != 0) {
					Component var23 = Component.method16682(Client.field6707, Client.field10974);
					if (var23 == null) {
						Client.method9403();
					} else {
						method3042(Client.field11039, " " + TextUtil.ARROW + " ", Client.field1844, 59, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
					}
				} else {
					if (field7446) {
						method3042(LocalisedText.FACEHERE.forLang(Client.language), "", -1, 60, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
					}
					method3042(Client.field4868, "", Client.field10963, 23, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
				}
			}
		}
		PickableEntityList var24 = Client.world.getScene().field6959;
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
										} while (!Client.field10809 && Client.localPlayerEntity.level != var29.field6978.level);
									} while (!var29.method8889(arg0, var25, var26));
									boolean var30 = false;
									boolean var31 = false;
									if (var29.field6978 instanceof PrimaryLayerEntity) {
										var32 = ((PrimaryLayerEntity) var29.field6978).field12471;
										var33 = ((PrimaryLayerEntity) var29.field6978).field12468;
									} else {
										Vector3 var34 = var29.field6978.getTransform().trans;
										var32 = (int) var34.x >> 9;
										var33 = (int) var34.z >> 9;
									}
									if (!(var29.field6978 instanceof PlayerEntity)) {
										break;
									}
									PlayerEntity var35 = (PlayerEntity) var29.field6978;
									int var36 = var35.size();
									Vector3 var37 = var35.getTransform().trans;
									if ((var36 & 0x1) == 0 && ((int) var37.x & 0x1FF) == 0 && ((int) var37.z & 0x1FF) == 0 || (var36 & 0x1) == 1 && ((int) var37.x & 0x1FF) == 256 && ((int) var37.z & 0x1FF) == 256) {
										int var38 = (int) var37.x - (var35.size() - 1 << 8);
										int var39 = (int) var37.z - (var35.size() - 1 << 8);
										for (int var40 = 0; var40 < Client.field11011; var40++) {
											ObjectWrapper var41 = (ObjectWrapper) Client.npcs.getNode((long) Client.field11036[var40]);
											if (var41 != null) {
												NpcEntity var42 = (NpcEntity) var41.value;
												if (var42.field10403 != Client.loopCycle && var42.field10452) {
													Vector3 var43 = var42.getTransform().trans;
													int var44 = (int) var43.x - (var42.npcType.size - 1 << 8);
													int var45 = (int) var43.z - (var42.npcType.size - 1 << 8);
													if (var44 >= var38 && var42.npcType.size <= var35.size() - (var44 - var38 >> 9) && var45 >= var39 && var42.npcType.size <= var35.size() - (var45 - var39 >> 9)) {
														method10152(var42, Client.localPlayerEntity.level != var29.field6978.level);
														var42.field10403 = Client.loopCycle;
													}
												}
											}
										}
										int var46 = ReceivePlayerPositions.highResolutionsCount;
										int[] var47 = ReceivePlayerPositions.highResolutionsIndices;
										for (int var48 = 0; var48 < var46; var48++) {
											PlayerEntity var49 = Client.players[var47[var48]];
											if (var49 != null && var49.field10403 != Client.loopCycle && var35 != var49 && var49.field10452) {
												Vector3 var50 = var49.getTransform().trans;
												int var51 = (int) var50.x - (var49.size() - 1 << 8);
												int var52 = (int) var50.z - (var49.size() - 1 << 8);
												if (var51 >= var38 && var49.size() <= var35.size() - (var51 - var38 >> 9) && var52 >= var39 && var49.size() <= var35.size() - (var52 - var39 >> 9)) {
													method3542(var49, Client.localPlayerEntity.level != var29.field6978.level);
													var49.field10403 = Client.loopCycle;
												}
											}
										}
									}
									if (var35.field10403 != Client.loopCycle) {
										method3542(var35, Client.localPlayerEntity.level != var29.field6978.level);
										var35.field10403 = Client.loopCycle;
										break;
									}
								}
								if (!(var29.field6978 instanceof NpcEntity)) {
									break;
								}
								NpcEntity var53 = (NpcEntity) var29.field6978;
								if (var53.npcType == null) {
									break;
								}
								Vector3 var54 = var53.getTransform().trans;
								if ((var53.npcType.size & 0x1) == 0 && ((int) var54.x & 0x1FF) == 0 && ((int) var54.z & 0x1FF) == 0 || (var53.npcType.size & 0x1) == 1 && ((int) var54.x & 0x1FF) == 256 && ((int) var54.z & 0x1FF) == 256) {
									int var55 = (int) var54.x - (var53.npcType.size - 1 << 8);
									int var56 = (int) var54.z - (var53.npcType.size - 1 << 8);
									for (int var57 = 0; var57 < Client.field11011; var57++) {
										ObjectWrapper var58 = (ObjectWrapper) Client.npcs.getNode((long) Client.field11036[var57]);
										if (var58 != null) {
											NpcEntity var59 = (NpcEntity) var58.value;
											if (var59.field10403 != Client.loopCycle && var53 != var59 && var59.field10452) {
												Vector3 var60 = var59.getTransform().trans;
												int var61 = (int) var60.x - (var59.npcType.size - 1 << 8);
												int var62 = (int) var60.z - (var59.npcType.size - 1 << 8);
												if (var61 >= var55 && var59.npcType.size <= var53.npcType.size - (var61 - var55 >> 9) && var62 >= var56 && var59.npcType.size <= var53.npcType.size - (var62 - var56 >> 9)) {
													method10152(var59, Client.localPlayerEntity.level != var29.field6978.level);
													var59.field10403 = Client.loopCycle;
												}
											}
										}
									}
									int var63 = ReceivePlayerPositions.highResolutionsCount;
									int[] var64 = ReceivePlayerPositions.highResolutionsIndices;
									for (int var65 = 0; var65 < var63; var65++) {
										PlayerEntity var66 = Client.players[var64[var65]];
										if (var66 != null && var66.field10403 != Client.loopCycle && var66.field10452) {
											Vector3 var67 = var66.getTransform().trans;
											int var68 = (int) var67.x - (var66.size() - 1 << 8);
											int var69 = (int) var67.z - (var66.size() - 1 << 8);
											if (var68 >= var55 && var66.size() <= var53.npcType.size - (var68 - var55 >> 9) && var69 >= var56 && var66.size() <= var53.npcType.size - (var69 - var56 >> 9)) {
												method3542(var66, Client.localPlayerEntity.level != var29.field6978.level);
												var66.field10403 = Client.loopCycle;
											}
										}
									}
								}
								if (var53.field10403 != Client.loopCycle) {
									method10152(var53, Client.localPlayerEntity.level != var29.field6978.level);
									var53.field10403 = Client.loopCycle;
									break;
								}
							}
							if (var29.field6978 instanceof ObjStackEntity) {
								int var70 = var3.x + var32;
								int var71 = var3.z + var33;
								ObjStackList var72 = (ObjStackList) Client.objStacks.getNode((long) (var29.field6978.level << 28 | var71 << 14 | var70));
								if (var72 != null) {
									int var73 = 0;
									Obj var74 = (Obj) var72.field11263.peekBack();
									while (var74 != null) {
										ObjType var75 = (ObjType) Client.objTypeList.list(var74.field11261);
										int var76;
										if (var75.minimenu_colour_overridden) {
											var76 = var75.minimenu_colour;
										} else if (var75.members) {
											var76 = field1971.field7665;
										} else {
											var76 = field1971.field7661;
										}
										if (Client.targetModeActive && Client.localPlayerEntity.level == var29.field6978.level) {
											ParamType var77 = (ParamType) (Client.field7677 == -1 ? null : Client.paramTypeList.list(Client.field7677));
											if ((Client.field1765 & 0x1) != 0 && (var77 == null || var75.getParam(Client.field7677, var77.defaultint) != var77.defaultint)) {
												method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + TextUtil.method596(var76) + var75.name, Client.field1844, 17, -1, (long) var74.field11261, var32, var33, true, false, (long) var73, false);
											}
										}
										if (Client.localPlayerEntity.level == var29.field6978.level) {
											String[] var78 = var75.op;
											for (int var79 = var78.length - 1; var79 >= 0; var79--) {
												if (var78[var79] != null) {
													short var80 = 0;
													int var81 = Client.field10971;
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
													int var82 = var75.getCursor(var79);
													if (var82 != -1) {
														var81 = var82;
													}
													method3042(var78[var79], TextUtil.method596(var76) + var75.name, var81, var80, -1, (long) var74.field11261, var32, var33, true, false, (long) var73, false);
												}
											}
										}
										var74 = (Obj) var72.field11263.next();
										var73++;
									}
								}
							}
						} while (!(var29.field6978 instanceof Location));
						var83 = (Location) var29.field6978;
						var84 = (LocType) Client.world.method7750().list(var83.method8223());
						if (var84.multiloc != null) {
							var84 = var84.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
						}
					} while (var84 == null);
					if (Client.targetModeActive && Client.localPlayerEntity.level == var29.field6978.level) {
						ParamType var85 = (ParamType) (Client.field7677 == -1 ? null : Client.paramTypeList.list(Client.field7677));
						if ((Client.field1765 & 0x4) != 0 && (var85 == null || var84.getParam(Client.field7677, var85.defaultint) != var85.defaultint)) {
							method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + TextUtil.method596(65535) + var84.name, Client.field1844, 2, -1, method6964(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
						}
					}
				} while (Client.localPlayerEntity.level != var29.field6978.level);
				var86 = var84.op;
			} while (var86 == null);
			for (int var87 = var86.length - 1; var87 >= 0; var87--) {
				if (var86[var87] != null) {
					short var88 = 0;
					int var89 = Client.field10971;
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
					int var90 = var84.getCursor(var87);
					if (var90 != -1) {
						var89 = var90;
					}
					method3042(var86[var87], TextUtil.method596(65535) + var84.name, var89, var88, -1, method6964(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
				}
			}
		}
	}

	@ObfuscatedName("py.a(Lst;III)J")
	public static long method6964(Location arg0, int arg1, int arg2) {
		long var3 = 4194304L;
		long var5 = Long.MIN_VALUE;
		LocType var7 = (LocType) Client.world.method7750().list(arg0.method8223());
		long var8 = (long) (arg1 | arg2 << 7 | arg0.method8220() << 14 | arg0.method8204() << 20 | 0x40000000);
		if (var7.active == 0) {
			var8 |= var5;
		}
		if (var7.raiseobject == 1) {
			var8 |= var3;
		}
		return var8 | (long) arg0.method8223() << 32;
	}

	@ObfuscatedName("wb.g(Larm;I)V")
	public static void method9773(MinimenuEntry arg0) {
		if (field562) {
			return;
		}
		arg0.remove();
		field546--;
		if (!arg0.field12306) {
			long var1 = arg0.field12305;
			MinimenuSubmenu var3;
			for (var3 = (MinimenuSubmenu) field549.getNode(var1); var3 != null && !var3.field12311.equals(arg0.field12301); var3 = (MinimenuSubmenu) field549.next()) {
			}
			if (var3 != null && var3.method19374(arg0)) {
				method5924(var3);
			}
			return;
		}
		for (MinimenuSubmenu var4 = (MinimenuSubmenu) field550.peekFront(); var4 != null; var4 = (MinimenuSubmenu) field550.prev()) {
			if (var4.field12311.equals(arg0.field12301)) {
				boolean var5 = false;
				for (MinimenuEntry var6 = (MinimenuEntry) var4.field12312.peekFront(); var6 != null; var6 = (MinimenuEntry) var4.field12312.prev()) {
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
		for (MinimenuEntry var1 = (MinimenuEntry) field542.peekFront(); var1 != null; var1 = (MinimenuEntry) field542.prev()) {
			if (method13985(var1.field12307) && var1.field12302 >> 16 == arg0) {
				method9773(var1);
			}
		}
	}

	@ObfuscatedName("tb.j(IB)Z")
	public static boolean method8494(int arg0) {
		for (MinimenuEntry var1 = (MinimenuEntry) field542.peekFront(); var1 != null; var1 = (MinimenuEntry) field542.prev()) {
			if (method16450(var1.field12307) && var1.field12300 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("adv.t(I)Z")
	public static boolean method15249() {
		return field546 > 0;
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
		for (MinimenuSubmenu var0 = (MinimenuSubmenu) field550.peekFront(); var0 != null; var0 = (MinimenuSubmenu) field550.prev()) {
			if (var0.field12310 > 1) {
				var0.field12310 = 0;
				field534.put(var0, ((MinimenuEntry) var0.field12312.head.secondaryPrev).field12305);
				var0.field12312.removeAll();
			}
		}
		field543 = 0;
		field546 = 0;
		field542.removeAll();
		field549.removeAll();
		field550.removeAll();
		method2771(field8348);
	}

	@ObfuscatedName("ki.ah(B)V")
	public static void method5175() {
		for (MinimenuSubmenu var0 = (MinimenuSubmenu) field550.peekFront(); var0 != null; var0 = (MinimenuSubmenu) field550.prev()) {
			if (var0.field12310 > 1) {
				var0.field12310 = 0;
				field534.put(var0, ((MinimenuEntry) var0.field12312.head.secondaryPrev).field12305);
				var0.field12312.removeAll();
			}
		}
		field543 = 0;
		field546 = 0;
		field542.removeAll();
		field549.removeAll();
		field550.removeAll();
		field562 = false;
	}

	@ObfuscatedName("rk.al(I)V")
	public static void method7617() {
		field8480 = null;
		field3568 = null;
		field9253 = null;
		field10568 = null;
		field566 = null;
		field1224 = null;
		field11699 = null;
		field11831 = null;
		field1841 = null;
		field8786 = null;
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
		if (Client.field10989 == null) {
			if (field562) {
				FontMetrics var0 = method16902();
				int var1 = Client.mouse.method9086();
				int var2 = Client.mouse.method9092();
				if (field540) {
					if (var1 > field11738 && var1 < field1289 + field11738) {
						int var10 = -1;
						for (int var11 = 0; var11 < field543; var11++) {
							if (field564) {
								int var12 = field536 * var11 + var0.field8562 + field2960 + 20 + 1;
								if (var2 > var12 - var0.field8562 - 1 && var2 < var0.field8569 + var12) {
									var10 = var11;
								}
							} else {
								int var13 = field536 * var11 + field2960 + 31;
								if (var2 > var13 - var0.field8562 - 1 && var2 < var0.field8569 + var13) {
									var10 = var11;
								}
							}
						}
						if (var10 != -1) {
							int var14 = 0;
							DualIterableQueueIterator var15 = new DualIterableQueueIterator(field550);
							for (MinimenuSubmenu var16 = (MinimenuSubmenu) var15.nextNode(); var16 != null; var16 = (MinimenuSubmenu) var15.next()) {
								if (var14++ == var10) {
									return ((MinimenuEntry) var16.field12312.head.secondaryPrev).field12298;
								}
							}
						}
					} else if (field541 != null && var1 > field1981 && var1 < field554 + field1981) {
						int var17 = -1;
						for (int var18 = 0; var18 < field541.field12310; var18++) {
							if (field564) {
								int var19 = field536 * var18 + var0.field8562 + field2433 + 20 + 1;
								if (var2 > var19 - var0.field8562 - 1 && var2 < var0.field8569 + var19) {
									var17 = var18;
								}
							} else {
								int var20 = field536 * var18 + field2433 + 31;
								if (var2 > var20 - var0.field8562 - 1 && var2 < var0.field8569 + var20) {
									var17 = var18;
								}
							}
						}
						if (var17 != -1) {
							int var21 = 0;
							DualIterableQueueIterator var22 = new DualIterableQueueIterator(field541.field12312);
							for (MinimenuEntry var23 = (MinimenuEntry) var22.nextNode(); var23 != null; var23 = (MinimenuEntry) var22.next()) {
								if (var21++ == var17) {
									return var23.field12298;
								}
							}
						}
					}
				} else if (var1 > field11738 && var1 < field1289 + field11738) {
					int var3 = -1;
					for (int var4 = 0; var4 < field546; var4++) {
						if (field564) {
							int var5 = field536 * (field546 - 1 - var4) + var0.field8562 + field2960 + 20 + 1;
							if (var2 > var5 - var0.field8562 - 1 && var2 < var0.field8569 + var5) {
								var3 = var4;
							}
						} else {
							int var6 = field536 * (field546 - 1 - var4) + field2960 + 31;
							if (var2 > var6 - var0.field8562 - 1 && var2 < var0.field8569 + var6) {
								var3 = var4;
							}
						}
					}
					if (var3 != -1) {
						int var7 = 0;
						IterableQueueIterator var8 = new IterableQueueIterator(field542);
						for (MinimenuEntry var9 = (MinimenuEntry) var8.nextNode(); var9 != null; var9 = (MinimenuEntry) var8.next()) {
							if (var7++ == var3) {
								return var9.field12298;
							}
						}
					}
				}
			} else if (field1971.field7668) {
				if (field1846 != null) {
					return field1846.field12298;
				}
			} else if (field11913 != null) {
				return field11913.field12298;
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
		if (Component.field11725[var2] == null || Component.field11725[var2].field2151[var3] == null) {
			return false;
		}
		Component var4 = Component.field11725[var2].field2151[var3];
		if (arg1 == -1 && var4.field2184 == 0) {
			for (MinimenuEntry var5 = (MinimenuEntry) field542.peekFront(); var5 != null; var5 = (MinimenuEntry) field542.prev()) {
				if (var5.field12307 == 58 || var5.field12307 == 1007 || var5.field12307 == 25 || var5.field12307 == 57 || var5.field12307 == 30) {
					for (Component var6 = Component.method10202(var5.field12302); var6 != null; var6 = Client.method6000(Component.field11725[var6.field2158 >> 16], var6)) {
						if (var4.field2158 == var6.field2158) {
							return true;
						}
					}
				}
			}
		} else {
			for (MinimenuEntry var7 = (MinimenuEntry) field542.peekFront(); var7 != null; var7 = (MinimenuEntry) field542.prev()) {
				if (var7.field12304 == arg1 && var4.field2158 == var7.field12302 && (var7.field12307 == 58 || var7.field12307 == 1007 || var7.field12307 == 25 || var7.field12307 == 57 || var7.field12307 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("jw.ad(I)Larm;")
	public static MinimenuEntry method4924() {
		return field11913;
	}

	@ObfuscatedName("ge.am(I)Larm;")
	public static MinimenuEntry method3558() {
		return field1846;
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
			if (method13985(var1)) {
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
			field553.setTo(arg1);
		}
		field572.setTo(arg0);
		field560 = arg2;
		field561 = arg3;
	}

	@ObfuscatedName("xl.av(Lpq;B)V")
	public static void method9927(Matrix4x4 arg0) {
		field555.setTo(arg0);
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
		if (field546 < 2 && !Client.targetModeActive || Client.field10989 != null) {
			return;
		}
		String var1;
		if (Client.targetModeActive && field546 < 2) {
			var1 = Client.field11039 + LocalisedText.MINISEPERATOR.forLang(Client.language) + Client.field10977 + " " + TextUtil.ARROW;
		} else if (method7893() && field546 > 2) {
			var1 = method16451(field11913);
		} else {
			MinimenuEntry var2 = field11913;
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
			var1 = var1 + TextUtil.method596(16777215) + " / " + (field546 - 2) + LocalisedText.MOREOPTIONS.forLang(Client.language);
		}
		if (field576 == null) {
			return;
		}
		Font var4 = field576.method3942(Client.fontProvider, Client.fontFactory);
		if (var4 == null) {
			var4 = DefaultSprites.field10355;
		}
		var4.method2700(var1, field556, field557, field576.field2196, field576.field2197, field576.field2210, field576.field2219, field576.field2223, field576.field2264, Client.field10890, Client.field1681, Client.field11042, DefaultSprites.field10302, null);
		Client.method3066(Client.field11042[0], Client.field11042[1], Client.field11042[2], Client.field11042[3]);
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
			var1 = ((ObjType) Client.objTypeList.list((int) arg0.field12300)).quests;
		} else if (arg0.field12303 != -1) {
			var1 = ((ObjType) Client.objTypeList.list(arg0.field12303)).quests;
		} else if (method16450(arg0.field12307)) {
			ObjectWrapper var2 = (ObjectWrapper) Client.npcs.getNode((long) arg0.field12300);
			if (var2 != null) {
				NpcEntity var3 = (NpcEntity) var2.value;
				NPCType var4 = var3.npcType;
				if (var4.multinpc != null) {
					var4 = var4.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
				}
				if (var4 != null) {
					var1 = var4.quests;
				}
			}
		} else if (method4053(arg0.field12307)) {
			LocType var5 = (LocType) Client.world.method7750().list((int) (arg0.field12300 >>> 32 & 0x7FFFFFFFL));
			if (var5.multiloc != null) {
				var5 = var5.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
			}
			if (var5 != null) {
				var1 = var5.quests;
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
		arg8.method2689(var13, arg2 + 3, arg6, arg10, 0, Client.field10890, Client.field1681, DefaultSprites.field10302, null);
		if (arg7.field12299) {
			DefaultSprites.field1940.method1439(arg2 + 5 + arg9.method14533(var13, DefaultSprites.field10302), arg6 - arg9.field8562);
		}
	}

	@ObfuscatedName("ahe.aa(IIIIIIILarn;Leu;Laac;III)V")
	public static void method16748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, MinimenuSubmenu arg7, Font arg8, FontMetrics arg9, int arg10, int arg11) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field8562 - 1 && arg1 < arg9.field8569 + arg6) {
			arg10 = arg11;
		}
		String var12 = method15244(arg7);
		arg8.method2689(var12, arg2 + 3, arg6, arg10, 0, Client.field10890, Client.field1681, DefaultSprites.field10302, null);
	}

	@ObfuscatedName("k.af(Ldh;I)V")
	public static void method213(Renderer arg0) {
		int var1 = -10660793;
		method4064(arg0, field11738, field2960, field1289, field2576, var1, -16777216);
		DefaultSprites.field10355.method2681(LocalisedText.CHOOSEOPTION.forLang(Client.language), field11738 + 3, field2960 + 14, var1, -1);
		int var2 = Client.mouse.method9086();
		int var3 = Client.mouse.method9092();
		if (!field540) {
			int var4 = 0;
			for (MinimenuEntry var5 = (MinimenuEntry) field542.peekFront(); var5 != null; var5 = (MinimenuEntry) field542.prev()) {
				int var6 = field536 * (field546 - 1 - var4) + field2960 + 31;
				method9284(var2, var3, field11738, field2960, field1289, field2576, var6, var5, DefaultSprites.field10355, DefaultSprites.field10268, -1, -256);
				var4++;
			}
			return;
		}
		int var7 = 0;
		for (MinimenuSubmenu var8 = (MinimenuSubmenu) field550.peekFront(); var8 != null; var8 = (MinimenuSubmenu) field550.prev()) {
			int var9 = field536 * var7 + field2960 + 31;
			if (var8.field12310 == 1) {
				method9284(var2, var3, field11738, field2960, field1289, field2576, var9, (MinimenuEntry) var8.field12312.head.secondaryPrev, DefaultSprites.field10355, DefaultSprites.field10268, -1, -256);
			} else {
				method16748(var2, var3, field11738, field2960, field1289, field2576, var9, var8, DefaultSprites.field10355, DefaultSprites.field10268, -1, -256);
			}
			var7++;
		}
		if (field541 == null) {
			return;
		}
		method4064(arg0, field1981, field2433, field554, field3005, var1, -16777216);
		DefaultSprites.field10355.method2681(field541.field12311, field1981 + 3, field2433 + 14, var1, -1);
		int var10 = 0;
		for (MinimenuEntry var11 = (MinimenuEntry) field541.field12312.peekFront(); var11 != null; var11 = (MinimenuEntry) field541.field12312.prev()) {
			int var12 = field536 * var10 + field2433 + 31;
			method9284(var2, var3, field1981, field2433, field554, field3005, var12, var11, DefaultSprites.field10355, DefaultSprites.field10268, -1, -256);
			var10++;
		}
	}

	@ObfuscatedName("gl.ak(Ldh;IIIIILeu;Laac;Ljava/lang/String;I)V")
	public static void method3469(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Font arg6, FontMetrics arg7, String arg8) {
		int var9 = 255 - field4488 - field567;
		if (var9 < 0) {
			var9 = 0;
		}
		if (field9253 == null || field8480 == null) {
			if (Client.spritesJs5.method6889(field12340) && Client.spritesJs5.method6889(field740)) {
				field9253 = arg0.createSprite(SpriteDataProvider.method1609(Client.spritesJs5, field12340, 0), true);
				SpriteData var10 = SpriteDataProvider.method1609(Client.spritesJs5, field740, 0);
				field8480 = arg0.createSprite(var10, true);
				var10.method2601();
				field3568 = arg0.createSprite(var10, true);
			} else {
				arg0.fillRectangle(arg1, arg2, arg3, arg5, var9 << 24 | field7676, 1);
			}
		}
		if (field9253 != null && field8480 != null) {
			int var11 = (arg3 - field8480.getWidth() * 2) / field9253.getWidth();
			for (int var12 = 0; var12 < var11; var12++) {
				field9253.method1439(arg1 + field8480.getWidth() + var12 * field9253.getWidth(), arg2);
			}
			field8480.method1439(arg1, arg2);
			field3568.method1439(arg1 + arg3 - field3568.getWidth(), arg2);
		}
		arg6.method2681(arg8, arg1 + 3, (20 - arg7.field8562) / 2 + arg7.field8562 + arg2, field1266 | 0xFF000000, -1);
		arg0.fillRectangle(arg1, arg2 + arg5, arg3, arg4 - arg5, var9 << 24 | field7676, 1);
	}

	@ObfuscatedName("tm.an(Ldh;IIIIII)V")
	public static void method8462(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((field1224 == null || field10568 == null || field11699 == null) && Client.spritesJs5.method6889(field11642) && Client.spritesJs5.method6889(field1748) && Client.spritesJs5.method6889(field1847)) {
			SpriteData var6 = SpriteDataProvider.method1609(Client.spritesJs5, field1748, 0);
			field10568 = arg0.createSprite(var6, true);
			var6.method2601();
			field566 = arg0.createSprite(var6, true);
			field1224 = arg0.createSprite(SpriteDataProvider.method1609(Client.spritesJs5, field11642, 0), true);
			SpriteData var7 = SpriteDataProvider.method1609(Client.spritesJs5, field1847, 0);
			field11699 = arg0.createSprite(var7, true);
			var7.method2601();
			field11831 = arg0.createSprite(var7, true);
		}
		if (field1224 == null || field10568 == null || field11699 == null) {
			return;
		}
		int var8 = (arg3 - field11699.getWidth() * 2) / field1224.getWidth();
		for (int var9 = 0; var9 < var8; var9++) {
			field1224.method1439(arg1 + field11699.getWidth() + var9 * field1224.getWidth(), arg2 + arg4 - field1224.getHeight());
		}
		int var10 = (arg4 - arg5 - field11699.getHeight()) / field10568.getHeight();
		for (int var11 = 0; var11 < var10; var11++) {
			field10568.method1439(arg1, arg2 + arg5 + var11 * field10568.getHeight());
			field566.method1439(arg1 + arg3 - field566.getWidth(), arg2 + arg5 + var11 * field10568.getHeight());
		}
		field11699.method1439(arg1, arg2 + arg4 - field11699.getHeight());
		field11831.method1439(arg1 + arg3 - field11699.getWidth(), arg2 + arg4 - field11699.getHeight());
	}

	@ObfuscatedName("aky.bf(Ldh;I)V")
	public static void method17807(Renderer arg0) {
		int var1 = field11738;
		int var2 = field2960;
		int var3 = field1289;
		int var4 = field2576 - 3;
		byte var5 = 20;
		if (field1841 == null || field8786 == null) {
			field1841 = (Font) Client.fontProvider.method6188(Client.fontFactory, field8463, true, true);
			field8786 = Client.fontProvider.method6163(Client.fontFactory, field8463);
			if (field1841 != null && field8786 != null) {
				method6031();
				int var6 = var3 / 2 + var1;
				if (var3 + var6 > GameShell.canvasWid) {
					var6 = GameShell.canvasWid - var3;
				}
				if (var6 < 0) {
					var6 = 0;
				}
				method14926(var6, field2960);
				return;
			}
		}
		Font var7;
		if (field1841 == null || field8786 == null) {
			var7 = DefaultSprites.field10355;
		} else {
			var7 = field1841;
		}
		FontMetrics var8 = method16902();
		method3469(arg0, field11738, field2960, field1289, field2576, var5, var7, var8, LocalisedText.CHOOSEOPTION.forLang(Client.language));
		int var9 = 255 - field11830 - field567;
		if (var9 < 0) {
			var9 = 0;
		}
		int var10 = Client.mouse.method9086();
		int var11 = Client.mouse.method9092();
		if (field540) {
			int var15 = 0;
			for (MinimenuSubmenu var16 = (MinimenuSubmenu) field550.peekFront(); var16 != null; var16 = (MinimenuSubmenu) field550.prev()) {
				int var17 = field536 * var15 + var8.field8562 + var2 + var5 + 1;
				if (var10 > field11738 && var10 < field1289 + field11738 && var11 > var17 - var8.field8562 - 1 && var11 < var8.field8569 + var17 && (var16.field12310 > 1 || ((MinimenuEntry) var16.field12312.head.secondaryPrev).field12308)) {
					arg0.fillRectangle(field11738, var17 - var8.field8562, field1289, field536, var9 << 24 | field6708, 1);
				}
				var15++;
			}
			if (field541 != null) {
				method3469(arg0, field1981, field2433, field554, field3005, var5, var7, var8, field541.field12311);
				int var18 = 0;
				for (MinimenuEntry var19 = (MinimenuEntry) field541.field12312.peekFront(); var19 != null; var19 = (MinimenuEntry) field541.field12312.prev()) {
					int var20 = field536 * var18 + var8.field8562 + field2433 + var5 + 1;
					if (var10 > field1981 && var10 < field554 + field1981 && var11 > var20 - var8.field8562 - 1 && var11 < var8.field8569 + var20 && var19.field12308) {
						arg0.fillRectangle(field1981, var20 - var8.field8562, field554, field536, var9 << 24 | field6708, 1);
					}
					var18++;
				}
				method8462(arg0, field1981, field2433, field554, field3005, var5);
			}
		} else {
			int var12 = 0;
			for (MinimenuEntry var13 = (MinimenuEntry) field542.peekFront(); var13 != null; var13 = (MinimenuEntry) field542.prev()) {
				int var14 = field536 * (field546 - 1 - var12) + var8.field8562 + var2 + var5 + 1;
				if (var10 > field11738 && var10 < field1289 + field11738 && var11 > var14 - var8.field8562 - 1 && var11 < var8.field8569 + var14 && var13.field12308) {
					arg0.fillRectangle(field11738, var14 - var8.field8562, field1289, field536, var9 << 24 | field6708, 1);
				}
				var12++;
			}
		}
		method8462(arg0, field11738, field2960, field1289, field2576, var5);
		if (!field540) {
			int var21 = 0;
			for (MinimenuEntry var22 = (MinimenuEntry) field542.peekFront(); var22 != null; var22 = (MinimenuEntry) field542.prev()) {
				int var23 = field536 * (field546 - 1 - var21) + var8.field8562 + var2 + var5 + 1;
				method9284(var10, var11, var1, var2, var3, var4, var23, var22, var7, var8, field1266 | 0xFF000000, field2901 | 0xFF000000);
				var21++;
			}
			return;
		}
		int var24 = 0;
		for (MinimenuSubmenu var25 = (MinimenuSubmenu) field550.peekFront(); var25 != null; var25 = (MinimenuSubmenu) field550.prev()) {
			int var26 = field536 * var24 + var8.field8562 + field2960 + var5 + 1;
			if (var25.field12310 == 1) {
				method9284(var10, var11, field11738, field2960, field1289, field2576, var26, (MinimenuEntry) var25.field12312.head.secondaryPrev, var7, var8, field1266 | 0xFF000000, field2901 | 0xFF000000);
			} else {
				method16748(var10, var11, field11738, field2960, field1289, field2576, var26, var25, var7, var8, field1266 | 0xFF000000, field2901 | 0xFF000000);
			}
			var24++;
		}
		if (field541 == null) {
			return;
		}
		int var27 = 0;
		for (MinimenuEntry var28 = (MinimenuEntry) field541.field12312.peekFront(); var28 != null; var28 = (MinimenuEntry) field541.field12312.prev()) {
			int var29 = field536 * var27 + var8.field8562 + field2433 + var5 + 1;
			method9284(var10, var11, field1981, field2433, field554, field3005, var29, var28, var7, var8, field1266 | 0xFF000000, field2901 | 0xFF000000);
			var27++;
		}
	}

	@ObfuscatedName("agw.bl(Larm;I)Ljava/lang/String;")
	public static String method16451(MinimenuEntry arg0) {
		if (arg0.field12296 == null || arg0.field12296.length() == 0) {
			return arg0.field12301 == null || arg0.field12301.length() <= 0 ? arg0.field12297 : arg0.field12297 + LocalisedText.MINISEPERATOR.forLang(Client.language) + arg0.field12301;
		} else if (arg0.field12301 == null || arg0.field12301.length() <= 0) {
			return arg0.field12297 + LocalisedText.MINISEPERATOR.forLang(Client.language) + arg0.field12296;
		} else {
			return arg0.field12297 + LocalisedText.MINISEPERATOR.forLang(Client.language) + arg0.field12301 + LocalisedText.MINISEPERATOR.forLang(Client.language) + arg0.field12296;
		}
	}

	@ObfuscatedName("adf.bk(Larn;B)Ljava/lang/String;")
	public static String method15244(MinimenuSubmenu arg0) {
		return arg0.field12311 + TextUtil.method596(16777215) + " >";
	}

	@ObfuscatedName("aiv.bh(Larn;Laac;B)I")
	public static int method16910(MinimenuSubmenu arg0, FontMetrics arg1) {
		String var2 = method15244(arg0);
		return arg1.method14533(var2, DefaultSprites.field10302);
	}

	@ObfuscatedName("ii.bx(Larm;Laac;I)I")
	public static int method4610(MinimenuEntry arg0, FontMetrics arg1) {
		String var2 = method16451(arg0);
		int[] var3 = method7096(arg0);
		if (var3 != null) {
			var2 = var2 + method14480(var3);
		}
		int var4 = arg1.method14533(var2, DefaultSprites.field10302);
		if (arg0.field12299) {
			var4 += DefaultSprites.field1940.getWidth() + 4;
		}
		return var4;
	}

	@ObfuscatedName("aae.bd([II)Ljava/lang/String;")
	public static String method14480(int[] arg0) {
		StringBuilder var1 = new StringBuilder();
		for (int var2 = 0; var2 < arg0.length; var2++) {
			QuestType var3 = (QuestType) Client.questTypeList.list(arg0[var2]);
			if (var3.field2651 != -1) {
				var1.append(" <sprite=").append(var3.field2651).append(">");
			}
		}
		return var1.toString();
	}

	@ObfuscatedName("zd.bc(IB)Z")
	public static boolean method13985(int arg0) {
		return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
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
		NPCType var2 = arg0.npcType;
		String var3 = arg0.field12082;
		if (var2.multinpc != null) {
			var2 = var2.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var2 == null) {
				return;
			}
			var3 = var2.name;
		}
		if (!var2.active) {
			return;
		}
		if (arg0.vislevel != 0) {
			String var4 = Client.modegame == ModeGame.STELLARDAWN ? LocalisedText.RATING.forLang(Client.language) : LocalisedText.LEVEL.forLang(Client.language);
			var3 = var3 + method17760(arg0.vislevel, Client.localPlayerEntity.combatLevel) + TextUtil.OPEN_PARENTHESIS + var4 + arg0.vislevel + TextUtil.CLOSE_PARENTHESIS;
		}
		if (Client.targetModeActive && !arg1) {
			ParamType var5 = (ParamType) (Client.field7677 == -1 ? null : Client.paramTypeList.list(Client.field7677));
			if ((Client.field1765 & 0x2) != 0 && (var5 == null || var2.getParam(Client.field7677, var5.defaultint) != var5.defaultint)) {
				method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + TextUtil.method596(16776960) + var3, Client.field1844, 8, -1, (long) arg0.localPlayerIndex, 0, 0, true, false, (long) arg0.localPlayerIndex, false);
			}
		}
		if (arg1) {
			return;
		}
		String[] var6 = var2.op;
		boolean var7 = false;
		if (Client.field10985) {
			var6 = Client.method18725(var6);
		}
		if (var6 == null) {
			return;
		}
		for (int var8 = var6.length - 1; var8 >= 0; var8--) {
			if (var6[var8] != null && (arg0.field12090 & 0x1 << var8) == 0) {
				short var9 = Client.field10959[var8];
				int var10 = Client.field10971;
				int var11 = var2.getCursor(var8);
				if (var11 != -1) {
					var10 = var11;
				}
				boolean var12 = var6[var8].equalsIgnoreCase(LocalisedText.ATTACK.forLang(Client.language));
				boolean var13 = var6[var8].equalsIgnoreCase(LocalisedText.EXAMINE.forLang(Client.language));
				if (var12 || var13) {
					if (var7) {
						continue;
					}
					switch(Client.field10955.field7905) {
						case 0:
							if (var12) {
								continue;
							}
							break;
						case 1:
						case 2:
							if (var2.reprioritiseattackop == 1) {
								var7 = true;
								continue;
							}
							break;
						case 3:
							var7 = true;
							continue;
					}
					if (var12) {
						var10 = var2.cursorattack;
					}
				}
				method3042(var6[var8], TextUtil.method596(16776960) + var3, var10, var9, -1, (long) arg0.localPlayerIndex, 0, 0, true, false, (long) arg0.localPlayerIndex, false);
			}
		}
		if (!var7) {
			return;
		}
		for (int var14 = 0; var14 < var6.length; var14++) {
			if (var6[var14] != null && (arg0.field12090 & 0x1 << var14) == 0) {
				boolean var15 = var6[var14].equalsIgnoreCase(LocalisedText.ATTACK.forLang(Client.language));
				boolean var16 = var6[var14].equalsIgnoreCase(LocalisedText.EXAMINE.forLang(Client.language));
				if (var15 || var16) {
					short var17 = Client.field10959[var14];
					int var18 = Client.field10971;
					int var19 = var2.getCursor(var14);
					if (var19 != -1) {
						var18 = var19;
					}
					if (Client.field10955 == AttackOpPriority.field7909 || Client.field10955 == AttackOpPriority.field7908 && arg0.vislevel > Client.localPlayerEntity.combatLevel) {
						var17 = (short) (var17 + 2000);
					}
					if (var15) {
						var18 = var2.cursorattack;
					}
					method3042(var6[var14], TextUtil.method596(16776960) + var3, var18, var17, -1, (long) arg0.localPlayerIndex, 0, 0, true, false, (long) arg0.localPlayerIndex, false);
				}
			}
		}
	}

	@ObfuscatedName("ga.bb(Laqk;ZI)V")
	public static void method3542(PlayerEntity arg0, boolean arg1) {
		if (field546 >= 407) {
			return;
		}
		if (Client.localPlayerEntity != arg0) {
			String var6;
			if (arg0.field12059 == 0) {
				boolean var2 = true;
				if (Client.localPlayerEntity.field12058 != -1 && arg0.field12058 != -1) {
					int var3 = Client.localPlayerEntity.field12058 < arg0.field12058 ? Client.localPlayerEntity.field12058 : arg0.field12058;
					int var4 = Client.localPlayerEntity.combatLevel - arg0.combatLevel;
					if (var4 < 0) {
						var4 = -var4;
					}
					if (var4 > var3) {
						var2 = false;
					}
				}
				String var5 = Client.modegame == ModeGame.STELLARDAWN ? LocalisedText.RATING.forLang(Client.language) : LocalisedText.LEVEL.forLang(Client.language);
				if (arg0.combatLevel >= arg0.field12072) {
					var6 = arg0.method19115(true) + (var2 ? method17760(arg0.combatLevel, Client.localPlayerEntity.combatLevel) : TextUtil.method596(16777215)) + TextUtil.OPEN_PARENTHESIS + var5 + arg0.combatLevel + TextUtil.CLOSE_PARENTHESIS;
				} else {
					var6 = arg0.method19115(true) + (var2 ? method17760(arg0.combatLevel, Client.localPlayerEntity.combatLevel) : TextUtil.method596(16777215)) + TextUtil.OPEN_PARENTHESIS + var5 + arg0.combatLevel + "+" + (arg0.field12072 - arg0.combatLevel) + TextUtil.CLOSE_PARENTHESIS;
				}
			} else if (arg0.field12059 == -1) {
				var6 = arg0.method19115(true);
			} else {
				var6 = arg0.method19115(true) + TextUtil.OPEN_PARENTHESIS + LocalisedText.SKILL.forLang(Client.language) + arg0.field12059 + TextUtil.CLOSE_PARENTHESIS;
			}
			boolean var7 = false;
			if (arg0.model != null && arg0.model.field7892 != -1) {
				NPCType var8 = (NPCType) Client.npcTypeList.list(arg0.model.field7892);
				if (var8.transmogfakenpc) {
					var7 = true;
					var6 = ((NPCType) Client.npcTypeList.list(arg0.model.field7892)).name;
					if (var8.vislevel != 0) {
						String var9 = Client.modegame == ModeGame.STELLARDAWN ? LocalisedText.RATING.forLang(Client.language) : LocalisedText.LEVEL.forLang(Client.language);
						var6 = var6 + method17760(var8.vislevel, Client.localPlayerEntity.combatLevel) + TextUtil.OPEN_PARENTHESIS + var9 + var8.vislevel + TextUtil.CLOSE_PARENTHESIS;
					}
				}
			}
			if (Client.targetModeActive && !arg1 && (Client.field1765 & 0x8) != 0) {
				method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + TextUtil.method596(16777215) + var6, Client.field1844, 15, -1, (long) arg0.localPlayerIndex, 0, 0, true, false, (long) arg0.localPlayerIndex, false);
			}
			if (!arg1) {
				for (int var10 = 7; var10 >= 0; var10--) {
					if (Client.field10961[var10] != null) {
						short var11 = 0;
						if (Client.field10961[var10].equalsIgnoreCase(LocalisedText.ATTACK.forLang(Client.language))) {
							if (Client.field10954 == AttackOpPriority.field7907) {
								continue;
							}
							if (Client.field10954 == AttackOpPriority.field7909) {
								var11 = 2000;
							} else if (Client.field10954 == AttackOpPriority.field7908 && arg0.combatLevel > Client.localPlayerEntity.combatLevel) {
								var11 = 2000;
							}
							if (Client.localPlayerEntity.field12060 == 0 || arg0.field12060 == 0) {
								if (arg0.field12048) {
									var11 = 2000;
								}
							} else if (Client.localPlayerEntity.field12060 == arg0.field12060) {
								var11 = 2000;
							} else {
								var11 = 0;
							}
						} else if (Client.field10962[var10]) {
							var11 = 2000;
						}
						short var12 = (short) (Client.field10958[var10] + var11);
						int var13 = Client.field10832[var10] == -1 ? Client.field10971 : Client.field10832[var10];
						int var14 = var7 ? 16776960 : 16777215;
						method3042(Client.field10961[var10], TextUtil.method596(var14) + var6, var13, var12, -1, (long) arg0.localPlayerIndex, 0, 0, true, false, (long) arg0.localPlayerIndex, false);
					}
				}
			} else if (!var7) {
				method3042(TextUtil.method596(13421772) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long) arg0.localPlayerIndex, false);
			}
			if (!arg1 && !var7) {
				for (MinimenuEntry var15 = (MinimenuEntry) field542.peekFront(); var15 != null; var15 = (MinimenuEntry) field542.prev()) {
					if (var15.field12307 == 23) {
						var15.field12296 = TextUtil.method596(16777215) + var6;
						break;
					}
				}
			}
		} else if (Client.targetModeActive && (Client.field1765 & 0x10) != 0) {
			method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + TextUtil.method596(16777215) + LocalisedText.SELF.forLang(Client.language), Client.field1844, 16, -1, 0L, 0, 0, true, false, (long) arg0.localPlayerIndex, false);
		}
	}

	@ObfuscatedName("ez.be(Lhf;II)Ljava/lang/String;")
	public static String method2846(Component arg0, int arg1) {
		if (!Client.method17197(arg0).method17690(arg1) && arg0.field2315 == null) {
			return null;
		} else if (arg0.field2321 == null || arg0.field2321.length <= arg1 || arg0.field2321[arg1] == null || arg0.field2321[arg1].trim().length() == 0) {
			return Client.field10881 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.field2321[arg1];
		}
	}

	@ObfuscatedName("aku.by(III)Ljava/lang/String;")
	public static String method17760(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return TextUtil.method596(16711680);
		} else if (var2 < -6) {
			return TextUtil.method596(16723968);
		} else if (var2 < -3) {
			return TextUtil.method596(16740352);
		} else if (var2 < 0) {
			return TextUtil.method596(16756736);
		} else if (var2 > 9) {
			return TextUtil.method596(65280);
		} else if (var2 > 6) {
			return TextUtil.method596(4259584);
		} else if (var2 > 3) {
			return TextUtil.method596(8453888);
		} else if (var2 > 0) {
			return TextUtil.method596(12648192);
		} else {
			return TextUtil.method596(16776960);
		}
	}

	@ObfuscatedName("aq.bu(Larm;IIZI)V")
	public static void method923(MinimenuEntry arg0, int arg1, int arg2, boolean arg3) {
		if (arg0 == null || field542.head == arg0) {
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
		CoordGrid var10 = Client.world.method7727();
		if (var6 == 1008 || var6 == 1009 || var6 == 1010 || var6 == 1011 || var6 == 1012) {
			ClientWorldMap.method15110(var6, var7, var4);
		}
		if (var6 == 58) {
			Component var11 = Component.method16682(var5, var4);
			if (var11 != null) {
				Client.method5926(var11);
			}
		}
		if (var6 == 57 || var6 == 1007) {
			Client.method4527(var7, var5, var4, arg0.field12301);
		}
		if (var6 == 25) {
			Component var12 = Component.method16682(var5, var4);
			if (var12 != null) {
				Client.method9403();
				ServerKeyProperties var13 = Client.method17197(var12);
				Client.method10592(var12, var13.method17691(), var13.field11381);
				Client.field11039 = Client.method9557(var12);
				if (Client.field11039 == null) {
					Client.field11039 = "Null";
				}
				Client.field10977 = var12.field2279 + TextUtil.method596(16777215);
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
			PlayerEntity var15 = Client.players[var7];
			if (var15 != null) {
				Client.field10866 = arg1;
				Client.field10924 = arg2;
				Client.crossMode = 2;
				Client.crossCycle = 0;
				ClientMessage var16 = ClientMessage.createMessage(var14, Client.gameConnection.randomOut);
				var16.buf.p2(var7);
				var16.buf.p1_alt1(method14766() ? 1 : 0);
				Client.gameConnection.queue(var16);
				Client.method6820(var15.routeWaypointX[0], var15.routeWaypointZ[0]);
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
			Client.field10866 = arg1;
			Client.field10924 = arg2;
			Client.crossMode = 2;
			Client.crossCycle = 0;
			ClientMessage var18 = ClientMessage.createMessage(var17, Client.gameConnection.randomOut);
			var18.buf.p1_alt2(method14766() ? 1 : 0);
			var18.buf.p2(var10.z + var5);
			var18.buf.p4((int) (var8 >>> 32) & Integer.MAX_VALUE);
			var18.buf.p2_alt3(var10.x + var4);
			Client.gameConnection.queue(var18);
			Client.method6820(var4, var5);
		}
		if (var6 == 23) {
			if (Client.staffModLevel > 0 && method6035()) {
				Client.jtele(Client.localPlayerEntity.level, var10.x + var4, var10.z + var5);
			} else {
				ClientMessage var19 = method9839(var4, var5, var7);
				if (var7 == 1) {
					var19.buf.p1(-1);
					var19.buf.p1(-1);
					var19.buf.p2((int) Client.orbitCameraYaw);
					var19.buf.p1(57);
					var19.buf.p1(Client.minimapAnticheatAngle);
					var19.buf.p1(Client.minimapZoom);
					var19.buf.p1(89);
					Vector3 var20 = Client.localPlayerEntity.getTransform().trans;
					var19.buf.p2((int) var20.x);
					var19.buf.p2((int) var20.z);
					var19.buf.p1(63);
				} else {
					Client.field10866 = arg1;
					Client.field10924 = arg2;
					Client.crossMode = 1;
					Client.crossCycle = 0;
				}
				Client.gameConnection.queue(var19);
				Client.method6820(var4, var5);
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
			ObjectWrapper var22 = (ObjectWrapper) Client.npcs.getNode((long) var7);
			if (var22 != null) {
				NpcEntity var23 = (NpcEntity) var22.value;
				Client.field10866 = arg1;
				Client.field10924 = arg2;
				Client.crossMode = 2;
				Client.crossCycle = 0;
				ClientMessage var24 = ClientMessage.createMessage(var21, Client.gameConnection.randomOut);
				var24.buf.p1_alt3(method14766() ? 1 : 0);
				var24.buf.p2_alt2(var7);
				Client.gameConnection.queue(var24);
				Client.method6820(var23.routeWaypointX[0], var23.routeWaypointZ[0]);
			}
		}
		if (var6 == 17) {
			Client.field10866 = arg1;
			Client.field10924 = arg2;
			Client.crossMode = 2;
			Client.crossCycle = 0;
			ClientMessage var25 = ClientMessage.createMessage(ClientProt.OPOBJT, Client.gameConnection.randomOut);
			var25.buf.p2_alt1(var7);
			var25.buf.p1_alt1(method14766() ? 1 : 0);
			var25.buf.p2_alt1(Client.field10975);
			var25.buf.p2_alt1(var10.z + var5);
			var25.buf.p2_alt1(var10.x + var4);
			var25.buf.p4_alt2(Client.field6707);
			var25.buf.p2_alt3(Client.field10974);
			Client.gameConnection.queue(var25);
			Client.method6820(var4, var5);
		}
		if (var6 == 8) {
			ObjectWrapper var26 = (ObjectWrapper) Client.npcs.getNode((long) var7);
			if (var26 != null) {
				NpcEntity var27 = (NpcEntity) var26.value;
				Client.field10866 = arg1;
				Client.field10924 = arg2;
				Client.crossMode = 2;
				Client.crossCycle = 0;
				ClientMessage var28 = ClientMessage.createMessage(ClientProt.OPNPCT, Client.gameConnection.randomOut);
				var28.buf.p4(Client.field6707);
				var28.buf.p2(var7);
				var28.buf.p1_alt1(method14766() ? 1 : 0);
				var28.buf.p2_alt1(Client.field10975);
				var28.buf.p2(Client.field10974);
				Client.gameConnection.queue(var28);
				Client.method6820(var27.routeWaypointX[0], var27.routeWaypointZ[0]);
			}
		}
		if (var6 == 2) {
			Client.field10866 = arg1;
			Client.field10924 = arg2;
			Client.crossMode = 2;
			Client.crossCycle = 0;
			ClientMessage var29 = ClientMessage.createMessage(ClientProt.OPLOCT, Client.gameConnection.randomOut);
			var29.buf.p1_alt1(method14766() ? 1 : 0);
			var29.buf.p2_alt1(var10.x + var4);
			var29.buf.p2_alt1(Client.field10975);
			var29.buf.p2_alt3(var10.z + var5);
			var29.buf.p4_alt1(Client.field6707);
			var29.buf.p4_alt2((int) (var8 >>> 32) & Integer.MAX_VALUE);
			var29.buf.p2(Client.field10974);
			Client.gameConnection.queue(var29);
			Client.method6820(var4, var5);
		}
		if (var6 == 60) {
			if (Client.staffModLevel > 0 && method6035()) {
				Client.jtele(Client.localPlayerEntity.level, var10.x + var4, var10.z + var5);
			} else {
				Client.field10866 = arg1;
				Client.field10924 = arg2;
				Client.crossMode = 1;
				Client.crossCycle = 0;
				ClientMessage var30 = ClientMessage.createMessage(ClientProt.FACE_SQUARE, Client.gameConnection.randomOut);
				var30.buf.p2_alt2(var10.z + var5);
				var30.buf.p2_alt3(var10.x + var4);
				Client.gameConnection.queue(var30);
			}
		}
		if (var6 == 16) {
			Client.field10866 = arg1;
			Client.field10924 = arg2;
			Client.crossMode = 2;
			Client.crossCycle = 0;
			ClientMessage var31 = ClientMessage.createMessage(ClientProt.OPPLAYERT, Client.gameConnection.randomOut);
			var31.buf.p2(Client.field10974);
			var31.buf.p1_alt1(method14766() ? 1 : 0);
			var31.buf.p2_alt1(Client.field10975);
			var31.buf.p2_alt3(Client.localPlayerEntity.localPlayerIndex);
			var31.buf.p4_alt2(Client.field6707);
			Client.gameConnection.queue(var31);
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
			Client.field10866 = arg1;
			Client.field10924 = arg2;
			Client.crossMode = 2;
			Client.crossCycle = 0;
			ClientMessage var33 = ClientMessage.createMessage(var32, Client.gameConnection.randomOut);
			var33.buf.p2_alt1(var7);
			var33.buf.p2_alt1(var10.x + var4);
			var33.buf.p2(var10.z + var5);
			var33.buf.p1_alt3((arg3 ? 2 : 0) | (method14766() ? 1 : 0));
			Client.gameConnection.queue(var33);
			Client.method6820(var4, var5);
		}
		if (var6 == 15) {
			PlayerEntity var34 = Client.players[var7];
			if (var34 != null) {
				Client.field10866 = arg1;
				Client.field10924 = arg2;
				Client.crossMode = 2;
				Client.crossCycle = 0;
				ClientMessage var35 = ClientMessage.createMessage(ClientProt.OPPLAYERT, Client.gameConnection.randomOut);
				var35.buf.p2(Client.field10974);
				var35.buf.p1_alt1(method14766() ? 1 : 0);
				var35.buf.p2_alt1(Client.field10975);
				var35.buf.p2_alt3(var7);
				var35.buf.p4_alt2(Client.field6707);
				Client.gameConnection.queue(var35);
				Client.method6820(var34.routeWaypointX[0], var34.routeWaypointZ[0]);
			}
		}
		if (var6 == 59) {
			Client.field10866 = arg1;
			Client.field10924 = arg2;
			Client.crossMode = 1;
			Client.crossCycle = 0;
			ClientMessage var36 = ClientMessage.createMessage(ClientProt.APCOORDT, Client.gameConnection.randomOut);
			var36.buf.p2_alt2(var10.x + var4);
			var36.buf.p4_alt1(Client.field6707);
			var36.buf.p2(Client.field10975);
			var36.buf.p2_alt2(var10.z + var5);
			var36.buf.p2_alt2(Client.field10974);
			Client.gameConnection.queue(var36);
			Client.method6820(var4, var5);
		}
		if (var6 == 30 && Client.field11056 == null) {
			Client.method612(var5, var4);
			Client.field11056 = Component.method16682(var5, var4);
			if (Client.field11056 != null) {
				Client.method4616(Client.field11056);
			}
		}
		if (Client.targetModeActive) {
			Client.method9403();
		}
		if (Client.selectedArea != null && Client.selectedCycle == 0) {
			Client.method4616(Client.selectedArea);
		}
	}

	@ObfuscatedName("wc.bw(IIII)Lakl;")
	public static ClientMessage method9839(int arg0, int arg1, int arg2) {
		ClientMessage var3 = null;
		if (arg2 == 0) {
			var3 = ClientMessage.createMessage(ClientProt.MOVE_GAMECLICK, Client.gameConnection.randomOut);
		}
		if (arg2 == 1) {
			var3 = ClientMessage.createMessage(ClientProt.MOVE_MINIMAPCLICK, Client.gameConnection.randomOut);
		}
		CoordGrid var4 = Client.world.method7727();
		var3.buf.p2(var4.z + arg1);
		var3.buf.p1(method14766() ? 1 : 0);
		var3.buf.p2_alt3(var4.x + arg0);
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
		Scene var14 = Client.world.getScene();
		while (var7 < 1.1F) {
			float var15 = var7 * var8 + arg0;
			float var16 = var7 * var9 + arg1;
			float var17 = var7 * var10 + arg2;
			int var18 = (int) var15 >> 9;
			int var19 = (int) var17 >> 9;
			if (var18 > 0 && var19 > 0 && var18 < Client.world.getSizeX() && var19 < Client.world.getSizeZ()) {
				int var20 = Client.localPlayerEntity.level;
				if (var20 < 3 && (Client.world.method7793().levelTileFlags[1][var18][var19] & 0x2) != 0) {
					var20++;
				}
				int var21 = var14.field6915[var20].getFineHeight((int) var15, (int) var17);
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
