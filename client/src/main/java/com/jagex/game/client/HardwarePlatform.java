package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

@ObfuscatedName("aly")
public class HardwarePlatform extends Node {

	@ObfuscatedName("aly.z")
	public int operatingSystem;

	@ObfuscatedName("aly.p")
	public boolean osArch64;

	@ObfuscatedName("aly.al")
	public int osVersion;

	@ObfuscatedName("aly.ad")
	public int javaVendor;

	@ObfuscatedName("aly.am")
	public int javaVersionMajor;

	@ObfuscatedName("aly.au")
	public int javaVersionMinor;

	@ObfuscatedName("aly.ar")
	public int javaVersionPatch;

	@ObfuscatedName("aly.ap")
	public boolean unused;

	@ObfuscatedName("aly.aq")
	public int maxMemory;

	@ObfuscatedName("aly.av")
	public int availableProcessors;

	@ObfuscatedName("aly.aj")
	public int cpuInfoRam;

	@ObfuscatedName("aly.ay")
	public int cpuInfoSpeed;

	@ObfuscatedName("aly.ab")
	public String gpuInfoDescription;

	@ObfuscatedName("aly.az")
	public String unused1;

	@ObfuscatedName("aly.aa")
	public String directXVersion;

	@ObfuscatedName("aly.af")
	public String unused2;

	@ObfuscatedName("aly.ak")
	public int dxDriverDateYear;

	@ObfuscatedName("aly.an")
	public int dxDriverDateMonth;

	@ObfuscatedName("aly.bf")
	public int rawCpuInfoProcessors;

	@ObfuscatedName("aly.bl")
	public int rawCpuInfoProcessors2;

	@ObfuscatedName("aly.bk")
	public String rawCpuInfoVendor;

	@ObfuscatedName("aly.bh")
	public String rawCpuInfoDescription;

	@ObfuscatedName("aly.bx")
	public int[] rawCpuInfoUnknown = new int[3];

	@ObfuscatedName("aly.bd")
	public int rawCpuInfoUnknown1;

	@ObfuscatedName("aly.bc")
	public String unused3;

