package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ws")
public class GraphicsDefaults {

	@ObfuscatedName("ws.n")
	public int maxhitmarks = 4;

	@ObfuscatedName("ws.m")
	public int[] hitmarkpos_x = null;

	@ObfuscatedName("ws.k")
	public int[] hitmarkpos_y = null;

	@ObfuscatedName("ws.w")
	public int field7719 = 4;

	@ObfuscatedName("ws.u")
	public int field7745 = 4;

	@ObfuscatedName("ws.p")
	public int field7723 = 7;

	@ObfuscatedName("ws.d")
	public int performancemetricsmodel = -1;

	@ObfuscatedName("ws.c")
	public int login_interface = -1;

	@ObfuscatedName("ws.r")
	public int lobby_interface = -1;

	@ObfuscatedName("ws.v")
	public boolean field7727 = true;

	@ObfuscatedName("ws.o")
	public short spotshadowtexture = -1;

	@ObfuscatedName("ws.s")
	public byte spotshadowtexture_alpha = 0;

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
	public boolean npcShouldDisplayChat = true;

	@ObfuscatedName("ws.g")
	public int npcChatTimeout = 2;

	@ObfuscatedName("ws.i")
	public boolean playerShouldDisplayChat = true;

	@ObfuscatedName("ws.j")
	public int playerChatTimeout = 3;

	@ObfuscatedName("ws.t")
	public int field7739 = -1;

	@ObfuscatedName("ws.ae")
	public int field7740 = -1;

	@ObfuscatedName("ws.ag")
	public boolean field7749;

	@ObfuscatedName("ws.ah")
	public int invHundredColor = 0xFFFF00;

	@ObfuscatedName("ws.al")
	public int invThousandColor = 0xFFFFFF;

	@ObfuscatedName("ws.ac")
	public int invMillionColor = 0x00FF80;

	@ObfuscatedName("ws.ai")
	public int p11_full = -1;

	@ObfuscatedName("ws.aw")
	public int p12_full = -1;

	@ObfuscatedName("ws.as")
	public int b12_full = -1;

	@ObfuscatedName("ws.at")
	public int hintarrows = -1;

	@ObfuscatedName("ws.ad")
	public int field7715 = -1;

	@ObfuscatedName("ws.am")
	public int mapflag = -1;

	@ObfuscatedName("ws.au")
	public int field7751;

	@ObfuscatedName("ws.ar")
	public int field7752;

	@ObfuscatedName("ws.ap")
	public int cross = -1;

	@ObfuscatedName("ws.aq")
	public int mapdots = -1;

	@ObfuscatedName("ws.ax")
	public int field7755 = -1;

	@ObfuscatedName("ws.av")
	public int field7756 = -1;

	@ObfuscatedName("ws.ao")
	public int compass = -1;

	@ObfuscatedName("ws.aj")
	public int field7721 = -1;

	@ObfuscatedName("ws.ay")
	public int field7741 = -1;

	public GraphicsDefaults(Js5 js5) {
		byte[] bytes = js5.fetchFile(DefaultsGroup.GRAPHICS.js5GroupId);
		this.decode(new Packet(bytes));
	}

