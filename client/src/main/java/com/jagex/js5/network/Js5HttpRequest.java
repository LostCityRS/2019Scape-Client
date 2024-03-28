package com.jagex.js5.network;

import com.jagex.js5.Js5Request;
import deob.ObfuscatedName;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@ObfuscatedName("atb")
public class Js5HttpRequest extends Js5Request {

	@ObfuscatedName("atb.p")
	public Future futureResponse;

	@ObfuscatedName("atb.d")
	public final int padding;

	public Js5HttpRequest(int padding) {
		this.padding = padding;
	}

	@ObfuscatedName("atb.l(Ljava/util/concurrent/Future;B)V")
	public void setFutureResponse(Future futureResponse) {
		this.futureResponse = futureResponse;
	}

	@ObfuscatedName("atb.e(I)[B")
	public byte[] getBytes() {
		if (this.futureResponse.isDone()) {
			try {
				return ((Js5HttpClient.Js5HTTPClientResponse) this.futureResponse.get()).getResponseBytes();
			} catch (InterruptedException var3) {
				var3.printStackTrace();
			} catch (ExecutionException var4) {
				var4.printStackTrace();
			}
		}
		return null;
	}

	@ObfuscatedName("atb.n(I)I")
	public int getPercentageComplete() {
		if (this.futureResponse == null) {
			return 0;
		} else if (this.futureResponse.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}
}
