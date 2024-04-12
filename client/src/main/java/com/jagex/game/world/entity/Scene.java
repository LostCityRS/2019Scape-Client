package com.jagex.game.world.entity;

import com.jagex.game.client.HardShadow;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.graphics.scenegraph.*;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("tx")
public class Scene {

	@ObfuscatedName("tx.e")
	public static boolean field6937 = true;

	@ObfuscatedName("tx.n")
	public final int size;

	@ObfuscatedName("tx.m")
	public final int field6901;

	@ObfuscatedName("tx.k")
	public final int field6924;

	@ObfuscatedName("tx.f")
	public final int field6903 = 16;

	@ObfuscatedName("tx.w")
	public final Toolkit toolkit;

	@ObfuscatedName("tx.l")
	public SceneDebugging debugger;

	@ObfuscatedName("tx.u")
	public final boolean lighting;

	@ObfuscatedName("tx.z")
	public boolean field6955;

	@ObfuscatedName("tx.p")
	public final OcclusionManager occlusionManager;

	@ObfuscatedName("tx.d")
	public int maxLevel;

	@ObfuscatedName("tx.c")
	public final int maxTileX;

	@ObfuscatedName("tx.r")
	public final int maxTileZ;

	@ObfuscatedName("tx.v")
	public Tile[][][] levelTiles;

	@ObfuscatedName("tx.o")
	public FloorModel[] levelHeightmaps;

	@ObfuscatedName("tx.s")
	public Tile[][][] field6904;

	@ObfuscatedName("tx.y")
	public FloorModel[] field6915;

	@ObfuscatedName("tx.q")
	public Tile[][][] field6914;

	@ObfuscatedName("tx.x")
	public FloorModel[] underwaterLevelHeightMaps;

	@ObfuscatedName("tx.b")
	public int[][] waterFogColour;

	@ObfuscatedName("tx.h")
	public short[][] waterFogScale;

	@ObfuscatedName("tx.a")
	public byte[][] waterFogOffset;

	@ObfuscatedName("tx.g")
	public byte[][] field6921;

	@ObfuscatedName("tx.i")
	public byte[][] field6963;

	@ObfuscatedName("tx.j")
	public byte[][] field6905;

	@ObfuscatedName("tx.t")
	public int entityCount = 0;

	@ObfuscatedName("tx.ae")
	public final int field6925 = 10078;

	@ObfuscatedName("tx.ag")
	public final int field6899 = 5096;

	@ObfuscatedName("tx.ah")
	public final int field6932 = 5005;

	@ObfuscatedName("tx.al")
	public final GraphEntity[] field6916;

	@ObfuscatedName("tx.ac")
	public final GraphEntity[] field6929;

	@ObfuscatedName("tx.ai")
	public final GraphEntity[] field6945;

	@ObfuscatedName("tx.aw")
	public int field6931;

	@ObfuscatedName("tx.as")
	public int field6918;

	@ObfuscatedName("tx.at")
	public final GraphEntity[] field6933;

	@ObfuscatedName("tx.ad")
	public final GraphEntity[] field6934;

	@ObfuscatedName("tx.am")
	public final PrimaryLayerEntity[] entities;

	@ObfuscatedName("tx.au")
	public int eyeTileX;

	@ObfuscatedName("tx.ar")
	public int eyeTileZ;

	@ObfuscatedName("tx.ap")
	public int eyeX;

	@ObfuscatedName("tx.aq")
	public int eyeZ;

	@ObfuscatedName("tx.ax")
	public int eyeY;

	@ObfuscatedName("tx.av")
	public int cycle;

	@ObfuscatedName("tx.ao")
	public int drawDistance;

	@ObfuscatedName("tx.aj")
	public int field6943;

	@ObfuscatedName("tx.ay")
	public int field6944;

	@ObfuscatedName("tx.ab")
	public int minDrawTileX;

	@ObfuscatedName("tx.az")
	public int maxDrawTileX;

	@ObfuscatedName("tx.aa")
	public int minDrawTileZ;

	@ObfuscatedName("tx.af")
	public int maxDrawTileZ;

	@ObfuscatedName("tx.ak")
	public final float[] field6927 = new float[3];

	@ObfuscatedName("tx.an")
	public final Light[] field6950 = new Light[8];

	@ObfuscatedName("tx.bf")
	public final int field6951 = 1;

	@ObfuscatedName("tx.bk")
	public int field6953;

	@ObfuscatedName("tx.bh")
	public long[][][] field6954;

	@ObfuscatedName("tx.bx")
	public StaticPointLight[] field6926;

	@ObfuscatedName("tx.bd")
	public boolean[] field6956;

	@ObfuscatedName("tx.bc")
	public HashMap field6957 = new HashMap();

	@ObfuscatedName("tx.bi")
	public HashMap field6958 = new HashMap();

	@ObfuscatedName("tx.bn")
	public PickableEntityList pickableEntities;

	@ObfuscatedName("tx.bt")
	public boolean[][] field6960;

	@ObfuscatedName("tx.bq")
	public final int[] field6908;

	@ObfuscatedName("tx.bm")
	public boolean[][] visibilityMap;

	@ObfuscatedName("tx.bb")
	public boolean[][] field6922;

	public Scene(Toolkit toolkit, int size, int maxLevel, int maxTileX, int maxTileZ, int drawDistance, boolean underwater, boolean lights) {
		this.toolkit = toolkit;
		this.lighting = this.toolkit.getMaxLights() > 0;
		this.size = size;
		this.field6901 = 0x1 << this.size;
		this.field6924 = this.field6901 >> 1;
		this.maxLevel = maxLevel;
		this.maxTileX = maxTileX;
		this.maxTileZ = maxTileZ;
		this.drawDistance = drawDistance;
		this.debugger = new SceneDebugging();
		this.occlusionManager = new OcclusionManager(this);
		this.field6904 = new Tile[maxLevel][this.maxTileX][this.maxTileZ];
		this.field6915 = new FloorModel[maxLevel];
		if (underwater) {
			this.waterFogColour = new int[this.maxTileX][this.maxTileZ];
			this.waterFogOffset = new byte[this.maxTileX][this.maxTileZ];
			this.waterFogScale = new short[this.maxTileX][this.maxTileZ];
			this.field6921 = new byte[this.maxTileX][this.maxTileZ];
			this.field6963 = new byte[this.maxTileX][this.maxTileZ];
			this.field6905 = new byte[this.maxTileX][this.maxTileZ];
			this.field6914 = new Tile[1][this.maxTileX][this.maxTileZ];
			this.underwaterLevelHeightMaps = new FloorModel[1];
		}
		if (lights) {
			this.field6954 = new long[maxLevel][maxTileX][maxTileZ];
			this.field6926 = new StaticPointLight[65253];
			this.field6956 = new boolean[65253];
			this.field6953 = 0;
		}
		this.method8703(false);
		this.field6916 = new GraphEntity[2];
		this.field6929 = new GraphEntity[2];
		this.field6945 = new GraphEntity[2];
		this.field6934 = new GraphEntity[10078];
		this.field6931 = 0;
		this.field6933 = new GraphEntity[5096];
		this.field6918 = 0;
		this.entities = new PrimaryLayerEntity[5005];
		this.entityCount = 0;
		this.visibilityMap = new boolean[this.drawDistance + this.drawDistance + 1][this.drawDistance + this.drawDistance + 1];
		this.field6960 = new boolean[this.drawDistance + this.drawDistance + 2][this.drawDistance + this.drawDistance + 2];
		this.field6908 = new int[this.drawDistance + this.drawDistance + 2];
		this.pickableEntities = new PickableEntityList(false);
	}

	@ObfuscatedName("tx.e(IB)V")
	public void method8701(int arg0) {
	}

	@ObfuscatedName("tx.n(Leu;B)V")
	public void method8737(Font arg0) {
	}

