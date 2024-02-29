package jagex3;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!add")
public abstract class Class79_Sub1 extends Class79 implements Interface51 {

	@OriginalMember(owner = "client!add", name = "n", descriptor = "Lclient!qe;")
	protected final Class138 aClass138_3;

	@OriginalMember(owner = "client!add", name = "al", descriptor = "([Lclient!add;)Ljava/util/Map;")
	public static Map method1466(@OriginalArg(0) Class79_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class79_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class79_Sub1 local23 = local13[local15];
			local11.put(local23.aClass138_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!add", name = "<init>", descriptor = "(Lclient!zd;Lclient!qe;Lclient!zt;I)V")
	Class79_Sub1(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass138_3 = arg1;
	}

	@OriginalMember(owner = "client!add", name = "l", descriptor = "()I")
	@Override
	public int method18279() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "n", descriptor = "(I)I")
	@Override
	public int method18274(@OriginalArg(0) int arg0) {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "w", descriptor = "()I")
	@Override
	public int method18278() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "t", descriptor = "(Lclient!on;B)I")
	public final int method1461(@OriginalArg(0) Class466 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class582.method31595((String) arg0.anObject19, 1732748241);
		} else if (arg0.anObject19 instanceof Serializable) {
			local6 = local1 + ((Serializable) arg0.anObject19).computeSerialisedSize((byte) -55);
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "ae", descriptor = "(Lclient!alw;Lclient!on;I)V")
	public final void method1462(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class466 arg1, @OriginalArg(2) int arg2) {
		arg0.method22466(arg1.anInt5253 * -1181855333, 2135795818);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22407((Integer) arg1.anObject19, (byte) -49);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22411((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22415((String) arg1.anObject19, 1516871641);
		} else if (arg1.anObject19 instanceof Serializable) {
			((Serializable) arg1.anObject19).method13861(arg0, (short) 1211);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "ag", descriptor = "(Lclient!alw;B)Lclient!on;")
	public final Class466 method1463(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(9) Class108 local9 = (Class108) this.method18273(local3, -1439586201);
		if (!local9.method7437((byte) -108)) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class466 local23 = new Class466(local3);
		@Pc(29) Class local29 = local9.aScriptVarType_6.getBaseVarType().instance;
		if (local29 == Integer.class) {
			local23.anObject19 = arg0.method22431(-118643075);
		} else if (Long.class == local29) {
			local23.anObject19 = arg0.method22435(526348717);
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method22440(158598774);
		} else if (Serializable.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Serializable local66 = (Serializable) local29.getDeclaredConstructor().newInstance();
				local66.method13862(arg0, 1715102703);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "ah", descriptor = "(Lclient!alw;Lclient!qa;B)Lclient!on;")
	public final Class466 method1464(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) BaseVarType arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.instance;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22431(-118643075);
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22435(-1724840463);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22440(1558569498);
		} else if (Serializable.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Serializable local48 = (Serializable) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0, 1136636381);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18273(local3, 828575494);
		return local70.method7437((byte) -30) && local70.aScriptVarType_6.getBaseVarType() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "m", descriptor = "(I)Lclient!ay;")
	public abstract Interface13 method18276(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!add", name = "k", descriptor = "(I)Lclient!ay;")
	public abstract Interface13 method18277(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!add", name = "f", descriptor = "()I")
	@Override
	public int method18275() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!add", name = "ac", descriptor = "(Lclient!on;)I")
	public final int method1465(@OriginalArg(0) Class466 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class582.method31595((String) arg0.anObject19, 333037137);
		} else if (arg0.anObject19 instanceof Serializable) {
			local6 = local1 + ((Serializable) arg0.anObject19).computeSerialisedSize((byte) -62);
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "u", descriptor = "(IB)Ljava/lang/Object;")
	@Override
	public final Object method1460(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class108 local5 = (Class108) this.method18273(arg0, -1770456980);
		return local5 != null && local5.method7437((byte) -128) ? local5.method7438((byte) 2) : null;
	}

	@OriginalMember(owner = "client!add", name = "e", descriptor = "(II)Lclient!ay;")
	public abstract Interface13 method18273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!add", name = "ai", descriptor = "(Lclient!on;)I")
	public final int method1467(@OriginalArg(0) Class466 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class582.method31595((String) arg0.anObject19, 826935043);
		} else if (arg0.anObject19 instanceof Serializable) {
			local6 = local1 + ((Serializable) arg0.anObject19).computeSerialisedSize((byte) -57);
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "z", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public final Object method1459(@OriginalArg(0) int arg0) {
		@Pc(5) Class108 local5 = (Class108) this.method18273(arg0, 2113417987);
		return local5 != null && local5.method7437((byte) -86) ? local5.method7438((byte) 2) : null;
	}

	@OriginalMember(owner = "client!add", name = "aw", descriptor = "(Lclient!alw;Lclient!on;)V")
	public final void method1468(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class466 arg1) {
		arg0.method22466(arg1.anInt5253 * -1181855333, 2134803626);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22407((Integer) arg1.anObject19, (byte) -80);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22411((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22415((String) arg1.anObject19, 1516871641);
		} else if (arg1.anObject19 instanceof Serializable) {
			((Serializable) arg1.anObject19).method13861(arg0, (short) 1211);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "as", descriptor = "(Lclient!alw;Lclient!on;)V")
	public final void method1469(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class466 arg1) {
		arg0.method22466(arg1.anInt5253 * -1181855333, 2136311086);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method22407((Integer) arg1.anObject19, (byte) -44);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method22411((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method22415((String) arg1.anObject19, 1516871641);
		} else if (arg1.anObject19 instanceof Serializable) {
			((Serializable) arg1.anObject19).method13861(arg0, (short) 1211);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "at", descriptor = "(Lclient!alw;)Lclient!on;")
	public final Class466 method1470(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(9) Class108 local9 = (Class108) this.method18273(local3, -60965265);
		if (!local9.method7437((byte) -64)) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class466 local23 = new Class466(local3);
		@Pc(29) Class local29 = local9.aScriptVarType_6.getBaseVarType().instance;
		if (local29 == Integer.class) {
			local23.anObject19 = arg0.method22431(-118643075);
		} else if (Long.class == local29) {
			local23.anObject19 = arg0.method22435(752691255);
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method22440(1537930131);
		} else if (Serializable.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Serializable local66 = (Serializable) local29.getDeclaredConstructor().newInstance();
				local66.method13862(arg0, 1068222458);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "ad", descriptor = "(Lclient!alw;Lclient!qa;)Lclient!on;")
	public final Class466 method1471(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) BaseVarType arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.instance;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22431(-118643075);
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22435(-617457273);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22440(-153120367);
		} else if (Serializable.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Serializable local48 = (Serializable) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0, 1536960997);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18273(local3, -1651253270);
		return local70.method7437((byte) -5) && local70.aScriptVarType_6.getBaseVarType() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "am", descriptor = "(Lclient!alw;Lclient!qa;)Lclient!on;")
	public final Class466 method1472(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) BaseVarType arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.instance;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22431(-118643075);
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22435(-1567631637);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22440(-429090498);
		} else if (Serializable.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Serializable local48 = (Serializable) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0, 1056436859);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18273(local3, -775959803);
		return local70.method7437((byte) -48) && local70.aScriptVarType_6.getBaseVarType() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "au", descriptor = "(Lclient!alw;Lclient!qa;)Lclient!on;")
	public final Class466 method1473(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) BaseVarType arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(8) Class466 local8 = new Class466(local3);
		@Pc(11) Class local11 = arg1.instance;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method22431(-118643075);
		} else if (Long.class == local11) {
			local8.anObject19 = arg0.method22435(-783449995);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method22440(-50914556);
		} else if (Serializable.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Serializable local48 = (Serializable) local11.getDeclaredConstructor().newInstance();
				local48.method13862(arg0, 1598431297);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class108 local70 = (Class108) this.method18273(local3, -1060313518);
		return local70.method7437((byte) -97) && local70.aScriptVarType_6.getBaseVarType() == arg1 ? local8 : null;
	}
}
