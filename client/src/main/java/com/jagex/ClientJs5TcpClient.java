package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.util.Iterator;

@ObfuscatedName("aik")
public class ClientJs5TcpClient extends Js5TcpClient {

	@ObfuscatedName("aik.g")
	public Stream field10751;

	@ObfuscatedName("aik.w(IIB)V")
	public void method7015(int arg0, int arg1) {
		try {
			this.field10751.method9031();
		} catch (Exception var4) {
		}
		this.field10751 = null;
		this.field4455++;
		this.field4454 = -1;
		this.field4447 = (byte) (Math.random() * 255.0D + 1.0D);
		this.field4457 = arg0;
		this.field4456 = arg1;
	}

	@ObfuscatedName("aik.l(I)Z")
	public boolean method7016() {
		if (this.field10751 != null) {
			long var1 = MonotonicTime.method3655();
			int var3 = (int) (var1 - this.field4452);
			this.field4452 = var1;
			if (var3 > 200) {
				var3 = 200;
			}
			this.field4441 += var3;
			if (this.field4441 > 30000) {
				try {
					this.field10751.method9031();
				} catch (Exception var34) {
				}
				this.field10751 = null;
			}
		}
		if (this.field10751 == null) {
			return this.method7021() == 0 && this.method7013() == 0;
		}
		try {
			for (Js5NetRequest var5 = (Js5NetRequest) this.field4448.method14317(); var5 != null; var5 = (Js5NetRequest) this.field4448.method14324()) {
				this.field4450.pos = 0;
				this.field4450.p1(1);
				this.field4450.p5(var5.field11440);
				this.field10751.method9030(this.field4450.data, 0, this.field4450.data.length);
				this.field4451.method14339(var5);
			}
			for (Js5NetRequest var6 = (Js5NetRequest) this.field4449.method14317(); var6 != null; var6 = (Js5NetRequest) this.field4449.method14324()) {
				this.field4450.pos = 0;
				this.field4450.p1(0);
				this.field4450.p5(var6.field11440);
				this.field10751.method9030(this.field4450.data, 0, this.field4450.data.length);
				this.field4443.method14339(var6);
			}
			for (int var7 = 0; var7 < 100; var7++) {
				int var8 = this.field10751.method9043();
				if (var8 < 0) {
					throw new IOException();
				}
				if (var8 == 0) {
					break;
				}
				this.field4441 = 0;
				if (this.field4462 == null) {
					int var9 = 5 - this.field4459.pos;
					if (var9 > var8) {
						var9 = var8;
					}
					this.field10751.method9029(this.field4459.data, this.field4459.pos, var9);
					if (this.field4447 != 0 && client.ENABLE_JS5_XOR) {
						for (int var10 = 0; var10 < var9; var10++) {
							this.field4459.data[this.field4459.pos + var10] ^= this.field4447;
						}
					}
					this.field4459.pos += var9;
					if (this.field4459.pos >= 5) {
						this.field4459.pos = 0;
						int var11 = this.field4459.g1();
						int var12 = this.field4459.g4s();
						boolean var13 = (var12 & Integer.MIN_VALUE) != 0;
						int var14 = var12 & Integer.MAX_VALUE;
						long var15 = ((long) var11 << 32) + (long) var14;
						if (var13) {
							Iterator var17 = this.field4443.iterator();
							while (var17.hasNext()) {
								Js5NetRequest var18 = (Js5NetRequest) var17.next();
								if (var18.field11440 == var15) {
									this.field4462 = var18;
									break;
								}
							}
						} else {
							Iterator var19 = this.field4451.iterator();
							while (var19.hasNext()) {
								Js5NetRequest var20 = (Js5NetRequest) var19.next();
								if (var20.field11440 == var15) {
									this.field4462 = var20;
									break;
								}
							}
						}
						if (this.field4462 == null) {
							throw new IOException();
						}
						this.field4461 = 5;
						this.field4459.pos = 0;
						this.field4460.pos = 0;
					}
				} else {
					Packet var21 = this.field4462.field12564;
					if (var21 == null) {
						int var22 = 5 - this.field4460.pos;
						if (var22 > var8) {
							var22 = var8;
						}
						this.field10751.method9029(this.field4460.data, this.field4460.pos, var22);
						if (this.field4447 != 0 && client.ENABLE_JS5_XOR) {
							for (int var23 = 0; var23 < var22; var23++) {
								this.field4460.data[this.field4460.pos + var23] ^= this.field4447;
							}
						}
						this.field4460.pos += var22;
						if (this.field4460.pos >= 5) {
							this.field4460.pos = 0;
							int var24 = this.field4460.g1();
							int var25 = this.field4460.g4s();
							byte var26 = 5;
							if (var24 != CompressionType.field4434.getId()) {
								var26 = 9;
							}
							Packet var27 = this.field4462.field12564 = new Packet(var25 + var26 + this.field4462.field12565);
							var27.p1(var24);
							var27.p4(var25);
							this.field4461 += 5;
						}
					} else {
						int var28 = var21.data.length - this.field4462.field12565;
						int var29 = 102400 - this.field4461;
						if (var29 > var28 - var21.pos) {
							var29 = var28 - var21.pos;
						}
						if (var29 > var8) {
							var29 = var8;
						}
						this.field10751.method9029(var21.data, var21.pos, var29);
						if (this.field4447 != 0 && client.ENABLE_JS5_XOR) {
							for (int var30 = 0; var30 < var29; var30++) {
								var21.data[var21.pos + var30] ^= this.field4447;
							}
						}
						var21.pos += var29;
						this.field4461 += var29;
						if (var21.pos == var28) {
							this.field4462.method17806();
							this.field4462.field12344 = false;
							this.field4462 = null;
						} else if (this.field4461 == 102400) {
							this.field4461 = 0;
							this.field4462 = null;
						}
					}
				}
			}
			return true;
		} catch (IOException var35) {
			try {
				this.field10751.method9031();
			} catch (Exception var33) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
			return this.method7021() == 0 && this.method7013() == 0;
		}
	}