	@ObfuscatedName("tx.m(ZI)V")
	public void method8703(boolean arg0) {
		if (arg0) {
			this.levelTiles = this.field6914;
			this.levelHeightmaps = this.underwaterLevelHeightMaps;
		} else {
			this.levelTiles = this.field6904;
			this.levelHeightmaps = this.field6915;
		}
		this.maxLevel = this.levelTiles.length;
	}

	@ObfuscatedName("tx.k(I)V")
	public void reset() {
		for (int x = 0; x < this.maxTileX; x++) {
			for (int z = 0; z < this.maxTileZ; z++) {
				if (this.levelTiles[0][x][z] == null) {
					this.levelTiles[0][x][z] = new Tile(0);
				}
			}
		}
	}

	@ObfuscatedName("tx.f(III)V")
	public void setBridge(int x, int z) {
		Tile ground = this.levelTiles[0][x][z];
		for (int level = 0; level < 3; level++) {
			Tile tile = this.levelTiles[level][x][z] = this.levelTiles[level + 1][x][z];
			if (tile != null) {
				for (PrimaryLayerEntityList var6 = tile.entities; var6 != null; var6 = var6.field7058) {
					PrimaryLayerEntity var7 = var6.field7057;
					if (var7.minSceneTileX == x && var7.minSceneTileZ == z) {
						var7.level--;
					}
				}
				if (tile.groundDecoration != null) {
					tile.groundDecoration.level--;
				}
				if (tile.wall != null) {
					tile.wall.level--;
				}
				if (tile.dynamicWall != null) {
					tile.dynamicWall.level--;
				}
				if (tile.wallDecoration != null) {
					tile.wallDecoration.level--;
				}
				if (tile.dynamicWallDecoration != null) {
					tile.dynamicWallDecoration.level--;
				}
			}
		}
		if (this.levelTiles[0][x][z] == null) {
			this.levelTiles[0][x][z] = new Tile(0);
			this.levelTiles[0][x][z].level = 1;
		}
		this.levelTiles[0][x][z].bridge = ground;
		this.levelTiles[3][x][z] = null;
	}

	@ObfuscatedName("tx.w(IIIB)Ltk;")
	public Tile getTile(int level, int x, int z) {
		if (this.levelTiles[level][x][z] == null) {
			boolean bridged = this.levelTiles[0][x][z] != null && this.levelTiles[0][x][z].bridge != null;
			if (bridged && level >= this.maxLevel - 1) {
				return null;
			}
			this.createTile(level, x, z);
		}
		return this.levelTiles[level][x][z];
	}

	@ObfuscatedName("tx.l(IIIB)Ltk;")
	public Tile getTileCoerce(int level, int x, int z) {
		return this.getTile(level, Math.min(this.maxTileX - 1, Math.max(0, x)), Math.min(this.maxTileZ - 1, Math.max(0, z)));
	}

	@ObfuscatedName("tx.u(IIII)V")
	public void createTile(int level, int x, int z) {
		boolean bridged = this.levelTiles[0][x][z] != null && this.levelTiles[0][x][z].bridge != null;
		for (int l = level; l >= 0; l--) {
			if (this.levelTiles[l][x][z] == null) {
				Tile tile = this.levelTiles[l][x][z] = new Tile(l);
				if (bridged) {
					tile.level++;
				}
			}
		}
	}

	@ObfuscatedName("tx.z(ILcb;I)V")
	public void setLevelHeightmap(int level, FloorModel floor) {
		this.levelHeightmaps[level] = floor;
	}

	@ObfuscatedName("tx.p(III)I")
	public int getWaterFogScale(int x, int z) {
		return this.waterFogScale == null ? 0 : this.waterFogScale[x][z] & 0xFFFF;
	}

	@ObfuscatedName("tx.d(IIB)I")
	public int getWaterFogColour(int x, int z) {
		return this.waterFogColour == null ? 0 : this.waterFogColour[x][z] & 0xFFFFFF;
	}

	@ObfuscatedName("tx.c(III)I")
	public int getWaterFogOffset(int x, int z) {
		return this.waterFogOffset == null ? 0 : this.waterFogOffset[x][z] & 0xFF;
	}

	@ObfuscatedName("tx.r(IIS)I")
	public int method8713(int x, int z) {
		return this.field6921 == null ? 0 : this.field6921[x][z] & 0xFF;
	}

	@ObfuscatedName("tx.v(IIB)I")
	public int method8760(int x, int z) {
		return this.field6963 == null ? 0 : this.field6963[x][z] & 0xFF;
	}

	@ObfuscatedName("tx.o(IIB)I")
	public int method8715(int x, int z) {
		return this.field6905 == null ? 0 : this.field6905[x][z] & 0xFF;
	}

	@ObfuscatedName("tx.s(IIIIIIIII)V")
	public void setWaterFog(int x, int z, int colour, int scale, int offset, int arg5, int arg6, int arg7) {
		if (this.waterFogColour != null) {
			this.waterFogColour[x][z] = colour | 0xFF000000;
		}
		if (this.waterFogScale != null) {
			this.waterFogScale[x][z] = (short) scale;
		}
		if (this.waterFogOffset != null) {
			this.waterFogOffset[x][z] = (byte) offset;
		}
		if (this.field6921 != null) {
			this.field6921[x][z] = (byte) arg5;
		}
		if (this.field6963 != null) {
			this.field6963[x][z] = (byte) arg6;
		}
		if (this.field6905 != null) {
			this.field6905[x][z] = (byte) arg7;
		}
	}

	@ObfuscatedName("tx.y(IIILasv;B)V")
	public void addGroundDecoration(int level, int x, int z, GroundDecorLayerEntity groundDecoration) {
		Tile tile = this.getTile(level, x, z);
		if (tile == null) {
			return;
		}
		tile.groundDecoration = groundDecoration;
		int var6 = this.underwaterLevelHeightMaps == this.levelHeightmaps ? 1 : 0;
		if (!groundDecoration.method16488()) {
			groundDecoration.field11712 = this.field6945[var6];
			this.field6945[var6] = groundDecoration;
		} else if (groundDecoration.method16489()) {
			groundDecoration.field11712 = this.field6929[var6];
			this.field6929[var6] = groundDecoration;
		} else {
			groundDecoration.field11712 = this.field6916[var6];
			this.field6916[var6] = groundDecoration;
		}
	}

	@ObfuscatedName("tx.q(IIIILast;S)V")
	public void addObjStack(int level, int x, int z, int arg3, ObjLayerEntity objStack) {
		Tile tile = this.getTile(level, x, z);
		if (tile == null) {
			return;
		}
		objStack.method10531(new Vector3((float) ((x << this.size) + this.field6924), (float) arg3, (float) ((z << this.size) + this.field6924)));
		tile.objStack = objStack;
		int var7 = this.underwaterLevelHeightMaps == this.levelHeightmaps ? 1 : 0;
		if (!objStack.method16488()) {
			objStack.field11712 = this.field6945[var7];
			this.field6945[var7] = objStack;
		} else if (objStack.method16489()) {
			objStack.field11712 = this.field6929[var7];
			this.field6929[var7] = objStack;
		} else {
			objStack.field11712 = this.field6916[var7];
			this.field6916[var7] = objStack;
		}
	}

	@ObfuscatedName("tx.x(IIILasw;Lasw;I)V")
	public void addWall(int level, int x, int z, WallLayerEntity wall, WallLayerEntity dynamicWall) {
		Tile tile = this.getTile(level, x, z);
		if (tile == null) {
			return;
		}
		tile.wall = wall;
		tile.dynamicWall = dynamicWall;
		int var7 = this.underwaterLevelHeightMaps == this.levelHeightmaps ? 1 : 0;
		if (!wall.method16488()) {
			wall.field11712 = this.field6945[var7];
			this.field6945[var7] = wall;
		} else if (wall.method16489()) {
			wall.field11712 = this.field6929[var7];
			this.field6929[var7] = wall;
		} else {
			wall.field11712 = this.field6916[var7];
			this.field6916[var7] = wall;
		}
		if (dynamicWall == null) {
			return;
		}
		if (!dynamicWall.method16488()) {
			dynamicWall.field11712 = this.field6945[var7];
			this.field6945[var7] = dynamicWall;
		} else if (dynamicWall.method16489()) {
			dynamicWall.field11712 = this.field6929[var7];
			this.field6929[var7] = dynamicWall;
		} else {
			dynamicWall.field11712 = this.field6916[var7];
			this.field6916[var7] = dynamicWall;
		}
	}

