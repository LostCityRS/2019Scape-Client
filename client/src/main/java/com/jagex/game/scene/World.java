package com.jagex.game.scene;

import com.jagex.core.constants.BuildAreaSize;
import com.jagex.core.datastruct.IntegerBox;
import com.jagex.core.datastruct.LinkMap;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.TextUtil;
import com.jagex.game.client.*;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.cutscene.CutsceneManager;
import com.jagex.game.cutscene.CutsceneTemplate;
import com.jagex.game.load.MessageBox;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.shared.console.DeveloperConsole;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.WorldMap;
import com.jagex.game.world.WorldMapAreaMetadata;
import com.jagex.game.world.WorldMapRelated;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.js5.Js5MapFile;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.ObjStackList;
import rs2.client.scene.entities.NpcEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@ObfuscatedName("rl")
public class World {

	@ObfuscatedName("rl.e")
	public boolean asyncRebuilding;

	@ObfuscatedName("rl.n")
	public RebuildType rebuildType;

	@ObfuscatedName("rl.m")
	public RebuildType field5020;

	@ObfuscatedName("rl.k")
	public BuildAreaSize buildAreaSize;

	@ObfuscatedName("rl.f")
	public ClientMapLoader underwaterMapLoader;

	@ObfuscatedName("rl.w")
	public ClientMapLoader mapLoader;

	@ObfuscatedName("rl.l")
	public CoordGrid field5018 = new CoordGrid();

	@ObfuscatedName("rl.u")
	public CoordGrid field5025 = new CoordGrid();

	@ObfuscatedName("rl.z")
	public int field5022;

	@ObfuscatedName("rl.p")
	public int field5059;

	@ObfuscatedName("rl.d")
	public int mapSizeX;

	@ObfuscatedName("rl.c")
	public int mapSizeZ;

	@ObfuscatedName("rl.r")
	public Scene scene;

	@ObfuscatedName("rl.v")
	public EnvironmentManager field5062;

	@ObfuscatedName("rl.o")
	public LinkMap field5032;

	@ObfuscatedName("rl.s")
	public int field5042;

	@ObfuscatedName("rl.y")
	public int field5034;

	@ObfuscatedName("rl.q")
	public WorldMapAreaMetadata field5035;

	@ObfuscatedName("rl.x")
	public WorldMapRelated field5058;

	@ObfuscatedName("rl.b")
	public LocTint field5050 = new LocTint(0, 0, 0, 0);

	@ObfuscatedName("rl.h")
	public float field5038;

	@ObfuscatedName("rl.a")
	public LocTypeList field5039;

	@ObfuscatedName("rl.g")
	public int[][] field5040;

	@ObfuscatedName("rl.i")
	public int[][] field5041;

	@ObfuscatedName("rl.j")
	public byte[][][] field5029;

	@ObfuscatedName("rl.t")
	public RebuildStage rebuildStage;

	@ObfuscatedName("rl.ae")
	public int field5044 = 0;

	@ObfuscatedName("rl.ag")
	public int field5045 = 1;

	@ObfuscatedName("rl.ah")
	public int rebuildLocsCount = 0;

	@ObfuscatedName("rl.al")
	public int field5047 = 1;

	@ObfuscatedName("rl.ac")
	public int field5048;

	@ObfuscatedName("rl.ai")
	public int rebuildMapSquaresCount = 0;

	@ObfuscatedName("rl.aw")
	public int[] rebuildMapSquares;

	@ObfuscatedName("rl.as")
	public int[] rebuildMapSquaresGroupIds;

	@ObfuscatedName("rl.at")
	public byte[][] rebuildMapSquaresLands;

	@ObfuscatedName("rl.ad")
	public byte[][] rebuildMapSquaresLocs;

	@ObfuscatedName("rl.am")
	public byte[][] rebuildMapSquaresNpcs;

	@ObfuscatedName("rl.au")
	public byte[][] rebuildMapSquaresUnderwaterLands;

	@ObfuscatedName("rl.ar")
	public byte[][] rebuildMapSquaresUnderwaterLocs;

	@ObfuscatedName("rl.ap")
	public int[][][] field5057;

	@ObfuscatedName("rl.aq")
	public boolean field5037 = false;

	@ObfuscatedName("rl.ax")
	public long field5056;

	@ObfuscatedName("rl.av")
	public long field5060 = -1L;

	@ObfuscatedName("rl.ao")
	public HashMap field5061 = new HashMap();

	@ObfuscatedName("rl.aj")
	public int npcViewDistance;

	public World(boolean asyncRebuilding) {
		this.asyncRebuilding = asyncRebuilding;
	}

	@ObfuscatedName("rl.e(I)Lrc;")
	public RebuildType method7828() {
		return this.rebuildType;
	}

	@ObfuscatedName("rl.n(I)Lrg;")
	public RebuildStage method7724() {
		return this.rebuildStage;
	}

	@ObfuscatedName("rl.m(I)I")
	public int method7725() {
		return 100 - this.field5044 * 100 / this.field5045;
	}

	@ObfuscatedName("rl.k(I)I")
	public int method7726() {
		return 100 - this.rebuildLocsCount * 100 / this.field5047;
	}

	@ObfuscatedName("rl.f(I)Lve;")
	public CoordGrid method7727() {
		return this.field5018;
	}

	@ObfuscatedName("rl.w(I)I")
	public int method7728() {
		return this.mapSizeX;
	}

	@ObfuscatedName("rl.l(S)I")
	public int method7758() {
		return this.mapSizeZ;
	}

	@ObfuscatedName("rl.u(I)Ltw;")
	public WorldMapRelated method7871() {
		return this.field5058;
	}

	@ObfuscatedName("rl.z(B)Lre;")
	public LocTint method7722() {
		return this.field5050;
	}

	@ObfuscatedName("rl.p(I)F")
	public float method7732() {
		return this.field5038;
	}

	@ObfuscatedName("rl.d(I)I")
	public int method7760() {
		return this.field5042;
	}

	@ObfuscatedName("rl.c(I)I")
	public int method7734() {
		return this.field5034;
	}

	@ObfuscatedName("rl.r(I)Ltx;")
	public Scene getScene() {
		return this.scene;
	}

	@ObfuscatedName("rl.v(II)[[B")
	public byte[][] method7736(int arg0) {
		return this.mapLoader == null || this.mapLoader.field4517 == null || this.mapLoader.field4517[arg0] == null ? (byte[][]) null : this.mapLoader.field4517[arg0];
	}

	@ObfuscatedName("rl.o(I)Lqx;")
	public LinkMap method7793() {
		return this.field5032;
	}

	@ObfuscatedName("rl.s(B)Lxu;")
	public EnvironmentManager method7816() {
		return this.field5062;
	}

	@ObfuscatedName("rl.y(I)Laop;")
	public LocTypeList method7750() {
		return this.field5039;
	}

	@ObfuscatedName("rl.q(I)[[I")
	public int[][] method7740() {
		return this.field5040;
	}

	@ObfuscatedName("rl.x(B)[[I")
	public int[][] method7858() {
		return this.field5041;
	}

	@ObfuscatedName("rl.b(B)[[[B")
	public byte[][][] method7742() {
		return this.field5029;
	}

	@ObfuscatedName("rl.h([[[BI)V")
	public void method7775(byte[][][] arg0) {
		this.field5029 = arg0;
	}

