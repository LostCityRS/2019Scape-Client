package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!age")
public class Class110_Sub8 extends Class110 {

	@OriginalMember(owner = "client!age", name = "ko", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!age", name = "n", descriptor = "I")
	final int anInt912;

	@OriginalMember(owner = "client!age", name = "m", descriptor = "I")
	final int anInt915;

	@OriginalMember(owner = "client!age", name = "k", descriptor = "I")
	final int anInt913;

	@OriginalMember(owner = "client!age", name = "f", descriptor = "I")
	final int anInt914;

	@OriginalMember(owner = "client!age", name = "w", descriptor = "I")
	final int anInt911;

	@OriginalMember(owner = "client!age", name = "l", descriptor = "I")
	final int anInt916;

	@OriginalMember(owner = "client!age", name = "<init>", descriptor = "(Lclient!alw;)V", line = 16)
	Class110_Sub8(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt912 = arg0.g2(-1434290800) * 1961320037;
		this.anInt915 = arg0.g2(-1434290800) * -1795509975;
		this.anInt913 = arg0.g2(-1434290800) * 567576759;
		this.anInt914 = arg0.g2(-1434290800) * 34801743;
		this.anInt911 = arg0.g2(-1434290800) * 2109223857;
		this.anInt916 = arg0.g2(-1434290800) * -243407281;
	}

	@OriginalMember(owner = "client!age", name = "n", descriptor = "(I)V", line = 26)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		Class249.aClass255Array1[this.anInt912 * -378461331].method26003(0, (short) -8355);
		Class249.aClass255Array1[this.anInt915 * 200702745].method26003(1, (short) -7655);
		client.anInt3486 = 0;
		client.anInt3491 = this.anInt913 * 1547891937;
		client.anInt3525 = 0;
		client.anInt3456 = this.anInt911 * -1311740245;
		client.anInt3493 = this.anInt916 * 152620609;
		client.anInt3490 = 468246877;
		client.anInt3506 = this.anInt914 * -269449439;
		Class429.anInt4781 = 911755286;
		Class631.method32281(1785470908);
		client.aBoolean613 = true;
	}

	@OriginalMember(owner = "client!age", name = "f", descriptor = "()V", line = 26)
	@Override
	public void method20150() {
		Class249.aClass255Array1[this.anInt912 * -378461331].method26003(0, (short) 14344);
		Class249.aClass255Array1[this.anInt915 * 200702745].method26003(1, (short) 4295);
		client.anInt3486 = 0;
		client.anInt3491 = this.anInt913 * 1547891937;
		client.anInt3525 = 0;
		client.anInt3456 = this.anInt911 * -1311740245;
		client.anInt3493 = this.anInt916 * 152620609;
		client.anInt3490 = 468246877;
		client.anInt3506 = this.anInt914 * -269449439;
		Class429.anInt4781 = 911755286;
		Class631.method32281(1752521561);
		client.aBoolean613 = true;
	}

	@OriginalMember(owner = "client!age", name = "ie", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V", line = 6491)
	static final void method7959(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		arg0.anInt4001 = -2003331097;
		arg0.anInt4037 = client.selfPlayerSlot * 1786756713;
		arg0.anInt4038 = 0;
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class124_Sub3_Sub1.method19766(arg0.anInt3953 * -1549590237, 256284111);
		}
	}
}
