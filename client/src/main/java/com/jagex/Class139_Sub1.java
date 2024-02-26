package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aif")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!aif", name = "y", descriptor = "Lclient!ug;")
	Class160 aClass160_2;

	@OriginalMember(owner = "client!aif", name = "c", descriptor = "(II)V")
	@Override
	void method10787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_2.method15549((short) 23005);
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_2 = null;
		this.anInt1250 += 587474147;
		this.anInt1251 = -1948128749;
		this.aByte19 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1252 = arg0 * 644123047;
		this.anInt1253 = arg1 * 975887797;
	}

	@OriginalMember(owner = "client!aif", name = "ah", descriptor = "()V")
	@Override
	public void method10798() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method10769(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		if (this.aClass160_2 != null) {
			@Pc(5) long local5 = Class303.method27111((byte) 17);
			local13 = (int) (local5 - this.aLong42 * -3685984507407349449L);
			this.aLong42 = local5 * -5583368868183688057L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt1249 += local13 * 1502058051;
			if (this.anInt1249 * 471656043 > 30000) {
				try {
					this.aClass160_2.method15549((short) -23086);
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass160_2 = null;
			}
		}
		if (this.aClass160_2 == null) {
			return this.method10767((byte) -61) == 0 && this.method10766(-218394721) == 0;
		}
		try {
			@Pc(68) Class80_Sub1_Sub15_Sub3 local68;
			for (local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_9.method50((byte) 22); local68 != null; local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_9.method46((byte) -102)) {
				this.aClass80_Sub36_6.anInt3152 = 0;
				this.aClass80_Sub36_6.method23154(1, 1275868335);
				this.aClass80_Sub36_6.method23282(local68.aLong340 * 4203303297430504511L);
				this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
				this.aClass3_6.method42(local68, 1599142138);
			}
			for (local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_7.method50((byte) -37); local68 != null; local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_7.method46((byte) -102)) {
				this.aClass80_Sub36_6.anInt3152 = 0;
				this.aClass80_Sub36_6.method23154(0, 1275868335);
				this.aClass80_Sub36_6.method23282(local68.aLong340 * 4203303297430504511L);
				this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
				this.aClass3_8.method42(local68, 1599142138);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.aClass160_2.method15547(812298590);
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.anInt1249 = 0;
				@Pc(217) int local217;
				@Pc(270) int local270;
				if (this.aClass80_Sub1_Sub15_Sub3_2 == null) {
					local13 = 5 - this.aClass80_Sub36_7.anInt3152 * -1380987821;
					if (local13 > local169) {
						local13 = local169;
					}
					this.aClass160_2.method15551(this.aClass80_Sub36_7.aByteArray61, this.aClass80_Sub36_7.anInt3152 * -1380987821, local13, -1368891515);
					if (this.aByte19 != 0) {
						for (local217 = 0; local217 < local13; local217++) {
							this.aClass80_Sub36_7.aByteArray61[this.aClass80_Sub36_7.anInt3152 * -1380987821 + local217] ^= this.aByte19;
						}
					}
					this.aClass80_Sub36_7.anInt3152 += local13 * 1034180571;
					if (this.aClass80_Sub36_7.anInt3152 * -1380987821 >= 5) {
						this.aClass80_Sub36_7.anInt3152 = 0;
						local217 = this.aClass80_Sub36_7.method23362(257400044);
						local270 = this.aClass80_Sub36_7.method23182(-110592862);
						@Pc(278) boolean local278 = (local270 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local270 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local217 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Class80_Sub1_Sub15_Sub3 local303;
						if (local278) {
							local296 = this.aClass3_8.iterator();
							while (local296.hasNext()) {
								local303 = (Class80_Sub1_Sub15_Sub3) local296.next();
								if (local290 == local303.aLong340 * 4203303297430504511L) {
									this.aClass80_Sub1_Sub15_Sub3_2 = local303;
									break;
								}
							}
						} else {
							local296 = this.aClass3_6.iterator();
							while (local296.hasNext()) {
								local303 = (Class80_Sub1_Sub15_Sub3) local296.next();
								if (local303.aLong340 * 4203303297430504511L == local290) {
									this.aClass80_Sub1_Sub15_Sub3_2 = local303;
									break;
								}
							}
						}
						if (this.aClass80_Sub1_Sub15_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1243 = 413758963;
						this.aClass80_Sub36_7.anInt3152 = 0;
						this.aClass80_Sub36_5.anInt3152 = 0;
					}
				} else {
					@Pc(363) Class80_Sub36 local363 = this.aClass80_Sub1_Sub15_Sub3_2.aClass80_Sub36_13;
					@Pc(451) int local451;
					if (local363 == null) {
						local217 = 5 - this.aClass80_Sub36_5.anInt3152 * -1380987821;
						if (local217 > local169) {
							local217 = local169;
						}
						this.aClass160_2.method15551(this.aClass80_Sub36_5.aByteArray61, this.aClass80_Sub36_5.anInt3152 * -1380987821, local217, -1360803754);
						if (this.aByte19 != 0) {
							for (local270 = 0; local270 < local217; local270++) {
								this.aClass80_Sub36_5.aByteArray61[local270 + this.aClass80_Sub36_5.anInt3152 * -1380987821] ^= this.aByte19;
							}
						}
						this.aClass80_Sub36_5.anInt3152 += local217 * 1034180571;
						if (this.aClass80_Sub36_5.anInt3152 * -1380987821 >= 5) {
							this.aClass80_Sub36_5.anInt3152 = 0;
							local270 = this.aClass80_Sub36_5.method23362(840998755);
							local451 = this.aClass80_Sub36_5.method23182(-839654517);
							@Pc(453) byte local453 = 5;
							if (local270 != Class486.aClass486_4.method37268()) {
								local453 = 9;
							}
							local363 = this.aClass80_Sub1_Sub15_Sub3_2.aClass80_Sub36_13 = new Class80_Sub36(local451 + local453 + this.aClass80_Sub1_Sub15_Sub3_2.aByte95);
							local363.method23154(local270, 1275868335);
							local363.method23345(local451, (byte) 117);
							this.anInt1243 += 413758963;
						}
					} else {
						local217 = local363.aByteArray61.length - this.aClass80_Sub1_Sub15_Sub3_2.aByte95;
						local270 = 102400 - this.anInt1243 * -349251545;
						if (local270 > local217 - local363.anInt3152 * -1380987821) {
							local270 = local217 - local363.anInt3152 * -1380987821;
						}
						if (local270 > local169) {
							local270 = local169;
						}
						this.aClass160_2.method15551(local363.aByteArray61, local363.anInt3152 * -1380987821, local270, -1725252174);
						if (this.aByte19 != 0) {
							for (local451 = 0; local451 < local270; local451++) {
								local363.aByteArray61[local451 + local363.anInt3152 * -1380987821] ^= this.aByte19;
							}
						}
						local363.anInt3152 += local270 * 1034180571;
						this.anInt1243 += local270 * 1800738711;
						if (local217 == local363.anInt3152 * -1380987821) {
							this.aClass80_Sub1_Sub15_Sub3_2.method24406(-2147483644);
							this.aClass80_Sub1_Sub15_Sub3_2.aBoolean661 = false;
							this.aClass80_Sub1_Sub15_Sub3_2 = null;
						} else if (this.anInt1243 * -349251545 == 102400) {
							this.anInt1243 = 0;
							this.aClass80_Sub1_Sub15_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(614) IOException local614) {
			try {
				this.aClass160_2.method15549((short) 10148);
			} catch (@Pc(620) Exception local620) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
			return this.method10767((byte) 45) == 0 && this.method10766(476757852) == 0;
		}
	}

	@OriginalMember(owner = "client!aif", name = "m", descriptor = "(Ljava/lang/Object;ZI)V")
	@Override
	public void method10791(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.aClass160_2 != null) {
			try {
				this.aClass160_2.method15549((short) -13531);
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_2 = null;
		}
		this.aClass160_2 = (Class160) arg0;
		this.method10805((byte) 48);
		this.method10771(arg1, (byte) 86);
		this.aClass80_Sub36_7.anInt3152 = 0;
		this.aClass80_Sub36_5.anInt3152 = 0;
		this.aClass80_Sub1_Sub15_Sub3_2 = null;
		while (true) {
			@Pc(40) Class80_Sub1_Sub15_Sub3 local40 = (Class80_Sub1_Sub15_Sub3) this.aClass3_6.method67(-1822402502);
			if (local40 == null) {
				while (true) {
					local40 = (Class80_Sub1_Sub15_Sub3) this.aClass3_8.method67(1000903141);
					if (local40 == null) {
						if (this.aByte19 != 0) {
							try {
								this.aClass80_Sub36_6.anInt3152 = 0;
								this.aClass80_Sub36_6.method23154(4, 1275868335);
								this.aClass80_Sub36_6.method23154(this.aByte19, 1275868335);
								this.aClass80_Sub36_6.method23345(0, (byte) 62);
								this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass160_2.method15549((short) 936);
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass160_2 = null;
								this.anInt1250 += 587474147;
								this.anInt1251 = 398709798;
							}
						}
						this.anInt1249 = 0;
						this.aLong42 = Class303.method27111((byte) 106) * -5583368868183688057L;
						return;
					}
					local40.aClass80_Sub36_13 = null;
					this.aClass3_7.method42(local40, 1599142138);
				}
			}
			local40.aClass80_Sub36_13 = null;
			this.aClass3_9.method42(local40, 1599142138);
		}
	}

	@OriginalMember(owner = "client!aif", name = "ad", descriptor = "(B)V")
	void method10805(@OriginalArg(0) byte arg0) {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(6, 1275868335);
			this.aClass80_Sub36_6.method23157(4, -1396878770);
			this.aClass80_Sub36_6.method23155(0, (byte) -26);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_2.method15549((short) 9599);
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ai", descriptor = "(Ljava/lang/Object;Z)V")
	@Override
	public void method10782(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass160_2 != null) {
			try {
				this.aClass160_2.method15549((short) 23165);
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_2 = null;
		}
		this.aClass160_2 = (Class160) arg0;
		this.method10805((byte) 22);
		this.method10771(arg1, (byte) 94);
		this.aClass80_Sub36_7.anInt3152 = 0;
		this.aClass80_Sub36_5.anInt3152 = 0;
		this.aClass80_Sub1_Sub15_Sub3_2 = null;
		while (true) {
			@Pc(40) Class80_Sub1_Sub15_Sub3 local40 = (Class80_Sub1_Sub15_Sub3) this.aClass3_6.method67(307481594);
			if (local40 == null) {
				while (true) {
					local40 = (Class80_Sub1_Sub15_Sub3) this.aClass3_8.method67(-1864334751);
					if (local40 == null) {
						if (this.aByte19 != 0) {
							try {
								this.aClass80_Sub36_6.anInt3152 = 0;
								this.aClass80_Sub36_6.method23154(4, 1275868335);
								this.aClass80_Sub36_6.method23154(this.aByte19, 1275868335);
								this.aClass80_Sub36_6.method23345(0, (byte) 36);
								this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass160_2.method15549((short) -7079);
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass160_2 = null;
								this.anInt1250 += 587474147;
								this.anInt1251 = 398709798;
							}
						}
						this.anInt1249 = 0;
						this.aLong42 = Class303.method27111((byte) 59) * -5583368868183688057L;
						return;
					}
					local40.aClass80_Sub36_13 = null;
					this.aClass3_7.method42(local40, 1599142138);
				}
			}
			local40.aClass80_Sub36_13 = null;
			this.aClass3_9.method42(local40, 1599142138);
		}
	}

	@OriginalMember(owner = "client!aif", name = "j", descriptor = "(I)V")
	@Override
	public void method10772(@OriginalArg(0) int arg0) {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(7, 1275868335);
			this.aClass80_Sub36_6.method23282(0L);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_2.method15549((short) 8016);
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "a", descriptor = "(B)V")
	@Override
	public void method10773(@OriginalArg(0) byte arg0) {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15549((short) -7663);
		}
	}

	@OriginalMember(owner = "client!aif", name = "n", descriptor = "(II)V")
	@Override
	void method10797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_2.method15549((short) 14245);
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_2 = null;
		this.anInt1250 += 587474147;
		this.anInt1251 = -1948128749;
		this.aByte19 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1252 = arg0 * 644123047;
		this.anInt1253 = arg1 * 975887797;
	}

	@OriginalMember(owner = "client!aif", name = "am", descriptor = "()V")
	@Override
	public void method10800() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15549((short) -17150);
		}
	}

	@OriginalMember(owner = "client!aif", name = "b", descriptor = "()Z")
	@Override
	public boolean method10781() {
		@Pc(13) int local13;
		if (this.aClass160_2 != null) {
			@Pc(5) long local5 = Class303.method27111((byte) 63);
			local13 = (int) (local5 - this.aLong42 * -3685984507407349449L);
			this.aLong42 = local5 * -5583368868183688057L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt1249 += local13 * 1502058051;
			if (this.anInt1249 * 471656043 > 30000) {
				try {
					this.aClass160_2.method15549((short) -17779);
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass160_2 = null;
			}
		}
		if (this.aClass160_2 == null) {
			return this.method10767((byte) 9) == 0 && this.method10766(992708531) == 0;
		}
		try {
			@Pc(68) Class80_Sub1_Sub15_Sub3 local68;
			for (local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_9.method50((byte) 25); local68 != null; local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_9.method46((byte) -102)) {
				this.aClass80_Sub36_6.anInt3152 = 0;
				this.aClass80_Sub36_6.method23154(1, 1275868335);
				this.aClass80_Sub36_6.method23282(local68.aLong340 * 4203303297430504511L);
				this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
				this.aClass3_6.method42(local68, 1599142138);
			}
			for (local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_7.method50((byte) 2); local68 != null; local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_7.method46((byte) -102)) {
				this.aClass80_Sub36_6.anInt3152 = 0;
				this.aClass80_Sub36_6.method23154(0, 1275868335);
				this.aClass80_Sub36_6.method23282(local68.aLong340 * 4203303297430504511L);
				this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
				this.aClass3_8.method42(local68, 1599142138);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.aClass160_2.method15547(-1081987792);
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.anInt1249 = 0;
				@Pc(217) int local217;
				@Pc(270) int local270;
				if (this.aClass80_Sub1_Sub15_Sub3_2 == null) {
					local13 = 5 - this.aClass80_Sub36_7.anInt3152 * -1380987821;
					if (local13 > local169) {
						local13 = local169;
					}
					this.aClass160_2.method15551(this.aClass80_Sub36_7.aByteArray61, this.aClass80_Sub36_7.anInt3152 * -1380987821, local13, -1632691929);
					if (this.aByte19 != 0) {
						for (local217 = 0; local217 < local13; local217++) {
							this.aClass80_Sub36_7.aByteArray61[this.aClass80_Sub36_7.anInt3152 * -1380987821 + local217] ^= this.aByte19;
						}
					}
					this.aClass80_Sub36_7.anInt3152 += local13 * 1034180571;
					if (this.aClass80_Sub36_7.anInt3152 * -1380987821 >= 5) {
						this.aClass80_Sub36_7.anInt3152 = 0;
						local217 = this.aClass80_Sub36_7.method23362(-1963042849);
						local270 = this.aClass80_Sub36_7.method23182(1758457125);
						@Pc(278) boolean local278 = (local270 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local270 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local217 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Class80_Sub1_Sub15_Sub3 local303;
						if (local278) {
							local296 = this.aClass3_8.iterator();
							while (local296.hasNext()) {
								local303 = (Class80_Sub1_Sub15_Sub3) local296.next();
								if (local290 == local303.aLong340 * 4203303297430504511L) {
									this.aClass80_Sub1_Sub15_Sub3_2 = local303;
									break;
								}
							}
						} else {
							local296 = this.aClass3_6.iterator();
							while (local296.hasNext()) {
								local303 = (Class80_Sub1_Sub15_Sub3) local296.next();
								if (local303.aLong340 * 4203303297430504511L == local290) {
									this.aClass80_Sub1_Sub15_Sub3_2 = local303;
									break;
								}
							}
						}
						if (this.aClass80_Sub1_Sub15_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1243 = 413758963;
						this.aClass80_Sub36_7.anInt3152 = 0;
						this.aClass80_Sub36_5.anInt3152 = 0;
					}
				} else {
					@Pc(363) Class80_Sub36 local363 = this.aClass80_Sub1_Sub15_Sub3_2.aClass80_Sub36_13;
					@Pc(451) int local451;
					if (local363 == null) {
						local217 = 5 - this.aClass80_Sub36_5.anInt3152 * -1380987821;
						if (local217 > local169) {
							local217 = local169;
						}
						this.aClass160_2.method15551(this.aClass80_Sub36_5.aByteArray61, this.aClass80_Sub36_5.anInt3152 * -1380987821, local217, -2042035351);
						if (this.aByte19 != 0) {
							for (local270 = 0; local270 < local217; local270++) {
								this.aClass80_Sub36_5.aByteArray61[local270 + this.aClass80_Sub36_5.anInt3152 * -1380987821] ^= this.aByte19;
							}
						}
						this.aClass80_Sub36_5.anInt3152 += local217 * 1034180571;
						if (this.aClass80_Sub36_5.anInt3152 * -1380987821 >= 5) {
							this.aClass80_Sub36_5.anInt3152 = 0;
							local270 = this.aClass80_Sub36_5.method23362(361314702);
							local451 = this.aClass80_Sub36_5.method23182(2136708400);
							@Pc(453) byte local453 = 5;
							if (local270 != Class486.aClass486_4.method37268()) {
								local453 = 9;
							}
							local363 = this.aClass80_Sub1_Sub15_Sub3_2.aClass80_Sub36_13 = new Class80_Sub36(local451 + local453 + this.aClass80_Sub1_Sub15_Sub3_2.aByte95);
							local363.method23154(local270, 1275868335);
							local363.method23345(local451, (byte) 107);
							this.anInt1243 += 413758963;
						}
					} else {
						local217 = local363.aByteArray61.length - this.aClass80_Sub1_Sub15_Sub3_2.aByte95;
						local270 = 102400 - this.anInt1243 * -349251545;
						if (local270 > local217 - local363.anInt3152 * -1380987821) {
							local270 = local217 - local363.anInt3152 * -1380987821;
						}
						if (local270 > local169) {
							local270 = local169;
						}
						this.aClass160_2.method15551(local363.aByteArray61, local363.anInt3152 * -1380987821, local270, -1160775717);
						if (this.aByte19 != 0) {
							for (local451 = 0; local451 < local270; local451++) {
								local363.aByteArray61[local451 + local363.anInt3152 * -1380987821] ^= this.aByte19;
							}
						}
						local363.anInt3152 += local270 * 1034180571;
						this.anInt1243 += local270 * 1800738711;
						if (local217 == local363.anInt3152 * -1380987821) {
							this.aClass80_Sub1_Sub15_Sub3_2.method24406(-2147483647);
							this.aClass80_Sub1_Sub15_Sub3_2.aBoolean661 = false;
							this.aClass80_Sub1_Sub15_Sub3_2 = null;
						} else if (this.anInt1243 * -349251545 == 102400) {
							this.anInt1243 = 0;
							this.aClass80_Sub1_Sub15_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(614) IOException local614) {
			try {
				this.aClass160_2.method15549((short) 14292);
			} catch (@Pc(620) Exception local620) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
			return this.method10767((byte) -10) == 0 && this.method10766(728574263) == 0;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ax", descriptor = "()Z")
	@Override
	public boolean method10770() {
		@Pc(13) int local13;
		if (this.aClass160_2 != null) {
			@Pc(5) long local5 = Class303.method27111((byte) 26);
			local13 = (int) (local5 - this.aLong42 * -3685984507407349449L);
			this.aLong42 = local5 * -5583368868183688057L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt1249 += local13 * 1502058051;
			if (this.anInt1249 * 471656043 > 30000) {
				try {
					this.aClass160_2.method15549((short) -17405);
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass160_2 = null;
			}
		}
		if (this.aClass160_2 == null) {
			return this.method10767((byte) 45) == 0 && this.method10766(871361488) == 0;
		}
		try {
			@Pc(68) Class80_Sub1_Sub15_Sub3 local68;
			for (local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_9.method50((byte) -23); local68 != null; local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_9.method46((byte) -102)) {
				this.aClass80_Sub36_6.anInt3152 = 0;
				this.aClass80_Sub36_6.method23154(1, 1275868335);
				this.aClass80_Sub36_6.method23282(local68.aLong340 * 4203303297430504511L);
				this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
				this.aClass3_6.method42(local68, 1599142138);
			}
			for (local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_7.method50((byte) 102); local68 != null; local68 = (Class80_Sub1_Sub15_Sub3) this.aClass3_7.method46((byte) -102)) {
				this.aClass80_Sub36_6.anInt3152 = 0;
				this.aClass80_Sub36_6.method23154(0, 1275868335);
				this.aClass80_Sub36_6.method23282(local68.aLong340 * 4203303297430504511L);
				this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
				this.aClass3_8.method42(local68, 1599142138);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.aClass160_2.method15547(86138249);
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.anInt1249 = 0;
				@Pc(217) int local217;
				@Pc(270) int local270;
				if (this.aClass80_Sub1_Sub15_Sub3_2 == null) {
					local13 = 5 - this.aClass80_Sub36_7.anInt3152 * -1380987821;
					if (local13 > local169) {
						local13 = local169;
					}
					this.aClass160_2.method15551(this.aClass80_Sub36_7.aByteArray61, this.aClass80_Sub36_7.anInt3152 * -1380987821, local13, -1623409993);
					if (this.aByte19 != 0) {
						for (local217 = 0; local217 < local13; local217++) {
							this.aClass80_Sub36_7.aByteArray61[this.aClass80_Sub36_7.anInt3152 * -1380987821 + local217] ^= this.aByte19;
						}
					}
					this.aClass80_Sub36_7.anInt3152 += local13 * 1034180571;
					if (this.aClass80_Sub36_7.anInt3152 * -1380987821 >= 5) {
						this.aClass80_Sub36_7.anInt3152 = 0;
						local217 = this.aClass80_Sub36_7.method23362(-1433098871);
						local270 = this.aClass80_Sub36_7.method23182(165564872);
						@Pc(278) boolean local278 = (local270 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local270 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local217 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Class80_Sub1_Sub15_Sub3 local303;
						if (local278) {
							local296 = this.aClass3_8.iterator();
							while (local296.hasNext()) {
								local303 = (Class80_Sub1_Sub15_Sub3) local296.next();
								if (local290 == local303.aLong340 * 4203303297430504511L) {
									this.aClass80_Sub1_Sub15_Sub3_2 = local303;
									break;
								}
							}
						} else {
							local296 = this.aClass3_6.iterator();
							while (local296.hasNext()) {
								local303 = (Class80_Sub1_Sub15_Sub3) local296.next();
								if (local303.aLong340 * 4203303297430504511L == local290) {
									this.aClass80_Sub1_Sub15_Sub3_2 = local303;
									break;
								}
							}
						}
						if (this.aClass80_Sub1_Sub15_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1243 = 413758963;
						this.aClass80_Sub36_7.anInt3152 = 0;
						this.aClass80_Sub36_5.anInt3152 = 0;
					}
				} else {
					@Pc(363) Class80_Sub36 local363 = this.aClass80_Sub1_Sub15_Sub3_2.aClass80_Sub36_13;
					@Pc(451) int local451;
					if (local363 == null) {
						local217 = 5 - this.aClass80_Sub36_5.anInt3152 * -1380987821;
						if (local217 > local169) {
							local217 = local169;
						}
						this.aClass160_2.method15551(this.aClass80_Sub36_5.aByteArray61, this.aClass80_Sub36_5.anInt3152 * -1380987821, local217, -1334677373);
						if (this.aByte19 != 0) {
							for (local270 = 0; local270 < local217; local270++) {
								this.aClass80_Sub36_5.aByteArray61[local270 + this.aClass80_Sub36_5.anInt3152 * -1380987821] ^= this.aByte19;
							}
						}
						this.aClass80_Sub36_5.anInt3152 += local217 * 1034180571;
						if (this.aClass80_Sub36_5.anInt3152 * -1380987821 >= 5) {
							this.aClass80_Sub36_5.anInt3152 = 0;
							local270 = this.aClass80_Sub36_5.method23362(847263658);
							local451 = this.aClass80_Sub36_5.method23182(-923826053);
							@Pc(453) byte local453 = 5;
							if (local270 != Class486.aClass486_4.method37268()) {
								local453 = 9;
							}
							local363 = this.aClass80_Sub1_Sub15_Sub3_2.aClass80_Sub36_13 = new Class80_Sub36(local451 + local453 + this.aClass80_Sub1_Sub15_Sub3_2.aByte95);
							local363.method23154(local270, 1275868335);
							local363.method23345(local451, (byte) 10);
							this.anInt1243 += 413758963;
						}
					} else {
						local217 = local363.aByteArray61.length - this.aClass80_Sub1_Sub15_Sub3_2.aByte95;
						local270 = 102400 - this.anInt1243 * -349251545;
						if (local270 > local217 - local363.anInt3152 * -1380987821) {
							local270 = local217 - local363.anInt3152 * -1380987821;
						}
						if (local270 > local169) {
							local270 = local169;
						}
						this.aClass160_2.method15551(local363.aByteArray61, local363.anInt3152 * -1380987821, local270, -1855036990);
						if (this.aByte19 != 0) {
							for (local451 = 0; local451 < local270; local451++) {
								local363.aByteArray61[local451 + local363.anInt3152 * -1380987821] ^= this.aByte19;
							}
						}
						local363.anInt3152 += local270 * 1034180571;
						this.anInt1243 += local270 * 1800738711;
						if (local217 == local363.anInt3152 * -1380987821) {
							this.aClass80_Sub1_Sub15_Sub3_2.method24406(-2147483642);
							this.aClass80_Sub1_Sub15_Sub3_2.aBoolean661 = false;
							this.aClass80_Sub1_Sub15_Sub3_2 = null;
						} else if (this.anInt1243 * -349251545 == 102400) {
							this.anInt1243 = 0;
							this.aClass80_Sub1_Sub15_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(614) IOException local614) {
			try {
				this.aClass160_2.method15549((short) 949);
			} catch (@Pc(620) Exception local620) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
			return this.method10767((byte) 55) == 0 && this.method10766(2042147860) == 0;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ay", descriptor = "(Ljava/lang/Object;Z)V")
	@Override
	public void method10790(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass160_2 != null) {
			try {
				this.aClass160_2.method15549((short) 15043);
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_2 = null;
		}
		this.aClass160_2 = (Class160) arg0;
		this.method10805((byte) 87);
		this.method10771(arg1, (byte) 82);
		this.aClass80_Sub36_7.anInt3152 = 0;
		this.aClass80_Sub36_5.anInt3152 = 0;
		this.aClass80_Sub1_Sub15_Sub3_2 = null;
		while (true) {
			@Pc(40) Class80_Sub1_Sub15_Sub3 local40 = (Class80_Sub1_Sub15_Sub3) this.aClass3_6.method67(1824977122);
			if (local40 == null) {
				while (true) {
					local40 = (Class80_Sub1_Sub15_Sub3) this.aClass3_8.method67(-388870622);
					if (local40 == null) {
						if (this.aByte19 != 0) {
							try {
								this.aClass80_Sub36_6.anInt3152 = 0;
								this.aClass80_Sub36_6.method23154(4, 1275868335);
								this.aClass80_Sub36_6.method23154(this.aByte19, 1275868335);
								this.aClass80_Sub36_6.method23345(0, (byte) 52);
								this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass160_2.method15549((short) -11194);
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass160_2 = null;
								this.anInt1250 += 587474147;
								this.anInt1251 = 398709798;
							}
						}
						this.anInt1249 = 0;
						this.aLong42 = Class303.method27111((byte) 74) * -5583368868183688057L;
						return;
					}
					local40.aClass80_Sub36_13 = null;
					this.aClass3_7.method42(local40, 1599142138);
				}
			}
			local40.aClass80_Sub36_13 = null;
			this.aClass3_9.method42(local40, 1599142138);
		}
	}

	@OriginalMember(owner = "client!aif", name = "af", descriptor = "()V")
	@Override
	public void method10789() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "aq", descriptor = "(Z)V")
	@Override
	public void method10792(@OriginalArg(0) boolean arg0) {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(arg0 ? 2 : 3, 1275868335);
			this.aClass80_Sub36_6.method23282(0L);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass160_2.method15549((short) 16490);
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ao", descriptor = "(Z)V")
	@Override
	public void method10793(@OriginalArg(0) boolean arg0) {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(arg0 ? 2 : 3, 1275868335);
			this.aClass80_Sub36_6.method23282(0L);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass160_2.method15549((short) 3784);
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "aj", descriptor = "()V")
	@Override
	public void method10765() {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(7, 1275868335);
			this.aClass80_Sub36_6.method23282(0L);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_2.method15549((short) 6196);
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "o", descriptor = "(ZB)V")
	@Override
	public void method10771(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(arg0 ? 2 : 3, 1275868335);
			this.aClass80_Sub36_6.method23282(0L);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass160_2.method15549((short) 7535);
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ag", descriptor = "()V")
	@Override
	public void method10778() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "ab", descriptor = "()V")
	@Override
	public void method10796() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "al", descriptor = "()V")
	@Override
	public void method10801() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "g", descriptor = "(III)V")
	@Override
	void method10768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.aClass160_2.method15549((short) -2186);
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_2 = null;
		this.anInt1250 += 587474147;
		this.anInt1251 = -1948128749;
		this.aByte19 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1252 = arg0 * 644123047;
		this.anInt1253 = arg1 * 975887797;
	}

	@OriginalMember(owner = "client!aif", name = "ac", descriptor = "()V")
	@Override
	public void method10762() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "av", descriptor = "()V")
	void method10806() {
		if (this.aClass160_2 == null) {
			return;
		}
		try {
			this.aClass80_Sub36_6.anInt3152 = 0;
			this.aClass80_Sub36_6.method23154(6, 1275868335);
			this.aClass80_Sub36_6.method23157(4, 1814647235);
			this.aClass80_Sub36_6.method23155(0, (byte) -52);
			this.aClass160_2.method15548(this.aClass80_Sub36_6.aByteArray61, 0, this.aClass80_Sub36_6.aByteArray61.length, 779552044);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_2.method15549((short) 1056);
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_2 = null;
			this.anInt1250 += 587474147;
			this.anInt1251 = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "s", descriptor = "(I)V")
	@Override
	public void method10774(@OriginalArg(0) int arg0) {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "ak", descriptor = "()V")
	@Override
	public void method10776() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15549((short) 14993);
		}
	}

	@OriginalMember(owner = "client!aif", name = "at", descriptor = "()V")
	@Override
	public void method10802() {
		if (this.aClass160_2 != null) {
			this.aClass160_2.method15549((short) -7658);
		}
	}
}
