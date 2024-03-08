package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

@ObfuscatedName("ts")
public class class544 {

	// $FF: synthetic field
	public final class932 this$0;

	@ObfuscatedName("ts.e")
	public boolean field6869;

	@ObfuscatedName("ts.n")
	public SourceDataLine field6871;

	@ObfuscatedName("ts.m")
	public byte[] field6876;

	@ObfuscatedName("ts.k")
	public byte[] field6870;

	@ObfuscatedName("ts.f")
	public int field6872;

	@ObfuscatedName("ts.w")
	public int field6868;

	@ObfuscatedName("ts.l")
	public int field6874;

	@ObfuscatedName("ts.u")
	public float field6875;

	@ObfuscatedName("ts.z")
	public int field6873;

	@ObfuscatedName("ts.p")
	public int field6877;

	@ObfuscatedName("ts.d")
	public List field6878;

	public class544(class932 arg0, float arg1, int arg2) {
		this.this$0 = arg0;
		this.field6873 = 16;
		this.field6877 = 2;
		this.field6878 = new ArrayList();
		if (!this.field6869) {
			this.field6875 = arg1;
			if (this.field6873 > 16) {
				throw new RuntimeException("");
			}
			try {
				AudioFormat var4 = new AudioFormat(this.field6875, this.field6873, this.field6877, true, false);
				try {
					Info var5 = new Info(SourceDataLine.class, var4, arg2);
					this.field6871 = (SourceDataLine) AudioSystem.getLine(var5);
				} catch (IllegalArgumentException var8) {
					return;
				}
				this.field6871.open(var4, arg2);
				this.field6871.start();
			} catch (LineUnavailableException var9) {
				return;
			}
			this.field6876 = new byte[arg2];
			this.field6870 = new byte[this.field6873 / 8];
			this.field6874 = 0;
			this.field6869 = true;
		}
	}

	@ObfuscatedName("ts.e(I)V")
	public void method8646() {
		if (this.field6869 && this.field6871 != null) {
			this.field6872 = this.field6871.available();
		}
	}

	@ObfuscatedName("ts.n(I)V")
	public void method8647() {
		this.field6868 = 0;
		this.method8648();
		while (this.field6868 > 0) {
			int var1 = this.field6868;
			if (this.field6874 + var1 >= this.field6876.length) {
				var1 = this.field6876.length - this.field6874;
			}
			this.field6871.write(this.field6876, this.field6874, var1);
			for (int var2 = 0; var2 < var1; var2++) {
				this.field6876[this.field6874 + var2] = 0;
			}
			this.field6874 += var1;
			this.field6874 %= this.field6876.length;
			this.field6868 -= var1;
		}
	}

	@ObfuscatedName("ts.m(I)V")
	public void method8648() {
		synchronized (this) {
			int var2 = Integer.MAX_VALUE;
			double var3 = (double) (this.field6873 / 8 * this.field6877);
			boolean var5 = false;
			Iterator var6 = this.field6878.iterator();
			while (var6.hasNext()) {
				class542 var7 = (class542) var6.next();
				int var8 = var7.field6857.length - var7.field6860;
				if (this.field6875 != var7.field6862) {
					int var9 = (int) (this.field6875 / var7.field6862 * (float) var8);
					var8 = (int) (var3 * Math.ceil((double) var9 / var3));
				}
				var7.field6861 = var8;
				if (var8 > 0 && var8 < var2) {
					var5 = true;
					var2 = var8;
				}
			}
			if (var2 > this.field6872) {
				var2 = this.field6872;
			}
			if (var2 != 0 && var5) {
				int var10 = this.field6873 / 8;
				Iterator var11 = this.field6878.iterator();
				while (true) {
					class542 var12;
					do {
						if (!var11.hasNext()) {
							this.field6868 = var2;
							return;
						}
						var12 = (class542) var11.next();
					} while (var12.field6861 < var2);
					int var13 = this.field6874;
					int var14 = 0;
					int var15 = var12.field6859 / 8;
					double var16 = 0.0D;
					int var18 = 0;
					double var19 = (double) this.field6875;
					double var21 = (double) var12.field6862;
					int var23 = var12.field6865;
					while (var12.field6861 > 0 && var14 < var2) {
						short var24 = 0;
						short var25 = 0;
						byte[] var26 = this.field6870;
						for (int var27 = 0; var27 < var26.length; var27++) {
							var26[var27] = this.field6876[var13 + var27];
							var24 = (short) (var24 | (var26[var27] & 0xFF) << var27 * 8);
						}
						if (this.field6875 == var12.field6862) {
							byte[] var45 = var12.field6858;
							for (int var46 = 0; var46 < var45.length; var46++) {
								var45[var46] = var12.field6857[var12.field6865 + var46];
								var25 = (short) (var25 | (var45[var46] & 0xFF) << var46 * 8);
							}
							var12.field6865 += var15;
							var12.field6865 %= var12.field6857.length;
							var12.field6860 += var15;
						} else {
							byte[] var28 = var12.field6858;
							float var29 = (float) (var16 / var19 * var21);
							float var30 = (float) Math.floor((double) var29);
							short var31 = 0;
							short var32 = 0;
							int var33 = (int) Math.floor((double) var29);
							int var34 = (int) Math.ceil((double) var29);
							int var35 = var12.field6864 * var28.length * var33 + var28.length * var18;
							int var36 = var12.field6864 * var28.length * var34 + var28.length * var18;
							int var37 = var23 + var35;
							int var38 = var23 + var36;
							int var39 = var37 % var12.field6857.length;
							int var40 = var38 % var12.field6857.length;
							for (int var41 = 0; var41 < var28.length; var41++) {
								var28[var41] = var12.field6857[var39 + var41];
								var31 = (short) (var31 | (var28[var41] & 0xFF) << var41 * 8);
							}
							for (int var42 = 0; var42 < var28.length; var42++) {
								var28[var42] = var12.field6857[var40 + var42];
								var32 = (short) (var32 | (var28[var42] & 0xFF) << var42 * 8);
							}
							float var43 = var29 - var30;
							if (var43 < 0.0F || var43 > 1.0F) {
								throw new RuntimeException("");
							}
							float var44 = (float) (var32 - var31);
							var25 = (short) (var43 * var44 + (float) var31);
							var18++;
							var18 %= var12.field6864;
							if (var18 == 0) {
								var16++;
							}
						}
						short var48 = (short) (var24 + var25);
						if (var48 > 32767) {
							var48 = 32767;
						}
						if (var48 < -32768) {
							var48 = -32768;
						}
						this.field6876[var13] = (byte) var48;
						this.field6876[var13 + 1] = (byte) (var48 >> 8);
						int var49 = var10 + var13;
						var13 = var49 % this.field6876.length;
						var14 += var15;
					}
					if (this.field6875 != var12.field6862) {
						double var50 = var21 / var19 * (double) var2;
						int var52 = (int) (var3 * Math.ceil(var50 / var3));
						var12.field6865 += var52;
						var12.field6865 %= var12.field6857.length;
						var12.field6860 += var52;
					}
				}
			}
		}
	}

	@ObfuscatedName("ts.k(Lth;B)V")
	public void method8649(class542 arg0) {
		this.field6878.add(arg0);
	}

	@ObfuscatedName("ts.f(Lth;I)V")
	public void method8650(class542 arg0) {
		this.field6878.remove(arg0);
	}
}
