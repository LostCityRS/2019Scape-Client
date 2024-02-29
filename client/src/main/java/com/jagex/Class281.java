package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public class Class281 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/lang/String;")
	public String aString154;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	public int anInt3894;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Z")
	public boolean aBoolean672;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt3895;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Ljava/lang/String;")
	public String aString155;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Z")
	public boolean aBoolean673;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "Ljava/lang/String;")
	public String aString156;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public int anInt3897;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "(Lclient!yf;I)V", line = 37)
	static void method26460(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class347 local16 = (Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -822969034);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anIntArray419 == null ? 0 : local16.anIntArray419.length;
	}

	@OriginalMember(owner = "client!g", name = "m", descriptor = "(Ljava/lang/Iterable;Lclient!alw;I)V", line = 46)
	public static void method26461(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class384.method28154(arg0, 1759950388);
		arg1.method22456(local3, (byte) -58);
		if (local3 == 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local3; local13++) {
			arg1.aByteArray58[arg1.anInt3070 * 212851357 + local13] = 0;
		}
		@Pc(31) Iterator local31 = arg0.iterator();
		while (local31.hasNext()) {
			@Pc(38) Interface75 local38 = (Interface75) local31.next();
			@Pc(41) int local41 = local38.method36920();
			@Pc(45) int local45 = local41 / 8;
			arg1.aByteArray58[arg1.anInt3070 * 212851357 + local45] = (byte) (arg1.aByteArray58[arg1.anInt3070 * 212851357 + local45] | 0x1 << (local41 & 0x7));
		}
		arg1.anInt3070 += local3 * -1445626955;
	}

	@OriginalMember(owner = "client!g", name = "w", descriptor = "(II)Z", line = 56)
	public static boolean method26462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= Class615.aClass615_12.anInt5628 * 948246811 && arg0 <= Class615.aClass615_17.anInt5628 * 948246811;
	}

	@OriginalMember(owner = "client!g", name = "is", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6535)
	static final void method26463(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg2.anIntArray519[arg2.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1];
		if (local13 == -1 && local23 == -1) {
			arg0.aClass312_9 = null;
		} else {
			arg0.aClass312_9 = Class124_Sub2.method9308(local13, local23, (byte) -15);
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 12524)
	Class281() {
	}
}
