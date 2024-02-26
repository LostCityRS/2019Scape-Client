package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeq")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!aeq", name = "e", descriptor = "Lclient!apr;")
	Class84_Sub1_Sub1 aClass84_Sub1_Sub1_3;

	@OriginalMember(owner = "client!aeq", name = "u", descriptor = "I")
	int anInt381 = 0;

	@OriginalMember(owner = "client!aeq", name = "l", descriptor = "Z")
	boolean aBoolean70 = false;

	@OriginalMember(owner = "client!aeq", name = "g", descriptor = "I")
	int anInt385 = 0;

	@OriginalMember(owner = "client!aeq", name = "i", descriptor = "I")
	int anInt383 = 0;

	@OriginalMember(owner = "client!aeq", name = "m", descriptor = "I")
	int anInt384 = 0;

	@OriginalMember(owner = "client!aeq", name = "o", descriptor = "I")
	int anInt382 = 0;

	@OriginalMember(owner = "client!aeq", name = "f", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_19;

	@OriginalMember(owner = "client!aeq", name = "t", descriptor = "Lclient!apr;")
	final Class84_Sub1_Sub1 aClass84_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aeq", name = "<init>", descriptor = "(Lclient!afm;IIII)V")
	Class99_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass102_Sub3_19 = arg0;
		this.aClass84_Sub1_Sub1_2 = Class84_Sub1_Sub1.method18377(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "<init>", descriptor = "(Lclient!afm;IIZ)V")
	Class99_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass102_Sub3_19 = arg0;
		this.aClass84_Sub1_Sub1_2 = Class84_Sub1_Sub1.method18384(arg0, arg3 ? Class210.aClass210_24 : Class210.aClass210_25, Class236.aClass236_21, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "<init>", descriptor = "(Lclient!afm;II[III)V")
	Class99_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass102_Sub3_19 = arg0;
		this.aClass84_Sub1_Sub1_2 = Class84_Sub1_Sub1.method18375(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "ay", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18259(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean70) {
			local6 = this.method18214();
			local10 = this.method18288();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt385;
			@Pc(46) float local46 = local34 * (float) this.anInt385;
			@Pc(52) float local52 = local16 * (float) this.anInt383;
			@Pc(58) float local58 = local22 * (float) this.anInt383;
			@Pc(65) float local65 = -local16 * (float) this.anInt382;
			@Pc(72) float local72 = -local22 * (float) this.anInt382;
			@Pc(79) float local79 = -local28 * (float) this.anInt384;
			@Pc(86) float local86 = -local34 * (float) this.anInt384;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass84_Sub1_Sub1_2.method18340((arg9 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg8);
		this.aClass102_Sub3_19.method6543(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "cs", descriptor = "(I)V")
	void method2611(@OriginalArg(0) int arg0) {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6389(this.aClass102_Sub3_19.method6440(arg0), 7681);
		this.aClass102_Sub3_19.method6390(1, 34167, 768);
		this.aClass102_Sub3_19.method6391(0, 34168, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_3);
		this.aClass102_Sub3_19.method6389(34479, 7681);
		this.aClass102_Sub3_19.method6390(1, 34166, 768);
		if (this.anInt381 == 0) {
			this.aClass102_Sub3_19.method6393(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt381 == 1) {
			this.aClass102_Sub3_19.method6393(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt381 == 2) {
			this.aClass102_Sub3_19.method6393(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt381 == 3) {
			this.aClass102_Sub3_19.method6393(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "t", descriptor = "(IIII)V")
	@Override
	public void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt383 = arg0;
		this.anInt385 = arg1;
		this.anInt382 = arg2;
		this.anInt384 = arg3;
		this.aBoolean70 = this.anInt383 != 0 || this.anInt385 != 0 || this.anInt382 != 0 || this.anInt384 != 0;
	}

	@OriginalMember(owner = "client!aeq", name = "al", descriptor = "(III)V")
	@Override
	public void method18215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass84_Sub1_Sub1_3 = Class84_Sub1_Sub1.method18377(this.aClass102_Sub3_19, arg0, arg1, this.aClass84_Sub1_Sub1_2.anInt2599, this.aClass84_Sub1_Sub1_2.anInt2598);
		this.anInt381 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "e", descriptor = "()I")
	@Override
	public int method18218() {
		return this.aClass84_Sub1_Sub1_2.anInt2599;
	}

	@OriginalMember(owner = "client!aeq", name = "u", descriptor = "()I")
	@Override
	public int method18214() {
		return this.aClass84_Sub1_Sub1_2.anInt2599 + this.anInt383 + this.anInt382;
	}

	@OriginalMember(owner = "client!aeq", name = "l", descriptor = "()I")
	@Override
	public int method18219() {
		return this.aClass84_Sub1_Sub1_2.anInt2598;
	}

	@OriginalMember(owner = "client!aeq", name = "a", descriptor = "(III)V")
	@Override
	public void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass84_Sub1_Sub1_3 = Class84_Sub1_Sub1.method18377(this.aClass102_Sub3_19, arg0, arg1, this.aClass84_Sub1_Sub1_2.anInt2599, this.aClass84_Sub1_Sub1_2.anInt2598);
		this.anInt381 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "x", descriptor = "(IILclient!cg;II)V")
	@Override
	public void method18235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg2;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6543(1);
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(local5);
		this.aClass102_Sub3_19.method6389(7681, 8448);
		this.aClass102_Sub3_19.method6390(0, 34168, 768);
		this.aClass102_Sub3_19.method6370(1);
		@Pc(49) int local49 = arg0 + this.anInt383;
		@Pc(54) int local54 = arg1 + this.anInt385;
		@Pc(60) int local60 = local49 + this.aClass84_Sub1_Sub1_2.anInt2599;
		@Pc(66) int local66 = local54 + this.aClass84_Sub1_Sub1_2.anInt2598;
		@Pc(73) float local73 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(80) float local80 = local5.aFloat163 / (float) local5.anInt2598;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat163 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat163 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass84_Sub1_Sub1_2.anInt2599, local54 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass84_Sub1_Sub1_2.anInt2599, local54);
		OpenGL.glEnd();
		this.aClass102_Sub3_19.method6390(0, 5890, 768);
		this.aClass102_Sub3_19.method6543(0);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6386(0);
	}

	@OriginalMember(owner = "client!aeq", name = "j", descriptor = "(IIIIII)V")
	@Override
	public void method18223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2612(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aeq", name = "cy", descriptor = "(IIIIIIZ)V")
	void method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass102_Sub3_19.aBoolean140 || arg6) {
			this.aClass84_Sub1_Sub1_2.method18359(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass102_Sub3_19.method20691(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18221(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "m", descriptor = "(IIII[III)V")
	@Override
	public void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass84_Sub1_Sub1_2.method18357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aeq", name = "o", descriptor = "(IIII[I[III)V")
	@Override
	public void method18222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass84_Sub1_Sub1_2.method18352(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeq", name = "ch", descriptor = "(I)V")
	void method2613(@OriginalArg(0) int arg0) {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6389(this.aClass102_Sub3_19.method6440(arg0), 7681);
		this.aClass102_Sub3_19.method6390(1, 34167, 768);
		this.aClass102_Sub3_19.method6391(0, 34168, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_3);
		this.aClass102_Sub3_19.method6389(34479, 7681);
		this.aClass102_Sub3_19.method6390(1, 34166, 768);
		if (this.anInt381 == 0) {
			this.aClass102_Sub3_19.method6393(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt381 == 1) {
			this.aClass102_Sub3_19.method6393(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt381 == 2) {
			this.aClass102_Sub3_19.method6393(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt381 == 3) {
			this.aClass102_Sub3_19.method6393(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "af", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18250() {
		return this.aClass84_Sub1_Sub1_2.method18361(0);
	}

	@OriginalMember(owner = "client!aeq", name = "k", descriptor = "(IIIII)V")
	@Override
	public void method18226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt383;
		@Pc(35) int local35 = arg1 + this.anInt385;
		if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2613(arg2);
		this.aClass84_Sub1_Sub1_3.method18340(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
		OpenGL.glEnd();
		this.method2614();
	}

	@OriginalMember(owner = "client!aeq", name = "ar", descriptor = "([I)V")
	@Override
	public void method18260(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt383;
		arg0[1] = this.anInt385;
		arg0[2] = this.anInt382;
		arg0[3] = this.anInt384;
	}

	@OriginalMember(owner = "client!aeq", name = "cc", descriptor = "()V")
	void method2614() {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6389(8448, 8448);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
		this.aClass102_Sub3_19.method6391(0, 5890, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "d", descriptor = "(IIIIIII)V")
	@Override
	public void method18232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg6);
		this.aClass102_Sub3_19.method6543(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass84_Sub1_Sub1_2.aBoolean434 && !this.aBoolean70 && arg3 >= this.aClass84_Sub1_Sub1_2.anInt2598 && arg2 >= this.aClass84_Sub1_Sub1_2.anInt2599) {
			@Pc(71) float local71 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) arg3 / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(83) float local83 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) arg2 / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt383, (float) this.anInt385, 0.0F);
		@Pc(123) int local123 = this.method18214();
		@Pc(126) int local126 = this.method18288();
		@Pc(132) int local132 = arg1 + this.aClass84_Sub1_Sub1_2.anInt2598;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local147) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) (this.aClass84_Sub1_Sub1_2.anInt2598 - (local7 - local136)) / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(272) int local272 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local145) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "aq", descriptor = "(FFFFFFILclient!cg;II)V")
	@Override
	void method18279(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class98 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class84_Sub1_Sub1 local3 = ((Class98_Sub1) arg7).aClass84_Sub1_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean70) {
			local10 = this.method18214();
			local14 = this.method18288();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt385;
			@Pc(50) float local50 = local38 * (float) this.anInt385;
			@Pc(56) float local56 = local20 * (float) this.anInt383;
			@Pc(62) float local62 = local26 * (float) this.anInt383;
			@Pc(69) float local69 = -local20 * (float) this.anInt382;
			@Pc(76) float local76 = -local26 * (float) this.anInt382;
			@Pc(83) float local83 = -local32 * (float) this.anInt384;
			@Pc(90) float local90 = -local38 * (float) this.anInt384;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass84_Sub1_Sub1_2.method18340((arg6 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6543(1);
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(local3);
		this.aClass102_Sub3_19.method6389(7681, 8448);
		this.aClass102_Sub3_19.method6390(0, 34168, 768);
		this.aClass102_Sub3_19.method6370(1);
		local20 = local3.aFloat164 / (float) local3.anInt2599;
		local26 = local3.aFloat163 / (float) local3.anInt2598;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat163 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat163 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat163 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat163 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass102_Sub3_19.method6390(0, 5890, 768);
		this.aClass102_Sub3_19.method6543(0);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6386(0);
	}

	@OriginalMember(owner = "client!aeq", name = "an", descriptor = "(IIIIIIII)V")
	@Override
	void method18256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass84_Sub1_Sub1_2.method18340((arg7 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean70) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18214();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18288();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt383 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt385 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass84_Sub1_Sub1_2.anInt2599 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass84_Sub1_Sub1_2.anInt2598 * local48;
			if (this.aClass84_Sub1_Sub1_3 == null) {
				this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
				this.aClass102_Sub3_19.method6543(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2613(arg4);
				this.aClass84_Sub1_Sub1_3.method18340(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2614();
			}
		} else if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2613(arg4);
			this.aClass84_Sub1_Sub1_3.method18340(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2614();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ao", descriptor = "(IIII[I[III)V")
	@Override
	public void method18286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass84_Sub1_Sub1_2.method18352(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeq", name = "aj", descriptor = "(IIIIII)V")
	@Override
	public void method18233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2612(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aeq", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method18246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2612(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aeq", name = "av", descriptor = "(IIIIIIII)V")
	@Override
	void method18245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass84_Sub1_Sub1_2.method18340((arg7 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean70) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18214();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18288();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt383 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt385 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass84_Sub1_Sub1_2.anInt2599 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass84_Sub1_Sub1_2.anInt2598 * local48;
			if (this.aClass84_Sub1_Sub1_3 == null) {
				this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
				this.aClass102_Sub3_19.method6543(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2613(arg4);
				this.aClass84_Sub1_Sub1_3.method18340(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2614();
			}
		} else if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2613(arg4);
			this.aClass84_Sub1_Sub1_3.method18340(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2614();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ab", descriptor = "(III)V")
	@Override
	public void method18247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass84_Sub1_Sub1_3 = Class84_Sub1_Sub1.method18377(this.aClass102_Sub3_19, arg0, arg1, this.aClass84_Sub1_Sub1_2.anInt2599, this.aClass84_Sub1_Sub1_2.anInt2598);
		this.anInt381 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "by", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18273(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean70) {
			local6 = this.method18214();
			local10 = this.method18288();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt385;
			@Pc(46) float local46 = local34 * (float) this.anInt385;
			@Pc(52) float local52 = local16 * (float) this.anInt383;
			@Pc(58) float local58 = local22 * (float) this.anInt383;
			@Pc(65) float local65 = -local16 * (float) this.anInt382;
			@Pc(72) float local72 = -local22 * (float) this.anInt382;
			@Pc(79) float local79 = -local28 * (float) this.anInt384;
			@Pc(86) float local86 = -local34 * (float) this.anInt384;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass84_Sub1_Sub1_2.method18340((arg9 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg8);
		this.aClass102_Sub3_19.method6543(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "ah", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18249() {
		return this.aClass84_Sub1_Sub1_2.method18361(0);
	}

	@OriginalMember(owner = "client!aeq", name = "ag", descriptor = "(IIIIII)V")
	@Override
	public void method18248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2612(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aeq", name = "am", descriptor = "(IIIII)V")
	@Override
	public void method18251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt383;
		@Pc(35) int local35 = arg1 + this.anInt385;
		if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2613(arg2);
		this.aClass84_Sub1_Sub1_3.method18340(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
		OpenGL.glEnd();
		this.method2614();
	}

	@OriginalMember(owner = "client!aeq", name = "ak", descriptor = "(IIIII)V")
	@Override
	public void method18240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt383;
		@Pc(35) int local35 = arg1 + this.anInt385;
		if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2613(arg2);
		this.aClass84_Sub1_Sub1_3.method18340(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
		OpenGL.glEnd();
		this.method2614();
	}

	@OriginalMember(owner = "client!aeq", name = "ap", descriptor = "(IIII)V")
	@Override
	public void method18258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt383 = arg0;
		this.anInt385 = arg1;
		this.anInt382 = arg2;
		this.anInt384 = arg3;
		this.aBoolean70 = this.anInt383 != 0 || this.anInt385 != 0 || this.anInt382 != 0 || this.anInt384 != 0;
	}

	@OriginalMember(owner = "client!aeq", name = "ad", descriptor = "(IILclient!cg;II)V")
	@Override
	public void method18253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg2;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6543(1);
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(local5);
		this.aClass102_Sub3_19.method6389(7681, 8448);
		this.aClass102_Sub3_19.method6390(0, 34168, 768);
		this.aClass102_Sub3_19.method6370(1);
		@Pc(49) int local49 = arg0 + this.anInt383;
		@Pc(54) int local54 = arg1 + this.anInt385;
		@Pc(60) int local60 = local49 + this.aClass84_Sub1_Sub1_2.anInt2599;
		@Pc(66) int local66 = local54 + this.aClass84_Sub1_Sub1_2.anInt2598;
		@Pc(73) float local73 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(80) float local80 = local5.aFloat163 / (float) local5.anInt2598;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat163 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat163 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass84_Sub1_Sub1_2.anInt2599, local54 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass84_Sub1_Sub1_2.anInt2599, local54);
		OpenGL.glEnd();
		this.aClass102_Sub3_19.method6390(0, 5890, 768);
		this.aClass102_Sub3_19.method6543(0);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6386(0);
	}

	@OriginalMember(owner = "client!aeq", name = "g", descriptor = "()I")
	@Override
	public int method18288() {
		return this.aClass84_Sub1_Sub1_2.anInt2598 + this.anInt385 + this.anInt384;
	}

	@OriginalMember(owner = "client!aeq", name = "cr", descriptor = "()V")
	void method2615() {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6389(8448, 8448);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
		this.aClass102_Sub3_19.method6391(0, 5890, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "aa", descriptor = "(IIIIIIII)V")
	@Override
	void method18257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass84_Sub1_Sub1_2.method18340((arg7 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean70) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18214();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18288();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt383 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt385 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass84_Sub1_Sub1_2.anInt2599 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass84_Sub1_Sub1_2.anInt2598 * local48;
			if (this.aClass84_Sub1_Sub1_3 == null) {
				this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
				this.aClass102_Sub3_19.method6543(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2613(arg4);
				this.aClass84_Sub1_Sub1_3.method18340(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2614();
			}
		} else if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2613(arg4);
			this.aClass84_Sub1_Sub1_3.method18340(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2614();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ae", descriptor = "(IIII[III)V")
	@Override
	public void method18285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass84_Sub1_Sub1_2.method18357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aeq", name = "f", descriptor = "([I)V")
	@Override
	public void method18217(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt383;
		arg0[1] = this.anInt385;
		arg0[2] = this.anInt382;
		arg0[3] = this.anInt384;
	}

	@OriginalMember(owner = "client!aeq", name = "ck", descriptor = "()V")
	void method2616() {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6389(8448, 8448);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
		this.aClass102_Sub3_19.method6391(0, 5890, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "au", descriptor = "([I)V")
	@Override
	public void method18220(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt383;
		arg0[1] = this.anInt385;
		arg0[2] = this.anInt382;
		arg0[3] = this.anInt384;
	}

	@OriginalMember(owner = "client!aeq", name = "az", descriptor = "([I)V")
	@Override
	public void method18262(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt383;
		arg0[1] = this.anInt385;
		arg0[2] = this.anInt382;
		arg0[3] = this.anInt384;
	}

	@OriginalMember(owner = "client!aeq", name = "as", descriptor = "()I")
	@Override
	public int method18263() {
		return this.aClass84_Sub1_Sub1_2.anInt2599;
	}

	@OriginalMember(owner = "client!aeq", name = "aw", descriptor = "()I")
	@Override
	public int method18236() {
		return this.aClass84_Sub1_Sub1_2.anInt2598;
	}

	@OriginalMember(owner = "client!aeq", name = "bg", descriptor = "()I")
	@Override
	public int method18265() {
		return this.aClass84_Sub1_Sub1_2.anInt2598;
	}

	@OriginalMember(owner = "client!aeq", name = "bl", descriptor = "()I")
	@Override
	public int method18266() {
		return this.aClass84_Sub1_Sub1_2.anInt2598;
	}

	@OriginalMember(owner = "client!aeq", name = "br", descriptor = "()I")
	@Override
	public int method18213() {
		return this.aClass84_Sub1_Sub1_2.anInt2599 + this.anInt383 + this.anInt382;
	}

	@OriginalMember(owner = "client!aeq", name = "bn", descriptor = "()I")
	@Override
	public int method18268() {
		return this.aClass84_Sub1_Sub1_2.anInt2598 + this.anInt385 + this.anInt384;
	}

	@OriginalMember(owner = "client!aeq", name = "ba", descriptor = "(FFFFFFILclient!cg;II)V")
	@Override
	void method18269(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class98 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class84_Sub1_Sub1 local3 = ((Class98_Sub1) arg7).aClass84_Sub1_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean70) {
			local10 = this.method18214();
			local14 = this.method18288();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt385;
			@Pc(50) float local50 = local38 * (float) this.anInt385;
			@Pc(56) float local56 = local20 * (float) this.anInt383;
			@Pc(62) float local62 = local26 * (float) this.anInt383;
			@Pc(69) float local69 = -local20 * (float) this.anInt382;
			@Pc(76) float local76 = -local26 * (float) this.anInt382;
			@Pc(83) float local83 = -local32 * (float) this.anInt384;
			@Pc(90) float local90 = -local38 * (float) this.anInt384;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass84_Sub1_Sub1_2.method18340((arg6 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6543(1);
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(local3);
		this.aClass102_Sub3_19.method6389(7681, 8448);
		this.aClass102_Sub3_19.method6390(0, 34168, 768);
		this.aClass102_Sub3_19.method6370(1);
		local20 = local3.aFloat164 / (float) local3.anInt2599;
		local26 = local3.aFloat163 / (float) local3.anInt2598;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat163 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat163 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat163 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat163 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass102_Sub3_19.method6390(0, 5890, 768);
		this.aClass102_Sub3_19.method6543(0);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6386(0);
	}

	@OriginalMember(owner = "client!aeq", name = "cu", descriptor = "(IIIIIIZ)V")
	void method2617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass102_Sub3_19.aBoolean140 || arg6) {
			this.aClass84_Sub1_Sub1_2.method18359(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass102_Sub3_19.method20691(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18221(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ce", descriptor = "(IIIIIIZ)V")
	void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass102_Sub3_19.aBoolean140 || arg6) {
			this.aClass84_Sub1_Sub1_2.method18359(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass102_Sub3_19.method20691(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18221(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "i", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18231() {
		return this.aClass84_Sub1_Sub1_2.method18361(0);
	}

	@OriginalMember(owner = "client!aeq", name = "cj", descriptor = "(I)V")
	void method2619(@OriginalArg(0) int arg0) {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6389(this.aClass102_Sub3_19.method6440(arg0), 7681);
		this.aClass102_Sub3_19.method6390(1, 34167, 768);
		this.aClass102_Sub3_19.method6391(0, 34168, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_3);
		this.aClass102_Sub3_19.method6389(34479, 7681);
		this.aClass102_Sub3_19.method6390(1, 34166, 768);
		if (this.anInt381 == 0) {
			this.aClass102_Sub3_19.method6393(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt381 == 1) {
			this.aClass102_Sub3_19.method6393(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt381 == 2) {
			this.aClass102_Sub3_19.method6393(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt381 == 3) {
			this.aClass102_Sub3_19.method6393(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ca", descriptor = "()V")
	void method2620() {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6389(8448, 8448);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
		this.aClass102_Sub3_19.method6391(0, 5890, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "at", descriptor = "(IIIII)V")
	@Override
	public void method18278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt383;
		@Pc(35) int local35 = arg1 + this.anInt385;
		if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2613(arg2);
		this.aClass84_Sub1_Sub1_3.method18340(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35 + this.aClass84_Sub1_Sub1_2.anInt2598);
		OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass84_Sub1_Sub1_2.anInt2599, local35);
		OpenGL.glEnd();
		this.method2614();
	}

	@OriginalMember(owner = "client!aeq", name = "ci", descriptor = "()V")
	void method2621() {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6389(8448, 8448);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
		this.aClass102_Sub3_19.method6391(0, 5890, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "cm", descriptor = "()V")
	void method2622() {
		this.aClass102_Sub3_19.method6386(1);
		this.aClass102_Sub3_19.method6339(null);
		this.aClass102_Sub3_19.method6389(8448, 8448);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
		this.aClass102_Sub3_19.method6391(0, 5890, 770);
		this.aClass102_Sub3_19.method6386(0);
		this.aClass102_Sub3_19.method6390(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "bt", descriptor = "(IIIIIII)V")
	@Override
	public void method18270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg6);
		this.aClass102_Sub3_19.method6543(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass84_Sub1_Sub1_2.aBoolean434 && !this.aBoolean70 && arg3 >= this.aClass84_Sub1_Sub1_2.anInt2598 && arg2 >= this.aClass84_Sub1_Sub1_2.anInt2599) {
			@Pc(71) float local71 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) arg3 / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(83) float local83 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) arg2 / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt383, (float) this.anInt385, 0.0F);
		@Pc(123) int local123 = this.method18214();
		@Pc(126) int local126 = this.method18288();
		@Pc(132) int local132 = arg1 + this.aClass84_Sub1_Sub1_2.anInt2598;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local147) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) (this.aClass84_Sub1_Sub1_2.anInt2598 - (local7 - local136)) / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(272) int local272 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local145) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "bs", descriptor = "(IIIIIII)V")
	@Override
	public void method18261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg6);
		this.aClass102_Sub3_19.method6543(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass84_Sub1_Sub1_2.aBoolean434 && !this.aBoolean70 && arg3 >= this.aClass84_Sub1_Sub1_2.anInt2598 && arg2 >= this.aClass84_Sub1_Sub1_2.anInt2599) {
			@Pc(71) float local71 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) arg3 / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(83) float local83 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) arg2 / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt383, (float) this.anInt385, 0.0F);
		@Pc(123) int local123 = this.method18214();
		@Pc(126) int local126 = this.method18288();
		@Pc(132) int local132 = arg1 + this.aClass84_Sub1_Sub1_2.anInt2598;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local147) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) (this.aClass84_Sub1_Sub1_2.anInt2598 - (local7 - local136)) / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(272) int local272 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local145) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "bj", descriptor = "(IIIIIII)V")
	@Override
	public void method18272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass84_Sub1_Sub1_2.method18340(false);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg6);
		this.aClass102_Sub3_19.method6543(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass84_Sub1_Sub1_2.aBoolean434 && !this.aBoolean70 && arg3 >= this.aClass84_Sub1_Sub1_2.anInt2598 && arg2 >= this.aClass84_Sub1_Sub1_2.anInt2599) {
			@Pc(71) float local71 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) arg3 / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(83) float local83 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) arg2 / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt383, (float) this.anInt385, 0.0F);
		@Pc(123) int local123 = this.method18214();
		@Pc(126) int local126 = this.method18288();
		@Pc(132) int local132 = arg1 + this.aClass84_Sub1_Sub1_2.anInt2598;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local147) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass84_Sub1_Sub1_2.aFloat163 * (float) (this.aClass84_Sub1_Sub1_2.anInt2598 - (local7 - local136)) / (float) this.aClass84_Sub1_Sub1_2.anInt2598;
			@Pc(272) int local272 = arg0 + this.aClass84_Sub1_Sub1_2.anInt2599;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass84_Sub1_Sub1_2.aFloat164 * (float) (local3 - local145) / (float) this.aClass84_Sub1_Sub1_2.anInt2599;
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "q", descriptor = "(IIIIIIII)V")
	@Override
	void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass84_Sub1_Sub1_2.method18340((arg7 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6370(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean70) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18214();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18288();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt383 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt385 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass84_Sub1_Sub1_2.anInt2599 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass84_Sub1_Sub1_2.anInt2598 * local48;
			if (this.aClass84_Sub1_Sub1_3 == null) {
				this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
				this.aClass102_Sub3_19.method6543(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2613(arg4);
				this.aClass84_Sub1_Sub1_3.method18340(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2614();
			}
		} else if (this.aClass84_Sub1_Sub1_3 == null) {
			this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
			this.aClass102_Sub3_19.method6543(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2613(arg4);
			this.aClass84_Sub1_Sub1_3.method18340(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2614();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "bk", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18274(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean70) {
			local6 = this.method18214();
			local10 = this.method18288();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt385;
			@Pc(46) float local46 = local34 * (float) this.anInt385;
			@Pc(52) float local52 = local16 * (float) this.anInt383;
			@Pc(58) float local58 = local22 * (float) this.anInt383;
			@Pc(65) float local65 = -local16 * (float) this.anInt382;
			@Pc(72) float local72 = -local22 * (float) this.anInt382;
			@Pc(79) float local79 = -local28 * (float) this.anInt384;
			@Pc(86) float local86 = -local34 * (float) this.anInt384;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass84_Sub1_Sub1_2.method18340((arg9 & 0x1) != 0);
		this.aClass102_Sub3_19.method6407();
		this.aClass102_Sub3_19.method6339(this.aClass84_Sub1_Sub1_2);
		this.aClass102_Sub3_19.method6370(arg8);
		this.aClass102_Sub3_19.method6543(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass84_Sub1_Sub1_2.aFloat164, this.aClass84_Sub1_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}
}
