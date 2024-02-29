package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abo")
public class Class41 implements Interface69 {

	@OriginalMember(owner = "client!abo", name = "n", descriptor = "I")
	int anInt125;

	@OriginalMember(owner = "client!abo", name = "w", descriptor = "I")
	int anInt126;

	@OriginalMember(owner = "client!abo", name = "m", descriptor = "I")
	int anInt127;

	@OriginalMember(owner = "client!abo", name = "k", descriptor = "I")
	int anInt128;

	@OriginalMember(owner = "client!abo", name = "f", descriptor = "I")
	int anInt129;

	@OriginalMember(owner = "client!abo", name = "e", descriptor = "I")
	int anInt130;

	@OriginalMember(owner = "client!abo", name = "l", descriptor = "Z")
	boolean aBoolean17;

	@OriginalMember(owner = "client!abo", name = "p", descriptor = "(II)J", line = 110)
	public static long method815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!abo", name = "ae", descriptor = "(III)V", line = 172)
	public static void method816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class93_Sub1_Sub11 local9 = Class371.method28000(17, (long) arg1 << 32 | (long) arg0);
		local9.method21885(2147065785);
	}

	@OriginalMember(owner = "client!abo", name = "<init>", descriptor = "()V", line = 954)
	Class41() {
	}

	@OriginalMember(owner = "client!abo", name = "m", descriptor = "()J", line = 957)
	@Override
	public long method809() {
		@Pc(1) long[] local1 = Class93_Sub41.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt130 * 2061353869)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt125 * 392439591 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt125 * 392439591)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt127 * 525563263 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt127 * 525563263 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt127 * 525563263 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt127 * 525563263)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt128 * 1162014441)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt129 * -474874119 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt129 * -474874119 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt129 * -474874119 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt129 * -474874119)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt126 * -2033778275)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean17 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!abo", name = "f", descriptor = "()J", line = 957)
	@Override
	public long method812() {
		@Pc(1) long[] local1 = Class93_Sub41.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt130 * 2061353869)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt125 * 392439591 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt125 * 392439591)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt127 * 525563263 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt127 * 525563263 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt127 * 525563263 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt127 * 525563263)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt128 * 1162014441)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt129 * -474874119 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt129 * -474874119 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt129 * -474874119 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt129 * -474874119)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt126 * -2033778275)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean17 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!abo", name = "k", descriptor = "()J", line = 957)
	@Override
	public long method810() {
		@Pc(1) long[] local1 = Class93_Sub41.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt130 * 2061353869)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt125 * 392439591 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt125 * 392439591)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt127 * 525563263 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt127 * 525563263 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt127 * 525563263 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt127 * 525563263)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt128 * 1162014441)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt129 * -474874119 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt129 * -474874119 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt129 * -474874119 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt129 * -474874119)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt126 * -2033778275)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean17 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!abo", name = "e", descriptor = "()J", line = 957)
	@Override
	public long method811() {
		@Pc(1) long[] local1 = Class93_Sub41.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt130 * 2061353869)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt125 * 392439591 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt125 * 392439591)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt127 * 525563263 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt127 * 525563263 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt127 * 525563263 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt127 * 525563263)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt128 * 1162014441)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt129 * -474874119 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt129 * -474874119 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt129 * -474874119 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt129 * -474874119)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt126 * -2033778275)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean17 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!abo", name = "n", descriptor = "(Lclient!wk;)Z", line = 977)
	@Override
	public boolean method808(@OriginalArg(0) Interface69 arg0) {
		if (!(arg0 instanceof Class41)) {
			return false;
		}
		@Pc(7) Class41 local7 = (Class41) arg0;
		if (this.anInt130 * 2061353869 != local7.anInt130 * 2061353869) {
			return false;
		} else if (this.anInt125 * 392439591 != local7.anInt125 * 392439591) {
			return false;
		} else if (this.anInt127 * 525563263 != local7.anInt127 * 525563263) {
			return false;
		} else if (local7.anInt128 * 1162014441 != this.anInt128 * 1162014441) {
			return false;
		} else if (this.anInt129 * -474874119 != local7.anInt129 * -474874119) {
			return false;
		} else if (this.anInt126 * -2033778275 == local7.anInt126 * -2033778275) {
			return this.aBoolean17 == local7.aBoolean17;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abo", name = "w", descriptor = "(Lclient!wk;)Z", line = 977)
	@Override
	public boolean method813(@OriginalArg(0) Interface69 arg0) {
		if (!(arg0 instanceof Class41)) {
			return false;
		}
		@Pc(7) Class41 local7 = (Class41) arg0;
		if (this.anInt130 * 2061353869 != local7.anInt130 * 2061353869) {
			return false;
		} else if (this.anInt125 * 392439591 != local7.anInt125 * 392439591) {
			return false;
		} else if (this.anInt127 * 525563263 != local7.anInt127 * 525563263) {
			return false;
		} else if (local7.anInt128 * 1162014441 != this.anInt128 * 1162014441) {
			return false;
		} else if (this.anInt129 * -474874119 != local7.anInt129 * -474874119) {
			return false;
		} else if (this.anInt126 * -2033778275 == local7.anInt126 * -2033778275) {
			return this.aBoolean17 == local7.aBoolean17;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abo", name = "l", descriptor = "(Lclient!wk;)Z", line = 977)
	@Override
	public boolean method814(@OriginalArg(0) Interface69 arg0) {
		if (!(arg0 instanceof Class41)) {
			return false;
		}
		@Pc(7) Class41 local7 = (Class41) arg0;
		if (this.anInt130 * 2061353869 != local7.anInt130 * 2061353869) {
			return false;
		} else if (this.anInt125 * 392439591 != local7.anInt125 * 392439591) {
			return false;
		} else if (this.anInt127 * 525563263 != local7.anInt127 * 525563263) {
			return false;
		} else if (local7.anInt128 * 1162014441 != this.anInt128 * 1162014441) {
			return false;
		} else if (this.anInt129 * -474874119 != local7.anInt129 * -474874119) {
			return false;
		} else if (this.anInt126 * -2033778275 == local7.anInt126 * -2033778275) {
			return this.aBoolean17 == local7.aBoolean17;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abo", name = "es", descriptor = "(Lclient!yf;B)V", line = 5719)
	static final void method817(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 106745352);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class258.method26141(local16, local22, arg0, 761498432);
	}
}
