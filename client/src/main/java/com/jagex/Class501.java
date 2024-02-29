package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public class Class501 {

	@OriginalMember(owner = "client!qb", name = "ho", descriptor = "Lclient!aot;")
	public static Class32_Sub18 aClass32_Sub18_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qb", name = "this$0", descriptor = "Lclient!rq;")
	final Class535 this$0;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!alw;")
	Class93_Sub41 aClass93_Sub41_16;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
	boolean aBoolean785;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	int anInt5199;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	int anInt5198;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(ZI)V", line = 174)
	public static void method30168(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3463 * 1819062465 == 4 || client.anInt3463 * 1819062465 == 3) {
			return;
		}
		if (!arg0) {
			if (Class249.aClass110Array1 != null) {
				@Pc(16) Class110[] local16 = Class249.aClass110Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class110 local26 = local16[local18];
					local26.method20140(-2003464695);
				}
			}
			if (Class249.anInt3842 * -1535788867 != -1) {
				Class274.aClass258_1.method26119(Class249.anInt3842 * -1535788867, 255, (byte) 0);
			}
		}
		client.anInt3463 = 1556053252;
		Class36.aClass93_Sub41_1 = null;
		client.aBoolean613 = false;
		if (Class249.anInt3843 * -213302133 > 0) {
			Class165.method15320(Class155.aClass155_65, Class249.anInt3843 * -213302133, -1, -532799195);
		}
		Class287.method26542(-100950526);
		@Pc(68) Class93_Sub22 local68 = Class102.method2588(Class446.aClass446_42, client.aClass175_2.aClass24_2, (byte) 72);
		local68.aClass93_Sub41_Sub2_1.method22394(arg0 ? 1 : 0, (byte) -67);
		client.aClass175_2.method24356(local68, -1619193338);
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!rq;Lclient!alw;Z)V", line = 750)
	Class501(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) boolean arg2) {
		this.this$0 = arg0;
		this.aClass93_Sub41_16 = arg1;
		this.aBoolean785 = arg2;
		this.anInt5199 = 177775551;
		this.anInt5198 = 1541616075;
	}

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "()V", line = 758)
	void method30169() {
		if (this.aClass93_Sub41_16 != null && !this.aBoolean785) {
			this.aClass93_Sub41_16.method22392((byte) 1);
		}
		this.anInt5199 = 177775551;
		this.anInt5198 = 1541616075;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V", line = 758)
	void method30170(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub41_16 != null && !this.aBoolean785) {
			this.aClass93_Sub41_16.method22392((byte) 1);
		}
		this.anInt5199 = 177775551;
		this.anInt5198 = 1541616075;
	}

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "()V", line = 758)
	void method30171() {
		if (this.aClass93_Sub41_16 != null && !this.aBoolean785) {
			this.aClass93_Sub41_16.method22392((byte) 1);
		}
		this.anInt5199 = 177775551;
		this.anInt5198 = 1541616075;
	}

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "()V", line = 758)
	void method30172() {
		if (this.aClass93_Sub41_16 != null && !this.aBoolean785) {
			this.aClass93_Sub41_16.method22392((byte) 1);
		}
		this.anInt5199 = 177775551;
		this.anInt5198 = 1541616075;
	}

	@OriginalMember(owner = "client!qb", name = "aod", descriptor = "(Lclient!yf;B)V", line = 12457)
	static final void method30173(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(37) Class349 local37 = Class102.method2587(local13, -1316453588);
		@Pc(40) float local40 = (float) local23;
		if (local37 == Class349.aClass349_4 || Class349.aClass349_5 == local37 || Class349.aClass349_6 == local37) {
			local40 = Class464.method29281(local23);
		}
		@Pc(65) Class93_Sub1_Sub17_Sub1 local65 = new Class93_Sub1_Sub17_Sub1(Class65.aClass123_Sub1_2.method9088((byte) 24), local37, local40, (float) local33 / 1000.0F);
		Class65.aClass123_Sub1_2.method8994(local65, 2026758986);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local65.anInt3208 * 1923037877;
	}
}
