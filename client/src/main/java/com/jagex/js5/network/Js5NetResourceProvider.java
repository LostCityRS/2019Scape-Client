package com.jagex.js5.network;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.encryption.Whirlpool;
import com.jagex.game.client.DiskStore;
import com.jagex.js5.Js5Request;
import com.jagex.js5.Js5ResourceProvider;
import com.jagex.js5.caching.Js5DiskCache;
import com.jagex.js5.index.Js5Index;
import com.jagex.js5.worker.Js5WorkerRequest;
import deob.ObfuscatedName;
import java.util.zip.CRC32;

@ObfuscatedName("aij")
public class Js5NetResourceProvider extends Js5ResourceProvider {

	@ObfuscatedName("aij.e")
	public int archive;

	@ObfuscatedName("aij.n")
	public Js5TcpClient tcpClient;

	@ObfuscatedName("aij.m")
	public Js5HttpClient httpClient;

	@ObfuscatedName("aij.k")
	public Js5DiskCache diskCache;

	@ObfuscatedName("aij.f")
	public DiskStore datafs;

	@ObfuscatedName("aij.w")
	public DiskStore masterfs;

	@ObfuscatedName("aij.l")
	public Js5Request currentRequest;

	@ObfuscatedName("aij.u")
	public int crc;

	@ObfuscatedName("aij.z")
	public byte[] whirlpool;

	@ObfuscatedName("aij.p")
	public int indexversion;

	@ObfuscatedName("aij.d")
	public Js5Index index;

	@ObfuscatedName("aij.o")
	public byte[] groupStatus;

	@ObfuscatedName("aij.s")
	public int verifiedGroups = 0;

	@ObfuscatedName("aij.y")
	public HashTable requests = new HashTable(16);

	@ObfuscatedName("aij.q")
	public boolean prefetchAll;

	@ObfuscatedName("aij.x")
	public boolean field10737;

	@ObfuscatedName("aij.b")
	public boolean verifyAll;

	@ObfuscatedName("aij.h")
	public int group = 0;

	@ObfuscatedName("aij.a")
	public LinkList groupQueue;

	@ObfuscatedName("aij.g")
	public LinkList field10741 = new LinkList();

	@ObfuscatedName("aij.i")
	public boolean discardOrphans;

	@ObfuscatedName("aij.j")
	public long orphanCheckTime = 0L;

	@ObfuscatedName("aij.ag")
	public static CRC32 crc32 = new CRC32();

	public Js5NetResourceProvider(int arg0, DiskStore arg1, DiskStore arg2, Js5TcpClient arg3, Js5HttpClient arg4, Js5DiskCache arg5, int arg6, byte[] arg7, int arg8, boolean arg9, int arg10) {
		this.archive = arg0;
		this.datafs = arg1;
		if (this.datafs == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkList();
		}
		this.masterfs = arg2;
		this.tcpClient = arg3;
		this.httpClient = arg4;
		this.diskCache = arg5;
		this.crc = arg6;
		this.whirlpool = arg7;
		this.indexversion = arg8;
		this.discardOrphans = arg9;
		if (this.masterfs != null) {
			this.currentRequest = this.diskCache.readSynchronous(this.archive, this.masterfs);
		}
	}

