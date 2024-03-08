package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alf")
public class class1014 extends class599 implements class761 {

	@ObfuscatedName("alf.z")
	public final class442 field11701;

	public class1014(boolean arg0, class442 arg1, class687 arg2, class696 arg3) {
		super(arg0, arg2, arg3);
		this.field11701 = arg1;
	}

	@ObfuscatedName("alf.v(ILao;I)Lay;")
	public class53 method4414(int arg0, class51 arg1) {
		return new class598(arg0, this, arg1);
	}

	@ObfuscatedName("alf.o(B)Ljava/lang/Class;")
	public Class method4415() {
		return class598.class;
	}

	@ObfuscatedName("alf.w(II)[B")
	public byte[] method9530(int arg0) {
		class442 var2 = this.field11701;
		synchronized (this.field11701) {
			return this.field11701.method6879(arg0, 0);
		}
	}

	@ObfuscatedName("alf.l(IS)Z")
	public boolean method9525(int arg0) {
		class442 var2 = this.field11701;
		synchronized (this.field11701) {
			return this.field11701.method6888(arg0, 0);
		}
	}
}
