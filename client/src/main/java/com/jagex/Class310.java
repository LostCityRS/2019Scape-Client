package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.security.SecureRandom;
import java.util.Iterator;

@OriginalClass("client!he")
public final class Class310 {

	@OriginalMember(owner = "client!he", name = "gj", descriptor = "Lclient!pf;")
	public static Class480 aClass480_93;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[Lclient!hx;")
	Class327[] aClass327Array1;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[Lclient!hx;")
	public Class327[] aClass327Array2;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
	public boolean aBoolean794;

	@OriginalMember(owner = "client!he", name = "jd", descriptor = "(I)V")
	static void method27457(@OriginalArg(0) int arg0) {
		@Pc(2) Iterator local2 = client.aClass24_19.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class80_Sub1_Sub8 local9 = (Class80_Sub1_Sub8) local2.next();
			@Pc(12) Class120_Sub1_Sub1_Sub5 local12 = local9.aClass120_Sub1_Sub1_Sub5_1;
			local12.method24333(1, 1799687941);
			if (local12.method24335(2022050198)) {
				local9.method24395((byte) 2);
				local12.method24352((byte) -121);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "t", descriptor = "(I)Ljava/security/SecureRandom;")
	static SecureRandom method27458(@OriginalArg(0) int arg0) {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!he", name = "ya", descriptor = "(Lclient!yp;I)V")
	static void method27459(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class618.method32296(local13, local23, true, false, (short) 255);
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Z[Lclient!hx;)V")
	Class310(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class327[] arg1) {
		this.aClass327Array2 = arg1;
		this.aBoolean794 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)[Lclient!hx;")
	public Class327[] method27454(@OriginalArg(0) int arg0) {
		if (this.aClass327Array1 == null) {
			@Pc(6) int local6 = this.aClass327Array2.length;
			this.aClass327Array1 = new Class327[local6];
			System.arraycopy(this.aClass327Array2, 0, this.aClass327Array1, 0, this.aClass327Array2.length);
		}
		return this.aClass327Array1;
	}

	@OriginalMember(owner = "client!he", name = "t", descriptor = "(B)[Lclient!hx;")
	public Class327[] method27455(@OriginalArg(0) byte arg0) {
		return this.aClass327Array1 == null ? this.aClass327Array2 : this.aClass327Array1;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)Lclient!hx;")
	public Class327 method27456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass327Array2[0].anInt4087 * -2053489901 >>> 16 != arg0 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass327Array2[arg0 & 0xFFFF];
	}
}
