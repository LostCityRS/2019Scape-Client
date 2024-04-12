package com.jagex.game;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.PreciseSleep;
import com.jagex.game.client.Graphic;
import com.jagex.game.client.MapAlignmentX;
import com.jagex.game.client.MapAlignmentY;
import com.jagex.game.client.ReceivePlayerPositions;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.meltype.MapElementType;
import com.jagex.game.config.msitype.MSIType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.script.CommunityPartnerType;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.WorldMapRelated;
import com.jagex.game.world.WorldMapRelated2;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.math.Trig1;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.friendchat.Friend;
import rs2.client.scene.ObjStackList;
import rs2.client.scene.entities.NpcEntity;

@ObfuscatedName("at")
public class MiniMap {

	@ObfuscatedName("at.n")
	public static boolean field728 = false;

	@ObfuscatedName("at.m")
	public static boolean field720 = false;

	@ObfuscatedName("at.k")
	public static int[] field721 = new int[4];

	@ObfuscatedName("at.f")
	public static int field722 = -1;

	@ObfuscatedName("at.w")
	public static int field723 = 0;

	@ObfuscatedName("at.l")
	public static int[] field725 = new int[1008];

	@ObfuscatedName("at.u")
	public static int[] field733 = new int[1006];

	@ObfuscatedName("at.z")
	public static int[] field726 = new int[1013];

	@ObfuscatedName("at.p")
	public static LinkList field727 = new LinkList();

	@ObfuscatedName("at.d")
	public static int flagSceneTileX = -1;

	@ObfuscatedName("at.c")
	public static int flagSceneTileZ = -1;

	@ObfuscatedName("at.r")
	public static boolean mapFlag = true;

	@ObfuscatedName("at.v")
	public static boolean field732 = false;

	@ObfuscatedName("at.s")
	public static int toggle = 0;

	@ObfuscatedName("at.y")
	public static Sprite field734;

	@ObfuscatedName("yp.q")
	public static boolean[][] field8182;

	public MiniMap() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uo.e(B)V")
	public static void method9233() {
		toggle = 0;
		field722 = -1;
		flagSceneTileX = -1;
		flagSceneTileZ = -1;
	}

	@ObfuscatedName("gf.n(B)V")
	public static void method3552() {
		toggle = 0;
		flagSceneTileX = -1;
		flagSceneTileZ = -1;
	}

	@ObfuscatedName("jg.m(S)V")
	public static void rebuild() {
		field734 = null;
		field722 = -1;
	}

	@ObfuscatedName("ahm.k(B)V")
	public static void method16601() {
		field722 = -1;
	}

	@ObfuscatedName("am.f(I)V")
	public static void method829() {
		int var0 = Client.world.getSizeX();
		int var1 = Client.world.getSizeZ();
		field8182 = new boolean[var0 >> 3][var1 >> 3];
	}

	@ObfuscatedName("aih.w(Ldh;B)V")
	public static void method16903(Toolkit arg0) {
		if (field722 != Client.localPlayerEntity.level && Client.world.getScene() != null) {
			MonotonicTime.get();
			if (method14493(arg0, Client.localPlayerEntity.level)) {
				field722 = Client.localPlayerEntity.level;
			}
		}
	}

