package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class288 {

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Ljava/lang/String;")
	String aString167;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
	static void method26911(@OriginalArg(0) int arg0) {
		Class630.aClass80_Sub1_Sub11_3 = new Class80_Sub1_Sub11(Class60.aClass60_91.method1180(Class512.aClass719_3, -1586185698), "", client.anInt3502 * -1621806571, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!gi", name = "iv", descriptor = "(Lclient!yp;B)V")
	static void method26912(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2063759827);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class643.method33029(local16, local22, arg0, (byte) -94);
	}

	@OriginalMember(owner = "client!gi", name = "agj", descriptor = "(Lclient!yp;B)V")
	static void method26913(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(26) int local26 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class53.method1089(local13, local26 == 1, -870433813);
	}

	@OriginalMember(owner = "client!gi", name = "apf", descriptor = "(Lclient!yp;B)V")
	static void method26914(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class2_Sub1.method1836(897499369);
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
	static void method26915(@OriginalArg(0) int arg0) {
		Class499.aClass411_3 = Class411.aClass411_2;
		Class499.aClass708_1 = Class708.aClass708_4;
		Class499.aClass707_1 = Class707.aClass707_13;
		Class323.aClass711_1 = Class711.aClass711_6;
		Class138.aClass710_3 = Class710.aClass710_6;
		Class499.aClass713_1 = Class713.aClass713_5;
		Class2_Sub1.aString13 = null;
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!ald;ZZ)V")
	Class288(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg1) {
			arg0.method23273((byte) 30);
		}
		if (arg2) {
			this.aString167 = arg0.method23189(-761473881);
		} else {
			this.aString167 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "(B)Ljava/lang/String;")
	public String method26908(@OriginalArg(0) byte arg0) {
		return this.aString167;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "()Ljava/lang/String;")
	public String method26909() {
		return this.aString167;
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "()Ljava/lang/String;")
	public String method26910() {
		return this.aString167;
	}
}
