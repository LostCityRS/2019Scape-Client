package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public class Class125 implements Interface32 {

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!kv;")
	public final Class390 aClass390_7;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!ky;")
	public final Class392 aClass392_7;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	public final int anInt2981;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public final int anInt2982;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
	public final int anInt2983;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	public final int anInt2980;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public final int anInt2985;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public final int anInt2986;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
	public final int anInt2984;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "(Lclient!alw;)Lclient!kp;")
	static Class125 method21470(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(6) Class390 local6 = Class708.method36937(8644033)[arg0.method22425((short) 16384)];
		@Pc(13) Class392 local13 = Class252.method26071(973780826)[arg0.method22425((short) 16384)];
		@Pc(17) int local17 = arg0.method22494((byte) -29);
		@Pc(21) int local21 = arg0.method22494((byte) -79);
		@Pc(25) int local25 = arg0.method22427(-1434290800);
		@Pc(29) int local29 = arg0.method22427(-1434290800);
		@Pc(33) int local33 = arg0.method22494((byte) -111);
		@Pc(37) int local37 = arg0.method22448(-2087591759);
		@Pc(41) int local41 = arg0.method22431(-118643075);
		return new Class125(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "([ID)V")
	static void method21471(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != Class111.aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				Class111.anIntArray69[local5] = local18 > 255 ? 255 : local18;
			}
			Class111.aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = Class111.anIntArray69[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = Class111.anIntArray69[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = Class111.anIntArray69[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "(II)Lclient!hq;")
	public static Class320 method21472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class166_Sub1.aClass320Array1[arg0 >> 16];
	}

	@OriginalMember(owner = "client!kp", name = "ou", descriptor = "(Lclient!yf;I)V")
	static void method21473(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class362.method28023(local11, local14, arg0, 1611628891);
	}

	@OriginalMember(owner = "client!kp", name = "ar", descriptor = "(IIIB)V")
	static void method21474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(9, (long) arg0);
		local4.method21813(-1171764247);
		local4.anInt3020 = arg1 * 1415359557;
		local4.anInt3025 = arg2 * -302789657;
	}

	@OriginalMember(owner = "client!kp", name = "et", descriptor = "(I)V")
	public static void method21475(@OriginalArg(0) int arg0) {
		Class159_Sub1.aHashMap4.clear();
		Class159_Sub1.aHashMap5.clear();
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIIIII)V")
	Class125(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass390_7 = arg0;
		this.aClass392_7 = arg1;
		this.anInt2981 = arg2 * -1342556433;
		this.anInt2982 = arg3 * -1108840563;
		this.anInt2983 = arg4 * -208344037;
		this.anInt2980 = arg5 * 1170896873;
		this.anInt2985 = arg6 * 235263261;
		this.anInt2986 = arg7 * 713673967;
		this.anInt2984 = arg8 * 11025399;
	}

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "()Lclient!kt;")
	@Override
	public Class388 method28760() {
		return null;
	}

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "(S)Lclient!kt;")
	@Override
	public Class388 method28759(@OriginalArg(0) short arg0) {
		return null;
	}
}
