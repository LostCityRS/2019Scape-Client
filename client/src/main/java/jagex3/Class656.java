package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xe")
public final class Class656 {

	@OriginalMember(owner = "client!xe", name = "e", descriptor = "I")
	public int anInt5971;

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "(I)Z")
	static boolean method32927(@OriginalArg(0) int arg0) {
		if (Class474.aProcess1 == null) {
			return false;
		}
		try {
			Class474.aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "(II)V")
	static void method32928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class173.aClass240_64.method25925(arg0, (byte) 57);
	}

	@OriginalMember(owner = "client!xe", name = "ask", descriptor = "(Lclient!yf;B)V")
	static void method32929(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) 75);
		Class543.method31129(Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 82), false, 1945646779);
		Class106_Sub1.method5148(-1581694735);
	}

	@OriginalMember(owner = "client!xe", name = "anh", descriptor = "(Lclient!yf;I)V")
	static void method32930(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(31) Class472 local31 = Class472.method29710((float) local13, (float) local13, (float) local13);
		if (local31.aFloat325 == -1.0F) {
			local31.aFloat325 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat326 == -1.0F) {
			local31.aFloat326 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat327 == -1.0F) {
			local31.aFloat327 = Float.POSITIVE_INFINITY;
		}
		Class65.aClass123_Sub1_2.method8933(local31, -849002901);
		Class65.aClass123_Sub1_2.method8955((float) local23 / 1000.0F, (byte) 10);
		local31.method29713();
	}

	@OriginalMember(owner = "client!xe", name = "<init>", descriptor = "(I)V")
	public Class656(@OriginalArg(0) int arg0) {
		this.anInt5971 = arg0 * -33749981;
	}
}
