package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public class Class477 {

	@OriginalMember(owner = "client!pc", name = "fg", descriptor = "Lclient!pf;")
	public static Class480 aClass480_2;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!pj;")
	final Class484 aClass484_1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	final int anInt5128;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	final int anInt5127;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!alw;)V", line = 11)
	Class477(@OriginalArg(0) Packet arg0) {
		this.aClass484_1 = (Class484) Class107.method18116(Class484.method29784((short) 28722), arg0.g1((short) 16384), -1915563430);
		this.anInt5128 = arg0.g4(-118643075) * -1602366477;
		if (this.aClass484_1 == Class484.aClass484_5) {
			this.anInt5127 = this.anInt5128 * 1031860883;
		} else {
			this.anInt5127 = arg0.g4(-118643075) * -82023799;
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)Lclient!pj;", line = 19)
	Class484 method29689(@OriginalArg(0) byte arg0) {
		return this.aClass484_1;
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "()Lclient!pj;", line = 19)
	Class484 method29690() {
		return this.aClass484_1;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()Lclient!pj;", line = 19)
	Class484 method29691() {
		return this.aClass484_1;
	}

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "(I)I", line = 23)
	int method29692(@OriginalArg(0) int arg0) {
		return this.anInt5128 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "()I", line = 23)
	int method29693() {
		return this.anInt5128 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "()I", line = 23)
	int method29694() {
		return this.anInt5128 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()I", line = 23)
	int method29695() {
		return this.anInt5128 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "()I", line = 23)
	int method29696() {
		return this.anInt5128 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "()I", line = 23)
	int method29697() {
		return this.anInt5128 * 1016331579;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()I", line = 27)
	int method29698() {
		return this.anInt5127 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "()I", line = 27)
	int method29699() {
		return this.anInt5127 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()I", line = 27)
	int method29700() {
		return this.anInt5127 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "(B)I", line = 27)
	int method29701(@OriginalArg(0) byte arg0) {
		return this.anInt5127 * 562179001;
	}

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "(IIIB)I", line = 27)
	public static int method29702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
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

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "(Lclient!arm;I)[I", line = 1151)
	static int[] method29703(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int[] local1 = null;
		if (Class664.method32882(arg0.anInt3012 * -92627949, 1527912881)) {
			local1 = ((Class47) Class277.aClass32_Sub12_1.method18261((int) (arg0.aLong154 * 3050087486000948885L), -1836489641)).anIntArray11;
		} else if (arg0.anInt3010 * 1303344433 != -1) {
			local1 = ((Class47) Class277.aClass32_Sub12_1.method18261(arg0.anInt3010 * 1303344433, -43288383)).anIntArray11;
		} else if (Class110_Sub6.method7672(arg0.anInt3012 * -92627949, (byte) -1)) {
			@Pc(54) Class93_Sub15 local54 = (Class93_Sub15) client.aClass16_18.method214((long) (arg0.aLong154 * 3050087486000948885L));
			if (local54 != null) {
				@Pc(61) Class132_Sub1_Sub1_Sub1_Sub1 local61 = (Class132_Sub1_Sub1_Sub1_Sub1) local54.anObject5;
				@Pc(64) Class336 local64 = local61.aClass336_1;
				if (local64.anIntArray412 != null) {
					local64 = local64.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 15584);
				}
				if (local64 != null) {
					local1 = local64.anIntArray415;
				}
			}
		} else if (Class118.method8411(arg0.anInt3012 * -92627949, (byte) 74)) {
			@Pc(104) Class610 local104 = (Class610) client.world.method30496(1685828747).method18261((int) (arg0.aLong154 * 3050087486000948885L >>> 32 & 0x7FFFFFFFL), -552016599);
			if (local104.anIntArray492 != null) {
				local104 = local104.method31991(Class624.aClass120_1, Class624.aClass120_1, 1070158816);
			}
			if (local104 != null) {
				local1 = local104.anIntArray490;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!pc", name = "aew", descriptor = "(Lclient!yf;I)V", line = 10233)
	static final void method29704(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 / local23;
	}

	@OriginalMember(owner = "client!pc", name = "apd", descriptor = "(Lclient!yf;B)V", line = 12731)
	static final void method29705(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		Class153_Sub1.method14112(local13, -1850871808);
	}

	@OriginalMember(owner = "client!pc", name = "bap", descriptor = "(Lclient!yf;B)V", line = 14300)
	static final void method29706(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub46_1.method16546(local12, -122175387);
	}
}
