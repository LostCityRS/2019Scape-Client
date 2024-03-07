package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agm")
public abstract class Class110_Sub15 extends Class110 {

	@OriginalMember(owner = "client!agm", name = "n", descriptor = "I")
	final int anInt2821;

	@OriginalMember(owner = "client!agm", name = "m", descriptor = "I")
	final int anInt2822;

	@OriginalMember(owner = "client!agm", name = "k", descriptor = "I")
	final int anInt2823;

	@OriginalMember(owner = "client!agm", name = "e", descriptor = "(Lclient!ov;B)F", line = 13)
	public static float method20151(@OriginalArg(0) Class471 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat318);
		local4.method29544();
		return (float) local14;
	}

	@OriginalMember(owner = "client!agm", name = "<init>", descriptor = "(Lclient!alw;)V", line = 14)
	Class110_Sub15(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt2821 = arg0.g2(-1434290800) * -1182122795;
		this.anInt2822 = arg0.g2(-1434290800) * -34475289;
		this.anInt2823 = arg0.g1((short) 16384) * 1877251199;
	}

	@OriginalMember(owner = "client!agm", name = "w", descriptor = "()Z", line = 21)
	@Override
	boolean method20142() {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt2821 * 1307909245, 1172914588);
		@Pc(12) boolean local12 = local8.method36677((byte) 25);
		@Pc(21) Class263 local21 = (Class263) Class32.aClass32_Sub17_23.method18261(local8.anInt5949 * 1477426425, 1528162838);
		return local12 & local21.method26188((byte) -85);
	}

	@OriginalMember(owner = "client!agm", name = "k", descriptor = "(I)Z", line = 21)
	@Override
	boolean method20141(@OriginalArg(0) int arg0) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt2821 * 1307909245, 1032226577);
		@Pc(12) boolean local12 = local8.method36677((byte) 83);
		@Pc(21) Class263 local21 = (Class263) Class32.aClass32_Sub17_23.method18261(local8.anInt5949 * 1477426425, 823738504);
		return local12 & local21.method26188((byte) -124);
	}

	@OriginalMember(owner = "client!agm", name = "l", descriptor = "()Z", line = 21)
	@Override
	boolean method20143() {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt2821 * 1307909245, -807075372);
		@Pc(12) boolean local12 = local8.method36677((byte) 8);
		@Pc(21) Class263 local21 = (Class263) Class32.aClass32_Sub17_23.method18261(local8.anInt5949 * 1477426425, 1642330214);
		return local12 & local21.method26188((byte) -99);
	}

	@OriginalMember(owner = "client!agm", name = "u", descriptor = "(II)V", line = 272)
	static void method20152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class172.anInt3176 = 0;
		@Pc(5) int local5 = client.aClass532_1.method30459(2067319058);
		@Pc(9) int local9 = client.aClass532_1.method30466((short) 128);
		@Pc(13) Class520 local13 = client.aClass532_1.method30487(-218524362);
		@Pc(17) Class585 local17 = client.aClass532_1.method30481(-1736355724);
		@Pc(21) Class32_Sub14 local21 = client.aClass532_1.method30496(959323443);
		@Pc(23) int local23 = arg0;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(39) int local39 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local32 >= 0 && local32 < Class690.aBooleanArrayArray15.length && local39 >= 0 && local39 < Class690.aBooleanArrayArray15[local32].length && Class690.aBooleanArrayArray15[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method30335(arg0, local73, local63, local68, (byte) -62)) && !Class393.method28314((Interface61) local17.method31556(local73, local63, local68, -968156135), local21, local63, local68, -1787817682) && !Class393.method28314((Interface61) local17.method31551(local73, local63, local68, client.anInterface62_1, (byte) 3), local21, local63, local68, -1944175185) && !Class393.method28314((Interface61) local17.method31534(local73, local63, local68, -1309876799), local21, local63, local68, -1724839160) && Class393.method28314((Interface61) local17.method31544(local73, local63, local68, -2076759954), local21, local63, local68, -2055902105)) {
					}
				}
			}
		}
	}
}
