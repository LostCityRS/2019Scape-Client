package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nx")
public final class Class451 {

	@OriginalMember(owner = "client!nx", name = "t", descriptor = "I")
	public static final int anInt4889 = 910;

	@OriginalMember(owner = "client!nx", name = "f", descriptor = "I")
	public static final int anInt4890 = 1;

	@OriginalMember(owner = "client!nx", name = "uv", descriptor = "I")
	static int anInt4891;

	@OriginalMember(owner = "client!nx", name = "ay", descriptor = "(I)V")
	static void method29280(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class80_Sub1_Sub4 local4 = (Class80_Sub1_Sub4) Class630.aSecondaryLinkedList_17.head((byte) 33); local4 != null; local4 = (Class80_Sub1_Sub4) Class630.aSecondaryLinkedList_17.next((byte) -102)) {
			if (local4.anInt3022 * 855388281 > 1) {
				local4.anInt3022 = 0;
				Class630.aClass243_89.method26253(local4, ((Class80_Sub1_Sub11) local4.aSecondaryLinkedList_10.aClass80_Sub1_2.aClass80_Sub1_68).aLong249 * -6321316696381466459L);
				local4.aSecondaryLinkedList_10.method41(-252802305);
			}
		}
		Class630.anInt5554 = 0;
		Class630.anInt5553 = 0;
		Class630.aClass8_55.method260(2048491839);
		Class630.aClass24_35.method564(-1131584576);
		Class630.aSecondaryLinkedList_17.method41(-252802305);
		Class296.method26995(Class630.aClass80_Sub1_Sub11_3, 424792749);
	}

	@OriginalMember(owner = "client!nx", name = "<init>", descriptor = "()V")
	Class451() throws Throwable {
		throw new Error();
	}
}
