package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public class Class438 implements Interface46 {

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_82 = new Class240(64);

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!py;")
	Class497 aClass497_114;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!py;)V", line = 12)
	public Class438(@OriginalArg(0) Class497 arg0) {
		this.aClass497_114 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(II)Lclient!nj;", line = 17)
	@Override
	public synchronized Class439 method28821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30064(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method28830(new Packet(local17), (byte) 2);
		}
		local6.method28838(207329962);
		this.aClass240_82.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "(I)Lclient!nj;", line = 17)
	@Override
	public synchronized Class439 method28824(@OriginalArg(0) int arg0) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30064(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method28830(new Packet(local17), (byte) 2);
		}
		local6.method28838(207329962);
		this.aClass240_82.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Lclient!nj;", line = 17)
	@Override
	public synchronized Class439 method28822(@OriginalArg(0) int arg0) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30064(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method28830(new Packet(local17), (byte) 2);
		}
		local6.method28838(207329962);
		this.aClass240_82.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "(I)Lclient!nj;", line = 17)
	@Override
	public synchronized Class439 method28823(@OriginalArg(0) int arg0) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30064(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method28830(new Packet(local17), (byte) 2);
		}
		local6.method28838(207329962);
		this.aClass240_82.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "()V", line = 28)
	public void method28825() {
		this.aClass240_82.method25847((byte) -73);
	}

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "(I)V", line = 28)
	public void method28826(@OriginalArg(0) int arg0) {
		this.aClass240_82.method25847((byte) -85);
	}

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "()V", line = 28)
	public void method28827() {
		this.aClass240_82.method25847((byte) -1);
	}

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "(III)I", line = 99)
	public static int method28828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "(Lclient!yf;I)V", line = 189)
	static void method28829(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Class499.method30148(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -619641186);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local14;
	}
}
