package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public class Class332 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!ib;")
	public static final Class332 aClass332_6 = new Class332(0, 104);

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!ib;")
	static final Class332 aClass332_2 = new Class332(1, 120);

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!ib;")
	static final Class332 aClass332_3 = new Class332(2, 136);

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!ib;")
	static final Class332 aClass332_5 = new Class332(3, 168);

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!ib;")
	static final Class332 aClass332_4 = new Class332(4, 72);

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!ib;")
	static final Class332 aClass332_1 = new Class332(5, 256);

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public final int anInt4147;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	public final int anInt4148;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V", line = 18)
	Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4147 = arg0 * -514067987;
		this.anInt4148 = arg1 * -199949377;
	}

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(I)Lclient!ib;", line = 25)
	public static Class332 method27387(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method15962(-767537114);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4147 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Lclient!ib;", line = 25)
	public static Class332 method27388(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method15962(-1145668119);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4147 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)Lclient!ib;", line = 25)
	public static Class332 method27389(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method15962(-1121487001);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4147 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "(I)Lclient!ib;", line = 25)
	public static Class332 method27390(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method15962(1406667206);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4147 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(Lclient!ov;I)F", line = 36)
	public static float method27391(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29544();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!ib", name = "fs", descriptor = "(Lclient!yf;B)V", line = 5876)
	static final void method27392(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 2009938100);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class104.method20524(local16, local22, arg0, (byte) 70);
	}

	@OriginalMember(owner = "client!ib", name = "ps", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7783)
	static final void method27393(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray39 = Class499.method30149(local13, arg2, -1104938487);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ib", name = "ms", descriptor = "(Lclient!ax;I)V", line = 12492)
	static void method27394(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) ClientMessage local5 = Class102.createGameMessage(ClientProt.aClientProt_82, arg0.clientIsaac, (byte) 93);
		arg0.send(local5, -1462283660);
		client.aBoolean636 = true;
	}

	@OriginalMember(owner = "client!ib", name = "aql", descriptor = "(Lclient!yf;B)V", line = 12893)
	static final void method27395(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ib", name = "bae", descriptor = "(Lclient!yf;I)V", line = 14305)
	static final void method27396(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub14_1.method16546(local12, -69207239);
	}
}
