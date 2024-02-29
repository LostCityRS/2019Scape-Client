package com.jagex;

import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class Class413 {

	@OriginalMember(owner = "client!mc", name = "su", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!mc", name = "ay", descriptor = "J")
	static long aLong272;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_8 = new Class413();

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_3 = new Class413();

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_4 = new Class413();

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_5 = new Class413();

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_6 = new Class413();

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_7 = new Class413();

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!mc;")
	public static final Class413 aClass413_2 = new Class413();

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 32)
	Class413() {
	}

	@OriginalMember(owner = "client!mc", name = "xc", descriptor = "(Lclient!yf;I)V", line = 9192)
	static final void method28669(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!mc", name = "beh", descriptor = "(Lclient!yf;B)V", line = 15073)
	static final void method28670(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
