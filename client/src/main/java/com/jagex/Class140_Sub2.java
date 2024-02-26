package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aip")
public final class Class140_Sub2 extends Class140 implements Interface40 {

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "I")
	final int anInt1315;

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "I")
	final int anInt1316;

	@OriginalMember(owner = "client!aip", name = "r", descriptor = "F")
	final float aFloat132;

	@OriginalMember(owner = "client!aip", name = "q", descriptor = "F")
	final float aFloat133;

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!aqi;IIZ[III)V")
	Class140_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Class210.aClass210_24, Class236.aClass236_21, arg1 * arg2, arg3);
		if (this.aClass102_Sub1_Sub1_9.aBoolean500) {
			this.anInt1315 = arg1;
			this.anInt1316 = arg2;
			this.aFloat132 = 1.0F;
			this.aFloat133 = 1.0F;
		} else {
			this.anInt1315 = Class700.method37081(arg1, (byte) 9);
			this.anInt1316 = Class700.method37081(arg2, (byte) 9);
			this.aFloat132 = (float) arg1 / (float) this.anInt1315;
			this.aFloat133 = (float) arg2 / (float) this.anInt1316;
			if (arg1 != this.anInt1315 || arg2 != this.anInt1316) {
				arg4 = this.aClass102_Sub1_Sub1_9.method20820(arg1, arg2, this.anInt1315, this.anInt1316, arg4, arg5, arg6, -1817725289);
				arg5 = 0;
				arg6 = this.anInt1315;
			}
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method11714(this.anInt1324, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt1324, 0, 6408, this.anInt1315, this.anInt1316, 0, 32993, this.aClass102_Sub1_Sub1_9.anInt2837, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!aqi;Lclient!co;IIZ[BII)V")
	Class140_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class236.aClass236_21, arg2 * arg3, arg4);
		if (this.aClass102_Sub1_Sub1_9.aBoolean500) {
			this.anInt1315 = arg2;
			this.anInt1316 = arg3;
			this.aFloat132 = 1.0F;
			this.aFloat133 = 1.0F;
		} else {
			this.anInt1315 = Class700.method37081(arg2, (byte) 9);
			this.anInt1316 = Class700.method37081(arg3, (byte) 9);
			this.aFloat132 = (float) arg2 / (float) this.anInt1315;
			this.aFloat133 = (float) arg3 / (float) this.anInt1316;
			if (arg2 != this.anInt1315 || arg3 != this.anInt1316) {
				arg5 = this.aClass102_Sub1_Sub1_9.method20794(arg2, arg3, this.anInt1315, this.anInt1316, arg5, arg6, arg7, arg1.anInt3600 * 499559879, (byte) -9);
				arg6 = 0;
				arg7 = this.anInt1315;
			}
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method11715(this.anInt1324, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			if (this.aClass210_14 == Class210.aClass210_18) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1324, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else if (this.aClass210_14 == Class210.aClass210_23) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1324, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
			} else {
				OpenGL.glTexImage2Dub(this.anInt1324, 0, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg2, arg3, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5121, arg5, arg6);
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!aqi;Lclient!co;IIZ[FII)V")
	Class140_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class236.aClass236_26, arg2 * arg3, arg4);
		if (this.aClass102_Sub1_Sub1_9.aBoolean500) {
			this.anInt1315 = arg2;
			this.anInt1316 = arg3;
			this.aFloat132 = 1.0F;
			this.aFloat133 = 1.0F;
		} else {
			this.anInt1315 = Class700.method37081(arg2, (byte) 9);
			this.anInt1316 = Class700.method37081(arg3, (byte) 9);
			this.aFloat132 = (float) arg2 / (float) this.anInt1315;
			this.aFloat133 = (float) arg3 / (float) this.anInt1316;
			if (arg2 != this.anInt1315 || arg3 != this.anInt1316) {
				arg5 = this.aClass102_Sub1_Sub1_9.method20793(arg2, arg3, this.anInt1315, this.anInt1316, arg5, arg6, arg7, arg1.anInt3600 * 499559879, 1539876680);
				arg6 = 0;
				arg7 = this.anInt1315;
			}
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method11716(this.anInt1324, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.anInt1324, 0, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg2, arg3, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!aqi;Lclient!co;Lclient!dy;II)V")
	Class140_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		if (this.aClass102_Sub1_Sub1_9.aBoolean500) {
			this.anInt1315 = arg3;
			this.anInt1316 = arg4;
			this.aFloat132 = 1.0F;
			this.aFloat133 = 1.0F;
		} else {
			this.anInt1315 = Class700.method37081(arg3, (byte) 9);
			this.anInt1316 = Class700.method37081(arg4, (byte) 9);
			this.aFloat132 = (float) arg3 / (float) this.anInt1315;
			this.aFloat133 = (float) arg4 / (float) this.anInt1316;
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glTexImage2Dub(this.anInt1324, 0, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg3, arg4, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), Class102_Sub1_Sub1.method20102(this.aClass236_15), null, 0);
	}

	@OriginalMember(owner = "client!aip", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aip", name = "u", descriptor = "(F)F")
	@Override
	public float method11653(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1315;
	}

	@OriginalMember(owner = "client!aip", name = "as", descriptor = "()F")
	@Override
	public float method11697() {
		return this.aFloat133;
	}

	@OriginalMember(owner = "client!aip", name = "t", descriptor = "()I")
	@Override
	public int method11688() {
		return this.anInt1315;
	}

	@OriginalMember(owner = "client!aip", name = "f", descriptor = "()I")
	@Override
	public int method11652() {
		return this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "ar", descriptor = "()I")
	@Override
	public int method11694() {
		return this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "l", descriptor = "(F)F")
	@Override
	public float method11667(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "bt", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11698(@OriginalArg(0) int arg0) {
		return new Class525(this, arg0);
	}

	@OriginalMember(owner = "client!aip", name = "ae", descriptor = "()I")
	@Override
	public int method11692() {
		return this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "ak", descriptor = "(IIII[I[II)V")
	@Override
	public void method11686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1315 * this.anInt1316] : arg5;
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glGetTexImagei(this.anInt1324, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1315, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aip", name = "i", descriptor = "(ZZ)V")
	@Override
	public void method11656(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glTexParameteri(this.anInt1324, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1324, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aip", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method11665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1324, 0, arg0, arg1, arg2, arg3, 32993, this.aClass102_Sub1_Sub1_9.anInt2837, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aip", name = "af", descriptor = "(IIII[I[II)V")
	@Override
	public void method11684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1315 * this.anInt1316] : arg5;
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glGetTexImagei(this.anInt1324, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1315, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aip", name = "s", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1324, 0, arg0, arg1, arg2, arg3, Class102_Sub1_Sub1.method20106(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "(IIII[I[II)V")
	@Override
	public void method11660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1315 * this.anInt1316] : arg5;
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glGetTexImagei(this.anInt1324, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1315, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "(IIIIII)V")
	@Override
	public void method11661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		@Pc(8) Class108 local8 = this.aClass102_Sub1_Sub1_9.method20677(1016478635);
		if (local8 != null) {
			@Pc(17) int local17 = local8.method24037() - (arg5 + arg3);
			@Pc(23) int local23 = Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15);
			OpenGL.glCopyTexImage2D(this.anInt1324, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aip", name = "at", descriptor = "(IIII[I[II)V")
	@Override
	public void method11683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1315 * this.anInt1316] : arg5;
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glGetTexImagei(this.anInt1324, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1315, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aip", name = "h", descriptor = "()Z")
	@Override
	public boolean method11713() {
		return super.method11713();
	}

	@OriginalMember(owner = "client!aip", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aip", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!aip", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aip", name = "by", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11701(@OriginalArg(0) int arg0) {
		return new Class525(this, arg0);
	}

	@OriginalMember(owner = "client!aip", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aip", name = "d", descriptor = "()I")
	@Override
	public int method11664() {
		return this.anInt1315;
	}

	@OriginalMember(owner = "client!aip", name = "p", descriptor = "(F)F")
	@Override
	public float method11682(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1315;
	}

	@OriginalMember(owner = "client!aip", name = "v", descriptor = "(F)F")
	@Override
	public float method11678(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "y", descriptor = "(F)F")
	@Override
	public float method11681(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "n", descriptor = "()Z")
	@Override
	public boolean method11670() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "c", descriptor = "()Z")
	@Override
	public boolean method11671() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "b", descriptor = "()Z")
	@Override
	public boolean method11672() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "ax", descriptor = "(ZZ)V")
	@Override
	public void method11693(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glTexParameteri(this.anInt1324, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1324, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aip", name = "ay", descriptor = "(ZZ)V")
	@Override
	public void method11658(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glTexParameteri(this.anInt1324, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1324, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aip", name = "ah", descriptor = "(IIII[II)V")
	@Override
	public void method11654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aip", name = "aq", descriptor = "(IIII[III)V")
	@Override
	public void method11651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1324, 0, arg0, arg1, arg2, arg3, 32993, this.aClass102_Sub1_Sub1_9.anInt2837, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aip", name = "ao", descriptor = "(IIII[III)V")
	@Override
	public void method11677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1324, 0, arg0, arg1, arg2, arg3, 32993, this.aClass102_Sub1_Sub1_9.anInt2837, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aip", name = "aj", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1324, 0, arg0, arg1, arg2, arg3, Class102_Sub1_Sub1.method20106(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aip", name = "ac", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1324, 0, arg0, arg1, arg2, arg3, Class102_Sub1_Sub1.method20106(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aip", name = "ag", descriptor = "(IIII[II)V")
	@Override
	public void method11689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aip", name = "ab", descriptor = "(IIII[II)V")
	@Override
	public void method11668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aip", name = "bj", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11700(@OriginalArg(0) int arg0) {
		return new Class525(this, arg0);
	}

	@OriginalMember(owner = "client!aip", name = "al", descriptor = "(IIII[II)V")
	@Override
	public void method11680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aip", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aip", name = "am", descriptor = "(IIII[I[II)V")
	@Override
	public void method11685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1315 * this.anInt1316] : arg5;
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glGetTexImagei(this.anInt1324, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1315, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aip", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!aip", name = "z", descriptor = "(F)F")
	@Override
	public float method11666(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1315;
	}

	@OriginalMember(owner = "client!aip", name = "ad", descriptor = "(IIIIII)V")
	@Override
	public void method11674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		@Pc(8) Class108 local8 = this.aClass102_Sub1_Sub1_9.method20677(1290661400);
		if (local8 != null) {
			@Pc(17) int local17 = local8.method24037() - (arg5 + arg3);
			@Pc(23) int local23 = Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15);
			OpenGL.glCopyTexImage2D(this.anInt1324, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aip", name = "av", descriptor = "()F")
	@Override
	public float method11690() {
		return this.aFloat132;
	}

	@OriginalMember(owner = "client!aip", name = "an", descriptor = "()Z")
	@Override
	public boolean method11724() {
		return super.method11713();
	}

	@OriginalMember(owner = "client!aip", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aip", name = "bs", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11699(@OriginalArg(0) int arg0) {
		return new Class525(this, arg0);
	}

	@OriginalMember(owner = "client!aip", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aip", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aip", name = "ai", descriptor = "(ZZ)V")
	@Override
	public void method11675(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glTexParameteri(this.anInt1324, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1324, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aip", name = "q", descriptor = "()F")
	@Override
	public float method11663() {
		return this.aFloat133;
	}

	@OriginalMember(owner = "client!aip", name = "r", descriptor = "()F")
	@Override
	public float method11662() {
		return this.aFloat132;
	}

	@OriginalMember(owner = "client!aip", name = "g", descriptor = "()Z")
	@Override
	public boolean method11655() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "aa", descriptor = "()Z")
	@Override
	public boolean method11725() {
		return super.method11713();
	}

	@OriginalMember(owner = "client!aip", name = "ap", descriptor = "()I")
	@Override
	public int method11676() {
		return this.anInt1316;
	}

	@OriginalMember(owner = "client!aip", name = "k", descriptor = "(IIII[II)V")
	@Override
	public void method11659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aip", name = "au", descriptor = "()F")
	@Override
	public float method11695() {
		return this.aFloat133;
	}

	@OriginalMember(owner = "client!aip", name = "az", descriptor = "()F")
	@Override
	public float method11696() {
		return this.aFloat133;
	}
}
