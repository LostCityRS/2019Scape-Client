package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.nio.ByteBuffer;
import java.util.Arrays;

@ObfuscatedName("zs")
public abstract class ByteArrayCopier {

	public ByteArrayCopier() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ek.e([BZI)Ljava/lang/Object;")
	public static Object wrap(byte[] arg0, boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			ByteBuffer var2 = ByteBuffer.allocateDirect(arg0.length);
			var2.position(0);
			var2.put(arg0);
			return var2;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("ia.n(Ljava/lang/Object;ZI)[B")
	public static byte[] method4540(Object arg0, boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			byte[] var2 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(var2, var2.length) : var2;
		} else if (arg0 instanceof ByteBuffer) {
			ByteBuffer var3 = (ByteBuffer) arg0;
			byte[] var4 = new byte[var3.capacity()];
			var3.position(0);
			var3.get(var4);
			return var4;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("nl.m(Ljava/lang/Object;III)[B")
	public static byte[] method6024(Object arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			byte[] var3 = (byte[]) arg0;
			return Arrays.copyOfRange(var3, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			ByteBuffer var4 = (ByteBuffer) arg0;
			byte[] var5 = new byte[arg2];
			var4.position(arg1);
			var4.get(var5, 0, arg2);
			return var5;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
