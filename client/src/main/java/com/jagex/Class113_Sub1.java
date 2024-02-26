package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agj")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!agj", name = "j", descriptor = "Lclient!agu;")
	Class114_Sub2 aClass114_Sub2_1;

	@OriginalMember(owner = "client!agj", name = "o", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_1;

	@OriginalMember(owner = "client!agj", name = "a", descriptor = "Z")
	boolean aBoolean182;

	@OriginalMember(owner = "client!agj", name = "<init>", descriptor = "(Lclient!aqw;Lclient!hs;)V")
	Class113_Sub1(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class324 arg1) {
		super(arg0, arg1);
		this.aClass102_Sub1_Sub2_1 = arg0;
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!agj", name = "be", descriptor = "(Lclient!ht;)Z")
	@Override
	public boolean method8279(@OriginalArg(0) Class114 arg0) {
		if (this.aClass114_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8577()) {
			this.aClass114_Sub2_1 = (Class114_Sub2) arg0;
			this.anInt993 = this.method8264(arg0, 2083090213) * -822875393;
			if (this.anInt993 * 1683166463 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean182) {
				this.aClass102_Sub1_Sub2_1.method21559(this.aClass114_Sub2_1.aLong32);
				this.aClass102_Sub1_Sub2_1.method21577(this.aClass114_Sub2_1.aLong31);
				this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = this.aClass114_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agj", name = "l", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	@Override
	Class114 method8260(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		return new Class114_Sub2((Class102_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "a", descriptor = "(Lclient!ht;)Z")
	@Override
	public boolean method8295(@OriginalArg(0) Class114 arg0) {
		if (this.aClass114_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8577()) {
			this.aClass114_Sub2_1 = (Class114_Sub2) arg0;
			this.anInt993 = this.method8264(arg0, 2089535567) * -822875393;
			if (this.anInt993 * 1683166463 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean182) {
				this.aClass102_Sub1_Sub2_1.method21559(this.aClass114_Sub2_1.aLong32);
				this.aClass102_Sub1_Sub2_1.method21577(this.aClass114_Sub2_1.aLong31);
				this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = this.aClass114_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agj", name = "x", descriptor = "(Lclient!hi;)Lclient!aqv;")
	@Override
	Class80_Sub13_Sub1 method8348(@OriginalArg(0) Class314 arg0) {
		return new Class80_Sub13_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agj", name = "t", descriptor = "()V")
	@Override
	public void method8256() {
		if (this.aClass114_Sub2_1 == null) {
			throw new RuntimeException_Sub1();
		}
		this.aClass102_Sub1_Sub2_1.method21559(this.aClass114_Sub2_1.aLong32);
		this.aClass102_Sub1_Sub2_1.method21577(this.aClass114_Sub2_1.aLong31);
		this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = this.aClass114_Sub2_1;
		this.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!agj", name = "ad", descriptor = "()V")
	@Override
	public void method8297() {
		this.aClass102_Sub1_Sub2_1.method21559(0L);
		this.aClass102_Sub1_Sub2_1.method21577(0L);
		this.aBoolean182 = false;
		this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = null;
		this.aClass102_Sub1_Sub2_1.method21217(1);
		this.aClass102_Sub1_Sub2_1.method21429(null);
		this.aClass102_Sub1_Sub2_1.method21217(0);
		this.aClass102_Sub1_Sub2_1.method21429(null);
	}

	@OriginalMember(owner = "client!agj", name = "bh", descriptor = "(Lclient!ht;)Z")
	@Override
	public boolean method8319(@OriginalArg(0) Class114 arg0) {
		if (this.aClass114_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method8577()) {
			this.aClass114_Sub2_1 = (Class114_Sub2) arg0;
			this.anInt993 = this.method8264(arg0, 1725156420) * -822875393;
			if (this.anInt993 * 1683166463 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean182) {
				this.aClass102_Sub1_Sub2_1.method21559(this.aClass114_Sub2_1.aLong32);
				this.aClass102_Sub1_Sub2_1.method21577(this.aClass114_Sub2_1.aLong31);
				this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = this.aClass114_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agj", name = "at", descriptor = "()V")
	@Override
	public void method8296() {
		if (this.aClass114_Sub2_1 == null) {
			throw new RuntimeException_Sub1();
		}
		this.aClass102_Sub1_Sub2_1.method21559(this.aClass114_Sub2_1.aLong32);
		this.aClass102_Sub1_Sub2_1.method21577(this.aClass114_Sub2_1.aLong31);
		this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = this.aClass114_Sub2_1;
		this.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!agj", name = "ae", descriptor = "()Z")
	@Override
	public boolean method8372() {
		return this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 == this.aClass114_Sub2_1;
	}

	@OriginalMember(owner = "client!agj", name = "av", descriptor = "()V")
	@Override
	public void method8298() {
		this.aClass102_Sub1_Sub2_1.method21559(0L);
		this.aClass102_Sub1_Sub2_1.method21577(0L);
		this.aBoolean182 = false;
		this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = null;
		this.aClass102_Sub1_Sub2_1.method21217(1);
		this.aClass102_Sub1_Sub2_1.method21429(null);
		this.aClass102_Sub1_Sub2_1.method21217(0);
		this.aClass102_Sub1_Sub2_1.method21429(null);
	}

	@OriginalMember(owner = "client!agj", name = "as", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	@Override
	Class114 method8306(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		return new Class114_Sub2((Class102_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "aa", descriptor = "()Z")
	@Override
	public boolean method8304() {
		return this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 == this.aClass114_Sub2_1;
	}

	@OriginalMember(owner = "client!agj", name = "an", descriptor = "()Z")
	@Override
	public boolean method8299() {
		return this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 == this.aClass114_Sub2_1;
	}

	@OriginalMember(owner = "client!agj", name = "e", descriptor = "()Z")
	@Override
	public boolean method8357() {
		return this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 == this.aClass114_Sub2_1;
	}

	@OriginalMember(owner = "client!agj", name = "aw", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	@Override
	Class114 method8307(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		return new Class114_Sub2((Class102_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "bo", descriptor = "(Lclient!hi;)Lclient!aqv;")
	@Override
	Class80_Sub13_Sub1 method8323(@OriginalArg(0) Class314 arg0) {
		return new Class80_Sub13_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agj", name = "f", descriptor = "()V")
	@Override
	public void method8257() {
		this.aClass102_Sub1_Sub2_1.method21559(0L);
		this.aClass102_Sub1_Sub2_1.method21577(0L);
		this.aBoolean182 = false;
		this.aClass102_Sub1_Sub2_1.aClass114_Sub2_2 = null;
		this.aClass102_Sub1_Sub2_1.method21217(1);
		this.aClass102_Sub1_Sub2_1.method21429(null);
		this.aClass102_Sub1_Sub2_1.method21217(0);
		this.aClass102_Sub1_Sub2_1.method21429(null);
	}
}
