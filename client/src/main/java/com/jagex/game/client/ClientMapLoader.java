package com.jagex.game.client;

import com.jagex.core.datastruct.IntegerBox;
import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.MiniMap;
import com.jagex.game.config.lighttype.LightType;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.graphics.scenegraph.WallDecorLayerEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aih")
public class ClientMapLoader extends MapLoader {

	@ObfuscatedName("aih.cw")
	public static boolean field10755 = false;

	@ObfuscatedName("aih.ct")
	public static boolean field10754 = false;

	@ObfuscatedName("aih.cq")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("aih.ch")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("aih.cb")
	public static final int[] field10753 = new int[] { 1, -1, -1, 1 };

	@ObfuscatedName("aih.cs")
	public static final int[] field10762 = new int[] { -1, -1, 1, 1 };

	@ObfuscatedName("aih.cy")
	public int field10756 = 99;

	@ObfuscatedName("aih.cc")
	public EnvironmentManager field10764;

	@ObfuscatedName("aih.cz")
	public LocTypeList locs;

	public ClientMapLoader(Scene scene, LocTypeList locs, int levels, int maxTileX, int maxTileZ, boolean underwater, SceneLevelTileFlags arg6, EnvironmentManager arg7) {
		super(scene, levels, maxTileX, maxTileZ, underwater, Client.overlayTypeList, Client.underlayTypeList, arg6);
		this.locs = locs;
		this.field10764 = arg7;
	}

