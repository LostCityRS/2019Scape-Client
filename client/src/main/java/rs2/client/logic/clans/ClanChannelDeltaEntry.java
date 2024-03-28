package rs2.client.logic.clans;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("aku")
public abstract class ClanChannelDeltaEntry extends Node {

	@ObfuscatedName("aku.n(Lakr;S)V")
	public abstract void apply(ClanChannel channel);

	@ObfuscatedName("aku.e(Lalw;I)V")
	public abstract void decode(Packet buf);
}
