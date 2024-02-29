package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahh")
public final class Class124_Sub2 extends Class124 {

	@OriginalMember(owner = "client!ahh", name = "n", descriptor = "I")
	int anInt1037;

	@OriginalMember(owner = "client!ahh", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_21 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahh", name = "k", descriptor = "Lclient!ox;")
	final Class472 aClass472_22 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahh", name = "f", descriptor = "Lclient!ox;")
	final Class472 aClass472_20 = new Class472();

	@OriginalMember(owner = "client!ahh", name = "w", descriptor = "Z")
	boolean aBoolean185 = false;

	@OriginalMember(owner = "client!ahh", name = "k", descriptor = "(IIB)Lclient!hf;")
	public static Class312 method9308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Class312 local3 = Class659.method32986(arg0, 1886061981);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass312Array2 == null || arg1 >= local3.aClass312Array2.length) {
			return null;
		} else {
			return local3.aClass312Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!ahh", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class124_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "d", descriptor = "()[D")
	@Override
	public double[] method21415() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21414((byte) 23);
		local2[0] = local6.aFloat325;
		local2[1] = local6.aFloat326;
		local2[2] = local6.aFloat327;
		return local2;
	}

	@OriginalMember(owner = "client!ahh", name = "t", descriptor = "(Lclient!akt;I)V")
	public void method9297(@OriginalArg(0) CoordFine arg0, @OriginalArg(1) int arg1) {
		this.aClass472_22.aFloat325 = arg0.anInt1610 * -427776677;
		this.aClass472_22.aFloat326 = arg0.anInt1611 * 1802884841;
		this.aClass472_22.aFloat327 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_21.aFloat325)) {
			this.aClass472_21.method29719(this.aClass472_22);
			this.aClass472_20.method29720();
		}
		this.anInt1037 = arg0.anInt1609 * 904894991;
	}

	@OriginalMember(owner = "client!ahh", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V")
	@Override
	public void method21433(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (this.aBoolean185) {
			this.method9307(arg1, arg2, arg3, arg4, -1908260729);
		}
		this.aClass123_13.method9050(true, arg0, this.aClass472_21, this.aClass123_13.method8964(1388069876), this.aClass472_22, this.aClass472_20, (byte) 75);
	}

	@OriginalMember(owner = "client!ahh", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method21413(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_21.aFloat325);
	}

	@OriginalMember(owner = "client!ahh", name = "y", descriptor = "()F")
	@Override
	public float method21428() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahh", name = "k", descriptor = "(I)[D")
	@Override
	public double[] method21425(@OriginalArg(0) int arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21414((byte) 127);
		local2[0] = local6.aFloat325;
		local2[1] = local6.aFloat326;
		local2[2] = local6.aFloat327;
		return local2;
	}

	@OriginalMember(owner = "client!ahh", name = "h", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public void method21426(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean185) {
			this.method9307(arg1, arg2, arg3, arg4, 2019640812);
		}
		this.aClass123_13.method9050(true, arg0, this.aClass472_21, this.aClass123_13.method8964(1050215730), this.aClass472_22, this.aClass472_20, (byte) 24);
	}

	@OriginalMember(owner = "client!ahh", name = "w", descriptor = "(I)F")
	@Override
	public float method21417(@OriginalArg(0) int arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahh", name = "l", descriptor = "(Lclient!ju;IIB)V")
	@Override
	public void method21418(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4747 = ((int) this.aClass472_21.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -this.aClass472_21.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) this.aClass472_21.aFloat327 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahh", name = "u", descriptor = "(Lclient!alw;I)V")
	@Override
	public void method21419(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aClass472_22.method29717(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "ae", descriptor = "(ZI)V")
	public void method9298(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean185 = arg0;
	}

	@OriginalMember(owner = "client!ahh", name = "m", descriptor = "(B)Lclient!ox;")
	@Override
	public Class472 method21414(@OriginalArg(0) byte arg0) {
		return Class472.method29711(this.aClass472_21);
	}

	@OriginalMember(owner = "client!ahh", name = "ad", descriptor = "([[[ILclient!qx;II)V")
	void method9299(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(-1492062449) || !this.aClass123_13.method8973(1743437705) && !this.aClass123_13.method8974(-1449786703) || !this.aClass123_13.method8974(2066620468) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat325 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat327 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30511(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat325 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat327 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat326;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat326 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "al", descriptor = "(Lclient!akt;)V")
	public void method9300(@OriginalArg(0) CoordFine arg0) {
		this.aClass472_22.aFloat325 = arg0.anInt1610 * -427776677;
		this.aClass472_22.aFloat326 = arg0.anInt1611 * 1802884841;
		this.aClass472_22.aFloat327 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_21.aFloat325)) {
			this.aClass472_21.method29719(this.aClass472_22);
			this.aClass472_20.method29720();
		}
		this.anInt1037 = arg0.anInt1609 * 904894991;
	}

	@OriginalMember(owner = "client!ahh", name = "z", descriptor = "()Z")
	@Override
	public boolean method21420() {
		return !Float.isNaN(this.aClass472_21.aFloat325);
	}

	@OriginalMember(owner = "client!ahh", name = "p", descriptor = "()Z")
	@Override
	public boolean method21421() {
		return !Float.isNaN(this.aClass472_21.aFloat325);
	}

	@OriginalMember(owner = "client!ahh", name = "as", descriptor = "([[[ILclient!qx;II)V")
	void method9301(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(361774651) || !this.aClass123_13.method8973(1047558235) && !this.aClass123_13.method8974(-1593318430) || !this.aClass123_13.method8974(1362337109) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat325 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat327 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30511(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat325 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat327 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat326;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat326 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "ac", descriptor = "(Z)V")
	public void method9302(@OriginalArg(0) boolean arg0) {
		this.aBoolean185 = arg0;
	}

	@OriginalMember(owner = "client!ahh", name = "ah", descriptor = "(Lclient!akt;)V")
	public void method9303(@OriginalArg(0) CoordFine arg0) {
		this.aClass472_22.aFloat325 = arg0.anInt1610 * -427776677;
		this.aClass472_22.aFloat326 = arg0.anInt1611 * 1802884841;
		this.aClass472_22.aFloat327 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_21.aFloat325)) {
			this.aClass472_21.method29719(this.aClass472_22);
			this.aClass472_20.method29720();
		}
		this.anInt1037 = arg0.anInt1609 * 904894991;
	}

	@OriginalMember(owner = "client!ahh", name = "v", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method21424() {
		return new CoordFine(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat325, (int) this.aClass472_21.aFloat326, (int) this.aClass472_21.aFloat327);
	}

	@OriginalMember(owner = "client!ahh", name = "o", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method21422() {
		return new CoordFine(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat325, (int) this.aClass472_21.aFloat326, (int) this.aClass472_21.aFloat327);
	}

	@OriginalMember(owner = "client!ahh", name = "s", descriptor = "()F")
	@Override
	public float method21427() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahh", name = "r", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method21432() {
		return new CoordFine(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat325, (int) this.aClass472_21.aFloat326, (int) this.aClass472_21.aFloat327);
	}

	@OriginalMember(owner = "client!ahh", name = "q", descriptor = "(Lclient!alw;)V")
	@Override
	public void method21429(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_22.method29717(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "x", descriptor = "(Lclient!alw;)V")
	@Override
	public void method21430(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_22.method29717(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "aw", descriptor = "([[[ILclient!qx;II)V")
	void method9304(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(1602116512) || !this.aClass123_13.method8973(-598471876) && !this.aClass123_13.method8974(598316568) || !this.aClass123_13.method8974(463733395) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat325 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat327 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30511(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat325 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat327 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat326;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat326 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "ai", descriptor = "(Z)V")
	public void method9305(@OriginalArg(0) boolean arg0) {
		this.aBoolean185 = arg0;
	}

	@OriginalMember(owner = "client!ahh", name = "c", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method21423() {
		return new CoordFine(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat325, (int) this.aClass472_21.aFloat326, (int) this.aClass472_21.aFloat327);
	}

	@OriginalMember(owner = "client!ahh", name = "at", descriptor = "([[[ILclient!qx;II)V")
	void method9306(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(-1242879324) || !this.aClass123_13.method8973(1170933435) && !this.aClass123_13.method8974(-438519739) || !this.aClass123_13.method8974(-2054566806) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat325 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat327 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30511(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat325 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat327 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat326;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat326 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "ag", descriptor = "([[[ILclient!qx;III)V")
	void method9307(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method21413(1595139226) || !this.aClass123_13.method8973(-1479832563) && !this.aClass123_13.method8974(-763041710) || !this.aClass123_13.method8974(-2111273278) || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass472_22.aFloat325 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass472_22.aFloat327 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1037 * -778327225;
		if (arg1.method30511(local30, local39, -662808309)) {
			local66 = this.anInt1037 * -778327225 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass472_22.aFloat325 % 512L;
		@Pc(93) long local93 = (long) this.aClass472_22.aFloat327 % 512L;
		@Pc(110) long local110 = (512L - local93) * (long) arg0[local66][local30][local39] * (512L - local86);
		@Pc(129) long local129 = local110 + local86 * (long) arg0[local66][local30 + 1][local39] * (512L - local93);
		@Pc(148) long local148 = local129 + (512L - local86) * (long) arg0[local66][local30][local39 + 1] * local93;
		@Pc(167) long local167 = local148 + local86 * (long) arg0[local66][local30 + 1][local39 + 1] * local93;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass472_22.aFloat326;
		if (local183 > 0.0F) {
			this.aClass472_22.aFloat326 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahh", name = "b", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public void method21431(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean185) {
			this.method9307(arg1, arg2, arg3, arg4, 1729489025);
		}
		this.aClass123_13.method9050(true, arg0, this.aClass472_21, this.aClass123_13.method8964(1274662861), this.aClass472_22, this.aClass472_20, (byte) -59);
	}

	@OriginalMember(owner = "client!ahh", name = "f", descriptor = "(B)Lclient!akt;")
	@Override
	public CoordFine method21416(@OriginalArg(0) byte arg0) {
		return new CoordFine(this.anInt1037 * -778327225, (int) this.aClass472_21.aFloat325, (int) this.aClass472_21.aFloat326, (int) this.aClass472_21.aFloat327);
	}

	@OriginalMember(owner = "client!ahh", name = "a", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public void method21434(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean185) {
			this.method9307(arg1, arg2, arg3, arg4, -593811740);
		}
		this.aClass123_13.method9050(true, arg0, this.aClass472_21, this.aClass123_13.method8964(1617949235), this.aClass472_22, this.aClass472_20, (byte) 2);
	}

	@OriginalMember(owner = "client!ahh", name = "g", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method21435() {
		return Class472.method29711(this.aClass472_21);
	}

	@OriginalMember(owner = "client!ahh", name = "i", descriptor = "(Lclient!ju;II)V")
	@Override
	public void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4747 = ((int) this.aClass472_21.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -this.aClass472_21.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) this.aClass472_21.aFloat327 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahh", name = "j", descriptor = "(Lclient!ju;II)V")
	@Override
	public void method21436(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4747 = ((int) this.aClass472_21.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -this.aClass472_21.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) this.aClass472_21.aFloat327 - arg2) * -513444905;
	}
}
