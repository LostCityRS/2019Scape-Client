package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@ObfuscatedName("afu")
public final class class861 extends class150 {

	@ObfuscatedName("afu.m")
	public boolean field10252 = false;

	@ObfuscatedName("afu.k")
	public long field10253 = -1L;

	@ObfuscatedName("afu.f")
	public boolean field10254 = false;

	@ObfuscatedName("afu.w")
	public Set field10255;

	@ObfuscatedName("afu.l")
	public long field10259 = -1L;

	@ObfuscatedName("afu.u")
	public class413[] field10257;

	@ObfuscatedName("afu.z")
	public int field10258 = 0;

	@ObfuscatedName("afu.p")
	public final class457[] field10251;

	public class861(class808 arg0) {
		super(arg0);
		this.field10251 = new class457[arg0.size()];
		for (int var2 = 0; var2 < arg0.size(); var2++) {
			this.field10251[var2] = ((class149) arg0.get(var2)).field1705;
		}
		this.field10255 = new HashSet(arg0.size());
	}

	@ObfuscatedName("afu.e(Lec;II)V")
	public void method2798(class149 arg0, int arg1) {
		if (this.field10251[arg0.field1706] == class457.field4609) {
			this.field10252 = true;
		} else if (this.field10251[arg0.field1706] == class457.field4611 && this.method679(arg0) != arg1) {
			this.field10254 = true;
			this.field10255.add(arg0.field1706);
		}
		super.method2798(arg0, arg1);
	}

	@ObfuscatedName("afu.m(Lec;J)V")
	public void method2800(class149 arg0, long arg1) {
		if (this.field10251[arg0.field1706] == class457.field4609) {
			this.field10252 = true;
		} else if (this.field10251[arg0.field1706] == class457.field4611 && this.method2799(arg0) != arg1) {
			this.field10254 = true;
			this.field10255.add(arg0.field1706);
		}
		super.method2800(arg0, arg1);
	}

	@ObfuscatedName("afu.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(class149 arg0, Object arg1) {
		if (this.field10251[arg0.field1706] == class457.field4609) {
			this.field10252 = true;
		} else if (this.field10251[arg0.field1706] == class457.field4611) {
			if (arg1 instanceof String) {
				String var3 = (String) arg1;
				if (var3.length() > 80) {
					arg1 = var3.substring(0, 80);
				}
			}
			Object var4 = this.method2801(arg0);
			if (arg1 != null && var4 != null && !arg1.equals(var4)) {
				this.field10254 = true;
				this.field10255.add(arg0.field1706);
			} else if ((var4 == null) != (arg1 == null)) {
				this.field10254 = true;
				this.field10255.add(arg0.field1706);
			}
		}
		super.method2802(arg0, arg1);
	}

	@ObfuscatedName("afu.i(I)V")
	public void method16415() {
		for (int var1 = 0; var1 < this.field10251.length; var1++) {
			if (this.field10251[var1] == class457.field4610 || this.field10251[var1] == class457.field4611) {
				this.field1708.method14734(var1);
			}
		}
		this.field10255.clear();
		this.field10254 = false;
		this.field10257 = null;
		this.field10259 = -1L;
	}

	@ObfuscatedName("afu.j(I)V")
	public void method16421() {
		this.field10258 = 0;
	}

	@ObfuscatedName("afu.t(Labl;B)V")
	public void method16420(class752 arg0) {
		try {
			byte[] var2 = new byte[(int) arg0.method14821()];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = arg0.method14812(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new EOFException();
				}
			}
			Packet var5 = new Packet(var2);
			if (var5.data.length - var5.pos >= 1) {
				int var7 = var5.g1();
				if (var7 >= 0 && var7 <= 1) {
					if (var5.data.length - var5.pos < 2) {
						return;
					}
					int var10 = var5.g2();
					if (var5.data.length - var5.pos < var10 * 6) {
						return;
					}
					for (int var12 = 0; var12 < var10; var12++) {
						class413 var13 = Statics.field8911.method15284(var5);
						if (this.field10251[var13.field4240] == class457.field4609 && ((class149) Statics.field8911.get(var13.field4240)).field1704.method7292().field4843.isAssignableFrom(var13.field4239.getClass())) {
							this.field1708.method14735(var13.field4240, var13.field4239);
						}
					}
					return;
				}
				return;
			}
		} catch (Exception var29) {
			return;
		} finally {
			try {
				arg0.method14818();
			} catch (Exception var28) {
			}
		}
	}

	@ObfuscatedName("afu.ae(Labl;B)V")
	public void method16418(class752 arg0) {
		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.field1708.iterator();
			while (var4.hasNext()) {
				class413 var5 = (class413) var4.next();
				if (this.field10251[var5.field4240] == class457.field4609) {
					var2 += Statics.field8911.method15282(var5);
					var3++;
				}
			}
			Packet var6 = new Packet(var2);
			var6.p1(1);
			var6.p2(var3);
			Iterator var7 = this.field1708.iterator();
			while (var7.hasNext()) {
				class413 var8 = (class413) var7.next();
				if (this.field10251[var8.field4240] == class457.field4609) {
					Statics.field8911.method15283(var6, var8);
				}
			}
			arg0.method14808(var6.data, 0, var6.pos);
		} catch (Exception var20) {
		} finally {
			try {
				arg0.method14818();
			} catch (Exception var19) {
			}
		}
		this.field10253 = class213.method3655();
		this.field10252 = false;
	}

	@ObfuscatedName("afu.ag(I)V")
	public void method16414() {
		if (class213.method3655() < this.field10259) {
			return;
		}
		if (this.field10257 == null) {
			if (!this.field10254) {
				return;
			}
			this.field10257 = new class413[this.field10255.size()];
			int var1 = 0;
			Iterator var2 = this.field10255.iterator();
			while (var2.hasNext()) {
				int var3 = (Integer) var2.next();
				this.field10257[var1++] = new class413(var3, this.field1708.method14738(var3));
			}
			this.field10258 = 0;
			this.field10254 = false;
			this.field10255.clear();
		}
		if (this.field10257 == null || this.field10258 >= this.field10257.length) {
			return;
		}
		class49 var4 = client.method640();
		if (var4.field791 > 1200) {
			return;
		}
		ClientMessage var5 = Statics.method1604(ClientProt.STORE_SERVERPERM_VARCS, var4.field794);
		var5.field11432.p2(0);
		int var6 = var5.field11432.pos;
		var5.field11432.pos++;
		while (this.field10258 < this.field10257.length) {
			class413 var7 = this.field10257[this.field10258];
			if (var5.field11432.pos + var4.field791 + Statics.field8911.method15282(var7) > 1500) {
				break;
			}
			Statics.field8911.method15283(var5.field11432, var7);
			this.field10258++;
		}
		var5.field11432.psize2(var5.field11432.pos - var6);
		if (this.field10258 >= this.field10257.length) {
			var5.field11432.data[var6] = 1;
		} else {
			var5.field11432.data[var6] = 0;
		}
		var4.method934(var5);
		this.field10259 = class213.method3655() + 1000L;
	}

	@ObfuscatedName("afu.ad(I)V")
	public void method16413() {
		if (this.field10257 != null && this.field10258 >= this.field10257.length) {
			this.field10257 = null;
			this.field10258 = 0;
		}
	}
}
