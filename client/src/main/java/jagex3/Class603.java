package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class603 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "[I")
	int[] anIntArray488;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	int anInt5711 = -1895173889;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
	int anInt5712 = 1308423683;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "Lclient!uw;")
	Class604 aClass604_2 = Class604.aClass604_4;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
	int anInt5713 = 670946389;

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(IIIILclient!ao;Lclient!ao;)Lclient!sv;")
	public static Class562 method32061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Interface11 arg5) {
		@Pc(1) Class563[] local1 = null;
		@Pc(7) Class603 local7 = (Class603) arg4.method18273(arg0, 1551311868);
		if (local7.anIntArray488 != null) {
			local1 = new Class563[local7.anIntArray488.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class353 local31 = (Class353) arg5.method18273(local7.anIntArray488[local18], -2088882693);
				local1[local18] = new Class563(local31.anInt4251 * -1345955691, local31.anInt4249 * -835293139, local31.anInt4253 * 1917694335, local31.anInt4250 * 1421004741, local31.anInt4248 * -691618485, local31.anInt4247 * -1875676513, local31.anInt4252 * -1567865913, local31.aBoolean730, local31.anInt4254 * -1648858631, local31.anInt4255 * 1528316847, local31.anInt4256 * 61090465);
			}
		}
		return new Class562(local7.anInt5711 * 887812353, local1, local7.anInt5712 * 430971733, arg1, arg2, arg3, local7.aClass604_2, local7.anInt5713 * -871926013);
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(IIIILclient!ao;Lclient!ao;)Lclient!sv;")
	public static Class562 method32062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Interface11 arg5) {
		@Pc(1) Class563[] local1 = null;
		@Pc(7) Class603 local7 = (Class603) arg4.method18273(arg0, 1413088281);
		if (local7.anIntArray488 != null) {
			local1 = new Class563[local7.anIntArray488.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class353 local31 = (Class353) arg5.method18273(local7.anIntArray488[local18], 1867359385);
				local1[local18] = new Class563(local31.anInt4251 * -1345955691, local31.anInt4249 * -835293139, local31.anInt4253 * 1917694335, local31.anInt4250 * 1421004741, local31.anInt4248 * -691618485, local31.anInt4247 * -1875676513, local31.anInt4252 * -1567865913, local31.aBoolean730, local31.anInt4254 * -1648858631, local31.anInt4255 * 1528316847, local31.anInt4256 * 61090465);
			}
		}
		return new Class562(local7.anInt5711 * 887812353, local1, local7.anInt5712 * 430971733, arg1, arg2, arg3, local7.aClass604_2, local7.anInt5713 * -871926013);
	}

	@OriginalMember(owner = "client!uv", name = "vc", descriptor = "(Lclient!yf;I)V")
	static void method32063(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class93_Sub22 local18 = Class102.method2592(Class446.aClass446_3, client.aClass175_2.aClass24_2, (byte) 109);
		local18.aClass93_Sub41_Sub2_1.method22466(local12, 2143066079);
		client.aClass175_2.method24363(local18, -1476942798);
	}

	@OriginalMember(owner = "client!uv", name = "ank", descriptor = "(Lclient!yf;I)V")
	static void method32064(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(21) Class472 local21 = Class472.method29710((float) local13, (float) local13, (float) local13);
		Class65.aClass123_Sub1_2.method8938(local21, -4089155);
		local21.method29713();
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	Class603() {
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32060(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32060(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "(Lclient!alw;IB)V")
	void method32060(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt5711 = arg0.method22427(-1434290800) * 1895173889;
		} else if (arg1 == 2) {
			this.anIntArray488 = new int[arg0.method22425((short) 16384)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray488.length; local21++) {
				this.anIntArray488[local21] = arg0.method22427(-1434290800);
			}
		} else if (arg1 == 3) {
			this.anInt5712 = arg0.method22425((short) 16384) * -1308423683;
		} else if (arg1 == 4) {
			this.aClass604_2 = (Class604) Class107.method18131(Class544.method31140(1742201210), arg0.method22425((short) 16384), -1915563430);
		} else if (arg1 == 5) {
			this.anInt5713 = arg0.method22448(-394123065) * -670946389;
		} else if (arg1 == 6) {
			arg0.method22448(-954810828);
		}
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32060(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32060(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32060(arg0, local3, (byte) 12);
		}
	}
}
