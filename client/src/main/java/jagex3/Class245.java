package jagex3;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
final class Class245 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ei", name = "this$0", descriptor = "Lclient!aiw;")
	final Class146_Sub1 aClass146_Sub1_1;

	@OriginalMember(owner = "client!ei", name = "beb", descriptor = "(Lclient!yf;B)V")
	static void method25992(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class30 local18 = (Class30) Class74.aClass32_2.method18273(local12, -1384634871);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt105 * -476844805;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
	static void method25993(@OriginalArg(0) byte arg0) {
		Class93_Sub6.aClass16_9.method219((byte) 124);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!aiw;)V")
	Class245(@OriginalArg(0) Class146_Sub1 arg0) {
		this.aClass146_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "()V")
	public void method25988() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_1.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_1.method11612(-2136944235);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30836((byte) -117);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 1512059078);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_1.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_1.method11612(-1385834123);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30836((byte) -114);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 2062066211);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
	public void method25989() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_1.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_1.method11612(-1378516884);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30836((byte) -19);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 415488374);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "()V")
	public void method25990() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_1.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_1.method11612(-1968588541);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30836((byte) -119);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 457435595);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "()V")
	public void method25991() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_1.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_1.method11612(-2005335633);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(25L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30836((byte) -46);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 1148923478);
			}
			return;
		}
	}
}
