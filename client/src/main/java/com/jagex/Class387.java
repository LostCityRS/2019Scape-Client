package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class387 {

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
	static final int anInt4545 = 7;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	static final int anInt4547 = 1;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
	static final int anInt4548 = 2;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
	static final int anInt4549 = 8;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
	static final int anInt4550 = 4;

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	static final int anInt4551 = 6;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
	static final int anInt4552 = 9;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	static final int anInt4553 = 5;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
	static final int anInt4554 = 12;

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
	static final int anInt4555 = 10;

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
	static final int anInt4556 = 11;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	static final int anInt4557 = 3;

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
	static final int anInt4558 = 13;

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
	static final int anInt4559 = 14;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "J")
	long aLong377;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
	int anInt4546 = 295557767;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "Lclient!aag;")
	Class8 aClass8_52 = new Class8();

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(II)V")
	public static void method28615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class130_Sub1.method10205(new Class591(arg0), (byte) -119);
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(Lclient!np;Lclient!nt;B)V")
	public static void method28616(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) Interface48 arg1, @OriginalArg(2) byte arg2) {
		Class654.anInt5672 = 0;
		Class654.anInt5669 = 0;
		Class286.aList14 = new LinkedList();
		Class654.aClass147_Sub3_Sub1_Sub1Array1 = new Class147_Sub3_Sub1_Sub1[1024];
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[Class654.anInt5665 * 2087772395] + 1];
		Class654.anInt5666 = 0;
		Class654.anInt5667 = 0;
		Class518.anInterface48_1 = arg1;
	}

	@OriginalMember(owner = "client!kt", name = "ail", descriptor = "(Lclient!yp;B)V")
	static void method28617(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local23 == -1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class71.aClass510_2.method30536(local13, -1783136755).method22900((char) local23, -1628197617);
		}
	}

	@OriginalMember(owner = "client!kt", name = "ayx", descriptor = "(Lclient!yp;I)V")
	static void method28618(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class61.anInt213 * -476027445;
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class387(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method28609(arg0, (byte) -64);
	}

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "(Lclient!ald;)V")
	void method28608(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aLong377 = arg0.method23273((byte) -66) * -1324060303723328867L;
		this.anInt4546 = arg0.method23182(2055683016) * -295557767;
		for (@Pc(17) int local17 = arg0.method23362(-362142614); local17 != 0; local17 = arg0.method23362(-133498752)) {
			@Pc(27) Class80_Sub28 local27;
			if (local17 == 3) {
				local27 = new Class80_Sub28_Sub2(this);
			} else if (local17 == 1) {
				local27 = new Class80_Sub28_Sub1(this);
			} else if (local17 == 13) {
				local27 = new Class80_Sub28_Sub12(this);
			} else if (local17 == 4) {
				local27 = new Class80_Sub28_Sub6(this);
			} else if (local17 == 6) {
				local27 = new Class80_Sub28_Sub9(this);
			} else if (local17 == 5) {
				local27 = new Class80_Sub28_Sub7(this);
			} else if (local17 == 2) {
				local27 = new Class80_Sub28_Sub8(this);
			} else if (local17 == 7) {
				local27 = new Class80_Sub28_Sub4(this);
			} else if (local17 == 14) {
				local27 = new Class80_Sub28_Sub5(this);
			} else if (local17 == 8) {
				local27 = new Class80_Sub28_Sub14(this);
			} else if (local17 == 9) {
				local27 = new Class80_Sub28_Sub3(this);
			} else if (local17 == 10) {
				local27 = new Class80_Sub28_Sub13(this);
			} else if (local17 == 11) {
				local27 = new Class80_Sub28_Sub11(this);
			} else if (local17 == 12) {
				local27 = new Class80_Sub28_Sub10(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method22223(arg0, (byte) 0);
			this.aClass8_52.method232(local27, 1466500107);
		}
	}

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "(Lclient!ald;B)V")
	void method28609(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.aLong377 = arg0.method23273((byte) 111) * -1324060303723328867L;
		this.anInt4546 = arg0.method23182(596855903) * -295557767;
		for (@Pc(17) int local17 = arg0.method23362(-1470262541); local17 != 0; local17 = arg0.method23362(-1173865851)) {
			@Pc(27) Class80_Sub28 local27;
			if (local17 == 3) {
				local27 = new Class80_Sub28_Sub2(this);
			} else if (local17 == 1) {
				local27 = new Class80_Sub28_Sub1(this);
			} else if (local17 == 13) {
				local27 = new Class80_Sub28_Sub12(this);
			} else if (local17 == 4) {
				local27 = new Class80_Sub28_Sub6(this);
			} else if (local17 == 6) {
				local27 = new Class80_Sub28_Sub9(this);
			} else if (local17 == 5) {
				local27 = new Class80_Sub28_Sub7(this);
			} else if (local17 == 2) {
				local27 = new Class80_Sub28_Sub8(this);
			} else if (local17 == 7) {
				local27 = new Class80_Sub28_Sub4(this);
			} else if (local17 == 14) {
				local27 = new Class80_Sub28_Sub5(this);
			} else if (local17 == 8) {
				local27 = new Class80_Sub28_Sub14(this);
			} else if (local17 == 9) {
				local27 = new Class80_Sub28_Sub3(this);
			} else if (local17 == 10) {
				local27 = new Class80_Sub28_Sub13(this);
			} else if (local17 == 11) {
				local27 = new Class80_Sub28_Sub11(this);
			} else if (local17 == 12) {
				local27 = new Class80_Sub28_Sub10(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method22223(arg0, (byte) 0);
			this.aClass8_52.method232(local27, 830821266);
		}
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(Lclient!ald;)V")
	void method28610(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aLong377 = arg0.method23273((byte) -86) * -1324060303723328867L;
		this.anInt4546 = arg0.method23182(482797145) * -295557767;
		for (@Pc(17) int local17 = arg0.method23362(708200478); local17 != 0; local17 = arg0.method23362(88986565)) {
			@Pc(27) Class80_Sub28 local27;
			if (local17 == 3) {
				local27 = new Class80_Sub28_Sub2(this);
			} else if (local17 == 1) {
				local27 = new Class80_Sub28_Sub1(this);
			} else if (local17 == 13) {
				local27 = new Class80_Sub28_Sub12(this);
			} else if (local17 == 4) {
				local27 = new Class80_Sub28_Sub6(this);
			} else if (local17 == 6) {
				local27 = new Class80_Sub28_Sub9(this);
			} else if (local17 == 5) {
				local27 = new Class80_Sub28_Sub7(this);
			} else if (local17 == 2) {
				local27 = new Class80_Sub28_Sub8(this);
			} else if (local17 == 7) {
				local27 = new Class80_Sub28_Sub4(this);
			} else if (local17 == 14) {
				local27 = new Class80_Sub28_Sub5(this);
			} else if (local17 == 8) {
				local27 = new Class80_Sub28_Sub14(this);
			} else if (local17 == 9) {
				local27 = new Class80_Sub28_Sub3(this);
			} else if (local17 == 10) {
				local27 = new Class80_Sub28_Sub13(this);
			} else if (local17 == 11) {
				local27 = new Class80_Sub28_Sub11(this);
			} else if (local17 == 12) {
				local27 = new Class80_Sub28_Sub10(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method22223(arg0, (byte) 0);
			this.aClass8_52.method232(local27, 2107758857);
		}
	}

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "(Lclient!kf;)V")
	public void method28611(@OriginalArg(0) Class378 arg0) {
		if (arg0.aLong374 * 5780165618821360503L != this.aLong377 * -395427936124613707L || arg0.anInt4529 * -411030671 != this.anInt4546 * 519320777) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class80_Sub28 local29 = (Class80_Sub28) this.aClass8_52.method247(129206984); local29 != null; local29 = (Class80_Sub28) this.aClass8_52.method237(-110831125)) {
			local29.method22222(arg0, -1818858234);
		}
		arg0.anInt4529 += 1064908177;
	}

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "(Lclient!ald;)V")
	void method28612(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aLong377 = arg0.method23273((byte) 93) * -1324060303723328867L;
		this.anInt4546 = arg0.method23182(-520324186) * -295557767;
		for (@Pc(17) int local17 = arg0.method23362(719787024); local17 != 0; local17 = arg0.method23362(-1233109487)) {
			@Pc(27) Class80_Sub28 local27;
			if (local17 == 3) {
				local27 = new Class80_Sub28_Sub2(this);
			} else if (local17 == 1) {
				local27 = new Class80_Sub28_Sub1(this);
			} else if (local17 == 13) {
				local27 = new Class80_Sub28_Sub12(this);
			} else if (local17 == 4) {
				local27 = new Class80_Sub28_Sub6(this);
			} else if (local17 == 6) {
				local27 = new Class80_Sub28_Sub9(this);
			} else if (local17 == 5) {
				local27 = new Class80_Sub28_Sub7(this);
			} else if (local17 == 2) {
				local27 = new Class80_Sub28_Sub8(this);
			} else if (local17 == 7) {
				local27 = new Class80_Sub28_Sub4(this);
			} else if (local17 == 14) {
				local27 = new Class80_Sub28_Sub5(this);
			} else if (local17 == 8) {
				local27 = new Class80_Sub28_Sub14(this);
			} else if (local17 == 9) {
				local27 = new Class80_Sub28_Sub3(this);
			} else if (local17 == 10) {
				local27 = new Class80_Sub28_Sub13(this);
			} else if (local17 == 11) {
				local27 = new Class80_Sub28_Sub11(this);
			} else if (local17 == 12) {
				local27 = new Class80_Sub28_Sub10(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method22223(arg0, (byte) 0);
			this.aClass8_52.method232(local27, 1286112950);
		}
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(Lclient!kf;B)V")
	public void method28613(@OriginalArg(0) Class378 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aLong374 * 5780165618821360503L != this.aLong377 * -395427936124613707L || arg0.anInt4529 * -411030671 != this.anInt4546 * 519320777) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class80_Sub28 local29 = (Class80_Sub28) this.aClass8_52.method247(129206984); local29 != null; local29 = (Class80_Sub28) this.aClass8_52.method237(-1774357288)) {
			local29.method22222(arg0, -941729426);
		}
		arg0.anInt4529 += 1064908177;
	}

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "(Lclient!kf;)V")
	public void method28614(@OriginalArg(0) Class378 arg0) {
		if (arg0.aLong374 * 5780165618821360503L != this.aLong377 * -395427936124613707L || arg0.anInt4529 * -411030671 != this.anInt4546 * 519320777) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class80_Sub28 local29 = (Class80_Sub28) this.aClass8_52.method247(129206984); local29 != null; local29 = (Class80_Sub28) this.aClass8_52.method237(-982613828)) {
			local29.method22222(arg0, -771665357);
		}
		arg0.anInt4529 += 1064908177;
	}
}
