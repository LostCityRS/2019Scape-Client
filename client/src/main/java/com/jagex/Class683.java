package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yh")
public final class Class683 {

	@OriginalMember(owner = "client!yh", name = "l", descriptor = "Lclient!on;")
	Class463 aClass463_66;

	@OriginalMember(owner = "client!yh", name = "e", descriptor = "F")
	float aFloat355;

	@OriginalMember(owner = "client!yh", name = "u", descriptor = "F")
	float aFloat356;

	@OriginalMember(owner = "client!yh", name = "g", descriptor = "I")
	int anInt5751;

	@OriginalMember(owner = "client!yh", name = "i", descriptor = "I")
	int anInt5752;

	@OriginalMember(owner = "client!yh", name = "m", descriptor = "F")
	float aFloat357;

	@OriginalMember(owner = "client!yh", name = "o", descriptor = "F")
	float aFloat358;

	@OriginalMember(owner = "client!yh", name = "j", descriptor = "F")
	float aFloat359;

	@OriginalMember(owner = "client!yh", name = "a", descriptor = "I")
	int anInt5753;

	@OriginalMember(owner = "client!yh", name = "s", descriptor = "I")
	int anInt5754;

	@OriginalMember(owner = "client!yh", name = "k", descriptor = "I")
	int anInt5755;

	@OriginalMember(owner = "client!yh", name = "x", descriptor = "I")
	int anInt5756;

	@OriginalMember(owner = "client!yh", name = "t", descriptor = "I")
	int anInt5757;

	@OriginalMember(owner = "client!yh", name = "f", descriptor = "F")
	float aFloat360;

	@OriginalMember(owner = "client!yh", name = "w", descriptor = "I")
	int anInt5758;

	@OriginalMember(owner = "client!yh", name = "r", descriptor = "I")
	int anInt5759;

	@OriginalMember(owner = "client!yh", name = "d", descriptor = "I")
	int anInt5760;

	@OriginalMember(owner = "client!yh", name = "q", descriptor = "[I")
	int[] anIntArray523 = new int[3];

	@OriginalMember(owner = "client!yh", name = "h", descriptor = "[F")
	float[] aFloatArray122 = new float[3];

	@OriginalMember(owner = "client!yh", name = "akn", descriptor = "(Lclient!yp;I)V")
	static void method36767(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class517.method30583(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, -1558046285);
	}

