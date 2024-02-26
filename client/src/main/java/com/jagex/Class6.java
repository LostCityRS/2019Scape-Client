package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.lang.reflect.Method;

@OriginalClass("client!aad")
public class Class6 {

	@OriginalMember(owner = "client!aad", name = "e", descriptor = "I")
	public static final int anInt3213 = 2;

	@OriginalMember(owner = "client!aad", name = "f", descriptor = "I")
	public static final int anInt3217 = 1;

	@OriginalMember(owner = "client!aad", name = "t", descriptor = "I")
	public static final int anInt3218 = 0;

	@OriginalMember(owner = "client!aad", name = "ae", descriptor = "I")
	public static int anInt3221;

	@OriginalMember(owner = "client!aad", name = "m", descriptor = "I")
	int anInt3212;

	@OriginalMember(owner = "client!aad", name = "i", descriptor = "I")
	int anInt3214;

	@OriginalMember(owner = "client!aad", name = "u", descriptor = "Lclient!fe;")
	Class261 aClass261_5;

	@OriginalMember(owner = "client!aad", name = "l", descriptor = "I")
	int anInt3215;

	@OriginalMember(owner = "client!aad", name = "g", descriptor = "I")
	int anInt3216;

	@OriginalMember(owner = "client!aad", name = "o", descriptor = "I")
	int anInt3219;

	@OriginalMember(owner = "client!aad", name = "j", descriptor = "Z")
	boolean aBoolean624 = false;

	@OriginalMember(owner = "client!aad", name = "a", descriptor = "Z")
	boolean aBoolean625 = false;

	@OriginalMember(owner = "client!aad", name = "s", descriptor = "I")
	int anInt3220 = 0;

	@OriginalMember(owner = "client!aad", name = "k", descriptor = "Z")
	boolean aBoolean626 = false;

	@OriginalMember(owner = "client!aad", name = "w", descriptor = "Lclient!aai;")
	final Class10 aClass10_9;

	@OriginalMember(owner = "client!aad", name = "q", descriptor = "Lclient!aay;")
	final Class25 aClass25_5;

	@OriginalMember(owner = "client!aad", name = "r", descriptor = "Lclient!aai;")
	final Class10 aClass10_10;

