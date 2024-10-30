package rs2.client.scene.entities;

import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.cutscene.CutsceneManager;
import com.jagex.game.world.entity.EntityAnimationNode;
import com.jagex.game.world.entity.EntityBounds;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.game.world.entity.PickableEntity;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelParticleEffector;
import com.jagex.graphics.ModelParticleEmitter;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Quaternion;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Trig1;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aue")
public class ProjectileAnimation extends PrimaryLayerEntity {

	@ObfuscatedName("aue.ae")
	public final int effectAnim;

	@ObfuscatedName("aue.ag")
	public final int field12599;

	@ObfuscatedName("aue.ah")
	public final int offsetY;

	@ObfuscatedName("aue.al")
	public final int startCycle;

	@ObfuscatedName("aue.ac")
	public final int lastCycle;

	@ObfuscatedName("aue.ai")
	public final int peakPitch;

	@ObfuscatedName("aue.aw")
	public final int arc;

	@ObfuscatedName("aue.as")
	public final int target2;

	@ObfuscatedName("aue.at")
	public final int target;

	@ObfuscatedName("aue.ad")
	public final int field12594;

	@ObfuscatedName("aue.am")
	public final boolean field12595;

	@ObfuscatedName("aue.au")
	public boolean mobile = false;

	@ObfuscatedName("aue.ar")
	public double velocityX;

	@ObfuscatedName("aue.ap")
	public double velocityZ;

	@ObfuscatedName("aue.aq")
	public double velocity;

	@ObfuscatedName("aue.ax")
	public double velocityY;

	@ObfuscatedName("aue.av")
	public double accelerationY;

	@ObfuscatedName("aue.ao")
	public final AnimationNode field12602;

	@ObfuscatedName("aue.aj")
	public int overlayHeight = 0;

	@ObfuscatedName("aue.ay")
	public boolean field12604 = false;

	@ObfuscatedName("aue.ab")
	public ParticleSystem field12585;

	@ObfuscatedName("aue.az")
	public int targeted = 0;

