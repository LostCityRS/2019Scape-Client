package com.jagex.game.client;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.utils.VarValue;
import com.jagex.game.camera.LookatEntity;
import com.jagex.game.camera.LookatMode;
import com.jagex.game.camera.position.PositionEntity;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.game.script.CommunityPartnerType;
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
	public static final void receivePlayerPositions(PacketBit buf) {
		buf.accessBits();
		int localPlayerIndex = Client.currentPlayerUid;
		PlayerEntity player = Client.localPlayerEntity = Client.players[localPlayerIndex] = new PlayerEntity(Client.world.getScene());
		player.localPlayerIndex = localPlayerIndex;
		int highCoord = buf.gBit(30);
		byte hl = (byte) (highCoord >> 28);
		int hx = highCoord >> 14 & 0x3FFF;
		int hz = highCoord & 0x3FFF;
		CoordGrid coord = Client.world.getBase();
		player.routeWaypointX[0] = hx - coord.x;
		player.routeWaypointZ[0] = hz - coord.z;
		player.setPosition((float) ((player.routeWaypointX[0] << 9) + (player.size() << 8)), player.method10525().trans.y, (float) ((player.routeWaypointZ[0] << 9) + (player.size() << 8)));
		Client.currentPlayerLevel = player.level = player.occludeLevel = hl;
		if (Client.world.getSceneLevelTileFlags().isLinkBelow(player.routeWaypointX[0], player.routeWaypointZ[0])) {
			player.occludeLevel++;
		}
		if (appearances[localPlayerIndex] != null) {
			player.getAppearance(appearances[localPlayerIndex]);
		}
		if (headIcons[localPlayerIndex] != null) {
			player.getHeadIcons(headIcons[localPlayerIndex]);
		}
		highResolutionsCount = 0;
		highResolutionsIndices[++highResolutionsCount - 1] = localPlayerIndex;
		nsn[localPlayerIndex] = 0;
		lowResolutionsCount = 0;
		for (int index = 1; index < 2048; index++) {
			if (localPlayerIndex != index) {
				int lowCoord = buf.gBit(18);
				int ll = lowCoord >> 16 & 0x3;
				int lx = lowCoord >> 8 & 0xFF;
				int lz = lowCoord & 0xFF;
				LowResPlayerInfo lowResPlayer = lowResolutions[index] = new LowResPlayerInfo();
				lowResPlayer.coord = (ll << 28) + (lx << 14) + lz;
				lowResPlayer.field523 = 0;
				lowResPlayer.field522 = -1;
				lowResPlayer.field525 = CommunityPartnerType.field1950;
				lowResPlayer.field526 = false;
				lowResolutionsIndices[++lowResolutionsCount - 1] = index;
				nsn[index] = 0;
			}
		}
		buf.accessBytes();
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
	public static final void readPlayerInfo(PacketBit buf, int size) {
		entityUpdateCount = 0;
		readPlayers(buf);
		readPlayerUpdates(buf);
		if (buf.pos != size) {
			throw new RuntimeException(buf.pos + " " + size);
		}
	}

	@ObfuscatedName("ka.m(Lase;I)V")
	public static final void readPlayers(PacketBit buf) {
		int skip = 0;
		buf.accessBits();
		for (int index = 0; index < highResolutionsCount; index++) {
			int highResIndex = highResolutionsIndices[index];
			if ((nsn[highResIndex] & 0x1) == 0) {
				if (skip > 0) {
					skip--;
					nsn[highResIndex] = (byte) (nsn[highResIndex] | 0x2);
				} else {
					int update = buf.gBit(1);
					if (update == 0) {
						skip = skip(buf);
						nsn[highResIndex] = (byte) (nsn[highResIndex] | 0x2);
					} else {
						readHighResolution(buf, highResIndex);
					}
				}
			}
		}
		buf.accessBytes();
		if (skip != 0) {
			throw new RuntimeException();
		}
		buf.accessBits();
		for (int index = 0; index < highResolutionsCount; index++) {
			int highResIndex = highResolutionsIndices[index];
			if ((nsn[highResIndex] & 0x1) != 0) {
				if (skip > 0) {
					skip--;
					nsn[highResIndex] = (byte) (nsn[highResIndex] | 0x2);
				} else {
					int update = buf.gBit(1);
					if (update == 0) {
						skip = skip(buf);
						nsn[highResIndex] = (byte) (nsn[highResIndex] | 0x2);
					} else {
						readHighResolution(buf, highResIndex);
					}
				}
			}
		}
		buf.accessBytes();
		if (skip != 0) {
			throw new RuntimeException();
		}
		buf.accessBits();
		for (int index = 0; index < lowResolutionsCount; index++) {
			int lowResIndex = lowResolutionsIndices[index];
			if ((nsn[lowResIndex] & 0x1) != 0) {
				if (skip > 0) {
					skip--;
					nsn[lowResIndex] = (byte) (nsn[lowResIndex] | 0x2);
				} else {
					int update = buf.gBit(1);
					if (update == 0) {
						skip = skip(buf);
						nsn[lowResIndex] = (byte) (nsn[lowResIndex] | 0x2);
					} else if (readLowResolution(buf, lowResIndex)) {
						nsn[lowResIndex] = (byte) (nsn[lowResIndex] | 0x2);
					}
				}
			}
		}
		buf.accessBytes();
		if (skip != 0) {
			throw new RuntimeException();
		}
		buf.accessBits();
		for (int index = 0; index < lowResolutionsCount; index++) {
			int lowResIndex = lowResolutionsIndices[index];
			if ((nsn[lowResIndex] & 0x1) == 0) {
				if (skip > 0) {
					skip--;
					nsn[lowResIndex] = (byte) (nsn[lowResIndex] | 0x2);
				} else {
					int var13 = buf.gBit(1);
					if (var13 == 0) {
						skip = skip(buf);
						nsn[lowResIndex] = (byte) (nsn[lowResIndex] | 0x2);
					} else if (readLowResolution(buf, lowResIndex)) {
						nsn[lowResIndex] = (byte) (nsn[lowResIndex] | 0x2);
					}
				}
			}
		}
		buf.accessBytes();
		if (skip != 0) {
			throw new RuntimeException();
		}
		highResolutionsCount = 0;
		lowResolutionsCount = 0;
		for (int index = 1; index < 2048; index++) {
			nsn[index] = (byte) (nsn[index] >> 1);
			PlayerEntity player = Client.players[index];
			if (player == null) {
				lowResolutionsIndices[++lowResolutionsCount - 1] = index;
			} else {
				highResolutionsIndices[++highResolutionsCount - 1] = index;
			}
		}
	}

	@ObfuscatedName("ck.k(Lase;I)I")
	public static int skip(PacketBit buf) {
		int type = buf.gBit(2);
		int count;
		if (type == 0) {
			count = 0;
		} else if (type == 1) {
			count = buf.gBit(5);
		} else if (type == 2) {
			count = buf.gBit(8);
		} else {
			count = buf.gBit(11);
		}
		return count;
	}

	@ObfuscatedName("akz.f(Lase;IS)V")
	public static void readHighResolution(PacketBit buf, int highResIndex) {
		CoordGrid coord = Client.world.getBase();
		boolean hasUpdate = buf.gBit(1) == 1;
		if (hasUpdate) {
			entityUpdateIds[++entityUpdateCount - 1] = highResIndex;
		}
		int updateType = buf.gBit(2);
		PlayerEntity player = Client.players[highResIndex];
		if (updateType == 0) { // removing
			if (!hasUpdate) {
				if (Client.currentPlayerUid == highResIndex) {
					throw new RuntimeException();
				}
				LowResPlayerInfo var6 = lowResolutions[highResIndex] = new LowResPlayerInfo();
				MoveSpeed.values();
				var6.coord = (coord.z + player.routeWaypointZ[0] >> 6) + (coord.x + player.routeWaypointX[0] >> 6 << 14) + (player.level << 28);
				if (player.field12056 == -1) {
					var6.field523 = player.field10395.method316();
				} else {
					var6.field523 = player.field12056;
				}
				var6.field522 = player.targetId;
				var6.field525 = player.field12070;
				var6.field526 = player.field12048;
				if (player.bgsound_range > 0) {
					PositionedSound.method5142(player);
				}
				Client.players[highResIndex] = null;
				if (buf.gBit(1) != 0) {
					readLowResolution(buf, highResIndex);
				}
			}
		} else if (updateType == 1) { // walk
			int direction = buf.gBit(3);
			int var8 = buf.gBit(1);
			int nextX = player.routeWaypointX[0];
			int nextZ = player.routeWaypointZ[0];
			if (var8 == 1) {
				speeds[highResIndex] = MoveSpeed.RUN.serialID;
				int var11 = buf.gBit(2);
				switch(var11) {
					case 0:
						player.movePlayer(nextX, nextZ + 1, speeds[highResIndex]);
						break;
					case 1:
						player.movePlayer(nextX - 1, nextZ, speeds[highResIndex]);
						break;
					case 2:
						player.movePlayer(nextX + 1, nextZ, speeds[highResIndex]);
						break;
					case 3:
						player.movePlayer(nextX, nextZ - 1, speeds[highResIndex]);
				}
			}
			if (direction == 0) {
				nextX--;
				nextZ--;
			} else if (direction == 1) {
				nextZ--;
			} else if (direction == 2) {
				nextX++;
				nextZ--;
			} else if (direction == 3) {
				nextX--;
			} else if (direction == 4) {
				nextX++;
			} else if (direction == 5) {
				nextX--;
				nextZ++;
			} else if (direction == 6) {
				nextZ++;
			} else if (direction == 7) {
				nextX++;
				nextZ++;
			}
			player.movePlayer(nextX, nextZ, speeds[highResIndex]);
		} else if (updateType == 2) { // run
			int direction = buf.gBit(4);
			int nextX = player.routeWaypointX[0];
			int nextZ = player.routeWaypointZ[0];
			if (direction == 0) {
				nextX -= 2;
				nextZ -= 2;
			} else if (direction == 1) {
				nextX--;
				nextZ -= 2;
			} else if (direction == 2) {
				nextZ -= 2;
			} else if (direction == 3) {
				nextX++;
				nextZ -= 2;
			} else if (direction == 4) {
				nextX += 2;
				nextZ -= 2;
			} else if (direction == 5) {
				nextX -= 2;
				nextZ--;
			} else if (direction == 6) {
				nextX += 2;
				nextZ--;
			} else if (direction == 7) {
				nextX -= 2;
			} else if (direction == 8) {
				nextX += 2;
			} else if (direction == 9) {
				nextX -= 2;
				nextZ++;
			} else if (direction == 10) {
				nextX += 2;
				nextZ++;
			} else if (direction == 11) {
				nextX -= 2;
				nextZ += 2;
			} else if (direction == 12) {
				nextX--;
				nextZ += 2;
			} else if (direction == 13) {
				nextZ += 2;
			} else if (direction == 14) {
				nextX++;
				nextZ += 2;
			} else if (direction == 15) {
				nextX += 2;
				nextZ += 2;
			}
			player.movePlayer(nextX, nextZ, speeds[highResIndex]);
		} else { // teleport
			int rebuild = buf.gBit(1);
			if (rebuild == 0) {
				int info = buf.gBit(15);
				int speed = info >> 12 & 0x7;
				int dl = (byte) (info >> 10) & 0x3;
				int dx = info >> 5 & 0x1F;
				if (dx > 15) {
					dx -= 32;
				}
				int dz = info & 0x1F;
				if (dz > 15) {
					dz -= 32;
				}
				int nextX = player.routeWaypointX[0] + dx;
				int nextZ = player.routeWaypointZ[0] + dz;
				if (MoveSpeed.INSTANT.index == speed) {
					player.tele(nextX, nextZ);
				} else {
					speeds[highResIndex] = (byte) (speed - 1);
					player.movePlayer(nextX, nextZ, speeds[highResIndex]);
				}
				player.level = player.occludeLevel = (byte) (player.level + dl & 0x3);
				if (Client.world.getSceneLevelTileFlags().isLinkBelow(nextX, nextZ)) {
					player.occludeLevel++;
				}
				if (Client.currentPlayerUid == highResIndex && Client.currentPlayerLevel != player.level) {
					Client.currentPlayerLevel = player.level;
				}
			} else {
				int speed = buf.gBit(3);
				int info = buf.gBit(30);
				int dl = info >> 28 & 0x3;
				int dx = info >> 14 & 0x3FFF;
				int dz = info & 0x3FFF;
				int nextX = (coord.x + player.routeWaypointX[0] + dx & 0x3FFF) - coord.x;
				int nextZ = (coord.z + player.routeWaypointZ[0] + dz & 0x3FFF) - coord.z;
				if (MoveSpeed.INSTANT.index == speed) {
					player.tele(nextX, nextZ);
				} else {
					speeds[highResIndex] = (byte) (speed - 1);
					player.movePlayer(nextX, nextZ, speeds[highResIndex]);
				}
				player.level = player.occludeLevel = (byte) (player.level + dl & 0x3);
				if (Client.world.getSceneLevelTileFlags().isLinkBelow(nextX, nextZ)) {
					player.occludeLevel++;
				}
				if (Client.currentPlayerUid == highResIndex) {
					Client.currentPlayerLevel = player.level;
				}
			}
		}
	}

	@ObfuscatedName("aap.w(Lase;II)Z")
	public static boolean readLowResolution(PacketBit buf, int lowResIndex) {
		int updateType = buf.gBit(2);
		if (updateType == 0) {
			if (buf.gBit(1) != 0) {
				readLowResolution(buf, lowResIndex);
			}
			int dx = buf.gBit(6);
			int dz = buf.gBit(6);
			boolean update = buf.gBit(1) == 1;
			if (update) {
				entityUpdateIds[++entityUpdateCount - 1] = lowResIndex;
			}
			if (Client.players[lowResIndex] != null) {
				throw new RuntimeException();
			}
			LowResPlayerInfo lowResPlayer = lowResolutions[lowResIndex];
			PlayerEntity player = Client.players[lowResIndex] = new PlayerEntity(Client.world.getScene());
			player.localPlayerIndex = lowResIndex;
			if (appearances[lowResIndex] != null) {
				player.getAppearance(appearances[lowResIndex]);
			}
			if (headIcons[lowResIndex] != null) {
				player.getHeadIcons(headIcons[lowResIndex]);
			}
			player.method16491(lowResPlayer.field523, true);
			player.targetId = lowResPlayer.field522;
			int coord = lowResPlayer.coord;
			int level = coord >> 28;
			int x = coord >> 14 & 0xFF;
			int z = coord & 0xFF;
			CoordGrid var12 = Client.world.getBase();
			int nextX = (x << 6) + dx - var12.x;
			int nextZ = (z << 6) + dz - var12.z;
			player.field12070 = lowResPlayer.field525;
			player.field12048 = lowResPlayer.field526;
			player.routeSpeeds[0] = speeds[lowResIndex];
			player.level = player.occludeLevel = (byte) level;
			if (Client.world.getSceneLevelTileFlags().isLinkBelow(nextX, nextZ)) {
				player.occludeLevel++;
			}
			player.tele(nextX, nextZ);
			lowResolutions[lowResIndex] = null;
			return true;
		} else if (updateType == 1) {
			int level = buf.gBit(2);
			int coord = lowResolutions[lowResIndex].coord;
			lowResolutions[lowResIndex].coord = (((coord >> 28) + level & 0x3) << 28) + (coord & 0xFFFFFFF);
			return false;
		} else if (updateType == 2) {
			int info = buf.gBit(5);
			int level = info >> 3 & 0x3;
			int direction = info & 0x7;
			int coord = lowResolutions[lowResIndex].coord;
			assert speeds[lowResIndex] >= 0 && speeds[lowResIndex] <= 3;
			int nextLevel = (coord >> 28) + level & 0x3;
			int nextX = coord >> 14 & 0xFF;
			int nextZ = coord & 0xFF;
			if (direction == 0) {
				nextX--;
				nextZ--;
			}
			if (direction == 1) {
				nextZ--;
			}
			if (direction == 2) {
				nextX++;
				nextZ--;
			}
			if (direction == 3) {
				nextX--;
			}
			if (direction == 4) {
				nextX++;
			}
			if (direction == 5) {
				nextX--;
				nextZ++;
			}
			if (direction == 6) {
				nextZ++;
			}
			if (direction == 7) {
				nextX++;
				nextZ++;
			}
			SerializableEnums.decode(MoveSpeed.values(), speeds[lowResIndex]);
			lowResolutions[lowResIndex].coord = (nextLevel << 28) + (nextX << 14) + nextZ;
			return false;
		} else {
			int info = buf.gBit(20);
			int ds = info >> 18 & 0x3;
			int dl = info >> 16 & 0x3;
			int dx = info >> 8 & 0xFF;
			int dz = info & 0xFF;
			int coord = lowResolutions[lowResIndex].coord;
			speeds[lowResIndex] = (byte) (ds - 1);
			assert speeds[lowResIndex] >= 0 && speeds[lowResIndex] <= 3;
			int nextLevel = (coord >> 28) + dl & 0x3;
			int nextX = (coord >> 14) + dx & 0xFF;
			int nextZ = dz + coord & 0xFF;
			SerializableEnums.decode(MoveSpeed.values(), ds - 1);
			lowResolutions[lowResIndex].coord = (nextLevel << 28) + (nextX << 14) + nextZ;
			return false;
		}
	}

	@ObfuscatedName("a.l(Lase;B)V")
	public static final void readPlayerUpdates(PacketBit buf) {
		for (int index = 0; index < entityUpdateCount; index++) {
			buf.g2();
			int entityIndex = entityUpdateIds[index];
			PlayerEntity player = Client.players[entityIndex];
			int mask = buf.g1();
			if ((mask & 0x40) != 0) {
				mask += buf.g1() << 8;
			}
			if ((mask & 0x1000) != 0) {
				mask += buf.g1() << 16;
			}
			readPlayerUpdatesBlocks(buf, entityIndex, player, mask);
		}
	}

	@ObfuscatedName("rp.u(Lase;ILaqk;II)V")
	public static final void readPlayerUpdatesBlocks(PacketBit buf, int index, PlayerEntity player, int mask) {
		if ((mask & 0x80) != 0) { // sequences
			int[] seqs = new int[4];
			for (int var5 = 0; var5 < 4; var5++) {
				seqs[var5] = buf.gSmart2or4null();
			}
			int var6 = buf.g1_alt2();
			Client.addSequences(player, seqs, var6, false);
		}
		if ((mask & 0x40000) != 0) {
			buf.pos += 2;
			int var7 = buf.data[(++buf.pos) - 1] & 0xFF;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = buf.g1_alt3();
				BaseVarType var10 = (BaseVarType) SerializableEnums.decode(BaseVarType.values(), var9);
				VarValue var11 = Client.varPlayerTypeList.decodeVarValue(buf, var10);
				player.vars.setVarValue(var11.var, var11.value);
			}
		}
		if ((mask & 0x10) != 0) {
			player.field12056 = buf.g2_alt3();
			if (player.routeLength == 0) {
				player.method16490(player.field12056);
				player.field12056 = -1;
			}
		}
		if ((mask & 0x10000) != 0) {
			player.field12048 = buf.g1_alt3() == 1;
		}
		if ((mask & 0x20) != 0) { // hits & bars
			int numHits = buf.g1_alt1();
			if (numHits > 0) {
				for (int hit = 0; hit < numHits; hit++) {
					int var14 = -1;
					boolean var15 = true;
					int var16 = -1;
					int id = buf.gSmart1or2();
					int var18;
					if (id == 32767) {
						id = buf.gSmart1or2();
						var18 = buf.gSmart1or2();
						var14 = buf.gSmart1or2();
						var16 = buf.gSmart1or2();
					} else if (id == 32766) {
						id = -1;
						var18 = buf.g1();
					} else {
						var18 = buf.gSmart1or2();
					}
					int var19 = buf.gSmart1or2();
					player.addHitmark(id, var18, var14, var16, Client.loopCycle, var19);
				}
			}
			int numBars = buf.g1_alt3();
			if (numBars > 0) {
				for (int bar = 0; bar < numBars; bar++) {
					int id = buf.gSmart1or2();
					int var23 = buf.gSmart1or2();
					if (var23 == 32767) {
						player.method16500(id);
					} else {
						int var24 = buf.gSmart1or2();
						int var25 = buf.g1_alt3();
						int var26 = var23 > 0 ? buf.g1_alt2() : var25;
						player.addHeadbar(id, Client.loopCycle, var23, var24, var25, var26);
					}
				}
			}
		}
		if ((mask & 0x8000) != 0) { // new sequences
			int var27 = buf.g1_alt3();
			int[] seqs = new int[var27];
			int[] var29 = new int[var27];
			int[] var30 = new int[var27];
			for (int var31 = 0; var31 < var27; var31++) {
				seqs[var31] = buf.gSmart2or4null();
				var29[var31] = buf.g1_alt1();
				var30[var31] = buf.g2_alt3();
			}
			Client.addSequences(player, seqs, var29, var30);
		}
		if ((mask & 0x100000) != 0) { // spotanim4
			int id = buf.g2_alt3();
			int var33 = buf.g4_alt1();
			if (id == 65535) {
				id = -1;
			}
			int var34 = buf.g1_alt1();
			int var35 = var34 & 0x7;
			int var36 = var34 >> 3 & 0xF;
			if (var36 == 15) {
				var36 = -1;
			}
			boolean var37 = (var34 >> 7 & 0x1) == 1;
			player.addSpotAnimation(id, var33, var35, var36, var37, 4);
		}
		if ((mask & 0x4) != 0) { // appearance
			int length = buf.g1_alt1();
			byte[] bytes = new byte[length];
			Packet appearance = new Packet(bytes);
			buf.gdata_alt2(bytes, 0, length);
			appearances[index] = appearance;
			player.getAppearance(appearance);
		}
		if ((mask & 0x80000) != 0) {
			int var41 = buf.g1_alt1();
			int[] var42 = new int[var41];
			int[] var43 = new int[var41];
			for (int var44 = 0; var44 < var41; var44++) {
				int var45 = buf.g2_alt1();
				if ((var45 & 0xC000) == 49152) {
					int var46 = buf.g2_alt1();
					var42[var44] = var45 << 16 | var46;
				} else {
					var42[var44] = var45;
				}
				var43[var44] = buf.g2_alt2();
			}
			player.method16493(var42, var43);
		}
		if ((mask & 0x2000) != 0) { // spotanim2
			int id = buf.g2();
			int var48 = buf.g4_alt2();
			if (id == 65535) {
				id = -1;
			}
			int var49 = buf.g1_alt1();
			int var50 = var49 & 0x7;
			int var51 = var49 >> 3 & 0xF;
			if (var51 == 15) {
				var51 = -1;
			}
			boolean var52 = (var49 >> 7 & 0x1) == 1;
			player.addSpotAnimation(id, var48, var50, var51, var52, 2);
		}
		if ((mask & 0x2) != 0) { // spotanim0
			int id = buf.g2_alt3();
			int var54 = buf.g4_alt3();
			if (id == 65535) {
				id = -1;
			}
			int var55 = buf.g1_alt1();
			int var56 = var55 & 0x7;
			int var57 = var55 >> 3 & 0xF;
			if (var57 == 15) {
				var57 = -1;
			}
			boolean var58 = (var55 >> 7 & 0x1) == 1;
			player.addSpotAnimation(id, var54, var56, var57, var58, 0);
		}
		if ((mask & 0x800) != 0) { // headicons
			int length = buf.g1();
			byte[] bytes = new byte[length];
			Packet headicons = new Packet(bytes);
			buf.gdata_alt1(bytes, 0, length);
			headIcons[index] = headicons;
			player.getHeadIcons(headicons);
		}
		if ((mask & 0x20000) != 0) {
			player.vars.clear();
			buf.pos += 2;
			int var62 = buf.data[(++buf.pos) - 1] & 0xFF;
			for (int var63 = 0; var63 < var62; var63++) {
				int var64 = buf.g1_alt3();
				BaseVarType var65 = (BaseVarType) SerializableEnums.decode(BaseVarType.values(), var64);
				VarValue var66 = Client.varPlayerTypeList.decodeVarValue(buf, var65);
				player.vars.setVarValue(var66.var, var66.value);
			}
		}
		if ((mask & 0x200) != 0) { // forced chat
			String message = buf.gjstr();
			if (Client.localPlayerEntity == player) {
				ChatHistory.addMessage(2, 0, player.getNameWithExtras(true), player.getName(false), player.name, message, null);
			}
			player.addMessage(message, 0, 0);
		}
		if ((mask & 0x8) != 0) { // force move
			player.forceMoveStartSceneTileX = buf.g1b_alt2();
			player.forceMoveStartSceneTileZ = buf.g1b();
			player.forceMoveEndSceneTileX = buf.g1b_alt2();
			player.forceMoveEndSceneTileZ = buf.g1b_alt1();
			player.field10419 = buf.g1b_alt1();
			player.field10428 = buf.g1b();
			player.forceMoveEndCycle = buf.g2_alt3() + Client.loopCycle;
			player.forceMoveStartCycle = buf.g2_alt1() + Client.loopCycle;
			player.field10431 = buf.g2_alt1();
			player.routeLength = 1;
			player.field10396 = 0;
			player.forceMoveStartSceneTileX += player.routeWaypointX[0];
			player.forceMoveStartSceneTileZ += player.routeWaypointZ[0];
			player.forceMoveEndSceneTileX += player.routeWaypointX[0];
			player.forceMoveEndSceneTileZ += player.routeWaypointZ[0];
			player.field10419 += player.level;
			player.field10428 += player.level;
		}
		if ((mask & 0x1) != 0) {
			int var68 = buf.g2();
			if (var68 == 65535) {
				var68 = -1;
			}
			player.targetId = var68;
		}
		if ((mask & 0x800000) != 0) { // color
			player.field10434 = buf.g1b_alt2();
			player.field10435 = buf.g1b_alt3();
			player.field10436 = buf.g1b_alt2();
			player.field10437 = (byte) buf.g1_alt1();
			player.field10446 = Client.loopCycle + buf.g2();
			player.field10464 = Client.loopCycle + buf.g2();
		}
		if ((mask & 0x400) != 0) {
			player.field12070 = (CommunityPartnerType) SerializableEnums.decode(CommunityPartnerType.method3559(), buf.g1_alt2());
			if (player.field12070 == null) {
				player.field12070 = CommunityPartnerType.field1950;
			}
		}
		if ((mask & 0x100) != 0) { // spotanim1
			int id = buf.g2_alt3();
			int var70 = buf.g4_alt2();
			if (id == 65535) {
				id = -1;
			}
			int var71 = buf.g1_alt2();
			int var72 = var71 & 0x7;
			int var73 = var71 >> 3 & 0xF;
			if (var73 == 15) {
				var73 = -1;
			}
			boolean var74 = (var71 >> 7 & 0x1) == 1;
			player.addSpotAnimation(id, var70, var72, var73, var74, 1);
		}
		if ((mask & 0x200000) != 0) { // new forced chat
			String message = buf.gjstr();
			int var76 = buf.g1();
			if ((var76 & 0x1) != 0) {
				ChatHistory.addMessage(2, var76, player.getNameWithExtras(true), player.getName(false), player.name, message, null);
			}
			player.addMessage(message, 0, 0);
		}
		if ((mask & 0x400000) == 0) { // spotanim3
			return;
		}
		int id = buf.g2_alt3();
		int var78 = buf.g4s();
		if (id == 65535) {
			id = -1;
		}
		int var79 = buf.g1_alt1();
		int var80 = var79 & 0x7;
		int var81 = var79 >> 3 & 0xF;
		if (var81 == 15) {
			var81 = -1;
		}
		boolean var82 = (var79 >> 7 & 0x1) == 1;
		player.addSpotAnimation(id, var78, var80, var81, var82, 3);
	}

	@ObfuscatedName("ajt.z(I)V")
	public static void reset() {
		highResolutionsCount = 0;
		for (int index = 0; index < 2048; index++) {
			appearances[index] = null;
			headIcons[index] = null;
			speeds[index] = MoveSpeed.WALK.serialID;
			lowResolutions[index] = null;
		}
	}
}
