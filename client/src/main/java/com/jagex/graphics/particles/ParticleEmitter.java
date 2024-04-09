package com.jagex.graphics.particles;

import com.jagex.core.datastruct.LinkQueue;
import com.jagex.game.client.MovingParticle;
import com.jagex.game.config.ParticleEmitterType;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.ModelParticleEmitter;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("xm")
public class ParticleEmitter {

	@ObfuscatedName("xm.e")
	public final ModelParticleEmitter field7788;

	@ObfuscatedName("xm.n")
	public ParticleEmitterType field7772;

	@ObfuscatedName("xm.m")
	public final ParticleSystem field7785;

	@ObfuscatedName("xm.k")
	public int field7786 = 0;

	@ObfuscatedName("xm.f")
	public LinkQueue field7775;

	@ObfuscatedName("xm.w")
	public int field7776;

	@ObfuscatedName("xm.l")
	public long field7774;

	@ObfuscatedName("xm.u")
	public boolean field7778 = false;

	@ObfuscatedName("xm.z")
	public ParticleEmitterRelated field7779 = new ParticleEmitterRelated();

	@ObfuscatedName("xm.p")
	public ParticleEmitterRelated field7780 = new ParticleEmitterRelated();

	@ObfuscatedName("xm.d")
	public int field7781;

	@ObfuscatedName("xm.c")
	public int field7782;

	@ObfuscatedName("xm.r")
	public int field7783;

	@ObfuscatedName("xm.v")
	public int field7784;

	@ObfuscatedName("xm.o")
	public int field7777;

	@ObfuscatedName("xm.s")
	public int field7771;

	@ObfuscatedName("xm.y")
	public int field7787;

	@ObfuscatedName("xm.q")
	public boolean field7789 = false;

	@ObfuscatedName("xm.x")
	public boolean field7773 = false;

	public ParticleEmitter(Toolkit arg0, ModelParticleEmitter arg1, ParticleSystem arg2, long arg3) {
		this.field7788 = arg1;
		this.field7785 = arg2;
		this.field7774 = arg3;
		this.field7772 = this.field7788.method2079(arg0.emitterTypeList);
		if (!arg0.method2129() && this.field7772.field3460 != -1) {
			this.field7772 = arg0.emitterTypeList.get(this.field7772.field3460);
		}
		this.field7775 = new LinkQueue();
		this.field7786 = (int) ((double) this.field7786 + Math.random() * 64.0D);
		this.method9896();
		this.field7780.field7826 = this.field7779.field7826;
		this.field7780.field7820 = this.field7779.field7820;
		this.field7780.field7821 = this.field7779.field7821;
		this.field7780.field7822 = this.field7779.field7822;
		this.field7780.field7823 = this.field7779.field7823;
		this.field7780.field7829 = this.field7779.field7829;
		this.field7780.field7825 = this.field7779.field7825;
		this.field7780.field7830 = this.field7779.field7830;
		this.field7780.field7827 = this.field7779.field7827;
	}

	@ObfuscatedName("xm.e(B)V")
	public void method9896() {
		this.field7779.field7826 = this.field7788.field1470;
		this.field7779.field7820 = this.field7788.field1474;
		this.field7779.field7821 = this.field7788.field1472;
		this.field7779.field7822 = this.field7788.field1473;
		this.field7779.field7823 = this.field7788.field1469;
		this.field7779.field7829 = this.field7788.field1475;
		this.field7779.field7825 = this.field7788.field1464;
		this.field7779.field7830 = this.field7788.field1466;
		this.field7779.field7827 = this.field7788.field1478;
		if (this.field7779.field7826 == this.field7779.field7822 && this.field7779.field7825 == this.field7779.field7822 && this.field7779.field7823 == this.field7779.field7820 && this.field7779.field7830 == this.field7779.field7823 && this.field7779.field7829 == this.field7779.field7821 && this.field7779.field7829 == this.field7779.field7827) {
			this.field7789 = true;
		} else if (this.field7789) {
			this.field7789 = false;
			this.field7780.field7826 = this.field7779.field7826;
			this.field7780.field7820 = this.field7779.field7820;
			this.field7780.field7821 = this.field7779.field7821;
			this.field7780.field7822 = this.field7779.field7822;
			this.field7780.field7823 = this.field7779.field7823;
			this.field7780.field7829 = this.field7779.field7829;
			this.field7780.field7825 = this.field7779.field7825;
			this.field7780.field7830 = this.field7779.field7830;
			this.field7780.field7827 = this.field7779.field7827;
		}
	}

