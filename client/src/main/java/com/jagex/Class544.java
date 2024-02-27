package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class544 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sa", name = "this$1", descriptor = "Lclient!sj;")
	final Class552 aClass552_1;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[S")
	short[] aShortArray130;

	@OriginalMember(owner = "client!sa", name = "aue", descriptor = "(Lclient!yf;I)V")
	static void method31138(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16235(1931997619);
	}

	@OriginalMember(owner = "client!sa", name = "bdp", descriptor = "(Lclient!yf;I)V")
	static void method31139(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class527.aString231.startsWith("linux") ? 1 : 0;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)[Lclient!uw;")
	static Class604[] method31140(@OriginalArg(0) int arg0) {
		return new Class604[] { Class604.aClass604_4, Class604.aClass604_3 };
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!sj;)V")
	Class544(@OriginalArg(0) Class552 arg0) {
		this.aClass552_1 = arg0;
		this.aShortArray130 = new short[768];
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	void method31130(@OriginalArg(0) int arg0) {
		Class294.method26689(this.aShortArray130, 746816514);
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
	void method31131() {
		Class294.method26689(this.aShortArray130, 366752208);
	}

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "(Lclient!jp;BI)B")
	byte method31132(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28086(this.aShortArray130, local1 + (local7 + 1 << 8), 291964485);
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28086(this.aShortArray130, local1, 291964485);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "()V")
	void method31133() {
		Class294.method26689(this.aShortArray130, 1765870969);
	}

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "(Lclient!jp;I)B")
	byte method31134(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method28086(this.aShortArray130, local1, 291964485);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "(Lclient!jp;)B")
	byte method31135(@OriginalArg(0) Class365 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method28086(this.aShortArray130, local1, 291964485);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "(Lclient!jp;B)B")
	byte method31136(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28086(this.aShortArray130, local1 + (local7 + 1 << 8), 291964485);
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28086(this.aShortArray130, local1, 291964485);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "(Lclient!jp;B)B")
	byte method31137(@OriginalArg(0) Class365 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28086(this.aShortArray130, local1 + (local7 + 1 << 8), 291964485);
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28086(this.aShortArray130, local1, 291964485);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}
}
