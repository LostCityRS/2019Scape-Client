package com.jagex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gz")
public final class Class305 {

	@OriginalMember(owner = "client!gz", name = "f", descriptor = "I")
	static final int anInt3976 = 1;

	@OriginalMember(owner = "client!gz", name = "e", descriptor = "I")
	static final int anInt3977 = 2;

	@OriginalMember(owner = "client!gz", name = "u", descriptor = "I")
	static final int anInt3978 = 4;

	@OriginalMember(owner = "client!gz", name = "t", descriptor = "I")
	static final int anInt3979 = 1;

	@OriginalMember(owner = "client!gz", name = "w", descriptor = "I")
	int anInt3981 = -1874267609;

	@OriginalMember(owner = "client!gz", name = "l", descriptor = "J")
	final long aLong367;

	@OriginalMember(owner = "client!gz", name = "m", descriptor = "Z")
	final boolean aBoolean785;

	@OriginalMember(owner = "client!gz", name = "k", descriptor = "Z")
	boolean aBoolean787;

	@OriginalMember(owner = "client!gz", name = "x", descriptor = "Z")
	boolean aBoolean786;

	@OriginalMember(owner = "client!gz", name = "r", descriptor = "I")
	int anInt3982;

	@OriginalMember(owner = "client!gz", name = "g", descriptor = "J")
	final long aLong366;

	@OriginalMember(owner = "client!gz", name = "i", descriptor = "Ljava/lang/String;")
	final String aString169;

	@OriginalMember(owner = "client!gz", name = "o", descriptor = "I")
	final int anInt3980;

