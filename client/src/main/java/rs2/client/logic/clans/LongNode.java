package rs2.client.logic.clans;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

@ObfuscatedName("aka")
public class LongNode extends Node {

	@ObfuscatedName("aka.k")
	public long value;

	public LongNode(long value) {
		this.value = value;
	}
}
