package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afz")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!afz", name = "hn", descriptor = "Lclient!aoy;")
	public static Class41_Sub20 aClass41_Sub20_1;

	@OriginalMember(owner = "client!afz", name = "e", descriptor = "Lclient!pf;")
	Class480 aClass480_18;

	@OriginalMember(owner = "client!afz", name = "mv", descriptor = "(Ljava/lang/String;I)V")
	public static void method7796(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) String local7 = Class635.method32821(arg0, Class126.aClass91_13, 556662673);
		if (local7 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < client.anInt3519 * 227319795; local13++) {
			@Pc(22) Class699 local22 = client.aClass699Array1[local13];
			@Pc(25) String local25 = local22.aString244;
			@Pc(30) String local30 = Class635.method32821(local25, Class126.aClass91_13, -1722700941);
			if (Class564.method31477(arg0, local7, local25, local30, -898698696)) {
				client.anInt3519 -= 1143476539;
				for (@Pc(43) int local43 = local13; local43 < client.anInt3519 * 227319795; local43++) {
					client.aClass699Array1[local43] = client.aClass699Array1[local43 + 1];
				}
				client.anInt3553 = client.anInt3569 * -799307175;
				@Pc(65) Class75 local65 = Class52.method1074(16777215);
				@Pc(71) Class80_Sub31 local71 = Class623.method32440(Class443.aClass443_34, local65.aClass22_1, -191270971);
				local71.aPacketBit_2.p1(Class350.method28013(arg0, (short) 16383));
				local71.aPacketBit_2.pjstr(arg0);
				local65.method1325(local71, (byte) -14);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!afz", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class111_Sub1(@OriginalArg(0) Class480 arg0) {
		this.aClass480_18 = arg0;
	}

	@OriginalMember(owner = "client!afz", name = "r", descriptor = "(Lclient!vl;I)[B")
	@Override
	byte[] method7778(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1) {
		return this.aClass480_18.method29928(arg1, -2119205436) ? this.aClass480_18.method29926(arg1, 1472047355) : null;
	}

	@OriginalMember(owner = "client!afz", name = "e", descriptor = "(Lclient!vl;IILclient!vm;FIIZB)Z")
	@Override
	public boolean method7763(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class617 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8) {
		@Pc(1) boolean local1 = true;
		if (Class616.aClass616_2 == arg0) {
			if (arg2 > -1 && this.aClass480_18.method29928(arg2, -2145250272)) {
				local1 = this.aClass480_18.method29945(arg2, (byte) 1);
			}
			return local1 & this.aClass480_18.method29945(arg1, (byte) 1);
		} else if (Class616.aClass616_3 == arg0) {
			return this.aClass480_18.method29945(arg1, (byte) 1);
		} else if (arg0 == Class616.aClass616_1) {
			return this.aClass480_18.method29945(arg2, (byte) 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afz", name = "f", descriptor = "(Lclient!vl;II)[B")
	@Override
	byte[] method7769(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aClass480_18.method29928(arg1, -2144293139) ? this.aClass480_18.method29926(arg1, 1472047355) : null;
	}

	@OriginalMember(owner = "client!afz", name = "w", descriptor = "(Lclient!vl;I)[B")
	@Override
	byte[] method7777(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1) {
		return this.aClass480_18.method29928(arg1, -2122360219) ? this.aClass480_18.method29926(arg1, 1472047355) : null;
	}

	@OriginalMember(owner = "client!afz", name = "q", descriptor = "(Lclient!vl;I)[B")
	@Override
	byte[] method7779(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1) {
		return this.aClass480_18.method29928(arg1, -2124463182) ? this.aClass480_18.method29926(arg1, 1472047355) : null;
	}

	@OriginalMember(owner = "client!afz", name = "x", descriptor = "(Lclient!vl;I)[B")
	@Override
	byte[] method7776(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1) {
		return this.aClass480_18.method29928(arg1, -2140912610) ? this.aClass480_18.method29926(arg1, 1472047355) : null;
	}

	@OriginalMember(owner = "client!afz", name = "k", descriptor = "(Lclient!vl;IILclient!vm;FIIZ)Z")
	@Override
	public boolean method7762(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class617 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) boolean local1 = true;
		if (Class616.aClass616_2 == arg0) {
			if (arg2 > -1 && this.aClass480_18.method29928(arg2, -2136803158)) {
				local1 = this.aClass480_18.method29945(arg2, (byte) 1);
			}
			return local1 & this.aClass480_18.method29945(arg1, (byte) 1);
		} else if (Class616.aClass616_3 == arg0) {
			return this.aClass480_18.method29945(arg1, (byte) 1);
		} else if (arg0 == Class616.aClass616_1) {
			return this.aClass480_18.method29945(arg2, (byte) 1);
		} else {
			return false;
		}
	}
}
