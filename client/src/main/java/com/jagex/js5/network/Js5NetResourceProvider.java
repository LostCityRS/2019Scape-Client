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

	public Js5NetResourceProvider(int archive, DiskStore datafs, DiskStore masterfs, Js5TcpClient tcpClient, Js5HttpClient httpClient, Js5DiskCache diskCache, int crc, byte[] whirlpool, int indexversion, boolean arg9, int arg10) {
		this.archive = archive;
		this.datafs = datafs;
		if (this.datafs == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkList();
		}
		this.masterfs = masterfs;
		this.tcpClient = tcpClient;
		this.httpClient = httpClient;
		this.diskCache = diskCache;
		this.crc = crc;
		this.whirlpool = whirlpool;
		this.indexversion = indexversion;
		this.discardOrphans = arg9;
		if (this.masterfs != null) {
			this.currentRequest = this.diskCache.readSynchronous(this.archive, this.masterfs);
		}
	}

	@ObfuscatedName("aij.o(I[BIII)V")
	public void method16821(int crc, byte[] whirlpool, int indexversion, int arg3) {
		if (this.method16822(crc, whirlpool, indexversion, arg3)) {
			return;
		}
		this.crc = crc;
		this.whirlpool = whirlpool;
		this.indexversion = indexversion;
		this.index = null;
		this.currentRequest = null;
		if (!this.tcpClient.isUrgentsFull()) {
			this.currentRequest = this.tcpClient.queueRequest(255, this.archive, (byte) 0, true);
		}
	}

	@ObfuscatedName("aij.s(I[BIII)Z")
	public boolean method16822(int crc, byte[] whirlpool, int indexversion, int arg3) {
		if (this.crc == crc && this.indexversion == indexversion) {
			boolean var5 = true;
			for (int var6 = 0; var6 < this.whirlpool.length; var6++) {
				if (this.whirlpool[var6] != whirlpool[var6]) {
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
		byte[] bytes = this.currentRequest.getBytes();
		if (this.currentRequest instanceof Js5WorkerRequest) {
			try {
				if (bytes == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(bytes, this.crc, this.whirlpool);
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
				if (bytes == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(bytes, this.crc, this.whirlpool);
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
				this.diskCache.write(this.archive, bytes, this.masterfs);
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
		Js5Request request = this.fetchgroup_inner(arg0, 0);
		if (request == null) {
			return null;
		} else {
			byte[] bytes = request.getBytes();
			request.unlink();
			return bytes;
		}
	}

	@ObfuscatedName("aij.q(IIB)Lask;")
	public Js5Request fetchgroup_inner(int group, int arg1) {
		Js5Request request = (Js5Request) this.requests.get((long) group);
		if (request != null && arg1 == 0 && !request.urgent && request.incomplete) {
			request.unlink();
			request = null;
		}

		if (request == null) {
			if (arg1 == 0) {
				if (this.datafs != null && this.groupStatus[group] != -1) {
					request = this.diskCache.readSynchronous(group, this.datafs);
				} else if (this.httpClient == null) {
					if (this.tcpClient.isUrgentsFull()) {
						return null;
					}
					request = this.tcpClient.queueRequest(this.archive, group, (byte) 2, true);
				} else {
					request = this.httpClient.sendHttpRequest(this.archive, group, (byte) 2, true, this.index.groupChecksums[group], this.index.groupVersions[group]);
					if (request == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.datafs == null) {
					throw new RuntimeException("fetchgroup_inner - VERIFY requested but no datafs available!");
				}

				request = this.diskCache.read(group, this.datafs);
			} else if (arg1 == 2) {
				if (this.datafs == null) {
					throw new RuntimeException("fetchgroup_inner - PREFETCH requested but no datafs available!");
				}

				if (this.groupStatus[group] != -1) {
					throw new RuntimeException("fetchgroup_inner - PREFETCH requested, but cache isn't known invalid!");
				}

				if (this.httpClient != null) {
					return null;
				}

				if (this.tcpClient.isPrefetchesFull()) {
					return null;
				}

				request = this.tcpClient.queueRequest(this.archive, group, (byte) 2, false);
			} else {
				throw new RuntimeException("Invalid fetchgroup mode!");
			}

			this.requests.put(request, (long) group);
		}

		if (request.incomplete) {
			return null;
		}

		byte[] data = request.getBytes();
		if (!(request instanceof Js5WorkerRequest)) {
			try {
				if (data == null || data.length <= 2) {
					if (this.httpClient != null) {
						request.unlink();
						return null;
					}

					throw new RuntimeException("Data from server too small - data:" + data);
				}

				crc32.reset();
				crc32.update(data, 0, data.length - 2);

				int var13 = (int) crc32.getValue();
				if (this.index.groupChecksums[group] != var13) {
					throw new RuntimeException("Net fetch CRC incorrect");
				}

				if (this.index.groupDigests != null && this.index.groupDigests[group] != null) {
					byte[] whirlpool = this.index.groupDigests[group];
					byte[] resulted = Whirlpool.compute(data, 0, data.length - 2);
					for (int index = 0; index < 64; index++) {
						if (whirlpool[index] != resulted[index]) {
		                    // throw new RuntimeException("Whirlpool for group " + arg0 + " incorrect - got:" + hexString(var14) + " expected:" + hexString(var15));
							throw new RuntimeException("Whirlpool for group " + group + " incorrect");
						}
					}
				}

				if (this.httpClient != null) {
					this.tcpClient.errorCount = 0;
					this.tcpClient.js5State = 0;
				}
			} catch (RuntimeException var21) {
				this.tcpClient.error(this.archive, group);
				request.unlink();
				if (request.urgent) {
					if (this.httpClient == null) {
						if (!this.tcpClient.isUrgentsFull()) {
							Js5NetRequest netRequest = this.tcpClient.queueRequest(this.archive, group, (byte) 2, true);
							this.requests.put(netRequest, (long) group);
						}
					} else if (!this.httpClient.isPendingRequestsFull()) {
						Js5HttpRequest httpRequest = this.httpClient.sendHttpRequest(this.archive, group, (byte) 2, true, this.index.groupChecksums[group], this.index.groupVersions[group]);
						if (httpRequest != null) {
							this.requests.put(httpRequest, (long) group);
						}
					}
				}
				return null;
			}

			data[data.length - 2] = (byte) (this.index.groupVersions[group] >>> 8);
			data[data.length - 1] = (byte) this.index.groupVersions[group];

			if (this.datafs != null) {
				this.diskCache.write(group, data, this.datafs);
				if (this.groupStatus[group] != 1) {
					this.verifiedGroups++;
					this.groupStatus[group] = 1;
				}
			}

			if (!request.urgent) {
				request.unlink();
			}

			return request;
		}

		try {
			if (data == null || data.length <= 2) {
				throw new RuntimeException("Data not in cache - data:" + data);
			}

			crc32.reset();
			crc32.update(data, 0, data.length - 2);

			int crc = (int) crc32.getValue();
			if (this.index.groupChecksums[group] != crc) {
				throw new RuntimeException("Net fetch CRC incorrect");
			}

			if (this.index.groupDigests != null && this.index.groupDigests[group] != null) {
				byte[] whirlpool = this.index.groupDigests[group];
				byte[] resulted = Whirlpool.compute(data, 0, data.length - 2);
				for (int index = 0; index < 64; index++) {
					if (whirlpool[index] != resulted[index]) {
						throw new RuntimeException("Disk fetch Whirlpool incorrect");
					}
				}
			}

			int version = ((data[data.length - 2] & 0xFF) << 8) + (data[data.length - 1] & 0xFF);
			if ((this.index.groupVersions[group] & 0xFFFF) != version) {
				throw new RuntimeException("Version incorrect - wanted:" + this.index.groupVersions[group] + " got:" + version);
			}

			if (this.groupStatus[group] != 1) {
				if (this.groupStatus[group] == 0) {
					// this.x++; // (tfu)
				}

				this.verifiedGroups++;
				this.groupStatus[group] = 1;
			}

			if (!request.urgent) {
				request.unlink();
			}

			return request;
		} catch (Exception var20) {
			this.groupStatus[group] = -1;
			request.unlink();

			if (request.urgent) {
				if (this.httpClient == null) {
					if (!this.tcpClient.isUrgentsFull()) {
						Js5NetRequest var12 = this.tcpClient.queueRequest(this.archive, group, (byte) 2, true);
						this.requests.put(var12, (long) group);
					}
				} else if (!this.httpClient.isPendingRequestsFull()) {
					Js5HttpRequest var11 = this.httpClient.sendHttpRequest(this.archive, group, (byte) 2, true, this.index.groupChecksums[group], this.index.groupVersions[group]);
					if (var11 != null) {
						this.requests.put(var11, (long) group);
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
		for (Node node = this.field10741.head(); node != null; node = this.field10741.next()) {
			int group = (int) node.nodeId;
			if (group < 0 || group >= this.index.capacity || this.index.groupSizes[group] == 0) {
				node.unlink();
			} else {
				if (this.groupStatus[group] == 0) {
					this.fetchgroup_inner(group, 1);
				}
				if (this.groupStatus[group] == -1) {
					this.fetchgroup_inner(group, 2);
				}
				if (this.groupStatus[group] == 1) {
					node.unlink();
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
							var4.nodeId = (long) (this.group);
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
							var8.nodeId = (long) (this.group);
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
        if (this.discardOrphans && MonotonicTime.get() >= this.orphanCheckTime) {
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