	@ObfuscatedName("tx.b(IIILasm;Lasm;B)V")
	public void addWallDecoration(int level, int x, int z, WallDecorLayerEntity wallDecoration, WallDecorLayerEntity dynamicWallDecoration) {
		Tile tile = this.getTile(level, x, z);
		if (tile == null) {
			return;
		}
		tile.wallDecoration = wallDecoration;
		tile.dynamicWallDecoration = dynamicWallDecoration;
		int var7 = this.underwaterLevelHeightMaps == this.levelHeightmaps ? 1 : 0;
		if (!wallDecoration.method16488()) {
			wallDecoration.field11712 = this.field6945[var7];
			this.field6945[var7] = wallDecoration;
		} else if (wallDecoration.method16489()) {
			wallDecoration.field11712 = this.field6929[var7];
			this.field6929[var7] = wallDecoration;
		} else {
			wallDecoration.field11712 = this.field6916[var7];
			this.field6916[var7] = wallDecoration;
		}
		if (dynamicWallDecoration == null) {
			return;
		}
		if (!dynamicWallDecoration.method16488()) {
			dynamicWallDecoration.field11712 = this.field6945[var7];
			this.field6945[var7] = dynamicWallDecoration;
		} else if (dynamicWallDecoration.method16489()) {
			dynamicWallDecoration.field11712 = this.field6929[var7];
			this.field6929[var7] = dynamicWallDecoration;
		} else {
			dynamicWallDecoration.field11712 = this.field6916[var7];
			this.field6916[var7] = dynamicWallDecoration;
		}
	}

	@ObfuscatedName("tx.h(Lash;ZI)Z")
	public boolean addEntity(PrimaryLayerEntity entity, boolean arg1) {
		boolean var3 = this.underwaterLevelHeightMaps == this.levelHeightmaps;
		int colour = 0;
		short scale = 0;
		byte offset = 0;
		entity.method16529();
		short var7 = 0;
		int minX = Math.min(this.maxTileX - 1, Math.max(0, entity.minSceneTileX));
		int maxX = Math.min(this.maxTileX - 1, Math.max(0, entity.maxSceneTileX));
		int minZ = Math.min(this.maxTileZ - 1, Math.max(0, entity.minSceneTileZ));
		int maxZ = Math.min(this.maxTileZ - 1, Math.max(0, entity.maxSceneTileZ));
		for (int x = minX; x <= maxX; x++) {
			for (int z = minZ; z <= maxZ; z++) {
				Tile tile = this.getTileCoerce(entity.level, x, z);
				if (tile != null) {
					PrimaryLayerEntityList var15 = PrimaryLayerEntityList.method644(entity);
					PrimaryLayerEntityList var16 = tile.entities;
					if (var16 == null) {
						tile.entities = var15;
					} else {
						while (var16.field7058 != null) {
							var16 = var16.field7058;
						}
						var16.field7058 = var15;
					}
					if (var3 && (this.waterFogColour[x][z] & 0xFF000000) != 0) {
						colour = this.waterFogColour[x][z];
						scale = this.waterFogScale[x][z];
						offset = this.waterFogOffset[x][z];
					}
					if (!arg1 && tile.groundDecoration != null && tile.groundDecoration.field12448 > var7) {
						var7 = tile.groundDecoration.field12448;
					}
				}
			}
		}
		if (var3 && (colour & 0xFF000000) != 0) {
			for (int x = minX; x <= maxX; x++) {
				for (int z = minZ; z <= maxZ; z++) {
					if ((this.waterFogColour[x][z] & 0xFF000000) == 0) {
						this.waterFogColour[x][z] = colour;
						this.waterFogScale[x][z] = scale;
						this.waterFogOffset[x][z] = offset;
					}
				}
			}
		}
		if (arg1) {
			this.entities[++this.entityCount - 1] = entity;
			entity.scene = this;
		} else {
			int var19 = this.underwaterLevelHeightMaps == this.levelHeightmaps ? 1 : 0;
			if (!entity.method16488()) {
				entity.field11712 = this.field6945[var19];
				this.field6945[var19] = entity;
			} else if (entity.method16489()) {
				entity.field11712 = this.field6929[var19];
				this.field6929[var19] = entity;
			} else {
				entity.field11712 = this.field6916[var19];
				this.field6916[var19] = entity;
			}
		}
		if (arg1) {
			Vector3 var20 = Vector3.create(entity.getTransform().trans);
			var20.y -= var7;
			entity.method10531(var20);
			var20.release();
		}
		return true;
	}

