package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class444 implements Interface48 {

	@OriginalMember(owner = "client!no", name = "f", descriptor = "Lclient!ej;")
	Class243 aClass243_82 = new Class243(64);

	@OriginalMember(owner = "client!no", name = "t", descriptor = "Lclient!pf;")
	Class480 aClass480_113;

	@OriginalMember(owner = "client!no", name = "adk", descriptor = "(Lclient!yp;I)V")
	static void method29230(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass533ArrayArray1[local23][local13].method30827(-1388704292);
	}

	@OriginalMember(owner = "client!no", name = "arv", descriptor = "(Lclient!yp;I)V")
	static void method29231(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean747 ? 1 : 0;
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class444(@OriginalArg(0) Class480 arg0) {
		this.aClass480_113 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "t", descriptor = "(IB)Lclient!nc;")
	@Override
	public Class433 method29225(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class433 local6 = (Class433) this.aClass243_82.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_113.method29918(1, arg0, 1896589581);
		local6 = new Class433();
		local6.anInt4727 = arg0 * -1583789171;
		if (local18 != null) {
			local6.method29097(new Class80_Sub36(local18), -521900089);
		}
		local6.method29096(-2028072152);
		this.aClass243_82.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V")
	public void method29226(@OriginalArg(0) int arg0) {
		this.aClass243_82.method26256(1693912082);
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)Lclient!nc;")
	@Override
	public Class433 method29223(@OriginalArg(0) int arg0) {
		@Pc(6) Class433 local6 = (Class433) this.aClass243_82.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_113.method29918(1, arg0, 1896589581);
		local6 = new Class433();
		local6.anInt4727 = arg0 * -1583789171;
		if (local18 != null) {
			local6.method29097(new Class80_Sub36(local18), -685727451);
		}
		local6.method29096(-2028072152);
		this.aClass243_82.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "()V")
	public void method29227() {
		this.aClass243_82.method26256(1693912082);
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "(I)Lclient!nc;")
	@Override
	public Class433 method29224(@OriginalArg(0) int arg0) {
		@Pc(6) Class433 local6 = (Class433) this.aClass243_82.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_113.method29918(1, arg0, 1896589581);
		local6 = new Class433();
		local6.anInt4727 = arg0 * -1583789171;
		if (local18 != null) {
			local6.method29097(new Class80_Sub36(local18), -1488565853);
		}
		local6.method29096(-2028072152);
		this.aClass243_82.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "()V")
	public void method29228() {
		this.aClass243_82.method26256(1693912082);
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "(I)Lclient!nc;")
	@Override
	public Class433 method29222(@OriginalArg(0) int arg0) {
		@Pc(6) Class433 local6 = (Class433) this.aClass243_82.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_113.method29918(1, arg0, 1896589581);
		local6 = new Class433();
		local6.anInt4727 = arg0 * -1583789171;
		if (local18 != null) {
			local6.method29097(new Class80_Sub36(local18), -100357809);
		}
		local6.method29096(-2028072152);
		this.aClass243_82.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "()V")
	public void method29229() {
		this.aClass243_82.method26256(1693912082);
	}
}
