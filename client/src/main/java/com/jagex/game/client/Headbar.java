package com.jagex.game.client;

import com.jagex.core.datastruct.Link;
import com.jagex.core.datastruct.LinkQueue;
import com.jagex.game.config.headbartype.HeadbarType;
import deob.ObfuscatedName;
import deob.Statics;
import rs2.client.Client;

@ObfuscatedName("aji")
public class Headbar extends Link {

	@ObfuscatedName("aji.m")
	public HeadbarType field11215;

	@ObfuscatedName("aji.k")
	public LinkQueue field11214 = new LinkQueue();

	public Headbar(HeadbarType arg0) {
		this.field11215 = arg0;
	}

	@ObfuscatedName("aji.n(IIIIB)V")
	public void method17456(int arg0, int arg1, int arg2, int arg3) {
		HeadbarUpdate var5 = null;
		int var6 = 0;
		for (HeadbarUpdate var7 = (HeadbarUpdate) this.field11214.method14254(); var7 != null; var7 = (HeadbarUpdate) this.field11214.method14241()) {
			var6++;
			if (var7.field11219 == arg0) {
				var7.method17464(arg0, arg1, arg2, arg3);
				return;
			}
			if (var7.field11219 <= arg0) {
				var5 = var7;
			}
		}
		if (var5 != null) {
			Statics.method15212(new HeadbarUpdate(arg0, arg1, arg2, arg3), var5);
			if (var6 >= Client.field11389.field7719) {
				this.field11214.method14254().method8433();
			}
		} else if (var6 < Client.field11389.field7719) {
			this.field11214.method14244(new HeadbarUpdate(arg0, arg1, arg2, arg3));
		}
	}

	@ObfuscatedName("aji.m(II)Lajc;")
	public HeadbarUpdate method17457(int arg0) {
		HeadbarUpdate var2 = (HeadbarUpdate) this.field11214.method14254();
		if (var2 == null || var2.field11219 > arg0) {
			return null;
		}
		for (HeadbarUpdate var3 = (HeadbarUpdate) this.field11214.method14241(); var3 != null && var3.field11219 <= arg0; var3 = (HeadbarUpdate) this.field11214.method14241()) {
			var2.method8433();
			var2 = var3;
		}
		if (this.field11215.field7227 + var2.field11219 + var2.field11217 > arg0) {
			return var2;
		} else {
			var2.method8433();
			return null;
		}
	}

	@ObfuscatedName("aji.k(I)Z")
	public boolean method17461() {
		return this.field11214.method14248();
	}
}
