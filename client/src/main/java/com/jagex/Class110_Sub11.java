package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agh")
public class Class110_Sub11 extends Class110 {

	@OriginalMember(owner = "client!agh", name = "n", descriptor = "I")
	static final int anInt930 = 0;

	@OriginalMember(owner = "client!agh", name = "m", descriptor = "I")
	static final int anInt940 = 1;

	@OriginalMember(owner = "client!agh", name = "w", descriptor = "I")
	final int anInt933;

	@OriginalMember(owner = "client!agh", name = "l", descriptor = "I")
	final int anInt934;

	@OriginalMember(owner = "client!agh", name = "f", descriptor = "I")
	final int anInt932;

	@OriginalMember(owner = "client!agh", name = "p", descriptor = "I")
	final int anInt937;

	@OriginalMember(owner = "client!agh", name = "d", descriptor = "I")
	final int anInt929;

	@OriginalMember(owner = "client!agh", name = "z", descriptor = "I")
	final int anInt936;

	@OriginalMember(owner = "client!agh", name = "k", descriptor = "I")
	final int anInt931;

	@OriginalMember(owner = "client!agh", name = "r", descriptor = "I")
	final int anInt938;

	@OriginalMember(owner = "client!agh", name = "u", descriptor = "I")
	final int anInt935;

	@OriginalMember(owner = "client!agh", name = "c", descriptor = "I")
	final int anInt939;

	@OriginalMember(owner = "client!agh", name = "v", descriptor = "I")
	final int anInt941;

	@OriginalMember(owner = "client!agh", name = "o", descriptor = "I")
	final int anInt942;

	@OriginalMember(owner = "client!agh", name = "s", descriptor = "I")
	final int anInt943;

	@OriginalMember(owner = "client!agh", name = "e", descriptor = "(III)I", line = 9)
	static int method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!agh", name = "<init>", descriptor = "(Lclient!alw;II)V", line = 30)
	Class110_Sub11(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(9) int local9;
		if (arg1 == 0) {
			local9 = arg0.g4(-118643075);
			this.anInt933 = (local9 >>> 16) * -1303235529;
			this.anInt934 = (local9 & 0xFFFF) * 1178864451;
			this.anInt932 = -1889407193;
		} else {
			this.anInt933 = 1303235529;
			this.anInt934 = -1178864451;
			this.anInt932 = arg0.g2(-1434290800) * 1889407193;
		}
		if (arg2 == 0) {
			local9 = arg0.g4(-118643075);
			this.anInt937 = (local9 >>> 16) * -1867476009;
			this.anInt929 = (local9 & 0xFFFF) * -2070099137;
			this.anInt936 = 1747394353;
		} else {
			this.anInt937 = 1867476009;
			this.anInt929 = 2070099137;
			this.anInt936 = arg0.g2(-1434290800) * -1747394353;
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt931 = arg0.g1((short) 16384) * -1096938529;
		} else {
			this.anInt931 = 1096938529;
		}
		this.anInt938 = arg0.g2(-1434290800) * 1126664009;
		this.anInt935 = arg0.g1((short) 16384) * 763612073;
		this.anInt939 = arg0.g1((short) 16384) * -1078377849;
		this.anInt941 = arg0.g3((short) 20112) * 695785621;
		this.anInt942 = arg0.g2(-1434290800) * 1398834857;
		this.anInt943 = arg0.g1((short) 16384) * -804916185;
	}