	@ObfuscatedName("aaz.l(Ldh;IB)Z")
	public static boolean method14493(Toolkit arg0, int arg1) {
		arg0.flush();
		MonotonicTime.get();
		if (!arg0.method2215()) {
			return false;
		}
		int var2 = Client.world.getSizeX();
		int var3 = Client.world.getSizeZ();
		SceneLevelTileFlags var4 = Client.world.getSceneLevelTileFlags();
		Scene var5 = Client.world.getScene();
		int var6 = arg1;
		if (Client.localPlayerEntity != null) {
			int var7 = Client.localPlayerEntity.routeWaypointX[0] >> 3;
			int var8 = Client.localPlayerEntity.routeWaypointZ[0] >> 3;
			if (var7 >= 0 && var7 < field8182.length && var8 >= 0 && var8 < field8182[var7].length && field8182[var7][var8]) {
				var6 = 0;
			}
		}
		int var9 = var2 / 2;
		byte var10 = 0;
		byte var11 = 0;
		boolean var12 = true;
		for (int var13 = var10; var13 < var2 + var10; var13++) {
			for (int var14 = var11; var14 < var3 + var11; var14++) {
				for (int var15 = var6; var15 <= 3; var15++) {
					if (var15 < arg1 || var4.method7104(arg1, var15, var13, var14)) {
						int var16 = var15;
						if (var4.isLinkBelow(var13, var14)) {
							var16 = var15 - 1;
						}
						if (var16 >= 0) {
							var12 &= method1005(var16, var13, var14);
						}
					}
				}
			}
		}
		if (!var12) {
			return false;
		}
		int var17 = var2 * 4 + 48 + 48;
		int[] var18 = new int[var17 * var17];
		for (int var19 = 0; var19 < var18.length; var19++) {
			var18[var19] = 0;
		}
		FrameBuffer var20 = null;
		byte var21 = 0;
		byte var22 = 0;
		if (field720) {
			field734 = arg0.createSprite(var17, var17, false, true);
			var20 = arg0.createFramebuffer();
			var20.method15439(0, field734.method1437());
			EffectInterface var23 = arg0.method2121(var17, var17);
			var20.method15441(var23);
			arg0.method2142(var20);
			var9 = var2;
			var21 = 48;
			var22 = 48;
			arg0.method2475(1, 0);
		} else {
			field734 = arg0.createSprite(var18, 0, var17, var17, var17);
		}
		Client.world.getEnvironmentManager().setLightingInterface();
		int var24 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		int var25 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		int var26 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		boolean[][] var27 = new boolean[var9 + 1 + 2][var9 + 1 + 2];
		arg0.method2326(field721);
		arg0.method2263();
		for (int var28 = var10; var28 < var2 + var10; var28 += var9) {
			for (int var29 = var11; var29 < var3 + var11; var29 += var9) {
				int var30 = var21;
				int var31 = var22;
				int var32 = var28;
				if (var28 > 0) {
					var32 = var28 - 1;
					var30 = var21 + 4;
				}
				int var33 = var29;
				if (var29 > 0) {
					var33 = var29 - 1;
				}
				int var34 = var9 + var28;
				if (var34 < var2) {
					var34++;
				}
				int var35 = var9 + var29;
				if (var35 < var3) {
					var35++;
					var31 = var22 + 4;
				}
				if (field728) {
					arg0.resetClip();
				} else {
					arg0.resetBounds(0, 0, var9 * 4 + var30, var9 * 4 + var31);
				}
				arg0.method2475(3, -16777216);
				int var36 = var9;
				if (var9 > var2 - 1) {
					var36 = var2 - 1;
				}
				for (int var37 = var6; var37 <= 3; var37++) {
					for (int var38 = 0; var38 <= var36; var38++) {
						for (int var39 = 0; var39 <= var36; var39++) {
							var27[var38][var39] = var37 < arg1 || var4.method7104(arg1, var37, var32 + var38, var33 + var39);
						}
					}
					var5.field6915[var37].method1526(var21, var22, 1024, var32, var33, var34, var35, var27);
					for (int var40 = -4; var40 < var9; var40++) {
						for (int var41 = -4; var41 < var9; var41++) {
							int var42 = var28 + var40;
							int var43 = var29 + var41;
							if (var42 >= var10 && var43 >= var11 && (var37 < arg1 || var4.method7104(arg1, var37, var42, var43))) {
								int var44 = var37;
								if (var4.isLinkBelow(var42, var43)) {
									var44 = var37 - 1;
								}
								if (var44 >= 0) {
									method4476(arg0, var44, var42, var43, var40 * 4 + var30, (var9 - var41) * 4 + var31 - 4, var24, var25);
								}
							}
						}
					}
				}
				arg0.fillRectangle(var30, var31, var9 * 4, var9 * 4, var26, 2);
				arg0.flush();
				if (!field720) {
					field734.draw((var28 - var10) * 4 + 48, var3 * 4 + 48 - (var29 - var11) * 4 - var9 * 4, var9 * 4, var9 * 4, var30, var31);
					if (field728) {
						field734.drawSprite(256, 0);
						try {
							arg0.method2115();
							PreciseSleep.sleep(2000L);
						} catch (Exception var55) {
						}
					}
				}
			}
		}
		if (field720) {
			arg0.method2143(var20);
			if (field728) {
				field734.drawSprite(256, 0);
				try {
					arg0.method2115();
					PreciseSleep.sleep(2000L);
				} catch (Exception var54) {
				}
			}
		}
		arg0.resetClip();
		arg0.method2164(field721[0], field721[1], field721[2], field721[3]);
		arg0.method2475(1, 1);
		Client.method9734();
		field723 = 0;
		field727.removeAll();
		if (!field732) {
			method16444(arg1);
			WorldMapRelated var47 = Client.world.method7871();
			if (var47 != null) {
				Client.mapElementTypeList.cacheResize(1024, 64);
				CoordGrid var48 = Client.world.getBase();
				for (int var49 = 0; var49 < var47.field6777; var49++) {
					int var50 = var47.field6776[var49];
					if (var50 >> 28 == Client.localPlayerEntity.level) {
						int var51 = (var50 >> 14 & 0x3FFF) - var48.x;
						int var52 = (var50 & 0x3FFF) - var48.z;
						if (var51 >= 0 && var51 < var2 && var52 >= 0 && var52 < var3) {
							field727.addTail(new IntNode(var49));
						} else {
							MapElementType var53 = (MapElementType) Client.mapElementTypeList.list(var47.field6775[var49]);
							if (var53.field2393 != null && var53.field2396 + var51 >= 0 && var53.field2373 + var51 < var2 && var53.field2397 + var52 >= 0 && var53.field2395 + var52 < var3) {
								field727.addTail(new IntNode(var49));
							}
						}
					}
				}
				Client.mapElementTypeList.cacheResize(128, 64);
			}
		}
		return true;
	}

	@ObfuscatedName("agm.u(II)V")
	public static void method16444(int arg0) {
		field723 = 0;
		int var1 = Client.world.getSizeX();
		int var2 = Client.world.getSizeZ();
		SceneLevelTileFlags var3 = Client.world.getSceneLevelTileFlags();
		Scene var4 = Client.world.getScene();
		LocTypeList var5 = Client.world.getLocTypeList();
		int var6 = arg0;
		if (Client.localPlayerEntity != null) {
			int var7 = Client.localPlayerEntity.routeWaypointX[0] >> 3;
			int var8 = Client.localPlayerEntity.routeWaypointZ[0] >> 3;
			if (var7 >= 0 && var7 < field8182.length && var8 >= 0 && var8 < field8182[var7].length && field8182[var7][var8]) {
				var6 = 0;
			}
		}
		for (int var9 = 0; var9 < var1; var9++) {
			for (int var10 = 0; var10 < var2; var10++) {
				for (int var11 = var6; var11 <= arg0 + 1 && var11 <= 3; var11++) {
					if ((var11 < arg0 || var3.method7104(arg0, var11, var9, var10)) && !method250((Location) var4.getGroundDecoration(var11, var9, var10), var5, var9, var10) && !method250((Location) var4.getEntity(var11, var9, var10, Client.field11001), var5, var9, var10) && !method250((Location) var4.getWall(var11, var9, var10), var5, var9, var10) && method250((Location) var4.getWallDecoration(var11, var9, var10), var5, var9, var10)) {
					}
				}
			}
		}
	}

