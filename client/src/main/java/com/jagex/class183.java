package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("fb")
public class class183 {

	@ObfuscatedName("fb.u")
	public boolean field1860;

	@ObfuscatedName("fb.z")
	public List field1848 = new ArrayList();

	@ObfuscatedName("fb.p")
	public List field1855 = new ArrayList();

	@ObfuscatedName("fb.d")
	public HashMap field1858 = new HashMap();

	@ObfuscatedName("fb.c")
	public HashMap field1865 = new HashMap();

	@ObfuscatedName("fb.r")
	public List field1867 = new ArrayList();

	@ObfuscatedName("fb.v")
	public class162 field1856;

	@ObfuscatedName("fb.o")
	public class162 field1862;

	@ObfuscatedName("fb.s")
	public class162 field1863;

	@ObfuscatedName("fb.y")
	public int field1864;

	@ObfuscatedName("fb.q")
	public class423 field1873;

	@ObfuscatedName("fb.x")
	public HashMap field1851 = new HashMap();

	@ObfuscatedName("fb.b")
	public int field1875;

	@ObfuscatedName("fb.h")
	public class476 field1868;

	@ObfuscatedName("fb.a")
	public class476 field1869 = null;

	@ObfuscatedName("fb.g")
	public boolean field1870 = false;

	@ObfuscatedName("fb.i")
	public int field1871;

	@ObfuscatedName("fb.j")
	public int field1861;

	@ObfuscatedName("fb.t")
	public boolean field1857;

	@ObfuscatedName("fb.ae")
	public class479 field1874 = new class171(this);

	@ObfuscatedName("fb.ag")
	public class479 field1872 = new class170(this);

	@ObfuscatedName("fb.ah")
	public class479 field1876 = new class177(this);

	@ObfuscatedName("fb.al")
	public class479 field1877 = new class172(this);

	@ObfuscatedName("fb.e(I)Ljava/util/List;")
	public List method3150() {
		return this.field1855;
	}

	@ObfuscatedName("fb.n(I)Ljava/util/List;")
	public List method3233() {
		return this.field1867;
	}

	@ObfuscatedName("fb.m(I)Leb;")
	public class162 method3145() {
		return this.field1856;
	}

	@ObfuscatedName("fb.k(I)Leb;")
	public class162 method3146() {
		return this.field1862;
	}

	@ObfuscatedName("fb.f(I)Lox;")
	public class423 method3147() {
		return this.field1873;
	}

	@ObfuscatedName("fb.w(III)V")
	public void method3148(int arg0, int arg1) {
		if (this.field1860) {
			return;
		}
		this.field1864 = arg0;
		this.field1856 = new class162(arg1, 100);
		this.field1862 = new class162(10);
		this.field1856.method2943(new class167(this));
		class656 var3 = new class656(class363.field3413);
		class657.method8200(var3);
		this.method3197();
		this.field1875 = -1;
		this.field1860 = true;
	}

