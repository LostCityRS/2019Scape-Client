package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xy")
public final class Class674 {

	@OriginalMember(owner = "client!xy", name = "o", descriptor = "[Z")
	static boolean[] aBooleanArray34 = new boolean[64];

	@OriginalMember(owner = "client!xy", name = "s", descriptor = "[Z")
	static boolean[] aBooleanArray35 = new boolean[16];

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "J")
	long aLong308;

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "J")
	long aLong309;

	@OriginalMember(owner = "client!xy", name = "r", descriptor = "I")
	int anInt6039;

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "Z")
	public boolean aBoolean879 = false;

	@OriginalMember(owner = "client!xy", name = "n", descriptor = "Z")
	boolean aBoolean881 = false;

	@OriginalMember(owner = "client!xy", name = "k", descriptor = "I")
	int anInt6036 = 0;

	@OriginalMember(owner = "client!xy", name = "l", descriptor = "Ljava/util/List;")
	List aList25 = new LinkedList();

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "I")
	int anInt6038 = 0;

	@OriginalMember(owner = "client!xy", name = "z", descriptor = "Ljava/util/List;")
	List aList24 = new LinkedList();

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "I")
	int anInt6037 = 0;

	@OriginalMember(owner = "client!xy", name = "d", descriptor = "Z")
	boolean aBoolean882 = false;

	@OriginalMember(owner = "client!xy", name = "c", descriptor = "Z")
	boolean aBoolean880 = false;

	@OriginalMember(owner = "client!xy", name = "v", descriptor = "Lclient!dm;")
	Class229 aClass229_1 = new Class229();

	@OriginalMember(owner = "client!xy", name = "m", descriptor = "[Lclient!atz;")
	Class149_Sub4_Sub1_Sub1[] aClass149_Sub4_Sub1_Sub1Array2 = new Class149_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!xy", name = "s", descriptor = "(IZ)Lclient!xy;")
	public static Class674 method33286(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class663.anInt5992 * 779180177 == Class663.anInt5993 * -1097527665) {
			return new Class674(arg0, arg1);
		} else {
			@Pc(12) Class674 local12 = Class296.aClass674Array1[Class663.anInt5993 * -1097527665];
			Class663.anInt5993 = (Class663.anInt5993 * -1097527665 + 1 & Class223.anIntArray338[Class663.anInt5998 * 763077233]) * -1290907537;
			local12.method33272(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "(IZ)Lclient!xy;")
	public static Class674 method33305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class663.anInt5992 * 779180177 == Class663.anInt5993 * -1097527665) {
			return new Class674(arg0, arg1);
		} else {
			@Pc(12) Class674 local12 = Class296.aClass674Array1[Class663.anInt5993 * -1097527665];
			Class663.anInt5993 = (Class663.anInt5993 * -1097527665 + 1 & Class223.anIntArray338[Class663.anInt5998 * 763077233]) * -1290907537;
			local12.method33272(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!xy", name = "<init>", descriptor = "(IZ)V")
	Class674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method33272(arg0, arg1);
	}

	@OriginalMember(owner = "client!xy", name = "ao", descriptor = "()Lclient!dm;")
	public Class229 method33271() {
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "n", descriptor = "(IZ)V")
	void method33272(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class701.aList26.add(this);
		this.aLong308 = arg0;
		this.aLong309 = arg0;
		this.aBoolean882 = true;
		this.aBoolean880 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "m", descriptor = "()V")
	public void method33273() {
		this.aBoolean882 = true;
	}

	@OriginalMember(owner = "client!xy", name = "ap", descriptor = "(IIIII)V")
	public void method33274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6039 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "()V")
	public void method33275() {
		this.aBoolean881 = true;
	}

	@OriginalMember(owner = "client!xy", name = "h", descriptor = "()V")
	public void method33276() {
		this.aBoolean882 = true;
	}

	@OriginalMember(owner = "client!xy", name = "l", descriptor = "(Lclient!dh;J)Z")
	boolean method33277(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong308 == this.aLong309) {
			this.method33289();
		} else {
			this.method33275();
		}
		if (arg1 - this.aLong308 > 750L) {
			this.method33311();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong309);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean882) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4986 * 1691524467; local43++) {
					local41.method33054(arg0, arg1, 1, !this.aBoolean881, 1394883906);
				}
			}
			this.aBoolean882 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method33054(arg0, arg1, local27, !this.aBoolean881, 1535924329);
		}
		this.aLong309 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "(J)V")
	public void method33278(@OriginalArg(0) long arg0) {
		this.aLong308 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "z", descriptor = "(Lclient!dh;J[Lclient!du;[Lclient!cq;Z)V")
	public void method33279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class234[] arg2, @OriginalArg(3) Class210[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean879) {
			this.method33280(arg0, arg2, arg4);
			this.method33281(arg3, arg4);
			this.aLong308 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "(Lclient!dh;[Lclient!du;Z)V")
	void method33280(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class234[] arg1, @OriginalArg(2) boolean arg2) {
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
							local21.method33053((byte) 83);
							local21.aBoolean873 = false;
							continue label65;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt6000 * 1110630611 == 0) {
						local14.remove();
						this.anInt6038--;
					} else {
						local21.aBoolean873 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(83) int local83 = 0; local83 < arg1.length && local83 != 64 && this.anInt6038 != 64; local83++) {
					if (!aBooleanArray34[local83]) {
						@Pc(111) Class664 local111 = new Class664(arg0, arg1[local83], this, this.aLong308);
						this.aList25.add(local111);
						this.anInt6038++;
						aBooleanArray34[local83] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "d", descriptor = "([Lclient!cq;Z)V")
	void method33281(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
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
					local21.method23981(1772493691);
					this.anInt6037--;
					if (local21.method23982(1120352703)) {
						local21.method23981(-186090536);
						Class663.anInt5994 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt6037 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) 69).anInt4953 * -1789015339 == 1 && Class663.anInt5994 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method221(local21, (long) (arg0[local1].anInt3636 * -1159348331));
							Class663.anInt5994 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt6037++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "c", descriptor = "()Lclient!dm;")
	public Class229 method33282() {
		this.aClass229_1.aClass8_1.method134(1310461502);
		for (@Pc(6) int local6 = 0; local6 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local6] != null && this.aClass149_Sub4_Sub1_Sub1Array2[local6].aClass664_1 != null) {
				this.aClass229_1.aClass8_1.method125(this.aClass149_Sub4_Sub1_Sub1Array2[local6], (byte) 108);
			}
		}
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "j", descriptor = "(Lclient!dh;J)Z")
	boolean method33283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong308 == this.aLong309) {
			this.method33289();
		} else {
			this.method33275();
		}
		if (arg1 - this.aLong308 > 750L) {
			this.method33311();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong309);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean882) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4986 * 1691524467; local43++) {
					local41.method33054(arg0, arg1, 1, !this.aBoolean881, -477057954);
				}
			}
			this.aBoolean882 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method33054(arg0, arg1, local27, !this.aBoolean881, -938332926);
		}
		this.aLong309 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "v", descriptor = "(Lclient!tx;Lclient!dh;)V")
	void method33284(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		this.aClass229_1.aClass8_1.method134(559526009);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class664 local15 = (Class664) local8.next();
			local15.method33055(arg0, arg1, this.aLong309);
		}
	}

	@OriginalMember(owner = "client!xy", name = "a", descriptor = "()V")
	public void method33285() {
		this.aBoolean882 = true;
	}

	@OriginalMember(owner = "client!xy", name = "y", descriptor = "(IZ)V")
	void method33287(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class701.aList26.add(this);
		this.aLong308 = arg0;
		this.aLong309 = arg0;
		this.aBoolean882 = true;
		this.aBoolean880 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "at", descriptor = "([Lclient!cq;Z)V")
	void method33288(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
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
					local21.method23981(-1255372412);
					this.anInt6037--;
					if (local21.method23982(-1278941036)) {
						local21.method23981(847920256);
						Class663.anInt5994 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt6037 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) 29).anInt4953 * -1789015339 == 1 && Class663.anInt5994 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method221(local21, (long) (arg0[local1].anInt3636 * -1159348331));
							Class663.anInt5994 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt6037++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "()V")
	void method33289() {
		this.aBoolean881 = false;
	}

	@OriginalMember(owner = "client!xy", name = "b", descriptor = "()V")
	public void method33290() {
		this.aBoolean882 = true;
	}

	@OriginalMember(owner = "client!xy", name = "i", descriptor = "()V")
	void method33291() {
		this.aBoolean881 = false;
	}

	@OriginalMember(owner = "client!xy", name = "x", descriptor = "()V")
	public void method33292() {
		this.aBoolean882 = true;
	}

	@OriginalMember(owner = "client!xy", name = "g", descriptor = "()V")
	void method33293() {
		this.aBoolean879 = true;
		@Pc(6) Iterator local6 = this.aList24.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class93_Sub12 local13 = (Class93_Sub12) local6.next();
			if (local13.aClass431_1.anInt4953 * -1789015339 == 1) {
				local13.method23981(-2088550610);
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local26++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local26] != null) {
				this.aClass149_Sub4_Sub1_Sub1Array2[local26].method23792();
				this.aClass149_Sub4_Sub1_Sub1Array2[local26] = null;
			}
		}
		this.anInt6036 = 0;
		this.aList25 = new LinkedList();
		this.anInt6038 = 0;
		this.aList24 = new LinkedList();
		this.anInt6037 = 0;
	}

	@OriginalMember(owner = "client!xy", name = "au", descriptor = "()Lclient!dm;")
	public Class229 method33294() {
		this.aClass229_1.aClass8_1.method134(1685146725);
		for (@Pc(6) int local6 = 0; local6 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local6] != null && this.aClass149_Sub4_Sub1_Sub1Array2[local6].aClass664_1 != null) {
				this.aClass229_1.aClass8_1.method125(this.aClass149_Sub4_Sub1_Sub1Array2[local6], (byte) 76);
			}
		}
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "aq", descriptor = "(IIIII)V")
	public void method33295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6039 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "(Lclient!dh;J)Z")
	boolean method33296(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong308 == this.aLong309) {
			this.method33289();
		} else {
			this.method33275();
		}
		if (arg1 - this.aLong308 > 750L) {
			this.method33311();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong309);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean882) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4986 * 1691524467; local43++) {
					local41.method33054(arg0, arg1, 1, !this.aBoolean881, -376740478);
				}
			}
			this.aBoolean882 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method33054(arg0, arg1, local27, !this.aBoolean881, -146471139);
		}
		this.aLong309 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "ae", descriptor = "(Lclient!dh;J)Z")
	boolean method33297(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong308 == this.aLong309) {
			this.method33289();
		} else {
			this.method33275();
		}
		if (arg1 - this.aLong308 > 750L) {
			this.method33311();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong309);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean882) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4986 * 1691524467; local43++) {
					local41.method33054(arg0, arg1, 1, !this.aBoolean881, 1323820608);
				}
			}
			this.aBoolean882 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method33054(arg0, arg1, local27, !this.aBoolean881, -1842272594);
		}
		this.aLong309 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "ag", descriptor = "(Lclient!dh;J)Z")
	boolean method33298(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong308 == this.aLong309) {
			this.method33289();
		} else {
			this.method33275();
		}
		if (arg1 - this.aLong308 > 750L) {
			this.method33311();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong309);
		@Pc(34) Iterator local34;
		@Pc(41) Class664 local41;
		if (this.aBoolean882) {
			local34 = this.aList25.iterator();
			while (local34.hasNext()) {
				local41 = (Class664) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass439_1.anInt4986 * 1691524467; local43++) {
					local41.method33054(arg0, arg1, 1, !this.aBoolean881, -1207838644);
				}
			}
			this.aBoolean882 = false;
		}
		local34 = this.aList25.iterator();
		while (local34.hasNext()) {
			local41 = (Class664) local34.next();
			local41.method33054(arg0, arg1, local27, !this.aBoolean881, -707383505);
		}
		this.aLong309 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!xy", name = "ah", descriptor = "(J)V")
	public void method33299(@OriginalArg(0) long arg0) {
		this.aLong308 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "al", descriptor = "(J)V")
	public void method33300(@OriginalArg(0) long arg0) {
		this.aLong308 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "ac", descriptor = "(Lclient!dh;J[Lclient!du;[Lclient!cq;Z)V")
	public void method33301(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class234[] arg2, @OriginalArg(3) Class210[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean879) {
			this.method33280(arg0, arg2, arg4);
			this.method33281(arg3, arg4);
			this.aLong308 = arg1;
		}
	}

	@OriginalMember(owner = "client!xy", name = "ai", descriptor = "(Lclient!dh;[Lclient!du;Z)V")
	void method33302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class234[] arg1, @OriginalArg(2) boolean arg2) {
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
							local21.method33053((byte) 16);
							local21.aBoolean873 = false;
							continue label65;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt6000 * 1110630611 == 0) {
						local14.remove();
						this.anInt6038--;
					} else {
						local21.aBoolean873 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(83) int local83 = 0; local83 < arg1.length && local83 != 64 && this.anInt6038 != 64; local83++) {
					if (!aBooleanArray34[local83]) {
						@Pc(111) Class664 local111 = new Class664(arg0, arg1[local83], this, this.aLong308);
						this.aList25.add(local111);
						this.anInt6038++;
						aBooleanArray34[local83] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "aw", descriptor = "([Lclient!cq;Z)V")
	void method33303(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
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
					local21.method23981(765762162);
					this.anInt6037--;
					if (local21.method23982(1435935534)) {
						local21.method23981(685276217);
						Class663.anInt5994 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt6037 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) 4).anInt4953 * -1789015339 == 1 && Class663.anInt5994 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method221(local21, (long) (arg0[local1].anInt3636 * -1159348331));
							Class663.anInt5994 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt6037++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "as", descriptor = "([Lclient!cq;Z)V")
	void method33304(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
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
					local21.method23981(966421771);
					this.anInt6037--;
					if (local21.method23982(1400438621)) {
						local21.method23981(270361109);
						Class663.anInt5994 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt6037 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) 59).anInt4953 * -1789015339 == 1 && Class663.anInt5994 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method221(local21, (long) (arg0[local1].anInt3636 * -1159348331));
							Class663.anInt5994 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt6037++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "r", descriptor = "(IIIII)V")
	public void method33306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6039 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "am", descriptor = "([Lclient!cq;Z)V")
	void method33307(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
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
					local21.method23981(-1329282319);
					this.anInt6037--;
					if (local21.method23982(-2104632900)) {
						local21.method23981(-57308103);
						Class663.anInt5994 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt6037 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) 105).anInt4953 * -1789015339 == 1 && Class663.anInt5994 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method221(local21, (long) (arg0[local1].anInt3636 * -1159348331));
							Class663.anInt5994 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt6037++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!xy", name = "o", descriptor = "()Lclient!dm;")
	public Class229 method33308() {
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "ar", descriptor = "(IIIII)V")
	public void method33309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6039 = arg0;
	}

	@OriginalMember(owner = "client!xy", name = "q", descriptor = "(IZ)V")
	void method33310(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class701.aList26.add(this);
		this.aLong308 = arg0;
		this.aLong309 = arg0;
		this.aBoolean882 = true;
		this.aBoolean880 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "k", descriptor = "()V")
	void method33311() {
		this.aBoolean879 = true;
		@Pc(6) Iterator local6 = this.aList24.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class93_Sub12 local13 = (Class93_Sub12) local6.next();
			if (local13.aClass431_1.anInt4953 * -1789015339 == 1) {
				local13.method23981(-1923675432);
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass149_Sub4_Sub1_Sub1Array2.length; local26++) {
			if (this.aClass149_Sub4_Sub1_Sub1Array2[local26] != null) {
				this.aClass149_Sub4_Sub1_Sub1Array2[local26].method23792();
				this.aClass149_Sub4_Sub1_Sub1Array2[local26] = null;
			}
		}
		this.anInt6036 = 0;
		this.aList25 = new LinkedList();
		this.anInt6038 = 0;
		this.aList24 = new LinkedList();
		this.anInt6037 = 0;
	}

	@OriginalMember(owner = "client!xy", name = "ax", descriptor = "(Lclient!tx;Lclient!dh;)V")
	void method33312(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		this.aClass229_1.aClass8_1.method134(443305899);
		@Pc(8) Iterator local8 = this.aList25.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class664 local15 = (Class664) local8.next();
			local15.method33055(arg0, arg1, this.aLong309);
		}
	}

	@OriginalMember(owner = "client!xy", name = "av", descriptor = "()Lclient!dm;")
	public Class229 method33313() {
		return this.aClass229_1;
	}

	@OriginalMember(owner = "client!xy", name = "ad", descriptor = "([Lclient!cq;Z)V")
	void method33314(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) boolean arg1) {
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
					local21.method23981(1124429837);
					this.anInt6037--;
					if (local21.method23982(2567841)) {
						local21.method23981(-321031473);
						Class663.anInt5994 -= 1165995747;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt6037 != 16; local1++) {
					if (!aBooleanArray35[local1]) {
						local21 = null;
						if (arg0[local1].method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) -33).anInt4953 * -1789015339 == 1 && Class663.anInt5994 * 91031243 < 32) {
							local21 = new Class93_Sub12(arg0[local1], this);
							Class663.aClass16_39.method221(local21, (long) (arg0[local1].anInt3636 * -1159348331));
							Class663.anInt5994 += 1165995747;
						}
						if (local21 == null) {
							local21 = new Class93_Sub12(arg0[local1], this);
						}
						this.aList24.add(local21);
						this.anInt6037++;
						aBooleanArray35[local1] = true;
					}
				}
			}
			return;
		}
	}
}
