package com.jagex.game.world.entity;

import com.jagex.game.config.objtype.ObjType;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.graphics.scenegraph.ObjLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Trig1;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aut")
public class ObjStackEntity extends ObjLayerEntity {

	@ObfuscatedName("aut.x")
	public static Matrix4x3 field12584 = new Matrix4x3();

	@ObfuscatedName("aut.b")
	public int field12580;

	@ObfuscatedName("aut.h")
	public int field12570;

	@ObfuscatedName("aut.a")
	public int field12569 = -1;

	@ObfuscatedName("aut.g")
	public int field12572;

	@ObfuscatedName("aut.i")
	public int field12573 = -1;

	@ObfuscatedName("aut.j")
	public int field12583;

	@ObfuscatedName("aut.t")
	public Matrix4x3 field12571 = null;

	@ObfuscatedName("aut.ae")
	public Matrix4x3 field12568 = null;

	@ObfuscatedName("aut.ag")
	public Matrix4x3 field12577 = null;

	@ObfuscatedName("aut.ah")
	public int field12578 = 0;

	@ObfuscatedName("aut.al")
	public int field12579 = 0;

	@ObfuscatedName("aut.ac")
	public boolean field12576 = false;

	@ObfuscatedName("aut.ai")
	public int field12581;

	@ObfuscatedName("aut.aw")
	public int field12582;

	@ObfuscatedName("aut.as")
	public int field12574;

	@ObfuscatedName("aut.at")
	public int field12575;

	public ObjStackEntity(Scene scene, int x, int y, int z, int level, int occludeLevel) {
		super(scene, x, y, z, level, occludeLevel);
		this.createEntityBounds(3);
		this.method19718();
	}

	@ObfuscatedName("aut.e(B)V")
	public void method19718() {
		this.field12581 = (int) (Math.random() * 4.0D) + 32;
		this.field12582 = (int) (Math.random() * 2.0D) + 3;
		this.field12574 = (int) (Math.random() * 3.0D) + 16;
		if (Client.preferences.textures.getValue() == 1) {
			this.field12575 = (int) (Math.random() * 10.0D);
		} else {
			this.field12575 = (int) (Math.random() * 20.0D);
		}
	}

