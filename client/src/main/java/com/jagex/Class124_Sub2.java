package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahh")
public class Class124_Sub2 extends Class124 {

	@OriginalMember(owner = "client!ahh", name = "n", descriptor = "I")
	int anInt1037;

	@OriginalMember(owner = "client!ahh", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_21 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahh", name = "k", descriptor = "Lclient!ox;")
	final Class472 aClass472_22 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahh", name = "f", descriptor = "Lclient!ox;")
	final Class472 aClass472_20 = new Class472();

	@OriginalMember(owner = "client!ahh", name = "w", descriptor = "Z")
	boolean aBoolean184 = false;

	@OriginalMember(owner = "client!ahh", name = "<init>", descriptor = "(Lclient!je;)V", line = 19)
	public Class124_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "t", descriptor = "(Lclient!akt;I)V", line = 23)
	public void method9297(@OriginalArg(0) Class93_Sub30 arg0, @OriginalArg(1) int arg1) {
		this.aClass472_22.aFloat317 = arg0.anInt1610 * -427776677;
		this.aClass472_22.aFloat318 = arg0.anInt1611 * 1802884841;
		this.aClass472_22.aFloat319 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_21.aFloat317)) {
			this.aClass472_21.method29550(this.aClass472_22);
			this.aClass472_20.method29553();
		}
		this.anInt1037 = arg0.anInt1609 * 904894991;
	}

	@OriginalMember(owner = "client!ahh", name = "al", descriptor = "(Lclient!akt;)V", line = 23)
	public void method9298(@OriginalArg(0) Class93_Sub30 arg0) {
		this.aClass472_22.aFloat317 = arg0.anInt1610 * -427776677;
		this.aClass472_22.aFloat318 = arg0.anInt1611 * 1802884841;
		this.aClass472_22.aFloat319 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_21.aFloat317)) {
			this.aClass472_21.method29550(this.aClass472_22);
			this.aClass472_20.method29553();
		}
		this.anInt1037 = arg0.anInt1609 * 904894991;
	}

	@OriginalMember(owner = "client!ahh", name = "ah", descriptor = "(Lclient!akt;)V", line = 23)
	public void method9299(@OriginalArg(0) Class93_Sub30 arg0) {
		this.aClass472_22.aFloat317 = arg0.anInt1610 * -427776677;
		this.aClass472_22.aFloat318 = arg0.anInt1611 * 1802884841;
		this.aClass472_22.aFloat319 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_21.aFloat317)) {
			this.aClass472_21.method29550(this.aClass472_22);
			this.aClass472_20.method29553();
		}
		this.anInt1037 = arg0.anInt1609 * 904894991;
	}

	@OriginalMember(owner = "client!ahh", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V", line = 34)
	@Override
	public void method21427(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (this.aBoolean184) {
			this.method9307(arg1, arg2, arg3, arg4, -1908260729);
		}
		this.aClass123_13.method8931(true, arg0, this.aClass472_21, this.aClass123_13.method9049(1388069876), this.aClass472_22, this.aClass472_20, (byte) 75);
	}

	@OriginalMember(owner = "client!ahh", name = "h", descriptor = "(F[[[ILclient!qx;II)V", line = 34)
	@Override
	public void method21420(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean184) {
			this.method9307(arg1, arg2, arg3, arg4, 2019640812);
		}
		this.aClass123_13.method8931(true, arg0, this.aClass472_21, this.aClass123_13.method9049(1050215730), this.aClass472_22, this.aClass472_20, (byte) 24);
	}

	@OriginalMember(owner = "client!ahh", name = "b", descriptor = "(F[[[ILclient!qx;II)V", line = 34)
	@Override
	public void method21425(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean184) {
			this.method9307(arg1, arg2, arg3, arg4, 1729489025);
		}
		this.aClass123_13.method8931(true, arg0, this.aClass472_21, this.aClass123_13.method9049(1274662861), this.aClass472_22, this.aClass472_20, (byte) -59);
	}

	@OriginalMember(owner = "client!ahh", name = "a", descriptor = "(F[[[ILclient!qx;II)V", line = 34)
	@Override
	public void method21428(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean184) {
			this.method9307(arg1, arg2, arg3, arg4, -593811740);
		}
		this.aClass123_13.method8931(true, arg0, this.aClass472_21, this.aClass123_13.method9049(1617949235), this.aClass472_22, this.aClass472_20, (byte) 2);
	}

	@OriginalMember(owner = "client!ahh", name = "n", descriptor = "(I)Z", line = 39)
	@Override
	public boolean method21407(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_21.aFloat317);
	}

	@OriginalMember(owner = "client!ahh", name = "z", descriptor = "()Z", line = 39)
	@Override
	public boolean method21414() {
		return !Float.isNaN(this.aClass472_21.aFloat317);
	}

	@OriginalMember(owner = "client!ahh", name = "p", descriptor = "()Z", line = 39)
	@Override
	public boolean method21415() {
		return !Float.isNaN(this.aClass472_21.aFloat317);
	}

	@OriginalMember(owner = "client!ahh", name = "m", descriptor = "(B)Lclient!ox;", line = 43)
	@Override
	public Class472 method21408(@OriginalArg(0) byte arg0) {
		return Class472.method29537(this.aClass472_21);
	}

	@OriginalMember(owner = "client!ahh", name = "g", descriptor = "()Lclient!ox;", line = 43)
	@Override
	public Class472 method21429() {
		return Class472.method29537(this.aClass472_21);
	}

	@OriginalMember(owner = "client!ahh", name = "d", descriptor = "()[D", line = 47)
	@Override
	public double[] method21409() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21408((byte) 23);
		local2[0] = local6.aFloat317;
		local2[1] = local6.aFloat318;
		local2[2] = local6.aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ahh", name = "k", descriptor = "(I)[D", line = 47)
	@Override
	public double[] method21419(@OriginalArg(0) int arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21408((byte) 127);
		local2[0] = local6.aFloat317;
		local2[1] = local6.aFloat318;
		local2[2] = local6.aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ahh", name = "v", descriptor = "()Lclient!akt;", line = 56)
	@Override
	public Class93_Sub30 method21418() {
		return new Class93_Sub30(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat317, (int) this.aClass472_21.aFloat318, (int) this.aClass472_21.aFloat319);
	}

	@OriginalMember(owner = "client!ahh", name = "o", descriptor = "()Lclient!akt;", line = 56)
	@Override
	public Class93_Sub30 method21416() {
		return new Class93_Sub30(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat317, (int) this.aClass472_21.aFloat318, (int) this.aClass472_21.aFloat319);
	}

	@OriginalMember(owner = "client!ahh", name = "r", descriptor = "()Lclient!akt;", line = 56)
	@Override
	public Class93_Sub30 method21426() {
		return new Class93_Sub30(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat317, (int) this.aClass472_21.aFloat318, (int) this.aClass472_21.aFloat319);
	}

	@OriginalMember(owner = "client!ahh", name = "c", descriptor = "()Lclient!akt;", line = 56)
	@Override
	public Class93_Sub30 method21417() {
		return new Class93_Sub30(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat317, (int) this.aClass472_21.aFloat318, (int) this.aClass472_21.aFloat319);
	}

	@OriginalMember(owner = "client!ahh", name = "f", descriptor = "(B)Lclient!akt;", line = 56)
	@Override
	public Class93_Sub30 method21410(@OriginalArg(0) byte arg0) {
		return new Class93_Sub30(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat317, (int) this.aClass472_21.aFloat318, (int) this.aClass472_21.aFloat319);
	}

	@OriginalMember(owner = "client!ahh", name = "y", descriptor = "()F", line = 60)
	@Override
	public float method21422() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahh", name = "w", descriptor = "(I)F", line = 60)
	@Override
	public float method21411(@OriginalArg(0) int arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahh", name = "s", descriptor = "()F", line = 60)
	@Override
	public float method21421() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahh", name = "l", descriptor = "(Lclient!ju;IIB)V", line = 64)
	@Override
	public void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4586 = ((int) this.aClass472_21.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -this.aClass472_21.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) this.aClass472_21.aFloat319 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahh", name = "i", descriptor = "(Lclient!ju;II)V", line = 64)
	@Override
	public void method21406(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4586 = ((int) this.aClass472_21.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -this.aClass472_21.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) this.aClass472_21.aFloat319 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahh", name = "j", descriptor = "(Lclient!ju;II)V", line = 64)
	@Override
	public void method21430(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4586 = ((int) this.aClass472_21.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -this.aClass472_21.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) this.aClass472_21.aFloat319 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahh", name = "u", descriptor = "(Lclient!alw;I)V", line = 70)
	@Override
	public void method21413(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aClass472_22.method29546(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "q", descriptor = "(Lclient!alw;)V", line = 70)
	@Override
	public void method21423(@OriginalArg(0) Packet arg0) {
		this.aClass472_22.method29546(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "x", descriptor = "(Lclient!alw;)V", line = 70)
	@Override
	public void method21424(@OriginalArg(0) Packet arg0) {
		this.aClass472_22.method29546(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "ae", descriptor = "(ZI)V", line = 74)
	public void method9300(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean184 = arg0;
	}

	@OriginalMember(owner = "client!ahh", name = "ac", descriptor = "(Z)V", line = 74)
	public void method9301(@OriginalArg(0) boolean arg0) {
		this.aBoolean184 = arg0;
	}

	@OriginalMember(owner = "client!ahh", name = "ai", descriptor = "(Z)V", line = 74)
	public void method9302(@OriginalArg(0) boolean arg0) {
		this.aBoolean184 = arg0;
	}

	@OriginalMember(owner = "client!ahh", name = "ad", descriptor = "([[[ILclient!qx;II)V", line = 78)
	void method9303(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(-1492062449) || !this.aClass123_13.method9079(1743437705) && !this.aClass123_13.method9080(-1449786703) || !this.aClass123_13.method9080(2066620468) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat317 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat319 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30330(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat317 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat319 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat318;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat318 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "as", descriptor = "([[[ILclient!qx;II)V", line = 78)
	void method9304(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(361774651) || !this.aClass123_13.method9079(1047558235) && !this.aClass123_13.method9080(-1593318430) || !this.aClass123_13.method9080(1362337109) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat317 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat319 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30330(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat317 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat319 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat318;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat318 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "aw", descriptor = "([[[ILclient!qx;II)V", line = 78)
	void method9305(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(1602116512) || !this.aClass123_13.method9079(-598471876) && !this.aClass123_13.method9080(598316568) || !this.aClass123_13.method9080(463733395) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat317 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat319 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30330(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat317 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat319 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat318;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat318 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "at", descriptor = "([[[ILclient!qx;II)V", line = 78)
	void method9306(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21407(-1242879324) || !this.aClass123_13.method9079(1170933435) && !this.aClass123_13.method9080(-438519739) || !this.aClass123_13.method9080(-2054566806) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat317 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat319 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30330(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat317 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat319 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat318;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat318 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "ag", descriptor = "([[[ILclient!qx;III)V", line = 78)
	void method9307(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method21407(1595139226) || !this.aClass123_13.method9079(-1479832563) && !this.aClass123_13.method9080(-763041710) || !this.aClass123_13.method9080(-2111273278) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat317 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat319 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30330(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat317 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat319 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat318;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat318 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "k", descriptor = "(IIB)Lclient!hf;", line = 282)
	public static Class312 method9308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Class312 local3 = Class659.method32808(arg0, 1886061981);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass312Array2 == null || arg1 >= local3.aClass312Array2.length) {
			return null;
		} else {
			return local3.aClass312Array2[arg1];
		}
	}
}
