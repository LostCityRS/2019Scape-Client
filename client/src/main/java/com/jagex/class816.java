package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aez")
public class class816 extends class74 {

	@ObfuscatedName("aez.k")
	public class73 field9291;

	@ObfuscatedName("aez.f")
	public boolean field9294 = false;

	public class816(class849 arg0) {
		super(arg0);
		if (arg0.field9952) {
			this.field9291 = new class73(arg0, 2);
			this.field9291.method1245(0);
			this.field1021.method15776(1);
			this.field1021.method15810(34165, 7681);
			this.field1021.method15780(2, 34168, 770);
			this.field1021.method15781(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.field1021.method15776(0);
			this.field9291.method1243();
			this.field9291.method1245(1);
			this.field1021.method15776(1);
			this.field1021.method15810(8448, 8448);
			this.field1021.method15780(2, 34166, 770);
			this.field1021.method15781(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.field1021.method15776(0);
			this.field9291.method1243();
		}
	}

	@ObfuscatedName("aez.e()Z")
	public boolean method1252() {
		return true;
	}

	@ObfuscatedName("aez.n(Z)V")
	public void method1263(boolean arg0) {
		class813 var2 = this.field1021.method15760();
		if (this.field9291 == null || var2 == null || !arg0) {
			this.field1021.method15781(0, 34168, 770);
			return;
		}
		this.field9291.method1246('\u0000');
		this.field1021.method15776(1);
		this.field1021.method15777(var2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.field1021.field9904.method6633(this.field1021.field9844), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.field1021.method15776(0);
		this.field9294 = true;
	}

	@ObfuscatedName("aez.m(Z)V")
	public void method1254(boolean arg0) {
		this.field1021.method15810(8448, 7681);
	}

	@ObfuscatedName("aez.k()V")
	public void method1255() {
		if (this.field9294) {
			this.field9291.method1246('\u0001');
			this.field1021.method15776(1);
			this.field1021.method15777(null);
			this.field1021.method15776(0);
		} else {
			this.field1021.method15781(0, 5890, 770);
		}
		this.field1021.method15810(8448, 8448);
		this.field9294 = false;
	}

	@ObfuscatedName("aez.f(II)V")
	public void method1256(int arg0, int arg1) {
	}

	@ObfuscatedName("aez.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
		this.field1021.method15777(arg0);
		this.field1021.method15778(arg1);
	}
}
