package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.zip.Inflater;

@ObfuscatedName("adv")
public class class804 {

	@ObfuscatedName("adv.e")
	public Inflater field9252;

	public class804() {
		this(-1, 1000000, 1000000);
	}

	public class804(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("adv.e([BI)[B")
	public byte[] method15246(byte[] arg0) {
		class997 var2 = new class997(arg0);
		var2.field11503 = (arg0.length - 4) * -1445626955;
		int var3 = var2.method17911();
		byte[] var4 = new byte[var3];
		var2.field11503 = 0;
		this.method15245(var2, var4);
		return var4;
	}

	@ObfuscatedName("adv.n(Lalw;[BS)V")
	public void method15245(class997 arg0, byte[] arg1) {
		if (arg0.field11502[arg0.field11503 * 212851357] != 31 || arg0.field11502[arg0.field11503 * 212851357 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.field9252 == null) {
			this.field9252 = new Inflater(true);
		}
		try {
			this.field9252.setInput(arg0.field11502, arg0.field11503 * 212851357 + 10, arg0.field11502.length - (arg0.field11503 * 212851357 + 10 + 8));
			this.field9252.inflate(arg1);
		} catch (Exception var4) {
			this.field9252.reset();
			throw new RuntimeException("");
		}
		this.field9252.reset();
	}
}
