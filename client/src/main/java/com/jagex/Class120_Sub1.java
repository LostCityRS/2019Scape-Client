package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alf")
public abstract class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!alf", name = "s", descriptor = "Lclient!te;")
	public Class570 aClass570_23;

	@OriginalMember(owner = "client!alf", name = "k", descriptor = "Lclient!alf;")
	Class120_Sub1 aClass120_Sub1_23;

	@OriginalMember(owner = "client!alf", name = "x", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!alf", name = "w", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!alf", name = "r", descriptor = "I")
	int anInt3297;

	@OriginalMember(owner = "client!alf", name = "q", descriptor = "[Lclient!eo;")
	public Class246[] aClass246Array21;

	@OriginalMember(owner = "client!alf", name = "h", descriptor = "Lclient!oc;")
	public Class457 aClass457_89;

	@OriginalMember(owner = "client!alf", name = "hq", descriptor = "(IIILclient!dn;)Lclient!uc;")
	static Class589 method24610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class105 arg3) {
		return arg3 == null ? null : new Class589(arg0, arg1, arg2, arg3.method7362(), arg3.method7533(), arg3.method7485(), arg3.method7366(), arg3.method7367(), arg3.method7368(), arg3.method7342());
	}

	@OriginalMember(owner = "client!alf", name = "hr", descriptor = "(IIILclient!dn;)Lclient!uc;")
	static Class589 method24619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class105 arg3) {
		return arg3 == null ? null : new Class589(arg0, arg1, arg2, arg3.method7362(), arg3.method7533(), arg3.method7485(), arg3.method7366(), arg3.method7367(), arg3.method7368(), arg3.method7342());
	}

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(Lclient!te;)V")
	Class120_Sub1(@OriginalArg(0) Class570 arg0) {
		this(arg0, (Class457) null);
	}

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(Lclient!te;Lclient!oc;)V")
	Class120_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class457 arg1) {
		this.aClass570_23 = arg0;
		this.aClass457_89 = arg1;
	}

	@OriginalMember(owner = "client!alf", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	abstract void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alf", name = "ft", descriptor = "(Lclient!di;II)Z")
	abstract boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alf", name = "gq", descriptor = "()I")
	int method24564() {
		return 0;
	}

	@OriginalMember(owner = "client!alf", name = "bc", descriptor = "(I)Z")
	abstract boolean method24565(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alf", name = "fo", descriptor = "(B)Z")
	abstract boolean method24566(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!alf", name = "bo", descriptor = "(I)Z")
	abstract boolean method24567(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alf", name = "hk", descriptor = "(II[Lclient!akb;)I")
	final int method24568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub12[] arg2) {
		@Pc(10) long local10 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass570_23.aClass595Array1[local26 - 1].aClass80_Sub12_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alf", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	abstract void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!alf", name = "fb", descriptor = "(I)V")
	abstract void method24570(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alf", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	abstract Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!alf", name = "fh", descriptor = "(Lclient!di;B)V")
	abstract void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!alf", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	public abstract Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!alf", name = "gd", descriptor = "([Lclient!akb;I)I")
	abstract int method24574(@OriginalArg(0) Class80_Sub12[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!alf", name = "gc", descriptor = "(Lclient!di;I)Z")
	abstract boolean method24575(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!alf", name = "gj", descriptor = "(S)Z")
	abstract boolean method24576(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "client!alf", name = "cb", descriptor = "()I")
	public int method24577() {
		return -this.method24578(985995019);
	}

	@OriginalMember(owner = "client!alf", name = "bb", descriptor = "(I)I")
	public abstract int method24578(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alf", name = "go", descriptor = "(II[Lclient!akb;B)I")
	final int method24579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub12[] arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) long local10 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass570_23.aClass595Array1[local26 - 1].aClass80_Sub12_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alf", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	abstract void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alf", name = "gu", descriptor = "(IB)V")
	final void method24581(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aClass246Array21 = new Class246[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass246Array21.length; local5++) {
			this.aClass246Array21[local5] = new Class246();
		}
	}

	@OriginalMember(owner = "client!alf", name = "hx", descriptor = "(I)V")
	final void method24582(@OriginalArg(0) int arg0) {
		this.aClass246Array21 = new Class246[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass246Array21.length; local5++) {
			this.aClass246Array21[local5] = new Class246();
		}
	}

	@OriginalMember(owner = "client!alf", name = "fw", descriptor = "(Lclient!di;III)Z")
	abstract boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!alf", name = "cr", descriptor = "()Z")
	abstract boolean method24584();

	@OriginalMember(owner = "client!alf", name = "ci", descriptor = "()I")
	public abstract int method24585();

	@OriginalMember(owner = "client!alf", name = "hn", descriptor = "()Z")
	abstract boolean method24586();

	@OriginalMember(owner = "client!alf", name = "cp", descriptor = "()I")
	public abstract int method24587();

	@OriginalMember(owner = "client!alf", name = "cg", descriptor = "()I")
	public abstract int method24588();

	@OriginalMember(owner = "client!alf", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	public abstract Class589 method24589(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "ge", descriptor = "()V")
	abstract void method24590();

	@OriginalMember(owner = "client!alf", name = "cw", descriptor = "()I")
	public int method24591() {
		return -this.method24578(1002492929);
	}

	@OriginalMember(owner = "client!alf", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	abstract Class573 method24592(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "gw", descriptor = "(Lclient!di;)V")
	abstract void method24593(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	abstract Class573 method24594(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "ck", descriptor = "()Z")
	abstract boolean method24595();

	@OriginalMember(owner = "client!alf", name = "fs", descriptor = "()Z")
	abstract boolean method24596();

	@OriginalMember(owner = "client!alf", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	abstract Class573 method24597(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	abstract void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alf", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	abstract void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alf", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	abstract void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alf", name = "bf", descriptor = "(I)I")
	public int method24601(@OriginalArg(0) int arg0) {
		return -this.method24578(773006152);
	}

	@OriginalMember(owner = "client!alf", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	abstract void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alf", name = "gg", descriptor = "()V")
	abstract void method24603();

	@OriginalMember(owner = "client!alf", name = "gf", descriptor = "(I)Z")
	public boolean method24604(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!alf", name = "gb", descriptor = "(Lclient!di;)V")
	abstract void method24605(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "fu", descriptor = "()Z")
	abstract boolean method24606();

	@OriginalMember(owner = "client!alf", name = "gi", descriptor = "(Lclient!di;)V")
	abstract void method24607(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "gp", descriptor = "(Lclient!di;)V")
	abstract void method24608(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "gt", descriptor = "()I")
	int method24609() {
		return 0;
	}

	@OriginalMember(owner = "client!alf", name = "gl", descriptor = "()I")
	int method24611() {
		return 0;
	}

	@OriginalMember(owner = "client!alf", name = "gm", descriptor = "()I")
	int method24612() {
		return 0;
	}

	@OriginalMember(owner = "client!alf", name = "ga", descriptor = "(I)I")
	int method24613(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!alf", name = "gx", descriptor = "()I")
	int method24614() {
		return 0;
	}

	@OriginalMember(owner = "client!alf", name = "gn", descriptor = "()Z")
	public boolean method24615() {
		return true;
	}

	@OriginalMember(owner = "client!alf", name = "ca", descriptor = "()Z")
	abstract boolean method24616();

	@OriginalMember(owner = "client!alf", name = "hp", descriptor = "(Lclient!di;)Z")
	abstract boolean method24617(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!alf", name = "hf", descriptor = "()Z")
	abstract boolean method24618();

	@OriginalMember(owner = "client!alf", name = "ha", descriptor = "()Z")
	abstract boolean method24620();

	@OriginalMember(owner = "client!alf", name = "hw", descriptor = "(II[Lclient!akb;)I")
	final int method24621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub12[] arg2) {
		@Pc(10) long local10 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass570_23.aClass595Array1[local26 - 1].aClass80_Sub12_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alf", name = "cm", descriptor = "()I")
	public abstract int method24622();

	@OriginalMember(owner = "client!alf", name = "gs", descriptor = "([Lclient!akb;)I")
	abstract int method24623(@OriginalArg(0) Class80_Sub12[] arg0);

	@OriginalMember(owner = "client!alf", name = "hv", descriptor = "(II[Lclient!akb;)I")
	final int method24624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub12[] arg2) {
		@Pc(10) long local10 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass570_23.aClass595Array1[local26 - 1].aClass80_Sub12_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alf", name = "he", descriptor = "(I)V")
	final void method24625(@OriginalArg(0) int arg0) {
		this.aClass246Array21 = new Class246[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass246Array21.length; local5++) {
			this.aClass246Array21[local5] = new Class246();
		}
	}

	@OriginalMember(owner = "client!alf", name = "gy", descriptor = "()I")
	int method24626() {
		return 0;
	}
}
