package jagex3;

import java.util.Arrays;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class622 implements Interface5, Interface13 {

	@OriginalMember(owner = "client!vr", name = "aw", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!vr", name = "al", descriptor = "[[I")
	public int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!vr", name = "ac", descriptor = "[Lclient!ou;")
	Class470[] aClass470Array1;

	@OriginalMember(owner = "client!vr", name = "ai", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!vr", name = "ah", descriptor = "[[I")
	public int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	public int anInt5830 = -1368125749;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "[I")
	public int[] anIntArray499 = null;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "[I")
	public int[] anIntArray498 = null;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	int anInt5813 = 0;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	public int anInt5809 = -2000621017;

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
	public int anInt5835 = -1002073573;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public int anInt5831 = -256153741;

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
	public int anInt5811 = 1877640913;

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
	public int anInt5812 = -65366691;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
	public int anInt5832 = -1975567433;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public int anInt5841 = 1896122835;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
	public int anInt5815 = 1765736413;

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
	public int anInt5816 = 1405861053;

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
	public int anInt5817 = -1207382591;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	public int anInt5818 = -216108131;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
	public int anInt5819 = 347248581;

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
	public int anInt5814 = 2100122063;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	public int anInt5806 = 1262317395;

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
	public int anInt5833 = 1473716629;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public int anInt5822 = 166032075;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public int anInt5823 = 1564254695;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	public int anInt5824 = 474689073;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public int anInt5807 = -301996799;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public int anInt5826 = 1168300693;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public int anInt5827 = 0;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
	public int anInt5828 = 0;

	@OriginalMember(owner = "client!vr", name = "ae", descriptor = "I")
	public int anInt5829 = 0;

	@OriginalMember(owner = "client!vr", name = "ag", descriptor = "I")
	public int anInt5810 = 0;

	@OriginalMember(owner = "client!vr", name = "as", descriptor = "I")
	public int anInt5808 = 0;

	@OriginalMember(owner = "client!vr", name = "at", descriptor = "I")
	public int anInt5825 = 0;

	@OriginalMember(owner = "client!vr", name = "ad", descriptor = "I")
	public int anInt5834 = 0;

	@OriginalMember(owner = "client!vr", name = "am", descriptor = "I")
	public int anInt5821 = 0;

	@OriginalMember(owner = "client!vr", name = "au", descriptor = "I")
	public int anInt5836 = 0;

	@OriginalMember(owner = "client!vr", name = "ar", descriptor = "I")
	public int anInt5837 = 0;

	@OriginalMember(owner = "client!vr", name = "ap", descriptor = "I")
	public int anInt5820 = 0;

	@OriginalMember(owner = "client!vr", name = "aq", descriptor = "I")
	public int anInt5838 = 0;

	@OriginalMember(owner = "client!vr", name = "ax", descriptor = "I")
	public int anInt5839 = -1681517537;

	@OriginalMember(owner = "client!vr", name = "av", descriptor = "I")
	public int anInt5840 = -329236623;

	@OriginalMember(owner = "client!vr", name = "ao", descriptor = "Z")
	public boolean aBoolean853 = true;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(ILclient!aan;)V")
	static void method32309(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (-1 != arg0 && arg1.method215((long) arg0) == null) {
			arg1.method221(new Class93(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "(ILclient!aan;)V")
	static void method32312(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (-1 != arg0 && arg1.method215((long) arg0) == null) {
			arg1.method221(new Class93(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!aan;)V")
	static void method32320(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (-1 != arg0 && arg1.method215((long) arg0) == null) {
			arg1.method221(new Class93(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "(ILclient!aan;)V")
	static void method32322(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (-1 != arg0 && arg1.method215((long) arg0) == null) {
			arg1.method221(new Class93(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "aai", descriptor = "(Lclient!yf;I)V")
	static void method32323(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5843 * 1581594575) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].aString90;
		}
	}

	@OriginalMember(owner = "client!vr", name = "ac", descriptor = "(Lclient!yf;B)V")
	static void method32324(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.anInt6051 * -272305733 == 0) {
			return;
		}
		@Pc(19) Class696 local19 = arg0.aClass696Array1[(arg0.anInt6051 -= 142027635) * -272305733];
		arg0.aClass93_Sub1_Sub13_1 = local19.aClass93_Sub1_Sub13_2;
		arg0.aClass560Array2 = arg0.aClass93_Sub1_Sub13_1.aClass560Array1;
		arg0.anIntArray522 = arg0.aClass93_Sub1_Sub13_1.anIntArray259;
		arg0.anInt6050 = local19.anInt6101 * 81006287;
		arg0.anIntArray519 = local19.anIntArray528;
		arg0.anObjectArray44 = local19.anObjectArray46;
		arg0.aLongArray26 = local19.aLongArray28;
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(I)V")
	Class622(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	Class622() {
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32318(arg0, local3, -664450812);
		}
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32318(arg0, local3, 1849300480);
		}
	}

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32318(arg0, local3, -1036399712);
		}
	}

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(II)Z")
	public boolean method32310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt5830 * -727082723) {
			return true;
		} else {
			if (this.anIntArray499 != null) {
				for (@Pc(17) int local17 = 0; local17 < this.anIntArray499.length; local17++) {
					if (arg0 == this.anIntArray499[local17]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)[Lclient!ou;")
	public Class470[] method32311(@OriginalArg(0) byte arg0) {
		if (this.aClass470Array1 != null) {
			return this.aClass470Array1;
		} else if (this.anIntArrayArray65 == null) {
			return null;
		} else {
			this.aClass470Array1 = new Class470[this.anIntArrayArray65.length];
			for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray65.length; local20++) {
				@Pc(27) int local27 = 0;
				@Pc(29) int local29 = 0;
				@Pc(31) int local31 = 0;
				@Pc(33) int local33 = 0;
				@Pc(35) int local35 = 0;
				@Pc(37) int local37 = 0;
				if (this.anIntArrayArray65[local20] != null) {
					local27 = this.anIntArrayArray65[local20][0];
					local29 = this.anIntArrayArray65[local20][1];
					local31 = this.anIntArrayArray65[local20][2];
					local33 = this.anIntArrayArray65[local20][3] << 3;
					local35 = this.anIntArrayArray65[local20][4] << 3;
					local37 = this.anIntArrayArray65[local20][5] << 3;
				}
				if (local27 != 0 || local29 != 0 || local31 != 0 || local33 != 0 || local35 != 0 || local37 != 0) {
					@Pc(116) Class470 local116 = this.aClass470Array1[local20] = new Class470();
					if (local37 != 0) {
						local116.method29560(0.0F, 0.0F, 1.0F, Class464.method29463(local37));
					}
					if (local33 != 0) {
						local116.method29560(1.0F, 0.0F, 0.0F, Class464.method29463(local33));
					}
					if (local35 != 0) {
						local116.method29560(0.0F, 1.0F, 0.0F, Class464.method29463(local35));
					}
					local116.method29568((float) local27, (float) local29, (float) local31);
				}
			}
			return this.aClass470Array1;
		}
	}

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32318(arg0, local3, 955712133);
		}
	}

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "(I)[I")
	public int[] method32313(@OriginalArg(0) int arg0) {
		@Pc(4) Class16 local4 = new Class16(16);
		Class462.method29457(this.anInt5830 * -727082723, local4, -468643128);
		@Pc(17) int[] local17;
		@Pc(19) int local19;
		if (this.anIntArray499 != null) {
			local17 = this.anIntArray499;
			for (local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) int local27 = local17[local19];
				Class462.method29457(local27, local4, -1362521190);
			}
		}
		Class462.method29457(this.anInt5809 * -1755274647, local4, -2139669681);
		Class462.method29457(this.anInt5835 * -1352988691, local4, -1806132003);
		Class462.method29457(this.anInt5831 * 601549381, local4, -1808133980);
		Class462.method29457(this.anInt5811 * 269905359, local4, -1391305667);
		Class462.method29457(this.anInt5812 * -1383884533, local4, -1474689217);
		Class462.method29457(this.anInt5832 * -2004980231, local4, -1350730703);
		Class462.method29457(this.anInt5841 * 1046628773, local4, -1716777698);
		Class462.method29457(this.anInt5815 * 884977547, local4, -833351937);
		Class462.method29457(this.anInt5816 * 1798234475, local4, -469659204);
		Class462.method29457(this.anInt5817 * 1632091583, local4, -2047471196);
		Class462.method29457(this.anInt5818 * -2077928117, local4, -1703073198);
		Class462.method29457(this.anInt5819 * 1363226867, local4, -1538645539);
		Class462.method29457(this.anInt5814 * -2038961455, local4, -1374688779);
		Class462.method29457(this.anInt5806 * 285037349, local4, -681714636);
		Class462.method29457(this.anInt5833 * 1183309379, local4, -688646696);
		Class462.method29457(this.anInt5822 * 736304413, local4, -1731639512);
		Class462.method29457(this.anInt5823 * 252124713, local4, -446557694);
		Class462.method29457(this.anInt5824 * 760255791, local4, -595702477);
		Class462.method29457(this.anInt5807 * 136766719, local4, -562026421);
		Class462.method29457(this.anInt5826 * -589963453, local4, -855182085);
		local17 = new int[local4.method218(1004618029)];
		local19 = 0;
		@Pc(183) Iterator local183 = local4.iterator();
		while (local183.hasNext()) {
			@Pc(190) Class93 local190 = (Class93) local183.next();
			local17[local19++] = (int) (local190.aLong232 * -3750704643647536275L);
		}
		return local17;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "()I")
	public int method32314() {
		if (this.anInt5830 * -727082723 != -1) {
			return this.anInt5830 * -727082723;
		} else if (this.anIntArray499 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) (this.anInt5813 * -612334255));
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray498[local24]; local24++) {
				local22 -= this.anIntArray498[local24];
			}
			return this.anIntArray499[local24];
		}
	}

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "(I)I")
	public int method32315(@OriginalArg(0) int arg0) {
		if (this.anInt5830 * -727082723 != -1) {
			return this.anInt5830 * -727082723;
		} else if (this.anIntArray499 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) (this.anInt5813 * -612334255));
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray498[local24]; local24++) {
				local22 -= this.anIntArray498[local24];
			}
			return this.anIntArray499[local24];
		}
	}

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "(Lclient!alw;I)V")
	void method32316(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5830 = arg0.method22448(-1563704729) * 1368125749;
			this.anInt5831 = arg0.method22448(-1106660033) * 256153741;
		} else if (arg1 == 2) {
			this.anInt5818 = arg0.method22448(-1411778841) * 216108131;
		} else if (arg1 == 3) {
			this.anInt5819 = arg0.method22448(-1219173052) * -347248581;
		} else if (arg1 == 4) {
			this.anInt5814 = arg0.method22448(-805454857) * -2100122063;
		} else if (arg1 == 5) {
			this.anInt5806 = arg0.method22448(-103703514) * -1262317395;
		} else if (arg1 == 6) {
			this.anInt5841 = arg0.method22448(-325261301) * -1896122835;
		} else if (arg1 == 7) {
			this.anInt5815 = arg0.method22448(-1717074430) * -1765736413;
		} else if (arg1 == 8) {
			this.anInt5816 = arg0.method22448(-1251537139) * -1405861053;
		} else if (arg1 == 9) {
			this.anInt5817 = arg0.method22448(-917409113) * 1207382591;
		} else if (arg1 == 26) {
			this.anInt5827 = (short) (arg0.method22425((short) 16384) * 4) * 6321239;
			this.anInt5828 = (short) (arg0.method22425((short) 16384) * 4) * -1626384457;
		} else {
			@Pc(136) int local136;
			@Pc(169) int local169;
			if (arg1 == 27) {
				local136 = arg0.method22425((short) 16384);
				if (this.anIntArrayArray65 == null) {
					this.anIntArrayArray65 = new int[local136 + 1][];
				} else if (local136 >= this.anIntArrayArray65.length) {
					this.anIntArrayArray65 = (int[][]) Arrays.copyOf(this.anIntArrayArray65, local136 + 1);
				}
				this.anIntArrayArray65[local136] = new int[6];
				for (local169 = 0; local169 < 6; local169++) {
					this.anIntArrayArray65[local136][local169] = arg0.method22494((byte) -110);
				}
			} else if (arg1 == 28) {
				local136 = arg0.method22425((short) 16384);
				this.anIntArray497 = new int[local136];
				for (local169 = 0; local169 < local136; local169++) {
					this.anIntArray497[local169] = arg0.method22425((short) 16384);
					if (this.anIntArray497[local169] == 255) {
						this.anIntArray497[local169] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt5808 = arg0.method22425((short) 16384) * -1374739583;
			} else if (arg1 == 30) {
				this.anInt5825 = arg0.method22427(-1434290800) * 1976146631;
			} else if (arg1 == 31) {
				this.anInt5834 = arg0.method22425((short) 16384) * -1603004711;
			} else if (arg1 == 32) {
				this.anInt5821 = arg0.method22427(-1434290800) * -1287744323;
			} else if (arg1 == 33) {
				this.anInt5836 = arg0.method22494((byte) -91) * 1171595739;
			} else if (arg1 == 34) {
				this.anInt5837 = arg0.method22425((short) 16384) * -799662027;
			} else if (arg1 == 35) {
				this.anInt5820 = arg0.method22427(-1434290800) * -1498813619;
			} else if (arg1 == 36) {
				this.anInt5838 = arg0.method22494((byte) -34) * 745725929;
			} else if (arg1 == 37) {
				this.anInt5839 = arg0.method22425((short) 16384) * 1681517537;
			} else if (arg1 == 38) {
				this.anInt5809 = arg0.method22448(-1279532977) * 2000621017;
			} else if (arg1 == 39) {
				this.anInt5835 = arg0.method22448(-88784940) * 1002073573;
			} else if (arg1 == 40) {
				this.anInt5811 = arg0.method22448(-1947836784) * -1877640913;
			} else if (arg1 == 41) {
				this.anInt5812 = arg0.method22448(-1672328760) * 65366691;
			} else if (arg1 == 42) {
				this.anInt5832 = arg0.method22448(-862563401) * 1975567433;
			} else if (arg1 == 43) {
				arg0.method22427(-1434290800);
			} else if (arg1 == 44) {
				arg0.method22427(-1434290800);
			} else if (arg1 == 45) {
				this.anInt5840 = arg0.method22427(-1434290800) * 329236623;
			} else if (arg1 == 46) {
				this.anInt5833 = arg0.method22448(-1020359593) * -1473716629;
			} else if (arg1 == 47) {
				this.anInt5822 = arg0.method22448(-478698482) * -166032075;
			} else if (arg1 == 48) {
				this.anInt5823 = arg0.method22448(-1039918506) * -1564254695;
			} else if (arg1 == 49) {
				this.anInt5824 = arg0.method22448(-1760225803) * -474689073;
			} else if (arg1 == 50) {
				this.anInt5807 = arg0.method22448(-342498414) * 301996799;
			} else if (arg1 == 51) {
				this.anInt5826 = arg0.method22448(-344735342) * -1168300693;
			} else if (arg1 == 52) {
				local136 = arg0.method22425((short) 16384);
				this.anIntArray499 = new int[local136];
				this.anIntArray498 = new int[local136];
				for (local169 = 0; local169 < local136; local169++) {
					this.anIntArray499[local169] = arg0.method22448(-1772950108);
					@Pc(499) int local499 = arg0.method22425((short) 16384);
					this.anIntArray498[local169] = local499;
					this.anInt5813 += local499 * 2145248177;
				}
			} else if (arg1 == 53) {
				this.aBoolean853 = false;
			} else if (arg1 == 54) {
				this.anInt5829 = (arg0.method22425((short) 16384) << 6) * -1888938299;
				this.anInt5810 = (arg0.method22425((short) 16384) << 6) * -404750269;
			} else if (arg1 == 55) {
				local136 = arg0.method22425((short) 16384);
				if (this.anIntArray500 == null) {
					this.anIntArray500 = new int[local136 + 1];
				} else if (local136 >= this.anIntArray500.length) {
					this.anIntArray500 = Arrays.copyOf(this.anIntArray500, local136 + 1);
				}
				this.anIntArray500[local136] = arg0.method22427(-1434290800);
			} else if (arg1 == 56) {
				local136 = arg0.method22425((short) 16384);
				if (this.anIntArrayArray64 == null) {
					this.anIntArrayArray64 = new int[local136 + 1][];
				} else if (local136 >= this.anIntArrayArray64.length) {
					this.anIntArrayArray64 = (int[][]) Arrays.copyOf(this.anIntArrayArray64, local136 + 1);
				}
				this.anIntArrayArray64[local136] = new int[3];
				for (local169 = 0; local169 < 3; local169++) {
					this.anIntArrayArray64[local136][local169] = arg0.method22494((byte) -88);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32318(arg0, local3, 1346152219);
		}
	}

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "()I")
	public int method32317() {
		if (this.anInt5830 * -727082723 != -1) {
			return this.anInt5830 * -727082723;
		} else if (this.anIntArray499 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) (this.anInt5813 * -612334255));
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray498[local24]; local24++) {
				local22 -= this.anIntArray498[local24];
			}
			return this.anIntArray499[local24];
		}
	}

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "(Lclient!alw;II)V")
	void method32318(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5830 = arg0.method22448(-958258872) * 1368125749;
			this.anInt5831 = arg0.method22448(-49394597) * 256153741;
		} else if (arg1 == 2) {
			this.anInt5818 = arg0.method22448(-1852220384) * 216108131;
		} else if (arg1 == 3) {
			this.anInt5819 = arg0.method22448(-621017640) * -347248581;
		} else if (arg1 == 4) {
			this.anInt5814 = arg0.method22448(-1953005143) * -2100122063;
		} else if (arg1 == 5) {
			this.anInt5806 = arg0.method22448(-765885501) * -1262317395;
		} else if (arg1 == 6) {
			this.anInt5841 = arg0.method22448(-1524892342) * -1896122835;
		} else if (arg1 == 7) {
			this.anInt5815 = arg0.method22448(-699771286) * -1765736413;
		} else if (arg1 == 8) {
			this.anInt5816 = arg0.method22448(-822868928) * -1405861053;
		} else if (arg1 == 9) {
			this.anInt5817 = arg0.method22448(-1418631431) * 1207382591;
		} else if (arg1 == 26) {
			this.anInt5827 = (short) (arg0.method22425((short) 16384) * 4) * 6321239;
			this.anInt5828 = (short) (arg0.method22425((short) 16384) * 4) * -1626384457;
		} else {
			@Pc(136) int local136;
			@Pc(169) int local169;
			if (arg1 == 27) {
				local136 = arg0.method22425((short) 16384);
				if (this.anIntArrayArray65 == null) {
					this.anIntArrayArray65 = new int[local136 + 1][];
				} else if (local136 >= this.anIntArrayArray65.length) {
					this.anIntArrayArray65 = (int[][]) Arrays.copyOf(this.anIntArrayArray65, local136 + 1);
				}
				this.anIntArrayArray65[local136] = new int[6];
				for (local169 = 0; local169 < 6; local169++) {
					this.anIntArrayArray65[local136][local169] = arg0.method22494((byte) -6);
				}
			} else if (arg1 == 28) {
				local136 = arg0.method22425((short) 16384);
				this.anIntArray497 = new int[local136];
				for (local169 = 0; local169 < local136; local169++) {
					this.anIntArray497[local169] = arg0.method22425((short) 16384);
					if (this.anIntArray497[local169] == 255) {
						this.anIntArray497[local169] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt5808 = arg0.method22425((short) 16384) * -1374739583;
			} else if (arg1 == 30) {
				this.anInt5825 = arg0.method22427(-1434290800) * 1976146631;
			} else if (arg1 == 31) {
				this.anInt5834 = arg0.method22425((short) 16384) * -1603004711;
			} else if (arg1 == 32) {
				this.anInt5821 = arg0.method22427(-1434290800) * -1287744323;
			} else if (arg1 == 33) {
				this.anInt5836 = arg0.method22494((byte) -53) * 1171595739;
			} else if (arg1 == 34) {
				this.anInt5837 = arg0.method22425((short) 16384) * -799662027;
			} else if (arg1 == 35) {
				this.anInt5820 = arg0.method22427(-1434290800) * -1498813619;
			} else if (arg1 == 36) {
				this.anInt5838 = arg0.method22494((byte) -119) * 745725929;
			} else if (arg1 == 37) {
				this.anInt5839 = arg0.method22425((short) 16384) * 1681517537;
			} else if (arg1 == 38) {
				this.anInt5809 = arg0.method22448(-1295943052) * 2000621017;
			} else if (arg1 == 39) {
				this.anInt5835 = arg0.method22448(-2133833585) * 1002073573;
			} else if (arg1 == 40) {
				this.anInt5811 = arg0.method22448(-1513005390) * -1877640913;
			} else if (arg1 == 41) {
				this.anInt5812 = arg0.method22448(-2120772709) * 65366691;
			} else if (arg1 == 42) {
				this.anInt5832 = arg0.method22448(-2046478172) * 1975567433;
			} else if (arg1 == 43) {
				arg0.method22427(-1434290800);
			} else if (arg1 == 44) {
				arg0.method22427(-1434290800);
			} else if (arg1 == 45) {
				this.anInt5840 = arg0.method22427(-1434290800) * 329236623;
			} else if (arg1 == 46) {
				this.anInt5833 = arg0.method22448(-2011885075) * -1473716629;
			} else if (arg1 == 47) {
				this.anInt5822 = arg0.method22448(-212328809) * -166032075;
			} else if (arg1 == 48) {
				this.anInt5823 = arg0.method22448(-278170293) * -1564254695;
			} else if (arg1 == 49) {
				this.anInt5824 = arg0.method22448(-1917727801) * -474689073;
			} else if (arg1 == 50) {
				this.anInt5807 = arg0.method22448(-870922570) * 301996799;
			} else if (arg1 == 51) {
				this.anInt5826 = arg0.method22448(-752545624) * -1168300693;
			} else if (arg1 == 52) {
				local136 = arg0.method22425((short) 16384);
				this.anIntArray499 = new int[local136];
				this.anIntArray498 = new int[local136];
				for (local169 = 0; local169 < local136; local169++) {
					this.anIntArray499[local169] = arg0.method22448(-909967190);
					@Pc(499) int local499 = arg0.method22425((short) 16384);
					this.anIntArray498[local169] = local499;
					this.anInt5813 += local499 * 2145248177;
				}
			} else if (arg1 == 53) {
				this.aBoolean853 = false;
			} else if (arg1 == 54) {
				this.anInt5829 = (arg0.method22425((short) 16384) << 6) * -1888938299;
				this.anInt5810 = (arg0.method22425((short) 16384) << 6) * -404750269;
			} else if (arg1 == 55) {
				local136 = arg0.method22425((short) 16384);
				if (this.anIntArray500 == null) {
					this.anIntArray500 = new int[local136 + 1];
				} else if (local136 >= this.anIntArray500.length) {
					this.anIntArray500 = Arrays.copyOf(this.anIntArray500, local136 + 1);
				}
				this.anIntArray500[local136] = arg0.method22427(-1434290800);
			} else if (arg1 == 56) {
				local136 = arg0.method22425((short) 16384);
				if (this.anIntArrayArray64 == null) {
					this.anIntArrayArray64 = new int[local136 + 1][];
				} else if (local136 >= this.anIntArrayArray64.length) {
					this.anIntArrayArray64 = (int[][]) Arrays.copyOf(this.anIntArrayArray64, local136 + 1);
				}
				this.anIntArrayArray64[local136] = new int[3];
				for (local169 = 0; local169 < 3; local169++) {
					this.anIntArrayArray64[local136][local169] = arg0.method22494((byte) -94);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "()[Lclient!ou;")
	public Class470[] method32319() {
		if (this.aClass470Array1 != null) {
			return this.aClass470Array1;
		} else if (this.anIntArrayArray65 == null) {
			return null;
		} else {
			this.aClass470Array1 = new Class470[this.anIntArrayArray65.length];
			for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray65.length; local20++) {
				@Pc(27) int local27 = 0;
				@Pc(29) int local29 = 0;
				@Pc(31) int local31 = 0;
				@Pc(33) int local33 = 0;
				@Pc(35) int local35 = 0;
				@Pc(37) int local37 = 0;
				if (this.anIntArrayArray65[local20] != null) {
					local27 = this.anIntArrayArray65[local20][0];
					local29 = this.anIntArrayArray65[local20][1];
					local31 = this.anIntArrayArray65[local20][2];
					local33 = this.anIntArrayArray65[local20][3] << 3;
					local35 = this.anIntArrayArray65[local20][4] << 3;
					local37 = this.anIntArrayArray65[local20][5] << 3;
				}
				if (local27 != 0 || local29 != 0 || local31 != 0 || local33 != 0 || local35 != 0 || local37 != 0) {
					@Pc(116) Class470 local116 = this.aClass470Array1[local20] = new Class470();
					if (local37 != 0) {
						local116.method29560(0.0F, 0.0F, 1.0F, Class464.method29463(local37));
					}
					if (local33 != 0) {
						local116.method29560(1.0F, 0.0F, 0.0F, Class464.method29463(local33));
					}
					if (local35 != 0) {
						local116.method29560(0.0F, 1.0F, 0.0F, Class464.method29463(local35));
					}
					local116.method29568((float) local27, (float) local29, (float) local31);
				}
			}
			return this.aClass470Array1;
		}
	}

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "()I")
	public int method32321() {
		if (this.anInt5830 * -727082723 != -1) {
			return this.anInt5830 * -727082723;
		} else if (this.anIntArray499 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) (this.anInt5813 * -612334255));
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray498[local24]; local24++) {
				local22 -= this.anIntArray498[local24];
			}
			return this.anIntArray499[local24];
		}
	}
}