	@OriginalMember(owner = "client!gz", name = "a", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList4;

	@OriginalMember(owner = "client!gz", name = "s", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList3;

	@OriginalMember(owner = "client!gz", name = "j", descriptor = "Lclient!abg;")
	final Class33 aClass33_3;

	@OriginalMember(owner = "client!gz", name = "v", descriptor = "(I)V")
	public static void method27204(@OriginalArg(0) int arg0) {
		Class709.aClass310Array1 = new Class310[Class642.aClass480_131.method29930(-1160109961)];
		Class285.aBooleanArray23 = new boolean[Class642.aClass480_131.method29930(1556992013)];
	}

	@OriginalMember(owner = "client!gz", name = "f", descriptor = "(I)V")
	public static void method27205(@OriginalArg(0) int arg0) {
		Class481.anInt4995 = 0;
		Class481.anInt4994 = 0;
	}

	@OriginalMember(owner = "client!gz", name = "bc", descriptor = "(Lclient!yp;I)V")
	static void method27206(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 == null) {
			return;
		}
		@Pc(29) int local29;
		for (local29 = 0; local29 < Class366.anIntArray433.length; local29++) {
			if (Class366.anIntArray433[local29] == local13) {
				Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.method33524(local29, local23, Class80_Sub1_Sub15.aClass41_Sub14_4, -629312012);
				return;
			}
		}
		for (local29 = 0; local29 < Class366.anIntArray435.length; local29++) {
			if (local13 == Class366.anIntArray435[local29]) {
				Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.method33524(local29, local23, Class80_Sub1_Sub15.aClass41_Sub14_4, -1499194357);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gz", name = "akl", descriptor = "(Lclient!yp;S)V")
	static void method27207(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class159.method15423(local12);
		if (local15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3093 * 1171189611;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3095 * -893056067;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3094 * -828099429;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3096 * 1673061885;
		}
	}

	@OriginalMember(owner = "client!gz", name = "<init>", descriptor = "(JLclient!ald;ZLclient!gh;)V")
	public Class305(@OriginalArg(0) long arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface27 arg3) {
		this.aLong367 = arg0 * -7383207353273137369L;
		@Pc(13) int local13 = arg1.method23362(-1547245116);
		if (local13 <= 0 || local13 > 1) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = arg1.method23362(-256182107);
		this.aBoolean785 = (local27 & 0x1) != 0;
		this.aBoolean787 = (local27 & 0x2) != 0;
		this.aBoolean786 = (local27 & 0x4) != 0;
		this.anInt3982 = arg1.method23182(1760595243) * 467808111;
		this.aLong366 = arg1.method23273((byte) 1) * -8078292710442647141L;
		this.aString169 = arg1.method23376((short) 8020);
		this.anInt3980 = arg1.method23179(-32537448) * -1575338219;
		arg1.method23182(982295647);
		arg1.method23273((byte) -77);
		@Pc(94) int local94 = arg1.method23178((byte) -36);
		this.anArrayList4 = new ArrayList(local94);
		@Pc(102) int local102;
		for (local102 = 0; local102 < local94; local102++) {
			this.anArrayList4.add(new Class302(arg1, this.aBoolean787, this.aBoolean786, arg3));
		}
		local102 = arg1.method23178((byte) -24);
		this.anArrayList3 = new ArrayList(local102);
		@Pc(132) int local132;
		for (local132 = 0; local132 < local102; local132++) {
			this.anArrayList3.add(new Class288(arg1, this.aBoolean787, this.aBoolean786));
		}
		this.aClass33_3 = new Class33(arg3.method13(2109575621));
		local132 = arg1.method23178((byte) -94);
		for (@Pc(163) int local163 = 0; local163 < local132; local163++) {
			@Pc(173) Class460 local173 = arg3.method13(1901632936).method1820(arg1, -68082719);
			this.aClass33_3.method719(local173.anInt4907 * -38979583, local173.anObject19, -2120454017);
		}
		if (!arg2) {
			arg1.method23178((byte) -105);
			arg1.method23178((byte) -98);
			arg1.method23178((byte) -13);
			arg1.method23178((byte) -36);
			arg1.method23178((byte) -54);
		}
		this.method27149((byte) -6);
	}

	@OriginalMember(owner = "client!gz", name = "k", descriptor = "(I)Lclient!em;")
	public Interface22 method27129(@OriginalArg(0) int arg0) {
		return new Class110(Class143.aClass143_70, this.aClass33_3);
	}

	@OriginalMember(owner = "client!gz", name = "t", descriptor = "(B)Ljava/util/List;")
	public List method27130(@OriginalArg(0) byte arg0) {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gz", name = "f", descriptor = "(B)Ljava/util/List;")
	public List method27131(@OriginalArg(0) byte arg0) {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gz", name = "e", descriptor = "(I)I")
	int method27132(@OriginalArg(0) int arg0) {
		return this.anInt3982 * -1574957169;
	}

	@OriginalMember(owner = "client!gz", name = "ae", descriptor = "()Ljava/lang/String;")
	public String method27133() {
		return this.aString169;
	}

	@OriginalMember(owner = "client!gz", name = "l", descriptor = "(B)Z")
	public boolean method27134(@OriginalArg(0) byte arg0) {
		return this.aBoolean785;
	}

	@OriginalMember(owner = "client!gz", name = "bs", descriptor = "(II)V")
	void method27135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27049(arg1, 91748425);
		local5.method27051(true, (byte) 2);
	}

	@OriginalMember(owner = "client!gz", name = "i", descriptor = "(I)J")
	public long method27136(@OriginalArg(0) int arg0) {
		return this.aLong366 * -500174530663269229L;
	}

	@OriginalMember(owner = "client!gz", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return (int) (this.aLong367 * -6266481680064399209L);
	}

	@OriginalMember(owner = "client!gz", name = "n", descriptor = "(B)V")
	void method27137(@OriginalArg(0) byte arg0) {
		@Pc(3) Iterator local3 = this.anArrayList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class302 local10 = (Class302) local3.next();
			local10.method27053(Class304.aClass304_4, (byte) 57);
		}
	}

	@OriginalMember(owner = "client!gz", name = "o", descriptor = "(I)I")
	public int method27138(@OriginalArg(0) int arg0) {
		return this.anInt3981 * 258515561;
	}

	@OriginalMember(owner = "client!gz", name = "j", descriptor = "(I)Lclient!gy;")
	public Class304 method27139(@OriginalArg(0) int arg0) {
		if (this.anArrayList4.isEmpty()) {
			return Class304.aClass304_3;
		}
		@Pc(13) Class304 local13 = ((Class302) this.anArrayList4.get(0)).method27061((byte) -88);
		switch(local13.anInt3973 * 38763245) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList4.iterator();
				@Pc(29) Class302 local29;
				do {
					if (!local22.hasNext()) {
						return Class304.aClass304_2;
					}
					local29 = (Class302) local22.next();
				} while (local29.method27061((byte) -8) != Class304.aClass304_3);
				return Class304.aClass304_3;
		}
	}

	@OriginalMember(owner = "client!gz", name = "a", descriptor = "(II)Lclient!gw;")
	public Class302 method27140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == -1 ? null : (Class302) this.anArrayList4.get(arg0);
	}

	@OriginalMember(owner = "client!gz", name = "s", descriptor = "(B)Ljava/lang/String;")
	public String method27141(@OriginalArg(0) byte arg0) {
		return this.aString169;
	}

	@OriginalMember(owner = "client!gz", name = "am", descriptor = "()V")
	void method27142() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList4.size(); local5++) {
			@Pc(16) Class302 local16 = (Class302) this.anArrayList4.get(local5);
			@Pc(20) int local20 = local16.method27047(799689045);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3981 = local3 * 1874267609;
	}

	@OriginalMember(owner = "client!gz", name = "x", descriptor = "(Lclient!gw;I)V")
	void method27143(@OriginalArg(0) Class302 arg0, @OriginalArg(1) int arg1) {
		this.anArrayList4.add(arg0);
		this.method27149((byte) -15);
	}

	@OriginalMember(owner = "client!gz", name = "ao", descriptor = "()I")
	int method27144() {
		return this.anInt3982 * -1574957169;
	}

	@OriginalMember(owner = "client!gz", name = "r", descriptor = "(Lclient!gi;I)V")
	void method27145(@OriginalArg(0) Class288 arg0, @OriginalArg(1) int arg1) {
		this.anArrayList3.add(arg0);
	}

	@OriginalMember(owner = "client!gz", name = "aa", descriptor = "(I)Lclient!gw;")
	public Class302 method27146(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class302) this.anArrayList4.get(arg0);
	}

