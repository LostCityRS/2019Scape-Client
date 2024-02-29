package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alv")
public final class Class53_Sub1 extends Class53 implements Interface63 {

	@OriginalMember(owner = "client!alv", name = "bn", descriptor = "Lclient!cm;")
	public static Class100 aClass100_19;

	@OriginalMember(owner = "client!alv", name = "k", descriptor = "(CB)Z")
	public static boolean method14964(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!alv", name = "f", descriptor = "([BIII)[B")
	public static byte[] method14965(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class15 local26 = new Class15();
		local26.method199(1861485051);
		local26.method211(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method200(local39, 0, 1886711007);
		return local39;
	}

	@OriginalMember(owner = "client!alv", name = "al", descriptor = "(III)V")
	static void method14966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class379 local5 = (Class379) Class30.aClass32_Sub16_1.method18273(arg0, 1660295563);
		@Pc(14) Class93_Sub1_Sub11 local14 = Class371.method28187(1, (long) (local5.aClass108_1.anInt867 * -1284841473));
		try {
			if (Class93_Sub1_Sub11.aBoolean507) {
				local14.anInt3020 = Class596.aClass113_Sub1_1.method33636(local5.aClass108_1, -1912270194) * 1415359557;
			}
			local14.anInt3020 = local5.method28263(local14.anInt3020 * -222984563, arg1, -2030113981) * 1415359557;
			local14.method21813(-826174264);
		} catch (@Pc(42) Exception_Sub7 local42) {
			Class646.method32791("" + arg0, local42, 867551444);
		}
	}

	@OriginalMember(owner = "client!alv", name = "m", descriptor = "(I)V")
	static void method14967(@OriginalArg(0) int arg0) {
		if (Class656.method32927(2029712197)) {
			Class474.aClass136_5 = Class474.aProcess1.exitValue() == 0 ? Class136.aClass136_3 : Class136.aClass136_4;
			Class474.aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!alv", name = "<init>", descriptor = "(IIIIIIZZI)V")
	Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		super(arg0, arg1, arg2 > 65535 ? 65535 : arg2, arg3, arg4 > 255 ? 255 : arg4, arg5, arg6, arg7, arg8 > 255 ? 255 : arg8);
	}

	@OriginalMember(owner = "client!alv", name = "e", descriptor = "(I)V")
	@Override
	public void method32076(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_125, client.aClass175_2.aClass24_2, (byte) 58);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2005 * 1246034961, (byte) -7);
		@Pc(27) int local27 = (this.aBoolean362 ? 2 : 0) | (this.aBoolean361 ? 1 : 0);
		local5.aClass93_Sub41_Sub2_1.method22459(local27, -852948596);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2009 * -2001831323, (byte) -12);
		local5.aClass93_Sub41_Sub2_1.method22602(this.anInt2007 * 684378299, (byte) 32);
		local5.aClass93_Sub41_Sub2_1.method22522(this.anInt2008 * -549711223, (byte) -45);
		local5.aClass93_Sub41_Sub2_1.method22479(this.anInt2011 * 1745723939, (byte) -23);
		local5.aClass93_Sub41_Sub2_1.method22477(this.anInt2006 * 975184085, 907143239);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2010 * -260736217, (byte) -67);
		client.aClass175_2.method24363(local5, -2114396153);
	}

	@OriginalMember(owner = "client!alv", name = "n", descriptor = "()V")
	@Override
	public void method32075() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_125, client.aClass175_2.aClass24_2, (byte) 20);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2005 * 1246034961, (byte) -58);
		@Pc(27) int local27 = (this.aBoolean362 ? 2 : 0) | (this.aBoolean361 ? 1 : 0);
		local5.aClass93_Sub41_Sub2_1.method22459(local27, 2018704071);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2009 * -2001831323, (byte) -84);
		local5.aClass93_Sub41_Sub2_1.method22602(this.anInt2007 * 684378299, (byte) -46);
		local5.aClass93_Sub41_Sub2_1.method22522(this.anInt2008 * -549711223, (byte) -54);
		local5.aClass93_Sub41_Sub2_1.method22479(this.anInt2011 * 1745723939, (byte) -114);
		local5.aClass93_Sub41_Sub2_1.method22477(this.anInt2006 * 975184085, 907143239);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2010 * -260736217, (byte) -101);
		client.aClass175_2.method24363(local5, -2033959323);
	}

	@OriginalMember(owner = "client!alv", name = "m", descriptor = "()V")
	@Override
	public void method32077() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_125, client.aClass175_2.aClass24_2, (byte) 53);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2005 * 1246034961, (byte) -18);
		@Pc(27) int local27 = (this.aBoolean362 ? 2 : 0) | (this.aBoolean361 ? 1 : 0);
		local5.aClass93_Sub41_Sub2_1.method22459(local27, -1579338520);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2009 * -2001831323, (byte) -99);
		local5.aClass93_Sub41_Sub2_1.method22602(this.anInt2007 * 684378299, (byte) 25);
		local5.aClass93_Sub41_Sub2_1.method22522(this.anInt2008 * -549711223, (byte) -112);
		local5.aClass93_Sub41_Sub2_1.method22479(this.anInt2011 * 1745723939, (byte) -21);
		local5.aClass93_Sub41_Sub2_1.method22477(this.anInt2006 * 975184085, 907143239);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2010 * -260736217, (byte) -108);
		client.aClass175_2.method24363(local5, -1855863095);
	}

	@OriginalMember(owner = "client!alv", name = "k", descriptor = "()V")
	@Override
	public void method32078() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_125, client.aClass175_2.aClass24_2, (byte) 20);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2005 * 1246034961, (byte) -6);
		@Pc(27) int local27 = (this.aBoolean362 ? 2 : 0) | (this.aBoolean361 ? 1 : 0);
		local5.aClass93_Sub41_Sub2_1.method22459(local27, -291878256);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2009 * -2001831323, (byte) -53);
		local5.aClass93_Sub41_Sub2_1.method22602(this.anInt2007 * 684378299, (byte) -87);
		local5.aClass93_Sub41_Sub2_1.method22522(this.anInt2008 * -549711223, (byte) -123);
		local5.aClass93_Sub41_Sub2_1.method22479(this.anInt2011 * 1745723939, (byte) -83);
		local5.aClass93_Sub41_Sub2_1.method22477(this.anInt2006 * 975184085, 907143239);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2010 * -260736217, (byte) -28);
		client.aClass175_2.method24363(local5, -1932758516);
	}

	@OriginalMember(owner = "client!alv", name = "f", descriptor = "()V")
	@Override
	public void method32079() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_125, client.aClass175_2.aClass24_2, (byte) 81);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2005 * 1246034961, (byte) -93);
		@Pc(27) int local27 = (this.aBoolean362 ? 2 : 0) | (this.aBoolean361 ? 1 : 0);
		local5.aClass93_Sub41_Sub2_1.method22459(local27, 867132250);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2009 * -2001831323, (byte) -72);
		local5.aClass93_Sub41_Sub2_1.method22602(this.anInt2007 * 684378299, (byte) 24);
		local5.aClass93_Sub41_Sub2_1.method22522(this.anInt2008 * -549711223, (byte) -59);
		local5.aClass93_Sub41_Sub2_1.method22479(this.anInt2011 * 1745723939, (byte) -65);
		local5.aClass93_Sub41_Sub2_1.method22477(this.anInt2006 * 975184085, 907143239);
		local5.aClass93_Sub41_Sub2_1.method22460(this.anInt2010 * -260736217, (byte) -117);
		client.aClass175_2.method24363(local5, -1910227286);
	}
}
