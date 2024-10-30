package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.js5.Js5CompressionType;
import com.jagex.js5.network.Js5NetRequest;
import com.jagex.js5.network.Js5TcpClient;
import deob.ObfuscatedName;
import java.io.IOException;
import java.util.Iterator;

@ObfuscatedName("aik")
public class ClientJs5TcpClient extends Js5TcpClient {

	@ObfuscatedName("aik.g")
	public Stream stream;

	@ObfuscatedName("aik.w(IIB)V")
	public void error(int arg0, int arg1) {
		try {
			this.stream.closeGracefully();
		} catch (Exception var4) {
		}
		this.stream = null;
		this.errorCount++;
		this.js5State = -1;
		this.xorcode = (byte) (Math.random() * 255.0D + 1.0D);
		this.archive = arg0;
		this.group = arg1;
	}

	@ObfuscatedName("aik.l(I)Z")
	public boolean process() {
		if (this.stream != null) {
			long var1 = MonotonicTime.get();
			int var3 = (int) (var1 - this.lastTimestamp);
			this.lastTimestamp = var1;
			if (var3 > 200) {
				var3 = 200;
			}
			this.delay += var3;
			if (this.delay > 30000) {
				try {
					this.stream.closeGracefully();
				} catch (Exception var34) {
				}
				this.stream = null;
			}
		}
		if (this.stream == null) {
			return this.getTotalUrgents() == 0 && this.getTotalPrefetches() == 0;
		}
		try {
			for (Js5NetRequest var5 = (Js5NetRequest) this.urgent.peekFront(); var5 != null; var5 = (Js5NetRequest) this.urgent.prev()) {
				this.out.pos = 0;
				this.out.p1(1);
				this.out.p5(var5.secondaryNodeId);
				this.stream.write(this.out.data, 0, this.out.data.length);
				this.urgentRequested.pushBack(var5);
			}
			for (Js5NetRequest var6 = (Js5NetRequest) this.prefetch.peekFront(); var6 != null; var6 = (Js5NetRequest) this.prefetch.prev()) {
				this.out.pos = 0;
				this.out.p1(0);
				this.out.p5(var6.secondaryNodeId);
				this.stream.write(this.out.data, 0, this.out.data.length);
				this.prefetchRequested.pushBack(var6);
			}
			for (int var7 = 0; var7 < 100; var7++) {
				int var8 = this.stream.available();
				if (var8 < 0) {
					throw new IOException();
				}
				if (var8 == 0) {
					break;
				}
				this.delay = 0;
				if (this.currentRequest == null) {
					int var9 = 5 - this.client.pos;
					if (var9 > var8) {
						var9 = var8;
					}
					this.stream.read(this.client.data, this.client.pos, var9);
					if (this.xorcode != 0) {
						for (int var10 = 0; var10 < var9; var10++) {
							this.client.data[this.client.pos + var10] ^= this.xorcode;
						}
					}
					this.client.pos += var9;
					if (this.client.pos >= 5) {
						this.client.pos = 0;
						int var11 = this.client.g1();
						int var12 = this.client.g4s();
						boolean var13 = (var12 & Integer.MIN_VALUE) != 0;
						int var14 = var12 & Integer.MAX_VALUE;
						long var15 = ((long) var11 << 32) + (long) var14;
						if (var13) {
							Iterator var17 = this.prefetchRequested.iterator();
							while (var17.hasNext()) {
								Js5NetRequest var18 = (Js5NetRequest) var17.next();
								if (var18.secondaryNodeId == var15) {
									this.currentRequest = var18;
									break;
								}
							}
						} else {
							Iterator var19 = this.urgentRequested.iterator();
							while (var19.hasNext()) {
								Js5NetRequest var20 = (Js5NetRequest) var19.next();
								if (var20.secondaryNodeId == var15) {
									this.currentRequest = var20;
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
					Packet var21 = this.currentRequest.buf;
					if (var21 == null) {
						int var22 = 5 - this.server.pos;
						if (var22 > var8) {
							var22 = var8;
						}
						this.stream.read(this.server.data, this.server.pos, var22);
						if (this.xorcode != 0) {
							for (int var23 = 0; var23 < var22; var23++) {
								this.server.data[this.server.pos + var23] ^= this.xorcode;
							}
						}
						this.server.pos += var22;
						if (this.server.pos >= 5) {
							this.server.pos = 0;
							int var24 = this.server.g1();
							int var25 = this.server.g4s();
							byte var26 = 5;
							if (var24 != Js5CompressionType.UNCOMPRESSED.getId()) {
								var26 = 9;
							}
							Packet var27 = this.currentRequest.buf = new Packet(var25 + var26 + this.currentRequest.offset);
							var27.p1(var24);
							var27.p4(var25);
							this.outPos += 5;
						}
					} else {
						int var28 = var21.data.length - this.currentRequest.offset;
						int var29 = 102400 - this.outPos;
						if (var29 > var28 - var21.pos) {
							var29 = var28 - var21.pos;
						}
						if (var29 > var8) {
							var29 = var8;
						}
						this.stream.read(var21.data, var21.pos, var29);
						if (this.xorcode != 0) {
							for (int var30 = 0; var30 < var29; var30++) {
								var21.data[var21.pos + var30] ^= this.xorcode;
							}
						}
						var21.pos += var29;
						this.outPos += var29;
						if (var21.pos == var28) {
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
		} catch (IOException var35) {
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
	public void createNewJs5Stream(Object arg0, boolean arg1) {
		if (this.stream != null) {
			try {
				this.stream.closeGracefully();
			} catch (Exception var10) {
			}
			this.stream = null;
		}
		this.stream = (Stream) arg0;
		this.sendNewStream();
		this.sendLoginStatus(arg1);
		this.client.pos = 0;
		this.server.pos = 0;
		this.currentRequest = null;
		while (true) {
			Js5NetRequest var4 = (Js5NetRequest) this.urgentRequested.pollFront();
			if (var4 == null) {
				while (true) {
					Js5NetRequest var5 = (Js5NetRequest) this.prefetchRequested.pollFront();
					if (var5 == null) {
						if (this.xorcode != 0) {
							try {
								this.out.pos = 0;
								this.out.p1(4);
								this.out.p1(this.xorcode);
								this.out.p4(0);
								this.stream.write(this.out.data, 0, this.out.data.length);
							} catch (IOException var9) {
								try {
									this.stream.closeGracefully();
								} catch (Exception var8) {
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
					var5.buf = null;
					this.prefetch.pushBack(var5);
				}
			}
			var4.buf = null;
			this.urgent.pushBack(var4);
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
		} catch (IOException var4) {
			try {
				this.stream.closeGracefully();
			} catch (Exception var3) {
			}
			this.stream = null;
			this.errorCount++;
			this.js5State = -2;
		}
	}

	@ObfuscatedName("aik.z(ZI)V")
	public void sendLoginStatus(boolean arg0) {
		if (this.stream == null) {
			return;
		}
		try {
			this.out.pos = 0;
			this.out.p1(arg0 ? 2 : 3);
			this.out.p5(0L);
			this.stream.write(this.out.data, 0, this.out.data.length);
		} catch (IOException var5) {
			try {
				this.stream.closeGracefully();
			} catch (Exception var4) {
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
		} catch (IOException var4) {
			try {
				this.stream.closeGracefully();
			} catch (Exception var3) {
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