	@ObfuscatedName("rl.a(I)Laih;")
	public ClientMapLoader method7744() {
		return this.mapLoader;
	}

	@ObfuscatedName("rl.g(Laop;I)V")
	public void method7733(LocTypeList arg0) {
		this.field5039 = arg0;
	}

	@ObfuscatedName("rl.i(B)V")
	public void method7746() {
		this.field5018 = new CoordGrid();
		this.field5059 = 0;
		this.field5022 = 0;
	}

	@ObfuscatedName("rl.j(B)V")
	public void method7747() {
		if (this.scene != null) {
			PickableEntity.method15000();
			this.field5061 = this.scene.method8733();
			this.scene.field6959.method8680();
			this.scene = null;
		}
	}

	@ObfuscatedName("rl.t(I)V")
	public void method7729() {
		this.rebuildStage = RebuildStage.field5007;
		this.field5044 = 0;
		this.field5045 = 1;
		this.rebuildLocsCount = 0;
		this.field5047 = 1;
		this.field5048 = 0;
	}

	@ObfuscatedName("rl.ae(ZI)V")
	public void method7737(boolean arg0) {
		EnvironmentOverride var2 = null;
		if (this.field5062 != null && arg0) {
			var2 = this.field5062.method9981();
		}
		this.field5062 = new EnvironmentManager(Client.renderer, Client.spritesJs5, this.mapSizeX >> 3, this.mapSizeZ >> 3);
		if (var2 != null) {
			this.field5062.method9980(this, var2, 0);
		}
	}

	@ObfuscatedName("rl.ag(I)V")
	public void method7730() {
		this.field5062.method9980(this, null, 0);
	}

	@ObfuscatedName("rl.ah(B)V")
	public void method7820() {
		this.field5042 = 200;
		if (this.mapSizeX == 0) {
			this.field5034 = 430;
		} else {
			this.field5034 = (int) ((double) (this.mapSizeX) * 34.46D);
		}
		this.field5034 <<= 0x2;
		if (Client.renderer.method2130()) {
			this.field5034 += 512;
		}
	}

	@ObfuscatedName("rl.al(Lrl;I)V")
	public void method7752(World arg0) {
		boolean var2 = arg0.asyncRebuilding;
		arg0.asyncRebuilding = this.asyncRebuilding;
		this.asyncRebuilding = var2;
		RebuildType var3 = arg0.field5020;
		arg0.field5020 = this.field5020;
		this.field5020 = var3;
		arg0.field5025 = this.field5018;
		this.field5025 = arg0.field5018;
		this.field5062.method9992(arg0.method7816());
	}

	@ObfuscatedName("rl.ac(B)V")
	public void method7753() {
		if (this.asyncRebuilding) {
			this.method7729();
			this.field5060 = -1L;
			World var1 = Client.world;
			this.rebuildMapSquaresCount = var1.rebuildMapSquaresCount;
			this.rebuildMapSquares = var1.rebuildMapSquares;
			this.rebuildMapSquaresGroupIds = var1.rebuildMapSquaresGroupIds;
			this.rebuildMapSquaresLands = var1.rebuildMapSquaresLands;
			this.rebuildMapSquaresLocs = var1.rebuildMapSquaresLocs;
			this.rebuildMapSquaresNpcs = var1.rebuildMapSquaresNpcs;
			this.rebuildMapSquaresUnderwaterLands = var1.rebuildMapSquaresUnderwaterLands;
			this.rebuildMapSquaresUnderwaterLocs = var1.rebuildMapSquaresUnderwaterLocs;
			this.field5032 = var1.field5032;
			this.field5062 = var1.field5062;
			this.field5057 = var1.field5057;
			this.field5042 = var1.field5042;
			this.field5034 = var1.field5034;
			this.field5035 = var1.field5035;
			this.field5058 = var1.field5058;
			this.field5040 = var1.field5040;
			this.field5041 = var1.field5041;
			this.field5029 = var1.field5029;
			this.rebuildType = var1.rebuildType;
			this.buildAreaSize = var1.buildAreaSize;
			this.field5018 = var1.field5018;
			this.field5025 = var1.field5025;
			this.field5022 = var1.field5022;
			this.field5059 = var1.field5059;
			this.mapSizeX = var1.mapSizeX;
			this.mapSizeZ = var1.mapSizeZ;
		} else if (Client.state == 4) {
			Client.setState(10);
		} else if (Client.state == 13) {
			Client.setState(6);
		} else if (Client.state == 15) {
			Client.setState(16);
		} else if (Client.state == 18) {
			Client.setState(3);
		} else if (Client.state == 0) {
			Client.setState(8);
		}
	}

	@ObfuscatedName("rl.ai(Lrt;I)V")
	public void rebuildMap(RebuildRequest request) {
		this.rebuildType = request.rebuildType;
		if (RebuildType.field5063 == this.rebuildType) {
			this.method7773();
		} else if (RebuildType.REBUILD_NORMAL == this.rebuildType) {
			this.rebuildNormalMap(request.buf);
		} else if (RebuildType.field5064 == this.rebuildType) {
			this.method7824();
		} else if (this.rebuildType.isRegionType()) {
			this.rebuildRegionMap(request.buf);
		}
	}

	@ObfuscatedName("rl.aw(B)V")
	public void method7773() {
		this.setBuildAreaSize(BuildAreaSize.buildAreaSizeForId(Client.preferences.buildArea.getValue()));
		int var1 = this.field5018.x;
		int var2 = this.field5018.z;
		int var3 = (Client.field7956 >> 12) + (var1 >> 3);
		int var4 = (Client.field1881 >> 12) + (var2 >> 3);
		Client.localPlayerEntity.field11717 = 0;
		Client.field4826 = 0;
		Client.localPlayerEntity.method19118(8, 8);
		byte var5 = 18;
		this.rebuildMapSquares = new int[var5];
		this.rebuildMapSquaresGroupIds = new int[var5];
		this.rebuildMapSquaresLands = new byte[var5][];
		this.rebuildMapSquaresLocs = new byte[var5][];
		this.rebuildMapSquaresNpcs = new byte[var5][];
		this.rebuildMapSquaresUnderwaterLands = new byte[var5][];
		this.rebuildMapSquaresUnderwaterLocs = new byte[var5][];
		int var6 = 0;
		for (int var7 = (var3 - (this.mapSizeX >> 4)) / 8; var7 <= ((this.mapSizeX >> 4) + var3) / 8; var7++) {
			for (int var8 = (var4 - (this.mapSizeZ >> 4)) / 8; var8 <= ((this.mapSizeZ >> 4) + var4) / 8; var8++) {
				int mapSquareId = (var7 << 8) + var8;
				if (Client.mapsJs5.isGroupValid(this.mapSquareGroupId(var7, var8), Js5MapFile.LAND.id)) {
					this.rebuildMapSquares[var6] = mapSquareId;
					this.rebuildMapSquaresGroupIds[var6] = this.mapSquareGroupId(var7, var8);
					var6++;
				}
			}
		}
		this.rebuildMapSquaresCount = var6;
		byte var10;
		if (Client.state == 4) {
			var10 = 10;
		} else if (Client.state == 15) {
			var10 = 16;
		} else if (Client.state == 13) {
			var10 = 6;
		} else if (Client.state == 0) {
			var10 = 8;
		} else {
			throw new RuntimeException("" + Client.state);
		}
		this.method7829(var3, var4, var10, false);
	}

