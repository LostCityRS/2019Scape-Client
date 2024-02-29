package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amn")
public final class Class166_Sub14 extends Class166 {

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "I")
	public static final int anInt2154 = 0;

	@OriginalMember(owner = "client!amn", name = "w", descriptor = "I")
	static final int anInt2155 = 2;

	@OriginalMember(owner = "client!amn", name = "l", descriptor = "I")
	public static final int anInt2156 = 1;

	@OriginalMember(owner = "client!amn", name = "ap", descriptor = "(Lclient!arm;I)I")
	public static int method15669(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (Class454.aBoolean782) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			@Pc(13) int local13 = arg0.anInt3012 * -92627949;
			if (Class702.method36901(local13, (byte) -106)) {
				return 1;
			} else if (Class664.method33064(local13, 1527912881)) {
				return 2;
			} else if (Class118.method8413(local13, (byte) 111)) {
				return 3;
			} else if (Class110_Sub6.method7672(local13, (byte) -1)) {
				return 4;
			} else if (Class434.method28982(local13, 2002411286)) {
				return 7;
			} else if (local13 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub14(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amn", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "o", descriptor = "(B)V")
	public void method15663(@OriginalArg(0) byte arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 86) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.aClass93_Sub36_49.method14365(102373484).method146(1460961200)) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
				this.anInt2379 = this.method16554((byte) -38) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -71) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amn", name = "b", descriptor = "()Z")
	public boolean method15664() {
		return this.aClass93_Sub36_49.method14359((byte) 101) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amn", name = "s", descriptor = "(B)Z")
	public boolean method15665(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14359((byte) 55) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amn", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amn", name = "y", descriptor = "(I)I")
	public int method15666(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amn", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass93_Sub36_49.method14359((byte) 77) == Class702.aClass702_6) {
			return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(-474829767) == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amn", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 43) == Class702.aClass702_6) {
			return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(-1053561098) == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amn", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amn", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amn", name = "q", descriptor = "()V")
	public void method15667() {
		if (this.aClass93_Sub36_49.method14359((byte) 36) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.aClass93_Sub36_49.method14365(-2000870640).method146(961805517)) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
				this.anInt2379 = this.method16554((byte) -59) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -89) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amn", name = "x", descriptor = "()V")
	public void method15668() {
		if (this.aClass93_Sub36_49.method14359((byte) 12) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.aClass93_Sub36_49.method14365(1899037249).method146(-1743622065)) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
				this.anInt2379 = this.method16554((byte) -9) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) 49) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amn", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 121) == Class702.aClass702_6) {
			return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(359449275) == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}
}
