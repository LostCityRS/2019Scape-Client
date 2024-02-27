package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asl")
public final class Class93_Sub40_Sub1 extends Class93_Sub40 {

	@OriginalMember(owner = "client!asl", name = "w", descriptor = "Lclient!yv;")
	final Class694 aClass694_1;

	@OriginalMember(owner = "client!asl", name = "<init>", descriptor = "(IILclient!yv;)V")
	public Class93_Sub40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class694 arg2) {
		super(arg0, arg1);
		this.aClass694_1 = arg2;
	}

	@OriginalMember(owner = "client!asl", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method23205(@OriginalArg(0) byte arg0) {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36801(1539644920);
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4, -1247706086);
			return true;
		}
	}

	@OriginalMember(owner = "client!asl", name = "m", descriptor = "()Z")
	@Override
	public boolean method23206() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36801(1539644920);
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4, 613623230);
			return true;
		}
	}

	@OriginalMember(owner = "client!asl", name = "n", descriptor = "()Z")
	@Override
	public boolean method23204() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36801(1539644920);
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4, 286250670);
			return true;
		}
	}

	@OriginalMember(owner = "client!asl", name = "k", descriptor = "()Z")
	@Override
	public boolean method23207() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36801(1539644920);
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4, 788574170);
			return true;
		}
	}
}
