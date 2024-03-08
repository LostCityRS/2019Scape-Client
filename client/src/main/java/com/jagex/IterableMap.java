package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aan")
public final class IterableMap implements Iterable {

	@ObfuscatedName("aan.e")
	public int field8556;

	@ObfuscatedName("aan.n")
	public class532[] field8552;

	@ObfuscatedName("aan.m")
	public long field8551;

	@ObfuscatedName("aan.k")
	public class532 field8554;

	@ObfuscatedName("aan.f")
	public class532 field8553;

	@ObfuscatedName("aan.w")
	public int field8555 = 0;

	public IterableMap(int arg0) {
		this.field8556 = arg0;
		this.field8552 = new class532[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class532 var3 = this.field8552[var2] = new class532();
			var3.field6761 = var3;
			var3.field6762 = var3;
		}
	}

	@ObfuscatedName("aan.e(J)Ltj;")
	public class532 method14495(long arg0) {
		this.field8551 = arg0;
		class532 var3 = this.field8552[(int) (arg0 & (long) (this.field8556 - 1))];
		for (this.field8554 = var3.field6761; this.field8554 != var3; this.field8554 = this.field8554.field6761) {
			if (this.field8554.field6760 == arg0) {
				class532 var4 = this.field8554;
				this.field8554 = this.field8554.field6761;
				return var4;
			}
		}
		this.field8554 = null;
		return null;
	}

	@ObfuscatedName("aan.n(I)Ltj;")
	public class532 method14496() {
		if (this.field8554 == null) {
			return null;
		}
		class532 var1 = this.field8552[(int) (this.field8551 & (long) (this.field8556 - 1))];
		while (this.field8554 != var1) {
			if (this.field8554.field6760 == this.field8551) {
				class532 var2 = this.field8554;
				this.field8554 = this.field8554.field6761;
				return var2;
			}
			this.field8554 = this.field8554.field6761;
		}
		this.field8554 = null;
		return null;
	}

	@ObfuscatedName("aan.m([Ltj;B)I")
	public int method14497(class532[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.field8556; var3++) {
			class532 var4 = this.field8552[var3];
			for (class532 var5 = var4.field6761; var5 != var4; var5 = var5.field6761) {
				arg0[var2++] = var5;
			}
		}
		return var2;
	}

	@ObfuscatedName("aan.k(I)I")
	public int method14498() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field8556; var2++) {
			class532 var3 = this.field8552[var2];
			for (class532 var4 = var3.field6761; var4 != var3; var4 = var4.field6761) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("aan.f(Ltj;J)V")
	public void method14501(class532 arg0, long arg1) {
		if (arg0.field6762 != null) {
			arg0.method8440();
		}
		class532 var4 = this.field8552[(int) (arg1 & (long) (this.field8556 - 1))];
		arg0.field6762 = var4.field6762;
		arg0.field6761 = var4;
		arg0.field6762.field6761 = arg0;
		arg0.field6761.field6762 = arg0;
		arg0.field6760 = arg1;
	}

	@ObfuscatedName("aan.w(B)V")
	public void method14499() {
		for (int var1 = 0; var1 < this.field8556; var1++) {
			class532 var2 = this.field8552[var1];
			while (true) {
				class532 var3 = var2.field6761;
				if (var2 == var3) {
					break;
				}
				var3.method8440();
			}
		}
		this.field8554 = null;
		this.field8553 = null;
	}

	@ObfuscatedName("aan.l(B)Ltj;")
	public class532 method14500() {
		this.field8555 = 0;
		return this.method14502();
	}

	@ObfuscatedName("aan.u(I)Ltj;")
	public class532 method14502() {
		if (this.field8555 > 0 && this.field8552[this.field8555 - 1] != this.field8553) {
			class532 var1 = this.field8553;
			this.field8553 = var1.field6761;
			return var1;
		}
		class532 var2;
		do {
			if (this.field8555 >= this.field8556) {
				return null;
			}
			var2 = this.field8552[++this.field8555 - 1].field6761;
		} while (this.field8552[this.field8555 - 1] == var2);
		this.field8553 = var2.field6761;
		return var2;
	}

	public Iterator iterator() {
		return new class730(this);
	}
}
