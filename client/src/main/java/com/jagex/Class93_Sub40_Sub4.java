package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asz")
public class Class93_Sub40_Sub4 extends Class93_Sub40 {

	@OriginalMember(owner = "client!asz", name = "w", descriptor = "I")
	final int anInt3173;

	@OriginalMember(owner = "client!asz", name = "<init>", descriptor = "(III)V", line = 13)
	public Class93_Sub40_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt3173 = arg2 * 1412759657;
	}

	@OriginalMember(owner = "client!asz", name = "e", descriptor = "(B)Z", line = 18)
	@Override
	public boolean method23193(@OriginalArg(0) byte arg0) {
		@Pc(8) Class93_Sub15 local8 = (Class93_Sub15) client.aClass16_18.method214((long) (this.anInt3173 * -367489063));
		if (local8 == null) {
			return false;
		} else {
			Class305.method26800(Class155.aClass155_61, this.anInt3172 * 1220811495, -1, (Class132_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3173 * -367489063, 898584205);
			return true;
		}
	}

	@OriginalMember(owner = "client!asz", name = "k", descriptor = "()Z", line = 18)
	@Override
	public boolean method23195() {
		@Pc(8) Class93_Sub15 local8 = (Class93_Sub15) client.aClass16_18.method214((long) (this.anInt3173 * -367489063));
		if (local8 == null) {
			return false;
		} else {
			Class305.method26800(Class155.aClass155_61, this.anInt3172 * 1220811495, -1, (Class132_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3173 * -367489063, 533137381);
			return true;
		}
	}

	@OriginalMember(owner = "client!asz", name = "m", descriptor = "()Z", line = 18)
	@Override
	public boolean method23194() {
		@Pc(8) Class93_Sub15 local8 = (Class93_Sub15) client.aClass16_18.method214((long) (this.anInt3173 * -367489063));
		if (local8 == null) {
			return false;
		} else {
			Class305.method26800(Class155.aClass155_61, this.anInt3172 * 1220811495, -1, (Class132_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3173 * -367489063, 1109439269);
			return true;
		}
	}

	@OriginalMember(owner = "client!asz", name = "n", descriptor = "()Z", line = 18)
	@Override
	public boolean method23192() {
		@Pc(8) Class93_Sub15 local8 = (Class93_Sub15) client.aClass16_18.method214((long) (this.anInt3173 * -367489063));
		if (local8 == null) {
			return false;
		} else {
			Class305.method26800(Class155.aClass155_61, this.anInt3172 * 1220811495, -1, (Class132_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3173 * -367489063, 1088049256);
			return true;
		}
	}
}
