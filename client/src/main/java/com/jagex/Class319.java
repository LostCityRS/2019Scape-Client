package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class319 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
	int[] anIntArray386;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
	int anInt4027;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
	int anInt4028;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[I")
	int[] anIntArray387;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
	int[] anIntArray388;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "[[F")
	float[][] aFloatArrayArray25;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	int anInt4026 = 0;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	int anInt4029 = 0;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "(II)I")
	static int method27528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local12 * local16;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "(II)I")
	static int method27529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local12 * local16;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "(II)I")
	static int method27538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local12 * local16;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	Class319() {
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(Lclient!ha;)V")
	void method27530(@OriginalArg(0) Class307 arg0) {
		arg0.method27324(this.anInt4026 * 8 + this.anInt4029);
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(Lclient!ha;)V")
	void method27531(@OriginalArg(0) Class307 arg0) {
		@Pc(2) int local2 = arg0.method27335();
		@Pc(5) int local5 = arg0.method27357();
		arg0.method27324(24);
		this.anInt4027 = arg0.method27324(16);
		this.anInt4028 = arg0.method27324(24);
		if (this.anIntArray386 == null || this.anIntArray386.length != this.anInt4028) {
			this.anIntArray386 = new int[this.anInt4028];
		}
		@Pc(40) boolean local40 = arg0.method27352() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27324(5) + 1;
			while (local44 < this.anInt4028) {
				@Pc(63) int local63 = arg0.method27324(Class702.method37107(this.anInt4028 - local44, 221154893));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray386[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27352() != 0;
			for (local50 = 0; local50 < this.anInt4028; local50++) {
				if (local86 && arg0.method27352() == 0) {
					this.anIntArray386[local50] = 0;
				} else {
					this.anIntArray386[local50] = arg0.method27324(5) + 1;
				}
			}
		}
		this.method27532();
		local44 = arg0.method27324(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27339(arg0.method27324(32));
			@Pc(134) float local134 = arg0.method27339(arg0.method27324(32));
			local65 = arg0.method27324(4) + 1;
			@Pc(147) boolean local147 = arg0.method27352() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27529(this.anInt4028, this.anInt4027);
			} else {
				local156 = this.anInt4028 * this.anInt4027;
			}
			this.anIntArray387 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray387[local169] = arg0.method27324(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4028][this.anInt4027];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4028; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4027; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray387[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4028; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4027;
					for (local203 = 0; local203 < this.anInt4027; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray387[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4029 = arg0.method27335() - local2;
		this.anInt4026 = arg0.method27357() - local5;
	}

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "()V")
	void method27532() {
		@Pc(3) int[] local3 = new int[this.anInt4028];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4028; local8++) {
			local17 = this.anIntArray386[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray388 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4028; local8++) {
			local17 = this.anIntArray386[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray388[local30] == 0) {
							this.anIntArray388[local30] = local122;
						}
						local30 = this.anIntArray388[local30];
					}
					if (local30 >= this.anIntArray388.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray388.length * 2];
						for (local69 = 0; local69 < this.anIntArray388.length; local69++) {
							local184[local69] = this.anIntArray388[local69];
						}
						this.anIntArray388 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray388[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "(Lclient!ha;)I")
	int method27533(@OriginalArg(0) Class307 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray388[local1] >= 0; local1 = arg0.method27352() == 0 ? local1 + 1 : this.anIntArray388[local1]) {
		}
		return ~this.anIntArray388[local1];
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(Lclient!ha;)[F")
	float[] method27534(@OriginalArg(0) Class307 arg0) {
		return this.aFloatArrayArray25[this.method27533(arg0)];
	}

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "()V")
	void method27535() {
		@Pc(3) int[] local3 = new int[this.anInt4028];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4028; local8++) {
			local17 = this.anIntArray386[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray388 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4028; local8++) {
			local17 = this.anIntArray386[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray388[local30] == 0) {
							this.anIntArray388[local30] = local122;
						}
						local30 = this.anIntArray388[local30];
					}
					if (local30 >= this.anIntArray388.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray388.length * 2];
						for (local69 = 0; local69 < this.anIntArray388.length; local69++) {
							local184[local69] = this.anIntArray388[local69];
						}
						this.anIntArray388 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray388[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "(Lclient!ha;)V")
	void method27536(@OriginalArg(0) Class307 arg0) {
		@Pc(2) int local2 = arg0.method27335();
		@Pc(5) int local5 = arg0.method27357();
		arg0.method27324(24);
		this.anInt4027 = arg0.method27324(16);
		this.anInt4028 = arg0.method27324(24);
		if (this.anIntArray386 == null || this.anIntArray386.length != this.anInt4028) {
			this.anIntArray386 = new int[this.anInt4028];
		}
		@Pc(40) boolean local40 = arg0.method27352() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27324(5) + 1;
			while (local44 < this.anInt4028) {
				@Pc(63) int local63 = arg0.method27324(Class702.method37107(this.anInt4028 - local44, 221154893));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray386[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27352() != 0;
			for (local50 = 0; local50 < this.anInt4028; local50++) {
				if (local86 && arg0.method27352() == 0) {
					this.anIntArray386[local50] = 0;
				} else {
					this.anIntArray386[local50] = arg0.method27324(5) + 1;
				}
			}
		}
		this.method27532();
		local44 = arg0.method27324(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27339(arg0.method27324(32));
			@Pc(134) float local134 = arg0.method27339(arg0.method27324(32));
			local65 = arg0.method27324(4) + 1;
			@Pc(147) boolean local147 = arg0.method27352() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27529(this.anInt4028, this.anInt4027);
			} else {
				local156 = this.anInt4028 * this.anInt4027;
			}
			this.anIntArray387 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray387[local169] = arg0.method27324(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4028][this.anInt4027];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4028; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4027; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray387[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4028; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4027;
					for (local203 = 0; local203 < this.anInt4027; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray387[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4029 = arg0.method27335() - local2;
		this.anInt4026 = arg0.method27357() - local5;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ha;)[F")
	float[] method27537(@OriginalArg(0) Class307 arg0) {
		return this.aFloatArrayArray25[this.method27533(arg0)];
	}
}
