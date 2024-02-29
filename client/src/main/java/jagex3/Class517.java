package jagex3;

import java.security.SecureRandom;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class517 {

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!qu;")
	static final Class517 aClass517_4 = new Class517(2);

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "Lclient!qu;")
	static final Class517 aClass517_2 = new Class517(4);

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "Lclient!qu;")
	static final Class517 aClass517_3 = new Class517(5);

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!qu;")
	static final Class517 aClass517_5 = new Class517(6);

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Lclient!qu;")
	static final Class517 aClass517_1 = new Class517(3);

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "Lclient!qu;")
	static final Class517 aClass517_6 = new Class517(1);

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Lclient!qu;")
	static final Class517 aClass517_7 = new Class517(0);

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
	final int anInt5373;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)Ljava/security/SecureRandom;")
	static SecureRandom method30472(@OriginalArg(0) int arg0) {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!qu", name = "bed", descriptor = "(Lclient!yf;B)V")
	static void method30473(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 463840436;
	}

	@OriginalMember(owner = "client!qu", name = "ok", descriptor = "(Lclient!yf;I)V")
	static void method30474(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 318450780);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class362.method28023(local16, local22, arg0, 909037457);
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(I)V")
	public Class517(@OriginalArg(0) int arg0) {
		this.anInt5373 = arg0 * -580598989;
	}
}
