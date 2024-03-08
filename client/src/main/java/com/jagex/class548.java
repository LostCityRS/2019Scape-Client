package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@ObfuscatedName("tg")
public class class548 {

	@ObfuscatedName("tg.e")
	public List field6885 = new LinkedList();

	@ObfuscatedName("tg.n")
	public boolean field6884 = false;

	@ObfuscatedName("tg.m")
	public int field6886 = 0;

	@ObfuscatedName("tg.k")
	public int field6887 = 0;

	public class548(boolean arg0) {
		this.field6884 = arg0;
	}

	@ObfuscatedName("tg.e(I)V")
	public void method8680() {
		Iterator var1 = this.field6885.iterator();
		while (var1.hasNext()) {
			class552 var2 = (class552) var1.next();
			var1.remove();
			Statics.method3657(var2);
		}
	}

	@ObfuscatedName("tg.n(Ltl;B)V")
	public void method8683(class552 arg0) {
		class1019 var2 = arg0.field6978;
		boolean var3 = true;
		class141[] var4 = arg0.field6978.field11713;
		for (int var5 = 0; var5 < var4.length; var5++) {
			if (var4[var5].field1686) {
				var3 = false;
				break;
			}
		}
		if (var3) {
			return;
		}
		arg0.field6980 = this;
		if (this.field6884) {
			Iterator var6 = this.field6885.iterator();
			while (var6.hasNext()) {
				class552 var7 = (class552) var6.next();
				if (var7.field6978 == var2) {
					var6.remove();
					Statics.method3657(var7);
				}
			}
		}
		ListIterator var8 = this.field6885.listIterator();
		class552 var9;
		do {
			if (!var8.hasNext()) {
				this.field6885.add(arg0);
				return;
			}
			var9 = (class552) var8.next();
		} while (var2.field11715 < var9.field6978.field11715);
		var8.previous();
		var8.add(arg0);
	}
}
