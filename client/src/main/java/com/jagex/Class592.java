package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.IOException;

@OriginalClass("client!uf")
public final class Class592 {

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "[B")
	static byte[] aByteArray105 = new byte[520];

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!abj;")
	Class36 aClass36_8 = null;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!abj;")
	Class36 aClass36_7 = null;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	int anInt5317 = -1006841224;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	int anInt5318;

	@OriginalMember(owner = "client!uf", name = "og", descriptor = "(Lclient!yp;I)V")
	static void method31944(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2064497489);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class704.method37125(local16, local22, arg0, -1251770669);
	}

	@OriginalMember(owner = "client!uf", name = "agp", descriptor = "(Lclient!yp;I)V")
	static void method31945(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, 1061400805)).aString5;
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILclient!abj;Lclient!abj;I)V")
	public Class592(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) int arg3) {
		this.anInt5318 = arg0 * 191628989;
		this.aClass36_8 = arg1;
		this.aClass36_7 = arg2;
		this.anInt5317 = arg3 * 660352251;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I[BIZI)Z")
	boolean method31927(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass36_7.method761(436792651) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass36_7.method762((long) (arg0 * 6));
					this.aClass36_7.method765(aByteArray105, 0, 6, (byte) -37);
					local58 = ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16) + (aByteArray105[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass36_8.method761(1694658223) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass36_8.method761(-1976921551) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray105[0] = (byte) (arg2 >> 16);
				aByteArray105[1] = (byte) (arg2 >> 8);
				aByteArray105[2] = (byte) arg2;
				aByteArray105[3] = (byte) (local58 >> 16);
				aByteArray105[4] = (byte) (local58 >> 8);
				aByteArray105[5] = (byte) local58;
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method767(aByteArray105, 0, 6, (byte) 82);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass36_8.method762((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 10, (byte) -62);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16);
									local215 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
									local149 = (aByteArray105[8] & 0xFF) + ((aByteArray105[7] & 0xFF) << 8) + ((aByteArray105[6] & 0xFF) << 16);
									local243 = aByteArray105[9] & 0xFF;
								} else {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 8, (byte) -36);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
									local215 = ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
									local149 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
									local243 = aByteArray105[7] & 0xFF;
								}
								if (arg0 != local201 || local144 != local215 || this.anInt5318 * -1652841323 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass36_8.method761(-1610726781) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass36_8.method761(1496603579) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 24);
								aByteArray105[1] = (byte) (arg0 >> 16);
								aByteArray105[2] = (byte) (arg0 >> 8);
								aByteArray105[3] = (byte) arg0;
								aByteArray105[4] = (byte) (local144 >> 8);
								aByteArray105[5] = (byte) local144;
								aByteArray105[6] = (byte) (local149 >> 16);
								aByteArray105[7] = (byte) (local149 >> 8);
								aByteArray105[8] = (byte) local149;
								aByteArray105[9] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 10, (byte) 34);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 35);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 8);
								aByteArray105[1] = (byte) arg0;
								aByteArray105[2] = (byte) (local144 >> 8);
								aByteArray105[3] = (byte) local144;
								aByteArray105[4] = (byte) (local149 >> 16);
								aByteArray105[5] = (byte) (local149 >> 8);
								aByteArray105[6] = (byte) local149;
								aByteArray105[7] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 8, (byte) 118);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 100);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "(I[BIZ)Z")
	boolean method31928(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass36_7.method761(1206150223) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass36_7.method762((long) (arg0 * 6));
					this.aClass36_7.method765(aByteArray105, 0, 6, (byte) 103);
					local58 = ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16) + (aByteArray105[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass36_8.method761(1773266680) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass36_8.method761(-2065482682) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray105[0] = (byte) (arg2 >> 16);
				aByteArray105[1] = (byte) (arg2 >> 8);
				aByteArray105[2] = (byte) arg2;
				aByteArray105[3] = (byte) (local58 >> 16);
				aByteArray105[4] = (byte) (local58 >> 8);
				aByteArray105[5] = (byte) local58;
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method767(aByteArray105, 0, 6, (byte) 69);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass36_8.method762((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 10, (byte) -19);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16);
									local215 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
									local149 = (aByteArray105[8] & 0xFF) + ((aByteArray105[7] & 0xFF) << 8) + ((aByteArray105[6] & 0xFF) << 16);
									local243 = aByteArray105[9] & 0xFF;
								} else {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 8, (byte) 99);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
									local215 = ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
									local149 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
									local243 = aByteArray105[7] & 0xFF;
								}
								if (arg0 != local201 || local144 != local215 || this.anInt5318 * -1652841323 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass36_8.method761(-1402799380) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass36_8.method761(-1807109456) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 24);
								aByteArray105[1] = (byte) (arg0 >> 16);
								aByteArray105[2] = (byte) (arg0 >> 8);
								aByteArray105[3] = (byte) arg0;
								aByteArray105[4] = (byte) (local144 >> 8);
								aByteArray105[5] = (byte) local144;
								aByteArray105[6] = (byte) (local149 >> 16);
								aByteArray105[7] = (byte) (local149 >> 8);
								aByteArray105[8] = (byte) local149;
								aByteArray105[9] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 10, (byte) 127);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 27);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 8);
								aByteArray105[1] = (byte) arg0;
								aByteArray105[2] = (byte) (local144 >> 8);
								aByteArray105[3] = (byte) local144;
								aByteArray105[4] = (byte) (local149 >> 16);
								aByteArray105[5] = (byte) (local149 >> 8);
								aByteArray105[6] = (byte) local149;
								aByteArray105[7] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 8, (byte) 65);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 14);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "(I[BI)Z")
	public boolean method31929(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			if (arg2 < 0 || arg2 > this.anInt5317 * -664338893) {
				throw new IllegalArgumentException("" + this.anInt5318 * -1652841323 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31927(arg0, arg1, arg2, true, 1769440947);
			if (!local43) {
				local43 = this.method31927(arg0, arg1, arg2, false, -258106521);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "" + this.anInt5318 * -1652841323;
	}

	@OriginalMember(owner = "client!uf", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method31930() {
		return "" + this.anInt5318 * -1652841323;
	}

	@OriginalMember(owner = "client!uf", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method31931() {
		return "" + this.anInt5318 * -1652841323;
	}

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "(I)[B")
	public byte[] method31932(@OriginalArg(0) int arg0) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			@Pc(17) Object local17;
			try {
				if (this.aClass36_7.method761(-1113865262) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method765(aByteArray105, 0, 6, (byte) 47);
				@Pc(56) int local56 = (aByteArray105[2] & 0xFF) + ((aByteArray105[1] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 16);
				@Pc(78) int local78 = (aByteArray105[5] & 0xFF) + ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16);
				if (local56 < 0 || local56 > this.anInt5317 * -664338893) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass36_8.method761(-879204466) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass36_8.method762((long) local78 * 520L);
						@Pc(134) int local134 = local56 - local111;
						@Pc(183) int local183;
						@Pc(197) int local197;
						@Pc(219) int local219;
						@Pc(225) int local225;
						@Pc(144) byte local144;
						if (arg0 > 65535) {
							if (local134 > 510) {
								local134 = 510;
							}
							local144 = 10;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) -42);
							local183 = ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16) + ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
							local197 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
							local219 = (aByteArray105[8] & 0xFF) + ((aByteArray105[6] & 0xFF) << 16) + ((aByteArray105[7] & 0xFF) << 8);
							local225 = aByteArray105[9] & 0xFF;
						} else {
							if (local134 > 512) {
								local134 = 512;
							}
							local144 = 8;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) 81);
							local183 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
							local197 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8);
							local219 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
							local225 = aByteArray105[7] & 0xFF;
						}
						if (arg0 == local183 && local113 == local197 && this.anInt5318 * -1652841323 == local225) {
							if (local219 >= 0 && (long) local219 <= this.aClass36_8.method761(-1388852126) / 520L) {
								@Pc(334) int local334 = local134 + local144;
								for (@Pc(336) int local336 = local144; local336 < local334; local336++) {
									local109[local111++] = aByteArray105[local336];
								}
								local78 = local219;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(353) byte[] local353 = local109;
					return local353;
				}
				local17 = null;
			} catch (@Pc(357) IOException local357) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "(I)[B")
	public byte[] method31933(@OriginalArg(0) int arg0) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			@Pc(17) Object local17;
			try {
				if (this.aClass36_7.method761(331606267) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method765(aByteArray105, 0, 6, (byte) 93);
				@Pc(56) int local56 = (aByteArray105[2] & 0xFF) + ((aByteArray105[1] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 16);
				@Pc(78) int local78 = (aByteArray105[5] & 0xFF) + ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16);
				if (local56 < 0 || local56 > this.anInt5317 * -664338893) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass36_8.method761(425942793) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass36_8.method762((long) local78 * 520L);
						@Pc(134) int local134 = local56 - local111;
						@Pc(183) int local183;
						@Pc(197) int local197;
						@Pc(219) int local219;
						@Pc(225) int local225;
						@Pc(144) byte local144;
						if (arg0 > 65535) {
							if (local134 > 510) {
								local134 = 510;
							}
							local144 = 10;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) -54);
							local183 = ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16) + ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
							local197 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
							local219 = (aByteArray105[8] & 0xFF) + ((aByteArray105[6] & 0xFF) << 16) + ((aByteArray105[7] & 0xFF) << 8);
							local225 = aByteArray105[9] & 0xFF;
						} else {
							if (local134 > 512) {
								local134 = 512;
							}
							local144 = 8;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) 9);
							local183 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
							local197 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8);
							local219 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
							local225 = aByteArray105[7] & 0xFF;
						}
						if (arg0 == local183 && local113 == local197 && this.anInt5318 * -1652841323 == local225) {
							if (local219 >= 0 && (long) local219 <= this.aClass36_8.method761(-310164997) / 520L) {
								@Pc(334) int local334 = local134 + local144;
								for (@Pc(336) int local336 = local144; local336 < local334; local336++) {
									local109[local111++] = aByteArray105[local336];
								}
								local78 = local219;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(353) byte[] local353 = local109;
					return local353;
				}
				local17 = null;
			} catch (@Pc(357) IOException local357) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "(I[BIZ)Z")
	boolean method31934(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass36_7.method761(-214560666) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass36_7.method762((long) (arg0 * 6));
					this.aClass36_7.method765(aByteArray105, 0, 6, (byte) -23);
					local58 = ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16) + (aByteArray105[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass36_8.method761(1898412293) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass36_8.method761(1767700286) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray105[0] = (byte) (arg2 >> 16);
				aByteArray105[1] = (byte) (arg2 >> 8);
				aByteArray105[2] = (byte) arg2;
				aByteArray105[3] = (byte) (local58 >> 16);
				aByteArray105[4] = (byte) (local58 >> 8);
				aByteArray105[5] = (byte) local58;
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method767(aByteArray105, 0, 6, (byte) 121);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass36_8.method762((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 10, (byte) -14);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16);
									local215 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
									local149 = (aByteArray105[8] & 0xFF) + ((aByteArray105[7] & 0xFF) << 8) + ((aByteArray105[6] & 0xFF) << 16);
									local243 = aByteArray105[9] & 0xFF;
								} else {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 8, (byte) 20);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
									local215 = ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
									local149 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
									local243 = aByteArray105[7] & 0xFF;
								}
								if (arg0 != local201 || local144 != local215 || this.anInt5318 * -1652841323 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass36_8.method761(-1115738197) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass36_8.method761(2026337020) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 24);
								aByteArray105[1] = (byte) (arg0 >> 16);
								aByteArray105[2] = (byte) (arg0 >> 8);
								aByteArray105[3] = (byte) arg0;
								aByteArray105[4] = (byte) (local144 >> 8);
								aByteArray105[5] = (byte) local144;
								aByteArray105[6] = (byte) (local149 >> 16);
								aByteArray105[7] = (byte) (local149 >> 8);
								aByteArray105[8] = (byte) local149;
								aByteArray105[9] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 10, (byte) 8);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 72);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 8);
								aByteArray105[1] = (byte) arg0;
								aByteArray105[2] = (byte) (local144 >> 8);
								aByteArray105[3] = (byte) local144;
								aByteArray105[4] = (byte) (local149 >> 16);
								aByteArray105[5] = (byte) (local149 >> 8);
								aByteArray105[6] = (byte) local149;
								aByteArray105[7] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 8, (byte) 54);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 70);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "(I[BI)Z")
	public boolean method31935(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			if (arg2 < 0 || arg2 > this.anInt5317 * -664338893) {
				throw new IllegalArgumentException("" + this.anInt5318 * -1652841323 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31927(arg0, arg1, arg2, true, -997494760);
			if (!local43) {
				local43 = this.method31927(arg0, arg1, arg2, false, -1534391452);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "(I[BI)Z")
	public boolean method31936(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			if (arg2 < 0 || arg2 > this.anInt5317 * -664338893) {
				throw new IllegalArgumentException("" + this.anInt5318 * -1652841323 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31927(arg0, arg1, arg2, true, -1262694904);
			if (!local43) {
				local43 = this.method31927(arg0, arg1, arg2, false, -1042293910);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "(I[BI)Z")
	public boolean method31937(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			if (arg2 < 0 || arg2 > this.anInt5317 * -664338893) {
				throw new IllegalArgumentException("" + this.anInt5318 * -1652841323 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31927(arg0, arg1, arg2, true, -1111594652);
			if (!local43) {
				local43 = this.method31927(arg0, arg1, arg2, false, 1459871607);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I[BIB)Z")
	public boolean method31938(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			if (arg2 < 0 || arg2 > this.anInt5317 * -664338893) {
				throw new IllegalArgumentException("" + this.anInt5318 * -1652841323 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31927(arg0, arg1, arg2, true, 116947979);
			if (!local43) {
				local43 = this.method31927(arg0, arg1, arg2, false, -1810597736);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BI)Z")
	public boolean method31939(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			if (arg2 < 0 || arg2 > this.anInt5317 * -664338893) {
				throw new IllegalArgumentException("" + this.anInt5318 * -1652841323 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31927(arg0, arg1, arg2, true, 900253398);
			if (!local43) {
				local43 = this.method31927(arg0, arg1, arg2, false, 16106481);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "(I[BIZ)Z")
	boolean method31940(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass36_7.method761(-1022355067) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass36_7.method762((long) (arg0 * 6));
					this.aClass36_7.method765(aByteArray105, 0, 6, (byte) -106);
					local58 = ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16) + (aByteArray105[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass36_8.method761(-1952004852) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass36_8.method761(1210946829) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray105[0] = (byte) (arg2 >> 16);
				aByteArray105[1] = (byte) (arg2 >> 8);
				aByteArray105[2] = (byte) arg2;
				aByteArray105[3] = (byte) (local58 >> 16);
				aByteArray105[4] = (byte) (local58 >> 8);
				aByteArray105[5] = (byte) local58;
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method767(aByteArray105, 0, 6, (byte) 45);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass36_8.method762((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 10, (byte) -20);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16);
									local215 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
									local149 = (aByteArray105[8] & 0xFF) + ((aByteArray105[7] & 0xFF) << 8) + ((aByteArray105[6] & 0xFF) << 16);
									local243 = aByteArray105[9] & 0xFF;
								} else {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 8, (byte) 79);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
									local215 = ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
									local149 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
									local243 = aByteArray105[7] & 0xFF;
								}
								if (arg0 != local201 || local144 != local215 || this.anInt5318 * -1652841323 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass36_8.method761(2125760164) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass36_8.method761(392244041) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 24);
								aByteArray105[1] = (byte) (arg0 >> 16);
								aByteArray105[2] = (byte) (arg0 >> 8);
								aByteArray105[3] = (byte) arg0;
								aByteArray105[4] = (byte) (local144 >> 8);
								aByteArray105[5] = (byte) local144;
								aByteArray105[6] = (byte) (local149 >> 16);
								aByteArray105[7] = (byte) (local149 >> 8);
								aByteArray105[8] = (byte) local149;
								aByteArray105[9] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 10, (byte) 69);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 94);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 8);
								aByteArray105[1] = (byte) arg0;
								aByteArray105[2] = (byte) (local144 >> 8);
								aByteArray105[3] = (byte) local144;
								aByteArray105[4] = (byte) (local149 >> 16);
								aByteArray105[5] = (byte) (local149 >> 8);
								aByteArray105[6] = (byte) local149;
								aByteArray105[7] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 8, (byte) 98);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 79);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)[B")
	public byte[] method31941(@OriginalArg(0) int arg0) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			@Pc(17) Object local17;
			try {
				if (this.aClass36_7.method761(-1293119697) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method765(aByteArray105, 0, 6, (byte) 34);
				@Pc(56) int local56 = (aByteArray105[2] & 0xFF) + ((aByteArray105[1] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 16);
				@Pc(78) int local78 = (aByteArray105[5] & 0xFF) + ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16);
				if (local56 < 0 || local56 > this.anInt5317 * -664338893) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass36_8.method761(-743137969) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass36_8.method762((long) local78 * 520L);
						@Pc(134) int local134 = local56 - local111;
						@Pc(183) int local183;
						@Pc(197) int local197;
						@Pc(219) int local219;
						@Pc(225) int local225;
						@Pc(144) byte local144;
						if (arg0 > 65535) {
							if (local134 > 510) {
								local134 = 510;
							}
							local144 = 10;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) 16);
							local183 = ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16) + ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
							local197 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
							local219 = (aByteArray105[8] & 0xFF) + ((aByteArray105[6] & 0xFF) << 16) + ((aByteArray105[7] & 0xFF) << 8);
							local225 = aByteArray105[9] & 0xFF;
						} else {
							if (local134 > 512) {
								local134 = 512;
							}
							local144 = 8;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) 49);
							local183 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
							local197 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8);
							local219 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
							local225 = aByteArray105[7] & 0xFF;
						}
						if (arg0 == local183 && local113 == local197 && this.anInt5318 * -1652841323 == local225) {
							if (local219 >= 0 && (long) local219 <= this.aClass36_8.method761(925127020) / 520L) {
								@Pc(334) int local334 = local134 + local144;
								for (@Pc(336) int local336 = local144; local336 < local334; local336++) {
									local109[local111++] = aByteArray105[local336];
								}
								local78 = local219;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(353) byte[] local353 = local109;
					return local353;
				}
				local17 = null;
			} catch (@Pc(357) IOException local357) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "(II)[B")
	public byte[] method31942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			@Pc(17) Object local17;
			try {
				if (this.aClass36_7.method761(-2042976489) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method765(aByteArray105, 0, 6, (byte) 96);
				@Pc(56) int local56 = (aByteArray105[2] & 0xFF) + ((aByteArray105[1] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 16);
				@Pc(78) int local78 = (aByteArray105[5] & 0xFF) + ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16);
				if (local56 < 0 || local56 > this.anInt5317 * -664338893) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass36_8.method761(97303786) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass36_8.method762((long) local78 * 520L);
						@Pc(134) int local134 = local56 - local111;
						@Pc(183) int local183;
						@Pc(197) int local197;
						@Pc(219) int local219;
						@Pc(225) int local225;
						@Pc(144) byte local144;
						if (arg0 > 65535) {
							if (local134 > 510) {
								local134 = 510;
							}
							local144 = 10;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) -46);
							local183 = ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16) + ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
							local197 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
							local219 = (aByteArray105[8] & 0xFF) + ((aByteArray105[6] & 0xFF) << 16) + ((aByteArray105[7] & 0xFF) << 8);
							local225 = aByteArray105[9] & 0xFF;
						} else {
							if (local134 > 512) {
								local134 = 512;
							}
							local144 = 8;
							this.aClass36_8.method765(aByteArray105, 0, local134 + local144, (byte) -22);
							local183 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
							local197 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8);
							local219 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
							local225 = aByteArray105[7] & 0xFF;
						}
						if (arg0 == local183 && local113 == local197 && this.anInt5318 * -1652841323 == local225) {
							if (local219 >= 0 && (long) local219 <= this.aClass36_8.method761(1487341826) / 520L) {
								@Pc(334) int local334 = local134 + local144;
								for (@Pc(336) int local336 = local144; local336 < local334; local336++) {
									local109[local111++] = aByteArray105[local336];
								}
								local78 = local219;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(353) byte[] local353 = local109;
					return local353;
				}
				local17 = null;
			} catch (@Pc(357) IOException local357) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "(I[BIZ)Z")
	boolean method31943(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class36 local3 = this.aClass36_8;
		synchronized (this.aClass36_8) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass36_7.method761(-746284122) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass36_7.method762((long) (arg0 * 6));
					this.aClass36_7.method765(aByteArray105, 0, 6, (byte) -80);
					local58 = ((aByteArray105[4] & 0xFF) << 8) + ((aByteArray105[3] & 0xFF) << 16) + (aByteArray105[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass36_8.method761(-477597031) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass36_8.method761(-421558550) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray105[0] = (byte) (arg2 >> 16);
				aByteArray105[1] = (byte) (arg2 >> 8);
				aByteArray105[2] = (byte) arg2;
				aByteArray105[3] = (byte) (local58 >> 16);
				aByteArray105[4] = (byte) (local58 >> 8);
				aByteArray105[5] = (byte) local58;
				this.aClass36_7.method762((long) (arg0 * 6));
				this.aClass36_7.method767(aByteArray105, 0, 6, (byte) 108);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass36_8.method762((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 10, (byte) 77);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = (aByteArray105[3] & 0xFF) + ((aByteArray105[2] & 0xFF) << 8) + ((aByteArray105[0] & 0xFF) << 24) + ((aByteArray105[1] & 0xFF) << 16);
									local215 = ((aByteArray105[4] & 0xFF) << 8) + (aByteArray105[5] & 0xFF);
									local149 = (aByteArray105[8] & 0xFF) + ((aByteArray105[7] & 0xFF) << 8) + ((aByteArray105[6] & 0xFF) << 16);
									local243 = aByteArray105[9] & 0xFF;
								} else {
									try {
										this.aClass36_8.method765(aByteArray105, 0, 8, (byte) -9);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray105[1] & 0xFF) + ((aByteArray105[0] & 0xFF) << 8);
									local215 = ((aByteArray105[2] & 0xFF) << 8) + (aByteArray105[3] & 0xFF);
									local149 = (aByteArray105[6] & 0xFF) + ((aByteArray105[5] & 0xFF) << 8) + ((aByteArray105[4] & 0xFF) << 16);
									local243 = aByteArray105[7] & 0xFF;
								}
								if (arg0 != local201 || local144 != local215 || this.anInt5318 * -1652841323 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass36_8.method761(-428635279) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass36_8.method761(-1563617728) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 24);
								aByteArray105[1] = (byte) (arg0 >> 16);
								aByteArray105[2] = (byte) (arg0 >> 8);
								aByteArray105[3] = (byte) arg0;
								aByteArray105[4] = (byte) (local144 >> 8);
								aByteArray105[5] = (byte) local144;
								aByteArray105[6] = (byte) (local149 >> 16);
								aByteArray105[7] = (byte) (local149 >> 8);
								aByteArray105[8] = (byte) local149;
								aByteArray105[9] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 10, (byte) 57);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 97);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray105[0] = (byte) (arg0 >> 8);
								aByteArray105[1] = (byte) arg0;
								aByteArray105[2] = (byte) (local144 >> 8);
								aByteArray105[3] = (byte) local144;
								aByteArray105[4] = (byte) (local149 >> 16);
								aByteArray105[5] = (byte) (local149 >> 8);
								aByteArray105[6] = (byte) local149;
								aByteArray105[7] = (byte) (this.anInt5318 * -1652841323);
								this.aClass36_8.method762((long) local58 * 520L);
								this.aClass36_8.method767(aByteArray105, 0, 8, (byte) 50);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass36_8.method767(arg1, local142, local201, (byte) 69);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}
}
