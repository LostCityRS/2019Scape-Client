package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("wu")
public final class class609 implements class152 {

	@ObfuscatedName("wu.f")
	public int[] field7604 = new int[Statics.field8485.method963()];

	@ObfuscatedName("wu.w")
	public int[] field7609 = new int[Statics.field8485.method963()];

	@ObfuscatedName("wu.l")
	public class729 field7610 = new class729(128);

	@ObfuscatedName("wu.i(ZI)I")
	public int method9623(boolean arg0) {
		long var2 = class213.method3655();
		for (class987 var4 = (class987) (arg0 ? this.field7610.method14500() : this.field7610.method14502()); var4 != null; var4 = (class987) this.field7610.method14502()) {
			if ((var4.field11441 & 0x3FFFFFFFFFFFFFFFL) < var2) {
				if ((var4.field11441 & 0x4000000000000000L) != 0L) {
					int var5 = (int) var4.field6760;
					this.field7609[var5] = this.field7604[var5];
					var4.method8440();
					return var5;
				}
				var4.method8440();
			}
		}
		return -1;
	}

	@ObfuscatedName("wu.j(B)V")
	public void method9624() {
		for (int var1 = 0; var1 < Statics.field8485.method963(); var1++) {
			class859 var2 = (class859) Statics.field8485.method962(var1);
			if (var2 != null) {
				this.field7604[var1] = 0;
				this.field7609[var1] = 0;
			}
		}
		this.field7610 = new class729(128);
	}

	@ObfuscatedName("wu.u(Lec;I)I")
	public int method679(class149 arg0) {
		return this.field7609[arg0.field1706];
	}

	@ObfuscatedName("wu.e(Lec;II)V")
	public void method2798(class149 arg0, int arg1) {
		this.field7609[arg0.field1706] = arg1;
		class987 var3 = (class987) this.field7610.method14495((long) arg0.field1706);
		if (var3 == null) {
			class987 var4 = new class987(class213.method3655() + 500L);
			this.field7610.method14501(var4, (long) arg0.field1706);
		} else {
			var3.field11441 = class213.method3655() + 500L;
		}
	}

	@ObfuscatedName("wu.t(Lec;IB)V")
	public void method9625(class149 arg0, int arg1) {
		this.field7604[arg0.field1706] = arg1;
		class987 var3 = (class987) this.field7610.method14495((long) arg0.field1706);
		if (var3 == null) {
			class987 var4 = new class987(4611686018427387905L);
			this.field7610.method14501(var4, (long) arg0.field1706);
		} else if (var3.field11441 != 4611686018427387905L) {
			var3.field11441 = class213.method3655() + 500L | 0x4000000000000000L;
		}
	}

	@ObfuscatedName("wu.z(Lkh;I)I")
	public int method678(class305 arg0) {
		return arg0.method5181(this.field7609[arg0.field3076.field1706]);
	}

	@ObfuscatedName("wu.w(Lkh;II)V")
	public void method2804(class305 arg0, int arg1) throws class1110 {
		int var3 = arg0.method5183(this.field7609[arg0.field3076.field1706], arg1);
		this.method2798(arg0.field3076, var3);
	}

	@ObfuscatedName("wu.ae(Lkh;II)V")
	public void method9629(class305 arg0, int arg1) {
		try {
			int var3 = arg0.method5183(this.field7604[arg0.field3076.field1706], arg1);
			this.method9625(arg0.field3076, var3);
		} catch (class1110 var5) {
		}
	}

	@ObfuscatedName("wu.n(Lec;I)J")
	public long method2799(class149 arg0) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.m(Lec;J)V")
	public void method2800(class149 arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(class149 arg0) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(class149 arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}
}
