package com.jagex;

import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("afm")
public class BasicTextureList extends SomethingTypeList {

	@ObfuscatedName("afm.m")
	public Js5 field9773;

	public BasicTextureList(Js5 arg0) {
		this.field9773 = arg0;
	}

	@ObfuscatedName("afm.m(Lvk;IILvc;FIIZI)Z")
	public boolean method1977(TextureRelated2 arg0, int arg1, int arg2, TextureRelated1 arg3, float arg4, int arg5, int arg6, boolean arg7) {
		boolean var9 = true;
		if (TextureRelated2.field7586 == arg0) {
			if (arg2 > -1 && this.field9773.method6929(arg2)) {
				var9 = this.field9773.method6889(arg2);
			}
			return var9 & this.field9773.method6889(arg1);
		} else if (TextureRelated2.field7585 == arg0) {
			return this.field9773.method6889(arg1);
		} else if (TextureRelated2.field7587 == arg0) {
			return this.field9773.method6889(arg2);
		} else {
			return false;
		}
	}

	@ObfuscatedName("afm.n(Lvk;IB)[B")
	public byte[] method2002(TextureRelated2 arg0, int arg1) {
		return this.field9773.method6929(arg1) ? this.field9773.method6894(arg1) : null;
	}
}
