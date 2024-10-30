package com.jagex.js5.network;

import com.jagex.core.io.Packet;
import com.jagex.game.client.DiskStore;
import com.jagex.js5.caching.Js5DiskCache;
import com.jagex.js5.index.Js5MasterIndex;
import com.jagex.js5.index.Js5MasterIndexArchiveData;
import deob.ObfuscatedName;
import java.math.BigInteger;

@ObfuscatedName("px")
public class Js5Client {

	@ObfuscatedName("px.e")
	public Js5TcpClient tcpClient;

	@ObfuscatedName("px.n")
	public Js5HttpClient httpClient;

	@ObfuscatedName("px.m")
	public Js5DiskCache diskCache;

	@ObfuscatedName("px.k")
	public BigInteger rsaExponent;

	@ObfuscatedName("px.f")
	public BigInteger rsaModulus;

	@ObfuscatedName("px.w")
	public Js5NetRequest masterIndexRequest;

	@ObfuscatedName("px.l")
	public Js5HttpRequest httpMasterIndexRequest;

	@ObfuscatedName("px.u")
	public Js5MasterIndex masterIndex;

	@ObfuscatedName("px.z")
	public Js5MasterIndex field4377;

	@ObfuscatedName("px.p")
	public boolean field4378 = false;

	@ObfuscatedName("px.d")
	public Js5NetResourceProvider[] resourceProviders;

	public Js5Client(Js5TcpClient arg0, Js5HttpClient arg1, Js5DiskCache arg2, BigInteger arg3, BigInteger arg4) {
		this.tcpClient = arg0;
		this.httpClient = arg1;
		this.diskCache = arg2;
		this.rsaExponent = arg3;
		this.rsaModulus = arg4;
		if (!this.tcpClient.isUrgentsFull()) {
			this.masterIndexRequest = this.tcpClient.queueRequest(255, 255, (byte) 0, true);
		}
		if (this.httpClient != null) {
			this.httpMasterIndexRequest = this.httpClient.requestMasterIndex();
		}
	}

	@ObfuscatedName("px.e(B)Z")
	public boolean loadMasterIndex() {
		if (this.masterIndex != null) {
			return true;
		}
		if (this.masterIndexRequest == null) {
			if (this.tcpClient.isUrgentsFull()) {
				return false;
			}
			this.masterIndexRequest = this.tcpClient.queueRequest(255, 255, (byte) 0, true);
		}
		if (this.masterIndexRequest.incomplete) {
			return false;
		}
		Packet var1 = new Packet(this.masterIndexRequest.getBytes());
		this.masterIndex = new Js5MasterIndex(var1, this.rsaExponent, this.rsaModulus);
		if (this.resourceProviders == null) {
			this.resourceProviders = new Js5NetResourceProvider[this.masterIndex.archiveData.length];
		} else {
			for (int var2 = 0; var2 < this.resourceProviders.length; var2++) {
				if (this.resourceProviders[var2] != null) {
					Js5MasterIndexArchiveData var3 = this.masterIndex.archiveData[var2];
					this.resourceProviders[var2].method16821(var3.crc, var3.whirlpool, var3.version, var3.groupCount);
					if (this.resourceProviders[var2].hasHttpClient()) {
						this.resourceProviders[var2].method16832(false);
					}
				}
			}
		}
		this.field4378 = false;
		return true;
	}

	@ObfuscatedName("px.n(ILuf;Luf;ZB)Laij;")
	public Js5NetResourceProvider method6835(int arg0, DiskStore arg1, DiskStore arg2, boolean arg3) {
		return this.method6836(arg0, arg1, arg2, true, arg3);
	}

	@ObfuscatedName("px.m(ILuf;Luf;ZZI)Laij;")
	public Js5NetResourceProvider method6836(int arg0, DiskStore arg1, DiskStore arg2, boolean arg3, boolean arg4) {
		if (this.masterIndex == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.resourceProviders.length) {
			throw new RuntimeException();
		} else if (this.resourceProviders[arg0] == null) {
			Js5MasterIndexArchiveData var6 = this.masterIndex.archiveData[arg0];
			Js5NetResourceProvider var7 = new Js5NetResourceProvider(arg0, arg1, arg2, this.tcpClient, arg4 ? this.httpClient : null, this.diskCache, var6.crc, var6.whirlpool, var6.version, arg3, var6.groupCount);
			this.resourceProviders[arg0] = var7;
			if (this.field4377 != null && arg4) {
				Js5MasterIndexArchiveData var8 = this.field4377.archiveData[arg0];
				this.resourceProviders[arg0].method16832(this.resourceProviders[arg0].method16822(var8.crc, var8.whirlpool, var8.version, var8.groupCount));
			}
			return var7;
		} else {
			return this.resourceProviders[arg0];
		}
	}

	@ObfuscatedName("px.k(I)V")
	public void update() {
		if (this.resourceProviders == null) {
			return;
		}
		for (int var1 = 0; var1 < this.resourceProviders.length; var1++) {
			if (this.resourceProviders[var1] != null) {
				this.resourceProviders[var1].processPrefetchQueue();
			}
		}
		for (int var2 = 0; var2 < this.resourceProviders.length; var2++) {
			if (this.resourceProviders[var2] != null) {
				this.resourceProviders[var2].update();
			}
		}
		if (this.masterIndex == null) {
			this.loadMasterIndex();
		} else if (this.httpClient != null && !this.field4378) {
			if (this.httpMasterIndexRequest == null) {
				this.httpMasterIndexRequest = this.httpClient.requestMasterIndex();
			} else if (!this.httpMasterIndexRequest.incomplete) {
				byte[] var3 = this.httpMasterIndexRequest.getBytes();
				try {
					this.field4377 = new Js5MasterIndex(new Packet(var3), this.rsaExponent, this.rsaModulus);
					for (int var4 = 0; var4 < this.resourceProviders.length; var4++) {
						if (this.resourceProviders[var4] != null && this.resourceProviders[var4].hasHttpClient()) {
							Js5MasterIndexArchiveData var5 = this.field4377.archiveData[var4];
							this.resourceProviders[var4].method16832(this.resourceProviders[var4].method16822(var5.crc, var5.whirlpool, var5.version, var5.groupCount));
						}
					}
				} catch (Exception var8) {
					for (int var7 = 0; var7 < this.resourceProviders.length; var7++) {
						if (this.resourceProviders[var7] != null && this.resourceProviders[var7].hasHttpClient()) {
							this.resourceProviders[var7].method16832(false);
						}
					}
				}
				this.httpMasterIndexRequest = null;
				this.field4378 = true;
			}
		}
	}
}
