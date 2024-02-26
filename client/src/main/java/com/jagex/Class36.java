package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.IOException;

@OriginalClass("client!abj")
public final class Class36 {

	@OriginalMember(owner = "client!abj", name = "t", descriptor = "I")
	static final int anInt110 = 200000000;

	@OriginalMember(owner = "client!abj", name = "l", descriptor = "I")
	int anInt109;

	@OriginalMember(owner = "client!abj", name = "s", descriptor = "J")
	long aLong4;

	@OriginalMember(owner = "client!abj", name = "u", descriptor = "J")
	long aLong3 = 2311217092717926549L;

	@OriginalMember(owner = "client!abj", name = "i", descriptor = "J")
	long aLong7 = -1946744429446496023L;

	@OriginalMember(owner = "client!abj", name = "m", descriptor = "I")
	int anInt111 = 0;

	@OriginalMember(owner = "client!abj", name = "f", descriptor = "Lclient!abp;")
	Class40 aClass40_1;

	@OriginalMember(owner = "client!abj", name = "j", descriptor = "J")
	long aLong2;

	@OriginalMember(owner = "client!abj", name = "a", descriptor = "J")
	long aLong6;

	@OriginalMember(owner = "client!abj", name = "e", descriptor = "[B")
	byte[] aByteArray13;

	@OriginalMember(owner = "client!abj", name = "g", descriptor = "[B")
	byte[] aByteArray12;

	@OriginalMember(owner = "client!abj", name = "o", descriptor = "J")
	long aLong5;

	@OriginalMember(owner = "client!abj", name = "agb", descriptor = "(Lclient!yp;I)V")
	static void method784(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Character.toUpperCase((char) local12);
	}

	@OriginalMember(owner = "client!abj", name = "ajy", descriptor = "(Lclient!yp;I)V")
	static void method785(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!abj", name = "aog", descriptor = "(Lclient!yp;I)V")
	static void method786(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class160.aClass121_Sub1_2.method9607(-428331506) != Class340.aClass340_5) {
			throw new RuntimeException();
		}
		((Class123_Sub1) Class160.aClass121_Sub1_2.method9603(-1978812105)).method9813(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1, (byte) -1);
	}

	@OriginalMember(owner = "client!abj", name = "<init>", descriptor = "(Lclient!abp;II)V")
	public Class36(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass40_1 = arg0;
		this.aLong6 = (this.aLong2 = arg0.method839((byte) 0) * -7902633271214033341L) * -6068181475647466505L;
		this.aByteArray13 = new byte[arg1];
		this.aByteArray12 = new byte[arg2];
		this.aLong5 = 0L;
	}