	@OriginalMember(owner = "client!agh", name = "n", descriptor = "(I)V", line = 69)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class132_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class472 local37;
		if (this.anInt933 * -1702903417 >= 0) {
			local11 = this.anInt933 * -8188416 + 256;
			local18 = this.anInt934 * -290269696 + 256;
			local23 = this.anInt931 * -1078628321;
		} else {
			local33 = Class249.aClass239Array1[this.anInt932 * 2057662313].method25813(105270749);
			local37 = local33.method24220().aClass472_61;
			local11 = (int) local37.aFloat317;
			local18 = (int) local37.aFloat319;
			local23 = local33.aByte100;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt934 * -1258858133 >= 0) {
			local60 = this.anInt937 * -836776448 + 256;
			local67 = this.anInt929 * 1632206336 + 256;
		} else {
			local33 = Class249.aClass239Array1[this.anInt936 * -1993333201].method25813(-1530361495);
			local37 = local33.method24220().aClass472_61;
			local60 = (int) local37.aFloat317;
			local67 = (int) local37.aFloat319;
			if (local23 < 0) {
				local23 = local33.aByte100;
			}
		}
		@Pc(101) int local101 = this.anInt943 * -737657961 << 2;
		@Pc(155) Class132_Sub1_Sub1_Sub4 local155 = new Class132_Sub1_Sub1_Sub4(client.world.method30481(-1772585750), this.anInt938 * 1146100473, local23, local23, local11, local18, this.anInt935 * -642905959 << 2, client.anInt3485, client.anInt3485 + this.anInt941 * 1271870141, this.anInt942 * -1988657767, local101, this.anInt932 * 2057662313 + 1, this.anInt936 * -1993333201 + 1, this.anInt939 * 2036589367 << 2, false, 0, 0);
		local155.method23915(local60, local67, this.anInt939 * 2036589367 << 2, client.anInt3485 + this.anInt941 * 1271870141, -1511764208);
		client.aClass22_46.method408(new Class93_Sub1_Sub6(local155), -1121761134);
	}

	@OriginalMember(owner = "client!agh", name = "f", descriptor = "()V", line = 69)
	@Override
	public void method20150() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class132_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class472 local37;
		if (this.anInt933 * -1702903417 >= 0) {
			local11 = this.anInt933 * -8188416 + 256;
			local18 = this.anInt934 * -290269696 + 256;
			local23 = this.anInt931 * -1078628321;
		} else {
			local33 = Class249.aClass239Array1[this.anInt932 * 2057662313].method25813(-810802185);
			local37 = local33.method24220().aClass472_61;
			local11 = (int) local37.aFloat317;
			local18 = (int) local37.aFloat319;
			local23 = local33.aByte100;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt934 * -1258858133 >= 0) {
			local60 = this.anInt937 * -836776448 + 256;
			local67 = this.anInt929 * 1632206336 + 256;
		} else {
			local33 = Class249.aClass239Array1[this.anInt936 * -1993333201].method25813(-321403859);
			local37 = local33.method24220().aClass472_61;
			local60 = (int) local37.aFloat317;
			local67 = (int) local37.aFloat319;
			if (local23 < 0) {
				local23 = local33.aByte100;
			}
		}
		@Pc(101) int local101 = this.anInt943 * -737657961 << 2;
		@Pc(155) Class132_Sub1_Sub1_Sub4 local155 = new Class132_Sub1_Sub1_Sub4(client.world.method30481(-2018361671), this.anInt938 * 1146100473, local23, local23, local11, local18, this.anInt935 * -642905959 << 2, client.anInt3485, client.anInt3485 + this.anInt941 * 1271870141, this.anInt942 * -1988657767, local101, this.anInt932 * 2057662313 + 1, this.anInt936 * -1993333201 + 1, this.anInt939 * 2036589367 << 2, false, 0, 0);
		local155.method23915(local60, local67, this.anInt939 * 2036589367 << 2, client.anInt3485 + this.anInt941 * 1271870141, 63616125);
		client.aClass22_46.method408(new Class93_Sub1_Sub6(local155), -1227466539);
	}

	@OriginalMember(owner = "client!agh", name = "w", descriptor = "()Z", line = 99)
	@Override
	boolean method20142() {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt938 * 1146100473, 1465060205);
		@Pc(12) boolean local12 = local8.method36677((byte) 125);
		@Pc(21) Class263 local21 = (Class263) Class32.aClass32_Sub17_23.method18261(local8.anInt5949 * 1477426425, 372391303);
		return local12 & local21.method26188((byte) -98);
	}

	@OriginalMember(owner = "client!agh", name = "k", descriptor = "(I)Z", line = 99)
	@Override
	boolean method20141(@OriginalArg(0) int arg0) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt938 * 1146100473, 284623986);
		@Pc(12) boolean local12 = local8.method36677((byte) 109);
		@Pc(21) Class263 local21 = (Class263) Class32.aClass32_Sub17_23.method18261(local8.anInt5949 * 1477426425, 1983296110);
		return local12 & local21.method26188((byte) -118);
	}

	@OriginalMember(owner = "client!agh", name = "l", descriptor = "()Z", line = 99)
	@Override
	boolean method20143() {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt938 * 1146100473, -1249388411);
		@Pc(12) boolean local12 = local8.method36677((byte) 97);
		@Pc(21) Class263 local21 = (Class263) Class32.aClass32_Sub17_23.method18261(local8.anInt5949 * 1477426425, 380338810);
		return local12 & local21.method26188((byte) -19);
	}

	@OriginalMember(owner = "client!agh", name = "akh", descriptor = "(Lclient!yf;I)V", line = 11627)
	static final void method8006(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class110_Sub5.method7655(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, 2115334132);
	}
}
