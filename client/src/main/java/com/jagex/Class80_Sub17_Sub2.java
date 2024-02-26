package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asz")
public final class Class80_Sub17_Sub2 extends Class80_Sub17 {

	@OriginalMember(owner = "client!asz", name = "ak", descriptor = "I")
	static final int anInt3165 = 525;

	@OriginalMember(owner = "client!asz", name = "n", descriptor = "I")
	static final int anInt3166 = 170;

	@OriginalMember(owner = "client!asz", name = "w", descriptor = "I")
	static final int anInt3167 = 162;

	@OriginalMember(owner = "client!asz", name = "ad", descriptor = "I")
	static final int anInt3168 = 674;

	@OriginalMember(owner = "client!asz", name = "d", descriptor = "I")
	static final int anInt3169 = 166;

	@OriginalMember(owner = "client!asz", name = "h", descriptor = "I")
	static final int anInt3170 = 165;

	@OriginalMember(owner = "client!asz", name = "aq", descriptor = "I")
	static final int anInt3171 = 513;

	@OriginalMember(owner = "client!asz", name = "p", descriptor = "I")
	static final int anInt3173 = 168;

	@OriginalMember(owner = "client!asz", name = "s", descriptor = "I")
	static final int anInt3174 = 160;

	@OriginalMember(owner = "client!asz", name = "r", descriptor = "I")
	static final int anInt3175 = 163;

	@OriginalMember(owner = "client!asz", name = "c", descriptor = "I")
	static final int anInt3176 = 171;

	@OriginalMember(owner = "client!asz", name = "ax", descriptor = "I")
	static final int anInt3178 = 173;

	@OriginalMember(owner = "client!asz", name = "ay", descriptor = "I")
	static final int anInt3179 = 174;

	@OriginalMember(owner = "client!asz", name = "ai", descriptor = "I")
	static final int anInt3180 = 512;

	@OriginalMember(owner = "client!asz", name = "b", descriptor = "I")
	static final int anInt3181 = 172;

	@OriginalMember(owner = "client!asz", name = "ao", descriptor = "I")
	static final int anInt3182 = 514;

	@OriginalMember(owner = "client!asz", name = "aj", descriptor = "I")
	static final int anInt3183 = 515;

	@OriginalMember(owner = "client!asz", name = "ac", descriptor = "I")
	static final int anInt3184 = 516;

	@OriginalMember(owner = "client!asz", name = "ag", descriptor = "I")
	static final int anInt3185 = 517;

	@OriginalMember(owner = "client!asz", name = "ab", descriptor = "I")
	static final int anInt3186 = 518;

	@OriginalMember(owner = "client!asz", name = "al", descriptor = "I")
	static final int anInt3187 = 519;

	@OriginalMember(owner = "client!asz", name = "ah", descriptor = "I")
	static final int anInt3188 = 520;

	@OriginalMember(owner = "client!asz", name = "af", descriptor = "I")
	static final int anInt3189 = 521;

	@OriginalMember(owner = "client!asz", name = "am", descriptor = "I")
	static final int anInt3190 = 522;

	@OriginalMember(owner = "client!asz", name = "q", descriptor = "I")
	static final int anInt3191 = 164;

	@OriginalMember(owner = "client!asz", name = "at", descriptor = "I")
	static final int anInt3192 = 672;

	@OriginalMember(owner = "client!asz", name = "v", descriptor = "I")
	static final int anInt3193 = 169;

	@OriginalMember(owner = "client!asz", name = "z", descriptor = "I")
	static final int anInt3194 = 167;

	@OriginalMember(owner = "client!asz", name = "k", descriptor = "I")
	static final int anInt3196 = 161;

	@OriginalMember(owner = "client!asz", name = "av", descriptor = "[Lclient!asz;")
	static Class80_Sub17_Sub2[] aClass80_Sub17_Sub2Array1 = new Class80_Sub17_Sub2[0];

	@OriginalMember(owner = "client!asz", name = "ae", descriptor = "I")
	int anInt3172;

	@OriginalMember(owner = "client!asz", name = "au", descriptor = "I")
	int anInt3177;

	@OriginalMember(owner = "client!asz", name = "ap", descriptor = "I")
	int anInt3195;

