package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ado")
public final class Class85 {

	@OriginalMember(owner = "client!ado", name = "f", descriptor = "I")
	static final int anInt281 = 12;

	@OriginalMember(owner = "client!ado", name = "t", descriptor = "I")
	static final int anInt282 = 1;

	@OriginalMember(owner = "client!ado", name = "kp", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!ado", name = "e", descriptor = "[C")
	static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ado", name = "u", descriptor = "[C")
	static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ado", name = "x", descriptor = "(C)C")
	static char method1687(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ado", name = "g", descriptor = "(Lclient!adx;)I")
	static int method1688(@OriginalArg(0) Class91 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt325 * 1902015615) {
				case 3:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!ado", name = "i", descriptor = "(C)Z")
	static boolean method1689(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class702.method37108(arg0, 2120620890)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ado", name = "o", descriptor = "(C)Z")
	static boolean method1690(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class702.method37108(arg0, 2120620890)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ado", name = "j", descriptor = "(C)Z")
	static boolean method1691(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ado", name = "a", descriptor = "(Ljava/lang/CharSequence;Lclient!adx;)Ljava/lang/String;")
	public static String method1692(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class91 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		while (local5 < local8 && Class334.method27818(arg0.charAt(local5), (byte) -5)) {
			local5++;
		}
		while (local8 > local5 && Class334.method27818(arg0.charAt(local8 - 1), (byte) -57)) {
			local8--;
		}
		@Pc(36) int local36 = local8 - local5;
		if (local36 < 1 || local36 > Class268.method26682(arg1, (byte) -111)) {
			return null;
		}
		@Pc(51) StringBuilder local51 = new StringBuilder(local36);
		for (@Pc(53) int local53 = local5; local53 < local8; local53++) {
			@Pc(60) char local60 = arg0.charAt(local53);
			if (Class271.method26704(local60, 2091181817)) {
				@Pc(69) char local69 = Class22.method543(local60, -50618199);
				if (local69 != '\u0000') {
					local51.append(local69);
				}
			}
		}
		if (local51.length() == 0) {
			return null;
		} else {
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!ado", name = "s", descriptor = "(C)C")
	static char method1693(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ado", name = "k", descriptor = "(C)C")
	static char method1694(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ado", name = "m", descriptor = "(C)Z")
	static boolean method1695(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class702.method37108(arg0, 2120620890)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ado", name = "iz", descriptor = "(I)V")
	static void method1696(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class80_Sub1_Sub6 local4 = (Class80_Sub1_Sub6) client.aClass8_49.method247(129206984); local4 != null; local4 = (Class80_Sub1_Sub6) client.aClass8_49.method237(-792156896)) {
			@Pc(10) Class120_Sub1_Sub1_Sub4 local10 = local4.aClass120_Sub1_Sub1_Sub4_1;
			if (client.currentCycle > local10.anInt3274 * 862949361) {
				local4.method24395((byte) 53);
				local10.method24209(1717521360);
			} else if (client.currentCycle >= local10.anInt3284 * -827878777) {
				local10.method24205(1938721939);
				@Pc(133) Class463 local133;
				if (local10.anInt3279 * -857741987 > 0) {
					if (client.anInt3541 * -1330995431 == 0) {
						@Pc(53) Class120_Sub1_Sub1_Sub1 local53 = Class251.aClass254Array1[local10.anInt3279 * -857741987 - 1].method26399((byte) 9);
						if (local53 != null) {
							@Pc(60) Class463 local60 = local53.method24552().aClass463_61;
							if ((int) local60.aFloat297 >= 0 && (int) local60.aFloat297 < client.aClass539_1.method30921(2138301253) * 512 && (int) local60.aFloat296 >= 0 && (int) local60.aFloat296 < client.aClass539_1.method31011(-1419511701) * 512) {
								local10.method24204((int) local60.aFloat297, (int) local60.aFloat296, Class439.method29150((int) local60.aFloat297, (int) local60.aFloat296, local53.aByte99, 1037753497) - local10.anInt3276 * 1079666109, client.currentCycle, 1825452449);
							}
						}
					} else {
						@Pc(123) Class80_Sub19 local123 = (Class80_Sub19) client.aClass24_18.method560((long) (local10.anInt3279 * -857741987 - 1));
						if (local123 != null) {
							@Pc(129) Class120_Sub1_Sub1_Sub1_Sub1 local129 = (Class120_Sub1_Sub1_Sub1_Sub1) local123.anObject5;
							local133 = local129.method24552().aClass463_61;
							if ((int) local133.aFloat297 >= 0 && (int) local133.aFloat297 < client.aClass539_1.method30921(2106499060) * 512 && (int) local133.aFloat296 >= 0 && (int) local133.aFloat296 < client.aClass539_1.method31011(-1494900487) * 512) {
								local10.method24204((int) local133.aFloat297, (int) local133.aFloat296, Class439.method29150((int) local133.aFloat297, (int) local133.aFloat296, local10.aByte99, 1037753497) - local10.anInt3276 * 1079666109, client.currentCycle, 1959805774);
							}
						}
					}
				}
				if (local10.anInt3279 * -857741987 < 0) {
					@Pc(197) int local197 = -(local10.anInt3279 * -857741987) - 1;
					@Pc(204) Class120_Sub1_Sub1_Sub1_Sub2 local204;
					if (local197 == client.anInt3558 * 188678613) {
						local204 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3;
					} else {
						local204 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local197];
					}
					if (local204 != null) {
						local133 = local204.method24552().aClass463_61;
						if ((int) local133.aFloat297 >= 0 && (int) local133.aFloat297 < client.aClass539_1.method30921(1924694330) * 512 && (int) local133.aFloat296 >= 0 && (int) local133.aFloat296 < client.aClass539_1.method31011(1051484872) * 512) {
							local10.method24204((int) local133.aFloat297, (int) local133.aFloat296, Class439.method29150((int) local133.aFloat297, (int) local133.aFloat296, local10.aByte99, 1037753497) - local10.anInt3276 * 1079666109, client.currentCycle, 1878975453);
						}
					}
				}
				local10.method24206(client.anInt3516 * -2136892027, -1398383504);
				client.aClass539_1.method30932(-1638462787).method31696(local10, true, 6898847);
			}
		}
	}

	@OriginalMember(owner = "client!ado", name = "f", descriptor = "(Lclient!dr;FI)F")
	static float method1697(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat276) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat277) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat276) / (arg0.aFloat277 - arg0.aFloat276);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean761) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray97[0] - local10, arg0.aFloatArray97[1], arg0.aFloatArray97[2], arg0.aFloatArray97[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class236.method26137(local39, 3, 0.0F, true, 1.0F, true, local72, 1698150922);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return ((arg0.aFloatArray98[3] * local35 + arg0.aFloatArray98[2]) * local35 + arg0.aFloatArray98[1]) * local35 + arg0.aFloatArray98[0];
	}

	@OriginalMember(owner = "client!ado", name = "<init>", descriptor = "()V")
	Class85() throws Throwable {
		throw new Error();
	}
}
