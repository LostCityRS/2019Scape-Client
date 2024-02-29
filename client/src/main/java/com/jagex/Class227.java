package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public class Class227 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public final int anInt3647;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public final int anInt3648;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	final int anInt3649;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public final int anInt3650;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIII)V", line = 9)
	Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3647 = arg0 * 1796589443;
		this.anInt3648 = arg1 * 1731932143;
		this.anInt3649 = arg2 * 1373122845;
		this.anInt3650 = arg3 * -1519759029;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)Lclient!dj;", line = 17)
	Class227 method25609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class227(this.anInt3647 * 422903595, arg0, this.anInt3649 * 513415477, this.anInt3650 * 530428003);
	}

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "(I)Lclient!dj;", line = 17)
	Class227 method25610(@OriginalArg(0) int arg0) {
		return new Class227(this.anInt3647 * 422903595, arg0, this.anInt3649 * 513415477, this.anInt3650 * 530428003);
	}

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "(I)Lclient!dj;", line = 17)
	Class227 method25611(@OriginalArg(0) int arg0) {
		return new Class227(this.anInt3647 * 422903595, arg0, this.anInt3649 * 513415477, this.anInt3650 * 530428003);
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!nn;I)V", line = 38)
	public static void method25612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class443 arg6, @OriginalArg(7) int arg7) {
		Class60.method1118(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 987736728);
	}

	@OriginalMember(owner = "client!dj", name = "ads", descriptor = "(Lclient!yf;I)V", line = 10116)
	static final void method25613(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.aClass373Array1[local12].anInt4597 * -2081343383;
	}

	@OriginalMember(owner = "client!dj", name = "bdu", descriptor = "(Lclient!yf;I)V", line = 14767)
	static final void method25614(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(18) Class707 local18 = (Class707) Class107.method18116(Class707.method36744(-455588912), arg0.anIntArray519[arg0.anInt5891 * -1497248091], -1915563430);
		@Pc(31) Class611 local31 = new Class611(arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1]);
		if (local31.anInt5625 * -78984409 == -1) {
			throw new RuntimeException("");
		} else if (Class707.aClass707_1 != local18 && Class707.aClass707_2 != local18 && Class707.aClass707_3 != local18) {
			throw new RuntimeException("");
		} else if (client.aClass175_2 != null) {
			@Pc(65) Class93_Sub22 local65 = Class102.method2588(Class446.aClass446_45, client.aClass175_2.aClass24_2, (byte) 12);
			local65.aClass93_Sub41_Sub2_1.method22573(local18.method36920(), -1591808004);
			local65.aClass93_Sub41_Sub2_1.method22597(local31.anInt5624 * -1994307635, -1895191206);
			local65.aClass93_Sub41_Sub2_1.method22595(local31.anInt5623 * 270611681, (byte) -14);
			client.aClass175_2.method24356(local65, -1630265729);
		}
	}
}
