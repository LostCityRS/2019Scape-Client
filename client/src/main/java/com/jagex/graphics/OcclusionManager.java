package com.jagex.graphics;

import com.jagex.game.world.entity.EntityBounds;
import com.jagex.game.world.entity.Scene;
import com.jagex.game.world.entity.Tile;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import deob.ObfuscatedName;

@ObfuscatedName("um")
public class OcclusionManager {

	@ObfuscatedName("um.e")
	public boolean field7031 = true;

	@ObfuscatedName("um.n")
	public boolean field7017 = true;

	@ObfuscatedName("um.w")
	public Scene scene;

	@ObfuscatedName("um.l")
	public OcclusionSomething field7024;

	@ObfuscatedName("um.u")
	public boolean field7040 = false;

	@ObfuscatedName("um.z")
	public int field7016;

	@ObfuscatedName("um.p")
	public int field7025;

	@ObfuscatedName("um.d")
	public int[][][] levelTileOcclusionCycles;

	@ObfuscatedName("um.c")
	public int levelOccluderCount;

	@ObfuscatedName("um.r")
	public Occluder[] levelOccluders;

	@ObfuscatedName("um.v")
	public int field7029;

	@ObfuscatedName("um.o")
	public Occluder[] field7030;

	@ObfuscatedName("um.s")
	public int field7023;

	@ObfuscatedName("um.y")
	public Occluder[] field7021;

	@ObfuscatedName("um.q")
	public int activeOccluderCount = 0;

	@ObfuscatedName("um.x")
	public Occluder[] activeOccluders;

	@ObfuscatedName("um.b")
	public int[] field7035;

	@ObfuscatedName("um.h")
	public int[] field7036;

	@ObfuscatedName("um.a")
	public int[] field7027;

	@ObfuscatedName("um.g")
	public int[] field7042;

	@ObfuscatedName("um.i")
	public int[] field7039;

	@ObfuscatedName("um.j")
	public int[] field7032;

	@ObfuscatedName("um.t")
	public static Toolkit toolkit;

	@ObfuscatedName("um.ae")
	public final float[] field7037 = new float[3];

	@ObfuscatedName("um.ag")
	public final int[] field7043 = new int[2];

	@ObfuscatedName("um.ah")
	public int field7044 = -1;

	@ObfuscatedName("um.al")
	public int field7045 = -1;

	@ObfuscatedName("um.ac")
	public boolean debugging = true;

	public OcclusionManager(Scene arg0) {
		this.field7016 = arg0.field6901;
		this.field7025 = arg0.field6901;
		this.scene = arg0;
		this.levelOccluders = new Occluder[511];
		this.levelOccluderCount = 0;
		this.field7030 = new Occluder[2008];
		this.field7029 = 0;
		this.field7021 = new Occluder[1043];
		this.field7023 = 0;
		this.activeOccluders = new Occluder[1017];
		this.activeOccluderCount = 0;
		this.levelTileOcclusionCycles = new int[this.scene.maxLevel][this.scene.maxTileX + 1][this.scene.maxTileZ + 1];
		this.field7040 = false;
		this.field7031 = true;
		if (this.field7031) {
			this.field7024 = new OcclusionSomething(this);
		}
	}

