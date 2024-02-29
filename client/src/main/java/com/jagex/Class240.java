package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class240 {

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!aap;")
	Class18 aClass18_13;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	int anInt3826;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!aan;")
	Class16 aClass16_23;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	int anInt3827;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!en;")
	Interface22 anInterface22_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 15)
	public Class240(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(Lclient!en;)V", line = 19)
	public void method25826(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "(Lclient!en;)V", line = 19)
	public void method25827(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Lclient!en;B)V", line = 19)
	public void method25828(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) byte arg1) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(II)V", line = 22)
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass18_13 = new Class18();
		this.anInt3827 = arg0 * -2043568369;
		this.anInt3826 = arg0 * -1787761409;
		@Pc(18) int local18;
		for (local18 = 1; local18 + local18 < arg0 && local18 < arg1; local18 += local18) {
		}
		this.aClass16_23 = new Class16(local18);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method25829(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method214(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(14) Object local14 = local5.method23543((byte) 65);
		if (local14 == null) {
			local5.method23969(-1558519761);
			local5.method23976((short) 9120);
			this.anInt3826 += local5.anInt3214 * 703212397;
			return null;
		}
		if (local5.method23544(-2116266441)) {
			@Pc(46) Class93_Sub1_Sub12_Sub1 local46 = new Class93_Sub1_Sub12_Sub1(local14, local5.anInt3214 * 461171603);
			this.aClass16_23.method220(local46, local5.aLong232 * -3750704643647536275L);
			this.aClass18_13.method250(local46, 1868030976);
			local46.aLong233 = 0L;
			local5.method23969(-575019337);
			local5.method23976((short) 5341);
		} else {
			this.aClass18_13.method250(local5, 1791303947);
			local5.aLong233 = 0L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method25830(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method214(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(14) Object local14 = local5.method23543((byte) 122);
		if (local14 == null) {
			local5.method23969(1465949841);
			local5.method23976((short) -5129);
			this.anInt3826 += local5.anInt3214 * 703212397;
			return null;
		}
		if (local5.method23544(-1829119576)) {
			@Pc(46) Class93_Sub1_Sub12_Sub1 local46 = new Class93_Sub1_Sub12_Sub1(local14, local5.anInt3214 * 461171603);
			this.aClass16_23.method220(local46, local5.aLong232 * -3750704643647536275L);
			this.aClass18_13.method250(local46, 171799684);
			local46.aLong233 = 0L;
			local5.method23969(1910767849);
			local5.method23976((short) -6860);
		} else {
			this.aClass18_13.method250(local5, 1569428295);
			local5.aLong233 = 0L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "(J)V", line = 56)
	public void method25831(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method214(arg0);
		this.method25834(local5, -1460770314);
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(J)V", line = 56)
	public void method25832(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method214(arg0);
		this.method25834(local5, -1460770314);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(J)V", line = 56)
	public void method25833(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method214(arg0);
		this.method25834(local5, -1460770314);
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(Lclient!asa;I)V", line = 61)
	void method25834(@OriginalArg(0) Class93_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			arg0.method23969(-1173012705);
			arg0.method23976((short) 17433);
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(Lclient!asa;)V", line = 61)
	void method25835(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969(505637507);
			arg0.method23976((short) 976);
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!asa;)V", line = 61)
	void method25836(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969(1307701514);
			arg0.method23976((short) 672);
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lclient!asa;)V", line = 61)
	void method25837(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969(1667098512);
			arg0.method23976((short) 23297);
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method25838(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25840(arg0, arg1, 1, -663253340);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method25839(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25840(arg0, arg1, 1, -1702550854);
	}

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "(Ljava/lang/Object;JII)V", line = 73)
	public void method25840(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt3827 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25833(arg1);
		this.anInt3826 -= arg2 * -1787761409;
		while (this.anInt3826 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method254((byte) 8);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23544(-1974384167)) {
			}
			this.method25834(local31, -1460770314);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26331(local31.method23543((byte) 62), -448700857);
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method220(local64, arg1);
		this.aClass18_13.method250(local64, 192874132);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(Ljava/lang/Object;JI)V", line = 73)
	public void method25841(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3827 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25833(arg1);
		this.anInt3826 -= arg2 * -1787761409;
		while (this.anInt3826 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method254((byte) 8);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23544(-2104261074)) {
			}
			this.method25834(local31, -1460770314);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26331(local31.method23543((byte) 95), 2119021149);
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method220(local64, arg1);
		this.aClass18_13.method250(local64, 744825786);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(Ljava/lang/Object;JI)V", line = 73)
	public void method25842(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3827 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25833(arg1);
		this.anInt3826 -= arg2 * -1787761409;
		while (this.anInt3826 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method254((byte) 8);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23544(-1833188657)) {
			}
			this.method25834(local31, -1460770314);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26331(local31.method23543((byte) 44), -409022133);
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method220(local64, arg1);
		this.aClass18_13.method250(local64, 1468593350);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(IB)V", line = 94)
	public void method25843(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(-620857028); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(1103003723)) {
			if (local5.method23544(-2112028257)) {
				if (local5.method23543((byte) 29) == null) {
					local5.method23969(384248585);
					local5.method23976((short) 4376);
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543((byte) 87), local5.anInt3214 * 461171603);
				this.aClass16_23.method220(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32758(local55, local5, 2014651755);
				local5.method23969(-304369035);
				local5.method23976((short) 22917);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ag", descriptor = "(I)V", line = 94)
	public void method25844(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(1739224515); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(-1059286466)) {
			if (local5.method23544(-1881548101)) {
				if (local5.method23543((byte) 114) == null) {
					local5.method23969(-1160639448);
					local5.method23976((short) 26724);
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543((byte) 113), local5.anInt3214 * 461171603);
				this.aClass16_23.method220(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32758(local55, local5, 2146541380);
				local5.method23969(-203622195);
				local5.method23976((short) 4970);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "(I)V", line = 94)
	public void method25845(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(104757745); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(2086619674)) {
			if (local5.method23544(-1638796038)) {
				if (local5.method23543((byte) 79) == null) {
					local5.method23969(-693735869);
					local5.method23976((short) -24925);
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543((byte) 63), local5.anInt3214 * 461171603);
				this.aClass16_23.method220(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32758(local55, local5, 1977782106);
				local5.method23969(-1561163232);
				local5.method23976((short) 15322);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ae", descriptor = "(I)V", line = 94)
	public void method25846(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(544926503); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(263346630)) {
			if (local5.method23544(-1964088862)) {
				if (local5.method23543((byte) 66) == null) {
					local5.method23969(1760841202);
					local5.method23976((short) 8270);
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543((byte) 106), local5.anInt3214 * 461171603);
				this.aClass16_23.method220(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32758(local55, local5, 1993432178);
				local5.method23969(-1990618953);
				local5.method23976((short) -16631);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "(B)V", line = 116)
	public void method25847(@OriginalArg(0) byte arg0) {
		this.aClass18_13.method244(1909241476);
		this.aClass16_23.method225((byte) 100);
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ah", descriptor = "()V", line = 116)
	public void method25848() {
		this.aClass18_13.method244(714076558);
		this.aClass16_23.method225((byte) 87);
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "al", descriptor = "()V", line = 116)
	public void method25849() {
		this.aClass18_13.method244(1447980948);
		this.aClass16_23.method225((byte) 81);
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "()V", line = 116)
	public void method25850() {
		this.aClass18_13.method244(-1705807389);
		this.aClass16_23.method225((byte) 123);
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ai", descriptor = "()I", line = 122)
	public int method25851() {
		return this.anInt3827 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "(I)I", line = 122)
	public int method25852(@OriginalArg(0) int arg0) {
		return this.anInt3827 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "aw", descriptor = "()I", line = 122)
	public int method25853() {
		return this.anInt3827 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(B)I", line = 126)
	public int method25854(@OriginalArg(0) byte arg0) {
		return this.anInt3826 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "as", descriptor = "()I", line = 126)
	public int method25855() {
		return this.anInt3826 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "at", descriptor = "()I", line = 126)
	public int method25856() {
		return this.anInt3826 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I", line = 130)
	public int method25857(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method256(1924288406); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method264(-1670286234)) {
			if (!local7.method23544(-1980734972)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "am", descriptor = "()I", line = 130)
	public int method25858() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method256(-1798393044); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method264(-1980484434)) {
			if (!local7.method23544(-2073456423)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "ad", descriptor = "()I", line = 130)
	public int method25859() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method256(-1261131411); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method264(1247246142)) {
			if (!local7.method23544(-1759825438)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 138)
	public void method25860(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(-1189830953); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(1995593215)) {
			if (local5.method23544(-1616773369)) {
				local5.method23969(-448350947);
				local5.method23976((short) -6790);
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "au", descriptor = "()V", line = 138)
	public void method25861() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(1676084538); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(-1091071555)) {
			if (local5.method23544(-1764667555)) {
				local5.method23969(-1494840297);
				local5.method23976((short) -586);
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ar", descriptor = "()V", line = 138)
	public void method25862() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(-2029280292); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(1337967756)) {
			if (local5.method23544(-1632969554)) {
				local5.method23969(-1216481090);
				local5.method23976((short) 2791);
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ap", descriptor = "()V", line = 138)
	public void method25863() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method256(-231759304); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method264(-784520548)) {
			if (local5.method23544(-1804772023)) {
				local5.method23969(-1288774047);
				local5.method23976((short) -11798);
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ax", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method25864() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method227((byte) -1);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 46);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1642065706);
			local16.method23969(989367012);
			local16.method23976((short) -26090);
			this.anInt3826 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "(I)Ljava/lang/Object;", line = 148)
	public Object method25865(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method227((byte) -19);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 37);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1564474157);
			local16.method23969(833561440);
			local16.method23976((short) -24300);
			this.anInt3826 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "aq", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method25866() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method227((byte) -37);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 70);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1864038321);
			local16.method23969(-96687451);
			local16.method23976((short) 23926);
			this.anInt3826 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "(I)Ljava/lang/Object;", line = 164)
	public Object method25867(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1960708262);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 106);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1634668355);
			local17.method23969(-456004186);
			local17.method23976((short) 16430);
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "av", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25868() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(2023487996);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 104);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1979916145);
			local17.method23969(530739863);
			local17.method23976((short) -13619);
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "ao", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25869() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1696891385);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 122);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1688311330);
			local17.method23969(2040833930);
			local17.method23976((short) -139);
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "aj", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25870() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1643278698);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543((byte) 49);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method229(1790393301);
			local17.method23969(-1616217594);
			local17.method23976((short) 1919);
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "(Lclient!hq;Lclient!hf;S)V", line = 449)
	static void method25871(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) short arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt3970 * 532402067 == -1) {
			@Pc(123) Class312[] local123 = arg0.method27233(1896362516);
			for (local77 = 0; local77 < local123.length && arg1 != local123[local77]; local77++) {
			}
			if (local77 >= local123.length) {
				return;
			}
			Class713.method36858(local123, local77 + 1, local123, local77, local123.length - local77 - 1);
			local123[local123.length - 1] = arg1;
			return;
		}
		@Pc(15) Class312 local15 = arg0.method27234(arg1.anInt3985 * 897022795, 70067553);
		if (local15 == null) {
			return;
		}
		if (local15.aClass312Array2 == local15.aClass312Array1) {
			local15.aClass312Array1 = new Class312[local15.aClass312Array2.length];
			local15.aClass312Array1[local15.aClass312Array1.length - 1] = arg1;
			Class713.method36858(local15.aClass312Array2, 0, local15.aClass312Array1, 0, arg1.anInt3970 * 532402067);
			Class713.method36858(local15.aClass312Array2, arg1.anInt3970 * 532402067 + 1, local15.aClass312Array1, arg1.anInt3970 * 532402067, local15.aClass312Array2.length - arg1.anInt3970 * 532402067 - 1);
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
		Class713.method36858(local80, local77 + 1, local80, local77, local80.length - local77 - 1);
		local80[local15.aClass312Array1.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "wi", descriptor = "(Lclient!yf;I)V", line = 9098)
	static final void method25872(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8654(local12, -1445626955);
	}

	@OriginalMember(owner = "client!eb", name = "aaw", descriptor = "(Lclient!yf;I)V", line = 9770)
	static final void method25873(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class93_Sub1_Sub2.aClass170Array1 == null || local12 >= Class623.anInt5682 * 1581594575 || !Class93_Sub1_Sub2.aClass170Array1[local12].aString91.equalsIgnoreCase(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "abp", descriptor = "(Lclient!yf;I)V", line = 9908)
	static final void method25874(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class557.aClass297_1.method26646(local12, 1162587108).method26744(1689751145);
	}
}
