package com.jagex;

import java.awt.Dimension;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adc")
public final class Class78 {

	@OriginalMember(owner = "client!adc", name = "e", descriptor = "I")
	int anInt243;

	@OriginalMember(owner = "client!adc", name = "m", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	ReferenceQueue aReferenceQueue1 = new ReferenceQueue();

	@OriginalMember(owner = "client!adc", name = "n", descriptor = "[Lclient!atp;")
	WeakReference_Sub1[] aWeakReference_Sub1Array1 = new WeakReference_Sub1[16];

	@OriginalMember(owner = "client!adc", name = "e", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)V", line = 16)
	public void method1302(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1312((byte) -71);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			this.aWeakReference_Sub1Array1[local20] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local12, arg1);
			this.anInt243 += -475495169;
			if (this.anInt243 * 1245608703 >= this.aWeakReference_Sub1Array1.length) {
				this.method1307((byte) 95);
			}
			return;
		}
		while (local25.get() != arg0) {
			if (local25.aWeakReference_Sub1_1 == null) {
				local25.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local12, arg1);
				this.anInt243 += -475495169;
				if (this.anInt243 * 1245608703 >= this.aWeakReference_Sub1Array1.length) {
					this.method1307((byte) 18);
				}
				break;
			}
			local25 = local25.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!adc", name = "n", descriptor = "(Ljava/lang/Object;I)V", line = 41)
	public void method1303(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1312((byte) -101);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			return;
		}
		if (local25.get() == arg0) {
			this.aWeakReference_Sub1Array1[local20] = local25.aWeakReference_Sub1_1;
			this.anInt243 -= -475495169;
			return;
		}
		while (true) {
			@Pc(49) WeakReference_Sub1 local49 = local25.aWeakReference_Sub1_1;
			if (local49 == null) {
				break;
			}
			if (local49.get() == arg0) {
				local25.aWeakReference_Sub1_1 = local49.aWeakReference_Sub1_1;
				this.anInt243 -= -475495169;
				break;
			}
			local25 = local49;
		}
	}

	@OriginalMember(owner = "client!adc", name = "w", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method1304(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method1312((byte) -24);
		@Pc(12) int local12 = System.identityHashCode(arg0);
		@Pc(20) int local20 = local12 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(25) WeakReference_Sub1 local25 = this.aWeakReference_Sub1Array1[local20];
		if (local25 == null) {
			return;
		}
		if (local25.get() == arg0) {
			this.aWeakReference_Sub1Array1[local20] = local25.aWeakReference_Sub1_1;
			this.anInt243 -= -475495169;
			return;
		}
		while (true) {
			@Pc(49) WeakReference_Sub1 local49 = local25.aWeakReference_Sub1_1;
			if (local49 == null) {
				break;
			}
			if (local49.get() == arg0) {
				local25.aWeakReference_Sub1_1 = local49.aWeakReference_Sub1_1;
				this.anInt243 -= -475495169;
				break;
			}
			local25 = local49;
		}
	}

	@OriginalMember(owner = "client!adc", name = "l", descriptor = "()Ljava/util/ArrayList;", line = 64)
	public ArrayList method1305() {
		this.method1312((byte) -118);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt243 * 1245608703);
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

	@OriginalMember(owner = "client!adc", name = "m", descriptor = "(I)Ljava/util/ArrayList;", line = 64)
	public ArrayList method1306(@OriginalArg(0) int arg0) {
		this.method1312((byte) -104);
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt243 * 1245608703);
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

	@OriginalMember(owner = "client!adc", name = "k", descriptor = "(B)V", line = 83)
	void method1307(@OriginalArg(0) byte arg0) {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "d", descriptor = "()V", line = 83)
	void method1308() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "p", descriptor = "()V", line = 83)
	void method1309() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "z", descriptor = "()V", line = 83)
	void method1310() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "u", descriptor = "()V", line = 83)
	void method1311() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "f", descriptor = "(B)V", line = 104)
	void method1312(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(19) int local19 = local4.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
			if (local24 == local4) {
				this.aWeakReference_Sub1Array1[local19] = local4.aWeakReference_Sub1_1;
				this.anInt243 -= -475495169;
			} else {
				while (local24 != null && local24.aWeakReference_Sub1_1 != local4) {
					local24 = local24.aWeakReference_Sub1_1;
				}
				if (local24 != null) {
					local24.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt243 -= -475495169;
				}
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "c", descriptor = "()V", line = 104)
	void method1313() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(19) int local19 = local4.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
			if (local24 == local4) {
				this.aWeakReference_Sub1Array1[local19] = local4.aWeakReference_Sub1_1;
				this.anInt243 -= -475495169;
			} else {
				while (local24 != null && local24.aWeakReference_Sub1_1 != local4) {
					local24 = local24.aWeakReference_Sub1_1;
				}
				if (local24 != null) {
					local24.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt243 -= -475495169;
				}
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "r", descriptor = "()V", line = 104)
	void method1314() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(19) int local19 = local4.anInt3225 * 315867437 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
			if (local24 == local4) {
				this.aWeakReference_Sub1Array1[local19] = local4.aWeakReference_Sub1_1;
				this.anInt243 -= -475495169;
			} else {
				while (local24 != null && local24.aWeakReference_Sub1_1 != local4) {
					local24 = local24.aWeakReference_Sub1_1;
				}
				if (local24 != null) {
					local24.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt243 -= -475495169;
				}
			}
		}
	}

	@OriginalMember(owner = "client!adc", name = "eg", descriptor = "(II)V", line = 898)
	public static void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 1) {
			Class159_Sub1.anInt1944 = Class159_Sub1.anInt1948 * 1379158621;
		} else {
			Class159_Sub1.anInt1944 = arg0 * 1254637319;
		}
	}

	@OriginalMember(owner = "client!adc", name = "fg", descriptor = "(III)I", line = 2205)
	public static int method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class93_Sub26.aClass645_15.anInt5773 * -742728449 == -1) {
			return 1;
		}
		if (arg0 != Class51.options.aClass166_Sub4_2.method15426((byte) 59)) {
			Class704.changeToolkit(arg0, Class74.aClass74_100.method1259(Class106.lang, (byte) -116), true, (byte) -18);
			if (Class51.options.aClass166_Sub4_2.method15426((byte) 116) != arg0) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Class125_Sub3.aCanvas1.getSize();
			Class95.method1801(Class74.aClass74_100.method1259(Class106.lang, (byte) 52), true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) 22);
			@Pc(50) Class231 local50 = Class231.method25655(Class86.aClass497_15, Class93_Sub26.aClass645_15.anInt5773 * -742728449, 0);
			@Pc(53) long local53 = Class305.method26797(1680301932);
			Class694.aClass104_14.method20568();
			client.aClass470_51.method29419(0.0F, 256.0F, 0.0F);
			Class694.aClass104_14.method20601(client.aClass470_51);
			@Pc(66) Class489 local66 = Class694.aClass104_14.method20594();
			local66.method29909((float) (local32.width / 2), (float) (local32.height / 2), 512.0F, 512.0F, (float) client.world.method30474(-1086647736), (float) client.world.method30476(575023203), (float) local32.width, (float) local32.height);
			Class694.aClass104_14.method20604(local66);
			Class694.aClass104_14.method20606(1.0F);
			Class694.aClass104_14.method20607(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(116) Class109 local116 = Class694.aClass104_14.method20597(local50, 2048, 64, 64, 768);
			@Pc(118) int local118 = 0;
			label42: for (@Pc(120) int local120 = 0; local120 < 500; local120++) {
				Class694.aClass104_14.method20829(3, 0);
				for (@Pc(129) int local129 = 15; local129 >= 0; local129--) {
					for (@Pc(133) int local133 = 0; local133 <= local129; local133++) {
						client.aClass470_52.method29419((float) (((float) local133 - (float) local129 / 2.0F) * 512.0F), 0.0F, (float) ((local129 + 1) * 512));
						local116.method6976(client.aClass470_52, null, 0);
						local118++;
						if (Class305.method26797(-167998623) - local53 >= (long) arg1) {
							break label42;
						}
					}
				}
			}
			Class694.aClass104_14.method20529();
			@Pc(189) long local189 = (long) (local118 * 1000) / (Class305.method26797(1104549670) - local53);
			Class694.aClass104_14.method20829(3, 0);
			return (int) local189;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!adc", name = "atv", descriptor = "(Lclient!yf;I)V", line = 13253)
	static final void method1317(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
