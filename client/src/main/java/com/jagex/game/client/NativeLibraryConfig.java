package com.jagex.game.client;

import deob.ObfuscatedName;

import java.io.File;

@ObfuscatedName("rd")
public class NativeLibraryConfig {

	@ObfuscatedName("rd.e")
	public static final String field5075;

	@ObfuscatedName("rd.n")
	public static final String osName;

	@ObfuscatedName("rd.m")
	public static final String field5076;

	@ObfuscatedName("rd.k")
	public static final String field5073;

	static {
		String var0 = "Unknown";
		try {
			var0 = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception var17) {
		}
		var0.toLowerCase();
		String var2 = "Unknown";
		try {
			var2 = System.getProperty("java.version").toLowerCase();
		} catch (Exception var16) {
		}
		var2.toLowerCase();
		String var4 = "Unknown";
		try {
			var4 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var15) {
		}
		osName = var4.toLowerCase();
		String var6 = "Unknown";
		try {
			var6 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var14) {
		}
		field5076 = var6.toLowerCase();
		String var8 = "Unknown";
		try {
			var8 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var13) {
		}
		field5073 = var8.toLowerCase();
		field5075 = String.format("%s (%s) [%s]", osName, field5076, field5073);
		String var10 = "~/";
		try {
			var10 = System.getProperty("user.home").toLowerCase();
		} catch (Exception var12) {
		}
		new File(var10);
	}

	public NativeLibraryConfig() throws Throwable {
		throw new Error();
	}
}
