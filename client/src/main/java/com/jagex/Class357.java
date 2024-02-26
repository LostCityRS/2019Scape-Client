package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class357 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	static final int anInt4481 = 11;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	static final int anInt4482 = 5;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	static final int anInt4483 = 2048;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	static final int anInt4486 = -16777216;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	int anInt4484;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	int anInt4485;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream1;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "([S)V")
	public static void method28118(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "([S)V")
	public static void method28121(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!jc", name = "ap", descriptor = "(Lclient!arz;I)[I")
	static int[] method28122(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int[] local1 = null;
		if (Class165_Sub24.method16315(arg0.anInt3079 * 1479399259, -610557457)) {
			local1 = ((Class43) Class25.aClass41_Sub9_1.method18054((int) (arg0.aLong248 * 7780148905970551279L), 446768297)).anIntArray15;
		} else if (arg0.anInt3077 * 1402276867 != -1) {
			local1 = ((Class43) Class25.aClass41_Sub9_1.method18054(arg0.anInt3077 * 1402276867, -460629669)).anIntArray15;
		} else if (Class103_Sub17.method19211(arg0.anInt3079 * 1479399259, 460106407)) {
			@Pc(54) Class80_Sub19 local54 = (Class80_Sub19) client.aClass24_18.method560((long) (arg0.aLong248 * 7780148905970551279L));
			if (local54 != null) {
				@Pc(60) Class120_Sub1_Sub1_Sub1_Sub1 local60 = (Class120_Sub1_Sub1_Sub1_Sub1) local54.anObject5;
				@Pc(63) Class335 local63 = local60.aClass335_1;
				if (local63.anIntArray416 != null) {
					local63 = local63.method27836(Class672.aClass134_1, Class672.aClass134_1, -1603197706);
				}
				if (local63 != null) {
					local1 = local63.anIntArray417;
				}
			}
		} else if (Class88.method1790(arg0.anInt3079 * 1479399259, 826625210)) {
			@Pc(103) Class625 local103 = (Class625) client.aClass539_1.method30905(1716683667).method18054((int) (arg0.aLong248 * 7780148905970551279L >>> 32 & 0x7FFFFFFFL), -659989866);
			if (local103.anIntArray503 != null) {
				local103 = local103.method32456(Class672.aClass134_1, Class672.aClass134_1, 15242618);
			}
			if (local103 != null) {
				local1 = local103.anIntArray506;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "(B)V")
	public static void method28123(@OriginalArg(0) byte arg0) {
		@Pc(2) Class243 local2 = Class672.aClass243_95;
		synchronized (Class672.aClass243_95) {
			Class672.aClass243_95.method26259((byte) 3);
		}
		local2 = Class672.aClass243_94;
		synchronized (Class672.aClass243_94) {
			Class672.aClass243_94.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!jc", name = "kh", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method28124(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4108 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -714998373;
		arg0.anInt4107 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -2046427885;
	}

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "(I)I")
	public int method28103(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4485 = (this.anInt4485 * 1278276965 >>> 1) * 111359085;
			@Pc(27) int local27 = this.anInt4484 * 1033296407 - this.anInt4485 * 1278276965 >>> 31;
			this.anInt4484 -= (this.anInt4485 * 1278276965 & local27 - 1) * 667549095;
			local1 = local1 << 1 | 1 - local27;
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "(Ljava/io/InputStream;I)V")
	public void method28104(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	public void method28105(@OriginalArg(0) int arg0) {
		this.anInputStream1 = null;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public void method28106(@OriginalArg(0) int arg0) throws IOException {
		this.anInt4484 = 0;
		this.anInt4485 = -111359085;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
		}
	}

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "(IB)I")
	public int method28107(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4485 = (this.anInt4485 * 1278276965 >>> 1) * 111359085;
			@Pc(27) int local27 = this.anInt4484 * 1033296407 - this.anInt4485 * 1278276965 >>> 31;
			this.anInt4484 -= (this.anInt4485 * 1278276965 & local27 - 1) * 667549095;
			local1 = local1 << 1 | 1 - local27;
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "(I)I")
	public int method28108(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4485 = (this.anInt4485 * 1278276965 >>> 1) * 111359085;
			@Pc(27) int local27 = this.anInt4484 * 1033296407 - this.anInt4485 * 1278276965 >>> 31;
			this.anInt4484 -= (this.anInt4485 * 1278276965 & local27 - 1) * 667549095;
			local1 = local1 << 1 | 1 - local27;
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "(I)I")
	public int method28109(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4485 = (this.anInt4485 * 1278276965 >>> 1) * 111359085;
			@Pc(27) int local27 = this.anInt4484 * 1033296407 - this.anInt4485 * 1278276965 >>> 31;
			this.anInt4484 -= (this.anInt4485 * 1278276965 & local27 - 1) * 667549095;
			local1 = local1 << 1 | 1 - local27;
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(Ljava/io/InputStream;)V")
	public void method28110(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "(Ljava/io/InputStream;)V")
	public void method28111(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(Ljava/io/InputStream;)V")
	public void method28112(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/io/InputStream;)V")
	public void method28113(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "([SI)I")
	public int method28114(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4485 * 1278276965 >>> 11) * local3;
		if ((this.anInt4484 * 1033296407 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4485 = local12 * 111359085;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
			return 0;
		}
		this.anInt4485 -= local12 * 111359085;
		this.anInt4484 -= local12 * 667549095;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
			this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
			this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)I")
	public int method28115(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4485 = (this.anInt4485 * 1278276965 >>> 1) * 111359085;
			@Pc(27) int local27 = this.anInt4484 * 1033296407 - this.anInt4485 * 1278276965 >>> 31;
			this.anInt4484 -= (this.anInt4485 * 1278276965 & local27 - 1) * 667549095;
			local1 = local1 << 1 | 1 - local27;
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "([SII)I")
	public int method28116(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4485 * 1278276965 >>> 11) * local3;
		if ((this.anInt4484 * 1033296407 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4485 = local12 * 111359085;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
			return 0;
		}
		this.anInt4485 -= local12 * 111359085;
		this.anInt4484 -= local12 * 667549095;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
			this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
			this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "()V")
	public void method28117() {
		this.anInputStream1 = null;
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "([SI)I")
	public int method28119(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4485 * 1278276965 >>> 11) * local3;
		if ((this.anInt4484 * 1033296407 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4485 = local12 * 111359085;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
				this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
				this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
			}
			return 0;
		}
		this.anInt4485 -= local12 * 111359085;
		this.anInt4484 -= local12 * 667549095;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4485 * 1278276965 & 0xFF000000) == 0) {
			this.anInt4484 = (this.anInt4484 * 1033296407 << 8 | this.anInputStream1.read()) * 667549095;
			this.anInt4485 = (this.anInt4485 * 1278276965 << 8) * 111359085;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(Ljava/io/InputStream;)V")
	public void method28120(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}
}
