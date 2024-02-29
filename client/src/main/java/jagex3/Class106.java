package jagex3;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public abstract class Class106 {

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
	public static final int anInt880 = 0;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
	public static final int anInt882 = 0;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	public static final int anInt884 = 1;

	@OriginalMember(owner = "client!eu", name = "br", descriptor = "Lclient!zt;")
	public static Class717 aClass717_8;

	@OriginalMember(owner = "client!eu", name = "lf", descriptor = "I")
	public static int anInt891;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
	static int anInt883 = 1119774711;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	static int anInt885 = -898731889;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
	static int anInt881 = 0;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
	static int anInt886 = 0;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	static int anInt887 = 0;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	static int anInt888 = 0;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	static int anInt889 = 0;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
	static int anInt890 = 0;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "Lclient!dh;")
	Class104 aClass104_7;

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "Lclient!aac;")
	protected Class5 aClass5_10;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "(IIIIIII)I")
	public static int method7576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!eu", name = "acz", descriptor = "(Lclient!yf;I)V")
	static void method7577(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByteArray90[local12];
	}

	@OriginalMember(owner = "client!eu", name = "apr", descriptor = "(Lclient!yf;I)V")
	static void method7578(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class618.method32281((byte) -125);
	}

	@OriginalMember(owner = "client!eu", name = "abf", descriptor = "(Lclient!yf;B)V")
	static void method7579(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 < client.anInt3444 * 862418793) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass281Array1[local12].aBoolean676 ? 1 : 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!eu", name = "ev", descriptor = "(II)Z")
	public static boolean method7580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 18 || arg0 == 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "(Lclient!alw;II)Ljava/lang/String;")
	static String method7581(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0.method22644((byte) -79);
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt3070 += Class350.aClass337_1.method27550(arg0.aByteArray58, arg0.anInt3070 * 212851357, local11, 0, local3, (byte) 114) * -1445626955;
			return Class155.method15320(local11, 0, local3, (byte) -75);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!eu", name = "aw", descriptor = "(B)V")
	public static void method7582(@OriginalArg(0) byte arg0) {
		Class625.aClass100_51 = null;
	}

	@OriginalMember(owner = "client!eu", name = "anz", descriptor = "(Lclient!yf;B)V")
	static void method7583(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class65.aClass123_Sub1_2.method9071((float) ((double) local13 * 3.141592653589793D * 2.0D / 16384.0D), (float) (2.0D * 3.141592653589793D * (double) local23 / 16384.0D), -2023317766);
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!dh;Lclient!aac;)V")
	Class106(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class5 arg1) {
		this.aClass104_7 = arg0;
		this.aClass5_10 = arg1;
	}

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "(CIIIZ)V")
	abstract void method7523(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(Ljava/lang/String;IIIIB)V")
	public final void method7524(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, -1175888137);
			this.method7537(arg0, arg1, arg2, null, null, null, 0, 0, -1402365242);
		}
	}

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7525(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, 1797388479);
			this.method7537(arg0, arg1 - this.aClass5_10.method36(arg0, -581760590), arg2, null, null, null, 0, 0, 935901820);
		}
	}

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7526(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, -1172167528);
			this.method7537(arg0, arg1 - this.aClass5_10.method36(arg0, 374197972) / 2, arg2, null, null, null, 0, 0, -710275225);
		}
	}

	@OriginalMember(owner = "client!eu", name = "an", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[I)V")
	final void method7527(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class138_Sub3.method11406(arg0.charAt(local18), 1957102671) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(136) int local136;
							@Pc(149) int local149;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local117 = 0;
									} else {
										local117 = arg5[local13];
									}
									if (arg6 == null) {
										local126 = 0;
									} else {
										local126 = arg6[local13];
									}
									local13++;
									local136 = Class616.method32271(local49.substring(4), (byte) 8);
									@Pc(140) Class100 local140 = arg3[local136];
									local149 = arg4 == null ? local140.method18178() : arg4[local136];
									local140.method18185(local117 + arg1, local126 + (local7 + this.aClass5_10.anInt7 * -2059082111 - local149), 1, -1, 1);
									arg1 += arg3[local136].method18172();
									local11 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7574(local49, 1082475498);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(190) boolean local190 = true;
									local126 = 0;
									local136 = local49.indexOf(44);
									if (local136 == -1) {
										local117 = Class616.method32271(local49.substring(7), (byte) 8);
									} else {
										local117 = Class616.method32271(local49.substring(7, local136), (byte) 8);
										local126 = Class616.method32271(local49.substring(local136 + 1), (byte) 8);
									}
									@Pc(227) int local227;
									if (arg5 == null) {
										local227 = 0;
									} else {
										local227 = arg5[local13];
									}
									if (arg6 == null) {
										local149 = 0;
									} else {
										local149 = arg6[local13];
									}
									local13++;
									@Pc(249) Class100[] local249 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local117, -1941826264);
									if (local249 != null) {
										@Pc(268) int local268 = Math.min(local249[local126].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										local249[local126].method18185(local227 + arg1, local7 + 3 + this.aClass5_10.anInt7 * -2059082111 - local268 + local149, 1, -1, 1);
										arg1 += local249[local126].method18172();
									}
									local11 = -1;
								} catch (@Pc(302) Exception local302) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local30, (byte) 41);
					}
					@Pc(330) int local330;
					if (arg5 == null) {
						local330 = 0;
					} else {
						local330 = arg5[local13];
					}
					if (arg6 == null) {
						local117 = 0;
					} else {
						local117 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local30, arg1 + 1 + local330, local7 + 1 + local117, anInt888 * 1091754755, true);
						}
						this.method7533(local30, local330 + arg1, local7 + local117, anInt886 * -1896697021, false);
					} else if (anInt889 * 1946268483 > 0) {
						anInt890 += anInt889 * 2143285485;
						arg1 += anInt890 * 1231298287 >> 8;
						anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
					}
					local126 = this.aClass5_10.method62(local30, (byte) -76);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, local7 + (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D), local126, anInt883 * 134837817, (byte) -21);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111, local126, anInt885 * -312782447, (byte) -5);
					}
					arg1 += local126;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cm;[ILclient!ch;III)I")
	public final int method7528(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class100[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class96 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16) {
		if (arg0 == null) {
			return 0;
		}
		this.method7529(arg5, arg6, 88282461);
		if (arg9 == 0) {
			arg9 = this.aClass5_10.anInt7 * -2059082111;
		}
		@Pc(39) int[] local39;
		if (arg4 < this.aClass5_10.anInt6 * -8978697 + this.aClass5_10.anInt10 * -1093354073 + arg9 && arg4 < arg9 + arg9) {
			local39 = null;
		} else {
			local39 = new int[] { arg3 };
		}
		@Pc(56) int local56 = this.aClass5_10.method39(arg0, local39, aStringArray12, arg11, (byte) -40);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local56 >= arg10) {
			aStringArray12[arg10 - 1] = this.aClass5_10.method38(aStringArray12[arg10 - 1], arg3, arg11, 1533947387);
			local56 = arg10;
		}
		if (arg8 == 3 && local56 == 1) {
			arg8 = 1;
		}
		@Pc(109) int local109;
		@Pc(188) int local188;
		if (arg8 == 0) {
			local109 = arg2 + this.aClass5_10.anInt6 * -8978697;
		} else if (arg8 == 1) {
			local109 = (arg4 - this.aClass5_10.anInt6 * -8978697 - this.aClass5_10.anInt10 * -1093354073 - arg9 * (local56 - 1)) / 2 + arg2 + this.aClass5_10.anInt6 * -8978697;
		} else if (arg8 == 2) {
			local109 = arg2 + arg4 - this.aClass5_10.anInt10 * -1093354073 - (local56 - 1) * arg9;
		} else {
			local188 = (arg4 - this.aClass5_10.anInt6 * -8978697 - this.aClass5_10.anInt10 * -1093354073 - arg9 * (local56 - 1)) / (local56 + 1);
			if (local188 < 0) {
				local188 = 0;
			}
			local109 = this.aClass5_10.anInt6 * -8978697 + arg2 + local188;
			arg9 += local188;
		}
		for (local188 = 0; local188 < local56; local188++) {
			if (arg7 == 0) {
				this.method7537(aStringArray12[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15, 611141326);
			} else if (arg7 == 1) {
				this.method7537(aStringArray12[local188], arg1 + (arg3 - this.aClass5_10.method36(aStringArray12[local188], 169534197)) / 2, local109, arg11, arg12, arg13, arg14, arg15, 858909998);
			} else if (arg7 == 2) {
				this.method7537(aStringArray12[local188], arg3 + arg1 - this.aClass5_10.method36(aStringArray12[local188], 1426614310), local109, arg11, arg12, arg13, arg14, arg15, -1045411064);
			} else if (local56 - 1 == local188) {
				this.method7537(aStringArray12[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15, 2138829253);
			} else {
				this.method7559(aStringArray12[local188], arg3, -2094829486);
				this.method7537(aStringArray12[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15, 1174423748);
				anInt889 = 0;
			}
			local109 += arg9;
		}
		return local56;
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(III)V")
	final void method7529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anInt883 = 1119774711;
		anInt885 = -898731889;
		anInt886 = (anInt881 = arg0 * -2063503765) * 2098612481;
		anInt889 = 0;
		anInt890 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt888 = (anInt887 = arg1 * 267305957) * -192846769;
	}

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "(Ljava/lang/String;IIIIIB)V")
	public final void method7530(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, 925370335);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, 2140963156) / 2, arg2, null, null, local13, local16, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "ao", descriptor = "(Ljava/lang/String;)V")
	final void method7531(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt886 = (anInt886 * -1896697021 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949) & 0xFFFFFF) * -1448087189;
			} else if (arg0.equals("/col")) {
				anInt886 = (-1896697021 * anInt886 & -16777216 | -489501117 * anInt881 & 0xFFFFFF) * -1448087189;
			}
			if (arg0.startsWith("argb=")) {
				anInt886 = Class329.method27443(arg0.substring(5), 16, 168626949) * -1448087189;
			} else if (arg0.equals("/argb")) {
				anInt886 = anInt881 * 2098612481;
			} else if (arg0.startsWith("str=")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949)) * -1119774711;
			} else if (arg0.equals("str")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | 0x800000) * -1119774711;
			} else if (arg0.equals("/str")) {
				anInt883 = 1119774711;
			} else if (arg0.startsWith("u=")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(2), 16, 168626949)) * 898731889;
			} else if (arg0.equals("u")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000) * 898731889;
			} else if (arg0.equals("/u")) {
				anInt885 = -898731889;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt888 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(5), 16, 168626949)) * 697886635;
			} else if (arg0.equals("shad")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000) * 697886635;
			} else if (arg0.equals("/shad")) {
				anInt888 = anInt887 * -192846769;
			} else if (arg0.equals("br")) {
				this.method7529(anInt881 * -489501117, anInt887 * -1428045331, -45845848);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[IB)I")
	public final int method7532(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class100[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) byte arg9) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(15) int local15 = (arg5.nextInt() & 0x1F) + 192;
		this.method7529(local15 << 24 | arg3 & 0xFFFFFF, local15 << 24 | arg4 & 0xFFFFFF, 1145685004);
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			local38[local42] = local40;
			if ((arg5.nextInt() & 0x3) == 0) {
				local40++;
			}
		}
		this.method7538(arg0, arg1, arg2, arg7, arg8, local38, null, 974176053);
		return local40;
	}

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "(CIIIZ)V")
	abstract void method7533(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!eu", name = "ae", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7534(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, 1699982852);
			this.method7537(arg0, arg1 - this.aClass5_10.method36(arg0, 501127155), arg2, null, null, null, 0, 0, -885065590);
		}
	}

	@OriginalMember(owner = "client!eu", name = "ag", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7535(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, 32079974);
			this.method7537(arg0, arg1 - this.aClass5_10.method36(arg0, -542556486), arg2, null, null, null, 0, 0, -409292422);
		}
	}

	@OriginalMember(owner = "client!eu", name = "ap", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cm;[I)I")
	public final int method7536(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class100[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7529(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF, 983797713);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass5_10.anInt6 * -8978697 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass5_10.anInt6 * -8978697 - this.aClass5_10.anInt10 * -1093354073) / 2;
		} else if (arg8 == 2) {
			local72 = arg2 + arg4 - this.aClass5_10.anInt10 * -1093354073;
		}
		if (arg7 == 1) {
			local74 = this.aClass5_10.method36(arg0, 836814594) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass5_10.method36(arg0, 1666724438) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7538(arg0, local47, local72, arg12, arg13, local43, null, 974176053);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass5_10.method36(arg0, 804663060) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass5_10.anInt6 * -8978697;
			arg11[2] = local74;
			arg11[3] = this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697;
		}
		return local45;
	}

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "(Ljava/lang/String;II[Lclient!cm;[ILclient!ch;III)V")
	final void method7537(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class138_Sub3.method11406(arg0.charAt(local16), 1824457366) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(128) int local128;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class616.method32271(local47.substring(4), (byte) 8);
									@Pc(119) Class100 local119 = arg3[local115];
									local128 = arg4 == null ? local119.method18178() : arg4[local115];
									if ((-1896697021 * anInt886 & -16777216) == -16777216) {
										local119.method18185(arg1, this.aClass5_10.anInt7 * -2059082111 + local7 - local128, 1, -1, 1);
									} else {
										local119.method18185(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 - local128, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18172();
									local11 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7574(local47, 1436578772);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local128 = local47.indexOf(44);
									if (local128 == -1) {
										local115 = Class616.method32271(local47.substring(7), (byte) 8);
									} else {
										local115 = Class616.method32271(local47.substring(7, local128), (byte) 8);
										local197 = Class616.method32271(local47.substring(local128 + 1), (byte) 8);
									}
									@Pc(235) Class100[] local235 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local115, -1941826264);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										if ((anInt886 * -1896697021 & -16777216) == -16777216) {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 1, -1, 1);
										} else {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18172();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local28, (byte) 28);
					}
					if (local28 == ' ') {
						if (anInt889 * 1946268483 > 0) {
							anInt890 += anInt889 * 2143285485;
							arg1 += anInt890 * 1231298287 >> 8;
							anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
						}
					} else if (arg5 == null) {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true);
						}
						this.method7533(local28, arg1, local7, anInt886 * -1896697021, false);
					} else {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7540(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true, arg5, arg6, arg7);
						}
						this.method7540(local28, arg1, local7, anInt886 * -1896697021, false, arg5, arg6, arg7);
					}
					@Pc(443) int local443 = this.aClass5_10.method62(local28, (byte) -3);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D) + local7, local443, anInt883 * 134837817, (byte) -13);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 + 1, local443, anInt885 * -312782447, (byte) 0);
					}
					arg1 += local443;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[II)V")
	final void method7538(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class138_Sub3.method11406(arg0.charAt(local18), 1760403512) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(136) int local136;
							@Pc(149) int local149;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local117 = 0;
									} else {
										local117 = arg5[local13];
									}
									if (arg6 == null) {
										local126 = 0;
									} else {
										local126 = arg6[local13];
									}
									local13++;
									local136 = Class616.method32271(local49.substring(4), (byte) 8);
									@Pc(140) Class100 local140 = arg3[local136];
									local149 = arg4 == null ? local140.method18178() : arg4[local136];
									local140.method18185(local117 + arg1, local126 + (local7 + this.aClass5_10.anInt7 * -2059082111 - local149), 1, -1, 1);
									arg1 += arg3[local136].method18172();
									local11 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7574(local49, 815681651);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(190) boolean local190 = true;
									local126 = 0;
									local136 = local49.indexOf(44);
									if (local136 == -1) {
										local117 = Class616.method32271(local49.substring(7), (byte) 8);
									} else {
										local117 = Class616.method32271(local49.substring(7, local136), (byte) 8);
										local126 = Class616.method32271(local49.substring(local136 + 1), (byte) 8);
									}
									@Pc(227) int local227;
									if (arg5 == null) {
										local227 = 0;
									} else {
										local227 = arg5[local13];
									}
									if (arg6 == null) {
										local149 = 0;
									} else {
										local149 = arg6[local13];
									}
									local13++;
									@Pc(249) Class100[] local249 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local117, -1941826264);
									if (local249 != null) {
										@Pc(268) int local268 = Math.min(local249[local126].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										local249[local126].method18185(local227 + arg1, local7 + 3 + this.aClass5_10.anInt7 * -2059082111 - local268 + local149, 1, -1, 1);
										arg1 += local249[local126].method18172();
									}
									local11 = -1;
								} catch (@Pc(302) Exception local302) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local30, (byte) 105);
					}
					@Pc(330) int local330;
					if (arg5 == null) {
						local330 = 0;
					} else {
						local330 = arg5[local13];
					}
					if (arg6 == null) {
						local117 = 0;
					} else {
						local117 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local30, arg1 + 1 + local330, local7 + 1 + local117, anInt888 * 1091754755, true);
						}
						this.method7533(local30, local330 + arg1, local7 + local117, anInt886 * -1896697021, false);
					} else if (anInt889 * 1946268483 > 0) {
						anInt890 += anInt889 * 2143285485;
						arg1 += anInt890 * 1231298287 >> 8;
						anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
					}
					local126 = this.aClass5_10.method62(local30, (byte) 3);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, local7 + (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D), local126, anInt883 * 134837817, (byte) 21);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111, local126, anInt885 * -312782447, (byte) -45);
					}
					arg1 += local126;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "ak", descriptor = "(Ljava/lang/String;II[Lclient!cm;[ILclient!ch;II)V")
	final void method7539(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class138_Sub3.method11406(arg0.charAt(local16), 2045613938) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(128) int local128;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class616.method32271(local47.substring(4), (byte) 8);
									@Pc(119) Class100 local119 = arg3[local115];
									local128 = arg4 == null ? local119.method18178() : arg4[local115];
									if ((-1896697021 * anInt886 & -16777216) == -16777216) {
										local119.method18185(arg1, this.aClass5_10.anInt7 * -2059082111 + local7 - local128, 1, -1, 1);
									} else {
										local119.method18185(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 - local128, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18172();
									local11 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7574(local47, 1370628586);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local128 = local47.indexOf(44);
									if (local128 == -1) {
										local115 = Class616.method32271(local47.substring(7), (byte) 8);
									} else {
										local115 = Class616.method32271(local47.substring(7, local128), (byte) 8);
										local197 = Class616.method32271(local47.substring(local128 + 1), (byte) 8);
									}
									@Pc(235) Class100[] local235 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local115, -1941826264);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										if ((anInt886 * -1896697021 & -16777216) == -16777216) {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 1, -1, 1);
										} else {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18172();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local28, (byte) 87);
					}
					if (local28 == ' ') {
						if (anInt889 * 1946268483 > 0) {
							anInt890 += anInt889 * 2143285485;
							arg1 += anInt890 * 1231298287 >> 8;
							anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
						}
					} else if (arg5 == null) {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true);
						}
						this.method7533(local28, arg1, local7, anInt886 * -1896697021, false);
					} else {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7540(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true, arg5, arg6, arg7);
						}
						this.method7540(local28, arg1, local7, anInt886 * -1896697021, false, arg5, arg6, arg7);
					}
					@Pc(443) int local443 = this.aClass5_10.method62(local28, (byte) 73);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D) + local7, local443, anInt883 * 134837817, (byte) -23);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 + 1, local443, anInt885 * -312782447, (byte) -8);
					}
					arg1 += local443;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method7540(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "(CIIIZ)V")
	abstract void method7541(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!eu", name = "aq", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cm;[I)I")
	public final int method7542(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class100[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7529(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF, -45687409);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass5_10.anInt6 * -8978697 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass5_10.anInt6 * -8978697 - this.aClass5_10.anInt10 * -1093354073) / 2;
		} else if (arg8 == 2) {
			local72 = arg2 + arg4 - this.aClass5_10.anInt10 * -1093354073;
		}
		if (arg7 == 1) {
			local74 = this.aClass5_10.method36(arg0, -888779871) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass5_10.method36(arg0, -380844918) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7538(arg0, local47, local72, arg12, arg13, local43, null, 974176053);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass5_10.method36(arg0, 294673643) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass5_10.anInt6 * -8978697;
			arg11[2] = local74;
			arg11[3] = this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697;
		}
		return local45;
	}

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cm;[II)I")
	public final int method7543(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class100[] arg12, @OriginalArg(13) int[] arg13, @OriginalArg(14) int arg14) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7529(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF, 554234799);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass5_10.anInt6 * -8978697 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass5_10.anInt6 * -8978697 - this.aClass5_10.anInt10 * -1093354073) / 2;
		} else if (arg8 == 2) {
			local72 = arg2 + arg4 - this.aClass5_10.anInt10 * -1093354073;
		}
		if (arg7 == 1) {
			local74 = this.aClass5_10.method36(arg0, 236806643) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass5_10.method36(arg0, 961007552) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7538(arg0, local47, local72, arg12, arg13, local43, null, 974176053);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass5_10.method36(arg0, 980793342) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass5_10.anInt6 * -8978697;
			arg11[2] = local74;
			arg11[3] = this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697;
		}
		return local45;
	}

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "(CIIIZ)V")
	abstract void method7544(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method7545(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method7546(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7547(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, -531718907);
			this.method7537(arg0, arg1, arg2, null, null, null, 0, 0, 273233864);
		}
	}

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7548(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7529(arg3, arg4, -655723593);
			this.method7537(arg0, arg1, arg2, null, null, null, 0, 0, -735502130);
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(CIIIZ)V")
	abstract void method7549(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!eu", name = "aw", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7550(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, -715899966);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, -460918540) / 2, arg2, null, null, null, local14, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "ah", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!ch;II)I")
	public final int method7551(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class100[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7528(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, 1219952351);
	}

	@OriginalMember(owner = "client!eu", name = "al", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!ch;II)I")
	public final int method7552(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class100[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7528(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, 1808234260);
	}

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7553(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, -1975123962);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, -864892923) / 2, arg2, null, null, null, local14, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "ai", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7554(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, 1364199055);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, 1464973627) / 2, arg2, null, null, null, local14, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "am", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7555(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, 1608240479);
		@Pc(14) double local14 = 7.0D - (double) arg6 / 8.0D;
		if (local14 < 0.0D) {
			local14 = 0.0D;
		}
		@Pc(23) int local23 = arg0.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 1.5D + (double) arg5 / 1.0D) * local14);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, 1939174830) / 2, arg2, null, null, null, local26, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "as", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7556(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, -1437556883);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, 157216767) / 2, arg2, null, null, null, local14, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "at", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7557(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, 1938981651);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, 1987749680) / 2, arg2, null, null, local13, local16, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "ac", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!ch;II)I")
	public final int method7558(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class100[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7528(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, 1619479927);
	}

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "(Ljava/lang/String;II)V")
	final void method7559(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt889 = (arg1 - this.aClass5_10.method36(arg0, -330342269) << 8) / local1 * -1546063509;
		}
	}

	@OriginalMember(owner = "client!eu", name = "au", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[I)I")
	public final int method7560(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class100[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(15) int local15 = (arg5.nextInt() & 0x1F) + 192;
		this.method7529(local15 << 24 | arg3 & 0xFFFFFF, local15 << 24 | arg4 & 0xFFFFFF, -325554525);
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			local38[local42] = local40;
			if ((arg5.nextInt() & 0x3) == 0) {
				local40++;
			}
		}
		this.method7538(arg0, arg1, arg2, arg7, arg8, local38, null, 974176053);
		return local40;
	}

	@OriginalMember(owner = "client!eu", name = "ar", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[I)I")
	public final int method7561(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class100[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(15) int local15 = (arg5.nextInt() & 0x1F) + 192;
		this.method7529(local15 << 24 | arg3 & 0xFFFFFF, local15 << 24 | arg4 & 0xFFFFFF, -21370313);
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			local38[local42] = local40;
			if ((arg5.nextInt() & 0x3) == 0) {
				local40++;
			}
		}
		this.method7538(arg0, arg1, arg2, arg7, arg8, local38, null, 974176053);
		return local40;
	}

	@OriginalMember(owner = "client!eu", name = "ad", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7562(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, -148761698);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, -66304517) / 2, arg2, null, null, local13, local16, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!ch;IIS)I")
	public final int method7563(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class100[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) short arg15) {
		return this.method7528(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, 1890114445);
	}

	@OriginalMember(owner = "client!eu", name = "ax", descriptor = "(II)V")
	final void method7564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt883 = 1119774711;
		anInt885 = -898731889;
		anInt886 = (anInt881 = arg0 * -2063503765) * 2098612481;
		anInt889 = 0;
		anInt890 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt888 = (anInt887 = arg1 * 267305957) * -192846769;
	}

	@OriginalMember(owner = "client!eu", name = "av", descriptor = "(II)V")
	final void method7565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt883 = 1119774711;
		anInt885 = -898731889;
		anInt886 = (anInt881 = arg0 * -2063503765) * 2098612481;
		anInt889 = 0;
		anInt890 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt888 = (anInt887 = arg1 * 267305957) * -192846769;
	}

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method7566(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!eu", name = "aj", descriptor = "(Ljava/lang/String;)V")
	final void method7567(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt886 = (anInt886 * -1896697021 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949) & 0xFFFFFF) * -1448087189;
			} else if (arg0.equals("/col")) {
				anInt886 = (-1896697021 * anInt886 & -16777216 | -489501117 * anInt881 & 0xFFFFFF) * -1448087189;
			}
			if (arg0.startsWith("argb=")) {
				anInt886 = Class329.method27443(arg0.substring(5), 16, 168626949) * -1448087189;
			} else if (arg0.equals("/argb")) {
				anInt886 = anInt881 * 2098612481;
			} else if (arg0.startsWith("str=")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949)) * -1119774711;
			} else if (arg0.equals("str")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | 0x800000) * -1119774711;
			} else if (arg0.equals("/str")) {
				anInt883 = 1119774711;
			} else if (arg0.startsWith("u=")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(2), 16, 168626949)) * 898731889;
			} else if (arg0.equals("u")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000) * 898731889;
			} else if (arg0.equals("/u")) {
				anInt885 = -898731889;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt888 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(5), 16, 168626949)) * 697886635;
			} else if (arg0.equals("shad")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000) * 697886635;
			} else if (arg0.equals("/shad")) {
				anInt888 = anInt887 * -192846769;
			} else if (arg0.equals("br")) {
				this.method7529(anInt881 * -489501117, anInt887 * -1428045331, -1734694784);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!eu", name = "ay", descriptor = "(Ljava/lang/String;)V")
	final void method7568(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt886 = (anInt886 * -1896697021 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949) & 0xFFFFFF) * -1448087189;
			} else if (arg0.equals("/col")) {
				anInt886 = (-1896697021 * anInt886 & -16777216 | -489501117 * anInt881 & 0xFFFFFF) * -1448087189;
			}
			if (arg0.startsWith("argb=")) {
				anInt886 = Class329.method27443(arg0.substring(5), 16, 168626949) * -1448087189;
			} else if (arg0.equals("/argb")) {
				anInt886 = anInt881 * 2098612481;
			} else if (arg0.startsWith("str=")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949)) * -1119774711;
			} else if (arg0.equals("str")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | 0x800000) * -1119774711;
			} else if (arg0.equals("/str")) {
				anInt883 = 1119774711;
			} else if (arg0.startsWith("u=")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(2), 16, 168626949)) * 898731889;
			} else if (arg0.equals("u")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000) * 898731889;
			} else if (arg0.equals("/u")) {
				anInt885 = -898731889;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt888 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(5), 16, 168626949)) * 697886635;
			} else if (arg0.equals("shad")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000) * 697886635;
			} else if (arg0.equals("/shad")) {
				anInt888 = anInt887 * -192846769;
			} else if (arg0.equals("br")) {
				this.method7529(anInt881 * -489501117, anInt887 * -1428045331, -529748968);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!eu", name = "ab", descriptor = "(Ljava/lang/String;I)V")
	final void method7569(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt889 = (arg1 - this.aClass5_10.method36(arg0, -317031170) << 8) / local1 * -1546063509;
		}
	}

	@OriginalMember(owner = "client!eu", name = "az", descriptor = "(Ljava/lang/String;I)V")
	final void method7570(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt889 = (arg1 - this.aClass5_10.method36(arg0, 2063615770) << 8) / local1 * -1546063509;
		}
	}

	@OriginalMember(owner = "client!eu", name = "aa", descriptor = "(Ljava/lang/String;II[Lclient!cm;[ILclient!ch;II)V")
	final void method7571(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class138_Sub3.method11406(arg0.charAt(local16), 1988312733) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(128) int local128;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class616.method32271(local47.substring(4), (byte) 8);
									@Pc(119) Class100 local119 = arg3[local115];
									local128 = arg4 == null ? local119.method18178() : arg4[local115];
									if ((-1896697021 * anInt886 & -16777216) == -16777216) {
										local119.method18185(arg1, this.aClass5_10.anInt7 * -2059082111 + local7 - local128, 1, -1, 1);
									} else {
										local119.method18185(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 - local128, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18172();
									local11 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7574(local47, 1815709886);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local128 = local47.indexOf(44);
									if (local128 == -1) {
										local115 = Class616.method32271(local47.substring(7), (byte) 8);
									} else {
										local115 = Class616.method32271(local47.substring(7, local128), (byte) 8);
										local197 = Class616.method32271(local47.substring(local128 + 1), (byte) 8);
									}
									@Pc(235) Class100[] local235 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local115, -1941826264);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										if ((anInt886 * -1896697021 & -16777216) == -16777216) {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 1, -1, 1);
										} else {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18172();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local28, (byte) 50);
					}
					if (local28 == ' ') {
						if (anInt889 * 1946268483 > 0) {
							anInt890 += anInt889 * 2143285485;
							arg1 += anInt890 * 1231298287 >> 8;
							anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
						}
					} else if (arg5 == null) {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true);
						}
						this.method7533(local28, arg1, local7, anInt886 * -1896697021, false);
					} else {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7540(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true, arg5, arg6, arg7);
						}
						this.method7540(local28, arg1, local7, anInt886 * -1896697021, false, arg5, arg6, arg7);
					}
					@Pc(443) int local443 = this.aClass5_10.method62(local28, (byte) -8);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D) + local7, local443, anInt883 * 134837817, (byte) -5);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 + 1, local443, anInt885 * -312782447, (byte) 74);
					}
					arg1 += local443;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "af", descriptor = "(Ljava/lang/String;II[Lclient!cm;[ILclient!ch;II)V")
	final void method7572(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class138_Sub3.method11406(arg0.charAt(local16), 1977500362) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(128) int local128;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class616.method32271(local47.substring(4), (byte) 8);
									@Pc(119) Class100 local119 = arg3[local115];
									local128 = arg4 == null ? local119.method18178() : arg4[local115];
									if ((-1896697021 * anInt886 & -16777216) == -16777216) {
										local119.method18185(arg1, this.aClass5_10.anInt7 * -2059082111 + local7 - local128, 1, -1, 1);
									} else {
										local119.method18185(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 - local128, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18172();
									local11 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7574(local47, 1730465787);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local128 = local47.indexOf(44);
									if (local128 == -1) {
										local115 = Class616.method32271(local47.substring(7), (byte) 8);
									} else {
										local115 = Class616.method32271(local47.substring(7, local128), (byte) 8);
										local197 = Class616.method32271(local47.substring(local128 + 1), (byte) 8);
									}
									@Pc(235) Class100[] local235 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local115, -1941826264);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										if ((anInt886 * -1896697021 & -16777216) == -16777216) {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 1, -1, 1);
										} else {
											local235[local197].method18185(arg1, local7 + 2 + this.aClass5_10.anInt7 * -2059082111 - local255, 0, anInt886 * -1896697021 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18172();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local28, (byte) 48);
					}
					if (local28 == ' ') {
						if (anInt889 * 1946268483 > 0) {
							anInt890 += anInt889 * 2143285485;
							arg1 += anInt890 * 1231298287 >> 8;
							anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
						}
					} else if (arg5 == null) {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true);
						}
						this.method7533(local28, arg1, local7, anInt886 * -1896697021, false);
					} else {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7540(local28, arg1 + 1, local7 + 1, anInt888 * 1091754755, true, arg5, arg6, arg7);
						}
						this.method7540(local28, arg1, local7, anInt886 * -1896697021, false, arg5, arg6, arg7);
					}
					@Pc(443) int local443 = this.aClass5_10.method62(local28, (byte) 26);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D) + local7, local443, anInt883 * 134837817, (byte) -7);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111 + 1, local443, anInt885 * -312782447, (byte) -81);
					}
					arg1 += local443;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method7573(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 == null) {
			return;
		}
		this.method7529(arg3, arg4, -411543885);
		@Pc(14) double local14 = 7.0D - (double) arg6 / 8.0D;
		if (local14 < 0.0D) {
			local14 = 0.0D;
		}
		@Pc(23) int local23 = arg0.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 1.5D + (double) arg5 / 1.0D) * local14);
		}
		this.method7538(arg0, arg1 - this.aClass5_10.method36(arg0, -661102952) / 2, arg2, null, null, null, local26, 974176053);
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(Ljava/lang/String;I)V")
	final void method7574(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.startsWith("col=")) {
				anInt886 = (anInt886 * -1896697021 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949) & 0xFFFFFF) * -1448087189;
			} else if (arg0.equals("/col")) {
				anInt886 = (-1896697021 * anInt886 & -16777216 | -489501117 * anInt881 & 0xFFFFFF) * -1448087189;
			}
			if (arg0.startsWith("argb=")) {
				anInt886 = Class329.method27443(arg0.substring(5), 16, 168626949) * -1448087189;
			} else if (arg0.equals("/argb")) {
				anInt886 = anInt881 * 2098612481;
			} else if (arg0.startsWith("str=")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | Class329.method27443(arg0.substring(4), 16, 168626949)) * -1119774711;
			} else if (arg0.equals("str")) {
				anInt883 = (-1896697021 * anInt886 & -16777216 | 0x800000) * -1119774711;
			} else if (arg0.equals("/str")) {
				anInt883 = 1119774711;
			} else if (arg0.startsWith("u=")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(2), 16, 168626949)) * 898731889;
			} else if (arg0.equals("u")) {
				anInt885 = (anInt886 * -1896697021 & 0xFF000000) * 898731889;
			} else if (arg0.equals("/u")) {
				anInt885 = -898731889;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt888 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000 | Class329.method27443(arg0.substring(5), 16, 168626949)) * 697886635;
			} else if (arg0.equals("shad")) {
				anInt888 = (anInt886 * -1896697021 & 0xFF000000) * 697886635;
			} else if (arg0.equals("/shad")) {
				anInt888 = anInt887 * -192846769;
			} else if (arg0.equals("br")) {
				this.method7529(anInt881 * -489501117, anInt887 * -1428045331, 1110401112);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!eu", name = "bf", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[I)V")
	final void method7575(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass5_10.anInt7 * -2059082111;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class138_Sub3.method11406(arg0.charAt(local18), 1948254293) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(136) int local136;
							@Pc(149) int local149;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local117 = 0;
									} else {
										local117 = arg5[local13];
									}
									if (arg6 == null) {
										local126 = 0;
									} else {
										local126 = arg6[local13];
									}
									local13++;
									local136 = Class616.method32271(local49.substring(4), (byte) 8);
									@Pc(140) Class100 local140 = arg3[local136];
									local149 = arg4 == null ? local140.method18178() : arg4[local136];
									local140.method18185(local117 + arg1, local126 + (local7 + this.aClass5_10.anInt7 * -2059082111 - local149), 1, -1, 1);
									arg1 += arg3[local136].method18172();
									local11 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7574(local49, 866309156);
							} else if (this.aClass5_10.anInterface1_1 != null) {
								try {
									@Pc(190) boolean local190 = true;
									local126 = 0;
									local136 = local49.indexOf(44);
									if (local136 == -1) {
										local117 = Class616.method32271(local49.substring(7), (byte) 8);
									} else {
										local117 = Class616.method32271(local49.substring(7, local136), (byte) 8);
										local126 = Class616.method32271(local49.substring(local136 + 1), (byte) 8);
									}
									@Pc(227) int local227;
									if (arg5 == null) {
										local227 = 0;
									} else {
										local227 = arg5[local13];
									}
									if (arg6 == null) {
										local149 = 0;
									} else {
										local149 = arg6[local13];
									}
									local13++;
									@Pc(249) Class100[] local249 = this.aClass5_10.anInterface1_1.method29410(this.aClass104_7, local117, -1941826264);
									if (local249 != null) {
										@Pc(268) int local268 = Math.min(local249[local126].method18178(), this.aClass5_10.anInt10 * -1093354073 + this.aClass5_10.anInt6 * -8978697);
										local249[local126].method18185(local227 + arg1, local7 + 3 + this.aClass5_10.anInt7 * -2059082111 - local268 + local149, 1, -1, 1);
										arg1 += local249[local126].method18172();
									}
									local11 = -1;
								} catch (@Pc(302) Exception local302) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass5_10.method41(local11, local30, (byte) 32);
					}
					@Pc(330) int local330;
					if (arg5 == null) {
						local330 = 0;
					} else {
						local330 = arg5[local13];
					}
					if (arg6 == null) {
						local117 = 0;
					} else {
						local117 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt888 * 1091754755 & 0xFF000000) != 0) {
							this.method7533(local30, arg1 + 1 + local330, local7 + 1 + local117, anInt888 * 1091754755, true);
						}
						this.method7533(local30, local330 + arg1, local7 + local117, anInt886 * -1896697021, false);
					} else if (anInt889 * 1946268483 > 0) {
						anInt890 += anInt889 * 2143285485;
						arg1 += anInt890 * 1231298287 >> 8;
						anInt890 = (anInt890 * 1231298287 & 0xFF) * 1174458383;
					}
					local126 = this.aClass5_10.method62(local30, (byte) 79);
					if (anInt883 * 134837817 != -1) {
						this.aClass104_7.method20487(arg1, local7 + (int) ((double) (this.aClass5_10.anInt7 * -2059082111) * 0.7D), local126, anInt883 * 134837817, (byte) 20);
					}
					if (anInt885 * -312782447 != -1) {
						this.aClass104_7.method20487(arg1, local7 + this.aClass5_10.anInt7 * -2059082111, local126, anInt885 * -312782447, (byte) 22);
					}
					arg1 += local126;
					local11 = local30;
				}
			}
		}
	}
}
