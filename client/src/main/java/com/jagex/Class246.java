package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
class Class246 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ej", name = "this$0", descriptor = "Lclient!aiw;")
	final Class146_Sub1 this$0;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!aiw;)V", line = 28)
	Class246(@OriginalArg(0) Class146_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "()V", line = 32)
	public void method25901() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1469219650);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30720((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 292545417);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "()V", line = 32)
	public void method25902() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1414397060);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30720((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1853757115);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "()V", line = 32)
	public void method25903() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1866094143);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30720((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1856518560);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "run", descriptor = "()V", line = 32)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1575507606);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30720((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1623254160);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "()V", line = 32)
	public void method25904() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-2022824372);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30720((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1082315589);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "(Lclient!arm;B)V", line = 494)
	static void method25905(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		Class454.aClass22_55.method408(arg0, 445076978);
		Class454.anInt5042 += 863099247;
		@Pc(12) Class93_Sub1_Sub8 local12 = null;
		if (arg0.aBoolean504 || "".equals(arg0.aString100)) {
			local12 = new Class93_Sub1_Sub8(arg0.aString100);
			Class454.anInt5039 += 1842152815;
		} else {
			@Pc(25) long local25 = arg0.aLong155 * 7070093341456026777L;
			for (local12 = (Class93_Sub1_Sub8) Class454.aClass16_34.method214(local25); local12 != null && !local12.aString101.equals(arg0.aString100); local12 = (Class93_Sub1_Sub8) Class454.aClass16_34.method216(-1796956099)) {
			}
			if (local12 == null) {
				local12 = (Class93_Sub1_Sub8) Class454.aClass240_85.method25829(local25);
				if (local12 != null && !local12.aString101.equals(arg0.aString100)) {
					local12 = null;
				}
				if (local12 == null) {
					local12 = new Class93_Sub1_Sub8(arg0.aString100);
				}
				Class454.aClass16_34.method220(local12, local25);
				Class454.anInt5039 += 1842152815;
			}
		}
		if (local12.method21720(arg0, -140779030)) {
			Class420.method28739(local12, -1375030286);
		}
	}

	@OriginalMember(owner = "client!ej", name = "bcq", descriptor = "(Lclient!yf;I)V", line = 14683)
	static final void method25906(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 100;
	}
}
