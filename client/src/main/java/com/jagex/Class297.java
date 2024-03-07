package com.jagex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public class Class297 {

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	static final int anInt3920 = 1;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	static final int anInt3921 = 2;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	static final int anInt3922 = 4;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
	static final int anInt3924 = 1;

	@OriginalMember(owner = "client!gq", name = "th", descriptor = "B")
	public static byte aByte124;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	int anInt3925 = 123819125;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "J")
	final long aLong252;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Z")
	final boolean aBoolean674;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
	boolean aBoolean675;

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
	boolean aBoolean676;

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
	int anInt3926;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "J")
	final long aLong253;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Ljava/lang/String;")
	final String aString158;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
	final int anInt3923;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList3;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList4;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!abn;")
	final Class40 aClass40_1;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(JLclient!alw;ZLclient!gu;)V", line = 31)
	public Class297(@OriginalArg(0) long arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface27 arg3) {
		this.aLong252 = arg0 * -1593019501305181665L;
		@Pc(13) int local13 = arg1.g1((short) 16384);
		if (local13 <= 0 || local13 > 1) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = arg1.g1((short) 16384);
		this.aBoolean674 = (local27 & 0x1) != 0;
		this.aBoolean675 = (local27 & 0x2) != 0;
		this.aBoolean676 = (local27 & 0x4) != 0;
		this.anInt3926 = arg1.g4(-118643075) * -2007260593;
		this.aLong253 = arg1.g8(1417271561) * 2406700482966643721L;
		this.aString158 = arg1.gjstr(1568738619);
		this.anInt3923 = arg1.g2s((byte) -9) * 786987457;
		arg1.g4(-118643075);
		arg1.g8(464392751);
		@Pc(94) int local94 = arg1.g2(-1434290800);
		this.anArrayList3 = new ArrayList(local94);
		@Pc(102) int local102;
		for (local102 = 0; local102 < local94; local102++) {
			this.anArrayList3.add(new Class304(arg1, this.aBoolean675, this.aBoolean676, arg3));
		}
		local102 = arg1.g2(-1434290800);
		this.anArrayList4 = new ArrayList(local102);
		@Pc(132) int local132;
		for (local132 = 0; local132 < local102; local132++) {
			this.anArrayList4.add(new Class282(arg1, this.aBoolean675, this.aBoolean676));
		}
		this.aClass40_1 = new Class40(arg3.method25528((byte) 50));
		local132 = arg1.g2(-1434290800);
		for (@Pc(163) int local163 = 0; local163 < local132; local163++) {
			@Pc(173) Class466 local173 = arg3.method25528((byte) -91).method1468(arg1, (byte) 28);
			this.aClass40_1.method776(local173.anInt5092 * -1181855333, local173.anObject19, (byte) 67);
		}
		if (!arg2) {
			arg1.g2(-1434290800);
			arg1.g2(-1434290800);
			arg1.g2(-1434290800);
			arg1.g2(-1434290800);
			arg1.g2(-1434290800);
		}
		this.method26637(-935677119);
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)Ljava/util/List;", line = 75)
	public List method26611(@OriginalArg(0) byte arg0) {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "()Ljava/util/List;", line = 75)
	public List method26612() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "ae", descriptor = "()Ljava/util/List;", line = 75)
	public List method26613() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "ag", descriptor = "()Ljava/util/List;", line = 75)
	public List method26614() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "ah", descriptor = "()Ljava/util/List;", line = 79)
	public List method26615() {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "(B)Ljava/util/List;", line = 79)
	public List method26616(@OriginalArg(0) byte arg0) {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "(I)I", line = 83)
	int method26617(@OriginalArg(0) int arg0) {
		return this.anInt3926 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "ai", descriptor = "()I", line = 83)
	int method26618() {
		return this.anInt3926 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "al", descriptor = "()I", line = 83)
	int method26619() {
		return this.anInt3926 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "ac", descriptor = "()I", line = 83)
	int method26620() {
		return this.anInt3926 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "(B)V", line = 87)
	void method26621(@OriginalArg(0) byte arg0) {
		this.anInt3926 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "as", descriptor = "()V", line = 87)
	void method26622() {
		this.anInt3926 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "at", descriptor = "()V", line = 87)
	void method26623() {
		this.anInt3926 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "aw", descriptor = "()V", line = 87)
	void method26624() {
		this.anInt3926 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "(Lclient!py;II)Lclient!asy;", line = 88)
	static Class93_Sub1_Sub20 method26625(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Packet local8 = new Packet(arg0.method30064(0, arg1, (byte) 0));
		return Class44_Sub1.method17432(local8, arg1, -1804936624);
	}

	@OriginalMember(owner = "client!gq", name = "ad", descriptor = "()Z", line = 91)
	public boolean method26626() {
		return this.aBoolean674;
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)Z", line = 91)
	public boolean method26627(@OriginalArg(0) int arg0) {
		return this.aBoolean674;
	}

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "(I)I", line = 95)
	public int method26628(@OriginalArg(0) int arg0) {
		return this.anInt3923 * -1272801727;
	}

	@OriginalMember(owner = "client!gq", name = "au", descriptor = "()I", line = 95)
	public int method26629() {
		return this.anInt3923 * -1272801727;
	}

	@OriginalMember(owner = "client!gq", name = "am", descriptor = "()I", line = 95)
	public int method26630() {
		return this.anInt3923 * -1272801727;
	}

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "(I)J", line = 99)
	public long method26631(@OriginalArg(0) int arg0) {
		return this.aLong253 * 8873518649050786361L;
	}

	@OriginalMember(owner = "client!gq", name = "ar", descriptor = "()J", line = 99)
	public long method26632() {
		return this.aLong253 * 8873518649050786361L;
	}

	@OriginalMember(owner = "client!gq", name = "ap", descriptor = "()J", line = 99)
	public long method26633() {
		return this.aLong253 * 8873518649050786361L;
	}

	@OriginalMember(owner = "client!gq", name = "hashCode", descriptor = "()I", line = 103)
	@Override
	public int hashCode() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "rk", descriptor = "()I", line = 103)
	public int method26634() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "rm", descriptor = "()I", line = 103)
	public int method26635() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "ri", descriptor = "()I", line = 103)
	public int method26636() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "(I)V", line = 107)
	void method26637(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class304 local16 = (Class304) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method26746((short) -11420);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3925 = local3 * -123819125;
	}

	@OriginalMember(owner = "client!gq", name = "aq", descriptor = "()V", line = 107)
	void method26638() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class304 local16 = (Class304) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method26746((short) -10914);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3925 = local3 * -123819125;
	}

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "(B)I", line = 121)
	public int method26639(@OriginalArg(0) byte arg0) {
		return this.anInt3925 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "ax", descriptor = "()I", line = 121)
	public int method26640() {
		return this.anInt3925 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "av", descriptor = "()I", line = 121)
	public int method26641() {
		return this.anInt3925 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "ao", descriptor = "()I", line = 121)
	public int method26642() {
		return this.anInt3925 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "ay", descriptor = "()Lclient!gv;", line = 125)
	public Class301 method26643() {
		if (this.anArrayList3.isEmpty()) {
			return Class301.aClass301_3;
		}
		@Pc(13) Class301 local13 = ((Class304) this.anArrayList3.get(0)).method26766((short) -25757);
		switch(local13.anInt3929 * 1122922251) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList3.iterator();
				@Pc(29) Class304 local29;
				do {
					if (!local22.hasNext()) {
						return Class301.aClass301_2;
					}
					local29 = (Class304) local22.next();
				} while (local29.method26766((short) 14451) != Class301.aClass301_3);
				return Class301.aClass301_3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "aj", descriptor = "()Lclient!gv;", line = 125)
	public Class301 method26644() {
		if (this.anArrayList3.isEmpty()) {
			return Class301.aClass301_3;
		}
		@Pc(13) Class301 local13 = ((Class304) this.anArrayList3.get(0)).method26766((short) 15601);
		switch(local13.anInt3929 * 1122922251) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList3.iterator();
				@Pc(29) Class304 local29;
				do {
					if (!local22.hasNext()) {
						return Class301.aClass301_2;
					}
					local29 = (Class304) local22.next();
				} while (local29.method26766((short) -10793) != Class301.aClass301_3);
				return Class301.aClass301_3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "(B)Lclient!gv;", line = 125)
	public Class301 method26645(@OriginalArg(0) byte arg0) {
		if (this.anArrayList3.isEmpty()) {
			return Class301.aClass301_3;
		}
		@Pc(13) Class301 local13 = ((Class304) this.anArrayList3.get(0)).method26766((short) -826);
		switch(local13.anInt3929 * 1122922251) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList3.iterator();
				@Pc(29) Class304 local29;
				do {
					if (!local22.hasNext()) {
						return Class301.aClass301_2;
					}
					local29 = (Class304) local22.next();
				} while (local29.method26766((short) -9472) != Class301.aClass301_3);
				return Class301.aClass301_3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(II)Lclient!gy;", line = 149)
	public Class304 method26646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "ab", descriptor = "(I)Lclient!gy;", line = 149)
	public Class304 method26647(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "az", descriptor = "(I)Lclient!gy;", line = 149)
	public Class304 method26648(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "aa", descriptor = "(I)Lclient!gy;", line = 149)
	public Class304 method26649(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Ljava/lang/String;", line = 154)
	public String method26650(@OriginalArg(0) int arg0) {
		return this.aString158;
	}

	@OriginalMember(owner = "client!gq", name = "af", descriptor = "()Ljava/lang/String;", line = 154)
	public String method26651() {
		return this.aString158;
	}

	@OriginalMember(owner = "client!gq", name = "ak", descriptor = "()Lclient!eh;", line = 158)
	public Interface20 method26652() {
		return new Class113(Class138.aClass138_70, this.aClass40_1);
	}

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "(I)Lclient!eh;", line = 158)
	public Interface20 method26653(@OriginalArg(0) int arg0) {
		return new Class113(Class138.aClass138_70, this.aClass40_1);
	}

	@OriginalMember(owner = "client!gq", name = "an", descriptor = "()Lclient!eh;", line = 158)
	public Interface20 method26654() {
		return new Class113(Class138.aClass138_70, this.aClass40_1);
	}

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "(Lclient!gy;B)V", line = 162)
	void method26655(@OriginalArg(0) Class304 arg0, @OriginalArg(1) byte arg1) {
		this.anArrayList3.add(arg0);
		this.method26637(758577125);
	}

	@OriginalMember(owner = "client!gq", name = "bk", descriptor = "(Lclient!gy;)V", line = 162)
	void method26656(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26637(-129078341);
	}

	@OriginalMember(owner = "client!gq", name = "bh", descriptor = "(Lclient!gy;)V", line = 162)
	void method26657(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26637(667972257);
	}

	@OriginalMember(owner = "client!gq", name = "bf", descriptor = "(Lclient!gy;)V", line = 162)
	void method26658(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26637(1801809986);
	}

	@OriginalMember(owner = "client!gq", name = "bl", descriptor = "(Lclient!gy;)V", line = 162)
	void method26659(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26637(-1246665786);
	}

	@OriginalMember(owner = "client!gq", name = "bd", descriptor = "(I)V", line = 167)
	void method26660(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26637(-1140541464);
	}

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "(II)V", line = 167)
	void method26661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anArrayList3.remove(arg0);
		this.method26637(1642011608);
	}

	@OriginalMember(owner = "client!gq", name = "bx", descriptor = "(I)V", line = 167)
	void method26662(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26637(1537900990);
	}

	@OriginalMember(owner = "client!gq", name = "bn", descriptor = "(Lclient!ga;)V", line = 172)
	void method26663(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bc", descriptor = "(Lclient!ga;)V", line = 172)
	void method26664(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bi", descriptor = "(Lclient!ga;)V", line = 172)
	void method26665(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bt", descriptor = "(Lclient!ga;)V", line = 172)
	void method26666(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "(Lclient!ga;S)V", line = 172)
	void method26667(@OriginalArg(0) Class282 arg0, @OriginalArg(1) short arg1) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "(II)V", line = 176)
	void method26668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anArrayList4.remove(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bq", descriptor = "(I)V", line = 176)
	void method26669(@OriginalArg(0) int arg0) {
		this.anArrayList4.remove(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "(III)V", line = 180)
	void method26670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		((Class304) this.anArrayList3.get(arg0)).method26752(arg1, (byte) 83);
		this.method26637(-1882768024);
	}

	@OriginalMember(owner = "client!gq", name = "bm", descriptor = "(II)V", line = 180)
	void method26671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26752(arg1, (byte) 43);
		this.method26637(894631263);
	}

	@OriginalMember(owner = "client!gq", name = "bb", descriptor = "(II)V", line = 180)
	void method26672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26752(arg1, (byte) 11);
		this.method26637(987414438);
	}

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "(III)V", line = 185)
	void method26673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26755(arg1, 1886652544);
		local5.method26760(true, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "be", descriptor = "(II)V", line = 185)
	void method26674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26755(arg1, 1259943580);
		local5.method26760(true, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "by", descriptor = "(II)V", line = 185)
	void method26675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26755(arg1, 1042683699);
		local5.method26760(true, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "bu", descriptor = "(I)V", line = 191)
	void method26676(@OriginalArg(0) int arg0) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26760(false, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V", line = 191)
	void method26677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26760(false, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "bw", descriptor = "(IZ)V", line = 196)
	void method26678(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26767(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2077060238);
	}

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "(IZS)V", line = 196)
	void method26679(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26767(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2140516169);
	}

	@OriginalMember(owner = "client!gq", name = "bo", descriptor = "(IZ)V", line = 196)
	void method26680(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26767(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2052817658);
	}

	@OriginalMember(owner = "client!gq", name = "bz", descriptor = "(IZ)V", line = 196)
	void method26681(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26767(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2069668649);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V", line = 201)
	void method26682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		((Class304) this.anArrayList3.get(arg0)).method26773(arg1, -1062072040);
	}

	@OriginalMember(owner = "client!gq", name = "br", descriptor = "(II)V", line = 201)
	void method26683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26773(arg1, -2129539254);
	}

	@OriginalMember(owner = "client!gq", name = "bv", descriptor = "(II)V", line = 201)
	void method26684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26773(arg1, -129455002);
	}

	@OriginalMember(owner = "client!gq", name = "bg", descriptor = "(II)V", line = 201)
	void method26685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26773(arg1, 1560713515);
	}

	@OriginalMember(owner = "client!gq", name = "ba", descriptor = "()V", line = 205)
	void method26686() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_4, 1911069056);
		}
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V", line = 205)
	void method26687(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_4, 2062967067);
		}
	}

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "(B)V", line = 214)
	void method26688(@OriginalArg(0) byte arg0) {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_1, 2114728482);
		}
	}

	@OriginalMember(owner = "client!gq", name = "cl", descriptor = "()V", line = 214)
	void method26689() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_1, 1985270339);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bp", descriptor = "()V", line = 214)
	void method26690() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_1, 2134856380);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bj", descriptor = "()V", line = 214)
	void method26691() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_1, 2117640521);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bs", descriptor = "()V", line = 214)
	void method26692() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26767(Class301.aClass301_1, 2121721680);
		}
	}

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "(ILclient!gy;I)V", line = 223)
	void method26693(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26784(arg1, -103983867);
	}

	@OriginalMember(owner = "client!gq", name = "cg", descriptor = "(ILclient!gy;)V", line = 223)
	void method26694(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26784(arg1, -1358627470);
	}

	@OriginalMember(owner = "client!gq", name = "dg", descriptor = "(Lclient!yf;I)V", line = 5653)
	static final void method26695(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class237.method25774(local11, local14, arg0, (short) 5134);
	}

	@OriginalMember(owner = "client!gq", name = "age", descriptor = "(Lclient!yf;B)V", line = 10671)
	static final void method26696(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class440.method28847((long) arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] * 60000L, Class106.aClass717_8.method36920(), true, (byte) -125) + " UTC";
	}

	@OriginalMember(owner = "client!gq", name = "aoi", descriptor = "(Lclient!yf;I)V", line = 12418)
	static final void method26697(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (!Class65.aClass123_Sub1_2.method9024(-1662199153).method27507(406481090)) {
			throw new RuntimeException();
		}
		@Pc(14) Class124_Sub3 local14 = (Class124_Sub3) Class65.aClass123_Sub1_2.method9011((byte) -51);
		local14.method21433(Class382.aClass479_2, -1, 0.0F, 1457100682);
		client.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!gq", name = "awn", descriptor = "(Lclient!yf;B)V", line = 13573)
	static final void method26698(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(42) long local42 = Class569.method31304(0, 0, 12, local13, local23, local33, -230131351);
		@Pc(45) int local45 = Class706.method36741(local42);
		if (local33 < 1970) {
			local45--;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local45;
	}
}
