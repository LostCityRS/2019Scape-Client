package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class559 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	int anInt5490;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	int anInt5491;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	int anInt5492;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	int anInt5493;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Ljava/lang/String;")
	String aString235;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(Lclient!yf;I)V")
	static void method31307(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class440.method29031(local13, 1716106050);
	}

	@OriginalMember(owner = "client!sq", name = "rd", descriptor = "(Lclient!yf;I)V")
	static void method31308(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4034 * 969124391;
	}

	@OriginalMember(owner = "client!sq", name = "vs", descriptor = "(Lclient!yf;I)V")
	static void method31309(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_108, client.aClass175_2.aClass24_2, (byte) 57);
		client.aClass175_2.method24363(local5, -2137094028);
	}

	@OriginalMember(owner = "client!sq", name = "hn", descriptor = "(I)V")
	static void method31310(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class149_Sub5 local4 = (Class149_Sub5) client.aClass21_7.method381(1623550921); local4 != null; local4 = (Class149_Sub5) client.aClass21_7.method381(-499351989)) {
			Class274.method26432(local4, -2058878031);
		}
		@Pc(18) byte local18 = 0;
		@Pc(20) byte local20 = 3;
		@Pc(27) int local27;
		if (client.anInt3463 * 1819062465 == 0) {
			for (local27 = local18; local27 <= local20; local27++) {
				client.method24977(local27);
			}
			client.method24982();
			return;
		}
		client.method25191();
		for (local27 = local18; local27 <= local20; local27++) {
			client.method24975();
			client.method25285(local27);
			client.method24977(local27);
		}
		client.method24978();
		client.method24982();
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIILjava/lang/String;)V")
	public Class559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		this.anInt5490 = arg0 * 1512852915;
		this.anInt5491 = arg1 * -371918147;
		this.anInt5492 = arg2 * 1066087035;
		this.anInt5493 = arg3 * -257301565;
		this.aString235 = arg4;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "()I")
	int method31295() {
		return this.anInt5493 * 1981916395;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)I")
	int method31296(@OriginalArg(0) int arg0) {
		return this.anInt5490 * 1244080507;
	}

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "(I)I")
	int method31297(@OriginalArg(0) int arg0) {
		return this.anInt5491 * 1306218645;
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "(I)I")
	int method31298(@OriginalArg(0) int arg0) {
		return this.anInt5492 * 29285555;
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)I")
	int method31299(@OriginalArg(0) int arg0) {
		return this.anInt5493 * 1981916395;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(B)Ljava/lang/String;")
	String method31300(@OriginalArg(0) byte arg0) {
		return this.aString235;
	}

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "()I")
	int method31301() {
		return this.anInt5492 * 29285555;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "()I")
	int method31302() {
		return this.anInt5490 * 1244080507;
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "()I")
	int method31303() {
		return this.anInt5492 * 29285555;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "()Ljava/lang/String;")
	String method31304() {
		return this.aString235;
	}

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "()I")
	int method31305() {
		return this.anInt5493 * 1981916395;
	}

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "()I")
	int method31306() {
		return this.anInt5490 * 1244080507;
	}
}
