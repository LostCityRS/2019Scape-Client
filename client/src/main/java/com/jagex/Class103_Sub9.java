package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!age")
public final class Class103_Sub9 extends Class103 {

	@OriginalMember(owner = "client!age", name = "f", descriptor = "I")
	final int anInt937;

	@OriginalMember(owner = "client!age", name = "e", descriptor = "I")
	final int anInt938;

	@OriginalMember(owner = "client!age", name = "u", descriptor = "I")
	final int anInt942;

	@OriginalMember(owner = "client!age", name = "l", descriptor = "I")
	final int anInt939;

	@OriginalMember(owner = "client!age", name = "g", descriptor = "I")
	final int anInt941;

	@OriginalMember(owner = "client!age", name = "i", descriptor = "I")
	final int anInt940;

	@OriginalMember(owner = "client!age", name = "no", descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;")
	static String method7878(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) String local5 = arg1 ? "https://" : "http://";
		if (Class566.aClass697_1 == Class697.aClass697_3) {
			arg0 = arg0 + "-wtrc";
		} else if (Class566.aClass697_1 == Class697.aClass697_2) {
			arg0 = arg0 + "-wtqa";
		} else if (Class697.aClass697_5 == Class566.aClass697_1) {
			arg0 = arg0 + "-wtwip";
		} else if (Class697.aClass697_7 == Class566.aClass697_1) {
			arg0 = arg0 + "-wti";
		} else if (Class566.aClass697_1 == Class697.aClass697_11) {
			arg0 = arg0 + "-demo";
		} else if (Class697.aClass697_6 == Class566.aClass697_1) {
			arg0 = "local";
		}
		@Pc(77) String local77 = "";
		if (client.aString147 != null) {
			local77 = "/p=" + client.aString147;
		}
		@Pc(99) String local99 = client.aClass722_4.aString247 + ".com";
		return local5 + arg0 + "." + local99 + "/l=" + Class512.aClass719_3.anInt5827 * 379080821 + "/a=" + client.anInt3426 * -622206633 + local77 + "/";
	}

	@OriginalMember(owner = "client!age", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub9(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt937 = arg0.g2() * 281608073;
		this.anInt938 = arg0.g2() * 1324207501;
		this.anInt942 = arg0.g2() * 835776703;
		this.anInt939 = arg0.g2() * -1534810901;
		this.anInt941 = arg0.g2() * 431034319;
		this.anInt940 = arg0.g2() * 673075831;
	}

	@OriginalMember(owner = "client!age", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class251.aClass250Array1[this.anInt937 * 1695098553].method26355(0, -1879380272);
		Class251.aClass250Array1[this.anInt938 * -1008648891].method26355(1, -1775940026);
		client.anInt3533 = 0;
		client.anInt3492 = this.anInt942 * 1031089567;
		client.anInt3493 = 0;
		client.anInt3494 = this.anInt941 * 1726830845;
		client.anInt3442 = this.anInt940 * 1186692153;
		client.anInt3491 = 1956883921;
		client.anInt3539 = this.anInt939 * 502746301;
		Class368.anInt4502 = 1209200986;
		Class364.method28220(394820816);
		client.aBoolean722 = true;
	}

	@OriginalMember(owner = "client!age", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class251.aClass250Array1[this.anInt937 * 1695098553].method26355(0, -2071670446);
		Class251.aClass250Array1[this.anInt938 * -1008648891].method26355(1, -1616754801);
		client.anInt3533 = 0;
		client.anInt3492 = this.anInt942 * 1031089567;
		client.anInt3493 = 0;
		client.anInt3494 = this.anInt941 * 1726830845;
		client.anInt3442 = this.anInt940 * 1186692153;
		client.anInt3491 = 1956883921;
		client.anInt3539 = this.anInt939 * 502746301;
		Class368.anInt4502 = 1209200986;
		Class364.method28220(394820816);
		client.aBoolean722 = true;
	}

	@OriginalMember(owner = "client!age", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class251.aClass250Array1[this.anInt937 * 1695098553].method26355(0, -1070518888);
		Class251.aClass250Array1[this.anInt938 * -1008648891].method26355(1, -988759379);
		client.anInt3533 = 0;
		client.anInt3492 = this.anInt942 * 1031089567;
		client.anInt3493 = 0;
		client.anInt3494 = this.anInt941 * 1726830845;
		client.anInt3442 = this.anInt940 * 1186692153;
		client.anInt3491 = 1956883921;
		client.anInt3539 = this.anInt939 * 502746301;
		Class368.anInt4502 = 1209200986;
		Class364.method28220(394820816);
		client.aBoolean722 = true;
	}
}
