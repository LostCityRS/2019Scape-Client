package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class486 implements Interface75 {

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "Lclient!pl;")
	static final Class486 UNCOMPRESSED = new Class486("UNCOMPRESSED", 0);

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!pl;")
	static final Class486 BZIP2 = new Class486("BZIP2", 1);

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!pl;")
	static final Class486 GZIP = new Class486("GZIP", 2);

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!pl;")
	static final Class486 LZMA = new Class486("LZMA", 3);

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Ljava/lang/String;")
	final String aString211;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	final int anInt5004;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "(II)V")
	public static void method30058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class327.aClass243_75.method26247(arg0, (byte) 111);
		Class327.aClass243_78.method26247(arg0, (byte) 126);
		Class327.aClass243_76.method26247(arg0, (byte) 61);
		Class327.aClass243_77.method26247(arg0, (byte) 124);
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "()[Lclient!pl;")
	static Class486[] method30059() {
		return new Class486[] { BZIP2, GZIP, LZMA, UNCOMPRESSED };
	}

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "(I)[Lclient!pl;")
	static Class486[] method30060(@OriginalArg(0) int arg0) {
		return new Class486[] { BZIP2, GZIP, LZMA, UNCOMPRESSED };
	}

	@OriginalMember(owner = "client!pl", name = "vi", descriptor = "(Lclient!yp;I)V")
	static void method30061(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class279.method26849(arg0, (byte) -6);
	}

	@OriginalMember(owner = "client!pl", name = "ash", descriptor = "(Lclient!yp;B)V")
	static void method30062(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 16);
		Class719.method37291(928044211);
		Class522.method30640(-1269518977);
		RuntimeException_Sub2.method23509(1975782671);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!pl", name = "bci", descriptor = "(Lclient!yp;I)V")
	static void method30063(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < Class626.aClass141_Sub1Array2.length; local5++) {
			if (Class626.aClass141_Sub1Array2[local5] != null && Class626.aClass141_Sub1Array2[local5].method10918(-1724794701)) {
				local1 += Class626.aClass141_Sub1Array2[local5].method10922((byte) 39);
				local3 += Class626.aClass141_Sub1Array2[local5].method10940(1392592282);
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local1 == 0 ? 0 : local3 * 100 / local1;
	}

	@OriginalMember(owner = "client!pl", name = "ack", descriptor = "(Lclient!yp;I)V")
	static void method30064(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.aBooleanArray30[local12] ? 1 : 0;
	}

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "(I)I")
	public static int method30065(@OriginalArg(0) int arg0) {
		if (Class622.anInt5483 * -1525318091 == 3) {
			return -1;
		} else if (Class622.anInt5483 * -1525318091 == 0) {
			if (Class622.aStringArray32 == null) {
				if (Class531.aString220.startsWith("mac ")) {
					if (Class531.aString218.startsWith("ppc")) {
						Class622.anInt5483 = 1209871447;
						return -1;
					}
					Class622.aStringArray32 = new String[3];
					Class622.aStringArray32[0] = "sdk-mac-dynamic";
					Class622.aStringArray32[1] = "twitchsdk";
					Class622.aStringArray32[2] = "twitchtv";
					Class622.aBooleanArray33 = new boolean[3];
					Class622.aBooleanArray33[0] = false;
					Class622.aBooleanArray33[1] = false;
					Class622.aBooleanArray33[2] = true;
				} else if (Class531.aString220.startsWith("win")) {
					Class622.aStringArray32 = new String[6];
					Class622.aStringArray32[0] = "avutil-ttv-51";
					Class622.aStringArray32[1] = "libmp3lame-ttv";
					Class622.aStringArray32[2] = "swresample-ttv-0";
					Class622.aStringArray32[5] = "twitchtv";
					if (Class531.aString218.startsWith("amd64") || Class531.aString218.startsWith("x86_64")) {
						Class622.aStringArray32[3] = "libmfxsw64";
						Class622.aStringArray32[4] = "twitchsdk_64_release";
					} else if (Class531.aString218.startsWith("i386") || Class531.aString218.startsWith("i486") || Class531.aString218.startsWith("i586") || Class531.aString218.startsWith("x86")) {
						Class622.aStringArray32[3] = "libmfxsw32";
						Class622.aStringArray32[4] = "twitchsdk_32_release";
					} else {
						Class622.anInt5483 = 1209871447;
						return -1;
					}
					Class622.aBooleanArray33 = new boolean[6];
					Class622.aBooleanArray33[0] = true;
					Class622.aBooleanArray33[1] = true;
					Class622.aBooleanArray33[2] = true;
					Class622.aBooleanArray33[3] = false;
					Class622.aBooleanArray33[4] = true;
					Class622.aBooleanArray33[5] = true;
				} else {
					Class622.anInt5483 = 1209871447;
					return -1;
				}
			}
			Class622.anInt5483 = -1028365283;
			return 0;
		} else {
			return Class622.anInt5482 * -168012841;
		}
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class486(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString211 = arg0;
		this.anInt5004 = arg1 * -249528771;
	}

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5004 * -212629227;
	}

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5004 * -212629227;
	}

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5004 * -212629227;
	}
}