	@ObfuscatedName("aik.u(Ljava/lang/Object;ZI)V")
	public void method7017(Object arg0, boolean arg1) {
		if (this.field10751 != null) {
			try {
				this.field10751.method9031();
			} catch (Exception var10) {
			}
			this.field10751 = null;
		}
		this.field10751 = (Stream) arg0;
		this.method16859();
		this.method7010(arg1);
		this.field4459.pos = 0;
		this.field4460.pos = 0;
		this.field4462 = null;
		while (true) {
			Js5NetRequest var4 = (Js5NetRequest) this.field4451.method14315();
			if (var4 == null) {
				while (true) {
					Js5NetRequest var5 = (Js5NetRequest) this.field4443.method14315();
					if (var5 == null) {
						if (this.field4447 != 0 && client.ENABLE_JS5_XOR) {
							try {
								this.field4450.pos = 0;
								this.field4450.p1(4);
								this.field4450.p1(this.field4447);
								this.field4450.p4(0);
								this.field10751.method9030(this.field4450.data, 0, this.field4450.data.length);
							} catch (IOException var9) {
								try {
									this.field10751.method9031();
								} catch (Exception var8) {
								}
								this.field10751 = null;
								this.field4455++;
								this.field4454 = -2;
							}
						}
						this.field4441 = 0;
						this.field4452 = MonotonicTime.method3655();
						return;
					}
					var5.field12564 = null;
					this.field4449.method14339(var5);
				}
			}
			var4.field12564 = null;
			this.field4448.method14339(var4);
		}
	}

	@ObfuscatedName("aik.ac(I)V")
	public void method16859() {
		if (this.field10751 == null) {
			return;
		}
		try {
			this.field4450.pos = 0;
			this.field4450.p1(6);
			this.field4450.p3(4);
			this.field4450.p2(0);
			this.field10751.method9030(this.field4450.data, 0, this.field4450.data.length);
		} catch (IOException var4) {
			try {
				this.field10751.method9031();
			} catch (Exception var3) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
		}
	}

	@ObfuscatedName("aik.z(ZI)V")
	public void method7010(boolean arg0) {
		if (this.field10751 == null) {
			return;
		}
		try {
			this.field4450.pos = 0;
			this.field4450.p1(arg0 ? 2 : 3);
			this.field4450.p5(0L);
			this.field10751.method9030(this.field4450.data, 0, this.field4450.data.length);
		} catch (IOException var5) {
			try {
				this.field10751.method9031();
			} catch (Exception var4) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
		}
	}

	@ObfuscatedName("aik.p(I)V")
	public void method7014() {
		if (this.field10751 == null) {
			return;
		}
		try {
			this.field4450.pos = 0;
			this.field4450.p1(7);
			this.field4450.p5(0L);
			this.field10751.method9030(this.field4450.data, 0, this.field4450.data.length);
		} catch (IOException var4) {
			try {
				this.field10751.method9031();
			} catch (Exception var3) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
		}
	}

	@ObfuscatedName("aik.d(I)V")
	public void method7020() {
		if (this.field10751 != null) {
			this.field10751.method9031();
		}
	}

	@ObfuscatedName("aik.c(I)V")
	public void method7035() {
		if (this.field10751 != null) {
			this.field10751.method9032();
		}
	}
}
