package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
final class Class367 implements Interface21 {

	@OriginalMember(owner = "client!js", name = "h", descriptor = "(Lclient!akl;B)[I")
	static int[] method28140(@OriginalArg(0) Class93_Sub22 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method22522(10, (byte) -16);
		local4.method22407(local7[0], (byte) -61);
		local4.method22407(local7[1], (byte) 95);
		local4.method22407(local7[2], (byte) 21);
		local4.method22407(local7[3], (byte) -2);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method22407((int) (Math.random() * 9.9999999E7D), (byte) -16);
		}
		local4.method22466((int) (Math.random() * 9.9999999E7D), 2130714535);
		local4.method22428(Class95.aBigInteger2, Class95.aBigInteger4, (byte) -67);
		arg0.aClass93_Sub41_Sub2_1.method22417(local4.aByteArray58, 0, local4.anInt3070 * 212851357, 2026842986);
		return local7;
	}

	@OriginalMember(owner = "client!js", name = "m", descriptor = "(Ljava/lang/String;B)V")
	public static void method28141(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		Class227.method25707(0, 0, "", "", "", arg0, null, -1923908417);
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(IB)Lclient!alc;")
	public static Class154_Sub1 method28142(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return Class632.aBoolean860 && arg0 >= Class607.anInt5721 * 1855382415 && arg0 <= Class361.anInt4732 * 977343673 ? Class632.aClass154_Sub1Array2[arg0 - Class607.anInt5721 * 1855382415] : null;
	}

	@OriginalMember(owner = "client!js", name = "w", descriptor = "(Lclient!qe;II)Lclient!ec;")
	@Override
	public Class108 method28135(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18273(arg1, -2012268201);
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(Lclient!qe;I)Lclient!ec;")
	@Override
	public Class108 method28133(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18273(arg1, -226156357);
	}

	@OriginalMember(owner = "client!js", name = "ag", descriptor = "(I)Lclient!kh;")
	@Override
	public Class379 method28139(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.method18273(arg0, 835613564);
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(Lclient!qe;I)Lclient!ec;")
	@Override
	public Class108 method28136(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18273(arg1, 1871499791);
	}

	@OriginalMember(owner = "client!js", name = "t", descriptor = "(Lclient!qe;I)Lclient!ec;")
	@Override
	public Class108 method28137(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18273(arg1, 1419419634);
	}

	@OriginalMember(owner = "client!js", name = "ae", descriptor = "(I)Lclient!kh;")
	@Override
	public Class379 method28138(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.method18273(arg0, -165770305);
	}

	@OriginalMember(owner = "client!js", name = "l", descriptor = "(IB)Lclient!kh;")
	@Override
	public Class379 method28134(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Class379) Class30.aClass32_Sub16_1.method18273(arg0, 746126493);
	}
}
