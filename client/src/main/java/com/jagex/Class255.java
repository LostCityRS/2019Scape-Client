package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ez")
final class Class255 implements Runnable {

	@OriginalMember(owner = "client!ez", name = "f", descriptor = "Lclient!ed;")
	static Class104 aClass104_23;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ez", name = "this$0", descriptor = "Lclient!aiq;")
	final Class138_Sub2 aClass138_Sub2_3;

	@OriginalMember(owner = "client!ez", name = "l", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!ny;B)V")
	public static void method26406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class452 arg6, @OriginalArg(7) byte arg7) {
		Class20_Sub4_Sub2.method23018(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 889314120);
	}

	@OriginalMember(owner = "client!ez", name = "u", descriptor = "(II)I")
	static int method26407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ez", name = "ks", descriptor = "(Lclient!aku;IIIB)V")
	static void method26408(@OriginalArg(0) Class80_Sub31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		arg0.aPacketBit_2.p2_alt1(arg2);
		arg0.aPacketBit_2.p2_alt2(arg3);
		arg0.aPacketBit_2.p4_alt1(arg1);
	}

	@OriginalMember(owner = "client!ez", name = "<init>", descriptor = "(Lclient!aiq;)V")
	Class255(@OriginalArg(0) Class138_Sub2 arg0) {
		this.aClass138_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!ez", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub2_3.aBoolean240) {
					@Pc(9) HashMap local9 = this.aClass138_Sub2_3.method11540(622914329);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(50L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31091(1979365390);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ez", name = "q", descriptor = "()V")
	public void method26404() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub2_3.aBoolean240) {
					@Pc(9) HashMap local9 = this.aClass138_Sub2_3.method11540(-730584966);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(50L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31091(1398623052);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class603.method32133(null, local49, 839300151);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ez", name = "h", descriptor = "()V")
	public void method26405() {
		label36: while (true) {
			try {
				if (!this.aClass138_Sub2_3.aBoolean240) {
					@Pc(9) HashMap local9 = this.aClass138_Sub2_3.method11540(143708898);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class516 local20;
						do {
							if (!local13.hasNext()) {
								Class217.method25866(50L);
								continue label36;
							}
							local20 = (Class516) local13.next();
						} while (local20.aBoolean886);
						@Pc(30) Class541[] local30 = (Class541[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method31091(-97257098);
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
