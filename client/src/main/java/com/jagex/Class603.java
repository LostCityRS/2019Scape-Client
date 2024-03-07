package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public class Class603 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "[I")
	int[] anIntArray486;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	int anInt5550 = -1895173889;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
	int anInt5551 = 1308423683;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "Lclient!uw;")
	Class604 aClass604_2 = Class604.aClass604_4;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
	int anInt5552 = 670946389;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 18)
	Class603() {
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31879(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(Lclient!alw;B)V", line = 22)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31879(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31879(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31879(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31879(arg0, local3, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "(Lclient!alw;IB)V", line = 29)
	void method31879(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt5550 = arg0.g2(-1434290800) * 1895173889;
		} else if (arg1 == 2) {
			this.anIntArray486 = new int[arg0.g1((short) 16384)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray486.length; local21++) {
				this.anIntArray486[local21] = arg0.g2(-1434290800);
			}
		} else if (arg1 == 3) {
			this.anInt5551 = arg0.g1((short) 16384) * -1308423683;
		} else if (arg1 == 4) {
			this.aClass604_2 = (Class604) Class107.method18116(Class544.method30949(1742201210), arg0.g1((short) 16384), -1915563430);
		} else if (arg1 == 5) {
			this.anInt5552 = arg0.gSmart2or4null(-394123065) * -670946389;
		} else if (arg1 == 6) {
			arg0.gSmart2or4null(-954810828);
		}
	}

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "(IB)V", line = 43)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(I)V", line = 43)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "(I)V", line = 43)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "(I)V", line = 44)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "()V", line = 44)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(IIIILclient!ao;Lclient!ao;)Lclient!sv;", line = 47)
	public static Class562 method31880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Interface11 arg5) {
		@Pc(1) Class563[] local1 = null;
		@Pc(7) Class603 local7 = (Class603) arg4.method18261(arg0, 1551311868);
		if (local7.anIntArray486 != null) {
			local1 = new Class563[local7.anIntArray486.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class353 local31 = (Class353) arg5.method18261(local7.anIntArray486[local18], -2088882693);
				local1[local18] = new Class563(local31.anInt4210 * -1345955691, local31.anInt4208 * -835293139, local31.anInt4212 * 1917694335, local31.anInt4209 * 1421004741, local31.anInt4207 * -691618485, local31.anInt4206 * -1875676513, local31.anInt4211 * -1567865913, local31.aBoolean726, local31.anInt4213 * -1648858631, local31.anInt4214 * 1528316847, local31.anInt4215 * 61090465);
			}
		}
		return new Class562(local7.anInt5550 * 887812353, local1, local7.anInt5551 * 430971733, arg1, arg2, arg3, local7.aClass604_2, local7.anInt5552 * -871926013);
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(IIIILclient!ao;Lclient!ao;)Lclient!sv;", line = 47)
	public static Class562 method31881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Interface11 arg5) {
		@Pc(1) Class563[] local1 = null;
		@Pc(7) Class603 local7 = (Class603) arg4.method18261(arg0, 1413088281);
		if (local7.anIntArray486 != null) {
			local1 = new Class563[local7.anIntArray486.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class353 local31 = (Class353) arg5.method18261(local7.anIntArray486[local18], 1867359385);
				local1[local18] = new Class563(local31.anInt4210 * -1345955691, local31.anInt4208 * -835293139, local31.anInt4212 * 1917694335, local31.anInt4209 * 1421004741, local31.anInt4207 * -691618485, local31.anInt4206 * -1875676513, local31.anInt4211 * -1567865913, local31.aBoolean726, local31.anInt4213 * -1648858631, local31.anInt4214 * 1528316847, local31.anInt4215 * 61090465);
			}
		}
		return new Class562(local7.anInt5550 * 887812353, local1, local7.anInt5551 * 430971733, arg1, arg2, arg3, local7.aClass604_2, local7.anInt5552 * -871926013);
	}

	@OriginalMember(owner = "client!uv", name = "vc", descriptor = "(Lclient!yf;I)V", line = 8890)
	static final void method31882(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class93_Sub22 local18 = Class102.method2588(Class446.aClass446_3, client.aClass175_2.aClass24_2, (byte) 109);
		local18.aPacketBit_1.p2(local12, 2143066079);
		client.aClass175_2.method24356(local18, -1476942798);
	}

	@OriginalMember(owner = "client!uv", name = "ank", descriptor = "(Lclient!yf;I)V", line = 12303)
	static final void method31883(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(21) Class472 local21 = Class472.method29535((float) local13, (float) local13, (float) local13);
		Class65.aClass123_Sub1_2.method8971(local21, -4089155);
		local21.method29544();
	}
}
