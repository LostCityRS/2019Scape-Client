package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahi")
public abstract class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!ahi", name = "i", descriptor = "I")
	static final int anInt2966 = 32;

	@OriginalMember(owner = "client!ahi", name = "t", descriptor = "I")
	static final int anInt2967 = 128;

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "I")
	static final int anInt2969 = 16;

	@OriginalMember(owner = "client!ahi", name = "b", descriptor = "I")
	static final int anInt2970 = 2;

	@OriginalMember(owner = "client!ahi", name = "h", descriptor = "I")
	static final int anInt2971 = 4;

	@OriginalMember(owner = "client!ahi", name = "x", descriptor = "I")
	static final int anInt2972 = 1;

	@OriginalMember(owner = "client!ahi", name = "j", descriptor = "I")
	static final int anInt2973 = 64;

	@OriginalMember(owner = "client!ahi", name = "a", descriptor = "I")
	static final int anInt2974 = 8;

	@OriginalMember(owner = "client!ahi", name = "ah", descriptor = "Lclient!pq;")
	static final Class489 aClass489_89 = new Class489();

	@OriginalMember(owner = "client!ahi", name = "q", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_68;

	@OriginalMember(owner = "client!ahi", name = "f", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_69;

	@OriginalMember(owner = "client!ahi", name = "n", descriptor = "Lclient!ho;")
	protected Class115 aClass115_10;

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_70;

	@OriginalMember(owner = "client!ahi", name = "y", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_71;

	@OriginalMember(owner = "client!ahi", name = "z", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_72;

	@OriginalMember(owner = "client!ahi", name = "p", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_73;

	@OriginalMember(owner = "client!ahi", name = "d", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_74;

	@OriginalMember(owner = "client!ahi", name = "c", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_75;

	@OriginalMember(owner = "client!ahi", name = "r", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_76;

	@OriginalMember(owner = "client!ahi", name = "v", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_77;

	@OriginalMember(owner = "client!ahi", name = "ae", descriptor = "I")
	int anInt2968;

	@OriginalMember(owner = "client!ahi", name = "s", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_78;

	@OriginalMember(owner = "client!ahi", name = "o", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_79;

	@OriginalMember(owner = "client!ahi", name = "u", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_80;

	@OriginalMember(owner = "client!ahi", name = "m", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_81;

	@OriginalMember(owner = "client!ahi", name = "w", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_82;

	@OriginalMember(owner = "client!ahi", name = "k", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_83;

	@OriginalMember(owner = "client!ahi", name = "ag", descriptor = "[I")
	int[] anIntArray256;

	@OriginalMember(owner = "client!ahi", name = "ac", descriptor = "[F")
	float[] aFloatArray67 = new float[3];

	@OriginalMember(owner = "client!ahi", name = "al", descriptor = "[Lclient!pq;")
	Class489[] aClass489Array6;

	@OriginalMember(owner = "client!ahi", name = "<init>", descriptor = "(Lclient!afc;)V", line = 40)
	Class128_Sub1(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
		new Class470();
		this.aClass489Array6 = new Class489[this.aClass104_Sub2_31.anInt2954];
		for (@Pc(18) int local18 = 0; local18 < this.aClass104_Sub2_31.anInt2954; local18++) {
			this.aClass489Array6[local18] = new Class489();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "h", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method21362(@OriginalArg(0) String arg0) throws Exception_Sub2 {
		this.aClass115_10 = this.aClass104_Sub2_31.method21124(arg0);
		if (this.aClass115_10 == null) {
			throw new Exception_Sub2("");
		}
		this.aClass93_Sub33_Sub1_81 = this.aClass115_10.method8284("textureMatrix", (short) -15919);
		this.aClass93_Sub33_Sub1_83 = this.aClass115_10.method8284("modelMatrix", (short) 12156);
		this.aClass93_Sub33_Sub1_69 = this.aClass115_10.method8284("viewMatrix", (short) 16401);
		this.aClass93_Sub33_Sub1_82 = this.aClass115_10.method8284("projectionMatrix", (short) -17767);
		this.aClass93_Sub33_Sub1_80 = this.aClass115_10.method8284("modelViewMatrix", (short) -19440);
		this.aClass93_Sub33_Sub1_72 = this.aClass115_10.method8284("modelViewProjectionMatrix", (short) -596);
		this.aClass93_Sub33_Sub1_73 = this.aClass115_10.method8284("viewProjectionMatrix", (short) 2250);
		this.aClass93_Sub33_Sub1_77 = this.aClass115_10.method8284("ambientColour", (short) -3895);
		this.aClass93_Sub33_Sub1_71 = this.aClass115_10.method8284("sunDirection", (short) 15663);
		this.aClass93_Sub33_Sub1_79 = this.aClass115_10.method8284("sunColour", (short) 6543);
		this.aClass93_Sub33_Sub1_78 = this.aClass115_10.method8284("antiSunColour", (short) 14237);
		this.aClass93_Sub33_Sub1_68 = this.aClass115_10.method8284("sunExponent", (short) -13894);
		this.aClass93_Sub33_Sub1_74 = this.aClass115_10.method8284("eyePosition", (short) 2741);
		this.aClass93_Sub33_Sub1_75 = this.aClass115_10.method8284("eyePositionOS", (short) 17235);
		this.aClass93_Sub33_Sub1_76 = this.aClass115_10.method8284("sunDirectionOS", (short) 1989);
		if (this.method21391()) {
			if (this.aClass115_10.method8213((byte) -84) == null) {
				@Pc(181) Class116 local181 = this.aClass115_10.method8211(-1794570113);
				if (local181 == null) {
					throw new Exception_Sub2(this.aClass115_10.method8193(-2010906649) + "");
				}
				this.aClass115_10.method8301(local181);
			}
			this.anInt2968 = this.aClass115_10.method8200((byte) -55);
			this.anIntArray256 = new int[this.anInt2968];
			return true;
		}
		this.aClass115_10 = null;
		this.aClass93_Sub33_Sub1_81 = null;
		this.aClass93_Sub33_Sub1_83 = null;
		this.aClass93_Sub33_Sub1_69 = null;
		this.aClass93_Sub33_Sub1_82 = null;
		this.aClass93_Sub33_Sub1_80 = null;
		this.aClass93_Sub33_Sub1_72 = null;
		this.aClass93_Sub33_Sub1_73 = null;
		this.aClass93_Sub33_Sub1_77 = null;
		this.aClass93_Sub33_Sub1_71 = null;
		this.aClass93_Sub33_Sub1_79 = null;
		this.aClass93_Sub33_Sub1_78 = null;
		this.aClass93_Sub33_Sub1_68 = null;
		this.aClass93_Sub33_Sub1_74 = null;
		this.aClass93_Sub33_Sub1_75 = null;
		this.aClass93_Sub33_Sub1_76 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahi", name = "e", descriptor = "()V", line = 102)
	@Override
	void method21355() {
		this.aClass115_10.method8315();
		this.anIntArray256[this.aClass115_10.method8216(-665083057)] = -1;
		this.method21389(0);
		this.method21363();
	}

	@OriginalMember(owner = "client!ahi", name = "z", descriptor = "()V", line = 102)
	@Override
	void method21358() {
		this.aClass115_10.method8315();
		this.anIntArray256[this.aClass115_10.method8216(-1699927368)] = -1;
		this.method21389(0);
		this.method21363();
	}

	@OriginalMember(owner = "client!ahi", name = "u", descriptor = "()V", line = 102)
	@Override
	void method21357() {
		this.aClass115_10.method8315();
		this.anIntArray256[this.aClass115_10.method8216(-1943929766)] = -1;
		this.method21389(0);
		this.method21363();
	}

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "()V", line = 109)
	void method21363() {
		this.method21378(this.aClass104_Sub2_31.aBoolean466);
		this.method21367(this.aClass104_Sub2_31.method21075());
		this.method21369();
		this.method21348();
	}

	@OriginalMember(owner = "client!ahi", name = "as", descriptor = "()V", line = 109)
	void method21364() {
		this.method21378(this.aClass104_Sub2_31.aBoolean466);
		this.method21367(this.aClass104_Sub2_31.method21075());
		this.method21369();
		this.method21348();
	}

	@OriginalMember(owner = "client!ahi", name = "at", descriptor = "()V", line = 109)
	void method21365() {
		this.method21378(this.aClass104_Sub2_31.aBoolean466);
		this.method21367(this.aClass104_Sub2_31.method21075());
		this.method21369();
		this.method21348();
	}

	@OriginalMember(owner = "client!ahi", name = "p", descriptor = "()V", line = 116)
	@Override
	void method21359() {
		if (this.aClass115_10 != null) {
			this.aClass115_10.method8310();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "d", descriptor = "()V", line = 116)
	@Override
	void method21360() {
		if (this.aClass115_10 != null) {
			this.aClass115_10.method8310();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "n", descriptor = "()V", line = 116)
	@Override
	void method21354() {
		if (this.aClass115_10 != null) {
			this.aClass115_10.method8310();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ad", descriptor = "(Lclient!pq;)V", line = 120)
	void method21366(@OriginalArg(0) Class489 arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303() || this.aClass104_Sub2_31.method21052() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass115_10.method8216(-446264616);
		if ((this.anIntArray256[local15] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8240(this.aClass93_Sub33_Sub1_81, arg0, 289553904);
			this.anIntArray256[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "i", descriptor = "(Lclient!pq;)V", line = 120)
	void method21367(@OriginalArg(0) Class489 arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303() || this.aClass104_Sub2_31.method21052() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass115_10.method8216(-1076318272);
		if ((this.anIntArray256[local15] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8240(this.aClass93_Sub33_Sub1_81, arg0, 1706795822);
			this.anIntArray256[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "am", descriptor = "(Lclient!pq;)V", line = 120)
	void method21368(@OriginalArg(0) Class489 arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303() || this.aClass104_Sub2_31.method21052() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass115_10.method8216(-1460618247);
		if ((this.anIntArray256[local15] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8240(this.aClass93_Sub33_Sub1_81, arg0, 700151505);
			this.anIntArray256[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "j", descriptor = "()V", line = 130)
	void method21369() {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303()) {
			return;
		}
		@Pc(11) int local11 = this.aClass115_10.method8216(-1620564370);
		@Pc(16) int local16 = this.anIntArray256[local11];
		if ((local16 & 0x1) != 0 && this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_83, this.aClass104_Sub2_31.method20983(), -1347630644);
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass93_Sub33_Sub1_69 != null) {
				this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_69, this.aClass104_Sub2_31.method20972(), -1378966176);
			}
			if (this.aClass93_Sub33_Sub1_74 != null) {
				this.aFloatArray67[0] = 0.0F;
				this.aFloatArray67[1] = 0.0F;
				this.aFloatArray67[2] = 0.0F;
				this.aClass104_Sub2_31.method20602().method29439(this.aFloatArray67[0], this.aFloatArray67[1], this.aFloatArray67[2], this.aFloatArray67);
				this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_74, this.aFloatArray67[0], this.aFloatArray67[1], this.aFloatArray67[2], -289402020);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass93_Sub33_Sub1_80 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_80, this.aClass104_Sub2_31.method20987(), -972101720);
		}
		if ((local16 & 0x8) != 0 && this.aClass93_Sub33_Sub1_70 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_70, this.aClass104_Sub2_31.method20975(), -1719674207);
		}
		if ((local16 & 0x4) != 0 && this.aClass93_Sub33_Sub1_82 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_82, this.aClass104_Sub2_31.method20990(), -992215737);
		}
		if ((local16 & 0x20) != 0 && this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29857(this.aClass104_Sub2_31.method20987(), this.aClass104_Sub2_31.method20990());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_72, aClass489_89, -1067210474);
		}
		if ((local16 & 0x40) != 0 && this.aClass93_Sub33_Sub1_73 != null) {
			aClass489_89.method29857(this.aClass104_Sub2_31.method20972(), this.aClass104_Sub2_31.method20990());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_73, aClass489_89, -1748002656);
		}
		if (this.aClass104_Sub2_31.method21052() == 0 && (this.anIntArray256[local11] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8240(this.aClass93_Sub33_Sub1_81, this.aClass104_Sub2_31.method21075(), 1436277068);
			this.anIntArray256[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray256[local11] = 0;
	}

	@OriginalMember(owner = "client!ahi", name = "t", descriptor = "(ILclient!ou;)V", line = 174)
	void method21370(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20975();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29888(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20602().method29436(0.0F, 0.0F, 0.0F, local63);
		arg1.method29441(local30);
		this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2], -89163261);
	}

	@OriginalMember(owner = "client!ahi", name = "ap", descriptor = "(ILclient!ou;)V", line = 174)
	void method21371(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20975();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29888(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20602().method29436(0.0F, 0.0F, 0.0F, local63);
		arg1.method29441(local30);
		this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2], -1830870010);
	}

	@OriginalMember(owner = "client!ahi", name = "au", descriptor = "(ILclient!ou;)V", line = 174)
	void method21372(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20975();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29888(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20602().method29436(0.0F, 0.0F, 0.0F, local63);
		arg1.method29441(local30);
		this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2], -1869774124);
	}

	@OriginalMember(owner = "client!ahi", name = "ar", descriptor = "(ILclient!ou;)V", line = 174)
	void method21373(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20975();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29888(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20602().method29436(0.0F, 0.0F, 0.0F, local63);
		arg1.method29441(local30);
		this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2], -529172388);
	}

	@OriginalMember(owner = "client!ahi", name = "ae", descriptor = "(ILclient!ou;)V", line = 187)
	void method21374(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg1.method29443(local29);
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2], -1063877357);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "aq", descriptor = "(ILclient!ou;)V", line = 187)
	void method21375(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg1.method29443(local29);
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2], 1463637720);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ax", descriptor = "(ILclient!ou;)V", line = 187)
	void method21376(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg1.method29443(local29);
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2], 1827322045);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "av", descriptor = "(ILclient!ou;)V", line = 187)
	void method21377(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg1.method29443(local29);
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2], 1900818242);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ag", descriptor = "(Z)V", line = 195)
	void method21378(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303()) {
			return;
		}
		if (this.aClass93_Sub33_Sub1_77 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_77, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat211, 1413105055);
		}
		if (this.aClass93_Sub33_Sub1_71 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_71, this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2], -812626586);
		}
		if (this.aClass93_Sub33_Sub1_79 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_79, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat212, 121082040);
		}
		if (this.aClass93_Sub33_Sub1_78 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_78, -this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat213, 2047878099);
		}
		if (this.aClass93_Sub33_Sub1_68 != null) {
			this.aClass115_10.method8220(this.aClass93_Sub33_Sub1_68, Math.abs(this.aClass104_Sub2_31.aFloatArray63[1]) * 928.0F + 64.0F, (byte) -41);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ao", descriptor = "(Z)V", line = 195)
	void method21379(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303()) {
			return;
		}
		if (this.aClass93_Sub33_Sub1_77 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_77, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat211, -1314911593);
		}
		if (this.aClass93_Sub33_Sub1_71 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_71, this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2], -1377185009);
		}
		if (this.aClass93_Sub33_Sub1_79 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_79, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat212, -1704956371);
		}
		if (this.aClass93_Sub33_Sub1_78 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_78, -this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat213, 1128134514);
		}
		if (this.aClass93_Sub33_Sub1_68 != null) {
			this.aClass115_10.method8220(this.aClass93_Sub33_Sub1_68, Math.abs(this.aClass104_Sub2_31.aFloatArray63[1]) * 928.0F + 64.0F, (byte) -1);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "aj", descriptor = "(Z)V", line = 195)
	void method21380(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8303()) {
			return;
		}
		if (this.aClass93_Sub33_Sub1_77 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_77, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat211, 254236135);
		}
		if (this.aClass93_Sub33_Sub1_71 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_71, this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2], 1521519798);
		}
		if (this.aClass93_Sub33_Sub1_79 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_79, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat212, 729235911);
		}
		if (this.aClass93_Sub33_Sub1_78 != null) {
			this.aClass115_10.method8222(this.aClass93_Sub33_Sub1_78, -this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat213, 91634319);
		}
		if (this.aClass93_Sub33_Sub1_68 != null) {
			this.aClass115_10.method8220(this.aClass93_Sub33_Sub1_68, Math.abs(this.aClass104_Sub2_31.aFloatArray63[1]) * 928.0F + 64.0F, (byte) -119);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "f", descriptor = "()V", line = 204)
	@Override
	void method21348() {
	}

	@OriginalMember(owner = "client!ahi", name = "o", descriptor = "()V", line = 204)
	@Override
	void method21347() {
	}

	@OriginalMember(owner = "client!ahi", name = "ah", descriptor = "(I)V", line = 207)
	void method21381(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ay", descriptor = "(I)V", line = 207)
	void method21382(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ab", descriptor = "(I)V", line = 207)
	void method21383(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "az", descriptor = "(I)V", line = 207)
	void method21384(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "al", descriptor = "(Lclient!ou;)V", line = 213)
	void method21385(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_31.aClass489_78;
		local3.method29865(arg0);
		@Pc(11) int local11 = this.aClass115_10.method8216(-1525621124);
		if (this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_83, local3, -903126170);
			this.anIntArray256[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass93_Sub33_Sub1_80 != null) {
			aClass489_89.method29857(local3, this.aClass104_Sub2_31.method20972());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_80, aClass489_89, -1442959645);
			this.anIntArray256[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29857(local3, this.aClass104_Sub2_31.method20989());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_72, aClass489_89, -1722460807);
			this.anIntArray256[local11] &= 0xFFFFFFDF;
		}
		this.method21370(local11, arg0);
		this.method21374(local11, arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "aa", descriptor = "(Lclient!ou;)V", line = 213)
	void method21386(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_31.aClass489_78;
		local3.method29865(arg0);
		@Pc(11) int local11 = this.aClass115_10.method8216(-1672073722);
		if (this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_83, local3, -1658831743);
			this.anIntArray256[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass93_Sub33_Sub1_80 != null) {
			aClass489_89.method29857(local3, this.aClass104_Sub2_31.method20972());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_80, aClass489_89, -2036416885);
			this.anIntArray256[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29857(local3, this.aClass104_Sub2_31.method20989());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_72, aClass489_89, -1081726181);
			this.anIntArray256[local11] &= 0xFFFFFFDF;
		}
		this.method21370(local11, arg0);
		this.method21374(local11, arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "af", descriptor = "(Lclient!ou;)V", line = 213)
	void method21387(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_31.aClass489_78;
		local3.method29865(arg0);
		@Pc(11) int local11 = this.aClass115_10.method8216(-1999197568);
		if (this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_83, local3, -1132246580);
			this.anIntArray256[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass93_Sub33_Sub1_80 != null) {
			aClass489_89.method29857(local3, this.aClass104_Sub2_31.method20972());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_80, aClass489_89, -1022270026);
			this.anIntArray256[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29857(local3, this.aClass104_Sub2_31.method20989());
			this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_72, aClass489_89, -1321320149);
			this.anIntArray256[local11] &= 0xFFFFFFDF;
		}
		this.method21370(local11, arg0);
		this.method21374(local11, arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "()V", line = 235)
	@Override
	void method21356() {
		this.method21385(Class470.aClass470_54);
	}

	@OriginalMember(owner = "client!ahi", name = "b", descriptor = "()V", line = 235)
	@Override
	void method21353() {
		this.method21385(Class470.aClass470_54);
	}

	@OriginalMember(owner = "client!ahi", name = "x", descriptor = "()V", line = 235)
	@Override
	void method21361() {
		this.method21385(Class470.aClass470_54);
	}

	@OriginalMember(owner = "client!ahi", name = "an", descriptor = "(I)V", line = 239)
	void method21388(@OriginalArg(0) int arg0) {
		this.aClass489Array6[0].method29850();
		this.method21381(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "ac", descriptor = "(I)V", line = 239)
	void method21389(@OriginalArg(0) int arg0) {
		this.aClass489Array6[0].method29850();
		this.method21381(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "ak", descriptor = "(I)V", line = 239)
	void method21390(@OriginalArg(0) int arg0) {
		this.aClass489Array6[0].method29850();
		this.method21381(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "a", descriptor = "()Z")
	abstract boolean method21391() throws Exception_Sub2;

	@OriginalMember(owner = "client!ahi", name = "aw", descriptor = "()Z")
	abstract boolean method21392() throws Exception_Sub2;

	@OriginalMember(owner = "client!ahi", name = "ai", descriptor = "()Z")
	abstract boolean method21393() throws Exception_Sub2;
}
