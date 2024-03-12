package com.jagex.core.io;

import com.jagex.core.utils.PreciseSleep;
import deob.ObfuscatedName;

import java.io.InputStream;

@ObfuscatedName("apy")
public class BrokenInputStream extends InputStream {

	public int read() {
		PreciseSleep.sleep(30000L);
		return -1;
	}
}
