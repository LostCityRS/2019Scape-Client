package com.jagex;

import deob.ObfuscatedName;

import java.util.*;

@ObfuscatedName("att")
public class class1205 extends AbstractQueue {

	@ObfuscatedName("att.e")
	public class384[] field12482;

	@ObfuscatedName("att.n")
	public Map field12483;

	@ObfuscatedName("att.m")
	public int field12484;

	@ObfuscatedName("att.k")
	public final Comparator field12485;

	@ObfuscatedName("att.f")
	public int field12486;

	public class1205(int arg0) {
		this(arg0, (Comparator) null);
	}

	public class1205(int arg0, Comparator arg1) {
		this.field12486 = 0;
		this.field12482 = new class384[arg0];
		this.field12483 = new HashMap();
		this.field12485 = arg1;
	}

	@ObfuscatedName("att.e(I)V")
	public void method19607() {
		int var1 = (this.field12482.length << 1) + 1;
		this.field12482 = (class384[]) Arrays.copyOf(this.field12482, var1);
	}

	public int size() {
		return this.field12484;
	}

	public boolean offer(Object arg0) {
		if (this.field12483.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.field12486++;
		int var2 = this.field12484;
		if (var2 >= this.field12482.length) {
			this.method19607();
		}
		this.field12484++;
		if (var2 == 0) {
			this.field12482[0] = new class384(arg0, 0);
			this.field12483.put(arg0, this.field12482[0]);
		} else {
			this.field12482[var2] = new class384(arg0, var2);
			this.field12483.put(arg0, this.field12482[var2]);
			this.method19608(var2);
		}
		return true;
	}

	public Object peek() {
		return this.field12484 == 0 ? null : this.field12482[0].field3566;
	}

	public Object poll() {
		if (this.field12484 == 0) {
			return null;
		}
		this.field12486++;
		Object var1 = this.field12482[0].field3566;
		this.field12483.remove(var1);
		this.field12484--;
		if (this.field12484 == 0) {
			this.field12482[this.field12484] = null;
		} else {
			this.field12482[0] = this.field12482[this.field12484];
			this.field12482[0].field3567 = 0;
			this.field12482[this.field12484] = null;
			this.method19609(0);
		}
		return var1;
	}

	public boolean remove(Object arg0) {
		class384 var2 = (class384) this.field12483.remove(arg0);
		if (var2 == null) {
			return false;
		}
		this.field12486++;
		this.field12484--;
		if (this.field12484 == var2.field3567) {
			this.field12482[this.field12484] = null;
			return true;
		}
		class384 var3 = this.field12482[this.field12484];
		this.field12482[this.field12484] = null;
		this.field12482[var2.field3567] = var3;
		this.field12482[var2.field3567].field3567 = var2.field3567;
		this.method19609(var2.field3567);
		if (this.field12482[var2.field3567] == var3) {
			this.method19608(var2.field3567);
		}
		return true;
	}

	@ObfuscatedName("att.n(II)V")
	public void method19608(int arg0) {
		class384 var2 = this.field12482[arg0];
		while (arg0 > 0) {
			int var3 = arg0 - 1 >>> 1;
			class384 var4 = this.field12482[var3];
			if (this.field12485 == null) {
				if (((Comparable) var2.field3566).compareTo(var4.field3566) >= 0) {
					break;
				}
			} else if (this.field12485.compare(var2.field3566, var4.field3566) >= 0) {
				break;
			}
			this.field12482[arg0] = var4;
			this.field12482[arg0].field3567 = arg0;
			arg0 = var3;
		}
		this.field12482[arg0] = var2;
		this.field12482[arg0].field3567 = arg0;
	}

	@ObfuscatedName("att.m(II)V")
	public void method19609(int arg0) {
		class384 var2 = this.field12482[arg0];
		int var3 = this.field12484 >>> 1;
		while (arg0 < var3) {
			int var4 = (arg0 << 1) + 1;
			class384 var5 = this.field12482[var4];
			int var6 = (arg0 << 1) + 2;
			class384 var7 = this.field12482[var6];
			int var8;
			if (this.field12485 == null) {
				if (var6 < this.field12484 && ((Comparable) var5.field3566).compareTo(var7.field3566) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field12484 && this.field12485.compare(var5.field3566, var7.field3566) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}
			if (this.field12485 == null) {
				if (((Comparable) var2.field3566).compareTo(this.field12482[var8].field3566) <= 0) {
					break;
				}
			} else if (this.field12485.compare(var2.field3566, this.field12482[var8].field3566) <= 0) {
				break;
			}
			this.field12482[arg0] = this.field12482[var8];
			this.field12482[arg0].field3567 = arg0;
			arg0 = var8;
		}
		this.field12482[arg0] = var2;
		this.field12482[arg0].field3567 = arg0;
	}

	public boolean contains(Object arg0) {
		return this.field12483.containsKey(arg0);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field12485 == null) {
			Arrays.sort(var1);
		} else {
			Arrays.sort(var1, this.field12485);
		}
		return var1;
	}

	public Iterator iterator() {
		return new class385(this);
	}
}
