package rs2.client.scene.entities;

import com.jagex.game.world.entity.*;
import com.jagex.graphics.AnimationWrapper;
import com.jagex.graphics.scenegraph.GraphEntity;
import rs2.client.Client;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aur")
public class SpotAnimation extends PrimaryLayerEntity {

	@ObfuscatedName("aur.ae")
	public int field12613;

	@ObfuscatedName("aur.ag")
	public int field12608 = 0;

	@ObfuscatedName("aur.ah")
	public AnimationWrapper field12609;

	@ObfuscatedName("aur.al")
	public int field12610 = 0;

	@ObfuscatedName("aur.ac")
	public boolean field12611 = true;

	@ObfuscatedName("aur.ai")
	public ParticleSystem field12612;

	@ObfuscatedName("aur.aw")
	public int field12607 = 0;

	public SpotAnimation(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.field12613 = arg1;
		this.field12608 = arg12;
		this.field12607 = arg14;
		EffectAnimType var16 = (EffectAnimType) Statics.field4874.get(this.field12613);
		int var17 = var16.field8260;
		if (var17 != -1) {
			this.field12609 = new EntityAnimationWrapper(this, false);
			int var18 = var16.field8261 ? 0 : 2;
			if (arg13) {
				var18 = 1;
			}
			this.field12609.method14353(var17, arg2, var18, false);
		}
		this.method18363(1);
	}

	@ObfuscatedName("aur.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("aur.bw(S)Z")
	public boolean method16489() {
		return this.field12611;
	}

	@ObfuscatedName("aur.by(B)I")
	public int method16523() {
		return this.field12610;
	}

	@ObfuscatedName("aur.e(I)I")
	public int method19745() {
		return this.field12607;
	}

	@ObfuscatedName("aur.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer arg0) {
		return null;
	}

	@ObfuscatedName("aur.n(II)V")
	public final void method19746(int arg0) {
		if (this.field12609 != null && !this.field12609.method14375()) {
			this.field12609.method14367(arg0);
		}
	}

	@ObfuscatedName("aur.m(I)Z")
	public final boolean method19751() {
		return this.field12609 != null && !this.field12609.method14355();
	}

	@ObfuscatedName("aur.k(I)Z")
	public final boolean method19747() {
		return this.field12609 == null || this.field12609.method14375();
	}

	@ObfuscatedName("aur.f(Ldh;IIB)Ldo;")
	public Model method19748(Renderer arg0, int arg1, int arg2) {
		EffectAnimType var4 = (EffectAnimType) Statics.field4874.get(arg2);
		FloorModel var5 = this.field11716.field6915[this.field11717];
		FloorModel var6 = this.field11714 < 3 ? this.field11716.field6915[this.field11714 + 1] : null;
		Vector3 var7 = this.method10536().field4298;
		return this.field12609 == null || this.field12609.method14375() ? var4.method13802(arg0, arg1, this.field12608 * 2048, var5, var6, (int) var7.field4308, (int) var7.field4311, (int) var7.field4313, null, (byte) 2) : var4.method13802(arg0, arg1, this.field12608 * 2048, var5, var6, (int) var7.field4308, (int) var7.field4311, (int) var7.field4313, this.field12609, (byte) 2);
	}

	@ObfuscatedName("aur.fc(Ldh;I)Ltl;")
	public PickableEntity method17372(Renderer arg0) {
		Model var2 = this.method19748(arg0, (this.field12608 == 0 ? 0 : 5) | 0x800, this.field12613);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		this.method19750(arg0, var2, var3);
		PickableEntity var4 = PickableEntity.method16749(false);
		var2.method1813(var3, this.field11713[0], 0);
		if (this.field12612 != null) {
			ParticleList var5 = this.field12612.method9965();
			arg0.method2198(var5);
		}
		this.field12611 = var2.method1731();
		this.field12610 = var2.method1748();
		var2.method1728();
		return var4;
	}

	@ObfuscatedName("aur.fw(Ldh;I)V")
	public void method17373(Renderer arg0) {
		Model var2 = this.method19748(arg0, 0, this.field12613);
		if (var2 != null) {
			this.method19750(arg0, var2, this.method10533());
		}
	}

	@ObfuscatedName("aur.w(Ldh;Ldo;Lou;B)V")
	public void method19750(Renderer arg0, Model arg1, Matrix4x3 arg2) {
		arg1.method1689(arg2);
		ModelParticleEmitter[] var4 = arg1.method1750();
		ModelParticleEffector[] var5 = arg1.method1765();
		if ((this.field12612 == null || this.field12612.field7804) && (var4 != null || var5 != null)) {
			this.field12612 = ParticleSystem.method9962(Client.field10903, true);
		}
		if (this.field12612 != null) {
			this.field12612.method9936(arg0, (long) Client.field10903, var4, var5, false);
			this.field12612.method9963(this.field11717, this.field12471, this.field12472, this.field12468, this.field12467);
		}
	}

	@ObfuscatedName("aur.l(B)V")
	public void method19749() {
		if (this.field12612 != null) {
			this.field12612.method9932();
		}
	}

	@ObfuscatedName("aur.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer arg0, int arg1, int arg2) {
		return false;
	}

	@ObfuscatedName("aur.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aur.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aur.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}
}
