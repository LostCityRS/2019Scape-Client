package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!atv")
public final class Class108_Sub2_Sub1_Sub2 extends Class108_Sub2_Sub1 {

	@OriginalMember(owner = "client!atv", name = "g", descriptor = "I")
	int anInt3265;

	@OriginalMember(owner = "client!atv", name = "l", descriptor = "I")
	int anInt3266;

	@OriginalMember(owner = "client!atv", name = "i", descriptor = "Z")
	boolean aBoolean643;

	@OriginalMember(owner = "client!atv", name = "f", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas5;

	@OriginalMember(owner = "client!atv", name = "e", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL4;

	@OriginalMember(owner = "client!atv", name = "u", descriptor = "J")
	long aLong327;

	@OriginalMember(owner = "client!atv", name = "<init>", descriptor = "(Lclient!aqi;Ljava/awt/Canvas;J)V")
	Class108_Sub2_Sub1_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		super(arg0);
		this.aBoolean643 = false;
		this.aCanvas5 = arg1;
		this.anOpenGL4 = arg0.anOpenGL3;
		this.aLong327 = arg2;
		this.method24062();
	}

	@OriginalMember(owner = "client!atv", name = "<init>", descriptor = "(Lclient!aqi;Ljava/awt/Canvas;)V")
	Class108_Sub2_Sub1_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL3.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!atv", name = "q", descriptor = "()I")
	@Override
	public int method24053() {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong327);
		return 0;
	}

	@OriginalMember(owner = "client!atv", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt3266;
	}

	@OriginalMember(owner = "client!atv", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt3265;
	}

	@OriginalMember(owner = "client!atv", name = "y", descriptor = "(II)I")
	@Override
	public int method24058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atv", name = "w", descriptor = "()V")
	void method24062() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt3265 = local3.height;
		this.anInt3266 = local3.width;
	}

	@OriginalMember(owner = "client!atv", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		return true;
	}

	@OriginalMember(owner = "client!atv", name = "h", descriptor = "(II)I")
	@Override
	public int method24059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atv", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean643) {
			local11 = this.anOpenGL4.setSurface(this.aLong327);
			this.aBoolean643 = true;
		}
		return local11 && super.method24039();
	}

	@OriginalMember(owner = "client!atv", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
		if (this.aLong327 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong327);
			this.aLong327 = 0L;
		}
	}

	@OriginalMember(owner = "client!atv", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt3266;
	}

	@OriginalMember(owner = "client!atv", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt3266;
	}

	@OriginalMember(owner = "client!atv", name = "d", descriptor = "(II)V")
	@Override
	void method24052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong327);
		this.method24062();
		super.method24052(arg0, arg1);
	}

	@OriginalMember(owner = "client!atv", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt3265;
	}

	@OriginalMember(owner = "client!atv", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean643) {
			local11 = this.anOpenGL4.setSurface(this.aLong327);
			this.aBoolean643 = true;
		}
		return local11 && super.method24039();
	}

	@OriginalMember(owner = "client!atv", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean643) {
			local11 = this.anOpenGL4.setSurface(this.aLong327);
			this.aBoolean643 = true;
		}
		return local11 && super.method24039();
	}

	@OriginalMember(owner = "client!atv", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		return true;
	}

	@OriginalMember(owner = "client!atv", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		return true;
	}

	@OriginalMember(owner = "client!atv", name = "z", descriptor = "(II)V")
	@Override
	void method24055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong327);
		this.method24062();
		super.method24052(arg0, arg1);
	}

	@OriginalMember(owner = "client!atv", name = "p", descriptor = "()I")
	@Override
	public int method24056() {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong327);
		return 0;
	}

	@OriginalMember(owner = "client!atv", name = "v", descriptor = "()I")
	@Override
	public int method24057() {
		if (this.aLong327 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong327);
		return 0;
	}

	@OriginalMember(owner = "client!atv", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt3266;
	}

	@OriginalMember(owner = "client!atv", name = "n", descriptor = "(II)I")
	@Override
	public int method24054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atv", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
		if (this.aLong327 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong327);
			this.aLong327 = 0L;
		}
	}

	@OriginalMember(owner = "client!atv", name = "r", descriptor = "()V")
	void method24063() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt3265 = local3.height;
		this.anInt3266 = local3.width;
	}
}