	@OriginalMember(owner = "client!abj", name = "n", descriptor = "([BII)V")
	public void method760(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong5 * -7477218386943216247L > this.aLong6 * -1645373751774405587L) {
				this.aLong6 = ((long) arg2 + -7477218386943216247L * this.aLong5) * -8832343131855481947L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L && (this.aLong5 * -7477218386943216247L < this.aLong7 * 1277491706133096615L || this.aLong5 * -7477218386943216247L > this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051))) {
				this.method775(1841210972);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L + (long) arg2 > (long) this.aByteArray12.length + this.aLong7 * 1277491706133096615L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray12.length - (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L));
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), local100);
				this.aLong5 += (long) local100 * 4876230715708805305L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt111 = this.aByteArray12.length * 1581917453;
				this.method775(2131392471);
			}
			if (arg2 > this.aByteArray12.length) {
				if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
					this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
					this.aLong4 = this.aLong5 * 5707623263448709827L;
				}
				this.aClass40_1.method834(arg0, arg1, arg2, (byte) 1);
				this.aLong4 += (long) arg2 * -4688792970002159893L;
				if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
					this.aLong2 = this.aLong4 * -239475789156710391L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local205 = this.aLong5 * -7477218386943216247L;
				} else if (this.aLong3 * -2810035278443492029L >= this.aLong5 * -7477218386943216247L && this.aLong3 * -2810035278443492029L < (long) arg2 + this.aLong5 * -7477218386943216247L) {
					local205 = this.aLong3 * -2810035278443492029L;
				}
				if (this.aLong5 * -7477218386943216247L + (long) arg2 > this.aLong3 * -2810035278443492029L && (long) arg2 + this.aLong5 * -7477218386943216247L <= (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local207 = this.aLong5 * -7477218386943216247L + (long) arg2;
				} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong5 * -7477218386943216247L && (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L <= this.aLong5 * -7477218386943216247L + (long) arg2) {
					local207 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong5 * -7477218386943216247L), this.aByteArray13, (int) (local205 - this.aLong3 * -2810035278443492029L), local367);
				}
				this.aLong5 += (long) arg2 * 4876230715708805305L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 1277491706133096615L == -1L) {
					this.aLong7 = this.aLong5 * -6565446413214316977L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				if (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L > (long) (this.anInt111 * -591253051)) {
					this.anInt111 = (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L) * 1581917453;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong4 = 4688792970002159893L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "e", descriptor = "(I)J")
	public long method761(@OriginalArg(0) int arg0) {
		return this.aLong6 * -1645373751774405587L;
	}

	@OriginalMember(owner = "client!abj", name = "f", descriptor = "(J)V")
	public void method762(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong5 = arg0 * 4876230715708805305L;
	}

	@OriginalMember(owner = "client!abj", name = "k", descriptor = "(J)V")
	public void method763(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong5 = arg0 * 4876230715708805305L;
	}

	@OriginalMember(owner = "client!abj", name = "u", descriptor = "([BB)V")
	public void method764(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.method765(arg0, 0, arg0.length, (byte) -44);
	}

	@OriginalMember(owner = "client!abj", name = "l", descriptor = "([BIIB)V")
	public void method765(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		try {
			if (arg2 + arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L >= this.aLong7 * 1277491706133096615L && (long) arg2 + this.aLong5 * -7477218386943216247L <= this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051)) {
				System.arraycopy(this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg0, arg1, arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				return;
			}
			@Pc(82) long local82 = this.aLong5 * -7477218386943216247L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
				local129 = (int) ((long) (this.anInt109 * 1626900225) - (this.aLong5 * -7477218386943216247L - this.aLong3 * -2810035278443492029L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray13, (int) (this.aLong5 * -7477218386943216247L - this.aLong3 * -2810035278443492029L), arg0, arg1, local129);
				this.aLong5 += (long) local129 * 4876230715708805305L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray13.length) {
				this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
				this.aLong4 = this.aLong5 * 5707623263448709827L;
				while (arg2 > 0) {
					local129 = this.aClass40_1.method832(arg0, arg1, arg2, (byte) -16);
					if (local129 == -1) {
						break;
					}
					this.aLong4 += (long) local129 * -4688792970002159893L;
					this.aLong5 += (long) local129 * 4876230715708805305L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method766(2038119519);
				local129 = arg2;
				if (arg2 > this.anInt109 * 1626900225) {
					local129 = this.anInt109 * 1626900225;
				}
				System.arraycopy(this.aByteArray13, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong5 += (long) local129 * 4876230715708805305L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L) {
				if (this.aLong7 * 1277491706133096615L > this.aLong5 * -7477218386943216247L && arg2 > 0) {
					local129 = (int) (this.aLong7 * 1277491706133096615L - this.aLong5 * -7477218386943216247L) + arg1;
					if (local129 > arg1 + arg2) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong5 += 4876230715708805305L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong7 * 1277491706133096615L >= local82 && this.aLong7 * 1277491706133096615L < (long) local86 + local82) {
					local327 = this.aLong7 * 1277491706133096615L;
				} else if (local82 >= this.aLong7 * 1277491706133096615L && local82 < (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L) {
					local327 = local82;
				}
				if (this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051) > local82 && (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L <= local82 + (long) local86) {
					local329 = (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L;
				} else if ((long) local86 + local82 > this.aLong7 * 1277491706133096615L && local82 + (long) local86 <= (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray12, (int) (local327 - this.aLong7 * 1277491706133096615L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong5 * -7477218386943216247L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong5 * -7477218386943216247L));
						this.aLong5 = local329 * 4876230715708805305L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong4 = 4688792970002159893L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abj", name = "g", descriptor = "(I)V")
	void method766(@OriginalArg(0) int arg0) throws IOException {
		this.anInt109 = 0;
		if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
			this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
			this.aLong4 = this.aLong5 * 5707623263448709827L;
		}
		this.aLong3 = this.aLong5 * -87121295481962685L;
		while (this.anInt109 * 1626900225 < this.aByteArray13.length) {
			@Pc(48) int local48 = this.aByteArray13.length - this.anInt109 * 1626900225;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass40_1.method832(this.aByteArray13, this.anInt109 * 1626900225, local48, (byte) 1);
			if (local65 == -1) {
				break;
			}
			this.aLong4 += (long) local65 * -4688792970002159893L;
			this.anInt109 += local65 * -1623688959;
		}
	}

	@OriginalMember(owner = "client!abj", name = "i", descriptor = "([BIIB)V")
	public void method767(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		try {
			if ((long) arg2 + this.aLong5 * -7477218386943216247L > this.aLong6 * -1645373751774405587L) {
				this.aLong6 = ((long) arg2 + -7477218386943216247L * this.aLong5) * -8832343131855481947L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L && (this.aLong5 * -7477218386943216247L < this.aLong7 * 1277491706133096615L || this.aLong5 * -7477218386943216247L > this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051))) {
				this.method775(1914234141);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L + (long) arg2 > (long) this.aByteArray12.length + this.aLong7 * 1277491706133096615L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray12.length - (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L));
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), local100);
				this.aLong5 += (long) local100 * 4876230715708805305L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt111 = this.aByteArray12.length * 1581917453;
				this.method775(2079647262);
			}
			if (arg2 > this.aByteArray12.length) {
				if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
					this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
					this.aLong4 = this.aLong5 * 5707623263448709827L;
				}
				this.aClass40_1.method834(arg0, arg1, arg2, (byte) 1);
				this.aLong4 += (long) arg2 * -4688792970002159893L;
				if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
					this.aLong2 = this.aLong4 * -239475789156710391L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local205 = this.aLong5 * -7477218386943216247L;
				} else if (this.aLong3 * -2810035278443492029L >= this.aLong5 * -7477218386943216247L && this.aLong3 * -2810035278443492029L < (long) arg2 + this.aLong5 * -7477218386943216247L) {
					local205 = this.aLong3 * -2810035278443492029L;
				}
				if (this.aLong5 * -7477218386943216247L + (long) arg2 > this.aLong3 * -2810035278443492029L && (long) arg2 + this.aLong5 * -7477218386943216247L <= (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local207 = this.aLong5 * -7477218386943216247L + (long) arg2;
				} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong5 * -7477218386943216247L && (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L <= this.aLong5 * -7477218386943216247L + (long) arg2) {
					local207 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong5 * -7477218386943216247L), this.aByteArray13, (int) (local205 - this.aLong3 * -2810035278443492029L), local367);
				}
				this.aLong5 += (long) arg2 * 4876230715708805305L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 1277491706133096615L == -1L) {
					this.aLong7 = this.aLong5 * -6565446413214316977L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				if (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L > (long) (this.anInt111 * -591253051)) {
					this.anInt111 = (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L) * 1581917453;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong4 = 4688792970002159893L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "s", descriptor = "(J)V")
	public void method768(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong5 = arg0 * 4876230715708805305L;
	}

	@OriginalMember(owner = "client!abj", name = "o", descriptor = "()V")
	public void method769() throws IOException {
		this.method775(2091167216);
		this.aClass40_1.method838(1559430853);
	}

	@OriginalMember(owner = "client!abj", name = "j", descriptor = "()V")
	public void method770() throws IOException {
		this.method775(2022267536);
		this.aClass40_1.method838(-621377912);
	}

	@OriginalMember(owner = "client!abj", name = "a", descriptor = "(J)V")
	public void method771(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong5 = arg0 * 4876230715708805305L;
	}

	@OriginalMember(owner = "client!abj", name = "t", descriptor = "(B)V")
	public void method772(@OriginalArg(0) byte arg0) throws IOException {
		this.method775(1806510350);
		this.aClass40_1.method838(560686543);
	}

	@OriginalMember(owner = "client!abj", name = "w", descriptor = "()J")
	public long method773() {
		return this.aLong6 * -1645373751774405587L;
	}

	@OriginalMember(owner = "client!abj", name = "x", descriptor = "(J)V")
	public void method774(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong5 = arg0 * 4876230715708805305L;
	}

	@OriginalMember(owner = "client!abj", name = "m", descriptor = "(I)V")
	void method775(@OriginalArg(0) int arg0) throws IOException {
		if (this.aLong7 * 1277491706133096615L == -1L) {
			return;
		}
		if (this.aLong7 * 1277491706133096615L != this.aLong4 * -9201582235773677117L) {
			this.aClass40_1.method827(this.aLong7 * 1277491706133096615L);
			this.aLong4 = this.aLong7 * 8650444957291125581L;
		}
		this.aClass40_1.method834(this.aByteArray12, 0, this.anInt111 * -591253051, (byte) 1);
		this.aLong4 += (long) this.anInt111 * 8181327693514730967L;
		if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
			this.aLong2 = this.aLong4 * -239475789156710391L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong7 * 1277491706133096615L >= this.aLong3 * -2810035278443492029L && this.aLong7 * 1277491706133096615L < this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225)) {
			local68 = this.aLong7 * 1277491706133096615L;
		} else if (this.aLong3 * -2810035278443492029L >= this.aLong7 * 1277491706133096615L && this.aLong3 * -2810035278443492029L < (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L) {
			local68 = this.aLong3 * -2810035278443492029L;
		}
		if ((long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L > this.aLong3 * -2810035278443492029L && this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051) <= this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225)) {
			local70 = (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L;
		} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong7 * 1277491706133096615L && this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) <= this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051)) {
			local70 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray12, (int) (local68 - this.aLong7 * 1277491706133096615L), this.aByteArray13, (int) (local68 - this.aLong3 * -2810035278443492029L), local245);
		}
		this.aLong7 = -1946744429446496023L;
		this.anInt111 = 0;
	}

	@OriginalMember(owner = "client!abj", name = "r", descriptor = "([B)V")
	public void method776(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method765(arg0, 0, arg0.length, (byte) -27);
	}

	@OriginalMember(owner = "client!abj", name = "h", descriptor = "([BII)V")
	public void method777(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 + arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L >= this.aLong7 * 1277491706133096615L && (long) arg2 + this.aLong5 * -7477218386943216247L <= this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051)) {
				System.arraycopy(this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg0, arg1, arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				return;
			}
			@Pc(82) long local82 = this.aLong5 * -7477218386943216247L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
				local129 = (int) ((long) (this.anInt109 * 1626900225) - (this.aLong5 * -7477218386943216247L - this.aLong3 * -2810035278443492029L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray13, (int) (this.aLong5 * -7477218386943216247L - this.aLong3 * -2810035278443492029L), arg0, arg1, local129);
				this.aLong5 += (long) local129 * 4876230715708805305L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray13.length) {
				this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
				this.aLong4 = this.aLong5 * 5707623263448709827L;
				while (arg2 > 0) {
					local129 = this.aClass40_1.method832(arg0, arg1, arg2, (byte) -43);
					if (local129 == -1) {
						break;
					}
					this.aLong4 += (long) local129 * -4688792970002159893L;
					this.aLong5 += (long) local129 * 4876230715708805305L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method766(-140561241);
				local129 = arg2;
				if (arg2 > this.anInt109 * 1626900225) {
					local129 = this.anInt109 * 1626900225;
				}
				System.arraycopy(this.aByteArray13, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong5 += (long) local129 * 4876230715708805305L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L) {
				if (this.aLong7 * 1277491706133096615L > this.aLong5 * -7477218386943216247L && arg2 > 0) {
					local129 = (int) (this.aLong7 * 1277491706133096615L - this.aLong5 * -7477218386943216247L) + arg1;
					if (local129 > arg1 + arg2) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong5 += 4876230715708805305L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong7 * 1277491706133096615L >= local82 && this.aLong7 * 1277491706133096615L < (long) local86 + local82) {
					local327 = this.aLong7 * 1277491706133096615L;
				} else if (local82 >= this.aLong7 * 1277491706133096615L && local82 < (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L) {
					local327 = local82;
				}
				if (this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051) > local82 && (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L <= local82 + (long) local86) {
					local329 = (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L;
				} else if ((long) local86 + local82 > this.aLong7 * 1277491706133096615L && local82 + (long) local86 <= (long) (this.anInt111 * -591253051) + this.aLong7 * 1277491706133096615L) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray12, (int) (local327 - this.aLong7 * 1277491706133096615L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong5 * -7477218386943216247L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong5 * -7477218386943216247L));
						this.aLong5 = local329 * 4876230715708805305L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong4 = 4688792970002159893L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abj", name = "d", descriptor = "()V")
	void method778() throws IOException {
		this.anInt109 = 0;
		if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
			this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
			this.aLong4 = this.aLong5 * 5707623263448709827L;
		}
		this.aLong3 = this.aLong5 * -87121295481962685L;
		while (this.anInt109 * 1626900225 < this.aByteArray13.length) {
			@Pc(48) int local48 = this.aByteArray13.length - this.anInt109 * 1626900225;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass40_1.method832(this.aByteArray13, this.anInt109 * 1626900225, local48, (byte) -51);
			if (local65 == -1) {
				break;
			}
			this.aLong4 += (long) local65 * -4688792970002159893L;
			this.anInt109 += local65 * -1623688959;
		}
	}

	@OriginalMember(owner = "client!abj", name = "z", descriptor = "([BII)V")
	public void method779(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong5 * -7477218386943216247L > this.aLong6 * -1645373751774405587L) {
				this.aLong6 = ((long) arg2 + -7477218386943216247L * this.aLong5) * -8832343131855481947L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L && (this.aLong5 * -7477218386943216247L < this.aLong7 * 1277491706133096615L || this.aLong5 * -7477218386943216247L > this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051))) {
				this.method775(1914055448);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L + (long) arg2 > (long) this.aByteArray12.length + this.aLong7 * 1277491706133096615L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray12.length - (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L));
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), local100);
				this.aLong5 += (long) local100 * 4876230715708805305L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt111 = this.aByteArray12.length * 1581917453;
				this.method775(1965331438);
			}
			if (arg2 > this.aByteArray12.length) {
				if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
					this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
					this.aLong4 = this.aLong5 * 5707623263448709827L;
				}
				this.aClass40_1.method834(arg0, arg1, arg2, (byte) 1);
				this.aLong4 += (long) arg2 * -4688792970002159893L;
				if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
					this.aLong2 = this.aLong4 * -239475789156710391L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local205 = this.aLong5 * -7477218386943216247L;
				} else if (this.aLong3 * -2810035278443492029L >= this.aLong5 * -7477218386943216247L && this.aLong3 * -2810035278443492029L < (long) arg2 + this.aLong5 * -7477218386943216247L) {
					local205 = this.aLong3 * -2810035278443492029L;
				}
				if (this.aLong5 * -7477218386943216247L + (long) arg2 > this.aLong3 * -2810035278443492029L && (long) arg2 + this.aLong5 * -7477218386943216247L <= (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local207 = this.aLong5 * -7477218386943216247L + (long) arg2;
				} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong5 * -7477218386943216247L && (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L <= this.aLong5 * -7477218386943216247L + (long) arg2) {
					local207 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong5 * -7477218386943216247L), this.aByteArray13, (int) (local205 - this.aLong3 * -2810035278443492029L), local367);
				}
				this.aLong5 += (long) arg2 * 4876230715708805305L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 1277491706133096615L == -1L) {
					this.aLong7 = this.aLong5 * -6565446413214316977L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				if (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L > (long) (this.anInt111 * -591253051)) {
					this.anInt111 = (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L) * 1581917453;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong4 = 4688792970002159893L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "p", descriptor = "([BII)V")
	public void method780(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong5 * -7477218386943216247L > this.aLong6 * -1645373751774405587L) {
				this.aLong6 = ((long) arg2 + -7477218386943216247L * this.aLong5) * -8832343131855481947L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L && (this.aLong5 * -7477218386943216247L < this.aLong7 * 1277491706133096615L || this.aLong5 * -7477218386943216247L > this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051))) {
				this.method775(2118605220);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L + (long) arg2 > (long) this.aByteArray12.length + this.aLong7 * 1277491706133096615L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray12.length - (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L));
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), local100);
				this.aLong5 += (long) local100 * 4876230715708805305L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt111 = this.aByteArray12.length * 1581917453;
				this.method775(2053343658);
			}
			if (arg2 > this.aByteArray12.length) {
				if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
					this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
					this.aLong4 = this.aLong5 * 5707623263448709827L;
				}
				this.aClass40_1.method834(arg0, arg1, arg2, (byte) 1);
				this.aLong4 += (long) arg2 * -4688792970002159893L;
				if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
					this.aLong2 = this.aLong4 * -239475789156710391L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local205 = this.aLong5 * -7477218386943216247L;
				} else if (this.aLong3 * -2810035278443492029L >= this.aLong5 * -7477218386943216247L && this.aLong3 * -2810035278443492029L < (long) arg2 + this.aLong5 * -7477218386943216247L) {
					local205 = this.aLong3 * -2810035278443492029L;
				}
				if (this.aLong5 * -7477218386943216247L + (long) arg2 > this.aLong3 * -2810035278443492029L && (long) arg2 + this.aLong5 * -7477218386943216247L <= (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local207 = this.aLong5 * -7477218386943216247L + (long) arg2;
				} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong5 * -7477218386943216247L && (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L <= this.aLong5 * -7477218386943216247L + (long) arg2) {
					local207 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong5 * -7477218386943216247L), this.aByteArray13, (int) (local205 - this.aLong3 * -2810035278443492029L), local367);
				}
				this.aLong5 += (long) arg2 * 4876230715708805305L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 1277491706133096615L == -1L) {
					this.aLong7 = this.aLong5 * -6565446413214316977L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				if (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L > (long) (this.anInt111 * -591253051)) {
					this.anInt111 = (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L) * 1581917453;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong4 = 4688792970002159893L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "v", descriptor = "([BII)V")
	public void method781(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong5 * -7477218386943216247L > this.aLong6 * -1645373751774405587L) {
				this.aLong6 = ((long) arg2 + -7477218386943216247L * this.aLong5) * -8832343131855481947L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L && (this.aLong5 * -7477218386943216247L < this.aLong7 * 1277491706133096615L || this.aLong5 * -7477218386943216247L > this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051))) {
				this.method775(1900999504);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L + (long) arg2 > (long) this.aByteArray12.length + this.aLong7 * 1277491706133096615L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray12.length - (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L));
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), local100);
				this.aLong5 += (long) local100 * 4876230715708805305L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt111 = this.aByteArray12.length * 1581917453;
				this.method775(1793039698);
			}
			if (arg2 > this.aByteArray12.length) {
				if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
					this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
					this.aLong4 = this.aLong5 * 5707623263448709827L;
				}
				this.aClass40_1.method834(arg0, arg1, arg2, (byte) 1);
				this.aLong4 += (long) arg2 * -4688792970002159893L;
				if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
					this.aLong2 = this.aLong4 * -239475789156710391L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local205 = this.aLong5 * -7477218386943216247L;
				} else if (this.aLong3 * -2810035278443492029L >= this.aLong5 * -7477218386943216247L && this.aLong3 * -2810035278443492029L < (long) arg2 + this.aLong5 * -7477218386943216247L) {
					local205 = this.aLong3 * -2810035278443492029L;
				}
				if (this.aLong5 * -7477218386943216247L + (long) arg2 > this.aLong3 * -2810035278443492029L && (long) arg2 + this.aLong5 * -7477218386943216247L <= (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local207 = this.aLong5 * -7477218386943216247L + (long) arg2;
				} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong5 * -7477218386943216247L && (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L <= this.aLong5 * -7477218386943216247L + (long) arg2) {
					local207 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong5 * -7477218386943216247L), this.aByteArray13, (int) (local205 - this.aLong3 * -2810035278443492029L), local367);
				}
				this.aLong5 += (long) arg2 * 4876230715708805305L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 1277491706133096615L == -1L) {
					this.aLong7 = this.aLong5 * -6565446413214316977L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				if (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L > (long) (this.anInt111 * -591253051)) {
					this.anInt111 = (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L) * 1581917453;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong4 = 4688792970002159893L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "q", descriptor = "([B)V")
	public void method782(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method765(arg0, 0, arg0.length, (byte) 11);
	}

	@OriginalMember(owner = "client!abj", name = "y", descriptor = "([BII)V")
	public void method783(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong5 * -7477218386943216247L > this.aLong6 * -1645373751774405587L) {
				this.aLong6 = ((long) arg2 + -7477218386943216247L * this.aLong5) * -8832343131855481947L;
			}
			if (this.aLong7 * 1277491706133096615L != -1L && (this.aLong5 * -7477218386943216247L < this.aLong7 * 1277491706133096615L || this.aLong5 * -7477218386943216247L > this.aLong7 * 1277491706133096615L + (long) (this.anInt111 * -591253051))) {
				this.method775(1797933286);
			}
			if (this.aLong7 * 1277491706133096615L != -1L && this.aLong5 * -7477218386943216247L + (long) arg2 > (long) this.aByteArray12.length + this.aLong7 * 1277491706133096615L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray12.length - (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L));
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), local100);
				this.aLong5 += (long) local100 * 4876230715708805305L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt111 = this.aByteArray12.length * 1581917453;
				this.method775(2146392297);
			}
			if (arg2 > this.aByteArray12.length) {
				if (this.aLong5 * -7477218386943216247L != this.aLong4 * -9201582235773677117L) {
					this.aClass40_1.method827(this.aLong5 * -7477218386943216247L);
					this.aLong4 = this.aLong5 * 5707623263448709827L;
				}
				this.aClass40_1.method834(arg0, arg1, arg2, (byte) 1);
				this.aLong4 += (long) arg2 * -4688792970002159893L;
				if (this.aLong4 * -9201582235773677117L > this.aLong2 * -4548739993584351637L) {
					this.aLong2 = this.aLong4 * -239475789156710391L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong5 * -7477218386943216247L >= this.aLong3 * -2810035278443492029L && this.aLong5 * -7477218386943216247L < (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local205 = this.aLong5 * -7477218386943216247L;
				} else if (this.aLong3 * -2810035278443492029L >= this.aLong5 * -7477218386943216247L && this.aLong3 * -2810035278443492029L < (long) arg2 + this.aLong5 * -7477218386943216247L) {
					local205 = this.aLong3 * -2810035278443492029L;
				}
				if (this.aLong5 * -7477218386943216247L + (long) arg2 > this.aLong3 * -2810035278443492029L && (long) arg2 + this.aLong5 * -7477218386943216247L <= (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L) {
					local207 = this.aLong5 * -7477218386943216247L + (long) arg2;
				} else if (this.aLong3 * -2810035278443492029L + (long) (this.anInt109 * 1626900225) > this.aLong5 * -7477218386943216247L && (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L <= this.aLong5 * -7477218386943216247L + (long) arg2) {
					local207 = (long) (this.anInt109 * 1626900225) + this.aLong3 * -2810035278443492029L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong5 * -7477218386943216247L), this.aByteArray13, (int) (local205 - this.aLong3 * -2810035278443492029L), local367);
				}
				this.aLong5 += (long) arg2 * 4876230715708805305L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 1277491706133096615L == -1L) {
					this.aLong7 = this.aLong5 * -6565446413214316977L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray12, (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L), arg2);
				this.aLong5 += (long) arg2 * 4876230715708805305L;
				if (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L > (long) (this.anInt111 * -591253051)) {
					this.anInt111 = (int) (this.aLong5 * -7477218386943216247L - this.aLong7 * 1277491706133096615L) * 1581917453;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong4 = 4688792970002159893L;
			throw local472;
		}
	}
}
