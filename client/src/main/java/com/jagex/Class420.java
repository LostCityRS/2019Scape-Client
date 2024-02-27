package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class420 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!mj;")
	Class420 aClass420_1;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!ma;")
	Interface39 anInterface39_1;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "F")
	float aFloat298;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
	float aFloat295;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "F")
	float aFloat296;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "F")
	float aFloat297;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "J")
	long aLong276;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "J")
	long aLong277;

	@OriginalMember(owner = "client!mj", name = "cr", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method28919(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4034 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -999742057;
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class39.method770(arg0.anInt3994 * -1549590237, (short) 20077);
		}
	}

	@OriginalMember(owner = "client!mj", name = "kz", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method28920(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aStringArray27 = null;
	}

	@OriginalMember(owner = "client!mj", name = "ti", descriptor = "(Lclient!hf;IIFIIIIIIB)V")
	static void method28921(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10) {
		if (arg0.aClass331_2 == null) {
			@Pc(11) Class336 local11 = (Class336) Class162.aClass32_Sub3_2.method18273(arg0.anInt4078 * 371778301, 1660075289);
			arg0.aClass331_2 = new Class331(local11, true);
		}
		arg0.aClass331_2.aLong259 = Class388.method28430((byte) 127) * 6591543353939106377L;
		arg0.aClass331_2.method27467(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, (byte) 4);
	}

	@OriginalMember(owner = "client!mj", name = "ahs", descriptor = "(Lclient!yf;I)V")
	static void method28922(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(15) Class175 local15 = Class330.method27465(-1652783239);
		@Pc(21) Class93_Sub22 local21 = Class102.method2592(Class446.aClass446_46, local15.aClass24_2, (byte) 93);
		local21.aClass93_Sub41_Sub2_1.method22522(local12, (byte) -27);
		local15.method24363(local21, -2010054592);
	}

	@OriginalMember(owner = "client!mj", name = "amf", descriptor = "(Lclient!yf;I)V")
	static void method28923(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class454.anInt5217 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] * -1137573677;
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(Lclient!arn;I)V")
	static void method28924(@OriginalArg(0) Class93_Sub1_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		arg0.method23988((short) 1097);
		for (@Pc(9) Class93_Sub1_Sub8 local9 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(-1025661837); local9 != null; local9 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253(1110350297)) {
			if (Class19_Sub3.method17567(arg0.method21731(2140014573), local9.method21731(-2000658221), 1385938362)) {
				Class658.method32971(arg0, local9, 2131854032);
				local1 = true;
				break;
			}
		}
		if (!local1) {
			Class454.aClass18_16.method268(arg0, -52933526);
		}
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)[Lclient!ql;")
	public static Class509[] method28925(@OriginalArg(0) int arg0) {
		return new Class509[] { Class509.aClass509_1, Class509.aClass509_3, Class509.aClass509_2 };
	}

	@OriginalMember(owner = "client!mj", name = "jr", descriptor = "(Lclient!hf;B)V")
	static void method28926(@OriginalArg(0) Class312 arg0, @OriginalArg(1) byte arg1) {
		if (!client.aBoolean627) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(14) Class312 local14 = Class124_Sub2.method9308(Class148.anInt1394 * -278883695, client.anInt3523 * 1573685689, (byte) -105);
			if (local14 != null) {
				@Pc(21) Class93_Sub39 local21 = new Class93_Sub39();
				local21.aClass312_1 = arg0;
				local21.aClass312_2 = local14;
				local21.anObjectArray4 = arg0.anObjectArray7;
				Class211.method25522(local21, 37610278);
			}
		}
		@Pc(40) Class93_Sub22 local40 = Class102.method2592(Class446.aClass446_60, client.aClass175_2.aClass24_2, (byte) 90);
		local40.aClass93_Sub41_Sub2_1.method22477(arg0.anInt3994 * -1549590237, 907143239);
		local40.aClass93_Sub41_Sub2_1.method22466(arg0.anInt4086 * 307668159, 2134260399);
		local40.aClass93_Sub41_Sub2_1.method22470(client.anInt3524 * -239149331, -1850331297);
		local40.aClass93_Sub41_Sub2_1.method22470(arg0.anInt4011 * 532402067, -1666236355);
		local40.aClass93_Sub41_Sub2_1.method22470(client.anInt3523 * 1573685689, -1922842379);
		local40.aClass93_Sub41_Sub2_1.method22477(Class148.anInt1394 * -278883695, 907143239);
		client.aClass175_2.method24363(local40, -1894315664);
	}

	@OriginalMember(owner = "client!mj", name = "avy", descriptor = "(Lclient!yf;I)V")
	static void method28927(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IFLjava/lang/Object;Lclient!mb;Lclient!ma;Lclient!mj;)V")
	Class420(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) Class412 arg3, @OriginalArg(4) Interface39 arg4, @OriginalArg(5) Class420 arg5) {
		this.aClass420_1 = arg5;
		this.anInterface39_1 = arg4;
		this.aFloat298 = 1.0F;
		this.aFloat295 = arg1;
		this.aFloat296 = -1.0F;
		this.aFloat297 = -1.0F;
		this.aLong276 = -4369100113735516591L;
		this.aLong277 = 8177889579898841287L;
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "(FI)V")
	public void method28897(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface39_1 == null) {
			this.aFloat297 = arg0;
			this.aFloat296 = this.aFloat298;
			this.aLong276 = Class305.method26889(2072934304) * 4369100113735516591L;
			this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(F)V")
	public void method28898(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat297 = arg0;
			this.aFloat296 = this.aFloat298;
			this.aLong276 = Class305.method26889(1956192130) * 4369100113735516591L;
			this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)F")
	public float method28899(@OriginalArg(0) int arg0) {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28904(-225665097)) {
			local1 *= local3.method28906(1811768599);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V")
	void method28900(@OriginalArg(0) int arg0) {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26438(-668766199);
			if (local7 != this.aFloat298 && this.aFloat297 < 0.0F) {
				this.aFloat296 = this.aFloat298;
				this.aFloat297 = local7;
				this.aLong276 = Class305.method26889(1393668606) * 4369100113735516591L;
				this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat297 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26889(1537009655);
			if (local46 > this.aLong277 * -8234214018386827511L) {
				this.aFloat298 = this.aFloat297;
				this.aFloat297 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat297 - this.aFloat296;
				@Pc(77) long local77 = this.aLong277 * -8234214018386827511L - this.aLong276 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat298 = this.aFloat296 + local82 * (float) (local46 - this.aLong276 * -7055091242193193649L);
				if (this.aFloat297 == this.aFloat298) {
					this.aFloat297 = -1.0F;
				}
			}
		}
		this.aFloat298 = Math.min(1.0F, Math.max(this.aFloat298, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)F")
	public float method28901(@OriginalArg(0) byte arg0) {
		@Pc(2) float local2 = this.aFloat298;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28904(301931772)) {
			local2 *= local5.method28902(-2146128389);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)F")
	public float method28902(@OriginalArg(0) int arg0) {
		return this.aFloat298;
	}

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "()F")
	public float method28903() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28904(-175844491)) {
			local1 *= local3.method28906(-1881490739);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)Lclient!mj;")
	public Class420 method28904(@OriginalArg(0) int arg0) {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "()F")
	public float method28905() {
		return this.aFloat298;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)F")
	float method28906(@OriginalArg(0) int arg0) {
		return this.aFloat295;
	}

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "()V")
	void method28907() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26438(-668766199);
			if (local7 != this.aFloat298 && this.aFloat297 < 0.0F) {
				this.aFloat296 = this.aFloat298;
				this.aFloat297 = local7;
				this.aLong276 = Class305.method26889(1468855489) * 4369100113735516591L;
				this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat297 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26889(669632225);
			if (local46 > this.aLong277 * -8234214018386827511L) {
				this.aFloat298 = this.aFloat297;
				this.aFloat297 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat297 - this.aFloat296;
				@Pc(77) long local77 = this.aLong277 * -8234214018386827511L - this.aLong276 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat298 = this.aFloat296 + local82 * (float) (local46 - this.aLong276 * -7055091242193193649L);
				if (this.aFloat297 == this.aFloat298) {
					this.aFloat297 = -1.0F;
				}
			}
		}
		this.aFloat298 = Math.min(1.0F, Math.max(this.aFloat298, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()V")
	void method28908() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26438(-668766199);
			if (local7 != this.aFloat298 && this.aFloat297 < 0.0F) {
				this.aFloat296 = this.aFloat298;
				this.aFloat297 = local7;
				this.aLong276 = Class305.method26889(623687549) * 4369100113735516591L;
				this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat297 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26889(-410144119);
			if (local46 > this.aLong277 * -8234214018386827511L) {
				this.aFloat298 = this.aFloat297;
				this.aFloat297 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat297 - this.aFloat296;
				@Pc(77) long local77 = this.aLong277 * -8234214018386827511L - this.aLong276 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat298 = this.aFloat296 + local82 * (float) (local46 - this.aLong276 * -7055091242193193649L);
				if (this.aFloat297 == this.aFloat298) {
					this.aFloat297 = -1.0F;
				}
			}
		}
		this.aFloat298 = Math.min(1.0F, Math.max(this.aFloat298, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()F")
	public float method28909() {
		@Pc(2) float local2 = this.aFloat298;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28904(-302931422)) {
			local2 *= local5.method28902(-2146043773);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "()F")
	public float method28910() {
		@Pc(2) float local2 = this.aFloat298;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28904(920305939)) {
			local2 *= local5.method28902(-2145347027);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "()F")
	public float method28911() {
		@Pc(2) float local2 = this.aFloat298;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28904(1264919152)) {
			local2 *= local5.method28902(-2146825825);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()F")
	public float method28912() {
		@Pc(2) float local2 = this.aFloat298;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28904(-1391428381)) {
			local2 *= local5.method28902(-2146865528);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(F)V")
	public void method28913(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat297 = arg0;
			this.aFloat296 = this.aFloat298;
			this.aLong276 = Class305.method26889(1807958343) * 4369100113735516591L;
			this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "()F")
	public float method28914() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28904(-1728179325)) {
			local1 *= local3.method28906(-798688961);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()Lclient!mj;")
	public Class420 method28915() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()Lclient!mj;")
	public Class420 method28916() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()Lclient!mj;")
	public Class420 method28917() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "(F)V")
	public void method28918(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat297 = arg0;
			this.aFloat296 = this.aFloat298;
			this.aLong276 = Class305.method26889(-174390281) * 4369100113735516591L;
			this.aLong277 = this.aLong276 * -3919147337030305897L + -6132218746663857596L;
		}
	}
}
