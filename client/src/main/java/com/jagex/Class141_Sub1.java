package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aig")
public final class Class141_Sub1 extends Class141 implements Interface42 {

	@OriginalMember(owner = "client!aig", name = "v", descriptor = "I")
	final int anInt1245;

	@OriginalMember(owner = "client!aig", name = "o", descriptor = "I")
	final int anInt1246;

	@OriginalMember(owner = "client!aig", name = "s", descriptor = "F")
	final float aFloat129;

	@OriginalMember(owner = "client!aig", name = "y", descriptor = "F")
	final float aFloat130;

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;IIZ[BII)V")
	Class141_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class226.aClass226_22, arg2 * arg3, arg4);
		if (this.aClass104_Sub2_Sub2_8.aBoolean493) {
			this.anInt1245 = arg2;
			this.anInt1246 = arg3;
			this.aFloat129 = 1.0F;
			this.aFloat130 = 1.0F;
		} else {
			this.anInt1245 = Class134_Sub2.method10212(arg2, (byte) 28);
			this.anInt1246 = Class134_Sub2.method10212(arg3, (byte) 34);
			this.aFloat129 = (float) arg2 / (float) this.anInt1245;
			this.aFloat130 = (float) arg3 / (float) this.anInt1246;
			if (arg2 != this.anInt1245 || arg3 != this.anInt1246) {
				arg5 = this.aClass104_Sub2_Sub2_8.method20567(arg2, arg3, this.anInt1245, this.anInt1246, arg5, arg6, arg7, arg1.anInt3389 * -1639868421, 1561895950);
				arg6 = 0;
				arg7 = this.anInt1245;
			}
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method11424(this.anInt1373, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			if (this.aClass206_15 == Class206.aClass206_25) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1373, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else if (this.aClass206_15 == Class206.aClass206_26) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1373, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
			} else {
				OpenGL.glTexImage2Dub(this.anInt1373, 0, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg2, arg3, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), 5121, arg5, arg6);
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!aqv;IIZ[III)V")
	Class141_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Class206.aClass206_22, Class226.aClass226_22, arg1 * arg2, arg3);
		if (this.aClass104_Sub2_Sub2_8.aBoolean493) {
			this.anInt1245 = arg1;
			this.anInt1246 = arg2;
			this.aFloat129 = 1.0F;
			this.aFloat130 = 1.0F;
		} else {
			this.anInt1245 = Class134_Sub2.method10212(arg1, (byte) 16);
			this.anInt1246 = Class134_Sub2.method10212(arg2, (byte) 54);
			this.aFloat129 = (float) arg1 / (float) this.anInt1245;
			this.aFloat130 = (float) arg2 / (float) this.anInt1246;
			if (arg1 != this.anInt1245 || arg2 != this.anInt1246) {
				arg4 = this.aClass104_Sub2_Sub2_8.method20561(arg1, arg2, this.anInt1245, this.anInt1246, arg4, arg5, arg6, -527423535);
				arg5 = 0;
				arg6 = this.anInt1245;
			}
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method11428(this.anInt1373, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt1373, 0, 6408, this.anInt1245, this.anInt1246, 0, 32993, this.aClass104_Sub2_Sub2_8.anInt2963, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;IIZ[FII)V")
	Class141_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class226.aClass226_19, arg2 * arg3, arg4);
		if (this.aClass104_Sub2_Sub2_8.aBoolean493) {
			this.anInt1245 = arg2;
			this.anInt1246 = arg3;
			this.aFloat129 = 1.0F;
			this.aFloat130 = 1.0F;
		} else {
			this.anInt1245 = Class134_Sub2.method10212(arg2, (byte) 48);
			this.anInt1246 = Class134_Sub2.method10212(arg3, (byte) 57);
			this.aFloat129 = (float) arg2 / (float) this.anInt1245;
			this.aFloat130 = (float) arg3 / (float) this.anInt1246;
			if (arg2 != this.anInt1245 || arg3 != this.anInt1246) {
				arg5 = this.aClass104_Sub2_Sub2_8.method20541(arg2, arg3, this.anInt1245, this.anInt1246, arg5, arg6, arg7, arg1.anInt3389 * -1639868421, -154425365);
				arg6 = 0;
				arg7 = this.anInt1245;
			}
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method11425(this.anInt1373, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.anInt1373, 0, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg2, arg3, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;Lclient!dg;II)V")
	Class141_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		if (this.aClass104_Sub2_Sub2_8.aBoolean493) {
			this.anInt1245 = arg3;
			this.anInt1246 = arg4;
			this.aFloat129 = 1.0F;
			this.aFloat130 = 1.0F;
		} else {
			this.anInt1245 = Class134_Sub2.method10212(arg3, (byte) 82);
			this.anInt1246 = Class134_Sub2.method10212(arg4, (byte) 82);
			this.aFloat129 = (float) arg3 / (float) this.anInt1245;
			this.aFloat130 = (float) arg4 / (float) this.anInt1246;
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glTexImage2Dub(this.anInt1373, 0, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg3, arg4, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), Class104_Sub2_Sub2.method21320(this.aClass226_16), null, 0);
	}

	@OriginalMember(owner = "client!aig", name = "l", descriptor = "(ZZ)V")
	@Override
	public void method11344(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glTexParameteri(this.anInt1373, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1373, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aig", name = "ak", descriptor = "(I)Lclient!dp;")
	@Override
	public Interface18 method11381(@OriginalArg(0) int arg0) {
		return new Class530(this, arg0);
	}

	@OriginalMember(owner = "client!aig", name = "e", descriptor = "()I")
	@Override
	public int method11362() {
		return this.anInt1245;
	}

	@OriginalMember(owner = "client!aig", name = "n", descriptor = "()I")
	@Override
	public int method11340() {
		return this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "k", descriptor = "(F)F")
	@Override
	public float method11341(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1245;
	}

	@OriginalMember(owner = "client!aig", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aig", name = "v", descriptor = "()F")
	@Override
	public float method11378() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!aig", name = "aa", descriptor = "()V")
	@Override
	public void method11417() {
		super.method11412();
	}

	@OriginalMember(owner = "client!aig", name = "w", descriptor = "()Z")
	@Override
	public boolean method11376() {
		return true;
	}

	@OriginalMember(owner = "client!aig", name = "i", descriptor = "()Z")
	@Override
	public boolean method11346() {
		return true;
	}

	@OriginalMember(owner = "client!aig", name = "z", descriptor = "(IIII[III)V")
	@Override
	public void method11345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1373, 0, arg0, arg1, arg2, arg3, 32993, this.aClass104_Sub2_Sub2_8.anInt2963, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aig", name = "p", descriptor = "(IIII[BLclient!ck;II)V")
	@Override
	public void method11356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1373, 0, arg0, arg1, arg2, arg3, Class104_Sub2_Sub2.method21329(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aig", name = "ai", descriptor = "()F")
	@Override
	public float method11368() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!aig", name = "ar", descriptor = "()Z")
	@Override
	public boolean method11423() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aig", name = "at", descriptor = "()F")
	@Override
	public float method11371() {
		return this.aFloat130;
	}

	@OriginalMember(owner = "client!aig", name = "s", descriptor = "()Z")
	@Override
	public boolean method11422() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aig", name = "aj", descriptor = "()V")
	@Override
	public void method11412() {
		super.method11412();
	}

	@OriginalMember(owner = "client!aig", name = "ay", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aig", name = "f", descriptor = "(F)F")
	@Override
	public float method11342(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "ad", descriptor = "()F")
	@Override
	public float method11372() {
		return this.aFloat130;
	}

	@OriginalMember(owner = "client!aig", name = "a", descriptor = "(F)F")
	@Override
	public float method11358(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "q", descriptor = "(F)F")
	@Override
	public float method11354(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1245;
	}

	@OriginalMember(owner = "client!aig", name = "x", descriptor = "(F)F")
	@Override
	public float method11355(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1245;
	}

	@OriginalMember(owner = "client!aig", name = "b", descriptor = "(F)F")
	@Override
	public float method11350(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "h", descriptor = "(F)F")
	@Override
	public float method11357(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "d", descriptor = "(IIII[II)V")
	@Override
	public void method11347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11348(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aig", name = "g", descriptor = "(F)F")
	@Override
	public float method11339(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "aw", descriptor = "()F")
	@Override
	public float method11369() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!aig", name = "j", descriptor = "()Z")
	@Override
	public boolean method11361() {
		return true;
	}

	@OriginalMember(owner = "client!aig", name = "t", descriptor = "(IIII[III)V")
	@Override
	public void method11360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1373, 0, arg0, arg1, arg2, arg3, 32993, this.aClass104_Sub2_Sub2_8.anInt2963, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aig", name = "ae", descriptor = "(IIII[BLclient!ck;II)V")
	@Override
	public void method11343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1373, 0, arg0, arg1, arg2, arg3, Class104_Sub2_Sub2.method21329(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aig", name = "ag", descriptor = "(IIII[II)V")
	@Override
	public void method11364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11348(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aig", name = "ah", descriptor = "(IIII[I[II)V")
	@Override
	public void method11365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1245 * this.anInt1246] : arg5;
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glGetTexImagei(this.anInt1373, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1245, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aig", name = "al", descriptor = "(IIII[I[II)V")
	@Override
	public void method11366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1245 * this.anInt1246] : arg5;
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glGetTexImagei(this.anInt1373, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1245, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aig", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method11367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		@Pc(8) Class112 local8 = this.aClass104_Sub2_Sub2_8.method20446((byte) -36);
		if (local8 != null) {
			@Pc(17) int local17 = local8.method23749() - (arg5 + arg3);
			@Pc(23) int local23 = Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16);
			OpenGL.glCopyTexImage2D(this.anInt1373, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aig", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aig", name = "az", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aig", name = "as", descriptor = "()F")
	@Override
	public float method11370() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!aig", name = "y", descriptor = "()I")
	@Override
	public int method11353() {
		return this.anInt1245;
	}

	@OriginalMember(owner = "client!aig", name = "c", descriptor = "(IIII[I[II)V")
	@Override
	public void method11348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1245 * this.anInt1246] : arg5;
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glGetTexImagei(this.anInt1373, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1245, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aig", name = "am", descriptor = "()F")
	@Override
	public float method11373() {
		return this.aFloat130;
	}

	@OriginalMember(owner = "client!aig", name = "au", descriptor = "()Z")
	@Override
	public boolean method11430() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aig", name = "ao", descriptor = "(ZZ)V")
	@Override
	public void method11380(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glTexParameteri(this.anInt1373, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1373, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aig", name = "ap", descriptor = "()Z")
	@Override
	public boolean method11431() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aig", name = "ab", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aig", name = "o", descriptor = "()F")
	@Override
	public float method11351() {
		return this.aFloat130;
	}

	@OriginalMember(owner = "client!aig", name = "an", descriptor = "(I)Lclient!dp;")
	@Override
	public Interface18 method11382(@OriginalArg(0) int arg0) {
		return new Class530(this, arg0);
	}

	@OriginalMember(owner = "client!aig", name = "bf", descriptor = "(I)Lclient!dp;")
	@Override
	public Interface18 method11383(@OriginalArg(0) int arg0) {
		return new Class530(this, arg0);
	}

	@OriginalMember(owner = "client!aig", name = "aq", descriptor = "()I")
	@Override
	public int method11377() {
		return this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "ax", descriptor = "()I")
	@Override
	public int method11359() {
		return this.anInt1246;
	}

	@OriginalMember(owner = "client!aig", name = "av", descriptor = "(ZZ)V")
	@Override
	public void method11379(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		OpenGL.glTexParameteri(this.anInt1373, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1373, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aig", name = "r", descriptor = "(IIIIII)V")
	@Override
	public void method11363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub2_Sub2_8.method21032(this);
		@Pc(8) Class112 local8 = this.aClass104_Sub2_Sub2_8.method20446((byte) -34);
		if (local8 != null) {
			@Pc(17) int local17 = local8.method23749() - (arg5 + arg3);
			@Pc(23) int local23 = Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16);
			OpenGL.glCopyTexImage2D(this.anInt1373, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aig", name = "af", descriptor = "()V")
	@Override
	public void method11411() {
		super.method11412();
	}
}
