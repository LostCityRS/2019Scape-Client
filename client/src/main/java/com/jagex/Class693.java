package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ys")
public final class Class693 implements Interface22 {

	@OriginalMember(owner = "client!ys", name = "w", descriptor = "I")
	static int anInt5783;

	@OriginalMember(owner = "client!ys", name = "t", descriptor = "Lclient!kf;")
	Class378 aClass378_4;

	@OriginalMember(owner = "client!ys", name = "aex", descriptor = "(Lclient!yp;I)V")
	static void method37002(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 ^ 0x1 << local23;
	}

	@OriginalMember(owner = "client!ys", name = "abb", descriptor = "(Lclient!yp;I)V")
	static void method37003(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27140(local12, -1638542131).method27046((byte) -75);
	}

	@OriginalMember(owner = "client!ys", name = "yp", descriptor = "(Lclient!yp;I)V")
	static void method37004(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class363.aClass152_1.method14598(-448050673);
	}

	@OriginalMember(owner = "client!ys", name = "e", descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;")
	public static String method37005(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(4) String local4 = Class384.method28592(Class481.method30017(arg0, 2038549251));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!ys", name = "<init>", descriptor = "(Lclient!kf;)V")
	Class693(@OriginalArg(0) Class378 arg0) {
		this.aClass378_4 = arg0;
	}

	@OriginalMember(owner = "client!ys", name = "o", descriptor = "(Lclient!kb;B)I")
	@Override
	public int method36978(@OriginalArg(0) Class374 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, -503867854), 1345117720);
	}

	@OriginalMember(owner = "client!ys", name = "ay", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36977(@OriginalArg(0) Class107 arg0) {
		@Pc(15) Integer local15 = this.aClass378_4.method28502(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, 16711935);
		return local15 == null ? (Integer) arg0.method7184((byte) 14) : local15;
	}

	@OriginalMember(owner = "client!ys", name = "f", descriptor = "(Lclient!ea;I)J")
	@Override
	public long method36984(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Long local15 = this.aClass378_4.method28482(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, 1759133837);
		return local15 == null ? (Long) arg0.method7184((byte) 14) : local15;
	}

	@OriginalMember(owner = "client!ys", name = "d", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36986(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "g", descriptor = "(Lclient!kb;IB)V")
	@Override
	public void method36987(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "t", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method36983(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "e", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36985(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "m", descriptor = "(Lclient!ea;I)I")
	@Override
	public int method36980(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Integer local15 = this.aClass378_4.method28502(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, 16711935);
		return local15 == null ? (Integer) arg0.method7184((byte) 14) : local15;
	}

	@OriginalMember(owner = "client!ys", name = "r", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36996(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "ax", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36979(@OriginalArg(0) Class107 arg0) {
		@Pc(15) Integer local15 = this.aClass378_4.method28502(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, 16711935);
		return local15 == null ? (Integer) arg0.method7184((byte) 14) : local15;
	}

	@OriginalMember(owner = "client!ys", name = "i", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36989(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "ai", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36981(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, -618536981), -1438245977);
	}

	@OriginalMember(owner = "client!ys", name = "aq", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36982(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, 845621407), 1337218236);
	}

	@OriginalMember(owner = "client!ys", name = "l", descriptor = "(Lclient!ea;Ljava/lang/Object;I)V")
	@Override
	public void method37001(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "j", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36990(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "a", descriptor = "(Lclient!ea;)J")
	@Override
	public long method36991(@OriginalArg(0) Class107 arg0) {
		@Pc(15) Long local15 = this.aClass378_4.method28482(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, 1759133837);
		return local15 == null ? (Long) arg0.method7184((byte) 14) : local15;
	}

	@OriginalMember(owner = "client!ys", name = "s", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36992(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "k", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36999(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "x", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36994(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "w", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	public Object method36995(@OriginalArg(0) Class107 arg0) {
		if (arg0.aClass521_6 != Class521.aClass521_42) {
			throw new IllegalArgumentException("");
		}
		return this.aClass378_4.method28477(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, (byte) -1);
	}

	@OriginalMember(owner = "client!ys", name = "u", descriptor = "(Lclient!ea;I)Ljava/lang/Object;")
	@Override
	public Object method36988(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass521_6 != Class521.aClass521_42) {
			throw new IllegalArgumentException("");
		}
		return this.aClass378_4.method28477(client.aClass722_4.anInt5829 * 1531299647 << 16 | arg0.anInt862 * -1873516487, (byte) 43);
	}

	@OriginalMember(owner = "client!ys", name = "q", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36997(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "h", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36998(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "z", descriptor = "(Lclient!kb;I)V")
	@Override
	public void method37000(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "p", descriptor = "(Lclient!kb;I)V")
	@Override
	public void method36993(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}
}
