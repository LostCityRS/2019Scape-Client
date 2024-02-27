package com.jagex;

import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class256 implements Callable {

	@OriginalMember(owner = "client!f", name = "uq", descriptor = "I")
	static int anInt3894;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "()Ljava/security/SecureRandom;")
	static SecureRandom method26104() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!f", name = "m", descriptor = "()Ljava/security/SecureRandom;")
	static SecureRandom method26105() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Object;I)V")
	static void method26106(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (Class604.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class604.anEventQueue1.peekEvent() != null; local4++) {
			Class212.method25532(1L);
		}
		try {
			if (arg0 != null) {
				Class604.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!f", name = "tx", descriptor = "(Lclient!yf;S)V")
	static void method26107(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class93_Sub3.method11815(local11, arg0, 182683471);
	}

	@OriginalMember(owner = "client!f", name = "awx", descriptor = "(Lclient!yf;I)V")
	static void method26108(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class154_Sub1 local16 = Class367.method28142(local12, (byte) -35);
		if (local16 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt1650 * 803722663;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.aString47;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.method14148(-2133879446);
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.method14154((byte) -92);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt1652 * 1625257571;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt1655 * 1280583823;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.aString46;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!f", name = "azt", descriptor = "(Lclient!yf;B)V")
	static void method26109(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15622(515685797) ? 1 : 0;
	}

	@OriginalMember(owner = "client!f", name = "aog", descriptor = "(Lclient!yf;I)V")
	static void method26110(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9023(-1662199153) != Class342.aClass342_3 || Class65.aClass123_Sub1_2.method8986((byte) -81) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(20) Class472 local20 = ((Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -102)).method9166(1395049383);
		@Pc(27) Class472 local27 = ((Class25_Sub5) Class65.aClass123_Sub1_2.method9040(-1339148653)).method16488(-115974587);
		@Pc(30) Class472 local30 = Class472.method29711(local20);
		local30.method29764(local27);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) local30.method29746();
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	Class256() {
	}

	@OriginalMember(owner = "client!f", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method26103() {
		return Class517.method30472(1890706673);
	}

	@OriginalMember(owner = "client!f", name = "call", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object call() {
		return Class517.method30472(1759873819);
	}
}
