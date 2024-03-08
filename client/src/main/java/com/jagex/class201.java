package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("gx")
public class class201 {

	@ObfuscatedName("gx.e")
	public final long field1945;

	@ObfuscatedName("gx.n")
	public final class190 field1943;

	@ObfuscatedName("gx.m")
	public int field1944 = -1;

	@ObfuscatedName("gx.k")
	public LinkedList field1942 = new LinkedList();

	public class201(Packet arg0, class190 arg1) {
		this.field1943 = arg1;
		this.field1945 = arg0.g8();
		this.field1944 = arg0.g4s();
		for (int var3 = arg0.g1(); var3 != 0; var3 = arg0.g1()) {
			class205 var4 = (class205) class686.method1897(class205.method3580(), var3);
			Object var5;
			switch(var4.field1955) {
				case 0:
					var5 = new class195(this, arg0);
					break;
				case 1:
					var5 = new class206(this, arg0);
					break;
				case 2:
					var5 = new class207(this, arg0);
					break;
				case 3:
					var5 = new class192(this, arg0);
					break;
				case 4:
					var5 = new class186(this, arg0);
					break;
				case 5:
					var5 = new class194(this);
					break;
				case 6:
					var5 = new class193(this, arg0);
					break;
				case 7:
					var5 = new class198(this, arg0);
					break;
				case 8:
					var5 = new class199(this, arg0);
					break;
				case 9:
					var5 = new class187(this, arg0);
					break;
				case 10:
					var5 = new class189(this, arg0);
					break;
				case 11:
					var5 = new class200(this, arg0);
					break;
				case 12:
					var5 = new class208(this, arg0);
					break;
				case 13:
					var5 = new class204(this);
					break;
				default:
					throw new IllegalStateException("");
			}
			this.field1942.add(var5);
		}
	}

	@ObfuscatedName("gx.e(Lgq;I)V")
	public void method3555(class191 arg0) {
		if (this.field1945 != arg0.field1902 || arg0.method3384() != this.field1944) {
			throw new IllegalStateException("");
		}
		Iterator var2 = this.field1942.iterator();
		while (var2.hasNext()) {
			class203 var3 = (class203) var2.next();
			var3.method3371(arg0);
		}
		arg0.method3413();
	}
}
