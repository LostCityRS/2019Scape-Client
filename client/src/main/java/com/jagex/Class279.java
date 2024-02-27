package com.jagex;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fy")
public final class Class279 {

	@OriginalMember(owner = "client!fy", name = "n", descriptor = "I")
	static final int anInt3930 = 8;

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "I")
	static final int anInt3931 = 40;

	@OriginalMember(owner = "client!fy", name = "tv", descriptor = "Lclient!kr;")
	public static Class386 aClass386_1;

	@OriginalMember(owner = "client!fy", name = "kd", descriptor = "I")
	static int anInt3933;

	@OriginalMember(owner = "client!fy", name = "m", descriptor = "Ljava/lang/Integer;")
	static final Integer anInteger1 = -1;

	@OriginalMember(owner = "client!fy", name = "k", descriptor = "I")
	public final int anInt3932;

	@OriginalMember(owner = "client!fy", name = "f", descriptor = "Ljava/util/List;")
	final List aList12;

	@OriginalMember(owner = "client!fy", name = "w", descriptor = "Ljava/util/List;")
	final List aList10;

	@OriginalMember(owner = "client!fy", name = "l", descriptor = "Ljava/util/List;")
	final List aList11;

	@OriginalMember(owner = "client!fy", name = "u", descriptor = "Ljava/util/List;")
	final List aList13;

	@OriginalMember(owner = "client!fy", name = "avj", descriptor = "(Lclient!yf;I)V")
	static void method26539(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!fy", name = "ic", descriptor = "(IB)V")
	static void method26540(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class93_Sub41_Sub2 local2 = client.aClass175_2.aClass93_Sub41_Sub2_2;
		while (local2.method22683(client.aClass175_2.anInt3301 * 2010044839, 1313572448) >= 15) {
			@Pc(17) int local17 = local2.method22701(15, 1227115599);
			if (local17 == 32767) {
				break;
			}
			@Pc(23) boolean local23 = false;
			@Pc(29) Class93_Sub15 local29 = (Class93_Sub15) client.aClass16_18.method215((long) local17);
			@Pc(38) Class132_Sub1_Sub1_Sub1_Sub1 local38;
			if (local29 == null) {
				local38 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30640(-2038432393));
				local38.anInt2768 = local17 * 171759809;
				local29 = new Class93_Sub15(local38);
				client.aClass16_18.method221(local29, (long) local17);
				client.aClass93_Sub15Array1[(client.anInt3488 += 436180911) * -1814159537 - 1] = local29;
				local23 = true;
			}
			local38 = (Class132_Sub1_Sub1_Sub1_Sub1) local29.anObject5;
			client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local17;
			local38.anInt2786 = client.anInt3445 * 848722373;
			if (local38.aClass336_1 != null && local38.aClass336_1.method27525((short) 12466)) {
				Class665.method33076(local38, 846198857);
			}
			@Pc(105) int local105 = local2.method22701(2, -833157368);
			@Pc(110) int local110 = local2.method22701(arg0, -833088547);
			if (local110 > (0x1 << arg0 - 1) - 1) {
				local110 -= 0x1 << arg0;
			}
			@Pc(130) int local130 = local2.method22701(1, 311787348);
			if (local130 == 1) {
				client.anIntArray306[(client.anInt3472 += -170330519) * 146012633 - 1] = local17;
			}
			local38.method18601((Class336) Class162.aClass32_Sub3_2.method18273(local2.method22701(15, -1414174684), 1358140749), 484412968);
			@Pc(161) int local161 = local2.method22701(1, -1125559557);
			@Pc(172) int local172 = local2.method22701(3, 1297161788) + 4 << 11 & 0x3FFF;
			@Pc(177) int local177 = local2.method22701(arg0, 59162484);
			if (local177 > (0x1 << arg0 - 1) - 1) {
				local177 -= 0x1 << arg0;
			}
			local38.method19973(local38.aClass336_1.anInt4195 * 447008399, -2142170693);
			local38.anInt2788 = (local38.aClass336_1.anInt4206 * 295553787 << 3) * 723489705;
			if (local23) {
				local38.method19964(local172, true, 1006106775);
			}
			local38.method18604(local105, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] + local177, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] + local110, local161 == 1, local38.method20009(-1066476941), (byte) -95);
			if (local38.aClass336_1.method27525((short) -2741)) {
				Class643.method32764(local38.aByte100, local38.anIntArray240[0], local38.anIntArray239[0], 0, null, local38, null, 694869299);
			}
			if (local23) {
				local38.method18600((byte) 0);
			}
		}
		local2.method22682(-1653671445);
	}

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;IIB)Lclient!dh;")
	public static Class104 method26541(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		return new Class104_Sub3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!fy", name = "eh", descriptor = "(II)V")
	public static void method26542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class355 local5 = (Class355) Class159_Sub1.aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class355();
		}
		local5.anInt4259 = Class159_Sub1.anInt1944 * -1043952585;
		local5.anInt4258 = Class159_Sub1.anInt1955 * -1400884413;
		Class159_Sub1.aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!fy", name = "<init>", descriptor = "(I)V")
	public Class279(@OriginalArg(0) int arg0) {
		this.anInt3932 = arg0 * 2067035095;
		this.aList12 = new ArrayList();
		this.aList10 = new ArrayList();
		this.aList11 = new ArrayList();
		this.aList13 = new ArrayList();
	}

	@OriginalMember(owner = "client!fy", name = "k", descriptor = "(IB)I")
	public int method26459(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "(B)I")
	public int method26460(@OriginalArg(0) byte arg0) {
		return this.aList12.size();
	}

	@OriginalMember(owner = "client!fy", name = "as", descriptor = "(I)I")
	public int method26461(@OriginalArg(0) int arg0) {
		return this.aList12.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "bo", descriptor = "(I)V")
	void method26462(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "by", descriptor = "(I)V")
	public void method26463(@OriginalArg(0) int arg0) {
		this.method26478(arg0, -525952582);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26469(local7, 1147325028)) {
				if (local7 != local5) {
					this.method26474(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "f", descriptor = "(II)I")
	public int method26464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aList12.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "w", descriptor = "(II)I")
	public int method26465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Integer) this.aList12.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "aq", descriptor = "(IZ)V")
	public void method26466(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "u", descriptor = "(IZI)V")
	public void method26467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "bf", descriptor = "(I)V")
	public void method26468(@OriginalArg(0) int arg0) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "p", descriptor = "(II)Z")
	public boolean method26469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return !((Integer) this.aList11.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "d", descriptor = "(III)I")
	public int method26470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList12.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26464(arg0, 867457263) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList12.size();
			}
			this.aList12.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList13.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "br", descriptor = "(II)V")
	public void method26471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.add(arg1, this.aList12.remove(arg0));
		@Pc(11) Iterator local11 = this.aList13.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fy", name = "r", descriptor = "(II)I")
	public int method26472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26475(arg0, -1, 1217577618);
	}

	@OriginalMember(owner = "client!fy", name = "g", descriptor = "()I")
	public int method26473() {
		return this.aList12.size();
	}

	@OriginalMember(owner = "client!fy", name = "o", descriptor = "(III)V")
	void method26474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList13.add(arg1, this.aList13.remove(arg0));
	}

	@OriginalMember(owner = "client!fy", name = "s", descriptor = "(III)I")
	public int method26475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26532(arg0, -1113809210) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26476(arg0, arg1, (byte) -9);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList11.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26474(local36, local36 - 1, -1931481788);
				}
			}
			return this.method26532(arg0, -1113809210);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "y", descriptor = "(IIB)V")
	void method26476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "q", descriptor = "(II)V")
	public void method26477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26478(arg0, 820726769);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26469(local7, -1180704314)) {
				if (local7 != local5) {
					this.method26474(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "x", descriptor = "(II)V")
	void method26478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "bl", descriptor = "(I)I")
	public int method26479(@OriginalArg(0) int arg0) {
		return this.method26475(arg0, -1, 1217577618);
	}

	@OriginalMember(owner = "client!fy", name = "h", descriptor = "(IIB)Ljava/lang/Object;")
	public Object method26480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "a", descriptor = "(IILjava/lang/Object;I)V")
	public void method26481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "bi", descriptor = "(II)V")
	void method26482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList13.add(arg1, this.aList13.remove(arg0));
	}

	@OriginalMember(owner = "client!fy", name = "am", descriptor = "(I)I")
	public int method26483(@OriginalArg(0) int arg0) {
		return this.method26470(arg0, -1, -1470029567);
	}

	@OriginalMember(owner = "client!fy", name = "j", descriptor = "()I")
	public int method26484() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "n", descriptor = "(I)I")
	public int method26485(@OriginalArg(0) int arg0) {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "ae", descriptor = "()I")
	public int method26486() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "ap", descriptor = "(I)I")
	public int method26487(@OriginalArg(0) int arg0) {
		return this.method26470(arg0, -1, -302036450);
	}

	@OriginalMember(owner = "client!fy", name = "ah", descriptor = "()I")
	public int method26488() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "al", descriptor = "(I)I")
	public int method26489(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "aa", descriptor = "(I)Z")
	public boolean method26490(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList11.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "ai", descriptor = "(I)I")
	public int method26491(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "aw", descriptor = "(I)I")
	public int method26492(@OriginalArg(0) int arg0) {
		return this.aList12.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "z", descriptor = "(III)V")
	public void method26493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList11.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fy", name = "l", descriptor = "(IB)I")
	public int method26494(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.method26470(arg0, -1, -1883426330);
	}

	@OriginalMember(owner = "client!fy", name = "ad", descriptor = "(I)I")
	public int method26495(@OriginalArg(0) int arg0) {
		return (Integer) this.aList12.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "c", descriptor = "(IB)V")
	public void method26496(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "au", descriptor = "(I)I")
	public int method26497(@OriginalArg(0) int arg0) {
		return this.method26470(arg0, -1, -1572244076);
	}

	@OriginalMember(owner = "client!fy", name = "ar", descriptor = "(I)I")
	public int method26498(@OriginalArg(0) int arg0) {
		return this.method26470(arg0, -1, -407489213);
	}

	@OriginalMember(owner = "client!fy", name = "v", descriptor = "(IIB)V")
	public void method26499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.method26474(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "ak", descriptor = "(I)V")
	public void method26500(@OriginalArg(0) int arg0) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "ax", descriptor = "(IZ)V")
	public void method26501(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "av", descriptor = "(IZ)V")
	public void method26502(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "ao", descriptor = "(IZ)V")
	public void method26503(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "bv", descriptor = "(II)V")
	public void method26504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.add(arg1, this.aList12.remove(arg0));
		@Pc(11) Iterator local11 = this.aList13.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fy", name = "ay", descriptor = "(II)V")
	public void method26505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fy", name = "ab", descriptor = "(II)V")
	public void method26506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fy", name = "az", descriptor = "(I)Z")
	public boolean method26507(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList11.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "aj", descriptor = "(IZ)V")
	public void method26508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "af", descriptor = "(II)I")
	public int method26509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList12.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26464(arg0, 867457263) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList12.size();
			}
			this.aList12.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList13.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "bz", descriptor = "(I)V")
	void method26510(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "an", descriptor = "(I)V")
	public void method26511(@OriginalArg(0) int arg0) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "bu", descriptor = "(I)V")
	public void method26512(@OriginalArg(0) int arg0) {
		this.method26478(arg0, 1350824717);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26469(local7, -1960117609)) {
				if (local7 != local5) {
					this.method26474(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bw", descriptor = "(I)V")
	void method26513(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "bk", descriptor = "(II)V")
	public void method26514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26474(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bh", descriptor = "(II)V")
	public void method26515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26474(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bx", descriptor = "(II)V")
	public void method26516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26474(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bs", descriptor = "(IILjava/lang/Object;)V")
	public void method26517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "bc", descriptor = "(II)V")
	public void method26518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26474(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "ac", descriptor = "(I)I")
	public int method26519(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "bn", descriptor = "(II)V")
	void method26520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList13.add(arg1, this.aList13.remove(arg0));
	}

	@OriginalMember(owner = "client!fy", name = "bt", descriptor = "(II)I")
	public int method26521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26532(arg0, -1113809210) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26476(arg0, arg1, (byte) -118);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList11.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26474(local36, local36 - 1, -1931481788);
				}
			}
			return this.method26532(arg0, -1113809210);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "bq", descriptor = "(II)V")
	void method26522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "bm", descriptor = "(II)V")
	void method26523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "bb", descriptor = "(II)V")
	void method26524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "be", descriptor = "(I)V")
	public void method26525(@OriginalArg(0) int arg0) {
		this.method26478(arg0, -1265046712);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26469(local7, 1739973156)) {
				if (local7 != local5) {
					this.method26474(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "ag", descriptor = "()I")
	public int method26526() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "i", descriptor = "()I")
	public int method26527() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "t", descriptor = "()I")
	public int method26528() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "bd", descriptor = "(II)V")
	public void method26529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26474(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "b", descriptor = "(III)V")
	public void method26530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList12.add(arg1, this.aList12.remove(arg0));
		@Pc(11) Iterator local11 = this.aList13.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fy", name = "at", descriptor = "(I)I")
	public int method26531(@OriginalArg(0) int arg0) {
		return (Integer) this.aList12.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "m", descriptor = "(II)I")
	public int method26532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "ba", descriptor = "(II)Ljava/lang/Object;")
	public Object method26533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "bp", descriptor = "(II)Ljava/lang/Object;")
	public Object method26534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "bj", descriptor = "(II)Ljava/lang/Object;")
	public Object method26535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "bg", descriptor = "(II)Ljava/lang/Object;")
	public Object method26536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "cl", descriptor = "(IILjava/lang/Object;)V")
	public void method26537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "cg", descriptor = "(IILjava/lang/Object;)V")
	public void method26538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}
}
