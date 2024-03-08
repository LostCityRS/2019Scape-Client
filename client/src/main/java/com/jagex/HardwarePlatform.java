package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

@ObfuscatedName("aly")
public class HardwarePlatform extends class532 {

	@ObfuscatedName("aly.z")
	public int field11616;

	@ObfuscatedName("aly.p")
	public boolean field11578;

	@ObfuscatedName("aly.al")
	public int field11598;

	@ObfuscatedName("aly.ad")
	public int field11604;

	@ObfuscatedName("aly.am")
	public int field11602;

	@ObfuscatedName("aly.au")
	public int field11606;

	@ObfuscatedName("aly.ar")
	public int field11592;

	@ObfuscatedName("aly.ap")
	public boolean field11608;

	@ObfuscatedName("aly.aq")
	public int field11577;

	@ObfuscatedName("aly.av")
	public int field11611;

	@ObfuscatedName("aly.aj")
	public int field11613;

	@ObfuscatedName("aly.ay")
	public int field11614;

	@ObfuscatedName("aly.ab")
	public String field11597;

	@ObfuscatedName("aly.az")
	public String field11627;

	@ObfuscatedName("aly.aa")
	public String field11617;

	@ObfuscatedName("aly.af")
	public String field11618;

	@ObfuscatedName("aly.ak")
	public int field11619;

	@ObfuscatedName("aly.an")
	public int field11620;

	@ObfuscatedName("aly.bf")
	public int field11589;

	@ObfuscatedName("aly.bl")
	public int field11622;

	@ObfuscatedName("aly.bk")
	public String field11623;

	@ObfuscatedName("aly.bh")
	public String field11624;

	@ObfuscatedName("aly.bx")
	public int[] field11625 = new int[3];

	@ObfuscatedName("aly.bd")
	public int field11626;

	@ObfuscatedName("aly.bc")
	public String field11585;

