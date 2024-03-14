package com.jagex.game.network;

import com.jagex.core.datastruct.IterableQueue;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.PingProvider;
import com.jagex.encryption.Isaac;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.network.protocol.ServerProt;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.IOException;

@ObfuscatedName("ax")
public class ServerConnection {

	@ObfuscatedName("ax.e")
	public Stream stream;

	@ObfuscatedName("ax.n")
	public IterableQueue field803 = new IterableQueue();

	@ObfuscatedName("ax.m")
	public int field791 = 0;

	@ObfuscatedName("ax.k")
	public Packet field792 = new Packet(1700);

	@ObfuscatedName("ax.f")
	public Isaac field794;

	@ObfuscatedName("ax.w")
	public PacketBit in = new PacketBit(40000);

	@ObfuscatedName("ax.l")
	public Isaac field809;

	@ObfuscatedName("ax.u")
	public ServerProt packetType = null;

	@ObfuscatedName("ax.z")
	public int packetSize = 0;

	@ObfuscatedName("ax.p")
	public boolean field799 = true;

	@ObfuscatedName("ax.d")
	public int idleNetCycles = 0;

	@ObfuscatedName("ax.c")
	public int field793 = 0;

	@ObfuscatedName("ax.r")
	public int field801;

	@ObfuscatedName("ax.v")
	public int readPos;

	@ObfuscatedName("ax.o")
	public int field798;

	@ObfuscatedName("ax.s")
	public int field804;

	@ObfuscatedName("ax.y")
	public ServerProt lastPacketType0;

	@ObfuscatedName("ax.q")
	public ServerProt lastPacketType1;

	@ObfuscatedName("ax.x")
	public ServerProt lastPacketType2;

	@ObfuscatedName("ax.b")
	public boolean field808 = false;

	@ObfuscatedName("ax.h")
	public PingProvider pingProvider = new PingProvider();

	public ServerConnection() {
		Thread thread = new Thread(this.pingProvider);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	@ObfuscatedName("ax.e(I)V")
	public final void method952() {
		this.field803.method14152();
		this.field791 = 0;
	}

	@ObfuscatedName("ax.n(B)V")
	public final void method933() throws IOException {
		if (this.stream == null || this.field791 <= 0) {
			return;
		}
		this.field792.pos = 0;
		while (true) {
			ClientMessage var1 = (ClientMessage) this.field803.method14191();
			if (var1 == null || var1.field11430 > this.field792.data.length - this.field792.pos) {
				this.stream.write(this.field792.data, 0, this.field792.pos);
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
			this.field804 = this.readPos;
			this.readPos = 0;
		}
	}

	@ObfuscatedName("ax.f(Luz;Ljava/lang/String;I)V")
	public void setStream(Stream stream, String host) {
		this.stream = stream;
		this.pingProvider.setPingHost(host);
	}

	@ObfuscatedName("ax.w(B)V")
	public void closeGracefully() {
		if (this.stream != null) {
			this.stream.closeGracefully();
			this.stream = null;
		}
		this.pingProvider.setPingHost(null);
	}

	@ObfuscatedName("ax.l(B)V")
	public void closeForcefully() {
		this.stream = null;
		this.pingProvider.setPingHost(null);
	}

	@ObfuscatedName("ax.u(B)Luz;")
	public Stream getStream() {
		return this.stream;
	}
}
