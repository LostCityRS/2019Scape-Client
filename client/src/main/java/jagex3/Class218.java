package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cy")
public final class Class218 implements SerializableEnum {

	@OriginalMember(owner = "client!cy", name = "e", descriptor = "Lclient!cy;")
	static final Class218 aClass218_7 = new Class218(0, 0);

	@OriginalMember(owner = "client!cy", name = "n", descriptor = "Lclient!cy;")
	static final Class218 aClass218_6 = new Class218(1, 1);

	@OriginalMember(owner = "client!cy", name = "m", descriptor = "Lclient!cy;")
	static final Class218 aClass218_1 = new Class218(2, 2);

	@OriginalMember(owner = "client!cy", name = "k", descriptor = "Lclient!cy;")
	static final Class218 aClass218_3 = new Class218(3, 3);

	@OriginalMember(owner = "client!cy", name = "f", descriptor = "Lclient!cy;")
	static final Class218 aClass218_5 = new Class218(4, 4);

	@OriginalMember(owner = "client!cy", name = "w", descriptor = "Lclient!cy;")
	static final Class218 aClass218_2 = new Class218(5, 5);

	@OriginalMember(owner = "client!cy", name = "l", descriptor = "Lclient!cy;")
	static final Class218 aClass218_4 = new Class218(6, 6);

	@OriginalMember(owner = "client!cy", name = "u", descriptor = "Lclient!cy;")
	static final Class218 aClass218_8 = new Class218(7, 7);

	@OriginalMember(owner = "client!cy", name = "z", descriptor = "Lclient!cy;")
	static final Class218 aClass218_9 = new Class218(8, 8);

	@OriginalMember(owner = "client!cy", name = "p", descriptor = "I")
	final int anInt3659;

	@OriginalMember(owner = "client!cy", name = "d", descriptor = "I")
	final int anInt3660;

	@OriginalMember(owner = "client!cy", name = "f", descriptor = "()[Lclient!cy;")
	static Class218[] method25597() {
		return new Class218[] { aClass218_7, aClass218_6, aClass218_1, aClass218_3, aClass218_5, aClass218_2, aClass218_4, aClass218_8, aClass218_9 };
	}

	@OriginalMember(owner = "client!cy", name = "l", descriptor = "(I)Lclient!cy;")
	static Class218 method25598(@OriginalArg(0) int arg0) {
		@Pc(6) Class218 local6 = (Class218) Class107.method18131(Class104.method20893((byte) -65), arg0, -1915563430);
		if (local6 == null) {
			local6 = aClass218_9;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cy", name = "w", descriptor = "()[Lclient!cy;")
	static Class218[] method25599() {
		return new Class218[] { aClass218_7, aClass218_6, aClass218_1, aClass218_3, aClass218_5, aClass218_2, aClass218_4, aClass218_8, aClass218_9 };
	}

	@OriginalMember(owner = "client!cy", name = "rb", descriptor = "(Lclient!yf;I)V")
	static void method25600(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4031 * -1543587533;
	}

	@OriginalMember(owner = "client!cy", name = "f", descriptor = "(JIZLclient!zt;I)Ljava/lang/String;")
	public static String method25601(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class717 arg3, @OriginalArg(4) int arg4) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (Class717.aClass717_15 == arg3) {
			local1 = '.';
			local3 = ',';
		}
		if (Class717.aClass717_11 == arg3) {
			local3 = ' ';
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cy", name = "<init>", descriptor = "(II)V")
	Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3659 = arg0 * -449949803;
		this.anInt3660 = arg1 * 1649492265;
	}

	@OriginalMember(owner = "client!cy", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3660 * -46077159;
	}

}
