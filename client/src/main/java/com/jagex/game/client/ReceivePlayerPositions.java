package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.utils.VarValue;
import com.jagex.game.camera.LookatEntity;
import com.jagex.game.camera.LookatMode;
import com.jagex.game.camera.position.PositionEntity;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.game.script.CommunityPartnerType;
import com.jagex.game.shared.framework.chat.ChatCrownType;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.PlayerEntity;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.game.world.entity.PositionedSound;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.chat.ChatHistory;

@ObfuscatedName("aw")
public class ReceivePlayerPositions {

	@ObfuscatedName("aw.m")
	public static byte[] nsn = new byte[2048];

	@ObfuscatedName("aw.k")
	public static byte[] speeds = new byte[2048];

	@ObfuscatedName("aw.f")
	public static Packet[] appearances = new Packet[2048];

	@ObfuscatedName("aw.w")
	public static Packet[] headIcons = new Packet[2048];

	@ObfuscatedName("aw.l")
	public static int highResolutionsCount = 0;

	@ObfuscatedName("aw.u")
	public static int[] highResolutionsIndices = new int[2048];

	@ObfuscatedName("aw.z")
	public static int lowResolutionsCount = 0;

	@ObfuscatedName("aw.p")
	public static int[] lowResolutionsIndices = new int[2048];

	@ObfuscatedName("aw.d")
	public static LowResPlayerInfo[] lowResolutions = new LowResPlayerInfo[2048];

	@ObfuscatedName("aw.c")
	public static int entityUpdateCount = 0;

	@ObfuscatedName("aw.r")
	public static int[] entityUpdateIds = new int[2048];

	public ReceivePlayerPositions() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aga.e(Lase;I)V")
	public static final void receivePlayerPositions(PacketBit arg0) {
		arg0.accessBits();
		int var1 = Client.currentPlayerUid;
		PlayerEntity var2 = Client.localPlayerEntity = Client.players[var1] = new PlayerEntity(Client.world.getScene());
		var2.localPlayerIndex = var1;
		int var3 = arg0.gBit(30);
		byte var4 = (byte) (var3 >> 28);
		int var5 = var3 >> 14 & 0x3FFF;
		int var6 = var3 & 0x3FFF;
		CoordGrid var7 = Client.world.getBase();
		var2.routeWaypointX[0] = var5 - var7.x;
		var2.routeWaypointZ[0] = var6 - var7.z;
		var2.setPosition((float) ((var2.routeWaypointX[0] << 9) + (var2.size() << 8)), var2.method10525().trans.y, (float) ((var2.routeWaypointZ[0] << 9) + (var2.size() << 8)));
		Client.currentPlayerLevel = var2.level = var2.occludeLevel = var4;
		if (Client.world.getSceneLevelTileFlags().isLinkBelow(var2.routeWaypointX[0], var2.routeWaypointZ[0])) {
			var2.occludeLevel++;
		}
		if (appearances[var1] != null) {
			var2.getAppearance(appearances[var1]);
		}
		if (headIcons[var1] != null) {
			var2.getHeadIcons(headIcons[var1]);
		}
		highResolutionsCount = 0;
		highResolutionsIndices[++highResolutionsCount - 1] = var1;
		nsn[var1] = 0;
		lowResolutionsCount = 0;
		for (int var8 = 1; var8 < 2048; var8++) {
			if (var1 != var8) {
				int var9 = arg0.gBit(18);
				int var10 = var9 >> 16 & 0x3;
				int var11 = var9 >> 8 & 0xFF;
				int var12 = var9 & 0xFF;
				LowResPlayerInfo var13 = lowResolutions[var8] = new LowResPlayerInfo();
				var13.coord = (var10 << 28) + (var11 << 14) + var12;
				var13.field523 = 0;
				var13.field522 = -1;
				var13.field525 = CommunityPartnerType.field1950;
				var13.field526 = false;
				lowResolutionsIndices[++lowResolutionsCount - 1] = var8;
				nsn[var8] = 0;
			}
		}
		arg0.accessBytes();
		PositionMode var14 = Client.cam2.getPositionMode();
		if (PositionMode.ENTITY == var14) {
			PositionEntity var15 = (PositionEntity) Client.cam2.getPosition();
			var15.method16684();
		}
		LookatMode var16 = Client.cam2.getLookatMode();
		if (LookatMode.ENTITY == var16) {
			LookatEntity var17 = (LookatEntity) Client.cam2.getLookat();
			var17.method18815();
		}
	}

