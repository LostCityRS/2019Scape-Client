package com.jagex.game.client;

import com.jagex.game.config.ParticleEffectorType;
import com.jagex.game.config.ParticleEmitterType;
import com.jagex.game.world.entity.EntityBounds;
import com.jagex.game.world.entity.PrimaryLayerEntityList;
import com.jagex.game.world.entity.Scene;
import com.jagex.game.world.entity.Tile;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Particle;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleEffector;
import com.jagex.graphics.particles.ParticleEmitter;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("atz")
public class MovingParticle extends Particle {

	@ObfuscatedName("atz.o")
	public ParticleEmitter field12526;

	@ObfuscatedName("atz.s")
	public short field12523;

	@ObfuscatedName("atz.y")
	public short field12524;

	@ObfuscatedName("atz.q")
	public short field12525;

	@ObfuscatedName("atz.x")
	public int field12527;

	@ObfuscatedName("atz.b")
	public int field12522;

	@ObfuscatedName("atz.h")
	public short field12530;

	@ObfuscatedName("atz.a")
	public short field12529;

	@ObfuscatedName("atz.g")
	public short field12528;

	@ObfuscatedName("atz.i")
	public short field12531;

	public MovingParticle(ParticleEmitter arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
		this.field12526 = arg0;
		this.x = arg1 << 12;
		this.y = arg2 << 12;
		this.z = arg3 << 12;
		this.field12158 = arg9;
		this.field12524 = this.field12525 = (short) arg8;
		this.field12162 = arg10;
		this.field12156 = (short) arg11;
		this.field12531 = (short) arg12;
		this.field12160 = arg13;
		this.field12165 = arg15;
		this.field12530 = (short) arg4;
		this.field12529 = (short) arg5;
		this.field12528 = (short) arg6;
		this.field12522 = arg7;
		this.method19666();
	}

	@ObfuscatedName("atz.k(Lxm;IIIIIIIIIIIIIZZ)V")
	public void method19665(ParticleEmitter arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
		this.field12526 = arg0;
		this.x = arg1 << 12;
		this.y = arg2 << 12;
		this.z = arg3 << 12;
		this.field12158 = arg9;
		this.field12524 = this.field12525 = (short) arg8;
		this.field12162 = arg10;
		this.field12156 = (short) arg11;
		this.field12531 = (short) arg12;
		this.field12160 = arg13;
		this.field12165 = arg15;
		this.field12530 = (short) arg4;
		this.field12529 = (short) arg5;
		this.field12528 = (short) arg6;
		this.field12522 = arg7;
		this.method19666();
	}

	@ObfuscatedName("atz.f()V")
	public void method19666() {
		int var1 = this.field12526.field7785.field7806;
		if (this.field12526.field7785.field7805[var1] != null) {
			this.field12526.field7785.field7805[var1].method19669();
		}
		this.field12526.field7785.field7805[var1] = this;
		this.field12523 = (short) this.field12526.field7785.field7806;
		this.field12526.field7785.field7806 = var1 + 1 & 0x1FFF;
		this.field12526.field7775.pushBack(this);
	}

