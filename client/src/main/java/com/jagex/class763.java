package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.lang.reflect.Array;
import java.util.Iterator;

@ObfuscatedName("acd")
public class class763 implements class51 {

	@ObfuscatedName("acd.e")
	public final class761 field8846;

	@ObfuscatedName("acd.n")
	public final class655 field8845;

	@ObfuscatedName("acd.m")
	public final class442 field8847;

	@ObfuscatedName("acd.k")
	public int field8848;

	@ObfuscatedName("acd.f")
	public class53 field8844;

	@ObfuscatedName("acd.w")
	public class53[] field8849;

	public class763(class696 arg0, class687 arg1, class655 arg2, class442 arg3, class761 arg4, boolean arg5) {
		this.field8846 = arg4;
		this.field8845 = arg2;
		this.field8847 = arg3;
		this.field8848 = class760.method8370(this.field8847, this.field8845);
		this.field8849 = (class53[]) Array.newInstance(this.field8846.method4415(), this.field8848);
		if (arg5) {
			for (int var7 = 0; var7 < this.field8848; var7++) {
				this.method14936(var7);
			}
		}
	}

	@ObfuscatedName("acd.e(II)Lay;")
	public class53 method962(int arg0) {
		if (arg0 < 0) {
			if (this.field8844 == null) {
				this.field8844 = this.field8846.method4414(-1, this);
			}
			return this.field8844;
		} else {
			if (this.field8849[arg0] == null) {
				this.method14936(arg0);
			}
			return this.field8849[arg0];
		}
	}

	@ObfuscatedName("acd.u(II)V")
	public void method14936(int arg0) {
		if (this.field8849[arg0] != null) {
			return;
		}
		try {
			this.field8849[arg0] = this.field8846.method4414(arg0, this);
		} catch (Exception var5) {
			var5.printStackTrace();
			return;
		}
		Object var3 = null;
		byte[] var4 = class760.method9853(this.field8847, this.field8845, arg0);
		if (var4 != null) {
			this.field8849[arg0].method976(new class997(var4));
		}
		this.field8849[arg0].method975();
	}

	@ObfuscatedName("acd.n(I)I")
	public int method963() {
		return this.field8849.length;
	}

	public Iterator iterator() {
		return new class764(this);
	}
}
