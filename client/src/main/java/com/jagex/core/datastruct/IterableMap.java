package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aan")
public final class IterableMap implements Iterable {

	@ObfuscatedName("aan.e")
	public int field8556;

	@ObfuscatedName("aan.n")
	public Node[] field8552;

	@ObfuscatedName("aan.m")
	public long field8551;

	@ObfuscatedName("aan.k")
	public Node field8554;

	@ObfuscatedName("aan.f")
	public Node field8553;

	@ObfuscatedName("aan.w")
	public int field8555 = 0;

	public IterableMap(int arg0) {
		this.field8556 = arg0;
		this.field8552 = new Node[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Node var3 = this.field8552[var2] = new Node();
			var3.field6761 = var3;
			var3.field6762 = var3;
		}
	}

	@ObfuscatedName("aan.e(J)Ltj;")
	public Node method14495(long arg0) {
		this.field8551 = arg0;
		Node var3 = this.field8552[(int) (arg0 & (long) (this.field8556 - 1))];
		for (this.field8554 = var3.field6761; this.field8554 != var3; this.field8554 = this.field8554.field6761) {
			if (this.field8554.field6760 == arg0) {
				Node var4 = this.field8554;
				this.field8554 = this.field8554.field6761;
				return var4;
			}
		}
		this.field8554 = null;
		return null;
	}

	@ObfuscatedName("aan.n(I)Ltj;")
	public Node method14496() {
		if (this.field8554 == null) {
			return null;
		}
		Node var1 = this.field8552[(int) (this.field8551 & (long) (this.field8556 - 1))];
		while (this.field8554 != var1) {
			if (this.field8554.field6760 == this.field8551) {
				Node var2 = this.field8554;
				this.field8554 = this.field8554.field6761;
				return var2;
			}
			this.field8554 = this.field8554.field6761;
		}
		this.field8554 = null;
		return null;
	}

	@ObfuscatedName("aan.m([Ltj;B)I")
	public int method14497(Node[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.field8556; var3++) {
			Node var4 = this.field8552[var3];
			for (Node var5 = var4.field6761; var5 != var4; var5 = var5.field6761) {
				arg0[var2++] = var5;
			}
		}
		return var2;
	}

	@ObfuscatedName("aan.k(I)I")
	public int method14498() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field8556; var2++) {
			Node var3 = this.field8552[var2];
			for (Node var4 = var3.field6761; var4 != var3; var4 = var4.field6761) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("aan.f(Ltj;J)V")
	public void method14501(Node arg0, long arg1) {
		if (arg0.field6762 != null) {
			arg0.method8440();
		}
		Node var4 = this.field8552[(int) (arg1 & (long) (this.field8556 - 1))];
		arg0.field6762 = var4.field6762;
		arg0.field6761 = var4;
		arg0.field6762.field6761 = arg0;
		arg0.field6761.field6762 = arg0;
		arg0.field6760 = arg1;
	}

	@ObfuscatedName("aan.w(B)V")
	public void method14499() {
		for (int var1 = 0; var1 < this.field8556; var1++) {
			Node var2 = this.field8552[var1];
			while (true) {
				Node var3 = var2.field6761;
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
	public Node method14500() {
		this.field8555 = 0;
		return this.method14502();
	}

	@ObfuscatedName("aan.u(I)Ltj;")
	public Node method14502() {
		if (this.field8555 > 0 && this.field8552[this.field8555 - 1] != this.field8553) {
			Node var1 = this.field8553;
			this.field8553 = var1.field6761;
			return var1;
		}
		Node var2;
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
		return new IterableMapIterator(this);
	}
}
