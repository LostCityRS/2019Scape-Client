package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aue")
public final class Class120_Sub1_Sub1_Sub4 extends Class120_Sub1_Sub1 {

	@OriginalMember(owner = "client!aue", name = "sr", descriptor = "Lclient!afv;")
	public static Class110_Sub1 aClass110_Sub1_1;

	@OriginalMember(owner = "client!aue", name = "am", descriptor = "D")
	double aDouble4;

	@OriginalMember(owner = "client!aue", name = "ak", descriptor = "D")
	double aDouble5;

	@OriginalMember(owner = "client!aue", name = "at", descriptor = "D")
	double aDouble6;

	@OriginalMember(owner = "client!aue", name = "ad", descriptor = "D")
	double aDouble7;

	@OriginalMember(owner = "client!aue", name = "av", descriptor = "D")
	double aDouble8;

	@OriginalMember(owner = "client!aue", name = "ap", descriptor = "Lclient!xe;")
	Class658 aClass658_4;

	@OriginalMember(owner = "client!aue", name = "af", descriptor = "Z")
	boolean aBoolean651 = false;

	@OriginalMember(owner = "client!aue", name = "aa", descriptor = "I")
	int anInt3283 = 0;

	@OriginalMember(owner = "client!aue", name = "ae", descriptor = "Z")
	boolean aBoolean652 = false;

	@OriginalMember(owner = "client!aue", name = "ar", descriptor = "I")
	int anInt3285 = 0;

	@OriginalMember(owner = "client!aue", name = "ax", descriptor = "I")
	final int anInt3277;

	@OriginalMember(owner = "client!aue", name = "aq", descriptor = "I")
	public final int anInt3284;

	@OriginalMember(owner = "client!aue", name = "ao", descriptor = "I")
	public final int anInt3274;

	@OriginalMember(owner = "client!aue", name = "aj", descriptor = "I")
	final int anInt3281;

	@OriginalMember(owner = "client!aue", name = "ac", descriptor = "I")
	final int anInt3278;

	@OriginalMember(owner = "client!aue", name = "ag", descriptor = "I")
	final int anInt3282;

	@OriginalMember(owner = "client!aue", name = "ab", descriptor = "I")
	public final int anInt3279;

	@OriginalMember(owner = "client!aue", name = "ay", descriptor = "I")
	final int anInt3275;

	@OriginalMember(owner = "client!aue", name = "ai", descriptor = "I")
	public final int anInt3276;

	@OriginalMember(owner = "client!aue", name = "ah", descriptor = "Z")
	final boolean aBoolean650;

	@OriginalMember(owner = "client!aue", name = "al", descriptor = "I")
	final int anInt3280;

	@OriginalMember(owner = "client!aue", name = "an", descriptor = "Lclient!aad;")
	final Class6 aClass6_4;

