package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public class Class436 implements Iterator {

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	int anInt4810 = 0;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	int anInt4811 = this.anAbstractQueue_Sub1_1.anInt3231 * -1483168829;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!att;")
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "(B)Z", line = 153)
	static boolean method28805(@OriginalArg(0) byte arg0) {
		return Class90.method1602(Class288.aClass636_1.aClass628_1, -1169082990);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!att;)V", line = 168)
	Class436(@OriginalArg(0) AbstractQueue_Sub1 arg0) {
		this.anAbstractQueue_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "hasNext", descriptor = "()Z", line = 173)
	@Override
	public boolean hasNext() {
		return this.anInt4810 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "()Z", line = 173)
	public boolean method28806() {
		return this.anInt4810 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "()Z", line = 173)
	public boolean method28807() {
		return this.anInt4810 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!ng", name = "next", descriptor = "()Ljava/lang/Object;", line = 177)
	@Override
	public Object next() {
		if (this.anInt4811 * 1753024071 != this.anAbstractQueue_Sub1_1.anInt3231 * 1029897493) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4810 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass441Array1[this.anInt4810 * 1263898687].anObject18;
			this.anInt4810 += 215900095;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method28808() {
		if (this.anInt4811 * 1753024071 != this.anAbstractQueue_Sub1_1.anInt3231 * 1029897493) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4810 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass441Array1[this.anInt4810 * 1263898687].anObject18;
			this.anInt4810 += 215900095;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "()Ljava/lang/Object;", line = 177)
	public Object method28809() {
		if (this.anInt4811 * 1753024071 != this.anAbstractQueue_Sub1_1.anInt3231 * 1029897493) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4810 * 1263898687 < this.anAbstractQueue_Sub1_1.anInt3230 * 2087138905) {
			@Pc(33) Object local33 = this.anAbstractQueue_Sub1_1.aClass441Array1[this.anInt4810 * 1263898687].anObject18;
			this.anInt4810 += 215900095;
			return local33;
		} else {
			throw new NoSuchElementException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "remove", descriptor = "()V", line = 187)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "()V", line = 187)
	public void method28810() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "()V", line = 187)
	public void method28811() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "(I)V", line = 473)
	public static void method28812(@OriginalArg(0) int arg0) {
		Class219.method25512(543603806);
		Class454.aBoolean773 = false;
		Class269.method26274(Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4589 * -310709577, Class221.anInt3629 * 1555894759, Class115.anInt972 * 1280805653, (byte) -27);
		Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 = null;
		Class272.aClass93_Sub1_Sub7_5 = null;
	}

	@OriginalMember(owner = "client!ng", name = "as", descriptor = "(Lclient!yf;I)V", line = 4933)
	static final void method28813(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		if (arg0.anIntArray519[arg0.anInt5891 * -1497248091] <= arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!ng", name = "ui", descriptor = "(Lclient!yf;I)V", line = 8583)
	static final void method28814(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 804235801);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3993 * 969124391;
	}

	@OriginalMember(owner = "client!ng", name = "acv", descriptor = "(Lclient!yf;I)V", line = 10002)
	static final void method28815(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByte158;
	}
}