	@ObfuscatedName("aij.o(I[BIII)V")
	public void method16821(int arg0, byte[] arg1, int arg2, int arg3) {
		if (this.method16822(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.crc = arg0;
		this.whirlpool = arg1;
		this.indexversion = arg2;
		this.index = null;
		this.currentRequest = null;
		if (!this.tcpClient.isUrgentsFull()) {
			this.currentRequest = this.tcpClient.queueRequest(255, this.archive, (byte) 0, true);
		}
	}

	@ObfuscatedName("aij.s(I[BIII)Z")
	public boolean method16822(int arg0, byte[] arg1, int arg2, int arg3) {
		if (this.crc == arg0 && this.indexversion == arg2) {
			boolean var5 = true;
			for (int var6 = 0; var6 < this.whirlpool.length; var6++) {
				if (this.whirlpool[var6] != arg1[var6]) {
					var5 = false;
					break;
				}
			}
			if (var5) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("aij.y(I)I")
	public int getPercentageComplete() {
		if (this.fetchindex() == null) {
			return this.currentRequest == null ? 0 : this.currentRequest.getPercentageComplete();
		} else {
			return 100;
		}
	}

	@ObfuscatedName("aij.e(B)Lpl;")
	public Js5Index fetchindex() {
		if (this.index != null) {
			return this.index;
		}
		if (this.currentRequest == null) {
			if (this.tcpClient.isUrgentsFull()) {
				return null;
			}
			this.currentRequest = this.tcpClient.queueRequest(255, this.archive, (byte) 0, true);
		}
		if (this.currentRequest.incomplete) {
			return null;
		}
		byte[] var1 = this.currentRequest.getBytes();
		if (this.currentRequest instanceof Js5WorkerRequest) {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(var1, this.crc, this.whirlpool);
				if (this.index.version != this.indexversion) {
					throw new RuntimeException();
				}
			} catch (RuntimeException var4) {
				this.index = null;
				if (this.tcpClient.isUrgentsFull()) {
					this.currentRequest = null;
				} else {
					this.currentRequest = this.tcpClient.queueRequest(255, this.archive, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(var1, this.crc, this.whirlpool);
			} catch (RuntimeException var5) {
				this.tcpClient.error(255, this.archive);
				this.index = null;
				if (this.tcpClient.isUrgentsFull()) {
					this.currentRequest = null;
				} else {
					this.currentRequest = this.tcpClient.queueRequest(255, this.archive, (byte) 0, true);
				}
				return null;
			}
			if (this.masterfs != null) {
				this.diskCache.write(this.archive, var1, this.masterfs);
			}
		}
		this.currentRequest = null;
		if (this.datafs != null) {
			this.groupStatus = new byte[this.index.capacity];
			this.verifiedGroups = 0;
		}
		return this.index;
	}

	@ObfuscatedName("aij.n(II)[B")
	public byte[] fetchgroup(int arg0) {
		Js5Request var2 = this.fetchgroup_inner(arg0, 0);
		if (var2 == null) {
			return null;
		} else {
			byte[] var3 = var2.getBytes();
			var2.unlink();
			return var3;
		}
	}

	@ObfuscatedName("aij.q(IIB)Lask;")
	public Js5Request fetchgroup_inner(int arg0, int arg1) {
		Js5Request var3 = (Js5Request) this.requests.get((long) arg0);
		if (var3 != null && arg1 == 0 && !var3.urgent && var3.incomplete) {
			var3.unlink();
			var3 = null;
		}
		if (var3 == null) {
			if (arg1 == 0) {
				if (this.datafs != null && this.groupStatus[arg0] != -1) {
					var3 = this.diskCache.readSynchronous(arg0, this.datafs);
				} else if (this.httpClient == null) {
					if (this.tcpClient.isUrgentsFull()) {
						return null;
					}
					var3 = this.tcpClient.queueRequest(this.archive, arg0, (byte) 2, true);
				} else {
					var3 = this.httpClient.sendHttpRequest(this.archive, arg0, (byte) 2, true, this.index.groupChecksums[arg0], this.index.groupVersions[arg0]);
					if (var3 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.datafs == null) {
					throw new RuntimeException();
				}
				var3 = this.diskCache.read(arg0, this.datafs);
			} else if (arg1 == 2) {
				if (this.datafs == null) {
					throw new RuntimeException();
				}
				if (this.groupStatus[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.httpClient != null) {
					return null;
				}
				if (this.tcpClient.isPrefetchesFull()) {
					return null;
				}
				var3 = this.tcpClient.queueRequest(this.archive, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.requests.put(var3, (long) arg0);
		}
		if (var3.incomplete) {
			return null;
		}
		byte[] var4 = var3.getBytes();
		if (!(var3 instanceof Js5WorkerRequest)) {
			try {
				if (var4 == null || var4.length <= 2) {
					if (this.httpClient != null) {
						var3.unlink();
						return null;
					}
					throw new RuntimeException();
				}
				crc32.reset();
				crc32.update(var4, 0, var4.length - 2);
				int var13 = (int) crc32.getValue();
				if (this.index.groupChecksums[arg0] != var13) {
					throw new RuntimeException();
				}
				if (this.index.groupDigests != null && this.index.groupDigests[arg0] != null) {
					byte[] var14 = this.index.groupDigests[arg0];
					byte[] var15 = Whirlpool.compute(var4, 0, var4.length - 2);
					for (int var16 = 0; var16 < 64; var16++) {
						if (var14[var16] != var15[var16]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.httpClient != null) {
					this.tcpClient.errorCount = 0;
					this.tcpClient.js5State = 0;
				}
			} catch (RuntimeException var21) {
				this.tcpClient.error(this.archive, arg0);
				var3.unlink();
				if (var3.urgent) {
					if (this.httpClient == null) {
						if (!this.tcpClient.isUrgentsFull()) {
							Js5NetRequest var19 = this.tcpClient.queueRequest(this.archive, arg0, (byte) 2, true);
							this.requests.put(var19, (long) arg0);
						}
					} else if (!this.httpClient.isPendingRequestsFull()) {
						Js5HttpRequest var18 = this.httpClient.sendHttpRequest(this.archive, arg0, (byte) 2, true, this.index.groupChecksums[arg0], this.index.groupVersions[arg0]);
						if (var18 != null) {
							this.requests.put(var18, (long) arg0);
						}
					}
				}
				return null;
			}
			var4[var4.length - 2] = (byte) (this.index.groupVersions[arg0] >>> 8);
			var4[var4.length - 1] = (byte) this.index.groupVersions[arg0];
			if (this.datafs != null) {
				this.diskCache.write(arg0, var4, this.datafs);
				if (this.groupStatus[arg0] != 1) {
					this.verifiedGroups++;
					this.groupStatus[arg0] = 1;
				}
			}
			if (!var3.urgent) {
				var3.unlink();
			}
			return var3;
		}
		try {
			if (var4 == null || var4.length <= 2) {
				throw new RuntimeException();
			}
			crc32.reset();
			crc32.update(var4, 0, var4.length - 2);
			int var5 = (int) crc32.getValue();
			if (this.index.groupChecksums[arg0] != var5) {
				throw new RuntimeException();
			}
			if (this.index.groupDigests != null && this.index.groupDigests[arg0] != null) {
				byte[] var6 = this.index.groupDigests[arg0];
				byte[] var7 = Whirlpool.compute(var4, 0, var4.length - 2);
				for (int var8 = 0; var8 < 64; var8++) {
					if (var6[var8] != var7[var8]) {
						throw new RuntimeException();
					}
				}
			}
			int var9 = ((var4[var4.length - 2] & 0xFF) << 8) + (var4[var4.length - 1] & 0xFF);
			if ((this.index.groupVersions[arg0] & 0xFFFF) != var9) {
				throw new RuntimeException();
			}
			if (this.groupStatus[arg0] != 1) {
				if (this.groupStatus[arg0] == 0) {
				}
				this.verifiedGroups++;
				this.groupStatus[arg0] = 1;
			}
			if (!var3.urgent) {
				var3.unlink();
			}
			return var3;
		} catch (Exception var20) {
			this.groupStatus[arg0] = -1;
			var3.unlink();
			if (var3.urgent) {
				if (this.httpClient == null) {
					if (!this.tcpClient.isUrgentsFull()) {
						Js5NetRequest var12 = this.tcpClient.queueRequest(this.archive, arg0, (byte) 2, true);
						this.requests.put(var12, (long) arg0);
					}
				} else if (!this.httpClient.isPendingRequestsFull()) {
					Js5HttpRequest var11 = this.httpClient.sendHttpRequest(this.archive, arg0, (byte) 2, true, this.index.groupChecksums[arg0], this.index.groupVersions[arg0]);
					if (var11 != null) {
						this.requests.put(var11, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@ObfuscatedName("aij.x(I)V")
	public void processPrefetchQueue() {
		if (this.groupQueue == null || this.fetchindex() == null) {
			return;
		}
		for (Node var1 = this.field10741.head(); var1 != null; var1 = this.field10741.next()) {
			int var2 = (int) var1.nodeId;
			if (var2 < 0 || var2 >= this.index.capacity || this.index.groupSizes[var2] == 0) {
				var1.unlink();
			} else {
				if (this.groupStatus[var2] == 0) {
					this.fetchgroup_inner(var2, 1);
				}
				if (this.groupStatus[var2] == -1) {
					this.fetchgroup_inner(var2, 2);
				}
				if (this.groupStatus[var2] == 1) {
					var1.unlink();
				}
			}
		}
	}

	@ObfuscatedName("aij.b(B)V")
	public void update() {
		if (this.groupQueue != null) {
			if (this.fetchindex() == null) {
				return;
			}
			if (this.verifyAll) {
				boolean var1 = true;
				for (Node var2 = this.groupQueue.head(); var2 != null; var2 = this.groupQueue.next()) {
					int var3 = (int) var2.nodeId;
					if (this.groupStatus[var3] == 0) {
						this.fetchgroup_inner(var3, 1);
					}
					if (this.groupStatus[var3] == 0) {
						var1 = false;
					} else {
						var2.unlink();
					}
				}
				while (this.group < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.diskCache.pendingRequests >= 250) {
							var1 = false;
							break;
						}
						if (this.groupStatus[this.group] == 0) {
							this.fetchgroup_inner(this.group, 1);
						}
						if (this.groupStatus[this.group] == 0) {
							Node var4 = new Node();
							var4.nodeId = (long) (this.group * 1382496569) * -257432311L;
							this.groupQueue.addTail(var4);
							var1 = false;
						}
						this.group++;
					}
				}
				if (var1) {
					this.verifyAll = false;
					this.group = 0;
				}
			} else if (this.prefetchAll) {
				boolean var5 = true;
				for (Node var6 = this.groupQueue.head(); var6 != null; var6 = this.groupQueue.next()) {
					int var7 = (int) var6.nodeId;
					if (this.groupStatus[var7] != 1) {
						this.fetchgroup_inner(var7, 2);
					}
					if (this.groupStatus[var7] == 1) {
						var6.unlink();
					} else {
						var5 = false;
					}
				}
				while (this.group < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.tcpClient.isPrefetchesFull()) {
							var5 = false;
							break;
						}
						if (this.groupStatus[this.group] != 1) {
							this.fetchgroup_inner(this.group, 2);
						}
						if (this.groupStatus[this.group] != 1) {
							Node var8 = new Node();
							var8.nodeId = (long) (this.group * 1382496569) * -257432311L;
							this.groupQueue.addTail(var8);
							var5 = false;
						}
						this.group++;
					}
				}
				if (var5) {
					this.prefetchAll = false;
					this.group = 0;
				}
			} else {
				this.groupQueue = null;
			}
		}
		if (!this.discardOrphans || MonotonicTime.get() < this.orphanCheckTime) {
			return;
		}
		for (Js5Request var9 = (Js5Request) this.requests.head(); var9 != null; var9 = (Js5Request) this.requests.next()) {
			if (!var9.incomplete) {
				if (var9.orphan) {
					if (!var9.urgent) {
						throw new RuntimeException();
					}
					var9.unlink();
				} else {
					var9.orphan = true;
				}
			}
		}
		this.orphanCheckTime = MonotonicTime.get() + 1000L;
	}

	@ObfuscatedName("aij.h(B)I")
	public int method16826() {
		return this.index == null ? 0 : this.index.size;
	}

	@ObfuscatedName("aij.a(B)I")
	public int method16827() {
		return this.verifiedGroups;
	}

	@ObfuscatedName("aij.g(I)I")
	public int method16828() {
		if (this.index == null) {
			return 0;
		} else if (this.verifyAll) {
			Node var1 = this.groupQueue.head();
			return var1 == null ? 0 : (int) var1.nodeId;
		} else {
			return this.index.size;
		}
	}

	@ObfuscatedName("aij.i(I)V")
	public void method16829() {
		if (this.httpClient != null || this.datafs == null) {
			return;
		}
		this.prefetchAll = true;
		this.field10737 = true;
		if (this.groupQueue == null) {
			this.groupQueue = new LinkList();
		}
	}

	@ObfuscatedName("aij.m(IB)V")
	public void prefetchGroup(int arg0) {
		if (this.datafs == null) {
			return;
		}
		for (Node var2 = this.field10741.head(); var2 != null; var2 = this.field10741.next()) {
			if (var2.nodeId == (long) arg0) {
				return;
			}
		}
		Node var3 = new Node();
		var3.nodeId = arg0;
		this.field10741.addTail(var3);
	}

	@ObfuscatedName("aij.k(II)I")
	public int getPercentageComplete(int arg0) {
		Js5Request var2 = (Js5Request) this.requests.get((long) arg0);
		return var2 == null ? 0 : var2.getPercentageComplete();
	}

	@ObfuscatedName("aij.j(I)Z")
	public boolean method16837() {
		return this.field10737;
	}

	@ObfuscatedName("aij.t(ZS)V")
	public void method16832(boolean arg0) {
		this.httpClient.method7053(arg0);
	}

	@ObfuscatedName("aij.ae(I)Z")
	public boolean hasHttpClient() {
		return this.httpClient != null;
	}
}
