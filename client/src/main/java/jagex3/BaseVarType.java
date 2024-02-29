package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class BaseVarType implements SerializableEnum {

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!qa;")
	public static final BaseVarType INTEGER = new BaseVarType(2, 0, Integer.class, new BaseVarTypeInteger());

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!qa;")
	public static final BaseVarType LONG = new BaseVarType(4, 1, Long.class, new BaseVarTypeLong());

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!qa;")
	public static final BaseVarType STRING = new BaseVarType(1, 2, String.class, new BaseVarTypeString());

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!qa;")
	public static final BaseVarType COORDFINE = new BaseVarType(0, 3, CoordFine.class, new BaseVarTypeCoordFine());

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!qa;")
	public static final BaseVarType COMPONENTHOOK = new BaseVarType(3, 4, ComponentHook.class, new BaseVarTypeComponentHook());

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public final int ordinal;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Ljava/lang/Class;")
	public final Class instance;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!ade;")
	final BaseVarTypeCodec codec;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(Ljava/lang/Class;I)Lclient!ade;")
	public static BaseVarTypeCodec method30338(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(3) BaseVarType local3 = method30339(arg0, 513196918);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.codec;
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Ljava/lang/Class;I)Lclient!qa;")
	static BaseVarType method30339(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) BaseVarType[] local2 = values();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) BaseVarType local12 = local2[local4];
			if (arg0 == local12.instance) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)[Lclient!qa;")
	public static BaseVarType[] values() {
		return new BaseVarType[] {COORDFINE, COMPONENTHOOK, STRING, INTEGER, LONG};
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(Ljava/lang/Class;)Lclient!qa;")
	static BaseVarType method30341(@OriginalArg(0) Class arg0) {
		@Pc(2) BaseVarType[] local2 = values();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) BaseVarType local12 = local2[local4];
			if (arg0 == local12.instance) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "(Ljava/lang/Class;)Lclient!qa;")
	static BaseVarType method30342(@OriginalArg(0) Class arg0) {
		@Pc(2) BaseVarType[] local2 = values();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) BaseVarType local12 = local2[local4];
			if (arg0 == local12.instance) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "(Ljava/lang/Class;)Lclient!ade;")
	public static BaseVarTypeCodec method30343(@OriginalArg(0) Class arg0) {
		@Pc(3) BaseVarType local3 = method30339(arg0, -44876368);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.codec;
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(Ljava/lang/Class;)Lclient!ade;")
	public static BaseVarTypeCodec method30344(@OriginalArg(0) Class arg0) {
		@Pc(3) BaseVarType local3 = method30339(arg0, 1739346658);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.codec;
	}

	@OriginalMember(owner = "client!qa", name = "vn", descriptor = "(Lclient!yf;S)V")
	static void method30345(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(19) Class93_Sub22 local19 = Class102.method2592(Class446.aClass446_112, client.aClass175_2.aClass24_2, (byte) 71);
		local19.aClass93_Sub41_Sub2_1.method22522(local13.length() + 1, (byte) -74);
		local19.aClass93_Sub41_Sub2_1.method22414(local13, -288853937);
		client.aClass175_2.method24363(local19, -1861149337);
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(Lclient!yf;I)V")
	static void method30346(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class497.method30312(local13, 1683602857);
	}

	@OriginalMember(owner = "client!qa", name = "kt", descriptor = "(Ljava/lang/String;I)I")
	public static int method30347(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3444 * 862418793; local5++) {
			if (arg0.equalsIgnoreCase(client.aClass281Array1[local5].aString159)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qa", name = "aio", descriptor = "(Lclient!yf;B)V")
	static void method30348(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(17) Class93_Sub1_Sub14 local17 = Class449.aClass514_1.method30448(local12, (byte) -105);
		if (local17.anIntArray261 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anIntArray261.length;
		}
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IILjava/lang/Class;Lclient!ade;)V")
	BaseVarType(@OriginalArg(0) int ordinal, @OriginalArg(1) int id, @OriginalArg(2) Class instance, @OriginalArg(3) BaseVarTypeCodec codec) {
		this.ordinal = ordinal * -928613997;
		this.id = id * -568068317;
		this.instance = instance;
		this.codec = codec;
	}

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "(Lclient!alw;B)Ljava/lang/Object;")
	public Object decode(@OriginalArg(0) Class93_Sub41 arg0) {
		return this.codec.decode(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.id * 983101579;
	}

}
