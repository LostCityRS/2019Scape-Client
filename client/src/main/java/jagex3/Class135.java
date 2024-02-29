package jagex3;

import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class135 implements Interface34 {

	@OriginalMember(owner = "client!op", name = "f", descriptor = "J")
	long aLong47 = 0L;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_8;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Lclient!ck;")
	final Class206 aClass206_14;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!dg;")
	final Class226 aClass226_15;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Z")
	boolean aBoolean253;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;ZI)V")
	Class135(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_Sub1_8 = arg0;
		this.aClass206_14 = arg1;
		this.aClass226_15 = arg2;
		this.aBoolean253 = arg3;
		this.aClass104_Sub2_Sub1_8.method20925(this);
	}

	@OriginalMember(owner = "client!op", name = "hl", descriptor = "()V")
	final void method11328() {
		this.method11331();
	}

	@OriginalMember(owner = "client!op", name = "bl", descriptor = "()J")
	long method11329() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!op", name = "ay", descriptor = "(Lclient!lt;)V")
	public void method11414(@OriginalArg(0) Class405 arg0) {
	}

	@OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method11331();
	}

	@OriginalMember(owner = "client!op", name = "bk", descriptor = "()V")
	final void method11331() {
		if (this.aLong47 != 0L) {
			this.aClass104_Sub2_Sub1_8.method19558(this.aLong47);
			this.aLong47 = 0L;
		}
	}

	@OriginalMember(owner = "client!op", name = "bx", descriptor = "()V")
	final void method11332() {
		if (this.aLong47 != 0L) {
			this.aClass104_Sub2_Sub1_8.method19558(this.aLong47);
			this.aLong47 = 0L;
		}
	}

	@OriginalMember(owner = "client!op", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		this.aClass104_Sub2_Sub1_8.method21139(this);
	}

	@OriginalMember(owner = "client!op", name = "ab", descriptor = "(Lclient!lt;)V")
	public void method11415(@OriginalArg(0) Class405 arg0) {
	}

	@OriginalMember(owner = "client!op", name = "az", descriptor = "(Lclient!lt;)V")
	public void method11416(@OriginalArg(0) Class405 arg0) {
	}

	@OriginalMember(owner = "client!op", name = "bh", descriptor = "()J")
	long method11335() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!op", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		this.aClass104_Sub2_Sub1_8.method21139(this);
	}
}