	@ObfuscatedName("xm.n(Ldh;JIZI)V")
	public void method9897(Toolkit arg0, long arg1, int arg2, boolean arg3) {
		if (this.field7778) {
			arg3 = false;
		} else if (ParticleSystemRenderer.field7802 < this.field7772.field3504) {
			arg3 = false;
		} else if (ParticleSystemRenderer.field7801 > ParticleLimits.field1422[ParticleSystemRenderer.field7802]) {
			arg3 = false;
		} else if (this.field7789) {
			arg3 = false;
		} else if (this.field7772.field3497 != -1) {
			int var6 = (int) (arg1 - this.field7774);
			if (this.field7772.field3495 || var6 <= this.field7772.field3497) {
				var6 %= this.field7772.field3497;
			} else {
				arg3 = false;
			}
			if (!this.field7772.field3494 && var6 < this.field7772.field3532) {
				arg3 = false;
			}
			if (this.field7772.field3494 && var6 >= this.field7772.field3532) {
				arg3 = false;
			}
		}
		this.field7776 = 0;
		for (MovingParticle var7 = (MovingParticle) this.field7775.peekFront(); var7 != null; var7 = (MovingParticle) this.field7775.prev()) {
			var7.method19667(arg1, arg2);
			this.field7776++;
		}
		if (arg3) {
			int var8 = (this.field7779.field7825 + this.field7779.field7826 + this.field7779.field7822) / 3;
			int var9 = (this.field7779.field7830 + this.field7779.field7823 + this.field7779.field7820) / 3;
			int var10 = (this.field7779.field7827 + this.field7779.field7829 + this.field7779.field7821) / 3;
			if (this.field7779.field7819 != var8 || this.field7779.field7824 != var9 || this.field7779.field7828 != var10 || !this.field7773) {
				this.field7779.field7819 = var8;
				this.field7779.field7824 = var9;
				this.field7779.field7828 = var10;
				int var11 = this.field7779.field7822 - this.field7779.field7826;
				int var12 = this.field7779.field7823 - this.field7779.field7820;
				int var13 = this.field7779.field7829 - this.field7779.field7821;
				int var14 = this.field7779.field7825 - this.field7779.field7826;
				int var15 = this.field7779.field7830 - this.field7779.field7820;
				int var16 = this.field7779.field7827 - this.field7779.field7821;
				this.field7781 = var12 * var16 - var13 * var15;
				this.field7782 = var13 * var14 - var11 * var16;
				this.field7783 = var11 * var15 - var12 * var14;
				while (true) {
					if (this.field7781 <= 32767 && this.field7782 <= 32767 && this.field7783 <= 32767 && this.field7781 >= -32767 && this.field7782 >= -32767 && this.field7783 >= -32767) {
						int var17 = (int) Math.sqrt((double) (this.field7783 * this.field7783 + this.field7782 * this.field7782 + this.field7781 * this.field7781));
						if (var17 <= 0) {
							var17 = 1;
						}
						this.field7781 = this.field7781 * 32767 / var17;
						this.field7782 = this.field7782 * 32767 / var17;
						this.field7783 = this.field7783 * 32767 / var17;
						if (this.field7772.field3462 > 0 || this.field7772.field3464 > 0) {
							int var18 = (int) (Math.atan2((double) this.field7783, (double) this.field7781) * 2607.5945876176133D);
							int var19 = (int) (Math.atan2((double) this.field7782, Math.sqrt((double) (this.field7783 * this.field7783 + this.field7781 * this.field7781))) * 2607.5945876176133D);
							this.field7777 = this.field7772.field3462 - this.field7772.field3461;
							this.field7784 = this.field7772.field3461 + var18 - (this.field7777 >> 1);
							this.field7787 = this.field7772.field3464 - this.field7772.field3498;
							this.field7771 = this.field7772.field3498 + var19 - (this.field7787 >> 1);
						}
						this.field7773 = true;
						break;
					}
					this.field7781 >>= 0x1;
					this.field7782 >>= 0x1;
					this.field7783 >>= 0x1;
				}
			}
			this.field7786 += (int) ((double) arg2 * ((double) this.field7772.field3468 + Math.random() * (double) (this.field7772.field3485 - this.field7772.field3468)));
			if (this.field7786 > 63) {
				int var20 = this.field7786 >> 6;
				this.field7786 &= 0x3F;
				int var21 = (arg2 << 8) / var20;
				int var22 = 0;
				int var23 = 0;
				while (var23 < var20) {
					int var24;
					int var25;
					int var26;
					if (this.field7772.field3462 <= 0 && this.field7772.field3464 <= 0) {
						var24 = this.field7781;
						var25 = this.field7782;
						var26 = this.field7783;
					} else {
						int var27 = this.field7784 + (int) ((double) this.field7777 * Math.random());
						int var28 = var27 & 0x3FFF;
						int var29 = Trig1.sin[var28];
						int var30 = Trig1.cos[var28];
						int var31 = this.field7771 + (int) ((double) this.field7787 * Math.random());
						int var32 = var31 & 0x1FFF;
						int var33 = Trig1.sin[var32];
						int var34 = Trig1.cos[var32];
						byte var35 = 13;
						var24 = var30 * var33 >> var35;
						var25 = (var34 << 1) * -1;
						var26 = var29 * var33 >> var35;
					}
					float var36 = (float) Math.random();
					float var37 = (float) Math.random();
					if (var36 + var37 > 1.0F) {
						var36 = 1.0F - var36;
						var37 = 1.0F - var37;
					}
					float var38 = 1.0F - (var36 + var37);
					int var39 = (int) ((float) this.field7779.field7825 * var38 + (float) this.field7779.field7826 * var36 + (float) this.field7779.field7822 * var37);
					int var40 = (int) ((float) this.field7779.field7830 * var38 + (float) this.field7779.field7823 * var37 + (float) this.field7779.field7820 * var36);
					int var41 = (int) ((float) this.field7779.field7827 * var38 + (float) this.field7779.field7829 * var37 + (float) this.field7779.field7821 * var36);
					int var42 = this.field7772.field3514 + (int) (Math.random() * (double) (this.field7772.field3505 - this.field7772.field3514));
					int var43 = this.field7772.field3482 + (int) (Math.random() * (double) (this.field7772.field3483 - this.field7772.field3482));
					int var44 = this.field7772.field3501 + (int) (Math.random() * (double) (this.field7772.field3472 - this.field7772.field3501));
					int var45 = this.field7772.field3525 * 64;
					if (this.field7772.field3534 != 0) {
						if (this.field7772.field3503 == 0) {
							var45 += (int) (Math.random() * (double) (this.field7772.field3534 + 1));
						} else {
							var45 += (int) (Math.random() * (double) (this.field7772.field3503 + 1)) * (this.field7772.field3534 / this.field7772.field3503);
						}
					}
					int var46 = this.field7772.field3533 * 8;
					if (this.field7772.field3535 != 0) {
						var46 += (int) (Math.random() * (double) (this.field7772.field3535 + 1));
					}
					int var49;
					if (this.field7772.field3477) {
						double var47 = Math.random();
						var49 = (int) ((double) this.field7772.field3463 * var47 + (double) this.field7772.field3479) << 16 | (int) ((double) this.field7772.field3517 * var47 + (double) this.field7772.field3519) << 8 | (int) ((double) this.field7772.field3520 * var47 + (double) this.field7772.field3518) | (int) ((double) this.field7772.field3474 + Math.random() * (double) this.field7772.field3523) << 24;
					} else {
						var49 = (int) ((double) this.field7772.field3479 + Math.random() * (double) this.field7772.field3463) << 16 | (int) ((double) this.field7772.field3519 + Math.random() * (double) this.field7772.field3517) << 8 | (int) ((double) this.field7772.field3518 + Math.random() * (double) this.field7772.field3520) | (int) ((double) this.field7772.field3474 + Math.random() * (double) this.field7772.field3523) << 24;
					}
					int var50 = this.field7772.field3515;
					if (!arg0.method2129() && !this.field7772.field3506) {
						var50 = -1;
					}
					MovingParticle var51;
					if (ParticleSystemRenderer.field7797 == ParticleSystemRenderer.field7791) {
						var51 = new MovingParticle(this, var39, var40, var41, var24, var25, var26, var42, var43, var49, var44, var45, var46, var50, this.field7772.field3499, this.field7772.field3496);
					} else {
						var51 = ParticleSystemRenderer.field7794[ParticleSystemRenderer.field7791];
						ParticleSystemRenderer.field7791 = ParticleSystemRenderer.field7791 + 1 & 0x3FF;
						var51.method19665(this, var39, var40, var41, var24, var25, var26, var42, var43, var49, var44, var45, var46, var50, this.field7772.field3499, this.field7772.field3496);
					}
					if (var22 > 256) {
						var51.method19667(arg1, var22 >> 8);
					}
					this.field7776++;
					var23++;
					var22 += var21;
				}
			}
		}
		if (!this.field7779.method9973(this.field7780)) {
			ParticleEmitterRelated var52 = this.field7780;
			this.field7780 = this.field7779;
			this.field7779 = var52;
			this.field7779.field7826 = this.field7788.field1470;
			this.field7779.field7820 = this.field7788.field1474;
			this.field7779.field7821 = this.field7788.field1472;
			this.field7779.field7822 = this.field7788.field1473;
			this.field7779.field7823 = this.field7788.field1469;
			this.field7779.field7829 = this.field7788.field1475;
			this.field7779.field7825 = this.field7788.field1464;
			this.field7779.field7830 = this.field7788.field1466;
			this.field7779.field7827 = this.field7788.field1478;
			this.field7779.field7819 = this.field7780.field7819;
			this.field7779.field7824 = this.field7780.field7824;
			this.field7779.field7828 = this.field7780.field7828;
		}
		ParticleSystemRenderer.field7790 += this.field7776;
	}

	@ObfuscatedName("xm.m(Ltx;Ldh;J)V")
	public void method9898(Scene arg0, Toolkit arg1, long arg2) {
		for (MovingParticle var5 = (MovingParticle) this.field7775.peekFront(); var5 != null; var5 = (MovingParticle) this.field7775.prev()) {
			var5.method19668(arg0, arg1, arg2);
		}
	}
}
