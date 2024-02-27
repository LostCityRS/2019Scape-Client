package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aay")
public final class Class25 {

	@OriginalMember(owner = "client!aay", name = "hd", descriptor = "Lclient!aok;")
	public static Class41_Sub9 aClass41_Sub9_1;

	@OriginalMember(owner = "client!aay", name = "t", descriptor = "I")
	int anInt78;

	@OriginalMember(owner = "client!aay", name = "f", descriptor = "Lclient!are;")
	Class80_Sub1_Sub5 aClass80_Sub1_Sub5_1;

	@OriginalMember(owner = "client!aay", name = "e", descriptor = "Z")
	boolean aBoolean11 = false;

	@OriginalMember(owner = "client!aay", name = "in", descriptor = "(Lclient!ahb;I)V")
	static void method594(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class6_Sub3 local2 = arg0.aClass6_Sub3_3;
		if (local2.method23590(-499060808) && local2.method23601(1, -2004181448) && local2.method23658((byte) 1)) {
			if (local2.aBoolean429) {
				local2.method23603(arg0.method18952((byte) -2).method32324(-503438516), false, true, (byte) -14);
				local2.aBoolean429 = local2.method23590(-499060808);
			}
			local2.method23598((short) -27539);
		}
		for (@Pc(38) int local38 = 0; local38 < arg0.aClass561Array3.length; local38++) {
			if (arg0.aClass561Array3[local38].anInt5188 * -2124314403 != -1) {
				@Pc(58) Class6 local58 = arg0.aClass561Array3[local38].aClass6_9;
				if (local58.method23589((byte) 76)) {
					@Pc(74) Class684 local74 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(arg0.aClass561Array3[local38].anInt5188 * -2124314403, -832616312);
					@Pc(78) Class261 local78 = local58.method23581((byte) 67);
					if (local74.aBoolean986) {
						if (local78.anInt3890 * 679184865 == 3) {
							if (arg0.anInt2702 * -2417789 > 0 && arg0.anInt2688 * -1881785185 <= client.currentCycle && arg0.anInt2689 * 1790159189 < client.currentCycle) {
								local58.method23587(-1, -2060415981);
								arg0.aClass561Array3[local38].anInt5188 = -1389203317;
								continue;
							}
						} else if (local78.anInt3890 * 679184865 == 1 && arg0.anInt2702 * -2417789 > 0 && arg0.anInt2688 * -1881785185 <= client.currentCycle && arg0.anInt2689 * 1790159189 < client.currentCycle) {
							continue;
						}
					}
				}
				if (local58.method23601(1, -2034142091) && local58.method23658((byte) 1)) {
					local58.method23587(-1, -2060415981);
					arg0.aClass561Array3[local38].anInt5188 = -1389203317;
				}
			}
		}
		@Pc(163) Class6 local163 = arg0.aClass6_3;
		if (local163.method23590(-499060808)) {
			label84: {
				@Pc(171) Class261 local171 = local163.method23581((byte) 67);
				if (local171.anInt3890 * 679184865 == 3) {
					if (arg0.anInt2702 * -2417789 > 0 && arg0.anInt2688 * -1881785185 <= client.currentCycle && arg0.anInt2689 * 1790159189 < client.currentCycle) {
						arg0.anIntArray240 = null;
						local163.method23587(-1, -2060415981);
						break label84;
					}
				} else if (local171.anInt3890 * 679184865 == 1) {
					if (arg0.anInt2702 * -2417789 > 0 && arg0.anInt2688 * -1881785185 <= client.currentCycle && arg0.anInt2689 * 1790159189 < client.currentCycle) {
						local163.method23621(1, (byte) -17);
						break label84;
					}
					local163.method23621(0, (byte) -109);
				}
				if (local163.method23601(1, -1808662639) && local163.method23658((byte) 1)) {
					arg0.anIntArray240 = null;
					local163.method23587(-1, -2060415981);
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < arg0.aClass6_Sub1_Sub1Array3.length; local252++) {
			@Pc(262) Class6_Sub1_Sub1 local262 = arg0.aClass6_Sub1_Sub1Array3[local252];
			if (local262 != null) {
				if (local262.anInt3222 * -58234803 > 0) {
					local262.anInt3222 -= 1688866949;
				} else if (local262.method23601(1, -1857008324) && local262.method23658((byte) 1)) {
					arg0.aClass6_Sub1_Sub1Array3[local252] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aay", name = "xc", descriptor = "(Lclient!yp;I)V")
	static void method595(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class430.method29088(local13, local23, local33, true, -2015911711);
	}

	@OriginalMember(owner = "client!aay", name = "<init>", descriptor = "()V")
	Class25() {
	}

	@OriginalMember(owner = "client!aay", name = "l", descriptor = "()V")
	void method586() {
		this.aBoolean11 = false;
		this.anInt78 = 0;
		this.aClass80_Sub1_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!aay", name = "m", descriptor = "()V")
	void method587() {
		this.aBoolean11 = false;
		this.anInt78 = 0;
		this.aClass80_Sub1_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!aay", name = "f", descriptor = "(B)V")
	void method588(@OriginalArg(0) byte arg0) {
		this.aBoolean11 = false;
		this.anInt78 = 0;
		this.aClass80_Sub1_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!aay", name = "e", descriptor = "(Lclient!aoa;Lclient!fe;)Z")
	boolean method589(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1) {
		if (!this.aBoolean11) {
			this.aClass80_Sub1_Sub5_1 = arg0.method17008(arg1.anInt3891 * -768598629, -48975885);
			if (this.aClass80_Sub1_Sub5_1 != null) {
				if (arg1.aBoolean776) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x200) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21788(1605440276)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x80) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21789(345725077)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x100) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21790((byte) -23)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x400) * -912973967;
				}
				this.anInt78 = (this.anInt78 * 1118159249 | 0x20) * -912973967;
				this.aBoolean11 = true;
			}
		}
		return this.aBoolean11;
	}

	@OriginalMember(owner = "client!aay", name = "u", descriptor = "(Lclient!aoa;Lclient!fe;)Z")
	boolean method590(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1) {
		if (!this.aBoolean11) {
			this.aClass80_Sub1_Sub5_1 = arg0.method17008(arg1.anInt3891 * -768598629, -707956506);
			if (this.aClass80_Sub1_Sub5_1 != null) {
				if (arg1.aBoolean776) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x200) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21788(2125782943)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x80) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21789(-1231471957)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x100) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21790((byte) 105)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x400) * -912973967;
				}
				this.anInt78 = (this.anInt78 * 1118159249 | 0x20) * -912973967;
				this.aBoolean11 = true;
			}
		}
		return this.aBoolean11;
	}

	@OriginalMember(owner = "client!aay", name = "g", descriptor = "()V")
	void method591() {
		this.aBoolean11 = false;
		this.anInt78 = 0;
		this.aClass80_Sub1_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!aay", name = "i", descriptor = "()V")
	void method592() {
		this.aBoolean11 = false;
		this.anInt78 = 0;
		this.aClass80_Sub1_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!aay", name = "t", descriptor = "(Lclient!aoa;Lclient!fe;S)Z")
	boolean method593(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) short arg2) {
		if (!this.aBoolean11) {
			this.aClass80_Sub1_Sub5_1 = arg0.method17008(arg1.anInt3891 * -768598629, 1614333614);
			if (this.aClass80_Sub1_Sub5_1 != null) {
				if (arg1.aBoolean776) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x200) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21788(-2056920597)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x80) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21789(-1822636032)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x100) * -912973967;
				}
				if (this.aClass80_Sub1_Sub5_1.method21790((byte) -102)) {
					this.anInt78 = (this.anInt78 * 1118159249 | 0x400) * -912973967;
				}
				this.anInt78 = (this.anInt78 * 1118159249 | 0x20) * -912973967;
				this.aBoolean11 = true;
			}
		}
		return this.aBoolean11;
	}
}
