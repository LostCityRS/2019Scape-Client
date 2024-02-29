package jagex3;

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

	@OriginalMember(owner = "client!agc", name = "<init>", descriptor = "(Lclient!aqd;Lclient!hj;)V")
	Class115_Sub1(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0, arg1);
		this.aClass104_Sub2_Sub1_1 = arg0;
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!agc", name = "aj", descriptor = "()V")
	@Override
	public void method8237() {
		this.aClass104_Sub2_Sub1_1.method19567(0L);
		this.aClass104_Sub2_Sub1_1.method19533(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method20978(1);
		this.aClass104_Sub2_Sub1_1.method21032(null);
		this.aClass104_Sub2_Sub1_1.method20978(0);
		this.aClass104_Sub2_Sub1_1.method21032(null);
	}

	@OriginalMember(owner = "client!agc", name = "f", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	@Override
	Class116 method8197(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub2((Class104_Sub2_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agc", name = "d", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8203(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8241(arg0, 1024156270) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "e", descriptor = "()V")
	@Override
	public void method8285() {
		if (this.aClass116_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
		this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!agc", name = "v", descriptor = "(Lclient!hv;)Lclient!aql;")
	@Override
	Class93_Sub33_Sub1 method8206(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agc", name = "m", descriptor = "()Z")
	@Override
	public boolean method8225() {
		return this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 == this.aClass116_Sub2_1;
	}

	@OriginalMember(owner = "client!agc", name = "aq", descriptor = "()V")
	@Override
	public void method8233() {
		if (this.aClass116_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
		this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!agc", name = "av", descriptor = "()V")
	@Override
	public void method8235() {
		this.aClass104_Sub2_Sub1_1.method19567(0L);
		this.aClass104_Sub2_Sub1_1.method19533(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method20978(1);
		this.aClass104_Sub2_Sub1_1.method21032(null);
		this.aClass104_Sub2_Sub1_1.method20978(0);
		this.aClass104_Sub2_Sub1_1.method21032(null);
	}

	@OriginalMember(owner = "client!agc", name = "bw", descriptor = "(Lclient!hv;)Lclient!aql;")
	@Override
	Class93_Sub33_Sub1 method8261(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agc", name = "ao", descriptor = "()V")
	@Override
	public void method8236() {
		this.aClass104_Sub2_Sub1_1.method19567(0L);
		this.aClass104_Sub2_Sub1_1.method19533(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method20978(1);
		this.aClass104_Sub2_Sub1_1.method21032(null);
		this.aClass104_Sub2_Sub1_1.method20978(0);
		this.aClass104_Sub2_Sub1_1.method21032(null);
	}

	@OriginalMember(owner = "client!agc", name = "bn", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8202(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8241(arg0, 2090461934) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "n", descriptor = "()V")
	@Override
	public void method8255() {
		this.aClass104_Sub2_Sub1_1.method19567(0L);
		this.aClass104_Sub2_Sub1_1.method19533(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method20978(1);
		this.aClass104_Sub2_Sub1_1.method21032(null);
		this.aClass104_Sub2_Sub1_1.method20978(0);
		this.aClass104_Sub2_Sub1_1.method21032(null);
	}

	@OriginalMember(owner = "client!agc", name = "ay", descriptor = "()V")
	@Override
	public void method8282() {
		this.aClass104_Sub2_Sub1_1.method19567(0L);
		this.aClass104_Sub2_Sub1_1.method19533(0L);
		this.aBoolean174 = false;
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = null;
		this.aClass104_Sub2_Sub1_1.method20978(1);
		this.aClass104_Sub2_Sub1_1.method21032(null);
		this.aClass104_Sub2_Sub1_1.method20978(0);
		this.aClass104_Sub2_Sub1_1.method21032(null);
	}

	@OriginalMember(owner = "client!agc", name = "ax", descriptor = "()V")
	@Override
	public void method8234() {
		if (this.aClass116_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
		this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
		this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!agc", name = "af", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	@Override
	Class116 method8284(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub2((Class104_Sub2_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agc", name = "bt", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8294(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8241(arg0, 1029006106) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "bq", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8290(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			this.aClass116_Sub2_1 = (Class116_Sub2) arg0;
			this.anInt971 = this.method8241(arg0, 1345838865) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean174) {
				this.aClass104_Sub2_Sub1_1.method19567(this.aClass116_Sub2_1.aLong30);
				this.aClass104_Sub2_Sub1_1.method19533(this.aClass116_Sub2_1.aLong29);
				this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 = this.aClass116_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agc", name = "bu", descriptor = "(Lclient!hv;)Lclient!aql;")
	@Override
	Class93_Sub33_Sub1 method8260(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agc", name = "dw", descriptor = "()Z")
	@Override
	public boolean method8310() {
		return this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 == this.aClass116_Sub2_1;
	}

	@OriginalMember(owner = "client!agc", name = "ak", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	@Override
	Class116 method8243(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub2((Class104_Sub2_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agc", name = "ds", descriptor = "()Z")
	@Override
	public boolean method8301() {
		return this.aClass104_Sub2_Sub1_1.aClass116_Sub2_2 == this.aClass116_Sub2_1;
	}
}
