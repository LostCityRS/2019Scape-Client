package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("eb")
public final class SoftLruHashTable {

	@ObfuscatedName("eb.e")
	public int field1758;

	@ObfuscatedName("eb.n")
	public int field1756;

	@ObfuscatedName("eb.m")
	public HashTable hashTable;

	@ObfuscatedName("eb.k")
	public SecondaryLinkedList queue;

	@ObfuscatedName("eb.f")
	public SoftLruHashTableRemovalListener field1759;

	public SoftLruHashTable(int size) {
		this(size, size);
	}

	@ObfuscatedName("eb.e(Len;B)V")
	public void setRemovalListener(SoftLruHashTableRemovalListener arg0) {
		this.field1759 = arg0;
	}

	public SoftLruHashTable(int arg0, int arg1) {
		this.queue = new SecondaryLinkedList();
		this.field1758 = arg0;
		this.field1756 = arg0;
		int var3;
		for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
		}
		this.hashTable = new HashTable(var3);
	}

	@ObfuscatedName("eb.n(J)Ljava/lang/Object;")
	public Object get(long arg0) {
		ReferenceNode var3 = (ReferenceNode) this.hashTable.get(arg0);
		if (var3 == null) {
			return null;
		}
		Object var4 = var3.getValue();
		if (var4 == null) {
			var3.unlink();
			var3.secondaryRemove();
			this.field1756 += var3.weight;
			return null;
		}
		if (var3.isSoft()) {
			HardReferenceNode var5 = new HardReferenceNode(var4, var3.weight);
			this.hashTable.put(var5, var3.nodeId);
			this.queue.pushBack(var5);
			var5.secondaryNodeId = 0L;
			var3.unlink();
			var3.secondaryRemove();
		} else {
			this.queue.pushBack(var3);
			var3.secondaryNodeId = 0L;
		}
		return var4;
	}

	@ObfuscatedName("eb.m(J)V")
	public void method2957(long arg0) {
		ReferenceNode var3 = (ReferenceNode) this.hashTable.get(arg0);
		this.method2918(var3);
	}

	@ObfuscatedName("eb.k(Lasa;I)V")
	public void method2918(ReferenceNode arg0) {
		if (arg0 != null) {
			arg0.unlink();
			arg0.secondaryRemove();
			this.field1756 += arg0.weight;
		}
	}

	@ObfuscatedName("eb.f(Ljava/lang/Object;J)V")
	public void put(Object arg0, long arg1) {
		this.put(arg0, arg1, 1);
	}

	@ObfuscatedName("eb.w(Ljava/lang/Object;JII)V")
	public void put(Object arg0, long arg1, int arg2) {
		if (arg2 > this.field1758) {
			throw new IllegalStateException();
		}
		this.method2957(arg1);
		this.field1756 -= arg2;
		while (this.field1756 < 0) {
			ReferenceNode var5 = (ReferenceNode) this.queue.pollFront();
			if (var5 == null) {
				throw new RuntimeException("");
			}
			if (!var5.isSoft()) {
			}
			this.method2918(var5);
			if (this.field1759 != null) {
				this.field1759.method2914(var5.getValue());
			}
		}
		HardReferenceNode var6 = new HardReferenceNode(arg0, arg2);
		this.hashTable.put(var6, arg1);
		this.queue.pushBack(var6);
		var6.secondaryNodeId = 0L;
	}

	@ObfuscatedName("eb.l(IB)V")
	public void clean(int arg0) {
		for (ReferenceNode var2 = (ReferenceNode) this.queue.peekFront(); var2 != null; var2 = (ReferenceNode) this.queue.prev()) {
			if (var2.isSoft()) {
				if (var2.getValue() == null) {
					var2.unlink();
					var2.secondaryRemove();
					this.field1756 += var2.weight;
				}
			} else if (++var2.secondaryNodeId > (long) arg0) {
				SoftReferenceNode var3 = new SoftReferenceNode(var2.getValue(), var2.weight);
				this.hashTable.put(var3, var2.nodeId);
				SecondaryLinkedList.method10144(var3, var2);
				var2.unlink();
				var2.secondaryRemove();
			}
		}
	}

	@ObfuscatedName("eb.u(B)V")
	public void reset() {
		this.queue.removeAll();
		this.hashTable.removeAll();
		this.field1756 = this.field1758;
	}

	@ObfuscatedName("eb.z(I)I")
	public int method2925() {
		return this.field1758;
	}

	@ObfuscatedName("eb.p(B)I")
	public int method2926() {
		return this.field1756;
	}

	@ObfuscatedName("eb.d(B)I")
	public int count() {
		int var1 = 0;
		for (ReferenceNode var2 = (ReferenceNode) this.queue.peekFront(); var2 != null; var2 = (ReferenceNode) this.queue.prev()) {
			if (!var2.isSoft()) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("eb.c(I)V")
	public void clear() {
		for (ReferenceNode var1 = (ReferenceNode) this.queue.peekFront(); var1 != null; var1 = (ReferenceNode) this.queue.prev()) {
			if (var1.isSoft()) {
				var1.unlink();
				var1.secondaryRemove();
				this.field1756 += var1.weight;
			}
		}
	}

	@ObfuscatedName("eb.r(I)Ljava/lang/Object;")
	public Object method2950() {
		ReferenceNode var1 = (ReferenceNode) this.hashTable.head();
		while (var1 != null) {
			Object var2 = var1.getValue();
			if (var2 != null) {
				return var2;
			}
			ReferenceNode var3 = var1;
			var1 = (ReferenceNode) this.hashTable.next();
			var3.unlink();
			var3.secondaryRemove();
			this.field1756 += var3.weight;
		}
		return null;
	}

	@ObfuscatedName("eb.v(I)Ljava/lang/Object;")
	public Object method2937() {
		ReferenceNode var1 = (ReferenceNode) this.hashTable.next();
		while (var1 != null) {
			Object var2 = var1.getValue();
			if (var2 != null) {
				return var2;
			}
			ReferenceNode var3 = var1;
			var1 = (ReferenceNode) this.hashTable.next();
			var3.unlink();
			var3.secondaryRemove();
			this.field1756 += var3.weight;
		}
		return null;
	}
}
