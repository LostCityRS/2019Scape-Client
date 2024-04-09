package com.jagex.js5.network;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("pp")
public abstract class Js5TcpClient {

	@ObfuscatedName("pp.l")
	public SecondaryLinkedList urgent = new SecondaryLinkedList();

	@ObfuscatedName("pp.u")
	public SecondaryLinkedList urgentRequested = new SecondaryLinkedList();

	@ObfuscatedName("pp.z")
	public SecondaryLinkedList prefetch = new SecondaryLinkedList();

	@ObfuscatedName("pp.p")
	public SecondaryLinkedList prefetchRequested = new SecondaryLinkedList();

	@ObfuscatedName("pp.d")
	public int delay;

	@ObfuscatedName("pp.c")
	public long lastTimestamp;

	@ObfuscatedName("pp.r")
	public Packet out = new Packet(6);

	@ObfuscatedName("pp.v")
	public byte xorcode = 0;

	@ObfuscatedName("pp.o")
	public volatile int errorCount = 0;

	@ObfuscatedName("pp.s")
	public volatile int js5State = 0;

	@ObfuscatedName("pp.y")
	public volatile int archive = -1;

	@ObfuscatedName("pp.q")
	public volatile int group = -1;

	@ObfuscatedName("pp.x")
	public Packet client = new Packet(5);

	@ObfuscatedName("pp.b")
	public Packet server = new Packet(5);

	@ObfuscatedName("pp.h")
	public int outPos = 0;

	@ObfuscatedName("pp.a")
	public Js5NetRequest currentRequest = null;

	@ObfuscatedName("pp.e(IIBZI)Lauq;")
	public Js5NetRequest queueRequest(int archive, int group, byte off, boolean urgent) {
		long uid = ((long) archive << 32) + (long) group;
		Js5NetRequest request = new Js5NetRequest();
		request.secondaryNodeId = uid;
		request.offset = off;
		request.urgent = urgent;

		if (urgent) {
			if (this.getTotalUrgents() >= 500) {
				throw new RuntimeException("Urgent list exceeded max limit of 500");
			}

			this.urgent.pushBack(request);
		} else if (this.getTotalPrefetches() < 500) {
			this.prefetch.pushBack(request);
		} else {
			throw new RuntimeException("Prefetch list exceeded max limit of 500");
		}

		return request;
	}

	@ObfuscatedName("pp.n(I)Z")
	public boolean isPrefetchesFull() {
		return this.getTotalPrefetches() >= 500;
	}

	@ObfuscatedName("pp.m(I)Z")
	public boolean isUrgentsFull() {
		return this.getTotalUrgents() >= 500;
	}

	@ObfuscatedName("pp.k(I)I")
	public int getTotalPrefetches() {
		return this.prefetch.length() + this.prefetchRequested.length();
	}

	@ObfuscatedName("pp.f(I)I")
	public int getTotalUrgents() {
		return this.urgent.length() + this.urgentRequested.length();
	}

	@ObfuscatedName("pp.z(ZI)V")
	public abstract void sendLoginStatus(boolean isLoggedIn);

	@ObfuscatedName("pp.p(I)V")
	public abstract void sendCloseStream();

	@ObfuscatedName("pp.w(IIB)V")
	public abstract void error(int archive, int group);

	@ObfuscatedName("pp.l(I)Z")
	public abstract boolean process();

	@ObfuscatedName("pp.u(Ljava/lang/Object;ZI)V")
	public abstract void createNewJs5Stream(Object stream, boolean isLoggedIn);

	@ObfuscatedName("pp.d(I)V")
	public abstract void closeGracefully();

	@ObfuscatedName("pp.c(I)V")
	public abstract void closeForcefully();
}