	@ObfuscatedName("sj.n(Lase;II)V")
	public static final void readPlayerInfo(PacketBit arg0, int arg1) {
		entityUpdateCount = 0;
		readPlayers(arg0);
		readPlayerUpdates(arg0);
		if (arg0.pos != arg1) {
			throw new RuntimeException(arg0.pos + " " + arg1);
		}
	}

	@ObfuscatedName("ka.m(Lase;I)V")
	public static final void readPlayers(PacketBit arg0) {
		int var1 = 0;
		arg0.accessBits();
		for (int var2 = 0; var2 < highResolutionsCount; var2++) {
			int var3 = highResolutionsIndices[var2];
			if ((nsn[var3] & 0x1) == 0) {
				if (var1 > 0) {
					var1--;
					nsn[var3] = (byte) (nsn[var3] | 0x2);
				} else {
					int var4 = arg0.gBit(1);
					if (var4 == 0) {
						var1 = skip(arg0);
						nsn[var3] = (byte) (nsn[var3] | 0x2);
					} else {
						readHighResolution(arg0, var3);
					}
				}
			}
		}
		arg0.accessBytes();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits();
		for (int var5 = 0; var5 < highResolutionsCount; var5++) {
			int var6 = highResolutionsIndices[var5];
			if ((nsn[var6] & 0x1) != 0) {
				if (var1 > 0) {
					var1--;
					nsn[var6] = (byte) (nsn[var6] | 0x2);
				} else {
					int var7 = arg0.gBit(1);
					if (var7 == 0) {
						var1 = skip(arg0);
						nsn[var6] = (byte) (nsn[var6] | 0x2);
					} else {
						readHighResolution(arg0, var6);
					}
				}
			}
		}
		arg0.accessBytes();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits();
		for (int var8 = 0; var8 < lowResolutionsCount; var8++) {
			int var9 = lowResolutionsIndices[var8];
			if ((nsn[var9] & 0x1) != 0) {
				if (var1 > 0) {
					var1--;
					nsn[var9] = (byte) (nsn[var9] | 0x2);
				} else {
					int var10 = arg0.gBit(1);
					if (var10 == 0) {
						var1 = skip(arg0);
						nsn[var9] = (byte) (nsn[var9] | 0x2);
					} else if (readLowResolution(arg0, var9)) {
						nsn[var9] = (byte) (nsn[var9] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits();
		for (int var11 = 0; var11 < lowResolutionsCount; var11++) {
			int var12 = lowResolutionsIndices[var11];
			if ((nsn[var12] & 0x1) == 0) {
				if (var1 > 0) {
					var1--;
					nsn[var12] = (byte) (nsn[var12] | 0x2);
				} else {
					int var13 = arg0.gBit(1);
					if (var13 == 0) {
						var1 = skip(arg0);
						nsn[var12] = (byte) (nsn[var12] | 0x2);
					} else if (readLowResolution(arg0, var12)) {
						nsn[var12] = (byte) (nsn[var12] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		highResolutionsCount = 0;
		lowResolutionsCount = 0;
		for (int var14 = 1; var14 < 2048; var14++) {
			nsn[var14] = (byte) (nsn[var14] >> 1);
			PlayerEntity var15 = Client.players[var14];
			if (var15 == null) {
				lowResolutionsIndices[++lowResolutionsCount - 1] = var14;
			} else {
				highResolutionsIndices[++highResolutionsCount - 1] = var14;
			}
		}
	}

	@ObfuscatedName("ck.k(Lase;I)I")
	public static int skip(PacketBit arg0) {
		int var1 = arg0.gBit(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = arg0.gBit(5);
		} else if (var1 == 2) {
			var2 = arg0.gBit(8);
		} else {
			var2 = arg0.gBit(11);
		}
		return var2;
	}

	@ObfuscatedName("akz.f(Lase;IS)V")
	public static void readHighResolution(PacketBit arg0, int arg1) {
		CoordGrid var2 = Client.world.getBase();
		boolean var3 = arg0.gBit(1) == 1;
		if (var3) {
			entityUpdateIds[++entityUpdateCount - 1] = arg1;
		}
		int var4 = arg0.gBit(2);
		PlayerEntity var5 = Client.players[arg1];
		if (var4 == 0) {
			if (!var3) {
				if (Client.currentPlayerUid == arg1) {
					throw new RuntimeException();
				}
				LowResPlayerInfo var6 = lowResolutions[arg1] = new LowResPlayerInfo();
				MoveSpeed.values();
				var6.coord = (var2.z + var5.routeWaypointZ[0] >> 6) + (var2.x + var5.routeWaypointX[0] >> 6 << 14) + (var5.level << 28);
				if (var5.field12056 == -1) {
					var6.field523 = var5.field10395.method316();
				} else {
					var6.field523 = var5.field12056;
				}
				var6.field522 = var5.targetId;
				var6.field525 = var5.field12070;
				var6.field526 = var5.field12048;
				if (var5.bgsound_range > 0) {
					PositionedSound.method5142(var5);
				}
				Client.players[arg1] = null;
				if (arg0.gBit(1) != 0) {
					readLowResolution(arg0, arg1);
				}
			}
		} else if (var4 == 1) {
			int var7 = arg0.gBit(3);
			int var8 = arg0.gBit(1);
			int var9 = var5.routeWaypointX[0];
			int var10 = var5.routeWaypointZ[0];
			if (var8 == 1) {
				speeds[arg1] = MoveSpeed.RUN.serialID;
				int var11 = arg0.gBit(2);
				switch(var11) {
					case 0:
						var5.movePlayer(var9, var10 + 1, speeds[arg1]);
						break;
					case 1:
						var5.movePlayer(var9 - 1, var10, speeds[arg1]);
						break;
					case 2:
						var5.movePlayer(var9 + 1, var10, speeds[arg1]);
						break;
					case 3:
						var5.movePlayer(var9, var10 - 1, speeds[arg1]);
				}
			}
			if (var7 == 0) {
				var9--;
				var10--;
			} else if (var7 == 1) {
				var10--;
			} else if (var7 == 2) {
				var9++;
				var10--;
			} else if (var7 == 3) {
				var9--;
			} else if (var7 == 4) {
				var9++;
			} else if (var7 == 5) {
				var9--;
				var10++;
			} else if (var7 == 6) {
				var10++;
			} else if (var7 == 7) {
				var9++;
				var10++;
			}
			var5.movePlayer(var9, var10, speeds[arg1]);
		} else if (var4 == 2) {
			int var12 = arg0.gBit(4);
			int var13 = var5.routeWaypointX[0];
			int var14 = var5.routeWaypointZ[0];
			if (var12 == 0) {
				var13 -= 2;
				var14 -= 2;
			} else if (var12 == 1) {
				var13--;
				var14 -= 2;
			} else if (var12 == 2) {
				var14 -= 2;
			} else if (var12 == 3) {
				var13++;
				var14 -= 2;
			} else if (var12 == 4) {
				var13 += 2;
				var14 -= 2;
			} else if (var12 == 5) {
				var13 -= 2;
				var14--;
			} else if (var12 == 6) {
				var13 += 2;
				var14--;
			} else if (var12 == 7) {
				var13 -= 2;
			} else if (var12 == 8) {
				var13 += 2;
			} else if (var12 == 9) {
				var13 -= 2;
				var14++;
			} else if (var12 == 10) {
				var13 += 2;
				var14++;
			} else if (var12 == 11) {
				var13 -= 2;
				var14 += 2;
			} else if (var12 == 12) {
				var13--;
				var14 += 2;
			} else if (var12 == 13) {
				var14 += 2;
			} else if (var12 == 14) {
				var13++;
				var14 += 2;
			} else if (var12 == 15) {
				var13 += 2;
				var14 += 2;
			}
			var5.movePlayer(var13, var14, speeds[arg1]);
		} else {
			int var15 = arg0.gBit(1);
			if (var15 == 0) {
				int var16 = arg0.gBit(15);
				int var17 = var16 >> 12 & 0x7;
				int var18 = (byte) (var16 >> 10) & 0x3;
				int var19 = var16 >> 5 & 0x1F;
				if (var19 > 15) {
					var19 -= 32;
				}
				int var20 = var16 & 0x1F;
				if (var20 > 15) {
					var20 -= 32;
				}
				int var21 = var5.routeWaypointX[0] + var19;
				int var22 = var5.routeWaypointZ[0] + var20;
				if (MoveSpeed.INSTANT.index == var17) {
					var5.tele(var21, var22);
				} else {
					speeds[arg1] = (byte) (var17 - 1);
					var5.movePlayer(var21, var22, speeds[arg1]);
				}
				var5.level = var5.occludeLevel = (byte) (var5.level + var18 & 0x3);
				if (Client.world.getSceneLevelTileFlags().isLinkBelow(var21, var22)) {
					var5.occludeLevel++;
				}
				if (Client.currentPlayerUid == arg1 && Client.currentPlayerLevel != var5.level) {
					Client.currentPlayerLevel = var5.level;
				}
			} else {
				int var23 = arg0.gBit(3);
				int var24 = arg0.gBit(30);
				int var25 = var24 >> 28 & 0x3;
				int var26 = var24 >> 14 & 0x3FFF;
				int var27 = var24 & 0x3FFF;
				int var28 = (var2.x + var5.routeWaypointX[0] + var26 & 0x3FFF) - var2.x;
				int var29 = (var2.z + var5.routeWaypointZ[0] + var27 & 0x3FFF) - var2.z;
				if (MoveSpeed.INSTANT.index == var23) {
					var5.tele(var28, var29);
				} else {
					speeds[arg1] = (byte) (var23 - 1);
					var5.movePlayer(var28, var29, speeds[arg1]);
				}
				var5.level = var5.occludeLevel = (byte) (var5.level + var25 & 0x3);
				if (Client.world.getSceneLevelTileFlags().isLinkBelow(var28, var29)) {
					var5.occludeLevel++;
				}
				if (Client.currentPlayerUid == arg1) {
					Client.currentPlayerLevel = var5.level;
				}
			}
		}
	}

	@ObfuscatedName("aap.w(Lase;II)Z")
	public static boolean readLowResolution(PacketBit arg0, int arg1) {
		int var2 = arg0.gBit(2);
		if (var2 == 0) {
			if (arg0.gBit(1) != 0) {
				readLowResolution(arg0, arg1);
			}
			int var3 = arg0.gBit(6);
			int var4 = arg0.gBit(6);
			boolean var5 = arg0.gBit(1) == 1;
			if (var5) {
				entityUpdateIds[++entityUpdateCount - 1] = arg1;
			}
			if (Client.players[arg1] != null) {
				throw new RuntimeException();
			}
			LowResPlayerInfo var6 = lowResolutions[arg1];
			PlayerEntity var7 = Client.players[arg1] = new PlayerEntity(Client.world.getScene());
			var7.localPlayerIndex = arg1;
			if (appearances[arg1] != null) {
				var7.getAppearance(appearances[arg1]);
			}
			if (headIcons[arg1] != null) {
				var7.getHeadIcons(headIcons[arg1]);
			}
			var7.method16491(var6.field523, true);
			var7.targetId = var6.field522;
			int var8 = var6.coord;
			int var9 = var8 >> 28;
			int var10 = var8 >> 14 & 0xFF;
			int var11 = var8 & 0xFF;
			CoordGrid var12 = Client.world.getBase();
			int var13 = (var10 << 6) + var3 - var12.x;
			int var14 = (var11 << 6) + var4 - var12.z;
			var7.field12070 = var6.field525;
			var7.field12048 = var6.field526;
			var7.routeSpeeds[0] = speeds[arg1];
			var7.level = var7.occludeLevel = (byte) var9;
			if (Client.world.getSceneLevelTileFlags().isLinkBelow(var13, var14)) {
				var7.occludeLevel++;
			}
			var7.tele(var13, var14);
			lowResolutions[arg1] = null;
			return true;
		} else if (var2 == 1) {
			int var15 = arg0.gBit(2);
			int var16 = lowResolutions[arg1].coord;
			lowResolutions[arg1].coord = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
			return false;
		} else if (var2 == 2) {
			int var17 = arg0.gBit(5);
			int var18 = var17 >> 3 & 0x3;
			int var19 = var17 & 0x7;
			int var20 = lowResolutions[arg1].coord;
			assert speeds[arg1] >= 0 && speeds[arg1] <= 3;
			int var21 = (var20 >> 28) + var18 & 0x3;
			int var22 = var20 >> 14 & 0xFF;
			int var23 = var20 & 0xFF;
			if (var19 == 0) {
				var22--;
				var23--;
			}
			if (var19 == 1) {
				var23--;
			}
			if (var19 == 2) {
				var22++;
				var23--;
			}
			if (var19 == 3) {
				var22--;
			}
			if (var19 == 4) {
				var22++;
			}
			if (var19 == 5) {
				var22--;
				var23++;
			}
			if (var19 == 6) {
				var23++;
			}
			if (var19 == 7) {
				var22++;
				var23++;
			}
			SerializableEnums.decode((SerializableEnum[]) MoveSpeed.values(), speeds[arg1]);
			lowResolutions[arg1].coord = (var21 << 28) + (var22 << 14) + var23;
			return false;
		} else {
			int var24 = arg0.gBit(20);
			int var25 = var24 >> 18 & 0x3;
			int var26 = var24 >> 16 & 0x3;
			int var27 = var24 >> 8 & 0xFF;
			int var28 = var24 & 0xFF;
			int var29 = lowResolutions[arg1].coord;
			speeds[arg1] = (byte) (var25 - 1);
			assert speeds[arg1] >= 0 && speeds[arg1] <= 3;
			int var30 = (var29 >> 28) + var26 & 0x3;
			int var31 = (var29 >> 14) + var27 & 0xFF;
			int var32 = var28 + var29 & 0xFF;
			SerializableEnums.decode((SerializableEnum[]) MoveSpeed.values(), var25 - 1);
			lowResolutions[arg1].coord = (var30 << 28) + (var31 << 14) + var32;
			return false;
		}
	}

	@ObfuscatedName("a.l(Lase;B)V")
	public static final void readPlayerUpdates(PacketBit arg0) {
		for (int var1 = 0; var1 < entityUpdateCount; var1++) {
			arg0.g2();
			int var2 = entityUpdateIds[var1];
			PlayerEntity var3 = Client.players[var2];
			int var4 = arg0.g1();
			if ((var4 & 0x40) != 0) {
				var4 += arg0.g1() << 8;
			}
			if ((var4 & 0x1000) != 0) {
				var4 += arg0.g1() << 16;
			}
			readPlayerUpdatesBlocks(arg0, var2, var3, var4);
		}
	}

	@ObfuscatedName("rp.u(Lase;ILaqk;II)V")
	public static final void readPlayerUpdatesBlocks(PacketBit arg0, int arg1, PlayerEntity arg2, int arg3) {
		if ((arg3 & 0x80) != 0) {
			int[] var4 = new int[4];
			for (int var5 = 0; var5 < 4; var5++) {
				var4[var5] = arg0.gSmart2or4s();
			}
			int var6 = arg0.g1_alt2();
			Client.addSequences(arg2, var4, var6, false);
		}
		if ((arg3 & 0x40000) != 0) {
			arg0.pos += 2;
			int var7 = arg0.data[++arg0.pos - 1] & 0xFF;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.g1_alt3();
				BaseVarType var10 = (BaseVarType) SerializableEnums.decode((SerializableEnum[]) BaseVarType.values(), var9);
				VarValue var11 = Client.varPlayerTypeList.decodeVarValue(arg0, var10);
				arg2.vars.setVarValue(var11.var, var11.value);
			}
		}
		if ((arg3 & 0x10) != 0) {
			arg2.field12056 = arg0.g2_alt3();
			if (arg2.routeLength == 0) {
				arg2.method16490(arg2.field12056);
				arg2.field12056 = -1;
			}
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.field12048 = arg0.g1_alt3() == 1;
		}
		if ((arg3 & 0x20) != 0) {
			int var12 = arg0.g1_alt1();
			if (var12 > 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					int var14 = -1;
					boolean var15 = true;
					int var16 = -1;
					int var17 = arg0.gSmart1or2();
					int var18;
					if (var17 == 32767) {
						var17 = arg0.gSmart1or2();
						var18 = arg0.gSmart1or2();
						var14 = arg0.gSmart1or2();
						var16 = arg0.gSmart1or2();
					} else if (var17 == 32766) {
						var17 = -1;
						var18 = arg0.g1();
					} else {
						var18 = arg0.gSmart1or2();
					}
					int var19 = arg0.gSmart1or2();
					arg2.addHitmark(var17, var18, var14, var16, Client.loopCycle, var19);
				}
			}
			int var20 = arg0.g1_alt3();
			if (var20 > 0) {
				for (int var21 = 0; var21 < var20; var21++) {
					int var22 = arg0.gSmart1or2();
					int var23 = arg0.gSmart1or2();
					if (var23 == 32767) {
						arg2.method16500(var22);
					} else {
						int var24 = arg0.gSmart1or2();
						int var25 = arg0.g1_alt3();
						int var26 = var23 > 0 ? arg0.g1_alt2() : var25;
						arg2.addHeadbar(var22, Client.loopCycle, var23, var24, var25, var26);
					}
				}
			}
		}
		if ((arg3 & 0x8000) != 0) {
			int var27 = arg0.g1_alt3();
			int[] var28 = new int[var27];
			int[] var29 = new int[var27];
			int[] var30 = new int[var27];
			for (int var31 = 0; var31 < var27; var31++) {
				var28[var31] = arg0.gSmart2or4s();
				var29[var31] = arg0.g1_alt1();
				var30[var31] = arg0.g2_alt3();
			}
			Client.addSequences(arg2, var28, var29, var30);
		}
		if ((arg3 & 0x100000) != 0) {
			int var32 = arg0.g2_alt3();
			int var33 = arg0.g4_alt1();
			if (var32 == 65535) {
				var32 = -1;
			}
			int var34 = arg0.g1_alt1();
			int var35 = var34 & 0x7;
			int var36 = var34 >> 3 & 0xF;
			if (var36 == 15) {
				var36 = -1;
			}
			boolean var37 = (var34 >> 7 & 0x1) == 1;
			arg2.addSpotAnimation(var32, var33, var35, var36, var37, 4);
		}
		if ((arg3 & 0x4) != 0) {
			int var38 = arg0.g1_alt1();
			byte[] var39 = new byte[var38];
			Packet var40 = new Packet(var39);
			arg0.gdata_alt2(var39, 0, var38);
			appearances[arg1] = var40;
			arg2.getAppearance(var40);
		}
		if ((arg3 & 0x80000) != 0) {
			int var41 = arg0.g1_alt1();
			int[] var42 = new int[var41];
			int[] var43 = new int[var41];
			for (int var44 = 0; var44 < var41; var44++) {
				int var45 = arg0.g2_alt1();
				if ((var45 & 0xC000) == 49152) {
					int var46 = arg0.g2_alt1();
					var42[var44] = var45 << 16 | var46;
				} else {
					var42[var44] = var45;
				}
				var43[var44] = arg0.g2_alt2();
			}
			arg2.method16493(var42, var43);
		}
		if ((arg3 & 0x2000) != 0) {
			int var47 = arg0.g2();
			int var48 = arg0.g4_alt2();
			if (var47 == 65535) {
				var47 = -1;
			}
			int var49 = arg0.g1_alt1();
			int var50 = var49 & 0x7;
			int var51 = var49 >> 3 & 0xF;
			if (var51 == 15) {
				var51 = -1;
			}
			boolean var52 = (var49 >> 7 & 0x1) == 1;
			arg2.addSpotAnimation(var47, var48, var50, var51, var52, 2);
		}
		if ((arg3 & 0x2) != 0) {
			int var53 = arg0.g2_alt3();
			int var54 = arg0.g4_alt3();
			if (var53 == 65535) {
				var53 = -1;
			}
			int var55 = arg0.g1_alt1();
			int var56 = var55 & 0x7;
			int var57 = var55 >> 3 & 0xF;
			if (var57 == 15) {
				var57 = -1;
			}
			boolean var58 = (var55 >> 7 & 0x1) == 1;
			arg2.addSpotAnimation(var53, var54, var56, var57, var58, 0);
		}
		if ((arg3 & 0x800) != 0) {
			int var59 = arg0.g1();
			byte[] var60 = new byte[var59];
			Packet var61 = new Packet(var60);
			arg0.gdata_alt1(var60, 0, var59);
			headIcons[arg1] = var61;
			arg2.getHeadIcons(var61);
		}
		if ((arg3 & 0x20000) != 0) {
			arg2.vars.clear();
			arg0.pos += 2;
			int var62 = arg0.data[++arg0.pos - 1] & 0xFF;
			for (int var63 = 0; var63 < var62; var63++) {
				int var64 = arg0.g1_alt3();
				BaseVarType var65 = (BaseVarType) SerializableEnums.decode((SerializableEnum[]) BaseVarType.values(), var64);
				VarValue var66 = Client.varPlayerTypeList.decodeVarValue(arg0, var65);
				arg2.vars.setVarValue(var66.var, var66.value);
			}
		}
		if ((arg3 & 0x200) != 0) {
			String var67 = arg0.gjstr();
			if (Client.localPlayerEntity == arg2) {
				ChatHistory.addMessage(2, 0, arg2.getNameWithExtras(true), arg2.getName(false), arg2.name, var67, null);
			}
			arg2.addMessage(var67, 0, 0);
		}
		if ((arg3 & 0x8) != 0) {
			arg2.forceMoveStartSceneTileX = arg0.g1b_alt2();
			arg2.forceMoveStartSceneTileZ = arg0.g1b();
			arg2.forceMoveEndSceneTileX = arg0.g1b_alt2();
			arg2.forceMoveEndSceneTileZ = arg0.g1b_alt1();
			arg2.field10419 = arg0.g1b_alt1();
			arg2.field10428 = arg0.g1b();
			arg2.forceMoveEndCycle = arg0.g2_alt3() + Client.loopCycle;
			arg2.forceMoveStartCycle = arg0.g2_alt1() + Client.loopCycle;
			arg2.field10431 = arg0.g2_alt1();
			arg2.routeLength = 1;
			arg2.field10396 = 0;
			arg2.forceMoveStartSceneTileX += arg2.routeWaypointX[0];
			arg2.forceMoveStartSceneTileZ += arg2.routeWaypointZ[0];
			arg2.forceMoveEndSceneTileX += arg2.routeWaypointX[0];
			arg2.forceMoveEndSceneTileZ += arg2.routeWaypointZ[0];
			arg2.field10419 += arg2.level;
			arg2.field10428 += arg2.level;
		}
		if ((arg3 & 0x1) != 0) {
			int var68 = arg0.g2();
			if (var68 == 65535) {
				var68 = -1;
			}
			arg2.targetId = var68;
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.field10434 = arg0.g1b_alt2();
			arg2.field10435 = arg0.g1b_alt3();
			arg2.field10436 = arg0.g1b_alt2();
			arg2.field10437 = (byte) arg0.g1_alt1();
			arg2.field10446 = Client.loopCycle + arg0.g2();
			arg2.field10464 = Client.loopCycle + arg0.g2();
		}
		if ((arg3 & 0x400) != 0) {
			arg2.field12070 = (CommunityPartnerType) SerializableEnums.decode((SerializableEnum[]) CommunityPartnerType.method3559(), arg0.g1_alt2());
			if (arg2.field12070 == null) {
				arg2.field12070 = CommunityPartnerType.field1950;
			}
		}
		if ((arg3 & 0x100) != 0) {
			int var69 = arg0.g2_alt3();
			int var70 = arg0.g4_alt2();
			if (var69 == 65535) {
				var69 = -1;
			}
			int var71 = arg0.g1_alt2();
			int var72 = var71 & 0x7;
			int var73 = var71 >> 3 & 0xF;
			if (var73 == 15) {
				var73 = -1;
			}
			boolean var74 = (var71 >> 7 & 0x1) == 1;
			arg2.addSpotAnimation(var69, var70, var72, var73, var74, 1);
		}
		if ((arg3 & 0x200000) != 0) {
			String var75 = arg0.gjstr();
			int var76 = arg0.g1();
			if ((var76 & 0x1) != 0) {
				ChatHistory.addMessage(2, var76, arg2.getNameWithExtras(true), arg2.getName(false), arg2.name, var75, null);
			}
			arg2.addMessage(var75, 0, 0);
		}
		if ((arg3 & 0x400000) == 0) {
			return;
		}
		int var77 = arg0.g2_alt3();
		int var78 = arg0.g4s();
		if (var77 == 65535) {
			var77 = -1;
		}
		int var79 = arg0.g1_alt1();
		int var80 = var79 & 0x7;
		int var81 = var79 >> 3 & 0xF;
		if (var81 == 15) {
			var81 = -1;
		}
		boolean var82 = (var79 >> 7 & 0x1) == 1;
		arg2.addSpotAnimation(var77, var78, var80, var81, var82, 3);
	}

	@ObfuscatedName("ajt.z(I)V")
	public static void reset() {
		highResolutionsCount = 0;
		for (int var0 = 0; var0 < 2048; var0++) {
			appearances[var0] = null;
			headIcons[var0] = null;
			speeds[var0] = MoveSpeed.WALK.serialID;
			lowResolutions[var0] = null;
		}
	}
}
