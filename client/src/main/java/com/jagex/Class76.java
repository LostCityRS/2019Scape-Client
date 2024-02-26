package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class76 {

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "I")
	int anInt250;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	ReferenceQueue aReferenceQueue1 = new ReferenceQueue();

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "[Lclient!atn;")
	WeakReference_Sub1[] aWeakReference_Sub1Array1 = new WeakReference_Sub1[16];

	@OriginalMember(owner = "client!ada", name = "em", descriptor = "(Lclient!yp;S)V")
	static void method1362(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2046088053);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class352.method28063(local16, local22, arg0, (byte) -1);
	}

	@OriginalMember(owner = "client!ada", name = "pp", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method1363(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1866197873) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray39 = Class431.method29089(local13, arg2, 1522069815);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!ada", name = "ali", descriptor = "(Lclient!yp;I)V")
	static void method1364(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		if (!Class104_Sub5.method6646(local13, local28, 1898681395)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "(I)V")
	void method1346(@OriginalArg(0) int arg0) {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3236 * 1634230277 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "()Ljava/util/ArrayList;")
	public ArrayList method1347() {
		this.method1354(-212504361);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt250 * 1967222597);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(28) Object local28 = local23.get();
				if (local28 != null) {
					local10.add(local28);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(Ljava/lang/Object;I)V")
	public void method1348(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1354(-1304553414);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			return;
		}
		if (local25.get() == arg0) {
			this.aWeakReference_Sub1Array1[local20] = local25.aWeakReference_Sub1_1;
			this.anInt250 -= 1064487821;
			return;
		}
		while (true) {
			@Pc(49) WeakReference_Sub1 local49 = local25.aWeakReference_Sub1_1;
			if (local49 == null) {
				break;
			}
			if (local49.get() == arg0) {
				local25.aWeakReference_Sub1_1 = local49.aWeakReference_Sub1_1;
				this.anInt250 -= 1064487821;
				break;
			}
			local25 = local49;
		}
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)Ljava/util/ArrayList;")
	public ArrayList method1349(@OriginalArg(0) int arg0) {
		this.method1354(-1223461956);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt250 * 1967222597);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(28) Object local28 = local23.get();
				if (local28 != null) {
					local10.add(local28);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "()Ljava/util/ArrayList;")
	public ArrayList method1350() {
		this.method1354(-397257665);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt250 * 1967222597);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(28) Object local28 = local23.get();
				if (local28 != null) {
					local10.add(local28);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "(Ljava/lang/Object;)V")
	public void method1351(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1354(-901919510);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			return;
		}
		if (local25.get() == arg0) {
			this.aWeakReference_Sub1Array1[local20] = local25.aWeakReference_Sub1_1;
			this.anInt250 -= 1064487821;
			return;
		}
		while (true) {
			@Pc(49) WeakReference_Sub1 local49 = local25.aWeakReference_Sub1_1;
			if (local49 == null) {
				break;
			}
			if (local49.get() == arg0) {
				local25.aWeakReference_Sub1_1 = local49.aWeakReference_Sub1_1;
				this.anInt250 -= 1064487821;
				break;
			}
			local25 = local49;
		}
	}

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V")
	public void method1352(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1354(-2140613216);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			this.aWeakReference_Sub1Array1[local20] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local12, arg1);
			this.anInt250 += 1064487821;
			if (this.anInt250 * 1967222597 >= this.aWeakReference_Sub1Array1.length) {
				this.method1346(581105898);
			}
			return;
		}
		while (local25.get() != arg0) {
			if (local25.aWeakReference_Sub1_1 == null) {
				local25.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local12, arg1);
				this.anInt250 += 1064487821;
				if (this.anInt250 * 1967222597 >= this.aWeakReference_Sub1Array1.length) {
					this.method1346(581105898);
				}
				break;
			}
			local25 = local25.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "(Ljava/lang/Object;)V")
	public void method1353(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1354(-1883668872);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			return;
		}
		if (local25.get() == arg0) {
			this.aWeakReference_Sub1Array1[local20] = local25.aWeakReference_Sub1_1;
			this.anInt250 -= 1064487821;
			return;
		}
		while (true) {
			@Pc(49) WeakReference_Sub1 local49 = local25.aWeakReference_Sub1_1;
			if (local49 == null) {
				break;
			}
			if (local49.get() == arg0) {
				local25.aWeakReference_Sub1_1 = local49.aWeakReference_Sub1_1;
				this.anInt250 -= 1064487821;
				break;
			}
			local25 = local49;
		}
	}

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "(I)V")
	void method1354(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(19) int local19 = local4.anInt3236 * 1634230277 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
			if (local24 == local4) {
				this.aWeakReference_Sub1Array1[local19] = local4.aWeakReference_Sub1_1;
				this.anInt250 -= 1064487821;
			} else {
				while (local24 != null && local4 != local24.aWeakReference_Sub1_1) {
					local24 = local24.aWeakReference_Sub1_1;
				}
				if (local24 != null) {
					local24.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt250 -= 1064487821;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "o", descriptor = "()Ljava/util/ArrayList;")
	public ArrayList method1355() {
		this.method1354(-7054257);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt250 * 1967222597);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(28) Object local28 = local23.get();
				if (local28 != null) {
					local10.add(local28);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "()Ljava/util/ArrayList;")
	public ArrayList method1356() {
		this.method1354(-346655253);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt250 * 1967222597);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(28) Object local28 = local23.get();
				if (local28 != null) {
					local10.add(local28);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "()V")
	void method1357() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(19) int local19 = local4.anInt3236 * 1634230277 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
			if (local24 == local4) {
				this.aWeakReference_Sub1Array1[local19] = local4.aWeakReference_Sub1_1;
				this.anInt250 -= 1064487821;
			} else {
				while (local24 != null && local4 != local24.aWeakReference_Sub1_1) {
					local24 = local24.aWeakReference_Sub1_1;
				}
				if (local24 != null) {
					local24.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt250 -= 1064487821;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)V")
	public void method1358(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1354(-508342000);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			this.aWeakReference_Sub1Array1[local20] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local12, arg1);
			this.anInt250 += 1064487821;
			if (this.anInt250 * 1967222597 >= this.aWeakReference_Sub1Array1.length) {
				this.method1346(581105898);
			}
			return;
		}
		while (local25.get() != arg0) {
			if (local25.aWeakReference_Sub1_1 == null) {
				local25.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local12, arg1);
				this.anInt250 += 1064487821;
				if (this.anInt250 * 1967222597 >= this.aWeakReference_Sub1Array1.length) {
					this.method1346(581105898);
				}
				break;
			}
			local25 = local25.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "()V")
	void method1359() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3236 * 1634230277 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "()V")
	void method1360() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(19) int local19 = local4.anInt3236 * 1634230277 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
			if (local24 == local4) {
				this.aWeakReference_Sub1Array1[local19] = local4.aWeakReference_Sub1_1;
				this.anInt250 -= 1064487821;
			} else {
				while (local24 != null && local4 != local24.aWeakReference_Sub1_1) {
					local24 = local24.aWeakReference_Sub1_1;
				}
				if (local24 != null) {
					local24.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt250 -= 1064487821;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "()Ljava/util/ArrayList;")
	public ArrayList method1361() {
		this.method1354(-1209527840);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt250 * 1967222597);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(28) Object local28 = local23.get();
				if (local28 != null) {
					local10.add(local28);
				}
			}
		}
		return local10;
	}
}
