package jagex3;

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abp")
public final class Class42 {

	@OriginalMember(owner = "client!abp", name = "e", descriptor = "I")
	static final int anInt133 = 200000000;

	@OriginalMember(owner = "client!abp", name = "f", descriptor = "I")
	int anInt131;

	@OriginalMember(owner = "client!abp", name = "c", descriptor = "J")
	long aLong9;

	@OriginalMember(owner = "client!abp", name = "k", descriptor = "J")
	long aLong5 = 5031432252071232053L;

	@OriginalMember(owner = "client!abp", name = "l", descriptor = "J")
	long aLong7 = 4956407829330264493L;

	@OriginalMember(owner = "client!abp", name = "u", descriptor = "I")
	int anInt132 = 0;

	@OriginalMember(owner = "client!abp", name = "n", descriptor = "Lclient!abl;")
	Class38 aClass38_1;

	@OriginalMember(owner = "client!abp", name = "p", descriptor = "J")
	long aLong4;

	@OriginalMember(owner = "client!abp", name = "d", descriptor = "J")
	long aLong6;

	@OriginalMember(owner = "client!abp", name = "m", descriptor = "[B")
	byte[] aByteArray12;

	@OriginalMember(owner = "client!abp", name = "w", descriptor = "[B")
	byte[] aByteArray13;

	@OriginalMember(owner = "client!abp", name = "z", descriptor = "J")
	long aLong8;