	public HardwarePlatform(boolean arg0) {
		if (arg0) {
			if (Statics.field2601.startsWith("win")) {
				this.field11616 = 1;
			} else if (Statics.field2601.startsWith("mac")) {
				this.field11616 = 2;
			} else if (Statics.field2601.startsWith("linux")) {
				this.field11616 = 3;
			} else {
				this.field11616 = 4;
			}
			if (Statics.field2153.startsWith("amd64") || Statics.field2153.startsWith("x86_64")) {
				this.field11578 = true;
			} else {
				this.field11578 = false;
			}
			if (this.field11616 == 1) {
				if (Statics.field7881.indexOf("4.0") != -1) {
					this.field11598 = 1;
				} else if (Statics.field7881.indexOf("4.1") != -1) {
					this.field11598 = 2;
				} else if (Statics.field7881.indexOf("4.9") != -1) {
					this.field11598 = 3;
				} else if (Statics.field7881.indexOf("5.0") != -1) {
					this.field11598 = 4;
				} else if (Statics.field7881.indexOf("5.1") != -1) {
					this.field11598 = 5;
				} else if (Statics.field7881.indexOf("5.2") != -1) {
					this.field11598 = 8;
				} else if (Statics.field7881.indexOf("6.0") != -1) {
					this.field11598 = 6;
				} else if (Statics.field7881.indexOf("6.1") != -1) {
					this.field11598 = 7;
				} else if (Statics.field7881.indexOf("6.2") != -1) {
					this.field11598 = 9;
				} else if (Statics.field7881.indexOf("6.3") != -1) {
					this.field11598 = 10;
				} else if (Statics.field7881.indexOf("10.0") != -1) {
					this.field11598 = 11;
				}
			} else if (this.field11616 == 2) {
				if (Statics.field7881.indexOf("10.4") != -1) {
					this.field11598 = 20;
				} else if (Statics.field7881.indexOf("10.5") != -1) {
					this.field11598 = 21;
				} else if (Statics.field7881.indexOf("10.6") != -1) {
					this.field11598 = 22;
				} else if (Statics.field7881.indexOf("10.7") != -1) {
					this.field11598 = 23;
				} else if (Statics.field7881.indexOf("10.8") != -1) {
					this.field11598 = 24;
				} else if (Statics.field7881.indexOf("10.9") != -1) {
					this.field11598 = 25;
				} else if (Statics.field7881.indexOf("10.10") != -1) {
					this.field11598 = 26;
				} else if (Statics.field7881.indexOf("10.11") != -1) {
					this.field11598 = 27;
				}
			}
			if (Statics.field3182.toLowerCase().indexOf("sun") != -1) {
				this.field11604 = 1;
			} else if (Statics.field3182.toLowerCase().indexOf("microsoft") != -1) {
				this.field11604 = 2;
			} else if (Statics.field3182.toLowerCase().indexOf("apple") != -1) {
				this.field11604 = 3;
			} else if (Statics.field3182.toLowerCase().indexOf("oracle") == -1) {
				this.field11604 = 4;
			} else {
				this.field11604 = 5;
			}
			int var2 = 2;
			int var3 = 0;
			try {
				while (var2 < Statics.field628.length()) {
					char var4 = Statics.field628.charAt(var2);
					if (var4 < '0' || var4 > '9') {
						break;
					}
					var3 = var3 * 10 + (var4 - '0');
					var2++;
				}
			} catch (Exception var48) {
			}
			this.field11602 = var3;
			int var6 = Statics.field628.indexOf(46, 2) + 1;
			int var7 = 0;
			try {
				while (var6 < Statics.field628.length()) {
					char var8 = Statics.field628.charAt(var6);
					if (var8 < '0' || var8 > '9') {
						break;
					}
					var7 = var7 * 10 + (var8 - '0');
					var6++;
				}
			} catch (Exception var47) {
			}
			this.field11606 = var7;
			int var10 = Statics.field628.indexOf(95, 4) + 1;
			int var11 = 0;
			try {
				while (var10 < Statics.field628.length()) {
					char var12 = Statics.field628.charAt(var10);
					if (var12 < '0' || var12 > '9') {
						break;
					}
					var11 = var11 * 10 + (var12 - '0');
					var10++;
				}
			} catch (Exception var46) {
			}
			this.field11592 = var11;
			this.field11608 = false;
			this.field11577 = GameShell.field6616;
			if (this.field11602 > 3) {
				this.field11611 = GameShell.field6623;
			} else {
				this.field11611 = 0;
			}
			try {
				int[] var14 = HardwareInfo.getCPUInfo();
				if (var14 != null && var14.length == 3) {
					this.field11589 = var14[0];
					this.field11614 = var14[1];
					this.field11613 = var14[2];
				}
				int[] var15 = HardwareInfo.getRawCPUInfo();
				if (var15 != null && var15.length % 5 == 0) {
					HashMap var16 = new HashMap();
					for (int var17 = 0; var17 < var15.length / 5; var17++) {
						int var18 = var15[var17 * 5];
						int var19 = var15[var17 * 5 + 1];
						int var20 = var15[var17 * 5 + 2];
						int var21 = var15[var17 * 5 + 3];
						int var22 = var15[var17 * 5 + 4];
						class756 var23 = new class756(var18, var19, var20, var21, var22);
						var16.put(var18, var23);
					}
					class756 var24 = (class756) var16.get(0);
					if (var24 != null) {
						Packet var25 = new Packet(13);
						var25.ip4(var24.field8788);
						var25.ip4(var24.field8791);
						var25.ip4(var24.field8790);
						var25.pos = 0;
						this.field11623 = var25.gjstr();
					}
					class756 var26 = (class756) var16.get(1);
					if (var26 != null) {
						this.field11626 = var26.field8787;
						int var27 = var26.field8788;
						this.field11622 = var27 >> 16 & 0xFF;
						this.field11625[0] = var26.field8790;
						this.field11625[1] = var26.field8791;
					}
					class756 var28 = (class756) var16.get(-2147483647);
					if (var28 != null) {
						this.field11625[2] = var28.field8791;
					}
					Packet var29 = new Packet(49);
					for (int var30 = -2147483646; var30 <= -2147483644; var30++) {
						class756 var31 = (class756) var16.get(var30);
						if (var31 != null) {
							var29.ip4(var31.field8787);
							var29.ip4(var31.field8788);
							var29.ip4(var31.field8790);
							var29.ip4(var31.field8791);
						}
					}
					var29.pos = 0;
					this.field11624 = var29.gjstr();
				}
				String[][] var32 = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (var32 != null && var32.length > 0 && var32[0] != null) {
					for (int var33 = 0; var33 < var32[0].length; var33 += 2) {
						if (var32[0][var33].equalsIgnoreCase("szDescription")) {
							this.field11597 = var32[0][var33 + 1];
						} else if (var32[0][var33].equalsIgnoreCase("szDriverDateEnglish")) {
							String var34 = var32[0][var33 + 1];
							try {
								int var35 = var34.indexOf("/");
								int var36 = var34.indexOf("/", var35 + 1);
								this.field11620 = Integer.parseInt(var34.substring(0, var35));
								this.field11619 = Integer.parseInt(var34.substring(var36 + 1, var34.indexOf(" ", var36)));
							} catch (Exception var44) {
							}
						}
					}
				}
				String[] var38 = HardwareInfo.getDXDiagSystemProps();
				if (var38 != null) {
					String var39 = "";
					String var40 = "";
					String var41 = "";
					for (int var42 = 0; var42 < var38.length; var42 += 2) {
						if (var38[var42].equalsIgnoreCase("dwDirectXVersionMajor")) {
							var39 = var38[var42 + 1];
						} else if (var38[var42].equalsIgnoreCase("dwDirectXVersionMinor")) {
							var40 = var38[var42 + 1];
						} else if (var38[var42].equalsIgnoreCase("dwDirectXVersionLetter")) {
							var41 = var38[var42 + 1];
						}
					}
					this.field11617 = var39 + "." + var40 + var41;
				}
			} catch (Throwable var45) {
				this.field11613 = 0;
			}
		}
		if (this.field11597 == null) {
			this.field11597 = "";
		}
		if (this.field11627 == null) {
			this.field11627 = "";
		}
		if (this.field11617 == null) {
			this.field11617 = "";
		}
		if (this.field11618 == null) {
			this.field11618 = "";
		}
		if (this.field11623 == null) {
			this.field11623 = "";
		}
		if (this.field11624 == null) {
			this.field11624 = "";
		}
		if (this.field11585 == null) {
			this.field11585 = "";
		}
		this.method18187();
	}

