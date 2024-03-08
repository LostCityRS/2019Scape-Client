package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ws")
public class class629 {

	@ObfuscatedName("ws.n")
	public int field7758 = 4;

	@ObfuscatedName("ws.m")
	public int[] field7716 = null;

	@ObfuscatedName("ws.k")
	public int[] field7717 = null;

	@ObfuscatedName("ws.w")
	public int field7719 = 4;

	@ObfuscatedName("ws.u")
	public int field7745 = 4;

	@ObfuscatedName("ws.p")
	public int field7723 = 7;

	@ObfuscatedName("ws.d")
	public int field7738 = -1;

	@ObfuscatedName("ws.c")
	public int field7724 = -1;

	@ObfuscatedName("ws.r")
	public int field7726 = -1;

	@ObfuscatedName("ws.v")
	public boolean field7727 = true;

	@ObfuscatedName("ws.o")
	public short field7728 = -1;

	@ObfuscatedName("ws.s")
	public byte field7757 = 0;

	@ObfuscatedName("ws.y")
	public int field7730 = 100;

	@ObfuscatedName("ws.q")
	public short[][] field7731;

	@ObfuscatedName("ws.x")
	public short[][][] field7729;

	@ObfuscatedName("ws.b")
	public short[][] field7714;

	@ObfuscatedName("ws.h")
	public short[][][] field7734;

	@ObfuscatedName("ws.a")
	public boolean field7735 = true;

	@ObfuscatedName("ws.g")
	public int field7754 = 2;

	@ObfuscatedName("ws.i")
	public boolean field7737 = true;

	@ObfuscatedName("ws.j")
	public int field7759 = 3;

	@ObfuscatedName("ws.t")
	public int field7739 = -1;

	@ObfuscatedName("ws.ae")
	public int field7740 = -1;

	@ObfuscatedName("ws.ag")
	public boolean field7749;

	@ObfuscatedName("ws.ah")
	public int field7742 = 16776960;

	@ObfuscatedName("ws.al")
	public int field7743 = 16777215;

	@ObfuscatedName("ws.ac")
	public int field7744 = 65408;

	@ObfuscatedName("ws.ai")
	public int field7733 = -1;

	@ObfuscatedName("ws.aw")
	public int field7746 = -1;

	@ObfuscatedName("ws.as")
	public int field7747 = -1;

	@ObfuscatedName("ws.at")
	public int field7748 = -1;

	@ObfuscatedName("ws.ad")
	public int field7715 = -1;

	@ObfuscatedName("ws.am")
	public int field7750 = -1;

	@ObfuscatedName("ws.au")
	public int field7751;

	@ObfuscatedName("ws.ar")
	public int field7752;

	@ObfuscatedName("ws.ap")
	public int field7753 = -1;

	@ObfuscatedName("ws.aq")
	public int field7732 = -1;

	@ObfuscatedName("ws.ax")
	public int field7755 = -1;

	@ObfuscatedName("ws.av")
	public int field7756 = -1;

	@ObfuscatedName("ws.ao")
	public int field7720 = -1;

	@ObfuscatedName("ws.aj")
	public int field7721 = -1;

	@ObfuscatedName("ws.ay")
	public int field7741 = -1;

	public class629(class442 arg0) {
		byte[] var2 = arg0.method6894(class628.field7703.field7708);
		this.method9876(new class997(var2));
	}

