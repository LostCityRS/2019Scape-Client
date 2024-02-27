package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amr")
public final class Class166_Sub18 extends Class166 {

	@OriginalMember(owner = "client!amr", name = "w", descriptor = "I")
	static final int anInt2184 = 4;

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "I")
	static final int anInt2185 = 0;

	@OriginalMember(owner = "client!amr", name = "p", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void method15753(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709(-1662128038)) {
			return;
		}
		client.aClass175_1.method24367((byte) 90);
		Class358.method27959((byte) 0);
		Class411.aString209 = arg0;
		Class411.aString210 = arg1;
		Class411.aString208 = arg2;
		Class411.aBoolean760 = arg3;
		Class481.method29937(17, 1823202236);
	}

	@OriginalMember(owner = "client!amr", name = "dy", descriptor = "(I)V")
	static void method15754(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		if (Class159_Sub1.aClass93_Sub1_Sub20_2 != null) {
			local1 = Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3168 * 937363209;
		}
		Class47.method957((byte) -40);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				Class159_Sub1.aClass106ArrayArray1[local13][local18] = null;
				Class159_Sub1.aClass5ArrayArray1[local13][local18] = null;
			}
		}
		Class159_Sub1.aClass93_Sub1_Sub20_2 = null;
		if (local1 != -1) {
			Class267.method26341(local1, -1, -1, false, 1928895096);
		}
	}

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lclient!abl;")
	public static Class38 method15755(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(14) File local14 = new File(Class564.aFile4, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class38(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class366.anInt4745 * -1839644543 == 33) {
			local29 = "_rc";
		} else if (Class366.anInt4745 * -1839644543 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class485.aString225, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class38(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class38(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub18(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amr", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amr", name = "o", descriptor = "(I)V")
	public void method15746(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -44) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amr", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amr", name = "s", descriptor = "(B)I")
	public int method15747(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amr", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amr", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amr", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amr", name = "q", descriptor = "()V")
	public void method15748() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -106) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amr", name = "y", descriptor = "()V")
	public void method15749() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 20) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amr", name = "x", descriptor = "()I")
	public int method15750() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "b", descriptor = "()I")
	public int method15751() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "h", descriptor = "()I")
	public int method15752() {
		return this.anInt2379 * 960141055;
	}
}
