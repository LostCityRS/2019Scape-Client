package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class385 {

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	static final int anInt4540 = 3;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
	static final int anInt4541 = 2;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
	static final int anInt4542 = 5;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	static final int anInt4543 = 4;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
	static final int anInt4544 = 1;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "J")
	long aLong376;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "J")
	long aLong375 = -1601448189942946873L;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!aag;")
	Class8 aClass8_51 = new Class8();

	@OriginalMember(owner = "client!kq", name = "azf", descriptor = "(Lclient!yp;I)V")
	static void method28601(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub32_1.method16522((byte) -51) ? 1 : 0;
	}

	@OriginalMember(owner = "client!kq", name = "id", descriptor = "(IIIIZB)V")
	public static void method28602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(13) int local13 = arg3 - 334;
		if (local13 < 0) {
			local13 = 0;
		} else if (local13 > 100) {
			local13 = 100;
		}
		@Pc(33) int local33 = local13 * (client.aShort157 - client.aShort156) / 100 + client.aShort156;
		@Pc(43) int local43 = arg3 * local33 * 512 / (arg2 * 334);
		@Pc(73) int local73;
		@Pc(79) int local79;
		@Pc(48) short local48;
		if (local43 < client.aShort154) {
			local48 = client.aShort154;
			local33 = arg2 * local48 * 334 / (arg3 * 512);
			if (local33 > client.aShort155) {
				local33 = client.aShort155;
				local73 = local33 * arg3 * 512 / (local48 * 334);
				local79 = (arg2 - local73) / 2;
				if (arg4) {
					Class279.aClass102_9.method20877();
					Class279.aClass102_9.method20716(arg0, arg1, local79, arg3, -16777216, (byte) 1);
					Class279.aClass102_9.method20716(arg0 + arg2 - local79, arg1, local79, arg3, -16777216, (byte) 100);
				}
				arg0 += local79;
				arg2 -= local79 * 2;
			}
		} else if (local43 > client.aShort153) {
			local48 = client.aShort153;
			local33 = local48 * 334 * arg2 / (arg3 * 512);
			if (local33 < client.aShort160) {
				local33 = client.aShort160;
				local73 = local48 * 334 * arg2 / (local33 * 512);
				local79 = (arg3 - local73) / 2;
				if (arg4) {
					Class279.aClass102_9.method20877();
					Class279.aClass102_9.method20716(arg0, arg1, arg2, local79, -16777216, (byte) 68);
					Class279.aClass102_9.method20716(arg0, arg3 + arg1 - local79, arg2, local79, -16777216, (byte) 69);
				}
				arg1 += local79;
				arg3 -= local79 * 2;
			}
		}
		client.anInt3498 = arg3 * local33 / 334 * -1095333801;
		client.anInt3587 = arg0 * 607862435;
		client.anInt3565 = arg1 * 1466548473;
		client.anInt3439 = (short) arg2 * 1328316319;
		client.anInt3576 = (short) arg3 * -1490842157;
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class385(@OriginalArg(0) Packet arg0) {
		this.method28595(arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "(Lclient!ald;B)V")
	void method28595(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.aLong376 = arg0.g8() * -4092708191415607897L;
		this.aLong375 = arg0.g8() * 1601448189942946873L;
		for (@Pc(17) int local17 = arg0.g1(); local17 != 0; local17 = arg0.g1()) {
			@Pc(27) Class80_Sub26 local27;
			if (local17 == 1) {
				local27 = new Class80_Sub26_Sub2(this);
			} else if (local17 == 4) {
				local27 = new Class80_Sub26_Sub3(this);
			} else if (local17 == 3) {
				local27 = new Class80_Sub26_Sub5(this);
			} else if (local17 == 2) {
				local27 = new Class80_Sub26_Sub1(this);
			} else if (local17 == 5) {
				local27 = new Class80_Sub26_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method22253(arg0, (byte) -9);
			this.aClass8_51.method232(local27, 1449276293);
		}
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(Lclient!akv;B)V")
	public void method28596(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) byte arg1) {
		if (this.aLong376 * 6744417959150844439L != arg0.aLong338 * 3209506792906532031L || arg0.aLong126 * 6307167296013287083L != this.aLong375 * 4957158626873659913L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class80_Sub26 local30 = (Class80_Sub26) this.aClass8_51.method247(129206984); local30 != null; local30 = (Class80_Sub26) this.aClass8_51.method237(-2085319409)) {
			local30.method22257(arg0, -1292477179);
		}
		arg0.aLong126 += 175499899195935747L;
	}

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "(Lclient!akv;)V")
	public void method28597(@OriginalArg(0) Class80_Sub32 arg0) {
		if (this.aLong376 * 6744417959150844439L != arg0.aLong338 * 3209506792906532031L || arg0.aLong126 * 6307167296013287083L != this.aLong375 * 4957158626873659913L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class80_Sub26 local30 = (Class80_Sub26) this.aClass8_51.method247(129206984); local30 != null; local30 = (Class80_Sub26) this.aClass8_51.method237(-2025463095)) {
			local30.method22257(arg0, -2120564471);
		}
		arg0.aLong126 += 175499899195935747L;
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(Lclient!ald;)V")
	void method28598(@OriginalArg(0) Packet arg0) {
		this.aLong376 = arg0.g8() * -4092708191415607897L;
		this.aLong375 = arg0.g8() * 1601448189942946873L;
		for (@Pc(17) int local17 = arg0.g1(); local17 != 0; local17 = arg0.g1()) {
			@Pc(27) Class80_Sub26 local27;
			if (local17 == 1) {
				local27 = new Class80_Sub26_Sub2(this);
			} else if (local17 == 4) {
				local27 = new Class80_Sub26_Sub3(this);
			} else if (local17 == 3) {
				local27 = new Class80_Sub26_Sub5(this);
			} else if (local17 == 2) {
				local27 = new Class80_Sub26_Sub1(this);
			} else if (local17 == 5) {
				local27 = new Class80_Sub26_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method22253(arg0, (byte) -9);
			this.aClass8_51.method232(local27, 1118091225);
		}
	}

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "(Lclient!akv;)V")
	public void method28599(@OriginalArg(0) Class80_Sub32 arg0) {
		if (this.aLong376 * 6744417959150844439L != arg0.aLong338 * 3209506792906532031L || arg0.aLong126 * 6307167296013287083L != this.aLong375 * 4957158626873659913L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class80_Sub26 local30 = (Class80_Sub26) this.aClass8_51.method247(129206984); local30 != null; local30 = (Class80_Sub26) this.aClass8_51.method237(-622972869)) {
			local30.method22257(arg0, -1057657504);
		}
		arg0.aLong126 += 175499899195935747L;
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(Lclient!akv;)V")
	public void method28600(@OriginalArg(0) Class80_Sub32 arg0) {
		if (this.aLong376 * 6744417959150844439L != arg0.aLong338 * 3209506792906532031L || arg0.aLong126 * 6307167296013287083L != this.aLong375 * 4957158626873659913L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class80_Sub26 local30 = (Class80_Sub26) this.aClass8_51.method247(129206984); local30 != null; local30 = (Class80_Sub26) this.aClass8_51.method237(-2142520617)) {
			local30.method22257(arg0, -933998615);
		}
		arg0.aLong126 += 175499899195935747L;
	}
}
