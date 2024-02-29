package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ass")
public final class Class25_Sub4_Sub2 extends Class25_Sub4 {

	@OriginalMember(owner = "client!ass", name = "z", descriptor = "[F")
	float[] aFloatArray73;

	@OriginalMember(owner = "client!ass", name = "u", descriptor = "[F")
	float[] aFloatArray74;

	@OriginalMember(owner = "client!ass", name = "p", descriptor = "I")
	int anInt3156 = 0;

	@OriginalMember(owner = "client!ass", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class25_Sub4_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ass", name = "ac", descriptor = "()V")
	@Override
	void method23151() {
		this.anInt3156 += -912422763;
	}

	@OriginalMember(owner = "client!ass", name = "al", descriptor = "()V")
	@Override
	void method23156() {
		this.anInt3156 += -912422763;
	}

	@OriginalMember(owner = "client!ass", name = "b", descriptor = "(FFFI)F")
	@Override
	float method23153(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass479Array8[this.anInt3156 * 937231037].method29893();
		return (this.aFloatArray73[this.anInt3156 * 937231037] - this.aFloatArray74[this.anInt3156 * 937231037]) * local12 + this.aFloatArray74[this.anInt3156 * 937231037];
	}

	@OriginalMember(owner = "client!ass", name = "x", descriptor = "(FFI)V")
	@Override
	void method23152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass479Array8[this.anInt3156 * 937231037].method29893()) {
			this.aFloat229 = this.aClass479Array8[this.anInt3156 * 937231037].method29893();
		}
	}

	@OriginalMember(owner = "client!ass", name = "m", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23132(@OriginalArg(0) int arg0) {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3156 * 937231037].method29897(this.aFloat229);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ass", name = "a", descriptor = "(I)[D")
	@Override
	double[] method23155(@OriginalArg(0) int arg0) {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29897(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "k", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23134(@OriginalArg(0) int arg0) {
		return this.method23132(-1950379654);
	}

	@OriginalMember(owner = "client!ass", name = "j", descriptor = "(Lclient!alw;I)V")
	@Override
	void method23161(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray74 = new float[arg1];
		this.aFloatArray73 = new float[arg1];
		this.anInt3156 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray74[local12] = arg0.method22437(30311528);
			this.aFloatArray73[local12] = arg0.method22437(1922227266);
		}
	}

	@OriginalMember(owner = "client!ass", name = "i", descriptor = "(FFF)F")
	@Override
	float method23158(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass479Array8[this.anInt3156 * 937231037].method29893();
		return (this.aFloatArray73[this.anInt3156 * 937231037] - this.aFloatArray74[this.anInt3156 * 937231037]) * local12 + this.aFloatArray74[this.anInt3156 * 937231037];
	}

	@OriginalMember(owner = "client!ass", name = "ag", descriptor = "(FF)V")
	@Override
	void method23160(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass479Array8[this.anInt3156 * 937231037].method29893()) {
			this.aFloat229 = this.aClass479Array8[this.anInt3156 * 937231037].method29893();
		}
	}

	@OriginalMember(owner = "client!ass", name = "t", descriptor = "(Lclient!alw;I)V")
	@Override
	void method23159(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray74 = new float[arg1];
		this.aFloatArray73 = new float[arg1];
		this.anInt3156 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray74[local12] = arg0.method22437(1537135703);
			this.aFloatArray73[local12] = arg0.method22437(-1386678195);
		}
	}

	@OriginalMember(owner = "client!ass", name = "d", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23139() {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3156 * 937231037].method29897(this.aFloat229);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ass", name = "g", descriptor = "(Lclient!alw;IB)V")
	@Override
	void method23157(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray74 = new float[arg1];
		this.aFloatArray73 = new float[arg1];
		this.anInt3156 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray74[local12] = arg0.method22437(1233811034);
			this.aFloatArray73[local12] = arg0.method22437(683278535);
		}
	}

	@OriginalMember(owner = "client!ass", name = "y", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23145() {
		return this.method23132(1910760167);
	}

	@OriginalMember(owner = "client!ass", name = "ah", descriptor = "(FF)V")
	@Override
	void method23163(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass479Array8[this.anInt3156 * 937231037].method29893()) {
			this.aFloat229 = this.aClass479Array8[this.anInt3156 * 937231037].method29893();
		}
	}

	@OriginalMember(owner = "client!ass", name = "s", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23129() {
		return this.method23132(-930873016);
	}

	@OriginalMember(owner = "client!ass", name = "aw", descriptor = "()[D")
	@Override
	double[] method23165() {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29897(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "ai", descriptor = "()[D")
	@Override
	double[] method23164() {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29897(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "h", descriptor = "(I)V")
	@Override
	void method23154(@OriginalArg(0) int arg0) {
		this.anInt3156 += -912422763;
	}

	@OriginalMember(owner = "client!ass", name = "as", descriptor = "()[D")
	@Override
	double[] method23166() {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29897(this.aFloat229);
	}
}
