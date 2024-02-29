package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public class Class360 {

	@OriginalMember(owner = "client!jg", name = "aw", descriptor = "I")
	static int anInt4570;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	int anInt4569;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "[S")
	short[] aShortArray122;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V", line = 7)
	public Class360(@OriginalArg(0) int arg0) {
		this.anInt4569 = arg0 * 1367898611;
		this.aShortArray122 = new short[0x1 << arg0];
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V", line = 13)
	public void method27793(@OriginalArg(0) byte arg0) {
		Class294.method26597(this.aShortArray122, -291489944);
	}

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "(Lclient!jp;B)I", line = 17)
	public int method27794(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4569 * 1447085883; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method27912(this.aShortArray122, local1, 291964485);
		}
		return local1 - (0x1 << this.anInt4569 * 1447085883);
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(Lclient!jp;)I", line = 17)
	public int method27795(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4569 * 1447085883; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method27912(this.aShortArray122, local1, 291964485);
		}
		return local1 - (0x1 << this.anInt4569 * 1447085883);
	}

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "(Lclient!jp;)I", line = 23)
	public int method27796(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4569 * 1447085883; local5++) {
			@Pc(18) int local18 = arg0.method27912(this.aShortArray122, local1, 291964485);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(Lclient!jp;I)I", line = 23)
	public int method27797(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4569 * 1447085883; local5++) {
			@Pc(18) int local18 = arg0.method27912(this.aShortArray122, local1, 291964485);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "(Lclient!jp;)I", line = 23)
	public int method27798(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4569 * 1447085883; local5++) {
			@Pc(18) int local18 = arg0.method27912(this.aShortArray122, local1, 291964485);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(S)V", line = 80)
	public static void method27799(@OriginalArg(0) short arg0) {
		Class172.aClass100_40 = null;
		Class172.anInt3175 = -1899481709;
	}

	@OriginalMember(owner = "client!jg", name = "ga", descriptor = "(Lclient!yf;I)V", line = 6092)
	static final void method27800(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 603863381);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class138_Sub4.method11517(local16, local22, arg0, -1497248091);
	}

	@OriginalMember(owner = "client!jg", name = "aur", descriptor = "(Lclient!yf;B)V", line = 13357)
	static final void method27801(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class574.method31347(-1925044391);
	}
}
