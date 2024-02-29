package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aak")
public final class Class13 {

	@OriginalMember(owner = "client!aak", name = "bl", descriptor = "I")
	public static int anInt47;

	@OriginalMember(owner = "client!aak", name = "s", descriptor = "I")
	int anInt26;

	@OriginalMember(owner = "client!aak", name = "l", descriptor = "[B")
	byte[] aByteArray4;

	@OriginalMember(owner = "client!aak", name = "z", descriptor = "I")
	int anInt32;

	@OriginalMember(owner = "client!aak", name = "p", descriptor = "[B")
	byte[] aByteArray5;

	@OriginalMember(owner = "client!aak", name = "ar", descriptor = "I")
	int anInt33;

	@OriginalMember(owner = "client!aak", name = "c", descriptor = "I")
	int anInt34;

	@OriginalMember(owner = "client!aak", name = "r", descriptor = "I")
	int anInt35;

	@OriginalMember(owner = "client!aak", name = "o", descriptor = "I")
	int anInt36;

	@OriginalMember(owner = "client!aak", name = "y", descriptor = "I")
	int anInt37;

	@OriginalMember(owner = "client!aak", name = "q", descriptor = "I")
	int anInt38;

	@OriginalMember(owner = "client!aak", name = "v", descriptor = "B")
	byte aByte1;

	@OriginalMember(owner = "client!aak", name = "h", descriptor = "I")
	int anInt39;

	@OriginalMember(owner = "client!aak", name = "g", descriptor = "I")
	int anInt40;

	@OriginalMember(owner = "client!aak", name = "t", descriptor = "I")
	int anInt41;

	@OriginalMember(owner = "client!aak", name = "x", descriptor = "I")
	int anInt44;

	@OriginalMember(owner = "client!aak", name = "b", descriptor = "I")
	int anInt45;

	@OriginalMember(owner = "client!aak", name = "e", descriptor = "I")
	final int anInt43 = 4096;

	@OriginalMember(owner = "client!aak", name = "n", descriptor = "I")
	final int anInt46 = 16;

	@OriginalMember(owner = "client!aak", name = "m", descriptor = "I")
	final int anInt28 = 258;

	@OriginalMember(owner = "client!aak", name = "k", descriptor = "I")
	final int anInt42 = 6;

	@OriginalMember(owner = "client!aak", name = "f", descriptor = "I")
	final int anInt29 = 50;

	@OriginalMember(owner = "client!aak", name = "w", descriptor = "I")
	final int anInt30 = 18002;

	@OriginalMember(owner = "client!aak", name = "u", descriptor = "I")
	int anInt31 = 0;

	@OriginalMember(owner = "client!aak", name = "d", descriptor = "I")
	int anInt27 = 0;

	@OriginalMember(owner = "client!aak", name = "a", descriptor = "[I")
	int[] anIntArray2 = new int[256];

	@OriginalMember(owner = "client!aak", name = "i", descriptor = "[I")
	int[] anIntArray3 = new int[257];

	@OriginalMember(owner = "client!aak", name = "ae", descriptor = "[Z")
	boolean[] aBooleanArray2 = new boolean[256];

	@OriginalMember(owner = "client!aak", name = "ag", descriptor = "[Z")
	boolean[] aBooleanArray3 = new boolean[16];

	@OriginalMember(owner = "client!aak", name = "ah", descriptor = "[B")
	byte[] aByteArray9 = new byte[256];

	@OriginalMember(owner = "client!aak", name = "al", descriptor = "[B")
	byte[] aByteArray7 = new byte[4096];

	@OriginalMember(owner = "client!aak", name = "ac", descriptor = "[I")
	int[] anIntArray1 = new int[16];

	@OriginalMember(owner = "client!aak", name = "ai", descriptor = "[B")
	byte[] aByteArray6 = new byte[18002];

	@OriginalMember(owner = "client!aak", name = "aw", descriptor = "[B")
	byte[] aByteArray8 = new byte[18002];

	@OriginalMember(owner = "client!aak", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray2 = new byte[6][258];

	@OriginalMember(owner = "client!aak", name = "at", descriptor = "[[I")
	int[][] anIntArrayArray1 = new int[6][258];

	@OriginalMember(owner = "client!aak", name = "ad", descriptor = "[[I")
	int[][] anIntArrayArray2 = new int[6][258];

	@OriginalMember(owner = "client!aak", name = "am", descriptor = "[[I")
	int[][] anIntArrayArray3 = new int[6][258];

	@OriginalMember(owner = "client!aak", name = "au", descriptor = "[I")
	int[] anIntArray4 = new int[6];

	@OriginalMember(owner = "client!aak", name = "afp", descriptor = "(Lclient!yf;I)V")
	static void method190(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anInt6052 -= -1915563430;
		@Pc(27) int local27 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13.indexOf(local27, local37);
	}

	@OriginalMember(owner = "client!aak", name = "n", descriptor = "(CLclient!zt;I)C")
	static char method191(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != Class717.aClass717_12) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != Class717.aClass717_12) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!aak", name = "<init>", descriptor = "()V")
	Class13() {
	}
}
