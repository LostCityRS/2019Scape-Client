package com.jagex.graphics.camera;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.game.camera.*;
import com.jagex.game.camera.position.Position;
import com.jagex.game.camera.position.PositionEntity;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.game.world.entity.PositionPoint;
import com.jagex.math.*;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("je")
public abstract class Camera {

	@ObfuscatedName("je.e")
	public final CameraRelated field2848;

	@ObfuscatedName("je.n")
	public CameraControlMode controlMode;

	@ObfuscatedName("je.m")
	public CameraProjectionMode projectionMode;

	@ObfuscatedName("je.k")
	public LookatMode lookatMode;

	@ObfuscatedName("je.f")
	public Lookat lookat;

	@ObfuscatedName("je.w")
	public PositionMode positionMode;

	@ObfuscatedName("je.l")
	public Position position;

	@ObfuscatedName("je.u")
	public final CameraTrackableProvider field2874;

	@ObfuscatedName("je.z")
	public CameraLinearMovementMode linearMovementMode;

	@ObfuscatedName("je.p")
	public int field2851;

	@ObfuscatedName("je.d")
	public float positionAngularInterpolation;

	@ObfuscatedName("je.c")
	public final Vector3 lookatMaxSpeed = new Vector3();

	@ObfuscatedName("je.r")
	public final Vector3 positionMaxSpeed = new Vector3();

	@ObfuscatedName("je.o")
	public final Vector3 lookatAcceleration = new Vector3();

	@ObfuscatedName("je.s")
	public final Vector3 positionAcceleration = new Vector3();

	@ObfuscatedName("je.y")
	public final float field2858 = 5120.0F;

	@ObfuscatedName("je.q")
	public final float field2873 = 10.0F;

	@ObfuscatedName("je.x")
	public final float field2860 = 1.0F;

	@ObfuscatedName("je.b")
	public float field2861 = 5120.0F;

	@ObfuscatedName("je.h")
	public float field2869 = 10.0F;

	@ObfuscatedName("je.a")
	public float field2849 = 1.0F;

	@ObfuscatedName("je.g")
	public final Vector3 lookatSpring = new Vector3();

	@ObfuscatedName("je.i")
	public final Vector3 positionSpring = new Vector3();

	@ObfuscatedName("je.j")
	public float field2866;

	@ObfuscatedName("je.t")
	public float field2843;

	@ObfuscatedName("je.ae")
	public float field2855;

	@ObfuscatedName("je.ag")
	public float field2859;

	@ObfuscatedName("je.ac")
	public float field2872;

	@ObfuscatedName("je.ai")
	public float field2868;

	@ObfuscatedName("je.aw")
	public boolean field2862;

	@ObfuscatedName("je.as")
	public boolean field2875;

	@ObfuscatedName("je.at")
	public int field2876 = 0;

	@ObfuscatedName("je.ad")
	public float field2877 = 1.0F;

	@ObfuscatedName("je.am")
	public HashTable effects = new HashTable(8);

	public Camera(CameraRelated arg0, CameraTrackableProvider arg1) {
		this.field2848 = arg0;
		this.field2874 = arg1;
		this.method4680(true);
	}

	@ObfuscatedName("je.e(ZB)V")
	public void method4680(boolean arg0) {
		this.projectionMode = CameraProjectionMode.field2831;
		this.lookatMode = null;
		this.lookat = null;
		this.positionMode = null;
		this.position = null;
		if (CameraRelated.field2812 != this.field2848 && arg0) {
			this.controlMode = CameraControlMode.CLIENT;
		} else {
			this.controlMode = CameraControlMode.SERVER;
		}
		this.linearMovementMode = CameraLinearMovementMode.field2825;
		this.lookatMaxSpeed.setTo(100.0F, 100.0F, 100.0F);
		this.positionMaxSpeed.setTo(100.0F, 100.0F, 100.0F);
		this.positionAngularInterpolation = 0.05F;
		this.lookatAcceleration.setTo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.positionAcceleration.setTo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.lookatSpring.setTo(1.0F, 1.0F, 1.0F);
		this.positionSpring.setTo(1.0F, 1.0F, 1.0F);
		this.field2866 = 1.1F;
		this.field2843 = 1.1F;
		this.field2855 = 50.0F;
		this.field2859 = 10000.0F;
		this.field2868 = 1.5707964F;
		this.field2872 = 1.5707964F;
		this.field2851 = 5;
		this.field2862 = true;
		this.field2875 = true;
		this.field2876 = 0;
		this.field2877 = 1.0F;
		this.effects.removeAll();
	}

