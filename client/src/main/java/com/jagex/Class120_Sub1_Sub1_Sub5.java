package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aui")
public final class Class120_Sub1_Sub1_Sub5 extends Class120_Sub1_Sub1 {

	@OriginalMember(owner = "client!aui", name = "aj", descriptor = "Lclient!xe;")
	Class658 aClass658_5;

	@OriginalMember(owner = "client!aui", name = "ay", descriptor = "I")
	int anInt3288 = 0;

	@OriginalMember(owner = "client!aui", name = "aq", descriptor = "I")
	int anInt3291 = 0;

	@OriginalMember(owner = "client!aui", name = "ao", descriptor = "Z")
	boolean aBoolean658 = true;

	@OriginalMember(owner = "client!aui", name = "ac", descriptor = "I")
	int anInt3290 = 0;

	@OriginalMember(owner = "client!aui", name = "ax", descriptor = "I")
	int anInt3289;

	@OriginalMember(owner = "client!aui", name = "ai", descriptor = "Lclient!aad;")
	Class6 aClass6_5;

	@OriginalMember(owner = "client!aui", name = "<init>", descriptor = "(Lclient!te;IIIIIIIIIIIIZI)V")
	public Class120_Sub1_Sub1_Sub5(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3289 = arg1 * 1251370189;
		this.anInt3288 = arg12 * 52799185;
		this.anInt3290 = arg14 * -2019035825;
		@Pc(49) Class684 local49 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt3289 * -1198512123, 663146414);
		@Pc(54) int local54 = local49.anInt5764 * 319211597;
		if (local54 != -1) {
			this.aClass6_5 = new Class6_Sub1(this, false);
			@Pc(71) int local71 = local49.aBoolean986 ? 0 : 2;
			if (arg13) {
				local71 = 1;
			}
			this.aClass6_5.method23626(local54, arg2, local71, false, (byte) -123);
		}
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!aui", name = "y", descriptor = "(Lclient!di;II)Lclient!dn;")
	Class105 method24330(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class684 local5 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(arg2, -1995887123);
		@Pc(12) Class100 local12 = this.aClass570_23.aClass100Array3[this.aByte99];
		@Pc(27) Class100 local27 = this.aByte100 < 3 ? this.aClass570_23.aClass100Array3[this.aByte100 + 1] : null;
		@Pc(31) Class463 local31 = this.method24552().aClass463_61;
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1) ? local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, null, (byte) 2, -1827797700) : local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, this.aClass6_5, (byte) 2, -1827797700);
	}

	@OriginalMember(owner = "client!aui", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "d", descriptor = "()Z")
	public boolean method24331() {
		return this.aClass6_5 != null && !this.aClass6_5.method23589((byte) 46);
	}

	@OriginalMember(owner = "client!aui", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.anInt3291 * 616672483;
	}

	@OriginalMember(owner = "client!aui", name = "h", descriptor = "()Z")
	public boolean method24332() {
		return this.aClass6_5 != null && !this.aClass6_5.method23589((byte) 50);
	}

	@OriginalMember(owner = "client!aui", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "f", descriptor = "(II)V")
	public void method24333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_5 != null && !this.aClass6_5.method23658((byte) 1)) {
			this.aClass6_5.method23601(arg0, -1930569314);
		}
	}

	@OriginalMember(owner = "client!aui", name = "e", descriptor = "(I)Z")
	public boolean method24334(@OriginalArg(0) int arg0) {
		return this.aClass6_5 != null && !this.aClass6_5.method23589((byte) 61);
	}

	@OriginalMember(owner = "client!aui", name = "u", descriptor = "(I)Z")
	public boolean method24335(@OriginalArg(0) int arg0) {
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1);
	}

	@OriginalMember(owner = "client!aui", name = "l", descriptor = "(Lclient!di;III)Lclient!dn;")
	Class105 method24336(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class684 local5 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(arg2, -1317468339);
		@Pc(12) Class100 local12 = this.aClass570_23.aClass100Array3[this.aByte99];
		@Pc(27) Class100 local27 = this.aByte100 < 3 ? this.aClass570_23.aClass100Array3[this.aByte100 + 1] : null;
		@Pc(31) Class463 local31 = this.method24552().aClass463_61;
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1) ? local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, null, (byte) 2, -1827797700) : local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, this.aClass6_5, (byte) 2, -1827797700);
	}

	@OriginalMember(owner = "client!aui", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean658;
	}

	@OriginalMember(owner = "client!aui", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.anInt3291 * 616672483;
	}

	@OriginalMember(owner = "client!aui", name = "g", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;B)V")
	void method24337(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) byte arg3) {
		arg1.method7346(arg2);
		@Pc(5) Class228[] local5 = arg1.method7385();
		@Pc(8) Class211[] local8 = arg1.method7386();
		if ((this.aClass658_5 == null || this.aClass658_5.aBoolean972) && (local5 != null || local8 != null)) {
			this.aClass658_5 = Class658.method33264(client.anInt3436, true);
		}
		if (this.aClass658_5 != null) {
			this.aClass658_5.method33238(arg0, (long) client.anInt3436, local5, local8, false);
			this.aClass658_5.method33242(this.aByte99, this.aShort129, this.aShort126, this.aShort127, this.aShort128);
		}
	}

	@OriginalMember(owner = "client!aui", name = "s", descriptor = "(I)V")
	public void method24338(@OriginalArg(0) int arg0) {
		if (this.aClass6_5 != null && !this.aClass6_5.method23658((byte) 1)) {
			this.aClass6_5.method23601(arg0, -1611364691);
		}
	}

	@OriginalMember(owner = "client!aui", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "a", descriptor = "(I)V")
	public void method24339(@OriginalArg(0) int arg0) {
		if (this.aClass6_5 != null && !this.aClass6_5.method23658((byte) 1)) {
			this.aClass6_5.method23601(arg0, -1948540809);
		}
	}

	@OriginalMember(owner = "client!aui", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "w", descriptor = "()Z")
	public boolean method24340() {
		return this.aClass6_5 != null && !this.aClass6_5.method23589((byte) 89);
	}

	@OriginalMember(owner = "client!aui", name = "t", descriptor = "(I)I")
	public int method24341(@OriginalArg(0) int arg0) {
		return this.anInt3290 * 94765487;
	}

	@OriginalMember(owner = "client!aui", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean658;
	}

	@OriginalMember(owner = "client!aui", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.anInt3291 * 616672483;
	}

	@OriginalMember(owner = "client!aui", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.anInt3291 * 616672483;
	}

	@OriginalMember(owner = "client!aui", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean658;
	}

	@OriginalMember(owner = "client!aui", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aui", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(18) Class105 local18 = this.method24336(arg0, (this.anInt3288 * -840797647 == 0 ? 0 : 5) | 0x800, this.anInt3289 * -1198512123, -1878255500);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Class471 local26 = this.method24526();
		this.method24337(arg0, local18, local26, (byte) 0);
		@Pc(36) Class573 local36 = Class454.method29307(false, 71461829);
		local18.method7359(local26, this.aClass246Array21[0], 0);
		if (this.aClass658_5 != null) {
			@Pc(51) Class221 local51 = this.aClass658_5.method33244();
			arg0.method20964(local51);
		}
		this.aBoolean658 = local18.method7395();
		this.anInt3291 = local18.method7366() * 1011939531;
		local18.method7501();
		return local36;
	}

	@OriginalMember(owner = "client!aui", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(18) Class105 local18 = this.method24336(arg0, (this.anInt3288 * -840797647 == 0 ? 0 : 5) | 0x800, this.anInt3289 * -1198512123, -1878255500);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Class471 local26 = this.method24526();
		this.method24337(arg0, local18, local26, (byte) 0);
		@Pc(36) Class573 local36 = Class454.method29307(false, -260961028);
		local18.method7359(local26, this.aClass246Array21[0], 0);
		if (this.aClass658_5 != null) {
			@Pc(51) Class221 local51 = this.aClass658_5.method33244();
			arg0.method20964(local51);
		}
		this.aBoolean658 = local18.method7395();
		this.anInt3291 = local18.method7366() * 1011939531;
		local18.method7501();
		return local36;
	}

	@OriginalMember(owner = "client!aui", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(18) Class105 local18 = this.method24336(arg0, (this.anInt3288 * -840797647 == 0 ? 0 : 5) | 0x800, this.anInt3289 * -1198512123, -1878255500);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Class471 local26 = this.method24526();
		this.method24337(arg0, local18, local26, (byte) 0);
		@Pc(36) Class573 local36 = Class454.method29307(false, 613008897);
		local18.method7359(local26, this.aClass246Array21[0], 0);
		if (this.aClass658_5 != null) {
			@Pc(51) Class221 local51 = this.aClass658_5.method33244();
			arg0.method20964(local51);
		}
		this.aBoolean658 = local18.method7395();
		this.anInt3291 = local18.method7366() * 1011939531;
		local18.method7501();
		return local36;
	}

	@OriginalMember(owner = "client!aui", name = "c", descriptor = "(Lclient!di;II)Lclient!dn;")
	Class105 method24342(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class684 local5 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(arg2, 1547492743);
		@Pc(12) Class100 local12 = this.aClass570_23.aClass100Array3[this.aByte99];
		@Pc(27) Class100 local27 = this.aByte100 < 3 ? this.aClass570_23.aClass100Array3[this.aByte100 + 1] : null;
		@Pc(31) Class463 local31 = this.method24552().aClass463_61;
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1) ? local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, null, (byte) 2, -1827797700) : local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, this.aClass6_5, (byte) 2, -1827797700);
	}

	@OriginalMember(owner = "client!aui", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.anInt3291 * 616672483;
	}

	@OriginalMember(owner = "client!aui", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "v", descriptor = "()Z")
	public boolean method24343() {
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1);
	}

	@OriginalMember(owner = "client!aui", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aui", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		@Pc(9) Class105 local9 = this.method24336(arg0, 0, this.anInt3289 * -1198512123, -1878255500);
		if (local9 != null) {
			this.method24337(arg0, local9, this.method24526(), (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aui", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		@Pc(9) Class105 local9 = this.method24336(arg0, 0, this.anInt3289 * -1198512123, -1878255500);
		if (local9 != null) {
			this.method24337(arg0, local9, this.method24526(), (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aui", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		@Pc(9) Class105 local9 = this.method24336(arg0, 0, this.anInt3289 * -1198512123, -1878255500);
		if (local9 != null) {
			this.method24337(arg0, local9, this.method24526(), (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aui", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		@Pc(9) Class105 local9 = this.method24336(arg0, 0, this.anInt3289 * -1198512123, -1878255500);
		if (local9 != null) {
			this.method24337(arg0, local9, this.method24526(), (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aui", name = "m", descriptor = "()I")
	public int method24344() {
		return this.anInt3290 * 94765487;
	}

	@OriginalMember(owner = "client!aui", name = "o", descriptor = "()I")
	public int method24345() {
		return this.anInt3290 * 94765487;
	}

	@OriginalMember(owner = "client!aui", name = "j", descriptor = "()I")
	public int method24346() {
		return this.anInt3290 * 94765487;
	}

	@OriginalMember(owner = "client!aui", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aui", name = "x", descriptor = "(I)V")
	public void method24347(@OriginalArg(0) int arg0) {
		if (this.aClass6_5 != null && !this.aClass6_5.method23658((byte) 1)) {
			this.aClass6_5.method23601(arg0, -2046723527);
		}
	}

	@OriginalMember(owner = "client!aui", name = "k", descriptor = "(I)V")
	public void method24348(@OriginalArg(0) int arg0) {
		if (this.aClass6_5 != null && !this.aClass6_5.method23658((byte) 1)) {
			this.aClass6_5.method23601(arg0, -1736638451);
		}
	}

	@OriginalMember(owner = "client!aui", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "ax", descriptor = "()V")
	public void method24349() {
		if (this.aClass658_5 != null) {
			this.aClass658_5.method33233();
		}
	}

	@OriginalMember(owner = "client!aui", name = "r", descriptor = "()Z")
	public boolean method24350() {
		return this.aClass6_5 != null && !this.aClass6_5.method23589((byte) 78);
	}

	@OriginalMember(owner = "client!aui", name = "q", descriptor = "()Z")
	public boolean method24351() {
		return this.aClass6_5 != null && !this.aClass6_5.method23589((byte) 124);
	}

	@OriginalMember(owner = "client!aui", name = "i", descriptor = "(B)V")
	public void method24352(@OriginalArg(0) byte arg0) {
		if (this.aClass658_5 != null) {
			this.aClass658_5.method33233();
		}
	}

	@OriginalMember(owner = "client!aui", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class105 local18 = this.method24336(arg0, (this.anInt3288 * -840797647 == 0 ? 0 : 5) | 0x800, this.anInt3289 * -1198512123, -1878255500);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Class471 local26 = this.method24526();
		this.method24337(arg0, local18, local26, (byte) 0);
		@Pc(36) Class573 local36 = Class454.method29307(false, -594481257);
		local18.method7359(local26, this.aClass246Array21[0], 0);
		if (this.aClass658_5 != null) {
			@Pc(51) Class221 local51 = this.aClass658_5.method33244();
			arg0.method20964(local51);
		}
		this.aBoolean658 = local18.method7395();
		this.anInt3291 = local18.method7366() * 1011939531;
		local18.method7501();
		return local36;
	}

	@OriginalMember(owner = "client!aui", name = "z", descriptor = "()Z")
	public boolean method24353() {
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1);
	}

	@OriginalMember(owner = "client!aui", name = "p", descriptor = "()Z")
	public boolean method24354() {
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1);
	}

	@OriginalMember(owner = "client!aui", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class105 local9 = this.method24336(arg0, 0, this.anInt3289 * -1198512123, -1878255500);
		if (local9 != null) {
			this.method24337(arg0, local9, this.method24526(), (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aui", name = "n", descriptor = "(Lclient!di;II)Lclient!dn;")
	Class105 method24355(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class684 local5 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(arg2, -1116669382);
		@Pc(12) Class100 local12 = this.aClass570_23.aClass100Array3[this.aByte99];
		@Pc(27) Class100 local27 = this.aByte100 < 3 ? this.aClass570_23.aClass100Array3[this.aByte100 + 1] : null;
		@Pc(31) Class463 local31 = this.method24552().aClass463_61;
		return this.aClass6_5 == null || this.aClass6_5.method23658((byte) 1) ? local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, null, (byte) 2, -1827797700) : local5.method36777(arg0, arg1, this.anInt3288 * 328304640, local12, local27, (int) local31.aFloat297, (int) local31.aFloat295, (int) local31.aFloat296, this.aClass6_5, (byte) 2, -1827797700);
	}

	@OriginalMember(owner = "client!aui", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!aui", name = "b", descriptor = "()V")
	public void method24356() {
		if (this.aClass658_5 != null) {
			this.aClass658_5.method33233();
		}
	}

	@OriginalMember(owner = "client!aui", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}
}
