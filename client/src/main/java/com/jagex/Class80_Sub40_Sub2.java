package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asr")
public final class Class80_Sub40_Sub2 extends Class80_Sub40 {

	@OriginalMember(owner = "client!asr", name = "g", descriptor = "I")
	final int anInt3139;

	@OriginalMember(owner = "client!asr", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	static String method22974(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!asr", name = "<init>", descriptor = "(III)V")
	public Class80_Sub40_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt3139 = arg2 * 2019764069;
	}

	@OriginalMember(owner = "client!asr", name = "f", descriptor = "()Z")
	@Override
	public boolean method23436() {
		@Pc(8) Class80_Sub19 local8 = (Class80_Sub19) client.aClass24_18.method560((long) (this.anInt3139 * -1902857619));
		if (local8 == null) {
			return false;
		} else {
			Class117.method8818(Class158.aClass158_61, this.anInt3156 * -151091669, -1, (Class120_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3139 * -1902857619, -272006857);
			return true;
		}
	}

	@OriginalMember(owner = "client!asr", name = "e", descriptor = "()Z")
	@Override
	public boolean method23438() {
		@Pc(8) Class80_Sub19 local8 = (Class80_Sub19) client.aClass24_18.method560((long) (this.anInt3139 * -1902857619));
		if (local8 == null) {
			return false;
		} else {
			Class117.method8818(Class158.aClass158_61, this.anInt3156 * -151091669, -1, (Class120_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3139 * -1902857619, -674608364);
			return true;
		}
	}

	@OriginalMember(owner = "client!asr", name = "t", descriptor = "(S)Z")
	@Override
	public boolean method23437(@OriginalArg(0) short arg0) {
		@Pc(8) Class80_Sub19 local8 = (Class80_Sub19) client.aClass24_18.method560((long) (this.anInt3139 * -1902857619));
		if (local8 == null) {
			return false;
		} else {
			Class117.method8818(Class158.aClass158_61, this.anInt3156 * -151091669, -1, (Class120_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3139 * -1902857619, 978338637);
			return true;
		}
	}
}
