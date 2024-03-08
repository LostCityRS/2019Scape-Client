package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("alp")
public class class1016 extends class649 {

	@ObfuscatedName("alp.w")
	public final Queue field11710 = new LinkedList();

	@ObfuscatedName("alp.i(Lasp;B)V")
	public void method18343(class1188 arg0) {
		this.field11710.add(arg0);
		if (this.field11710.size() > 10) {
			this.field11710.poll();
		}
	}

	@ObfuscatedName("alp.l(I)V")
	public void method10270() {
		class1188 var1 = (class1188) this.field11710.poll();
		if (var1 == null) {
			return;
		}
		class983 var2 = Statics.method1604(class390.field3688, client.field10849.field794);
		var2.field11432.method17886(var1.method17831() | var1.method17832() << 16);
		var2.field11432.method18081(this.method10262(var1, 65535));
		var2.field11432.method17937(var1.method19539() << 1 | var1.method19537() & 0x1);
		client.field10849.method934(var2);
		var1.method17835();
	}

	@ObfuscatedName("alp.u(I)Z")
	public boolean method10272() {
		return !this.field11710.isEmpty() || this.field7953 < class213.method3655() - 2000L;
	}

	@ObfuscatedName("alp.z(S)Lakl;")
	public class983 method10267() {
		return Statics.method1604(class390.field3687, client.field10849.field794);
	}

	@ObfuscatedName("alp.j(Lalw;Lasp;I)V")
	public void method18345(class997 arg0, class1188 arg1) {
		arg0.method18001(arg1.method19537());
	}

	@ObfuscatedName("alp.f(I)I")
	public int method10263() {
		return 1;
	}

	@ObfuscatedName("alp.w(Lalw;Lakm;I)V")
	public void method10264(class997 arg0, class993 arg1) {
		this.method18345(arg0, (class1188) arg1);
	}
}