	@OriginalMember(owner = "client!gz", name = "h", descriptor = "(IIS)V")
	void method27147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		((Class302) this.anArrayList4.get(arg0)).method27045(arg1, -679944700);
		this.method27149((byte) -63);
	}

	@OriginalMember(owner = "client!gz", name = "d", descriptor = "(IIB)V")
	void method27148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27049(arg1, -1062518413);
		local5.method27051(true, (byte) 22);
	}

	@OriginalMember(owner = "client!gz", name = "m", descriptor = "(B)V")
	void method27149(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList4.size(); local5++) {
			@Pc(16) Class302 local16 = (Class302) this.anArrayList4.get(local5);
			@Pc(20) int local20 = local16.method27047(799689045);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3981 = local3 * 1874267609;
	}

	@OriginalMember(owner = "client!gz", name = "p", descriptor = "(IZI)V")
	void method27150(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27053(arg1 ? Class304.aClass304_2 : Class304.aClass304_3, (byte) 79);
	}

	@OriginalMember(owner = "client!gz", name = "v", descriptor = "(III)V")
	void method27151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		((Class302) this.anArrayList4.get(arg0)).method27055(arg1, -847857061);
	}

	@OriginalMember(owner = "client!gz", name = "y", descriptor = "(I)V")
	void method27152(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.anArrayList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class302 local10 = (Class302) local3.next();
			local10.method27053(Class304.aClass304_5, (byte) 20);
		}
	}

	@OriginalMember(owner = "client!gz", name = "g", descriptor = "(I)I")
	public int method27153(@OriginalArg(0) int arg0) {
		return this.anInt3980 * -1346299843;
	}

	@OriginalMember(owner = "client!gz", name = "bn", descriptor = "(II)V")
	void method27154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27049(arg1, -1222326673);
		local5.method27051(true, (byte) 6);
	}

	@OriginalMember(owner = "client!gz", name = "b", descriptor = "()Ljava/util/List;")
	public List method27155() {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gz", name = "ax", descriptor = "()Ljava/util/List;")
	public List method27156() {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gz", name = "ay", descriptor = "()Ljava/util/List;")
	public List method27157() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gz", name = "ai", descriptor = "()Ljava/util/List;")
	public List method27158() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gz", name = "aq", descriptor = "()Ljava/util/List;")
	public List method27159() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gz", name = "ac", descriptor = "()V")
	void method27160() {
		this.anInt3982 += 467808111;
	}

	@OriginalMember(owner = "client!gz", name = "aj", descriptor = "()V")
	void method27161() {
		this.anInt3982 += 467808111;
	}

	@OriginalMember(owner = "client!gz", name = "ag", descriptor = "()V")
	void method27162() {
		this.anInt3982 += 467808111;
	}

	@OriginalMember(owner = "client!gz", name = "u", descriptor = "(I)V")
	void method27163(@OriginalArg(0) int arg0) {
		this.anInt3982 += 467808111;
	}

	@OriginalMember(owner = "client!gz", name = "ab", descriptor = "()Z")
	public boolean method27164() {
		return this.aBoolean785;
	}

	@OriginalMember(owner = "client!gz", name = "al", descriptor = "()I")
	public int method27165() {
		return this.anInt3980 * -1346299843;
	}

	@OriginalMember(owner = "client!gz", name = "ah", descriptor = "()J")
	public long method27166() {
		return this.aLong366 * -500174530663269229L;
	}

	@OriginalMember(owner = "client!gz", name = "af", descriptor = "()J")
	public long method27167() {
		return this.aLong366 * -500174530663269229L;
	}

	@OriginalMember(owner = "client!gz", name = "bb", descriptor = "()V")
	void method27168() {
		@Pc(3) Iterator local3 = this.anArrayList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class302 local10 = (Class302) local3.next();
			local10.method27053(Class304.aClass304_5, (byte) 95);
		}
	}

	@OriginalMember(owner = "client!gz", name = "ak", descriptor = "()V")
	void method27169() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList4.size(); local5++) {
			@Pc(16) Class302 local16 = (Class302) this.anArrayList4.get(local5);
			@Pc(20) int local20 = local16.method27047(799689045);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3981 = local3 * 1874267609;
	}

	@OriginalMember(owner = "client!gz", name = "at", descriptor = "()V")
	void method27170() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList4.size(); local5++) {
			@Pc(16) Class302 local16 = (Class302) this.anArrayList4.get(local5);
			@Pc(20) int local20 = local16.method27047(799689045);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3981 = local3 * 1874267609;
	}

	@OriginalMember(owner = "client!gz", name = "ar", descriptor = "()Lclient!em;")
	public Interface22 method27171() {
		return new Class110(Class143.aClass143_70, this.aClass33_3);
	}

	@OriginalMember(owner = "client!gz", name = "av", descriptor = "()Lclient!gy;")
	public Class304 method27172() {
		if (this.anArrayList4.isEmpty()) {
			return Class304.aClass304_3;
		}
		@Pc(13) Class304 local13 = ((Class302) this.anArrayList4.get(0)).method27061((byte) -21);
		switch(local13.anInt3973 * 38763245) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList4.iterator();
				@Pc(29) Class302 local29;
				do {
					if (!local22.hasNext()) {
						return Class304.aClass304_2;
					}
					local29 = (Class302) local22.next();
				} while (local29.method27061((byte) -31) != Class304.aClass304_3);
				return Class304.aClass304_3;
		}
	}

	@OriginalMember(owner = "client!gz", name = "q", descriptor = "(II)V")
	void method27173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anArrayList3.remove(arg0);
	}

	@OriginalMember(owner = "client!gz", name = "ad", descriptor = "()I")
	public int method27174() {
		return this.anInt3981 * 258515561;
	}

	@OriginalMember(owner = "client!gz", name = "az", descriptor = "(I)V")
	void method27175(@OriginalArg(0) int arg0) {
		this.anArrayList4.remove(arg0);
		this.method27149((byte) -18);
	}

	@OriginalMember(owner = "client!gz", name = "ap", descriptor = "()Ljava/lang/String;")
	public String method27176() {
		return this.aString169;
	}

	@OriginalMember(owner = "client!gz", name = "c", descriptor = "(ILclient!gw;B)V")
	void method27177(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27059(arg1, -2142736538);
	}

	@OriginalMember(owner = "client!gz", name = "au", descriptor = "(Lclient!gw;)V")
	void method27178(@OriginalArg(0) Class302 arg0) {
		this.anArrayList4.add(arg0);
		this.method27149((byte) -69);
	}

	@OriginalMember(owner = "client!gz", name = "as", descriptor = "(I)V")
	void method27179(@OriginalArg(0) int arg0) {
		this.anArrayList4.remove(arg0);
		this.method27149((byte) -114);
	}

	@OriginalMember(owner = "client!gz", name = "aw", descriptor = "(Lclient!gi;)V")
	void method27180(@OriginalArg(0) Class288 arg0) {
		this.anArrayList3.add(arg0);
	}

	@OriginalMember(owner = "client!gz", name = "bg", descriptor = "(Lclient!gi;)V")
	void method27181(@OriginalArg(0) Class288 arg0) {
		this.anArrayList3.add(arg0);
	}

	@OriginalMember(owner = "client!gz", name = "bl", descriptor = "(II)V")
	void method27182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class302) this.anArrayList4.get(arg0)).method27045(arg1, 420177434);
		this.method27149((byte) -26);
	}

	@OriginalMember(owner = "client!gz", name = "bz", descriptor = "(I)V")
	void method27183(@OriginalArg(0) int arg0) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27051(false, (byte) 107);
	}

	@OriginalMember(owner = "client!gz", name = "br", descriptor = "(II)V")
	void method27184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class302) this.anArrayList4.get(arg0)).method27045(arg1, -1100018278);
		this.method27149((byte) -68);
	}

	@OriginalMember(owner = "client!gz", name = "ba", descriptor = "(II)V")
	void method27185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27049(arg1, 1241689965);
		local5.method27051(true, (byte) 108);
	}

	@OriginalMember(owner = "client!gz", name = "bt", descriptor = "(II)V")
	void method27186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27049(arg1, 697470351);
		local5.method27051(true, (byte) 41);
	}

	@OriginalMember(owner = "client!gz", name = "an", descriptor = "()Lclient!gy;")
	public Class304 method27187() {
		if (this.anArrayList4.isEmpty()) {
			return Class304.aClass304_3;
		}
		@Pc(13) Class304 local13 = ((Class302) this.anArrayList4.get(0)).method27061((byte) -27);
		switch(local13.anInt3973 * 38763245) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList4.iterator();
				@Pc(29) Class302 local29;
				do {
					if (!local22.hasNext()) {
						return Class304.aClass304_2;
					}
					local29 = (Class302) local22.next();
				} while (local29.method27061((byte) -31) != Class304.aClass304_3);
				return Class304.aClass304_3;
		}
	}

	@OriginalMember(owner = "client!gz", name = "bj", descriptor = "(I)V")
	void method27188(@OriginalArg(0) int arg0) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27051(false, (byte) 25);
	}

	@OriginalMember(owner = "client!gz", name = "z", descriptor = "(II)V")
	void method27189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27051(false, (byte) 100);
	}

	@OriginalMember(owner = "client!gz", name = "bk", descriptor = "(I)V")
	void method27190(@OriginalArg(0) int arg0) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27051(false, (byte) 100);
	}

	@OriginalMember(owner = "client!gz", name = "by", descriptor = "(I)V")
	void method27191(@OriginalArg(0) int arg0) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27051(false, (byte) 48);
	}

	@OriginalMember(owner = "client!gz", name = "be", descriptor = "(IZ)V")
	void method27192(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27053(arg1 ? Class304.aClass304_2 : Class304.aClass304_3, (byte) 112);
	}

	@OriginalMember(owner = "client!gz", name = "bh", descriptor = "(IZ)V")
	void method27193(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27053(arg1 ? Class304.aClass304_2 : Class304.aClass304_3, (byte) 100);
	}

	@OriginalMember(owner = "client!gz", name = "bv", descriptor = "(IZ)V")
	void method27194(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27053(arg1 ? Class304.aClass304_2 : Class304.aClass304_3, (byte) 82);
	}

	@OriginalMember(owner = "client!gz", name = "bp", descriptor = "(II)V")
	void method27195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class302) this.anArrayList4.get(arg0)).method27055(arg1, 1079675588);
	}

	@OriginalMember(owner = "client!gz", name = "w", descriptor = "(II)V")
	void method27196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anArrayList4.remove(arg0);
		this.method27149((byte) -57);
	}

	@OriginalMember(owner = "client!gz", name = "bo", descriptor = "()V")
	void method27197() {
		@Pc(3) Iterator local3 = this.anArrayList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class302 local10 = (Class302) local3.next();
			local10.method27053(Class304.aClass304_5, (byte) 127);
		}
	}

	@OriginalMember(owner = "client!gz", name = "bc", descriptor = "()V")
	void method27198() {
		@Pc(3) Iterator local3 = this.anArrayList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class302 local10 = (Class302) local3.next();
			local10.method27053(Class304.aClass304_5, (byte) 98);
		}
	}

	@OriginalMember(owner = "client!gz", name = "bf", descriptor = "()V")
	void method27199() {
		@Pc(3) Iterator local3 = this.anArrayList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class302 local10 = (Class302) local3.next();
			local10.method27053(Class304.aClass304_4, (byte) 81);
		}
	}

	@OriginalMember(owner = "client!gz", name = "bw", descriptor = "(ILclient!gw;)V")
	void method27200(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27059(arg1, -2120737892);
	}

	@OriginalMember(owner = "client!gz", name = "bx", descriptor = "(ILclient!gw;)V")
	void method27201(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27059(arg1, -2142503472);
	}

	@OriginalMember(owner = "client!gz", name = "bi", descriptor = "(ILclient!gw;)V")
	void method27202(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1) {
		@Pc(5) Class302 local5 = (Class302) this.anArrayList4.get(arg0);
		local5.method27059(arg1, -2111087412);
	}

	@OriginalMember(owner = "client!gz", name = "rm", descriptor = "()I")
	public int method27203() {
		return (int) (this.aLong367 * -6266481680064399209L);
	}
}
