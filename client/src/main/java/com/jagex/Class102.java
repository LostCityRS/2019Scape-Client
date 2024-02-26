package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public abstract class Class102 {

	@OriginalMember(owner = "client!di", name = "w", descriptor = "I")
	public static final int anInt2925 = 2;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	public static final int anInt2926 = 1;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static final int anInt2927 = 2;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "I")
	public static final int anInt2928 = 3;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	public static final int anInt2929 = 5;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	static final int anInt2930 = 8;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "I")
	public static final int anInt2933 = 1;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static final int anInt2934 = 0;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	protected static final int anInt2937 = 1;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	protected static final int anInt2938 = 2;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	protected static final int anInt2939 = 4;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	protected static final int anInt2940 = 8;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "I")
	protected static final int anInt2941 = 16;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "I")
	protected static final int anInt2942 = 32;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	static final int anInt2943 = 4;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "I")
	public static final int anInt2946 = 0;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "[Z")
	static boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!di", name = "ao", descriptor = "I")
	public int anInt2932;

	@OriginalMember(owner = "client!di", name = "ai", descriptor = "I")
	protected int anInt2935;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!afr;")
	protected Class108_Sub2 aClass108_Sub2_6;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Lclient!dh;")
	protected Class108 aClass108_6;

	@OriginalMember(owner = "client!di", name = "ay", descriptor = "I")
	protected int anInt2945;

	@OriginalMember(owner = "client!di", name = "aq", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!di", name = "aj", descriptor = "I")
	protected int anInt2948;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "I")
	int anInt2944 = -1700972877;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Ljava/util/Hashtable;")
	protected Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!di", name = "ax", descriptor = "[Lclient!afo;")
	final Class108_Sub1[] aClass108_Sub1Array6 = new Class108_Sub1[4];

	@OriginalMember(owner = "client!di", name = "ac", descriptor = "I")
	protected int anInt2936 = 0;

	@OriginalMember(owner = "client!di", name = "ag", descriptor = "F")
	public float aFloat200 = 0.0F;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!dx;")
	public final Class235 aClass235_6;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!ew;")
	public final Interface23 anInterface23_7;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!nh;")
	public final Interface46 anInterface46_6;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Lclient!np;")
	public final Interface47 anInterface47_6;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public final int anInt2931;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;IIII)Lclient!di;")
	static synchronized Class102 method20772(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == 0) {
			return Class267.method26667(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10, 1974054433);
		} else if (arg0 == 1) {
			return Class213.method25837(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return Class537.method30878(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Class458.method29380(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!di", name = "pb", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method20898(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!di", name = "oh", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method20902(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return method20772(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 746642469);
	}

	@OriginalMember(owner = "client!di", name = "og", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method20941(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return method20772(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 746642469);
	}

	@OriginalMember(owner = "client!di", name = "op", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method21055(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return method20772(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 746642469);
	}

	@OriginalMember(owner = "client!di", name = "ob", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;III)Lclient!di;")
	static synchronized Class102 method21059(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg0 == 0) {
			return Class267.method26667(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10, 1965327340);
		} else if (arg0 == 1) {
			return Class213.method25837(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return Class537.method30878(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Class458.method29380(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!di", name = "oy", descriptor = "(I)Z")
	public static boolean method21060(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!di", name = "py", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method21072(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!di", name = "ox", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;III)Lclient!di;")
	static synchronized Class102 method21104(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg0 == 0) {
			return Class267.method26667(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10, 1578942818);
		} else if (arg0 == 1) {
			return Class213.method25837(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return Class537.method30878(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Class458.method29380(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!di", name = "t", descriptor = "(Lclient!ald;I)Lclient!nz;")
	public static Class453 method21129(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class453 local3 = new Class453();
		local3.anInt4894 = arg0.g2() * -1867362097;
		local3.aClass80_Sub1_Sub19_1 = Class610.aClass52_2.method1073(local3.anInt4894 * 221296175, 2012800948);
		return local3;
	}

	@OriginalMember(owner = "client!di", name = "gw", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method21130(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg2.anIntArray525[arg2.anInt5778 * 1896589581];
		@Pc(24) short local24 = (short) arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method27650(local13, local24, local35, 16777472);
		Class296.method26998(arg0, -534549996);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class80_Sub26_Sub2.method21767(arg0.anInt4087 * -2053489901, local13, -578188437);
		}
	}

	@OriginalMember(owner = "client!di", name = "az", descriptor = "(Lclient!yp;B)V")
	static void method21131(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.aLongArray27[(arg0.anInt5777 += 1311199625) * -628853575 - 1] = arg0.aLongArray28[arg0.anIntArray526[arg0.anInt5780 * -1336568839]];
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;)V")
	Class102(@OriginalArg(0) Class235 arg0, @OriginalArg(1) Interface23 arg1, @OriginalArg(2) Interface46 arg2, @OriginalArg(3) Interface47 arg3, @OriginalArg(4) Interface48 arg4) {
		this.aClass235_6 = arg0;
		this.anInterface23_7 = arg1;
		this.anInterface46_6 = arg2;
		this.anInterface47_6 = arg3;
		@Pc(33) int local33 = -1;
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			if (!aBooleanArray13[local35]) {
				aBooleanArray13[local35] = true;
				local33 = local35;
				break;
			}
		}
		if (local33 == -1) {
			throw new IllegalStateException("");
		}
		this.anInt2931 = local33 * 1102256837;
	}

	@OriginalMember(owner = "client!di", name = "hq", descriptor = "(Z)V")
	public abstract void method20654(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "lh", descriptor = "()Lclient!ov;")
	public abstract Class471 method20655();

	@OriginalMember(owner = "client!di", name = "l", descriptor = "()Lclient!cf;")
	public abstract Class203 method20656();

	@OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
	public final void method20657(@OriginalArg(0) int arg0) throws Exception_Sub2 {
		this.method20947(0, 0);
	}

	@OriginalMember(owner = "client!di", name = "fn", descriptor = "()Z")
	public abstract boolean method20658();

	@OriginalMember(owner = "client!di", name = "m", descriptor = "()V")
	public abstract void method20659();

	@OriginalMember(owner = "client!di", name = "o", descriptor = "(I)V")
	public final void method20660(@OriginalArg(0) int arg0) {
		aBooleanArray13[this.anInt2931 * -829205491] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class108_Sub2 local23 = (Class108_Sub2) this.aHashtable6.get(local17);
			local23.method24046();
		}
		this.method20661();
	}

	@OriginalMember(owner = "client!di", name = "j", descriptor = "()V")
	abstract void method20661();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public abstract void method20662(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "kh", descriptor = "()Lclient!pm;")
	public abstract Class487 method20663();

	@OriginalMember(owner = "client!di", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method20660(-747489011);
	}

	@OriginalMember(owner = "client!di", name = "k", descriptor = "()Z")
	public abstract boolean method20664();

	@OriginalMember(owner = "client!di", name = "x", descriptor = "()Z")
	public abstract boolean method20665();

	@OriginalMember(owner = "client!di", name = "w", descriptor = "()Z")
	public abstract boolean method20666();

	@OriginalMember(owner = "client!di", name = "r", descriptor = "()Z")
	public abstract boolean method20667();

	@OriginalMember(owner = "client!di", name = "ly", descriptor = "(IFFFFF)V")
	public abstract void method20668(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "h", descriptor = "()Z")
	public abstract boolean method20669();

	@OriginalMember(owner = "client!di", name = "mz", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	public abstract void method20670(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "z", descriptor = "()Z")
	public abstract boolean method20671();

	@OriginalMember(owner = "client!di", name = "mf", descriptor = "([I)Lclient!cz;")
	public abstract Class97 method20672(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "kl", descriptor = "()I")
	public abstract int method20673();

	@OriginalMember(owner = "client!di", name = "pj", descriptor = "()I")
	public abstract int method20674();

	@OriginalMember(owner = "client!di", name = "n", descriptor = "()[I")
	public abstract int[] method20675();

	@OriginalMember(owner = "client!di", name = "gl", descriptor = "()I")
	public abstract int method20676();

	@OriginalMember(owner = "client!di", name = "ax", descriptor = "(I)Lclient!dh;")
	public final Class108 method20677(@OriginalArg(0) int arg0) {
		return this.aClass108_6;
	}

	@OriginalMember(owner = "client!di", name = "p", descriptor = "()Z")
	public abstract boolean method20678();

	@OriginalMember(owner = "client!di", name = "ai", descriptor = "(Ljava/awt/Canvas;III)V")
	public final void method20679(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class6.method23668(arg0, (byte) 44);
			this.method20680(arg0, this.method20686(arg0, arg1, arg2), 63715336);
		}
	}

	@OriginalMember(owner = "client!di", name = "aq", descriptor = "(Ljava/awt/Canvas;Lclient!afr;I)V")
	final void method20680(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class108_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!di", name = "ao", descriptor = "(Ljava/awt/Canvas;I)V")
	public final void method20681(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class108_Sub2 local10 = (Class108_Sub2) this.aHashtable6.get(arg0);
			local10.method24046();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!di", name = "aj", descriptor = "(Ljava/awt/Canvas;I)V")
	public final void method20682(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class108_Sub2 local5 = (Class108_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2944 * -365586555 <= 0 && this.aClass108_Sub2_6 == this.aClass108_6) {
			if (this.aClass108_6 != null) {
				this.aClass108_6.method24044();
			}
			if (this.anInt2944 * -365586555 < 0) {
				this.aClass108_6 = local5;
			}
			this.aClass108_Sub2_6 = local5;
			local5.method24039();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!di", name = "bl", descriptor = "()V")
	public abstract void method20683();

	@OriginalMember(owner = "client!di", name = "ag", descriptor = "(Lclient!afo;I)V")
	public final void method20684(@OriginalArg(0) Class108_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2944 * -365586555 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2944 * -365586555 >= 0) {
			this.aClass108_Sub1Array6[this.anInt2944 * -365586555].method24044();
		} else {
			this.aClass108_Sub2_6.method24044();
		}
		this.aClass108_6 = this.aClass108_Sub1Array6[(this.anInt2944 += 1700972877) * -365586555] = arg0;
		arg0.method24039();
	}

	@OriginalMember(owner = "client!di", name = "qo", descriptor = "()Z")
	public final boolean method20685() {
		return true;
	}

	@OriginalMember(owner = "client!di", name = "al", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	abstract Class108_Sub2 method20686(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "ah", descriptor = "()Lclient!afo;")
	public abstract Class108_Sub1 method20687();

	@OriginalMember(owner = "client!di", name = "af", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	public abstract Interface18 method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "am", descriptor = "(II)Lclient!de;")
	public abstract Interface17 method20689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "qu", descriptor = "(IIIII)V")
	public final void method20690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20722(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "at", descriptor = "(IIII)[I")
	public abstract int[] method20691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "if", descriptor = "(IIIIII)V")
	public abstract void method20692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "av", descriptor = "()Z")
	public abstract boolean method20693();

	@OriginalMember(owner = "client!di", name = "an", descriptor = "()Z")
	public abstract boolean method20694();

	@OriginalMember(owner = "client!di", name = "aa", descriptor = "()Z")
	public abstract boolean method20695();

	@OriginalMember(owner = "client!di", name = "ae", descriptor = "()Z")
	public abstract boolean method20696();

	@OriginalMember(owner = "client!di", name = "ap", descriptor = "()I")
	public abstract int method20697();

	@OriginalMember(owner = "client!di", name = "ar", descriptor = "()V")
	public abstract void method20698();

	@OriginalMember(owner = "client!di", name = "ez", descriptor = "()V")
	public abstract void method20699();

	@OriginalMember(owner = "client!di", name = "az", descriptor = "(II)J")
	public abstract long method20700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "as", descriptor = "(J)V")
	public abstract void method20701(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!di", name = "aw", descriptor = "(II[I[I)V")
	public abstract void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "bg", descriptor = "(IIB)V")
	final void method20703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt2945 = arg0 * 1014794117;
		this.anInt2935 = arg1 * -2000684019;
		@Pc(19) float local19 = (float) this.aClass108_6.method24036() / (float) this.aClass108_6.method24037();
		@Pc(31) float local31 = (float) (this.anInt2945 * -971613875) / (float) (this.anInt2935 * 143307461);
		if (local19 < local31) {
			this.anInt2948 = (int) (local19 * (float) (this.anInt2935 * 143307461)) * -1599000091;
			this.anInt2936 = this.anInt2935 * 206311319;
		} else {
			this.anInt2948 = this.anInt2945 * 1465032417;
			this.anInt2936 = (int) ((float) (this.anInt2945 * -971613875) / local19) * 1490972331;
		}
		this.aFloat200 = (float) (this.anInt2948 * -244276243) / (float) this.aClass108_6.method24036();
		this.anInt2947 = (this.anInt2945 * -971613875 - this.anInt2948 * -244276243) / 2 * -1896031151;
		this.anInt2932 = (this.anInt2935 * 143307461 - this.anInt2936 * -69329917) / 2 * -1267693371;
	}

	@OriginalMember(owner = "client!di", name = "dw", descriptor = "(I)V")
	public abstract void method20704(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "br", descriptor = "()V")
	public abstract void method20705();

	@OriginalMember(owner = "client!di", name = "bn", descriptor = "(IIII)V")
	public abstract void method20706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "ba", descriptor = "([I)V")
	public abstract void method20707(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "bt", descriptor = "(FF)V")
	public abstract void method20708(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!di", name = "ay", descriptor = "(I)Lclient!afr;")
	public final Class108_Sub2 method20709(@OriginalArg(0) int arg0) {
		return this.aClass108_Sub2_6;
	}

	@OriginalMember(owner = "client!di", name = "gu", descriptor = "()Z")
	public abstract boolean method20710();

	@OriginalMember(owner = "client!di", name = "bi", descriptor = "(IIIII)V")
	abstract void method20711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "bk", descriptor = "(Z)V")
	public void method20712(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!di", name = "bz", descriptor = "([I)V")
	public abstract void method20713(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "be", descriptor = "(II)V")
	public abstract void method20714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "bh", descriptor = "(IIIIII)V")
	public final void method20715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20818(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "bv", descriptor = "(IIIIIB)V")
	public final void method20716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		this.method20722(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "bp", descriptor = "(IIIII)V")
	public final void method20717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20711(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!di", name = "im", descriptor = "(IIIIIII)V")
	public abstract void method20718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!di", name = "bo", descriptor = "(IIIIB)V")
	public final void method20719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.method20922(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!di", name = "bc", descriptor = "(IIIIII)V")
	public final void method20720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20727(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "pt", descriptor = "(Ljava/awt/Canvas;II)V")
	public final void method20721(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class108_Sub2 local5 = (Class108_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method24052(arg1, arg2);
	}

	@OriginalMember(owner = "client!di", name = "bw", descriptor = "(IIIIII)V")
	public abstract void method20722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "b", descriptor = "([I)V")
	public void method20723(@OriginalArg(0) int[] arg0) {
		if (this.aClass108_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass108_Sub2_6.method24036();
			arg0[1] = this.aClass108_Sub2_6.method24037();
		}
	}

	@OriginalMember(owner = "client!di", name = "bx", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method20724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!di", name = "bu", descriptor = "(IIIII)V")
	abstract void method20725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "pa", descriptor = "(Z)V")
	public void method20726(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!di", name = "bq", descriptor = "(IIIIII)V")
	public abstract void method20727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "bd", descriptor = "(IIIIIILclient!cg;II)V")
	public abstract void method20728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!di", name = "cd", descriptor = "(IIIIIIIII)V")
	public abstract void method20729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!di", name = "ov", descriptor = "()V")
	public final void method20730() throws Exception_Sub2 {
		this.method20947(0, 0);
	}

	@OriginalMember(owner = "client!di", name = "ct", descriptor = "(IIIIIII)V")
	public abstract void method20731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!di", name = "lo", descriptor = "(Lclient!df;)V")
	public abstract void method20732(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!di", name = "cy", descriptor = "(IILclient!ov;Lclient!oy;I)Z")
	public final boolean method20733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) int arg4) {
		return this.method20734(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!di", name = "ch", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	abstract boolean method20734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5);

	@OriginalMember(owner = "client!di", name = "cc", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	public abstract void method20735(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2);

	@OriginalMember(owner = "client!di", name = "ic", descriptor = "(IIIIIILclient!cg;IIIII)V")
	public abstract void method20736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!di", name = "ce", descriptor = "(Lclient!akl;)V")
	public abstract void method20737(@OriginalArg(0) Class80_Sub22 arg0);

	@OriginalMember(owner = "client!di", name = "cs", descriptor = "(IIZI)Lclient!cm;")
	public final Class99 method20738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return this.method20739(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!di", name = "cj", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class99 method20739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!di", name = "ck", descriptor = "([IIIIIZ)Lclient!cm;")
	public abstract Class99 method20740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!di", name = "ca", descriptor = "([IIIIII)Lclient!cm;")
	public final Class99 method20741(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method20740(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!di", name = "lt", descriptor = "(Lclient!ov;)V")
	public abstract void method20742(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!di", name = "ci", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class99 method20743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!di", name = "cm", descriptor = "()V")
	public void method20744() {
	}

	@OriginalMember(owner = "client!di", name = "gm", descriptor = "()I")
	public abstract int method20745();

	@OriginalMember(owner = "client!di", name = "cg", descriptor = "()V")
	public void method20746() {
	}

	@OriginalMember(owner = "client!di", name = "fj", descriptor = "()Z")
	public abstract boolean method20747();

	@OriginalMember(owner = "client!di", name = "cw", descriptor = "(ILclient!cg;II)V")
	public abstract void method20748(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "cl", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	public abstract Class104 method20749(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!di", name = "cx", descriptor = "()Lclient!pm;")
	public abstract Class487 method20750();

	@OriginalMember(owner = "client!di", name = "oc", descriptor = "()V")
	public final void method20751() {
		aBooleanArray13[this.anInt2931 * -829205491] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class108_Sub2 local23 = (Class108_Sub2) this.aHashtable6.get(local17);
			local23.method24046();
		}
		this.method20661();
	}

	@OriginalMember(owner = "client!di", name = "co", descriptor = "(I)V")
	public abstract void method20752(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "cz", descriptor = "(Lclient!dt;IIII)Lclient!dn;")
	public abstract Class105 method20753(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "li", descriptor = "(III)V")
	public abstract void method20754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "dg", descriptor = "(II)I")
	public abstract int method20755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "dh", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class100 method20756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!di", name = "dd", descriptor = "(I)Z")
	public final boolean method20757(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!di", name = "iu", descriptor = "(IIIII)V")
	abstract void method20758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "dn", descriptor = "(Lclient!ov;)V")
	public abstract void method20759(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!di", name = "om", descriptor = "(II)Lclient!de;")
	public abstract Interface17 method20760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "hf", descriptor = "(J)V")
	public abstract void method20761(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!di", name = "dl", descriptor = "(Z)V")
	public abstract void method20762(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "dt", descriptor = "()Lclient!pm;")
	public abstract Class487 method20763();

	@OriginalMember(owner = "client!di", name = "ia", descriptor = "(II)V")
	public abstract void method20764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ds", descriptor = "(IFFFFF)V")
	public abstract void method20765(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "ge", descriptor = "(IIII)[I")
	public abstract int[] method20766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "dr", descriptor = "(III)V")
	public abstract void method20767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "dx", descriptor = "()I")
	public abstract int method20768();

	@OriginalMember(owner = "client!di", name = "pw", descriptor = "()I")
	public abstract int method20769();

	@OriginalMember(owner = "client!di", name = "dv", descriptor = "(I[Lclient!akb;)V")
	public abstract void method20770(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1);

	@OriginalMember(owner = "client!di", name = "dm", descriptor = "(I)Lclient!df;")
	public abstract Class106 method20771(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "do", descriptor = "(Lclient!df;)V")
	public abstract void method20773(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!di", name = "dp", descriptor = "(IIII)V")
	public abstract void method20774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "dj", descriptor = "(II)V")
	public abstract void method20775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "di", descriptor = "()Z")
	public abstract boolean method20776();

	@OriginalMember(owner = "client!di", name = "dz", descriptor = "()Z")
	public abstract boolean method20777();

	@OriginalMember(owner = "client!di", name = "qt", descriptor = "(IIIII)V")
	public final void method20778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "da", descriptor = "([I)Lclient!cz;")
	public abstract Class97 method20779(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "dk", descriptor = "()Z")
	public abstract boolean method20780();

	@OriginalMember(owner = "client!di", name = "ib", descriptor = "(IIIII)V")
	abstract void method20781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "cp", descriptor = "()V")
	public void method20782() {
	}

	@OriginalMember(owner = "client!di", name = "qp", descriptor = "(IIII)V")
	public final void method20783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20725(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!di", name = "eo", descriptor = "()Z")
	public abstract boolean method20784();

	@OriginalMember(owner = "client!di", name = "ep", descriptor = "(FFFI)V")
	public final void method20785(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		this.method20786(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!di", name = "ew", descriptor = "(FFFFFF)V")
	abstract void method20786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "ee", descriptor = "(ILclient!dp;)V")
	public abstract void method20787(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1);

	@OriginalMember(owner = "client!di", name = "pk", descriptor = "()Z")
	public abstract boolean method20788();

	@OriginalMember(owner = "client!di", name = "pi", descriptor = "(II)V")
	final void method20789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2945 = arg0 * 1014794117;
		this.anInt2935 = arg1 * -2000684019;
		@Pc(19) float local19 = (float) this.aClass108_6.method24036() / (float) this.aClass108_6.method24037();
		@Pc(31) float local31 = (float) (this.anInt2945 * -971613875) / (float) (this.anInt2935 * 143307461);
		if (local19 < local31) {
			this.anInt2948 = (int) (local19 * (float) (this.anInt2935 * 143307461)) * -1599000091;
			this.anInt2936 = this.anInt2935 * 206311319;
		} else {
			this.anInt2948 = this.anInt2945 * 1465032417;
			this.anInt2936 = (int) ((float) (this.anInt2945 * -971613875) / local19) * 1490972331;
		}
		this.aFloat200 = (float) (this.anInt2948 * -244276243) / (float) this.aClass108_6.method24036();
		this.anInt2947 = (this.anInt2945 * -971613875 - this.anInt2948 * -244276243) / 2 * -1896031151;
		this.anInt2932 = (this.anInt2935 * 143307461 - this.anInt2936 * -69329917) / 2 * -1267693371;
	}

	@OriginalMember(owner = "client!di", name = "ey", descriptor = "(FFF[F)V")
	public abstract void method20790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "q", descriptor = "()Z")
	public abstract boolean method20791();

	@OriginalMember(owner = "client!di", name = "ls", descriptor = "(Lclient!pm;)V")
	public abstract void method20792(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!di", name = "eh", descriptor = "(IIII[FIIII)[F")
	public final float[] method20793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float[] local6 = new float[arg7 * arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg5 + local15 * arg6;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local27 + local29 * arg7];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[(arg0 - 1) * arg7 + local27 + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + local15 * arg2 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local29 * arg7 + arg7 * local15 * arg2 + local34] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "el", descriptor = "(IIII[BIIIB)[B")
	public final byte[] method20794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		@Pc(6) byte[] local6 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local34 + (arg0 - 1) * arg7 + local27];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * arg2 * local15 + local34 * arg7] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * arg2 * local15] = local6[local34 + local27 + local29 * arg7];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "em", descriptor = "(Z)V")
	public abstract void method20795(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "pm", descriptor = "()Z")
	public abstract boolean method20796();

	@OriginalMember(owner = "client!di", name = "et", descriptor = "()Lclient!cf;")
	public abstract Class203 method20797();

	@OriginalMember(owner = "client!di", name = "eu", descriptor = "()Lclient!cf;")
	public abstract Class203 method20798();

	@OriginalMember(owner = "client!di", name = "es", descriptor = "()Lclient!cf;")
	public abstract Class203 method20799();

	@OriginalMember(owner = "client!di", name = "er", descriptor = "(II)V")
	abstract void method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2;

	@OriginalMember(owner = "client!di", name = "du", descriptor = "(F)V")
	public abstract void method20801(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!di", name = "ex", descriptor = "(II)V")
	abstract void method20802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2;

	@OriginalMember(owner = "client!di", name = "eg", descriptor = "()V")
	public abstract void method20803();

	@OriginalMember(owner = "client!di", name = "eb", descriptor = "()V")
	public abstract void method20804();

	@OriginalMember(owner = "client!di", name = "ei", descriptor = "()V")
	public abstract void method20805();

	@OriginalMember(owner = "client!di", name = "ej", descriptor = "()V")
	public abstract void method20806();

	@OriginalMember(owner = "client!di", name = "eq", descriptor = "()V")
	abstract void method20807();

	@OriginalMember(owner = "client!di", name = "fe", descriptor = "()V")
	abstract void method20808();

	@OriginalMember(owner = "client!di", name = "fv", descriptor = "()Z")
	public abstract boolean method20809();

	@OriginalMember(owner = "client!di", name = "jc", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	public abstract Class104 method20810(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!di", name = "fp", descriptor = "()Z")
	public abstract boolean method20811();

	@OriginalMember(owner = "client!di", name = "fx", descriptor = "()Z")
	public abstract boolean method20812();

	@OriginalMember(owner = "client!di", name = "cf", descriptor = "()Lclient!ov;")
	public abstract Class471 method20813();

	@OriginalMember(owner = "client!di", name = "kt", descriptor = "(IIIIIF)Lclient!akb;")
	public Class80_Sub12 method20814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class80_Sub12(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!di", name = "dy", descriptor = "(FFFFF)V")
	public abstract void method20815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!di", name = "fa", descriptor = "()Z")
	public abstract boolean method20816();

	@OriginalMember(owner = "client!di", name = "fz", descriptor = "()Z")
	public abstract boolean method20817();

	@OriginalMember(owner = "client!di", name = "bf", descriptor = "(IIIIII)V")
	public abstract void method20818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "fh", descriptor = "()Z")
	public abstract boolean method20819();

	@OriginalMember(owner = "client!di", name = "ea", descriptor = "(IIII[IIII)[I")
	public final int[] method20820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			@Pc(22) int local22;
			@Pc(24) int local24;
			if (local10 >= arg1) {
				local22 = (arg1 - 1) * arg2;
				for (local24 = 0; local24 < arg2; local24++) {
					local4[local24 + local10 * arg2] = local4[local24 + local22];
				}
			} else {
				local22 = local10 * arg6 + arg5;
				for (local24 = 0; local24 < arg0; local24++) {
					local4[local10 * arg2 + local24] = arg4[local22 + local24];
				}
				local24 = arg4[local22 + (arg0 - 1)];
				for (@Pc(51) int local51 = arg0; local51 < arg2; local51++) {
					local4[local10 * arg2 + local51] = local24;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!di", name = "fo", descriptor = "()Z")
	public abstract boolean method20821();

	@OriginalMember(owner = "client!di", name = "ev", descriptor = "()Z")
	public abstract boolean method20822();

	@OriginalMember(owner = "client!di", name = "fb", descriptor = "()Z")
	public abstract boolean method20823();

	@OriginalMember(owner = "client!di", name = "fd", descriptor = "()Z")
	public abstract boolean method20824();

	@OriginalMember(owner = "client!di", name = "fc", descriptor = "()Z")
	public abstract boolean method20825();

	@OriginalMember(owner = "client!di", name = "fl", descriptor = "()Z")
	public abstract boolean method20826();

	@OriginalMember(owner = "client!di", name = "fg", descriptor = "()Ljava/lang/String;")
	public abstract String method20827();

	@OriginalMember(owner = "client!di", name = "ft", descriptor = "()[I")
	public abstract int[] method20828();

	@OriginalMember(owner = "client!di", name = "fs", descriptor = "()[I")
	public abstract int[] method20829();

	@OriginalMember(owner = "client!di", name = "fu", descriptor = "(Z)V")
	public abstract void method20830(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "ff", descriptor = "(Z)V")
	public abstract void method20831(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "fr", descriptor = "(Z)V")
	public abstract void method20832(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "jb", descriptor = "(II[I[I)Lclient!cg;")
	public abstract Class98 method20833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "gh", descriptor = "(IIII)[I")
	public abstract int[] method20834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "gz", descriptor = "(IIII)[I")
	public abstract int[] method20835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "gk", descriptor = "(IIII)[I")
	public abstract int[] method20836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "gg", descriptor = "(IIII)[I")
	public abstract int[] method20837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "hr", descriptor = "(Z)V")
	public abstract void method20838(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "()V")
	public abstract void method20839();

	@OriginalMember(owner = "client!di", name = "gw", descriptor = "([I)V")
	public void method20840(@OriginalArg(0) int[] arg0) {
		if (this.aClass108_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass108_Sub2_6.method24036();
			arg0[1] = this.aClass108_Sub2_6.method24037();
		}
	}

	@OriginalMember(owner = "client!di", name = "gi", descriptor = "([I)V")
	public void method20841(@OriginalArg(0) int[] arg0) {
		if (this.aClass108_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass108_Sub2_6.method24036();
			arg0[1] = this.aClass108_Sub2_6.method24037();
		}
	}

	@OriginalMember(owner = "client!di", name = "gp", descriptor = "([I)V")
	public void method20842(@OriginalArg(0) int[] arg0) {
		if (this.aClass108_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass108_Sub2_6.method24036();
			arg0[1] = this.aClass108_Sub2_6.method24037();
		}
	}

	@OriginalMember(owner = "client!di", name = "ga", descriptor = "([I)V")
	public void method20843(@OriginalArg(0) int[] arg0) {
		if (this.aClass108_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass108_Sub2_6.method24036();
			arg0[1] = this.aClass108_Sub2_6.method24037();
		}
	}

	@OriginalMember(owner = "client!di", name = "gd", descriptor = "([I)V")
	public void method20844(@OriginalArg(0) int[] arg0) {
		if (this.aClass108_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass108_Sub2_6.method24036();
			arg0[1] = this.aClass108_Sub2_6.method24037();
		}
	}

	@OriginalMember(owner = "client!di", name = "lp", descriptor = "(III)V")
	public abstract void method20845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "gj", descriptor = "()Z")
	public abstract boolean method20846();

	@OriginalMember(owner = "client!di", name = "gf", descriptor = "()Z")
	public abstract boolean method20847();

	@OriginalMember(owner = "client!di", name = "ha", descriptor = "(II[I[I)V")
	public abstract void method20848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "gv", descriptor = "()Z")
	public abstract boolean method20849();

	@OriginalMember(owner = "client!di", name = "gr", descriptor = "()Z")
	public abstract boolean method20850();

	@OriginalMember(owner = "client!di", name = "rg", descriptor = "()V")
	public void method20851() {
	}

	@OriginalMember(owner = "client!di", name = "gt", descriptor = "()Z")
	public abstract boolean method20852();

	@OriginalMember(owner = "client!di", name = "gy", descriptor = "()Z")
	public abstract boolean method20853();

	@OriginalMember(owner = "client!di", name = "dq", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	public abstract Class106 method20854(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3);

	@OriginalMember(owner = "client!di", name = "ih", descriptor = "(IIIIII)V")
	public abstract void method20855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "ed", descriptor = "()V")
	public abstract void method20856();

	@OriginalMember(owner = "client!di", name = "gx", descriptor = "(III)V")
	public abstract void method20857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "v", descriptor = "()Z")
	public abstract boolean method20858();

	@OriginalMember(owner = "client!di", name = "gs", descriptor = "(II)J")
	public abstract long method20859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "hp", descriptor = "(II)J")
	public abstract long method20860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "fq", descriptor = "()Z")
	public abstract boolean method20861();

	@OriginalMember(owner = "client!di", name = "pe", descriptor = "(Ljava/awt/Canvas;)V")
	public final void method20862(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class108_Sub2 local10 = (Class108_Sub2) this.aHashtable6.get(arg0);
			local10.method24046();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!di", name = "ju", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class99 method20863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!di", name = "hw", descriptor = "(II[I[I)V")
	public abstract void method20864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "hk", descriptor = "()V")
	public abstract void method20865();

	@OriginalMember(owner = "client!di", name = "hv", descriptor = "(Z)V")
	public abstract void method20866(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "au", descriptor = "(III)V")
	public abstract void method20867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "ef", descriptor = "(ILclient!dp;)V")
	public abstract void method20868(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1);

	@OriginalMember(owner = "client!di", name = "gq", descriptor = "()I")
	public abstract int method20869();

	@OriginalMember(owner = "client!di", name = "hx", descriptor = "()V")
	public abstract void method20870();

	@OriginalMember(owner = "client!di", name = "pp", descriptor = "(IIIII)V")
	public final void method20871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20722(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "cn", descriptor = "(IIIIII)I")
	public abstract int method20872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "hu", descriptor = "([I)V")
	public abstract void method20873(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "hh", descriptor = "([I)V")
	public abstract void method20874(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "hb", descriptor = "(IIII)V")
	public abstract void method20875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "hm", descriptor = "()V")
	public abstract void method20876();

	@OriginalMember(owner = "client!di", name = "bs", descriptor = "()V")
	public abstract void method20877();

	@OriginalMember(owner = "client!di", name = "hg", descriptor = "(IIII)V")
	public abstract void method20878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "fy", descriptor = "()Z")
	public abstract boolean method20879();

	@OriginalMember(owner = "client!di", name = "hs", descriptor = "(IIII)V")
	public abstract void method20880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "hi", descriptor = "([I)V")
	public abstract void method20881(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "hz", descriptor = "([I)V")
	public abstract void method20882(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "iy", descriptor = "(IIIII)V")
	abstract void method20883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "il", descriptor = "(II)V")
	public abstract void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "in", descriptor = "(II)V")
	public abstract void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "mk", descriptor = "(FFFFFF)V")
	abstract void method20886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "(Lclient!afo;B)V")
	public final void method20887(@OriginalArg(0) Class108_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt2944 * -365586555 < 0 || arg0 != this.aClass108_Sub1Array6[this.anInt2944 * -365586555]) {
			throw new RuntimeException();
		}
		this.aClass108_Sub1Array6[(this.anInt2944 -= 1700972877) * -365586555 + 1] = null;
		arg0.method24044();
		if (this.anInt2944 * -365586555 >= 0) {
			this.aClass108_6 = this.aClass108_Sub1Array6[this.anInt2944 * -365586555];
			this.aClass108_Sub1Array6[this.anInt2944 * -365586555].method24039();
		} else {
			this.aClass108_6 = this.aClass108_Sub2_6;
			this.aClass108_Sub2_6.method24039();
		}
	}

	@OriginalMember(owner = "client!di", name = "io", descriptor = "(IIIIII)V")
	public abstract void method20888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "ie", descriptor = "(IIIIII)V")
	public abstract void method20889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "id", descriptor = "(IIIII)V")
	abstract void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "qf", descriptor = "()V")
	public void method20891() {
	}

	@OriginalMember(owner = "client!di", name = "mq", descriptor = "(FFFFF)V")
	public abstract void method20892(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "(IIIII)V")
	public final void method20893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20725(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!di", name = "ad", descriptor = "()V")
	public abstract void method20894();

	@OriginalMember(owner = "client!di", name = "iq", descriptor = "(IIIII)V")
	abstract void method20895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "it", descriptor = "(IIIII)V")
	abstract void method20896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "df", descriptor = "()Lclient!ov;")
	public abstract Class471 method20897();

	@OriginalMember(owner = "client!di", name = "iw", descriptor = "(IIIIII)V")
	public abstract void method20899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "iv", descriptor = "(IIIIII)V")
	public abstract void method20900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "hd", descriptor = "(FF)V")
	public abstract void method20901(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!di", name = "ig", descriptor = "(IIIIII)V")
	public abstract void method20903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "is", descriptor = "(IIIIIILclient!cg;IIIII)V")
	public abstract void method20904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!di", name = "qj", descriptor = "(IIZ)Lclient!cm;")
	public final Class99 method20905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method20739(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!di", name = "cr", descriptor = "(Lclient!da;Z)Lclient!cm;")
	public abstract Class99 method20906(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!di", name = "ij", descriptor = "(IIIIII)I")
	public abstract int method20907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "iz", descriptor = "(IIIIII)I")
	public abstract int method20908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "jd", descriptor = "(IIIIII)I")
	public abstract int method20909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "ro", descriptor = "(IIII[FIII)[F")
	public final float[] method20910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg7 * arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg5 + local15 * arg6;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local27 + local29 * arg7];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[(arg0 - 1) * arg7 + local27 + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + local15 * arg2 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local29 * arg7 + arg7 * local15 * arg2 + local34] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "s", descriptor = "()I")
	public abstract int method20911();

	@OriginalMember(owner = "client!di", name = "pr", descriptor = "(Ljava/awt/Canvas;II)V")
	public final void method20912(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class108_Sub2 local5 = (Class108_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method24052(arg1, arg2);
	}

	@OriginalMember(owner = "client!di", name = "kz", descriptor = "(Lclient!ov;)V")
	public abstract void method20913(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!di", name = "jr", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	public abstract void method20914(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2);

	@OriginalMember(owner = "client!di", name = "jw", descriptor = "(I)Lclient!akl;")
	public abstract Class80_Sub22 method20915(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "jx", descriptor = "(I)Lclient!akl;")
	public abstract Class80_Sub22 method20916(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "jy", descriptor = "(I)Lclient!akl;")
	public abstract Class80_Sub22 method20917(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "ng", descriptor = "()Lclient!afo;")
	public abstract Class108_Sub1 method20918();

	@OriginalMember(owner = "client!di", name = "jm", descriptor = "(Lclient!akl;)V")
	public abstract void method20919(@OriginalArg(0) Class80_Sub22 arg0);

	@OriginalMember(owner = "client!di", name = "jz", descriptor = "(Lclient!akl;)V")
	public abstract void method20920(@OriginalArg(0) Class80_Sub22 arg0);

	@OriginalMember(owner = "client!di", name = "jn", descriptor = "(Lclient!akl;)V")
	public abstract void method20921(@OriginalArg(0) Class80_Sub22 arg0);

	@OriginalMember(owner = "client!di", name = "bm", descriptor = "(IIIII)V")
	abstract void method20922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "ka", descriptor = "(I[Lclient!akb;)V")
	public abstract void method20923(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1);

	@OriginalMember(owner = "client!di", name = "jq", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class99 method20924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!di", name = "mh", descriptor = "()Z")
	public abstract boolean method20925();

	@OriginalMember(owner = "client!di", name = "je", descriptor = "([IIIIIZ)Lclient!cm;")
	public abstract Class99 method20926(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!di", name = "js", descriptor = "(Lclient!da;Z)Lclient!cm;")
	public abstract Class99 method20927(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!di", name = "ec", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	public abstract void method20928(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "jg", descriptor = "(II[I[I)Lclient!cg;")
	public abstract Class98 method20929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "jf", descriptor = "(II[I[I)Lclient!cg;")
	public abstract Class98 method20930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "ja", descriptor = "(II[I[I)Lclient!cg;")
	public abstract Class98 method20931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "ji", descriptor = "(ILclient!cg;II)V")
	public abstract void method20932(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "db", descriptor = "(Lclient!pm;)V")
	public abstract void method20933(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!di", name = "jp", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	public abstract Class104 method20934(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!di", name = "ku", descriptor = "(I)V")
	public abstract void method20935(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "kv", descriptor = "(Lclient!dt;IIII)Lclient!dn;")
	public abstract Class105 method20936(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "kr", descriptor = "(II)I")
	public abstract int method20937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ki", descriptor = "(II)I")
	public abstract int method20938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ke", descriptor = "(II)I")
	public abstract int method20939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "kx", descriptor = "(II)I")
	public abstract int method20940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ho", descriptor = "(IIII)V")
	public abstract void method20942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "kk", descriptor = "()Lclient!pm;")
	public abstract Class487 method20943();

	@OriginalMember(owner = "client!di", name = "kw", descriptor = "()Lclient!pm;")
	public abstract Class487 method20944();

	@OriginalMember(owner = "client!di", name = "kg", descriptor = "()Lclient!pm;")
	public abstract Class487 method20945();

	@OriginalMember(owner = "client!di", name = "kb", descriptor = "()Lclient!ov;")
	public abstract Class471 method20946();

	@OriginalMember(owner = "client!di", name = "i", descriptor = "(II)V")
	abstract void method20947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2;

	@OriginalMember(owner = "client!di", name = "ld", descriptor = "(I)V")
	public abstract void method20948(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "kj", descriptor = "()I")
	public abstract int method20949();

	@OriginalMember(owner = "client!di", name = "kf", descriptor = "()I")
	public abstract int method20950();

	@OriginalMember(owner = "client!di", name = "jk", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	public abstract void method20951(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2);

	@OriginalMember(owner = "client!di", name = "kq", descriptor = "(IIIIIF)Lclient!akb;")
	public Class80_Sub12 method20952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class80_Sub12(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!di", name = "lm", descriptor = "(Lclient!pm;)V")
	public abstract void method20953(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!di", name = "kd", descriptor = "(I[Lclient!akb;)V")
	public abstract void method20954(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1);

	@OriginalMember(owner = "client!di", name = "kn", descriptor = "(Lclient!db;)V")
	public abstract void method20955(@OriginalArg(0) Class221 arg0);

	@OriginalMember(owner = "client!di", name = "kc", descriptor = "(Lclient!db;)V")
	public abstract void method20956(@OriginalArg(0) Class221 arg0);

	@OriginalMember(owner = "client!di", name = "km", descriptor = "(Lclient!db;)V")
	public abstract void method20957(@OriginalArg(0) Class221 arg0);

	@OriginalMember(owner = "client!di", name = "ko", descriptor = "(Lclient!db;)V")
	public abstract void method20958(@OriginalArg(0) Class221 arg0);

	@OriginalMember(owner = "client!di", name = "me", descriptor = "()Z")
	public abstract boolean method20959();

	@OriginalMember(owner = "client!di", name = "hl", descriptor = "()V")
	public abstract void method20960();

	@OriginalMember(owner = "client!di", name = "jo", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class99 method20961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!di", name = "lv", descriptor = "(Lclient!ov;)V")
	public abstract void method20962(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!di", name = "lk", descriptor = "(Lclient!ov;)V")
	public abstract void method20963(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!di", name = "dc", descriptor = "(Lclient!db;)V")
	public abstract void method20964(@OriginalArg(0) Class221 arg0);

	@OriginalMember(owner = "client!di", name = "jv", descriptor = "(IIIIII)I")
	public abstract int method20965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!di", name = "jl", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	abstract boolean method20966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5);

	@OriginalMember(owner = "client!di", name = "jh", descriptor = "(Lclient!akl;)V")
	public abstract void method20967(@OriginalArg(0) Class80_Sub22 arg0);

	@OriginalMember(owner = "client!di", name = "ll", descriptor = "()Lclient!pm;")
	public abstract Class487 method20968();

	@OriginalMember(owner = "client!di", name = "fk", descriptor = "()Z")
	public abstract boolean method20969();

	@OriginalMember(owner = "client!di", name = "lg", descriptor = "(IFFFFF)V")
	public abstract void method20970(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "la", descriptor = "(Lclient!df;)V")
	public abstract void method20971(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!di", name = "by", descriptor = "(IIII)V")
	public abstract void method20972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "kp", descriptor = "()Lclient!pm;")
	public abstract Class487 method20973();

	@OriginalMember(owner = "client!di", name = "lf", descriptor = "(II)V")
	public abstract void method20974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "qe", descriptor = "()V")
	public void method20975() {
	}

	@OriginalMember(owner = "client!di", name = "lc", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	public abstract Class106 method20976(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3);

	@OriginalMember(owner = "client!di", name = "lr", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	public abstract Class106 method20977(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3);

	@OriginalMember(owner = "client!di", name = "lu", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	public abstract Class106 method20978(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3);

	@OriginalMember(owner = "client!di", name = "cv", descriptor = "(IIIIIILclient!cg;IIIII)V")
	public abstract void method20979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!di", name = "fi", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	abstract Class108_Sub2 method20980(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "jt", descriptor = "([IIIIIZ)Lclient!cm;")
	public abstract Class99 method20981(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!di", name = "lb", descriptor = "(Lclient!df;)V")
	public abstract void method20982(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!di", name = "lw", descriptor = "(Lclient!df;)V")
	public abstract void method20983(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!di", name = "le", descriptor = "(IIII)V")
	public abstract void method20984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "lq", descriptor = "(IIII)V")
	public abstract void method20985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "bj", descriptor = "(IIII)V")
	public abstract void method20986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "ik", descriptor = "(IIIIIIIII)V")
	public abstract void method20987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!di", name = "mn", descriptor = "(FFFFF)V")
	public abstract void method20988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!di", name = "mp", descriptor = "()Z")
	public abstract boolean method20989();

	@OriginalMember(owner = "client!di", name = "hc", descriptor = "(IIII)V")
	public abstract void method20990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "my", descriptor = "()Z")
	public abstract boolean method20991();

	@OriginalMember(owner = "client!di", name = "pc", descriptor = "()Lclient!afr;")
	public final Class108_Sub2 method20992() {
		return this.aClass108_Sub2_6;
	}

	@OriginalMember(owner = "client!di", name = "mo", descriptor = "()Z")
	public abstract boolean method20993();

	@OriginalMember(owner = "client!di", name = "jj", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	abstract boolean method20994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5);

	@OriginalMember(owner = "client!di", name = "go", descriptor = "()Z")
	public abstract boolean method20995();

	@OriginalMember(owner = "client!di", name = "ma", descriptor = "(FFFFF)V")
	public abstract void method20996(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!di", name = "fm", descriptor = "()Z")
	public abstract boolean method20997();

	@OriginalMember(owner = "client!di", name = "md", descriptor = "([I)Lclient!cz;")
	public abstract Class97 method20998(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!di", name = "mu", descriptor = "()Z")
	public abstract boolean method20999();

	@OriginalMember(owner = "client!di", name = "mg", descriptor = "()Z")
	public abstract boolean method21000();

	@OriginalMember(owner = "client!di", name = "mv", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	public abstract void method21001(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "mc", descriptor = "(II)V")
	public abstract void method21002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ir", descriptor = "(IIIII)V")
	abstract void method21003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "mw", descriptor = "()V")
	public abstract void method21004();

	@OriginalMember(owner = "client!di", name = "mt", descriptor = "()V")
	public abstract void method21005();

	@OriginalMember(owner = "client!di", name = "mx", descriptor = "()V")
	public abstract void method21006();

	@OriginalMember(owner = "client!di", name = "mr", descriptor = "()Z")
	public abstract boolean method21007();

	@OriginalMember(owner = "client!di", name = "ac", descriptor = "(Ljava/awt/Canvas;IIS)V")
	public final void method21008(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(5) Class108_Sub2 local5 = (Class108_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method24052(arg1, arg2);
	}

	@OriginalMember(owner = "client!di", name = "ms", descriptor = "(FFFFFF)V")
	abstract void method21009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "mb", descriptor = "(ILclient!dp;)V")
	public abstract void method21010(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1);

	@OriginalMember(owner = "client!di", name = "mm", descriptor = "()V")
	public abstract void method21011();

	@OriginalMember(owner = "client!di", name = "mi", descriptor = "()V")
	public abstract void method21012();

	@OriginalMember(owner = "client!di", name = "nv", descriptor = "()V")
	public abstract void method21013();

	@OriginalMember(owner = "client!di", name = "nz", descriptor = "()V")
	public abstract void method21014();

	@OriginalMember(owner = "client!di", name = "nk", descriptor = "()V")
	public abstract void method21015();

	@OriginalMember(owner = "client!di", name = "ne", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method21016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!di", name = "os", descriptor = "()V")
	public final void method21017() {
		aBooleanArray13[this.anInt2931 * -829205491] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class108_Sub2 local23 = (Class108_Sub2) this.aHashtable6.get(local17);
			local23.method24046();
		}
		this.method20661();
	}

	@OriginalMember(owner = "client!di", name = "nr", descriptor = "()Lclient!afo;")
	public abstract Class108_Sub1 method21018();

	@OriginalMember(owner = "client!di", name = "hy", descriptor = "()V")
	void method21019() {
		this.method20660(-1464419647);
	}

	@OriginalMember(owner = "client!di", name = "nc", descriptor = "(FFF[F)V")
	public abstract void method21020(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "nw", descriptor = "(FFF[F)V")
	public abstract void method21021(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "np", descriptor = "(FFF[F)V")
	public abstract void method21022(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "nq", descriptor = "(FFF[F)V")
	public abstract void method21023(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "nh", descriptor = "(FFF[F)V")
	public abstract void method21024(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "lx", descriptor = "(IFFFFF)V")
	public abstract void method21025(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "gc", descriptor = "()Z")
	public abstract boolean method21026();

	@OriginalMember(owner = "client!di", name = "fw", descriptor = "()Z")
	public abstract boolean method21027();

	@OriginalMember(owner = "client!di", name = "ny", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	public abstract Interface18 method21028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "ks", descriptor = "()Lclient!ov;")
	public abstract Class471 method21029();

	@OriginalMember(owner = "client!di", name = "hj", descriptor = "()V")
	void method21030() {
		this.method20660(-1577266968);
	}

	@OriginalMember(owner = "client!di", name = "ht", descriptor = "()V")
	void method21031() {
		this.method20660(-1924506820);
	}

	@OriginalMember(owner = "client!di", name = "ni", descriptor = "()Z")
	public abstract boolean method21032();

	@OriginalMember(owner = "client!di", name = "nd", descriptor = "()Z")
	public abstract boolean method21033();

	@OriginalMember(owner = "client!di", name = "nn", descriptor = "()Z")
	public abstract boolean method21034();

	@OriginalMember(owner = "client!di", name = "ow", descriptor = "()Z")
	public abstract boolean method21035();

	@OriginalMember(owner = "client!di", name = "nx", descriptor = "()Z")
	public abstract boolean method21036();

	@OriginalMember(owner = "client!di", name = "nu", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class99 method21037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!di", name = "nm", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class99 method21038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!di", name = "ns", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class99 method21039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!di", name = "nb", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class99 method21040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!di", name = "nj", descriptor = "(II)I")
	public abstract int method21041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ot", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class100 method21042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!di", name = "ix", descriptor = "(IIIII)V")
	abstract void method21043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "ok", descriptor = "(ILclient!dp;)V")
	public abstract void method21044(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1);

	@OriginalMember(owner = "client!di", name = "od", descriptor = "(F)V")
	public abstract void method21045(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!di", name = "oo", descriptor = "(F)V")
	public abstract void method21046(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!di", name = "of", descriptor = "(I)Lclient!df;")
	public abstract Class106 method21047(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "y", descriptor = "()Ljava/lang/String;")
	public abstract String method21048();

	@OriginalMember(owner = "client!di", name = "oe", descriptor = "()Z")
	public abstract boolean method21049();

	@OriginalMember(owner = "client!di", name = "oi", descriptor = "(II)Lclient!de;")
	public abstract Interface17 method21050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "lz", descriptor = "(I)V")
	public abstract void method21051(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "oj", descriptor = "(III)Lclient!de;")
	public abstract Interface17 method21052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "oa", descriptor = "(III)Lclient!de;")
	public abstract Interface17 method21053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "ou", descriptor = "(I)V")
	public abstract void method21054(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "nf", descriptor = "()Z")
	public abstract boolean method21056();

	@OriginalMember(owner = "client!di", name = "nl", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method21057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!di", name = "mj", descriptor = "()Z")
	public abstract boolean method21058();

	@OriginalMember(owner = "client!di", name = "or", descriptor = "()V")
	public final void method21061() throws Exception_Sub2 {
		this.method20947(0, 0);
	}

	@OriginalMember(owner = "client!di", name = "qz", descriptor = "([IIIII)Lclient!cm;")
	public final Class99 method21062(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method20740(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!di", name = "ky", descriptor = "(Lclient!ov;)V")
	public abstract void method21063(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!di", name = "qm", descriptor = "(IILclient!ov;Lclient!oy;)Z")
	public final boolean method21064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3) {
		return this.method20734(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!di", name = "oq", descriptor = "()V")
	public final void method21065() {
		aBooleanArray13[this.anInt2931 * -829205491] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class108_Sub2 local23 = (Class108_Sub2) this.aHashtable6.get(local17);
			local23.method24046();
		}
		this.method20661();
	}

	@OriginalMember(owner = "client!di", name = "on", descriptor = "()V")
	public final void method21066() {
		aBooleanArray13[this.anInt2931 * -829205491] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class108_Sub2 local23 = (Class108_Sub2) this.aHashtable6.get(local17);
			local23.method24046();
		}
		this.method20661();
	}

	@OriginalMember(owner = "client!di", name = "ii", descriptor = "(IIIIIILclient!cg;II)V")
	public abstract void method21067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!di", name = "pn", descriptor = "(II)V")
	final void method21068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2945 = arg0 * 1014794117;
		this.anInt2935 = arg1 * -2000684019;
		@Pc(19) float local19 = (float) this.aClass108_6.method24036() / (float) this.aClass108_6.method24037();
		@Pc(31) float local31 = (float) (this.anInt2945 * -971613875) / (float) (this.anInt2935 * 143307461);
		if (local19 < local31) {
			this.anInt2948 = (int) (local19 * (float) (this.anInt2935 * 143307461)) * -1599000091;
			this.anInt2936 = this.anInt2935 * 206311319;
		} else {
			this.anInt2948 = this.anInt2945 * 1465032417;
			this.anInt2936 = (int) ((float) (this.anInt2945 * -971613875) / local19) * 1490972331;
		}
		this.aFloat200 = (float) (this.anInt2948 * -244276243) / (float) this.aClass108_6.method24036();
		this.anInt2947 = (this.anInt2945 * -971613875 - this.anInt2948 * -244276243) / 2 * -1896031151;
		this.anInt2932 = (this.anInt2935 * 143307461 - this.anInt2936 * -69329917) / 2 * -1267693371;
	}

	@OriginalMember(owner = "client!di", name = "qh", descriptor = "(IIZ)Lclient!cm;")
	public final Class99 method21069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method20739(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!di", name = "px", descriptor = "()Z")
	public abstract boolean method21070();

	@OriginalMember(owner = "client!di", name = "he", descriptor = "(Z)V")
	public abstract void method21071(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!di", name = "qg", descriptor = "()V")
	public void method21073() {
	}

	@OriginalMember(owner = "client!di", name = "en", descriptor = "(II)V")
	abstract void method21074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2;

	@OriginalMember(owner = "client!di", name = "pg", descriptor = "()Lclient!afr;")
	public final Class108_Sub2 method21075() {
		return this.aClass108_Sub2_6;
	}

	@OriginalMember(owner = "client!di", name = "pu", descriptor = "(Ljava/awt/Canvas;II)V")
	public final void method21076(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class6.method23668(arg0, (byte) 38);
			this.method20680(arg0, this.method20686(arg0, arg1, arg2), 1215643242);
		}
	}

	@OriginalMember(owner = "client!di", name = "ru", descriptor = "()V")
	public void method21077() {
	}

	@OriginalMember(owner = "client!di", name = "pd", descriptor = "(Ljava/awt/Canvas;)V")
	public final void method21078(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class108_Sub2 local10 = (Class108_Sub2) this.aHashtable6.get(arg0);
			local10.method24046();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!di", name = "po", descriptor = "(Ljava/awt/Canvas;)V")
	public final void method21079(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class108_Sub2 local5 = (Class108_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2944 * -365586555 <= 0 && this.aClass108_Sub2_6 == this.aClass108_6) {
			if (this.aClass108_6 != null) {
				this.aClass108_6.method24044();
			}
			if (this.anInt2944 * -365586555 < 0) {
				this.aClass108_6 = local5;
			}
			this.aClass108_Sub2_6 = local5;
			local5.method24039();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!di", name = "oz", descriptor = "()V")
	public final void method21080() throws Exception_Sub2 {
		this.method20947(0, 0);
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "()Z")
	public abstract boolean method21081();

	@OriginalMember(owner = "client!di", name = "ps", descriptor = "(Lclient!afo;)V")
	public final void method21082(@OriginalArg(0) Class108_Sub1 arg0) {
		if (this.anInt2944 * -365586555 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2944 * -365586555 >= 0) {
			this.aClass108_Sub1Array6[this.anInt2944 * -365586555].method24044();
		} else {
			this.aClass108_Sub2_6.method24044();
		}
		this.aClass108_6 = this.aClass108_Sub1Array6[(this.anInt2944 += 1700972877) * -365586555] = arg0;
		arg0.method24039();
	}

	@OriginalMember(owner = "client!di", name = "cq", descriptor = "(II)I")
	public abstract int method21083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "ip", descriptor = "(IIIII)V")
	abstract void method21084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "pf", descriptor = "(II)V")
	final void method21085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2945 = arg0 * 1014794117;
		this.anInt2935 = arg1 * -2000684019;
		@Pc(19) float local19 = (float) this.aClass108_6.method24036() / (float) this.aClass108_6.method24037();
		@Pc(31) float local31 = (float) (this.anInt2945 * -971613875) / (float) (this.anInt2935 * 143307461);
		if (local19 < local31) {
			this.anInt2948 = (int) (local19 * (float) (this.anInt2935 * 143307461)) * -1599000091;
			this.anInt2936 = this.anInt2935 * 206311319;
		} else {
			this.anInt2948 = this.anInt2945 * 1465032417;
			this.anInt2936 = (int) ((float) (this.anInt2945 * -971613875) / local19) * 1490972331;
		}
		this.aFloat200 = (float) (this.anInt2948 * -244276243) / (float) this.aClass108_6.method24036();
		this.anInt2947 = (this.anInt2945 * -971613875 - this.anInt2948 * -244276243) / 2 * -1896031151;
		this.anInt2932 = (this.anInt2935 * 143307461 - this.anInt2936 * -69329917) / 2 * -1267693371;
	}

	@OriginalMember(owner = "client!di", name = "ph", descriptor = "(Z)V")
	public void method21086(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!di", name = "gn", descriptor = "()V")
	public abstract void method21087();

	@OriginalMember(owner = "client!di", name = "lj", descriptor = "()Lclient!ov;")
	public abstract Class471 method21088();

	@OriginalMember(owner = "client!di", name = "pv", descriptor = "(IIIII)V")
	public final void method21089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20818(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "pz", descriptor = "(IIIII)V")
	public final void method21090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20818(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "pq", descriptor = "(IIIII)V")
	public final void method21091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20818(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "qn", descriptor = "(IIIII)V")
	public final void method21092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "cu", descriptor = "(I)Lclient!akl;")
	public abstract Class80_Sub22 method21093(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "qc", descriptor = "(IIIII)V")
	public final void method21094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20722(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "qi", descriptor = "(IIII)V")
	public final void method21095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20711(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!di", name = "no", descriptor = "(FFF[F)V")
	public abstract void method21096(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "qx", descriptor = "(IIII)V")
	public final void method21097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20922(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!di", name = "hn", descriptor = "(II[I[I)V")
	public abstract void method21098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "qa", descriptor = "(IIIII)V")
	public final void method21099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "de", descriptor = "(IIIIIF)Lclient!akb;")
	public Class80_Sub12 method21100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class80_Sub12(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!di", name = "ql", descriptor = "(IIIII)V")
	public final void method21101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!di", name = "qk", descriptor = "(IILclient!ov;Lclient!oy;)Z")
	public final boolean method21102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3) {
		return this.method20734(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "(II[I[I)Lclient!cg;")
	public abstract Class98 method21103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!di", name = "pl", descriptor = "(Z)V")
	public void method21105(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!di", name = "qy", descriptor = "(IIZ)Lclient!cm;")
	public final Class99 method21106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method20739(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!di", name = "ln", descriptor = "(IIII)V")
	public abstract void method21107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!di", name = "qw", descriptor = "([IIIII)Lclient!cm;")
	public final Class99 method21108(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method20740(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!di", name = "qd", descriptor = "()V")
	public void method21109() {
	}

	@OriginalMember(owner = "client!di", name = "nt", descriptor = "(FFF[F)V")
	public abstract void method21110(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "ol", descriptor = "(ILclient!dp;)V")
	public abstract void method21111(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1);

	@OriginalMember(owner = "client!di", name = "qb", descriptor = "()V")
	public void method21112() {
	}

	@OriginalMember(owner = "client!di", name = "qv", descriptor = "()V")
	public void method21113() {
	}

	@OriginalMember(owner = "client!di", name = "ek", descriptor = "(FFF[F)V")
	public abstract void method21114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!di", name = "ak", descriptor = "(III)Lclient!de;")
	public abstract Interface17 method21115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!di", name = "qr", descriptor = "(FFF)V")
	public final void method21116(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20786(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!di", name = "qq", descriptor = "(FFF)V")
	public final void method21117(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20786(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!di", name = "qs", descriptor = "(IIII[III)[I")
	public final int[] method21118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			@Pc(22) int local22;
			@Pc(24) int local24;
			if (local10 >= arg1) {
				local22 = (arg1 - 1) * arg2;
				for (local24 = 0; local24 < arg2; local24++) {
					local4[local24 + local10 * arg2] = local4[local24 + local22];
				}
			} else {
				local22 = local10 * arg6 + arg5;
				for (local24 = 0; local24 < arg0; local24++) {
					local4[local10 * arg2 + local24] = arg4[local22 + local24];
				}
				local24 = arg4[local22 + (arg0 - 1)];
				for (@Pc(51) int local51 = arg0; local51 < arg2; local51++) {
					local4[local10 * arg2 + local51] = local24;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!di", name = "rh", descriptor = "(IIII[III)[I")
	public final int[] method21119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			@Pc(22) int local22;
			@Pc(24) int local24;
			if (local10 >= arg1) {
				local22 = (arg1 - 1) * arg2;
				for (local24 = 0; local24 < arg2; local24++) {
					local4[local24 + local10 * arg2] = local4[local24 + local22];
				}
			} else {
				local22 = local10 * arg6 + arg5;
				for (local24 = 0; local24 < arg0; local24++) {
					local4[local10 * arg2 + local24] = arg4[local22 + local24];
				}
				local24 = arg4[local22 + (arg0 - 1)];
				for (@Pc(51) int local51 = arg0; local51 < arg2; local51++) {
					local4[local10 * arg2 + local51] = local24;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!di", name = "ml", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	public abstract void method21120(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!di", name = "rk", descriptor = "(IIII[FIII)[F")
	public final float[] method21121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg7 * arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg5 + local15 * arg6;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local27 + local29 * arg7];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[(arg0 - 1) * arg7 + local27 + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + local15 * arg2 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local29 * arg7 + arg7 * local15 * arg2 + local34] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "rf", descriptor = "(IIII[FIII)[F")
	public final float[] method21122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg7 * arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg5 + local15 * arg6;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local27 + local29 * arg7];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[(arg0 - 1) * arg7 + local27 + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + local15 * arg2 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local29 * arg7 + arg7 * local15 * arg2 + local34] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "ry", descriptor = "(IIII[FIII)[F")
	public final float[] method21123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg7 * arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg5 + local15 * arg6;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local27 + local29 * arg7];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[(arg0 - 1) * arg7 + local27 + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + local15 * arg2 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local29 * arg7 + arg7 * local15 * arg2 + local34] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "ra", descriptor = "(IIII[FIII)[F")
	public final float[] method21124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg7 * arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg5 + local15 * arg6;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local27 + local29 * arg7];
					}
				}
				@Pc(66) float[] local66 = new float[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[(arg0 - 1) * arg7 + local27 + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + local15 * arg2 * arg7 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local29 * arg7 + arg7 * local15 * arg2 + local34] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "rl", descriptor = "(IIII[BIII)[B")
	public final byte[] method21125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local34 + (arg0 - 1) * arg7 + local27];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * arg2 * local15 + local34 * arg7] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + local29 * arg7 + arg7 * arg2 * local15] = local6[local34 + local27 + local29 * arg7];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "na", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	public abstract Interface18 method21126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!di", name = "rb", descriptor = "()V")
	public void method21127() {
	}

	@OriginalMember(owner = "client!di", name = "rt", descriptor = "()V")
	public void method21128() {
	}
}
