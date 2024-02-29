package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class324 {

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "[I")
	int[] anIntArray403;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
	int[] anIntArray404;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "[I")
	int[] anIntArray405;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	int anInt4176;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	int anInt4177;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "[[F")
	float[][] aFloatArrayArray25;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
	int anInt4175 = 0;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
	int anInt4178 = 0;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(II)I")
	static int method27374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "(II)I")
	static int method27379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	Class324() {
	}

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "(Lclient!hk;)V")
	void method27373(@OriginalArg(0) Class315 arg0) {
		arg0.method27229(this.anInt4175 * 8 + this.anInt4178);
	}

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "()V")
	void method27375() {
		@Pc(3) int[] local3 = new int[this.anInt4176];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4176; local8++) {
			local17 = this.anIntArray403[local8];
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
		this.anIntArray404 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4176; local8++) {
			local17 = this.anIntArray403[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray404[local30] == 0) {
							this.anIntArray404[local30] = local122;
						}
						local30 = this.anIntArray404[local30];
					}
					if (local30 >= this.anIntArray404.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray404.length * 2];
						for (local69 = 0; local69 < this.anIntArray404.length; local69++) {
							local184[local69] = this.anIntArray404[local69];
						}
						this.anIntArray404 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray404[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "(Lclient!hk;)V")
	void method27376(@OriginalArg(0) Class315 arg0) {
		@Pc(2) int local2 = arg0.method27166();
		@Pc(5) int local5 = arg0.method27165();
		arg0.method27229(24);
		this.anInt4177 = arg0.method27229(16);
		this.anInt4176 = arg0.method27229(24);
		if (this.anIntArray403 == null || this.anIntArray403.length != this.anInt4176) {
			this.anIntArray403 = new int[this.anInt4176];
		}
		@Pc(40) boolean local40 = arg0.method27223() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27229(5) + 1;
			while (local44 < this.anInt4176) {
				@Pc(63) int local63 = arg0.method27229(Class548.method31195(this.anInt4176 - local44, -1389676103));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray403[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27223() != 0;
			for (local50 = 0; local50 < this.anInt4176; local50++) {
				if (local86 && arg0.method27223() == 0) {
					this.anIntArray403[local50] = 0;
				} else {
					this.anIntArray403[local50] = arg0.method27229(5) + 1;
				}
			}
		}
		this.method27375();
		local44 = arg0.method27229(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27164(arg0.method27229(32));
			@Pc(134) float local134 = arg0.method27164(arg0.method27229(32));
			local65 = arg0.method27229(4) + 1;
			@Pc(147) boolean local147 = arg0.method27223() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27374(this.anInt4176, this.anInt4177);
			} else {
				local156 = this.anInt4176 * this.anInt4177;
			}
			this.anIntArray405 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray405[local169] = arg0.method27229(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4176][this.anInt4177];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4176; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4177; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray405[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4176; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4177;
					for (local203 = 0; local203 < this.anInt4177; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray405[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4178 = arg0.method27166() - local2;
		this.anInt4175 = arg0.method27165() - local5;
	}

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(Lclient!hk;)I")
	int method27377(@OriginalArg(0) Class315 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray404[local1] >= 0; local1 = arg0.method27223() == 0 ? local1 + 1 : this.anIntArray404[local1]) {
		}
		return ~this.anIntArray404[local1];
	}

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "(Lclient!hk;)[F")
	float[] method27378(@OriginalArg(0) Class315 arg0) {
		return this.aFloatArrayArray25[this.method27377(arg0)];
	}

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "(Lclient!hk;)V")
	void method27380(@OriginalArg(0) Class315 arg0) {
		arg0.method27229(this.anInt4175 * 8 + this.anInt4178);
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(Lclient!hk;)V")
	void method27381(@OriginalArg(0) Class315 arg0) {
		@Pc(2) int local2 = arg0.method27166();
		@Pc(5) int local5 = arg0.method27165();
		arg0.method27229(24);
		this.anInt4177 = arg0.method27229(16);
		this.anInt4176 = arg0.method27229(24);
		if (this.anIntArray403 == null || this.anIntArray403.length != this.anInt4176) {
			this.anIntArray403 = new int[this.anInt4176];
		}
		@Pc(40) boolean local40 = arg0.method27223() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27229(5) + 1;
			while (local44 < this.anInt4176) {
				@Pc(63) int local63 = arg0.method27229(Class548.method31195(this.anInt4176 - local44, 125125818));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray403[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27223() != 0;
			for (local50 = 0; local50 < this.anInt4176; local50++) {
				if (local86 && arg0.method27223() == 0) {
					this.anIntArray403[local50] = 0;
				} else {
					this.anIntArray403[local50] = arg0.method27229(5) + 1;
				}
			}
		}
		this.method27375();
		local44 = arg0.method27229(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27164(arg0.method27229(32));
			@Pc(134) float local134 = arg0.method27164(arg0.method27229(32));
			local65 = arg0.method27229(4) + 1;
			@Pc(147) boolean local147 = arg0.method27223() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27374(this.anInt4176, this.anInt4177);
			} else {
				local156 = this.anInt4176 * this.anInt4177;
			}
			this.anIntArray405 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray405[local169] = arg0.method27229(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4176][this.anInt4177];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4176; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4177; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray405[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4176; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4177;
					for (local203 = 0; local203 < this.anInt4177; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray405[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4178 = arg0.method27166() - local2;
		this.anInt4175 = arg0.method27165() - local5;
	}

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "(Lclient!hk;)V")
	void method27382(@OriginalArg(0) Class315 arg0) {
		@Pc(2) int local2 = arg0.method27166();
		@Pc(5) int local5 = arg0.method27165();
		arg0.method27229(24);
		this.anInt4177 = arg0.method27229(16);
		this.anInt4176 = arg0.method27229(24);
		if (this.anIntArray403 == null || this.anIntArray403.length != this.anInt4176) {
			this.anIntArray403 = new int[this.anInt4176];
		}
		@Pc(40) boolean local40 = arg0.method27223() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method27229(5) + 1;
			while (local44 < this.anInt4176) {
				@Pc(63) int local63 = arg0.method27229(Class548.method31195(this.anInt4176 - local44, -811741050));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray403[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method27223() != 0;
			for (local50 = 0; local50 < this.anInt4176; local50++) {
				if (local86 && arg0.method27223() == 0) {
					this.anIntArray403[local50] = 0;
				} else {
					this.anIntArray403[local50] = arg0.method27229(5) + 1;
				}
			}
		}
		this.method27375();
		local44 = arg0.method27229(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method27164(arg0.method27229(32));
			@Pc(134) float local134 = arg0.method27164(arg0.method27229(32));
			local65 = arg0.method27229(4) + 1;
			@Pc(147) boolean local147 = arg0.method27223() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method27374(this.anInt4176, this.anInt4177);
			} else {
				local156 = this.anInt4176 * this.anInt4177;
			}
			this.anIntArray405 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray405[local169] = arg0.method27229(local65);
			}
			this.aFloatArrayArray25 = new float[this.anInt4176][this.anInt4177];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt4176; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt4177; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray405[local213] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt4176; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt4177;
					for (local203 = 0; local203 < this.anInt4177; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray405[local201] * local134 + local128 + local199;
						this.aFloatArrayArray25[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt4178 = arg0.method27166() - local2;
		this.anInt4175 = arg0.method27165() - local5;
	}

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "(Lclient!hk;)I")
	int method27383(@OriginalArg(0) Class315 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray404[local1] >= 0; local1 = arg0.method27223() == 0 ? local1 + 1 : this.anIntArray404[local1]) {
		}
		return ~this.anIntArray404[local1];
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "()V")
	void method27384() {
		@Pc(3) int[] local3 = new int[this.anInt4176];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4176; local8++) {
			local17 = this.anIntArray403[local8];
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
		this.anIntArray404 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4176; local8++) {
			local17 = this.anIntArray403[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray404[local30] == 0) {
							this.anIntArray404[local30] = local122;
						}
						local30 = this.anIntArray404[local30];
					}
					if (local30 >= this.anIntArray404.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray404.length * 2];
						for (local69 = 0; local69 < this.anIntArray404.length; local69++) {
							local184[local69] = this.anIntArray404[local69];
						}
						this.anIntArray404 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray404[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "()V")
	void method27385() {
		@Pc(3) int[] local3 = new int[this.anInt4176];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt4176; local8++) {
			local17 = this.anIntArray403[local8];
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
		this.anIntArray404 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt4176; local8++) {
			local17 = this.anIntArray403[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray404[local30] == 0) {
							this.anIntArray404[local30] = local122;
						}
						local30 = this.anIntArray404[local30];
					}
					if (local30 >= this.anIntArray404.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray404.length * 2];
						for (local69 = 0; local69 < this.anIntArray404.length; local69++) {
							local184[local69] = this.anIntArray404[local69];
						}
						this.anIntArray404 = local184;
					}
					local53 >>>= 0x1;
				}
				this.anIntArray404[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "(Lclient!hk;)V")
	void method27386(@OriginalArg(0) Class315 arg0) {
		arg0.method27229(this.anInt4175 * 8 + this.anInt4178);
	}

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "(Lclient!hk;)[F")
	float[] method27387(@OriginalArg(0) Class315 arg0) {
		return this.aFloatArrayArray25[this.method27377(arg0)];
	}

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "(Lclient!hk;)[F")
	float[] method27388(@OriginalArg(0) Class315 arg0) {
		return this.aFloatArrayArray25[this.method27377(arg0)];
	}
}
