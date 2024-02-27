package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zn")
public final class Class711 {

	@OriginalMember(owner = "client!zn", name = "rs", descriptor = "I")
	static int anInt6121;

	@OriginalMember(owner = "client!zn", name = "e", descriptor = "Ljava/util/Map;")
	static Map aMap27 = new HashMap();

	@OriginalMember(owner = "client!zn", name = "v", descriptor = "(Ljava/lang/Iterable;)I")
	static int method36982(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method37101() > local1) {
				local1 = local11.method37101();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!zn", name = "f", descriptor = "(Ljava/lang/Class;I)Lclient!za;")
	public static Interface75 method36983(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap27;
		synchronized (aMap27) {
			@Pc(8) Map local8 = (Map) aMap27.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37101(), local29);
				}
				aMap27.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!zn", name = "w", descriptor = "(Ljava/lang/Class;I)Lclient!za;")
	public static Interface75 method36984(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap27;
		synchronized (aMap27) {
			@Pc(8) Map local8 = (Map) aMap27.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37101(), local29);
				}
				aMap27.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!zn", name = "o", descriptor = "(Ljava/lang/Iterable;)I")
	static int method36985(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method37101() > local1) {
				local1 = local11.method37101();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!zn", name = "c", descriptor = "(Ljava/lang/Iterable;Lclient!alw;)V")
	public static void method36986(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		@Pc(3) int local3 = Class384.method28336(arg0, 500666449);
		arg1.method22651(local3, (byte) 44);
		if (local3 == 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local3; local13++) {
			arg1.aByteArray58[arg1.anInt3070 * 212851357 + local13] = 0;
		}
		@Pc(31) Iterator local31 = arg0.iterator();
		while (local31.hasNext()) {
			@Pc(38) Interface75 local38 = (Interface75) local31.next();
			@Pc(41) int local41 = local38.method37101();
			@Pc(45) int local45 = local41 / 8;
			arg1.aByteArray58[arg1.anInt3070 * 212851357 + local45] = (byte) (arg1.aByteArray58[arg1.anInt3070 * 212851357 + local45] | 0x1 << (local41 & 0x7));
		}
		arg1.anInt3070 += local3 * -1445626955;
	}

	@OriginalMember(owner = "client!zn", name = "z", descriptor = "([Lclient!za;I)Lclient!za;")
	public static Interface75 method36987(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method37101()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zn", name = "p", descriptor = "([Lclient!za;I)Lclient!za;")
	public static Interface75 method36988(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method37101()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zn", name = "d", descriptor = "([Lclient!za;I)Lclient!za;")
	public static Interface75 method36989(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method37101()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zn", name = "l", descriptor = "(Ljava/lang/Class;I)Lclient!za;")
	public static Interface75 method36990(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap27;
		synchronized (aMap27) {
			@Pc(8) Map local8 = (Map) aMap27.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37101(), local29);
				}
				aMap27.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!zn", name = "u", descriptor = "(Ljava/lang/Class;I)Lclient!za;")
	public static Interface75 method36991(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap27;
		synchronized (aMap27) {
			@Pc(8) Map local8 = (Map) aMap27.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37101(), local29);
				}
				aMap27.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!zn", name = "r", descriptor = "(Ljava/lang/Iterable;Lclient!alw;)V")
	public static void method36992(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		@Pc(3) int local3 = Class384.method28336(arg0, 235595445);
		arg1.method22651(local3, (byte) 6);
		if (local3 == 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local3; local13++) {
			arg1.aByteArray58[arg1.anInt3070 * 212851357 + local13] = 0;
		}
		@Pc(31) Iterator local31 = arg0.iterator();
		while (local31.hasNext()) {
			@Pc(38) Interface75 local38 = (Interface75) local31.next();
			@Pc(41) int local41 = local38.method37101();
			@Pc(45) int local45 = local41 / 8;
			arg1.aByteArray58[arg1.anInt3070 * 212851357 + local45] = (byte) (arg1.aByteArray58[arg1.anInt3070 * 212851357 + local45] | 0x1 << (local41 & 0x7));
		}
		arg1.anInt3070 += local3 * -1445626955;
	}

	@OriginalMember(owner = "client!zn", name = "s", descriptor = "(Ljava/lang/Iterable;)I")
	static int method36993(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method37101() > local1) {
				local1 = local11.method37101();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!zn", name = "e", descriptor = "(Lclient!py;Lclient!df;Lclient!es;I)V")
	public static void method36994(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) int arg3) {
		Class280.aClass497_100 = arg0;
		Class388.aClass225_7 = arg1;
		Class319.anInterface24_8 = arg2;
	}

	@OriginalMember(owner = "client!zn", name = "<init>", descriptor = "()V")
	Class711() throws Throwable {
		throw new Error();
	}
}
