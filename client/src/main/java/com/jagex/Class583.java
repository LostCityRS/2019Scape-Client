package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
class Class583 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!tv", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 this$0;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!aiz;)V", line = 72)
	Class583(@OriginalArg(0) Class146_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "()V", line = 76)
	public void method31417() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) HashMap local9 = this.this$0.method11704(1158979694);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(10L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -81);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1294458701);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "()V", line = 76)
	public void method31418() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) HashMap local9 = this.this$0.method11704(-736748072);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(10L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -14);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 996341212);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "()V", line = 76)
	public void method31419() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) HashMap local9 = this.this$0.method11704(518425303);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(10L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -87);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 918568613);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "()V", line = 76)
	public void method31420() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) HashMap local9 = this.this$0.method11704(903810676);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(10L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -22);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 932750638);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tv", name = "run", descriptor = "()V", line = 76)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) HashMap local9 = this.this$0.method11704(-829700731);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(10L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -71);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 265550361);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tv", name = "fj", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5890)
	static final void method31421(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -1915563430;
		arg0.anInt3991 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * 555364075;
		arg0.anInt4043 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] * -260197387;
		Class354.method27694(arg0, -1174743804);
		if (arg0.anInt3971 * -158526639 == 0) {
			Class548.method31015(arg1, arg0, false, 1059373588);
		}
	}

	@OriginalMember(owner = "client!tv", name = "io", descriptor = "(Lclient!yf;I)V", line = 6465)
	static final void method31422(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class453.method28966(local11, local14, arg0, arg0.aClass93_Sub28_4 == Class121.aClass93_Sub28_2 ? Class310.aClass310_5 : Class310.aClass310_1, (byte) -1);
	}

	@OriginalMember(owner = "client!tv", name = "ahv", descriptor = "(Lclient!yf;B)V", line = 10827)
	static final void method31423(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18261(local12, -1085279889);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.aBoolean22 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tv", name = "aoy", descriptor = "(Lclient!yf;B)V", line = 12408)
	static final void method31424(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(46) float local46 = (float) (Math.atan((double) ((float) local13 / 2.0F / (float) local33)) * 2.0D);
		@Pc(59) float local59 = (float) (Math.atan((double) ((float) local23 / 2.0F / (float) local33)) * 2.0D);
		Class65.aClass123_Sub1_2.method8987(local46, local59, -768626247);
	}
}
