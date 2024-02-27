package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zf")
public final class Class705 implements Interface75 {

	@OriginalMember(owner = "client!zf", name = "dl", descriptor = "Lclient!ali;")
	public static Class80_Sub39 aClass80_Sub39_1;

	@OriginalMember(owner = "client!zf", name = "t", descriptor = "Lclient!zf;")
	public static final Class705 aClass705_2 = new Class705(0, "");

	@OriginalMember(owner = "client!zf", name = "f", descriptor = "Lclient!zf;")
	public static final Class705 aClass705_1 = new Class705(1, "");

	@OriginalMember(owner = "client!zf", name = "e", descriptor = "I")
	final int anInt5817;

	@OriginalMember(owner = "client!zf", name = "nc", descriptor = "(Lclient!yp;I)V")
	static void method37129(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2073553812);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class299.method27025(local16, local22, arg0, (byte) 70);
	}

	@OriginalMember(owner = "client!zf", name = "t", descriptor = "(IIIIIIILclient!oc;I)V")
	public static void method37130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class457 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local6 != null; local6 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(-1774970430)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && local6.anInt1473 * -1479987305 == arg2 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass539_1.method30921(2111614388) && arg2 < client.aClass539_1.method31011(-719550660)) {
				Class618.method32297(local1, (byte) 2);
			}
			Class80_Sub8.aClass8_19.method232(local1, 996694779);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.anInt1480 = arg6 * 1847219873;
		if (arg7 != null) {
			local1.aClass457_53 = new Class457(arg7);
		}
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "(ILjava/lang/String;)V")
	Class705(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this.anInt5817 = arg0 * 1763075149;
	}

	@OriginalMember(owner = "client!zf", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5817 * -1156090747;
	}

	@OriginalMember(owner = "client!zf", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5817 * -1156090747;
	}

	@OriginalMember(owner = "client!zf", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5817 * -1156090747;
	}
}