	@ObfuscatedName("rl.as(Lase;I)V")
	public void rebuildNormalMap(PacketBit arg0) {
		int z = arg0.g2_alt2();
		this.npcViewDistance = arg0.g1();
		int count = arg0.g1_alt3();
		int buildAreaSize = arg0.g1();
		int x = arg0.g2_alt2();
		boolean forceRebuild = arg0.g1_alt3() == 1;
		if (!this.asyncRebuilding) {
			this.method7854();
		}
		this.setBuildAreaSize(BuildAreaSize.buildAreaSizeForId(buildAreaSize));
		this.rebuildMapSquares = new int[count];
		this.rebuildMapSquaresGroupIds = new int[count];
		this.rebuildMapSquaresLands = new byte[count][];
		this.rebuildMapSquaresLocs = new byte[count][];
		this.rebuildMapSquaresNpcs = null;
		this.rebuildMapSquaresUnderwaterLands = new byte[count][];
		this.rebuildMapSquaresUnderwaterLocs = new byte[count][];
		int mapSquaresCount = 0;
		for (int zoneX = (z - (this.mapSizeX >> 4)) / 8; zoneX <= ((this.mapSizeX >> 4) + z) / 8; zoneX++) {
			for (int zoneZ = (x - (this.mapSizeZ >> 4)) / 8; zoneZ <= ((this.mapSizeZ >> 4) + x) / 8; zoneZ++) {
				if (Client.mapsJs5.isGroupValid(this.mapSquareGroupId(zoneX, zoneZ), Js5MapFile.LAND.id)) {
					this.rebuildMapSquares[mapSquaresCount] = (zoneX << 8) + zoneZ;
					this.rebuildMapSquaresGroupIds[mapSquaresCount] = this.mapSquareGroupId(zoneX, zoneZ);
					mapSquaresCount++;
				}
			}
		}
		this.rebuildMapSquaresCount = mapSquaresCount;
		this.method7829(z, x, 3, forceRebuild);
	}

	@ObfuscatedName("rl.at(Lase;I)V")
	public void rebuildRegionMap(PacketBit arg0) {
		this.npcViewDistance = arg0.g1();
		int var2 = arg0.g1();
		int var3 = arg0.g1();
		if (var3 == 1) {
			this.rebuildType = RebuildType.REBUILD_REGION;
		} else if (var3 == 2) {
			this.rebuildType = RebuildType.field5067;
		} else if (var3 == 3) {
			this.rebuildType = RebuildType.field5068;
		} else if (var3 == 4) {
			this.rebuildType = RebuildType.field5069;
		}
		int var4 = arg0.g2();
		int var5 = arg0.g2_alt1();
		int var6 = arg0.g1_alt1();
		boolean var7 = (var6 & 0x1) != 0;
		if (!this.asyncRebuilding) {
			this.method7854();
		}
		this.setBuildAreaSize(BuildAreaSize.buildAreaSizeForId(var2));
		arg0.accessBits();
		HashSet var8 = new HashSet();
		for (int var9 = 0; var9 < 4; var9++) {
			for (int var10 = 0; var10 < this.mapSizeX >> 3; var10++) {
				for (int var11 = 0; var11 < this.mapSizeZ >> 3; var11++) {
					int var12 = arg0.gBit(1);
					if (var12 == 1) {
						int var13 = arg0.gBit(26);
						this.field5057[var9][var10][var11] = var13;
						int var14 = var13 >> 14 & 0x3FF;
						int var15 = var13 >> 3 & 0x7FF;
						int var16 = var14 >> 3 << 8 | var15 >> 3;
						var8.add(var16);
					} else {
						this.field5057[var9][var10][var11] = -1;
					}
				}
			}
		}
		arg0.accessBytes();
		int var17 = var8.size();
		this.rebuildMapSquares = new int[var17];
		this.rebuildMapSquaresGroupIds = new int[var17];
		this.rebuildMapSquaresLands = new byte[var17][];
		this.rebuildMapSquaresLocs = new byte[var17][];
		this.rebuildMapSquaresNpcs = null;
		this.rebuildMapSquaresUnderwaterLands = new byte[var17][];
		this.rebuildMapSquaresUnderwaterLocs = new byte[var17][];
		int var18 = 0;
		for (int var19 = 0; var19 < 4; var19++) {
			for (int var20 = 0; var20 < this.mapSizeX >> 3; var20++) {
				for (int var21 = 0; var21 < this.mapSizeZ >> 3; var21++) {
					int var22 = this.field5057[var19][var20][var21];
					if (var22 != -1) {
						int var23 = var22 >> 14 & 0x3FF;
						int var24 = var22 >> 3 & 0x7FF;
						int var25 = (var23 / 8 << 8) + var24 / 8;
						for (int var26 = 0; var26 < var18; var26++) {
							if (this.rebuildMapSquares[var26] == var25) {
								var25 = -1;
								break;
							}
						}
						if (var25 != -1) {
							int var27 = var25 >> 8 & 0xFF;
							int var28 = var25 & 0xFF;
							if (Client.mapsJs5.isGroupValid(this.mapSquareGroupId(var27, var28), Js5MapFile.LAND.id)) {
								this.rebuildMapSquares[var18] = var25;
								this.rebuildMapSquaresGroupIds[var18] = this.mapSquareGroupId(var27, var28);
								var18++;
							}
						}
					}
				}
			}
		}
		this.rebuildMapSquaresCount = var18;
		this.method7829(var4, var5, 3, var7);
	}

