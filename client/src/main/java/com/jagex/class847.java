package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afm")
public class class847 extends class123 {

	@ObfuscatedName("afm.m")
	public class442 field9773;

	public class847(class442 arg0) {
		this.field9773 = arg0;
	}

	@ObfuscatedName("afm.m(Lvk;IILvc;FIIZI)Z")
	public boolean method1977(class605 arg0, int arg1, int arg2, class602 arg3, float arg4, int arg5, int arg6, boolean arg7) {
		boolean var9 = true;
		if (class605.field7586 == arg0) {
			if (arg2 > -1 && this.field9773.method6929(arg2)) {
				var9 = this.field9773.method6889(arg2);
			}
			return var9 & this.field9773.method6889(arg1);
		} else if (class605.field7585 == arg0) {
			return this.field9773.method6889(arg1);
		} else if (class605.field7587 == arg0) {
			return this.field9773.method6889(arg2);
		} else {
			return false;
		}
	}

	@ObfuscatedName("afm.n(Lvk;IB)[B")
	public byte[] method2002(class605 arg0, int arg1) {
		return this.field9773.method6929(arg1) ? this.field9773.method6894(arg1) : null;
	}
}
