package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class283 implements Interface26 {

	@OriginalMember(owner = "client!gb", name = "lz", descriptor = "I")
	static int anInt3937;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gb", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_5;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	final int anInt3936;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!gw;")
	final Class302 aClass302_1;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V")
	static void method26875(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1, @OriginalArg(2) int arg2) {
		@Pc(48) Float local48;
		if (arg0 + Class223.aFloat259 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - Class223.aFloat259;
			local48 = 0.33333334F - Class223.aFloat259;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (-local11 + local29) * 0.5F;
		if (arg1 + Class223.aFloat259 > local36) {
			local48 = local36 - Class223.aFloat259;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < Class223.aFloat259 + local36) {
				local48 = Class223.aFloat259 + local36;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "ua", descriptor = "(Lclient!yp;I)V")
	static void method26876(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2028529231);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4127 * 233524551;
	}

	@OriginalMember(owner = "client!gb", name = "adw", descriptor = "(Lclient!yp;I)V")
	static void method26877(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass80_Sub32_4.method14434((String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], (byte) 106);
	}

	@OriginalMember(owner = "client!gb", name = "adj", descriptor = "(Lclient!yp;I)V")
	static void method26878(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass533ArrayArray1[local23][local13].anInt5070 * 101427383;
	}

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "(Lclient!zm;I)V")
	static void method26879(@OriginalArg(0) Class711 arg0, @OriginalArg(1) int arg1) {
		Class323.aClass711_1 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "ao", descriptor = "(II[I[I[F[FIIIIIII)V")
	static void method26880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(5) int local5 = arg6 + arg7 * arg0;
		@Pc(11) int local11 = arg8 + arg1 * arg9;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(24) int local24;
		@Pc(31) int local31;
		if (arg2 == null) {
			for (local24 = 0; local24 < arg11; local24++) {
				local31 = arg10 + local5;
				while (local5 < local31) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local24 = 0; local24 < arg11; local24++) {
				local31 = local5 + arg10;
				while (local5 < local31) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local24 = 0; local24 < arg11; local24++) {
				local31 = arg10 + local5;
				while (local5 < local31) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class283(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		this.aClass284_5 = arg0;
		this.anInt3936 = arg1.method23178((byte) -86) * 1073576003;
		this.aClass302_1 = new Class302(arg1, false, false, arg0.anInterface27_2);
	}

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27177(this.anInt3936 * 1440257131, this.aClass302_1, (byte) 37);
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27177(this.anInt3936 * 1440257131, this.aClass302_1, (byte) 10);
	}
}