	@ObfuscatedName("aih.ce(Ldh;Lalw;IIB)V")
	public final void readNormalEnvironment(Toolkit arg0, Packet arg1, int arg2, int arg3) {
		if (this.underwater) {
			return;
		}
		arg1.pos += 8;
		boolean var5 = false;
		Environment var6 = null;
		boolean var7 = false;
		while (true) {
			while (arg1.pos < arg1.data.length) {
				int var8 = arg1.g1();
				if (var8 == 0) {
					if (var6 == null) {
						var6 = new Environment(arg1, this.field10764);
					} else {
						var6.decode(arg1, this.field10764);
					}
				} else if (var8 == 1) {
					int var9 = arg1.g1();
					if (var9 > 0) {
						for (int var10 = 0; var10 < var9; var10++) {
							StaticPointLight var11 = new StaticPointLight(arg0, this.scene.size, arg1, 2);
							if (var11.field7014 == 31) {
								LightType var12 = (LightType) Client.lightTypeList.list(arg1.g2());
								var11.method8899(var12.field9168, var12.field9170, var12.field9167, var12.field9169);
							}
							if (arg0.getMaxLights() > 0) {
								Light var13 = var11.field7003;
								int var14 = var13.method17605() + (arg2 << 9);
								int var15 = var13.method17607() + (arg3 << 9);
								int var16 = var14 >> 9;
								int var17 = var15 >> 9;
								if (var16 >= 0 && var17 >= 0 && var16 < this.maxTileX && var17 < this.maxTileZ) {
									var13.method17628(var14, this.levelHeightmap[var11.field7006][var16][var17] - var13.method17606(), var15);
									this.scene.method8754(var11);
								}
							}
						}
					}
				} else if (var8 == 2) {
					if (var6 == null) {
						var6 = new Environment();
					}
					var6.decodeBloom(arg1);
				} else if (var8 == 3) {
					if (var6 == null) {
						var6 = new Environment();
					}
					var6.decodeColourRemapping(arg1);
				} else if (var8 == 128) {
					if (var6 == null) {
						var6 = new Environment();
					}
					var6.decodeSkybox(arg1, this.field10764);
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
							} else if (arg2 >= this.maxTileX) {
								var20 = this.maxTileX;
							}
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 >= this.maxTileX) {
								var21 = this.maxTileX;
							}
							if (arg3 < 0) {
								var22 = 0;
							} else if (arg3 >= this.maxTileZ) {
								var22 = this.maxTileZ;
							}
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 >= this.maxTileZ) {
								var23 = this.maxTileZ;
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
								this.field4517[var18] = new byte[this.maxTileX + 1][this.maxTileZ + 1];
							}
							for (int var24 = 0; var24 < 64; var24 += 4) {
								for (int var25 = 0; var25 < 64; var25 += 4) {
									byte var26 = arg1.g1b();
									for (int var27 = arg2 + var24; var27 < arg2 + var24 + 4; var27++) {
										for (int var28 = arg3 + var25; var28 < arg3 + var25 + 4; var28++) {
											if (var27 >= 0 && var27 < this.maxTileX && var28 >= 0 && var28 < this.maxTileZ) {
												this.field4517[var18][var27][var28] = var26;
											}
										}
									}
								}
							}
						} else if (var19 == 2) {
							if (this.field4517[var18] == null) {
								this.field4517[var18] = new byte[this.maxTileX + 1][this.maxTileZ + 1];
							}
							if (var18 > 0) {
								int var29 = arg2;
								int var30 = arg2 + 64;
								int var31 = arg3;
								int var32 = arg3 + 64;
								if (arg2 < 0) {
									var29 = 0;
								} else if (arg2 >= this.maxTileX) {
									var29 = this.maxTileX;
								}
								if (var30 < 0) {
									var30 = 0;
								} else if (var30 >= this.maxTileX) {
									var30 = this.maxTileX;
								}
								if (arg3 < 0) {
									var31 = 0;
								} else if (arg3 >= this.maxTileZ) {
									var31 = this.maxTileZ;
								}
								if (var32 < 0) {
									var32 = 0;
								} else if (var32 >= this.maxTileZ) {
									var32 = this.maxTileZ;
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
					if (var35 >= 0 && var35 < this.maxTileX >> 3 && var36 >= 0 && var36 < this.maxTileZ >> 3) {
						if (var6 != null) {
							this.field10764.setEnvironmentMap(var35, var36, var6);
						}
						MiniMap.method14707(var35, var36, var7);
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
	public final void readRegionEnvironment(Toolkit arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.underwater) {
			return;
		}
		arg1.pos += 8;
		boolean var10 = false;
		Environment var11 = null;
		boolean var12 = false;
		int var13 = (arg6 & 0x7) * 8;
		int var14 = (arg7 & 0x7) * 8;
		while (true) {
			while (arg1.pos < arg1.data.length) {
				int var15 = arg1.g1();
				if (var15 == 0) {
					if (var11 == null) {
						var11 = new Environment(arg1, this.field10764);
					} else {
						var11.decode(arg1, this.field10764);
					}
				} else if (var15 == 1) {
					int var16 = arg1.g1();
					if (var16 > 0) {
						for (int var17 = 0; var17 < var16; var17++) {
							StaticPointLight var18 = new StaticPointLight(arg0, this.scene.size, arg1, 2);
							if (var18.field7014 == 31) {
								LightType var19 = (LightType) Client.lightTypeList.list(arg1.g2());
								var18.method8899(var19.field9168, var19.field9170, var19.field9167, var19.field9169);
							}
							if (arg0.getMaxLights() > 0) {
								Light var20 = var18.field7003;
								int var21 = var20.method17605() >> 9;
								int var22 = var20.method17607() >> 9;
								if (var18.field7006 == arg5 && var21 >= var13 && var21 < var13 + 8 && var22 >= var14 && var22 < var14 + 8) {
									int var23 = (arg3 << 9) + MapCoordUtil.method7092(var20.method17605() & 0xFFF, var20.method17607() & 0xFFF, arg8);
									int var24 = (arg4 << 9) + MapCoordUtil.method8977(var20.method17605() & 0xFFF, var20.method17607() & 0xFFF, arg8);
									int var25 = var23 >> 9;
									int var26 = var24 >> 9;
									if (var25 >= 0 && var26 >= 0 && var25 < this.maxTileX && var26 < this.maxTileZ) {
										var18.field7006 = arg2;
										var20.method17628(var23, this.levelHeightmap[var18.field7006][var25][var26] - var20.method17606(), var24);
										this.scene.method8754(var18);
									}
								}
							}
						}
					}
				} else if (var15 == 2) {
					if (var11 == null) {
						var11 = new Environment();
					}
					var11.decodeBloom(arg1);
				} else if (var15 == 3) {
					if (var11 == null) {
						var11 = new Environment();
					}
					var11.decodeColourRemapping(arg1);
				} else if (var15 == 128) {
					if (var11 == null) {
						var11 = new Environment();
					}
					var11.decodeSkybox(arg1, this.field10764);
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
								} else if (arg3 >= this.maxTileX) {
									var29 = this.maxTileX;
								}
								if (var30 < 0) {
									var30 = 0;
								} else if (var30 >= this.maxTileX) {
									var30 = this.maxTileX;
								}
								if (arg4 < 0) {
									var31 = 0;
								} else if (arg4 >= this.maxTileZ) {
									var31 = this.maxTileZ;
								}
								if (var32 < 0) {
									var32 = 0;
								} else if (var32 >= this.maxTileZ) {
									var32 = this.maxTileZ;
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
								this.field4517[arg2] = new byte[this.maxTileX + 1][this.maxTileZ + 1];
							}
							for (int var33 = 0; var33 < 64; var33 += 4) {
								for (int var34 = 0; var34 < 64; var34 += 4) {
									byte var35 = arg1.g1b();
									if (var27 <= arg5) {
										for (int var36 = var33; var36 < var33 + 4; var36++) {
											for (int var37 = var34; var37 < var34 + 4; var37++) {
												if (var36 >= var13 && var36 < var13 + 8 && var37 >= var14 && var37 < var14 + 8) {
													int var38 = arg3 + MapCoordUtil.method14888(var36 & 0x7, var37 & 0x7, arg8);
													int var39 = arg4 + MapCoordUtil.method14756(var36 & 0x7, var37 & 0x7, arg8);
													if (var38 >= 0 && var38 < this.maxTileX && var39 >= 0 && var39 < this.maxTileZ) {
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
				this.field10764.setEnvironmentMap(arg3 >> 3, arg4 >> 3, var11);
			}
			MiniMap.method14707(arg3 >> 3, arg4 >> 3, var12);
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
	public static final int testReadLocs(LocTypeList locs, byte[] bytes, int arg2, int arg3, int arg4, int arg5, IntegerBox arg6, IntegerBox arg7) {
		int var8 = 0;
		Packet buf = new Packet(bytes);
		int locId = -1;
		label70: while (true) {
			int deltaId = buf.gExtended1or2();
			if (deltaId == 0) {
				return var8;
			}
			locId += deltaId;
			int var12 = 0;
			boolean var13 = false;
			while (true) {
				LocPositionAdjustment var15;
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
									int deltaPos;
									do {
										deltaPos = buf.gSmart1or2();
										if (deltaPos == 0) {
											continue label70;
										}
										var15 = new LocPositionAdjustment(buf);
									} while (var13);
									var12 += deltaPos - 1;
									int z = var12 & 0x3F;
									int x = var12 >> 6 & 0x3F;
									var18 = arg2 + x;
									var19 = arg3 + z;
									var20 = (LocType) locs.list(locId);
									if ((var15.angle & 0x1) == 0) {
										var21 = var20.width;
										var22 = var20.length;
									} else {
										var21 = var20.length;
										var22 = var20.width;
									}
								} while (var18 >= arg4);
							} while (var19 >= arg5);
						} while (var18 + var21 < 0);
					} while (var19 + var22 < 0);
				} while (LocShape.GROUND_DECOR.id == var15.shape && Client.preferences.groundDecoration.getValue() == 0 && var20.active == 0 && var20.blockwalk != 1 && !var20.forcedecor);
				if (!var20.method9489(arg7)) {
					arg6.intValue = locId;
					var8++;
				}
				var13 = true;
			}
		}
	}

	@ObfuscatedName("abb.cn(Laop;III)Z")
	public static final boolean method14705(LocTypeList arg0, int arg1, int arg2) {
		LocType var3 = (LocType) arg0.list(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return var3.method9473(arg2);
	}

	@ObfuscatedName("aih.cv(Ldh;[BIII)V")
	public final void readNormalLocs(Toolkit toolkit, byte[] locs, int arg2, int arg3) {
		Packet buf = new Packet(locs);
		int locId = -1;
		label63: while (true) {
			int deltaId = buf.gExtended1or2();
			if (deltaId == 0) {
				return;
			}
			locId += deltaId;
			int locPos = 0;
			while (true) {
				int level;
				LocPositionAdjustment var13;
				int var14;
				int var15;
				int var20;
				do {
					int var19;
					do {
						do {
							do {
								do {
									int deltaPos = buf.gSmart1or2();
									if (deltaPos == 0) {
										continue label63;
									}
									locPos += deltaPos - 1;
									int z = locPos & 0x3F;
									int x = locPos >> 6 & 0x3F;
									level = locPos >> 12;
									var13 = new LocPositionAdjustment(buf);
									var14 = arg2 + x;
									var15 = arg3 + z;
									LocType var16 = (LocType) this.locs.list(locId);
									int var17;
									int var18;
									if ((var13.angle & 0x1) == 0) {
										var17 = var16.width;
										var18 = var16.length;
									} else {
										var17 = var16.length;
										var18 = var16.width;
									}
									var19 = var14 + var17;
									var20 = var15 + var18;
								} while (var14 >= this.maxTileX);
							} while (var15 >= this.maxTileZ);
						} while (var19 <= 0);
					} while (var20 <= 0);
				} while (LocShape.CENTREPIECE_STRAIGHT.id != var13.shape && LocShape.CENTREPIECE_DIAGONAL.id != var13.shape && (var14 <= 0 || var15 <= 0 || var14 >= this.maxTileX - 1 || var15 >= this.maxTileZ - 1));
				this.addGroundLoc(toolkit, level, level, var14, var15, locId, var13.angle, var13.shape, -1, 0, var13.field7539);
			}
		}
	}

	@ObfuscatedName("aih.cp(Ldh;[BIIIIIIII)V")
	public final void readRegionLocs(Toolkit arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Packet buf = new Packet(arg1);
		int locId = -1;
		label88: while (true) {
			int deltaId = buf.gExtended1or2();
			if (deltaId == 0) {
				return;
			}
			locId += deltaId;
			int locPos = 0;
			while (true) {
				LocPositionAdjustment var18;
				int var22;
				int var23;
				int var25;
				do {
					int var24;
					do {
						do {
							do {
								do {
									int x;
									int z;
									do {
										do {
											do {
												int level;
												do {
													do {
														int deltaPos = buf.gSmart1or2();
														if (deltaPos == 0) {
															continue label88;
														}
														locPos += deltaPos - 1;
														x = locPos & 0x3F;
														z = locPos >> 6 & 0x3F;
														level = locPos >> 12;
														var18 = new LocPositionAdjustment(buf);
													} while (arg5 != level);
												} while (z < arg6);
											} while (z >= arg6 + 8);
										} while (x < arg7);
									} while (x >= arg7 + 8);
									LocType var19 = (LocType) this.locs.list(locId);
									int var20;
									int var21;
									if ((var18.angle & 0x1) == 0) {
										var20 = var19.width;
										var21 = var19.length;
									} else {
										var20 = var19.length;
										var21 = var19.width;
									}
									var22 = arg3 + MapCoordUtil.method9606(z & 0x7, x & 0x7, arg8, var19.width, var19.length, var18.angle);
									var23 = arg4 + MapCoordUtil.method2733(z & 0x7, x & 0x7, arg8, var19.width, var19.length, var18.angle);
									var24 = var20 + var22;
									var25 = var21 + var23;
								} while (var22 >= this.maxTileX);
							} while (var23 >= this.maxTileZ);
						} while (var24 <= 0);
					} while (var25 <= 0);
				} while (LocShape.CENTREPIECE_STRAIGHT.id != var18.shape && LocShape.CENTREPIECE_DIAGONAL.id != var18.shape && (var22 <= 0 || var23 <= 0 || var22 >= this.maxTileX - 1 || var23 >= this.maxTileZ - 1));
				this.addGroundLoc(arg0, arg2, arg2, var22, var23, locId, var18.angle + arg8 & 0x3, var18.shape, -1, 0, var18.field7539);
			}
		}
	}

	@ObfuscatedName("aih.ca(Ldh;IIIIIIIIILoe;I)V")
	public final void addGroundLoc(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, ScaleRotTrans arg10) {
		if (arg2 < this.field10756) {
			this.field10756 = arg2;
		}
		LocType var12 = (LocType) this.locs.list(arg5);
		if (Client.preferences.textures.getValue() == 0 && var12.istexture) {
			return;
		}
		int var13;
		int var14;
		if (arg6 == 1 || arg6 == 3) {
			var13 = var12.length;
			var14 = var12.width;
		} else {
			var13 = var12.width;
			var14 = var12.length;
		}
		int var15;
		int var16;
		if (arg3 + var13 <= this.maxTileX) {
			var15 = (var13 >> 1) + arg3;
			var16 = (var13 + 1 >> 1) + arg3;
		} else {
			var15 = arg3;
			var16 = arg3 + 1;
		}
		int var17;
		int var18;
		if (arg4 + var14 <= this.maxTileZ) {
			var17 = (var14 >> 1) + arg4;
			var18 = (var14 + 1 >> 1) + arg4;
		} else {
			var17 = arg4;
			var18 = arg4 + 1;
		}
		FloorModel var19 = this.scene.levelHeightmaps[arg1];
		int var20;
		if (LocShape.CENTREPIECE_STRAIGHT.id == arg7 || LocShape.CENTREPIECE_DIAGONAL.id == arg7) {
			var20 = var19.method1530(var15, var17) + var19.method1530(var16, var17) + var19.method1530(var15, var18) + var19.method1530(var16, var18) >> 2;
		} else {
			var20 = var19.getTileHeight(var15, var17) + var19.getTileHeight(var16, var17) + var19.getTileHeight(var15, var18) + var19.getTileHeight(var16, var18) >> 2;
		}
		int var21 = (arg3 << 9) + (var13 << 8);
		int var22 = (arg4 << 9) + (var14 << 8);
		boolean var23 = this.field4512 && !this.underwater && var12.sharelight;
		if (var12.method9480()) {
			PositionedSound.method9739(arg2, arg3, arg4, arg6, var12, null, null);
		}
		boolean var24 = arg8 == -1 && (!var12.method9504() || var12.field7479 && Client.preferences.animDetail.getValue() == 0) && var12.multiloc == null && !var12.field7520 && !var12.field7524;
		if (field10755 && (LocShape.isWall(arg7) && var12.occlude != 1 || !(!LocShape.isRoof(arg7) || var12.occlude != 0))) {
			return;
		}
		if (LocShape.GROUND_DECOR.id == arg7) {
			if (Client.preferences.groundDecoration.getValue() != 0 || var12.active != 0 || var12.blockwalk == 1 || var12.forcedecor) {
				GroundDecorLayerEntity var26;
				if (var24) {
					StaticGroundDecorEntity var25 = new StaticGroundDecorEntity(this.scene, arg0, this.locs, var12, arg2, arg1, var21, var20, var22, this.underwater, arg6, var23, arg10);
					if (var25.hasShadow()) {
						var25.method8217(arg0);
					}
					var26 = var25;
				} else {
					var26 = new DynamicGroundDecorEntity(this.scene, arg0, this.locs, var12, arg2, arg1, var21, var20, var22, this.underwater, arg6, arg8, arg9, arg10);
				}
				this.scene.addGroundDecoration(arg2, arg3, arg4, var26);
			}
		} else if (LocShape.CENTREPIECE_STRAIGHT.id == arg7 || LocShape.CENTREPIECE_DIAGONAL.id == arg7) {
			StaticSceneryEntity var29 = null;
			int var31;
			PrimaryLayerEntity var32;
			if (var24) {
				StaticSceneryEntity var30 = new StaticSceneryEntity(this.scene, arg0, this.locs, var12, arg2, arg1, var21, var20, var22, this.underwater, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, var23, LocTypeRelated.field7440 != var12.field7526, arg10);
				var31 = var30.method17401();
				var32 = var30;
				var29 = var30;
			} else {
				var32 = new DynamicSceneryEntity(this.scene, arg0, this.locs, var12, arg2, arg1, var21, var20, var22, this.underwater, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, arg8, arg9, LocTypeRelated.field7440 != var12.field7526, arg10);
				var31 = 15;
			}
			if (this.scene.addEntity(var32, false)) {
				if (var29 != null && var29.hasShadow()) {
					var29.method8217(arg0);
				}
				if (var12.hasHardShadow && this.field4512) {
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
		} else if (LocShape.isRoof(arg7) || LocShape.isRoofEdge(arg7)) {
			PrimaryLayerEntity var28;
			if (var24) {
				StaticSceneryEntity var27 = new StaticSceneryEntity(this.scene, arg0, this.locs, var12, arg2, arg1, var21, var20, var22, this.underwater, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, var23, true, arg10);
				if (var27.hasShadow()) {
					var27.method8217(arg0);
				}
				var28 = var27;
			} else {
				var28 = new DynamicSceneryEntity(this.scene, arg0, this.locs, var12, arg2, arg1, var21, var20, var22, this.underwater, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, arg8, arg9, true, arg10);
			}
			this.scene.addEntity(var28, false);
			if (this.field4512 && !this.underwater && LocShape.isRoof(arg7) && LocShape.ROOF_DIAGONAL_WITH_ROOFEDGE.id != arg7 && arg2 > 0 && var12.occlude != 0) {
				this.levelOccludemap[arg2][arg3][arg4] = (byte) (this.levelOccludemap[arg2][arg3][arg4] | 0x4);
			}
		} else if (!this.addWallLoc(arg0, arg7, arg6, var24, var12, arg8, arg9, arg2, arg1, var21, var20, var22, arg3, arg4, var23, var19, var13, var14, arg10) && !this.addWallDecorationLoc(arg0, arg7, arg6, var24, var12, arg8, arg9, arg2, arg1, var21, var20, var22, arg3, arg4, arg10)) {
			;
		}
	}

	@ObfuscatedName("aih.cx(Ldh;IIZLvd;IIIIIIIIIZLcb;IILoe;I)Z")
	public boolean addWallLoc(Toolkit arg0, int arg1, int rotation, boolean arg3, LocType arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, FloorModel arg15, int arg16, int arg17, ScaleRotTrans arg18) {
		if (LocShape.WALL_STRAIGHT.id == arg1) {
			int var20 = arg4.occlude;
			if (field10754 && arg4.occlude == -1) {
				var20 = 1;
			}
			WallLayerEntity var22;
			if (arg3) {
				StaticWallEntity var21 = new StaticWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation, arg14, arg18);
				if (var21.hasShadow()) {
					var21.method8217(arg0);
				}
				var22 = var21;
			} else {
				var22 = new DynamicWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation, arg5, arg6, arg18);
			}
			this.scene.addWall(arg7, arg12, arg13, var22, null);
			if (rotation == 0) {
				if (this.field4512 && arg4.hasHardShadow) {
					arg15.method1521(arg12, arg13, 50);
					arg15.method1521(arg12, arg13 + 1, 50);
				}
				if (var20 == 1 && !this.underwater) {
					this.scene.occlusionManager.method8957(1, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				}
			} else if (rotation == 1) {
				if (this.field4512 && arg4.hasHardShadow) {
					arg15.method1521(arg12, arg13 + 1, 50);
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				}
				if (var20 == 1 && !this.underwater) {
					this.scene.occlusionManager.method8957(2, arg7, arg12, arg13 + 1, arg4.field7475, -arg4.field7476);
				}
			} else if (rotation == 2) {
				if (this.field4512 && arg4.hasHardShadow) {
					arg15.method1521(arg12 + 1, arg13, 50);
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				}
				if (var20 == 1 && !this.underwater) {
					this.scene.occlusionManager.method8957(1, arg7, arg12 + 1, arg13, arg4.field7475, -arg4.field7476);
				}
			} else if (rotation == 3) {
				if (this.field4512 && arg4.hasHardShadow) {
					arg15.method1521(arg12, arg13, 50);
					arg15.method1521(arg12 + 1, arg13, 50);
				}
				if (var20 == 1 && !this.underwater) {
					this.scene.occlusionManager.method8957(2, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				}
			}
			if (arg4.walloff != 64) {
				this.scene.method8765(arg7, arg12, arg13, arg4.walloff);
			}
			return true;
		} else if (LocShape.WALL_DIAGONAL_CORNER.id == arg1) {
			WallLayerEntity var24;
			if (arg3) {
				StaticWallEntity var23 = new StaticWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation, arg14, arg18);
				if (var23.hasShadow()) {
					var23.method8217(arg0);
				}
				var24 = var23;
			} else {
				var24 = new DynamicWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation, arg5, arg6, arg18);
			}
			this.scene.addWall(arg7, arg12, arg13, var24, null);
			if (arg4.hasHardShadow && this.field4512) {
				if (rotation == 0) {
					arg15.method1521(arg12, arg13 + 1, 50);
				} else if (rotation == 1) {
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				} else if (rotation == 2) {
					arg15.method1521(arg12 + 1, arg13, 50);
				} else if (rotation == 3) {
					arg15.method1521(arg12, arg13, 50);
				}
			}
			return true;
		} else if (LocShape.WALL_L.id == arg1) {
			int var25 = rotation + 1 & 0x3;
			WallLayerEntity var28;
			WallLayerEntity var29;
			if (arg3) {
				StaticWallEntity var26 = new StaticWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation + 4, arg14, arg18);
				StaticWallEntity var27 = new StaticWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, var25, arg14, arg18);
				if (var26.hasShadow()) {
					var26.method8217(arg0);
				}
				if (var27.hasShadow()) {
					var27.method8217(arg0);
				}
				var28 = var26;
				var29 = var27;
			} else {
				var28 = new DynamicWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation + 4, arg5, arg6, arg18);
				var29 = new DynamicWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, var25, arg5, arg6, arg18);
			}
			this.scene.addWall(arg7, arg12, arg13, var28, var29);
			if ((arg4.occlude == 1 || field10754 && arg4.occlude == -1) && !this.underwater) {
				if (rotation == 0) {
					this.scene.occlusionManager.method8957(1, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
					this.scene.occlusionManager.method8957(2, arg7, arg12, arg13 + 1, arg4.field7475, arg4.field7476);
				} else if (rotation == 1) {
					this.scene.occlusionManager.method8957(1, arg7, arg12 + 1, arg13, arg4.field7475, arg4.field7476);
					this.scene.occlusionManager.method8957(2, arg7, arg12, arg13 + 1, arg4.field7475, arg4.field7476);
				} else if (rotation == 2) {
					this.scene.occlusionManager.method8957(1, arg7, arg12 + 1, arg13, arg4.field7475, arg4.field7476);
					this.scene.occlusionManager.method8957(2, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				} else if (rotation == 3) {
					this.scene.occlusionManager.method8957(1, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
					this.scene.occlusionManager.method8957(2, arg7, arg12, arg13, arg4.field7475, arg4.field7476);
				}
			}
			if (arg4.walloff != 64) {
				this.scene.method8765(arg7, arg12, arg13, arg4.walloff);
			}
			return true;
		} else if (LocShape.WALL_SQUARE_CORNER.id == arg1) {
			WallLayerEntity var31;
			if (arg3) {
				StaticWallEntity var30 = new StaticWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation, arg14, arg18);
				if (var30.hasShadow()) {
					var30.method8217(arg0);
				}
				var31 = var30;
			} else {
				var31 = new DynamicWallEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg1, rotation, arg5, arg6, arg18);
			}
			this.scene.addWall(arg7, arg12, arg13, var31, null);
			if (arg4.hasHardShadow && this.field4512) {
				if (rotation == 0) {
					arg15.method1521(arg12, arg13 + 1, 50);
				} else if (rotation == 1) {
					arg15.method1521(arg12 + 1, arg13 + 1, 50);
				} else if (rotation == 2) {
					arg15.method1521(arg12 + 1, arg13, 50);
				} else if (rotation == 3) {
					arg15.method1521(arg12, arg13, 50);
				}
			}
			return true;
		} else if (LocShape.WALL_DIAGONAL.id == arg1) {
			PrimaryLayerEntity var33;
			if (arg3) {
				StaticSceneryEntity var32 = new StaticSceneryEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg12, arg12, arg13, arg13, arg1, rotation, arg14, true, arg18);
				if (var32.hasShadow()) {
					var32.method8217(arg0);
				}
				var33 = var32;
			} else {
				var33 = new DynamicSceneryEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, arg12, arg12 + arg16 - 1, arg13, arg13 + arg17 - 1, arg1, rotation, arg5, arg6, true, arg18);
			}
			this.scene.addEntity(var33, false);
			if (arg4.occlude == 1 && !this.underwater) {
				byte var34;
				if ((rotation & 0x1) == 0) {
					var34 = 8;
				} else {
					var34 = 16;
				}
				this.scene.occlusionManager.method8957(var34, arg7, arg12, arg13, arg4.field7475, 0);
			}
			if (arg4.walloff != 64) {
				this.scene.method8765(arg7, arg12, arg13, arg4.walloff);
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aih.cw(Ldh;IIZLvd;IIIIIIIIILoe;B)Z")
	public boolean addWallDecorationLoc(Toolkit arg0, int locShapeId, int arg2, boolean isStatic, LocType arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, ScaleRotTrans arg14) {
		if (LocShape.WALLDECOR_STRAIGHT_NOOFFSET.id == locShapeId) {
			WallDecorLayerEntity var17;
			if (isStatic) {
				StaticWallDecorEntity var16 = new StaticWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, 0, 0, locShapeId, arg2, arg14);
				if (var16.hasShadow()) {
					var16.method8217(arg0);
				}
				var17 = var16;
			} else {
				var17 = new DynamicWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, 0, 0, locShapeId, arg2, arg5, arg6, arg14);
			}
			this.scene.addWallDecoration(arg7, arg12, arg13, var17, null);
			return true;
		} else if (LocShape.WALLDECOR_STRAIGHT_OFFSET.id == locShapeId) {
			int var18 = 65;
			Location var19 = (Location) this.scene.getWall(arg7, arg12, arg13);
			if (var19 != null) {
				var18 = ((LocType) this.locs.list(var19.getId())).walloff + 1;
			}
			WallDecorLayerEntity var21;
			if (isStatic) {
				StaticWallDecorEntity var20 = new StaticWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, WALL_DECORATION_ROTATION_FORWARD_X[arg2] * var18, WALL_DECORATION_ROTATION_FORWARD_Z[arg2] * var18, locShapeId, arg2, arg14);
				if (var20.hasShadow()) {
					var20.method8217(arg0);
				}
				var21 = var20;
			} else {
				var21 = new DynamicWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, WALL_DECORATION_ROTATION_FORWARD_X[arg2] * var18, WALL_DECORATION_ROTATION_FORWARD_Z[arg2] * var18, locShapeId, arg2, arg5, arg6, arg14);
			}
			this.scene.addWallDecoration(arg7, arg12, arg13, var21, null);
			return true;
		} else if (LocShape.WALLDECOR_DIAGONAL_OFFSET.id == locShapeId) {
			int var22 = 33;
			Location var23 = (Location) this.scene.getWall(arg7, arg12, arg13);
			if (var23 != null) {
				var22 = ((LocType) this.locs.list(var23.getId())).walloff / 2 + 1;
			}
			WallDecorLayerEntity var25;
			if (isStatic) {
				StaticWallDecorEntity var24 = new StaticWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, WALL_DECORATION_ROTATION_FORWARD_X[arg2] * var22, WALL_DECORATION_ROTATION_FORWARD_Z[arg2] * var22, locShapeId, arg2 + 4, arg14);
				if (var24.hasShadow()) {
					var24.method8217(arg0);
				}
				var25 = var24;
			} else {
				var25 = new DynamicWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, field10753[arg2] * var22, field10762[arg2] * var22, locShapeId, arg2 + 4, arg5, arg6, arg14);
			}
			this.scene.addWallDecoration(arg7, arg12, arg13, var25, null);
			return true;
		} else if (LocShape.WALLDECOR_DIAGONAL_NOOFFSET.id == locShapeId) {
			int var26 = arg2 + 2 & 0x3;
			WallDecorLayerEntity var28;
			if (isStatic) {
				StaticWallDecorEntity var27 = new StaticWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, 0, 0, locShapeId, var26 + 4, arg14);
				if (var27.hasShadow()) {
					var27.method8217(arg0);
				}
				var28 = var27;
			} else {
				var28 = new DynamicWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, 0, 0, locShapeId, var26 + 4, arg5, arg6, arg14);
			}
			this.scene.addWallDecoration(arg7, arg12, arg13, var28, null);
			return true;
		} else if (LocShape.WALLDECOR_DIAGONAL_BOTH.id == locShapeId) {
			int var29 = arg2 + 2 & 0x3;
			int var30 = 33;
			Location var31 = (Location) this.scene.getWall(arg7, arg12, arg13);
			if (var31 != null) {
				var30 = ((LocType) this.locs.list(var31.getId())).walloff / 2 + 1;
			}
			WallDecorLayerEntity var34;
			WallDecorLayerEntity var35;
			if (isStatic) {
				StaticWallDecorEntity var32 = new StaticWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, field10753[arg2] * var30, field10762[arg2] * var30, locShapeId, arg2 + 4, arg14);
				StaticWallDecorEntity var33 = new StaticWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, 0, 0, locShapeId, var29 + 4, arg14);
				if (var32.hasShadow()) {
					var32.method8217(arg0);
				}
				if (var33.hasShadow()) {
					var33.method8217(arg0);
				}
				var34 = var32;
				var35 = var33;
			} else {
				DynamicWallDecorEntity var36 = new DynamicWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, field10753[arg2] * var30, field10762[arg2] * var30, locShapeId, arg2 + 4, arg5, arg6, arg14);
				DynamicWallDecorEntity var37 = new DynamicWallDecorEntity(this.scene, arg0, this.locs, arg4, arg7, arg8, arg9, arg10, arg11, this.underwater, 0, 0, locShapeId, var29 + 4, arg5, arg6, arg14);
				var34 = var36;
				var35 = var37;
			}
			this.scene.addWallDecoration(arg7, arg12, arg13, var34, var35);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aih.ct(Ldh;IIIIB)V")
	public void method16871(Toolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		Location var6 = this.method16899(arg1, arg2, arg3, arg4);
		if (var6 == null) {
			return;
		}
		LocType var7 = (LocType) this.locs.list(var6.getId());
		int var8 = var6.getShape();
		int var9 = var6.getAngle();
		if (var7.method9480()) {
			PositionedSound.method6206(arg1, arg3, arg4, var7);
		}
		if (var6.hasShadow()) {
			var6.method8209(arg0);
		}
		if (arg2 == 0) {
			this.scene.removeWall(arg1, arg3, arg4);
			this.scene.removeDynamicWall(arg1, arg3, arg4);
			if (var7.occlude == 1) {
				if (var9 == 0) {
					this.scene.occlusionManager.method8919(1, arg1, arg3, arg4);
				} else if (var9 == 1) {
					this.scene.occlusionManager.method8919(2, arg1, arg3, arg4 + 1);
				} else if (var9 == 2) {
					this.scene.occlusionManager.method8919(1, arg1, arg3 + 1, arg4);
				} else if (var9 == 3) {
					this.scene.occlusionManager.method8919(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.scene.removeWallDecoration(arg1, arg3, arg4);
			this.scene.removeDynamicWallDecoration(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.scene.removeEntity(arg1, arg3, arg4, Client.field11001);
			if (LocShape.WALL_DIAGONAL.id == var8) {
				if ((var9 & 0x1) == 0) {
					this.scene.occlusionManager.method8919(8, arg1, arg3, arg4);
				} else {
					this.scene.occlusionManager.method8919(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.scene.removeGroundDecoration(arg1, arg3, arg4);
		}
	}

	@ObfuscatedName("aih.cf(IIIII)Lst;")
	public Location method16899(int arg0, int arg1, int arg2, int arg3) {
		Location var5 = null;
		if (arg1 == 0) {
			var5 = (Location) this.scene.getWall(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			var5 = (Location) this.scene.getWallDecoration(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			var5 = (Location) this.scene.getEntity(arg0, arg2, arg3, Client.field11001);
		}
		if (arg1 == 3) {
			var5 = (Location) this.scene.getGroundDecoration(arg0, arg2, arg3);
		}
		return var5;
	}

	@ObfuscatedName("aih.co(Ldh;ZB)V")
	public final void build(Toolkit arg0, boolean underwater) {
		this.scene.buildModels();
		if (!underwater) {
			if (this.levels > 1) {
				for (int x = 0; x < this.maxTileX; x++) {
					for (int z = 0; z < this.maxTileZ; z++) {
						if ((this.sceneLevelTileFlags.levelTileFlags[1][x][z] & 0x2) == 2) {
							this.scene.setBridge(x, z);
						}
					}
				}
			}
			for (int level = 0; level < this.levels; level++) {
				for (int tileZ = 0; tileZ <= this.maxTileZ; tileZ++) {
					for (int tileX = 0; tileX <= this.maxTileX; tileX++) {
						if ((this.levelOccludemap[level][tileX][tileZ] & 0x4) != 0) {
							int minTileX = tileX;
							int maxTileX = tileX;
							int minTileZ = tileZ;
							int maxTileZ = tileZ;
							while (minTileZ > 0 && (this.levelOccludemap[level][tileX][minTileZ - 1] & 0x4) != 0 && maxTileZ - minTileZ < 10) {
								minTileZ--;
							}
							while (maxTileZ < this.maxTileZ && (this.levelOccludemap[level][tileX][maxTileZ + 1] & 0x4) != 0 && maxTileZ - minTileZ < 10) {
								maxTileZ++;
							}
							find_min_tile_xz: while (minTileX > 0 && maxTileX - minTileX < 10) {
								for (int z = minTileZ; z <= maxTileZ; z++) {
									if ((this.levelOccludemap[level][minTileX - 1][z] & 0x4) == 0) {
										break find_min_tile_xz;
									}
								}
								minTileX--;
							}
							find_max_tile_xz: while (maxTileX < this.maxTileX && maxTileX - minTileX < 10) {
								for (int var13 = minTileZ; var13 <= maxTileZ; var13++) {
									if ((this.levelOccludemap[level][maxTileX + 1][var13] & 0x4) == 0) {
										break find_max_tile_xz;
									}
								}
								maxTileX++;
							}
							if ((maxTileX - minTileX + 1) * (maxTileZ - minTileZ + 1) >= 4) {
								int y = this.levelHeightmap[level][minTileX][minTileZ];
								this.scene.occlusionManager.addOccluder(4, level, minTileX << 9, (maxTileX << 9) + 512, minTileZ << 9, (maxTileZ << 9) + 512, y, y);
								for (int x = minTileX; x <= maxTileX; x++) {
									for (int z = minTileZ; z <= maxTileZ; z++) {
										this.levelOccludemap[level][x][z] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.scene.occlusionManager.method8931();
		}
		this.levelOccludemap = null;
	}
}
