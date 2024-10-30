package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("asw")
public abstract class WallLayerEntity extends GraphEntity {

	@ObfuscatedName("asw.ae")
	public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("asw.ag")
	public short type;

	@ObfuscatedName("asw.ah")
	public int field12464 = 0;

	@ObfuscatedName("asw.al")
	public Light[] field12459 = new Light[4];

	public WallLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ScaleRotTrans arg7) {
		super(arg0, arg7);
		this.level = (byte) arg4;
		this.occludeLevel = (byte) arg5;
		this.type = (short) arg6;
		if (arg7 != null) {
			this.method10529(arg7);
		}
		this.method10532((float) arg1, (float) arg2, (float) arg3);
		for (int var9 = 0; var9 < 4; var9++) {
			this.field12459[var9] = null;
		}
	}

	@ObfuscatedName("asw.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		if (this.field8176) {
			Vector3 var2 = this.getTransform().trans;
			int var3 = (int) var2.x >> this.scene.size;
			int var4 = (int) var2.z >> this.scene.size;
			int var5 = 0;
			if (this.scene.eyeTileX == var3) {
				var5++;
			} else if (this.scene.eyeTileX < var3) {
				var5 += 2;
			}
			if (this.scene.eyeTileZ == var4) {
				var5 += 3;
			} else if (this.scene.eyeTileZ > var4) {
				var5 += 6;
			}
			int var6 = FRONT_WALL_TYPES[var5];
			if ((this.type & var6) == 0) {
				if (this.type == 1 && var3 > 0) {
					var3--;
				} else if (this.type == 4 && var3 <= this.scene.maxTileX) {
					var3++;
				} else if (this.type == 8 && var4 > 0) {
					var4--;
				} else if (this.type == 2 && var4 <= this.scene.maxTileZ) {
					var4++;
				} else if (this.type == 16 && var3 > 0 && var4 <= this.scene.maxTileZ) {
					var3--;
					var4++;
				} else if (this.type == 32 && var3 <= this.scene.maxTileX && var4 <= this.scene.maxTileZ) {
					var3++;
					var4++;
				} else if (this.type == 128 && var3 > 0 && var4 > 0) {
					var3--;
					var4--;
				} else if (this.type == 64 && var3 <= this.scene.maxTileX && var4 > 0) {
					var3++;
					var4--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.field12464 = this.method18362(var3, var4, this.field12459);
			this.field8176 = false;
		}
		for (int var7 = 0; var7 < this.field12464; var7++) {
			arg0[var7] = this.field12459[var7];
		}
		return this.field12464;
	}

	@ObfuscatedName("asw.ga(Ldh;S)Z")
	public boolean isOccluded(Toolkit arg0) {
		Vector3 var2 = this.getTransform().trans;
		return this.scene.occlusionManager.wallVisible(this, this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
	}

	@ObfuscatedName("asw.gn(I)Z")
	public boolean isVisible() {
		Vector3 var1 = this.getTransform().trans;
		return this.scene.visibilityMap[this.scene.drawDistance + (((int) var1.x >> this.scene.size) - this.scene.eyeTileX)][this.scene.drawDistance + (((int) var1.z >> this.scene.size) - this.scene.eyeTileZ)];
	}
}
