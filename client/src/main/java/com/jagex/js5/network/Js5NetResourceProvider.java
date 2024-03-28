package com.jagex.js5.network;

import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.IterableQueue;
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
	public int field10733;

	@ObfuscatedName("aij.n")
	public Js5TcpClient tcpClient;

	@ObfuscatedName("aij.m")
	public Js5HttpClient httpClient;

	@ObfuscatedName("aij.k")
	public Js5DiskCache diskCache;

	@ObfuscatedName("aij.f")
	public DiskStore field10723;

	@ObfuscatedName("aij.w")
	public DiskStore field10724;

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
	public byte[] field10745;

	@ObfuscatedName("aij.s")
	public int field10740 = 0;

	@ObfuscatedName("aij.y")
	public IterableMap requests = new IterableMap(16);

	@ObfuscatedName("aij.q")
	public boolean field10725;

	@ObfuscatedName("aij.x")
	public boolean field10737;

	@ObfuscatedName("aij.b")
	public boolean field10738;

	@ObfuscatedName("aij.h")
	public int field10739 = 0;

	@ObfuscatedName("aij.a")
	public IterableQueue field10735;

	@ObfuscatedName("aij.g")
	public IterableQueue field10741 = new IterableQueue();

	@ObfuscatedName("aij.i")
	public boolean field10748;

	@ObfuscatedName("aij.j")
	public long field10734 = 0L;

	@ObfuscatedName("aij.ag")
	public static CRC32 crc32 = new CRC32();

	public Js5NetResourceProvider(int arg0, DiskStore arg1, DiskStore arg2, Js5TcpClient tcpClient, Js5HttpClient httpClient, Js5DiskCache diskCache, int crc, byte[] whirlpool, int indexversion, boolean arg9, int arg10) {
		this.field10733 = arg0;
		this.field10723 = arg1;
		if (this.field10723 == null) {
			this.field10738 = false;
		} else {
			this.field10738 = true;
			this.field10735 = new IterableQueue();
		}
		this.field10724 = arg2;
		this.tcpClient = tcpClient;
		this.httpClient = httpClient;
		this.diskCache = diskCache;
		this.crc = crc;
		this.whirlpool = whirlpool;
		this.indexversion = indexversion;
		this.field10748 = arg9;
		if (this.field10724 != null) {
			this.currentRequest = this.diskCache.method6997(this.field10733, this.field10724);
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
			this.currentRequest = this.tcpClient.queueRequest(255, this.field10733, (byte) 0, true);
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
			this.currentRequest = this.tcpClient.queueRequest(255, this.field10733, (byte) 0, true);
		}
		if (this.currentRequest.awaitingResponse) {
			return null;
		}
		byte[] bytes = this.currentRequest.getBytes();
		if (this.currentRequest instanceof Js5WorkerRequest) {
			try {
				if (bytes == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(bytes, this.crc, this.whirlpool);
				if (this.index.indexversion != this.indexversion) {
					throw new RuntimeException();
				}
			} catch (RuntimeException var4) {
				this.index = null;
				if (this.tcpClient.isUrgentsFull()) {
					this.currentRequest = null;
				} else {
					this.currentRequest = this.tcpClient.queueRequest(255, this.field10733, (byte) 0, true);
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
				this.tcpClient.error(255, this.field10733);
				this.index = null;
				if (this.tcpClient.isUrgentsFull()) {
					this.currentRequest = null;
				} else {
					this.currentRequest = this.tcpClient.queueRequest(255, this.field10733, (byte) 0, true);
				}
				return null;
			}
			if (this.field10724 != null) {
				this.diskCache.method6988(this.field10733, bytes, this.field10724);
			}
		}
		this.currentRequest = null;
		if (this.field10723 != null) {
			this.field10745 = new byte[this.index.capacity];
			this.field10740 = 0;
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
			request.remove();
			return bytes;
		}
	}

	@ObfuscatedName("aij.q(IIB)Lask;")
	public Js5Request fetchgroup_inner(int group, int arg1) {
		Js5Request request = (Js5Request) this.requests.getNode((long) group);
		if (request != null && arg1 == 0 && !request.urgent && request.awaitingResponse) {
			request.remove();
			request = null;
		}

		if (request == null) {
			if (arg1 == 0) {
				if (this.field10723 != null && this.field10745[group] != -1) {
					request = this.diskCache.method6997(group, this.field10723);
				} else if (this.httpClient == null) {
					if (this.tcpClient.isUrgentsFull()) {
						return null;
					}
					request = this.tcpClient.queueRequest(this.field10733, group, (byte) 2, true);
				} else {
					request = this.httpClient.sendHttpRequest(this.field10733, group, (byte) 2, true, this.index.crcs[group], this.index.groupVersions[group]);
					if (request == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.field10723 == null) {
					throw new RuntimeException("fetchgroup_inner - VERIFY requested but no datafs available!");
				}

				request = this.diskCache.method6996(group, this.field10723);
			} else if (arg1 == 2) {
				if (this.field10723 == null) {
					throw new RuntimeException("fetchgroup_inner - PREFETCH requested but no datafs available!");
				}

				if (this.field10745[group] != -1) {
					throw new RuntimeException("fetchgroup_inner - PREFETCH requested, but cache isn't known invalid!");
				}

				if (this.httpClient != null) {
					return null;
				}

				if (this.tcpClient.isPrefetchesFull()) {
					return null;
				}

				request = this.tcpClient.queueRequest(this.field10733, group, (byte) 2, false);
			} else {
				throw new RuntimeException("Invalid fetchgroup mode!");
			}

			this.requests.pushNode(request, (long) group);
		}

		if (request.awaitingResponse) {
			return null;
		}

		byte[] bytes = request.getBytes();
		if (!(request instanceof Js5WorkerRequest)) {
			try {
				if (bytes == null || bytes.length <= 2) {
					if (this.httpClient != null) {
						request.remove();
						return null;
					}

					throw new RuntimeException("Data from server too small - data:" + bytes);
				}

				crc32.reset();
				crc32.update(bytes, 0, bytes.length - 2);

				int var13 = (int) crc32.getValue();
				if (this.index.crcs[group] != var13) {
					throw new RuntimeException("Net fetch CRC incorrect");
				}

				if (this.index.whirlpools != null && this.index.whirlpools[group] != null) {
					byte[] whirlpool = this.index.whirlpools[group];
					byte[] resulted = Whirlpool.method18308(bytes, 0, bytes.length - 2);
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
				this.tcpClient.error(this.field10733, group);
				request.remove();
				if (request.urgent) {
					if (this.httpClient == null) {
						if (!this.tcpClient.isUrgentsFull()) {
							Js5NetRequest netRequest = this.tcpClient.queueRequest(this.field10733, group, (byte) 2, true);
							this.requests.pushNode(netRequest, (long) group);
						}
					} else if (!this.httpClient.isPendingRequestsFull()) {
						Js5HttpRequest httpRequest = this.httpClient.sendHttpRequest(this.field10733, group, (byte) 2, true, this.index.crcs[group], this.index.groupVersions[group]);
						if (httpRequest != null) {
							this.requests.pushNode(httpRequest, (long) group);
						}
					}
				}
				return null;
			}

			bytes[bytes.length - 2] = (byte) (this.index.groupVersions[group] >>> 8);
			bytes[bytes.length - 1] = (byte) this.index.groupVersions[group];

			if (this.field10723 != null) {
				this.diskCache.method6988(group, bytes, this.field10723);
				if (this.field10745[group] != 1) {
					this.field10740++;
					this.field10745[group] = 1;
				}
			}

			if (!request.urgent) {
				request.remove();
			}

			return request;
		}

		try {
			if (bytes == null || bytes.length <= 2) {
				throw new RuntimeException("Data not in cache - data:" + bytes);
			}

			crc32.reset();
			crc32.update(bytes, 0, bytes.length - 2);
			int crc = (int) crc32.getValue();
			if (this.index.crcs[group] != crc) {
				throw new RuntimeException("Net fetch CRC incorrect");
			}

			if (this.index.whirlpools != null && this.index.whirlpools[group] != null) {
				byte[] whirlpool = this.index.whirlpools[group];
				byte[] resulted = Whirlpool.method18308(bytes, 0, bytes.length - 2);
				for (int index = 0; index < 64; index++) {
					if (whirlpool[index] != resulted[index]) {
						throw new RuntimeException("Disk fetch Whirlpool incorrect");
					}
				}
			}

			int version = ((bytes[bytes.length - 2] & 0xFF) << 8) + (bytes[bytes.length - 1] & 0xFF);
			if ((this.index.groupVersions[group] & 0xFFFF) != version) {
				throw new RuntimeException("Version incorrect - wanted:" + this.index.groupVersions[group] + " got:" + version);
			}

			if (this.field10745[group] != 1) {
				if (this.field10745[group] == 0) {
					// this.x++; // (tfu)
				}

				this.field10740++;
				this.field10745[group] = 1;
			}

			if (!request.urgent) {
				request.remove();
			}

			return request;
		} catch (Exception var20) {
			this.field10745[group] = -1;
			request.remove();

			if (request.urgent) {
				if (this.httpClient == null) {
					if (!this.tcpClient.isUrgentsFull()) {
						Js5NetRequest var12 = this.tcpClient.queueRequest(this.field10733, group, (byte) 2, true);
						this.requests.pushNode(var12, (long) group);
					}
				} else if (!this.httpClient.isPendingRequestsFull()) {
					Js5HttpRequest var11 = this.httpClient.sendHttpRequest(this.field10733, group, (byte) 2, true, this.index.crcs[group], this.index.groupVersions[group]);
					if (var11 != null) {
						this.requests.pushNode(var11, (long) group);
					}
				}
			}

			return null;
		}
	}

	@ObfuscatedName("aij.x(I)V")
	public void method16833() {
		if (this.field10735 == null || this.fetchindex() == null) {
			return;
		}
		for (Node var1 = this.field10741.peekFront(); var1 != null; var1 = this.field10741.prev()) {
			int var2 = (int) var1.nodeId;
			if (var2 < 0 || var2 >= this.index.capacity || this.index.groupSizes[var2] == 0) {
				var1.remove();
			} else {
				if (this.field10745[var2] == 0) {
					this.fetchgroup_inner(var2, 1);
				}
				if (this.field10745[var2] == -1) {
					this.fetchgroup_inner(var2, 2);
				}
				if (this.field10745[var2] == 1) {
					var1.remove();
				}
			}
		}
	}

	@ObfuscatedName("aij.b(B)V")
	public void method16825() {
		if (this.field10735 != null) {
			if (this.fetchindex() == null) {
				return;
			}
			if (this.field10738) {
				boolean var1 = true;
				for (Node var2 = this.field10735.peekFront(); var2 != null; var2 = this.field10735.prev()) {
					int var3 = (int) var2.nodeId;
					if (this.field10745[var3] == 0) {
						this.fetchgroup_inner(var3, 1);
					}
					if (this.field10745[var3] == 0) {
						var1 = false;
					} else {
						var2.remove();
					}
				}
				while (this.field10739 < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.field10739] == 0) {
						this.field10739++;
					} else {
						if (this.diskCache.pendingRequests >= 250) {
							var1 = false;
							break;
						}
						if (this.field10745[this.field10739] == 0) {
							this.fetchgroup_inner(this.field10739, 1);
						}
						if (this.field10745[this.field10739] == 0) {
							Node var4 = new Node();
							var4.nodeId = (long) (this.field10739);
							this.field10735.pushBack(var4);
							var1 = false;
						}
						this.field10739++;
					}
				}
				if (var1) {
					this.field10738 = false;
					this.field10739 = 0;
				}
			} else if (this.field10725) {
				boolean var5 = true;
				for (Node var6 = this.field10735.peekFront(); var6 != null; var6 = this.field10735.prev()) {
					int var7 = (int) var6.nodeId;
					if (this.field10745[var7] != 1) {
						this.fetchgroup_inner(var7, 2);
					}
					if (this.field10745[var7] == 1) {
						var6.remove();
					} else {
						var5 = false;
					}
				}
				while (this.field10739 < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.field10739] == 0) {
						this.field10739++;
					} else {
						if (this.tcpClient.isPrefetchesFull()) {
							var5 = false;
							break;
						}
						if (this.field10745[this.field10739] != 1) {
							this.fetchgroup_inner(this.field10739, 2);
						}
						if (this.field10745[this.field10739] != 1) {
							Node var8 = new Node();
							var8.nodeId = (long) (this.field10739);
							this.field10735.pushBack(var8);
							var5 = false;
						}
						this.field10739++;
					}
				}
				if (var5) {
					this.field10725 = false;
					this.field10739 = 0;
				}
			} else {
				this.field10735 = null;
			}
		}
        if (this.field10748 && MonotonicTime.get() >= this.field10734) {
            for (Js5Request var9 = (Js5Request) this.requests.peekFront(); var9 != null; var9 = (Js5Request) this.requests.prev()) {
                if (!var9.awaitingResponse) {
                    if (var9.field12343) {
                        if (!var9.urgent) {
                            throw new RuntimeException();
                        }
                        var9.remove();
                    } else {
                        var9.field12343 = true;
                    }
                }
            }
            this.field10734 = MonotonicTime.get() + 1000L;
        } else {
            return;
        }
    }

	@ObfuscatedName("aij.h(B)I")
	public int method16826() {
		return this.index == null ? 0 : this.index.length;
	}

	@ObfuscatedName("aij.a(B)I")
	public int method16827() {
		return this.field10740;
	}

	@ObfuscatedName("aij.g(I)I")
	public int method16828() {
		if (this.index == null) {
			return 0;
		} else if (this.field10738) {
			Node var1 = this.field10735.peekFront();
			return var1 == null ? 0 : (int) var1.nodeId;
		} else {
			return this.index.length;
		}
	}

	@ObfuscatedName("aij.i(I)V")
	public void method16829() {
		if (this.httpClient != null || this.field10723 == null) {
			return;
		}
		this.field10725 = true;
		this.field10737 = true;
		if (this.field10735 == null) {
			this.field10735 = new IterableQueue();
		}
	}

	@ObfuscatedName("aij.m(IB)V")
	public void method6856(int arg0) {
		if (this.field10723 == null) {
			return;
		}
		for (Node var2 = this.field10741.peekFront(); var2 != null; var2 = this.field10741.prev()) {
			if (var2.nodeId == (long) arg0) {
				return;
			}
		}
		Node var3 = new Node();
		var3.nodeId = arg0;
		this.field10741.pushBack(var3);
	}

	@ObfuscatedName("aij.k(II)I")
	public int getPercentageComplete(int arg0) {
		Js5Request var2 = (Js5Request) this.requests.getNode((long) arg0);
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
