package com.jagex;

import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public class Class256 implements Callable {

	@OriginalMember(owner = "client!f", name = "uq", descriptor = "I")
	static int anInt3853;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 32)
	Class256() {
	}

	@OriginalMember(owner = "client!f", name = "n", descriptor = "()Ljava/security/SecureRandom;", line = 35)
	static SecureRandom method26010() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!f", name = "m", descriptor = "()Ljava/security/SecureRandom;", line = 35)
	static SecureRandom method26011() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!f", name = "k", descriptor = "()Ljava/lang/Object;", line = 41)
	public Object method26012() {
		return Class517.method30291(1890706673);
	}

	@OriginalMember(owner = "client!f", name = "call", descriptor = "()Ljava/lang/Object;", line = 41)
	@Override
	public Object call() {
		return Class517.method30291(1759873819);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Object;I)V", line = 556)
	static void method26013(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (Class604.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class604.anEventQueue1.peekEvent() != null; local4++) {
			Class212.method25431(1L);
		}
		try {
			if (arg0 != null) {
				Class604.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!f", name = "tx", descriptor = "(Lclient!yf;S)V", line = 8533)
	static final void method26014(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class93_Sub3.method11814(local11, arg0, 182683471);
	}

	@OriginalMember(owner = "client!f", name = "aog", descriptor = "(Lclient!yf;I)V", line = 12575)
	static final void method26015(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9024(-1662199153) != Class342.aClass342_3 || Class65.aClass123_Sub1_2.method9020((byte) -81) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(20) Class472 local20 = ((Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -102)).method9181(1395049383);
		@Pc(27) Class472 local27 = ((Class25_Sub5) Class65.aClass123_Sub1_2.method9017(-1339148653)).method16484(-115974587);
		@Pc(30) Class472 local30 = Class472.method29537(local20);
		local30.method29576(local27);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) local30.method29593();
	}

	@OriginalMember(owner = "client!f", name = "awx", descriptor = "(Lclient!yf;I)V", line = 13691)
	static final void method26016(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class154_Sub1 local16 = Class367.method27959(local12, (byte) -35);
		if (local16 != null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt1650 * 803722663;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local16.aString47;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.method14151(-2133879446);
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local16.method14157((byte) -92);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt1652 * 1625257571;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt1655 * 1280583823;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local16.aString46;
			return;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!f", name = "azt", descriptor = "(Lclient!yf;B)V", line = 14161)
	static final void method26017(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub12_1.method15611(515685797) ? 1 : 0;
	}
}
