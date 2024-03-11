package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ru")
public class LZMAOutWindow {

	@ObfuscatedName("ru.e")
	public byte[] field5078;

	@ObfuscatedName("ru.n")
	public int field5079;

	@ObfuscatedName("ru.m")
	public int field5082 = 0;

	@ObfuscatedName("ru.k")
	public int field5081;

	@ObfuscatedName("ru.f")
	public OutputStream field5080;

	@ObfuscatedName("ru.e(II)V")
	public void method7915(int arg0) {
		if (this.field5078 == null || this.field5082 != arg0) {
			this.field5078 = new byte[arg0];
		}
		this.field5082 = arg0;
		this.field5079 = 0;
		this.field5081 = 0;
	}

	@ObfuscatedName("ru.n(Ljava/io/OutputStream;S)V")
	public void method7933(OutputStream arg0) throws IOException {
		this.method7916();
		this.field5080 = arg0;
	}

	@ObfuscatedName("ru.m(B)V")
	public void method7916() throws IOException {
		this.method7931();
		this.field5080 = null;
	}

	@ObfuscatedName("ru.k(ZI)V")
	public void method7917(boolean arg0) {
		if (!arg0) {
			this.field5081 = 0;
			this.field5079 = 0;
		}
	}

	@ObfuscatedName("ru.f(B)V")
	public void method7931() throws IOException {
		int var1 = this.field5079 - this.field5081;
		if (var1 == 0) {
			return;
		}
		this.field5080.write(this.field5078, this.field5081, var1);
		if (this.field5079 >= this.field5082) {
			this.field5079 = 0;
		}
		this.field5081 = this.field5079;
	}

	@ObfuscatedName("ru.w(IIB)V")
	public void method7919(int arg0, int arg1) throws IOException {
		int var3 = this.field5079 - arg0 - 1;
		if (var3 < 0) {
			var3 += this.field5082;
		}
		while (arg1 != 0) {
			if (var3 >= this.field5082) {
				var3 = 0;
			}
			this.field5078[++this.field5079 - 1] = this.field5078[var3++];
			if (this.field5079 >= this.field5082) {
				this.method7931();
			}
			arg1--;
		}
	}

	@ObfuscatedName("ru.l(BB)V")
	public void method7920(byte arg0) throws IOException {
		this.field5078[++this.field5079 - 1] = arg0;
		if (this.field5079 >= this.field5082) {
			this.method7931();
		}
	}

	@ObfuscatedName("ru.u(II)B")
	public byte method7914(int arg0) {
		int var2 = this.field5079 - arg0 - 1;
		if (var2 < 0) {
			var2 += this.field5082;
		}
		return this.field5078[var2];
	}
}
