package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@ObfuscatedName("atb")
public class class1229 extends class1181 {

	@ObfuscatedName("atb.p")
	public Future field12562;

	@ObfuscatedName("atb.d")
	public final int field12563;

	public class1229(int arg0) {
		this.field12563 = arg0;
	}

	@ObfuscatedName("atb.l(Ljava/util/concurrent/Future;B)V")
	public void method19716(Future arg0) {
		this.field12562 = arg0;
	}

	@ObfuscatedName("atb.e(I)[B")
	public byte[] method19444() {
		if (this.field12562.isDone()) {
			try {
				return ((class441) this.field12562.get()).method6872();
			} catch (InterruptedException var3) {
				var3.printStackTrace();
			} catch (ExecutionException var4) {
				var4.printStackTrace();
			}
		}
		return null;
	}

	@ObfuscatedName("atb.n(I)I")
	public int method19446() {
		if (this.field12562 == null) {
			return 0;
		} else if (this.field12562.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}
}
