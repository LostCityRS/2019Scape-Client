package com.jagex.game.world.entity;

import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.graphics.scenegraph.GraphEntity;
import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@ObfuscatedName("tg")
public class PickableEntityList {

	@ObfuscatedName("tg.e")
	public List field6885 = new LinkedList();

	@ObfuscatedName("tg.n")
	public boolean field6884 = false;

	@ObfuscatedName("tg.m")
	public int field6886 = 0;

	@ObfuscatedName("tg.k")
	public int field6887 = 0;

	public PickableEntityList(boolean arg0) {
		this.field6884 = arg0;
	}

	@ObfuscatedName("tg.e(I)V")
	public void method8680() {
		Iterator var1 = this.field6885.iterator();
		while (var1.hasNext()) {
			PickableEntity var2 = (PickableEntity) var1.next();
			var1.remove();
			PickableEntity.pushPickableEntity(var2);
		}
	}

	@ObfuscatedName("tg.n(Ltl;B)V")
	public void method8683(PickableEntity arg0) {
		GraphEntity var2 = arg0.field6978;
		boolean var3 = true;
		ScreenBoundingBox[] var4 = arg0.field6978.entityBounds;
		for (int var5 = 0; var5 < var4.length; var5++) {
			if (var4[var5].field1686) {
				var3 = false;
				break;
			}
		}
		if (var3) {
			return;
		}
		arg0.pickables = this;
		if (this.field6884) {
			Iterator var6 = this.field6885.iterator();
			while (var6.hasNext()) {
				PickableEntity var7 = (PickableEntity) var6.next();
				if (var7.field6978 == var2) {
					var6.remove();
					PickableEntity.pushPickableEntity(var7);
				}
			}
		}
		ListIterator var8 = this.field6885.listIterator();
		PickableEntity var9;
		do {
			if (!var8.hasNext()) {
				this.field6885.add(arg0);
				return;
			}
			var9 = (PickableEntity) var8.next();
		} while (var2.field11715 < var9.field6978.field11715);
		var8.previous();
		var8.add(arg0);
	}
}
