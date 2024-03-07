package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahd")
public class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "Lclient!jn;")
	Interface29 anInterface29_1;

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "Z")
	boolean aBoolean183;

	@OriginalMember(owner = "client!ahd", name = "l", descriptor = "I")
	int anInt1016;

	@OriginalMember(owner = "client!ahd", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_14 = new Class472();

	@OriginalMember(owner = "client!ahd", name = "k", descriptor = "Lclient!ov;")
	public final Class471 aClass471_1 = new Class471();

	@OriginalMember(owner = "client!ahd", name = "w", descriptor = "I")
	int anInt1017 = 1269037352;

	@OriginalMember(owner = "client!ahd", name = "u", descriptor = "Lclient!ox;")
	final Class472 aClass472_15 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahd", name = "z", descriptor = "Lclient!ox;")
	final Class472 aClass472_16 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahd", name = "p", descriptor = "Lclient!ox;")
	final Class472 aClass472_17 = new Class472();

	@OriginalMember(owner = "client!ahd", name = "d", descriptor = "Lclient!ov;")
	final Class471 aClass471_2 = new Class471();

	@OriginalMember(owner = "client!ahd", name = "<init>", descriptor = "(Lclient!je;)V", line = 28)
	public Class124_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "t", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;III)V", line = 32)
	public void method9158(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29550(arg1);
		this.aClass471_1.method29477(arg2);
		this.aBoolean183 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19938((byte) 83).anInt1609 * -157762799;
		this.method9170(arg5, arg6, arg7, arg8, (byte) -30);
	}

	@OriginalMember(owner = "client!ahd", name = "am", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;II)V", line = 32)
	public void method9159(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29550(arg1);
		this.aClass471_1.method29477(arg2);
		this.aBoolean183 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19938((byte) 98).anInt1609 * -157762799;
		this.method9170(arg5, arg6, arg7, arg8, (byte) -94);
	}

	@OriginalMember(owner = "client!ahd", name = "ad", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;II)V", line = 32)
	public void method9160(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29550(arg1);
		this.aClass471_1.method29477(arg2);
		this.aBoolean183 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19938((byte) 30).anInt1609 * -157762799;
		this.method9170(arg5, arg6, arg7, arg8, (byte) -87);
	}

	@OriginalMember(owner = "client!ahd", name = "ae", descriptor = "(B)V", line = 42)
	public void method9161(@OriginalArg(0) byte arg0) {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method9018(-1893827957).method36705(this.anInterface29_1.method19946(65280), this.anInterface29_1.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ap", descriptor = "()V", line = 42)
	public void method9162() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method9018(-2125406909).method36705(this.anInterface29_1.method19946(65280), this.anInterface29_1.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "au", descriptor = "()V", line = 42)
	public void method9163() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method9018(-1800086256).method36705(this.anInterface29_1.method19946(65280), this.anInterface29_1.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ar", descriptor = "()V", line = 42)
	public void method9164() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method9018(-1820079769).method36705(this.anInterface29_1.method19946(65280), this.anInterface29_1.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "b", descriptor = "(F[[[ILclient!qx;II)V", line = 48)
	@Override
	public void method21425(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9170(arg1, arg2, arg3, arg4, (byte) -117);
		@Pc(14) Class471 local14 = this.method9167((byte) 27);
		this.aClass471_2.method29519(local14, this.aClass123_13.method9060((short) -26138));
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29477(local14);
		}
		local14.method29467();
		this.aClass472_16.method29550(this.anInterface29_1.method19938((byte) 90).method13881(-1459860639));
		this.aClass123_13.method8931(true, arg0, this.aClass472_15, this.aClass123_13.method9049(1602690230), this.aClass472_16, this.aClass472_17, (byte) 6);
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V", line = 48)
	@Override
	public void method21427(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9170(arg1, arg2, arg3, arg4, (byte) -76);
		@Pc(14) Class471 local14 = this.method9167((byte) 47);
		this.aClass471_2.method29519(local14, this.aClass123_13.method9060((short) 23764));
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29477(local14);
		}
		local14.method29467();
		this.aClass472_16.method29550(this.anInterface29_1.method19938((byte) 46).method13881(-268123421));
		this.aClass123_13.method8931(true, arg0, this.aClass472_15, this.aClass123_13.method9049(1344859316), this.aClass472_16, this.aClass472_17, (byte) -14);
	}

	@OriginalMember(owner = "client!ahd", name = "h", descriptor = "(F[[[ILclient!qx;II)V", line = 48)
	@Override
	public void method21420(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9170(arg1, arg2, arg3, arg4, (byte) -99);
		@Pc(14) Class471 local14 = this.method9167((byte) 65);
		this.aClass471_2.method29519(local14, this.aClass123_13.method9060((short) 9655));
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29477(local14);
		}
		local14.method29467();
		this.aClass472_16.method29550(this.anInterface29_1.method19938((byte) 104).method13881(-1383603256));
		this.aClass123_13.method8931(true, arg0, this.aClass472_15, this.aClass123_13.method9049(779427991), this.aClass472_16, this.aClass472_17, (byte) -1);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(F[[[ILclient!qx;II)V", line = 48)
	@Override
	public void method21428(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9170(arg1, arg2, arg3, arg4, (byte) -109);
		@Pc(14) Class471 local14 = this.method9167((byte) 56);
		this.aClass471_2.method29519(local14, this.aClass123_13.method9060((short) 9640));
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29477(local14);
		}
		local14.method29467();
		this.aClass472_16.method29550(this.anInterface29_1.method19938((byte) 39).method13881(853071011));
		this.aClass123_13.method8931(true, arg0, this.aClass472_15, this.aClass123_13.method9049(2042065343), this.aClass472_16, this.aClass472_17, (byte) -18);
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "(B)V", line = 59)
	static void method9166(@OriginalArg(0) byte arg0) {
		Class173.aClass240_64.method25860(1161602830);
	}

	@OriginalMember(owner = "client!ahd", name = "ag", descriptor = "(B)Lclient!ov;", line = 61)
	Class471 method9167(@OriginalArg(0) byte arg0) {
		@Pc(3) Class471 local3 = Class471.method29466(this.aClass471_1);
		if (this.aBoolean183) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19937((byte) -62);
			if (local11.method29593() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29535(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19939(65535);
				local11.method29623(local30);
			}
			local11.aFloat318 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat317, (double) local11.aFloat319);
			local11.method29544();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29482(0.0F, 1.0F, 0.0F, local45);
			local3.method29510(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "ax", descriptor = "()Lclient!ov;", line = 61)
	Class471 method9168() {
		@Pc(3) Class471 local3 = Class471.method29466(this.aClass471_1);
		if (this.aBoolean183) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19937((byte) -49);
			if (local11.method29593() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29535(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19939(65535);
				local11.method29623(local30);
			}
			local11.aFloat318 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat317, (double) local11.aFloat319);
			local11.method29544();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29482(0.0F, 1.0F, 0.0F, local45);
			local3.method29510(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "aq", descriptor = "()Lclient!ov;", line = 61)
	Class471 method9169() {
		@Pc(3) Class471 local3 = Class471.method29466(this.aClass471_1);
		if (this.aBoolean183) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19937((byte) 1);
			if (local11.method29593() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29535(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19939(65535);
				local11.method29623(local30);
			}
			local11.aFloat318 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat317, (double) local11.aFloat319);
			local11.method29544();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29482(0.0F, 1.0F, 0.0F, local45);
			local3.method29510(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "ah", descriptor = "([[[ILclient!qx;IIB)V", line = 80)
	void method9170(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.method21407(-338882669) || !this.aClass123_13.method9079(-670900429) && !this.aClass123_13.method9080(427282430)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938((byte) 99);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method9080(-2113907928) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 831401248);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local103.method29623(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29535(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29564();
		@Pc(120) float local120 = Class472.method29586(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29535(1.0F, 0.0F, 0.0F);
			local148.method29623(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29459();
			local154.method29478(local148, local135);
			this.aClass471_1.method29510(local154);
			this.aClass471_1.method29495();
			local148.method29544();
			local154.method29467();
			local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 1473422373);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "av", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9171(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(-1146669639) || !this.aClass123_13.method9079(-841598397) && !this.aClass123_13.method9080(-2014046209)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938((byte) 29);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method9080(641939926) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 2026829681);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local103.method29623(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29535(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29564();
		@Pc(120) float local120 = Class472.method29586(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29535(1.0F, 0.0F, 0.0F);
			local148.method29623(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29459();
			local154.method29478(local148, local135);
			this.aClass471_1.method29510(local154);
			this.aClass471_1.method29495();
			local148.method29544();
			local154.method29467();
			local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 2042710845);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ao", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9172(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(-811652722) || !this.aClass123_13.method9079(1469855959) && !this.aClass123_13.method9080(-343419890)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938((byte) 79);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method9080(-1842568185) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 1866076324);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local103.method29623(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29535(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29564();
		@Pc(120) float local120 = Class472.method29586(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29535(1.0F, 0.0F, 0.0F);
			local148.method29623(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29459();
			local154.method29478(local148, local135);
			this.aClass471_1.method29510(local154);
			this.aClass471_1.method29495();
			local148.method29544();
			local154.method29467();
			local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 855950192);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "aj", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9173(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(1441795224) || !this.aClass123_13.method9079(-957457219) && !this.aClass123_13.method9080(663285406)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938((byte) 55);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method9080(-1950859585) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 1952415296);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local103.method29623(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29535(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29564();
		@Pc(120) float local120 = Class472.method29586(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29535(1.0F, 0.0F, 0.0F);
			local148.method29623(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29459();
			local154.method29478(local148, local135);
			this.aClass471_1.method29510(local154);
			this.aClass471_1.method29495();
			local148.method29544();
			local154.method29467();
			local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 1104046528);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ay", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9174(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(1105318035) || !this.aClass123_13.method9079(-1658735763) && !this.aClass123_13.method9080(1786354635)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938((byte) 50);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method9080(-598964394) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 1536197075);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local103.method29623(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29535(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29564();
		@Pc(120) float local120 = Class472.method29586(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29535(1.0F, 0.0F, 0.0F);
			local148.method29623(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29459();
			local154.method29478(local148, local135);
			this.aClass471_1.method29510(local154);
			this.aClass471_1.method29495();
			local148.method29544();
			local154.method29467();
			local88 = this.method9175(arg0, arg1, arg2, arg3, local29, local31, 1764096254);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "al", descriptor = "([[[ILclient!qx;IIIZI)F", line = 129)
	float method9175(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class471 local3 = this.method9167((byte) 111);
		@Pc(8) Class472 local8 = this.method9178(local3, -1881799096);
		local3.method29467();
		@Pc(18) int local18 = (int) local8.aFloat317 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat319 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29544();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30330(local18, local26, -662808309)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat317 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat319 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat318;
		local8.method29544();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "ab", descriptor = "([[[ILclient!qx;IIIZ)F", line = 129)
	float method9176(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9167((byte) 93);
		@Pc(8) Class472 local8 = this.method9178(local3, 1227212306);
		local3.method29467();
		@Pc(18) int local18 = (int) local8.aFloat317 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat319 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29544();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30330(local18, local26, -662808309)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat317 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat319 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat318;
		local8.method29544();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "az", descriptor = "([[[ILclient!qx;IIIZ)F", line = 129)
	float method9177(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9167((byte) 117);
		@Pc(8) Class472 local8 = this.method9178(local3, 134673490);
		local3.method29467();
		@Pc(18) int local18 = (int) local8.aFloat317 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat319 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29544();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30330(local18, local26, -662808309)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat317 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat319 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat318;
		local8.method29544();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "ac", descriptor = "(Lclient!ov;I)Lclient!ox;", line = 158)
	Class472 method9178(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_14);
		local3.method29623(arg0);
		@Pc(11) Class472 local11 = Class472.method29573(this.aClass472_16, local3);
		local3.method29544();
		return local11;
	}

	@OriginalMember(owner = "client!ahd", name = "aa", descriptor = "(Lclient!ov;)Lclient!ox;", line = 158)
	Class472 method9179(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_14);
		local3.method29623(arg0);
		@Pc(11) Class472 local11 = Class472.method29573(this.aClass472_16, local3);
		local3.method29544();
		return local11;
	}

	@OriginalMember(owner = "client!ahd", name = "z", descriptor = "()Z", line = 166)
	@Override
	public boolean method21414() {
		return !Float.isNaN(this.aClass472_15.aFloat317);
	}

	@OriginalMember(owner = "client!ahd", name = "p", descriptor = "()Z", line = 166)
	@Override
	public boolean method21415() {
		return !Float.isNaN(this.aClass472_15.aFloat317);
	}

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "(I)Z", line = 166)
	@Override
	public boolean method21407(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_15.aFloat317);
	}

	@OriginalMember(owner = "client!ahd", name = "m", descriptor = "(B)Lclient!ox;", line = 170)
	@Override
	public Class472 method21408(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_14);
		local3.method29623(this.aClass471_2);
		@Pc(12) Class472 local12 = Class472.method29573(this.aClass472_15, local3);
		local3.method29544();
		return local12;
	}

	@OriginalMember(owner = "client!ahd", name = "g", descriptor = "()Lclient!ox;", line = 170)
	@Override
	public Class472 method21429() {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_14);
		local3.method29623(this.aClass471_2);
		@Pc(12) Class472 local12 = Class472.method29573(this.aClass472_15, local3);
		local3.method29544();
		return local12;
	}

	@OriginalMember(owner = "client!ahd", name = "k", descriptor = "(I)[D", line = 178)
	@Override
	public double[] method21419(@OriginalArg(0) int arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21408((byte) 101);
		local2[0] = local6.aFloat317;
		local2[1] = local6.aFloat318;
		local2[2] = local6.aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ahd", name = "d", descriptor = "()[D", line = 178)
	@Override
	public double[] method21409() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21408((byte) 20);
		local2[0] = local6.aFloat317;
		local2[1] = local6.aFloat318;
		local2[2] = local6.aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ahd", name = "c", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21417() {
		@Pc(3) Class472 local3 = this.method21408((byte) 52);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29544();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "v", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21418() {
		@Pc(3) Class472 local3 = this.method21408((byte) 111);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29544();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "o", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21416() {
		@Pc(3) Class472 local3 = this.method21408((byte) 123);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29544();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "(B)Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21410(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = this.method21408((byte) 40);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29544();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "r", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21426() {
		@Pc(3) Class472 local3 = this.method21408((byte) 63);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29544();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "af", descriptor = "()Lclient!ox;", line = 194)
	public Class472 method9180() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "ai", descriptor = "(I)Lclient!ox;", line = 194)
	public Class472 method9181(@OriginalArg(0) int arg0) {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "an", descriptor = "()Lclient!ox;", line = 194)
	public Class472 method9182() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "ak", descriptor = "()Lclient!ox;", line = 194)
	public Class472 method9183() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "aw", descriptor = "(I)Lclient!ox;", line = 198)
	public Class472 method9184(@OriginalArg(0) int arg0) {
		return this.aClass472_14;
	}

	@OriginalMember(owner = "client!ahd", name = "as", descriptor = "(B)F", line = 202)
	public float method9185(@OriginalArg(0) byte arg0) {
		return Class110_Sub15.method20151(this.aClass471_1, (byte) -74);
	}

	@OriginalMember(owner = "client!ahd", name = "bf", descriptor = "()F", line = 202)
	public float method9186() {
		return Class110_Sub15.method20151(this.aClass471_1, (byte) -81);
	}

	@OriginalMember(owner = "client!ahd", name = "bl", descriptor = "()F", line = 202)
	public float method9187() {
		return Class110_Sub15.method20151(this.aClass471_1, (byte) -26);
	}

	@OriginalMember(owner = "client!ahd", name = "at", descriptor = "(I)F", line = 206)
	public float method9188(@OriginalArg(0) int arg0) {
		return Class332.method27391(this.aClass471_1, 1191956569);
	}

	@OriginalMember(owner = "client!ahd", name = "bk", descriptor = "()F", line = 206)
	public float method9189() {
		return Class332.method27391(this.aClass471_1, -1100871678);
	}

	@OriginalMember(owner = "client!ahd", name = "w", descriptor = "(I)F", line = 210)
	@Override
	public float method21411(@OriginalArg(0) int arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "s", descriptor = "()F", line = 210)
	@Override
	public float method21421() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "y", descriptor = "()F", line = 210)
	@Override
	public float method21422() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "l", descriptor = "(Lclient!ju;IIB)V", line = 214)
	@Override
	public void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) Class472 local3 = this.method21408((byte) 61);
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
		local3.method29544();
	}

	@OriginalMember(owner = "client!ahd", name = "j", descriptor = "(Lclient!ju;II)V", line = 214)
	@Override
	public void method21430(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21408((byte) 81);
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
		local3.method29544();
	}

	@OriginalMember(owner = "client!ahd", name = "i", descriptor = "(Lclient!ju;II)V", line = 214)
	@Override
	public void method21406(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21408((byte) 34);
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
		local3.method29544();
	}

	@OriginalMember(owner = "client!ahd", name = "q", descriptor = "(Lclient!alw;)V", line = 222)
	@Override
	public void method21423(@OriginalArg(0) Packet arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.g1((short) 16384), -2018282831);
		@Pc(9) int local9 = arg0.g2(-1434290800);
		this.aClass472_14.method29546(arg0);
		this.aClass471_1.method29469(arg0);
		if (arg0.g1((short) 16384) == 1) {
			this.aBoolean183 = true;
		} else {
			this.aBoolean183 = false;
		}
		this.anInt1017 = arg0.g2(-1434290800) * 822388973;
		this.anInterface29_1 = this.aClass123_13.method9018(-1680994591).method36705(local5, local9, (byte) 32);
	}

	@OriginalMember(owner = "client!ahd", name = "x", descriptor = "(Lclient!alw;)V", line = 222)
	@Override
	public void method21424(@OriginalArg(0) Packet arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.g1((short) 16384), -1873131749);
		@Pc(9) int local9 = arg0.g2(-1434290800);
		this.aClass472_14.method29546(arg0);
		this.aClass471_1.method29469(arg0);
		if (arg0.g1((short) 16384) == 1) {
			this.aBoolean183 = true;
		} else {
			this.aBoolean183 = false;
		}
		this.anInt1017 = arg0.g2(-1434290800) * 822388973;
		this.anInterface29_1 = this.aClass123_13.method9018(-2119740420).method36705(local5, local9, (byte) 32);
	}

	@OriginalMember(owner = "client!ahd", name = "u", descriptor = "(Lclient!alw;I)V", line = 222)
	@Override
	public void method21413(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.g1((short) 16384), -2019869299);
		@Pc(9) int local9 = arg0.g2(-1434290800);
		this.aClass472_14.method29546(arg0);
		this.aClass471_1.method29469(arg0);
		if (arg0.g1((short) 16384) == 1) {
			this.aBoolean183 = true;
		} else {
			this.aBoolean183 = false;
		}
		this.anInt1017 = arg0.g2(-1434290800) * 822388973;
		this.anInterface29_1 = this.aClass123_13.method9018(-1864838711).method36705(local5, local9, (byte) 32);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(Lclient!yf;B)V", line = 4834)
	static final void method9190(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.anIntArray520[arg0.anInt5889 * -709694321];
	}

	@OriginalMember(owner = "client!ahd", name = "jp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6727)
	static final void method9191(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aString166 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!ahd", name = "xo", descriptor = "(Lclient!yf;I)V", line = 9215)
	static final void method9192(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class14.method193(local13, local23, true, -109844901);
	}

	@OriginalMember(owner = "client!ahd", name = "aes", descriptor = "(Lclient!yf;I)V", line = 10281)
	static final void method9193(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (local13 & 0x1 << local23) == 0 ? 0 : 1;
	}
}
