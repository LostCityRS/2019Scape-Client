package rs2.client.logic.clans;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("akp")
public abstract class ClanSettingsDeltaEntry extends Node {

	@ObfuscatedName("akp.e(Lalw;B)V")
	public abstract void decode(Packet arg0);

	@ObfuscatedName("akp.n(Lkr;I)V")
	public abstract void apply(ClanSettings arg0);
}
