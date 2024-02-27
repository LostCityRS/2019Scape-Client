package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xz")
public final class Class675 {

	@OriginalMember(owner = "client!xz", name = "e", descriptor = "I")
	static final int anInt6040 = 2000000000;

	@OriginalMember(owner = "client!xz", name = "k", descriptor = "I")
	int anInt6042 = 0;

	@OriginalMember(owner = "client!xz", name = "f", descriptor = "I")
	int anInt6041 = -2010621225;

	@OriginalMember(owner = "client!xz", name = "w", descriptor = "I")
	int anInt6043 = 1180966377;

	@OriginalMember(owner = "client!xz", name = "n", descriptor = "Lclient!wm;")
	final Class640 aClass640_1;

	@OriginalMember(owner = "client!xz", name = "m", descriptor = "Z")
	final boolean aBoolean883;

	@OriginalMember(owner = "client!xz", name = "lx", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method33347(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4029 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * 1588517483;
	}

	@OriginalMember(owner = "client!xz", name = "ot", descriptor = "(Lclient!yf;I)V")
	static void method33348(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class714.method37046(local11, local14, arg0, (byte) 106);
	}

	@OriginalMember(owner = "client!xz", name = "<init>", descriptor = "(Lclient!wm;Z)V")
	public Class675(@OriginalArg(0) Class640 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass640_1 = arg0;
		this.aBoolean883 = arg1;
	}

	@OriginalMember(owner = "client!xz", name = "o", descriptor = "(I)V")
	public void method33315(@OriginalArg(0) int arg0) {
		this.anInt6042 = arg0 * -1771862889;
		if (this.anInt6042 * -1812448473 < 0) {
			this.anInt6042 = 0;
		} else if (this.aBoolean883 && this.anInt6042 * -1812448473 > 2000000000) {
			this.anInt6042 = 753552384;
		} else if (!this.aBoolean883 && this.anInt6042 * -1812448473 > 200000000) {
			this.anInt6042 = -1642631680;
		}
		this.method33323(-1615006608);
	}

	@OriginalMember(owner = "client!xz", name = "f", descriptor = "(Lclient!zu;B)I")
	public int method33316(@OriginalArg(0) Class718 arg0, @OriginalArg(1) byte arg1) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32653(-580352577);
			if (this.anInt6041 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "d", descriptor = "()I")
	public int method33317() {
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "m", descriptor = "(II)V")
	public void method33318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6042 = arg0 * -1771862889;
		if (this.anInt6042 * -1812448473 < 0) {
			this.anInt6042 = 0;
		} else if (this.aBoolean883 && this.anInt6042 * -1812448473 > 2000000000) {
			this.anInt6042 = 753552384;
		} else if (!this.aBoolean883 && this.anInt6042 * -1812448473 > 200000000) {
			this.anInt6042 = -1642631680;
		}
		this.method33323(-2140533208);
	}

