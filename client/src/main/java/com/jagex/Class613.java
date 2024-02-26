package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class613 implements Interface11 {

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static final int anInt5407 = 0;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public static final int anInt5408 = 1;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	static final int anInt5409 = 16777215;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	public static final int anInt5413 = -1;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	static final int anInt5420 = 70;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "Z")
	public boolean aBoolean932 = false;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	public int anInt5410 = 109651349;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public int anInt5412 = 1661677731;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public int anInt5405 = -607276770;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	int anInt5414 = -697617141;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	int anInt5419 = -1584726075;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	int anInt5421 = 1620413373;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	int anInt5417 = 315931871;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public int anInt5418 = 0;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	public int anInt5411 = 0;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public int anInt5415 = -310925243;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Ljava/lang/String;")
	String aString232 = "";

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	public int anInt5416 = -167475813;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	public int anInt5422 = 0;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	public int anInt5423 = 0;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
	public int anInt5424 = 0;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	int anInt5426 = 1756492983;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	int anInt5406 = -2096244417;

	@OriginalMember(owner = "client!vi", name = "ax", descriptor = "I")
	int anInt5425 = 1425997191;

	@OriginalMember(owner = "client!vi", name = "ay", descriptor = "I")
	int anInt5427 = -1677625785;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!vf;")
	final Class156 aClass156_1;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!an;")
	final Interface12 anInterface12_13;

	@OriginalMember(owner = "client!vi", name = "axd", descriptor = "(Lclient!yp;I)V")
	static void method32262(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class320 local18 = (Class320) Class157.aClass41_Sub13_2.method18054(local12, -428175056);
		if (local18.aString178 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local18.aString178;
		}
	}

	@OriginalMember(owner = "client!vi", name = "bbp", descriptor = "(Lclient!yp;I)V")
	static void method32263(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "(IB)V")
	static void method32264(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class77.anInt251 = arg0 * -2019482663;
		Class80_Sub3.aClass243_20.method26256(1693912082);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(ILclient!vf;Lclient!an;)V")
	Class613(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Interface12 arg2) {
		this.aClass156_1 = arg1;
		this.anInterface12_13 = arg2;
	}

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1814988603);
			if (local3 == 0) {
				return;
			}
			this.method32236(arg0, local3, 180593781);
		}
	}

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(766974706);
			if (local3 == 0) {
				return;
			}
			this.method32236(arg0, local3, 180593781);
		}
	}

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "(Lclient!ald;II)V")
	void method32236(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5410 = arg0.method23210((byte) 72) * -109651349;
		} else if (arg1 == 2) {
			this.anInt5412 = arg0.method23180(1710327153) * -101396643;
			this.aBoolean932 = true;
		} else if (arg1 == 3) {
			this.anInt5414 = arg0.method23210((byte) 37) * 697617141;
		} else if (arg1 == 4) {
			this.anInt5421 = arg0.method23210((byte) 23) * -1620413373;
		} else if (arg1 == 5) {
			this.anInt5419 = arg0.method23210((byte) 32) * 1584726075;
		} else if (arg1 == 6) {
			this.anInt5417 = arg0.method23210((byte) 76) * -315931871;
		} else if (arg1 == 7) {
			this.anInt5418 = arg0.method23179(1424877409) * -1272835235;
		} else if (arg1 == 8) {
			this.aString232 = arg0.method23186((byte) 12);
		} else if (arg1 == 9) {
			this.anInt5405 = arg0.method23178((byte) -108) * 1525241509;
		} else if (arg1 == 10) {
			this.anInt5411 = arg0.method23179(432095414) * -1105066323;
		} else if (arg1 == 11) {
			this.anInt5415 = 0;
		} else if (arg1 == 12) {
			this.anInt5416 = arg0.method23362(-733043859) * 167475813;
		} else if (arg1 == 13) {
			this.anInt5422 = arg0.method23179(-531715673) * -2017615057;
		} else if (arg1 == 14) {
			this.anInt5415 = arg0.method23178((byte) -32) * 310925243;
		} else if (arg1 == 16) {
			this.anInt5423 = arg0.method23179(1132875820) * -1671603169;
			this.anInt5424 = arg0.method23179(354671691) * 761171987;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5426 = arg0.method23178((byte) -61) * -1756492983;
			if (this.anInt5426 * -228010247 == 65535) {
				this.anInt5426 = 1756492983;
			}
			this.anInt5406 = arg0.method23178((byte) -19) * 2096244417;
			if (this.anInt5406 * 1398761793 == 65535) {
				this.anInt5406 = -2096244417;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method23178((byte) -44);
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method23362(-1638874324);
			this.anIntArray494 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray494[local232] = arg0.method23178((byte) -9);
				if (this.anIntArray494[local232] == 65535) {
					this.anIntArray494[local232] = -1;
				}
			}
			this.anIntArray494[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5425 = arg0.method23178((byte) -73) * 1425997191;
		} else if (arg1 == 20) {
			this.anInt5427 = arg0.method23178((byte) -90) * -1677625785;
		}
	}

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "(Lclient!el;Lclient!ey;I)Lclient!vi;")
	public Class613 method32237(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray494 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5426 * -228010247 != -1) {
				@Pc(28) Class374 local28 = arg0.method28381(this.anInt5426 * -228010247, -1482607674);
				if (local28 != null) {
					local1 = arg1.method36978(local28, (byte) -72);
				}
			} else if (this.anInt5406 * 1398761793 != -1) {
				@Pc(51) Class107 local51 = arg0.method28382(Class143.aClass143_71, this.anInt5406 * 1398761793, 2092472462);
				if (local51 != null) {
					local1 = arg1.method36980(local51, -236542051);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray494.length - 1) {
				return this.anIntArray494[local1] == -1 ? null : (Class613) this.anInterface12_13.method18054(this.anIntArray494[local1], -312209940);
			} else {
				@Pc(76) int local76 = this.anIntArray494[this.anIntArray494.length - 1];
				return local76 == -1 ? null : (Class613) this.anInterface12_13.method18054(local76, -1784542857);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "(Lclient!di;I)Lclient!cm;")
	public Class99 method32238(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5414 * 983044445 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32239(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5421 * 416708715 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!di;I)Lclient!cm;")
	public Class99 method32240(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5417 * -407240479 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "(Lclient!di;B)V")
	void method32241(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class480 local3 = this.aClass156_1.aClass480_43;
		@Pc(33) Class109 local33;
		if (this.anInt5414 * 983044445 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445)) == null && local3.method29945(this.anInt5414 * 983044445, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5414 * 983044445);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5414 * 983044445));
		}
		if (this.anInt5419 * -682764045 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045)) == null && local3.method29945(this.anInt5419 * -682764045, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5419 * -682764045);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5419 * -682764045));
		}
		if (this.anInt5421 * 416708715 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715)) == null && local3.method29945(this.anInt5421 * 416708715, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5421 * 416708715);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5421 * 416708715));
		}
		if (this.anInt5417 * -407240479 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479)) == null && local3.method29945(this.anInt5417 * -407240479, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5417 * -407240479);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5417 * -407240479));
		}
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "ax", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32242(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5421 * 416708715 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "(II)Ljava/lang/String;")
	public String method32243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String local2 = this.aString232;
		@Pc(14) int local14 = this.anInt5425 * 1018050615 * arg0 / (this.anInt5427 * -1514187913);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class104_Sub2.method4581(local14, false, (byte) 20) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!vi", name = "aq", descriptor = "(Lclient!di;)V")
	void method32244(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class480 local3 = this.aClass156_1.aClass480_43;
		@Pc(33) Class109 local33;
		if (this.anInt5414 * 983044445 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445)) == null && local3.method29945(this.anInt5414 * 983044445, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5414 * 983044445);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5414 * 983044445));
		}
		if (this.anInt5419 * -682764045 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045)) == null && local3.method29945(this.anInt5419 * -682764045, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5419 * -682764045);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5419 * -682764045));
		}
		if (this.anInt5421 * 416708715 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715)) == null && local3.method29945(this.anInt5421 * 416708715, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5421 * 416708715);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5421 * 416708715));
		}
		if (this.anInt5417 * -407240479 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479)) == null && local3.method29945(this.anInt5417 * -407240479, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5417 * -407240479);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5417 * -407240479));
		}
	}

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "(Lclient!di;S)Lclient!cm;")
	public Class99 method32245(@OriginalArg(0) Class102 arg0, @OriginalArg(1) short arg1) {
		if (this.anInt5419 * -682764045 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "(Lclient!ald;I)V")
	void method32246(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5410 = arg0.method23210((byte) 51) * -109651349;
		} else if (arg1 == 2) {
			this.anInt5412 = arg0.method23180(1710327153) * -101396643;
			this.aBoolean932 = true;
		} else if (arg1 == 3) {
			this.anInt5414 = arg0.method23210((byte) 83) * 697617141;
		} else if (arg1 == 4) {
			this.anInt5421 = arg0.method23210((byte) 32) * -1620413373;
		} else if (arg1 == 5) {
			this.anInt5419 = arg0.method23210((byte) 103) * 1584726075;
		} else if (arg1 == 6) {
			this.anInt5417 = arg0.method23210((byte) 108) * -315931871;
		} else if (arg1 == 7) {
			this.anInt5418 = arg0.method23179(-353778560) * -1272835235;
		} else if (arg1 == 8) {
			this.aString232 = arg0.method23186((byte) 12);
		} else if (arg1 == 9) {
			this.anInt5405 = arg0.method23178((byte) -63) * 1525241509;
		} else if (arg1 == 10) {
			this.anInt5411 = arg0.method23179(1324142578) * -1105066323;
		} else if (arg1 == 11) {
			this.anInt5415 = 0;
		} else if (arg1 == 12) {
			this.anInt5416 = arg0.method23362(1050404947) * 167475813;
		} else if (arg1 == 13) {
			this.anInt5422 = arg0.method23179(836284833) * -2017615057;
		} else if (arg1 == 14) {
			this.anInt5415 = arg0.method23178((byte) -37) * 310925243;
		} else if (arg1 == 16) {
			this.anInt5423 = arg0.method23179(73877411) * -1671603169;
			this.anInt5424 = arg0.method23179(26638678) * 761171987;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5426 = arg0.method23178((byte) -62) * -1756492983;
			if (this.anInt5426 * -228010247 == 65535) {
				this.anInt5426 = 1756492983;
			}
			this.anInt5406 = arg0.method23178((byte) -70) * 2096244417;
			if (this.anInt5406 * 1398761793 == 65535) {
				this.anInt5406 = -2096244417;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method23178((byte) -37);
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method23362(799406950);
			this.anIntArray494 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray494[local232] = arg0.method23178((byte) -97);
				if (this.anIntArray494[local232] == 65535) {
					this.anIntArray494[local232] = -1;
				}
			}
			this.anIntArray494[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5425 = arg0.method23178((byte) -121) * 1425997191;
		} else if (arg1 == 20) {
			this.anInt5427 = arg0.method23178((byte) -49) * -1677625785;
		}
	}

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "(Lclient!el;Lclient!ey;)Lclient!vi;")
	public Class613 method32247(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface24 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray494 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5426 * -228010247 != -1) {
				@Pc(28) Class374 local28 = arg0.method28381(this.anInt5426 * -228010247, -1482607674);
				if (local28 != null) {
					local1 = arg1.method36978(local28, (byte) -55);
				}
			} else if (this.anInt5406 * 1398761793 != -1) {
				@Pc(51) Class107 local51 = arg0.method28382(Class143.aClass143_71, this.anInt5406 * 1398761793, 849434738);
				if (local51 != null) {
					local1 = arg1.method36980(local51, 1193712449);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray494.length - 1) {
				return this.anIntArray494[local1] == -1 ? null : (Class613) this.anInterface12_13.method18054(this.anIntArray494[local1], 257144790);
			} else {
				@Pc(76) int local76 = this.anIntArray494[this.anIntArray494.length - 1];
				return local76 == -1 ? null : (Class613) this.anInterface12_13.method18054(local76, -1050020606);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "(Lclient!di;I)Lclient!cm;")
	public Class99 method32248(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5421 * 416708715 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "(Lclient!el;Lclient!ey;)Lclient!vi;")
	public Class613 method32249(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface24 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray494 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5426 * -228010247 != -1) {
				@Pc(28) Class374 local28 = arg0.method28381(this.anInt5426 * -228010247, -1482607674);
				if (local28 != null) {
					local1 = arg1.method36978(local28, (byte) -33);
				}
			} else if (this.anInt5406 * 1398761793 != -1) {
				@Pc(51) Class107 local51 = arg0.method28382(Class143.aClass143_71, this.anInt5406 * 1398761793, 1036040138);
				if (local51 != null) {
					local1 = arg1.method36980(local51, -1027708040);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray494.length - 1) {
				return this.anIntArray494[local1] == -1 ? null : (Class613) this.anInterface12_13.method18054(this.anIntArray494[local1], 548627385);
			} else {
				@Pc(76) int local76 = this.anIntArray494[this.anIntArray494.length - 1];
				return local76 == -1 ? null : (Class613) this.anInterface12_13.method18054(local76, 832651921);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method32250(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString232;
		@Pc(14) int local14 = this.anInt5425 * 1018050615 * arg0 / (this.anInt5427 * -1514187913);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class104_Sub2.method4581(local14, false, (byte) 105) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "(Lclient!ald;I)V")
	void method32251(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5410 = arg0.method23210((byte) 54) * -109651349;
		} else if (arg1 == 2) {
			this.anInt5412 = arg0.method23180(1710327153) * -101396643;
			this.aBoolean932 = true;
		} else if (arg1 == 3) {
			this.anInt5414 = arg0.method23210((byte) 63) * 697617141;
		} else if (arg1 == 4) {
			this.anInt5421 = arg0.method23210((byte) 121) * -1620413373;
		} else if (arg1 == 5) {
			this.anInt5419 = arg0.method23210((byte) 92) * 1584726075;
		} else if (arg1 == 6) {
			this.anInt5417 = arg0.method23210((byte) 66) * -315931871;
		} else if (arg1 == 7) {
			this.anInt5418 = arg0.method23179(-749831512) * -1272835235;
		} else if (arg1 == 8) {
			this.aString232 = arg0.method23186((byte) 12);
		} else if (arg1 == 9) {
			this.anInt5405 = arg0.method23178((byte) -109) * 1525241509;
		} else if (arg1 == 10) {
			this.anInt5411 = arg0.method23179(-482844484) * -1105066323;
		} else if (arg1 == 11) {
			this.anInt5415 = 0;
		} else if (arg1 == 12) {
			this.anInt5416 = arg0.method23362(42972554) * 167475813;
		} else if (arg1 == 13) {
			this.anInt5422 = arg0.method23179(610190446) * -2017615057;
		} else if (arg1 == 14) {
			this.anInt5415 = arg0.method23178((byte) -63) * 310925243;
		} else if (arg1 == 16) {
			this.anInt5423 = arg0.method23179(901150902) * -1671603169;
			this.anInt5424 = arg0.method23179(-431808185) * 761171987;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5426 = arg0.method23178((byte) -100) * -1756492983;
			if (this.anInt5426 * -228010247 == 65535) {
				this.anInt5426 = 1756492983;
			}
			this.anInt5406 = arg0.method23178((byte) -46) * 2096244417;
			if (this.anInt5406 * 1398761793 == 65535) {
				this.anInt5406 = -2096244417;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method23178((byte) -52);
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method23362(-1830198062);
			this.anIntArray494 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray494[local232] = arg0.method23178((byte) -33);
				if (this.anIntArray494[local232] == 65535) {
					this.anIntArray494[local232] = -1;
				}
			}
			this.anIntArray494[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5425 = arg0.method23178((byte) -35) * 1425997191;
		} else if (arg1 == 20) {
			this.anInt5427 = arg0.method23178((byte) -23) * -1677625785;
		}
	}

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32252(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5419 * -682764045 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32253(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5419 * -682764045 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32254(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5419 * -682764045 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "(Lclient!ald;I)V")
	void method32255(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5410 = arg0.method23210((byte) 82) * -109651349;
		} else if (arg1 == 2) {
			this.anInt5412 = arg0.method23180(1710327153) * -101396643;
			this.aBoolean932 = true;
		} else if (arg1 == 3) {
			this.anInt5414 = arg0.method23210((byte) 126) * 697617141;
		} else if (arg1 == 4) {
			this.anInt5421 = arg0.method23210((byte) 57) * -1620413373;
		} else if (arg1 == 5) {
			this.anInt5419 = arg0.method23210((byte) 35) * 1584726075;
		} else if (arg1 == 6) {
			this.anInt5417 = arg0.method23210((byte) 74) * -315931871;
		} else if (arg1 == 7) {
			this.anInt5418 = arg0.method23179(1401039814) * -1272835235;
		} else if (arg1 == 8) {
			this.aString232 = arg0.method23186((byte) 12);
		} else if (arg1 == 9) {
			this.anInt5405 = arg0.method23178((byte) -57) * 1525241509;
		} else if (arg1 == 10) {
			this.anInt5411 = arg0.method23179(2009864521) * -1105066323;
		} else if (arg1 == 11) {
			this.anInt5415 = 0;
		} else if (arg1 == 12) {
			this.anInt5416 = arg0.method23362(-2123577258) * 167475813;
		} else if (arg1 == 13) {
			this.anInt5422 = arg0.method23179(53864707) * -2017615057;
		} else if (arg1 == 14) {
			this.anInt5415 = arg0.method23178((byte) -8) * 310925243;
		} else if (arg1 == 16) {
			this.anInt5423 = arg0.method23179(-394984540) * -1671603169;
			this.anInt5424 = arg0.method23179(304088535) * 761171987;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5426 = arg0.method23178((byte) -91) * -1756492983;
			if (this.anInt5426 * -228010247 == 65535) {
				this.anInt5426 = 1756492983;
			}
			this.anInt5406 = arg0.method23178((byte) -18) * 2096244417;
			if (this.anInt5406 * 1398761793 == 65535) {
				this.anInt5406 = -2096244417;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method23178((byte) -56);
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method23362(-774982241);
			this.anIntArray494 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray494[local232] = arg0.method23178((byte) -71);
				if (this.anIntArray494[local232] == 65535) {
					this.anIntArray494[local232] = -1;
				}
			}
			this.anIntArray494[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5425 = arg0.method23178((byte) -117) * 1425997191;
		} else if (arg1 == 20) {
			this.anInt5427 = arg0.method23178((byte) -51) * -1677625785;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32256(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5421 * 416708715 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "(Lclient!el;Lclient!ey;)Lclient!vi;")
	public Class613 method32257(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface24 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray494 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5426 * -228010247 != -1) {
				@Pc(28) Class374 local28 = arg0.method28381(this.anInt5426 * -228010247, -1482607674);
				if (local28 != null) {
					local1 = arg1.method36978(local28, (byte) -111);
				}
			} else if (this.anInt5406 * 1398761793 != -1) {
				@Pc(51) Class107 local51 = arg0.method28382(Class143.aClass143_71, this.anInt5406 * 1398761793, 1200606256);
				if (local51 != null) {
					local1 = arg1.method36980(local51, 1090878876);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray494.length - 1) {
				return this.anIntArray494[local1] == -1 ? null : (Class613) this.anInterface12_13.method18054(this.anIntArray494[local1], -1449360663);
			} else {
				@Pc(76) int local76 = this.anIntArray494[this.anIntArray494.length - 1];
				return local76 == -1 ? null : (Class613) this.anInterface12_13.method18054(local76, 428823921);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32258(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5414 * 983044445 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "ay", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32259(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5417 * -407240479 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vi", name = "ai", descriptor = "(Lclient!di;)V")
	void method32260(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class480 local3 = this.aClass156_1.aClass480_43;
		@Pc(33) Class109 local33;
		if (this.anInt5414 * 983044445 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5414 * 983044445)) == null && local3.method29945(this.anInt5414 * 983044445, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5414 * 983044445);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5414 * 983044445));
		}
		if (this.anInt5419 * -682764045 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045)) == null && local3.method29945(this.anInt5419 * -682764045, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5419 * -682764045);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5419 * -682764045));
		}
		if (this.anInt5421 * 416708715 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5421 * 416708715)) == null && local3.method29945(this.anInt5421 * 416708715, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5421 * 416708715);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5421 * 416708715));
		}
		if (this.anInt5417 * -407240479 >= 0 && this.aClass156_1.aClass243_26.method26282((long) (this.anInt5417 * -407240479)) == null && local3.method29945(this.anInt5417 * -407240479, (byte) 1)) {
			local33 = Class212.method25823(local3, this.anInt5417 * -407240479);
			this.aClass156_1.aClass243_26.method26253(arg0.method20906(local33, true), (long) (this.anInt5417 * -407240479));
		}
	}

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "(Lclient!di;)Lclient!cm;")
	public Class99 method32261(@OriginalArg(0) Class102 arg0) {
		if (this.anInt5419 * -682764045 < 0) {
			return null;
		}
		@Pc(17) Class99 local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		if (local17 == null) {
			this.method32241(arg0, (byte) 1);
			local17 = (Class99) this.aClass156_1.aClass243_26.method26282((long) (this.anInt5419 * -682764045));
		}
		return local17;
	}
}
