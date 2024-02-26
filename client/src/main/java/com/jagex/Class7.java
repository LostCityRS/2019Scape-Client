package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!aae")
public final class Class7 implements Iterator {

	@OriginalMember(owner = "client!aae", name = "f", descriptor = "Lclient!tn;")
	Class80 aClass80_1;

	@OriginalMember(owner = "client!aae", name = "t", descriptor = "Lclient!aag;")
	Class8 aClass8_1;

	@OriginalMember(owner = "client!aae", name = "e", descriptor = "Lclient!tn;")
	Class80 aClass80_2 = null;

	@OriginalMember(owner = "client!aae", name = "aep", descriptor = "(Lclient!yp;I)V")
	static void method221(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1];
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = Class467.method29718(local9);
	}

	@OriginalMember(owner = "client!aae", name = "aov", descriptor = "(Lclient!yp;B)V")
	static void method222(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(51) Class463 local51 = Class463.method29541((float) local13, (float) local23, (float) local33);
		if (local51.aFloat297 == -1.0F) {
			local51.aFloat297 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat295) {
			local51.aFloat295 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat296 == -1.0F) {
			local51.aFloat296 = Float.POSITIVE_INFINITY;
		}
		Class160.aClass121_Sub1_2.method9572(local51, 1480894522);
		Class160.aClass121_Sub1_2.method9680((float) local43 / 1000.0F, (byte) 111);
		local51.method29557();
	}

	@OriginalMember(owner = "client!aae", name = "alc", descriptor = "(Lclient!yp;I)V")
	static void method223(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class13.aBoolean5 && Class411.aFrame2 != null) {
			Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
		}
	}

	@OriginalMember(owner = "client!aae", name = "<init>", descriptor = "(Lclient!aag;)V")
	public Class7(@OriginalArg(0) Class8 arg0) {
		this.method210(arg0, 116356022);
	}

	@OriginalMember(owner = "client!aae", name = "t", descriptor = "()Z")
	public boolean method209() {
		return this.aClass8_1.aClass80_3 != this.aClass80_1;
	}

	@OriginalMember(owner = "client!aae", name = "l", descriptor = "(Lclient!aag;I)V")
	public void method210(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		this.aClass8_1 = arg0;
		this.method211(837508027);
	}

	@OriginalMember(owner = "client!aae", name = "g", descriptor = "(I)V")
	void method211(@OriginalArg(0) int arg0) {
		this.aClass80_1 = this.aClass8_1 == null ? null : this.aClass8_1.aClass80_3.aClass80_227;
		this.aClass80_2 = null;
	}

	@OriginalMember(owner = "client!aae", name = "j", descriptor = "()Lclient!tn;")
	public Class80 method212() {
		this.method211(893063109);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aae", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(2) Class80 local2 = this.aClass80_1;
		if (local2 == this.aClass8_1.aClass80_3) {
			local2 = null;
			this.aClass80_1 = null;
		} else {
			this.aClass80_1 = local2.aClass80_227;
		}
		this.aClass80_2 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aae", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.aClass8_1.aClass80_3 != this.aClass80_1;
	}

	@OriginalMember(owner = "client!aae", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		if (this.aClass80_2 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_2.method24395((byte) 22);
		this.aClass80_2 = null;
	}

	@OriginalMember(owner = "client!aae", name = "u", descriptor = "()V")
	public void method213() {
		if (this.aClass80_2 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_2.method24395((byte) 42);
		this.aClass80_2 = null;
	}

	@OriginalMember(owner = "client!aae", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method214() {
		@Pc(2) Class80 local2 = this.aClass80_1;
		if (local2 == this.aClass8_1.aClass80_3) {
			local2 = null;
			this.aClass80_1 = null;
		} else {
			this.aClass80_1 = local2.aClass80_227;
		}
		this.aClass80_2 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aae", name = "e", descriptor = "()V")
	public void method215() {
		if (this.aClass80_2 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_2.method24395((byte) 62);
		this.aClass80_2 = null;
	}

	@OriginalMember(owner = "client!aae", name = "m", descriptor = "()Lclient!tn;")
	public Class80 method216() {
		this.method211(-1834591075);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aae", name = "o", descriptor = "()Lclient!tn;")
	public Class80 method217() {
		this.method211(728227892);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aae", name = "s", descriptor = "()Lclient!tn;")
	public Class80 method218() {
		this.method211(-1331077166);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aae", name = "a", descriptor = "()Lclient!tn;")
	public Class80 method219() {
		this.method211(985092170);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aae", name = "i", descriptor = "(I)Lclient!tn;")
	public Class80 method220(@OriginalArg(0) int arg0) {
		this.method211(3170770);
		return (Class80) this.next();
	}
}
