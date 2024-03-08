package com.jagex;

import deob.ObfuscatedName;

import java.util.zip.CRC32;

@ObfuscatedName("aij")
public class Js5NetResourceProvider extends Js5ResourceProvider {

	@ObfuscatedName("aij.e")
	public int field10733;

	@ObfuscatedName("aij.n")
	public Js5TcpClient field10720;

	@ObfuscatedName("aij.m")
	public Js5HttpClient field10721;

	@ObfuscatedName("aij.k")
	public Js5DiskCache field10744;

	@ObfuscatedName("aij.f")
	public DiskStore field10723;

	@ObfuscatedName("aij.w")
	public DiskStore field10724;

	@ObfuscatedName("aij.l")
	public Js5Request field10743;

	@ObfuscatedName("aij.u")
	public int field10722;

	@ObfuscatedName("aij.z")
	public byte[] field10727;

	@ObfuscatedName("aij.p")
	public int field10728;

	@ObfuscatedName("aij.d")
	public Js5ArchiveIndex field10729;

	@ObfuscatedName("aij.o")
	public byte[] field10745;

	@ObfuscatedName("aij.s")
	public int field10740 = 0;

	@ObfuscatedName("aij.y")
	public IterableMap field10731 = new IterableMap(16);

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
	public static CRC32 field10746 = new CRC32();

	public Js5NetResourceProvider(int arg0, DiskStore arg1, DiskStore arg2, Js5TcpClient arg3, Js5HttpClient arg4, Js5DiskCache arg5, int arg6, byte[] arg7, int arg8, boolean arg9, int arg10) {
		this.field10733 = arg0;
		this.field10723 = arg1;
		if (this.field10723 == null) {
			this.field10738 = false;
		} else {
			this.field10738 = true;
			this.field10735 = new IterableQueue();
		}
		this.field10724 = arg2;
		this.field10720 = arg3;
		this.field10721 = arg4;
		this.field10744 = arg5;
		this.field10722 = arg6;
		this.field10727 = arg7;
		this.field10728 = arg8;
		this.field10748 = arg9;
		if (this.field10724 != null) {
			this.field10743 = this.field10744.method6997(this.field10733, this.field10724);
		}
	}

