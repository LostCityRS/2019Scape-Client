package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ez")
public final class Class255 {

	@OriginalMember(owner = "client!ez", name = "qo", descriptor = "Lclient!hf;")
	static Class312 aClass312_8;

	@OriginalMember(owner = "client!ez", name = "e", descriptor = "[I")
	final int[] anIntArray359;

	@OriginalMember(owner = "client!ez", name = "n", descriptor = "[I")
	final int[] anIntArray360;

	@OriginalMember(owner = "client!ez", name = "m", descriptor = "[I")
	final int[] anIntArray361;

	@OriginalMember(owner = "client!ez", name = "k", descriptor = "[I")
	final int[] anIntArray362;

	@OriginalMember(owner = "client!ez", name = "f", descriptor = "[I")
	final int[] anIntArray363;

	@OriginalMember(owner = "client!ez", name = "w", descriptor = "[I")
	final int[] anIntArray364;

	@OriginalMember(owner = "client!ez", name = "l", descriptor = "[I")
	final int[] anIntArray365;

	@OriginalMember(owner = "client!ez", name = "s", descriptor = "(Lclient!yf;I)V")
	static void method26099(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class347 local16 = (Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -1050431703);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anIntArray423 == null ? 0 : local16.anIntArray423.length;
	}

	@OriginalMember(owner = "client!ez", name = "rr", descriptor = "(Lclient!yf;I)V")
	static void method26100(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		@Pc(19) Class312 local19 = Class431.method28960(local14, local11, -1208839593);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local19 == null ? -1 : local19.anInt3994 * -1549590237;
	}

	@OriginalMember(owner = "client!ez", name = "fm", descriptor = "(I)I")
	public static int method26101(@OriginalArg(0) int arg0) {
		if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
			return 3;
		} else if (client.aBoolean625) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ez", name = "be", descriptor = "(Lclient!hf;II)Ljava/lang/String;")
	static String method26102(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!client.method25250(arg0).method13619(arg1, -244589856) && arg0.anObjectArray26 == null) {
			return null;
		} else if (arg0.aStringArray27 == null || arg0.aStringArray27.length <= arg1 || arg0.aStringArray27[arg1] == null || arg0.aStringArray27[arg1].trim().length() == 0) {
			return client.aBoolean617 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray27[arg1];
		}
	}

	@OriginalMember(owner = "client!ez", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class255(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) int local5 = arg0.method22644((byte) -104);
		this.anIntArray359 = new int[local5];
		this.anIntArray360 = new int[local5];
		this.anIntArray361 = new int[local5];
		this.anIntArray362 = new int[local5];
		this.anIntArray363 = new int[local5];
		this.anIntArray364 = new int[local5];
		this.anIntArray365 = new int[local5];
		for (@Pc(35) int local35 = 0; local35 < local5; local35++) {
			this.anIntArray359[local35] = arg0.method22427(-1434290800) - 5120;
			this.anIntArray361[local35] = arg0.method22427(-1434290800) - 5120;
			this.anIntArray360[local35] = arg0.method22494((byte) -29);
			this.anIntArray363[local35] = arg0.method22427(-1434290800) - 5120;
			this.anIntArray365[local35] = arg0.method22427(-1434290800) - 5120;
			this.anIntArray364[local35] = arg0.method22494((byte) -104);
			this.anIntArray362[local35] = arg0.method22494((byte) -90);
		}
	}

	@OriginalMember(owner = "client!ez", name = "e", descriptor = "(IS)V")
	void method26096(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(7) int[][] local7 = new int[this.anIntArray359.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray359.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray359[local9];
			local7[local9 * 2][1] = this.anIntArray360[local9];
			local7[local9 * 2][2] = this.anIntArray361[local9];
			local7[local9 * 2][3] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray364[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray365[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray362[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ez", name = "n", descriptor = "(I)V")
	void method26097(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray359.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray359.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray359[local9];
			local7[local9 * 2][1] = this.anIntArray360[local9];
			local7[local9 * 2][2] = this.anIntArray361[local9];
			local7[local9 * 2][3] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray364[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray365[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray362[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ez", name = "m", descriptor = "(I)V")
	void method26098(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray359.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray359.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray359[local9];
			local7[local9 * 2][1] = this.anIntArray360[local9];
			local7[local9 * 2][2] = this.anIntArray361[local9];
			local7[local9 * 2][3] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray364[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray365[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray362[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}
}
