package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("asw")
public abstract class WallLayerEntity extends GraphEntity {

	@ObfuscatedName("asw.j")
	public static final int field12460 = 64;

	@ObfuscatedName("asw.ae")
	public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("asw.ag")
	public short type;

	@ObfuscatedName("asw.ah")
	public int field12464 = 0;

	@ObfuscatedName("asw.al")
	public Light[] field12459 = new Light[4];

	public WallLayerEntity(Scene scene, int x, int y, int z, int level, int occludeLevel, int type, ScaleRotTrans scaleRotTrans) {
		super(scene, scaleRotTrans);
		this.level = (byte) level;
		this.occludeLevel = (byte) occludeLevel;
		this.type = (short) type;
		if (scaleRotTrans != null) {
			this.method10529(scaleRotTrans);
		}
		this.method10532((float) x, (float) y, (float) z);
		for (int var9 = 0; var9 < 4; var9++) {
			this.field12459[var9] = null;
		}
	}

	@ObfuscatedName("asw.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		if (this.field8176) {
			Vector3 var2 = this.getTransform().trans;
			int tileX = (int) var2.x >> this.scene.size;
			int tileZ = (int) var2.z >> this.scene.size;
			int direction = 0;
			if (this.scene.eyeTileX == tileX) {
				direction++;
			} else if (this.scene.eyeTileX < tileX) {
				direction += 2;
			}
			if (this.scene.eyeTileZ == tileZ) {
				direction += 3;
			} else if (this.scene.eyeTileZ > tileZ) {
				direction += 6;
			}
			int var6 = FRONT_WALL_TYPES[direction];
			if ((this.type & var6) == 0) {
				if (this.type == 1 && tileX > 0) {
					tileX--;
				} else if (this.type == 4 && tileX <= this.scene.maxTileX) {
					tileX++;
				} else if (this.type == 8 && tileZ > 0) {
					tileZ--;
				} else if (this.type == 2 && tileZ <= this.scene.maxTileZ) {
					tileZ++;
				} else if (this.type == 16 && tileX > 0 && tileZ <= this.scene.maxTileZ) {
					tileX--;
					tileZ++;
				} else if (this.type == 32 && tileX <= this.scene.maxTileX && tileZ <= this.scene.maxTileZ) {
					tileX++;
					tileZ++;
				} else if (this.type == 128 && tileX > 0 && tileZ > 0) {
					tileX--;
					tileZ--;
				} else if (this.type == 64 && tileX <= this.scene.maxTileX && tileZ > 0) {
					tileX++;
					tileZ--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.field12464 = this.method18362(tileX, tileZ, this.field12459);
			this.field8176 = false;
		}
		for (int var7 = 0; var7 < this.field12464; var7++) {
			arg0[var7] = this.field12459[var7];
		}
		return this.field12464;
	}

	@ObfuscatedName("asw.ga(Ldh;S)Z")
	public boolean isOccluded(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		return this.scene.occlusionManager.wallVisible(this, this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
	}

	@ObfuscatedName("asw.gn(I)Z")
	public boolean isVisible() {
		Vector3 var1 = this.getTransform().trans;
		return this.scene.visibilityMap[this.scene.drawDistance + (((int) var1.x >> this.scene.size) - this.scene.eyeTileX)][this.scene.drawDistance + (((int) var1.z >> this.scene.size) - this.scene.eyeTileZ)];
	}
}
