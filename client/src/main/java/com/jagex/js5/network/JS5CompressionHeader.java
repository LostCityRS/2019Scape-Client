package com.jagex.js5.network;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5CompressionType;
import deob.ObfuscatedName;

@ObfuscatedName("pc")
public class JS5CompressionHeader {

	@ObfuscatedName("pc.e")
	public final Js5CompressionType compressionType;

	@ObfuscatedName("pc.n")
	public final int packedLength;

	@ObfuscatedName("pc.m")
	public final int unpackedLength;

	public JS5CompressionHeader(Packet buf) {
		this.compressionType = (Js5CompressionType) SerializableEnums.decode(Js5CompressionType.values(), buf.g1());
		this.packedLength = buf.g4s();

		if (Js5CompressionType.UNCOMPRESSED == this.compressionType) {
			this.unpackedLength = this.packedLength;
		} else {
			this.unpackedLength = buf.g4s();
		}
	}

	@ObfuscatedName("pc.e(B)Lpj;")
	public Js5CompressionType getCompressionType() {
		return this.compressionType;
	}

	@ObfuscatedName("pc.n(I)I")
	public int getPackedLength() {
		return this.packedLength;
	}

	@ObfuscatedName("pc.m(B)I")
	public int getUnpackedLength() {
		return this.unpackedLength;
	}
}
