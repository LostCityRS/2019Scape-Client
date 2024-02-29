package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agc")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!agc", name = "p", descriptor = "Lclient!agt;")
	Class116_Sub2 aClass116_Sub2_1;

	@OriginalMember(owner = "client!agc", name = "z", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_1;

	@OriginalMember(owner = "client!agc", name = "d", descriptor = "Z")
	boolean aBoolean174;

	@OriginalMember(owner = "client!agc", name = "<init>", descriptor = "(Lclient!aqd;Lclient!hj;)V", line = 14)
	Class115_Sub1(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0, arg1);
		this.aClass104_Sub2_Sub1_1 = arg0;
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!agc", name = "f", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;", line = 20)
	@Override
	Class116 method8299(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub2((Class104_Sub2_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agc", name = "af", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;", line = 20)
	@Override
	Class116 method8314(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub2((Class104_Sub2_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agc", name = "ak", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;", line = 20)
	@Override
	Class116 method8309(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub2((Class104_Sub2_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agc", name = "d", descriptor = "(Lclient!hi;)Z", line = 24)
	@Override
	public boolean method8301(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8444()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8205(arg0, 1024156270) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "bn", descriptor = "(Lclient!hi;)Z", line = 24)
	@Override
	public boolean method8300(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8444()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8205(arg0, 2090461934) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "bt", descriptor = "(Lclient!hi;)Z", line = 24)
	@Override
	public boolean method8317(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8444()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8205(arg0, 1029006106) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "bq", descriptor = "(Lclient!hi;)Z", line = 24)
	@Override
	public boolean method8316(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8444()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8205(arg0, 1345838865) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "v", descriptor = "(Lclient!hv;)Lclient!aql;", line = 38)
	@Override
	Class93_Sub33_Sub1 method8302(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agc", name = "bw", descriptor = "(Lclient!hv;)Lclient!aql;", line = 38)
	@Override
	Class93_Sub33_Sub1 method8312(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agc", name = "bu", descriptor = "(Lclient!hv;)Lclient!aql;", line = 38)
	@Override
	Class93_Sub33_Sub1 method8311(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agc", name = "e", descriptor = "()V", line = 42)
	@Override
	public void method8315() {
		if (this.aClass116_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
		this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!agc", name = "aq", descriptor = "()V", line = 42)
	@Override
	public void method8304() {
		if (this.aClass116_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
		this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!agc", name = "ax", descriptor = "()V", line = 42)
	@Override
	public void method8305() {
		if (this.aClass116_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass104_Sub2_Sub1_1.method19538(this.aClass116_Sub2_1.aLong30);
		this.aClass104_Sub2_Sub1_1.method19540(this.aClass116_Sub2_1.aLong29);
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!agc", name = "aj", descriptor = "()V", line = 50)
	@Override
	public void method8308() {
		this.aClass104_Sub2_Sub1_1.method19538(0L);
		this.aClass104_Sub2_Sub1_1.method19540(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method21057(1);
		this.aClass104_Sub2_Sub1_1.method21061(null);
		this.aClass104_Sub2_Sub1_1.method21057(0);
		this.aClass104_Sub2_Sub1_1.method21061(null);
	}

	@OriginalMember(owner = "client!agc", name = "av", descriptor = "()V", line = 50)
	@Override
	public void method8306() {
		this.aClass104_Sub2_Sub1_1.method19538(0L);
		this.aClass104_Sub2_Sub1_1.method19540(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method21057(1);
		this.aClass104_Sub2_Sub1_1.method21061(null);
		this.aClass104_Sub2_Sub1_1.method21057(0);
		this.aClass104_Sub2_Sub1_1.method21061(null);
	}

	@OriginalMember(owner = "client!agc", name = "ao", descriptor = "()V", line = 50)
	@Override
	public void method8307() {
		this.aClass104_Sub2_Sub1_1.method19538(0L);
		this.aClass104_Sub2_Sub1_1.method19540(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method21057(1);
		this.aClass104_Sub2_Sub1_1.method21061(null);
		this.aClass104_Sub2_Sub1_1.method21057(0);
		this.aClass104_Sub2_Sub1_1.method21061(null);
	}

	@OriginalMember(owner = "client!agc", name = "n", descriptor = "()V", line = 50)
	@Override
	public void method8310() {
		this.aClass104_Sub2_Sub1_1.method19538(0L);
		this.aClass104_Sub2_Sub1_1.method19540(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method21057(1);
		this.aClass104_Sub2_Sub1_1.method21061(null);
		this.aClass104_Sub2_Sub1_1.method21057(0);
		this.aClass104_Sub2_Sub1_1.method21061(null);
	}

	@OriginalMember(owner = "client!agc", name = "ay", descriptor = "()V", line = 50)
	@Override
	public void method8313() {
		this.aClass104_Sub2_Sub1_1.method19538(0L);
		this.aClass104_Sub2_Sub1_1.method19540(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method21057(1);
		this.aClass104_Sub2_Sub1_1.method21061(null);
		this.aClass104_Sub2_Sub1_1.method21057(0);
		this.aClass104_Sub2_Sub1_1.method21061(null);
	}

	@OriginalMember(owner = "client!agc", name = "m", descriptor = "()Z", line = 61)
	@Override
	public boolean method8303() {
		return this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 == this.aClass116_Sub2_1;
	}

	@OriginalMember(owner = "client!agc", name = "dw", descriptor = "()Z", line = 61)
	@Override
	public boolean method8319() {
		return this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 == this.aClass116_Sub2_1;
	}

	@OriginalMember(owner = "client!agc", name = "ds", descriptor = "()Z", line = 61)
	@Override
	public boolean method8318() {
		return this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 == this.aClass116_Sub2_1;
	}
}
