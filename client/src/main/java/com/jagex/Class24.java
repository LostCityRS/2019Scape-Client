package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!aax")
public final class Class24 implements Iterable {

	@OriginalMember(owner = "client!aax", name = "e", descriptor = "J")
	long aLong1;

	@OriginalMember(owner = "client!aax", name = "u", descriptor = "Lclient!tn;")
	Class80 aClass80_7;

	@OriginalMember(owner = "client!aax", name = "l", descriptor = "Lclient!tn;")
	Class80 aClass80_8;

	@OriginalMember(owner = "client!aax", name = "g", descriptor = "I")
	int anInt77 = 0;

	@OriginalMember(owner = "client!aax", name = "t", descriptor = "I")
	int anInt76;

	@OriginalMember(owner = "client!aax", name = "f", descriptor = "[Lclient!tn;")
	Class80[] aClass80Array1;

	@OriginalMember(owner = "client!aax", name = "e", descriptor = "(I)Z")
	static boolean method583(@OriginalArg(0) int arg0) {
		return Class407.method28948(Class630.aClass641_1.aClass615_2, (byte) 85);
	}

	@OriginalMember(owner = "client!aax", name = "aq", descriptor = "(IIB)V")
	public static void method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22078(1242123831);
	}

	@OriginalMember(owner = "client!aax", name = "ux", descriptor = "(Lclient!yp;I)V")
	static void method585(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class80_Sub40 local18 = (Class80_Sub40) client.aClass24_20.method560((long) local12);
		if (local18 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!aax", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		this.anInt76 = arg0 * 873901809;
		this.aClass80Array1 = new Class80[arg0];
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(27) Class80 local27 = this.aClass80Array1[local15] = new Class80();
			local27.aClass80_227 = local27;
			local27.aClass80_228 = local27;
		}
	}

	@OriginalMember(owner = "client!aax", name = "f", descriptor = "(B)Lclient!tn;")
	public Class80 method558(@OriginalArg(0) byte arg0) {
		if (this.aClass80_7 == null) {
			return null;
		}
		@Pc(22) Class80 local22 = this.aClass80Array1[(int) (this.aLong1 * -5295993688055988851L & (long) (this.anInt76 * -1339522543 - 1))];
		while (this.aClass80_7 != local22) {
			if (this.aLong1 * -5295993688055988851L == this.aClass80_7.aLong338 * 3209506792906532031L) {
				@Pc(40) Class80 local40 = this.aClass80_7;
				this.aClass80_7 = this.aClass80_7.aClass80_227;
				return local40;
			}
			this.aClass80_7 = this.aClass80_7.aClass80_227;
		}
		this.aClass80_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!aax", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method559() {
		return new Class17(this);
	}

	@OriginalMember(owner = "client!aax", name = "t", descriptor = "(J)Lclient!tn;")
	public Class80 method560(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0 * 1751828174009158981L;
		@Pc(18) Class80 local18 = this.aClass80Array1[(int) (arg0 & (long) (this.anInt76 * -1339522543 - 1))];
		for (this.aClass80_7 = local18.aClass80_227; this.aClass80_7 != local18; this.aClass80_7 = this.aClass80_7.aClass80_227) {
			if (this.aClass80_7.aLong338 * 3209506792906532031L == arg0) {
				@Pc(37) Class80 local37 = this.aClass80_7;
				this.aClass80_7 = this.aClass80_7.aClass80_227;
				return local37;
			}
		}
		this.aClass80_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!aax", name = "e", descriptor = "([Lclient!tn;B)I")
	public int method561(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "n", descriptor = "()Lclient!tn;")
	public Class80 method562() {
		this.anInt77 = 0;
		return this.method566((byte) 7);
	}

	@OriginalMember(owner = "client!aax", name = "l", descriptor = "(Lclient!tn;J)V")
	public void method563(@OriginalArg(0) Class80 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 110);
		}
		@Pc(20) Class80 local20 = this.aClass80Array1[(int) (arg1 & (long) (this.anInt76 * -1339522543 - 1))];
		arg0.aClass80_228 = local20.aClass80_228;
		arg0.aClass80_227 = local20;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
		arg0.aLong338 = arg1 * 6850079459805481791L;
	}

	@OriginalMember(owner = "client!aax", name = "g", descriptor = "(I)V")
	public void method564(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt76 * -1339522543; local1++) {
			@Pc(12) Class80 local12 = this.aClass80Array1[local1];
			while (true) {
				@Pc(15) Class80 local15 = local12.aClass80_227;
				if (local15 == local12) {
					break;
				}
				local15.method24395((byte) 36);
			}
		}
		this.aClass80_7 = null;
		this.aClass80_8 = null;
	}

	@OriginalMember(owner = "client!aax", name = "r", descriptor = "([Lclient!tn;)I")
	public int method565(@OriginalArg(0) Class80[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "m", descriptor = "(B)Lclient!tn;")
	public Class80 method566(@OriginalArg(0) byte arg0) {
		@Pc(19) Class80 local19;
		if (this.anInt77 * -682740115 > 0 && this.aClass80Array1[this.anInt77 * -682740115 - 1] != this.aClass80_8) {
			local19 = this.aClass80_8;
			this.aClass80_8 = local19.aClass80_227;
			return local19;
		}
		do {
			if (this.anInt77 * -682740115 >= this.anInt76 * -1339522543) {
				return null;
			}
			local19 = this.aClass80Array1[(this.anInt77 += 1438532453) * -682740115 - 1].aClass80_227;
		} while (local19 == this.aClass80Array1[this.anInt77 * -682740115 - 1]);
		this.aClass80_8 = local19.aClass80_227;
		return local19;
	}

	@OriginalMember(owner = "client!aax", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class17(this);
	}

	@OriginalMember(owner = "client!aax", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method567() {
		return new Class17(this);
	}

	@OriginalMember(owner = "client!aax", name = "v", descriptor = "(Lclient!tn;J)V")
	public void method568(@OriginalArg(0) Class80 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 82);
		}
		@Pc(20) Class80 local20 = this.aClass80Array1[(int) (arg1 & (long) (this.anInt76 * -1339522543 - 1))];
		arg0.aClass80_228 = local20.aClass80_228;
		arg0.aClass80_227 = local20;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
		arg0.aLong338 = arg1 * 6850079459805481791L;
	}

	@OriginalMember(owner = "client!aax", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method569() {
		return new Class17(this);
	}

	@OriginalMember(owner = "client!aax", name = "s", descriptor = "(J)Lclient!tn;")
	public Class80 method570(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0 * 1751828174009158981L;
		@Pc(18) Class80 local18 = this.aClass80Array1[(int) (arg0 & (long) (this.anInt76 * -1339522543 - 1))];
		for (this.aClass80_7 = local18.aClass80_227; this.aClass80_7 != local18; this.aClass80_7 = this.aClass80_7.aClass80_227) {
			if (this.aClass80_7.aLong338 * 3209506792906532031L == arg0) {
				@Pc(37) Class80 local37 = this.aClass80_7;
				this.aClass80_7 = this.aClass80_7.aClass80_227;
				return local37;
			}
		}
		this.aClass80_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!aax", name = "k", descriptor = "(J)Lclient!tn;")
	public Class80 method571(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0 * 1751828174009158981L;
		@Pc(18) Class80 local18 = this.aClass80Array1[(int) (arg0 & (long) (this.anInt76 * -1339522543 - 1))];
		for (this.aClass80_7 = local18.aClass80_227; this.aClass80_7 != local18; this.aClass80_7 = this.aClass80_7.aClass80_227) {
			if (this.aClass80_7.aLong338 * 3209506792906532031L == arg0) {
				@Pc(37) Class80 local37 = this.aClass80_7;
				this.aClass80_7 = this.aClass80_7.aClass80_227;
				return local37;
			}
		}
		this.aClass80_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!aax", name = "u", descriptor = "(I)I")
	public int method572(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "w", descriptor = "([Lclient!tn;)I")
	public int method573(@OriginalArg(0) Class80[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "p", descriptor = "(Lclient!tn;J)V")
	public void method574(@OriginalArg(0) Class80 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 3);
		}
		@Pc(20) Class80 local20 = this.aClass80Array1[(int) (arg1 & (long) (this.anInt76 * -1339522543 - 1))];
		arg0.aClass80_228 = local20.aClass80_228;
		arg0.aClass80_227 = local20;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
		arg0.aLong338 = arg1 * 6850079459805481791L;
	}

	@OriginalMember(owner = "client!aax", name = "q", descriptor = "()I")
	public int method575() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "h", descriptor = "()I")
	public int method576() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "d", descriptor = "()I")
	public int method577() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "z", descriptor = "(Lclient!tn;J)V")
	public void method578(@OriginalArg(0) Class80 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 96);
		}
		@Pc(20) Class80 local20 = this.aClass80Array1[(int) (arg1 & (long) (this.anInt76 * -1339522543 - 1))];
		arg0.aClass80_228 = local20.aClass80_228;
		arg0.aClass80_227 = local20;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
		arg0.aLong338 = arg1 * 6850079459805481791L;
	}

	@OriginalMember(owner = "client!aax", name = "x", descriptor = "([Lclient!tn;)I")
	public int method579(@OriginalArg(0) Class80[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt76 * -1339522543; local3++) {
			@Pc(14) Class80 local14 = this.aClass80Array1[local3];
			for (@Pc(17) Class80 local17 = local14.aClass80_227; local17 != local14; local17 = local17.aClass80_227) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aax", name = "i", descriptor = "(B)Lclient!tn;")
	public Class80 method580(@OriginalArg(0) byte arg0) {
		this.anInt77 = 0;
		return this.method566((byte) 7);
	}

	@OriginalMember(owner = "client!aax", name = "y", descriptor = "()V")
	public void method581() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt76 * -1339522543; local1++) {
			@Pc(12) Class80 local12 = this.aClass80Array1[local1];
			while (true) {
				@Pc(15) Class80 local15 = local12.aClass80_227;
				if (local15 == local12) {
					break;
				}
				local15.method24395((byte) 67);
			}
		}
		this.aClass80_7 = null;
		this.aClass80_8 = null;
	}

	@OriginalMember(owner = "client!aax", name = "c", descriptor = "()Lclient!tn;")
	public Class80 method582() {
		@Pc(19) Class80 local19;
		if (this.anInt77 * -682740115 > 0 && this.aClass80Array1[this.anInt77 * -682740115 - 1] != this.aClass80_8) {
			local19 = this.aClass80_8;
			this.aClass80_8 = local19.aClass80_227;
			return local19;
		}
		do {
			if (this.anInt77 * -682740115 >= this.anInt76 * -1339522543) {
				return null;
			}
			local19 = this.aClass80Array1[(this.anInt77 += 1438532453) * -682740115 - 1].aClass80_227;
		} while (local19 == this.aClass80Array1[this.anInt77 * -682740115 - 1]);
		this.aClass80_8 = local19.aClass80_227;
		return local19;
	}
}
