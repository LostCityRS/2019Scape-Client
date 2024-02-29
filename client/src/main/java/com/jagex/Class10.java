package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aah")
public class Class10 implements Iterator {

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "I")
	int anInt24;

	@OriginalMember(owner = "client!aah", name = "n", descriptor = "Lclient!tj;")
	Class93 aClass93_2;

	@OriginalMember(owner = "client!aah", name = "k", descriptor = "Lclient!tj;")
	Class93 aClass93_1 = null;

	@OriginalMember(owner = "client!aah", name = "e", descriptor = "Lclient!aan;")
	Class16 aClass16_1;

	@OriginalMember(owner = "client!aah", name = "<init>", descriptor = "(Lclient!aan;)V", line = 12)
	public Class10(@OriginalArg(0) Class16 arg0) {
		this.aClass16_1 = arg0;
		this.method156((byte) 52);
	}

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "()V", line = 18)
	void method154() {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "z", descriptor = "()V", line = 18)
	void method155() {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "l", descriptor = "(B)V", line = 18)
	void method156(@OriginalArg(0) byte arg0) {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "d", descriptor = "()V", line = 18)
	void method157() {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "u", descriptor = "(B)Lclient!tj;", line = 24)
	public Class93 method158(@OriginalArg(0) byte arg0) {
		this.method156((byte) -34);
		return (Class93) this.next();
	}

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "(I)Z", line = 26)
	public static boolean method159(@OriginalArg(0) int arg0) {
		return Class525.anInterface57_1 != null;
	}

	@OriginalMember(owner = "client!aah", name = "next", descriptor = "()Ljava/lang/Object;", line = 29)
	@Override
	public Object next() {
		@Pc(15) Class93 local15;
		if (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] != this.aClass93_2) {
			local15 = this.aClass93_2;
			this.aClass93_2 = local15.aClass93_227;
			this.aClass93_1 = local15;
			return local15;
		}
		do {
			if (this.anInt24 * -779480775 >= this.aClass16_1.anInt58 * 1214539343) {
				return null;
			}
			local15 = this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227;
		} while (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] == local15);
		this.aClass93_2 = local15.aClass93_227;
		this.aClass93_1 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method160() {
		@Pc(15) Class93 local15;
		if (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] != this.aClass93_2) {
			local15 = this.aClass93_2;
			this.aClass93_2 = local15.aClass93_227;
			this.aClass93_1 = local15;
			return local15;
		}
		do {
			if (this.anInt24 * -779480775 >= this.aClass16_1.anInt58 * 1214539343) {
				return null;
			}
			local15 = this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227;
		} while (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] == local15);
		this.aClass93_2 = local15.aClass93_227;
		this.aClass93_1 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aah", name = "k", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method161() {
		@Pc(15) Class93 local15;
		if (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] != this.aClass93_2) {
			local15 = this.aClass93_2;
			this.aClass93_2 = local15.aClass93_227;
			this.aClass93_1 = local15;
			return local15;
		}
		do {
			if (this.anInt24 * -779480775 >= this.aClass16_1.anInt58 * 1214539343) {
				return null;
			}
			local15 = this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227;
		} while (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] == local15);
		this.aClass93_2 = local15.aClass93_227;
		this.aClass93_1 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aah", name = "hasNext", descriptor = "()Z", line = 47)
	@Override
	public boolean hasNext() {
		if (this.aClass93_2 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
			return true;
		}
		while (this.anInt24 * -779480775 < this.aClass16_1.anInt58 * 1214539343) {
			if (this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
				this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1].aClass93_227;
				return true;
			}
			this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aah", name = "e", descriptor = "()Z", line = 47)
	public boolean method162() {
		if (this.aClass93_2 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
			return true;
		}
		while (this.anInt24 * -779480775 < this.aClass16_1.anInt58 * 1214539343) {
			if (this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
				this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1].aClass93_227;
				return true;
			}
			this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aah", name = "n", descriptor = "()Z", line = 47)
	public boolean method163() {
		if (this.aClass93_2 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
			return true;
		}
		while (this.anInt24 * -779480775 < this.aClass16_1.anInt58 * 1214539343) {
			if (this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
				this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1].aClass93_227;
				return true;
			}
			this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aah", name = "w", descriptor = "()V", line = 61)
	public void method164() {
		if (this.aClass93_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_1.method23969(661899152);
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "remove", descriptor = "()V", line = 61)
	@Override
	public void remove() {
		if (this.aClass93_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_1.method23969(-70093651);
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "f", descriptor = "()V", line = 61)
	public void method165() {
		if (this.aClass93_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_1.method23969(-1623306999);
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "l", descriptor = "([I[F[FB)V", line = 139)
	public static void method166(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) byte arg3) {
		Class685.method33435(arg0, arg1, arg2, 0, arg0.length - 1, -1751929437);
	}
}
