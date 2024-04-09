package com.jagex.game.world.entity;

import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GraphEntity;
import deob.ObfuscatedName;

import java.util.Stack;

@ObfuscatedName("tl")
public class PickableEntity {

	@ObfuscatedName("tl.e")
	public static Stack stack = new Stack();

	@ObfuscatedName("tl.n")
	public GraphEntity field6978;

	@ObfuscatedName("tl.m")
	public boolean active;

	@ObfuscatedName("tl.k")
	public PickableEntityList pickables;

	@ObfuscatedName("ahe.e(ZI)Ltl;")
	public static PickableEntity getPickableEntity(boolean arg0) {
		Stack var1 = stack;
		synchronized (stack) {
			PickableEntity var2;
			if (stack.isEmpty()) {
				var2 = new PickableEntity();
			} else {
				var2 = (PickableEntity) stack.pop();
			}
			var2.active = arg0;
			return var2;
		}
	}

	@ObfuscatedName("gz.n(Ltl;B)V")
	public static void pushPickableEntity(PickableEntity arg0) {
		arg0.field6978 = null;
		Stack var1 = stack;
		synchronized (stack) {
			if (stack.size() < 200) {
				stack.push(arg0);
			}
		}
	}

	@ObfuscatedName("acc.m(S)V")
	public static void resetStack() {
		Stack var0 = stack;
		synchronized (stack) {
			stack = new Stack();
		}
	}

	@ObfuscatedName("tl.k(Ldh;III)Z")
	public boolean method8889(Toolkit arg0, int arg1, int arg2) {
		int var4 = this.field6978.getPickSizeShift();
		if (this.field6978.entityBounds != null) {
			for (int var5 = 0; var5 < this.field6978.entityBounds.length; var5++) {
				this.field6978.entityBounds[var5].field1687 <<= var4;
				if (this.field6978.entityBounds[var5].method2742(this.pickables.field6886 + arg1, this.pickables.field6887 + arg2) && this.field6978.method17375(arg0, arg1, arg2)) {
					this.field6978.entityBounds[var5].field1687 >>= var4;
					return true;
				}
				this.field6978.entityBounds[var5].field1687 >>= var4;
			}
		}
		return false;
	}
}