	public HardwarePlatform(boolean arg0) {
		if (arg0) {
			if (GameShell.osName.startsWith("win")) {
				this.operatingSystem = 1;
			} else if (GameShell.osName.startsWith("mac")) {
				this.operatingSystem = 2;
			} else if (GameShell.osName.startsWith("linux")) {
				this.operatingSystem = 3;
			} else {
				this.operatingSystem = 4;
			}
			if (GameShell.osArchRaw.startsWith("amd64") || GameShell.osArchRaw.startsWith("x86_64")) {
				this.osArch64 = true;
			} else {
				this.osArch64 = false;
			}
			if (this.operatingSystem == 1) {
				if (GameShell.osVersionRaw.indexOf("4.0") != -1) {
					this.osVersion = 1;
				} else if (GameShell.osVersionRaw.indexOf("4.1") != -1) {
					this.osVersion = 2;
				} else if (GameShell.osVersionRaw.indexOf("4.9") != -1) {
					this.osVersion = 3;
				} else if (GameShell.osVersionRaw.indexOf("5.0") != -1) {
					this.osVersion = 4;
				} else if (GameShell.osVersionRaw.indexOf("5.1") != -1) {
					this.osVersion = 5;
				} else if (GameShell.osVersionRaw.indexOf("5.2") != -1) {
					this.osVersion = 8;
				} else if (GameShell.osVersionRaw.indexOf("6.0") != -1) {
					this.osVersion = 6;
				} else if (GameShell.osVersionRaw.indexOf("6.1") != -1) {
					this.osVersion = 7;
				} else if (GameShell.osVersionRaw.indexOf("6.2") != -1) {
					this.osVersion = 9;
				} else if (GameShell.osVersionRaw.indexOf("6.3") != -1) {
					this.osVersion = 10;
				} else if (GameShell.osVersionRaw.indexOf("10.0") != -1) {
					this.osVersion = 11;
				}
			} else if (this.operatingSystem == 2) {
				if (GameShell.osVersionRaw.indexOf("10.4") != -1) {
					this.osVersion = 20;
				} else if (GameShell.osVersionRaw.indexOf("10.5") != -1) {
					this.osVersion = 21;
				} else if (GameShell.osVersionRaw.indexOf("10.6") != -1) {
					this.osVersion = 22;
				} else if (GameShell.osVersionRaw.indexOf("10.7") != -1) {
					this.osVersion = 23;
				} else if (GameShell.osVersionRaw.indexOf("10.8") != -1) {
					this.osVersion = 24;
				} else if (GameShell.osVersionRaw.indexOf("10.9") != -1) {
					this.osVersion = 25;
				} else if (GameShell.osVersionRaw.indexOf("10.10") != -1) {
					this.osVersion = 26;
				} else if (GameShell.osVersionRaw.indexOf("10.11") != -1) {
					this.osVersion = 27;
				}
			}
			if (GameShell.javaVendor.toLowerCase().indexOf("sun") != -1) {
				this.javaVendor = 1;
			} else if (GameShell.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
				this.javaVendor = 2;
			} else if (GameShell.javaVendor.toLowerCase().indexOf("apple") != -1) {
				this.javaVendor = 3;
			} else if (GameShell.javaVendor.toLowerCase().indexOf("oracle") == -1) {
				this.javaVendor = 4;
			} else {
				this.javaVendor = 5;
			}
			int var2 = 2;
			int var3 = 0;
			try {
				while (var2 < GameShell.javaVersion.length()) {
					char var4 = GameShell.javaVersion.charAt(var2);
					if (var4 < '0' || var4 > '9') {
						break;
					}
					var3 = var3 * 10 + (var4 - '0');
					var2++;
				}
			} catch (Exception var48) {
			}
			this.javaVersionMajor = var3;
			int var6 = GameShell.javaVersion.indexOf(46, 2) + 1;
			int var7 = 0;
			try {
				while (var6 < GameShell.javaVersion.length()) {
					char var8 = GameShell.javaVersion.charAt(var6);
					if (var8 < '0' || var8 > '9') {
						break;
					}
					var7 = var7 * 10 + (var8 - '0');
					var6++;
				}
			} catch (Exception var47) {
			}
			this.javaVersionMinor = var7;
			int var10 = GameShell.javaVersion.indexOf(95, 4) + 1;
			int var11 = 0;
			try {
				while (var10 < GameShell.javaVersion.length()) {
					char var12 = GameShell.javaVersion.charAt(var10);
					if (var12 < '0' || var12 > '9') {
						break;
					}
					var11 = var11 * 10 + (var12 - '0');
					var10++;
				}
			} catch (Exception var46) {
			}
			this.javaVersionPatch = var11;
			this.unused = false;
			this.maxMemory = GameShell.maxmemory;
			if (this.javaVersionMajor > 3) {
				this.availableProcessors = GameShell.cpucount;
			} else {
				this.availableProcessors = 0;
			}
			try {
				int[] var14 = HardwareInfo.getCPUInfo();
				if (var14 != null && var14.length == 3) {
					this.rawCpuInfoProcessors = var14[0];
					this.cpuInfoSpeed = var14[1];
					this.cpuInfoRam = var14[2];
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
						RawCpuInfo var23 = new RawCpuInfo(var18, var19, var20, var21, var22);
						var16.put(var18, var23);
					}
					RawCpuInfo var24 = (RawCpuInfo) var16.get(0);
					if (var24 != null) {
						Packet var25 = new Packet(13);
						var25.ip4(var24.rawCpuInfo2);
						var25.ip4(var24.rawCpuInfo4);
						var25.ip4(var24.rawCpuInfo3);
						var25.pos = 0;
						this.rawCpuInfoVendor = var25.gjstr();
					}
					RawCpuInfo var26 = (RawCpuInfo) var16.get(1);
					if (var26 != null) {
						this.rawCpuInfoUnknown1 = var26.rawCpuInfo1;
						int var27 = var26.rawCpuInfo2;
						this.rawCpuInfoProcessors2 = var27 >> 16 & 0xFF;
						this.rawCpuInfoUnknown[0] = var26.rawCpuInfo3;
						this.rawCpuInfoUnknown[1] = var26.rawCpuInfo4;
					}
					RawCpuInfo var28 = (RawCpuInfo) var16.get(-2147483647);
					if (var28 != null) {
						this.rawCpuInfoUnknown[2] = var28.rawCpuInfo4;
					}
					Packet var29 = new Packet(49);
					for (int var30 = -2147483646; var30 <= -2147483644; var30++) {
						RawCpuInfo var31 = (RawCpuInfo) var16.get(var30);
						if (var31 != null) {
							var29.ip4(var31.rawCpuInfo1);
							var29.ip4(var31.rawCpuInfo2);
							var29.ip4(var31.rawCpuInfo3);
							var29.ip4(var31.rawCpuInfo4);
						}
					}
					var29.pos = 0;
					this.rawCpuInfoDescription = var29.gjstr();
				}
				String[][] var32 = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (var32 != null && var32.length > 0 && var32[0] != null) {
					for (int var33 = 0; var33 < var32[0].length; var33 += 2) {
						if (var32[0][var33].equalsIgnoreCase("szDescription")) {
							this.gpuInfoDescription = var32[0][var33 + 1];
						} else if (var32[0][var33].equalsIgnoreCase("szDriverDateEnglish")) {
							String var34 = var32[0][var33 + 1];
							try {
								int var35 = var34.indexOf("/");
								int var36 = var34.indexOf("/", var35 + 1);
								this.dxDriverDateMonth = Integer.parseInt(var34.substring(0, var35));
								this.dxDriverDateYear = Integer.parseInt(var34.substring(var36 + 1, var34.indexOf(" ", var36)));
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
					this.directXVersion = var39 + "." + var40 + var41;
				}
			} catch (Throwable var45) {
				this.cpuInfoRam = 0;
			}
		}
		if (this.gpuInfoDescription == null) {
			this.gpuInfoDescription = "";
		}
		if (this.unused1 == null) {
			this.unused1 = "";
		}
		if (this.directXVersion == null) {
			this.directXVersion = "";
		}
		if (this.unused2 == null) {
			this.unused2 = "";
		}
		if (this.rawCpuInfoVendor == null) {
			this.rawCpuInfoVendor = "";
		}
		if (this.rawCpuInfoDescription == null) {
			this.rawCpuInfoDescription = "";
		}
		if (this.unused3 == null) {
			this.unused3 = "";
		}
		this.method18187();
	}

	@ObfuscatedName("aly.e(S)V")
	public void method18187() {
		if (this.gpuInfoDescription.length() > 40) {
			this.gpuInfoDescription = this.gpuInfoDescription.substring(0, 40);
		}
		if (this.unused1.length() > 40) {
			this.unused1 = this.unused1.substring(0, 40);
		}
		if (this.directXVersion.length() > 10) {
			this.directXVersion = this.directXVersion.substring(0, 10);
		}
		if (this.unused2.length() > 10) {
			this.unused2 = this.unused2.substring(0, 10);
		}
		if (this.unused3.length() > 120) {
			this.unused3 = this.unused3.substring(0, 120);
		}
	}

	@ObfuscatedName("aly.n(Lalw;I)V")
	public void createHardwareBlock(Packet buf) {
		buf.p1(8);
		buf.p1(this.operatingSystem);
		buf.p1(this.osArch64 ? 1 : 0);
		buf.p2(this.osVersion);
		buf.p1(this.javaVendor);
		buf.p1(this.javaVersionMajor);
		buf.p1(this.javaVersionMinor);
		buf.p1(this.javaVersionPatch);
		buf.p1(this.unused ? 1 : 0);
		buf.p2(this.maxMemory);
		buf.p1(this.availableProcessors);
		buf.p3(this.cpuInfoRam);
		buf.p2(this.cpuInfoSpeed);
		buf.pjstr2(this.gpuInfoDescription);
		buf.pjstr2(this.unused1);
		buf.pjstr2(this.directXVersion);
		buf.pjstr2(this.unused2);
		buf.p1(this.dxDriverDateMonth);
		buf.p2(this.dxDriverDateYear);
		buf.pjstr2(this.rawCpuInfoVendor);
		buf.pjstr2(this.rawCpuInfoDescription);
		buf.p1(this.rawCpuInfoProcessors);
		buf.p1(this.rawCpuInfoProcessors2);
		for (int var2 = 0; var2 < this.rawCpuInfoUnknown.length; var2++) {
			buf.p4(this.rawCpuInfoUnknown[var2]);
		}
		buf.p4(this.rawCpuInfoUnknown1);
		buf.pjstr2(this.unused3);
	}

	@ObfuscatedName("aly.m(I)I")
	public int calculateHardwarePlatformSize() {
		byte var1 = 39;
		int var2 = var1 + Packet.method8398(this.gpuInfoDescription);
		int var3 = var2 + Packet.method8398(this.unused1);
		int var4 = var3 + Packet.method8398(this.directXVersion);
		int var5 = var4 + Packet.method8398(this.unused2);
		int var6 = var5 + Packet.method8398(this.rawCpuInfoVendor);
		int var7 = var6 + Packet.method8398(this.rawCpuInfoDescription);
		return var7 + Packet.method8398(this.unused3);
	}
}