	@ObfuscatedName("ws.e(Lalw;B)V")
	public void method9876(class997 arg0) {
		boolean var2 = false;
		while (true) {
			while (true) {
				int var3 = arg0.method17904();
				if (var3 == 0) {
					if (!var2) {
						if (this.field7716 == null) {
							this.field7758 = 4;
							this.field7716 = new int[4];
							this.field7717 = new int[4];
						}
						for (int var4 = 0; var4 < this.field7716.length; var4++) {
							this.field7716[var4] = 0;
							this.field7717[var4] = var4 * 20;
						}
					}
					return;
				}
				if (var3 == 1) {
					if (this.field7716 == null) {
						this.field7758 = 4;
						this.field7716 = new int[4];
						this.field7717 = new int[4];
					}
					for (int var5 = 0; var5 < this.field7716.length; var5++) {
						this.field7716[var5] = arg0.method17973();
						this.field7717[var5] = arg0.method17973();
					}
					var2 = true;
				} else if (var3 == 2) {
					this.field7738 = arg0.method17927();
				} else if (var3 == 3) {
					this.field7758 = arg0.method17904();
					this.field7716 = new int[this.field7758];
					this.field7717 = new int[this.field7758];
				} else if (var3 == 4) {
					this.field7727 = false;
				} else if (var3 == 5) {
					this.field7724 = arg0.method17908();
				} else if (var3 == 6) {
					this.field7726 = arg0.method17908();
				} else if (var3 == 7) {
					this.field7731 = new short[10][4];
					this.field7729 = new short[10][4][];
					for (int var6 = 0; var6 < 10; var6++) {
						for (int var7 = 0; var7 < 4; var7++) {
							int var8 = arg0.method17906();
							if (var8 == 65535) {
								var8 = -1;
							}
							this.field7731[var6][var7] = (short) var8;
							int var9 = arg0.method17906();
							this.field7729[var6][var7] = new short[var9];
							for (int var10 = 0; var10 < var9; var10++) {
								int var11 = arg0.method17906();
								if (var11 == 65535) {
									var11 = -1;
								}
								this.field7729[var6][var7][var10] = (short) var11;
							}
						}
					}
				} else if (var3 == 8) {
					this.field7735 = false;
				} else if (var3 == 9) {
					this.field7754 = arg0.method17904();
				} else if (var3 == 10) {
					this.field7737 = false;
				} else if (var3 == 11) {
					this.field7759 = arg0.method17904();
				} else if (var3 == 12) {
					this.field7739 = arg0.method17906();
					this.field7740 = arg0.method17906();
				} else if (var3 == 13) {
					this.field7745 = arg0.method17904();
				} else if (var3 == 14) {
					this.field7719 = arg0.method17904();
				} else if (var3 == 15) {
					this.field7723 = arg0.method17904();
				} else if (var3 == 16) {
					this.field7749 = true;
				} else if (var3 == 17) {
					this.field7742 = arg0.method17910();
				} else if (var3 == 18) {
					this.field7743 = arg0.method17910();
				} else if (var3 == 19) {
					this.field7744 = arg0.method17910();
				} else if (var3 == 20) {
					this.field7728 = (short) arg0.method17906();
					this.field7757 = (byte) arg0.method17904();
				} else if (var3 == 21) {
					this.field7730 = arg0.method17904();
				} else if (var3 == 22) {
					this.field7733 = arg0.method17927();
					this.field7746 = arg0.method17927();
					this.field7747 = arg0.method17927();
					this.field7748 = arg0.method17927();
					this.field7715 = arg0.method17927();
					this.field7750 = arg0.method17927();
					this.field7751 = arg0.method17905();
					this.field7752 = arg0.method17905();
					this.field7753 = arg0.method17927();
					this.field7732 = arg0.method17927();
					this.field7755 = arg0.method17927();
					this.field7756 = arg0.method17927();
					this.field7720 = arg0.method17927();
					this.field7721 = arg0.method17927();
					this.field7741 = arg0.method17927();
				} else if (var3 == 23) {
					this.field7714 = new short[10][4];
					this.field7734 = new short[10][4][];
					for (int var12 = 0; var12 < 10; var12++) {
						for (int var13 = 0; var13 < 4; var13++) {
							int var14 = arg0.method17906();
							if (var14 == 65535) {
								var14 = -1;
							}
							this.field7714[var12][var13] = (short) var14;
							int var15 = arg0.method17906();
							this.field7734[var12][var13] = new short[var15];
							for (int var16 = 0; var16 < var15; var16++) {
								int var17 = arg0.method17906();
								if (var17 == 65535) {
									var17 = -1;
								}
								this.field7734[var12][var13][var16] = (short) var17;
							}
						}
					}
				}
			}
		}
	}
}
