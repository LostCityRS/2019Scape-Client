package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class227 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public final int anInt3688;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public final int anInt3689;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	final int anInt3690;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public final int anInt3691;

	@OriginalMember(owner = "client!dj", name = "ads", descriptor = "(Lclient!yf;I)V")
	static void method25705(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.aClass373Array1[local12].anInt4758 * -2081343383;
	}

	@OriginalMember(owner = "client!dj", name = "bdu", descriptor = "(Lclient!yf;I)V")
	static void method25706(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(18) Class707 local18 = (Class707) Class107.method18131(Class707.method36926(-455588912), arg0.anIntArray521[arg0.anInt6052 * -1497248091], -1915563430);
		@Pc(31) Class611 local31 = new Class611(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1]);
		if (local31.anInt5786 * -78984409 == -1) {
			throw new RuntimeException("");
		} else if (Class707.aClass707_1 != local18 && Class707.aClass707_2 != local18 && Class707.aClass707_3 != local18) {
			throw new RuntimeException("");
		} else if (client.aClass175_2 != null) {
			@Pc(65) Class93_Sub22 local65 = Class102.method2592(Class446.aClass446_45, client.aClass175_2.aClass24_2, (byte) 12);
			local65.aClass93_Sub41_Sub2_1.method22458(local18.method37101(), -1591808004);
			local65.aClass93_Sub41_Sub2_1.method22470(local31.anInt5785 * -1994307635, -1895191206);
			local65.aClass93_Sub41_Sub2_1.method22602(local31.anInt5784 * 270611681, (byte) -14);
			client.aClass175_2.method24363(local65, -1630265729);
		}
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!nn;I)V")
	public static void method25707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class443 arg6, @OriginalArg(7) int arg7) {
		Class60.method1123(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 987736728);
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIII)V")
	Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3688 = arg0 * 1796589443;
		this.anInt3689 = arg1 * 1731932143;
		this.anInt3690 = arg2 * 1373122845;
		this.anInt3691 = arg3 * -1519759029;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)Lclient!dj;")
	Class227 method25702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class227(this.anInt3688 * 422903595, arg0, this.anInt3690 * 513415477, this.anInt3691 * 530428003);
	}

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "(I)Lclient!dj;")
	Class227 method25703(@OriginalArg(0) int arg0) {
		return new Class227(this.anInt3688 * 422903595, arg0, this.anInt3690 * 513415477, this.anInt3691 * 530428003);
	}

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "(I)Lclient!dj;")
	Class227 method25704(@OriginalArg(0) int arg0) {
		return new Class227(this.anInt3688 * 422903595, arg0, this.anInt3690 * 513415477, this.anInt3691 * 530428003);
	}
}
