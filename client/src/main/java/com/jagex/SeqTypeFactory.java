package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fu")
public abstract class SeqTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("fu.e")
	public final ConfigTypeList field1795;

	@ObfuscatedName("fu.n")
	public final WeightedCache field1794 = new WeightedCache(100);

	@ObfuscatedName("fu.m")
	public final WeightedCache field1796 = new WeightedCache(100);

	public SeqTypeFactory(ConfigTypeList arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		this.field1795 = arg0;
		class1177.method9393(arg1, arg3, 2);
		class1176.method9558(arg2, arg3);
	}

	@ObfuscatedName("fu.e(IB)Larr;")
	public class1177 method3020(int arg0) {
		WeightedCache var2 = this.field1794;
		synchronized (this.field1794) {
			class1177 var3 = (class1177) this.field1794.method2930((long) arg0);
			if (var3 == null) {
				var3 = new class1177(arg0);
				this.field1794.method2921(var3, (long) arg0);
			}
			return var3.method19410() ? var3 : null;
		}
	}

	@ObfuscatedName("fu.n(IB)Lard;")
	public class1176 method3010(int arg0) {
		WeightedCache var2 = this.field1796;
		synchronized (this.field1796) {
			class1176 var3 = (class1176) this.field1796.method2930((long) arg0);
			if (var3 == null) {
				var3 = new class1176(arg0);
				this.field1796.method2921(var3, (long) arg0);
			}
			return var3.method19395() ? var3 : null;
		}
	}

	@ObfuscatedName("fu.m(I)V")
	public void method3011() {
		WeightedCache var1 = this.field1794;
		synchronized (this.field1794) {
			this.field1794.method2924();
		}
	}

	@ObfuscatedName("fu.k(II)V")
	public void method3012(int arg0) {
		WeightedCache var2 = this.field1794;
		synchronized (this.field1794) {
			this.field1794.method2923(arg0);
		}
	}

	@ObfuscatedName("fu.f(I)V")
	public void method3019() {
		WeightedCache var1 = this.field1794;
		synchronized (this.field1794) {
			this.field1794.method2928();
		}
	}
}
