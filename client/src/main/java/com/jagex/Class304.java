package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gy")
public final class Class304 {

	@OriginalMember(owner = "client!gy", name = "n", descriptor = "I")
	static final int anInt3977 = 2;

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "I")
	static final int anInt3979 = 1;

	@OriginalMember(owner = "client!gy", name = "gk", descriptor = "Lclient!py;")
	public static Class497 aClass497_101;

	@OriginalMember(owner = "client!gy", name = "r", descriptor = "Lclient!abn;")
	Class40 aClass40_3;

	@OriginalMember(owner = "client!gy", name = "m", descriptor = "J")
	final long aLong255;

	@OriginalMember(owner = "client!gy", name = "l", descriptor = "Ljava/lang/String;")
	String aString165;

	@OriginalMember(owner = "client!gy", name = "w", descriptor = "Z")
	boolean aBoolean682;

	@OriginalMember(owner = "client!gy", name = "z", descriptor = "Z")
	boolean aBoolean681;

	@OriginalMember(owner = "client!gy", name = "k", descriptor = "[Lclient!xz;")
	final Class675[] aClass675Array2;

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "Lclient!abn;")
	final Class40 aClass40_2;

	@OriginalMember(owner = "client!gy", name = "u", descriptor = "I")
	int anInt3976;

	@OriginalMember(owner = "client!gy", name = "p", descriptor = "I")
	int anInt3978;

	@OriginalMember(owner = "client!gy", name = "d", descriptor = "Lclient!gv;")
	Class301 aClass301_5;

	@OriginalMember(owner = "client!gy", name = "c", descriptor = "I")
	int anInt3980;

	@OriginalMember(owner = "client!gy", name = "ahl", descriptor = "(Lclient!yf;S)V")
	static void method26887(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18273(local12, -545433674);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt150 * -1809820871 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gy", name = "el", descriptor = "(II)Z")
	static boolean method26888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@OriginalMember(owner = "client!gy", name = "<init>", descriptor = "(Lclient!alw;ZZLclient!gu;)V")
	Class304(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface27 arg3) {
		if (arg1) {
			this.aLong255 = arg0.method22435(498727567) * 5817403946560140893L;
		} else {
			this.aLong255 = -5817403946560140893L;
		}
		if (arg2) {
			this.aString165 = arg0.method22438((byte) 45);
		}
		@Pc(25) int local25 = arg0.method22425((short) 16384);
		this.aBoolean682 = (local25 & 0x1) != 0;
		this.aBoolean681 = (local25 & 0x2) != 0;
		this.aClass675Array2 = new Class675[arg3.method25624((byte) 2).method32775(773227642)];
		@Pc(56) int local56 = arg0.method22425((short) 16384);
		if (local56 > this.aClass675Array2.length) {
			throw new IllegalStateException("");
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < this.aClass675Array2.length; local68++) {
			@Pc(89) Class675 local89 = this.aClass675Array2[local68] = new Class675(arg3.method25624((byte) 2).method32769(local68, (byte) 24), true);
			if (local68 < local56) {
				local89.method33318(arg0.method22431(-118643075), -1199731471);
			} else {
				local89.method33318(0, 729579119);
			}
			local89.method33322(local89.method33319(708553628), 479175137);
		}
		local68 = arg0.method22427(-1434290800);
		this.aClass40_2 = new Class40(arg3.method25632((byte) -2));
		for (@Pc(125) int local125 = 0; local125 < local68; local125++) {
			@Pc(135) Class466 local135 = arg3.method25632((byte) -13).method1463(arg0, (byte) 72);
			this.aClass40_2.method776(local135.anInt5253 * -1181855333, local135.anObject19, (byte) 53);
		}
		this.anInt3976 = arg0.method22427(-1434290800) * 557760827;
		if (this.anInt3976 * -1735233549 == 65535) {
			this.anInt3976 = -557760827;
		}
		this.anInt3978 = arg0.method22425((short) 16384) * -979420629;
		this.aClass301_5 = (Class301) Class107.method18131(Class301.method26821(1436235082), arg0.method22425((short) 16384), -1915563430);
		this.anInt3980 = arg0.method22425((short) 16384) * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "ap", descriptor = "()Z")
	public boolean method26837() {
		return this.aBoolean682;
	}

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method26838(@OriginalArg(0) int arg0) {
		return this.aString165;
	}

	@OriginalMember(owner = "client!gy", name = "m", descriptor = "(IB)V")
	void method26839(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt3978 = arg0 * -979420629;
	}

	@OriginalMember(owner = "client!gy", name = "ai", descriptor = "()Lclient!gv;")
	public Class301 method26840() {
		return this.aClass301_5;
	}

	@OriginalMember(owner = "client!gy", name = "k", descriptor = "(B)I")
	public int method26841(@OriginalArg(0) byte arg0) {
		return this.anInt3976 * -1735233549;
	}

	@OriginalMember(owner = "client!gy", name = "ab", descriptor = "(Lclient!gu;)V")
	public void method26842(@OriginalArg(0) Interface27 arg0) {
		if (this.aClass40_3 == null) {
			this.aClass40_3 = new Class40(arg0.method25632((byte) -21));
		} else {
			this.aClass40_3.method777(2119489555);
		}
	}

	@OriginalMember(owner = "client!gy", name = "n", descriptor = "(S)I")
	public int method26843(@OriginalArg(0) short arg0) {
		return this.anInt3978 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "g", descriptor = "()I")
	public int method26844() {
		return this.anInt3978 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "u", descriptor = "(S)Lclient!gv;")
	public Class301 method26845(@OriginalArg(0) short arg0) {
		return this.aClass301_5;
	}

	@OriginalMember(owner = "client!gy", name = "z", descriptor = "(Lclient!gv;I)V")
	void method26846(@OriginalArg(0) Class301 arg0, @OriginalArg(1) int arg1) {
		this.aClass301_5 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "p", descriptor = "(B)I")
	public int method26847(@OriginalArg(0) byte arg0) {
		return this.anInt3980 * 1071221335;
	}

	@OriginalMember(owner = "client!gy", name = "d", descriptor = "(II)V")
	void method26848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3980 = arg0 * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "c", descriptor = "(I)J")
	long method26849(@OriginalArg(0) int arg0) {
		return this.aLong255 * 1667669230986612213L;
	}

	@OriginalMember(owner = "client!gy", name = "r", descriptor = "(I)Z")
	public boolean method26850(@OriginalArg(0) int arg0) {
		return this.aBoolean682;
	}

	@OriginalMember(owner = "client!gy", name = "v", descriptor = "(IB)Lclient!xz;")
	public Class675 method26851(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass675Array2[arg0];
	}

	@OriginalMember(owner = "client!gy", name = "o", descriptor = "(Lclient!gy;I)V")
	void method26852(@OriginalArg(0) Class304 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass675Array2.length; local1++) {
			this.aClass675Array2[local1].method33318(arg0.aClass675Array2[local1].method33333(-562477546), 1461935256);
			this.aClass675Array2[local1].method33322(this.aClass675Array2[local1].method33319(-593897075), 479175137);
		}
		this.aClass40_2.method777(1049688863);
		@Pc(40) Iterator local40 = arg0.aClass40_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class466 local47 = (Class466) local40.next();
			this.aClass40_2.method776(local47.anInt5253 * -1181855333, local47.anObject19, (byte) 27);
		}
		this.aBoolean682 = arg0.aBoolean682;
	}

	@OriginalMember(owner = "client!gy", name = "s", descriptor = "(Lclient!gu;B)V")
	public void method26853(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass40_3 == null) {
			this.aClass40_3 = new Class40(arg0.method25632((byte) -80));
		} else {
			this.aClass40_3.method777(1830383757);
		}
	}

	@OriginalMember(owner = "client!gy", name = "y", descriptor = "(I)Lclient!abn;")
	public Class40 method26854(@OriginalArg(0) int arg0) {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "aq", descriptor = "()Z")
	public boolean method26855() {
		return this.aBoolean682;
	}

	@OriginalMember(owner = "client!gy", name = "x", descriptor = "()I")
	public int method26856() {
		return this.anInt3978 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "l", descriptor = "(ZB)V")
	void method26857(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean681 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "h", descriptor = "()I")
	public int method26858() {
		return this.anInt3978 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "a", descriptor = "()I")
	public int method26859() {
		return this.anInt3978 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "ae", descriptor = "()Z")
	public boolean method26860() {
		return this.aBoolean681;
	}

	@OriginalMember(owner = "client!gy", name = "i", descriptor = "(I)V")
	void method26861(@OriginalArg(0) int arg0) {
		this.anInt3978 = arg0 * -979420629;
	}

	@OriginalMember(owner = "client!gy", name = "j", descriptor = "()Z")
	public boolean method26862() {
		return this.aBoolean681;
	}

	@OriginalMember(owner = "client!gy", name = "t", descriptor = "()Z")
	public boolean method26863() {
		return this.aBoolean681;
	}

	@OriginalMember(owner = "client!gy", name = "av", descriptor = "(I)Lclient!xz;")
	public Class675 method26864(@OriginalArg(0) int arg0) {
		return this.aClass675Array2[arg0];
	}

	@OriginalMember(owner = "client!gy", name = "ag", descriptor = "(Z)V")
	void method26865(@OriginalArg(0) boolean arg0) {
		this.aBoolean681 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ah", descriptor = "(Z)V")
	void method26866(@OriginalArg(0) boolean arg0) {
		this.aBoolean681 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "al", descriptor = "(Z)V")
	void method26867(@OriginalArg(0) boolean arg0) {
		this.aBoolean681 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ac", descriptor = "(Z)V")
	void method26868(@OriginalArg(0) boolean arg0) {
		this.aBoolean681 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "aj", descriptor = "(Lclient!gy;)V")
	void method26869(@OriginalArg(0) Class304 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass675Array2.length; local1++) {
			this.aClass675Array2[local1].method33318(arg0.aClass675Array2[local1].method33333(740705030), -1090041296);
			this.aClass675Array2[local1].method33322(this.aClass675Array2[local1].method33319(-823858861), 479175137);
		}
		this.aClass40_2.method777(1746164355);
		@Pc(40) Iterator local40 = arg0.aClass40_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class466 local47 = (Class466) local40.next();
			this.aClass40_2.method776(local47.anInt5253 * -1181855333, local47.anObject19, (byte) 98);
		}
		this.aBoolean682 = arg0.aBoolean682;
	}

	@OriginalMember(owner = "client!gy", name = "aw", descriptor = "(Lclient!gv;)V")
	void method26870(@OriginalArg(0) Class301 arg0) {
		this.aClass301_5 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "ad", descriptor = "()I")
	public int method26871() {
		return this.anInt3980 * 1071221335;
	}

	@OriginalMember(owner = "client!gy", name = "aa", descriptor = "()Lclient!abn;")
	public Class40 method26872() {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "am", descriptor = "(I)V")
	void method26873(@OriginalArg(0) int arg0) {
		this.anInt3980 = arg0 * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "au", descriptor = "(I)V")
	void method26874(@OriginalArg(0) int arg0) {
		this.anInt3980 = arg0 * 1646854503;
	}

	@OriginalMember(owner = "client!gy", name = "ar", descriptor = "()J")
	long method26875() {
		return this.aLong255 * 1667669230986612213L;
	}

	@OriginalMember(owner = "client!gy", name = "at", descriptor = "()I")
	public int method26876() {
		return this.anInt3980 * 1071221335;
	}

	@OriginalMember(owner = "client!gy", name = "b", descriptor = "()I")
	public int method26877() {
		return this.anInt3978 * -614615933;
	}

	@OriginalMember(owner = "client!gy", name = "as", descriptor = "(Lclient!gv;)V")
	void method26878(@OriginalArg(0) Class301 arg0) {
		this.aClass301_5 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "w", descriptor = "(B)Z")
	public boolean method26879(@OriginalArg(0) byte arg0) {
		return this.aBoolean681;
	}

	@OriginalMember(owner = "client!gy", name = "ao", descriptor = "(Lclient!gy;)V")
	void method26880(@OriginalArg(0) Class304 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass675Array2.length; local1++) {
			this.aClass675Array2[local1].method33318(arg0.aClass675Array2[local1].method33333(188338854), -323050857);
			this.aClass675Array2[local1].method33322(this.aClass675Array2[local1].method33319(-682555343), 479175137);
		}
		this.aClass40_2.method777(2132963220);
		@Pc(40) Iterator local40 = arg0.aClass40_2.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class466 local47 = (Class466) local40.next();
			this.aClass40_2.method776(local47.anInt5253 * -1181855333, local47.anObject19, (byte) 108);
		}
		this.aBoolean682 = arg0.aBoolean682;
	}

	@OriginalMember(owner = "client!gy", name = "ax", descriptor = "(I)Lclient!xz;")
	public Class675 method26881(@OriginalArg(0) int arg0) {
		return this.aClass675Array2[arg0];
	}

	@OriginalMember(owner = "client!gy", name = "ay", descriptor = "(Lclient!gu;)V")
	public void method26882(@OriginalArg(0) Interface27 arg0) {
		if (this.aClass40_3 == null) {
			this.aClass40_3 = new Class40(arg0.method25632((byte) -38));
		} else {
			this.aClass40_3.method777(1291379373);
		}
	}

	@OriginalMember(owner = "client!gy", name = "q", descriptor = "()Ljava/lang/String;")
	public String method26883() {
		return this.aString165;
	}

	@OriginalMember(owner = "client!gy", name = "az", descriptor = "()Lclient!abn;")
	public Class40 method26884() {
		return this.aClass40_3;
	}

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "(II)V")
	void method26885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3976 = arg0 * 557760827;
	}

	@OriginalMember(owner = "client!gy", name = "af", descriptor = "()Lclient!abn;")
	public Class40 method26886() {
		return this.aClass40_3;
	}
}
