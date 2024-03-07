package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gy")
public class Class304 {

	@OriginalMember(owner = "client!gy", name = "n", descriptor = "I")
	static final int anInt3936 = 2;

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "I")
	static final int anInt3938 = 1;

	@OriginalMember(owner = "client!gy", name = "gk", descriptor = "Lclient!py;")
	public static Class497 aClass497_101;

	@OriginalMember(owner = "client!gy", name = "r", descriptor = "Lclient!abn;")
	Class40 aClass40_3;

	@OriginalMember(owner = "client!gy", name = "m", descriptor = "J")
	final long aLong255;

	@OriginalMember(owner = "client!gy", name = "l", descriptor = "Ljava/lang/String;")
	String aString159;

	@OriginalMember(owner = "client!gy", name = "w", descriptor = "Z")
	boolean aBoolean678;

	@OriginalMember(owner = "client!gy", name = "z", descriptor = "Z")
	boolean aBoolean677;

	@OriginalMember(owner = "client!gy", name = "k", descriptor = "[Lclient!xz;")
	final Class675[] aClass675Array2;

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "Lclient!abn;")
	final Class40 aClass40_2;

	@OriginalMember(owner = "client!gy", name = "u", descriptor = "I")
	int anInt3935;

	@OriginalMember(owner = "client!gy", name = "p", descriptor = "I")
	int anInt3937;

	@OriginalMember(owner = "client!gy", name = "d", descriptor = "Lclient!gv;")
	Class301 aClass301_5;

	@OriginalMember(owner = "client!gy", name = "c", descriptor = "I")
	int anInt3939;

	@OriginalMember(owner = "client!gy", name = "<init>", descriptor = "(Lclient!alw;ZZLclient!gu;)V", line = 24)
	Class304(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface27 arg3) {
		if (arg1) {
			this.aLong255 = arg0.g8(498727567) * 5817403946560140893L;
		} else {
			this.aLong255 = -5817403946560140893L;
		}
		if (arg2) {
			this.aString159 = arg0.fastgstr((byte) 45);
		}
		@Pc(25) int local25 = arg0.g1((short) 16384);
		this.aBoolean678 = (local25 & 0x1) != 0;
		this.aBoolean677 = (local25 & 0x2) != 0;
		this.aClass675Array2 = new Class675[arg3.method25531((byte) 2).method32590(773227642)];
		@Pc(56) int local56 = arg0.g1((short) 16384);
		if (local56 > this.aClass675Array2.length) {
			throw new IllegalStateException("");
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < this.aClass675Array2.length; local68++) {
			@Pc(89) Class675 local89 = this.aClass675Array2[local68] = new Class675(arg3.method25531((byte) 2).method32591(local68, (byte) 24), true);
			if (local68 < local56) {
				local89.method33143(arg0.g4(-118643075), -1199731471);
			} else {
				local89.method33143(0, 729579119);
			}
			local89.method33157(local89.method33145(708553628), 479175137);
		}
		local68 = arg0.g2(-1434290800);
		this.aClass40_2 = new Class40(arg3.method25539((byte) -2));
		for (@Pc(125) int local125 = 0; local125 < local68; local125++) {
			@Pc(135) Class466 local135 = arg3.method25539((byte) -13).method1468(arg0, (byte) 72);
			this.aClass40_2.method776(local135.anInt5092 * -1181855333, local135.anObject19, (byte) 53);
		}
		this.anInt3935 = arg0.g2(-1434290800) * 557760827;
		if (this.anInt3935 * -1735233549 == 65535) {
			this.anInt3935 = -557760827;
		}
		this.anInt3937 = arg0.g1((short) 16384) * -979420629;
		this.aClass301_5 = (Class301) Class107.method18116(Class301.method26728(1436235082), arg0.g1((short) 16384), -1915563430);
		this.anInt3939 = arg0.g1((short) 16384) * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "(I)Ljava/lang/String;", line = 54)
	public String method26744(@OriginalArg(0) int arg0) {
		return this.aString159;
	}

	@OriginalMember(owner = "client!gy", name = "q", descriptor = "()Ljava/lang/String;", line = 54)
	public String method26745() {
		return this.aString159;
	}

	@OriginalMember(owner = "client!gy", name = "n", descriptor = "(S)I", line = 58)
	public int method26746(@OriginalArg(0) short arg0) {
		return this.anInt3937 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "g", descriptor = "()I", line = 58)
	public int method26747() {
		return this.anInt3937 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "x", descriptor = "()I", line = 58)
	public int method26748() {
		return this.anInt3937 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "h", descriptor = "()I", line = 58)
	public int method26749() {
		return this.anInt3937 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "a", descriptor = "()I", line = 58)
	public int method26750() {
		return this.anInt3937 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "b", descriptor = "()I", line = 58)
	public int method26751() {
		return this.anInt3937 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "m", descriptor = "(IB)V", line = 62)
	void method26752(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt3937 = arg0 * -979420629;
	}

	@OriginalMember(owner = "client!gy", name = "i", descriptor = "(I)V", line = 62)
	void method26753(@OriginalArg(0) int arg0) {
		this.anInt3937 = arg0 * -979420629;
	}

	@OriginalMember(owner = "client!gy", name = "k", descriptor = "(B)I", line = 66)
	public int method26754(@OriginalArg(0) byte arg0) {
		return this.anInt3935 * -1735233549;
	}

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "(II)V", line = 70)
	void method26755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3935 = arg0 * 557760827;
	}

	@OriginalMember(owner = "client!gy", name = "ae", descriptor = "()Z", line = 74)
	public boolean method26756() {
		return this.aBoolean677;
	}

	@OriginalMember(owner = "client!gy", name = "j", descriptor = "()Z", line = 74)
	public boolean method26757() {
		return this.aBoolean677;
	}

	@OriginalMember(owner = "client!gy", name = "t", descriptor = "()Z", line = 74)
	public boolean method26758() {
		return this.aBoolean677;
	}

	@OriginalMember(owner = "client!gy", name = "w", descriptor = "(B)Z", line = 74)
	public boolean method26759(@OriginalArg(0) byte arg0) {
		return this.aBoolean677;
	}

	@OriginalMember(owner = "client!gy", name = "l", descriptor = "(ZB)V", line = 78)
	void method26760(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean677 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ag", descriptor = "(Z)V", line = 78)
	void method26761(@OriginalArg(0) boolean arg0) {
		this.aBoolean677 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ah", descriptor = "(Z)V", line = 78)
	void method26762(@OriginalArg(0) boolean arg0) {
		this.aBoolean677 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "al", descriptor = "(Z)V", line = 78)
	void method26763(@OriginalArg(0) boolean arg0) {
		this.aBoolean677 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ac", descriptor = "(Z)V", line = 78)
	void method26764(@OriginalArg(0) boolean arg0) {
		this.aBoolean677 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ai", descriptor = "()Lclient!gv;", line = 82)
	public Class301 method26765() {
		return this.aClass301_5;
	}

	@OriginalMember(owner = "client!gy", name = "u", descriptor = "(S)Lclient!gv;", line = 82)
	public Class301 method26766(@OriginalArg(0) short arg0) {
		return this.aClass301_5;
	}

	@OriginalMember(owner = "client!gy", name = "z", descriptor = "(Lclient!gv;I)V", line = 86)
	void method26767(@OriginalArg(0) Class301 arg0, @OriginalArg(1) int arg1) {
		this.aClass301_5 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "aw", descriptor = "(Lclient!gv;)V", line = 86)
	void method26768(@OriginalArg(0) Class301 arg0) {
		this.aClass301_5 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "as", descriptor = "(Lclient!gv;)V", line = 86)
	void method26769(@OriginalArg(0) Class301 arg0) {
		this.aClass301_5 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "p", descriptor = "(B)I", line = 90)
	public int method26770(@OriginalArg(0) byte arg0) {
		return this.anInt3939 * 1071221335;
	}

	@OriginalMember(owner = "client!gy", name = "ad", descriptor = "()I", line = 90)
	public int method26771() {
		return this.anInt3939 * 1071221335;
	}

	@OriginalMember(owner = "client!gy", name = "at", descriptor = "()I", line = 90)
	public int method26772() {
		return this.anInt3939 * 1071221335;
	}

	@OriginalMember(owner = "client!gy", name = "d", descriptor = "(II)V", line = 94)
	void method26773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3939 = arg0 * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "am", descriptor = "(I)V", line = 94)
	void method26774(@OriginalArg(0) int arg0) {
		this.anInt3939 = arg0 * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "au", descriptor = "(I)V", line = 94)
	void method26775(@OriginalArg(0) int arg0) {
		this.anInt3939 = arg0 * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "c", descriptor = "(I)J", line = 98)
	long method26776(@OriginalArg(0) int arg0) {
		return this.aLong255 * 1667669230986612213L;
	}

	@OriginalMember(owner = "client!gy", name = "ar", descriptor = "()J", line = 98)
	long method26777() {
		return this.aLong255 * 1667669230986612213L;
	}

	@OriginalMember(owner = "client!gy", name = "ap", descriptor = "()Z", line = 102)
	public boolean method26778() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!gy", name = "r", descriptor = "(I)Z", line = 102)
	public boolean method26779(@OriginalArg(0) int arg0) {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!gy", name = "aq", descriptor = "()Z", line = 102)
	public boolean method26780() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!gy", name = "v", descriptor = "(IB)Lclient!xz;", line = 106)
	public Class675 method26781(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass675Array2[arg0];
	}

	@OriginalMember(owner = "client!gy", name = "av", descriptor = "(I)Lclient!xz;", line = 106)
	public Class675 method26782(@OriginalArg(0) int arg0) {
		return this.aClass675Array2[arg0];
	}

	@OriginalMember(owner = "client!gy", name = "ax", descriptor = "(I)Lclient!xz;", line = 106)
	public Class675 method26783(@OriginalArg(0) int arg0) {
		return this.aClass675Array2[arg0];
	}

	@OriginalMember(owner = "client!gy", name = "o", descriptor = "(Lclient!gy;I)V", line = 110)
	void method26784(@OriginalArg(0) Class304 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass675Array2.length; local1++) {
			this.aClass675Array2[local1].method33143(arg0.aClass675Array2[local1].method33137(-562477546), 1461935256);
			this.aClass675Array2[local1].method33157(this.aClass675Array2[local1].method33145(-593897075), 479175137);
		}
		this.aClass40_2.method777(1049688863);
		@Pc(40) Iterator local40 = arg0.aClass40_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class466 local47 = (Class466) local40.next();
			this.aClass40_2.method776(local47.anInt5092 * -1181855333, local47.anObject19, (byte) 27);
		}
		this.aBoolean678 = arg0.aBoolean678;
	}

	@OriginalMember(owner = "client!gy", name = "aj", descriptor = "(Lclient!gy;)V", line = 110)
	void method26785(@OriginalArg(0) Class304 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass675Array2.length; local1++) {
			this.aClass675Array2[local1].method33143(arg0.aClass675Array2[local1].method33137(740705030), -1090041296);
			this.aClass675Array2[local1].method33157(this.aClass675Array2[local1].method33145(-823858861), 479175137);
		}
		this.aClass40_2.method777(1746164355);
		@Pc(40) Iterator local40 = arg0.aClass40_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class466 local47 = (Class466) local40.next();
			this.aClass40_2.method776(local47.anInt5092 * -1181855333, local47.anObject19, (byte) 98);
		}
		this.aBoolean678 = arg0.aBoolean678;
	}

	@OriginalMember(owner = "client!gy", name = "ao", descriptor = "(Lclient!gy;)V", line = 110)
	void method26786(@OriginalArg(0) Class304 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass675Array2.length; local1++) {
			this.aClass675Array2[local1].method33143(arg0.aClass675Array2[local1].method33137(188338854), -323050857);
			this.aClass675Array2[local1].method33157(this.aClass675Array2[local1].method33145(-682555343), 479175137);
		}
		this.aClass40_2.method777(2132963220);
		@Pc(40) Iterator local40 = arg0.aClass40_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class466 local47 = (Class466) local40.next();
			this.aClass40_2.method776(local47.anInt5092 * -1181855333, local47.anObject19, (byte) 108);
		}
		this.aBoolean678 = arg0.aBoolean678;
	}

	@OriginalMember(owner = "client!gy", name = "ab", descriptor = "(Lclient!gu;)V", line = 125)
	public void method26787(@OriginalArg(0) Interface27 arg0) {
		if (this.aClass40_3 == null) {
			this.aClass40_3 = new Class40(arg0.method25539((byte) -21));
		} else {
			this.aClass40_3.method777(2119489555);
		}
	}

	@OriginalMember(owner = "client!gy", name = "s", descriptor = "(Lclient!gu;B)V", line = 125)
	public void method26788(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass40_3 == null) {
			this.aClass40_3 = new Class40(arg0.method25539((byte) -80));
		} else {
			this.aClass40_3.method777(1830383757);
		}
	}

	@OriginalMember(owner = "client!gy", name = "ay", descriptor = "(Lclient!gu;)V", line = 125)
	public void method26789(@OriginalArg(0) Interface27 arg0) {
		if (this.aClass40_3 == null) {
			this.aClass40_3 = new Class40(arg0.method25539((byte) -38));
		} else {
			this.aClass40_3.method777(1291379373);
		}
	}

	@OriginalMember(owner = "client!gy", name = "y", descriptor = "(I)Lclient!abn;", line = 134)
	public Class40 method26790(@OriginalArg(0) int arg0) {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "aa", descriptor = "()Lclient!abn;", line = 134)
	public Class40 method26791() {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "az", descriptor = "()Lclient!abn;", line = 134)
	public Class40 method26792() {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "af", descriptor = "()Lclient!abn;", line = 134)
	public Class40 method26793() {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "el", descriptor = "(II)Z", line = 1768)
	static boolean method26794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@OriginalMember(owner = "client!gy", name = "ahl", descriptor = "(Lclient!yf;S)V", line = 10821)
	static final void method26795(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18261(local12, -545433674);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt150 * -1809820871 == 2 ? 1 : 0;
	}
}
