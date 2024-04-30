package com.jagex.core.utils;

import com.jagex.core.io.Packet;
import com.jagex.game.client.FileOnDisk;
import com.jagex.game.client.GameShell;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("h")
public class TotpPreferences {

	@ObfuscatedName("h.m")
	public LinkedHashMap field600;

	public TotpPreferences() {
		this((Packet) null);
	}

	public TotpPreferences(Packet arg0) {
		this.field600 = new LinkedHashMap();
		if (arg0 != null && arg0.data != null) {
			int var2 = arg0.g1();
			if (var2 > 0 && var2 <= 1) {
				int var3 = arg0.g1();
				for (int var4 = 0; var4 < var3; var4++) {
					long var5 = arg0.g8();
					int var7 = arg0.g4s();
					this.field600.put(var5, var7);
				}
			}
		}
	}

	@ObfuscatedName("h.e(Lalw;B)V")
	public void method580(Packet arg0) {
		arg0.p1(1);
		arg0.p1(this.field600.size());
		Iterator var2 = this.field600.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = (Entry) var2.next();
			arg0.p8((Long) var3.getKey());
			arg0.p4((Integer) var3.getValue());
		}
	}

	@ObfuscatedName("h.n(JII)V")
	public void method590(long arg0, int arg1) {
		if (this.field600.size() >= 10 && !this.field600.containsKey(arg0)) {
			Iterator var4 = this.field600.entrySet().iterator();
			var4.next();
			var4.remove();
		}
		this.field600.put(arg0, arg1);
		this.method578();
	}

	@ObfuscatedName("h.m(J)Z")
	public boolean containsKey(long arg0) {
		return this.field600.containsKey(arg0);
	}

	@ObfuscatedName("h.k(J)I")
	public int getValue(long key) {
		return (Integer) this.field600.get(key);
	}

	@ObfuscatedName("ane.f(I)Lh;")
	public static TotpPreferences method18618() {
		FileOnDisk var0 = null;
		TotpPreferences var7;
		try {
			var0 = GameShell.openPrefs("3", Client.modegame.titleURL, false);
			byte[] var1 = new byte[(int) var0.length()];
			int var3;
			for (int var2 = 0; var2 < var1.length; var2 += var3) {
				var3 = var0.read(var1, var2, var1.length - var2);
				if (var3 == -1) {
					throw new EOFException();
				}
			}
			TotpPreferences var4 = new TotpPreferences(new Packet(var1));
			return var4;
		} catch (Exception var17) {
			var7 = new TotpPreferences();
		} finally {
			try {
				if (var0 != null) {
					var0.close();
				}
			} catch (Exception var16) {
			}
		}
		return var7;
	}

	@ObfuscatedName("h.w(B)V")
	public void method578() {
		FileOnDisk var1 = null;
		try {
			var1 = GameShell.openPrefs("3", Client.modegame.titleURL, true);
			Packet var2 = new Packet(5000);
			this.method580(var2);
			var1.write(var2.data, 0, var2.pos);
		} catch (Exception var14) {
		} finally {
			try {
				if (var1 != null) {
					var1.close();
				}
			} catch (Exception var13) {
			}
		}
	}
}
