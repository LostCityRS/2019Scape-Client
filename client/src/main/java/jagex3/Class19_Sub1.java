package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoi")
public class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!aoi", name = "q", descriptor = "Lclient!alh;")
	Class132_Sub1 aClass132_Sub1_19;

	@OriginalMember(owner = "client!aoi", name = "<init>", descriptor = "(Lclient!alh;Z)V")
	Class19_Sub1(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass132_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!aoi", name = "ag", descriptor = "(Lclient!fg;II)V")
	@Override
	final void method23625(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class274.aClass258_11.method26156(arg0, arg1, this.aClass132_Sub1_19, (byte) 127);
	}

	@OriginalMember(owner = "client!aoi", name = "ai", descriptor = "(Lclient!fg;I)V")
	@Override
	final void method23635(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		Class274.aClass258_11.method26156(arg0, arg1, this.aClass132_Sub1_19, (byte) 127);
	}
}
