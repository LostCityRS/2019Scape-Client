package jagex3;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akw")
public class Class93_Sub33 extends Class93 {

	@OriginalMember(owner = "client!akw", name = "f", descriptor = "Ljava/lang/String;")
	String aString120;

	@OriginalMember(owner = "client!akw", name = "k", descriptor = "I")
	int anInt3226;

	@OriginalMember(owner = "client!akw", name = "asp", descriptor = "(Lclient!yf;I)V")
	static void method23658(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) 24);
		Class106_Sub1.method5148(1993240271);
	}

	@OriginalMember(owner = "client!akw", name = "ars", descriptor = "(Lclient!yf;I)V")
	static void method23659(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, local12, (byte) 21);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, local12, (byte) 76);
		Class51.aClass93_Sub36_1.aClass166_Sub15_1.method15684(1876080314);
		Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15684(1835432474);
		Class262.method26266(1013204858);
		Class106_Sub1.method5148(604055877);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!akw", name = "w", descriptor = "(Lclient!yf;B)V")
	static void method23660(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1], -610357348)).anInt4235 * 1554294991;
	}

	@OriginalMember(owner = "client!akw", name = "amq", descriptor = "(Lclient!yf;I)V")
	static void method23661(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) String local1 = "";
		if (Class413.aClipboard1 != null) {
			@Pc(8) Transferable local8 = Class413.aClipboard1.getContents(null);
			if (local8 != null) {
				try {
					local1 = (String) local8.getTransferData(DataFlavor.stringFlavor);
					if (local1 == null) {
						local1 = "";
					}
				} catch (@Pc(21) Exception local21) {
				}
			}
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!akw", name = "<init>", descriptor = "()V")
	Class93_Sub33() {
	}
}