	public ProjectileAnimation(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
		super(arg0, arg2, arg3, arg4, Client.getHeightmapY(arg4, arg5, arg2) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte) 0);
		this.effectAnim = arg1;
		this.startCycle = arg7;
		this.lastCycle = arg8;
		this.peakPitch = arg9;
		this.arc = arg10;
		this.target2 = arg11;
		this.target = arg12;
		this.field12599 = arg6;
		this.offsetY = arg13;
		this.field12595 = arg14;
		this.mobile = false;
		this.field12594 = arg15;
		this.targeted = arg16;
		int var18 = ((EffectAnimType) Client.effectAnimTypeList.list(this.effectAnim)).anim;
		this.field12602 = new EntityAnimationNode(this, false);
		this.field12602.method14362(var18);
		this.createEntityBounds(1);
	}

	@ObfuscatedName("aue.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("aue.bw(S)Z")
	public boolean method16489() {
		return this.field12604;
	}

	@ObfuscatedName("aue.by(B)I")
	public int overlayHeight() {
		return this.overlayHeight;
	}

	@ObfuscatedName("aue.e(I)I")
	public int targeted() {
		return this.targeted;
	}

	@ObfuscatedName("aue.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit arg0) {
		return null;
	}

	@ObfuscatedName("aue.n(IIIII)V")
	public final void updateVelocity(int arg0, int arg1, int arg2, int arg3) {
		Vector3 var5 = Vector3.create(this.getTransform().trans);
		if (!this.mobile) {
			float var6 = (float) arg0 - var5.x;
			float var7 = (float) arg1 - var5.z;
			float var8 = (float) Math.sqrt((double) (var6 * var6 + var7 * var7));
			if (var8 != 0.0F) {
				var5.x += (float) this.arc * var6 / var8;
				var5.z += (float) this.arc * var7 / var8;
			}
			if (this.field12595) {
				var5.y = Client.getHeightmapY((int) var5.x, (int) var5.z, this.level) - this.field12599;
			}
			this.method10531(var5);
		}
		double var9 = (double) (this.lastCycle + 1 - arg3);
		this.velocityX = (double) ((float) arg0 - var5.x) / var9;
		this.velocityZ = (double) ((float) arg1 - var5.z) / var9;
		this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
		if (this.peakPitch == -1) {
			this.velocityY = (double) ((float) arg2 - var5.y) / var9;
		} else {
			if (!this.mobile) {
				this.velocityY = -this.velocity * Math.tan((double) this.peakPitch * 0.02454369D);
			}
			this.accelerationY = ((double) ((float) arg2 - var5.y) - this.velocityY * var9) * 2.0D / (var9 * var9);
		}
		var5.release();
	}

	@ObfuscatedName("aue.m(I)V")
	public void method19729() {
		if (this.mobile || this.target2 == 0) {
			return;
		}
		PathingEntity var1 = null;
		if (Client.sceneState == 0) {
			var1 = CutsceneManager.entities[this.target2 - 1].getEntity();
		} else if (this.target2 < 0) {
			int var2 = -this.target2 - 1;
			if (Client.currentPlayerUid == var2) {
				var1 = Client.localPlayerEntity;
			} else {
				var1 = Client.players[var2];
			}
		} else {
			int var3 = this.target2 - 1;
			ObjectNode var4 = (ObjectNode) Client.npcs.get((long) var3);
			if (var4 != null) {
				var1 = (PathingEntity) var4.value;
			}
		}
		if (var1 == null) {
			return;
		}
		Vector3 var5 = var1.getTransform().trans;
		this.setPosition(var5.x, (float) (Client.getHeightmapY((int) var5.x, (int) var5.z, this.level) - this.field12599), var5.z);
		if (this.field12594 < 0) {
			return;
		}
		BASType var6 = var1.getBASType();
		int var7 = 0;
		int var8 = 0;
		if (var6.field7357 != null && var6.field7357[this.field12594] != null) {
			var7 += var6.field7357[this.field12594][0];
			var8 += var6.field7357[this.field12594][2];
		}
		if (var6.field7347 != null && var6.field7347[this.field12594] != null) {
			var7 += var6.field7347[this.field12594][0];
			var8 += var6.field7347[this.field12594][2];
		}
		if (var7 == 0 && var8 == 0) {
			return;
		}
		int var9 = var1.field10395.method316();
		int var10 = var9;
		if (var1.field10442 != null && var1.field10442[this.field12594] != -1) {
			var10 = var1.field10442[this.field12594];
		}
		int var11 = var10 - var9 & 0x3FFF;
		int var12 = Trig1.sin[var11];
		int var13 = Trig1.cos[var11];
		int var14 = var7 * var13 + var8 * var12 >> 14;
		int var15 = var8 * var13 - var7 * var12 >> 14;
		Vector3 var17 = Vector3.create(this.getTransform().trans);
		var17.x += var14;
		var17.z += var15;
		this.method10531(var17);
		var17.release();
	}

	@ObfuscatedName("aue.k(II)V")
	public final void update(int arg0) {
		this.mobile = true;
		ScaleRotTrans var2 = new ScaleRotTrans(this.getTransform());
		var2.trans.x = (float) ((double) var2.trans.x + (double) arg0 * this.velocityX);
		var2.trans.z = (float) ((double) var2.trans.z + (double) arg0 * this.velocityZ);
		if (this.field12595) {
			var2.trans.y = Client.getHeightmapY((int) var2.trans.x, (int) var2.trans.z, this.level) - this.field12599;
		} else if (this.peakPitch == -1) {
			var2.trans.y = (float) ((double) var2.trans.y + (double) arg0 * this.velocityY);
		} else {
			var2.trans.y = (float) ((double) var2.trans.y + this.accelerationY * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.velocityY);
			this.velocityY += (double) arg0 * this.accelerationY;
		}
		var2.rot.setToRotation(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.velocityY, this.velocity));
		Quaternion var3 = Quaternion.create();
		var3.setToRotation(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.velocityX, this.velocityZ) - 3.1415927F);
		var2.rot.multiply(var3);
		var3.release();
		this.method10534(var2);
		if (this.field12602.method14367(1) && this.field12602.method14375()) {
			this.field12602.method14364();
		}
	}

	@ObfuscatedName("aue.f(Ldh;II)Ldo;")
	public Model getModel(Toolkit arg0, int arg1) {
		EffectAnimType var3 = (EffectAnimType) Client.effectAnimTypeList.list(this.effectAnim);
		return var3.getModel(arg0, arg1, this.field12602, (byte) 2);
	}

	@ObfuscatedName("aue.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit arg0) {
		Model var2 = this.getModel(arg0, 2048);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		this.method19743(arg0, var2, var3);
		PickableEntity var4 = PickableEntity.getPickableEntity(false);
		var2.draw(var3, this.entityBounds[0], 0);
		if (this.field12585 != null) {
			ParticleList var5 = this.field12585.method9965();
			arg0.drawParticles(var5);
		}
		this.field12604 = var2.method1731();
		var2.getRadius();
		this.overlayHeight = var2.getMinY();
		return var4;
	}

	@ObfuscatedName("aue.fw(Ldh;I)V")
	public void method17373(Toolkit arg0) {
		Model var2 = this.getModel(arg0, 0);
		if (var2 != null) {
			Matrix4x3 var3 = this.method10533();
			this.overlayHeight = var2.getMinY();
			var2.getRadius();
			this.method19743(arg0, var2, var3);
		}
	}

	@ObfuscatedName("aue.bv(I)V")
	public void method16529() {
		Vector3 var1 = this.getTransform().trans;
		this.minSceneTileX = this.maxSceneTileX = (short) (var1.x / 512.0F);
		this.minSceneTileZ = this.maxSceneTileZ = (short) (var1.z / 512.0F);
	}

	@ObfuscatedName("aue.w(Ldh;Ldo;Lou;B)V")
	public void method19743(Toolkit arg0, Model arg1, Matrix4x3 arg2) {
		arg1.method1689(arg2);
		ModelParticleEmitter[] var4 = arg1.method1750();
		ModelParticleEffector[] var5 = arg1.method1765();
		if ((this.field12585 == null || this.field12585.field7804) && (var4 != null || var5 != null)) {
			this.field12585 = ParticleSystem.method9962(Client.loopCycle, true);
		}
		if (this.field12585 != null) {
			this.field12585.method9936(arg0, (long) Client.loopCycle, var4, var5, false);
			this.field12585.method9963(this.level, this.minSceneTileX, this.maxSceneTileX, this.minSceneTileZ, this.maxSceneTileZ);
		}
	}

	@ObfuscatedName("aue.l(I)V")
	public void method19728() {
		if (this.field12585 != null) {
			this.field12585.method9932();
		}
	}

	@ObfuscatedName("aue.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit arg0, int arg1, int arg2) {
		return false;
	}

	@ObfuscatedName("aue.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aue.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aue.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}
}