	@OriginalMember(owner = "client!aue", name = "<init>", descriptor = "(Lclient!te;IIIIIIIIIIIIIZII)V")
	public Class120_Sub1_Sub1_Sub4(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16) {
		super(arg0, arg2, arg3, arg4, Class439.method29150(arg4, arg5, arg2, 1037753497) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte) 0);
		this.anInt3277 = arg1 * 1174202019;
		this.anInt3284 = arg7 * 591696695;
		this.anInt3274 = arg8 * -838893295;
		this.anInt3281 = arg9 * -314998203;
		this.anInt3278 = arg10 * 1303296335;
		this.anInt3282 = arg11 * 47303861;
		this.anInt3279 = arg12 * 5871349;
		this.anInt3275 = arg6 * -548355927;
		this.anInt3276 = arg13 * 1008991637;
		this.aBoolean650 = arg14;
		this.aBoolean651 = false;
		this.anInt3280 = arg15 * 1661552933;
		this.anInt3285 = arg16 * -1580722927;
		@Pc(112) int local112 = ((Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt3277 * 53607691, -1445625582)).anInt5764 * 319211597;
		this.aClass6_4 = new Class6_Sub1(this, false);
		this.aClass6_4.method23587(local112, -2060415981);
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!aue", name = "l", descriptor = "(Lclient!di;II)Lclient!dn;")
	Class105 method24202(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt3277 * 53607691, 1973181212);
		return local8.method36789(arg0, arg1, this.aClass6_4, (byte) 2, 1317415835);
	}

	@OriginalMember(owner = "client!aue", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 2048, -1485730232);
		if (local5 == null) {
			return null;
		}
		@Pc(12) Class471 local12 = this.method24526();
		this.method24208(arg0, local5, local12, -1474604419);
		@Pc(22) Class573 local22 = Class454.method29307(false, 147886005);
		local5.method7359(local12, this.aClass246Array21[0], 0);
		if (this.aClass658_4 != null) {
			@Pc(37) Class221 local37 = this.aClass658_4.method33244();
			arg0.method20964(local37);
		}
		this.aBoolean652 = local5.method7395();
		local5.method7501();
		this.anInt3283 = local5.method7366() * -875757803;
		return local22;
	}

	@OriginalMember(owner = "client!aue", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!aue", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.anInt3283 * 1956141117;
	}

	@OriginalMember(owner = "client!aue", name = "t", descriptor = "(I)I")
	public int method24203(@OriginalArg(0) int arg0) {
		return this.anInt3285 * -197821455;
	}

	@OriginalMember(owner = "client!aue", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aue", name = "f", descriptor = "(IIIII)V")
	public void method24204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		if (!this.aBoolean651) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat297;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat296;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat297 += local13 * (float) (this.anInt3278 * 2101394863) / local30;
				local4.aFloat296 += local19 * (float) (this.anInt3278 * 2101394863) / local30;
			}
			if (this.aBoolean650) {
				local4.aFloat295 = Class439.method29150((int) local4.aFloat297, (int) local4.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
			}
			this.method24542(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3274 * 862949361 + 1 - arg3);
		this.aDouble4 = (double) ((float) arg0 - local4.aFloat297) / local96;
		this.aDouble5 = (double) ((float) arg1 - local4.aFloat296) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3281 * 1759133837 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat295) / local96;
		} else {
			if (!this.aBoolean651) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3281 * 1759133837) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat295) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29557();
	}

	@OriginalMember(owner = "client!aue", name = "e", descriptor = "(I)V")
	public void method24205(@OriginalArg(0) int arg0) {
		if (this.aBoolean651 || this.anInt3282 * -1281506915 == 0) {
			return;
		}
		@Pc(10) Class120_Sub1_Sub1_Sub1 local10 = null;
		if (client.anInt3541 * -1330995431 == 0) {
			local10 = Class251.aClass254Array1[this.anInt3282 * -1281506915 - 1].method26399((byte) -79);
		} else {
			@Pc(39) int local39;
			if (this.anInt3282 * -1281506915 < 0) {
				local39 = -(this.anInt3282 * -1281506915) - 1;
				if (client.anInt3558 * 188678613 == local39) {
					local10 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3;
				} else {
					local10 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local39];
				}
			} else {
				local39 = this.anInt3282 * -1281506915 - 1;
				@Pc(65) Class80_Sub19 local65 = (Class80_Sub19) client.aClass24_18.method560((long) local39);
				if (local65 != null) {
					local10 = (Class120_Sub1_Sub1_Sub1) local65.anObject5;
				}
			}
		}
		if (local10 == null) {
			return;
		}
		@Pc(77) Class463 local77 = local10.method24552().aClass463_61;
		this.method24531(local77.aFloat297, (float) (Class439.method29150((int) local77.aFloat297, (int) local77.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169), local77.aFloat296);
		if (this.anInt3280 * -933516627 < 0) {
			return;
		}
		@Pc(108) Class621 local108 = local10.method18952((byte) -24);
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (local108.anIntArrayArray63 != null && local108.anIntArrayArray63[this.anInt3280 * -933516627] != null) {
			local110 += local108.anIntArrayArray63[this.anInt3280 * -933516627][0];
			local112 += local108.anIntArrayArray63[this.anInt3280 * -933516627][2];
		}
		if (local108.anIntArrayArray64 != null && local108.anIntArrayArray64[this.anInt3280 * -933516627] != null) {
			local110 += local108.anIntArrayArray64[this.anInt3280 * -933516627][0];
			local112 += local108.anIntArrayArray64[this.anInt3280 * -933516627][2];
		}
		if (local110 == 0 && local112 == 0) {
			return;
		}
		@Pc(194) int local194 = local10.aClass372_8.method28394((byte) 3);
		@Pc(196) int local196 = local194;
		if (local10.anIntArray235 != null && local10.anIntArray235[this.anInt3280 * -933516627] != -1) {
			local196 = local10.anIntArray235[this.anInt3280 * -933516627];
		}
		@Pc(222) int local222 = local196 - local194 & 0x3FFF;
		@Pc(226) int local226 = Class467.anIntArray454[local222];
		@Pc(230) int local230 = Class467.anIntArray453[local222];
		@Pc(240) int local240 = local226 * local112 + local230 * local110 >> 14;
		local112 = local230 * local112 - local226 * local110 >> 14;
		@Pc(257) Class463 local257 = Class463.method29472(this.method24552().aClass463_61);
		local257.aFloat297 += local240;
		local257.aFloat296 += local112;
		this.method24542(local257);
		local257.method29557();
	}

	@OriginalMember(owner = "client!aue", name = "u", descriptor = "(II)V")
	public void method24206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aBoolean651 = true;
		@Pc(8) Class457 local8 = new Class457(this.method24552());
		local8.aClass463_61.aFloat297 = (float) ((double) local8.aClass463_61.aFloat297 + this.aDouble4 * (double) arg0);
		local8.aClass463_61.aFloat296 = (float) ((double) local8.aClass463_61.aFloat296 + (double) arg0 * this.aDouble5);
		if (this.aBoolean650) {
			local8.aClass463_61.aFloat295 = Class439.method29150((int) local8.aClass463_61.aFloat297, (int) local8.aClass463_61.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
		} else if (this.anInt3281 * 1759133837 == -1) {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble7 * (double) arg0);
		} else {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble7);
			this.aDouble7 += (double) arg0 * this.aDouble8;
		}
		local8.aClass466_5.method29645(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble7, this.aDouble6));
		@Pc(127) Class466 local127 = Class466.method29640();
		local127.method29645(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble4, this.aDouble5) - 3.1415927F);
		local8.aClass466_5.method29660(local127);
		local127.method29643();
		this.method24532(local8);
		if (this.aClass6_4.method23601(1, -2056452452) && this.aClass6_4.method23658((byte) 1)) {
			this.aClass6_4.method23598((short) -16759);
		}
	}

	@OriginalMember(owner = "client!aue", name = "j", descriptor = "(IIII)V")
	public void method24207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		if (!this.aBoolean651) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat297;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat296;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat297 += local13 * (float) (this.anInt3278 * 2101394863) / local30;
				local4.aFloat296 += local19 * (float) (this.anInt3278 * 2101394863) / local30;
			}
			if (this.aBoolean650) {
				local4.aFloat295 = Class439.method29150((int) local4.aFloat297, (int) local4.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
			}
			this.method24542(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3274 * 862949361 + 1 - arg3);
		this.aDouble4 = (double) ((float) arg0 - local4.aFloat297) / local96;
		this.aDouble5 = (double) ((float) arg1 - local4.aFloat296) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3281 * 1759133837 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat295) / local96;
		} else {
			if (!this.aBoolean651) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3281 * 1759133837) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat295) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29557();
	}

	@OriginalMember(owner = "client!aue", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 0, -312923867);
		if (local5 != null) {
			@Pc(11) Class471 local11 = this.method24526();
			this.anInt3283 = local5.method7366() * -875757803;
			local5.method7501();
			this.method24208(arg0, local5, local11, -2056197729);
		}
	}

	@OriginalMember(owner = "client!aue", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 0, -1913090650);
		if (local5 != null) {
			@Pc(11) Class471 local11 = this.method24526();
			this.anInt3283 = local5.method7366() * -875757803;
			local5.method7501();
			this.method24208(arg0, local5, local11, 1943352080);
		}
	}

	@OriginalMember(owner = "client!aue", name = "bw", descriptor = "(I)V")
	@Override
	void method24518(@OriginalArg(0) int arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		this.aShort129 = this.aShort126 = (short) (local3.aFloat297 / 512.0F);
		this.aShort127 = this.aShort128 = (short) (local3.aFloat296 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "g", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;I)V")
	void method24208(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) int arg3) {
		arg1.method7346(arg2);
		@Pc(5) Class228[] local5 = arg1.method7385();
		@Pc(8) Class211[] local8 = arg1.method7386();
		if ((this.aClass658_4 == null || this.aClass658_4.aBoolean972) && (local5 != null || local8 != null)) {
			this.aClass658_4 = Class658.method33264(client.currentCycle, true);
		}
		if (this.aClass658_4 != null) {
			this.aClass658_4.method33238(arg0, (long) client.currentCycle, local5, local8, false);
			this.aClass658_4.method33242(this.aByte99, this.aShort129, this.aShort126, this.aShort127, this.aShort128);
		}
	}

	@OriginalMember(owner = "client!aue", name = "i", descriptor = "(I)V")
	public void method24209(@OriginalArg(0) int arg0) {
		if (this.aClass658_4 != null) {
			this.aClass658_4.method33233();
		}
	}

	@OriginalMember(owner = "client!aue", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "q", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;)V")
	void method24210(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2) {
		arg1.method7346(arg2);
		@Pc(5) Class228[] local5 = arg1.method7385();
		@Pc(8) Class211[] local8 = arg1.method7386();
		if ((this.aClass658_4 == null || this.aClass658_4.aBoolean972) && (local5 != null || local8 != null)) {
			this.aClass658_4 = Class658.method33264(client.currentCycle, true);
		}
		if (this.aClass658_4 != null) {
			this.aClass658_4.method33238(arg0, (long) client.currentCycle, local5, local8, false);
			this.aClass658_4.method33242(this.aByte99, this.aShort129, this.aShort126, this.aShort127, this.aShort128);
		}
	}

	@OriginalMember(owner = "client!aue", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!aue", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!aue", name = "ec", descriptor = "()V")
	@Override
	void method24521() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		this.aShort129 = this.aShort126 = (short) (local3.aFloat297 / 512.0F);
		this.aShort127 = this.aShort128 = (short) (local3.aFloat296 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.anInt3283 * 1956141117;
	}

	@OriginalMember(owner = "client!aue", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.anInt3283 * 1956141117;
	}

	@OriginalMember(owner = "client!aue", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aue", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 2048, -1946350485);
		if (local5 == null) {
			return null;
		}
		@Pc(12) Class471 local12 = this.method24526();
		this.method24208(arg0, local5, local12, -428849350);
		@Pc(22) Class573 local22 = Class454.method29307(false, 60408110);
		local5.method7359(local12, this.aClass246Array21[0], 0);
		if (this.aClass658_4 != null) {
			@Pc(37) Class221 local37 = this.aClass658_4.method33244();
			arg0.method20964(local37);
		}
		this.aBoolean652 = local5.method7395();
		local5.method7501();
		this.anInt3283 = local5.method7366() * -875757803;
		return local22;
	}

	@OriginalMember(owner = "client!aue", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 2048, 1109036874);
		if (local5 == null) {
			return null;
		}
		@Pc(12) Class471 local12 = this.method24526();
		this.method24208(arg0, local5, local12, -409769966);
		@Pc(22) Class573 local22 = Class454.method29307(false, -1625899363);
		local5.method7359(local12, this.aClass246Array21[0], 0);
		if (this.aClass658_4 != null) {
			@Pc(37) Class221 local37 = this.aClass658_4.method33244();
			arg0.method20964(local37);
		}
		this.aBoolean652 = local5.method7395();
		local5.method7501();
		this.anInt3283 = local5.method7366() * -875757803;
		return local22;
	}

	@OriginalMember(owner = "client!aue", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "m", descriptor = "()I")
	public int method24211() {
		return this.anInt3285 * -197821455;
	}

	@OriginalMember(owner = "client!aue", name = "x", descriptor = "(I)V")
	public void method24212(@OriginalArg(0) int arg0) {
		this.aBoolean651 = true;
		@Pc(8) Class457 local8 = new Class457(this.method24552());
		local8.aClass463_61.aFloat297 = (float) ((double) local8.aClass463_61.aFloat297 + this.aDouble4 * (double) arg0);
		local8.aClass463_61.aFloat296 = (float) ((double) local8.aClass463_61.aFloat296 + (double) arg0 * this.aDouble5);
		if (this.aBoolean650) {
			local8.aClass463_61.aFloat295 = Class439.method29150((int) local8.aClass463_61.aFloat297, (int) local8.aClass463_61.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
		} else if (this.anInt3281 * 1759133837 == -1) {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble7 * (double) arg0);
		} else {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble7);
			this.aDouble7 += (double) arg0 * this.aDouble8;
		}
		local8.aClass466_5.method29645(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble7, this.aDouble6));
		@Pc(127) Class466 local127 = Class466.method29640();
		local127.method29645(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble4, this.aDouble5) - 3.1415927F);
		local8.aClass466_5.method29660(local127);
		local127.method29643();
		this.method24532(local8);
		if (this.aClass6_4.method23601(1, -1166676472) && this.aClass6_4.method23658((byte) 1)) {
			this.aClass6_4.method23598((short) -23381);
		}
	}

	@OriginalMember(owner = "client!aue", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "dk", descriptor = "()V")
	@Override
	void method24520() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		this.aShort129 = this.aShort126 = (short) (local3.aFloat297 / 512.0F);
		this.aShort127 = this.aShort128 = (short) (local3.aFloat296 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 0, -1970604813);
		if (local5 != null) {
			@Pc(11) Class471 local11 = this.method24526();
			this.anInt3283 = local5.method7366() * -875757803;
			local5.method7501();
			this.method24208(arg0, local5, local11, -1929764987);
		}
	}

	@OriginalMember(owner = "client!aue", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 0, 1973250374);
		if (local5 != null) {
			@Pc(11) Class471 local11 = this.method24526();
			this.anInt3283 = local5.method7366() * -875757803;
			local5.method7501();
			this.method24208(arg0, local5, local11, 23328297);
		}
	}

	@OriginalMember(owner = "client!aue", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 0, 1079673949);
		if (local5 != null) {
			@Pc(11) Class471 local11 = this.method24526();
			this.anInt3283 = local5.method7366() * -875757803;
			local5.method7501();
			this.method24208(arg0, local5, local11, 1818295169);
		}
	}

	@OriginalMember(owner = "client!aue", name = "da", descriptor = "()V")
	@Override
	void method24519() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		this.aShort129 = this.aShort126 = (short) (local3.aFloat297 / 512.0F);
		this.aShort127 = this.aShort128 = (short) (local3.aFloat296 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "o", descriptor = "(IIII)V")
	public void method24213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		if (!this.aBoolean651) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat297;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat296;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat297 += local13 * (float) (this.anInt3278 * 2101394863) / local30;
				local4.aFloat296 += local19 * (float) (this.anInt3278 * 2101394863) / local30;
			}
			if (this.aBoolean650) {
				local4.aFloat295 = Class439.method29150((int) local4.aFloat297, (int) local4.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
			}
			this.method24542(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3274 * 862949361 + 1 - arg3);
		this.aDouble4 = (double) ((float) arg0 - local4.aFloat297) / local96;
		this.aDouble5 = (double) ((float) arg1 - local4.aFloat296) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3281 * 1759133837 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat295) / local96;
		} else {
			if (!this.aBoolean651) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3281 * 1759133837) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat295) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29557();
	}

	@OriginalMember(owner = "client!aue", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.anInt3283 * 1956141117;
	}

	@OriginalMember(owner = "client!aue", name = "a", descriptor = "(IIII)V")
	public void method24214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		if (!this.aBoolean651) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat297;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat296;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat297 += local13 * (float) (this.anInt3278 * 2101394863) / local30;
				local4.aFloat296 += local19 * (float) (this.anInt3278 * 2101394863) / local30;
			}
			if (this.aBoolean650) {
				local4.aFloat295 = Class439.method29150((int) local4.aFloat297, (int) local4.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
			}
			this.method24542(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3274 * 862949361 + 1 - arg3);
		this.aDouble4 = (double) ((float) arg0 - local4.aFloat297) / local96;
		this.aDouble5 = (double) ((float) arg1 - local4.aFloat296) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3281 * 1759133837 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat295) / local96;
		} else {
			if (!this.aBoolean651) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3281 * 1759133837) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat295) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29557();
	}

	@OriginalMember(owner = "client!aue", name = "s", descriptor = "(IIII)V")
	public void method24215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		if (!this.aBoolean651) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat297;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat296;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat297 += local13 * (float) (this.anInt3278 * 2101394863) / local30;
				local4.aFloat296 += local19 * (float) (this.anInt3278 * 2101394863) / local30;
			}
			if (this.aBoolean650) {
				local4.aFloat295 = Class439.method29150((int) local4.aFloat297, (int) local4.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
			}
			this.method24542(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3274 * 862949361 + 1 - arg3);
		this.aDouble4 = (double) ((float) arg0 - local4.aFloat297) / local96;
		this.aDouble5 = (double) ((float) arg1 - local4.aFloat296) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3281 * 1759133837 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat295) / local96;
		} else {
			if (!this.aBoolean651) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3281 * 1759133837) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat295) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29557();
	}

	@OriginalMember(owner = "client!aue", name = "k", descriptor = "(I)V")
	public void method24216(@OriginalArg(0) int arg0) {
		this.aBoolean651 = true;
		@Pc(8) Class457 local8 = new Class457(this.method24552());
		local8.aClass463_61.aFloat297 = (float) ((double) local8.aClass463_61.aFloat297 + this.aDouble4 * (double) arg0);
		local8.aClass463_61.aFloat296 = (float) ((double) local8.aClass463_61.aFloat296 + (double) arg0 * this.aDouble5);
		if (this.aBoolean650) {
			local8.aClass463_61.aFloat295 = Class439.method29150((int) local8.aClass463_61.aFloat297, (int) local8.aClass463_61.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
		} else if (this.anInt3281 * 1759133837 == -1) {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble7 * (double) arg0);
		} else {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble7);
			this.aDouble7 += (double) arg0 * this.aDouble8;
		}
		local8.aClass466_5.method29645(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble7, this.aDouble6));
		@Pc(127) Class466 local127 = Class466.method29640();
		local127.method29645(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble4, this.aDouble5) - 3.1415927F);
		local8.aClass466_5.method29660(local127);
		local127.method29643();
		this.method24532(local8);
		if (this.aClass6_4.method23601(1, -1443277878) && this.aClass6_4.method23658((byte) 1)) {
			this.aClass6_4.method23598((short) -17082);
		}
	}

	@OriginalMember(owner = "client!aue", name = "h", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;)V")
	void method24217(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2) {
		arg1.method7346(arg2);
		@Pc(5) Class228[] local5 = arg1.method7385();
		@Pc(8) Class211[] local8 = arg1.method7386();
		if ((this.aClass658_4 == null || this.aClass658_4.aBoolean972) && (local5 != null || local8 != null)) {
			this.aClass658_4 = Class658.method33264(client.currentCycle, true);
		}
		if (this.aClass658_4 != null) {
			this.aClass658_4.method33238(arg0, (long) client.currentCycle, local5, local8, false);
			this.aClass658_4.method33242(this.aByte99, this.aShort129, this.aShort126, this.aShort127, this.aShort128);
		}
	}

	@OriginalMember(owner = "client!aue", name = "w", descriptor = "(I)V")
	public void method24218(@OriginalArg(0) int arg0) {
		this.aBoolean651 = true;
		@Pc(8) Class457 local8 = new Class457(this.method24552());
		local8.aClass463_61.aFloat297 = (float) ((double) local8.aClass463_61.aFloat297 + this.aDouble4 * (double) arg0);
		local8.aClass463_61.aFloat296 = (float) ((double) local8.aClass463_61.aFloat296 + (double) arg0 * this.aDouble5);
		if (this.aBoolean650) {
			local8.aClass463_61.aFloat295 = Class439.method29150((int) local8.aClass463_61.aFloat297, (int) local8.aClass463_61.aFloat296, this.aByte99, 1037753497) - this.anInt3275 * 68150169;
		} else if (this.anInt3281 * 1759133837 == -1) {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble7 * (double) arg0);
		} else {
			local8.aClass463_61.aFloat295 = (float) ((double) local8.aClass463_61.aFloat295 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble7);
			this.aDouble7 += (double) arg0 * this.aDouble8;
		}
		local8.aClass466_5.method29645(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble7, this.aDouble6));
		@Pc(127) Class466 local127 = Class466.method29640();
		local127.method29645(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble4, this.aDouble5) - 3.1415927F);
		local8.aClass466_5.method29660(local127);
		local127.method29643();
		this.method24532(local8);
		if (this.aClass6_4.method23601(1, -1583776652) && this.aClass6_4.method23658((byte) 1)) {
			this.aClass6_4.method23598((short) -1223);
		}
	}

	@OriginalMember(owner = "client!aue", name = "r", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method24219(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt3277 * 53607691, -1615722280);
		return local8.method36789(arg0, arg1, this.aClass6_4, (byte) 2, 298562059);
	}

	@OriginalMember(owner = "client!aue", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(5) Class105 local5 = this.method24202(arg0, 2048, 265038920);
		if (local5 == null) {
			return null;
		}
		@Pc(12) Class471 local12 = this.method24526();
		this.method24208(arg0, local5, local12, 172309093);
		@Pc(22) Class573 local22 = Class454.method29307(false, 1609015027);
		local5.method7359(local12, this.aClass246Array21[0], 0);
		if (this.aClass658_4 != null) {
			@Pc(37) Class221 local37 = this.aClass658_4.method33244();
			arg0.method20964(local37);
		}
		this.aBoolean652 = local5.method7395();
		local5.method7501();
		this.anInt3283 = local5.method7366() * -875757803;
		return local22;
	}

	@OriginalMember(owner = "client!aue", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.anInt3283 * 1956141117;
	}

	@OriginalMember(owner = "client!aue", name = "d", descriptor = "()V")
	public void method24220() {
		if (this.aClass658_4 != null) {
			this.aClass658_4.method33233();
		}
	}
}
