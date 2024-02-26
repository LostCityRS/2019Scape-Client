package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ard")
public final class Class80_Sub26_Sub2 extends Class80_Sub26 {

	@OriginalMember(owner = "client!ard", name = "l", descriptor = "I")
	int anInt3025;

	@OriginalMember(owner = "client!ard", name = "g", descriptor = "B")
	byte aByte78;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ard", name = "this$0", descriptor = "Lclient!kq;")
	final Class385 aClass385_2;

	@OriginalMember(owner = "client!ard", name = "u", descriptor = "Ljava/lang/String;")
	String aString98;

	@OriginalMember(owner = "client!ard", name = "ao", descriptor = "(III)V")
	public static void method21767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(20, (long) arg1 << 32 | (long) arg0);
		local9.method22078(101139256);
	}

	@OriginalMember(owner = "client!ard", name = "<init>", descriptor = "(Lclient!kq;)V")
	Class80_Sub26_Sub2(@OriginalArg(0) Class385 arg0) {
		this.aClass385_2 = arg0;
		this.aString98 = null;
	}

	@OriginalMember(owner = "client!ard", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22255(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			arg0.g8();
		}
		this.aString98 = arg0.fastgstr();
		this.anInt3025 = arg0.g2() * 42141347;
		this.aByte78 = arg0.g1b();
		arg0.g8();
	}

	@OriginalMember(owner = "client!ard", name = "f", descriptor = "(Lclient!akv;I)V")
	@Override
	void method22257(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class382 local3 = new Class382();
		local3.aString204 = this.aString98;
		local3.anInt4538 = this.anInt3025 * 1677528793;
		local3.aByte146 = this.aByte78;
		arg0.method14430(local3, -834657192);
	}

	@OriginalMember(owner = "client!ard", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22253(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			arg0.g8();
		}
		this.aString98 = arg0.fastgstr();
		this.anInt3025 = arg0.g2() * 42141347;
		this.aByte78 = arg0.g1b();
		arg0.g8();
	}

	@OriginalMember(owner = "client!ard", name = "u", descriptor = "(Lclient!akv;)V")
	@Override
	void method22256(@OriginalArg(0) Class80_Sub32 arg0) {
		@Pc(3) Class382 local3 = new Class382();
		local3.aString204 = this.aString98;
		local3.anInt4538 = this.anInt3025 * 1677528793;
		local3.aByte146 = this.aByte78;
		arg0.method14430(local3, -1753633607);
	}

	@OriginalMember(owner = "client!ard", name = "l", descriptor = "(Lclient!akv;)V")
	@Override
	void method22254(@OriginalArg(0) Class80_Sub32 arg0) {
		@Pc(3) Class382 local3 = new Class382();
		local3.aString204 = this.aString98;
		local3.anInt4538 = this.anInt3025 * 1677528793;
		local3.aByte146 = this.aByte78;
		arg0.method14430(local3, 476543509);
	}
}
