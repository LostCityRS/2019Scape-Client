package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.Scene;
import com.jagex.game.world.entity.StaticPointLight;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("ash")
public abstract class PrimaryLayerEntity extends GraphEntity {

	@ObfuscatedName("ash.x")
	public short minSceneTileX;

	@ObfuscatedName("ash.b")
	public short maxSceneTileX;

	@ObfuscatedName("ash.h")
	public short minSceneTileZ;

	@ObfuscatedName("ash.a")
	public short maxSceneTileZ;

	@ObfuscatedName("ash.g")
	public boolean raised;

	@ObfuscatedName("ash.i")
	public byte field12469;

	@ObfuscatedName("ash.j")
	public int field12466;

	@ObfuscatedName("ash.t")
	public Light[] field12473;

	public PrimaryLayerEntity(Scene scene, int level, int occludeLevel, int x, int y, int z, int minSceneTileX, int maxSceneTileX, int minSceneTileZ, int maxSceneTileZ, boolean raised, byte arg11) {
		this(scene, level, occludeLevel, x, y, z, minSceneTileX, maxSceneTileX, minSceneTileZ, maxSceneTileZ, raised, arg11, (ScaleRotTrans) null);
	}

	public PrimaryLayerEntity(Scene scene, int level, int occludeLevel, int x, int y, int z, int minSceneTileX, int maxSceneTileX, int minSceneTileZ, int maxSceneTileZ, boolean raised, byte arg11, ScaleRotTrans scaleRotTrans) {
		super(scene, scaleRotTrans);
		this.field12466 = 0;
		this.field12473 = new Light[4];
		this.level = (byte) level;
		this.occludeLevel = (byte) occludeLevel;
		if (scaleRotTrans != null) {
			this.method10529(scaleRotTrans);
		}
		this.method10532((float) x, (float) y, (float) z);
		this.minSceneTileX = (short) minSceneTileX;
		this.maxSceneTileX = (short) maxSceneTileX;
		this.minSceneTileZ = (short) minSceneTileZ;
		this.maxSceneTileZ = (short) maxSceneTileZ;
		this.raised = raised;
		this.field12469 = arg11;
		for (int var14 = 0; var14 < 4; var14++) {
			this.field12473[var14] = null;
		}
	}

	@ObfuscatedName("ash.bv(I)V")
	public void method16529() {
	}

	@ObfuscatedName("ash.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		if (this.field8176) {
			this.field12466 = 0;
			int var2 = Math.max(0, this.minSceneTileX);
			int var3 = Math.min(this.scene.field6954[this.level].length - 1, this.maxSceneTileX);
			int var4 = Math.max(0, this.minSceneTileZ);
			int var5 = Math.min(this.scene.field6954[this.level][var2].length - 1, this.maxSceneTileZ);
			int var6 = var4;
			label129: while (var2 <= var3) {
				label126: for (int var7 = var6; var7 <= var5; var7++) {
					long var8 = this.scene.field6954[this.level][var2][var7];
					long var10 = 0L;
					while (true) {
						label121: while (true) {
							if (var10 > 48L) {
								continue label126;
							}
							int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
							if (var12 <= 0) {
								continue label126;
							}
							StaticPointLight var13 = this.scene.field6926[var12 - 1];
							for (int var14 = 0; var14 < this.field12466; var14++) {
								if (this.field12473[var14] == var13.field7003) {
									var10 += 16L;
									continue label121;
								}
							}
							this.field12473[++this.field12466 - 1] = var13.field7003;
							if (this.field12466 == 4) {
								break label129;
							}
							var10 += 16L;
						}
					}
				}
				var2++;
			}
			for (int var15 = this.field12466; var15 < 4; var15++) {
				this.field12473[var15] = null;
			}
			if (this.field12469 != 0) {
				int var16 = this.minSceneTileX - this.scene.eyeTileX;
				int var17 = this.minSceneTileZ - this.scene.eyeTileZ;
				short var18;
				int var19;
				int var20;
				short var21;
				if (this.field12469 == 1) {
					if (var17 > var16) {
						var18 = this.minSceneTileX;
						var19 = this.minSceneTileZ - 1;
						var20 = this.minSceneTileX + 1;
						var21 = this.minSceneTileZ;
					} else {
						var18 = this.minSceneTileX;
						var19 = this.minSceneTileZ + 1;
						var20 = this.minSceneTileX - 1;
						var21 = this.minSceneTileZ;
					}
				} else if (var17 > -var16) {
					var18 = this.minSceneTileX;
					var19 = this.minSceneTileZ - 1;
					var20 = this.minSceneTileX - 1;
					var21 = this.minSceneTileZ;
				} else {
					var18 = this.minSceneTileX;
					var19 = this.minSceneTileZ + 1;
					var20 = this.minSceneTileX + 1;
					var21 = this.minSceneTileZ;
				}
				label92: for (int var22 = 0; var22 < this.field12466; var22++) {
					long var23 = this.scene.field6954[this.level][var18][var19];
					while (var23 != 0L) {
						StaticPointLight var25 = this.scene.field6926[(int) ((var23 & 0xFFFFL) - 1L)];
						var23 >>>= 0x10;
						if (this.field12473[var22] == var25.field7003) {
							continue label92;
						}
					}
					long var26 = this.scene.field6954[this.level][var20][var21];
					while (var26 != 0L) {
						StaticPointLight var28 = this.scene.field6926[(int) ((var26 & 0xFFFFL) - 1L)];
						var26 >>>= 0x10;
						if (this.field12473[var22] == var28.field7003) {
							continue label92;
						}
					}
					for (int var29 = var22; var29 < this.field12466 - 1; var29++) {
						this.field12473[var29] = this.field12473[var29 + 1];
					}
					this.field12466--;
				}
			}
			this.field8176 = false;
		}
		for (int var30 = 0; var30 < this.field12466; var30++) {
			arg0[var30] = this.field12473[var30];
		}
		return this.field12466;
	}

	@ObfuscatedName("ash.ga(Ldh;S)Z")
	public boolean isOccluded(Toolkit toolkit) {
		return this.scene.occlusionManager.locVisible(this.occludeLevel, this.minSceneTileX, this.maxSceneTileX, this.minSceneTileZ, this.maxSceneTileZ, this.method17371(toolkit));
	}

	@ObfuscatedName("ash.gn(I)Z")
	public boolean isVisible() {
		for (int var1 = this.minSceneTileX; var1 <= this.maxSceneTileX; var1++) {
			for (int var2 = this.minSceneTileZ; var2 <= this.maxSceneTileZ; var2++) {
				int var3 = this.scene.drawDistance + (var1 - this.scene.eyeTileX);
				if (var3 >= 0 && var3 < this.scene.visibilityMap.length) {
					int var4 = this.scene.drawDistance + (var2 - this.scene.eyeTileZ);
					if (var4 >= 0 && var4 < this.scene.visibilityMap.length && this.scene.visibilityMap[var3][var4]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
