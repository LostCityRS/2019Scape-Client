package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class317 {

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "[I")
	static final int[] anIntArray399 = new int[] { 256, 128, 86, 64 };

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "[F")
	static final float[] aFloatArray104 = new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
	int[] anIntArray394;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	int anInt4135;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "[I")
	int[] anIntArray395;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "[I")
	int[] anIntArray396;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray11;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
	int[] anIntArray397;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "[[I")
	int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "[I")
	int[] anIntArray398;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "[[I")
	int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!hk;")
	Class315 aClass315_4;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "[Z")
	boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "([II)I")
	static int method27266(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 > local3 && local16 < local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "([II)I")
	static int method27275(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "([II)I")
	static int method27276(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "([II)I")
	static int method27288(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "([II)I")
	static int method27297(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "([II)I")
	static int method27302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 > local3 && local16 < local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	Class317() {
	}

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "(IIIII)I")
	int method27263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(Lclient!hk;I)V")
	void method27264(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1) {
		this.aClass315_4 = arg0;
		@Pc(7) int local7 = this.aClass315_4.method27229(16);
		if (local7 != 1) {
			throw new RuntimeException();
		}
		@Pc(29) int local29;
		if (this.aBooleanArray29 != null && this.aBooleanArray29.length == arg1) {
			for (local29 = 0; local29 < this.aBooleanArray29.length; local29++) {
				this.aBooleanArray29[local29] = false;
			}
		} else {
			this.aBooleanArray29 = new boolean[arg1];
		}
		local29 = this.aClass315_4.method27229(5);
		@Pc(48) int local48 = 0;
		if (this.anIntArray395 != null && this.anIntArray395.length == local29) {
			this.method27265(this.anIntArray395);
		} else {
			this.anIntArray395 = new int[local29];
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		for (local67 = 0; local67 < local29; local67++) {
			local75 = this.aClass315_4.method27229(4);
			this.anIntArray395[local67] = local75;
			if (local75 >= local48) {
				local48 = local75 + 1;
			}
		}
		if (this.anIntArray396 != null && this.anIntArray396.length == local48) {
			this.method27265(this.anIntArray396);
		} else {
			this.anIntArray396 = new int[local48];
		}
		if (this.anIntArray394 != null && this.anIntArray394.length == local48) {
			this.method27265(this.anIntArray394);
		} else {
			this.anIntArray394 = new int[local48];
		}
		if (this.anIntArray398 != null && this.anIntArray398.length == local48) {
			this.method27265(this.anIntArray398);
		} else {
			this.anIntArray398 = new int[local48];
		}
		if (this.anIntArrayArray49 == null || this.anIntArrayArray49.length != local48) {
			this.anIntArrayArray49 = new int[local48][];
		}
		@Pc(201) int local201;
		for (local67 = 0; local67 < local48; local67++) {
			this.anIntArray396[local67] = this.aClass315_4.method27229(3) + 1;
			local75 = this.anIntArray394[local67] = this.aClass315_4.method27229(2);
			if (local75 != 0) {
				this.anIntArray398[local67] = this.aClass315_4.method27229(8);
			}
			local75 = 0x1 << local75;
			@Pc(194) int[] local194 = new int[local75];
			this.anIntArrayArray49[local67] = local194;
			for (local201 = 0; local201 < local75; local201++) {
				local194[local201] = this.aClass315_4.method27229(8) - 1;
			}
		}
		this.anInt4135 = this.aClass315_4.method27229(2) + 1;
		local67 = this.aClass315_4.method27229(4);
		local75 = 2;
		@Pc(234) int local234;
		for (local234 = 0; local234 < local29; local234++) {
			local75 += this.anIntArray396[this.anIntArray395[local234]];
		}
		if (this.anIntArray397 != null && this.anIntArray397.length == local75) {
			this.method27265(this.anIntArray397);
		} else {
			this.anIntArray397 = new int[local75];
		}
		this.anIntArray397[0] = 0;
		this.anIntArray397[1] = 0x1 << local67;
		local75 = 2;
		for (local234 = 0; local234 < local29; local234++) {
			local201 = this.anIntArray395[local234];
			for (@Pc(292) int local292 = 0; local292 < this.anIntArray396[local201]; local292++) {
				this.anIntArray397[local75++] = this.aClass315_4.method27229(local67);
			}
		}
		if (this.anIntArrayArray50 == null || this.anIntArrayArray50.length < local75) {
			this.anIntArrayArray50 = new int[arg1][local75];
			this.anIntArrayArray51 = new int[arg1][local75];
			this.aBooleanArrayArray11 = new boolean[arg1][local75];
		}
	}

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "([I)V")
	void method27265(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "ap", descriptor = "(Lclient!hb;II)V")
	void method27267(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBooleanArray29[arg2]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		this.method27277(0, local9 - 1, arg2);
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = this.anIntArrayArray51[arg2][0] * this.anInt4135;
		@Pc(47) int local47;
		for (@Pc(30) int local30 = 1; local30 < local9; local30++) {
			if (this.anIntArrayArray51[arg2][local30] >= 0) {
				local47 = this.anIntArrayArray50[arg2][local30];
				@Pc(57) int local57 = this.anIntArrayArray51[arg2][local30] * this.anInt4135;
				this.method27289(local18, local28, local47, local57, arg0, arg1);
				if (local47 >= arg1) {
				}
				local18 = local47;
				local28 = local57;
			}
		}
		@Pc(78) float local78 = aFloatArray104[local28];
		for (local47 = local18; local47 < arg1; local47++) {
			arg0.aFloatArray103[local47] *= local78;
		}
	}

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "(IIIII)I")
	int method27268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!hm", name = "as", descriptor = "(I)V")
	void method27269(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray29[arg0]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		@Pc(16) int local16 = anIntArray399[this.anInt4135 - 1];
		@Pc(21) boolean[] local21 = this.aBooleanArrayArray11[arg0];
		this.aBooleanArrayArray11[arg0][1] = true;
		local21[0] = true;
		@Pc(34) int local34;
		for (local34 = 2; local34 < local9; local34++) {
			@Pc(42) int local42 = method27297(this.anIntArray397, local34);
			@Pc(47) int local47 = method27266(this.anIntArray397, local34);
			@Pc(74) int local74 = this.method27280(this.anIntArray397[local42], this.anIntArrayArray51[arg0][local42], this.anIntArray397[local47], this.anIntArrayArray51[arg0][local47], this.anIntArray397[local34]);
			@Pc(81) int local81 = this.anIntArrayArray51[arg0][local34];
			@Pc(85) int local85 = local16 - local74;
			@Pc(96) int local96 = (local85 < local74 ? local85 : local74) << 1;
			if (local81 == 0) {
				this.aBooleanArrayArray11[arg0][local34] = false;
				this.anIntArrayArray51[arg0][local34] = local74;
			} else {
				@Pc(103) boolean[] local103 = this.aBooleanArrayArray11[arg0];
				this.aBooleanArrayArray11[arg0][local47] = true;
				local103[local42] = true;
				this.aBooleanArrayArray11[arg0][local34] = true;
				if (local81 >= local96) {
					this.anIntArrayArray51[arg0][local34] = local85 > local74 ? local81 - local74 + local74 : local74 - local81 + local85 - 1;
				} else {
					this.anIntArrayArray51[arg0][local34] = (local81 & 0x1) == 0 ? local74 + (local81 >> 1) : local74 - (local81 + 1 >> 1);
				}
			}
		}
		for (local34 = 0; local34 < local9; local34++) {
			if (!this.aBooleanArrayArray11[arg0][local34]) {
				this.anIntArrayArray51[arg0][local34] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "(I)Z")
	boolean method27270(@OriginalArg(0) int arg0) {
		@Pc(7) boolean local7 = this.aClass315_4.method27223() != 0;
		this.aBooleanArray29[arg0] = local7;
		if (!local7) {
			return false;
		}
		@Pc(20) int local20 = this.anIntArray397.length;
		@Pc(22) int local22;
		for (local22 = 0; local22 < local20; local22++) {
			this.anIntArrayArray50[arg0][local22] = this.anIntArray397[local22];
		}
		local22 = anIntArray399[this.anInt4135 - 1];
		@Pc(50) int local50 = Class548.method31195(local22 - 1, -1556265525);
		this.anIntArrayArray51[arg0][0] = this.aClass315_4.method27229(local50);
		this.anIntArrayArray51[arg0][1] = this.aClass315_4.method27229(local50);
		@Pc(72) int local72 = 2;
		for (@Pc(74) int local74 = 0; local74 < this.anIntArray395.length; local74++) {
			@Pc(84) int local84 = this.anIntArray395[local74];
			@Pc(89) int local89 = this.anIntArray396[local84];
			@Pc(94) int local94 = this.anIntArray394[local84];
			@Pc(100) int local100 = (0x1 << local94) - 1;
			@Pc(102) int local102 = 0;
			if (local94 > 0) {
				local102 = this.aClass315_4.aClass324Array2[this.anIntArray398[local84]].method27377(this.aClass315_4);
			}
			for (@Pc(118) int local118 = 0; local118 < local89; local118++) {
				@Pc(130) int local130 = this.anIntArrayArray49[local84][local102 & local100];
				local102 >>>= local94;
				this.anIntArrayArray51[arg0][local72] = local130 >= 0 ? this.aClass315_4.aClass324Array2[local130].method27377(this.aClass315_4) : 0;
				local72++;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "(I)V")
	void method27271(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray29[arg0]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		@Pc(16) int local16 = anIntArray399[this.anInt4135 - 1];
		@Pc(21) boolean[] local21 = this.aBooleanArrayArray11[arg0];
		this.aBooleanArrayArray11[arg0][1] = true;
		local21[0] = true;
		@Pc(34) int local34;
		for (local34 = 2; local34 < local9; local34++) {
			@Pc(42) int local42 = method27297(this.anIntArray397, local34);
			@Pc(47) int local47 = method27266(this.anIntArray397, local34);
			@Pc(74) int local74 = this.method27280(this.anIntArray397[local42], this.anIntArrayArray51[arg0][local42], this.anIntArray397[local47], this.anIntArrayArray51[arg0][local47], this.anIntArray397[local34]);
			@Pc(81) int local81 = this.anIntArrayArray51[arg0][local34];
			@Pc(85) int local85 = local16 - local74;
			@Pc(96) int local96 = (local85 < local74 ? local85 : local74) << 1;
			if (local81 == 0) {
				this.aBooleanArrayArray11[arg0][local34] = false;
				this.anIntArrayArray51[arg0][local34] = local74;
			} else {
				@Pc(103) boolean[] local103 = this.aBooleanArrayArray11[arg0];
				this.aBooleanArrayArray11[arg0][local47] = true;
				local103[local42] = true;
				this.aBooleanArrayArray11[arg0][local34] = true;
				if (local81 >= local96) {
					this.anIntArrayArray51[arg0][local34] = local85 > local74 ? local81 - local74 + local74 : local74 - local81 + local85 - 1;
				} else {
					this.anIntArrayArray51[arg0][local34] = (local81 & 0x1) == 0 ? local74 + (local81 >> 1) : local74 - (local81 + 1 >> 1);
				}
			}
		}
		for (local34 = 0; local34 < local9; local34++) {
			if (!this.aBooleanArrayArray11[arg0][local34]) {
				this.anIntArrayArray51[arg0][local34] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "(Lclient!hb;II)V")
	void method27272(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBooleanArray29[arg2]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		this.method27277(0, local9 - 1, arg2);
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = this.anIntArrayArray51[arg2][0] * this.anInt4135;
		@Pc(47) int local47;
		for (@Pc(30) int local30 = 1; local30 < local9; local30++) {
			if (this.anIntArrayArray51[arg2][local30] >= 0) {
				local47 = this.anIntArrayArray50[arg2][local30];
				@Pc(57) int local57 = this.anIntArrayArray51[arg2][local30] * this.anInt4135;
				this.method27289(local18, local28, local47, local57, arg0, arg1);
				if (local47 >= arg1) {
				}
				local18 = local47;
				local28 = local57;
			}
		}
		@Pc(78) float local78 = aFloatArray104[local28];
		for (local47 = local18; local47 < arg1; local47++) {
			arg0.aFloatArray103[local47] *= local78;
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(Lclient!hk;I)V")
	void method27273(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1) {
		this.aClass315_4 = arg0;
		@Pc(7) int local7 = this.aClass315_4.method27229(16);
		if (local7 != 1) {
			throw new RuntimeException();
		}
		@Pc(29) int local29;
		if (this.aBooleanArray29 != null && this.aBooleanArray29.length == arg1) {
			for (local29 = 0; local29 < this.aBooleanArray29.length; local29++) {
				this.aBooleanArray29[local29] = false;
			}
		} else {
			this.aBooleanArray29 = new boolean[arg1];
		}
		local29 = this.aClass315_4.method27229(5);
		@Pc(48) int local48 = 0;
		if (this.anIntArray395 != null && this.anIntArray395.length == local29) {
			this.method27265(this.anIntArray395);
		} else {
			this.anIntArray395 = new int[local29];
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		for (local67 = 0; local67 < local29; local67++) {
			local75 = this.aClass315_4.method27229(4);
			this.anIntArray395[local67] = local75;
			if (local75 >= local48) {
				local48 = local75 + 1;
			}
		}
		if (this.anIntArray396 != null && this.anIntArray396.length == local48) {
			this.method27265(this.anIntArray396);
		} else {
			this.anIntArray396 = new int[local48];
		}
		if (this.anIntArray394 != null && this.anIntArray394.length == local48) {
			this.method27265(this.anIntArray394);
		} else {
			this.anIntArray394 = new int[local48];
		}
		if (this.anIntArray398 != null && this.anIntArray398.length == local48) {
			this.method27265(this.anIntArray398);
		} else {
			this.anIntArray398 = new int[local48];
		}
		if (this.anIntArrayArray49 == null || this.anIntArrayArray49.length != local48) {
			this.anIntArrayArray49 = new int[local48][];
		}
		@Pc(201) int local201;
		for (local67 = 0; local67 < local48; local67++) {
			this.anIntArray396[local67] = this.aClass315_4.method27229(3) + 1;
			local75 = this.anIntArray394[local67] = this.aClass315_4.method27229(2);
			if (local75 != 0) {
				this.anIntArray398[local67] = this.aClass315_4.method27229(8);
			}
			local75 = 0x1 << local75;
			@Pc(194) int[] local194 = new int[local75];
			this.anIntArrayArray49[local67] = local194;
			for (local201 = 0; local201 < local75; local201++) {
				local194[local201] = this.aClass315_4.method27229(8) - 1;
			}
		}
		this.anInt4135 = this.aClass315_4.method27229(2) + 1;
		local67 = this.aClass315_4.method27229(4);
		local75 = 2;
		@Pc(234) int local234;
		for (local234 = 0; local234 < local29; local234++) {
			local75 += this.anIntArray396[this.anIntArray395[local234]];
		}
		if (this.anIntArray397 != null && this.anIntArray397.length == local75) {
			this.method27265(this.anIntArray397);
		} else {
			this.anIntArray397 = new int[local75];
		}
		this.anIntArray397[0] = 0;
		this.anIntArray397[1] = 0x1 << local67;
		local75 = 2;
		for (local234 = 0; local234 < local29; local234++) {
			local201 = this.anIntArray395[local234];
			for (@Pc(292) int local292 = 0; local292 < this.anIntArray396[local201]; local292++) {
				this.anIntArray397[local75++] = this.aClass315_4.method27229(local67);
			}
		}
		if (this.anIntArrayArray50 == null || this.anIntArrayArray50.length < local75) {
			this.anIntArrayArray50 = new int[arg1][local75];
			this.anIntArrayArray51 = new int[arg1][local75];
			this.aBooleanArrayArray11 = new boolean[arg1][local75];
		}
	}

	@OriginalMember(owner = "client!hm", name = "aw", descriptor = "(I)V")
	void method27274(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray29[arg0]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		@Pc(16) int local16 = anIntArray399[this.anInt4135 - 1];
		@Pc(21) boolean[] local21 = this.aBooleanArrayArray11[arg0];
		this.aBooleanArrayArray11[arg0][1] = true;
		local21[0] = true;
		@Pc(34) int local34;
		for (local34 = 2; local34 < local9; local34++) {
			@Pc(42) int local42 = method27297(this.anIntArray397, local34);
			@Pc(47) int local47 = method27266(this.anIntArray397, local34);
			@Pc(74) int local74 = this.method27280(this.anIntArray397[local42], this.anIntArrayArray51[arg0][local42], this.anIntArray397[local47], this.anIntArrayArray51[arg0][local47], this.anIntArray397[local34]);
			@Pc(81) int local81 = this.anIntArrayArray51[arg0][local34];
			@Pc(85) int local85 = local16 - local74;
			@Pc(96) int local96 = (local85 < local74 ? local85 : local74) << 1;
			if (local81 == 0) {
				this.aBooleanArrayArray11[arg0][local34] = false;
				this.anIntArrayArray51[arg0][local34] = local74;
			} else {
				@Pc(103) boolean[] local103 = this.aBooleanArrayArray11[arg0];
				this.aBooleanArrayArray11[arg0][local47] = true;
				local103[local42] = true;
				this.aBooleanArrayArray11[arg0][local34] = true;
				if (local81 >= local96) {
					this.anIntArrayArray51[arg0][local34] = local85 > local74 ? local81 - local74 + local74 : local74 - local81 + local85 - 1;
				} else {
					this.anIntArrayArray51[arg0][local34] = (local81 & 0x1) == 0 ? local74 + (local81 >> 1) : local74 - (local81 + 1 >> 1);
				}
			}
		}
		for (local34 = 0; local34 < local9; local34++) {
			if (!this.aBooleanArrayArray11[arg0][local34]) {
				this.anIntArrayArray51[arg0][local34] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "(III)V")
	void method27277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(12) int local12 = this.anIntArrayArray50[arg2][arg0];
		@Pc(19) int local19 = this.anIntArrayArray51[arg2][arg0];
		@Pc(26) boolean local26 = this.aBooleanArrayArray11[arg2][arg0];
		for (@Pc(30) int local30 = arg0 + 1; local30 <= arg1; local30++) {
			@Pc(40) int local40 = this.anIntArrayArray50[arg2][local30];
			if (local40 < local12) {
				this.anIntArrayArray50[arg2][local5] = local40;
				this.anIntArrayArray51[arg2][local5] = this.anIntArrayArray51[arg2][local30];
				this.aBooleanArrayArray11[arg2][local5] = this.aBooleanArrayArray11[arg2][local30];
				local5++;
				this.anIntArrayArray50[arg2][local30] = this.anIntArrayArray50[arg2][local5];
				this.anIntArrayArray51[arg2][local30] = this.anIntArrayArray51[arg2][local5];
				this.aBooleanArrayArray11[arg2][local30] = this.aBooleanArrayArray11[arg2][local5];
			}
		}
		this.anIntArrayArray50[arg2][local5] = local12;
		this.anIntArrayArray51[arg2][local5] = local19;
		this.aBooleanArrayArray11[arg2][local5] = local26;
		this.method27277(arg0, local5 - 1, arg2);
		this.method27277(local5 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "(IIIII)I")
	int method27278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "([I)V")
	void method27279(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "(IIIII)I")
	int method27280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "(IIIII)I")
	int method27281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIIII)I")
	int method27282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "(IIIILclient!hb;I)V")
	void method27283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4.aFloatArray103[arg0] *= aFloatArray104[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(62) int local62 = arg0 + 1; local62 < arg2; local62++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4.aFloatArray103[local62] *= aFloatArray104[local20];
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIILclient!hb;I)V")
	void method27284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4.aFloatArray103[arg0] *= aFloatArray104[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(62) int local62 = arg0 + 1; local62 < arg2; local62++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4.aFloatArray103[local62] *= aFloatArray104[local20];
		}
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(IIIILclient!hb;I)V")
	void method27285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4.aFloatArray103[arg0] *= aFloatArray104[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(62) int local62 = arg0 + 1; local62 < arg2; local62++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4.aFloatArray103[local62] *= aFloatArray104[local20];
		}
	}

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "(IIIILclient!hb;I)V")
	void method27286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4.aFloatArray103[arg0] *= aFloatArray104[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(62) int local62 = arg0 + 1; local62 < arg2; local62++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4.aFloatArray103[local62] *= aFloatArray104[local20];
		}
	}

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "([I)V")
	void method27287(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(IIIILclient!hb;I)V")
	void method27289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4.aFloatArray103[arg0] *= aFloatArray104[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(62) int local62 = arg0 + 1; local62 < arg2; local62++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4.aFloatArray103[local62] *= aFloatArray104[local20];
		}
	}

	@OriginalMember(owner = "client!hm", name = "ag", descriptor = "([I)V")
	void method27290(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "ah", descriptor = "(III)V")
	void method27291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(12) int local12 = this.anIntArrayArray50[arg2][arg0];
		@Pc(19) int local19 = this.anIntArrayArray51[arg2][arg0];
		@Pc(26) boolean local26 = this.aBooleanArrayArray11[arg2][arg0];
		for (@Pc(30) int local30 = arg0 + 1; local30 <= arg1; local30++) {
			@Pc(40) int local40 = this.anIntArrayArray50[arg2][local30];
			if (local40 < local12) {
				this.anIntArrayArray50[arg2][local5] = local40;
				this.anIntArrayArray51[arg2][local5] = this.anIntArrayArray51[arg2][local30];
				this.aBooleanArrayArray11[arg2][local5] = this.aBooleanArrayArray11[arg2][local30];
				local5++;
				this.anIntArrayArray50[arg2][local30] = this.anIntArrayArray50[arg2][local5];
				this.anIntArrayArray51[arg2][local30] = this.anIntArrayArray51[arg2][local5];
				this.aBooleanArrayArray11[arg2][local30] = this.aBooleanArrayArray11[arg2][local5];
			}
		}
		this.anIntArrayArray50[arg2][local5] = local12;
		this.anIntArrayArray51[arg2][local5] = local19;
		this.aBooleanArrayArray11[arg2][local5] = local26;
		this.method27277(arg0, local5 - 1, arg2);
		this.method27277(local5 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "at", descriptor = "(I)V")
	void method27292(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray29[arg0]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		@Pc(16) int local16 = anIntArray399[this.anInt4135 - 1];
		@Pc(21) boolean[] local21 = this.aBooleanArrayArray11[arg0];
		this.aBooleanArrayArray11[arg0][1] = true;
		local21[0] = true;
		@Pc(34) int local34;
		for (local34 = 2; local34 < local9; local34++) {
			@Pc(42) int local42 = method27297(this.anIntArray397, local34);
			@Pc(47) int local47 = method27266(this.anIntArray397, local34);
			@Pc(74) int local74 = this.method27280(this.anIntArray397[local42], this.anIntArrayArray51[arg0][local42], this.anIntArray397[local47], this.anIntArrayArray51[arg0][local47], this.anIntArray397[local34]);
			@Pc(81) int local81 = this.anIntArrayArray51[arg0][local34];
			@Pc(85) int local85 = local16 - local74;
			@Pc(96) int local96 = (local85 < local74 ? local85 : local74) << 1;
			if (local81 == 0) {
				this.aBooleanArrayArray11[arg0][local34] = false;
				this.anIntArrayArray51[arg0][local34] = local74;
			} else {
				@Pc(103) boolean[] local103 = this.aBooleanArrayArray11[arg0];
				this.aBooleanArrayArray11[arg0][local47] = true;
				local103[local42] = true;
				this.aBooleanArrayArray11[arg0][local34] = true;
				if (local81 >= local96) {
					this.anIntArrayArray51[arg0][local34] = local85 > local74 ? local81 - local74 + local74 : local74 - local81 + local85 - 1;
				} else {
					this.anIntArrayArray51[arg0][local34] = (local81 & 0x1) == 0 ? local74 + (local81 >> 1) : local74 - (local81 + 1 >> 1);
				}
			}
		}
		for (local34 = 0; local34 < local9; local34++) {
			if (!this.aBooleanArrayArray11[arg0][local34]) {
				this.anIntArrayArray51[arg0][local34] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "al", descriptor = "(III)V")
	void method27293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(12) int local12 = this.anIntArrayArray50[arg2][arg0];
		@Pc(19) int local19 = this.anIntArrayArray51[arg2][arg0];
		@Pc(26) boolean local26 = this.aBooleanArrayArray11[arg2][arg0];
		for (@Pc(30) int local30 = arg0 + 1; local30 <= arg1; local30++) {
			@Pc(40) int local40 = this.anIntArrayArray50[arg2][local30];
			if (local40 < local12) {
				this.anIntArrayArray50[arg2][local5] = local40;
				this.anIntArrayArray51[arg2][local5] = this.anIntArrayArray51[arg2][local30];
				this.aBooleanArrayArray11[arg2][local5] = this.aBooleanArrayArray11[arg2][local30];
				local5++;
				this.anIntArrayArray50[arg2][local30] = this.anIntArrayArray50[arg2][local5];
				this.anIntArrayArray51[arg2][local30] = this.anIntArrayArray51[arg2][local5];
				this.aBooleanArrayArray11[arg2][local30] = this.aBooleanArrayArray11[arg2][local5];
			}
		}
		this.anIntArrayArray50[arg2][local5] = local12;
		this.anIntArrayArray51[arg2][local5] = local19;
		this.aBooleanArrayArray11[arg2][local5] = local26;
		this.method27277(arg0, local5 - 1, arg2);
		this.method27277(local5 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "ai", descriptor = "(I)Z")
	boolean method27294(@OriginalArg(0) int arg0) {
		@Pc(7) boolean local7 = this.aClass315_4.method27223() != 0;
		this.aBooleanArray29[arg0] = local7;
		if (!local7) {
			return false;
		}
		@Pc(20) int local20 = this.anIntArray397.length;
		@Pc(22) int local22;
		for (local22 = 0; local22 < local20; local22++) {
			this.anIntArrayArray50[arg0][local22] = this.anIntArray397[local22];
		}
		local22 = anIntArray399[this.anInt4135 - 1];
		@Pc(50) int local50 = Class548.method31195(local22 - 1, -26719184);
		this.anIntArrayArray51[arg0][0] = this.aClass315_4.method27229(local50);
		this.anIntArrayArray51[arg0][1] = this.aClass315_4.method27229(local50);
		@Pc(72) int local72 = 2;
		for (@Pc(74) int local74 = 0; local74 < this.anIntArray395.length; local74++) {
			@Pc(84) int local84 = this.anIntArray395[local74];
			@Pc(89) int local89 = this.anIntArray396[local84];
			@Pc(94) int local94 = this.anIntArray394[local84];
			@Pc(100) int local100 = (0x1 << local94) - 1;
			@Pc(102) int local102 = 0;
			if (local94 > 0) {
				local102 = this.aClass315_4.aClass324Array2[this.anIntArray398[local84]].method27377(this.aClass315_4);
			}
			for (@Pc(118) int local118 = 0; local118 < local89; local118++) {
				@Pc(130) int local130 = this.anIntArrayArray49[local84][local102 & local100];
				local102 >>>= local94;
				this.anIntArrayArray51[arg0][local72] = local130 >= 0 ? this.aClass315_4.aClass324Array2[local130].method27377(this.aClass315_4) : 0;
				local72++;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "ac", descriptor = "(III)V")
	void method27295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(12) int local12 = this.anIntArrayArray50[arg2][arg0];
		@Pc(19) int local19 = this.anIntArrayArray51[arg2][arg0];
		@Pc(26) boolean local26 = this.aBooleanArrayArray11[arg2][arg0];
		for (@Pc(30) int local30 = arg0 + 1; local30 <= arg1; local30++) {
			@Pc(40) int local40 = this.anIntArrayArray50[arg2][local30];
			if (local40 < local12) {
				this.anIntArrayArray50[arg2][local5] = local40;
				this.anIntArrayArray51[arg2][local5] = this.anIntArrayArray51[arg2][local30];
				this.aBooleanArrayArray11[arg2][local5] = this.aBooleanArrayArray11[arg2][local30];
				local5++;
				this.anIntArrayArray50[arg2][local30] = this.anIntArrayArray50[arg2][local5];
				this.anIntArrayArray51[arg2][local30] = this.anIntArrayArray51[arg2][local5];
				this.aBooleanArrayArray11[arg2][local30] = this.aBooleanArrayArray11[arg2][local5];
			}
		}
		this.anIntArrayArray50[arg2][local5] = local12;
		this.anIntArrayArray51[arg2][local5] = local19;
		this.aBooleanArrayArray11[arg2][local5] = local26;
		this.method27277(arg0, local5 - 1, arg2);
		this.method27277(local5 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "am", descriptor = "(Lclient!hb;II)V")
	void method27296(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBooleanArray29[arg2]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		this.method27277(0, local9 - 1, arg2);
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = this.anIntArrayArray51[arg2][0] * this.anInt4135;
		@Pc(47) int local47;
		for (@Pc(30) int local30 = 1; local30 < local9; local30++) {
			if (this.anIntArrayArray51[arg2][local30] >= 0) {
				local47 = this.anIntArrayArray50[arg2][local30];
				@Pc(57) int local57 = this.anIntArrayArray51[arg2][local30] * this.anInt4135;
				this.method27289(local18, local28, local47, local57, arg0, arg1);
				if (local47 >= arg1) {
				}
				local18 = local47;
				local28 = local57;
			}
		}
		@Pc(78) float local78 = aFloatArray104[local28];
		for (local47 = local18; local47 < arg1; local47++) {
			arg0.aFloatArray103[local47] *= local78;
		}
	}

	@OriginalMember(owner = "client!hm", name = "ad", descriptor = "(Lclient!hb;II)V")
	void method27298(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBooleanArray29[arg2]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		this.method27277(0, local9 - 1, arg2);
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = this.anIntArrayArray51[arg2][0] * this.anInt4135;
		@Pc(47) int local47;
		for (@Pc(30) int local30 = 1; local30 < local9; local30++) {
			if (this.anIntArrayArray51[arg2][local30] >= 0) {
				local47 = this.anIntArrayArray50[arg2][local30];
				@Pc(57) int local57 = this.anIntArrayArray51[arg2][local30] * this.anInt4135;
				this.method27289(local18, local28, local47, local57, arg0, arg1);
				if (local47 >= arg1) {
				}
				local18 = local47;
				local28 = local57;
			}
		}
		@Pc(78) float local78 = aFloatArray104[local28];
		for (local47 = local18; local47 < arg1; local47++) {
			arg0.aFloatArray103[local47] *= local78;
		}
	}

	@OriginalMember(owner = "client!hm", name = "ae", descriptor = "([I)V")
	void method27299(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "au", descriptor = "(Lclient!hb;II)V")
	void method27300(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBooleanArray29[arg2]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		this.method27277(0, local9 - 1, arg2);
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = this.anIntArrayArray51[arg2][0] * this.anInt4135;
		@Pc(47) int local47;
		for (@Pc(30) int local30 = 1; local30 < local9; local30++) {
			if (this.anIntArrayArray51[arg2][local30] >= 0) {
				local47 = this.anIntArrayArray50[arg2][local30];
				@Pc(57) int local57 = this.anIntArrayArray51[arg2][local30] * this.anInt4135;
				this.method27289(local18, local28, local47, local57, arg0, arg1);
				if (local47 >= arg1) {
				}
				local18 = local47;
				local28 = local57;
			}
		}
		@Pc(78) float local78 = aFloatArray104[local28];
		for (local47 = local18; local47 < arg1; local47++) {
			arg0.aFloatArray103[local47] *= local78;
		}
	}

	@OriginalMember(owner = "client!hm", name = "ar", descriptor = "(Lclient!hb;II)V")
	void method27301(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBooleanArray29[arg2]) {
			return;
		}
		@Pc(9) int local9 = this.anIntArray397.length;
		this.method27277(0, local9 - 1, arg2);
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = this.anIntArrayArray51[arg2][0] * this.anInt4135;
		@Pc(47) int local47;
		for (@Pc(30) int local30 = 1; local30 < local9; local30++) {
			if (this.anIntArrayArray51[arg2][local30] >= 0) {
				local47 = this.anIntArrayArray50[arg2][local30];
				@Pc(57) int local57 = this.anIntArrayArray51[arg2][local30] * this.anInt4135;
				this.method27289(local18, local28, local47, local57, arg0, arg1);
				if (local47 >= arg1) {
				}
				local18 = local47;
				local28 = local57;
			}
		}
		@Pc(78) float local78 = aFloatArray104[local28];
		for (local47 = local18; local47 < arg1; local47++) {
			arg0.aFloatArray103[local47] *= local78;
		}
	}
}
