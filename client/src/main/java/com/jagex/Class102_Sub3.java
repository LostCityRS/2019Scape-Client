package com.jagex;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!afm")
public final class Class102_Sub3 extends Class102 {

	@OriginalMember(owner = "client!afm", name = "al", descriptor = "F")
	static final float aFloat55 = 0.35F;

	@OriginalMember(owner = "client!afm", name = "by", descriptor = "I")
	static final int anInt731 = 34167;

	@OriginalMember(owner = "client!afm", name = "af", descriptor = "I")
	static final int anInt732 = 1;

	@OriginalMember(owner = "client!afm", name = "am", descriptor = "I")
	static final int anInt733 = 2;

	@OriginalMember(owner = "client!afm", name = "at", descriptor = "I")
	static final int anInt734 = 8;

	@OriginalMember(owner = "client!afm", name = "ad", descriptor = "I")
	static final int anInt735 = 16;

	@OriginalMember(owner = "client!afm", name = "bh", descriptor = "I")
	static final int anInt736 = 0;

	@OriginalMember(owner = "client!afm", name = "an", descriptor = "I")
	static final int anInt737 = 32993;

	@OriginalMember(owner = "client!afm", name = "aa", descriptor = "I")
	static final int anInt738 = 5121;

	@OriginalMember(owner = "client!afm", name = "ae", descriptor = "I")
	static final int anInt739 = 5123;

	@OriginalMember(owner = "client!afm", name = "ak", descriptor = "I")
	static final int anInt740 = 4;

	@OriginalMember(owner = "client!afm", name = "ar", descriptor = "I")
	static final int anInt741 = 4;

	@OriginalMember(owner = "client!afm", name = "au", descriptor = "I")
	static final int anInt742 = 7;

	@OriginalMember(owner = "client!afm", name = "bs", descriptor = "I")
	static final int anInt743 = 34168;

	@OriginalMember(owner = "client!afm", name = "as", descriptor = "I")
	static final int anInt744 = -1;

	@OriginalMember(owner = "client!afm", name = "aw", descriptor = "I")
	static final int anInt745 = -2;

	@OriginalMember(owner = "client!afm", name = "br", descriptor = "I")
	static final int anInt746 = 260;

	@OriginalMember(owner = "client!afm", name = "bn", descriptor = "I")
	static final int anInt747 = 34023;

	@OriginalMember(owner = "client!afm", name = "ba", descriptor = "I")
	static final int anInt748 = 34165;

	@OriginalMember(owner = "client!afm", name = "bt", descriptor = "I")
	static final int anInt749 = 34479;

	@OriginalMember(owner = "client!afm", name = "bl", descriptor = "I")
	static final int anInt750 = 8448;

	@OriginalMember(owner = "client!afm", name = "bj", descriptor = "I")
	static final int anInt751 = 5890;

	@OriginalMember(owner = "client!afm", name = "bk", descriptor = "I")
	static final int anInt752 = 34166;

	@OriginalMember(owner = "client!afm", name = "be", descriptor = "I")
	static final int anInt754 = 768;

	@OriginalMember(owner = "client!afm", name = "bv", descriptor = "I")
	static final int anInt756 = 1;

	@OriginalMember(owner = "client!afm", name = "bp", descriptor = "I")
	static final int anInt757 = 2;

	@OriginalMember(owner = "client!afm", name = "bb", descriptor = "I")
	static final int anInt758 = 0;

	@OriginalMember(owner = "client!afm", name = "bo", descriptor = "I")
	static final int anInt759 = 1;

	@OriginalMember(owner = "client!afm", name = "bc", descriptor = "I")
	static final int anInt760 = 2;

	@OriginalMember(owner = "client!afm", name = "bw", descriptor = "I")
	static final int anInt761 = 1;

	@OriginalMember(owner = "client!afm", name = "bx", descriptor = "I")
	static final int anInt762 = 2;

	@OriginalMember(owner = "client!afm", name = "bi", descriptor = "I")
	static final int anInt763 = 4;

	@OriginalMember(owner = "client!afm", name = "bu", descriptor = "I")
	static final int anInt764 = 8;

	@OriginalMember(owner = "client!afm", name = "ap", descriptor = "I")
	static final int anInt767 = 5126;

	@OriginalMember(owner = "client!afm", name = "bf", descriptor = "I")
	static final int anInt768 = 3;

	@OriginalMember(owner = "client!afm", name = "ab", descriptor = "I")
	static final int anInt776 = 100663296;

	@OriginalMember(owner = "client!afm", name = "bg", descriptor = "I")
	static final int anInt785 = 7681;

	@OriginalMember(owner = "client!afm", name = "az", descriptor = "I")
	static final int anInt792 = 128;

	@OriginalMember(owner = "client!afm", name = "bq", descriptor = "I")
	static final int anInt794 = 55;

	@OriginalMember(owner = "client!afm", name = "bd", descriptor = "I")
	static final int anInt798 = 7;

	@OriginalMember(owner = "client!afm", name = "ig", descriptor = "I")
	static final int anInt799 = 3;

	@OriginalMember(owner = "client!afm", name = "ah", descriptor = "I")
	static final int anInt804 = 0;

	@OriginalMember(owner = "client!afm", name = "bz", descriptor = "I")
	static final int anInt811 = 770;

	@OriginalMember(owner = "client!afm", name = "av", descriptor = "I")
	static final int anInt813 = 32;

	@OriginalMember(owner = "client!afm", name = "bm", descriptor = "I")
	static final int anInt816 = 16;

	@OriginalMember(owner = "client!afm", name = "df", descriptor = "[I")
	static int[] anIntArray65 = new int[1000];

	@OriginalMember(owner = "client!afm", name = "ej", descriptor = "I")
	static int anInt791 = 4;

