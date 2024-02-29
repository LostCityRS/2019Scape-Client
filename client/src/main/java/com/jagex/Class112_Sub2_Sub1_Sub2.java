package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atx")
public class Class112_Sub2_Sub1_Sub2 extends Class112_Sub2_Sub1 {

	@OriginalMember(owner = "client!atx", name = "k", descriptor = "J")
	long aLong227;

	@OriginalMember(owner = "client!atx", name = "f", descriptor = "I")
	int anInt3232;

	@OriginalMember(owner = "client!atx", name = "m", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL4;

	@OriginalMember(owner = "client!atx", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas6;

	@OriginalMember(owner = "client!atx", name = "w", descriptor = "I")
	int anInt3233;

	@OriginalMember(owner = "client!atx", name = "l", descriptor = "Z")
	boolean aBoolean534;

	@OriginalMember(owner = "client!atx", name = "<init>", descriptor = "(Lclient!aqv;Ljava/awt/Canvas;)V", line = 18)
	Class112_Sub2_Sub1_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL3.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!atx", name = "<init>", descriptor = "(Lclient!aqv;Ljava/awt/Canvas;J)V", line = 22)
	Class112_Sub2_Sub1_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		super(arg0);
		this.aBoolean534 = false;
		this.aCanvas6 = arg1;
		this.anOpenGL4 = arg0.anOpenGL3;
		this.aLong227 = arg2;
		this.method23762();
	}

	@OriginalMember(owner = "client!atx", name = "e", descriptor = "()I", line = 30)
	@Override
	public int method23737() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "l", descriptor = "()I", line = 30)
	@Override
	public int method23745() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method23746() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method23753() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "u", descriptor = "()I", line = 30)
	@Override
	public int method23744() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "d", descriptor = "()I", line = 30)
	@Override
	public int method23736() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "z", descriptor = "()I", line = 30)
	@Override
	public int method23742() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method23747() {
		return this.anInt3233;
	}

	@OriginalMember(owner = "client!atx", name = "r", descriptor = "()I", line = 34)
	@Override
	public int method23748() {
		return this.anInt3233;
	}

	@OriginalMember(owner = "client!atx", name = "n", descriptor = "()I", line = 34)
	@Override
	public int method23738() {
		return this.anInt3233;
	}

	@OriginalMember(owner = "client!atx", name = "i", descriptor = "(II)V", line = 38)
	@Override
	void method23758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong227);
		this.method23762();
		super.method23758(arg0, arg1);
	}

	@OriginalMember(owner = "client!atx", name = "j", descriptor = "(II)V", line = 38)
	@Override
	void method23757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong227);
		this.method23762();
		super.method23758(arg0, arg1);
	}

	@OriginalMember(owner = "client!atx", name = "t", descriptor = "(II)V", line = 38)
	@Override
	void method23759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong227);
		this.method23762();
		super.method23758(arg0, arg1);
	}

	@OriginalMember(owner = "client!atx", name = "x", descriptor = "()V", line = 45)
	void method23762() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "b", descriptor = "()V", line = 45)
	void method23763() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "h", descriptor = "()V", line = 45)
	void method23764() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "ah", descriptor = "()V", line = 45)
	void method23765() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "a", descriptor = "()I", line = 51)
	@Override
	public int method23756() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong227);
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "ae", descriptor = "()I", line = 51)
	@Override
	public int method23760() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong227);
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "g", descriptor = "(II)I", line = 57)
	@Override
	public int method23755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "ag", descriptor = "(II)I", line = 57)
	@Override
	public int method23761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "v", descriptor = "()Z", line = 61)
	@Override
	boolean method23749() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean534) {
			local11 = this.anOpenGL4.setSurface(this.aLong227);
			this.aBoolean534 = true;
		}
		return local11 && super.method23740();
	}

	@OriginalMember(owner = "client!atx", name = "k", descriptor = "()Z", line = 61)
	@Override
	boolean method23740() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean534) {
			local11 = this.anOpenGL4.setSurface(this.aLong227);
			this.aBoolean534 = true;
		}
		return local11 && super.method23740();
	}

	@OriginalMember(owner = "client!atx", name = "o", descriptor = "()Z", line = 61)
	@Override
	boolean method23743() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean534) {
			local11 = this.anOpenGL4.setSurface(this.aLong227);
			this.aBoolean534 = true;
		}
		return local11 && super.method23740();
	}

	@OriginalMember(owner = "client!atx", name = "s", descriptor = "()Z", line = 71)
	@Override
	boolean method23750() {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "f", descriptor = "()Z", line = 71)
	@Override
	boolean method23741() {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "m", descriptor = "()V", line = 75)
	@Override
	public void method23739() {
		if (this.aLong227 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas6, this.aLong227);
			this.aLong227 = 0L;
		}
	}

	@OriginalMember(owner = "client!atx", name = "y", descriptor = "()V", line = 75)
	@Override
	public void method23752() {
		if (this.aLong227 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas6, this.aLong227);
			this.aLong227 = 0L;
		}
	}

	@OriginalMember(owner = "client!atx", name = "q", descriptor = "()V", line = 75)
	@Override
	public void method23751() {
		if (this.aLong227 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas6, this.aLong227);
			this.aLong227 = 0L;
		}
	}
}
