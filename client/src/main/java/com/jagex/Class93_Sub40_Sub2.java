package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asn")
public class Class93_Sub40_Sub2 extends Class93_Sub40 {

	@OriginalMember(owner = "client!asn", name = "w", descriptor = "Lclient!yd;")
	final Class679 aClass679_1;

	@OriginalMember(owner = "client!asn", name = "<init>", descriptor = "(IILclient!yd;)V", line = 12)
	public Class93_Sub40_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class679 arg2) {
		super(arg0, arg1);
		this.aClass679_1 = arg2;
	}

	@OriginalMember(owner = "client!asn", name = "e", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method23193(@OriginalArg(0) byte arg0) {
		@Pc(4) Class132_Sub1_Sub5_Sub1 local4 = this.aClass679_1.method33235(-2072112600);
		if (local4 == null) {
			return false;
		} else {
			Class593.method31717(Class155.aClass155_47, this.anInt3172 * 1220811495, -1, this.aClass679_1, local4, -815177908);
			return true;
		}
	}

	@OriginalMember(owner = "client!asn", name = "n", descriptor = "()Z", line = 17)
	@Override
	public boolean method23192() {
		@Pc(4) Class132_Sub1_Sub5_Sub1 local4 = this.aClass679_1.method33235(-2004809038);
		if (local4 == null) {
			return false;
		} else {
			Class593.method31717(Class155.aClass155_47, this.anInt3172 * 1220811495, -1, this.aClass679_1, local4, -1538693267);
			return true;
		}
	}

	@OriginalMember(owner = "client!asn", name = "m", descriptor = "()Z", line = 17)
	@Override
	public boolean method23194() {
		@Pc(4) Class132_Sub1_Sub5_Sub1 local4 = this.aClass679_1.method33235(-1846085677);
		if (local4 == null) {
			return false;
		} else {
			Class593.method31717(Class155.aClass155_47, this.anInt3172 * 1220811495, -1, this.aClass679_1, local4, 348420724);
			return true;
		}
	}

	@OriginalMember(owner = "client!asn", name = "k", descriptor = "()Z", line = 17)
	@Override
	public boolean method23195() {
		@Pc(4) Class132_Sub1_Sub5_Sub1 local4 = this.aClass679_1.method33235(-1831012150);
		if (local4 == null) {
			return false;
		} else {
			Class593.method31717(Class155.aClass155_47, this.anInt3172 * 1220811495, -1, this.aClass679_1, local4, 1228424317);
			return true;
		}
	}
}