	@OriginalMember(owner = "client!asz", name = "ar", descriptor = "J")
	long aLong299;

	@OriginalMember(owner = "client!asz", name = "x", descriptor = "I")
	int anInt3197;

	@OriginalMember(owner = "client!asz", name = "al", descriptor = "(IIII)Lclient!asz;")
	public static Class80_Sub17_Sub2 method23473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class80_Sub17_Sub2[] local2 = aClass80_Sub17_Sub2Array1;
		synchronized (aClass80_Sub17_Sub2Array1) {
			@Pc(11) Class80_Sub17_Sub2 local11;
			if (Class167.anInt2472 * -1070370625 == 0) {
				local11 = new Class80_Sub17_Sub2();
			} else {
				local11 = aClass80_Sub17_Sub2Array1[(Class167.anInt2472 -= 54001471) * -1070370625];
			}
			local11.anInt3177 = arg0 * 480125599;
			local11.anInt3197 = arg1 * 1484841599;
			local11.anInt3172 = arg2 * 1590406265;
			local11.anInt3195 = arg3 * 676657145;
			local11.aLong299 = Class303.method27111((byte) 117) * -115045695046593249L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!asz", name = "ag", descriptor = "(I)V")
	public static void method23474(@OriginalArg(0) int arg0) {
		Class49.anInt187 = arg0 * 113490415;
		aClass80_Sub17_Sub2Array1 = new Class80_Sub17_Sub2[arg0];
		Class167.anInt2472 = 0;
	}

	@OriginalMember(owner = "client!asz", name = "ab", descriptor = "(IIII)Lclient!asz;")
	public static Class80_Sub17_Sub2 method23476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class80_Sub17_Sub2[] local2 = aClass80_Sub17_Sub2Array1;
		synchronized (aClass80_Sub17_Sub2Array1) {
			@Pc(11) Class80_Sub17_Sub2 local11;
			if (Class167.anInt2472 * -1070370625 == 0) {
				local11 = new Class80_Sub17_Sub2();
			} else {
				local11 = aClass80_Sub17_Sub2Array1[(Class167.anInt2472 -= 54001471) * -1070370625];
			}
			local11.anInt3177 = arg0 * 480125599;
			local11.anInt3197 = arg1 * 1484841599;
			local11.anInt3172 = arg2 * 1590406265;
			local11.anInt3195 = arg3 * 676657145;
			local11.aLong299 = Class303.method27111((byte) 96) * -115045695046593249L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!asz", name = "ac", descriptor = "(I)V")
	public static void method23477(@OriginalArg(0) int arg0) {
		Class49.anInt187 = arg0 * 113490415;
		aClass80_Sub17_Sub2Array1 = new Class80_Sub17_Sub2[arg0];
		Class167.anInt2472 = 0;
	}

	@OriginalMember(owner = "client!asz", name = "<init>", descriptor = "()V")
	Class80_Sub17_Sub2() {
	}

	@OriginalMember(owner = "client!asz", name = "f", descriptor = "(I)I")
	@Override
	public int method23451(@OriginalArg(0) int arg0) {
		return this.anInt3177 * -863209121;
	}

	@OriginalMember(owner = "client!asz", name = "i", descriptor = "(I)V")
	@Override
	public void method23453(@OriginalArg(0) int arg0) {
		@Pc(2) Class80_Sub17_Sub2[] local2 = aClass80_Sub17_Sub2Array1;
		synchronized (aClass80_Sub17_Sub2Array1) {
			if (Class167.anInt2472 * -1070370625 < Class49.anInt187 * -709847793 - 1) {
				aClass80_Sub17_Sub2Array1[(Class167.anInt2472 += 54001471) * -1070370625 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!asz", name = "ai", descriptor = "(I)I")
	public int method23471(@OriginalArg(0) int arg0) {
		return this.anInt3195 * -1262085559;
	}

	@OriginalMember(owner = "client!asz", name = "aq", descriptor = "(I)I")
	public int method23472(@OriginalArg(0) int arg0) {
		return this.anInt3172 * 556989897;
	}

	@OriginalMember(owner = "client!asz", name = "m", descriptor = "()I")
	@Override
	public int method23458() {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!asz", name = "u", descriptor = "(B)I")
	@Override
	public int method23455(@OriginalArg(0) byte arg0) {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!asz", name = "t", descriptor = "(B)I")
	@Override
	public int method23452(@OriginalArg(0) byte arg0) {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!asz", name = "a", descriptor = "()I")
	@Override
	public int method23460() {
		return this.anInt3197 * -679944833;
	}

	@OriginalMember(owner = "client!asz", name = "l", descriptor = "(I)J")
	@Override
	public long method23456(@OriginalArg(0) int arg0) {
		return this.aLong299 * 8395664242131723999L;
	}

	@OriginalMember(owner = "client!asz", name = "p", descriptor = "()J")
	@Override
	public long method23464() {
		return this.aLong299 * 8395664242131723999L;
	}

	@OriginalMember(owner = "client!asz", name = "y", descriptor = "()I")
	@Override
	public int method23466() {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!asz", name = "o", descriptor = "()I")
	@Override
	public int method23461() {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!asz", name = "j", descriptor = "()I")
	@Override
	public int method23457() {
		return this.anInt3177 * -863209121;
	}

	@OriginalMember(owner = "client!asz", name = "s", descriptor = "()J")
	@Override
	public long method23459() {
		return this.aLong299 * 8395664242131723999L;
	}

	@OriginalMember(owner = "client!asz", name = "z", descriptor = "()J")
	@Override
	public long method23463() {
		return this.aLong299 * 8395664242131723999L;
	}

	@OriginalMember(owner = "client!asz", name = "ao", descriptor = "(I)Z")
	public boolean method23475(@OriginalArg(0) int arg0) {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@OriginalMember(owner = "client!asz", name = "v", descriptor = "()V")
	@Override
	public void method23465() {
		@Pc(2) Class80_Sub17_Sub2[] local2 = aClass80_Sub17_Sub2Array1;
		synchronized (aClass80_Sub17_Sub2Array1) {
			if (Class167.anInt2472 * -1070370625 < Class49.anInt187 * -709847793 - 1) {
				aClass80_Sub17_Sub2Array1[(Class167.anInt2472 += 54001471) * -1070370625 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!asz", name = "e", descriptor = "(I)I")
	@Override
	public int method23454(@OriginalArg(0) int arg0) {
		return this.anInt3197 * -679944833;
	}

	@OriginalMember(owner = "client!asz", name = "aj", descriptor = "(Ljava/awt/Point;I)V")
	public void method23478(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1) {
		this.anInt3177 -= arg0.x * 480125599;
		this.anInt3197 -= arg0.y * 1484841599;
	}

	@OriginalMember(owner = "client!asz", name = "x", descriptor = "()J")
	@Override
	public long method23462() {
		return this.aLong299 * 8395664242131723999L;
	}

	@OriginalMember(owner = "client!asz", name = "ah", descriptor = "()I")
	public int method23479() {
		return this.anInt3195 * -1262085559;
	}

	@OriginalMember(owner = "client!asz", name = "af", descriptor = "()I")
	public int method23480() {
		return this.anInt3195 * -1262085559;
	}

	@OriginalMember(owner = "client!asz", name = "am", descriptor = "()I")
	public int method23481() {
		return this.anInt3195 * -1262085559;
	}

	@OriginalMember(owner = "client!asz", name = "ak", descriptor = "()I")
	public int method23482() {
		return this.anInt3172 * 556989897;
	}

	@OriginalMember(owner = "client!asz", name = "at", descriptor = "()Z")
	public boolean method23483() {
		switch(this.anInt3172 * 556989897) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@OriginalMember(owner = "client!asz", name = "ad", descriptor = "(Ljava/awt/Point;)V")
	public void method23484(@OriginalArg(0) Point arg0) {
		this.anInt3177 -= arg0.x * 480125599;
		this.anInt3197 -= arg0.y * 1484841599;
	}

	@OriginalMember(owner = "client!asz", name = "av", descriptor = "(Ljava/awt/Point;)V")
	public void method23485(@OriginalArg(0) Point arg0) {
		this.anInt3177 -= arg0.x * 480125599;
		this.anInt3197 -= arg0.y * 1484841599;
	}
}
