package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public class Class400 {

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "J")
	long aLong268;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	int anInt4679;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!lj;)V", line = 9)
	Class400(@OriginalArg(0) Class399 arg0) {
		this.aLong268 = arg0.anInt4677;
		this.anInt4679 = 1;
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([Lclient!lj;)V", line = 14)
	Class400(@OriginalArg(0) Class399[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method28507(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "()I", line = 19)
	public final int method28497() {
		return this.anInt4679;
	}

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "()I", line = 19)
	public final int method28498() {
		return this.anInt4679;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "()I", line = 19)
	public final int method28499() {
		return this.anInt4679;
	}

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "()I", line = 19)
	public final int method28500() {
		return this.anInt4679;
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "()I", line = 19)
	public final int method28501() {
		return this.anInt4679;
	}

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "(I)Lclient!lj;", line = 23)
	public final Class399 method28502(@OriginalArg(0) int arg0) {
		return Class399.method28494(this.method28504(arg0));
	}

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "(I)Lclient!lj;", line = 23)
	public final Class399 method28503(@OriginalArg(0) int arg0) {
		return Class399.method28494(this.method28504(arg0));
	}

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "(I)I", line = 27)
	final int method28504(@OriginalArg(0) int arg0) {
		return (int) (this.aLong268 >> Class399.anInt4673 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "(I)I", line = 27)
	final int method28505(@OriginalArg(0) int arg0) {
		return (int) (this.aLong268 >> Class399.anInt4673 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)I", line = 27)
	final int method28506(@OriginalArg(0) int arg0) {
		return (int) (this.aLong268 >> Class399.anInt4673 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "(Lclient!lj;)V", line = 31)
	final void method28507(@OriginalArg(0) Class399 arg0) {
		this.aLong268 |= arg0.anInt4677 << Class399.anInt4673 * this.anInt4679++;
	}
}
