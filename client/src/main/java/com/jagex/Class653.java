package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!x")
public final class Class653 {

	@OriginalMember(owner = "client!x", name = "t", descriptor = "I")
	static final int anInt5662 = 7;

	@OriginalMember(owner = "client!x", name = "f", descriptor = "I")
	static final int anInt5663 = 127;

	@OriginalMember(owner = "client!x", name = "l", descriptor = "(Lclient!di;IILclient!hx;I)V")
	static void method33139(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class388.method28633(false, true, -1932698062);
				@Pc(31) int local31 = Class325.anIntArray400[local23];
				Class210.method25804(false, true, -1331760319);
				arg0.method20722(arg1 + (arg3.anInt4103 * 1892149809 * local5 >> 7), (arg3.anInt4104 * 1990157877 * (7 - local1) >> 3) + arg2, (arg3.anInt4103 * 1892149809 >> 7) + 1, (arg3.anInt4104 * 1990157877 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "e", descriptor = "(Lclient!di;IILclient!hx;I)V")
	static void method33140(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class388.method28633(false, true, -1398352097);
				@Pc(31) int local31 = Class325.anIntArray400[local23];
				Class210.method25804(false, true, -1331760319);
				arg0.method20722(arg1 + (arg3.anInt4103 * 1892149809 * local5 >> 7), (arg3.anInt4104 * 1990157877 * (7 - local1) >> 3) + arg2, (arg3.anInt4103 * 1892149809 >> 7) + 1, (arg3.anInt4104 * 1990157877 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "u", descriptor = "(Lclient!di;IILclient!hx;I)V")
	static void method33141(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class388.method28633(false, true, -1029633436);
				@Pc(31) int local31 = Class325.anIntArray400[local23];
				Class210.method25804(false, true, -1331760319);
				arg0.method20722(arg1 + (arg3.anInt4103 * 1892149809 * local5 >> 7), (arg3.anInt4104 * 1990157877 * (7 - local1) >> 3) + arg2, (arg3.anInt4103 * 1892149809 >> 7) + 1, (arg3.anInt4104 * 1990157877 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "ay", descriptor = "(Lclient!yp;I)V")
	static void method33142(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = Class362.method28158(-1295627366);
		if (local2 >= 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class506.aTwitchEventLiveStreams1.viewerCounts[local2];
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class506.aTwitchEventLiveStreams1.channelUrls[local2];
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class506.aTwitchEventLiveStreams1.previewUrlTemplates[local2];
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class506.aTwitchEventLiveStreams1.streamTitles[local2];
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class506.aTwitchEventLiveStreams1.channelDisplayNames[local2];
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!x", name = "aiv", descriptor = "(Lclient!yp;I)V")
	static void method33143(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class71.aClass510_2.method30536(local13, -971599642).aCharArray4[local23];
	}

	@OriginalMember(owner = "client!x", name = "atf", descriptor = "(Lclient!yp;I)V")
	static void method33144(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!x", name = "u", descriptor = "(Lclient!akw;Lclient!akw;I)V")
	public static void method33145(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.unlinkSecondary(-2147483644);
		}
		arg0.aClass80_Sub1_67 = arg1;
		arg0.aClass80_Sub1_68 = arg1.aClass80_Sub1_68;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!x", name = "agz", descriptor = "(Lclient!yp;I)V")
	static void method33146(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, 1278542918)).anInt153 * 1772099209;
	}

	@OriginalMember(owner = "client!x", name = "<init>", descriptor = "()V")
	Class653() throws Throwable {
		throw new Error();
	}
}
