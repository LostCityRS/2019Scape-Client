package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vz")
public class Class629 {

	@OriginalMember(owner = "client!vz", name = "af", descriptor = "I")
	static int anInt5710;

	@OriginalMember(owner = "client!vz", name = "m", descriptor = "Lclient!oe;")
	public Class458 aClass458_90;

	@OriginalMember(owner = "client!vz", name = "e", descriptor = "I")
	public int anInt5708;

	@OriginalMember(owner = "client!vz", name = "n", descriptor = "I")
	public int anInt5709;

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Lclient!alw;)V", line = 12)
	public Class629(@OriginalArg(0) Packet arg0) {
		this(arg0, false);
	}

	@OriginalMember(owner = "client!vz", name = "e", descriptor = "(Lclient!aae;I)[Lclient!aal;", line = 15)
	public static Class14[] method32258(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int[] local3 = arg0.method107(1267716299);
		@Pc(9) Class14[] local9 = new Class14[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class14 local19 = new Class14();
			local9[local11] = local19;
			local19.anInt49 = local3[local11 << 2] * -1388586527;
			local19.anInt50 = local3[(local11 << 2) + 1] * 1657036197;
			local19.anInt51 = local3[(local11 << 2) + 2] * 1795833325;
			local19.anInt48 = local3[(local11 << 2) + 3] * 607772171;
		}
		return local9;
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Lclient!alw;Z)V", line = 16)
	Class629(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		this(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Lclient!alw;IZ)V", line = 20)
	public Class629(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this(arg0, arg1, arg2, true);
	}

	@OriginalMember(owner = "client!vz", name = "e", descriptor = "(Lclient!py;Lclient!py;B)V", line = 23)
	public static void method32259(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) byte arg2) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Lclient!alw;ZZ)V", line = 24)
	Class629(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this(arg0, arg0.g1((short) 16384), arg1, arg2);
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Lclient!alw;IZZ)V", line = 27)
	Class629(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) boolean local9 = (arg1 & 0x80) != 0;
		if (arg2) {
			@Pc(32) int local32 = arg0.g1((short) 16384);
			this.anInt5709 = (arg1 & 0x7F) * -660936573;
			this.anInt5708 = local32 * 272635745;
		} else {
			this.anInt5709 = (arg1 >> 2 & 0x1F) * -660936573;
			this.anInt5708 = (arg1 & 0x3) * 272635745;
		}
		this.aClass458_90 = null;
		if (local9) {
			this.aClass458_90 = new Class458(arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!vz", name = "jm", descriptor = "(Lclient!yf;B)V", line = 6657)
	static final void method32260(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!vz", name = "nb", descriptor = "(Lclient!yf;B)V", line = 7392)
	static final void method32261(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class110_Sub3.method7101(local11, local14, arg0, 585391368);
	}

	@OriginalMember(owner = "client!vz", name = "akn", descriptor = "(Lclient!yf;B)V", line = 11510)
	static final void method32262(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159.anInt1915 + Class93_Sub14.anInt1527 * -1951188017;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159.anInt1921 + Class159_Sub1.anInt1952 * -1606693775;
	}

	@OriginalMember(owner = "client!vz", name = "ann", descriptor = "(Lclient!yf;I)V", line = 12182)
	static final void method32263(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class312.method26923((byte) -115);
	}

	@OriginalMember(owner = "client!vz", name = "lz", descriptor = "(Lclient!hf;I)Ljava/lang/String;", line = 12303)
	static String method32264(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		if (client.method25364(arg0).method13627((short) -8840) == 0) {
			return null;
		} else if (arg0.aString166 == null || arg0.aString166.trim().length() == 0) {
			return client.aBoolean615 ? "Hidden-use" : null;
		} else {
			return arg0.aString166;
		}
	}

	@OriginalMember(owner = "client!vz", name = "aqi", descriptor = "(Lclient!yf;I)V", line = 12863)
	static final void method32265(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
