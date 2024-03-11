package com.jagex.game.client.script;

import com.jagex.game.world.entity.ObjReference;
import com.jagex.game.world.entity.ObjStackEntity;
import deob.ObfuscatedName;

@ObfuscatedName("asn")
public class SubInterfaceActiveObj extends SubInterface {

	@ObfuscatedName("asn.w")
	public final ObjReference field12431;

	public SubInterfaceActiveObj(int arg0, int arg1, ObjReference arg2) {
		super(arg0, arg1);
		this.field12431 = arg2;
	}

	@ObfuscatedName("asn.e(B)Z")
	public boolean method18183() {
		ObjStackEntity var1 = this.field12431.method13793();
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.method9018(ClientTriggerType.field7248, this.field11571, -1, this.field12431, var1);
			return true;
		}
	}
}
