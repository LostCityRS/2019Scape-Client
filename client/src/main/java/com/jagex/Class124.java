package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public abstract class Class124 {

	@OriginalMember(owner = "client!kl", name = "fb", descriptor = "Lclient!py;")
	public static Class497 aClass497_93;

	@OriginalMember(owner = "client!kl", name = "he", descriptor = "Lclient!aoz;")
	public static Class32_Sub21 aClass32_Sub21_7;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!je;")
	final Class123 aClass123_13;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!je;)V", line = 13)
	Class124(@OriginalArg(0) Class123 arg0) {
		this.aClass123_13 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!ase;I)V", line = 879)
	static void method21400(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) boolean local8 = arg0.method22465((short) 16384) == 1;
		if (!local8) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(18) int local18 = arg0.method22667(-1905559379) << 24;
		@Pc(26) int local26 = local18 | arg0.method22667(-1795674623) << 16;
		@Pc(34) int local34 = local26 | arg0.method22667(-1708200762) << 8;
		@Pc(40) int local40 = local34 | arg0.method22667(-617258435);
		Class266.aClass306_1.method26809(Class413.aLong272 * 1983505324986122333L, local40, 823690709);
	}

	@OriginalMember(owner = "client!kl", name = "yz", descriptor = "(Lclient!yf;B)V", line = 9296)
	static final void method21401(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class493.method30008(local13, local23, true, false, 925159299);
	}

	@OriginalMember(owner = "client!kl", name = "adj", descriptor = "(Lclient!yf;I)V", line = 10173)
	static final void method21402(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5236 * -705055355;
	}

	@OriginalMember(owner = "client!kl", name = "anj", descriptor = "(Lclient!yf;I)V", line = 12325)
	static final void method21403(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class93_Sub30 local13 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (Class65.aClass123_Sub1_2.method9020((byte) -114) != Class338.aClass338_6) {
			throw new RuntimeException();
		}
		@Pc(27) Class25_Sub2 local27 = (Class25_Sub2) Class65.aClass123_Sub1_2.method9017(-1763840262);
		local27.method16019(local13, (byte) -45);
		client.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!kl", name = "aqr", descriptor = "(Lclient!yf;I)V", line = 12835)
	static final void method21404(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!kl", name = "bec", descriptor = "(Lclient!yf;I)V", line = 14843)
	static final void method21405(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) Integer local43 = (Integer) client.aClass270_1.method26280(local13, -818402460).method26438(local23, local33, (byte) -91);
		if (local43 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local43;
		}
	}

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "(Lclient!ju;II)V")
	public abstract void method21406(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "(I)Z")
	public abstract boolean method21407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "(B)Lclient!ox;")
	public abstract Class472 method21408(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()[D")
	public abstract double[] method21409();

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Lclient!akt;")
	public abstract Class93_Sub30 method21410(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "(I)F")
	public abstract float method21411(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "(Lclient!ju;IIB)V")
	public abstract void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "(Lclient!alw;I)V")
	public abstract void method21413(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "()Z")
	public abstract boolean method21414();

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "()Z")
	public abstract boolean method21415();

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21416();

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21417();

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21418();

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "(I)[D")
	public abstract double[] method21419(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21420(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "()F")
	public abstract float method21421();

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "()F")
	public abstract float method21422();

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "(Lclient!alw;)V")
	public abstract void method21423(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "(Lclient!alw;)V")
	public abstract void method21424(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21425(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21426();

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V")
	public abstract void method21427(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21428(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "()Lclient!ox;")
	public abstract Class472 method21429();

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "(Lclient!ju;II)V")
	public abstract void method21430(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
