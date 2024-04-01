package com.jagex.game.telemetry.grid;

import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("fy")
public class TelemetryGroup {

	@ObfuscatedName("fy.m")
	public static final Integer field1889 = -1;

	@ObfuscatedName("fy.k")
	public final int id;

	@ObfuscatedName("fy.f")
	public final List field1886;

	@ObfuscatedName("fy.w")
	public final List field1882;

	@ObfuscatedName("fy.l")
	public final List field1884;

	@ObfuscatedName("fy.u")
	public final List field1887;

	public TelemetryGroup(int arg0) {
		this.id = arg0;
		this.field1886 = new ArrayList();
		this.field1882 = new ArrayList();
		this.field1884 = new ArrayList();
		this.field1887 = new ArrayList();
	}

	@ObfuscatedName("fy.e(B)I")
	public int getColumnCount() {
		return this.field1886.size();
	}

	@ObfuscatedName("fy.n(I)I")
	public int getRowCount() {
		return this.field1882.size();
	}

	@ObfuscatedName("fy.m(II)I")
	public int getRowIndex(int arg0) {
		return this.field1882.indexOf(arg0);
	}

	@ObfuscatedName("fy.k(IB)I")
	public int getRowId(int arg0) {
		return (Integer) this.field1882.get(arg0);
	}

	@ObfuscatedName("fy.f(II)I")
	public int getColumnIndex(int arg0) {
		return this.field1886.indexOf(arg0);
	}

	@ObfuscatedName("fy.w(II)I")
	public int getColumnId(int arg0) {
		return (Integer) this.field1886.get(arg0);
	}

	@ObfuscatedName("fy.l(IB)I")
	public int method3320(int arg0) {
		return this.addColumn(arg0, -1);
	}

	@ObfuscatedName("fy.u(IZI)V")
	public void setRowPinned(int arg0, boolean arg1) {
		this.field1884.set(arg0, arg1 ? arg0 : field1889);
	}

	@ObfuscatedName("fy.z(III)V")
	public void method3319(int arg0, int arg1) {
		this.field1884.set(arg0, arg1);
	}

	@ObfuscatedName("fy.p(II)Z")
	public boolean isRowPinned(int arg0) {
		return !((Integer) this.field1884.get(arg0)).equals(field1889);
	}

	@ObfuscatedName("fy.d(III)I")
	public int addColumn(int arg0, int arg1) {
		if (this.field1886.size() == 8) {
			throw new RuntimeException("");
		} else if (this.getColumnIndex(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.field1886.size();
			}
			this.field1886.add(arg1, arg0);
			Iterator var3 = this.field1887.iterator();
			while (var3.hasNext()) {
				List var4 = (List) var3.next();
				var4.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("fy.c(IB)V")
	public void removeColumn(int arg0) {
		this.field1886.remove(arg0);
		Iterator var2 = this.field1887.iterator();
		while (var2.hasNext()) {
			List var3 = (List) var2.next();
			var3.remove(arg0);
		}
	}

	@ObfuscatedName("fy.r(II)I")
	public int method3298(int arg0) {
		return this.addRow(arg0, -1);
	}

	@ObfuscatedName("fy.v(IIB)V")
	public void moveRow(int arg0, int arg1) {
		this.method3300(arg0, arg1);
		for (int var3 = 0; var3 < this.field1884.size(); var3++) {
			Integer var4 = (Integer) this.field1884.get(var3);
			if (!var4.equals(field1889)) {
				Integer var5 = var3;
				if (!var4.equals(var5)) {
					this.field1884.set(var3, var5);
				}
			}
		}
	}

	@ObfuscatedName("fy.o(III)V")
	public void method3300(int arg0, int arg1) {
		this.field1882.add(arg1, this.field1882.remove(arg0));
		this.field1884.add(arg1, this.field1884.remove(arg0));
		this.field1887.add(arg1, this.field1887.remove(arg0));
	}

	@ObfuscatedName("fy.s(III)I")
	public int addRow(int arg0, int arg1) {
		if (this.field1882.size() == 40) {
			throw new RuntimeException("");
		} else if (this.getRowIndex(arg0) == -1) {
			if (arg1 == -1) {
				arg1 = this.field1882.size();
			}
			this.method3302(arg0, arg1);
			for (int var3 = arg1 + 1; var3 < this.field1882.size(); var3++) {
				Integer var4 = (Integer) this.field1884.get(var3);
				if (!var4.equals(field1889) && var4 < var3) {
					this.method3300(var3, var3 - 1);
				}
			}
			return this.getRowIndex(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("fy.y(IIB)V")
	public void method3302(int arg0, int arg1) {
		this.field1882.add(arg1, arg0);
		this.field1884.add(arg1, field1889);
		ArrayList var3 = new ArrayList();
		for (int var4 = 0; var4 < this.field1886.size(); var4++) {
			var3.add(null);
		}
		this.field1887.add(arg1, var3);
	}

	@ObfuscatedName("fy.q(II)V")
	public void removeRow(int arg0) {
		this.method3304(arg0);
		int var2 = arg0;
		for (int var3 = arg0; var3 < this.field1882.size(); var3++) {
			if (!this.isRowPinned(var3)) {
				if (var2 != var3) {
					this.method3300(var3, var2);
				}
				var2 = var3 + 1;
			}
		}
	}

	@ObfuscatedName("fy.x(II)V")
	public void method3304(int arg0) {
		this.field1882.remove(arg0);
		this.field1884.remove(arg0);
		this.field1887.remove(arg0);
	}

	@ObfuscatedName("fy.b(III)V")
	public void moveColumn(int arg0, int arg1) {
		this.field1886.add(arg1, this.field1886.remove(arg0));
		Iterator var3 = this.field1887.iterator();
		while (var3.hasNext()) {
			List var4 = (List) var3.next();
			var4.add(arg1, var4.remove(arg0));
		}
	}

	@ObfuscatedName("fy.h(IIB)Ljava/lang/Object;")
	public Object getGridValue(int arg0, int arg1) {
		return ((List) this.field1887.get(arg0)).get(arg1);
	}

	@ObfuscatedName("fy.a(IILjava/lang/Object;I)V")
	public void clearGridValue(int arg0, int arg1, Object arg2) {
		((List) this.field1887.get(arg0)).set(arg1, arg2);
	}
}
