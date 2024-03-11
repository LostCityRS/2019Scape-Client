package com.jagex.core.util;

import com.jagex.core.io.Packet;
import com.jagex.game.compression.huffman.Huffman;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("iv")
public class StringEncoder {

	public StringEncoder() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ij.e(Lig;B)V")
	public static void setHuffman(Huffman huffman) {
		Statics.huffman = huffman;
	}

	@ObfuscatedName("gc.n(Lalw;Ljava/lang/String;I)I")
	public static int encode(Packet packet, String arg1) {
		int var2 = packet.pos;
		byte[] var3 = Cp1252.method3064(arg1);
		packet.pSmart1or2s(var3.length);
		packet.pos += Statics.huffman.compress(var3, 0, var3.length, packet.data, packet.pos);
		return packet.pos - var2;
	}

	@ObfuscatedName("eu.k(Lalw;II)Ljava/lang/String;")
	public static String decode(Packet arg0, int arg1) {
		try {
			int var2 = arg0.gSmart1or2();
			if (var2 > arg1) {
				var2 = arg1;
			}
			byte[] var3 = new byte[var2];
			arg0.pos += Statics.huffman.decompress(arg0.data, arg0.pos, var3, 0, var2);
			return Cp1252.method9199(var3, 0, var2);
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
