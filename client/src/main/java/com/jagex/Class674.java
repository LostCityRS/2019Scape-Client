package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xy")
public class Class674 {

	@OriginalMember(owner = "client!xy", name = "o", descriptor = "[Z")
	static boolean[] aBooleanArray34 = new boolean[64];

	@OriginalMember(owner = "client!xy", name = "s", descriptor = "[Z")
	static boolean[] aBooleanArray35 = new boolean[16];

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "J")
	long aLong305;

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "J")
	long aLong306;

	@OriginalMember(owner = "client!xy", name = "r", descriptor = "I")
	int anInt5878;

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "Z")
	public boolean aBoolean870 = false;

	@OriginalMember(owner = "client!xy", name = "n", descriptor = "Z")
	boolean aBoolean872 = false;

	@OriginalMember(owner = "client!xy", name = "k", descriptor = "I")
	int anInt5875 = 0;

	@OriginalMember(owner = "client!xy", name = "l", descriptor = "Ljava/util/List;")
	List aList25 = new LinkedList();

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "I")
	int anInt5877 = 0;

	@OriginalMember(owner = "client!xy", name = "z", descriptor = "Ljava/util/List;")
	List aList24 = new LinkedList();

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "I")
	int anInt5876 = 0;

	@OriginalMember(owner = "client!xy", name = "d", descriptor = "Z")
	boolean aBoolean873 = false;

	@OriginalMember(owner = "client!xy", name = "c", descriptor = "Z")
	boolean aBoolean871 = false;

	@OriginalMember(owner = "client!xy", name = "v", descriptor = "Lclient!dm;")
	Class229 aClass229_1 = new Class229();

	@OriginalMember(owner = "client!xy", name = "m", descriptor = "[Lclient!atz;")
	Class149_Sub4_Sub1_Sub1[] aClass149_Sub4_Sub1_Sub1Array2 = new Class149_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!xy", name = "s", descriptor = "(IZ)Lclient!xy;", line = 29)
	public static Class674 method33090(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class663.anInt5831 * 779180177 == Class663.anInt5832 * -1097527665) {
			return new Class674(arg0, arg1);
		} else {
			@Pc(12) Class674 local12 = Class296.aClass674Array1[Class663.anInt5832 * -1097527665];
			Class663.anInt5832 = (Class663.anInt5832 * -1097527665 + 1 & Class223.anIntArray336[Class663.anInt5837 * 763077233]) * -1290907537;
			local12.method33092(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "(IZ)Lclient!xy;", line = 29)
	public static Class674 method33091(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class663.anInt5831 * 779180177 == Class663.anInt5832 * -1097527665) {
			return new Class674(arg0, arg1);
		} else {
			@Pc(12) Class674 local12 = Class296.aClass674Array1[Class663.anInt5832 * -1097527665];
			Class663.anInt5832 = (Class663.anInt5832 * -1097527665 + 1 & Class223.anIntArray336[Class663.anInt5837 * 763077233]) * -1290907537;
			local12.method33092(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xy", name = "<init>", descriptor = "(IZ)V", line = 38)
	Class674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method33092(arg0, arg1);
	}

	@OriginalMember(owner = "client!xy", name = "n", descriptor = "(IZ)V", line = 44)
	void method33092(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class701.aList26.add(this);
		this.aLong305 = arg0;
		this.aLong306 = arg0;
		this.aBoolean873 = true;
		this.aBoolean871 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "y", descriptor = "(IZ)V", line = 44)
	void method33093(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class701.aList26.add(this);
		this.aLong305 = arg0;
		this.aLong306 = arg0;
		this.aBoolean873 = true;
		this.aBoolean871 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "q", descriptor = "(IZ)V", line = 44)
	void method33094(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class701.aList26.add(this);
		this.aLong305 = arg0;
		this.aLong306 = arg0;
		this.aBoolean873 = true;
		this.aBoolean871 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "m", descriptor = "()V", line = 52)
	public void method33095() {
		this.aBoolean873 = true;
	}

	@OriginalMember(owner = "client!xy", name = "h", descriptor = "()V", line = 52)
	public void method33096() {
		this.aBoolean873 = true;
	}

	@OriginalMember(owner = "client!xy", name = "a", descriptor = "()V", line = 52)
	public void method33097() {
		this.aBoolean873 = true;
	}

	@OriginalMember(owner = "client!xy", name = "b", descriptor = "()V", line = 52)
	public void method33098() {
		this.aBoolean873 = true;
	}

	@OriginalMember(owner = "client!xy", name = "x", descriptor = "()V", line = 52)
	public void method33099() {
		this.aBoolean873 = true;
	}

	@OriginalMember(owner = "client!xy", name = "g", descriptor = "()V", line = 56)
	void method33100() {
		this.aBoolean870 = true;
		@Pc(6) Iterator local6 = this.aList24.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class93_Sub12 local13 = (Class93_Sub12) local6.next();
			if (local13.aClass431_1.anInt4792 * -1789015339 == 1) {
				local13.method23969(-2088550610);
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local26++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local26] != null) {
				this.aClass149_Sub4_Sub1_Sub1Array2[local26].method23785();
				this.aClass149_Sub4_Sub1_Sub1Array2[local26] = null;
			}
		}
		this.anInt5875 = 0;
		this.aList25 = new LinkedList();
		this.anInt5877 = 0;
		this.aList24 = new LinkedList();
		this.anInt5876 = 0;
	}

	@OriginalMember(owner = "client!xy", name = "k", descriptor = "()V", line = 56)
	void method33101() {
		this.aBoolean870 = true;
		@Pc(6) Iterator local6 = this.aList24.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class93_Sub12 local13 = (Class93_Sub12) local6.next();
			if (local13.aClass431_1.anInt4792 * -1789015339 == 1) {
				local13.method23969(-1923675432);
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local26++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local26] != null) {
				this.aClass149_Sub4_Sub1_Sub1Array2[local26].method23785();
				this.aClass149_Sub4_Sub1_Sub1Array2[local26] = null;
			}
		}
		this.anInt5875 = 0;
		this.aList25 = new LinkedList();
		this.anInt5877 = 0;
		this.aList24 = new LinkedList();
		this.anInt5876 = 0;
	}

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "()V", line = 77)
	public void method33102() {
		this.aBoolean872 = true;
	}

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "()V", line = 81)
	void method33103() {
		this.aBoolean872 = false;
	}

	@OriginalMember(owner = "client!xy", name = "i", descriptor = "()V", line = 81)
	void method33104() {
		this.aBoolean872 = false;
	}

	@OriginalMember(owner = "client!xy", name = "l", descriptor = "(Lclient!dh;J)Z", line = 85)
	boolean method33105(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong305 == this.aLong306) {
			this.method33103();
		} else {
			this.method33102();
		}
		if (arg1 - this.aLong305 > 750L) {
			this.method33101();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong306);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean873) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4825 * 1691524467; local43++) {
					local41.method32876(arg0, arg1, 1, !this.aBoolean872, 1394883906);
				}
			}
			this.aBoolean873 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method32876(arg0, arg1, local27, !this.aBoolean872, 1535924329);
		}
		this.aLong306 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "j", descriptor = "(Lclient!dh;J)Z", line = 85)
	boolean method33106(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong305 == this.aLong306) {
			this.method33103();
		} else {
			this.method33102();
		}
		if (arg1 - this.aLong305 > 750L) {
			this.method33101();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong306);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean873) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4825 * 1691524467; local43++) {
					local41.method32876(arg0, arg1, 1, !this.aBoolean872, -477057954);
				}
			}
			this.aBoolean873 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method32876(arg0, arg1, local27, !this.aBoolean872, -938332926);
		}
		this.aLong306 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "(Lclient!dh;J)Z", line = 85)
	boolean method33107(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong305 == this.aLong306) {
			this.method33103();
		} else {
			this.method33102();
		}
		if (arg1 - this.aLong305 > 750L) {
			this.method33101();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong306);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean873) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4825 * 1691524467; local43++) {
					local41.method32876(arg0, arg1, 1, !this.aBoolean872, -376740478);
				}
			}
			this.aBoolean873 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method32876(arg0, arg1, local27, !this.aBoolean872, -146471139);
		}
		this.aLong306 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "ae", descriptor = "(Lclient!dh;J)Z", line = 85)
	boolean method33108(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong305 == this.aLong306) {
			this.method33103();
		} else {
			this.method33102();
		}
		if (arg1 - this.aLong305 > 750L) {
			this.method33101();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong306);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean873) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4825 * 1691524467; local43++) {
					local41.method32876(arg0, arg1, 1, !this.aBoolean872, 1323820608);
				}
			}
			this.aBoolean873 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method32876(arg0, arg1, local27, !this.aBoolean872, -1842272594);
		}
		this.aLong306 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "ag", descriptor = "(Lclient!dh;J)Z", line = 85)
	boolean method33109(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong305 == this.aLong306) {
			this.method33103();
		} else {
			this.method33102();
		}
		if (arg1 - this.aLong305 > 750L) {
			this.method33101();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong306);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean873) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4825 * 1691524467; local43++) {
					local41.method32876(arg0, arg1, 1, !this.aBoolean872, -1207838644);
				}
			}
			this.aBoolean873 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method32876(arg0, arg1, local27, !this.aBoolean872, -707383505);
		}
		this.aLong306 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "(J)V", line = 114)
	public void method33110(@OriginalArg(0) long arg0) {
		this.aLong305 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "ah", descriptor = "(J)V", line = 114)
	public void method33111(@OriginalArg(0) long arg0) {
		this.aLong305 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "al", descriptor = "(J)V", line = 114)
	public void method33112(@OriginalArg(0) long arg0) {
		this.aLong305 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "z", descriptor = "(Lclient!dh;J[Lclient!du;[Lclient!cq;Z)V", line = 118)
	public void method33113(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class234[] arg2, @OriginalArg(3) Class210[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean870) {
			this.method33115(arg0, arg2, arg4);
			this.method33117(arg3, arg4);
			this.aLong305 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "ac", descriptor = "(Lclient!dh;J[Lclient!du;[Lclient!cq;Z)V", line = 118)
	public void method33114(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class234[] arg2, @OriginalArg(3) Class210[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean870) {
			this.method33115(arg0, arg2, arg4);
			this.method33117(arg3, arg4);
			this.aLong305 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "(Lclient!dh;[Lclient!du;Z)V", line = 125)
	void method33115(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class234[] arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < 64; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList25.iterator();
		while (true) {
			label65: while (local14.hasNext()) {
				@Pc(21) Class664 local21 = (Class664) local14.next();
				if (arg1 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg1.length && local25 != 64; local25++) {
						if (local21.aClass234_2 == arg1[local25] || local21.aClass234_2 == arg1[local25].aClass234_1) {
							aBooleanArray34[local25] = true;
							local21.method32872((byte) 83);
							local21.aBoolean864 = false;
							continue label65;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt5839 * 1110630611 == 0) {
						local14.remove();
						this.anInt5877--;
					} else {
						local21.aBoolean864 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(83) int local83 = 0; local83 < arg1.length && local83 != 64 && this.anInt5877 != 64; local83++) {
					if (!aBooleanArray34[local83]) {
						@Pc(111) Class664 local111 = new Class664(arg0, arg1[local83], this, this.aLong305);
						this.aList25.add(local111);
						this.anInt5877++;
						aBooleanArray34[local83] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "ai", descriptor = "(Lclient!dh;[Lclient!du;Z)V", line = 125)
	void method33116(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class234[] arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < 64; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList25.iterator();
		while (true) {
			label65: while (local14.hasNext()) {
				@Pc(21) Class664 local21 = (Class664) local14.next();
				if (arg1 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg1.length && local25 != 64; local25++) {
						if (local21.aClass234_2 == arg1[local25] || local21.aClass234_2 == arg1[local25].aClass234_1) {
							aBooleanArray34[local25] = true;
							local21.method32872((byte) 16);
							local21.aBoolean864 = false;
							continue label65;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt5839 * 1110630611 == 0) {
						local14.remove();
						this.anInt5877--;
					} else {
						local21.aBoolean864 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(83) int local83 = 0; local83 < arg1.length && local83 != 64 && this.anInt5877 != 64; local83++) {
					if (!aBooleanArray34[local83]) {
						@Pc(111) Class664 local111 = new Class664(arg0, arg1[local83], this, this.aLong305);
						this.aList25.add(local111);
						this.anInt5877++;
						aBooleanArray34[local83] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "d", descriptor = "([Lclient!cq;Z)V", line = 163)
	void method33117(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList24.iterator();
		while (true) {
			@Pc(21) Class93_Sub12 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class93_Sub12) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass210_1 == arg0[local25] || local21.aClass210_1 == arg0[local25].aClass210_2) {
							aBooleanArray35[local25] = true;
							local21.method13449(-2104993900);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method23969(1772493691);
					this.anInt5876--;
					if (local21.method23970(1120352703)) {
						local21.method23969(-186090536);
						Class663.anInt5833 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5876 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25410(Class110_Sub15_Sub2.anInterface47_1, (byte) 69).anInt4792 * -1789015339 == 1 && Class663.anInt5833 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method220(local21, (long) (arg0[local1].anInt3595 * -1159348331));
							Class663.anInt5833 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt5876++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "at", descriptor = "([Lclient!cq;Z)V", line = 163)
	void method33118(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList24.iterator();
		while (true) {
			@Pc(21) Class93_Sub12 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class93_Sub12) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass210_1 == arg0[local25] || local21.aClass210_1 == arg0[local25].aClass210_2) {
							aBooleanArray35[local25] = true;
							local21.method13449(-2126512021);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method23969(-1255372412);
					this.anInt5876--;
					if (local21.method23970(-1278941036)) {
						local21.method23969(847920256);
						Class663.anInt5833 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5876 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25410(Class110_Sub15_Sub2.anInterface47_1, (byte) 29).anInt4792 * -1789015339 == 1 && Class663.anInt5833 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method220(local21, (long) (arg0[local1].anInt3595 * -1159348331));
							Class663.anInt5833 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt5876++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "aw", descriptor = "([Lclient!cq;Z)V", line = 163)
	void method33119(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList24.iterator();
		while (true) {
			@Pc(21) Class93_Sub12 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class93_Sub12) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass210_1 == arg0[local25] || local21.aClass210_1 == arg0[local25].aClass210_2) {
							aBooleanArray35[local25] = true;
							local21.method13449(-2093432732);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method23969(765762162);
					this.anInt5876--;
					if (local21.method23970(1435935534)) {
						local21.method23969(685276217);
						Class663.anInt5833 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5876 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25410(Class110_Sub15_Sub2.anInterface47_1, (byte) 4).anInt4792 * -1789015339 == 1 && Class663.anInt5833 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method220(local21, (long) (arg0[local1].anInt3595 * -1159348331));
							Class663.anInt5833 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt5876++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "as", descriptor = "([Lclient!cq;Z)V", line = 163)
	void method33120(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList24.iterator();
		while (true) {
			@Pc(21) Class93_Sub12 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class93_Sub12) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass210_1 == arg0[local25] || local21.aClass210_1 == arg0[local25].aClass210_2) {
							aBooleanArray35[local25] = true;
							local21.method13449(-2143740618);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method23969(966421771);
					this.anInt5876--;
					if (local21.method23970(1400438621)) {
						local21.method23969(270361109);
						Class663.anInt5833 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5876 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25410(Class110_Sub15_Sub2.anInterface47_1, (byte) 59).anInt4792 * -1789015339 == 1 && Class663.anInt5833 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method220(local21, (long) (arg0[local1].anInt3595 * -1159348331));
							Class663.anInt5833 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt5876++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "am", descriptor = "([Lclient!cq;Z)V", line = 163)
	void method33121(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList24.iterator();
		while (true) {
			@Pc(21) Class93_Sub12 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class93_Sub12) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass210_1 == arg0[local25] || local21.aClass210_1 == arg0[local25].aClass210_2) {
							aBooleanArray35[local25] = true;
							local21.method13449(-2146439694);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method23969(-1329282319);
					this.anInt5876--;
					if (local21.method23970(-2104632900)) {
						local21.method23969(-57308103);
						Class663.anInt5833 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5876 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25410(Class110_Sub15_Sub2.anInterface47_1, (byte) 105).anInt4792 * -1789015339 == 1 && Class663.anInt5833 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method220(local21, (long) (arg0[local1].anInt3595 * -1159348331));
							Class663.anInt5833 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt5876++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "ad", descriptor = "([Lclient!cq;Z)V", line = 163)
	void method33122(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray35[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList24.iterator();
		while (true) {
			@Pc(21) Class93_Sub12 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class93_Sub12) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass210_1 == arg0[local25] || local21.aClass210_1 == arg0[local25].aClass210_2) {
							aBooleanArray35[local25] = true;
							local21.method13449(-2140597542);
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method23969(1124429837);
					this.anInt5876--;
					if (local21.method23970(2567841)) {
						local21.method23969(-321031473);
						Class663.anInt5833 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5876 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25410(Class110_Sub15_Sub2.anInterface47_1, (byte) -33).anInt4792 * -1789015339 == 1 && Class663.anInt5833 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method220(local21, (long) (arg0[local1].anInt3595 * -1159348331));
							Class663.anInt5833 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt5876++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "c", descriptor = "()Lclient!dm;", line = 209)
	public Class229 method33123() {
		this.aClass229_1.aClass8_1.method135(1310461502);
		for (@Pc(6) int local6 = 0; local6 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local6] != null && this.aClass149_Sub4_Sub1_Sub1Array2[local6].aClass664_1 != null) {
				this.aClass229_1.aClass8_1.method125(this.aClass149_Sub4_Sub1_Sub1Array2[local6], (byte) 108);
			}
		}
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "au", descriptor = "()Lclient!dm;", line = 209)
	public Class229 method33124() {
		this.aClass229_1.aClass8_1.method135(1685146725);
		for (@Pc(6) int local6 = 0; local6 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local6] != null && this.aClass149_Sub4_Sub1_Sub1Array2[local6].aClass664_1 != null) {
				this.aClass229_1.aClass8_1.method125(this.aClass149_Sub4_Sub1_Sub1Array2[local6], (byte) 76);
			}
		}
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "ap", descriptor = "(IIIII)V", line = 217)
	public void method33125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5878 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "aq", descriptor = "(IIIII)V", line = 217)
	public void method33126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5878 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "r", descriptor = "(IIIII)V", line = 217)
	public void method33127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5878 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "ar", descriptor = "(IIIII)V", line = 217)
	public void method33128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5878 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "v", descriptor = "(Lclient!tx;Lclient!dh;)V", line = 221)
	void method33129(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		this.aClass229_1.aClass8_1.method135(559526009);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class664 local15 = (Class664) local8.next();
			local15.method32879(arg0, arg1, this.aLong306);
		}
	}

	@OriginalMember(owner = "client!xy", name = "ax", descriptor = "(Lclient!tx;Lclient!dh;)V", line = 221)
	void method33130(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		this.aClass229_1.aClass8_1.method135(443305899);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class664 local15 = (Class664) local8.next();
			local15.method32879(arg0, arg1, this.aLong306);
		}
	}

	@OriginalMember(owner = "client!xy", name = "ao", descriptor = "()Lclient!dm;", line = 231)
	public Class229 method33131() {
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "o", descriptor = "()Lclient!dm;", line = 231)
	public Class229 method33132() {
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "av", descriptor = "()Lclient!dm;", line = 231)
	public Class229 method33133() {
		return this.aClass229_1;
	}
}
