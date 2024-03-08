package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ash")
public abstract class class1200 extends class1019 {

	@ObfuscatedName("ash.x")
	public short field12471;

	@ObfuscatedName("ash.b")
	public short field12472;

	@ObfuscatedName("ash.h")
	public short field12468;

	@ObfuscatedName("ash.a")
	public short field12467;

	@ObfuscatedName("ash.g")
	public boolean field12470;

	@ObfuscatedName("ash.i")
	public byte field12469;

	@ObfuscatedName("ash.j")
	public int field12466;

	@ObfuscatedName("ash.t")
	public class973[] field12473;

	public class1200(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
		this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, (class420) null);
	}

	public class1200(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11, class420 arg12) {
		super(arg0, arg12);
		this.field12466 = 0;
		this.field12473 = new class973[4];
		this.field11717 = (byte) arg1;
		this.field11714 = (byte) arg2;
		if (arg12 != null) {
			this.method10529(arg12);
		}
		this.method10532((float) arg3, (float) arg4, (float) arg5);
		this.field12471 = (short) arg6;
		this.field12472 = (short) arg7;
		this.field12468 = (short) arg8;
		this.field12467 = (short) arg9;
		this.field12470 = arg10;
		this.field12469 = arg11;
		for (int var14 = 0; var14 < 4; var14++) {
			this.field12473[var14] = null;
		}
	}

	@ObfuscatedName("ash.bv(I)V")
	public void method16529() {
	}

	@ObfuscatedName("ash.gy([Lakf;S)I")
	public int method18375(class973[] arg0) {
		if (this.field8176) {
			this.field12466 = 0;
			int var2 = Math.max(0, this.field12471);
			int var3 = Math.min(this.field11716.field6954[this.field11717].length - 1, this.field12472);
			int var4 = Math.max(0, this.field12468);
			int var5 = Math.min(this.field11716.field6954[this.field11717][var2].length - 1, this.field12467);
			int var6 = var4;
			label129: while (var2 <= var3) {
				label126: for (int var7 = var6; var7 <= var5; var7++) {
					long var8 = this.field11716.field6954[this.field11717][var2][var7];
					long var10 = 0L;
					while (true) {
						label121: while (true) {
							if (var10 > 48L) {
								continue label126;
							}
							int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
							if (var12 <= 0) {
								continue label126;
							}
							class554 var13 = this.field11716.field6926[var12 - 1];
							for (int var14 = 0; var14 < this.field12466; var14++) {
								if (this.field12473[var14] == var13.field7003) {
									var10 += 16L;
									continue label121;
								}
							}
							this.field12473[++this.field12466 - 1] = var13.field7003;
							if (this.field12466 == 4) {
								break label129;
							}
							var10 += 16L;
						}
					}
				}
				var2++;
			}
			for (int var15 = this.field12466; var15 < 4; var15++) {
				this.field12473[var15] = null;
			}
			if (this.field12469 != 0) {
				int var16 = this.field12471 - this.field11716.field6902;
				int var17 = this.field12468 - this.field11716.field6947;
				short var18;
				int var19;
				int var20;
				short var21;
				if (this.field12469 == 1) {
					if (var17 > var16) {
						var18 = this.field12471;
						var19 = this.field12468 - 1;
						var20 = this.field12471 + 1;
						var21 = this.field12468;
					} else {
						var18 = this.field12471;
						var19 = this.field12468 + 1;
						var20 = this.field12471 - 1;
						var21 = this.field12468;
					}
				} else if (var17 > -var16) {
					var18 = this.field12471;
					var19 = this.field12468 - 1;
					var20 = this.field12471 - 1;
					var21 = this.field12468;
				} else {
					var18 = this.field12471;
					var19 = this.field12468 + 1;
					var20 = this.field12471 + 1;
					var21 = this.field12468;
				}
				label92: for (int var22 = 0; var22 < this.field12466; var22++) {
					long var23 = this.field11716.field6954[this.field11717][var18][var19];
					while (var23 != 0L) {
						class554 var25 = this.field11716.field6926[(int) ((var23 & 0xFFFFL) - 1L)];
						var23 >>>= 0x10;
						if (this.field12473[var22] == var25.field7003) {
							continue label92;
						}
					}
					long var26 = this.field11716.field6954[this.field11717][var20][var21];
					while (var26 != 0L) {
						class554 var28 = this.field11716.field6926[(int) ((var26 & 0xFFFFL) - 1L)];
						var26 >>>= 0x10;
						if (this.field12473[var22] == var28.field7003) {
							continue label92;
						}
					}
					for (int var29 = var22; var29 < this.field12466 - 1; var29++) {
						this.field12473[var29] = this.field12473[var29 + 1];
					}
					this.field12466--;
				}
			}
			this.field8176 = false;
		}
		for (int var30 = 0; var30 < this.field12466; var30++) {
			arg0[var30] = this.field12473[var30];
		}
		return this.field12466;
	}

	@ObfuscatedName("ash.ga(Ldh;S)Z")
	public boolean method18360(class133 arg0) {
		return this.field11716.field6930.method8930(this.field11714, this.field12471, this.field12472, this.field12468, this.field12467, this.method17371(arg0));
	}

	@ObfuscatedName("ash.gn(I)Z")
	public boolean method18361() {
		for (int var1 = this.field12471; var1 <= this.field12472; var1++) {
			for (int var2 = this.field12468; var2 <= this.field12467; var2++) {
				int var3 = this.field11716.field6942 + (var1 - this.field11716.field6902);
				if (var3 >= 0 && var3 < this.field11716.field6962.length) {
					int var4 = this.field11716.field6942 + (var2 - this.field11716.field6947);
					if (var4 >= 0 && var4 < this.field11716.field6962.length && this.field11716.field6962[var3][var4]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
