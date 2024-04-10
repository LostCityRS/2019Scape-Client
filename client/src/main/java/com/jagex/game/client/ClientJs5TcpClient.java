package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.js5.Js5CompressionType;
import com.jagex.js5.network.Js5NetRequest;
import com.jagex.js5.network.Js5TcpClient;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.IOException;
import java.util.Iterator;

@ObfuscatedName("aik")
public class ClientJs5TcpClient extends Js5TcpClient {

	@ObfuscatedName("aik.g")
	public Stream stream;

	@ObfuscatedName("aik.w(IIB)V")
	public void error(int archive, int group) {
		try {
			this.stream.closeGracefully();
		} catch (Exception var4) {
		}
		this.stream = null;
		this.errorCount++;
		this.js5State = -1;
		this.xorcode = (byte) (Math.random() * 255.0D + 1.0D);
		this.archive = archive;
		this.group = group;
	}

	@ObfuscatedName("aik.l(I)Z")
	public boolean process() {
		if (this.stream != null) {
			long current = MonotonicTime.get();
			int delay = (int) (current - this.lastTimestamp);
			this.lastTimestamp = current;
			if (delay > 200) {
				delay = 200;
			}
			this.delay += delay;
			if (this.delay > 30000) {
				try {
					this.stream.closeGracefully();
				} catch (Exception exception) {
				}
				this.stream = null;
			}
		}
		if (this.stream == null) {
			return this.getTotalUrgents() == 0 && this.getTotalPrefetches() == 0;
		}
		try {
			for (Js5NetRequest urgent = (Js5NetRequest) this.urgent.peekFront(); urgent != null; urgent = (Js5NetRequest) this.urgent.prev()) {
				this.out.pos = 0;
				this.out.p1(1);
				this.out.p5(urgent.secondaryNodeId);
				this.stream.write(this.out.data, 0, this.out.data.length);
				this.urgentRequested.pushBack(urgent);
			}
			for (Js5NetRequest prefetch = (Js5NetRequest) this.prefetch.peekFront(); prefetch != null; prefetch = (Js5NetRequest) this.prefetch.prev()) {
				this.out.pos = 0;
				this.out.p1(0);
				this.out.p5(prefetch.secondaryNodeId);
				this.stream.write(this.out.data, 0, this.out.data.length);
				this.prefetchRequested.pushBack(prefetch);
			}
			for (int index = 0; index < 100; index++) {
				int available = this.stream.available();
				if (available < 0) {
					throw new IOException();
				}
				if (available == 0) {
					break;
				}
				this.delay = 0;
				if (this.currentRequest == null) {
					int pos = 5 - this.client.pos;
					if (pos > available) {
						pos = available;
					}
					this.stream.read(this.client.data, this.client.pos, pos);
					if (this.xorcode != 0 && Client.ENABLE_JS5_XOR) {
						for (int i = 0; i < pos; i++) {
							this.client.data[this.client.pos + i] ^= this.xorcode;
						}
					}
					this.client.pos += pos;
					if (this.client.pos >= 5) {
						this.client.pos = 0;
						int archive = this.client.g1();
						int group = this.client.g4s();
						boolean prefetch = (group & Integer.MIN_VALUE) != 0;
						int groupId = group & Integer.MAX_VALUE;
						long uid = ((long) archive << 32) + (long) groupId;
						if (prefetch) {
							Iterator prefetchIterator = this.prefetchRequested.iterator();
							while (prefetchIterator.hasNext()) {
								Js5NetRequest next = (Js5NetRequest) prefetchIterator.next();
								if (next.secondaryNodeId == uid) {
									this.currentRequest = next;
									break;
								}
							}
						} else {
							Iterator urgentIterator = this.urgentRequested.iterator();
							while (urgentIterator.hasNext()) {
								Js5NetRequest next = (Js5NetRequest) urgentIterator.next();
								if (next.secondaryNodeId == uid) {
									this.currentRequest = next;
									break;
								}
							}
						}
						if (this.currentRequest == null) {
							throw new IOException();
						}
						this.outPos = 5;
						this.client.pos = 0;
						this.server.pos = 0;
					}
				} else {
					Packet buf = this.currentRequest.buf;
					if (buf == null) {
						int pos = 5 - this.server.pos;
						if (pos > available) {
							pos = available;
						}
						this.stream.read(this.server.data, this.server.pos, pos);
						if (this.xorcode != 0 && Client.ENABLE_JS5_XOR) {
							for (int i = 0; i < pos; i++) {
								this.server.data[this.server.pos + i] ^= this.xorcode;
							}
						}
						this.server.pos += pos;
						if (this.server.pos >= 5) {
							this.server.pos = 0;
							int archive = this.server.g1();
							int group = this.server.g4s();
							byte length = 5;
							if (archive != Js5CompressionType.UNCOMPRESSED.getId()) {
								length = 9;
							}
							Packet out = this.currentRequest.buf = new Packet(group + length + this.currentRequest.offset);
							out.p1(archive);
							out.p4(group);
							this.outPos += 5;
						}
					} else {
						int off = buf.data.length - this.currentRequest.offset;
						int pos = 102400 - this.outPos;
						if (pos > off - buf.pos) {
							pos = off - buf.pos;
						}
						if (pos > available) {
							pos = available;
						}
						this.stream.read(buf.data, buf.pos, pos);
						if (this.xorcode != 0 && Client.ENABLE_JS5_XOR) {
							for (int i = 0; i < pos; i++) {
								buf.data[buf.pos + i] ^= this.xorcode;
							}
						}
						buf.pos += pos;
						this.outPos += pos;
						if (buf.pos == off) {
							this.currentRequest.secondaryRemove();
							this.currentRequest.incomplete = false;
							this.currentRequest = null;
						} else if (this.outPos == 102400) {
							this.outPos = 0;
							this.currentRequest = null;
						}
					}
				}
			}
			return true;
		} catch (IOException ioException) {
			try {
				this.stream.closeGracefully();
			} catch (Exception var33) {
			}
			this.stream = null;
			this.errorCount++;
			this.js5State = -2;
			return this.getTotalUrgents() == 0 && this.getTotalPrefetches() == 0;
		}
	}

