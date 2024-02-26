package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
final class Class241 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ee", name = "this$0", descriptor = "Lclient!aiq;")
	final Class138_Sub2 aClass138_Sub2_1;

	@OriginalMember(owner = "client!ee", name = "bcs", descriptor = "(Lclient!yp;I)V")
	static void method26230(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!ee", name = "axc", descriptor = "(Lclient!yp;I)V")
	static void method26231(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		Class90.method1869(local33, Class369.method28340(local13, local23, 1254885789), arg0, (byte) -1);
	}

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "(IS)I")
	public static int method26232(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(5) Class331 local5 = (Class331) Class329.aMap18.get(arg0);
		return local5 == null ? 0 : local5.method27774(-742435763);
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!aiq;)V")
	Class241(@OriginalArg(0) Class138_Sub2 arg0) {
		this.aClass138_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub2_1.aBoolean240) {
					@Pc(9) HashMap local9 = this.aClass138_Sub2_1.method11540(-373335668);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(25L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31084(-97305034);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "()V")
	public void method26228() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub2_1.aBoolean240) {
					@Pc(9) HashMap local9 = this.aClass138_Sub2_1.method11540(-440889283);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(25L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31084(-1737945467);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "()V")
	public void method26229() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub2_1.aBoolean240) {
					@Pc(9) HashMap local9 = this.aClass138_Sub2_1.method11540(-1792638311);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(25L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31084(-564510172);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
			}
			return;
		}
	}
}
