package com.jagex.game;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;

@ObfuscatedName("arn")
public class MiniMenuSubMenu extends SecondaryNode {

	@ObfuscatedName("arn.l")
	public final String field12311;

	@ObfuscatedName("arn.u")
	public final SecondaryLinkedList field12312;

	@ObfuscatedName("arn.z")
	public int field12310;

	public MiniMenuSubMenu(String arg0) {
		this.field12311 = arg0;
		this.field12312 = new SecondaryLinkedList();
	}

	@ObfuscatedName("arn.e(I)I")
	public int method19375() {
		return this.field12312.head.secondaryPrev == this.field12312.head ? -1 : ((MiniMenuEntry) this.field12312.head.secondaryPrev).menuAction;
	}

	@ObfuscatedName("arn.n(Larm;I)Z")
	public boolean method19373(MiniMenuEntry arg0) {
		boolean var2 = true;
		arg0.secondaryRemove();
		MiniMenuEntry var3 = (MiniMenuEntry) this.field12312.peekFront();
		while (var3 != null) {
			if (MiniMenu.method18853(arg0.menuAction, var3.menuAction)) {
				SecondaryLinkedList.pushNodeBack(arg0, var3);
				this.field12310++;
				return !var2;
			}
			var3 = (MiniMenuEntry) this.field12312.prev();
			var2 = false;
		}
		this.field12312.pushBack(arg0);
		this.field12310++;
		return var2;
	}

	@ObfuscatedName("arn.m(Larm;S)Z")
	public boolean method19374(MiniMenuEntry arg0) {
		int var2 = this.method19375();
		arg0.secondaryRemove();
		this.field12310--;
		if (this.field12310 != 0) {
			return var2 != this.method19375();
		}
		this.unlink();
		this.secondaryRemove();
		MiniMenu.field543--;
		MiniMenu.field534.put(this, arg0.field12305);
		return false;
	}
}
