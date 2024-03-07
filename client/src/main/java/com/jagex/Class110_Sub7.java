package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agd")
public class Class110_Sub7 extends Class110 {

	@OriginalMember(owner = "client!agd", name = "fw", descriptor = "Lclient!py;")
	public static Class497 aClass497_22;

	@OriginalMember(owner = "client!agd", name = "n", descriptor = "I")
	final int anInt908;

	@OriginalMember(owner = "client!agd", name = "m", descriptor = "I")
	final int anInt906;

	@OriginalMember(owner = "client!agd", name = "k", descriptor = "Ljava/lang/String;")
	final String aString28;

	@OriginalMember(owner = "client!agd", name = "f", descriptor = "I")
	final int anInt907;

	@OriginalMember(owner = "client!agd", name = "w", descriptor = "I")
	final int anInt909;

	@OriginalMember(owner = "client!agd", name = "<init>", descriptor = "(Lclient!alw;)V", line = 14)
	Class110_Sub7(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt908 = arg0.g2(-1434290800) * -1675416095;
		this.anInt906 = arg0.g2(-1434290800) * -307172735;
		this.aString28 = arg0.gjstr(1044052563);
		this.anInt907 = arg0.g4(-118643075) * 1048079171;
		this.anInt909 = arg0.g2(-1434290800) * -1986684691;
	}

	@OriginalMember(owner = "client!agd", name = "f", descriptor = "()V", line = 23)
	@Override
	public void method20150() {
		Class586.method31640(Class512.anInt5209 * 1177442423, this.anInt908 * -1732389343, this.anInt906 * 2071811457, Class305.method26802(this.anInt908 * -1732389343, this.anInt906 * 2071811457, Class512.anInt5209 * 1177442423, (byte) -114), this.anInt909 * 1294238949, this.anInt907 * 1147009387, this.aString28, -1341391550);
	}

	@OriginalMember(owner = "client!agd", name = "n", descriptor = "(I)V", line = 23)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		Class586.method31640(Class512.anInt5209 * 1177442423, this.anInt908 * -1732389343, this.anInt906 * 2071811457, Class305.method26802(this.anInt908 * -1732389343, this.anInt906 * 2071811457, Class512.anInt5209 * 1177442423, (byte) -71), this.anInt909 * 1294238949, this.anInt907 * 1147009387, this.aString28, -1341391550);
	}

	@OriginalMember(owner = "client!agd", name = "hv", descriptor = "(IIII)Lclient!ahm;", line = 5474)
	static Class132_Sub1_Sub1_Sub1 method7943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class572 local10 = client.world.method30481(-910933729).aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local10 == null) {
			return null;
		}
		@Pc(16) Class132_Sub1_Sub1_Sub1 local16 = null;
		@Pc(18) int local18 = -1;
		for (@Pc(21) Class590 local21 = local10.aClass590_1; local21 != null; local21 = local21.aClass590_2) {
			@Pc(27) Class132_Sub1_Sub1 local27 = local21.aClass132_Sub1_Sub1_1;
			if (local27 instanceof Class132_Sub1_Sub1_Sub1) {
				@Pc(33) Class132_Sub1_Sub1_Sub1 local33 = (Class132_Sub1_Sub1_Sub1) local27;
				@Pc(43) int local43 = (local33.method19986(-1772760255) - 1) * 256 + 252;
				@Pc(47) Class472 local47 = local33.method24220().aClass472_61;
				@Pc(55) int local55 = (int) local47.aFloat317 - local43 >> 9;
				@Pc(63) int local63 = (int) local47.aFloat319 - local43 >> 9;
				@Pc(71) int local71 = local43 + (int) local47.aFloat317 >> 9;
				@Pc(79) int local79 = (int) local47.aFloat319 + local43 >> 9;
				if (local55 <= arg1 && local63 <= arg2 && local71 >= arg1 && local79 >= arg2) {
					@Pc(103) int local103 = (local71 + 1 - arg1) * (local79 + 1 - arg2);
					if (local103 > local18) {
						local16 = local33;
						local18 = local103;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!agd", name = "oo", descriptor = "(Lclient!yf;I)V", line = 7514)
	static final void method7944(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1161216956);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class696.method36648(local16, local22, arg0, 1726868414);
	}
}