	@OriginalMember(owner = "client!yh", name = "k", descriptor = "(Lclient!yp;B)V")
	static void method36768(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], 87756668)).anIntArrayArray57[arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1]][0];
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!yh", name = "<init>", descriptor = "()V")
	public Class683() {
		this.method36711(2133658695);
	}

	@OriginalMember(owner = "client!yh", name = "ab", descriptor = "()I")
	public int method36710() {
		return this.anInt5751 * -2075886889;
	}

	@OriginalMember(owner = "client!yh", name = "t", descriptor = "(I)V")
	void method36711(@OriginalArg(0) int arg0) {
		this.anInt5757 = -1205789177;
		this.aFloat360 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aClass463_66 = null;
		this.anInt5751 = 1917380377;
		this.anInt5752 = 705896473;
		this.aFloat357 = -1.0F;
		this.aFloat358 = -1.0F;
		this.aFloat359 = -1.0F;
		this.anInt5753 = -1097433865;
		this.anInt5754 = 1099029973;
		this.anInt5755 = -1200298989;
		this.anInt5756 = -1740941599;
		this.anInt5758 = -364177963;
		this.anInt5759 = 1044015281;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray523.length; local49++) {
			this.anIntArray523[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5760 = -1399524168;
	}

	@OriginalMember(owner = "client!yh", name = "f", descriptor = "(Lclient!ald;B)Z")
	public boolean method36712(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) long local3 = arg0.method23273((byte) 70);
		if (local3 == 0L) {
			this.anInt5760 = arg0.method23178((byte) -23) * -1775819385;
			return false;
		}
		if ((local3 & Class679.aClass679_39.aLong414 * 3927389885480165755L) != 0L) {
			this.anInt5757 = arg0.method23182(-581025403) * 1205789177;
		}
		if ((local3 & Class679.aClass679_2.aLong414 * 3927389885480165755L) != 0L) {
			this.aFloat360 = arg0.method23188(-419315268);
		}
		if ((local3 & Class679.aClass679_3.aLong414 * 3927389885480165755L) != 0L) {
			this.aFloat355 = arg0.method23188(626347369);
		}
		if ((local3 & Class679.aClass679_33.aLong414 * 3927389885480165755L) != 0L) {
			this.aFloat356 = arg0.method23188(-731865484);
		}
		if ((local3 & Class679.aClass679_5.aLong414 * 3927389885480165755L) != 0L) {
			this.aClass463_66 = Class463.method29552(arg0);
		}
		if ((local3 & Class679.aClass679_6.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-597614492);
		}
		if ((local3 & Class679.aClass679_19.aLong414 * 3927389885480165755L) != 0L) {
			this.anInt5751 = arg0.method23182(-1513925621) * -1917380377;
		}
		if ((local3 & Class679.aClass679_23.aLong414 * 3927389885480165755L) != 0L) {
			this.anInt5752 = arg0.method23178((byte) -56) * -705896473;
		}
		if ((local3 & Class679.aClass679_9.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(327220676);
		}
		if ((local3 & Class679.aClass679_37.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-548353952);
		}
		if ((local3 & Class679.aClass679_11.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(187700624);
		}
		if ((local3 & Class679.aClass679_12.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-71280606);
		}
		if ((local3 & Class679.aClass679_13.aLong414 * 3927389885480165755L) != 0L) {
			this.aFloat357 = arg0.method23188(-546084217);
		}
		if ((local3 & Class679.aClass679_14.aLong414 * 3927389885480165755L) != 0L) {
			this.aFloat358 = arg0.method23188(-1378349851);
		}
		if ((local3 & Class679.aClass679_1.aLong414 * 3927389885480165755L) != 0L) {
			this.aFloat359 = arg0.method23188(601248688);
		}
		if ((local3 & Class679.aClass679_16.aLong414 * 3927389885480165755L) != 0L) {
			this.anInt5753 = arg0.method23178((byte) -12) * 1097433865;
		}
		if ((local3 & Class679.aClass679_17.aLong414 * 3927389885480165755L) != 0L) {
			this.anInt5754 = arg0.method23178((byte) -98) * -1099029973;
			this.anInt5755 = arg0.method23179(48364248) * 1200298989;
			this.anInt5756 = arg0.method23179(224334000) * 1740941599;
			this.anInt5758 = arg0.method23179(1710001295) * 364177963;
			this.anInt5759 = arg0.method23178((byte) -89) * -1044015281;
		}
		if ((local3 & Class679.aClass679_18.aLong414 * 3927389885480165755L) != 0L) {
			this.anIntArray523[0] = arg0.method23178((byte) -124);
			this.aFloatArray122[0] = arg0.method23188(-549788574);
		}
		if ((local3 & Class679.aClass679_35.aLong414 * 3927389885480165755L) != 0L) {
			this.anIntArray523[1] = arg0.method23178((byte) -3);
			this.aFloatArray122[1] = arg0.method23188(52569853);
		}
		if ((local3 & Class679.aClass679_15.aLong414 * 3927389885480165755L) != 0L) {
			this.anIntArray523[2] = arg0.method23178((byte) -116);
			this.aFloatArray122[2] = arg0.method23188(1498317798);
		}
		if ((local3 & Class679.aClass679_21.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23182(1588502000);
		}
		if ((local3 & Class679.aClass679_22.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23182(-263911459);
		}
		if ((local3 & Class679.aClass679_29.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-740122922);
		}
		if ((local3 & Class679.aClass679_24.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(830505052);
		}
		if ((local3 & Class679.aClass679_25.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(2074151087);
		}
		if ((local3 & Class679.aClass679_26.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-2107762847);
		}
		if ((local3 & Class679.aClass679_27.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-321270637);
		}
		if ((local3 & Class679.aClass679_28.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23182(2036030251);
		}
		if ((local3 & Class679.aClass679_7.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-1030461102);
		}
		if ((local3 & Class679.aClass679_30.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-564601418);
		}
		if ((local3 & Class679.aClass679_31.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(205538399);
		}
		if ((local3 & Class679.aClass679_4.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-1897749499);
		}
		if ((local3 & Class679.aClass679_42.aLong414 * 3927389885480165755L) != 0L) {
			new Class463(arg0);
		}
		if ((local3 & Class679.aClass679_34.aLong414 * 3927389885480165755L) != 0L) {
			new Class463(arg0);
		}
		if ((local3 & Class679.aClass679_32.aLong414 * 3927389885480165755L) != 0L) {
			new Class463(arg0);
		}
		if ((local3 & Class679.aClass679_36.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-866807655);
		}
		if ((local3 & Class679.aClass679_20.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-2032668999);
		}
		if ((local3 & Class679.aClass679_38.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-866685696);
		}
		if ((local3 & Class679.aClass679_10.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-337870880);
		}
		if ((local3 & Class679.aClass679_40.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-1726280298);
		}
		if ((local3 & Class679.aClass679_8.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-915357454);
		}
		if ((local3 & Class679.aClass679_41.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(1088449135);
		}
		if ((local3 & Class679.aClass679_43.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23188(-437768095);
		}
		if ((local3 & Class679.aClass679_44.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23182(-1609667419);
		}
		if ((local3 & Class679.aClass679_45.aLong414 * 3927389885480165755L) != 0L) {
			arg0.method23182(-200791431);
		}
		this.anInt5760 = arg0.method23178((byte) -79) * -1775819385;
		return true;
	}

	@OriginalMember(owner = "client!yh", name = "e", descriptor = "(I)I")
	public int method36713(@OriginalArg(0) int arg0) {
		return this.anInt5757 * 576852041;
	}

	@OriginalMember(owner = "client!yh", name = "u", descriptor = "(I)F")
	public float method36714(@OriginalArg(0) int arg0) {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yh", name = "p", descriptor = "(B)I")
	public int method36715(@OriginalArg(0) byte arg0) {
		return this.anInt5760 * -764571593;
	}

	@OriginalMember(owner = "client!yh", name = "g", descriptor = "(I)F")
	public float method36716(@OriginalArg(0) int arg0) {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yh", name = "i", descriptor = "(I)Lclient!on;")
	public Class463 method36717(@OriginalArg(0) int arg0) {
		return this.aClass463_66;
	}

	@OriginalMember(owner = "client!yh", name = "m", descriptor = "(I)I")
	public int method36718(@OriginalArg(0) int arg0) {
		return this.anInt5751 * -2075886889;
	}

	@OriginalMember(owner = "client!yh", name = "o", descriptor = "(B)I")
	public int method36719(@OriginalArg(0) byte arg0) {
		return this.anInt5752 * 939901911;
	}

	@OriginalMember(owner = "client!yh", name = "a", descriptor = "(I)F")
	public float method36720(@OriginalArg(0) int arg0) {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yh", name = "s", descriptor = "(I)F")
	public float method36721(@OriginalArg(0) int arg0) {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yh", name = "k", descriptor = "(S)I")
	public int method36722(@OriginalArg(0) short arg0) {
		return this.anInt5753 * -171377863;
	}

	@OriginalMember(owner = "client!yh", name = "x", descriptor = "(I)I")
	public int method36723(@OriginalArg(0) int arg0) {
		return this.anInt5754 * -1093694333;
	}

	@OriginalMember(owner = "client!yh", name = "w", descriptor = "(I)I")
	public int method36724(@OriginalArg(0) int arg0) {
		return this.anInt5755 * -2010023451;
	}

	@OriginalMember(owner = "client!yh", name = "r", descriptor = "(S)I")
	public int method36725(@OriginalArg(0) short arg0) {
		return this.anInt5756 * 740528863;
	}

	@OriginalMember(owner = "client!yh", name = "ae", descriptor = "()I")
	public int method36726() {
		return this.anInt5754 * -1093694333;
	}

	@OriginalMember(owner = "client!yh", name = "ag", descriptor = "()I")
	public int method36727() {
		return this.anInt5751 * -2075886889;
	}

	@OriginalMember(owner = "client!yh", name = "v", descriptor = "()V")
	void method36728() {
		this.anInt5757 = -1205789177;
		this.aFloat360 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aClass463_66 = null;
		this.anInt5751 = 1917380377;
		this.anInt5752 = 705896473;
		this.aFloat357 = -1.0F;
		this.aFloat358 = -1.0F;
		this.aFloat359 = -1.0F;
		this.anInt5753 = -1097433865;
		this.anInt5754 = 1099029973;
		this.anInt5755 = -1200298989;
		this.anInt5756 = -1740941599;
		this.anInt5758 = -364177963;
		this.anInt5759 = 1044015281;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray523.length; local49++) {
			this.anIntArray523[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5760 = -1399524168;
	}

	@OriginalMember(owner = "client!yh", name = "as", descriptor = "()I")
	public int method36729() {
		return this.anInt5758 * 1644856451;
	}

	@OriginalMember(owner = "client!yh", name = "h", descriptor = "(I)I")
	public int method36730(@OriginalArg(0) int arg0) {
		return this.anInt5759 * -755687505;
	}

	@OriginalMember(owner = "client!yh", name = "j", descriptor = "(I)F")
	public float method36731(@OriginalArg(0) int arg0) {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yh", name = "y", descriptor = "()V")
	void method36732() {
		this.anInt5757 = -1205789177;
		this.aFloat360 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aClass463_66 = null;
		this.anInt5751 = 1917380377;
		this.anInt5752 = 705896473;
		this.aFloat357 = -1.0F;
		this.aFloat358 = -1.0F;
		this.aFloat359 = -1.0F;
		this.anInt5753 = -1097433865;
		this.anInt5754 = 1099029973;
		this.anInt5755 = -1200298989;
		this.anInt5756 = -1740941599;
		this.anInt5758 = -364177963;
		this.anInt5759 = 1044015281;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray523.length; local49++) {
			this.anIntArray523[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5760 = -1399524168;
	}

	@OriginalMember(owner = "client!yh", name = "n", descriptor = "()V")
	void method36733() {
		this.anInt5757 = -1205789177;
		this.aFloat360 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aClass463_66 = null;
		this.anInt5751 = 1917380377;
		this.anInt5752 = 705896473;
		this.aFloat357 = -1.0F;
		this.aFloat358 = -1.0F;
		this.aFloat359 = -1.0F;
		this.anInt5753 = -1097433865;
		this.anInt5754 = 1099029973;
		this.anInt5755 = -1200298989;
		this.anInt5756 = -1740941599;
		this.anInt5758 = -364177963;
		this.anInt5759 = 1044015281;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray523.length; local49++) {
			this.anIntArray523[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5760 = -1399524168;
	}

	@OriginalMember(owner = "client!yh", name = "c", descriptor = "()V")
	void method36734() {
		this.anInt5757 = -1205789177;
		this.aFloat360 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aClass463_66 = null;
		this.anInt5751 = 1917380377;
		this.anInt5752 = 705896473;
		this.aFloat357 = -1.0F;
		this.aFloat358 = -1.0F;
		this.aFloat359 = -1.0F;
		this.anInt5753 = -1097433865;
		this.anInt5754 = 1099029973;
		this.anInt5755 = -1200298989;
		this.anInt5756 = -1740941599;
		this.anInt5758 = -364177963;
		this.anInt5759 = 1044015281;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray523.length; local49++) {
			this.anIntArray523[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5760 = -1399524168;
	}

	@OriginalMember(owner = "client!yh", name = "b", descriptor = "()I")
	public int method36735() {
		return this.anInt5757 * 576852041;
	}

	@OriginalMember(owner = "client!yh", name = "am", descriptor = "()I")
	public int method36736() {
		return this.anInt5752 * 939901911;
	}

	@OriginalMember(owner = "client!yh", name = "q", descriptor = "(I)I")
	public int method36737(@OriginalArg(0) int arg0) {
		return this.anInt5758 * 1644856451;
	}

	@OriginalMember(owner = "client!yh", name = "ai", descriptor = "()F")
	public float method36738() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yh", name = "aa", descriptor = "()I")
	public int method36739() {
		return this.anInt5754 * -1093694333;
	}

	@OriginalMember(owner = "client!yh", name = "aq", descriptor = "()F")
	public float method36740() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yh", name = "aj", descriptor = "()F")
	public float method36741() {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yh", name = "ac", descriptor = "()Lclient!on;")
	public Class463 method36742() {
		return this.aClass463_66;
	}

	@OriginalMember(owner = "client!yh", name = "bn", descriptor = "()I")
	public int method36743() {
		return this.anInt5760 * -764571593;
	}

	@OriginalMember(owner = "client!yh", name = "ax", descriptor = "()I")
	public int method36744() {
		return this.anInt5757 * 576852041;
	}

	@OriginalMember(owner = "client!yh", name = "al", descriptor = "()I")
	public int method36745() {
		return this.anInt5751 * -2075886889;
	}

	@OriginalMember(owner = "client!yh", name = "z", descriptor = "(II)F")
	public float method36746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yh", name = "af", descriptor = "()I")
	public int method36747() {
		return this.anInt5752 * 939901911;
	}

	@OriginalMember(owner = "client!yh", name = "br", descriptor = "(I)F")
	public float method36748(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yh", name = "ak", descriptor = "()F")
	public float method36749() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yh", name = "at", descriptor = "()F")
	public float method36750() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yh", name = "ad", descriptor = "()F")
	public float method36751() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yh", name = "av", descriptor = "()I")
	public int method36752() {
		return this.anInt5753 * -171377863;
	}

	@OriginalMember(owner = "client!yh", name = "an", descriptor = "()I")
	public int method36753() {
		return this.anInt5753 * -171377863;
	}

	@OriginalMember(owner = "client!yh", name = "ay", descriptor = "()F")
	public float method36754() {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yh", name = "d", descriptor = "(II)I")
	public int method36755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray523[arg0];
	}

	@OriginalMember(owner = "client!yh", name = "ap", descriptor = "()I")
	public int method36756() {
		return this.anInt5755 * -2010023451;
	}

	@OriginalMember(owner = "client!yh", name = "ar", descriptor = "()I")
	public int method36757() {
		return this.anInt5756 * 740528863;
	}

	@OriginalMember(owner = "client!yh", name = "au", descriptor = "()I")
	public int method36758() {
		return this.anInt5758 * 1644856451;
	}

	@OriginalMember(owner = "client!yh", name = "az", descriptor = "()I")
	public int method36759() {
		return this.anInt5758 * 1644856451;
	}

	@OriginalMember(owner = "client!yh", name = "ah", descriptor = "()I")
	public int method36760() {
		return this.anInt5751 * -2075886889;
	}

	@OriginalMember(owner = "client!yh", name = "aw", descriptor = "()I")
	public int method36761() {
		return this.anInt5758 * 1644856451;
	}

	@OriginalMember(owner = "client!yh", name = "bg", descriptor = "()I")
	public int method36762() {
		return this.anInt5759 * -755687505;
	}

	@OriginalMember(owner = "client!yh", name = "bl", descriptor = "(I)F")
	public float method36763(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yh", name = "ao", descriptor = "()F")
	public float method36764() {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yh", name = "l", descriptor = "(I)F")
	public float method36765(@OriginalArg(0) int arg0) {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yh", name = "ba", descriptor = "()I")
	public int method36766() {
		return this.anInt5760 * -764571593;
	}
}
