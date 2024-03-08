package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.awt.Point;

@ObfuscatedName("asp")
public class class1188 extends class993 {

	@ObfuscatedName("asp.x")
	public int field12424;

	@ObfuscatedName("asp.av")
	public static class1188[] field12413 = new class1188[0];

	@ObfuscatedName("asp.ay")
	public int field12420;

	@ObfuscatedName("asp.ab")
	public int field12407;

	@ObfuscatedName("asp.az")
	public long field12422;

	@ObfuscatedName("asp.aa")
	public int field12419;

	@ObfuscatedName("ajq.ae(IIIIB)Lasp;")
	public static class1188 method17446(int arg0, int arg1, int arg2, int arg3) {
		class1188[] var4 = field12413;
		synchronized (field12413) {
			class1188 var5;
			if (Statics.field7658 == 0) {
				var5 = new class1188();
			} else {
				var5 = field12413[--Statics.field7658];
			}
			var5.field12419 = arg0;
			var5.field12424 = arg1;
			var5.field12420 = arg2;
			var5.field12407 = arg3;
			var5.field12422 = class213.method3655();
			return var5;
		}
	}

	@ObfuscatedName("asp.l(B)V")
	public void method17835() {
		class1188[] var1 = field12413;
		synchronized (field12413) {
			if (Statics.field7658 < Statics.field2364 - 1) {
				field12413[++Statics.field7658 - 1] = this;
			}
		}
	}

	@ObfuscatedName("asp.ag(I)I")
	public int method19537() {
		return this.field12407;
	}

	@ObfuscatedName("asp.ah(I)I")
	public int method19539() {
		return this.field12420;
	}

	@ObfuscatedName("asp.al(I)Z")
	public boolean method19540() {
		switch(this.field12420) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@ObfuscatedName("asp.k(I)I")
	public int method17833() {
		switch(this.field12420) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@ObfuscatedName("asp.e(I)I")
	public int method17848() {
		switch(this.field12420) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@ObfuscatedName("asp.ac(Ljava/awt/Point;I)V")
	public void method19541(Point arg0) {
		this.field12419 -= arg0.x;
		this.field12424 -= arg0.y;
	}

	@ObfuscatedName("asp.f(B)J")
	public long method17834() {
		return this.field12422;
	}

	@ObfuscatedName("asp.n(I)I")
	public int method17831() {
		return this.field12419;
	}

	@ObfuscatedName("asp.m(B)I")
	public int method17832() {
		return this.field12424;
	}
}
