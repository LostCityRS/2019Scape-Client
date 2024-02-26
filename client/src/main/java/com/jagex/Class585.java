package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
final class Class585 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!tw", name = "this$0", descriptor = "Lclient!aie;")
	final Class138_Sub1 aClass138_Sub1_5;

	@OriginalMember(owner = "client!tw", name = "lz", descriptor = "(Lclient!yp;I)V")
	static void method31851(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2044896374);
		Class101.method2981(local16, arg0, 788502456);
	}

	@OriginalMember(owner = "client!tw", name = "my", descriptor = "(Lclient!yp;B)V")
	static void method31852(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class125.method20590(local11, local14, arg0, 2076801254);
	}

	@OriginalMember(owner = "client!tw", name = "akv", descriptor = "(Lclient!yp;I)V")
	static void method31853(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.anInt2017 * 1776676847 == 100 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tw", name = "auf", descriptor = "(Lclient!yp;I)V")
	static void method31854(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub30_1.method16458(418133518);
	}

	@OriginalMember(owner = "client!tw", name = "ga", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31855(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean810 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, -1739598535);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class121_Sub1.method9726(arg0.anInt4087 * -2053489901, 1404043250);
		}
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!aie;)V")
	Class585(@OriginalArg(0) Class138_Sub1 arg0) {
		this.aClass138_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub1_5.aBoolean225) {
					@Pc(9) HashMap local9 = this.aClass138_Sub1_5.method10711(-1770782310);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(10L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31084(1528653563);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "()V")
	public void method31849() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub1_5.aBoolean225) {
					@Pc(9) HashMap local9 = this.aClass138_Sub1_5.method10711(-1520293599);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(10L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31084(-1543534730);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "()V")
	public void method31850() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub1_5.aBoolean225) {
					@Pc(9) HashMap local9 = this.aClass138_Sub1_5.method10711(-531321742);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(10L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31084(2042222892);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
				local49.printStackTrace();
			}
			return;
		}
	}
}
