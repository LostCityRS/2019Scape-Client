package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
final class Class569 implements Runnable {

	@OriginalMember(owner = "client!td", name = "fc", descriptor = "Lclient!pf;")
	public static Class480 aClass480_124;

	// $FF: synthetic field
	@OriginalMember(owner = "client!td", name = "this$0", descriptor = "Lclient!aie;")
	final Class138_Sub1 aClass138_Sub1_1;

	@OriginalMember(owner = "client!td", name = "ajc", descriptor = "(Lclient!yp;B)V")
	static void method31534(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!td", name = "xn", descriptor = "(Lclient!yp;I)V")
	static void method31535(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean732 ? 1 : 0;
	}

	@OriginalMember(owner = "client!td", name = "br", descriptor = "(Lclient!ara;I)Ljava/lang/String;")
	static String method31536(@OriginalArg(0) Class80_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		return arg0.aString95 + Class90.method1870(16777215, -1242309149) + " >";
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!aie;)V")
	Class569(@OriginalArg(0) Class138_Sub1 arg0) {
		this.aClass138_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "q", descriptor = "()V")
	public void method31532() {
		label54: while (true) {
			try {
				if (!this.aClass138_Sub1_1.aBoolean225) {
					@Pc(9) Iterator local9 = this.aClass138_Sub1_1.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class575 local16 = (Class575) local9.next();
						local16.method31772(-2050579380);
					}
					@Pc(25) HashMap local25 = this.aClass138_Sub1_1.method10711(-189694987);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class516 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass138_Sub1_1.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class575 local72 = (Class575) local29.next();
									local72.method31773(-1823953044);
								}
								Class217.method25866(6L);
								continue label54;
							}
							local36 = (Class516) local29.next();
						} while (local36.aBoolean886);
						@Pc(46) Class541[] local46 = (Class541[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method31091(1058169068);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class603.method32133(null, local81, 839300151);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label54: while (true) {
			try {
				if (!this.aClass138_Sub1_1.aBoolean225) {
					@Pc(9) Iterator local9 = this.aClass138_Sub1_1.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class575 local16 = (Class575) local9.next();
						local16.method31772(-2048804040);
					}
					@Pc(25) HashMap local25 = this.aClass138_Sub1_1.method10711(-1336654140);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class516 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass138_Sub1_1.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class575 local72 = (Class575) local29.next();
									local72.method31773(-1848311656);
								}
								Class217.method25866(6L);
								continue label54;
							}
							local36 = (Class516) local29.next();
						} while (local36.aBoolean886);
						@Pc(46) Class541[] local46 = (Class541[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method31091(1433789425);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class603.method32133(null, local81, 839300151);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "()V")
	public void method31533() {
		label54: while (true) {
			try {
				if (!this.aClass138_Sub1_1.aBoolean225) {
					@Pc(9) Iterator local9 = this.aClass138_Sub1_1.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class575 local16 = (Class575) local9.next();
						local16.method31772(-2132931251);
					}
					@Pc(25) HashMap local25 = this.aClass138_Sub1_1.method10711(-705734113);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class516 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass138_Sub1_1.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class575 local72 = (Class575) local29.next();
									local72.method31773(-1928710216);
								}
								Class217.method25866(6L);
								continue label54;
							}
							local36 = (Class516) local29.next();
						} while (local36.aBoolean886);
						@Pc(46) Class541[] local46 = (Class541[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method31091(-901482204);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class603.method32133(null, local81, 839300151);
				local81.printStackTrace();
			}
			return;
		}
	}
}
