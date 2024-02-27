package com.jagex;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!afc")
public abstract class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!afc", name = "fn", descriptor = "I")
	static final int anInt2906 = 4;

	@OriginalMember(owner = "client!afc", name = "am", descriptor = "I")
	static final int anInt2907 = 128;

	@OriginalMember(owner = "client!afc", name = "au", descriptor = "I")
	static final int anInt2908 = 1;

	@OriginalMember(owner = "client!afc", name = "ar", descriptor = "I")
	static final int anInt2909 = 2;

	@OriginalMember(owner = "client!afc", name = "aq", descriptor = "I")
	static final int anInt2910 = 8;

	@OriginalMember(owner = "client!afc", name = "ax", descriptor = "I")
	static final int anInt2911 = 16;

	@OriginalMember(owner = "client!afc", name = "av", descriptor = "I")
	static final int anInt2912 = 55;

	@OriginalMember(owner = "client!afc", name = "aj", descriptor = "I")
	protected static final int anInt2913 = 100663296;

	@OriginalMember(owner = "client!afc", name = "an", descriptor = "I")
	static final int anInt2914 = 4194304;

	@OriginalMember(owner = "client!afc", name = "ap", descriptor = "I")
	static final int anInt2918 = 4;

	@OriginalMember(owner = "client!afc", name = "fm", descriptor = "I")
	static final int anInt2942 = 1;

	@OriginalMember(owner = "client!afc", name = "fj", descriptor = "I")
	static final int anInt2943 = 2;

	@OriginalMember(owner = "client!afc", name = "fd", descriptor = "I")
	static final int anInt2944 = 3;

	@OriginalMember(owner = "client!afc", name = "ao", descriptor = "I")
	static final int anInt2955 = 7;

	@OriginalMember(owner = "client!afc", name = "at", descriptor = "Ljava/lang/Object;")
	static final Object anObject7 = new Object();

	@OriginalMember(owner = "client!afc", name = "bw", descriptor = "Lclient!pq;")
	static final Class489 aClass489_77 = new Class489();

	@OriginalMember(owner = "client!afc", name = "dj", descriptor = "[Lclient!akf;")
	protected Class93_Sub16[] aClass93_Sub16Array19;

	@OriginalMember(owner = "client!afc", name = "ak", descriptor = "J")
	public long aLong132;

	@OriginalMember(owner = "client!afc", name = "bl", descriptor = "Lclient!lp;")
	Class402 aClass402_4;

	@OriginalMember(owner = "client!afc", name = "bx", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!afc", name = "bd", descriptor = "I")
	public int anInt2917;

	@OriginalMember(owner = "client!afc", name = "gd", descriptor = "Lclient!lo;")
	Class145 aClass145_17;

	@OriginalMember(owner = "client!afc", name = "eg", descriptor = "Lclient!aef;")
	Class100_Sub1 aClass100_Sub1_5;

	@OriginalMember(owner = "client!afc", name = "ea", descriptor = "Lclient!lc;")
	Class128 aClass128_3;

	@OriginalMember(owner = "client!afc", name = "af", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!afc", name = "gh", descriptor = "Z")
	protected boolean aBoolean461;

	@OriginalMember(owner = "client!afc", name = "ha", descriptor = "Lclient!ml;")
	Interface40 anInterface40_4;

	@OriginalMember(owner = "client!afc", name = "cx", descriptor = "F")
	float aFloat200;

	@OriginalMember(owner = "client!afc", name = "cw", descriptor = "F")
	float aFloat201;

	@OriginalMember(owner = "client!afc", name = "ct", descriptor = "F")
	float aFloat202;

	@OriginalMember(owner = "client!afc", name = "cf", descriptor = "F")
	float aFloat203;

	@OriginalMember(owner = "client!afc", name = "el", descriptor = "[Lclient!mq;")
	Interface43[] anInterface43Array3;

	@OriginalMember(owner = "client!afc", name = "gc", descriptor = "I")
	protected int anInt2920;

	@OriginalMember(owner = "client!afc", name = "ab", descriptor = "Z")
	protected boolean aBoolean463;

	@OriginalMember(owner = "client!afc", name = "hg", descriptor = "Lclient!mi;")
	Class419 aClass419_3;

	@OriginalMember(owner = "client!afc", name = "eb", descriptor = "Lclient!jz;")
	Class130 aClass130_3;

	@OriginalMember(owner = "client!afc", name = "gt", descriptor = "Z")
	protected boolean aBoolean470;

	@OriginalMember(owner = "client!afc", name = "bc", descriptor = "I")
	protected int anInt2931;

	@OriginalMember(owner = "client!afc", name = "fo", descriptor = "F")
	protected float aFloat209;

	@OriginalMember(owner = "client!afc", name = "gs", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!afc", name = "eo", descriptor = "I")
	protected int anInt2933;

	@OriginalMember(owner = "client!afc", name = "ey", descriptor = "I")
	protected int anInt2934;

	@OriginalMember(owner = "client!afc", name = "ee", descriptor = "I")
	int anInt2937;

	@OriginalMember(owner = "client!afc", name = "es", descriptor = "I")
	int anInt2938;

	@OriginalMember(owner = "client!afc", name = "fx", descriptor = "Z")
	boolean aBoolean473;

	@OriginalMember(owner = "client!afc", name = "gx", descriptor = "Z")
	protected boolean aBoolean474;

	@OriginalMember(owner = "client!afc", name = "ep", descriptor = "[Lclient!mv;")
	protected Class425[] aClass425Array3;

	@OriginalMember(owner = "client!afc", name = "ev", descriptor = "[Lclient!mk;")
	protected Class421[] aClass421Array5;

	@OriginalMember(owner = "client!afc", name = "ec", descriptor = "[Lclient!mk;")
	protected Class421[] aClass421Array6;

	@OriginalMember(owner = "client!afc", name = "eh", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_23;

	@OriginalMember(owner = "client!afc", name = "eq", descriptor = "Lclient!lz;")
	Interface38 anInterface38_24;

	@OriginalMember(owner = "client!afc", name = "ez", descriptor = "Lclient!aef;")
	Class100_Sub1 aClass100_Sub1_6;

	@OriginalMember(owner = "client!afc", name = "et", descriptor = "Lclient!md;")
	Class414 aClass414_3;

	@OriginalMember(owner = "client!afc", name = "er", descriptor = "Lclient!jj;")
	Class131 aClass131_3;

	@OriginalMember(owner = "client!afc", name = "en", descriptor = "Lclient!jc;")
	Class134 aClass134_3;

	@OriginalMember(owner = "client!afc", name = "gw", descriptor = "Lclient!lo;")
	Class145 aClass145_18;

	@OriginalMember(owner = "client!afc", name = "ex", descriptor = "Lclient!jo;")
	Class126 aClass126_3;

	@OriginalMember(owner = "client!afc", name = "fg", descriptor = "Lclient!aqe;")
	Class128_Sub1_Sub1 aClass128_Sub1_Sub1_5;

	@OriginalMember(owner = "client!afc", name = "fu", descriptor = "Lclient!aqe;")
	Class128_Sub1_Sub1 aClass128_Sub1_Sub1_6;

	@OriginalMember(owner = "client!afc", name = "bk", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!afc", name = "fz", descriptor = "Lclient!ls;")
	Class404 aClass404_3;

	@OriginalMember(owner = "client!afc", name = "gf", descriptor = "Z")
	public boolean aBoolean476;

	@OriginalMember(owner = "client!afc", name = "ek", descriptor = "I")
	protected int anInt2945;

	@OriginalMember(owner = "client!afc", name = "ft", descriptor = "Lclient!afe;")
	Class107_Sub1 aClass107_Sub1_3;

	@OriginalMember(owner = "client!afc", name = "ej", descriptor = "[Lclient!pq;")
	protected Class489[] aClass489Array5;

	@OriginalMember(owner = "client!afc", name = "fc", descriptor = "I")
	int anInt2946;

	@OriginalMember(owner = "client!afc", name = "fw", descriptor = "Lclient!dy;")
	Class237 aClass237_6;

	@OriginalMember(owner = "client!afc", name = "fa", descriptor = "Z")
	protected boolean aBoolean478;

	@OriginalMember(owner = "client!afc", name = "fb", descriptor = "F")
	protected float aFloat216;

	@OriginalMember(owner = "client!afc", name = "gg", descriptor = "Z")
	protected boolean aBoolean480;

	@OriginalMember(owner = "client!afc", name = "fs", descriptor = "Lclient!aqw;")
	Class128_Sub1_Sub2 aClass128_Sub1_Sub2_3;

	@OriginalMember(owner = "client!afc", name = "go", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!afc", name = "hd", descriptor = "Z")
	protected boolean aBoolean482;

	@OriginalMember(owner = "client!afc", name = "gz", descriptor = "Lclient!lo;")
	Class145 aClass145_19;

	@OriginalMember(owner = "client!afc", name = "gn", descriptor = "I")
	public int anInt2954;

	@OriginalMember(owner = "client!afc", name = "gr", descriptor = "Z")
	protected boolean aBoolean484;

	@OriginalMember(owner = "client!afc", name = "gj", descriptor = "Lclient!lr;")
	Interface37 anInterface37_15;

	@OriginalMember(owner = "client!afc", name = "gm", descriptor = "Lclient!lr;")
	Interface37 anInterface37_16;

	@OriginalMember(owner = "client!afc", name = "gv", descriptor = "Lclient!lr;")
	Interface37 anInterface37_17;

	@OriginalMember(owner = "client!afc", name = "gy", descriptor = "Lclient!ld;")
	Class395 aClass395_3;

	@OriginalMember(owner = "client!afc", name = "ge", descriptor = "Z")
	protected boolean aBoolean486;

	@OriginalMember(owner = "client!afc", name = "gb", descriptor = "Lclient!lo;")
	Class145 aClass145_20;

	@OriginalMember(owner = "client!afc", name = "gi", descriptor = "Lclient!lo;")
	Class145 aClass145_21;

	@OriginalMember(owner = "client!afc", name = "hm", descriptor = "Lclient!lo;")
	Class145 aClass145_22;

	@OriginalMember(owner = "client!afc", name = "gk", descriptor = "I")
	int anInt2959;

	@OriginalMember(owner = "client!afc", name = "ad", descriptor = "Lclient!adc;")
	Class78 aClass78_3 = new Class78();

	@OriginalMember(owner = "client!afc", name = "bf", descriptor = "I")
	int anInt2915 = 0;

	@OriginalMember(owner = "client!afc", name = "bh", descriptor = "Lclient!aat;")
	Class22 aClass22_34 = new Class22();

	@OriginalMember(owner = "client!afc", name = "bi", descriptor = "Lclient!ou;")
	Class470 aClass470_37 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bn", descriptor = "Lclient!pq;")
	Class489 aClass489_74 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bt", descriptor = "Lclient!ou;")
	Class470 aClass470_38 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bq", descriptor = "Lclient!ou;")
	Class470 aClass470_34 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bm", descriptor = "Lclient!pq;")
	public Class489 aClass489_75 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bb", descriptor = "Lclient!pq;")
	Class489 aClass489_72 = new Class489();

	@OriginalMember(owner = "client!afc", name = "be", descriptor = "Lclient!pq;")
	Class489 aClass489_87 = new Class489();

	@OriginalMember(owner = "client!afc", name = "by", descriptor = "Lclient!ou;")
	Class470 aClass470_35 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bu", descriptor = "Lclient!pq;")
	Class489 aClass489_76 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bo", descriptor = "Lclient!ou;")
	Class470 aClass470_36 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bz", descriptor = "Lclient!pq;")
	protected Class489 aClass489_78 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bv", descriptor = "Lclient!pq;")
	Class489 aClass489_73 = new Class489();

	@OriginalMember(owner = "client!afc", name = "br", descriptor = "Lclient!ox;")
	Class472 aClass472_59 = new Class472();

	@OriginalMember(owner = "client!afc", name = "bg", descriptor = "[F")
	float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!afc", name = "ba", descriptor = "Z")
	boolean aBoolean460 = false;

	@OriginalMember(owner = "client!afc", name = "bp", descriptor = "Lclient!lw;")
	Class408 aClass408_3 = Class408.aClass408_4;

	@OriginalMember(owner = "client!afc", name = "bj", descriptor = "Z")
	boolean aBoolean471 = false;

	@OriginalMember(owner = "client!afc", name = "bs", descriptor = "Lclient!pq;")
	Class489 aClass489_80 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cl", descriptor = "Lclient!pq;")
	Class489 aClass489_79 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cg", descriptor = "Z")
	boolean aBoolean485 = false;

	@OriginalMember(owner = "client!afc", name = "ce", descriptor = "Lclient!pq;")
	Class489 aClass489_81 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cu", descriptor = "Lclient!pq;")
	Class489 aClass489_86 = new Class489();

	@OriginalMember(owner = "client!afc", name = "ci", descriptor = "Lclient!pq;")
	Class489 aClass489_82 = this.aClass489_86;

	@OriginalMember(owner = "client!afc", name = "cn", descriptor = "Lclient!pq;")
	public Class489 aClass489_83 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cv", descriptor = "Lclient!pq;")
	Class489 aClass489_85 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cp", descriptor = "Lclient!pq;")
	public Class489 aClass489_84 = new Class489();

	@OriginalMember(owner = "client!afc", name = "ca", descriptor = "[[F")
	float[][] aFloatArrayArray22 = new float[6][4];

	@OriginalMember(owner = "client!afc", name = "co", descriptor = "F")
	protected float aFloat204 = 0.0F;

	@OriginalMember(owner = "client!afc", name = "cr", descriptor = "F")
	protected float aFloat205 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "cm", descriptor = "F")
	float aFloat206 = 0.0F;

	@OriginalMember(owner = "client!afc", name = "cq", descriptor = "F")
	float aFloat207 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "ch", descriptor = "F")
	protected float aFloat215 = 50.0F;

	@OriginalMember(owner = "client!afc", name = "cb", descriptor = "F")
	protected float aFloat208 = 3584.0F;

	@OriginalMember(owner = "client!afc", name = "cs", descriptor = "I")
	protected int anInt2940 = 0;

	@OriginalMember(owner = "client!afc", name = "cy", descriptor = "I")
	protected int anInt2930 = 0;

	@OriginalMember(owner = "client!afc", name = "cc", descriptor = "I")
	protected int anInt2921 = 0;

	@OriginalMember(owner = "client!afc", name = "cz", descriptor = "I")
	protected int anInt2958 = 0;

	@OriginalMember(owner = "client!afc", name = "ck", descriptor = "I")
	int anInt2923 = 0;

	@OriginalMember(owner = "client!afc", name = "cj", descriptor = "I")
	int anInt2924 = 0;

	@OriginalMember(owner = "client!afc", name = "cd", descriptor = "I")
	int anInt2941 = 0;

	@OriginalMember(owner = "client!afc", name = "dd", descriptor = "I")
	int anInt2919 = 0;

	@OriginalMember(owner = "client!afc", name = "dr", descriptor = "I")
	protected int anInt2925 = 0;

	@OriginalMember(owner = "client!afc", name = "da", descriptor = "I")
	protected int anInt2926 = 0;

	@OriginalMember(owner = "client!afc", name = "dt", descriptor = "I")
	protected int anInt2927 = 0;

	@OriginalMember(owner = "client!afc", name = "do", descriptor = "I")
	protected int anInt2928 = 0;

	@OriginalMember(owner = "client!afc", name = "dz", descriptor = "I")
	protected int anInt2929 = 0;

	@OriginalMember(owner = "client!afc", name = "dv", descriptor = "I")
	protected int anInt2939 = 0;

	@OriginalMember(owner = "client!afc", name = "dm", descriptor = "Z")
	protected boolean aBoolean464 = true;

	@OriginalMember(owner = "client!afc", name = "dq", descriptor = "Z")
	protected boolean aBoolean465 = false;

	@OriginalMember(owner = "client!afc", name = "dc", descriptor = "Z")
	protected boolean aBoolean466 = true;

	@OriginalMember(owner = "client!afc", name = "di", descriptor = "Z")
	protected boolean aBoolean459 = false;

	@OriginalMember(owner = "client!afc", name = "dk", descriptor = "Z")
	protected boolean aBoolean467 = false;

	@OriginalMember(owner = "client!afc", name = "dn", descriptor = "Z")
	protected boolean aBoolean468 = true;

	@OriginalMember(owner = "client!afc", name = "df", descriptor = "Z")
	protected boolean aBoolean469 = false;

	@OriginalMember(owner = "client!afc", name = "dw", descriptor = "[F")
	public float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "ds", descriptor = "[F")
	protected float[] aFloatArray61 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "du", descriptor = "[F")
	float[] aFloatArray64 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "dl", descriptor = "[F")
	float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "dp", descriptor = "I")
	int anInt2932 = 16777215;

	@OriginalMember(owner = "client!afc", name = "dy", descriptor = "F")
	public float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "db", descriptor = "F")
	public float aFloat210 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "dh", descriptor = "F")
	public float aFloat217 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "dx", descriptor = "F")
	protected float aFloat211 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "dg", descriptor = "F")
	public float aFloat212 = -1.0F;

	@OriginalMember(owner = "client!afc", name = "de", descriptor = "F")
	protected float aFloat213 = -1.0F;

	@OriginalMember(owner = "client!afc", name = "eu", descriptor = "I")
	int anInt2935 = 8;

	@OriginalMember(owner = "client!afc", name = "ed", descriptor = "I")
	int anInt2936 = 3;

	@OriginalMember(owner = "client!afc", name = "ei", descriptor = "I")
	protected int anInt2949 = 0;

	@OriginalMember(owner = "client!afc", name = "ef", descriptor = "Z")
	boolean aBoolean475 = false;

	@OriginalMember(owner = "client!afc", name = "ew", descriptor = "[Lclient!lc;")
	final Class128[] aClass128Array3 = new Class128[16];

	@OriginalMember(owner = "client!afc", name = "fi", descriptor = "[Lclient!lh;")
	final Class137[] aClass137Array3 = new Class137[4];

	@OriginalMember(owner = "client!afc", name = "fv", descriptor = "Z")
	boolean aBoolean477 = false;

	@OriginalMember(owner = "client!afc", name = "fp", descriptor = "Z")
	protected boolean aBoolean479 = true;

	@OriginalMember(owner = "client!afc", name = "fq", descriptor = "I")
	protected int anInt2957 = -1;

	@OriginalMember(owner = "client!afc", name = "ff", descriptor = "I")
	protected int anInt2947 = -1;

	@OriginalMember(owner = "client!afc", name = "fl", descriptor = "I")
	protected int anInt2956 = 0;

	@OriginalMember(owner = "client!afc", name = "fy", descriptor = "I")
	int anInt2922 = 1;

	@OriginalMember(owner = "client!afc", name = "fe", descriptor = "I")
	protected int anInt2948 = -1;

	@OriginalMember(owner = "client!afc", name = "fk", descriptor = "Lclient!me;")
	protected Class415 aClass415_3 = Class415.aClass415_7;

	@OriginalMember(owner = "client!afc", name = "fh", descriptor = "Z")
	protected boolean aBoolean481 = true;

	@OriginalMember(owner = "client!afc", name = "fr", descriptor = "Z")
	protected boolean aBoolean462 = true;

	@OriginalMember(owner = "client!afc", name = "gu", descriptor = "B")
	protected byte aByte76 = 0;

	@OriginalMember(owner = "client!afc", name = "gq", descriptor = "I")
	protected int anInt2950 = 2;

	@OriginalMember(owner = "client!afc", name = "gp", descriptor = "Z")
	boolean aBoolean483 = false;

	@OriginalMember(owner = "client!afc", name = "hk", descriptor = "[Lclient!afo;")
	Class109_Sub3[] aClass109_Sub3Array5;

	@OriginalMember(owner = "client!afc", name = "hu", descriptor = "[Lclient!afo;")
	Class109_Sub3[] aClass109_Sub3Array6;

	@OriginalMember(owner = "client!afc", name = "hb", descriptor = "Lclient!pq;")
	Class489 aClass489_88;

	@OriginalMember(owner = "client!afc", name = "hl", descriptor = "Lclient!ou;")
	Class470 aClass470_39;

	@OriginalMember(owner = "client!afc", name = "ay", descriptor = "Lclient!py;")
	final Class497 aClass497_92;

	@OriginalMember(owner = "client!afc", name = "gl", descriptor = "I")
	public final int anInt2951;

	@OriginalMember(owner = "client!afc", name = "ga", descriptor = "I")
	int anInt2953;

	@OriginalMember(owner = "client!afc", name = "em", descriptor = "Lclient!lu;")
	final Class406 aClass406_3;

	@OriginalMember(owner = "client!afc", name = "az", descriptor = "[I")
	int[] anIntArray251;

	@OriginalMember(owner = "client!afc", name = "aa", descriptor = "Lsun/misc/Unsafe;")
	protected Unsafe anUnsafe4;

	@OriginalMember(owner = "client!afc", name = "rb", descriptor = "()V")
	public static void method20908() throws Exception_Sub1 {
		Class376.method28227(672839876).method31798("jaclib", (byte) -64);
	}

	@OriginalMember(owner = "client!afc", name = "wv", descriptor = "(CCCC)I")
	static int method21022(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afc", name = "xd", descriptor = "()V")
	public static void method21034() throws Exception_Sub1 {
		Class376.method28227(672839876).method31798("jaclib", (byte) 114);
	}

	@OriginalMember(owner = "client!afc", name = "ahw", descriptor = "(CCCC)I")
	static int method21132(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afc", name = "xj", descriptor = "()V")
	public static void method21300() throws Exception_Sub1 {
		Class376.method28227(672839876).method31798("jaclib", (byte) 57);
	}

	@OriginalMember(owner = "client!afc", name = "ahj", descriptor = "(CCCC)I")
	static int method21304(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afc", name = "<init>", descriptor = "(Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;II)V")
	Class104_Sub2(@OriginalArg(0) Class225 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) Interface48 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Class497 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		new Stream();
		this.aClass109_Sub3Array5 = new Class109_Sub3[8];
		this.aClass109_Sub3Array6 = new Class109_Sub3[8];
		this.aClass489_88 = new Class489();
		this.aClass470_39 = new Class470();
		try {
			this.aClass497_92 = arg5;
			this.anInt2951 = arg6;
			this.anInt2953 = arg7;
			Class660.method33006(false, true, 1971326861);
			if (this.anInterface24_6 == null) {
				this.aClass406_3 = null;
			} else {
				this.aClass406_3 = new Class406(this, this.anInterface24_6);
			}
			if (this.anInt2953 == 0) {
				this.anIntArray251 = Class685.anIntArray526;
			} else {
				this.anIntArray251 = Class685.anIntArray525;
			}
			try {
				@Pc(449) Field local449 = Unsafe.class.getDeclaredField("theUnsafe");
				local449.setAccessible(true);
				this.anUnsafe4 = (Unsafe) local449.get(null);
			} catch (@Pc(460) Exception local460) {
			}
			this.method20901(4194304);
		} catch (@Pc(465) Throwable local465) {
			local465.printStackTrace();
			this.method20889(8392446);
			if (local465 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local465;
			}
			throw new RuntimeException("");
		}
		this.method20506(this.method20532(131072));
	}

	@OriginalMember(owner = "client!afc", name = "sr", descriptor = "()F")
	public abstract float method20894();

	@OriginalMember(owner = "client!afc", name = "sb", descriptor = "()V")
	abstract void method20895();

	@OriginalMember(owner = "client!afc", name = "ra", descriptor = "()V")
	final void method20896() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305(16711935);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method31065();
		}
	}

	@OriginalMember(owner = "client!afc", name = "rx", descriptor = "()Z")
	public abstract boolean method20897();

	@OriginalMember(owner = "client!afc", name = "ry", descriptor = "()Z")
	public abstract boolean method20898();

	@OriginalMember(owner = "client!afc", name = "rg", descriptor = "(Z)Z")
	public abstract boolean method20899(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "xf", descriptor = "()V")
	final void method20900() {
		this.aClass402_4 = new Class402(this);
		this.aBoolean463 = false;
		try {
			this.aClass131_3 = new Class131_Sub2(this);
			this.aClass134_3 = new Class134_Sub2(this);
			this.aClass130_3 = new Class130_Sub2(this);
			this.aClass126_3 = new Class126_Sub2(this);
			this.aClass128_Sub1_Sub1_5 = new Class128_Sub1_Sub1(this, this.aClass402_4, false);
			this.aClass128_Sub1_Sub1_6 = new Class128_Sub1_Sub1(this, this.aClass402_4, true);
			this.aClass128_Sub1_Sub2_3 = new Class128_Sub1_Sub2(this, this.aClass402_4);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass131_3 = new Class131_Sub1(this);
			this.aClass134_3 = new Class134_Sub1(this);
			this.aClass130_3 = new Class130_Sub1(this);
			this.aClass126_3 = new Class126_Sub1(this);
			this.aClass128_Sub1_Sub1_5 = null;
			this.aClass128_Sub1_Sub1_6 = null;
			this.aClass128_Sub1_Sub2_3 = null;
			this.aBoolean463 = true;
		}
		if (!this.aBoolean463) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass112_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass112_6.method23748();
				local112 = this.aClass112_6.method23749();
			}
			this.aClass404_3 = new Class404(this, local108, local112);
			this.aClass137Array3[3] = new Class137_Sub2(this);
			this.aClass137Array3[1] = new Class137_Sub1(this);
			this.aClass137Array3[2] = new Class137_Sub3(this);
			if (this.aClass137Array3[3].method11447()) {
				this.aClass404_3.method28703(this.aClass137Array3[3]);
			}
			this.aClass404_3.method28703(this.aClass137Array3[1]);
			this.aClass404_3.method28703(this.aClass137Array3[2]);
			this.method20920();
			this.method20926();
		}
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21356();
			this.aClass128_3 = null;
		}
		this.method21045();
	}

	@OriginalMember(owner = "client!afc", name = "re", descriptor = "(I)V")
	public final void method20901(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2915) {
			this.anInt2915 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2915);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong132 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!afc", name = "zc", descriptor = "()V")
	abstract void method20902();

	@OriginalMember(owner = "client!afc", name = "rl", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method20903(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "rc", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	public abstract Class115 method20904(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afc", name = "rr", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	final byte[] method20905(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass497_92.method30252(arg0, arg1, 1200487767);
	}

	@OriginalMember(owner = "client!afc", name = "zp", descriptor = "()V")
	abstract void method20906();

	@OriginalMember(owner = "client!afc", name = "rn", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method20907(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "ru", descriptor = "()V")
	public final void method20909() {
		this.anInterface43Array3 = new Interface43[this.anInt2954];
		this.aClass489Array5 = new Class489[this.anInt2954];
		this.aClass425Array3 = new Class425[this.anInt2954];
		this.aClass421Array5 = new Class421[this.anInt2954];
		this.aClass421Array6 = new Class421[this.anInt2954];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2954; local26++) {
			this.aClass421Array6[local26] = Class421.aClass421_1;
			this.aClass421Array5[local26] = Class421.aClass421_1;
			this.aClass425Array3[local26] = Class425.aClass425_3;
			this.aClass489Array5[local26] = new Class489();
		}
		this.aClass93_Sub16Array19 = new Class93_Sub16[this.anInt2920 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface38_23 = this.method20973(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface38_24 = this.method20973(1, 1, false, local68, 0, 0);
		this.method20506(new Class93_Sub35_Sub1(262144));
		this.aClass145_21 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }) });
		this.aClass145_22 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass145_20 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1), new Class400(Class399.aClass399_2) });
		this.aClass145_19 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass109_Sub3Array5[local205] = new Class109_Sub3(this, 0, 0, false, false);
			this.aClass109_Sub3Array6[local205] = new Class109_Sub3(this, 0, 0, true, true);
		}
		this.method20910();
		this.anInterface40_4 = this.method21007(true);
		this.method21173();
		this.method20478();
		this.method20461();
		this.aClass100_Sub1_5 = new Class100_Sub1(this, this.anInterface38_23);
		this.aClass100_Sub1_6 = new Class100_Sub1(this, this.anInterface38_24);
		this.method20786(3, 0);
	}

	@OriginalMember(owner = "client!afc", name = "sv", descriptor = "()V")
	final void method20910() {
		this.aClass402_4 = new Class402(this);
		this.aBoolean463 = false;
		try {
			this.aClass131_3 = new Class131_Sub2(this);
			this.aClass134_3 = new Class134_Sub2(this);
			this.aClass130_3 = new Class130_Sub2(this);
			this.aClass126_3 = new Class126_Sub2(this);
			this.aClass128_Sub1_Sub1_5 = new Class128_Sub1_Sub1(this, this.aClass402_4, false);
			this.aClass128_Sub1_Sub1_6 = new Class128_Sub1_Sub1(this, this.aClass402_4, true);
			this.aClass128_Sub1_Sub2_3 = new Class128_Sub1_Sub2(this, this.aClass402_4);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass131_3 = new Class131_Sub1(this);
			this.aClass134_3 = new Class134_Sub1(this);
			this.aClass130_3 = new Class130_Sub1(this);
			this.aClass126_3 = new Class126_Sub1(this);
			this.aClass128_Sub1_Sub1_5 = null;
			this.aClass128_Sub1_Sub1_6 = null;
			this.aClass128_Sub1_Sub2_3 = null;
			this.aBoolean463 = true;
		}
		if (!this.aBoolean463) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass112_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass112_6.method23748();
				local112 = this.aClass112_6.method23749();
			}
			this.aClass404_3 = new Class404(this, local108, local112);
			this.aClass137Array3[3] = new Class137_Sub2(this);
			this.aClass137Array3[1] = new Class137_Sub1(this);
			this.aClass137Array3[2] = new Class137_Sub3(this);
			if (this.aClass137Array3[3].method11447()) {
				this.aClass404_3.method28703(this.aClass137Array3[3]);
			}
			this.aClass404_3.method28703(this.aClass137Array3[1]);
			this.aClass404_3.method28703(this.aClass137Array3[2]);
			this.method20920();
			this.method20926();
		}
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21356();
			this.aClass128_3 = null;
		}
		this.method21045();
	}

	@OriginalMember(owner = "client!afc", name = "rd", descriptor = "([B)Lclient!hj;")
	final Class314 method20911(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class314(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aay", descriptor = "()V")
	final void method20912() {
		if (this.aBoolean471) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23748();
			local13 = this.aClass112_6.method23749();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method30017();
		} else {
			local21.method30031(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method30018(local21);
		this.method20946(this.aClass489_79);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!afc", name = "sx", descriptor = "()V")
	void method20913() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28711();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method31065();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method31065();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method31065();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28890();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28516();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method31065();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28853();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "iu", descriptor = "([I)V")
	@Override
	public final void method20591(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2921;
		arg0[1] = this.anInt2940;
		arg0[2] = this.anInt2958;
		arg0[3] = this.anInt2930;
	}

	@OriginalMember(owner = "client!afc", name = "sk", descriptor = "()V")
	final void method20914() {
		this.anInterface37_17 = this.method21025(false);
		@Pc(6) short local6 = 160;
		this.anInterface37_17.method29496(local6, 32);
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
		this.anInterface37_17.method29514(0, this.aByteBuffer7.position(), this.aLong132);
		this.aClass145_17 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1, Class399.aClass399_1 }) });
	}

	@OriginalMember(owner = "client!afc", name = "ug", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	abstract Interface38 method20915(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "se", descriptor = "()V")
	final void method20916() {
		this.anInterface37_15 = this.method21025(false);
		this.anInterface37_15.method29496(3096, 12);
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
		this.anInterface37_15.method29514(0, this.aByteBuffer7.position(), this.aLong132);
	}

	@OriginalMember(owner = "client!afc", name = "sn", descriptor = "(FFFFFF)Z")
	final boolean method20917(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method20901(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface37_16.method29514(0, this.aByteBuffer7.position(), this.aLong132);
	}

	@OriginalMember(owner = "client!afc", name = "p", descriptor = "()V")
	@Override
	void method20680() {
		if (this.aBoolean483) {
			return;
		}
		this.method20913();
		this.aClass406_3.method28748();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445((byte) 18); local12 != null; local12 = this.aClass22_34.method415(634413421)) {
			((Class93_Sub35_Sub1) local12).method18369();
		}
		Class46.method896(false, true, 1569892852);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21369();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20896();
		this.method20431(0);
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!afc", name = "r", descriptor = "()Z")
	@Override
	public final boolean method20505() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "v", descriptor = "()Z")
	@Override
	public final boolean method20434() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "o", descriptor = "()Z")
	@Override
	public final boolean method20435() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "y", descriptor = "()Z")
	@Override
	public final boolean method20577() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "vz", descriptor = "()V")
	abstract void method20918();

	@OriginalMember(owner = "client!afc", name = "s", descriptor = "()Z")
	@Override
	public final boolean method20436() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "b", descriptor = "()Z")
	@Override
	public final boolean method20440() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "xp", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	final byte[] method20919(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass497_92.method30252(arg0, arg1, 1200487767);
	}

	@OriginalMember(owner = "client!afc", name = "sl", descriptor = "()Z")
	final boolean method20920() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "co", descriptor = "(Lclient!de;Z)Lclient!cm;")
	@Override
	public final Class100 method20511(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class100 local21;
		if (arg0.method7206() == 0 || arg0.method7198() == 0) {
			local21 = this.method20510(new int[] { 0 }, 0, 1, 1, 1, 438797212);
		} else {
			@Pc(9) int[] local9 = arg0.method7171(false);
			local21 = this.method20510(local9, 0, arg0.method7206(), arg0.method7206(), arg0.method7198(), 438797212);
		}
		local21.method18174(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local21;
	}

	@OriginalMember(owner = "client!afc", name = "ki", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20644() {
		return this.aClass489_88;
	}

	@OriginalMember(owner = "client!afc", name = "g", descriptor = "()Ljava/lang/String;")
	public abstract String method20443();

	@OriginalMember(owner = "client!afc", name = "i", descriptor = "()[I")
	@Override
	public final int[] method20724() {
		return null;
	}

	@OriginalMember(owner = "client!afc", name = "d", descriptor = "(I)V")
	@Override
	public void method20431(@OriginalArg(0) int arg0) {
		if (this.aClass406_3 != null) {
			this.aClass406_3.method28747();
		}
		this.anInt2952 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!afc", name = "ty", descriptor = "()V")
	final void method20921() {
		if (this.aClass408_3 == Class408.aClass408_5) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_5;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.method21026();
		this.aClass489_82 = this.aClass489_80;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afc", name = "cm", descriptor = "()V")
	@Override
	public final void method20513() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28854();
		}
	}

	@OriginalMember(owner = "client!afc", name = "cq", descriptor = "()V")
	@Override
	public final void method20514() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28863();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ch", descriptor = "()V")
	@Override
	public final void method20515() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28860();
		}
	}

	@OriginalMember(owner = "client!afc", name = "jx", descriptor = "(I)V")
	@Override
	public final void method20606(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "st", descriptor = "()V")
	final void method20922() {
		this.method20949();
		this.method20951();
		this.method21024();
		this.method20574();
		this.method20478();
	}

	@OriginalMember(owner = "client!afc", name = "dy", descriptor = "(IIII)V")
	@Override
	public final void method20483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28704(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28711();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "db", descriptor = "(II)V")
	@Override
	public final void method20544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28709(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afc", name = "dh", descriptor = "()Z")
	@Override
	public final boolean method20545() {
		return this.aClass404_3 != null && this.aClass404_3.aBoolean756;
	}

	@OriginalMember(owner = "client!afc", name = "xq", descriptor = "()V")
	final void method20923() {
		this.aClass402_4 = new Class402(this);
		this.aBoolean463 = false;
		try {
			this.aClass131_3 = new Class131_Sub2(this);
			this.aClass134_3 = new Class134_Sub2(this);
			this.aClass130_3 = new Class130_Sub2(this);
			this.aClass126_3 = new Class126_Sub2(this);
			this.aClass128_Sub1_Sub1_5 = new Class128_Sub1_Sub1(this, this.aClass402_4, false);
			this.aClass128_Sub1_Sub1_6 = new Class128_Sub1_Sub1(this, this.aClass402_4, true);
			this.aClass128_Sub1_Sub2_3 = new Class128_Sub1_Sub2(this, this.aClass402_4);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass131_3 = new Class131_Sub1(this);
			this.aClass134_3 = new Class134_Sub1(this);
			this.aClass130_3 = new Class130_Sub1(this);
			this.aClass126_3 = new Class126_Sub1(this);
			this.aClass128_Sub1_Sub1_5 = null;
			this.aClass128_Sub1_Sub1_6 = null;
			this.aClass128_Sub1_Sub2_3 = null;
			this.aBoolean463 = true;
		}
		if (!this.aBoolean463) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass112_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass112_6.method23748();
				local112 = this.aClass112_6.method23749();
			}
			this.aClass404_3 = new Class404(this, local108, local112);
			this.aClass137Array3[3] = new Class137_Sub2(this);
			this.aClass137Array3[1] = new Class137_Sub1(this);
			this.aClass137Array3[2] = new Class137_Sub3(this);
			if (this.aClass137Array3[3].method11447()) {
				this.aClass404_3.method28703(this.aClass137Array3[3]);
			}
			this.aClass404_3.method28703(this.aClass137Array3[1]);
			this.aClass404_3.method28703(this.aClass137Array3[2]);
			this.method20920();
			this.method20926();
		}
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21356();
			this.aClass128_3 = null;
		}
		this.method21045();
	}

	@OriginalMember(owner = "client!afc", name = "dx", descriptor = "()Z")
	@Override
	public final boolean method20463() {
		return this.aClass137Array3[1] != null && this.aClass137Array3[1].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "aey", descriptor = "()Lclient!pq;")
	final Class489 method20924() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "rv", descriptor = "(Lclient!le;)V")
	public final void method20925(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1303(arg0, anObject7, -234932864);
	}

	@OriginalMember(owner = "client!afc", name = "sp", descriptor = "()Z")
	final boolean method20926() {
		if (this.aClass137Array3[2] == null || this.aClass137Array3[2].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[2]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "dj", descriptor = "()Z")
	@Override
	public final boolean method20549() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "jq", descriptor = "(ILclient!ch;II)V")
	@Override
	public final void method20693(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20530(false);
		this.aClass100_Sub1_6.method18196(0.0F, 0.0F, (float) this.method20446((byte) -26).method23748(), 0.0F, 0.0F, (float) this.method20446((byte) -52).method23749(), 0, arg1, arg2, arg3);
		this.method20530(true);
	}

	@OriginalMember(owner = "client!afc", name = "ku", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class99 method20710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "nr", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method20629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20921();
		@Pc(50) Class128 local50 = this.aClass128Array3[13];
		local50.method21357();
		local50.method21373(arg4);
		this.method20994(arg5);
		local50.method21361();
		this.method21235(false);
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
			if (!this.method20917(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21014();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21235(true);
		local50.method21356();
	}

	@OriginalMember(owner = "client!afc", name = "ed", descriptor = "()Z")
	@Override
	public final boolean method20553() {
		return this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "es", descriptor = "(FFFFFF)V")
	@Override
	final void method20555(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class137_Sub2.aFloat133 = arg0;
		Class137_Sub2.aFloat132 = arg1;
		Class137_Sub2.aFloat131 = arg2;
		Class137_Sub2.aFloat134 = arg5;
	}

	@OriginalMember(owner = "client!afc", name = "cp", descriptor = "(I)Lclient!akz;")
	@Override
	public final Class93_Sub35 method20532(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub35_Sub1 local4 = new Class93_Sub35_Sub1(arg0);
		this.aClass22_34.method407(local4, -304720722);
		return local4;
	}

	@OriginalMember(owner = "client!afc", name = "eo", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V")
	@Override
	public final void method20550(@OriginalArg(0) Class102 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class102 arg4, @OriginalArg(5) float arg5) {
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
		Class137_Sub3.aClass102_Sub2Array1[0] = (Class102_Sub2) arg0;
		Class137_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[1] = (Class102_Sub2) arg2;
		Class137_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[2] = (Class102_Sub2) arg4;
		Class137_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class137_Sub3.anInt1379 = local1;
		Class137_Sub3.aFloat139 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afc", name = "su", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method20927(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap6.method27847(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "sd", descriptor = "(I)Lclient!ml;")
	final Interface40 method20928(@OriginalArg(0) int arg0) {
		if (this.anInterface40_4.method29519() < arg0 * 2) {
			this.anInterface40_4.method29532(arg0);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!afc", name = "sh", descriptor = "()V")
	final void method20929() {
		this.method20922();
	}

	@OriginalMember(owner = "client!afc", name = "cw", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class100 method20508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "tq", descriptor = "()V")
	abstract void method20930();

	@OriginalMember(owner = "client!afc", name = "ct", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public final Class100 method20499(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class100_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "cr", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class100 method20625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class100_Sub1 local8 = new Class100_Sub1(this, arg2, arg3, arg4, false);
		local8.method18182(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afc", name = "jr", descriptor = "(II[I[I)Lclient!ch;")
	@Override
	public final Class96 method20536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "cb", descriptor = "(II[I[I)Lclient!ch;")
	@Override
	public final Class96 method20516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "uh", descriptor = "(I)V")
	public final void method20931(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21055(Class421.aClass421_1, Class421.aClass421_1);
				break;
			case 1:
				this.method21055(Class421.aClass421_2, Class421.aClass421_2);
				break;
			case 2:
				this.method21055(Class421.aClass421_5, Class421.aClass421_2);
				break;
			case 3:
				this.method21055(Class421.aClass421_3, Class421.aClass421_1);
				break;
			case 4:
				this.method21055(Class421.aClass421_4, Class421.aClass421_4);
		}
	}

	@OriginalMember(owner = "client!afc", name = "cj", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	@Override
	public final Class109 method20522(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "uf", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;")
	final Interface38 method20932(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20972(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "dd", descriptor = "(II)I")
	@Override
	public final int method20524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afc", name = "dr", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class99 method20525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "cc", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20519() {
		return this.aClass489_88;
	}

	@OriginalMember(owner = "client!afc", name = "zt", descriptor = "(I)Lclient!ml;")
	final Interface40 method20933(@OriginalArg(0) int arg0) {
		if (this.anInterface40_4.method29519() < arg0 * 2) {
			this.anInterface40_4.method29532(arg0);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!afc", name = "du", descriptor = "(I)Lclient!dz;")
	@Override
	public final Class107 method20540(@OriginalArg(0) int arg0) {
		return new Class107_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "dp", descriptor = "(Lclient!dz;)V")
	@Override
	public final void method20827(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub1_3 = (Class107_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afc", name = "sz", descriptor = "()Lclient!mr;")
	public final Interface44 method20934() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18137();
	}

	@OriginalMember(owner = "client!afc", name = "bk", descriptor = "()V")
	@Override
	public final void method20574() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23748();
		this.anInt2919 = this.aClass112_6.method23749();
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "bh", descriptor = "(IIII)V")
	@Override
	public final void method20475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "bx", descriptor = "([I)V")
	@Override
	public final void method20637(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "ll", descriptor = "(F)V")
	@Override
	public final void method20738(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20930();
			this.method20963();
		}
	}

	@OriginalMember(owner = "client!afc", name = "bd", descriptor = "(FF)V")
	@Override
	public final void method20650(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat206 = arg0;
		this.aFloat207 = arg1;
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "bq", descriptor = "([I)V")
	@Override
	public final void method20482(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2921;
		arg0[1] = this.anInt2940;
		arg0[2] = this.anInt2958;
		arg0[3] = this.anInt2930;
	}

	@OriginalMember(owner = "client!afc", name = "bc", descriptor = "()V")
	@Override
	public final void method20478() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23748();
			this.anInt2930 = this.aClass112_6.method23749();
		}
		if (this.aBoolean482) {
			this.aBoolean482 = false;
			this.method20939();
		}
	}

	@OriginalMember(owner = "client!afc", name = "bi", descriptor = "(IIII)V")
	@Override
	public final void method20479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20478();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zz", descriptor = "()V")
	abstract void method20935();

	@OriginalMember(owner = "client!afc", name = "sy", descriptor = "(II)V")
	final void method20936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20937();
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ds", descriptor = "(I[Lclient!akf;)V")
	@Override
	public final void method20802(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass93_Sub16Array19[local1] = arg1[local1];
		}
		this.anInt2934 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "sa", descriptor = "()V")
	abstract void method20937();

	@OriginalMember(owner = "client!afc", name = "abl", descriptor = "(Z)V")
	final void method20938(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean467) {
			this.aBoolean467 = arg0;
			this.method21174();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "sj", descriptor = "()V")
	abstract void method20939();

	@OriginalMember(owner = "client!afc", name = "so", descriptor = "()Lclient!pq;")
	final Class489 method20940() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_75 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "nz", descriptor = "(IIIIIII)V")
	@Override
	public final void method20805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18184((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "do", descriptor = "(Lclient!ou;)V")
	@Override
	public final void method20528(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method30023(this.aClass470_38);
		this.aClass489_87.method30018(this.aClass489_75);
		this.aClass489_87.method30045();
		this.aClass470_34.method29545(arg0);
		this.aClass470_34.method29553();
		this.aClass489_72.method30023(this.aClass470_34);
		this.method20941();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21307();
		}
	}

	@OriginalMember(owner = "client!afc", name = "dz", descriptor = "()Lclient!ou;")
	@Override
	public final Class470 method20529() {
		return this.aClass470_38;
	}

	@OriginalMember(owner = "client!afc", name = "lt", descriptor = "(IIII)V")
	@Override
	public final void method20754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28704(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28711();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "sg", descriptor = "()V")
	final void method20941() {
		this.aClass489_85.method30018(this.aClass489_75);
		this.aClass489_85.method30134(this.aClass489_81);
		this.aClass489_85.method30021(this.aFloatArrayArray22[0]);
		this.aClass489_85.method30057(this.aFloatArrayArray22[1]);
		this.aClass489_85.method30039(this.aFloatArrayArray22[2]);
		this.aClass489_85.method30040(this.aFloatArrayArray22[3]);
		this.aClass489_85.method30041(this.aFloatArrayArray22[4]);
		this.aClass489_85.method30042(this.aFloatArrayArray22[5]);
		this.aClass489_84.method30018(this.aClass489_85);
		this.method20946(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "ow", descriptor = "(IIII)V")
	@Override
	public final void method20477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20478();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "kp", descriptor = "(I[Lclient!akf;)V")
	@Override
	public final void method20725(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass93_Sub16Array19[local1] = arg1[local1];
		}
		this.anInt2934 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "ta", descriptor = "()Lclient!pq;")
	final Class489 method20942() {
		return this.aClass489_74;
	}

	@OriginalMember(owner = "client!afc", name = "tr", descriptor = "()Lclient!ou;")
	final Class470 method20943() {
		if (this.aClass408_3 != Class408.aClass408_6) {
			return this.aClass470_37;
		}
		if (!this.aBoolean460) {
			this.aClass470_35.method29545(this.aClass470_37);
			this.aClass470_35.method29569(this.aClass470_38);
			this.aClass489_76.method30023(this.aClass470_35);
			this.aBoolean460 = true;
		}
		return this.aClass470_35;
	}

	@OriginalMember(owner = "client!afc", name = "yl", descriptor = "()Lclient!lm;")
	final Class401 method20944() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28861();
	}

	@OriginalMember(owner = "client!afc", name = "mb", descriptor = "()Z")
	@Override
	public final boolean method20775() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "te", descriptor = "()Lclient!pq;")
	final Class489 method20945() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "ti", descriptor = "(Lclient!pq;)V")
	public abstract void method20946(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!afc", name = "xx", descriptor = "([B)Lclient!hj;")
	final Class314 method20947(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class314(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abv", descriptor = "()V")
	final void method20948() {
		this.aClass489_83.method30018(this.aClass489_82);
		this.method20946(this.aClass489_83);
		this.aFloat208 = (this.aClass489_83.aFloatArray116[14] - this.aClass489_83.aFloatArray116[15]) / (this.aClass489_83.aFloatArray116[11] - this.aClass489_83.aFloatArray116[10]);
		this.aFloat215 = -this.aClass489_83.aFloatArray116[14] / this.aClass489_83.aFloatArray116[10];
		this.method21028();
	}

	@OriginalMember(owner = "client!afc", name = "tb", descriptor = "()V")
	final void method20949() {
		this.aBoolean471 = false;
		if (this.aClass408_3 == Class408.aClass408_5) {
			this.method21026();
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "tn", descriptor = "()V")
	final void method20950() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			return;
		}
		this.aClass408_3 = Class408.aClass408_6;
		this.method21307();
		this.method21056();
		this.aClass489_82 = this.aClass489_81;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afc", name = "tw", descriptor = "()V")
	final void method20951() {
		this.aBoolean485 = false;
		this.method21056();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "mf", descriptor = "(IIII)V")
	@Override
	public final void method20757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28704(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28711();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "wy", descriptor = "(Z)Z")
	public abstract boolean method20952(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "th", descriptor = "()V")
	final void method20953() {
		this.aClass489_83.method30018(this.aClass489_82);
		this.method20946(this.aClass489_83);
		this.aFloat208 = (this.aClass489_83.aFloatArray116[14] - this.aClass489_83.aFloatArray116[15]) / (this.aClass489_83.aFloatArray116[11] - this.aClass489_83.aFloatArray116[10]);
		this.aFloat215 = -this.aClass489_83.aFloatArray116[14] / this.aClass489_83.aFloatArray116[10];
		this.method21028();
	}

	@OriginalMember(owner = "client!afc", name = "agq", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method20954(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "tt", descriptor = "(Z)V")
	final void method20955(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean459) {
			this.aBoolean459 = arg0;
			this.method20956();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ff", descriptor = "()Z")
	@Override
	public final boolean method20697() {
		return false;
	}

	@OriginalMember(owner = "client!afc", name = "tp", descriptor = "()V")
	abstract void method20956();

	@OriginalMember(owner = "client!afc", name = "tv", descriptor = "()V")
	abstract void method20957();

	@OriginalMember(owner = "client!afc", name = "afq", descriptor = "()V")
	abstract void method20958();

	@OriginalMember(owner = "client!afc", name = "ep", descriptor = "(FFF[F)V")
	@Override
	public final void method20818(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * arg0 + this.aClass489_85.aFloatArray116[6] * arg1 + this.aClass489_85.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat200 + this.aFloat201 * local115 / local59;
			arg3[1] = this.aFloat202 + this.aFloat203 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afc", name = "cu", descriptor = "(IIIIII)I")
	@Override
	public final int method20659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg0 + this.aClass489_85.aFloatArray116[6] * (float) arg1 + this.aClass489_85.aFloatArray116[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg3 + this.aClass489_85.aFloatArray116[6] * (float) arg4 + this.aClass489_85.aFloatArray116[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg0 + this.aClass489_85.aFloatArray116[7] * (float) arg1 + this.aClass489_85.aFloatArray116[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg3 + this.aClass489_85.aFloatArray116[7] * (float) arg4 + this.aClass489_85.aFloatArray116[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg0 + this.aClass489_85.aFloatArray116[4] * (float) arg1 + this.aClass489_85.aFloatArray116[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg3 + this.aClass489_85.aFloatArray116[4] * (float) arg4 + this.aClass489_85.aFloatArray116[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg0 + this.aClass489_85.aFloatArray116[5] * (float) arg1 + this.aClass489_85.aFloatArray116[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg3 + this.aClass489_85.aFloatArray116[5] * (float) arg4 + this.aClass489_85.aFloatArray116[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afc", name = "cn", descriptor = "(IIIILclient!ou;Lclient!oj;)Z")
	@Override
	final boolean method20439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method30023(arg4);
		local2.method30134(this.aClass489_85);
		return arg5.method29461(arg0, arg1, arg2, arg3, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "cv", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V")
	@Override
	public final void method20504(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method30023(arg0);
		local2.method30134(this.aClass489_85);
		arg1.method25973(arg2, this.aClass489_81, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "df", descriptor = "()I")
	@Override
	public final int method20425() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "qy", descriptor = "()V")
	@Override
	public final void method20424() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28860();
		}
	}

	@OriginalMember(owner = "client!afc", name = "er", descriptor = "()V")
	@Override
	void method20770() {
		if (this.aBoolean483) {
			return;
		}
		this.method20913();
		this.aClass406_3.method28748();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445((byte) 21); local12 != null; local12 = this.aClass22_34.method415(567805144)) {
			((Class93_Sub35_Sub1) local12).method18369();
		}
		Class46.method896(false, true, 1616274473);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21369();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20896();
		this.method20431(0);
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!afc", name = "dg", descriptor = "(FFFFF)V")
	@Override
	public final void method20547(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class137_Sub1.aFloat126 = arg0;
		Class137_Sub1.aFloat124 = arg1;
		Class137_Sub1.aFloat125 = arg2;
		Class137_Sub1.aFloat127 = arg3;
		Class137_Sub1.aFloat128 = arg4;
	}

	@OriginalMember(owner = "client!afc", name = "di", descriptor = "(IFFFFF)V")
	@Override
	public final void method20534(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20930();
			}
			this.method20961();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21248();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20963();
	}

	@OriginalMember(owner = "client!afc", name = "dk", descriptor = "(I)V")
	@Override
	public final void method20535(@OriginalArg(0) int arg0) {
		this.anInt2936 = 0;
		while (arg0 > 1) {
			this.anInt2936++;
			arg0 >>= 0x1;
		}
		this.anInt2935 = 0x1 << this.anInt2936;
	}

	@OriginalMember(owner = "client!afc", name = "ahr", descriptor = "(I)V")
	abstract void method20959(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "agb", descriptor = "()V")
	public final void method20960() {
		this.method21016(Class424.aClass424_4, 2);
	}

	@OriginalMember(owner = "client!afc", name = "tx", descriptor = "()V")
	abstract void method20961();

	@OriginalMember(owner = "client!afc", name = "wl", descriptor = "()V")
	final void method20962() {
		if (this.anInt2959 == 8) {
			return;
		}
		this.method20950();
		this.method21001(true);
		this.method20955(true);
		this.method21302(true);
		this.method20994(1);
		this.method20996((byte) 0);
		this.anInt2959 = 8;
	}

	@OriginalMember(owner = "client!afc", name = "tl", descriptor = "()V")
	abstract void method20963();

	@OriginalMember(owner = "client!afc", name = "td", descriptor = "()V")
	abstract void method20964();

	@OriginalMember(owner = "client!afc", name = "kf", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class99 method20712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "um", descriptor = "()V")
	abstract void method20965();

	@OriginalMember(owner = "client!afc", name = "uq", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method20966(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "iw", descriptor = "(IIIII)V")
	@Override
	final void method20468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "aau", descriptor = "()V")
	final void method20967() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "ua", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;")
	final Interface38 method20968(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20915(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "agc", descriptor = "()V")
	public final void method20969() {
		if (this.anInt2959 == 2) {
			return;
		}
		this.method20921();
		this.method21001(false);
		this.method21058(false);
		this.method20955(false);
		this.method21302(false);
		this.method20994(1);
		this.method20996((byte) 0);
		this.anInt2959 = 2;
	}

	@OriginalMember(owner = "client!afc", name = "uz", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	abstract Interface38 method20970(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "ur", descriptor = "(ILclient!mn;ZZ)V")
	abstract void method20971(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!afc", name = "ub", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	abstract Interface38 method20972(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "uj", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method20973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "ut", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method20974(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "sc", descriptor = "()Lclient!pq;")
	final Class489 method20975() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_72 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "abx", descriptor = "()V")
	abstract void method20976();

	@OriginalMember(owner = "client!afc", name = "uv", descriptor = "()I")
	public final int method20977() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "uw", descriptor = "(I)V")
	public final void method20978(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20991();
		}
	}

	@OriginalMember(owner = "client!afc", name = "lh", descriptor = "(IFFFFF)V")
	@Override
	public final void method20878(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20930();
			}
			this.method20961();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21248();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20963();
	}

	@OriginalMember(owner = "client!afc", name = "lg", descriptor = "(I)Lclient!dz;")
	@Override
	public final Class107 method20748(@OriginalArg(0) int arg0) {
		return new Class107_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "abz", descriptor = "(Z)V")
	final void method20979(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean467) {
			this.aBoolean467 = arg0;
			this.method21174();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "acg", descriptor = "()V")
	abstract void method20980();

	@OriginalMember(owner = "client!afc", name = "ux", descriptor = "(ILclient!mn;)V")
	public final void method20981(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20971(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!afc", name = "nm", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20621(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean473) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean477) {
			this.aClass128Array3[3].method21358();
			this.aClass128Array3[3].method21359();
		}
	}

	@OriginalMember(owner = "client!afc", name = "uu", descriptor = "(ILclient!mn;)V")
	public final void method20982(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20983(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!afc", name = "uo", descriptor = "(ILclient!mn;Z)V")
	abstract void method20983(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afc", name = "un", descriptor = "(I)V")
	public final void method20984(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2945) {
			this.anInt2945 = arg0;
			this.method20989();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ue", descriptor = "()Lclient!pq;")
	final Class489 method20985() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "vq", descriptor = "()Lclient!pq;")
	public final Class489 method20986() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "aep", descriptor = "()V")
	abstract void method20987();

	@OriginalMember(owner = "client!afc", name = "vb", descriptor = "()V")
	final void method20988() {
		if (this.aClass425Array3[this.anInt2949] != Class425.aClass425_3) {
			this.aClass425Array3[this.anInt2949] = Class425.aClass425_3;
			this.aClass489Array5[this.anInt2949].method30017();
			this.method21211();
		}
	}

	@OriginalMember(owner = "client!afc", name = "mt", descriptor = "()V")
	@Override
	public final void method20598() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28710(this.aClass137Array3[3]);
			this.aClass406_3.method28748();
		}
	}

	@OriginalMember(owner = "client!afc", name = "vr", descriptor = "()V")
	abstract void method20989();

	@OriginalMember(owner = "client!afc", name = "vo", descriptor = "()V")
	abstract void method20990();

	@OriginalMember(owner = "client!afc", name = "vv", descriptor = "()V")
	abstract void method20991();

	@OriginalMember(owner = "client!afc", name = "cy", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	@Override
	public final Class106 method20518(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "vt", descriptor = "()V")
	abstract void method20992();

	@OriginalMember(owner = "client!afc", name = "vu", descriptor = "()Lclient!dy;")
	final Class237 method20993() {
		return this.aClass237_6;
	}

	@OriginalMember(owner = "client!afc", name = "ei", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20556(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		this.aBoolean473 = true;
	}

	@OriginalMember(owner = "client!afc", name = "el", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20557(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean473) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean477) {
			this.aClass128Array3[3].method21358();
			this.aClass128Array3[3].method21359();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ej", descriptor = "()V")
	@Override
	public final void method20558() {
		this.aBoolean473 = false;
	}

	@OriginalMember(owner = "client!afc", name = "vi", descriptor = "(I)V")
	final void method20994(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean462) {
			this.aBoolean462 = local10;
			this.method20998();
		}
		if (local12 != this.aBoolean481) {
			this.aBoolean481 = local12;
			this.method21116();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20999();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "va", descriptor = "(I)V")
	final void method20995(@OriginalArg(0) int arg0) {
		if (this.anInt2948 != arg0) {
			this.anInt2948 = arg0;
			this.method20999();
		}
	}

	@OriginalMember(owner = "client!afc", name = "vs", descriptor = "(B)V")
	final void method20996(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method20995(0);
			this.method20994(1);
		} else {
			this.method20995(3);
			this.method20994(3);
		}
		this.method20998();
	}

	@OriginalMember(owner = "client!afc", name = "vy", descriptor = "(I)V")
	abstract void method20997(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "ve", descriptor = "()V")
	abstract void method20998();

	@OriginalMember(owner = "client!afc", name = "vm", descriptor = "()V")
	abstract void method20999();

	@OriginalMember(owner = "client!afc", name = "adq", descriptor = "()V")
	public abstract void method21000();

	@OriginalMember(owner = "client!afc", name = "vp", descriptor = "(Z)V")
	final void method21001(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean478) {
			this.aBoolean478 = arg0;
			this.method20918();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ael", descriptor = "()V")
	abstract void method21002();

	@OriginalMember(owner = "client!afc", name = "sf", descriptor = "()V")
	final void method21003() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.anInt2925 = this.anInt2923;
			this.anInt2926 = this.anInt2924;
			this.anInt2927 = this.anInt2941;
			this.anInt2928 = this.anInt2919;
			this.aFloat204 = this.aFloat206;
			this.aFloat205 = this.aFloat207;
		} else {
			this.anInt2925 = 0;
			this.anInt2926 = 0;
			this.anInt2927 = this.aClass112_6.method23748();
			this.anInt2928 = this.aClass112_6.method23749();
			this.aFloat204 = 0.0F;
			this.aFloat205 = 1.0F;
		}
		this.method20937();
		this.aFloat201 = (float) this.anInt2941 / 2.0F;
		this.aFloat203 = (float) this.anInt2919 / 2.0F;
		this.aFloat200 = (float) this.anInt2923 + this.aFloat201;
		this.aFloat202 = (float) this.anInt2924 + this.aFloat203;
	}

	@OriginalMember(owner = "client!afc", name = "afl", descriptor = "()V")
	abstract void method21004();

	@OriginalMember(owner = "client!afc", name = "vf", descriptor = "([Lclient!lk;)Lclient!lo;")
	abstract Class145 method21005(@OriginalArg(0) Class400[] arg0);

	@OriginalMember(owner = "client!afc", name = "yc", descriptor = "()Z")
	final boolean method21006() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "vc", descriptor = "(Z)Lclient!ml;")
	abstract Interface40 method21007(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "afn", descriptor = "(Z)V")
	abstract void method21008(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "fw", descriptor = "()Z")
	@Override
	public final boolean method20589() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "yd", descriptor = "()V")
	final void method21009() {
		this.method20949();
		this.method20951();
		this.method21024();
		this.method20574();
		this.method20478();
	}

	@OriginalMember(owner = "client!afc", name = "agp", descriptor = "(Lclient!ms;II)V")
	public abstract void method21010(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afc", name = "aae", descriptor = "()V")
	final void method21011() {
		if (this.aClass408_3 == Class408.aClass408_5) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_5;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.method21026();
		this.aClass489_82 = this.aClass489_80;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afc", name = "cs", descriptor = "(ILclient!ch;II)V")
	@Override
	public final void method20517(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20530(false);
		this.aClass100_Sub1_6.method18196(0.0F, 0.0F, (float) this.method20446((byte) 0).method23748(), 0.0F, 0.0F, (float) this.method20446((byte) -110).method23749(), 0, arg1, arg2, arg3);
		this.method20530(true);
	}

	@OriginalMember(owner = "client!afc", name = "bv", descriptor = "(IIIIII)V")
	@Override
	public final void method20665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(false);
		}
		if (this.aBoolean464) {
			this.method20530(false);
			this.aClass100_Sub1_5.method18188(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20530(true);
		} else {
			this.aClass100_Sub1_5.method18188(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "bz", descriptor = "(IIIIII)V")
	@Override
	public final void method20490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class104_Sub2_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(false);
		}
		this.method20496(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20496(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20496(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20496(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "br", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public final void method20863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afc", name = "lk", descriptor = "(IIII)V")
	@Override
	public final void method20756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28704(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28711();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "kq", descriptor = "(II)I")
	@Override
	public final int method20595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afc", name = "aeh", descriptor = "(ILclient!mn;)V")
	public final void method21012(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20971(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!afc", name = "bj", descriptor = "(IIIIII)V")
	@Override
	public final void method20496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20500(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "afa", descriptor = "()V")
	abstract void method21013();

	@OriginalMember(owner = "client!afc", name = "cg", descriptor = "(IIIIIILclient!ch;IIIII)V")
	@Override
	public final void method20848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afc", name = "bs", descriptor = "(IIIIIILclient!ch;II)V")
	@Override
	public final void method20494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afc", name = "ce", descriptor = "(IIIIIII)V")
	@Override
	public final void method20500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18184((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "dt", descriptor = "(Lclient!dm;)V")
	@Override
	public final void method20509(@OriginalArg(0) Class229 arg0) {
		this.aClass395_3.method28530(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "wo", descriptor = "()V")
	final void method21014() {
		this.method21060(0, this.anInterface37_16);
		this.method21118(this.aClass145_18);
		this.method21017(Class424.aClass424_6, 0, 1);
	}

	@OriginalMember(owner = "client!afc", name = "wu", descriptor = "()V")
	public final void method21015() {
		this.method21016(Class424.aClass424_4, 2);
	}

	@OriginalMember(owner = "client!afc", name = "wk", descriptor = "(Lclient!ms;I)V")
	final void method21016(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21060(0, this.anInterface37_17);
		this.method21118(this.aClass145_17);
		this.method21017(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "wz", descriptor = "(Lclient!ms;II)V")
	public abstract void method21017(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afc", name = "wj", descriptor = "(Lclient!ml;Lclient!ms;IIII)V")
	abstract void method21018(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "we", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method21019(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "wr", descriptor = "()V")
	public final void method21020() {
		if (this.anInt2959 == 2) {
			return;
		}
		this.method20921();
		this.method21001(false);
		this.method21058(false);
		this.method20955(false);
		this.method21302(false);
		this.method20994(1);
		this.method20996((byte) 0);
		this.anInt2959 = 2;
	}

	@OriginalMember(owner = "client!afc", name = "dn", descriptor = "(III)V")
	@Override
	public final void method20883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2957 == arg0 && this.anInt2947 == arg1 && this.anInt2956 == arg2) {
			return;
		}
		this.anInt2957 = arg0;
		this.anInt2947 = arg1;
		this.anInt2956 = arg2;
		this.method21028();
		this.method20918();
	}

	@OriginalMember(owner = "client!afc", name = "wp", descriptor = "(I)V")
	abstract void method21021(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "xm", descriptor = "(Z)Z")
	public abstract boolean method21023(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "ea", descriptor = "()V")
	@Override
	void method20570() {
		if (this.aBoolean483) {
			return;
		}
		this.method20913();
		this.aClass406_3.method28748();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445((byte) 37); local12 != null; local12 = this.aClass22_34.method415(1376359776)) {
			((Class93_Sub35_Sub1) local12).method18369();
		}
		Class46.method896(false, true, 985365751);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21369();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20896();
		this.method20431(0);
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!afc", name = "ew", descriptor = "()V")
	@Override
	void method20571() {
		if (this.aBoolean483) {
			return;
		}
		this.method20913();
		this.aClass406_3.method28748();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445((byte) 60); local12 != null; local12 = this.aClass22_34.method415(428929505)) {
			((Class93_Sub35_Sub1) local12).method18369();
		}
		Class46.method896(false, true, 1020703745);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21369();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20896();
		this.method20431(0);
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!afc", name = "ev", descriptor = "(FFF[F)V")
	@Override
	public final void method20836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "en", descriptor = "(I)V")
	@Override
	public void method20573(@OriginalArg(0) int arg0) {
		if (this.aClass406_3 != null) {
			this.aClass406_3.method28747();
		}
		this.anInt2952 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!afc", name = "eb", descriptor = "()I")
	@Override
	public final int method20820() {
		return this.anInt2917 + this.anInt2916 + this.anInt2931;
	}

	@OriginalMember(owner = "client!afc", name = "tm", descriptor = "()V")
	final void method21024() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "vn", descriptor = "(Z)Lclient!lr;")
	abstract Interface37 method21025(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "fm", descriptor = "()Z")
	@Override
	public final boolean method20814() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "tz", descriptor = "()V")
	final void method21026() {
		if (this.aBoolean471) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23748();
			local13 = this.aClass112_6.method23749();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method30017();
		} else {
			local21.method30031(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method30018(local21);
		this.method20946(this.aClass489_79);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!afc", name = "fs", descriptor = "()Z")
	@Override
	public final boolean method20809() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fz", descriptor = "()Z")
	@Override
	public final boolean method20580() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fj", descriptor = "()Z")
	@Override
	public final boolean method20581() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "adj", descriptor = "()I")
	public final int method21027() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "nb", descriptor = "(FFF[F)V")
	@Override
	public final void method20640(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "fi", descriptor = "()Z")
	@Override
	public final boolean method20751() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "vd", descriptor = "()V")
	final void method21028() {
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21359();
		}
		this.method21063();
	}

	@OriginalMember(owner = "client!afc", name = "fx", descriptor = "()Z")
	@Override
	public final boolean method20682() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!afc", name = "fv", descriptor = "()Z")
	@Override
	public final boolean method20772() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!afc", name = "fu", descriptor = "()Z")
	@Override
	public final boolean method20578() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "cz", descriptor = "()Lclient!ou;")
	@Override
	public final Class470 method20520() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "fa", descriptor = "()Z")
	@Override
	public final boolean method20590() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "x", descriptor = "()Z")
	@Override
	public final boolean method20452() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!afc", name = "md", descriptor = "([I)Lclient!cj;")
	@Override
	public final Class102 method20765(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "mn", descriptor = "()Z")
	@Override
	public final boolean method20762() {
		return this.aClass137Array3[1] != null && this.aClass137Array3[1].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "uy", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	abstract Interface42 method21029(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "fb", descriptor = "()Ljava/lang/String;")
	public abstract String method20877();

	@OriginalMember(owner = "client!afc", name = "fo", descriptor = "()Ljava/lang/String;")
	public abstract String method20596();

	@OriginalMember(owner = "client!afc", name = "fy", descriptor = "()Ljava/lang/String;")
	public abstract String method20781();

	@OriginalMember(owner = "client!afc", name = "fe", descriptor = "()[I")
	@Override
	public final int[] method20572() {
		return null;
	}

	@OriginalMember(owner = "client!afc", name = "hp", descriptor = "(Z)V")
	@Override
	public final void method20641(@OriginalArg(0) boolean arg0) {
		this.aBoolean464 = arg0;
		this.method20957();
	}

	@OriginalMember(owner = "client!afc", name = "aeb", descriptor = "()Lclient!pq;")
	final Class489 method21030() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "ud", descriptor = "()V")
	public abstract void method21031();

	@OriginalMember(owner = "client!afc", name = "hn", descriptor = "()V")
	@Override
	public final void method20852() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23748();
		this.anInt2919 = this.aClass112_6.method23749();
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "hi", descriptor = "()V")
	@Override
	public final void method20645() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23748();
		this.anInt2919 = this.aClass112_6.method23749();
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "up", descriptor = "(Lclient!mq;)V")
	public final void method21032(@OriginalArg(0) Interface43 arg0) {
		if (this.anInterface43Array3[this.anInt2949] == arg0) {
			return;
		}
		this.anInterface43Array3[this.anInt2949] = arg0;
		if (arg0 == null) {
			this.anInterface38_23.method11412();
		} else {
			arg0.method11412();
		}
		this.anInt2959 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afc", name = "ht", descriptor = "(IIII)V")
	@Override
	public final void method20647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "hc", descriptor = "(IIII)V")
	@Override
	public final void method20648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "ho", descriptor = "(IIII)V")
	@Override
	public final void method20649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "acy", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;")
	final Interface38 method21033(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20915(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "hv", descriptor = "([I)V")
	@Override
	public final void method20714(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "ij", descriptor = "(FF)V")
	@Override
	public final void method20653(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat206 = arg0;
		this.aFloat207 = arg1;
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "io", descriptor = "()V")
	@Override
	public final void method20670() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23748();
			this.anInt2930 = this.aClass112_6.method23749();
		}
		if (this.aBoolean482) {
			this.aBoolean482 = false;
			this.method20939();
		}
	}

	@OriginalMember(owner = "client!afc", name = "dc", descriptor = "(F)V")
	@Override
	public final void method20533(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20930();
			this.method20963();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ig", descriptor = "()V")
	@Override
	public final void method20886() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23748();
			this.anInt2930 = this.aClass112_6.method23749();
		}
		if (this.aBoolean482) {
			this.aBoolean482 = false;
			this.method20939();
		}
	}

	@OriginalMember(owner = "client!afc", name = "iv", descriptor = "()V")
	@Override
	public final void method20657() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23748();
			this.anInt2930 = this.aClass112_6.method23749();
		}
		if (this.aBoolean482) {
			this.aBoolean482 = false;
			this.method20939();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ie", descriptor = "(IIII)V")
	@Override
	public final void method20658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2921 < local21) {
			this.anInt2921 = local21;
			local43 = true;
		}
		if (this.anInt2958 > local28) {
			this.anInt2958 = local28;
			local43 = true;
		}
		if (this.anInt2940 < local34) {
			this.anInt2940 = local34;
			local43 = true;
		}
		if (this.anInt2930 > local41) {
			this.anInt2930 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "mj", descriptor = "()Z")
	@Override
	public final boolean method20846() {
		return this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "in", descriptor = "([I)V")
	@Override
	public final void method20660(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2921;
		arg0[1] = this.anInt2940;
		arg0[2] = this.anInt2958;
		arg0[3] = this.anInt2930;
	}

	@OriginalMember(owner = "client!afc", name = "it", descriptor = "(IIIIII)V")
	@Override
	public final void method20662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class104_Sub2_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(false);
		}
		this.method20496(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20496(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20496(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20496(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "ix", descriptor = "(IIIIII)V")
	@Override
	public final void method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(false);
		}
		if (this.aBoolean464) {
			this.method20530(false);
			this.aClass100_Sub1_5.method18188(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20530(true);
		} else {
			this.aClass100_Sub1_5.method18188(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean480 && this.anInt2951 != 0) {
			this.method21235(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "is", descriptor = "(IIIII)V")
	@Override
	final void method20664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "hw", descriptor = "()V")
	@Override
	public final void method20646() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23748();
		this.anInt2919 = this.aClass112_6.method23749();
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "adf", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	abstract Interface42 method21035(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "lm", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20737() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "ip", descriptor = "(IIIII)V")
	@Override
	final void method20668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20496(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "nu", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method20501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20921();
		@Pc(50) Class128 local50 = this.aClass128Array3[13];
		local50.method21357();
		local50.method21373(arg4);
		this.method20994(arg5);
		local50.method21361();
		this.method21235(false);
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
			if (!this.method20917(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21014();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21235(true);
		local50.method21356();
	}

	@OriginalMember(owner = "client!afc", name = "ia", descriptor = "(IIIII)V")
	@Override
	final void method20815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20496(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "adx", descriptor = "(I)V")
	public final void method21036(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20991();
		}
	}

	@OriginalMember(owner = "client!afc", name = "adb", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	abstract Interface38 method21037(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "iy", descriptor = "(IIIIII)V")
	@Override
	public final void method20673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20500(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "xu", descriptor = "(I)Ljava/nio/ByteBuffer;")
	final ByteBuffer method21038(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!afc", name = "abf", descriptor = "(Z)V")
	final void method21039(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method20957();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "fp", descriptor = "()Z")
	@Override
	public final boolean method20706() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "im", descriptor = "(IIIIIILclient!ch;II)V")
	@Override
	public final void method20677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afc", name = "ic", descriptor = "(IIIIIILclient!ch;IIIII)V")
	@Override
	public final void method20678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afc", name = "jd", descriptor = "(IIIIIILclient!ch;IIIII)V")
	@Override
	public final void method20679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afc", name = "jf", descriptor = "(IIIIII)I")
	@Override
	public final int method20844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg0 + this.aClass489_85.aFloatArray116[6] * (float) arg1 + this.aClass489_85.aFloatArray116[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg3 + this.aClass489_85.aFloatArray116[6] * (float) arg4 + this.aClass489_85.aFloatArray116[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg0 + this.aClass489_85.aFloatArray116[7] * (float) arg1 + this.aClass489_85.aFloatArray116[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg3 + this.aClass489_85.aFloatArray116[7] * (float) arg4 + this.aClass489_85.aFloatArray116[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg0 + this.aClass489_85.aFloatArray116[4] * (float) arg1 + this.aClass489_85.aFloatArray116[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg3 + this.aClass489_85.aFloatArray116[4] * (float) arg4 + this.aClass489_85.aFloatArray116[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg0 + this.aClass489_85.aFloatArray116[5] * (float) arg1 + this.aClass489_85.aFloatArray116[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg3 + this.aClass489_85.aFloatArray116[5] * (float) arg4 + this.aClass489_85.aFloatArray116[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afc", name = "kv", descriptor = "(Lclient!ou;)V")
	@Override
	public final void method20729(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method30023(this.aClass470_38);
		this.aClass489_87.method30018(this.aClass489_75);
		this.aClass489_87.method30045();
		this.aClass470_34.method29545(arg0);
		this.aClass470_34.method29553();
		this.aClass489_72.method30023(this.aClass470_34);
		this.method20941();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21307();
		}
	}

	@OriginalMember(owner = "client!afc", name = "jy", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V")
	@Override
	public final void method20874(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method30023(arg0);
		local2.method30134(this.aClass489_85);
		arg1.method25973(arg2, this.aClass489_81, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "jl", descriptor = "(Lclient!akz;)V")
	@Override
	public final void method20683(@OriginalArg(0) Class93_Sub35 arg0) {
		this.aNativeHeap6 = ((Class93_Sub35_Sub1) arg0).aNativeHeap3;
	}

	@OriginalMember(owner = "client!afc", name = "adw", descriptor = "()I")
	public final int method21040() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "je", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class100 method20480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "il", descriptor = "(IIIII)V")
	@Override
	final void method20623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "jm", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class100 method20687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class100_Sub1 local8 = new Class100_Sub1(this, arg2, arg3, arg4, false);
		local8.method18182(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afc", name = "agv", descriptor = "(Z)Lclient!lr;")
	abstract Interface37 method21041(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "wa", descriptor = "(Lclient!ml;)V")
	abstract void method21042(@OriginalArg(0) Interface40 arg0);

	@OriginalMember(owner = "client!afc", name = "he", descriptor = "()V")
	@Override
	public final void method20643() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23748();
		this.anInt2919 = this.aClass112_6.method23749();
		this.method21003();
	}

	@OriginalMember(owner = "client!afc", name = "ji", descriptor = "(II[I[I)Lclient!ch;")
	@Override
	public final Class96 method20691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "afw", descriptor = "()V")
	abstract void method21043();

	@OriginalMember(owner = "client!afc", name = "aam", descriptor = "()V")
	final void method21044() {
		if (this.aBoolean471) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23748();
			local13 = this.aClass112_6.method23749();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method30017();
		} else {
			local21.method30031(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method30018(local21);
		this.method20946(this.aClass489_79);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!afc", name = "jv", descriptor = "(ILclient!ch;II)V")
	@Override
	public final void method20694(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20530(false);
		this.aClass100_Sub1_6.method18196(0.0F, 0.0F, (float) this.method20446((byte) -109).method23748(), 0.0F, 0.0F, (float) this.method20446((byte) -118).method23749(), 0, arg1, arg2, arg3);
		this.method20530(true);
	}

	@OriginalMember(owner = "client!afc", name = "ck", descriptor = "(I)V")
	@Override
	public final void method20843(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jj", descriptor = "(ILclient!ch;II)V")
	@Override
	public final void method20696(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20530(false);
		this.aClass100_Sub1_6.method18196(0.0F, 0.0F, (float) this.method20446((byte) -97).method23748(), 0.0F, 0.0F, (float) this.method20446((byte) -49).method23749(), 0, arg1, arg2, arg3);
		this.method20530(true);
	}

	@OriginalMember(owner = "client!afc", name = "jo", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	@Override
	public final Class106 method20784(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "jz", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	@Override
	public final Class106 method20521(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "a", descriptor = "()Z")
	@Override
	public final boolean method20551() {
		return false;
	}

	@OriginalMember(owner = "client!afc", name = "jg", descriptor = "(I)V")
	@Override
	public final void method20700(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "qd", descriptor = "()V")
	@Override
	public final void method20872() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28860();
		}
	}

	@OriginalMember(owner = "client!afc", name = "jh", descriptor = "(I)V")
	@Override
	public final void method20791(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jp", descriptor = "(I)V")
	@Override
	public final void method20686(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jk", descriptor = "(I)V")
	@Override
	public final void method20704(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "kw", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	@Override
	public final Class109 method20798(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "kz", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	@Override
	public final Class109 method20741(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "ke", descriptor = "(Lclient!dq;IIII)Lclient!do;")
	@Override
	public final Class109 method20707(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "ey", descriptor = "()Z")
	@Override
	public final boolean method20585() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "kg", descriptor = "(II)I")
	@Override
	public final int method20881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afc", name = "js", descriptor = "(II[I[I)Lclient!ch;")
	@Override
	public final Class96 method20459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "ko", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class99 method20711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "sm", descriptor = "()V")
	void method21045() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28712();
		}
		if (this.aClass137Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass137Array3.length; local10++) {
				if (this.aClass137Array3[local10] != null && this.aClass137Array3[local10].method11482()) {
					this.aClass137Array3[local10].method11450();
				}
			}
		}
		this.aClass395_3 = new Class395(this);
		this.method20914();
		this.method21065();
		this.method20916();
		this.aClass419_3 = new Class419(this, 1024);
		this.aClass395_3.method28515(this);
		if (this.aBoolean476) {
			this.aClass414_3 = new Class414(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afc", name = "kx", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public final Class99 method20803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "dv", descriptor = "(Z)V")
	@Override
	public final void method20530(@OriginalArg(0) boolean arg0) {
		this.aBoolean464 = arg0;
		this.method20957();
	}

	@OriginalMember(owner = "client!afc", name = "wg", descriptor = "(Lclient!le;)V")
	public final void method21046(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1303(arg0, anObject7, 340171315);
	}

	@OriginalMember(owner = "client!afc", name = "kh", descriptor = "()Lclient!ou;")
	@Override
	public final Class470 method20716() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "ka", descriptor = "()Lclient!ou;")
	@Override
	public final Class470 method20717() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "kl", descriptor = "()Lclient!ou;")
	@Override
	public final Class470 method20718() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "kb", descriptor = "()I")
	@Override
	public final int method20719() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kr", descriptor = "()I")
	@Override
	public final int method20720() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kd", descriptor = "()I")
	@Override
	public final int method20622() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kc", descriptor = "()I")
	@Override
	public final int method20722() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "aaj", descriptor = "()V")
	final void method21047() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "dm", descriptor = "(Lclient!pq;)V")
	@Override
	public final void method20531(@OriginalArg(0) Class489 arg0) {
		this.aClass489_81.method30018(arg0);
		this.method20941();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "jw", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public final Class100 method20458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class100_Sub1 local8 = new Class100_Sub1(this, arg2, arg3, arg4, false);
		local8.method18182(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afc", name = "kk", descriptor = "(Lclient!ou;)V")
	@Override
	public final void method20728(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method30023(this.aClass470_38);
		this.aClass489_87.method30018(this.aClass489_75);
		this.aClass489_87.method30045();
		this.aClass470_34.method29545(arg0);
		this.aClass470_34.method29553();
		this.aClass489_72.method30023(this.aClass470_34);
		this.method20941();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21307();
		}
	}

	@OriginalMember(owner = "client!afc", name = "afh", descriptor = "()V")
	abstract void method21048();

	@OriginalMember(owner = "client!afc", name = "kt", descriptor = "(Lclient!ou;)V")
	@Override
	public final void method20826(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method30023(this.aClass470_38);
		this.aClass489_87.method30018(this.aClass489_75);
		this.aClass489_87.method30045();
		this.aClass470_34.method29545(arg0);
		this.aClass470_34.method29553();
		this.aClass489_72.method30023(this.aClass470_34);
		this.method20941();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21307();
		}
	}

	@OriginalMember(owner = "client!afc", name = "li", descriptor = "()Lclient!ou;")
	@Override
	public final Class470 method20731() {
		return this.aClass470_38;
	}

	@OriginalMember(owner = "client!afc", name = "lv", descriptor = "(Lclient!pq;)V")
	@Override
	public final void method20732(@OriginalArg(0) Class489 arg0) {
		this.aClass489_81.method30018(arg0);
		this.method20941();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "la", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20733() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "lp", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20492() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "lc", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20703() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "abr", descriptor = "()V")
	final void method21049() {
		if (!this.aBoolean485) {
			this.aBoolean485 = true;
		}
	}

	@OriginalMember(owner = "client!afc", name = "xl", descriptor = "(Z)Z")
	public abstract boolean method21050(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "ib", descriptor = "(IIIII)V")
	@Override
	final void method20839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "lb", descriptor = "(F)V")
	@Override
	public final void method20739(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20930();
			this.method20963();
		}
	}

	@OriginalMember(owner = "client!afc", name = "le", descriptor = "(F)V")
	@Override
	public final void method20740(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20930();
			this.method20963();
		}
	}

	@OriginalMember(owner = "client!afc", name = "lr", descriptor = "(IFFFFF)V")
	@Override
	public final void method20689(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20930();
			}
			this.method20961();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21248();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20963();
	}

	@OriginalMember(owner = "client!afc", name = "lq", descriptor = "(IFFFFF)V")
	@Override
	public final void method20742(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20930();
			}
			this.method20961();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21248();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20963();
	}

	@OriginalMember(owner = "client!afc", name = "ks", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20630() {
		return this.aClass489_88;
	}

	@OriginalMember(owner = "client!afc", name = "id", descriptor = "(IIIII)V")
	@Override
	final void method20669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20496(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "xi", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	public abstract Class115 method21051(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afc", name = "lu", descriptor = "(I)V")
	@Override
	public final void method20430(@OriginalArg(0) int arg0) {
		this.anInt2936 = 0;
		while (arg0 > 1) {
			this.anInt2936++;
			arg0 >>= 0x1;
		}
		this.anInt2935 = 0x1 << this.anInt2936;
	}

	@OriginalMember(owner = "client!afc", name = "cd", descriptor = "(II)I")
	@Override
	public final int method20705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afc", name = "ya", descriptor = "()V")
	final void method21052() {
		this.method20922();
	}

	@OriginalMember(owner = "client!afc", name = "fn", descriptor = "()Z")
	@Override
	public final boolean method20695() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "ln", descriptor = "(Lclient!dz;)V")
	@Override
	public final void method20753(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub1_3 = (Class107_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afc", name = "jn", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public final Class100 method20684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "ld", descriptor = "(IIII)V")
	@Override
	public final void method20755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28704(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28711();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "acc", descriptor = "()V")
	final void method21053() {
		if (this.method21220()) {
			this.method20965();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "qi", descriptor = "()V")
	@Override
	public final void method20873() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28860();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ago", descriptor = "()V")
	final void method21054() {
		if (this.anInt2959 == 8) {
			return;
		}
		this.method20950();
		this.method21001(true);
		this.method20955(true);
		this.method21302(true);
		this.method20994(1);
		this.method20996((byte) 0);
		this.anInt2959 = 8;
	}

	@OriginalMember(owner = "client!afc", name = "mx", descriptor = "(II)V")
	@Override
	public final void method20759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28709(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afc", name = "mg", descriptor = "()Z")
	@Override
	public final boolean method20760() {
		return this.aClass404_3 != null && this.aClass404_3.aBoolean756;
	}

	@OriginalMember(owner = "client!afc", name = "us", descriptor = "(Lclient!mk;Lclient!mk;)V")
	public final void method21055(@OriginalArg(0) Class421 arg0, @OriginalArg(1) Class421 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass421Array5[this.anInt2949] != arg0) {
			this.aClass421Array5[this.anInt2949] = arg0;
			this.method21197();
			local1 = true;
		}
		if (this.aClass421Array6[this.anInt2949] != arg1) {
			this.aClass421Array6[this.anInt2949] = arg1;
			this.method20992();
			local1 = true;
		}
		if (local1) {
			this.anInt2959 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afc", name = "tf", descriptor = "()V")
	final void method21056() {
		if (!this.aBoolean485) {
			this.aBoolean485 = true;
		}
	}

	@OriginalMember(owner = "client!afc", name = "mh", descriptor = "(II)V")
	@Override
	public final void method20758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28709(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afc", name = "my", descriptor = "([I)Lclient!cj;")
	@Override
	public final Class102 method20764(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "me", descriptor = "()Z")
	@Override
	public final boolean method20466() {
		return this.aClass404_3 != null && this.aClass404_3.aBoolean756;
	}

	@OriginalMember(owner = "client!afc", name = "mk", descriptor = "([I)Lclient!cj;")
	@Override
	public final Class102 method20512(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "ca", descriptor = "(Lclient!akz;)V")
	@Override
	public final void method20506(@OriginalArg(0) Class93_Sub35 arg0) {
		this.aNativeHeap6 = ((Class93_Sub35_Sub1) arg0).aNativeHeap3;
	}

	@OriginalMember(owner = "client!afc", name = "ms", descriptor = "()Z")
	@Override
	public final boolean method20768() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "mp", descriptor = "()Z")
	@Override
	public final boolean method20769() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "mo", descriptor = "()Z")
	@Override
	public final boolean method20586() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "ml", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V")
	@Override
	public final void method20771(@OriginalArg(0) Class102 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class102 arg4, @OriginalArg(5) float arg5) {
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
		Class137_Sub3.aClass102_Sub2Array1[0] = (Class102_Sub2) arg0;
		Class137_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[1] = (Class102_Sub2) arg2;
		Class137_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[2] = (Class102_Sub2) arg4;
		Class137_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class137_Sub3.anInt1379 = local1;
		Class137_Sub3.aFloat139 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afc", name = "mi", descriptor = "()Z")
	@Override
	public final boolean method20829() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "mr", descriptor = "()Z")
	@Override
	public final boolean method20773() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "mz", descriptor = "()Z")
	@Override
	public final boolean method20774() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "ahk", descriptor = "(I)V")
	abstract void method21057(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "mu", descriptor = "()V")
	@Override
	public final void method20442() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28710(this.aClass137Array3[3]);
			this.aClass406_3.method28748();
		}
	}

	@OriginalMember(owner = "client!afc", name = "to", descriptor = "(Z)V")
	final void method21058(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean467) {
			this.aBoolean467 = arg0;
			this.method21174();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "mc", descriptor = "()V")
	@Override
	public final void method20778() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28710(this.aClass137Array3[3]);
			this.aClass406_3.method28748();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ma", descriptor = "()Z")
	@Override
	public final boolean method20779() {
		return this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "wt", descriptor = "()Z")
	public abstract boolean method21059();

	@OriginalMember(owner = "client!afc", name = "lf", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20736() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "mm", descriptor = "(FFFFFF)V")
	@Override
	final void method20782(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class137_Sub2.aFloat133 = arg0;
		Class137_Sub2.aFloat132 = arg1;
		Class137_Sub2.aFloat131 = arg2;
		Class137_Sub2.aFloat134 = arg5;
	}

	@OriginalMember(owner = "client!afc", name = "nd", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20783(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean473) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean477) {
			this.aClass128Array3[3].method21358();
			this.aClass128Array3[3].method21359();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ne", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20617(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean473) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean477) {
			this.aClass128Array3[3].method21358();
			this.aClass128Array3[3].method21359();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ny", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20734(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean473) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean477) {
			this.aClass128Array3[3].method21358();
			this.aClass128Array3[3].method21359();
		}
	}

	@OriginalMember(owner = "client!afc", name = "fq", descriptor = "()Z")
	@Override
	public final boolean method20592() {
		return false;
	}

	@OriginalMember(owner = "client!afc", name = "nj", descriptor = "()V")
	@Override
	public final void method20465() {
		this.aBoolean473 = false;
	}

	@OriginalMember(owner = "client!afc", name = "no", descriptor = "()V")
	@Override
	public final void method20788() {
		this.aBoolean473 = false;
	}

	@OriginalMember(owner = "client!afc", name = "np", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public final void method20789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afc", name = "na", descriptor = "(FFF[F)V")
	@Override
	public final void method20790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "ni", descriptor = "(FFF[F)V")
	@Override
	public final void method20566(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "wn", descriptor = "(ILclient!lr;)V")
	public abstract void method21060(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1);

	@OriginalMember(owner = "client!afc", name = "nw", descriptor = "(FFF[F)V")
	@Override
	public final void method20793(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "ii", descriptor = "(IIIIII)V")
	@Override
	public final void method20674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20500(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "nl", descriptor = "(FFF[F)V")
	@Override
	public final void method20795(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * arg0 + this.aClass489_85.aFloatArray116[6] * arg1 + this.aClass489_85.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat200 + this.aFloat201 * local115 / local59;
			arg3[1] = this.aFloat202 + this.aFloat203 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aaz", descriptor = "()V")
	final void method21061() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			return;
		}
		this.aClass408_3 = Class408.aClass408_6;
		this.method21307();
		this.method21056();
		this.aClass489_82 = this.aClass489_81;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afc", name = "ex", descriptor = "()I")
	@Override
	public final int method20855() {
		return this.anInt2917 + this.anInt2916 + this.anInt2931;
	}

	@OriginalMember(owner = "client!afc", name = "nf", descriptor = "(IIIIIII)V")
	@Override
	public final void method20804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18184((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "xs", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21062(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "ns", descriptor = "(IIIIIII)V")
	@Override
	public final void method20807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18184((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "jt", descriptor = "(ILclient!ch;II)V")
	@Override
	public final void method20692(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20530(false);
		this.aClass100_Sub1_6.method18196(0.0F, 0.0F, (float) this.method20446((byte) -23).method23748(), 0.0F, 0.0F, (float) this.method20446((byte) -11).method23749(), 0, arg1, arg2, arg3);
		this.method20530(true);
	}

	@OriginalMember(owner = "client!afc", name = "nv", descriptor = "(Lclient!de;Z)Lclient!cm;")
	@Override
	public final Class100 method20808(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class100 local21;
		if (arg0.method7206() == 0 || arg0.method7198() == 0) {
			local21 = this.method20510(new int[] { 0 }, 0, 1, 1, 1, 438797212);
		} else {
			@Pc(9) int[] local9 = arg0.method7171(false);
			local21 = this.method20510(local9, 0, arg0.method7206(), arg0.method7206(), arg0.method7198(), 438797212);
		}
		local21.method18174(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local21;
	}

	@OriginalMember(owner = "client!afc", name = "bg", descriptor = "(IIIII)V")
	@Override
	final void method20493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "oh", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20810(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		this.aBoolean473 = true;
	}

	@OriginalMember(owner = "client!afc", name = "oo", descriptor = "(ILclient!dy;)V")
	@Override
	public final void method20537(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		this.aBoolean473 = true;
	}

	@OriginalMember(owner = "client!afc", name = "c", descriptor = "()I")
	@Override
	public final int method20831() {
		return this.anInt2917 + this.anInt2916 + this.anInt2931;
	}

	@OriginalMember(owner = "client!afc", name = "oq", descriptor = "(IIII)V")
	@Override
	public final void method20587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20478();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "oi", descriptor = "(IIII)V")
	@Override
	public final void method20575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20478();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ot", descriptor = "(IIII)V")
	@Override
	public final void method20523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20478();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "vh", descriptor = "()V")
	abstract void method21063();

	@OriginalMember(owner = "client!afc", name = "xn", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21064(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "px", descriptor = "(Z)V")
	@Override
	public final void method20709(@OriginalArg(0) boolean arg0) {
		this.aBoolean475 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "qg", descriptor = "()V")
	@Override
	public final void method20866() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28854();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qe", descriptor = "()V")
	@Override
	public final void method20867() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28854();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ql", descriptor = "()V")
	@Override
	public final void method20868() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28863();
		}
	}

	@OriginalMember(owner = "client!afc", name = "si", descriptor = "()V")
	final void method21065() {
		this.anInterface37_16 = this.method21025(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29496(local6, 12);
		this.aClass145_18 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "aef", descriptor = "()V")
	abstract void method21066();

	@OriginalMember(owner = "client!afc", name = "qc", descriptor = "()V")
	@Override
	public final void method20871() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28860();
		}
	}

	@OriginalMember(owner = "client!afc", name = "adk", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method21067(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "zl", descriptor = "()V")
	abstract void method21068();

	@OriginalMember(owner = "client!afc", name = "jb", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public final Class100 method20539(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class100_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "qw", descriptor = "()V")
	@Override
	public final void method20875() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28860();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aan", descriptor = "()V")
	final void method21069() {
		this.aBoolean485 = false;
		this.method21056();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "wb", descriptor = "(Lclient!le;)V")
	public final void method21070(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1303(arg0, anObject7, 769519410);
	}

	@OriginalMember(owner = "client!afc", name = "wq", descriptor = "(Lclient!le;)V")
	public final void method21071(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1304(arg0, 2080091494);
	}

	@OriginalMember(owner = "client!afc", name = "qj", descriptor = "()V")
	@Override
	public final void method20869() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28863();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ih", descriptor = "(IIIIII)V")
	@Override
	public final void method20859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20500(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "add", descriptor = "(I)V")
	public final void method21072(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20991();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ju", descriptor = "(IIIILclient!ou;Lclient!oj;)Z")
	@Override
	final boolean method20681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method30023(arg4);
		local2.method30134(this.aClass489_85);
		return arg5.method29461(arg0, arg1, arg2, arg3, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "wx", descriptor = "()Z")
	public abstract boolean method21073();

	@OriginalMember(owner = "client!afc", name = "wh", descriptor = "()Z")
	public abstract boolean method21074();

	@OriginalMember(owner = "client!afc", name = "wd", descriptor = "()Z")
	public abstract boolean method21075();

	@OriginalMember(owner = "client!afc", name = "ww", descriptor = "()Z")
	public abstract boolean method21076();

	@OriginalMember(owner = "client!afc", name = "nx", descriptor = "(FFF[F)V")
	@Override
	public final void method20672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * arg0 + this.aClass489_85.aFloatArray116[6] * arg1 + this.aClass489_85.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat200 + this.aFloat201 * local115 / local59;
			arg3[1] = this.aFloat202 + this.aFloat203 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afc", name = "wi", descriptor = "(Z)Z")
	public abstract boolean method21077(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "ads", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method21078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "ft", descriptor = "()Z")
	@Override
	public final boolean method20656() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "mq", descriptor = "([I)Lclient!cj;")
	@Override
	public final Class102 method20767(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xy", descriptor = "(Z)Z")
	public abstract boolean method21079(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "xw", descriptor = "()Z")
	final boolean method21080() {
		return this.aBoolean463;
	}

	@OriginalMember(owner = "client!afc", name = "km", descriptor = "(Lclient!dm;)V")
	@Override
	public final void method20726(@OriginalArg(0) Class229 arg0) {
		this.aClass395_3.method28530(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xv", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21081(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xg", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21082(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xa", descriptor = "(Ljava/nio/ByteBuffer;)J")
	final long method21083(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "jc", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;")
	@Override
	public final Class106 method20699(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	public abstract Class115 method21084(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afc", name = "xh", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	final byte[] method21085(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass497_92.method30252(arg0, arg1, 1200487767);
	}

	@OriginalMember(owner = "client!afc", name = "zh", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method21086(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap6.method27847(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "ik", descriptor = "(IIIIIILclient!ch;II)V")
	@Override
	public final void method20701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afc", name = "acb", descriptor = "()V")
	abstract void method21087();

	@OriginalMember(owner = "client!afc", name = "xr", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21088(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "xc", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21089(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "adr", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;")
	abstract Interface35 method21090(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afc", name = "xe", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21091(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "lx", descriptor = "(I)Lclient!dz;")
	@Override
	public final Class107 method20749(@OriginalArg(0) int arg0) {
		return new Class107_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "rt", descriptor = "(I)Ljava/nio/ByteBuffer;")
	final ByteBuffer method21092(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!afc", name = "xo", descriptor = "()V")
	public final void method21093() {
		this.anInterface43Array3 = new Interface43[this.anInt2954];
		this.aClass489Array5 = new Class489[this.anInt2954];
		this.aClass425Array3 = new Class425[this.anInt2954];
		this.aClass421Array5 = new Class421[this.anInt2954];
		this.aClass421Array6 = new Class421[this.anInt2954];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2954; local26++) {
			this.aClass421Array6[local26] = Class421.aClass421_1;
			this.aClass421Array5[local26] = Class421.aClass421_1;
			this.aClass425Array3[local26] = Class425.aClass425_3;
			this.aClass489Array5[local26] = new Class489();
		}
		this.aClass93_Sub16Array19 = new Class93_Sub16[this.anInt2920 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface38_23 = this.method20973(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface38_24 = this.method20973(1, 1, false, local68, 0, 0);
		this.method20506(new Class93_Sub35_Sub1(262144));
		this.aClass145_21 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }) });
		this.aClass145_22 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass145_20 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1), new Class400(Class399.aClass399_2) });
		this.aClass145_19 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass109_Sub3Array5[local205] = new Class109_Sub3(this, 0, 0, false, false);
			this.aClass109_Sub3Array6[local205] = new Class109_Sub3(this, 0, 0, true, true);
		}
		this.method20910();
		this.anInterface40_4 = this.method21007(true);
		this.method21173();
		this.method20478();
		this.method20461();
		this.aClass100_Sub1_5 = new Class100_Sub1(this, this.anInterface38_23);
		this.aClass100_Sub1_6 = new Class100_Sub1(this, this.anInterface38_24);
		this.method20786(3, 0);
	}

	@OriginalMember(owner = "client!afc", name = "xk", descriptor = "()V")
	public final void method21094() {
		this.anInterface43Array3 = new Interface43[this.anInt2954];
		this.aClass489Array5 = new Class489[this.anInt2954];
		this.aClass425Array3 = new Class425[this.anInt2954];
		this.aClass421Array5 = new Class421[this.anInt2954];
		this.aClass421Array6 = new Class421[this.anInt2954];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2954; local26++) {
			this.aClass421Array6[local26] = Class421.aClass421_1;
			this.aClass421Array5[local26] = Class421.aClass421_1;
			this.aClass425Array3[local26] = Class425.aClass425_3;
			this.aClass489Array5[local26] = new Class489();
		}
		this.aClass93_Sub16Array19 = new Class93_Sub16[this.anInt2920 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface38_23 = this.method20973(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface38_24 = this.method20973(1, 1, false, local68, 0, 0);
		this.method20506(new Class93_Sub35_Sub1(262144));
		this.aClass145_21 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }) });
		this.aClass145_22 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass145_20 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1), new Class400(Class399.aClass399_2) });
		this.aClass145_19 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass109_Sub3Array5[local205] = new Class109_Sub3(this, 0, 0, false, false);
			this.aClass109_Sub3Array6[local205] = new Class109_Sub3(this, 0, 0, true, true);
		}
		this.method20910();
		this.anInterface40_4 = this.method21007(true);
		this.method21173();
		this.method20478();
		this.method20461();
		this.aClass100_Sub1_5 = new Class100_Sub1(this, this.anInterface38_23);
		this.aClass100_Sub1_6 = new Class100_Sub1(this, this.anInterface38_24);
		this.method20786(3, 0);
	}

	@OriginalMember(owner = "client!afc", name = "afi", descriptor = "(I)V")
	final void method21095(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean462) {
			this.aBoolean462 = local10;
			this.method20998();
		}
		if (local12 != this.aBoolean481) {
			this.aBoolean481 = local12;
			this.method21116();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20999();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "wm", descriptor = "()V")
	final void method21096() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305(16711935);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method31065();
		}
	}

	@OriginalMember(owner = "client!afc", name = "xt", descriptor = "()V")
	void method21097() {
		this.method20997(7);
		this.method21308();
	}

	@OriginalMember(owner = "client!afc", name = "ye", descriptor = "()V")
	final void method21098() {
		this.method20930();
		this.method20961();
		this.method21174();
		this.method21140();
		this.method21248();
		this.method20963();
		this.method20964();
		this.method20956();
		this.method20957();
		this.method20918();
		this.method21063();
		this.method21116();
		this.method20999();
		this.method20998();
		for (@Pc(32) int local32 = this.anInt2954 - 1; local32 >= 0; local32--) {
			this.method20978(local32);
			this.method21197();
			this.method20992();
			this.method20988();
		}
		this.method20989();
		this.method20937();
	}

	@OriginalMember(owner = "client!afc", name = "yo", descriptor = "()V")
	final void method21099() {
		this.method20930();
		this.method20961();
		this.method21174();
		this.method21140();
		this.method21248();
		this.method20963();
		this.method20964();
		this.method20956();
		this.method20957();
		this.method20918();
		this.method21063();
		this.method21116();
		this.method20999();
		this.method20998();
		for (@Pc(32) int local32 = this.anInt2954 - 1; local32 >= 0; local32--) {
			this.method20978(local32);
			this.method21197();
			this.method20992();
			this.method20988();
		}
		this.method20989();
		this.method20937();
	}

	@OriginalMember(owner = "client!afc", name = "yj", descriptor = "()V")
	void method21100() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28711();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method31065();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method31065();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method31065();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28890();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28516();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method31065();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28853();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ys", descriptor = "()V")
	void method21101() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28711();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method31065();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method31065();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method31065();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28890();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28516();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method31065();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28853();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "yk", descriptor = "()V")
	void method21102() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28711();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method31065();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method31065();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method31065();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28890();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28516();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method31065();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28853();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "yn", descriptor = "()V")
	void method21103() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28712();
		}
		if (this.aClass137Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass137Array3.length; local10++) {
				if (this.aClass137Array3[local10] != null && this.aClass137Array3[local10].method11482()) {
					this.aClass137Array3[local10].method11450();
				}
			}
		}
		this.aClass395_3 = new Class395(this);
		this.method20914();
		this.method21065();
		this.method20916();
		this.aClass419_3 = new Class419(this, 1024);
		this.aClass395_3.method28515(this);
		if (this.aBoolean476) {
			this.aClass414_3 = new Class414(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afc", name = "fl", descriptor = "()Ljava/lang/String;")
	public abstract String method20594();

	@OriginalMember(owner = "client!afc", name = "yq", descriptor = "()V")
	final void method21104() {
		this.anInterface37_17 = this.method21025(false);
		@Pc(6) short local6 = 160;
		this.anInterface37_17.method29496(local6, 32);
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
		this.anInterface37_17.method29514(0, this.aByteBuffer7.position(), this.aLong132);
		this.aClass145_17 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1, Class399.aClass399_1 }) });
	}

	@OriginalMember(owner = "client!afc", name = "yh", descriptor = "()V")
	final void method21105() {
		this.anInterface37_17 = this.method21025(false);
		@Pc(6) short local6 = 160;
		this.anInterface37_17.method29496(local6, 32);
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
		this.anInterface37_17.method29514(0, this.aByteBuffer7.position(), this.aLong132);
		this.aClass145_17 = this.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1, Class399.aClass399_1 }) });
	}

	@OriginalMember(owner = "client!afc", name = "yb", descriptor = "()V")
	final void method21106() {
		this.anInterface37_16 = this.method21025(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29496(local6, 12);
		this.aClass145_18 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "nc", descriptor = "(I)Lclient!akz;")
	@Override
	public final Class93_Sub35 method20542(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub35_Sub1 local4 = new Class93_Sub35_Sub1(arg0);
		this.aClass22_34.method407(local4, -1828634797);
		return local4;
	}

	@OriginalMember(owner = "client!afc", name = "yz", descriptor = "()V")
	final void method21107() {
		this.anInterface37_16 = this.method21025(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29496(local6, 12);
		this.aClass145_18 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "yw", descriptor = "()V")
	final void method21108() {
		this.anInterface37_15 = this.method21025(false);
		this.anInterface37_15.method29496(3096, 12);
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
		this.anInterface37_15.method29514(0, this.aByteBuffer7.position(), this.aLong132);
	}

	@OriginalMember(owner = "client!afc", name = "yx", descriptor = "()F")
	public abstract float method21109();

	@OriginalMember(owner = "client!afc", name = "yr", descriptor = "()Lclient!lm;")
	final Class401 method21110() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28861();
	}

	@OriginalMember(owner = "client!afc", name = "bn", descriptor = "(IIII)V")
	@Override
	public final void method20472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2921 < local21) {
			this.anInt2921 = local21;
			local43 = true;
		}
		if (this.anInt2958 > local28) {
			this.anInt2958 = local28;
			local43 = true;
		}
		if (this.anInt2940 < local34) {
			this.anInt2940 = local34;
			local43 = true;
		}
		if (this.anInt2930 > local41) {
			this.anInt2930 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "acs", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;")
	final Interface38 method21111(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20972(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "yv", descriptor = "()Lclient!lm;")
	final Class401 method21112() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28861();
	}

	@OriginalMember(owner = "client!afc", name = "ym", descriptor = "()Lclient!lm;")
	final Class401 method21113() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28861();
	}

	@OriginalMember(owner = "client!afc", name = "yf", descriptor = "()V")
	final void method21114() {
		this.method20922();
	}

	@OriginalMember(owner = "client!afc", name = "vx", descriptor = "(Lclient!mv;)V")
	public final void method21115(@OriginalArg(0) Class425 arg0) {
		this.aClass425Array3[this.anInt2949] = arg0;
		this.method21211();
	}

	@OriginalMember(owner = "client!afc", name = "vg", descriptor = "()V")
	abstract void method21116();

	@OriginalMember(owner = "client!afc", name = "yy", descriptor = "()Z")
	final boolean method21117() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "vk", descriptor = "(Lclient!lo;)V")
	public abstract void method21118(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!afc", name = "yu", descriptor = "()Z")
	final boolean method21119() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "yt", descriptor = "()Z")
	final boolean method21120() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28703(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28748();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "aba", descriptor = "()V")
	abstract void method21121();

	@OriginalMember(owner = "client!afc", name = "afj", descriptor = "(Z)V")
	abstract void method21122(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "zn", descriptor = "(I)Lclient!ml;")
	final Interface40 method21123(@OriginalArg(0) int arg0) {
		if (this.anInterface40_4.method29519() < arg0 * 2) {
			this.anInterface40_4.method29532(arg0);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!afc", name = "cl", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method20498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20921();
		@Pc(50) Class128 local50 = this.aClass128Array3[13];
		local50.method21357();
		local50.method21373(arg4);
		this.method20994(arg5);
		local50.method21361();
		this.method21235(false);
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
			if (!this.method20917(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21014();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21235(true);
		local50.method21356();
	}

	@OriginalMember(owner = "client!afc", name = "zy", descriptor = "()Lclient!mr;")
	public final Interface44 method21124() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18137();
	}

	@OriginalMember(owner = "client!afc", name = "zi", descriptor = "()Lclient!mr;")
	public final Interface44 method21125() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18137();
	}

	@OriginalMember(owner = "client!afc", name = "zj", descriptor = "()Lclient!mr;")
	public final Interface44 method21126() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18137();
	}

	@OriginalMember(owner = "client!afc", name = "zw", descriptor = "()Lclient!mr;")
	public final Interface44 method21127() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18137();
	}

	@OriginalMember(owner = "client!afc", name = "zq", descriptor = "()V")
	final void method21128() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.anInt2925 = this.anInt2923;
			this.anInt2926 = this.anInt2924;
			this.anInt2927 = this.anInt2941;
			this.anInt2928 = this.anInt2919;
			this.aFloat204 = this.aFloat206;
			this.aFloat205 = this.aFloat207;
		} else {
			this.anInt2925 = 0;
			this.anInt2926 = 0;
			this.anInt2927 = this.aClass112_6.method23748();
			this.anInt2928 = this.aClass112_6.method23749();
			this.aFloat204 = 0.0F;
			this.aFloat205 = 1.0F;
		}
		this.method20937();
		this.aFloat201 = (float) this.anInt2941 / 2.0F;
		this.aFloat203 = (float) this.anInt2919 / 2.0F;
		this.aFloat200 = (float) this.anInt2923 + this.aFloat201;
		this.aFloat202 = (float) this.anInt2924 + this.aFloat203;
	}

	@OriginalMember(owner = "client!afc", name = "zo", descriptor = "(II)V")
	final void method21129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20937();
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zk", descriptor = "(II)V")
	final void method21130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20937();
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zm", descriptor = "(II)V")
	final void method21131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20937();
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zu", descriptor = "()V")
	abstract void method21133();

	@OriginalMember(owner = "client!afc", name = "ze", descriptor = "()V")
	abstract void method21134();

	@OriginalMember(owner = "client!afc", name = "zv", descriptor = "()V")
	abstract void method21135();

	@OriginalMember(owner = "client!afc", name = "adp", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;")
	final Interface38 method21136(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20972(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "aca", descriptor = "()V")
	abstract void method21137();

	@OriginalMember(owner = "client!afc", name = "uk", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;")
	abstract Interface35 method21138(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afc", name = "rh", descriptor = "(Lclient!le;)V")
	public final void method21139(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1304(arg0, 1747078833);
	}

	@OriginalMember(owner = "client!afc", name = "ul", descriptor = "()V")
	final void method21140() {
		if (this.method21220()) {
			this.method20965();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "aaa", descriptor = "()Lclient!ou;")
	final Class470 method21141() {
		if (this.aClass408_3 != Class408.aClass408_6) {
			return this.aClass470_37;
		}
		if (!this.aBoolean460) {
			this.aClass470_35.method29545(this.aClass470_37);
			this.aClass470_35.method29569(this.aClass470_38);
			this.aClass489_76.method30023(this.aClass470_35);
			this.aBoolean460 = true;
		}
		return this.aClass470_35;
	}

	@OriginalMember(owner = "client!afc", name = "zg", descriptor = "()Lclient!pq;")
	final Class489 method21142() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_75 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "zx", descriptor = "()Lclient!pq;")
	final Class489 method21143() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_75 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "zr", descriptor = "()Lclient!pq;")
	final Class489 method21144() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_72 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "ui", descriptor = "(IIZ[I)Lclient!lz;")
	final Interface38 method21145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20973(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "aag", descriptor = "()V")
	final void method21146() {
		this.aClass489_85.method30018(this.aClass489_75);
		this.aClass489_85.method30134(this.aClass489_81);
		this.aClass489_85.method30021(this.aFloatArrayArray22[0]);
		this.aClass489_85.method30057(this.aFloatArrayArray22[1]);
		this.aClass489_85.method30039(this.aFloatArrayArray22[2]);
		this.aClass489_85.method30040(this.aFloatArrayArray22[3]);
		this.aClass489_85.method30041(this.aFloatArrayArray22[4]);
		this.aClass489_85.method30042(this.aFloatArrayArray22[5]);
		this.aClass489_84.method30018(this.aClass489_85);
		this.method20946(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "aak", descriptor = "()V")
	final void method21147() {
		this.aClass489_85.method30018(this.aClass489_75);
		this.aClass489_85.method30134(this.aClass489_81);
		this.aClass489_85.method30021(this.aFloatArrayArray22[0]);
		this.aClass489_85.method30057(this.aFloatArrayArray22[1]);
		this.aClass489_85.method30039(this.aFloatArrayArray22[2]);
		this.aClass489_85.method30040(this.aFloatArrayArray22[3]);
		this.aClass489_85.method30041(this.aFloatArrayArray22[4]);
		this.aClass489_85.method30042(this.aFloatArrayArray22[5]);
		this.aClass489_84.method30018(this.aClass489_85);
		this.method20946(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "aad", descriptor = "()V")
	final void method21148() {
		this.aClass489_85.method30018(this.aClass489_75);
		this.aClass489_85.method30134(this.aClass489_81);
		this.aClass489_85.method30021(this.aFloatArrayArray22[0]);
		this.aClass489_85.method30057(this.aFloatArrayArray22[1]);
		this.aClass489_85.method30039(this.aFloatArrayArray22[2]);
		this.aClass489_85.method30040(this.aFloatArrayArray22[3]);
		this.aClass489_85.method30041(this.aFloatArrayArray22[4]);
		this.aClass489_85.method30042(this.aFloatArrayArray22[5]);
		this.aClass489_84.method30018(this.aClass489_85);
		this.method20946(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "afz", descriptor = "(B)V")
	final void method21149(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method20995(0);
			this.method20994(1);
		} else {
			this.method20995(3);
			this.method20994(3);
		}
		this.method20998();
	}

	@OriginalMember(owner = "client!afc", name = "aax", descriptor = "()Lclient!pq;")
	final Class489 method21150() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			if (!this.aBoolean460) {
				this.method20943();
			}
			return this.aClass489_76;
		} else {
			return this.aClass489_74;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aat", descriptor = "()Lclient!pq;")
	final Class489 method21151() {
		return this.aClass489_84;
	}

	@OriginalMember(owner = "client!afc", name = "aas", descriptor = "()Lclient!pq;")
	final Class489 method21152() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aaf", descriptor = "()Lclient!pq;")
	final Class489 method21153() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aar", descriptor = "()Lclient!pq;")
	final Class489 method21154() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aai", descriptor = "(Lclient!pq;)V")
	public abstract void method21155(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!afc", name = "aap", descriptor = "(Lclient!pq;)V")
	public abstract void method21156(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!afc", name = "aaq", descriptor = "()V")
	final void method21157() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "ja", descriptor = "(ILclient!ch;II)V")
	@Override
	public final void method20607(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20530(false);
		this.aClass100_Sub1_6.method18196(0.0F, 0.0F, (float) this.method20446((byte) -58).method23748(), 0.0F, 0.0F, (float) this.method20446((byte) -6).method23749(), 0, arg1, arg2, arg3);
		this.method20530(true);
	}

	@OriginalMember(owner = "client!afc", name = "aao", descriptor = "()V")
	final void method21158() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "mv", descriptor = "(FFFFF)V")
	@Override
	public final void method20763(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class137_Sub1.aFloat126 = arg0;
		Class137_Sub1.aFloat124 = arg1;
		Class137_Sub1.aFloat125 = arg2;
		Class137_Sub1.aFloat127 = arg3;
		Class137_Sub1.aFloat128 = arg4;
	}

	@OriginalMember(owner = "client!afc", name = "aab", descriptor = "()V")
	final void method21159() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21307();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20953();
		this.method21003();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "yi", descriptor = "()Lclient!lm;")
	final Class401 method21160() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28861();
	}

	@OriginalMember(owner = "client!afc", name = "aal", descriptor = "()V")
	final void method21161() {
		this.aBoolean471 = false;
		if (this.aClass408_3 == Class408.aClass408_5) {
			this.method21026();
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ls", descriptor = "(IFFFFF)V")
	@Override
	public final void method20745(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20930();
			}
			this.method20961();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21248();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20963();
	}

	@OriginalMember(owner = "client!afc", name = "ol", descriptor = "(IIII)V")
	@Override
	public final void method20785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23748();
			local10 = this.aClass112_6.method23749();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20478();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aah", descriptor = "()V")
	final void method21162() {
		this.aBoolean485 = false;
		this.method21056();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aaw", descriptor = "()V")
	final void method21163() {
		this.aBoolean485 = false;
		this.method21056();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20953();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aeg", descriptor = "()V")
	abstract void method21164();

	@OriginalMember(owner = "client!afc", name = "aac", descriptor = "()V")
	final void method21165() {
		if (this.aBoolean471) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23748();
			local13 = this.aClass112_6.method23749();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method30017();
		} else {
			local21.method30031(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method30018(local21);
		this.method20946(this.aClass489_79);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!afc", name = "aav", descriptor = "()V")
	final void method21166() {
		if (this.aBoolean471) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23748();
			local13 = this.aClass112_6.method23749();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method30017();
		} else {
			local21.method30031(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method30018(local21);
		this.method20946(this.aClass489_79);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!afc", name = "fc", descriptor = "()Z")
	@Override
	public final boolean method20588() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!afc", name = "abo", descriptor = "()V")
	final void method21167() {
		if (this.aBoolean471) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23748();
			local13 = this.aClass112_6.method23749();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method30017();
		} else {
			local21.method30031(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method30018(local21);
		this.method20946(this.aClass489_79);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!afc", name = "yg", descriptor = "()V")
	void method21168() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28712();
		}
		if (this.aClass137Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass137Array3.length; local10++) {
				if (this.aClass137Array3[local10] != null && this.aClass137Array3[local10].method11482()) {
					this.aClass137Array3[local10].method11450();
				}
			}
		}
		this.aClass395_3 = new Class395(this);
		this.method20914();
		this.method21065();
		this.method20916();
		this.aClass419_3 = new Class419(this, 1024);
		this.aClass395_3.method28515(this);
		if (this.aBoolean476) {
			this.aClass414_3 = new Class414(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afc", name = "tj", descriptor = "()Lclient!pq;")
	final Class489 method21169() {
		return this.aClass489_84;
	}

	@OriginalMember(owner = "client!afc", name = "abq", descriptor = "(Z)V")
	final void method21170(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean459) {
			this.aBoolean459 = arg0;
			this.method20956();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abw", descriptor = "(Z)V")
	final void method21171(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean459) {
			this.aBoolean459 = arg0;
			this.method20956();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "zs", descriptor = "()V")
	abstract void method21172();

	@OriginalMember(owner = "client!afc", name = "sw", descriptor = "()V")
	void method21173() {
		this.method20997(7);
		this.method21308();
	}

	@OriginalMember(owner = "client!afc", name = "tg", descriptor = "()V")
	abstract void method21174();

	@OriginalMember(owner = "client!afc", name = "abb", descriptor = "(Z)V")
	final void method21175(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method20957();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abc", descriptor = "(Z)V")
	final void method21176(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method20957();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abg", descriptor = "()V")
	abstract void method21177();

	@OriginalMember(owner = "client!afc", name = "abn", descriptor = "()V")
	abstract void method21178();

	@OriginalMember(owner = "client!afc", name = "abj", descriptor = "()V")
	abstract void method21179();

	@OriginalMember(owner = "client!afc", name = "ws", descriptor = "()Z")
	public abstract boolean method21180();

	@OriginalMember(owner = "client!afc", name = "aer", descriptor = "(ILclient!mn;Z)V")
	abstract void method21181(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afc", name = "abu", descriptor = "(Z)V")
	final void method21182(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean467) {
			this.aBoolean467 = arg0;
			this.method21174();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "fg", descriptor = "()Z")
	@Override
	public final boolean method20849() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "abp", descriptor = "()V")
	abstract void method21183();

	@OriginalMember(owner = "client!afc", name = "abm", descriptor = "()V")
	abstract void method21184();

	@OriginalMember(owner = "client!afc", name = "tc", descriptor = "()Lclient!pq;")
	final Class489 method21185() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			if (!this.aBoolean460) {
				this.method20943();
			}
			return this.aClass489_76;
		} else {
			return this.aClass489_74;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abk", descriptor = "()V")
	abstract void method21186();

	@OriginalMember(owner = "client!afc", name = "aby", descriptor = "()V")
	abstract void method21187();

	@OriginalMember(owner = "client!afc", name = "lo", descriptor = "(IFFFFF)V")
	@Override
	public final void method20708(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20930();
			}
			this.method20961();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21248();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20963();
	}

	@OriginalMember(owner = "client!afc", name = "abd", descriptor = "()V")
	abstract void method21188();

	@OriginalMember(owner = "client!afc", name = "abt", descriptor = "()V")
	abstract void method21189();

	@OriginalMember(owner = "client!afc", name = "abs", descriptor = "()V")
	abstract void method21190();

	@OriginalMember(owner = "client!afc", name = "hj", descriptor = "([I)V")
	@Override
	public final void method20651(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "acd", descriptor = "()V")
	abstract void method21191();

	@OriginalMember(owner = "client!afc", name = "ack", descriptor = "()V")
	abstract void method21192();

	@OriginalMember(owner = "client!afc", name = "acm", descriptor = "()V")
	abstract void method21193();

	@OriginalMember(owner = "client!afc", name = "act", descriptor = "()V")
	abstract void method21194();

	@OriginalMember(owner = "client!afc", name = "aci", descriptor = "()V")
	abstract void method21195();

	@OriginalMember(owner = "client!afc", name = "ach", descriptor = "()V")
	abstract void method21196();

	@OriginalMember(owner = "client!afc", name = "vw", descriptor = "()V")
	abstract void method21197();

	@OriginalMember(owner = "client!afc", name = "acx", descriptor = "()V")
	final void method21198() {
		if (this.method21220()) {
			this.method20965();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "ahv", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	abstract Interface38 method21199(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "acw", descriptor = "()V")
	final void method21200() {
		if (this.method21220()) {
			this.method20965();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "acv", descriptor = "()V")
	final void method21201() {
		if (this.method21220()) {
			this.method20965();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "acu", descriptor = "()V")
	abstract void method21202();

	@OriginalMember(owner = "client!afc", name = "iq", descriptor = "()V")
	@Override
	public final void method20655() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23748();
			this.anInt2930 = this.aClass112_6.method23749();
		}
		if (this.aBoolean482) {
			this.aBoolean482 = false;
			this.method20939();
		}
	}

	@OriginalMember(owner = "client!afc", name = "acz", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21203(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "acp", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21204(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "acq", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21205(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "xb", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21206(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "acj", descriptor = "(IIZ[I)Lclient!lz;")
	final Interface38 method21207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20973(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "aco", descriptor = "(IIZ[I)Lclient!lz;")
	final Interface38 method21208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20973(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "ace", descriptor = "(IIZ[I)Lclient!lz;")
	final Interface38 method21209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20973(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acl", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;")
	final Interface38 method21210(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20915(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "vl", descriptor = "()V")
	final void method21211() {
		this.method20990();
	}

	@OriginalMember(owner = "client!afc", name = "acf", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;")
	final Interface38 method21212(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20915(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "hy", descriptor = "(Z)V")
	@Override
	public final void method20642(@OriginalArg(0) boolean arg0) {
		this.aBoolean464 = arg0;
		this.method20957();
	}

	@OriginalMember(owner = "client!afc", name = "acn", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;")
	final Interface38 method21213(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20972(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "adl", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;")
	final Interface38 method21214(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20972(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "agm", descriptor = "(Lclient!ml;)V")
	abstract void method21215(@OriginalArg(0) Interface40 arg0);

	@OriginalMember(owner = "client!afc", name = "adc", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;")
	final Interface38 method21216(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20972(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "ada", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	abstract Interface38 method21217(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "adh", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	abstract Interface38 method21218(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "abe", descriptor = "()V")
	abstract void method21219();

	@OriginalMember(owner = "client!afc", name = "rz", descriptor = "()Z")
	final boolean method21220() {
		return this.aBoolean463;
	}

	@OriginalMember(owner = "client!afc", name = "adz", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method21221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "qr", descriptor = "()V")
	@Override
	public final void method20870() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28863();
		}
	}

	@OriginalMember(owner = "client!afc", name = "za", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method21222(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap6.method27847(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "adn", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method21223(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "wc", descriptor = "()V")
	final void method21224() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305(16711935);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method31065();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ado", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method21225(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "eu", descriptor = "()V")
	@Override
	public final void method20584() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28710(this.aClass137Array3[3]);
			this.aClass406_3.method28748();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ade", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	abstract Interface42 method21226(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "dq", descriptor = "()Lclient!pq;")
	@Override
	public final Class489 method20666() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "adv", descriptor = "()I")
	public final int method21227() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "ba", descriptor = "(IIIII)V")
	@Override
	final void method20744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20496(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "zf", descriptor = "()Lclient!pq;")
	final Class489 method21228() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_72 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "abi", descriptor = "(Z)V")
	final void method21229(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method20957();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "uc", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21230(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "abh", descriptor = "(Z)V")
	final void method21231(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method20957();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ady", descriptor = "(I)V")
	public final void method21232(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20991();
		}
	}

	@OriginalMember(owner = "client!afc", name = "adu", descriptor = "(Lclient!mq;)V")
	public final void method21233(@OriginalArg(0) Interface43 arg0) {
		if (this.anInterface43Array3[this.anInt2949] == arg0) {
			return;
		}
		this.anInterface43Array3[this.anInt2949] = arg0;
		if (arg0 == null) {
			this.anInterface38_23.method11412();
		} else {
			arg0.method11412();
		}
		this.anInt2959 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afc", name = "adt", descriptor = "(Lclient!mq;)V")
	public final void method21234(@OriginalArg(0) Interface43 arg0) {
		if (this.anInterface43Array3[this.anInt2949] == arg0) {
			return;
		}
		this.anInterface43Array3[this.anInt2949] = arg0;
		if (arg0 == null) {
			this.anInterface38_23.method11412();
		} else {
			arg0.method11412();
		}
		this.anInt2959 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afc", name = "vj", descriptor = "(Z)V")
	abstract void method21235(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "aew", descriptor = "(I)V")
	public final void method21236(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21055(Class421.aClass421_1, Class421.aClass421_1);
				break;
			case 1:
				this.method21055(Class421.aClass421_2, Class421.aClass421_2);
				break;
			case 2:
				this.method21055(Class421.aClass421_5, Class421.aClass421_2);
				break;
			case 3:
				this.method21055(Class421.aClass421_3, Class421.aClass421_1);
				break;
			case 4:
				this.method21055(Class421.aClass421_4, Class421.aClass421_4);
		}
	}

	@OriginalMember(owner = "client!afc", name = "aeu", descriptor = "(Lclient!mk;Lclient!mk;)V")
	public final void method21237(@OriginalArg(0) Class421 arg0, @OriginalArg(1) Class421 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass421Array5[this.anInt2949] != arg0) {
			this.aClass421Array5[this.anInt2949] = arg0;
			this.method21197();
			local1 = true;
		}
		if (this.aClass421Array6[this.anInt2949] != arg1) {
			this.aClass421Array6[this.anInt2949] = arg1;
			this.method20992();
			local1 = true;
		}
		if (local1) {
			this.anInt2959 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aez", descriptor = "(Lclient!mk;Lclient!mk;)V")
	public final void method21238(@OriginalArg(0) Class421 arg0, @OriginalArg(1) Class421 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass421Array5[this.anInt2949] != arg0) {
			this.aClass421Array5[this.anInt2949] = arg0;
			this.method21197();
			local1 = true;
		}
		if (this.aClass421Array6[this.anInt2949] != arg1) {
			this.aClass421Array6[this.anInt2949] = arg1;
			this.method20992();
			local1 = true;
		}
		if (local1) {
			this.anInt2959 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ky", descriptor = "(Lclient!dm;)V")
	@Override
	public final void method20727(@OriginalArg(0) Class229 arg0) {
		this.aClass395_3.method28530(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "aen", descriptor = "(ILclient!mn;ZZ)V")
	abstract void method21239(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!afc", name = "aet", descriptor = "(ILclient!mn;)V")
	public final void method21240(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20983(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!afc", name = "mw", descriptor = "(FFFFFF)V")
	@Override
	final void method20780(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class137_Sub2.aFloat133 = arg0;
		Class137_Sub2.aFloat132 = arg1;
		Class137_Sub2.aFloat131 = arg2;
		Class137_Sub2.aFloat134 = arg5;
	}

	@OriginalMember(owner = "client!afc", name = "aes", descriptor = "(ILclient!mn;Z)V")
	abstract void method21241(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afc", name = "h", descriptor = "()Z")
	@Override
	public final boolean method20441() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "aev", descriptor = "()Lclient!pq;")
	final Class489 method21242() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "yp", descriptor = "()V")
	final void method21243() {
		this.anInterface37_16 = this.method21025(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29496(local6, 12);
		this.aClass145_18 = this.method21005(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "aex", descriptor = "()Lclient!pq;")
	final Class489 method21244() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "aec", descriptor = "()V")
	final void method21245() {
		if (this.aClass425Array3[this.anInt2949] != Class425.aClass425_3) {
			this.aClass425Array3[this.anInt2949] = Class425.aClass425_3;
			this.aClass489Array5[this.anInt2949].method30017();
			this.method21211();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aeo", descriptor = "()V")
	final void method21246() {
		this.method20990();
	}

	@OriginalMember(owner = "client!afc", name = "aeq", descriptor = "()V")
	abstract void method21247();

	@OriginalMember(owner = "client!afc", name = "tk", descriptor = "()V")
	abstract void method21248();

	@OriginalMember(owner = "client!afc", name = "aei", descriptor = "()V")
	abstract void method21249();

	@OriginalMember(owner = "client!afc", name = "nh", descriptor = "(Lclient!de;Z)Lclient!cm;")
	@Override
	public final Class100 method20792(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class100 local21;
		if (arg0.method7206() == 0 || arg0.method7198() == 0) {
			local21 = this.method20510(new int[] { 0 }, 0, 1, 1, 1, 438797212);
		} else {
			@Pc(9) int[] local9 = arg0.method7171(false);
			local21 = this.method20510(local9, 0, arg0.method7206(), arg0.method7206(), arg0.method7198(), 438797212);
		}
		local21.method18174(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local21;
	}

	@OriginalMember(owner = "client!afc", name = "aej", descriptor = "()V")
	abstract void method21250();

	@OriginalMember(owner = "client!afc", name = "aea", descriptor = "()V")
	abstract void method21251();

	@OriginalMember(owner = "client!afc", name = "aed", descriptor = "()V")
	abstract void method21252();

	@OriginalMember(owner = "client!afc", name = "aee", descriptor = "()V")
	abstract void method21253();

	@OriginalMember(owner = "client!afc", name = "aek", descriptor = "()V")
	abstract void method21254();

	@OriginalMember(owner = "client!afc", name = "aem", descriptor = "()V")
	abstract void method21255();

	@OriginalMember(owner = "client!afc", name = "adi", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	abstract Interface38 method21256(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "bp", descriptor = "(IIIII)V")
	@Override
	final void method20450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20496(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "bt", descriptor = "(Z)V")
	@Override
	public final void method20481(@OriginalArg(0) boolean arg0) {
		this.aBoolean475 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "afy", descriptor = "()Lclient!dy;")
	final Class237 method21257() {
		return this.aClass237_6;
	}

	@OriginalMember(owner = "client!afc", name = "adg", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method21258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "afk", descriptor = "(I)V")
	final void method21259(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean462) {
			this.aBoolean462 = local10;
			this.method20998();
		}
		if (local12 != this.aBoolean481) {
			this.aBoolean481 = local12;
			this.method21116();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20999();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "afo", descriptor = "(I)V")
	final void method21260(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean462) {
			this.aBoolean462 = local10;
			this.method20998();
		}
		if (local12 != this.aBoolean481) {
			this.aBoolean481 = local12;
			this.method21116();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20999();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "fd", descriptor = "()Z")
	@Override
	public final boolean method20582() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "afe", descriptor = "()V")
	abstract void method21261();

	@OriginalMember(owner = "client!afc", name = "afm", descriptor = "()V")
	abstract void method21262();

	@OriginalMember(owner = "client!afc", name = "afg", descriptor = "()V")
	abstract void method21263();

	@OriginalMember(owner = "client!afc", name = "zd", descriptor = "(II)V")
	final void method21264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20937();
		if (!this.aBoolean482 && (this.aBoolean475 || this.method21278() == Class401.aClass401_3)) {
			this.aBoolean482 = true;
			this.method20939();
		}
		if (this.aBoolean482) {
			this.method20895();
		}
	}

	@OriginalMember(owner = "client!afc", name = "afc", descriptor = "()V")
	abstract void method21265();

	@OriginalMember(owner = "client!afc", name = "afb", descriptor = "()V")
	abstract void method21266();

	@OriginalMember(owner = "client!afc", name = "afr", descriptor = "()V")
	abstract void method21267();

	@OriginalMember(owner = "client!afc", name = "zb", descriptor = "()V")
	abstract void method21268();

	@OriginalMember(owner = "client!afc", name = "wf", descriptor = "()V")
	final void method21269() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305(16711935);
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method31065();
		}
	}

	@OriginalMember(owner = "client!afc", name = "afd", descriptor = "()V")
	abstract void method21270();

	@OriginalMember(owner = "client!afc", name = "acr", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21271(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "afs", descriptor = "(Z)V")
	final void method21272(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean478) {
			this.aBoolean478 = arg0;
			this.method20918();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "afx", descriptor = "(Z)V")
	final void method21273(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean478) {
			this.aBoolean478 = arg0;
			this.method20918();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aff", descriptor = "()V")
	final void method21274() {
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21359();
		}
		this.method21063();
	}

	@OriginalMember(owner = "client!afc", name = "afv", descriptor = "()V")
	final void method21275() {
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21359();
		}
		this.method21063();
	}

	@OriginalMember(owner = "client!afc", name = "afu", descriptor = "()V")
	abstract void method21276();

	@OriginalMember(owner = "client!afc", name = "aft", descriptor = "()V")
	abstract void method21277();

	@OriginalMember(owner = "client!afc", name = "sq", descriptor = "()Lclient!lm;")
	final Class401 method21278() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28861();
	}

	@OriginalMember(owner = "client!afc", name = "pn", descriptor = "(Z)V")
	@Override
	public final void method20579(@OriginalArg(0) boolean arg0) {
		this.aBoolean475 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "afp", descriptor = "(Z)Lclient!ml;")
	abstract Interface40 method21279(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "adm", descriptor = "()I")
	public final int method21280() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "aga", descriptor = "(Z)Lclient!lr;")
	abstract Interface37 method21281(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "agi", descriptor = "([Lclient!lk;)Lclient!lo;")
	abstract Class145 method21282(@OriginalArg(0) Class400[] arg0);

	@OriginalMember(owner = "client!afc", name = "agg", descriptor = "([Lclient!lk;)Lclient!lo;")
	abstract Class145 method21283(@OriginalArg(0) Class400[] arg0);

	@OriginalMember(owner = "client!afc", name = "agx", descriptor = "(Lclient!lo;)V")
	public abstract void method21284(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!afc", name = "agj", descriptor = "(Lclient!lo;)V")
	public abstract void method21285(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!afc", name = "age", descriptor = "(ILclient!lr;)V")
	public abstract void method21286(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1);

	@OriginalMember(owner = "client!afc", name = "agk", descriptor = "(ILclient!lr;)V")
	public abstract void method21287(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1);

	@OriginalMember(owner = "client!afc", name = "ly", descriptor = "(III)V")
	@Override
	public final void method20747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2957 == arg0 && this.anInt2947 == arg1 && this.anInt2956 == arg2) {
			return;
		}
		this.anInt2957 = arg0;
		this.anInt2947 = arg1;
		this.anInt2956 = arg2;
		this.method21028();
		this.method20918();
	}

	@OriginalMember(owner = "client!afc", name = "agf", descriptor = "()V")
	final void method21288() {
		this.method21060(0, this.anInterface37_16);
		this.method21118(this.aClass145_18);
		this.method21017(Class424.aClass424_6, 0, 1);
	}

	@OriginalMember(owner = "client!afc", name = "agd", descriptor = "()V")
	final void method21289() {
		this.method21060(0, this.anInterface37_16);
		this.method21118(this.aClass145_18);
		this.method21017(Class424.aClass424_6, 0, 1);
	}

	@OriginalMember(owner = "client!afc", name = "q", descriptor = "()Z")
	@Override
	public final boolean method20438() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "agw", descriptor = "(Lclient!ms;I)V")
	final void method21290(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21060(0, this.anInterface37_17);
		this.method21118(this.aClass145_17);
		this.method21017(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "agn", descriptor = "(Lclient!ms;I)V")
	final void method21291(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21060(0, this.anInterface37_17);
		this.method21118(this.aClass145_17);
		this.method21017(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "agu", descriptor = "(Lclient!ms;I)V")
	final void method21292(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21060(0, this.anInterface37_17);
		this.method21118(this.aClass145_17);
		this.method21017(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "ags", descriptor = "(Lclient!ms;I)V")
	final void method21293(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21060(0, this.anInterface37_17);
		this.method21118(this.aClass145_17);
		this.method21017(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "de", descriptor = "([I)Lclient!cj;")
	@Override
	public final Class102 method20548(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "agz", descriptor = "(Lclient!ms;II)V")
	public abstract void method21294(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afc", name = "agh", descriptor = "(Lclient!ml;Lclient!ms;IIII)V")
	abstract void method21295(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "ahm", descriptor = "(I)V")
	abstract void method21296(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "agr", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method21297(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "agt", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method21298(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "agl", descriptor = "()V")
	public final void method21299() {
		if (this.anInt2959 == 2) {
			return;
		}
		this.method20921();
		this.method21001(false);
		this.method21058(false);
		this.method20955(false);
		this.method21302(false);
		this.method20994(1);
		this.method20996((byte) 0);
		this.anInt2959 = 2;
	}

	@OriginalMember(owner = "client!afc", name = "if", descriptor = "(IIIII)V")
	@Override
	final void method20559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20496(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "agy", descriptor = "(I)V")
	abstract void method21301(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "ts", descriptor = "(Z)V")
	final void method21302(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method20957();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ahc", descriptor = "(I)V")
	abstract void method21303(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "iz", descriptor = "(IIIIII)V")
	@Override
	public final void method20675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20500(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "ahl", descriptor = "()V")
	abstract void method21305();

	@OriginalMember(owner = "client!afc", name = "hz", descriptor = "([I)V")
	@Override
	public final void method20652(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "ahf", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	abstract Interface38 method21306(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "tu", descriptor = "()V")
	final void method21307() {
		this.aBoolean460 = false;
	}

	@OriginalMember(owner = "client!afc", name = "ss", descriptor = "()V")
	final void method21308() {
		this.method20930();
		this.method20961();
		this.method21174();
		this.method21140();
		this.method21248();
		this.method20963();
		this.method20964();
		this.method20956();
		this.method20957();
		this.method20918();
		this.method21063();
		this.method21116();
		this.method20999();
		this.method20998();
		for (@Pc(32) int local32 = this.anInt2954 - 1; local32 >= 0; local32--) {
			this.method20978(local32);
			this.method21197();
			this.method20992();
			this.method20988();
		}
		this.method20989();
		this.method20937();
	}

	@OriginalMember(owner = "client!afc", name = "ahq", descriptor = "(I)V")
	abstract void method21309(@OriginalArg(0) int arg0);
}