	@OriginalMember(owner = "client!xz", name = "k", descriptor = "(I)I")
	public int method33319(@OriginalArg(0) int arg0) {
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "ah", descriptor = "()V")
	void method33320() {
		if (this.aBoolean883) {
			this.anInt6041 = this.aClass640_1.method32649(this.anInt6042 * -1812448473, (byte) 7) * -2010621225;
		} else {
			this.anInt6041 = this.aClass640_1.method32655(this.anInt6042 * -1812448473, (byte) 122) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "n", descriptor = "(Lclient!zu;B)I")
	public int method33321(@OriginalArg(0) Class718 arg0, @OriginalArg(1) byte arg1) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32652(531513888);
			if (!this.aBoolean883) {
				local17 /= 10;
			}
			if (this.anInt6042 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "l", descriptor = "(II)V")
	public void method33322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6043 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "u", descriptor = "(I)V")
	void method33323(@OriginalArg(0) int arg0) {
		if (this.aBoolean883) {
			this.anInt6041 = this.aClass640_1.method32649(this.anInt6042 * -1812448473, (byte) 7) * -2010621225;
		} else {
			this.anInt6041 = this.aClass640_1.method32655(this.anInt6042 * -1812448473, (byte) 118) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "z", descriptor = "()I")
	public int method33324() {
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "p", descriptor = "()I")
	public int method33325() {
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "c", descriptor = "(Lclient!zu;)I")
	public int method33326(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32652(-1325345248);
			if (!this.aBoolean883) {
				local17 /= 10;
			}
			if (this.anInt6042 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "w", descriptor = "(B)I")
	public int method33327(@OriginalArg(0) byte arg0) {
		return this.anInt6043 * 1900186201;
	}

	@OriginalMember(owner = "client!xz", name = "r", descriptor = "(Lclient!zu;)I")
	public int method33328(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32652(-62226593);
			if (!this.aBoolean883) {
				local17 /= 10;
			}
			if (this.anInt6042 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "v", descriptor = "(Lclient!zu;)I")
	public int method33329(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32652(1687860030);
			if (!this.aBoolean883) {
				local17 /= 10;
			}
			if (this.anInt6042 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "ac", descriptor = "()V")
	void method33330() {
		if (this.aBoolean883) {
			this.anInt6041 = this.aClass640_1.method32649(this.anInt6042 * -1812448473, (byte) 7) * -2010621225;
		} else {
			this.anInt6041 = this.aClass640_1.method32655(this.anInt6042 * -1812448473, (byte) 81) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "s", descriptor = "(I)V")
	public void method33331(@OriginalArg(0) int arg0) {
		this.anInt6042 = arg0 * -1771862889;
		if (this.anInt6042 * -1812448473 < 0) {
			this.anInt6042 = 0;
		} else if (this.aBoolean883 && this.anInt6042 * -1812448473 > 2000000000) {
			this.anInt6042 = 753552384;
		} else if (!this.aBoolean883 && this.anInt6042 * -1812448473 > 200000000) {
			this.anInt6042 = -1642631680;
		}
		this.method33323(-1436334829);
	}

	@OriginalMember(owner = "client!xz", name = "y", descriptor = "()I")
	public int method33332() {
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "e", descriptor = "(I)I")
	public int method33333(@OriginalArg(0) int arg0) {
		return this.anInt6042 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "x", descriptor = "()I")
	public int method33334() {
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "a", descriptor = "(Lclient!zu;)I")
	public int method33335(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32653(-1789895001);
			if (this.anInt6041 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "h", descriptor = "()I")
	public int method33336() {
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "q", descriptor = "()I")
	public int method33337() {
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "g", descriptor = "(Lclient!zu;)I")
	public int method33338(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32653(-1446213663);
			if (this.anInt6041 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "i", descriptor = "(Lclient!zu;)I")
	public int method33339(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32651((byte) 0) && this.aClass640_1.method32668(-1884782942)) {
			@Pc(17) int local17 = this.aClass640_1.method32653(-1526243363);
			if (this.anInt6041 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "j", descriptor = "()I")
	public int method33340() {
		return this.anInt6043 * 1900186201;
	}

	@OriginalMember(owner = "client!xz", name = "t", descriptor = "(I)V")
	public void method33341(@OriginalArg(0) int arg0) {
		this.anInt6043 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "ae", descriptor = "(I)V")
	public void method33342(@OriginalArg(0) int arg0) {
		this.anInt6043 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "ag", descriptor = "(I)V")
	public void method33343(@OriginalArg(0) int arg0) {
		this.anInt6043 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "al", descriptor = "()V")
	void method33344() {
		if (this.aBoolean883) {
			this.anInt6041 = this.aClass640_1.method32649(this.anInt6042 * -1812448473, (byte) 7) * -2010621225;
		} else {
			this.anInt6041 = this.aClass640_1.method32655(this.anInt6042 * -1812448473, (byte) 39) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "b", descriptor = "()I")
	public int method33345() {
		return this.anInt6041 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "ai", descriptor = "()V")
	void method33346() {
		if (this.aBoolean883) {
			this.anInt6041 = this.aClass640_1.method32649(this.anInt6042 * -1812448473, (byte) 7) * -2010621225;
		} else {
			this.anInt6041 = this.aClass640_1.method32655(this.anInt6042 * -1812448473, (byte) 16) * -2010621225;
		}
	}
}