	@ObfuscatedName("ws.e(Lalw;B)V")
	public void decode(Packet buf) {
		boolean var2 = false;
		while (true) {
			while (true) {
				int var3 = buf.g1();
				if (var3 == 0) {
					if (!var2) {
						if (this.hitmarkpos_x == null) {
							this.maxhitmarks = 4;
							this.hitmarkpos_x = new int[4];
							this.hitmarkpos_y = new int[4];
						}
						for (int var4 = 0; var4 < this.hitmarkpos_x.length; var4++) {
							this.hitmarkpos_x[var4] = 0;
							this.hitmarkpos_y[var4] = var4 * 20;
						}
					}
					return;
				}
				if (var3 == 1) {
					if (this.hitmarkpos_x == null) {
						this.maxhitmarks = 4;
						this.hitmarkpos_x = new int[4];
						this.hitmarkpos_y = new int[4];
					}
					for (int var5 = 0; var5 < this.hitmarkpos_x.length; var5++) {
						this.hitmarkpos_x[var5] = buf.g2s();
						this.hitmarkpos_y[var5] = buf.g2s();
					}
					var2 = true;
				} else if (var3 == 2) {
					this.performancemetricsmodel = buf.gSmart2or4null();
				} else if (var3 == 3) {
					this.maxhitmarks = buf.g1();
					this.hitmarkpos_x = new int[this.maxhitmarks];
					this.hitmarkpos_y = new int[this.maxhitmarks];
				} else if (var3 == 4) {
					this.field7727 = false;
				} else if (var3 == 5) {
					this.login_interface = buf.g3();
				} else if (var3 == 6) {
					this.lobby_interface = buf.g3();
				} else if (var3 == 7) {
					this.field7731 = new short[10][4];
					this.field7729 = new short[10][4][];
					for (int var6 = 0; var6 < 10; var6++) {
						for (int var7 = 0; var7 < 4; var7++) {
							int var8 = buf.g2();
							if (var8 == 65535) {
								var8 = -1;
							}
							this.field7731[var6][var7] = (short) var8;
							int var9 = buf.g2();
							this.field7729[var6][var7] = new short[var9];
							for (int var10 = 0; var10 < var9; var10++) {
								int var11 = buf.g2();
								if (var11 == 65535) {
									var11 = -1;
								}
								this.field7729[var6][var7][var10] = (short) var11;
							}
						}
					}
				} else if (var3 == 8) {
					this.npcShouldDisplayChat = false;
				} else if (var3 == 9) {
					this.npcChatTimeout = buf.g1();
				} else if (var3 == 10) {
					this.playerShouldDisplayChat = false;
				} else if (var3 == 11) {
					this.playerChatTimeout = buf.g1();
				} else if (var3 == 12) {
					this.field7739 = buf.g2();
					this.field7740 = buf.g2();
				} else if (var3 == 13) {
					this.field7745 = buf.g1();
				} else if (var3 == 14) {
					this.field7719 = buf.g1();
				} else if (var3 == 15) {
					this.field7723 = buf.g1();
				} else if (var3 == 16) {
					this.field7749 = true;
				} else if (var3 == 17) {
					this.invHundredColor = buf.g4s();
				} else if (var3 == 18) {
					this.invThousandColor = buf.g4s();
				} else if (var3 == 19) {
					this.invMillionColor = buf.g4s();
				} else if (var3 == 20) {
					this.spotshadowtexture = (short) buf.g2();
					this.spotshadowtexture_alpha = (byte) buf.g1();
				} else if (var3 == 21) {
					this.field7730 = buf.g1();
				} else if (var3 == 22) {
					this.p11_full = buf.gSmart2or4null();
					this.p12_full = buf.gSmart2or4null();
					this.b12_full = buf.gSmart2or4null();
					this.hintarrows = buf.gSmart2or4null();
					this.field7715 = buf.gSmart2or4null();
					this.mapflag = buf.gSmart2or4null();
					this.field7751 = buf.g1b();
					this.field7752 = buf.g1b();
					this.cross = buf.gSmart2or4null();
					this.mapdots = buf.gSmart2or4null();
					this.field7755 = buf.gSmart2or4null();
					this.field7756 = buf.gSmart2or4null();
					this.compass = buf.gSmart2or4null();
					this.field7721 = buf.gSmart2or4null();
					this.field7741 = buf.gSmart2or4null();
				} else if (var3 == 23) {
					this.field7714 = new short[10][4];
					this.field7734 = new short[10][4][];
					for (int var12 = 0; var12 < 10; var12++) {
						for (int var13 = 0; var13 < 4; var13++) {
							int var14 = buf.g2();
							if (var14 == 65535) {
								var14 = -1;
							}
							this.field7714[var12][var13] = (short) var14;
							int var15 = buf.g2();
							this.field7734[var12][var13] = new short[var15];
							for (int var16 = 0; var16 < var15; var16++) {
								int var17 = buf.g2();
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
