package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Arrays;
import java.util.LinkedList;

@OriginalClass("client!dp")
public final class Class229 {

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
	public int anInt3684;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public int anInt3685;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public int anInt3686;

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
	int anInt3688;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
	public int anInt3690;

	@OriginalMember(owner = "client!dp", name = "an", descriptor = "([ILjava/util/LinkedList;IIFI)V")
	static void method25997(@OriginalArg(0) int[] arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		if (arg1.isEmpty()) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg1.size(); local5++) {
			@Pc(14) Class618 local14 = (Class618) arg1.get(local5);
			@Pc(25) int local25 = (int) ((float) (local14.anInt5432 * -967543719) * arg4) + arg2;
			@Pc(36) int local36 = arg3 + (int) (arg4 * (float) (local14.anInt5430 * -227036461));
			@Pc(45) int local45 = (int) ((float) (local14.anInt5431 * 1829220281) * arg4);
			@Pc(54) int local54 = (int) ((float) (local14.anInt5433 * 1270901473) * arg4);
			if (local25 < Class292.anInt3951 * 823569197 && local36 < Class351.anInt4255 * -1311710401) {
				if (local45 + local25 > Class292.anInt3951 * 823569197) {
					local45 = Class292.anInt3951 * 823569197 - local25;
				}
				if (local36 + local54 > Class351.anInt4255 * -1311710401) {
					local54 = Class351.anInt4255 * -1311710401 - local36;
				}
				for (@Pc(94) int local94 = local36; local94 < local54 + local36; local94++) {
					@Pc(107) int local107 = local25 + local94 * 823569197 * Class292.anInt3951;
					Arrays.fill(arg0, local107, local107 + local45, -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "aq", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z")
	static boolean method25998(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!Class622.aBoolean935) {
			switch(arg0.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(19) int local19;
		if (arg0.eventType != 33) {
			if (arg0.eventType == 30) {
				local19 = ((TwitchEventResult) arg0).result;
				if (local19 == 0 || local19 == 1) {
					Class27.method646((byte) 16);
				} else if (local19 == 2) {
					Class622.aLong401 = arg1 * 6599029287603157643L;
				}
			}
			if (arg0.eventType == 34) {
				Class506.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class436.method29129(34, 0, 830620996);
			}
			return true;
		} else if (Class622.aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local19 = ((TwitchEventResult) arg0).result;
			@Pc(24) int local24 = Class669.aTwitchTV1.GetWebcamFrameData(local19, Class622.aTwitchWebcamFrameData1);
			if (local24 == 0) {
				if (Class622.aBoolean938) {
					Class622.aTwitchWebcamFrameData1.t();
				}
				if (Class622.aBoolean939) {
					Class622.aTwitchWebcamFrameData1.f();
				}
				Class329.method27754(1626365401);
				Class622.aLong401 = arg1 * 6599029287603157643L;
				Class436.method29129(33, 0, 1626709028);
			} else {
				Class622.aClass99_38 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "ul", descriptor = "(Lclient!yp;I)V")
	static void method25999(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2055609345);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4091 * -13185357;
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class229() {
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(IIIIIII)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3687 = arg0 * 899347469;
		this.anInt3685 = arg1 * -491759939;
		this.anInt3686 = arg2 * 1857469271;
		this.anInt3688 = arg3 * -1014372727;
		this.anInt3684 = arg4 * 60460553;
		this.anInt3689 = arg5 * 771615817;
		this.anInt3690 = arg6 * 1711455315;
	}

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "(Lclient!dp;B)Z")
	public boolean method25996(@OriginalArg(0) Class229 arg0, @OriginalArg(1) byte arg1) {
		return this.anInt3687 * 1682209477 == arg0.anInt3687 * 1682209477 && arg0.anInt3685 * -692202347 == this.anInt3685 * -692202347 && arg0.anInt3686 * -1722392473 == this.anInt3686 * -1722392473 && this.anInt3688 * 1787523001 == arg0.anInt3688 * 1787523001 && arg0.anInt3684 * -948215751 == this.anInt3684 * -948215751 && arg0.anInt3689 * -643185159 == this.anInt3689 * -643185159 && arg0.anInt3690 * -971053093 == this.anInt3690 * -971053093;
	}
}
