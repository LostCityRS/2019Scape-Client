package jagex3;

import jagex3.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fx")
public final class Class278 {

	@OriginalMember(owner = "client!fx", name = "oc", descriptor = "I")
	public static int anInt3929;

	@OriginalMember(owner = "client!fx", name = "e", descriptor = "Lclient!fx;")
	public static final Class278 aClass278_5 = new Class278();

	@OriginalMember(owner = "client!fx", name = "n", descriptor = "Lclient!fx;")
	static final Class278 aClass278_3 = new Class278();

	@OriginalMember(owner = "client!fx", name = "m", descriptor = "Lclient!fx;")
	static final Class278 aClass278_1 = new Class278();

	@OriginalMember(owner = "client!fx", name = "k", descriptor = "Lclient!fx;")
	static final Class278 aClass278_4 = new Class278();

	@OriginalMember(owner = "client!fx", name = "f", descriptor = "Lclient!fx;")
	public static final Class278 aClass278_2 = new Class278();

	@OriginalMember(owner = "client!fx", name = "x", descriptor = "(Lclient!yf;I)V")
	static void method26456(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(17) TwitchWebcamDevice local17 = Class546.method31151(local13, (byte) 1);
		if (local17 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anInt3624 * -1015277237;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString153;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString154;
		}
	}

	@OriginalMember(owner = "client!fx", name = "arp", descriptor = "(Lclient!yf;I)V")
	static void method26457(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class411.anInt4910 * 914785575;
	}

	@OriginalMember(owner = "client!fx", name = "w", descriptor = "(II)I")
	public static int method26458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!fx", name = "<init>", descriptor = "()V")
	Class278() {
	}
}
