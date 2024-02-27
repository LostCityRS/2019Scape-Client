package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class360 {

	@OriginalMember(owner = "client!jg", name = "aw", descriptor = "I")
	static int anInt4731;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	int anInt4730;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "[S")
	short[] aShortArray122;

	@OriginalMember(owner = "client!jg", name = "ga", descriptor = "(Lclient!yf;I)V")
	static void method27980(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 603863381);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class138_Sub4.method11516(local16, local22, arg0, -1497248091);
	}

	@OriginalMember(owner = "client!jg", name = "aur", descriptor = "(Lclient!yf;B)V")
	static void method27981(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class574.method31528(-1925044391);
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(S)V")
	public static void method27982(@OriginalArg(0) short arg0) {
		Class172.aClass100_40 = null;
		Class172.anInt3175 = -1899481709;
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class360(@OriginalArg(0) int arg0) {
		this.anInt4730 = arg0 * 1367898611;
		this.aShortArray122 = new short[0x1 << arg0];
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
	public void method27974(@OriginalArg(0) byte arg0) {
		Class294.method26689(this.aShortArray122, -291489944);
	}

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "(Lclient!jp;B)I")
	public int method27975(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4730 * 1447085883; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method28086(this.aShortArray122, local1, 291964485);
		}
		return local1 - (0x1 << this.anInt4730 * 1447085883);
	}

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "(Lclient!jp;)I")
	public int method27976(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4730 * 1447085883; local5++) {
			@Pc(18) int local18 = arg0.method28086(this.aShortArray122, local1, 291964485);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(Lclient!jp;)I")
	public int method27977(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4730 * 1447085883; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method28086(this.aShortArray122, local1, 291964485);
		}
		return local1 - (0x1 << this.anInt4730 * 1447085883);
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(Lclient!jp;I)I")
	public int method27978(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4730 * 1447085883; local5++) {
			@Pc(18) int local18 = arg0.method28086(this.aShortArray122, local1, 291964485);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "(Lclient!jp;)I")
	public int method27979(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4730 * 1447085883; local5++) {
			@Pc(18) int local18 = arg0.method28086(this.aShortArray122, local1, 291964485);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}
}