	@ObfuscatedName("l.z(Lst;Laop;III)Z")
	public static boolean method250(Location arg0, LocTypeList arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return false;
		}
		LocType var4 = (LocType) arg1.list(arg0.getId());
		if (var4.members && !Client.loggedInMembers) {
			return false;
		}
		int var5 = var4.mapelement;
		if (var4.multiloc != null) {
			for (int var6 = 0; var6 < var4.multiloc.length; var6++) {
				if (var4.multiloc[var6] != -1) {
					LocType var7 = (LocType) arg1.list(var4.multiloc[var6]);
					if (var7.mapelement >= 0) {
						var5 = var7.mapelement;
					}
				}
			}
		}
		if (var5 < 0) {
			return false;
		}
		field726[field723] = var4.id;
		field725[field723] = arg2;
		field733[field723] = arg3;
		field723++;
		return true;
	}

	@ObfuscatedName("af.p(IIII)Z")
	public static boolean method1005(int arg0, int arg1, int arg2) {
		Scene var3 = Client.world.getScene();
		boolean var4 = true;
		Location var5 = (Location) var3.getWall(arg0, arg1, arg2);
		if (var5 != null) {
			var4 &= method17469(var5);
		}
		Location var6 = (Location) var3.getEntity(arg0, arg1, arg2, Client.field11001);
		if (var6 != null) {
			var4 &= method17469(var6);
		}
		Location var7 = (Location) var3.getGroundDecoration(arg0, arg1, arg2);
		if (var7 != null) {
			var4 &= method17469(var7);
		}
		return var4;
	}

	@ObfuscatedName("ajc.d(Lst;S)Z")
	public static boolean method17469(Location arg0) {
		LocType var1 = (LocType) Client.world.getLocTypeList().list(arg0.getId());
		if (var1.mapsceneicon == -1) {
			return true;
		} else {
			MSIType var2 = (MSIType) Client.msiTypeList.list(var1.mapsceneicon);
			return var2.field9151 == -1 ? true : var2.method15060();
		}
	}

	@ObfuscatedName("ix.c(Ldh;IIIIIIII)V")
	public static void method4476(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Scene var8 = Client.world.getScene();
		Location var9 = (Location) var8.getWall(arg1, arg2, arg3);
		if (var9 != null) {
			LocType var10 = (LocType) Client.world.getLocTypeList().list(var9.getId());
			int var11 = var9.getAngle() & 0x3;
			int var12 = var9.getShape();
			if (var10.mapsceneicon == -1) {
				int var13 = arg6;
				if (var10.active > 0) {
					var13 = arg7;
				}
				if (LocShape.WALL_STRAIGHT.id == var12 || LocShape.WALL_L.id == var12) {
					if (var11 == 0) {
						arg0.drawVerticalLine(arg4, arg5, 4, var13);
					} else if (var11 == 1) {
						arg0.drawHorizontalLine(arg4, arg5, 4, var13);
					} else if (var11 == 2) {
						arg0.drawVerticalLine(arg4 + 3, arg5, 4, var13);
					} else if (var11 == 3) {
						arg0.drawHorizontalLine(arg4, arg5 + 3, 4, var13);
					}
				}
				if (LocShape.WALL_SQUARE_CORNER.id == var12) {
					if (var11 == 0) {
						arg0.fillRectangle(arg4, arg5, 1, 1, var13);
					} else if (var11 == 1) {
						arg0.fillRectangle(arg4 + 3, arg5, 1, 1, var13);
					} else if (var11 == 2) {
						arg0.fillRectangle(arg4 + 3, arg5 + 3, 1, 1, var13);
					} else if (var11 == 3) {
						arg0.fillRectangle(arg4, arg5 + 3, 1, 1, var13);
					}
				}
				if (LocShape.WALL_L.id == var12) {
					if (var11 == 0) {
						arg0.drawHorizontalLine(arg4, arg5, 4, var13);
					} else if (var11 == 1) {
						arg0.drawVerticalLine(arg4 + 3, arg5, 4, var13);
					} else if (var11 == 2) {
						arg0.drawHorizontalLine(arg4, arg5 + 3, 4, var13);
					} else if (var11 == 3) {
						arg0.drawVerticalLine(arg4, arg5, 4, var13);
					}
				}
			} else {
				method1900(arg0, var10, var11, arg4, arg5);
			}
		}
		Location var14 = (Location) var8.getEntity(arg1, arg2, arg3, Client.field11001);
		if (var14 != null) {
			LocType var15 = (LocType) Client.world.getLocTypeList().list(var14.getId());
			int var16 = var14.getAngle() & 0x3;
			int var17 = var14.getShape();
			if (var15.mapsceneicon != -1) {
				method1900(arg0, var15, var16, arg4, arg5);
			} else if (LocShape.WALL_DIAGONAL.id == var17) {
				int var18 = -1118482;
				if (var15.active > 0) {
					var18 = -1179648;
				}
				if (var16 == 0 || var16 == 2) {
					arg0.drawLine(arg4, arg5 + 3, arg4 + 3, arg5, var18);
				} else {
					arg0.drawLine(arg4, arg5, arg4 + 3, arg5 + 3, var18);
				}
			}
		}
		Location var19 = (Location) var8.getGroundDecoration(arg1, arg2, arg3);
		if (var19 == null) {
			return;
		}
		LocType var20 = (LocType) Client.world.getLocTypeList().list(var19.getId());
		int var21 = var19.getAngle() & 0x3;
		if (var20.mapsceneicon != -1) {
			method1900(arg0, var20, var21, arg4, arg5);
		}
	}

	@ObfuscatedName("dz.r(Ldh;Lvd;IIII)V")
	public static void method1900(Toolkit arg0, LocType arg1, int arg2, int arg3, int arg4) {
		MSIType var5 = (MSIType) Client.msiTypeList.list(arg1.mapsceneicon);
		if (var5.field9151 == -1) {
			return;
		}
		int var7;
		if (arg1.mapsceneiconrotate) {
			int var6 = arg1.field7488 + arg2;
			var7 = var6 & 0x3;
		} else {
			var7 = 0;
		}
		Sprite var8 = var5.method15057(arg0, var7, arg1.mapsceneiconmirror);
		if (var8 == null) {
			return;
		}
		int var9 = arg1.width;
		int var10 = arg1.length;
		if ((var7 & 0x1) == 1) {
			var9 = arg1.length;
			var10 = arg1.width;
		}
		int var11 = var8.getX();
		int var12 = var8.getY();
		if (var5.field9152) {
			var11 = var9 * 4;
			var12 = var10 * 4;
		}
		if (var5.field9154 == 0) {
			var8.drawTintedScaled(arg3, arg4 - (var10 - 1) * 4, var11, var12);
		} else {
			var8.drawTintedScaled(arg3, arg4 - (var10 - 1) * 4, var11, var12, 0, var5.field9154 | 0xFF000000, 1);
		}
	}

	@ObfuscatedName("v.v(Ldh;Lhf;IIB)V")
	public static void drawMiniMap(Toolkit arg0, Component arg1, int arg2, int arg3) {
		if (Client.localPlayerEntity == null) {
			return;
		}
		arg0.flush();
		Graphic var4 = null;
		SpriteRelated var5 = null;
		if (arg1.type == 5) {
			var4 = arg1.method3970(arg0);
			if (var4 == null) {
				return;
			}
			var5 = var4.field2147;
			if (arg1.width != var4.field2144 || arg1.height != var4.field2146) {
				throw new IllegalStateException("");
			}
		}
		arg0.resetBounds(arg2, arg3, arg1.width + arg2, arg1.height + arg3);
		if (toggle == 2 || toggle == 5 || field734 == null) {
			if (var5 == null) {
				return;
			}
			arg0.method2206(-16777216, var5, arg2, arg3);
			return;
		}
		arg0.method2326(field721);
		arg0.method2263();
		CoordGrid var6 = Client.world.getBase();
		int var7;
		int var8;
		int var9;
		int var10;
		if (Client.cameraState == 4) {
			var7 = Client.field10892;
			var8 = Client.field10893;
			var9 = (int) -Client.orbitCameraYaw & 0x3FFF;
			var10 = 4096;
		} else {
			Vector3 var11 = Client.localPlayerEntity.getTransform().trans;
			var7 = (int) var11.x;
			var8 = (int) var11.z;
			if (Client.cameraState == 3) {
				var9 = (int) -((double) Client.cam2.method4719() * 2607.5945876176133D) + Client.minimapAnticheatAngle & 0x3FFF;
			} else {
				var9 = Client.minimapAnticheatAngle + (int) -Client.orbitCameraYaw & 0x3FFF;
			}
			var10 = 4096 - Client.minimapZoom * 16;
		}
		int var12 = var7 / 128 + 48;
		int var13 = Client.world.getSizeZ() * 4 + 48 - var8 / 128;
		if (var5 == null) {
			field734.method1453((float) arg1.width / 2.0F + (float) arg2, (float) arg1.height / 2.0F + (float) arg3, (float) var12, (float) var13, var10, var9 << 2, 1, -1, 1);
		} else {
			field734.method1456((float) arg1.width / 2.0F + (float) arg2, (float) arg1.height / 2.0F + (float) arg3, (float) var12, (float) var13, var10, var9 << 2, var5, arg2, arg3);
		}
		WorldMapRelated var14 = Client.world.method7871();
		for (IntNode var15 = (IntNode) field727.head(); var15 != null; var15 = (IntNode) field727.next()) {
			int var16 = var15.value;
			int var17 = (var14.field6776[var16] >> 14 & 0x3FFF) - var6.x;
			int var18 = (var14.field6776[var16] & 0x3FFF) - var6.z;
			int var19 = var17 * 4 + 2 - var7 / 128;
			int var20 = var18 * 4 + 2 - var8 / 128;
			method15085(arg0, var5, arg1, arg2, arg3, var19, var20, var14.field6775[var16]);
		}
		for (int var21 = 0; var21 < field723; var21++) {
			int var22 = field725[var21] * 4 + 2 - var7 / 128;
			int var23 = field733[var21] * 4 + 2 - var8 / 128;
			LocType var24 = (LocType) Client.world.getLocTypeList().list(field726[var21]);
			if (var24.multiloc != null) {
				var24 = var24.getMultiLoc(Client.localPlayerGameState, Client.localPlayerGameState);
				if (var24 == null || var24.mapelement == -1) {
					continue;
				}
			}
			method15085(arg0, var5, arg1, arg2, arg3, var22, var23, var24.mapelement);
		}
		for (ObjStackList var25 = (ObjStackList) Client.objStacks.head(); var25 != null; var25 = (ObjStackList) Client.objStacks.next()) {
			int var26 = (int) (var25.nodeId >> 28 & 0x3L);
			if (field722 == var26) {
				int var27 = (int) (var25.nodeId & 0x3FFFL) - var6.x;
				int var28 = (int) (var25.nodeId >> 14 & 0x3FFFL) - var6.z;
				int var29 = var27 * 4 + 2 - var7 / 128;
				int var30 = var28 * 4 + 2 - var8 / 128;
				drawOnMinimap(arg1, var5, arg2, arg3, var29, var30, DefaultSprites.mapdotsSprites[0]);
			}
		}
		drawNpcsOnMinimap(arg0, var7, var8, arg1, var5, arg2, arg3);
		drawPlayersOnMinimap(var7, var8, arg1, var5, arg2, arg3);
		drawHintArrowsOnMinimap(var7, var8, arg1, var4, arg2, arg3);
		if (Client.cameraState != 4) {
			if (flagSceneTileX != -1) {
				int var31 = flagSceneTileX * 4 + 2 - var7 / 128 + (Client.localPlayerEntity.size() - 1) * 2;
				int var32 = flagSceneTileZ * 4 + 2 - var8 / 128 + (Client.localPlayerEntity.size() - 1) * 2;
				drawOnMinimap(arg1, var5, arg2 - DefaultSprites.field11888, arg3 - DefaultSprites.field10232, var31, var32, DefaultSprites.mapflagSprites[mapFlag ? 1 : 0], 100.0D, MapAlignmentX.field2420, MapAlignmentY.field2426);
			}
			if (!Client.localPlayerEntity.visibility.isNotVisible()) {
				arg0.fillRectangle(arg1.width / 2 + arg2 - 1, arg1.height / 2 + arg3 - 1, 3, 3, -1);
			}
		}
		arg0.method2164(field721[0], field721[1], field721[2], field721[3]);
	}

	@ObfuscatedName("je.o(Ldh;IILhf;Lch;IIB)V")
	public static void drawNpcsOnMinimap(Toolkit arg0, int arg1, int arg2, Component arg3, SpriteRelated arg4, int arg5, int arg6) {
		for (int var7 = 0; var7 < Client.npcSlotCount; var7++) {
			ObjectNode var8 = (ObjectNode) Client.npcs.get((long) Client.field11036[var7]);
			if (var8 != null) {
				NpcEntity var9 = (NpcEntity) var8.value;
				if (var9.exists() && Client.localPlayerEntity.level == var9.level) {
					NPCType var10 = var9.npcType;
					if (var10 != null && var10.multinpc != null) {
						var10 = var10.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
					}
					if (var10 != null && var10.minimap && var10.active) {
						Vector3 var11 = var9.getTransform().trans;
						int var12 = (int) var11.x / 128 - arg1 / 128;
						int var13 = (int) var11.z / 128 - arg2 / 128;
						if (var10.mapelement == -1) {
							drawOnMinimap(arg3, arg4, arg5, arg6, var12, var13, DefaultSprites.mapdotsSprites[1]);
						} else {
							method15085(arg0, arg4, arg3, arg5, arg6, var12, var13, var10.mapelement);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aff.s(IILhf;Lch;III)V")
	public static void drawPlayersOnMinimap(int arg0, int arg1, Component arg2, SpriteRelated arg3, int arg4, int arg5) {
		int var6 = ReceivePlayerPositions.highResolutionsCount;
		int[] var7 = ReceivePlayerPositions.highResolutionsIndices;
		for (int var8 = 0; var8 < var6; var8++) {
			PlayerEntity var9 = Client.players[var7[var8]];
			if (var9 != null && var9.method19119() && !var9.visibility.isNotVisible() && Client.localPlayerEntity != var9 && Client.localPlayerEntity.level == var9.level) {
				Vector3 var10 = var9.getTransform().trans;
				int var11 = (int) var10.x / 128 - arg0 / 128;
				int var12 = (int) var10.z / 128 - arg1 / 128;
				boolean var13 = false;
				for (int var14 = 0; var14 < Client.friendsCount; var14++) {
					Friend var15 = Client.friends[var14];
					if (var9.nameUnfiltered.equals(var15.field606) && var15.worldId != 0) {
						var13 = true;
						break;
					}
				}
				boolean var16 = false;
				for (int var17 = 0; var17 < Client.clanChatCount; var17++) {
					if (var9.nameUnfiltered.equals(Client.clanChatUsers[var17].nameUnfiltered)) {
						var16 = true;
						break;
					}
				}
				boolean var18 = false;
				if (Client.localPlayerEntity.field12060 != 0 && var9.field12060 != 0 && Client.localPlayerEntity.field12060 == var9.field12060) {
					var18 = true;
				}
				if (var9.model != null && var9.model.field7892 != -1 && ((NPCType) Client.npcTypeList.list(var9.model.field7892)).transmogfakenpc) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[1]);
				} else if (CommunityPartnerType.field1947 == var9.field12070) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[8]);
				} else if (CommunityPartnerType.field1948 == var9.field12070) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[6]);
				} else if (var18) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[4]);
				} else if (var13) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[3]);
				} else if (var9.field12048) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[7]);
				} else if (var16) {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[5]);
				} else {
					drawOnMinimap(arg2, arg3, arg4, arg5, var11, var12, DefaultSprites.mapdotsSprites[2]);
				}
			}
		}
	}

	@ObfuscatedName("ia.y(IILhf;Lhx;IIS)V")
	public static void drawHintArrowsOnMinimap(int arg0, int arg1, Component arg2, Graphic arg3, int arg4, int arg5) {
		HintArrow[] var6 = Client.hintArrows;
		for (int var7 = 0; var7 < var6.length; var7++) {
			HintArrow var8 = var6[var7];
			if (var8 != null && var8.hintType != 0 && Client.loopCycle % 20 < 10) {
				if (var8.hintType == 1) {
					ObjectNode var9 = (ObjectNode) Client.npcs.get((long) var8.field744);
					if (var9 != null) {
						NpcEntity var10 = (NpcEntity) var9.value;
						Vector3 var11 = var10.getTransform().trans;
						int var12 = (int) var11.x / 128 - arg0 / 128;
						int var13 = (int) var11.z / 128 - arg1 / 128;
						method15035(arg2, arg3, arg4, arg5, var12, var13, var8.field751, 360000L);
					}
				}
				if (var8.hintType == 2) {
					int var14 = var8.hintOffsetX / 128 - arg0 / 128;
					int var15 = var8.hintOffsetZ / 128 - arg1 / 128;
					long var16 = (long) (var8.field748 << 7);
					long var18 = var16 * var16;
					method15035(arg2, arg3, arg4, arg5, var14, var15, var8.field751, var18);
				}
				if (var8.hintType == 10 && var8.field744 >= 0 && var8.field744 < Client.players.length) {
					PlayerEntity var20 = Client.players[var8.field744];
					if (var20 != null) {
						Vector3 var21 = var20.getTransform().trans;
						int var22 = (int) var21.x / 128 - arg0 / 128;
						int var23 = (int) var21.z / 128 - arg1 / 128;
						method15035(arg2, arg3, arg4, arg5, var22, var23, var8.field751, 360000L);
					}
				}
			}
		}
	}

	@ObfuscatedName("ace.q(Ldh;Lch;Lhf;IIIIIB)V")
	public static void method15085(Toolkit arg0, SpriteRelated arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		MapElementType var8 = (MapElementType) Client.mapElementTypeList.list(arg7);
		if (var8 != null && var8.field2392 != null && var8.method4030(Client.localPlayerGameState, Client.localPlayerGameState)) {
			var8 = var8.method4024(Client.localPlayerGameState, Client.localPlayerGameState);
		}
		if (var8 == null || !var8.field2404 || !var8.method4030(Client.localPlayerGameState, Client.localPlayerGameState)) {
			return;
		}
		if (var8.field2393 != null) {
			int[] var9 = new int[var8.field2393.length];
			for (int var10 = 0; var10 < var9.length / 2; var10++) {
				int var11;
				if (Client.cameraState == 3) {
					var11 = (int) ((double) Client.cam2.method4719() * 2607.5945876176133D) + Client.minimapAnticheatAngle & 0x3FFF;
				} else if (Client.cameraState == 4) {
					var11 = (int) Client.orbitCameraYaw & 0x3FFF;
				} else {
					var11 = Client.minimapAnticheatAngle + (int) Client.orbitCameraYaw & 0x3FFF;
				}
				int var12 = Trig1.sin[var11];
				int var13 = Trig1.cos[var11];
				if (Client.cameraState != 4) {
					var12 = var12 * 256 / (Client.minimapZoom + 256);
					var13 = var13 * 256 / (Client.minimapZoom + 256);
				}
				var9[var10 * 2] = ((var8.field2393[var10 * 2] * 4 + arg5) * var13 + (var8.field2393[var10 * 2 + 1] * 4 + arg6) * var12 >> 14) + arg2.width / 2 + arg3;
				var9[var10 * 2 + 1] = arg2.height / 2 + arg4 - ((var8.field2393[var10 * 2 + 1] * 4 + arg6) * var13 - (var8.field2393[var10 * 2] * 4 + arg5) * var12 >> 14);
			}
			Graphic var14 = arg2.method3970(arg0);
			if (var14 != null) {
				WorldMapRelated2.method2054(arg0, var9, var8.field2398, var14.field2143, var14.field2145);
			}
			if (var8.field2399 > 0) {
				for (int var15 = 0; var15 < var9.length / 2 - 1; var15++) {
					int var16 = var9[var15 * 2];
					int var17 = var9[var15 * 2 + 1];
					int var18 = var9[(var15 + 1) * 2];
					int var19 = var9[(var15 + 1) * 2 + 1];
					if (var18 < var16) {
						int var20 = var16;
						int var21 = var17;
						var16 = var18;
						var17 = var19;
						var18 = var20;
						var19 = var21;
					} else if (var16 == var18 && var19 < var17) {
						int var22 = var17;
						var17 = var19;
						var19 = var22;
					}
					if (arg1 == null) {
						arg0.method2187(var16, var17, var18, var19, var8.field2406[var8.field2407[var15] & 0xFF], 1, var8.field2399, var8.field2369, var8.field2401);
					} else {
						arg0.method2537(var16, var17, var18, var19, var8.field2406[var8.field2407[var15] & 0xFF], 1, arg1, arg3, arg4, var8.field2399, var8.field2369, var8.field2401);
					}
				}
				int var23 = var9[var9.length - 2];
				int var24 = var9[var9.length - 1];
				int var25 = var9[0];
				int var26 = var9[1];
				if (var25 < var23) {
					int var27 = var23;
					int var28 = var24;
					var23 = var25;
					var24 = var26;
					var25 = var27;
					var26 = var28;
				} else if (var23 == var25 && var26 < var24) {
					int var29 = var24;
					var24 = var26;
					var26 = var29;
				}
				if (arg1 == null) {
					arg0.method2187(var23, var24, var25, var26, var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1, var8.field2399, var8.field2369, var8.field2401);
				} else {
					arg0.method2537(var23, var24, var25, var26, var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1, arg1, arg3, arg4, var8.field2399, var8.field2369, var8.field2401);
				}
			} else if (arg1 == null) {
				for (int var31 = 0; var31 < var9.length / 2 - 1; var31++) {
					arg0.drawLine(var9[var31 * 2], var9[var31 * 2 + 1], var9[(var31 + 1) * 2], var9[(var31 + 1) * 2 + 1], var8.field2406[var8.field2407[var31] & 0xFF], 1);
				}
				arg0.drawLine(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1);
			} else {
				for (int var30 = 0; var30 < var9.length / 2 - 1; var30++) {
					arg0.method2183(var9[var30 * 2], var9[var30 * 2 + 1], var9[(var30 + 1) * 2], var9[(var30 + 1) * 2 + 1], var8.field2406[var8.field2407[var30] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method2183(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		Sprite var32 = null;
		if (var8.sprite != -1) {
			var32 = var8.method4025(arg0, false);
			if (var32 != null) {
				int var33 = var8.field2408 > 0 ? var8.field2408 : Client.graphicsDefaults.field7730;
				drawOnMinimap(arg2, arg1, arg3, arg4, arg5, arg6, var32, (double) var33, var8.field2365, var8.field2405);
			}
		}
		if (var8.text == null) {
			return;
		}
		int var34 = 0;
		if (var32 != null) {
			var34 = var32.getHeight();
		}
		Font var35 = DefaultSprites.p11FullFont;
		FontMetrics var36 = DefaultSprites.p11FullMetrics;
		if (var8.textSize == 1) {
			var35 = DefaultSprites.p12FullFont;
			var36 = DefaultSprites.p12FullMetrics;
		}
		if (var8.textSize == 2) {
			var35 = DefaultSprites.b12FullFont;
			var36 = DefaultSprites.b12FullMetrics;
		}
		method3654(arg2, arg1, arg3, arg4, arg5, arg6, var34, var8.text, var35, var36, var8.field2366);
	}

	@ObfuscatedName("acp.x(Lhf;Lhx;IIIIIJ)V")
	public static void method15035(Component arg0, Graphic arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
		int var9 = arg4 * arg4 + arg5 * arg5;
		if ((long) var9 > arg7) {
			return;
		}
		int var10;
		if (Client.cameraState == 3) {
			var10 = (int) ((double) Client.cam2.method4719() * 2607.5945876176133D) + Client.minimapAnticheatAngle & 0x3FFF;
		} else if (Client.cameraState == 4) {
			var10 = (int) Client.orbitCameraYaw & 0x3FFF;
		} else {
			var10 = Client.minimapAnticheatAngle + (int) Client.orbitCameraYaw & 0x3FFF;
		}
		int var11 = Trig1.sin[var10];
		int var12 = Trig1.cos[var10];
		if (Client.cameraState != 4) {
			var11 = var11 * 256 / (Client.minimapZoom + 256);
			var12 = var12 * 256 / (Client.minimapZoom + 256);
		}
		int var13 = arg4 * var12 + arg5 * var11 >> 14;
		int var14 = arg5 * var12 - arg4 * var11 >> 14;
		Sprite var15 = DefaultSprites.field513[arg6];
		int var16 = var15.getWidth();
		int var17 = var15.getHeight();
		int var18 = arg0.width / 2 + var13 - var16 / 2;
		int var19 = var16 + var18;
		int var20 = arg0.height / 2 + -var14 - var17;
		int var21 = var17 + var20;
		boolean var22;
		if (arg1 == null) {
			int var24 = var16 / 2;
			var22 = var20 <= -var17 || var21 >= arg0.height || var18 <= -var24 || var19 >= arg0.width + var24;
		} else {
			var22 = !arg1.method3914(var18, var20) || !arg1.method3914(var19, var20) || !arg1.method3914(var18, var21) || !arg1.method3914(var19, var21);
		}
		if (var22) {
			double var25 = Math.atan2((double) var13, (double) var14);
			double var27 = Math.atan2((double) Math.abs(var13), (double) Math.abs(var14));
			double var29 = Math.atan2((double) (arg0.width / 2), (double) (arg0.height / 2));
			boolean var31 = false;
			double var32 = 0.0D;
			double var34;
			int var36;
			if (var27 < var29) {
				var34 = 1.5707963267948966D - var25;
				var36 = arg0.height / 2;
			} else {
				var34 = var25;
				var36 = arg0.width / 2;
			}
			int var37 = Math.abs((int) -((double) var36 * Math.sin(1.5707963267948966D) / Math.sin(var34)));
			DefaultSprites.field6719[arg6].method1450((float) arg0.width / 2.0F + (float) arg2 + 0.0F, (float) arg0.height / 2.0F + (float) arg3 - 0.0F, (float) DefaultSprites.field6719[arg6].getX() / 2.0F, (float) var37, 4096, (int) (-var25 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			var15.drawSprite(arg2 + var18, arg3 + var20);
		} else {
			var15.method1444(arg2 + var18, arg3 + var20, arg1.field2147, arg2, arg3);
		}
	}

	@ObfuscatedName("al.b(Lhf;Lch;IIIILcm;I)V")
	public static void drawOnMinimap(Component arg0, SpriteRelated arg1, int arg2, int arg3, int arg4, int arg5, Sprite arg6) {
		drawOnMinimap(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, MapAlignmentX.field2417, MapAlignmentY.field2424);
	}

	@ObfuscatedName("ht.h(Lhf;Lch;IIIILcm;DLhp;Lhy;I)V")
	public static void drawOnMinimap(Component arg0, SpriteRelated arg1, int arg2, int arg3, int arg4, int arg5, Sprite arg6, double arg7, MapAlignmentX arg8, MapAlignmentY arg9) {
		if (arg6 == null) {
			return;
		}
		int var11;
		if (Client.cameraState == 3) {
			var11 = (int) ((double) Client.cam2.method4719() * 2607.5945876176133D) + Client.minimapAnticheatAngle & 0x3FFF;
		} else if (Client.cameraState == 4) {
			var11 = (int) Client.orbitCameraYaw & 0x3FFF;
		} else {
			var11 = Client.minimapAnticheatAngle + (int) Client.orbitCameraYaw & 0x3FFF;
		}
		int var12 = Math.max(arg0.width / 2, arg0.height / 2) + 10;
		int var13 = arg4 * arg4 + arg5 * arg5;
		if (var13 > var12 * var12) {
			return;
		}
		int var14 = Trig1.sin[var11];
		int var15 = Trig1.cos[var11];
		if (Client.cameraState != 4) {
			var14 = var14 * 256 / (Client.minimapZoom + 256);
			var15 = var15 * 256 / (Client.minimapZoom + 256);
		}
		int var16 = arg4 * var15 + arg5 * var14 >> 14;
		int var17 = arg5 * var15 - arg4 * var14 >> 14;
		double var18 = arg7 / 100.0D;
		switch(arg8.index) {
			case 0:
				arg2 = arg0.width / 2 + arg2 + var16 - (int) ((double) arg6.getX() * var18);
				break;
			case 1:
				arg2 = arg0.width / 2 + arg2 + var16;
				break;
			case 2:
				arg2 = arg0.width / 2 + arg2 + var16 - (int) ((double) (arg6.getX() / 2) * var18);
		}
		switch(arg9.index) {
			case 0:
				arg3 = arg0.height / 2 + arg3 - var17 - (int) ((double) arg6.getY() * var18);
				break;
			case 1:
				arg3 = arg0.height / 2 + arg3 - var17;
				break;
			case 2:
				arg3 = arg0.height / 2 + arg3 - var17 - (int) ((double) (arg6.getY() / 2) * var18);
		}
		if (arg1 == null) {
			if (var18 == 1.0D) {
				arg6.drawSprite(arg2, arg3);
			}
			arg6.drawTintedScaled(arg2, arg3, (int) ((double) arg6.getX() * var18), (int) ((double) arg6.getY() * var18));
		} else if (var18 == 1.0D) {
			arg6.method1444(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.drawTintedScaled(arg2, arg3, (int) ((double) arg6.getX() * var18), (int) ((double) arg6.getY() * var18));
		}
	}

	@ObfuscatedName("gd.a(Lhf;Lch;IIIIILjava/lang/String;Leu;Laac;II)V")
	public static void method3654(Component arg0, SpriteRelated arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, Font arg8, FontMetrics arg9, int arg10) {
		int var11;
		if (Client.cameraState == 3) {
			var11 = (int) ((double) Client.cam2.method4719() * 2607.5945876176133D) + Client.minimapAnticheatAngle & 0x3FFF;
		} else if (Client.cameraState == 4) {
			var11 = (int) Client.orbitCameraYaw & 0x3FFF;
		} else {
			var11 = Client.minimapAnticheatAngle + (int) Client.orbitCameraYaw & 0x3FFF;
		}
		int var12 = Math.max(arg0.width / 2, arg0.height / 2) + 10;
		int var13 = arg4 * arg4 + arg5 * arg5;
		if (var13 > var12 * var12) {
			return;
		}
		int var14 = Trig1.sin[var11];
		int var15 = Trig1.cos[var11];
		if (Client.cameraState != 4) {
			var14 = var14 * 256 / (Client.minimapZoom + 256);
			var15 = var15 * 256 / (Client.minimapZoom + 256);
		}
		int var16 = arg4 * var15 + arg5 * var14 >> 14;
		int var17 = arg5 * var15 - arg4 * var14 >> 14;
		int var18 = arg9.parawidth(arg7, 100, null);
		int var19 = arg9.paraheight(arg7, 100, 0, null);
		int var20 = var16 - var18 / 2;
		if (var20 >= -arg0.width && var20 <= arg0.width && var17 >= -arg0.height && var17 <= arg0.height) {
			arg8.drawStringTaggable(arg7, arg0.width / 2 + arg2 + var20, arg0.height / 2 + arg3 - var17 - arg6 - var19, var18, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("abb.g(IIZB)V")
	public static void method14707(int arg0, int arg1, boolean arg2) {
		field8182[arg0][arg1] = arg2;
	}
}
