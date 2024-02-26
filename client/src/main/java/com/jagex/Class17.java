package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!aap")
public final class Class17 implements Iterator {

	@OriginalMember(owner = "client!aap", name = "f", descriptor = "Lclient!tn;")
	Class80 aClass80_5;

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "I")
	int anInt52;

	@OriginalMember(owner = "client!aap", name = "u", descriptor = "Lclient!tn;")
	Class80 aClass80_6 = null;

	@OriginalMember(owner = "client!aap", name = "t", descriptor = "Lclient!aax;")
	Class24 aClass24_1;

	@OriginalMember(owner = "client!aap", name = "fr", descriptor = "(I)I")
	public static int method437(@OriginalArg(0) int arg0) {
		if (Class13.aBoolean5 && Class411.aFrame2 != null) {
			return 3;
		} else if (client.aBoolean729) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aap", name = "u", descriptor = "(IB)Lclient!ci;")
	static Class205 method438(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class205 local6 = (Class205) Class80_Sub39.method15030(Class697.method37051(-1505691527), arg0, -1709906906);
		if (local6 == null) {
			local6 = Class205.aClass205_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!aap", name = "aqt", descriptor = "(Lclient!yp;I)V")
	static void method439(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aap", name = "<init>", descriptor = "(Lclient!aax;)V")
	public Class17(@OriginalArg(0) Class24 arg0) {
		this.aClass24_1 = arg0;
		this.method428((byte) -66);
	}

	@OriginalMember(owner = "client!aap", name = "g", descriptor = "(I)Lclient!tn;")
	public Class80 method427(@OriginalArg(0) int arg0) {
		this.method428((byte) 12);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aap", name = "l", descriptor = "(B)V")
	void method428(@OriginalArg(0) byte arg0) {
		this.aClass80_5 = this.aClass24_1.aClass80Array1[0].aClass80_227;
		this.anInt52 = 2078358593;
		this.aClass80_6 = null;
	}

	@OriginalMember(owner = "client!aap", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		if (this.aClass80_5 != this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1]) {
			return true;
		}
		while (this.anInt52 * -192359487 < this.aClass24_1.anInt76 * -1339522543) {
			if (this.aClass24_1.aClass80Array1[(this.anInt52 += 2078358593) * -192359487 - 1].aClass80_227 != this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1]) {
				this.aClass80_5 = this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1].aClass80_227;
				return true;
			}
			this.aClass80_5 = this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aap", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(15) Class80 local15;
		if (this.aClass80_5 != this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1]) {
			local15 = this.aClass80_5;
			this.aClass80_5 = local15.aClass80_227;
			this.aClass80_6 = local15;
			return local15;
		}
		do {
			if (this.anInt52 * -192359487 >= this.aClass24_1.anInt76 * -1339522543) {
				return null;
			}
			local15 = this.aClass24_1.aClass80Array1[(this.anInt52 += 2078358593) * -192359487 - 1].aClass80_227;
		} while (this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1] == local15);
		this.aClass80_5 = local15.aClass80_227;
		this.aClass80_6 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aap", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		if (this.aClass80_6 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_6.method24395((byte) 8);
		this.aClass80_6 = null;
	}

	@OriginalMember(owner = "client!aap", name = "t", descriptor = "()Z")
	public boolean method429() {
		if (this.aClass80_5 != this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1]) {
			return true;
		}
		while (this.anInt52 * -192359487 < this.aClass24_1.anInt76 * -1339522543) {
			if (this.aClass24_1.aClass80Array1[(this.anInt52 += 2078358593) * -192359487 - 1].aClass80_227 != this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1]) {
				this.aClass80_5 = this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1].aClass80_227;
				return true;
			}
			this.aClass80_5 = this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aap", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method430() {
		@Pc(15) Class80 local15;
		if (this.aClass80_5 != this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1]) {
			local15 = this.aClass80_5;
			this.aClass80_5 = local15.aClass80_227;
			this.aClass80_6 = local15;
			return local15;
		}
		do {
			if (this.anInt52 * -192359487 >= this.aClass24_1.anInt76 * -1339522543) {
				return null;
			}
			local15 = this.aClass24_1.aClass80Array1[(this.anInt52 += 2078358593) * -192359487 - 1].aClass80_227;
		} while (this.aClass24_1.aClass80Array1[this.anInt52 * -192359487 - 1] == local15);
		this.aClass80_5 = local15.aClass80_227;
		this.aClass80_6 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "()V")
	public void method431() {
		if (this.aClass80_6 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_6.method24395((byte) 79);
		this.aClass80_6 = null;
	}

	@OriginalMember(owner = "client!aap", name = "u", descriptor = "()V")
	public void method432() {
		if (this.aClass80_6 == null) {
			throw new IllegalStateException();
		}
		this.aClass80_6.method24395((byte) 124);
		this.aClass80_6 = null;
	}

	@OriginalMember(owner = "client!aap", name = "i", descriptor = "()V")
	void method433() {
		this.aClass80_5 = this.aClass24_1.aClass80Array1[0].aClass80_227;
		this.anInt52 = 2078358593;
		this.aClass80_6 = null;
	}

	@OriginalMember(owner = "client!aap", name = "m", descriptor = "()Lclient!tn;")
	public Class80 method434() {
		this.method428((byte) -4);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aap", name = "o", descriptor = "()Lclient!tn;")
	public Class80 method435() {
		this.method428((byte) -85);
		return (Class80) this.next();
	}

	@OriginalMember(owner = "client!aap", name = "j", descriptor = "()Lclient!tn;")
	public Class80 method436() {
		this.method428((byte) -41);
		return (Class80) this.next();
	}
}
