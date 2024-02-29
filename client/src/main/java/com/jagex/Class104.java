package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class104 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	public static final int anInt2883 = 1;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public static final int anInt2884 = 2;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public static final int anInt2885 = 2;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public static final int anInt2886 = 5;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	protected static final int anInt2887 = 8;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public static final int anInt2889 = 0;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
	static final int anInt2890 = 8;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
	protected static final int anInt2891 = 1;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
	protected static final int anInt2892 = 2;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	public static final int anInt2893 = 1;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static final int anInt2894 = 0;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	protected static final int anInt2895 = 16;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	protected static final int anInt2896 = 32;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	static final int anInt2897 = 4;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	protected static final int anInt2902 = 4;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public static final int anInt2905 = 3;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[Z")
	static boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!dh", name = "ah", descriptor = "I")
	protected int anInt2882;

	@OriginalMember(owner = "client!dh", name = "al", descriptor = "I")
	public int anInt2899;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!afy;")
	protected Class112_Sub2 aClass112_Sub2_6;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!dr;")
	protected Class112 aClass112_6;

	@OriginalMember(owner = "client!dh", name = "ag", descriptor = "I")
	protected int anInt2900;

	@OriginalMember(owner = "client!dh", name = "ac", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!dh", name = "ai", descriptor = "I")
	protected int anInt2904;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	int anInt2901 = -1054095589;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Ljava/util/Hashtable;")
	protected Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!dh", name = "ae", descriptor = "[Lclient!afq;")
	final Class112_Sub1[] aClass112_Sub1Array6 = new Class112_Sub1[4];

	@OriginalMember(owner = "client!dh", name = "aw", descriptor = "I")
	protected int anInt2898 = 0;

	@OriginalMember(owner = "client!dh", name = "as", descriptor = "F")
	public float aFloat199 = 0.0F;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Lclient!df;")
	public final Class225 aClass225_6;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "Lclient!es;")
	public final Interface24 anInterface24_6;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!nx;")
	public final Interface48 anInterface48_6;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!nb;")
	public final Interface46 anInterface46_6;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
	public final int anInt2888;

	@OriginalMember(owner = "client!dh", name = "oz", descriptor = "(ILjava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 53)
	public static Class104 method20412(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface48 arg4, @OriginalArg(5) Interface46 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Class497 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return method20415(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 2057640944);
	}

	@OriginalMember(owner = "client!dh", name = "oa", descriptor = "(ILjava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 53)
	public static Class104 method20413(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface48 arg4, @OriginalArg(5) Interface46 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Class497 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return method20415(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 1290086983);
	}

	@OriginalMember(owner = "client!dh", name = "ob", descriptor = "(ILjava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 53)
	public static Class104 method20414(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface48 arg4, @OriginalArg(5) Interface46 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Class497 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return method20415(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 1478240159);
	}

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "(ILjava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;IIII)Lclient!dh;", line = 64)
	static synchronized Class104 method20415(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface48 arg4, @OriginalArg(5) Interface46 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Class497 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == 0) {
			return Class279.method26366(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10, (byte) 9);
		} else if (arg0 == 1) {
			return Class208.method25403(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return Class524.method30372(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Class455.method29115(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "op", descriptor = "(I)Z", line = 76)
	public static boolean method20416(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!dh", name = "om", descriptor = "(I)Z", line = 76)
	public static boolean method20417(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!dh", name = "of", descriptor = "(I)Z", line = 76)
	public static boolean method20418(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!dh", name = "oy", descriptor = "(I)Z", line = 80)
	public static boolean method20419(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dh", name = "od", descriptor = "(I)Z", line = 80)
	public static boolean method20420(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;)V", line = 83)
	Class104(@OriginalArg(0) Class225 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) Interface48 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4) {
		this.aClass225_6 = arg0;
		this.anInterface24_6 = arg1;
		this.anInterface48_6 = arg2;
		this.anInterface46_6 = arg3;
		@Pc(33) int local33 = -1;
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			if (!aBooleanArray18[local35]) {
				aBooleanArray18[local35] = true;
				local33 = local35;
				break;
			}
		}
		if (local33 == -1) {
			throw new IllegalStateException("");
		}
		this.anInt2888 = local33 * -1744045465;
	}

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "(I)V", line = 101)
	public final void method20421(@OriginalArg(0) int arg0) throws Exception_Sub4 {
		this.method20528(0, 0);
	}

	@OriginalMember(owner = "client!dh", name = "og", descriptor = "()V", line = 101)
	public final void method20422() throws Exception_Sub4 {
		this.method20528(0, 0);
	}

	@OriginalMember(owner = "client!dh", name = "os", descriptor = "()V", line = 101)
	public final void method20423() throws Exception_Sub4 {
		this.method20528(0, 0);
	}

	@OriginalMember(owner = "client!dh", name = "on", descriptor = "()V", line = 101)
	public final void method20424() throws Exception_Sub4 {
		this.method20528(0, 0);
	}

	@OriginalMember(owner = "client!dh", name = "ou", descriptor = "()V", line = 108)
	public void method20425() {
		aBooleanArray18[this.anInt2888 * 658538839] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class112_Sub2 local23 = (Class112_Sub2) this.aHashtable6.get(local17);
			local23.method23739();
		}
		this.method20735();
	}

	@OriginalMember(owner = "client!dh", name = "ok", descriptor = "()V", line = 108)
	public void method20426() {
		aBooleanArray18[this.anInt2888 * 658538839] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class112_Sub2 local23 = (Class112_Sub2) this.aHashtable6.get(local17);
			local23.method23739();
		}
		this.method20735();
	}

	@OriginalMember(owner = "client!dh", name = "oj", descriptor = "()V", line = 108)
	public void method20427() {
		aBooleanArray18[this.anInt2888 * 658538839] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class112_Sub2 local23 = (Class112_Sub2) this.aHashtable6.get(local17);
			local23.method23739();
		}
		this.method20735();
	}

	@OriginalMember(owner = "client!dh", name = "or", descriptor = "()V", line = 108)
	public void method20428() {
		aBooleanArray18[this.anInt2888 * 658538839] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class112_Sub2 local23 = (Class112_Sub2) this.aHashtable6.get(local17);
			local23.method23739();
		}
		this.method20735();
	}

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "(I)V", line = 108)
	public void method20429(@OriginalArg(0) int arg0) {
		aBooleanArray18[this.anInt2888 * 658538839] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class112_Sub2 local23 = (Class112_Sub2) this.aHashtable6.get(local17);
			local23.method23739();
		}
		this.method20735();
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)[Lclient!cy;", line = 110)
	static Class218[] method20430(@OriginalArg(0) byte arg0) {
		return new Class218[] { Class218.aClass218_7, Class218.aClass218_6, Class218.aClass218_1, Class218.aClass218_3, Class218.aClass218_5, Class218.aClass218_2, Class218.aClass218_4, Class218.aClass218_8, Class218.aClass218_9 };
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V", line = 123)
	@Override
	protected void finalize() {
		this.method20429(-1801463895);
	}

	@OriginalMember(owner = "client!dh", name = "hl", descriptor = "()V", line = 123)
	void method20431() {
		this.method20429(-1571975788);
	}

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "([I)V", line = 149)
	public void method20432(@OriginalArg(0) int[] arg0) {
		if (this.aClass112_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass112_Sub2_6.method23737();
			arg0[1] = this.aClass112_Sub2_6.method23738();
		}
	}

	@OriginalMember(owner = "client!dh", name = "ga", descriptor = "([I)V", line = 149)
	public void method20433(@OriginalArg(0) int[] arg0) {
		if (this.aClass112_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass112_Sub2_6.method23737();
			arg0[1] = this.aClass112_Sub2_6.method23738();
		}
	}

	@OriginalMember(owner = "client!dh", name = "gn", descriptor = "([I)V", line = 149)
	public void method20434(@OriginalArg(0) int[] arg0) {
		if (this.aClass112_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass112_Sub2_6.method23737();
			arg0[1] = this.aClass112_Sub2_6.method23738();
		}
	}

	@OriginalMember(owner = "client!dh", name = "ae", descriptor = "(B)Lclient!dr;", line = 161)
	public final Class112 method20435(@OriginalArg(0) byte arg0) {
		return this.aClass112_6;
	}

	@OriginalMember(owner = "client!dh", name = "oe", descriptor = "()Lclient!dr;", line = 161)
	public final Class112 method20436() {
		return this.aClass112_6;
	}

	@OriginalMember(owner = "client!dh", name = "ov", descriptor = "()Lclient!dr;", line = 161)
	public final Class112 method20437() {
		return this.aClass112_6;
	}

	@OriginalMember(owner = "client!dh", name = "oc", descriptor = "()Lclient!dr;", line = 161)
	public final Class112 method20438() {
		return this.aClass112_6;
	}

	@OriginalMember(owner = "client!dh", name = "ag", descriptor = "(I)Lclient!afy;", line = 165)
	public final Class112_Sub2 method20439(@OriginalArg(0) int arg0) {
		return this.aClass112_Sub2_6;
	}

	@OriginalMember(owner = "client!dh", name = "ox", descriptor = "()Lclient!afy;", line = 165)
	public final Class112_Sub2 method20440() {
		return this.aClass112_Sub2_6;
	}

	@OriginalMember(owner = "client!dh", name = "ah", descriptor = "(Ljava/awt/Canvas;III)V", line = 169)
	public final void method20441(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class451.method28949(arg0, 2068122549);
			this.method20442(arg0, this.method20547(arg0, arg1, arg2), (byte) 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "al", descriptor = "(Ljava/awt/Canvas;Lclient!afy;B)V", line = 176)
	final void method20442(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class112_Sub2 arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dh", name = "pt", descriptor = "(Ljava/awt/Canvas;Lclient!afy;)V", line = 176)
	final void method20443(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class112_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dh", name = "ac", descriptor = "(Ljava/awt/Canvas;I)V", line = 181)
	public final void method20444(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class112_Sub2 local10 = (Class112_Sub2) this.aHashtable6.get(arg0);
			local10.method23739();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "pi", descriptor = "(Ljava/awt/Canvas;)V", line = 181)
	public final void method20445(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class112_Sub2 local10 = (Class112_Sub2) this.aHashtable6.get(arg0);
			local10.method23739();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "ai", descriptor = "(Ljava/awt/Canvas;B)V", line = 190)
	public final void method20446(@OriginalArg(0) Canvas arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2901 * 714654957 <= 0 && this.aClass112_6 == this.aClass112_Sub2_6) {
			if (this.aClass112_6 != null) {
				this.aClass112_6.method23741();
			}
			if (this.anInt2901 * 714654957 < 0) {
				this.aClass112_6 = local5;
			}
			this.aClass112_Sub2_6 = local5;
			local5.method23740();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dh", name = "ph", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method20447(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2901 * 714654957 <= 0 && this.aClass112_6 == this.aClass112_Sub2_6) {
			if (this.aClass112_6 != null) {
				this.aClass112_6.method23741();
			}
			if (this.anInt2901 * 714654957 < 0) {
				this.aClass112_6 = local5;
			}
			this.aClass112_Sub2_6 = local5;
			local5.method23740();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dh", name = "pe", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method20448(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2901 * 714654957 <= 0 && this.aClass112_6 == this.aClass112_Sub2_6) {
			if (this.aClass112_6 != null) {
				this.aClass112_6.method23741();
			}
			if (this.anInt2901 * 714654957 < 0) {
				this.aClass112_6 = local5;
			}
			this.aClass112_Sub2_6 = local5;
			local5.method23740();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dh", name = "pq", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method20449(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2901 * 714654957 <= 0 && this.aClass112_6 == this.aClass112_Sub2_6) {
			if (this.aClass112_6 != null) {
				this.aClass112_6.method23741();
			}
			if (this.anInt2901 * 714654957 < 0) {
				this.aClass112_6 = local5;
			}
			this.aClass112_Sub2_6 = local5;
			local5.method23740();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dh", name = "aw", descriptor = "(Ljava/awt/Canvas;III)V", line = 200)
	public final void method20450(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method23758(arg1, arg2);
	}

	@OriginalMember(owner = "client!dh", name = "pw", descriptor = "(Ljava/awt/Canvas;II)V", line = 200)
	public final void method20451(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method23758(arg1, arg2);
	}

	@OriginalMember(owner = "client!dh", name = "pb", descriptor = "(Ljava/awt/Canvas;II)V", line = 200)
	public final void method20452(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class112_Sub2 local5 = (Class112_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method23758(arg1, arg2);
	}

	@OriginalMember(owner = "client!dh", name = "as", descriptor = "(Lclient!afq;B)V", line = 206)
	public final void method20453(@OriginalArg(0) Class112_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt2901 * 714654957 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2901 * 714654957 >= 0) {
			this.aClass112_Sub1Array6[this.anInt2901 * 714654957].method23741();
		} else {
			this.aClass112_Sub2_6.method23741();
		}
		this.aClass112_6 = this.aClass112_Sub1Array6[(this.anInt2901 += 1054095589) * 714654957] = arg0;
		arg0.method23740();
	}

	@OriginalMember(owner = "client!dh", name = "pm", descriptor = "(Lclient!afq;)V", line = 206)
	public final void method20454(@OriginalArg(0) Class112_Sub1 arg0) {
		if (this.anInt2901 * 714654957 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2901 * 714654957 >= 0) {
			this.aClass112_Sub1Array6[this.anInt2901 * 714654957].method23741();
		} else {
			this.aClass112_Sub2_6.method23741();
		}
		this.aClass112_6 = this.aClass112_Sub1Array6[(this.anInt2901 += 1054095589) * 714654957] = arg0;
		arg0.method23740();
	}

	@OriginalMember(owner = "client!dh", name = "pk", descriptor = "(Lclient!afq;)V", line = 206)
	public final void method20455(@OriginalArg(0) Class112_Sub1 arg0) {
		if (this.anInt2901 * 714654957 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2901 * 714654957 >= 0) {
			this.aClass112_Sub1Array6[this.anInt2901 * 714654957].method23741();
		} else {
			this.aClass112_Sub2_6.method23741();
		}
		this.aClass112_6 = this.aClass112_Sub1Array6[(this.anInt2901 += 1054095589) * 714654957] = arg0;
		arg0.method23740();
	}

	@OriginalMember(owner = "client!dh", name = "at", descriptor = "(Lclient!afq;I)V", line = 216)
	public final void method20456(@OriginalArg(0) Class112_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2901 * 714654957 < 0 || this.aClass112_Sub1Array6[this.anInt2901 * 714654957] != arg0) {
			throw new RuntimeException();
		}
		this.aClass112_Sub1Array6[(this.anInt2901 -= 1054095589) * 714654957 + 1] = null;
		arg0.method23741();
		if (this.anInt2901 * 714654957 >= 0) {
			this.aClass112_6 = this.aClass112_Sub1Array6[this.anInt2901 * 714654957];
			this.aClass112_Sub1Array6[this.anInt2901 * 714654957].method23740();
		} else {
			this.aClass112_6 = this.aClass112_Sub2_6;
			this.aClass112_Sub2_6.method23740();
		}
	}

	@OriginalMember(owner = "client!dh", name = "bf", descriptor = "(IIB)V", line = 248)
	void method20457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt2900 = arg0 * -1864878223;
		this.anInt2882 = arg1 * -1336162259;
		@Pc(19) float local19 = (float) this.aClass112_6.method23737() / (float) this.aClass112_6.method23738();
		@Pc(31) float local31 = (float) (this.anInt2900 * 106932625) / (float) (this.anInt2882 * -28194907);
		if (local19 < local31) {
			this.anInt2904 = (int) (local19 * (float) (this.anInt2882 * -28194907)) * 1844728987;
			this.anInt2898 = this.anInt2882 * 359876195;
		} else {
			this.anInt2904 = this.anInt2900 * -1698480437;
			this.anInt2898 = (int) ((float) (this.anInt2900 * 106932625) / local19) * -378423449;
		}
		this.aFloat199 = (float) (this.anInt2904 * 406942099) / (float) this.aClass112_6.method23737();
		this.anInt2899 = (this.anInt2900 * 106932625 - this.anInt2904 * 406942099) / 2 * 156842971;
		this.anInt2903 = (this.anInt2882 * -28194907 - -88050601 * this.anInt2898) / 2 * -1535741477;
	}

	@OriginalMember(owner = "client!dh", name = "pz", descriptor = "(II)V", line = 248)
	void method20458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2900 = arg0 * -1864878223;
		this.anInt2882 = arg1 * -1336162259;
		@Pc(19) float local19 = (float) this.aClass112_6.method23737() / (float) this.aClass112_6.method23738();
		@Pc(31) float local31 = (float) (this.anInt2900 * 106932625) / (float) (this.anInt2882 * -28194907);
		if (local19 < local31) {
			this.anInt2904 = (int) (local19 * (float) (this.anInt2882 * -28194907)) * 1844728987;
			this.anInt2898 = this.anInt2882 * 359876195;
		} else {
			this.anInt2904 = this.anInt2900 * -1698480437;
			this.anInt2898 = (int) ((float) (this.anInt2900 * 106932625) / local19) * -378423449;
		}
		this.aFloat199 = (float) (this.anInt2904 * 406942099) / (float) this.aClass112_6.method23737();
		this.anInt2899 = (this.anInt2900 * 106932625 - this.anInt2904 * 406942099) / 2 * 156842971;
		this.anInt2903 = (this.anInt2882 * -28194907 - -88050601 * this.anInt2898) / 2 * -1535741477;
	}

	@OriginalMember(owner = "client!dh", name = "pa", descriptor = "(II)V", line = 248)
	void method20459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2900 = arg0 * -1864878223;
		this.anInt2882 = arg1 * -1336162259;
		@Pc(19) float local19 = (float) this.aClass112_6.method23737() / (float) this.aClass112_6.method23738();
		@Pc(31) float local31 = (float) (this.anInt2900 * 106932625) / (float) (this.anInt2882 * -28194907);
		if (local19 < local31) {
			this.anInt2904 = (int) (local19 * (float) (this.anInt2882 * -28194907)) * 1844728987;
			this.anInt2898 = this.anInt2882 * 359876195;
		} else {
			this.anInt2904 = this.anInt2900 * -1698480437;
			this.anInt2898 = (int) ((float) (this.anInt2900 * 106932625) / local19) * -378423449;
		}
		this.aFloat199 = (float) (this.anInt2904 * 406942099) / (float) this.aClass112_6.method23737();
		this.anInt2899 = (this.anInt2900 * 106932625 - this.anInt2904 * 406942099) / 2 * 156842971;
		this.anInt2903 = (this.anInt2882 * -28194907 - -88050601 * this.anInt2898) / 2 * -1535741477;
	}

	@OriginalMember(owner = "client!dh", name = "pd", descriptor = "(II)V", line = 248)
	void method20460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2900 = arg0 * -1864878223;
		this.anInt2882 = arg1 * -1336162259;
		@Pc(19) float local19 = (float) this.aClass112_6.method23737() / (float) this.aClass112_6.method23738();
		@Pc(31) float local31 = (float) (this.anInt2900 * 106932625) / (float) (this.anInt2882 * -28194907);
		if (local19 < local31) {
			this.anInt2904 = (int) (local19 * (float) (this.anInt2882 * -28194907)) * 1844728987;
			this.anInt2898 = this.anInt2882 * 359876195;
		} else {
			this.anInt2904 = this.anInt2900 * -1698480437;
			this.anInt2898 = (int) ((float) (this.anInt2900 * 106932625) / local19) * -378423449;
		}
		this.aFloat199 = (float) (this.anInt2904 * 406942099) / (float) this.aClass112_6.method23737();
		this.anInt2899 = (this.anInt2900 * 106932625 - this.anInt2904 * 406942099) / 2 * 156842971;
		this.anInt2903 = (this.anInt2882 * -28194907 - -88050601 * this.anInt2898) / 2 * -1535741477;
	}

	@OriginalMember(owner = "client!dh", name = "bt", descriptor = "(Z)V", line = 273)
	public void method20461(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "pn", descriptor = "(Z)V", line = 273)
	public void method20462(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "px", descriptor = "(Z)V", line = 273)
	public void method20463(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "po", descriptor = "(IIIII)V", line = 278)
	public final void method20464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20573(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "bb", descriptor = "(IIIIII)V", line = 278)
	public final void method20465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20573(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "ps", descriptor = "(IIIII)V", line = 278)
	public final void method20466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20573(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pl", descriptor = "(IIIII)V", line = 278)
	public final void method20467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20573(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pg", descriptor = "(IIIII)V", line = 282)
	public final void method20468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20721(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "be", descriptor = "(IIIIIB)V", line = 282)
	public final void method20469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		this.method20721(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pr", descriptor = "(IIIII)V", line = 282)
	public final void method20470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20721(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "py", descriptor = "(IIIII)V", line = 282)
	public final void method20471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20721(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "by", descriptor = "(IIIII)V", line = 286)
	public final void method20472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20575(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pv", descriptor = "(IIII)V", line = 286)
	public final void method20473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20575(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "bu", descriptor = "(IIIIB)V", line = 290)
	public final void method20474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.method20790(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pj", descriptor = "(IIII)V", line = 290)
	public final void method20475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20790(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "bw", descriptor = "(IIIII)V", line = 294)
	public final void method20476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20545(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pp", descriptor = "(IIII)V", line = 294)
	public final void method20477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20545(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pf", descriptor = "(IIII)V", line = 294)
	public final void method20478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20545(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dh", name = "bo", descriptor = "(IIIIII)V", line = 298)
	public final void method20479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20578(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pu", descriptor = "(IIIII)V", line = 298)
	public final void method20480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20578(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "pc", descriptor = "(IIIII)V", line = 298)
	public final void method20481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20578(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dh", name = "ci", descriptor = "(IILclient!ou;Lclient!oj;I)Z", line = 315)
	public boolean method20482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) int arg4) {
		return this.method20538(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!dh", name = "qx", descriptor = "(IILclient!ou;Lclient!oj;)Z", line = 315)
	public boolean method20483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) Class463 arg3) {
		return this.method20538(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!dh", name = "qp", descriptor = "(IILclient!ou;Lclient!oj;)Z", line = 315)
	public boolean method20484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) Class463 arg3) {
		return this.method20538(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!dh", name = "cx", descriptor = "(IIZI)Lclient!cm;", line = 324)
	public Class100 method20485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return this.method20587(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!dh", name = "qt", descriptor = "(IIZ)Lclient!cm;", line = 324)
	public Class100 method20486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method20587(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!dh", name = "cf", descriptor = "([IIIIII)Lclient!cm;", line = 331)
	public Class100 method20487(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method20580(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!dh", name = "qz", descriptor = "([IIIII)Lclient!cm;", line = 331)
	public Class100 method20488(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method20580(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!dh", name = "cm", descriptor = "()V", line = 336)
	public void method20489() {
	}

	@OriginalMember(owner = "client!dh", name = "qg", descriptor = "()V", line = 336)
	public void method20490() {
	}

	@OriginalMember(owner = "client!dh", name = "qe", descriptor = "()V", line = 336)
	public void method20491() {
	}

	@OriginalMember(owner = "client!dh", name = "cq", descriptor = "()V", line = 337)
	public void method20492() {
	}

	@OriginalMember(owner = "client!dh", name = "ql", descriptor = "()V", line = 337)
	public void method20493() {
	}

	@OriginalMember(owner = "client!dh", name = "qj", descriptor = "()V", line = 337)
	public void method20494() {
	}

	@OriginalMember(owner = "client!dh", name = "qr", descriptor = "()V", line = 337)
	public void method20495() {
	}

	@OriginalMember(owner = "client!dh", name = "qy", descriptor = "()V", line = 338)
	public void method20496() {
	}

	@OriginalMember(owner = "client!dh", name = "ch", descriptor = "()V", line = 338)
	public void method20497() {
	}

	@OriginalMember(owner = "client!dh", name = "qc", descriptor = "()V", line = 338)
	public void method20498() {
	}

	@OriginalMember(owner = "client!dh", name = "qd", descriptor = "()V", line = 338)
	public void method20499() {
	}

	@OriginalMember(owner = "client!dh", name = "qi", descriptor = "()V", line = 338)
	public void method20500() {
	}

	@OriginalMember(owner = "client!dh", name = "qw", descriptor = "()V", line = 338)
	public void method20501() {
	}

	@OriginalMember(owner = "client!dh", name = "qq", descriptor = "()Z", line = 351)
	public boolean method20502() {
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "da", descriptor = "(I)Z", line = 351)
	public boolean method20503(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "qm", descriptor = "()Z", line = 351)
	public boolean method20504() {
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "qo", descriptor = "()Z", line = 351)
	public boolean method20505() {
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "kn", descriptor = "(IIIIIF)Lclient!akf;", line = 367)
	public Class93_Sub16 method20506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class93_Sub16(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dh", name = "dw", descriptor = "(IIIIIF)Lclient!akf;", line = 367)
	public Class93_Sub16 method20507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class93_Sub16(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dh", name = "kj", descriptor = "(IIIIIF)Lclient!akf;", line = 367)
	public Class93_Sub16 method20508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class93_Sub16(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dh", name = "ee", descriptor = "(FFFI)V", line = 387)
	public void method20509(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		this.method20623(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dh", name = "qs", descriptor = "(FFF)V", line = 387)
	public void method20510(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20623(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dh", name = "qf", descriptor = "(FFF)V", line = 387)
	public void method20511(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20623(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dh", name = "qu", descriptor = "(FFF)V", line = 387)
	public void method20512(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20623(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dh", name = "qh", descriptor = "(IIII[III)[I", line = 398)
	public int[] method20513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[arg2 * local11 + local25] = local4[local23 + local25];
				}
			} else {
				local23 = local11 * arg6 + arg5;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local11 * arg2 + local25] = arg4[local23 + local25];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local52 + local11 * arg2] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dh", name = "ec", descriptor = "(IIII[IIII)[I", line = 398)
	public int[] method20514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[arg2 * local11 + local25] = local4[local23 + local25];
				}
			} else {
				local23 = local11 * arg6 + arg5;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local11 * arg2 + local25] = arg4[local23 + local25];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local52 + local11 * arg2] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dh", name = "qv", descriptor = "(IIII[III)[I", line = 398)
	public int[] method20515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[arg2 * local11 + local25] = local4[local23 + local25];
				}
			} else {
				local23 = local11 * arg6 + arg5;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local11 * arg2 + local25] = arg4[local23 + local25];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local52 + local11 * arg2] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dh", name = "qa", descriptor = "(IIII[III)[I", line = 398)
	public int[] method20516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[arg2 * local11 + local25] = local4[local23 + local25];
				}
			} else {
				local23 = local11 * arg6 + arg5;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[local11 * arg2 + local25] = arg4[local23 + local25];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local52 + local11 * arg2] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dh", name = "ek", descriptor = "(IIII[FIIII)[F", line = 416)
	public float[] method20517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float[] local6 = new float[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26;
			@Pc(28) int local28;
			@Pc(33) int local33;
			if (local14 < arg1) {
				local26 = arg6 * local14 + arg5;
				for (local28 = 0; local28 < arg0; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + local28 * arg7 + arg2 * local14 * arg7] = arg4[local26 + arg7 * local28 + local33];
					}
				}
				@Pc(65) float[] local65 = new float[arg7];
				for (local33 = 0; local33 < arg7; local33++) {
					local65[local33] = arg4[local26 + arg7 * (arg0 - 1) + local33];
				}
				for (local33 = arg0; local33 < arg2; local33++) {
					for (@Pc(93) int local93 = 0; local93 < arg7; local93++) {
						local6[local93 + local33 * arg7 + arg2 * local14 * arg7] = local65[local93];
					}
				}
			} else {
				local26 = arg7 * arg2 * (arg1 - 1);
				for (local28 = 0; local28 < arg2; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + arg7 * local28 + arg7 * local14 * arg2] = local6[local33 + arg7 * local28 + local26];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "qk", descriptor = "(IIII[FIII)[F", line = 416)
	public float[] method20518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26;
			@Pc(28) int local28;
			@Pc(33) int local33;
			if (local14 < arg1) {
				local26 = arg6 * local14 + arg5;
				for (local28 = 0; local28 < arg0; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + local28 * arg7 + arg2 * local14 * arg7] = arg4[local26 + arg7 * local28 + local33];
					}
				}
				@Pc(65) float[] local65 = new float[arg7];
				for (local33 = 0; local33 < arg7; local33++) {
					local65[local33] = arg4[local26 + arg7 * (arg0 - 1) + local33];
				}
				for (local33 = arg0; local33 < arg2; local33++) {
					for (@Pc(93) int local93 = 0; local93 < arg7; local93++) {
						local6[local93 + local33 * arg7 + arg2 * local14 * arg7] = local65[local93];
					}
				}
			} else {
				local26 = arg7 * arg2 * (arg1 - 1);
				for (local28 = 0; local28 < arg2; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + arg7 * local28 + arg7 * local14 * arg2] = local6[local33 + arg7 * local28 + local26];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "qb", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg7 * arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg6 * local15 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + arg7 * local29] = arg4[arg7 * local29 + local27 + local34];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * local15 * arg2 + arg7 * local34] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local29 + arg7 * local15 * arg2] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "em", descriptor = "(IIII[BIIII)[B", line = 435)
	public byte[] method20520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) byte[] local6 = new byte[arg7 * arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg6 * local15 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + arg7 * local29] = arg4[arg7 * local29 + local27 + local34];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * local15 * arg2 + arg7 * local34] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local29 + arg7 * local15 * arg2] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "rf", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg7 * arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg6 * local15 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + arg7 * local29] = arg4[arg7 * local29 + local27 + local34];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * local15 * arg2 + arg7 * local34] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local29 + arg7 * local15 * arg2] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "qn", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg7 * arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg6 * local15 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + arg7 * local29] = arg4[arg7 * local29 + local27 + local34];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * local15 * arg2 + arg7 * local34] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local29 + arg7 * local15 * arg2] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "rw", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg7 * arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = arg6 * local15 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + arg7 * local29] = arg4[arg7 * local29 + local27 + local34];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local94 + arg7 * local15 * arg2 + arg7 * local34] = local66[local94];
					}
				}
			} else {
				local27 = arg7 * arg2 * (arg1 - 1);
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local29 + arg7 * local15 * arg2] = local6[arg7 * local29 + local27 + local34];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dh", name = "fu", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 5871)
	static final void method20524(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean683 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!dh", name = "azv", descriptor = "(Lclient!yf;B)V", line = 14173)
	static final void method20525(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15655((byte) -93) ? 1 : 0;
	}

	@OriginalMember(owner = "client!dh", name = "bfd", descriptor = "(Lclient!yf;I)V", line = 15153)
	static final void method20526(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dh", name = "df", descriptor = "()I")
	public abstract int method20527();

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "(II)V")
	abstract void method20528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "()V")
	public abstract void method20529();

	@OriginalMember(owner = "client!dh", name = "lu", descriptor = "(I)V")
	public abstract void method20530(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	public abstract void method20531(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ar", descriptor = "(II)Lclient!dw;")
	public abstract Interface19 method20532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "()Z")
	public abstract boolean method20533();

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "()Z")
	public abstract boolean method20534();

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "()Z")
	public abstract boolean method20535();

	@OriginalMember(owner = "client!dh", name = "bl", descriptor = "()V")
	public abstract void method20536();

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "()Z")
	public abstract boolean method20537();

	@OriginalMember(owner = "client!dh", name = "cn", descriptor = "(IIIILclient!ou;Lclient!oj;)Z")
	abstract boolean method20538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()Z")
	public abstract boolean method20539();

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "()Z")
	public abstract boolean method20540();

	@OriginalMember(owner = "client!dh", name = "mu", descriptor = "()V")
	public abstract void method20541();

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "()Ljava/lang/String;")
	public abstract String method20542();

	@OriginalMember(owner = "client!dh", name = "gv", descriptor = "()Z")
	public abstract boolean method20543();

	@OriginalMember(owner = "client!dh", name = "lw", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	public abstract Class107 method20544(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3);

	@OriginalMember(owner = "client!dh", name = "bp", descriptor = "(IIIII)V")
	abstract void method20545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "()Z")
	public abstract boolean method20546();

	@OriginalMember(owner = "client!dh", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;")
	abstract Class112_Sub2 method20547(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "am", descriptor = "()Lclient!afq;")
	public abstract Class112_Sub1 method20548();

	@OriginalMember(owner = "client!dh", name = "au", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;")
	public abstract Interface18 method20549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "jw", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class100 method20550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dh", name = "js", descriptor = "(II[I[I)Lclient!ch;")
	public abstract Class96 method20551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "aq", descriptor = "(IIII)[I")
	public abstract int[] method20552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ax", descriptor = "()V")
	public abstract void method20553();

	@OriginalMember(owner = "client!dh", name = "dx", descriptor = "()Z")
	public abstract boolean method20554();

	@OriginalMember(owner = "client!dh", name = "aj", descriptor = "()Z")
	public abstract boolean method20555();

	@OriginalMember(owner = "client!dh", name = "nj", descriptor = "()V")
	public abstract void method20556();

	@OriginalMember(owner = "client!dh", name = "me", descriptor = "()Z")
	public abstract boolean method20557();

	@OriginalMember(owner = "client!dh", name = "az", descriptor = "()V")
	public abstract void method20558();

	@OriginalMember(owner = "client!dh", name = "iw", descriptor = "(IIIII)V")
	abstract void method20559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "af", descriptor = "(II)J")
	public abstract long method20560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "ak", descriptor = "(J)V")
	public abstract void method20561(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dh", name = "an", descriptor = "(II[I[I)V")
	public abstract void method20562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "bn", descriptor = "(IIII)V")
	public abstract void method20563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "hh", descriptor = "()V")
	public abstract void method20564();

	@OriginalMember(owner = "client!dh", name = "aa", descriptor = "(III)V")
	public abstract void method20565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "bh", descriptor = "(IIII)V")
	public abstract void method20566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ow", descriptor = "(IIII)V")
	public abstract void method20567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "bc", descriptor = "()V")
	public abstract void method20568();

	@OriginalMember(owner = "client!dh", name = "bi", descriptor = "(IIII)V")
	public abstract void method20569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "je", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class100 method20570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dh", name = "bq", descriptor = "([I)V")
	public abstract void method20571(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "dy", descriptor = "(IIII)V")
	public abstract void method20572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "bz", descriptor = "(IIIIII)V")
	public abstract void method20573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "lp", descriptor = "()Lclient!pq;")
	public abstract Class489 method20574();

	@OriginalMember(owner = "client!dh", name = "bg", descriptor = "(IIIII)V")
	abstract void method20575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "bs", descriptor = "(IIIIIILclient!ch;II)V")
	public abstract void method20576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dh", name = "hk", descriptor = "(II)J")
	public abstract long method20577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "bj", descriptor = "(IIIIII)V")
	public abstract void method20578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "cl", descriptor = "(IIIIIIIII)V")
	public abstract void method20579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dh", name = "ct", descriptor = "([IIIIIZ)Lclient!cm;")
	public abstract Class100 method20580(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!dh", name = "ce", descriptor = "(IIIIIII)V")
	public abstract void method20581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "nu", descriptor = "(IIIIIIIII)V")
	public abstract void method20582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dh", name = "cv", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V")
	public abstract void method20583(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2);

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "()Z")
	public abstract boolean method20584();

	@OriginalMember(owner = "client!dh", name = "ca", descriptor = "(Lclient!akz;)V")
	public abstract void method20585(@OriginalArg(0) Class93_Sub35 arg0);

	@OriginalMember(owner = "client!dh", name = "ao", descriptor = "()Z")
	public abstract boolean method20586();

	@OriginalMember(owner = "client!dh", name = "cw", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class100 method20587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dh", name = "dt", descriptor = "(Lclient!dm;)V")
	public abstract void method20588(@OriginalArg(0) Class229 arg0);

	@OriginalMember(owner = "client!dh", name = "co", descriptor = "(Lclient!de;Z)Lclient!cm;")
	public abstract Class100 method20589(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dh", name = "mk", descriptor = "([I)Lclient!cj;")
	public abstract Class102 method20590(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "cb", descriptor = "(II[I[I)Lclient!ch;")
	public abstract Class96 method20591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "cs", descriptor = "(ILclient!ch;II)V")
	public abstract void method20592(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "cy", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	public abstract Class106 method20593(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "cc", descriptor = "()Lclient!pq;")
	public abstract Class489 method20594();

	@OriginalMember(owner = "client!dh", name = "cz", descriptor = "()Lclient!ou;")
	public abstract Class470 method20595();

	@OriginalMember(owner = "client!dh", name = "jz", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	public abstract Class106 method20596(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "cj", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	public abstract Class109 method20597(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "ot", descriptor = "(IIII)V")
	public abstract void method20598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "dd", descriptor = "(II)I")
	public abstract int method20599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "dr", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class99 method20600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "do", descriptor = "(Lclient!ou;)V")
	public abstract void method20601(@OriginalArg(0) Class470 arg0);

	@OriginalMember(owner = "client!dh", name = "dz", descriptor = "()Lclient!ou;")
	public abstract Class470 method20602();

	@OriginalMember(owner = "client!dh", name = "dv", descriptor = "(Z)V")
	public abstract void method20603(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "dm", descriptor = "(Lclient!pq;)V")
	public abstract void method20604(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!dh", name = "cp", descriptor = "(I)Lclient!akz;")
	public abstract Class93_Sub35 method20605(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "dc", descriptor = "(F)V")
	public abstract void method20606(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dh", name = "di", descriptor = "(IFFFFF)V")
	public abstract void method20607(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "dk", descriptor = "(I)V")
	public abstract void method20608(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "jr", descriptor = "(II[I[I)Lclient!ch;")
	public abstract Class96 method20609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "oo", descriptor = "(ILclient!dy;)V")
	public abstract void method20610(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "jb", descriptor = "([IIIIIZ)Lclient!cm;")
	public abstract Class100 method20611(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!dh", name = "du", descriptor = "(I)Lclient!dz;")
	public abstract Class107 method20612(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "nc", descriptor = "(I)Lclient!akz;")
	public abstract Class93_Sub35 method20613(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "db", descriptor = "(II)V")
	public abstract void method20614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "dh", descriptor = "()Z")
	public abstract boolean method20615();

	@OriginalMember(owner = "client!dh", name = "gg", descriptor = "()Z")
	public abstract boolean method20616();

	@OriginalMember(owner = "client!dh", name = "dg", descriptor = "(FFFFF)V")
	public abstract void method20617(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dh", name = "de", descriptor = "([I)Lclient!cj;")
	public abstract Class102 method20618(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "dj", descriptor = "()Z")
	public abstract boolean method20619();

	@OriginalMember(owner = "client!dh", name = "eo", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V")
	public abstract void method20620(@OriginalArg(0) Class102 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class102 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()Z")
	public abstract boolean method20621();

	@OriginalMember(owner = "client!dh", name = "ed", descriptor = "()Z")
	public abstract boolean method20622();

	@OriginalMember(owner = "client!dh", name = "es", descriptor = "(FFFFFF)V")
	abstract void method20623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "ei", descriptor = "(ILclient!dy;)V")
	public abstract void method20624(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "el", descriptor = "(ILclient!dy;)V")
	public abstract void method20625(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "ej", descriptor = "()V")
	public abstract void method20626();

	@OriginalMember(owner = "client!dh", name = "if", descriptor = "(IIIII)V")
	abstract void method20627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "eh", descriptor = "(Z)V")
	public abstract void method20628(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "eq", descriptor = "()Lclient!cz;")
	public abstract Class219 method20629();

	@OriginalMember(owner = "client!dh", name = "ni", descriptor = "(FFF[F)V")
	public abstract void method20630(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "ef", descriptor = "()V")
	public abstract void method20631();

	@OriginalMember(owner = "client!dh", name = "et", descriptor = "()V")
	public abstract void method20632();

	@OriginalMember(owner = "client!dh", name = "ea", descriptor = "()V")
	abstract void method20633();

	@OriginalMember(owner = "client!dh", name = "ew", descriptor = "()V")
	abstract void method20634();

	@OriginalMember(owner = "client!dh", name = "fe", descriptor = "()[I")
	public abstract int[] method20635();

	@OriginalMember(owner = "client!dh", name = "en", descriptor = "(I)V")
	public abstract void method20636(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "bk", descriptor = "()V")
	public abstract void method20637();

	@OriginalMember(owner = "client!dh", name = "oi", descriptor = "(IIII)V")
	public abstract void method20638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "()Z")
	public abstract boolean method20639();

	@OriginalMember(owner = "client!dh", name = "fu", descriptor = "()Z")
	public abstract boolean method20640();

	@OriginalMember(owner = "client!dh", name = "fz", descriptor = "()Z")
	public abstract boolean method20641();

	@OriginalMember(owner = "client!dh", name = "fj", descriptor = "()Z")
	public abstract boolean method20642();

	@OriginalMember(owner = "client!dh", name = "fd", descriptor = "()Z")
	public abstract boolean method20643();

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "()Lclient!cz;")
	public abstract Class219 method20644();

	@OriginalMember(owner = "client!dh", name = "eu", descriptor = "()V")
	public abstract void method20645();

	@OriginalMember(owner = "client!dh", name = "ey", descriptor = "()Z")
	public abstract boolean method20646();

	@OriginalMember(owner = "client!dh", name = "mo", descriptor = "()Z")
	public abstract boolean method20647();

	@OriginalMember(owner = "client!dh", name = "oq", descriptor = "(IIII)V")
	public abstract void method20648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "fc", descriptor = "()Z")
	public abstract boolean method20649();

	@OriginalMember(owner = "client!dh", name = "fw", descriptor = "()Z")
	public abstract boolean method20650();

	@OriginalMember(owner = "client!dh", name = "fa", descriptor = "()Z")
	public abstract boolean method20651();

	@OriginalMember(owner = "client!dh", name = "iu", descriptor = "([I)V")
	public abstract void method20652(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "fq", descriptor = "()Z")
	public abstract boolean method20653();

	@OriginalMember(owner = "client!dh", name = "gp", descriptor = "()V")
	public abstract void method20654();

	@OriginalMember(owner = "client!dh", name = "fl", descriptor = "()Ljava/lang/String;")
	public abstract String method20655();

	@OriginalMember(owner = "client!dh", name = "kq", descriptor = "(II)I")
	public abstract int method20656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "fo", descriptor = "()Ljava/lang/String;")
	public abstract String method20657();

	@OriginalMember(owner = "client!dh", name = "ez", descriptor = "(II)V")
	abstract void method20658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4;

	@OriginalMember(owner = "client!dh", name = "mt", descriptor = "()V")
	public abstract void method20659();

	@OriginalMember(owner = "client!dh", name = "fk", descriptor = "(Z)V")
	public abstract void method20660(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "fh", descriptor = "(Z)V")
	public abstract void method20661(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "fr", descriptor = "(Z)V")
	public abstract void method20662(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "gu", descriptor = "(Z)V")
	public abstract void method20663(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "gq", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;")
	abstract Class112_Sub2 method20664(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "gl", descriptor = "(IIII)[I")
	public abstract int[] method20665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "go", descriptor = "()V")
	public abstract void method20666();

	@OriginalMember(owner = "client!dh", name = "jx", descriptor = "(I)V")
	public abstract void method20667(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ja", descriptor = "(ILclient!ch;II)V")
	public abstract void method20668(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "gy", descriptor = "()V")
	public abstract void method20669();

	@OriginalMember(owner = "client!dh", name = "gx", descriptor = "()Z")
	public abstract boolean method20670();

	@OriginalMember(owner = "client!dh", name = "ge", descriptor = "()Z")
	public abstract boolean method20671();

	@OriginalMember(owner = "client!dh", name = "ay", descriptor = "()Z")
	public abstract boolean method20672();

	@OriginalMember(owner = "client!dh", name = "gr", descriptor = "()Z")
	public abstract boolean method20673();

	@OriginalMember(owner = "client!dh", name = "ne", descriptor = "(ILclient!dy;)V")
	public abstract void method20674(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "gt", descriptor = "()Z")
	public abstract boolean method20675();

	@OriginalMember(owner = "client!dh", name = "gh", descriptor = "()Z")
	public abstract boolean method20676();

	@OriginalMember(owner = "client!dh", name = "gm", descriptor = "()Z")
	public abstract boolean method20677();

	@OriginalMember(owner = "client!dh", name = "nm", descriptor = "(ILclient!dy;)V")
	public abstract void method20678(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "kd", descriptor = "()I")
	public abstract int method20679();

	@OriginalMember(owner = "client!dh", name = "il", descriptor = "(IIIII)V")
	abstract void method20680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "gd", descriptor = "(III)V")
	public abstract void method20681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "cr", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class100 method20682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dh", name = "gb", descriptor = "()V")
	public abstract void method20683();

	@OriginalMember(owner = "client!dh", name = "gi", descriptor = "()V")
	public abstract void method20684();

	@OriginalMember(owner = "client!dh", name = "hm", descriptor = "()V")
	public abstract void method20685();

	@OriginalMember(owner = "client!dh", name = "nr", descriptor = "(IIIIIIIII)V")
	public abstract void method20686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dh", name = "ks", descriptor = "()Lclient!pq;")
	public abstract Class489 method20687();

	@OriginalMember(owner = "client!dh", name = "hu", descriptor = "(II)J")
	public abstract long method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "hb", descriptor = "(J)V")
	public abstract void method20689(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dh", name = "hg", descriptor = "(J)V")
	public abstract void method20690(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dh", name = "hd", descriptor = "(J)V")
	public abstract void method20691(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dh", name = "hx", descriptor = "(II[I[I)V")
	public abstract void method20692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "hq", descriptor = "(II[I[I)V")
	public abstract void method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "bx", descriptor = "([I)V")
	public abstract void method20694(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "hr", descriptor = "()V")
	public abstract void method20695();

	@OriginalMember(owner = "client!dh", name = "hs", descriptor = "()V")
	public abstract void method20696();

	@OriginalMember(owner = "client!dh", name = "nb", descriptor = "(FFF[F)V")
	public abstract void method20697(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "hp", descriptor = "(Z)V")
	public abstract void method20698(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "hy", descriptor = "(Z)V")
	public abstract void method20699(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dh", name = "he", descriptor = "()V")
	public abstract void method20700();

	@OriginalMember(owner = "client!dh", name = "ki", descriptor = "()Lclient!pq;")
	public abstract Class489 method20701();

	@OriginalMember(owner = "client!dh", name = "hi", descriptor = "()V")
	public abstract void method20702();

	@OriginalMember(owner = "client!dh", name = "hw", descriptor = "()V")
	public abstract void method20703();

	@OriginalMember(owner = "client!dh", name = "ht", descriptor = "(IIII)V")
	public abstract void method20704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "hc", descriptor = "(IIII)V")
	public abstract void method20705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ho", descriptor = "(IIII)V")
	public abstract void method20706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "bd", descriptor = "(FF)V")
	public abstract void method20707(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!dh", name = "hj", descriptor = "([I)V")
	public abstract void method20708(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "hz", descriptor = "([I)V")
	public abstract void method20709(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "ij", descriptor = "(FF)V")
	public abstract void method20710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!dh", name = "iq", descriptor = "()V")
	public abstract void method20711();

	@OriginalMember(owner = "client!dh", name = "ft", descriptor = "()Z")
	public abstract boolean method20712();

	@OriginalMember(owner = "client!dh", name = "iv", descriptor = "()V")
	public abstract void method20713();

	@OriginalMember(owner = "client!dh", name = "ie", descriptor = "(IIII)V")
	public abstract void method20714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "cu", descriptor = "(IIIIII)I")
	public abstract int method20715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "in", descriptor = "([I)V")
	public abstract void method20716(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "ir", descriptor = "(II)V")
	public abstract void method20717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "it", descriptor = "(IIIIII)V")
	public abstract void method20718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "gw", descriptor = "()I")
	public abstract int method20719();

	@OriginalMember(owner = "client!dh", name = "is", descriptor = "(IIIII)V")
	abstract void method20720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "bv", descriptor = "(IIIIII)V")
	public abstract void method20721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "dq", descriptor = "()Lclient!pq;")
	public abstract Class489 method20722();

	@OriginalMember(owner = "client!dh", name = "ap", descriptor = "(III)Lclient!dw;")
	public abstract Interface19 method20723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "ip", descriptor = "(IIIII)V")
	abstract void method20724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "id", descriptor = "(IIIII)V")
	abstract void method20725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "io", descriptor = "()V")
	public abstract void method20726();

	@OriginalMember(owner = "client!dh", name = "av", descriptor = "()Z")
	public abstract boolean method20727();

	@OriginalMember(owner = "client!dh", name = "nx", descriptor = "(FFF[F)V")
	public abstract void method20728(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "iy", descriptor = "(IIIIII)V")
	public abstract void method20729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "ii", descriptor = "(IIIIII)V")
	public abstract void method20730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "iz", descriptor = "(IIIIII)V")
	public abstract void method20731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "im", descriptor = "(IIIIIILclient!ch;II)V")
	public abstract void method20732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dh", name = "ic", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method20733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!dh", name = "jd", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method20734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "()V")
	abstract void method20735();

	@OriginalMember(owner = "client!dh", name = "ju", descriptor = "(IIIILclient!ou;Lclient!oj;)Z")
	abstract boolean method20736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5);

	@OriginalMember(owner = "client!dh", name = "fx", descriptor = "()Z")
	public abstract boolean method20737();

	@OriginalMember(owner = "client!dh", name = "jl", descriptor = "(Lclient!akz;)V")
	public abstract void method20738(@OriginalArg(0) Class93_Sub35 arg0);

	@OriginalMember(owner = "client!dh", name = "jn", descriptor = "(IIZZ)Lclient!cm;")
	public abstract Class100 method20739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dh", name = "jp", descriptor = "(I)V")
	public abstract void method20740(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "jm", descriptor = "(IIIIZ)Lclient!cm;")
	public abstract Class100 method20741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dh", name = "ix", descriptor = "(IIIIII)V")
	public abstract void method20742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "lr", descriptor = "(IFFFFF)V")
	public abstract void method20743(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "nk", descriptor = "(II)Lclient!dw;")
	public abstract Interface19 method20744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "ji", descriptor = "(II[I[I)Lclient!ch;")
	public abstract Class96 method20745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dh", name = "jt", descriptor = "(ILclient!ch;II)V")
	public abstract void method20746(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "jq", descriptor = "(ILclient!ch;II)V")
	public abstract void method20747(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "jv", descriptor = "(ILclient!ch;II)V")
	public abstract void method20748(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "fn", descriptor = "()Z")
	public abstract boolean method20749();

	@OriginalMember(owner = "client!dh", name = "jj", descriptor = "(ILclient!ch;II)V")
	public abstract void method20750(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ff", descriptor = "()Z")
	public abstract boolean method20751();

	@OriginalMember(owner = "client!dh", name = "gz", descriptor = "(III)V")
	public abstract void method20752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "jc", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	public abstract Class106 method20753(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "jg", descriptor = "(I)V")
	public abstract void method20754(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ik", descriptor = "(IIIIIILclient!ch;II)V")
	public abstract void method20755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dh", name = "gk", descriptor = "()V")
	public abstract void method20756();

	@OriginalMember(owner = "client!dh", name = "lc", descriptor = "()Lclient!pq;")
	public abstract Class489 method20757();

	@OriginalMember(owner = "client!dh", name = "jk", descriptor = "(I)V")
	public abstract void method20758(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "cd", descriptor = "(II)I")
	public abstract int method20759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "fp", descriptor = "()Z")
	public abstract boolean method20760();

	@OriginalMember(owner = "client!dh", name = "ke", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	public abstract Class109 method20761(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "lo", descriptor = "(IFFFFF)V")
	public abstract void method20762(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "ku", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class99 method20763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "ko", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class99 method20764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "kf", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class99 method20765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "hv", descriptor = "([I)V")
	public abstract void method20766(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "kh", descriptor = "()Lclient!ou;")
	public abstract Class470 method20767();

	@OriginalMember(owner = "client!dh", name = "ka", descriptor = "()Lclient!ou;")
	public abstract Class470 method20768();

	@OriginalMember(owner = "client!dh", name = "kl", descriptor = "()Lclient!ou;")
	public abstract Class470 method20769();

	@OriginalMember(owner = "client!dh", name = "kb", descriptor = "()I")
	public abstract int method20770();

	@OriginalMember(owner = "client!dh", name = "kr", descriptor = "()I")
	public abstract int method20771();

	@OriginalMember(owner = "client!dh", name = "kc", descriptor = "()I")
	public abstract int method20772();

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "()[I")
	public abstract int[] method20773();

	@OriginalMember(owner = "client!dh", name = "kp", descriptor = "(I[Lclient!akf;)V")
	public abstract void method20774(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1);

	@OriginalMember(owner = "client!dh", name = "km", descriptor = "(Lclient!dm;)V")
	public abstract void method20775(@OriginalArg(0) Class229 arg0);

	@OriginalMember(owner = "client!dh", name = "ky", descriptor = "(Lclient!dm;)V")
	public abstract void method20776(@OriginalArg(0) Class229 arg0);

	@OriginalMember(owner = "client!dh", name = "kk", descriptor = "(Lclient!ou;)V")
	public abstract void method20777(@OriginalArg(0) Class470 arg0);

	@OriginalMember(owner = "client!dh", name = "kv", descriptor = "(Lclient!ou;)V")
	public abstract void method20778(@OriginalArg(0) Class470 arg0);

	@OriginalMember(owner = "client!dh", name = "li", descriptor = "()Lclient!ou;")
	public abstract Class470 method20779();

	@OriginalMember(owner = "client!dh", name = "lv", descriptor = "(Lclient!pq;)V")
	public abstract void method20780(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!dh", name = "la", descriptor = "()Lclient!pq;")
	public abstract Class489 method20781();

	@OriginalMember(owner = "client!dh", name = "ny", descriptor = "(ILclient!dy;)V")
	public abstract void method20782(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "lf", descriptor = "()Lclient!pq;")
	public abstract Class489 method20783();

	@OriginalMember(owner = "client!dh", name = "lm", descriptor = "()Lclient!pq;")
	public abstract Class489 method20784();

	@OriginalMember(owner = "client!dh", name = "ll", descriptor = "(F)V")
	public abstract void method20785(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dh", name = "lb", descriptor = "(F)V")
	public abstract void method20786(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dh", name = "le", descriptor = "(F)V")
	public abstract void method20787(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dh", name = "kz", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	public abstract Class109 method20788(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "lq", descriptor = "(IFFFFF)V")
	public abstract void method20789(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "ba", descriptor = "(IIIII)V")
	abstract void method20790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "ls", descriptor = "(IFFFFF)V")
	public abstract void method20791(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "dl", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	public abstract Class107 method20792(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3);

	@OriginalMember(owner = "client!dh", name = "ly", descriptor = "(III)V")
	public abstract void method20793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "lg", descriptor = "(I)Lclient!dz;")
	public abstract Class107 method20794(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "lx", descriptor = "(I)Lclient!dz;")
	public abstract Class107 method20795(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "lj", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	public abstract Class107 method20796(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3);

	@OriginalMember(owner = "client!dh", name = "fi", descriptor = "()Z")
	public abstract boolean method20797();

	@OriginalMember(owner = "client!dh", name = "lz", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	public abstract Class107 method20798(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3);

	@OriginalMember(owner = "client!dh", name = "ln", descriptor = "(Lclient!dz;)V")
	public abstract void method20799(@OriginalArg(0) Class107 arg0);

	@OriginalMember(owner = "client!dh", name = "lt", descriptor = "(IIII)V")
	public abstract void method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ld", descriptor = "(IIII)V")
	public abstract void method20801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "lk", descriptor = "(IIII)V")
	public abstract void method20802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "mf", descriptor = "(IIII)V")
	public abstract void method20803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "mh", descriptor = "(II)V")
	public abstract void method20804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "mx", descriptor = "(II)V")
	public abstract void method20805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "mg", descriptor = "()Z")
	public abstract boolean method20806();

	@OriginalMember(owner = "client!dh", name = "gf", descriptor = "()Z")
	public abstract boolean method20807();

	@OriginalMember(owner = "client!dh", name = "mn", descriptor = "()Z")
	public abstract boolean method20808();

	@OriginalMember(owner = "client!dh", name = "mv", descriptor = "(FFFFF)V")
	public abstract void method20809(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dh", name = "my", descriptor = "([I)Lclient!cj;")
	public abstract Class102 method20810(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "md", descriptor = "([I)Lclient!cj;")
	public abstract Class102 method20811(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "mq", descriptor = "([I)Lclient!cj;")
	public abstract Class102 method20812(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dh", name = "ms", descriptor = "()Z")
	public abstract boolean method20813();

	@OriginalMember(owner = "client!dh", name = "mp", descriptor = "()Z")
	public abstract boolean method20814();

	@OriginalMember(owner = "client!dh", name = "er", descriptor = "()V")
	abstract void method20815();

	@OriginalMember(owner = "client!dh", name = "ml", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V")
	public abstract void method20816(@OriginalArg(0) Class102 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class102 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "fv", descriptor = "()Z")
	public abstract boolean method20817();

	@OriginalMember(owner = "client!dh", name = "mr", descriptor = "()Z")
	public abstract boolean method20818();

	@OriginalMember(owner = "client!dh", name = "mz", descriptor = "()Z")
	public abstract boolean method20819();

	@OriginalMember(owner = "client!dh", name = "mb", descriptor = "()Z")
	public abstract boolean method20820();

	@OriginalMember(owner = "client!dh", name = "mc", descriptor = "()V")
	public abstract void method20821();

	@OriginalMember(owner = "client!dh", name = "ma", descriptor = "()Z")
	public abstract boolean method20822();

	@OriginalMember(owner = "client!dh", name = "mw", descriptor = "(FFFFFF)V")
	abstract void method20823(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "fy", descriptor = "()Ljava/lang/String;")
	public abstract String method20824();

	@OriginalMember(owner = "client!dh", name = "mm", descriptor = "(FFFFFF)V")
	abstract void method20825(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "nd", descriptor = "(ILclient!dy;)V")
	public abstract void method20826(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "jo", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	public abstract Class106 method20827(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "ol", descriptor = "(IIII)V")
	public abstract void method20828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "bm", descriptor = "(II)V")
	public abstract void method20829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "gj", descriptor = "()I")
	public abstract int method20830();

	@OriginalMember(owner = "client!dh", name = "no", descriptor = "()V")
	public abstract void method20831();

	@OriginalMember(owner = "client!dh", name = "np", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method20832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!dh", name = "na", descriptor = "(FFF[F)V")
	public abstract void method20833(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "jh", descriptor = "(I)V")
	public abstract void method20834(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "nh", descriptor = "(Lclient!de;Z)Lclient!cm;")
	public abstract Class100 method20835(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dh", name = "nw", descriptor = "(FFF[F)V")
	public abstract void method20836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "eg", descriptor = "(II)V")
	abstract void method20837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4;

	@OriginalMember(owner = "client!dh", name = "nl", descriptor = "(FFF[F)V")
	public abstract void method20838(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "ng", descriptor = "()Lclient!afq;")
	public abstract Class112_Sub1 method20839();

	@OriginalMember(owner = "client!dh", name = "nt", descriptor = "()Lclient!afq;")
	public abstract Class112_Sub1 method20840();

	@OriginalMember(owner = "client!dh", name = "kw", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	public abstract Class109 method20841(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "gc", descriptor = "()Z")
	public abstract boolean method20842();

	@OriginalMember(owner = "client!dh", name = "nq", descriptor = "(III)Lclient!dw;")
	public abstract Interface19 method20843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "ds", descriptor = "(I[Lclient!akf;)V")
	public abstract void method20844(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1);

	@OriginalMember(owner = "client!dh", name = "kx", descriptor = "(II[[I[[IIII)Lclient!cb;")
	public abstract Class99 method20845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "nf", descriptor = "(IIIIIII)V")
	public abstract void method20846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "nz", descriptor = "(IIIIIII)V")
	public abstract void method20847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "hf", descriptor = "()V")
	public abstract void method20848();

	@OriginalMember(owner = "client!dh", name = "ns", descriptor = "(IIIIIII)V")
	public abstract void method20849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "nv", descriptor = "(Lclient!de;Z)Lclient!cm;")
	public abstract Class100 method20850(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dh", name = "fs", descriptor = "()Z")
	public abstract boolean method20851();

	@OriginalMember(owner = "client!dh", name = "oh", descriptor = "(ILclient!dy;)V")
	public abstract void method20852(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1);

	@OriginalMember(owner = "client!dh", name = "ha", descriptor = "(II)J")
	public abstract long method20853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "()I")
	public abstract int method20854();

	@OriginalMember(owner = "client!dh", name = "fm", descriptor = "()Z")
	public abstract boolean method20855();

	@OriginalMember(owner = "client!dh", name = "ia", descriptor = "(IIIII)V")
	abstract void method20856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "ep", descriptor = "(FFF[F)V")
	public abstract void method20857(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "eb", descriptor = "()I")
	public abstract int method20858();

	@OriginalMember(owner = "client!dh", name = "kt", descriptor = "(Lclient!ou;)V")
	public abstract void method20859(@OriginalArg(0) Class470 arg0);

	@OriginalMember(owner = "client!dh", name = "dp", descriptor = "(Lclient!dz;)V")
	public abstract void method20860(@OriginalArg(0) Class107 arg0);

	@OriginalMember(owner = "client!dh", name = "mi", descriptor = "()Z")
	public abstract boolean method20861();

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "()I")
	public abstract int method20862();

	@OriginalMember(owner = "client!dh", name = "ev", descriptor = "(FFF[F)V")
	public abstract void method20863(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dh", name = "ib", descriptor = "(IIIII)V")
	abstract void method20864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "ck", descriptor = "(I)V")
	public abstract void method20865(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "jf", descriptor = "(IIIIII)I")
	public abstract int method20866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "mj", descriptor = "()Z")
	public abstract boolean method20867();

	@OriginalMember(owner = "client!dh", name = "cg", descriptor = "(IIIIIILclient!ch;IIIII)V")
	public abstract void method20868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!dh", name = "fg", descriptor = "()Z")
	public abstract boolean method20869();

	@OriginalMember(owner = "client!dh", name = "hn", descriptor = "()V")
	public abstract void method20870();

	@OriginalMember(owner = "client!dh", name = "ex", descriptor = "()I")
	public abstract int method20871();

	@OriginalMember(owner = "client!dh", name = "ih", descriptor = "(IIIIII)V")
	public abstract void method20872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dh", name = "br", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method20873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!dh", name = "jy", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V")
	public abstract void method20874(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2);

	@OriginalMember(owner = "client!dh", name = "fb", descriptor = "()Ljava/lang/String;")
	public abstract String method20875();

	@OriginalMember(owner = "client!dh", name = "lh", descriptor = "(IFFFFF)V")
	public abstract void method20876(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dh", name = "kg", descriptor = "(II)I")
	public abstract int method20877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "dn", descriptor = "(III)V")
	public abstract void method20878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "nn", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;")
	public abstract Interface18 method20879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "ig", descriptor = "()V")
	public abstract void method20880();

	@OriginalMember(owner = "client!dh", name = "gs", descriptor = "()Z")
	public abstract boolean method20881();
}
