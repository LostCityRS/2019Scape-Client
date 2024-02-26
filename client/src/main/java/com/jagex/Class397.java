package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class397 {

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	int anInt4563;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "J")
	long aLong378;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([Lclient!lo;)V")
	Class397(@OriginalArg(0) Class400[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method28706(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!lo;)V")
	Class397(@OriginalArg(0) Class400 arg0) {
		this.aLong378 = arg0.anInt4571;
		this.anInt4563 = 1;
	}

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "(Lclient!lo;)V")
	void method28706(@OriginalArg(0) Class400 arg0) {
		this.aLong378 |= arg0.anInt4571 << Class400.anInt4570 * this.anInt4563++;
	}

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "()I")
	public int method28707() {
		return this.anInt4563;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)Lclient!lo;")
	public Class400 method28708(@OriginalArg(0) int arg0) {
		return Class400.method28841(this.method28709(arg0));
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
	int method28709(@OriginalArg(0) int arg0) {
		return (int) (this.aLong378 >> Class400.anInt4570 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!lo;)V")
	void method28710(@OriginalArg(0) Class400 arg0) {
		this.aLong378 |= arg0.anInt4571 << Class400.anInt4570 * this.anInt4563++;
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "()I")
	public int method28711() {
		return this.anInt4563;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "()I")
	public int method28712() {
		return this.anInt4563;
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)Lclient!lo;")
	public Class400 method28713(@OriginalArg(0) int arg0) {
		return Class400.method28841(this.method28709(arg0));
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(I)Lclient!lo;")
	public Class400 method28714(@OriginalArg(0) int arg0) {
		return Class400.method28841(this.method28709(arg0));
	}

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "(I)I")
	int method28715(@OriginalArg(0) int arg0) {
		return (int) (this.aLong378 >> Class400.anInt4570 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)I")
	int method28716(@OriginalArg(0) int arg0) {
		return (int) (this.aLong378 >> Class400.anInt4570 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "(Lclient!lo;)V")
	void method28717(@OriginalArg(0) Class400 arg0) {
		this.aLong378 |= arg0.anInt4571 << Class400.anInt4570 * this.anInt4563++;
	}
}
