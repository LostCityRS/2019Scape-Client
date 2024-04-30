package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.*;

@ObfuscatedName("att")
public class SortedQueue extends AbstractQueue {

	@ObfuscatedName("att.e")
	public SortedQueueEntry[] sortedEntries;

	@ObfuscatedName("att.n")
	public Map entries;

	@ObfuscatedName("att.m")
	public int size;

	@ObfuscatedName("att.k")
	public final Comparator comparator;

	@ObfuscatedName("att.f")
	public int modCount;

	public SortedQueue(int arg0) {
		this(arg0, (Comparator) null);
	}

	public SortedQueue(int arg0, Comparator arg1) {
		this.modCount = 0;
		this.sortedEntries = new SortedQueueEntry[arg0];
		this.entries = new java.util.HashMap();
		this.comparator = arg1;
	}

	@ObfuscatedName("att.e(I)V")
	public void method19607() {
		int var1 = (this.sortedEntries.length << 1) + 1;
		this.sortedEntries = (SortedQueueEntry[]) Arrays.copyOf(this.sortedEntries, var1);
	}

	public int size() {
		return this.size;
	}

	public boolean offer(Object arg0) {
		if (this.entries.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.modCount++;
		int var2 = this.size;
		if (var2 >= this.sortedEntries.length) {
			this.method19607();
		}
		this.size++;
		if (var2 == 0) {
			this.sortedEntries[0] = new SortedQueueEntry(arg0, 0);
			this.entries.put(arg0, this.sortedEntries[0]);
		} else {
			this.sortedEntries[var2] = new SortedQueueEntry(arg0, var2);
			this.entries.put(arg0, this.sortedEntries[var2]);
			this.heapifyUp(var2);
		}
		return true;
	}

	public Object peek() {
		return this.size == 0 ? null : this.sortedEntries[0].value;
	}

	public Object poll() {
		if (this.size == 0) {
			return null;
		}
		this.modCount++;
		Object var1 = this.sortedEntries[0].value;
		this.entries.remove(var1);
		this.size--;
		if (this.size == 0) {
			this.sortedEntries[this.size] = null;
		} else {
			this.sortedEntries[0] = this.sortedEntries[this.size];
			this.sortedEntries[0].slot = 0;
			this.sortedEntries[this.size] = null;
			this.heapifyDown(0);
		}
		return var1;
	}

	public boolean remove(Object arg0) {
		SortedQueueEntry var2 = (SortedQueueEntry) this.entries.remove(arg0);
		if (var2 == null) {
			return false;
		}
		this.modCount++;
		this.size--;
		if (this.size == var2.slot) {
			this.sortedEntries[this.size] = null;
			return true;
		}
		SortedQueueEntry var3 = this.sortedEntries[this.size];
		this.sortedEntries[this.size] = null;
		this.sortedEntries[var2.slot] = var3;
		this.sortedEntries[var2.slot].slot = var2.slot;
		this.heapifyDown(var2.slot);
		if (this.sortedEntries[var2.slot] == var3) {
			this.heapifyUp(var2.slot);
		}
		return true;
	}

	@ObfuscatedName("att.n(II)V")
	public void heapifyUp(int arg0) {
		SortedQueueEntry var2 = this.sortedEntries[arg0];
		while (arg0 > 0) {
			int var3 = arg0 - 1 >>> 1;
			SortedQueueEntry var4 = this.sortedEntries[var3];
			if (this.comparator == null) {
				if (((Comparable) var2.value).compareTo(var4.value) >= 0) {
					break;
				}
			} else if (this.comparator.compare(var2.value, var4.value) >= 0) {
				break;
			}
			this.sortedEntries[arg0] = var4;
			this.sortedEntries[arg0].slot = arg0;
			arg0 = var3;
		}
		this.sortedEntries[arg0] = var2;
		this.sortedEntries[arg0].slot = arg0;
	}

	@ObfuscatedName("att.m(II)V")
	public void heapifyDown(int arg0) {
		SortedQueueEntry var2 = this.sortedEntries[arg0];
		int var3 = this.size >>> 1;
		while (arg0 < var3) {
			int var4 = (arg0 << 1) + 1;
			SortedQueueEntry var5 = this.sortedEntries[var4];
			int var6 = (arg0 << 1) + 2;
			SortedQueueEntry var7 = this.sortedEntries[var6];
			int var8;
			if (this.comparator == null) {
				if (var6 < this.size && ((Comparable) var5.value).compareTo(var7.value) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.size && this.comparator.compare(var5.value, var7.value) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}
			if (this.comparator == null) {
				if (((Comparable) var2.value).compareTo(this.sortedEntries[var8].value) <= 0) {
					break;
				}
			} else if (this.comparator.compare(var2.value, this.sortedEntries[var8].value) <= 0) {
				break;
			}
			this.sortedEntries[arg0] = this.sortedEntries[var8];
			this.sortedEntries[arg0].slot = arg0;
			arg0 = var8;
		}
		this.sortedEntries[arg0] = var2;
		this.sortedEntries[arg0].slot = arg0;
	}

	public boolean contains(Object arg0) {
		return this.entries.containsKey(arg0);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.comparator == null) {
			Arrays.sort(var1);
		} else {
			Arrays.sort(var1, this.comparator);
		}
		return var1;
	}

	public Iterator iterator() {
		return new SortedQueueIterator(this);
	}
}
