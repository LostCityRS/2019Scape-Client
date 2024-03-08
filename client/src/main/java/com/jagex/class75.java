package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bu")
public class class75 {

	@ObfuscatedName("bu.n")
	public final class849 field1023;

	@ObfuscatedName("bu.m")
	public final int field1024;

	@ObfuscatedName("bu.k")
	public static final int[] field1022 = new int[1];

	@ObfuscatedName("bu.e(Lafa;ILjava/lang/String;)Lbu;")
	public static class75 method1271(class849 arg0, int arg1, String arg2) {
		int var3 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, var3);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, field1022, 0);
		if (field1022[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new class75(arg0, arg1, var3);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	public class75(class849 arg0, int arg1, int arg2) {
		this.field1023 = arg0;
		this.field1024 = arg2;
	}

	public void finalize() throws Throwable {
		this.field1023.method15797(this.field1024);
		super.finalize();
	}
}
