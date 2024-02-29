package com.jagex;

import java.io.IOException;
import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
class Class247 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!el", name = "this$0", descriptor = "Lclient!aiw;")
	final Class146_Sub1 this$0;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!aiw;)V", line = 124)
	Class247(@OriginalArg(0) Class146_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(Lclient!rq;Lclient!rq;I)I", line = 126)
	int method25907(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) float local3 = arg0.method30681(-1732592269);
		@Pc(7) float local7 = arg1.method30681(85290336);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!el", name = "n", descriptor = "(Lclient!rq;Lclient!rq;)I", line = 126)
	int method25908(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1) {
		@Pc(3) float local3 = arg0.method30681(-1301690363);
		@Pc(7) float local7 = arg1.method30681(-1888685235);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!el", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25907((Class535) arg0, (Class535) arg1, -866247073);
	}

	@OriginalMember(owner = "client!el", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method25909(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25907((Class535) arg0, (Class535) arg1, -866247073);
	}

	@OriginalMember(owner = "client!el", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25910(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25911(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25912(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25913(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "af", descriptor = "(Lclient!yf;B)V", line = 5068)
	static final void method25914(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.aLongArray27[(arg0.anInt5894 += -1364417339) * -2000995827 - 1] = arg0.aLongArray26[arg0.anIntArray520[arg0.anInt5889 * -709694321]];
	}

	@OriginalMember(owner = "client!el", name = "if", descriptor = "(Lclient!ax;I)Z", line = 6375)
	static final boolean method25915(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1) {
		try {
			return Class696.method36645(arg0, (byte) -8);
		} catch (@Pc(4) IOException local4) {
			if (client.anInt3435 * -849002901 == 15) {
				arg0.method24368((byte) 95);
				return false;
			} else {
				Class565.method31252(-2066387364);
				return true;
			}
		} catch (@Pc(19) Exception local19) {
			@Pc(23) Class611 local23 = client.aClass532_1.method30455(1828891152);
			@Pc(99) String local99 = (arg0.aClass453_2 == null ? -1 : arg0.aClass453_2.anInt5034 * 1430738181) + Class430.aString204 + (arg0.aClass453_4 == null ? -1 : arg0.aClass453_4.anInt5034 * 1430738181) + Class430.aString204 + (arg0.aClass453_3 == null ? -1 : arg0.aClass453_3.anInt5034 * 1430738181) + " " + arg0.anInt3301 * 2010044839 + Class430.aString204 + (local23.anInt5623 * 270611681 + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0]) + Class430.aString204 + (local23.anInt5624 * -1994307635 + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0]) + " ";
			for (@Pc(101) int local101 = 0; local101 < arg0.anInt3301 * 2010044839 && local101 < 50; local101++) {
				local99 = local99 + arg0.aClass93_Sub41_Sub2_2.aByteArray58[local101] + Class430.aString204;
			}
			Class646.method32608(local99, local19, 1224473706);
			Class642.method32520(false, (short) 17862);
			return true;
		}
	}

	@OriginalMember(owner = "client!el", name = "kx", descriptor = "(Lclient!yf;S)V", line = 6788)
	static final void method25916(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 167649149);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class79.method1454(local16, local22, arg0, (byte) 13);
	}

	@OriginalMember(owner = "client!el", name = "lz", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7103)
	static final void method25917(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.method26892(1229657527);
	}

	@OriginalMember(owner = "client!el", name = "aej", descriptor = "(Lclient!yf;B)V", line = 10395)
	static final void method25918(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class300.method26717(local13, local23, local33, (byte) -13);
	}

	@OriginalMember(owner = "client!el", name = "auj", descriptor = "(Lclient!yf;B)V", line = 13345)
	static final void method25919(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16226(-374662973);
	}
}
