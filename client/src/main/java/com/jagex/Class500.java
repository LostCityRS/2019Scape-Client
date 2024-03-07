package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public class Class500 implements Interface75 {

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!qa;")
	public static final Class500 aClass500_6 = new Class500(2, 0, Integer.class, new Class505());

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!qa;")
	public static final Class500 aClass500_3 = new Class500(4, 1, Long.class, new Class515());

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!qa;")
	public static final Class500 aClass500_2 = new Class500(1, 2, String.class, new Class504());

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!qa;")
	static final Class500 aClass500_5 = new Class500(0, 3, Class93_Sub30.class, new Class510());

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!qa;")
	static final Class500 aClass500_4 = new Class500(3, 4, Class321.class, new Class512());

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public final int anInt5196;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	final int anInt5197;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Ljava/lang/Class;")
	public final Class aClass2;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!ade;")
	final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)[Lclient!qa;", line = 44)
	public static Class500[] method30156(@OriginalArg(0) int arg0) {
		return new Class500[] { aClass500_5, aClass500_4, aClass500_2, aClass500_6, aClass500_3 };
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IILjava/lang/Class;Lclient!ade;)V", line = 47)
	Class500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Interface9 arg3) {
		this.anInt5196 = arg0 * -928613997;
		this.anInt5197 = arg1 * -568068317;
		this.aClass2 = arg2;
		this.anInterface9_1 = arg3;
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Ljava/lang/Class;I)Lclient!qa;", line = 56)
	static Class500 method30157(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class500[] local2 = method30156(-1834477791);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class500 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(Ljava/lang/Class;)Lclient!qa;", line = 56)
	static Class500 method30158(@OriginalArg(0) Class arg0) {
		@Pc(2) Class500[] local2 = method30156(-1802498777);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class500 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "(Ljava/lang/Class;)Lclient!qa;", line = 56)
	static Class500 method30159(@OriginalArg(0) Class arg0) {
		@Pc(2) Class500[] local2 = method30156(-2022207499);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class500 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(Ljava/lang/Class;I)Lclient!ade;", line = 68)
	public static Interface9 method30160(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class500 local3 = method30157(arg0, 513196918);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface9_1;
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "(Ljava/lang/Class;)Lclient!ade;", line = 68)
	public static Interface9 method30161(@OriginalArg(0) Class arg0) {
		@Pc(3) Class500 local3 = method30157(arg0, -44876368);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface9_1;
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(Ljava/lang/Class;)Lclient!ade;", line = 68)
	public static Interface9 method30162(@OriginalArg(0) Class arg0) {
		@Pc(3) Class500 local3 = method30157(arg0, 1739346658);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface9_1;
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()I", line = 74)
	@Override
	public int getId() {
		return this.anInt5197 * 983101579;
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()I", line = 74)
	@Override
	public int method36919() {
		return this.anInt5197 * 983101579;
	}

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "(Lclient!alw;B)Ljava/lang/Object;", line = 78)
	public Object method30163(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		return this.anInterface9_1.method30272(arg0, -1187347627);
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(Lclient!yf;I)V", line = 79)
	static void method30164(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class497.method30103(local13, 1683602857);
	}

	@OriginalMember(owner = "client!qa", name = "vn", descriptor = "(Lclient!yf;S)V", line = 8898)
	static final void method30165(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(19) ClientMessage local19 = Class102.createGameMessage(ClientProt.aClientProt_112, client.aClass175_2.clientIsaac, (byte) 71);
		local19.packet.p1(local13.length() + 1, (byte) -74);
		local19.packet.pjstr(local13, -288853937);
		client.aClass175_2.send(local19, -1861149337);
	}

	@OriginalMember(owner = "client!qa", name = "aio", descriptor = "(Lclient!yf;B)V", line = 11255)
	static final void method30166(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(17) Class93_Sub1_Sub14 local17 = Class687.aClass514_1.method30267(local12, (byte) -105);
		if (local17.anIntArray261 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.anIntArray261.length;
		}
	}

	@OriginalMember(owner = "client!qa", name = "kt", descriptor = "(Ljava/lang/String;I)I", line = 11974)
	public static final int method30167(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3444 * 862418793; local5++) {
			if (arg0.equalsIgnoreCase(client.aClass281Array1[local5].aString153)) {
				return local5;
			}
		}
		return -1;
	}
}
