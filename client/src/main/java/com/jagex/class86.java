package com.jagex;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("cl")
public class class86 {

	@ObfuscatedName("cl.e")
	public final class849 field1127;

	@ObfuscatedName("cl.n")
	public Buffer field1128;

	public class86(class849 arg0, byte[] arg1, int arg2) {
		this.field1127 = arg0;
		this.field1128 = this.field1127.field9876.method92(arg2, false);
		if (arg1 != null) {
			this.field1128.method8(arg1, 0, 0, arg2);
		}
	}

	public class86(class849 arg0, Buffer arg1) {
		this.field1127 = arg0;
		this.field1128 = arg1;
	}

	@ObfuscatedName("cl.d([BI)V")
	public void method1313(byte[] arg0, int arg1) {
		if (this.field1128 == null || this.field1128.method48() < arg1) {
			this.field1128 = this.field1127.field9876.method92(arg1, false);
		}
		this.field1128.method8(arg0, 0, 0, arg1);
	}
}
