package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public class Class133 implements Interface32 {

	@OriginalMember(owner = "client!la", name = "ak", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray16;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public final int anInt1133;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!kv;")
	public final Class390 aClass390_6;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!ky;")
	public final Class392 aClass392_6;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public final int anInt1131;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public final int anInt1132;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(Lclient!alw;)Lclient!la;")
	public static Class133 method10071(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22448(-617007490);
		@Pc(10) Class390 local10 = Class708.method36937(36102269)[arg0.method22425((short) 16384)];
		@Pc(17) Class392 local17 = Class252.method26071(2094587407)[arg0.method22425((short) 16384)];
		@Pc(21) int local21 = arg0.method22494((byte) -13);
		@Pc(25) int local25 = arg0.method22494((byte) -93);
		return new Class133(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!la", name = "w", descriptor = "(I[ILclient!hq;ZI)Lclient!hq;")
	public static Class320 method10072(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (!Class589.aClass497_132.method30273(arg0, -1392918358)) {
			return null;
		}
		@Pc(11) int local11 = Class589.aClass497_132.method30243(arg0, 481794000);
		@Pc(16) Class312[] local16;
		if (local11 == 0) {
			local16 = new Class312[0];
		} else if (arg2 == null) {
			local16 = new Class312[local11];
		} else {
			local16 = arg2.aClass312Array3;
		}
		if (arg2 == null) {
			arg2 = new Class320(arg3, local16);
		} else {
			arg2.aClass312Array3 = local16;
			arg2.aBoolean712 = arg3;
		}
		for (@Pc(43) int local43 = 0; local43 < local11; local43++) {
			if (arg2.aClass312Array3[local43] == null) {
				@Pc(58) byte[] local58 = Class589.aClass497_132.method30260(arg0, local43, arg1, (byte) -19);
				if (local58 != null) {
					@Pc(70) Class312 local70 = arg2.aClass312Array3[local43] = new Class312();
					local70.anInt3994 = (local43 + (arg0 << 16)) * -212068725;
					local70.method26939(new Class93_Sub41(local58), -253284198);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!la", name = "ail", descriptor = "(Lclient!yf;B)V")
	static void method10073(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class372.aClass58_2.method1097(local13, -737304293).anIntArray266[local23];
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILclient!kv;Lclient!ky;II)V")
	Class133(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class392 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1133 = arg0 * -1883674719;
		this.aClass390_6 = arg1;
		this.aClass392_6 = arg2;
		this.anInt1131 = arg3 * -994359025;
		this.anInt1132 = arg4 * -1548417669;
	}

	@OriginalMember(owner = "client!la", name = "n", descriptor = "(S)Lclient!kt;")
	@Override
	public Class388 method28759(@OriginalArg(0) short arg0) {
		return Class388.aClass388_8;
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "()Lclient!kt;")
	@Override
	public Class388 method28760() {
		return Class388.aClass388_8;
	}
}
