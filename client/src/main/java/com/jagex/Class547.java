package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class547 implements Interface22 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!ahb;")
	Class120_Sub1_Sub1_Sub1 aClass120_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "(Ljava/lang/CharSequence;IZI)Z")
	static boolean method31237(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				return false;
			}
			if (local56 >= arg1) {
				return false;
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(91) int local91 = local23 * arg1 + local56;
			if (local23 != local91 / arg1) {
				return false;
			}
			local23 = local91;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ahb;)V")
	Class547(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0) {
		this.aClass120_Sub1_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "p", descriptor = "(Lclient!kb;I)V")
	@Override
	public void method36993(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method36983(arg0.aClass107_1, arg0.method28422(this.method36980(arg0.aClass107_1, -581550166), arg1, -2021485959), -1508125522);
	}

	@OriginalMember(owner = "client!se", name = "m", descriptor = "(Lclient!ea;I)I")
	@Override
	public int method36980(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method722(arg0.anInt862 * -1873516487, (byte) 2);
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(Lclient!ea;I)J")
	@Override
	public long method36984(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method716(arg0.anInt862 * -1873516487, (byte) 124);
	}

	@OriginalMember(owner = "client!se", name = "ax", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36979(@OriginalArg(0) Class107 arg0) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method722(arg0.anInt862 * -1873516487, (byte) 2);
	}

	@OriginalMember(owner = "client!se", name = "o", descriptor = "(Lclient!kb;B)I")
	@Override
	public int method36978(@OriginalArg(0) Class374 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, -1165636696), 1181286102);
	}

	@OriginalMember(owner = "client!se", name = "t", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method36983(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method730(arg0.anInt862 * -1873516487, arg1, 2106470520);
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36985(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(Lclient!kb;IB)V")
	@Override
	public void method36987(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws Exception_Sub6 {
		this.method36983(arg0.aClass107_1, arg0.method28422(this.method36980(arg0.aClass107_1, -446922772), arg1, -1086087718), 950516505);
	}

	@OriginalMember(owner = "client!se", name = "k", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36999(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!se", name = "q", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36997(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method719(arg0.anInt862 * -1873516487, arg1, -1970675857);
	}

	@OriginalMember(owner = "client!se", name = "ai", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36981(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, 258017094), 185935484);
	}

	@OriginalMember(owner = "client!se", name = "ay", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36977(@OriginalArg(0) Class107 arg0) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method722(arg0.anInt862 * -1873516487, (byte) 2);
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36989(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method730(arg0.anInt862 * -1873516487, arg1, 2002159234);
	}

	@OriginalMember(owner = "client!se", name = "l", descriptor = "(Lclient!ea;Ljava/lang/Object;I)V")
	@Override
	public void method37001(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method719(arg0.anInt862 * -1873516487, arg1, -2101918374);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;)J")
	@Override
	public long method36991(@OriginalArg(0) Class107 arg0) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method716(arg0.anInt862 * -1873516487, (byte) 19);
	}

	@OriginalMember(owner = "client!se", name = "s", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36992(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!se", name = "aq", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36982(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, -61658437), -1404291706);
	}

	@OriginalMember(owner = "client!se", name = "x", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36994(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!se", name = "j", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36990(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method730(arg0.anInt862 * -1873516487, arg1, 1039641849);
	}

	@OriginalMember(owner = "client!se", name = "r", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36996(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method719(arg0.anInt862 * -1873516487, arg1, -1719767555);
	}

	@OriginalMember(owner = "client!se", name = "w", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	public Object method36995(@OriginalArg(0) Class107 arg0) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method718(arg0.anInt862 * -1873516487, (byte) 118);
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36998(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method719(arg0.anInt862 * -1873516487, arg1, -2058824954);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36986(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method719(arg0.anInt862 * -1873516487, arg1, -1765206148);
	}

	@OriginalMember(owner = "client!se", name = "z", descriptor = "(Lclient!kb;I)V")
	@Override
	public void method37000(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method36983(arg0.aClass107_1, arg0.method28422(this.method36980(arg0.aClass107_1, 657644124), arg1, -633798524), -1539340881);
	}

	@OriginalMember(owner = "client!se", name = "u", descriptor = "(Lclient!ea;I)Ljava/lang/Object;")
	@Override
	public Object method36988(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.aClass120_Sub1_Sub1_Sub1_3.anInterface4_5.method718(arg0.anInt862 * -1873516487, (byte) 106);
	}
}
