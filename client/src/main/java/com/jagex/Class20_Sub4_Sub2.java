package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ass")
public final class Class20_Sub4_Sub2 extends Class20_Sub4 {

	@OriginalMember(owner = "client!ass", name = "g", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ny;I)V")
	public static void method23018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class452 arg8, @OriginalArg(9) int arg9) {
		@Pc(5) Class331 local5 = (Class331) Class329.aMap18.get(arg0);
		if (local5 == null) {
			local5 = new Class331();
			Class329.aMap18.put(arg0, local5);
		}
		@Pc(31) Class80_Sub1_Sub14 local31 = local5.method27773(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 588951009);
		Class329.aClass24_29.method563(local31, (long) (local31.anInt3100 * 102067333));
		Class329.aClass3_15.method42(local31, 1599142138);
		client.anInt3552 = client.anInt3569 * 1273462915;
	}

	@OriginalMember(owner = "client!ass", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub4_Sub2(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ass", name = "c", descriptor = "(FFFI)F")
	@Override
	float method23116(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat237;
		if (this.aClass121_16.method9616(62001947).aFloat297 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass121_16.method9619(-441243625).method29481();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass121_16.method9616(800032200).method29481();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass121_16.method9616(-817247915).method29481() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass121_16.method9619(-441243625).method29481()) {
				arg1 += this.aClass121_16.method9616(-861522523).method29481() * arg2;
				if (arg1 > this.aClass121_16.method9619(-441243625).method29481()) {
					arg1 = this.aClass121_16.method9619(-441243625).method29481();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ass", name = "b", descriptor = "(I)V")
	@Override
	void method23099(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ass", name = "ac", descriptor = "()V")
	@Override
	void method23104() {
	}

	@OriginalMember(owner = "client!ass", name = "ai", descriptor = "(FFF)F")
	@Override
	float method23109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat237;
		if (this.aClass121_16.method9616(640682580).aFloat297 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass121_16.method9619(-441243625).method29481();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass121_16.method9616(-1382199709).method29481();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass121_16.method9616(-315355391).method29481() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass121_16.method9619(-441243625).method29481()) {
				arg1 += this.aClass121_16.method9616(-1129234293).method29481() * arg2;
				if (arg1 > this.aClass121_16.method9619(-441243625).method29481()) {
					arg1 = this.aClass121_16.method9619(-441243625).method29481();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ass", name = "aq", descriptor = "(FFF)F")
	@Override
	float method23101(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat237;
		if (this.aClass121_16.method9616(209548962).aFloat297 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass121_16.method9619(-441243625).method29481();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass121_16.method9616(-1662758121).method29481();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass121_16.method9616(-781247952).method29481() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass121_16.method9619(-441243625).method29481()) {
				arg1 += this.aClass121_16.method9616(-61383702).method29481() * arg2;
				if (arg1 > this.aClass121_16.method9619(-441243625).method29481()) {
					arg1 = this.aClass121_16.method9619(-441243625).method29481();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ass", name = "ao", descriptor = "()V")
	@Override
	void method23102() {
	}

	@OriginalMember(owner = "client!ass", name = "aj", descriptor = "()V")
	@Override
	void method23103() {
	}

	@OriginalMember(owner = "client!ass", name = "ab", descriptor = "(Lclient!ald;I)V")
	@Override
	void method23105(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ass", name = "ag", descriptor = "()V")
	@Override
	void method23100() {
	}

	@OriginalMember(owner = "client!ass", name = "ay", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method23107(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
	}

	@OriginalMember(owner = "client!ass", name = "al", descriptor = "(Lclient!ald;I)V")
	@Override
	void method23106(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}
}
