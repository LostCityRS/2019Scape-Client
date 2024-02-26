package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class525 implements Interface56 {

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
	final int anInt5061;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!aip;")
	final Class140_Sub2 aClass140_Sub2_1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!aip;I)V")
	Class525(@OriginalArg(0) Class140_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt5061 = arg1;
		this.aClass140_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.aClass140_Sub2_1.method11688();
	}

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.aClass140_Sub2_1.method11688();
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.aClass140_Sub2_1.method11652();
	}

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
	}

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.aClass140_Sub2_1.method11688();
	}

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.aClass140_Sub2_1.method11688();
	}

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.aClass140_Sub2_1.method11652();
	}

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "(I)V")
	@Override
	public void method30844(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass140_Sub2_1.anInt1324, this.aClass140_Sub2_1.anInt1327, this.anInt5061);
	}

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
	}

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "(I)V")
	@Override
	public void method30845(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass140_Sub2_1.anInt1324, this.aClass140_Sub2_1.anInt1327, this.anInt5061);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	@Override
	public void method30846(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass140_Sub2_1.anInt1324, this.aClass140_Sub2_1.anInt1327, this.anInt5061);
	}
}
