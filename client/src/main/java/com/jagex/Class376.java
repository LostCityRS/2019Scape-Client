package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class376 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Ljava/lang/String;")
	final String aString201;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Ljava/lang/String;")
	final String aString202;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Ljava/lang/String;")
	final String aString203;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "(I)V")
	static void method28224(@OriginalArg(0) int arg0) {
		if (Class685.anIntArray524 != null) {
			return;
		}
		Class685.anIntArray524 = new int[65536];
		@Pc(8) double local8 = 0.7D;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 512; local12++) {
			@Pc(27) float local27 = ((float) (local12 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(36) float local36 = (float) (local12 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
				@Pc(46) float local46 = (float) local38 / 128.0F;
				@Pc(48) float local48 = 0.0F;
				@Pc(50) float local50 = 0.0F;
				@Pc(52) float local52 = 0.0F;
				@Pc(56) float local56 = local27 / 60.0F;
				@Pc(59) int local59 = (int) local56;
				@Pc(63) int local63 = local59 % 6;
				@Pc(68) float local68 = local56 - (float) local59;
				@Pc(74) float local74 = (1.0F - local36) * local46;
				@Pc(82) float local82 = (1.0F - local68 * local36) * local46;
				@Pc(92) float local92 = (1.0F - (1.0F - local68) * local36) * local46;
				if (local63 == 0) {
					local48 = local46;
					local50 = local92;
					local52 = local74;
				} else if (local63 == 1) {
					local48 = local82;
					local50 = local46;
					local52 = local74;
				} else if (local63 == 2) {
					local48 = local74;
					local50 = local46;
					local52 = local92;
				} else if (local63 == 3) {
					local48 = local74;
					local50 = local82;
					local52 = local46;
				} else if (local63 == 4) {
					local48 = local92;
					local50 = local74;
					local52 = local46;
				} else if (local63 == 5) {
					local48 = local46;
					local50 = local74;
					local52 = local82;
				}
				local48 = (float) Math.pow((double) local48, local8);
				local50 = (float) Math.pow((double) local50, local8);
				local52 = (float) Math.pow((double) local52, local8);
				@Pc(173) int local173 = (int) (local48 * 256.0F);
				@Pc(178) int local178 = (int) (local50 * 256.0F);
				@Pc(183) int local183 = (int) (local52 * 256.0F);
				@Pc(195) int local195 = (local173 << 16) + -16777216 + (local178 << 8) + local183;
				Class685.anIntArray524[local10++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "kh", descriptor = "(Lclient!yf;I)V")
	static void method28225(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 384562811);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class28.method602(local16, local22, arg0, (byte) -81);
	}

	@OriginalMember(owner = "client!ke", name = "amx", descriptor = "(Lclient!yf;I)V")
	static void method28226(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloat256 >> 3;
	}

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "(I)Lclient!rn;")
	public static Interface57 method28227(@OriginalArg(0) int arg0) {
		if (Class525.anInterface57_1 == null) {
			throw new IllegalStateException("");
		}
		return Class525.anInterface57_1;
	}

	@OriginalMember(owner = "client!ke", name = "mg", descriptor = "(Ljava/lang/String;B)V")
	static void method28228(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		client.aString143 = arg0;
		if (Class343.method27611((byte) 95) == Class555.aClass555_3) {
			return;
		}
		try {
			@Pc(11) String local11 = Class32_Sub10.anApplet2.getParameter(Class461.aClass461_16.aString220);
			@Pc(16) String local16 = Class32_Sub10.anApplet2.getParameter(Class461.aClass461_26.aString220);
			@Pc(31) String local31 = local11 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Class53.method14955(Class305.method26889(1748071629) + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Class70.method1231(Class32_Sub10.anApplet2, "document.cookie=\"" + local31 + "\"", (byte) -79);
		} catch (@Pc(78) Throwable local78) {
		}
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	Class376(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString201 = arg0;
		this.aString202 = arg1;
		this.aString203 = arg2;
	}
}