	@ObfuscatedName("je.n(F[[[ILqx;III)V")
	public void update(float arg0, int[][][] arg1, SceneLevelTileFlags arg2, int arg3, int arg4) {
		if (this.lookat != null) {
			this.lookat.method14131(arg0);
		}
		if (this.position != null) {
			this.position.method5238(arg0, arg1, arg2, arg3, arg4);
		}
		Iterator var6 = this.effects.iterator();
		while (var6.hasNext()) {
			CameraEffect var7 = (CameraEffect) var6.next();
			var7.method19431(arg0);
		}
	}

	@ObfuscatedName("je.m(ZFLox;Lov;Lox;Lox;B)V")
	public void method4807(boolean arg0, float arg1, Vector3 arg2, Quaternion arg3, Vector3 arg4, Vector3 arg5) {
		if (CameraLinearMovementMode.field2824 == this.linearMovementMode) {
			CameraMode1.method5205(arg1, arg2, arg4, arg5, arg0 ? this.positionAcceleration : this.lookatAcceleration, arg0 ? this.positionMaxSpeed : this.lookatMaxSpeed, (float) this.field2876, this.field2877, this.field2861, this.field2869);
		} else if (CameraLinearMovementMode.field2825 == this.linearMovementMode) {
			CameraMode2.method8144(arg1, arg2, arg3, arg4, arg5, arg0 ? this.positionAcceleration : this.lookatAcceleration, arg0 ? this.positionMaxSpeed : this.lookatMaxSpeed, (float) this.field2876, this.field2877, this.field2861, this.field2869);
		} else if (CameraLinearMovementMode.field2823 == this.linearMovementMode) {
			CameraMode3.method14933(arg1, arg2, arg3, arg4, arg5, arg0 ? this.positionSpring : this.lookatSpring, arg0 ? this.field2843 : this.field2866, this.field2861, this.field2849);
		}
	}

	@ObfuscatedName("je.k(Ljd;B)V")
	public void setControlMode(CameraControlMode controlMode) {
		this.controlMode = controlMode;
	}

	@ObfuscatedName("je.f(Lii;ZI)Laax;")
	public Lookat setLookatMode(LookatMode arg0, boolean arg1) throws CameraException {
		if (CameraControlMode.SERVER == this.controlMode && !arg1) {
			throw new CameraException();
		}
		this.lookatMode = arg0;
		if (LookatMode.ENTITY == arg0) {
			this.lookat = new LookatEntity(this);
		} else if (LookatMode.ORIENTATION == arg0) {
			this.lookat = new LookatOrientation(this);
		} else if (LookatMode.POINT == arg0) {
			this.lookat = new LookatPoint(this);
		} else if (LookatMode.field2789 == arg0) {
			this.lookat = new LookatSpline_Sub1(this);
		} else if (LookatMode.field2795 == arg0) {
			this.lookat = new LookatSpline_Sub4(this);
		} else if (LookatMode.field2792 == arg0) {
			this.lookat = new Lookat_Sub2(this);
		} else if (LookatMode.field2787 == arg0) {
			this.lookat = new LookatSpline_Sub2(this);
		}
		return this.lookat;
	}

	@ObfuscatedName("je.w(Lim;ZI)Lkl;")
	public Position setPositionMode(PositionMode arg0, boolean arg1) throws CameraException {
		if (CameraControlMode.SERVER == this.controlMode && !arg1) {
			throw new CameraException();
		}
		this.positionMode = arg0;
		if (PositionMode.ENTITY == arg0) {
			this.position = new PositionEntity(this);
		} else if (PositionMode.POINT == arg0) {
			this.position = new PositionPoint(this);
		} else if (PositionMode.field2819 == arg0) {
			this.position = new PositionSpline_Sub1(this);
		} else if (PositionMode.field2817 == arg0) {
			this.position = new PositionSpline_Sub3(this);
		} else if (PositionMode.field2818 == arg0) {
			this.position = new PositionSpline_Sub2(this);
		}
		return this.position;
	}

	@ObfuscatedName("je.l(I)Z")
	public boolean method4686() {
		if (CameraRelated.field2812 == this.field2848 && CameraControlMode.SERVER == this.controlMode) {
			return true;
		} else {
			return CameraRelated.field2813 == this.field2848 && CameraControlMode.CLIENT == this.controlMode;
		}
	}