	@ObfuscatedName("aik.u(Ljava/lang/Object;ZI)V")
	public void createNewJs5Stream(Object stream, boolean isLoggedIn) {
		if (this.stream != null) {
			try {
				this.stream.closeGracefully();
			} catch (Exception exception) {
			}
			this.stream = null;
		}
		this.stream = (Stream) stream;
		this.sendNewStream();
		this.sendLoginStatus(isLoggedIn);
		this.client.pos = 0;
		this.server.pos = 0;
		this.currentRequest = null;
		while (true) {
			Js5NetRequest urgent = (Js5NetRequest) this.urgentRequested.pollFront();
			if (urgent == null) {
				while (true) {
					Js5NetRequest prefetch = (Js5NetRequest) this.prefetchRequested.pollFront();
					if (prefetch == null) {
						if (this.xorcode != 0 && Client.ENABLE_JS5_XOR) {
							try {
								this.out.pos = 0;
								this.out.p1(4);
								this.out.p1(this.xorcode);
								this.out.p4(0);
								this.stream.write(this.out.data, 0, this.out.data.length);
							} catch (IOException ioException) {
								try {
									this.stream.closeGracefully();
								} catch (Exception exception) {
								}
								this.stream = null;
								this.errorCount++;
								this.js5State = -2;
							}
						}
						this.delay = 0;
						this.lastTimestamp = MonotonicTime.get();
						return;
					}
					prefetch.buf = null;
					this.prefetch.pushBack(prefetch);
				}
			}
			urgent.buf = null;
			this.urgent.pushBack(urgent);
		}
	}

	@ObfuscatedName("aik.ac(I)V")
	public void sendNewStream() {
		if (this.stream == null) {
			return;
		}
		try {
			this.out.pos = 0;
			this.out.p1(6);
			this.out.p3(4);
			this.out.p2(0);
			this.stream.write(this.out.data, 0, this.out.data.length);
		} catch (IOException ioException) {
			try {
				this.stream.closeGracefully();
			} catch (Exception exception) {
			}
			this.stream = null;
			this.errorCount++;
			this.js5State = -2;
		}
	}

	@ObfuscatedName("aik.z(ZI)V")
	public void sendLoginStatus(boolean isLoggedIn) {
		if (this.stream == null) {
			return;
		}
		try {
			this.out.pos = 0;
			this.out.p1(isLoggedIn ? 2 : 3);
			this.out.p5(0L);
			this.stream.write(this.out.data, 0, this.out.data.length);
		} catch (IOException ioException) {
			try {
				this.stream.closeGracefully();
			} catch (Exception exception) {
			}
			this.stream = null;
			this.errorCount++;
			this.js5State = -2;
		}
	}

	@ObfuscatedName("aik.p(I)V")
	public void sendCloseStream() {
		if (this.stream == null) {
			return;
		}
		try {
			this.out.pos = 0;
			this.out.p1(7);
			this.out.p5(0L);
			this.stream.write(this.out.data, 0, this.out.data.length);
		} catch (IOException ioException) {
			try {
				this.stream.closeGracefully();
			} catch (Exception exception) {
			}
			this.stream = null;
			this.errorCount++;
			this.js5State = -2;
		}
	}

	@ObfuscatedName("aik.d(I)V")
	public void closeGracefully() {
		if (this.stream != null) {
			this.stream.closeGracefully();
		}
	}

	@ObfuscatedName("aik.c(I)V")
	public void closeForcefully() {
		if (this.stream != null) {
			this.stream.closeForcefully();
		}
	}
}
