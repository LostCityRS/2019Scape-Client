package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public class Class272 {

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_5;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fq", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Ljava/util/List;")
	List aList9;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "(Lclient!yf;B)V", line = 137)
	static void method26308(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) -13);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.e(local23);
		}
		if (local29 != null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.e * -344415541;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.n * -959530973;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.m * -1121660407;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.k * -576563203;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.f * -2127096581;
			return;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!fq", name = "am", descriptor = "(I)I", line = 490)
	public static int method26309(@OriginalArg(0) int arg0) {
		return Class625.aTwitchWebcamDeviceArray1 == null ? 0 : Class625.aTwitchWebcamDeviceArray1.length;
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!fb;)V", line = 933)
	Class272(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
		this.aList9 = new ArrayList();
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(Lclient!rw;I)V", line = 938)
	void method26310(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "(Lclient!rw;)V", line = 938)
	void method26311(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(Lclient!rw;)V", line = 938)
	void method26312(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "(Lclient!rw;)V", line = 938)
	void method26313(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "(Lclient!rw;)V", line = 938)
	void method26314(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "(Lclient!rw;I)V", line = 942)
	void method26315(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		this.aList9.remove(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "z", descriptor = "()Ljava/util/List;", line = 946)
	List method26316() {
		return this.aList9;
	}

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "(B)Ljava/util/List;", line = 946)
	List method26317(@OriginalArg(0) byte arg0) {
		return this.aList9;
	}

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "(Lclient!rw;I)Z", line = 950)
	boolean method26318(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		return this.aList9.contains(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(Lclient!rw;)Z", line = 950)
	boolean method26319(@OriginalArg(0) Class539 arg0) {
		return this.aList9.contains(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "(Lclient!rw;)Z", line = 950)
	boolean method26320(@OriginalArg(0) Class539 arg0) {
		return this.aList9.contains(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "avo", descriptor = "(Lclient!yf;I)V", line = 13457)
	static final void method26321(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
