package jagex3;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
final class Class581 implements Comparator {

	@OriginalMember(owner = "client!tt", name = "tp", descriptor = "Lclient!kr;")
	public static Class386 aClass386_2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tt", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 aClass146_Sub2_4;

	@OriginalMember(owner = "client!tt", name = "apc", descriptor = "(Lclient!yf;I)V")
	static void method31578(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method8986((byte) -7) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9040(1735468072)).method15977(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) -5);
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "(II)V")
	static void method31579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class173.anInt3254 = arg0 * -484055331;
		Class173.aClass240_64.method25926((byte) -74);
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(II)Lclient!cr;")
	static Class211 method31580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class211 local6 = (Class211) Class107.method18131(Class430.method28941(-406593969), arg0, -1915563430);
		if (local6 == null) {
			local6 = Class211.aClass211_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!aiz;)V")
	Class581(@OriginalArg(0) Class146_Sub2 arg0) {
		this.aClass146_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method31571(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int method31572(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31575((Class535) arg0, (Class535) arg1, 1270196902);
	}

	@OriginalMember(owner = "client!tt", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31575((Class535) arg0, (Class535) arg1, 2029148113);
	}

	@OriginalMember(owner = "client!tt", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method31573(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method31574(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(Lclient!rq;Lclient!rq;I)I")
	int method31575(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) float local3 = arg0.method30863(994722973);
		@Pc(7) float local7 = arg1.method30863(591153586);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method31576(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "(Lclient!rq;Lclient!rq;)I")
	int method31577(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1) {
		@Pc(3) float local3 = arg0.method30863(-1838276395);
		@Pc(7) float local7 = arg1.method30863(419896320);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}
}