	@OriginalMember(owner = "client!afm", name = "hz", descriptor = "[F")
	static final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!afm", name = "ia", descriptor = "[F")
	static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!afm", name = "ea", descriptor = "I")
	int anInt730;

	@OriginalMember(owner = "client!afm", name = "fu", descriptor = "F")
	float aFloat56;

	@OriginalMember(owner = "client!afm", name = "dw", descriptor = "I")
	int anInt753;

	@OriginalMember(owner = "client!afm", name = "cf", descriptor = "I")
	int anInt755;

	@OriginalMember(owner = "client!afm", name = "eb", descriptor = "I")
	int anInt765;

	@OriginalMember(owner = "client!afm", name = "ge", descriptor = "Lclient!bw;")
	Interface14 anInterface14_2;

	@OriginalMember(owner = "client!afm", name = "hb", descriptor = "Lclient!bm;")
	Class189 aClass189_5;

	@OriginalMember(owner = "client!afm", name = "fd", descriptor = "I")
	int anInt769;

	@OriginalMember(owner = "client!afm", name = "cr", descriptor = "I")
	int anInt770;

	@OriginalMember(owner = "client!afm", name = "gp", descriptor = "Z")
	boolean aBoolean126;

	@OriginalMember(owner = "client!afm", name = "gk", descriptor = "Lclient!dp;")
	Class229 aClass229_2;

	@OriginalMember(owner = "client!afm", name = "cl", descriptor = "I")
	int anInt774;

	@OriginalMember(owner = "client!afm", name = "cx", descriptor = "I")
	int anInt775;

	@OriginalMember(owner = "client!afm", name = "dx", descriptor = "B")
	byte aByte3;

	@OriginalMember(owner = "client!afm", name = "hv", descriptor = "Z")
	boolean aBoolean127;

	@OriginalMember(owner = "client!afm", name = "dn", descriptor = "J")
	long aLong27;

	@OriginalMember(owner = "client!afm", name = "gd", descriptor = "[Lclient!bz;")
	Class84[] aClass84Array1;

	@OriginalMember(owner = "client!afm", name = "dl", descriptor = "I")
	int anInt777;

	@OriginalMember(owner = "client!afm", name = "db", descriptor = "I")
	int anInt778;

	@OriginalMember(owner = "client!afm", name = "dt", descriptor = "I")
	int anInt779;

	@OriginalMember(owner = "client!afm", name = "du", descriptor = "Z")
	boolean aBoolean128;

	@OriginalMember(owner = "client!afm", name = "gu", descriptor = "Z")
	boolean aBoolean129;

	@OriginalMember(owner = "client!afm", name = "dr", descriptor = "Z")
	boolean aBoolean130;

	@OriginalMember(owner = "client!afm", name = "de", descriptor = "Z")
	boolean aBoolean131;

	@OriginalMember(owner = "client!afm", name = "dv", descriptor = "Z")
	boolean aBoolean132;

	@OriginalMember(owner = "client!afm", name = "fb", descriptor = "I")
	int anInt781;

	@OriginalMember(owner = "client!afm", name = "dk", descriptor = "F")
	float aFloat58;

	@OriginalMember(owner = "client!afm", name = "ec", descriptor = "F")
	float aFloat59;

	@OriginalMember(owner = "client!afm", name = "ev", descriptor = "F")
	float aFloat60;

	@OriginalMember(owner = "client!afm", name = "ex", descriptor = "I")
	int anInt788;

	@OriginalMember(owner = "client!afm", name = "eg", descriptor = "I")
	int anInt789;

	@OriginalMember(owner = "client!afm", name = "ei", descriptor = "I")
	int anInt790;

	@OriginalMember(owner = "client!afm", name = "fe", descriptor = "Z")
	boolean aBoolean133;

	@OriginalMember(owner = "client!afm", name = "go", descriptor = "Ljava/lang/String;")
	String aString25;

	@OriginalMember(owner = "client!afm", name = "fc", descriptor = "Z")
	boolean aBoolean134;

	@OriginalMember(owner = "client!afm", name = "fo", descriptor = "I")
	int anInt796;

	@OriginalMember(owner = "client!afm", name = "fy", descriptor = "I")
	int anInt797;

	@OriginalMember(owner = "client!afm", name = "fs", descriptor = "F")
	float aFloat69;

	@OriginalMember(owner = "client!afm", name = "gl", descriptor = "I")
	int anInt803;

	@OriginalMember(owner = "client!afm", name = "gg", descriptor = "Lclient!ca;")
	Interface15 anInterface15_1;

	@OriginalMember(owner = "client!afm", name = "hc", descriptor = "Z")
	boolean aBoolean137;

	@OriginalMember(owner = "client!afm", name = "fz", descriptor = "F")
	float aFloat72;

	@OriginalMember(owner = "client!afm", name = "gc", descriptor = "Lclient!adm;")
	Class84_Sub1 aClass84_Sub1_2;

	@OriginalMember(owner = "client!afm", name = "gj", descriptor = "Lclient!afh;")
	Class106_Sub1 aClass106_Sub1_1;

	@OriginalMember(owner = "client!afm", name = "ga", descriptor = "I")
	int anInt807;

	@OriginalMember(owner = "client!afm", name = "gb", descriptor = "I")
	int anInt808;

	@OriginalMember(owner = "client!afm", name = "gt", descriptor = "Z")
	boolean aBoolean140;

	@OriginalMember(owner = "client!afm", name = "gy", descriptor = "I")
	int anInt809;

	@OriginalMember(owner = "client!afm", name = "gm", descriptor = "I")
	int anInt810;

	@OriginalMember(owner = "client!afm", name = "gx", descriptor = "Z")
	boolean aBoolean142;

	@OriginalMember(owner = "client!afm", name = "gn", descriptor = "Z")
	boolean aBoolean143;

	@OriginalMember(owner = "client!afm", name = "hn", descriptor = "Z")
	boolean aBoolean148;

	@OriginalMember(owner = "client!afm", name = "hk", descriptor = "Z")
	boolean aBoolean150;

	@OriginalMember(owner = "client!afm", name = "fi", descriptor = "Z")
	boolean aBoolean151;

	@OriginalMember(owner = "client!afm", name = "ed", descriptor = "F")
	float aFloat73;

	@OriginalMember(owner = "client!afm", name = "he", descriptor = "Z")
	boolean aBoolean152;

	@OriginalMember(owner = "client!afm", name = "hx", descriptor = "Z")
	boolean aBoolean153;

	@OriginalMember(owner = "client!afm", name = "ho", descriptor = "Z")
	boolean aBoolean154;

	@OriginalMember(owner = "client!afm", name = "hu", descriptor = "Z")
	boolean aBoolean155;

	@OriginalMember(owner = "client!afm", name = "gf", descriptor = "Ljava/lang/String;")
	String aString26;

	@OriginalMember(owner = "client!afm", name = "hd", descriptor = "Z")
	boolean aBoolean156;

	@OriginalMember(owner = "client!afm", name = "hs", descriptor = "Lclient!bm;")
	Class189 aClass189_6;

	@OriginalMember(owner = "client!afm", name = "hg", descriptor = "Lclient!apt;")
	Class108_Sub1_Sub2 aClass108_Sub1_Sub2_1;

	@OriginalMember(owner = "client!afm", name = "cg", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!afm", name = "hi", descriptor = "Lclient!bw;")
	Interface14 anInterface14_3;

	@OriginalMember(owner = "client!afm", name = "gz", descriptor = "I")
	int anInt814;

	@OriginalMember(owner = "client!afm", name = "ds", descriptor = "Z")
	boolean aBoolean158;

	@OriginalMember(owner = "client!afm", name = "gr", descriptor = "I")
	int anInt815;

	@OriginalMember(owner = "client!afm", name = "eq", descriptor = "Z")
	boolean aBoolean160;

	@OriginalMember(owner = "client!afm", name = "ce", descriptor = "Lclient!cn;")
	Class209 aClass209_1 = new Class209();

	@OriginalMember(owner = "client!afm", name = "cs", descriptor = "Lclient!pm;")
	Class487 aClass487_21 = new Class487();

	@OriginalMember(owner = "client!afm", name = "cj", descriptor = "Lclient!pm;")
	Class487 aClass487_22 = new Class487();

	@OriginalMember(owner = "client!afm", name = "ck", descriptor = "Lclient!ov;")
	Class471 aClass471_9 = new Class471();

	@OriginalMember(owner = "client!afm", name = "ci", descriptor = "I")
	int anInt771 = 8;

	@OriginalMember(owner = "client!afm", name = "cm", descriptor = "I")
	int anInt772 = 3;

	@OriginalMember(owner = "client!afm", name = "cp", descriptor = "Z")
	boolean aBoolean124 = false;

	@OriginalMember(owner = "client!afm", name = "cb", descriptor = "Lclient!aag;")
	Class8 aClass8_9 = new Class8();

	@OriginalMember(owner = "client!afm", name = "cw", descriptor = "Lsun/misc/Unsafe;")
	Unsafe anUnsafe2 = null;

	@OriginalMember(owner = "client!afm", name = "co", descriptor = "Lclient!aag;")
	Class8 aClass8_15 = new Class8();

	@OriginalMember(owner = "client!afm", name = "cz", descriptor = "Lclient!aag;")
	Class8 aClass8_10 = new Class8();

	@OriginalMember(owner = "client!afm", name = "cq", descriptor = "Lclient!aag;")
	Class8 aClass8_11 = new Class8();

	@OriginalMember(owner = "client!afm", name = "dg", descriptor = "Lclient!aag;")
	Class8 aClass8_8 = new Class8();

	@OriginalMember(owner = "client!afm", name = "dh", descriptor = "Lclient!aag;")
	Class8 aClass8_12 = new Class8();

	@OriginalMember(owner = "client!afm", name = "dd", descriptor = "Lclient!aag;")
	Class8 aClass8_14 = new Class8();

	@OriginalMember(owner = "client!afm", name = "dc", descriptor = "Lclient!aag;")
	Class8 aClass8_13 = new Class8();

	@OriginalMember(owner = "client!afm", name = "dm", descriptor = "I")
	int anInt780 = 2;

	@OriginalMember(owner = "client!afm", name = "dq", descriptor = "Lclient!ov;")
	Class471 aClass471_10 = new Class471();

	@OriginalMember(owner = "client!afm", name = "do", descriptor = "Lclient!pm;")
	Class487 aClass487_28 = new Class487();

	@OriginalMember(owner = "client!afm", name = "dp", descriptor = "Lclient!pm;")
	Class487 aClass487_23 = new Class487();

	@OriginalMember(owner = "client!afm", name = "dj", descriptor = "Lclient!pm;")
	Class487 aClass487_24 = new Class487();

	@OriginalMember(owner = "client!afm", name = "di", descriptor = "Lclient!pm;")
	Class487 aClass487_29 = new Class487();

	@OriginalMember(owner = "client!afm", name = "dz", descriptor = "Lclient!pm;")
	Class487 aClass487_25 = new Class487();

	@OriginalMember(owner = "client!afm", name = "dy", descriptor = "[[F")
	float[][] aFloatArrayArray12 = new float[6][4];

	@OriginalMember(owner = "client!afm", name = "da", descriptor = "[F")
	float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!afm", name = "eo", descriptor = "F")
	float aFloat61 = 0.0F;

	@OriginalMember(owner = "client!afm", name = "ep", descriptor = "F")
	float aFloat62 = 1.0F;

	@OriginalMember(owner = "client!afm", name = "ew", descriptor = "F")
	float aFloat63 = 0.0F;

	@OriginalMember(owner = "client!afm", name = "ee", descriptor = "F")
	float aFloat64 = -1.0F;

	@OriginalMember(owner = "client!afm", name = "ef", descriptor = "Lclient!ov;")
	Class471 aClass471_8 = new Class471();

	@OriginalMember(owner = "client!afm", name = "ez", descriptor = "Lclient!pm;")
	Class487 aClass487_26 = new Class487();

	@OriginalMember(owner = "client!afm", name = "ey", descriptor = "Lclient!pm;")
	Class487 aClass487_27 = new Class487();

	@OriginalMember(owner = "client!afm", name = "ek", descriptor = "[F")
	float[] aFloatArray18 = new float[16];

	@OriginalMember(owner = "client!afm", name = "eh", descriptor = "Z")
	boolean aBoolean125 = true;

	@OriginalMember(owner = "client!afm", name = "el", descriptor = "Z")
	boolean aBoolean135 = true;

	@OriginalMember(owner = "client!afm", name = "em", descriptor = "I")
	int anInt782 = 0;

	@OriginalMember(owner = "client!afm", name = "et", descriptor = "I")
	int anInt783 = 0;

	@OriginalMember(owner = "client!afm", name = "eu", descriptor = "I")
	int anInt784 = 0;

	@OriginalMember(owner = "client!afm", name = "es", descriptor = "I")
	int anInt766 = 0;

	@OriginalMember(owner = "client!afm", name = "er", descriptor = "I")
	int anInt786 = 0;

	@OriginalMember(owner = "client!afm", name = "en", descriptor = "I")
	int anInt787 = 0;

	@OriginalMember(owner = "client!afm", name = "fv", descriptor = "[F")
	float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!afm", name = "fm", descriptor = "[F")
	float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!afm", name = "fp", descriptor = "[F")
	float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!afm", name = "fx", descriptor = "[F")
	float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!afm", name = "fj", descriptor = "I")
	int anInt793 = -1;

	@OriginalMember(owner = "client!afm", name = "fq", descriptor = "F")
	float aFloat66 = 1.0F;

	@OriginalMember(owner = "client!afm", name = "fk", descriptor = "F")
	float aFloat74 = 1.0F;

	@OriginalMember(owner = "client!afm", name = "fa", descriptor = "F")
	float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!afm", name = "fn", descriptor = "F")
	float aFloat67 = -1.0F;

	@OriginalMember(owner = "client!afm", name = "fh", descriptor = "F")
	float aFloat68 = -1.0F;

	@OriginalMember(owner = "client!afm", name = "fw", descriptor = "[Lclient!akb;")
	Class80_Sub12[] aClass80_Sub12Array2 = new Class80_Sub12[anInt791];

	@OriginalMember(owner = "client!afm", name = "fl", descriptor = "I")
	int anInt800 = -1;

	@OriginalMember(owner = "client!afm", name = "fg", descriptor = "I")
	int anInt801 = -1;

	@OriginalMember(owner = "client!afm", name = "ft", descriptor = "I")
	int anInt802 = 0;

	@OriginalMember(owner = "client!afm", name = "ff", descriptor = "F")
	float aFloat70 = 1.0F;

	@OriginalMember(owner = "client!afm", name = "fr", descriptor = "F")
	float aFloat71 = 0.0F;

	@OriginalMember(owner = "client!afm", name = "gh", descriptor = "Z")
	boolean aBoolean136 = false;

	@OriginalMember(owner = "client!afm", name = "gw", descriptor = "I")
	int anInt795 = 8448;

	@OriginalMember(owner = "client!afm", name = "gi", descriptor = "I")
	int anInt806 = 8448;

	@OriginalMember(owner = "client!afm", name = "hj", descriptor = "F")
	float aFloat57 = -1.0F;

	@OriginalMember(owner = "client!afm", name = "ht", descriptor = "F")
	float aFloat75 = -1.0F;

	@OriginalMember(owner = "client!afm", name = "hm", descriptor = "[Lclient!afp;")
	Class105_Sub2[] aClass105_Sub2Array1 = new Class105_Sub2[8];

	@OriginalMember(owner = "client!afm", name = "hl", descriptor = "[Lclient!afp;")
	Class105_Sub2[] aClass105_Sub2Array2 = new Class105_Sub2[8];

	@OriginalMember(owner = "client!afm", name = "il", descriptor = "Lclient!asx;")
	PacketGl aPacketGl_1 = new PacketGl(8192);

	@OriginalMember(owner = "client!afm", name = "in", descriptor = "[I")
	int[] anIntArray66 = new int[1];

	@OriginalMember(owner = "client!afm", name = "if", descriptor = "[I")
	int[] anIntArray69 = new int[1];

	@OriginalMember(owner = "client!afm", name = "ih", descriptor = "[I")
	int[] anIntArray67 = new int[1];

	@OriginalMember(owner = "client!afm", name = "io", descriptor = "[B")
	final byte[] aByteArray22 = new byte[16384];

	@OriginalMember(owner = "client!afm", name = "id", descriptor = "Lclient!cm;")
	Class99 aClass99_5 = null;

	@OriginalMember(owner = "client!afm", name = "ix", descriptor = "Lclient!cm;")
	Class99 aClass99_6 = null;

	@OriginalMember(owner = "client!afm", name = "ip", descriptor = "Lclient!afo;")
	Class108_Sub1 aClass108_Sub1_2 = null;

	@OriginalMember(owner = "client!afm", name = "ir", descriptor = "[I")
	int[] anIntArray64 = new int[3];

	@OriginalMember(owner = "client!afm", name = "iu", descriptor = "[J")
	long[] aLongArray7 = new long[3];

	@OriginalMember(owner = "client!afm", name = "iq", descriptor = "[I")
	int[] anIntArray68 = new int[3];

	@OriginalMember(owner = "client!afm", name = "it", descriptor = "I")
	int anInt817 = 0;

	@OriginalMember(owner = "client!afm", name = "ib", descriptor = "I")
	int anInt805 = 0;

	@OriginalMember(owner = "client!afm", name = "cv", descriptor = "I")
	int anInt773;

	@OriginalMember(owner = "client!afm", name = "cd", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL1;

	@OriginalMember(owner = "client!afm", name = "gq", descriptor = "Z")
	boolean aBoolean141;

	@OriginalMember(owner = "client!afm", name = "gs", descriptor = "Z")
	boolean aBoolean144;

	@OriginalMember(owner = "client!afm", name = "hp", descriptor = "Z")
	boolean aBoolean145;

	@OriginalMember(owner = "client!afm", name = "hy", descriptor = "I")
	final int anInt812;

	@OriginalMember(owner = "client!afm", name = "gv", descriptor = "Z")
	boolean aBoolean139;

	@OriginalMember(owner = "client!afm", name = "hf", descriptor = "Z")
	boolean aBoolean146;

	@OriginalMember(owner = "client!afm", name = "hw", descriptor = "Z")
	boolean aBoolean138;

	@OriginalMember(owner = "client!afm", name = "hr", descriptor = "Z")
	boolean aBoolean159;

	@OriginalMember(owner = "client!afm", name = "hq", descriptor = "Z")
	boolean aBoolean149;

	@OriginalMember(owner = "client!afm", name = "ha", descriptor = "Z")
	boolean aBoolean147;

	@OriginalMember(owner = "client!afm", name = "hh", descriptor = "Z")
	boolean aBoolean157;

	@OriginalMember(owner = "client!afm", name = "ct", descriptor = "Lclient!ce;")
	final Class202 aClass202_1;

	@OriginalMember(owner = "client!afm", name = "ca", descriptor = "Lclient!cu;")
	Class215 aClass215_1;

	@OriginalMember(owner = "client!afm", name = "cy", descriptor = "Lclient!cc;")
	Class201 aClass201_1;

	@OriginalMember(owner = "client!afm", name = "ch", descriptor = "Lclient!aqy;")
	Class80_Sub2_Sub3 aClass80_Sub2_Sub3_1;

	@OriginalMember(owner = "client!afm", name = "cc", descriptor = "Lclient!aqp;")
	Class80_Sub2_Sub2 aClass80_Sub2_Sub2_1;

	@OriginalMember(owner = "client!afm", name = "cu", descriptor = "Lclient!aqn;")
	Class80_Sub2_Sub1 aClass80_Sub2_Sub1_1;

	@OriginalMember(owner = "client!afm", name = "cn", descriptor = "Lclient!bo;")
	Class191 aClass191_1;

	@OriginalMember(owner = "client!afm", name = "ue", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method6411(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		if (arg1 == Class236.aClass236_21) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 6406;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 6409;
				case 6:
					return 6410;
				case 7:
					return 6408;
				case 8:
					return 6407;
			}
		} else if (arg1 == Class236.aClass236_19) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 32830;
				case 3:
					return 33189;
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32834;
				case 6:
					return 36219;
				case 7:
					return 32859;
				case 8:
					return 32852;
			}
		} else if (arg1 == Class236.aClass236_22) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_25) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34844;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34846;
				case 6:
					return 34847;
				case 7:
					return 34842;
				case 8:
					return 34843;
			}
		} else if (arg1 == Class236.aClass236_26) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34838;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34840;
				case 6:
					return 34841;
				case 7:
					return 34836;
				case 8:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afm", name = "ui", descriptor = "(Lclient!co;)I")
	static int method6423(@OriginalArg(0) Class210 arg0) {
		switch(arg0.anInt3601 * 1710327153) {
			case 2:
				return 6406;
			case 3:
				return 6402;
			case 4:
			default:
				throw new IllegalStateException();
			case 5:
				return 6409;
			case 6:
				return 6410;
			case 7:
				return 6408;
			case 8:
				return 6407;
		}
	}

	@OriginalMember(owner = "client!afm", name = "aav", descriptor = "(Lclient!co;)I")
	static int method6567(@OriginalArg(0) Class210 arg0) {
		switch(arg0.anInt3601 * 1710327153) {
			case 2:
				return 6406;
			case 3:
				return 6402;
			case 4:
			default:
				throw new IllegalStateException();
			case 5:
				return 6409;
			case 6:
				return 6410;
			case 7:
				return 6408;
			case 8:
				return 6407;
		}
	}

	@OriginalMember(owner = "client!afm", name = "aab", descriptor = "(Lclient!co;)I")
	static int method6568(@OriginalArg(0) Class210 arg0) {
		switch(arg0.anInt3601 * 1710327153) {
			case 2:
				return 6406;
			case 3:
				return 6402;
			case 4:
			default:
				throw new IllegalStateException();
			case 5:
				return 6409;
			case 6:
				return 6410;
			case 7:
				return 6408;
			case 8:
				return 6407;
		}
	}

	@OriginalMember(owner = "client!afm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;I)V")
	Class102_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) int arg6) {
		super(arg1, arg2, arg3, arg4, arg5);
		try {
			try {
				@Pc(304) Field local304 = Unsafe.class.getDeclaredField("theUnsafe");
				local304.setAccessible(true);
				this.anUnsafe2 = (Unsafe) local304.get(null);
			} catch (@Pc(315) Exception local315) {
			}
			this.anInt773 = arg6;
			Class588.method31902(350319923).method31859("jaclib", 1818552238);
			Class588.method31902(350319923).method31859("jaggl", -260989481);
			this.anOpenGL1 = new OpenGL();
			@Pc(345) long local345 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt773);
			if (local345 == 0L) {
				throw new RuntimeException("");
			}
			this.method6325();
			@Pc(359) int local359 = this.method6326();
			if (local359 != 0) {
				throw new RuntimeException("");
			}
			if (this.aBoolean140 && this.aBoolean141) {
				@Pc(375) String local375 = System.getProperty("java.version");
				@Pc(379) int local379 = local375.indexOf(95);
				if (local379 > -1) {
					local375 = local375.substring(0, local379);
				}
				local379 = local375.indexOf(46);
				if (local379 > -1) {
					local379 = local375.indexOf(46, local379 + 1);
					if (local379 > -1) {
						local375 = local375.substring(0, local379);
					}
				}
				try {
					@Pc(415) int local415 = (int) (Float.parseFloat(local375) * 100.0F);
					if (local415 >= 170) {
						this.aBoolean141 = false;
						this.aBoolean144 = false;
						this.aBoolean145 = false;
					}
				} catch (@Pc(429) NumberFormatException local429) {
					this.aBoolean141 = false;
					this.aBoolean144 = false;
					this.aBoolean145 = false;
				}
			}
			this.anInt812 = this.aBoolean129 ? 33639 : 5121;
			this.aBoolean139 = this.aString25.indexOf("radeon") != -1;
			@Pc(467) boolean local467 = this.aString26.indexOf("intel") != -1;
			@Pc(469) boolean local469 = false;
			@Pc(471) boolean local471 = false;
			@Pc(473) int local473 = 0;
			@Pc(489) int local489;
			if (this.aBoolean139 || local467) {
				@Pc(487) String[] local487 = Class313.method27482(this.aString25.replace('/', ' '), ' ', 2036747717);
				for (local489 = 0; local489 < local487.length; local489++) {
					@Pc(497) String local497 = local487[local489];
					try {
						if (local497.length() > 0) {
							if (local497.charAt(0) == 'x' && local497.length() >= 3 && Class698.method37062(local497.substring(1, 3), (short) 1345)) {
								local497 = local497.substring(1);
								local471 = true;
							}
							if (local497.equals("hd")) {
								local469 = true;
							} else {
								if (local497.startsWith("hd")) {
									local497 = local497.substring(2);
									local469 = true;
								}
								if (local497.length() >= 4 && Class698.method37062(local497.substring(0, 4), (short) 3541)) {
									local473 = Class679.method33621(local497.substring(0, 4), -917988179);
									break;
								}
							}
						}
					} catch (@Pc(561) Exception local561) {
					}
				}
			}
			if (this.anInt773 != 0 && local467 && !local469) {
				throw new RuntimeException_Sub3("");
			}
			if (this.aBoolean139 || local467) {
				if (!local467) {
					if (!local471 && !local469) {
						if (local473 >= 7000 && local473 <= 7999) {
							this.aBoolean146 = false;
						}
						if (local473 >= 7000 && local473 <= 9250) {
							this.aBoolean138 = false;
						}
					}
					if (!local469 || local473 < 4000) {
						this.aBoolean159 = false;
					}
					this.aBoolean149 &= this.anOpenGL1.t("GL_ARB_half_float_pixel");
					this.aBoolean147 = this.aBoolean146;
				} else if (!local469) {
					this.aBoolean141 = false;
					this.aBoolean144 = false;
					this.aBoolean145 = false;
				}
			}
			this.aBoolean157 = !this.aString26.equals("s3 graphics");
			if (this.aBoolean146) {
				try {
					@Pc(653) int[] local653 = new int[1];
					OpenGL.glGenBuffersARB(1, local653, 0);
				} catch (@Pc(659) Throwable local659) {
					throw new RuntimeException("");
				}
			}
			Class388.method28633(false, true, -765203912);
			this.aBoolean124 = true;
			this.aClass202_1 = new Class202(this, this.anInterface23_7);
			this.method6327();
			this.aClass215_1 = new Class215(this);
			this.aClass201_1 = new Class201(this);
			if (this.aClass201_1.method24934()) {
				this.aClass80_Sub2_Sub3_1 = new Class80_Sub2_Sub3(this);
				if (!this.aClass80_Sub2_Sub3_1.method21661()) {
					this.aClass80_Sub2_Sub3_1.method21628();
					this.aClass80_Sub2_Sub3_1 = null;
				}
				this.aClass80_Sub2_Sub2_1 = new Class80_Sub2_Sub2(this);
				if (!this.aClass80_Sub2_Sub2_1.method20433()) {
					this.aClass80_Sub2_Sub2_1.method21628();
					this.aClass80_Sub2_Sub2_1 = null;
				}
				this.aClass80_Sub2_Sub1_1 = new Class80_Sub2_Sub1(this);
				if (!this.aClass80_Sub2_Sub1_1.method20374()) {
					this.aClass80_Sub2_Sub1_1.method21628();
					this.aClass80_Sub2_Sub1_1 = null;
				}
			} else {
				this.aClass201_1.method24933();
				this.aClass201_1 = null;
			}
			this.method20680(arg0, new Class108_Sub2_Sub2(this, arg0, local345), -598252561);
			this.method20682(arg0, 714371353);
			if (this.aBoolean140) {
				@Pc(773) int local773 = arg0.getLocation().x;
				local489 = arg0.getLocation().y;
				arg0.setLocation(local773 + 1, local489);
				arg0.setLocation(local773, local489);
			}
			this.aClass191_1 = new Class191(this);
			this.method6328();
			this.method20894();
			if (this.aClass201_1 != null) {
				this.method6371();
				this.method6372();
			}
		} catch (@Pc(808) Throwable local808) {
			local808.printStackTrace();
			this.method20660(-911893167);
			if (local808 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local808;
			} else if (local808 instanceof RuntimeException_Sub3) {
				throw (RuntimeException_Sub3) local808;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "fm", descriptor = "()Z")
	@Override
	public boolean method20997() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "re", descriptor = "()V")
	void method6325() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!afm", name = "rp", descriptor = "()I")
	int method6326() {
		@Pc(1) int local1 = 0;
		this.aString26 = OpenGL.glGetString(7936).toLowerCase();
		this.aString25 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString26.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString26.indexOf("brian paul") != -1 || this.aString26.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class313.method27482(local40.replace('.', ' '), ' ', 2036747717);
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class679.method33621(local48[0], -2092939281);
				@Pc(64) int local64 = Class679.method33621(local48[1], -1996235816);
				this.anInt815 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt815 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.t("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.t("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt809 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt803 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt810 = local111[0];
		if (this.anInt809 < 2 || this.anInt803 < 2 || this.anInt810 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean129 = Stream.m();
		this.aBoolean146 = this.anOpenGL1.t("GL_ARB_vertex_buffer_object");
		this.aBoolean144 = this.anOpenGL1.t("GL_ARB_multisample");
		this.aBoolean153 = this.anOpenGL1.t("GL_ARB_vertex_program");
		this.aBoolean154 = this.anOpenGL1.t("GL_ARB_fragment_program");
		this.aBoolean137 = this.anOpenGL1.t("GL_ARB_vertex_shader");
		this.aBoolean155 = this.anOpenGL1.t("GL_ARB_fragment_shader");
		this.aBoolean138 = this.anOpenGL1.t("GL_EXT_texture3D");
		this.aBoolean149 = this.anOpenGL1.t("GL_ARB_texture_rectangle");
		this.aBoolean150 = this.anOpenGL1.t("GL_ARB_texture_cube_map");
		this.aBoolean127 = this.anOpenGL1.t("GL_ARB_seamless_cube_map");
		this.aBoolean159 = this.anOpenGL1.t("GL_ARB_texture_float");
		this.aBoolean152 = this.anOpenGL1.t("GL_ARB_texture_non_power_of_two");
		this.aBoolean141 = this.anOpenGL1.t("GL_EXT_framebuffer_object");
		this.aBoolean142 = this.anOpenGL1.t("GL_EXT_framebuffer_blit");
		this.aBoolean143 = this.anOpenGL1.t("GL_EXT_framebuffer_multisample");
		this.aBoolean145 = this.aBoolean142 & this.aBoolean143;
		this.aBoolean156 = this.anOpenGL1.t("GL_EXT_blend_func_separate");
		this.aBoolean148 = this.anUnsafe2 != null && (this.anInt815 >= 32 || this.anOpenGL1.t("GL_ARB_sync"));
		this.aBoolean140 = Class531.aString220.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray24, 0);
		this.aFloat75 = aFloatArray24[0];
		this.aFloat57 = aFloatArray24[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!afm", name = "rz", descriptor = "()V")
	void method6327() {
		this.aClass84Array1 = new Class84[this.anInt809];
		this.aClass84_Sub1_2 = new Class84_Sub1(this, 3553, Class210.aClass210_24, Class236.aClass236_21, 1, 1);
		new Class84_Sub1(this, 3553, Class210.aClass210_24, Class236.aClass236_21, 1, 1);
		new Class84_Sub1(this, 3553, Class210.aClass210_24, Class236.aClass236_21, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass105_Sub2Array1[local37] = new Class105_Sub2(this);
			this.aClass105_Sub2Array2[local37] = new Class105_Sub2(this);
		}
		if (this.aBoolean141) {
			this.aClass108_Sub1_Sub2_1 = new Class108_Sub1_Sub2(this);
			new Class108_Sub1_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!afm", name = "rw", descriptor = "()V")
	void method6328() {
		this.method6384(-2);
		for (@Pc(7) int local7 = this.anInt809 - 1; local7 >= 0; local7--) {
			this.method6386(local7);
			this.method6339(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6389(8448, 8448);
		this.method6390(2, 34168, 770);
		this.method6364();
		this.anInt778 = 1;
		this.anInt753 = 0;
		this.aBoolean158 = true;
		if (this.aBoolean156) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt779 = 1;
		this.aByte3 = -1;
		this.method6388((byte) 0);
		this.aBoolean130 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte3);
		if (this.aBoolean144) {
			if (this.anInt773 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean128 = true;
		this.method6424(true);
		this.method6429(true);
		this.method6399(true);
		this.method6545(true);
		this.method20708(0.0F, 1.0F);
		this.method6356();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6410(this.anInt780);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(155) float[] local155 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(157) int local157 = 0; local157 < 8; local157++) {
			@Pc(164) int local164 = local157 + 16384;
			OpenGL.glLightfv(local164, 4608, local155, 0);
			OpenGL.glLightf(local164, 4615, 0.0F);
			OpenGL.glLightf(local164, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean127) {
			OpenGL.glEnable(34895);
		}
		this.anInt800 = -1;
		this.anInt793 = -1;
		this.method20705();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "l", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20656() {
		@Pc(1) int local1 = -1;
		if (this.aString26.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString26.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString26.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, "OpenGL", this.anInt815, this.aString25, 0L, false);
	}

	@OriginalMember(owner = "client!afm", name = "i", descriptor = "(II)V")
	@Override
	void method20947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		try {
			this.aClass108_Sub2_6.method24053();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(1138340040);
		}
	}

	@OriginalMember(owner = "client!afm", name = "m", descriptor = "()V")
	@Override
	public void method20659() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afm", name = "j", descriptor = "()V")
	@Override
	void method20661() {
		for (@Pc(4) Class80 local4 = this.aClass8_9.method247(129206984); local4 != null; local4 = this.aClass8_9.method237(-531932034)) {
			((Class80_Sub22_Sub2) local4).method21677();
		}
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24933();
		}
		if (this.aBoolean124) {
			Class210.method25804(false, true, -1331760319);
			this.aBoolean124 = false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "k", descriptor = "()Z")
	@Override
	public boolean method20664() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "tn", descriptor = "(III)V")
	void method6329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "w", descriptor = "()Z")
	@Override
	public boolean method20666() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "aag", descriptor = "(B)V")
	void method6330(@OriginalArg(0) byte arg0) {
		if (this.aByte3 == arg0) {
			return;
		}
		this.aByte3 = arg0;
		if (arg0 == 0) {
			this.method6404(2);
			this.method6370(1);
		} else {
			this.method6404(3);
			this.method6370(3);
		}
		this.method6405();
	}

	@OriginalMember(owner = "client!afm", name = "h", descriptor = "()Z")
	@Override
	public boolean method20669() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "yg", descriptor = "(I)V")
	void method6331(@OriginalArg(0) int arg0) {
		if (this.anInt807 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt807 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "d", descriptor = "()Z")
	@Override
	public boolean method21081() {
		return this.aBoolean144 && (!this.method20784() || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "z", descriptor = "()Z")
	@Override
	public boolean method20671() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "rr", descriptor = "()Z")
	boolean method6332() {
		return this.aClass191_1.method24833(3);
	}

	@OriginalMember(owner = "client!afm", name = "gv", descriptor = "()Z")
	@Override
	public boolean method20849() {
		return !this.aBoolean148 || this.aLongArray7[this.anInt805] == 0L;
	}

	@OriginalMember(owner = "client!afm", name = "v", descriptor = "()Z")
	@Override
	public boolean method20858() {
		return false;
	}

	@OriginalMember(owner = "client!afm", name = "di", descriptor = "()Z")
	@Override
	public boolean method20776() {
		return this.aClass201_1 == null ? false : this.aClass201_1.method24935();
	}

	@OriginalMember(owner = "client!afm", name = "n", descriptor = "()[I")
	@Override
	public int[] method20675() {
		@Pc(2) int[] local2 = new int[1];
		OpenGL.glGetIntegerv(34466, local2, 0);
		@Pc(10) int local10 = local2[0];
		if (local10 == 0) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[local10];
			OpenGL.glGetIntegerv(34467, local17, 0);
			return local17;
		}
	}

	@OriginalMember(owner = "client!afm", name = "al", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	@Override
	Class108_Sub2 method20686(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class108_Sub2_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "rv", descriptor = "()V")
	void method6333() {
		this.method6334();
	}

	@OriginalMember(owner = "client!afm", name = "rj", descriptor = "()V")
	void method6334() {
		@Pc(3) int local3 = this.aClass108_6.method24036();
		@Pc(7) int local7 = this.aClass108_6.method24037();
		this.aClass487_29.method30087(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20705();
		this.method6356();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "sa", descriptor = "(Lclient!pm;)V")
	void method6335(@OriginalArg(0) Class487 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!afm", name = "vh", descriptor = "()V")
	void method6336() {
		this.method6334();
	}

	@OriginalMember(owner = "client!afm", name = "ke", descriptor = "(II)I")
	@Override
	public int method20939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afm", name = "fl", descriptor = "()Z")
	@Override
	public boolean method20826() {
		return false;
	}

	@OriginalMember(owner = "client!afm", name = "ar", descriptor = "()V")
	@Override
	public void method20698() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray7[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local1]);
				this.aLongArray7[local1] = 0L;
			}
		}
		this.anInt805 = 0;
		this.anInt817 = 0;
	}

	@OriginalMember(owner = "client!afm", name = "ae", descriptor = "()Z")
	@Override
	public boolean method20696() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ap", descriptor = "()I")
	@Override
	public int method20697() {
		if (!this.aBoolean148) {
			return -1;
		} else if (this.aLongArray7[this.anInt817] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt817], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray68[this.anInt817];
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "au", descriptor = "(III)V")
	@Override
	public void method20867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20782();
		if (this.aClass108_Sub1_2 == null) {
			this.method6338(arg1, arg2);
		}
		if (this.aClass99_5 == null) {
			this.aClass99_5 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), true);
		} else {
			((Class99_Sub2) this.aClass99_5).method2612(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0, true);
		}
		this.method20684(this.aClass108_Sub1_2, -358355902);
		this.method20714(1, -16777216);
		this.aClass99_5.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
		OpenGL.glBindBufferARB(35051, this.anIntArray64[this.anInt805]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2945 * -971613875, this.anInt2935 * 143307461, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20887(this.aClass108_Sub1_2, (byte) 1);
		this.aLongArray7[this.anInt805] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray68[this.anInt805] = arg0;
		if (++this.anInt805 >= 3) {
			this.anInt805 = 0;
		}
		this.method20746();
	}

	@OriginalMember(owner = "client!afm", name = "yc", descriptor = "()V")
	void method6337() {
		if (this.anInt777 == 4) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6370(1);
		this.method6388((byte) 0);
		this.anInt777 = 4;
	}

	@OriginalMember(owner = "client!afm", name = "az", descriptor = "(II)J")
	@Override
	public long method20700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6378(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afm", name = "gf", descriptor = "()Z")
	@Override
	public boolean method20847() {
		return this.aBoolean148;
	}

	@OriginalMember(owner = "client!afm", name = "eq", descriptor = "()V")
	@Override
	void method20807() {
		for (@Pc(4) Class80 local4 = this.aClass8_9.method247(129206984); local4 != null; local4 = this.aClass8_9.method237(-1412539909)) {
			((Class80_Sub22_Sub2) local4).method21677();
		}
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24933();
		}
		if (this.aBoolean124) {
			Class210.method25804(false, true, -1331760319);
			this.aBoolean124 = false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "as", descriptor = "(J)V")
	@Override
	public void method20701(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!afm", name = "bl", descriptor = "()V")
	@Override
	public void method20683() {
		if (!this.aBoolean148) {
			this.aClass108_Sub1_2 = null;
			this.aClass99_6 = null;
			this.aClass99_5 = null;
			return;
		}
		this.aClass99_5 = null;
		if (this.aClass108_Sub1_2 != null) {
			this.aClass108_Sub1_2.method24046();
			this.aClass108_Sub1_2 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray64, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray64[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "rc", descriptor = "(II)V")
	void method6338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20683();
		this.method20703(arg0, arg1, (byte) 15);
		if (!this.aBoolean148) {
			this.aClass99_6 = this.method20739(arg0, arg1, true, true);
			this.aClass108_Sub1_2 = this.method20687();
			this.aClass108_Sub1_2.method23903(0, this.aClass99_6.method18231());
			return;
		}
		this.aClass99_6 = this.method20739(arg0, arg1, true, true);
		this.aClass108_Sub1_2 = this.method20687();
		this.aClass108_Sub1_2.method23903(0, this.aClass99_6.method18231());
		OpenGL.glGenBuffersARB(3, this.anIntArray64, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray64[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!afm", name = "tf", descriptor = "(Lclient!bz;)V")
	void method6339(@OriginalArg(0) Class84 arg0) {
		@Pc(5) Class84 local5 = this.aClass84Array1[this.anInt807];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt2587);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt2587);
				} else if (arg0.anInt2587 != local5.anInt2587) {
					OpenGL.glDisable(local5.anInt2587);
					OpenGL.glEnable(arg0.anInt2587);
				}
				OpenGL.glBindTexture(arg0.anInt2587, arg0.anInt2592);
			}
			this.aClass84Array1[this.anInt807] = arg0;
		}
		this.anInt777 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afm", name = "uk", descriptor = "(Z)V")
	void method6340(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean133) {
			this.aBoolean133 = arg0;
			this.method6398();
		}
	}

	@OriginalMember(owner = "client!afm", name = "bw", descriptor = "(IIIIII)V")
	@Override
	public void method20722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method6380();
		this.method6370(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean144) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean144) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afm", name = "bx", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public void method20724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method6380();
		this.method6370(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "bi", descriptor = "(IIIII)V")
	@Override
	void method20711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt784 || arg0 - arg2 > this.anInt766 || arg1 + arg2 < this.anInt782 || arg1 - arg2 > this.anInt783) {
			return;
		}
		this.method6380();
		this.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat75) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat57) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class548.method31273(local132, -1212426705);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class204.aFloatArray94[local157] * (float) arg2, local59 + Class204.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afm", name = "dw", descriptor = "(I)V")
	@Override
	public void method20704(@OriginalArg(0) int arg0) {
		this.anInt772 = 0;
		while (arg0 > 1) {
			this.anInt772++;
			arg0 >>= 0x1;
		}
		this.anInt771 = 0x1 << this.anInt772;
	}

	@OriginalMember(owner = "client!afm", name = "mq", descriptor = "(FFFFF)V")
	@Override
	public void method20892(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class80_Sub2_Sub2.aFloat193 = arg0;
		Class80_Sub2_Sub2.aFloat192 = arg1;
		Class80_Sub2_Sub2.aFloat196 = arg2;
		Class80_Sub2_Sub2.aFloat194 = arg3;
		Class80_Sub2_Sub2.aFloat195 = arg4;
	}

	@OriginalMember(owner = "client!afm", name = "iz", descriptor = "(IIIIII)I")
	@Override
	public int method20908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg0 + this.aClass487_25.aFloatArray114[6] * (float) arg1 + this.aClass487_25.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg3 + this.aClass487_25.aFloatArray114[6] * (float) arg4 + this.aClass487_25.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg0 + this.aClass487_25.aFloatArray114[7] * (float) arg1 + this.aClass487_25.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg3 + this.aClass487_25.aFloatArray114[7] * (float) arg4 + this.aClass487_25.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg0 + this.aClass487_25.aFloatArray114[4] * (float) arg1 + this.aClass487_25.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg3 + this.aClass487_25.aFloatArray114[4] * (float) arg4 + this.aClass487_25.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg0 + this.aClass487_25.aFloatArray114[5] * (float) arg1 + this.aClass487_25.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg3 + this.aClass487_25.aFloatArray114[5] * (float) arg4 + this.aClass487_25.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afm", name = "yz", descriptor = "(I)I")
	int method6341(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afm", name = "bd", descriptor = "(IIIIIILclient!cg;II)V")
	@Override
	public void method20728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg6;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local2.aClass84_Sub1_Sub1_1);
		this.method6370(arg5);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2598;
		@Pc(43) float local43 = (float) arg2 - (float) arg0;
		@Pc(49) float local49 = (float) arg3 - (float) arg1;
		@Pc(62) float local62 = (float) (1.0D / Math.sqrt((double) (local43 * local43 + local49 * local49)));
		@Pc(66) float local66 = local43 * local62;
		@Pc(70) float local70 = local49 * local62;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local30 * (float) (arg0 - arg7), local37 * (float) (arg1 - arg8));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local30 * (float) (arg2 - arg7), local37 * (float) (arg3 - arg8));
		OpenGL.glVertex2f((float) arg2 + local66 + 0.35F, (float) arg3 + local70 + 0.35F);
		OpenGL.glEnd();
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "cv", descriptor = "(IIIIIILclient!cg;IIIII)V")
	@Override
	public void method20979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class98_Sub1 local9 = (Class98_Sub1) arg6;
		@Pc(12) Class84_Sub1_Sub1 local12 = local9.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local9.aClass84_Sub1_Sub1_1);
		this.method6370(arg5);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat164 / (float) local12.anInt2599;
		@Pc(44) float local44 = local12.aFloat163 / (float) local12.anInt2598;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "ct", descriptor = "(IIIIIII)V")
	@Override
	public void method20731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20727(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!afm", name = "ek", descriptor = "(FFF[F)V")
	@Override
	public void method21114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat59 * local59 / local29;
		arg3[1] = this.aFloat60 + this.aFloat73 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afm", name = "ey", descriptor = "(FFF[F)V")
	@Override
	public void method20790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * arg0 + this.aClass487_25.aFloatArray114[6] * arg1 + this.aClass487_25.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat59 * local115 / local59;
			arg3[1] = this.aFloat60 + this.aFloat73 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afm", name = "cn", descriptor = "(IIIIII)I")
	@Override
	public int method20872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg0 + this.aClass487_25.aFloatArray114[6] * (float) arg1 + this.aClass487_25.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg3 + this.aClass487_25.aFloatArray114[6] * (float) arg4 + this.aClass487_25.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg0 + this.aClass487_25.aFloatArray114[7] * (float) arg1 + this.aClass487_25.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg3 + this.aClass487_25.aFloatArray114[7] * (float) arg4 + this.aClass487_25.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg0 + this.aClass487_25.aFloatArray114[4] * (float) arg1 + this.aClass487_25.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg3 + this.aClass487_25.aFloatArray114[4] * (float) arg4 + this.aClass487_25.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg0 + this.aClass487_25.aFloatArray114[5] * (float) arg1 + this.aClass487_25.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg3 + this.aClass487_25.aFloatArray114[5] * (float) arg4 + this.aClass487_25.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afm", name = "wm", descriptor = "()V")
	void method6342() {
		this.aClass487_25.method30075(this.aClass487_28);
		this.aClass487_25.method30078(this.aClass487_24);
		this.aClass487_25.method30099(this.aFloatArrayArray12[0]);
		this.aClass487_25.method30100(this.aFloatArrayArray12[1]);
		this.aClass487_25.method30095(this.aFloatArrayArray12[2]);
		this.aClass487_25.method30096(this.aFloatArrayArray12[3]);
		this.aClass487_25.method30097(this.aFloatArrayArray12[4]);
		this.aClass487_25.method30098(this.aFloatArrayArray12[5]);
	}

	@OriginalMember(owner = "client!afm", name = "cc", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	@Override
	public void method20735(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2) {
		@Pc(2) Class487 local2 = this.aClass487_26;
		local2.method30080(arg0);
		local2.method30078(this.aClass487_25);
		arg1.method26329(arg2, this.aClass487_24, local2, this.aFloat58, this.aFloat60, this.aFloat59, this.aFloat73);
	}

	@OriginalMember(owner = "client!afm", name = "cu", descriptor = "(I)Lclient!akl;")
	@Override
	public Class80_Sub22 method21093(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub2 local4 = new Class80_Sub22_Sub2(arg0);
		this.aClass8_9.method232(local4, 739966747);
		return local4;
	}

	@OriginalMember(owner = "client!afm", name = "lj", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method21088() {
		return new Class471(this.aClass471_10);
	}

	@OriginalMember(owner = "client!afm", name = "cj", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public Class99 method20739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "cr", descriptor = "(Lclient!da;Z)Lclient!cm;")
	@Override
	public Class99 method20906(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method7117(false);
		@Pc(15) Class99 local15 = this.method20741(local3, 0, arg0.method7119(), arg0.method7119(), arg0.method7127(), -1657536790);
		local15.method18216(arg0.method7121(), arg0.method7123(), arg0.method7122(), arg0.method7148());
		return local15;
	}

	@OriginalMember(owner = "client!afm", name = "ck", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public Class99 method20740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class99_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "at", descriptor = "(IIII)[I")
	@Override
	public int[] method20691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass108_6.method24037();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt812, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afm", name = "mo", descriptor = "()Z")
	@Override
	public boolean method20993() {
		return this.aClass80_Sub2_Sub2_1 != null && this.aClass80_Sub2_Sub2_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "xg", descriptor = "()V")
	void method6343() {
		if (this.anInt777 == 1) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6339(null);
		this.method6384(-2);
		this.method6543(1);
		this.method6388((byte) 0);
		this.anInt777 = 1;
	}

	@OriginalMember(owner = "client!afm", name = "cl", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	@Override
	public Class104 method20749(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2) {
		return new Class104_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "co", descriptor = "(I)V")
	@Override
	public void method20752(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "aa", descriptor = "()Z")
	@Override
	public boolean method20695() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "dg", descriptor = "(II)I")
	@Override
	public int method20755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afm", name = "dh", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public Class100 method20756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class100_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afm", name = "vf", descriptor = "()V")
	void method6344() {
		this.method6384(-2);
		for (@Pc(7) int local7 = this.anInt809 - 1; local7 >= 0; local7--) {
			this.method6386(local7);
			this.method6339(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6389(8448, 8448);
		this.method6390(2, 34168, 770);
		this.method6364();
		this.anInt778 = 1;
		this.anInt753 = 0;
		this.aBoolean158 = true;
		if (this.aBoolean156) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt779 = 1;
		this.aByte3 = -1;
		this.method6388((byte) 0);
		this.aBoolean130 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte3);
		if (this.aBoolean144) {
			if (this.anInt773 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean128 = true;
		this.method6424(true);
		this.method6429(true);
		this.method6399(true);
		this.method6545(true);
		this.method20708(0.0F, 1.0F);
		this.method6356();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6410(this.anInt780);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(155) float[] local155 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(157) int local157 = 0; local157 < 8; local157++) {
			@Pc(164) int local164 = local157 + 16384;
			OpenGL.glLightfv(local164, 4608, local155, 0);
			OpenGL.glLightf(local164, 4615, 0.0F);
			OpenGL.glLightf(local164, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean127) {
			OpenGL.glEnable(34895);
		}
		this.anInt800 = -1;
		this.anInt793 = -1;
		this.method20705();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "io", descriptor = "(IIIIII)V")
	@Override
	public void method20888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method6380();
		this.method6370(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean144) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean144) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afm", name = "dc", descriptor = "(Lclient!db;)V")
	@Override
	public void method20964(@OriginalArg(0) Class221 arg0) {
		this.aClass209_1.method25790(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "ee", descriptor = "(ILclient!dp;)V")
	@Override
	public void method20787(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		this.anInt814 = arg0;
		this.aClass229_2 = arg1;
		this.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!afm", name = "aao", descriptor = "(I)V")
	void method6345(@OriginalArg(0) int arg0) {
		if (this.anInt753 != arg0) {
			this.anInt753 = arg0;
			this.method6403();
		}
	}

	@OriginalMember(owner = "client!afm", name = "ez", descriptor = "()V")
	@Override
	public void method20699() {
		this.aBoolean151 = false;
	}

	@OriginalMember(owner = "client!afm", name = "sy", descriptor = "()V")
	void method6346() {
		this.aFloat56 = this.aFloat64 - (float) this.anInt802 - this.aFloat71;
		this.aFloat69 = this.aFloat56 - (float) this.anInt801 * this.aFloat70;
		if (this.aFloat69 < this.aFloat63) {
			this.aFloat69 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat69);
		OpenGL.glFogf(2916, this.aFloat56);
		aFloatArray24[0] = (float) (this.anInt800 & 0xFF0000) / 1.671168E7F;
		aFloatArray24[1] = (float) (this.anInt800 & 0xFF00) / 65280.0F;
		aFloatArray24[2] = (float) (this.anInt800 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "bn", descriptor = "(IIII)V")
	@Override
	public void method20706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt788 = arg0;
		this.anInt789 = arg1;
		this.anInt765 = arg2;
		this.anInt790 = arg3;
		this.method6495();
	}

	@OriginalMember(owner = "client!afm", name = "ba", descriptor = "([I)V")
	@Override
	public void method20707(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt788;
		arg0[1] = this.anInt789;
		arg0[2] = this.anInt765;
		arg0[3] = this.anInt790;
	}

	@OriginalMember(owner = "client!afm", name = "bt", descriptor = "(FF)V")
	@Override
	public void method20708(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat61 = arg0;
		this.aFloat62 = arg1;
		this.method6363();
	}

	@OriginalMember(owner = "client!afm", name = "mn", descriptor = "(FFFFF)V")
	@Override
	public void method20988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class80_Sub2_Sub2.aFloat193 = arg0;
		Class80_Sub2_Sub2.aFloat192 = arg1;
		Class80_Sub2_Sub2.aFloat196 = arg2;
		Class80_Sub2_Sub2.aFloat194 = arg3;
		Class80_Sub2_Sub2.aFloat195 = arg4;
	}

	@OriginalMember(owner = "client!afm", name = "bs", descriptor = "()V")
	@Override
	public void method20877() {
		if (this.aClass108_6 == null) {
			return;
		}
		this.anInt784 = 0;
		this.anInt782 = 0;
		this.anInt766 = this.aClass108_6.method24036();
		this.anInt783 = this.aClass108_6.method24037();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afm", name = "up", descriptor = "()V")
	void method6347() {
		if (this.aBoolean131 && this.aBoolean135) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!afm", name = "by", descriptor = "(IIII)V")
	@Override
	public void method20972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt784 < arg0) {
			this.anInt784 = arg0;
		}
		if (this.anInt766 > arg2) {
			this.anInt766 = arg2;
		}
		if (this.anInt782 < arg1) {
			this.anInt782 = arg1;
		}
		if (this.anInt783 > arg3) {
			this.anInt783 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "rd", descriptor = "(II)V")
	void method6348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt786 = arg0;
		this.anInt787 = arg1;
		this.method6495();
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "mr", descriptor = "()Z")
	@Override
	public boolean method21007() {
		return this.aClass80_Sub2_Sub3_1 != null && this.aClass80_Sub2_Sub3_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "bj", descriptor = "(IIII)V")
	@Override
	public void method20986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass108_6.method24036()) {
			arg2 = this.aClass108_6.method24036();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass108_6.method24037()) {
			arg3 = this.aClass108_6.method24037();
		}
		this.anInt784 = arg0;
		this.anInt782 = arg1;
		this.anInt766 = arg2;
		this.anInt783 = arg3;
		OpenGL.glEnable(3089);
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "sp", descriptor = "()V")
	void method6349() {
		if (this.aClass108_6 == null || this.anInt784 >= this.anInt766 || this.anInt782 >= this.anInt783) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt786 + this.anInt784, this.anInt787 + this.aClass108_6.method24037() - this.anInt783, this.anInt766 - this.anInt784, this.anInt783 - this.anInt782);
		}
	}

	@OriginalMember(owner = "client!afm", name = "vb", descriptor = "()V")
	void method6350() {
		if (this.anInt730 == 2) {
			OpenGL.glDepthRange(this.aFloat61, this.aFloat62);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afm", name = "tp", descriptor = "(IZZ)V")
	void method6351(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt808 || this.aBoolean136 != this.aBoolean151) {
			@Pc(10) Class84_Sub1 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean151 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method6364();
			} else {
				@Pc(33) Class227 local33 = this.aClass235_6.method26120(arg0, 73831368);
				if (local33.aBoolean753) {
					local10 = this.aClass202_1.method24960(local33);
					if (local33.aFloat263 == 0.0F && local33.aFloat264 == 0.0F) {
						this.method6364();
					} else {
						this.method6394((float) (this.anInt770 % 128000) / 1000.0F * local33.aFloat263 % 1.0F, (float) (this.anInt770 % 128000) / 1000.0F * local33.aFloat264 % 1.0F, 0.0F);
					}
					if (!this.aBoolean151) {
						local14 = local33.aByte116;
						local16 = local33.anInt3660 * 260749353;
						local23 = local33.aByte110;
					}
					local12 = local33.aByte121;
				} else {
					this.method6364();
				}
				if (local33.aClass608_2 == Class608.aClass608_3) {
					local25 = local33.aByte113;
				}
			}
			this.method6388(local25);
			this.aClass191_1.method24832(local23, local14, local16, arg1, arg2);
			if (!this.aClass191_1.method24839(local10, local12)) {
				this.method6339(local10);
				this.method6543(local12);
			}
			this.aBoolean136 = this.aBoolean151;
			this.anInt808 = arg0;
		}
		this.anInt777 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afm", name = "sm", descriptor = "(Lclient!pm;)V")
	void method6352(@OriginalArg(0) Class487 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!afm", name = "sn", descriptor = "()V")
	void method6353() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!afm", name = "dn", descriptor = "(Lclient!ov;)V")
	@Override
	public void method20759(@OriginalArg(0) Class471 arg0) {
		this.aClass471_10.method29760(arg0);
		this.aClass487_28.method30080(this.aClass471_10);
		this.aClass471_8.method29760(arg0);
		this.aClass471_8.method29768();
		this.aClass487_23.method30080(this.aClass471_8);
		this.method6360();
		if (this.anInt730 != 1) {
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!afm", name = "hr", descriptor = "(Z)V")
	@Override
	public void method20838(@OriginalArg(0) boolean arg0) {
		this.aBoolean125 = arg0;
		this.method6400();
	}

	@OriginalMember(owner = "client!afm", name = "sh", descriptor = "()V")
	void method6354() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass487_28.aFloatArray114, 0);
		if (this.aBoolean136) {
			this.aClass191_1.aClass96_Sub7_1.method2734();
		}
		this.method6367();
		this.method6362();
	}

	@OriginalMember(owner = "client!afm", name = "db", descriptor = "(Lclient!pm;)V")
	@Override
	public void method20933(@OriginalArg(0) Class487 arg0) {
		this.aClass487_24.method30075(arg0);
		this.method6360();
		this.method6359();
	}

	@OriginalMember(owner = "client!afm", name = "vs", descriptor = "()Z")
	boolean method6355() {
		return this.aClass191_1.method24833(3);
	}

	@OriginalMember(owner = "client!afm", name = "sl", descriptor = "()V")
	void method6356() {
		if (this.anInt730 != 0) {
			this.anInt730 = 0;
			this.method6495();
			this.method6363();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "vz", descriptor = "()Z")
	boolean method6357() {
		return this.aClass191_1.method24833(3);
	}

	@OriginalMember(owner = "client!afm", name = "sb", descriptor = "()V")
	void method6358() {
		if (this.anInt730 == 2) {
			return;
		}
		this.anInt730 = 2;
		this.method6361(this.aClass487_24.aFloatArray114);
		this.method6354();
		this.method6495();
		this.method6363();
		this.anInt777 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afm", name = "sz", descriptor = "()V")
	void method6359() {
		this.aFloat64 = this.aClass487_24.method30143();
		this.aFloat63 = this.aClass487_24.method30093();
		this.method6346();
		if (this.anInt730 == 2) {
			this.method6361(this.aClass487_24.aFloatArray114);
		} else if (this.anInt730 == 1) {
			this.method6361(this.aClass487_29.aFloatArray114);
		}
	}

	@OriginalMember(owner = "client!afm", name = "sc", descriptor = "()V")
	void method6360() {
		this.aClass487_25.method30075(this.aClass487_28);
		this.aClass487_25.method30078(this.aClass487_24);
		this.aClass487_25.method30099(this.aFloatArrayArray12[0]);
		this.aClass487_25.method30100(this.aFloatArrayArray12[1]);
		this.aClass487_25.method30095(this.aFloatArrayArray12[2]);
		this.aClass487_25.method30096(this.aFloatArrayArray12[3]);
		this.aClass487_25.method30097(this.aFloatArrayArray12[4]);
		this.aClass487_25.method30098(this.aFloatArrayArray12[5]);
	}

	@OriginalMember(owner = "client!afm", name = "sv", descriptor = "([F)V")
	void method6361(@OriginalArg(0) float[] arg0) {
		@Pc(2) float[] local2 = new float[16];
		System.arraycopy(arg0, 0, local2, 0, 16);
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(local2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afm", name = "dl", descriptor = "(Z)V")
	@Override
	public void method20762(@OriginalArg(0) boolean arg0) {
		this.aBoolean125 = arg0;
		this.method6400();
	}

	@OriginalMember(owner = "client!afm", name = "dx", descriptor = "()I")
	@Override
	public int method20768() {
		return 4;
	}

	@OriginalMember(owner = "client!afm", name = "dv", descriptor = "(I[Lclient!akb;)V")
	@Override
	public void method20770(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass80_Sub12Array2[local1] = arg1[local1];
		}
		this.anInt797 = arg0;
		if (this.anInt730 != 1) {
			this.method6362();
		}
	}

	@OriginalMember(owner = "client!afm", name = "sf", descriptor = "()V")
	void method6362() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt797; local1++) {
			@Pc(10) Class80_Sub12 local10 = this.aClass80_Sub12Array2[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method13949((byte) 0);
			aFloatArray23[1] = local10.method13950(-1720421928);
			aFloatArray23[2] = local10.method13970(-1885835398);
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method13953((byte) 20);
			@Pc(54) float local54 = local10.method13954(1408315969) / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13952(-432544427) * local10.method13952(-432544427)));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt796) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt796 = this.anInt797;
	}

	@OriginalMember(owner = "client!afm", name = "du", descriptor = "(F)V")
	@Override
	public void method20801(@OriginalArg(0) float arg0) {
		if (this.aFloat72 != arg0) {
			this.aFloat72 = arg0;
			this.method6512();
		}
	}

	@OriginalMember(owner = "client!afm", name = "sj", descriptor = "()V")
	void method6363() {
		if (this.anInt730 == 2) {
			OpenGL.glDepthRange(this.aFloat61, this.aFloat62);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afm", name = "tb", descriptor = "()V")
	void method6364() {
		if (this.aBoolean126) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean126 = false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "dr", descriptor = "(III)V")
	@Override
	public void method20767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt800 == arg0 && this.anInt801 == arg1 && this.anInt802 == arg2) {
			return;
		}
		this.anInt800 = arg0;
		this.anInt801 = arg1;
		this.anInt802 = arg2;
		this.method6346();
		this.method6509();
	}

	@OriginalMember(owner = "client!afm", name = "sq", descriptor = "(FF)V")
	void method6365(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat70 = arg0;
		this.aFloat71 = arg1;
		this.method6346();
	}

	@OriginalMember(owner = "client!afm", name = "fd", descriptor = "()Z")
	@Override
	public boolean method20824() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "st", descriptor = "()V")
	void method6366() {
		aFloatArray24[0] = this.aFloat67 * this.aFloat66;
		aFloatArray24[1] = this.aFloat67 * this.aFloat74;
		aFloatArray24[2] = this.aFloat67 * this.aFloat65;
		aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray24, 0);
		aFloatArray24[0] = -this.aFloat68 * this.aFloat66;
		aFloatArray24[1] = -this.aFloat68 * this.aFloat74;
		aFloatArray24[2] = -this.aFloat68 * this.aFloat65;
		aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "si", descriptor = "()V")
	void method6367() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray21, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!afm", name = "wf", descriptor = "()V")
	void method6368() {
		this.aFloat64 = this.aClass487_24.method30143();
		this.aFloat63 = this.aClass487_24.method30093();
		this.method6346();
		if (this.anInt730 == 2) {
			this.method6361(this.aClass487_24.aFloatArray114);
		} else if (this.anInt730 == 1) {
			this.method6361(this.aClass487_29.aFloatArray114);
		}
	}

	@OriginalMember(owner = "client!afm", name = "lr", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20977(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean150 && this.aBoolean141) {
			@Pc(11) Class106_Sub1_Sub1 local11 = null;
			@Pc(14) Class106_Sub1 local14 = (Class106_Sub1) arg0;
			@Pc(17) Class106_Sub1 local17 = (Class106_Sub1) arg1;
			@Pc(20) Class84_Sub2 local20 = local14.method18209();
			@Pc(23) Class84_Sub2 local23 = local17.method18209();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt300 > local23.anInt300 ? local20.anInt300 : local23.anInt300;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class106_Sub1_Sub1) {
					@Pc(50) Class106_Sub1_Sub1 local50 = (Class106_Sub1_Sub1) arg3;
					if (local50.method18199() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class106_Sub1_Sub1(this, local38);
				}
				if (local11.method18198(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afm", name = "dm", descriptor = "(I)Lclient!df;")
	@Override
	public Class106 method20771(@OriginalArg(0) int arg0) {
		return this.aBoolean150 ? new Class106_Sub1_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!afm", name = "dq", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20854(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean150 && this.aBoolean141) {
			@Pc(11) Class106_Sub1_Sub1 local11 = null;
			@Pc(14) Class106_Sub1 local14 = (Class106_Sub1) arg0;
			@Pc(17) Class106_Sub1 local17 = (Class106_Sub1) arg1;
			@Pc(20) Class84_Sub2 local20 = local14.method18209();
			@Pc(23) Class84_Sub2 local23 = local17.method18209();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt300 > local23.anInt300 ? local20.anInt300 : local23.anInt300;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class106_Sub1_Sub1) {
					@Pc(50) Class106_Sub1_Sub1 local50 = (Class106_Sub1_Sub1) arg3;
					if (local50.method18199() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class106_Sub1_Sub1(this, local38);
				}
				if (local11.method18198(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afm", name = "do", descriptor = "(Lclient!df;)V")
	@Override
	public void method20773(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_1 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afm", name = "so", descriptor = "()Lclient!adr;")
	Class84_Sub2 method6369() {
		return this.aClass106_Sub1_1 == null ? null : this.aClass106_Sub1_1.method18209();
	}

	@OriginalMember(owner = "client!afm", name = "dp", descriptor = "(IIII)V")
	@Override
	public void method20774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24932(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afm", name = "dj", descriptor = "(II)V")
	@Override
	public void method20775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24939(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afm", name = "uf", descriptor = "(I)V")
	void method6370(@OriginalArg(0) int arg0) {
		if (this.anInt778 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean128) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean128 = local10;
		}
		if (local12 != this.aBoolean130) {
			this.aBoolean130 = local12;
			this.method6405();
		}
		if (local14 != this.aBoolean158) {
			this.aBoolean158 = local14;
			this.method6402();
		}
		if (local8 != this.anInt779) {
			this.anInt779 = local8;
			this.method6403();
		}
		this.anInt778 = arg0;
		this.anInt777 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afm", name = "sk", descriptor = "()Z")
	boolean method6371() {
		if (this.aClass80_Sub2_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub2_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub2_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "dz", descriptor = "()Z")
	@Override
	public boolean method20777() {
		return this.aClass80_Sub2_Sub2_1 != null && this.aClass80_Sub2_Sub2_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "dy", descriptor = "(FFFFF)V")
	@Override
	public void method20815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class80_Sub2_Sub2.aFloat193 = arg0;
		Class80_Sub2_Sub2.aFloat192 = arg1;
		Class80_Sub2_Sub2.aFloat196 = arg2;
		Class80_Sub2_Sub2.aFloat194 = arg3;
		Class80_Sub2_Sub2.aFloat195 = arg4;
	}

	@OriginalMember(owner = "client!afm", name = "da", descriptor = "([I)Lclient!cz;")
	@Override
	public Class97 method20779(@OriginalArg(0) int[] arg0) {
		return new Class97_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "sd", descriptor = "()Z")
	boolean method6372() {
		if (this.aClass80_Sub2_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub1_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub1_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "dk", descriptor = "()Z")
	@Override
	public boolean method20780() {
		return this.aClass80_Sub2_Sub1_1 != null && this.aClass80_Sub2_Sub1_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "ec", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public void method20928(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
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
		Class80_Sub2_Sub1.aClass97_Sub2Array1[0] = (Class97_Sub2) arg0;
		Class80_Sub2_Sub1.aFloatArray58[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[1] = (Class97_Sub2) arg2;
		Class80_Sub2_Sub1.aFloatArray58[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[2] = (Class97_Sub2) arg4;
		Class80_Sub2_Sub1.aFloatArray58[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.anInt2865 = local1;
		Class80_Sub2_Sub1.aFloat189 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afm", name = "wt", descriptor = "()V")
	void method6373() {
		this.aClass487_25.method30075(this.aClass487_28);
		this.aClass487_25.method30078(this.aClass487_24);
		this.aClass487_25.method30099(this.aFloatArrayArray12[0]);
		this.aClass487_25.method30100(this.aFloatArrayArray12[1]);
		this.aClass487_25.method30095(this.aFloatArrayArray12[2]);
		this.aClass487_25.method30096(this.aFloatArrayArray12[3]);
		this.aClass487_25.method30097(this.aFloatArrayArray12[4]);
		this.aClass487_25.method30098(this.aFloatArrayArray12[5]);
	}

	@OriginalMember(owner = "client!afm", name = "zq", descriptor = "(I)V")
	void method6374(@OriginalArg(0) int arg0) {
		if (this.anInt778 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean128) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean128 = local10;
		}
		if (local12 != this.aBoolean130) {
			this.aBoolean130 = local12;
			this.method6405();
		}
		if (local14 != this.aBoolean158) {
			this.aBoolean158 = local14;
			this.method6402();
		}
		if (local8 != this.anInt779) {
			this.anInt779 = local8;
			this.method6403();
		}
		this.anInt778 = arg0;
		this.anInt777 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afm", name = "eo", descriptor = "()Z")
	@Override
	public boolean method20784() {
		return this.aClass80_Sub2_Sub3_1 != null && this.aClass80_Sub2_Sub3_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "ew", descriptor = "(FFFFFF)V")
	@Override
	void method20786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class80_Sub2_Sub3.aFloat221 = arg0;
		Class80_Sub2_Sub3.aFloat220 = arg1;
		Class80_Sub2_Sub3.aFloat219 = arg2;
	}

	@OriginalMember(owner = "client!afm", name = "bu", descriptor = "(IIIII)V")
	@Override
	void method20725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "am", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method20689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class80_Sub1_Sub3(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!afm", name = "ak", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class80_Sub1_Sub3(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "af", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class80_Sub1_Sub3(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!afm", name = "lk", descriptor = "(Lclient!ov;)V")
	@Override
	public void method20963(@OriginalArg(0) Class471 arg0) {
		this.aClass471_10.method29760(arg0);
		this.aClass487_28.method30080(this.aClass471_10);
		this.aClass471_8.method29760(arg0);
		this.aClass471_8.method29768();
		this.aClass487_23.method30080(this.aClass471_8);
		this.method6360();
		if (this.anInt730 != 1) {
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!afm", name = "ss", descriptor = "(I[BIZ)Lclient!bw;")
	Interface14 method6375(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub2(this, arg0, arg1, arg2, arg3) : new Class94_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afm", name = "uz", descriptor = "()I")
	int method6376() {
		@Pc(1) int local1 = 0;
		this.aString26 = OpenGL.glGetString(7936).toLowerCase();
		this.aString25 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString26.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString26.indexOf("brian paul") != -1 || this.aString26.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class313.method27482(local40.replace('.', ' '), ' ', 2036747717);
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class679.method33621(local48[0], 1276316080);
				@Pc(64) int local64 = Class679.method33621(local48[1], -416962867);
				this.anInt815 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt815 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.t("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.t("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt809 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt803 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt810 = local111[0];
		if (this.anInt809 < 2 || this.anInt803 < 2 || this.anInt810 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean129 = Stream.m();
		this.aBoolean146 = this.anOpenGL1.t("GL_ARB_vertex_buffer_object");
		this.aBoolean144 = this.anOpenGL1.t("GL_ARB_multisample");
		this.aBoolean153 = this.anOpenGL1.t("GL_ARB_vertex_program");
		this.aBoolean154 = this.anOpenGL1.t("GL_ARB_fragment_program");
		this.aBoolean137 = this.anOpenGL1.t("GL_ARB_vertex_shader");
		this.aBoolean155 = this.anOpenGL1.t("GL_ARB_fragment_shader");
		this.aBoolean138 = this.anOpenGL1.t("GL_EXT_texture3D");
		this.aBoolean149 = this.anOpenGL1.t("GL_ARB_texture_rectangle");
		this.aBoolean150 = this.anOpenGL1.t("GL_ARB_texture_cube_map");
		this.aBoolean127 = this.anOpenGL1.t("GL_ARB_seamless_cube_map");
		this.aBoolean159 = this.anOpenGL1.t("GL_ARB_texture_float");
		this.aBoolean152 = this.anOpenGL1.t("GL_ARB_texture_non_power_of_two");
		this.aBoolean141 = this.anOpenGL1.t("GL_EXT_framebuffer_object");
		this.aBoolean142 = this.anOpenGL1.t("GL_EXT_framebuffer_blit");
		this.aBoolean143 = this.anOpenGL1.t("GL_EXT_framebuffer_multisample");
		this.aBoolean145 = this.aBoolean142 & this.aBoolean143;
		this.aBoolean156 = this.anOpenGL1.t("GL_EXT_blend_func_separate");
		this.aBoolean148 = this.anUnsafe2 != null && (this.anInt815 >= 32 || this.anOpenGL1.t("GL_ARB_sync"));
		this.aBoolean140 = Class531.aString220.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray24, 0);
		this.aFloat75 = aFloatArray24[0];
		this.aFloat57 = aFloatArray24[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!afm", name = "tk", descriptor = "(Lclient!bw;)V")
	void method6377(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_2 != arg0) {
			if (this.aBoolean146) {
				OpenGL.glBindBufferARB(34962, arg0.method2758());
			}
			this.anInterface14_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ks", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method21029() {
		return this.aClass471_9;
	}

	@OriginalMember(owner = "client!afm", name = "rq", descriptor = "(II[I[I)J")
	long method6378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean148) {
			if (this.aClass99_6 == null) {
				this.method6338(arg0, arg1);
			}
			if (this.aClass99_5 == null) {
				this.aClass99_5 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), true);
			} else {
				((Class99_Sub2) this.aClass99_5).method2612(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0, true);
			}
			this.method20684(this.aClass108_Sub1_2, 1652253056);
			this.method20714(1, -16777216);
			this.aClass99_5.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
			this.aClass99_6.method18222(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20887(this.aClass108_Sub1_2, (byte) 1);
			return 0L;
		}
		if (this.aLongArray7[this.anInt817] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray7[this.anInt817]);
			this.aLongArray7[this.anInt817] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray64[this.anInt817]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe2.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt817 >= 3) {
			this.anInt817 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!afm", name = "ti", descriptor = "(Lclient!ca;III)V")
	void method6379(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6435(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2093() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!afm", name = "ts", descriptor = "()V")
	void method6380() {
		if (this.anInt777 == 1) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6339(null);
		this.method6384(-2);
		this.method6543(1);
		this.method6388((byte) 0);
		this.anInt777 = 1;
	}

	@OriginalMember(owner = "client!afm", name = "uq", descriptor = "()V")
	void method6381() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!afm", name = "tx", descriptor = "()V")
	void method6382() {
		if (this.anInt777 == 4) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6370(1);
		this.method6388((byte) 0);
		this.anInt777 = 4;
	}

	@OriginalMember(owner = "client!afm", name = "tu", descriptor = "()V")
	void method6383() {
		if (this.anInt777 == 8) {
			return;
		}
		this.method6358();
		this.method6424(true);
		this.method6399(true);
		this.method6545(true);
		this.method6384(-2);
		this.method6370(1);
		this.method6388((byte) 0);
		this.anInt777 = 8;
	}

	@OriginalMember(owner = "client!afm", name = "tr", descriptor = "(I)V")
	void method6384(@OriginalArg(0) int arg0) {
		this.method6385(arg0, true);
	}

	@OriginalMember(owner = "client!afm", name = "ty", descriptor = "(IZ)V")
	void method6385(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6351(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afm", name = "hq", descriptor = "(Z)V")
	@Override
	public void method20654(@OriginalArg(0) boolean arg0) {
		this.aBoolean125 = arg0;
		this.method6400();
	}

	@OriginalMember(owner = "client!afm", name = "aw", descriptor = "(II[I[I)V")
	@Override
	public void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6378(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "tz", descriptor = "(I)V")
	void method6386(@OriginalArg(0) int arg0) {
		if (this.anInt807 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt807 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "yd", descriptor = "()V")
	void method6387() {
		if (this.anInt777 == 1) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6339(null);
		this.method6384(-2);
		this.method6543(1);
		this.method6388((byte) 0);
		this.anInt777 = 1;
	}

	@OriginalMember(owner = "client!afm", name = "ua", descriptor = "(B)V")
	void method6388(@OriginalArg(0) byte arg0) {
		if (this.aByte3 == arg0) {
			return;
		}
		this.aByte3 = arg0;
		if (arg0 == 0) {
			this.method6404(2);
			this.method6370(1);
		} else {
			this.method6404(3);
			this.method6370(3);
		}
		this.method6405();
	}

	@OriginalMember(owner = "client!afm", name = "td", descriptor = "(II)V")
	void method6389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt807 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt795 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt795 = arg0;
			local4 = true;
		}
		if (this.anInt806 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt806 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt777 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afm", name = "tw", descriptor = "(III)V")
	void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "to", descriptor = "(III)V")
	void method6391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "tt", descriptor = "(I)V")
	void method6392(@OriginalArg(0) int arg0) {
		aFloatArray24[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray24[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray24[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray24[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "tg", descriptor = "(FFFF)V")
	void method6393(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray24[0] = arg0;
		aFloatArray24[1] = arg1;
		aFloatArray24[2] = arg2;
		aFloatArray24[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "te", descriptor = "(FFF)V")
	void method6394(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean126) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!afm", name = "zd", descriptor = "(Z)V")
	void method6395(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean131) {
			this.aBoolean131 = arg0;
			this.method6347();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zl", descriptor = "()V")
	void method6396() {
		if (this.aBoolean131 && this.aBoolean135) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!afm", name = "zm", descriptor = "(I)V")
	void method6397(@OriginalArg(0) int arg0) {
		if (this.anInt778 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean128) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean128 = local10;
		}
		if (local12 != this.aBoolean130) {
			this.aBoolean130 = local12;
			this.method6405();
		}
		if (local14 != this.aBoolean158) {
			this.aBoolean158 = local14;
			this.method6402();
		}
		if (local8 != this.anInt779) {
			this.anInt779 = local8;
			this.method6403();
		}
		this.anInt778 = arg0;
		this.anInt777 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afm", name = "br", descriptor = "()V")
	@Override
	public void method20705() {
		this.anInt788 = 0;
		this.anInt789 = 0;
		this.anInt765 = this.aClass108_6.method24036();
		this.anInt790 = this.aClass108_6.method24037();
		this.method6495();
	}

	@OriginalMember(owner = "client!afm", name = "us", descriptor = "()V")
	void method6398() {
		if (this.aBoolean160 && !this.aBoolean133) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!afm", name = "uc", descriptor = "(Z)V")
	void method6399(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean131) {
			this.aBoolean131 = arg0;
			this.method6347();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "jn", descriptor = "(Lclient!akl;)V")
	@Override
	public void method20921(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap2 = ((Class80_Sub22_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) PacketGl local12 = new PacketGl(80);
		if (this.aBoolean129) {
			local12.method23420(-1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(-1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
		} else {
			local12.method23418(-1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(-1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
		}
		this.anInterface14_3 = this.method6375(20, local12.data, local12.pos * -1380987821, false);
		this.aClass189_5 = new Class189(this.anInterface14_3, 5126, 3, 0);
		this.aClass189_6 = new Class189(this.anInterface14_3, 5126, 2, 12);
		this.aClass209_1.method25789(this);
	}

	@OriginalMember(owner = "client!afm", name = "uh", descriptor = "()V")
	void method6400() {
		OpenGL.glDepthMask(this.aBoolean132 && this.aBoolean125);
	}

	@OriginalMember(owner = "client!afm", name = "zn", descriptor = "(FFF)V")
	void method6401(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean126) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!afm", name = "mk", descriptor = "(FFFFFF)V")
	@Override
	void method20886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class80_Sub2_Sub3.aFloat221 = arg0;
		Class80_Sub2_Sub3.aFloat220 = arg1;
		Class80_Sub2_Sub3.aFloat219 = arg2;
	}

	@OriginalMember(owner = "client!afm", name = "ug", descriptor = "()V")
	void method6402() {
		if (this.aBoolean158) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afm", name = "ul", descriptor = "()V")
	void method6403() {
		if (this.aBoolean156) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt753 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt753 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt753 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt753 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt779 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt779 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt779 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt779 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt779 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt779 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt779 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afm", name = "un", descriptor = "(I)V")
	void method6404(@OriginalArg(0) int arg0) {
		if (this.anInt753 != arg0) {
			this.anInt753 = arg0;
			this.method6403();
		}
	}

	@OriginalMember(owner = "client!afm", name = "um", descriptor = "()V")
	void method6405() {
		if (this.aBoolean130) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte3 & 0xFF) / 255.0F);
		if (this.anInt773 <= 0) {
			return;
		}
		if (this.aByte3 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!afm", name = "bq", descriptor = "(IIIIII)V")
	@Override
	public void method20727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6380();
		this.method6370(arg5);
		@Pc(10) float local10 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local40;
			local16 *= local40;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local10 + 0.35F, (float) arg3 + local16 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "nm", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public Class99 method21038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class99_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method20662(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class80_Sub20 local16;
		while (!this.aClass8_10.method240(-1956695338)) {
			local16 = (Class80_Sub20) this.aClass8_10.method233(2123206593);
			anIntArray65[local1++] = (int) (local16.aLong338 * 3209506792906532031L);
			this.anInt775 -= local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray65, 0);
			local1 = 0;
		}
		while (!this.aClass8_11.method240(-106785647)) {
			local16 = (Class80_Sub20) this.aClass8_11.method233(1514358397);
			anIntArray65[local1++] = (int) (local16.aLong338 * 3209506792906532031L);
			this.anInt774 -= local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray65, 0);
			local1 = 0;
		}
		while (!this.aClass8_8.method240(959442033)) {
			local16 = (Class80_Sub20) this.aClass8_8.method233(1405899334);
			anIntArray65[local1++] = local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray65, 0);
			local1 = 0;
		}
		while (!this.aClass8_12.method240(-795691803)) {
			local16 = (Class80_Sub20) this.aClass8_12.method233(1092550572);
			anIntArray65[local1++] = (int) (local16.aLong338 * 3209506792906532031L);
			this.anInt755 -= local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray65, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass8_15.method240(-715404903)) {
			local16 = (Class80_Sub20) this.aClass8_15.method233(1117172233);
			OpenGL.glDeleteLists((int) (local16.aLong338 * 3209506792906532031L), local16.anInt1588 * 701000167);
		}
		@Pc(215) Class80 local215;
		while (!this.aClass8_14.method240(-1368436303)) {
			local215 = this.aClass8_14.method233(619899163);
			OpenGL.glDeleteProgramARB((int) (local215.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_13.method240(-1925454574)) {
			local215 = this.aClass8_13.method233(1552170074);
			OpenGL.glDeleteShader((int) (local215.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_15.method240(412041813)) {
			local16 = (Class80_Sub20) this.aClass8_15.method233(150818775);
			OpenGL.glDeleteLists((int) (local16.aLong338 * 3209506792906532031L), local16.anInt1588 * 701000167);
		}
		this.aClass202_1.method24963();
		if (this.method20911() > 100663296 && Class303.method27111((byte) 12) > this.aLong27 + 60000L) {
			System.gc();
			this.aLong27 = Class303.method27111((byte) 73);
		}
		this.anInt770 = local5;
	}

	@OriginalMember(owner = "client!afm", name = "bf", descriptor = "(IIIIII)V")
	@Override
	public void method20818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method6380();
		this.method6370(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean144) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean144) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afm", name = "uo", descriptor = "(II)V")
	synchronized void method6406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_11.method232(local4, 1339131858);
	}

	@OriginalMember(owner = "client!afm", name = "tv", descriptor = "()V")
	void method6407() {
		if (this.anInt777 == 2) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6388((byte) 0);
		this.anInt777 = 2;
	}

	@OriginalMember(owner = "client!afm", name = "ud", descriptor = "(II)V")
	synchronized void method6408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_12.method232(local4, 1387781375);
	}

	@OriginalMember(owner = "client!afm", name = "uu", descriptor = "(J)V")
	synchronized void method6409(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_13.method232(local3, 835159300);
	}

	@OriginalMember(owner = "client!afm", name = "fv", descriptor = "()Z")
	@Override
	public boolean method20809() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ub", descriptor = "(I)V")
	void method6410(@OriginalArg(0) int arg0) {
		this.anInt780 = arg0;
		if (this.anInt780 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt780 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt780 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fr", descriptor = "(Z)V")
	@Override
	public void method20832(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "ur", descriptor = "(I)V")
	synchronized void method6412(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_8.method232(local4, 1720181469);
	}

	@OriginalMember(owner = "client!afm", name = "nu", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public Class99 method21037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class99_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "et", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20797() {
		@Pc(1) int local1 = -1;
		if (this.aString26.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString26.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString26.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, "OpenGL", this.anInt815, this.aString25, 0L, false);
	}

	@OriginalMember(owner = "client!afm", name = "lo", descriptor = "(Lclient!df;)V")
	@Override
	public void method20732(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_1 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afm", name = "es", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20799() {
		@Pc(1) int local1 = -1;
		if (this.aString26.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString26.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString26.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, "OpenGL", this.anInt815, this.aString25, 0L, false);
	}

	@OriginalMember(owner = "client!afm", name = "er", descriptor = "(II)V")
	@Override
	void method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		try {
			this.aClass108_Sub2_6.method24053();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(-1863392855);
		}
	}

	@OriginalMember(owner = "client!afm", name = "dt", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20763() {
		return new Class487(this.aClass487_24);
	}

	@OriginalMember(owner = "client!afm", name = "ex", descriptor = "(II)V")
	@Override
	void method20802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		try {
			this.aClass108_Sub2_6.method24053();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(-2095018896);
		}
	}

	@OriginalMember(owner = "client!afm", name = "eg", descriptor = "()V")
	@Override
	public void method20803() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afm", name = "eb", descriptor = "()V")
	@Override
	public void method20804() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afm", name = "ei", descriptor = "()V")
	@Override
	public void method20805() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afm", name = "ej", descriptor = "()V")
	@Override
	public void method20806() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afm", name = "en", descriptor = "(II)V")
	@Override
	void method21074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		try {
			this.aClass108_Sub2_6.method24053();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(1656873541);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fe", descriptor = "()V")
	@Override
	void method20808() {
		for (@Pc(4) Class80 local4 = this.aClass8_9.method247(129206984); local4 != null; local4 = this.aClass8_9.method237(271149842)) {
			((Class80_Sub22_Sub2) local4).method21677();
		}
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24933();
		}
		if (this.aBoolean124) {
			Class210.method25804(false, true, -1331760319);
			this.aBoolean124 = false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "kx", descriptor = "(II)I")
	@Override
	public int method20940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afm", name = "aac", descriptor = "(II)V")
	synchronized void method6413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_10.method232(local4, -92135159);
	}

	@OriginalMember(owner = "client!afm", name = "fp", descriptor = "()Z")
	@Override
	public boolean method20811() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "fx", descriptor = "()Z")
	@Override
	public boolean method20812() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ef", descriptor = "(ILclient!dp;)V")
	@Override
	public void method20868(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		if (!this.aBoolean151) {
			throw new RuntimeException("");
		}
		this.anInt814 = arg0;
		this.aClass229_2 = arg1;
		if (this.aBoolean136) {
			this.aClass191_1.aClass96_Sub7_1.method2734();
			this.aClass191_1.aClass96_Sub7_1.method2732();
		}
	}

	@OriginalMember(owner = "client!afm", name = "fq", descriptor = "()Z")
	@Override
	public boolean method20861() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "fk", descriptor = "()Z")
	@Override
	public boolean method20969() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ld", descriptor = "(I)V")
	@Override
	public void method20948(@OriginalArg(0) int arg0) {
		this.anInt772 = 0;
		while (arg0 > 1) {
			this.anInt772++;
			arg0 >>= 0x1;
		}
		this.anInt771 = 0x1 << this.anInt772;
	}

	@OriginalMember(owner = "client!afm", name = "fz", descriptor = "()Z")
	@Override
	public boolean method20817() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "xl", descriptor = "(Lclient!ca;III)V")
	void method6414(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6435(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2093() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!afm", name = "fh", descriptor = "()Z")
	@Override
	public boolean method20819() {
		return this.aBoolean144 && (!this.method20784() || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "fw", descriptor = "()Z")
	@Override
	public boolean method21027() {
		return this.aBoolean144 && (!this.method20784() || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "aah", descriptor = "()V")
	void method6415() {
		if (this.aBoolean156) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt753 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt753 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt753 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt753 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt779 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt779 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt779 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt779 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt779 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt779 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt779 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afm", name = "lm", descriptor = "(Lclient!pm;)V")
	@Override
	public void method20953(@OriginalArg(0) Class487 arg0) {
		this.aClass487_24.method30075(arg0);
		this.method6360();
		this.method6359();
	}

	@OriginalMember(owner = "client!afm", name = "fb", descriptor = "()Z")
	@Override
	public boolean method20823() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "hk", descriptor = "()V")
	@Override
	public void method20865() {
		if (!this.aBoolean148) {
			this.aClass108_Sub1_2 = null;
			this.aClass99_6 = null;
			this.aClass99_5 = null;
			return;
		}
		this.aClass99_5 = null;
		if (this.aClass108_Sub1_2 != null) {
			this.aClass108_Sub1_2.method24046();
			this.aClass108_Sub1_2 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray64, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray64[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "fc", descriptor = "()Z")
	@Override
	public boolean method20825() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "vu", descriptor = "()V")
	void method6416() {
		this.aClass84Array1 = new Class84[this.anInt809];
		this.aClass84_Sub1_2 = new Class84_Sub1(this, 3553, Class210.aClass210_24, Class236.aClass236_21, 1, 1);
		new Class84_Sub1(this, 3553, Class210.aClass210_24, Class236.aClass236_21, 1, 1);
		new Class84_Sub1(this, 3553, Class210.aClass210_24, Class236.aClass236_21, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass105_Sub2Array1[local37] = new Class105_Sub2(this);
			this.aClass105_Sub2Array2[local37] = new Class105_Sub2(this);
		}
		if (this.aBoolean141) {
			this.aClass108_Sub1_Sub2_1 = new Class108_Sub1_Sub2(this);
			new Class108_Sub1_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!afm", name = "aas", descriptor = "()V")
	void method6417() {
		if (this.aBoolean130) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte3 & 0xFF) / 255.0F);
		if (this.anInt773 <= 0) {
			return;
		}
		if (this.aByte3 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!afm", name = "mw", descriptor = "()V")
	@Override
	public void method21004() {
		if (this.aClass80_Sub2_Sub3_1 != null && this.aClass80_Sub2_Sub3_1.method21642()) {
			this.aClass201_1.method24940(this.aClass80_Sub2_Sub3_1);
			this.aClass202_1.method24964();
		}
	}

	@OriginalMember(owner = "client!afm", name = "fs", descriptor = "()[I")
	@Override
	public int[] method20829() {
		@Pc(2) int[] local2 = new int[1];
		OpenGL.glGetIntegerv(34466, local2, 0);
		@Pc(10) int local10 = local2[0];
		if (local10 == 0) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[local10];
			OpenGL.glGetIntegerv(34467, local17, 0);
			return local17;
		}
	}

	@OriginalMember(owner = "client!afm", name = "fu", descriptor = "(Z)V")
	@Override
	public void method20830(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "ff", descriptor = "(Z)V")
	@Override
	public void method20831(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "em", descriptor = "(Z)V")
	@Override
	public void method20795(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "yo", descriptor = "(I)V")
	void method6418(@OriginalArg(0) int arg0) {
		if (this.anInt807 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt807 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "oa", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class80_Sub1_Sub3(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "wx", descriptor = "()V")
	void method6419() {
		aFloatArray24[0] = this.aFloat72 * this.aFloat66;
		aFloatArray24[1] = this.aFloat72 * this.aFloat74;
		aFloatArray24[2] = this.aFloat72 * this.aFloat65;
		aFloatArray24[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "gk", descriptor = "(IIII)[I")
	@Override
	public int[] method20836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass108_6.method24037();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt812, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afm", name = "gg", descriptor = "(IIII)[I")
	@Override
	public int[] method20837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass108_6.method24037();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt812, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afm", name = "ge", descriptor = "(IIII)[I")
	@Override
	public int[] method20766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass108_6.method24037();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt812, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afm", name = "gb", descriptor = "()V")
	@Override
	public void method20839() {
		if (!this.aBoolean157 || this.aClass108_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt784;
		@Pc(12) int local12 = this.anInt766;
		@Pc(15) int local15 = this.anInt782;
		@Pc(18) int local18 = this.anInt783;
		this.method20877();
		@Pc(23) int local23 = this.anInt788;
		@Pc(26) int local26 = this.anInt789;
		@Pc(29) int local29 = this.anInt765;
		@Pc(32) int local32 = this.anInt790;
		this.method20705();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6356();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6339(null);
		this.method6384(-2);
		this.method6543(1);
		this.method6370(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20986(local9, local15, local12, local18);
		this.method20706(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afm", name = "gc", descriptor = "()Z")
	@Override
	public boolean method21026() {
		return this.aBoolean148;
	}

	@OriginalMember(owner = "client!afm", name = "gj", descriptor = "()Z")
	@Override
	public boolean method20846() {
		return this.aBoolean148;
	}

	@OriginalMember(owner = "client!afm", name = "ku", descriptor = "(I)V")
	@Override
	public void method20935(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "go", descriptor = "()Z")
	@Override
	public boolean method20995() {
		return !this.aBoolean148 || this.aLongArray7[this.anInt805] == 0L;
	}

	@OriginalMember(owner = "client!afm", name = "ye", descriptor = "(IZ)V")
	void method6420(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6351(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afm", name = "yy", descriptor = "(II)V")
	void method6421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt807 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt795 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt795 = arg0;
			local4 = true;
		}
		if (this.anInt806 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt806 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt777 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afm", name = "gu", descriptor = "()Z")
	@Override
	public boolean method20710() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "gt", descriptor = "()Z")
	@Override
	public boolean method20852() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "uv", descriptor = "(II)V")
	synchronized void method6422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_10.method232(local4, 1236842742);
	}

	@OriginalMember(owner = "client!afm", name = "gl", descriptor = "()I")
	@Override
	public int method20676() {
		if (!this.aBoolean148) {
			return -1;
		} else if (this.aLongArray7[this.anInt817] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt817], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray68[this.anInt817];
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "gm", descriptor = "()I")
	@Override
	public int method20745() {
		if (!this.aBoolean148) {
			return -1;
		} else if (this.aLongArray7[this.anInt817] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt817], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray68[this.anInt817];
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "gx", descriptor = "(III)V")
	@Override
	public void method20857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20782();
		if (this.aClass108_Sub1_2 == null) {
			this.method6338(arg1, arg2);
		}
		if (this.aClass99_5 == null) {
			this.aClass99_5 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), true);
		} else {
			((Class99_Sub2) this.aClass99_5).method2612(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0, true);
		}
		this.method20684(this.aClass108_Sub1_2, -1964364941);
		this.method20714(1, -16777216);
		this.aClass99_5.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
		OpenGL.glBindBufferARB(35051, this.anIntArray64[this.anInt805]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2945 * -971613875, this.anInt2935 * 143307461, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20887(this.aClass108_Sub1_2, (byte) 1);
		this.aLongArray7[this.anInt805] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray68[this.anInt805] = arg0;
		if (++this.anInt805 >= 3) {
			this.anInt805 = 0;
		}
		this.method20746();
	}

	@OriginalMember(owner = "client!afm", name = "hx", descriptor = "()V")
	@Override
	public void method20870() {
		this.anInt788 = 0;
		this.anInt789 = 0;
		this.anInt765 = this.aClass108_6.method24036();
		this.anInt790 = this.aClass108_6.method24037();
		this.method6495();
	}

	@OriginalMember(owner = "client!afm", name = "gs", descriptor = "(II)J")
	@Override
	public long method20859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6378(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afm", name = "hp", descriptor = "(II)J")
	@Override
	public long method20860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6378(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afm", name = "cx", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20750() {
		return this.aClass487_21;
	}

	@OriginalMember(owner = "client!afm", name = "ha", descriptor = "(II[I[I)V")
	@Override
	public void method20848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6378(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "hn", descriptor = "(II[I[I)V")
	@Override
	public void method21098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6378(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "hw", descriptor = "(II[I[I)V")
	@Override
	public void method20864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6378(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "ki", descriptor = "(II)I")
	@Override
	public int method20938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afm", name = "tj", descriptor = "(Z)V")
	void method6424(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean134) {
			this.aBoolean134 = arg0;
			this.method6509();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "yr", descriptor = "(I)V")
	void method6425(@OriginalArg(0) int arg0) {
		this.method6385(arg0, true);
	}

	@OriginalMember(owner = "client!afm", name = "nx", descriptor = "()Z")
	@Override
	public boolean method21036() {
		return this.aClass80_Sub2_Sub3_1 != null && (this.anInt773 <= 1 || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "he", descriptor = "(Z)V")
	@Override
	public void method21071(@OriginalArg(0) boolean arg0) {
		this.aBoolean125 = arg0;
		this.method6400();
	}

	@OriginalMember(owner = "client!afm", name = "ta", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bw;")
	Interface14 method6426(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub2(this, arg0, arg1, arg2, arg3) : new Class94_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afm", name = "hc", descriptor = "(IIII)V")
	@Override
	public void method20990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt788 = arg0;
		this.anInt789 = arg1;
		this.anInt765 = arg2;
		this.anInt790 = arg3;
		this.method6495();
	}

	@OriginalMember(owner = "client!afm", name = "ho", descriptor = "(IIII)V")
	@Override
	public void method20942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt788 = arg0;
		this.anInt789 = arg1;
		this.anInt765 = arg2;
		this.anInt790 = arg3;
		this.method6495();
	}

	@OriginalMember(owner = "client!afm", name = "hu", descriptor = "([I)V")
	@Override
	public void method20873(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt788;
		arg0[1] = this.anInt789;
		arg0[2] = this.anInt765;
		arg0[3] = this.anInt790;
	}

	@OriginalMember(owner = "client!afm", name = "hh", descriptor = "([I)V")
	@Override
	public void method20874(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt788;
		arg0[1] = this.anInt789;
		arg0[2] = this.anInt765;
		arg0[3] = this.anInt790;
	}

	@OriginalMember(owner = "client!afm", name = "hd", descriptor = "(FF)V")
	@Override
	public void method20901(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat61 = arg0;
		this.aFloat62 = arg1;
		this.method6363();
	}

	@OriginalMember(owner = "client!afm", name = "hm", descriptor = "()V")
	@Override
	public void method20876() {
		if (this.aClass108_6 == null) {
			return;
		}
		this.anInt784 = 0;
		this.anInt782 = 0;
		this.anInt766 = this.aClass108_6.method24036();
		this.anInt783 = this.aClass108_6.method24037();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afm", name = "oj", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class80_Sub1_Sub3(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "oi", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method21050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class80_Sub1_Sub3(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!afm", name = "hb", descriptor = "(IIII)V")
	@Override
	public void method20875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt784 < arg0) {
			this.anInt784 = arg0;
		}
		if (this.anInt766 > arg2) {
			this.anInt766 = arg2;
		}
		if (this.anInt782 < arg1) {
			this.anInt782 = arg1;
		}
		if (this.anInt783 > arg3) {
			this.anInt783 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "hs", descriptor = "(IIII)V")
	@Override
	public void method20880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt784 < arg0) {
			this.anInt784 = arg0;
		}
		if (this.anInt766 > arg2) {
			this.anInt766 = arg2;
		}
		if (this.anInt782 < arg1) {
			this.anInt782 = arg1;
		}
		if (this.anInt783 > arg3) {
			this.anInt783 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "hi", descriptor = "([I)V")
	@Override
	public void method20881(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt784;
		arg0[1] = this.anInt782;
		arg0[2] = this.anInt766;
		arg0[3] = this.anInt783;
	}

	@OriginalMember(owner = "client!afm", name = "hz", descriptor = "([I)V")
	@Override
	public void method20882(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt784;
		arg0[1] = this.anInt782;
		arg0[2] = this.anInt766;
		arg0[3] = this.anInt783;
	}

	@OriginalMember(owner = "client!afm", name = "ia", descriptor = "(II)V")
	@Override
	public void method20764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6545(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!afm", name = "mi", descriptor = "()V")
	@Override
	public void method21012() {
		this.aBoolean151 = false;
	}

	@OriginalMember(owner = "client!afm", name = "in", descriptor = "(II)V")
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6545(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!afm", name = "if", descriptor = "(IIIIII)V")
	@Override
	public void method20692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method6380();
		this.method6370(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean144) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean144) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afm", name = "le", descriptor = "(IIII)V")
	@Override
	public void method20984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24932(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afm", name = "xf", descriptor = "(I[BIZ)Lclient!ca;")
	Interface15 method6427(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface15) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub1(this, arg0, arg1, arg2, arg3) : new Class94_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afm", name = "ig", descriptor = "(IIIIII)V")
	@Override
	public void method20903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method6380();
		this.method6370(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean144) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean144) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afm", name = "y", descriptor = "()Ljava/lang/String;")
	@Override
	public String method21048() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt773 + local3;
		@Pc(27) String local27 = local15 + this.anInt812 + local3;
		@Pc(39) String local39 = local27 + this.anInt809 + local3;
		@Pc(51) String local51 = local39 + this.anInt803 + local3;
		@Pc(63) String local63 = local51 + this.anInt810 + local3;
		@Pc(75) String local75 = local63 + this.aFloat75 + local3;
		@Pc(87) String local87 = local75 + this.aFloat57 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean129 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean139 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean140 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean146 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean147 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean144 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean153 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean154 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean137 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean155 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean138 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean149 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean150 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean127 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean152 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean141 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean142 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean143 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean159 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean157 ? 1 : 0) + local3;
		return local407 + (this.aBoolean156 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afm", name = "ix", descriptor = "(IIIII)V")
	@Override
	void method21043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt784 || arg0 - arg2 > this.anInt766 || arg1 + arg2 < this.anInt782 || arg1 - arg2 > this.anInt783) {
			return;
		}
		this.method6380();
		this.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat75) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat57) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class548.method31273(local132, -1998869610);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class204.aFloatArray94[local157] * (float) arg2, local59 + Class204.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afm", name = "ip", descriptor = "(IIIII)V")
	@Override
	void method21084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt784 || arg0 - arg2 > this.anInt766 || arg1 + arg2 < this.anInt782 || arg1 - arg2 > this.anInt783) {
			return;
		}
		this.method6380();
		this.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat75) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat57) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class548.method31273(local132, -1385700596);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class204.aFloatArray94[local157] * (float) arg2, local59 + Class204.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afm", name = "ir", descriptor = "(IIIII)V")
	@Override
	void method21003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt784 || arg0 - arg2 > this.anInt766 || arg1 + arg2 < this.anInt782 || arg1 - arg2 > this.anInt783) {
			return;
		}
		this.method6380();
		this.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat75) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat57) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class548.method31273(local132, 1108693969);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class204.aFloatArray94[local157] * (float) arg2, local59 + Class204.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afm", name = "iu", descriptor = "(IIIII)V")
	@Override
	void method20758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "xn", descriptor = "(I[BIZ)Lclient!ca;")
	Interface15 method6428(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface15) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub1(this, arg0, arg1, arg2, arg3) : new Class94_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afm", name = "it", descriptor = "(IIIII)V")
	@Override
	void method20896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "ib", descriptor = "(IIIII)V")
	@Override
	void method20781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "iy", descriptor = "(IIIII)V")
	@Override
	void method20883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "iw", descriptor = "(IIIIII)V")
	@Override
	public void method20899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6380();
		this.method6370(arg5);
		@Pc(10) float local10 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local40;
			local16 *= local40;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local10 + 0.35F, (float) arg3 + local16 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "iv", descriptor = "(IIIIII)V")
	@Override
	public void method20900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6380();
		this.method6370(arg5);
		@Pc(10) float local10 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local40;
			local16 *= local40;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local10 + 0.35F, (float) arg3 + local16 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "tc", descriptor = "(Z)V")
	void method6429(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean160) {
			this.aBoolean160 = arg0;
			this.method6398();
			this.anInt777 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ik", descriptor = "(IIIIIIIII)V")
	@Override
	public void method20987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method6380();
		this.method6370(arg5);
		@Pc(17) float local17 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
		@Pc(40) float local40 = local17 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(65) int local65 = arg8 % (arg7 + arg6);
		@Pc(70) float local70 = local40 * (float) arg6;
		@Pc(75) float local75 = local44 * (float) arg6;
		@Pc(77) float local77 = 0.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(81) float local81 = local70;
		@Pc(83) float local83 = local75;
		if (local65 > arg6) {
			local77 = local40 * (float) (arg6 + arg7 - local65);
			local79 = local44 * (float) (arg6 + arg7 - local65);
		} else {
			local81 = local40 * (float) (arg6 - local65);
			local83 = local44 * (float) (arg6 - local65);
		}
		@Pc(126) float local126 = (float) arg0 + 0.35F + local77;
		@Pc(133) float local133 = (float) arg1 + 0.35F + local79;
		@Pc(138) float local138 = local40 * (float) arg7;
		@Pc(143) float local143 = local44 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local126 > (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 > (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			} else {
				if (local126 < (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 < (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 > (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 < (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local126, local133);
			OpenGL.glVertex2f(local126 + local81, local133 + local83);
			OpenGL.glEnd();
			local126 += local138 + local81;
			local133 += local143 + local83;
			local81 = local70;
			local83 = local75;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ii", descriptor = "(IIIIIILclient!cg;II)V")
	@Override
	public void method21067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg6;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local2.aClass84_Sub1_Sub1_1);
		this.method6370(arg5);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2598;
		@Pc(43) float local43 = (float) arg2 - (float) arg0;
		@Pc(49) float local49 = (float) arg3 - (float) arg1;
		@Pc(62) float local62 = (float) (1.0D / Math.sqrt((double) (local43 * local43 + local49 * local49)));
		@Pc(66) float local66 = local43 * local62;
		@Pc(70) float local70 = local49 * local62;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local30 * (float) (arg0 - arg7), local37 * (float) (arg1 - arg8));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local30 * (float) (arg2 - arg7), local37 * (float) (arg3 - arg8));
		OpenGL.glVertex2f((float) arg2 + local66 + 0.35F, (float) arg3 + local70 + 0.35F);
		OpenGL.glEnd();
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "is", descriptor = "(IIIIIILclient!cg;IIIII)V")
	@Override
	public void method20904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class98_Sub1 local9 = (Class98_Sub1) arg6;
		@Pc(12) Class84_Sub1_Sub1 local12 = local9.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local9.aClass84_Sub1_Sub1_1);
		this.method6370(arg5);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat164 / (float) local12.anInt2599;
		@Pc(44) float local44 = local12.aFloat163 / (float) local12.anInt2598;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "ic", descriptor = "(IIIIIILclient!cg;IIIII)V")
	@Override
	public void method20736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class98_Sub1 local9 = (Class98_Sub1) arg6;
		@Pc(12) Class84_Sub1_Sub1 local12 = local9.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local9.aClass84_Sub1_Sub1_1);
		this.method6370(arg5);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat164 / (float) local12.anInt2599;
		@Pc(44) float local44 = local12.aFloat163 / (float) local12.anInt2598;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "im", descriptor = "(IIIIIII)V")
	@Override
	public void method20718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20727(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!afm", name = "ij", descriptor = "(IIIIII)I")
	@Override
	public int method20907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg0 + this.aClass487_25.aFloatArray114[6] * (float) arg1 + this.aClass487_25.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg3 + this.aClass487_25.aFloatArray114[6] * (float) arg4 + this.aClass487_25.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg0 + this.aClass487_25.aFloatArray114[7] * (float) arg1 + this.aClass487_25.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg3 + this.aClass487_25.aFloatArray114[7] * (float) arg4 + this.aClass487_25.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg0 + this.aClass487_25.aFloatArray114[4] * (float) arg1 + this.aClass487_25.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg3 + this.aClass487_25.aFloatArray114[4] * (float) arg4 + this.aClass487_25.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg0 + this.aClass487_25.aFloatArray114[5] * (float) arg1 + this.aClass487_25.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg3 + this.aClass487_25.aFloatArray114[5] * (float) arg4 + this.aClass487_25.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afm", name = "oo", descriptor = "(F)V")
	@Override
	public void method21046(@OriginalArg(0) float arg0) {
		if (this.aFloat72 != arg0) {
			this.aFloat72 = arg0;
			this.method6512();
		}
	}

	@OriginalMember(owner = "client!afm", name = "jd", descriptor = "(IIIIII)I")
	@Override
	public int method20909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg0 + this.aClass487_25.aFloatArray114[6] * (float) arg1 + this.aClass487_25.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg3 + this.aClass487_25.aFloatArray114[6] * (float) arg4 + this.aClass487_25.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg0 + this.aClass487_25.aFloatArray114[7] * (float) arg1 + this.aClass487_25.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg3 + this.aClass487_25.aFloatArray114[7] * (float) arg4 + this.aClass487_25.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg0 + this.aClass487_25.aFloatArray114[4] * (float) arg1 + this.aClass487_25.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg3 + this.aClass487_25.aFloatArray114[4] * (float) arg4 + this.aClass487_25.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg0 + this.aClass487_25.aFloatArray114[5] * (float) arg1 + this.aClass487_25.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg3 + this.aClass487_25.aFloatArray114[5] * (float) arg4 + this.aClass487_25.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afm", name = "bz", descriptor = "([I)V")
	@Override
	public void method20713(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt784;
		arg0[1] = this.anInt782;
		arg0[2] = this.anInt766;
		arg0[3] = this.anInt783;
	}

	@OriginalMember(owner = "client!afm", name = "jl", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	@Override
	boolean method20966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5) {
		@Pc(2) Class487 local2 = this.aClass487_26;
		local2.method30080(arg4);
		local2.method30078(this.aClass487_25);
		return arg5.method29859(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat60, this.aFloat59, this.aFloat73);
	}

	@OriginalMember(owner = "client!afm", name = "jj", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	@Override
	boolean method20994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5) {
		@Pc(2) Class487 local2 = this.aClass487_26;
		local2.method30080(arg4);
		local2.method30078(this.aClass487_25);
		return arg5.method29859(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat60, this.aFloat59, this.aFloat73);
	}

	@OriginalMember(owner = "client!afm", name = "hv", descriptor = "(Z)V")
	@Override
	public void method20866(@OriginalArg(0) boolean arg0) {
		this.aBoolean125 = arg0;
		this.method6400();
	}

	@OriginalMember(owner = "client!afm", name = "jr", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	@Override
	public void method20914(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2) {
		@Pc(2) Class487 local2 = this.aClass487_26;
		local2.method30080(arg0);
		local2.method30078(this.aClass487_25);
		arg1.method26329(arg2, this.aClass487_24, local2, this.aFloat58, this.aFloat60, this.aFloat59, this.aFloat73);
	}

	@OriginalMember(owner = "client!afm", name = "jw", descriptor = "(I)Lclient!akl;")
	@Override
	public Class80_Sub22 method20915(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub2 local4 = new Class80_Sub22_Sub2(arg0);
		this.aClass8_9.method232(local4, 1175962332);
		return local4;
	}

	@OriginalMember(owner = "client!afm", name = "jx", descriptor = "(I)Lclient!akl;")
	@Override
	public Class80_Sub22 method20916(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub2 local4 = new Class80_Sub22_Sub2(arg0);
		this.aClass8_9.method232(local4, 689840035);
		return local4;
	}

	@OriginalMember(owner = "client!afm", name = "jy", descriptor = "(I)Lclient!akl;")
	@Override
	public Class80_Sub22 method20917(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub22_Sub2 local4 = new Class80_Sub22_Sub2(arg0);
		this.aClass8_9.method232(local4, 1549134859);
		return local4;
	}

	@OriginalMember(owner = "client!afm", name = "mz", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public void method20670(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
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
		Class80_Sub2_Sub1.aClass97_Sub2Array1[0] = (Class97_Sub2) arg0;
		Class80_Sub2_Sub1.aFloatArray58[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[1] = (Class97_Sub2) arg2;
		Class80_Sub2_Sub1.aFloatArray58[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[2] = (Class97_Sub2) arg4;
		Class80_Sub2_Sub1.aFloatArray58[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.anInt2865 = local1;
		Class80_Sub2_Sub1.aFloat189 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afm", name = "jm", descriptor = "(Lclient!akl;)V")
	@Override
	public void method20919(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap2 = ((Class80_Sub22_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) PacketGl local12 = new PacketGl(80);
		if (this.aBoolean129) {
			local12.method23420(-1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(-1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
		} else {
			local12.method23418(-1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(-1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
		}
		this.anInterface14_3 = this.method6375(20, local12.data, local12.pos * -1380987821, false);
		this.aClass189_5 = new Class189(this.anInterface14_3, 5126, 3, 0);
		this.aClass189_6 = new Class189(this.anInterface14_3, 5126, 2, 12);
		this.aClass209_1.method25789(this);
	}

	@OriginalMember(owner = "client!afm", name = "jz", descriptor = "(Lclient!akl;)V")
	@Override
	public void method20920(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap2 = ((Class80_Sub22_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) PacketGl local12 = new PacketGl(80);
		if (this.aBoolean129) {
			local12.method23420(-1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(-1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
		} else {
			local12.method23418(-1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(-1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
		}
		this.anInterface14_3 = this.method6375(20, local12.data, local12.pos * -1380987821, false);
		this.aClass189_5 = new Class189(this.anInterface14_3, 5126, 3, 0);
		this.aClass189_6 = new Class189(this.anInterface14_3, 5126, 2, 12);
		this.aClass209_1.method25789(this);
	}

	@OriginalMember(owner = "client!afm", name = "ve", descriptor = "()V")
	void method6430() {
		this.method6334();
	}

	@OriginalMember(owner = "client!afm", name = "jo", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public Class99 method20961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "ju", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public Class99 method20863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "jq", descriptor = "(IIZZ)Lclient!cm;")
	@Override
	public Class99 method20924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class99_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "jt", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public Class99 method20981(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class99_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "je", descriptor = "([IIIIIZ)Lclient!cm;")
	@Override
	public Class99 method20926(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class99_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "js", descriptor = "(Lclient!da;Z)Lclient!cm;")
	@Override
	public Class99 method20927(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method7117(false);
		@Pc(15) Class99 local15 = this.method20741(local3, 0, arg0.method7119(), arg0.method7119(), arg0.method7127(), -1657536790);
		local15.method18216(arg0.method7121(), arg0.method7123(), arg0.method7122(), arg0.method7148());
		return local15;
	}

	@OriginalMember(owner = "client!afm", name = "jb", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public Class98 method20833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub1.method2136(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "jg", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public Class98 method20929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub1.method2136(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "jf", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public Class98 method20930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub1.method2136(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "yl", descriptor = "()V")
	void method6431() {
		if (this.anInt777 == 8) {
			return;
		}
		this.method6358();
		this.method6424(true);
		this.method6399(true);
		this.method6545(true);
		this.method6384(-2);
		this.method6370(1);
		this.method6388((byte) 0);
		this.anInt777 = 8;
	}

	@OriginalMember(owner = "client!afm", name = "iq", descriptor = "(IIIII)V")
	@Override
	void method20895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "jc", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	@Override
	public Class104 method20810(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2) {
		return new Class104_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "jp", descriptor = "(Lclient!aan;Lclient!da;Z)Lclient!ed;")
	@Override
	public Class104 method20934(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2) {
		return new Class104_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "r", descriptor = "()Z")
	@Override
	public boolean method20667() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "kv", descriptor = "(Lclient!dt;IIII)Lclient!dn;")
	@Override
	public Class105 method20936(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class105_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "x", descriptor = "()Z")
	@Override
	public boolean method20665() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "cf", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method20813() {
		return this.aClass471_9;
	}

	@OriginalMember(owner = "client!afm", name = "jv", descriptor = "(IIIIII)I")
	@Override
	public int method20965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg0 + this.aClass487_25.aFloatArray114[6] * (float) arg1 + this.aClass487_25.aFloatArray114[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * (float) arg3 + this.aClass487_25.aFloatArray114[6] * (float) arg4 + this.aClass487_25.aFloatArray114[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg0 + this.aClass487_25.aFloatArray114[7] * (float) arg1 + this.aClass487_25.aFloatArray114[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * (float) arg3 + this.aClass487_25.aFloatArray114[7] * (float) arg4 + this.aClass487_25.aFloatArray114[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg0 + this.aClass487_25.aFloatArray114[4] * (float) arg1 + this.aClass487_25.aFloatArray114[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * (float) arg3 + this.aClass487_25.aFloatArray114[4] * (float) arg4 + this.aClass487_25.aFloatArray114[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg0 + this.aClass487_25.aFloatArray114[5] * (float) arg1 + this.aClass487_25.aFloatArray114[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * (float) arg3 + this.aClass487_25.aFloatArray114[5] * (float) arg4 + this.aClass487_25.aFloatArray114[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afm", name = "sw", descriptor = "()V")
	void method6432() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!afm", name = "ll", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20968() {
		return new Class487(this.aClass487_24);
	}

	@OriginalMember(owner = "client!afm", name = "kp", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20973() {
		return this.aClass487_21;
	}

	@OriginalMember(owner = "client!afm", name = "kk", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20943() {
		return this.aClass487_21;
	}

	@OriginalMember(owner = "client!afm", name = "kw", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20944() {
		return this.aClass487_21;
	}

	@OriginalMember(owner = "client!afm", name = "kg", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20945() {
		return this.aClass487_21;
	}

	@OriginalMember(owner = "client!afm", name = "kb", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method20946() {
		return this.aClass471_9;
	}

	@OriginalMember(owner = "client!afm", name = "kz", descriptor = "(Lclient!ov;)V")
	@Override
	public void method20913(@OriginalArg(0) Class471 arg0) {
		this.aClass471_10.method29760(arg0);
		this.aClass487_28.method30080(this.aClass471_10);
		this.aClass471_8.method29760(arg0);
		this.aClass471_8.method29768();
		this.aClass487_23.method30080(this.aClass471_8);
		this.method6360();
		if (this.anInt730 != 1) {
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!afm", name = "kl", descriptor = "()I")
	@Override
	public int method20673() {
		return 4;
	}

	@OriginalMember(owner = "client!afm", name = "kj", descriptor = "()I")
	@Override
	public int method20949() {
		return 4;
	}

	@OriginalMember(owner = "client!afm", name = "gh", descriptor = "(IIII)[I")
	@Override
	public int[] method20834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass108_6.method24037();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt812, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afm", name = "ka", descriptor = "(I[Lclient!akb;)V")
	@Override
	public void method20923(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass80_Sub12Array2[local1] = arg1[local1];
		}
		this.anInt797 = arg0;
		if (this.anInt730 != 1) {
			this.method6362();
		}
	}

	@OriginalMember(owner = "client!afm", name = "kd", descriptor = "(I[Lclient!akb;)V")
	@Override
	public void method20954(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass80_Sub12Array2[local1] = arg1[local1];
		}
		this.anInt797 = arg0;
		if (this.anInt730 != 1) {
			this.method6362();
		}
	}

	@OriginalMember(owner = "client!afm", name = "kn", descriptor = "(Lclient!db;)V")
	@Override
	public void method20955(@OriginalArg(0) Class221 arg0) {
		this.aClass209_1.method25790(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "kc", descriptor = "(Lclient!db;)V")
	@Override
	public void method20956(@OriginalArg(0) Class221 arg0) {
		this.aClass209_1.method25790(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "km", descriptor = "(Lclient!db;)V")
	@Override
	public void method20957(@OriginalArg(0) Class221 arg0) {
		this.aClass209_1.method25790(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "ko", descriptor = "(Lclient!db;)V")
	@Override
	public void method20958(@OriginalArg(0) Class221 arg0) {
		this.aClass209_1.method25790(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "ky", descriptor = "(Lclient!ov;)V")
	@Override
	public void method21063(@OriginalArg(0) Class471 arg0) {
		this.aClass471_10.method29760(arg0);
		this.aClass487_28.method30080(this.aClass471_10);
		this.aClass471_8.method29760(arg0);
		this.aClass471_8.method29768();
		this.aClass487_23.method30080(this.aClass471_8);
		this.method6360();
		if (this.anInt730 != 1) {
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!afm", name = "sr", descriptor = "()V")
	void method6433() {
		if (this.anInt730 == 1) {
			return;
		}
		this.anInt730 = 1;
		this.method6359();
		this.method6495();
		this.method6363();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt777 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afm", name = "nk", descriptor = "()V")
	@Override
	public void method21015() {
		this.aBoolean151 = false;
	}

	@OriginalMember(owner = "client!afm", name = "lv", descriptor = "(Lclient!ov;)V")
	@Override
	public void method20962(@OriginalArg(0) Class471 arg0) {
		this.aClass471_10.method29760(arg0);
		this.aClass487_28.method30080(this.aClass471_10);
		this.aClass471_8.method29760(arg0);
		this.aClass471_8.method29768();
		this.aClass487_23.method30080(this.aClass471_8);
		this.method6360();
		if (this.anInt730 != 1) {
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!afm", name = "fy", descriptor = "()Z")
	@Override
	public boolean method20879() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "aae", descriptor = "(II)V")
	synchronized void method6434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_10.method232(local4, 1456822745);
	}

	@OriginalMember(owner = "client!afm", name = "lh", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method20655() {
		return new Class471(this.aClass471_10);
	}

	@OriginalMember(owner = "client!afm", name = "cq", descriptor = "(II)I")
	@Override
	public int method21083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afm", name = "tm", descriptor = "(Lclient!ca;)V")
	void method6435(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_1 != arg0) {
			if (this.aBoolean146) {
				OpenGL.glBindBufferARB(34963, arg0.method2088());
			}
			this.anInterface15_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ch", descriptor = "(IIIILclient!ov;Lclient!oy;)Z")
	@Override
	boolean method20734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) Class472 arg5) {
		@Pc(2) Class487 local2 = this.aClass487_26;
		local2.method30080(arg4);
		local2.method30078(this.aClass487_25);
		return arg5.method29859(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat60, this.aFloat59, this.aFloat73);
	}

	@OriginalMember(owner = "client!afm", name = "ly", descriptor = "(IFFFFF)V")
	@Override
	public void method20668(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt793 != arg0;
		if (local7 || this.aFloat67 != arg1 || this.aFloat68 != arg2) {
			this.anInt793 = arg0;
			this.aFloat67 = arg1;
			this.aFloat68 = arg2;
			if (local7) {
				this.aFloat66 = (float) (this.anInt793 & 0xFF0000) / 1.671168E7F;
				this.aFloat74 = (float) (this.anInt793 & 0xFF00) / 65280.0F;
				this.aFloat65 = (float) (this.anInt793 & 0xFF) / 255.0F;
				this.method6512();
			}
			this.method6366();
		}
		if (this.aFloatArray19[0] == arg3 && this.aFloatArray19[1] == arg4 && this.aFloatArray19[2] == arg5) {
			return;
		}
		this.aFloatArray19[0] = arg3;
		this.aFloatArray19[1] = arg4;
		this.aFloatArray19[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray21[0] = arg3 * local132;
		this.aFloatArray21[1] = arg4 * local132;
		this.aFloatArray21[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray21[0];
		this.aFloatArray22[1] = -this.aFloatArray21[1];
		this.aFloatArray22[2] = -this.aFloatArray21[2];
		this.method6367();
		this.anInt781 = (int) (arg3 * 256.0F / arg4);
		this.anInt769 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afm", name = "lg", descriptor = "(IFFFFF)V")
	@Override
	public void method20970(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt793 != arg0;
		if (local7 || this.aFloat67 != arg1 || this.aFloat68 != arg2) {
			this.anInt793 = arg0;
			this.aFloat67 = arg1;
			this.aFloat68 = arg2;
			if (local7) {
				this.aFloat66 = (float) (this.anInt793 & 0xFF0000) / 1.671168E7F;
				this.aFloat74 = (float) (this.anInt793 & 0xFF00) / 65280.0F;
				this.aFloat65 = (float) (this.anInt793 & 0xFF) / 255.0F;
				this.method6512();
			}
			this.method6366();
		}
		if (this.aFloatArray19[0] == arg3 && this.aFloatArray19[1] == arg4 && this.aFloatArray19[2] == arg5) {
			return;
		}
		this.aFloatArray19[0] = arg3;
		this.aFloatArray19[1] = arg4;
		this.aFloatArray19[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray21[0] = arg3 * local132;
		this.aFloatArray21[1] = arg4 * local132;
		this.aFloatArray21[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray21[0];
		this.aFloatArray22[1] = -this.aFloatArray21[1];
		this.aFloatArray22[2] = -this.aFloatArray21[2];
		this.method6367();
		this.anInt781 = (int) (arg3 * 256.0F / arg4);
		this.anInt769 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afm", name = "lx", descriptor = "(IFFFFF)V")
	@Override
	public void method21025(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt793 != arg0;
		if (local7 || this.aFloat67 != arg1 || this.aFloat68 != arg2) {
			this.anInt793 = arg0;
			this.aFloat67 = arg1;
			this.aFloat68 = arg2;
			if (local7) {
				this.aFloat66 = (float) (this.anInt793 & 0xFF0000) / 1.671168E7F;
				this.aFloat74 = (float) (this.anInt793 & 0xFF00) / 65280.0F;
				this.aFloat65 = (float) (this.anInt793 & 0xFF) / 255.0F;
				this.method6512();
			}
			this.method6366();
		}
		if (this.aFloatArray19[0] == arg3 && this.aFloatArray19[1] == arg4 && this.aFloatArray19[2] == arg5) {
			return;
		}
		this.aFloatArray19[0] = arg3;
		this.aFloatArray19[1] = arg4;
		this.aFloatArray19[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray21[0] = arg3 * local132;
		this.aFloatArray21[1] = arg4 * local132;
		this.aFloatArray21[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray21[0];
		this.aFloatArray22[1] = -this.aFloatArray21[1];
		this.aFloatArray22[2] = -this.aFloatArray21[2];
		this.method6367();
		this.anInt781 = (int) (arg3 * 256.0F / arg4);
		this.anInt769 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afm", name = "lz", descriptor = "(I)V")
	@Override
	public void method21051(@OriginalArg(0) int arg0) {
		this.anInt772 = 0;
		while (arg0 > 1) {
			this.anInt772++;
			arg0 >>= 0x1;
		}
		this.anInt771 = 0x1 << this.anInt772;
	}

	@OriginalMember(owner = "client!afm", name = "aai", descriptor = "(I)V")
	synchronized void method6436(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_8.method232(local4, 1128662335);
	}

	@OriginalMember(owner = "client!afm", name = "ls", descriptor = "(Lclient!pm;)V")
	@Override
	public void method20792(@OriginalArg(0) Class487 arg0) {
		this.aClass487_24.method30075(arg0);
		this.method6360();
		this.method6359();
	}

	@OriginalMember(owner = "client!afm", name = "lp", descriptor = "(III)V")
	@Override
	public void method20845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt800 == arg0 && this.anInt801 == arg1 && this.anInt802 == arg2) {
			return;
		}
		this.anInt800 = arg0;
		this.anInt801 = arg1;
		this.anInt802 = arg2;
		this.method6346();
		this.method6509();
	}

	@OriginalMember(owner = "client!afm", name = "lc", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20976(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean150 && this.aBoolean141) {
			@Pc(11) Class106_Sub1_Sub1 local11 = null;
			@Pc(14) Class106_Sub1 local14 = (Class106_Sub1) arg0;
			@Pc(17) Class106_Sub1 local17 = (Class106_Sub1) arg1;
			@Pc(20) Class84_Sub2 local20 = local14.method18209();
			@Pc(23) Class84_Sub2 local23 = local17.method18209();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt300 > local23.anInt300 ? local20.anInt300 : local23.anInt300;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class106_Sub1_Sub1) {
					@Pc(50) Class106_Sub1_Sub1 local50 = (Class106_Sub1_Sub1) arg3;
					if (local50.method18199() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class106_Sub1_Sub1(this, local38);
				}
				if (local11.method18198(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afm", name = "ma", descriptor = "(FFFFF)V")
	@Override
	public void method20996(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class80_Sub2_Sub2.aFloat193 = arg0;
		Class80_Sub2_Sub2.aFloat192 = arg1;
		Class80_Sub2_Sub2.aFloat196 = arg2;
		Class80_Sub2_Sub2.aFloat194 = arg3;
		Class80_Sub2_Sub2.aFloat195 = arg4;
	}

	@OriginalMember(owner = "client!afm", name = "lu", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20978(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean150 && this.aBoolean141) {
			@Pc(11) Class106_Sub1_Sub1 local11 = null;
			@Pc(14) Class106_Sub1 local14 = (Class106_Sub1) arg0;
			@Pc(17) Class106_Sub1 local17 = (Class106_Sub1) arg1;
			@Pc(20) Class84_Sub2 local20 = local14.method18209();
			@Pc(23) Class84_Sub2 local23 = local17.method18209();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt300 > local23.anInt300 ? local20.anInt300 : local23.anInt300;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class106_Sub1_Sub1) {
					@Pc(50) Class106_Sub1_Sub1 local50 = (Class106_Sub1_Sub1) arg3;
					if (local50.method18199() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class106_Sub1_Sub1(this, local38);
				}
				if (local11.method18198(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afm", name = "lw", descriptor = "(Lclient!df;)V")
	@Override
	public void method20983(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_1 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afm", name = "aaw", descriptor = "(II)V")
	synchronized void method6437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_10.method232(local4, 987697656);
	}

	@OriginalMember(owner = "client!afm", name = "la", descriptor = "(Lclient!df;)V")
	@Override
	public void method20971(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_1 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afm", name = "lb", descriptor = "(Lclient!df;)V")
	@Override
	public void method20982(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_1 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afm", name = "ln", descriptor = "(IIII)V")
	@Override
	public void method21107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24932(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afm", name = "ih", descriptor = "(IIIIII)V")
	@Override
	public void method20855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method6380();
		this.method6370(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean144) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean144) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afm", name = "lq", descriptor = "(IIII)V")
	@Override
	public void method20985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24932(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afm", name = "lf", descriptor = "(II)V")
	@Override
	public void method20974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24939(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afm", name = "kh", descriptor = "()Lclient!pm;")
	@Override
	public Class487 method20663() {
		return this.aClass487_21;
	}

	@OriginalMember(owner = "client!afm", name = "me", descriptor = "()Z")
	@Override
	public boolean method20959() {
		return this.aClass201_1 == null ? false : this.aClass201_1.method24935();
	}

	@OriginalMember(owner = "client!afm", name = "mp", descriptor = "()Z")
	@Override
	public boolean method20989() {
		return this.aClass201_1 == null ? false : this.aClass201_1.method24935();
	}

	@OriginalMember(owner = "client!afm", name = "mj", descriptor = "()Z")
	@Override
	public boolean method21058() {
		return this.aClass80_Sub2_Sub2_1 != null && this.aClass80_Sub2_Sub2_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "my", descriptor = "()Z")
	@Override
	public boolean method20991() {
		return this.aClass80_Sub2_Sub2_1 != null && this.aClass80_Sub2_Sub2_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "mh", descriptor = "()Z")
	@Override
	public boolean method20925() {
		return this.aClass80_Sub2_Sub2_1 != null && this.aClass80_Sub2_Sub2_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "il", descriptor = "(II)V")
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6545(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!afm", name = "ut", descriptor = "(I)V")
	synchronized void method6438(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_14.method232(local3, 841306825);
	}

	@OriginalMember(owner = "client!afm", name = "xd", descriptor = "()Lclient!adr;")
	Class84_Sub2 method6439() {
		return this.aClass106_Sub1_1 == null ? null : this.aClass106_Sub1_1.method18209();
	}

	@OriginalMember(owner = "client!afm", name = "cw", descriptor = "(ILclient!cg;II)V")
	@Override
	public void method20748(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg1;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local2.aClass84_Sub1_Sub1_1);
		this.method6370(1);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2598;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt784 - arg2), local37 * (float) (this.anInt782 - arg3));
		OpenGL.glVertex2i(this.anInt784, this.anInt782);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt784 - arg2), local37 * (float) (this.anInt783 - arg3));
		OpenGL.glVertex2i(this.anInt784, this.anInt783);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt766 - arg2), local37 * (float) (this.anInt783 - arg3));
		OpenGL.glVertex2i(this.anInt766, this.anInt783);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt766 - arg2), local37 * (float) (this.anInt782 - arg3));
		OpenGL.glVertex2i(this.anInt766, this.anInt782);
		OpenGL.glEnd();
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "kf", descriptor = "()I")
	@Override
	public int method20950() {
		return 4;
	}

	@OriginalMember(owner = "client!afm", name = "md", descriptor = "([I)Lclient!cz;")
	@Override
	public Class97 method20998(@OriginalArg(0) int[] arg0) {
		return new Class97_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "mu", descriptor = "()Z")
	@Override
	public boolean method20999() {
		return this.aClass80_Sub2_Sub1_1 != null && this.aClass80_Sub2_Sub1_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "mg", descriptor = "()Z")
	@Override
	public boolean method21000() {
		return this.aClass80_Sub2_Sub1_1 != null && this.aClass80_Sub2_Sub1_1.method21642();
	}

	@OriginalMember(owner = "client!afm", name = "mv", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public void method21001(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
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
		Class80_Sub2_Sub1.aClass97_Sub2Array1[0] = (Class97_Sub2) arg0;
		Class80_Sub2_Sub1.aFloatArray58[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[1] = (Class97_Sub2) arg2;
		Class80_Sub2_Sub1.aFloatArray58[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[2] = (Class97_Sub2) arg4;
		Class80_Sub2_Sub1.aFloatArray58[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.anInt2865 = local1;
		Class80_Sub2_Sub1.aFloat189 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afm", name = "be", descriptor = "(II)V")
	@Override
	public void method20714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6545(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!afm", name = "ml", descriptor = "(Lclient!cz;FLclient!cz;FLclient!cz;F)V")
	@Override
	public void method21120(@OriginalArg(0) Class97 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) float arg5) {
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
		Class80_Sub2_Sub1.aClass97_Sub2Array1[0] = (Class97_Sub2) arg0;
		Class80_Sub2_Sub1.aFloatArray58[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[1] = (Class97_Sub2) arg2;
		Class80_Sub2_Sub1.aFloatArray58[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.aClass97_Sub2Array1[2] = (Class97_Sub2) arg4;
		Class80_Sub2_Sub1.aFloatArray58[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class80_Sub2_Sub1.anInt2865 = local1;
		Class80_Sub2_Sub1.aFloat189 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afm", name = "hl", descriptor = "()V")
	@Override
	public void method20960() {
		if (this.aClass108_6 == null) {
			return;
		}
		this.anInt784 = 0;
		this.anInt782 = 0;
		this.anInt766 = this.aClass108_6.method24036();
		this.anInt783 = this.aClass108_6.method24037();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afm", name = "tl", descriptor = "(I)I")
	int method6440(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afm", name = "mx", descriptor = "()V")
	@Override
	public void method21006() {
		if (this.aClass80_Sub2_Sub3_1 != null && this.aClass80_Sub2_Sub3_1.method21642()) {
			this.aClass201_1.method24940(this.aClass80_Sub2_Sub3_1);
			this.aClass202_1.method24964();
		}
	}

	@OriginalMember(owner = "client!afm", name = "pw", descriptor = "()I")
	@Override
	public int method20769() {
		return this.anInt775 + this.anInt774 + this.anInt755;
	}

	@OriginalMember(owner = "client!afm", name = "cb", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public Class98 method21103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub1.method2136(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "xw", descriptor = "()Lclient!adr;")
	Class84_Sub2 method6441() {
		return this.aClass106_Sub1_1 == null ? null : this.aClass106_Sub1_1.method18209();
	}

	@OriginalMember(owner = "client!afm", name = "mb", descriptor = "(ILclient!dp;)V")
	@Override
	public void method21010(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		if (!this.aBoolean151) {
			throw new RuntimeException("");
		}
		this.anInt814 = arg0;
		this.aClass229_2 = arg1;
		if (this.aBoolean136) {
			this.aClass191_1.aClass96_Sub7_1.method2734();
			this.aClass191_1.aClass96_Sub7_1.method2732();
		}
	}

	@OriginalMember(owner = "client!afm", name = "mm", descriptor = "()V")
	@Override
	public void method21011() {
		this.aBoolean151 = false;
	}

	@OriginalMember(owner = "client!afm", name = "ds", descriptor = "(IFFFFF)V")
	@Override
	public void method20765(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt793 != arg0;
		if (local7 || this.aFloat67 != arg1 || this.aFloat68 != arg2) {
			this.anInt793 = arg0;
			this.aFloat67 = arg1;
			this.aFloat68 = arg2;
			if (local7) {
				this.aFloat66 = (float) (this.anInt793 & 0xFF0000) / 1.671168E7F;
				this.aFloat74 = (float) (this.anInt793 & 0xFF00) / 65280.0F;
				this.aFloat65 = (float) (this.anInt793 & 0xFF) / 255.0F;
				this.method6512();
			}
			this.method6366();
		}
		if (this.aFloatArray19[0] == arg3 && this.aFloatArray19[1] == arg4 && this.aFloatArray19[2] == arg5) {
			return;
		}
		this.aFloatArray19[0] = arg3;
		this.aFloatArray19[1] = arg4;
		this.aFloatArray19[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray21[0] = arg3 * local132;
		this.aFloatArray21[1] = arg4 * local132;
		this.aFloatArray21[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray21[0];
		this.aFloatArray22[1] = -this.aFloatArray21[1];
		this.aFloatArray22[2] = -this.aFloatArray21[2];
		this.method6367();
		this.anInt781 = (int) (arg3 * 256.0F / arg4);
		this.anInt769 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afm", name = "nv", descriptor = "()V")
	@Override
	public void method21013() {
		this.aBoolean151 = false;
	}

	@OriginalMember(owner = "client!afm", name = "nz", descriptor = "()V")
	@Override
	public void method21014() {
		this.aBoolean151 = false;
	}

	@OriginalMember(owner = "client!afm", name = "ja", descriptor = "(II[I[I)Lclient!cg;")
	@Override
	public Class98 method20931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class98_Sub1.method2136(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "ne", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public void method21016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method6380();
		this.method6370(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "nl", descriptor = "(IIFIIFIIFIIII)V")
	@Override
	public void method21057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method6380();
		this.method6370(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "no", descriptor = "(FFF[F)V")
	@Override
	public void method21096(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat59 * local59 / local29;
		arg3[1] = this.aFloat60 + this.aFloat73 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afm", name = "nt", descriptor = "(FFF[F)V")
	@Override
	public void method21110(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat59 * local59 / local29;
		arg3[1] = this.aFloat60 + this.aFloat73 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afm", name = "nc", descriptor = "(FFF[F)V")
	@Override
	public void method21020(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat59 * local59 / local29;
		arg3[1] = this.aFloat60 + this.aFloat73 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afm", name = "nw", descriptor = "(FFF[F)V")
	@Override
	public void method21021(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		@Pc(89) float local89 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		@Pc(119) float local119 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat59 * local59 / local29;
		arg3[1] = this.aFloat60 + this.aFloat73 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afm", name = "np", descriptor = "(FFF[F)V")
	@Override
	public void method21022(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * arg0 + this.aClass487_25.aFloatArray114[6] * arg1 + this.aClass487_25.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat59 * local115 / local59;
			arg3[1] = this.aFloat60 + this.aFloat73 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afm", name = "nq", descriptor = "(FFF[F)V")
	@Override
	public void method21023(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * arg0 + this.aClass487_25.aFloatArray114[6] * arg1 + this.aClass487_25.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat59 * local115 / local59;
			arg3[1] = this.aFloat60 + this.aFloat73 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afm", name = "nh", descriptor = "(FFF[F)V")
	@Override
	public void method21024(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass487_25.aFloatArray114[14] + this.aClass487_25.aFloatArray114[2] * arg0 + this.aClass487_25.aFloatArray114[6] * arg1 + this.aClass487_25.aFloatArray114[10] * arg2;
		@Pc(59) float local59 = this.aClass487_25.aFloatArray114[15] + this.aClass487_25.aFloatArray114[3] * arg0 + this.aClass487_25.aFloatArray114[7] * arg1 + this.aClass487_25.aFloatArray114[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass487_25.aFloatArray114[12] + this.aClass487_25.aFloatArray114[0] * arg0 + this.aClass487_25.aFloatArray114[4] * arg1 + this.aClass487_25.aFloatArray114[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass487_25.aFloatArray114[13] + this.aClass487_25.aFloatArray114[1] * arg0 + this.aClass487_25.aFloatArray114[5] * arg1 + this.aClass487_25.aFloatArray114[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass487_28.aFloatArray114[14] + this.aClass487_28.aFloatArray114[2] * arg0 + this.aClass487_28.aFloatArray114[6] * arg1 + this.aClass487_28.aFloatArray114[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat59 * local115 / local59;
			arg3[1] = this.aFloat60 + this.aFloat73 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ng", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method20918() {
		return new Class108_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!afm", name = "nr", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method21018() {
		return new Class108_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!afm", name = "na", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method21126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class80_Sub1_Sub3(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!afm", name = "ny", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method21028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class80_Sub1_Sub3(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!afm", name = "ni", descriptor = "()Z")
	@Override
	public boolean method21032() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "uy", descriptor = "()V")
	void method6442() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!afm", name = "uw", descriptor = "()V")
	void method6443() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!afm", name = "ux", descriptor = "()I")
	int method6444() {
		@Pc(1) int local1 = 0;
		this.aString26 = OpenGL.glGetString(7936).toLowerCase();
		this.aString25 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString26.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString26.indexOf("brian paul") != -1 || this.aString26.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class313.method27482(local40.replace('.', ' '), ' ', 2036747717);
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class679.method33621(local48[0], -1725638445);
				@Pc(64) int local64 = Class679.method33621(local48[1], -660090019);
				this.anInt815 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt815 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.t("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.t("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt809 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt803 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt810 = local111[0];
		if (this.anInt809 < 2 || this.anInt803 < 2 || this.anInt810 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean129 = Stream.m();
		this.aBoolean146 = this.anOpenGL1.t("GL_ARB_vertex_buffer_object");
		this.aBoolean144 = this.anOpenGL1.t("GL_ARB_multisample");
		this.aBoolean153 = this.anOpenGL1.t("GL_ARB_vertex_program");
		this.aBoolean154 = this.anOpenGL1.t("GL_ARB_fragment_program");
		this.aBoolean137 = this.anOpenGL1.t("GL_ARB_vertex_shader");
		this.aBoolean155 = this.anOpenGL1.t("GL_ARB_fragment_shader");
		this.aBoolean138 = this.anOpenGL1.t("GL_EXT_texture3D");
		this.aBoolean149 = this.anOpenGL1.t("GL_ARB_texture_rectangle");
		this.aBoolean150 = this.anOpenGL1.t("GL_ARB_texture_cube_map");
		this.aBoolean127 = this.anOpenGL1.t("GL_ARB_seamless_cube_map");
		this.aBoolean159 = this.anOpenGL1.t("GL_ARB_texture_float");
		this.aBoolean152 = this.anOpenGL1.t("GL_ARB_texture_non_power_of_two");
		this.aBoolean141 = this.anOpenGL1.t("GL_EXT_framebuffer_object");
		this.aBoolean142 = this.anOpenGL1.t("GL_EXT_framebuffer_blit");
		this.aBoolean143 = this.anOpenGL1.t("GL_EXT_framebuffer_multisample");
		this.aBoolean145 = this.aBoolean142 & this.aBoolean143;
		this.aBoolean156 = this.anOpenGL1.t("GL_EXT_blend_func_separate");
		this.aBoolean148 = this.anUnsafe2 != null && (this.anInt815 >= 32 || this.anOpenGL1.t("GL_ARB_sync"));
		this.aBoolean140 = Class531.aString220.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray24, 0);
		this.aFloat75 = aFloatArray24[0];
		this.aFloat57 = aFloatArray24[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!afm", name = "sx", descriptor = "(I[BIZ)Lclient!ca;")
	Interface15 method6445(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface15) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub1(this, arg0, arg1, arg2, arg3) : new Class94_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afm", name = "vx", descriptor = "()I")
	int method6446() {
		@Pc(1) int local1 = 0;
		this.aString26 = OpenGL.glGetString(7936).toLowerCase();
		this.aString25 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString26.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString26.indexOf("brian paul") != -1 || this.aString26.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class313.method27482(local40.replace('.', ' '), ' ', 2036747717);
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class679.method33621(local48[0], -1514525096);
				@Pc(64) int local64 = Class679.method33621(local48[1], 1065720610);
				this.anInt815 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt815 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.t("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.t("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt809 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt803 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt810 = local111[0];
		if (this.anInt809 < 2 || this.anInt803 < 2 || this.anInt810 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean129 = Stream.m();
		this.aBoolean146 = this.anOpenGL1.t("GL_ARB_vertex_buffer_object");
		this.aBoolean144 = this.anOpenGL1.t("GL_ARB_multisample");
		this.aBoolean153 = this.anOpenGL1.t("GL_ARB_vertex_program");
		this.aBoolean154 = this.anOpenGL1.t("GL_ARB_fragment_program");
		this.aBoolean137 = this.anOpenGL1.t("GL_ARB_vertex_shader");
		this.aBoolean155 = this.anOpenGL1.t("GL_ARB_fragment_shader");
		this.aBoolean138 = this.anOpenGL1.t("GL_EXT_texture3D");
		this.aBoolean149 = this.anOpenGL1.t("GL_ARB_texture_rectangle");
		this.aBoolean150 = this.anOpenGL1.t("GL_ARB_texture_cube_map");
		this.aBoolean127 = this.anOpenGL1.t("GL_ARB_seamless_cube_map");
		this.aBoolean159 = this.anOpenGL1.t("GL_ARB_texture_float");
		this.aBoolean152 = this.anOpenGL1.t("GL_ARB_texture_non_power_of_two");
		this.aBoolean141 = this.anOpenGL1.t("GL_EXT_framebuffer_object");
		this.aBoolean142 = this.anOpenGL1.t("GL_EXT_framebuffer_blit");
		this.aBoolean143 = this.anOpenGL1.t("GL_EXT_framebuffer_multisample");
		this.aBoolean145 = this.aBoolean142 & this.aBoolean143;
		this.aBoolean156 = this.anOpenGL1.t("GL_EXT_blend_func_separate");
		this.aBoolean148 = this.anUnsafe2 != null && (this.anInt815 >= 32 || this.anOpenGL1.t("GL_ARB_sync"));
		this.aBoolean140 = Class531.aString220.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray24, 0);
		this.aFloat75 = aFloatArray24[0];
		this.aFloat57 = aFloatArray24[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!afm", name = "px", descriptor = "()Z")
	@Override
	public boolean method21070() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "vi", descriptor = "()V")
	void method6447() {
		this.method6384(-2);
		for (@Pc(7) int local7 = this.anInt809 - 1; local7 >= 0; local7--) {
			this.method6386(local7);
			this.method6339(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6389(8448, 8448);
		this.method6390(2, 34168, 770);
		this.method6364();
		this.anInt778 = 1;
		this.anInt753 = 0;
		this.aBoolean158 = true;
		if (this.aBoolean156) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt779 = 1;
		this.aByte3 = -1;
		this.method6388((byte) 0);
		this.aBoolean130 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte3);
		if (this.aBoolean144) {
			if (this.anInt773 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean128 = true;
		this.method6424(true);
		this.method6429(true);
		this.method6399(true);
		this.method6545(true);
		this.method20708(0.0F, 1.0F);
		this.method6356();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6410(this.anInt780);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(155) float[] local155 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(157) int local157 = 0; local157 < 8; local157++) {
			@Pc(164) int local164 = local157 + 16384;
			OpenGL.glLightfv(local164, 4608, local155, 0);
			OpenGL.glLightf(local164, 4615, 0.0F);
			OpenGL.glLightf(local164, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean127) {
			OpenGL.glEnable(34895);
		}
		this.anInt800 = -1;
		this.anInt793 = -1;
		this.method20705();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "ad", descriptor = "()V")
	@Override
	public void method20894() {
		if (!this.aBoolean157 || this.aClass108_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt784;
		@Pc(12) int local12 = this.anInt766;
		@Pc(15) int local15 = this.anInt782;
		@Pc(18) int local18 = this.anInt783;
		this.method20877();
		@Pc(23) int local23 = this.anInt788;
		@Pc(26) int local26 = this.anInt789;
		@Pc(29) int local29 = this.anInt765;
		@Pc(32) int local32 = this.anInt790;
		this.method20705();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6356();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6339(null);
		this.method6384(-2);
		this.method6543(1);
		this.method6370(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20986(local9, local15, local12, local18);
		this.method20706(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afm", name = "xq", descriptor = "(Lclient!ca;)V")
	void method6448(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_1 != arg0) {
			if (this.aBoolean146) {
				OpenGL.glBindBufferARB(34963, arg0.method2088());
			}
			this.anInterface15_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "gy", descriptor = "()Z")
	@Override
	public boolean method20853() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "nd", descriptor = "()Z")
	@Override
	public boolean method21033() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "nn", descriptor = "()Z")
	@Override
	public boolean method21034() {
		return this.aClass80_Sub2_Sub3_1 != null && (this.anInt773 <= 1 || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "nf", descriptor = "()Z")
	@Override
	public boolean method21056() {
		return this.aClass80_Sub2_Sub3_1 != null && (this.anInt773 <= 1 || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "ft", descriptor = "()[I")
	@Override
	public int[] method20828() {
		@Pc(2) int[] local2 = new int[1];
		OpenGL.glGetIntegerv(34466, local2, 0);
		@Pc(10) int local10 = local2[0];
		if (local10 == 0) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[local10];
			OpenGL.glGetIntegerv(34467, local17, 0);
			return local17;
		}
	}

	@OriginalMember(owner = "client!afm", name = "vo", descriptor = "()Z")
	boolean method6449() {
		return this.aClass191_1.method24833(3);
	}

	@OriginalMember(owner = "client!afm", name = "zv", descriptor = "(III)V")
	void method6450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "wn", descriptor = "()V")
	void method6451() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass487_28.aFloatArray114, 0);
		if (this.aBoolean136) {
			this.aClass191_1.aClass96_Sub7_1.method2734();
		}
		this.method6367();
		this.method6362();
	}

	@OriginalMember(owner = "client!afm", name = "gq", descriptor = "()I")
	@Override
	public int method20869() {
		if (!this.aBoolean148) {
			return -1;
		} else if (this.aLongArray7[this.anInt817] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt817], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray68[this.anInt817];
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "wl", descriptor = "()V")
	void method6452() {
		if (this.aClass108_6 == null || this.anInt784 >= this.anInt766 || this.anInt782 >= this.anInt783) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt786 + this.anInt784, this.anInt787 + this.aClass108_6.method24037() - this.anInt783, this.anInt766 - this.anInt784, this.anInt783 - this.anInt782);
		}
	}

	@OriginalMember(owner = "client!afm", name = "vq", descriptor = "()V")
	void method6453() {
		this.method6334();
	}

	@OriginalMember(owner = "client!afm", name = "yb", descriptor = "(I)V")
	void method6454(@OriginalArg(0) int arg0) {
		this.method6385(arg0, true);
	}

	@OriginalMember(owner = "client!afm", name = "vc", descriptor = "()V")
	void method6455() {
		@Pc(3) int local3 = this.aClass108_6.method24036();
		@Pc(7) int local7 = this.aClass108_6.method24037();
		this.aClass487_29.method30087(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20705();
		this.method6356();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "vk", descriptor = "()V")
	void method6456() {
		@Pc(3) int local3 = this.aClass108_6.method24036();
		@Pc(7) int local7 = this.aClass108_6.method24037();
		this.aClass487_29.method30087(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20705();
		this.method6356();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "vw", descriptor = "(II)V")
	void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20683();
		this.method20703(arg0, arg1, (byte) 55);
		if (!this.aBoolean148) {
			this.aClass99_6 = this.method20739(arg0, arg1, true, true);
			this.aClass108_Sub1_2 = this.method20687();
			this.aClass108_Sub1_2.method23903(0, this.aClass99_6.method18231());
			return;
		}
		this.aClass99_6 = this.method20739(arg0, arg1, true, true);
		this.aClass108_Sub1_2 = this.method20687();
		this.aClass108_Sub1_2.method23903(0, this.aClass99_6.method18231());
		OpenGL.glGenBuffersARB(3, this.anIntArray64, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray64[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fo", descriptor = "()Z")
	@Override
	public boolean method20821() {
		return this.aBoolean144 && (!this.method20784() || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "fi", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	@Override
	Class108_Sub2 method20980(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class108_Sub2_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "ns", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public Class99 method21039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class99_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "nb", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public Class99 method21040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class99_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "nj", descriptor = "(II)I")
	@Override
	public int method21041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afm", name = "ot", descriptor = "(II[[I[[IIII)Lclient!cb;")
	@Override
	public Class100 method21042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class100_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afm", name = "ol", descriptor = "(ILclient!dp;)V")
	@Override
	public void method21111(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		this.anInt814 = arg0;
		this.aClass229_2 = arg1;
		this.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!afm", name = "ok", descriptor = "(ILclient!dp;)V")
	@Override
	public void method21044(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1) {
		this.anInt814 = arg0;
		this.aClass229_2 = arg1;
		this.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!afm", name = "vt", descriptor = "(II)V")
	void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt786 = arg0;
		this.anInt787 = arg1;
		this.method6495();
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "vy", descriptor = "(II)V")
	void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt786 = arg0;
		this.anInt787 = arg1;
		this.method6495();
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "vj", descriptor = "(II)V")
	void method6460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt786 = arg0;
		this.anInt787 = arg1;
		this.method6495();
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "vv", descriptor = "(II)V")
	void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt786 = arg0;
		this.anInt787 = arg1;
		this.method6495();
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "vn", descriptor = "(II)V")
	void method6462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt786 = arg0;
		this.anInt787 = arg1;
		this.method6495();
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "vp", descriptor = "()V")
	void method6463() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt730 == 2) {
			local9 = this.anInt788;
			local12 = this.anInt789;
			local15 = this.anInt765;
			local18 = this.anInt790;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass108_6.method24036();
			local18 = this.aClass108_6.method24037();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt786 + local9, this.anInt787 + this.aClass108_6.method24037() - local12 - local18, local15, local18);
		this.aFloat59 = (float) this.anInt765 / 2.0F;
		this.aFloat73 = (float) this.anInt790 / 2.0F;
		this.aFloat58 = (float) this.anInt788 + this.aFloat59;
		this.aFloat60 = (float) this.anInt789 + this.aFloat73;
	}

	@OriginalMember(owner = "client!afm", name = "va", descriptor = "()V")
	void method6464() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt730 == 2) {
			local9 = this.anInt788;
			local12 = this.anInt789;
			local15 = this.anInt765;
			local18 = this.anInt790;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass108_6.method24036();
			local18 = this.aClass108_6.method24037();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt786 + local9, this.anInt787 + this.aClass108_6.method24037() - local12 - local18, local15, local18);
		this.aFloat59 = (float) this.anInt765 / 2.0F;
		this.aFloat73 = (float) this.anInt790 / 2.0F;
		this.aFloat58 = (float) this.anInt788 + this.aFloat59;
		this.aFloat60 = (float) this.anInt789 + this.aFloat73;
	}

	@OriginalMember(owner = "client!afm", name = "vm", descriptor = "()V")
	void method6465() {
		if (this.anInt730 == 2) {
			OpenGL.glDepthRange(this.aFloat61, this.aFloat62);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afm", name = "bm", descriptor = "(IIIII)V")
	@Override
	void method20922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6380();
		this.method6370(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "vg", descriptor = "()V")
	void method6466() {
		if (this.aClass108_6 == null || this.anInt784 >= this.anInt766 || this.anInt782 >= this.anInt783) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt786 + this.anInt784, this.anInt787 + this.aClass108_6.method24037() - this.anInt783, this.anInt766 - this.anInt784, this.anInt783 - this.anInt782);
		}
	}

	@OriginalMember(owner = "client!afm", name = "xa", descriptor = "()V")
	void method6467() {
		if (this.aBoolean134 && this.anInt801 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!afm", name = "aat", descriptor = "(I)V")
	void method6468(@OriginalArg(0) int arg0) {
		this.anInt780 = arg0;
		if (this.anInt780 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt780 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt780 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afm", name = "wa", descriptor = "()V")
	void method6469() {
		this.aClass487_25.method30075(this.aClass487_28);
		this.aClass487_25.method30078(this.aClass487_24);
		this.aClass487_25.method30099(this.aFloatArrayArray12[0]);
		this.aClass487_25.method30100(this.aFloatArrayArray12[1]);
		this.aClass487_25.method30095(this.aFloatArrayArray12[2]);
		this.aClass487_25.method30096(this.aFloatArrayArray12[3]);
		this.aClass487_25.method30097(this.aFloatArrayArray12[4]);
		this.aClass487_25.method30098(this.aFloatArrayArray12[5]);
	}

	@OriginalMember(owner = "client!afm", name = "wh", descriptor = "(Lclient!pm;)V")
	void method6470(@OriginalArg(0) Class487 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!afm", name = "wg", descriptor = "(Lclient!pm;)V")
	void method6471(@OriginalArg(0) Class487 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!afm", name = "wk", descriptor = "()V")
	void method6472() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!afm", name = "fj", descriptor = "()Z")
	@Override
	public boolean method20747() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "wp", descriptor = "()V")
	void method6473() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass487_28.aFloatArray114, 0);
		if (this.aBoolean136) {
			this.aClass191_1.aClass96_Sub7_1.method2734();
		}
		this.method6367();
		this.method6362();
	}

	@OriginalMember(owner = "client!afm", name = "ie", descriptor = "(IIIIII)V")
	@Override
	public void method20889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6380();
		this.method6370(arg5);
		@Pc(10) float local10 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local40;
			local16 *= local40;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local10 + 0.35F, (float) arg3 + local16 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afm", name = "wc", descriptor = "()V")
	void method6474() {
		if (this.anInt730 != 0) {
			this.anInt730 = 0;
			this.method6495();
			this.method6363();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "q", descriptor = "()Z")
	@Override
	public boolean method20791() {
		return this.aClass80_Sub2_Sub3_1 != null && (this.anInt773 <= 1 || this.aBoolean145);
	}

	@OriginalMember(owner = "client!afm", name = "wo", descriptor = "()V")
	void method6475() {
		if (this.anInt730 == 1) {
			return;
		}
		this.anInt730 = 1;
		this.method6359();
		this.method6495();
		this.method6363();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt777 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afm", name = "wq", descriptor = "()V")
	void method6476() {
		this.aFloat64 = this.aClass487_24.method30143();
		this.aFloat63 = this.aClass487_24.method30093();
		this.method6346();
		if (this.anInt730 == 2) {
			this.method6361(this.aClass487_24.aFloatArray114);
		} else if (this.anInt730 == 1) {
			this.method6361(this.aClass487_29.aFloatArray114);
		}
	}

	@OriginalMember(owner = "client!afm", name = "wz", descriptor = "()V")
	void method6477() {
		this.aFloat64 = this.aClass487_24.method30143();
		this.aFloat63 = this.aClass487_24.method30093();
		this.method6346();
		if (this.anInt730 == 2) {
			this.method6361(this.aClass487_24.aFloatArray114);
		} else if (this.anInt730 == 1) {
			this.method6361(this.aClass487_29.aFloatArray114);
		}
	}

	@OriginalMember(owner = "client!afm", name = "cd", descriptor = "(IIIIIIIII)V")
	@Override
	public void method20729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method6380();
		this.method6370(arg5);
		@Pc(17) float local17 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
		@Pc(40) float local40 = local17 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(65) int local65 = arg8 % (arg7 + arg6);
		@Pc(70) float local70 = local40 * (float) arg6;
		@Pc(75) float local75 = local44 * (float) arg6;
		@Pc(77) float local77 = 0.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(81) float local81 = local70;
		@Pc(83) float local83 = local75;
		if (local65 > arg6) {
			local77 = local40 * (float) (arg6 + arg7 - local65);
			local79 = local44 * (float) (arg6 + arg7 - local65);
		} else {
			local81 = local40 * (float) (arg6 - local65);
			local83 = local44 * (float) (arg6 - local65);
		}
		@Pc(126) float local126 = (float) arg0 + 0.35F + local77;
		@Pc(133) float local133 = (float) arg1 + 0.35F + local79;
		@Pc(138) float local138 = local40 * (float) arg7;
		@Pc(143) float local143 = local44 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local126 > (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 > (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			} else {
				if (local126 < (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 < (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 > (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 < (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local126, local133);
			OpenGL.glVertex2f(local126 + local81, local133 + local83);
			OpenGL.glEnd();
			local126 += local138 + local81;
			local133 += local143 + local83;
			local81 = local70;
			local83 = local75;
		}
	}

	@OriginalMember(owner = "client!afm", name = "we", descriptor = "()V")
	void method6478() {
		this.aFloat64 = this.aClass487_24.method30143();
		this.aFloat63 = this.aClass487_24.method30093();
		this.method6346();
		if (this.anInt730 == 2) {
			this.method6361(this.aClass487_24.aFloatArray114);
		} else if (this.anInt730 == 1) {
			this.method6361(this.aClass487_29.aFloatArray114);
		}
	}

	@OriginalMember(owner = "client!afm", name = "wv", descriptor = "()V")
	void method6479() {
		this.aFloat64 = this.aClass487_24.method30143();
		this.aFloat63 = this.aClass487_24.method30093();
		this.method6346();
		if (this.anInt730 == 2) {
			this.method6361(this.aClass487_24.aFloatArray114);
		} else if (this.anInt730 == 1) {
			this.method6361(this.aClass487_29.aFloatArray114);
		}
	}

	@OriginalMember(owner = "client!afm", name = "ms", descriptor = "(FFFFFF)V")
	@Override
	void method21009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class80_Sub2_Sub3.aFloat221 = arg0;
		Class80_Sub2_Sub3.aFloat220 = arg1;
		Class80_Sub2_Sub3.aFloat219 = arg2;
	}

	@OriginalMember(owner = "client!afm", name = "p", descriptor = "()Z")
	@Override
	public boolean method20678() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "jk", descriptor = "(Lclient!ov;Lclient!eo;Lclient!oy;)V")
	@Override
	public void method20951(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class472 arg2) {
		@Pc(2) Class487 local2 = this.aClass487_26;
		local2.method30080(arg0);
		local2.method30078(this.aClass487_25);
		arg1.method26329(arg2, this.aClass487_24, local2, this.aFloat58, this.aFloat60, this.aFloat59, this.aFloat73);
	}

	@OriginalMember(owner = "client!afm", name = "ww", descriptor = "([F)V")
	void method6480(@OriginalArg(0) float[] arg0) {
		@Pc(2) float[] local2 = new float[16];
		System.arraycopy(arg0, 0, local2, 0, 16);
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(local2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afm", name = "ev", descriptor = "()Z")
	@Override
	public boolean method20822() {
		if (this.aClass80_Sub2_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub3_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub3_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "wy", descriptor = "()V")
	void method6481() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt797; local1++) {
			@Pc(10) Class80_Sub12 local10 = this.aClass80_Sub12Array2[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method13949((byte) 0);
			aFloatArray23[1] = local10.method13950(-1795650276);
			aFloatArray23[2] = local10.method13970(-2034087131);
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method13953((byte) 43);
			@Pc(54) float local54 = local10.method13954(1416904954) / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13952(-432544427) * local10.method13952(-432544427)));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt796) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt796 = this.anInt797;
	}

	@OriginalMember(owner = "client!afm", name = "eu", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20798() {
		@Pc(1) int local1 = -1;
		if (this.aString26.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString26.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString26.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, "OpenGL", this.anInt815, this.aString25, 0L, false);
	}

	@OriginalMember(owner = "client!afm", name = "hf", descriptor = "(J)V")
	@Override
	public void method20761(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!afm", name = "mc", descriptor = "(II)V")
	@Override
	public void method21002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass201_1 != null) {
			this.aClass201_1.method24939(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afm", name = "wi", descriptor = "(FF)V")
	void method6482(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat70 = arg0;
		this.aFloat71 = arg1;
		this.method6346();
	}

	@OriginalMember(owner = "client!afm", name = "wd", descriptor = "(FF)V")
	void method6483(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat70 = arg0;
		this.aFloat71 = arg1;
		this.method6346();
	}

	@OriginalMember(owner = "client!afm", name = "ci", descriptor = "(IIIIZ)Lclient!cm;")
	@Override
	public Class99 method20743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class99_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afm", name = "xo", descriptor = "()V")
	void method6484() {
		aFloatArray24[0] = this.aFloat67 * this.aFloat66;
		aFloatArray24[1] = this.aFloat67 * this.aFloat74;
		aFloatArray24[2] = this.aFloat67 * this.aFloat65;
		aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray24, 0);
		aFloatArray24[0] = -this.aFloat68 * this.aFloat66;
		aFloatArray24[1] = -this.aFloat68 * this.aFloat74;
		aFloatArray24[2] = -this.aFloat68 * this.aFloat65;
		aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "an", descriptor = "()Z")
	@Override
	public boolean method20694() {
		return !this.aBoolean148 || this.aLongArray7[this.anInt805] == 0L;
	}

	@OriginalMember(owner = "client!afm", name = "xe", descriptor = "()V")
	void method6485() {
		if (this.aBoolean134 && this.anInt801 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!afm", name = "xx", descriptor = "()V")
	void method6486() {
		if (this.aBoolean134 && this.anInt801 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!afm", name = "xm", descriptor = "()V")
	void method6487() {
		this.aFloat56 = this.aFloat64 - (float) this.anInt802 - this.aFloat71;
		this.aFloat69 = this.aFloat56 - (float) this.anInt801 * this.aFloat70;
		if (this.aFloat69 < this.aFloat63) {
			this.aFloat69 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat69);
		OpenGL.glFogf(2916, this.aFloat56);
		aFloatArray24[0] = (float) (this.anInt800 & 0xFF0000) / 1.671168E7F;
		aFloatArray24[1] = (float) (this.anInt800 & 0xFF00) / 65280.0F;
		aFloatArray24[2] = (float) (this.anInt800 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "xb", descriptor = "()V")
	void method6488() {
		this.aFloat56 = this.aFloat64 - (float) this.anInt802 - this.aFloat71;
		this.aFloat69 = this.aFloat56 - (float) this.anInt801 * this.aFloat70;
		if (this.aFloat69 < this.aFloat63) {
			this.aFloat69 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat69);
		OpenGL.glFogf(2916, this.aFloat56);
		aFloatArray24[0] = (float) (this.anInt800 & 0xFF0000) / 1.671168E7F;
		aFloatArray24[1] = (float) (this.anInt800 & 0xFF00) / 65280.0F;
		aFloatArray24[2] = (float) (this.anInt800 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "of", descriptor = "(I)Lclient!df;")
	@Override
	public Class106 method21047(@OriginalArg(0) int arg0) {
		return this.aBoolean150 ? new Class106_Sub1_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!afm", name = "gr", descriptor = "()Z")
	@Override
	public boolean method20850() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "yx", descriptor = "()V")
	void method6489() {
		if (this.anInt777 == 1) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6339(null);
		this.method6384(-2);
		this.method6543(1);
		this.method6388((byte) 0);
		this.anInt777 = 1;
	}

	@OriginalMember(owner = "client!afm", name = "xz", descriptor = "()Z")
	boolean method6490() {
		if (this.aClass80_Sub2_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub2_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub2_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "xh", descriptor = "()Z")
	boolean method6491() {
		if (this.aClass80_Sub2_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub2_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub2_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "xi", descriptor = "()Z")
	boolean method6492() {
		if (this.aClass80_Sub2_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub1_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub1_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "xr", descriptor = "()Z")
	boolean method6493() {
		if (this.aClass80_Sub2_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub1_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub1_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "xp", descriptor = "()Z")
	boolean method6494() {
		if (this.aClass80_Sub2_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub1_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub1_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ow", descriptor = "()Z")
	@Override
	public boolean method21035() {
		if (this.aClass80_Sub2_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub3_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub3_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "fa", descriptor = "()Z")
	@Override
	public boolean method20816() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "sg", descriptor = "()V")
	void method6495() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt730 == 2) {
			local9 = this.anInt788;
			local12 = this.anInt789;
			local15 = this.anInt765;
			local18 = this.anInt790;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass108_6.method24036();
			local18 = this.aClass108_6.method24037();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt786 + local9, this.anInt787 + this.aClass108_6.method24037() - local12 - local18, local15, local18);
		this.aFloat59 = (float) this.anInt765 / 2.0F;
		this.aFloat73 = (float) this.anInt790 / 2.0F;
		this.aFloat58 = (float) this.anInt788 + this.aFloat59;
		this.aFloat60 = (float) this.anInt789 + this.aFloat73;
	}

	@OriginalMember(owner = "client!afm", name = "id", descriptor = "(IIIII)V")
	@Override
	void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt784 || arg0 - arg2 > this.anInt766 || arg1 + arg2 < this.anInt782 || arg1 - arg2 > this.anInt783) {
			return;
		}
		this.method6380();
		this.method6370(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat75) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat57) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class548.method31273(local132, 1935685645);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class204.aFloatArray94[local157] * (float) arg2, local59 + Class204.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afm", name = "wu", descriptor = "()V")
	void method6496() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!afm", name = "mt", descriptor = "()V")
	@Override
	public void method21005() {
		if (this.aClass80_Sub2_Sub3_1 != null && this.aClass80_Sub2_Sub3_1.method21642()) {
			this.aClass201_1.method24940(this.aClass80_Sub2_Sub3_1);
			this.aClass202_1.method24964();
		}
	}

	@OriginalMember(owner = "client!afm", name = "ed", descriptor = "()V")
	@Override
	public void method20856() {
		if (this.aClass80_Sub2_Sub3_1 != null && this.aClass80_Sub2_Sub3_1.method21642()) {
			this.aClass201_1.method24940(this.aClass80_Sub2_Sub3_1);
			this.aClass202_1.method24964();
		}
	}

	@OriginalMember(owner = "client!afm", name = "s", descriptor = "()I")
	@Override
	public int method20911() {
		return this.anInt775 + this.anInt774 + this.anInt755;
	}

	@OriginalMember(owner = "client!afm", name = "xk", descriptor = "(I[BIZ)Lclient!bw;")
	Interface14 method6497(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub2(this, arg0, arg1, arg2, arg3) : new Class94_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afm", name = "xj", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bw;")
	Interface14 method6498(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub2(this, arg0, arg1, arg2, arg3) : new Class94_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afm", name = "xt", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bw;")
	Interface14 method6499(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean146 && (!arg3 || this.aBoolean147) ? new Class95_Sub2(this, arg0, arg1, arg2, arg3) : new Class94_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afm", name = "xs", descriptor = "(Lclient!ca;)V")
	void method6500(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_1 != arg0) {
			if (this.aBoolean146) {
				OpenGL.glBindBufferARB(34963, arg0.method2088());
			}
			this.anInterface15_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ce", descriptor = "(Lclient!akl;)V")
	@Override
	public void method20737(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap2 = ((Class80_Sub22_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) PacketGl local12 = new PacketGl(80);
		if (this.aBoolean129) {
			local12.method23420(-1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(-1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
		} else {
			local12.method23418(-1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(-1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
		}
		this.anInterface14_3 = this.method6375(20, local12.data, local12.pos * -1380987821, false);
		this.aClass189_5 = new Class189(this.anInterface14_3, 5126, 3, 0);
		this.aClass189_6 = new Class189(this.anInterface14_3, 5126, 2, 12);
		this.aClass209_1.method25789(this);
	}

	@OriginalMember(owner = "client!afm", name = "xy", descriptor = "(Lclient!ca;)V")
	void method6501(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_1 != arg0) {
			if (this.aBoolean146) {
				OpenGL.glBindBufferARB(34963, arg0.method2088());
			}
			this.anInterface15_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "xu", descriptor = "(Lclient!bm;Lclient!bm;Lclient!bm;Lclient!bm;)V")
	void method6502(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class189 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6377(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte105, arg0.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6377(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6377(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte105, arg2.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6377(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte105, arg3.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afm", name = "xc", descriptor = "(Lclient!bm;Lclient!bm;Lclient!bm;Lclient!bm;)V")
	void method6503(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class189 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6377(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte105, arg0.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6377(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6377(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte105, arg2.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6377(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte105, arg3.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afm", name = "aam", descriptor = "(J)V")
	synchronized void method6504(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_13.method232(local3, 588635211);
	}

	@OriginalMember(owner = "client!afm", name = "xv", descriptor = "(Lclient!ca;III)V")
	void method6505(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6435(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2093() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!afm", name = "vl", descriptor = "()V")
	void method6506() {
		if (this.aClass108_6 == null || this.anInt784 >= this.anInt766 || this.anInt782 >= this.anInt783) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt786 + this.anInt784, this.anInt787 + this.aClass108_6.method24037() - this.anInt783, this.anInt766 - this.anInt784, this.anInt783 - this.anInt782);
		}
	}

	@OriginalMember(owner = "client!afm", name = "mf", descriptor = "([I)Lclient!cz;")
	@Override
	public Class97 method20672(@OriginalArg(0) int[] arg0) {
		return new Class97_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afm", name = "fg", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20827() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt773 + local3;
		@Pc(27) String local27 = local15 + this.anInt812 + local3;
		@Pc(39) String local39 = local27 + this.anInt809 + local3;
		@Pc(51) String local51 = local39 + this.anInt803 + local3;
		@Pc(63) String local63 = local51 + this.anInt810 + local3;
		@Pc(75) String local75 = local63 + this.aFloat75 + local3;
		@Pc(87) String local87 = local75 + this.aFloat57 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean129 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean139 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean140 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean146 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean147 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean144 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean153 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean154 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean137 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean155 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean138 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean149 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean150 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean127 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean152 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean141 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean142 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean143 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean159 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean157 ? 1 : 0) + local3;
		return local407 + (this.aBoolean156 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afm", name = "yh", descriptor = "()V")
	void method6507() {
		if (this.anInt777 == 2) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6388((byte) 0);
		this.anInt777 = 2;
	}

	@OriginalMember(owner = "client!afm", name = "yj", descriptor = "()V")
	void method6508() {
		if (this.anInt777 == 2) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6388((byte) 0);
		this.anInt777 = 2;
	}

	@OriginalMember(owner = "client!afm", name = "su", descriptor = "()V")
	void method6509() {
		if (this.aBoolean134 && this.anInt801 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!afm", name = "yt", descriptor = "()V")
	void method6510() {
		if (this.anInt777 == 4) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6370(1);
		this.method6388((byte) 0);
		this.anInt777 = 4;
	}

	@OriginalMember(owner = "client!afm", name = "kr", descriptor = "(II)I")
	@Override
	public int method20937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afm", name = "cz", descriptor = "(Lclient!dt;IIII)Lclient!dn;")
	@Override
	public Class105 method20753(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class105_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "li", descriptor = "(III)V")
	@Override
	public void method20754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt800 == arg0 && this.anInt801 == arg1 && this.anInt802 == arg2) {
			return;
		}
		this.anInt800 = arg0;
		this.anInt801 = arg1;
		this.anInt802 = arg2;
		this.method6346();
		this.method6509();
	}

	@OriginalMember(owner = "client!afm", name = "gn", descriptor = "()V")
	@Override
	public void method21087() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray7[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local1]);
				this.aLongArray7[local1] = 0L;
			}
		}
		this.anInt805 = 0;
		this.anInt817 = 0;
	}

	@OriginalMember(owner = "client!afm", name = "ya", descriptor = "(IZ)V")
	void method6511(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6351(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afm", name = "se", descriptor = "()V")
	void method6512() {
		aFloatArray24[0] = this.aFloat72 * this.aFloat66;
		aFloatArray24[1] = this.aFloat72 * this.aFloat74;
		aFloatArray24[2] = this.aFloat72 * this.aFloat65;
		aFloatArray24[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "yk", descriptor = "(I)V")
	void method6513(@OriginalArg(0) int arg0) {
		if (this.anInt807 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt807 = arg0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "lt", descriptor = "(Lclient!ov;)V")
	@Override
	public void method20742(@OriginalArg(0) Class471 arg0) {
		this.aClass471_10.method29760(arg0);
		this.aClass487_28.method30080(this.aClass471_10);
		this.aClass471_8.method29760(arg0);
		this.aClass471_8.method29768();
		this.aClass487_23.method30080(this.aClass471_8);
		this.method6360();
		if (this.anInt730 != 1) {
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!afm", name = "aal", descriptor = "(J)V")
	synchronized void method6514(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_13.method232(local3, 1590055568);
	}

	@OriginalMember(owner = "client!afm", name = "ys", descriptor = "(Lclient!bz;)V")
	void method6515(@OriginalArg(0) Class84 arg0) {
		@Pc(5) Class84 local5 = this.aClass84Array1[this.anInt807];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt2587);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt2587);
				} else if (arg0.anInt2587 != local5.anInt2587) {
					OpenGL.glDisable(local5.anInt2587);
					OpenGL.glEnable(arg0.anInt2587);
				}
				OpenGL.glBindTexture(arg0.anInt2587, arg0.anInt2592);
			}
			this.aClass84Array1[this.anInt807] = arg0;
		}
		this.anInt777 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afm", name = "yn", descriptor = "(I)V")
	void method6516(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6389(7681, 7681);
		} else if (arg0 == 0) {
			this.method6389(8448, 8448);
		} else if (arg0 == 2) {
			this.method6389(34165, 7681);
		} else if (arg0 == 3) {
			this.method6389(260, 8448);
		} else if (arg0 == 4) {
			this.method6389(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afm", name = "yu", descriptor = "(I)V")
	void method6517(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6389(7681, 7681);
		} else if (arg0 == 0) {
			this.method6389(8448, 8448);
		} else if (arg0 == 2) {
			this.method6389(34165, 7681);
		} else if (arg0 == 3) {
			this.method6389(260, 8448);
		} else if (arg0 == 4) {
			this.method6389(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afm", name = "yf", descriptor = "(I)V")
	void method6518(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6389(7681, 7681);
		} else if (arg0 == 0) {
			this.method6389(8448, 8448);
		} else if (arg0 == 2) {
			this.method6389(34165, 7681);
		} else if (arg0 == 3) {
			this.method6389(260, 8448);
		} else if (arg0 == 4) {
			this.method6389(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afm", name = "yp", descriptor = "(I)I")
	int method6519(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afm", name = "yq", descriptor = "(I)I")
	int method6520(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afm", name = "zj", descriptor = "(Z)V")
	void method6521(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean132) {
			this.aBoolean132 = arg0;
			this.method6400();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zo", descriptor = "(I)V")
	void method6522(@OriginalArg(0) int arg0) {
		if (this.anInt778 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean128) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean128 = local10;
		}
		if (local12 != this.aBoolean130) {
			this.aBoolean130 = local12;
			this.method6405();
		}
		if (local14 != this.aBoolean158) {
			this.aBoolean158 = local14;
			this.method6402();
		}
		if (local8 != this.anInt779) {
			this.anInt779 = local8;
			this.method6403();
		}
		this.anInt778 = arg0;
		this.anInt777 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afm", name = "yv", descriptor = "(II)V")
	void method6523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt807 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt795 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt795 = arg0;
			local4 = true;
		}
		if (this.anInt806 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt806 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt777 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afm", name = "gz", descriptor = "(IIII)[I")
	@Override
	public int[] method20835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass108_6.method24037();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt812, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afm", name = "yw", descriptor = "(II)V")
	void method6524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt807 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt795 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt795 = arg0;
			local4 = true;
		}
		if (this.anInt806 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt806 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt777 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zk", descriptor = "(III)V")
	void method6525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "zg", descriptor = "(III)V")
	void method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "zc", descriptor = "(III)V")
	void method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "om", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method20760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class80_Sub1_Sub3(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!afm", name = "ze", descriptor = "(III)V")
	void method6528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!afm", name = "vd", descriptor = "()V")
	void method6529() {
		this.method6334();
	}

	@OriginalMember(owner = "client!afm", name = "yi", descriptor = "(I)I")
	int method6530(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afm", name = "za", descriptor = "(FFF)V")
	void method6531(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean126) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!afm", name = "zt", descriptor = "(FFF)V")
	void method6532(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean126) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!afm", name = "av", descriptor = "()Z")
	@Override
	public boolean method20693() {
		return this.aBoolean148;
	}

	@OriginalMember(owner = "client!afm", name = "zr", descriptor = "()V")
	void method6533() {
		if (this.aBoolean126) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean126 = false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zx", descriptor = "()V")
	void method6534() {
		if (this.aBoolean126) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean126 = false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zy", descriptor = "(Z)V")
	void method6535(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean134) {
			this.aBoolean134 = arg0;
			this.method6509();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zf", descriptor = "(Z)V")
	void method6536(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean160) {
			this.aBoolean160 = arg0;
			this.method6398();
			this.anInt777 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zw", descriptor = "(Z)V")
	void method6537(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean160) {
			this.aBoolean160 = arg0;
			this.method6398();
			this.anInt777 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afm", name = "zz", descriptor = "(Z)V")
	void method6538(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean133) {
			this.aBoolean133 = arg0;
			this.method6398();
		}
	}

	@OriginalMember(owner = "client!afm", name = "zh", descriptor = "(Z)V")
	void method6539(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean133) {
			this.aBoolean133 = arg0;
			this.method6398();
		}
	}

	@OriginalMember(owner = "client!afm", name = "zu", descriptor = "(Z)V")
	void method6540(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean133) {
			this.aBoolean133 = arg0;
			this.method6398();
		}
	}

	@OriginalMember(owner = "client!afm", name = "zb", descriptor = "()V")
	void method6541() {
		if (this.aBoolean160 && !this.aBoolean133) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!afm", name = "wb", descriptor = "([F)V")
	void method6542(@OriginalArg(0) float[] arg0) {
		@Pc(2) float[] local2 = new float[16];
		System.arraycopy(arg0, 0, local2, 0, 16);
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(local2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!afm", name = "tq", descriptor = "(I)V")
	void method6543(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6389(7681, 7681);
		} else if (arg0 == 0) {
			this.method6389(8448, 8448);
		} else if (arg0 == 2) {
			this.method6389(34165, 7681);
		} else if (arg0 == 3) {
			this.method6389(260, 8448);
		} else if (arg0 == 4) {
			this.method6389(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afm", name = "zi", descriptor = "()V")
	void method6544() {
		OpenGL.glDepthMask(this.aBoolean132 && this.aBoolean125);
	}

	@OriginalMember(owner = "client!afm", name = "jh", descriptor = "(Lclient!akl;)V")
	@Override
	public void method20967(@OriginalArg(0) Class80_Sub22 arg0) {
		this.aNativeHeap2 = ((Class80_Sub22_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) PacketGl local12 = new PacketGl(80);
		if (this.aBoolean129) {
			local12.method23420(-1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(-1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(1.0F);
			local12.method23420(-1.0F);
			local12.method23420(0.0F);
			local12.method23420(1.0F);
			local12.method23420(0.0F);
		} else {
			local12.method23418(-1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(-1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(1.0F);
			local12.method23418(-1.0F);
			local12.method23418(0.0F);
			local12.method23418(1.0F);
			local12.method23418(0.0F);
		}
		this.anInterface14_3 = this.method6375(20, local12.data, local12.pos * -1380987821, false);
		this.aClass189_5 = new Class189(this.anInterface14_3, 5126, 3, 0);
		this.aClass189_6 = new Class189(this.anInterface14_3, 5126, 2, 12);
		this.aClass209_1.method25789(this);
	}

	@OriginalMember(owner = "client!afm", name = "uj", descriptor = "(Z)V")
	void method6545(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean132) {
			this.aBoolean132 = arg0;
			this.method6400();
			this.anInt777 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "wj", descriptor = "()V")
	void method6546() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt797; local1++) {
			@Pc(10) Class80_Sub12 local10 = this.aClass80_Sub12Array2[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method13949((byte) 0);
			aFloatArray23[1] = local10.method13950(-1898368916);
			aFloatArray23[2] = local10.method13970(2063231782);
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method13953((byte) 33);
			@Pc(54) float local54 = local10.method13954(1714288315) / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13952(-432544427) * local10.method13952(-432544427)));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt796) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt796 = this.anInt797;
	}

	@OriginalMember(owner = "client!afm", name = "aaq", descriptor = "()V")
	void method6547() {
		if (this.aBoolean158) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fn", descriptor = "()Z")
	@Override
	public boolean method20658() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ji", descriptor = "(ILclient!cg;II)V")
	@Override
	public void method20932(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg1;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.method6407();
		this.method6339(local2.aClass84_Sub1_Sub1_1);
		this.method6370(1);
		this.method6389(7681, 8448);
		this.method6390(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2598;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt784 - arg2), local37 * (float) (this.anInt782 - arg3));
		OpenGL.glVertex2i(this.anInt784, this.anInt782);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt784 - arg2), local37 * (float) (this.anInt783 - arg3));
		OpenGL.glVertex2i(this.anInt784, this.anInt783);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt766 - arg2), local37 * (float) (this.anInt783 - arg3));
		OpenGL.glVertex2i(this.anInt766, this.anInt783);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt766 - arg2), local37 * (float) (this.anInt782 - arg3));
		OpenGL.glVertex2i(this.anInt766, this.anInt782);
		OpenGL.glEnd();
		this.method6390(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afm", name = "aar", descriptor = "()V")
	void method6548() {
		if (this.aBoolean156) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt753 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt753 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt753 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt753 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt779 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt779 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt779 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt779 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt779 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt779 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt779 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afm", name = "zp", descriptor = "(FFF)V")
	void method6549(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean126) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!afm", name = "th", descriptor = "(Lclient!bm;Lclient!bm;Lclient!bm;Lclient!bm;)V")
	void method6550(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class189 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6377(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte105, arg0.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6377(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6377(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte105, arg2.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6377(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte105, arg3.aShort142, this.anInterface14_2.method2752(), this.anInterface14_2.method2753() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afm", name = "oe", descriptor = "()Z")
	@Override
	public boolean method21049() {
		if (this.aClass80_Sub2_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass80_Sub2_Sub3_1.method21642()) {
			if (!this.aClass201_1.method24938(this.aClass80_Sub2_Sub3_1)) {
				return false;
			}
			this.aClass202_1.method24964();
		}
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "ou", descriptor = "(I)V")
	@Override
	public synchronized void method21054(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class80_Sub20 local16;
		while (!this.aClass8_10.method240(-1692058978)) {
			local16 = (Class80_Sub20) this.aClass8_10.method233(1463753584);
			anIntArray65[local1++] = (int) (local16.aLong338 * 3209506792906532031L);
			this.anInt775 -= local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray65, 0);
			local1 = 0;
		}
		while (!this.aClass8_11.method240(896976070)) {
			local16 = (Class80_Sub20) this.aClass8_11.method233(1042941037);
			anIntArray65[local1++] = (int) (local16.aLong338 * 3209506792906532031L);
			this.anInt774 -= local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray65, 0);
			local1 = 0;
		}
		while (!this.aClass8_8.method240(-884429455)) {
			local16 = (Class80_Sub20) this.aClass8_8.method233(1388705778);
			anIntArray65[local1++] = local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray65, 0);
			local1 = 0;
		}
		while (!this.aClass8_12.method240(-1305996344)) {
			local16 = (Class80_Sub20) this.aClass8_12.method233(1533063891);
			anIntArray65[local1++] = (int) (local16.aLong338 * 3209506792906532031L);
			this.anInt755 -= local16.anInt1588 * 701000167;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray65, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray65, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass8_15.method240(-1617239402)) {
			local16 = (Class80_Sub20) this.aClass8_15.method233(1465262334);
			OpenGL.glDeleteLists((int) (local16.aLong338 * 3209506792906532031L), local16.anInt1588 * 701000167);
		}
		@Pc(215) Class80 local215;
		while (!this.aClass8_14.method240(1115514048)) {
			local215 = this.aClass8_14.method233(783061684);
			OpenGL.glDeleteProgramARB((int) (local215.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_13.method240(611019198)) {
			local215 = this.aClass8_13.method233(972631013);
			OpenGL.glDeleteShader((int) (local215.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_15.method240(-1610881408)) {
			local16 = (Class80_Sub20) this.aClass8_15.method233(535385551);
			OpenGL.glDeleteLists((int) (local16.aLong338 * 3209506792906532031L), local16.anInt1588 * 701000167);
		}
		this.aClass202_1.method24963();
		if (this.method20911() > 100663296 && Class303.method27111((byte) 17) > this.aLong27 + 60000L) {
			System.gc();
			this.aLong27 = Class303.method27111((byte) 30);
		}
		this.anInt770 = local5;
	}

	@OriginalMember(owner = "client!afm", name = "wr", descriptor = "(Lclient!pm;)V")
	void method6551(@OriginalArg(0) Class487 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!afm", name = "zs", descriptor = "(FFFF)V")
	void method6552(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray24[0] = arg0;
		aFloatArray24[1] = arg1;
		aFloatArray24[2] = arg2;
		aFloatArray24[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!afm", name = "od", descriptor = "(F)V")
	@Override
	public void method21045(@OriginalArg(0) float arg0) {
		if (this.aFloat72 != arg0) {
			this.aFloat72 = arg0;
			this.method6512();
		}
	}

	@OriginalMember(owner = "client!afm", name = "aak", descriptor = "(II)V")
	synchronized void method6553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_10.method232(local4, -87897955);
	}

	@OriginalMember(owner = "client!afm", name = "aaa", descriptor = "(II)V")
	synchronized void method6554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_11.method232(local4, 1046477851);
	}

	@OriginalMember(owner = "client!afm", name = "aad", descriptor = "(II)V")
	synchronized void method6555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_11.method232(local4, 540474629);
	}

	@OriginalMember(owner = "client!afm", name = "ws", descriptor = "()V")
	void method6556() {
		if (this.anInt730 == 1) {
			return;
		}
		this.anInt730 = 1;
		this.method6359();
		this.method6495();
		this.method6363();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt777 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afm", name = "aay", descriptor = "(I)V")
	synchronized void method6557(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_8.method232(local4, 1004310533);
	}

	@OriginalMember(owner = "client!afm", name = "aaj", descriptor = "(I)V")
	synchronized void method6558(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_8.method232(local4, 284260389);
	}

	@OriginalMember(owner = "client!afm", name = "ah", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method20687() {
		return new Class108_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!afm", name = "vr", descriptor = "()V")
	void method6559() {
		this.method6384(-2);
		for (@Pc(7) int local7 = this.anInt809 - 1; local7 >= 0; local7--) {
			this.method6386(local7);
			this.method6339(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6389(8448, 8448);
		this.method6390(2, 34168, 770);
		this.method6364();
		this.anInt778 = 1;
		this.anInt753 = 0;
		this.aBoolean158 = true;
		if (this.aBoolean156) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt779 = 1;
		this.aByte3 = -1;
		this.method6388((byte) 0);
		this.aBoolean130 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte3);
		if (this.aBoolean144) {
			if (this.anInt773 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean128 = true;
		this.method6424(true);
		this.method6429(true);
		this.method6399(true);
		this.method6545(true);
		this.method20708(0.0F, 1.0F);
		this.method6356();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6410(this.anInt780);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(155) float[] local155 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(157) int local157 = 0; local157 < 8; local157++) {
			@Pc(164) int local164 = local157 + 16384;
			OpenGL.glLightfv(local164, 4608, local155, 0);
			OpenGL.glLightf(local164, 4615, 0.0F);
			OpenGL.glLightf(local164, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean127) {
			OpenGL.glEnable(34895);
		}
		this.anInt800 = -1;
		this.anInt793 = -1;
		this.method20705();
		this.method20877();
	}

	@OriginalMember(owner = "client!afm", name = "aaz", descriptor = "(J)V")
	synchronized void method6560(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_13.method232(local3, 381412369);
	}

	@OriginalMember(owner = "client!afm", name = "aau", descriptor = "(J)V")
	synchronized void method6561(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_13.method232(local3, 572469567);
	}

	@OriginalMember(owner = "client!afm", name = "aax", descriptor = "(I)V")
	synchronized void method6562(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_14.method232(local3, 929404926);
	}

	@OriginalMember(owner = "client!afm", name = "aap", descriptor = "(I)V")
	synchronized void method6563(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_14.method232(local3, 945764597);
	}

	@OriginalMember(owner = "client!afm", name = "aaf", descriptor = "(I)V")
	synchronized void method6564(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_14.method232(local3, 2112934003);
	}

	@OriginalMember(owner = "client!afm", name = "ym", descriptor = "()V")
	void method6565() {
		if (this.anInt777 == 2) {
			return;
		}
		this.method6433();
		this.method6424(false);
		this.method6429(false);
		this.method6399(false);
		this.method6545(false);
		this.method6384(-2);
		this.method6388((byte) 0);
		this.anInt777 = 2;
	}

	@OriginalMember(owner = "client!afm", name = "aan", descriptor = "(I)V")
	void method6566(@OriginalArg(0) int arg0) {
		this.anInt780 = arg0;
		if (this.anInt780 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt780 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt780 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afm", name = "df", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method20897() {
		return new Class471(this.aClass471_10);
	}

	@OriginalMember(owner = "client!afm", name = "pj", descriptor = "()I")
	@Override
	public int method20674() {
		return this.anInt775 + this.anInt774 + this.anInt755;
	}

	@OriginalMember(owner = "client!afm", name = "pm", descriptor = "()Z")
	@Override
	public boolean method20796() {
		return true;
	}

	@OriginalMember(owner = "client!afm", name = "hg", descriptor = "(IIII)V")
	@Override
	public void method20878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass108_6.method24036()) {
			arg2 = this.aClass108_6.method24036();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass108_6.method24037()) {
			arg3 = this.aClass108_6.method24037();
		}
		this.anInt784 = arg0;
		this.anInt782 = arg1;
		this.anInt766 = arg2;
		this.anInt783 = arg3;
		OpenGL.glEnable(3089);
		this.method6349();
	}

	@OriginalMember(owner = "client!afm", name = "pk", descriptor = "()Z")
	@Override
	public boolean method20788() {
		return true;
	}
}