	@ObfuscatedName("rl.ad(I)V")
	public void method7824() {
		this.field5020 = this.rebuildType;
		this.setBuildAreaSize(BuildAreaSize.SIZE_104);
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < this.mapSizeX >> 3; var2++) {
				for (int var3 = 0; var3 < this.mapSizeZ >> 3; var3++) {
					this.field5057[var1][var2][var3] = -1;
				}
			}
		}
		for (CutsceneTemplate var4 = (CutsceneTemplate) CutsceneManager.field1712.method14191(); var4 != null; var4 = (CutsceneTemplate) CutsceneManager.field1712.method14161()) {
			int var5 = var4.field11342;
			boolean var6 = (var5 & 0x1) == 1;
			int var7 = var4.field11337 >> 3;
			int var8 = var4.field11338 >> 3;
			int var9 = var4.field11336;
			int var10 = var4.field11341;
			int var11 = var4.field11344;
			int var12 = var4.field11339;
			int var13 = var4.field11340;
			int var14 = var4.field11343;
			int var15 = 0;
			int var16 = 0;
			byte var17 = 1;
			byte var18 = 1;
			if (var5 == 1) {
				var16 = var13 - 1;
				var17 = -1;
			} else if (var5 == 2) {
				var16 = var13 - 1;
				var15 = var14 - 1;
				var17 = -1;
				var18 = -1;
			} else if (var5 == 3) {
				var15 = var14 - 1;
				var17 = 1;
				var18 = -1;
			}
			int var19 = var8;
			while (var19 < var8 + var14) {
				int var20 = var16;
				int var21 = var7;
				while (var21 < var7 + var13) {
					if (var6) {
						this.field5057[var12][var9 + var15][var10 + var20] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
					} else {
						this.field5057[var12][var9 + var20][var10 + var15] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
					}
					var21++;
					var20 += var17;
				}
				var19++;
				var15 += var18;
			}
		}
		int var22 = Client.field10769;
		this.rebuildMapSquares = new int[var22];
		this.rebuildMapSquaresGroupIds = new int[var22];
		this.rebuildMapSquaresLands = new byte[var22][];
		this.rebuildMapSquaresLocs = new byte[var22][];
		this.rebuildMapSquaresNpcs = null;
		this.rebuildMapSquaresUnderwaterLands = new byte[var22][];
		this.rebuildMapSquaresUnderwaterLocs = new byte[var22][];
		int var23 = 0;
		for (CutsceneTemplate var24 = (CutsceneTemplate) CutsceneManager.field1712.method14191(); var24 != null; var24 = (CutsceneTemplate) CutsceneManager.field1712.method14161()) {
			int var25 = var24.field11337 >>> 3;
			int var26 = var24.field11338 >>> 3;
			int var27 = var24.field11340 + var25;
			if ((var27 & 0x7) == 0) {
				var27--;
			}
			int var28 = var27 >>> 3;
			int var29 = var24.field11343 + var26;
			if ((var29 & 0x7) == 0) {
				var29--;
			}
			int var30 = var29 >>> 3;
			for (int var31 = var25 >>> 3; var31 <= var28; var31++) {
				label84: for (int var32 = var26 >>> 3; var32 <= var30; var32++) {
					int var33 = var31 << 8 | var32;
					for (int var34 = 0; var34 < var23; var34++) {
						if (this.rebuildMapSquares[var34] == var33) {
							continue label84;
						}
					}
					if (Client.mapsJs5.isGroupValid(this.mapSquareGroupId(var31, var32), Js5MapFile.LAND.id)) {
						this.rebuildMapSquares[var23] = var33;
						this.rebuildMapSquaresGroupIds[var23] = this.mapSquareGroupId(var31, var32);
						var23++;
					}
				}
			}
		}
		this.rebuildMapSquaresCount = var23;
		this.method7829(this.mapSizeX >> 4, this.mapSizeZ >> 4, 3, false);
	}

	@ObfuscatedName("rl.am(III)I")
	public int mapSquareGroupId(int zoneX, int zoneZ) {
		return zoneX | zoneZ << 7;
	}

	@ObfuscatedName("rl.au(Lib;I)V")
	public void setBuildAreaSize(BuildAreaSize buildAreaSize) {
		if (this.buildAreaSize == buildAreaSize) {
			return;
		}
		this.mapSizeX = this.mapSizeZ = buildAreaSize.size;
		this.field5057 = new int[4][this.mapSizeX >> 3][this.mapSizeZ >> 3];
		this.field5040 = new int[this.mapSizeX][this.mapSizeZ];
		this.field5041 = new int[this.mapSizeX][this.mapSizeZ];
		this.field5029 = new byte[4][this.mapSizeX][this.mapSizeZ];
		this.field5032 = new LinkMap(4, this.mapSizeX, this.mapSizeZ);
		this.method7737(false);
		Minimap.method829();
		this.buildAreaSize = buildAreaSize;
	}

	@ObfuscatedName("rl.ar(I)V")
	public void method7854() {
		if (RebuildType.field5064 == this.rebuildType || RebuildType.field5064 == this.field5020) {
			return;
		}
		if (RebuildType.REBUILD_REGION == this.rebuildType || RebuildType.field5068 == this.rebuildType || this.field5020 != this.rebuildType && (RebuildType.REBUILD_NORMAL == this.rebuildType || RebuildType.REBUILD_NORMAL == this.field5020)) {
			Iterator var1 = Client.field10838.iterator();
			while (var1.hasNext()) {
				ObjectWrapper var2 = (ObjectWrapper) var1.next();
				PositionedSound.method10111((NpcEntity) var2.field11436);
			}
			Client.field11011 = 0;
			Client.field10906 = 0;
			Client.field10838.method14499();
		}
		this.field5020 = this.rebuildType;
	}

	@ObfuscatedName("rl.ap(IIIZB)V")
	public void method7829(int arg0, int arg1, int arg2, boolean forceRebuild) {
		if (Client.field10863 == 4) {
			if (this.asyncRebuilding) {
				throw new IllegalStateException();
			}
			Client.field10863 = 3;
			Client.field10862 = -1;
		}
		if (!forceRebuild && this.field5022 == arg0 && this.field5059 == arg1) {
			return;
		}
		this.field5022 = arg0;
		this.field5059 = arg1;
		if (!this.asyncRebuilding) {
			Client.setState(arg2);
			MessageBox.method649(LocalisedText.LOADING.forLang(Client.language), true, Client.renderer, DefaultSprites.field9184, DefaultSprites.field2657);
		}
		if (this.field5018 == null) {
			this.field5025 = new CoordGrid(0, 0, 0);
		} else {
			this.field5025 = this.field5018;
		}
		this.field5018 = new CoordGrid(0, (this.field5022 - (this.mapSizeX >> 4)) * 8, (this.field5059 - (this.mapSizeZ >> 4)) * 8);
		this.field5035 = WorldMap.getMap(this.mapSizeX / 2 + this.field5018.x, this.mapSizeX / 2 + this.field5018.z);
		this.field5058 = null;
		this.field5060 = -1L;
		if (!this.asyncRebuilding) {
			this.method7762(arg2);
		}
	}

	@ObfuscatedName("rl.aq(II)V")
	public void method7762(int arg0) {
		int var2 = this.field5018.x - this.field5025.x;
		int var3 = this.field5018.z - this.field5025.z;
		if (arg0 == 3) {
			for (int var4 = 0; var4 < Client.field10906; var4++) {
				ObjectWrapper var5 = Client.field10839[var4];
				if (var5 != null) {
					NpcEntity var6 = (NpcEntity) var5.field11436;
					for (int var7 = 0; var7 < var6.field10450.length; var7++) {
						var6.field10450[var7] -= var2;
						var6.field10448[var7] -= var3;
					}
					Vector3 var8 = Vector3.method6484(var6.method10536().field4298);
					var8.field4308 -= var2 * 512;
					var8.field4313 -= var3 * 512;
					var6.method10531(var8);
					var8.method6486();
				}
			}
		} else {
			boolean var9 = false;
			Client.field11011 = 0;
			int var10 = this.mapSizeX - 512;
			int var11 = this.mapSizeZ - 512;
			for (int var12 = 0; var12 < Client.field10906; var12++) {
				ObjectWrapper var13 = Client.field10839[var12];
				if (var13 != null) {
					NpcEntity var14 = (NpcEntity) var13.field11436;
					Vector3 var15 = Vector3.method6484(var14.method10536().field4298);
					var15.field4308 -= var2 * 512;
					var15.field4313 -= var3 * 512;
					var14.method10531(var15);
					if ((int) var15.field4308 >= 0 && (int) var15.field4308 <= var10 && (int) var15.field4313 >= 0 && (int) var15.field4313 <= var11) {
						boolean var16 = true;
						for (int var17 = 0; var17 < var14.field10450.length; var17++) {
							var14.field10450[var17] -= var2;
							var14.field10448[var17] -= var3;
							if (var14.field10450[var17] < 0 || var14.field10450[var17] >= this.mapSizeX || var14.field10448[var17] < 0 || var14.field10448[var17] >= this.mapSizeZ) {
								var16 = false;
							}
						}
						if (var16) {
							Client.field11036[++Client.field11011 - 1] = var14.field10406;
						} else {
							var14.method19156(null);
							var13.method8440();
							var9 = true;
						}
					} else {
						var14.method19156(null);
						var13.method8440();
						var9 = true;
					}
					var15.method6486();
				}
			}
			if (var9) {
				Client.field10906 = Client.field10838.method14498();
				int var18 = 0;
				Iterator var19 = Client.field10838.iterator();
				while (var19.hasNext()) {
					ObjectWrapper var20 = (ObjectWrapper) var19.next();
					Client.field10839[var18++] = var20;
				}
			}
		}
		for (int var21 = 0; var21 < 2048; var21++) {
			PlayerEntity var22 = Client.field10944[var21];
			if (var22 != null) {
				for (int var23 = 0; var23 < var22.field10450.length; var23++) {
					var22.field10450[var23] -= var2;
					var22.field10448[var23] -= var3;
				}
				Vector3 var24 = Vector3.method6484(var22.method10536().field4298);
				var24.field4308 -= var2 * 512;
				var24.field4313 -= var3 * 512;
				var22.method10531(var24);
				var24.method6486();
			}
		}
		HintArrow[] var25 = Client.field10851;
		for (int var26 = 0; var26 < var25.length; var26++) {
			HintArrow var27 = var25[var26];
			if (var27 != null) {
				var27.field746 = var27.field746 * 262144 - var2 * 512;
				var27.field747 = var27.field747 * 262144 - var3 * 262144;
			}
		}
		for (ChangeLocationRequest var28 = (ChangeLocationRequest) ChangeLocationRequest.field11237.method14191(); var28 != null; var28 = (ChangeLocationRequest) ChangeLocationRequest.field11237.method14161()) {
			var28.field11226 -= var2;
			var28.field11228 -= var3;
			LocType var29 = (LocType) this.field5039.list(var28.field11234);
			int var30;
			int var31;
			if ((var28.field11235 & 0x1) == 0) {
				var30 = var29.width;
				var31 = var29.length;
			} else {
				var30 = var29.length;
				var31 = var29.width;
			}
			if (RebuildType.field5069 != this.rebuildType && (var28.field11226 + var30 <= 0 || var28.field11228 + var31 <= 0 || var28.field11226 >= this.mapSizeX || var28.field11228 >= this.mapSizeZ)) {
				var28.method8440();
			}
		}
		for (ChangeLocationRequest var32 = (ChangeLocationRequest) ChangeLocationRequest.field11242.method14191(); var32 != null; var32 = (ChangeLocationRequest) ChangeLocationRequest.field11242.method14161()) {
			var32.field11226 -= var2;
			var32.field11228 -= var3;
			LocType var33 = (LocType) this.field5039.list(var32.field11234);
			int var34;
			int var35;
			if ((var32.field11235 & 0x1) == 0) {
				var34 = var33.width;
				var35 = var33.length;
			} else {
				var34 = var33.length;
				var35 = var33.width;
			}
			if (RebuildType.field5069 != this.rebuildType && (var32.field11226 + var34 <= 0 || var32.field11228 + var35 <= 0 || var32.field11226 >= this.mapSizeX || var32.field11228 >= this.mapSizeZ)) {
				var32.method8440();
			}
		}
		for (ObjStackList var36 = (ObjStackList) Client.field10964.method14500(); var36 != null; var36 = (ObjStackList) Client.field10964.method14502()) {
			int var37 = (int) (var36.field6760 >> 28 & 0x3L);
			int var38 = (int) (var36.field6760 & 0x3FFFL);
			int var39 = var38 - this.field5018.x;
			int var40 = (int) (var36.field6760 >> 14 & 0x3FFFL);
			int var41 = var40 - this.field5018.z;
			if (this.scene != null) {
				if (var39 >= 0 && var41 >= 0 && var39 < this.mapSizeX && var41 < this.mapSizeZ && var39 < this.scene.maxTileX && var41 < this.scene.maxTileZ) {
					if (this.scene.levelTiles != null) {
						this.scene.removeObjStack(var37, var39, var41);
					}
				} else if (RebuildType.field5069 != this.rebuildType) {
					var36.method8440();
				}
			}
		}
		if (Minimap.field731 != 0) {
			Minimap.field731 -= var2;
			Minimap.field718 -= var3;
		}
		PositionedSound.method13908(false);
		if (arg0 == 3) {
			Client.field10892 -= var2 * 512;
			Client.field10893 -= var3 * 512;
			Client.field8910 -= var2 * 512;
			Client.field3569 -= var3 * 512;
			if (Client.field3416 != 4 && Client.field3416 != 3) {
				Client.method4046(Client.method14298());
			}
		} else {
			Client.field8550 = Client.field8550 * 262144 - var2 * 262144;
			Client.field8492 = Client.field8492 * 262144 - var3 * 262144;
			Client.field6714 -= var2;
			Client.field2626 -= var3;
			Client.field7956 -= var2 * 512;
			Client.field1881 -= var3 * 512;
			if (Math.abs(var2) > this.mapSizeX || Math.abs(var3) > this.mapSizeZ) {
				this.field5062.method10019();
			}
		}
		MiniMenu.method5175();
		Minimap.method5065();
		Client.field10966.method14499();
		Client.field10965.method14152();
		Client.field10864.method14242();
		ParticleSystemRenderer.method3561();
	}

	@ObfuscatedName("rl.ax(I)V")
	public void method7763() {
		this.underwaterMapLoader = null;
		this.mapLoader = null;
		if (this.field5032 != null) {
			this.field5032.method7101();
		}
		if (this.field5062 != null) {
			this.field5062.method9998();
		}
		if (this.scene != null) {
			this.scene.field6959.method8680();
			this.scene = null;
		}
	}

	@ObfuscatedName("rl.av(B)Z")
	public boolean rebuildScene() {
		if (!this.asyncRebuilding) {
			MapLogicRelated.method6969(false);
		}
		if (this.field5060 == -1L) {
			this.field5060 = MonotonicTime.method3655();
		}
		this.field5044 = 0;
		for (int var1 = 0; var1 < this.rebuildMapSquaresCount; var1++) {
			if (!Client.mapsJs5.method6927(this.rebuildMapSquaresGroupIds[var1])) {
				this.field5044++;
			}
		}
		if (this.field5058 == null) {
			if (this.field5035 == null || !Client.worldmapAreaDataJs5.method6904(this.field5035.field12351)) {
				this.field5058 = new WorldMapRelated(0);
			} else if (Client.worldmapAreaDataJs5.method6886(this.field5035.field12351)) {
				this.field5058 = WorldMapRelated.method6046(Client.worldmapAreaDataJs5, this.field5035.field12351, Client.loggedInMembers);
			} else {
				this.field5044++;
			}
		}
		if (this.field5044 > 0) {
			if (this.field5045 < this.field5044) {
				this.field5045 = this.field5044;
			}
			this.rebuildStage = RebuildStage.field5006;
			return false;
		}
		for (int index = 0; index < this.rebuildMapSquaresCount; index++) {
			if (this.rebuildMapSquaresLands[index] == null) {
				this.rebuildMapSquaresLands[index] = Client.mapsJs5.getfile(this.rebuildMapSquaresGroupIds[index], Js5MapFile.LAND.id);
			}
			if (this.rebuildMapSquaresLocs[index] == null) {
				this.rebuildMapSquaresLocs[index] = Client.mapsJs5.getfile(this.rebuildMapSquaresGroupIds[index], Js5MapFile.LOC.id);
			}
			if (this.rebuildMapSquaresUnderwaterLands[index] == null) {
				this.rebuildMapSquaresUnderwaterLands[index] = Client.mapsJs5.getfile(this.rebuildMapSquaresGroupIds[index], Js5MapFile.UNDERWATER_LAND.id);
			}
			if (this.rebuildMapSquaresUnderwaterLocs[index] == null) {
				this.rebuildMapSquaresUnderwaterLocs[index] = Client.mapsJs5.getfile(this.rebuildMapSquaresGroupIds[index], Js5MapFile.UNDERWATER_LOC.id);
			}
			if (this.rebuildMapSquaresNpcs != null && this.rebuildMapSquaresNpcs[index] == null) {
				this.rebuildMapSquaresNpcs[index] = Client.mapsJs5.getfile(this.rebuildMapSquaresGroupIds[index], Js5MapFile.NPC.id);
			}
		}
		int var3 = this.rebuildLocsCount;
		IntegerBox var4 = new IntegerBox(-1);
		IntegerBox var5 = new IntegerBox(-1);
		this.rebuildLocsCount = 0;
		for (int index = 0; index < this.rebuildMapSquaresCount; index++) {
			byte[] locs = this.rebuildMapSquaresLocs[index];
			if (locs != null) {
				int var8 = (this.rebuildMapSquares[index] >> 8) * 64 - this.field5018.x;
				int var9 = (this.rebuildMapSquares[index] & 0xFF) * 64 - this.field5018.z;
				if (this.rebuildType.isRegionType()) {
					var8 = 10;
					var9 = 10;
				}
				int var10 = ClientMapLoader.testReadLocs(this.field5039, locs, var8, var9, this.mapSizeX, this.mapSizeZ, var5, var4);
				if (var10 > 0) {
					this.rebuildLocsCount += var10;
				}
			}
			byte[] ulocs = this.rebuildMapSquaresUnderwaterLocs[index];
			if (ulocs != null) {
				int var12 = (this.rebuildMapSquares[index] >> 8) * 64 - this.field5018.x;
				int var13 = (this.rebuildMapSquares[index] & 0xFF) * 64 - this.field5018.z;
				if (this.rebuildType.isRegionType()) {
					var12 = 10;
					var13 = 10;
				}
				int var14 = ClientMapLoader.testReadLocs(this.field5039, ulocs, var12, var13, this.mapSizeX, this.mapSizeZ, var5, var4);
				if (var14 > 0) {
					this.rebuildLocsCount += var14;
				}
			}
		}
		if (this.rebuildLocsCount > 0) {
			if (this.rebuildLocsCount != var3) {
				this.field5048 = Client.currentclock;
			} else if (this.field5048 != 0 && Client.currentclock - this.field5048 == 1000) {
				GraphicsPacketQueue.method5144(var5.field7958, var4.field7958, this.rebuildLocsCount);
				GraphicsPacketQueue.method9189();
			}
			if (this.field5047 < this.rebuildLocsCount) {
				this.field5047 = this.rebuildLocsCount;
			}
			this.rebuildStage = RebuildStage.field5005;
			return false;
		}
		if (!this.asyncRebuilding && RebuildStage.field5007 != this.rebuildStage) {
			MessageBox.method649(LocalisedText.LOADING.forLang(Client.language) + TextUtil.BR + "(100%)", true, Client.renderer, DefaultSprites.field9184, DefaultSprites.field2657);
		}
		this.rebuildStage = RebuildStage.field5008;
		if (!this.asyncRebuilding && Client.field1798 != null) {
			Client.field1798.method3149();
		}
		if (!this.asyncRebuilding) {
			for (int var15 = 0; var15 < 2048; var15++) {
				PlayerEntity var16 = Client.field10944[var15];
				if (var16 != null) {
					var16.field11716 = null;
				}
			}
			for (int var17 = 0; var17 < Client.field10839.length; var17++) {
				ObjectWrapper var18 = Client.field10839[var17];
				if (var18 != null) {
					((GraphEntity) var18.field11436).field11716 = null;
				}
			}
		}
		if (!this.asyncRebuilding) {
			Client.method14055(true);
		}
		boolean underwater = false;
		if (Client.preferences.waterDetail.getValue() == 2) {
			for (int var20 = 0; var20 < this.rebuildMapSquaresCount; var20++) {
				if (this.rebuildMapSquaresUnderwaterLocs[var20] != null || this.rebuildMapSquaresUnderwaterLands[var20] != null) {
					underwater = true;
					break;
				}
			}
		}
		int var21 = DrawDistance.method17395(Client.preferences.drawDistance.getValue()).field2675;
		if (Client.renderer.method2130()) {
			var21++;
		}
		this.method7820();
		this.method7763();
		this.scene = new Scene(Client.renderer, 9, 4, this.mapSizeX, this.mapSizeZ, var21, underwater, Client.renderer.getMaxLights() > 0);
		this.scene.method8703(false);
		this.scene.method8701(Client.field11005);
		this.scene.method8759(this.field5061);
		if (Client.field11005 == 0) {
			this.scene.method8737(null);
		} else {
			this.scene.method8737(DefaultSprites.field8321);
		}
		this.field5050 = new LocTint();
		this.field5038 = -0.05F + (float) (Math.random() / 10.0D);
		this.mapLoader = new ClientMapLoader(this.scene, this.field5039, 4, this.mapSizeX, this.mapSizeZ, false, this.field5032, this.field5062);
		this.mapLoader.method7136();
		this.mapLoader.sceneryShadows = Client.preferences.sceneryShadows.getValue();
		this.mapLoader.isWaterDetail = Client.preferences.waterDetail.getValue() == 2;
		this.mapLoader.isLightingDetail = Client.preferences.lightingDetail.getValue() == 1;
		this.mapLoader.isGroundBlending = Client.preferences.groundBlending.getValue() == 1;
		this.mapLoader.isTexturing = Client.preferences.textures.getValue() == 1;
		if (this.rebuildType.isRegionType()) {
			this.readRegionLandscape(this.mapLoader, this.rebuildMapSquaresLands);
		} else {
			this.readNormalLandscape(this.mapLoader, this.rebuildMapSquaresLands);
		}
		if (this.asyncRebuilding) {
			this.sleep(50);
		}
		this.field5062.method9991(this.mapSizeX >> 4, this.mapSizeZ >> 4);
		this.field5062.method10003(this);
		if (underwater) {
			this.scene.method8703(true);
			this.underwaterMapLoader = new ClientMapLoader(this.scene, this.field5039, 1, this.mapSizeX, this.mapSizeZ, true, this.field5032, this.field5062);
			this.underwaterMapLoader.method7136();
			this.underwaterMapLoader.sceneryShadows = Client.preferences.sceneryShadows.getValue();
			this.underwaterMapLoader.isWaterDetail = Client.preferences.waterDetail.getValue() == 2;
			this.underwaterMapLoader.isLightingDetail = Client.preferences.lightingDetail.getValue() == 1;
			this.underwaterMapLoader.isGroundBlending = Client.preferences.groundBlending.getValue() == 1;
			this.underwaterMapLoader.isTexturing = Client.preferences.textures.getValue() == 1;
			if (this.rebuildType.isRegionType()) {
				this.readRegionLandscape(this.underwaterMapLoader, this.rebuildMapSquaresUnderwaterLands);
				if (!this.asyncRebuilding) {
					MapLogicRelated.method6969(true);
				}
			} else {
				this.readNormalLandscape(this.underwaterMapLoader, this.rebuildMapSquaresUnderwaterLands);
				if (!this.asyncRebuilding) {
					MapLogicRelated.method6969(true);
				}
			}
			this.underwaterMapLoader.method7143(0, this.mapLoader.levelHeightmap[0]);
			this.underwaterMapLoader.method7144(Client.renderer, null);
			this.scene.method8703(false);
			if (this.asyncRebuilding) {
				this.sleep(50);
			}
		}
		this.mapLoader.method7144(Client.renderer, underwater ? this.underwaterMapLoader.levelHeightmap : (int[][][]) null);
		if (this.rebuildType.isRegionType()) {
			if (!this.asyncRebuilding) {
				MapLogicRelated.method6969(true);
			}
			this.readRegionLocs(this.mapLoader, this.rebuildMapSquaresLocs);
		} else {
			if (!this.asyncRebuilding) {
				MapLogicRelated.method6969(true);
			}
			this.readNormalLocs(this.mapLoader, this.rebuildMapSquaresLocs);
			if (this.rebuildMapSquaresNpcs != null) {
				this.readNpcs();
			}
		}
		if (!this.asyncRebuilding) {
			MapLogicRelated.method6969(true);
		}
		this.mapLoader.method7200(Client.renderer, underwater ? this.scene.field6917[0] : null, null);
		if (this.asyncRebuilding) {
			this.sleep(75);
		}
		this.mapLoader.method16877(Client.renderer, false);
		if (this.asyncRebuilding) {
			this.sleep(75);
		}
		if (!this.asyncRebuilding) {
			MapLogicRelated.method6969(true);
		}
		if (underwater) {
			this.scene.method8703(true);
			if (!this.asyncRebuilding) {
				MapLogicRelated.method6969(true);
			}
			if (this.rebuildType.isRegionType()) {
				this.readRegionLocs(this.underwaterMapLoader, this.rebuildMapSquaresUnderwaterLocs);
			} else {
				this.readNormalLocs(this.underwaterMapLoader, this.rebuildMapSquaresUnderwaterLocs);
			}
			if (!this.asyncRebuilding) {
				MapLogicRelated.method6969(true);
			}
			this.underwaterMapLoader.method7200(Client.renderer, null, this.scene.field6915[0]);
			this.underwaterMapLoader.method16877(Client.renderer, true);
			if (!this.asyncRebuilding) {
				MapLogicRelated.method6969(true);
			}
			this.scene.method8703(false);
			if (this.asyncRebuilding) {
				this.sleep(50);
			}
		}
		this.mapLoader.method7137();
		if (this.underwaterMapLoader != null) {
			this.underwaterMapLoader.method7137();
		}
		this.scene.reset();
		if (this.asyncRebuilding) {
			MonotonicTime.method3655();
			while (!Client.renderer.method2215()) {
				this.sleep(1);
			}
		}
		boolean var22 = false;
		if (this.asyncRebuilding) {
			World var23 = Client.world;
			this.method7752(var23);
			Client.field3183.method7678(var23);
			var22 = true;
			MonotonicTime.method3655();
			Object var24 = Client.field10858;
			synchronized (Client.field10858) {
				Client.field10856 = true;
				try {
					Client.field10858.wait();
				} catch (InterruptedException var44) {
				}
			}
			Client.world = this;
			var23.method7763();
			this.method7762(3);
			this.method7854();
		} else {
			Client.field1798.method3149();
			this.field5062.method9997();
			GameShell.method135();
		}
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < this.mapSizeX; var28++) {
				for (int var29 = 0; var29 < this.mapSizeZ; var29++) {
					Client.method7359(var27, var28, var29);
				}
			}
		}
		for (int var30 = 0; var30 < Client.field10931.length; var30++) {
			if (Client.field10931[var30] != null) {
				Client.field10931[var30].method8406();
			}
		}
		Client.method3128();
		ChangeLocationRequest.method5070();
		if (GameShell.getEnvironment() == GameShell3$Environment.APPLICATION && Client.gameConnection.getStream() != null && Client.state == 3) {
			ClientMessage var31 = ClientMessage.method1604(ClientProt.DETECT_MODIFIED_CLIENT, Client.gameConnection.field794);
			var31.buf.p4(1057001181);
			Client.gameConnection.queue(var31);
		}
		if (!this.rebuildType.isRegionType()) {
			int var32 = (this.field5022 - (this.mapSizeX >> 4)) / 8;
			int var33 = ((this.mapSizeX >> 4) + this.field5022) / 8;
			int var34 = (this.field5059 - (this.mapSizeZ >> 4)) / 8;
			int var35 = ((this.mapSizeZ >> 4) + this.field5059) / 8;
			for (int var36 = var32 - 1; var36 <= var33 + 1; var36++) {
				for (int var37 = var34 - 1; var37 <= var35 + 1; var37++) {
					if (var36 < var32 || var36 > var33 || var37 < var34 || var37 > var35) {
						Client.mapsJs5.method6885(this.mapSquareGroupId(var36, var37));
					}
				}
			}
		}
		long var38 = MonotonicTime.method3655() - this.field5060;
		if (Client.state == 10) {
			Client.setState(4);
		} else if (Client.state == 6) {
			Client.setState(13);
		} else if (Client.state == 16) {
			Client.setState(15);
		} else if (Client.state == 8) {
			Client.setState(0);
		} else {
			Client.setState(18);
			if (Client.gameConnection.getStream() != null) {
				ClientMessage var40 = ClientMessage.method1604(ClientProt.MAP_BUILD_COMPLETE, Client.gameConnection.field794);
				var40.buf.p4((int) var38);
				Client.gameConnection.queue(var40);
			}
		}
		if (this.field5037) {
			DeveloperConsole.addline(Long.toString(MonotonicTime.method3655() - this.field5056));
			this.field5037 = false;
		}
		if (var22) {
			Object var41 = Client.field10920;
			synchronized (Client.field10920) {
				Client.field10920.notify();
			}
		}
		return true;
	}

	@ObfuscatedName("rl.ao(II)V")
	public void sleep(int millis) {
		try {
			Thread.sleep((long) millis);
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("rl.aj(Laih;[[BI)V")
	public void readNormalLandscape(ClientMapLoader mapLoader, byte[][] mapSquareLands) {
		int length = mapSquareLands.length;
		for (int index = 0; index < length; index++) {
			byte[] lands = mapSquareLands[index];
			if (lands != null) {
				Packet buf = new Packet(lands);
				int var7 = this.rebuildMapSquares[index] >> 8;
				int var8 = this.rebuildMapSquares[index] & 0xFF;
				int var9 = var7 * 64 - this.field5018.x;
				int var10 = var8 * 64 - this.field5018.z;
				if (!this.asyncRebuilding && Client.field1798 != null) {
					Client.field1798.method3149();
				}
				mapLoader.readNormalLandscape(buf, var9, var10, this.field5018.x, this.field5018.z);
				mapLoader.readNormalEnvironment(Client.renderer, buf, var9, var10);
			}
		}
		for (int index = 0; index < length; index++) {
			int var12 = (this.rebuildMapSquares[index] >> 8) * 64 - this.field5018.x;
			int var13 = (this.rebuildMapSquares[index] & 0xFF) * 64 - this.field5018.z;
			byte[] lands = mapSquareLands[index];
			if (lands == null && this.field5059 < 800) {
				if (!this.asyncRebuilding && Client.field1798 != null) {
					Client.field1798.method3149();
				}
				mapLoader.method7167(var12, var13, 64, 64);
			}
		}
	}

	@ObfuscatedName("rl.ay(Laih;[[BI)V")
	public void readRegionLandscape(ClientMapLoader mapLoader, byte[][] mapSquareLands) {
		for (int level = 0; level < mapLoader.levels; level++) {
			if (!this.asyncRebuilding) {
				Client.field1798.method3149();
			}
			for (int x = 0; x < this.mapSizeX >> 3; x++) {
				for (int z = 0; z < this.mapSizeZ >> 3; z++) {
					int var6 = this.field5057[level][x][z];
					if (var6 != -1) {
						int var7 = var6 >> 24 & 0x3;
						if (!mapLoader.underwater || var7 == 0) {
							int var8 = var6 >> 1 & 0x3;
							int var9 = var6 >> 14 & 0x3FF;
							int var10 = var6 >> 3 & 0x7FF;
							int var11 = (var9 / 8 << 8) + var10 / 8;
							for (int var12 = 0; var12 < this.rebuildMapSquares.length; var12++) {
								if (this.rebuildMapSquares[var12] == var11 && mapSquareLands[var12] != null) {
									Packet buf = new Packet(mapSquareLands[var12]);
									mapLoader.readRegionLandscape(buf, level, x * 8, z * 8, var7, var9, var10, var8);
									mapLoader.readRegionEnvironment(Client.renderer, buf, level, x * 8, z * 8, var7, var9, var10, var8);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int level = 0; level < mapLoader.levels; level++) {
			if (!this.asyncRebuilding) {
				Client.field1798.method3149();
			}
			for (int x = 0; x < this.mapSizeX >> 3; x++) {
				for (int z = 0; z < this.mapSizeZ >> 3; z++) {
					int var17 = this.field5057[level][x][z];
					if (var17 == -1) {
						mapLoader.method7139(level, x * 8, z * 8, 8, 8);
					}
				}
			}
		}
	}

	@ObfuscatedName("rl.ab(Laih;[[BB)V")
	public void readNormalLocs(ClientMapLoader mapLoader, byte[][] mapSquareLocs) {
		for (int index = 0; index < this.rebuildMapSquaresCount; index++) {
			byte[] locs = mapSquareLocs[index];
			if (locs != null) {
				int var5 = (this.rebuildMapSquares[index] >> 8) * 64 - this.field5018.x;
				int var6 = (this.rebuildMapSquares[index] & 0xFF) * 64 - this.field5018.z;
				if (!this.asyncRebuilding) {
					Client.field1798.method3149();
				}
				mapLoader.readNormalLocs(Client.renderer, locs, var5, var6);
				if (this.asyncRebuilding) {
					this.sleep(10);
				}
			}
		}
	}

	@ObfuscatedName("rl.az(Laih;[[BS)V")
	public void readRegionLocs(ClientMapLoader mapLoader, byte[][] mapSquareLocs) {
		for (int level = 0; level < mapLoader.levels; level++) {
			if (!this.asyncRebuilding) {
				Client.field1798.method3149();
			}
			for (int x = 0; x < this.mapSizeX >> 3; x++) {
				for (int z = 0; z < this.mapSizeZ >> 3; z++) {
					int var6 = this.field5057[level][x][z];
					if (var6 != -1) {
						int var7 = var6 >> 24 & 0x3;
						if (!mapLoader.underwater || var7 == 0) {
							int var8 = var6 >> 1 & 0x3;
							int var9 = var6 >> 14 & 0x3FF;
							int var10 = var6 >> 3 & 0x7FF;
							int var11 = (var9 / 8 << 8) + var10 / 8;
							for (int var12 = 0; var12 < this.rebuildMapSquares.length; var12++) {
								if (this.rebuildMapSquares[var12] == var11 && mapSquareLocs[var12] != null) {
									mapLoader.readRegionLocs(Client.renderer, mapSquareLocs[var12], level, x * 8, z * 8, var7, (var9 & 0x7) * 8, (var10 & 0x7) * 8, var8);
									break;
								}
							}
						}
					}
					if (this.asyncRebuilding) {
						this.sleep(5);
					}
				}
			}
		}
	}

	@ObfuscatedName("rl.aa(B)V")
	public void readNpcs() {
		int length = this.rebuildMapSquaresNpcs.length;
		for (int index = 0; index < length; index++) {
			if (this.rebuildMapSquaresNpcs[index] != null) {
				int var3 = -1;
				for (int var4 = 0; var4 < Client.field10938; var4++) {
					if (Client.field10859[var4] == this.rebuildMapSquares[index]) {
						var3 = var4;
						break;
					}
				}
				if (var3 == -1) {
					Client.field10859[Client.field10938] = this.rebuildMapSquares[index];
					var3 = ++Client.field10938 - 1;
				}
				Packet buf = new Packet(this.rebuildMapSquaresNpcs[index]);
				int var6 = 0;
				while (buf.pos < this.rebuildMapSquaresNpcs[index].length && var6 < 511 && Client.field11011 < 1023) {
					int var7 = var3 | var6++ << 6;
					int var8 = buf.g2();
					int var9 = var8 >> 14;
					int var10 = var8 >> 7 & 0x3F;
					int var11 = var8 & 0x3F;
					int var12 = (this.rebuildMapSquares[index] >> 8) * 64 - this.field5018.x + var10;
					int var13 = (this.rebuildMapSquares[index] & 0xFF) * 64 - this.field5018.z + var11;
					NPCType var14 = (NPCType) Client.npcTypeList.list(buf.g2());
					ObjectWrapper var15 = (ObjectWrapper) Client.field10838.method14495((long) var7);
					if (var15 == null && (var14.field2743 & 0x1) > 0 && var12 >= 0 && var14.size + var12 < this.mapSizeX && var13 >= 0 && var14.size + var13 < this.mapSizeZ) {
						NpcEntity npc = new NpcEntity(this.scene);
						npc.field10406 = var7;
						ObjectWrapper var17 = new ObjectWrapper(npc);
						Client.field10838.method14501(var17, (long) var7);
						Client.field10839[++Client.field10906 - 1] = var17;
						Client.field11036[++Client.field11011 - 1] = var7;
						npc.field10440 = Client.currentclock;
						npc.method19156(var14);
						npc.method16502(npc.npcType.size);
						npc.field10444 = npc.npcType.field2731 << 3;
						npc.method16491(npc.npcType.field2727.method13895().getId() << 11 & 0x3FFF, true);
						npc.method19159(var9, var12, var13, true, npc.method16546());
					}
				}
			}
		}
	}
}
