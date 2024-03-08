package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ea")
public final class class158 {

	@ObfuscatedName("ea.n")
	public final int field1741;

	@ObfuscatedName("ea.m")
	public final int field1743;

	@ObfuscatedName("ea.k")
	public boolean field1744 = false;

	@ObfuscatedName("ea.f")
	public class1131 field1745 = null;

	@ObfuscatedName("ea.w")
	public class1130 field1742 = null;

	@ObfuscatedName("ea.l")
	public int[] field1747;

	public class158(class997 arg0, int arg1) {
		this.field1741 = arg1;
		int var3 = arg0.method17904();
		switch(var3) {
			case 0:
				this.field1743 = arg0.method17927();
				break;
			case 1:
				this.field1743 = -1;
				break;
			default:
				this.field1743 = -1;
		}
		arg0.method17918();
	}

	@ObfuscatedName("ea.e(IIIII)V")
	public void method2867(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field1744) {
			this.field1744 = true;
			if (this.field1743 >= 0) {
				this.field1745 = new class1131(client.field10855.method7743(), 25);
				this.field1745.field10406 = this.field1741;
				this.field1745.field10440 = client.field10903;
				this.field1745.method19156((class260) Statics.field7961.method962(this.field1743));
				this.field1745.method16502(this.field1745.field12083.field2699);
				this.field1745.field10444 = this.field1745.field12083.field2731 << 3;
				this.field1745.field10404 = ++class153.field1715 - 1;
			} else {
				this.field1742 = new class1130(client.field10855.method7743(), 25);
				this.field1742.method19129(Statics.field8729);
				this.field1742.field10406 = this.field1741;
				this.field1742.field10440 = client.field10903;
				this.field1742.field10404 = ++class153.field1715 - 1;
			}
		}
		if (this.field1743 >= 0) {
			this.field1745.method19159(arg2, arg0, arg1, true, this.field1745.method16546());
			this.field1745.method16491(arg3, true);
		} else {
			this.field1742.field11717 = this.field1742.field11714 = (byte) arg2;
			this.field1742.method19118(arg0, arg1);
			this.field1742.method16491(arg3, true);
		}
	}

	@ObfuscatedName("ea.n(B)V")
	public void method2868() {
		this.field1745 = null;
		this.field1742 = null;
		this.field1744 = false;
	}

	@ObfuscatedName("ea.m(IIII)V")
	public void method2866(int arg0, int arg1, int arg2) {
		if (this.field1745 == null) {
			this.field1742.field11717 = this.field1742.field11714 = (byte) arg0;
			this.field1742.method19118(arg1, arg2);
		} else {
			this.field1745.method19159(arg0, arg1, arg2, true, this.field1745.method16546());
		}
	}

	@ObfuscatedName("ea.k(I)Lahm;")
	public class892 method2870() {
		return this.field1745 == null ? this.field1742 : this.field1745;
	}

	@ObfuscatedName("ea.f(I)Z")
	public boolean method2871() {
		if (this.field1743 < 0) {
			return true;
		}
		class260 var1 = (class260) Statics.field7961.method962(this.field1743);
		boolean var2 = var1.method4545();
		if (this.field1747 == null) {
			class584 var3 = (class584) Statics.field11742.method962(var1.field2762);
			this.field1747 = var3.method9293();
		}
		int[] var4 = this.field1747;
		for (int var5 = 0; var5 < var4.length; var5++) {
			int var6 = var4[var5];
			var2 &= ((class164) Statics.field8797.method962(var6)).method2991();
		}
		return var2;
	}
}
