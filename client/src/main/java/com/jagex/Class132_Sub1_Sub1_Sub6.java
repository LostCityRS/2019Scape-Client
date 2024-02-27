package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!auu")
public final class Class132_Sub1_Sub1_Sub6 extends Class132_Sub1_Sub1 {

	@OriginalMember(owner = "client!auu", name = "ae", descriptor = "Lclient!ta;")
	Class567 aClass567_1;

	@OriginalMember(owner = "client!auu", name = "<init>", descriptor = "(Lclient!tx;Lclient!ta;IIIII)V")
	Class132_Sub1_Sub1_Sub6(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class567 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.aClass567_1 = arg1;
	}

	@OriginalMember(owner = "client!auu", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!auu", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
	}

	@OriginalMember(owner = "client!auu", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass567_1.aClass109_9 == null) {
			return null;
		}
		@Pc(9) Class470 local9 = arg0.method20520();
		@Pc(12) Class470 local12 = this.method24238();
		@Pc(15) Class458 local15 = this.method24241();
		local9.method29545(local12);
		@Pc(39) Class572 local39 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local15.aClass472_61.aFloat325 >> 9][(int) local15.aClass472_61.aFloat327 >> 9];
		if (local39 != null && local39.aClass132_Sub1_Sub4_1 != null) {
			local9.method29568(0.0F, (float) -local39.aClass132_Sub1_Sub4_1.aShort97, 0.0F);
		}
		this.aClass567_1.aClass109_9.method6947(local9, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "go", descriptor = "()V")
	@Override
	void method24269() {
	}

	@OriginalMember(owner = "client!auu", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		return true;
	}

	@OriginalMember(owner = "client!auu", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass567_1.aClass109_9 == null ? 0 : this.aClass567_1.aClass109_9.method6882();
	}

	@OriginalMember(owner = "client!auu", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
	}

	@OriginalMember(owner = "client!auu", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass567_1.aClass109_9 == null ? 0 : this.aClass567_1.aClass109_9.method6882();
	}

	@OriginalMember(owner = "client!auu", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!auu", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		return true;
	}

	@OriginalMember(owner = "client!auu", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		if (this.aClass567_1.aClass109_9 == null) {
			return null;
		}
		@Pc(9) Class470 local9 = arg0.method20520();
		@Pc(12) Class470 local12 = this.method24238();
		@Pc(15) Class458 local15 = this.method24241();
		local9.method29545(local12);
		@Pc(39) Class572 local39 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local15.aClass472_61.aFloat325 >> 9][(int) local15.aClass472_61.aFloat327 >> 9];
		if (local39 != null && local39.aClass132_Sub1_Sub4_1 != null) {
			local9.method29568(0.0F, (float) -local39.aClass132_Sub1_Sub4_1.aShort97, 0.0F);
		}
		this.aClass567_1.aClass109_9.method6947(local9, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}
}
