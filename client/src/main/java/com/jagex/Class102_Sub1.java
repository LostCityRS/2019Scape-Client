package com.jagex;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

@OriginalClass("client!afa")
public abstract class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!afa", name = "ah", descriptor = "I")
	static final int anInt2950 = 128;

	@OriginalMember(owner = "client!afa", name = "af", descriptor = "I")
	static final int anInt2951 = 1;

	@OriginalMember(owner = "client!afa", name = "am", descriptor = "I")
	static final int anInt2952 = 2;

	@OriginalMember(owner = "client!afa", name = "ak", descriptor = "I")
	static final int anInt2953 = 4;

	@OriginalMember(owner = "client!afa", name = "at", descriptor = "I")
	static final int anInt2954 = 8;

	@OriginalMember(owner = "client!afa", name = "ad", descriptor = "I")
	static final int anInt2955 = 16;

	@OriginalMember(owner = "client!afa", name = "fj", descriptor = "I")
	static final int anInt2958 = 2;

	@OriginalMember(owner = "client!afa", name = "aa", descriptor = "I")
	protected static final int anInt2961 = 100663296;

	@OriginalMember(owner = "client!afa", name = "av", descriptor = "I")
	static final int anInt2966 = 55;

	@OriginalMember(owner = "client!afa", name = "an", descriptor = "I")
	static final int anInt2975 = 7;

	@OriginalMember(owner = "client!afa", name = "fm", descriptor = "I")
	static final int anInt2986 = 1;

	@OriginalMember(owner = "client!afa", name = "fk", descriptor = "I")
	static final int anInt2987 = 4;

	@OriginalMember(owner = "client!afa", name = "aw", descriptor = "I")
	static final int anInt2988 = 4194304;

	@OriginalMember(owner = "client!afa", name = "fq", descriptor = "I")
	static final int anInt2997 = 3;

	@OriginalMember(owner = "client!afa", name = "ab", descriptor = "Ljava/lang/Object;")
	static final Object anObject7 = new Object();

	@OriginalMember(owner = "client!afa", name = "bo", descriptor = "Lclient!pm;")
	static final Class487 aClass487_79 = new Class487();

	@OriginalMember(owner = "client!afa", name = "eh", descriptor = "I")
	protected int anInt2949;

	@OriginalMember(owner = "client!afa", name = "gm", descriptor = "Lclient!ld;")
	Class135 aClass135_17;

	@OriginalMember(owner = "client!afa", name = "ck", descriptor = "F")
	float aFloat201;

	@OriginalMember(owner = "client!afa", name = "az", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!afa", name = "bl", descriptor = "Lclient!lj;")
	Class398 aClass398_5;

	@OriginalMember(owner = "client!afa", name = "br", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!afa", name = "bt", descriptor = "I")
	public int anInt2959;

	@OriginalMember(owner = "client!afa", name = "bs", descriptor = "I")
	protected int anInt2960;

	@OriginalMember(owner = "client!afa", name = "go", descriptor = "Z")
	protected boolean aBoolean509;

	@OriginalMember(owner = "client!afa", name = "fe", descriptor = "Lclient!aqj;")
	Class131_Sub1_Sub1 aClass131_Sub1_Sub1_5;

	@OriginalMember(owner = "client!afa", name = "gs", descriptor = "Lclient!ld;")
	Class135 aClass135_18;

	@OriginalMember(owner = "client!afa", name = "dk", descriptor = "[Lclient!akb;")
	protected Class80_Sub12[] aClass80_Sub12Array19;

	@OriginalMember(owner = "client!afa", name = "cs", descriptor = "F")
	float aFloat203;

	@OriginalMember(owner = "client!afa", name = "es", descriptor = "Lclient!aem;")
	Class99_Sub1 aClass99_Sub1_5;

	@OriginalMember(owner = "client!afa", name = "em", descriptor = "Lclient!lb;")
	public Interface34 anInterface34_23;

	@OriginalMember(owner = "client!afa", name = "ca", descriptor = "F")
	float aFloat204;

	@OriginalMember(owner = "client!afa", name = "gt", descriptor = "Lclient!lx;")
	Interface38 anInterface38_15;

	@OriginalMember(owner = "client!afa", name = "ap", descriptor = "Z")
	protected boolean aBoolean518;

	@OriginalMember(owner = "client!afa", name = "fy", descriptor = "Z")
	protected boolean aBoolean522;

	@OriginalMember(owner = "client!afa", name = "en", descriptor = "Lclient!mn;")
	Class421 aClass421_3;

	@OriginalMember(owner = "client!afa", name = "ec", descriptor = "I")
	protected int anInt2977;

	@OriginalMember(owner = "client!afa", name = "ev", descriptor = "I")
	protected int anInt2978;

	@OriginalMember(owner = "client!afa", name = "ep", descriptor = "I")
	int anInt2981;

	@OriginalMember(owner = "client!afa", name = "ew", descriptor = "I")
	int anInt2982;

	@OriginalMember(owner = "client!afa", name = "ef", descriptor = "[Lclient!mf;")
	Interface39[] anInterface39Array3;

	@OriginalMember(owner = "client!afa", name = "ez", descriptor = "[Lclient!pm;")
	protected Class487[] aClass487Array6;

	@OriginalMember(owner = "client!afa", name = "ek", descriptor = "[Lclient!ma;")
	protected Class412[] aClass412Array5;

	@OriginalMember(owner = "client!afa", name = "ea", descriptor = "[Lclient!ma;")
	protected Class412[] aClass412Array6;

	@OriginalMember(owner = "client!afa", name = "eu", descriptor = "Lclient!aem;")
	Class99_Sub1 aClass99_Sub1_6;

	@OriginalMember(owner = "client!afa", name = "fo", descriptor = "Lclient!dp;")
	Class229 aClass229_6;

	@OriginalMember(owner = "client!afa", name = "gc", descriptor = "Z")
	protected boolean aBoolean523;

	@OriginalMember(owner = "client!afa", name = "ex", descriptor = "Lclient!lh;")
	Class131 aClass131_3;

	@OriginalMember(owner = "client!afa", name = "eb", descriptor = "Lclient!je;")
	Class119 aClass119_3;

	@OriginalMember(owner = "client!afa", name = "ej", descriptor = "Lclient!jb;")
	Class124 aClass124_3;

	@OriginalMember(owner = "client!afa", name = "eq", descriptor = "Lclient!js;")
	Class127 aClass127_3;

	@OriginalMember(owner = "client!afa", name = "ei", descriptor = "Lclient!jg;")
	Class122 aClass122_3;

	@OriginalMember(owner = "client!afa", name = "fv", descriptor = "Lclient!aqj;")
	Class131_Sub1_Sub1 aClass131_Sub1_Sub1_6;

	@OriginalMember(owner = "client!afa", name = "fp", descriptor = "Lclient!aqq;")
	Class131_Sub1_Sub2 aClass131_Sub1_Sub2_3;

	@OriginalMember(owner = "client!afa", name = "fx", descriptor = "Lclient!lp;")
	Class401 aClass401_3;

	@OriginalMember(owner = "client!afa", name = "et", descriptor = "Lclient!lb;")
	Interface34 anInterface34_24;

	@OriginalMember(owner = "client!afa", name = "cj", descriptor = "F")
	float aFloat213;

	@OriginalMember(owner = "client!afa", name = "fz", descriptor = "Lclient!afl;")
	Class106_Sub2 aClass106_Sub2_3;

	@OriginalMember(owner = "client!afa", name = "fn", descriptor = "Z")
	boolean aBoolean524;

	@OriginalMember(owner = "client!afa", name = "gx", descriptor = "Lclient!ld;")
	Class135 aClass135_19;

	@OriginalMember(owner = "client!afa", name = "fg", descriptor = "F")
	protected float aFloat217;

	@OriginalMember(owner = "client!afa", name = "hq", descriptor = "Z")
	protected boolean aBoolean527;

	@OriginalMember(owner = "client!afa", name = "ge", descriptor = "I")
	int anInt2996;

	@OriginalMember(owner = "client!afa", name = "gw", descriptor = "Lclient!lq;")
	Class402 aClass402_3;

	@OriginalMember(owner = "client!afa", name = "gp", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!afa", name = "ga", descriptor = "I")
	protected int anInt2999;

	@OriginalMember(owner = "client!afa", name = "gd", descriptor = "Z")
	public boolean aBoolean529;

	@OriginalMember(owner = "client!afa", name = "gg", descriptor = "I")
	public int anInt3000;

	@OriginalMember(owner = "client!afa", name = "gj", descriptor = "Z")
	protected boolean aBoolean530;

	@OriginalMember(owner = "client!afa", name = "gf", descriptor = "Z")
	protected boolean aBoolean531;

	@OriginalMember(owner = "client!afa", name = "ey", descriptor = "[Lclient!mo;")
	protected Class422[] aClass422Array3;

	@OriginalMember(owner = "client!afa", name = "gv", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!afa", name = "gr", descriptor = "Z")
	protected boolean aBoolean533;

	@OriginalMember(owner = "client!afa", name = "gu", descriptor = "Z")
	protected boolean aBoolean534;

	@OriginalMember(owner = "client!afa", name = "gy", descriptor = "Lclient!lx;")
	Interface38 anInterface38_16;

	@OriginalMember(owner = "client!afa", name = "gl", descriptor = "Lclient!lx;")
	Interface38 anInterface38_17;

	@OriginalMember(owner = "client!afa", name = "gq", descriptor = "Lclient!ld;")
	Class135 aClass135_20;

	@OriginalMember(owner = "client!afa", name = "ba", descriptor = "I")
	public int anInt3001;

	@OriginalMember(owner = "client!afa", name = "gn", descriptor = "Lclient!ld;")
	Class135 aClass135_21;

	@OriginalMember(owner = "client!afa", name = "ft", descriptor = "F")
	protected float aFloat218;

	@OriginalMember(owner = "client!afa", name = "hp", descriptor = "Lclient!ld;")
	Class135 aClass135_22;

	@OriginalMember(owner = "client!afa", name = "hf", descriptor = "Lclient!mv;")
	Interface44 anInterface44_4;

	@OriginalMember(owner = "client!afa", name = "as", descriptor = "J")
	public long aLong168;

	@OriginalMember(owner = "client!afa", name = "hv", descriptor = "Lclient!mz;")
	Class429 aClass429_3;

	@OriginalMember(owner = "client!afa", name = "fw", descriptor = "I")
	int anInt3002;

	@OriginalMember(owner = "client!afa", name = "al", descriptor = "Lclient!ada;")
	Class76 aClass76_3 = new Class76();

	@OriginalMember(owner = "client!afa", name = "bg", descriptor = "I")
	int anInt2956 = 0;

	@OriginalMember(owner = "client!afa", name = "bn", descriptor = "Lclient!aag;")
	Class8 aClass8_40 = new Class8();

	@OriginalMember(owner = "client!afa", name = "bj", descriptor = "Lclient!ov;")
	Class471 aClass471_34 = new Class471();

	@OriginalMember(owner = "client!afa", name = "by", descriptor = "Lclient!pm;")
	Class487 aClass487_89 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bk", descriptor = "Lclient!ov;")
	Class471 aClass471_39 = new Class471();

	@OriginalMember(owner = "client!afa", name = "bz", descriptor = "Lclient!ov;")
	Class471 aClass471_38 = new Class471();

	@OriginalMember(owner = "client!afa", name = "be", descriptor = "Lclient!pm;")
	public Class487 aClass487_75 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bh", descriptor = "Lclient!pm;")
	Class487 aClass487_76 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bv", descriptor = "Lclient!pm;")
	Class487 aClass487_77 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bp", descriptor = "Lclient!ov;")
	Class471 aClass471_37 = new Class471();

	@OriginalMember(owner = "client!afa", name = "bb", descriptor = "Lclient!pm;")
	Class487 aClass487_84 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bc", descriptor = "Lclient!ov;")
	Class471 aClass471_35 = new Class471();

	@OriginalMember(owner = "client!afa", name = "bf", descriptor = "Lclient!pm;")
	protected Class487 aClass487_80 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bw", descriptor = "Lclient!pm;")
	Class487 aClass487_81 = new Class487();

	@OriginalMember(owner = "client!afa", name = "bx", descriptor = "Lclient!on;")
	Class463 aClass463_59 = new Class463();

	@OriginalMember(owner = "client!afa", name = "bi", descriptor = "[F")
	float[] aFloatArray66 = new float[4];

	@OriginalMember(owner = "client!afa", name = "bu", descriptor = "Z")
	boolean aBoolean512 = false;

	@OriginalMember(owner = "client!afa", name = "bm", descriptor = "Lclient!la;")
	Class394 aClass394_3 = Class394.aClass394_5;

	@OriginalMember(owner = "client!afa", name = "bq", descriptor = "Z")
	boolean aBoolean521 = false;

	@OriginalMember(owner = "client!afa", name = "bd", descriptor = "Lclient!pm;")
	Class487 aClass487_82 = new Class487();

	@OriginalMember(owner = "client!afa", name = "cd", descriptor = "Lclient!pm;")
	Class487 aClass487_74 = new Class487();

	@OriginalMember(owner = "client!afa", name = "cv", descriptor = "Z")
	boolean aBoolean513 = false;

	@OriginalMember(owner = "client!afa", name = "ct", descriptor = "Lclient!pm;")
	Class487 aClass487_83 = new Class487();

	@OriginalMember(owner = "client!afa", name = "cn", descriptor = "Lclient!pm;")
	Class487 aClass487_87 = new Class487();

	@OriginalMember(owner = "client!afa", name = "cy", descriptor = "Lclient!pm;")
	Class487 aClass487_85 = this.aClass487_87;

	@OriginalMember(owner = "client!afa", name = "ch", descriptor = "Lclient!pm;")
	public Class487 aClass487_86 = new Class487();

	@OriginalMember(owner = "client!afa", name = "cc", descriptor = "Lclient!pm;")
	Class487 aClass487_88 = new Class487();

	@OriginalMember(owner = "client!afa", name = "cu", descriptor = "Lclient!pm;")
	public Class487 aClass487_78 = new Class487();

	@OriginalMember(owner = "client!afa", name = "ce", descriptor = "[[F")
	float[][] aFloatArrayArray22 = new float[6][4];

	@OriginalMember(owner = "client!afa", name = "cr", descriptor = "F")
	protected float aFloat205 = 0.0F;

	@OriginalMember(owner = "client!afa", name = "ci", descriptor = "F")
	protected float aFloat206 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "cm", descriptor = "F")
	float aFloat211 = 0.0F;

	@OriginalMember(owner = "client!afa", name = "cp", descriptor = "F")
	float aFloat207 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "cg", descriptor = "F")
	protected float aFloat215 = 50.0F;

	@OriginalMember(owner = "client!afa", name = "cb", descriptor = "F")
	protected float aFloat202 = 3584.0F;

	@OriginalMember(owner = "client!afa", name = "cw", descriptor = "I")
	protected int anInt2995 = 0;

	@OriginalMember(owner = "client!afa", name = "cl", descriptor = "I")
	protected int anInt2964 = 0;

	@OriginalMember(owner = "client!afa", name = "cx", descriptor = "I")
	protected int anInt2979 = 0;

	@OriginalMember(owner = "client!afa", name = "cf", descriptor = "I")
	protected int anInt2957 = 0;

	@OriginalMember(owner = "client!afa", name = "co", descriptor = "I")
	int anInt2967 = 0;

	@OriginalMember(owner = "client!afa", name = "cz", descriptor = "I")
	int anInt2968 = 0;

	@OriginalMember(owner = "client!afa", name = "cq", descriptor = "I")
	int anInt2969 = 0;

	@OriginalMember(owner = "client!afa", name = "dg", descriptor = "I")
	int anInt2970 = 0;

	@OriginalMember(owner = "client!afa", name = "dh", descriptor = "I")
	protected int anInt2971 = 0;

	@OriginalMember(owner = "client!afa", name = "dd", descriptor = "I")
	protected int anInt2963 = 0;

	@OriginalMember(owner = "client!afa", name = "dc", descriptor = "I")
	protected int anInt2972 = 0;

	@OriginalMember(owner = "client!afa", name = "dn", descriptor = "I")
	protected int anInt2984 = 0;

	@OriginalMember(owner = "client!afa", name = "df", descriptor = "I")
	protected int anInt2989 = 0;

	@OriginalMember(owner = "client!afa", name = "dl", descriptor = "I")
	protected int anInt2974 = 0;

	@OriginalMember(owner = "client!afa", name = "db", descriptor = "Z")
	protected boolean aBoolean515 = true;

	@OriginalMember(owner = "client!afa", name = "dt", descriptor = "Z")
	protected boolean aBoolean535 = false;

	@OriginalMember(owner = "client!afa", name = "du", descriptor = "Z")
	protected boolean aBoolean516 = true;

	@OriginalMember(owner = "client!afa", name = "ds", descriptor = "Z")
	protected boolean aBoolean517 = false;

	@OriginalMember(owner = "client!afa", name = "dw", descriptor = "Z")
	protected boolean aBoolean511 = false;

	@OriginalMember(owner = "client!afa", name = "dr", descriptor = "Z")
	protected boolean aBoolean519 = true;

	@OriginalMember(owner = "client!afa", name = "dx", descriptor = "Z")
	protected boolean aBoolean520 = false;

	@OriginalMember(owner = "client!afa", name = "de", descriptor = "[F")
	public float[] aFloatArray68 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afa", name = "dv", descriptor = "[F")
	protected float[] aFloatArray67 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!afa", name = "dm", descriptor = "[F")
	float[] aFloatArray69 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afa", name = "dq", descriptor = "[F")
	float[] aFloatArray65 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afa", name = "do", descriptor = "I")
	int anInt2976 = 16777215;

	@OriginalMember(owner = "client!afa", name = "dp", descriptor = "F")
	public float aFloat208 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "dj", descriptor = "F")
	public float aFloat209 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "di", descriptor = "F")
	public float aFloat210 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "dz", descriptor = "F")
	protected float aFloat212 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "dy", descriptor = "F")
	public float aFloat214 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "da", descriptor = "F")
	protected float aFloat216 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "ed", descriptor = "I")
	int anInt2962 = 8;

	@OriginalMember(owner = "client!afa", name = "eo", descriptor = "I")
	int anInt2980 = 3;

	@OriginalMember(owner = "client!afa", name = "ee", descriptor = "I")
	protected int anInt2983 = 0;

	@OriginalMember(owner = "client!afa", name = "er", descriptor = "Z")
	boolean aBoolean510 = false;

	@OriginalMember(owner = "client!afa", name = "eg", descriptor = "[Lclient!lh;")
	final Class131[] aClass131Array3 = new Class131[16];

	@OriginalMember(owner = "client!afa", name = "fa", descriptor = "[Lclient!li;")
	final Class136[] aClass136Array3 = new Class136[4];

	@OriginalMember(owner = "client!afa", name = "fh", descriptor = "Z")
	boolean aBoolean525 = false;

	@OriginalMember(owner = "client!afa", name = "fb", descriptor = "Z")
	protected boolean aBoolean526 = true;

	@OriginalMember(owner = "client!afa", name = "fd", descriptor = "I")
	protected int anInt2965 = -1;

	@OriginalMember(owner = "client!afa", name = "fc", descriptor = "I")
	protected int anInt2985 = -1;

	@OriginalMember(owner = "client!afa", name = "fl", descriptor = "I")
	protected int anInt2990 = 0;

	@OriginalMember(owner = "client!afa", name = "fs", descriptor = "I")
	int anInt2991 = 1;

	@OriginalMember(owner = "client!afa", name = "fu", descriptor = "I")
	protected int anInt2992 = -1;

	@OriginalMember(owner = "client!afa", name = "ff", descriptor = "Lclient!my;")
	protected Class428 aClass428_3 = Class428.aClass428_6;

	@OriginalMember(owner = "client!afa", name = "fr", descriptor = "Z")
	protected boolean aBoolean514 = true;

	@OriginalMember(owner = "client!afa", name = "fi", descriptor = "Z")
	protected boolean aBoolean528 = true;

	@OriginalMember(owner = "client!afa", name = "gh", descriptor = "B")
	protected byte aByte76 = 0;

	@OriginalMember(owner = "client!afa", name = "gz", descriptor = "I")
	protected int anInt2993 = 2;

	@OriginalMember(owner = "client!afa", name = "gb", descriptor = "Z")
	boolean aBoolean508 = false;

	@OriginalMember(owner = "client!afa", name = "ha", descriptor = "[Lclient!afw;")
	Class105_Sub3[] aClass105_Sub3Array5;

	@OriginalMember(owner = "client!afa", name = "hn", descriptor = "[Lclient!afw;")
	Class105_Sub3[] aClass105_Sub3Array6;

	@OriginalMember(owner = "client!afa", name = "hw", descriptor = "Lclient!pm;")
	Class487 aClass487_90;

	@OriginalMember(owner = "client!afa", name = "hk", descriptor = "Lclient!ov;")
	Class471 aClass471_36;

	@OriginalMember(owner = "client!afa", name = "ae", descriptor = "Lclient!pf;")
	final Class480 aClass480_80;

	@OriginalMember(owner = "client!afa", name = "gk", descriptor = "I")
	public final int anInt2994;

	@OriginalMember(owner = "client!afa", name = "gi", descriptor = "I")
	int anInt2973;

	@OriginalMember(owner = "client!afa", name = "el", descriptor = "Lclient!lc;")
	final Class395 aClass395_3;

	@OriginalMember(owner = "client!afa", name = "ar", descriptor = "[I")
	int[] anIntArray262;

	@OriginalMember(owner = "client!afa", name = "au", descriptor = "Lsun/misc/Unsafe;")
	protected Unsafe anUnsafe4;

	@OriginalMember(owner = "client!afa", name = "sa", descriptor = "()V")
	public static void method21146() throws Exception_Sub7 {
		Class588.method31902(350319923).method31859("jaclib", -1470507821);
	}

	@OriginalMember(owner = "client!afa", name = "yx", descriptor = "()V")
	public static void method21161() throws Exception_Sub7 {
		Class588.method31902(350319923).method31859("jaclib", 720774966);
	}

	@OriginalMember(owner = "client!afa", name = "wt", descriptor = "(CCCC)I")
	static int method21262(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afa", name = "xg", descriptor = "()V")
	public static void method21333() throws Exception_Sub7 {
		Class588.method31902(350319923).method31859("jaclib", 1555681617);
	}

	@OriginalMember(owner = "client!afa", name = "yd", descriptor = "()V")
	public static void method21334() throws Exception_Sub7 {
		Class588.method31902(350319923).method31859("jaclib", 703353368);
	}

	@OriginalMember(owner = "client!afa", name = "agp", descriptor = "(CCCC)I")
	static int method21421(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afa", name = "agn", descriptor = "(CCCC)I")
	static int method21517(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;II)V")
	Class102_Sub1(@OriginalArg(0) Class235 arg0, @OriginalArg(1) Interface23 arg1, @OriginalArg(2) Interface46 arg2, @OriginalArg(3) Interface47 arg3, @OriginalArg(4) Interface48 arg4, @OriginalArg(5) Class480 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		new Stream();
		this.aClass105_Sub3Array5 = new Class105_Sub3[8];
		this.aClass105_Sub3Array6 = new Class105_Sub3[8];
		this.aClass487_90 = new Class487();
		this.aClass471_36 = new Class471();
		try {
			this.aClass480_80 = arg5;
			this.anInt2994 = arg6;
			this.anInt2973 = arg7;
			Class388.method28633(false, true, -1581693638);
			if (this.anInterface23_7 == null) {
				this.aClass395_3 = null;
			} else {
				this.aClass395_3 = new Class395(this, this.anInterface23_7);
			}
			if (this.anInt2973 == 0) {
				this.anIntArray262 = Class687.anIntArray524;
			} else {
				this.anIntArray262 = Class522.anIntArray467;
			}
			try {
				@Pc(449) Field local449 = Unsafe.class.getDeclaredField("theUnsafe");
				local449.setAccessible(true);
				this.anUnsafe4 = (Unsafe) local449.get(null);
			} catch (@Pc(460) Exception local460) {
			}
			this.method21292(4194304);
		} catch (@Pc(465) Throwable local465) {
			local465.printStackTrace();
			this.method20660(-1396531808);
			if (local465 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local465;
			}
			throw new RuntimeException("");
		}
		this.method20737(this.method21093(131072));
	}

	@OriginalMember(owner = "client!afa", name = "sq", descriptor = "()F")
	public abstract float method21132();

	@OriginalMember(owner = "client!afa", name = "rp", descriptor = "(Lclient!lg;)V")
	public final void method21133(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1348(arg0, 2122018012);
	}

	@OriginalMember(owner = "client!afa", name = "vv", descriptor = "(B)V")
	final void method21134(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method21460(0);
			this.method21235(1);
		} else {
			this.method21460(3);
			this.method21235(3);
		}
		this.method21238();
	}

	@OriginalMember(owner = "client!afa", name = "yn", descriptor = "()V")
	final void method21135() {
		this.anInterface38_15 = this.method21239(true);
		@Pc(6) byte local6 = 24;
		this.anInterface38_15.method29327(local6, 12);
		this.aClass135_17 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11) });
	}

	@OriginalMember(owner = "client!afa", name = "adn", descriptor = "()V")
	final void method21136() {
		this.method21230();
	}

	@OriginalMember(owner = "client!afa", name = "re", descriptor = "(Lclient!lg;)V")
	public final void method21137(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1358(arg0, anObject7, (byte) 73);
	}

	@OriginalMember(owner = "client!afa", name = "aeq", descriptor = "(B)V")
	final void method21138(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method21460(0);
			this.method21235(1);
		} else {
			this.method21460(3);
			this.method21235(3);
		}
		this.method21238();
	}

	@OriginalMember(owner = "client!afa", name = "agk", descriptor = "()V")
	abstract void method21139();

	@OriginalMember(owner = "client!afa", name = "abz", descriptor = "(Lclient!co;Lclient!dy;)Z")
	abstract boolean method21140(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1);

	@OriginalMember(owner = "client!afa", name = "rd", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21141(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "sg", descriptor = "(Ljava/lang/String;)Lclient!hb;")
	public abstract Class113 method21142(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afa", name = "sj", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	final byte[] method21143(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass480_80.method29938(arg0, arg1, -2049795132);
	}

	@OriginalMember(owner = "client!afa", name = "sp", descriptor = "([B)Lclient!hs;")
	final Class324 method21144(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class324(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "sw", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	public abstract void method21145(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2);

	@OriginalMember(owner = "client!afa", name = "nj", descriptor = "(II)I")
	@Override
	public final int method21041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afa", name = "sc", descriptor = "()V")
	final void method21147() {
		this.anInterface38_15 = this.method21239(true);
		@Pc(6) byte local6 = 24;
		this.anInterface38_15.method29327(local6, 12);
		this.aClass135_17 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11) });
	}

	@OriginalMember(owner = "client!afa", name = "sh", descriptor = "()V")
	void method21148() {
		this.method21237(7);
		this.method21149();
	}

	@OriginalMember(owner = "client!afa", name = "sl", descriptor = "()V")
	final void method21149() {
		this.method21197();
		this.method21247();
		this.method21196();
		this.method21202();
		this.method21199();
		this.method21285();
		this.method21201();
		this.method21169();
		this.method21192();
		this.method21244();
		this.method21295();
		this.method21240();
		this.method21464();
		this.method21238();
		for (@Pc(32) int local32 = this.anInt2998 - 1; local32 >= 0; local32--) {
			this.method21217(local32);
			this.method21232();
			this.method21360();
			this.method21227();
		}
		this.method21229();
		this.method21369();
	}

	@OriginalMember(owner = "client!afa", name = "w", descriptor = "()Z")
	@Override
	public final boolean method20666() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "sb", descriptor = "()V")
	void method21150() {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28847();
		}
		if (this.aClass136Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass136Array3.length; local10++) {
				if (this.aClass136Array3[local10] != null && this.aClass136Array3[local10].method11193()) {
					this.aClass136Array3[local10].method11185();
				}
			}
		}
		this.aClass402_3 = new Class402(this);
		this.method21398();
		this.method21147();
		this.method21153();
		this.aClass429_3 = new Class429(this, 1024);
		this.aClass402_3.method28885(this);
		if (this.aBoolean529) {
			this.aClass421_3 = new Class421(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ty", descriptor = "()Lclient!pm;")
	final Class487 method21151() {
		return this.aClass487_86;
	}

	@OriginalMember(owner = "client!afa", name = "vu", descriptor = "(ILclient!mh;ZZ)V")
	abstract void method21152(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!afa", name = "sv", descriptor = "()V")
	final void method21153() {
		this.anInterface38_17 = this.method21239(false);
		this.anInterface38_17.method29327(3096, 12);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		for (@Pc(31) int local31 = 0; local31 <= 256; local31++) {
			@Pc(43) double local43 = (double) (local31 * 2) * 3.141592653589793D / 256.0D;
			@Pc(47) float local47 = (float) Math.cos(local43);
			@Pc(51) float local51 = (float) Math.sin(local43);
			this.aByteBuffer7.putFloat(local51);
			this.aByteBuffer7.putFloat(local47);
			this.aByteBuffer7.putFloat(0.0F);
		}
		this.anInterface38_17.method29383(0, this.aByteBuffer7.position(), this.aLong168);
	}

	@OriginalMember(owner = "client!afa", name = "iy", descriptor = "(IIIII)V")
	@Override
	final void method20883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "agm", descriptor = "()V")
	abstract void method21154();

	@OriginalMember(owner = "client!afa", name = "k", descriptor = "()Z")
	@Override
	public final boolean method20664() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ze", descriptor = "(I)Lclient!mv;")
	final Interface44 method21155(@OriginalArg(0) int arg0) {
		if (this.anInterface44_4.method29391() < arg0 * 2) {
			this.anInterface44_4.method29401(arg0);
		}
		return this.anInterface44_4;
	}

	@OriginalMember(owner = "client!afa", name = "mz", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public final void method20670(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		Class136_Sub3.aClass97_Sub1Array1[0] = (Class97_Sub1) arg0;
		Class136_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[1] = (Class97_Sub1) arg2;
		Class136_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[2] = (Class97_Sub1) arg4;
		Class136_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class136_Sub3.anInt1300 = local1;
		Class136_Sub3.aFloat131 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "()Z")
	@Override
	public final boolean method20791() {
		return this.aClass136Array3[3] != null;
	}

	@OriginalMember(owner = "client!afa", name = "jk", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	@Override
	public final void method20951(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2) {
		@Pc(2) Class487 local2 = this.aClass487_80;
		local2.method30080(arg0);
		local2.method30078(this.aClass487_88);
		arg1.method26329(arg2, this.aClass487_83, local2, this.aFloat203, this.aFloat201, this.aFloat213, this.aFloat204);
	}

	@OriginalMember(owner = "client!afa", name = "r", descriptor = "()Z")
	@Override
	public final boolean method20667() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "z", descriptor = "()Z")
	@Override
	public final boolean method20671() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "hm", descriptor = "()V")
	@Override
	public final void method20876() {
		if (this.aClass108_6 == null) {
			this.anInt2964 = 0;
			this.anInt2957 = 0;
			this.anInt2995 = 0;
			this.anInt2979 = 0;
		} else {
			this.anInt2995 = 0;
			this.anInt2979 = 0;
			this.anInt2957 = this.aClass108_6.method24036();
			this.anInt2964 = this.aClass108_6.method24037();
		}
		if (this.aBoolean527) {
			this.aBoolean527 = false;
			this.method21175();
		}
	}

	@OriginalMember(owner = "client!afa", name = "v", descriptor = "()Z")
	@Override
	public final boolean method20858() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "()Z")
	@Override
	public final boolean method21081() {
		return this.aBoolean531;
	}

	@OriginalMember(owner = "client!afa", name = "di", descriptor = "()Z")
	@Override
	public final boolean method20776() {
		return this.aClass401_3 != null && this.aClass401_3.aBoolean854;
	}

	@OriginalMember(owner = "client!afa", name = "y", descriptor = "()Ljava/lang/String;")
	public abstract String method21048();

	@OriginalMember(owner = "client!afa", name = "lj", descriptor = "()Lclient!ov;")
	@Override
	public final Class471 method21088() {
		return this.aClass471_39;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	@Override
	public void method20662(@OriginalArg(0) int arg0) {
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28695();
		}
		this.anInt3000 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!afa", name = "acr", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	abstract Interface36 method21156(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afa", name = "cm", descriptor = "()V")
	@Override
	public final void method20744() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29016();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ug", descriptor = "()V")
	abstract void method21157();

	@OriginalMember(owner = "client!afa", name = "wu", descriptor = "(Lclient!ld;)V")
	public abstract void method21158(@OriginalArg(0) Class135 arg0);

	@OriginalMember(owner = "client!afa", name = "st", descriptor = "()V")
	final void method21159() {
		this.method21461();
	}

	@OriginalMember(owner = "client!afa", name = "zk", descriptor = "()Z")
	final boolean method21160() {
		if (this.aClass136Array3[1] == null || this.aClass136Array3[1].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[1]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "dp", descriptor = "(IIII)V")
	@Override
	public final void method20774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass401_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass136Array3.length; local5++) {
			if (this.aClass136Array3[local5] != null && this.aClass136Array3[local5].method11193() && !this.aClass136Array3[local5].method11195()) {
				if (!this.aClass401_3.method28852(arg0, arg1, arg2, arg3)) {
					this.aClass401_3.method28855();
					this.aClass401_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "uw", descriptor = "()V")
	public abstract void method21162();

	@OriginalMember(owner = "client!afa", name = "su", descriptor = "()Z")
	final boolean method21163() {
		if (this.aClass136Array3[1] == null || this.aClass136Array3[1].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[1]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "dz", descriptor = "()Z")
	@Override
	public final boolean method20777() {
		return this.aClass136Array3[1] != null && this.aClass136Array3[1].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "dy", descriptor = "(FFFFF)V")
	@Override
	public final void method20815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class136_Sub1.aFloat121 = arg0;
		Class136_Sub1.aFloat122 = arg1;
		Class136_Sub1.aFloat123 = arg2;
		Class136_Sub1.aFloat124 = arg3;
		Class136_Sub1.aFloat125 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "da", descriptor = "([I)Lclient!cz;")
	@Override
	public final Class97 method20779(@OriginalArg(0) int[] arg0) {
		return new Class97_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "sy", descriptor = "()Z")
	final boolean method21164() {
		if (this.aClass136Array3[2] == null || this.aClass136Array3[2].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[2]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "dk", descriptor = "()Z")
	@Override
	public final boolean method20780() {
		return this.aClass136Array3[2] != null && this.aClass136Array3[2].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "ec", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public final void method20928(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		Class136_Sub3.aClass97_Sub1Array1[0] = (Class97_Sub1) arg0;
		Class136_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[1] = (Class97_Sub1) arg2;
		Class136_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[2] = (Class97_Sub1) arg4;
		Class136_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class136_Sub3.anInt1300 = local1;
		Class136_Sub3.aFloat131 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afa", name = "ev", descriptor = "()Z")
	@Override
	public final boolean method20822() {
		if (this.aClass136Array3[3] == null || this.aClass136Array3[3].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[3]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "ed", descriptor = "()V")
	@Override
	public final void method20856() {
		if (this.aClass136Array3[3] != null && this.aClass136Array3[3].method11193()) {
			this.aClass401_3.method28862(this.aClass136Array3[3]);
			this.aClass395_3.method28696();
		}
	}

	@OriginalMember(owner = "client!afa", name = "eo", descriptor = "()Z")
	@Override
	public final boolean method20784() {
		return this.aClass136Array3[3] != null && this.aClass136Array3[3].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "ya", descriptor = "()V")
	void method21165() {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28855();
		}
		if (this.anInterface38_16 != null) {
			this.anInterface38_16.method30837();
		}
		if (this.anInterface38_15 != null) {
			this.anInterface38_15.method30837();
		}
		if (this.anInterface38_17 != null) {
			this.anInterface38_17.method30837();
		}
		if (this.aClass429_3 != null) {
			this.aClass429_3.method29065();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass105_Sub3Array6[local31] != null) {
				this.aClass105_Sub3Array6[local31].method7558();
			}
		}
		if (this.aClass402_3 != null) {
			this.aClass402_3.method28886();
		}
		if (this.anInterface44_4 != null) {
			this.anInterface44_4.method30837();
		}
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29038();
			this.aClass421_3 = null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "cu", descriptor = "(I)Lclient!akl;")
	@Override
	public final Class80_Sub22 method21093(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub1 local4 = new Class80_Sub22_Sub1(arg0);
		this.aClass8_40.method232(local4, 902394674);
		return local4;
	}

	@OriginalMember(owner = "client!afa", name = "ce", descriptor = "(Lclient!akl;)V")
	@Override
	public final void method20737(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap4 = ((Class80_Sub22_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!afa", name = "so", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method21166(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.f(arg0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "agw", descriptor = "()V")
	abstract void method21167();

	@OriginalMember(owner = "client!afa", name = "s", descriptor = "()I")
	@Override
	public final int method20911() {
		return this.anInt2959 + this.anInt3001 + this.anInt2960;
	}

	@OriginalMember(owner = "client!afa", name = "cj", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class99 method20739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "agc", descriptor = "()V")
	abstract void method21168();

	@OriginalMember(owner = "client!afa", name = "ck", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public final Class99 method20740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class99_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "ci", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class99 method20743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class99_Sub1 local8 = new Class99_Sub1(this, arg2, arg3, arg4, false);
		local8.method18223(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afa", name = "tb", descriptor = "()V")
	abstract void method21169();

	@OriginalMember(owner = "client!afa", name = "cb", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public final Class98 method21103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub3.method2709(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "co", descriptor = "(I)V")
	@Override
	public final void method20752(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "cz", descriptor = "(Lclient!dt;IIII)Lclient!dn;")
	@Override
	public final Class105 method20753(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class105_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "cq", descriptor = "(II)I")
	@Override
	public final int method21083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afa", name = "dg", descriptor = "(II)I")
	@Override
	public final int method20755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "ik", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method20987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method21195();
		@Pc(50) Class131 local50 = this.aClass131Array3[13];
		local50.method20436();
		local50.method20442(arg4);
		this.method21235(arg5);
		local50.method20454();
		this.method21323(false);
		@Pc(69) int local69 = arg8 % (arg7 + arg6);
		@Pc(74) float local74 = local5 * (float) arg6;
		@Pc(79) float local79 = local11 * (float) arg6;
		@Pc(81) float local81 = 0.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(85) float local85 = local74;
		@Pc(87) float local87 = local79;
		if (local69 > arg6) {
			local81 = local5 * (float) (arg6 + arg7 - local69);
			local83 = local11 * (float) (arg6 + arg7 - local69);
		} else {
			local85 = local5 * (float) (arg6 - local69);
			local87 = local11 * (float) (arg6 - local69);
		}
		@Pc(128) float local128 = (float) arg0 + local81;
		@Pc(133) float local133 = (float) arg1 + local83;
		@Pc(138) float local138 = local5 * (float) arg7;
		@Pc(143) float local143 = local11 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local128 > (float) arg2) {
					break;
				}
				if (local128 + local85 > (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			} else {
				if (local128 < (float) arg2) {
					break;
				}
				if (local128 + local85 < (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3) {
					break;
				}
				if (local133 + local87 > (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3) {
					break;
				}
				if (local133 + local87 < (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			}
			if (!this.method21193(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21438();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21323(true);
		local50.method20437();
	}

	@OriginalMember(owner = "client!afa", name = "cx", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20750() {
		return this.aClass487_90;
	}

	@OriginalMember(owner = "client!afa", name = "cf", descriptor = "()Lclient!ov;")
	@Override
	public final Class471 method20813() {
		return this.aClass471_36;
	}

	@OriginalMember(owner = "client!afa", name = "dm", descriptor = "(I)Lclient!df;")
	@Override
	public final Class106 method20771(@OriginalArg(0) int arg0) {
		return new Class106_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "do", descriptor = "(Lclient!df;)V")
	@Override
	public final void method20773(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_3 = (Class106_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "sd", descriptor = "()Lclient!ml;")
	public final Interface42 method21170() {
		return this.aClass106_Sub2_3 == null ? null : this.aClass106_Sub2_3.method17951();
	}

	@OriginalMember(owner = "client!afa", name = "yv", descriptor = "()V")
	final void method21171() {
		this.method21461();
	}

	@OriginalMember(owner = "client!afa", name = "je", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public final Class99 method20926(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class99_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "ba", descriptor = "([I)V")
	@Override
	public final void method20707(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2967;
		arg0[1] = this.anInt2968;
		arg0[2] = this.anInt2969;
		arg0[3] = this.anInt2970;
	}

	@OriginalMember(owner = "client!afa", name = "zg", descriptor = "()Z")
	final boolean method21172() {
		if (this.aClass136Array3[2] == null || this.aClass136Array3[2].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[2]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "bt", descriptor = "(FF)V")
	@Override
	public final void method20708(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat211 = arg0;
		this.aFloat207 = arg1;
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "bz", descriptor = "([I)V")
	@Override
	public final void method20713(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2979;
		arg0[1] = this.anInt2995;
		arg0[2] = this.anInt2957;
		arg0[3] = this.anInt2964;
	}

	@OriginalMember(owner = "client!afa", name = "bx", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public final void method20724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afa", name = "bj", descriptor = "(IIII)V")
	@Override
	public final void method20986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass108_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass108_6.method24036();
			local10 = this.aClass108_6.method24037();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20877();
			return;
		}
		this.anInt2979 = arg0 >= 0 ? arg0 : 0;
		this.anInt2957 = arg2 <= local6 ? arg2 : local6;
		this.anInt2995 = arg1 >= 0 ? arg1 : 0;
		this.anInt2964 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "by", descriptor = "(IIII)V")
	@Override
	public final void method20972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass108_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass108_6.method24036();
			local10 = this.aClass108_6.method24037();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2979 < local21) {
			this.anInt2979 = local21;
			local43 = true;
		}
		if (this.anInt2957 > local28) {
			this.anInt2957 = local28;
			local43 = true;
		}
		if (this.anInt2995 < local34) {
			this.anInt2995 = local34;
			local43 = true;
		}
		if (this.anInt2964 > local41) {
			this.anInt2964 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "jj", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	@Override
	final boolean method20994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5) {
		@Pc(2) Class487 local2 = this.aClass487_80;
		local2.method30080(arg4);
		local2.method30078(this.aClass487_88);
		return arg5.method29859(arg0, arg1, arg2, arg3, local2, this.aFloat203, this.aFloat201, this.aFloat213, this.aFloat204);
	}

	@OriginalMember(owner = "client!afa", name = "bk", descriptor = "(Z)V")
	@Override
	public final void method20712(@OriginalArg(0) boolean arg0) {
		this.aBoolean510 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "se", descriptor = "()Lclient!ls;")
	final Class404 method21173() {
		return this.aClass421_3 == null ? Class404.aClass404_3 : this.aClass421_3.method29024();
	}

	@OriginalMember(owner = "client!afa", name = "tk", descriptor = "()V")
	abstract void method21174();

	@OriginalMember(owner = "client!afa", name = "tm", descriptor = "()V")
	abstract void method21175();

	@OriginalMember(owner = "client!afa", name = "ll", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20968() {
		return this.aClass487_83;
	}

	@OriginalMember(owner = "client!afa", name = "of", descriptor = "(I)Lclient!df;")
	@Override
	public final Class106 method21047(@OriginalArg(0) int arg0) {
		return new Class106_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "dn", descriptor = "(Lclient!ov;)V")
	@Override
	public final void method20759(@OriginalArg(0) Class471 arg0) {
		this.aClass471_39 = arg0;
		this.aClass487_75.method30080(this.aClass471_39);
		this.aClass487_77.method30075(this.aClass487_75);
		this.aClass487_77.method30069();
		this.aClass471_38.method29760(arg0);
		this.aClass471_38.method29768();
		this.aClass487_76.method30080(this.aClass471_38);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21527();
		}
	}

	@OriginalMember(owner = "client!afa", name = "df", descriptor = "()Lclient!ov;")
	@Override
	public final Class471 method20897() {
		return this.aClass471_39;
	}

	@OriginalMember(owner = "client!afa", name = "db", descriptor = "(Lclient!pm;)V")
	@Override
	public final void method20933(@OriginalArg(0) Class487 arg0) {
		this.aClass487_83.method30075(arg0);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ti", descriptor = "()V")
	final void method21176() {
		this.aClass487_88.method30075(this.aClass487_75);
		this.aClass487_88.method30078(this.aClass487_83);
		this.aClass487_88.method30099(this.aFloatArrayArray22[0]);
		this.aClass487_88.method30100(this.aFloatArrayArray22[1]);
		this.aClass487_88.method30095(this.aFloatArrayArray22[2]);
		this.aClass487_88.method30096(this.aFloatArrayArray22[3]);
		this.aClass487_88.method30097(this.aFloatArrayArray22[4]);
		this.aClass487_88.method30098(this.aFloatArrayArray22[5]);
		this.aClass487_78.method30075(this.aClass487_88);
		this.method21243(this.aClass487_78);
	}

	@OriginalMember(owner = "client!afa", name = "ku", descriptor = "(I)V")
	@Override
	public final void method20935(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "acx", descriptor = "(IZ[[I)Lclient!ml;")
	abstract Interface42 method21177(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "()V")
	@Override
	void method20661() {
		if (this.aBoolean508) {
			return;
		}
		this.method21294();
		this.aClass395_3.method28696();
		for (@Pc(12) Class80 local12 = this.aClass8_40.method247(129206984); local12 != null; local12 = this.aClass8_40.method237(-1774428805)) {
			((Class80_Sub22_Sub1) local12).method21611();
		}
		Class210.method25804(false, true, -1331760319);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass131Array3.length; local29++) {
			if (this.aClass131Array3[local29] != null) {
				this.aClass131Array3[local29].method20441();
				this.aClass131Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass136Array3.length; local29++) {
			if (this.aClass136Array3[local29] != null) {
				this.aClass136Array3[local29].method11194();
				this.aClass136Array3[local29] = null;
			}
		}
		this.method21354();
		this.method20662(0);
		this.aBoolean508 = true;
	}

	@OriginalMember(owner = "client!afa", name = "tx", descriptor = "()Lclient!ov;")
	final Class471 method21178() {
		if (this.aClass394_3 != Class394.aClass394_6) {
			return this.aClass471_34;
		}
		if (!this.aBoolean512) {
			this.aClass471_37.method29760(this.aClass471_34);
			this.aClass471_37.method29766(this.aClass471_39);
			this.aClass487_84.method30080(this.aClass471_37);
			this.aBoolean512 = true;
		}
		return this.aClass471_37;
	}

	@OriginalMember(owner = "client!afa", name = "ua", descriptor = "(Lclient!co;IIZ[B)Lclient!lb;")
	final Interface34 method21179(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method21221(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "tr", descriptor = "()Lclient!pm;")
	final Class487 method21180() {
		return this.aClass487_78;
	}

	@OriginalMember(owner = "client!afa", name = "tu", descriptor = "()Lclient!pm;")
	final Class487 method21181() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			if (!this.aBoolean512) {
				this.method21178();
			}
			return this.aClass487_84;
		} else {
			return this.aClass487_89;
		}
	}

	@OriginalMember(owner = "client!afa", name = "fe", descriptor = "()V")
	@Override
	void method20808() {
		if (this.aBoolean508) {
			return;
		}
		this.method21294();
		this.aClass395_3.method28696();
		for (@Pc(12) Class80 local12 = this.aClass8_40.method247(129206984); local12 != null; local12 = this.aClass8_40.method237(-543862938)) {
			((Class80_Sub22_Sub1) local12).method21611();
		}
		Class210.method25804(false, true, -1331760319);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass131Array3.length; local29++) {
			if (this.aClass131Array3[local29] != null) {
				this.aClass131Array3[local29].method20441();
				this.aClass131Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass136Array3.length; local29++) {
			if (this.aClass136Array3[local29] != null) {
				this.aClass136Array3[local29].method11194();
				this.aClass136Array3[local29] = null;
			}
		}
		this.method21354();
		this.method20662(0);
		this.aBoolean508 = true;
	}

	@OriginalMember(owner = "client!afa", name = "yk", descriptor = "()V")
	final void method21182() {
		this.anInterface38_16 = this.method21239(false);
		@Pc(6) short local6 = 160;
		this.anInterface38_16.method29327(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface38_16.method29383(0, this.aByteBuffer7.position(), this.aLong168);
		this.aClass135_20 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3, Class400.aClass400_1, Class400.aClass400_1 }) });
	}

	@OriginalMember(owner = "client!afa", name = "adu", descriptor = "(I)V")
	public final void method21183(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "tq", descriptor = "()V")
	final void method21184() {
		this.aBoolean521 = false;
		if (this.aClass394_3 == Class394.aClass394_4) {
			this.method21187();
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tl", descriptor = "()V")
	final void method21185() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			return;
		}
		this.aClass394_3 = Class394.aClass394_6;
		this.method21527();
		this.method21188();
		this.aClass487_85 = this.aClass487_83;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "td", descriptor = "()V")
	final void method21186() {
		this.aBoolean513 = false;
		this.method21188();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tw", descriptor = "()V")
	final void method21187() {
		if (this.aBoolean521) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass108_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass108_6.method24036();
			local13 = this.aClass108_6.method24037();
		}
		@Pc(21) Class487 local21 = this.aClass487_82;
		if (local9 == 0 || local13 == 0) {
			local21.method30139();
		} else {
			local21.method30087(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass487_74.method30075(local21);
		this.method21243(this.aClass487_74);
		this.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!afa", name = "to", descriptor = "()V")
	final void method21188() {
		if (!this.aBoolean513) {
			this.aBoolean513 = true;
		}
	}

	@OriginalMember(owner = "client!afa", name = "tt", descriptor = "()V")
	final void method21189() {
		this.aClass487_86.method30075(this.aClass487_85);
		this.method21243(this.aClass487_86);
		this.aFloat202 = (this.aClass487_86.aFloatArray114[14] - this.aClass487_86.aFloatArray114[15]) / (this.aClass487_86.aFloatArray114[11] - this.aClass487_86.aFloatArray114[10]);
		this.aFloat215 = -this.aClass487_86.aFloatArray114[14] / this.aClass487_86.aFloatArray114[10];
		this.method21242();
	}

	@OriginalMember(owner = "client!afa", name = "mm", descriptor = "()V")
	@Override
	public final void method21011() {
		this.aBoolean524 = false;
	}

	@OriginalMember(owner = "client!afa", name = "tg", descriptor = "(Z)V")
	final void method21190(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean517) {
			this.aBoolean517 = arg0;
			this.method21169();
			this.anInt2996 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "te", descriptor = "(Z)V")
	final void method21191(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean535) {
			this.aBoolean535 = arg0;
			this.method21192();
			this.anInt2996 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ii", descriptor = "(IIIIIILclient!cg;II)V")
	@Override
	public final void method21067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afa", name = "tj", descriptor = "()V")
	abstract void method21192();

	@OriginalMember(owner = "client!afa", name = "ek", descriptor = "(FFF[F)V")
	@Override
	public final void method21114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat203 + this.aFloat213 * local59 / local29;
		arg3[1] = this.aFloat201 + this.aFloat204 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "ix", descriptor = "(IIIII)V")
	@Override
	final void method21043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afa", name = "rb", descriptor = "()V")
	@Override
	public final void method21127() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29016();
		}
	}

	@OriginalMember(owner = "client!afa", name = "sf", descriptor = "(FFFFFF)Z")
	final boolean method21193(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method21292(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface38_15.method29383(0, this.aByteBuffer7.position(), this.aLong168);
	}

	@OriginalMember(owner = "client!afa", name = "cc", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	@Override
	public final void method20735(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2) {
		@Pc(2) Class487 local2 = this.aClass487_80;
		local2.method30080(arg0);
		local2.method30078(this.aClass487_88);
		arg1.method26329(arg2, this.aClass487_83, local2, this.aFloat203, this.aFloat201, this.aFloat213, this.aFloat204);
	}

	@OriginalMember(owner = "client!afa", name = "dx", descriptor = "()I")
	@Override
	public final int method20768() {
		return this.anInt2999 - 2;
	}

	@OriginalMember(owner = "client!afa", name = "tc", descriptor = "(Z)V")
	final void method21194(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean511) {
			this.aBoolean511 = arg0;
			this.method21196();
			this.anInt2996 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afa", name = "dv", descriptor = "(I[Lclient!akb;)V")
	@Override
	public final void method20770(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass80_Sub12Array19[local1] = arg1[local1];
		}
		this.anInt2978 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "du", descriptor = "(F)V")
	@Override
	public final void method20801(@OriginalArg(0) float arg0) {
		if (this.aFloat212 != arg0) {
			this.aFloat212 = arg0;
			this.method21197();
			this.method21285();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tf", descriptor = "()V")
	final void method21195() {
		if (this.aClass394_3 == Class394.aClass394_4) {
			return;
		}
		@Pc(6) Class394 local6 = this.aClass394_3;
		this.aClass394_3 = Class394.aClass394_4;
		if (local6 == Class394.aClass394_6) {
			this.method21527();
		}
		this.method21187();
		this.aClass487_85 = this.aClass487_82;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afa", name = "dw", descriptor = "(I)V")
	@Override
	public final void method20704(@OriginalArg(0) int arg0) {
		this.anInt2980 = 0;
		while (arg0 > 1) {
			this.anInt2980++;
			arg0 >>= 0x1;
		}
		this.anInt2962 = 0x1 << this.anInt2980;
	}

	@OriginalMember(owner = "client!afa", name = "uk", descriptor = "()V")
	abstract void method21196();

	@OriginalMember(owner = "client!afa", name = "us", descriptor = "()V")
	abstract void method21197();

	@OriginalMember(owner = "client!afa", name = "afi", descriptor = "(ILclient!lx;)V")
	public abstract void method21198(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1);

	@OriginalMember(owner = "client!afa", name = "uj", descriptor = "()V")
	abstract void method21199();

	@OriginalMember(owner = "client!afa", name = "yq", descriptor = "(FFFFFF)Z")
	final boolean method21200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method21292(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface38_15.method29383(0, this.aByteBuffer7.position(), this.aLong168);
	}

	@OriginalMember(owner = "client!afa", name = "up", descriptor = "()V")
	abstract void method21201();

	@OriginalMember(owner = "client!afa", name = "uf", descriptor = "()V")
	final void method21202() {
		if (this.method21245()) {
			this.method21157();
		}
		this.anInt2977 = this.anInt2978;
	}

	@OriginalMember(owner = "client!afa", name = "yl", descriptor = "()V")
	void method21203() {
		this.method21237(7);
		this.method21149();
	}

	@OriginalMember(owner = "client!afa", name = "ul", descriptor = "(Lclient!co;Lclient!dy;)Z")
	abstract boolean method21204(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1);

	@OriginalMember(owner = "client!afa", name = "un", descriptor = "(Lclient!co;Lclient!dy;)Z")
	abstract boolean method21205(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1);

	@OriginalMember(owner = "client!afa", name = "um", descriptor = "(IIZ[I)Lclient!lb;")
	final Interface34 method21206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method21304(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "rr", descriptor = "()Z")
	public abstract boolean method21207();

	@OriginalMember(owner = "client!afa", name = "uv", descriptor = "(Lclient!co;IIZ[F)Lclient!lb;")
	final Interface34 method21208(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method21211(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "uo", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	abstract Interface34 method21209(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "adg", descriptor = "()V")
	final void method21210() {
		if (this.aClass422Array3[this.anInt2983] != Class422.aClass422_2) {
			this.aClass422Array3[this.anInt2983] = Class422.aClass422_2;
			this.aClass487Array6[this.anInt2983].method30139();
			this.method21228();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ud", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	abstract Interface34 method21211(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afa", name = "sm", descriptor = "()V")
	public final void method21212() {
		this.anInterface39Array3 = new Interface39[this.anInt2998];
		this.aClass487Array6 = new Class487[this.anInt2998];
		this.aClass422Array3 = new Class422[this.anInt2998];
		this.aClass412Array5 = new Class412[this.anInt2998];
		this.aClass412Array6 = new Class412[this.anInt2998];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2998; local26++) {
			this.aClass412Array6[local26] = Class412.aClass412_1;
			this.aClass412Array5[local26] = Class412.aClass412_1;
			this.aClass422Array3[local26] = Class422.aClass422_2;
			this.aClass487Array6[local26] = new Class487();
		}
		this.aClass80_Sub12Array19 = new Class80_Sub12[this.anInt2999 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface34_23 = this.method21304(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface34_24 = this.method21304(1, 1, false, local68, 0, 0);
		this.method20737(new Class80_Sub22_Sub1(262144));
		this.aClass135_18 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1 }) });
		this.aClass135_22 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3 }) });
		this.aClass135_21 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11), new Class397(Class400.aClass400_3), new Class397(Class400.aClass400_1), new Class397(Class400.aClass400_2) });
		this.aClass135_19 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11), new Class397(Class400.aClass400_3), new Class397(Class400.aClass400_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass105_Sub3Array5[local205] = new Class105_Sub3(this, 0, 0, false, false);
			this.aClass105_Sub3Array6[local205] = new Class105_Sub3(this, 0, 0, true, true);
		}
		this.method21382();
		this.anInterface44_4 = this.method21246(true);
		this.method21148();
		this.method20877();
		this.method20894();
		this.aClass99_Sub1_6 = new Class99_Sub1(this, this.anInterface34_23);
		this.aClass99_Sub1_5 = new Class99_Sub1(this, this.anInterface34_24);
		this.method20714(3, 0);
	}

	@OriginalMember(owner = "client!afa", name = "ut", descriptor = "(IZ[[I)Lclient!ml;")
	abstract Interface42 method21213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afa", name = "abj", descriptor = "(Lclient!co;Lclient!dy;)Z")
	abstract boolean method21214(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1);

	@OriginalMember(owner = "client!afa", name = "ui", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	abstract Interface40 method21215(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "xc", descriptor = "([B)Lclient!hs;")
	final Class324 method21216(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class324(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "uq", descriptor = "(I)V")
	public final void method21217(@OriginalArg(0) int arg0) {
		if (this.anInt2983 != arg0) {
			this.anInt2983 = arg0;
			this.method21231();
		}
	}

	@OriginalMember(owner = "client!afa", name = "qd", descriptor = "()V")
	@Override
	public final void method21109() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29022();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tz", descriptor = "()V")
	final void method21218() {
		if (this.aClass394_3 == Class394.aClass394_5) {
			return;
		}
		@Pc(6) Class394 local6 = this.aClass394_3;
		this.aClass394_3 = Class394.aClass394_5;
		if (local6 == Class394.aClass394_6) {
			this.method21527();
		}
		this.aClass487_85 = this.aClass487_87;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afa", name = "kf", descriptor = "()I")
	@Override
	public final int method20950() {
		return this.anInt2999 - 2;
	}

	@OriginalMember(owner = "client!afa", name = "uz", descriptor = "(Lclient!ma;Lclient!ma;)V")
	public final void method21219(@OriginalArg(0) Class412 arg0, @OriginalArg(1) Class412 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass412Array5[this.anInt2983] != arg0) {
			this.aClass412Array5[this.anInt2983] = arg0;
			this.method21232();
			local1 = true;
		}
		if (this.aClass412Array6[this.anInt2983] != arg1) {
			this.aClass412Array6[this.anInt2983] = arg1;
			this.method21360();
			local1 = true;
		}
		if (local1) {
			this.anInt2996 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afa", name = "vx", descriptor = "(ILclient!mh;)V")
	public final void method21220(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1) {
		this.method21152(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!afa", name = "ur", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	abstract Interface34 method21221(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afa", name = "vi", descriptor = "(ILclient!mh;)V")
	public final void method21222(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1) {
		this.method21223(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!afa", name = "vf", descriptor = "(ILclient!mh;Z)V")
	abstract void method21223(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afa", name = "vr", descriptor = "(I)V")
	public final void method21224(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2949) {
			this.anInt2949 = arg0;
			this.method21229();
		}
	}

	@OriginalMember(owner = "client!afa", name = "vo", descriptor = "()Lclient!pm;")
	final Class487 method21225() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "vs", descriptor = "()Lclient!pm;")
	public final Class487 method21226() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "lb", descriptor = "(Lclient!df;)V")
	@Override
	public final void method20982(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_3 = (Class106_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "ve", descriptor = "()V")
	final void method21227() {
		if (this.aClass422Array3[this.anInt2983] != Class422.aClass422_2) {
			this.aClass422Array3[this.anInt2983] = Class422.aClass422_2;
			this.aClass487Array6[this.anInt2983].method30139();
			this.method21228();
		}
	}

	@OriginalMember(owner = "client!afa", name = "vd", descriptor = "()V")
	final void method21228() {
		this.method21230();
	}

	@OriginalMember(owner = "client!afa", name = "vq", descriptor = "()V")
	abstract void method21229();

	@OriginalMember(owner = "client!afa", name = "vh", descriptor = "()V")
	abstract void method21230();

	@OriginalMember(owner = "client!afa", name = "vc", descriptor = "()V")
	abstract void method21231();

	@OriginalMember(owner = "client!afa", name = "vk", descriptor = "()V")
	abstract void method21232();

	@OriginalMember(owner = "client!afa", name = "mq", descriptor = "(FFFFF)V")
	@Override
	public final void method20892(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class136_Sub1.aFloat121 = arg0;
		Class136_Sub1.aFloat122 = arg1;
		Class136_Sub1.aFloat123 = arg2;
		Class136_Sub1.aFloat124 = arg3;
		Class136_Sub1.aFloat125 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "aao", descriptor = "(Lclient!pm;)V")
	public abstract void method21233(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!afa", name = "ee", descriptor = "(ILclient!dp;)V")
	@Override
	public final void method20787(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		this.anInt3002 = arg0;
		this.aClass229_6 = arg1;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!afa", name = "adx", descriptor = "(ILclient!mh;ZZ)V")
	abstract void method21234(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!afa", name = "ez", descriptor = "()V")
	@Override
	public final void method20699() {
		this.aBoolean524 = false;
	}

	@OriginalMember(owner = "client!afa", name = "vy", descriptor = "(I)V")
	final void method21235(@OriginalArg(0) int arg0) {
		if (this.anInt2991 == arg0) {
			return;
		}
		@Pc(8) Class428 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class428.aClass428_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class428.aClass428_4;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class428.aClass428_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class428.aClass428_5;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class428.aClass428_5;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean528) {
			this.aBoolean528 = local10;
			this.method21238();
		}
		if (local12 != this.aBoolean514) {
			this.aBoolean514 = local12;
			this.method21240();
		}
		if (local8 != this.aClass428_3) {
			this.aClass428_3 = local8;
			this.method21464();
		}
		this.anInt2991 = arg0;
		this.anInt2996 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "ew", descriptor = "(FFFFFF)V")
	@Override
	final void method20786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class136_Sub2.aFloat127 = arg0;
		Class136_Sub2.aFloat129 = arg1;
		Class136_Sub2.aFloat126 = arg2;
		Class136_Sub2.aFloat128 = arg5;
	}

	@OriginalMember(owner = "client!afa", name = "aab", descriptor = "(Z)V")
	final void method21236(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean511) {
			this.aBoolean511 = arg0;
			this.method21196();
			this.anInt2996 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afa", name = "vn", descriptor = "(I)V")
	abstract void method21237(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "vp", descriptor = "()V")
	abstract void method21238();

	@OriginalMember(owner = "client!afa", name = "wg", descriptor = "(Z)Lclient!lx;")
	abstract Interface38 method21239(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "vm", descriptor = "()V")
	abstract void method21240();

	@OriginalMember(owner = "client!afa", name = "vb", descriptor = "(Z)V")
	final void method21241(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean522) {
			this.aBoolean522 = arg0;
			this.method21244();
			this.anInt2996 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "dr", descriptor = "(III)V")
	@Override
	public final void method20767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2965 == arg0 && this.anInt2985 == arg1 && this.anInt2990 == arg2) {
			return;
		}
		this.anInt2965 = arg0;
		this.anInt2985 = arg1;
		this.anInt2990 = arg2;
		this.method21242();
		this.method21244();
	}

	@OriginalMember(owner = "client!afa", name = "vg", descriptor = "()V")
	final void method21242() {
		if (this.aClass131_3 != null) {
			this.aClass131_3.method20451();
		}
		this.method21295();
	}

	@OriginalMember(owner = "client!afa", name = "tp", descriptor = "(Lclient!pm;)V")
	public abstract void method21243(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!afa", name = "wl", descriptor = "()V")
	abstract void method21244();

	@OriginalMember(owner = "client!afa", name = "rj", descriptor = "()Z")
	final boolean method21245() {
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!afa", name = "wh", descriptor = "(Z)Lclient!mv;")
	abstract Interface44 method21246(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "uc", descriptor = "()V")
	abstract void method21247();

	@OriginalMember(owner = "client!afa", name = "wk", descriptor = "([Lclient!lf;)Lclient!ld;")
	abstract Class135 method21248(@OriginalArg(0) Class397[] arg0);

	@OriginalMember(owner = "client!afa", name = "sk", descriptor = "(I)Lclient!mv;")
	final Interface44 method21249(@OriginalArg(0) int arg0) {
		if (this.anInterface44_4.method29391() < arg0 * 2) {
			this.anInterface44_4.method29401(arg0);
		}
		return this.anInterface44_4;
	}

	@OriginalMember(owner = "client!afa", name = "wp", descriptor = "(ILclient!lx;)V")
	public abstract void method21250(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1);

	@OriginalMember(owner = "client!afa", name = "wn", descriptor = "(Lclient!mv;)V")
	abstract void method21251(@OriginalArg(0) Interface44 arg0);

	@OriginalMember(owner = "client!afa", name = "zm", descriptor = "()Lclient!pm;")
	final Class487 method21252() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			if (!this.aBoolean512) {
				this.method21178();
			}
			return this.aClass487_84;
		} else {
			return this.aClass487_89;
		}
	}

	@OriginalMember(owner = "client!afa", name = "bw", descriptor = "(IIIIII)V")
	@Override
	public final void method20722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(false);
		}
		if (this.aBoolean515) {
			this.method20762(false);
			this.aClass99_Sub1_6.method18229(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20762(true);
		} else {
			this.aClass99_Sub1_6.method18229(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "bf", descriptor = "(IIIIII)V")
	@Override
	public final void method20818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class102_Sub1_Sub1) {
			local3 = -1;
		}
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(false);
		}
		this.method20727(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20727(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20727(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20727(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "abm", descriptor = "()V")
	abstract void method21253();

	@OriginalMember(owner = "client!afa", name = "np", descriptor = "(FFF[F)V")
	@Override
	public final void method21022(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * arg0 + this.aClass487_88.aFloatArray114[6] * arg1 + this.aClass487_88.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat203 + this.aFloat213 * local115 / local59;
			arg3[1] = this.aFloat201 + this.aFloat204 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "bu", descriptor = "(IIIII)V")
	@Override
	final void method20725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "bm", descriptor = "(IIIII)V")
	@Override
	final void method20922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "()Z")
	@Override
	public final boolean method20678() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "cd", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method20729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method21195();
		@Pc(50) Class131 local50 = this.aClass131Array3[13];
		local50.method20436();
		local50.method20442(arg4);
		this.method21235(arg5);
		local50.method20454();
		this.method21323(false);
		@Pc(69) int local69 = arg8 % (arg7 + arg6);
		@Pc(74) float local74 = local5 * (float) arg6;
		@Pc(79) float local79 = local11 * (float) arg6;
		@Pc(81) float local81 = 0.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(85) float local85 = local74;
		@Pc(87) float local87 = local79;
		if (local69 > arg6) {
			local81 = local5 * (float) (arg6 + arg7 - local69);
			local83 = local11 * (float) (arg6 + arg7 - local69);
		} else {
			local85 = local5 * (float) (arg6 - local69);
			local87 = local11 * (float) (arg6 - local69);
		}
		@Pc(128) float local128 = (float) arg0 + local81;
		@Pc(133) float local133 = (float) arg1 + local83;
		@Pc(138) float local138 = local5 * (float) arg7;
		@Pc(143) float local143 = local11 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local128 > (float) arg2) {
					break;
				}
				if (local128 + local85 > (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			} else {
				if (local128 < (float) arg2) {
					break;
				}
				if (local128 + local85 < (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3) {
					break;
				}
				if (local133 + local87 > (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3) {
					break;
				}
				if (local133 + local87 < (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			}
			if (!this.method21193(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21438();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21323(true);
		local50.method20437();
	}

	@OriginalMember(owner = "client!afa", name = "xr", descriptor = "()Z")
	final boolean method21254() {
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!afa", name = "kj", descriptor = "()I")
	@Override
	public final int method20949() {
		return this.anInt2999 - 2;
	}

	@OriginalMember(owner = "client!afa", name = "mv", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public final void method21001(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		Class136_Sub3.aClass97_Sub1Array1[0] = (Class97_Sub1) arg0;
		Class136_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[1] = (Class97_Sub1) arg2;
		Class136_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[2] = (Class97_Sub1) arg4;
		Class136_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class136_Sub3.anInt1300 = local1;
		Class136_Sub3.aFloat131 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afa", name = "dc", descriptor = "(Lclient!db;)V")
	@Override
	public final void method20964(@OriginalArg(0) Class221 arg0) {
		this.aClass402_3.method28889(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "ln", descriptor = "(IIII)V")
	@Override
	public final void method21107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass401_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass136Array3.length; local5++) {
			if (this.aClass136Array3[local5] != null && this.aClass136Array3[local5].method11193() && !this.aClass136Array3[local5].method11195()) {
				if (!this.aClass401_3.method28852(arg0, arg1, arg2, arg3)) {
					this.aClass401_3.method28855();
					this.aClass401_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "ws", descriptor = "()V")
	public final void method21255() {
		this.method21256(Class415.aClass415_4, 2);
	}

	@OriginalMember(owner = "client!afa", name = "wo", descriptor = "(Lclient!md;I)V")
	final void method21256(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1) {
		this.method21250(0, this.anInterface38_16);
		this.method21158(this.aClass135_20);
		this.method21257(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "wq", descriptor = "(Lclient!md;II)V")
	public abstract void method21257(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afa", name = "wz", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	abstract void method21258(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afa", name = "hs", descriptor = "(IIII)V")
	@Override
	public final void method20880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass108_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass108_6.method24036();
			local10 = this.aClass108_6.method24037();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2979 < local21) {
			this.anInt2979 = local21;
			local43 = true;
		}
		if (this.anInt2957 > local28) {
			this.anInt2957 = local28;
			local43 = true;
		}
		if (this.anInt2995 < local34) {
			this.anInt2995 = local34;
			local43 = true;
		}
		if (this.anInt2964 > local41) {
			this.anInt2964 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "we", descriptor = "()V")
	public final void method21259() {
		if (this.anInt2996 == 2) {
			return;
		}
		this.method21195();
		this.method21241(false);
		this.method21194(false);
		this.method21190(false);
		this.method21191(false);
		this.method21235(1);
		this.method21134((byte) 0);
		this.anInt2996 = 2;
	}

	@OriginalMember(owner = "client!afa", name = "wv", descriptor = "()V")
	final void method21260() {
		if (this.anInt2996 == 8) {
			return;
		}
		this.method21185();
		this.method21241(true);
		this.method21190(true);
		this.method21191(true);
		this.method21235(1);
		this.method21134((byte) 0);
		this.anInt2996 = 8;
	}

	@OriginalMember(owner = "client!afa", name = "wm", descriptor = "(I)V")
	abstract void method21261(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "eq", descriptor = "()V")
	@Override
	void method20807() {
		if (this.aBoolean508) {
			return;
		}
		this.method21294();
		this.aClass395_3.method28696();
		for (@Pc(12) Class80 local12 = this.aClass8_40.method247(129206984); local12 != null; local12 = this.aClass8_40.method237(-1155934607)) {
			((Class80_Sub22_Sub1) local12).method21611();
		}
		Class210.method25804(false, true, -1331760319);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass131Array3.length; local29++) {
			if (this.aClass131Array3[local29] != null) {
				this.aClass131Array3[local29].method20441();
				this.aClass131Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass136Array3.length; local29++) {
			if (this.aClass136Array3[local29] != null) {
				this.aClass136Array3[local29].method11194();
				this.aClass136Array3[local29] = null;
			}
		}
		this.method21354();
		this.method20662(0);
		this.aBoolean508 = true;
	}

	@OriginalMember(owner = "client!afa", name = "jl", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	@Override
	final boolean method20966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5) {
		@Pc(2) Class487 local2 = this.aClass487_80;
		local2.method30080(arg4);
		local2.method30078(this.aClass487_88);
		return arg5.method29859(arg0, arg1, arg2, arg3, local2, this.aFloat203, this.aFloat201, this.aFloat213, this.aFloat204);
	}

	@OriginalMember(owner = "client!afa", name = "fv", descriptor = "()Z")
	@Override
	public final boolean method20809() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ot", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class100 method21042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class100_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "fp", descriptor = "()Z")
	@Override
	public final boolean method20811() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "nc", descriptor = "(FFF[F)V")
	@Override
	public final void method21020(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat203 + this.aFloat213 * local59 / local29;
		arg3[1] = this.aFloat201 + this.aFloat204 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "fj", descriptor = "()Z")
	@Override
	public final boolean method20747() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fq", descriptor = "()Z")
	@Override
	public final boolean method20861() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "act", descriptor = "(IIZ[III)Lclient!lb;")
	abstract Interface34 method21263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afa", name = "fa", descriptor = "()Z")
	@Override
	public final boolean method20816() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fz", descriptor = "()Z")
	@Override
	public final boolean method20817() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fn", descriptor = "()Z")
	@Override
	public final boolean method20658() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "px", descriptor = "()Z")
	@Override
	public final boolean method21070() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fw", descriptor = "()Z")
	@Override
	public final boolean method21027() {
		return this.aBoolean531;
	}

	@OriginalMember(owner = "client!afa", name = "fo", descriptor = "()Z")
	@Override
	public final boolean method20821() {
		return this.aBoolean531;
	}

	@OriginalMember(owner = "client!afa", name = "fy", descriptor = "()Z")
	@Override
	public final boolean method20879() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fb", descriptor = "()Z")
	@Override
	public final boolean method20823() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fd", descriptor = "()Z")
	@Override
	public final boolean method20824() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "th", descriptor = "()Lclient!pm;")
	final Class487 method21264() {
		return this.aClass394_3 == Class394.aClass394_6 ? this.aClass487_75 : aClass487_79;
	}

	@OriginalMember(owner = "client!afa", name = "fl", descriptor = "()Z")
	@Override
	public final boolean method20826() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "fg", descriptor = "()Ljava/lang/String;")
	public abstract String method20827();

	@OriginalMember(owner = "client!afa", name = "ft", descriptor = "()[I")
	@Override
	public final int[] method20828() {
		return null;
	}

	@OriginalMember(owner = "client!afa", name = "fs", descriptor = "()[I")
	@Override
	public final int[] method20829() {
		return null;
	}

	@OriginalMember(owner = "client!afa", name = "sx", descriptor = "()V")
	final void method21265() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.anInt2971 = this.anInt2967;
			this.anInt2963 = this.anInt2968;
			this.anInt2972 = this.anInt2969;
			this.anInt2984 = this.anInt2970;
			this.aFloat205 = this.aFloat211;
			this.aFloat206 = this.aFloat207;
		} else {
			this.anInt2971 = 0;
			this.anInt2963 = 0;
			this.anInt2972 = this.aClass108_6.method24036();
			this.anInt2984 = this.aClass108_6.method24037();
			this.aFloat205 = 0.0F;
			this.aFloat206 = 1.0F;
		}
		this.method21369();
		this.aFloat213 = (float) this.anInt2969 / 2.0F;
		this.aFloat204 = (float) this.anInt2970 / 2.0F;
		this.aFloat203 = (float) this.anInt2967 + this.aFloat213;
		this.aFloat201 = (float) this.anInt2968 + this.aFloat204;
	}

	@OriginalMember(owner = "client!afa", name = "hq", descriptor = "(Z)V")
	@Override
	public final void method20654(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.method21192();
	}

	@OriginalMember(owner = "client!afa", name = "hr", descriptor = "(Z)V")
	@Override
	public final void method20838(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.method21192();
	}

	@OriginalMember(owner = "client!afa", name = "he", descriptor = "(Z)V")
	@Override
	public final void method21071(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.method21192();
	}

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "()[I")
	@Override
	public final int[] method20675() {
		return null;
	}

	@OriginalMember(owner = "client!afa", name = "xp", descriptor = "(I)V")
	public final void method21266(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2956) {
			this.anInt2956 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2956);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong168 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ho", descriptor = "(IIII)V")
	@Override
	public final void method20942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2967 = arg0;
		this.anInt2968 = arg1;
		this.anInt2969 = arg2;
		this.anInt2970 = arg3;
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "hu", descriptor = "([I)V")
	@Override
	public final void method20873(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2967;
		arg0[1] = this.anInt2968;
		arg0[2] = this.anInt2969;
		arg0[3] = this.anInt2970;
	}

	@OriginalMember(owner = "client!afa", name = "hh", descriptor = "([I)V")
	@Override
	public final void method20874(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2967;
		arg0[1] = this.anInt2968;
		arg0[2] = this.anInt2969;
		arg0[3] = this.anInt2970;
	}

	@OriginalMember(owner = "client!afa", name = "dh", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class100 method20756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class100_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "agb", descriptor = "(Lclient!md;I)V")
	final void method21267(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1) {
		this.method21250(0, this.anInterface38_16);
		this.method21158(this.aClass135_20);
		this.method21257(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "hl", descriptor = "()V")
	@Override
	public final void method20960() {
		if (this.aClass108_6 == null) {
			this.anInt2964 = 0;
			this.anInt2957 = 0;
			this.anInt2995 = 0;
			this.anInt2979 = 0;
		} else {
			this.anInt2995 = 0;
			this.anInt2979 = 0;
			this.anInt2957 = this.aClass108_6.method24036();
			this.anInt2964 = this.aClass108_6.method24037();
		}
		if (this.aBoolean527) {
			this.aBoolean527 = false;
			this.method21175();
		}
	}

	@OriginalMember(owner = "client!afa", name = "hg", descriptor = "(IIII)V")
	@Override
	public final void method20878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass108_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass108_6.method24036();
			local10 = this.aClass108_6.method24037();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20877();
			return;
		}
		this.anInt2979 = arg0 >= 0 ? arg0 : 0;
		this.anInt2957 = arg2 <= local6 ? arg2 : local6;
		this.anInt2995 = arg1 >= 0 ? arg1 : 0;
		this.anInt2964 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "hb", descriptor = "(IIII)V")
	@Override
	public final void method20875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass108_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass108_6.method24036();
			local10 = this.aClass108_6.method24037();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2979 < local21) {
			this.anInt2979 = local21;
			local43 = true;
		}
		if (this.anInt2957 > local28) {
			this.anInt2957 = local28;
			local43 = true;
		}
		if (this.anInt2995 < local34) {
			this.anInt2995 = local34;
			local43 = true;
		}
		if (this.anInt2964 > local41) {
			this.anInt2964 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kr", descriptor = "(II)I")
	@Override
	public final int method20937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "hi", descriptor = "([I)V")
	@Override
	public final void method20881(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2979;
		arg0[1] = this.anInt2995;
		arg0[2] = this.anInt2957;
		arg0[3] = this.anInt2964;
	}

	@OriginalMember(owner = "client!afa", name = "xv", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	public abstract void method21268(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2);

	@OriginalMember(owner = "client!afa", name = "if", descriptor = "(IIIIII)V")
	@Override
	public final void method20692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class102_Sub1_Sub1) {
			local3 = -1;
		}
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(false);
		}
		this.method20727(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20727(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20727(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20727(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "yo", descriptor = "()V")
	final void method21269() {
		this.anInterface38_16 = this.method21239(false);
		@Pc(6) short local6 = 160;
		this.anInterface38_16.method29327(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface38_16.method29383(0, this.aByteBuffer7.position(), this.aLong168);
		this.aClass135_20 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3, Class400.aClass400_1, Class400.aClass400_1 }) });
	}

	@OriginalMember(owner = "client!afa", name = "io", descriptor = "(IIIIII)V")
	@Override
	public final void method20888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(false);
		}
		if (this.aBoolean515) {
			this.method20762(false);
			this.aClass99_Sub1_6.method18229(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20762(true);
		} else {
			this.aClass99_Sub1_6.method18229(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ss", descriptor = "(II)V")
	final void method21270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2989 = arg0;
		this.anInt2974 = arg1;
		this.method21369();
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "id", descriptor = "(IIIII)V")
	@Override
	final void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afa", name = "aag", descriptor = "()V")
	final void method21271() {
		if (this.aClass394_3 == Class394.aClass394_4) {
			return;
		}
		@Pc(6) Class394 local6 = this.aClass394_3;
		this.aClass394_3 = Class394.aClass394_4;
		if (local6 == Class394.aClass394_6) {
			this.method21527();
		}
		this.method21187();
		this.aClass487_85 = this.aClass487_82;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afa", name = "ip", descriptor = "(IIIII)V")
	@Override
	final void method21084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afa", name = "ir", descriptor = "(IIIII)V")
	@Override
	final void method21003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afa", name = "cn", descriptor = "(IIIIII)I")
	@Override
	public final int method20872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg0 + this.aClass487_88.aFloatArray114[6] * (float) arg1 + this.aClass487_88.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg3 + this.aClass487_88.aFloatArray114[6] * (float) arg4 + this.aClass487_88.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg0 + this.aClass487_88.aFloatArray114[7] * (float) arg1 + this.aClass487_88.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg3 + this.aClass487_88.aFloatArray114[7] * (float) arg4 + this.aClass487_88.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg0 + this.aClass487_88.aFloatArray114[4] * (float) arg1 + this.aClass487_88.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg3 + this.aClass487_88.aFloatArray114[4] * (float) arg4 + this.aClass487_88.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg0 + this.aClass487_88.aFloatArray114[5] * (float) arg1 + this.aClass487_88.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg3 + this.aClass487_88.aFloatArray114[5] * (float) arg4 + this.aClass487_88.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "iq", descriptor = "(IIIII)V")
	@Override
	final void method20895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "kx", descriptor = "(II)I")
	@Override
	public final int method20940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "ib", descriptor = "(IIIII)V")
	@Override
	final void method20781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "zi", descriptor = "()Lclient!pm;")
	final Class487 method21272() {
		return this.aClass487_89;
	}

	@OriginalMember(owner = "client!afa", name = "iw", descriptor = "(IIIIII)V")
	@Override
	public final void method20899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20731(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afa", name = "iv", descriptor = "(IIIIII)V")
	@Override
	public final void method20900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20731(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afa", name = "cp", descriptor = "()V")
	@Override
	public final void method20782() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29022();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aco", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	abstract Interface34 method21273(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afa", name = "abg", descriptor = "()V")
	abstract void method21274();

	@OriginalMember(owner = "client!afa", name = "is", descriptor = "(IIIIIILclient!cg;IIIII)V")
	@Override
	public final void method20904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afa", name = "ju", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class99 method20863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "im", descriptor = "(IIIIIII)V")
	@Override
	public final void method20718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = (int) ((float) arg0 + 1.0F);
		@Pc(11) int local11 = (int) ((float) arg1 + 1.0F);
		@Pc(17) int local17 = (int) ((float) arg2 + 1.0F);
		@Pc(23) int local23 = (int) ((float) arg3 + 1.0F);
		@Pc(28) float local28 = (float) (local17 - local5);
		@Pc(33) float local33 = (float) (local23 - local11);
		@Pc(46) float local46 = 1.0F / (float) Math.sqrt((double) (local28 * local28 + local33 * local33));
		@Pc(50) float local50 = local28 * local46;
		@Pc(54) float local54 = local33 * local46;
		@Pc(60) int local60 = (int) ((float) local5 - local50);
		@Pc(66) int local66 = (int) ((float) local11 - local54);
		@Pc(69) float local69 = -local54;
		@Pc(78) float local78 = local69 * 0.5F * (float) arg5;
		@Pc(85) float local85 = local50 * 0.5F * (float) arg5;
		this.aClass99_Sub1_6.method18275((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afa", name = "ij", descriptor = "(IIIIII)I")
	@Override
	public final int method20907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg0 + this.aClass487_88.aFloatArray114[6] * (float) arg1 + this.aClass487_88.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg3 + this.aClass487_88.aFloatArray114[6] * (float) arg4 + this.aClass487_88.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg0 + this.aClass487_88.aFloatArray114[7] * (float) arg1 + this.aClass487_88.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg3 + this.aClass487_88.aFloatArray114[7] * (float) arg4 + this.aClass487_88.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg0 + this.aClass487_88.aFloatArray114[4] * (float) arg1 + this.aClass487_88.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg3 + this.aClass487_88.aFloatArray114[4] * (float) arg4 + this.aClass487_88.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg0 + this.aClass487_88.aFloatArray114[5] * (float) arg1 + this.aClass487_88.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg3 + this.aClass487_88.aFloatArray114[5] * (float) arg4 + this.aClass487_88.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "iz", descriptor = "(IIIIII)I")
	@Override
	public final int method20908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg0 + this.aClass487_88.aFloatArray114[6] * (float) arg1 + this.aClass487_88.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg3 + this.aClass487_88.aFloatArray114[6] * (float) arg4 + this.aClass487_88.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg0 + this.aClass487_88.aFloatArray114[7] * (float) arg1 + this.aClass487_88.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg3 + this.aClass487_88.aFloatArray114[7] * (float) arg4 + this.aClass487_88.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg0 + this.aClass487_88.aFloatArray114[4] * (float) arg1 + this.aClass487_88.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg3 + this.aClass487_88.aFloatArray114[4] * (float) arg4 + this.aClass487_88.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg0 + this.aClass487_88.aFloatArray114[5] * (float) arg1 + this.aClass487_88.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg3 + this.aClass487_88.aFloatArray114[5] * (float) arg4 + this.aClass487_88.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "jd", descriptor = "(IIIIII)I")
	@Override
	public final int method20909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg0 + this.aClass487_88.aFloatArray114[6] * (float) arg1 + this.aClass487_88.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg3 + this.aClass487_88.aFloatArray114[6] * (float) arg4 + this.aClass487_88.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg0 + this.aClass487_88.aFloatArray114[7] * (float) arg1 + this.aClass487_88.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg3 + this.aClass487_88.aFloatArray114[7] * (float) arg4 + this.aClass487_88.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg0 + this.aClass487_88.aFloatArray114[4] * (float) arg1 + this.aClass487_88.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg3 + this.aClass487_88.aFloatArray114[4] * (float) arg4 + this.aClass487_88.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg0 + this.aClass487_88.aFloatArray114[5] * (float) arg1 + this.aClass487_88.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg3 + this.aClass487_88.aFloatArray114[5] * (float) arg4 + this.aClass487_88.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "jv", descriptor = "(IIIIII)I")
	@Override
	public final int method20965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg0 + this.aClass487_88.aFloatArray114[6] * (float) arg1 + this.aClass487_88.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * (float) arg3 + this.aClass487_88.aFloatArray114[6] * (float) arg4 + this.aClass487_88.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg0 + this.aClass487_88.aFloatArray114[7] * (float) arg1 + this.aClass487_88.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * (float) arg3 + this.aClass487_88.aFloatArray114[7] * (float) arg4 + this.aClass487_88.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg0 + this.aClass487_88.aFloatArray114[4] * (float) arg1 + this.aClass487_88.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * (float) arg3 + this.aClass487_88.aFloatArray114[4] * (float) arg4 + this.aClass487_88.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg0 + this.aClass487_88.aFloatArray114[5] * (float) arg1 + this.aClass487_88.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * (float) arg3 + this.aClass487_88.aFloatArray114[5] * (float) arg4 + this.aClass487_88.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "yy", descriptor = "()V")
	final void method21275() {
		this.method21461();
	}

	@OriginalMember(owner = "client!afa", name = "fh", descriptor = "()Z")
	@Override
	public final boolean method20819() {
		return this.aBoolean531;
	}

	@OriginalMember(owner = "client!afa", name = "bi", descriptor = "(IIIII)V")
	@Override
	final void method20711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afa", name = "jp", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	@Override
	public final Class104 method20934(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2) {
		return new Class104_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "ji", descriptor = "(ILclient!cg;II)V")
	@Override
	public final void method20932(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20762(false);
		this.aClass99_Sub1_5.method18279(0.0F, 0.0F, (float) this.method20677(1860497252).method24036(), 0.0F, 0.0F, (float) this.method20677(1408353042).method24037(), 0, arg1, arg2, arg3);
		this.method20762(true);
	}

	@OriginalMember(owner = "client!afa", name = "ch", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	@Override
	final boolean method20734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5) {
		@Pc(2) Class487 local2 = this.aClass487_80;
		local2.method30080(arg4);
		local2.method30078(this.aClass487_88);
		return arg5.method29859(arg0, arg1, arg2, arg3, local2, this.aFloat203, this.aFloat201, this.aFloat213, this.aFloat204);
	}

	@OriginalMember(owner = "client!afa", name = "jy", descriptor = "(I)Lclient!akl;")
	@Override
	public final Class80_Sub22 method20917(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub1 local4 = new Class80_Sub22_Sub1(arg0);
		this.aClass8_40.method232(local4, 713841591);
		return local4;
	}

	@OriginalMember(owner = "client!afa", name = "acm", descriptor = "(I)V")
	public final void method21276(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "jm", descriptor = "(Lclient!akl;)V")
	@Override
	public final void method20919(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap4 = ((Class80_Sub22_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!afa", name = "jz", descriptor = "(Lclient!akl;)V")
	@Override
	public final void method20920(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap4 = ((Class80_Sub22_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!afa", name = "jn", descriptor = "(Lclient!akl;)V")
	@Override
	public final void method20921(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap4 = ((Class80_Sub22_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!afa", name = "jo", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class99 method20961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "aby", descriptor = "()V")
	abstract void method21277();

	@OriginalMember(owner = "client!afa", name = "jq", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class99 method20924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jt", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public final Class99 method20981(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class99_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "ef", descriptor = "(ILclient!dp;)V")
	@Override
	public final void method20868(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		if (!this.aBoolean524) {
			throw new RuntimeException("");
		}
		this.anInt3002 = arg0;
		this.aClass229_6 = arg1;
		if (this.aBoolean525) {
			this.aClass131Array3[3].method20439();
			this.aClass131Array3[3].method20451();
		}
	}

	@OriginalMember(owner = "client!afa", name = "js", descriptor = "(Lclient!da;Z)Lclient!cm;")
	@Override
	public final Class99 method20927(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class99 local21;
		if (arg0.method7119() == 0 || arg0.method7127() == 0) {
			local21 = this.method20741(new int[] { 0 }, 0, 1, 1, 1, -1657536790);
		} else {
			@Pc(9) int[] local9 = arg0.method7117(false);
			local21 = this.method20741(local9, 0, arg0.method7119(), arg0.method7119(), arg0.method7127(), -1657536790);
		}
		local21.method18216(arg0.method7121(), arg0.method7123(), arg0.method7122(), arg0.method7148());
		return local21;
	}

	@OriginalMember(owner = "client!afa", name = "jb", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public final Class98 method20833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub3.method2709(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jg", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public final Class98 method20929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub3.method2709(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jf", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public final Class98 method20930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub3.method2709(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "ja", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public final Class98 method20931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub3.method2709(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "bq", descriptor = "(IIIIII)V")
	@Override
	public final void method20727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20731(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afa", name = "hv", descriptor = "(Z)V")
	@Override
	public final void method20866(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.method21192();
	}

	@OriginalMember(owner = "client!afa", name = "acd", descriptor = "()V")
	public abstract void method21278();

	@OriginalMember(owner = "client!afa", name = "adc", descriptor = "(I)V")
	public final void method21279(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2949) {
			this.anInt2949 = arg0;
			this.method21229();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kv", descriptor = "(Lclient!dt;IIII)Lclient!dn;")
	@Override
	public final Class105 method20936(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class105_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "hz", descriptor = "([I)V")
	@Override
	public final void method20882(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2979;
		arg0[1] = this.anInt2995;
		arg0[2] = this.anInt2957;
		arg0[3] = this.anInt2964;
	}

	@OriginalMember(owner = "client!afa", name = "ki", descriptor = "(II)I")
	@Override
	public final int method20938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "ke", descriptor = "(II)I")
	@Override
	public final int method20939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "aau", descriptor = "()V")
	final void method21280() {
		this.aClass487_86.method30075(this.aClass487_85);
		this.method21243(this.aClass487_86);
		this.aFloat202 = (this.aClass487_86.aFloatArray114[14] - this.aClass487_86.aFloatArray114[15]) / (this.aClass487_86.aFloatArray114[11] - this.aClass487_86.aFloatArray114[10]);
		this.aFloat215 = -this.aClass487_86.aFloatArray114[14] / this.aClass487_86.aFloatArray114[10];
		this.method21242();
	}

	@OriginalMember(owner = "client!afa", name = "fx", descriptor = "()Z")
	@Override
	public final boolean method20812() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "kp", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20973() {
		return this.aClass487_90;
	}

	@OriginalMember(owner = "client!afa", name = "kk", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20943() {
		return this.aClass487_90;
	}

	@OriginalMember(owner = "client!afa", name = "kw", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20944() {
		return this.aClass487_90;
	}

	@OriginalMember(owner = "client!afa", name = "acf", descriptor = "()I")
	public final int method21281() {
		return this.anInt2983;
	}

	@OriginalMember(owner = "client!afa", name = "kb", descriptor = "()Lclient!ov;")
	@Override
	public final Class471 method20946() {
		return this.aClass471_36;
	}

	@OriginalMember(owner = "client!afa", name = "aaa", descriptor = "()V")
	final void method21282() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			return;
		}
		this.aClass394_3 = Class394.aClass394_6;
		this.method21527();
		this.method21188();
		this.aClass487_85 = this.aClass487_83;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "vt", descriptor = "()Lclient!dp;")
	final Class229 method21283() {
		return this.aClass229_6;
	}

	@OriginalMember(owner = "client!afa", name = "lw", descriptor = "(Lclient!df;)V")
	@Override
	public final void method20983(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_3 = (Class106_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "cr", descriptor = "(Lclient!da;Z)Lclient!cm;")
	@Override
	public final Class99 method20906(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class99 local21;
		if (arg0.method7119() == 0 || arg0.method7127() == 0) {
			local21 = this.method20741(new int[] { 0 }, 0, 1, 1, 1, -1657536790);
		} else {
			@Pc(9) int[] local9 = arg0.method7117(false);
			local21 = this.method20741(local9, 0, arg0.method7119(), arg0.method7119(), arg0.method7127(), -1657536790);
		}
		local21.method18216(arg0.method7121(), arg0.method7123(), arg0.method7122(), arg0.method7148());
		return local21;
	}

	@OriginalMember(owner = "client!afa", name = "ka", descriptor = "(I[Lclient!akb;)V")
	@Override
	public final void method20923(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass80_Sub12Array19[local1] = arg1[local1];
		}
		this.anInt2978 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "kd", descriptor = "(I[Lclient!akb;)V")
	@Override
	public final void method20954(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass80_Sub12Array19[local1] = arg1[local1];
		}
		this.anInt2978 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "kn", descriptor = "(Lclient!db;)V")
	@Override
	public final void method20955(@OriginalArg(0) Class221 arg0) {
		this.aClass402_3.method28889(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "aft", descriptor = "(ILclient!lx;)V")
	public abstract void method21284(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1);

	@OriginalMember(owner = "client!afa", name = "km", descriptor = "(Lclient!db;)V")
	@Override
	public final void method20957(@OriginalArg(0) Class221 arg0) {
		this.aClass402_3.method28889(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "ko", descriptor = "(Lclient!db;)V")
	@Override
	public final void method20958(@OriginalArg(0) Class221 arg0) {
		this.aClass402_3.method28889(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "ky", descriptor = "(Lclient!ov;)V")
	@Override
	public final void method21063(@OriginalArg(0) Class471 arg0) {
		this.aClass471_39 = arg0;
		this.aClass487_75.method30080(this.aClass471_39);
		this.aClass487_77.method30075(this.aClass487_75);
		this.aClass487_77.method30069();
		this.aClass471_38.method29760(arg0);
		this.aClass471_38.method29768();
		this.aClass487_76.method30080(this.aClass471_38);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21527();
		}
	}

	@OriginalMember(owner = "client!afa", name = "uh", descriptor = "()V")
	abstract void method21285();

	@OriginalMember(owner = "client!afa", name = "lt", descriptor = "(Lclient!ov;)V")
	@Override
	public final void method20742(@OriginalArg(0) Class471 arg0) {
		this.aClass471_39 = arg0;
		this.aClass487_75.method30080(this.aClass471_39);
		this.aClass487_77.method30075(this.aClass487_75);
		this.aClass487_77.method30069();
		this.aClass471_38.method29760(arg0);
		this.aClass471_38.method29768();
		this.aClass487_76.method30080(this.aClass471_38);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21527();
		}
	}

	@OriginalMember(owner = "client!afa", name = "lv", descriptor = "(Lclient!ov;)V")
	@Override
	public final void method20962(@OriginalArg(0) Class471 arg0) {
		this.aClass471_39 = arg0;
		this.aClass487_75.method30080(this.aClass471_39);
		this.aClass487_77.method30075(this.aClass487_75);
		this.aClass487_77.method30069();
		this.aClass471_38.method29760(arg0);
		this.aClass471_38.method29768();
		this.aClass487_76.method30080(this.aClass471_38);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21527();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kg", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20945() {
		return this.aClass487_90;
	}

	@OriginalMember(owner = "client!afa", name = "agu", descriptor = "([Lclient!lf;)Lclient!ld;")
	abstract Class135 method21286(@OriginalArg(0) Class397[] arg0);

	@OriginalMember(owner = "client!afa", name = "lh", descriptor = "()Lclient!ov;")
	@Override
	public final Class471 method20655() {
		return this.aClass471_39;
	}

	@OriginalMember(owner = "client!afa", name = "lm", descriptor = "(Lclient!pm;)V")
	@Override
	public final void method20953(@OriginalArg(0) Class487 arg0) {
		this.aClass487_83.method30075(arg0);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ls", descriptor = "(Lclient!pm;)V")
	@Override
	public final void method20792(@OriginalArg(0) Class487 arg0) {
		this.aClass487_83.method30075(arg0);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "rw", descriptor = "()Z")
	public abstract boolean method21287();

	@OriginalMember(owner = "client!afa", name = "ly", descriptor = "(IFFFFF)V")
	@Override
	public final void method20668(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2976 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat214 != local11 || this.aFloat216 != local15) {
			this.anInt2976 = arg0;
			this.aFloat214 = local11;
			this.aFloat216 = local15;
			if (local7) {
				this.aFloat208 = (float) (this.anInt2976 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2976 & 0xFF00) / 65280.0F;
				this.aFloat210 = (float) (this.anInt2976 & 0xFF) / 255.0F;
				this.method21197();
			}
			this.method21247();
		}
		if (this.aFloatArray69[0] != arg3 || this.aFloatArray69[1] != arg4 || this.aFloatArray69[2] != arg5) {
			this.aFloatArray69[0] = arg3;
			this.aFloatArray69[1] = arg4;
			this.aFloatArray69[2] = arg5;
			this.aFloatArray65[0] = -arg3;
			this.aFloatArray65[1] = -arg4;
			this.aFloatArray65[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray68[0] = arg3 * local140;
			this.aFloatArray68[1] = arg4 * local140;
			this.aFloatArray68[2] = arg5 * local140;
			this.aFloatArray67[0] = -this.aFloatArray68[0];
			this.aFloatArray67[1] = -this.aFloatArray68[1];
			this.aFloatArray67[2] = -this.aFloatArray68[2];
			this.method21199();
			this.anInt2981 = (int) (arg3 * 256.0F / arg4);
			this.anInt2982 = (int) (arg5 * 256.0F / arg4);
		}
		this.method21285();
	}

	@OriginalMember(owner = "client!afa", name = "lg", descriptor = "(IFFFFF)V")
	@Override
	public final void method20970(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2976 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat214 != local11 || this.aFloat216 != local15) {
			this.anInt2976 = arg0;
			this.aFloat214 = local11;
			this.aFloat216 = local15;
			if (local7) {
				this.aFloat208 = (float) (this.anInt2976 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2976 & 0xFF00) / 65280.0F;
				this.aFloat210 = (float) (this.anInt2976 & 0xFF) / 255.0F;
				this.method21197();
			}
			this.method21247();
		}
		if (this.aFloatArray69[0] != arg3 || this.aFloatArray69[1] != arg4 || this.aFloatArray69[2] != arg5) {
			this.aFloatArray69[0] = arg3;
			this.aFloatArray69[1] = arg4;
			this.aFloatArray69[2] = arg5;
			this.aFloatArray65[0] = -arg3;
			this.aFloatArray65[1] = -arg4;
			this.aFloatArray65[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray68[0] = arg3 * local140;
			this.aFloatArray68[1] = arg4 * local140;
			this.aFloatArray68[2] = arg5 * local140;
			this.aFloatArray67[0] = -this.aFloatArray68[0];
			this.aFloatArray67[1] = -this.aFloatArray68[1];
			this.aFloatArray67[2] = -this.aFloatArray68[2];
			this.method21199();
			this.anInt2981 = (int) (arg3 * 256.0F / arg4);
			this.anInt2982 = (int) (arg5 * 256.0F / arg4);
		}
		this.method21285();
	}

	@OriginalMember(owner = "client!afa", name = "afg", descriptor = "()V")
	abstract void method21288();

	@OriginalMember(owner = "client!afa", name = "lz", descriptor = "(I)V")
	@Override
	public final void method21051(@OriginalArg(0) int arg0) {
		this.anInt2980 = 0;
		while (arg0 > 1) {
			this.anInt2980++;
			arg0 >>= 0x1;
		}
		this.anInt2962 = 0x1 << this.anInt2980;
	}

	@OriginalMember(owner = "client!afa", name = "ld", descriptor = "(I)V")
	@Override
	public final void method20948(@OriginalArg(0) int arg0) {
		this.anInt2980 = 0;
		while (arg0 > 1) {
			this.anInt2980++;
			arg0 >>= 0x1;
		}
		this.anInt2962 = 0x1 << this.anInt2980;
	}

	@OriginalMember(owner = "client!afa", name = "li", descriptor = "(III)V")
	@Override
	public final void method20754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2965 == arg0 && this.anInt2985 == arg1 && this.anInt2990 == arg2) {
			return;
		}
		this.anInt2965 = arg0;
		this.anInt2985 = arg1;
		this.anInt2990 = arg2;
		this.method21242();
		this.method21244();
	}

	@OriginalMember(owner = "client!afa", name = "wi", descriptor = "()V")
	final void method21289() {
		@Pc(4) ArrayList local4 = this.aClass76_3.method1349(-214237508);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30837();
		}
	}

	@OriginalMember(owner = "client!afa", name = "abw", descriptor = "()V")
	final void method21290() {
		if (this.method21245()) {
			this.method21157();
		}
		this.anInt2977 = this.anInt2978;
	}

	@OriginalMember(owner = "client!afa", name = "adz", descriptor = "()Lclient!pm;")
	final Class487 method21291() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "la", descriptor = "(Lclient!df;)V")
	@Override
	public final void method20971(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_3 = (Class106_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "rq", descriptor = "(I)V")
	public final void method21292(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2956) {
			this.anInt2956 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2956);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong168 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ih", descriptor = "(IIIIII)V")
	@Override
	public final void method20855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class102_Sub1_Sub1) {
			local3 = -1;
		}
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(false);
		}
		this.method20727(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20727(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20727(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20727(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "le", descriptor = "(IIII)V")
	@Override
	public final void method20984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass401_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass136Array3.length; local5++) {
			if (this.aClass136Array3[local5] != null && this.aClass136Array3[local5].method11193() && !this.aClass136Array3[local5].method11195()) {
				if (!this.aClass401_3.method28852(arg0, arg1, arg2, arg3)) {
					this.aClass401_3.method28855();
					this.aClass401_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "pk", descriptor = "()Z")
	@Override
	public final boolean method20788() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "lf", descriptor = "(II)V")
	@Override
	public final void method20974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28853(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "mc", descriptor = "(II)V")
	@Override
	public final void method21002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28853(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "me", descriptor = "()Z")
	@Override
	public final boolean method20959() {
		return this.aClass401_3 != null && this.aClass401_3.aBoolean854;
	}

	@OriginalMember(owner = "client!afa", name = "mp", descriptor = "()Z")
	@Override
	public final boolean method20989() {
		return this.aClass401_3 != null && this.aClass401_3.aBoolean854;
	}

	@OriginalMember(owner = "client!afa", name = "mj", descriptor = "()Z")
	@Override
	public final boolean method21058() {
		return this.aClass136Array3[1] != null && this.aClass136Array3[1].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "my", descriptor = "()Z")
	@Override
	public final boolean method20991() {
		return this.aClass136Array3[1] != null && this.aClass136Array3[1].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "mh", descriptor = "()Z")
	@Override
	public final boolean method20925() {
		return this.aClass136Array3[1] != null && this.aClass136Array3[1].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "mo", descriptor = "()Z")
	@Override
	public final boolean method20993() {
		return this.aClass136Array3[1] != null && this.aClass136Array3[1].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "jx", descriptor = "(I)Lclient!akl;")
	@Override
	public final Class80_Sub22 method20916(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub1 local4 = new Class80_Sub22_Sub1(arg0);
		this.aClass8_40.method232(local4, 1996321007);
		return local4;
	}

	@OriginalMember(owner = "client!afa", name = "afh", descriptor = "()V")
	final void method21293() {
		if (this.aClass131_3 != null) {
			this.aClass131_3.method20451();
		}
		this.method21295();
	}

	@OriginalMember(owner = "client!afa", name = "ma", descriptor = "(FFFFF)V")
	@Override
	public final void method20996(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class136_Sub1.aFloat121 = arg0;
		Class136_Sub1.aFloat122 = arg1;
		Class136_Sub1.aFloat123 = arg2;
		Class136_Sub1.aFloat124 = arg3;
		Class136_Sub1.aFloat125 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "mf", descriptor = "([I)Lclient!cz;")
	@Override
	public final Class97 method20672(@OriginalArg(0) int[] arg0) {
		return new Class97_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "md", descriptor = "([I)Lclient!cz;")
	@Override
	public final Class97 method20998(@OriginalArg(0) int[] arg0) {
		return new Class97_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "dl", descriptor = "(Z)V")
	@Override
	public final void method20762(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.method21192();
	}

	@OriginalMember(owner = "client!afa", name = "mg", descriptor = "()Z")
	@Override
	public final boolean method21000() {
		return this.aClass136Array3[2] != null && this.aClass136Array3[2].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "fm", descriptor = "()Z")
	@Override
	public final boolean method20997() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ie", descriptor = "(IIIIII)V")
	@Override
	public final void method20889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20731(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afa", name = "ml", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public final void method21120(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		Class136_Sub3.aClass97_Sub1Array1[0] = (Class97_Sub1) arg0;
		Class136_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[1] = (Class97_Sub1) arg2;
		Class136_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class136_Sub3.aClass97_Sub1Array1[2] = (Class97_Sub1) arg4;
		Class136_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class136_Sub3.anInt1300 = local1;
		Class136_Sub3.aFloat131 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afa", name = "jc", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	@Override
	public final Class104 method20810(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2) {
		return new Class104_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "mt", descriptor = "()V")
	@Override
	public final void method21005() {
		if (this.aClass136Array3[3] != null && this.aClass136Array3[3].method11193()) {
			this.aClass401_3.method28862(this.aClass136Array3[3]);
			this.aClass395_3.method28696();
		}
	}

	@OriginalMember(owner = "client!afa", name = "mx", descriptor = "()V")
	@Override
	public final void method21006() {
		if (this.aClass136Array3[3] != null && this.aClass136Array3[3].method11193()) {
			this.aClass401_3.method28862(this.aClass136Array3[3]);
			this.aClass395_3.method28696();
		}
	}

	@OriginalMember(owner = "client!afa", name = "mr", descriptor = "()Z")
	@Override
	public final boolean method21007() {
		return this.aClass136Array3[3] != null && this.aClass136Array3[3].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "mk", descriptor = "(FFFFFF)V")
	@Override
	final void method20886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class136_Sub2.aFloat127 = arg0;
		Class136_Sub2.aFloat129 = arg1;
		Class136_Sub2.aFloat126 = arg2;
		Class136_Sub2.aFloat128 = arg5;
	}

	@OriginalMember(owner = "client!afa", name = "ms", descriptor = "(FFFFFF)V")
	@Override
	final void method21009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class136_Sub2.aFloat127 = arg0;
		Class136_Sub2.aFloat129 = arg1;
		Class136_Sub2.aFloat126 = arg2;
		Class136_Sub2.aFloat128 = arg5;
	}

	@OriginalMember(owner = "client!afa", name = "mb", descriptor = "(ILclient!dp;)V")
	@Override
	public final void method21010(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		if (!this.aBoolean524) {
			throw new RuntimeException("");
		}
		this.anInt3002 = arg0;
		this.aClass229_6 = arg1;
		if (this.aBoolean525) {
			this.aClass131Array3[3].method20439();
			this.aClass131Array3[3].method20451();
		}
	}

	@OriginalMember(owner = "client!afa", name = "cv", descriptor = "(IIIIIILclient!cg;IIIII)V")
	@Override
	public final void method20979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afa", name = "mi", descriptor = "()V")
	@Override
	public final void method21012() {
		this.aBoolean524 = false;
	}

	@OriginalMember(owner = "client!afa", name = "nv", descriptor = "()V")
	@Override
	public final void method21013() {
		this.aBoolean524 = false;
	}

	@OriginalMember(owner = "client!afa", name = "nz", descriptor = "()V")
	@Override
	public final void method21014() {
		this.aBoolean524 = false;
	}

	@OriginalMember(owner = "client!afa", name = "nk", descriptor = "()V")
	@Override
	public final void method21015() {
		this.aBoolean524 = false;
	}

	@OriginalMember(owner = "client!afa", name = "ne", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public final void method21016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afa", name = "nl", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public final void method21057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afa", name = "no", descriptor = "(FFF[F)V")
	@Override
	public final void method21096(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat203 + this.aFloat213 * local59 / local29;
		arg3[1] = this.aFloat201 + this.aFloat204 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "sr", descriptor = "()V")
	void method21294() {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28855();
		}
		if (this.anInterface38_16 != null) {
			this.anInterface38_16.method30837();
		}
		if (this.anInterface38_15 != null) {
			this.anInterface38_15.method30837();
		}
		if (this.anInterface38_17 != null) {
			this.anInterface38_17.method30837();
		}
		if (this.aClass429_3 != null) {
			this.aClass429_3.method29065();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass105_Sub3Array6[local31] != null) {
				this.aClass105_Sub3Array6[local31].method7558();
			}
		}
		if (this.aClass402_3 != null) {
			this.aClass402_3.method28886();
		}
		if (this.anInterface44_4 != null) {
			this.anInterface44_4.method30837();
		}
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29038();
			this.aClass421_3 = null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "vl", descriptor = "()V")
	abstract void method21295();

	@OriginalMember(owner = "client!afa", name = "nw", descriptor = "(FFF[F)V")
	@Override
	public final void method21021(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat203 + this.aFloat213 * local59 / local29;
		arg3[1] = this.aFloat201 + this.aFloat204 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "vz", descriptor = "(Lclient!mo;)V")
	public final void method21296(@OriginalArg(0) Class422 arg0) {
		this.aClass422Array3[this.anInt2983] = arg0;
		this.method21228();
	}

	@OriginalMember(owner = "client!afa", name = "nq", descriptor = "(FFF[F)V")
	@Override
	public final void method21023(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * arg0 + this.aClass487_88.aFloatArray114[6] * arg1 + this.aClass487_88.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat203 + this.aFloat213 * local115 / local59;
			arg3[1] = this.aFloat201 + this.aFloat204 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "nh", descriptor = "(FFF[F)V")
	@Override
	public final void method21024(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * arg0 + this.aClass487_88.aFloatArray114[6] * arg1 + this.aClass487_88.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat203 + this.aFloat213 * local115 / local59;
			arg3[1] = this.aFloat201 + this.aFloat204 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ni", descriptor = "()Z")
	@Override
	public final boolean method21032() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ux", descriptor = "(I)V")
	public final void method21297(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "xq", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21298(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "nf", descriptor = "()Z")
	@Override
	public final boolean method21056() {
		return this.aClass136Array3[3] != null;
	}

	@OriginalMember(owner = "client!afa", name = "nx", descriptor = "()Z")
	@Override
	public final boolean method21036() {
		return this.aClass136Array3[3] != null;
	}

	@OriginalMember(owner = "client!afa", name = "nu", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class99 method21037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class99_Sub1 local8 = new Class99_Sub1(this, arg2, arg3, arg4, false);
		local8.method18223(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afa", name = "nm", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class99 method21038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class99_Sub1 local8 = new Class99_Sub1(this, arg2, arg3, arg4, false);
		local8.method18223(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afa", name = "abr", descriptor = "()V")
	abstract void method21299();

	@OriginalMember(owner = "client!afa", name = "nb", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class99 method21040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class99_Sub1 local8 = new Class99_Sub1(this, arg2, arg3, arg4, false);
		local8.method18223(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afa", name = "agy", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	abstract void method21300(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afa", name = "hx", descriptor = "()V")
	@Override
	public final void method20870() {
		this.anInt2967 = 0;
		this.anInt2968 = 0;
		this.anInt2969 = this.aClass108_6.method24036();
		this.anInt2970 = this.aClass108_6.method24037();
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "ol", descriptor = "(ILclient!dp;)V")
	@Override
	public final void method21111(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		this.anInt3002 = arg0;
		this.aClass229_6 = arg1;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!afa", name = "lo", descriptor = "(Lclient!df;)V")
	@Override
	public final void method20732(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_3 = (Class106_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "od", descriptor = "(F)V")
	@Override
	public final void method21045(@OriginalArg(0) float arg0) {
		if (this.aFloat212 != arg0) {
			this.aFloat212 = arg0;
			this.method21197();
			this.method21285();
		}
	}

	@OriginalMember(owner = "client!afa", name = "br", descriptor = "()V")
	@Override
	public final void method20705() {
		this.anInt2967 = 0;
		this.anInt2968 = 0;
		this.anInt2969 = this.aClass108_6.method24036();
		this.anInt2970 = this.aClass108_6.method24037();
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "xl", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	public abstract void method21301(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2);

	@OriginalMember(owner = "client!afa", name = "yj", descriptor = "()V")
	public final void method21302() {
		this.anInterface39Array3 = new Interface39[this.anInt2998];
		this.aClass487Array6 = new Class487[this.anInt2998];
		this.aClass422Array3 = new Class422[this.anInt2998];
		this.aClass412Array5 = new Class412[this.anInt2998];
		this.aClass412Array6 = new Class412[this.anInt2998];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2998; local26++) {
			this.aClass412Array6[local26] = Class412.aClass412_1;
			this.aClass412Array5[local26] = Class412.aClass412_1;
			this.aClass422Array3[local26] = Class422.aClass422_2;
			this.aClass487Array6[local26] = new Class487();
		}
		this.aClass80_Sub12Array19 = new Class80_Sub12[this.anInt2999 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface34_23 = this.method21304(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface34_24 = this.method21304(1, 1, false, local68, 0, 0);
		this.method20737(new Class80_Sub22_Sub1(262144));
		this.aClass135_18 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1 }) });
		this.aClass135_22 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3 }) });
		this.aClass135_21 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11), new Class397(Class400.aClass400_3), new Class397(Class400.aClass400_1), new Class397(Class400.aClass400_2) });
		this.aClass135_19 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11), new Class397(Class400.aClass400_3), new Class397(Class400.aClass400_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass105_Sub3Array5[local205] = new Class105_Sub3(this, 0, 0, false, false);
			this.aClass105_Sub3Array6[local205] = new Class105_Sub3(this, 0, 0, true, true);
		}
		this.method21382();
		this.anInterface44_4 = this.method21246(true);
		this.method21148();
		this.method20877();
		this.method20894();
		this.aClass99_Sub1_6 = new Class99_Sub1(this, this.anInterface34_23);
		this.aClass99_Sub1_5 = new Class99_Sub1(this, this.anInterface34_24);
		this.method20714(3, 0);
	}

	@OriginalMember(owner = "client!afa", name = "oe", descriptor = "()Z")
	@Override
	public final boolean method21049() {
		if (this.aClass136Array3[3] == null || this.aClass136Array3[3].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[3]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "cl", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	@Override
	public final Class104 method20749(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2) {
		return new Class104_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "pw", descriptor = "()I")
	@Override
	public final int method20769() {
		return this.anInt2959 + this.anInt3001 + this.anInt2960;
	}

	@OriginalMember(owner = "client!afa", name = "pj", descriptor = "()I")
	@Override
	public final int method20674() {
		return this.anInt2959 + this.anInt3001 + this.anInt2960;
	}

	@OriginalMember(owner = "client!afa", name = "pm", descriptor = "()Z")
	@Override
	public final boolean method20796() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "afu", descriptor = "(Lclient!md;I)V")
	final void method21303(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1) {
		this.method21250(0, this.anInterface38_16);
		this.method21158(this.aClass135_20);
		this.method21257(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "ds", descriptor = "(IFFFFF)V")
	@Override
	public final void method20765(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2976 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat214 != local11 || this.aFloat216 != local15) {
			this.anInt2976 = arg0;
			this.aFloat214 = local11;
			this.aFloat216 = local15;
			if (local7) {
				this.aFloat208 = (float) (this.anInt2976 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2976 & 0xFF00) / 65280.0F;
				this.aFloat210 = (float) (this.anInt2976 & 0xFF) / 255.0F;
				this.method21197();
			}
			this.method21247();
		}
		if (this.aFloatArray69[0] != arg3 || this.aFloatArray69[1] != arg4 || this.aFloatArray69[2] != arg5) {
			this.aFloatArray69[0] = arg3;
			this.aFloatArray69[1] = arg4;
			this.aFloatArray69[2] = arg5;
			this.aFloatArray65[0] = -arg3;
			this.aFloatArray65[1] = -arg4;
			this.aFloatArray65[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray68[0] = arg3 * local140;
			this.aFloatArray68[1] = arg4 * local140;
			this.aFloatArray68[2] = arg5 * local140;
			this.aFloatArray67[0] = -this.aFloatArray68[0];
			this.aFloatArray67[1] = -this.aFloatArray68[1];
			this.aFloatArray67[2] = -this.aFloatArray68[2];
			this.method21199();
			this.anInt2981 = (int) (arg3 * 256.0F / arg4);
			this.anInt2982 = (int) (arg5 * 256.0F / arg4);
		}
		this.method21285();
	}

	@OriginalMember(owner = "client!afa", name = "uu", descriptor = "(IIZ[III)Lclient!lb;")
	abstract Interface34 method21304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afa", name = "pa", descriptor = "(Z)V")
	@Override
	public final void method20726(@OriginalArg(0) boolean arg0) {
		this.aBoolean510 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "pl", descriptor = "(Z)V")
	@Override
	public final void method21105(@OriginalArg(0) boolean arg0) {
		this.aBoolean510 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "ic", descriptor = "(IIIIIILclient!cg;IIIII)V")
	@Override
	public final void method20736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afa", name = "qf", descriptor = "()V")
	@Override
	public final void method20891() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29022();
		}
	}

	@OriginalMember(owner = "client!afa", name = "qe", descriptor = "()V")
	@Override
	public final void method20975() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29022();
		}
	}

	@OriginalMember(owner = "client!afa", name = "qb", descriptor = "()V")
	@Override
	public final void method21112() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29022();
		}
	}

	@OriginalMember(owner = "client!afa", name = "qv", descriptor = "()V")
	@Override
	public final void method21113() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29019();
		}
	}

	@OriginalMember(owner = "client!afa", name = "qg", descriptor = "()V")
	@Override
	public final void method21073() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29019();
		}
	}

	@OriginalMember(owner = "client!afa", name = "wa", descriptor = "(Lclient!lg;)V")
	public final void method21305(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1358(arg0, anObject7, (byte) 79);
	}

	@OriginalMember(owner = "client!afa", name = "ww", descriptor = "(Lclient!lg;)V")
	public final void method21306(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1358(arg0, anObject7, (byte) 26);
	}

	@OriginalMember(owner = "client!afa", name = "wb", descriptor = "(Lclient!lg;)V")
	public final void method21307(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1348(arg0, 2087657614);
	}

	@OriginalMember(owner = "client!afa", name = "wy", descriptor = "(Lclient!lg;)V")
	public final void method21308(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1348(arg0, 2081292596);
	}

	@OriginalMember(owner = "client!afa", name = "xu", descriptor = "([B)Lclient!hs;")
	final Class324 method21309(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class324(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "nt", descriptor = "(FFF[F)V")
	@Override
	public final void method21110(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat203 + this.aFloat213 * local59 / local29;
		arg3[1] = this.aFloat201 + this.aFloat204 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "wd", descriptor = "()V")
	final void method21310() {
		@Pc(4) ArrayList local4 = this.aClass76_3.method1349(-214237508);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30837();
		}
	}

	@OriginalMember(owner = "client!afa", name = "wx", descriptor = "()V")
	final void method21311() {
		@Pc(4) ArrayList local4 = this.aClass76_3.method1349(-214237508);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30837();
		}
	}

	@OriginalMember(owner = "client!afa", name = "xz", descriptor = "(Z)Z")
	public abstract boolean method21312(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "xa", descriptor = "()Z")
	public abstract boolean method21313();

	@OriginalMember(owner = "client!afa", name = "xe", descriptor = "()Z")
	public abstract boolean method21314();

	@OriginalMember(owner = "client!afa", name = "xx", descriptor = "()Z")
	public abstract boolean method21315();

	@OriginalMember(owner = "client!afa", name = "xm", descriptor = "()Z")
	public abstract boolean method21316();

	@OriginalMember(owner = "client!afa", name = "xb", descriptor = "()Z")
	public abstract boolean method21317();

	@OriginalMember(owner = "client!afa", name = "xd", descriptor = "()Z")
	public abstract boolean method21318();

	@OriginalMember(owner = "client!afa", name = "xw", descriptor = "()Z")
	public abstract boolean method21319();

	@OriginalMember(owner = "client!afa", name = "zu", descriptor = "()V")
	final void method21320() {
		this.aBoolean512 = false;
	}

	@OriginalMember(owner = "client!afa", name = "xh", descriptor = "(Z)Z")
	public abstract boolean method21321(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "rv", descriptor = "(Z)Z")
	public abstract boolean method21322(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "ou", descriptor = "(I)V")
	@Override
	public void method21054(@OriginalArg(0) int arg0) {
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28695();
		}
		this.anInt3000 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!afa", name = "ph", descriptor = "(Z)V")
	@Override
	public final void method21086(@OriginalArg(0) boolean arg0) {
		this.aBoolean510 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "wr", descriptor = "(Z)V")
	abstract void method21323(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "lq", descriptor = "(IIII)V")
	@Override
	public final void method20985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass401_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass136Array3.length; local5++) {
			if (this.aClass136Array3[local5] != null && this.aClass136Array3[local5].method11193() && !this.aClass136Array3[local5].method11195()) {
				if (!this.aClass401_3.method28852(arg0, arg1, arg2, arg3)) {
					this.aClass401_3.method28855();
					this.aClass401_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "xk", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21324(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "xj", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21325(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "xt", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21326(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "aai", descriptor = "()V")
	final void method21327() {
		this.aBoolean513 = false;
		this.method21188();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tv", descriptor = "()Lclient!pm;")
	final Class487 method21328() {
		return this.aClass487_89;
	}

	@OriginalMember(owner = "client!afa", name = "xy", descriptor = "(Ljava/lang/String;)Lclient!hb;")
	public abstract Class113 method21329(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afa", name = "fc", descriptor = "()Z")
	@Override
	public final boolean method20825() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "zs", descriptor = "()Lclient!ml;")
	public final Interface42 method21330() {
		return this.aClass106_Sub2_3 == null ? null : this.aClass106_Sub2_3.method17951();
	}

	@OriginalMember(owner = "client!afa", name = "afk", descriptor = "(ILclient!lx;)V")
	public abstract void method21331(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1);

	@OriginalMember(owner = "client!afa", name = "zy", descriptor = "()Lclient!pm;")
	final Class487 method21332() {
		return this.aClass394_3 == Class394.aClass394_6 ? this.aClass487_75 : aClass487_79;
	}

	@OriginalMember(owner = "client!afa", name = "adv", descriptor = "(Lclient!mo;)V")
	public final void method21335(@OriginalArg(0) Class422 arg0) {
		this.aClass422Array3[this.anInt2983] = arg0;
		this.method21228();
	}

	@OriginalMember(owner = "client!afa", name = "yh", descriptor = "()V")
	public final void method21336() {
		this.anInterface39Array3 = new Interface39[this.anInt2998];
		this.aClass487Array6 = new Class487[this.anInt2998];
		this.aClass422Array3 = new Class422[this.anInt2998];
		this.aClass412Array5 = new Class412[this.anInt2998];
		this.aClass412Array6 = new Class412[this.anInt2998];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2998; local26++) {
			this.aClass412Array6[local26] = Class412.aClass412_1;
			this.aClass412Array5[local26] = Class412.aClass412_1;
			this.aClass422Array3[local26] = Class422.aClass422_2;
			this.aClass487Array6[local26] = new Class487();
		}
		this.aClass80_Sub12Array19 = new Class80_Sub12[this.anInt2999 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface34_23 = this.method21304(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface34_24 = this.method21304(1, 1, false, local68, 0, 0);
		this.method20737(new Class80_Sub22_Sub1(262144));
		this.aClass135_18 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1 }) });
		this.aClass135_22 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3 }) });
		this.aClass135_21 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11), new Class397(Class400.aClass400_3), new Class397(Class400.aClass400_1), new Class397(Class400.aClass400_2) });
		this.aClass135_19 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11), new Class397(Class400.aClass400_3), new Class397(Class400.aClass400_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass105_Sub3Array5[local205] = new Class105_Sub3(this, 0, 0, false, false);
			this.aClass105_Sub3Array6[local205] = new Class105_Sub3(this, 0, 0, true, true);
		}
		this.method21382();
		this.anInterface44_4 = this.method21246(true);
		this.method21148();
		this.method20877();
		this.method20894();
		this.aClass99_Sub1_6 = new Class99_Sub1(this, this.anInterface34_23);
		this.aClass99_Sub1_5 = new Class99_Sub1(this, this.anInterface34_24);
		this.method20714(3, 0);
	}

	@OriginalMember(owner = "client!afa", name = "jr", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	@Override
	public final void method20914(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2) {
		@Pc(2) Class487 local2 = this.aClass487_80;
		local2.method30080(arg0);
		local2.method30078(this.aClass487_88);
		arg1.method26329(arg2, this.aClass487_83, local2, this.aFloat203, this.aFloat201, this.aFloat213, this.aFloat204);
	}

	@OriginalMember(owner = "client!afa", name = "ym", descriptor = "()V")
	final void method21337() {
		this.aClass398_5 = new Class398(this);
		this.aBoolean518 = false;
		try {
			this.aClass119_3 = new Class119_Sub1(this);
			this.aClass122_3 = new Class122_Sub2(this);
			this.aClass124_3 = new Class124_Sub1(this);
			this.aClass127_3 = new Class127_Sub1(this);
			this.aClass131_Sub1_Sub1_5 = new Class131_Sub1_Sub1(this, this.aClass398_5, false);
			this.aClass131_Sub1_Sub1_6 = new Class131_Sub1_Sub1(this, this.aClass398_5, true);
			this.aClass131_Sub1_Sub2_3 = new Class131_Sub1_Sub2(this, this.aClass398_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass119_3 = new Class119_Sub2(this);
			this.aClass122_3 = new Class122_Sub1(this);
			this.aClass124_3 = new Class124_Sub2(this);
			this.aClass127_3 = new Class127_Sub2(this);
			this.aClass131_Sub1_Sub1_5 = null;
			this.aClass131_Sub1_Sub1_6 = null;
			this.aClass131_Sub1_Sub2_3 = null;
			this.aBoolean518 = true;
		}
		if (!this.aBoolean518) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass108_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass108_6.method24036();
				local112 = this.aClass108_6.method24037();
			}
			this.aClass401_3 = new Class401(this, local108, local112);
			this.aClass136Array3[3] = new Class136_Sub2(this);
			this.aClass136Array3[1] = new Class136_Sub1(this);
			this.aClass136Array3[2] = new Class136_Sub3(this);
			if (this.aClass136Array3[3].method11182()) {
				this.aClass401_3.method28848(this.aClass136Array3[3]);
			}
			this.aClass401_3.method28848(this.aClass136Array3[1]);
			this.aClass401_3.method28848(this.aClass136Array3[2]);
			this.method21163();
			this.method21164();
		}
		if (this.aClass131_3 != null) {
			this.aClass131_3.method20437();
			this.aClass131_3 = null;
		}
		this.method21150();
	}

	@OriginalMember(owner = "client!afa", name = "yt", descriptor = "()V")
	final void method21338() {
		this.aClass398_5 = new Class398(this);
		this.aBoolean518 = false;
		try {
			this.aClass119_3 = new Class119_Sub1(this);
			this.aClass122_3 = new Class122_Sub2(this);
			this.aClass124_3 = new Class124_Sub1(this);
			this.aClass127_3 = new Class127_Sub1(this);
			this.aClass131_Sub1_Sub1_5 = new Class131_Sub1_Sub1(this, this.aClass398_5, false);
			this.aClass131_Sub1_Sub1_6 = new Class131_Sub1_Sub1(this, this.aClass398_5, true);
			this.aClass131_Sub1_Sub2_3 = new Class131_Sub1_Sub2(this, this.aClass398_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass119_3 = new Class119_Sub2(this);
			this.aClass122_3 = new Class122_Sub1(this);
			this.aClass124_3 = new Class124_Sub2(this);
			this.aClass127_3 = new Class127_Sub2(this);
			this.aClass131_Sub1_Sub1_5 = null;
			this.aClass131_Sub1_Sub1_6 = null;
			this.aClass131_Sub1_Sub2_3 = null;
			this.aBoolean518 = true;
		}
		if (!this.aBoolean518) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass108_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass108_6.method24036();
				local112 = this.aClass108_6.method24037();
			}
			this.aClass401_3 = new Class401(this, local108, local112);
			this.aClass136Array3[3] = new Class136_Sub2(this);
			this.aClass136Array3[1] = new Class136_Sub1(this);
			this.aClass136Array3[2] = new Class136_Sub3(this);
			if (this.aClass136Array3[3].method11182()) {
				this.aClass401_3.method28848(this.aClass136Array3[3]);
			}
			this.aClass401_3.method28848(this.aClass136Array3[1]);
			this.aClass401_3.method28848(this.aClass136Array3[2]);
			this.method21163();
			this.method21164();
		}
		if (this.aClass131_3 != null) {
			this.aClass131_3.method20437();
			this.aClass131_3 = null;
		}
		this.method21150();
	}

	@OriginalMember(owner = "client!afa", name = "yc", descriptor = "()V")
	void method21339() {
		this.method21237(7);
		this.method21149();
	}

	@OriginalMember(owner = "client!afa", name = "adi", descriptor = "(ILclient!mh;)V")
	public final void method21340(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1) {
		this.method21152(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!afa", name = "yb", descriptor = "()V")
	void method21341() {
		this.method21237(7);
		this.method21149();
	}

	@OriginalMember(owner = "client!afa", name = "yr", descriptor = "()V")
	final void method21342() {
		this.method21197();
		this.method21247();
		this.method21196();
		this.method21202();
		this.method21199();
		this.method21285();
		this.method21201();
		this.method21169();
		this.method21192();
		this.method21244();
		this.method21295();
		this.method21240();
		this.method21464();
		this.method21238();
		for (@Pc(32) int local32 = this.anInt2998 - 1; local32 >= 0; local32--) {
			this.method21217(local32);
			this.method21232();
			this.method21360();
			this.method21227();
		}
		this.method21229();
		this.method21369();
	}

	@OriginalMember(owner = "client!afa", name = "age", descriptor = "(I)V")
	abstract void method21343(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "ye", descriptor = "()V")
	void method21344() {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28847();
		}
		if (this.aClass136Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass136Array3.length; local10++) {
				if (this.aClass136Array3[local10] != null && this.aClass136Array3[local10].method11193()) {
					this.aClass136Array3[local10].method11185();
				}
			}
		}
		this.aClass402_3 = new Class402(this);
		this.method21398();
		this.method21147();
		this.method21153();
		this.aClass429_3 = new Class429(this, 1024);
		this.aClass402_3.method28885(this);
		if (this.aBoolean529) {
			this.aClass421_3 = new Class421(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afa", name = "x", descriptor = "()Z")
	@Override
	public final boolean method20665() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "yg", descriptor = "()V")
	final void method21345() {
		this.anInterface38_16 = this.method21239(false);
		@Pc(6) short local6 = 160;
		this.anInterface38_16.method29327(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface38_16.method29383(0, this.aByteBuffer7.position(), this.aLong168);
		this.aClass135_20 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3, Class400.aClass400_1, Class400.aClass400_1 }) });
	}

	@OriginalMember(owner = "client!afa", name = "lx", descriptor = "(IFFFFF)V")
	@Override
	public final void method21025(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2976 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat214 != local11 || this.aFloat216 != local15) {
			this.anInt2976 = arg0;
			this.aFloat214 = local11;
			this.aFloat216 = local15;
			if (local7) {
				this.aFloat208 = (float) (this.anInt2976 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2976 & 0xFF00) / 65280.0F;
				this.aFloat210 = (float) (this.anInt2976 & 0xFF) / 255.0F;
				this.method21197();
			}
			this.method21247();
		}
		if (this.aFloatArray69[0] != arg3 || this.aFloatArray69[1] != arg4 || this.aFloatArray69[2] != arg5) {
			this.aFloatArray69[0] = arg3;
			this.aFloatArray69[1] = arg4;
			this.aFloatArray69[2] = arg5;
			this.aFloatArray65[0] = -arg3;
			this.aFloatArray65[1] = -arg4;
			this.aFloatArray65[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray68[0] = arg3 * local140;
			this.aFloatArray68[1] = arg4 * local140;
			this.aFloatArray68[2] = arg5 * local140;
			this.aFloatArray67[0] = -this.aFloatArray68[0];
			this.aFloatArray67[1] = -this.aFloatArray68[1];
			this.aFloatArray67[2] = -this.aFloatArray68[2];
			this.method21199();
			this.anInt2981 = (int) (arg3 * 256.0F / arg4);
			this.anInt2982 = (int) (arg5 * 256.0F / arg4);
		}
		this.method21285();
	}

	@OriginalMember(owner = "client!afa", name = "ys", descriptor = "()V")
	final void method21346() {
		this.anInterface38_16 = this.method21239(false);
		@Pc(6) short local6 = 160;
		this.anInterface38_16.method29327(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface38_16.method29383(0, this.aByteBuffer7.position(), this.aLong168);
		this.aClass135_20 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3, Class400.aClass400_1, Class400.aClass400_1 }) });
	}

	@OriginalMember(owner = "client!afa", name = "ok", descriptor = "(ILclient!dp;)V")
	@Override
	public final void method21044(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		this.anInt3002 = arg0;
		this.aClass229_6 = arg1;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!afa", name = "yu", descriptor = "()V")
	final void method21347() {
		this.anInterface38_15 = this.method21239(true);
		@Pc(6) byte local6 = 24;
		this.anInterface38_15.method29327(local6, 12);
		this.aClass135_17 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11) });
	}

	@OriginalMember(owner = "client!afa", name = "yf", descriptor = "()V")
	final void method21348() {
		this.anInterface38_15 = this.method21239(true);
		@Pc(6) byte local6 = 24;
		this.anInterface38_15.method29327(local6, 12);
		this.aClass135_17 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11) });
	}

	@OriginalMember(owner = "client!afa", name = "afd", descriptor = "(Lclient!ld;)V")
	public abstract void method21349(@OriginalArg(0) Class135 arg0);

	@OriginalMember(owner = "client!afa", name = "lk", descriptor = "(Lclient!ov;)V")
	@Override
	public final void method20963(@OriginalArg(0) Class471 arg0) {
		this.aClass471_39 = arg0;
		this.aClass487_75.method30080(this.aClass471_39);
		this.aClass487_77.method30075(this.aClass487_75);
		this.aClass487_77.method30069();
		this.aClass471_38.method29760(arg0);
		this.aClass471_38.method29768();
		this.aClass487_76.method30080(this.aClass471_38);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21527();
		}
	}

	@OriginalMember(owner = "client!afa", name = "yz", descriptor = "()Lclient!ls;")
	final Class404 method21350() {
		return this.aClass421_3 == null ? Class404.aClass404_3 : this.aClass421_3.method29024();
	}

	@OriginalMember(owner = "client!afa", name = "ow", descriptor = "()Z")
	@Override
	public final boolean method21035() {
		if (this.aClass136Array3[3] == null || this.aClass136Array3[3].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[3]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "ue", descriptor = "()I")
	public final int method21351() {
		return this.anInt2983;
	}

	@OriginalMember(owner = "client!afa", name = "adj", descriptor = "()Lclient!pm;")
	final Class487 method21352() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "rg", descriptor = "()V")
	@Override
	public final void method20851() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29016();
		}
	}

	@OriginalMember(owner = "client!afa", name = "rt", descriptor = "()V")
	@Override
	public final void method21128() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29016();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aer", descriptor = "()V")
	abstract void method21353();

	@OriginalMember(owner = "client!afa", name = "rz", descriptor = "()V")
	final void method21354() {
		@Pc(4) ArrayList local4 = this.aClass76_3.method1349(-214237508);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30837();
		}
	}

	@OriginalMember(owner = "client!afa", name = "yw", descriptor = "()Z")
	final boolean method21355() {
		if (this.aClass136Array3[1] == null || this.aClass136Array3[1].method11193()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass401_3.method28848(this.aClass136Array3[1]);
		if (local18) {
			this.aClass395_3.method28696();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "afz", descriptor = "()V")
	abstract void method21356();

	@OriginalMember(owner = "client!afa", name = "kh", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20663() {
		return this.aClass487_90;
	}

	@OriginalMember(owner = "client!afa", name = "zc", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method21357(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.f(arg0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "acl", descriptor = "(I)V")
	public final void method21358(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "rc", descriptor = "(I)Ljava/nio/ByteBuffer;")
	final ByteBuffer method21359(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!afa", name = "vw", descriptor = "()V")
	abstract void method21360();

	@OriginalMember(owner = "client!afa", name = "zn", descriptor = "()V")
	final void method21361() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.anInt2971 = this.anInt2967;
			this.anInt2963 = this.anInt2968;
			this.anInt2972 = this.anInt2969;
			this.anInt2984 = this.anInt2970;
			this.aFloat205 = this.aFloat211;
			this.aFloat206 = this.aFloat207;
		} else {
			this.anInt2971 = 0;
			this.anInt2963 = 0;
			this.anInt2972 = this.aClass108_6.method24036();
			this.anInt2984 = this.aClass108_6.method24037();
			this.aFloat205 = 0.0F;
			this.aFloat206 = 1.0F;
		}
		this.method21369();
		this.aFloat213 = (float) this.anInt2969 / 2.0F;
		this.aFloat204 = (float) this.anInt2970 / 2.0F;
		this.aFloat203 = (float) this.anInt2967 + this.aFloat213;
		this.aFloat201 = (float) this.anInt2968 + this.aFloat204;
	}

	@OriginalMember(owner = "client!afa", name = "za", descriptor = "(II)V")
	final void method21362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2989 = arg0;
		this.anInt2974 = arg1;
		this.method21369();
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "zt", descriptor = "(II)V")
	final void method21363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2989 = arg0;
		this.anInt2974 = arg1;
		this.method21369();
		if (!this.aBoolean527 && (this.aBoolean510 || this.method21173() == Class404.aClass404_3)) {
			this.aBoolean527 = true;
			this.method21175();
		}
		if (this.aBoolean527) {
			this.method21174();
		}
	}

	@OriginalMember(owner = "client!afa", name = "zj", descriptor = "()Lclient!pm;")
	final Class487 method21364() {
		return this.aClass487_89;
	}

	@OriginalMember(owner = "client!afa", name = "zr", descriptor = "()V")
	abstract void method21365();

	@OriginalMember(owner = "client!afa", name = "zx", descriptor = "()V")
	abstract void method21366();

	@OriginalMember(owner = "client!afa", name = "zd", descriptor = "()Lclient!pm;")
	final Class487 method21367() {
		return this.aClass487_89;
	}

	@OriginalMember(owner = "client!afa", name = "kl", descriptor = "()I")
	@Override
	public final int method20673() {
		return this.anInt2999 - 2;
	}

	@OriginalMember(owner = "client!afa", name = "zw", descriptor = "()Lclient!pm;")
	final Class487 method21368() {
		return this.aClass394_3 == Class394.aClass394_6 ? this.aClass487_75 : aClass487_79;
	}

	@OriginalMember(owner = "client!afa", name = "ta", descriptor = "()V")
	abstract void method21369();

	@OriginalMember(owner = "client!afa", name = "zh", descriptor = "()V")
	final void method21370() {
		this.aClass487_88.method30075(this.aClass487_75);
		this.aClass487_88.method30078(this.aClass487_83);
		this.aClass487_88.method30099(this.aFloatArrayArray22[0]);
		this.aClass487_88.method30100(this.aFloatArrayArray22[1]);
		this.aClass487_88.method30095(this.aFloatArrayArray22[2]);
		this.aClass487_88.method30096(this.aFloatArrayArray22[3]);
		this.aClass487_88.method30097(this.aFloatArrayArray22[4]);
		this.aClass487_88.method30098(this.aFloatArrayArray22[5]);
		this.aClass487_78.method30075(this.aClass487_88);
		this.method21243(this.aClass487_78);
	}

	@OriginalMember(owner = "client!afa", name = "yp", descriptor = "()V")
	final void method21371() {
		this.anInterface38_15 = this.method21239(true);
		@Pc(6) byte local6 = 24;
		this.anInterface38_15.method29327(local6, 12);
		this.aClass135_17 = this.method21248(new Class397[] { new Class397(Class400.aClass400_11) });
	}

	@OriginalMember(owner = "client!afa", name = "dt", descriptor = "()Lclient!pm;")
	@Override
	public final Class487 method20763() {
		return this.aClass487_83;
	}

	@OriginalMember(owner = "client!afa", name = "fk", descriptor = "()Z")
	@Override
	public final boolean method20969() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "aac", descriptor = "()V")
	final void method21372() {
		if (this.aClass394_3 == Class394.aClass394_4) {
			return;
		}
		@Pc(6) Class394 local6 = this.aClass394_3;
		this.aClass394_3 = Class394.aClass394_4;
		if (local6 == Class394.aClass394_6) {
			this.method21527();
		}
		this.method21187();
		this.aClass487_85 = this.aClass487_82;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afa", name = "wf", descriptor = "(Lclient!md;IIII)V")
	public abstract void method21373(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afa", name = "zl", descriptor = "()Lclient!ov;")
	final Class471 method21374() {
		if (this.aClass394_3 != Class394.aClass394_6) {
			return this.aClass471_34;
		}
		if (!this.aBoolean512) {
			this.aClass471_37.method29760(this.aClass471_34);
			this.aClass471_37.method29766(this.aClass471_39);
			this.aClass487_84.method30080(this.aClass471_37);
			this.aBoolean512 = true;
		}
		return this.aClass471_37;
	}

	@OriginalMember(owner = "client!afa", name = "ns", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class99 method21039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class99_Sub1 local8 = new Class99_Sub1(this, arg2, arg3, arg4, false);
		local8.method18223(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afa", name = "zo", descriptor = "()Lclient!pm;")
	final Class487 method21375() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			if (!this.aBoolean512) {
				this.method21178();
			}
			return this.aClass487_84;
		} else {
			return this.aClass487_89;
		}
	}

	@OriginalMember(owner = "client!afa", name = "zq", descriptor = "()Lclient!pm;")
	final Class487 method21376() {
		return this.aClass487_78;
	}

	@OriginalMember(owner = "client!afa", name = "aaq", descriptor = "()Lclient!pm;")
	final Class487 method21377() {
		return this.aClass487_78;
	}

	@OriginalMember(owner = "client!afa", name = "aah", descriptor = "()Lclient!pm;")
	final Class487 method21378() {
		return this.aClass487_78;
	}

	@OriginalMember(owner = "client!afa", name = "aar", descriptor = "()Lclient!pm;")
	final Class487 method21379() {
		return this.aClass487_86;
	}

	@OriginalMember(owner = "client!afa", name = "zp", descriptor = "()V")
	abstract void method21380();

	@OriginalMember(owner = "client!afa", name = "aas", descriptor = "()V")
	final void method21381() {
		if (this.aClass394_3 == Class394.aClass394_5) {
			return;
		}
		@Pc(6) Class394 local6 = this.aClass394_3;
		this.aClass394_3 = Class394.aClass394_5;
		if (local6 == Class394.aClass394_6) {
			this.method21527();
		}
		this.aClass487_85 = this.aClass487_87;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afa", name = "sn", descriptor = "()V")
	final void method21382() {
		this.aClass398_5 = new Class398(this);
		this.aBoolean518 = false;
		try {
			this.aClass119_3 = new Class119_Sub1(this);
			this.aClass122_3 = new Class122_Sub2(this);
			this.aClass124_3 = new Class124_Sub1(this);
			this.aClass127_3 = new Class127_Sub1(this);
			this.aClass131_Sub1_Sub1_5 = new Class131_Sub1_Sub1(this, this.aClass398_5, false);
			this.aClass131_Sub1_Sub1_6 = new Class131_Sub1_Sub1(this, this.aClass398_5, true);
			this.aClass131_Sub1_Sub2_3 = new Class131_Sub1_Sub2(this, this.aClass398_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass119_3 = new Class119_Sub2(this);
			this.aClass122_3 = new Class122_Sub1(this);
			this.aClass124_3 = new Class124_Sub2(this);
			this.aClass127_3 = new Class127_Sub2(this);
			this.aClass131_Sub1_Sub1_5 = null;
			this.aClass131_Sub1_Sub1_6 = null;
			this.aClass131_Sub1_Sub2_3 = null;
			this.aBoolean518 = true;
		}
		if (!this.aBoolean518) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass108_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass108_6.method24036();
				local112 = this.aClass108_6.method24037();
			}
			this.aClass401_3 = new Class401(this, local108, local112);
			this.aClass136Array3[3] = new Class136_Sub2(this);
			this.aClass136Array3[1] = new Class136_Sub1(this);
			this.aClass136Array3[2] = new Class136_Sub3(this);
			if (this.aClass136Array3[3].method11182()) {
				this.aClass401_3.method28848(this.aClass136Array3[3]);
			}
			this.aClass401_3.method28848(this.aClass136Array3[1]);
			this.aClass401_3.method28848(this.aClass136Array3[2]);
			this.method21163();
			this.method21164();
		}
		if (this.aClass131_3 != null) {
			this.aClass131_3.method20437();
			this.aClass131_3 = null;
		}
		this.method21150();
	}

	@OriginalMember(owner = "client!afa", name = "agj", descriptor = "([Lclient!lf;)Lclient!ld;")
	abstract Class135 method21383(@OriginalArg(0) Class397[] arg0);

	@OriginalMember(owner = "client!afa", name = "aaw", descriptor = "()V")
	final void method21384() {
		this.aBoolean521 = false;
		if (this.aClass394_3 == Class394.aClass394_4) {
			this.method21187();
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aae", descriptor = "()V")
	final void method21385() {
		this.aBoolean521 = false;
		if (this.aClass394_3 == Class394.aClass394_4) {
			this.method21187();
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aak", descriptor = "()V")
	final void method21386() {
		this.aBoolean521 = false;
		if (this.aClass394_3 == Class394.aClass394_4) {
			this.method21187();
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "acn", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	abstract Interface34 method21387(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "aad", descriptor = "()V")
	final void method21388() {
		if (this.aClass394_3 == Class394.aClass394_6) {
			return;
		}
		this.aClass394_3 = Class394.aClass394_6;
		this.method21527();
		this.method21188();
		this.aClass487_85 = this.aClass487_83;
		this.method21189();
		this.method21265();
		this.anInt2996 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "ags", descriptor = "()V")
	abstract void method21389();

	@OriginalMember(owner = "client!afa", name = "aay", descriptor = "()V")
	final void method21390() {
		this.aBoolean513 = false;
		this.method21188();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21189();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aaj", descriptor = "()V")
	final void method21391() {
		if (this.aBoolean521) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass108_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass108_6.method24036();
			local13 = this.aClass108_6.method24037();
		}
		@Pc(21) Class487 local21 = this.aClass487_82;
		if (local9 == 0 || local13 == 0) {
			local21.method30139();
		} else {
			local21.method30087(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass487_74.method30075(local21);
		this.method21243(this.aClass487_74);
		this.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!afa", name = "aal", descriptor = "()V")
	final void method21392() {
		if (this.aBoolean521) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass108_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass108_6.method24036();
			local13 = this.aClass108_6.method24037();
		}
		@Pc(21) Class487 local21 = this.aClass487_82;
		if (local9 == 0 || local13 == 0) {
			local21.method30139();
		} else {
			local21.method30087(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass487_74.method30075(local21);
		this.method21243(this.aClass487_74);
		this.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!afa", name = "aam", descriptor = "()V")
	final void method21393() {
		if (!this.aBoolean513) {
			this.aBoolean513 = true;
		}
	}

	@OriginalMember(owner = "client!afa", name = "jh", descriptor = "(Lclient!akl;)V")
	@Override
	public final void method20967(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap4 = ((Class80_Sub22_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!afa", name = "hc", descriptor = "(IIII)V")
	@Override
	public final void method20990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2967 = arg0;
		this.anInt2968 = arg1;
		this.anInt2969 = arg2;
		this.anInt2970 = arg3;
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "aax", descriptor = "(Z)V")
	final void method21394(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean517) {
			this.aBoolean517 = arg0;
			this.method21169();
			this.anInt2996 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "wj", descriptor = "(Lclient!lg;)V")
	public final void method21395(@OriginalArg(0) Interface35 arg0) {
		this.aClass76_3.method1348(arg0, 2145442098);
	}

	@OriginalMember(owner = "client!afa", name = "aaf", descriptor = "()V")
	abstract void method21396();

	@OriginalMember(owner = "client!afa", name = "aat", descriptor = "()V")
	abstract void method21397();

	@OriginalMember(owner = "client!afa", name = "sz", descriptor = "()V")
	final void method21398() {
		this.anInterface38_16 = this.method21239(false);
		@Pc(6) short local6 = 160;
		this.anInterface38_16.method29327(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface38_16.method29383(0, this.aByteBuffer7.position(), this.aLong168);
		this.aClass135_20 = this.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3, Class400.aClass400_1, Class400.aClass400_1 }) });
	}

	@OriginalMember(owner = "client!afa", name = "aav", descriptor = "()V")
	abstract void method21399();

	@OriginalMember(owner = "client!afa", name = "jw", descriptor = "(I)Lclient!akl;")
	@Override
	public final Class80_Sub22 method20915(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub1 local4 = new Class80_Sub22_Sub1(arg0);
		this.aClass8_40.method232(local4, 2041279648);
		return local4;
	}

	@OriginalMember(owner = "client!afa", name = "abd", descriptor = "()V")
	abstract void method21400();

	@OriginalMember(owner = "client!afa", name = "abk", descriptor = "()V")
	abstract void method21401();

	@OriginalMember(owner = "client!afa", name = "abs", descriptor = "()V")
	abstract void method21402();

	@OriginalMember(owner = "client!afa", name = "abh", descriptor = "()V")
	abstract void method21403();

	@OriginalMember(owner = "client!afa", name = "bd", descriptor = "(IIIIIILclient!cg;II)V")
	@Override
	public final void method20728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afa", name = "cw", descriptor = "(ILclient!cg;II)V")
	@Override
	public final void method20748(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20762(false);
		this.aClass99_Sub1_5.method18279(0.0F, 0.0F, (float) this.method20677(1028574907).method24036(), 0.0F, 0.0F, (float) this.method20677(1142450553).method24037(), 0, arg1, arg2, arg3);
		this.method20762(true);
	}

	@OriginalMember(owner = "client!afa", name = "yi", descriptor = "()Lclient!ls;")
	final Class404 method21404() {
		return this.aClass421_3 == null ? Class404.aClass404_3 : this.aClass421_3.method29024();
	}

	@OriginalMember(owner = "client!afa", name = "abe", descriptor = "()V")
	abstract void method21405();

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "()Z")
	@Override
	public final boolean method20669() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "abi", descriptor = "()V")
	abstract void method21406();

	@OriginalMember(owner = "client!afa", name = "abt", descriptor = "()V")
	abstract void method21407();

	@OriginalMember(owner = "client!afa", name = "bn", descriptor = "(IIII)V")
	@Override
	public final void method20706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2967 = arg0;
		this.anInt2968 = arg1;
		this.anInt2969 = arg2;
		this.anInt2970 = arg3;
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "abn", descriptor = "()V")
	abstract void method21408();

	@OriginalMember(owner = "client!afa", name = "abb", descriptor = "()V")
	final void method21409() {
		if (this.method21245()) {
			this.method21157();
		}
		this.anInt2977 = this.anInt2978;
	}

	@OriginalMember(owner = "client!afa", name = "zf", descriptor = "()Lclient!pm;")
	final Class487 method21410() {
		return this.aClass394_3 == Class394.aClass394_6 ? this.aClass487_75 : aClass487_79;
	}

	@OriginalMember(owner = "client!afa", name = "abx", descriptor = "()V")
	abstract void method21411();

	@OriginalMember(owner = "client!afa", name = "abp", descriptor = "(Lclient!co;Lclient!dy;)Z")
	abstract boolean method21412(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1);

	@OriginalMember(owner = "client!afa", name = "abc", descriptor = "()V")
	abstract void method21413();

	@OriginalMember(owner = "client!afa", name = "mn", descriptor = "(FFFFF)V")
	@Override
	public final void method20988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class136_Sub1.aFloat121 = arg0;
		Class136_Sub1.aFloat122 = arg1;
		Class136_Sub1.aFloat123 = arg2;
		Class136_Sub1.aFloat124 = arg3;
		Class136_Sub1.aFloat125 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "abu", descriptor = "(Lclient!co;Lclient!dy;)Z")
	abstract boolean method21414(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1);

	@OriginalMember(owner = "client!afa", name = "abv", descriptor = "(IIZ[I)Lclient!lb;")
	final Interface34 method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method21304(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "abo", descriptor = "(IIZ[I)Lclient!lb;")
	final Interface34 method21416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method21304(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "abq", descriptor = "(IIZ[I)Lclient!lb;")
	final Interface34 method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method21304(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "abf", descriptor = "(Lclient!co;IIZ[B)Lclient!lb;")
	final Interface34 method21418(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method21221(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "xs", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21419(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "aba", descriptor = "(Lclient!co;IIZ[F)Lclient!lb;")
	final Interface34 method21420(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method21211(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "acy", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	abstract Interface34 method21422(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "acq", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	abstract Interface34 method21423(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "acc", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	abstract Interface34 method21424(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afa", name = "acs", descriptor = "()V")
	public abstract void method21425();

	@OriginalMember(owner = "client!afa", name = "acj", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	abstract Interface34 method21426(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afa", name = "aca", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	abstract Interface34 method21427(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afa", name = "xn", descriptor = "(I)Ljava/nio/ByteBuffer;")
	final ByteBuffer method21428(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!afa", name = "uy", descriptor = "(Lclient!mf;)V")
	public final void method21429(@OriginalArg(0) Interface39 arg0) {
		if (this.anInterface39Array3[this.anInt2983] == arg0) {
			return;
		}
		this.anInterface39Array3[this.anInt2983] = arg0;
		if (arg0 == null) {
			this.anInterface34_23.method11817();
		} else {
			arg0.method11817();
		}
		this.anInt2996 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afa", name = "xi", descriptor = "(Z)Z")
	public abstract boolean method21430(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "acv", descriptor = "(IZ[[I)Lclient!ml;")
	abstract Interface42 method21431(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afa", name = "mu", descriptor = "()Z")
	@Override
	public final boolean method20999() {
		return this.aClass136Array3[2] != null && this.aClass136Array3[2].method11193();
	}

	@OriginalMember(owner = "client!afa", name = "ace", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	abstract Interface36 method21432(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afa", name = "acz", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	abstract Interface36 method21433(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afa", name = "ack", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	abstract Interface40 method21434(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "acb", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	abstract Interface40 method21435(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "acp", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	abstract Interface40 method21436(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afa", name = "acu", descriptor = "()I")
	public final int method21437() {
		return this.anInt2983;
	}

	@OriginalMember(owner = "client!afa", name = "wc", descriptor = "()V")
	final void method21438() {
		this.method21250(0, this.anInterface38_15);
		this.method21158(this.aClass135_17);
		this.method21257(Class415.aClass415_3, 0, 1);
	}

	@OriginalMember(owner = "client!afa", name = "acg", descriptor = "(I)V")
	public final void method21439(@OriginalArg(0) int arg0) {
		if (this.anInt2983 != arg0) {
			this.anInt2983 = arg0;
			this.method21231();
		}
	}

	@OriginalMember(owner = "client!afa", name = "acw", descriptor = "()V")
	public abstract void method21440();

	@OriginalMember(owner = "client!afa", name = "kc", descriptor = "(Lclient!db;)V")
	@Override
	public final void method20956(@OriginalArg(0) Class221 arg0) {
		this.aClass402_3.method28889(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "nd", descriptor = "()Z")
	@Override
	public final boolean method21033() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ach", descriptor = "()V")
	public abstract void method21441();

	@OriginalMember(owner = "client!afa", name = "hd", descriptor = "(FF)V")
	@Override
	public final void method20901(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat211 = arg0;
		this.aFloat207 = arg1;
		this.method21265();
	}

	@OriginalMember(owner = "client!afa", name = "add", descriptor = "()V")
	final void method21442() {
		if (this.aClass422Array3[this.anInt2983] != Class422.aClass422_2) {
			this.aClass422Array3[this.anInt2983] = Class422.aClass422_2;
			this.aClass487Array6[this.anInt2983].method30139();
			this.method21228();
		}
	}

	@OriginalMember(owner = "client!afa", name = "bs", descriptor = "()V")
	@Override
	public final void method20877() {
		if (this.aClass108_6 == null) {
			this.anInt2964 = 0;
			this.anInt2957 = 0;
			this.anInt2995 = 0;
			this.anInt2979 = 0;
		} else {
			this.anInt2995 = 0;
			this.anInt2979 = 0;
			this.anInt2957 = this.aClass108_6.method24036();
			this.anInt2964 = this.aClass108_6.method24037();
		}
		if (this.aBoolean527) {
			this.aBoolean527 = false;
			this.method21175();
		}
	}

	@OriginalMember(owner = "client!afa", name = "adf", descriptor = "(I)V")
	public final void method21443(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ada", descriptor = "(I)V")
	public final void method21444(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "aez", descriptor = "()V")
	abstract void method21445();

	@OriginalMember(owner = "client!afa", name = "adt", descriptor = "(Lclient!ma;Lclient!ma;)V")
	public final void method21446(@OriginalArg(0) Class412 arg0, @OriginalArg(1) Class412 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass412Array5[this.anInt2983] != arg0) {
			this.aClass412Array5[this.anInt2983] = arg0;
			this.method21232();
			local1 = true;
		}
		if (this.aClass412Array6[this.anInt2983] != arg1) {
			this.aClass412Array6[this.anInt2983] = arg1;
			this.method21360();
			local1 = true;
		}
		if (local1) {
			this.anInt2996 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afa", name = "adl", descriptor = "()Lclient!pm;")
	final Class487 method21447() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "tn", descriptor = "()Lclient!pm;")
	final Class487 method21448() {
		return this.aClass394_3 == Class394.aClass394_6 ? this.aClass487_76 : aClass487_79;
	}

	@OriginalMember(owner = "client!afa", name = "ado", descriptor = "(ILclient!mh;)V")
	public final void method21449(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1) {
		this.method21223(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!afa", name = "adp", descriptor = "(ILclient!mh;Z)V")
	abstract void method21450(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afa", name = "adw", descriptor = "(ILclient!mh;Z)V")
	abstract void method21451(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afa", name = "ig", descriptor = "(IIIIII)V")
	@Override
	public final void method20903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(false);
		}
		if (this.aBoolean515) {
			this.method20762(false);
			this.aClass99_Sub1_6.method18229(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20762(true);
		} else {
			this.aClass99_Sub1_6.method18229(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean531 && this.anInt2994 != 0) {
			this.method21323(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ady", descriptor = "(I)V")
	public final void method21452(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2949) {
			this.anInt2949 = arg0;
			this.method21229();
		}
	}

	@OriginalMember(owner = "client!afa", name = "adk", descriptor = "(I)V")
	public final void method21453(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2949) {
			this.anInt2949 = arg0;
			this.method21229();
		}
	}

	@OriginalMember(owner = "client!afa", name = "adm", descriptor = "()V")
	abstract void method21454();

	@OriginalMember(owner = "client!afa", name = "ade", descriptor = "()Lclient!pm;")
	final Class487 method21455() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "adq", descriptor = "()Lclient!pm;")
	final Class487 method21456() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "ru", descriptor = "()V")
	@Override
	public final void method21077() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29016();
		}
	}

	@OriginalMember(owner = "client!afa", name = "agh", descriptor = "(Lclient!md;I)V")
	final void method21457(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1) {
		this.method21250(0, this.anInterface38_16);
		this.method21158(this.aClass135_20);
		this.method21257(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "adh", descriptor = "()Lclient!pm;")
	public final Class487 method21458() {
		return this.aClass487Array6[this.anInt2983];
	}

	@OriginalMember(owner = "client!afa", name = "aap", descriptor = "(Z)V")
	final void method21459(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean535) {
			this.aBoolean535 = arg0;
			this.method21192();
			this.anInt2996 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "vj", descriptor = "(I)V")
	final void method21460(@OriginalArg(0) int arg0) {
		if (this.anInt2992 != arg0) {
			this.anInt2992 = arg0;
			this.method21464();
		}
	}

	@OriginalMember(owner = "client!afa", name = "si", descriptor = "()V")
	final void method21461() {
		this.method21184();
		this.method21186();
		this.method21218();
		this.method20705();
		this.method20877();
	}

	@OriginalMember(owner = "client!afa", name = "zv", descriptor = "(I)Lclient!mv;")
	final Interface44 method21462(@OriginalArg(0) int arg0) {
		if (this.anInterface44_4.method29391() < arg0 * 2) {
			this.anInterface44_4.method29401(arg0);
		}
		return this.anInterface44_4;
	}

	@OriginalMember(owner = "client!afa", name = "ads", descriptor = "()V")
	final void method21463() {
		this.method21230();
	}

	@OriginalMember(owner = "client!afa", name = "va", descriptor = "()V")
	abstract void method21464();

	@OriginalMember(owner = "client!afa", name = "adr", descriptor = "()V")
	abstract void method21465();

	@OriginalMember(owner = "client!afa", name = "aed", descriptor = "()V")
	abstract void method21466();

	@OriginalMember(owner = "client!afa", name = "aey", descriptor = "()V")
	abstract void method21467();

	@OriginalMember(owner = "client!afa", name = "aec", descriptor = "()V")
	abstract void method21468();

	@OriginalMember(owner = "client!afa", name = "aef", descriptor = "()V")
	abstract void method21469();

	@OriginalMember(owner = "client!afa", name = "aei", descriptor = "()V")
	abstract void method21470();

	@OriginalMember(owner = "client!afa", name = "aew", descriptor = "()V")
	abstract void method21471();

	@OriginalMember(owner = "client!afa", name = "lp", descriptor = "(III)V")
	@Override
	public final void method20845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2965 == arg0 && this.anInt2985 == arg1 && this.anInt2990 == arg2) {
			return;
		}
		this.anInt2965 = arg0;
		this.anInt2985 = arg1;
		this.anInt2990 = arg2;
		this.method21242();
		this.method21244();
	}

	@OriginalMember(owner = "client!afa", name = "aeu", descriptor = "()V")
	abstract void method21472();

	@OriginalMember(owner = "client!afa", name = "aeo", descriptor = "()V")
	abstract void method21473();

	@OriginalMember(owner = "client!afa", name = "aeg", descriptor = "()Lclient!dp;")
	final Class229 method21474() {
		return this.aClass229_6;
	}

	@OriginalMember(owner = "client!afa", name = "aea", descriptor = "()Lclient!dp;")
	final Class229 method21475() {
		return this.aClass229_6;
	}

	@OriginalMember(owner = "client!afa", name = "aev", descriptor = "()Lclient!dp;")
	final Class229 method21476() {
		return this.aClass229_6;
	}

	@OriginalMember(owner = "client!afa", name = "aeb", descriptor = "(I)V")
	final void method21477(@OriginalArg(0) int arg0) {
		if (this.anInt2991 == arg0) {
			return;
		}
		@Pc(8) Class428 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class428.aClass428_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class428.aClass428_4;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class428.aClass428_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class428.aClass428_5;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class428.aClass428_5;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean528) {
			this.aBoolean528 = local10;
			this.method21238();
		}
		if (local12 != this.aBoolean514) {
			this.aBoolean514 = local12;
			this.method21240();
		}
		if (local8 != this.aClass428_3) {
			this.aClass428_3 = local8;
			this.method21464();
		}
		this.anInt2991 = arg0;
		this.anInt2996 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "aeh", descriptor = "(I)V")
	final void method21478(@OriginalArg(0) int arg0) {
		if (this.anInt2991 == arg0) {
			return;
		}
		@Pc(8) Class428 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class428.aClass428_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class428.aClass428_4;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class428.aClass428_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class428.aClass428_5;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class428.aClass428_5;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean528) {
			this.aBoolean528 = local10;
			this.method21238();
		}
		if (local12 != this.aBoolean514) {
			this.aBoolean514 = local12;
			this.method21240();
		}
		if (local8 != this.aClass428_3) {
			this.aClass428_3 = local8;
			this.method21464();
		}
		this.anInt2991 = arg0;
		this.anInt2996 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "aen", descriptor = "(I)V")
	final void method21479(@OriginalArg(0) int arg0) {
		if (this.anInt2992 != arg0) {
			this.anInt2992 = arg0;
			this.method21464();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aex", descriptor = "(B)V")
	final void method21480(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method21460(0);
			this.method21235(1);
		} else {
			this.method21460(3);
			this.method21235(3);
		}
		this.method21238();
	}

	@OriginalMember(owner = "client!afa", name = "dj", descriptor = "(II)V")
	@Override
	public final void method20775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass401_3 != null) {
			this.aClass401_3.method28853(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "aem", descriptor = "(I)V")
	abstract void method21481(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "ael", descriptor = "(I)V")
	abstract void method21482(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "aek", descriptor = "()V")
	abstract void method21483();

	@OriginalMember(owner = "client!afa", name = "aet", descriptor = "()V")
	abstract void method21484();

	@OriginalMember(owner = "client!afa", name = "aep", descriptor = "()V")
	abstract void method21485();

	@OriginalMember(owner = "client!afa", name = "iu", descriptor = "(IIIII)V")
	@Override
	final void method20758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "aes", descriptor = "()V")
	abstract void method21486();

	@OriginalMember(owner = "client!afa", name = "aej", descriptor = "()V")
	abstract void method21487();

	@OriginalMember(owner = "client!afa", name = "aee", descriptor = "()V")
	abstract void method21488();

	@OriginalMember(owner = "client!afa", name = "afo", descriptor = "()V")
	abstract void method21489();

	@OriginalMember(owner = "client!afa", name = "afr", descriptor = "()V")
	abstract void method21490();

	@OriginalMember(owner = "client!afa", name = "it", descriptor = "(IIIII)V")
	@Override
	final void method20896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20727(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "afp", descriptor = "()V")
	abstract void method21491();

	@OriginalMember(owner = "client!afa", name = "afw", descriptor = "()V")
	abstract void method21492();

	@OriginalMember(owner = "client!afa", name = "nn", descriptor = "()Z")
	@Override
	public final boolean method21034() {
		return this.aClass136Array3[3] != null;
	}

	@OriginalMember(owner = "client!afa", name = "afl", descriptor = "()V")
	abstract void method21493();

	@OriginalMember(owner = "client!afa", name = "agx", descriptor = "()V")
	abstract void method21494();

	@OriginalMember(owner = "client!afa", name = "aff", descriptor = "()V")
	abstract void method21495();

	@OriginalMember(owner = "client!afa", name = "afm", descriptor = "(Z)V")
	abstract void method21496(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afa", descriptor = "(Z)V")
	abstract void method21497(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afq", descriptor = "(Z)V")
	abstract void method21498(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afs", descriptor = "(Z)Lclient!mv;")
	abstract Interface44 method21499(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afj", descriptor = "(Z)Lclient!mv;")
	abstract Interface44 method21500(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afy", descriptor = "(Z)Lclient!mv;")
	abstract Interface44 method21501(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afe", descriptor = "(Z)Lclient!lx;")
	abstract Interface38 method21502(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "afn", descriptor = "(Z)Lclient!lx;")
	abstract Interface38 method21503(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afa", name = "aaz", descriptor = "()V")
	final void method21504() {
		this.aClass487_86.method30075(this.aClass487_85);
		this.method21243(this.aClass487_86);
		this.aFloat202 = (this.aClass487_86.aFloatArray114[14] - this.aClass487_86.aFloatArray114[15]) / (this.aClass487_86.aFloatArray114[11] - this.aClass487_86.aFloatArray114[10]);
		this.aFloat215 = -this.aClass487_86.aFloatArray114[14] / this.aClass487_86.aFloatArray114[10];
		this.method21242();
	}

	@OriginalMember(owner = "client!afa", name = "abl", descriptor = "(Lclient!co;IIZ[B)Lclient!lb;")
	final Interface34 method21505(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method21221(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afa", name = "oo", descriptor = "(F)V")
	@Override
	public final void method21046(@OriginalArg(0) float arg0) {
		if (this.aFloat212 != arg0) {
			this.aFloat212 = arg0;
			this.method21197();
			this.method21285();
		}
	}

	@OriginalMember(owner = "client!afa", name = "mw", descriptor = "()V")
	@Override
	public final void method21004() {
		if (this.aClass136Array3[3] != null && this.aClass136Array3[3].method11193()) {
			this.aClass401_3.method28862(this.aClass136Array3[3]);
			this.aClass395_3.method28696();
		}
	}

	@OriginalMember(owner = "client!afa", name = "afv", descriptor = "(Lclient!mv;)V")
	abstract void method21506(@OriginalArg(0) Interface44 arg0);

	@OriginalMember(owner = "client!afa", name = "afx", descriptor = "()V")
	final void method21507() {
		this.method21250(0, this.anInterface38_15);
		this.method21158(this.aClass135_17);
		this.method21257(Class415.aClass415_3, 0, 1);
	}

	@OriginalMember(owner = "client!afa", name = "afc", descriptor = "()V")
	public final void method21508() {
		this.method21256(Class415.aClass415_4, 2);
	}

	@OriginalMember(owner = "client!afa", name = "afb", descriptor = "()V")
	public final void method21509() {
		this.method21256(Class415.aClass415_4, 2);
	}

	@OriginalMember(owner = "client!afa", name = "ub", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	abstract Interface36 method21510(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afa", name = "zb", descriptor = "()V")
	final void method21511() {
		this.aBoolean512 = false;
	}

	@OriginalMember(owner = "client!afa", name = "cg", descriptor = "()V")
	@Override
	public final void method20746() {
		if (this.aClass421_3 != null) {
			this.aClass421_3.method29019();
		}
	}

	@OriginalMember(owner = "client!afa", name = "agd", descriptor = "(Lclient!md;II)V")
	public abstract void method21512(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afa", name = "agg", descriptor = "(Lclient!md;IIII)V")
	public abstract void method21513(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afa", name = "agt", descriptor = "(I)V")
	abstract void method21514(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "agr", descriptor = "(I)V")
	abstract void method21515(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afa", name = "kz", descriptor = "(Lclient!ov;)V")
	@Override
	public final void method20913(@OriginalArg(0) Class471 arg0) {
		this.aClass471_39 = arg0;
		this.aClass487_75.method30080(this.aClass471_39);
		this.aClass487_77.method30075(this.aClass487_75);
		this.aClass487_77.method30069();
		this.aClass471_38.method29760(arg0);
		this.aClass471_38.method29768();
		this.aClass487_76.method30080(this.aClass471_38);
		this.method21176();
		if (this.aClass394_3 == Class394.aClass394_6) {
			this.method21527();
		}
	}

	@OriginalMember(owner = "client!afa", name = "xf", descriptor = "(I)V")
	public final void method21516(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2956) {
			this.anInt2956 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2956);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong168 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!afa", name = "aga", descriptor = "()F")
	public abstract float method21518();

	@OriginalMember(owner = "client!afa", name = "aci", descriptor = "(IIZ[III)Lclient!lb;")
	abstract Interface34 method21519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afa", name = "agf", descriptor = "()V")
	abstract void method21520();

	@OriginalMember(owner = "client!afa", name = "ct", descriptor = "(IIIIIII)V")
	@Override
	public final void method20731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = (int) ((float) arg0 + 1.0F);
		@Pc(11) int local11 = (int) ((float) arg1 + 1.0F);
		@Pc(17) int local17 = (int) ((float) arg2 + 1.0F);
		@Pc(23) int local23 = (int) ((float) arg3 + 1.0F);
		@Pc(28) float local28 = (float) (local17 - local5);
		@Pc(33) float local33 = (float) (local23 - local11);
		@Pc(46) float local46 = 1.0F / (float) Math.sqrt((double) (local28 * local28 + local33 * local33));
		@Pc(50) float local50 = local28 * local46;
		@Pc(54) float local54 = local33 * local46;
		@Pc(60) int local60 = (int) ((float) local5 - local50);
		@Pc(66) int local66 = (int) ((float) local11 - local54);
		@Pc(69) float local69 = -local54;
		@Pc(78) float local78 = local69 * 0.5F * (float) arg5;
		@Pc(85) float local85 = local50 * 0.5F * (float) arg5;
		this.aClass99_Sub1_6.method18275((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afa", name = "ey", descriptor = "(FFF[F)V")
	@Override
	public final void method20790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_88.aFloatArray114[14] + this.aClass487_88.aFloatArray114[2] * arg0 + this.aClass487_88.aFloatArray114[6] * arg1 + this.aClass487_88.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_88.aFloatArray114[15] + this.aClass487_88.aFloatArray114[3] * arg0 + this.aClass487_88.aFloatArray114[7] * arg1 + this.aClass487_88.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_88.aFloatArray114[12] + this.aClass487_88.aFloatArray114[0] * arg0 + this.aClass487_88.aFloatArray114[4] * arg1 + this.aClass487_88.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_88.aFloatArray114[13] + this.aClass487_88.aFloatArray114[1] * arg0 + this.aClass487_88.aFloatArray114[5] * arg1 + this.aClass487_88.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_75.aFloatArray114[14] + this.aClass487_75.aFloatArray114[2] * arg0 + this.aClass487_75.aFloatArray114[6] * arg1 + this.aClass487_75.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat203 + this.aFloat213 * local115 / local59;
			arg3[1] = this.aFloat201 + this.aFloat204 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "aan", descriptor = "()V")
	abstract void method21521();

	@OriginalMember(owner = "client!afa", name = "agi", descriptor = "()V")
	abstract void method21522();

	@OriginalMember(owner = "client!afa", name = "ks", descriptor = "()Lclient!ov;")
	@Override
	public final Class471 method21029() {
		return this.aClass471_36;
	}

	@OriginalMember(owner = "client!afa", name = "agl", descriptor = "()V")
	abstract void method21523();

	@OriginalMember(owner = "client!afa", name = "xo", descriptor = "()V")
	final void method21524() {
		@Pc(4) ArrayList local4 = this.aClass76_3.method1349(-214237508);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30837();
		}
	}

	@OriginalMember(owner = "client!afa", name = "agz", descriptor = "()V")
	abstract void method21525();

	@OriginalMember(owner = "client!afa", name = "agv", descriptor = "([Lclient!lf;)Lclient!ld;")
	abstract Class135 method21526(@OriginalArg(0) Class397[] arg0);

	@OriginalMember(owner = "client!afa", name = "ts", descriptor = "()V")
	final void method21527() {
		this.aBoolean512 = false;
	}

	@OriginalMember(owner = "client!afa", name = "agq", descriptor = "([Lclient!lf;)Lclient!ld;")
	abstract Class135 method21528(@OriginalArg(0) Class397[] arg0);

	@OriginalMember(owner = "client!afa", name = "adb", descriptor = "(I)V")
	public final void method21529(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21219(Class412.aClass412_1, Class412.aClass412_1);
				break;
			case 1:
				this.method21219(Class412.aClass412_5, Class412.aClass412_5);
				break;
			case 2:
				this.method21219(Class412.aClass412_4, Class412.aClass412_5);
				break;
			case 3:
				this.method21219(Class412.aClass412_2, Class412.aClass412_1);
				break;
			case 4:
				this.method21219(Class412.aClass412_3, Class412.aClass412_3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ago", descriptor = "([Lclient!lf;)Lclient!ld;")
	abstract Class135 method21530(@OriginalArg(0) Class397[] arg0);

	@OriginalMember(owner = "client!afa", name = "zz", descriptor = "()V")
	final void method21531() {
		this.aClass487_88.method30075(this.aClass487_75);
		this.aClass487_88.method30078(this.aClass487_83);
		this.aClass487_88.method30099(this.aFloatArrayArray22[0]);
		this.aClass487_88.method30100(this.aFloatArrayArray22[1]);
		this.aClass487_88.method30095(this.aFloatArrayArray22[2]);
		this.aClass487_88.method30096(this.aFloatArrayArray22[3]);
		this.aClass487_88.method30097(this.aFloatArrayArray22[4]);
		this.aClass487_88.method30098(this.aFloatArrayArray22[5]);
		this.aClass487_78.method30075(this.aClass487_88);
		this.method21243(this.aClass487_78);
	}

	@OriginalMember(owner = "client!afa", name = "ahb", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	abstract void method21532(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
