package com.jagex.graphics;

import com.jagex.core.datastruct.DualIterableQueue;
import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;

@ObfuscatedName("arn")
public class MinimenuSubmenu extends SecondaryNode {

	@ObfuscatedName("arn.l")
	public final String field12311;

	@ObfuscatedName("arn.u")
	public final DualIterableQueue field12312;

	@ObfuscatedName("arn.z")
	public int field12310;

	public MinimenuSubmenu(String arg0) {
		this.field12311 = arg0;
		this.field12312 = new DualIterableQueue();
	}

	@ObfuscatedName("arn.e(I)I")
	public int method19375() {
		return this.field12312.head.secondaryPrev == this.field12312.head ? -1 : ((MinimenuEntry) this.field12312.head.secondaryPrev).field12307;
	}

	@ObfuscatedName("arn.n(Larm;I)Z")
	public boolean method19373(MinimenuEntry arg0) {
		boolean var2 = true;
		arg0.secondaryRemove();
		MinimenuEntry var3 = (MinimenuEntry) this.field12312.peekFront();
		while (var3 != null) {
			if (MiniMenu.method18853(arg0.field12307, var3.field12307)) {
				DualIterableQueue.pushNodeBack(arg0, var3);
				this.field12310++;
				return !var2;
			}
			var3 = (MinimenuEntry) this.field12312.prev();
			var2 = false;
		}
		this.field12312.pushBack(arg0);
		this.field12310++;
		return var2;
	}

	@ObfuscatedName("arn.m(Larm;S)Z")
	public boolean method19374(MinimenuEntry arg0) {
		int var2 = this.method19375();
		arg0.secondaryRemove();
		this.field12310--;
		if (this.field12310 != 0) {
			return var2 != this.method19375();
		}
		this.remove();
		this.secondaryRemove();
		MiniMenu.field543--;
		MiniMenu.field534.put(this, arg0.field12305);
		return false;
	}
}
