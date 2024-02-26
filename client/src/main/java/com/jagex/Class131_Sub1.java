package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahu")
public abstract class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!ahu", name = "y", descriptor = "I")
	static final int anInt2868 = 16;

	@OriginalMember(owner = "client!ahu", name = "v", descriptor = "I")
	static final int anInt2869 = 8;

	@OriginalMember(owner = "client!ahu", name = "d", descriptor = "I")
	static final int anInt2870 = 1;

	@OriginalMember(owner = "client!ahu", name = "z", descriptor = "I")
	static final int anInt2871 = 2;

	@OriginalMember(owner = "client!ahu", name = "p", descriptor = "I")
	static final int anInt2872 = 4;

	@OriginalMember(owner = "client!ahu", name = "n", descriptor = "I")
	static final int anInt2873 = 32;

	@OriginalMember(owner = "client!ahu", name = "b", descriptor = "I")
	static final int anInt2874 = 128;

	@OriginalMember(owner = "client!ahu", name = "c", descriptor = "I")
	static final int anInt2876 = 64;

	@OriginalMember(owner = "client!ahu", name = "ai", descriptor = "Lclient!pm;")
	static final Class487 aClass487_71 = new Class487();

	@OriginalMember(owner = "client!ahu", name = "q", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_68;

	@OriginalMember(owner = "client!ahu", name = "k", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_69;

	@OriginalMember(owner = "client!ahu", name = "ay", descriptor = "[I")
	int[] anIntArray257;

	@OriginalMember(owner = "client!ahu", name = "i", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_70;

	@OriginalMember(owner = "client!ahu", name = "m", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_71;

	@OriginalMember(owner = "client!ahu", name = "u", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_72;

	@OriginalMember(owner = "client!ahu", name = "j", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_73;

	@OriginalMember(owner = "client!ahu", name = "l", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_74;

	@OriginalMember(owner = "client!ahu", name = "s", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_75;

	@OriginalMember(owner = "client!ahu", name = "e", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_76;

	@OriginalMember(owner = "client!ahu", name = "x", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_77;

	@OriginalMember(owner = "client!ahu", name = "w", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_78;

	@OriginalMember(owner = "client!ahu", name = "r", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_79;

	@OriginalMember(owner = "client!ahu", name = "o", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_80;

	@OriginalMember(owner = "client!ahu", name = "h", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_81;

	@OriginalMember(owner = "client!ahu", name = "a", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_82;

	@OriginalMember(owner = "client!ahu", name = "g", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_83;

	@OriginalMember(owner = "client!ahu", name = "f", descriptor = "Lclient!hb;")
	protected Class113 aClass113_10;

	@OriginalMember(owner = "client!ahu", name = "ax", descriptor = "I")
	int anInt2875;

	@OriginalMember(owner = "client!ahu", name = "ao", descriptor = "[F")
	float[] aFloatArray59 = new float[3];

	@OriginalMember(owner = "client!ahu", name = "aq", descriptor = "[Lclient!pm;")
	Class487[] aClass487Array5;

	@OriginalMember(owner = "client!ahu", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class131_Sub1(@OriginalArg(0) Class102_Sub1 arg0) {
		super(arg0);
		new Class471();
		this.aClass487Array5 = new Class487[this.aClass102_Sub1_31.anInt2998];
		for (@Pc(18) int local18 = 0; local18 < this.aClass102_Sub1_31.anInt2998; local18++) {
			this.aClass487Array5[local18] = new Class487();
		}
	}

	@OriginalMember(owner = "client!ahu", name = "v", descriptor = "()Z")
	abstract boolean method20455() throws Exception_Sub5;

	@OriginalMember(owner = "client!ahu", name = "p", descriptor = "(Ljava/lang/String;)Z")
	final boolean method20456(@OriginalArg(0) String arg0) throws Exception_Sub5 {
		this.aClass113_10 = this.aClass102_Sub1_31.method21142(arg0);
		if (this.aClass113_10 == null) {
			throw new Exception_Sub5("");
		}
		this.aClass80_Sub13_Sub1_76 = this.aClass113_10.method8292("textureMatrix", 1833739674);
		this.aClass80_Sub13_Sub1_72 = this.aClass113_10.method8292("modelMatrix", 871589477);
		this.aClass80_Sub13_Sub1_74 = this.aClass113_10.method8292("viewMatrix", -1674550097);
		this.aClass80_Sub13_Sub1_83 = this.aClass113_10.method8292("projectionMatrix", -420505238);
		this.aClass80_Sub13_Sub1_71 = this.aClass113_10.method8292("modelViewMatrix", -1092472273);
		this.aClass80_Sub13_Sub1_80 = this.aClass113_10.method8292("modelViewProjectionMatrix", -973465293);
		this.aClass80_Sub13_Sub1_73 = this.aClass113_10.method8292("viewProjectionMatrix", -873731697);
		this.aClass80_Sub13_Sub1_77 = this.aClass113_10.method8292("ambientColour", 710880858);
		this.aClass80_Sub13_Sub1_68 = this.aClass113_10.method8292("sunDirection", 1935934801);
		this.aClass80_Sub13_Sub1_78 = this.aClass113_10.method8292("sunColour", -645451535);
		this.aClass80_Sub13_Sub1_79 = this.aClass113_10.method8292("antiSunColour", 1076386401);
		this.aClass80_Sub13_Sub1_81 = this.aClass113_10.method8292("sunExponent", 2021133638);
		this.aClass80_Sub13_Sub1_82 = this.aClass113_10.method8292("eyePosition", 482541298);
		this.aClass80_Sub13_Sub1_75 = this.aClass113_10.method8292("eyePositionOS", -1028161342);
		this.aClass80_Sub13_Sub1_69 = this.aClass113_10.method8292("sunDirectionOS", -1508737929);
		if (this.method20455()) {
			if (this.aClass113_10.method8267(-2066090063) == null) {
				@Pc(181) Class114 local181 = this.aClass113_10.method8361(1034180571);
				if (local181 == null) {
					throw new Exception_Sub5(this.aClass113_10.method8259(-250439922) + "");
				}
				this.aClass113_10.method8295(local181);
			}
			this.anInt2875 = this.aClass113_10.method8262((byte) 0);
			this.anIntArray257 = new int[this.anInt2875];
			return true;
		}
		this.aClass113_10 = null;
		this.aClass80_Sub13_Sub1_76 = null;
		this.aClass80_Sub13_Sub1_72 = null;
		this.aClass80_Sub13_Sub1_74 = null;
		this.aClass80_Sub13_Sub1_83 = null;
		this.aClass80_Sub13_Sub1_71 = null;
		this.aClass80_Sub13_Sub1_80 = null;
		this.aClass80_Sub13_Sub1_73 = null;
		this.aClass80_Sub13_Sub1_77 = null;
		this.aClass80_Sub13_Sub1_68 = null;
		this.aClass80_Sub13_Sub1_78 = null;
		this.aClass80_Sub13_Sub1_79 = null;
		this.aClass80_Sub13_Sub1_81 = null;
		this.aClass80_Sub13_Sub1_82 = null;
		this.aClass80_Sub13_Sub1_75 = null;
		this.aClass80_Sub13_Sub1_69 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahu", name = "ao", descriptor = "(I)V")
	final void method20457(@OriginalArg(0) int arg0) {
		this.aClass487Array5[0].method30139();
		this.method20461(arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "t", descriptor = "()V")
	@Override
	final void method20436() {
		this.aClass113_10.method8256();
		this.anIntArray257[this.aClass113_10.method8355((byte) 11)] = -1;
		this.method20457(0);
		this.method20458();
	}

	@OriginalMember(owner = "client!ahu", name = "y", descriptor = "()V")
	final void method20458() {
		this.method20462(this.aClass102_Sub1_31.aBoolean511);
		this.method20459(this.aClass102_Sub1_31.method21225());
		this.method20460();
		this.method20451();
	}

	@OriginalMember(owner = "client!ahu", name = "f", descriptor = "()V")
	@Override
	final void method20437() {
		if (this.aClass113_10 != null) {
			this.aClass113_10.method8257();
		}
	}

	@OriginalMember(owner = "client!ahu", name = "n", descriptor = "(Lclient!pm;)V")
	void method20459(@OriginalArg(0) Class487 arg0) {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357() || this.aClass102_Sub1_31.method21351() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass113_10.method8355((byte) 115);
		if ((this.anIntArray257[local15] & 0x80) != 0 && this.aClass80_Sub13_Sub1_76 != null) {
			this.aClass113_10.method8261(this.aClass80_Sub13_Sub1_76, arg0, -799485994);
			this.anIntArray257[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "c", descriptor = "()V")
	final void method20460() {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357()) {
			return;
		}
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) 39);
		@Pc(16) int local16 = this.anIntArray257[local11];
		if ((local16 & 0x1) != 0 && this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, this.aClass102_Sub1_31.method21328(), -871388298);
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass80_Sub13_Sub1_74 != null) {
				this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_74, this.aClass102_Sub1_31.method21264(), -871388298);
			}
			if (this.aClass80_Sub13_Sub1_82 != null) {
				this.aFloatArray59[0] = 0.0F;
				this.aFloatArray59[1] = 0.0F;
				this.aFloatArray59[2] = 0.0F;
				this.aClass102_Sub1_31.method20897().method29771(this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2], this.aFloatArray59);
				this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_82, this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2], -1255761693);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass80_Sub13_Sub1_71 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, this.aClass102_Sub1_31.method21181(), -871388298);
		}
		if ((local16 & 0x8) != 0 && this.aClass80_Sub13_Sub1_70 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_70, this.aClass102_Sub1_31.method21448(), -871388298);
		}
		if ((local16 & 0x4) != 0 && this.aClass80_Sub13_Sub1_83 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_83, this.aClass102_Sub1_31.method21151(), -871388298);
		}
		if ((local16 & 0x20) != 0 && this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(this.aClass102_Sub1_31.method21181(), this.aClass102_Sub1_31.method21151());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
		}
		if ((local16 & 0x40) != 0 && this.aClass80_Sub13_Sub1_73 != null) {
			aClass487_71.method30068(this.aClass102_Sub1_31.method21264(), this.aClass102_Sub1_31.method21151());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_73, aClass487_71, -871388298);
		}
		if (this.aClass102_Sub1_31.method21351() == 0 && (this.anIntArray257[local11] & 0x80) != 0 && this.aClass80_Sub13_Sub1_76 != null) {
			this.aClass113_10.method8261(this.aClass80_Sub13_Sub1_76, this.aClass102_Sub1_31.method21225(), -656485506);
			this.anIntArray257[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray257[local11] = 0;
	}

	@OriginalMember(owner = "client!ahu", name = "ai", descriptor = "(I)V")
	final void method20461(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2875; local1++) {
			this.anIntArray257[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "ay", descriptor = "(Z)V")
	void method20462(@OriginalArg(0) boolean arg0) {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357()) {
			return;
		}
		if (this.aClass80_Sub13_Sub1_77 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_77, this.aClass102_Sub1_31.aFloat208 * this.aClass102_Sub1_31.aFloat212, this.aClass102_Sub1_31.aFloat209 * this.aClass102_Sub1_31.aFloat212, this.aClass102_Sub1_31.aFloat210 * this.aClass102_Sub1_31.aFloat212, 1415549764);
		}
		if (this.aClass80_Sub13_Sub1_68 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_68, this.aClass102_Sub1_31.aFloatArray68[0], this.aClass102_Sub1_31.aFloatArray68[1], this.aClass102_Sub1_31.aFloatArray68[2], 632772053);
		}
		if (this.aClass80_Sub13_Sub1_78 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_78, this.aClass102_Sub1_31.aFloat208 * this.aClass102_Sub1_31.aFloat214, this.aClass102_Sub1_31.aFloat209 * this.aClass102_Sub1_31.aFloat214, this.aClass102_Sub1_31.aFloat210 * this.aClass102_Sub1_31.aFloat214, 333240893);
		}
		if (this.aClass80_Sub13_Sub1_79 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_79, -this.aClass102_Sub1_31.aFloat208 * this.aClass102_Sub1_31.aFloat216, -this.aClass102_Sub1_31.aFloat209 * this.aClass102_Sub1_31.aFloat216, -this.aClass102_Sub1_31.aFloat210 * this.aClass102_Sub1_31.aFloat216, 1876778204);
		}
		if (this.aClass80_Sub13_Sub1_81 != null) {
			this.aClass113_10.method8270(this.aClass80_Sub13_Sub1_81, Math.abs(this.aClass102_Sub1_31.aFloatArray68[1]) * 928.0F + 64.0F, 1576397942);
		}
	}

	@OriginalMember(owner = "client!ahu", name = "au", descriptor = "(I)V")
	final void method20463(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2875; local1++) {
			this.anIntArray257[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "ae", descriptor = "(ILclient!ov;)V")
	final void method20464(@OriginalArg(0) int arg0, @OriginalArg(1) Class471 arg1) {
		if (this.aClass80_Sub13_Sub1_69 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass102_Sub1_31.aFloatArray68[0], this.aClass102_Sub1_31.aFloatArray68[1], this.aClass102_Sub1_31.aFloatArray68[2] };
			arg1.method29788(local29);
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_69, local29[0], local29[1], local29[2], 1557333382);
		}
	}

	@OriginalMember(owner = "client!ahu", name = "aq", descriptor = "(Lclient!ov;)V")
	final void method20465(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_31.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) -7);
		if (this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, local3, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass80_Sub13_Sub1_71 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21264());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21180());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFDF;
		}
		this.method20488(local11, arg0);
		this.method20470(local11, arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "l", descriptor = "()V")
	@Override
	final void method20451() {
	}

	@OriginalMember(owner = "client!ahu", name = "aw", descriptor = "(Lclient!ov;)V")
	final void method20466(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_31.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) -13);
		if (this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, local3, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass80_Sub13_Sub1_71 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21264());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21180());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFDF;
		}
		this.method20488(local11, arg0);
		this.method20470(local11, arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "as", descriptor = "(I)V")
	final void method20467(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2875; local1++) {
			this.anIntArray257[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "m", descriptor = "()V")
	@Override
	final void method20443() {
		this.aClass113_10.method8256();
		this.anIntArray257[this.aClass113_10.method8355((byte) 56)] = -1;
		this.method20457(0);
		this.method20458();
	}

	@OriginalMember(owner = "client!ahu", name = "o", descriptor = "()V")
	@Override
	final void method20444() {
		this.aClass113_10.method8256();
		this.anIntArray257[this.aClass113_10.method8355((byte) -76)] = -1;
		this.method20457(0);
		this.method20458();
	}

	@OriginalMember(owner = "client!ahu", name = "j", descriptor = "()V")
	@Override
	final void method20445() {
		if (this.aClass113_10 != null) {
			this.aClass113_10.method8257();
		}
	}

	@OriginalMember(owner = "client!ahu", name = "bg", descriptor = "(Lclient!ov;)V")
	final void method20468(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_31.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) -46);
		if (this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, local3, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass80_Sub13_Sub1_71 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21264());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21180());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFDF;
		}
		this.method20488(local11, arg0);
		this.method20470(local11, arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "h", descriptor = "()V")
	@Override
	final void method20452() {
		this.method20465(Class471.aClass471_53);
	}

	@OriginalMember(owner = "client!ahu", name = "d", descriptor = "()V")
	@Override
	final void method20453() {
		this.method20465(Class471.aClass471_53);
	}

	@OriginalMember(owner = "client!ahu", name = "z", descriptor = "()V")
	@Override
	final void method20440() {
		this.method20465(Class471.aClass471_53);
	}

	@OriginalMember(owner = "client!ahu", name = "aj", descriptor = "(Ljava/lang/String;)Z")
	final boolean method20469(@OriginalArg(0) String arg0) throws Exception_Sub5 {
		this.aClass113_10 = this.aClass102_Sub1_31.method21142(arg0);
		if (this.aClass113_10 == null) {
			throw new Exception_Sub5("");
		}
		this.aClass80_Sub13_Sub1_76 = this.aClass113_10.method8292("textureMatrix", 1805699814);
		this.aClass80_Sub13_Sub1_72 = this.aClass113_10.method8292("modelMatrix", 1721669044);
		this.aClass80_Sub13_Sub1_74 = this.aClass113_10.method8292("viewMatrix", 1339640853);
		this.aClass80_Sub13_Sub1_83 = this.aClass113_10.method8292("projectionMatrix", 1851975434);
		this.aClass80_Sub13_Sub1_71 = this.aClass113_10.method8292("modelViewMatrix", -712938269);
		this.aClass80_Sub13_Sub1_80 = this.aClass113_10.method8292("modelViewProjectionMatrix", 848233760);
		this.aClass80_Sub13_Sub1_73 = this.aClass113_10.method8292("viewProjectionMatrix", -111358100);
		this.aClass80_Sub13_Sub1_77 = this.aClass113_10.method8292("ambientColour", 1241309746);
		this.aClass80_Sub13_Sub1_68 = this.aClass113_10.method8292("sunDirection", -1626341694);
		this.aClass80_Sub13_Sub1_78 = this.aClass113_10.method8292("sunColour", -39121143);
		this.aClass80_Sub13_Sub1_79 = this.aClass113_10.method8292("antiSunColour", 1153508165);
		this.aClass80_Sub13_Sub1_81 = this.aClass113_10.method8292("sunExponent", 1261854027);
		this.aClass80_Sub13_Sub1_82 = this.aClass113_10.method8292("eyePosition", -1260214351);
		this.aClass80_Sub13_Sub1_75 = this.aClass113_10.method8292("eyePositionOS", -1410754694);
		this.aClass80_Sub13_Sub1_69 = this.aClass113_10.method8292("sunDirectionOS", -816893139);
		if (this.method20455()) {
			if (this.aClass113_10.method8267(-2066090063) == null) {
				@Pc(181) Class114 local181 = this.aClass113_10.method8361(1034180571);
				if (local181 == null) {
					throw new Exception_Sub5(this.aClass113_10.method8259(-250439922) + "");
				}
				this.aClass113_10.method8295(local181);
			}
			this.anInt2875 = this.aClass113_10.method8262((byte) 0);
			this.anIntArray257 = new int[this.anInt2875];
			return true;
		}
		this.aClass113_10 = null;
		this.aClass80_Sub13_Sub1_76 = null;
		this.aClass80_Sub13_Sub1_72 = null;
		this.aClass80_Sub13_Sub1_74 = null;
		this.aClass80_Sub13_Sub1_83 = null;
		this.aClass80_Sub13_Sub1_71 = null;
		this.aClass80_Sub13_Sub1_80 = null;
		this.aClass80_Sub13_Sub1_73 = null;
		this.aClass80_Sub13_Sub1_77 = null;
		this.aClass80_Sub13_Sub1_68 = null;
		this.aClass80_Sub13_Sub1_78 = null;
		this.aClass80_Sub13_Sub1_79 = null;
		this.aClass80_Sub13_Sub1_81 = null;
		this.aClass80_Sub13_Sub1_82 = null;
		this.aClass80_Sub13_Sub1_75 = null;
		this.aClass80_Sub13_Sub1_69 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahu", name = "ax", descriptor = "(ILclient!ov;)V")
	final void method20470(@OriginalArg(0) int arg0, @OriginalArg(1) Class471 arg1) {
		if (this.aClass80_Sub13_Sub1_69 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass102_Sub1_31.aFloatArray68[0], this.aClass102_Sub1_31.aFloatArray68[1], this.aClass102_Sub1_31.aFloatArray68[2] };
			arg1.method29788(local29);
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_69, local29[0], local29[1], local29[2], -442758929);
		}
	}

	@OriginalMember(owner = "client!ahu", name = "ag", descriptor = "(Ljava/lang/String;)Z")
	final boolean method20471(@OriginalArg(0) String arg0) throws Exception_Sub5 {
		this.aClass113_10 = this.aClass102_Sub1_31.method21142(arg0);
		if (this.aClass113_10 == null) {
			throw new Exception_Sub5("");
		}
		this.aClass80_Sub13_Sub1_76 = this.aClass113_10.method8292("textureMatrix", 1026022100);
		this.aClass80_Sub13_Sub1_72 = this.aClass113_10.method8292("modelMatrix", 1054413578);
		this.aClass80_Sub13_Sub1_74 = this.aClass113_10.method8292("viewMatrix", 955416154);
		this.aClass80_Sub13_Sub1_83 = this.aClass113_10.method8292("projectionMatrix", -909962296);
		this.aClass80_Sub13_Sub1_71 = this.aClass113_10.method8292("modelViewMatrix", 7219148);
		this.aClass80_Sub13_Sub1_80 = this.aClass113_10.method8292("modelViewProjectionMatrix", 1098899870);
		this.aClass80_Sub13_Sub1_73 = this.aClass113_10.method8292("viewProjectionMatrix", 866222463);
		this.aClass80_Sub13_Sub1_77 = this.aClass113_10.method8292("ambientColour", -110385846);
		this.aClass80_Sub13_Sub1_68 = this.aClass113_10.method8292("sunDirection", 523364122);
		this.aClass80_Sub13_Sub1_78 = this.aClass113_10.method8292("sunColour", -1548215903);
		this.aClass80_Sub13_Sub1_79 = this.aClass113_10.method8292("antiSunColour", 642692953);
		this.aClass80_Sub13_Sub1_81 = this.aClass113_10.method8292("sunExponent", -205617275);
		this.aClass80_Sub13_Sub1_82 = this.aClass113_10.method8292("eyePosition", 884865985);
		this.aClass80_Sub13_Sub1_75 = this.aClass113_10.method8292("eyePositionOS", 1218218116);
		this.aClass80_Sub13_Sub1_69 = this.aClass113_10.method8292("sunDirectionOS", 1224517689);
		if (this.method20455()) {
			if (this.aClass113_10.method8267(-2066090063) == null) {
				@Pc(181) Class114 local181 = this.aClass113_10.method8361(1034180571);
				if (local181 == null) {
					throw new Exception_Sub5(this.aClass113_10.method8259(-250439922) + "");
				}
				this.aClass113_10.method8295(local181);
			}
			this.anInt2875 = this.aClass113_10.method8262((byte) 0);
			this.anIntArray257 = new int[this.anInt2875];
			return true;
		}
		this.aClass113_10 = null;
		this.aClass80_Sub13_Sub1_76 = null;
		this.aClass80_Sub13_Sub1_72 = null;
		this.aClass80_Sub13_Sub1_74 = null;
		this.aClass80_Sub13_Sub1_83 = null;
		this.aClass80_Sub13_Sub1_71 = null;
		this.aClass80_Sub13_Sub1_80 = null;
		this.aClass80_Sub13_Sub1_73 = null;
		this.aClass80_Sub13_Sub1_77 = null;
		this.aClass80_Sub13_Sub1_68 = null;
		this.aClass80_Sub13_Sub1_78 = null;
		this.aClass80_Sub13_Sub1_79 = null;
		this.aClass80_Sub13_Sub1_81 = null;
		this.aClass80_Sub13_Sub1_82 = null;
		this.aClass80_Sub13_Sub1_75 = null;
		this.aClass80_Sub13_Sub1_69 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahu", name = "ab", descriptor = "(Ljava/lang/String;)Z")
	final boolean method20472(@OriginalArg(0) String arg0) throws Exception_Sub5 {
		this.aClass113_10 = this.aClass102_Sub1_31.method21142(arg0);
		if (this.aClass113_10 == null) {
			throw new Exception_Sub5("");
		}
		this.aClass80_Sub13_Sub1_76 = this.aClass113_10.method8292("textureMatrix", 1460571552);
		this.aClass80_Sub13_Sub1_72 = this.aClass113_10.method8292("modelMatrix", 300199736);
		this.aClass80_Sub13_Sub1_74 = this.aClass113_10.method8292("viewMatrix", -21274853);
		this.aClass80_Sub13_Sub1_83 = this.aClass113_10.method8292("projectionMatrix", 1950821980);
		this.aClass80_Sub13_Sub1_71 = this.aClass113_10.method8292("modelViewMatrix", 1274982568);
		this.aClass80_Sub13_Sub1_80 = this.aClass113_10.method8292("modelViewProjectionMatrix", 1434451482);
		this.aClass80_Sub13_Sub1_73 = this.aClass113_10.method8292("viewProjectionMatrix", -435467005);
		this.aClass80_Sub13_Sub1_77 = this.aClass113_10.method8292("ambientColour", 3567450);
		this.aClass80_Sub13_Sub1_68 = this.aClass113_10.method8292("sunDirection", -249371425);
		this.aClass80_Sub13_Sub1_78 = this.aClass113_10.method8292("sunColour", 971882957);
		this.aClass80_Sub13_Sub1_79 = this.aClass113_10.method8292("antiSunColour", 1391185467);
		this.aClass80_Sub13_Sub1_81 = this.aClass113_10.method8292("sunExponent", -560192820);
		this.aClass80_Sub13_Sub1_82 = this.aClass113_10.method8292("eyePosition", 1242551361);
		this.aClass80_Sub13_Sub1_75 = this.aClass113_10.method8292("eyePositionOS", 548812994);
		this.aClass80_Sub13_Sub1_69 = this.aClass113_10.method8292("sunDirectionOS", -241457427);
		if (this.method20455()) {
			if (this.aClass113_10.method8267(-2066090063) == null) {
				@Pc(181) Class114 local181 = this.aClass113_10.method8361(1034180571);
				if (local181 == null) {
					throw new Exception_Sub5(this.aClass113_10.method8259(-250439922) + "");
				}
				this.aClass113_10.method8295(local181);
			}
			this.anInt2875 = this.aClass113_10.method8262((byte) 0);
			this.anIntArray257 = new int[this.anInt2875];
			return true;
		}
		this.aClass113_10 = null;
		this.aClass80_Sub13_Sub1_76 = null;
		this.aClass80_Sub13_Sub1_72 = null;
		this.aClass80_Sub13_Sub1_74 = null;
		this.aClass80_Sub13_Sub1_83 = null;
		this.aClass80_Sub13_Sub1_71 = null;
		this.aClass80_Sub13_Sub1_80 = null;
		this.aClass80_Sub13_Sub1_73 = null;
		this.aClass80_Sub13_Sub1_77 = null;
		this.aClass80_Sub13_Sub1_68 = null;
		this.aClass80_Sub13_Sub1_78 = null;
		this.aClass80_Sub13_Sub1_79 = null;
		this.aClass80_Sub13_Sub1_81 = null;
		this.aClass80_Sub13_Sub1_82 = null;
		this.aClass80_Sub13_Sub1_75 = null;
		this.aClass80_Sub13_Sub1_69 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahu", name = "an", descriptor = "(ILclient!ov;)V")
	final void method20473(@OriginalArg(0) int arg0, @OriginalArg(1) Class471 arg1) {
		if (this.aClass80_Sub13_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class487 local6 = this.aClass102_Sub1_31.method21448();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray114[12], local6.aFloatArray114[13], local6.aFloatArray114[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method30091(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass102_Sub1_31.method20897().method29842(0.0F, 0.0F, 0.0F, local63);
		arg1.method29787(local30);
		this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_75, local30[0], local30[1], local30[2], 615021833);
	}

	@OriginalMember(owner = "client!ahu", name = "ah", descriptor = "()Z")
	abstract boolean method20474() throws Exception_Sub5;

	@OriginalMember(owner = "client!ahu", name = "al", descriptor = "()Z")
	abstract boolean method20475() throws Exception_Sub5;

	@OriginalMember(owner = "client!ahu", name = "am", descriptor = "(Lclient!pm;)V")
	void method20476(@OriginalArg(0) Class487 arg0) {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357() || this.aClass102_Sub1_31.method21351() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass113_10.method8355((byte) 47);
		if ((this.anIntArray257[local15] & 0x80) != 0 && this.aClass80_Sub13_Sub1_76 != null) {
			this.aClass113_10.method8261(this.aClass80_Sub13_Sub1_76, arg0, -1059958959);
			this.anIntArray257[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "ak", descriptor = "(Lclient!pm;)V")
	void method20477(@OriginalArg(0) Class487 arg0) {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357() || this.aClass102_Sub1_31.method21351() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass113_10.method8355((byte) -17);
		if ((this.anIntArray257[local15] & 0x80) != 0 && this.aClass80_Sub13_Sub1_76 != null) {
			this.aClass113_10.method8261(this.aClass80_Sub13_Sub1_76, arg0, -1706108072);
			this.anIntArray257[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "at", descriptor = "()V")
	final void method20478() {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357()) {
			return;
		}
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) 108);
		@Pc(16) int local16 = this.anIntArray257[local11];
		if ((local16 & 0x1) != 0 && this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, this.aClass102_Sub1_31.method21328(), -871388298);
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass80_Sub13_Sub1_74 != null) {
				this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_74, this.aClass102_Sub1_31.method21264(), -871388298);
			}
			if (this.aClass80_Sub13_Sub1_82 != null) {
				this.aFloatArray59[0] = 0.0F;
				this.aFloatArray59[1] = 0.0F;
				this.aFloatArray59[2] = 0.0F;
				this.aClass102_Sub1_31.method20897().method29771(this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2], this.aFloatArray59);
				this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_82, this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2], -98817552);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass80_Sub13_Sub1_71 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, this.aClass102_Sub1_31.method21181(), -871388298);
		}
		if ((local16 & 0x8) != 0 && this.aClass80_Sub13_Sub1_70 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_70, this.aClass102_Sub1_31.method21448(), -871388298);
		}
		if ((local16 & 0x4) != 0 && this.aClass80_Sub13_Sub1_83 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_83, this.aClass102_Sub1_31.method21151(), -871388298);
		}
		if ((local16 & 0x20) != 0 && this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(this.aClass102_Sub1_31.method21181(), this.aClass102_Sub1_31.method21151());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
		}
		if ((local16 & 0x40) != 0 && this.aClass80_Sub13_Sub1_73 != null) {
			aClass487_71.method30068(this.aClass102_Sub1_31.method21264(), this.aClass102_Sub1_31.method21151());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_73, aClass487_71, -871388298);
		}
		if (this.aClass102_Sub1_31.method21351() == 0 && (this.anIntArray257[local11] & 0x80) != 0 && this.aClass80_Sub13_Sub1_76 != null) {
			this.aClass113_10.method8261(this.aClass80_Sub13_Sub1_76, this.aClass102_Sub1_31.method21225(), -1956890651);
			this.anIntArray257[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray257[local11] = 0;
	}

	@OriginalMember(owner = "client!ahu", name = "ad", descriptor = "()V")
	final void method20479() {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357()) {
			return;
		}
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) -31);
		@Pc(16) int local16 = this.anIntArray257[local11];
		if ((local16 & 0x1) != 0 && this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, this.aClass102_Sub1_31.method21328(), -871388298);
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass80_Sub13_Sub1_74 != null) {
				this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_74, this.aClass102_Sub1_31.method21264(), -871388298);
			}
			if (this.aClass80_Sub13_Sub1_82 != null) {
				this.aFloatArray59[0] = 0.0F;
				this.aFloatArray59[1] = 0.0F;
				this.aFloatArray59[2] = 0.0F;
				this.aClass102_Sub1_31.method20897().method29771(this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2], this.aFloatArray59);
				this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_82, this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2], -2116178737);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass80_Sub13_Sub1_71 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, this.aClass102_Sub1_31.method21181(), -871388298);
		}
		if ((local16 & 0x8) != 0 && this.aClass80_Sub13_Sub1_70 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_70, this.aClass102_Sub1_31.method21448(), -871388298);
		}
		if ((local16 & 0x4) != 0 && this.aClass80_Sub13_Sub1_83 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_83, this.aClass102_Sub1_31.method21151(), -871388298);
		}
		if ((local16 & 0x20) != 0 && this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(this.aClass102_Sub1_31.method21181(), this.aClass102_Sub1_31.method21151());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
		}
		if ((local16 & 0x40) != 0 && this.aClass80_Sub13_Sub1_73 != null) {
			aClass487_71.method30068(this.aClass102_Sub1_31.method21264(), this.aClass102_Sub1_31.method21151());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_73, aClass487_71, -871388298);
		}
		if (this.aClass102_Sub1_31.method21351() == 0 && (this.anIntArray257[local11] & 0x80) != 0 && this.aClass80_Sub13_Sub1_76 != null) {
			this.aClass113_10.method8261(this.aClass80_Sub13_Sub1_76, this.aClass102_Sub1_31.method21225(), -1425721787);
			this.anIntArray257[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray257[local11] = 0;
	}

	@OriginalMember(owner = "client!ahu", name = "av", descriptor = "(ILclient!ov;)V")
	final void method20480(@OriginalArg(0) int arg0, @OriginalArg(1) Class471 arg1) {
		if (this.aClass80_Sub13_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class487 local6 = this.aClass102_Sub1_31.method21448();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray114[12], local6.aFloatArray114[13], local6.aFloatArray114[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method30091(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass102_Sub1_31.method20897().method29842(0.0F, 0.0F, 0.0F, local63);
		arg1.method29787(local30);
		this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_75, local30[0], local30[1], local30[2], -1680279583);
	}

	@OriginalMember(owner = "client!ahu", name = "aa", descriptor = "(ILclient!ov;)V")
	final void method20481(@OriginalArg(0) int arg0, @OriginalArg(1) Class471 arg1) {
		if (this.aClass80_Sub13_Sub1_69 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass102_Sub1_31.aFloatArray68[0], this.aClass102_Sub1_31.aFloatArray68[1], this.aClass102_Sub1_31.aFloatArray68[2] };
			arg1.method29788(local29);
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_69, local29[0], local29[1], local29[2], -1893103865);
		}
	}

	@OriginalMember(owner = "client!ahu", name = "ac", descriptor = "(Ljava/lang/String;)Z")
	final boolean method20482(@OriginalArg(0) String arg0) throws Exception_Sub5 {
		this.aClass113_10 = this.aClass102_Sub1_31.method21142(arg0);
		if (this.aClass113_10 == null) {
			throw new Exception_Sub5("");
		}
		this.aClass80_Sub13_Sub1_76 = this.aClass113_10.method8292("textureMatrix", 2082944342);
		this.aClass80_Sub13_Sub1_72 = this.aClass113_10.method8292("modelMatrix", -1671206560);
		this.aClass80_Sub13_Sub1_74 = this.aClass113_10.method8292("viewMatrix", 466897988);
		this.aClass80_Sub13_Sub1_83 = this.aClass113_10.method8292("projectionMatrix", 848578639);
		this.aClass80_Sub13_Sub1_71 = this.aClass113_10.method8292("modelViewMatrix", 275561670);
		this.aClass80_Sub13_Sub1_80 = this.aClass113_10.method8292("modelViewProjectionMatrix", 610184298);
		this.aClass80_Sub13_Sub1_73 = this.aClass113_10.method8292("viewProjectionMatrix", -1151950479);
		this.aClass80_Sub13_Sub1_77 = this.aClass113_10.method8292("ambientColour", -832647569);
		this.aClass80_Sub13_Sub1_68 = this.aClass113_10.method8292("sunDirection", -106318021);
		this.aClass80_Sub13_Sub1_78 = this.aClass113_10.method8292("sunColour", -1160253488);
		this.aClass80_Sub13_Sub1_79 = this.aClass113_10.method8292("antiSunColour", -547396538);
		this.aClass80_Sub13_Sub1_81 = this.aClass113_10.method8292("sunExponent", -1001779985);
		this.aClass80_Sub13_Sub1_82 = this.aClass113_10.method8292("eyePosition", -439786746);
		this.aClass80_Sub13_Sub1_75 = this.aClass113_10.method8292("eyePositionOS", 1543025281);
		this.aClass80_Sub13_Sub1_69 = this.aClass113_10.method8292("sunDirectionOS", -1277765315);
		if (this.method20455()) {
			if (this.aClass113_10.method8267(-2066090063) == null) {
				@Pc(181) Class114 local181 = this.aClass113_10.method8361(1034180571);
				if (local181 == null) {
					throw new Exception_Sub5(this.aClass113_10.method8259(-250439922) + "");
				}
				this.aClass113_10.method8295(local181);
			}
			this.anInt2875 = this.aClass113_10.method8262((byte) 0);
			this.anIntArray257 = new int[this.anInt2875];
			return true;
		}
		this.aClass113_10 = null;
		this.aClass80_Sub13_Sub1_76 = null;
		this.aClass80_Sub13_Sub1_72 = null;
		this.aClass80_Sub13_Sub1_74 = null;
		this.aClass80_Sub13_Sub1_83 = null;
		this.aClass80_Sub13_Sub1_71 = null;
		this.aClass80_Sub13_Sub1_80 = null;
		this.aClass80_Sub13_Sub1_73 = null;
		this.aClass80_Sub13_Sub1_77 = null;
		this.aClass80_Sub13_Sub1_68 = null;
		this.aClass80_Sub13_Sub1_78 = null;
		this.aClass80_Sub13_Sub1_79 = null;
		this.aClass80_Sub13_Sub1_81 = null;
		this.aClass80_Sub13_Sub1_82 = null;
		this.aClass80_Sub13_Sub1_75 = null;
		this.aClass80_Sub13_Sub1_69 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahu", name = "ap", descriptor = "(Z)V")
	void method20483(@OriginalArg(0) boolean arg0) {
		if (this.aClass113_10 == null || !this.aClass113_10.method8357()) {
			return;
		}
		if (this.aClass80_Sub13_Sub1_77 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_77, this.aClass102_Sub1_31.aFloat208 * this.aClass102_Sub1_31.aFloat212, this.aClass102_Sub1_31.aFloat209 * this.aClass102_Sub1_31.aFloat212, this.aClass102_Sub1_31.aFloat210 * this.aClass102_Sub1_31.aFloat212, -1019763099);
		}
		if (this.aClass80_Sub13_Sub1_68 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_68, this.aClass102_Sub1_31.aFloatArray68[0], this.aClass102_Sub1_31.aFloatArray68[1], this.aClass102_Sub1_31.aFloatArray68[2], 1389316082);
		}
		if (this.aClass80_Sub13_Sub1_78 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_78, this.aClass102_Sub1_31.aFloat208 * this.aClass102_Sub1_31.aFloat214, this.aClass102_Sub1_31.aFloat209 * this.aClass102_Sub1_31.aFloat214, this.aClass102_Sub1_31.aFloat210 * this.aClass102_Sub1_31.aFloat214, -1828927336);
		}
		if (this.aClass80_Sub13_Sub1_79 != null) {
			this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_79, -this.aClass102_Sub1_31.aFloat208 * this.aClass102_Sub1_31.aFloat216, -this.aClass102_Sub1_31.aFloat209 * this.aClass102_Sub1_31.aFloat216, -this.aClass102_Sub1_31.aFloat210 * this.aClass102_Sub1_31.aFloat216, 1895651772);
		}
		if (this.aClass80_Sub13_Sub1_81 != null) {
			this.aClass113_10.method8270(this.aClass80_Sub13_Sub1_81, Math.abs(this.aClass102_Sub1_31.aFloatArray68[1]) * 928.0F + 64.0F, 1655907591);
		}
	}

	@OriginalMember(owner = "client!ahu", name = "i", descriptor = "()V")
	@Override
	final void method20454() {
		this.method20465(Class471.aClass471_53);
	}

	@OriginalMember(owner = "client!ahu", name = "ar", descriptor = "(I)V")
	final void method20484(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2875; local1++) {
			this.anIntArray257[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "az", descriptor = "(I)V")
	final void method20485(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2875; local1++) {
			this.anIntArray257[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "bl", descriptor = "(Lclient!ov;)V")
	final void method20486(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_31.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11 = this.aClass113_10.method8355((byte) -21);
		if (this.aClass80_Sub13_Sub1_72 != null) {
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_72, local3, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass80_Sub13_Sub1_71 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21264());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_71, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass80_Sub13_Sub1_80 != null) {
			aClass487_71.method30068(local3, this.aClass102_Sub1_31.method21180());
			this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_80, aClass487_71, -871388298);
			this.anIntArray257[local11] &= 0xFFFFFFDF;
		}
		this.method20488(local11, arg0);
		this.method20470(local11, arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "x", descriptor = "()V")
	@Override
	final void method20438() {
	}

	@OriginalMember(owner = "client!ahu", name = "af", descriptor = "()V")
	final void method20487() {
		this.method20462(this.aClass102_Sub1_31.aBoolean511);
		this.method20459(this.aClass102_Sub1_31.method21225());
		this.method20460();
		this.method20451();
	}

	@OriginalMember(owner = "client!ahu", name = "b", descriptor = "(ILclient!ov;)V")
	final void method20488(@OriginalArg(0) int arg0, @OriginalArg(1) Class471 arg1) {
		if (this.aClass80_Sub13_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class487 local6 = this.aClass102_Sub1_31.method21448();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray114[12], local6.aFloatArray114[13], local6.aFloatArray114[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method30091(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass102_Sub1_31.method20897().method29842(0.0F, 0.0F, 0.0F, local63);
		arg1.method29787(local30);
		this.aClass113_10.method8272(this.aClass80_Sub13_Sub1_75, local30[0], local30[1], local30[2], -1124419729);
	}

	@OriginalMember(owner = "client!ahu", name = "br", descriptor = "(I)V")
	final void method20489(@OriginalArg(0) int arg0) {
		this.aClass487Array5[0].method30139();
		this.method20461(arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "bn", descriptor = "(I)V")
	final void method20490(@OriginalArg(0) int arg0) {
		this.aClass487Array5[0].method30139();
		this.method20461(arg0);
	}
}
