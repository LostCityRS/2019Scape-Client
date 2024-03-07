package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aik")
public class Class144_Sub1 extends Class144 {

	@OriginalMember(owner = "client!aik", name = "gx", descriptor = "Lclient!py;")
	public static Class497 aClass497_42;

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "Lclient!uz;")
	Class160 aClass160_1;

	@OriginalMember(owner = "client!aik", name = "q", descriptor = "(II)V", line = 13)
	@Override
	void method11169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_1.method14722(377036493);
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_1 = null;
		this.anInt1338 += 70225315;
		this.anInt1337 = 697773497;
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1340 = arg0 * -2057883105;
		this.anInt1339 = arg1 * -1058402615;
	}

	@OriginalMember(owner = "client!aik", name = "x", descriptor = "(II)V", line = 13)
	@Override
	void method11166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_1.method14722(-903523020);
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_1 = null;
		this.anInt1338 += 70225315;
		this.anInt1337 = 697773497;
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1340 = arg0 * -2057883105;
		this.anInt1339 = arg1 * -1058402615;
	}

	@OriginalMember(owner = "client!aik", name = "w", descriptor = "(IIB)V", line = 13)
	@Override
	void method11163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.aClass160_1.method14722(1700912090);
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_1 = null;
		this.anInt1338 += 70225315;
		this.anInt1337 = 697773497;
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1340 = arg0 * -2057883105;
		this.anInt1339 = arg1 * -1058402615;
	}

	@OriginalMember(owner = "client!aik", name = "l", descriptor = "(I)Z", line = 25)
	@Override
	public boolean method11164(@OriginalArg(0) int arg0) {
		@Pc(14) int local14;
		if (this.aClass160_1 != null) {
			@Pc(6) long local6 = Class305.method26797(1934196852);
			local14 = (int) (local6 - this.aLong45 * -1879205428230144291L);
			this.aLong45 = local6 * 416383678038968693L;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1331 += local14 * 2082734059;
			if (this.anInt1331 * 63451331 > 30000) {
				try {
					this.aClass160_1.method14722(-935183380);
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass160_1 = null;
			}
		}
		if (this.aClass160_1 == null) {
			return this.method11152(2095340826) == 0 && this.method11150(299866863) == 0;
		}
		try {
			@Pc(69) Class93_Sub1_Sub16_Sub3 local69;
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method256(-1003169474); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method264(870914263)) {
				this.aPacket_5.pos = 0;
				this.aPacket_5.p1(1, (byte) -31);
				this.aPacket_5.p5(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -1262452370);
				this.aClass18_9.method250(local69, -88321680);
			}
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method256(1541395074); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method264(-373647470)) {
				this.aPacket_5.pos = 0;
				this.aPacket_5.p1(0, (byte) -72);
				this.aPacket_5.p5(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -1461410419);
				this.aClass18_6.method250(local69, 2091380680);
			}
			for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
				@Pc(170) int local170 = this.aClass160_1.method14732((byte) 81);
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt1331 = 0;
				@Pc(219) int local219;
				@Pc(272) int local272;
				if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
					local14 = 5 - this.aPacket_6.pos * 212851357;
					if (local14 > local170) {
						local14 = local170;
					}
					this.aClass160_1.read(this.aPacket_6.data, this.aPacket_6.pos * 212851357, local14, (byte) -99);
					if (this.aByte22 != 0 && client.ENABLE_JS5_XOR) {
						for (local219 = 0; local219 < local14; local219++) {
							this.aPacket_6.data[this.aPacket_6.pos * 212851357 + local219] ^= this.aByte22;
						}
					}
					this.aPacket_6.pos += local14 * -1445626955;
					if (this.aPacket_6.pos * 212851357 >= 5) {
						this.aPacket_6.pos = 0;
						local219 = this.aPacket_6.g1((short) 16384);
						local272 = this.aPacket_6.g4(-118643075);
						@Pc(280) boolean local280 = (local272 & Integer.MIN_VALUE) != 0;
						@Pc(284) int local284 = local272 & Integer.MAX_VALUE;
						@Pc(292) long local292 = (long) local284 + ((long) local219 << 32);
						@Pc(298) Iterator local298;
						@Pc(305) Class93_Sub1_Sub16_Sub3 local305;
						if (local280) {
							local298 = this.aClass18_6.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local305.aLong233 * -5980455722457358841L == local292) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						} else {
							local298 = this.aClass18_9.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local292 == local305.aLong233 * -5980455722457358841L) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						}
						if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1342 = -1763880151;
						this.aPacket_6.pos = 0;
						this.aPacket_7.pos = 0;
					}
				} else {
					@Pc(365) Packet local365 = this.aClass93_Sub1_Sub16_Sub3_2.aPacket_13;
					@Pc(454) int local454;
					if (local365 == null) {
						local219 = 5 - this.aPacket_7.pos * 212851357;
						if (local219 > local170) {
							local219 = local170;
						}
						this.aClass160_1.read(this.aPacket_7.data, this.aPacket_7.pos * 212851357, local219, (byte) -29);
						if (this.aByte22 != 0 && client.ENABLE_JS5_XOR) {
							for (local272 = 0; local272 < local219; local272++) {
								this.aPacket_7.data[this.aPacket_7.pos * 212851357 + local272] ^= this.aByte22;
							}
						}
						this.aPacket_7.pos += local219 * -1445626955;
						if (this.aPacket_7.pos * 212851357 >= 5) {
							this.aPacket_7.pos = 0;
							local272 = this.aPacket_7.g1((short) 16384);
							local454 = this.aPacket_7.g4(-118643075);
							@Pc(456) byte local456 = 5;
							if (local272 != Class484.aClass484_5.getId()) {
								local456 = 9;
							}
							local365 = this.aClass93_Sub1_Sub16_Sub3_2.aPacket_13 = new Packet(this.aClass93_Sub1_Sub16_Sub3_2.aByte93 + local454 + local456);
							local365.p1(local272, (byte) -81);
							local365.p4(local454, (byte) -37);
							this.anInt1342 += -1763880151;
						}
					} else {
						local219 = local365.data.length - this.aClass93_Sub1_Sub16_Sub3_2.aByte93;
						local272 = 102400 - this.anInt1342 * -997925507;
						if (local272 > local219 - local365.pos * 212851357) {
							local272 = local219 - local365.pos * 212851357;
						}
						if (local272 > local170) {
							local272 = local170;
						}
						this.aClass160_1.read(local365.data, local365.pos * 212851357, local272, (byte) -76);
						if (this.aByte22 != 0 && client.ENABLE_JS5_XOR) {
							for (local454 = 0; local454 < local272; local454++) {
								local365.data[local454 + local365.pos * 212851357] ^= this.aByte22;
							}
						}
						local365.pos += local272 * -1445626955;
						this.anInt1342 += local272 * 506217429;
						if (local219 == local365.pos * 212851357) {
							this.aClass93_Sub1_Sub16_Sub3_2.method23976((short) 1784);
							this.aClass93_Sub1_Sub16_Sub3_2.aBoolean546 = false;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						} else if (this.anInt1342 * -997925507 == 102400) {
							this.anInt1342 = 0;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass160_1.method14722(-894705198);
			} catch (@Pc(622) Exception local622) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
			return this.method11152(2033162203) == 0 && this.method11150(299866863) == 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "b", descriptor = "()Z", line = 25)
	@Override
	public boolean method11170() {
		@Pc(14) int local14;
		if (this.aClass160_1 != null) {
			@Pc(6) long local6 = Class305.method26797(724187755);
			local14 = (int) (local6 - this.aLong45 * -1879205428230144291L);
			this.aLong45 = local6 * 416383678038968693L;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1331 += local14 * 2082734059;
			if (this.anInt1331 * 63451331 > 30000) {
				try {
					this.aClass160_1.method14722(298043964);
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass160_1 = null;
			}
		}
		if (this.aClass160_1 == null) {
			return this.method11152(2118431324) == 0 && this.method11150(299866863) == 0;
		}
		try {
			@Pc(69) Class93_Sub1_Sub16_Sub3 local69;
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method256(-2095331395); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method264(1966968899)) {
				this.aPacket_5.pos = 0;
				this.aPacket_5.p1(1, (byte) -13);
				this.aPacket_5.p5(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -155017632);
				this.aClass18_9.method250(local69, -261723447);
			}
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method256(-737906607); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method264(-99442777)) {
				this.aPacket_5.pos = 0;
				this.aPacket_5.p1(0, (byte) -102);
				this.aPacket_5.p5(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -190962112);
				this.aClass18_6.method250(local69, 1946195344);
			}
			for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
				@Pc(170) int local170 = this.aClass160_1.method14732((byte) 107);
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt1331 = 0;
				@Pc(219) int local219;
				@Pc(272) int local272;
				if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
					local14 = 5 - this.aPacket_6.pos * 212851357;
					if (local14 > local170) {
						local14 = local170;
					}
					this.aClass160_1.read(this.aPacket_6.data, this.aPacket_6.pos * 212851357, local14, (byte) -16);
					if (this.aByte22 != 0) {
						for (local219 = 0; local219 < local14; local219++) {
							this.aPacket_6.data[this.aPacket_6.pos * 212851357 + local219] ^= this.aByte22;
						}
					}
					this.aPacket_6.pos += local14 * -1445626955;
					if (this.aPacket_6.pos * 212851357 >= 5) {
						this.aPacket_6.pos = 0;
						local219 = this.aPacket_6.g1((short) 16384);
						local272 = this.aPacket_6.g4(-118643075);
						@Pc(280) boolean local280 = (local272 & Integer.MIN_VALUE) != 0;
						@Pc(284) int local284 = local272 & Integer.MAX_VALUE;
						@Pc(292) long local292 = (long) local284 + ((long) local219 << 32);
						@Pc(298) Iterator local298;
						@Pc(305) Class93_Sub1_Sub16_Sub3 local305;
						if (local280) {
							local298 = this.aClass18_6.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local305.aLong233 * -5980455722457358841L == local292) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						} else {
							local298 = this.aClass18_9.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local292 == local305.aLong233 * -5980455722457358841L) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						}
						if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1342 = -1763880151;
						this.aPacket_6.pos = 0;
						this.aPacket_7.pos = 0;
					}
				} else {
					@Pc(365) Packet local365 = this.aClass93_Sub1_Sub16_Sub3_2.aPacket_13;
					@Pc(454) int local454;
					if (local365 == null) {
						local219 = 5 - this.aPacket_7.pos * 212851357;
						if (local219 > local170) {
							local219 = local170;
						}
						this.aClass160_1.read(this.aPacket_7.data, this.aPacket_7.pos * 212851357, local219, (byte) -93);
						if (this.aByte22 != 0) {
							for (local272 = 0; local272 < local219; local272++) {
								this.aPacket_7.data[this.aPacket_7.pos * 212851357 + local272] ^= this.aByte22;
							}
						}
						this.aPacket_7.pos += local219 * -1445626955;
						if (this.aPacket_7.pos * 212851357 >= 5) {
							this.aPacket_7.pos = 0;
							local272 = this.aPacket_7.g1((short) 16384);
							local454 = this.aPacket_7.g4(-118643075);
							@Pc(456) byte local456 = 5;
							if (local272 != Class484.aClass484_5.getId()) {
								local456 = 9;
							}
							local365 = this.aClass93_Sub1_Sub16_Sub3_2.aPacket_13 = new Packet(this.aClass93_Sub1_Sub16_Sub3_2.aByte93 + local454 + local456);
							local365.p1(local272, (byte) -91);
							local365.p4(local454, (byte) -46);
							this.anInt1342 += -1763880151;
						}
					} else {
						local219 = local365.data.length - this.aClass93_Sub1_Sub16_Sub3_2.aByte93;
						local272 = 102400 - this.anInt1342 * -997925507;
						if (local272 > local219 - local365.pos * 212851357) {
							local272 = local219 - local365.pos * 212851357;
						}
						if (local272 > local170) {
							local272 = local170;
						}
						this.aClass160_1.read(local365.data, local365.pos * 212851357, local272, (byte) -59);
						if (this.aByte22 != 0) {
							for (local454 = 0; local454 < local272; local454++) {
								local365.data[local454 + local365.pos * 212851357] ^= this.aByte22;
							}
						}
						local365.pos += local272 * -1445626955;
						this.anInt1342 += local272 * 506217429;
						if (local219 == local365.pos * 212851357) {
							this.aClass93_Sub1_Sub16_Sub3_2.method23976((short) -28284);
							this.aClass93_Sub1_Sub16_Sub3_2.aBoolean546 = false;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						} else if (this.anInt1342 * -997925507 == 102400) {
							this.anInt1342 = 0;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass160_1.method14722(148032247);
			} catch (@Pc(622) Exception local622) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
			return this.method11152(2054106209) == 0 && this.method11150(299866863) == 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "u", descriptor = "(Ljava/lang/Object;ZI)V", line = 166)
	@Override
	public void method11165(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.aClass160_1 != null) {
			try {
				this.aClass160_1.method14722(1241662201);
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_1 = null;
		}
		this.aClass160_1 = (Class160) arg0;
		this.method11181(933035514);
		this.method11161(arg1, 306038414);
		this.aPacket_6.pos = 0;
		this.aPacket_7.pos = 0;
		this.aClass93_Sub1_Sub16_Sub3_2 = null;
		while (true) {
			@Pc(40) Class93_Sub1_Sub16_Sub3 local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_9.method254((byte) 8);
			if (local40 == null) {
				while (true) {
					local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_6.method254((byte) 8);
					if (local40 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aPacket_5.pos = 0;
								this.aPacket_5.p1(4, (byte) -72);
								this.aPacket_5.p1(this.aByte22, (byte) -45);
								this.aPacket_5.p4(0, (byte) 97);
								this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 966701339);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass160_1.method14722(-1005672747);
								} catch (@Pc(116) Exception local116) {
								}
								this.aClass160_1 = null;
								this.anInt1338 += 70225315;
								this.anInt1337 = 1395546994;
							}
						}
						this.anInt1331 = 0;
						this.aLong45 = Class305.method26797(1946823292) * 416383678038968693L;
						return;
					}
					local40.aPacket_13 = null;
					this.aClass18_8.method250(local40, 1550396304);
				}
			}
			local40.aPacket_13 = null;
			this.aClass18_7.method250(local40, -252192542);
		}
	}

	@OriginalMember(owner = "client!aik", name = "h", descriptor = "(Ljava/lang/Object;Z)V", line = 166)
	@Override
	public void method11171(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass160_1 != null) {
			try {
				this.aClass160_1.method14722(-1860143988);
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_1 = null;
		}
		this.aClass160_1 = (Class160) arg0;
		this.method11181(237520914);
		this.method11161(arg1, -312425501);
		this.aPacket_6.pos = 0;
		this.aPacket_7.pos = 0;
		this.aClass93_Sub1_Sub16_Sub3_2 = null;
		while (true) {
			@Pc(40) Class93_Sub1_Sub16_Sub3 local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_9.method254((byte) 8);
			if (local40 == null) {
				while (true) {
					local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_6.method254((byte) 8);
					if (local40 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aPacket_5.pos = 0;
								this.aPacket_5.p1(4, (byte) -30);
								this.aPacket_5.p1(this.aByte22, (byte) -73);
								this.aPacket_5.p4(0, (byte) -17);
								this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 1686654210);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass160_1.method14722(-907149367);
								} catch (@Pc(116) Exception local116) {
								}
								this.aClass160_1 = null;
								this.anInt1338 += 70225315;
								this.anInt1337 = 1395546994;
							}
						}
						this.anInt1331 = 0;
						this.aLong45 = Class305.method26797(855699059) * 416383678038968693L;
						return;
					}
					local40.aPacket_13 = null;
					this.aClass18_8.method250(local40, 1312604320);
				}
			}
			local40.aPacket_13 = null;
			this.aClass18_7.method250(local40, 1996659631);
		}
	}

	@OriginalMember(owner = "client!aik", name = "ac", descriptor = "(I)V", line = 214)
	void method11181(@OriginalArg(0) int arg0) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(6, (byte) -118);
			this.aPacket_5.p3(4, (byte) 79);
			this.aPacket_5.p2(0, 2144257347);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 1140805449);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14722(-97025562);
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "ai", descriptor = "()V", line = 214)
	void method11182() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(6, (byte) -5);
			this.aPacket_5.p3(4, (byte) 76);
			this.aPacket_5.p2(0, 2143299554);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -296100619);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14722(-1212249344);
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "aw", descriptor = "()V", line = 214)
	void method11183() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(6, (byte) -34);
			this.aPacket_5.p3(4, (byte) 33);
			this.aPacket_5.p2(0, 2130208905);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -27219949);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14722(716199638);
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "as", descriptor = "()V", line = 214)
	void method11184() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(6, (byte) -23);
			this.aPacket_5.p3(4, (byte) 15);
			this.aPacket_5.p2(0, 2141522626);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 933949781);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14722(-2119038112);
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "a", descriptor = "(Z)V", line = 234)
	@Override
	public void method11172(@OriginalArg(0) boolean arg0) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(arg0 ? 2 : 3, (byte) -36);
			this.aPacket_5.p5(0L);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 325634035);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass160_1.method14722(-1488094922);
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "z", descriptor = "(ZI)V", line = 234)
	@Override
	public void method11161(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(arg0 ? 2 : 3, (byte) -18);
			this.aPacket_5.p5(0L);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -873286406);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass160_1.method14722(1681088427);
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "i", descriptor = "()V", line = 253)
	@Override
	public void method11174() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(7, (byte) -27);
			this.aPacket_5.p5(0L);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, -1178441874);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_1.method14722(-1285748325);
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "p", descriptor = "(I)V", line = 253)
	@Override
	public void method11162(@OriginalArg(0) int arg0) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(7, (byte) -60);
			this.aPacket_5.p5(0L);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 408265767);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_1.method14722(1971212323);
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "()V", line = 253)
	@Override
	public void method11173() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aPacket_5.pos = 0;
			this.aPacket_5.p1(7, (byte) -69);
			this.aPacket_5.p5(0L);
			this.aClass160_1.method14721(this.aPacket_5.data, 0, this.aPacket_5.data.length, 1791224245);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_1.method14722(-1959582892);
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "d", descriptor = "(I)V", line = 272)
	@Override
	public void method11167(@OriginalArg(0) int arg0) {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14722(255487577);
		}
	}

	@OriginalMember(owner = "client!aik", name = "ae", descriptor = "()V", line = 272)
	@Override
	public void method11177() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14722(-2111152602);
		}
	}

	@OriginalMember(owner = "client!aik", name = "t", descriptor = "()V", line = 272)
	@Override
	public void method11168() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14722(1432355474);
		}
	}

	@OriginalMember(owner = "client!aik", name = "j", descriptor = "()V", line = 272)
	@Override
	public void method11175() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14722(1786526677);
		}
	}

	@OriginalMember(owner = "client!aik", name = "ag", descriptor = "()V", line = 276)
	@Override
	public void method11178() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14723(-1453926679);
		}
	}

	@OriginalMember(owner = "client!aik", name = "ah", descriptor = "()V", line = 276)
	@Override
	public void method11179() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14723(-1453926679);
		}
	}

	@OriginalMember(owner = "client!aik", name = "c", descriptor = "(I)V", line = 276)
	@Override
	public void method11176(@OriginalArg(0) int arg0) {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14723(-1453926679);
		}
	}

	@OriginalMember(owner = "client!aik", name = "al", descriptor = "()V", line = 276)
	@Override
	public void method11180() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14723(-1453926679);
		}
	}

	@OriginalMember(owner = "client!aik", name = "aec", descriptor = "(Lclient!yf;I)V", line = 10347)
	static final void method11185(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 | local23;
	}
}
