package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class438 implements Interface46 {

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_82 = new Class240(64);

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!py;")
	Class497 aClass497_114;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "(Lclient!yf;I)V")
	static void method29009(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Class499.method30334(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -619641186);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local14;
	}

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "(III)I")
	public static int method29010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class438(@OriginalArg(0) Class497 arg0) {
		this.aClass497_114 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(II)Lclient!nj;")
	@Override
	public synchronized Class439 method29002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30225(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method29012(new Class93_Sub41(local17), (byte) 2);
		}
		local6.method29017(207329962);
		this.aClass240_82.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "()V")
	public void method29006() {
		this.aClass240_82.method25926((byte) -73);
	}

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "(I)Lclient!nj;")
	@Override
	public synchronized Class439 method29005(@OriginalArg(0) int arg0) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30225(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method29012(new Class93_Sub41(local17), (byte) 2);
		}
		local6.method29017(207329962);
		this.aClass240_82.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Lclient!nj;")
	@Override
	public synchronized Class439 method29003(@OriginalArg(0) int arg0) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30225(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method29012(new Class93_Sub41(local17), (byte) 2);
		}
		local6.method29017(207329962);
		this.aClass240_82.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "(I)V")
	public void method29007(@OriginalArg(0) int arg0) {
		this.aClass240_82.method25926((byte) -85);
	}

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "(I)Lclient!nj;")
	@Override
	public synchronized Class439 method29004(@OriginalArg(0) int arg0) {
		@Pc(6) Class439 local6 = (Class439) this.aClass240_82.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(17) byte[] local17 = this.aClass497_114.method30225(0, arg0, (byte) 0);
		local6 = new Class439();
		if (local17 != null) {
			local6.method29012(new Class93_Sub41(local17), (byte) 2);
		}
		local6.method29017(207329962);
		this.aClass240_82.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "()V")
	public void method29008() {
		this.aClass240_82.method25926((byte) -1);
	}
}
