package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@OriginalClass("client!ha")
public final class Class307 implements Interface45 {

	@OriginalMember(owner = "client!ha", name = "bz", descriptor = "Ljava/util/List;")
	static List aList16 = new ArrayList();

	@OriginalMember(owner = "client!ha", name = "be", descriptor = "Lclient!ej;")
	static Class243 aClass243_74 = new Class243(524288, 1024);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	int anInt3983;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	int anInt3984;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	int anInt3985;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	int anInt3986;

	@OriginalMember(owner = "client!ha", name = "bh", descriptor = "[B")
	byte[] aByteArray79;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!mi;")
	Interface41 anInterface41_1;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	int anInt3987;

	@OriginalMember(owner = "client!ha", name = "ao", descriptor = "Lclient!hw;")
	Class326 aClass326_1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	int anInt3988;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	int anInt3989;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	int anInt3990;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	int anInt3991;

	@OriginalMember(owner = "client!ha", name = "bv", descriptor = "I")
	int anInt3992;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "[Lclient!hp;")
	Class321[] aClass321Array1;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "[Lclient!hk;")
	Class316[] aClass316Array1;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[Z")
	boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
	int[] anIntArray376;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "[Lclient!hw;")
	Class326[] aClass326Array1;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	int anInt3993;

	@OriginalMember(owner = "client!ha", name = "av", descriptor = "Z")
	boolean aBoolean788;

	@OriginalMember(owner = "client!ha", name = "ax", descriptor = "[Lclient!hw;")
	Class326[] aClass326Array2;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "[Lclient!hn;")
	Class319[] aClass319Array1;

	@OriginalMember(owner = "client!ha", name = "ai", descriptor = "Lclient!hw;")
	Class326 aClass326_2;

	@OriginalMember(owner = "client!ha", name = "aq", descriptor = "Lclient!hw;")
	Class326 aClass326_3;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	int anInt3994;

	@OriginalMember(owner = "client!ha", name = "ac", descriptor = "Lclient!hw;")
	Class326 aClass326_4;

	@OriginalMember(owner = "client!ha", name = "ag", descriptor = "[I")
	int[] anIntArray377;

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "[I")
	int[] anIntArray378;

	@OriginalMember(owner = "client!ha", name = "al", descriptor = "Z")
	boolean aBoolean789;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[Lclient!gs;")
	Class298[] aClass298Array1;

	@OriginalMember(owner = "client!ha", name = "ad", descriptor = "Z")
	boolean aBoolean790;

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "I")
	int anInt3997;

	@OriginalMember(owner = "client!ha", name = "ay", descriptor = "Lclient!hw;")
	Class326 aClass326_5;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[Z")
	boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ha", name = "ae", descriptor = "I")
	int anInt3998;

	@OriginalMember(owner = "client!ha", name = "ap", descriptor = "I")
	int anInt3999;

	@OriginalMember(owner = "client!ha", name = "ar", descriptor = "I")
	int anInt4000;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	int anInt4001;

	@OriginalMember(owner = "client!ha", name = "au", descriptor = "Z")
	boolean aBoolean791;

	@OriginalMember(owner = "client!ha", name = "az", descriptor = "I")
	int anInt4002;

	@OriginalMember(owner = "client!ha", name = "aw", descriptor = "I")
	int anInt4003;

	@OriginalMember(owner = "client!ha", name = "bg", descriptor = "I")
	int anInt4004;

	@OriginalMember(owner = "client!ha", name = "an", descriptor = "Z")
	boolean aBoolean792;

	@OriginalMember(owner = "client!ha", name = "bl", descriptor = "I")
	int anInt4005;

	@OriginalMember(owner = "client!ha", name = "bt", descriptor = "I")
	int anInt4006;

	@OriginalMember(owner = "client!ha", name = "bp", descriptor = "I")
	int anInt4007;

	@OriginalMember(owner = "client!ha", name = "bj", descriptor = "[Lclient!hw;")
	Class326[] aClass326Array3;

	@OriginalMember(owner = "client!ha", name = "as", descriptor = "I")
	int anInt4009;

	@OriginalMember(owner = "client!ha", name = "aj", descriptor = "Lclient!hw;")
	Class326 aClass326_6;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Ljava/util/List;")
	List aList15 = new ArrayList();

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!mk;")
	Class419 aClass419_1 = Class419.aClass419_3;

	@OriginalMember(owner = "client!ha", name = "ah", descriptor = "Ljava/util/List;")
	List aList17 = new ArrayList();

	@OriginalMember(owner = "client!ha", name = "af", descriptor = "Lclient!ald;")
	Packet aPacket_14 = null;

	@OriginalMember(owner = "client!ha", name = "am", descriptor = "I")
	int anInt3995 = 0;

	@OriginalMember(owner = "client!ha", name = "ak", descriptor = "I")
	int anInt3996 = 0;

	@OriginalMember(owner = "client!ha", name = "at", descriptor = "Ljava/util/List;")
	List aList18 = new ArrayList();

	@OriginalMember(owner = "client!ha", name = "br", descriptor = "Ljava/util/List;")
	List aList19 = new ArrayList();

	@OriginalMember(owner = "client!ha", name = "bn", descriptor = "Ljava/util/List;")
	List aList20 = new ArrayList();

	@OriginalMember(owner = "client!ha", name = "ba", descriptor = "Ljava/util/concurrent/atomic/AtomicReference;")
	AtomicReference anAtomicReference1 = new AtomicReference(null);

	@OriginalMember(owner = "client!ha", name = "bs", descriptor = "I")
	int anInt4010 = 0;

	@OriginalMember(owner = "client!ha", name = "by", descriptor = "Z")
	boolean aBoolean793 = false;

	@OriginalMember(owner = "client!ha", name = "bk", descriptor = "I")
	int anInt4008 = 0;

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "[Z")
	boolean[] aBooleanArray26 = null;

	@OriginalMember(owner = "client!ha", name = "bo", descriptor = "[Z")
	boolean[] aBooleanArray27 = null;

	@OriginalMember(owner = "client!ha", name = "bc", descriptor = "[Z")
	boolean[] aBooleanArray28 = null;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "F")
	final float aFloat285;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!nv;")
	Class449 aClass449_1;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!mm;")
	Class420 aClass420_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(F)V")
	public Class307(@OriginalArg(0) float arg0) {
		this.aFloat285 = arg0;
		this.aClass449_1 = Class449.aClass449_2;
		this.aClass420_1 = Class420.aClass420_3;
		this.method27429(false);
	}

	@OriginalMember(owner = "client!ha", name = "cn", descriptor = "()Lclient!nv;")
	@Override
	public Class449 method27309() {
		return this.aClass449_1;
	}

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "(Z)V")
	@Override
	public void method27283(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27294();
		} else if (this.method27270() == Class419.aClass419_6) {
			this.method27429(true);
			this.method27321(Class419.aClass419_7);
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()I")
	@Override
	public int method27276() {
		if (!this.aBoolean788) {
			throw new RuntimeException("");
		}
		return this.method27350() < this.anInt3988 ? this.anInt3988 : this.method27350();
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Lclient!mk;")
	@Override
	public Class419 method27270() {
		return this.aClass419_1;
	}

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "(Lclient!mk;)V")
	void method27321(@OriginalArg(0) Class419 arg0) {
		this.aClass419_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "cl", descriptor = "(I)Lclient!hw;")
	Class326 method27322(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = aClass243_74;
		synchronized (aClass243_74) {
			@Pc(5) Class326 local5 = null;
			local5 = (Class326) aClass243_74.method26284((byte) 0);
			@Pc(12) Class326 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray104.length > arg0 && !local5.aBoolean798 && (local12 == null || local5.aFloatArray104.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray104.length;
				}
				if (local5.aFloatArray104.length == arg0 && !local5.aBoolean798) {
					break;
				}
				local5 = (Class326) aClass243_74.method26263(9151998);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class326(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass243_74.method26282((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt4072 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray104 = local88;
				local5.aBoolean798 = true;
				local5.anInt4073 = arg0;
				if (aClass243_74.method26257((byte) -27) < arg0 * 4) {
				}
				aClass243_74.method26254(local5, (long) local5.anInt4072, local88.length * 4, (byte) -63);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray104.length; local65++) {
					local5.aFloatArray104[local65] = 0.0F;
				}
				local5.anInt4073 = arg0;
			}
			local5.aBoolean798 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()I")
	@Override
	public int method27278() {
		return this.method27355();
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()V")
	@Override
	public void method27273() {
		if (this.method27270() == Class419.aClass419_2 || this.method27270() == Class419.aClass419_3 || this.method27270() == Class419.aClass419_7) {
			this.method27321(Class419.aClass419_4);
			this.method27351();
		}
	}

	@OriginalMember(owner = "client!ha", name = "ae", descriptor = "(F)I")
	int method27323(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!ha", name = "al", descriptor = "(I)I")
	int method27324(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4007) {
			local14 = 8 - this.anInt4007;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local20) << local3;
			this.anInt4007 = 0;
			this.anInt3992++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local14) << local3;
			this.anInt4007 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)I")
	@Override
	public int method27302(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)I")
	@Override
	public int method27281(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()I")
	int method27325() {
		if (!this.method27282()) {
			throw new RuntimeException("");
		}
		return this.anInt3991;
	}

	@OriginalMember(owner = "client!ha", name = "dr", descriptor = "()I")
	int method27326() {
		return this.anInt3992;
	}

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Lclient!mm;")
	@Override
	public Class420 method27275() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "(ILclient!nv;Lclient!mm;I)V")
	@Override
	public void method27280(@OriginalArg(0) int arg0, @OriginalArg(1) Class449 arg1, @OriginalArg(2) Class420 arg2, @OriginalArg(3) int arg3) {
		this.anInt3988 = arg3;
		if (!this.method27327(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass449_1 = arg1;
		this.aClass420_1 = arg2;
	}

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(ILclient!nv;Lclient!mm;)Z")
	boolean method27327(@OriginalArg(0) int arg0, @OriginalArg(1) Class449 arg1, @OriginalArg(2) Class420 arg2) {
		if (arg1 == Class449.aClass449_2) {
			return true;
		} else if (arg1 == Class449.aClass449_4) {
			return true;
		} else if (arg1 == Class449.aClass449_3) {
			return true;
		} else {
			return arg1 == Class449.aClass449_5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ap", descriptor = "(F)I")
	int method27328(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "dt", descriptor = "(I)F")
	float method27329(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	@Override
	public synchronized boolean method27282() {
		return this.aBoolean792;
	}

	@OriginalMember(owner = "client!ha", name = "fe", descriptor = "(F)I")
	int method27330(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "(II)[Lclient!hw;")
	Class326[] method27331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class326[] local2 = new Class326[arg0];
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			local2[local4] = this.method27408(arg1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!ha", name = "fa", descriptor = "(ZIII)V")
	@Override
	public void method27272(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean793 = arg0;
		this.anInt4004 = arg1;
		this.anInt3989 = arg2;
		this.anInt3990 = arg3;
	}

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "(Lclient!hw;)V")
	void method27332(@OriginalArg(0) Class326 arg0) {
		if (arg0 != null) {
			@Pc(5) Class243 local5 = aClass243_74;
			synchronized (aClass243_74) {
				arg0.aBoolean798 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "([Lclient!hw;)V")
	void method27333(@OriginalArg(0) Class326[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27332(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(F)I")
	int method27334(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ac", descriptor = "()I")
	int method27335() {
		return this.anInt4007;
	}

	@OriginalMember(owner = "client!ha", name = "ch", descriptor = "()Lclient!mm;")
	@Override
	public Class420 method27311() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!ha", name = "ay", descriptor = "()Z")
	boolean method27336() {
		return this.aBoolean789;
	}

	@OriginalMember(owner = "client!ha", name = "ai", descriptor = "(Lclient!ald;)Z")
	boolean method27337(@OriginalArg(0) Packet arg0) {
		return arg0.g1() == 79 && arg0.g1() == 103 && arg0.g1() == 103 && arg0.g1() == 83;
	}

	@OriginalMember(owner = "client!ha", name = "aq", descriptor = "([BII)Z")
	boolean method27338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ao", descriptor = "(I)F")
	float method27339(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ha", name = "cu", descriptor = "()Lclient!mm;")
	@Override
	public Class420 method27313() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!ha", name = "ag", descriptor = "([BI)V")
	void method27340(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray79 = arg0;
		this.anInt3992 = arg1;
		this.anInt4007 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	@Override
	public void method27294() {
		if (this.method27270() == Class419.aClass419_4) {
			this.method27429(false);
			this.method27321(Class419.aClass419_2);
		} else {
			this.method27429(false);
			this.method27321(Class419.aClass419_3);
		}
	}

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "([BII)Z")
	boolean method27341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ah", descriptor = "()V")
	void method27342() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "af", descriptor = "()V")
	void method27343() {
		@Pc(5) int local5 = this.method27324(8) + 1;
		@Pc(8) Iterator local8 = aList16.iterator();
		@Pc(15) Class311 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass319Array1 = new Class319[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass319Array1[local69] == null) {
						this.aClass319Array1[local69] = new Class319();
					}
					this.aClass319Array1[local69].method27531(this);
				}
				@Pc(108) Class311 local108 = new Class311(this.anInt3984, this.anInt3991, this.anInt3985, this.anInt4001, this.anInt3986, this.aClass319Array1);
				aList16.add(local108);
				return;
			}
			local15 = (Class311) local8.next();
		} while (local15.anInt4013 != 0 || local15.anInt4016 != 0 || local15.aClass319Array2.length != local5 || local15.anInt4015 != this.anInt3984 || local15.anInt4014 != this.anInt3991 || local15.anInt4017 != this.anInt3986);
		this.aClass319Array1 = local15.aClass319Array2;
		for (@Pc(48) int local48 = 0; local48 < this.aClass319Array1.length; local48++) {
			this.aClass319Array1[local48].method27530(this);
		}
	}

	@OriginalMember(owner = "client!ha", name = "am", descriptor = "([BI)V")
	void method27344(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4006 = 0;
		if (this.method27282()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27338(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27338(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27338(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27340(arg0, arg1 + 7);
			local67 = this.method27324(32);
			this.anInt3984 = this.method27324(8);
			this.anInt3991 = this.method27324(32);
			this.anInt3985 = this.method27324(32);
			this.anInt3986 = this.method27324(32);
			this.anInt4001 = this.method27324(32);
			this.anInt3983 = 0x1 << this.method27324(4);
			this.anInt3987 = 0x1 << this.method27324(4);
			local112 = 0x1 << this.method27324(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean788 = true;
			this.anInt4000++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27338(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27340(arg0, arg1 + 7);
			if (this.aClass326Array2 != null) {
				this.method27333(this.aClass326Array2);
				this.aClass326Array2 = null;
			}
			this.aClass326Array2 = this.method27331(this.anInt3984, this.anInt3987);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3983 : this.anInt3987;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class326 local202 = this.method27408(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray104[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray104[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class326 local250 = this.method27408(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray104[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray104[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class326 local305 = this.method27408(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray104[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray104[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class702.method37107(local198 - 1, 221154893);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class86.method1700(local364, local362, -87615851);
				}
				if (local67 == 0) {
					this.aClass326_5 = local202;
					this.aClass326_2 = local250;
					this.aClass326_3 = local305;
					this.anIntArray377 = local356;
				} else {
					this.aClass326_1 = local202;
					this.aClass326_6 = local250;
					this.aClass326_4 = local305;
					this.anIntArray378 = local356;
				}
			}
			this.method27343();
			local67 = this.method27324(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27324(16);
			}
			local67 = this.method27324(6) + 1;
			if (this.aClass321Array1 == null || this.aClass321Array1.length != local67) {
				this.aClass321Array1 = new Class321[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass321Array1[local112] == null) {
					this.aClass321Array1[local112] = new Class321();
				}
				this.aClass321Array1[local112].method27565(this, this.anInt3984);
			}
			local112 = this.method27324(6) + 1;
			if (this.aClass298Array1 == null || this.aClass298Array1.length != local112) {
				this.aClass298Array1 = new Class298[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass298Array1[local190] == null) {
					this.aClass298Array1[local190] = new Class298();
				}
				this.aClass298Array1[local190].method27011(this);
			}
			local190 = this.method27324(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27505(this);
			}
			local194 = this.method27324(6) + 1;
			this.aBooleanArray24 = new boolean[local194];
			this.anIntArray376 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray24[local198] = this.method27352() != 0;
				this.method27324(16);
				this.method27324(16);
				this.anIntArray376[local198] = this.method27324(8);
			}
			this.method27363(true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "ak", descriptor = "(I)I")
	int method27345(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "at", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z")
	boolean method27346(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27340(arg0, arg1);
			@Pc(21) int local21 = this.method27352();
			if (local21 != 0) {
				this.method27344(arg0, arg1);
				return false;
			} else if (this.method27282()) {
				@Pc(46) int local46 = this.method27324(this.method27345(this.anIntArray376.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray24[local46];
				@Pc(59) int local59 = local51 ? this.anInt3987 : this.anInt3983;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27352() != 0;
					local63 = this.method27352() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3983 >> 2);
					local105 = (local59 >> 2) + (this.anInt3983 >> 2);
					local110 = this.anInt3983 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3983 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3983 >> 2);
					local150 = this.anInt3983 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray376[local46]];
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3984) {
					this.aBooleanArray26 = new boolean[this.anInt3984];
					this.aBooleanArray27 = new boolean[this.anInt3984];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
					local209 = local167.anIntArray382[local202];
					this.aBooleanArray26[local188] = !this.aClass321Array1[local209].method27579(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray26[local188];
				}
				for (local188 = 0; local188 < local167.anInt4023; local188++) {
					if (!this.aBooleanArray26[local167.anIntArray384[local188]] || !this.aBooleanArray26[local167.anIntArray385[local188]]) {
						this.aBooleanArray26[local167.anIntArray384[local188]] = false;
						this.aBooleanArray26[local167.anIntArray385[local188]] = false;
					}
				}
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt3984) {
					this.aBooleanArray28 = new boolean[this.anInt3984];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4022; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						local209 = local167.anIntArray381 == null ? local188 : local167.anIntArray381[local297];
						if (local209 == local188) {
							this.aBooleanArray28[local202++] = this.aBooleanArray26[local297];
						}
					}
					@Pc(333) Class298 local333 = this.aClass298Array1[local167.anIntArray383[local188]];
					@Pc(335) Class326[] local335 = null;
					if (local333.anInt3957 == 2) {
						@Pc(347) Class326[] local347 = this.method27331(1, this.anInt3984 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method27007(local347, local59 >> 1, this.aBooleanArray28);
								local335 = this.aClass326Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3984; local354++) {
										try {
											local335[local354].aFloatArray104[local349] = local347[0].aFloatArray104[this.anInt3984 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27333(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3984; local354++) {
								try {
									local347[0].aFloatArray104[local349 * this.anInt3984 + local354] = this.aClass326Array2[local354].aFloatArray104[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method27007(this.aClass326Array2, local59 >> 1, this.aBooleanArray28);
					}
					if (local167.anIntArray381 == null) {
						if (this.aClass326Array2 != local335) {
							this.method27333(this.aClass326Array2);
						}
						this.aClass326Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3984; local455++) {
							local349 = local167.anIntArray381[local455];
							if (local349 == local188) {
								this.aClass326Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4023 - 1; local188 >= 0; local188--) {
					@Pc(506) Class326 local506 = this.aClass326Array2[local167.anIntArray384[local188]];
					@Pc(514) Class326 local514 = this.aClass326Array2[local167.anIntArray385[local188]];
					for (local209 = 0; local209 < local506.anInt4073; local209++) {
						@Pc(525) float local525 = local506.aFloatArray104[local209];
						@Pc(530) float local530 = local514.aFloatArray104[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray104[local209] = local544;
						local514.aFloatArray104[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray26.length; local188++) {
					this.aBooleanArray26[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (!this.aBooleanArray26[local188]) {
						local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
						local209 = local167.anIntArray382[local202];
						this.aClass321Array1[local209].method27572(local188);
						this.aClass321Array1[local209].method27567(this.aClass326Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (this.aBooleanArray26[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass326Array2[local188].aFloatArray104[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class326 local699 = this.aClass326Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray104[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray104[local349] = -local699.aFloatArray104[local59 - local349 - 1];
						}
						@Pc(742) Class326 local742 = local51 ? this.aClass326_1 : this.aClass326_5;
						@Pc(750) Class326 local750 = local51 ? this.aClass326_6 : this.aClass326_2;
						@Pc(758) Class326 local758 = local51 ? this.aClass326_4 : this.aClass326_3;
						@Pc(766) int[] local766 = local51 ? this.anIntArray378 : this.anIntArray377;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray104[local768 * 4] - local699.aFloatArray104[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray104[local768 * 4 + 2] - local699.aFloatArray104[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray104[local768 * 2];
							local825 = local742.aFloatArray104[local768 * 2 + 1];
							local699.aFloatArray104[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray104[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray104[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray104[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray104[local768 * 4 + 3];
							local825 = local699.aFloatArray104[local768 * 4 + 1];
							local699.aFloatArray104[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray104[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray104[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray104[local202 - 3 - local768 * 4];
							local699.aFloatArray104[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray104[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class702.method37107(local59 - 1, 221154893);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray104[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray104[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray104[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray104[local1042 - 3 - local1055];
									local699.aFloatArray104[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray104[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray104[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray104[local1044 * local1017 + 1];
									local699.aFloatArray104[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray104[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray104[local1017 + 1];
								local699.aFloatArray104[local1017 + 1] = local699.aFloatArray104[local1019 + 1];
								local699.aFloatArray104[local1019 + 1] = local943;
								local943 = local699.aFloatArray104[local1017 + 3];
								local699.aFloatArray104[local1017 + 3] = local699.aFloatArray104[local1019 + 3];
								local699.aFloatArray104[local1019 + 3] = local943;
								local943 = local699.aFloatArray104[local1017 + 5];
								local699.aFloatArray104[local1017 + 5] = local699.aFloatArray104[local1019 + 5];
								local699.aFloatArray104[local1019 + 5] = local943;
								local943 = local699.aFloatArray104[local1017 + 7];
								local699.aFloatArray104[local1017 + 7] = local699.aFloatArray104[local1019 + 7];
								local699.aFloatArray104[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4];
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 1];
							local699.aFloatArray104[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 2];
							local699.aFloatArray104[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray104[local1002 * 2];
							local816 = local758.aFloatArray104[local1002 * 2 + 1];
							local825 = local699.aFloatArray104[local202 + local1002 * 2];
							local943 = local699.aFloatArray104[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray104[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray104[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray104[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray104[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2] + local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2 + 1];
							local699.aFloatArray104[local202 - 1 - local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2 + 1] - local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local59 - local297 + local1002] = -local699.aFloatArray104[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local297 + local1002] = -local699.aFloatArray104[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local202 + local1002] = local699.aFloatArray104[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class326[] local1816 = null;
				if (this.anInt3994 > 0) {
					local202 = this.anInt3994 + local59 >> 2;
					local1816 = this.method27331(this.anInt3984, local202);
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						if (!this.aBooleanArray25[local297]) {
							for (local209 = 0; local209 < this.anInt3993; local209++) {
								local455 = (this.anInt3994 >> 1) + local209;
								local1816[local297].aFloatArray104[local209] += this.aClass326Array1[local297].aFloatArray104[local455];
							}
						}
						if (!this.aBooleanArray26[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt4073 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray104[local455] += this.aClass326Array2[local297].aFloatArray104[local209];
							}
						}
					}
				}
				@Pc(1920) Class326[] local1920 = this.aClass326Array1;
				this.aClass326Array1 = this.aClass326Array2;
				this.aClass326Array2 = local1920;
				this.anInt3994 = local59;
				this.anInt3993 = local145 - (local59 >> 1);
				this.aBooleanArray25 = this.aBooleanArray26;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "ad", descriptor = "()V")
	void method27347() {
		if (this.method27270() == Class419.aClass419_2 || (this.method27270() == Class419.aClass419_5 || this.aBoolean792 && (float) (this.anInt4008 / this.method27325()) > this.aFloat285)) {
			return;
		}
		if (!this.method27336()) {
			@Pc(41) Packet local41 = (Packet) (this.aList15 == null || this.aList15.isEmpty() ? null : this.aList15.get(0));
			if (local41 == null) {
				if (!this.aBoolean790) {
					this.method27321(Class419.aClass419_5);
					this.anInterface41_1.method30821((byte) 53);
					this.aBoolean790 = true;
				}
				return;
			}
			this.aBoolean790 = false;
			this.aBoolean789 = true;
			this.aList15.remove(0);
			this.method27369(local41);
		}
		this.method27384();
	}

	@OriginalMember(owner = "client!ha", name = "av", descriptor = "(Lclient!ald;)V")
	synchronized void method27348(@OriginalArg(0) Packet arg0) {
		this.aList15.add(arg0);
		this.method27321(Class419.aClass419_7);
	}

	@OriginalMember(owner = "client!ha", name = "ee", descriptor = "([BI)V")
	void method27349(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4006 = 0;
		if (this.method27282()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27338(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27338(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27338(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27340(arg0, arg1 + 7);
			local67 = this.method27324(32);
			this.anInt3984 = this.method27324(8);
			this.anInt3991 = this.method27324(32);
			this.anInt3985 = this.method27324(32);
			this.anInt3986 = this.method27324(32);
			this.anInt4001 = this.method27324(32);
			this.anInt3983 = 0x1 << this.method27324(4);
			this.anInt3987 = 0x1 << this.method27324(4);
			local112 = 0x1 << this.method27324(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean788 = true;
			this.anInt4000++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27338(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27340(arg0, arg1 + 7);
			if (this.aClass326Array2 != null) {
				this.method27333(this.aClass326Array2);
				this.aClass326Array2 = null;
			}
			this.aClass326Array2 = this.method27331(this.anInt3984, this.anInt3987);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3983 : this.anInt3987;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class326 local202 = this.method27408(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray104[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray104[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class326 local250 = this.method27408(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray104[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray104[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class326 local305 = this.method27408(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray104[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray104[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class702.method37107(local198 - 1, 221154893);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class86.method1700(local364, local362, -545224134);
				}
				if (local67 == 0) {
					this.aClass326_5 = local202;
					this.aClass326_2 = local250;
					this.aClass326_3 = local305;
					this.anIntArray377 = local356;
				} else {
					this.aClass326_1 = local202;
					this.aClass326_6 = local250;
					this.aClass326_4 = local305;
					this.anIntArray378 = local356;
				}
			}
			this.method27343();
			local67 = this.method27324(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27324(16);
			}
			local67 = this.method27324(6) + 1;
			if (this.aClass321Array1 == null || this.aClass321Array1.length != local67) {
				this.aClass321Array1 = new Class321[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass321Array1[local112] == null) {
					this.aClass321Array1[local112] = new Class321();
				}
				this.aClass321Array1[local112].method27565(this, this.anInt3984);
			}
			local112 = this.method27324(6) + 1;
			if (this.aClass298Array1 == null || this.aClass298Array1.length != local112) {
				this.aClass298Array1 = new Class298[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass298Array1[local190] == null) {
					this.aClass298Array1[local190] = new Class298();
				}
				this.aClass298Array1[local190].method27011(this);
			}
			local190 = this.method27324(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27505(this);
			}
			local194 = this.method27324(6) + 1;
			this.aBooleanArray24 = new boolean[local194];
			this.anIntArray376 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray24[local198] = this.method27352() != 0;
				this.method27324(16);
				this.method27324(16);
				this.anIntArray376[local198] = this.method27324(8);
			}
			this.method27363(true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "aw", descriptor = "(ZIII)V")
	@Override
	public void method27284(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean793 = arg0;
		this.anInt4004 = arg1;
		this.anInt3989 = arg2;
		this.anInt3990 = arg3;
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()I")
	int method27350() {
		if (!this.aBoolean788) {
			throw new RuntimeException("");
		}
		return this.anInt3984;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	void method27351() {
		if (this.method27270() != Class419.aClass419_8) {
			this.method27347();
			if (this.method27270() == Class419.aClass419_4) {
				this.method27321(Class419.aClass419_7);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "()I")
	int method27352() {
		@Pc(10) int local10 = this.aByteArray79[this.anInt3992] >> this.anInt4007 & 0x1;
		this.anInt4007++;
		this.anInt3992 += this.anInt4007 >> 3;
		this.anInt4007 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!ha", name = "au", descriptor = "(I)Lclient!ald;")
	Packet method27353(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27354(this.method27281(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList18;
		synchronized (this.aList18) {
			while (!this.aList18.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList18.remove(0);
				this.anInt4008 -= this.method27302(local22.pos * -1380987821) / this.method27276();
				@Pc(40) int local40 = this.method27281(local7);
				@Pc(53) int local53 = local22.pos * -1380987821 < local40 ? local22.pos * -1380987821 : local40;
				local5.pdata(local22.data, 0, local53);
				local7 -= this.method27302(local53);
				@Pc(73) int local73 = local22.pos * -1380987821 - local53;
				if (local73 == 0) {
					local22.release();
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * 1034180571;
					this.anInt4008 += this.method27302(local73) / this.method27276();
					this.aList18.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList18.isEmpty() && this.method27270() == Class419.aClass419_8) {
				this.method27321(Class419.aClass419_6);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "az", descriptor = "(I)Lclient!ald;")
	Packet method27354(@OriginalArg(0) int arg0) {
		return new Packet(arg0, true);
	}

	@OriginalMember(owner = "client!ha", name = "as", descriptor = "()I")
	int method27355() {
		return this.anInt4008;
	}

	@OriginalMember(owner = "client!ha", name = "fq", descriptor = "()I")
	int method27356() {
		return this.anInt4008;
	}

	@OriginalMember(owner = "client!ha", name = "bg", descriptor = "(Z)V")
	@Override
	public void method27285(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27294();
		} else if (this.method27270() == Class419.aClass419_6) {
			this.method27429(true);
			this.method27321(Class419.aClass419_7);
		}
	}

	@OriginalMember(owner = "client!ha", name = "bl", descriptor = "(Z)V")
	@Override
	public void method27286(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27294();
		} else if (this.method27270() == Class419.aClass419_6) {
			this.method27429(true);
			this.method27321(Class419.aClass419_7);
		}
	}

	@OriginalMember(owner = "client!ha", name = "br", descriptor = "()V")
	@Override
	public void method27296() {
		if (this.method27270() == Class419.aClass419_4) {
			this.method27429(false);
			this.method27321(Class419.aClass419_2);
		} else {
			this.method27429(false);
			this.method27321(Class419.aClass419_3);
		}
	}

	@OriginalMember(owner = "client!ha", name = "bn", descriptor = "()Lclient!mk;")
	@Override
	public Class419 method27289() {
		return this.aClass419_1;
	}

	@OriginalMember(owner = "client!ha", name = "aj", descriptor = "()I")
	int method27357() {
		return this.anInt3992;
	}

	@OriginalMember(owner = "client!ha", name = "bt", descriptor = "(Lclient!mk;)V")
	void method27358(@OriginalArg(0) Class419 arg0) {
		this.aClass419_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bs", descriptor = "(Lclient!mk;)V")
	void method27359(@OriginalArg(0) Class419 arg0) {
		this.aClass419_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bj", descriptor = "(Lclient!mk;)V")
	void method27360(@OriginalArg(0) Class419 arg0) {
		this.aClass419_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "by", descriptor = "(Lclient!mk;)V")
	void method27361(@OriginalArg(0) Class419 arg0) {
		this.aClass419_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bk", descriptor = "(Lclient!mi;)V")
	@Override
	public void method27297(@OriginalArg(0) Interface41 arg0) {
		this.anInterface41_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bz", descriptor = "(Lclient!ald;)V")
	@Override
	public void method27291(@OriginalArg(0) Packet arg0) {
		if (this.method27270() == Class419.aClass419_8 || this.method27270() == Class419.aClass419_6) {
			if (arg0 != null) {
				arg0.release();
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean793 && (this.anInt4004 > 0 && this.anInt4005 < this.anInt4004 || this.anInt4004 < 0);
			if (this.aList18.isEmpty()) {
				if (!local33) {
					this.method27342();
					this.method27321(Class419.aClass419_6);
				}
			} else if (!local33) {
				this.method27342();
				this.method27321(Class419.aClass419_8);
			}
			if (local33) {
				this.method27429(true);
			}
		} else {
			this.method27348(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "dy", descriptor = "(I)I")
	int method27362(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4007) {
			local14 = 8 - this.anInt4007;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local20) << local3;
			this.anInt4007 = 0;
			this.anInt3992++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local14) << local3;
			this.anInt4007 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "(Z)V")
	synchronized void method27363(@OriginalArg(0) boolean arg0) {
		this.aBoolean792 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "ez", descriptor = "([BI)V")
	void method27364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4006 = 0;
		if (this.method27282()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27338(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27338(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27338(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27340(arg0, arg1 + 7);
			local67 = this.method27324(32);
			this.anInt3984 = this.method27324(8);
			this.anInt3991 = this.method27324(32);
			this.anInt3985 = this.method27324(32);
			this.anInt3986 = this.method27324(32);
			this.anInt4001 = this.method27324(32);
			this.anInt3983 = 0x1 << this.method27324(4);
			this.anInt3987 = 0x1 << this.method27324(4);
			local112 = 0x1 << this.method27324(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean788 = true;
			this.anInt4000++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27338(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27340(arg0, arg1 + 7);
			if (this.aClass326Array2 != null) {
				this.method27333(this.aClass326Array2);
				this.aClass326Array2 = null;
			}
			this.aClass326Array2 = this.method27331(this.anInt3984, this.anInt3987);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3983 : this.anInt3987;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class326 local202 = this.method27408(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray104[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray104[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class326 local250 = this.method27408(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray104[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray104[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class326 local305 = this.method27408(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray104[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray104[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class702.method37107(local198 - 1, 221154893);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class86.method1700(local364, local362, 1215511917);
				}
				if (local67 == 0) {
					this.aClass326_5 = local202;
					this.aClass326_2 = local250;
					this.aClass326_3 = local305;
					this.anIntArray377 = local356;
				} else {
					this.aClass326_1 = local202;
					this.aClass326_6 = local250;
					this.aClass326_4 = local305;
					this.anIntArray378 = local356;
				}
			}
			this.method27343();
			local67 = this.method27324(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27324(16);
			}
			local67 = this.method27324(6) + 1;
			if (this.aClass321Array1 == null || this.aClass321Array1.length != local67) {
				this.aClass321Array1 = new Class321[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass321Array1[local112] == null) {
					this.aClass321Array1[local112] = new Class321();
				}
				this.aClass321Array1[local112].method27565(this, this.anInt3984);
			}
			local112 = this.method27324(6) + 1;
			if (this.aClass298Array1 == null || this.aClass298Array1.length != local112) {
				this.aClass298Array1 = new Class298[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass298Array1[local190] == null) {
					this.aClass298Array1[local190] = new Class298();
				}
				this.aClass298Array1[local190].method27011(this);
			}
			local190 = this.method27324(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27505(this);
			}
			local194 = this.method27324(6) + 1;
			this.aBooleanArray24 = new boolean[local194];
			this.anIntArray376 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray24[local198] = this.method27352() != 0;
				this.method27324(16);
				this.method27324(16);
				this.anIntArray376[local198] = this.method27324(8);
			}
			this.method27363(true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "bp", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method27295(@OriginalArg(0) int arg0) {
		return this.method27353(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method27319(@OriginalArg(0) int arg0) {
		return this.method27353(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "bo", descriptor = "()I")
	@Override
	public int method27292() {
		return this.method27355();
	}

	@OriginalMember(owner = "client!ha", name = "bc", descriptor = "()I")
	@Override
	public int method27298() {
		return this.method27355();
	}

	@OriginalMember(owner = "client!ha", name = "bf", descriptor = "(I)I")
	@Override
	public int method27299(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "be", descriptor = "(Lclient!ald;)V")
	@Override
	public void method27288(@OriginalArg(0) Packet arg0) {
		if (this.method27270() == Class419.aClass419_8 || this.method27270() == Class419.aClass419_6) {
			if (arg0 != null) {
				arg0.release();
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean793 && (this.anInt4004 > 0 && this.anInt4005 < this.anInt4004 || this.anInt4004 < 0);
			if (this.aList18.isEmpty()) {
				if (!local33) {
					this.method27342();
					this.method27321(Class419.aClass419_6);
				}
			} else if (!local33) {
				this.method27342();
				this.method27321(Class419.aClass419_8);
			}
			if (local33) {
				this.method27429(true);
			}
		} else {
			this.method27348(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "bx", descriptor = "(I)I")
	@Override
	public int method27301(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "bi", descriptor = "(I)I")
	@Override
	public int method27271(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "bu", descriptor = "(I)I")
	@Override
	public int method27300(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "bm", descriptor = "(I)I")
	@Override
	public int method27304(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "cw", descriptor = "(I)Lclient!hw;")
	Class326 method27365(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = aClass243_74;
		synchronized (aClass243_74) {
			@Pc(5) Class326 local5 = null;
			local5 = (Class326) aClass243_74.method26284((byte) 0);
			@Pc(12) Class326 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray104.length > arg0 && !local5.aBoolean798 && (local12 == null || local5.aFloatArray104.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray104.length;
				}
				if (local5.aFloatArray104.length == arg0 && !local5.aBoolean798) {
					break;
				}
				local5 = (Class326) aClass243_74.method26263(-321359382);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class326(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass243_74.method26282((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt4072 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray104 = local88;
				local5.aBoolean798 = true;
				local5.anInt4073 = arg0;
				if (aClass243_74.method26257((byte) -75) < arg0 * 4) {
				}
				aClass243_74.method26254(local5, (long) local5.anInt4072, local88.length * 4, (byte) -121);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray104.length; local65++) {
					local5.aFloatArray104[local65] = 0.0F;
				}
				local5.anInt4073 = arg0;
			}
			local5.aBoolean798 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "bd", descriptor = "()I")
	int method27366() {
		if (!this.method27282()) {
			throw new RuntimeException("");
		}
		return this.anInt3991;
	}

	@OriginalMember(owner = "client!ha", name = "cd", descriptor = "()Lclient!nv;")
	@Override
	public Class449 method27306() {
		return this.aClass449_1;
	}

	@OriginalMember(owner = "client!ha", name = "di", descriptor = "(I)I")
	int method27367(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4007) {
			local14 = 8 - this.anInt4007;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local20) << local3;
			this.anInt4007 = 0;
			this.anInt3992++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local14) << local3;
			this.anInt4007 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "bw", descriptor = "(I)I")
	@Override
	public int method27315(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "(F)I")
	int method27368(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "cy", descriptor = "()Lclient!nv;")
	@Override
	public Class449 method27290() {
		return this.aClass449_1;
	}

	@OriginalMember(owner = "client!ha", name = "ax", descriptor = "(Lclient!ald;)V")
	void method27369(@OriginalArg(0) Packet arg0) {
		this.aList17.add(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "cc", descriptor = "()Lclient!mm;")
	@Override
	public Class420 method27312() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!ha", name = "ep", descriptor = "()V")
	void method27370() {
		@Pc(5) int local5 = this.method27324(8) + 1;
		@Pc(8) Iterator local8 = aList16.iterator();
		@Pc(15) Class311 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass319Array1 = new Class319[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass319Array1[local69] == null) {
						this.aClass319Array1[local69] = new Class319();
					}
					this.aClass319Array1[local69].method27531(this);
				}
				@Pc(108) Class311 local108 = new Class311(this.anInt3984, this.anInt3991, this.anInt3985, this.anInt4001, this.anInt3986, this.aClass319Array1);
				aList16.add(local108);
				return;
			}
			local15 = (Class311) local8.next();
		} while (local15.anInt4013 != 0 || local15.anInt4016 != 0 || local15.aClass319Array2.length != local5 || local15.anInt4015 != this.anInt3984 || local15.anInt4014 != this.anInt3991 || local15.anInt4017 != this.anInt3986);
		this.aClass319Array1 = local15.aClass319Array2;
		for (@Pc(48) int local48 = 0; local48 < this.aClass319Array1.length; local48++) {
			this.aClass319Array1[local48].method27530(this);
		}
	}

	@OriginalMember(owner = "client!ha", name = "ce", descriptor = "(ILclient!nv;Lclient!mm;I)V")
	@Override
	public void method27314(@OriginalArg(0) int arg0, @OriginalArg(1) Class449 arg1, @OriginalArg(2) Class420 arg2, @OriginalArg(3) int arg3) {
		this.anInt3988 = arg3;
		if (!this.method27327(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass449_1 = arg1;
		this.aClass420_1 = arg2;
	}

	@OriginalMember(owner = "client!ha", name = "cs", descriptor = "(ILclient!nv;Lclient!mm;I)V")
	@Override
	public void method27303(@OriginalArg(0) int arg0, @OriginalArg(1) Class449 arg1, @OriginalArg(2) Class420 arg2, @OriginalArg(3) int arg3) {
		this.anInt3988 = arg3;
		if (!this.method27327(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass449_1 = arg1;
		this.aClass420_1 = arg2;
	}

	@OriginalMember(owner = "client!ha", name = "cj", descriptor = "(ILclient!nv;Lclient!mm;)Z")
	boolean method27371(@OriginalArg(0) int arg0, @OriginalArg(1) Class449 arg1, @OriginalArg(2) Class420 arg2) {
		if (arg1 == Class449.aClass449_2) {
			return true;
		} else if (arg1 == Class449.aClass449_4) {
			return true;
		} else if (arg1 == Class449.aClass449_3) {
			return true;
		} else {
			return arg1 == Class449.aClass449_5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "()V")
	void method27372() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "ca", descriptor = "()I")
	int method27373() {
		if (!this.aBoolean788) {
			throw new RuntimeException("");
		}
		return this.anInt3984;
	}

	@OriginalMember(owner = "client!ha", name = "ar", descriptor = "(F)I")
	int method27374(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 127.0F + 128.0F);
		if (local6 > 255) {
			return 255;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!ha", name = "do", descriptor = "()I")
	int method27375() {
		@Pc(10) int local10 = this.aByteArray79[this.anInt3992] >> this.anInt4007 & 0x1;
		this.anInt4007++;
		this.anInt3992 += this.anInt4007 >> 3;
		this.anInt4007 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!ha", name = "cm", descriptor = "()I")
	@Override
	public int method27317() {
		if (!this.aBoolean788) {
			throw new RuntimeException("");
		}
		return this.method27350() < this.anInt3988 ? this.anInt3988 : this.method27350();
	}

	@OriginalMember(owner = "client!ha", name = "ew", descriptor = "()V")
	void method27376() {
		@Pc(5) int local5 = this.method27324(8) + 1;
		@Pc(8) Iterator local8 = aList16.iterator();
		@Pc(15) Class311 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass319Array1 = new Class319[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass319Array1[local69] == null) {
						this.aClass319Array1[local69] = new Class319();
					}
					this.aClass319Array1[local69].method27531(this);
				}
				@Pc(108) Class311 local108 = new Class311(this.anInt3984, this.anInt3991, this.anInt3985, this.anInt4001, this.anInt3986, this.aClass319Array1);
				aList16.add(local108);
				return;
			}
			local15 = (Class311) local8.next();
		} while (local15.anInt4013 != 0 || local15.anInt4016 != 0 || local15.aClass319Array2.length != local5 || local15.anInt4015 != this.anInt3984 || local15.anInt4014 != this.anInt3991 || local15.anInt4017 != this.anInt3986);
		this.aClass319Array1 = local15.aClass319Array2;
		for (@Pc(48) int local48 = 0; local48 < this.aClass319Array1.length; local48++) {
			this.aClass319Array1[local48].method27530(this);
		}
	}

	@OriginalMember(owner = "client!ha", name = "cg", descriptor = "(Z)V")
	synchronized void method27377(@OriginalArg(0) boolean arg0) {
		this.aBoolean792 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "(II)[Lclient!hw;")
	Class326[] method27378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class326[] local2 = new Class326[arg0];
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			local2[local4] = this.method27408(arg1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!ha", name = "cq", descriptor = "([Lclient!hw;)V")
	void method27379(@OriginalArg(0) Class326[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27332(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "ba", descriptor = "()Lclient!mk;")
	@Override
	public Class419 method27310() {
		return this.aClass419_1;
	}

	@OriginalMember(owner = "client!ha", name = "cx", descriptor = "(I)Lclient!hw;")
	Class326 method27380(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = aClass243_74;
		synchronized (aClass243_74) {
			@Pc(5) Class326 local5 = null;
			local5 = (Class326) aClass243_74.method26284((byte) 0);
			@Pc(12) Class326 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray104.length > arg0 && !local5.aBoolean798 && (local12 == null || local5.aFloatArray104.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray104.length;
				}
				if (local5.aFloatArray104.length == arg0 && !local5.aBoolean798) {
					break;
				}
				local5 = (Class326) aClass243_74.method26263(-478449093);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class326(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass243_74.method26282((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt4072 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray104 = local88;
				local5.aBoolean798 = true;
				local5.anInt4073 = arg0;
				if (aClass243_74.method26257((byte) -34) < arg0 * 4) {
				}
				aClass243_74.method26254(local5, (long) local5.anInt4072, local88.length * 4, (byte) -56);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray104.length; local65++) {
					local5.aFloatArray104[local65] = 0.0F;
				}
				local5.anInt4073 = arg0;
			}
			local5.aBoolean798 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "cf", descriptor = "(Lclient!hw;)V")
	void method27381(@OriginalArg(0) Class326 arg0) {
		if (arg0 != null) {
			@Pc(5) Class243 local5 = aClass243_74;
			synchronized (aClass243_74) {
				arg0.aBoolean798 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "co", descriptor = "(Lclient!hw;)V")
	void method27382(@OriginalArg(0) Class326 arg0) {
		if (arg0 != null) {
			@Pc(5) Class243 local5 = aClass243_74;
			synchronized (aClass243_74) {
				arg0.aBoolean798 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "eg", descriptor = "(F)I")
	int method27383(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "an", descriptor = "()V")
	synchronized void method27384() {
		@Pc(10) int local10 = this.aPacket_14 == null ? 0 : this.aPacket_14.pos * -1380987821;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList17.iterator();
		@Pc(23) Packet local23;
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			local12 += local23.pos * -1380987821;
		}
		if (this.aPacket_14 == null) {
			this.aPacket_14 = this.method27354(local12);
			this.anInt3995 = 0;
			local10 = 0;
		} else if (this.aPacket_14.data.length - this.aPacket_14.pos * -1380987821 < local12) {
			@Pc(53) Packet local53 = this.method27354(local12 + this.anInt3995);
			local53.pdata(this.aPacket_14.data, this.aPacket_14.pos * -1380987821 - this.anInt3996, this.anInt3995);
			this.aPacket_14.release();
			this.aPacket_14 = local53;
			local10 = this.anInt3996;
		}
		local16 = this.aList17.iterator();
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			this.aPacket_14.pdata(local23.data, 0, local23.pos * -1380987821);
			this.anInt3995 += local23.pos * -1380987821;
			local23.release();
		}
		this.aPacket_14.pos = (local10 - this.anInt3996) * 1034180571;
		this.anInt3996 = 0;
		this.aList17.clear();
		label286: while (true) {
			if (this.aBoolean789) {
				if (this.aPacket_14.pos * -1380987821 < this.aPacket_14.data.length) {
					if (this.aBoolean792 && (float) (this.anInt4008 / this.method27325()) > this.aFloat285) {
						return;
					}
					if (this.aPacket_14 != null && this.anInt3995 >= 27) {
						@Pc(205) int local205 = this.aPacket_14.pos * -1380987821;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method27337(this.aPacket_14)) {
							return;
						}
						this.anInt4003++;
						if (this.anInt4009 < 0) {
							this.anInt4002++;
						}
						this.aList19.clear();
						this.aList20.clear();
						this.aPacket_14.g1();
						@Pc(246) int local246 = this.aPacket_14.g1();
						@Pc(278) int local278 = this.aPacket_14.g1() & 0xFF | (this.aPacket_14.g1() & 0xFF) << 8 | (this.aPacket_14.g1() & 0xFF) << 16 | this.aPacket_14.g1() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aPacket_14.pos += -632980048;
						@Pc(294) int local294 = this.aPacket_14.g1();
						@Pc(300) int local300 = this.aPacket_14.pos * -1380987821;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3995) {
							this.aPacket_14.pos = (local205 + this.anInt3995) * 1034180571;
							this.anInt3996 = this.aPacket_14.pos * -1380987821 - local205;
							this.aBoolean789 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean789) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aPacket_14.data[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3995) {
									this.aPacket_14.pos = (local205 + this.anInt3995) * 1034180571;
									this.anInt3996 = this.aPacket_14.pos * -1380987821 - local205;
									this.aBoolean789 = false;
									break;
								}
								if (local352 < 255) {
									this.aList19.add(local333);
									this.aList20.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean789) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList19.iterator();
						@Pc(424) Iterator local424 = this.aList20.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt4010 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method27282() && this.aBoolean791 && this.anInt4003 < this.anInt4002 && local352 < this.anInt4009) {
									this.anInt3997 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method27346(this.aPacket_14.data, local436, local440, this.anAtomicReference1);
									@Pc(492) Class326[] local492 = (Class326[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean791 && this.anInt4003 < this.anInt4002 && local352 < this.anInt4009) {
										if (this.method27282()) {
											this.anInt3994 = 0;
											if (this.aClass326Array1 == null || this.aClass326Array1 != null && (this.aClass326Array1.length != this.anInt3984 || this.aClass326Array1[0].anInt4073 != this.anInt3987)) {
												if (this.aClass326Array1 != null) {
													this.method27333(this.aClass326Array1);
												}
												this.aClass326Array1 = this.method27331(this.anInt3984, this.anInt3987);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt4073;
										this.anInt4006 += local514;
										if (this.anInt4006 > local278 && local246 == 4) {
											this.anInt4010 = this.anInt4006 - local278 - this.anInt4010;
											local514 -= this.anInt4010;
											if (this.anInt4010 > local492[0].anInt4073) {
												this.anInt4010 = local492[0].anInt4073;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method27281(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean791 && this.anInt3997 < this.anInt3989) {
											local578 = local567;
											local567 -= this.method27281(this.anInt3989 - this.anInt3997);
											if (local567 <= 0) {
												this.anInt3997 += this.method27302(local578);
												this.method27333(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3989 - this.anInt3997;
										}
										if (this.anInt3997 + local514 > this.anInt3990 && (this.anInt4005 < this.anInt4004 || this.anInt4004 < 0) && this.aBoolean793) {
											local567 -= this.method27281(this.anInt3997 + local514 - this.anInt3990 - 1);
											if (local567 <= 0) {
												this.method27333(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method27276();
										if (this.method27350() < this.method27276()) {
											@Pc(666) int local666 = this.method27276() - this.method27350();
											local567 += local567 / this.method27350() * local666;
										}
										@Pc(679) Packet local679 = this.method27354(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean791;
											if (this.anInt4004 != 0) {
												if (this.anInt3997 == this.anInt3989) {
													if (this.anInt3998 < 0) {
														this.anInt3998 = this.anInt4000;
														this.anInt4009 = local352;
													}
													this.aBoolean791 = false;
												}
												if (this.anInt3997 == this.anInt3990 && this.anInt3999 < 0) {
													this.anInt3999 = this.anInt4000;
												}
												if (this.anInt3997 > this.anInt3990 && (this.anInt4005 < this.anInt4004 || this.anInt4004 < 0) && this.aBoolean793) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3997 < this.anInt3989 || this.anInt3997 > this.anInt3990)) {
												this.anInt3997++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray104[local681];
													} else {
														local780 = local492[local766 % this.method27350()].aFloatArray104[local681];
													}
													@Pc(799) int local799;
													if (this.aClass449_1 == Class449.aClass449_2) {
														local799 = this.method27334(local780);
														if (this.aClass420_1 == Class420.aClass420_3) {
															local679.ip2(local799);
														} else {
															local679.p2(local799);
														}
													} else if (this.aClass449_1 == Class449.aClass449_3) {
														local799 = this.method27323(local780);
														if (this.aClass420_1 == Class420.aClass420_3) {
															local679.ip2(local799);
														} else {
															local679.p2(local799);
														}
													} else if (this.aClass449_1 == Class449.aClass449_4) {
														local799 = this.method27328(local780);
														local679.p1(local799);
													} else if (this.aClass449_1 == Class449.aClass449_5) {
														local799 = this.method27374(local780);
														local679.p1(local799);
													}
												}
												this.anInt3997++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList18;
										synchronized (this.aList18) {
											this.anInt4008 += this.method27302(local679.pos * -1380987821) / this.method27276();
											this.aList18.add(local679);
										}
									}
									this.method27333(local492);
									local492 = null;
								}
							}
							this.aPacket_14.pos = local304 * 1034180571;
							this.anInt3995 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aPacket_14 != null) {
						this.anInt3996 = this.anInt3995;
						this.aPacket_14.pos += this.anInt3995 * 1034180571;
					}
					this.aBoolean789 = false;
					return;
				}
				this.aBoolean789 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "dg", descriptor = "(Z)V")
	synchronized void method27385(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3983 = 0;
			this.anInt3987 = 0;
			this.aBooleanArray24 = null;
			this.anIntArray376 = null;
			this.method27333(this.aClass326Array3);
			this.aClass326Array3 = null;
			this.method27333(this.aClass326Array1);
			this.aClass326Array1 = null;
			this.anInt3994 = 0;
			this.anInt3993 = 0;
			this.aBooleanArray25 = null;
			this.method27333(this.aClass326Array2);
			this.aClass326Array2 = null;
			this.method27332(this.aClass326_5);
			this.method27332(this.aClass326_2);
			this.method27332(this.aClass326_3);
			this.method27332(this.aClass326_1);
			this.method27332(this.aClass326_6);
			this.method27332(this.aClass326_4);
			this.aClass326_5 = null;
			this.aClass326_2 = null;
			this.aClass326_3 = null;
			this.aClass326_1 = null;
			this.aClass326_6 = null;
			this.aClass326_4 = null;
			this.anIntArray377 = null;
			this.anIntArray378 = null;
		}
		this.anInt4006 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release();
		}
		this.aList17.clear();
		this.aBoolean789 = false;
		if (this.aPacket_14 != null) {
			@Pc(122) Packet local122 = this.aPacket_14;
			synchronized (this.aPacket_14) {
				this.aPacket_14.release();
				this.aPacket_14 = null;
			}
		}
		this.anInt3995 = 0;
		this.anInt3996 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList18;
			synchronized (this.aList18) {
				local155 = this.aList18.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList18.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release();
				}
			}
			this.anInt4008 = 0;
		}
		local150 = this.aList15;
		synchronized (this.aList15) {
			local155 = this.aList15.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList15.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release();
			}
		}
		this.aBoolean790 = false;
		this.anInt3997 = 0;
		this.anInt4000 = -1;
		this.anInt4003 = -1;
		if (arg0) {
			this.anInt4005++;
			this.aBoolean791 = true;
			return;
		}
		this.method27363(false);
		this.aBoolean788 = false;
		this.anInt3989 = -1;
		this.anInt3990 = -1;
		this.anInt4004 = 0;
		this.anInt4005 = 0;
		this.anInt3998 = -1;
		this.anInt3999 = -1;
		this.anInt4002 = -1;
		this.anInt4009 = -1;
		this.aBoolean791 = false;
		this.aBoolean793 = false;
	}

	@OriginalMember(owner = "client!ha", name = "dl", descriptor = "(Lclient!ald;)Z")
	boolean method27386(@OriginalArg(0) Packet arg0) {
		return arg0.g1() == 79 && arg0.g1() == 103 && arg0.g1() == 103 && arg0.g1() == 83;
	}

	@OriginalMember(owner = "client!ha", name = "dd", descriptor = "(Z)V")
	synchronized void method27387(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3983 = 0;
			this.anInt3987 = 0;
			this.aBooleanArray24 = null;
			this.anIntArray376 = null;
			this.method27333(this.aClass326Array3);
			this.aClass326Array3 = null;
			this.method27333(this.aClass326Array1);
			this.aClass326Array1 = null;
			this.anInt3994 = 0;
			this.anInt3993 = 0;
			this.aBooleanArray25 = null;
			this.method27333(this.aClass326Array2);
			this.aClass326Array2 = null;
			this.method27332(this.aClass326_5);
			this.method27332(this.aClass326_2);
			this.method27332(this.aClass326_3);
			this.method27332(this.aClass326_1);
			this.method27332(this.aClass326_6);
			this.method27332(this.aClass326_4);
			this.aClass326_5 = null;
			this.aClass326_2 = null;
			this.aClass326_3 = null;
			this.aClass326_1 = null;
			this.aClass326_6 = null;
			this.aClass326_4 = null;
			this.anIntArray377 = null;
			this.anIntArray378 = null;
		}
		this.anInt4006 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release();
		}
		this.aList17.clear();
		this.aBoolean789 = false;
		if (this.aPacket_14 != null) {
			@Pc(122) Packet local122 = this.aPacket_14;
			synchronized (this.aPacket_14) {
				this.aPacket_14.release();
				this.aPacket_14 = null;
			}
		}
		this.anInt3995 = 0;
		this.anInt3996 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList18;
			synchronized (this.aList18) {
				local155 = this.aList18.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList18.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release();
				}
			}
			this.anInt4008 = 0;
		}
		local150 = this.aList15;
		synchronized (this.aList15) {
			local155 = this.aList15.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList15.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release();
			}
		}
		this.aBoolean790 = false;
		this.anInt3997 = 0;
		this.anInt4000 = -1;
		this.anInt4003 = -1;
		if (arg0) {
			this.anInt4005++;
			this.aBoolean791 = true;
			return;
		}
		this.method27363(false);
		this.aBoolean788 = false;
		this.anInt3989 = -1;
		this.anInt3990 = -1;
		this.anInt4004 = 0;
		this.anInt4005 = 0;
		this.anInt3998 = -1;
		this.anInt3999 = -1;
		this.anInt4002 = -1;
		this.anInt4009 = -1;
		this.aBoolean791 = false;
		this.aBoolean793 = false;
	}

	@OriginalMember(owner = "client!ha", name = "dc", descriptor = "(Lclient!ald;)V")
	void method27388(@OriginalArg(0) Packet arg0) {
		this.aList17.add(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "dn", descriptor = "()Z")
	boolean method27389() {
		return this.aBoolean789;
	}

	@OriginalMember(owner = "client!ha", name = "df", descriptor = "(Lclient!ald;)Z")
	boolean method27390(@OriginalArg(0) Packet arg0) {
		return arg0.g1() == 79 && arg0.g1() == 103 && arg0.g1() == 103 && arg0.g1() == 83;
	}

	@OriginalMember(owner = "client!ha", name = "ct", descriptor = "()Lclient!nv;")
	@Override
	public Class449 method27308() {
		return this.aClass449_1;
	}

	@OriginalMember(owner = "client!ha", name = "bq", descriptor = "(I)I")
	@Override
	public int method27305(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27274().anInt4888 * -1033265337 / 8);
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Lclient!nv;")
	@Override
	public Class449 method27274() {
		return this.aClass449_1;
	}

	@OriginalMember(owner = "client!ha", name = "du", descriptor = "(I)F")
	float method27391(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ha", name = "dk", descriptor = "()V")
	void method27392() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "dw", descriptor = "(I)F")
	float method27393(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ha", name = "ds", descriptor = "(I)F")
	float method27394(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ha", name = "ej", descriptor = "(F)I")
	int method27395(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!ha", name = "de", descriptor = "()I")
	int method27396() {
		return this.anInt4007;
	}

	@OriginalMember(owner = "client!ha", name = "dv", descriptor = "()I")
	int method27397() {
		return this.anInt4007;
	}

	@OriginalMember(owner = "client!ha", name = "dm", descriptor = "([BI)V")
	void method27398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray79 = arg0;
		this.anInt3992 = arg1;
		this.anInt4007 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "dq", descriptor = "([BI)V")
	void method27399(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray79 = arg0;
		this.anInt3992 = arg1;
		this.anInt4007 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "ci", descriptor = "()I")
	@Override
	public int method27316() {
		if (!this.aBoolean788) {
			throw new RuntimeException("");
		}
		return this.method27350() < this.anInt3988 ? this.anInt3988 : this.method27350();
	}

	@OriginalMember(owner = "client!ha", name = "dp", descriptor = "()I")
	int method27400() {
		@Pc(10) int local10 = this.aByteArray79[this.anInt3992] >> this.anInt4007 & 0x1;
		this.anInt4007++;
		this.anInt3992 += this.anInt4007 >> 3;
		this.anInt4007 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!ha", name = "dj", descriptor = "()I")
	int method27401() {
		@Pc(10) int local10 = this.aByteArray79[this.anInt3992] >> this.anInt4007 & 0x1;
		this.anInt4007++;
		this.anInt3992 += this.anInt4007 >> 3;
		this.anInt4007 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!ha", name = "cp", descriptor = "(Z)V")
	synchronized void method27402(@OriginalArg(0) boolean arg0) {
		this.aBoolean792 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "dz", descriptor = "(I)I")
	int method27403(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4007) {
			local14 = 8 - this.anInt4007;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local20) << local3;
			this.anInt4007 = 0;
			this.anInt3992++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt3992] >> this.anInt4007 & local14) << local3;
			this.anInt4007 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(Lclient!mi;)V")
	@Override
	public void method27269(@OriginalArg(0) Interface41 arg0) {
		this.anInterface41_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "cr", descriptor = "()I")
	int method27404() {
		if (!this.aBoolean788) {
			throw new RuntimeException("");
		}
		return this.anInt3984;
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method27279(@OriginalArg(0) int arg0) {
		return this.method27353(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "ec", descriptor = "()V")
	void method27405() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "ev", descriptor = "()V")
	void method27406() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "ed", descriptor = "()V")
	void method27407() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "(I)Lclient!hw;")
	Class326 method27408(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = aClass243_74;
		synchronized (aClass243_74) {
			@Pc(5) Class326 local5 = null;
			local5 = (Class326) aClass243_74.method26284((byte) 0);
			@Pc(12) Class326 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray104.length > arg0 && !local5.aBoolean798 && (local12 == null || local5.aFloatArray104.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray104.length;
				}
				if (local5.aFloatArray104.length == arg0 && !local5.aBoolean798) {
					break;
				}
				local5 = (Class326) aClass243_74.method26263(1503003589);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class326(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass243_74.method26282((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt4072 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray104 = local88;
				local5.aBoolean798 = true;
				local5.anInt4073 = arg0;
				if (aClass243_74.method26257((byte) 1) < arg0 * 4) {
				}
				aClass243_74.method26254(local5, (long) local5.anInt4072, local88.length * 4, (byte) -103);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray104.length; local65++) {
					local5.aFloatArray104[local65] = 0.0F;
				}
				local5.anInt4073 = arg0;
			}
			local5.aBoolean798 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "dx", descriptor = "()I")
	int method27409() {
		return this.anInt4007;
	}

	@OriginalMember(owner = "client!ha", name = "cz", descriptor = "(Lclient!hw;)V")
	void method27410(@OriginalArg(0) Class326 arg0) {
		if (arg0 != null) {
			@Pc(5) Class243 local5 = aClass243_74;
			synchronized (aClass243_74) {
				arg0.aBoolean798 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "em", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z")
	boolean method27411(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27340(arg0, arg1);
			@Pc(21) int local21 = this.method27352();
			if (local21 != 0) {
				this.method27344(arg0, arg1);
				return false;
			} else if (this.method27282()) {
				@Pc(46) int local46 = this.method27324(this.method27345(this.anIntArray376.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray24[local46];
				@Pc(59) int local59 = local51 ? this.anInt3987 : this.anInt3983;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27352() != 0;
					local63 = this.method27352() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3983 >> 2);
					local105 = (local59 >> 2) + (this.anInt3983 >> 2);
					local110 = this.anInt3983 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3983 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3983 >> 2);
					local150 = this.anInt3983 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray376[local46]];
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3984) {
					this.aBooleanArray26 = new boolean[this.anInt3984];
					this.aBooleanArray27 = new boolean[this.anInt3984];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
					local209 = local167.anIntArray382[local202];
					this.aBooleanArray26[local188] = !this.aClass321Array1[local209].method27579(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray26[local188];
				}
				for (local188 = 0; local188 < local167.anInt4023; local188++) {
					if (!this.aBooleanArray26[local167.anIntArray384[local188]] || !this.aBooleanArray26[local167.anIntArray385[local188]]) {
						this.aBooleanArray26[local167.anIntArray384[local188]] = false;
						this.aBooleanArray26[local167.anIntArray385[local188]] = false;
					}
				}
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt3984) {
					this.aBooleanArray28 = new boolean[this.anInt3984];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4022; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						local209 = local167.anIntArray381 == null ? local188 : local167.anIntArray381[local297];
						if (local209 == local188) {
							this.aBooleanArray28[local202++] = this.aBooleanArray26[local297];
						}
					}
					@Pc(333) Class298 local333 = this.aClass298Array1[local167.anIntArray383[local188]];
					@Pc(335) Class326[] local335 = null;
					if (local333.anInt3957 == 2) {
						@Pc(347) Class326[] local347 = this.method27331(1, this.anInt3984 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method27007(local347, local59 >> 1, this.aBooleanArray28);
								local335 = this.aClass326Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3984; local354++) {
										try {
											local335[local354].aFloatArray104[local349] = local347[0].aFloatArray104[this.anInt3984 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27333(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3984; local354++) {
								try {
									local347[0].aFloatArray104[local349 * this.anInt3984 + local354] = this.aClass326Array2[local354].aFloatArray104[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method27007(this.aClass326Array2, local59 >> 1, this.aBooleanArray28);
					}
					if (local167.anIntArray381 == null) {
						if (this.aClass326Array2 != local335) {
							this.method27333(this.aClass326Array2);
						}
						this.aClass326Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3984; local455++) {
							local349 = local167.anIntArray381[local455];
							if (local349 == local188) {
								this.aClass326Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4023 - 1; local188 >= 0; local188--) {
					@Pc(506) Class326 local506 = this.aClass326Array2[local167.anIntArray384[local188]];
					@Pc(514) Class326 local514 = this.aClass326Array2[local167.anIntArray385[local188]];
					for (local209 = 0; local209 < local506.anInt4073; local209++) {
						@Pc(525) float local525 = local506.aFloatArray104[local209];
						@Pc(530) float local530 = local514.aFloatArray104[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray104[local209] = local544;
						local514.aFloatArray104[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray26.length; local188++) {
					this.aBooleanArray26[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (!this.aBooleanArray26[local188]) {
						local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
						local209 = local167.anIntArray382[local202];
						this.aClass321Array1[local209].method27572(local188);
						this.aClass321Array1[local209].method27567(this.aClass326Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (this.aBooleanArray26[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass326Array2[local188].aFloatArray104[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class326 local699 = this.aClass326Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray104[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray104[local349] = -local699.aFloatArray104[local59 - local349 - 1];
						}
						@Pc(742) Class326 local742 = local51 ? this.aClass326_1 : this.aClass326_5;
						@Pc(750) Class326 local750 = local51 ? this.aClass326_6 : this.aClass326_2;
						@Pc(758) Class326 local758 = local51 ? this.aClass326_4 : this.aClass326_3;
						@Pc(766) int[] local766 = local51 ? this.anIntArray378 : this.anIntArray377;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray104[local768 * 4] - local699.aFloatArray104[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray104[local768 * 4 + 2] - local699.aFloatArray104[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray104[local768 * 2];
							local825 = local742.aFloatArray104[local768 * 2 + 1];
							local699.aFloatArray104[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray104[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray104[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray104[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray104[local768 * 4 + 3];
							local825 = local699.aFloatArray104[local768 * 4 + 1];
							local699.aFloatArray104[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray104[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray104[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray104[local202 - 3 - local768 * 4];
							local699.aFloatArray104[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray104[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class702.method37107(local59 - 1, 221154893);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray104[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray104[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray104[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray104[local1042 - 3 - local1055];
									local699.aFloatArray104[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray104[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray104[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray104[local1044 * local1017 + 1];
									local699.aFloatArray104[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray104[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray104[local1017 + 1];
								local699.aFloatArray104[local1017 + 1] = local699.aFloatArray104[local1019 + 1];
								local699.aFloatArray104[local1019 + 1] = local943;
								local943 = local699.aFloatArray104[local1017 + 3];
								local699.aFloatArray104[local1017 + 3] = local699.aFloatArray104[local1019 + 3];
								local699.aFloatArray104[local1019 + 3] = local943;
								local943 = local699.aFloatArray104[local1017 + 5];
								local699.aFloatArray104[local1017 + 5] = local699.aFloatArray104[local1019 + 5];
								local699.aFloatArray104[local1019 + 5] = local943;
								local943 = local699.aFloatArray104[local1017 + 7];
								local699.aFloatArray104[local1017 + 7] = local699.aFloatArray104[local1019 + 7];
								local699.aFloatArray104[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4];
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 1];
							local699.aFloatArray104[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 2];
							local699.aFloatArray104[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray104[local1002 * 2];
							local816 = local758.aFloatArray104[local1002 * 2 + 1];
							local825 = local699.aFloatArray104[local202 + local1002 * 2];
							local943 = local699.aFloatArray104[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray104[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray104[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray104[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray104[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2] + local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2 + 1];
							local699.aFloatArray104[local202 - 1 - local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2 + 1] - local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local59 - local297 + local1002] = -local699.aFloatArray104[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local297 + local1002] = -local699.aFloatArray104[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local202 + local1002] = local699.aFloatArray104[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class326[] local1816 = null;
				if (this.anInt3994 > 0) {
					local202 = this.anInt3994 + local59 >> 2;
					local1816 = this.method27331(this.anInt3984, local202);
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						if (!this.aBooleanArray25[local297]) {
							for (local209 = 0; local209 < this.anInt3993; local209++) {
								local455 = (this.anInt3994 >> 1) + local209;
								local1816[local297].aFloatArray104[local209] += this.aClass326Array1[local297].aFloatArray104[local455];
							}
						}
						if (!this.aBooleanArray26[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt4073 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray104[local455] += this.aClass326Array2[local297].aFloatArray104[local209];
							}
						}
					}
				}
				@Pc(1920) Class326[] local1920 = this.aClass326Array1;
				this.aClass326Array1 = this.aClass326Array2;
				this.aClass326Array2 = local1920;
				this.anInt3994 = local59;
				this.anInt3993 = local145 - (local59 >> 1);
				this.aBooleanArray25 = this.aBooleanArray26;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "ef", descriptor = "([BI)V")
	void method27412(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4006 = 0;
		if (this.method27282()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27338(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27338(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27338(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27340(arg0, arg1 + 7);
			local67 = this.method27324(32);
			this.anInt3984 = this.method27324(8);
			this.anInt3991 = this.method27324(32);
			this.anInt3985 = this.method27324(32);
			this.anInt3986 = this.method27324(32);
			this.anInt4001 = this.method27324(32);
			this.anInt3983 = 0x1 << this.method27324(4);
			this.anInt3987 = 0x1 << this.method27324(4);
			local112 = 0x1 << this.method27324(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean788 = true;
			this.anInt4000++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27338(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27340(arg0, arg1 + 7);
			if (this.aClass326Array2 != null) {
				this.method27333(this.aClass326Array2);
				this.aClass326Array2 = null;
			}
			this.aClass326Array2 = this.method27331(this.anInt3984, this.anInt3987);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3983 : this.anInt3987;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class326 local202 = this.method27408(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray104[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray104[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class326 local250 = this.method27408(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray104[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray104[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class326 local305 = this.method27408(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray104[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray104[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class702.method37107(local198 - 1, 221154893);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class86.method1700(local364, local362, 1026807747);
				}
				if (local67 == 0) {
					this.aClass326_5 = local202;
					this.aClass326_2 = local250;
					this.aClass326_3 = local305;
					this.anIntArray377 = local356;
				} else {
					this.aClass326_1 = local202;
					this.aClass326_6 = local250;
					this.aClass326_4 = local305;
					this.anIntArray378 = local356;
				}
			}
			this.method27343();
			local67 = this.method27324(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27324(16);
			}
			local67 = this.method27324(6) + 1;
			if (this.aClass321Array1 == null || this.aClass321Array1.length != local67) {
				this.aClass321Array1 = new Class321[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass321Array1[local112] == null) {
					this.aClass321Array1[local112] = new Class321();
				}
				this.aClass321Array1[local112].method27565(this, this.anInt3984);
			}
			local112 = this.method27324(6) + 1;
			if (this.aClass298Array1 == null || this.aClass298Array1.length != local112) {
				this.aClass298Array1 = new Class298[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass298Array1[local190] == null) {
					this.aClass298Array1[local190] = new Class298();
				}
				this.aClass298Array1[local190].method27011(this);
			}
			local190 = this.method27324(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27505(this);
			}
			local194 = this.method27324(6) + 1;
			this.aBooleanArray24 = new boolean[local194];
			this.anIntArray376 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray24[local198] = this.method27352() != 0;
				this.method27324(16);
				this.method27324(16);
				this.anIntArray376[local198] = this.method27324(8);
			}
			this.method27363(true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "dh", descriptor = "(Z)V")
	synchronized void method27413(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3983 = 0;
			this.anInt3987 = 0;
			this.aBooleanArray24 = null;
			this.anIntArray376 = null;
			this.method27333(this.aClass326Array3);
			this.aClass326Array3 = null;
			this.method27333(this.aClass326Array1);
			this.aClass326Array1 = null;
			this.anInt3994 = 0;
			this.anInt3993 = 0;
			this.aBooleanArray25 = null;
			this.method27333(this.aClass326Array2);
			this.aClass326Array2 = null;
			this.method27332(this.aClass326_5);
			this.method27332(this.aClass326_2);
			this.method27332(this.aClass326_3);
			this.method27332(this.aClass326_1);
			this.method27332(this.aClass326_6);
			this.method27332(this.aClass326_4);
			this.aClass326_5 = null;
			this.aClass326_2 = null;
			this.aClass326_3 = null;
			this.aClass326_1 = null;
			this.aClass326_6 = null;
			this.aClass326_4 = null;
			this.anIntArray377 = null;
			this.anIntArray378 = null;
		}
		this.anInt4006 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release();
		}
		this.aList17.clear();
		this.aBoolean789 = false;
		if (this.aPacket_14 != null) {
			@Pc(122) Packet local122 = this.aPacket_14;
			synchronized (this.aPacket_14) {
				this.aPacket_14.release();
				this.aPacket_14 = null;
			}
		}
		this.anInt3995 = 0;
		this.anInt3996 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList18;
			synchronized (this.aList18) {
				local155 = this.aList18.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList18.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release();
				}
			}
			this.anInt4008 = 0;
		}
		local150 = this.aList15;
		synchronized (this.aList15) {
			local155 = this.aList15.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList15.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release();
			}
		}
		this.aBoolean790 = false;
		this.anInt3997 = 0;
		this.anInt4000 = -1;
		this.anInt4003 = -1;
		if (arg0) {
			this.anInt4005++;
			this.aBoolean791 = true;
			return;
		}
		this.method27363(false);
		this.aBoolean788 = false;
		this.anInt3989 = -1;
		this.anInt3990 = -1;
		this.anInt4004 = 0;
		this.anInt4005 = 0;
		this.anInt3998 = -1;
		this.anInt3999 = -1;
		this.anInt4002 = -1;
		this.anInt4009 = -1;
		this.aBoolean791 = false;
		this.aBoolean793 = false;
	}

	@OriginalMember(owner = "client!ha", name = "ey", descriptor = "([BI)V")
	void method27414(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4006 = 0;
		if (this.method27282()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27338(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27338(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27338(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27340(arg0, arg1 + 7);
			local67 = this.method27324(32);
			this.anInt3984 = this.method27324(8);
			this.anInt3991 = this.method27324(32);
			this.anInt3985 = this.method27324(32);
			this.anInt3986 = this.method27324(32);
			this.anInt4001 = this.method27324(32);
			this.anInt3983 = 0x1 << this.method27324(4);
			this.anInt3987 = 0x1 << this.method27324(4);
			local112 = 0x1 << this.method27324(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean788 = true;
			this.anInt4000++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27338(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27340(arg0, arg1 + 7);
			if (this.aClass326Array2 != null) {
				this.method27333(this.aClass326Array2);
				this.aClass326Array2 = null;
			}
			this.aClass326Array2 = this.method27331(this.anInt3984, this.anInt3987);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3983 : this.anInt3987;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class326 local202 = this.method27408(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray104[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray104[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class326 local250 = this.method27408(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray104[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray104[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class326 local305 = this.method27408(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray104[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray104[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class702.method37107(local198 - 1, 221154893);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class86.method1700(local364, local362, 283992574);
				}
				if (local67 == 0) {
					this.aClass326_5 = local202;
					this.aClass326_2 = local250;
					this.aClass326_3 = local305;
					this.anIntArray377 = local356;
				} else {
					this.aClass326_1 = local202;
					this.aClass326_6 = local250;
					this.aClass326_4 = local305;
					this.anIntArray378 = local356;
				}
			}
			this.method27343();
			local67 = this.method27324(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27324(16);
			}
			local67 = this.method27324(6) + 1;
			if (this.aClass321Array1 == null || this.aClass321Array1.length != local67) {
				this.aClass321Array1 = new Class321[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass321Array1[local112] == null) {
					this.aClass321Array1[local112] = new Class321();
				}
				this.aClass321Array1[local112].method27565(this, this.anInt3984);
			}
			local112 = this.method27324(6) + 1;
			if (this.aClass298Array1 == null || this.aClass298Array1.length != local112) {
				this.aClass298Array1 = new Class298[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass298Array1[local190] == null) {
					this.aClass298Array1[local190] = new Class298();
				}
				this.aClass298Array1[local190].method27011(this);
			}
			local190 = this.method27324(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27505(this);
			}
			local194 = this.method27324(6) + 1;
			this.aBooleanArray24 = new boolean[local194];
			this.anIntArray376 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray24[local198] = this.method27352() != 0;
				this.method27324(16);
				this.method27324(16);
				this.anIntArray376[local198] = this.method27324(8);
			}
			this.method27363(true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "ek", descriptor = "(I)I")
	int method27415(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "ea", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z")
	boolean method27416(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27340(arg0, arg1);
			@Pc(21) int local21 = this.method27352();
			if (local21 != 0) {
				this.method27344(arg0, arg1);
				return false;
			} else if (this.method27282()) {
				@Pc(46) int local46 = this.method27324(this.method27345(this.anIntArray376.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray24[local46];
				@Pc(59) int local59 = local51 ? this.anInt3987 : this.anInt3983;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27352() != 0;
					local63 = this.method27352() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3983 >> 2);
					local105 = (local59 >> 2) + (this.anInt3983 >> 2);
					local110 = this.anInt3983 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3983 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3983 >> 2);
					local150 = this.anInt3983 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray376[local46]];
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3984) {
					this.aBooleanArray26 = new boolean[this.anInt3984];
					this.aBooleanArray27 = new boolean[this.anInt3984];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
					local209 = local167.anIntArray382[local202];
					this.aBooleanArray26[local188] = !this.aClass321Array1[local209].method27579(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray26[local188];
				}
				for (local188 = 0; local188 < local167.anInt4023; local188++) {
					if (!this.aBooleanArray26[local167.anIntArray384[local188]] || !this.aBooleanArray26[local167.anIntArray385[local188]]) {
						this.aBooleanArray26[local167.anIntArray384[local188]] = false;
						this.aBooleanArray26[local167.anIntArray385[local188]] = false;
					}
				}
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt3984) {
					this.aBooleanArray28 = new boolean[this.anInt3984];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4022; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						local209 = local167.anIntArray381 == null ? local188 : local167.anIntArray381[local297];
						if (local209 == local188) {
							this.aBooleanArray28[local202++] = this.aBooleanArray26[local297];
						}
					}
					@Pc(333) Class298 local333 = this.aClass298Array1[local167.anIntArray383[local188]];
					@Pc(335) Class326[] local335 = null;
					if (local333.anInt3957 == 2) {
						@Pc(347) Class326[] local347 = this.method27331(1, this.anInt3984 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method27007(local347, local59 >> 1, this.aBooleanArray28);
								local335 = this.aClass326Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3984; local354++) {
										try {
											local335[local354].aFloatArray104[local349] = local347[0].aFloatArray104[this.anInt3984 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27333(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3984; local354++) {
								try {
									local347[0].aFloatArray104[local349 * this.anInt3984 + local354] = this.aClass326Array2[local354].aFloatArray104[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method27007(this.aClass326Array2, local59 >> 1, this.aBooleanArray28);
					}
					if (local167.anIntArray381 == null) {
						if (this.aClass326Array2 != local335) {
							this.method27333(this.aClass326Array2);
						}
						this.aClass326Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3984; local455++) {
							local349 = local167.anIntArray381[local455];
							if (local349 == local188) {
								this.aClass326Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4023 - 1; local188 >= 0; local188--) {
					@Pc(506) Class326 local506 = this.aClass326Array2[local167.anIntArray384[local188]];
					@Pc(514) Class326 local514 = this.aClass326Array2[local167.anIntArray385[local188]];
					for (local209 = 0; local209 < local506.anInt4073; local209++) {
						@Pc(525) float local525 = local506.aFloatArray104[local209];
						@Pc(530) float local530 = local514.aFloatArray104[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray104[local209] = local544;
						local514.aFloatArray104[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray26.length; local188++) {
					this.aBooleanArray26[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (!this.aBooleanArray26[local188]) {
						local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
						local209 = local167.anIntArray382[local202];
						this.aClass321Array1[local209].method27572(local188);
						this.aClass321Array1[local209].method27567(this.aClass326Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (this.aBooleanArray26[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass326Array2[local188].aFloatArray104[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class326 local699 = this.aClass326Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray104[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray104[local349] = -local699.aFloatArray104[local59 - local349 - 1];
						}
						@Pc(742) Class326 local742 = local51 ? this.aClass326_1 : this.aClass326_5;
						@Pc(750) Class326 local750 = local51 ? this.aClass326_6 : this.aClass326_2;
						@Pc(758) Class326 local758 = local51 ? this.aClass326_4 : this.aClass326_3;
						@Pc(766) int[] local766 = local51 ? this.anIntArray378 : this.anIntArray377;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray104[local768 * 4] - local699.aFloatArray104[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray104[local768 * 4 + 2] - local699.aFloatArray104[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray104[local768 * 2];
							local825 = local742.aFloatArray104[local768 * 2 + 1];
							local699.aFloatArray104[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray104[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray104[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray104[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray104[local768 * 4 + 3];
							local825 = local699.aFloatArray104[local768 * 4 + 1];
							local699.aFloatArray104[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray104[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray104[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray104[local202 - 3 - local768 * 4];
							local699.aFloatArray104[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray104[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class702.method37107(local59 - 1, 221154893);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray104[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray104[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray104[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray104[local1042 - 3 - local1055];
									local699.aFloatArray104[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray104[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray104[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray104[local1044 * local1017 + 1];
									local699.aFloatArray104[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray104[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray104[local1017 + 1];
								local699.aFloatArray104[local1017 + 1] = local699.aFloatArray104[local1019 + 1];
								local699.aFloatArray104[local1019 + 1] = local943;
								local943 = local699.aFloatArray104[local1017 + 3];
								local699.aFloatArray104[local1017 + 3] = local699.aFloatArray104[local1019 + 3];
								local699.aFloatArray104[local1019 + 3] = local943;
								local943 = local699.aFloatArray104[local1017 + 5];
								local699.aFloatArray104[local1017 + 5] = local699.aFloatArray104[local1019 + 5];
								local699.aFloatArray104[local1019 + 5] = local943;
								local943 = local699.aFloatArray104[local1017 + 7];
								local699.aFloatArray104[local1017 + 7] = local699.aFloatArray104[local1019 + 7];
								local699.aFloatArray104[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4];
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 1];
							local699.aFloatArray104[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 2];
							local699.aFloatArray104[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray104[local1002 * 2];
							local816 = local758.aFloatArray104[local1002 * 2 + 1];
							local825 = local699.aFloatArray104[local202 + local1002 * 2];
							local943 = local699.aFloatArray104[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray104[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray104[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray104[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray104[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2] + local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2 + 1];
							local699.aFloatArray104[local202 - 1 - local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2 + 1] - local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local59 - local297 + local1002] = -local699.aFloatArray104[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local297 + local1002] = -local699.aFloatArray104[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local202 + local1002] = local699.aFloatArray104[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class326[] local1816 = null;
				if (this.anInt3994 > 0) {
					local202 = this.anInt3994 + local59 >> 2;
					local1816 = this.method27331(this.anInt3984, local202);
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						if (!this.aBooleanArray25[local297]) {
							for (local209 = 0; local209 < this.anInt3993; local209++) {
								local455 = (this.anInt3994 >> 1) + local209;
								local1816[local297].aFloatArray104[local209] += this.aClass326Array1[local297].aFloatArray104[local455];
							}
						}
						if (!this.aBooleanArray26[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt4073 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray104[local455] += this.aClass326Array2[local297].aFloatArray104[local209];
							}
						}
					}
				}
				@Pc(1920) Class326[] local1920 = this.aClass326Array1;
				this.aClass326Array1 = this.aClass326Array2;
				this.aClass326Array2 = local1920;
				this.anInt3994 = local59;
				this.anInt3993 = local145 - (local59 >> 1);
				this.aBooleanArray25 = this.aBooleanArray26;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "eh", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z")
	boolean method27417(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27340(arg0, arg1);
			@Pc(21) int local21 = this.method27352();
			if (local21 != 0) {
				this.method27344(arg0, arg1);
				return false;
			} else if (this.method27282()) {
				@Pc(46) int local46 = this.method27324(this.method27345(this.anIntArray376.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray24[local46];
				@Pc(59) int local59 = local51 ? this.anInt3987 : this.anInt3983;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27352() != 0;
					local63 = this.method27352() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3983 >> 2);
					local105 = (local59 >> 2) + (this.anInt3983 >> 2);
					local110 = this.anInt3983 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3983 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3983 >> 2);
					local150 = this.anInt3983 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray376[local46]];
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3984) {
					this.aBooleanArray26 = new boolean[this.anInt3984];
					this.aBooleanArray27 = new boolean[this.anInt3984];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
					local209 = local167.anIntArray382[local202];
					this.aBooleanArray26[local188] = !this.aClass321Array1[local209].method27579(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray26[local188];
				}
				for (local188 = 0; local188 < local167.anInt4023; local188++) {
					if (!this.aBooleanArray26[local167.anIntArray384[local188]] || !this.aBooleanArray26[local167.anIntArray385[local188]]) {
						this.aBooleanArray26[local167.anIntArray384[local188]] = false;
						this.aBooleanArray26[local167.anIntArray385[local188]] = false;
					}
				}
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt3984) {
					this.aBooleanArray28 = new boolean[this.anInt3984];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4022; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						local209 = local167.anIntArray381 == null ? local188 : local167.anIntArray381[local297];
						if (local209 == local188) {
							this.aBooleanArray28[local202++] = this.aBooleanArray26[local297];
						}
					}
					@Pc(333) Class298 local333 = this.aClass298Array1[local167.anIntArray383[local188]];
					@Pc(335) Class326[] local335 = null;
					if (local333.anInt3957 == 2) {
						@Pc(347) Class326[] local347 = this.method27331(1, this.anInt3984 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method27007(local347, local59 >> 1, this.aBooleanArray28);
								local335 = this.aClass326Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3984; local354++) {
										try {
											local335[local354].aFloatArray104[local349] = local347[0].aFloatArray104[this.anInt3984 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27333(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3984; local354++) {
								try {
									local347[0].aFloatArray104[local349 * this.anInt3984 + local354] = this.aClass326Array2[local354].aFloatArray104[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method27007(this.aClass326Array2, local59 >> 1, this.aBooleanArray28);
					}
					if (local167.anIntArray381 == null) {
						if (this.aClass326Array2 != local335) {
							this.method27333(this.aClass326Array2);
						}
						this.aClass326Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3984; local455++) {
							local349 = local167.anIntArray381[local455];
							if (local349 == local188) {
								this.aClass326Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4023 - 1; local188 >= 0; local188--) {
					@Pc(506) Class326 local506 = this.aClass326Array2[local167.anIntArray384[local188]];
					@Pc(514) Class326 local514 = this.aClass326Array2[local167.anIntArray385[local188]];
					for (local209 = 0; local209 < local506.anInt4073; local209++) {
						@Pc(525) float local525 = local506.aFloatArray104[local209];
						@Pc(530) float local530 = local514.aFloatArray104[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray104[local209] = local544;
						local514.aFloatArray104[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray26.length; local188++) {
					this.aBooleanArray26[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (!this.aBooleanArray26[local188]) {
						local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
						local209 = local167.anIntArray382[local202];
						this.aClass321Array1[local209].method27572(local188);
						this.aClass321Array1[local209].method27567(this.aClass326Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (this.aBooleanArray26[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass326Array2[local188].aFloatArray104[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class326 local699 = this.aClass326Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray104[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray104[local349] = -local699.aFloatArray104[local59 - local349 - 1];
						}
						@Pc(742) Class326 local742 = local51 ? this.aClass326_1 : this.aClass326_5;
						@Pc(750) Class326 local750 = local51 ? this.aClass326_6 : this.aClass326_2;
						@Pc(758) Class326 local758 = local51 ? this.aClass326_4 : this.aClass326_3;
						@Pc(766) int[] local766 = local51 ? this.anIntArray378 : this.anIntArray377;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray104[local768 * 4] - local699.aFloatArray104[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray104[local768 * 4 + 2] - local699.aFloatArray104[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray104[local768 * 2];
							local825 = local742.aFloatArray104[local768 * 2 + 1];
							local699.aFloatArray104[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray104[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray104[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray104[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray104[local768 * 4 + 3];
							local825 = local699.aFloatArray104[local768 * 4 + 1];
							local699.aFloatArray104[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray104[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray104[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray104[local202 - 3 - local768 * 4];
							local699.aFloatArray104[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray104[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class702.method37107(local59 - 1, 221154893);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray104[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray104[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray104[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray104[local1042 - 3 - local1055];
									local699.aFloatArray104[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray104[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray104[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray104[local1044 * local1017 + 1];
									local699.aFloatArray104[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray104[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray104[local1017 + 1];
								local699.aFloatArray104[local1017 + 1] = local699.aFloatArray104[local1019 + 1];
								local699.aFloatArray104[local1019 + 1] = local943;
								local943 = local699.aFloatArray104[local1017 + 3];
								local699.aFloatArray104[local1017 + 3] = local699.aFloatArray104[local1019 + 3];
								local699.aFloatArray104[local1019 + 3] = local943;
								local943 = local699.aFloatArray104[local1017 + 5];
								local699.aFloatArray104[local1017 + 5] = local699.aFloatArray104[local1019 + 5];
								local699.aFloatArray104[local1019 + 5] = local943;
								local943 = local699.aFloatArray104[local1017 + 7];
								local699.aFloatArray104[local1017 + 7] = local699.aFloatArray104[local1019 + 7];
								local699.aFloatArray104[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4];
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 1];
							local699.aFloatArray104[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 2];
							local699.aFloatArray104[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray104[local1002 * 2];
							local816 = local758.aFloatArray104[local1002 * 2 + 1];
							local825 = local699.aFloatArray104[local202 + local1002 * 2];
							local943 = local699.aFloatArray104[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray104[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray104[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray104[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray104[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2] + local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2 + 1];
							local699.aFloatArray104[local202 - 1 - local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2 + 1] - local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local59 - local297 + local1002] = -local699.aFloatArray104[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local297 + local1002] = -local699.aFloatArray104[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local202 + local1002] = local699.aFloatArray104[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class326[] local1816 = null;
				if (this.anInt3994 > 0) {
					local202 = this.anInt3994 + local59 >> 2;
					local1816 = this.method27331(this.anInt3984, local202);
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						if (!this.aBooleanArray25[local297]) {
							for (local209 = 0; local209 < this.anInt3993; local209++) {
								local455 = (this.anInt3994 >> 1) + local209;
								local1816[local297].aFloatArray104[local209] += this.aClass326Array1[local297].aFloatArray104[local455];
							}
						}
						if (!this.aBooleanArray26[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt4073 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray104[local455] += this.aClass326Array2[local297].aFloatArray104[local209];
							}
						}
					}
				}
				@Pc(1920) Class326[] local1920 = this.aClass326Array1;
				this.aClass326Array1 = this.aClass326Array2;
				this.aClass326Array2 = local1920;
				this.anInt3994 = local59;
				this.anInt3993 = local145 - (local59 >> 1);
				this.aBooleanArray25 = this.aBooleanArray26;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "el", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z")
	boolean method27418(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27340(arg0, arg1);
			@Pc(21) int local21 = this.method27352();
			if (local21 != 0) {
				this.method27344(arg0, arg1);
				return false;
			} else if (this.method27282()) {
				@Pc(46) int local46 = this.method27324(this.method27345(this.anIntArray376.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray24[local46];
				@Pc(59) int local59 = local51 ? this.anInt3987 : this.anInt3983;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27352() != 0;
					local63 = this.method27352() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3983 >> 2);
					local105 = (local59 >> 2) + (this.anInt3983 >> 2);
					local110 = this.anInt3983 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3983 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3983 >> 2);
					local150 = this.anInt3983 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray376[local46]];
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3984) {
					this.aBooleanArray26 = new boolean[this.anInt3984];
					this.aBooleanArray27 = new boolean[this.anInt3984];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
					local209 = local167.anIntArray382[local202];
					this.aBooleanArray26[local188] = !this.aClass321Array1[local209].method27579(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray26[local188];
				}
				for (local188 = 0; local188 < local167.anInt4023; local188++) {
					if (!this.aBooleanArray26[local167.anIntArray384[local188]] || !this.aBooleanArray26[local167.anIntArray385[local188]]) {
						this.aBooleanArray26[local167.anIntArray384[local188]] = false;
						this.aBooleanArray26[local167.anIntArray385[local188]] = false;
					}
				}
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt3984) {
					this.aBooleanArray28 = new boolean[this.anInt3984];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4022; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						local209 = local167.anIntArray381 == null ? local188 : local167.anIntArray381[local297];
						if (local209 == local188) {
							this.aBooleanArray28[local202++] = this.aBooleanArray26[local297];
						}
					}
					@Pc(333) Class298 local333 = this.aClass298Array1[local167.anIntArray383[local188]];
					@Pc(335) Class326[] local335 = null;
					if (local333.anInt3957 == 2) {
						@Pc(347) Class326[] local347 = this.method27331(1, this.anInt3984 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method27007(local347, local59 >> 1, this.aBooleanArray28);
								local335 = this.aClass326Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3984; local354++) {
										try {
											local335[local354].aFloatArray104[local349] = local347[0].aFloatArray104[this.anInt3984 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27333(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3984; local354++) {
								try {
									local347[0].aFloatArray104[local349 * this.anInt3984 + local354] = this.aClass326Array2[local354].aFloatArray104[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method27007(this.aClass326Array2, local59 >> 1, this.aBooleanArray28);
					}
					if (local167.anIntArray381 == null) {
						if (this.aClass326Array2 != local335) {
							this.method27333(this.aClass326Array2);
						}
						this.aClass326Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3984; local455++) {
							local349 = local167.anIntArray381[local455];
							if (local349 == local188) {
								this.aClass326Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4023 - 1; local188 >= 0; local188--) {
					@Pc(506) Class326 local506 = this.aClass326Array2[local167.anIntArray384[local188]];
					@Pc(514) Class326 local514 = this.aClass326Array2[local167.anIntArray385[local188]];
					for (local209 = 0; local209 < local506.anInt4073; local209++) {
						@Pc(525) float local525 = local506.aFloatArray104[local209];
						@Pc(530) float local530 = local514.aFloatArray104[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray104[local209] = local544;
						local514.aFloatArray104[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray26.length; local188++) {
					this.aBooleanArray26[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (!this.aBooleanArray26[local188]) {
						local202 = local167.anIntArray381 == null ? 0 : local167.anIntArray381[local188];
						local209 = local167.anIntArray382[local202];
						this.aClass321Array1[local209].method27572(local188);
						this.aClass321Array1[local209].method27567(this.aClass326Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3984; local188++) {
					if (this.aBooleanArray26[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass326Array2[local188].aFloatArray104[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class326 local699 = this.aClass326Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray104[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray104[local349] = -local699.aFloatArray104[local59 - local349 - 1];
						}
						@Pc(742) Class326 local742 = local51 ? this.aClass326_1 : this.aClass326_5;
						@Pc(750) Class326 local750 = local51 ? this.aClass326_6 : this.aClass326_2;
						@Pc(758) Class326 local758 = local51 ? this.aClass326_4 : this.aClass326_3;
						@Pc(766) int[] local766 = local51 ? this.anIntArray378 : this.anIntArray377;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray104[local768 * 4] - local699.aFloatArray104[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray104[local768 * 4 + 2] - local699.aFloatArray104[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray104[local768 * 2];
							local825 = local742.aFloatArray104[local768 * 2 + 1];
							local699.aFloatArray104[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray104[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray104[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray104[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray104[local768 * 4 + 3];
							local825 = local699.aFloatArray104[local768 * 4 + 1];
							local699.aFloatArray104[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray104[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray104[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray104[local202 - 3 - local768 * 4];
							local699.aFloatArray104[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray104[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class702.method37107(local59 - 1, 221154893);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray104[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray104[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray104[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray104[local1042 - 3 - local1055];
									local699.aFloatArray104[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray104[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray104[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray104[local1044 * local1017 + 1];
									local699.aFloatArray104[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray104[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray104[local1017 + 1];
								local699.aFloatArray104[local1017 + 1] = local699.aFloatArray104[local1019 + 1];
								local699.aFloatArray104[local1019 + 1] = local943;
								local943 = local699.aFloatArray104[local1017 + 3];
								local699.aFloatArray104[local1017 + 3] = local699.aFloatArray104[local1019 + 3];
								local699.aFloatArray104[local1019 + 3] = local943;
								local943 = local699.aFloatArray104[local1017 + 5];
								local699.aFloatArray104[local1017 + 5] = local699.aFloatArray104[local1019 + 5];
								local699.aFloatArray104[local1019 + 5] = local943;
								local943 = local699.aFloatArray104[local1017 + 7];
								local699.aFloatArray104[local1017 + 7] = local699.aFloatArray104[local1019 + 7];
								local699.aFloatArray104[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4];
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 1];
							local699.aFloatArray104[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 2];
							local699.aFloatArray104[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray104[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray104[local1002 * 2];
							local816 = local758.aFloatArray104[local1002 * 2 + 1];
							local825 = local699.aFloatArray104[local202 + local1002 * 2];
							local943 = local699.aFloatArray104[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray104[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray104[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray104[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray104[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray104[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray104[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2] + local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2 + 1];
							local699.aFloatArray104[local202 - 1 - local1002] = local699.aFloatArray104[local1002 * 2 + local202] * local750.aFloatArray104[local1002 * 2 + 1] - local699.aFloatArray104[local1002 * 2 + 1 + local202] * local750.aFloatArray104[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local59 - local297 + local1002] = -local699.aFloatArray104[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local1002] = local699.aFloatArray104[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local297 + local1002] = -local699.aFloatArray104[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray104[local202 + local1002] = local699.aFloatArray104[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass326Array2[local188].aFloatArray104[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class326[] local1816 = null;
				if (this.anInt3994 > 0) {
					local202 = this.anInt3994 + local59 >> 2;
					local1816 = this.method27331(this.anInt3984, local202);
					for (local297 = 0; local297 < this.anInt3984; local297++) {
						if (!this.aBooleanArray25[local297]) {
							for (local209 = 0; local209 < this.anInt3993; local209++) {
								local455 = (this.anInt3994 >> 1) + local209;
								local1816[local297].aFloatArray104[local209] += this.aClass326Array1[local297].aFloatArray104[local455];
							}
						}
						if (!this.aBooleanArray26[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt4073 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray104[local455] += this.aClass326Array2[local297].aFloatArray104[local209];
							}
						}
					}
				}
				@Pc(1920) Class326[] local1920 = this.aClass326Array1;
				this.aClass326Array1 = this.aClass326Array2;
				this.aClass326Array2 = local1920;
				this.anInt3994 = local59;
				this.anInt3993 = local145 - (local59 >> 1);
				this.aBooleanArray25 = this.aBooleanArray26;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "ck", descriptor = "(ILclient!nv;Lclient!mm;)Z")
	boolean method27419(@OriginalArg(0) int arg0, @OriginalArg(1) Class449 arg1, @OriginalArg(2) Class420 arg2) {
		if (arg1 == Class449.aClass449_2) {
			return true;
		} else if (arg1 == Class449.aClass449_4) {
			return true;
		} else if (arg1 == Class449.aClass449_3) {
			return true;
		} else {
			return arg1 == Class449.aClass449_5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "et", descriptor = "()V")
	void method27420() {
		if (this.method27270() == Class419.aClass419_2 || (this.method27270() == Class419.aClass419_5 || this.aBoolean792 && (float) (this.anInt4008 / this.method27325()) > this.aFloat285)) {
			return;
		}
		if (!this.method27336()) {
			@Pc(41) Packet local41 = (Packet) (this.aList15 == null || this.aList15.isEmpty() ? null : this.aList15.get(0));
			if (local41 == null) {
				if (!this.aBoolean790) {
					this.method27321(Class419.aClass419_5);
					this.anInterface41_1.method30821((byte) 35);
					this.aBoolean790 = true;
				}
				return;
			}
			this.aBoolean790 = false;
			this.aBoolean789 = true;
			this.aList15.remove(0);
			this.method27369(local41);
		}
		this.method27384();
	}

	@OriginalMember(owner = "client!ha", name = "eu", descriptor = "(Lclient!ald;)V")
	synchronized void method27421(@OriginalArg(0) Packet arg0) {
		this.aList15.add(arg0);
		this.method27321(Class419.aClass419_7);
	}

	@OriginalMember(owner = "client!ha", name = "es", descriptor = "(Lclient!ald;)V")
	synchronized void method27422(@OriginalArg(0) Packet arg0) {
		this.aList15.add(arg0);
		this.method27321(Class419.aClass419_7);
	}

	@OriginalMember(owner = "client!ha", name = "er", descriptor = "()V")
	synchronized void method27423() {
		@Pc(10) int local10 = this.aPacket_14 == null ? 0 : this.aPacket_14.pos * -1380987821;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList17.iterator();
		@Pc(23) Packet local23;
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			local12 += local23.pos * -1380987821;
		}
		if (this.aPacket_14 == null) {
			this.aPacket_14 = this.method27354(local12);
			this.anInt3995 = 0;
			local10 = 0;
		} else if (this.aPacket_14.data.length - this.aPacket_14.pos * -1380987821 < local12) {
			@Pc(53) Packet local53 = this.method27354(local12 + this.anInt3995);
			local53.pdata(this.aPacket_14.data, this.aPacket_14.pos * -1380987821 - this.anInt3996, this.anInt3995);
			this.aPacket_14.release();
			this.aPacket_14 = local53;
			local10 = this.anInt3996;
		}
		local16 = this.aList17.iterator();
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			this.aPacket_14.pdata(local23.data, 0, local23.pos * -1380987821);
			this.anInt3995 += local23.pos * -1380987821;
			local23.release();
		}
		this.aPacket_14.pos = (local10 - this.anInt3996) * 1034180571;
		this.anInt3996 = 0;
		this.aList17.clear();
		label286: while (true) {
			if (this.aBoolean789) {
				if (this.aPacket_14.pos * -1380987821 < this.aPacket_14.data.length) {
					if (this.aBoolean792 && (float) (this.anInt4008 / this.method27325()) > this.aFloat285) {
						return;
					}
					if (this.aPacket_14 != null && this.anInt3995 >= 27) {
						@Pc(205) int local205 = this.aPacket_14.pos * -1380987821;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method27337(this.aPacket_14)) {
							return;
						}
						this.anInt4003++;
						if (this.anInt4009 < 0) {
							this.anInt4002++;
						}
						this.aList19.clear();
						this.aList20.clear();
						this.aPacket_14.g1();
						@Pc(246) int local246 = this.aPacket_14.g1();
						@Pc(278) int local278 = this.aPacket_14.g1() & 0xFF | (this.aPacket_14.g1() & 0xFF) << 8 | (this.aPacket_14.g1() & 0xFF) << 16 | this.aPacket_14.g1() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aPacket_14.pos += -632980048;
						@Pc(294) int local294 = this.aPacket_14.g1();
						@Pc(300) int local300 = this.aPacket_14.pos * -1380987821;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3995) {
							this.aPacket_14.pos = (local205 + this.anInt3995) * 1034180571;
							this.anInt3996 = this.aPacket_14.pos * -1380987821 - local205;
							this.aBoolean789 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean789) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aPacket_14.data[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3995) {
									this.aPacket_14.pos = (local205 + this.anInt3995) * 1034180571;
									this.anInt3996 = this.aPacket_14.pos * -1380987821 - local205;
									this.aBoolean789 = false;
									break;
								}
								if (local352 < 255) {
									this.aList19.add(local333);
									this.aList20.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean789) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList19.iterator();
						@Pc(424) Iterator local424 = this.aList20.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt4010 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method27282() && this.aBoolean791 && this.anInt4003 < this.anInt4002 && local352 < this.anInt4009) {
									this.anInt3997 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method27346(this.aPacket_14.data, local436, local440, this.anAtomicReference1);
									@Pc(492) Class326[] local492 = (Class326[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean791 && this.anInt4003 < this.anInt4002 && local352 < this.anInt4009) {
										if (this.method27282()) {
											this.anInt3994 = 0;
											if (this.aClass326Array1 == null || this.aClass326Array1 != null && (this.aClass326Array1.length != this.anInt3984 || this.aClass326Array1[0].anInt4073 != this.anInt3987)) {
												if (this.aClass326Array1 != null) {
													this.method27333(this.aClass326Array1);
												}
												this.aClass326Array1 = this.method27331(this.anInt3984, this.anInt3987);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt4073;
										this.anInt4006 += local514;
										if (this.anInt4006 > local278 && local246 == 4) {
											this.anInt4010 = this.anInt4006 - local278 - this.anInt4010;
											local514 -= this.anInt4010;
											if (this.anInt4010 > local492[0].anInt4073) {
												this.anInt4010 = local492[0].anInt4073;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method27281(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean791 && this.anInt3997 < this.anInt3989) {
											local578 = local567;
											local567 -= this.method27281(this.anInt3989 - this.anInt3997);
											if (local567 <= 0) {
												this.anInt3997 += this.method27302(local578);
												this.method27333(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3989 - this.anInt3997;
										}
										if (this.anInt3997 + local514 > this.anInt3990 && (this.anInt4005 < this.anInt4004 || this.anInt4004 < 0) && this.aBoolean793) {
											local567 -= this.method27281(this.anInt3997 + local514 - this.anInt3990 - 1);
											if (local567 <= 0) {
												this.method27333(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method27276();
										if (this.method27350() < this.method27276()) {
											@Pc(666) int local666 = this.method27276() - this.method27350();
											local567 += local567 / this.method27350() * local666;
										}
										@Pc(679) Packet local679 = this.method27354(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean791;
											if (this.anInt4004 != 0) {
												if (this.anInt3997 == this.anInt3989) {
													if (this.anInt3998 < 0) {
														this.anInt3998 = this.anInt4000;
														this.anInt4009 = local352;
													}
													this.aBoolean791 = false;
												}
												if (this.anInt3997 == this.anInt3990 && this.anInt3999 < 0) {
													this.anInt3999 = this.anInt4000;
												}
												if (this.anInt3997 > this.anInt3990 && (this.anInt4005 < this.anInt4004 || this.anInt4004 < 0) && this.aBoolean793) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3997 < this.anInt3989 || this.anInt3997 > this.anInt3990)) {
												this.anInt3997++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray104[local681];
													} else {
														local780 = local492[local766 % this.method27350()].aFloatArray104[local681];
													}
													@Pc(799) int local799;
													if (this.aClass449_1 == Class449.aClass449_2) {
														local799 = this.method27334(local780);
														if (this.aClass420_1 == Class420.aClass420_3) {
															local679.ip2(local799);
														} else {
															local679.p2(local799);
														}
													} else if (this.aClass449_1 == Class449.aClass449_3) {
														local799 = this.method27323(local780);
														if (this.aClass420_1 == Class420.aClass420_3) {
															local679.ip2(local799);
														} else {
															local679.p2(local799);
														}
													} else if (this.aClass449_1 == Class449.aClass449_4) {
														local799 = this.method27328(local780);
														local679.p1(local799);
													} else if (this.aClass449_1 == Class449.aClass449_5) {
														local799 = this.method27374(local780);
														local679.p1(local799);
													}
												}
												this.anInt3997++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList18;
										synchronized (this.aList18) {
											this.anInt4008 += this.method27302(local679.pos * -1380987821) / this.method27276();
											this.aList18.add(local679);
										}
									}
									this.method27333(local492);
									local492 = null;
								}
							}
							this.aPacket_14.pos = local304 * 1034180571;
							this.anInt3995 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aPacket_14 != null) {
						this.anInt3996 = this.anInt3995;
						this.aPacket_14.pos += this.anInt3995 * 1034180571;
					}
					this.aBoolean789 = false;
					return;
				}
				this.aBoolean789 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "en", descriptor = "()V")
	synchronized void method27424() {
		@Pc(10) int local10 = this.aPacket_14 == null ? 0 : this.aPacket_14.pos * -1380987821;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList17.iterator();
		@Pc(23) Packet local23;
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			local12 += local23.pos * -1380987821;
		}
		if (this.aPacket_14 == null) {
			this.aPacket_14 = this.method27354(local12);
			this.anInt3995 = 0;
			local10 = 0;
		} else if (this.aPacket_14.data.length - this.aPacket_14.pos * -1380987821 < local12) {
			@Pc(53) Packet local53 = this.method27354(local12 + this.anInt3995);
			local53.pdata(this.aPacket_14.data, this.aPacket_14.pos * -1380987821 - this.anInt3996, this.anInt3995);
			this.aPacket_14.release();
			this.aPacket_14 = local53;
			local10 = this.anInt3996;
		}
		local16 = this.aList17.iterator();
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			this.aPacket_14.pdata(local23.data, 0, local23.pos * -1380987821);
			this.anInt3995 += local23.pos * -1380987821;
			local23.release();
		}
		this.aPacket_14.pos = (local10 - this.anInt3996) * 1034180571;
		this.anInt3996 = 0;
		this.aList17.clear();
		label286: while (true) {
			if (this.aBoolean789) {
				if (this.aPacket_14.pos * -1380987821 < this.aPacket_14.data.length) {
					if (this.aBoolean792 && (float) (this.anInt4008 / this.method27325()) > this.aFloat285) {
						return;
					}
					if (this.aPacket_14 != null && this.anInt3995 >= 27) {
						@Pc(205) int local205 = this.aPacket_14.pos * -1380987821;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method27337(this.aPacket_14)) {
							return;
						}
						this.anInt4003++;
						if (this.anInt4009 < 0) {
							this.anInt4002++;
						}
						this.aList19.clear();
						this.aList20.clear();
						this.aPacket_14.g1();
						@Pc(246) int local246 = this.aPacket_14.g1();
						@Pc(278) int local278 = this.aPacket_14.g1() & 0xFF | (this.aPacket_14.g1() & 0xFF) << 8 | (this.aPacket_14.g1() & 0xFF) << 16 | this.aPacket_14.g1() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aPacket_14.pos += -632980048;
						@Pc(294) int local294 = this.aPacket_14.g1();
						@Pc(300) int local300 = this.aPacket_14.pos * -1380987821;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3995) {
							this.aPacket_14.pos = (local205 + this.anInt3995) * 1034180571;
							this.anInt3996 = this.aPacket_14.pos * -1380987821 - local205;
							this.aBoolean789 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean789) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aPacket_14.data[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3995) {
									this.aPacket_14.pos = (local205 + this.anInt3995) * 1034180571;
									this.anInt3996 = this.aPacket_14.pos * -1380987821 - local205;
									this.aBoolean789 = false;
									break;
								}
								if (local352 < 255) {
									this.aList19.add(local333);
									this.aList20.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean789) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList19.iterator();
						@Pc(424) Iterator local424 = this.aList20.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt4010 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method27282() && this.aBoolean791 && this.anInt4003 < this.anInt4002 && local352 < this.anInt4009) {
									this.anInt3997 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method27346(this.aPacket_14.data, local436, local440, this.anAtomicReference1);
									@Pc(492) Class326[] local492 = (Class326[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean791 && this.anInt4003 < this.anInt4002 && local352 < this.anInt4009) {
										if (this.method27282()) {
											this.anInt3994 = 0;
											if (this.aClass326Array1 == null || this.aClass326Array1 != null && (this.aClass326Array1.length != this.anInt3984 || this.aClass326Array1[0].anInt4073 != this.anInt3987)) {
												if (this.aClass326Array1 != null) {
													this.method27333(this.aClass326Array1);
												}
												this.aClass326Array1 = this.method27331(this.anInt3984, this.anInt3987);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt4073;
										this.anInt4006 += local514;
										if (this.anInt4006 > local278 && local246 == 4) {
											this.anInt4010 = this.anInt4006 - local278 - this.anInt4010;
											local514 -= this.anInt4010;
											if (this.anInt4010 > local492[0].anInt4073) {
												this.anInt4010 = local492[0].anInt4073;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method27281(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean791 && this.anInt3997 < this.anInt3989) {
											local578 = local567;
											local567 -= this.method27281(this.anInt3989 - this.anInt3997);
											if (local567 <= 0) {
												this.anInt3997 += this.method27302(local578);
												this.method27333(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3989 - this.anInt3997;
										}
										if (this.anInt3997 + local514 > this.anInt3990 && (this.anInt4005 < this.anInt4004 || this.anInt4004 < 0) && this.aBoolean793) {
											local567 -= this.method27281(this.anInt3997 + local514 - this.anInt3990 - 1);
											if (local567 <= 0) {
												this.method27333(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method27276();
										if (this.method27350() < this.method27276()) {
											@Pc(666) int local666 = this.method27276() - this.method27350();
											local567 += local567 / this.method27350() * local666;
										}
										@Pc(679) Packet local679 = this.method27354(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean791;
											if (this.anInt4004 != 0) {
												if (this.anInt3997 == this.anInt3989) {
													if (this.anInt3998 < 0) {
														this.anInt3998 = this.anInt4000;
														this.anInt4009 = local352;
													}
													this.aBoolean791 = false;
												}
												if (this.anInt3997 == this.anInt3990 && this.anInt3999 < 0) {
													this.anInt3999 = this.anInt4000;
												}
												if (this.anInt3997 > this.anInt3990 && (this.anInt4005 < this.anInt4004 || this.anInt4004 < 0) && this.aBoolean793) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3997 < this.anInt3989 || this.anInt3997 > this.anInt3990)) {
												this.anInt3997++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray104[local681];
													} else {
														local780 = local492[local766 % this.method27350()].aFloatArray104[local681];
													}
													@Pc(799) int local799;
													if (this.aClass449_1 == Class449.aClass449_2) {
														local799 = this.method27334(local780);
														if (this.aClass420_1 == Class420.aClass420_3) {
															local679.ip2(local799);
														} else {
															local679.p2(local799);
														}
													} else if (this.aClass449_1 == Class449.aClass449_3) {
														local799 = this.method27323(local780);
														if (this.aClass420_1 == Class420.aClass420_3) {
															local679.ip2(local799);
														} else {
															local679.p2(local799);
														}
													} else if (this.aClass449_1 == Class449.aClass449_4) {
														local799 = this.method27328(local780);
														local679.p1(local799);
													} else if (this.aClass449_1 == Class449.aClass449_5) {
														local799 = this.method27374(local780);
														local679.p1(local799);
													}
												}
												this.anInt3997++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList18;
										synchronized (this.aList18) {
											this.anInt4008 += this.method27302(local679.pos * -1380987821) / this.method27276();
											this.aList18.add(local679);
										}
									}
									this.method27333(local492);
									local492 = null;
								}
							}
							this.aPacket_14.pos = local304 * 1034180571;
							this.anInt3995 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aPacket_14 != null) {
						this.anInt3996 = this.anInt3995;
						this.aPacket_14.pos += this.anInt3995 * 1034180571;
					}
					this.aBoolean789 = false;
					return;
				}
				this.aBoolean789 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ex", descriptor = "(F)I")
	int method27425(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "eo", descriptor = "()V")
	void method27426() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!ha", name = "cv", descriptor = "()Lclient!nv;")
	@Override
	public Class449 method27307() {
		return this.aClass449_1;
	}

	@OriginalMember(owner = "client!ha", name = "ei", descriptor = "(F)I")
	int method27427(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "bv", descriptor = "()V")
	@Override
	public void method27287() {
		if (this.method27270() == Class419.aClass419_2 || this.method27270() == Class419.aClass419_3 || this.method27270() == Class419.aClass419_7) {
			this.method27321(Class419.aClass419_4);
			this.method27351();
		}
	}

	@OriginalMember(owner = "client!ha", name = "eq", descriptor = "(F)I")
	int method27428(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	synchronized void method27429(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3983 = 0;
			this.anInt3987 = 0;
			this.aBooleanArray24 = null;
			this.anIntArray376 = null;
			this.method27333(this.aClass326Array3);
			this.aClass326Array3 = null;
			this.method27333(this.aClass326Array1);
			this.aClass326Array1 = null;
			this.anInt3994 = 0;
			this.anInt3993 = 0;
			this.aBooleanArray25 = null;
			this.method27333(this.aClass326Array2);
			this.aClass326Array2 = null;
			this.method27332(this.aClass326_5);
			this.method27332(this.aClass326_2);
			this.method27332(this.aClass326_3);
			this.method27332(this.aClass326_1);
			this.method27332(this.aClass326_6);
			this.method27332(this.aClass326_4);
			this.aClass326_5 = null;
			this.aClass326_2 = null;
			this.aClass326_3 = null;
			this.aClass326_1 = null;
			this.aClass326_6 = null;
			this.aClass326_4 = null;
			this.anIntArray377 = null;
			this.anIntArray378 = null;
		}
		this.anInt4006 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release();
		}
		this.aList17.clear();
		this.aBoolean789 = false;
		if (this.aPacket_14 != null) {
			@Pc(122) Packet local122 = this.aPacket_14;
			synchronized (this.aPacket_14) {
				this.aPacket_14.release();
				this.aPacket_14 = null;
			}
		}
		this.anInt3995 = 0;
		this.anInt3996 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList18;
			synchronized (this.aList18) {
				local155 = this.aList18.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList18.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release();
				}
			}
			this.anInt4008 = 0;
		}
		local150 = this.aList15;
		synchronized (this.aList15) {
			local155 = this.aList15.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList15.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release();
			}
		}
		this.aBoolean790 = false;
		this.anInt3997 = 0;
		this.anInt4000 = -1;
		this.anInt4003 = -1;
		if (arg0) {
			this.anInt4005++;
			this.aBoolean791 = true;
			return;
		}
		this.method27363(false);
		this.aBoolean788 = false;
		this.anInt3989 = -1;
		this.anInt3990 = -1;
		this.anInt4004 = 0;
		this.anInt4005 = 0;
		this.anInt3998 = -1;
		this.anInt3999 = -1;
		this.anInt4002 = -1;
		this.anInt4009 = -1;
		this.aBoolean791 = false;
		this.aBoolean793 = false;
	}

	@OriginalMember(owner = "client!ha", name = "fv", descriptor = "(I)Lclient!ald;")
	Packet method27430(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27354(this.method27281(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList18;
		synchronized (this.aList18) {
			while (!this.aList18.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList18.remove(0);
				this.anInt4008 -= this.method27302(local22.pos * -1380987821) / this.method27276();
				@Pc(40) int local40 = this.method27281(local7);
				@Pc(53) int local53 = local22.pos * -1380987821 < local40 ? local22.pos * -1380987821 : local40;
				local5.pdata(local22.data, 0, local53);
				local7 -= this.method27302(local53);
				@Pc(73) int local73 = local22.pos * -1380987821 - local53;
				if (local73 == 0) {
					local22.release();
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * 1034180571;
					this.anInt4008 += this.method27302(local73) / this.method27276();
					this.aList18.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList18.isEmpty() && this.method27270() == Class419.aClass419_8) {
				this.method27321(Class419.aClass419_6);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "fm", descriptor = "(I)Lclient!ald;")
	Packet method27431(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27354(this.method27281(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList18;
		synchronized (this.aList18) {
			while (!this.aList18.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList18.remove(0);
				this.anInt4008 -= this.method27302(local22.pos * -1380987821) / this.method27276();
				@Pc(40) int local40 = this.method27281(local7);
				@Pc(53) int local53 = local22.pos * -1380987821 < local40 ? local22.pos * -1380987821 : local40;
				local5.pdata(local22.data, 0, local53);
				local7 -= this.method27302(local53);
				@Pc(73) int local73 = local22.pos * -1380987821 - local53;
				if (local73 == 0) {
					local22.release();
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * 1034180571;
					this.anInt4008 += this.method27302(local73) / this.method27276();
					this.aList18.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList18.isEmpty() && this.method27270() == Class419.aClass419_8) {
				this.method27321(Class419.aClass419_6);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "fp", descriptor = "(I)Lclient!ald;")
	Packet method27432(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27354(this.method27281(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList18;
		synchronized (this.aList18) {
			while (!this.aList18.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList18.remove(0);
				this.anInt4008 -= this.method27302(local22.pos * -1380987821) / this.method27276();
				@Pc(40) int local40 = this.method27281(local7);
				@Pc(53) int local53 = local22.pos * -1380987821 < local40 ? local22.pos * -1380987821 : local40;
				local5.pdata(local22.data, 0, local53);
				local7 -= this.method27302(local53);
				@Pc(73) int local73 = local22.pos * -1380987821 - local53;
				if (local73 == 0) {
					local22.release();
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * 1034180571;
					this.anInt4008 += this.method27302(local73) / this.method27276();
					this.aList18.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList18.isEmpty() && this.method27270() == Class419.aClass419_8) {
				this.method27321(Class419.aClass419_6);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!ha", name = "fx", descriptor = "(I)Lclient!ald;")
	Packet method27433(@OriginalArg(0) int arg0) {
		return new Packet(arg0, true);
	}

	@OriginalMember(owner = "client!ha", name = "fj", descriptor = "()I")
	int method27434() {
		return this.anInt4008;
	}

	@OriginalMember(owner = "client!ha", name = "fk", descriptor = "(ZIII)V")
	@Override
	public void method27318(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean793 = arg0;
		this.anInt4004 = arg1;
		this.anInt3989 = arg2;
		this.anInt3990 = arg3;
	}

	@OriginalMember(owner = "client!ha", name = "bh", descriptor = "()V")
	@Override
	public void method27277() {
		if (this.method27270() == Class419.aClass419_2 || this.method27270() == Class419.aClass419_3 || this.method27270() == Class419.aClass419_7) {
			this.method27321(Class419.aClass419_4);
			this.method27351();
		}
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(Lclient!ald;)V")
	@Override
	public void method27293(@OriginalArg(0) Packet arg0) {
		if (this.method27270() == Class419.aClass419_8 || this.method27270() == Class419.aClass419_6) {
			if (arg0 != null) {
				arg0.release();
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean793 && (this.anInt4004 > 0 && this.anInt4005 < this.anInt4004 || this.anInt4004 < 0);
			if (this.aList18.isEmpty()) {
				if (!local33) {
					this.method27342();
					this.method27321(Class419.aClass419_6);
				}
			} else if (!local33) {
				this.method27342();
				this.method27321(Class419.aClass419_8);
			}
			if (local33) {
				this.method27429(true);
			}
		} else {
			this.method27348(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "fz", descriptor = "()Z")
	@Override
	public synchronized boolean method27320() {
		return this.aBoolean792;
	}
}
