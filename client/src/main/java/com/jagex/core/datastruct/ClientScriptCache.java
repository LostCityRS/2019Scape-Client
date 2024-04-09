package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ex")
public final class ClientScriptCache {

	@ObfuscatedName("ex.e")
	public SecondaryNode field1760 = new SecondaryNode();

	@ObfuscatedName("ex.n")
	public int field1761;

	@ObfuscatedName("ex.m")
	public int field1762;

	@ObfuscatedName("ex.k")
	public HashTable field1764;

	@ObfuscatedName("ex.f")
	public SecondaryLinkedList field1763 = new SecondaryLinkedList();

	public ClientScriptCache(int arg0) {
		this.field1761 = arg0;
		this.field1762 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field1764 = new HashTable(var2);
	}

	@ObfuscatedName("ex.e(J)Laky;")
	public SecondaryNode method2966(long arg0) {
		SecondaryNode var3 = (SecondaryNode) this.field1764.getNode(arg0);
		if (var3 != null) {
			this.field1763.pushBack(var3);
		}
		return var3;
	}

	@ObfuscatedName("ex.n(Laky;J)V")
	public void method2968(SecondaryNode arg0, long arg1) {
		if (this.field1762 == 0) {
			SecondaryNode var4 = this.field1763.pollFront();
			var4.remove();
			var4.secondaryRemove();
			if (this.field1760 == var4) {
				SecondaryNode var5 = this.field1763.pollFront();
				var5.remove();
				var5.secondaryRemove();
			}
		} else {
			this.field1762--;
		}
		this.field1764.pushNode(arg0, arg1);
		this.field1763.pushBack(arg0);
	}

	@ObfuscatedName("ex.m(I)V")
	public void method2969() {
		this.field1763.removeAll();
		this.field1764.removeAll();
		this.field1760 = new SecondaryNode();
		this.field1762 = this.field1761;
	}
}