	@ObfuscatedName("tx.a(IIIII)V")
	public void setWallDecorationOffset(int level, int x, int z, int walloff) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return;
		}
		WallDecorLayerEntity wallDecoration = tile.wallDecoration;
		WallDecorLayerEntity dynamicWallDecoration = tile.dynamicWallDecoration;
		if (wallDecoration != null) {
			wallDecoration.field12452 = (short) (wallDecoration.field12452 * walloff / (0x10 << this.size - 7));
			wallDecoration.field12451 = (short) (wallDecoration.field12451 * walloff / (0x10 << this.size - 7));
		}
		if (dynamicWallDecoration != null) {
			dynamicWallDecoration.field12452 = (short) (dynamicWallDecoration.field12452 * walloff / (0x10 << this.size - 7));
			dynamicWallDecoration.field12451 = (short) (dynamicWallDecoration.field12451 * walloff / (0x10 << this.size - 7));
		}
	}

	@ObfuscatedName("tx.g(I)V")
	public void clearEntities() {
		for (int var1 = 0; var1 < this.entityCount; var1++) {
			PrimaryLayerEntity var2 = this.entities[var1];
			this.removeEntity(var2, true);
			this.entities[var1] = null;
		}
		this.entityCount = 0;
	}

	@ObfuscatedName("tx.i(IIIB)Lasw;")
	public WallLayerEntity removeWall(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile != null) {
			this.method8732(tile.wall);
			if (tile.wall != null) {
				WallLayerEntity wall = tile.wall;
				tile.wall = null;
				return wall;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.j(IIIB)Lasw;")
	public WallLayerEntity removeDynamicWall(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile != null) {
			this.method8732(tile.dynamicWall);
			if (tile.dynamicWall != null) {
				WallLayerEntity wall = tile.dynamicWall;
				tile.dynamicWall = null;
				return wall;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.t(IIII)Lasm;")
	public WallDecorLayerEntity removeWallDecoration(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile != null) {
			this.method8732(tile.wallDecoration);
			if (tile.wallDecoration != null) {
				WallDecorLayerEntity wallDecoration = tile.wallDecoration;
				tile.wallDecoration = null;
				return wallDecoration;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.ae(IIII)Lasm;")
	public WallDecorLayerEntity removeDynamicWallDecoration(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile != null) {
			this.method8732(tile.dynamicWallDecoration);
			if (tile.dynamicWallDecoration != null) {
				WallDecorLayerEntity wallDecoration = tile.dynamicWallDecoration;
				tile.dynamicWallDecoration = null;
				return wallDecoration;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.ag(IIIB)Lasv;")
	public GroundDecorLayerEntity removeGroundDecoration(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return null;
		}
		this.method8732(tile.groundDecoration);
		if (tile.groundDecoration == null) {
			return null;
		} else {
			GroundDecorLayerEntity groundDecoration = tile.groundDecoration;
			tile.groundDecoration = null;
			return groundDecoration;
		}
	}

	@ObfuscatedName("tx.ah(IIIB)Last;")
	public ObjLayerEntity removeObjStack(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return null;
		} else {
			ObjLayerEntity objStack = tile.objStack;
			tile.objStack = null;
			this.method8732(objStack);
			return objStack;
		}
	}

	@ObfuscatedName("tx.al(IIILtd;I)Lash;")
	public PrimaryLayerEntity removeEntity(int level, int x, int z, PrimaryLayerEntityPredicate arg3) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return null;
		}
		for (PrimaryLayerEntityList nextEntity = tile.entities; nextEntity != null; nextEntity = nextEntity.field7058) {
			PrimaryLayerEntity entity = nextEntity.field7057;
			if ((arg3 == null || arg3.method478(entity)) && entity.minSceneTileX == x && entity.minSceneTileZ == z) {
				this.removeEntity(entity, false);
				return entity;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.ac(Lash;ZI)V")
	public void removeEntity(PrimaryLayerEntity entity, boolean arg1) {
		int minX = Math.min(this.maxTileX - 1, Math.max(0, entity.minSceneTileX));
		int maxX = Math.min(this.maxTileX - 1, Math.max(0, entity.maxSceneTileX));
		int minZ = Math.min(this.maxTileZ - 1, Math.max(0, entity.minSceneTileZ));
		int maxZ = Math.min(this.maxTileZ - 1, Math.max(0, entity.maxSceneTileZ));
		for (int x = minX; x <= maxX; x++) {
			for (int z = minZ; z <= maxZ; z++) {
				Tile tile = this.levelTiles[entity.level][x][z];
				if (tile != null) {
					PrimaryLayerEntityList var10 = tile.entities;
					PrimaryLayerEntityList var11 = null;
					while (var10 != null) {
						if (var10.field7057 == entity) {
							if (var11 == null) {
								tile.entities = var10.field7058;
							} else {
								var11.field7058 = var10.field7058;
							}
							var10.method8973();
							break;
						}
						var11 = var10;
						var10 = var10.field7058;
					}
				}
			}
		}
		if (!arg1) {
			this.method8732(entity);
		}
	}

	@ObfuscatedName("tx.ai(Lalh;B)V")
	public void method8732(GraphEntity arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method10537();
		for (int var2 = 0; var2 < 2; var2++) {
			GraphEntity var3 = null;
			for (GraphEntity var4 = this.field6916[var2]; var4 != null; var4 = var4.field11712) {
				if (arg0 == var4) {
					if (var3 == null) {
						this.field6916[var2] = var4.field11712;
					} else {
						var3.field11712 = var4.field11712;
					}
					return;
				}
				var3 = var4;
			}
			GraphEntity var5 = null;
			for (GraphEntity var6 = this.field6929[var2]; var6 != null; var6 = var6.field11712) {
				if (arg0 == var6) {
					if (var5 == null) {
						this.field6929[var2] = var6.field11712;
					} else {
						var5.field11712 = var6.field11712;
					}
					return;
				}
				var5 = var6;
			}
			GraphEntity var7 = null;
			for (GraphEntity var8 = this.field6945[var2]; var8 != null; var8 = var8.field11712) {
				if (arg0 == var8) {
					if (var7 == null) {
						this.field6945[var2] = var8.field11712;
					} else {
						var7.field11712 = var8.field11712;
					}
					return;
				}
				var7 = var8;
			}
		}
	}

	@ObfuscatedName("tx.aw(IIII)Lasw;")
	public WallLayerEntity getWall(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		return tile == null ? null : tile.wall;
	}

	@ObfuscatedName("tx.as(IIII)Lasw;")
	public WallLayerEntity getDynamicWall(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		return tile == null ? null : tile.dynamicWall;
	}

	@ObfuscatedName("tx.at(IIII)Lasm;")
	public WallDecorLayerEntity getWallDecoration(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		return tile == null ? null : tile.wallDecoration;
	}

	@ObfuscatedName("tx.ad(IIIB)Last;")
	public ObjLayerEntity getObjStack(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		return tile == null ? null : tile.objStack;
	}

	@ObfuscatedName("tx.am(IIILtd;B)Lash;")
	public PrimaryLayerEntity getEntity(int level, int x, int z, PrimaryLayerEntityPredicate arg3) {
		Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return null;
		}
		for (PrimaryLayerEntityList nextEntity = tile.entities; nextEntity != null; nextEntity = nextEntity.field7058) {
			PrimaryLayerEntity var7 = nextEntity.field7057;
			if ((arg3 == null || arg3.method478(var7)) && var7.minSceneTileX == x && var7.minSceneTileZ == z) {
				return var7;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.au(IIIB)Luc;")
	public PrimaryLayerEntityList getEntities(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		return tile == null ? null : tile.entities;
	}

	@ObfuscatedName("tx.ar(IIII)Lasv;")
	public GroundDecorLayerEntity getGroundDecoration(int level, int x, int z) {
		Tile tile = this.levelTiles[level][x][z];
		return tile == null || tile.groundDecoration == null ? null : tile.groundDecoration;
	}

	@ObfuscatedName("tx.ap()V")
	public void buildModels() {
		for (int level = 0; level < this.maxLevel; level++) {
			for (int x = 0; x < this.maxTileX; x++) {
				for (int z = 0; z < this.maxTileZ; z++) {
					Tile tile = this.levelTiles[level][x][z];
					if (tile != null) {
						WallLayerEntity wall = tile.wall;
						WallLayerEntity dynamicWall = tile.dynamicWall;
						if (wall != null && wall.method17379()) {
							this.mergeLocNormals(wall, level, x, z, 1, 1);
							if (dynamicWall != null && dynamicWall.method17379()) {
								this.mergeLocNormals(dynamicWall, level, x, z, 1, 1);
								dynamicWall.mergeNormals(this.toolkit, wall, 0, 0, 0, false);
								dynamicWall.applyLighting();
							}
							wall.applyLighting();
						}
						for (PrimaryLayerEntityList var7 = tile.entities; var7 != null; var7 = var7.field7058) {
							PrimaryLayerEntity var8 = var7.field7057;
							if (var8 != null && var8.method17379()) {
								this.mergeLocNormals(var8, level, x, z, var8.maxSceneTileX - var8.minSceneTileX + 1, var8.maxSceneTileZ - var8.minSceneTileZ + 1);
								var8.applyLighting();
							}
						}
						GroundDecorLayerEntity var9 = tile.groundDecoration;
						if (var9 != null && var9.method17379()) {
							this.mergeGroundDecorationNormals(var9, level, x, z);
							var9.applyLighting();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tx.aq(Lalh;IIIS)V")
	public void mergeGroundDecorationNormals(GraphEntity entity, int level, int x, int z) {
		if (x < this.maxTileX) {
			Tile tile = this.levelTiles[level][x + 1][z];
			if (tile != null && tile.groundDecoration != null && tile.groundDecoration.method17379()) {
				int var6 = (this.levelHeightmaps[level].getTileHeight(x + 1, z) + this.levelHeightmaps[level].getTileHeight(x + 1 + 1, z) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1 + 1, z + 1)) / 4 - (this.levelHeightmaps[level].getTileHeight(x, z) + this.levelHeightmaps[level].getTileHeight(x + 1, z) + this.levelHeightmaps[level].getTileHeight(x, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1)) / 4;
				entity.mergeNormals(this.toolkit, tile.groundDecoration, this.field6901, var6, 0, true);
			}
		}
		if (z < this.maxTileX) {
			Tile tile = this.levelTiles[level][x][z + 1];
			if (tile != null && tile.groundDecoration != null && tile.groundDecoration.method17379()) {
				int var8 = (this.levelHeightmaps[level].getTileHeight(x, z) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1) + this.levelHeightmaps[level].getTileHeight(x, z + 1 + 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1 + 1)) / 4 - (this.levelHeightmaps[level].getTileHeight(x, z) + this.levelHeightmaps[level].getTileHeight(x + 1, z) + this.levelHeightmaps[level].getTileHeight(x, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1)) / 4;
				entity.mergeNormals(this.toolkit, tile.groundDecoration, 0, var8, this.field6901, true);
			}
		}
		if (x < this.maxTileX && z < this.maxTileZ) {
			Tile tile = this.levelTiles[level][x + 1][z + 1];
			if (tile != null && tile.groundDecoration != null && tile.groundDecoration.method17379()) {
				int var10 = (this.levelHeightmaps[level].getTileHeight(x + 1, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1 + 1, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1 + 1) + this.levelHeightmaps[level].getTileHeight(x + 1 + 1, z + 1 + 1)) / 4 - (this.levelHeightmaps[level].getTileHeight(x, z) + this.levelHeightmaps[level].getTileHeight(x + 1, z) + this.levelHeightmaps[level].getTileHeight(x, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1)) / 4;
				entity.mergeNormals(this.toolkit, tile.groundDecoration, this.field6901, var10, this.field6901, true);
			}
		}
		if (x >= this.maxTileX || z <= 0) {
			return;
		}
		Tile tile = this.levelTiles[level][x + 1][z - 1];
		if (tile != null && tile.groundDecoration != null && tile.groundDecoration.method17379()) {
			int var12 = (this.levelHeightmaps[level].getTileHeight(x + 1, z - 1) + this.levelHeightmaps[level].getTileHeight(x + 1 + 1, z - 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1 - 1) + this.levelHeightmaps[level].getTileHeight(x + 1 + 1, z + 1 - 1)) / 4 - (this.levelHeightmaps[level].getTileHeight(x, z) + this.levelHeightmaps[level].getTileHeight(x + 1, z) + this.levelHeightmaps[level].getTileHeight(x, z + 1) + this.levelHeightmaps[level].getTileHeight(x + 1, z + 1)) / 4;
			entity.mergeNormals(this.toolkit, tile.groundDecoration, this.field6901, var12, -this.field6901, true);
		}
	}

	@ObfuscatedName("tx.ax(Lalh;IIIII)V")
	public void mergeLocNormals(GraphEntity entity, int level, int tileX, int tileZ, int sizeX, int sizeZ) {
		boolean allowFaceRemoval = true;
		int minTileX = tileX;
		int maxTileX = tileX + sizeX;
		int minTileZ = tileZ - 1;
		int maxTileZ = tileZ + sizeZ;
		for (int l = level; l <= level + 1; l++) {
            if (this.maxLevel == l) {
                continue;
            }
            for (int x = minTileX; x <= maxTileX; x++) {
                if (x < 0 || x >= this.maxTileX) {
                    continue;
                }
                for (int z = minTileZ; z <= maxTileZ; z++) {
                    if (z < 0 || z >= this.maxTileZ || (allowFaceRemoval && x < maxTileX && z < maxTileZ && (z >= tileZ || tileX == x))) {
                        continue;
                    }
                    Tile tile = this.levelTiles[l][x][z];
                    if (tile == null) {
                        continue;
                    }
                    int var16 = (this.levelHeightmaps[l].getTileHeight(x, z) + this.levelHeightmaps[l].getTileHeight(x + 1, z) + this.levelHeightmaps[l].getTileHeight(x, z + 1) + this.levelHeightmaps[l].getTileHeight(x + 1, z + 1)) / 4 - (this.levelHeightmaps[level].getTileHeight(tileX, tileZ) + this.levelHeightmaps[level].getTileHeight(tileX + 1, tileZ) + this.levelHeightmaps[level].getTileHeight(tileX, tileZ + 1) + this.levelHeightmaps[level].getTileHeight(tileX + 1, tileZ + 1)) / 4;
                    WallLayerEntity wall = tile.wall;
                    WallLayerEntity dynamicWall = tile.dynamicWall;
                    if (wall != null && wall.method17379()) {
                        entity.mergeNormals(this.toolkit, wall, this.field6924 * (1 - sizeX) + this.field6901 * (x - tileX), var16, this.field6924 * (1 - sizeZ) + this.field6901 * (z - tileZ), allowFaceRemoval);
                    }
                    if (dynamicWall != null && dynamicWall.method17379()) {
                        entity.mergeNormals(this.toolkit, dynamicWall, this.field6924 * (1 - sizeX) + this.field6901 * (x - tileX), var16, this.field6924 * (1 - sizeZ) + this.field6901 * (z - tileZ), allowFaceRemoval);
                    }
                    for (PrimaryLayerEntityList var19 = tile.entities; var19 != null; var19 = var19.field7058) {
                        PrimaryLayerEntity var20 = var19.field7057;
                        if (var20 == null || !var20.method17379() || (var20.minSceneTileX != x && minTileX != x) || (var20.minSceneTileZ != z && minTileZ != z)) {
                            continue;
                        }
                        int var21 = var20.maxSceneTileX - var20.minSceneTileX + 1;
                        int var22 = var20.maxSceneTileZ - var20.minSceneTileZ + 1;
                        entity.mergeNormals(this.toolkit, var20, this.field6924 * (var21 - sizeX) + this.field6901 * (var20.minSceneTileX - tileX), var16, this.field6924 * (var22 - sizeZ) + this.field6901 * (var20.minSceneTileZ - tileZ), allowFaceRemoval);
                    }
                }
            }
            minTileX--;
            allowFaceRemoval = false;
        }
	}

	@ObfuscatedName("tx.av(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void draw(int cycle, int eyeX, int eyeY, int eyeZ, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, boolean arg17) {
		this.occlusionManager.field7017 = true;
		this.field6955 = arg15;
		this.eyeTileX = eyeX >> this.size;
		this.eyeTileZ = eyeZ >> this.size;
		this.eyeX = eyeX;
		this.eyeZ = eyeZ;
		this.eyeY = eyeY;
		this.minDrawTileX = this.eyeTileX - this.drawDistance;
		if (this.minDrawTileX < 0) {
			this.field6943 = -(this.minDrawTileX);
			this.minDrawTileX = 0;
		} else {
			this.field6943 = 0;
		}
		this.minDrawTileZ = this.eyeTileZ - this.drawDistance;
		if (this.minDrawTileZ < 0) {
			this.field6944 = -(this.minDrawTileZ);
			this.minDrawTileZ = 0;
		} else {
			this.field6944 = 0;
		}
		this.maxDrawTileX = this.drawDistance + this.eyeTileX;
		if (this.maxDrawTileX > this.maxTileX) {
			this.maxDrawTileX = this.maxTileX;
		}
		this.maxDrawTileZ = this.eyeTileZ + this.drawDistance;
		if (this.maxDrawTileZ > this.maxTileZ) {
			this.maxDrawTileZ = this.maxTileZ;
		}
		boolean[][] visibilityMap = this.visibilityMap;
		boolean[][] var20 = this.field6960;
		if (this.field6955) {
			for (int var21 = 0; var21 < this.drawDistance + this.drawDistance + 2; var21++) {
				int var22 = 0;
				int var23 = 0;
				for (int var24 = 0; var24 < this.drawDistance + this.drawDistance + 2; var24++) {
					if (var24 > 1) {
						this.field6908[var24 - 2] = var22;
					}
					var22 = var23;
					int var25 = this.eyeTileX - this.drawDistance + var21;
					int var26 = this.eyeTileZ - this.drawDistance + var24;
					if (var25 >= 0 && var26 >= 0 && var25 < this.maxTileX && var26 < this.maxTileZ) {
						int var27 = var25 << this.size;
						int var28 = var26 << this.size;
						int var29 = this.field6915[this.field6915.length - 1].getTileHeight(var25, var26) - (0x3E8 << this.size - 7);
						int var30 = (this.underwaterLevelHeightMaps == null ? this.field6915[0].getTileHeight(var25, var26) + this.field6901 : this.underwaterLevelHeightMaps[0].getTileHeight(var25, var26) + this.field6901) + (0x3E8 << this.size - 7);
						var23 = this.toolkit.method2348(var27, var29, var28, var27, var30, var28);
						this.field6960[var21][var24] = var23 == 0;
					} else {
						var23 = -1;
						this.field6960[var21][var24] = false;
					}
					if (var21 > 0 && var24 > 0) {
						int var31 = this.field6908[var24 - 1] & this.field6908[var24] & var22 & var23;
						this.visibilityMap[var21 - 1][var24 - 1] = var31 == 0;
					}
				}
				this.field6908[this.drawDistance + this.drawDistance] = var22;
				this.field6908[this.drawDistance + this.drawDistance + 1] = var23;
			}
			if (arg17) {
				this.occlusionManager.field7035 = arg5;
				this.occlusionManager.field7036 = arg6;
				this.occlusionManager.field7027 = arg7;
				this.occlusionManager.field7042 = arg8;
				this.occlusionManager.field7039 = arg9;
				this.occlusionManager.method8923(this.toolkit, arg10);
			} else {
				this.occlusionManager.field7017 = false;
			}
		} else {
			if (this.field6922 == null) {
				this.field6922 = new boolean[this.drawDistance + this.drawDistance + 2][this.drawDistance + this.drawDistance + 2];
			}
			for (int var32 = 0; var32 < this.field6922.length; var32++) {
				for (int var33 = 0; var33 < this.field6922[0].length; var33++) {
					this.field6922[var32][var33] = true;
				}
			}
			this.field6960 = this.field6922;
			this.visibilityMap = this.field6922;
			this.minDrawTileX = 0;
			this.minDrawTileZ = 0;
			this.maxDrawTileX = this.maxTileX;
			this.maxDrawTileZ = this.maxTileZ;
			this.occlusionManager.field7017 = false;
		}
		ParticleSystemRenderer.method8460(this, this.toolkit);
		if (!this.pickableEntities.field6884) {
			Iterator var34 = this.pickableEntities.field6885.iterator();
			while (var34.hasNext()) {
				PickableEntity var35 = (PickableEntity) var34.next();
				var34.remove();
				PickableEntity.pushPickableEntity(var35);
			}
		}
		if (this.lighting) {
			for (int var36 = 0; var36 < this.field6953; var36++) {
				this.field6926[var36].method8898(cycle, arg14);
			}
		}
		if (this.field6914 != null) {
			this.method8703(true);
			this.toolkit.method2245(-1, new WaterFogData(1583160, 40, 127, 63, 0, 0, 0));
			this.method8744(true, arg4, arg10, arg11, arg16);
			this.toolkit.method2247();
			this.method8703(false);
		}
		this.method8744(false, arg4, arg10, arg11, arg16);
		if (!this.field6955) {
			this.visibilityMap = visibilityMap;
			this.field6960 = var20;
		}
	}

	@ObfuscatedName("tx.ao(Z[[[BIBI)V")
	public void method8744(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
		int var6 = arg0 ? 1 : 0;
		this.field6931 = 0;
		this.field6918 = 0;
		this.cycle++;
		if ((arg4 & 0x2) == 0) {
			for (GraphEntity var7 = this.field6916[var6]; var7 != null; var7 = var7.field11712) {
				this.method8745(var7);
				if (var7.field11715 != -1 && !this.method8748(var7, arg0, arg1, arg2, arg3)) {
					this.field6934[++this.field6931 - 1] = var7;
				}
			}
		}
		if ((arg4 & 0x1) == 0) {
			for (GraphEntity var8 = this.field6929[var6]; var8 != null; var8 = var8.field11712) {
				this.method8745(var8);
				if (var8.field11715 != -1 && !this.method8748(var8, arg0, arg1, arg2, arg3)) {
					this.field6933[++this.field6918 - 1] = var8;
				}
			}
			for (GraphEntity var9 = this.field6945[var6]; var9 != null; var9 = var9.field11712) {
				this.method8745(var9);
				if (var9.field11715 != -1 && !this.method8748(var9, arg0, arg1, arg2, arg3)) {
					if (var9.method16489()) {
						this.field6933[++this.field6918 - 1] = var9;
					} else {
						this.field6934[++this.field6931 - 1] = var9;
					}
				}
			}
			if (!arg0) {
				for (int var10 = 0; var10 < this.entityCount; var10++) {
					this.method8745(this.entities[var10]);
					if (this.entities[var10].field11715 != -1 && !this.method8748(this.entities[var10], arg0, arg1, arg2, arg3)) {
						if (this.entities[var10].method16489()) {
							this.field6933[++this.field6918 - 1] = this.entities[var10];
						} else {
							this.field6934[++this.field6931 - 1] = this.entities[var10];
						}
					}
				}
			}
		}
		if (this.field6931 > 0) {
			this.method8747(this.field6934, 0, this.field6931 - 1);
			for (int var11 = 0; var11 < this.field6931; var11++) {
				this.method8749(this.field6934[var11], this.field6950);
			}
		}
		if (this.lighting) {
			this.toolkit.setActiveLights(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (int var12 = 0; var12 < this.maxLevel; var12++) {
				if (var12 < arg2 || arg1 == null) {
					int var21 = this.visibilityMap.length;
					if (this.minDrawTileX + this.visibilityMap.length > this.maxTileX) {
						var21 -= this.minDrawTileX + this.visibilityMap.length - this.maxTileX;
					}
					int var22 = this.visibilityMap[0].length;
					if (this.minDrawTileZ + this.visibilityMap[0].length > this.maxTileZ) {
						var22 -= this.minDrawTileZ + this.visibilityMap[0].length - this.maxTileZ;
					}
					boolean[][] var23 = this.field6960;
					if (this.field6955) {
						for (int var24 = this.field6943; var24 < var21; var24++) {
							int var25 = this.minDrawTileX + var24 - this.field6943;
							for (int var26 = this.field6944; var26 < var22; var26++) {
								if (this.visibilityMap[var24][var26] && !this.occlusionManager.tileVisible(var12, var25, this.minDrawTileZ + var26 - this.field6944)) {
									var23[var24][var26] = true;
								} else {
									var23[var24][var26] = false;
								}
							}
						}
					}
					this.levelHeightmaps[var12].method1548(this.eyeTileX, this.eyeTileZ, this.drawDistance, this.field6960, true, arg4);
				} else {
					int var13 = this.visibilityMap.length;
					if (this.minDrawTileX + this.visibilityMap.length > this.maxTileX) {
						var13 -= this.minDrawTileX + this.visibilityMap.length - this.maxTileX;
					}
					int var14 = this.visibilityMap[0].length;
					if (this.minDrawTileZ + this.visibilityMap[0].length > this.maxTileZ) {
						var14 -= this.minDrawTileZ + this.visibilityMap[0].length - this.maxTileZ;
					}
					boolean[][] var15 = this.field6960;
					if (this.field6955) {
						for (int var16 = this.field6943; var16 < var13; var16++) {
							int var17 = this.minDrawTileX + var16 - this.field6943;
							for (int var18 = this.field6944; var18 < var14; var18++) {
								var15[var16][var18] = false;
								if (this.visibilityMap[var16][var18]) {
									int var19 = this.minDrawTileZ + var18 - this.field6944;
									for (int var20 = var12; var20 >= 0; var20--) {
										if (this.levelTiles[var20][var17][var19] != null && this.levelTiles[var20][var17][var19].level == var12) {
											if ((var20 < arg2 || arg1[var20][var17][var19] != arg3) && !this.occlusionManager.tileVisible(var12, var17, var19)) {
												var15[var16][var18] = true;
												break;
											}
											var15[var16][var18] = false;
											break;
										}
									}
								}
							}
						}
					}
					this.levelHeightmaps[var12].method1548(this.eyeTileX, this.eyeTileZ, this.drawDistance, this.field6960, false, arg4);
				}
			}
		}
		if (this.field6918 > 0) {
			this.method8751(this.field6933, 0, this.field6918 - 1);
			for (int var27 = 0; var27 < this.field6918; var27++) {
				this.method8749(this.field6933[var27], this.field6950);
			}
		}
	}

	@ObfuscatedName("tx.aj(Lalh;I)V")
	public void method8745(GraphEntity arg0) {
		Vector3 var2 = arg0.getTransform().trans;
		this.toolkit.method2525((float) var2.x, (float) ((int) var2.y + (arg0.overlayHeight() >> 1)), (float) var2.z, this.field6927);
		arg0.field11715 = (int) this.field6927[2];
	}

	@ObfuscatedName("tx.ay([Lalh;II)V")
	public void method8751(GraphEntity[] arg0, int arg1, int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		int var4 = (arg1 + arg2) / 2;
		int var5 = arg1;
		GraphEntity var6 = arg0[var4];
		arg0[var4] = arg0[arg2];
		arg0[arg2] = var6;
		int var7 = var6.field11715;
		for (int var8 = arg1; var8 < arg2; var8++) {
			if (arg0[var8].field11715 > (var8 & 0x1) + var7) {
				GraphEntity var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5++] = var9;
			}
		}
		arg0[arg2] = arg0[var5];
		arg0[var5] = var6;
		this.method8751(arg0, arg1, var5 - 1);
		this.method8751(arg0, var5 + 1, arg2);
	}

	@ObfuscatedName("tx.ab([Lalh;II)V")
	public void method8747(GraphEntity[] arg0, int arg1, int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		int var4 = (arg1 + arg2) / 2;
		int var5 = arg1;
		GraphEntity var6 = arg0[var4];
		arg0[var4] = arg0[arg2];
		arg0[arg2] = var6;
		int var7 = var6.field11715;
		for (int var8 = arg1; var8 < arg2; var8++) {
			if (arg0[var8].field11715 < (var8 & 0x1) + var7) {
				GraphEntity var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5++] = var9;
			}
		}
		arg0[arg2] = arg0[var5];
		arg0[var5] = var6;
		this.method8747(arg0, arg1, var5 - 1);
		this.method8747(arg0, var5 + 1, arg2);
	}

	@ObfuscatedName("tx.az(Lalh;Z[[[BIB)Z")
	public boolean method8748(GraphEntity arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
		if (!this.field6955) {
			return false;
		} else if (arg0 instanceof PrimaryLayerEntity) {
			short var6 = ((PrimaryLayerEntity) arg0).maxSceneTileX;
			short var7 = ((PrimaryLayerEntity) arg0).maxSceneTileZ;
			short var8 = ((PrimaryLayerEntity) arg0).minSceneTileX;
			short var9 = ((PrimaryLayerEntity) arg0).minSceneTileZ;
			for (int var10 = var8; var10 <= var6; var10++) {
				for (int var11 = var9; var11 <= var7; var11++) {
					if (arg0.occludeLevel < this.maxLevel && var10 >= this.minDrawTileX && var10 < this.maxDrawTileX && var11 >= this.minDrawTileZ && var11 < this.maxDrawTileZ) {
						if ((arg2 == null || arg0.level < arg3 || arg2[arg0.level][var10][var11] != arg4) && arg0.isVisible() && !arg0.isOccluded(this.toolkit)) {
							return false;
						}
						if (!arg1 && var10 >= this.eyeTileX - 16 && var10 <= this.eyeTileX + 16 && var11 >= this.eyeTileZ - 16 && var11 <= this.eyeTileZ + 16) {
							arg0.method17373(this.toolkit);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			Vector3 var12 = arg0.getTransform().trans;
			int var13 = (int) var12.x >> this.size;
			int var14 = (int) var12.z >> this.size;
			if (arg0.occludeLevel >= this.maxLevel || var13 < this.minDrawTileX || var13 >= this.maxDrawTileX || var14 < this.minDrawTileZ || var14 >= this.maxDrawTileZ) {
				return true;
			} else if ((arg2 == null || arg0.level < arg3 || arg2[arg0.level][var13][var14] != arg4) && arg0.isVisible() && !arg0.isOccluded(this.toolkit)) {
				return false;
			} else {
				if (!arg1 && var13 >= this.eyeTileX - 16 && var13 <= this.eyeTileX + 16 && var14 >= this.eyeTileZ - 16 && var14 <= this.eyeTileZ + 16) {
					arg0.method17373(this.toolkit);
				}
				return true;
			}
		}
	}

	@ObfuscatedName("tx.aa(Lalh;[Lakf;)V")
	public void method8749(GraphEntity arg0, Light[] arg1) {
		if (this.lighting) {
			int var3 = arg0.method18375(arg1);
			this.toolkit.setActiveLights(var3, arg1);
		}
		if (this.underwaterLevelHeightMaps == this.levelHeightmaps) {
			boolean var4 = false;
			boolean var5 = false;
			Vector3 var6 = arg0.getTransform().trans;
			int var7;
			int var8;
			if (arg0 instanceof PrimaryLayerEntity) {
				var7 = ((PrimaryLayerEntity) arg0).minSceneTileX;
				var8 = ((PrimaryLayerEntity) arg0).minSceneTileZ;
			} else {
				var7 = (int) var6.x >> this.size;
				var8 = (int) var6.z >> this.size;
			}
			int var9 = Math.min(this.maxTileX - 1, Math.max(0, var7));
			int var10 = Math.min(this.maxTileZ - 1, Math.max(0, var8));
			WaterFogData var11 = new WaterFogData();
			var11.colour = this.getWaterFogColour(var9, var10);
			var11.scale = this.getWaterFogScale(var9, var10);
			var11.offset = this.getWaterFogOffset(var9, var10);
			var11.field1576 = this.method8713(var9, var10);
			var11.field1578 = this.method8760(var9, var10);
			var11.field1579 = this.method8715(var9, var10);
			this.toolkit.setWaterFog(this.field6915[0].getFineHeight((int) var6.x, (int) var6.z), var11);
		}
		PickableEntity var12 = arg0.draw(this.toolkit);
		if (var12 == null) {
			return;
		}
		if (var12.active) {
			var12.field6978 = arg0;
			this.pickableEntities.method8683(var12);
		} else {
			PickableEntity.pushPickableEntity(var12);
		}
	}

	@ObfuscatedName("tx.af(Lara;III[ZI)Z")
	public boolean method8750(HardShadow arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
		boolean var6 = false;
		if (this.underwaterLevelHeightMaps != this.levelHeightmaps) {
			int var7 = this.field6915[arg1].getFineHeight(arg2, arg3);
			for (int var8 = 0; var8 <= arg1; var8++) {
				FloorModel var9 = this.field6915[var8];
				if (var9 != null) {
					int var10 = var7 - var9.getFineHeight(arg2, arg3);
					if (arg4 != null) {
						arg4[var8] = var9.method1535(arg0, arg2, var10, arg3, 0, false);
						if (!arg4[var8]) {
							continue;
						}
					}
					var9.method1532(arg0, arg2, var10, arg3, 0, false);
					var6 = true;
				}
			}
		}
		return var6;
	}

	@ObfuscatedName("tx.ak(Lara;III[ZI)V")
	public void method8814(HardShadow arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
		if (this.underwaterLevelHeightMaps == this.levelHeightmaps) {
			return;
		}
		int var6 = this.field6915[arg1].getFineHeight(arg2, arg3);
		for (int var7 = 0; var7 <= arg1; var7++) {
			if (arg4 == null || arg4[var7]) {
				FloorModel var8 = this.field6915[var7];
				if (var8 != null) {
					var8.method1543(arg0, arg2, var6 - var8.getFineHeight(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("tx.an(III)V")
	public void method8870(int arg0, int arg1) {
		HardShadow var3 = null;
		for (int var4 = arg0; var4 < arg1; var4++) {
			FloorModel var5 = this.field6915[var4];
			if (var5 != null) {
				for (int var6 = 0; var6 < this.maxTileZ; var6++) {
					for (int var7 = 0; var7 < this.maxTileX; var7++) {
						var3 = var5.method1531(var7, var6, var3);
						if (var3 != null) {
							int var8 = var7 << this.size;
							int var9 = var6 << this.size;
							for (int var10 = var4 - 1; var10 >= 0; var10--) {
								FloorModel var11 = this.field6915[var10];
								if (var11 != null) {
									int var12 = var5.getTileHeight(var7, var6) - var11.getTileHeight(var7, var6);
									int var13 = var5.getTileHeight(var7 + 1, var6) - var11.getTileHeight(var7 + 1, var6);
									int var14 = var5.getTileHeight(var7 + 1, var6 + 1) - var11.getTileHeight(var7 + 1, var6 + 1);
									int var15 = var5.getTileHeight(var7, var6 + 1) - var11.getTileHeight(var7, var6 + 1);
									var11.method1532(var3, var8, (var12 + var13 + var14 + var15) / 4, var9, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tx.bf(I)V")
	public void method8753() {
		this.method8870(1, this.maxLevel);
	}

	@ObfuscatedName("tx.bl(Lul;B)V")
	public void method8754(StaticPointLight arg0) {
		if (this.field6953 >= 65253) {
			return;
		}
		Light var2 = arg0.field7003;
		this.field6926[this.field6953] = arg0;
		this.field6956[this.field6953] = false;
		this.field6953++;
		int var3 = arg0.field7006;
		if (arg0.field7005) {
			var3 = 0;
		}
		int var4 = arg0.field7006;
		if (arg0.field7004) {
			var4 = this.maxLevel - 1;
		}
		for (int var5 = var3; var5 <= var4; var5++) {
			int var6 = 0;
			int var7 = var2.method17607() - var2.method17608() + this.field6924 >> this.size;
			if (var7 < 0) {
				var6 -= var7;
				var7 = 0;
			}
			int var8 = var2.method17607() + var2.method17608() - this.field6924 >> this.size;
			if (var8 >= this.maxTileZ) {
				var8 = this.maxTileZ - 1;
			}
			for (int var9 = var7; var9 <= var8; var9++) {
				short var10 = arg0.field6981[var6++];
				int var11 = (var2.method17605() - var2.method17608() + this.field6924 >> this.size) + (var10 >>> 8);
				int var12 = (var10 & 0xFF) + var11 - 1;
				if (var11 < 0) {
					var11 = 0;
				}
				if (var12 >= this.maxTileX) {
					var12 = this.maxTileX - 1;
				}
				for (int var13 = var11; var13 <= var12; var13++) {
					long var14 = this.field6954[var5][var13][var9];
					if ((var14 & 0xFFFFL) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953;
					} else if ((var14 & 0xFFFF0000L) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953 << 16;
					} else if ((var14 & 0xFFFF00000000L) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953 << 32;
					} else if ((var14 & 0xFFFF000000000000L) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953 << 48;
					}
				}
			}
		}
		if (arg0.field6990 == -1) {
			return;
		}
		List var16 = (List) this.field6957.get(arg0.field6990);
		if (var16 == null) {
			var16 = new ArrayList();
			this.field6957.put(arg0.field6990, var16);
		}
		var16.add(arg0);
		Light var17 = (Light) this.field6958.get(arg0.field6990);
		if (var17 != null) {
			arg0.field7003.method17618(var17.method17624());
			arg0.field7003.method17620(var17.method17656(), var17.method17615());
			arg0.field7003.method17636(var17.method17652());
			arg0.field7003.method17621(var17.method17629(), var17.method17617());
		}
	}

	@ObfuscatedName("tx.bk(I)V")
	public void method8755() {
		for (int var1 = 0; var1 < this.field6953; var1++) {
			if (!this.field6956[var1]) {
				StaticPointLight var2 = this.field6926[var1];
				Light var3 = var2.field7003;
				int var4 = var2.field7006;
				int var5 = var3.method17608() - this.field6924;
				int var6 = (var5 * 2 >> this.size) + 1;
				int var7 = 0;
				int[] var8 = new int[var6 * var6];
				int var9 = var3.method17605() - var5 >> this.size;
				int var10 = var3.method17607() - var5 >> this.size;
				int var11 = var3.method17607() + var5 >> this.size;
				if (var10 < 0) {
					var7 -= var10;
					var10 = 0;
				}
				if (var11 >= this.maxTileZ) {
					var11 = this.maxTileZ - 1;
				}
				for (int var12 = var10; var12 <= var11; var12++) {
					short var13 = var2.field6981[var7];
					int var14 = var13 >>> 8;
					int var15 = var6 * var7 + var14;
					int var16 = (var13 >>> 8) + var9;
					int var17 = (var13 & 0xFF) + var16 - 1;
					if (var16 < 0) {
						var15 -= var16;
						var16 = 0;
					}
					if (var17 >= this.maxTileX) {
						var17 = this.maxTileX - 1;
					}
					for (int var18 = var16; var18 <= var17; var18++) {
						byte var19 = 1;
						PrimaryLayerEntity var20 = this.getEntity(var4, var18, var12, null);
						if (var20 != null && var20.field12469 != 0) {
							if (var20.field12469 == 1) {
								boolean var21 = var18 - 1 >= var16;
								boolean var22 = var18 + 1 <= var17;
								if (!var21 && var12 + 1 <= var11) {
									short var23 = var2.field6981[var7 + 1];
									int var24 = (var23 >>> 8) + var9;
									int var25 = (var23 & 0xFF) + var24;
									var21 = var18 > var24 && var18 < var25;
								}
								if (!var22 && var12 - 1 >= var10) {
									short var26 = var2.field6981[var7 - 1];
									int var27 = (var26 >>> 8) + var9;
									int var28 = (var26 & 0xFF) + var27;
									var22 = var18 > var27 && var18 < var28;
								}
								if (var21 && !var22) {
									var19 = 4;
								} else if (var22 && !var21) {
									var19 = 2;
								}
							} else {
								boolean var29 = var18 - 1 >= var16;
								boolean var30 = var18 + 1 <= var17;
								if (!var29 && var12 - 1 >= var10) {
									short var31 = var2.field6981[var7 - 1];
									int var32 = (var31 >>> 8) + var9;
									int var33 = (var31 & 0xFF) + var32;
									var29 = var18 > var32 && var18 < var33;
								}
								if (!var30 && var12 + 1 <= var11) {
									short var34 = var2.field6981[var7 + 1];
									int var35 = (var34 >>> 8) + var9;
									int var36 = (var34 & 0xFF) + var35;
									var30 = var18 > var35 && var18 < var36;
								}
								if (var29 && !var30) {
									var19 = 3;
								} else if (var30 && !var29) {
									var19 = 5;
								}
							}
						}
						var8[var15++] = var19;
					}
					var7++;
				}
				this.field6956[var1] = true;
				if (field6937) {
					this.levelHeightmaps[var4].method1549(var3, var8);
				}
			}
		}
	}

	@ObfuscatedName("tx.bh(IIII)V")
	public void addPointLightColour(int arg0, int arg1, int arg2) {
		List var4 = (List) this.field6957.get(arg0);
		if (var4 == null) {
			return;
		}
		Iterator var5 = var4.iterator();
		while (var5.hasNext()) {
			StaticPointLight var6 = (StaticPointLight) var5.next();
			var6.field7003.method17620(arg1, arg2);
		}
	}

	@ObfuscatedName("tx.bx(IIIB)V")
	public void setPointLightIntensity(int arg0, int arg1, int arg2) {
		List var4 = (List) this.field6957.get(arg0);
		if (var4 == null) {
			return;
		}
		float var5 = arg1 < 0 ? -1.0F : (float) arg1 / 100.0F;
		Iterator var6 = var4.iterator();
		while (var6.hasNext()) {
			StaticPointLight var7 = (StaticPointLight) var6.next();
			var7.field7003.method17621(var5, arg2);
		}
	}

	@ObfuscatedName("tx.bd(I)Ljava/util/HashMap;")
	public HashMap method8733() {
		this.field6958.clear();
		Iterator var1 = this.field6957.entrySet().iterator();
		while (var1.hasNext()) {
			Entry var2 = (Entry) var1.next();
			this.field6958.put(var2.getKey(), ((StaticPointLight) ((List) var2.getValue()).get(0)).field7003);
		}
		return this.field6958;
	}

	@ObfuscatedName("tx.bc(Ljava/util/HashMap;B)V")
	public void method8759(HashMap arg0) {
		this.field6958 = arg0;
	}
}