	@OriginalMember(owner = "client!abp", name = "f", descriptor = "(Lclient!dn;[F[FB)V")
	static void method841(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) float local11 = arg1[3] - arg1[0];
		if ((double) local11 == 0.0D) {
			return;
		}
		@Pc(25) float local25 = arg1[1] - arg1[0];
		@Pc(33) float local33 = arg1[2] - arg1[0];
		@Pc(38) Float local38 = local25 / local11;
		@Pc(43) Float local43 = local33 / local11;
		arg0.aBoolean652 = local38 == 0.33333334F && local43 == 0.6666667F;
		@Pc(61) float local61 = local38;
		@Pc(64) float local64 = local43;
		if ((double) local38 < 0.0D) {
			local38 = 0.0F;
		}
		if ((double) local43 > 1.0D) {
			local43 = 1.0F;
		}
		if ((double) local38 > 1.0D || local43 < -1.0F) {
			Class342.method27602(local38, local43, (byte) -75);
		}
		if (local38 != local61) {
			arg1[1] = arg1[0] + local38 * local11;
			if ((double) local61 != 0.0D) {
				arg2[1] = arg2[0] + (arg2[1] - arg2[0]) * local38 / local61;
			}
		}
		if (local43 != local64) {
			arg1[2] = arg1[0] + local43 * local11;
			if ((double) local64 != 1.0D) {
				arg2[2] = (float) ((double) arg2[3] - (double) (arg2[3] - arg2[2]) * (1.0D - (double) local43) / (1.0D - (double) local64));
			}
		}
		arg0.aFloat275 = arg1[0];
		arg0.aFloat276 = arg1[3];
		Class670.method33137(0.0F, local38, local43, 1.0F, arg0.aFloatArray99, 752351645);
		Class670.method33137(arg2[0], arg2[1], arg2[2], arg2[3], arg0.aFloatArray97, 7399556);
	}

	@OriginalMember(owner = "client!abp", name = "<init>", descriptor = "(Lclient!abl;II)V")
	public Class42(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass38_1 = arg0;
		this.aLong6 = (this.aLong4 = arg0.method735(1648608512) * -451821661113593867L) * -1558313948680994995L;
		this.aByteArray12 = new byte[arg1];
		this.aByteArray13 = new byte[arg2];
		this.aLong8 = 0L;
	}

	@OriginalMember(owner = "client!abp", name = "u", descriptor = "(B)V")
	void method818(@OriginalArg(0) byte arg0) throws IOException {
		if (this.aLong7 * 5576541888797144539L == -1L) {
			return;
		}
		if (this.aLong7 * 5576541888797144539L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong7 * 5576541888797144539L);
			this.aLong9 = this.aLong7 * 4877476641905341055L;
		}
		this.aClass38_1.method722(this.aByteArray13, 0, this.anInt132 * -966644267, -1699446791);
		this.aLong9 += (long) this.anInt132 * -4132142083450567823L;
		if (this.aLong9 * -9152026569603950939L > this.aLong4 * 8757058546879407197L) {
			this.aLong4 = this.aLong9 * 8238481981032781545L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong7 * 5576541888797144539L >= this.aLong5 * 403697080057429987L && this.aLong7 * 5576541888797144539L < this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
			local68 = this.aLong7 * 5576541888797144539L;
		} else if (this.aLong5 * 403697080057429987L >= this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L < this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local68 = this.aLong5 * 403697080057429987L;
		}
		if ((long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L > this.aLong5 * 403697080057429987L && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
			local70 = (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L;
		} else if ((long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L > this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415) <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local70 = (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray13, (int) (local68 - this.aLong7 * 5576541888797144539L), this.aByteArray12, (int) (local68 - this.aLong5 * 403697080057429987L), local245);
		}
		this.aLong7 = 4956407829330264493L;
		this.anInt132 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "c", descriptor = "([B)V")
	public void method819(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method823(arg0, 0, arg0.length, -1661717816);
	}

	@OriginalMember(owner = "client!abp", name = "n", descriptor = "(J)V")
	public void method820(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong8 = arg0 * -8636336681283858287L;
	}

	@OriginalMember(owner = "client!abp", name = "m", descriptor = "(B)J")
	public long method821(@OriginalArg(0) byte arg0) {
		return this.aLong6 * -6213719775271939759L;
	}

	@OriginalMember(owner = "client!abp", name = "k", descriptor = "([BI)V")
	public void method822(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		this.method823(arg0, 0, arg0.length, -1950267895);
	}

	@OriginalMember(owner = "client!abp", name = "f", descriptor = "([BIII)V")
	public void method823(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong7 * 5576541888797144539L != -1L && this.aLong8 * -132147995563560847L >= this.aLong7 * 5576541888797144539L && (long) arg2 + this.aLong8 * -132147995563560847L <= (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
				System.arraycopy(this.aByteArray13, (int) (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L), arg0, arg1, arg2);
				this.aLong8 += (long) arg2 * -8636336681283858287L;
				return;
			}
			@Pc(82) long local82 = this.aLong8 * -132147995563560847L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong8 * -132147995563560847L >= this.aLong5 * 403697080057429987L && this.aLong8 * -132147995563560847L < (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
				local129 = (int) ((long) (this.anInt131 * 1716434415) - (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray12, (int) (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L), arg0, arg1, local129);
				this.aLong8 += (long) local129 * -8636336681283858287L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray12.length) {
				this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
				this.aLong9 = this.aLong8 * -297616410474490659L;
				while (arg2 > 0) {
					local129 = this.aClass38_1.method726(arg0, arg1, arg2, (byte) 92);
					if (local129 == -1) {
						break;
					}
					this.aLong9 += (long) local129 * -4777806551621951187L;
					this.aLong8 += (long) local129 * -8636336681283858287L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method836((byte) -48);
				local129 = arg2;
				if (arg2 > this.anInt131 * 1716434415) {
					local129 = this.anInt131 * 1716434415;
				}
				System.arraycopy(this.aByteArray12, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong8 += (long) local129 * -8636336681283858287L;
			}
			if (this.aLong7 * 5576541888797144539L != -1L) {
				if (this.aLong7 * 5576541888797144539L > this.aLong8 * -132147995563560847L && arg2 > 0) {
					local129 = arg1 + (int) (this.aLong7 * 5576541888797144539L - this.aLong8 * -132147995563560847L);
					if (local129 > arg2 + arg1) {
						local129 = arg1 + arg2;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong8 += -8636336681283858287L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong7 * 5576541888797144539L >= local82 && this.aLong7 * 5576541888797144539L < (long) local86 + local82) {
					local327 = this.aLong7 * 5576541888797144539L;
				} else if (local82 >= this.aLong7 * 5576541888797144539L && local82 < (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
					local327 = local82;
				}
				if (this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267) > local82 && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= local82 + (long) local86) {
					local329 = this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267);
				} else if ((long) local86 + local82 > this.aLong7 * 5576541888797144539L && (long) local86 + local82 <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
					local329 = local82 + (long) local86;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray13, (int) (local327 - this.aLong7 * 5576541888797144539L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong8 * -132147995563560847L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong8 * -132147995563560847L));
						this.aLong8 = local329 * -8636336681283858287L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong9 = 4777806551621951187L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abp", name = "l", descriptor = "([BIII)V")
	public void method824(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		try {
			if ((long) arg2 + this.aLong8 * -132147995563560847L > this.aLong6 * -6213719775271939759L) {
				this.aLong6 = (this.aLong8 * -132147995563560847L + (long) arg2) * -4810776714637387855L;
			}
			if (this.aLong7 * 5576541888797144539L != -1L && (this.aLong8 * -132147995563560847L < this.aLong7 * 5576541888797144539L || this.aLong8 * -132147995563560847L > this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267))) {
				this.method818((byte) 0);
			}
			if (this.aLong7 * 5576541888797144539L != -1L && this.aLong8 * -132147995563560847L + (long) arg2 > (long) this.aByteArray13.length + this.aLong7 * 5576541888797144539L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray13.length - (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L));
				System.arraycopy(arg0, arg1, this.aByteArray13, (int) (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L), local100);
				this.aLong8 += (long) local100 * -8636336681283858287L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt132 = this.aByteArray13.length * -690117763;
				this.method818((byte) 0);
			}
			if (arg2 > this.aByteArray13.length) {
				if (this.aLong8 * -132147995563560847L != this.aLong9 * -9152026569603950939L) {
					this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
					this.aLong9 = this.aLong8 * -297616410474490659L;
				}
				this.aClass38_1.method722(arg0, arg1, arg2, -1945672715);
				this.aLong9 += (long) arg2 * -4777806551621951187L;
				if (this.aLong9 * -9152026569603950939L > this.aLong4 * 8757058546879407197L) {
					this.aLong4 = this.aLong9 * 8238481981032781545L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong8 * -132147995563560847L >= this.aLong5 * 403697080057429987L && this.aLong8 * -132147995563560847L < this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
					local205 = this.aLong8 * -132147995563560847L;
				} else if (this.aLong5 * 403697080057429987L >= this.aLong8 * -132147995563560847L && this.aLong5 * 403697080057429987L < (long) arg2 + this.aLong8 * -132147995563560847L) {
					local205 = this.aLong5 * 403697080057429987L;
				}
				if (this.aLong8 * -132147995563560847L + (long) arg2 > this.aLong5 * 403697080057429987L && this.aLong8 * -132147995563560847L + (long) arg2 <= this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
					local207 = this.aLong8 * -132147995563560847L + (long) arg2;
				} else if (this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415) > this.aLong8 * -132147995563560847L && (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L <= this.aLong8 * -132147995563560847L + (long) arg2) {
					local207 = this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415);
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) (local205 + (long) arg1 - this.aLong8 * -132147995563560847L), this.aByteArray12, (int) (local205 - this.aLong5 * 403697080057429987L), local367);
				}
				this.aLong8 += (long) arg2 * -8636336681283858287L;
			} else if (arg2 > 0) {
				if (this.aLong7 * 5576541888797144539L == -1L) {
					this.aLong7 = this.aLong8 * 4894032732475527843L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray13, (int) (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L), arg2);
				this.aLong8 += (long) arg2 * -8636336681283858287L;
				if (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L > (long) (this.anInt132 * -966644267)) {
					this.anInt132 = (int) (-132147995563560847L * this.aLong8 - this.aLong7 * 5576541888797144539L) * -690117763;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong9 = 4777806551621951187L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abp", name = "a", descriptor = "()V")
	void method825() throws IOException {
		if (this.aLong7 * 5576541888797144539L == -1L) {
			return;
		}
		if (this.aLong7 * 5576541888797144539L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong7 * 5576541888797144539L);
			this.aLong9 = this.aLong7 * 4877476641905341055L;
		}
		this.aClass38_1.method722(this.aByteArray13, 0, this.anInt132 * -966644267, 1542220357);
		this.aLong9 += (long) this.anInt132 * -4132142083450567823L;
		if (this.aLong9 * -9152026569603950939L > this.aLong4 * 8757058546879407197L) {
			this.aLong4 = this.aLong9 * 8238481981032781545L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong7 * 5576541888797144539L >= this.aLong5 * 403697080057429987L && this.aLong7 * 5576541888797144539L < this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
			local68 = this.aLong7 * 5576541888797144539L;
		} else if (this.aLong5 * 403697080057429987L >= this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L < this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local68 = this.aLong5 * 403697080057429987L;
		}
		if ((long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L > this.aLong5 * 403697080057429987L && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
			local70 = (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L;
		} else if ((long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L > this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415) <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local70 = (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray13, (int) (local68 - this.aLong7 * 5576541888797144539L), this.aByteArray12, (int) (local68 - this.aLong5 * 403697080057429987L), local245);
		}
		this.aLong7 = 4956407829330264493L;
		this.anInt132 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "g", descriptor = "()V")
	void method826() throws IOException {
		if (this.aLong7 * 5576541888797144539L == -1L) {
			return;
		}
		if (this.aLong7 * 5576541888797144539L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong7 * 5576541888797144539L);
			this.aLong9 = this.aLong7 * 4877476641905341055L;
		}
		this.aClass38_1.method722(this.aByteArray13, 0, this.anInt132 * -966644267, 528709178);
		this.aLong9 += (long) this.anInt132 * -4132142083450567823L;
		if (this.aLong9 * -9152026569603950939L > this.aLong4 * 8757058546879407197L) {
			this.aLong4 = this.aLong9 * 8238481981032781545L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong7 * 5576541888797144539L >= this.aLong5 * 403697080057429987L && this.aLong7 * 5576541888797144539L < this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
			local68 = this.aLong7 * 5576541888797144539L;
		} else if (this.aLong5 * 403697080057429987L >= this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L < this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local68 = this.aLong5 * 403697080057429987L;
		}
		if ((long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L > this.aLong5 * 403697080057429987L && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
			local70 = (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L;
		} else if ((long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L > this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415) <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local70 = (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray13, (int) (local68 - this.aLong7 * 5576541888797144539L), this.aByteArray12, (int) (local68 - this.aLong5 * 403697080057429987L), local245);
		}
		this.aLong7 = 4956407829330264493L;
		this.anInt132 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "p", descriptor = "(J)V")
	public void method827(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong8 = arg0 * -8636336681283858287L;
	}

	@OriginalMember(owner = "client!abp", name = "d", descriptor = "()J")
	public long method828() {
		return this.aLong6 * -6213719775271939759L;
	}

	@OriginalMember(owner = "client!abp", name = "r", descriptor = "([BII)V")
	public void method829(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong7 * 5576541888797144539L != -1L && this.aLong8 * -132147995563560847L >= this.aLong7 * 5576541888797144539L && (long) arg2 + this.aLong8 * -132147995563560847L <= (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
				System.arraycopy(this.aByteArray13, (int) (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L), arg0, arg1, arg2);
				this.aLong8 += (long) arg2 * -8636336681283858287L;
				return;
			}
			@Pc(82) long local82 = this.aLong8 * -132147995563560847L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong8 * -132147995563560847L >= this.aLong5 * 403697080057429987L && this.aLong8 * -132147995563560847L < (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
				local129 = (int) ((long) (this.anInt131 * 1716434415) - (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray12, (int) (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L), arg0, arg1, local129);
				this.aLong8 += (long) local129 * -8636336681283858287L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray12.length) {
				this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
				this.aLong9 = this.aLong8 * -297616410474490659L;
				while (arg2 > 0) {
					local129 = this.aClass38_1.method726(arg0, arg1, arg2, (byte) 53);
					if (local129 == -1) {
						break;
					}
					this.aLong9 += (long) local129 * -4777806551621951187L;
					this.aLong8 += (long) local129 * -8636336681283858287L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method836((byte) -114);
				local129 = arg2;
				if (arg2 > this.anInt131 * 1716434415) {
					local129 = this.anInt131 * 1716434415;
				}
				System.arraycopy(this.aByteArray12, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong8 += (long) local129 * -8636336681283858287L;
			}
			if (this.aLong7 * 5576541888797144539L != -1L) {
				if (this.aLong7 * 5576541888797144539L > this.aLong8 * -132147995563560847L && arg2 > 0) {
					local129 = arg1 + (int) (this.aLong7 * 5576541888797144539L - this.aLong8 * -132147995563560847L);
					if (local129 > arg2 + arg1) {
						local129 = arg1 + arg2;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong8 += -8636336681283858287L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong7 * 5576541888797144539L >= local82 && this.aLong7 * 5576541888797144539L < (long) local86 + local82) {
					local327 = this.aLong7 * 5576541888797144539L;
				} else if (local82 >= this.aLong7 * 5576541888797144539L && local82 < (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
					local327 = local82;
				}
				if (this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267) > local82 && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= local82 + (long) local86) {
					local329 = this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267);
				} else if ((long) local86 + local82 > this.aLong7 * 5576541888797144539L && (long) local86 + local82 <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
					local329 = local82 + (long) local86;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray13, (int) (local327 - this.aLong7 * 5576541888797144539L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong8 * -132147995563560847L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong8 * -132147995563560847L));
						this.aLong8 = local329 * -8636336681283858287L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong9 = 4777806551621951187L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abp", name = "e", descriptor = "(I)V")
	public void method830(@OriginalArg(0) int arg0) throws IOException {
		this.method818((byte) 0);
		this.aClass38_1.method732(-986398221);
	}

	@OriginalMember(owner = "client!abp", name = "v", descriptor = "([BII)V")
	public void method831(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong7 * 5576541888797144539L != -1L && this.aLong8 * -132147995563560847L >= this.aLong7 * 5576541888797144539L && (long) arg2 + this.aLong8 * -132147995563560847L <= (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
				System.arraycopy(this.aByteArray13, (int) (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L), arg0, arg1, arg2);
				this.aLong8 += (long) arg2 * -8636336681283858287L;
				return;
			}
			@Pc(82) long local82 = this.aLong8 * -132147995563560847L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong8 * -132147995563560847L >= this.aLong5 * 403697080057429987L && this.aLong8 * -132147995563560847L < (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
				local129 = (int) ((long) (this.anInt131 * 1716434415) - (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray12, (int) (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L), arg0, arg1, local129);
				this.aLong8 += (long) local129 * -8636336681283858287L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray12.length) {
				this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
				this.aLong9 = this.aLong8 * -297616410474490659L;
				while (arg2 > 0) {
					local129 = this.aClass38_1.method726(arg0, arg1, arg2, (byte) 31);
					if (local129 == -1) {
						break;
					}
					this.aLong9 += (long) local129 * -4777806551621951187L;
					this.aLong8 += (long) local129 * -8636336681283858287L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method836((byte) -83);
				local129 = arg2;
				if (arg2 > this.anInt131 * 1716434415) {
					local129 = this.anInt131 * 1716434415;
				}
				System.arraycopy(this.aByteArray12, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong8 += (long) local129 * -8636336681283858287L;
			}
			if (this.aLong7 * 5576541888797144539L != -1L) {
				if (this.aLong7 * 5576541888797144539L > this.aLong8 * -132147995563560847L && arg2 > 0) {
					local129 = arg1 + (int) (this.aLong7 * 5576541888797144539L - this.aLong8 * -132147995563560847L);
					if (local129 > arg2 + arg1) {
						local129 = arg1 + arg2;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong8 += -8636336681283858287L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong7 * 5576541888797144539L >= local82 && this.aLong7 * 5576541888797144539L < (long) local86 + local82) {
					local327 = this.aLong7 * 5576541888797144539L;
				} else if (local82 >= this.aLong7 * 5576541888797144539L && local82 < (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
					local327 = local82;
				}
				if (this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267) > local82 && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= local82 + (long) local86) {
					local329 = this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267);
				} else if ((long) local86 + local82 > this.aLong7 * 5576541888797144539L && (long) local86 + local82 <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
					local329 = local82 + (long) local86;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray13, (int) (local327 - this.aLong7 * 5576541888797144539L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong8 * -132147995563560847L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong8 * -132147995563560847L));
						this.aLong8 = local329 * -8636336681283858287L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong9 = 4777806551621951187L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abp", name = "o", descriptor = "([BII)V")
	public void method832(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong7 * 5576541888797144539L != -1L && this.aLong8 * -132147995563560847L >= this.aLong7 * 5576541888797144539L && (long) arg2 + this.aLong8 * -132147995563560847L <= (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
				System.arraycopy(this.aByteArray13, (int) (this.aLong8 * -132147995563560847L - this.aLong7 * 5576541888797144539L), arg0, arg1, arg2);
				this.aLong8 += (long) arg2 * -8636336681283858287L;
				return;
			}
			@Pc(82) long local82 = this.aLong8 * -132147995563560847L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong8 * -132147995563560847L >= this.aLong5 * 403697080057429987L && this.aLong8 * -132147995563560847L < (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
				local129 = (int) ((long) (this.anInt131 * 1716434415) - (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray12, (int) (this.aLong8 * -132147995563560847L - this.aLong5 * 403697080057429987L), arg0, arg1, local129);
				this.aLong8 += (long) local129 * -8636336681283858287L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray12.length) {
				this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
				this.aLong9 = this.aLong8 * -297616410474490659L;
				while (arg2 > 0) {
					local129 = this.aClass38_1.method726(arg0, arg1, arg2, (byte) 105);
					if (local129 == -1) {
						break;
					}
					this.aLong9 += (long) local129 * -4777806551621951187L;
					this.aLong8 += (long) local129 * -8636336681283858287L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method836((byte) -69);
				local129 = arg2;
				if (arg2 > this.anInt131 * 1716434415) {
					local129 = this.anInt131 * 1716434415;
				}
				System.arraycopy(this.aByteArray12, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong8 += (long) local129 * -8636336681283858287L;
			}
			if (this.aLong7 * 5576541888797144539L != -1L) {
				if (this.aLong7 * 5576541888797144539L > this.aLong8 * -132147995563560847L && arg2 > 0) {
					local129 = arg1 + (int) (this.aLong7 * 5576541888797144539L - this.aLong8 * -132147995563560847L);
					if (local129 > arg2 + arg1) {
						local129 = arg1 + arg2;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong8 += -8636336681283858287L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong7 * 5576541888797144539L >= local82 && this.aLong7 * 5576541888797144539L < (long) local86 + local82) {
					local327 = this.aLong7 * 5576541888797144539L;
				} else if (local82 >= this.aLong7 * 5576541888797144539L && local82 < (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L) {
					local327 = local82;
				}
				if (this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267) > local82 && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= local82 + (long) local86) {
					local329 = this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267);
				} else if ((long) local86 + local82 > this.aLong7 * 5576541888797144539L && (long) local86 + local82 <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
					local329 = local82 + (long) local86;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray13, (int) (local327 - this.aLong7 * 5576541888797144539L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong8 * -132147995563560847L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong8 * -132147995563560847L));
						this.aLong8 = local329 * -8636336681283858287L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong9 = 4777806551621951187L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abp", name = "s", descriptor = "()V")
	void method833() throws IOException {
		this.anInt131 = 0;
		if (this.aLong8 * -132147995563560847L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
			this.aLong9 = this.aLong8 * -297616410474490659L;
		}
		this.aLong5 = this.aLong8 * -2300889966096247141L;
		while (this.anInt131 * 1716434415 < this.aByteArray12.length) {
			@Pc(48) int local48 = this.aByteArray12.length - this.anInt131 * 1716434415;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass38_1.method726(this.aByteArray12, this.anInt131 * 1716434415, local48, (byte) 21);
			if (local65 == -1) {
				break;
			}
			this.aLong9 += (long) local65 * -4777806551621951187L;
			this.anInt131 += local65 * 1330714895;
		}
	}

	@OriginalMember(owner = "client!abp", name = "y", descriptor = "()V")
	void method834() throws IOException {
		this.anInt131 = 0;
		if (this.aLong8 * -132147995563560847L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
			this.aLong9 = this.aLong8 * -297616410474490659L;
		}
		this.aLong5 = this.aLong8 * -2300889966096247141L;
		while (this.anInt131 * 1716434415 < this.aByteArray12.length) {
			@Pc(48) int local48 = this.aByteArray12.length - this.anInt131 * 1716434415;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass38_1.method726(this.aByteArray12, this.anInt131 * 1716434415, local48, (byte) -58);
			if (local65 == -1) {
				break;
			}
			this.aLong9 += (long) local65 * -4777806551621951187L;
			this.anInt131 += local65 * 1330714895;
		}
	}

	@OriginalMember(owner = "client!abp", name = "x", descriptor = "()V")
	void method835() throws IOException {
		this.anInt131 = 0;
		if (this.aLong8 * -132147995563560847L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
			this.aLong9 = this.aLong8 * -297616410474490659L;
		}
		this.aLong5 = this.aLong8 * -2300889966096247141L;
		while (this.anInt131 * 1716434415 < this.aByteArray12.length) {
			@Pc(48) int local48 = this.aByteArray12.length - this.anInt131 * 1716434415;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass38_1.method726(this.aByteArray12, this.anInt131 * 1716434415, local48, (byte) -21);
			if (local65 == -1) {
				break;
			}
			this.aLong9 += (long) local65 * -4777806551621951187L;
			this.anInt131 += local65 * 1330714895;
		}
	}

	@OriginalMember(owner = "client!abp", name = "w", descriptor = "(B)V")
	void method836(@OriginalArg(0) byte arg0) throws IOException {
		this.anInt131 = 0;
		if (this.aLong8 * -132147995563560847L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
			this.aLong9 = this.aLong8 * -297616410474490659L;
		}
		this.aLong5 = this.aLong8 * -2300889966096247141L;
		while (this.anInt131 * 1716434415 < this.aByteArray12.length) {
			@Pc(48) int local48 = this.aByteArray12.length - this.anInt131 * 1716434415;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass38_1.method726(this.aByteArray12, this.anInt131 * 1716434415, local48, (byte) -3);
			if (local65 == -1) {
				break;
			}
			this.aLong9 += (long) local65 * -4777806551621951187L;
			this.anInt131 += local65 * 1330714895;
		}
	}

	@OriginalMember(owner = "client!abp", name = "b", descriptor = "()V")
	void method837() throws IOException {
		if (this.aLong7 * 5576541888797144539L == -1L) {
			return;
		}
		if (this.aLong7 * 5576541888797144539L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong7 * 5576541888797144539L);
			this.aLong9 = this.aLong7 * 4877476641905341055L;
		}
		this.aClass38_1.method722(this.aByteArray13, 0, this.anInt132 * -966644267, -1612413244);
		this.aLong9 += (long) this.anInt132 * -4132142083450567823L;
		if (this.aLong9 * -9152026569603950939L > this.aLong4 * 8757058546879407197L) {
			this.aLong4 = this.aLong9 * 8238481981032781545L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong7 * 5576541888797144539L >= this.aLong5 * 403697080057429987L && this.aLong7 * 5576541888797144539L < this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
			local68 = this.aLong7 * 5576541888797144539L;
		} else if (this.aLong5 * 403697080057429987L >= this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L < this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local68 = this.aLong5 * 403697080057429987L;
		}
		if ((long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L > this.aLong5 * 403697080057429987L && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
			local70 = (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L;
		} else if ((long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L > this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415) <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local70 = (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray13, (int) (local68 - this.aLong7 * 5576541888797144539L), this.aByteArray12, (int) (local68 - this.aLong5 * 403697080057429987L), local245);
		}
		this.aLong7 = 4956407829330264493L;
		this.anInt132 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "h", descriptor = "()V")
	void method838() throws IOException {
		if (this.aLong7 * 5576541888797144539L == -1L) {
			return;
		}
		if (this.aLong7 * 5576541888797144539L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong7 * 5576541888797144539L);
			this.aLong9 = this.aLong7 * 4877476641905341055L;
		}
		this.aClass38_1.method722(this.aByteArray13, 0, this.anInt132 * -966644267, -1191342186);
		this.aLong9 += (long) this.anInt132 * -4132142083450567823L;
		if (this.aLong9 * -9152026569603950939L > this.aLong4 * 8757058546879407197L) {
			this.aLong4 = this.aLong9 * 8238481981032781545L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong7 * 5576541888797144539L >= this.aLong5 * 403697080057429987L && this.aLong7 * 5576541888797144539L < this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415)) {
			local68 = this.aLong7 * 5576541888797144539L;
		} else if (this.aLong5 * 403697080057429987L >= this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L < this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local68 = this.aLong5 * 403697080057429987L;
		}
		if ((long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L > this.aLong5 * 403697080057429987L && (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L <= (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L) {
			local70 = (long) (this.anInt132 * -966644267) + this.aLong7 * 5576541888797144539L;
		} else if ((long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L > this.aLong7 * 5576541888797144539L && this.aLong5 * 403697080057429987L + (long) (this.anInt131 * 1716434415) <= this.aLong7 * 5576541888797144539L + (long) (this.anInt132 * -966644267)) {
			local70 = (long) (this.anInt131 * 1716434415) + this.aLong5 * 403697080057429987L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray13, (int) (local68 - this.aLong7 * 5576541888797144539L), this.aByteArray12, (int) (local68 - this.aLong5 * 403697080057429987L), local245);
		}
		this.aLong7 = 4956407829330264493L;
		this.anInt132 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "z", descriptor = "(J)V")
	public void method839(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.aLong8 = arg0 * -8636336681283858287L;
	}

	@OriginalMember(owner = "client!abp", name = "q", descriptor = "()V")
	void method840() throws IOException {
		this.anInt131 = 0;
		if (this.aLong8 * -132147995563560847L != this.aLong9 * -9152026569603950939L) {
			this.aClass38_1.method723(this.aLong8 * -132147995563560847L);
			this.aLong9 = this.aLong8 * -297616410474490659L;
		}
		this.aLong5 = this.aLong8 * -2300889966096247141L;
		while (this.anInt131 * 1716434415 < this.aByteArray12.length) {
			@Pc(48) int local48 = this.aByteArray12.length - this.anInt131 * 1716434415;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass38_1.method726(this.aByteArray12, this.anInt131 * 1716434415, local48, (byte) 22);
			if (local65 == -1) {
				break;
			}
			this.aLong9 += (long) local65 * -4777806551621951187L;
			this.anInt131 += local65 * 1330714895;
		}
	}
}
