package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class240 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!en;")
	Interface22 anInterface22_1;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!aap;")
	Class18 aClass18_13;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	int anInt3868;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	int anInt3867;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!aan;")
	Class16 aClass16_23;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "(Lclient!hq;Lclient!hf;S)V")
	static void method25964(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) short arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt4011 * 532402067 == -1) {
			@Pc(123) Class312[] local123 = arg0.method27329(1896362516);
			for (local77 = 0; local77 < local123.length && arg1 != local123[local77]; local77++) {
			}
			if (local77 >= local123.length) {
				return;
			}
			Class713.method37023(local123, local77 + 1, local123, local77, local123.length - local77 - 1);
			local123[local123.length - 1] = arg1;
			return;
		}
		@Pc(15) Class312 local15 = arg0.method27321(arg1.anInt4026 * 897022795, 70067553);
		if (local15 == null) {
			return;
		}
		if (local15.aClass312Array2 == local15.aClass312Array1) {
			local15.aClass312Array1 = new Class312[local15.aClass312Array2.length];
			local15.aClass312Array1[local15.aClass312Array1.length - 1] = arg1;
			Class713.method37023(local15.aClass312Array2, 0, local15.aClass312Array1, 0, arg1.anInt4011 * 532402067);
			Class713.method37023(local15.aClass312Array2, arg1.anInt4011 * 532402067 + 1, local15.aClass312Array1, arg1.anInt4011 * 532402067, local15.aClass312Array2.length - arg1.anInt4011 * 532402067 - 1);
			return;
		}
		local77 = 0;
		@Pc(80) Class312[] local80 = local15.aClass312Array1;
		while (local77 < local80.length && local80[local77] != arg1) {
			local77++;
		}
		if (local77 >= local80.length) {
			return;
		}
		Class713.method37023(local80, local77 + 1, local80, local77, local80.length - local77 - 1);
		local80[local15.aClass312Array1.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "abp", descriptor = "(Lclient!yf;I)V")
	static void method25965(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class557.aClass297_1.method26715(local12, 1162587108).method26838(1689751145);
	}

	@OriginalMember(owner = "client!eb", name = "aaw", descriptor = "(Lclient!yf;I)V")
	static void method25966(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (Class93_Sub1_Sub2.aClass170Array1 == null || local12 >= Class623.anInt5843 * 1581594575 || !Class93_Sub1_Sub2.aClass170Array1[local12].aString91.equalsIgnoreCase(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "wi", descriptor = "(Lclient!yf;I)V")
	static void method25967(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8654(local12, -1445626955);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(II)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass18_13 = new Class18();
		this.anInt3868 = arg0 * -2043568369;
		this.anInt3867 = arg0 * -1787761409;
		@Pc(18) int local18;
		for (local18 = 1; local18 + local18 < arg0 && local18 < arg1; local18 += local18) {
		}
		this.aClass16_23 = new Class16(local18);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class240(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "ai", descriptor = "()I")
	public int method25919() {
		return this.anInt3868 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(Lclient!asa;I)V")
	void method25920(@OriginalArg(0) Class93_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			arg0.method23981(-1173012705);
			arg0.method23988((short) 17433);
			this.anInt3867 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "(J)V")
	public void method25921(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		this.method25920(local5, -1460770314);
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(Lclient!asa;)V")
	void method25922(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23981(505637507);
			arg0.method23988((short) 976);
			this.anInt3867 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Ljava/lang/Object;J)V")
	public void method25923(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25924(arg0, arg1, 1, -663253340);
	}

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "(Ljava/lang/Object;JII)V")
	public void method25924(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt3868 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25959(arg1);
		this.anInt3867 -= arg2 * -1787761409;
		while (this.anInt3867 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method244((byte) 8);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23556(-1974384167)) {
			}
			this.method25920(local31, -1460770314);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26424(local31.method23555((byte) 62), -448700857);
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method221(local64, arg1);
		this.aClass18_13.method268(local64, 192874132);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(IB)V")
	public void method25925(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(-620857028); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(1103003723)) {
			if (local5.method23556(-2112028257)) {
				if (local5.method23555((byte) 29) == null) {
					local5.method23981(384248585);
					local5.method23988((short) 4376);
					this.anInt3867 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23555((byte) 87), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32971(local55, local5, 2014651755);
				local5.method23981(-304369035);
				local5.method23988((short) 22917);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "(B)V")
	public void method25926(@OriginalArg(0) byte arg0) {
		this.aClass18_13.method245(1909241476);
		this.aClass16_23.method219((byte) 100);
		this.anInt3867 = this.anInt3868 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "(I)I")
	public int method25927(@OriginalArg(0) int arg0) {
		return this.anInt3868 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(B)I")
	public int method25928(@OriginalArg(0) byte arg0) {
		return this.anInt3867 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	public int method25929(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method246(1924288406); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method253(-1670286234)) {
			if (!local7.method23556(-1980734972)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public void method25930(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(-1189830953); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(1995593215)) {
			if (local5.method23556(-1616773369)) {
				local5.method23981(-448350947);
				local5.method23988((short) -6790);
				this.anInt3867 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(Lclient!en;)V")
	public void method25931(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(J)Ljava/lang/Object;")
	public Object method25932(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(14) Object local14 = local5.method23555((byte) 65);
		if (local14 == null) {
			local5.method23981(-1558519761);
			local5.method23988((short) 9120);
			this.anInt3867 += local5.anInt3214 * 703212397;
			return null;
		}
		if (local5.method23556(-2116266441)) {
			@Pc(46) Class93_Sub1_Sub12_Sub1 local46 = new Class93_Sub1_Sub12_Sub1(local14, local5.anInt3214 * 461171603);
			this.aClass16_23.method221(local46, local5.aLong232 * -3750704643647536275L);
			this.aClass18_13.method268(local46, 1868030976);
			local46.aLong233 = 0L;
			local5.method23981(-575019337);
			local5.method23988((short) 5341);
		} else {
			this.aClass18_13.method268(local5, 1791303947);
			local5.aLong233 = 0L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!asa;)V")
	void method25933(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23981(1307701514);
			arg0.method23988((short) 672);
			this.anInt3867 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "(Lclient!en;)V")
	public void method25934(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "(J)Ljava/lang/Object;")
	public Object method25935(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(14) Object local14 = local5.method23555((byte) 122);
		if (local14 == null) {
			local5.method23981(1465949841);
			local5.method23988((short) -5129);
			this.anInt3867 += local5.anInt3214 * 703212397;
			return null;
		}
		if (local5.method23556(-1829119576)) {
			@Pc(46) Class93_Sub1_Sub12_Sub1 local46 = new Class93_Sub1_Sub12_Sub1(local14, local5.anInt3214 * 461171603);
			this.aClass16_23.method221(local46, local5.aLong232 * -3750704643647536275L);
			this.aClass18_13.method268(local46, 171799684);
			local46.aLong233 = 0L;
			local5.method23981(1910767849);
			local5.method23988((short) -6860);
		} else {
			this.aClass18_13.method268(local5, 1569428295);
			local5.aLong233 = 0L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(J)V")
	public void method25936(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		this.method25920(local5, -1460770314);
	}

	@OriginalMember(owner = "client!eb", name = "as", descriptor = "()I")
	public int method25937() {
		return this.anInt3867 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lclient!asa;)V")
	void method25938(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23981(1667098512);
			arg0.method23988((short) 23297);
			this.anInt3867 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "(I)Ljava/lang/Object;")
	public Object method25939(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1960708262);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 106);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1634668355);
			local17.method23981(-456004186);
			local17.method23988((short) 16430);
			this.anInt3867 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "am", descriptor = "()I")
	public int method25940() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method246(-1798393044); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method253(-1980484434)) {
			if (!local7.method23556(-2073456423)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(Ljava/lang/Object;J)V")
	public void method25941(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25924(arg0, arg1, 1, -1702550854);
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(Ljava/lang/Object;JI)V")
	public void method25942(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3868 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25959(arg1);
		this.anInt3867 -= arg2 * -1787761409;
		while (this.anInt3867 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method244((byte) 8);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23556(-2104261074)) {
			}
			this.method25920(local31, -1460770314);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26424(local31.method23555((byte) 95), 2119021149);
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method221(local64, arg1);
		this.aClass18_13.method268(local64, 744825786);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(Ljava/lang/Object;JI)V")
	public void method25943(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3868 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25959(arg1);
		this.anInt3867 -= arg2 * -1787761409;
		while (this.anInt3867 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method244((byte) 8);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23556(-1833188657)) {
			}
			this.method25920(local31, -1460770314);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26424(local31.method23555((byte) 44), -409022133);
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method221(local64, arg1);
		this.aClass18_13.method268(local64, 1468593350);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "ax", descriptor = "()Ljava/lang/Object;")
	public Object method25944() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method220((byte) -1);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 46);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1642065706);
			local16.method23981(989367012);
			local16.method23988((short) -26090);
			this.anInt3867 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Lclient!en;B)V")
	public void method25945(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) byte arg1) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "ag", descriptor = "(I)V")
	public void method25946(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(1739224515); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(-1059286466)) {
			if (local5.method23556(-1881548101)) {
				if (local5.method23555((byte) 114) == null) {
					local5.method23981(-1160639448);
					local5.method23988((short) 26724);
					this.anInt3867 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23555((byte) 113), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32971(local55, local5, 2146541380);
				local5.method23981(-203622195);
				local5.method23988((short) 4970);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ah", descriptor = "()V")
	public void method25947() {
		this.aClass18_13.method245(714076558);
		this.aClass16_23.method219((byte) 87);
		this.anInt3867 = this.anInt3868 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "al", descriptor = "()V")
	public void method25948() {
		this.aClass18_13.method245(1447980948);
		this.aClass16_23.method219((byte) 81);
		this.anInt3867 = this.anInt3868 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "()V")
	public void method25949() {
		this.aClass18_13.method245(-1705807389);
		this.aClass16_23.method219((byte) 123);
		this.anInt3867 = this.anInt3868 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "(I)V")
	public void method25950(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(104757745); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(2086619674)) {
			if (local5.method23556(-1638796038)) {
				if (local5.method23555((byte) 79) == null) {
					local5.method23981(-693735869);
					local5.method23988((short) -24925);
					this.anInt3867 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23555((byte) 63), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32971(local55, local5, 1977782106);
				local5.method23981(-1561163232);
				local5.method23988((short) 15322);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "aw", descriptor = "()I")
	public int method25951() {
		return this.anInt3868 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "(I)Ljava/lang/Object;")
	public Object method25952(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method220((byte) -19);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 37);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1564474157);
			local16.method23981(833561440);
			local16.method23988((short) -24300);
			this.anInt3867 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "at", descriptor = "()I")
	public int method25953() {
		return this.anInt3867 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "ad", descriptor = "()I")
	public int method25954() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method246(-1261131411); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method253(1247246142)) {
			if (!local7.method23556(-1759825438)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "aq", descriptor = "()Ljava/lang/Object;")
	public Object method25955() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method220((byte) -37);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 70);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1864038321);
			local16.method23981(-96687451);
			local16.method23988((short) 23926);
			this.anInt3867 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "au", descriptor = "()V")
	public void method25956() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(1676084538); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(-1091071555)) {
			if (local5.method23556(-1764667555)) {
				local5.method23981(-1494840297);
				local5.method23988((short) -586);
				this.anInt3867 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ar", descriptor = "()V")
	public void method25957() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(-2029280292); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(1337967756)) {
			if (local5.method23556(-1632969554)) {
				local5.method23981(-1216481090);
				local5.method23988((short) 2791);
				this.anInt3867 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ap", descriptor = "()V")
	public void method25958() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(-231759304); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(-784520548)) {
			if (local5.method23556(-1804772023)) {
				local5.method23981(-1288774047);
				local5.method23988((short) -11798);
				this.anInt3867 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(J)V")
	public void method25959(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		this.method25920(local5, -1460770314);
	}

	@OriginalMember(owner = "client!eb", name = "ae", descriptor = "(I)V")
	public void method25960(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(544926503); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253(263346630)) {
			if (local5.method23556(-1964088862)) {
				if (local5.method23555((byte) 66) == null) {
					local5.method23981(1760841202);
					local5.method23988((short) 8270);
					this.anInt3867 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23555((byte) 106), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32971(local55, local5, 1993432178);
				local5.method23981(-1990618953);
				local5.method23988((short) -16631);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "av", descriptor = "()Ljava/lang/Object;")
	public Object method25961() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(2023487996);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 104);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1979916145);
			local17.method23981(530739863);
			local17.method23988((short) -13619);
			this.anInt3867 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "ao", descriptor = "()Ljava/lang/Object;")
	public Object method25962() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1696891385);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 122);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1688311330);
			local17.method23981(2040833930);
			local17.method23988((short) -139);
			this.anInt3867 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "aj", descriptor = "()Ljava/lang/Object;")
	public Object method25963() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1643278698);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23555((byte) 49);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222(1790393301);
			local17.method23981(-1616217594);
			local17.method23988((short) 1919);
			this.anInt3867 += local17.anInt3214 * 703212397;
		}
		return null;
	}
}
