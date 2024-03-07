package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public class Class252 implements Interface75 {

	@OriginalMember(owner = "client!ev", name = "jc", descriptor = "I")
	static int zoneUpdateLevel;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "Lclient!ev;")
	static final Class252 aClass252_4 = new Class252(2, 1);

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "Lclient!ev;")
	static final Class252 aClass252_7 = new Class252(4, 2);

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "Lclient!ev;")
	static final Class252 aClass252_1 = new Class252(1, 3);

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Lclient!ev;")
	static final Class252 aClass252_3 = new Class252(6, 4);

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Lclient!ev;")
	static final Class252 aClass252_5 = new Class252(3, 5);

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "Lclient!ev;")
	static final Class252 aClass252_2 = new Class252(5, 6);

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Lclient!ev;")
	static final Class252 aClass252_6 = new Class252(0, 7);

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
	final int anInt3846;

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
	final int anInt3847;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)[Lclient!ky;", line = 12)
	public static Class392[] method25976(@OriginalArg(0) int arg0) {
		return new Class392[] { Class392.aClass392_13, Class392.aClass392_12, Class392.aClass392_11 };
	}

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "()[Lclient!ev;", line = 19)
	static Class252[] method25977() {
		return new Class252[] { aClass252_3, aClass252_7, aClass252_5, aClass252_2, aClass252_6, aClass252_4, aClass252_1 };
	}

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "()[Lclient!ev;", line = 19)
	static Class252[] method25978() {
		return new Class252[] { aClass252_3, aClass252_7, aClass252_5, aClass252_2, aClass252_6, aClass252_4, aClass252_1 };
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II)V", line = 22)
	Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3846 = arg0 * 2031152005;
		this.anInt3847 = arg1 * -488654493;
	}

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "()I", line = 28)
	@Override
	public int getId() {
		return this.anInt3847 * -315649973;
	}

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "()I", line = 28)
	@Override
	public int method36919() {
		return this.anInt3847 * -315649973;
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V", line = 36)
	public static void method25979(@OriginalArg(0) int arg0) {
		if (!Class50.aBoolean27) {
			return;
		}
		if (Class50.anInt195 * -1020006083 < Class607.anInt5560 * 1855382415) {
			Class50.anInt195 = Class607.anInt5560 * 746527931;
		}
		while (true) {
			while (Class50.anInt195 * -1020006083 < Class361.anInt4571 * 977343673) {
				@Pc(27) Class154_Sub1 local27 = Class367.method27959(Class50.anInt195 * -1020006083, (byte) 94);
				if (local27 != null && local27.anInt1655 * 1280583823 == -1) {
					if (Class50.aClass678_1 == null) {
						Class50.aClass678_1 = client.aClass698_1.method36684(local27.aString46, (byte) 1);
					}
					@Pc(54) int local54 = Class50.aClass678_1.anInt5886 * 1528915565;
					if (local54 == -1) {
						return;
					}
					local27.anInt1655 = local54 * 1499985519;
					Class50.anInt195 += 247033365;
					Class50.aClass678_1 = null;
				} else {
					Class50.anInt195 += 247033365;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ev", name = "ik", descriptor = "(Lclient!yf;I)V", line = 6613)
	static final void method25980(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!ev", name = "wk", descriptor = "(Lclient!yf;I)V", line = 8945)
	static final void method25981(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(45) short local45 = 256;
		Class274.aClass258_1.method26098(Class275.aClass275_9, local13, local23, local43, Class280.aClass280_7.method26450(-219534880), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local45, local33, 1555618476);
	}

	@OriginalMember(owner = "client!ev", name = "amc", descriptor = "(Lclient!yf;I)V", line = 12084)
	static final void method25982(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
