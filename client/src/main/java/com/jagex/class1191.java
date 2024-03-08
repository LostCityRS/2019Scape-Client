package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asz")
public class class1191 extends SubInterface {

	@ObfuscatedName("asz.w")
	public final int field12428;

	public class1191(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.field12428 = arg2;
	}

	@ObfuscatedName("asz.e(B)Z")
	public boolean method18183() {
		ObjectWrapper var1 = (ObjectWrapper) client.field10838.method14495((long) this.field12428);
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.method3661(ClientTriggerType.field7262, this.field11571, -1, (PathingEntity) var1.field11436, this.field12428);
			return true;
		}
	}
}
