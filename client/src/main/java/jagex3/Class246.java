package jagex3;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
final class Class246 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ej", name = "this$0", descriptor = "Lclient!aiw;")
	final Class146_Sub1 aClass146_Sub1_2;

	@OriginalMember(owner = "client!ej", name = "bcq", descriptor = "(Lclient!yf;I)V")
	static void method25998(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 100;
	}

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "(Lclient!arm;B)V")
	static void method25999(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		Class454.aClass22_55.method407(arg0, 445076978);
		Class454.anInt5203 += 863099247;
		@Pc(12) Class93_Sub1_Sub8 local12 = null;
		if (arg0.aBoolean505 || "".equals(arg0.aString100)) {
			local12 = new Class93_Sub1_Sub8(arg0.aString100);
			Class454.anInt5200 += 1842152815;
		} else {
			@Pc(25) long local25 = arg0.aLong155 * 7070093341456026777L;
			for (local12 = (Class93_Sub1_Sub8) Class454.aClass16_34.method215(local25); local12 != null && !local12.aString101.equals(arg0.aString100); local12 = (Class93_Sub1_Sub8) Class454.aClass16_34.method216(-1796956099)) {
			}
			if (local12 == null) {
				local12 = (Class93_Sub1_Sub8) Class454.aClass240_85.method25932(local25);
				if (local12 != null && !local12.aString101.equals(arg0.aString100)) {
					local12 = null;
				}
				if (local12 == null) {
					local12 = new Class93_Sub1_Sub8(arg0.aString100);
				}
				Class454.aClass16_34.method221(local12, local25);
				Class454.anInt5200 += 1842152815;
			}
		}
		if (local12.method21729(arg0, -140779030)) {
			Class420.method28924(local12, -1375030286);
		}
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!aiw;)V")
	Class246(@OriginalArg(0) Class146_Sub1 arg0) {
		this.aClass146_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "()V")
	public void method25994() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_2.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_2.method11612(-1469219650);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 292545417);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "()V")
	public void method25995() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_2.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_2.method11612(-1414397060);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 1853757115);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "()V")
	public void method25996() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_2.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_2.method11612(-1866094143);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 1856518560);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_2.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_2.method11612(-1575507606);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 1623254160);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "()V")
	public void method25997() {
		label36: while (true) {
			try {
				if (!this.aClass146_Sub1_2.aBoolean259) {
					@Pc(9) HashMap local9 = this.aClass146_Sub1_2.method11612(-2022824372);
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class508 local20;
						do {
							if (!local13.hasNext()) {
								Class212.method25532(50L);
								continue label36;
							}
							local20 = (Class508) local13.next();
						} while (local20.aBoolean795);
						@Pc(30) Class535[] local30 = (Class535[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class646.method32791(null, local49, 1082315589);
			}
			return;
		}
	}
}
