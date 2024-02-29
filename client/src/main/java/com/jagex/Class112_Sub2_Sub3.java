package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apt")
public class Class112_Sub2_Sub3 extends Class112_Sub2 {

	@OriginalMember(owner = "client!apt", name = "l", descriptor = "Z")
	boolean aBoolean386;

	@OriginalMember(owner = "client!apt", name = "m", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL2;

	@OriginalMember(owner = "client!apt", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_35;

	@OriginalMember(owner = "client!apt", name = "k", descriptor = "J")
	final long aLong112;

	@OriginalMember(owner = "client!apt", name = "f", descriptor = "I")
	int anInt2550;

	@OriginalMember(owner = "client!apt", name = "w", descriptor = "I")
	int anInt2551;

	@OriginalMember(owner = "client!apt", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas4;

	@OriginalMember(owner = "client!apt", name = "u", descriptor = "Z")
	boolean aBoolean387;

	@OriginalMember(owner = "client!apt", name = "<init>", descriptor = "(Lclient!afa;Ljava/awt/Canvas;)V", line = 18)
	Class112_Sub2_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL1.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!apt", name = "<init>", descriptor = "(Lclient!afa;Ljava/awt/Canvas;J)V", line = 21)
	Class112_Sub2_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		this.aBoolean386 = false;
		this.aBoolean387 = false;
		this.aClass104_Sub1_35 = arg0;
		this.aCanvas4 = arg1;
		this.anOpenGL2 = arg0.anOpenGL1;
		this.aLong112 = arg2;
		this.method18154();
	}

	@OriginalMember(owner = "client!apt", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method23753() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "l", descriptor = "()I", line = 30)
	@Override
	public int method23745() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "e", descriptor = "()I", line = 30)
	@Override
	public int method23737() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "z", descriptor = "()I", line = 30)
	@Override
	public int method23742() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "u", descriptor = "()I", line = 30)
	@Override
	public int method23744() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method23746() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "d", descriptor = "()I", line = 30)
	@Override
	public int method23736() {
		return this.anInt2550;
	}

	@OriginalMember(owner = "client!apt", name = "n", descriptor = "()I", line = 34)
	@Override
	public int method23738() {
		return this.anInt2551;
	}

	@OriginalMember(owner = "client!apt", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method23747() {
		return this.anInt2551;
	}

	@OriginalMember(owner = "client!apt", name = "r", descriptor = "()I", line = 34)
	@Override
	public int method23748() {
		return this.anInt2551;
	}

	@OriginalMember(owner = "client!apt", name = "t", descriptor = "(II)V", line = 38)
	@Override
	void method23759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong112);
		this.method18154();
		if (this.aClass104_Sub1_35.method20435((byte) -110) == this) {
			this.aClass104_Sub1_35.method3765();
		}
	}

	@OriginalMember(owner = "client!apt", name = "i", descriptor = "(II)V", line = 38)
	@Override
	void method23758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong112);
		this.method18154();
		if (this.aClass104_Sub1_35.method20435((byte) -5) == this) {
			this.aClass104_Sub1_35.method3765();
		}
	}

	@OriginalMember(owner = "client!apt", name = "j", descriptor = "(II)V", line = 38)
	@Override
	void method23757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong112);
		this.method18154();
		if (this.aClass104_Sub1_35.method20435((byte) -104) == this) {
			this.aClass104_Sub1_35.method3765();
		}
	}

	@OriginalMember(owner = "client!apt", name = "x", descriptor = "()V", line = 45)
	void method18154() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "ah", descriptor = "()V", line = 45)
	void method18155() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "b", descriptor = "()V", line = 45)
	void method18156() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "h", descriptor = "()V", line = 45)
	void method18157() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "al", descriptor = "()V", line = 45)
	void method18158() {
		@Pc(3) Dimension local3 = this.aCanvas4.getSize();
		this.anInt2551 = local3.height;
		this.anInt2550 = local3.width;
	}

	@OriginalMember(owner = "client!apt", name = "a", descriptor = "()I", line = 51)
	@Override
	public int method23756() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong112);
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "ae", descriptor = "()I", line = 51)
	@Override
	public int method23760() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong112);
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "g", descriptor = "(II)I", line = 57)
	@Override
	public int method23755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "ag", descriptor = "(II)I", line = 57)
	@Override
	public int method23761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apt", name = "k", descriptor = "()Z", line = 61)
	@Override
	boolean method23740() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean387) {
			this.anOpenGL2.setSurface(this.aLong112);
			this.aBoolean387 = true;
		}
		this.aClass104_Sub1_35.method3764();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "o", descriptor = "()Z", line = 61)
	@Override
	boolean method23743() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean387) {
			this.anOpenGL2.setSurface(this.aLong112);
			this.aBoolean387 = true;
		}
		this.aClass104_Sub1_35.method3764();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "v", descriptor = "()Z", line = 61)
	@Override
	boolean method23749() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean387) {
			this.anOpenGL2.setSurface(this.aLong112);
			this.aBoolean387 = true;
		}
		this.aClass104_Sub1_35.method3764();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "f", descriptor = "()Z", line = 71)
	@Override
	boolean method23741() {
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "s", descriptor = "()Z", line = 71)
	@Override
	boolean method23750() {
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "y", descriptor = "()V", line = 75)
	@Override
	public void method23752() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas4, this.aLong112);
		this.aBoolean386 = true;
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!apt", name = "m", descriptor = "()V", line = 75)
	@Override
	public void method23739() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas4, this.aLong112);
		this.aBoolean386 = true;
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!apt", name = "q", descriptor = "()V", line = 75)
	@Override
	public void method23751() {
		if (this.aBoolean386) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas4, this.aLong112);
		this.aBoolean386 = true;
		this.aBoolean387 = false;
	}
}