	@ObfuscatedName("je.u(FB)V")
	public void setLookatAngularInterpolation(float arg0) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
	}

	@ObfuscatedName("je.z(FI)V")
	public void setPositionAngularInterpolation(float arg0) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		this.positionAngularInterpolation = arg0;
	}

	@ObfuscatedName("je.p(Lic;I)V")
	public void setLinearMovementMode(CameraLinearMovementMode arg0) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		this.linearMovementMode = arg0;
	}

	@ObfuscatedName("je.d(Lox;I)V")
	public void setLookatAcceleration(Vector3 arg0) throws CameraException {
		if (!this.method4686() || !this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.lookatAcceleration.setTo(arg0);
	}

	@ObfuscatedName("je.c(Lox;I)V")
	public void setPositionAcceleration(Vector3 arg0) throws CameraException {
		if (!this.method4686() || !this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.positionAcceleration.setTo(arg0);
	}

	@ObfuscatedName("je.r(FFFB)V")
	public void setSnapDistances(float arg0, float arg1, float arg2) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		this.field2861 = arg0;
		this.field2869 = arg1;
		this.field2849 = arg2;
	}

	@ObfuscatedName("je.v(I)V")
	public void resetSnapDistances() throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		this.field2861 = 5120.0F;
		this.field2869 = 10.0F;
		this.field2849 = 1.0F;
	}

	@ObfuscatedName("je.o(Lox;I)V")
	public void setLookatMaxSpeed(Vector3 arg0) throws CameraException {
		if (!this.method4686() || !this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.lookatMaxSpeed.setTo(arg0);
	}

	@ObfuscatedName("je.s(Lox;I)V")
	public void setPositionMaxSpeed(Vector3 arg0) throws CameraException {
		if (!this.method4686() || !this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.positionMaxSpeed.setTo(arg0);
	}

	@ObfuscatedName("je.y(Lox;FI)V")
	public void setSpringProperties(Vector3 arg0, float arg1) throws CameraException {
		if (!this.method4686() || this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.lookatSpring.setTo(arg0);
		this.positionSpring.setTo(arg0);
		this.field2866 = arg1;
		this.field2843 = arg1;
	}

	@ObfuscatedName("je.q(Lox;FI)V")
	public void setLookatSpringProperties(Vector3 arg0, float arg1) throws CameraException {
		if (!this.method4686() || this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.lookatSpring.setTo(arg0);
		this.field2866 = arg1;
	}

	@ObfuscatedName("je.x(Lox;FB)V")
	public void setPositionSpringProperties(Vector3 arg0, float arg1) throws CameraException {
		if (!this.method4686() || this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.positionSpring.setTo(arg0);
		this.field2843 = arg1;
	}

	@ObfuscatedName("je.b(FFB)V")
	public void setDepthPlanes(float arg0, float arg1) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new CameraException();
		}
		this.field2855 = arg0;
		this.field2859 = arg1;
	}

	@ObfuscatedName("je.h(FFI)V")
	public void setFieldOfView(float arg0, float arg1) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		this.field2872 = arg0;
		this.field2868 = arg1;
	}

	@ObfuscatedName("je.a(ZZI)V")
	public void setCollisionMode(boolean arg0, boolean arg1) throws CameraException {
		if (!this.method4686()) {
			throw new CameraException();
		}
		this.field2862 = arg0;
		this.field2875 = arg1;
	}

	@ObfuscatedName("je.g(IFI)V")
	public void setTrailDistance(int arg0, float arg1) throws CameraException {
		if (!this.method4686() || !this.linearMovementMode.field2821) {
			throw new CameraException();
		}
		this.field2876 = arg0;
		this.field2877 = arg1;
	}

	@ObfuscatedName("je.i(Laso;I)V")
	public void addEffect(CameraEffect arg0) {
		this.effects.put(arg0, (long) arg0.id);
	}

	@ObfuscatedName("je.j(II)V")
	public void removeEffect(int arg0) {
		CameraEffect var2 = (CameraEffect) this.effects.get((long) arg0);
		if (var2 != null) {
			var2.unlink();
		}
	}

	@ObfuscatedName("je.t(II)Laso;")
	public CameraEffect getEffect(int arg0) {
		return (CameraEffect) this.effects.get((long) arg0);
	}

	@ObfuscatedName("je.ae(B)V")
	public void removeAllEffects() {
		this.effects.removeAll();
	}

	@ObfuscatedName("je.ag(B)Z")
	public boolean method4744() {
		if (this.lookat == null || this.position == null) {
			return false;
		} else if (this.lookat.method14145()) {
			return this.position.method5218();
		} else {
			return false;
		}
	}

	@ObfuscatedName("je.ah(Lju;Lou;Lpq;IIB)V")
	public void method4707(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2, int arg3, int arg4) {
		if (!this.method4744()) {
			return;
		}
		this.lookat.method14136(arg0, arg1, arg3, arg4, this.position.method5222());
		this.position.method5223(arg0, arg3, arg4);
		if (CameraProjectionMode.field2831 == this.projectionMode) {
			arg2.setToPerspectiveProjection(this.field2855, this.field2859, this.field2872, this.field2868);
		} else {
			arg2.method6601(this.field2855, this.field2859, (float) this.field2851);
		}
		Iterator var6 = this.effects.iterator();
		while (var6.hasNext()) {
			CameraEffect var7 = (CameraEffect) var6.next();
			var7.method19440(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("je.al(I)Ljd;")
	public CameraControlMode getControlMode() {
		return this.controlMode;
	}

	@ObfuscatedName("je.ac(B)Lkl;")
	public Position getPosition() {
		return this.position;
	}

	@ObfuscatedName("je.ai(I)Laax;")
	public Lookat getLookat() {
		return this.lookat;
	}

	@ObfuscatedName("je.aw(I)Ljy;")
	public CameraTrackableProvider method4697() {
		return this.field2874;
	}

	@ObfuscatedName("je.as(B)Lii;")
	public LookatMode getLookatMode() {
		return this.lookatMode;
	}

	@ObfuscatedName("je.at(I)Lim;")
	public PositionMode getPositionMode() {
		return this.positionMode;
	}

	@ObfuscatedName("je.ad(I)Lox;")
	public Vector3 method4714() {
		return this.position != null && this.position.method5218() ? this.position.method5219() : null;
	}

	@ObfuscatedName("je.am(I)[D")
	public double[] method4715() {
		return this.position != null && this.position.method5218() ? this.position.method5230() : null;
	}

	@ObfuscatedName("je.au(I)Lox;")
	public Vector3 method4711() {
		return this.lookat != null && this.lookat.method14145() ? this.lookat.method14133() : null;
	}

	@ObfuscatedName("je.ar(I)Lakt;")
	public CoordFine method4717() {
		return this.position != null && this.position.method5218() ? this.position.method5221() : null;
	}

	@ObfuscatedName("je.ap(B)F")
	public float method4718() {
		Vector3 var1 = this.method4714();
		Vector3 var2 = this.method4711();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			Vector3 var4 = Vector3.sub(var2, var1);
			float var5 = (float) Math.sqrt((double) (var4.z * var4.z + var4.x * var4.x));
			var3 = (float) Math.atan2((double) -var4.y, (double) var5);
			var1.release();
			var2.release();
		}
		return var3;
	}

	@ObfuscatedName("je.aq(B)F")
	public float method4719() {
		Vector3 var1 = this.method4714();
		Vector3 var2 = this.method4711();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			Vector3 var4 = Vector3.sub(var1, var2);
			var4.y = 0.0F;
			var3 = (float) Math.atan2((double) var4.x, (double) var4.z);
			var1.release();
			var2.release();
		}
		return (float) (3.141592653589793D - (double) var3);
	}

	@ObfuscatedName("je.ax(I)F")
	public float method4720() {
		return 0.0F;
	}

	@ObfuscatedName("je.av(I)Lov;")
	public Quaternion method4721() {
		Quaternion var1 = Quaternion.create();
		var1.setToRotation(this.method4719(), this.method4718(), this.method4720());
		return var1;
	}

	@ObfuscatedName("je.ao(B)Lox;")
	public Vector3 getLookatAcceleration() {
		return this.lookatAcceleration;
	}

	@ObfuscatedName("je.aj(I)Lox;")
	public Vector3 getPositionAcceleration() {
		return this.positionAcceleration;
	}

	@ObfuscatedName("je.ay(S)F")
	public float getPositionAngularInterpolation() {
		return this.positionAngularInterpolation;
	}

	@ObfuscatedName("je.ab(B)Lox;")
	public Vector3 getLookatMaxSpeed() {
		return this.lookatMaxSpeed;
	}

	@ObfuscatedName("je.az(B)Lox;")
	public Vector3 getPositionMaxSpeed() {
		return this.positionMaxSpeed;
	}

	@ObfuscatedName("je.aa(I)F")
	public float method4727() {
		return this.field2855;
	}

	@ObfuscatedName("je.af(I)F")
	public float method4785() {
		return this.field2859;
	}

	@ObfuscatedName("je.ak(I)F")
	public float method4784() {
		return this.field2872;
	}

	@ObfuscatedName("je.an(I)Z")
	public boolean method4730() {
		return this.field2862;
	}

	@ObfuscatedName("je.bf(I)Z")
	public boolean method4731() {
		return this.field2875;
	}
}
