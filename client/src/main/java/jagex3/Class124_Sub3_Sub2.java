package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqt")
public final class Class124_Sub3_Sub2 extends Class124_Sub3 {

	@OriginalMember(owner = "client!aqt", name = "z", descriptor = "[F")
	float[] aFloatArray58;

	@OriginalMember(owner = "client!aqt", name = "u", descriptor = "[F")
	float[] aFloatArray59;

	@OriginalMember(owner = "client!aqt", name = "p", descriptor = "I")
	int anInt2871 = 0;

	@OriginalMember(owner = "client!aqt", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class124_Sub3_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqt", name = "ac", descriptor = "(Lclient!alw;IS)V")
	@Override
	void method21448(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		this.aFloatArray59 = new float[arg1];
		this.aFloatArray58 = new float[arg1];
		this.anInt2871 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray59[local12] = arg0.method22437(1002418729);
			this.aFloatArray58[local12] = arg0.method22437(-725917367);
		}
	}

	@OriginalMember(owner = "client!aqt", name = "ah", descriptor = "(I)V")
	@Override
	void method21447(@OriginalArg(0) int arg0) {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "ag", descriptor = "(FFFB)F")
	@Override
	float method21446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "ae", descriptor = "(FFI)V")
	@Override
	void method21445(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893()) {
			this.aFloat219 = this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "ai", descriptor = "(FFF)F")
	@Override
	float method21449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "k", descriptor = "(I)[D")
	@Override
	public double[] method21425(@OriginalArg(0) int arg0) {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29897(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "al", descriptor = "(I)F")
	@Override
	public float method21457(@OriginalArg(0) int arg0) {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "ay", descriptor = "()F")
	@Override
	public float method21464() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "ar", descriptor = "(Lclient!alw;I)V")
	@Override
	void method21458(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray59 = new float[arg1];
		this.aFloatArray58 = new float[arg1];
		this.anInt2871 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray59[local12] = arg0.method22437(-991162414);
			this.aFloatArray58[local12] = arg0.method22437(-903416837);
		}
	}

	@OriginalMember(owner = "client!aqt", name = "w", descriptor = "(I)F")
	@Override
	public float method21417(@OriginalArg(0) int arg0) {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29899(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "ap", descriptor = "(Lclient!alw;I)V")
	@Override
	void method21459(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray59 = new float[arg1];
		this.aFloatArray58 = new float[arg1];
		this.anInt2871 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray59[local12] = arg0.method22437(-1471601071);
			this.aFloatArray58[local12] = arg0.method22437(-1215756767);
		}
	}

	@OriginalMember(owner = "client!aqt", name = "as", descriptor = "(FFF)F")
	@Override
	float method21451(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "at", descriptor = "()V")
	@Override
	void method21452() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "m", descriptor = "(B)Lclient!ox;")
	@Override
	public Class472 method21414(@OriginalArg(0) byte arg0) {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2871 * -963830585].method29897(this.aFloat219);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqt", name = "am", descriptor = "()V")
	@Override
	void method21453() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "au", descriptor = "()V")
	@Override
	void method21454() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "aq", descriptor = "(FF)V")
	@Override
	void method21460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893()) {
			this.aFloat219 = this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "ad", descriptor = "()V")
	@Override
	void method21455() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "d", descriptor = "()[D")
	@Override
	public double[] method21415() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29897(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "s", descriptor = "()F")
	@Override
	public float method21427() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29899(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "y", descriptor = "()F")
	@Override
	public float method21428() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29899(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "g", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method21435() {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2871 * -963830585].method29897(this.aFloat219);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqt", name = "aw", descriptor = "(FFF)F")
	@Override
	float method21450(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "ax", descriptor = "(FF)V")
	@Override
	void method21461(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > (float) this.aClass479Array5[this.anInt2871 * -963830585].method29893()) {
			this.aFloat219 = this.aClass479Array5[this.anInt2871 * -963830585].method29893();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "av", descriptor = "()F")
	@Override
	public float method21462() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "ao", descriptor = "()F")
	@Override
	public float method21456() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "aj", descriptor = "()F")
	@Override
	public float method21463() {
		return this.aFloat219;
	}
}
