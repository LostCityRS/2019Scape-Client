package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaq")
public class Class19 {

	@OriginalMember(owner = "client!aaq", name = "m", descriptor = "I")
	public static final int anInt3215 = 2;

	@OriginalMember(owner = "client!aaq", name = "e", descriptor = "I")
	public static final int anInt3220 = 0;

	@OriginalMember(owner = "client!aaq", name = "n", descriptor = "I")
	public static final int anInt3222 = 1;

	@OriginalMember(owner = "client!aaq", name = "hu", descriptor = "Lclient!aoh;")
	public static Class32_Sub7 aClass32_Sub7_5;

	@OriginalMember(owner = "client!aaq", name = "k", descriptor = "Lclient!fg;")
	Class263 aClass263_5;

	@OriginalMember(owner = "client!aaq", name = "f", descriptor = "I")
	int anInt3216;

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "I")
	int anInt3217;

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "I")
	int anInt3218;

	@OriginalMember(owner = "client!aaq", name = "z", descriptor = "I")
	int anInt3219;

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "I")
	int anInt3223;

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "Z")
	boolean aBoolean533 = false;

	@OriginalMember(owner = "client!aaq", name = "d", descriptor = "Z")
	boolean aBoolean531 = false;

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "I")
	int anInt3221 = 0;

	@OriginalMember(owner = "client!aaq", name = "r", descriptor = "Z")
	boolean aBoolean532 = false;

	@OriginalMember(owner = "client!aaq", name = "o", descriptor = "Lclient!aau;")
	final Class23 aClass23_10;

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "Lclient!aao;")
	final Class17 aClass17_5;

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "Lclient!aau;")
	final Class23 aClass23_9;

	@OriginalMember(owner = "client!aaq", name = "as", descriptor = "(Lclient!aos;)V")
	public static void method23592(@OriginalArg(0) Class32_Sub17 arg0) {
		RuntimeException_Sub2.aClass32_Sub17_24 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "at", descriptor = "(Lclient!aos;)V")
	public static void method23595(@OriginalArg(0) Class32_Sub17 arg0) {
		RuntimeException_Sub2.aClass32_Sub17_24 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "bn", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;)V")
	public static void method23620(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2) {
		if (!arg1.method23590((byte) -10) || !arg2.method23590((byte) -84)) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray366 == null) {
			if (local10.method26281(-2126347932)) {
				if (local13.anIntArray366 != null) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray371[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
				} else if (local13.method26281(-2130261004)) {
					arg0.method6816(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675);
				}
			}
		} else if (local13.anIntArray366 != null) {
			arg0.method6831(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray371[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray371[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
		} else if (local13.method26281(-2086704513)) {
			arg0.method6844(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray371[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bt", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;)V")
	public static void method23621(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2) {
		if (!arg1.method23590((byte) -92) || !arg2.method23590((byte) -17)) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray366 == null) {
			if (local10.method26281(-2084790977)) {
				if (local13.anIntArray366 != null) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray371[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
				} else if (local13.method26281(-2140529663)) {
					arg0.method6816(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675);
				}
			}
		} else if (local13.anIntArray366 != null) {
			arg0.method6831(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray371[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray371[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
		} else if (local13.method26281(-2129244954)) {
			arg0.method6844(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray371[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "aw", descriptor = "(Lclient!aos;)V")
	public static void method23627(@OriginalArg(0) Class32_Sub17 arg0) {
		RuntimeException_Sub2.aClass32_Sub17_24 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "kc", descriptor = "(II)V")
	static void method23646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class383.method28326(arg0, null, 1623541034)) {
			Class432.method28970(Class166_Sub1.aClass320Array1[arg0].aClass312Array3, -1, -1849424515);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "n", descriptor = "(I)Lclient!ajq;")
	static Class149_Sub5 method23647(@OriginalArg(0) int arg0) {
		@Pc(4) Class149_Sub5 local4 = (Class149_Sub5) Class149_Sub5.aClass21_3.method381(-1864566399);
		if (local4 == null) {
			return new Class149_Sub5();
		} else {
			Class149_Sub5.anInt1448 -= 1630361431;
			return local4;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "aok", descriptor = "(Lclient!yf;I)V")
	static void method23648(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		Class65.aClass123_Sub1_2.method8946(local12, -2057553344);
	}

	@OriginalMember(owner = "client!aaq", name = "<init>", descriptor = "(Z)V")
	Class19(@OriginalArg(0) boolean arg0) {
		this.aBoolean531 = arg0;
		this.aClass23_10 = new Class23();
		this.aClass17_5 = new Class17();
		if (this.aBoolean531) {
			this.aClass23_9 = new Class23();
		} else {
			this.aClass23_9 = null;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "au", descriptor = "()Z")
	public final boolean method23562() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "bv", descriptor = "()V")
	public final void method23563() {
		this.method23607(0, (byte) 104);
	}

	@OriginalMember(owner = "client!aaq", name = "m", descriptor = "(I)Z")
	public final boolean method23564(@OriginalArg(0) int arg0) {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "k", descriptor = "(I)Lclient!fg;")
	public final Class263 method23565(@OriginalArg(0) int arg0) {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "f", descriptor = "(B)I")
	public final int method23566(@OriginalArg(0) byte arg0) {
		return this.aClass263_5 == null ? -1 : this.aClass263_5.anInt3910 * 1707631335;
	}

	@OriginalMember(owner = "client!aaq", name = "an", descriptor = "()I")
	public final int method23567() {
		return this.anInt3217 * 234452907;
	}

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "(III)V")
	public final void method23568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method23571(arg0, arg1, 0, false, (short) 11934);
	}

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "(IZI)V")
	public final void method23569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.method23571(arg0, 0, 0, arg1, (short) -16875);
	}

	@OriginalMember(owner = "client!aaq", name = "z", descriptor = "(IZZB)V")
	public final void method23570(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		this.method23572(arg0, 0, 0, arg1, arg2, -218902843);
	}

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "(IIIZS)V")
	public final void method23571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) short arg4) {
		this.method23572(arg0, arg1, arg2, arg3, false, 972074963);
	}

	@OriginalMember(owner = "client!aaq", name = "d", descriptor = "(IIIZZI)V")
	final void method23572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 == this.method23566((byte) 44)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3910 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18273(arg0, -720153592);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray366 == null && !this.aClass263_5.method26281(-2082957909)) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3909 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean532 = arg4;
			if (this.aClass263_5.method26281(-2123042485)) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, 2060653921);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray366.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1766017112);
				}
			}
			this.aBoolean533 = false;
		}
		this.method23591(-809190853);
	}

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "(B)Z")
	public final boolean method23573(@OriginalArg(0) byte arg0) {
		return this.anInt3217 * 234452907 != 0;
	}

	@OriginalMember(owner = "client!aaq", name = "t", descriptor = "(IB)Z")
	final boolean method23574(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) boolean local1 = false;
		@Pc(5) Class93_Sub1_Sub5 local5 = this.aClass17_5.aClass93_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3216 * 1550739371 < 0) {
			this.anInt3216 = (local5.method21554((short) 5180) + (int) (Math.random() * (double) local5.method21556(-1721376394))) * -594453757;
		}
		@Pc(34) int local34 = this.method23616((short) -6568);
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23575(local34 - arg0, (byte) 2);
				return false;
			}
			arg0 -= local34;
			this.method23575(0, (byte) 2);
		}
		local1 = arg0 != 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, -1423813924);
			this.anInt3216 += -594453757;
			if (this.anInt3216 * 1550739371 >= local5.method21555((byte) 1)) {
				if (this.aClass263_5.anInt3913 * 1979961975 == -1 || this.anInt3221 * 916351469 == 2) {
					this.aBoolean533 = true;
				} else {
					@Pc(112) int local112 = local5.method21556(-1883707840) - this.aClass263_5.anInt3913 * 1979961975;
					this.anInt3216 = local112 * -594453757;
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += 254052143;
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3911 * -708698247) {
						this.aBoolean533 = true;
					}
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaq", name = "v", descriptor = "(IB)V")
	public final void method23575(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt3217 = arg0 * 1368247043;
	}

	@OriginalMember(owner = "client!aaq", name = "o", descriptor = "(I)I")
	public final int method23576(@OriginalArg(0) int arg0) {
		if (!this.method23590((byte) -106)) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23590((byte) -38)) {
			if (this.aClass263_5.method26281(-2143900241)) {
				local5 |= this.aClass17_5.anInt59 * 1170162993;
			} else {
				local5 |= this.aClass23_10.anInt71 * 2023242135;
				if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null) {
					local5 |= this.aClass23_9.anInt71 * 2023242135;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "(Lclient!do;II)V")
	public final void method23577(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass263_5 == null) {
			return;
		}
		if (this.aClass263_5.anIntArray366 == null) {
			if (this.aClass263_5.method26281(-2125842634) && this.method23590((byte) -32)) {
				arg0.method6839(this.aClass17_5.aClass93_Sub1_Sub5_1, this.anInt3216 * 1550739371, arg1, this.aClass263_5.aBoolean675);
			}
		} else if (this.method23590((byte) -45)) {
			arg0.method6838(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean675);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method6838(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean675);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "(Lclient!do;IIB)V")
	public final void method23578(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass263_5.anIntArray366 != null && this.method23590((byte) -71)) {
			arg0.method6840(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean675, null);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method6840(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean675, null);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "q", descriptor = "(Lclient!do;B)V")
	public final void method23579(@OriginalArg(0) Class109 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass263_5.anIntArray366 != null && this.method23590((byte) -115)) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "(II)V")
	public final void method23580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23571(arg0, 0, 0, false, (short) -5933);
	}

	@OriginalMember(owner = "client!aaq", name = "bx", descriptor = "(Lclient!do;II)V")
	public final void method23581(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass263_5.anIntArray366 != null && this.method23590((byte) -51)) {
			arg0.method6840(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean675, null);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method6840(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean675, null);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "a", descriptor = "(I)V")
	public final void method23582(@OriginalArg(0) int arg0) {
		this.method23607(0, (byte) -119);
	}

	@OriginalMember(owner = "client!aaq", name = "bz", descriptor = "()V")
	public final void method23583() {
		this.method23607(0, (byte) -34);
	}

	@OriginalMember(owner = "client!aaq", name = "i", descriptor = "(II)V")
	final void method23584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		this.anInt3216 = 0;
		if (this.aClass263_5 != null) {
			this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, -1926814088);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "j", descriptor = "(II)Z")
	public final boolean method23585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass263_5 == null || arg0 == 0) {
			return false;
		} else if (this.aClass263_5.method26281(-2131877054)) {
			return this.method23574(arg0, (byte) 2);
		} else {
			if (this.anInt3217 * 234452907 > 0) {
				if (this.anInt3217 * 234452907 > arg0) {
					this.anInt3217 -= arg0 * 1368247043;
					return false;
				}
				arg0 -= this.anInt3217 * 234452907;
				this.anInt3217 = 0;
				this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1913814018);
			}
			arg0 += this.anInt3216 * 1550739371;
			@Pc(69) boolean local69 = this.aClass263_5.aBoolean673 | Class263.aBoolean674;
			if (arg0 > 100 && this.aClass263_5.anInt3913 * 1979961975 > 0) {
				@Pc(89) int local89 = this.aClass263_5.anIntArray366.length - this.aClass263_5.anInt3913 * 1979961975;
				while (this.anInt3223 * -1046590071 < local89 && arg0 > this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) {
					arg0 -= this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071];
					this.anInt3223 += 1904490681;
				}
				if (this.anInt3223 * -1046590071 >= local89) {
					@Pc(131) int local131 = 0;
					for (@Pc(133) int local133 = local89; local133 < this.aClass263_5.anIntArray366.length; local133++) {
						local131 += this.aClass263_5.anIntArray371[local133];
					}
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += arg0 / local131 * 254052143;
					}
					arg0 %= local131;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					if (this.aClass263_5.anInt3913 * 1979961975 == -1 && this.aBoolean532) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3913 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
						this.anInt3219 = 1138701553;
					}
				}
				local69 = true;
			}
			while (arg0 > this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) {
				local69 = true;
				arg0 -= this.aClass263_5.anIntArray371[(this.anInt3223 += 1904490681) * -1046590071 - 1];
				if (this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray366.length) {
					if (this.aClass263_5.anInt3913 * 1979961975 != -1 && this.anInt3221 * 916351469 != 2) {
						this.anInt3223 -= this.aClass263_5.anInt3913 * 724115455;
						if (this.anInt3221 * 916351469 == 0) {
							this.anInt3218 += 254052143;
						}
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3911 * -708698247 || this.anInt3223 * -1046590071 < 0 || this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray366.length) {
						this.aBoolean533 = true;
						break;
					}
				}
				this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1978211342);
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					if (this.aClass263_5.anInt3913 * 1979961975 == -1 && this.aBoolean532) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3913 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
						this.anInt3219 = 1138701553;
					}
				}
			}
			this.anInt3216 = arg0 * -594453757;
			if (local69) {
				this.method23591(-809190853);
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "cn", descriptor = "()Z")
	final boolean method23586() {
		if (this.aClass263_5 == null) {
			return false;
		}
		@Pc(4) boolean local4 = false;
		if (this.aClass263_5.method26281(-2116920923)) {
			local4 = this.aClass17_5.method237(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, (byte) 60);
		} else {
			local4 = this.aClass23_10.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray366, -1567093550);
			if (local4 && this.aBoolean531 && this.aClass263_5.anIntArray367 != null) {
				this.aClass23_9.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray367, -668336971);
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aaq", name = "ae", descriptor = "(II)Z")
	public final boolean method23587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		if (this.aClass263_5 == null | (local14 = arg0 - this.anInt3217 * 234452907) <= 0) {
			return false;
		} else if (this.aClass263_5.method26281(-2136200087)) {
			return true;
		} else {
			return this.aClass263_5.aBoolean673 | this.anInt3216 * 1550739371 + local14 > this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071];
		}
	}

	@OriginalMember(owner = "client!aaq", name = "n", descriptor = "(Lclient!aaq;I)V")
	public final void method23588(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		this.aClass263_5 = arg0.aClass263_5;
		this.aBoolean533 = arg0.aBoolean533;
		this.aBoolean531 = arg0.aBoolean531;
		this.anInt3217 = arg0.anInt3217;
		this.anInt3218 = arg0.anInt3218;
		this.anInt3223 = arg0.anInt3223;
		this.anInt3219 = arg0.anInt3219;
		this.anInt3216 = arg0.anInt3216;
		this.method23591(-809190853);
	}

	@OriginalMember(owner = "client!aaq", name = "ad", descriptor = "(Lclient!aaq;)V")
	public final void method23589(@OriginalArg(0) Class19 arg0) {
		this.aClass263_5 = arg0.aClass263_5;
		this.aBoolean533 = arg0.aBoolean533;
		this.aBoolean531 = arg0.aBoolean531;
		this.anInt3217 = arg0.anInt3217;
		this.anInt3218 = arg0.anInt3218;
		this.anInt3223 = arg0.anInt3223;
		this.anInt3219 = arg0.anInt3219;
		this.anInt3216 = arg0.anInt3216;
		this.method23591(-809190853);
	}

	@OriginalMember(owner = "client!aaq", name = "al", descriptor = "(B)Z")
	final boolean method23590(@OriginalArg(0) byte arg0) {
		if (this.aClass263_5 == null) {
			return false;
		}
		@Pc(4) boolean local4 = false;
		if (this.aClass263_5.method26281(-2115125701)) {
			local4 = this.aClass17_5.method237(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, (byte) -3);
		} else {
			local4 = this.aClass23_10.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray366, -312019470);
			if (local4 && this.aBoolean531 && this.aClass263_5.anIntArray367 != null) {
				this.aClass23_9.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray367, 548628760);
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aaq", name = "ac", descriptor = "(I)V")
	final void method23591(@OriginalArg(0) int arg0) {
		if (this.aClass263_5 == null || this.aClass263_5.method26281(-2136628892)) {
			this.aClass17_5.method236(2137573559);
		} else {
			this.aClass23_10.method496(1315227259);
			if (this.aBoolean531) {
				this.aClass23_9.method496(-743836269);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "b", descriptor = "(I)Z")
	public final boolean method23593(@OriginalArg(0) int arg0) {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!aaq", name = "bp", descriptor = "(I)V")
	final void method23594(@OriginalArg(0) int arg0) {
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		this.anInt3216 = 0;
		if (this.aClass263_5 != null) {
			this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, -2070210134);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ab", descriptor = "(IIIZZ)V")
	final void method23596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23566((byte) 112)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3910 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18273(arg0, 1278160707);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray366 == null && !this.aClass263_5.method26281(-2144736921)) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3909 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean532 = arg4;
			if (this.aClass263_5.method26281(-2104635092)) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, 1655088272);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray366.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1947399853);
				}
			}
			this.aBoolean533 = false;
		}
		this.method23591(-809190853);
	}

	@OriginalMember(owner = "client!aaq", name = "am", descriptor = "()Z")
	public final boolean method23597() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "ar", descriptor = "()Z")
	public final boolean method23598() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "ap", descriptor = "()Lclient!fg;")
	public final Class263 method23599() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "aq", descriptor = "()Lclient!fg;")
	public final Class263 method23600() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "ax", descriptor = "()Lclient!fg;")
	public final Class263 method23601() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "av", descriptor = "()I")
	public final int method23602() {
		return this.aClass263_5 == null ? -1 : this.aClass263_5.anInt3910 * 1707631335;
	}

	@OriginalMember(owner = "client!aaq", name = "ao", descriptor = "(IZZ)V")
	public final void method23603(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23572(arg0, 0, 0, arg1, arg2, 656404241);
	}

	@OriginalMember(owner = "client!aaq", name = "aj", descriptor = "(IZZ)V")
	public final void method23604(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23572(arg0, 0, 0, arg1, arg2, -1688189428);
	}

	@OriginalMember(owner = "client!aaq", name = "ay", descriptor = "(IIIZ)V")
	public final void method23605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23572(arg0, arg1, arg2, arg3, false, 105300946);
	}

	@OriginalMember(owner = "client!aaq", name = "bu", descriptor = "()V")
	public final void method23606() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "g", descriptor = "(IB)V")
	public final void method23607(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass263_5.method26281(-2108131533)) {
			this.method23584(arg0, 1537481365);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray366.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray366 != null) {
			this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1452416524);
			this.method23591(-809190853);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "aa", descriptor = "(IIIZZ)V")
	final void method23608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23566((byte) 119)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3910 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18273(arg0, -1073290760);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray366 == null && !this.aClass263_5.method26281(-2143677955)) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3909 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean532 = arg4;
			if (this.aClass263_5.method26281(-2130157773)) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, 807580237);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray366.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1582404393);
				}
			}
			this.aBoolean533 = false;
		}
		this.method23591(-809190853);
	}

	@OriginalMember(owner = "client!aaq", name = "ak", descriptor = "()I")
	public final int method23609() {
		return this.anInt3217 * 234452907;
	}

	@OriginalMember(owner = "client!aaq", name = "az", descriptor = "(IIIZZ)V")
	final void method23610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23566((byte) 48)) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3910 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18273(arg0, 205476528);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray366 == null && !this.aClass263_5.method26281(-2130580654)) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3909 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean532 = arg4;
			if (this.aClass263_5.method26281(-2096144966)) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, 1982537217);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray366.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1973688423);
				}
			}
			this.aBoolean533 = false;
		}
		this.method23591(-809190853);
	}

	@OriginalMember(owner = "client!aaq", name = "bf", descriptor = "(I)V")
	public final void method23611(@OriginalArg(0) int arg0) {
		this.anInt3217 = arg0 * 1368247043;
	}

	@OriginalMember(owner = "client!aaq", name = "be", descriptor = "()Z")
	public final boolean method23612() {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!aaq", name = "bl", descriptor = "()I")
	public final int method23613() {
		if (!this.method23590((byte) -117)) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23590((byte) -119)) {
			if (this.aClass263_5.method26281(-2123239582)) {
				local5 |= this.aClass17_5.anInt59 * 1170162993;
			} else {
				local5 |= this.aClass23_10.anInt71 * 2023242135;
				if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null) {
					local5 |= this.aClass23_9.anInt71 * 2023242135;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aaq", name = "bk", descriptor = "(Lclient!do;I)V")
	public final void method23614(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass263_5 == null) {
			return;
		}
		if (this.aClass263_5.anIntArray366 == null) {
			if (this.aClass263_5.method26281(-2095615592) && this.method23590((byte) -73)) {
				arg0.method6839(this.aClass17_5.aClass93_Sub1_Sub5_1, this.anInt3216 * 1550739371, arg1, this.aClass263_5.aBoolean675);
			}
		} else if (this.method23590((byte) -127)) {
			arg0.method6838(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean675);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method6838(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean675);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bh", descriptor = "(Lclient!do;I)V")
	public final void method23615(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass263_5 == null) {
			return;
		}
		if (this.aClass263_5.anIntArray366 == null) {
			if (this.aClass263_5.method26281(-2082974407) && this.method23590((byte) -53)) {
				arg0.method6839(this.aClass17_5.aClass93_Sub1_Sub5_1, this.anInt3216 * 1550739371, arg1, this.aClass263_5.aBoolean675);
			}
		} else if (this.method23590((byte) -17)) {
			arg0.method6838(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean675);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method6838(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean675);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "r", descriptor = "(S)I")
	public final int method23616(@OriginalArg(0) short arg0) {
		return this.anInt3217 * 234452907;
	}

	@OriginalMember(owner = "client!aaq", name = "bd", descriptor = "(Lclient!do;)V")
	public final void method23617(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray366 != null && this.method23590((byte) -68)) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bc", descriptor = "(Lclient!do;)V")
	public final void method23618(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray366 != null && this.method23590((byte) -31)) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bi", descriptor = "(Lclient!do;)V")
	public final void method23619(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray366 != null && this.method23590((byte) -56)) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean531 && this.aClass263_5.anIntArray367 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bq", descriptor = "()Z")
	public final boolean method23622() {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!aaq", name = "bm", descriptor = "()Z")
	public final boolean method23623() {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!aaq", name = "bb", descriptor = "()Z")
	public final boolean method23624() {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!aaq", name = "ag", descriptor = "(Lclient!fg;II)V")
	void method23625(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!aaq", name = "cl", descriptor = "(I)Z")
	final boolean method23626(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(5) Class93_Sub1_Sub5 local5 = this.aClass17_5.aClass93_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3216 * 1550739371 < 0) {
			this.anInt3216 = (local5.method21554((short) 5959) + (int) (Math.random() * (double) local5.method21556(-285154569))) * -594453757;
		}
		@Pc(34) int local34 = this.method23616((short) -25572);
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23575(local34 - arg0, (byte) 2);
				return false;
			}
			arg0 -= local34;
			this.method23575(0, (byte) 2);
		}
		local1 = arg0 != 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, -1797166944);
			this.anInt3216 += -594453757;
			if (this.anInt3216 * 1550739371 >= local5.method21555((byte) 1)) {
				if (this.aClass263_5.anInt3913 * 1979961975 == -1 || this.anInt3221 * 916351469 == 2) {
					this.aBoolean533 = true;
				} else {
					@Pc(112) int local112 = local5.method21556(-1470756514) - this.aClass263_5.anInt3913 * 1979961975;
					this.anInt3216 = local112 * -594453757;
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += 254052143;
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3911 * -708698247) {
						this.aBoolean533 = true;
					}
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaq", name = "bw", descriptor = "()V")
	public final void method23628() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "bo", descriptor = "()V")
	public final void method23629() {
		this.method23607(0, (byte) 11);
	}

	@OriginalMember(owner = "client!aaq", name = "ce", descriptor = "(I)Z")
	public final boolean method23630(@OriginalArg(0) int arg0) {
		@Pc(14) int local14;
		if (this.aClass263_5 == null | (local14 = arg0 - this.anInt3217 * 234452907) <= 0) {
			return false;
		} else if (this.aClass263_5.method26281(-2114286250)) {
			return true;
		} else {
			return this.aClass263_5.aBoolean673 | this.anInt3216 * 1550739371 + local14 > this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071];
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ah", descriptor = "(Lclient!fg;II)V")
	final void method23631(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method23625(arg0, arg1, 1666909746);
	}

	@OriginalMember(owner = "client!aaq", name = "br", descriptor = "(I)V")
	public final void method23632(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26281(-2117731599)) {
			this.method23584(arg0, 1328005056);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray366.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray366 != null) {
			this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1547032144);
			this.method23591(-809190853);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bg", descriptor = "(I)V")
	public final void method23633(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26281(-2138183654)) {
			this.method23584(arg0, 1712662339);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray366.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray366 != null) {
			this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1970032513);
			this.method23591(-809190853);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ba", descriptor = "(I)V")
	public final void method23634(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26281(-2134932087)) {
			this.method23584(arg0, 1314588444);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray366.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray366 != null) {
			this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 2070177952);
			this.method23591(-809190853);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ai", descriptor = "(Lclient!fg;I)V")
	void method23635(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aaq", name = "bj", descriptor = "(I)V")
	final void method23636(@OriginalArg(0) int arg0) {
		this.aBoolean533 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		this.anInt3216 = 0;
		if (this.aClass263_5 != null) {
			this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, -1914850827);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bs", descriptor = "(I)Z")
	public final boolean method23637(@OriginalArg(0) int arg0) {
		if (this.aClass263_5 == null || arg0 == 0) {
			return false;
		} else if (this.aClass263_5.method26281(-2105731325)) {
			return this.method23574(arg0, (byte) 2);
		} else {
			if (this.anInt3217 * 234452907 > 0) {
				if (this.anInt3217 * 234452907 > arg0) {
					this.anInt3217 -= arg0 * 1368247043;
					return false;
				}
				arg0 -= this.anInt3217 * 234452907;
				this.anInt3217 = 0;
				this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1416471258);
			}
			arg0 += this.anInt3216 * 1550739371;
			@Pc(69) boolean local69 = this.aClass263_5.aBoolean673 | Class263.aBoolean674;
			if (arg0 > 100 && this.aClass263_5.anInt3913 * 1979961975 > 0) {
				@Pc(89) int local89 = this.aClass263_5.anIntArray366.length - this.aClass263_5.anInt3913 * 1979961975;
				while (this.anInt3223 * -1046590071 < local89 && arg0 > this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) {
					arg0 -= this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071];
					this.anInt3223 += 1904490681;
				}
				if (this.anInt3223 * -1046590071 >= local89) {
					@Pc(131) int local131 = 0;
					for (@Pc(133) int local133 = local89; local133 < this.aClass263_5.anIntArray366.length; local133++) {
						local131 += this.aClass263_5.anIntArray371[local133];
					}
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += arg0 / local131 * 254052143;
					}
					arg0 %= local131;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					if (this.aClass263_5.anInt3913 * 1979961975 == -1 && this.aBoolean532) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3913 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
						this.anInt3219 = 1138701553;
					}
				}
				local69 = true;
			}
			while (arg0 > this.aClass263_5.anIntArray371[this.anInt3223 * -1046590071]) {
				local69 = true;
				arg0 -= this.aClass263_5.anIntArray371[(this.anInt3223 += 1904490681) * -1046590071 - 1];
				if (this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray366.length) {
					if (this.aClass263_5.anInt3913 * 1979961975 != -1 && this.anInt3221 * 916351469 != 2) {
						this.anInt3223 -= this.aClass263_5.anInt3913 * 724115455;
						if (this.anInt3221 * 916351469 == 0) {
							this.anInt3218 += 254052143;
						}
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3911 * -708698247 || this.anInt3223 * -1046590071 < 0 || this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray366.length) {
						this.aBoolean533 = true;
						break;
					}
				}
				this.method23625(this.aClass263_5, this.anInt3223 * -1046590071, 1758171334);
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
					if (this.aClass263_5.anInt3913 * 1979961975 == -1 && this.aBoolean532) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3913 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray366.length) {
						this.anInt3219 = 1138701553;
					}
				}
			}
			this.anInt3216 = arg0 * -594453757;
			if (local69) {
				this.method23591(-809190853);
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "af", descriptor = "()Z")
	public final boolean method23638() {
		return this.anInt3217 * 234452907 != 0;
	}

	@OriginalMember(owner = "client!aaq", name = "cg", descriptor = "(I)Z")
	final boolean method23639(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(5) Class93_Sub1_Sub5 local5 = this.aClass17_5.aClass93_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3216 * 1550739371 < 0) {
			this.anInt3216 = (local5.method21554((short) 10284) + (int) (Math.random() * (double) local5.method21556(-813882426))) * -594453757;
		}
		@Pc(34) int local34 = this.method23616((short) -18107);
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23575(local34 - arg0, (byte) 2);
				return false;
			}
			arg0 -= local34;
			this.method23575(0, (byte) 2);
		}
		local1 = arg0 != 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			this.method23631(this.aClass263_5, this.anInt3216 * 1550739371, 743882760);
			this.anInt3216 += -594453757;
			if (this.anInt3216 * 1550739371 >= local5.method21555((byte) 1)) {
				if (this.aClass263_5.anInt3913 * 1979961975 == -1 || this.anInt3221 * 916351469 == 2) {
					this.aBoolean533 = true;
				} else {
					@Pc(112) int local112 = local5.method21556(3740565) - this.aClass263_5.anInt3913 * 1979961975;
					this.anInt3216 = local112 * -594453757;
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += 254052143;
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3911 * -708698247) {
						this.aBoolean533 = true;
					}
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaq", name = "h", descriptor = "(S)V")
	public final void method23640(@OriginalArg(0) short arg0) {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "cu", descriptor = "(Lclient!fg;I)V")
	final void method23641(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		this.method23625(arg0, arg1, 1629236191);
	}

	@OriginalMember(owner = "client!aaq", name = "ci", descriptor = "()Z")
	final boolean method23642() {
		if (this.aClass263_5 == null) {
			return false;
		}
		@Pc(4) boolean local4 = false;
		if (this.aClass263_5.method26281(-2097770817)) {
			local4 = this.aClass17_5.method237(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, (byte) -18);
		} else {
			local4 = this.aClass23_10.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray366, -1329533);
			if (local4 && this.aBoolean531 && this.aClass263_5.anIntArray367 != null) {
				this.aClass23_9.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray367, -950888348);
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aaq", name = "by", descriptor = "()V")
	public final void method23643() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "cv", descriptor = "()V")
	final void method23644() {
		if (this.aClass263_5 == null || this.aClass263_5.method26281(-2144110903)) {
			this.aClass17_5.method236(2147234637);
		} else {
			this.aClass23_10.method496(1254567561);
			if (this.aBoolean531) {
				this.aClass23_9.method496(-1063231001);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "cp", descriptor = "()V")
	final void method23645() {
		if (this.aClass263_5 == null || this.aClass263_5.method26281(-2125459299)) {
			this.aClass17_5.method236(2133555257);
		} else {
			this.aClass23_10.method496(1365417992);
			if (this.aBoolean531) {
				this.aClass23_9.method496(1701829727);
			}
		}
	}
}
