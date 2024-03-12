package com.jagex.game.network;

import rs2.client.Client;
import com.jagex.core.datastruct.IterableQueue;
import com.jagex.encryption.Isaac;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.PingProvider;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.network.protocol.ServerProt;
import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("ax")
public class ServerConnection {

	@ObfuscatedName("ax.e")
	public Stream field800;

	@ObfuscatedName("ax.n")
	public IterableQueue field803 = new IterableQueue();

	@ObfuscatedName("ax.m")
	public int field791 = 0;

	@ObfuscatedName("ax.k")
	public Packet field792 = new Packet(1700);

	@ObfuscatedName("ax.f")
	public Isaac field794;

	@ObfuscatedName("ax.w")
	public PacketBit field795 = new PacketBit(40000);

	@ObfuscatedName("ax.l")
	public Isaac field809;

	@ObfuscatedName("ax.u")
	public ServerProt field796 = null;

	@ObfuscatedName("ax.z")
	public int field797 = 0;

	@ObfuscatedName("ax.p")
	public boolean field799 = true;

	@ObfuscatedName("ax.d")
	public int field789 = 0;

	@ObfuscatedName("ax.c")
	public int field793 = 0;

	@ObfuscatedName("ax.r")
	public int field801;

	@ObfuscatedName("ax.v")
	public int field802;

	@ObfuscatedName("ax.o")
	public int field798;

	@ObfuscatedName("ax.s")
	public int field804;

	@ObfuscatedName("ax.y")
	public ServerProt field790;

	@ObfuscatedName("ax.q")
	public ServerProt field806;

	@ObfuscatedName("ax.x")
	public ServerProt field805;

	@ObfuscatedName("ax.b")
	public boolean field808 = false;

	@ObfuscatedName("ax.h")
	public PingProvider field807 = new PingProvider();

	public ServerConnection() {
		Thread var1 = new Thread(this.field807);
		var1.setDaemon(true);
		var1.setPriority(1);
		var1.start();
	}

	@ObfuscatedName("ax.e(I)V")
	public final void method952() {
		this.field803.method14152();
		this.field791 = 0;
	}

	@ObfuscatedName("ax.n(B)V")
	public final void method933() throws IOException {
		if (this.field800 == null || this.field791 <= 0) {
			return;
		}
		this.field792.pos = 0;
		while (true) {
			ClientMessage var1 = (ClientMessage) this.field803.method14191();
			if (var1 == null || var1.field11430 > this.field792.data.length - this.field792.pos) {
				this.field800.method9030(this.field792.data, 0, this.field792.pos);
				this.field801 += this.field792.pos;
				this.field793 = 0;
				break;
			}
			this.field792.pdata(var1.field11432.data, 0, var1.field11430);
			this.field791 -= var1.field11430;
			var1.method8440();
			var1.field11432.release();
			var1.method17793();
		}
	}

	@ObfuscatedName("ax.m(Lakl;I)V")
	public final void method934(ClientMessage arg0) {
		this.field803.method14153(arg0);
		arg0.field11430 = arg0.field11432.pos;
		arg0.field11432.pos = 0;
		this.field791 += arg0.field11430;
	}

	@ObfuscatedName("ax.k(I)V")
	public void method946() {
		if (Client.field10903 % 50 == 0) {
			this.field798 = this.field801;
			this.field801 = 0;
			this.field804 = this.field802;
			this.field802 = 0;
		}
	}

	@ObfuscatedName("ax.f(Luz;Ljava/lang/String;I)V")
	public void method936(Stream arg0, String arg1) {
		this.field800 = arg0;
		this.field807.method115(arg1);
	}

	@ObfuscatedName("ax.w(B)V")
	public void method938() {
		if (this.field800 != null) {
			this.field800.method9031();
			this.field800 = null;
		}
		this.field807.method115(null);
	}

	@ObfuscatedName("ax.l(B)V")
	public void method941() {
		this.field800 = null;
		this.field807.method115(null);
	}

	@ObfuscatedName("ax.u(B)Luz;")
	public Stream method939() {
		return this.field800;
	}
}