	@ObfuscatedName("aij.o(I[BIII)V")
	public void method16821(int arg0, byte[] arg1, int arg2, int arg3) {
		if (this.method16822(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.field10722 = arg0;
		this.field10727 = arg1;
		this.field10728 = arg2;
		this.field10729 = null;
		this.field10743 = null;
		if (!this.field10720.method7012()) {
			this.field10743 = this.field10720.method7011(255, this.field10733, (byte) 0, true);
		}
	}

	@ObfuscatedName("aij.s(I[BIII)Z")
	public boolean method16822(int arg0, byte[] arg1, int arg2, int arg3) {
		if (this.field10722 == arg0 && this.field10728 == arg2) {
			boolean var5 = true;
			for (int var6 = 0; var6 < this.field10727.length; var6++) {
				if (this.field10727[var6] != arg1[var6]) {
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
	public int method16823() {
		if (this.method6853() == null) {
			return this.field10743 == null ? 0 : this.field10743.method19446();
		} else {
			return 100;
		}
	}

	@ObfuscatedName("aij.e(B)Lpl;")
	public Js5ArchiveIndex method6853() {
		if (this.field10729 != null) {
			return this.field10729;
		}
		if (this.field10743 == null) {
			if (this.field10720.method7012()) {
				return null;
			}
			this.field10743 = this.field10720.method7011(255, this.field10733, (byte) 0, true);
		}
		if (this.field10743.field12344) {
			return null;
		}
		byte[] var1 = this.field10743.method19444();
		if (this.field10743 instanceof class1228) {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.field10729 = new Js5ArchiveIndex(var1, this.field10722, this.field10727);
				if (this.field10729.field4396 != this.field10728) {
					throw new RuntimeException();
				}
			} catch (RuntimeException var4) {
				this.field10729 = null;
				if (this.field10720.method7012()) {
					this.field10743 = null;
				} else {
					this.field10743 = this.field10720.method7011(255, this.field10733, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.field10729 = new Js5ArchiveIndex(var1, this.field10722, this.field10727);
			} catch (RuntimeException var5) {
				this.field10720.method7015(255, this.field10733);
				this.field10729 = null;
				if (this.field10720.method7012()) {
					this.field10743 = null;
				} else {
					this.field10743 = this.field10720.method7011(255, this.field10733, (byte) 0, true);
				}
				return null;
			}
			if (this.field10724 != null) {
				this.field10744.method6988(this.field10733, var1, this.field10724);
			}
		}
		this.field10743 = null;
		if (this.field10723 != null) {
			this.field10745 = new byte[this.field10729.field4392];
			this.field10740 = 0;
		}
		return this.field10729;
	}

	@ObfuscatedName("aij.n(II)[B")
	public byte[] method6854(int arg0) {
		Js5Request var2 = this.method16848(arg0, 0);
		if (var2 == null) {
			return null;
		} else {
			byte[] var3 = var2.method19444();
			var2.method8440();
			return var3;
		}
	}

	@ObfuscatedName("aij.q(IIB)Lask;")
	public Js5Request method16848(int arg0, int arg1) {
		Js5Request var3 = (Js5Request) this.field10731.method14495((long) arg0);
		if (var3 != null && arg1 == 0 && !var3.field12342 && var3.field12344) {
			var3.method8440();
			var3 = null;
		}
		if (var3 == null) {
			if (arg1 == 0) {
				if (this.field10723 != null && this.field10745[arg0] != -1) {
					var3 = this.field10744.method6997(arg0, this.field10723);
				} else if (this.field10721 == null) {
					if (this.field10720.method7012()) {
						return null;
					}
					var3 = this.field10720.method7011(this.field10733, arg0, (byte) 2, true);
				} else {
					var3 = this.field10721.method7068(this.field10733, arg0, (byte) 2, true, this.field10729.field4393[arg0], this.field10729.field4398[arg0]);
					if (var3 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.field10723 == null) {
					throw new RuntimeException();
				}
				var3 = this.field10744.method6996(arg0, this.field10723);
			} else if (arg1 == 2) {
				if (this.field10723 == null) {
					throw new RuntimeException();
				}
				if (this.field10745[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.field10721 != null) {
					return null;
				}
				if (this.field10720.method7028()) {
					return null;
				}
				var3 = this.field10720.method7011(this.field10733, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.field10731.method14501(var3, (long) arg0);
		}
		if (var3.field12344) {
			return null;
		}
		byte[] var4 = var3.method19444();
		if (!(var3 instanceof class1228)) {
			try {
				if (var4 == null || var4.length <= 2) {
					if (this.field10721 != null) {
						var3.method8440();
						return null;
					}
					throw new RuntimeException();
				}
				field10746.reset();
				field10746.update(var4, 0, var4.length - 2);
				int var13 = (int) field10746.getValue();
				if (this.field10729.field4393[arg0] != var13) {
					throw new RuntimeException();
				}
				if (this.field10729.field4395 != null && this.field10729.field4395[arg0] != null) {
					byte[] var14 = this.field10729.field4395[arg0];
					byte[] var15 = class735.method18308(var4, 0, var4.length - 2);
					for (int var16 = 0; var16 < 64; var16++) {
						if (var14[var16] != var15[var16]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.field10721 != null) {
					this.field10720.field4455 = 0;
					this.field10720.field4454 = 0;
				}
			} catch (RuntimeException var21) {
				this.field10720.method7015(this.field10733, arg0);
				var3.method8440();
				if (var3.field12342) {
					if (this.field10721 == null) {
						if (!this.field10720.method7012()) {
							Js5NetRequest var19 = this.field10720.method7011(this.field10733, arg0, (byte) 2, true);
							this.field10731.method14501(var19, (long) arg0);
						}
					} else if (!this.field10721.method7048()) {
						Js5HttpRequest var18 = this.field10721.method7068(this.field10733, arg0, (byte) 2, true, this.field10729.field4393[arg0], this.field10729.field4398[arg0]);
						if (var18 != null) {
							this.field10731.method14501(var18, (long) arg0);
						}
					}
				}
				return null;
			}
			var4[var4.length - 2] = (byte) (this.field10729.field4398[arg0] >>> 8);
			var4[var4.length - 1] = (byte) this.field10729.field4398[arg0];
			if (this.field10723 != null) {
				this.field10744.method6988(arg0, var4, this.field10723);
				if (this.field10745[arg0] != 1) {
					this.field10740++;
					this.field10745[arg0] = 1;
				}
			}
			if (!var3.field12342) {
				var3.method8440();
			}
			return var3;
		}
		try {
			if (var4 == null || var4.length <= 2) {
				throw new RuntimeException();
			}
			field10746.reset();
			field10746.update(var4, 0, var4.length - 2);
			int var5 = (int) field10746.getValue();
			if (this.field10729.field4393[arg0] != var5) {
				throw new RuntimeException();
			}
			if (this.field10729.field4395 != null && this.field10729.field4395[arg0] != null) {
				byte[] var6 = this.field10729.field4395[arg0];
				byte[] var7 = class735.method18308(var4, 0, var4.length - 2);
				for (int var8 = 0; var8 < 64; var8++) {
					if (var6[var8] != var7[var8]) {
						throw new RuntimeException();
					}
				}
			}
			int var9 = ((var4[var4.length - 2] & 0xFF) << 8) + (var4[var4.length - 1] & 0xFF);
			if ((this.field10729.field4398[arg0] & 0xFFFF) != var9) {
				throw new RuntimeException();
			}
			if (this.field10745[arg0] != 1) {
				if (this.field10745[arg0] == 0) {
				}
				this.field10740++;
				this.field10745[arg0] = 1;
			}
			if (!var3.field12342) {
				var3.method8440();
			}
			return var3;
		} catch (Exception var20) {
			this.field10745[arg0] = -1;
			var3.method8440();
			if (var3.field12342) {
				if (this.field10721 == null) {
					if (!this.field10720.method7012()) {
						Js5NetRequest var12 = this.field10720.method7011(this.field10733, arg0, (byte) 2, true);
						this.field10731.method14501(var12, (long) arg0);
					}
				} else if (!this.field10721.method7048()) {
					Js5HttpRequest var11 = this.field10721.method7068(this.field10733, arg0, (byte) 2, true, this.field10729.field4393[arg0], this.field10729.field4398[arg0]);
					if (var11 != null) {
						this.field10731.method14501(var11, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@ObfuscatedName("aij.x(I)V")
	public void method16833() {
		if (this.field10735 == null || this.method6853() == null) {
			return;
		}
		for (Node var1 = this.field10741.method14191(); var1 != null; var1 = this.field10741.method14161()) {
			int var2 = (int) var1.field6760;
			if (var2 < 0 || var2 >= this.field10729.field4392 || this.field10729.field4399[var2] == 0) {
				var1.method8440();
			} else {
				if (this.field10745[var2] == 0) {
					this.method16848(var2, 1);
				}
				if (this.field10745[var2] == -1) {
					this.method16848(var2, 2);
				}
				if (this.field10745[var2] == 1) {
					var1.method8440();
				}
			}
		}
	}

	@ObfuscatedName("aij.b(B)V")
	public void method16825() {
		if (this.field10735 != null) {
			if (this.method6853() == null) {
				return;
			}
			if (this.field10738) {
				boolean var1 = true;
				for (Node var2 = this.field10735.method14191(); var2 != null; var2 = this.field10735.method14161()) {
					int var3 = (int) var2.field6760;
					if (this.field10745[var3] == 0) {
						this.method16848(var3, 1);
					}
					if (this.field10745[var3] == 0) {
						var1 = false;
					} else {
						var2.method8440();
					}
				}
				while (this.field10739 < this.field10729.field4399.length) {
					if (this.field10729.field4399[this.field10739] == 0) {
						this.field10739++;
					} else {
						if (this.field10744.field4437 >= 250) {
							var1 = false;
							break;
						}
						if (this.field10745[this.field10739] == 0) {
							this.method16848(this.field10739, 1);
						}
						if (this.field10745[this.field10739] == 0) {
							Node var4 = new Node();
							var4.field6760 = (long) (this.field10739);
							this.field10735.method14153(var4);
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
				for (Node var6 = this.field10735.method14191(); var6 != null; var6 = this.field10735.method14161()) {
					int var7 = (int) var6.field6760;
					if (this.field10745[var7] != 1) {
						this.method16848(var7, 2);
					}
					if (this.field10745[var7] == 1) {
						var6.method8440();
					} else {
						var5 = false;
					}
				}
				while (this.field10739 < this.field10729.field4399.length) {
					if (this.field10729.field4399[this.field10739] == 0) {
						this.field10739++;
					} else {
						if (this.field10720.method7028()) {
							var5 = false;
							break;
						}
						if (this.field10745[this.field10739] != 1) {
							this.method16848(this.field10739, 2);
						}
						if (this.field10745[this.field10739] != 1) {
							Node var8 = new Node();
							var8.field6760 = (long) (this.field10739);
							this.field10735.method14153(var8);
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
		if (!this.field10748 || MonotonicTime.method3655() < this.field10734) {
			return;
		}
		for (Js5Request var9 = (Js5Request) this.field10731.method14500(); var9 != null; var9 = (Js5Request) this.field10731.method14502()) {
			if (!var9.field12344) {
				if (var9.field12343) {
					if (!var9.field12342) {
						throw new RuntimeException();
					}
					var9.method8440();
				} else {
					var9.field12343 = true;
				}
			}
		}
		this.field10734 = MonotonicTime.method3655() + 1000L;
	}

	@ObfuscatedName("aij.h(B)I")
	public int method16826() {
		return this.field10729 == null ? 0 : this.field10729.field4387;
	}

	@ObfuscatedName("aij.a(B)I")
	public int method16827() {
		return this.field10740;
	}

	@ObfuscatedName("aij.g(I)I")
	public int method16828() {
		if (this.field10729 == null) {
			return 0;
		} else if (this.field10738) {
			Node var1 = this.field10735.method14191();
			return var1 == null ? 0 : (int) var1.field6760;
		} else {
			return this.field10729.field4387;
		}
	}

	@ObfuscatedName("aij.i(I)V")
	public void method16829() {
		if (this.field10721 != null || this.field10723 == null) {
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
		for (Node var2 = this.field10741.method14191(); var2 != null; var2 = this.field10741.method14161()) {
			if (var2.field6760 == (long) arg0) {
				return;
			}
		}
		Node var3 = new Node();
		var3.field6760 = arg0;
		this.field10741.method14153(var3);
	}

	@ObfuscatedName("aij.k(II)I")
	public int method6855(int arg0) {
		Js5Request var2 = (Js5Request) this.field10731.method14495((long) arg0);
		return var2 == null ? 0 : var2.method19446();
	}

	@ObfuscatedName("aij.j(I)Z")
	public boolean method16837() {
		return this.field10737;
	}

	@ObfuscatedName("aij.t(ZS)V")
	public void method16832(boolean arg0) {
		this.field10721.method7053(arg0);
	}

	@ObfuscatedName("aij.ae(I)Z")
	public boolean method16830() {
		return this.field10721 != null;
	}
}
