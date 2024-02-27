package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamFrameData")
public final class TwitchWebcamFrameData {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "width", descriptor = "I")
	public int anInt3631 = 0;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "height", descriptor = "I")
	public int anInt3632 = 0;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "buffer", descriptor = "[I")
	public int[] anIntArray334 = null;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "SetData", descriptor = "(II[I)V")
	public void method25493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt3631 = arg0;
		this.anInt3632 = arg1;
		this.anIntArray334 = arg2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "e", descriptor = "()V")
	public void method25494() {
		for (@Pc(4) int local4 = this.anInt3632 - 1; local4 >= 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt3631;
			@Pc(18) int local18 = (local4 + 1) * this.anInt3631;
			while (local11 < local18) {
				local18--;
				@Pc(27) int local27 = this.anIntArray334[local11];
				this.anIntArray334[local11] = this.anIntArray334[local18];
				this.anIntArray334[local18] = local27;
				local11++;
			}
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "n", descriptor = "()V")
	public void method25495() {
		for (@Pc(6) int local6 = (this.anInt3632 >> 1) - 1; local6 >= 0; local6--) {
			@Pc(13) int local13 = this.anInt3631 * local6;
			@Pc(23) int local23 = (this.anInt3632 - local6 - 1) * this.anInt3631;
			for (@Pc(27) int local27 = -this.anInt3631; local27 < 0; local27++) {
				@Pc(34) int local34 = this.anIntArray334[local13];
				this.anIntArray334[local13] = this.anIntArray334[local23];
				this.anIntArray334[local23] = local34;
				local13++;
				local23++;
			}
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "m", descriptor = "()V")
	public void method25496() {
		for (@Pc(4) int local4 = this.anInt3632 - 1; local4 >= 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt3631;
			@Pc(18) int local18 = (local4 + 1) * this.anInt3631;
			while (local11 < local18) {
				local18--;
				@Pc(27) int local27 = this.anIntArray334[local11];
				this.anIntArray334[local11] = this.anIntArray334[local18];
				this.anIntArray334[local18] = local27;
				local11++;
			}
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "k", descriptor = "()V")
	public void method25497() {
		for (@Pc(4) int local4 = this.anInt3632 - 1; local4 >= 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt3631;
			@Pc(18) int local18 = (local4 + 1) * this.anInt3631;
			while (local11 < local18) {
				local18--;
				@Pc(27) int local27 = this.anIntArray334[local11];
				this.anIntArray334[local11] = this.anIntArray334[local18];
				this.anIntArray334[local18] = local27;
				local11++;
			}
		}
	}
}
