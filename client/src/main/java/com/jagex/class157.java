package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("et")
public final class class157 implements VarIntDomain {

	@ObfuscatedName("et.u(Lec;I)I")
	public int method679(VarType arg0) {
		class988 var2 = (class988) class153.field1718.method14495((long) arg0.id);
		return var2 == null ? Statics.field7410.method679(arg0) : var2.field11442;
	}

	@ObfuscatedName("et.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		class988 var2 = (class988) class153.field1718.method14495((long) arg0.id | 0x100000000L);
		return var2 == null ? Statics.field7410.method678(arg0) : var2.field11442;
	}
}
