package com.jagex;

import deob.ObfuscatedName;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("aat")
public class IterableQueue implements Iterable, Collection {

	@ObfuscatedName("aat.e")
	public Node field8482 = new Node();

	@ObfuscatedName("aat.n")
	public Node field8481;

	public IterableQueue() {
		this.field8482.field6761 = this.field8482;
		this.field8482.field6762 = this.field8482;
	}

	@ObfuscatedName("aat.e(I)V")
	public void method14152() {
		while (this.field8482.field6761 != this.field8482) {
			this.field8482.field6761.method8440();
		}
	}

	@ObfuscatedName("aat.n(Ltj;I)V")
	public void method14153(Node arg0) {
		if (arg0.field6762 != null) {
			arg0.method8440();
		}
		arg0.field6762 = this.field8482.field6762;
		arg0.field6761 = this.field8482;
		arg0.field6762.field6761 = arg0;
		arg0.field6761.field6762 = arg0;
	}

	@ObfuscatedName("aq.m(Ltj;Ltj;B)V")
	public static void method926(Node arg0, Node arg1) {
		if (arg0.field6762 != null) {
			arg0.method8440();
		}
		arg0.field6762 = arg1.field6762;
		arg0.field6761 = arg1;
		arg0.field6762.field6761 = arg0;
		arg0.field6761.field6762 = arg0;
	}

	@ObfuscatedName("aat.k(I)Ltj;")
	public Node method14154() {
		Node var1 = this.field8482.field6761;
		if (this.field8482 == var1) {
			return null;
		} else {
			var1.method8440();
			return var1;
		}
	}

	@ObfuscatedName("aat.f(Laat;Ltj;I)V")
	public void method14155(IterableQueue arg0, Node arg1) {
		Node var3 = this.field8482.field6762;
		this.field8482.field6762 = arg1.field6762;
		arg1.field6762.field6761 = this.field8482;
		if (this.field8482 != arg1) {
			arg1.field6762 = arg0.field8482.field6762;
			arg1.field6762.field6761 = arg1;
			var3.field6761 = arg0.field8482;
			arg0.field8482.field6762 = var3;
		}
	}

	@ObfuscatedName("aat.w(Laat;I)V")
	public void method14207(IterableQueue arg0) {
		if (this.field8482.field6761 != this.field8482) {
			this.method14155(arg0, this.field8482.field6761);
		}
	}

	@ObfuscatedName("aat.l(B)Ltj;")
	public Node method14191() {
		return this.method14158(null);
	}

	@ObfuscatedName("aat.u(Ltj;B)Ltj;")
	public Node method14158(Node arg0) {
		Node var2;
		if (arg0 == null) {
			var2 = this.field8482.field6761;
		} else {
			var2 = arg0;
		}
		if (this.field8482 == var2) {
			this.field8481 = null;
			return null;
		} else {
			this.field8481 = var2.field6761;
			return var2;
		}
	}

	@ObfuscatedName("aat.z(I)Ltj;")
	public Node method14159() {
		return this.method14189(null);
	}

	@ObfuscatedName("aat.r(Ltj;I)Ltj;")
	public Node method14189(Node arg0) {
		Node var2;
		if (arg0 == null) {
			var2 = this.field8482.field6762;
		} else {
			var2 = arg0;
		}
		if (this.field8482 == var2) {
			this.field8481 = null;
			return null;
		} else {
			this.field8481 = var2.field6762;
			return var2;
		}
	}

	@ObfuscatedName("aat.v(I)Ltj;")
	public Node method14161() {
		Node var1 = this.field8481;
		if (this.field8482 == var1) {
			this.field8481 = null;
			return null;
		} else {
			this.field8481 = var1.field6761;
			return var1;
		}
	}

	@ObfuscatedName("aat.o(I)Ltj;")
	public Node method14170() {
		Node var1 = this.field8481;
		if (this.field8482 == var1) {
			this.field8481 = null;
			return null;
		} else {
			this.field8481 = var1.field6762;
			return var1;
		}
	}

	@ObfuscatedName("aat.s(I)I")
	public int method14157() {
		int var1 = 0;
		for (Node var2 = this.field8482.field6761; var2 != this.field8482; var2 = var2.field6761) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("aat.y(I)Z")
	public boolean method14164() {
		return this.field8482.field6761 == this.field8482;
	}

	@ObfuscatedName("aat.q(I)[Ltj;")
	public Node[] method14165() {
		Node[] var1 = new Node[this.method14157()];
		int var2 = 0;
		for (Node var3 = this.field8482.field6761; var3 != this.field8482; var3 = var3.field6761) {
			var1[var2++] = var3;
		}
		return var1;
	}

	public Iterator iterator() {
		return new class718(this);
	}

	public int size() {
		return this.method14157();
	}

	public boolean isEmpty() {
		return this.method14164();
	}

	public boolean contains(Object arg0) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method14165();
	}

	public Object[] toArray(Object[] arg0) {
		int var2 = 0;
		for (Node var3 = this.field8482.field6761; var3 != this.field8482; var3 = var3.field6761) {
			arg0[var2++] = var3;
		}
		return arg0;
	}

	@ObfuscatedName("aat.x(Ltj;I)Z")
	public boolean method14168(Node arg0) {
		this.method14153(arg0);
		return true;
	}

	public boolean remove(Object arg0) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection arg0) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method14152();
	}

	public boolean add(Object arg0) {
		return this.method14168((Node) arg0);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