	@OriginalMember(owner = "client!aad", name = "ah", descriptor = "(Lclient!aoa;)V")
	public static void method23613(@OriginalArg(0) Class41_Sub1 arg0) {
		Class1.aClass41_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!aad", name = "af", descriptor = "(Lclient!aoa;)V")
	public static void method23614(@OriginalArg(0) Class41_Sub1 arg0) {
		Class1.aClass41_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!aad", name = "al", descriptor = "(Lclient!aoa;)V")
	public static void method23656(@OriginalArg(0) Class41_Sub1 arg0) {
		Class1.aClass41_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!aad", name = "c", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method23668(@OriginalArg(0) Canvas arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!aad", name = "x", descriptor = "(II)V")
	public static void method23669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(9, (long) arg0);
		local4.method22078(-271181321);
	}

	@OriginalMember(owner = "client!aad", name = "<init>", descriptor = "(Z)V")
	Class6(@OriginalArg(0) boolean arg0) {
		this.aBoolean625 = arg0;
		this.aClass10_9 = new Class10();
		this.aClass25_5 = new Class25();
		if (this.aBoolean625) {
			this.aClass10_10 = new Class10();
		} else {
			this.aClass10_10 = null;
		}
	}

	@OriginalMember(owner = "client!aad", name = "bj", descriptor = "(IIIZZ)V")
	final void method23578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23582(1532167163)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass261_5 = null;
		} else {
			if (this.aClass261_5 == null || this.aClass261_5.anInt3892 * -1122423727 != arg0) {
				this.aClass261_5 = (Class261) Class1.aClass41_Sub1_1.method18054(arg0, -467029659);
				if (this.aClass261_5 == null || this.aClass261_5.anIntArray368 == null && !this.aClass261_5.method26483(1453094222)) {
					this.aClass261_5 = null;
					return;
				}
			} else if (this.aClass261_5.anInt3897 * 746333843 == 0) {
				return;
			}
			this.anInt3214 = 0;
			this.anInt3216 = arg1 * 371090617;
			this.anInt3220 = arg2 * -696793359;
			this.aBoolean626 = arg4;
			if (this.aClass261_5.method26483(448273276)) {
				if (arg3) {
					this.anInt3215 = -1962168921;
				} else {
					this.anInt3215 = 0;
				}
				this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			} else {
				if (arg3) {
					this.anInt3212 = (int) (Math.random() * (double) this.aClass261_5.anIntArray368.length) * 551775645;
					this.anInt3215 = (int) (Math.random() * (double) this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) * 1962168921;
				} else {
					this.anInt3212 = 0;
					this.anInt3215 = 0;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					this.anInt3219 = 2052470417;
				}
				if (this.anInt3216 * -316513911 == 0) {
					this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -1644896291);
				}
			}
			this.aBoolean624 = false;
		}
		this.method23596(323132524);
	}

	@OriginalMember(owner = "client!aad", name = "f", descriptor = "(Lclient!aad;I)V")
	public final void method23579(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		this.aClass261_5 = arg0.aClass261_5;
		this.aBoolean624 = arg0.aBoolean624;
		this.aBoolean625 = arg0.aBoolean625;
		this.anInt3216 = arg0.anInt3216;
		this.anInt3214 = arg0.anInt3214;
		this.anInt3212 = arg0.anInt3212;
		this.anInt3219 = arg0.anInt3219;
		this.anInt3215 = arg0.anInt3215;
		this.method23596(203078996);
	}

	@OriginalMember(owner = "client!aad", name = "bs", descriptor = "(IIIZZ)V")
	final void method23580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23582(1390489746)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass261_5 = null;
		} else {
			if (this.aClass261_5 == null || this.aClass261_5.anInt3892 * -1122423727 != arg0) {
				this.aClass261_5 = (Class261) Class1.aClass41_Sub1_1.method18054(arg0, 2140218401);
				if (this.aClass261_5 == null || this.aClass261_5.anIntArray368 == null && !this.aClass261_5.method26483(1338427873)) {
					this.aClass261_5 = null;
					return;
				}
			} else if (this.aClass261_5.anInt3897 * 746333843 == 0) {
				return;
			}
			this.anInt3214 = 0;
			this.anInt3216 = arg1 * 371090617;
			this.anInt3220 = arg2 * -696793359;
			this.aBoolean626 = arg4;
			if (this.aClass261_5.method26483(1845944291)) {
				if (arg3) {
					this.anInt3215 = -1962168921;
				} else {
					this.anInt3215 = 0;
				}
				this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			} else {
				if (arg3) {
					this.anInt3212 = (int) (Math.random() * (double) this.aClass261_5.anIntArray368.length) * 551775645;
					this.anInt3215 = (int) (Math.random() * (double) this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) * 1962168921;
				} else {
					this.anInt3212 = 0;
					this.anInt3215 = 0;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					this.anInt3219 = 2052470417;
				}
				if (this.anInt3216 * -316513911 == 0) {
					this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -752313852);
				}
			}
			this.aBoolean624 = false;
		}
		this.method23596(697295358);
	}

	@OriginalMember(owner = "client!aad", name = "u", descriptor = "(B)Lclient!fe;")
	public final Class261 method23581(@OriginalArg(0) byte arg0) {
		return this.aClass261_5;
	}

	@OriginalMember(owner = "client!aad", name = "l", descriptor = "(I)I")
	public final int method23582(@OriginalArg(0) int arg0) {
		return this.aClass261_5 == null ? -1 : this.aClass261_5.anInt3892 * -1122423727;
	}

	@OriginalMember(owner = "client!aad", name = "i", descriptor = "(III)V")
	public final void method23583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method23626(arg0, arg1, 0, false, (byte) 2);
	}

	@OriginalMember(owner = "client!aad", name = "aa", descriptor = "(I)V")
	public final void method23584(@OriginalArg(0) int arg0) {
		this.method23626(arg0, 0, 0, false, (byte) -52);
	}

	@OriginalMember(owner = "client!aad", name = "be", descriptor = "()Z")
	public final boolean method23585() {
		return this.anInt3216 * -316513911 != 0;
	}

	@OriginalMember(owner = "client!aad", name = "a", descriptor = "(IIIZZI)V")
	final void method23586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 == this.method23582(-979294563)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass261_5 = null;
		} else {
			if (this.aClass261_5 == null || this.aClass261_5.anInt3892 * -1122423727 != arg0) {
				this.aClass261_5 = (Class261) Class1.aClass41_Sub1_1.method18054(arg0, 1216662222);
				if (this.aClass261_5 == null || this.aClass261_5.anIntArray368 == null && !this.aClass261_5.method26483(899851878)) {
					this.aClass261_5 = null;
					return;
				}
			} else if (this.aClass261_5.anInt3897 * 746333843 == 0) {
				return;
			}
			this.anInt3214 = 0;
			this.anInt3216 = arg1 * 371090617;
			this.anInt3220 = arg2 * -696793359;
			this.aBoolean626 = arg4;
			if (this.aClass261_5.method26483(781715339)) {
				if (arg3) {
					this.anInt3215 = -1962168921;
				} else {
					this.anInt3215 = 0;
				}
				this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			} else {
				if (arg3) {
					this.anInt3212 = (int) (Math.random() * (double) this.aClass261_5.anIntArray368.length) * 551775645;
					this.anInt3215 = (int) (Math.random() * (double) this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) * 1962168921;
				} else {
					this.anInt3212 = 0;
					this.anInt3215 = 0;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					this.anInt3219 = 2052470417;
				}
				if (this.anInt3216 * -316513911 == 0) {
					this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -1270222971);
				}
			}
			this.aBoolean624 = false;
		}
		this.method23596(-151005153);
	}

	@OriginalMember(owner = "client!aad", name = "g", descriptor = "(II)V")
	public final void method23587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23626(arg0, 0, 0, false, (byte) -34);
	}

	@OriginalMember(owner = "client!aad", name = "au", descriptor = "(IZ)V")
	public final void method23588(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23626(arg0, 0, 0, arg1, (byte) -16);
	}

	@OriginalMember(owner = "client!aad", name = "s", descriptor = "(B)Z")
	public final boolean method23589(@OriginalArg(0) byte arg0) {
		return this.anInt3216 * -316513911 != 0;
	}

	@OriginalMember(owner = "client!aad", name = "e", descriptor = "(I)Z")
	public final boolean method23590(@OriginalArg(0) int arg0) {
		return this.aClass261_5 != null;
	}

	@OriginalMember(owner = "client!aad", name = "ap", descriptor = "(II)V")
	public final void method23591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23626(arg0, arg1, 0, false, (byte) -99);
	}

	@OriginalMember(owner = "client!aad", name = "w", descriptor = "(I)I")
	public final int method23592(@OriginalArg(0) int arg0) {
		if (!this.method23606(2022695156)) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23606(2063791149)) {
			if (this.aClass261_5.method26483(1156939869)) {
				local5 |= this.aClass25_5.anInt78 * 1118159249;
			} else {
				local5 |= this.aClass10_9.anInt39 * -357325453;
				if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null) {
					local5 |= this.aClass10_10.anInt39 * -357325453;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aad", name = "r", descriptor = "(Lclient!dn;IB)V")
	public final void method23593(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass261_5 == null) {
			return;
		}
		if (this.aClass261_5.anIntArray368 == null) {
			if (this.aClass261_5.method26483(1859663522) && this.method23606(1956471836)) {
				arg0.method7340(this.aClass25_5.aClass80_Sub1_Sub5_1, this.anInt3215 * 140891625, arg1, this.aClass261_5.aBoolean776);
			}
		} else if (this.method23606(2042718577)) {
			arg0.method7503(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137, this.aClass10_9.aClass80_Sub1_Sub7_2, this.aClass10_9.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, this.aClass261_5.aBoolean776);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7503(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137, this.aClass10_10.aClass80_Sub1_Sub7_2, this.aClass10_10.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, this.aClass261_5.aBoolean776);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "cy", descriptor = "(I)V")
	final void method23594(@OriginalArg(0) int arg0) {
		this.aBoolean624 = false;
		this.anInt3216 = arg0 * 371090617;
		this.anInt3214 = 0;
		this.anInt3215 = 0;
		if (this.aClass261_5 != null) {
			this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
		}
	}

	@OriginalMember(owner = "client!aad", name = "ck", descriptor = "()V")
	final void method23595() {
		if (this.aClass261_5 == null || this.aClass261_5.method26483(544418827)) {
			this.aClass25_5.method588((byte) -31);
		} else {
			this.aClass10_9.method320(-2020754125);
			if (this.aBoolean625) {
				this.aClass10_10.method320(-1683630466);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "ao", descriptor = "(I)V")
	final void method23596(@OriginalArg(0) int arg0) {
		if (this.aClass261_5 == null || this.aClass261_5.method26483(816955092)) {
			this.aClass25_5.method588((byte) -2);
		} else {
			this.aClass10_9.method320(-531145390);
			if (this.aBoolean625) {
				this.aClass10_10.method320(-1424162981);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "p", descriptor = "(I)V")
	public final void method23597(@OriginalArg(0) int arg0) {
		this.anInt3214 = 0;
	}

	@OriginalMember(owner = "client!aad", name = "v", descriptor = "(S)V")
	public final void method23598(@OriginalArg(0) short arg0) {
		this.method23599(0, (short) 24253);
	}

	@OriginalMember(owner = "client!aad", name = "y", descriptor = "(IS)V")
	public final void method23599(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		if (this.aClass261_5.method26483(1974406658)) {
			this.method23600(arg0, (byte) -45);
			return;
		}
		this.anInt3212 = 0;
		this.anInt3219 = (this.aClass261_5.anIntArray368.length > 1 ? 1 : -1) * -2052470417;
		this.anInt3215 = 0;
		this.aBoolean624 = false;
		this.anInt3216 = arg0 * 371090617;
		this.anInt3214 = 0;
		if (this.aClass261_5 != null & this.aClass261_5.anIntArray368 != null) {
			this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -1476077594);
			this.method23596(1451087023);
		}
	}

	@OriginalMember(owner = "client!aad", name = "n", descriptor = "(IB)V")
	final void method23600(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean624 = false;
		this.anInt3216 = arg0 * 371090617;
		this.anInt3214 = 0;
		this.anInt3215 = 0;
		if (this.aClass261_5 != null) {
			this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
		}
	}

	@OriginalMember(owner = "client!aad", name = "c", descriptor = "(II)Z")
	public final boolean method23601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass261_5 == null || arg0 == 0) {
			return false;
		} else if (this.aClass261_5.method26483(2114707126)) {
			return this.method23602(arg0, 1868963583);
		} else {
			if (this.anInt3216 * -316513911 > 0) {
				if (this.anInt3216 * -316513911 > arg0) {
					this.anInt3216 -= arg0 * 371090617;
					return false;
				}
				arg0 -= this.anInt3216 * -316513911;
				this.anInt3216 = 0;
				this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -334118431);
			}
			arg0 += this.anInt3215 * 140891625;
			@Pc(70) boolean local70 = this.aClass261_5.aBoolean778 | Class261.aBoolean777;
			if (arg0 > 100 && this.aClass261_5.anInt3895 * -1921428183 > 0) {
				@Pc(90) int local90 = this.aClass261_5.anIntArray368.length - this.aClass261_5.anInt3895 * -1921428183;
				while (this.anInt3212 * 1869185205 < local90 && arg0 > this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) {
					arg0 -= this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205];
					this.anInt3212 += 551775645;
				}
				if (this.anInt3212 * 1869185205 >= local90) {
					@Pc(132) int local132 = 0;
					for (@Pc(134) int local134 = local90; local134 < this.aClass261_5.anIntArray368.length; local134++) {
						local132 += this.aClass261_5.anIntArray370[local134];
					}
					if (this.anInt3220 * -60003823 == 0) {
						this.anInt3214 += arg0 / local132 * -1052848701;
					}
					arg0 %= local132;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					if (this.aClass261_5.anInt3895 * -1921428183 == -1 && this.aBoolean626) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass261_5.anInt3895 * 545922503;
					}
					if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
						this.anInt3219 = 2052470417;
					}
				}
				local70 = true;
			}
			while (arg0 > this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) {
				local70 = true;
				arg0 -= this.aClass261_5.anIntArray370[(this.anInt3212 += 551775645) * 1869185205 - 1];
				if (this.anInt3212 * 1869185205 >= this.aClass261_5.anIntArray368.length) {
					if (this.aClass261_5.anInt3895 * -1921428183 != -1 && this.anInt3220 * -60003823 != 2) {
						this.anInt3212 -= this.aClass261_5.anInt3895 * 268873509;
						if (this.anInt3220 * -60003823 == 0) {
							this.anInt3214 += -1052848701;
						}
					}
					if (this.anInt3214 * -252015893 >= this.aClass261_5.anInt3898 * 2133109915 || this.anInt3212 * 1869185205 < 0 || this.anInt3212 * 1869185205 >= this.aClass261_5.anIntArray368.length) {
						this.aBoolean624 = true;
						break;
					}
				}
				this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -1957122847);
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					if (-1921428183 * this.aClass261_5.anInt3895 == -1 && this.aBoolean626) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass261_5.anInt3895 * 545922503;
					}
					if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
						this.anInt3219 = 2052470417;
					}
				}
			}
			this.anInt3215 = arg0 * 1962168921;
			if (local70) {
				this.method23596(624202456);
			}
			return local70;
		}
	}

	@OriginalMember(owner = "client!aad", name = "b", descriptor = "(II)Z")
	final boolean method23602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		@Pc(5) Class80_Sub1_Sub5 local5 = this.aClass25_5.aClass80_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3215 * 140891625 < 0) {
			this.anInt3215 = (local5.method21784(286538612) + (int) (Math.random() * (double) local5.method21787(1624193262))) * 1962168921;
		}
		@Pc(34) int local34 = this.method23665(153275591);
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23621(local34 - arg0, (byte) -109);
				return false;
			}
			arg0 -= local34;
			this.method23621(0, (byte) -48);
		}
		local1 = arg0 != 0;
		for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
			this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			this.anInt3215 += 1962168921;
			if (this.anInt3215 * 140891625 >= local5.method21785(1001096775)) {
				if (this.aClass261_5.anInt3895 * -1921428183 == -1 || this.anInt3220 * -60003823 == 2) {
					this.aBoolean624 = true;
				} else {
					@Pc(113) int local113 = local5.method21787(1386852875) - this.aClass261_5.anInt3895 * -1921428183;
					this.anInt3215 = local113 * 1962168921;
					if (this.anInt3220 * -60003823 == 0) {
						this.anInt3214 += -1052848701;
					}
					if (this.anInt3214 * -252015893 >= this.aClass261_5.anInt3898 * 2133109915) {
						this.aBoolean624 = true;
					}
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aad", name = "o", descriptor = "(IZZB)V")
	public final void method23603(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		this.method23586(arg0, 0, 0, arg1, arg2, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "ay", descriptor = "(Lclient!fe;II)V")
	void method23604(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!aad", name = "ai", descriptor = "(Lclient!fe;II)V")
	final void method23605(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method23604(arg0, arg1, 594198470);
	}

	@OriginalMember(owner = "client!aad", name = "aq", descriptor = "(I)Z")
	final boolean method23606(@OriginalArg(0) int arg0) {
		if (this.aClass261_5 == null) {
			return false;
		}
		@Pc(5) boolean local5 = false;
		if (this.aClass261_5.method26483(1437925490)) {
			local5 = this.aClass25_5.method593(Class1.aClass41_Sub1_1, this.aClass261_5, (short) -9583);
		} else {
			local5 = this.aClass10_9.method319(Class1.aClass41_Sub1_1, this.aClass261_5, this.anInt3212 * 1869185205, this.anInt3219 * 1620293007, this.aClass261_5.anIntArray368, 1010388880);
			if (local5 && this.aBoolean625 && this.aClass261_5.anIntArray369 != null) {
				this.aClass10_10.method319(Class1.aClass41_Sub1_1, this.aClass261_5, this.anInt3212 * 1869185205, this.anInt3219 * 1620293007, this.aClass261_5.anIntArray369, 989004474);
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aad", name = "h", descriptor = "(Lclient!dn;I)V")
	public final void method23607(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass261_5.anIntArray368 != null && this.method23606(2098382387)) {
			arg0.method7327(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7327(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "aj", descriptor = "(Lclient!fe;I)V")
	void method23608(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aad", name = "ac", descriptor = "(Lclient!fe;I)V")
	void method23609(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aad", name = "ag", descriptor = "(Lclient!fe;I)V")
	void method23610(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aad", name = "ab", descriptor = "(Lclient!fe;I)V")
	void method23611(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aad", name = "cd", descriptor = "()V")
	public final void method23612() {
		this.anInt3214 = 0;
	}

	@OriginalMember(owner = "client!aad", name = "bg", descriptor = "(IIIZ)V")
	public final void method23615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23586(arg0, arg1, arg2, arg3, false, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "bl", descriptor = "(IIIZ)V")
	public final void method23616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23586(arg0, arg1, arg2, arg3, false, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "at", descriptor = "()Lclient!fe;")
	public final Class261 method23617() {
		return this.aClass261_5;
	}

	@OriginalMember(owner = "client!aad", name = "ak", descriptor = "()Lclient!fe;")
	public final Class261 method23618() {
		return this.aClass261_5;
	}

	@OriginalMember(owner = "client!aad", name = "av", descriptor = "()I")
	public final int method23619() {
		return this.aClass261_5 == null ? -1 : this.aClass261_5.anInt3892 * -1122423727;
	}

	@OriginalMember(owner = "client!aad", name = "an", descriptor = "(I)V")
	public final void method23620(@OriginalArg(0) int arg0) {
		this.method23626(arg0, 0, 0, false, (byte) -63);
	}

	@OriginalMember(owner = "client!aad", name = "x", descriptor = "(IB)V")
	public final void method23621(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt3216 = arg0 * 371090617;
	}

	@OriginalMember(owner = "client!aad", name = "ae", descriptor = "(I)V")
	public final void method23622(@OriginalArg(0) int arg0) {
		this.method23626(arg0, 0, 0, false, (byte) -114);
	}

	@OriginalMember(owner = "client!aad", name = "ct", descriptor = "(I)V")
	public final void method23623(@OriginalArg(0) int arg0) {
		if (this.aClass261_5.method26483(784967986)) {
			this.method23600(arg0, (byte) -3);
			return;
		}
		this.anInt3212 = 0;
		this.anInt3219 = (this.aClass261_5.anIntArray368.length > 1 ? 1 : -1) * -2052470417;
		this.anInt3215 = 0;
		this.aBoolean624 = false;
		this.anInt3216 = arg0 * 371090617;
		this.anInt3214 = 0;
		if (this.aClass261_5 != null & this.aClass261_5.anIntArray368 != null) {
			this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -992017215);
			this.method23596(61539287);
		}
	}

	@OriginalMember(owner = "client!aad", name = "ar", descriptor = "(II)V")
	public final void method23624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23626(arg0, arg1, 0, false, (byte) -9);
	}

	@OriginalMember(owner = "client!aad", name = "cc", descriptor = "(I)Z")
	final boolean method23625(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(5) Class80_Sub1_Sub5 local5 = this.aClass25_5.aClass80_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3215 * 140891625 < 0) {
			this.anInt3215 = (local5.method21784(980431527) + (int) (Math.random() * (double) local5.method21787(1282305933))) * 1962168921;
		}
		@Pc(34) int local34 = this.method23665(1114016133);
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23621(local34 - arg0, (byte) -17);
				return false;
			}
			arg0 -= local34;
			this.method23621(0, (byte) -25);
		}
		local1 = arg0 != 0;
		for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
			this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			this.anInt3215 += 1962168921;
			if (this.anInt3215 * 140891625 >= local5.method21785(1001096775)) {
				if (this.aClass261_5.anInt3895 * -1921428183 == -1 || this.anInt3220 * -60003823 == 2) {
					this.aBoolean624 = true;
				} else {
					@Pc(113) int local113 = local5.method21787(1942657234) - this.aClass261_5.anInt3895 * -1921428183;
					this.anInt3215 = local113 * 1962168921;
					if (this.anInt3220 * -60003823 == 0) {
						this.anInt3214 += -1052848701;
					}
					if (this.anInt3214 * -252015893 >= this.aClass261_5.anInt3898 * 2133109915) {
						this.aBoolean624 = true;
					}
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aad", name = "j", descriptor = "(IIIZB)V")
	public final void method23626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		this.method23586(arg0, arg1, arg2, arg3, false, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "as", descriptor = "(IZZ)V")
	public final void method23627(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23586(arg0, 0, 0, arg1, arg2, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "aw", descriptor = "(IZZ)V")
	public final void method23628(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23586(arg0, 0, 0, arg1, arg2, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "ax", descriptor = "(II)Z")
	public final boolean method23629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		if (this.aClass261_5 == null | (local14 = arg0 - this.anInt3216 * -316513911) <= 0) {
			return false;
		} else if (this.aClass261_5.method26483(744103219)) {
			return true;
		} else {
			return this.aClass261_5.aBoolean778 | local14 + this.anInt3215 * 140891625 > this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205];
		}
	}

	@OriginalMember(owner = "client!aad", name = "br", descriptor = "(IIIZ)V")
	public final void method23630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23586(arg0, arg1, arg2, arg3, false, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "bn", descriptor = "(IIIZ)V")
	public final void method23631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23586(arg0, arg1, arg2, arg3, false, -935443597);
	}

	@OriginalMember(owner = "client!aad", name = "ba", descriptor = "(IIIZZ)V")
	final void method23632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23582(1570503248)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass261_5 = null;
		} else {
			if (this.aClass261_5 == null || this.aClass261_5.anInt3892 * -1122423727 != arg0) {
				this.aClass261_5 = (Class261) Class1.aClass41_Sub1_1.method18054(arg0, -990329985);
				if (this.aClass261_5 == null || this.aClass261_5.anIntArray368 == null && !this.aClass261_5.method26483(814857842)) {
					this.aClass261_5 = null;
					return;
				}
			} else if (this.aClass261_5.anInt3897 * 746333843 == 0) {
				return;
			}
			this.anInt3214 = 0;
			this.anInt3216 = arg1 * 371090617;
			this.anInt3220 = arg2 * -696793359;
			this.aBoolean626 = arg4;
			if (this.aClass261_5.method26483(2077077082)) {
				if (arg3) {
					this.anInt3215 = -1962168921;
				} else {
					this.anInt3215 = 0;
				}
				this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			} else {
				if (arg3) {
					this.anInt3212 = (int) (Math.random() * (double) this.aClass261_5.anIntArray368.length) * 551775645;
					this.anInt3215 = (int) (Math.random() * (double) this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) * 1962168921;
				} else {
					this.anInt3212 = 0;
					this.anInt3215 = 0;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					this.anInt3219 = 2052470417;
				}
				if (this.anInt3216 * -316513911 == 0) {
					this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -1585989775);
				}
			}
			this.aBoolean624 = false;
		}
		this.method23596(25659762);
	}

	@OriginalMember(owner = "client!aad", name = "ad", descriptor = "()I")
	public final int method23633() {
		return this.aClass261_5 == null ? -1 : this.aClass261_5.anInt3892 * -1122423727;
	}

	@OriginalMember(owner = "client!aad", name = "m", descriptor = "(IZI)V")
	public final void method23634(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.method23626(arg0, 0, 0, arg1, (byte) -25);
	}

	@OriginalMember(owner = "client!aad", name = "bh", descriptor = "()Z")
	public final boolean method23635() {
		return this.anInt3216 * -316513911 != 0;
	}

	@OriginalMember(owner = "client!aad", name = "by", descriptor = "(IIIZZ)V")
	final void method23636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23582(2052881012)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass261_5 = null;
		} else {
			if (this.aClass261_5 == null || this.aClass261_5.anInt3892 * -1122423727 != arg0) {
				this.aClass261_5 = (Class261) Class1.aClass41_Sub1_1.method18054(arg0, -1666537470);
				if (this.aClass261_5 == null || this.aClass261_5.anIntArray368 == null && !this.aClass261_5.method26483(1431119595)) {
					this.aClass261_5 = null;
					return;
				}
			} else if (this.aClass261_5.anInt3897 * 746333843 == 0) {
				return;
			}
			this.anInt3214 = 0;
			this.anInt3216 = arg1 * 371090617;
			this.anInt3220 = arg2 * -696793359;
			this.aBoolean626 = arg4;
			if (this.aClass261_5.method26483(1504470235)) {
				if (arg3) {
					this.anInt3215 = -1962168921;
				} else {
					this.anInt3215 = 0;
				}
				this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			} else {
				if (arg3) {
					this.anInt3212 = (int) (Math.random() * (double) this.aClass261_5.anIntArray368.length) * 551775645;
					this.anInt3215 = (int) (Math.random() * (double) this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) * 1962168921;
				} else {
					this.anInt3212 = 0;
					this.anInt3215 = 0;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					this.anInt3219 = 2052470417;
				}
				if (this.anInt3216 * -316513911 == 0) {
					this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, 807931508);
				}
			}
			this.aBoolean624 = false;
		}
		this.method23596(393920121);
	}

	@OriginalMember(owner = "client!aad", name = "bk", descriptor = "()Z")
	public final boolean method23637() {
		return this.anInt3216 * -316513911 != 0;
	}

	@OriginalMember(owner = "client!aad", name = "bz", descriptor = "()Z")
	public final boolean method23638() {
		return this.anInt3216 * -316513911 != 0;
	}

	@OriginalMember(owner = "client!aad", name = "am", descriptor = "()Z")
	public final boolean method23639() {
		return this.aClass261_5 != null;
	}

	@OriginalMember(owner = "client!aad", name = "q", descriptor = "(Lclient!dn;IIB)V")
	public final void method23640(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass261_5.anIntArray368 != null && this.method23606(2111566566)) {
			arg0.method7365(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137, this.aClass10_9.aClass80_Sub1_Sub7_2, this.aClass10_9.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, arg2, this.aClass261_5.aBoolean776, null);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7365(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137, this.aClass10_10.aClass80_Sub1_Sub7_2, this.aClass10_10.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, arg2, this.aClass261_5.aBoolean776, null);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "bv", descriptor = "()Z")
	public final boolean method23641() {
		return this.anInt3216 * -316513911 != 0;
	}

	@OriginalMember(owner = "client!aad", name = "bp", descriptor = "()I")
	public final int method23642() {
		return this.anInt3216 * -316513911;
	}

	@OriginalMember(owner = "client!aad", name = "bb", descriptor = "(I)V")
	public final void method23643(@OriginalArg(0) int arg0) {
		this.anInt3216 = arg0 * 371090617;
	}

	@OriginalMember(owner = "client!aad", name = "bo", descriptor = "(I)V")
	public final void method23644(@OriginalArg(0) int arg0) {
		this.anInt3216 = arg0 * 371090617;
	}

	@OriginalMember(owner = "client!aad", name = "bc", descriptor = "()I")
	public final int method23645() {
		if (!this.method23606(2146769819)) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23606(1997868847)) {
			if (this.aClass261_5.method26483(1658527125)) {
				local5 |= this.aClass25_5.anInt78 * 1118159249;
			} else {
				local5 |= this.aClass10_9.anInt39 * -357325453;
				if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null) {
					local5 |= this.aClass10_10.anInt39 * -357325453;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aad", name = "bf", descriptor = "()I")
	public final int method23646() {
		if (!this.method23606(1967257686)) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23606(1989907528)) {
			if (this.aClass261_5.method26483(1710403574)) {
				local5 |= this.aClass25_5.anInt78 * 1118159249;
			} else {
				local5 |= this.aClass10_9.anInt39 * -357325453;
				if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null) {
					local5 |= this.aClass10_10.anInt39 * -357325453;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aad", name = "bw", descriptor = "(Lclient!dn;I)V")
	public final void method23647(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass261_5 == null) {
			return;
		}
		if (this.aClass261_5.anIntArray368 == null) {
			if (this.aClass261_5.method26483(1227981793) && this.method23606(2026344721)) {
				arg0.method7340(this.aClass25_5.aClass80_Sub1_Sub5_1, this.anInt3215 * 140891625, arg1, this.aClass261_5.aBoolean776);
			}
		} else if (this.method23606(2083799355)) {
			arg0.method7503(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137, this.aClass10_9.aClass80_Sub1_Sub7_2, this.aClass10_9.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, this.aClass261_5.aBoolean776);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7503(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137, this.aClass10_10.aClass80_Sub1_Sub7_2, this.aClass10_10.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, this.aClass261_5.aBoolean776);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "bx", descriptor = "(Lclient!dn;II)V")
	public final void method23648(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass261_5.anIntArray368 != null && this.method23606(2087529263)) {
			arg0.method7365(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137, this.aClass10_9.aClass80_Sub1_Sub7_2, this.aClass10_9.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, arg2, this.aClass261_5.aBoolean776, null);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7365(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137, this.aClass10_10.aClass80_Sub1_Sub7_2, this.aClass10_10.anInt41 * 175063815, this.anInt3215 * 140891625, this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205], arg1, arg2, this.aClass261_5.aBoolean776, null);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "bi", descriptor = "(Lclient!dn;)V")
	public final void method23649(@OriginalArg(0) Class105 arg0) {
		if (this.aClass261_5.anIntArray368 != null && this.method23606(1939170314)) {
			arg0.method7327(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7327(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "bu", descriptor = "(Lclient!dn;)V")
	public final void method23650(@OriginalArg(0) Class105 arg0) {
		if (this.aClass261_5.anIntArray368 != null && this.method23606(1976541935)) {
			arg0.method7327(this.aClass10_9.aClass80_Sub1_Sub7_1, this.aClass10_9.anInt40 * -262292137);
			if (this.aBoolean625 && this.aClass261_5.anIntArray369 != null && this.aClass10_10.aBoolean4) {
				arg0.method7327(this.aClass10_10.aClass80_Sub1_Sub7_1, this.aClass10_10.anInt40 * -262292137);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "bm", descriptor = "()Z")
	public final boolean method23651() {
		return this.aBoolean624;
	}

	@OriginalMember(owner = "client!aad", name = "bq", descriptor = "()V")
	public final void method23652() {
		this.anInt3214 = 0;
	}

	@OriginalMember(owner = "client!aad", name = "bd", descriptor = "()V")
	public final void method23653() {
		this.anInt3214 = 0;
	}

	@OriginalMember(owner = "client!aad", name = "az", descriptor = "(IZ)V")
	public final void method23654(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23626(arg0, 0, 0, arg1, (byte) -87);
	}

	@OriginalMember(owner = "client!aad", name = "cv", descriptor = "()V")
	public final void method23655() {
		this.method23599(0, (short) 25200);
	}

	@OriginalMember(owner = "client!aad", name = "cn", descriptor = "(I)V")
	final void method23657(@OriginalArg(0) int arg0) {
		this.aBoolean624 = false;
		this.anInt3216 = arg0 * 371090617;
		this.anInt3214 = 0;
		this.anInt3215 = 0;
		if (this.aClass261_5 != null) {
			this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
		}
	}

	@OriginalMember(owner = "client!aad", name = "z", descriptor = "(B)Z")
	public final boolean method23658(@OriginalArg(0) byte arg0) {
		return this.aBoolean624;
	}

	@OriginalMember(owner = "client!aad", name = "ch", descriptor = "(I)Z")
	public final boolean method23659(@OriginalArg(0) int arg0) {
		if (this.aClass261_5 == null || arg0 == 0) {
			return false;
		} else if (this.aClass261_5.method26483(1180182371)) {
			return this.method23602(arg0, 1938131876);
		} else {
			if (this.anInt3216 * -316513911 > 0) {
				if (this.anInt3216 * -316513911 > arg0) {
					this.anInt3216 -= arg0 * 371090617;
					return false;
				}
				arg0 -= this.anInt3216 * -316513911;
				this.anInt3216 = 0;
				this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, 426112435);
			}
			arg0 += this.anInt3215 * 140891625;
			@Pc(70) boolean local70 = this.aClass261_5.aBoolean778 | Class261.aBoolean777;
			if (arg0 > 100 && this.aClass261_5.anInt3895 * -1921428183 > 0) {
				@Pc(90) int local90 = this.aClass261_5.anIntArray368.length - this.aClass261_5.anInt3895 * -1921428183;
				while (this.anInt3212 * 1869185205 < local90 && arg0 > this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) {
					arg0 -= this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205];
					this.anInt3212 += 551775645;
				}
				if (this.anInt3212 * 1869185205 >= local90) {
					@Pc(132) int local132 = 0;
					for (@Pc(134) int local134 = local90; local134 < this.aClass261_5.anIntArray368.length; local134++) {
						local132 += this.aClass261_5.anIntArray370[local134];
					}
					if (this.anInt3220 * -60003823 == 0) {
						this.anInt3214 += arg0 / local132 * -1052848701;
					}
					arg0 %= local132;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					if (this.aClass261_5.anInt3895 * -1921428183 == -1 && this.aBoolean626) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass261_5.anInt3895 * 545922503;
					}
					if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
						this.anInt3219 = 2052470417;
					}
				}
				local70 = true;
			}
			while (arg0 > this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) {
				local70 = true;
				arg0 -= this.aClass261_5.anIntArray370[(this.anInt3212 += 551775645) * 1869185205 - 1];
				if (this.anInt3212 * 1869185205 >= this.aClass261_5.anIntArray368.length) {
					if (this.aClass261_5.anInt3895 * -1921428183 != -1 && this.anInt3220 * -60003823 != 2) {
						this.anInt3212 -= this.aClass261_5.anInt3895 * 268873509;
						if (this.anInt3220 * -60003823 == 0) {
							this.anInt3214 += -1052848701;
						}
					}
					if (this.anInt3214 * -252015893 >= this.aClass261_5.anInt3898 * 2133109915 || this.anInt3212 * 1869185205 < 0 || this.anInt3212 * 1869185205 >= this.aClass261_5.anIntArray368.length) {
						this.aBoolean624 = true;
						break;
					}
				}
				this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, -1062806845);
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					if (-1921428183 * this.aClass261_5.anInt3895 == -1 && this.aBoolean626) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass261_5.anInt3895 * 545922503;
					}
					if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
						this.anInt3219 = 2052470417;
					}
				}
			}
			this.anInt3215 = arg0 * 1962168921;
			if (local70) {
				this.method23596(-350517425);
			}
			return local70;
		}
	}

	@OriginalMember(owner = "client!aad", name = "bt", descriptor = "(IIIZZ)V")
	final void method23660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23582(-2052693943)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass261_5 = null;
		} else {
			if (this.aClass261_5 == null || this.aClass261_5.anInt3892 * -1122423727 != arg0) {
				this.aClass261_5 = (Class261) Class1.aClass41_Sub1_1.method18054(arg0, 1072415024);
				if (this.aClass261_5 == null || this.aClass261_5.anIntArray368 == null && !this.aClass261_5.method26483(1776997794)) {
					this.aClass261_5 = null;
					return;
				}
			} else if (this.aClass261_5.anInt3897 * 746333843 == 0) {
				return;
			}
			this.anInt3214 = 0;
			this.anInt3216 = arg1 * 371090617;
			this.anInt3220 = arg2 * -696793359;
			this.aBoolean626 = arg4;
			if (this.aClass261_5.method26483(290005670)) {
				if (arg3) {
					this.anInt3215 = -1962168921;
				} else {
					this.anInt3215 = 0;
				}
				this.method23605(this.aClass261_5, this.anInt3215 * 140891625, 461748378);
			} else {
				if (arg3) {
					this.anInt3212 = (int) (Math.random() * (double) this.aClass261_5.anIntArray368.length) * 551775645;
					this.anInt3215 = (int) (Math.random() * (double) this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205]) * 1962168921;
				} else {
					this.anInt3212 = 0;
					this.anInt3215 = 0;
				}
				this.anInt3219 = this.anInt3212 * 625601403 + -2052470417;
				if (this.anInt3219 * 1620293007 < 0 || this.anInt3219 * 1620293007 >= this.aClass261_5.anIntArray368.length) {
					this.anInt3219 = 2052470417;
				}
				if (this.anInt3216 * -316513911 == 0) {
					this.method23604(this.aClass261_5, this.anInt3212 * 1869185205, 759176051);
				}
			}
			this.aBoolean624 = false;
		}
		this.method23596(994798498);
	}

	@OriginalMember(owner = "client!aad", name = "cu", descriptor = "(I)Z")
	public final boolean method23661(@OriginalArg(0) int arg0) {
		@Pc(14) int local14;
		if (this.aClass261_5 == null | (local14 = arg0 - this.anInt3216 * -316513911) <= 0) {
			return false;
		} else if (this.aClass261_5.method26483(1501638051)) {
			return true;
		} else {
			return this.aClass261_5.aBoolean778 | local14 + this.anInt3215 * 140891625 > this.aClass261_5.anIntArray370[this.anInt3212 * 1869185205];
		}
	}

	@OriginalMember(owner = "client!aad", name = "ce", descriptor = "(Lclient!fe;I)V")
	final void method23662(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		this.method23604(arg0, arg1, -2099469174);
	}

	@OriginalMember(owner = "client!aad", name = "cs", descriptor = "()Z")
	final boolean method23663() {
		if (this.aClass261_5 == null) {
			return false;
		}
		@Pc(5) boolean local5 = false;
		if (this.aClass261_5.method26483(2098838626)) {
			local5 = this.aClass25_5.method593(Class1.aClass41_Sub1_1, this.aClass261_5, (short) -12453);
		} else {
			local5 = this.aClass10_9.method319(Class1.aClass41_Sub1_1, this.aClass261_5, this.anInt3212 * 1869185205, this.anInt3219 * 1620293007, this.aClass261_5.anIntArray368, -1777061123);
			if (local5 && this.aBoolean625 && this.aClass261_5.anIntArray369 != null) {
				this.aClass10_10.method319(Class1.aClass41_Sub1_1, this.aClass261_5, this.anInt3212 * 1869185205, this.anInt3219 * 1620293007, this.aClass261_5.anIntArray369, -1521149153);
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aad", name = "cj", descriptor = "()V")
	final void method23664() {
		if (this.aClass261_5 == null || this.aClass261_5.method26483(1610083272)) {
			this.aClass25_5.method588((byte) -104);
		} else {
			this.aClass10_9.method320(-1955959084);
			if (this.aBoolean625) {
				this.aClass10_10.method320(-937420640);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "k", descriptor = "(I)I")
	public final int method23665(@OriginalArg(0) int arg0) {
		return this.anInt3216 * -316513911;
	}

	@OriginalMember(owner = "client!aad", name = "ca", descriptor = "()V")
	final void method23666() {
		if (this.aClass261_5 == null || this.aClass261_5.method26483(1992412579)) {
			this.aClass25_5.method588((byte) -48);
		} else {
			this.aClass10_9.method320(-425409580);
			if (this.aBoolean625) {
				this.aClass10_10.method320(-761978870);
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "cr", descriptor = "()V")
	final void method23667() {
		if (this.aClass261_5 == null || this.aClass261_5.method26483(839857505)) {
			this.aClass25_5.method588((byte) -121);
		} else {
			this.aClass10_9.method320(-351717257);
			if (this.aBoolean625) {
				this.aClass10_10.method320(-882313834);
			}
		}
	}
}
