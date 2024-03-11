package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.graphics.runetek5.Renderer;
import deob.ObfuscatedName;
import deob.Statics;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ta")
public class HintTrail {

	@ObfuscatedName("ta.e")
	public static int field6755 = 0;

	@ObfuscatedName("ta.n")
	public final int field6749;

	@ObfuscatedName("ta.m")
	public final int field6751;

	@ObfuscatedName("ta.k")
	public final int[] field6750;

	@ObfuscatedName("ta.f")
	public final int[] field6753;

	@ObfuscatedName("ta.w")
	public Model field6754;

	@ObfuscatedName("ta.l")
	public LinkedList field6752;

	@ObfuscatedName("ta.u")
	public boolean field6756;

	public HintTrail(Renderer arg0, Packet arg1, int arg2) {
		this.field6749 = arg2;
		this.field6751 = arg1.gSmart1or2s();
		this.field6750 = new int[this.field6751];
		this.field6753 = new int[this.field6751];
		int var4 = arg1.g2();
		int var5 = arg1.g2();
		for (int var6 = 0; var6 < this.field6751; var6++) {
			this.field6750[var6] = var4 + arg1.g1b();
			this.field6753[var6] = var5 + arg1.g1b();
		}
		this.field6754 = this.method8402(arg0);
	}

	@ObfuscatedName("ta.e(Ldh;S)Ldo;")
	public Model method8402(Renderer arg0) {
		ModelUnlit var2 = ModelUnlit.method1931(Statics.field9213, this.field6749, 0);
		if (var2 == null) {
			return null;
		} else {
			if (var2.field1372 < 13) {
				var2.method1947(2);
			}
			return arg0.method2211(var2, 2048, field6755, 64, 768);
		}
	}

	@ObfuscatedName("ta.n(Ltx;B)V")
	public void method8412(Scene arg0) {
		if (arg0 == null || this.field6751 <= 0) {
			return;
		}
		this.method8405(arg0);
		Iterator var2 = this.field6752.iterator();
		while (var2.hasNext()) {
			HintTrailPoint var3 = (HintTrailPoint) var2.next();
			arg0.method8768(var3, false);
		}
		this.field6756 = true;
	}

	@ObfuscatedName("ta.m(Ltx;B)V")
	public void method8404(Scene arg0) {
		if (arg0 == null || this.field6752 == null) {
			return;
		}
		Iterator var2 = this.field6752.iterator();
		while (var2.hasNext()) {
			HintTrailPoint var3 = (HintTrailPoint) var2.next();
			arg0.method8712(var3.field11717, var3.field12471, var3.field12468, new HintTrailPointPrimaryLayerEntityPredicate(var3));
		}
	}

	@ObfuscatedName("ta.k(Ltx;B)V")
	public void method8405(Scene arg0) {
		this.field6752 = new LinkedList();
		LinkMap var2 = client.world.method7793();
		CoordGrid var3 = client.world.method7727();
		CoordGrid var4 = new CoordGrid(Statics.field4826, this.field6750[0], this.field6753[0]);
		for (int var5 = 1; var5 < this.field6751; var5++) {
			CoordGrid var6 = new CoordGrid(Statics.field4826, this.field6750[var5], this.field6753[var5]);
			while (var4.field7426 != var6.field7426 || var4.field7427 != var6.field7427) {
				if (var4.field7426 < var6.field7426) {
					var4.field7426++;
				} else if (var4.field7426 > var6.field7426) {
					var4.field7426--;
				}
				if (var4.field7427 < var6.field7427) {
					var4.field7427++;
				} else if (var4.field7427 > var6.field7427) {
					var4.field7427--;
				}
				int var7 = Statics.field4826;
				int var8 = var4.field7426 - var3.field7426;
				int var9 = var4.field7427 - var3.field7427;
				if (var8 >= 0 && var8 < arg0.field6910 && var9 >= 0 && var9 < arg0.field6911) {
					int var10 = (var8 << 9) + 256;
					int var11 = (var9 << 9) + 256;
					if (var2.method7105(var8, var9)) {
						var7++;
					}
					this.field6752.add(new HintTrailPoint(arg0, this, Statics.field4826, var7, var10, client.method3660(var10, var11, Statics.field4826), var11));
				}
			}
			var4 = var6;
		}
	}

	@ObfuscatedName("qo.f(II)V")
	public static void method7309(int arg0) {
		field6755 = arg0;
	}

	@ObfuscatedName("ta.w(I)V")
	public void method8406() {
		this.field6756 = false;
		this.field6754 = null;
	}

	@ObfuscatedName("ta.l(I)Z")
	public boolean method8407() {
		return this.field6756;
	}

	@ObfuscatedName("ta.u(Ldh;I)Z")
	public boolean method8408(Renderer arg0) {
		this.field6754 = this.method8402(arg0);
		return this.field6754 != null;
	}
}
