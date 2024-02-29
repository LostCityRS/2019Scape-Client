package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anv")
public final class Class166_Sub44 extends Class166 {

	@OriginalMember(owner = "client!anv", name = "dw", descriptor = "(Lclient!yf;I)V")
	static void method16462(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class547.method31190(local11, local14, arg0, 634993086);
	}

	@OriginalMember(owner = "client!anv", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub44(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anv", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anv", name = "x", descriptor = "()V")
	public void method16454() {
		if (this.aClass93_Sub36_49.method14365(1062139722).method146(-1950568503)) {
			if (this.anInt2379 * 960141055 < Class341.aClass341_3.anInt4228 * 422180295 || this.anInt2379 * 960141055 > Class341.aClass341_4.anInt4228 * 422180295) {
				this.anInt2379 = this.method16554((byte) -101) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < Class351.aClass351_1.anInt4244 * 1429919719 || this.anInt2379 * 960141055 > Class351.aClass351_3.anInt4244 * 1429919719) {
			this.anInt2379 = this.method16554((byte) -119) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anv", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return this.aClass93_Sub36_49.method14365(128959092).method146(1551622751) ? Class341.aClass341_1.anInt4228 * 422180295 : Class351.aClass351_1.anInt4244 * 1429919719;
	}

	@OriginalMember(owner = "client!anv", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anv", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anv", name = "a", descriptor = "()I")
	public int method16455() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anv", name = "o", descriptor = "(S)V")
	public void method16456(@OriginalArg(0) short arg0) {
		if (this.aClass93_Sub36_49.method14365(-1974160186).method146(1921269213)) {
			if (this.anInt2379 * 960141055 < Class341.aClass341_3.anInt4228 * 422180295 || this.anInt2379 * 960141055 > Class341.aClass341_4.anInt4228 * 422180295) {
				this.anInt2379 = this.method16554((byte) 4) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < Class351.aClass351_1.anInt4244 * 1429919719 || this.anInt2379 * 960141055 > Class351.aClass351_3.anInt4244 * 1429919719) {
			this.anInt2379 = this.method16554((byte) -116) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anv", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return this.aClass93_Sub36_49.method14365(-975145598).method146(1896790536) ? Class341.aClass341_1.anInt4228 * 422180295 : Class351.aClass351_1.anInt4244 * 1429919719;
	}

	@OriginalMember(owner = "client!anv", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return this.aClass93_Sub36_49.method14365(1510402538).method146(-1426882656) ? Class341.aClass341_1.anInt4228 * 422180295 : Class351.aClass351_1.anInt4244 * 1429919719;
	}

	@OriginalMember(owner = "client!anv", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return this.aClass93_Sub36_49.method14365(1163974079).method146(-789146806) ? Class341.aClass341_1.anInt4228 * 422180295 : Class351.aClass351_1.anInt4244 * 1429919719;
	}

	@OriginalMember(owner = "client!anv", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anv", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anv", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anv", name = "s", descriptor = "(I)I")
	public int method16457(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anv", name = "y", descriptor = "()V")
	public void method16458() {
		if (this.aClass93_Sub36_49.method14365(-1011854095).method146(-1023382949)) {
			if (this.anInt2379 * 960141055 < Class341.aClass341_3.anInt4228 * 422180295 || this.anInt2379 * 960141055 > Class341.aClass341_4.anInt4228 * 422180295) {
				this.anInt2379 = this.method16554((byte) -44) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < Class351.aClass351_1.anInt4244 * 1429919719 || this.anInt2379 * 960141055 > Class351.aClass351_3.anInt4244 * 1429919719) {
			this.anInt2379 = this.method16554((byte) -67) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anv", name = "q", descriptor = "()V")
	public void method16459() {
		if (this.aClass93_Sub36_49.method14365(-1185549588).method146(-1109898761)) {
			if (this.anInt2379 * 960141055 < Class341.aClass341_3.anInt4228 * 422180295 || this.anInt2379 * 960141055 > Class341.aClass341_4.anInt4228 * 422180295) {
				this.anInt2379 = this.method16554((byte) -110) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < Class351.aClass351_1.anInt4244 * 1429919719 || this.anInt2379 * 960141055 > Class351.aClass351_3.anInt4244 * 1429919719) {
			this.anInt2379 = this.method16554((byte) -20) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anv", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anv", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14365(-144320177).method146(1852556201) ? Class341.aClass341_1.anInt4228 * 422180295 : Class351.aClass351_1.anInt4244 * 1429919719;
	}

	@OriginalMember(owner = "client!anv", name = "h", descriptor = "()V")
	public void method16460() {
		if (this.aClass93_Sub36_49.method14365(-111241921).method146(-63537996)) {
			if (this.anInt2379 * 960141055 < Class341.aClass341_3.anInt4228 * 422180295 || this.anInt2379 * 960141055 > Class341.aClass341_4.anInt4228 * 422180295) {
				this.anInt2379 = this.method16554((byte) 43) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < Class351.aClass351_1.anInt4244 * 1429919719 || this.anInt2379 * 960141055 > Class351.aClass351_3.anInt4244 * 1429919719) {
			this.anInt2379 = this.method16554((byte) -125) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anv", name = "b", descriptor = "()V")
	public void method16461() {
		if (this.aClass93_Sub36_49.method14365(-839821555).method146(-823292032)) {
			if (this.anInt2379 * 960141055 < Class341.aClass341_3.anInt4228 * 422180295 || this.anInt2379 * 960141055 > Class341.aClass341_4.anInt4228 * 422180295) {
				this.anInt2379 = this.method16554((byte) 36) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < Class351.aClass351_1.anInt4244 * 1429919719 || this.anInt2379 * 960141055 > Class351.aClass351_3.anInt4244 * 1429919719) {
			this.anInt2379 = this.method16554((byte) -109) * -88839937;
		}
	}
}
