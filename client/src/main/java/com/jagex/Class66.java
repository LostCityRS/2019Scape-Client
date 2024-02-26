package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.security.SecureRandom;
import java.util.Iterator;

@OriginalClass("client!acq")
final class Class66 implements Iterator {

	@OriginalMember(owner = "client!acq", name = "jm", descriptor = "Ljava/security/SecureRandom;")
	static SecureRandom aSecureRandom1;

	@OriginalMember(owner = "client!acq", name = "t", descriptor = "I")
	int anInt216;

	// $FF: synthetic field
	@OriginalMember(owner = "client!acq", name = "this$0", descriptor = "Lclient!acy;")
	final Class73 aClass73_1;

	@OriginalMember(owner = "client!acq", name = "dq", descriptor = "(Lclient!yp;I)V")
	static void method1239(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class588.method31901(local11, local14, arg0, -33931412);
	}

	@OriginalMember(owner = "client!acq", name = "jn", descriptor = "(IIIIIZZI)V")
	static void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (client.aClass539_1.method30921(1899416129) - 2) * 512 || arg2 > (client.aClass539_1.method31011(-1583569612) - 2) * 512)) {
			@Pc(27) float[] local27 = client.aFloatArray95;
			client.aFloatArray95[1] = -1.0F;
			local27[0] = -1.0F;
			return;
		}
		@Pc(44) int local44 = Class439.method29150(arg1, arg2, arg0, 1037753497) - arg4;
		client.aClass471_51.method29760(Class279.aClass102_9.method20897());
		client.aClass471_51.method29783((float) arg3, 0.0F, 0.0F);
		Class279.aClass102_9.method20759(client.aClass471_51);
		if (arg5) {
			Class279.aClass102_9.method21114((float) arg1, (float) local44, (float) arg2, client.aFloatArray95);
		} else {
			Class279.aClass102_9.method20790((float) arg1, (float) local44, (float) arg2, client.aFloatArray95);
		}
		client.aClass471_51.method29783((float) -arg3, 0.0F, 0.0F);
		Class279.aClass102_9.method20759(client.aClass471_51);
		if (!arg6) {
			client.aFloatArray95[0] -= client.anInt3587 * -1188403957;
			client.aFloatArray95[1] -= client.anInt3565 * 1317994825;
		}
	}

	@OriginalMember(owner = "client!acq", name = "<init>", descriptor = "(Lclient!acy;)V")
	Class66(@OriginalArg(0) Class73 arg0) {
		this.aClass73_1 = arg0;
	}

	@OriginalMember(owner = "client!acq", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method1235() {
		return this.aClass73_1.anInterface11Array3[(this.anInt216 += 670181807) * 442289487 - 1];
	}

	@OriginalMember(owner = "client!acq", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt216 * 442289487 < this.aClass73_1.anInterface11Array3.length;
	}

	@OriginalMember(owner = "client!acq", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		return this.aClass73_1.anInterface11Array3[(this.anInt216 += 670181807) * 442289487 - 1];
	}

	@OriginalMember(owner = "client!acq", name = "e", descriptor = "()V")
	public void method1236() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acq", name = "t", descriptor = "()Z")
	public boolean method1237() {
		return this.anInt216 * 442289487 < this.aClass73_1.anInterface11Array3.length;
	}

	@OriginalMember(owner = "client!acq", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acq", name = "u", descriptor = "()V")
	public void method1238() {
		throw new UnsupportedOperationException();
	}
}
