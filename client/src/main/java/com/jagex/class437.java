package com.jagex;

import deob.ObfuscatedName;

import java.math.BigInteger;

@ObfuscatedName("px")
public class class437 {

	@ObfuscatedName("px.e")
	public class447 field4371;

	@ObfuscatedName("px.n")
	public class448 field4372;

	@ObfuscatedName("px.m")
	public class446 field4369;

	@ObfuscatedName("px.k")
	public BigInteger field4370;

	@ObfuscatedName("px.f")
	public BigInteger field4373;

	@ObfuscatedName("px.w")
	public class1230 field4374;

	@ObfuscatedName("px.l")
	public class1229 field4375;

	@ObfuscatedName("px.u")
	public class450 field4376;

	@ObfuscatedName("px.z")
	public class450 field4377;

	@ObfuscatedName("px.p")
	public boolean field4378 = false;

	@ObfuscatedName("px.d")
	public class936[] field4379;

	public class437(class447 arg0, class448 arg1, class446 arg2, BigInteger arg3, BigInteger arg4) {
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
		class997 var1 = new class997(this.field4374.method19444());
		this.field4376 = new class450(var1, this.field4370, this.field4373);
		if (this.field4379 == null) {
			this.field4379 = new class936[this.field4376.field4480.length];
		} else {
			for (int var2 = 0; var2 < this.field4379.length; var2++) {
				if (this.field4379[var2] != null) {
					class438 var3 = this.field4376.field4480[var2];
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
	public class936 method6835(int arg0, class560 arg1, class560 arg2, boolean arg3) {
		return this.method6836(arg0, arg1, arg2, true, arg3);
	}

	@ObfuscatedName("px.m(ILuf;Luf;ZZI)Laij;")
	public class936 method6836(int arg0, class560 arg1, class560 arg2, boolean arg3, boolean arg4) {
		if (this.field4376 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.field4379.length) {
			throw new RuntimeException();
		} else if (this.field4379[arg0] == null) {
			class438 var6 = this.field4376.field4480[arg0];
			class936 var7 = new class936(arg0, arg1, arg2, this.field4371, arg4 ? this.field4372 : null, this.field4369, var6.field4383, var6.field4382, var6.field4380, arg3, var6.field4381);
			this.field4379[arg0] = var7;
			if (this.field4377 != null && arg4) {
				class438 var8 = this.field4377.field4480[arg0];
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
					this.field4377 = new class450(new class997(var3), this.field4370, this.field4373);
					for (int var4 = 0; var4 < this.field4379.length; var4++) {
						if (this.field4379[var4] != null && this.field4379[var4].method16830()) {
							class438 var5 = this.field4377.field4480[var4];
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
