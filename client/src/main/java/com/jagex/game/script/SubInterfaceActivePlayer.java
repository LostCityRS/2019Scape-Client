package com.jagex.game.script;

import com.jagex.game.world.entity.PlayerEntity;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.clientscript.ScriptRunner;

@ObfuscatedName("asu")
public class SubInterfaceActivePlayer extends SubInterface {

	@ObfuscatedName("asu.w")
	public final int field12430;

	public SubInterfaceActivePlayer(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.field12430 = arg2;
	}

	@ObfuscatedName("asu.e(B)Z")
	public boolean method18183() {
		PlayerEntity var1 = Client.players[this.field12430];
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.executeTriggeredScriptPathingEntity(ClientTriggerType.IF_PROCESS_ACTIVE_PLAYER, this.field11571, -1, var1, this.field12430);
			return true;
		}
	}
}
