package com.jagex.js5.network;

import com.jagex.core.io.Packet;
import com.jagex.game.client.DiskStore;
import com.jagex.js5.index.Js5MasterIndexArchiveData;
import com.jagex.js5.caching.Js5DiskCache;
import com.jagex.js5.index.Js5MasterIndex;
import deob.ObfuscatedName;

import java.math.BigInteger;

@ObfuscatedName("px")
public class Js5Client {

	@ObfuscatedName("px.e")
	public Js5TcpClient field4371;

	@ObfuscatedName("px.n")
	public Js5HttpClient field4372;

	@ObfuscatedName("px.m")
	public Js5DiskCache field4369;

	@ObfuscatedName("px.k")
	public BigInteger field4370;

	@ObfuscatedName("px.f")
	public BigInteger field4373;

	@ObfuscatedName("px.w")
	public Js5NetRequest field4374;

	@ObfuscatedName("px.l")
	public Js5HttpRequest field4375;

	@ObfuscatedName("px.u")
	public Js5MasterIndex field4376;

	@ObfuscatedName("px.z")
	public Js5MasterIndex field4377;

	@ObfuscatedName("px.p")
	public boolean field4378 = false;

	@ObfuscatedName("px.d")
	public Js5NetResourceProvider[] field4379;

	public Js5Client(Js5TcpClient arg0, Js5HttpClient arg1, Js5DiskCache arg2, BigInteger arg3, BigInteger arg4) {
		this.field4371 = arg0;
		this.field4372 = arg1;
		this.field4369 = arg2;
		this.field4370 = arg3;
		this.field4373 = arg4;
		if (!this.field4371.method7012()) {
			this.field4374 = this.field4371.method7011(255, 255, (byte) 0, true);
		}
		if (this.field4372 != null) {
			this.field4375 = this.field4372.method7049();
		}
	}

	@ObfuscatedName("px.e(B)Z")
	public boolean method6834() {
		if (this.field4376 != null) {
			return true;
		}
		if (this.field4374 == null) {
			if (this.field4371.method7012()) {
				return false;
			}
			this.field4374 = this.field4371.method7011(255, 255, (byte) 0, true);
		}
		if (this.field4374.field12344) {
			return false;
		}
		Packet var1 = new Packet(this.field4374.method19444());
		this.field4376 = new Js5MasterIndex(var1, this.field4370, this.field4373);
		if (this.field4379 == null) {
			this.field4379 = new Js5NetResourceProvider[this.field4376.field4480.length];
		} else {
			for (int var2 = 0; var2 < this.field4379.length; var2++) {
				if (this.field4379[var2] != null) {
					Js5MasterIndexArchiveData var3 = this.field4376.field4480[var2];
					this.field4379[var2].method16821(var3.field4383, var3.field4382, var3.field4380, var3.field4381);
					if (this.field4379[var2].method16830()) {
						this.field4379[var2].method16832(false);
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
		if (this.field4376 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.field4379.length) {
			throw new RuntimeException();
		} else if (this.field4379[arg0] == null) {
			Js5MasterIndexArchiveData var6 = this.field4376.field4480[arg0];
			Js5NetResourceProvider var7 = new Js5NetResourceProvider(arg0, arg1, arg2, this.field4371, arg4 ? this.field4372 : null, this.field4369, var6.field4383, var6.field4382, var6.field4380, arg3, var6.field4381);
			this.field4379[arg0] = var7;
			if (this.field4377 != null && arg4) {
				Js5MasterIndexArchiveData var8 = this.field4377.field4480[arg0];
				this.field4379[arg0].method16832(this.field4379[arg0].method16822(var8.field4383, var8.field4382, var8.field4380, var8.field4381));
			}
			return var7;
		} else {
			return this.field4379[arg0];
		}
	}

	@ObfuscatedName("px.k(I)V")
	public void method6837() {
		if (this.field4379 == null) {
			return;
		}
		for (int var1 = 0; var1 < this.field4379.length; var1++) {
			if (this.field4379[var1] != null) {
				this.field4379[var1].method16833();
			}
		}
		for (int var2 = 0; var2 < this.field4379.length; var2++) {
			if (this.field4379[var2] != null) {
				this.field4379[var2].method16825();
			}
		}
		if (this.field4376 == null) {
			this.method6834();
		} else if (this.field4372 != null && !this.field4378) {
			if (this.field4375 == null) {
				this.field4375 = this.field4372.method7049();
			} else if (!this.field4375.field12344) {
				byte[] var3 = this.field4375.method19444();
				try {
					this.field4377 = new Js5MasterIndex(new Packet(var3), this.field4370, this.field4373);
					for (int var4 = 0; var4 < this.field4379.length; var4++) {
						if (this.field4379[var4] != null && this.field4379[var4].method16830()) {
							Js5MasterIndexArchiveData var5 = this.field4377.field4480[var4];
							this.field4379[var4].method16832(this.field4379[var4].method16822(var5.field4383, var5.field4382, var5.field4380, var5.field4381));
						}
					}
				} catch (Exception var8) {
					for (int var7 = 0; var7 < this.field4379.length; var7++) {
						if (this.field4379[var7] != null && this.field4379[var7].method16830()) {
							this.field4379[var7].method16832(false);
						}
					}
				}
				this.field4375 = null;
				this.field4378 = true;
			}
		}
	}
}
