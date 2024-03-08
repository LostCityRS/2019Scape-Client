package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("ax")
public class class49 {

	@ObfuscatedName("ax.e")
	public class561 field800;

	@ObfuscatedName("ax.n")
	public class715 field803 = new class715();

	@ObfuscatedName("ax.m")
	public int field791 = 0;

	@ObfuscatedName("ax.k")
	public class997 field792 = new class997(1700);

	@ObfuscatedName("ax.f")
	public class734 field794;

	@ObfuscatedName("ax.w")
	public class1190 field795 = new class1190(40000);

	@ObfuscatedName("ax.l")
	public class734 field809;

	@ObfuscatedName("ax.u")
	public class393 field796 = null;

	@ObfuscatedName("ax.z")
	public int field797 = 0;

	@ObfuscatedName("ax.p")
	public boolean field799 = true;

	@ObfuscatedName("ax.d")
	public int field789 = 0;

	@ObfuscatedName("ax.c")
	public int field793 = 0;

	@ObfuscatedName("ax.r")
	public int field801;

	@ObfuscatedName("ax.v")
	public int field802;

	@ObfuscatedName("ax.o")
	public int field798;

	@ObfuscatedName("ax.s")
	public int field804;

	@ObfuscatedName("ax.y")
	public class393 field790;

	@ObfuscatedName("ax.q")
	public class393 field806;

	@ObfuscatedName("ax.x")
	public class393 field805;

	@ObfuscatedName("ax.b")
	public boolean field808 = false;

	@ObfuscatedName("ax.h")
	public class8 field807 = new class8();

	public class49() {
		Thread var1 = new Thread(this.field807);
		var1.setDaemon(true);
		var1.setPriority(1);
		var1.start();
	}

	@ObfuscatedName("ax.e(I)V")
	public final void method952() {
		this.field803.method14152();
		this.field791 = 0;
	}

	@ObfuscatedName("ax.n(B)V")
	public final void method933() throws IOException {
		if (this.field800 == null || this.field791 <= 0) {
			return;
		}
		this.field792.field11503 = 0;
		while (true) {
			class983 var1 = (class983) this.field803.method14191();
			if (var1 == null || var1.field11430 > this.field792.field11502.length - this.field792.field11503) {
				this.field800.method9030(this.field792.field11502, 0, this.field792.field11503);
				this.field801 += this.field792.field11503;
				this.field793 = 0;
				break;
			}
			this.field792.method17896(var1.field11432.field11502, 0, var1.field11430);
			this.field791 -= var1.field11430;
			var1.method8440();
			var1.field11432.method18142();
			var1.method17793();
		}
	}

	@ObfuscatedName("ax.m(Lakl;I)V")
	public final void method934(class983 arg0) {
		this.field803.method14153(arg0);
		arg0.field11430 = arg0.field11432.field11503;
		arg0.field11432.field11503 = 0;
		this.field791 += arg0.field11430;
	}

	@ObfuscatedName("ax.k(I)V")
	public void method946() {
		if (client.field10903 % 50 == 0) {
			this.field798 = this.field801;
			this.field801 = 0;
			this.field804 = this.field802;
			this.field802 = 0;
		}
	}

	@ObfuscatedName("ax.f(Luz;Ljava/lang/String;I)V")
	public void method936(class561 arg0, String arg1) {
		this.field800 = arg0;
		this.field807.method115(arg1);
	}

	@ObfuscatedName("ax.w(B)V")
	public void method938() {
		if (this.field800 != null) {
			this.field800.method9031();
			this.field800 = null;
		}
		this.field807.method115(null);
	}

	@ObfuscatedName("ax.l(B)V")
	public void method941() {
		this.field800 = null;
		this.field807.method115(null);
	}

	@ObfuscatedName("ax.u(B)Luz;")
	public class561 method939() {
		return this.field800;
	}
}
