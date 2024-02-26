package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@OriginalClass("client!fg")
public final class Class263 {

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
	static final int anInt3903 = 8192;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	static final int anInt3904 = 16384;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	static final int anInt3905 = 0;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
	static final int anInt3906 = 4096;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	static final int anInt3908 = 4096;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
	static final int anInt3910 = 16384;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	static final int anInt3911 = 8192;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "Lclient!rh;")
	Class529 aClass529_5;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
	int anInt3907;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "Lclient!ej;")
	Class243 aClass243_71;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Lclient!ej;")
	Class243 aClass243_72;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!ej;")
	Class243 aClass243_73;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	int anInt3909;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!on;")
	Class463 aClass463_60;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Z")
	boolean aBoolean780;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	int anInt3912;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	int anInt3913;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
	boolean aBoolean781;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Ljava/util/List;")
	List aList8 = new ArrayList();

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Ljava/util/List;")
	List aList7 = new ArrayList();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap6 = new HashMap();

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap7 = new HashMap();

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Ljava/util/List;")
	List aList6 = new ArrayList();

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap8 = new HashMap();

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "Lclient!rh;")
	Class529 aClass529_6 = null;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "Z")
	boolean aBoolean779 = false;

	@OriginalMember(owner = "client!fg", name = "ax", descriptor = "Lclient!rf;")
	Interface55 anInterface55_2 = new Class267(this);

	@OriginalMember(owner = "client!fg", name = "ay", descriptor = "Lclient!rf;")
	Interface55 anInterface55_3 = new Class272(this);

	@OriginalMember(owner = "client!fg", name = "ai", descriptor = "Lclient!rf;")
	Interface55 anInterface55_4 = new Class270(this);

	@OriginalMember(owner = "client!fg", name = "aq", descriptor = "Lclient!rf;")
	Interface55 anInterface55_1 = new Class257(this);

	@OriginalMember(owner = "client!fg", name = "bf", descriptor = "(Lclient!yp;I)V")
	static void method26631(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 != null) {
			Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.method33525(local13, local23, (byte) 81);
		}
	}

	@OriginalMember(owner = "client!fg", name = "je", descriptor = "(Lclient!yp;I)V")
	static void method26632(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!fg", name = "nq", descriptor = "(Lclient!yp;B)V")
	static void method26633(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2089803690);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class325.method27628(local16, local22, arg0, 2057898957);
	}

	@OriginalMember(owner = "client!fg", name = "ra", descriptor = "(Lclient!yp;I)V")
	static void method26634(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class531.method30815(local11, local14, arg0, 1840689812);
	}

	@OriginalMember(owner = "client!fg", name = "aea", descriptor = "(Lclient!yp;B)V")
	static void method26635(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 & local23;
	}

	@OriginalMember(owner = "client!fg", name = "arc", descriptor = "(Lclient!yp;I)V")
	static void method26636(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fg", name = "bev", descriptor = "(Lclient!yp;I)V")
	static void method26637(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class35 local18 = (Class35) Class80_Sub1_Sub1.aClass41_2.method18054(local12, 517879525);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt108 * -895966421;
	}

	@OriginalMember(owner = "client!fg", name = "bbm", descriptor = "(Lclient!yp;I)V")
	static void method26638(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!fg", name = "aj", descriptor = "(II)V")
	public void method26512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26530(arg0, 255, -135518595);
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(B)Ljava/util/List;")
	List method26513(@OriginalArg(0) byte arg0) {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(III)V")
	public void method26514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean780) {
			return;
		}
		this.anInt3909 = arg0 * -1090358589;
		this.aClass243_71 = new Class243(arg1, 100);
		this.aClass243_72 = new Class243(10);
		this.aClass243_71.method26248(new Class271(this), (byte) 117);
		@Pc(34) Class671 local34 = new Class671(Class427.aClass427_2);
		Class628.method32551(local34, (byte) 49);
		this.method26525(-203270627);
		this.anInt3912 = -1388761619;
		this.aBoolean780 = true;
	}

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "(I)Lclient!ej;")
	Class243 method26515(@OriginalArg(0) int arg0) {
		return this.aClass243_72;
	}

	@OriginalMember(owner = "client!fg", name = "ax", descriptor = "(IIS)V")
	public void method26516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (arg0 == this.anInt3912 * 1888733211) {
			return;
		}
		if (this.aClass529_6 != null) {
			this.aClass529_6.method30788(0, -986535671);
			this.method26582(this.aClass529_6, (byte) 8);
			this.aClass529_6 = null;
		}
		@Pc(42) Class529 local42 = this.method26536(Class280.aClass280_11, this, arg0, 0, arg1, Class278.aClass278_1.method26831(-715794923), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, 445317054);
		if (local42 != null) {
			local42.method30768((byte) 116);
			this.aClass529_6 = local42;
		}
		this.aBoolean779 = false;
	}

	@OriginalMember(owner = "client!fg", name = "cs", descriptor = "(Lclient!on;Lclient!on;F)Z")
	boolean method26517(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class463 local3 = Class463.method29487(arg1, arg0);
		return !(local3.method29481() >= arg2);
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(IB)V")
	public void method26518(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aBoolean780 && arg0 >= 0) {
			this.method26595(arg0, false, (byte) -116);
		}
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)V")
	public void method26519(@OriginalArg(0) int arg0) {
		if (!this.aBoolean780) {
			return;
		}
		Class611.method32220(1782773126);
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552() != null) {
			if (this.aClass463_60 == null) {
				this.aClass463_60 = new Class463();
			}
			this.aClass463_60.aFloat297 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61.aFloat297;
			this.aClass463_60.aFloat295 = 0.0F;
			this.aClass463_60.aFloat296 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61.aFloat296;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface68 local48;
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			local48.method32986(438692604);
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			local48.method32986(1990871707);
		}
		local41 = this.aList6.iterator();
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			if (local48.method32969(275418512)) {
				this.aHashMap7.remove(local48.method32994((byte) -94));
			} else {
				this.aHashMap6.remove(local48.method32994((byte) -54));
			}
		}
		this.aList6.clear();
		if (this.aClass529_6 != null && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10 && !this.aBoolean779 && client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(132) Class80_Sub31 local132 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local132.aPacketBit_2.p4(this.aClass529_6.method30740((byte) -34).method32994((byte) -15));
			client.aClass75_1.method1325(local132, (byte) -115);
			this.aBoolean779 = true;
		}
		local41 = this.aList8.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class524 local170;
				@Pc(160) Class529 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class529) local41.next();
					local160.method30735(1896589581);
					local160.method30731(1479951787);
					local170 = local160.method30732((byte) 24);
				} while (local160.method30806((byte) 0) != this);
				if (Class524.aClass524_7 == local170 || Class524.aClass524_8 == local170) {
					if (local160.method30736(717832784) != Class280.aClass280_11 && local160.method30736(1070752985) != Class280.aClass280_10) {
						@Pc(380) Iterator local380 = this.aHashMap8.keySet().iterator();
						while (local380.hasNext()) {
							@Pc(388) int local388 = (Integer) local380.next();
							@Pc(395) Class260 local395 = (Class260) this.aHashMap8.get(local388);
							if (local395.method26466(-1073973671).contains(local160)) {
								local395.method26452(local160, -401655564);
								break;
							}
						}
						local160.method30724(1718003046);
						this.aList7.remove(local160);
					} else if (local160 == this.aClass529_6) {
						this.aBoolean779 = false;
						this.aClass529_6 = null;
						local160.method30724(1718003046);
						this.aList7.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30740((byte) -16).method32994((byte) -51);
						@Pc(229) boolean local229 = this.method26559(Class278.aClass278_1.method26831(1567734642), (byte) 11) > 0.0F;
						if (!this.aBoolean781 && local229) {
							if (local216 == this.anInt3912 * 1888733211) {
								this.method26596(local216, 1242691385);
								this.anInt3912 = -1388761619;
							}
							local160.method30724(1718003046);
							this.aList7.remove(local160);
						} else if (this.anInt3913 * -764750875 == local216) {
							this.anInt3913 = 609275411;
							this.aBoolean781 = false;
							local160.method30724(1718003046);
							this.aList7.remove(local160);
							@Pc(280) Iterator local280 = this.aList8.iterator();
							@Pc(287) Class529 local287;
							@Pc(298) int local298;
							do {
								do {
									if (!local280.hasNext()) {
										continue label162;
									}
									local287 = (Class529) local280.next();
								} while (local287.method30736(-1657430978) != Class280.aClass280_11);
								local298 = local287.method30740((byte) 37).method32994((byte) -55);
							} while ((local298 != this.anInt3912 * 1888733211 || local287.method30732((byte) 24) != Class524.aClass524_7) && local287.method30732((byte) 24) != Class524.aClass524_2 && local287.method30732((byte) 24) != Class524.aClass524_3 && local287.method30732((byte) 24) != Class524.aClass524_10);
							if (local287.method30732((byte) 24) == Class524.aClass524_7) {
								local287.method30729(-628853575);
							} else {
								local287.method30726(-1365667818);
							}
						} else if (local229) {
							if (!this.aBoolean781 || this.anInt3912 * 1888733211 != local216) {
								local160.method30724(1718003046);
								this.aList7.remove(local160);
							}
							if (!this.aBoolean781 && this.anInt3912 * 1888733211 == local216) {
								this.anInt3912 = -1388761619;
								this.aClass529_5 = null;
							}
						}
					}
				} else if (local160.method30732((byte) 24) != Class524.aClass524_6 && local160.method30737(-30505257) == Class278.aClass278_1.method26831(-951420941)) {
					@Pc(441) boolean local441 = this.method26559(Class278.aClass278_1.method26831(315624424), (byte) -5) > 1.0E-4F;
					if (!local441) {
						local160.method30788(150, -526138606);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(B)V")
	public void method26520(@OriginalArg(0) byte arg0) {
		Class350.method28007((byte) 122);
	}

	@OriginalMember(owner = "client!fg", name = "df", descriptor = "(IIZIIIII)V")
	public void method26521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean780 || this.anInt3912 * 1888733211 == arg0) {
			return;
		}
		if (this.aBoolean781 && this.aClass529_5 != null && this.anInt3912 * 1888733211 != arg0) {
			this.aClass529_5.method30729(-628853575);
			this.aClass529_5.method30724(1718003046);
			this.aList7.remove(this.aClass529_5);
		}
		@Pc(40) Class529 local40 = this.method26546((byte) 57);
		if (local40 != null && local40.method30740((byte) 50).method32994((byte) -31) == arg0) {
			this.aClass529_5 = local40;
			this.anInt3912 = local40.method30740((byte) 11).method32994((byte) -59) * 1388761619;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3912 * 1888733211 >= 0) {
			@Pc(73) Iterator local73 = this.aList7.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class529 local80 = (Class529) local73.next();
				if (local80.method30736(1688860972) == Class280.aClass280_11) {
					local80.method30788(2000, 1903093281);
					local64 = true;
				}
			}
		}
		this.aClass529_5 = null;
		this.anInt3912 = -1388761619;
		@Pc(100) Class529 local100 = null;
		if (this.aClass529_6 != null && this.aClass529_6.method30740((byte) 55) != null && this.aClass529_6.method30740((byte) -12).method32994((byte) -121) == arg0 && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10) {
			local100 = this.aClass529_6;
			this.aClass529_6 = null;
			this.aBoolean779 = false;
		}
		@Pc(139) float local139;
		if (local100 == null) {
			if (arg2) {
				local139 = arg6;
				@Pc(142) float local142 = (float) arg7;
				@Pc(151) Class463 local151 = new Class463((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3907 * 1824095461 == arg0 ? Class266.aClass266_5.method26652((byte) -95) : Class278.aClass278_1.method26831(501172251), Class269.aClass269_2, local139, local142, local151, arg3, 255, true, 527325073);
			} else {
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3907 * 1824095461 ? Class266.aClass266_5.method26652((byte) -5) : Class278.aClass278_1.method26831(2103668301), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, -81595444);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local139 = (float) arg1 / 255.0F;
			local100.method30749(local139, 2000, (byte) -103);
		}
		local100.method30726(-2017053158);
		this.method26582(local100, (byte) 67);
		this.aClass529_5 = local100;
		this.anInt3912 = arg0 * 1388761619;
		if (this.aBoolean781) {
			this.aClass529_5.method30728(1896589581);
		}
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(270) Class80_Sub31 local270 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local270.aPacketBit_2.p4(this.anInt3912 * 1888733211);
			client.aClass75_1.method1325(local270, (byte) -23);
		}
	}

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "(II)V")
	public void method26522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26466(1106569751);
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class529 local23 = (Class529) local16.next();
			if (!local23.method30748(-1774763824)) {
				local23.method30726(-1154730648);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IS)V")
	public void method26523(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26466(-1240634382);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class529 local24 = (Class529) local17.next();
			local24.method30788(50, 530131093);
		}
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "(II)V")
	public void method26524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Iterator local3 = this.aList7.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class529 local10 = (Class529) local3.next();
			@Pc(14) int local14 = local10.method30737(1495429887);
			@Pc(19) boolean local19 = Class297.method27004(local14, arg0, (byte) -81);
			if (local19) {
				local10.method30788(50, 179744143);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "(I)V")
	void method26525(@OriginalArg(0) int arg0) {
		@Pc(4) Class264 local4 = new Class264(this);
		@Pc(9) Class277 local9 = new Class277(this);
		@Pc(14) Class258 local14 = new Class258(this);
		@Pc(19) Class259 local19 = new Class259(this);
		@Pc(24) Class279 local24 = new Class279(this);
		Class75.method1345(Class266.aClass266_2.method26652((byte) -110), Class266.aClass266_4.method26652((byte) -78), 0.2F, local4, 995088333);
		Class75.method1345(Class266.aClass266_3.method26652((byte) 54), Class266.aClass266_4.method26652((byte) 118), 1.0F, local9, 995088333);
		Class75.method1345(Class266.aClass266_5.method26652((byte) -49), Class266.aClass266_4.method26652((byte) 37), 1.0F, local14, 995088333);
		Class75.method1345(Class266.aClass266_1.method26652((byte) -93), Class266.aClass266_4.method26652((byte) 16), 0.8F, local19, 995088333);
		Class75.method1345(Class266.aClass266_6.method26652((byte) 22), Class266.aClass266_4.method26652((byte) -93), 1.0F, local24, 995088333);
		Class75.method1345(Class278.aClass278_1.method26831(443296256), Class266.aClass266_3.method26652((byte) -49), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_3.method26831(695838556), Class266.aClass266_6.method26652((byte) 65), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_5.method26831(224979277), Class266.aClass266_2.method26652((byte) 55), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_6.method26831(1961526052), Class266.aClass266_2.method26652((byte) -36), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_10.method26831(1594076561), Class266.aClass266_2.method26652((byte) -115), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_2.method26831(554527324), Class266.aClass266_2.method26652((byte) 63), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_7.method26831(-416352268), Class266.aClass266_2.method26652((byte) 89), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_8.method26831(-2012548736), Class266.aClass266_1.method26652((byte) 44), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_4.method26831(-193832671), Class278.aClass278_8.method26831(-30797076), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_9.method26831(-1490532270), Class278.aClass278_8.method26831(-1902902146), 1.0F, null, 995088333);
		Class378.method28536(Class278.aClass278_1.method26831(1512594276), 2095684397).method28973(0.75F, -632783354);
	}

	@OriginalMember(owner = "client!fg", name = "ch", descriptor = "(Lclient!wc;)Lclient!rh;")
	Class529 method26526(@OriginalArg(0) Interface68 arg0) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList8.iterator();
		@Pc(17) Class529 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3909 * -418099733) {
					return null;
				}
				@Pc(42) Class529 local42 = arg0.method33013(1366105030);
				this.aList8.add(local42);
				return local42;
			}
			local17 = (Class529) local10.next();
			local6++;
		} while (local17.method30732((byte) 24) != Class524.aClass524_1);
		local17.method30762(arg0, (byte) 3);
		return local17;
	}

	@OriginalMember(owner = "client!fg", name = "ar", descriptor = "()Lclient!on;")
	Class463 method26527() {
		return this.aClass463_60;
	}

	@OriginalMember(owner = "client!fg", name = "bf", descriptor = "(I)V")
	public void method26528(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList7.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class529 local10 = (Class529) local3.next();
			@Pc(14) int local14 = local10.method30737(-1617584532);
			@Pc(19) boolean local19 = Class297.method27004(local14, arg0, (byte) -2);
			if (local19) {
				local10.method30788(50, 1623203014);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "([IB)V")
	void method26529(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		if (!this.aBoolean780 || arg0 == null) {
			return;
		}
		@Pc(9) int[] local9 = arg0;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) int local19 = local9[local11];
			this.method26518(local19, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "ac", descriptor = "(III)V")
	public void method26530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method26545(arg0, arg1, false, 0, 0, 0, 0, 0, 78864041);
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "(B)Lclient!on;")
	Class463 method26531(@OriginalArg(0) byte arg0) {
		return this.aClass463_60;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lclient!fz;IIIILclient!fn;FFLclient!on;IIII)V")
	public void method26532(@OriginalArg(0) Class280 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class269 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class463 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		if (!this.aBoolean780) {
			return;
		}
		@Pc(20) Class529 local20 = this.method26536(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, 1842102920);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30726(-1066972428);
		} else {
			local20.method30790(arg11, false, -1157748575);
		}
		this.method26582(local20, (byte) 10);
	}

	@OriginalMember(owner = "client!fg", name = "aq", descriptor = "(S)I")
	public int method26533(@OriginalArg(0) short arg0) {
		return this.anInt3907 * 1824095461;
	}

	@OriginalMember(owner = "client!fg", name = "be", descriptor = "(III)V")
	public void method26534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class266.aClass266_4.method26652((byte) 47);
		if (Class378.method28536(arg0, -1315240338) == null && (arg1 == local3 || Class378.method28536(arg1, -1145021864) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class75.method1345(arg0, arg1 == local3 ? -1 : arg1, local20, null, 995088333);
		}
	}

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "(Lclient!on;Lclient!on;FI)Z")
	boolean method26535(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class463 local3 = Class463.method29487(arg1, arg0);
		return !(local3.method29481() >= arg2);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Lclient!fz;Ljava/lang/Object;IIIILclient!fn;FFLclient!on;IIZI)Lclient!rh;")
	public Class529 method26536(@OriginalArg(0) Class280 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class269 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class463 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int arg13) {
		if (!this.aBoolean780) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class269.aClass269_5 && !this.method26535(this.aClass463_60, arg9, arg8, 1620717460)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface68 local52 = this.method26595(arg2, arg12, (byte) -44);
			@Pc(57) Class529 local57 = this.method26574(local52, 2028901615);
			if (local57 == null) {
				return null;
			}
			local57.method30733(arg1, (byte) 58);
			local57.method30738(arg5, 1957541941);
			if (arg6 != Class269.aClass269_5) {
				local57.method30798(true, 1744463179);
				local57.method30741(arg9, -1442717365);
				local57.method30745(arg7, 1621001136);
				local57.method30746(arg8, -1147297254);
				if (arg6 == Class269.aClass269_1) {
					local57.method30730(this.anInterface55_3, (short) -30567);
				} else if (arg6 == Class269.aClass269_3) {
					local57.method30730(this.anInterface55_1, (short) 28366);
				} else if (arg6 == Class269.aClass269_4) {
					local57.method30730(this.anInterface55_2, (short) -11294);
				} else if (arg6 == Class269.aClass269_2) {
					local57.method30730(this.anInterface55_4, (short) 23161);
				} else {
					local57.method30798(false, 1963257968);
				}
			}
			local57.method30749(local41, 0, (byte) -42);
			local57.method30750(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3, (short) -27593);
			local57.method30751(local46, -1995009017);
			local57.method30759(arg0, (byte) -22);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fg", name = "bm", descriptor = "(I)V")
	public void method26537(@OriginalArg(0) int arg0) {
		if (this.aBoolean780 && arg0 >= 0) {
			this.method26595(arg0, false, (byte) -38);
		}
	}

	@OriginalMember(owner = "client!fg", name = "au", descriptor = "(II)V")
	public void method26538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean780) {
			return;
		}
		this.anInt3909 = arg0 * -1090358589;
		this.aClass243_71 = new Class243(arg1, 100);
		this.aClass243_72 = new Class243(10);
		this.aClass243_71.method26248(new Class271(this), (byte) 112);
		@Pc(34) Class671 local34 = new Class671(Class427.aClass427_2);
		Class628.method32551(local34, (byte) 35);
		this.method26525(-203270627);
		this.anInt3912 = -1388761619;
		this.aBoolean780 = true;
	}

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "(IZI)Lclient!wc;")
	Interface68 method26539(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "ai", descriptor = "(IB)V")
	public void method26540(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt3907 = arg0 * 1309925613;
	}

	@OriginalMember(owner = "client!fg", name = "cy", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26541(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(10) Interface68 local10 = this.method26539(arg0, arg1, 1999979217);
		if (local10 == null) {
			@Pc(18) Class268 local18 = new Class268(this);
			local10 = Class657.method33229(arg1 ? Class238.aClass480_88 : Class9.aClass480_1, arg0, local18, arg1, this.aClass243_73, -1282763565);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fg", name = "bx", descriptor = "([I)V")
	void method26542(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean780 || arg0 == null) {
			return;
		}
		@Pc(9) int[] local9 = arg0;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) int local19 = local9[local11];
			this.method26518(local19, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "aw", descriptor = "()V")
	public void method26543() {
		if (!this.aBoolean780) {
			return;
		}
		Class611.method32220(-517560441);
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552() != null) {
			if (this.aClass463_60 == null) {
				this.aClass463_60 = new Class463();
			}
			this.aClass463_60.aFloat297 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61.aFloat297;
			this.aClass463_60.aFloat295 = 0.0F;
			this.aClass463_60.aFloat296 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61.aFloat296;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface68 local48;
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			local48.method32986(74330581);
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			local48.method32986(-1552469037);
		}
		local41 = this.aList6.iterator();
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			if (local48.method32969(275418512)) {
				this.aHashMap7.remove(local48.method32994((byte) -96));
			} else {
				this.aHashMap6.remove(local48.method32994((byte) -88));
			}
		}
		this.aList6.clear();
		if (this.aClass529_6 != null && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10 && !this.aBoolean779 && client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(132) Class80_Sub31 local132 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local132.aPacketBit_2.p4(this.aClass529_6.method30740((byte) 45).method32994((byte) -119));
			client.aClass75_1.method1325(local132, (byte) -102);
			this.aBoolean779 = true;
		}
		local41 = this.aList8.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class524 local170;
				@Pc(160) Class529 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class529) local41.next();
					local160.method30735(1896589581);
					local160.method30731(832671472);
					local170 = local160.method30732((byte) 24);
				} while (local160.method30806((byte) 0) != this);
				if (Class524.aClass524_7 == local170 || Class524.aClass524_8 == local170) {
					if (local160.method30736(1585870321) != Class280.aClass280_11 && local160.method30736(-692928623) != Class280.aClass280_10) {
						@Pc(380) Iterator local380 = this.aHashMap8.keySet().iterator();
						while (local380.hasNext()) {
							@Pc(388) int local388 = (Integer) local380.next();
							@Pc(395) Class260 local395 = (Class260) this.aHashMap8.get(local388);
							if (local395.method26466(-842741843).contains(local160)) {
								local395.method26452(local160, -401655564);
								break;
							}
						}
						local160.method30724(1718003046);
						this.aList7.remove(local160);
					} else if (local160 == this.aClass529_6) {
						this.aBoolean779 = false;
						this.aClass529_6 = null;
						local160.method30724(1718003046);
						this.aList7.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30740((byte) 59).method32994((byte) -103);
						@Pc(229) boolean local229 = this.method26559(Class278.aClass278_1.method26831(1571513783), (byte) -34) > 0.0F;
						if (!this.aBoolean781 && local229) {
							if (local216 == this.anInt3912 * 1888733211) {
								this.method26596(local216, -883223517);
								this.anInt3912 = -1388761619;
							}
							local160.method30724(1718003046);
							this.aList7.remove(local160);
						} else if (this.anInt3913 * -764750875 == local216) {
							this.anInt3913 = 609275411;
							this.aBoolean781 = false;
							local160.method30724(1718003046);
							this.aList7.remove(local160);
							@Pc(280) Iterator local280 = this.aList8.iterator();
							@Pc(287) Class529 local287;
							@Pc(298) int local298;
							do {
								do {
									if (!local280.hasNext()) {
										continue label162;
									}
									local287 = (Class529) local280.next();
								} while (local287.method30736(-1161209206) != Class280.aClass280_11);
								local298 = local287.method30740((byte) 13).method32994((byte) -17);
							} while ((local298 != this.anInt3912 * 1888733211 || local287.method30732((byte) 24) != Class524.aClass524_7) && local287.method30732((byte) 24) != Class524.aClass524_2 && local287.method30732((byte) 24) != Class524.aClass524_3 && local287.method30732((byte) 24) != Class524.aClass524_10);
							if (local287.method30732((byte) 24) == Class524.aClass524_7) {
								local287.method30729(-628853575);
							} else {
								local287.method30726(-1013345993);
							}
						} else if (local229) {
							if (!this.aBoolean781 || this.anInt3912 * 1888733211 != local216) {
								local160.method30724(1718003046);
								this.aList7.remove(local160);
							}
							if (!this.aBoolean781 && this.anInt3912 * 1888733211 == local216) {
								this.anInt3912 = -1388761619;
								this.aClass529_5 = null;
							}
						}
					}
				} else if (local160.method30732((byte) 24) != Class524.aClass524_6 && local160.method30737(-1430645631) == Class278.aClass278_1.method26831(-1841670041)) {
					@Pc(441) boolean local441 = this.method26559(Class278.aClass278_1.method26831(1245461985), (byte) 4) > 1.0E-4F;
					if (!local441) {
						local160.method30788(150, -1568958717);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "(II)V")
	public void method26544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26466(-914200936);
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class529 local23 = (Class529) local16.next();
			local23.method30768((byte) 97);
		}
	}

	@OriginalMember(owner = "client!fg", name = "ag", descriptor = "(IIZIIIIII)V")
	public void method26545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.aBoolean780 || this.anInt3912 * 1888733211 == arg0) {
			return;
		}
		if (this.aBoolean781 && this.aClass529_5 != null && this.anInt3912 * 1888733211 != arg0) {
			this.aClass529_5.method30729(-628853575);
			this.aClass529_5.method30724(1718003046);
			this.aList7.remove(this.aClass529_5);
		}
		@Pc(40) Class529 local40 = this.method26546((byte) 36);
		if (local40 != null && local40.method30740((byte) -73).method32994((byte) -76) == arg0) {
			this.aClass529_5 = local40;
			this.anInt3912 = local40.method30740((byte) 19).method32994((byte) -14) * 1388761619;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3912 * 1888733211 >= 0) {
			@Pc(73) Iterator local73 = this.aList7.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class529 local80 = (Class529) local73.next();
				if (local80.method30736(-1106904188) == Class280.aClass280_11) {
					local80.method30788(2000, 1664401346);
					local64 = true;
				}
			}
		}
		this.aClass529_5 = null;
		this.anInt3912 = -1388761619;
		@Pc(100) Class529 local100 = null;
		if (this.aClass529_6 != null && this.aClass529_6.method30740((byte) -9) != null && this.aClass529_6.method30740((byte) 62).method32994((byte) -18) == arg0 && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10) {
			local100 = this.aClass529_6;
			this.aClass529_6 = null;
			this.aBoolean779 = false;
		}
		@Pc(139) float local139;
		if (local100 == null) {
			if (arg2) {
				local139 = arg6;
				@Pc(142) float local142 = (float) arg7;
				@Pc(151) Class463 local151 = new Class463((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3907 * 1824095461 == arg0 ? Class266.aClass266_5.method26652((byte) -48) : Class278.aClass278_1.method26831(-744296475), Class269.aClass269_2, local139, local142, local151, arg3, 255, true, 222276027);
			} else {
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3907 * 1824095461 ? Class266.aClass266_5.method26652((byte) 64) : Class278.aClass278_1.method26831(1142122797), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, 1321182792);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local139 = (float) arg1 / 255.0F;
			local100.method30749(local139, 2000, (byte) -1);
		}
		local100.method30726(-1333138554);
		this.method26582(local100, (byte) -2);
		this.aClass529_5 = local100;
		this.anInt3912 = arg0 * 1388761619;
		if (this.aBoolean781) {
			this.aClass529_5.method30728(1896589581);
		}
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(270) Class80_Sub31 local270 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local270.aPacketBit_2.p4(this.anInt3912 * 1888733211);
			client.aClass75_1.method1325(local270, (byte) -18);
		}
	}

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "(B)Lclient!rh;")
	Class529 method26546(@OriginalArg(0) byte arg0) {
		@Pc(3) Iterator local3 = this.aList7.iterator();
		@Pc(10) Class529 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class529) local3.next();
		} while (local10.method30736(-1399766909) != Class280.aClass280_11 || local10.method30732((byte) 24) != Class524.aClass524_5);
		return local10;
	}

	@OriginalMember(owner = "client!fg", name = "cp", descriptor = "(I)V")
	public void method26547(@OriginalArg(0) int arg0) {
		this.anInt3907 = arg0 * 1309925613;
	}

	@OriginalMember(owner = "client!fg", name = "ah", descriptor = "(III)V")
	public void method26548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean780 || this.aBoolean781 && this.anInt3913 * -764750875 == arg0) {
			return;
		}
		if (this.aBoolean781 && arg0 != this.anInt3913 * -764750875) {
			@Pc(26) Iterator local26 = this.aList8.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class529 local33 = (Class529) local26.next();
				if (local33.method30736(560488034) == Class280.aClass280_10) {
					local33.method30724(1718003046);
					this.aList7.remove(local33);
					this.aBoolean781 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean781 && this.aClass529_5 != null) {
			this.aClass529_5.method30728(1896589581);
		}
		@Pc(85) Class529 local85 = this.method26536(Class280.aClass280_10, this, arg0, 0, arg1, Class278.aClass278_1.method26831(-2043390686), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, 1236556116);
		if (local85 != null) {
			local85.method30726(-1528266745);
			this.method26582(local85, (byte) 3);
			this.aBoolean781 = true;
			this.anInt3913 = arg0 * -609275411;
		}
	}

	@OriginalMember(owner = "client!fg", name = "af", descriptor = "(Lclient!fe;ILclient!alf;B)V")
	public void method26549(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (arg2.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 || !arg2.method24604(1675146234))) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray47[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local67 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local67 > 0) {
				local40 = arg0.anIntArrayArray47[arg1][local67];
			}
		}
		local67 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local67 = (int) (Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1])) + arg0.anIntArray372[arg1];
		}
		@Pc(113) int local113 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		if (local50 != 0) {
			if (arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) 35) == 0) {
					return;
				}
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -33) == 0) {
				return;
			}
			if (arg0.anInt3900 * -621643601 != -1) {
				@Pc(160) int local160 = 0;
				if (arg2 instanceof Class120_Sub1_Sub1_Sub1) {
					local160 = ((Class120_Sub1_Sub1_Sub1) arg2).method18987((byte) 0);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub5) {
					local160 = ((Class120_Sub1_Sub1_Sub5) arg2).method24341(67541363);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub4) {
					local160 = ((Class120_Sub1_Sub1_Sub4) arg2).method24203(-1902275428);
				}
				if (local160 != 0 && local160 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18987((byte) 0) && client.anInt3431 * -1402260617 != local160) {
					local113 = arg0.anInt3900 * -621643601 * local113 / 100;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 255) {
						local113 = 255;
					}
				}
			}
			@Pc(222) Class463 local222 = arg2.method24552().aClass463_61;
			@Pc(230) int local230 = (int) local222.aFloat297 - 256 >> 9;
			@Pc(238) int local238 = (int) local222.aFloat296 - 256 >> 9;
			@Pc(251) Class463 local251 = new Class463((float) (local230 << 9), 0.0F, (float) (local238 << 9));
			@Pc(256) int local256 = arg2.aByte99 << 24;
			this.method26532(Class280.aClass280_7, local40, local46, local113, Class278.aClass278_10.method26831(-1434024134), arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 ? Class269.aClass269_5 : Class269.aClass269_4, 0.0F, (float) (local50 << 9), local251, local256, local67, 0, 1884266084);
		} else if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
			this.method26532(Class280.aClass280_6, local40, local46, local113, Class278.aClass278_6.method26831(-1735896723), Class269.aClass269_5, 0.0F, 0.0F, null, arg2.aByte99, local67, 0, 1895584249);
		}
	}

	@OriginalMember(owner = "client!fg", name = "am", descriptor = "(Lclient!fe;II)V")
	public void method26550(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(22) int local22 = arg0.anIntArrayArray47[arg1][0];
		@Pc(26) int local26 = local22 >> 8;
		@Pc(32) int local32 = local22 >> 5 & 0x7;
		@Pc(49) int local49;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local49 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local49 > 0) {
				local26 = arg0.anIntArrayArray47[arg1][local49];
			}
		}
		local49 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local49 = (int) ((double) arg0.anIntArray372[arg1] + Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1]));
		}
		@Pc(96) int local96 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		this.method26532(Class280.aClass280_1, local26, local32, local96, Class278.aClass278_10.method26831(388771377), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local49, 0, 1825539218);
	}

	@OriginalMember(owner = "client!fg", name = "ak", descriptor = "()Ljava/util/List;")
	List method26551() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fg", name = "at", descriptor = "()Ljava/util/List;")
	List method26552() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fg", name = "ad", descriptor = "()Ljava/util/List;")
	List method26553() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fg", name = "av", descriptor = "()Ljava/util/List;")
	List method26554() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fg", name = "an", descriptor = "()Ljava/util/List;")
	List method26555() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fg", name = "dc", descriptor = "(IIZIIIII)V")
	public void method26556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean780 || this.anInt3912 * 1888733211 == arg0) {
			return;
		}
		if (this.aBoolean781 && this.aClass529_5 != null && this.anInt3912 * 1888733211 != arg0) {
			this.aClass529_5.method30729(-628853575);
			this.aClass529_5.method30724(1718003046);
			this.aList7.remove(this.aClass529_5);
		}
		@Pc(40) Class529 local40 = this.method26546((byte) 23);
		if (local40 != null && local40.method30740((byte) -50).method32994((byte) -99) == arg0) {
			this.aClass529_5 = local40;
			this.anInt3912 = local40.method30740((byte) 13).method32994((byte) -91) * 1388761619;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3912 * 1888733211 >= 0) {
			@Pc(73) Iterator local73 = this.aList7.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class529 local80 = (Class529) local73.next();
				if (local80.method30736(1070090322) == Class280.aClass280_11) {
					local80.method30788(2000, 891273370);
					local64 = true;
				}
			}
		}
		this.aClass529_5 = null;
		this.anInt3912 = -1388761619;
		@Pc(100) Class529 local100 = null;
		if (this.aClass529_6 != null && this.aClass529_6.method30740((byte) -36) != null && this.aClass529_6.method30740((byte) -29).method32994((byte) -115) == arg0 && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10) {
			local100 = this.aClass529_6;
			this.aClass529_6 = null;
			this.aBoolean779 = false;
		}
		@Pc(139) float local139;
		if (local100 == null) {
			if (arg2) {
				local139 = arg6;
				@Pc(142) float local142 = (float) arg7;
				@Pc(151) Class463 local151 = new Class463((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3907 * 1824095461 == arg0 ? Class266.aClass266_5.method26652((byte) 58) : Class278.aClass278_1.method26831(-101809325), Class269.aClass269_2, local139, local142, local151, arg3, 255, true, 173884374);
			} else {
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3907 * 1824095461 ? Class266.aClass266_5.method26652((byte) 7) : Class278.aClass278_1.method26831(2088286644), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, -386918690);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local139 = (float) arg1 / 255.0F;
			local100.method30749(local139, 2000, (byte) -53);
		}
		local100.method30726(-1580263899);
		this.method26582(local100, (byte) 59);
		this.aClass529_5 = local100;
		this.anInt3912 = arg0 * 1388761619;
		if (this.aBoolean781) {
			this.aClass529_5.method30728(1896589581);
		}
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(270) Class80_Sub31 local270 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local270.aPacketBit_2.p4(this.anInt3912 * 1888733211);
			client.aClass75_1.method1325(local270, (byte) -94);
		}
	}

	@OriginalMember(owner = "client!fg", name = "dd", descriptor = "(II)V")
	public void method26557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26545(arg0, arg1, false, 0, 0, 0, 0, 0, 78864041);
	}

	@OriginalMember(owner = "client!fg", name = "ap", descriptor = "()Lclient!on;")
	Class463 method26558() {
		return this.aClass463_60;
	}

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "(IB)F")
	float method26559(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class413 local3 = Class378.method28536(arg0, 1001593583);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28978(-781036008);
			local3 = local3.method28974((short) -7455);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fg", name = "cz", descriptor = "(I)V")
	public void method26560(@OriginalArg(0) int arg0) {
		this.method26530(arg0, 255, -1544168945);
	}

	@OriginalMember(owner = "client!fg", name = "az", descriptor = "(II)V")
	public void method26561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean780) {
			return;
		}
		this.anInt3909 = arg0 * -1090358589;
		this.aClass243_71 = new Class243(arg1, 100);
		this.aClass243_72 = new Class243(10);
		this.aClass243_71.method26248(new Class271(this), (byte) 33);
		@Pc(34) Class671 local34 = new Class671(Class427.aClass427_2);
		Class628.method32551(local34, (byte) 66);
		this.method26525(-203270627);
		this.anInt3912 = -1388761619;
		this.aBoolean780 = true;
	}

	@OriginalMember(owner = "client!fg", name = "as", descriptor = "()V")
	public void method26562() {
		if (!this.aBoolean780) {
			return;
		}
		Class611.method32220(1009302523);
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552() != null) {
			if (this.aClass463_60 == null) {
				this.aClass463_60 = new Class463();
			}
			this.aClass463_60.aFloat297 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61.aFloat297;
			this.aClass463_60.aFloat295 = 0.0F;
			this.aClass463_60.aFloat296 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61.aFloat296;
		}
		@Pc(41) Iterator local41 = this.aHashMap6.values().iterator();
		@Pc(48) Interface68 local48;
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			local48.method32986(-399474061);
		}
		local41 = this.aHashMap7.values().iterator();
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			local48.method32986(151508717);
		}
		local41 = this.aList6.iterator();
		while (local41.hasNext()) {
			local48 = (Interface68) local41.next();
			if (local48.method32969(275418512)) {
				this.aHashMap7.remove(local48.method32994((byte) -69));
			} else {
				this.aHashMap6.remove(local48.method32994((byte) -82));
			}
		}
		this.aList6.clear();
		if (this.aClass529_6 != null && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10 && !this.aBoolean779 && client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(132) Class80_Sub31 local132 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local132.aPacketBit_2.p4(this.aClass529_6.method30740((byte) 12).method32994((byte) -112));
			client.aClass75_1.method1325(local132, (byte) -81);
			this.aBoolean779 = true;
		}
		local41 = this.aList8.iterator();
		while (true) {
			label162: while (true) {
				@Pc(170) Class524 local170;
				@Pc(160) Class529 local160;
				do {
					if (!local41.hasNext()) {
						return;
					}
					local160 = (Class529) local41.next();
					local160.method30735(1896589581);
					local160.method30731(291127726);
					local170 = local160.method30732((byte) 24);
				} while (local160.method30806((byte) 0) != this);
				if (Class524.aClass524_7 == local170 || Class524.aClass524_8 == local170) {
					if (local160.method30736(603225712) != Class280.aClass280_11 && local160.method30736(-403962996) != Class280.aClass280_10) {
						@Pc(380) Iterator local380 = this.aHashMap8.keySet().iterator();
						while (local380.hasNext()) {
							@Pc(388) int local388 = (Integer) local380.next();
							@Pc(395) Class260 local395 = (Class260) this.aHashMap8.get(local388);
							if (local395.method26466(-652382640).contains(local160)) {
								local395.method26452(local160, -401655564);
								break;
							}
						}
						local160.method30724(1718003046);
						this.aList7.remove(local160);
					} else if (local160 == this.aClass529_6) {
						this.aBoolean779 = false;
						this.aClass529_6 = null;
						local160.method30724(1718003046);
						this.aList7.remove(local160);
					} else {
						@Pc(216) int local216 = local160.method30740((byte) 82).method32994((byte) -102);
						@Pc(229) boolean local229 = this.method26559(Class278.aClass278_1.method26831(-1908831445), (byte) -5) > 0.0F;
						if (!this.aBoolean781 && local229) {
							if (local216 == this.anInt3912 * 1888733211) {
								this.method26596(local216, 1114751588);
								this.anInt3912 = -1388761619;
							}
							local160.method30724(1718003046);
							this.aList7.remove(local160);
						} else if (this.anInt3913 * -764750875 == local216) {
							this.anInt3913 = 609275411;
							this.aBoolean781 = false;
							local160.method30724(1718003046);
							this.aList7.remove(local160);
							@Pc(280) Iterator local280 = this.aList8.iterator();
							@Pc(287) Class529 local287;
							@Pc(298) int local298;
							do {
								do {
									if (!local280.hasNext()) {
										continue label162;
									}
									local287 = (Class529) local280.next();
								} while (local287.method30736(1844115781) != Class280.aClass280_11);
								local298 = local287.method30740((byte) -85).method32994((byte) -45);
							} while ((local298 != this.anInt3912 * 1888733211 || local287.method30732((byte) 24) != Class524.aClass524_7) && local287.method30732((byte) 24) != Class524.aClass524_2 && local287.method30732((byte) 24) != Class524.aClass524_3 && local287.method30732((byte) 24) != Class524.aClass524_10);
							if (local287.method30732((byte) 24) == Class524.aClass524_7) {
								local287.method30729(-628853575);
							} else {
								local287.method30726(-996497393);
							}
						} else if (local229) {
							if (!this.aBoolean781 || this.anInt3912 * 1888733211 != local216) {
								local160.method30724(1718003046);
								this.aList7.remove(local160);
							}
							if (!this.aBoolean781 && this.anInt3912 * 1888733211 == local216) {
								this.anInt3912 = -1388761619;
								this.aClass529_5 = null;
							}
						}
					}
				} else if (local160.method30732((byte) 24) != Class524.aClass524_6 && local160.method30737(-1697090865) == Class278.aClass278_1.method26831(-1038545633)) {
					@Pc(441) boolean local441 = this.method26559(Class278.aClass278_1.method26831(1312521194), (byte) -2) > 1.0E-4F;
					if (!local441) {
						local160.method30788(150, 1842936105);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "de", descriptor = "(Lclient!fe;I)V")
	public void method26563(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(22) int local22 = arg0.anIntArrayArray47[arg1][0];
		@Pc(26) int local26 = local22 >> 8;
		@Pc(32) int local32 = local22 >> 5 & 0x7;
		@Pc(49) int local49;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local49 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local49 > 0) {
				local26 = arg0.anIntArrayArray47[arg1][local49];
			}
		}
		local49 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local49 = (int) ((double) arg0.anIntArray372[arg1] + Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1]));
		}
		@Pc(96) int local96 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		this.method26532(Class280.aClass280_1, local26, local32, local96, Class278.aClass278_10.method26831(-1264938363), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local49, 0, 1928069152);
	}

	@OriginalMember(owner = "client!fg", name = "bg", descriptor = "()V")
	public void method26564() {
		Class350.method28007((byte) 122);
	}

	@OriginalMember(owner = "client!fg", name = "bl", descriptor = "(Lclient!rh;II)V")
	public void method26565(@OriginalArg(0) Class529 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class260 local9 = (Class260) this.aHashMap8.get(arg1);
		if (local9 == null) {
			local9 = new Class260(this);
			this.aHashMap8.put(arg1, local9);
		}
		if (!local9.method26454(arg0, (byte) 47)) {
			arg0.method30790(arg2, true, -1015167044);
			local9.method26451(arg0, 1394598996);
		}
	}

	@OriginalMember(owner = "client!fg", name = "br", descriptor = "(Lclient!rh;II)V")
	public void method26566(@OriginalArg(0) Class529 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class260 local9 = (Class260) this.aHashMap8.get(arg1);
		if (local9 == null) {
			local9 = new Class260(this);
			this.aHashMap8.put(arg1, local9);
		}
		if (!local9.method26454(arg0, (byte) 41)) {
			arg0.method30790(arg2, true, -537802631);
			local9.method26451(arg0, -973501812);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bn", descriptor = "(Lclient!rh;II)V")
	public void method26567(@OriginalArg(0) Class529 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class260 local9 = (Class260) this.aHashMap8.get(arg1);
		if (local9 == null) {
			local9 = new Class260(this);
			this.aHashMap8.put(arg1, local9);
		}
		if (!local9.method26454(arg0, (byte) 5)) {
			arg0.method30790(arg2, true, 270668521);
			local9.method26451(arg0, 829829800);
		}
	}

	@OriginalMember(owner = "client!fg", name = "ba", descriptor = "(I)V")
	public void method26568(@OriginalArg(0) int arg0) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26466(920400307);
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class529 local23 = (Class529) local16.next();
			if (!local23.method30748(-1389479762)) {
				local23.method30726(-2088145836);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "bt", descriptor = "(I)V")
	public void method26569(@OriginalArg(0) int arg0) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26466(1475441463);
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class529 local23 = (Class529) local16.next();
			if (!local23.method30748(-1367733557)) {
				local23.method30726(-2024545473);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "bs", descriptor = "(I)V")
	public void method26570(@OriginalArg(0) int arg0) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26466(-1387116052);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class529 local24 = (Class529) local17.next();
			local24.method30788(50, -411175352);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bj", descriptor = "(I)V")
	public void method26571(@OriginalArg(0) int arg0) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26466(-1022347691);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class529 local24 = (Class529) local17.next();
			local24.method30788(50, -481550062);
		}
	}

	@OriginalMember(owner = "client!fg", name = "by", descriptor = "(I)V")
	public void method26572(@OriginalArg(0) int arg0) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26466(-1024795377);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class529 local24 = (Class529) local17.next();
			local24.method30788(50, -2037964879);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bk", descriptor = "(I)V")
	public void method26573(@OriginalArg(0) int arg0) {
		@Pc(6) Class260 local6 = (Class260) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method26466(-1143173781);
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class529 local23 = (Class529) local16.next();
			local23.method30768((byte) 37);
		}
	}

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "(Lclient!wc;I)Lclient!rh;")
	Class529 method26574(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList8.iterator();
		@Pc(17) Class529 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3909 * -418099733) {
					return null;
				}
				@Pc(42) Class529 local42 = arg0.method33013(-1517767336);
				this.aList8.add(local42);
				return local42;
			}
			local17 = (Class529) local10.next();
			local6++;
		} while (local17.method30732((byte) 24) != Class524.aClass524_1);
		local17.method30762(arg0, (byte) 3);
		return local17;
	}

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "(Lclient!rh;IIB)V")
	public void method26575(@OriginalArg(0) Class529 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class260 local9 = (Class260) this.aHashMap8.get(arg1);
		if (local9 == null) {
			local9 = new Class260(this);
			this.aHashMap8.put(arg1, local9);
		}
		if (!local9.method26454(arg0, (byte) -51)) {
			arg0.method30790(arg2, true, -1183253480);
			local9.method26451(arg0, -17171758);
		}
	}

	@OriginalMember(owner = "client!fg", name = "dt", descriptor = "(Lclient!fe;ILclient!alf;)V")
	public void method26576(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (arg2.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 || !arg2.method24604(1424714764))) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray47[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local67 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local67 > 0) {
				local40 = arg0.anIntArrayArray47[arg1][local67];
			}
		}
		local67 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local67 = (int) (Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1])) + arg0.anIntArray372[arg1];
		}
		@Pc(113) int local113 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		if (local50 != 0) {
			if (arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) 19) == 0) {
					return;
				}
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -33) == 0) {
				return;
			}
			if (arg0.anInt3900 * -621643601 != -1) {
				@Pc(160) int local160 = 0;
				if (arg2 instanceof Class120_Sub1_Sub1_Sub1) {
					local160 = ((Class120_Sub1_Sub1_Sub1) arg2).method18987((byte) 0);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub5) {
					local160 = ((Class120_Sub1_Sub1_Sub5) arg2).method24341(1089055481);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub4) {
					local160 = ((Class120_Sub1_Sub1_Sub4) arg2).method24203(362671567);
				}
				if (local160 != 0 && local160 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18987((byte) 0) && client.anInt3431 * -1402260617 != local160) {
					local113 = arg0.anInt3900 * -621643601 * local113 / 100;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 255) {
						local113 = 255;
					}
				}
			}
			@Pc(222) Class463 local222 = arg2.method24552().aClass463_61;
			@Pc(230) int local230 = (int) local222.aFloat297 - 256 >> 9;
			@Pc(238) int local238 = (int) local222.aFloat296 - 256 >> 9;
			@Pc(251) Class463 local251 = new Class463((float) (local230 << 9), 0.0F, (float) (local238 << 9));
			@Pc(256) int local256 = arg2.aByte99 << 24;
			this.method26532(Class280.aClass280_7, local40, local46, local113, Class278.aClass278_10.method26831(2068251840), arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 ? Class269.aClass269_5 : Class269.aClass269_4, 0.0F, (float) (local50 << 9), local251, local256, local67, 0, 1767668047);
		} else if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
			this.method26532(Class280.aClass280_6, local40, local46, local113, Class278.aClass278_6.method26831(-1142502632), Class269.aClass269_5, 0.0F, 0.0F, null, arg2.aByte99, local67, 0, 1572937082);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bv", descriptor = "(III)V")
	public void method26577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class266.aClass266_4.method26652((byte) 28);
		if (Class378.method28536(arg0, -1551683990) == null && (arg1 == local3 || Class378.method28536(arg1, -1723583999) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class75.method1345(arg0, arg1 == local3 ? -1 : arg1, local20, null, 995088333);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bp", descriptor = "(III)V")
	public void method26578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class266.aClass266_4.method26652((byte) 27);
		if (Class378.method28536(arg0, 1655570102) == null && (arg1 == local3 || Class378.method28536(arg1, -1982711704) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class75.method1345(arg0, arg1 == local3 ? -1 : arg1, local20, null, 995088333);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "(II)V")
	public void method26579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class413 local3 = Class378.method28536(arg0, -1704036156);
		if (local3 != null) {
			@Pc(10) float local10 = (float) arg1 * 1.5258789E-5F;
			local3.method28973(local10, -632783354);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bo", descriptor = "(II)V")
	public void method26580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class413 local3 = Class378.method28536(arg0, 767577864);
		if (local3 != null) {
			@Pc(10) float local10 = (float) arg1 * 1.5258789E-5F;
			local3.method28973(local10, -632783354);
		}
	}

	@OriginalMember(owner = "client!fg", name = "cc", descriptor = "(Lclient!rh;)V")
	public void method26581(@OriginalArg(0) Class529 arg0) {
		arg0.method30733(this, (byte) 107);
		this.aList7.add(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "(Lclient!rh;B)V")
	public void method26582(@OriginalArg(0) Class529 arg0, @OriginalArg(1) byte arg1) {
		arg0.method30733(this, (byte) 127);
		this.aList7.add(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "bw", descriptor = "([I)V")
	void method26583(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean780 || arg0 == null) {
			return;
		}
		@Pc(9) int[] local9 = arg0;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) int local19 = local9[local11];
			this.method26518(local19, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bz", descriptor = "()V")
	void method26584() {
		@Pc(4) Class264 local4 = new Class264(this);
		@Pc(9) Class277 local9 = new Class277(this);
		@Pc(14) Class258 local14 = new Class258(this);
		@Pc(19) Class259 local19 = new Class259(this);
		@Pc(24) Class279 local24 = new Class279(this);
		Class75.method1345(Class266.aClass266_2.method26652((byte) -74), Class266.aClass266_4.method26652((byte) -70), 0.2F, local4, 995088333);
		Class75.method1345(Class266.aClass266_3.method26652((byte) 80), Class266.aClass266_4.method26652((byte) -1), 1.0F, local9, 995088333);
		Class75.method1345(Class266.aClass266_5.method26652((byte) -15), Class266.aClass266_4.method26652((byte) -10), 1.0F, local14, 995088333);
		Class75.method1345(Class266.aClass266_1.method26652((byte) -18), Class266.aClass266_4.method26652((byte) -46), 0.8F, local19, 995088333);
		Class75.method1345(Class266.aClass266_6.method26652((byte) 33), Class266.aClass266_4.method26652((byte) 66), 1.0F, local24, 995088333);
		Class75.method1345(Class278.aClass278_1.method26831(359309990), Class266.aClass266_3.method26652((byte) 35), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_3.method26831(1171195776), Class266.aClass266_6.method26652((byte) -21), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_5.method26831(931061706), Class266.aClass266_2.method26652((byte) -37), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_6.method26831(-761936130), Class266.aClass266_2.method26652((byte) 20), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_10.method26831(-396555992), Class266.aClass266_2.method26652((byte) 63), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_2.method26831(-1597566242), Class266.aClass266_2.method26652((byte) 2), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_7.method26831(-2099249577), Class266.aClass266_2.method26652((byte) 7), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_8.method26831(-597001140), Class266.aClass266_1.method26652((byte) 42), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_4.method26831(667158590), Class278.aClass278_8.method26831(460910768), 1.0F, null, 995088333);
		Class75.method1345(Class278.aClass278_9.method26831(-2101445341), Class278.aClass278_8.method26831(-419978185), 1.0F, null, 995088333);
		Class378.method28536(Class278.aClass278_1.method26831(1236374978), 775015598).method28973(0.75F, -632783354);
	}

	@OriginalMember(owner = "client!fg", name = "bi", descriptor = "(I)V")
	public void method26585(@OriginalArg(0) int arg0) {
		if (this.aBoolean780 && arg0 >= 0) {
			this.method26595(arg0, false, (byte) -61);
		}
	}

	@OriginalMember(owner = "client!fg", name = "bu", descriptor = "(I)V")
	public void method26586(@OriginalArg(0) int arg0) {
		if (this.aBoolean780 && arg0 >= 0) {
			this.method26595(arg0, false, (byte) -8);
		}
	}

	@OriginalMember(owner = "client!fg", name = "aa", descriptor = "()Lclient!ej;")
	Class243 method26587() {
		return this.aClass243_71;
	}

	@OriginalMember(owner = "client!fg", name = "bq", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26588(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "bd", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26589(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "cd", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26590(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "cv", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "ct", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26592(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "cn", descriptor = "(IZ)Lclient!wc;")
	Interface68 method26593(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(19) Interface68 local19 = (Interface68) (arg1 ? this.aClass243_72.method26282((long) arg0) : this.aClass243_71.method26282((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface68) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface68) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "(III)V")
	public void method26594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class413 local3 = Class378.method28536(arg0, -287151158);
		if (local3 != null) {
			@Pc(10) float local10 = (float) arg1 * 1.5258789E-5F;
			local3.method28973(local10, -632783354);
		}
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "(IZB)Lclient!wc;")
	Interface68 method26595(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (!this.aBoolean780) {
			return null;
		}
		@Pc(10) Interface68 local10 = this.method26539(arg0, arg1, -1797411259);
		if (local10 == null) {
			@Pc(18) Class268 local18 = new Class268(this);
			local10 = Class657.method33229(arg1 ? Class238.aClass480_88 : Class9.aClass480_1, arg0, local18, arg1, this.aClass243_73, -1282763565);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fg", name = "ao", descriptor = "(II)V")
	void method26596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(15) Class80_Sub31 local15 = Class623.method32440(Class443.aClass443_119, client.aClass75_1.aClass22_1, -191270971);
			local15.aPacketBit_2.p4(arg0);
			client.aClass75_1.method1325(local15, (byte) -45);
		}
	}

	@OriginalMember(owner = "client!fg", name = "cu", descriptor = "(Lclient!rh;)V")
	public void method26597(@OriginalArg(0) Class529 arg0) {
		arg0.method30733(this, (byte) 94);
		this.aList7.add(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "(I)V")
	public void method26598(@OriginalArg(0) int arg0) {
		this.anInt3907 = arg0 * 1309925613;
	}

	@OriginalMember(owner = "client!fg", name = "dl", descriptor = "()Lclient!rh;")
	Class529 method26599() {
		@Pc(3) Iterator local3 = this.aList7.iterator();
		@Pc(10) Class529 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class529) local3.next();
		} while (local10.method30736(386461029) != Class280.aClass280_11 || local10.method30732((byte) 24) != Class524.aClass524_5);
		return local10;
	}

	@OriginalMember(owner = "client!fg", name = "cj", descriptor = "(Lclient!fz;Ljava/lang/Object;IIIILclient!fn;FFLclient!on;IIZ)Lclient!rh;")
	public Class529 method26600(@OriginalArg(0) Class280 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class269 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class463 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean780) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class269.aClass269_5 && !this.method26535(this.aClass463_60, arg9, arg8, 1620717460)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface68 local52 = this.method26595(arg2, arg12, (byte) -10);
			@Pc(57) Class529 local57 = this.method26574(local52, 2064194285);
			if (local57 == null) {
				return null;
			}
			local57.method30733(arg1, (byte) 99);
			local57.method30738(arg5, 682929157);
			if (arg6 != Class269.aClass269_5) {
				local57.method30798(true, 1662585858);
				local57.method30741(arg9, -1488020214);
				local57.method30745(arg7, 2050506246);
				local57.method30746(arg8, -1951409588);
				if (arg6 == Class269.aClass269_1) {
					local57.method30730(this.anInterface55_3, (short) -10939);
				} else if (arg6 == Class269.aClass269_3) {
					local57.method30730(this.anInterface55_1, (short) -29966);
				} else if (arg6 == Class269.aClass269_4) {
					local57.method30730(this.anInterface55_2, (short) 10537);
				} else if (arg6 == Class269.aClass269_2) {
					local57.method30730(this.anInterface55_4, (short) -15841);
				} else {
					local57.method30798(false, 1813387314);
				}
			}
			local57.method30749(local41, 0, (byte) -43);
			local57.method30750(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3, (short) -16630);
			local57.method30751(local46, -1756088078);
			local57.method30759(arg0, (byte) -116);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fg", name = "ck", descriptor = "(Lclient!fz;IIIILclient!fn;FFLclient!on;III)V")
	public void method26601(@OriginalArg(0) Class280 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class269 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class463 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean780) {
			return;
		}
		@Pc(20) Class529 local20 = this.method26536(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, 11916295);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30726(-1819433954);
		} else {
			local20.method30790(arg11, false, -182603223);
		}
		this.method26582(local20, (byte) 66);
	}

	@OriginalMember(owner = "client!fg", name = "ca", descriptor = "(Lclient!fz;IIIILclient!fn;FFLclient!on;III)V")
	public void method26602(@OriginalArg(0) Class280 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class269 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class463 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean780) {
			return;
		}
		@Pc(20) Class529 local20 = this.method26536(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, 1539535147);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30726(-2117427017);
		} else {
			local20.method30790(arg11, false, -2058439687);
		}
		this.method26582(local20, (byte) -4);
	}

	@OriginalMember(owner = "client!fg", name = "cr", descriptor = "(II)V")
	public void method26603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3912 * 1888733211) {
			return;
		}
		if (this.aClass529_6 != null) {
			this.aClass529_6.method30788(0, 1360247321);
			this.method26582(this.aClass529_6, (byte) 54);
			this.aClass529_6 = null;
		}
		@Pc(42) Class529 local42 = this.method26536(Class280.aClass280_11, this, arg0, 0, arg1, Class278.aClass278_1.method26831(328013160), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, -972549880);
		if (local42 != null) {
			local42.method30768((byte) 16);
			this.aClass529_6 = local42;
		}
		this.aBoolean779 = false;
	}

	@OriginalMember(owner = "client!fg", name = "ci", descriptor = "()I")
	public int method26604() {
		return this.anInt3912 * 1888733211;
	}

	@OriginalMember(owner = "client!fg", name = "cm", descriptor = "()I")
	public int method26605() {
		return this.anInt3912 * 1888733211;
	}

	@OriginalMember(owner = "client!fg", name = "ay", descriptor = "(I)I")
	public int method26606(@OriginalArg(0) int arg0) {
		return this.anInt3912 * 1888733211;
	}

	@OriginalMember(owner = "client!fg", name = "cg", descriptor = "(I)V")
	public void method26607(@OriginalArg(0) int arg0) {
		this.anInt3907 = arg0 * 1309925613;
	}

	@OriginalMember(owner = "client!fg", name = "al", descriptor = "(I)V")
	public void method26608(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList7.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class529 local10 = (Class529) local3.next();
			if (local10.method30736(-1458612633) == Class280.aClass280_11) {
				local10.method30788(500, 1326242729);
				if (local10.method30740((byte) 96).method32994((byte) -122) == this.anInt3912 * 1888733211) {
					this.method26596(this.anInt3912 * 1888733211, -1017257801);
					break;
				}
			}
		}
		this.aClass529_5 = null;
		this.anInt3912 = -1388761619;
	}

	@OriginalMember(owner = "client!fg", name = "cw", descriptor = "()I")
	public int method26609() {
		return this.anInt3907 * 1824095461;
	}

	@OriginalMember(owner = "client!fg", name = "cl", descriptor = "()I")
	public int method26610() {
		return this.anInt3907 * 1824095461;
	}

	@OriginalMember(owner = "client!fg", name = "cx", descriptor = "(I)V")
	void method26611(@OriginalArg(0) int arg0) {
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(15) Class80_Sub31 local15 = Class623.method32440(Class443.aClass443_119, client.aClass75_1.aClass22_1, -191270971);
			local15.aPacketBit_2.p4(arg0);
			client.aClass75_1.method1325(local15, (byte) -49);
		}
	}

	@OriginalMember(owner = "client!fg", name = "cf", descriptor = "(I)V")
	void method26612(@OriginalArg(0) int arg0) {
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(15) Class80_Sub31 local15 = Class623.method32440(Class443.aClass443_119, client.aClass75_1.aClass22_1, -191270971);
			local15.aPacketBit_2.p4(arg0);
			client.aClass75_1.method1325(local15, (byte) -88);
		}
	}

	@OriginalMember(owner = "client!fg", name = "co", descriptor = "(I)V")
	public void method26613(@OriginalArg(0) int arg0) {
		this.method26530(arg0, 255, -600510934);
	}

	@OriginalMember(owner = "client!fg", name = "bh", descriptor = "(III)V")
	public void method26614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class266.aClass266_4.method26652((byte) -23);
		if (Class378.method28536(arg0, -182258656) == null && (arg1 == local3 || Class378.method28536(arg1, -284710599) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class75.method1345(arg0, arg1 == local3 ? -1 : arg1, local20, null, 995088333);
		}
	}

	@OriginalMember(owner = "client!fg", name = "cq", descriptor = "(I)V")
	public void method26615(@OriginalArg(0) int arg0) {
		this.method26530(arg0, 255, 1253115257);
	}

	@OriginalMember(owner = "client!fg", name = "dg", descriptor = "(I)V")
	public void method26616(@OriginalArg(0) int arg0) {
		this.method26530(arg0, 255, 1875079203);
	}

	@OriginalMember(owner = "client!fg", name = "dh", descriptor = "(II)V")
	public void method26617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26545(arg0, arg1, false, 0, 0, 0, 0, 0, 78864041);
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)Lclient!ej;")
	Class243 method26618(@OriginalArg(0) int arg0) {
		return this.aClass243_71;
	}

	@OriginalMember(owner = "client!fg", name = "bc", descriptor = "(I)F")
	float method26619(@OriginalArg(0) int arg0) {
		@Pc(3) Class413 local3 = Class378.method28536(arg0, 1319545591);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28978(1167024453);
			local3 = local3.method28974((short) -3125);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fg", name = "dn", descriptor = "(IIZIIIII)V")
	public void method26620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean780 || this.anInt3912 * 1888733211 == arg0) {
			return;
		}
		if (this.aBoolean781 && this.aClass529_5 != null && this.anInt3912 * 1888733211 != arg0) {
			this.aClass529_5.method30729(-628853575);
			this.aClass529_5.method30724(1718003046);
			this.aList7.remove(this.aClass529_5);
		}
		@Pc(40) Class529 local40 = this.method26546((byte) 113);
		if (local40 != null && local40.method30740((byte) 30).method32994((byte) -112) == arg0) {
			this.aClass529_5 = local40;
			this.anInt3912 = local40.method30740((byte) 108).method32994((byte) -45) * 1388761619;
			return;
		}
		@Pc(64) boolean local64 = false;
		if (this.anInt3912 * 1888733211 >= 0) {
			@Pc(73) Iterator local73 = this.aList7.iterator();
			while (local73.hasNext()) {
				@Pc(80) Class529 local80 = (Class529) local73.next();
				if (local80.method30736(2036693295) == Class280.aClass280_11) {
					local80.method30788(2000, 2082006883);
					local64 = true;
				}
			}
		}
		this.aClass529_5 = null;
		this.anInt3912 = -1388761619;
		@Pc(100) Class529 local100 = null;
		if (this.aClass529_6 != null && this.aClass529_6.method30740((byte) -31) != null && this.aClass529_6.method30740((byte) 1).method32994((byte) -45) == arg0 && this.aClass529_6.method30732((byte) 24) == Class524.aClass524_10) {
			local100 = this.aClass529_6;
			this.aClass529_6 = null;
			this.aBoolean779 = false;
		}
		@Pc(139) float local139;
		if (local100 == null) {
			if (arg2) {
				local139 = arg6;
				@Pc(142) float local142 = (float) arg7;
				@Pc(151) Class463 local151 = new Class463((float) arg4, 0.0F, (float) arg5);
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, this.anInt3907 * 1824095461 == arg0 ? Class266.aClass266_5.method26652((byte) -16) : Class278.aClass278_1.method26831(713610914), Class269.aClass269_2, local139, local142, local151, arg3, 255, true, 2139923832);
			} else {
				local100 = this.method26536(Class280.aClass280_11, this, arg0, 0, local64 ? 0 : arg1, arg0 == this.anInt3907 * 1824095461 ? Class266.aClass266_5.method26652((byte) 4) : Class278.aClass278_1.method26831(-271654139), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, 460735474);
			}
		}
		if (local100 == null) {
			return;
		}
		if (local64) {
			local139 = (float) arg1 / 255.0F;
			local100.method30749(local139, 2000, (byte) -73);
		}
		local100.method30726(-1697435176);
		this.method26582(local100, (byte) -84);
		this.aClass529_5 = local100;
		this.anInt3912 = arg0 * 1388761619;
		if (this.aBoolean781) {
			this.aClass529_5.method30728(1896589581);
		}
		if (client.aClass75_1.aClass22_1 != null && Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			@Pc(270) Class80_Sub31 local270 = Class623.method32440(Class443.aClass443_12, client.aClass75_1.aClass22_1, -191270971);
			local270.aPacketBit_2.p4(this.anInt3912 * 1888733211);
			client.aClass75_1.method1325(local270, (byte) -70);
		}
	}

	@OriginalMember(owner = "client!fg", name = "ce", descriptor = "(Lclient!on;Lclient!on;F)Z")
	boolean method26621(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class463 local3 = Class463.method29487(arg1, arg0);
		return !(local3.method29481() >= arg2);
	}

	@OriginalMember(owner = "client!fg", name = "ae", descriptor = "()Lclient!on;")
	Class463 method26622() {
		return this.aClass463_60;
	}

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "(II)V")
	public void method26623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean780 || this.aBoolean781 && this.anInt3913 * -764750875 == arg0) {
			return;
		}
		if (this.aBoolean781 && arg0 != this.anInt3913 * -764750875) {
			@Pc(26) Iterator local26 = this.aList8.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class529 local33 = (Class529) local26.next();
				if (local33.method30736(-371045446) == Class280.aClass280_10) {
					local33.method30724(1718003046);
					this.aList7.remove(local33);
					this.aBoolean781 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean781 && this.aClass529_5 != null) {
			this.aClass529_5.method30728(1896589581);
		}
		@Pc(85) Class529 local85 = this.method26536(Class280.aClass280_10, this, arg0, 0, arg1, Class278.aClass278_1.method26831(11464923), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 255, true, -681483827);
		if (local85 != null) {
			local85.method30726(-1383277771);
			this.method26582(local85, (byte) 26);
			this.aBoolean781 = true;
			this.anInt3913 = arg0 * -609275411;
		}
	}

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "(IIII)V")
	public void method26624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = Class266.aClass266_4.method26652((byte) 73);
		if (Class378.method28536(arg0, 1468296619) == null && (arg1 == local3 || Class378.method28536(arg1, -470732813) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class75.method1345(arg0, arg1 == local3 ? -1 : arg1, local20, null, 995088333);
		}
	}

	@OriginalMember(owner = "client!fg", name = "du", descriptor = "(Lclient!fe;ILclient!alf;)V")
	public void method26625(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (arg2.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 || !arg2.method24604(851004997))) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray47[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local67 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local67 > 0) {
				local40 = arg0.anIntArrayArray47[arg1][local67];
			}
		}
		local67 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local67 = (int) (Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1])) + arg0.anIntArray372[arg1];
		}
		@Pc(113) int local113 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		if (local50 != 0) {
			if (arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) -43) == 0) {
					return;
				}
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) 23) == 0) {
				return;
			}
			if (arg0.anInt3900 * -621643601 != -1) {
				@Pc(160) int local160 = 0;
				if (arg2 instanceof Class120_Sub1_Sub1_Sub1) {
					local160 = ((Class120_Sub1_Sub1_Sub1) arg2).method18987((byte) 0);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub5) {
					local160 = ((Class120_Sub1_Sub1_Sub5) arg2).method24341(862333965);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub4) {
					local160 = ((Class120_Sub1_Sub1_Sub4) arg2).method24203(1675978272);
				}
				if (local160 != 0 && local160 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18987((byte) 0) && client.anInt3431 * -1402260617 != local160) {
					local113 = arg0.anInt3900 * -621643601 * local113 / 100;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 255) {
						local113 = 255;
					}
				}
			}
			@Pc(222) Class463 local222 = arg2.method24552().aClass463_61;
			@Pc(230) int local230 = (int) local222.aFloat297 - 256 >> 9;
			@Pc(238) int local238 = (int) local222.aFloat296 - 256 >> 9;
			@Pc(251) Class463 local251 = new Class463((float) (local230 << 9), 0.0F, (float) (local238 << 9));
			@Pc(256) int local256 = arg2.aByte99 << 24;
			this.method26532(Class280.aClass280_7, local40, local46, local113, Class278.aClass278_10.method26831(-222028423), arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 ? Class269.aClass269_5 : Class269.aClass269_4, 0.0F, (float) (local50 << 9), local251, local256, local67, 0, 1951409583);
		} else if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
			this.method26532(Class280.aClass280_6, local40, local46, local113, Class278.aClass278_6.method26831(1650584602), Class269.aClass269_5, 0.0F, 0.0F, null, arg2.aByte99, local67, 0, 1517448614);
		}
	}

	@OriginalMember(owner = "client!fg", name = "ds", descriptor = "(Lclient!fe;ILclient!alf;)V")
	public void method26626(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (arg2.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 || !arg2.method24604(607966227))) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray47[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local67 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local67 > 0) {
				local40 = arg0.anIntArrayArray47[arg1][local67];
			}
		}
		local67 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local67 = (int) (Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1])) + arg0.anIntArray372[arg1];
		}
		@Pc(113) int local113 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		if (local50 != 0) {
			if (arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) 54) == 0) {
					return;
				}
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -72) == 0) {
				return;
			}
			if (arg0.anInt3900 * -621643601 != -1) {
				@Pc(160) int local160 = 0;
				if (arg2 instanceof Class120_Sub1_Sub1_Sub1) {
					local160 = ((Class120_Sub1_Sub1_Sub1) arg2).method18987((byte) 0);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub5) {
					local160 = ((Class120_Sub1_Sub1_Sub5) arg2).method24341(2059392431);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub4) {
					local160 = ((Class120_Sub1_Sub1_Sub4) arg2).method24203(1304149136);
				}
				if (local160 != 0 && local160 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18987((byte) 0) && client.anInt3431 * -1402260617 != local160) {
					local113 = arg0.anInt3900 * -621643601 * local113 / 100;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 255) {
						local113 = 255;
					}
				}
			}
			@Pc(222) Class463 local222 = arg2.method24552().aClass463_61;
			@Pc(230) int local230 = (int) local222.aFloat297 - 256 >> 9;
			@Pc(238) int local238 = (int) local222.aFloat296 - 256 >> 9;
			@Pc(251) Class463 local251 = new Class463((float) (local230 << 9), 0.0F, (float) (local238 << 9));
			@Pc(256) int local256 = arg2.aByte99 << 24;
			this.method26532(Class280.aClass280_7, local40, local46, local113, Class278.aClass278_10.method26831(899360406), arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 ? Class269.aClass269_5 : Class269.aClass269_4, 0.0F, (float) (local50 << 9), local251, local256, local67, 0, 1553480421);
		} else if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
			this.method26532(Class280.aClass280_6, local40, local46, local113, Class278.aClass278_6.method26831(-1065963326), Class269.aClass269_5, 0.0F, 0.0F, null, arg2.aByte99, local67, 0, 1763779710);
		}
	}

	@OriginalMember(owner = "client!fg", name = "dw", descriptor = "(Lclient!fe;ILclient!alf;)V")
	public void method26627(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (arg2.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 || !arg2.method24604(852627799))) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray47[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local67 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local67 > 0) {
				local40 = arg0.anIntArrayArray47[arg1][local67];
			}
		}
		local67 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local67 = (int) (Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1])) + arg0.anIntArray372[arg1];
		}
		@Pc(113) int local113 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		if (local50 != 0) {
			if (arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
				if (Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) 59) == 0) {
					return;
				}
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) 88) == 0) {
				return;
			}
			if (arg0.anInt3900 * -621643601 != -1) {
				@Pc(160) int local160 = 0;
				if (arg2 instanceof Class120_Sub1_Sub1_Sub1) {
					local160 = ((Class120_Sub1_Sub1_Sub1) arg2).method18987((byte) 0);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub5) {
					local160 = ((Class120_Sub1_Sub1_Sub5) arg2).method24341(1362910417);
				} else if (arg2 instanceof Class120_Sub1_Sub1_Sub4) {
					local160 = ((Class120_Sub1_Sub1_Sub4) arg2).method24203(1564376056);
				}
				if (local160 != 0 && local160 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18987((byte) 0) && client.anInt3431 * -1402260617 != local160) {
					local113 = arg0.anInt3900 * -621643601 * local113 / 100;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 255) {
						local113 = 255;
					}
				}
			}
			@Pc(222) Class463 local222 = arg2.method24552().aClass463_61;
			@Pc(230) int local230 = (int) local222.aFloat297 - 256 >> 9;
			@Pc(238) int local238 = (int) local222.aFloat296 - 256 >> 9;
			@Pc(251) Class463 local251 = new Class463((float) (local230 << 9), 0.0F, (float) (local238 << 9));
			@Pc(256) int local256 = arg2.aByte99 << 24;
			this.method26532(Class280.aClass280_7, local40, local46, local113, Class278.aClass278_10.method26831(-2127758695), arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 ? Class269.aClass269_5 : Class269.aClass269_4, 0.0F, (float) (local50 << 9), local251, local256, local67, 0, 1704950109);
		} else if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
			this.method26532(Class280.aClass280_6, local40, local46, local113, Class278.aClass278_6.method26831(-1231857723), Class269.aClass269_5, 0.0F, 0.0F, null, arg2.aByte99, local67, 0, 1783705199);
		}
	}

	@OriginalMember(owner = "client!fg", name = "dr", descriptor = "(Lclient!fe;I)V")
	public void method26628(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(22) int local22 = arg0.anIntArrayArray47[arg1][0];
		@Pc(26) int local26 = local22 >> 8;
		@Pc(32) int local32 = local22 >> 5 & 0x7;
		@Pc(49) int local49;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local49 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local49 > 0) {
				local26 = arg0.anIntArrayArray47[arg1][local49];
			}
		}
		local49 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local49 = (int) ((double) arg0.anIntArray372[arg1] + Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1]));
		}
		@Pc(96) int local96 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		this.method26532(Class280.aClass280_1, local26, local32, local96, Class278.aClass278_10.method26831(-375354701), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local49, 0, 1474168521);
	}

	@OriginalMember(owner = "client!fg", name = "dx", descriptor = "(Lclient!fe;I)V")
	public void method26629(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(22) int local22 = arg0.anIntArrayArray47[arg1][0];
		@Pc(26) int local26 = local22 >> 8;
		@Pc(32) int local32 = local22 >> 5 & 0x7;
		@Pc(49) int local49;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local49 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local49 > 0) {
				local26 = arg0.anIntArrayArray47[arg1][local49];
			}
		}
		local49 = 256;
		if (arg0.anIntArray372 != null && arg0.anIntArray371 != null) {
			local49 = (int) ((double) arg0.anIntArray372[arg1] + Math.random() * (double) (arg0.anIntArray371[arg1] - arg0.anIntArray372[arg1]));
		}
		@Pc(96) int local96 = arg0.anIntArray373 == null ? 255 : arg0.anIntArray373[arg1];
		this.method26532(Class280.aClass280_1, local26, local32, local96, Class278.aClass278_10.method26831(379371778), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local49, 0, 1874970545);
	}

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "(I)Ljava/util/List;")
	List method26630(@OriginalArg(0) int arg0) {
		return this.aList7;
	}
}
