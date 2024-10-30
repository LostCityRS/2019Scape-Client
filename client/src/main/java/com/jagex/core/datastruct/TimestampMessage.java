package com.jagex.core.datastruct;

import com.jagex.core.utils.MonotonicTime;
import deob.ObfuscatedName;

@ObfuscatedName("ajd")
public class TimestampMessage extends Link {

	@ObfuscatedName("ajd.m")
	public int timestamp = (int) (MonotonicTime.get() / 1000L);

	@ObfuscatedName("ajd.k")
	public String message;

	@ObfuscatedName("ajd.f")
	public short worldId;

	public TimestampMessage(String arg0, int arg1) {
		this.message = arg0;
		this.worldId = (short) arg1;
	}
}
