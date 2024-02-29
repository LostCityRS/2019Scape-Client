package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamFrameData")
public class TwitchWebcamFrameData {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "width", descriptor = "I")
	public int width = 0;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "height", descriptor = "I")
	public int height = 0;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "buffer", descriptor = "[I")
	public int[] buffer = null;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "SetData", descriptor = "(II[I)V", line = 26)
	public void SetData(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.width = arg0;
		this.height = arg1;
		this.buffer = arg2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "e", descriptor = "()V", line = 33)
	public void e() {
		for (@Pc(4) int local4 = this.height - 1; local4 >= 0; local4--) {
			@Pc(11) int local11 = local4 * this.width;
			@Pc(18) int local18 = (local4 + 1) * this.width;
			while (local11 < local18) {
				local18--;
				@Pc(27) int local27 = this.buffer[local11];
				this.buffer[local11] = this.buffer[local18];
				this.buffer[local18] = local27;
				local11++;
			}
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "m", descriptor = "()V", line = 33)
	public void m() {
		for (@Pc(4) int local4 = this.height - 1; local4 >= 0; local4--) {
			@Pc(11) int local11 = local4 * this.width;
			@Pc(18) int local18 = (local4 + 1) * this.width;
			while (local11 < local18) {
				local18--;
				@Pc(27) int local27 = this.buffer[local11];
				this.buffer[local11] = this.buffer[local18];
				this.buffer[local18] = local27;
				local11++;
			}
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "k", descriptor = "()V", line = 33)
	public void k() {
		for (@Pc(4) int local4 = this.height - 1; local4 >= 0; local4--) {
			@Pc(11) int local11 = local4 * this.width;
			@Pc(18) int local18 = (local4 + 1) * this.width;
			while (local11 < local18) {
				local18--;
				@Pc(27) int local27 = this.buffer[local11];
				this.buffer[local11] = this.buffer[local18];
				this.buffer[local18] = local27;
				local11++;
			}
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamFrameData", name = "n", descriptor = "()V", line = 48)
	public void n() {
		for (@Pc(6) int local6 = (this.height >> 1) - 1; local6 >= 0; local6--) {
			@Pc(13) int local13 = this.width * local6;
			@Pc(23) int local23 = (this.height - local6 - 1) * this.width;
			for (@Pc(27) int local27 = -this.width; local27 < 0; local27++) {
				@Pc(34) int local34 = this.buffer[local13];
				this.buffer[local13] = this.buffer[local23];
				this.buffer[local23] = local34;
				local13++;
				local23++;
			}
		}
	}
}
