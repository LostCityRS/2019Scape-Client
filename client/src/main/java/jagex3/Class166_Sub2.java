package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amb")
public final class Class166_Sub2 extends Class166 {

	@OriginalMember(owner = "client!amb", name = "w", descriptor = "I")
	public static final int anInt2081 = 1;

	@OriginalMember(owner = "client!amb", name = "l", descriptor = "I")
	public static final int anInt2082 = 0;

	@OriginalMember(owner = "client!amb", name = "qo", descriptor = "(Lclient!yf;B)V")
	static void method15397(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class132_Sub1_Sub3_Sub2.method12585(local11, local14, arg0, (byte) -4);
	}

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub2(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amb", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 24) == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(961864208) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!amb", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "o", descriptor = "(I)V")
	public void method15384(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(-7152280) != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 67) == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -48) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "s", descriptor = "(B)Z")
	public boolean method15385(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amb", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amb", name = "h", descriptor = "()Z")
	public boolean method15386() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amb", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 40) == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(-394611339) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!amb", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 29) == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(1818972977) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!amb", name = "t", descriptor = "()I")
	public int method15387() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "y", descriptor = "(I)I")
	public int method15388(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "q", descriptor = "()V")
	public void method15389() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(250347349) != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 27) == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -106) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "x", descriptor = "()V")
	public void method15390() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(-1433222603) != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 86) == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -126) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "b", descriptor = "()V")
	public void method15391() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(1038039268) != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15920((byte) 34) == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -98) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "a", descriptor = "()Z")
	public boolean method15392() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "g", descriptor = "()Z")
	public boolean method15393() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "i", descriptor = "()I")
	public int method15394() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "j", descriptor = "()I")
	public int method15395() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "ae", descriptor = "()I")
	public int method15396() {
		return this.anInt2379 * 960141055;
	}
}
