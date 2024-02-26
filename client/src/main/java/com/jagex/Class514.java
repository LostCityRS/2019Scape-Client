package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class514 {

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "Lclient!qp;")
	public static final Class514 aClass514_9 = new Class514(0);

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!qp;")
	public static final Class514 aClass514_1 = new Class514(1);

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!qp;")
	public static final Class514 aClass514_3 = new Class514(2);

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "Lclient!qp;")
	public static final Class514 aClass514_5 = new Class514(3);

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!qp;")
	public static final Class514 aClass514_2 = new Class514(4);

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!qp;")
	static final Class514 aClass514_4 = new Class514(5);

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Lclient!qp;")
	static final Class514 aClass514_6 = new Class514(6);

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!qp;")
	static final Class514 aClass514_7 = new Class514(7);

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "Lclient!qp;")
	static final Class514 aClass514_8 = new Class514(8);

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	public final int anInt5050;

	@OriginalMember(owner = "client!qp", name = "gd", descriptor = "(I)V")
	static void method30571(@OriginalArg(0) int arg0) {
		client.anInt3461 = 2001457723;
		client.anInt3541 = -119085189;
		Class548.aPacket_16 = null;
		Class662.method33334(-1701937687);
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
	Class514(@OriginalArg(0) int arg0) {
		this.anInt5050 = arg0 * -661277683;
	}
}
