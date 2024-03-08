package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("sp")
public class class516 {

	@ObfuscatedName("sp.e")
	public class1090 field6681;

	@ObfuscatedName("sp.n")
	public byte field6663;

	@ObfuscatedName("sp.m")
	public class1019 field6672;

	@ObfuscatedName("sp.k")
	public int field6665;

	@ObfuscatedName("sp.f")
	public int field6666;

	@ObfuscatedName("sp.w")
	public int field6667;

	@ObfuscatedName("sp.l")
	public boolean field6668 = false;

	@ObfuscatedName("sp.u")
	public class116 field6669;

	@ObfuscatedName("sp.z")
	public class721 field6664;

	@ObfuscatedName("sp.p")
	public class721 field6671;

	@ObfuscatedName("sp.d")
	public int field6662;

	@ObfuscatedName("sp.c")
	public int field6673 = -1;

	@ObfuscatedName("sp.r")
	public int field6674 = 0;

	@ObfuscatedName("sp.v")
	public boolean field6675 = false;

	@ObfuscatedName("sp.o")
	public boolean field6676;

	@ObfuscatedName("sp.s")
	public class1175 field6677;

	@ObfuscatedName("sp.y")
	public boolean field6670 = false;

	@ObfuscatedName("sp.q")
	public boolean[] field6679;

	@ObfuscatedName("sp.x")
	public class634 field6680;

	@ObfuscatedName("sp.b")
	public class597 field6678;

	public class516(class133 arg0, class1090 arg1, class598 arg2, int arg3, int arg4, int arg5, class1019 arg6, boolean arg7, int arg8, int arg9) {
		this.field6681 = arg1;
		this.field6665 = arg2.field7450;
		this.field6666 = arg3;
		this.field6667 = arg4;
		this.field6672 = arg6;
		this.field6675 = arg8 != -1;
		this.field6663 = (byte) arg5;
		this.field6668 = arg7;
		this.field6676 = arg0.method2125() && arg2.field7453 && !this.field6668;
		this.field6664 = new class1076(arg6, false);
		this.method8244(false, arg8, 1, this.field6675 ? arg9 : 0);
	}

	@ObfuscatedName("sp.e(III)V")
	public void method8260(int arg0, int arg1) {
		this.field6671 = null;
		if (arg1 > 0) {
			this.field6671 = new class1076(this.field6672, false);
			this.field6671.method14353(arg0, arg1, 1, false);
		} else {
			this.field6675 = true;
			this.method8244(false, arg0, 1, 0);
		}
	}

	@ObfuscatedName("sp.n(I)I")
	public int method8262() {
		return this.field6674;
	}

	@ObfuscatedName("sp.m(Lvp;I)V")
	public void method8265(class597 arg0) {
		this.field6678 = arg0;
		this.field6669 = null;
	}

	@ObfuscatedName("sp.k(I)I")
	public int method8236() {
		return -this.method8262();
	}

	@ObfuscatedName("sp.f(S)Lvd;")
	public class598 method8237() {
		return (class598) this.field6681.method962(this.field6665);
	}

	@ObfuscatedName("sp.w(Ldh;IZZI)Ldo;")
	public final class116 method8238(class133 arg0, int arg1, boolean arg2, boolean arg3) {
		class598 var5 = (class598) this.field6681.method962(this.field6665);
		if (var5.field7505 != null) {
			var5 = var5.method9477(Statics.field7410, client.field10863 == 0 ? class153.field1723 : Statics.field7410);
		}
		if (var5 == null) {
			this.method8242(arg0);
			this.field6673 = -1;
			return null;
		}
		if (!this.field6675 && this.field6673 != var5.field7450) {
			this.method8244(true, -1, 0, 0);
			this.field6670 = false;
			this.field6669 = null;
		}
		this.method8243(this.field6672);
		if (arg3) {
			arg3 &= this.field6676 & !this.field6670 & Statics.field688.field11529.method18515() != 0;
		}
		if (arg2 && !arg3) {
			this.field6673 = var5.field7450;
			return null;
		}
		class423 var6 = this.field6672.method10536().field4298;
		class550 var7 = client.field10855.method7743();
		if (arg3) {
			var7.method8814(this.field6677, this.field6663, (int) var6.field4308, (int) var6.field4313, this.field6679);
			this.field6670 = false;
		}
		class104 var8 = var7.field6913[this.field6663];
		class104 var9;
		if (this.field6668) {
			var9 = var7.field6915[0];
		} else {
			var9 = this.field6663 < 3 ? var7.field6913[this.field6663 + 1] : null;
		}
		class116 var10 = null;
		if (this.field6664.method14346()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			var10 = var5.method9470(arg0, arg1, this.field6666 == 11 ? 10 : this.field6666, this.field6666 == 11 ? this.field6667 + 4 : this.field6667, var8, var9, (int) var6.field4308, var8.method1527((int) var6.field4308, (int) var6.field4313), (int) var6.field4313, this.field6664, this.field6678);
			if (var10 == null) {
				this.field6679 = null;
				this.field6677 = null;
				this.field6674 = 0;
			} else {
				if (arg3) {
					if (this.field6679 == null) {
						this.field6679 = new boolean[4];
					}
					this.field6677 = var10.method1726(this.field6677);
					var7.method8750(this.field6677, this.field6663, (int) var6.field4308, (int) var6.field4313, this.field6679);
					this.field6670 = true;
				}
				this.field6674 = var10.method1748();
				var10.method1728();
			}
			this.field6669 = null;
		} else if (this.field6669 != null && (this.field6669.method1691() & arg1) == arg1 && this.field6673 == var5.field7450) {
			var10 = this.field6669;
		} else {
			if (this.field6669 != null) {
				arg1 |= this.field6669.method1691();
			}
			class746 var11 = var5.method9475(arg0, arg1, this.field6666 == 11 ? 10 : this.field6666, this.field6666 == 11 ? this.field6667 + 4 : this.field6667, var8, var9, (int) var6.field4308, var8.method1527((int) var6.field4308, (int) var6.field4313), (int) var6.field4313, arg3, this.field6678);
			if (var11 == null) {
				this.field6679 = null;
				this.field6677 = null;
				this.field6669 = null;
				this.field6674 = 0;
			} else {
				this.field6669 = var10 = (class116) var11.field8737;
				if (arg3) {
					this.field6677 = (class1175) var11.field8738;
					this.field6679 = null;
					var7.method8750(this.field6677, this.field6663, (int) var6.field4308, (int) var6.field4313, null);
					this.field6670 = true;
				}
				this.field6674 = var10.method1748();
				var10.method1728();
			}
		}
		this.field6673 = var5.field7450;
		return var10;
	}

