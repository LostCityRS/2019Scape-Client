package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class607 implements Interface67 {

	@OriginalMember(owner = "client!va", name = "w", descriptor = "I")
	public static int anInt5721;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!alw;")
	static Class93_Sub41 aClass93_Sub41_17;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	final int anInt5719;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	final int anInt5720;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "(Lclient!alw;)Lclient!va;")
	static Class607 method32100(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(7) int local7 = arg0.method22425((short) 16384);
		return new Class607(local3, local7);
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(Lclient!alw;)Lclient!va;")
	static Class607 method32101(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(7) int local7 = arg0.method22425((short) 16384);
		return new Class607(local3, local7);
	}

	@OriginalMember(owner = "client!va", name = "aei", descriptor = "(Lclient!yf;B)V")
	static void method32102(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 ^ 0x1 << local23;
	}

	@OriginalMember(owner = "client!va", name = "n", descriptor = "(J)Ljava/lang/String;")
	static String method32103(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = Class714.aCharArray9[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = ' ';
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!va", name = "yx", descriptor = "(Lclient!yf;S)V")
	static void method32104(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(49) int local49 = local13 + (local23 << 14);
		@Pc(55) int local55 = local49 + (local33 << 28);
		@Pc(59) int local59 = local55 + local43;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local59;
	}

	@OriginalMember(owner = "client!va", name = "ea", descriptor = "(Lclient!yf;I)V")
	static void method32105(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 103056441);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class129.method21488(local16, local22, arg0, (byte) 113);
	}

	@OriginalMember(owner = "client!va", name = "sz", descriptor = "(Lclient!yf;I)V")
	static void method32106(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		if (local11.anInt4086 * 307668159 == -1) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4087 * -570377411;
		}
	}

	@OriginalMember(owner = "client!va", name = "ala", descriptor = "(Lclient!yf;I)V")
	static void method32107(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) CharSequence local13 = (CharSequence) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class25_Sub2.method16033(local13, (byte) 73);
	}

	@OriginalMember(owner = "client!va", name = "zv", descriptor = "(Lclient!yf;I)V")
	static void method32108(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(19) Class93_Sub22 local19 = Class102.method2592(Class446.aClass446_62, client.aClass175_1.aClass24_2, (byte) 115);
		local19.aClass93_Sub41_Sub2_1.method22522(Class46.method894(local13, -1912953263), (byte) -30);
		local19.aClass93_Sub41_Sub2_1.method22414(local13, -508826280);
		client.aClass175_1.method24363(local19, -2037749837);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)I")
	static int method32109(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!va", name = "vo", descriptor = "(Lclient!yf;I)V")
	static void method32110(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 508543619);
		@Pc(29) int local29 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(30) int local30 = local29 - 1;
		if (local16.aStringArray27 == null || local30 >= local16.aStringArray27.length || local16.aStringArray27[local30] == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.aStringArray27[local30];
		}
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II)V")
	Class607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5719 = arg0 * 94986593;
		this.anInt5720 = arg1 * -60779553;
	}

	@OriginalMember(owner = "client!va", name = "m", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z")
	@Override
	public boolean method32432(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface66 local12 = arg1[local1];
			if (local12 != null && local12.method13696((byte) 0) == this.anInt5719 * 504824481 && local12.method13689(1549066484) == this.anInt5720 * 1060431903) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!va", name = "n", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z")
	@Override
	public boolean method32433(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface66 local12 = arg1[local1];
			if (local12 != null && local12.method13696((byte) 0) == this.anInt5719 * 504824481 && local12.method13689(1622579411) == this.anInt5720 * 1060431903) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;I)Z")
	@Override
	public boolean method32434(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface66 local12 = arg1[local1];
			if (local12 != null && local12.method13696((byte) 0) == this.anInt5719 * 504824481 && local12.method13689(233165736) == this.anInt5720 * 1060431903) {
				return true;
			}
		}
		return false;
	}
}
