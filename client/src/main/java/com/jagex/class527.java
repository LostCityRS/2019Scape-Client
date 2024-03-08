package com.jagex;

import deob.ObfuscatedName;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("sg")
public class class527 {

	@ObfuscatedName("sg.n")
	public static class519 field6728;

	static {
		new class523();
		field6728 = new class519();
	}

	public class527() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("tz.e(Lalw;II)[B")
	public static byte[] method8503(Packet arg0, int arg1) throws IOException {
		ByteArrayInputStream var2 = new ByteArrayInputStream(arg0.data);
		var2.skip((long) (arg0.pos));
		return method4477(var2, arg1);
	}

	@ObfuscatedName("ix.n(Ljava/io/InputStream;II)[B")
	public static byte[] method4477(InputStream arg0, int arg1) throws IOException {
		byte[] var2 = new byte[5];
		if (arg0.read(var2, 0, 5) != 5) {
			throw new IOException("2");
		}
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(arg1);
		class519 var4 = field6728;
		synchronized (field6728) {
			if (!field6728.method8305(var2)) {
				throw new IOException("3");
			}
			field6728.method8302(arg0, var3, (long) arg1);
		}
		var3.flush();
		return var3.toByteArray();
	}
}
