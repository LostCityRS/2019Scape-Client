package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abh")
public final class Class34 {

	@OriginalMember(owner = "client!abh", name = "pa", descriptor = "I")
	static int anInt107;

	@OriginalMember(owner = "client!abh", name = "t", descriptor = "Lclient!abh;")
	static final Class34 aClass34_4 = new Class34();

	@OriginalMember(owner = "client!abh", name = "f", descriptor = "Lclient!abh;")
	static final Class34 aClass34_2 = new Class34();

	@OriginalMember(owner = "client!abh", name = "e", descriptor = "Lclient!abh;")
	static final Class34 aClass34_1 = new Class34();

	@OriginalMember(owner = "client!abh", name = "u", descriptor = "Lclient!abh;")
	static final Class34 aClass34_3 = new Class34();

	@OriginalMember(owner = "client!abh", name = "t", descriptor = "(I)Z")
	static boolean method742(@OriginalArg(0) int arg0) {
		return -2038590069 * Class238.anInt3815 == -1 ? Class323.method27608(Class238.aString154, Class238.aString155, -1301076042) : Class383.method28577(-89532248);
	}

	@OriginalMember(owner = "client!abh", name = "y", descriptor = "(Lclient!arz;I)V")
	static void method743(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (Class630.aBoolean955) {
			return;
		}
		arg0.method24395((byte) 117);
		Class630.anInt5553 -= 862926799;
		if (!arg0.aBoolean589) {
			@Pc(17) long local17 = arg0.aLong249 * -6321316696381466459L;
			@Pc(22) Class80_Sub1_Sub4 local22;
			for (local22 = (Class80_Sub1_Sub4) Class630.aClass24_35.method560(local17); local22 != null && !local22.aString95.equals(arg0.aString105); local22 = (Class80_Sub1_Sub4) Class630.aClass24_35.method558((byte) 0)) {
			}
			if (local22 != null && local22.method21709(arg0, 427088622)) {
				Class162_Sub1.method15720(local22, -1916493423);
			}
			return;
		}
		for (@Pc(53) Class80_Sub1_Sub4 local53 = (Class80_Sub1_Sub4) Class630.aClass3_17.method50((byte) 34); local53 != null; local53 = (Class80_Sub1_Sub4) Class630.aClass3_17.method46((byte) -102)) {
			if (local53.aString95.equals(arg0.aString105)) {
				@Pc(64) boolean local64 = false;
				for (@Pc(70) Class80_Sub1_Sub11 local70 = (Class80_Sub1_Sub11) local53.aClass3_10.method50((byte) -26); local70 != null; local70 = (Class80_Sub1_Sub11) local53.aClass3_10.method46((byte) -102)) {
					if (arg0 == local70) {
						if (local53.method21709(arg0, -937303079)) {
							Class162_Sub1.method15720(local53, -1693247424);
						}
						local64 = true;
						break;
					}
				}
				if (local64) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abh", name = "kg", descriptor = "(Lclient!yp;I)V")
	static void method744(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2105164187);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class661.method33316(local16, local22, arg0, 1316601915);
	}

	@OriginalMember(owner = "client!abh", name = "<init>", descriptor = "()V")
	Class34() {
	}
}
