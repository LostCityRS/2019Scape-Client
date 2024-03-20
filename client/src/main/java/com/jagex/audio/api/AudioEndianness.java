package com.jagex.audio.api;

import deob.ObfuscatedName;

@ObfuscatedName("mw")
public class AudioEndianness {

	@ObfuscatedName("mw.e")
	public static final AudioEndianness LITTLE = new AudioEndianness();

	@ObfuscatedName("mw.n")
	public static final AudioEndianness BIG = new AudioEndianness();
}
