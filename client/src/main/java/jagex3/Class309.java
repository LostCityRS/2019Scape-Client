package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class309 {

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Ljava/lang/String;")
	public String aString166;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljava/lang/String;")
	public String aString167;

	@OriginalMember(owner = "client!hc", name = "aiq", descriptor = "(Lclient!yf;I)V")
	static void method26921(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class110_Sub13.method8035(local13, 1970125827);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	Class309() {
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(Lclient!hw;I)V")
	void method26917(@OriginalArg(0) Class326 arg0, @OriginalArg(1) int arg1) {
		this.aString167 = arg0.method27400(1039103657);
		this.aString166 = arg0.method27400(1639692763);
	}

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "(Lclient!hw;)V")
	void method26918(@OriginalArg(0) Class326 arg0) {
		this.aString167 = arg0.method27400(1820691836);
		this.aString166 = arg0.method27400(-998331518);
	}

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "(Lclient!hw;)V")
	void method26919(@OriginalArg(0) Class326 arg0) {
		this.aString167 = arg0.method27400(14222853);
		this.aString166 = arg0.method27400(1778506585);
	}

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "(Lclient!hw;)V")
	void method26920(@OriginalArg(0) Class326 arg0) {
		this.aString167 = arg0.method27400(1415797204);
		this.aString166 = arg0.method27400(1735225655);
	}
}