	@ObfuscatedName("fb.l(S)V")
	public void method3149() {
		if (!this.field1860) {
			return;
		}
		class657.method306();
		if (Statics.field4490 != null && Statics.field4490.method10536() != null) {
			if (this.field1873 == null) {
				this.field1873 = new class423();
			}
			this.field1873.field4308 = Statics.field4490.method10536().field4298.field4308;
			this.field1873.field4311 = 0.0F;
			this.field1873.field4313 = Statics.field4490.method10536().field4298.field4313;
		}
		Iterator var1 = this.field1858.values().iterator();
		while (var1.hasNext()) {
			class614 var2 = (class614) var1.next();
			var2.method9672();
		}
		Iterator var3 = this.field1865.values().iterator();
		while (var3.hasNext()) {
			class614 var4 = (class614) var3.next();
			var4.method9672();
		}
		Iterator var5 = this.field1867.iterator();
		while (var5.hasNext()) {
			class614 var6 = (class614) var5.next();
			if (var6.method9675()) {
				this.field1865.remove(var6.method9680());
			} else {
				this.field1858.remove(var6.method9680());
			}
		}
		this.field1867.clear();
		if (this.field1869 != null && this.field1869.method7385() == class481.field4949 && !this.field1870 && client.field10849.field794 != null && client.method2737(client.field10791)) {
			class983 var7 = Statics.method1604(class390.field3712, client.field10849.field794);
			var7.field11432.method17886(this.field1869.method7386().method9680());
			client.field10849.method934(var7);
			this.field1870 = true;
		}
		Iterator var8 = this.field1848.iterator();
		while (true) {
			label163: while (true) {
				class476 var9;
				class481 var10;
				do {
					if (!var8.hasNext()) {
						return;
					}
					var9 = (class476) var8.next();
					var9.method7402();
					var9.method7384();
					var10 = var9.method7385();
				} while (var9.method7387() != this);
				if (class481.field4947 == var10 || class481.field4953 == var10) {
					if (var9.method7458() != class173.field1824 && var9.method7458() != class173.field1826) {
						Iterator var12 = this.field1851.keySet().iterator();
						while (var12.hasNext()) {
							int var13 = (Integer) var12.next();
							class180 var14 = (class180) this.field1851.get(var13);
							if (var14.method3120().contains(var9)) {
								var14.method3114(var9);
								break;
							}
						}
						var9.method7377();
						this.field1855.remove(var9);
					} else if (this.field1869 == var9) {
						this.field1870 = false;
						this.field1869 = null;
						var9.method7377();
						this.field1855.remove(var9);
					} else {
						int var15 = var9.method7386().method9680();
						boolean var16 = this.method3189(class168.field1800.method3034()) > 0.0F;
						if (!this.field1857 && var16) {
							if (this.field1875 == var15) {
								this.method3144(var15);
								this.field1875 = -1;
							}
							var9.method7377();
							this.field1855.remove(var9);
						} else if (this.field1861 == var15) {
							this.field1861 = -1;
							this.field1857 = false;
							var9.method7377();
							this.field1855.remove(var9);
							Iterator var17 = this.field1848.iterator();
							class476 var18;
							int var19;
							do {
								do {
									if (!var17.hasNext()) {
										continue label163;
									}
									var18 = (class476) var17.next();
								} while (var18.method7458() != class173.field1824);
								var19 = var18.method7386().method9680();
							} while ((this.field1875 != var19 || var18.method7385() != class481.field4947) && var18.method7385() != class481.field4946 && var18.method7385() != class481.field4948 && var18.method7385() != class481.field4949);
							if (var18.method7385() == class481.field4947) {
								var18.method7382();
							} else {
								var18.method7441();
							}
						} else if (var16) {
							if (!this.field1857 || this.field1875 != var15) {
								var9.method7377();
								this.field1855.remove(var9);
							}
							if (!this.field1857 && this.field1875 == var15) {
								this.field1875 = -1;
								this.field1868 = null;
							}
						}
					}
				} else if (var9.method7385() != class481.field4951 && var9.method7419() == class168.field1800.method3034()) {
					boolean var11 = this.method3189(class168.field1800.method3034()) > 1.0E-4F;
					if (!var11) {
						var9.method7380(150);
					}
				}
			}
		}
	}

	@ObfuscatedName("fb.u(B)V")
	public void method3165() {
		class657.method7606();
	}

