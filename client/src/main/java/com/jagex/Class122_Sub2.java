package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahv")
public final class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!ahv", name = "d", descriptor = "I")
	static final int anInt1198 = 0;

	@OriginalMember(owner = "client!ahv", name = "k", descriptor = "I")
	static final int anInt1199 = 2;

	@OriginalMember(owner = "client!ahv", name = "w", descriptor = "I")
	static final int anInt1200 = 4;

	@OriginalMember(owner = "client!ahv", name = "v", descriptor = "I")
	static final int anInt1201 = 3;

	@OriginalMember(owner = "client!ahv", name = "q", descriptor = "I")
	static final int anInt1202 = 6;

	@OriginalMember(owner = "client!ahv", name = "h", descriptor = "I")
	static final int anInt1203 = 7;

	@OriginalMember(owner = "client!ahv", name = "r", descriptor = "I")
	static final int anInt1204 = 5;

	@OriginalMember(owner = "client!ahv", name = "z", descriptor = "I")
	static final int anInt1205 = 1;

	@OriginalMember(owner = "client!ahv", name = "p", descriptor = "I")
	static final int anInt1206 = 2;

	@OriginalMember(owner = "client!ahv", name = "s", descriptor = "I")
	static final int anInt1207 = 1;

	@OriginalMember(owner = "client!ahv", name = "a", descriptor = "I")
	static final int anInt1208 = 0;

	@OriginalMember(owner = "client!ahv", name = "x", descriptor = "I")
	static final int anInt1209 = 3;

	@OriginalMember(owner = "client!ahv", name = "c", descriptor = "[I")
	int[] anIntArray110;

	@OriginalMember(owner = "client!ahv", name = "j", descriptor = "Lclient!hb;")
	Class113 aClass113_5;

	@OriginalMember(owner = "client!ahv", name = "y", descriptor = "[Lclient!ht;")
	final Class114[] aClass114Array5 = new Class114[3];

	@OriginalMember(owner = "client!ahv", name = "n", descriptor = "[[I")
	final int[][] anIntArrayArray18 = new int[3][7];

	@OriginalMember(owner = "client!ahv", name = "b", descriptor = "Lclient!ob;")
	Class456 aClass456_10 = new Class456(1.0F, 1.0F, 1.0F, 1.0F);

	@OriginalMember(owner = "client!ahv", name = "ax", descriptor = "Lclient!ob;")
	Class456 aClass456_11 = new Class456(0.0F, 0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!ahv", name = "t", descriptor = "(I)[Lclient!aaj;")
	static Class11[] method10324(@OriginalArg(0) int arg0) {
		return new Class11[] { Class11.aClass11_3, Class11.aClass11_2, Class11.aClass11_1 };
	}

	@OriginalMember(owner = "client!ahv", name = "ayf", descriptor = "(Lclient!yp;B)V")
	static void method10325(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class515.anInt5052 * -20451729;
	}

	@OriginalMember(owner = "client!ahv", name = "kn", descriptor = "(Lclient!he;Lclient!hx;I)V")
	public static void method10326(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class327 local4 = Class165_Sub45.method16896(arg0, arg1, -514653960);
		@Pc(11) int local11;
		@Pc(15) int local15;
		if (local4 == null) {
			local11 = Class80_Sub1_Sub1.anInt254 * -255202897;
			local15 = Class80_Sub25.anInt1627 * 167687103;
		} else {
			local11 = local4.anInt4103 * 1892149809;
			local15 = local4.anInt4104 * 1990157877;
		}
		Class541.method31170(arg1, local11, local15, false, -851056463);
		Class13.method353(arg1, local11, local15, (byte) -63);
	}

	@OriginalMember(owner = "client!ahv", name = "o", descriptor = "(II)V")
	public static void method10327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22078(1288580234);
	}

	@OriginalMember(owner = "client!ahv", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class122_Sub2(@OriginalArg(0) Class102_Sub1 arg0) throws Exception_Sub5 {
		super(arg0);
		this.method10317(-1708632409);
	}

	@OriginalMember(owner = "client!ahv", name = "e", descriptor = "()V")
	@Override
	public void method10313() {
		this.aClass113_5.method8295(this.aClass114Array5[1]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) 25)];
		this.aClass113_5.method8300(this.anIntArray110[2], 1, this.anInterface34_19, 1402791203);
		this.aClass113_5.method8286(this.anIntArray110[4], this.aClass487_49, 704545068);
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "g", descriptor = "()V")
	@Override
	public void method10312() {
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) -33)];
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "t", descriptor = "(II)V")
	@Override
	public void method10308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass456_10.method29336(arg1);
				this.aClass456_11.method29336(0);
				break;
			case 1:
				this.aClass456_10.method29336(-1);
				this.aClass456_11.method29336(0);
				break;
			case 2:
				this.aClass456_10.method29336(arg1);
				this.aClass456_11.method29336(0);
				break;
			case 3:
				this.aClass456_10.method29336(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass456_11.method29336(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass456_10.method29336(-1);
				this.aClass456_11.method29336(arg1);
				this.aClass456_11.method29341();
		}
	}

	@OriginalMember(owner = "client!ahv", name = "w", descriptor = "()Z")
	boolean method10316() throws Exception_Sub5 {
		this.aClass113_5 = this.aClass102_Sub1_18.method21142("Sprite");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_5.method8302("WVPMatrix", 2010947890);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_5.method8302("SpriteSampler", 2063975193);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_5.method8302("MaskSampler", 2114747546);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_5.method8302("MulColour", 2139986146);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_5.method8302("AddColour", 2136475090);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_5.method8302("SpriteTexCoordMatrix", 2061422661);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_5.method8302("MaskTexCoordMatrix", 2075573108);
		this.aClass114Array5[0] = this.aClass113_5.method8377("Normal", (byte) -62);
		this.aClass114Array5[1] = this.aClass113_5.method8377("Masked", (byte) 81);
		this.aClass114Array5[2] = this.aClass113_5.method8377("AlphaTex", (byte) 3);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass113_5.method8264(this.aClass114Array5[local76], 1755814974);
			this.anIntArrayArray18[local76][0] = local11.method23997(local88);
			this.anIntArrayArray18[local76][1] = local17.method23997(local88);
			this.anIntArrayArray18[local76][2] = local23.method23997(local88);
			this.anIntArrayArray18[local76][5] = local29.method23997(local88);
			this.anIntArrayArray18[local76][6] = local35.method23997(local88);
			this.anIntArrayArray18[local76][3] = local41.method23997(local88);
			this.anIntArrayArray18[local76][4] = local47.method23997(local88);
		}
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "f", descriptor = "()V")
	@Override
	public void method10309() {
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) 16)];
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "j", descriptor = "(I)Z")
	boolean method10317(@OriginalArg(0) int arg0) throws Exception_Sub5 {
		this.aClass113_5 = this.aClass102_Sub1_18.method21142("Sprite");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_5.method8302("WVPMatrix", 1973881131);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_5.method8302("SpriteSampler", 2027917575);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_5.method8302("MaskSampler", 2082068691);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_5.method8302("MulColour", 2102513649);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_5.method8302("AddColour", 1963225055);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_5.method8302("SpriteTexCoordMatrix", 2047442242);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_5.method8302("MaskTexCoordMatrix", 1954345679);
		this.aClass114Array5[0] = this.aClass113_5.method8377("Normal", (byte) 14);
		this.aClass114Array5[1] = this.aClass113_5.method8377("Masked", (byte) -103);
		this.aClass114Array5[2] = this.aClass113_5.method8377("AlphaTex", (byte) 47);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass113_5.method8264(this.aClass114Array5[local76], 1730892090);
			this.anIntArrayArray18[local76][0] = local11.method23997(local88);
			this.anIntArrayArray18[local76][1] = local17.method23997(local88);
			this.anIntArrayArray18[local76][2] = local23.method23997(local88);
			this.anIntArrayArray18[local76][5] = local29.method23997(local88);
			this.anIntArrayArray18[local76][6] = local35.method23997(local88);
			this.anIntArrayArray18[local76][3] = local41.method23997(local88);
			this.anIntArrayArray18[local76][4] = local47.method23997(local88);
		}
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "u", descriptor = "(II)V")
	@Override
	public void method10310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass456_10.method29336(arg1);
				this.aClass456_11.method29336(0);
				break;
			case 1:
				this.aClass456_10.method29336(-1);
				this.aClass456_11.method29336(0);
				break;
			case 2:
				this.aClass456_10.method29336(arg1);
				this.aClass456_11.method29336(0);
				break;
			case 3:
				this.aClass456_10.method29336(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass456_11.method29336(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass456_10.method29336(-1);
				this.aClass456_11.method29336(arg1);
				this.aClass456_11.method29341();
		}
	}

	@OriginalMember(owner = "client!ahv", name = "l", descriptor = "()V")
	@Override
	public void method10311() {
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) 25)];
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "s", descriptor = "()Z")
	boolean method10318() throws Exception_Sub5 {
		this.aClass113_5 = this.aClass102_Sub1_18.method21142("Sprite");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_5.method8302("WVPMatrix", 1980440627);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_5.method8302("SpriteSampler", 1945960397);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_5.method8302("MaskSampler", 2042250771);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_5.method8302("MulColour", 2135083014);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_5.method8302("AddColour", 1947939029);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_5.method8302("SpriteTexCoordMatrix", 2138642986);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_5.method8302("MaskTexCoordMatrix", 2011365822);
		this.aClass114Array5[0] = this.aClass113_5.method8377("Normal", (byte) -42);
		this.aClass114Array5[1] = this.aClass113_5.method8377("Masked", (byte) -99);
		this.aClass114Array5[2] = this.aClass113_5.method8377("AlphaTex", (byte) -7);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass113_5.method8264(this.aClass114Array5[local76], 1861551777);
			this.anIntArrayArray18[local76][0] = local11.method23997(local88);
			this.anIntArrayArray18[local76][1] = local17.method23997(local88);
			this.anIntArrayArray18[local76][2] = local23.method23997(local88);
			this.anIntArrayArray18[local76][5] = local29.method23997(local88);
			this.anIntArrayArray18[local76][6] = local35.method23997(local88);
			this.anIntArrayArray18[local76][3] = local41.method23997(local88);
			this.anIntArrayArray18[local76][4] = local47.method23997(local88);
		}
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "i", descriptor = "()V")
	@Override
	public void method10314() {
		this.aClass113_5.method8295(this.aClass114Array5[1]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) 18)];
		this.aClass113_5.method8300(this.anIntArray110[2], 1, this.anInterface34_19, 1402791203);
		this.aClass113_5.method8286(this.anIntArray110[4], this.aClass487_49, 704545068);
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "m", descriptor = "()V")
	@Override
	public void method10307() {
		this.aClass113_5.method8295(this.aClass114Array5[1]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) -108)];
		this.aClass113_5.method8300(this.anIntArray110[2], 1, this.anInterface34_19, 1402791203);
		this.aClass113_5.method8286(this.anIntArray110[4], this.aClass487_49, 704545068);
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "a", descriptor = "(B)V")
	void method10319(@OriginalArg(0) byte arg0) {
		this.aClass113_5.method8300(this.anIntArray110[1], 0, this.anInterface34_18, 1402791203);
		this.aClass102_Sub1_18.method21243(this.aClass487_50);
		this.aClass113_5.method8287(this.anIntArray110[0], this.aClass487_50, 1501703760);
		this.aClass113_5.method8286(this.anIntArray110[3], this.aClass487_48, 704545068);
		this.aClass113_5.method8282(this.anIntArray110[5], this.aClass456_10.aFloat294, this.aClass456_10.aFloat292, this.aClass456_10.aFloat291, this.aClass456_10.aFloat293, -1583611537);
		this.aClass113_5.method8282(this.anIntArray110[6], this.aClass456_11.aFloat294, this.aClass456_11.aFloat292, this.aClass456_11.aFloat291, this.aClass456_11.aFloat293, -1583611537);
		this.aClass102_Sub1_18.method21250(0, this.anInterface38_9);
		this.aClass102_Sub1_18.method21158(this.aClass135_10);
		this.aClass102_Sub1_18.method21257(Class415.aClass415_4, this.anInt1197, 2);
	}

	@OriginalMember(owner = "client!ahv", name = "k", descriptor = "()Z")
	boolean method10320() throws Exception_Sub5 {
		this.aClass113_5 = this.aClass102_Sub1_18.method21142("Sprite");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_5.method8302("WVPMatrix", 2084501931);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_5.method8302("SpriteSampler", 1985318878);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_5.method8302("MaskSampler", 2091790430);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_5.method8302("MulColour", 1942351808);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_5.method8302("AddColour", 1950260609);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_5.method8302("SpriteTexCoordMatrix", 2031762395);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_5.method8302("MaskTexCoordMatrix", 2132855381);
		this.aClass114Array5[0] = this.aClass113_5.method8377("Normal", (byte) 105);
		this.aClass114Array5[1] = this.aClass113_5.method8377("Masked", (byte) 63);
		this.aClass114Array5[2] = this.aClass113_5.method8377("AlphaTex", (byte) -80);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass113_5.method8264(this.aClass114Array5[local76], 1932421994);
			this.anIntArrayArray18[local76][0] = local11.method23997(local88);
			this.anIntArrayArray18[local76][1] = local17.method23997(local88);
			this.anIntArrayArray18[local76][2] = local23.method23997(local88);
			this.anIntArrayArray18[local76][5] = local29.method23997(local88);
			this.anIntArrayArray18[local76][6] = local35.method23997(local88);
			this.anIntArrayArray18[local76][3] = local41.method23997(local88);
			this.anIntArrayArray18[local76][4] = local47.method23997(local88);
		}
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "x", descriptor = "()Z")
	boolean method10321() throws Exception_Sub5 {
		this.aClass113_5 = this.aClass102_Sub1_18.method21142("Sprite");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_5.method8302("WVPMatrix", 1998680469);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_5.method8302("SpriteSampler", 2060667772);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_5.method8302("MaskSampler", 1980434364);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_5.method8302("MulColour", 2103124010);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_5.method8302("AddColour", 2075141333);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_5.method8302("SpriteTexCoordMatrix", 2049208347);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_5.method8302("MaskTexCoordMatrix", 1965955830);
		this.aClass114Array5[0] = this.aClass113_5.method8377("Normal", (byte) -39);
		this.aClass114Array5[1] = this.aClass113_5.method8377("Masked", (byte) 85);
		this.aClass114Array5[2] = this.aClass113_5.method8377("AlphaTex", (byte) 64);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass113_5.method8264(this.aClass114Array5[local76], 2101938172);
			this.anIntArrayArray18[local76][0] = local11.method23997(local88);
			this.anIntArrayArray18[local76][1] = local17.method23997(local88);
			this.anIntArrayArray18[local76][2] = local23.method23997(local88);
			this.anIntArrayArray18[local76][5] = local29.method23997(local88);
			this.anIntArrayArray18[local76][6] = local35.method23997(local88);
			this.anIntArrayArray18[local76][3] = local41.method23997(local88);
			this.anIntArrayArray18[local76][4] = local47.method23997(local88);
		}
		this.aClass113_5.method8295(this.aClass114Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "o", descriptor = "()V")
	@Override
	public void method10315() {
		this.aClass113_5.method8295(this.aClass114Array5[1]);
		this.aClass113_5.method8256();
		this.anIntArray110 = this.anIntArrayArray18[this.aClass113_5.method8355((byte) 42)];
		this.aClass113_5.method8300(this.anIntArray110[2], 1, this.anInterface34_19, 1402791203);
		this.aClass113_5.method8286(this.anIntArray110[4], this.aClass487_49, 704545068);
		this.method10319((byte) 1);
	}

	@OriginalMember(owner = "client!ahv", name = "r", descriptor = "()V")
	void method10322() {
		this.aClass113_5.method8300(this.anIntArray110[1], 0, this.anInterface34_18, 1402791203);
		this.aClass102_Sub1_18.method21243(this.aClass487_50);
		this.aClass113_5.method8287(this.anIntArray110[0], this.aClass487_50, 1006800912);
		this.aClass113_5.method8286(this.anIntArray110[3], this.aClass487_48, 704545068);
		this.aClass113_5.method8282(this.anIntArray110[5], this.aClass456_10.aFloat294, this.aClass456_10.aFloat292, this.aClass456_10.aFloat291, this.aClass456_10.aFloat293, -1583611537);
		this.aClass113_5.method8282(this.anIntArray110[6], this.aClass456_11.aFloat294, this.aClass456_11.aFloat292, this.aClass456_11.aFloat291, this.aClass456_11.aFloat293, -1583611537);
		this.aClass102_Sub1_18.method21250(0, this.anInterface38_9);
		this.aClass102_Sub1_18.method21158(this.aClass135_10);
		this.aClass102_Sub1_18.method21257(Class415.aClass415_4, this.anInt1197, 2);
	}

	@OriginalMember(owner = "client!ahv", name = "q", descriptor = "()V")
	void method10323() {
		this.aClass113_5.method8300(this.anIntArray110[1], 0, this.anInterface34_18, 1402791203);
		this.aClass102_Sub1_18.method21243(this.aClass487_50);
		this.aClass113_5.method8287(this.anIntArray110[0], this.aClass487_50, 1987020048);
		this.aClass113_5.method8286(this.anIntArray110[3], this.aClass487_48, 704545068);
		this.aClass113_5.method8282(this.anIntArray110[5], this.aClass456_10.aFloat294, this.aClass456_10.aFloat292, this.aClass456_10.aFloat291, this.aClass456_10.aFloat293, -1583611537);
		this.aClass113_5.method8282(this.anIntArray110[6], this.aClass456_11.aFloat294, this.aClass456_11.aFloat292, this.aClass456_11.aFloat291, this.aClass456_11.aFloat293, -1583611537);
		this.aClass102_Sub1_18.method21250(0, this.anInterface38_9);
		this.aClass102_Sub1_18.method21158(this.aClass135_10);
		this.aClass102_Sub1_18.method21257(Class415.aClass415_4, this.anInt1197, 2);
	}
}
