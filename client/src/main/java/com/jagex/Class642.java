package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public class Class642 implements Interface75 {

	@OriginalMember(owner = "client!wo", name = "qb", descriptor = "[Lclient!hf;")
	static Class312[] aClass312Array5;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Lclient!wo;")
	static final Class642 aClass642_6 = new Class642(0);

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Lclient!wo;")
	static final Class642 aClass642_2 = new Class642(1);

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Lclient!wo;")
	static final Class642 aClass642_3 = new Class642(2);

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "Lclient!wo;")
	static final Class642 aClass642_4 = new Class642(3);

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "Lclient!wo;")
	static final Class642 aClass642_5 = new Class642(4);

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "Lclient!wo;")
	static final Class642 aClass642_1 = new Class642(5);

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	final int anInt5757;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "()[Lclient!wo;", line = 17)
	public static Class642[] method32514() {
		return new Class642[] { aClass642_2, aClass642_6, aClass642_5, aClass642_4, aClass642_1, aClass642_3 };
	}

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "()[Lclient!wo;", line = 17)
	public static Class642[] method32515() {
		return new Class642[] { aClass642_2, aClass642_6, aClass642_5, aClass642_4, aClass642_1, aClass642_3 };
	}

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "()[Lclient!wo;", line = 17)
	public static Class642[] method32516() {
		return new Class642[] { aClass642_2, aClass642_6, aClass642_5, aClass642_4, aClass642_1, aClass642_3 };
	}

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "()[Lclient!wo;", line = 17)
	public static Class642[] method32517() {
		return new Class642[] { aClass642_2, aClass642_6, aClass642_5, aClass642_4, aClass642_1, aClass642_3 };
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V", line = 20)
	Class642(@OriginalArg(0) int arg0) {
		this.anInt5757 = arg0 * -183361125;
	}

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "()I", line = 25)
	@Override
	public int getId() {
		return this.anInt5757 * -986096493;
	}

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "()I", line = 25)
	@Override
	public int method36919() {
		return this.anInt5757 * -986096493;
	}

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "(B)V", line = 254)
	public static void method32518(@OriginalArg(0) byte arg0) {
		Class51.options.method14363(Class51.options.aClass166_Sub15_1, 2, (byte) 24);
		Class51.options.method14363(Class51.options.aClass166_Sub15_2, 2, (byte) 48);
		Class51.options.method14363(Class51.options.aClass166_Sub3_1, 1, (byte) 116);
		Class51.options.method14363(Class51.options.aClass166_Sub46_1, 1, (byte) 123);
		Class51.options.method14363(Class51.options.aClass166_Sub36_1, 1, (byte) 27);
		Class51.options.method14363(Class51.options.aClass166_Sub25_1, 1, (byte) 53);
		Class51.options.method14363(Class51.options.aClass166_Sub21_1, 1, (byte) 42);
		Class51.options.method14363(Class51.options.aClass166_Sub14_1, 1, (byte) 83);
		Class51.options.method14363(Class51.options.aClass166_Sub8_1, 2, (byte) 46);
		Class51.options.method14363(Class51.options.aClass166_Sub19_1, 1, (byte) 93);
		Class51.options.method14363(Class51.options.aClass166_Sub20_1, 2, (byte) 7);
		Class51.options.method14363(Class51.options.aClass166_Sub2_1, 1, (byte) 64);
		Class51.options.method14363(Class51.options.aClass166_Sub39_2, 0, (byte) 74);
		Class51.options.method14363(Class51.options.antialiasing, 0, (byte) 7);
		Class51.options.method14363(Class51.options.aClass166_Sub6_1, 2, (byte) 47);
		Class51.options.method14363(Class51.options.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 73);
		Class51.options.method14363(Class51.options.aClass166_Sub28_1, 0, (byte) 20);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.options.method14363(Class51.options.aClass166_Sub29_1, 1, (byte) 27);
		Class51.options.method14363(Class51.options.aClass166_Sub31_1, 1, (byte) 7);
		Class386.method28235((byte) -83);
		Class51.options.method14363(Class51.options.aClass166_Sub24_1, 0, (byte) 82);
		Class51.options.method14363(Class51.options.aClass166_Sub40_1, 4, (byte) 78);
		Class610.method32020(-1918309609);
		client.world.method30494((byte) 33).method33015(1628233714);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!wo", name = "ex", descriptor = "(IZI)Z", line = 971)
	public static boolean method32519(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == Class159_Sub1.anInt1954 * -1423765151) {
			Class159_Sub1.aBoolean357 = arg1;
		} else if (Class159_Sub1.anInt1945 * -1301134369 == arg0) {
			Class159_Sub1.aBoolean350 = arg1;
		} else if (Class159_Sub1.anInt1957 * 778360671 == arg0) {
			Class159_Sub1.aBoolean349 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "fp", descriptor = "(ZS)V", line = 2557)
	public static final void logout(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		@Pc(1) Class175[] local1 = client.aClass175Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class175 local11 = local1[local3];
			try {
				local11.flush((byte) 95);
			} catch (@Pc(16) IOException local16) {
			}
			local11.close((byte) 123);
		}
		Class594.method31724(1244534845);
		Class12.method186(-1516713678);
		Class700.method36716(false, (byte) 5);
		client.world.method30518((byte) 66);
		client.world.method30516((byte) -91);
		client.world.method30524(-1602017739);
		Class47.method905((byte) -101);
		Class310.method26831(-1797323310);
		Class707.method36750(true, (byte) 1);
		Class431.method28776((byte) 72);
		Class634.method32319(8457347);
		client.selfPlayerSlot = 410368243;
		if (arg0) {
			Class481.setState(9, 1823202236);
			return;
		}
		Class481.setState(4, 1823202236);
		try {
			Class70.method1237(Class32_Sub10.applet, "loggedout", 1752346842);
		} catch (@Pc(66) Throwable local66) {
		}
	}

	@OriginalMember(owner = "client!wo", name = "jr", descriptor = "(Lclient!yf;B)V", line = 6665)
	static final void method32521(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!wo", name = "of", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7595)
	static final void method32522(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray11 = Class499.method30149(local13, arg2, 1638720166);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!wo", name = "ako", descriptor = "(Lclient!yf;B)V", line = 11515)
	static final void method32523(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class159.method14520(local12);
		if (local15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3163 * -1598154945;
		}
	}

	@OriginalMember(owner = "client!wo", name = "asx", descriptor = "(Lclient!yf;B)V", line = 13223)
	static final void method32524(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 != Class51.options.aClass166_Sub31_1.method16114((short) 8834)) {
			Class51.options.method14363(Class51.options.aClass166_Sub31_1, local12, (byte) 40);
			Class106_Sub1.method5135(1350256755);
			client.aBoolean601 = false;
			client.world.method30533((byte) 0);
		}
	}
}
