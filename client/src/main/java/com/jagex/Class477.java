package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class477 {

	@OriginalMember(owner = "client!pc", name = "fg", descriptor = "Lclient!pf;")
	public static Class480 aClass480_2;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!pj;")
	final Class484 aClass484_1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	final int anInt5289;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	final int anInt5288;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "(IIIB)I")
	public static int method29883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "aew", descriptor = "(Lclient!yf;I)V")
	static void method29884(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 / local23;
	}

	@OriginalMember(owner = "client!pc", name = "apd", descriptor = "(Lclient!yf;B)V")
	static void method29885(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class153_Sub1.method14115(local13, -1850871808);
	}

	@OriginalMember(owner = "client!pc", name = "bap", descriptor = "(Lclient!yf;B)V")
	static void method29886(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16555(local12, -122175387);
	}

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "(Lclient!arm;I)[I")
	static int[] method29887(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int[] local1 = null;
		if (Class664.method33064(arg0.anInt3012 * -92627949, 1527912881)) {
			local1 = ((Class47) Class277.aClass32_Sub12_1.method18273((int) (arg0.aLong154 * 3050087486000948885L), -1836489641)).anIntArray11;
		} else if (arg0.anInt3010 * 1303344433 != -1) {
			local1 = ((Class47) Class277.aClass32_Sub12_1.method18273(arg0.anInt3010 * 1303344433, -43288383)).anIntArray11;
		} else if (Class110_Sub6.method7672(arg0.anInt3012 * -92627949, (byte) -1)) {
			@Pc(54) Class93_Sub15 local54 = (Class93_Sub15) client.aClass16_18.method215((long) (arg0.aLong154 * 3050087486000948885L));
			if (local54 != null) {
				@Pc(61) Class132_Sub1_Sub1_Sub1_Sub1 local61 = (Class132_Sub1_Sub1_Sub1_Sub1) local54.anObject5;
				@Pc(64) Class336 local64 = local61.aClass336_1;
				if (local64.anIntArray414 != null) {
					local64 = local64.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 15584);
				}
				if (local64 != null) {
					local1 = local64.anIntArray417;
				}
			}
		} else if (Class118.method8413(arg0.anInt3012 * -92627949, (byte) 74)) {
			@Pc(104) Class610 local104 = (Class610) client.aClass532_1.method30647(1685828747).method18273((int) (arg0.aLong154 * 3050087486000948885L >>> 32 & 0x7FFFFFFFL), -552016599);
			if (local104.anIntArray494 != null) {
				local104 = local104.method32163(Class624.aClass120_1, Class624.aClass120_1, 1070158816);
			}
			if (local104 != null) {
				local1 = local104.anIntArray492;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class477(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass484_1 = (Class484) Class107.method18131(Class484.method29965((short) 28722), arg0.method22425((short) 16384), -1915563430);
		this.anInt5289 = arg0.method22431(-118643075) * -1602366477;
		if (this.aClass484_1 == Class484.aClass484_5) {
			this.anInt5288 = this.anInt5289 * 1031860883;
		} else {
			this.anInt5288 = arg0.method22431(-118643075) * -82023799;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
	int method29870() {
		return this.anInt5288 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)Lclient!pj;")
	Class484 method29871(@OriginalArg(0) byte arg0) {
		return this.aClass484_1;
	}

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "(I)I")
	int method29872(@OriginalArg(0) int arg0) {
		return this.anInt5289 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "()I")
	int method29873() {
		return this.anInt5289 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "()Lclient!pj;")
	Class484 method29874() {
		return this.aClass484_1;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()Lclient!pj;")
	Class484 method29875() {
		return this.aClass484_1;
	}

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "()I")
	int method29876() {
		return this.anInt5289 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()I")
	int method29877() {
		return this.anInt5289 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "()I")
	int method29878() {
		return this.anInt5289 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "()I")
	int method29879() {
		return this.anInt5288 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()I")
	int method29880() {
		return this.anInt5288 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "()I")
	int method29881() {
		return this.anInt5289 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "(B)I")
	int method29882(@OriginalArg(0) byte arg0) {
		return this.anInt5288 * 562179001;
	}
}
