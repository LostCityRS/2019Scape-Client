package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.world.entity.SpotAnimEntityNode;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.SpotAnimation;

@ObfuscatedName("aqn")
public class MapAnimCutsceneAction extends CutsceneAction_Sub1 {

	@ObfuscatedName("aqn.f")
	public final int field12043;

	@ObfuscatedName("aqn.w")
	public final int field12042;

	@ObfuscatedName("aqn.l")
	public final int field12044;

	public MapAnimCutsceneAction(Packet arg0) {
		super(arg0);
		int var2 = arg0.g4s();
		this.field12043 = var2 >>> 16;
		this.field12042 = var2 & 0xFFFF;
		this.field12044 = arg0.g1();
	}

	@ObfuscatedName("aqn.n(I)V")
	public void method2890() {
		int var1 = this.field12043 * 512 + 256;
		int var2 = this.field12042 * 512 + 256;
		int var3 = this.field12044;
		if (var3 < 3 && Client.world.getSceneLevelTileFlags().isLinkBelow(this.field12043, this.field12042)) {
			var3++;
		}
		SpotAnimation var4 = new SpotAnimation(Client.world.getScene(), this.field10303, 0, this.field12044, var3, var1, Client.getHeightmapY(var1, var2, this.field12044) - this.field10305, var2, this.field12043, this.field12043, this.field12042, this.field12042, this.field10304, false, 0);
		Client.spotanims.put(new SpotAnimEntityNode(var4), (long) (this.field12043 << 16 | this.field12042));
	}
}