	@ObfuscatedName("sp.l(Ldh;Ldo;Lou;IIIIZB)V")
	public void method8239(class133 arg0, class116 arg1, class419 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		class128[] var9 = arg1.method1750();
		class102[] var10 = arg1.method1765();
		if ((this.field6680 == null || this.field6680.field7804) && (var9 != null || var10 != null)) {
			class598 var11 = (class598) this.field6681.method962(this.field6665);
			if (var11.field7505 != null) {
				var11 = var11.method9477(Statics.field7410, client.field10863 == 0 ? class153.field1723 : Statics.field7410);
			}
			if (var11 != null) {
				this.field6680 = class634.method9962(client.field10903, true);
			}
		}
		if (this.field6680 == null) {
			return;
		}
		arg1.method1689(arg2);
		if (arg7) {
			this.field6680.method9936(arg0, (long) client.field10903, var9, var10, false);
		} else {
			this.field6680.method9935((long) client.field10903);
		}
		this.field6680.method9963(this.field6663, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("sp.u(B)Z")
	public boolean method8240() {
		return this.field6676;
	}

	@ObfuscatedName("sp.z(Ldh;I)V")
	public void method8241(class133 arg0) {
		this.method8238(arg0, 262144, true, true);
	}

	@ObfuscatedName("sp.p(Ldh;B)V")
	public void method8242(class133 arg0) {
		if (this.field6677 != null) {
			class423 var2 = this.field6672.method10536().field4298;
			client.field10855.method7743().method8814(this.field6677, this.field6663, (int) var2.field4308, (int) var2.field4313, this.field6679);
			this.field6679 = null;
			this.field6677 = null;
		}
	}

	@ObfuscatedName("sp.d(Lalh;I)V")
	public void method8243(class1019 arg0) {
		if (this.field6671 != null && this.field6671.method14346()) {
			this.field6671.method14367(client.field10903 - this.field6662);
			if (this.field6671.method14375()) {
				this.field6671.method14362(-1);
			}
			if (!this.field6671.method14355()) {
				this.field6664 = this.field6671;
				this.field6675 = true;
				this.field6662 = client.field10903;
				return;
			}
		}
		if (!this.field6664.method14346()) {
			this.method8244(false, -1, 0, 0);
		} else if (this.field6664.method14367(client.field10903 - this.field6662)) {
			if (Statics.field688.field11529.method18515() == 2) {
				this.field6670 = false;
			}
			if (this.field6664.method14375()) {
				this.field6664.method14362(-1);
				this.field6675 = false;
				this.method8244(false, -1, 0, 0);
			}
		}
		this.field6662 = client.field10903;
	}

	@ObfuscatedName("sp.c(ZIIII)V")
	public void method8244(boolean arg0, int arg1, int arg2, int arg3) {
		int var5 = arg1;
		boolean var6 = false;
		if (arg1 == -1) {
			class598 var7 = (class598) this.field6681.method962(this.field6665);
			class598 var8 = var7;
			if (var7.field7505 != null) {
				var7 = var7.method9477(Statics.field7410, client.field10863 == 0 ? class153.field1723 : Statics.field7410);
			}
			if (var7 == null) {
				return;
			}
			if (var7 == var8) {
				var8 = null;
			}
			if (var7.method9504()) {
				if (!var7.field7479 || Statics.field688.field11514.method18665() == 1) {
					if (arg0 && this.field6664.method14346() && var7.method9493(this.field6664.method14348())) {
						return;
					}
					if (this.field6673 != var7.field7450) {
						var6 = var7.field7515;
					}
					var5 = var7.method9483();
					if (var7.method9514()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (var8 != null && var8.method9504() && (!var8.field7479 || Statics.field688.field11514.method18665() == 1)) {
				if (arg0 && this.field6664.method14346() && var8.method9493(this.field6664.method14348())) {
					return;
				}
				if (this.field6673 != var7.field7450) {
					var6 = var8.field7515;
				}
				var5 = var8.method9483();
				if (var8.method9514()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (var5 == -1) {
			this.field6664.method14351(-1, false);
		} else {
			this.field6664.method14353(var5, arg3, arg2, var6);
			this.field6662 = client.field10903;
			this.field6670 = false;
			this.field6669 = null;
		}
	}
}
