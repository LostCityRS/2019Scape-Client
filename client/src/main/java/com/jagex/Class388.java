package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class388 implements Interface32 {

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "Lclient!kd;")
	final Class376 aClass376_1;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Lclient!kp;")
	final Class384 aClass384_2;

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "(ZZI)V")
	public static void method28633(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Class687.anInt5772 += -241315101;
			Class443.method29217(-1644373765);
		}
		if (arg1) {
			Class687.anInt5773 += -1120305201;
			Class523.method30650((byte) 42);
		}
	}

	@OriginalMember(owner = "client!ku", name = "ka", descriptor = "(Lclient!hx;IILclient!yp;I)V")
	static void method28634(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class690 arg3, @OriginalArg(4) int arg4) {
		if (arg0.anIntArray403 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.aByteArrayArray15 = new byte[11][];
			arg0.aByteArrayArray14 = new byte[11][];
			arg0.anIntArray410 = new int[11];
			arg0.anIntArray401 = new int[11];
			arg0.anIntArray403 = new int[11];
		}
		arg0.anIntArray403[arg1] = arg2;
		if (arg2 > 0) {
			arg0.aBoolean813 = true;
			return;
		}
		arg0.aBoolean813 = false;
		for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray15.length; local43++) {
			if (arg0.aByteArrayArray15[local43] != null || arg0.anIntArray403[local43] > 0) {
				arg0.aBoolean813 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!ub;IILclient!yp;S)V")
	static void method28635(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class690 arg3, @OriginalArg(4) short arg4) {
		@Pc(5) Class80_Sub1_Sub20 local5 = Class584.method31840(arg0, arg1, arg2, 1424094934);
		if (local5 == null) {
			Class647.method33053((byte) 89);
			return;
		}
		arg3.anIntArray527 = new int[local5.anInt3147 * 132623];
		arg3.anObjectArray45 = new Object[local5.anInt3146 * 37010973];
		if (local5.aClass158_70 == Class158.aClass158_52 || local5.aClass158_70 == Class158.aClass158_51 || local5.aClass158_70 == Class158.aClass158_49) {
			arg3.anIntArray527[0] = arg1;
			arg3.anIntArray527[1] = Class363.aClass152_1.method14615(-1152168205);
			arg3.anIntArray527[2] = Class363.aClass152_1.method14598(-1277292464);
		} else if (local5.aClass158_70 == Class158.aClass158_59 || Class158.aClass158_48 == local5.aClass158_70 || local5.aClass158_70 == Class158.aClass158_62 || Class158.aClass158_50 == local5.aClass158_70 || Class158.aClass158_68 == local5.aClass158_70) {
			arg3.anIntArray527[0] = arg1;
		} else if (local5.aClass158_70 == Class158.aClass158_60) {
			arg3.anIntArray527[0] = arg3.anInt5779 * 1171848299;
		}
		Class430.method29084(local5, 500000, arg3, (byte) 9);
	}

	@OriginalMember(owner = "client!ku", name = "kc", descriptor = "(Lclient!he;Lclient!hx;ZB)V")
	public static void method28636(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		Class162_Sub1.method15722(arg0.aClass327Array2, arg1, arg2, (byte) 100);
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(J)V")
	static void method28637(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!kp;Lclient!kd;)V")
	Class388(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class376 arg1) {
		this.aClass376_1 = arg1;
		this.aClass384_2 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "(Lclient!ed;Ljava/lang/String;III)I")
	int method28629(@OriginalArg(0) Class104 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method7631(arg1, arg2 + arg4, arg3 + arg4, this.aClass376_1.anInt4527 * -2114890899 - arg4 * 2, this.aClass376_1.anInt4526 * 319686533 - arg4 * 2, this.aClass376_1.anInt4522 * -323236991, this.aClass376_1.anInt4523 * 1753193795, 0, 0, 0, null, null, null, 0, 0, (byte) 0);
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		return this.aClass384_2.method28582((byte) -59);
	}

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
	}

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "(Lclient!ed;Ljava/lang/String;III)I")
	int method28630(@OriginalArg(0) Class104 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method7631(arg1, arg2 + arg4, arg3 + arg4, this.aClass376_1.anInt4527 * -2114890899 - arg4 * 2, this.aClass376_1.anInt4526 * 319686533 - arg4 * 2, this.aClass376_1.anInt4522 * -323236991, this.aClass376_1.anInt4523 * 1753193795, 0, 0, 0, null, null, null, 0, 0, (byte) 0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!ed;Ljava/lang/String;IIII)I")
	int method28631(@OriginalArg(0) Class104 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return arg0.method7631(arg1, arg2 + arg4, arg3 + arg4, this.aClass376_1.anInt4527 * -2114890899 - arg4 * 2, this.aClass376_1.anInt4526 * 319686533 - arg4 * 2, this.aClass376_1.anInt4522 * -323236991, this.aClass376_1.anInt4523 * 1753193795, 0, 0, 0, null, null, null, 0, 0, (byte) 0);
	}

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "(Z)V")
	@Override
	public void method28660(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class386 local9 = this.aClass384_2.method28584(this.aClass376_1.anInt4525 * 585717469, (byte) 14);
		if (local9 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass376_1.aClass391_10.method28669(this.aClass376_1.anInt4527 * -2114890899, client.anInt3510 * 1528239985, (byte) -55) + this.aClass376_1.anInt4520 * -481372299;
		@Pc(51) int local51 = this.aClass376_1.aClass383_10.method28573(this.aClass376_1.anInt4526 * 319686533, client.anInt3511 * 1764386615, (byte) 64) + this.aClass376_1.anInt4521 * 202022865;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20818(local31, local51, this.aClass376_1.anInt4527 * -2114890899, this.aClass376_1.anInt4526 * 319686533, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51 += this.method28631(Class8.aClass104_1, local9.aString205, local31, local51, 5, 2036747717) * 12;
		local51 += 8;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20727(local31, local51, this.aClass376_1.anInt4527 * -2114890899 + local31 - 1, local51, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51++;
		local51 += this.method28631(Class8.aClass104_1, local9.aString206, local31, local51, 5, 2036747717) * 12;
		local51 += 5;
		@Pc(143) int local143 = local51 + this.method28631(Class8.aClass104_1, local9.aString207, local31, local51, 5, 2036747717) * 12;
	}

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "(Z)V")
	@Override
	public void method28659(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class386 local9 = this.aClass384_2.method28584(this.aClass376_1.anInt4525 * 585717469, (byte) 124);
		if (local9 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass376_1.aClass391_10.method28669(this.aClass376_1.anInt4527 * -2114890899, client.anInt3510 * 1528239985, (byte) -104) + this.aClass376_1.anInt4520 * -481372299;
		@Pc(51) int local51 = this.aClass376_1.aClass383_10.method28573(this.aClass376_1.anInt4526 * 319686533, client.anInt3511 * 1764386615, (byte) 83) + this.aClass376_1.anInt4521 * 202022865;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20818(local31, local51, this.aClass376_1.anInt4527 * -2114890899, this.aClass376_1.anInt4526 * 319686533, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51 += this.method28631(Class8.aClass104_1, local9.aString205, local31, local51, 5, 2036747717) * 12;
		local51 += 8;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20727(local31, local51, this.aClass376_1.anInt4527 * -2114890899 + local31 - 1, local51, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51++;
		local51 += this.method28631(Class8.aClass104_1, local9.aString206, local31, local51, 5, 2036747717) * 12;
		local51 += 5;
		@Pc(143) int local143 = local51 + this.method28631(Class8.aClass104_1, local9.aString207, local31, local51, 5, 2036747717) * 12;
	}

	@OriginalMember(owner = "client!ku", name = "x", descriptor = "(Lclient!ed;Ljava/lang/String;III)I")
	int method28632(@OriginalArg(0) Class104 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method7631(arg1, arg2 + arg4, arg3 + arg4, this.aClass376_1.anInt4527 * -2114890899 - arg4 * 2, this.aClass376_1.anInt4526 * 319686533 - arg4 * 2, this.aClass376_1.anInt4522 * -323236991, this.aClass376_1.anInt4523 * 1753193795, 0, 0, 0, null, null, null, 0, 0, (byte) 0);
	}

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
	}

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		return this.aClass384_2.method28582((byte) 26);
	}

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		return this.aClass384_2.method28582((byte) -16);
	}

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "(Z)V")
	@Override
	public void method28656(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class386 local9 = this.aClass384_2.method28584(this.aClass376_1.anInt4525 * 585717469, (byte) 15);
		if (local9 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass376_1.aClass391_10.method28669(this.aClass376_1.anInt4527 * -2114890899, client.anInt3510 * 1528239985, (byte) -29) + this.aClass376_1.anInt4520 * -481372299;
		@Pc(51) int local51 = this.aClass376_1.aClass383_10.method28573(this.aClass376_1.anInt4526 * 319686533, client.anInt3511 * 1764386615, (byte) 44) + this.aClass376_1.anInt4521 * 202022865;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20818(local31, local51, this.aClass376_1.anInt4527 * -2114890899, this.aClass376_1.anInt4526 * 319686533, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51 += this.method28631(Class8.aClass104_1, local9.aString205, local31, local51, 5, 2036747717) * 12;
		local51 += 8;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20727(local31, local51, this.aClass376_1.anInt4527 * -2114890899 + local31 - 1, local51, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51++;
		local51 += this.method28631(Class8.aClass104_1, local9.aString206, local31, local51, 5, 2036747717) * 12;
		local51 += 5;
		@Pc(143) int local143 = local51 + this.method28631(Class8.aClass104_1, local9.aString207, local31, local51, 5, 2036747717) * 12;
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(ZB)V")
	@Override
	public void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class386 local9 = this.aClass384_2.method28584(this.aClass376_1.anInt4525 * 585717469, (byte) 54);
		if (local9 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass376_1.aClass391_10.method28669(this.aClass376_1.anInt4527 * -2114890899, client.anInt3510 * 1528239985, (byte) -34) + this.aClass376_1.anInt4520 * -481372299;
		@Pc(51) int local51 = this.aClass376_1.aClass383_10.method28573(this.aClass376_1.anInt4526 * 319686533, client.anInt3511 * 1764386615, (byte) 34) + this.aClass376_1.anInt4521 * 202022865;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20818(local31, local51, this.aClass376_1.anInt4527 * -2114890899, this.aClass376_1.anInt4526 * 319686533, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51 += this.method28631(Class8.aClass104_1, local9.aString205, local31, local51, 5, 2036747717) * 12;
		local51 += 8;
		if (this.aClass376_1.aBoolean847) {
			Class279.aClass102_9.method20727(local31, local51, this.aClass376_1.anInt4527 * -2114890899 + local31 - 1, local51, this.aClass376_1.anInt4524 * 911715329, 0);
		}
		local51++;
		local51 += this.method28631(Class8.aClass104_1, local9.aString206, local31, local51, 5, 2036747717) * 12;
		local51 += 5;
		@Pc(143) int local143 = local51 + this.method28631(Class8.aClass104_1, local9.aString207, local31, local51, 5, 2036747717) * 12;
	}
}
