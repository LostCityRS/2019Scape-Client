package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class322 implements Interface75 {

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!hq;")
	public static final Class322 aClass322_1 = new Class322(4, 0);

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Lclient!hq;")
	public static final Class322 aClass322_2 = new Class322(2, 1);

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "Lclient!hq;")
	public static final Class322 aClass322_3 = new Class322(0, 2);

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "Lclient!hq;")
	public static final Class322 aClass322_6 = new Class322(5, 3);

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Lclient!hq;")
	public static final Class322 aClass322_4 = new Class322(1, 4);

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!hq;")
	public static final Class322 aClass322_5 = new Class322(3, 5);

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
	public final int anInt4065;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	final int anInt4064;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(Lclient!hx;IIS)V")
	static void method27601(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		if (client.aBoolean728) {
			@Pc(16) Class79 local16 = (Class79) (Class34.anInt107 * -968124561 == -1 ? null : Class370.aClass41_Sub10_1.method18054(Class34.anInt107 * -968124561, 1972986968));
			if (client.method25326(arg0).method14316((byte) 0) && (Class542.anInt5121 * -1641097909 & 0x20) != 0 && (local16 == null || arg0.method27648(Class34.anInt107 * -968124561, local16.anInt253 * 680817871, 276594188) != local16.anInt253 * 680817871)) {
				Class360.method28144(client.aString149, client.aString146 + " " + Class256.aString158 + " " + arg0.aString184, Class107_Sub1.anInt682 * 582850143, 58, arg0.anInt4167 * 1052460537, 0L, arg0.anInt4094 * 2071556223, arg0.anInt4087 * -2053489901, true, false, (long) (arg0.anInt4094 * 2071556223 << 0 | arg0.anInt4087 * -2053489901), false, (byte) 92);
			}
		}
		for (@Pc(96) int local96 = 9; local96 >= 5; local96--) {
			@Pc(104) String local104 = Class166.method16975(arg0, local96, -1718837460);
			if (local104 != null) {
				Class360.method28144(local104, arg0.aString184, Class284.method26889(arg0, local96, (byte) 91), 1007, arg0.anInt4167 * 1052460537, (long) (local96 + 1), arg0.anInt4094 * 2071556223, arg0.anInt4087 * -2053489901, true, false, (long) (arg0.anInt4094 * 2071556223 << 0 | arg0.anInt4087 * -2053489901), false, (byte) 94);
			}
		}
		@Pc(154) String local154 = Class669.method33496(arg0, -1040851283);
		if (local154 != null) {
			Class360.method28144(local154, arg0.aString184, arg0.anInt4157 * 1664140467, 25, arg0.anInt4167 * 1052460537, 0L, arg0.anInt4094 * 2071556223, arg0.anInt4087 * -2053489901, true, false, (long) (arg0.anInt4094 * 2071556223 << 0 | arg0.anInt4087 * -2053489901), false, (byte) 53);
		}
		for (@Pc(196) int local196 = 4; local196 >= 0; local196--) {
			@Pc(203) String local203 = Class166.method16975(arg0, local196, -1718837460);
			if (local203 != null) {
				Class360.method28144(local203, arg0.aString184, Class284.method26889(arg0, local196, (byte) 42), 57, arg0.anInt4167 * 1052460537, (long) (local196 + 1), arg0.anInt4094 * 2071556223, arg0.anInt4087 * -2053489901, true, false, (long) (arg0.anInt4094 * 2071556223 << 0 | arg0.anInt4087 * -2053489901), false, (byte) 87);
			}
		}
		if (!client.method25326(arg0).method14312(1852438240)) {
			return;
		}
		if (arg0.aString185 == null) {
			Class360.method28144(Class60.aClass60_18.method1180(Class512.aClass719_3, -1736116310), "", -1, 30, arg0.anInt4167 * 1052460537, 0L, arg0.anInt4094 * 2071556223, arg0.anInt4087 * -2053489901, true, false, (long) (arg0.anInt4094 * 2071556223 << 0 | arg0.anInt4087 * -2053489901), false, (byte) 78);
		} else {
			Class360.method28144(arg0.aString185, "", -1, 30, arg0.anInt4167 * 1052460537, 0L, arg0.anInt4094 * 2071556223, arg0.anInt4087 * -2053489901, true, false, (long) (arg0.anInt4094 * 2071556223 << 0 | arg0.anInt4087 * -2053489901), false, (byte) 69);
		}
	}

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "(I)V")
	public static void method27602(@OriginalArg(0) int arg0) {
		if (Class664.method33363(-404749413)) {
			Class676.method33588(new Class663(), 649787722);
		}
	}

	@OriginalMember(owner = "client!hq", name = "mh", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method27603(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1661023236) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray14 = Class431.method29089(local13, arg2, 1211707568);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!hq", name = "qb", descriptor = "(Lclient!yp;I)V")
	static void method27604(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class665.method33452(local11, local14, arg0, -202703219);
	}

	@OriginalMember(owner = "client!hq", name = "alj", descriptor = "(Lclient!yp;I)V")
	static void method27605(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class346.anInt4250 * 956969065;
		@Pc(7) int local7 = Class269.anInt3918 * -1948970357;
		@Pc(9) int local9 = -1;
		if (Class13.aBoolean5) {
			@Pc(14) Class26[] local14 = Class596.method31996(1656871682);
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(24) Class26 local24 = local14[local16];
				if (local3 == local24.anInt81 * -1249901293 && local24.anInt80 * -2004120797 == local7) {
					local9 = local16;
					break;
				}
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local9;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(II)V")
	Class322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4065 = arg0 * 624498179;
		this.anInt4064 = arg1 * -1706620973;
	}

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4064 * -686561189;
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt4064 * -686561189;
	}

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4064 * -686561189;
	}
}
