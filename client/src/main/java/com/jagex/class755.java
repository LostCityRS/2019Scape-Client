package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("abx")
public abstract class class755 {

	@ObfuscatedName("abx.e")
	public String field8785;

	@ObfuscatedName("abx.n")
	public int field8784;

	@ObfuscatedName("mz.e(Ljava/lang/String;II)Labx;")
	public static class755 method5846(String arg0, int arg1) {
		class1078 var2 = new class1078();
		var2.field8785 = arg0;
		var2.field8784 = arg1;
		return var2;
	}

	@ObfuscatedName("abx.m(I)Ljava/net/Socket;")
	public Socket method14873() throws IOException {
		return new Socket(this.field8785, this.field8784);
	}

	@ObfuscatedName("abx.n(I)Ljava/net/Socket;")
	public abstract Socket method14876() throws IOException;
}
