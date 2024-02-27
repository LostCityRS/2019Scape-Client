package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class325 {

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "Lclient!zr;")
	static Class715 aClass715_1;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Ljava/lang/String;")
	String aString182;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Lclient!ht;")
	Class323 aClass323_132;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "Ljava/lang/String;")
	String aString183;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "[I")
	public int[] anIntArray406;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Lclient!ht;")
	Class323 aClass323_133;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "[I")
	public int[] anIntArray407;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
	int anInt4179 = 592418195;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "(II)V")
	public static void method27392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Class663.anInt5998 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray338[Class663.anInt5998 * 763077233] + 1];
		Class663.anInt5993 = 0;
		Class663.anInt5992 = 0;
	}

	@OriginalMember(owner = "client!hv", name = "afr", descriptor = "(Lclient!yf;I)V")
	static void method27393(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anInt6052 -= -1915563430;
		@Pc(27) int local27 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(43) Class5 local43 = Class157.aClass462_2.method29422(client.anInterface50_1, local37, -1874981454);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local43.method55(local13, local27, Class110_Sub14.aClass100Array4, -1910907678);
	}

	@OriginalMember(owner = "client!hv", name = "aqx", descriptor = "(Lclient!yf;I)V")
	static void method27394(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!hv", name = "lk", descriptor = "(Ljava/lang/String;ZB)I")
	public static int method27395(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class143_Sub1.anIntArray158 = null;
		Class155.anInt2066 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = local20 + (arg1 ? Class372.aClass58_2.anInt227 * 2069221553 : Class372.aClass58_2.anInt226 * 2099043927);
		@Pc(36) int local36;
		for (local36 = local20; local36 < local34; local36++) {
			@Pc(44) Class93_Sub1_Sub18 local44 = Class372.aClass58_2.method1097(local36, -737304293);
			if (local44.aBoolean514 && local44.method22959(-1491104235).toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 50) {
					return -1;
				}
				local10.add(local36);
				local14.add(local44.method22959(-1491104235));
			}
		}
		Class143_Sub1.anIntArray158 = new int[local10.size()];
		local36 = 0;
		@Pc(85) Iterator local85 = local10.iterator();
		while (local85.hasNext()) {
			@Pc(92) Integer local92 = (Integer) local85.next();
			Class143_Sub1.anIntArray158[local36++] = local92;
		}
		@Pc(107) String[] local107 = (String[]) local14.toArray(new String[Class143_Sub1.anIntArray158.length]);
		Class118.method8414(local107, Class143_Sub1.anIntArray158, 731346989);
		return local10.size();
	}

	@OriginalMember(owner = "client!hv", name = "td", descriptor = "(Lclient!yf;I)V")
	static void method27396(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -666873988);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4022 * 1215292027;
	}

	@OriginalMember(owner = "client!hv", name = "vh", descriptor = "(Lclient!yf;B)V")
	static void method27397(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class335.method27502((String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375], -1287941740);
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	Class325() {
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(Lclient!hw;I)V")
	void method27389(@OriginalArg(0) Class326 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method27399(2111968903);
		this.aClass323_133 = Class449.method29111(379945710)[local3];
		@Pc(17) int local17;
		if (Class323.aClass323_9 == this.aClass323_133) {
			local17 = arg0.method27399(4220749);
			this.aClass323_132 = Class449.method29111(1869537355)[local17];
			this.anInt4179 = arg0.method27399(-10506204) * -592418195;
		}
		this.aString182 = arg0.method27400(729817088);
		this.aString183 = arg0.method27400(2050694886);
		local17 = arg0.method27399(1774332947);
		this.anIntArray406 = new int[local17];
		this.anIntArray407 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray406[local54] = arg0.method27399(1925979308);
			this.anIntArray407[local54] = arg0.method27399(760590409);
		}
	}

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "(Lclient!hw;)V")
	void method27390(@OriginalArg(0) Class326 arg0) {
		@Pc(3) int local3 = arg0.method27399(1827444776);
		this.aClass323_133 = Class449.method29111(883563858)[local3];
		@Pc(17) int local17;
		if (Class323.aClass323_9 == this.aClass323_133) {
			local17 = arg0.method27399(492955076);
			this.aClass323_132 = Class449.method29111(1598590006)[local17];
			this.anInt4179 = arg0.method27399(191215798) * -592418195;
		}
		this.aString182 = arg0.method27400(-1485007811);
		this.aString183 = arg0.method27400(-605603775);
		local17 = arg0.method27399(1824383204);
		this.anIntArray406 = new int[local17];
		this.anIntArray407 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray406[local54] = arg0.method27399(1757704821);
			this.anIntArray407[local54] = arg0.method27399(1613179921);
		}
	}

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "(Lclient!hw;)V")
	void method27391(@OriginalArg(0) Class326 arg0) {
		@Pc(3) int local3 = arg0.method27399(1981299989);
		this.aClass323_133 = Class449.method29111(339649391)[local3];
		@Pc(17) int local17;
		if (Class323.aClass323_9 == this.aClass323_133) {
			local17 = arg0.method27399(1625307413);
			this.aClass323_132 = Class449.method29111(1794091978)[local17];
			this.anInt4179 = arg0.method27399(1129541645) * -592418195;
		}
		this.aString182 = arg0.method27400(-2088652371);
		this.aString183 = arg0.method27400(-228685974);
		local17 = arg0.method27399(1358335381);
		this.anIntArray406 = new int[local17];
		this.anIntArray407 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray406[local54] = arg0.method27399(4210160);
			this.anIntArray407[local54] = arg0.method27399(935821596);
		}
	}
}
