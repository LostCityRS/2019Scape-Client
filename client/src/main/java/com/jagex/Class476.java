package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public class Class476 implements Interface7 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_121;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Ljava/lang/String;")
	final String aString214;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!py;Ljava/lang/String;)V", line = 11)
	Class476(@OriginalArg(0) Class497 arg0, @OriginalArg(1) String arg1) {
		this.aClass497_121 = arg0;
		this.aString214 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)I", line = 17)
	@Override
	public int method30020(@OriginalArg(0) int arg0) {
		return this.aClass497_121.method30122(this.aString214, -2068711481) ? 100 : 0;
	}

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "()I", line = 17)
	@Override
	public int method30026() {
		return this.aClass497_121.method30122(this.aString214, -2068711481) ? 100 : 0;
	}

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "()I", line = 17)
	@Override
	public int method30023() {
		return this.aClass497_121.method30122(this.aString214, -2068711481) ? 100 : 0;
	}

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "(B)Lclient!acv;", line = 22)
	@Override
	public Class71 method30021(@OriginalArg(0) byte arg0) {
		return Class71.aClass71_3;
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "()Lclient!acv;", line = 22)
	@Override
	public Class71 method30024() {
		return Class71.aClass71_3;
	}

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "()Lclient!acv;", line = 22)
	@Override
	public Class71 method30025() {
		return Class71.aClass71_3;
	}

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "()Lclient!acv;", line = 22)
	@Override
	public Class71 method30022() {
		return Class71.aClass71_3;
	}

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "(II)Z", line = 60)
	public static boolean method29686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= Class615.aClass615_18.anInt5628 * 948246811 && arg0 <= Class615.aClass615_15.anInt5628 * 948246811;
	}

	@OriginalMember(owner = "client!pb", name = "gw", descriptor = "(Lclient!yf;B)V", line = 6190)
	static final void method29687(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class645.method32606(local11, local14, arg0, -461189691);
	}

	@OriginalMember(owner = "client!pb", name = "la", descriptor = "(Ljava/lang/String;B)Z", line = 11999)
	public static boolean method29688(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3573 * 1882800101; local5++) {
			@Pc(14) Class177 local14 = client.aClass177Array1[local5];
			if (arg0.equalsIgnoreCase(local14.aString125)) {
				return true;
			}
			if (arg0.equalsIgnoreCase(local14.aString123)) {
				return true;
			}
		}
		return false;
	}
}
