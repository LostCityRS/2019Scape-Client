package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
final class Class577 implements Runnable {

	@OriginalMember(owner = "client!tp", name = "gp", descriptor = "Lclient!py;")
	public static Class497 aClass497_130;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tp", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 aClass146_Sub2_2;

	@OriginalMember(owner = "client!tp", name = "bff", descriptor = "(Lclient!yf;I)V")
	static void method31537(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!tp", name = "bw", descriptor = "(Lclient!hf;Lclient!yf;I)V")
	static void method31538(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		if (client.method25250(arg0).method13618((byte) -39) && client.aClass312_7 == null) {
			Class1.method16(arg0.anInt3994 * -1549590237, arg0.anInt4011 * 532402067, -1547528376);
			client.aClass312_7 = Class124_Sub2.method9308(arg0.anInt3994 * -1549590237, arg0.anInt4011 * 532402067, (byte) -96);
			Class354.method27789(client.aClass312_7, -1174743804);
		}
	}

	@OriginalMember(owner = "client!tp", name = "gs", descriptor = "(Lclient!yf;I)V")
	static void method31539(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class47.method958(local11, local14, arg0, 2091628223);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!aiz;)V")
	Class577(@OriginalArg(0) Class146_Sub2 arg0) {
		this.aClass146_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "()V")
	public void method31533() {
		label54: while (true) {
			try {
				if (!this.aClass146_Sub2_2.aBoolean261) {
					@Pc(9) Iterator local9 = this.aClass146_Sub2_2.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31556(1356595631);
					}
					@Pc(25) HashMap local25 = this.aClass146_Sub2_2.method11705(-193915262);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass146_Sub2_2.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31557(-1553933522);
								}
								Class212.method25532(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean795);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32791(null, local81, 2036494109);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		label54: while (true) {
			try {
				if (!this.aClass146_Sub2_2.aBoolean261) {
					@Pc(9) Iterator local9 = this.aClass146_Sub2_2.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31556(774987040);
					}
					@Pc(25) HashMap local25 = this.aClass146_Sub2_2.method11705(798736998);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass146_Sub2_2.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31557(-1718214278);
								}
								Class212.method25532(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean795);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32791(null, local81, 1691675102);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "()V")
	public void method31534() {
		label54: while (true) {
			try {
				if (!this.aClass146_Sub2_2.aBoolean261) {
					@Pc(9) Iterator local9 = this.aClass146_Sub2_2.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31556(-2066872527);
					}
					@Pc(25) HashMap local25 = this.aClass146_Sub2_2.method11705(22796649);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass146_Sub2_2.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31557(-225968090);
								}
								Class212.method25532(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean795);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32791(null, local81, 376743634);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "()V")
	public void method31535() {
		label54: while (true) {
			try {
				if (!this.aClass146_Sub2_2.aBoolean261) {
					@Pc(9) Iterator local9 = this.aClass146_Sub2_2.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31556(1230635892);
					}
					@Pc(25) HashMap local25 = this.aClass146_Sub2_2.method11705(-1195272089);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass146_Sub2_2.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31557(-1414424588);
								}
								Class212.method25532(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean795);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32791(null, local81, 2096297870);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "()V")
	public void method31536() {
		label54: while (true) {
			try {
				if (!this.aClass146_Sub2_2.aBoolean261) {
					@Pc(9) Iterator local9 = this.aClass146_Sub2_2.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31556(-1371003472);
					}
					@Pc(25) HashMap local25 = this.aClass146_Sub2_2.method11705(-527242015);
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.aClass146_Sub2_2.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31557(-343500836);
								}
								Class212.method25532(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean795);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30839((byte) 1);
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32791(null, local81, 603499362);
				local81.printStackTrace();
			}
			return;
		}
	}
}
