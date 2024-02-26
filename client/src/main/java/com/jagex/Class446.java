package com.jagex;

import java.awt.Canvas;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class446 implements Iterator {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	int anInt4881 = 0;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	int anInt4882 = this.anAbstractQueue_Sub1_1.anInt3225 * 1299944509;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "Lclient!ath;")
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1;

	@OriginalMember(owner = "client!nr", name = "cg", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method29251(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean802 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, -473255122);
	}

	@OriginalMember(owner = "client!nr", name = "zj", descriptor = "(Lclient!yp;I)V")
	static void method29252(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass676Array1[local12].anInt5738 * -2030390053;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "(Lclient!aff;Ljava/awt/Canvas;III)Lclient!apw;")
	static Class108_Sub2_Sub3 method29253(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class108_Sub2_Sub3_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!ath;)V")
	Class446(@OriginalArg(0) AbstractQueue_Sub1 arg0) {
		this.anAbstractQueue_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt4881 * 1760636063 < this.anAbstractQueue_Sub1_1.anInt3224 * 451065463;
	}

	@OriginalMember(owner = "client!nr", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		if (this.anAbstractQueue_Sub1_1.anInt3225 * -2017012353 != this.anInt4882 * 389898347) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4881 * 1760636063 < this.anAbstractQueue_Sub1_1.anInt3224 * 451065463) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass437Array1[this.anInt4881 * 1760636063].anObject18;
			this.anInt4881 += -215421089;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method29247() {
		if (this.anAbstractQueue_Sub1_1.anInt3225 * -2017012353 != this.anInt4882 * 389898347) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4881 * 1760636063 < this.anAbstractQueue_Sub1_1.anInt3224 * 451065463) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass437Array1[this.anInt4881 * 1760636063].anObject18;
			this.anInt4881 += -215421089;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!nr", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "()Z")
	public boolean method29248() {
		return this.anInt4881 * 1760636063 < this.anAbstractQueue_Sub1_1.anInt3224 * 451065463;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "()V")
	public void method29249() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "()V")
	public void method29250() {
		throw new UnsupportedOperationException();
	}
}
