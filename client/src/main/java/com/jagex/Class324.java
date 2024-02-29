package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public class Class324 {

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "[I")
	int[] anIntArray401;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
	int[] anIntArray402;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "[I")
	int[] anIntArray403;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	int anInt4135;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	int anInt4136;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "[[F")
	float[][] aFloatArrayArray25;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
	int anInt4134 = 0;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
	int anInt4137 = 0;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V", line = 17)
	Class324() {
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(II)I", line = 20)
	static int method27280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
				local44 = local16 * local12;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "(II)I", line = 20)
	static int method27281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
				local44 = local16 * local12;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "(Lclient!hk;)V", line = 45)
	void method27282(@OriginalArg(0) Class315 arg0) {
		arg0.method27116(this.anInt4134 * 8 + this.anInt4137);
	}

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "(Lclient!hk;)V", line = 45)
	void method27283(@OriginalArg(0) Class315 arg0) {
		arg0.method27116(this.anInt4134 * 8 + this.anInt4137);
	}

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "(Lclient!hk;)V", line = 45)
	void method27284(@OriginalArg(0) Class315 arg0) {
		arg0.method27116(this.anInt4134 * 8 + this.anInt4137);
	}

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "(Lclient!hk;)V", line = 49)
	void method27285(@OriginalArg(0) Class315 arg0) {
		@Pc(2) int local2 = arg0.method27108();
		@Pc(5) int local5 = arg0.method27105();
		arg0.method27116(24);
		this.anInt4136 = arg0.method27116(16);
		this.anInt4135 = arg0.method27116(24);
		if (this.anIntArray401 == null || this.anIntArray401.length != this.anInt4135) {
			this.anIntArray401 = new int[this.anInt4135];
		}
		@Pc(40) boolean local40 = arg0.method27112() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27116(5) + 1;
			while (local44 < this.anInt4135) {
				@Pc(63) int local63 = arg0.method27116(Class548.method31010(this.anInt4135 - local44, -1389676103));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray401[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27112() != 0;
			for (local50 = 0; local50 < this.anInt4135; local50++) {
				if (local86 && arg0.method27112() == 0) {
					this.anIntArray401[local50] = 0;
				} else {
					this.anIntArray401[local50] = arg0.method27116(5) + 1;
				}
			}
		}
		this.method27288();
		local44 = arg0.method27116(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27103(arg0.method27116(32));
			@Pc(134) float local134 = arg0.method27103(arg0.method27116(32));
			local65 = arg0.method27116(4) + 1;
			@Pc(147) boolean local147 = arg0.method27112() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27280(this.anInt4135, this.anInt4136);
			} else {
				local156 = this.anInt4135 * this.anInt4136;
			}
			this.anIntArray403 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray403[local169] = arg0.method27116(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4135][this.anInt4136];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4135; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4136; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray403[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4135; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4136;
					for (local203 = 0; local203 < this.anInt4136; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray403[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4137 = arg0.method27108() - local2;
		this.anInt4134 = arg0.method27105() - local5;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(Lclient!hk;)V", line = 49)
	void method27286(@OriginalArg(0) Class315 arg0) {
		@Pc(2) int local2 = arg0.method27108();
		@Pc(5) int local5 = arg0.method27105();
		arg0.method27116(24);
		this.anInt4136 = arg0.method27116(16);
		this.anInt4135 = arg0.method27116(24);
		if (this.anIntArray401 == null || this.anIntArray401.length != this.anInt4135) {
			this.anIntArray401 = new int[this.anInt4135];
		}
		@Pc(40) boolean local40 = arg0.method27112() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27116(5) + 1;
			while (local44 < this.anInt4135) {
				@Pc(63) int local63 = arg0.method27116(Class548.method31010(this.anInt4135 - local44, 125125818));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray401[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27112() != 0;
			for (local50 = 0; local50 < this.anInt4135; local50++) {
				if (local86 && arg0.method27112() == 0) {
					this.anIntArray401[local50] = 0;
				} else {
					this.anIntArray401[local50] = arg0.method27116(5) + 1;
				}
			}
		}
		this.method27288();
		local44 = arg0.method27116(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27103(arg0.method27116(32));
			@Pc(134) float local134 = arg0.method27103(arg0.method27116(32));
			local65 = arg0.method27116(4) + 1;
			@Pc(147) boolean local147 = arg0.method27112() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27280(this.anInt4135, this.anInt4136);
			} else {
				local156 = this.anInt4135 * this.anInt4136;
			}
			this.anIntArray403 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray403[local169] = arg0.method27116(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4135][this.anInt4136];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4135; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4136; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray403[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4135; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4136;
					for (local203 = 0; local203 < this.anInt4136; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray403[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4137 = arg0.method27108() - local2;
		this.anInt4134 = arg0.method27105() - local5;
	}

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "(Lclient!hk;)V", line = 49)
	void method27287(@OriginalArg(0) Class315 arg0) {
		@Pc(2) int local2 = arg0.method27108();
		@Pc(5) int local5 = arg0.method27105();
		arg0.method27116(24);
		this.anInt4136 = arg0.method27116(16);
		this.anInt4135 = arg0.method27116(24);
		if (this.anIntArray401 == null || this.anIntArray401.length != this.anInt4135) {
			this.anIntArray401 = new int[this.anInt4135];
		}
		@Pc(40) boolean local40 = arg0.method27112() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27116(5) + 1;
			while (local44 < this.anInt4135) {
				@Pc(63) int local63 = arg0.method27116(Class548.method31010(this.anInt4135 - local44, -811741050));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray401[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27112() != 0;
			for (local50 = 0; local50 < this.anInt4135; local50++) {
				if (local86 && arg0.method27112() == 0) {
					this.anIntArray401[local50] = 0;
				} else {
					this.anIntArray401[local50] = arg0.method27116(5) + 1;
				}
			}
		}
		this.method27288();
		local44 = arg0.method27116(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27103(arg0.method27116(32));
			@Pc(134) float local134 = arg0.method27103(arg0.method27116(32));
			local65 = arg0.method27116(4) + 1;
			@Pc(147) boolean local147 = arg0.method27112() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27280(this.anInt4135, this.anInt4136);
			} else {
				local156 = this.anInt4135 * this.anInt4136;
			}
			this.anIntArray403 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray403[local169] = arg0.method27116(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4135][this.anInt4136];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4135; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4136; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray403[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4135; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4136;
					for (local203 = 0; local203 < this.anInt4136; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray403[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4137 = arg0.method27108() - local2;
		this.anInt4134 = arg0.method27105() - local5;
	}

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "()V", line = 118)
	void method27288() {
		@Pc(3) int[] local3 = new int[this.anInt4135];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4135; local8++) {
			local17 = this.anIntArray401[local8];
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
		this.anIntArray402 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4135; local8++) {
			local17 = this.anIntArray401[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray402[local30] == 0) {
							this.anIntArray402[local30] = local122;
						}
						local30 = this.anIntArray402[local30];
					}
					if (local30 >= this.anIntArray402.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray402.length * 2];
						for (local69 = 0; local69 < this.anIntArray402.length; local69++) {
							local184[local69] = this.anIntArray402[local69];
						}
						this.anIntArray402 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray402[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "()V", line = 118)
	void method27289() {
		@Pc(3) int[] local3 = new int[this.anInt4135];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4135; local8++) {
			local17 = this.anIntArray401[local8];
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
		this.anIntArray402 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4135; local8++) {
			local17 = this.anIntArray401[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray402[local30] == 0) {
							this.anIntArray402[local30] = local122;
						}
						local30 = this.anIntArray402[local30];
					}
					if (local30 >= this.anIntArray402.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray402.length * 2];
						for (local69 = 0; local69 < this.anIntArray402.length; local69++) {
							local184[local69] = this.anIntArray402[local69];
						}
						this.anIntArray402 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray402[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "()V", line = 118)
	void method27290() {
		@Pc(3) int[] local3 = new int[this.anInt4135];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4135; local8++) {
			local17 = this.anIntArray401[local8];
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
		this.anIntArray402 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4135; local8++) {
			local17 = this.anIntArray401[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray402[local30] == 0) {
							this.anIntArray402[local30] = local122;
						}
						local30 = this.anIntArray402[local30];
					}
					if (local30 >= this.anIntArray402.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray402.length * 2];
						for (local69 = 0; local69 < this.anIntArray402.length; local69++) {
							local184[local69] = this.anIntArray402[local69];
						}
						this.anIntArray402 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray402[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(Lclient!hk;)I", line = 184)
	int method27291(@OriginalArg(0) Class315 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray402[local1] >= 0; local1 = arg0.method27112() == 0 ? local1 + 1 : this.anIntArray402[local1]) {
		}
		return ~this.anIntArray402[local1];
	}

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "(Lclient!hk;)I", line = 184)
	int method27292(@OriginalArg(0) Class315 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray402[local1] >= 0; local1 = arg0.method27112() == 0 ? local1 + 1 : this.anIntArray402[local1]) {
		}
		return ~this.anIntArray402[local1];
	}

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "(Lclient!hk;)[F", line = 190)
	float[] method27293(@OriginalArg(0) Class315 arg0) {
		return this.aFloatArrayArray25[this.method27291(arg0)];
	}

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "(Lclient!hk;)[F", line = 190)
	float[] method27294(@OriginalArg(0) Class315 arg0) {
		return this.aFloatArrayArray25[this.method27291(arg0)];
	}

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "(Lclient!hk;)[F", line = 190)
	float[] method27295(@OriginalArg(0) Class315 arg0) {
		return this.aFloatArrayArray25[this.method27291(arg0)];
	}
}
