package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aen")
public final class Class80_Sub1_Sub3 extends Class80_Sub1 implements Interface16 {

	@OriginalMember(owner = "client!aen", name = "a", descriptor = "[I")
	static final int[] anIntArray41 = new int[1];

	@OriginalMember(owner = "client!aen", name = "u", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_17;

	@OriginalMember(owner = "client!aen", name = "g", descriptor = "I")
	final int anInt359;

	@OriginalMember(owner = "client!aen", name = "i", descriptor = "I")
	final int anInt358;

	@OriginalMember(owner = "client!aen", name = "o", descriptor = "Lclient!co;")
	final Class210 aClass210_6;

	@OriginalMember(owner = "client!aen", name = "m", descriptor = "Lclient!dy;")
	final Class236 aClass236_6;

	@OriginalMember(owner = "client!aen", name = "l", descriptor = "I")
	int anInt357;

	@OriginalMember(owner = "client!aen", name = "j", descriptor = "I")
	final int anInt360;

	@OriginalMember(owner = "client!aen", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;III)V")
	Class80_Sub1_Sub3(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass102_Sub3_17 = arg0;
		this.anInt359 = arg3;
		this.anInt358 = arg4;
		this.aClass210_6 = arg1;
		this.aClass236_6 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray41, 0);
		this.anInt357 = anIntArray41[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt357);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class102_Sub3.method6411(this.aClass210_6, this.aClass236_6), this.anInt359, this.anInt358);
		this.anInt360 = this.anInt359 * this.anInt358 * this.aClass210_6.anInt3600 * 499559879 * this.aClass236_6.anInt3804 * -369125885;
	}

	@OriginalMember(owner = "client!aen", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;II)V")
	Class80_Sub1_Sub3(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass102_Sub3_17 = arg0;
		this.anInt359 = arg3;
		this.anInt358 = arg4;
		this.aClass210_6 = arg1;
		this.aClass236_6 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray41, 0);
		this.anInt357 = anIntArray41[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt357);
		OpenGL.glRenderbufferStorageEXT(36161, Class102_Sub3.method6411(this.aClass210_6, this.aClass236_6), this.anInt359, this.anInt358);
		this.anInt360 = this.anInt359 * this.anInt358 * this.aClass210_6.anInt3600 * 499559879 * this.aClass236_6.anInt3804 * -369125885;
	}

	@OriginalMember(owner = "client!aen", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.anInt357 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt357 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.anInt359;
	}

	@OriginalMember(owner = "client!aen", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.anInt358;
	}

	@OriginalMember(owner = "client!aen", name = "a", descriptor = "(I)V")
	@Override
	public void method25856(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt357);
	}

	@OriginalMember(owner = "client!aen", name = "p", descriptor = "()V")
	void method2379() {
		if (this.anInt357 != 0) {
			this.aClass102_Sub3_17.method6408(this.anInt357, this.anInt360);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "x", descriptor = "()V")
	void method2380() {
		if (this.anInt357 != 0) {
			this.aClass102_Sub3_17.method6408(this.anInt357, this.anInt360);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method2380();
		super.finalize();
	}

	@OriginalMember(owner = "client!aen", name = "z", descriptor = "()V")
	void method2381() {
		if (this.anInt357 != 0) {
			this.aClass102_Sub3_17.method6408(this.anInt357, this.anInt360);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.anInt359;
	}

	@OriginalMember(owner = "client!aen", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.anInt359;
	}

	@OriginalMember(owner = "client!aen", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.anInt358;
	}

	@OriginalMember(owner = "client!aen", name = "hj", descriptor = "()V")
	void method2382() throws Throwable {
		this.method2380();
		super.finalize();
	}

	@OriginalMember(owner = "client!aen", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.anInt357 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt357 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "hy", descriptor = "()V")
	void method2383() throws Throwable {
		this.method2380();
		super.finalize();
	}

	@OriginalMember(owner = "client!aen", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.anInt357 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt357 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "ht", descriptor = "()V")
	void method2384() throws Throwable {
		this.method2380();
		super.finalize();
	}

	@OriginalMember(owner = "client!aen", name = "s", descriptor = "(I)V")
	@Override
	public void method25855(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt357);
	}

	@OriginalMember(owner = "client!aen", name = "v", descriptor = "()V")
	void method2385() {
		if (this.anInt357 != 0) {
			this.aClass102_Sub3_17.method6408(this.anInt357, this.anInt360);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.anInt359;
	}

	@OriginalMember(owner = "client!aen", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.anInt357 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt357 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt357 = 0;
		}
	}

	@OriginalMember(owner = "client!aen", name = "y", descriptor = "()V")
	void method2386() {
		if (this.anInt357 != 0) {
			this.aClass102_Sub3_17.method6408(this.anInt357, this.anInt360);
			this.anInt357 = 0;
		}
	}
}
