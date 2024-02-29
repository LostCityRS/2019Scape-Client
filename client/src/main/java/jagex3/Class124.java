package jagex3;

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

	@OriginalMember(owner = "client!kl", name = "yz", descriptor = "(Lclient!yf;B)V")
	static void method21437(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class493.method30195(local13, local23, true, false, 925159299);
	}

	@OriginalMember(owner = "client!kl", name = "adj", descriptor = "(Lclient!yf;I)V")
	static void method21438(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5397 * -705055355;
	}

	@OriginalMember(owner = "client!kl", name = "anj", descriptor = "(Lclient!yf;I)V")
	static void method21439(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) CoordFine local13 = (CoordFine) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (Class65.aClass123_Sub1_2.method8986((byte) -114) != Class338.aClass338_6) {
			throw new RuntimeException();
		}
		@Pc(27) Class25_Sub2 local27 = (Class25_Sub2) Class65.aClass123_Sub1_2.method9040(-1763840262);
		local27.method16030(local13, (byte) -45);
		client.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!kl", name = "aqr", descriptor = "(Lclient!yf;I)V")
	static void method21440(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!kl", name = "bec", descriptor = "(Lclient!yf;I)V")
	static void method21441(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) Integer local43 = (Integer) client.aClass270_1.method26371(local13, -818402460).method26480(local23, local33, (byte) -91);
		if (local43 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local43;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!ase;I)V")
	static void method21442(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) boolean local8 = arg0.method22425((short) 16384) == 1;
		if (!local8) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(18) int local18 = arg0.method22676(-1905559379) << 24;
		@Pc(26) int local26 = local18 | arg0.method22676(-1795674623) << 16;
		@Pc(34) int local34 = local26 | arg0.method22676(-1708200762) << 8;
		@Pc(40) int local40 = local34 | arg0.method22676(-617258435);
		Class266.aClass306_1.method26910(Class413.aLong275 * 1983505324986122333L, local40, 823690709);
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!je;)V")
	Class124(@OriginalArg(0) Class123 arg0) {
		this.aClass123_13 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "(Lclient!ju;II)V")
	public abstract void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "(I)Z")
	public abstract boolean method21413(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "(B)Lclient!ox;")
	public abstract Class472 method21414(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()[D")
	public abstract double[] method21415();

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Lclient!akt;")
	public abstract CoordFine method21416(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "(I)F")
	public abstract float method21417(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "(Lclient!ju;IIB)V")
	public abstract void method21418(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "(Lclient!alw;I)V")
	public abstract void method21419(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "()Z")
	public abstract boolean method21420();

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "()Z")
	public abstract boolean method21421();

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "()Lclient!akt;")
	public abstract CoordFine method21422();

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()Lclient!akt;")
	public abstract CoordFine method21423();

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "()Lclient!akt;")
	public abstract CoordFine method21424();

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "(I)[D")
	public abstract double[] method21425(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21426(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "()F")
	public abstract float method21427();

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "()F")
	public abstract float method21428();

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "(Lclient!alw;)V")
	public abstract void method21429(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "(Lclient!alw;)V")
	public abstract void method21430(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21431(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "()Lclient!akt;")
	public abstract CoordFine method21432();

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V")
	public abstract void method21433(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21434(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "()Lclient!ox;")
	public abstract Class472 method21435();

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "(Lclient!ju;II)V")
	public abstract void method21436(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
