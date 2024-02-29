package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!any")
public final class Class166_Sub46 extends Class166 {

	@OriginalMember(owner = "client!any", name = "w", descriptor = "I")
	public static final int anInt2375 = 1;

	@OriginalMember(owner = "client!any", name = "l", descriptor = "I")
	public static final int anInt2376 = 0;

	@OriginalMember(owner = "client!any", name = "ct", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method16550(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -1915563430;
		arg0.anInt4030 = arg2.anIntArray521[arg2.anInt6052 * -1497248091] * -1623526217;
		if (arg0.anInt4030 * 1868441863 > arg0.anInt4032 * 1312295363 - arg0.anInt4022 * 1215292027) {
			arg0.anInt4030 = arg0.anInt4032 * -1500850587 - arg0.anInt4022 * 548807149;
		}
		if (arg0.anInt4030 * 1868441863 < 0) {
			arg0.anInt4030 = 0;
		}
		arg0.anInt4031 = arg2.anIntArray521[-1497248091 * arg2.anInt6052 + 1] * -259266053;
		if (arg0.anInt4031 * -1543587533 > arg0.anInt4084 * -1927602083 - arg0.anInt4023 * -1490598249) {
			arg0.anInt4031 = arg0.anInt4084 * -863215569 - arg0.anInt4023 * -2034326259;
		}
		if (arg0.anInt4031 * -1543587533 < 0) {
			arg0.anInt4031 = 0;
		}
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class202.method24659(arg0.anInt3994 * -1549590237, -1156074702);
		}
	}

	@OriginalMember(owner = "client!any", name = "arn", descriptor = "(Lclient!yf;I)V")
	static void method16551(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 80);
		Class106_Sub1.method5148(-414677210);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!any", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!any", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub46(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!any", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!any", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "a", descriptor = "()Z")
	public boolean method16539() {
		return this.aClass93_Sub36_49.method14359((byte) 99) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!any", name = "s", descriptor = "(I)Z")
	public boolean method16540(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14359((byte) 17) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!any", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass93_Sub36_49.method14359((byte) 45) != Class702.aClass702_6) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass93_Sub36_49.aClass166_Sub2_1.method15388(-1151191925) == 1) {
				return 2;
			}
			if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-1797204658) == 1) {
				return 2;
			}
			if (this.aClass93_Sub36_49.aClass166_Sub20_1.method15787(-1752319762) > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "y", descriptor = "(I)I")
	public int method16541(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!any", name = "b", descriptor = "()V")
	public void method16542() {
		if (this.aClass93_Sub36_49.method14359((byte) 73) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!any", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!any", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "o", descriptor = "(I)V")
	public void method16543(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 120) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -114) * -88839937;
		}
	}

	@OriginalMember(owner = "client!any", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!any", name = "x", descriptor = "()V")
	public void method16544() {
		if (this.aClass93_Sub36_49.method14359((byte) 46) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) 18) * -88839937;
		}
	}

	@OriginalMember(owner = "client!any", name = "q", descriptor = "()V")
	public void method16545() {
		if (this.aClass93_Sub36_49.method14359((byte) 99) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) 3) * -88839937;
		}
	}

	@OriginalMember(owner = "client!any", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 117) != Class702.aClass702_6) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass93_Sub36_49.aClass166_Sub2_1.method15388(-1053493701) == 1) {
				return 2;
			}
			if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(1340023741) == 1) {
				return 2;
			}
			if (this.aClass93_Sub36_49.aClass166_Sub20_1.method15787(-1789477249) > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "h", descriptor = "()V")
	public void method16546() {
		if (this.aClass93_Sub36_49.method14359((byte) 23) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -96) * -88839937;
		}
	}

	@OriginalMember(owner = "client!any", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 120) != Class702.aClass702_6) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass93_Sub36_49.aClass166_Sub2_1.method15388(-1696652397) == 1) {
				return 2;
			}
			if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(409393819) == 1) {
				return 2;
			}
			if (this.aClass93_Sub36_49.aClass166_Sub20_1.method15787(-1959438390) > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!any", name = "g", descriptor = "()Z")
	public boolean method16547() {
		return this.aClass93_Sub36_49.method14359((byte) 95) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!any", name = "i", descriptor = "()Z")
	public boolean method16548() {
		return this.aClass93_Sub36_49.method14359((byte) 79) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!any", name = "j", descriptor = "()I")
	public int method16549() {
		return this.anInt2379 * 960141055;
	}
}
