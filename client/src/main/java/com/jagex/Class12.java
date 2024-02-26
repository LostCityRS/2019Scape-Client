package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aak")
public final class Class12 implements Iterator {

	@OriginalMember(owner = "client!aak", name = "e", descriptor = "Lclient!akw;")
	Class80_Sub1 aClass80_Sub1_4 = null;

	@OriginalMember(owner = "client!aak", name = "t", descriptor = "Lclient!aaa;")
	Class3 aClass3_1;

	@OriginalMember(owner = "client!aak", name = "f", descriptor = "Lclient!akw;")
	Class80_Sub1 aClass80_Sub1_3;

	@OriginalMember(owner = "client!aak", name = "j", descriptor = "(I)V")
	public static void method346(@OriginalArg(0) int arg0) {
		Class329.aMap18.clear();
		Class329.aClass24_29.method564(-1635866803);
		Class329.aClass3_15.method41(-252802305);
		Class329.anInt4183 = 0;
	}

	@OriginalMember(owner = "client!aak", name = "aut", descriptor = "(Lclient!yp;I)V")
	static void method347(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1555063609);
	}

	@OriginalMember(owner = "client!aak", name = "<init>", descriptor = "(Lclient!aaa;)V")
	public Class12(@OriginalArg(0) Class3 arg0) {
		this.aClass3_1 = arg0;
		this.aClass80_Sub1_3 = this.aClass3_1.aClass80_Sub1_2.aClass80_Sub1_68;
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "o", descriptor = "()V")
	void method336() {
		this.aClass80_Sub1_3 = this.aClass3_1.aClass80_Sub1_2.aClass80_Sub1_68;
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "l", descriptor = "(I)V")
	void method337(@OriginalArg(0) int arg0) {
		this.aClass80_Sub1_3 = this.aClass3_1.aClass80_Sub1_2.aClass80_Sub1_68;
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "g", descriptor = "(I)Lclient!akw;")
	public Class80_Sub1 method338(@OriginalArg(0) int arg0) {
		this.method337(-2103522801);
		return (Class80_Sub1) this.next();
	}

	@OriginalMember(owner = "client!aak", name = "i", descriptor = "()V")
	void method339() {
		this.aClass80_Sub1_3 = this.aClass3_1.aClass80_Sub1_2.aClass80_Sub1_68;
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "t", descriptor = "()Z")
	public boolean method340() {
		return this.aClass3_1.aClass80_Sub1_2 != this.aClass80_Sub1_3;
	}

	@OriginalMember(owner = "client!aak", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		if (this.aClass80_Sub1_4 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_Sub1_4.method24406(-2147483641);
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method341() {
		@Pc(2) Class80_Sub1 local2 = this.aClass80_Sub1_3;
		if (this.aClass3_1.aClass80_Sub1_2 == local2) {
			local2 = null;
			this.aClass80_Sub1_3 = null;
		} else {
			this.aClass80_Sub1_3 = local2.aClass80_Sub1_68;
		}
		this.aClass80_Sub1_4 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aak", name = "e", descriptor = "()V")
	public void method342() {
		if (this.aClass80_Sub1_4 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_Sub1_4.method24406(-2147483643);
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(2) Class80_Sub1 local2 = this.aClass80_Sub1_3;
		if (this.aClass3_1.aClass80_Sub1_2 == local2) {
			local2 = null;
			this.aClass80_Sub1_3 = null;
		} else {
			this.aClass80_Sub1_3 = local2.aClass80_Sub1_68;
		}
		this.aClass80_Sub1_4 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aak", name = "j", descriptor = "()Lclient!akw;")
	public Class80_Sub1 method343() {
		this.method337(-2103522801);
		return (Class80_Sub1) this.next();
	}

	@OriginalMember(owner = "client!aak", name = "m", descriptor = "()V")
	void method344() {
		this.aClass80_Sub1_3 = this.aClass3_1.aClass80_Sub1_2.aClass80_Sub1_68;
		this.aClass80_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!aak", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.aClass3_1.aClass80_Sub1_2 != this.aClass80_Sub1_3;
	}

	@OriginalMember(owner = "client!aak", name = "u", descriptor = "()V")
	public void method345() {
		if (this.aClass80_Sub1_4 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_Sub1_4.method24406(Integer.MIN_VALUE);
		this.aClass80_Sub1_4 = null;
	}
}
