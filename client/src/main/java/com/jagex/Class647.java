package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class647 implements Interface20 {

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "J")
	static final long aLong295 = 4611686018427387904L;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "J")
	static final long aLong296 = 4611686018427387903L;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "J")
	static final long aLong297 = 500L;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "J")
	static final long aLong298 = 1L;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "Lclient!aan;")
	Class16 aClass16_36 = new Class16(128);

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "[I")
	int[] anIntArray504 = new int[Class21.varPlayerTypes.method18262(1305564391)];

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "[I")
	int[] anIntArray505 = new int[Class21.varPlayerTypes.method18262(1453906174)];

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(ZI)I", line = 29)
	public int method32641(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class305.method26797(461865186);
		for (@Pc(15) Class93_Sub11 local15 = (Class93_Sub11) (arg0 ? this.aClass16_36.method227((byte) -49) : this.aClass16_36.method229(1557964484)); local15 != null; local15 = (Class93_Sub11) this.aClass16_36.method229(2025989986)) {
			if ((local15.aLong67 * 80339347373272757L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong67 * 80339347373272757L & 0x4000000000000000L) != 0L) {
					@Pc(41) int local41 = (int) (local15.aLong232 * -3750704643647536275L);
					this.anIntArray505[local41] = this.anIntArray504[local41];
					local15.method23969(354794196);
					return local41;
				}
				local15.method23969(-1677708744);
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wu", name = "ag", descriptor = "(Z)I", line = 29)
	public int method32642(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class305.method26797(1455466020);
		for (@Pc(15) Class93_Sub11 local15 = (Class93_Sub11) (arg0 ? this.aClass16_36.method227((byte) 15) : this.aClass16_36.method229(2146523480)); local15 != null; local15 = (Class93_Sub11) this.aClass16_36.method229(2027647097)) {
			if ((local15.aLong67 * 80339347373272757L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong67 * 80339347373272757L & 0x4000000000000000L) != 0L) {
					@Pc(41) int local41 = (int) (local15.aLong232 * -3750704643647536275L);
					this.anIntArray505[local41] = this.anIntArray504[local41];
					local15.method23969(-698131205);
					return local41;
				}
				local15.method23969(907430576);
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(B)V", line = 45)
	public void method32643(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class21.varPlayerTypes.method18262(1172276198); local1++) {
			@Pc(12) Class108_Sub1 local12 = (Class108_Sub1) Class21.varPlayerTypes.get(local1, -557910454);
			if (local12 != null) {
				this.anIntArray504[local1] = 0;
				this.anIntArray505[local1] = 0;
			}
		}
		this.aClass16_36 = new Class16(128);
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "(Lclient!ec;I)I", line = 56)
	@Override
	public int method33455(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray505[arg0.anInt867 * -1284841473];
	}

	@OriginalMember(owner = "client!wu", name = "ac", descriptor = "(Lclient!ec;)I", line = 56)
	@Override
	public int method33458(@OriginalArg(0) Class108 arg0) {
		return this.anIntArray505[arg0.anInt867 * -1284841473];
	}

	@OriginalMember(owner = "client!wu", name = "ah", descriptor = "(Lclient!ec;)I", line = 56)
	@Override
	public int method33456(@OriginalArg(0) Class108 arg0) {
		return this.anIntArray505[arg0.anInt867 * -1284841473];
	}

	@OriginalMember(owner = "client!wu", name = "al", descriptor = "(Lclient!ec;)I", line = 56)
	@Override
	public int method33457(@OriginalArg(0) Class108 arg0) {
		return this.anIntArray505[arg0.anInt867 * -1284841473];
	}

	@OriginalMember(owner = "client!wu", name = "ai", descriptor = "(Lclient!ec;)I", line = 56)
	@Override
	public int method33459(@OriginalArg(0) Class108 arg0) {
		return this.anIntArray505[arg0.anInt867 * -1284841473];
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(Lclient!ec;II)V", line = 60)
	@Override
	public void method33464(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray505[arg0.anInt867 * -1284841473] = arg1;
		@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) this.aClass16_36.method214((long) (arg0.anInt867 * -1284841473));
		if (local17 == null) {
			local17 = new Class93_Sub11(Class305.method26797(1803801792) + 500L);
			this.aClass16_36.method220(local17, (long) (arg0.anInt867 * -1284841473));
		} else {
			local17.aLong67 = (Class305.method26797(1847845145) + 500L) * -3331835497204133987L;
		}
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(Lclient!ec;I)V", line = 60)
	@Override
	public void method33470(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray505[arg0.anInt867 * -1284841473] = arg1;
		@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) this.aClass16_36.method214((long) (arg0.anInt867 * -1284841473));
		if (local17 == null) {
			local17 = new Class93_Sub11(Class305.method26797(1364302146) + 500L);
			this.aClass16_36.method220(local17, (long) (arg0.anInt867 * -1284841473));
		} else {
			local17.aLong67 = (Class305.method26797(1805564875) + 500L) * -3331835497204133987L;
		}
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "(Lclient!ec;IB)V", line = 70)
	public void setVarValueFromServer(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anIntArray504[arg0.anInt867 * -1284841473] = arg1;
		@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) this.aClass16_36.method214((long) (arg0.anInt867 * -1284841473));
		if (local17 == null) {
			local17 = new Class93_Sub11(4611686018427387905L);
			this.aClass16_36.method220(local17, (long) (arg0.anInt867 * -1284841473));
		} else if (local17.aLong67 * 80339347373272757L != 4611686018427387905L) {
			local17.aLong67 = (Class305.method26797(532155199) + 500L | 0x4000000000000000L) * -3331835497204133987L;
		}
	}

	@OriginalMember(owner = "client!wu", name = "am", descriptor = "(Lclient!ec;I)V", line = 70)
	public void method32645(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray504[arg0.anInt867 * -1284841473] = arg1;
		@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) this.aClass16_36.method214((long) (arg0.anInt867 * -1284841473));
		if (local17 == null) {
			local17 = new Class93_Sub11(4611686018427387905L);
			this.aClass16_36.method220(local17, (long) (arg0.anInt867 * -1284841473));
		} else if (local17.aLong67 * 80339347373272757L != 4611686018427387905L) {
			local17.aLong67 = (Class305.method26797(1519801983) + 500L | 0x4000000000000000L) * -3331835497204133987L;
		}
	}

	@OriginalMember(owner = "client!wu", name = "ad", descriptor = "(Lclient!ec;I)V", line = 70)
	public void method32646(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray504[arg0.anInt867 * -1284841473] = arg1;
		@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) this.aClass16_36.method214((long) (arg0.anInt867 * -1284841473));
		if (local17 == null) {
			local17 = new Class93_Sub11(4611686018427387905L);
			this.aClass16_36.method220(local17, (long) (arg0.anInt867 * -1284841473));
		} else if (local17.aLong67 * 80339347373272757L != 4611686018427387905L) {
			local17.aLong67 = (Class305.method26797(1619260318) + 500L | 0x4000000000000000L) * -3331835497204133987L;
		}
	}

	@OriginalMember(owner = "client!wu", name = "as", descriptor = "(Lclient!kh;)I", line = 82)
	@Override
	public int method33460(@OriginalArg(0) Class379 arg0) {
		return arg0.method28089(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], 586933174);
	}

	@OriginalMember(owner = "client!wu", name = "aw", descriptor = "(Lclient!kh;)I", line = 82)
	@Override
	public int method33461(@OriginalArg(0) Class379 arg0) {
		return arg0.method28089(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], 20153545);
	}

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "(Lclient!kh;I)I", line = 82)
	@Override
	public int method33454(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		return arg0.method28089(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], 1423230146);
	}

	@OriginalMember(owner = "client!wu", name = "at", descriptor = "(Lclient!kh;)I", line = 82)
	@Override
	public int method33462(@OriginalArg(0) Class379 arg0) {
		return arg0.method28089(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], 797054666);
	}

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "(Lclient!kh;II)V", line = 86)
	@Override
	public void method33469(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws Exception_Sub7 {
		@Pc(12) int local12 = arg0.method28094(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], arg1, -2086481720);
		this.method33464(arg0.aClass108_1, local12, 908369267);
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "(Lclient!kh;I)V", line = 86)
	@Override
	public void method33479(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		@Pc(12) int local12 = arg0.method28094(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], arg1, -2109295494);
		this.method33464(arg0.aClass108_1, local12, 908369267);
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "(Lclient!kh;I)V", line = 86)
	@Override
	public void method33463(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		@Pc(12) int local12 = arg0.method28094(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], arg1, -2033314565);
		this.method33464(arg0.aClass108_1, local12, 908369267);
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(Lclient!kh;I)V", line = 86)
	@Override
	public void method33472(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		@Pc(12) int local12 = arg0.method28094(this.anIntArray505[arg0.aClass108_1.anInt867 * -1284841473], arg1, -2038966127);
		this.method33464(arg0.aClass108_1, local12, 908369267);
	}

	@OriginalMember(owner = "client!wu", name = "ae", descriptor = "(Lclient!kh;II)V", line = 92)
	public void method32647(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) int local12 = arg0.method28094(this.anIntArray504[arg0.aClass108_1.anInt867 * -1284841473], arg1, -2036827754);
			this.setVarValueFromServer(arg0.aClass108_1, local12, (byte) 1);
		} catch (@Pc(20) Exception_Sub7 local20) {
		}
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(Lclient!ec;I)J", line = 99)
	@Override
	public long method33465(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "(Lclient!ec;)J", line = 99)
	@Override
	public long method33473(@OriginalArg(0) Class108 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "(Lclient!ec;J)V", line = 103)
	@Override
	public void method33466(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Lclient!ec;J)V", line = 103)
	@Override
	public void method33475(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(Lclient!ec;J)V", line = 103)
	@Override
	public void method33474(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(Lclient!ec;B)Ljava/lang/Object;", line = 107)
	@Override
	public Object method33467(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 107)
	@Override
	public Object method33471(@OriginalArg(0) Class108 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 107)
	@Override
	public Object method33481(@OriginalArg(0) Class108 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 107)
	@Override
	public Object method33482(@OriginalArg(0) Class108 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 107)
	@Override
	public Object method33480(@OriginalArg(0) Class108 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 111)
	@Override
	public void method33478(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 111)
	@Override
	public void method33477(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V", line = 111)
	@Override
	public void method33468(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 111)
	@Override
	public void method33476(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 111)
	@Override
	public void method33483(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wu", name = "av", descriptor = "(III)V", line = 281)
	static void method32648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(13, (long) arg0);
		local4.method21886(-1892259331);
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!wu", name = "bm", descriptor = "(Lclient!yf;I)V", line = 5151)
	static final void method32649(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class677 local18;
		if (arg0.aBoolean875) {
			local18 = arg0.aClass677_2;
		} else {
			local18 = arg0.aClass677_1;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.method33228(local12, -1, -1410519884) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wu", name = "pr", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7804)
	static final void method32650(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray33 = Class499.method30149(local13, arg2, 56984703);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!wu", name = "anp", descriptor = "(Lclient!yf;I)V", line = 12282)
	static final void method32651(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(31) Class472 local31 = Class472.method29535((float) local13, (float) local13, (float) local13);
		if (-1.0F == local31.aFloat317) {
			local31.aFloat317 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat318 == -1.0F) {
			local31.aFloat318 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat319 == -1.0F) {
			local31.aFloat319 = Float.POSITIVE_INFINITY;
		}
		Class65.aClass123_Sub1_2.method8959(local31, 1221966283);
		Class65.aClass123_Sub1_2.method8951((float) local23 / 1000.0F, 232059158);
		local31.method29544();
	}

	@OriginalMember(owner = "client!wu", name = "ary", descriptor = "(Lclient!yf;B)V", line = 12917)
	static final void method32652(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.userFlowFlag1 * 1672118199;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.userFlowFlag2 * -1830493323;
	}

	@OriginalMember(owner = "client!wu", name = "ast", descriptor = "(Lclient!yf;B)V", line = 13188)
	static final void method32653(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub35_3, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 114);
		Class106_Sub1.method5135(-695941709);
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!wu", name = "atl", descriptor = "(Lclient!yf;B)V", line = 13249)
	static final void method32654(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!wu", name = "bba", descriptor = "(Lclient!yf;I)V", line = 14467)
	static final void method32655(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass132_Sub1_Sub1_Sub1_4.method24270(899866876);
	}
}
