package com.jagex.game.network;

import com.jagex.core.datastruct.LinkList;
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
	public LinkList writeQueue = new LinkList();

	@ObfuscatedName("ax.m")
	public int writePos = 0;

	@ObfuscatedName("ax.k")
	public Packet out = new Packet(1700);

	@ObfuscatedName("ax.f")
	public Isaac randomOut;

	@ObfuscatedName("ax.w")
	public PacketBit in = new PacketBit(40000);

	@ObfuscatedName("ax.l")
	public Isaac randomIn;

	@ObfuscatedName("ax.u")
	public ServerProt packetType = null;

	@ObfuscatedName("ax.z")
	public int packetSize = 0;

	@ObfuscatedName("ax.p")
	public boolean field799 = true;

	@ObfuscatedName("ax.d")
	public int idleNetCycles = 0;

	@ObfuscatedName("ax.c")
	public int numConnections = 0;

	@ObfuscatedName("ax.r")
	public int totalBytesSent;

	@ObfuscatedName("ax.v")
	public int readPos;

	@ObfuscatedName("ax.o")
	public int outBytesPerSecond;

	@ObfuscatedName("ax.s")
	public int inBytesPerSecond;

	@ObfuscatedName("ax.y")
	public ServerProt lastPacketType0;

	@ObfuscatedName("ax.q")
	public ServerProt lastPacketType1;

	@ObfuscatedName("ax.x")
	public ServerProt lastPacketType2;

	@ObfuscatedName("ax.b")
	public boolean disconnected = false;

	@ObfuscatedName("ax.h")
	public PingProvider pingProvider = new PingProvider();

	public ServerConnection() {
		Thread thread = new Thread(this.pingProvider);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	@ObfuscatedName("ax.e(I)V")
	public final void clearWriteQueue() {
		this.writeQueue.removeAll();
		this.writePos = 0;
	}

	@ObfuscatedName("ax.n(B)V")
	public final void flush() throws IOException {
		if (this.stream == null || this.writePos <= 0) {
			return;
		}
		this.out.pos = 0;
		while (true) {
			ClientMessage message = (ClientMessage) this.writeQueue.head();
			if (message == null || message.pos > this.out.data.length - this.out.pos) {
				this.stream.write(this.out.data, 0, this.out.pos);
				this.totalBytesSent += this.out.pos;
				this.numConnections = 0;
				break;
			}
			this.out.pdata(message.buf.data, 0, message.pos);
			this.writePos -= message.pos;
			message.unlink();
			message.buf.release();
			message.pushMessage();
		}
	}

	@ObfuscatedName("ax.m(Lakl;I)V")
	public final void queue(ClientMessage message) {
		this.writeQueue.addTail(message);
		message.pos = message.buf.pos;
		message.buf.pos = 0;
		this.writePos += message.pos;
	}

	@ObfuscatedName("ax.k(I)V")
	public void refreshNetStats() {
		if (Client.loopCycle % 50 == 0) {
			this.outBytesPerSecond = this.totalBytesSent;
			this.totalBytesSent = 0;
			this.inBytesPerSecond = this.readPos;
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
