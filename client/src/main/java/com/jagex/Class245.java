package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
class Class245 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ei", name = "this$0", descriptor = "Lclient!aiw;")
	final Class146_Sub1 this$0;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!aiw;)V", line = 52)
	Class245(@OriginalArg(0) Class146_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "()V", line = 56)
	public void method25895() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-2136944235);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -117);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1512059078);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "run", descriptor = "()V", line = 56)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1385834123);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -114);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 2062066211);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()V", line = 56)
	public void method25896() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1378516884);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -19);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 415488374);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "()V", line = 56)
	public void method25897() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-1968588541);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -119);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 457435595);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "()V", line = 56)
	public void method25898() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean258) {
					@Pc(9) HashMap local9 = this.this$0.method11612(-2005335633);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25431(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean786);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30712((byte) -46);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32608(null, local49, 1148923478);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V", line = 161)
	static void method25899(@OriginalArg(0) byte arg0) {
		Class93_Sub6.aClass16_9.method225((byte) 124);
	}

	@OriginalMember(owner = "client!ei", name = "beb", descriptor = "(Lclient!yf;B)V", line = 15033)
	static final void method25900(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class30 local18 = (Class30) Class74.aClass32_1.get(local12, -1384634871);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt105 * -476844805;
	}
}
