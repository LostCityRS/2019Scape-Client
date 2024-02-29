package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public class Class559 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	int anInt5329;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	int anInt5330;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	int anInt5331;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	int anInt5332;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Ljava/lang/String;")
	String aString226;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(Lclient!yf;I)V", line = 66)
	static void method31114(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class440.method28848(local13, 1716106050);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIILjava/lang/String;)V", line = 856)
	public Class559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		this.anInt5329 = arg0 * 1512852915;
		this.anInt5330 = arg1 * -371918147;
		this.anInt5331 = arg2 * 1066087035;
		this.anInt5332 = arg3 * -257301565;
		this.aString226 = arg4;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)I", line = 865)
	int method31115(@OriginalArg(0) int arg0) {
		return this.anInt5329 * 1244080507;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "()I", line = 865)
	int method31116() {
		return this.anInt5329 * 1244080507;
	}

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "()I", line = 865)
	int method31117() {
		return this.anInt5329 * 1244080507;
	}

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "(I)I", line = 869)
	int method31118(@OriginalArg(0) int arg0) {
		return this.anInt5330 * 1306218645;
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "(I)I", line = 873)
	int method31119(@OriginalArg(0) int arg0) {
		return this.anInt5331 * 29285555;
	}

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "()I", line = 873)
	int method31120() {
		return this.anInt5331 * 29285555;
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "()I", line = 873)
	int method31121() {
		return this.anInt5331 * 29285555;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "()I", line = 877)
	int method31122() {
		return this.anInt5332 * 1981916395;
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)I", line = 877)
	int method31123(@OriginalArg(0) int arg0) {
		return this.anInt5332 * 1981916395;
	}

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "()I", line = 877)
	int method31124() {
		return this.anInt5332 * 1981916395;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(B)Ljava/lang/String;", line = 881)
	String method31125(@OriginalArg(0) byte arg0) {
		return this.aString226;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "()Ljava/lang/String;", line = 881)
	String method31126() {
		return this.aString226;
	}

	@OriginalMember(owner = "client!sq", name = "hn", descriptor = "(I)V", line = 5176)
	static final void method31127(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class149_Sub5 local4 = (Class149_Sub5) client.aClass21_7.method386(1623550921); local4 != null; local4 = (Class149_Sub5) client.aClass21_7.method386(-499351989)) {
			Class274.method26334(local4, -2058878031);
		}
		@Pc(18) byte local18 = 0;
		@Pc(20) byte local20 = 3;
		@Pc(27) int local27;
		if (client.anInt3463 * 1819062465 == 0) {
			for (local27 = local18; local27 <= local20; local27++) {
				client.method25160(local27);
			}
			client.method25172();
			return;
		}
		client.method25153();
		for (local27 = local18; local27 <= local20; local27++) {
			client.method25155();
			client.method25159(local27);
			client.method25160(local27);
		}
		client.method25168();
		client.method25172();
	}

	@OriginalMember(owner = "client!sq", name = "rd", descriptor = "(Lclient!yf;I)V", line = 8146)
	static final void method31128(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3993 * 969124391;
	}

	@OriginalMember(owner = "client!sq", name = "vs", descriptor = "(Lclient!yf;I)V", line = 8815)
	static final void method31129(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_108, client.aClass175_2.aClass24_2, (byte) 57);
		client.aClass175_2.method24356(local5, -2137094028);
	}
}
