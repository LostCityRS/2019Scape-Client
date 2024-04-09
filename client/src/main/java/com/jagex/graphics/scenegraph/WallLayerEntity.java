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
	public static final int[] field12454 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("asw.ag")
	public short field12463;

	@ObfuscatedName("asw.ah")
	public int field12464 = 0;

	@ObfuscatedName("asw.al")
	public Light[] field12459 = new Light[4];

	public WallLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ScaleRotTrans arg7) {
		super(arg0, arg7);
		this.level = (byte) arg4;
		this.field11714 = (byte) arg5;
		this.field12463 = (short) arg6;
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
			int var3 = (int) var2.x >> this.scene.field6900;
			int var4 = (int) var2.z >> this.scene.field6900;
			int var5 = 0;
			if (this.scene.field6902 == var3) {
				var5++;
			} else if (this.scene.field6902 < var3) {
				var5 += 2;
			}
			if (this.scene.field6947 == var4) {
				var5 += 3;
			} else if (this.scene.field6947 > var4) {
				var5 += 6;
			}
			int var6 = field12454[var5];
			if ((this.field12463 & var6) == 0) {
				if (this.field12463 == 1 && var3 > 0) {
					var3--;
				} else if (this.field12463 == 4 && var3 <= this.scene.maxTileX) {
					var3++;
				} else if (this.field12463 == 8 && var4 > 0) {
					var4--;
				} else if (this.field12463 == 2 && var4 <= this.scene.maxTileZ) {
					var4++;
				} else if (this.field12463 == 16 && var3 > 0 && var4 <= this.scene.maxTileZ) {
					var3--;
					var4++;
				} else if (this.field12463 == 32 && var3 <= this.scene.maxTileX && var4 <= this.scene.maxTileZ) {
					var3++;
					var4++;
				} else if (this.field12463 == 128 && var3 > 0 && var4 > 0) {
					var3--;
					var4--;
				} else if (this.field12463 == 64 && var3 <= this.scene.maxTileX && var4 > 0) {
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
	public boolean method18360(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		return this.scene.field6930.method8928(this, this.field11714, (int) var2.x >> this.scene.field6900, (int) var2.z >> this.scene.field6900);
	}

	@ObfuscatedName("asw.gn(I)Z")
	public boolean method18361() {
		Vector3 var1 = this.getTransform().trans;
		return this.scene.field6962[this.scene.field6942 + (((int) var1.x >> this.scene.field6900) - this.scene.field6902)][this.scene.field6942 + (((int) var1.z >> this.scene.field6900) - this.scene.field6947)];
	}
}
