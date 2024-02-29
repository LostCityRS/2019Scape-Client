package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class346 {

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Ljava/lang/String;")
	final String aString187;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	final int anInt4233;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	final int anInt4234;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(Lclient!uh;IILclient!yf;I)V")
	static void method27658(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class681 arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class93_Sub1_Sub13 local5 = Class623.method32331(arg0, arg1, arg2, (short) -2455);
		if (local5 == null) {
			Class624.method32337((byte) -101);
			return;
		}
		arg3.anIntArray519 = new int[local5.anInt3065 * 341680345];
		arg3.anObjectArray44 = new Object[local5.anInt3064 * -1520226159];
		if (Class155.aClass155_62 == local5.aClass155_70 || Class155.aClass155_54 == local5.aClass155_70 || local5.aClass155_70 == Class155.aClass155_53) {
			arg3.anIntArray519[0] = arg1;
			arg3.anIntArray519[1] = Class82.aClass153_1.method14058(-793826658);
			arg3.anIntArray519[2] = Class82.aClass153_1.method14064(644992294);
		} else if (Class155.aClass155_57 == local5.aClass155_70 || local5.aClass155_70 == Class155.aClass155_48 || Class155.aClass155_56 == local5.aClass155_70 || local5.aClass155_70 == Class155.aClass155_52 || Class155.aClass155_51 == local5.aClass155_70) {
			arg3.anIntArray519[0] = arg1;
		} else if (Class155.aClass155_50 == local5.aClass155_70) {
			arg3.anIntArray519[0] = arg3.anInt6054 * -432601107;
		}
		Class91.method1706(local5, 500000, arg3, 634588949);
	}

	@OriginalMember(owner = "client!iq", name = "gm", descriptor = "(Lclient!yf;I)V")
	static void method27659(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class365.method28097(local11, local14, arg0, 2130983358);
	}

	@OriginalMember(owner = "client!iq", name = "wj", descriptor = "(Lclient!yf;I)V")
	static void method27660(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1653542369;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 4];
		Class274.aClass258_11.method26167(Class275.aClass275_9, local13, local23, local43, Class280.aClass280_7.method26543(-1849785549), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local53, local33, -1020781077);
	}

	@OriginalMember(owner = "client!iq", name = "xt", descriptor = "(Lclient!yf;I)V")
	static void method27661(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3453 * 1752864911;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lclient!alw;")
	static Class93_Sub41 method27662(@OriginalArg(0) byte arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(518);
		Class411.anIntArray443 = new int[4];
		Class411.anIntArray443[0] = Class110_Sub9.aSecureRandom1.nextInt();
		Class411.anIntArray443[1] = Class110_Sub9.aSecureRandom1.nextInt();
		Class411.anIntArray443[2] = Class110_Sub9.aSecureRandom1.nextInt();
		Class411.anIntArray443[3] = Class110_Sub9.aSecureRandom1.nextInt();
		local4.method22522(10, (byte) -6);
		local4.method22407(Class411.anIntArray443[0], (byte) 38);
		local4.method22407(Class411.anIntArray443[1], (byte) -73);
		local4.method22407(Class411.anIntArray443[2], (byte) -27);
		local4.method22407(Class411.anIntArray443[3], (byte) 35);
		local4.method22411(Class411.aLong272 * 5489047686998946493L);
		if (client.anInt3435 * -849002901 == 14) {
			local4.method22407(Class411.anIntArray444[0], (byte) -22);
			local4.method22407(Class411.anIntArray444[1], (byte) -15);
			local4.method22407(Class411.anIntArray444[2], (byte) 54);
			local4.method22407(Class411.anIntArray444[3], (byte) 22);
		}
		Class411.anIntArray444 = Class411.anIntArray443;
		return local4;
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(II)Ljava/lang/String;")
	public static String method27663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!iq", name = "eo", descriptor = "(Lclient!yf;I)V")
	static void method27664(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class81.method1378(local11, local14, arg0, 759834328);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljava/lang/String;II)V")
	Class346(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString187 = arg0;
		this.anInt4233 = arg1 * -2059066759;
		this.anInt4234 = arg2 * -1716410057;
	}
}
