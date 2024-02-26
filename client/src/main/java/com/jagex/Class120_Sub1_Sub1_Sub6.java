package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!auq")
public final class Class120_Sub1_Sub1_Sub6 extends Class120_Sub1_Sub1 {

	@OriginalMember(owner = "client!auq", name = "ax", descriptor = "Lclient!tk;")
	Class574 aClass574_1;

	@OriginalMember(owner = "client!auq", name = "<init>", descriptor = "(Lclient!te;Lclient!tk;IIIII)V")
	Class120_Sub1_Sub1_Sub6(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class574 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.aClass574_1 = arg1;
	}

	@OriginalMember(owner = "client!auq", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass574_1.aClass105_9 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = arg0.method20813();
		@Pc(11) Class471 local11 = this.method24526();
		@Pc(14) Class457 local14 = this.method24552();
		local8.method29760(local11);
		@Pc(38) Class568 local38 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local14.aClass463_61.aFloat297 >> 9][(int) local14.aClass463_61.aFloat296 >> 9];
		if (local38 != null && local38.aClass120_Sub1_Sub4_1 != null) {
			local8.method29783(0.0F, (float) -local38.aClass120_Sub1_Sub4_1.aShort48, 0.0F);
		}
		this.aClass574_1.aClass105_9.method7359(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auq", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
	}

	@OriginalMember(owner = "client!auq", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!auq", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auq", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!auq", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass574_1.aClass105_9 == null ? 0 : this.aClass574_1.aClass105_9.method7366();
	}

	@OriginalMember(owner = "client!auq", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass574_1.aClass105_9 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = arg0.method20813();
		@Pc(11) Class471 local11 = this.method24526();
		@Pc(14) Class457 local14 = this.method24552();
		local8.method29760(local11);
		@Pc(38) Class568 local38 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local14.aClass463_61.aFloat297 >> 9][(int) local14.aClass463_61.aFloat296 >> 9];
		if (local38 != null && local38.aClass120_Sub1_Sub4_1 != null) {
			local8.method29783(0.0F, (float) -local38.aClass120_Sub1_Sub4_1.aShort48, 0.0F);
		}
		this.aClass574_1.aClass105_9.method7359(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auq", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auq", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass574_1.aClass105_9 == null ? 0 : this.aClass574_1.aClass105_9.method7366();
	}

	@OriginalMember(owner = "client!auq", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass574_1.aClass105_9 == null ? 0 : this.aClass574_1.aClass105_9.method7366();
	}

	@OriginalMember(owner = "client!auq", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass574_1.aClass105_9 == null ? 0 : this.aClass574_1.aClass105_9.method7366();
	}

	@OriginalMember(owner = "client!auq", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass574_1.aClass105_9 == null ? 0 : this.aClass574_1.aClass105_9.method7366();
	}

	@OriginalMember(owner = "client!auq", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auq", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!auq", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass574_1.aClass105_9 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = arg0.method20813();
		@Pc(11) Class471 local11 = this.method24526();
		@Pc(14) Class457 local14 = this.method24552();
		local8.method29760(local11);
		@Pc(38) Class568 local38 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local14.aClass463_61.aFloat297 >> 9][(int) local14.aClass463_61.aFloat296 >> 9];
		if (local38 != null && local38.aClass120_Sub1_Sub4_1 != null) {
			local8.method29783(0.0F, (float) -local38.aClass120_Sub1_Sub4_1.aShort48, 0.0F);
		}
		this.aClass574_1.aClass105_9.method7359(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auq", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass574_1.aClass105_9 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = arg0.method20813();
		@Pc(11) Class471 local11 = this.method24526();
		@Pc(14) Class457 local14 = this.method24552();
		local8.method29760(local11);
		@Pc(38) Class568 local38 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local14.aClass463_61.aFloat297 >> 9][(int) local14.aClass463_61.aFloat296 >> 9];
		if (local38 != null && local38.aClass120_Sub1_Sub4_1 != null) {
			local8.method29783(0.0F, (float) -local38.aClass120_Sub1_Sub4_1.aShort48, 0.0F);
		}
		this.aClass574_1.aClass105_9.method7359(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auq", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return true;
	}

	@OriginalMember(owner = "client!auq", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auq", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auq", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auq", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auq", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auq", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!auq", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
	}

	@OriginalMember(owner = "client!auq", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
	}

	@OriginalMember(owner = "client!auq", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auq", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return false;
	}

	@OriginalMember(owner = "client!auq", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auq", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
	}
}
