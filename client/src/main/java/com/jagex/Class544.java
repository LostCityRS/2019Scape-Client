package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public class Class544 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sa", name = "this$1", descriptor = "Lclient!sj;")
	final Class552 this$1;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[S")
	short[] aShortArray130;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)[Lclient!uw;", line = 67)
	static Class604[] method30949(@OriginalArg(0) int arg0) {
		return new Class604[] { Class604.aClass604_4, Class604.aClass604_3 };
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!sj;)V", line = 231)
	Class544(@OriginalArg(0) Class552 arg0) {
		this.this$1 = arg0;
		this.aShortArray130 = new short[768];
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V", line = 234)
	void method30950(@OriginalArg(0) int arg0) {
		Class294.method26597(this.aShortArray130, 746816514);
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "()V", line = 234)
	void method30951() {
		Class294.method26597(this.aShortArray130, 366752208);
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "()V", line = 234)
	void method30952() {
		Class294.method26597(this.aShortArray130, 1765870969);
	}

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "(Lclient!jp;I)B", line = 238)
	byte method30953(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method27912(this.aShortArray130, local1, 291964485);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "(Lclient!jp;)B", line = 238)
	byte method30954(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method27912(this.aShortArray130, local1, 291964485);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "(Lclient!jp;BI)B", line = 246)
	byte method30955(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method27912(this.aShortArray130, local1 + (local7 + 1 << 8), 291964485);
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method27912(this.aShortArray130, local1, 291964485);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "(Lclient!jp;B)B", line = 246)
	byte method30956(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method27912(this.aShortArray130, local1 + (local7 + 1 << 8), 291964485);
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method27912(this.aShortArray130, local1, 291964485);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "(Lclient!jp;B)B", line = 246)
	byte method30957(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method27912(this.aShortArray130, local1 + (local7 + 1 << 8), 291964485);
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method27912(this.aShortArray130, local1, 291964485);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "aue", descriptor = "(Lclient!yf;I)V", line = 13353)
	static final void method30958(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16226(1931997619);
	}

	@OriginalMember(owner = "client!sa", name = "bdp", descriptor = "(Lclient!yf;I)V", line = 14738)
	static final void method30959(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class527.aString222.startsWith("linux") ? 1 : 0;
	}
}
