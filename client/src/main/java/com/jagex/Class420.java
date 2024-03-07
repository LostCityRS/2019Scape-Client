package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public class Class420 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!mj;")
	Class420 aClass420_1;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!ma;")
	Interface39 anInterface39_1;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "F")
	float aFloat290;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
	float aFloat287;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "F")
	float aFloat288;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "F")
	float aFloat289;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "J")
	long aLong273;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "J")
	long aLong274;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)[Lclient!ql;", line = 14)
	public static Class509[] method28716(@OriginalArg(0) int arg0) {
		return new Class509[] { Class509.aClass509_1, Class509.aClass509_3, Class509.aClass509_2 };
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IFLjava/lang/Object;Lclient!mb;Lclient!ma;Lclient!mj;)V", line = 15)
	Class420(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) Class412 arg3, @OriginalArg(4) Interface39 arg4, @OriginalArg(5) Class420 arg5) {
		this.aClass420_1 = arg5;
		this.anInterface39_1 = arg4;
		this.aFloat290 = 1.0F;
		this.aFloat287 = arg1;
		this.aFloat288 = -1.0F;
		this.aFloat289 = -1.0F;
		this.aLong273 = -4369100113735516591L;
		this.aLong274 = 8177889579898841287L;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)F", line = 27)
	float method28717(@OriginalArg(0) int arg0) {
		return this.aFloat287;
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)F", line = 31)
	public float method28718(@OriginalArg(0) int arg0) {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28735(-225665097)) {
			local1 *= local3.method28717(1811768599);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "()F", line = 31)
	public float method28719() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28735(-175844491)) {
			local1 *= local3.method28717(-1881490739);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "()F", line = 31)
	public float method28720() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28735(-1728179325)) {
			local1 *= local3.method28717(-798688961);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V", line = 41)
	void method28721(@OriginalArg(0) int arg0) {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26345(-668766199);
			if (local7 != this.aFloat290 && this.aFloat289 < 0.0F) {
				this.aFloat288 = this.aFloat290;
				this.aFloat289 = local7;
				this.aLong273 = Class305.method26797(1393668606) * 4369100113735516591L;
				this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat289 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26797(1537009655);
			if (local46 > this.aLong274 * -8234214018386827511L) {
				this.aFloat290 = this.aFloat289;
				this.aFloat289 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat289 - this.aFloat288;
				@Pc(77) long local77 = this.aLong274 * -8234214018386827511L - this.aLong273 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat290 = this.aFloat288 + local82 * (float) (local46 - this.aLong273 * -7055091242193193649L);
				if (this.aFloat289 == this.aFloat290) {
					this.aFloat289 = -1.0F;
				}
			}
		}
		this.aFloat290 = Math.min(1.0F, Math.max(this.aFloat290, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "()V", line = 41)
	void method28722() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26345(-668766199);
			if (local7 != this.aFloat290 && this.aFloat289 < 0.0F) {
				this.aFloat288 = this.aFloat290;
				this.aFloat289 = local7;
				this.aLong273 = Class305.method26797(1468855489) * 4369100113735516591L;
				this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat289 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26797(669632225);
			if (local46 > this.aLong274 * -8234214018386827511L) {
				this.aFloat290 = this.aFloat289;
				this.aFloat289 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat289 - this.aFloat288;
				@Pc(77) long local77 = this.aLong274 * -8234214018386827511L - this.aLong273 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat290 = this.aFloat288 + local82 * (float) (local46 - this.aLong273 * -7055091242193193649L);
				if (this.aFloat289 == this.aFloat290) {
					this.aFloat289 = -1.0F;
				}
			}
		}
		this.aFloat290 = Math.min(1.0F, Math.max(this.aFloat290, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()V", line = 41)
	void method28723() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26345(-668766199);
			if (local7 != this.aFloat290 && this.aFloat289 < 0.0F) {
				this.aFloat288 = this.aFloat290;
				this.aFloat289 = local7;
				this.aLong273 = Class305.method26797(623687549) * 4369100113735516591L;
				this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat289 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26797(-410144119);
			if (local46 > this.aLong274 * -8234214018386827511L) {
				this.aFloat290 = this.aFloat289;
				this.aFloat289 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat289 - this.aFloat288;
				@Pc(77) long local77 = this.aLong274 * -8234214018386827511L - this.aLong273 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat290 = this.aFloat288 + local82 * (float) (local46 - this.aLong273 * -7055091242193193649L);
				if (this.aFloat289 == this.aFloat290) {
					this.aFloat289 = -1.0F;
				}
			}
		}
		this.aFloat290 = Math.min(1.0F, Math.max(this.aFloat290, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)F", line = 70)
	public float method28724(@OriginalArg(0) byte arg0) {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28735(301931772)) {
			local2 *= local5.method28729(-2146128389);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()F", line = 70)
	public float method28725() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28735(-302931422)) {
			local2 *= local5.method28729(-2146043773);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "()F", line = 70)
	public float method28726() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28735(920305939)) {
			local2 *= local5.method28729(-2145347027);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "()F", line = 70)
	public float method28727() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28735(1264919152)) {
			local2 *= local5.method28729(-2146825825);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()F", line = 70)
	public float method28728() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28735(-1391428381)) {
			local2 *= local5.method28729(-2146865528);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)F", line = 81)
	public float method28729(@OriginalArg(0) int arg0) {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "()F", line = 81)
	public float method28730() {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "(FI)V", line = 85)
	public void method28731(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26797(2072934304) * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(F)V", line = 85)
	public void method28732(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26797(1956192130) * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(F)V", line = 85)
	public void method28733(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26797(1807958343) * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "(F)V", line = 85)
	public void method28734(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26797(-174390281) * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)Lclient!mj;", line = 94)
	public Class420 method28735(@OriginalArg(0) int arg0) {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()Lclient!mj;", line = 94)
	public Class420 method28736() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()Lclient!mj;", line = 94)
	public Class420 method28737() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()Lclient!mj;", line = 94)
	public Class420 method28738() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(Lclient!arn;I)V", line = 521)
	static void method28739(@OriginalArg(0) Class93_Sub1_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		arg0.method23976((short) 1097);
		for (@Pc(9) Class93_Sub1_Sub8 local9 = (Class93_Sub1_Sub8) Class454.aClass18_16.method256(-1025661837); local9 != null; local9 = (Class93_Sub1_Sub8) Class454.aClass18_16.method264(1110350297)) {
			if (Class19_Sub3.method17555(arg0.method21716(2140014573), local9.method21716(-2000658221), 1385938362)) {
				Class658.method32758(arg0, local9, 2131854032);
				local1 = true;
				break;
			}
		}
		if (!local1) {
			Class454.aClass18_16.method250(arg0, -52933526);
		}
	}

	@OriginalMember(owner = "client!mj", name = "cr", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5401)
	static final void method28740(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt3993 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -999742057;
		Class354.method27694(arg0, -1174743804);
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class39.method769(arg0.anInt3953 * -1549590237, (short) 20077);
		}
	}

	@OriginalMember(owner = "client!mj", name = "kz", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 6745)
	static final void method28741(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aStringArray23 = null;
	}

	@OriginalMember(owner = "client!mj", name = "ti", descriptor = "(Lclient!hf;IIFIIIIIIB)V", line = 8386)
	static void method28742(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10) {
		if (arg0.aClass331_2 == null) {
			@Pc(11) Class336 local11 = (Class336) Class162.aClass32_Sub3_2.method18261(arg0.anInt4037 * 371778301, 1660075289);
			arg0.aClass331_2 = new Class331(local11, true);
		}
		arg0.aClass331_2.aLong259 = Class388.method28251((byte) 127) * 6591543353939106377L;
		arg0.aClass331_2.method27375(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, (byte) 4);
	}

	@OriginalMember(owner = "client!mj", name = "jr", descriptor = "(Lclient!hf;B)V", line = 10185)
	static void method28743(@OriginalArg(0) Class312 arg0, @OriginalArg(1) byte arg1) {
		if (!client.aBoolean625) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(14) Class312 local14 = Class124_Sub2.method9308(Class148.anInt1394 * -278883695, client.anInt3523 * 1573685689, (byte) -105);
			if (local14 != null) {
				@Pc(21) Class93_Sub39 local21 = new Class93_Sub39();
				local21.aClass312_1 = arg0;
				local21.aClass312_2 = local14;
				local21.anObjectArray4 = arg0.anObjectArray7;
				Class211.method25429(local21, 37610278);
			}
		}
		@Pc(40) ClientMessage local40 = Class102.createGameMessage(ClientProt.aClientProt_60, client.aClass175_2.clientIsaac, (byte) 90);
		local40.packet.p4_alt1(arg0.anInt3953 * -1549590237, 907143239);
		local40.packet.p2(arg0.anInt4045 * 307668159, 2134260399);
		local40.packet.p2_alt2(client.anInt3524 * -239149331, -1850331297);
		local40.packet.p2_alt2(arg0.anInt3970 * 532402067, -1666236355);
		local40.packet.p2_alt2(client.anInt3523 * 1573685689, -1922842379);
		local40.packet.p4_alt1(Class148.anInt1394 * -278883695, 907143239);
		client.aClass175_2.send(local40, -1894315664);
	}

	@OriginalMember(owner = "client!mj", name = "ahs", descriptor = "(Lclient!yf;I)V", line = 11015)
	static final void method28744(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class175 local15 = Class330.method27371(-1652783239);
		@Pc(21) ClientMessage local21 = Class102.createGameMessage(ClientProt.aClientProt_46, local15.clientIsaac, (byte) 93);
		local21.packet.p1(local12, (byte) -27);
		local15.send(local21, -2010054592);
	}

	@OriginalMember(owner = "client!mj", name = "amf", descriptor = "(Lclient!yf;I)V", line = 12075)
	static final void method28745(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class454.anInt5056 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] * -1137573677;
	}

	@OriginalMember(owner = "client!mj", name = "avy", descriptor = "(Lclient!yf;I)V", line = 13493)
	static final void method28746(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
