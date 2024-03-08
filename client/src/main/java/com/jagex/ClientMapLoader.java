package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aih")
public class ClientMapLoader extends class454 {

	@ObfuscatedName("aih.cw")
	public static boolean field10755 = false;

	@ObfuscatedName("aih.ct")
	public static boolean field10754 = false;

	@ObfuscatedName("aih.cq")
	public static final int[] field10759 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("aih.ch")
	public static final int[] field10757 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("aih.cb")
	public static final int[] field10753 = new int[] { 1, -1, -1, 1 };

	@ObfuscatedName("aih.cs")
	public static final int[] field10762 = new int[] { -1, -1, 1, 1 };

	@ObfuscatedName("aih.cy")
	public int field10756 = 99;

	@ObfuscatedName("aih.cc")
	public EnvironmentManager field10764;

	@ObfuscatedName("aih.cz")
	public LocTypeList field10765;

	public ClientMapLoader(Scene arg0, LocTypeList arg1, int arg2, int arg3, int arg4, boolean arg5, LinkMap arg6, EnvironmentManager arg7) {
		super(arg0, arg2, arg3, arg4, arg5, Statics.field8168, Statics.field8145, arg6);
		this.field10765 = arg1;
		this.field10764 = arg7;
	}

	@ObfuscatedName("aih.ce(Ldh;Lalw;IIB)V")
	public final void method16872(Renderer arg0, Packet arg1, int arg2, int arg3) {
		if (this.field4549) {
			return;
		}
		arg1.pos += 8;
		boolean var5 = false;
		class637 var6 = null;
		boolean var7 = false;
		while (true) {
			while (arg1.pos < arg1.data.length) {
				int var8 = arg1.g1();
				if (var8 == 0) {
					if (var6 == null) {
						var6 = new class637(arg1, this.field10764);
					} else {
						var6.method10065(arg1, this.field10764);
					}
				} else if (var8 == 1) {
					int var9 = arg1.g1();
					if (var9 > 0) {
						for (int var10 = 0; var10 < var9; var10++) {
							class554 var11 = new class554(arg0, this.field4577.field6900, arg1, 2);
							if (var11.field7014 == 31) {
								LightType var12 = (LightType) Statics.field7943.get(arg1.g2());
								var11.method8899(var12.field9168, var12.field9170, var12.field9167, var12.field9169);
							}
							if (arg0.method2114() > 0) {
								Light var13 = var11.field7003;
								int var14 = var13.method17605() + (arg2 << 9);
								int var15 = var13.method17607() + (arg3 << 9);
								int var16 = var14 >> 9;
								int var17 = var15 >> 9;
								if (var16 >= 0 && var17 >= 0 && var16 < this.field4513 && var17 < this.field4514) {
									var13.method17628(var14, this.field4540[var11.field7006][var16][var17] - var13.method17606(), var15);
									this.field4577.method8754(var11);
								}
							}
						}
					}
				} else if (var8 == 2) {
					if (var6 == null) {
						var6 = new class637();
					}
					var6.method10067(arg1);
				} else if (var8 == 3) {
					if (var6 == null) {
						var6 = new class637();
					}
					var6.method10068(arg1);
				} else if (var8 == 128) {
					if (var6 == null) {
						var6 = new class637();
					}
					var6.method10070(arg1, this.field10764);
				} else if (var8 == 129) {
					if (this.field4517 == null) {
						this.field4517 = new byte[4][][];
					}
					for (int var18 = 0; var18 < 4; var18++) {
						byte var19 = arg1.g1b();
						if (var19 == 0 && this.field4517[var18] != null) {
							int var20 = arg2;
							int var21 = arg2 + 64;
							int var22 = arg3;
							int var23 = arg3 + 64;
							if (arg2 < 0) {
								var20 = 0;
							} else if (arg2 >= this.field4513) {
								var20 = this.field4513;
							}
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 >= this.field4513) {
								var21 = this.field4513;
							}
							if (arg3 < 0) {
								var22 = 0;
							} else if (arg3 >= this.field4514) {
								var22 = this.field4514;
							}
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 >= this.field4514) {
								var23 = this.field4514;
							}
							while (var20 < var21) {
								while (var22 < var23) {
									this.field4517[var18][var20][var22] = 0;
									var22++;
								}
								var20++;
							}
						} else if (var19 == 1) {
							if (this.field4517[var18] == null) {
								this.field4517[var18] = new byte[this.field4513 + 1][this.field4514 + 1];
							}
							for (int var24 = 0; var24 < 64; var24 += 4) {
								for (int var25 = 0; var25 < 64; var25 += 4) {
									byte var26 = arg1.g1b();
									for (int var27 = arg2 + var24; var27 < arg2 + var24 + 4; var27++) {
										for (int var28 = arg3 + var25; var28 < arg3 + var25 + 4; var28++) {
											if (var27 >= 0 && var27 < this.field4513 && var28 >= 0 && var28 < this.field4514) {
												this.field4517[var18][var27][var28] = var26;
											}
										}
									}
								}
							}
						} else if (var19 == 2) {
							if (this.field4517[var18] == null) {
								this.field4517[var18] = new byte[this.field4513 + 1][this.field4514 + 1];
							}
							if (var18 > 0) {
								int var29 = arg2;
								int var30 = arg2 + 64;
								int var31 = arg3;
								int var32 = arg3 + 64;
								if (arg2 < 0) {
									var29 = 0;
								} else if (arg2 >= this.field4513) {
									var29 = this.field4513;
								}
								if (var30 < 0) {
									var30 = 0;
								} else if (var30 >= this.field4513) {
									var30 = this.field4513;
								}
								if (arg3 < 0) {
									var31 = 0;
								} else if (arg3 >= this.field4514) {
									var31 = this.field4514;
								}
								if (var32 < 0) {
									var32 = 0;
								} else if (var32 >= this.field4514) {
									var32 = this.field4514;
								}
								while (var29 < var30) {
									while (var31 < var32) {
										this.field4517[var18][var29][var31] = this.field4517[var18 - 1][var29][var31];
										var31++;
									}
									var29++;
								}
							}
						}
					}
					var5 = true;
				} else if (var8 == 130) {
					var7 = true;
				} else {
					throw new IllegalStateException("");
				}
			}
			for (int var33 = 0; var33 < 8; var33++) {
				for (int var34 = 0; var34 < 8; var34++) {
					int var35 = (arg2 >> 3) + var33;
					int var36 = (arg3 >> 3) + var34;
					if (var35 >= 0 && var35 < this.field4513 >> 3 && var36 >= 0 && var36 < this.field4514 >> 3) {
						if (var6 != null) {
							this.field10764.method9999(var35, var36, var6);
						}
						class42.method14707(var35, var36, var7);
					}
				}
			}
			if (!var5 && this.field4517 != null) {
				for (int var37 = 0; var37 < 4; var37++) {
					if (this.field4517[var37] != null) {
						for (int var38 = 0; var38 < 16; var38++) {
							for (int var39 = 0; var39 < 16; var39++) {
								int var40 = (arg2 >> 2) + var38;
								int var41 = (arg3 >> 2) + var39;
								if (var40 >= 0 && var40 < 26 && var41 >= 0 && var41 < 26) {
									this.field4517[var37][var40][var41] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("aih.cu(Ldh;Lalw;IIIIIIIB)V")
	public final void method16875(Renderer arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.field4549) {
			return;
		}
		arg1.pos += 8;
		boolean var10 = false;
		class637 var11 = null;
		boolean var12 = false;
		int var13 = (arg6 & 0x7) * 8;
		int var14 = (arg7 & 0x7) * 8;
		while (true) {
			while (arg1.pos < arg1.data.length) {
				int var15 = arg1.g1();
				if (var15 == 0) {
					if (var11 == null) {
						var11 = new class637(arg1, this.field10764);
					} else {
						var11.method10065(arg1, this.field10764);
					}
				} else if (var15 == 1) {
					int var16 = arg1.g1();
					if (var16 > 0) {
						for (int var17 = 0; var17 < var16; var17++) {
							class554 var18 = new class554(arg0, this.field4577.field6900, arg1, 2);
							if (var18.field7014 == 31) {
								LightType var19 = (LightType) Statics.field7943.get(arg1.g2());
								var18.method8899(var19.field9168, var19.field9170, var19.field9167, var19.field9169);
							}
							if (arg0.method2114() > 0) {
								Light var20 = var18.field7003;
								int var21 = var20.method17605() >> 9;
								int var22 = var20.method17607() >> 9;
								if (var18.field7006 == arg5 && var21 >= var13 && var21 < var13 + 8 && var22 >= var14 && var22 < var14 + 8) {
									int var23 = (arg3 << 9) + class452.method7092(var20.method17605() & 0xFFF, var20.method17607() & 0xFFF, arg8);
									int var24 = (arg4 << 9) + class452.method8977(var20.method17605() & 0xFFF, var20.method17607() & 0xFFF, arg8);
									int var25 = var23 >> 9;
									int var26 = var24 >> 9;
									if (var25 >= 0 && var26 >= 0 && var25 < this.field4513 && var26 < this.field4514) {
										var18.field7006 = arg2;
										var20.method17628(var23, this.field4540[var18.field7006][var25][var26] - var20.method17606(), var24);
										this.field4577.method8754(var18);
									}
								}
							}
						}
					}
				} else if (var15 == 2) {
					if (var11 == null) {
						var11 = new class637();
					}
					var11.method10067(arg1);
				} else if (var15 == 3) {
					if (var11 == null) {
						var11 = new class637();
					}
					var11.method10068(arg1);
				} else if (var15 == 128) {
					if (var11 == null) {
						var11 = new class637();
					}
					var11.method10070(arg1, this.field10764);
				} else if (var15 == 129) {
					if (this.field4517 == null) {
						this.field4517 = new byte[4][][];
					}
					for (int var27 = 0; var27 < 4; var27++) {
						byte var28 = arg1.g1b();
						if (var28 == 0 && this.field4517[arg2] != null) {
							if (var27 <= arg5) {
								int var29 = arg3;
								int var30 = arg3 + 7;
								int var31 = arg4;
								int var32 = arg4 + 7;
								if (arg3 < 0) {
									var29 = 0;
								} else if (arg3 >= this.field4513) {
									var29 = this.field4513;
								}
								if (var30 < 0) {
									var30 = 0;
								} else if (var30 >= this.field4513) {
									var30 = this.field4513;
								}
								if (arg4 < 0) {
									var31 = 0;
								} else if (arg4 >= this.field4514) {
									var31 = this.field4514;
								}
								if (var32 < 0) {
									var32 = 0;
								} else if (var32 >= this.field4514) {
									var32 = this.field4514;
								}
								while (var29 < var30) {
									while (var31 < var32) {
										this.field4517[arg2][var29][var31] = 0;
										var31++;
									}
									var29++;
								}
							}
						} else if (var28 == 1) {
							if (this.field4517[arg2] == null) {
								this.field4517[arg2] = new byte[this.field4513 + 1][this.field4514 + 1];
							}
							for (int var33 = 0; var33 < 64; var33 += 4) {
								for (int var34 = 0; var34 < 64; var34 += 4) {
									byte var35 = arg1.g1b();
									if (var27 <= arg5) {
										for (int var36 = var33; var36 < var33 + 4; var36++) {
											for (int var37 = var34; var37 < var34 + 4; var37++) {
												if (var36 >= var13 && var36 < var13 + 8 && var37 >= var14 && var37 < var14 + 8) {
													int var38 = arg3 + class452.method14888(var36 & 0x7, var37 & 0x7, arg8);
													int var39 = arg4 + Statics.method14756(var36 & 0x7, var37 & 0x7, arg8);
													if (var38 >= 0 && var38 < this.field4513 && var39 >= 0 && var39 < this.field4514) {
														this.field4517[arg2][var38][var39] = var35;
														var10 = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (var28 == 2) {
						}
					}
				} else if (var15 == 130) {
					var12 = true;
				} else {
					throw new IllegalStateException("");
				}
			}
			if (var11 != null) {
				this.field10764.method9999(arg3 >> 3, arg4 >> 3, var11);
			}
			class42.method14707(arg3 >> 3, arg4 >> 3, var12);
			if (!var10 && this.field4517 != null && this.field4517[arg2] != null) {
				int var40 = arg3 + 7;
				int var41 = arg4 + 7;
				for (int var42 = arg3; var42 < var40; var42++) {
					for (int var43 = arg4; var43 < var41; var43++) {
						this.field4517[arg2][var42][var43] = 0;
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("id.ci(Laop;[BIIIILxe;Lxe;I)I")
	public static final int method4526(LocTypeList arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class650 arg6, class650 arg7) {
		int var8 = 0;
		Packet var9 = new Packet(arg1);
		int var10 = -1;
		label70: while (true) {
			int var11 = var9.gExtended1or2();
			if (var11 == 0) {
				return var8;
			}
			var10 += var11;
			int var12 = 0;
			boolean var13 = false;
			while (true) {
				class600 var15;
				int var19;
				LocType var20;
				int var22;
				do {
					int var18;
					int var21;
					do {
						do {
							do {
								do {
									int var14;
									do {
										var14 = var9.gSmart1or2();
										if (var14 == 0) {
											continue label70;
										}
										var15 = new class600(var9);
									} while (var13);
									var12 += var14 - 1;
									int var16 = var12 & 0x3F;
									int var17 = var12 >> 6 & 0x3F;
									var18 = arg2 + var17;
									var19 = arg3 + var16;
									var20 = (LocType) arg0.get(var10);
									if ((var15.field7540 & 0x1) == 0) {
										var21 = var20.field7499;
										var22 = var20.field7492;
									} else {
										var21 = var20.field7492;
										var22 = var20.field7499;
									}
								} while (var18 >= arg4);
							} while (var19 >= arg5);
						} while (var18 + var21 < 0);
					} while (var19 + var22 < 0);
				} while (class601.field7566.field7562 == var15.field7541 && Statics.field688.field11526.method18489() == 0 && var20.field7470 == 0 && var20.field7467 != 1 && !var20.field7502);
				if (!var20.method9489(arg7)) {
					arg6.field7958 = var10;
					var8++;
				}
				var13 = true;
			}
		}
	}

	@ObfuscatedName("abb.cn(Laop;III)Z")
	public static final boolean method14705(LocTypeList arg0, int arg1, int arg2) {
		LocType var3 = (LocType) arg0.get(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return var3.method9473(arg2);
	}

	@ObfuscatedName("aih.cv(Ldh;[BIII)V")
	public final void method16888(Renderer arg0, byte[] arg1, int arg2, int arg3) {
		Packet var5 = new Packet(arg1);
		int var6 = -1;
		label63: while (true) {
			int var7 = var5.gExtended1or2();
			if (var7 == 0) {
				return;
			}
			var6 += var7;
			int var8 = 0;
			while (true) {
				int var12;
				class600 var13;
				int var14;
				int var15;
				int var20;
				do {
					int var19;
					do {
						do {
							do {
								do {
									int var9 = var5.gSmart1or2();
									if (var9 == 0) {
										continue label63;
									}
									var8 += var9 - 1;
									int var10 = var8 & 0x3F;
									int var11 = var8 >> 6 & 0x3F;
									var12 = var8 >> 12;
									var13 = new class600(var5);
									var14 = arg2 + var11;
									var15 = arg3 + var10;
									LocType var16 = (LocType) this.field10765.get(var6);
									int var17;
									int var18;
									if ((var13.field7540 & 0x1) == 0) {
										var17 = var16.field7499;
										var18 = var16.field7492;
									} else {
										var17 = var16.field7492;
										var18 = var16.field7499;
									}
									var19 = var14 + var17;
									var20 = var15 + var18;
								} while (var14 >= this.field4513);
							} while (var15 >= this.field4514);
						} while (var19 <= 0);
					} while (var20 <= 0);
				} while (class601.field7563.field7562 != var13.field7541 && class601.field7564.field7562 != var13.field7541 && (var14 <= 0 || var15 <= 0 || var14 >= this.field4513 - 1 || var15 >= this.field4514 - 1));
				this.method16867(arg0, var12, var12, var14, var15, var6, var13.field7540, var13.field7541, -1, 0, var13.field7539);
			}
		}
	}

	@ObfuscatedName("aih.cp(Ldh;[BIIIIIIII)V")
	public final void method16868(Renderer arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Packet var10 = new Packet(arg1);
		int var11 = -1;
		label88: while (true) {
			int var12 = var10.gExtended1or2();
			if (var12 == 0) {
				return;
			}
			var11 += var12;
			int var13 = 0;
			while (true) {
				class600 var18;
				int var22;
				int var23;
				int var25;
				do {
					int var24;
					do {
						do {
							do {
								do {
									int var15;
									int var16;
									do {
										do {
											do {
												int var17;
												do {
													do {
														int var14 = var10.gSmart1or2();
														if (var14 == 0) {
															continue label88;
														}
														var13 += var14 - 1;
														var15 = var13 & 0x3F;
														var16 = var13 >> 6 & 0x3F;
														var17 = var13 >> 12;
														var18 = new class600(var10);
													} while (arg5 != var17);
												} while (var16 < arg6);
											} while (var16 >= arg6 + 8);
										} while (var15 < arg7);
									} while (var15 >= arg7 + 8);
									LocType var19 = (LocType) this.field10765.get(var11);
									int var20;
									int var21;
									if ((var18.field7540 & 0x1) == 0) {
										var20 = var19.field7499;
										var21 = var19.field7492;
									} else {
										var20 = var19.field7492;
										var21 = var19.field7499;
									}
									var22 = arg3 + Statics.method9606(var16 & 0x7, var15 & 0x7, arg8, var19.field7499, var19.field7492, var18.field7540);
									var23 = arg4 + class452.method2733(var16 & 0x7, var15 & 0x7, arg8, var19.field7499, var19.field7492, var18.field7540);
									var24 = var20 + var22;
									var25 = var21 + var23;
								} while (var22 >= this.field4513);
							} while (var23 >= this.field4514);
						} while (var24 <= 0);
					} while (var25 <= 0);
				} while (class601.field7563.field7562 != var18.field7541 && class601.field7564.field7562 != var18.field7541 && (var22 <= 0 || var23 <= 0 || var22 >= this.field4513 - 1 || var23 >= this.field4514 - 1));
				this.method16867(arg0, arg2, arg2, var22, var23, var11, var18.field7540 + arg8 & 0x3, var18.field7541, -1, 0, var18.field7539);
			}
		}
	}

	@ObfuscatedName("aih.ca(Ldh;IIIIIIIIILoe;I)V")
	public final void method16867(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, ScaleRotTrans arg10) {
		if (arg2 < this.field10756) {
			this.field10756 = arg2;
		}
		LocType var12 = (LocType) this.field10765.get(arg5);
		if (Statics.field688.field11538.method18426() == 0 && var12.field7516) {
			return;
		}
		int var13;
		int var14;
		if (arg6 == 1 || arg6 == 3) {
			var13 = var12.field7492;
			var14 = var12.field7499;
		} else {
			var13 = var12.field7499;
			var14 = var12.field7492;
		}
		int var15;
		int var16;
		if (arg3 + var13 <= this.field4513) {
			var15 = (var13 >> 1) + arg3;
			var16 = (var13 + 1 >> 1) + arg3;
		} else {
			var15 = arg3;
			var16 = arg3 + 1;
		}
		int var17;
		int var18;
		if (arg4 + var14 <= this.field4514) {
			var17 = (var14 >> 1) + arg4;
			var18 = (var14 + 1 >> 1) + arg4;
		} else {
			var17 = arg4;
			var18 = arg4 + 1;
		}
		class104 var19 = this.field4577.field6913[arg1];
		int var20;
		if (class601.field7563.field7562 == arg7 || class601.field7564.field7562 == arg7) {
			var20 = var19.method1530(var15, var17) + var19.method1530(var16, var17) + var19.method1530(var15, var18) + var19.method1530(var16, var18) >> 2;
		} else {
			var20 = var19.method1529(var15, var17) + var19.method1529(var16, var17) + var19.method1529(var15, var18) + var19.method1529(var16, var18) >> 2;
		}
		int var21 = (arg3 << 9) + (var13 << 8);
		int var22 = (arg4 << 9) + (var14 << 8);
		boolean var23 = this.field4512 && !this.field4549 && var12.field7473;
		if (var12.method9480()) {
			class975.method9739(arg2, arg3, arg4, arg6, var12, null, null);
		}
		boolean var24 = arg8 == -1 && (!var12.method9504() || var12.field7479 && Statics.field688.field11514.method18665() == 0) && var12.field7505 == null && !var12.field7520 && !var12.field7524;
		if (field10755 && (Statics.method8381(arg7) && var12.field7474 != 1 || !(!class601.method615(arg7) || var12.field7474 != 0))) {
			return;
		}
		if (class601.field7566.field7562 == arg7) {
			if (Statics.field688.field11526.method18489() != 0 || var12.field7470 != 0 || var12.field7467 == 1 || var12.field7502) {
				GroundDecorLayerEntity var26;
				if (var24) {
					StaticGroundDecorEntity var25 = new StaticGroundDecorEntity(this.field4577, arg0, this.field10765, var12, arg2, arg1, var21, var20, var22, this.field4549, arg6, var23, arg10);
					if (var25.method8206()) {
						var25.method8217(arg0);
					}
					var26 = var25;
				} else {
					var26 = new DynamicGroundDecorEntity(this.field4577, arg0, this.field10765, var12, arg2, arg1, var21, var20, var22, this.field4549, arg6, arg8, arg9, arg10);
				}
				this.field4577.method8717(arg2, arg3, arg4, var26);
			}
		} else if (class601.field7563.field7562 == arg7 || class601.field7564.field7562 == arg7) {
			StaticSceneryEntity var29 = null;
			int var31;
			PrimaryLayerEntity var32;
			if (var24) {
				StaticSceneryEntity var30 = new StaticSceneryEntity(this.field4577, arg0, this.field10765, var12, arg2, arg1, var21, var20, var22, this.field4549, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, var23, class596.field7440 != var12.field7526, arg10);
				var31 = var30.method17401();
				var32 = var30;
				var29 = var30;
			} else {
				var32 = new DynamicSceneryEntity(this.field4577, arg0, this.field10765, var12, arg2, arg1, var21, var20, var22, this.field4549, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, arg8, arg9, class596.field7440 != var12.field7526, arg10);
				var31 = 15;
			}
			if (this.field4577.method8768(var32, false)) {
				if (var29 != null && var29.method8206()) {
					var29.method8217(arg0);
				}
				if (var12.field7491 && this.field4512) {
					if (var31 > 30) {
						var31 = 30;
					}
					for (int var33 = 0; var33 <= var13; var33++) {
						for (int var34 = 0; var34 <= var14; var34++) {
							var19.method1521(arg3 + var33, arg4 + var34, var31);
						}
					}
				}
			}
		} else if (class601.method615(arg7) || class601.method6788(arg7)) {
			PrimaryLayerEntity var28;
			if (var24) {
				StaticSceneryEntity var27 = new StaticSceneryEntity(this.field4577, arg0, this.field10765, var12, arg2, arg1, var21, var20, var22, this.field4549, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, var23, true, arg10);
				if (var27.method8206()) {
					var27.method8217(arg0);
				}
				var28 = var27;
			} else {
				var28 = new DynamicSceneryEntity(this.field4577, arg0, this.field10765, var12, arg2, arg1, var21, var20, var22, this.field4549, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, arg8, arg9, true, arg10);
			}
			this.field4577.method8768(var28, false);
			if (this.field4512 && !this.field4549 && class601.method615(arg7) && class601.field7552.field7562 != arg7 && arg2 > 0 && var12.field7474 != 0) {
				this.field4518[arg2][arg3][arg4] = (byte) (this.field4518[arg2][arg3][arg4] | 0x4);
			}
		} else if (!this.method16869(arg0, arg7, arg6, var24, var12, arg8, arg9, arg2, arg1, var21, var20, var22, arg3, arg4, var23, var19, var13, var14, arg10) && !this.method16870(arg0, arg7, arg6, var24, var12, arg8, arg9, arg2, arg1, var21, var20, var22, arg3, arg4, arg10)) {
			;
		}
	}

	@ObfuscatedName("aih.cx(Ldh;IIZLvd;IIIIIIIIIZLcb;IILoe;I)Z")
	public boolean method16869(Renderer arg0, int arg1, int arg2, boolean arg3, LocType arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, class104 arg15, int arg16, int arg17, ScaleRotTrans arg18) {
		if (class601.field7554.field7562 == arg1) {
			int var20 = arg4.field7474;
			if (field10754 && arg4.field7474 == -1) {
				var20 = 1;
			}
			WallLayerEntity var22;
			if (arg3) {
				StaticWallEntity var21 = new StaticWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2, arg14, arg18);
				if (var21.method8206()) {
					var21.method8217(arg0);
				}
				var22 = var21;
			} else {
				var22 = new DynamicWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2, arg5, arg6, arg18);
			}
			this.field4577.method8719(arg7, arg12, arg13, var22, null);
			if (arg2 == 0) {
				if (this.field4512 && arg4.field7491) {
					arg15.method1521(arg12, arg13, 50);
					arg15.method1521(arg12, arg13 + 1, 50);
				}
				if (var20 == 1 && !this.field4549) {
					this.field4577.field6930.method8957(1, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				}
			} else if (arg2 == 1) {
				if (this.field4512 && arg4.field7491) {
					arg15.method1521(arg12, arg13 + 1, 50);
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				}
				if (var20 == 1 && !this.field4549) {
					this.field4577.field6930.method8957(2, arg7, arg12, arg13 + 1, arg4.field7475, -arg4.field7476);
				}
			} else if (arg2 == 2) {
				if (this.field4512 && arg4.field7491) {
					arg15.method1521(arg12 + 1, arg13, 50);
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				}
				if (var20 == 1 && !this.field4549) {
					this.field4577.field6930.method8957(1, arg7, arg12 + 1, arg13, arg4.field7475, -arg4.field7476);
				}
			} else if (arg2 == 3) {
				if (this.field4512 && arg4.field7491) {
					arg15.method1521(arg12, arg13, 50);
					arg15.method1521(arg12 + 1, arg13, 50);
				}
				if (var20 == 1 && !this.field4549) {
					this.field4577.field6930.method8957(2, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				}
			}
			if (arg4.field7480 != 64) {
				this.field4577.method8765(arg7, arg12, arg13, arg4.field7480);
			}
			return true;
		} else if (class601.field7551.field7562 == arg1) {
			WallLayerEntity var24;
			if (arg3) {
				StaticWallEntity var23 = new StaticWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2, arg14, arg18);
				if (var23.method8206()) {
					var23.method8217(arg0);
				}
				var24 = var23;
			} else {
				var24 = new DynamicWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2, arg5, arg6, arg18);
			}
			this.field4577.method8719(arg7, arg12, arg13, var24, null);
			if (arg4.field7491 && this.field4512) {
				if (arg2 == 0) {
					arg15.method1521(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method1521(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method1521(arg12, arg13, 50);
				}
			}
			return true;
		} else if (class601.field7545.field7562 == arg1) {
			int var25 = arg2 + 1 & 0x3;
			WallLayerEntity var28;
			WallLayerEntity var29;
			if (arg3) {
				StaticWallEntity var26 = new StaticWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2 + 4, arg14, arg18);
				StaticWallEntity var27 = new StaticWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, var25, arg14, arg18);
				if (var26.method8206()) {
					var26.method8217(arg0);
				}
				if (var27.method8206()) {
					var27.method8217(arg0);
				}
				var28 = var26;
				var29 = var27;
			} else {
				var28 = new DynamicWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2 + 4, arg5, arg6, arg18);
				var29 = new DynamicWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, var25, arg5, arg6, arg18);
			}
			this.field4577.method8719(arg7, arg12, arg13, var28, var29);
			if ((arg4.field7474 == 1 || field10754 && arg4.field7474 == -1) && !this.field4549) {
				if (arg2 == 0) {
					this.field4577.field6930.method8957(1, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
					this.field4577.field6930.method8957(2, arg7, arg12, arg13 + 1, arg4.field7475, arg4.field7476);
				} else if (arg2 == 1) {
					this.field4577.field6930.method8957(1, arg7, arg12 + 1, arg13, arg4.field7475, arg4.field7476);
					this.field4577.field6930.method8957(2, arg7, arg12, arg13 + 1, arg4.field7475, arg4.field7476);
				} else if (arg2 == 2) {
					this.field4577.field6930.method8957(1, arg7, arg12 + 1, arg13, arg4.field7475, arg4.field7476);
					this.field4577.field6930.method8957(2, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				} else if (arg2 == 3) {
					this.field4577.field6930.method8957(1, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
					this.field4577.field6930.method8957(2, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				}
			}
			if (arg4.field7480 != 64) {
				this.field4577.method8765(arg7, arg12, arg13, arg4.field7480);
			}
			return true;
		} else if (class601.field7546.field7562 == arg1) {
			WallLayerEntity var31;
			if (arg3) {
				StaticWallEntity var30 = new StaticWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2, arg14, arg18);
				if (var30.method8206()) {
					var30.method8217(arg0);
				}
				var31 = var30;
			} else {
				var31 = new DynamicWallEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg1, arg2, arg5, arg6, arg18);
			}
			this.field4577.method8719(arg7, arg12, arg13, var31, null);
			if (arg4.field7491 && this.field4512) {
				if (arg2 == 0) {
					arg15.method1521(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method1521(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method1521(arg12, arg13, 50);
				}
			}
			return true;
		} else if (class601.field7547.field7562 == arg1) {
			PrimaryLayerEntity var33;
			if (arg3) {
				StaticSceneryEntity var32 = new StaticSceneryEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (var32.method8206()) {
					var32.method8217(arg0);
				}
				var33 = var32;
			} else {
				var33 = new DynamicSceneryEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, arg12, arg12 + arg16 - 1, arg13, arg13 + arg17 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.field4577.method8768(var33, false);
			if (arg4.field7474 == 1 && !this.field4549) {
				byte var34;
				if ((arg2 & 0x1) == 0) {
					var34 = 8;
				} else {
					var34 = 16;
				}
				this.field4577.field6930.method8957(var34, arg7, arg12, arg13, arg4.field7475, 0);
			}
			if (arg4.field7480 != 64) {
				this.field4577.method8765(arg7, arg12, arg13, arg4.field7480);
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aih.cw(Ldh;IIZLvd;IIIIIIIIILoe;B)Z")
	public boolean method16870(Renderer arg0, int arg1, int arg2, boolean arg3, LocType arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, ScaleRotTrans arg14) {
		if (class601.field7548.field7562 == arg1) {
			WallDecorLayerEntity var17;
			if (arg3) {
				StaticWallDecorEntity var16 = new StaticWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, 0, 0, arg1, arg2, arg14);
				if (var16.method8206()) {
					var16.method8217(arg0);
				}
				var17 = var16;
			} else {
				var17 = new DynamicWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, 0, 0, arg1, arg2, arg5, arg6, arg14);
			}
			this.field4577.method8752(arg7, arg12, arg13, var17, null);
			return true;
		} else if (class601.field7549.field7562 == arg1) {
			int var18 = 65;
			Location var19 = (Location) this.field4577.method8711(arg7, arg12, arg13);
			if (var19 != null) {
				var18 = ((LocType) this.field10765.get(var19.method8223())).field7480 + 1;
			}
			WallDecorLayerEntity var21;
			if (arg3) {
				StaticWallDecorEntity var20 = new StaticWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, field10759[arg2] * var18, field10757[arg2] * var18, arg1, arg2, arg14);
				if (var20.method8206()) {
					var20.method8217(arg0);
				}
				var21 = var20;
			} else {
				var21 = new DynamicWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, field10759[arg2] * var18, field10757[arg2] * var18, arg1, arg2, arg5, arg6, arg14);
			}
			this.field4577.method8752(arg7, arg12, arg13, var21, null);
			return true;
		} else if (class601.field7550.field7562 == arg1) {
			int var22 = 33;
			Location var23 = (Location) this.field4577.method8711(arg7, arg12, arg13);
			if (var23 != null) {
				var22 = ((LocType) this.field10765.get(var23.method8223())).field7480 / 2 + 1;
			}
			WallDecorLayerEntity var25;
			if (arg3) {
				StaticWallDecorEntity var24 = new StaticWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, field10759[arg2] * var22, field10757[arg2] * var22, arg1, arg2 + 4, arg14);
				if (var24.method8206()) {
					var24.method8217(arg0);
				}
				var25 = var24;
			} else {
				var25 = new DynamicWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, field10753[arg2] * var22, field10762[arg2] * var22, arg1, arg2 + 4, arg5, arg6, arg14);
			}
			this.field4577.method8752(arg7, arg12, arg13, var25, null);
			return true;
		} else if (class601.field7557.field7562 == arg1) {
			int var26 = arg2 + 2 & 0x3;
			WallDecorLayerEntity var28;
			if (arg3) {
				StaticWallDecorEntity var27 = new StaticWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, 0, 0, arg1, var26 + 4, arg14);
				if (var27.method8206()) {
					var27.method8217(arg0);
				}
				var28 = var27;
			} else {
				var28 = new DynamicWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, 0, 0, arg1, var26 + 4, arg5, arg6, arg14);
			}
			this.field4577.method8752(arg7, arg12, arg13, var28, null);
			return true;
		} else if (class601.field7543.field7562 == arg1) {
			int var29 = arg2 + 2 & 0x3;
			int var30 = 33;
			Location var31 = (Location) this.field4577.method8711(arg7, arg12, arg13);
			if (var31 != null) {
				var30 = ((LocType) this.field10765.get(var31.method8223())).field7480 / 2 + 1;
			}
			WallDecorLayerEntity var34;
			WallDecorLayerEntity var35;
			if (arg3) {
				StaticWallDecorEntity var32 = new StaticWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, field10753[arg2] * var30, field10762[arg2] * var30, arg1, arg2 + 4, arg14);
				StaticWallDecorEntity var33 = new StaticWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, 0, 0, arg1, var29 + 4, arg14);
				if (var32.method8206()) {
					var32.method8217(arg0);
				}
				if (var33.method8206()) {
					var33.method8217(arg0);
				}
				var34 = var32;
				var35 = var33;
			} else {
				DynamicWallDecorEntity var36 = new DynamicWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, field10753[arg2] * var30, field10762[arg2] * var30, arg1, arg2 + 4, arg5, arg6, arg14);
				DynamicWallDecorEntity var37 = new DynamicWallDecorEntity(this.field4577, arg0, this.field10765, arg4, arg7, arg8, arg9, arg10, arg11, this.field4549, 0, 0, arg1, var29 + 4, arg5, arg6, arg14);
				var34 = var36;
				var35 = var37;
			}
			this.field4577.method8752(arg7, arg12, arg13, var34, var35);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aih.ct(Ldh;IIIIB)V")
	public void method16871(Renderer arg0, int arg1, int arg2, int arg3, int arg4) {
		Location var6 = this.method16899(arg1, arg2, arg3, arg4);
		if (var6 == null) {
			return;
		}
		LocType var7 = (LocType) this.field10765.get(var6.method8223());
		int var8 = var6.method8220();
		int var9 = var6.method8204();
		if (var7.method9480()) {
			class975.method6206(arg1, arg3, arg4, var7);
		}
		if (var6.method8206()) {
			var6.method8209(arg0);
		}
		if (arg2 == 0) {
			this.field4577.method8724(arg1, arg3, arg4);
			this.field4577.method8881(arg1, arg3, arg4);
			if (var7.field7474 == 1) {
				if (var9 == 0) {
					this.field4577.field6930.method8919(1, arg1, arg3, arg4);
				} else if (var9 == 1) {
					this.field4577.field6930.method8919(2, arg1, arg3, arg4 + 1);
				} else if (var9 == 2) {
					this.field4577.field6930.method8919(1, arg1, arg3 + 1, arg4);
				} else if (var9 == 3) {
					this.field4577.field6930.method8919(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.field4577.method8726(arg1, arg3, arg4);
			this.field4577.method8727(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.field4577.method8712(arg1, arg3, arg4, client.field11001);
			if (class601.field7547.field7562 == var8) {
				if ((var9 & 0x1) == 0) {
					this.field4577.field6930.method8919(8, arg1, arg3, arg4);
				} else {
					this.field4577.field6930.method8919(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.field4577.method8728(arg1, arg3, arg4);
		}
	}

	@ObfuscatedName("aih.cf(IIIII)Lst;")
	public Location method16899(int arg0, int arg1, int arg2, int arg3) {
		Location var5 = null;
		if (arg1 == 0) {
			var5 = (Location) this.field4577.method8711(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			var5 = (Location) this.field4577.method8735(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			var5 = (Location) this.field4577.method8856(arg0, arg2, arg3, client.field11001);
		}
		if (arg1 == 3) {
			var5 = (Location) this.field4577.method8767(arg0, arg2, arg3);
		}
		return var5;
	}

	@ObfuscatedName("aih.co(Ldh;ZB)V")
	public final void method16877(Renderer arg0, boolean arg1) {
		this.field4577.method8740();
		if (!arg1) {
			if (this.field4544 > 1) {
				for (int var3 = 0; var3 < this.field4513; var3++) {
					for (int var4 = 0; var4 < this.field4514; var4++) {
						if ((this.field4522.field4487[1][var3][var4] & 0x2) == 2) {
							this.field4577.method8705(var3, var4);
						}
					}
				}
			}
			for (int var5 = 0; var5 < this.field4544; var5++) {
				for (int var6 = 0; var6 <= this.field4514; var6++) {
					for (int var7 = 0; var7 <= this.field4513; var7++) {
						if ((this.field4518[var5][var7][var6] & 0x4) != 0) {
							int var8 = var7;
							int var9 = var7;
							int var10 = var6;
							int var11 = var6;
							while (var10 > 0 && (this.field4518[var5][var7][var10 - 1] & 0x4) != 0 && var11 - var10 < 10) {
								var10--;
							}
							while (var11 < this.field4514 && (this.field4518[var5][var7][var11 + 1] & 0x4) != 0 && var11 - var10 < 10) {
								var11++;
							}
							label108: while (var8 > 0 && var9 - var8 < 10) {
								for (int var12 = var10; var12 <= var11; var12++) {
									if ((this.field4518[var5][var8 - 1][var12] & 0x4) == 0) {
										break label108;
									}
								}
								var8--;
							}
							label95: while (var9 < this.field4513 && var9 - var8 < 10) {
								for (int var13 = var10; var13 <= var11; var13++) {
									if ((this.field4518[var5][var9 + 1][var13] & 0x4) == 0) {
										break label95;
									}
								}
								var9++;
							}
							if ((var9 - var8 + 1) * (var11 - var10 + 1) >= 4) {
								int var14 = this.field4540[var5][var8][var10];
								this.field4577.field6930.method8922(4, var5, var8 << 9, (var9 << 9) + 512, var10 << 9, (var11 << 9) + 512, var14, var14);
								for (int var15 = var8; var15 <= var9; var15++) {
									for (int var16 = var10; var16 <= var11; var16++) {
										this.field4518[var5][var15][var16] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.field4577.field6930.method8931();
		}
		this.field4518 = null;
	}
}
