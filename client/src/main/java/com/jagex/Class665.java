package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xm")
public final class Class665 {

	@OriginalMember(owner = "client!xm", name = "f", descriptor = "Lclient!df;")
	static Class106 aClass106_2;

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "Lclient!sg;")
	static Class549 aClass549_3;

	@OriginalMember(owner = "client!xm", name = "t", descriptor = "I")
	public static int anInt5693 = -943999895;

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "I")
	static int anInt5695 = 1173238381;

	@OriginalMember(owner = "client!xm", name = "ax", descriptor = "F")
	float aFloat350;

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "Lclient!xb;")
	Class655 aClass655_5;

	@OriginalMember(owner = "client!xm", name = "r", descriptor = "Lclient!yh;")
	Class683 aClass683_1;

	@OriginalMember(owner = "client!xm", name = "ay", descriptor = "F")
	float aFloat351;

	@OriginalMember(owner = "client!xm", name = "b", descriptor = "F")
	float aFloat352;

	@OriginalMember(owner = "client!xm", name = "ai", descriptor = "F")
	float aFloat353;

	@OriginalMember(owner = "client!xm", name = "aq", descriptor = "F")
	float aFloat354;

	@OriginalMember(owner = "client!xm", name = "i", descriptor = "I")
	int anInt5694 = 0;

	@OriginalMember(owner = "client!xm", name = "m", descriptor = "I")
	int anInt5696 = -557541677;

	@OriginalMember(owner = "client!xm", name = "o", descriptor = "J")
	long aLong410 = 0L;

	@OriginalMember(owner = "client!xm", name = "j", descriptor = "Z")
	boolean aBoolean976 = false;

	@OriginalMember(owner = "client!xm", name = "q", descriptor = "Lclient!on;")
	final Class463 aClass463_65 = new Class463(-50.0F, -60.0F, -50.0F);

	@OriginalMember(owner = "client!xm", name = "h", descriptor = "Lclient!ej;")
	final Class243 aClass243_91 = new Class243(8);

	@OriginalMember(owner = "client!xm", name = "d", descriptor = "Lclient!ej;")
	final Class243 aClass243_93 = new Class243(9);

	@OriginalMember(owner = "client!xm", name = "z", descriptor = "Lclient!ej;")
	final Class243 aClass243_92 = new Class243(8);

	@OriginalMember(owner = "client!xm", name = "v", descriptor = "Z")
	boolean aBoolean977 = false;

	@OriginalMember(owner = "client!xm", name = "y", descriptor = "[I")
	int[] anIntArray516 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xm", name = "n", descriptor = "[F")
	float[] aFloatArray121 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "Z")
	boolean aBoolean978 = false;

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "Lclient!di;")
	final Class102 aClass102_14;

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "Lclient!pf;")
	final Class480 aClass480_133;

	@OriginalMember(owner = "client!xm", name = "g", descriptor = "[[Lclient!xb;")
	final Class655[][] aClass655ArrayArray1;

	@OriginalMember(owner = "client!xm", name = "a", descriptor = "Lclient!xb;")
	final Class655 aClass655_2;

	@OriginalMember(owner = "client!xm", name = "s", descriptor = "Lclient!xb;")
	final Class655 aClass655_1;

	@OriginalMember(owner = "client!xm", name = "k", descriptor = "Lclient!xb;")
	final Class655 aClass655_3;

	@OriginalMember(owner = "client!xm", name = "x", descriptor = "Lclient!xb;")
	final Class655 aClass655_4;

	@OriginalMember(owner = "client!xm", name = "bl", descriptor = "(Lclient!arz;B)Ljava/lang/String;")
	static String method33451(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aString107 == null || arg0.aString107.length() == 0) {
			return arg0.aString105 == null || arg0.aString105.length() <= 0 ? arg0.aString106 : arg0.aString106 + Class60.aClass60_141.method1180(Class512.aClass719_3, -282242975) + arg0.aString105;
		} else if (arg0.aString105 == null || arg0.aString105.length() <= 0) {
			return arg0.aString106 + Class60.aClass60_141.method1180(Class512.aClass719_3, 1178525147) + arg0.aString107;
		} else {
			return arg0.aString106 + Class60.aClass60_141.method1180(Class512.aClass719_3, 37818722) + arg0.aString105 + Class60.aClass60_141.method1180(Class512.aClass719_3, -428527577) + arg0.aString107;
		}
	}

	@OriginalMember(owner = "client!xm", name = "qf", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method33452(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1985047319) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray31 = Class431.method29089(local13, arg2, 834662842);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!xm", name = "bct", descriptor = "(Lclient!yp;I)V")
	static void method33453(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class267.method26665(arg0.aClass120_Sub1_Sub5_Sub1_1, arg0, 156091693);
	}

	@OriginalMember(owner = "client!xm", name = "kg", descriptor = "(IIILjava/lang/String;I)V")
	public static void method33454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class327 local4 = Class369.method28340(arg1, arg2, 1949318259);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray26 != null) {
			@Pc(15) Class80_Sub42 local15 = new Class80_Sub42();
			local15.aClass327_3 = local4;
			local15.anInt2053 = arg0 * -902112633;
			local15.aString60 = arg3;
			local15.anObjectArray4 = local4.anObjectArray26;
			Class279.method26847(local15, 1168555807);
		}
		if (!client.method25326(local4).method14313(arg0 - 1, (byte) 6)) {
			return;
		}
		@Pc(45) Class75 local45 = Class52.method1074(16777215);
		if (client.anInt3433 * 1994758437 != 13 && client.anInt3433 * 1994758437 != 18 && client.anInt3433 * 1994758437 != 0) {
			return;
		}
		if (local4.aString187 == null || local4.aClass322_7 == null) {
			Class134.method10453(local45, local4, arg0, arg1, arg2, (byte) 38);
			return;
		}
		@Pc(75) Class80_Sub31 local75 = Class623.method32440(Class443.aClass443_105, local45.aClass22_1, -191270971);
		local75.aPacketBit_2.p1(Class350.method28013(local4.aString187, (short) 16383) + 7 + 1);
		local75.aPacketBit_2.p1_alt3(arg0);
		local75.aPacketBit_2.p4_alt1(arg1);
		local75.aPacketBit_2.p1(local4.aClass322_7.getId());
		local75.aPacketBit_2.pjstr(local4.aString187);
		local75.aPacketBit_2.p2_alt1(arg2);
		local45.method1325(local75, (byte) -112);
	}

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "(I)I")
	public static int method33455(@OriginalArg(0) int arg0) {
		@Pc(2) Class72_Sub1 local2 = Class533.method30828((byte) 92);
		Class490.method30242(local2, 1896589581);
		return local2.method15572((byte) 0);
	}

	@OriginalMember(owner = "client!xm", name = "<init>", descriptor = "(Lclient!di;Lclient!pf;II)V")
	public Class665(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass102_14 = arg0;
		this.aClass480_133 = arg1;
		this.aClass655ArrayArray1 = new Class655[arg2][arg3];
		if (anInt5693 * -659889113 != -1) {
			aClass106_2 = this.method33373(anInt5693 * -659889113, (byte) -27);
		}
		aClass549_3 = null;
		this.aClass655_2 = new Class655();
		this.aClass655_1 = new Class655();
		this.aClass655_3 = new Class655();
		this.aClass655_4 = new Class655();
		this.method33382(-302418126);
		this.method33408(-796768640);
		this.method33391(522612706);
	}

	@OriginalMember(owner = "client!xm", name = "bh", descriptor = "()V")
	void method33365() {
		if (this.anInt5696 * -197144923 < 0) {
			return;
		}
		@Pc(7) long local7 = Class303.currentTimeMillis((byte) 80);
		this.anInt5696 = (int) ((long) this.anInt5696 - (local7 - this.aLong410 * 5338907152258984957L) * 557541677L);
		if (this.anInt5696 * -197144923 > 0) {
			this.aClass655_1.method33196(this.aClass102_14, this.aClass655_3, this.aClass655_4, (float) (this.anInt5694 * 1181116139 - this.anInt5696 * -197144923) / (float) (this.anInt5694 * 1181116139), 1105241497);
		} else {
			this.aClass655_1.method33199(this.aClass655_4, (byte) 4);
			if (this.aClass655_1.aClass549_2 != null) {
				this.aClass655_1.aClass549_2.method31274((byte) 35);
			}
			this.anInt5696 = -557541677;
		}
		this.aLong410 = local7 * -4780949853486888619L;
	}

	@OriginalMember(owner = "client!xm", name = "t", descriptor = "(Lclient!rw;B)V")
	public void method33366(@OriginalArg(0) Class539 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -2), (byte) 1);
		}
		this.method33381((byte) -64);
		this.method33383((byte) -113);
		this.method33401(-1987394423);
	}

	@OriginalMember(owner = "client!xm", name = "f", descriptor = "(Lclient!rw;B)V")
	public void method33367(@OriginalArg(0) Class539 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -119), (byte) 1);
		}
		this.method33381((byte) -96);
		this.method33407((byte) 1);
		this.method33449((byte) 42);
		this.method33388(-1257120057);
	}

	@OriginalMember(owner = "client!xm", name = "bm", descriptor = "()V")
	void method33368() {
		this.aClass102_14.method20785(this.aClass655_1.aFloat348, this.aClass655_1.aFloat343, this.aClass655_1.aFloat344, 821951909);
	}

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "(I)Lclient!yh;")
	public Class683 method33369(@OriginalArg(0) int arg0) {
		return this.aClass683_1;
	}

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "(I)Lclient!xb;")
	public Class655 method33370(@OriginalArg(0) int arg0) {
		return this.aClass655_1;
	}

	@OriginalMember(owner = "client!xm", name = "g", descriptor = "(Lclient!xm;I)V")
	public void method33371(@OriginalArg(0) Class665 arg0, @OriginalArg(1) int arg1) {
		this.aClass655_1.method33199(arg0.aClass655_1, (byte) 4);
		this.aClass655_3.method33199(arg0.aClass655_3, (byte) 4);
		this.aClass655_4.method33199(arg0.aClass655_4, (byte) 4);
		this.aLong410 = arg0.aLong410;
		this.anInt5694 = arg0.anInt5694;
		this.anInt5696 = arg0.anInt5696;
	}

	@OriginalMember(owner = "client!xm", name = "ah", descriptor = "()V")
	public void method33372() {
		this.aClass243_91.method26256(1693912082);
		this.aClass243_93.method26256(1693912082);
		this.aClass243_92.method26256(1693912082);
	}

	@OriginalMember(owner = "client!xm", name = "m", descriptor = "(IB)Lclient!df;")
	Class106 method33373(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class106 local6 = (Class106) this.aClass243_91.method26282((long) arg0);
		if (local6 == null) {
			local6 = this.aClass102_14.method20771(arg0);
			this.aClass243_91.method26253(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xm", name = "o", descriptor = "(IIIII)Lclient!sg;")
	Class549 method33374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class549 local31 = (Class549) this.aClass243_93.method26282(local25);
		if (local31 == null) {
			local31 = Class43.method931(arg0, arg1, arg2, arg3, Class621.aClass41_Sub7_1, Class289.aClass41_Sub8_1, 641042437);
			this.aClass243_93.method26253(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!xm", name = "bi", descriptor = "()V")
	public void method33375() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass655_1.anInt5675 * -544222125 + 256 << 2) + local1;
		this.aClass102_14.method20767(this.aClass655_1.anInt5674 * -922605081, Class703.aClass80_Sub37_49.aClass165_Sub9_1.method15996((byte) -7) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xm", name = "bk", descriptor = "(Lclient!xb;I)V")
	void method33376(@OriginalArg(0) Class655 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean976) {
			this.aBoolean976 = false;
			arg1 = 0;
		}
		if (this.aClass655_4.method33181(arg0, 359937045)) {
			return;
		}
		this.aClass655_4.method33199(arg0, (byte) 4);
		this.aLong410 = Class303.currentTimeMillis((byte) 89) * -4780949853486888619L;
		this.anInt5694 = (this.anInt5696 = arg1 * 557541677) * -83272529;
		if (this.anInt5694 * 1181116139 == 0) {
			return;
		}
		this.aClass655_3.method33199(this.aClass655_1, (byte) 4);
		if (this.aClass655_1.aClass549_2 == null) {
			return;
		}
		if (this.aClass655_1.aClass549_2.method31278((byte) -5)) {
			this.aClass655_1.aClass549_2 = this.aClass655_3.aClass549_2 = this.aClass655_1.aClass549_2.method31279((byte) 39);
		}
		if (this.aClass655_1.aClass549_2 != null && this.aClass655_1.aClass549_2 != this.aClass655_4.aClass549_2) {
			this.aClass655_1.aClass549_2.method31285(this.aClass655_4.aClass549_2, 2022773784);
		}
	}

	@OriginalMember(owner = "client!xm", name = "s", descriptor = "(I)V")
	public void method33377(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass655ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass655ArrayArray1[local1].length; local8++) {
				this.aClass655ArrayArray1[local1][local8] = this.aClass655_2;
			}
		}
	}

	@OriginalMember(owner = "client!xm", name = "ax", descriptor = "(Lclient!rw;)V")
	public void method33378(@OriginalArg(0) Class539 arg0) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -127), (byte) 1);
		}
		this.method33381((byte) -6);
		this.method33383((byte) -63);
		this.method33401(1019124609);
	}

	@OriginalMember(owner = "client!xm", name = "bq", descriptor = "()V")
	void method33379() {
		this.aClass102_14.method20785(this.aClass655_1.aFloat348, this.aClass655_1.aFloat343, this.aClass655_1.aFloat344, 2056126434);
	}

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "(Lclient!rw;Lclient!yh;II)V")
	public void method33380(@OriginalArg(0) Class539 arg0, @OriginalArg(1) Class683 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass683_1 = arg1;
		@Pc(7) Class655 local7 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local7, arg2, (byte) 1);
			this.aClass655_5 = null;
			return;
		}
		if (this.aClass655_5 == null) {
			this.aClass655_5 = new Class655();
		}
		this.aClass655_5.method33199(local7, (byte) 4);
		this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
		this.method33389(this.aClass655_5, arg2, (byte) 1);
	}

	@OriginalMember(owner = "client!xm", name = "r", descriptor = "(B)V")
	void method33381(@OriginalArg(0) byte arg0) {
		if (this.anInt5696 * -197144923 < 0) {
			return;
		}
		@Pc(7) long local7 = Class303.currentTimeMillis((byte) 70);
		this.anInt5696 = (int) ((long) this.anInt5696 - (local7 - this.aLong410 * 5338907152258984957L) * 557541677L);
		if (this.anInt5696 * -197144923 > 0) {
			this.aClass655_1.method33196(this.aClass102_14, this.aClass655_3, this.aClass655_4, (float) (this.anInt5694 * 1181116139 - this.anInt5696 * -197144923) / (float) (this.anInt5694 * 1181116139), -2104331351);
		} else {
			this.aClass655_1.method33199(this.aClass655_4, (byte) 4);
			if (this.aClass655_1.aClass549_2 != null) {
				this.aClass655_1.aClass549_2.method31274((byte) 63);
			}
			this.anInt5696 = -557541677;
		}
		this.aLong410 = local7 * -4780949853486888619L;
	}

	@OriginalMember(owner = "client!xm", name = "q", descriptor = "(I)V")
	public void method33382(@OriginalArg(0) int arg0) {
		this.aBoolean976 = true;
	}

	@OriginalMember(owner = "client!xm", name = "h", descriptor = "(B)V")
	void method33383(@OriginalArg(0) byte arg0) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(758521136)) * this.aClass655_1.aFloat342);
		this.aClass102_14.method20765(this.aClass655_1.anInt5673 * 749608217, this.aClass655_1.aFloat339, this.aClass655_1.aFloat340, (float) ((int) this.aClass463_65.aFloat297 << 2), (float) ((int) this.aClass463_65.aFloat295 << 2), (float) ((int) this.aClass463_65.aFloat296 << 2));
		this.aClass102_14.method20773(this.aClass655_1.aClass106_1);
	}

	@OriginalMember(owner = "client!xm", name = "d", descriptor = "(FFFIIIIIB)V")
	public void method33384(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(1984683086)) * arg0);
		this.aClass102_14.method20765(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass102_14.method20773(this.method33373(arg7, (byte) -94));
	}

	@OriginalMember(owner = "client!xm", name = "af", descriptor = "()V")
	public void method33385() {
		this.aClass243_91.method26256(1693912082);
		this.aClass243_93.method26256(1693912082);
		this.aClass243_92.method26256(1693912082);
	}

	@OriginalMember(owner = "client!xm", name = "ad", descriptor = "(I)Lclient!df;")
	Class106 method33386(@OriginalArg(0) int arg0) {
		@Pc(6) Class106 local6 = (Class106) this.aClass243_91.method26282((long) arg0);
		if (local6 == null) {
			local6 = this.aClass102_14.method20771(arg0);
			this.aClass243_91.method26253(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xm", name = "bt", descriptor = "()V")
	public void method33387() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass655ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass655ArrayArray1[local1].length; local8++) {
				this.aClass655ArrayArray1[local1][local8] = this.aClass655_2;
			}
		}
	}

	@OriginalMember(owner = "client!xm", name = "n", descriptor = "(I)V")
	void method33388(@OriginalArg(0) int arg0) {
		if (!this.aClass102_14.method20780()) {
			return;
		}
		@Pc(6) Class97 local6 = null;
		@Pc(8) Class97 local8 = null;
		@Pc(10) Class97 local10 = null;
		if (!this.aBoolean977) {
			if (this.aClass655_1.anIntArray515[0] > -1) {
				local6 = this.method33438(this.aClass655_1.anIntArray515[0], 1971176580);
			}
			if (this.aClass655_1.anIntArray515[1] > -1) {
				local8 = this.method33438(this.aClass655_1.anIntArray515[1], 94526467);
			}
			if (this.aClass655_1.anIntArray515[2] > -1) {
				local10 = this.method33438(this.aClass655_1.anIntArray515[2], 6924102);
			}
			this.aClass102_14.method20928(local6, this.aClass655_1.aFloatArray120[0], local8, this.aClass655_1.aFloatArray120[1], local10, this.aClass655_1.aFloatArray120[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33438(this.anIntArray516[0], 56711665);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33438(this.anIntArray516[1], -104024289);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33438(this.anIntArray516[2], 1860344009);
		}
		this.aClass102_14.method20928(local6, this.aFloatArray121[0], local8, this.aFloatArray121[1], local10, this.aFloatArray121[2]);
	}

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "(Lclient!xb;IB)V")
	void method33389(@OriginalArg(0) Class655 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aBoolean976) {
			this.aBoolean976 = false;
			arg1 = 0;
		}
		if (this.aClass655_4.method33181(arg0, 359937045)) {
			return;
		}
		this.aClass655_4.method33199(arg0, (byte) 4);
		this.aLong410 = Class303.currentTimeMillis((byte) 118) * -4780949853486888619L;
		this.anInt5694 = (this.anInt5696 = arg1 * 557541677) * -83272529;
		if (this.anInt5694 * 1181116139 == 0) {
			return;
		}
		this.aClass655_3.method33199(this.aClass655_1, (byte) 4);
		if (this.aClass655_1.aClass549_2 == null) {
			return;
		}
		if (this.aClass655_1.aClass549_2.method31278((byte) 22)) {
			this.aClass655_1.aClass549_2 = this.aClass655_3.aClass549_2 = this.aClass655_1.aClass549_2.method31279((byte) 54);
		}
		if (this.aClass655_1.aClass549_2 != null && this.aClass655_1.aClass549_2 != this.aClass655_4.aClass549_2) {
			this.aClass655_1.aClass549_2.method31285(this.aClass655_4.aClass549_2, 1269094086);
		}
	}

	@OriginalMember(owner = "client!xm", name = "b", descriptor = "(I)V")
	public void method33390(@OriginalArg(0) int arg0) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(1615952803)) * 1.1523438F);
		this.aClass102_14.method20765(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass102_14.method20767(13156520, -1, 0);
		this.aClass102_14.method20773(aClass106_2);
	}

	@OriginalMember(owner = "client!xm", name = "y", descriptor = "(I)V")
	void method33391(@OriginalArg(0) int arg0) {
		this.aBoolean978 = false;
		this.aFloat352 = 1.0F;
		this.aFloat350 = 0.0F;
		this.aFloat351 = 1.0F;
		this.aFloat353 = 0.0F;
		this.aFloat354 = 1.0F;
	}

	@OriginalMember(owner = "client!xm", name = "ay", descriptor = "(Lclient!rw;)V")
	public void method33392(@OriginalArg(0) Class539 arg0) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -106), (byte) 1);
		}
		this.method33381((byte) -87);
		this.method33383((byte) -30);
		this.method33401(551172851);
	}

	@OriginalMember(owner = "client!xm", name = "ai", descriptor = "(Lclient!rw;)V")
	public void method33393(@OriginalArg(0) Class539 arg0) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -101), (byte) 1);
		}
		this.method33381((byte) -126);
		this.method33383((byte) -1);
		this.method33401(-1262506659);
	}

	@OriginalMember(owner = "client!xm", name = "aq", descriptor = "(Lclient!rw;)V")
	public void method33394(@OriginalArg(0) Class539 arg0) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -5), (byte) 1);
		}
		this.method33381((byte) -85);
		this.method33383((byte) -46);
		this.method33401(1765850368);
	}

	@OriginalMember(owner = "client!xm", name = "ao", descriptor = "(Lclient!rw;)V")
	public void method33395(@OriginalArg(0) Class539 arg0) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -88), (byte) 1);
		}
		this.method33381((byte) -4);
		this.method33407((byte) 1);
		this.method33449((byte) 108);
		this.method33388(-511267033);
	}

	@OriginalMember(owner = "client!xm", name = "aj", descriptor = "(Lclient!rw;)V")
	public void method33396(@OriginalArg(0) Class539 arg0) {
		@Pc(4) Class655 local4 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local4, anInt5695 * -1915642237, (byte) 1);
		} else {
			this.aClass655_5.method33199(local4, (byte) 4);
			this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
			this.method33389(this.aClass655_5, this.aClass683_1.method36715((byte) -4), (byte) 1);
		}
		this.method33381((byte) -93);
		this.method33407((byte) 1);
		this.method33449((byte) 28);
		this.method33388(698564103);
	}

	@OriginalMember(owner = "client!xm", name = "bs", descriptor = "(Lclient!rw;)Lclient!xb;")
	Class655 method33397(@OriginalArg(0) Class539 arg0) {
		@Pc(1) Class655 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class392.method28683(client.anInt3433 * 1994758437, -1878518496) || Class301.method27043(client.anInt3433 * 1994758437, (byte) -6)) {
			local3 = Class89.anInt319 * 1749751025 >> 12;
			local5 = Class102_Sub2.anInt653 * 1132703631 >> 12;
		} else {
			if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
				local5 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30921(1888594279) >> 3 || local5 < 0 || local5 >= arg0.method31011(-2084790712) >> 3) {
				local3 = arg0.method30921(1866087816) >> 4;
				local5 = arg0.method31011(-1965217819) >> 4;
			}
		}
		local1 = this.aClass655ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass655_2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xm", name = "ag", descriptor = "()Lclient!yh;")
	public Class683 method33398() {
		return this.aClass683_1;
	}

	@OriginalMember(owner = "client!xm", name = "ab", descriptor = "()Lclient!yh;")
	public Class683 method33399() {
		return this.aClass683_1;
	}

	@OriginalMember(owner = "client!xm", name = "bc", descriptor = "(FFFIIIII)V")
	public void method33400(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(-12216812)) * arg0);
		this.aClass102_14.method20765(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass102_14.method20773(this.method33373(arg7, (byte) -59));
	}

	@OriginalMember(owner = "client!xm", name = "z", descriptor = "(I)V")
	public void method33401(@OriginalArg(0) int arg0) {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass655_1.anInt5675 * -544222125 + 256 << 2) + local1;
		this.aClass102_14.method20767(this.aClass655_1.anInt5674 * -922605081, Class703.aClass80_Sub37_49.aClass165_Sub9_1.method15996((byte) -3) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xm", name = "cu", descriptor = "()V")
	public void method33402() {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(2008619056)) * 1.1523438F);
		this.aClass102_14.method20765(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass102_14.method20767(13156520, -1, 0);
		this.aClass102_14.method20773(aClass106_2);
	}

	@OriginalMember(owner = "client!xm", name = "am", descriptor = "()V")
	public void method33403() {
		this.aClass243_91.method26256(1693912082);
		this.aClass243_93.method26256(1693912082);
		this.aClass243_92.method26256(1693912082);
	}

	@OriginalMember(owner = "client!xm", name = "ak", descriptor = "()V")
	public void method33404() {
		this.aClass243_91.method26256(1693912082);
		this.aClass243_93.method26256(1693912082);
		this.aClass243_92.method26256(1693912082);
	}

	@OriginalMember(owner = "client!xm", name = "bn", descriptor = "()V")
	public void method33405() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass655ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass655ArrayArray1[local1].length; local8++) {
				this.aClass655ArrayArray1[local1][local8] = this.aClass655_2;
			}
		}
	}

	@OriginalMember(owner = "client!xm", name = "as", descriptor = "(I)Lclient!cz;")
	Class97 method33406(@OriginalArg(0) int arg0) {
		@Pc(6) Class97 local6 = (Class97) this.aClass243_92.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class109 local15 = Class212.method25823(this.aClass480_133, arg0);
		if (local15 != null && local15.method7119() == 256 && local15.method7127() == 16) {
			@Pc(30) int[] local30 = local15.method7117(false);
			local6 = this.aClass102_14.method20779(local30);
			if (local6 != null) {
				this.aClass243_92.method26253(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "(B)V")
	void method33407(@OriginalArg(0) byte arg0) {
		this.aClass102_14.method20785(this.aClass655_1.aFloat348, this.aClass655_1.aFloat343, this.aClass655_1.aFloat344, 557511582);
	}

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "(I)V")
	void method33408(@OriginalArg(0) int arg0) {
		this.aBoolean977 = false;
		@Pc(5) int[] local5 = this.anIntArray516;
		@Pc(8) int[] local8 = this.anIntArray516;
		this.anIntArray516[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray121;
		@Pc(27) float[] local27 = this.aFloatArray121;
		this.aFloatArray121[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xm", name = "aa", descriptor = "(I)Lclient!df;")
	Class106 method33409(@OriginalArg(0) int arg0) {
		@Pc(6) Class106 local6 = (Class106) this.aClass243_91.method26282((long) arg0);
		if (local6 == null) {
			local6 = this.aClass102_14.method20771(arg0);
			this.aClass243_91.method26253(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xm", name = "ae", descriptor = "(IIII)Lclient!sg;")
	Class549 method33410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class549 local31 = (Class549) this.aClass243_93.method26282(local25);
		if (local31 == null) {
			local31 = Class43.method931(arg0, arg1, arg2, arg3, Class621.aClass41_Sub7_1, Class289.aClass41_Sub8_1, 1188371716);
			this.aClass243_93.method26253(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!xm", name = "ap", descriptor = "(IIII)Lclient!sg;")
	Class549 method33411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class549 local31 = (Class549) this.aClass243_93.method26282(local25);
		if (local31 == null) {
			local31 = Class43.method931(arg0, arg1, arg2, arg3, Class621.aClass41_Sub7_1, Class289.aClass41_Sub8_1, -73187465);
			this.aClass243_93.method26253(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!xm", name = "ar", descriptor = "(I)Lclient!cz;")
	Class97 method33412(@OriginalArg(0) int arg0) {
		@Pc(6) Class97 local6 = (Class97) this.aClass243_92.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class109 local15 = Class212.method25823(this.aClass480_133, arg0);
		if (local15 != null && local15.method7119() == 256 && local15.method7127() == 16) {
			@Pc(30) int[] local30 = local15.method7117(false);
			local6 = this.aClass102_14.method20779(local30);
			if (local6 != null) {
				this.aClass243_92.method26253(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "au", descriptor = "(I)Lclient!cz;")
	Class97 method33413(@OriginalArg(0) int arg0) {
		@Pc(6) Class97 local6 = (Class97) this.aClass243_92.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class109 local15 = Class212.method25823(this.aClass480_133, arg0);
		if (local15 != null && local15.method7119() == 256 && local15.method7127() == 16) {
			@Pc(30) int[] local30 = local15.method7117(false);
			local6 = this.aClass102_14.method20779(local30);
			if (local6 != null) {
				this.aClass243_92.method26253(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "az", descriptor = "(I)Lclient!cz;")
	Class97 method33414(@OriginalArg(0) int arg0) {
		@Pc(6) Class97 local6 = (Class97) this.aClass243_92.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class109 local15 = Class212.method25823(this.aClass480_133, arg0);
		if (local15 != null && local15.method7119() == 256 && local15.method7127() == 16) {
			@Pc(30) int[] local30 = local15.method7117(false);
			local6 = this.aClass102_14.method20779(local30);
			if (local6 != null) {
				this.aClass243_92.method26253(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "bf", descriptor = "(FFFIIIII)V")
	public void method33415(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(1498119761)) * arg0);
		this.aClass102_14.method20765(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass102_14.method20773(this.method33373(arg7, (byte) -60));
	}

	@OriginalMember(owner = "client!xm", name = "aw", descriptor = "(I)Lclient!cz;")
	Class97 method33416(@OriginalArg(0) int arg0) {
		@Pc(6) Class97 local6 = (Class97) this.aClass243_92.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class109 local15 = Class212.method25823(this.aClass480_133, arg0);
		if (local15 != null && local15.method7119() == 256 && local15.method7127() == 16) {
			@Pc(30) int[] local30 = local15.method7117(false);
			local6 = this.aClass102_14.method20779(local30);
			if (local6 != null) {
				this.aClass243_92.method26253(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "bg", descriptor = "(IILclient!xb;)V")
	public void method33417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class655 arg2) {
		this.aClass655ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xm", name = "bl", descriptor = "(IILclient!xb;)V")
	public void method33418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class655 arg2) {
		this.aClass655ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xm", name = "br", descriptor = "()V")
	public void method33419() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass655ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass655ArrayArray1[local1].length; local8++) {
				this.aClass655ArrayArray1[local1][local8] = this.aClass655_2;
			}
		}
	}

	@OriginalMember(owner = "client!xm", name = "av", descriptor = "(I)Lclient!df;")
	Class106 method33420(@OriginalArg(0) int arg0) {
		@Pc(6) Class106 local6 = (Class106) this.aClass243_91.method26282((long) arg0);
		if (local6 == null) {
			local6 = this.aClass102_14.method20771(arg0);
			this.aClass243_91.method26253(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xm", name = "ba", descriptor = "()V")
	public void method33421() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass655ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass655ArrayArray1[local1].length; local8++) {
				this.aClass655ArrayArray1[local1][local8] = this.aClass655_2;
			}
		}
	}

	@OriginalMember(owner = "client!xm", name = "i", descriptor = "(B)V")
	public void method33422(@OriginalArg(0) byte arg0) {
		this.aClass243_91.method26256(1693912082);
		this.aClass243_93.method26256(1693912082);
		this.aClass243_92.method26256(1693912082);
	}

	@OriginalMember(owner = "client!xm", name = "a", descriptor = "(IILclient!xb;I)V")
	public void method33423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class655 arg2, @OriginalArg(3) int arg3) {
		this.aClass655ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xm", name = "bj", descriptor = "(Lclient!rw;)Lclient!xb;")
	Class655 method33424(@OriginalArg(0) Class539 arg0) {
		@Pc(1) Class655 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class392.method28683(client.anInt3433 * 1994758437, -1194057438) || Class301.method27043(client.anInt3433 * 1994758437, (byte) 2)) {
			local3 = Class89.anInt319 * 1749751025 >> 12;
			local5 = Class102_Sub2.anInt653 * 1132703631 >> 12;
		} else {
			if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
				local5 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30921(1990869098) >> 3 || local5 < 0 || local5 >= arg0.method31011(-1349040085) >> 3) {
				local3 = arg0.method30921(2075465647) >> 4;
				local5 = arg0.method31011(819238037) >> 4;
			}
		}
		local1 = this.aClass655ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass655_2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xm", name = "by", descriptor = "(Lclient!rw;)Lclient!xb;")
	Class655 method33425(@OriginalArg(0) Class539 arg0) {
		@Pc(1) Class655 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class392.method28683(client.anInt3433 * 1994758437, -1239450250) || Class301.method27043(client.anInt3433 * 1994758437, (byte) -5)) {
			local3 = Class89.anInt319 * 1749751025 >> 12;
			local5 = Class102_Sub2.anInt653 * 1132703631 >> 12;
		} else {
			if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
				local5 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30921(1969030403) >> 3 || local5 < 0 || local5 >= arg0.method31011(-359077109) >> 3) {
				local3 = arg0.method30921(1863422924) >> 4;
				local5 = arg0.method31011(-816755611) >> 4;
			}
		}
		local1 = this.aClass655ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass655_2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xm", name = "bx", descriptor = "()V")
	public void method33426() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass655_1.anInt5675 * -544222125 + 256 << 2) + local1;
		this.aClass102_14.method20767(this.aClass655_1.anInt5674 * -922605081, Class703.aClass80_Sub37_49.aClass165_Sub9_1.method15996((byte) -52) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xm", name = "bz", descriptor = "(Lclient!xb;I)V")
	void method33427(@OriginalArg(0) Class655 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean976) {
			this.aBoolean976 = false;
			arg1 = 0;
		}
		if (this.aClass655_4.method33181(arg0, 359937045)) {
			return;
		}
		this.aClass655_4.method33199(arg0, (byte) 4);
		this.aLong410 = Class303.currentTimeMillis((byte) 14) * -4780949853486888619L;
		this.anInt5694 = (this.anInt5696 = arg1 * 557541677) * -83272529;
		if (this.anInt5694 * 1181116139 == 0) {
			return;
		}
		this.aClass655_3.method33199(this.aClass655_1, (byte) 4);
		if (this.aClass655_1.aClass549_2 == null) {
			return;
		}
		if (this.aClass655_1.aClass549_2.method31278((byte) -118)) {
			this.aClass655_1.aClass549_2 = this.aClass655_3.aClass549_2 = this.aClass655_1.aClass549_2.method31279((byte) 97);
		}
		if (this.aClass655_1.aClass549_2 != null && this.aClass655_1.aClass549_2 != this.aClass655_4.aClass549_2) {
			this.aClass655_1.aClass549_2.method31285(this.aClass655_4.aClass549_2, 431184723);
		}
	}

	@OriginalMember(owner = "client!xm", name = "be", descriptor = "()V")
	void method33428() {
		if (this.anInt5696 * -197144923 < 0) {
			return;
		}
		@Pc(7) long local7 = Class303.currentTimeMillis((byte) 44);
		this.anInt5696 = (int) ((long) this.anInt5696 - (local7 - this.aLong410 * 5338907152258984957L) * 557541677L);
		if (this.anInt5696 * -197144923 > 0) {
			this.aClass655_1.method33196(this.aClass102_14, this.aClass655_3, this.aClass655_4, (float) (this.anInt5694 * 1181116139 - this.anInt5696 * -197144923) / (float) (this.anInt5694 * 1181116139), 1152000006);
		} else {
			this.aClass655_1.method33199(this.aClass655_4, (byte) 4);
			if (this.aClass655_1.aClass549_2 != null) {
				this.aClass655_1.aClass549_2.method31274((byte) -22);
			}
			this.anInt5696 = -557541677;
		}
		this.aLong410 = local7 * -4780949853486888619L;
	}

	@OriginalMember(owner = "client!xm", name = "at", descriptor = "()V")
	public void method33429() {
		this.aClass243_91.method26256(1693912082);
		this.aClass243_93.method26256(1693912082);
		this.aClass243_92.method26256(1693912082);
	}

	@OriginalMember(owner = "client!xm", name = "bv", descriptor = "()V")
	public void method33430() {
		this.aBoolean976 = true;
	}

	@OriginalMember(owner = "client!xm", name = "bp", descriptor = "(FFFIIIII)V")
	public void method33431(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(611988113)) * arg0);
		this.aClass102_14.method20765(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass102_14.method20773(this.method33373(arg7, (byte) -56));
	}

	@OriginalMember(owner = "client!xm", name = "bb", descriptor = "(FFFIIIII)V")
	public void method33432(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(1273847172)) * arg0);
		this.aClass102_14.method20765(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass102_14.method20773(this.method33373(arg7, (byte) -84));
	}

	@OriginalMember(owner = "client!xm", name = "bo", descriptor = "(FFFIIIII)V")
	public void method33433(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_14.method20801(((float) Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830) * 0.1F + 0.7F + client.aClass539_1.method30991(1600653620)) * arg0);
		this.aClass102_14.method20765(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass102_14.method20773(this.method33373(arg7, (byte) -79));
	}

	@OriginalMember(owner = "client!xm", name = "bd", descriptor = "()V")
	void method33434() {
		if (!this.aClass102_14.method20777()) {
			return;
		}
		if (this.aBoolean978) {
			this.aClass102_14.method20815(this.aFloat352, this.aFloat350, this.aFloat351, this.aFloat353, this.aFloat354);
		} else {
			this.aClass102_14.method20815(this.aClass655_1.aFloat346, this.aClass655_1.aFloat345, this.aClass655_1.aFloat347, this.aClass655_1.aFloat349, this.aClass655_1.aFloat341);
		}
	}

	@OriginalMember(owner = "client!xm", name = "cc", descriptor = "()V")
	void method33435() {
		if (!this.aClass102_14.method20780()) {
			return;
		}
		@Pc(6) Class97 local6 = null;
		@Pc(8) Class97 local8 = null;
		@Pc(10) Class97 local10 = null;
		if (!this.aBoolean977) {
			if (this.aClass655_1.anIntArray515[0] > -1) {
				local6 = this.method33438(this.aClass655_1.anIntArray515[0], 1094971747);
			}
			if (this.aClass655_1.anIntArray515[1] > -1) {
				local8 = this.method33438(this.aClass655_1.anIntArray515[1], 111073393);
			}
			if (this.aClass655_1.anIntArray515[2] > -1) {
				local10 = this.method33438(this.aClass655_1.anIntArray515[2], 902797149);
			}
			this.aClass102_14.method20928(local6, this.aClass655_1.aFloatArray120[0], local8, this.aClass655_1.aFloatArray120[1], local10, this.aClass655_1.aFloatArray120[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33438(this.anIntArray516[0], 236884478);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33438(this.anIntArray516[1], 1380526459);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33438(this.anIntArray516[2], 1716828681);
		}
		this.aClass102_14.method20928(local6, this.aFloatArray121[0], local8, this.aFloatArray121[1], local10, this.aFloatArray121[2]);
	}

	@OriginalMember(owner = "client!xm", name = "bw", descriptor = "()V")
	public void method33436() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass655_1.anInt5675 * -544222125 + 256 << 2) + local1;
		this.aClass102_14.method20767(this.aClass655_1.anInt5674 * -922605081, Class703.aClass80_Sub37_49.aClass165_Sub9_1.method15996((byte) -88) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xm", name = "al", descriptor = "(Lclient!xm;)V")
	public void method33437(@OriginalArg(0) Class665 arg0) {
		this.aClass655_1.method33199(arg0.aClass655_1, (byte) 4);
		this.aClass655_3.method33199(arg0.aClass655_3, (byte) 4);
		this.aClass655_4.method33199(arg0.aClass655_4, (byte) 4);
		this.aLong410 = arg0.aLong410;
		this.anInt5694 = arg0.anInt5694;
		this.anInt5696 = arg0.anInt5696;
	}

	@OriginalMember(owner = "client!xm", name = "j", descriptor = "(II)Lclient!cz;")
	Class97 method33438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class97 local6 = (Class97) this.aClass243_92.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class109 local15 = Class212.method25823(this.aClass480_133, arg0);
		if (local15 != null && local15.method7119() == 256 && local15.method7127() == 16) {
			@Pc(30) int[] local30 = local15.method7117(false);
			local6 = this.aClass102_14.method20779(local30);
			if (local6 != null) {
				this.aClass243_92.method26253(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "bu", descriptor = "()V")
	void method33439() {
		this.aClass102_14.method20785(this.aClass655_1.aFloat348, this.aClass655_1.aFloat343, this.aClass655_1.aFloat344, -229449254);
	}

	@OriginalMember(owner = "client!xm", name = "an", descriptor = "(I)Lclient!df;")
	Class106 method33440(@OriginalArg(0) int arg0) {
		@Pc(6) Class106 local6 = (Class106) this.aClass243_91.method26282((long) arg0);
		if (local6 == null) {
			local6 = this.aClass102_14.method20771(arg0);
			this.aClass243_91.method26253(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xm", name = "ac", descriptor = "(Lclient!rw;Lclient!yh;I)V")
	public void method33441(@OriginalArg(0) Class539 arg0, @OriginalArg(1) Class683 arg1, @OriginalArg(2) int arg2) {
		this.aClass683_1 = arg1;
		@Pc(7) Class655 local7 = this.method33450(arg0, (byte) 100);
		if (this.aClass683_1 == null) {
			this.method33389(local7, arg2, (byte) 1);
			this.aClass655_5 = null;
			return;
		}
		if (this.aClass655_5 == null) {
			this.aClass655_5 = new Class655();
		}
		this.aClass655_5.method33199(local7, (byte) 4);
		this.aClass655_5.method33182(this, this.aClass683_1, (byte) 0);
		this.method33389(this.aClass655_5, arg2, (byte) 1);
	}

	@OriginalMember(owner = "client!xm", name = "k", descriptor = "(IIB)V")
	public void method33442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(6) Class655 local6 = this.aClass655ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass463_65.method29478(local6.aClass463_64);
		}
		this.method33383((byte) -22);
	}

	@OriginalMember(owner = "client!xm", name = "cd", descriptor = "()V")
	void method33443() {
		if (!this.aClass102_14.method20777()) {
			return;
		}
		if (this.aBoolean978) {
			this.aClass102_14.method20815(this.aFloat352, this.aFloat350, this.aFloat351, this.aFloat353, this.aFloat354);
		} else {
			this.aClass102_14.method20815(this.aClass655_1.aFloat346, this.aClass655_1.aFloat345, this.aClass655_1.aFloat347, this.aClass655_1.aFloat349, this.aClass655_1.aFloat341);
		}
	}

	@OriginalMember(owner = "client!xm", name = "cv", descriptor = "()V")
	void method33444() {
		this.aBoolean978 = false;
		this.aFloat352 = 1.0F;
		this.aFloat350 = 0.0F;
		this.aFloat351 = 1.0F;
		this.aFloat353 = 0.0F;
		this.aFloat354 = 1.0F;
	}

	@OriginalMember(owner = "client!xm", name = "ct", descriptor = "()V")
	void method33445() {
		this.aBoolean978 = false;
		this.aFloat352 = 1.0F;
		this.aFloat350 = 0.0F;
		this.aFloat351 = 1.0F;
		this.aFloat353 = 0.0F;
		this.aFloat354 = 1.0F;
	}

	@OriginalMember(owner = "client!xm", name = "cn", descriptor = "()V")
	void method33446() {
		this.aBoolean978 = false;
		this.aFloat352 = 1.0F;
		this.aFloat350 = 0.0F;
		this.aFloat351 = 1.0F;
		this.aFloat353 = 0.0F;
		this.aFloat354 = 1.0F;
	}

	@OriginalMember(owner = "client!xm", name = "cy", descriptor = "()V")
	void method33447() {
		if (!this.aClass102_14.method20780()) {
			return;
		}
		@Pc(6) Class97 local6 = null;
		@Pc(8) Class97 local8 = null;
		@Pc(10) Class97 local10 = null;
		if (!this.aBoolean977) {
			if (this.aClass655_1.anIntArray515[0] > -1) {
				local6 = this.method33438(this.aClass655_1.anIntArray515[0], 1613392966);
			}
			if (this.aClass655_1.anIntArray515[1] > -1) {
				local8 = this.method33438(this.aClass655_1.anIntArray515[1], -422284559);
			}
			if (this.aClass655_1.anIntArray515[2] > -1) {
				local10 = this.method33438(this.aClass655_1.anIntArray515[2], 191239306);
			}
			this.aClass102_14.method20928(local6, this.aClass655_1.aFloatArray120[0], local8, this.aClass655_1.aFloatArray120[1], local10, this.aClass655_1.aFloatArray120[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33438(this.anIntArray516[0], 418530066);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33438(this.anIntArray516[1], 845973276);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33438(this.anIntArray516[2], -389412864);
		}
		this.aClass102_14.method20928(local6, this.aFloatArray121[0], local8, this.aFloatArray121[1], local10, this.aFloatArray121[2]);
	}

	@OriginalMember(owner = "client!xm", name = "ch", descriptor = "()V")
	void method33448() {
		if (!this.aClass102_14.method20780()) {
			return;
		}
		@Pc(6) Class97 local6 = null;
		@Pc(8) Class97 local8 = null;
		@Pc(10) Class97 local10 = null;
		if (!this.aBoolean977) {
			if (this.aClass655_1.anIntArray515[0] > -1) {
				local6 = this.method33438(this.aClass655_1.anIntArray515[0], 1868179687);
			}
			if (this.aClass655_1.anIntArray515[1] > -1) {
				local8 = this.method33438(this.aClass655_1.anIntArray515[1], 1629593399);
			}
			if (this.aClass655_1.anIntArray515[2] > -1) {
				local10 = this.method33438(this.aClass655_1.anIntArray515[2], 284041681);
			}
			this.aClass102_14.method20928(local6, this.aClass655_1.aFloatArray120[0], local8, this.aClass655_1.aFloatArray120[1], local10, this.aClass655_1.aFloatArray120[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33438(this.anIntArray516[0], 893217336);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33438(this.anIntArray516[1], 1773957391);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33438(this.anIntArray516[2], 340426080);
		}
		this.aClass102_14.method20928(local6, this.aFloatArray121[0], local8, this.aFloatArray121[1], local10, this.aFloatArray121[2]);
	}

	@OriginalMember(owner = "client!xm", name = "v", descriptor = "(B)V")
	void method33449(@OriginalArg(0) byte arg0) {
		if (!this.aClass102_14.method20777()) {
			return;
		}
		if (this.aBoolean978) {
			this.aClass102_14.method20815(this.aFloat352, this.aFloat350, this.aFloat351, this.aFloat353, this.aFloat354);
		} else {
			this.aClass102_14.method20815(this.aClass655_1.aFloat346, this.aClass655_1.aFloat345, this.aClass655_1.aFloat347, this.aClass655_1.aFloat349, this.aClass655_1.aFloat341);
		}
	}

	@OriginalMember(owner = "client!xm", name = "x", descriptor = "(Lclient!rw;B)Lclient!xb;")
	Class655 method33450(@OriginalArg(0) Class539 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class655 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class392.method28683(client.anInt3433 * 1994758437, -1750285010) || Class301.method27043(client.anInt3433 * 1994758437, (byte) 5)) {
			local3 = Class89.anInt319 * 1749751025 >> 12;
			local5 = Class102_Sub2.anInt653 * 1132703631 >> 12;
		} else {
			if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
				local5 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30921(1869278744) >> 3 || local5 < 0 || local5 >= arg0.method31011(-1337570705) >> 3) {
				local3 = arg0.method30921(2015882640) >> 4;
				local5 = arg0.method31011(969908417) >> 4;
			}
		}
		local1 = this.aClass655ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass655_2;
		}
		return local1;
	}
}
