package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@OriginalClass("client!xe")
public final class Class658 {

	@OriginalMember(owner = "client!xe", name = "w", descriptor = "[Z")
	static boolean[] aBooleanArray35 = new boolean[64];

	@OriginalMember(owner = "client!xe", name = "r", descriptor = "[Z")
	static boolean[] aBooleanArray34 = new boolean[16];

	@OriginalMember(owner = "client!xe", name = "l", descriptor = "J")
	long aLong407;

	@OriginalMember(owner = "client!xe", name = "g", descriptor = "J")
	long aLong408;

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "I")
	int anInt5682;

	@OriginalMember(owner = "client!xe", name = "t", descriptor = "Z")
	public boolean aBoolean972 = false;

	@OriginalMember(owner = "client!xe", name = "f", descriptor = "Z")
	boolean aBoolean970 = false;

	@OriginalMember(owner = "client!xe", name = "u", descriptor = "I")
	int anInt5679 = 0;

	@OriginalMember(owner = "client!xe", name = "i", descriptor = "Ljava/util/List;")
	List aList25 = new LinkedList();

	@OriginalMember(owner = "client!xe", name = "m", descriptor = "I")
	int anInt5680 = 0;

	@OriginalMember(owner = "client!xe", name = "o", descriptor = "Ljava/util/List;")
	List aList26 = new LinkedList();

	@OriginalMember(owner = "client!xe", name = "j", descriptor = "I")
	int anInt5681 = 0;

	@OriginalMember(owner = "client!xe", name = "a", descriptor = "Z")
	boolean aBoolean971 = false;

	@OriginalMember(owner = "client!xe", name = "s", descriptor = "Z")
	boolean aBoolean973 = false;

	@OriginalMember(owner = "client!xe", name = "x", descriptor = "Lclient!db;")
	Class221 aClass221_1 = new Class221();

	@OriginalMember(owner = "client!xe", name = "e", descriptor = "[Lclient!atq;")
	Class147_Sub3_Sub1_Sub1[] aClass147_Sub3_Sub1_Sub1Array2 = new Class147_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!xe", name = "q", descriptor = "(IZ)Lclient!xe;")
	public static Class658 method33232(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class654.anInt5667 * -1544286437 == Class654.anInt5666 * 353652329) {
			return new Class658(arg0, arg1);
		} else {
			@Pc(12) Class658 local12 = Class40.aClass658Array1[Class654.anInt5666 * 353652329];
			Class654.anInt5666 = (Class654.anInt5666 * 353652329 + 1 & Class233.anIntArray351[Class654.anInt5665 * 2087772395]) * 209592793;
			local12.method33248(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xe", name = "r", descriptor = "(IZ)Lclient!xe;")
	public static Class658 method33246(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class654.anInt5667 * -1544286437 == Class654.anInt5666 * 353652329) {
			return new Class658(arg0, arg1);
		} else {
			@Pc(12) Class658 local12 = Class40.aClass658Array1[Class654.anInt5666 * 353652329];
			Class654.anInt5666 = (Class654.anInt5666 * 353652329 + 1 & Class233.anIntArray351[Class654.anInt5665 * 2087772395]) * 209592793;
			local12.method33248(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xe", name = "t", descriptor = "(IZ)Lclient!xe;")
	public static Class658 method33264(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class654.anInt5667 * -1544286437 == Class654.anInt5666 * 353652329) {
			return new Class658(arg0, arg1);
		} else {
			@Pc(12) Class658 local12 = Class40.aClass658Array1[Class654.anInt5666 * 353652329];
			Class654.anInt5666 = (Class654.anInt5666 * 353652329 + 1 & Class233.anIntArray351[Class654.anInt5665 * 2087772395]) * 209592793;
			local12.method33248(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xe", name = "<init>", descriptor = "(IZ)V")
	Class658(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method33248(arg0, arg1);
	}

	@OriginalMember(owner = "client!xe", name = "s", descriptor = "()Lclient!db;")
	public Class221 method33230() {
		this.aClass221_1.aClass23_1.method550(-1716294816);
		for (@Pc(6) int local6 = 0; local6 < this.aClass147_Sub3_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass147_Sub3_Sub1_Sub1Array2[local6] != null && this.aClass147_Sub3_Sub1_Sub1Array2[local6].aClass667_1 != null) {
				this.aClass221_1.aClass23_1.method552(this.aClass147_Sub3_Sub1_Sub1Array2[local6], 357524536);
			}
		}
		return this.aClass221_1;
	}

	@OriginalMember(owner = "client!xe", name = "j", descriptor = "(Lclient!di;[Lclient!dm;Z)V")
	void method33231(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class228[] arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < 64; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList25.iterator();
		while (true) {
			label65: while (local14.hasNext()) {
				@Pc(21) Class667 local21 = (Class667) local14.next();
				if (arg1 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg1.length && local25 != 64; local25++) {
						if (local21.aClass228_2 == arg1[local25] || local21.aClass228_2 == arg1[local25].aClass228_1) {
							aBooleanArray35[local25] = true;
							local21.method33461(-1128189405);
							local21.aBoolean979 = false;
							continue label65;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt5709 * 1636541165 == 0) {
						local14.remove();
						this.anInt5680--;
					} else {
						local21.aBoolean979 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(83) int local83 = 0; local83 < arg1.length && local83 != 64 && this.anInt5680 != 64; local83++) {
					if (!aBooleanArray35[local83]) {
						@Pc(111) Class667 local111 = new Class667(arg0, arg1[local83], this, this.aLong408);
						this.aList25.add(local111);
						this.anInt5680++;
						aBooleanArray35[local83] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xe", name = "l", descriptor = "()V")
	public void method33233() {
		this.aBoolean970 = true;
	}

	@OriginalMember(owner = "client!xe", name = "c", descriptor = "(J)V")
	public void method33234(@OriginalArg(0) long arg0) {
		this.aLong408 = arg0;
	}

	@OriginalMember(owner = "client!xe", name = "g", descriptor = "()V")
	void method33235() {
		this.aBoolean970 = false;
	}

	@OriginalMember(owner = "client!xe", name = "i", descriptor = "(Lclient!di;J)Z")
	boolean method33236(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong408 == this.aLong407) {
			this.method33235();
		} else {
			this.method33233();
		}
		if (arg1 - this.aLong408 > 750L) {
			this.method33254();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong407);
		@Pc(34) Iterator local34;
		@Pc(41) Class667 local41;
		if (this.aBoolean971) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class667) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass441_1.anInt4845 * -693128623; local43++) {
					local41.method33460(arg0, arg1, 1, !this.aBoolean970, (byte) -14);
				}
			}
			this.aBoolean971 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class667) local34.next();
			local41.method33460(arg0, arg1, local27, !this.aBoolean970, (byte) -81);
		}
		this.aLong407 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xe", name = "m", descriptor = "(J)V")
	public void method33237(@OriginalArg(0) long arg0) {
		this.aLong408 = arg0;
	}

	@OriginalMember(owner = "client!xe", name = "o", descriptor = "(Lclient!di;J[Lclient!dm;[Lclient!cp;Z)V")
	public void method33238(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class228[] arg2, @OriginalArg(3) Class211[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean972) {
			this.method33231(arg0, arg2, arg4);
			this.method33240(arg3, arg4);
			this.aLong408 = arg1;
		}
	}

	@OriginalMember(owner = "client!xe", name = "p", descriptor = "()V")
	public void method33239() {
		this.aBoolean970 = true;
	}

	@OriginalMember(owner = "client!xe", name = "a", descriptor = "([Lclient!cp;Z)V")
	void method33240(@OriginalArg(0) Class211[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList26.iterator();
		while (true) {
			@Pc(21) Class80_Sub34 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class80_Sub34) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass211_1 == arg0[local25] || local21.aClass211_1 == arg0[local25].aClass211_2) {
							aBooleanArray34[local25] = true;
							local21.method14505(2131492821);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method24395((byte) 68);
					this.anInt5681--;
					if (local21.method24399(-116635670)) {
						local21.method24395((byte) 87);
						Class654.anInt5671 -= -1631141167;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5681 != 16; local1++) {
					if (!aBooleanArray34[local1]) {
						local21 = null;
						if (arg0[local1].method25810(Class518.anInterface48_1, -1624047245).anInt4737 * 821164565 == 1 && Class654.anInt5671 * 637195825 < 32) {
							local21 = new Class80_Sub34(arg0[local1], this);
							Class654.aClass24_39.method563(local21, (long) (arg0[local1].anInt3603 * -251298279));
							Class654.anInt5671 += -1631141167;
						}
						if (local21 == null) {
							local21 = new Class80_Sub34(arg0[local1], this);
						}
						this.aList26.add(local21);
						this.anInt5681++;
						aBooleanArray34[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xe", name = "ag", descriptor = "(Lclient!te;Lclient!di;)V")
	void method33241(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass221_1.aClass23_1.method550(-1352801992);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class667 local15 = (Class667) local8.next();
			local15.method33462(arg0, arg1, this.aLong407);
		}
	}

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "(IIIII)V")
	public void method33242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5682 = arg0;
	}

	@OriginalMember(owner = "client!xe", name = "x", descriptor = "(Lclient!te;Lclient!di;)V")
	void method33243(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass221_1.aClass23_1.method550(-2014446258);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class667 local15 = (Class667) local8.next();
			local15.method33462(arg0, arg1, this.aLong407);
		}
	}

	@OriginalMember(owner = "client!xe", name = "w", descriptor = "()Lclient!db;")
	public Class221 method33244() {
		return this.aClass221_1;
	}

	@OriginalMember(owner = "client!xe", name = "al", descriptor = "(Lclient!te;Lclient!di;)V")
	void method33245(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass221_1.aClass23_1.method550(-2124568502);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class667 local15 = (Class667) local8.next();
			local15.method33462(arg0, arg1, this.aLong407);
		}
	}

	@OriginalMember(owner = "client!xe", name = "ab", descriptor = "(Lclient!te;Lclient!di;)V")
	void method33247(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass221_1.aClass23_1.method550(-1544386030);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class667 local15 = (Class667) local8.next();
			local15.method33462(arg0, arg1, this.aLong407);
		}
	}

	@OriginalMember(owner = "client!xe", name = "f", descriptor = "(IZ)V")
	void method33248(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class286.aList14.add(this);
		this.aLong408 = arg0;
		this.aLong407 = arg0;
		this.aBoolean971 = true;
		this.aBoolean973 = arg1;
	}

	@OriginalMember(owner = "client!xe", name = "d", descriptor = "()V")
	public void method33249() {
		this.aBoolean971 = true;
	}

	@OriginalMember(owner = "client!xe", name = "z", descriptor = "()V")
	void method33250() {
		this.aBoolean972 = true;
		@Pc(6) Iterator local6 = this.aList26.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class80_Sub34 local13 = (Class80_Sub34) local6.next();
			if (local13.aClass433_1.anInt4737 * 821164565 == 1) {
				local13.method24395((byte) 10);
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass147_Sub3_Sub1_Sub1Array2.length; local26++) {
			if (this.aClass147_Sub3_Sub1_Sub1Array2[local26] != null) {
				this.aClass147_Sub3_Sub1_Sub1Array2[local26].method23938();
				this.aClass147_Sub3_Sub1_Sub1Array2[local26] = null;
			}
		}
		this.anInt5679 = 0;
		this.aList25 = new LinkedList();
		this.anInt5680 = 0;
		this.aList26 = new LinkedList();
		this.anInt5681 = 0;
	}

	@OriginalMember(owner = "client!xe", name = "e", descriptor = "()V")
	public void method33251() {
		this.aBoolean971 = true;
	}

	@OriginalMember(owner = "client!xe", name = "y", descriptor = "()V")
	void method33252() {
		this.aBoolean970 = false;
	}

	@OriginalMember(owner = "client!xe", name = "n", descriptor = "()V")
	void method33253() {
		this.aBoolean970 = false;
	}

	@OriginalMember(owner = "client!xe", name = "u", descriptor = "()V")
	void method33254() {
		this.aBoolean972 = true;
		@Pc(6) Iterator local6 = this.aList26.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class80_Sub34 local13 = (Class80_Sub34) local6.next();
			if (local13.aClass433_1.anInt4737 * 821164565 == 1) {
				local13.method24395((byte) 68);
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass147_Sub3_Sub1_Sub1Array2.length; local26++) {
			if (this.aClass147_Sub3_Sub1_Sub1Array2[local26] != null) {
				this.aClass147_Sub3_Sub1_Sub1Array2[local26].method23938();
				this.aClass147_Sub3_Sub1_Sub1Array2[local26] = null;
			}
		}
		this.anInt5679 = 0;
		this.aList25 = new LinkedList();
		this.anInt5680 = 0;
		this.aList26 = new LinkedList();
		this.anInt5681 = 0;
	}

	@OriginalMember(owner = "client!xe", name = "b", descriptor = "(J)V")
	public void method33255(@OriginalArg(0) long arg0) {
		this.aLong408 = arg0;
	}

	@OriginalMember(owner = "client!xe", name = "ax", descriptor = "(Lclient!di;J[Lclient!dm;[Lclient!cp;Z)V")
	public void method33256(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class228[] arg2, @OriginalArg(3) Class211[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean972) {
			this.method33231(arg0, arg2, arg4);
			this.method33240(arg3, arg4);
			this.aLong408 = arg1;
		}
	}

	@OriginalMember(owner = "client!xe", name = "ay", descriptor = "(Lclient!di;J[Lclient!dm;[Lclient!cp;Z)V")
	public void method33257(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class228[] arg2, @OriginalArg(3) Class211[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean972) {
			this.method33231(arg0, arg2, arg4);
			this.method33240(arg3, arg4);
			this.aLong408 = arg1;
		}
	}

	@OriginalMember(owner = "client!xe", name = "ai", descriptor = "(Lclient!di;[Lclient!dm;Z)V")
	void method33258(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class228[] arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < 64; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList25.iterator();
		while (true) {
			label65: while (local14.hasNext()) {
				@Pc(21) Class667 local21 = (Class667) local14.next();
				if (arg1 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg1.length && local25 != 64; local25++) {
						if (local21.aClass228_2 == arg1[local25] || local21.aClass228_2 == arg1[local25].aClass228_1) {
							aBooleanArray35[local25] = true;
							local21.method33461(1758950731);
							local21.aBoolean979 = false;
							continue label65;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt5709 * 1636541165 == 0) {
						local14.remove();
						this.anInt5680--;
					} else {
						local21.aBoolean979 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(83) int local83 = 0; local83 < arg1.length && local83 != 64 && this.anInt5680 != 64; local83++) {
					if (!aBooleanArray35[local83]) {
						@Pc(111) Class667 local111 = new Class667(arg0, arg1[local83], this, this.aLong408);
						this.aList25.add(local111);
						this.anInt5680++;
						aBooleanArray35[local83] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xe", name = "aq", descriptor = "([Lclient!cp;Z)V")
	void method33259(@OriginalArg(0) Class211[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList26.iterator();
		while (true) {
			@Pc(21) Class80_Sub34 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class80_Sub34) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass211_1 == arg0[local25] || local21.aClass211_1 == arg0[local25].aClass211_2) {
							aBooleanArray34[local25] = true;
							local21.method14505(1646708362);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method24395((byte) 9);
					this.anInt5681--;
					if (local21.method24399(898571054)) {
						local21.method24395((byte) 94);
						Class654.anInt5671 -= -1631141167;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5681 != 16; local1++) {
					if (!aBooleanArray34[local1]) {
						local21 = null;
						if (arg0[local1].method25810(Class518.anInterface48_1, -1624047245).anInt4737 * 821164565 == 1 && Class654.anInt5671 * 637195825 < 32) {
							local21 = new Class80_Sub34(arg0[local1], this);
							Class654.aClass24_39.method563(local21, (long) (arg0[local1].anInt3603 * -251298279));
							Class654.anInt5671 += -1631141167;
						}
						if (local21 == null) {
							local21 = new Class80_Sub34(arg0[local1], this);
						}
						this.aList26.add(local21);
						this.anInt5681++;
						aBooleanArray34[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xe", name = "ao", descriptor = "([Lclient!cp;Z)V")
	void method33260(@OriginalArg(0) Class211[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList26.iterator();
		while (true) {
			@Pc(21) Class80_Sub34 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class80_Sub34) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass211_1 == arg0[local25] || local21.aClass211_1 == arg0[local25].aClass211_2) {
							aBooleanArray34[local25] = true;
							local21.method14505(1999315709);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method24395((byte) 105);
					this.anInt5681--;
					if (local21.method24399(1829165539)) {
						local21.method24395((byte) 57);
						Class654.anInt5671 -= -1631141167;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5681 != 16; local1++) {
					if (!aBooleanArray34[local1]) {
						local21 = null;
						if (arg0[local1].method25810(Class518.anInterface48_1, -1624047245).anInt4737 * 821164565 == 1 && Class654.anInt5671 * 637195825 < 32) {
							local21 = new Class80_Sub34(arg0[local1], this);
							Class654.aClass24_39.method563(local21, (long) (arg0[local1].anInt3603 * -251298279));
							Class654.anInt5671 += -1631141167;
						}
						if (local21 == null) {
							local21 = new Class80_Sub34(arg0[local1], this);
						}
						this.aList26.add(local21);
						this.anInt5681++;
						aBooleanArray34[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xe", name = "aj", descriptor = "([Lclient!cp;Z)V")
	void method33261(@OriginalArg(0) Class211[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList26.iterator();
		while (true) {
			@Pc(21) Class80_Sub34 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class80_Sub34) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass211_1 == arg0[local25] || local21.aClass211_1 == arg0[local25].aClass211_2) {
							aBooleanArray34[local25] = true;
							local21.method14505(2020365764);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method24395((byte) 25);
					this.anInt5681--;
					if (local21.method24399(-1128745295)) {
						local21.method24395((byte) 64);
						Class654.anInt5671 -= -1631141167;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5681 != 16; local1++) {
					if (!aBooleanArray34[local1]) {
						local21 = null;
						if (arg0[local1].method25810(Class518.anInterface48_1, -1624047245).anInt4737 * 821164565 == 1 && Class654.anInt5671 * 637195825 < 32) {
							local21 = new Class80_Sub34(arg0[local1], this);
							Class654.aClass24_39.method563(local21, (long) (arg0[local1].anInt3603 * -251298279));
							Class654.anInt5671 += -1631141167;
						}
						if (local21 == null) {
							local21 = new Class80_Sub34(arg0[local1], this);
						}
						this.aList26.add(local21);
						this.anInt5681++;
						aBooleanArray34[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xe", name = "ac", descriptor = "()Lclient!db;")
	public Class221 method33262() {
		this.aClass221_1.aClass23_1.method550(-2065119067);
		for (@Pc(6) int local6 = 0; local6 < this.aClass147_Sub3_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass147_Sub3_Sub1_Sub1Array2[local6] != null && this.aClass147_Sub3_Sub1_Sub1Array2[local6].aClass667_1 != null) {
				this.aClass221_1.aClass23_1.method552(this.aClass147_Sub3_Sub1_Sub1Array2[local6], 18488977);
			}
		}
		return this.aClass221_1;
	}

	@OriginalMember(owner = "client!xe", name = "v", descriptor = "()V")
	public void method33263() {
		this.aBoolean970 = true;
	}

	@OriginalMember(owner = "client!xe", name = "h", descriptor = "(IZ)V")
	void method33265(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class286.aList14.add(this);
		this.aLong408 = arg0;
		this.aLong407 = arg0;
		this.aBoolean971 = true;
		this.aBoolean973 = arg1;
	}

	@OriginalMember(owner = "client!xe", name = "ah", descriptor = "()Lclient!db;")
	public Class221 method33266() {
		return this.aClass221_1;
	}

	@OriginalMember(owner = "client!xe", name = "af", descriptor = "()Lclient!db;")
	public Class221 method33267() {
		return this.aClass221_1;
	}

	@OriginalMember(owner = "client!xe", name = "am", descriptor = "()Lclient!db;")
	public Class221 method33268() {
		return this.aClass221_1;
	}
}