	@ObfuscatedName("aut.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("aut.bw(S)Z")
	public boolean method16489() {
		return this.field12576;
	}

	@ObfuscatedName("aut.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		return null;
	}

	@ObfuscatedName("aut.by(B)I")
	public int overlayHeight() {
		return -10;
	}

	@ObfuscatedName("aut.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		Vector3 var2 = Vector3.create(this.getTransform().trans);
		PrimaryLayerEntityList var3 = this.scene.getEntities(this.level, (int) var2.x >> 9, (int) var2.z >> 9);
		GroundDecorLayerEntity var4 = this.scene.getGroundDecoration(this.level, (int) var2.x >> 9, (int) var2.z >> 9);
		int var5 = 0;
		while (var3 != null) {
			if (var3.field7057.raised && var3.field7057.overlayHeight() < var5) {
				var5 = var3.field7057.overlayHeight();
			}
			var3 = var3.field7058;
		}
		if (var4 != null && var4.field12448 > -var5) {
			var5 = -var4.field12448;
		}
		if (this.field12578 != var5) {
			var2.y += var5 - this.field12578;
			this.method10531(var2);
			this.field12578 = var5;
		}
		Matrix4x3 var6 = toolkit.method2209();
		var6.setToIdentity();
		if (this.field12578 == 0) {
			boolean var7 = false;
			boolean var8 = false;
			boolean var9 = false;
			FloorModel var10 = this.scene.levelHeightmaps[this.occludeLevel];
			int var11 = this.field12579 << 1;
			int var13 = -var11 / 2;
			int var14 = -var11 / 2;
			int var15 = var10.getFineHeight((int) var2.x + var13, (int) var2.z + var14);
			int var16 = var11 / 2;
			int var17 = -var11 / 2;
			int var18 = var10.getFineHeight((int) var2.x + var16, (int) var2.z + var17);
			int var19 = -var11 / 2;
			int var20 = var11 / 2;
			int var21 = var10.getFineHeight((int) var2.x + var19, (int) var2.z + var20);
			int var22 = var11 / 2;
			int var23 = var11 / 2;
			int var24 = var10.getFineHeight((int) var2.x + var22, (int) var2.z + var23);
			int var25 = var15 < var18 ? var15 : var18;
			int var26 = var21 < var24 ? var21 : var24;
			int var27 = var18 < var24 ? var18 : var24;
			int var28 = var15 < var21 ? var15 : var21;
			if (var11 != 0) {
				int var29 = (int) (Math.atan2((double) (var25 - var26), (double) var11) * 2607.5945876176133D) & 0x3FFF;
				if (var29 != 0) {
					var6.rotateAroundAxis(1.0F, 0.0F, 0.0F, Trig1.radians(var29));
				}
			}
			if (var11 != 0) {
				int var30 = (int) (Math.atan2((double) (var28 - var27), (double) var11) * 2607.5945876176133D) & 0x3FFF;
				if (var30 != 0) {
					var6.rotateAroundAxis(0.0F, 0.0F, 1.0F, Trig1.radians(-var30));
				}
			}
			int var31 = var15 + var24;
			if (var18 + var21 < var31) {
				var31 = var18 + var21;
			}
			int var32 = (var31 >> 1) - (int) var2.y;
			if (var32 != 0) {
				var6.translate(0.0F, (float) var32, 0.0F);
			}
		}
		var2.release();
		Vector3 var33 = this.getTransform().trans;
		var6.translate(var33.x, var33.y - 10.0F, var33.z);
		PickableEntity var34 = PickableEntity.getPickableEntity(true);
		this.field12576 = false;
		this.field12579 = 0;
		if (this.field12573 != -1) {
			Model var35 = ((ObjType) Client.objTypeList.list(this.field12573)).method14644(toolkit, 526336, this.field12583, null, null, this.field12581, this.field12582, this.field12574, this.field12575);
			if (var35 != null) {
				if (this.field12577 == null) {
					field12584.setToIdentity();
				} else {
					field12584.setTo(this.field12577);
				}
				field12584.method6316(var6);
				var35.draw(field12584, this.entityBounds[2], 0);
				this.field12576 |= var35.method1731();
				this.field12579 = var35.getRadius();
			}
		}
		if (this.field12569 != -1) {
			Model var36 = ((ObjType) Client.objTypeList.list(this.field12569)).method14644(toolkit, 526336, this.field12572, null, null, this.field12581, this.field12582, this.field12574, this.field12575);
			if (var36 != null) {
				if (this.field12568 == null) {
					field12584.setToIdentity();
				} else {
					field12584.setTo(this.field12568);
				}
				field12584.method6316(var6);
				var36.draw(field12584, this.entityBounds[1], 0);
				this.field12576 |= var36.method1731();
				if (var36.getRadius() > this.field12579) {
					this.field12579 = var36.getRadius();
				}
			}
		}
		Model var37 = ((ObjType) Client.objTypeList.list(this.field12580)).method14644(toolkit, 526336, this.field12570, null, null, this.field12581, this.field12582, this.field12574, this.field12575);
		if (var37 != null) {
			if (this.field12571 == null) {
				field12584.setToIdentity();
			} else {
				field12584.setTo(this.field12571);
			}
			field12584.method6316(var6);
			var37.draw(field12584, this.entityBounds[0], 0);
			this.field12576 |= var37.method1731();
			if (var37.getRadius() > this.field12579) {
				this.field12579 = var37.getRadius();
			}
		}
		return var34;
	}

	@ObfuscatedName("ad.n(B)Lou;")
	public static Matrix4x3 method820() {
		Matrix4x3 var0 = new Matrix4x3();
		var0.setToRotation(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		float var1 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		var0.translate(var1 - 128.0F, 0.0F, 0.0F);
		var0.rotateAroundAxis(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return var0;
	}

	@ObfuscatedName("aut.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
	}

	@ObfuscatedName("aut.gp(I)I")
	public int getPickSizeShift() {
		ObjType var1 = (ObjType) Client.objTypeList.list(this.field12580);
		int var2 = var1.picksizeshift;
		if (this.field12569 != -1) {
			ObjType var3 = (ObjType) Client.objTypeList.list(this.field12569);
			if (var3.picksizeshift > var2) {
				var2 = var3.picksizeshift;
			}
		}
		if (this.field12573 != -1) {
			ObjType var4 = (ObjType) Client.objTypeList.list(this.field12573);
			if (var4.picksizeshift > var2) {
				var2 = var4.picksizeshift;
			}
		}
		return var2;
	}

	@ObfuscatedName("aut.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		Matrix4x3 var4 = toolkit.method2209();
		var4.setToTransform2(this.getTransform());
		var4.translate(0.0F, -10.0F, 0.0F);
		Model var5 = ((ObjType) Client.objTypeList.list(this.field12580)).method14644(toolkit, 131072, this.field12570, null, null, 0, 0, 0, 0);
		if (var5 != null) {
			if (this.field12571 == null) {
				field12584.setToIdentity();
			} else {
				field12584.setTo(this.field12571);
			}
			field12584.method6316(var4);
			if (var5.method1725(arg1, arg2, field12584, true, 0)) {
				return true;
			}
		}
		if (this.field12569 != -1) {
			Model var6 = ((ObjType) Client.objTypeList.list(this.field12569)).method14644(toolkit, 131072, this.field12572, null, null, 0, 0, 0, 0);
			if (var6 != null) {
				if (this.field12568 == null) {
					field12584.setToIdentity();
				} else {
					field12584.setTo(this.field12568);
				}
				field12584.method6316(var4);
				if (var6.method1725(arg1, arg2, field12584, true, 0)) {
					return true;
				}
			}
		}
		if (this.field12573 != -1) {
			Model var7 = ((ObjType) Client.objTypeList.list(this.field12573)).method14644(toolkit, 131072, this.field12583, null, null, 0, 0, 0, 0);
			if (var7 != null) {
				if (this.field12577 == null) {
					field12584.setToIdentity();
				} else {
					field12584.setTo(this.field12577);
				}
				field12584.method6316(var4);
				if (var7.method1725(arg1, arg2, field12584, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("aut.bo(I)I")
	public int height() {
		return this.field12578 - this.overlayHeight();
	}
}
