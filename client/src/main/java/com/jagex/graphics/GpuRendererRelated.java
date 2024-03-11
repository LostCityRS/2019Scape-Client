package com.jagex.graphics;

import deob.ObfuscatedName;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

@ObfuscatedName("adc")
public final class GpuRendererRelated {

	@ObfuscatedName("adc.e")
	public int field9176;

	@ObfuscatedName("adc.n")
	public GpuRendererWeakReference[] field9177 = new GpuRendererWeakReference[16];

	@ObfuscatedName("adc.m")
	public ReferenceQueue field9175 = new ReferenceQueue();

	@ObfuscatedName("adc.e(Ljava/lang/Object;Ljava/lang/Object;I)V")
	public void method15159(Object arg0, Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method15163();
		int var3 = System.identityHashCode(arg0);
		int var4 = var3 & this.field9177.length - 1;
		GpuRendererWeakReference var5 = this.field9177[var4];
		if (var5 == null) {
			this.field9177[var4] = new GpuRendererWeakReference(arg0, this.field9175, var3, arg1);
			this.field9176++;
			if (this.field9176 >= this.field9177.length) {
				this.method15162();
			}
			return;
		}
		while (var5.get() != arg0) {
			if (var5.field12488 == null) {
				var5.field12488 = new GpuRendererWeakReference(arg0, this.field9175, var3, arg1);
				this.field9176++;
				if (this.field9176 >= this.field9177.length) {
					this.method15162();
				}
				break;
			}
			var5 = var5.field12488;
		}
	}

	@ObfuscatedName("adc.n(Ljava/lang/Object;I)V")
	public void method15160(Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method15163();
		int var2 = System.identityHashCode(arg0);
		int var3 = var2 & this.field9177.length - 1;
		GpuRendererWeakReference var4 = this.field9177[var3];
		if (var4 == null) {
			return;
		}
		if (var4.get() == arg0) {
			this.field9177[var3] = var4.field12488;
			this.field9176--;
			return;
		}
		while (true) {
			GpuRendererWeakReference var5 = var4.field12488;
			if (var5 == null) {
				break;
			}
			if (var5.get() == arg0) {
				var4.field12488 = var5.field12488;
				this.field9176--;
				break;
			}
			var4 = var5;
		}
	}

	@ObfuscatedName("adc.m(I)Ljava/util/ArrayList;")
	public ArrayList method15161() {
		this.method15163();
		ArrayList var1 = new ArrayList(this.field9176);
		GpuRendererWeakReference[] var2 = this.field9177;
		for (int var3 = 0; var3 < var2.length; var3++) {
			for (GpuRendererWeakReference var4 = var2[var3]; var4 != null; var4 = var4.field12488) {
				Object var5 = var4.get();
				if (var5 != null) {
					var1.add(var5);
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("adc.k(B)V")
	public void method15162() {
		GpuRendererWeakReference[] var1 = this.field9177;
		this.field9177 = new GpuRendererWeakReference[var1.length * 2];
		GpuRendererWeakReference[] var2 = var1;
		GpuRendererWeakReference var5;
		for (int var3 = 0; var3 < var2.length; var3++) {
			for (GpuRendererWeakReference var4 = var2[var3]; var4 != null; var4 = var5) {
				var5 = var4.field12488;
				int var6 = var4.field12489 & this.field9177.length - 1;
				var4.field12488 = this.field9177[var6];
				this.field9177[var6] = var4;
			}
		}
	}

	@ObfuscatedName("adc.f(B)V")
	public void method15163() {
		while (true) {
			GpuRendererWeakReference var1 = (GpuRendererWeakReference) this.field9175.poll();
			if (var1 == null) {
				return;
			}
			int var2 = var1.field12489 & this.field9177.length - 1;
			GpuRendererWeakReference var3 = this.field9177[var2];
			if (var1 == var3) {
				this.field9177[var2] = var1.field12488;
				this.field9176--;
			} else {
				while (var3 != null && var3.field12488 != var1) {
					var3 = var3.field12488;
				}
				if (var3 != null) {
					var3.field12488 = var1.field12488;
					this.field9176--;
				}
			}
		}
	}
}