	@ObfuscatedName("um.e(IIIIII)V")
	public void setLevelOccludeMap(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			Tile var7 = this.scene.levelTiles[arg1][arg2][arg3];
			if (var7 == null) {
				this.scene.levelTiles[arg1][arg2][arg3] = var7 = new Tile(arg1);
			}
			if (arg0 == 1) {
				var7.field6973 = (short) arg4;
				var7.field6969 = (short) arg5;
			} else if (arg0 == 2) {
				var7.field6975 = (short) arg4;
				var7.field6972 = (short) arg5;
			}
			if (this.field7040) {
				this.method8917();
			}
		} else if (arg0 == 8) {
			int var8 = arg2 << this.scene.size;
			int var9 = this.scene.field6901 + var8;
			int var10 = arg3 << this.scene.size;
			int var11 = this.scene.field6901 + var10;
			int var12 = this.scene.field6915[arg1].getTileHeight(arg2, arg3);
			int var13 = this.scene.field6915[arg1].getTileHeight(arg2 + 1, arg3 + 1);
			this.field7021[this.field7023++] = new Occluder(this.scene, arg0, arg1, var8, var9, var9, var8, var12, var13, var13 - arg4, var12 - arg4, var10, var11, var11, var10);
		} else {
			int var14 = (arg2 << this.scene.size) + this.scene.field6901;
			int var15 = var14 - this.scene.field6901;
			int var16 = arg3 << this.scene.size;
			int var17 = this.scene.field6901 + var16;
			int var18 = this.scene.field6915[arg1].getTileHeight(arg2 + 1, arg3);
			int var19 = this.scene.field6915[arg1].getTileHeight(arg2, arg3 + 1);
			this.field7021[this.field7023++] = new Occluder(this.scene, arg0, arg1, var14, var15, var15, var14, var18, var19, var19 - arg4, var18 - arg4, var16, var17, var17, var16);
		}
	}

	@ObfuscatedName("um.n(IIII)V")
	public void method8919(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			Tile var5 = this.scene.levelTiles[arg1][arg2][arg3];
			if (var5 != null) {
				if (arg0 == 1) {
					var5.field6973 = 0;
				} else if (arg0 == 2) {
					var5.field6975 = 0;
				}
			}
			this.method8917();
			return;
		}
		for (int var6 = 0; var6 < this.field7023; var6++) {
			Occluder var7 = this.field7021[var6];
			if (var7.type == arg0 && var7.level == arg1 && (var7.minTileX == arg2 && var7.minTileZ == arg3 || var7.maxTileX == arg2 && var7.maxTileZ == arg3)) {
				if (this.field7023 != var6) {
					System.arraycopy(this.field7021, var6 + 1, this.field7021, var6, this.field7021.length - (var6 + 1));
				}
				this.field7023--;
				return;
			}
		}
	}

	@ObfuscatedName("um.m()V")
	public void method8931() {
		this.method8917();
	}

	@ObfuscatedName("um.k()V")
	public void method8917() {
		for (int var1 = 0; var1 < this.field7029; var1++) {
			this.field7030[var1] = null;
		}
		this.field7029 = 0;
		for (int var2 = 0; var2 < this.scene.maxLevel; var2++) {
			for (int var3 = 0; var3 < this.scene.maxTileX; var3++) {
				for (int var4 = 0; var4 < this.scene.maxTileZ; var4++) {
					Tile var5 = this.scene.levelTiles[var2][var4][var3];
					if (var5 != null) {
						if (var5.field6973 > 0) {
							var5.field6973 = (short) (var5.field6973 * -1);
						}
						if (var5.field6975 > 0) {
							var5.field6975 = (short) (var5.field6975 * -1);
						}
					}
				}
			}
		}
		for (int var6 = 0; var6 < this.scene.maxLevel; var6++) {
			for (int var7 = 0; var7 < this.scene.maxTileX; var7++) {
				for (int var8 = 0; var8 < this.scene.maxTileZ; var8++) {
					Tile var9 = this.scene.levelTiles[var6][var8][var7];
					if (var9 != null) {
						boolean var10 = this.scene.levelTiles[0][var8][var7] != null && this.scene.levelTiles[0][var8][var7].bridge != null;
						if (var9.field6973 < 0) {
							int var11 = var7;
							int var12 = var7;
							int var14 = var6;
							Tile var15 = this.scene.levelTiles[var6][var8][var7 - 1];
							int var16 = this.scene.field6915[var6].getTileHeight(var8, var7);
							while (var11 > 0 && var15 != null && var15.field6973 < 0 && var9.field6973 == var15.field6973 && var9.field6969 == var15.field6969 && var16 == this.scene.field6915[var6].getTileHeight(var8, var11 - 1) && (var11 - 1 <= 0 || var16 == this.scene.field6915[var6].getTileHeight(var8, var11 - 2)) && var12 - var11 <= 10) {
								var11--;
								var15 = this.scene.levelTiles[var6][var8][var11 - 1];
							}
							for (Tile var17 = this.scene.levelTiles[var6][var8][var12 + 1]; var12 < this.scene.maxTileZ && var17 != null && var17.field6973 < 0 && var9.field6973 == var17.field6973 && var9.field6969 == var17.field6969 && var16 == this.scene.field6915[var6].getTileHeight(var8, var12 + 1) && (var12 + 1 >= this.scene.maxTileZ || var16 == this.scene.field6915[var6].getTileHeight(var8, var12 + 2)) && var12 - var11 <= 10; var17 = this.scene.levelTiles[var6][var8][var12 + 1]) {
								var12++;
							}
							int var18 = var6 - var6 + 1;
							int var19 = this.scene.field6915[var10 ? var6 + 1 : var6].getTileHeight(var8, var11);
							int var20 = var9.field6973 * var18 + var19;
							int var21 = this.scene.field6915[var10 ? var6 + 1 : var6].getTileHeight(var8, var12 + 1);
							int var22 = var9.field6973 * var18 + var21;
							int var23 = var8 << this.scene.size;
							int var24 = var11 << this.scene.size;
							int var25 = (var12 << this.scene.size) + this.scene.field6901;
							this.field7030[this.field7029++] = new Occluder(this.scene, 1, var6, var9.field6969 + var23, var9.field6969 + var23, var9.field6969 + var23, var9.field6969 + var23, var19, var21, var22, var20, var24, var25, var25, var24);
							for (int var26 = var6; var26 <= var14; var26++) {
								for (int var27 = var11; var27 <= var12; var27++) {
									this.scene.levelTiles[var26][var8][var27].field6973 = (short) (this.scene.levelTiles[var26][var8][var27].field6973 * -1);
								}
							}
						}
						if (var9.field6975 < 0) {
							int var28 = var8;
							int var29 = var8;
							int var31 = var6;
							Tile var32 = this.scene.levelTiles[var6][var8 - 1][var7];
							int var33 = this.scene.field6915[var6].getTileHeight(var8, var7);
							while (var28 > 0 && var32 != null && var32.field6975 < 0 && var9.field6975 == var32.field6975 && var9.field6972 == var32.field6972 && var33 == this.scene.field6915[var6].getTileHeight(var28 - 1, var7) && (var28 - 1 <= 0 || var33 == this.scene.field6915[var6].getTileHeight(var28 - 2, var7)) && var29 - var28 <= 10) {
								var28--;
								var32 = this.scene.levelTiles[var6][var28 - 1][var7];
							}
							for (Tile var34 = this.scene.levelTiles[var6][var29 + 1][var7]; var29 < this.scene.maxTileX && var34 != null && var34.field6975 < 0 && var9.field6975 == var34.field6975 && var9.field6972 == var34.field6972 && var33 == this.scene.field6915[var6].getTileHeight(var29 + 1, var7) && (var29 + 1 >= this.scene.maxTileX || var33 == this.scene.field6915[var6].getTileHeight(var29 + 2, var7)) && var29 - var28 <= 10; var34 = this.scene.levelTiles[var6][var29 + 1][var7]) {
								var29++;
							}
							int var35 = var6 - var6 + 1;
							int var36 = this.scene.field6915[var10 ? var6 + 1 : var6].getTileHeight(var28, var7);
							int var37 = var9.field6975 * var35 + var36;
							int var38 = this.scene.field6915[var10 ? var6 + 1 : var6].getTileHeight(var29 + 1, var7);
							int var39 = var9.field6975 * var35 + var38;
							int var40 = var28 << this.scene.size;
							int var41 = (var29 << this.scene.size) + this.scene.field6901;
							int var42 = var7 << this.scene.size;
							this.field7030[this.field7029++] = new Occluder(this.scene, 2, var6, var40, var41, var41, var40, var36, var38, var39, var37, var9.field6972 + var42, var9.field6972 + var42, var9.field6972 + var42, var9.field6972 + var42);
							for (int var43 = var6; var43 <= var31; var43++) {
								for (int var44 = var28; var44 <= var29; var44++) {
									this.scene.levelTiles[var43][var44][var7].field6975 = (short) (this.scene.levelTiles[var43][var44][var7].field6975 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.field7040 = true;
	}

	@ObfuscatedName("um.f(IIIIIIII)V")
	public void addOccluder(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.levelOccluders[this.levelOccluderCount++] = new Occluder(this.scene, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@ObfuscatedName("um.w(Ldh;I)V")
	public void method8923(Toolkit arg0, int arg1) {
		toolkit = arg0;
		if (!this.field7031 || !this.field7017) {
			this.activeOccluderCount = 0;
			return;
		}
		if (this.debugging) {
			this.scene.debugger.time();
		}
		toolkit.method2134(this.field7043);
		if ((int) ((float) this.field7043[0] / 3.0F) != this.field7044 || (int) ((float) this.field7043[1] / 3.0F) != this.field7045) {
			this.field7044 = (int) ((float) this.field7043[0] / 3.0F);
			this.field7045 = (int) ((float) this.field7043[1] / 3.0F);
			this.field7032 = new int[this.field7045 * this.field7044];
		}
		this.activeOccluderCount = 0;
		for (int var3 = 0; var3 < this.levelOccluderCount; var3++) {
			this.updateActiveOccluder(toolkit, this.levelOccluders[var3], arg1);
		}
		for (int var4 = 0; var4 < this.field7029; var4++) {
			this.updateActiveOccluder(toolkit, this.field7030[var4], arg1);
		}
		for (int var5 = 0; var5 < this.field7023; var5++) {
			this.updateActiveOccluder(toolkit, this.field7021[var5], arg1);
		}
		this.field7024.field6896 = 0;
		if (this.activeOccluderCount > 0) {
			int var6 = this.field7032.length;
			int var7 = var6 - var6 & 0x7;
			int var8 = 0;
			while (var8 < var7) {
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
				this.field7032[var8++] = Integer.MAX_VALUE;
			}
			while (var8 < var6) {
				this.field7032[var8++] = Integer.MAX_VALUE;
			}
			this.field7024.field6895 = 1;
			for (int var9 = 0; var9 < this.activeOccluderCount; var9++) {
				Occluder var10 = this.activeOccluders[var9];
				this.field7024.method8697(var10.field7076[0], var10.field7076[1], var10.field7076[3], var10.field7063[0], var10.field7063[1], var10.field7063[3], var10.field7077[0], var10.field7077[1], var10.field7077[3]);
				this.field7024.method8697(var10.field7076[1], var10.field7076[2], var10.field7076[3], var10.field7063[1], var10.field7063[2], var10.field7063[3], var10.field7077[1], var10.field7077[2], var10.field7077[3]);
			}
			this.field7024.field6895 = 2;
		}
		if (this.debugging) {
			this.scene.debugger.time();
		}
	}

	@ObfuscatedName("um.l(Ldh;Lui;I)V")
	public void updateActiveOccluder(Toolkit arg0, Occluder arg1, int arg2) {
		toolkit = arg0;
		if (this.field7035 != null && arg1.level >= arg2) {
			for (int var4 = 0; var4 < this.field7035.length; var4++) {
				if (this.field7035[var4] != -1000000 && (arg1.y[0] <= this.field7035[var4] || arg1.y[1] <= this.field7035[var4] || arg1.y[2] <= this.field7035[var4] || arg1.y[3] <= this.field7035[var4]) && (arg1.x[0] <= this.field7027[var4] || arg1.x[1] <= this.field7027[var4] || arg1.x[2] <= this.field7027[var4] || arg1.x[3] <= this.field7027[var4]) && (arg1.x[0] >= this.field7036[var4] || arg1.x[1] >= this.field7036[var4] || arg1.x[2] >= this.field7036[var4] || arg1.x[3] >= this.field7036[var4]) && (arg1.z[0] <= this.field7042[var4] || arg1.z[1] <= this.field7042[var4] || arg1.z[2] <= this.field7042[var4] || arg1.z[3] <= this.field7042[var4]) && (arg1.z[0] >= this.field7039[var4] || arg1.z[1] >= this.field7039[var4] || arg1.z[2] >= this.field7039[var4] || arg1.z[3] >= this.field7039[var4])) {
					return;
				}
			}
		}
		if (arg1.type == 1) {
			int var5 = this.scene.drawDistance + (arg1.minTileX - this.scene.eyeTileX);
			if (var5 >= 0 && var5 <= this.scene.drawDistance + this.scene.drawDistance) {
				int var6 = this.scene.drawDistance + (arg1.minTileZ - this.scene.eyeTileZ);
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > this.scene.drawDistance + this.scene.drawDistance) {
					return;
				}
				int var7 = this.scene.drawDistance + (arg1.maxTileZ - this.scene.eyeTileZ);
				if (var7 > this.scene.drawDistance + this.scene.drawDistance) {
					var7 = this.scene.drawDistance + this.scene.drawDistance;
				} else if (var7 < 0) {
					return;
				}
				boolean var8 = false;
				while (var6 <= var7) {
					if (this.scene.visibilityMap[var5][var6++]) {
						var8 = true;
						break;
					}
				}
				if (var8) {
					float var9 = (float) (this.scene.eyeX - arg1.x[0]);
					if (var9 < 0.0F) {
						var9 *= -1.0F;
					}
					if (!(var9 < (float) this.field7016) && (this.method8925(arg1, 0) && (this.method8925(arg1, 1) && (this.method8925(arg1, 2) && this.method8925(arg1, 3))))) {
						this.activeOccluders[this.activeOccluderCount++] = arg1;
					}
				}
			}
		} else if (arg1.type == 2) {
			int var10 = this.scene.drawDistance + (arg1.minTileZ - this.scene.eyeTileZ);
			if (var10 >= 0 && var10 <= this.scene.drawDistance + this.scene.drawDistance) {
				int var11 = this.scene.drawDistance + (arg1.minTileX - this.scene.eyeTileX);
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 > this.scene.drawDistance + this.scene.drawDistance) {
					return;
				}
				int var12 = this.scene.drawDistance + (arg1.maxTileX - this.scene.eyeTileX);
				if (var12 > this.scene.drawDistance + this.scene.drawDistance) {
					var12 = this.scene.drawDistance + this.scene.drawDistance;
				} else if (var12 < 0) {
					return;
				}
				boolean var13 = false;
				while (var11 <= var12) {
					if (this.scene.visibilityMap[var11++][var10]) {
						var13 = true;
						break;
					}
				}
				if (var13) {
					float var14 = (float) (this.scene.eyeZ - arg1.z[0]);
					if (var14 < 0.0F) {
						var14 *= -1.0F;
					}
					if (!(var14 < (float) this.field7016) && (this.method8925(arg1, 0) && (this.method8925(arg1, 1) && (this.method8925(arg1, 2) && this.method8925(arg1, 3))))) {
						this.activeOccluders[this.activeOccluderCount++] = arg1;
					}
				}
			}
		} else if (arg1.type == 16 || arg1.type == 8) {
			int var23 = this.scene.drawDistance + (arg1.minTileX - this.scene.eyeTileX);
			if (var23 >= 0 && var23 <= this.scene.drawDistance + this.scene.drawDistance) {
				int var24 = this.scene.drawDistance + (arg1.minTileZ - this.scene.eyeTileZ);
				if (var24 >= 0 && var24 <= this.scene.drawDistance + this.scene.drawDistance && this.scene.visibilityMap[var23][var24]) {
					float var25 = (float) (this.scene.eyeX - arg1.x[0]);
					if (var25 < 0.0F) {
						var25 *= -1.0F;
					}
					float var26 = (float) (this.scene.eyeZ - arg1.z[0]);
					if (var26 < 0.0F) {
						var26 *= -1.0F;
					}
					if ((!(var25 < (float) this.field7016) || !(var26 < (float) this.field7016)) && (this.method8925(arg1, 0) && (this.method8925(arg1, 1) && (this.method8925(arg1, 2) && this.method8925(arg1, 3))))) {
						this.activeOccluders[this.activeOccluderCount++] = arg1;
					}
				}
			}
		} else if (arg1.type == 4) {
			float var15 = (float) (arg1.y[0] - this.scene.eyeY);
			if (!(var15 <= (float) this.field7025)) {
				int var16 = this.scene.drawDistance + (arg1.minTileZ - this.scene.eyeTileZ);
				if (var16 < 0) {
					var16 = 0;
				} else if (var16 > this.scene.drawDistance + this.scene.drawDistance) {
					return;
				}
				int var17 = this.scene.drawDistance + (arg1.maxTileZ - this.scene.eyeTileZ);
				if (var17 > this.scene.drawDistance + this.scene.drawDistance) {
					var17 = this.scene.drawDistance + this.scene.drawDistance;
				} else if (var17 < 0) {
					return;
				}
				int var18 = this.scene.drawDistance + (arg1.minTileX - this.scene.eyeTileX);
				if (var18 < 0) {
					var18 = 0;
				} else if (var18 > this.scene.drawDistance + this.scene.drawDistance) {
					return;
				}
				int var19 = this.scene.drawDistance + (arg1.maxTileX - this.scene.eyeTileX);
				if (var19 > this.scene.drawDistance + this.scene.drawDistance) {
					var19 = this.scene.drawDistance + this.scene.drawDistance;
				} else if (var19 < 0) {
					return;
				}
				boolean var20 = false;
				label291: for (int var21 = var18; var21 <= var19; var21++) {
					for (int var22 = var16; var22 <= var17; var22++) {
						if (this.scene.visibilityMap[var21][var22]) {
							var20 = true;
							break label291;
						}
					}
				}
				if (var20 && (this.method8925(arg1, 0) && (this.method8925(arg1, 1) && (this.method8925(arg1, 2) && this.method8925(arg1, 3))))) {
					this.activeOccluders[this.activeOccluderCount++] = arg1;
				}
			}
		}
	}

	@ObfuscatedName("um.u(Lui;I)Z")
	public boolean method8925(Occluder arg0, int arg1) {
		if (this.method8926(arg0.x[arg1], arg0.y[arg1], arg0.z[arg1])) {
			arg0.field7063[arg1] = (short) this.field7037[0];
			arg0.field7076[arg1] = (short) this.field7037[1];
			arg0.field7077[arg1] = (short) this.field7037[2];
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("um.z(III)Z")
	public final boolean method8926(int arg0, int arg1, int arg2) {
		toolkit.method2525((float) arg0, (float) arg1, (float) arg2, this.field7037);
		if (this.field7037[2] < 50.0F) {
			return false;
		} else {
			this.field7037[0] /= 3.0F;
			this.field7037[1] /= 3.0F;
			return true;
		}
	}

	@ObfuscatedName("um.p(III)Z")
	public boolean tileVisible(int arg0, int arg1, int arg2) {
		if (!this.field7031 || !this.field7017) {
			return false;
		} else if (this.field7024.field6896 < 101) {
			return false;
		} else {
			int var4 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
			if (-this.scene.cycle == var4) {
				return false;
			} else if (this.scene.cycle == var4) {
				return true;
			} else if (this.scene.underwaterLevelHeightMaps == this.scene.levelHeightmaps) {
				return false;
			} else {
				int var5 = arg1 << this.scene.size;
				int var6 = arg2 << this.scene.size;
				if (this.occluded(var5 + 1, this.scene.levelHeightmaps[arg0].getTileHeight(arg1, arg2), var6 + 1, this.scene.field6901 + var5 - 1, this.scene.levelHeightmaps[arg0].getTileHeight(arg1 + 1, arg2 + 1), this.scene.field6901 + var6 - 1, var5 + 1, this.scene.levelHeightmaps[arg0].getTileHeight(arg1, arg2 + 1), this.scene.field6901 + var6 - 1) && this.occluded(var5 + 1, this.scene.levelHeightmaps[arg0].getTileHeight(arg1, arg2), var6 + 1, this.scene.field6901 + var5 - 1, this.scene.levelHeightmaps[arg0].getTileHeight(arg1 + 1, arg2), var6 + 1, this.scene.field6901 + var5 - 1, this.scene.levelHeightmaps[arg0].getTileHeight(arg1 + 1, arg2 + 1), this.scene.field6901 + var6 - 1)) {
					this.levelTileOcclusionCycles[arg0][arg1][arg2] = this.scene.cycle;
					return true;
				} else {
					this.levelTileOcclusionCycles[arg0][arg1][arg2] = -this.scene.cycle;
					return false;
				}
			}
		}
	}

	@ObfuscatedName("um.d(Lasw;III)Z")
	public boolean wallVisible(WallLayerEntity arg0, int arg1, int arg2, int arg3) {
		if (!this.field7031 || !this.field7017) {
			return false;
		} else if (this.field7024.field6896 < 101) {
			return false;
		} else if (this.tileVisible(arg1, arg2, arg3)) {
			int var5 = arg2 << this.scene.size;
			int var6 = arg3 << this.scene.size;
			int var7 = this.scene.levelHeightmaps[arg1].getTileHeight(arg2, arg3) - 1;
			int var8 = var7 + arg0.overlayHeight();
			if (arg0.type == 1) {
				if (this.occluded(var5, var7, var6, var5, var8, var6, var5, var8, this.scene.field6901 + var6)) {
					return this.occluded(var5, var7, var6, var5, var8, this.scene.field6901 + var6, var5, var7, this.scene.field6901 + var6);
				} else {
					return false;
				}
			} else if (arg0.type == 2) {
				if (this.occluded(var5, var7, this.scene.field6901 + var6, this.scene.field6901 + var5, var8, this.scene.field6901 + var6, var5, var8, this.scene.field6901 + var6)) {
					return this.occluded(var5, var7, this.scene.field6901 + var6, this.scene.field6901 + var5, var7, this.scene.field6901 + var6, this.scene.field6901 + var5, var8, this.scene.field6901 + var6);
				} else {
					return false;
				}
			} else if (arg0.type == 4) {
				if (this.occluded(this.scene.field6901 + var5, var7, var6, this.scene.field6901 + var5, var8, var6, this.scene.field6901 + var5, var8, this.scene.field6901 + var6)) {
					return this.occluded(this.scene.field6901 + var5, var7, var6, this.scene.field6901 + var5, var8, this.scene.field6901 + var6, this.scene.field6901 + var5, var7, this.scene.field6901 + var6);
				} else {
					return false;
				}
			} else if (arg0.type == 8) {
				if (this.occluded(var5, var7, var6, this.scene.field6901 + var5, var8, var6, var5, var8, var6)) {
					return this.occluded(var5, var7, var6, this.scene.field6901 + var5, var7, var6, this.scene.field6901 + var5, var8, var6);
				} else {
					return false;
				}
			} else if (arg0.type == 16) {
				return this.occluded(var5, var7, this.scene.field6924 + var6, this.scene.field6924, var8, this.scene.field6924);
			} else if (arg0.type == 32) {
				return this.occluded(this.scene.field6924 + var5, var7, this.scene.field6924 + var6, this.scene.field6924, var8, this.scene.field6924);
			} else if (arg0.type == 64) {
				return this.occluded(this.scene.field6924 + var5, var7, var6, this.scene.field6924, var8, this.scene.field6924);
			} else if (arg0.type == 128) {
				return this.occluded(var5, var7, var6, this.scene.field6924, var8, this.scene.field6924);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("um.c(IIII)Z")
	public boolean visible(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field7031 || !this.field7017) {
			return false;
		} else if (this.field7024.field6896 < 101) {
			return false;
		} else if (this.tileVisible(arg0, arg1, arg2)) {
			int var5 = arg1 << this.scene.size;
			int var6 = arg2 << this.scene.size;
			return this.occluded(var5, this.scene.levelHeightmaps[arg0].getTileHeight(arg1, arg2), var6, this.scene.field6901, arg3, this.scene.field6901);
		} else {
			return false;
		}
	}

	@ObfuscatedName("um.r(IIIIILuq;)Z")
	public boolean locVisible(int arg0, int arg1, int arg2, int arg3, int arg4, EntityBounds arg5) {
		if (!this.field7031 || !this.field7017) {
			return false;
		} else if (this.field7024.field6896 < 101) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.levelTileOcclusionCycles[arg0].length || arg4 >= this.levelTileOcclusionCycles[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (int var7 = arg1; var7 <= arg2; var7++) {
				for (int var8 = arg3; var8 <= arg4; var8++) {
					if (this.levelTileOcclusionCycles[arg0][var7][var8] == -this.scene.cycle) {
						return false;
					}
				}
			}
			if (this.occluded(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.tileVisible(arg0, arg1, arg3)) {
			return this.occluded(arg5);
		} else {
			return false;
		}
	}

	@ObfuscatedName("um.v(Luq;)Z")
	public final boolean occluded(EntityBounds arg0) {
		return arg0 == null ? false : this.occluded(arg0.field7049, arg0.field7053, arg0.field7055, arg0.field7052 - arg0.field7049, arg0.field7047 - arg0.field7053, arg0.field7056 - arg0.field7055);
	}

	@ObfuscatedName("um.o(IIIIII)Z")
	public final boolean occluded(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg0 + arg3;
		int var8 = arg1 + arg4;
		int var9 = arg2 + arg5;
		if (!this.occluded(arg0, var8, arg2, var7, var8, var9, arg0, var8, var9)) {
			return false;
		} else if (this.occluded(arg0, var8, arg2, var7, var8, arg2, var7, var8, var9)) {
			if (arg0 < this.scene.eyeX) {
				if (!this.occluded(arg0, arg1, var9, arg0, var8, arg2, arg0, var8, var9)) {
					return false;
				}
				if (!this.occluded(arg0, arg1, var9, arg0, arg1, arg2, arg0, var8, arg2)) {
					return false;
				}
			} else if (!this.occluded(var7, arg1, var9, var7, var8, arg2, var7, var8, var9)) {
				return false;
			} else if (!this.occluded(var7, arg1, var9, var7, arg1, arg2, var7, var8, arg2)) {
				return false;
			}
			if (arg2 < this.scene.eyeZ) {
				if (!this.occluded(arg0, arg1, arg2, var7, var8, arg2, arg0, var8, arg2)) {
					return false;
				}
				if (!this.occluded(arg0, arg1, arg2, var7, arg1, arg2, var7, var8, arg2)) {
					return false;
				}
			} else if (!this.occluded(arg0, arg1, var9, var7, var8, var9, arg0, var8, var9)) {
				return false;
			} else if (!this.occluded(arg0, arg1, var9, var7, arg1, var9, var7, var8, var9)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("um.s(IIIIIIIII)Z")
	public final boolean occluded(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (!this.method8926(arg0, arg1, arg2)) {
			return false;
		}
		int var10 = (int) this.field7037[0];
		int var11 = (int) this.field7037[1];
		int var12 = (int) this.field7037[2];
		if (!this.method8926(arg3, arg4, arg5)) {
			return false;
		}
		int var13 = (int) this.field7037[0];
		int var14 = (int) this.field7037[1];
		int var15 = (int) this.field7037[2];
		if (this.method8926(arg6, arg7, arg8)) {
			int var16 = (int) this.field7037[0];
			int var17 = (int) this.field7037[1];
			int var18 = (int) this.field7037[2];
			return this.field7024.method8697(var11, var14, var17, var10, var13, var16, var12, var15, var18);
		} else {
			return false;
		}
	}
}