	@ObfuscatedName("fb.z(Lrw;III)V")
	public void method3251(class476 arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return;
		}
		class180 var4 = (class180) this.field1851.get(arg1);
		if (var4 == null) {
			var4 = new class180(this);
			this.field1851.put(arg1, var4);
		}
		if (!var4.method3113(arg0)) {
			arg0.method7400(arg2, true);
			var4.method3110(arg0);
		}
	}

	@ObfuscatedName("fb.p(IB)V")
	public void method3208(int arg0) {
		class180 var2 = (class180) this.field1851.get(arg0);
		if (var2 == null) {
			return;
		}
		List var3 = var2.method3120();
		Iterator var4 = var3.iterator();
		while (var4.hasNext()) {
			class476 var5 = (class476) var4.next();
			if (!var5.method7390()) {
				var5.method7441();
			}
		}
	}

	@ObfuscatedName("fb.d(II)V")
	public void method3153(int arg0) {
		class180 var2 = (class180) this.field1851.get(arg0);
		if (var2 == null) {
			return;
		}
		List var3 = var2.method3120();
		Iterator var4 = var3.iterator();
		while (var4.hasNext()) {
			class476 var5 = (class476) var4.next();
			var5.method7380(50);
		}
	}

	@ObfuscatedName("fb.c(IB)V")
	public void method3215(int arg0) {
		class180 var2 = (class180) this.field1851.get(arg0);
		if (var2 == null) {
			return;
		}
		List var3 = var2.method3120();
		Iterator var4 = var3.iterator();
		while (var4.hasNext()) {
			class476 var5 = (class476) var4.next();
			var5.method7392();
		}
	}

	@ObfuscatedName("fb.r(I)V")
	public void method3197() {
		class175 var1 = new class175(this);
		class176 var2 = new class176(this);
		class179 var3 = new class179(this);
		class181 var4 = new class181(this);
		class178 var5 = new class178(this);
		class657.method16432(class169.field1812.method3047(), class169.field1815.method3047(), 0.2F, var1);
		class657.method16432(class169.field1814.method3047(), class169.field1815.method3047(), 1.0F, var2);
		class657.method16432(class169.field1817.method3047(), class169.field1815.method3047(), 1.0F, var3);
		class657.method16432(class169.field1816.method3047(), class169.field1815.method3047(), 0.8F, var4);
		class657.method16432(class169.field1813.method3047(), class169.field1815.method3047(), 1.0F, var5);
		class657.method16432(class168.field1800.method3034(), class169.field1814.method3047(), 1.0F, null);
		class657.method16432(class168.field1801.method3034(), class169.field1813.method3047(), 1.0F, null);
		class657.method16432(class168.field1805.method3034(), class169.field1812.method3047(), 1.0F, null);
		class657.method16432(class168.field1802.method3034(), class169.field1812.method3047(), 1.0F, null);
		class657.method16432(class168.field1803.method3034(), class169.field1812.method3047(), 1.0F, null);
		class657.method16432(class168.field1804.method3034(), class169.field1812.method3047(), 1.0F, null);
		class657.method16432(class168.field1809.method3034(), class169.field1812.method3047(), 1.0F, null);
		class657.method16432(class168.field1806.method3034(), class169.field1816.method3047(), 1.0F, null);
		class657.method16432(class168.field1808.method3034(), class168.field1806.method3034(), 1.0F, null);
		class657.method16432(class168.field1799.method3034(), class168.field1806.method3034(), 1.0F, null);
		class657.method5401(class168.field1800.method3034()).method5897(0.75F);
	}

	@ObfuscatedName("fb.v(IIIB)V")
	public void method3156(int arg0, int arg1, int arg2) {
		int var4 = class169.field1815.method3047();
		if (class657.method5401(arg0) == null && (arg1 == var4 || class657.method5401(arg1) != null)) {
			float var5 = (float) arg2 * 1.5258789E-5F;
			class657.method16432(arg0, arg1 == var4 ? -1 : arg1, var5, null);
		}
	}

	@ObfuscatedName("fb.o(III)V")
	public void method3157(int arg0, int arg1) {
		class369 var3 = class657.method5401(arg0);
		if (var3 != null) {
			float var4 = (float) arg1 * 1.5258789E-5F;
			var3.method5897(var4);
		}
	}

	@ObfuscatedName("fb.s(II)F")
	public float method3189(int arg0) {
		class369 var2 = class657.method5401(arg0);
		float var3 = 1.0F;
		while (var2 != null) {
			var3 *= var2.method5902();
			var2 = var2.method5904();
		}
		return var3;
	}

	@ObfuscatedName("fb.y(IB)V")
	public void method3203(int arg0) {
		Iterator var2 = this.field1855.iterator();
		while (var2.hasNext()) {
			class476 var3 = (class476) var2.next();
			int var4 = var3.method7419();
			boolean var5 = Statics.method10338(var4, arg0);
			if (var5) {
				var3.method7380(50);
			}
		}
	}

	@ObfuscatedName("fb.q([IB)V")
	public void method3160(int[] arg0) {
		if (!this.field1860 || arg0 == null) {
			return;
		}
		int[] var2 = arg0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			int var4 = var2[var3];
			this.method3200(var4);
		}
	}

	@ObfuscatedName("fb.x(IB)V")
	public void method3200(int arg0) {
		if (this.field1860 && arg0 >= 0) {
			this.method3163(arg0, false);
		}
	}

	@ObfuscatedName("fb.b(IZI)Lwr;")
	public class614 method3162(int arg0, boolean arg1) {
		if (!this.field1860) {
			return null;
		}
		class614 var3 = (class614) (arg1 ? this.field1862.method2930((long) arg0) : this.field1856.method2930((long) arg0));
		if (var3 == null) {
			if (arg1) {
				var3 = (class614) this.field1865.get(arg0);
			} else {
				var3 = (class614) this.field1858.get(arg0);
			}
		}
		return var3;
	}

	@ObfuscatedName("fb.h(IZI)Lwr;")
	public class614 method3163(int arg0, boolean arg1) {
		if (!this.field1860) {
			return null;
		}
		class614 var3 = this.method3162(arg0, arg1);
		if (var3 == null) {
			class182 var4 = new class182(this);
			var3 = class657.method6064(arg1 ? Statics.field3085 : Statics.field2613, arg0, var4, arg1, this.field1863);
			if (arg1) {
				this.field1865.put(arg0, var3);
			} else {
				this.field1858.put(arg0, var3);
			}
		}
		return var3;
	}

	@ObfuscatedName("fb.a(Lwr;I)Lrw;")
	public class476 method3164(class614 arg0) {
		if (!this.field1860) {
			return null;
		}
		int var2 = 0;
		Iterator var3 = this.field1848.iterator();
		class476 var4;
		do {
			if (!var3.hasNext()) {
				if (var2 >= this.field1864) {
					return null;
				}
				class476 var5 = arg0.method9710();
				this.field1848.add(var5);
				return var5;
			}
			var4 = (class476) var3.next();
			var2++;
		} while (var4.method7385() != class481.field4955);
		var4.method7376(arg0);
		return var4;
	}

	@ObfuscatedName("fb.g(Lrw;I)V")
	public void method3185(class476 arg0) {
		arg0.method7448(this);
		this.field1855.add(arg0);
	}

	@ObfuscatedName("fb.i(Lox;Lox;FI)Z")
	public boolean method3231(class423 arg0, class423 arg1, float arg2) {
		class423 var4 = class423.method6528(arg1, arg0);
		return !(var4.method6519() >= arg2);
	}

	@ObfuscatedName("fb.j(Lft;Ljava/lang/Object;IIIILfx;FFLox;IIZI)Lrw;")
	public class476 method3236(class173 arg0, Object arg1, int arg2, int arg3, int arg4, int arg5, class174 arg6, float arg7, float arg8, class423 arg9, int arg10, int arg11, boolean arg12) {
		if (!this.field1860) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			int var14 = Math.max(0, Math.min(arg4, 255));
			int var15 = Math.max(0, arg11);
			if (class174.field1835 != arg6 && !this.method3231(this.field1873, arg9, arg8)) {
				return null;
			}
			if (var15 <= 0) {
				var15 = 255;
			}
			float var16 = (float) var14 / 255.0F;
			float var17 = (float) var15 / 255.0F;
			class614 var18 = this.method3163(arg2, arg12);
			class476 var19 = this.method3164(var18);
			if (var19 == null) {
				return null;
			}
			var19.method7448(arg1);
			var19.method7391(arg5);
			if (class174.field1835 != arg6) {
				var19.method7421(true);
				var19.method7394(arg9);
				var19.method7398(arg7);
				var19.method7464(arg8);
				if (class174.field1836 == arg6) {
					var19.method7383(this.field1872);
				} else if (class174.field1837 == arg6) {
					var19.method7383(this.field1877);
				} else if (class174.field1838 == arg6) {
					var19.method7383(this.field1874);
				} else if (class174.field1834 == arg6) {
					var19.method7383(this.field1876);
				} else {
					var19.method7421(false);
				}
			}
			var19.method7403(var16, 0);
			var19.method7404(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			var19.method7405(var17);
			var19.method7388(arg0);
			return var19;
		}
	}

	@ObfuscatedName("fb.t(Lft;IIIILfx;FFLox;IIII)V")
	public void method3191(class173 arg0, int arg1, int arg2, int arg3, int arg4, class174 arg5, float arg6, float arg7, class423 arg8, int arg9, int arg10, int arg11) {
		if (!this.field1860) {
			return;
		}
		class476 var13 = this.method3236(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (var13 == null) {
			return;
		}
		if (arg11 == 0) {
			var13.method7441();
		} else {
			var13.method7400(arg11, false);
		}
		this.method3185(var13);
	}

	@ObfuscatedName("fb.ae(III)V")
	public void method3239(int arg0, int arg1) {
		if (this.field1875 == arg0) {
			return;
		}
		if (this.field1869 != null) {
			this.field1869.method7380(0);
			this.method3185(this.field1869);
			this.field1869 = null;
		}
		class476 var3 = this.method3236(class173.field1824, this, arg0, 0, arg1, class168.field1800.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, 255, true);
		if (var3 != null) {
			var3.method7392();
			this.field1869 = var3;
		}
		this.field1870 = false;
	}

	@ObfuscatedName("fb.ag(I)I")
	public int method3170() {
		return this.field1875;
	}

	@ObfuscatedName("fb.ah(II)V")
	public void method3171(int arg0) {
		this.field1871 = arg0;
	}

	@ObfuscatedName("fb.al(I)I")
	public int method3169() {
		return this.field1871;
	}

	@ObfuscatedName("fb.ac(II)V")
	public void method3144(int arg0) {
		if (client.field10849.field794 != null && client.method2737(client.field10791)) {
			class983 var2 = Statics.method1604(class390.field3696, client.field10849.field794);
			var2.field11432.method17886(arg0);
			client.field10849.method934(var2);
		}
	}

	@ObfuscatedName("fb.ai(II)V")
	public void method3174(int arg0) {
		this.method3235(arg0, 255);
	}

	@ObfuscatedName("fb.aw(IIB)V")
	public void method3235(int arg0, int arg1) {
		this.method3143(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@ObfuscatedName("fb.as(IIZIIIIIB)V")
	public void method3143(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (!this.field1860 || this.field1875 == arg0) {
			return;
		}
		if (this.field1857 && this.field1868 != null && this.field1875 != arg0) {
			this.field1868.method7382();
			this.field1868.method7377();
			this.field1855.remove(this.field1868);
		}
		class476 var9 = this.method3152();
		if (var9 != null && var9.method7386().method9680() == arg0) {
			this.field1868 = var9;
			this.field1875 = var9.method7386().method9680();
			return;
		}
		boolean var10 = false;
		if (this.field1875 >= 0) {
			Iterator var11 = this.field1855.iterator();
			while (var11.hasNext()) {
				class476 var12 = (class476) var11.next();
				if (var12.method7458() == class173.field1824) {
					var12.method7380(2000);
					var10 = true;
				}
			}
		}
		this.field1868 = null;
		this.field1875 = -1;
		class476 var13 = null;
		if (this.field1869 != null && this.field1869.method7386() != null && this.field1869.method7386().method9680() == arg0 && this.field1869.method7385() == class481.field4949) {
			var13 = this.field1869;
			this.field1869 = null;
			this.field1870 = false;
		}
		if (var13 == null) {
			if (arg2) {
				float var14 = (float) arg6;
				float var15 = (float) arg7;
				class423 var16 = new class423((float) arg4, 0.0F, (float) arg5);
				var13 = this.method3236(class173.field1824, this, arg0, 0, var10 ? 0 : arg1, this.field1871 == arg0 ? class169.field1817.method3047() : class168.field1800.method3034(), class174.field1834, var14, var15, var16, arg3, 255, true);
			} else {
				var13 = this.method3236(class173.field1824, this, arg0, 0, var10 ? 0 : arg1, this.field1871 == arg0 ? class169.field1817.method3047() : class168.field1800.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (var13 == null) {
			return;
		}
		if (var10) {
			float var17 = (float) arg1 / 255.0F;
			var13.method7403(var17, 2000);
		}
		var13.method7441();
		this.method3185(var13);
		this.field1868 = var13;
		this.field1875 = arg0;
		if (this.field1857) {
			this.field1868.method7381();
		}
		if (client.field10849.field794 != null && client.method2737(client.field10791)) {
			class983 var18 = Statics.method1604(class390.field3712, client.field10849.field794);
			var18.field11432.method17886(this.field1875);
			client.field10849.method934(var18);
		}
	}

	@ObfuscatedName("fb.at(I)Lrw;")
	public class476 method3152() {
		Iterator var1 = this.field1855.iterator();
		class476 var2;
		do {
			if (!var1.hasNext()) {
				return null;
			}
			var2 = (class476) var1.next();
		} while (var2.method7458() != class173.field1824 || var2.method7385() != class481.field4950);
		return var2;
	}

	@ObfuscatedName("fb.ad(I)V")
	public void method3178() {
		Iterator var1 = this.field1855.iterator();
		while (var1.hasNext()) {
			class476 var2 = (class476) var1.next();
			if (var2.method7458() == class173.field1824) {
				var2.method7380(500);
				if (var2.method7386().method9680() == this.field1875) {
					this.method3144(this.field1875);
					break;
				}
			}
		}
		this.field1868 = null;
		this.field1875 = -1;
	}

	@ObfuscatedName("fb.am(III)V")
	public void method3179(int arg0, int arg1) {
		if (!this.field1860 || this.field1857 && this.field1861 == arg0) {
			return;
		}
		if (this.field1857 && this.field1861 != arg0) {
			Iterator var3 = this.field1848.iterator();
			while (var3.hasNext()) {
				class476 var4 = (class476) var3.next();
				if (var4.method7458() == class173.field1826) {
					var4.method7377();
					this.field1855.remove(var4);
					this.field1857 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.field1857 && this.field1868 != null) {
			this.field1868.method7381();
		}
		class476 var5 = this.method3236(class173.field1826, this, arg0, 0, arg1, class168.field1800.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, 255, true);
		if (var5 != null) {
			var5.method7441();
			this.method3185(var5);
			this.field1857 = true;
			this.field1861 = arg0;
		}
	}

	@ObfuscatedName("fb.au(Lfg;ILalh;B)V")
	public void method3180(class164 arg0, int arg1, class1019 arg2) {
		if (arg0 == null || arg0.field1777 == null || arg1 >= arg0.field1777.length || arg0.field1777[arg1] == null || (Statics.field4490.field11717 != arg2.field11717 || !arg2.method18359())) {
			return;
		}
		int var4 = arg0.field1777[arg1][0];
		int var5 = var4 >> 8;
		int var6 = var4 >> 5 & 0x7;
		int var7 = var4 & 0x1F;
		if (arg0.field1777[arg1].length > 1) {
			int var8 = (int) (Math.random() * (double) arg0.field1777[arg1].length);
			if (var8 > 0) {
				var5 = arg0.field1777[arg1][var8];
			}
		}
		int var9 = 256;
		if (arg0.field1789 != null && arg0.field1790 != null) {
			var9 = (int) (Math.random() * (double) (arg0.field1790[arg1] - arg0.field1789[arg1])) + arg0.field1789[arg1];
		}
		int var10 = arg0.field1788 == null ? 255 : arg0.field1788[arg1];
		if (var7 != 0) {
			if (Statics.field4490 == arg2) {
				if (Statics.field688.field11563.method18763() == 0) {
					return;
				}
			} else if (Statics.field688.field11511.method18763() == 0) {
				return;
			}
			if (arg0.field1783 != -1) {
				int var11 = 0;
				if (arg2 instanceof class892) {
					var11 = ((class892) arg2).method16578();
				} else if (arg2 instanceof class1235) {
					var11 = ((class1235) arg2).method19745();
				} else if (arg2 instanceof class1234) {
					var11 = ((class1234) arg2).method19724();
				}
				if (var11 != 0 && var11 != Statics.field4490.method16578() && client.field10787 != var11) {
					var10 = arg0.field1783 * var10 / 100;
					if (var10 < 0) {
						var10 = 0;
					} else if (var10 > 255) {
						var10 = 255;
					}
				}
			}
			class423 var12 = arg2.method10536().field4298;
			int var13 = (int) var12.field4308 - 256 >> 9;
			int var14 = (int) var12.field4313 - 256 >> 9;
			class423 var15 = new class423((float) (var13 << 9), 0.0F, (float) (var14 << 9));
			int var16 = arg2.field11717 << 24;
			this.method3191(class173.field1820, var5, var6, var10, class168.field1803.method3034(), Statics.field4490 == arg2 ? class174.field1835 : class174.field1838, 0.0F, (float) (var7 << 9), var15, var16, var9, 0);
		} else if (Statics.field4490 == arg2) {
			this.method3191(class173.field1825, var5, var6, var10, class168.field1802.method3034(), class174.field1835, 0.0F, 0.0F, null, arg2.field11717, var9, 0);
		}
	}

	@ObfuscatedName("fb.ar(Lfg;II)V")
	public void method3181(class164 arg0, int arg1) {
		if (arg0 == null || arg0.field1777 == null || arg1 >= arg0.field1777.length || arg0.field1777[arg1] == null) {
			return;
		}
		int var3 = arg0.field1777[arg1][0];
		int var4 = var3 >> 8;
		int var5 = var3 >> 5 & 0x7;
		if (arg0.field1777[arg1].length > 1) {
			int var6 = (int) (Math.random() * (double) arg0.field1777[arg1].length);
			if (var6 > 0) {
				var4 = arg0.field1777[arg1][var6];
			}
		}
		int var7 = 256;
		if (arg0.field1789 != null && arg0.field1790 != null) {
			var7 = (int) ((double) arg0.field1789[arg1] + Math.random() * (double) (arg0.field1790[arg1] - arg0.field1789[arg1]));
		}
		int var8 = arg0.field1788 == null ? 255 : arg0.field1788[arg1];
		this.method3191(class173.field1832, var4, var5, var8, class168.field1803.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var7, 0);
	}
}