	@ObfuscatedName("aly.e(S)V")
	public void method18187() {
		if (this.field11597.length() > 40) {
			this.field11597 = this.field11597.substring(0, 40);
		}
		if (this.field11627.length() > 40) {
			this.field11627 = this.field11627.substring(0, 40);
		}
		if (this.field11617.length() > 10) {
			this.field11617 = this.field11617.substring(0, 10);
		}
		if (this.field11618.length() > 10) {
			this.field11618 = this.field11618.substring(0, 10);
		}
		if (this.field11585.length() > 120) {
			this.field11585 = this.field11585.substring(0, 120);
		}
	}

	@ObfuscatedName("aly.n(Lalw;I)V")
	public void method18188(Packet arg0) {
		arg0.p1(8);
		arg0.p1(this.field11616);
		arg0.p1(this.field11578 ? 1 : 0);
		arg0.p2(this.field11598);
		arg0.p1(this.field11604);
		arg0.p1(this.field11602);
		arg0.p1(this.field11606);
		arg0.p1(this.field11592);
		arg0.p1(this.field11608 ? 1 : 0);
		arg0.p2(this.field11577);
		arg0.p1(this.field11611);
		arg0.p3(this.field11613);
		arg0.p2(this.field11614);
		arg0.pjstr2(this.field11597);
		arg0.pjstr2(this.field11627);
		arg0.pjstr2(this.field11617);
		arg0.pjstr2(this.field11618);
		arg0.p1(this.field11620);
		arg0.p2(this.field11619);
		arg0.pjstr2(this.field11623);
		arg0.pjstr2(this.field11624);
		arg0.p1(this.field11589);
		arg0.p1(this.field11622);
		for (int var2 = 0; var2 < this.field11625.length; var2++) {
			arg0.p4(this.field11625[var2]);
		}
		arg0.p4(this.field11626);
		arg0.pjstr2(this.field11585);
	}

	@ObfuscatedName("aly.m(I)I")
	public int method18189() {
		byte var1 = 39;
		int var2 = var1 + Packet.method8398(this.field11597);
		int var3 = var2 + Packet.method8398(this.field11627);
		int var4 = var3 + Packet.method8398(this.field11617);
		int var5 = var4 + Packet.method8398(this.field11618);
		int var6 = var5 + Packet.method8398(this.field11623);
		int var7 = var6 + Packet.method8398(this.field11624);
		return var7 + Packet.method8398(this.field11585);
	}
}
