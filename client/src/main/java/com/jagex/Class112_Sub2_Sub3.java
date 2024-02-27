package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apt")
public final class Class112_Sub2_Sub3 extends Class112_Sub2 {

	@OriginalMember(owner = "client!apt", name = "f", descriptor = "I")
	int anInt2550;

	@OriginalMember(owner = "client!apt", name = "w", descriptor = "I")
	int anInt2551;

	@OriginalMember(owner = "client!apt", name = "l", descriptor = "Z")
	boolean aBoolean387;

	@OriginalMember(owner = "client!apt", name = "u", descriptor = "Z")
	boolean aBoolean388;

	@OriginalMember(owner = "client!apt", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_35;

	@OriginalMember(owner = "client!apt", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas4;

	@OriginalMember(owner = "client!apt", name = "m", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL2;

	@OriginalMember(owner = "client!apt", name = "k", descriptor = "J")
	final long aLong112;

	@OriginalMember(owner = "client!apt", name = "<init>", descriptor = "(Lclient!afa;Ljava/awt/Canvas;J)V")
	Class112_Sub2_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		this.aBoolean387 = false;
		this.aBoolean388 = false;
		this.aClass104_Sub1_35 = arg0;
		this.aCanvas4 = arg1;
		this.anOpenGL2 = arg0.anOpenGL1;
		this.aLong112 = arg2;
		this.method18166();
	}

	@OriginalMember(owner = "client!apt", name = "<init>", descriptor = "(Lclient!afa;Ljava/awt/Canvas;)V")
	Class112_Sub2_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL1.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!apt", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean388) {
			this.anOpenGL2.setSurface(this.aLong112);
			this.aBoolean388 = true;
		}
		this.aClass104_Sub1_35.method3910();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "t", descriptor = "(II)V")
	@Override
	void method23770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong112);
		this.method18166();
		if (this.aClass104_Sub1_35.method20446((byte) -110) == this) {
			this.aClass104_Sub1_35.method3784();
		}
	}

	@OriginalMember(owner = "client!apt", name = "i", descriptor = "(II)V")
	@Override
	void method23769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong112);
		this.method18166();
		if (this.aClass104_Sub1_35.method20446((byte) -5) == this) {
			this.aClass104_Sub1_35.method3784();
		}
	}

	@OriginalMember(owner = "client!apt", name = "x", descriptor = "()V")
	void method18166() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "a", descriptor = "()I")
	@Override
	public int method23767() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong112);
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "ah", descriptor = "()V")
	void method18167() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean388) {
			this.anOpenGL2.setSurface(this.aLong112);
			this.aBoolean388 = true;
		}
		this.aClass104_Sub1_35.method3910();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt2551;
	}

	@OriginalMember(owner = "client!apt", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt2551;
	}

	@OriginalMember(owner = "client!apt", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt2551;
	}

	@OriginalMember(owner = "client!apt", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas4, this.aLong112);
		this.aBoolean387 = true;
		this.aBoolean388 = false;
	}

	@OriginalMember(owner = "client!apt", name = "g", descriptor = "(II)I")
	@Override
	public int method23766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas4, this.aLong112);
		this.aBoolean387 = true;
		this.aBoolean388 = false;
	}

	@OriginalMember(owner = "client!apt", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas4, this.aLong112);
		this.aBoolean387 = true;
		this.aBoolean388 = false;
	}

	@OriginalMember(owner = "client!apt", name = "j", descriptor = "(II)V")
	@Override
	void method23768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong112);
		this.method18166();
		if (this.aClass104_Sub1_35.method20446((byte) -104) == this) {
			this.aClass104_Sub1_35.method3784();
		}
	}

	@OriginalMember(owner = "client!apt", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "ae", descriptor = "()I")
	@Override
	public int method23771() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong112);
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "ag", descriptor = "(II)I")
	@Override
	public int method23772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "b", descriptor = "()V")
	void method18168() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "h", descriptor = "()V")
	void method18169() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		if (this.aBoolean387) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean388) {
			this.anOpenGL2.setSurface(this.aLong112);
			this.aBoolean388 = true;
		}
		this.aClass104_Sub1_35.method3910();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "al", descriptor = "()V")
	void method18170() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}
}
