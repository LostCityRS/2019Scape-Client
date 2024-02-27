package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alh")
public abstract class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!alh", name = "q", descriptor = "Lclient!oe;")
	public Class458 aClass458_89;

	@OriginalMember(owner = "client!alh", name = "r", descriptor = "Lclient!alh;")
	Class132_Sub1 aClass132_Sub1_23;

	@OriginalMember(owner = "client!alh", name = "y", descriptor = "[Lclient!ed;")
	public Class241[] aClass241Array21;

	@OriginalMember(owner = "client!alh", name = "o", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!alh", name = "s", descriptor = "I")
	int anInt3290;

	@OriginalMember(owner = "client!alh", name = "c", descriptor = "Lclient!tx;")
	public Class585 aClass585_23;

	@OriginalMember(owner = "client!alh", name = "v", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!alh", name = "gi", descriptor = "(Lclient!uq;IIILclient!do;)V")
	static void method24272(@OriginalArg(0) Class600 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4) {
		if (arg4 != null) {
			arg0.method32024(arg1, arg2, arg3, arg4.method6861(), arg4.method6863(), arg4.method6864(), arg4.method6882(), arg4.method6829(), arg4.method6867(), arg4.method6928());
		}
	}

	@OriginalMember(owner = "client!alh", name = "gb", descriptor = "(IIILclient!do;)Lclient!uq;")
	static Class600 method24320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class109 arg3) {
		return arg3 == null ? null : new Class600(arg0, arg1, arg2, arg3.method6861(), arg3.method6863(), arg3.method6864(), arg3.method6882(), arg3.method6829(), arg3.method6867(), arg3.method6928());
	}

	@OriginalMember(owner = "client!alh", name = "hm", descriptor = "(Lclient!uq;IIILclient!do;)V")
	static void method24322(@OriginalArg(0) Class600 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4) {
		if (arg4 != null) {
			arg0.method32024(arg1, arg2, arg3, arg4.method6861(), arg4.method6863(), arg4.method6864(), arg4.method6882(), arg4.method6829(), arg4.method6867(), arg4.method6928());
		}
	}

	@OriginalMember(owner = "client!alh", name = "ha", descriptor = "(Lclient!uq;IIILclient!do;)V")
	static void method24323(@OriginalArg(0) Class600 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4) {
		if (arg4 != null) {
			arg0.method32024(arg1, arg2, arg3, arg4.method6861(), arg4.method6863(), arg4.method6864(), arg4.method6882(), arg4.method6829(), arg4.method6867(), arg4.method6928());
		}
	}

	@OriginalMember(owner = "client!alh", name = "<init>", descriptor = "(Lclient!tx;)V")
	Class132_Sub1(@OriginalArg(0) Class585 arg0) {
		this(arg0, (Class458) null);
	}

	@OriginalMember(owner = "client!alh", name = "<init>", descriptor = "(Lclient!tx;Lclient!oe;)V")
	Class132_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class458 arg1) {
		this.aClass585_23 = arg0;
		this.aClass458_89 = arg1;
	}

	@OriginalMember(owner = "client!alh", name = "go", descriptor = "()V")
	abstract void method24269();

	@OriginalMember(owner = "client!alh", name = "gw", descriptor = "()Z")
	abstract boolean method24270();

	@OriginalMember(owner = "client!alh", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	abstract boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!alh", name = "fp", descriptor = "(I)Z")
	abstract boolean method24273(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alh", name = "bu", descriptor = "(B)Z")
	abstract boolean method24274(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!alh", name = "bw", descriptor = "(S)Z")
	abstract boolean method24275(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "client!alh", name = "gv", descriptor = "([Lclient!akf;)I")
	abstract int method24276(@OriginalArg(0) Class93_Sub16[] arg0);

	@OriginalMember(owner = "client!alh", name = "ff", descriptor = "(B)V")
	abstract void method24277(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!alh", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	abstract Class573 method24278(@OriginalArg(0) Class104 arg0);

	@OriginalMember(owner = "client!alh", name = "fw", descriptor = "(Lclient!dh;I)V")
	abstract void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!alh", name = "gc", descriptor = "(I)Z")
	public boolean method24280(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!alh", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	abstract void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6);

	@OriginalMember(owner = "client!alh", name = "ga", descriptor = "(Lclient!dh;S)Z")
	abstract boolean method24282(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!alh", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	abstract Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!alh", name = "fh", descriptor = "()Z")
	abstract boolean method24284();

	@OriginalMember(owner = "client!alh", name = "gn", descriptor = "(I)Z")
	abstract boolean method24285(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alh", name = "gf", descriptor = "(II[Lclient!akf;I)I")
	final int method24286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub16[] arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass585_23.aClass597Array1[local26 - 1].aClass93_Sub16_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alh", name = "bo", descriptor = "(I)I")
	public int method24287(@OriginalArg(0) int arg0) {
		return -this.method24301((byte) -3);
	}

	@OriginalMember(owner = "client!alh", name = "gg", descriptor = "(II)V")
	final void method24288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}

	@OriginalMember(owner = "client!alh", name = "gr", descriptor = "()I")
	int method24289() {
		return 0;
	}

	@OriginalMember(owner = "client!alh", name = "co", descriptor = "()Z")
	abstract boolean method24290();

	@OriginalMember(owner = "client!alh", name = "cr", descriptor = "()Z")
	abstract boolean method24291();

	@OriginalMember(owner = "client!alh", name = "cm", descriptor = "()Z")
	abstract boolean method24292();

	@OriginalMember(owner = "client!alh", name = "cq", descriptor = "()Z")
	abstract boolean method24293();

	@OriginalMember(owner = "client!alh", name = "ch", descriptor = "()I")
	public abstract int method24294();

	@OriginalMember(owner = "client!alh", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	public abstract Class600 method24295(@OriginalArg(0) Class104 arg0);

	@OriginalMember(owner = "client!alh", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	public abstract Class600 method24296(@OriginalArg(0) Class104 arg0);

	@OriginalMember(owner = "client!alh", name = "cb", descriptor = "()I")
	public int method24297() {
		return -this.method24301((byte) -9);
	}

	@OriginalMember(owner = "client!alh", name = "cs", descriptor = "()I")
	public int method24298() {
		return -this.method24301((byte) -53);
	}

	@OriginalMember(owner = "client!alh", name = "cy", descriptor = "()I")
	public int method24299() {
		return -this.method24301((byte) -21);
	}

	@OriginalMember(owner = "client!alh", name = "hd", descriptor = "(I)V")
	final void method24300(@OriginalArg(0) int arg0) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}

	@OriginalMember(owner = "client!alh", name = "by", descriptor = "(B)I")
	public abstract int method24301(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!alh", name = "fk", descriptor = "(Lclient!dh;II)Z")
	abstract boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alh", name = "hb", descriptor = "(I)V")
	final void method24303(@OriginalArg(0) int arg0) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}

	@OriginalMember(owner = "client!alh", name = "fr", descriptor = "()Z")
	abstract boolean method24304();

	@OriginalMember(owner = "client!alh", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	abstract void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alh", name = "fy", descriptor = "(Lclient!dh;)V")
	abstract void method24306(@OriginalArg(0) Class104 arg0);

	@OriginalMember(owner = "client!alh", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	abstract void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alh", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	abstract void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alh", name = "gk", descriptor = "()V")
	abstract void method24309();

	@OriginalMember(owner = "client!alh", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	public abstract Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!alh", name = "cf", descriptor = "()Z")
	abstract boolean method24311();

	@OriginalMember(owner = "client!alh", name = "gt", descriptor = "()Z")
	public boolean method24312() {
		return true;
	}

	@OriginalMember(owner = "client!alh", name = "gh", descriptor = "()Z")
	public boolean method24313() {
		return true;
	}

	@OriginalMember(owner = "client!alh", name = "gm", descriptor = "([Lclient!akf;)I")
	abstract int method24314(@OriginalArg(0) Class93_Sub16[] arg0);

	@OriginalMember(owner = "client!alh", name = "fe", descriptor = "(Lclient!dh;)V")
	abstract void method24315(@OriginalArg(0) Class104 arg0);

	@OriginalMember(owner = "client!alh", name = "gj", descriptor = "(Lclient!dh;)Z")
	abstract boolean method24316(@OriginalArg(0) Class104 arg0);

	@OriginalMember(owner = "client!alh", name = "gp", descriptor = "(I)I")
	int method24317(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!alh", name = "gd", descriptor = "(II[Lclient!akf;)I")
	final int method24318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub16[] arg2) {
		@Pc(10) long local10 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass585_23.aClass597Array1[local26 - 1].aClass93_Sub16_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alh", name = "gz", descriptor = "(II[Lclient!akf;)I")
	final int method24319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub16[] arg2) {
		@Pc(10) long local10 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass585_23.aClass597Array1[local26 - 1].aClass93_Sub16_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alh", name = "gy", descriptor = "([Lclient!akf;S)I")
	abstract int method24321(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!alh", name = "hk", descriptor = "(I)V")
	final void method24324(@OriginalArg(0) int arg0) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}

	@OriginalMember(owner = "client!alh", name = "hu", descriptor = "(I)V")
	final void method24325(@OriginalArg(0) int arg0) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}

	@OriginalMember(owner = "client!alh", name = "gs", descriptor = "()Z")
	public boolean method24326() {
		return true;
	}

	@OriginalMember(owner = "client!alh", name = "hg", descriptor = "(I)V")
	final void method24327(@OriginalArg(0) int arg0) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}

	@OriginalMember(owner = "client!alh", name = "hx", descriptor = "(I)V")
	final void method24328(@OriginalArg(0) int arg0) {
		this.aClass241Array21 = new Class241[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass241Array21.length; local5++) {
			this.aClass241Array21[local5] = new Class241();
		}
	}
}
