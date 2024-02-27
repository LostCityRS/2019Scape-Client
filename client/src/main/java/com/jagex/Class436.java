package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class436 implements Iterator {

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	int anInt4971 = 0;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	int anInt4972 = this.anAbstractQueue_Sub1_1.anInt3231 * -1483168829;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!att;")
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "(I)V")
	public static void method28992(@OriginalArg(0) int arg0) {
		Class219.method25607(543603806);
		Class454.aBoolean782 = false;
		Class269.method26366(Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, (byte) -27);
		Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 = null;
		Class272.aClass93_Sub1_Sub7_5 = null;
	}

	@OriginalMember(owner = "client!ng", name = "acv", descriptor = "(Lclient!yf;I)V")
	static void method28993(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByte158;
	}

	@OriginalMember(owner = "client!ng", name = "ui", descriptor = "(Lclient!yf;I)V")
	static void method28994(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 804235801);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4034 * 969124391;
	}

	@OriginalMember(owner = "client!ng", name = "as", descriptor = "(Lclient!yf;I)V")
	static void method28995(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		if (arg0.anIntArray521[arg0.anInt6052 * -1497248091] <= arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "(B)Z")
	static boolean method28996(@OriginalArg(0) byte arg0) {
		return Class90.method1602(Class288.aClass636_1.aClass628_1, -1169082990);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!att;)V")
	Class436(@OriginalArg(0) AbstractQueue_Sub1 arg0) {
		this.anAbstractQueue_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ng", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt4971 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!ng", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		if (this.anInt4972 * 1753024071 != this.anAbstractQueue_Sub1_1.anInt3231 * 1029897493) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4971 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass441Array1[this.anInt4971 * 1263898687].anObject18;
			this.anInt4971 += 215900095;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "()Z")
	public boolean method28986() {
		return this.anInt4971 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "()Z")
	public boolean method28987() {
		return this.anInt4971 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method28988() {
		if (this.anInt4972 * 1753024071 != this.anAbstractQueue_Sub1_1.anInt3231 * 1029897493) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4971 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass441Array1[this.anInt4971 * 1263898687].anObject18;
			this.anInt4971 += 215900095;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method28989() {
		if (this.anInt4972 * 1753024071 != this.anAbstractQueue_Sub1_1.anInt3231 * 1029897493) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4971 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass441Array1[this.anInt4971 * 1263898687].anObject18;
			this.anInt4971 += 215900095;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "()V")
	public void method28990() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "()V")
	public void method28991() {
		throw new UnsupportedOperationException();
	}
}
