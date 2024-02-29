package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahd")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "Lclient!jn;")
	Interface29 anInterface29_1;

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "Z")
	boolean aBoolean184;

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

	@OriginalMember(owner = "client!ahd", name = "aes", descriptor = "(Lclient!yf;I)V")
	static void method9188(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (local13 & 0x1 << local23) == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "([BIIB)I")
	static int method9189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ Class93_Sub41.anIntArray262[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!ahd", name = "jp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method9190(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aString172 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!ahd", name = "xo", descriptor = "(Lclient!yf;I)V")
	static void method9191(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class14.method193(local13, local23, true, -109844901);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(Lclient!yf;B)V")
	static void method9192(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.anIntArray522[arg0.anInt6050 * -709694321];
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "(B)V")
	static void method9193(@OriginalArg(0) byte arg0) {
		Class173.aClass240_64.method25930(1161602830);
	}

	@OriginalMember(owner = "client!ahd", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class124_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "b", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public void method21431(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4, (byte) -117);
		@Pc(14) Class471 local14 = this.method9160((byte) 27);
		this.aClass471_2.method29661(local14, this.aClass123_13.method8967((short) -26138));
		if (Float.isNaN(this.aClass471_2.aFloat322)) {
			this.aClass471_2.method29645(local14);
		}
		local14.method29640();
		this.aClass472_16.method29719(this.anInterface29_1.method19950((byte) 90).method13870(-1459860639));
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(1602690230), this.aClass472_16, this.aClass472_17, (byte) 6);
	}

	@OriginalMember(owner = "client!ahd", name = "t", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;III)V")
	public void method9158(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29719(arg1);
		this.aClass471_1.method29645(arg2);
		this.aBoolean184 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19950((byte) 83).anInt1609 * -157762799;
		this.method9161(arg5, arg6, arg7, arg8, (byte) -30);
	}

	@OriginalMember(owner = "client!ahd", name = "ae", descriptor = "(B)V")
	public void method9159(@OriginalArg(0) byte arg0) {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940(-1893827957).method36886(this.anInterface29_1.method19958(65280), this.anInterface29_1.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V")
	@Override
	public void method21433(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4, (byte) -76);
		@Pc(14) Class471 local14 = this.method9160((byte) 47);
		this.aClass471_2.method29661(local14, this.aClass123_13.method8967((short) 23764));
		if (Float.isNaN(this.aClass471_2.aFloat322)) {
			this.aClass471_2.method29645(local14);
		}
		local14.method29640();
		this.aClass472_16.method29719(this.anInterface29_1.method19950((byte) 46).method13870(-268123421));
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(1344859316), this.aClass472_16, this.aClass472_17, (byte) -14);
	}

	@OriginalMember(owner = "client!ahd", name = "ag", descriptor = "(B)Lclient!ov;")
	Class471 method9160(@OriginalArg(0) byte arg0) {
		@Pc(3) Class471 local3 = Class471.method29676(this.aClass471_1);
		if (this.aBoolean184) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19949((byte) -62);
			if (local11.method29746() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29710(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19951(65535);
				local11.method29753(local30);
			}
			local11.aFloat326 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat325, (double) local11.aFloat327);
			local11.method29713();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29647(0.0F, 1.0F, 0.0F, local45);
			local3.method29657(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "ah", descriptor = "([[[ILclient!qx;IIB)V")
	void method9161(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.method21413(-338882669) || !this.aClass123_13.method8973(-670900429) && !this.aClass123_13.method8974(427282430)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19950((byte) 99);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30511(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974(-2113907928) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 831401248);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local103.method29753(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29710(local103.aFloat325, 0.0F, local103.aFloat327);
		local114.method29740();
		@Pc(120) float local120 = Class472.method29730(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29710(1.0F, 0.0F, 0.0F);
			local148.method29753(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29702();
			local154.method29646(local148, local135);
			this.aClass471_1.method29657(local154);
			this.aClass471_1.method29680();
			local148.method29713();
			local154.method29640();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 1473422373);
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

	@OriginalMember(owner = "client!ahd", name = "al", descriptor = "([[[ILclient!qx;IIIZI)F")
	float method9162(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class471 local3 = this.method9160((byte) 111);
		@Pc(8) Class472 local8 = this.method9171(local3, -1881799096);
		local3.method29640();
		@Pc(18) int local18 = (int) local8.aFloat325 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat327 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29713();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30511(local18, local26, -662808309)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat325 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat327 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat326;
		local8.method29713();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "af", descriptor = "()Lclient!ox;")
	public Class472 method9163() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "ap", descriptor = "()V")
	public void method9164() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940(-2125406909).method36886(this.anInterface29_1.method19958(65280), this.anInterface29_1.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "m", descriptor = "(B)Lclient!ox;")
	@Override
	public Class472 method21414(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_14);
		local3.method29753(this.aClass471_2);
		@Pc(12) Class472 local12 = Class472.method29726(this.aClass472_15, local3);
		local3.method29713();
		return local12;
	}

	@OriginalMember(owner = "client!ahd", name = "k", descriptor = "(I)[D")
	@Override
	public double[] method21425(@OriginalArg(0) int arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21414((byte) 101);
		local2[0] = local6.aFloat325;
		local2[1] = local6.aFloat326;
		local2[2] = local6.aFloat327;
		return local2;
	}

	@OriginalMember(owner = "client!ahd", name = "am", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;II)V")
	public void method9165(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29719(arg1);
		this.aClass471_1.method29645(arg2);
		this.aBoolean184 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19950((byte) 98).anInt1609 * -157762799;
		this.method9161(arg5, arg6, arg7, arg8, (byte) -94);
	}

	@OriginalMember(owner = "client!ahd", name = "ai", descriptor = "(I)Lclient!ox;")
	public Class472 method9166(@OriginalArg(0) int arg0) {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "aw", descriptor = "(I)Lclient!ox;")
	public Class472 method9167(@OriginalArg(0) int arg0) {
		return this.aClass472_14;
	}

	@OriginalMember(owner = "client!ahd", name = "as", descriptor = "(B)F")
	public float method9168(@OriginalArg(0) byte arg0) {
		return Class110_Sub15.method20164(this.aClass471_1, (byte) -74);
	}

	@OriginalMember(owner = "client!ahd", name = "at", descriptor = "(I)F")
	public float method9169(@OriginalArg(0) int arg0) {
		return Class332.method27487(this.aClass471_1, 1191956569);
	}

	@OriginalMember(owner = "client!ahd", name = "w", descriptor = "(I)F")
	@Override
	public float method21417(@OriginalArg(0) int arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "l", descriptor = "(Lclient!ju;IIB)V")
	@Override
	public void method21418(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) Class472 local3 = this.method21414((byte) 61);
		arg0.anInt4747 = ((int) local3.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -local3.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) local3.aFloat327 - arg2) * -513444905;
		local3.method29713();
	}

	@OriginalMember(owner = "client!ahd", name = "av", descriptor = "([[[ILclient!qx;II)V")
	void method9170(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(-1146669639) || !this.aClass123_13.method8973(-841598397) && !this.aClass123_13.method8974(-2014046209)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19950((byte) 29);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30511(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974(641939926) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 2026829681);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local103.method29753(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29710(local103.aFloat325, 0.0F, local103.aFloat327);
		local114.method29740();
		@Pc(120) float local120 = Class472.method29730(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29710(1.0F, 0.0F, 0.0F);
			local148.method29753(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29702();
			local154.method29646(local148, local135);
			this.aClass471_1.method29657(local154);
			this.aClass471_1.method29680();
			local148.method29713();
			local154.method29640();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 2042710845);
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

	@OriginalMember(owner = "client!ahd", name = "z", descriptor = "()Z")
	@Override
	public boolean method21420() {
		return !Float.isNaN(this.aClass472_15.aFloat325);
	}

	@OriginalMember(owner = "client!ahd", name = "p", descriptor = "()Z")
	@Override
	public boolean method21421() {
		return !Float.isNaN(this.aClass472_15.aFloat325);
	}

	@OriginalMember(owner = "client!ahd", name = "s", descriptor = "()F")
	@Override
	public float method21427() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "c", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method21423() {
		@Pc(3) Class472 local3 = this.method21414((byte) 52);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
		local3.method29713();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "ac", descriptor = "(Lclient!ov;I)Lclient!ox;")
	Class472 method9171(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_14);
		local3.method29753(arg0);
		@Pc(11) Class472 local11 = Class472.method29726(this.aClass472_16, local3);
		local3.method29713();
		return local11;
	}

	@OriginalMember(owner = "client!ahd", name = "v", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method21424() {
		@Pc(3) Class472 local3 = this.method21414((byte) 111);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
		local3.method29713();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "o", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method21422() {
		@Pc(3) Class472 local3 = this.method21414((byte) 123);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
		local3.method29713();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method21413(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_15.aFloat325);
	}

	@OriginalMember(owner = "client!ahd", name = "y", descriptor = "()F")
	@Override
	public float method21428() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "q", descriptor = "(Lclient!alw;)V")
	@Override
	public void method21429(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2018282831);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.aClass472_14.method29717(arg0);
		this.aClass471_1.method29643(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean184 = true;
		} else {
			this.aBoolean184 = false;
		}
		this.anInt1017 = arg0.method22427(-1434290800) * 822388973;
		this.anInterface29_1 = this.aClass123_13.method8940(-1680994591).method36886(local5, local9, (byte) 32);
	}

	@OriginalMember(owner = "client!ahd", name = "x", descriptor = "(Lclient!alw;)V")
	@Override
	public void method21430(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -1873131749);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.aClass472_14.method29717(arg0);
		this.aClass471_1.method29643(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean184 = true;
		} else {
			this.aBoolean184 = false;
		}
		this.anInt1017 = arg0.method22427(-1434290800) * 822388973;
		this.anInterface29_1 = this.aClass123_13.method8940(-2119740420).method36886(local5, local9, (byte) 32);
	}

	@OriginalMember(owner = "client!ahd", name = "ax", descriptor = "()Lclient!ov;")
	Class471 method9172() {
		@Pc(3) Class471 local3 = Class471.method29676(this.aClass471_1);
		if (this.aBoolean184) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19949((byte) -49);
			if (local11.method29746() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29710(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19951(65535);
				local11.method29753(local30);
			}
			local11.aFloat326 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat325, (double) local11.aFloat327);
			local11.method29713();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29647(0.0F, 1.0F, 0.0F, local45);
			local3.method29657(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "h", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public void method21426(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4, (byte) -99);
		@Pc(14) Class471 local14 = this.method9160((byte) 65);
		this.aClass471_2.method29661(local14, this.aClass123_13.method8967((short) 9655));
		if (Float.isNaN(this.aClass471_2.aFloat322)) {
			this.aClass471_2.method29645(local14);
		}
		local14.method29640();
		this.aClass472_16.method29719(this.anInterface29_1.method19950((byte) 104).method13870(-1383603256));
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(779427991), this.aClass472_16, this.aClass472_17, (byte) -1);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public void method21434(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4, (byte) -109);
		@Pc(14) Class471 local14 = this.method9160((byte) 56);
		this.aClass471_2.method29661(local14, this.aClass123_13.method8967((short) 9640));
		if (Float.isNaN(this.aClass471_2.aFloat322)) {
			this.aClass471_2.method29645(local14);
		}
		local14.method29640();
		this.aClass472_16.method29719(this.anInterface29_1.method19950((byte) 39).method13870(853071011));
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(2042065343), this.aClass472_16, this.aClass472_17, (byte) -18);
	}

	@OriginalMember(owner = "client!ahd", name = "g", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method21435() {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_14);
		local3.method29753(this.aClass471_2);
		@Pc(12) Class472 local12 = Class472.method29726(this.aClass472_15, local3);
		local3.method29713();
		return local12;
	}

	@OriginalMember(owner = "client!ahd", name = "d", descriptor = "()[D")
	@Override
	public double[] method21415() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21414((byte) 20);
		local2[0] = local6.aFloat325;
		local2[1] = local6.aFloat326;
		local2[2] = local6.aFloat327;
		return local2;
	}

	@OriginalMember(owner = "client!ahd", name = "ad", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;II)V")
	public void method9173(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29719(arg1);
		this.aClass471_1.method29645(arg2);
		this.aBoolean184 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19950((byte) 30).anInt1609 * -157762799;
		this.method9161(arg5, arg6, arg7, arg8, (byte) -87);
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "(B)Lclient!akt;")
	@Override
	public Class93_Sub30 method21416(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = this.method21414((byte) 40);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
		local3.method29713();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "au", descriptor = "()V")
	public void method9174() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940(-1800086256).method36886(this.anInterface29_1.method19958(65280), this.anInterface29_1.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "j", descriptor = "(Lclient!ju;II)V")
	@Override
	public void method21436(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21414((byte) 81);
		arg0.anInt4747 = ((int) local3.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -local3.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) local3.aFloat327 - arg2) * -513444905;
		local3.method29713();
	}

	@OriginalMember(owner = "client!ahd", name = "an", descriptor = "()Lclient!ox;")
	public Class472 method9175() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "aq", descriptor = "()Lclient!ov;")
	Class471 method9176() {
		@Pc(3) Class471 local3 = Class471.method29676(this.aClass471_1);
		if (this.aBoolean184) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19949((byte) 1);
			if (local11.method29746() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29710(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19951(65535);
				local11.method29753(local30);
			}
			local11.aFloat326 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat325, (double) local11.aFloat327);
			local11.method29713();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29647(0.0F, 1.0F, 0.0F, local45);
			local3.method29657(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "ar", descriptor = "()V")
	public void method9177() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940(-1820079769).method36886(this.anInterface29_1.method19958(65280), this.anInterface29_1.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "bf", descriptor = "()F")
	public float method9178() {
		return Class110_Sub15.method20164(this.aClass471_1, (byte) -81);
	}

	@OriginalMember(owner = "client!ahd", name = "ao", descriptor = "([[[ILclient!qx;II)V")
	void method9179(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(-811652722) || !this.aClass123_13.method8973(1469855959) && !this.aClass123_13.method8974(-343419890)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19950((byte) 79);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30511(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974(-1842568185) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 1866076324);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local103.method29753(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29710(local103.aFloat325, 0.0F, local103.aFloat327);
		local114.method29740();
		@Pc(120) float local120 = Class472.method29730(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29710(1.0F, 0.0F, 0.0F);
			local148.method29753(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29702();
			local154.method29646(local148, local135);
			this.aClass471_1.method29657(local154);
			this.aClass471_1.method29680();
			local148.method29713();
			local154.method29640();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 855950192);
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

	@OriginalMember(owner = "client!ahd", name = "aj", descriptor = "([[[ILclient!qx;II)V")
	void method9180(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(1441795224) || !this.aClass123_13.method8973(-957457219) && !this.aClass123_13.method8974(663285406)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19950((byte) 55);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30511(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974(-1950859585) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 1952415296);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local103.method29753(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29710(local103.aFloat325, 0.0F, local103.aFloat327);
		local114.method29740();
		@Pc(120) float local120 = Class472.method29730(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29710(1.0F, 0.0F, 0.0F);
			local148.method29753(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29702();
			local154.method29646(local148, local135);
			this.aClass471_1.method29657(local154);
			this.aClass471_1.method29680();
			local148.method29713();
			local154.method29640();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 1104046528);
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

	@OriginalMember(owner = "client!ahd", name = "ay", descriptor = "([[[ILclient!qx;II)V")
	void method9181(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21413(1105318035) || !this.aClass123_13.method8973(-1658735763) && !this.aClass123_13.method8974(1786354635)) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19950((byte) 50);
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30511(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9, -662808309)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974(-598964394) || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 1536197075);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local103.method29753(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29710(local103.aFloat325, 0.0F, local103.aFloat327);
		local114.method29740();
		@Pc(120) float local120 = Class472.method29730(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29710(1.0F, 0.0F, 0.0F);
			local148.method29753(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29702();
			local154.method29646(local148, local135);
			this.aClass471_1.method29657(local154);
			this.aClass471_1.method29680();
			local148.method29713();
			local154.method29640();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31, 1764096254);
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

	@OriginalMember(owner = "client!ahd", name = "ab", descriptor = "([[[ILclient!qx;IIIZ)F")
	float method9182(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9160((byte) 93);
		@Pc(8) Class472 local8 = this.method9171(local3, 1227212306);
		local3.method29640();
		@Pc(18) int local18 = (int) local8.aFloat325 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat327 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29713();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30511(local18, local26, -662808309)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat325 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat327 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat326;
		local8.method29713();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "az", descriptor = "([[[ILclient!qx;IIIZ)F")
	float method9183(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9160((byte) 117);
		@Pc(8) Class472 local8 = this.method9171(local3, 134673490);
		local3.method29640();
		@Pc(18) int local18 = (int) local8.aFloat325 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat327 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29713();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30511(local18, local26, -662808309)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat325 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat327 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat326;
		local8.method29713();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "aa", descriptor = "(Lclient!ov;)Lclient!ox;")
	Class472 method9184(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_14);
		local3.method29753(arg0);
		@Pc(11) Class472 local11 = Class472.method29726(this.aClass472_16, local3);
		local3.method29713();
		return local11;
	}

	@OriginalMember(owner = "client!ahd", name = "i", descriptor = "(Lclient!ju;II)V")
	@Override
	public void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21414((byte) 34);
		arg0.anInt4747 = ((int) local3.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -local3.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) local3.aFloat327 - arg2) * -513444905;
		local3.method29713();
	}

	@OriginalMember(owner = "client!ahd", name = "ak", descriptor = "()Lclient!ox;")
	public Class472 method9185() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "u", descriptor = "(Lclient!alw;I)V")
	@Override
	public void method21419(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2019869299);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.aClass472_14.method29717(arg0);
		this.aClass471_1.method29643(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean184 = true;
		} else {
			this.aBoolean184 = false;
		}
		this.anInt1017 = arg0.method22427(-1434290800) * 822388973;
		this.anInterface29_1 = this.aClass123_13.method8940(-1864838711).method36886(local5, local9, (byte) 32);
	}

	@OriginalMember(owner = "client!ahd", name = "r", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method21432() {
		@Pc(3) Class472 local3 = this.method21414((byte) 63);
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
		local3.method29713();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "bl", descriptor = "()F")
	public float method9186() {
		return Class110_Sub15.method20164(this.aClass471_1, (byte) -26);
	}

	@OriginalMember(owner = "client!ahd", name = "bk", descriptor = "()F")
	public float method9187() {
		return Class332.method27487(this.aClass471_1, -1100871678);
	}
}
