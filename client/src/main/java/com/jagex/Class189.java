package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public class Class189 {

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	final int anInt3345;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "S")
	final short aShort141;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "S")
	final short aShort142;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "S")
	final short aShort140;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "B")
	final byte aByte105;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "B")
	final byte aByte104;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Z")
	final boolean aBoolean575;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
	final int anInt3344;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 13)
	Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt3345 = arg0 * -996214915;
		this.aShort141 = (short) arg4;
		this.aShort142 = (short) arg5;
		this.aShort140 = (short) arg6;
		this.aByte105 = (byte) arg7;
		this.aByte104 = (byte) arg8;
		this.aBoolean575 = arg9;
		this.anInt3344 = arg10 * -1186223369;
	}

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "([BIII)Ljava/lang/String;", line = 62)
	static String method24582(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(Class708.aCharArray5[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(Class708.aCharArray5[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(Class708.aCharArray5[(local37 & 0xF) << 2 | local64 >>> 6]).append(Class708.aCharArray5[local64 & 0x3F]);
				} else {
					local3.append(Class708.aCharArray5[(local37 & 0xF) << 2]).append("=");
				}
			} else {
				local3.append(Class708.aCharArray5[(local16 & 0x3) << 4]).append("==");
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!bl", name = "ko", descriptor = "(III)V", line = 11669)
	static final void method24583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class383.method28142(arg0, null, 1588031466)) {
			Class550.method31034(Class166_Sub1.aClass320Array1[arg0].aClass312Array3, arg1, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!bl", name = "azm", descriptor = "(Lclient!yf;B)V", line = 14201)
	static final void method24584(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