	@ObfuscatedName("atz.w(JI)V")
	public void method19667(long arg0, int arg1) {
		this.field12525 = (short) (this.field12525 - arg1);
		if (this.field12525 <= 0) {
			this.method19669();
			return;
		}
		int var4 = this.x >> 12;
		int var5 = this.y >> 12;
		int var6 = this.z >> 12;
		ParticleSystem var7 = this.field12526.field7785;
		ParticleEmitterType var8 = this.field12526.field7772;
		if (var8.field3478 != 0) {
			if (this.field12524 - this.field12525 <= var8.field3524) {
				int var9 = var8.field3530 * arg1 + (this.field12527 >> 16 & 0xFF) + (this.field12158 >> 8 & 0xFF00);
				int var10 = var8.field3527 * arg1 + (this.field12527 >> 8 & 0xFF) + (this.field12158 & 0xFF00);
				int var11 = var8.field3528 * arg1 + ((this.field12158 & 0xFF) << 8) + (this.field12527 & 0xFF);
				if (var9 < 0) {
					var9 = 0;
				} else if (var9 > 65535) {
					var9 = 65535;
				}
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 65535) {
					var10 = 65535;
				}
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 > 65535) {
					var11 = 65535;
				}
				this.field12158 &= 0xFF000000;
				this.field12158 |= (var11 >> 8 & 0xFF) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
				this.field12527 &= 0xFF000000;
				this.field12527 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
			}
			if (this.field12524 - this.field12525 <= var8.field3500) {
				int var12 = var8.field3465 * arg1 + (this.field12527 >> 24 & 0xFF) + (this.field12158 >> 16 & 0xFF00);
				if (var12 < 0) {
					var12 = 0;
				} else if (var12 > 65535) {
					var12 = 65535;
				}
				this.field12158 &= 0xFFFFFF;
				this.field12158 |= (var12 & 0xFF00) << 16;
				this.field12527 &= 0xFFFFFF;
				this.field12527 |= (var12 & 0xFF) << 24;
			}
		}
		if (var8.field3469 != -1 && this.field12524 - this.field12525 <= var8.field3529) {
			this.field12522 += var8.field3481 * arg1;
		}
		if (var8.field3473 != -1 && this.field12524 - this.field12525 <= var8.field3509) {
			this.field12162 += var8.field3521 * arg1;
		}
		if (this.field12531 != 0) {
			this.field12156 = (short) (this.field12531 * arg1 + this.field12156 & 0x3FFF);
		}
		double var13 = (double) this.field12530;
		double var15 = (double) this.field12529;
		double var17 = (double) this.field12528;
		boolean var19 = false;
		if (var8.field3467 == 1) {
			int var20 = var4 - this.field12526.field7779.field7819;
			int var21 = var5 - this.field12526.field7779.field7824;
			int var22 = var6 - this.field12526.field7779.field7828;
			int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
			long var24 = (long) (var8.field3492 * var23 * arg1);
			this.field12522 = (int) ((long) this.field12522 - ((long) this.field12522 * var24 >> 18));
		} else if (var8.field3467 == 2) {
			int var26 = var4 - this.field12526.field7779.field7819;
			int var27 = var5 - this.field12526.field7779.field7824;
			int var28 = var6 - this.field12526.field7779.field7828;
			int var29 = var28 * var28 + var26 * var26 + var27 * var27;
			long var30 = (long) (var8.field3492 * var29 * arg1);
			this.field12522 = (int) ((long) this.field12522 - ((long) this.field12522 * var30 >> 28));
		}
		if (var8.field3486 != null) {
			Iterator var32 = var7.field7803.iterator();
			label226: while (true) {
				ParticleEffector var33;
				ParticleEffectorType var34;
				do {
					if (!var32.hasNext()) {
						break label226;
					}
					var33 = (ParticleEffector) var32.next();
					var34 = var33.field11483;
				} while (var34.field3549 == 1);
				boolean var35 = false;
				for (int var36 = 0; var36 < var8.field3486.length; var36++) {
					if (var34.field3548 == var8.field3486[var36]) {
						var35 = true;
						break;
					}
				}
				if (var35) {
					double var37 = (double) (var4 - var33.field11484);
					double var39 = (double) (var5 - var33.field11481);
					double var41 = (double) (var6 - var33.field11482);
					double var43 = var41 * var41 + var37 * var37 + var39 * var39;
					if (!(var43 > (double) var34.field3560)) {
						double var45 = Math.sqrt(var43);
						if (var45 == 0.0D) {
							var45 = 1.0D;
						}
						double var47 = ((double) var33.field11487 * var41 + (double) var33.field11486 * var37 + (double) var34.field3552 * var39) * 65535.0D / ((double) var34.field3559 * var45);
						if (!(var47 < (double) var34.field3554)) {
							double var49 = 0.0D;
							if (var34.field3557 == 1) {
								var49 = var45 / 16.0D * (double) var34.field3556;
							} else if (var34.field3557 == 2) {
								var49 = var45 / 16.0D * (var45 / 16.0D) * (double) var34.field3556;
							}
							if (var34.field3561 != 0) {
								double var51 = var37 / var45 * (double) var34.field3559;
								double var53 = var39 / var45 * (double) var34.field3559;
								double var55 = var41 / var45 * (double) var34.field3559;
								if (var34.field3542 == 0) {
									var13 += (double) arg1 * var51;
									var15 += (double) arg1 * var53;
									var17 += (double) arg1 * var55;
									var19 = true;
								} else {
									this.x = (int) ((double) this.x + (double) arg1 * var51);
									this.y = (int) ((double) this.y + (double) arg1 * var53);
									this.z = (int) ((double) this.z + (double) arg1 * var55);
								}
							} else if (var34.field3542 == 0) {
								var13 += ((double) var33.field11486 - var49) * (double) arg1;
								var15 += ((double) var34.field3552 - var49) * (double) arg1;
								var17 += ((double) var33.field11487 - var49) * (double) arg1;
								var19 = true;
							} else {
								this.x = (int) ((double) this.x + ((double) var33.field11486 - var49) * (double) arg1);
								this.y = (int) ((double) this.y + ((double) var34.field3552 - var49) * (double) arg1);
								this.z = (int) ((double) this.z + ((double) var33.field11487 - var49) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (var8.field3487 != null) {
			label207: for (int var57 = 0; var57 < var8.field3487.length; var57++) {
				ParticleEffector var58 = (ParticleEffector) ParticleSystemRenderer.field7800.get((long) var8.field3487[var57]);
				while (true) {
					while (true) {
						if (var58 == null) {
							continue label207;
						}
						ParticleEffectorType var59 = var58.field11483;
						double var60 = (double) (var4 - var58.field11484);
						double var62 = (double) (var5 - var58.field11481);
						double var64 = (double) (var6 - var58.field11482);
						double var66 = var64 * var64 + var60 * var60 + var62 * var62;
						if (var66 > (double) var59.field3560) {
							var58 = (ParticleEffector) ParticleSystemRenderer.field7800.nextWithKey();
						} else {
							double var68 = Math.sqrt(var66);
							if (var68 == 0.0D) {
								var68 = 1.0D;
							}
							if (var59.field3555 > 0 && var59.field3555 < 2047) {
								double var70 = ((double) var58.field11487 * var64 + (double) var58.field11486 * var60 + (double) var59.field3552 * var62) * 16384.0D / ((double) var59.field3559 * var68);
								if (var70 < (double) var59.field3554) {
									var58 = (ParticleEffector) ParticleSystemRenderer.field7800.nextWithKey();
									continue;
								}
							}
							double var72 = 0.0D;
							if (var59.field3557 == 1) {
								var72 = var68 / 16.0D * (double) var59.field3556;
							} else if (var59.field3557 == 2) {
								var72 = var68 / 16.0D * (var68 / 16.0D) * (double) var59.field3556;
							}
							if (var59.field3561 != 0) {
								double var74 = var60 / var68 * (double) var59.field3559;
								double var76 = var62 / var68 * (double) var59.field3559;
								double var78 = var64 / var68 * (double) var59.field3559;
								if (var59.field3542 == 0) {
									var13 += (double) arg1 * var74;
									var15 += (double) arg1 * var76;
									var17 += (double) arg1 * var78;
									var19 = true;
								} else {
									this.x = (int) ((double) this.x + (double) arg1 * var74);
									this.y = (int) ((double) this.y + (double) arg1 * var76);
									this.z = (int) ((double) this.z + (double) arg1 * var78);
								}
							} else if (var59.field3542 == 0) {
								var13 += ((double) var58.field11486 - var72) * (double) arg1;
								var15 += ((double) var59.field3552 - var72) * (double) arg1;
								var17 += ((double) var58.field11487 - var72) * (double) arg1;
								var19 = true;
							} else {
								this.x = (int) ((double) this.x + ((double) var58.field11486 - var72) * (double) arg1);
								this.y = (int) ((double) this.y + ((double) var59.field3552 - var72) * (double) arg1);
								this.z = (int) ((double) this.z + ((double) var58.field11487 - var72) * (double) arg1);
							}
							var58 = (ParticleEffector) ParticleSystemRenderer.field7800.nextWithKey();
						}
					}
				}
			}
		}
		if (var8.field3512 != null) {
			if (var8.field3489 == null) {
				var8.field3489 = new int[var8.field3512.length];
				for (int var80 = 0; var80 < var8.field3512.length; var80++) {
					ParticleSystemRenderer.field12041.method5973(var8.field3512[var80]);
					var8.field3489[var80] = ParticleSystemRenderer.method9543(var8.field3512[var80]);
				}
			}
			for (int var81 = 0; var81 < var8.field3489.length; var81++) {
				ParticleEffectorType var82 = ParticleSystemRenderer.field7795[var8.field3489[var81]];
				if (var82.field3542 == 0) {
					var13 += var82.field3551 * arg1;
					var15 += var82.field3552 * arg1;
					var17 += var82.field3553 * arg1;
					var19 = true;
				} else {
					this.x += var82.field3551 * arg1;
					this.y += var82.field3552 * arg1;
					this.z += var82.field3553 * arg1;
				}
			}
		}
		if (var19) {
			while (true) {
				if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
					this.field12530 = (short) var13;
					this.field12529 = (short) var15;
					this.field12528 = (short) var17;
					break;
				}
				var13 /= 2.0D;
				var15 /= 2.0D;
				var17 /= 2.0D;
				this.field12522 <<= 0x1;
			}
		}
		this.x = (int) ((long) this.x + ((long) (this.field12522 << 2) * (long) this.field12530 >> 23) * (long) arg1);
		this.y = (int) ((long) this.y + ((long) (this.field12522 << 2) * (long) this.field12529 >> 23) * (long) arg1);
		this.z = (int) ((long) this.z + ((long) (this.field12522 << 2) * (long) this.field12528 >> 23) * (long) arg1);
	}

	@ObfuscatedName("atz.l(Ltx;Ldh;J)V")
	public void method19668(Scene arg0, Toolkit arg1, long arg2) {
		int var5 = this.x >> arg0.size + 12;
		int var6 = this.z >> arg0.size + 12;
		int var7 = this.y >> 12;
		if (var7 > 262144 || var7 < -262144 || var5 < 0 || var5 >= arg0.maxTileX || var6 < 0 || var6 >= arg0.maxTileZ) {
			this.method19669();
			return;
		}
		ParticleSystem var8 = this.field12526.field7785;
		ParticleEmitterType var9 = this.field12526.field7772;
		FloorModel[] var10 = arg0.levelHeightmaps;
		int var11 = var8.field7815;
		Tile var12 = arg0.levelTiles[var8.field7815][var5][var6];
		if (var12 != null) {
			var11 = var12.level;
		}
		int var13 = var10[var11].getTileHeight(var5, var6);
		int var14;
		if (var11 < arg0.maxLevel - 1) {
			var14 = var10[var11 + 1].getTileHeight(var5, var6);
		} else {
			var14 = var13 - (0x8 << arg0.size);
		}
		if (var9.field3511) {
			if (var9.field3491 == -1 && var7 > var13) {
				this.method19669();
				return;
			}
			if (var9.field3491 >= 0 && var7 > var10[var9.field3491].getTileHeight(var5, var6)) {
				this.method19669();
				return;
			}
			if (var9.field3493 == -1 && var7 < var14) {
				this.method19669();
				return;
			}
			if (var9.field3493 >= 0 && var7 < var10[var9.field3493 + 1].getTileHeight(var5, var6)) {
				this.method19669();
				return;
			}
		}
		int var15;
		for (var15 = arg0.maxLevel - 1; var15 > 0 && var7 > var10[var15].getTileHeight(var5, var6); var15--) {
		}
		if (var9.field3526 && var15 == 0 && var7 > var10[0].getTileHeight(var5, var6)) {
			this.method19669();
		} else if (arg0.maxLevel - 1 == var15 && var10[var15].getTileHeight(var5, var6) - var7 > 0x8 << arg0.size) {
			this.method19669();
		} else {
			Tile var16 = arg0.levelTiles[var15][var5][var6];
			if (var16 == null) {
				if (var15 == 0 || arg0.levelTiles[0][var5][var6] == null) {
					var16 = arg0.levelTiles[0][var5][var6] = new Tile(0);
				}
				boolean var17 = arg0.levelTiles[0][var5][var6].bridge != null;
				if (var15 == 3 && var17) {
					var15--;
				}
				for (int var18 = 1; var18 <= var15; var18++) {
					if (arg0.levelTiles[var18][var5][var6] == null) {
						var16 = arg0.levelTiles[var18][var5][var6] = new Tile(var18);
						if (var17) {
							var16.level++;
						}
					}
				}
				if (var16 == null) {
					var16 = arg0.levelTiles[var15][var5][var6];
				}
			}
			if (var9.field3508) {
				int var19 = this.x >> 12;
				int var20 = this.z >> 12;
				if (var16.wall != null) {
					EntityBounds var21 = var16.wall.method17371(arg1);
					if (var21 != null && var21.method8962(var19, var7, var20)) {
						this.method19669();
						return;
					}
				}
				if (var16.dynamicWall != null) {
					EntityBounds var22 = var16.dynamicWall.method17371(arg1);
					if (var22 != null && var22.method8962(var19, var7, var20)) {
						this.method19669();
						return;
					}
				}
				if (var16.groundDecoration != null) {
					EntityBounds var23 = var16.groundDecoration.method17371(arg1);
					if (var23 != null && var23.method8962(var19, var7, var20)) {
						this.method19669();
						return;
					}
				}
				for (PrimaryLayerEntityList var24 = var16.entities; var24 != null; var24 = var24.field7058) {
					EntityBounds var25 = var24.field7057.method17371(arg1);
					if (var25 != null && var25.method8962(var19, var7, var20)) {
						this.method19669();
						return;
					}
				}
			}
			var8.field7816.list.pushBack(this);
		}
	}

	@ObfuscatedName("atz.u()V")
	public void method19669() {
		this.field12526.field7785.field7805[this.field12523] = null;
		ParticleSystemRenderer.field7794[ParticleSystemRenderer.field7797] = this;
		ParticleSystemRenderer.field7797 = ParticleSystemRenderer.field7797 + 1 & 0x3FF;
		this.unlink();
		this.dualUnlink();
	}
}
