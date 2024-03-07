package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acm")
class Class63 implements Iterator {

	@OriginalMember(owner = "client!acm", name = "v", descriptor = "Lclient!aac;")
	static Class5 aClass5_2;

	@OriginalMember(owner = "client!acm", name = "e", descriptor = "I")
	int anInt230;

	// $FF: synthetic field
	@OriginalMember(owner = "client!acm", name = "this$0", descriptor = "Lclient!abe;")
	final Class32 this$0;

	@OriginalMember(owner = "client!acm", name = "<init>", descriptor = "(Lclient!abe;)V", line = 82)
	Class63(@OriginalArg(0) Class32 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!acm", name = "hasNext", descriptor = "()Z", line = 86)
	@Override
	public boolean hasNext() {
		return this.anInt230 * 2079861523 < this.this$0.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!acm", name = "n", descriptor = "()Z", line = 86)
	public boolean method1156() {
		return this.anInt230 * 2079861523 < this.this$0.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!acm", name = "e", descriptor = "()Z", line = 86)
	public boolean method1157() {
		return this.anInt230 * 2079861523 < this.this$0.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!acm", name = "next", descriptor = "()Ljava/lang/Object;", line = 90)
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt230 += 655382299) * 2079861523 - 1;
		@Pc(16) Class240 local16 = this.this$0.aClass240_62;
		synchronized (this.this$0.aClass240_62) {
			@Pc(25) Interface13 local25 = (Interface13) this.this$0.aClass240_62.method25829((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.this$0.method17804(local11, -1686549206);
	}

	@OriginalMember(owner = "client!acm", name = "m", descriptor = "()Ljava/lang/Object;", line = 90)
	public Object method1158() {
		@Pc(11) int local11 = (this.anInt230 += 655382299) * 2079861523 - 1;
		@Pc(16) Class240 local16 = this.this$0.aClass240_62;
		synchronized (this.this$0.aClass240_62) {
			@Pc(25) Interface13 local25 = (Interface13) this.this$0.aClass240_62.method25829((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.this$0.method17804(local11, -1611897795);
	}

	@OriginalMember(owner = "client!acm", name = "k", descriptor = "()Ljava/lang/Object;", line = 90)
	public Object method1159() {
		@Pc(11) int local11 = (this.anInt230 += 655382299) * 2079861523 - 1;
		@Pc(16) Class240 local16 = this.this$0.aClass240_62;
		synchronized (this.this$0.aClass240_62) {
			@Pc(25) Interface13 local25 = (Interface13) this.this$0.aClass240_62.method25829((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.this$0.method17804(local11, -254623897);
	}

	@OriginalMember(owner = "client!acm", name = "f", descriptor = "()V", line = 99)
	public void method1160() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acm", name = "remove", descriptor = "()V", line = 99)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acm", name = "w", descriptor = "()V", line = 99)
	public void method1161() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acm", name = "ag", descriptor = "(B)V", line = 1017)
	static void method1162(@OriginalArg(0) byte arg0) {
		Class411.connection.clear(-1146389155);
		Class411.connection.packet.pos = 0;
		Class411.connection.prevServerPacketType1 = null;
		Class411.connection.prevServerPacketType2 = null;
		Class411.connection.prevServerPacketType3 = null;
		Class411.connection.anInt3298 = 0;
		client.anInt3453 = 0;
		client.anInt3572 = 0;
		client.anInt3444 = 0;
		client.anInt3573 = 0;
		client.aString146 = null;
		Class623.anInt5682 = 0;
		Class93_Sub1_Sub2.aClass170Array1 = null;
		Class581.aClass386_2 = null;
		Class279.aClass386_1 = null;
		client.aBoolean636 = true;
		ModeWhere.method36612((short) -24121);
		for (@Pc(42) int local42 = 0; local42 < Class624.aClass120_1.aClass675Array1.length; local42++) {
			@Pc(56) Class675 local56 = new Class675(Class336.aClass644_1.method32591(local42, (byte) 24), false);
			local56.method33143(0, 584874206);
			local56.method33157(0, 479175137);
			Class624.aClass120_1.aClass675Array1[local42] = local56;
		}
		Class624.aClass120_1.aClass647_1.method32643((byte) -51);
		Class151.method13978(-64820407);
		Class339.method27486(Class411.connection, (byte) 38);
	}
}
