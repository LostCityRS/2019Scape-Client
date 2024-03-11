package com.jagex.js5.network;

import com.jagex.js5.Js5CompressionType;
import com.jagex.Packet;
import com.jagex.SerializableEnums;
import deob.ObfuscatedName;

@ObfuscatedName("pc")
public class Js5GroupHeader {

	@ObfuscatedName("pc.e")
	public final Js5CompressionType field4478;

	@ObfuscatedName("pc.n")
	public final int field4477;

	@ObfuscatedName("pc.m")
	public final int field4476;

	public Js5GroupHeader(Packet arg0) {
		this.field4478 = (Js5CompressionType) SerializableEnums.decode(Js5CompressionType.method6978(), arg0.g1());
		this.field4477 = arg0.g4s();
		if (Js5CompressionType.field4434 == this.field4478) {
			this.field4476 = this.field4477;
		} else {
			this.field4476 = arg0.g4s();
		}
	}

	@ObfuscatedName("pc.e(B)Lpj;")
	public Js5CompressionType method7080() {
		return this.field4478;
	}

	@ObfuscatedName("pc.n(I)I")
	public int method7081() {
		return this.field4477;
	}

	@ObfuscatedName("pc.m(B)I")
	public int method7091() {
		return this.field4476;
	}
}
