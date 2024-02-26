package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class477 implements Interface6 {

	@OriginalMember(owner = "client!pc", name = "tt", descriptor = "Lclient!akv;")
	public static Class80_Sub32 aClass80_Sub32_3;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_119;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	final int anInt4962;

	@OriginalMember(owner = "client!pc", name = "yh", descriptor = "(Lclient!yp;I)V")
	static void method29906(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3536 * -982910995 >= 5 && client.anInt3536 * -982910995 <= 9) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pf;I)V")
	Class477(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		this.aClass480_119 = arg0;
		this.anInt4962 = arg1 * 1064059745;
	}

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30351() {
		return Class67.aClass67_1;
	}

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "(B)I")
	@Override
	public int method30349(@OriginalArg(0) byte arg0) {
		return this.aClass480_119.method29975(this.anInt4962 * 1391304865, -1403081456) ? 100 : this.aClass480_119.method29924(this.anInt4962 * 1391304865, (byte) 39);
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)Lclient!acr;")
	@Override
	public Class67 method30347(@OriginalArg(0) int arg0) {
		return Class67.aClass67_1;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()I")
	@Override
	public int method30348() {
		return this.aClass480_119.method29975(this.anInt4962 * 1391304865, -1403081456) ? 100 : this.aClass480_119.method29924(this.anInt4962 * 1391304865, (byte) 97);
	}

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "()I")
	@Override
	public int method30350() {
		return this.aClass480_119.method29975(this.anInt4962 * 1391304865, -1403081456) ? 100 : this.aClass480_119.method29924(this.anInt4962 * 1391304865, (byte) 126);
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()I")
	@Override
	public int method30353() {
		return this.aClass480_119.method29975(this.anInt4962 * 1391304865, -1403081456) ? 100 : this.aClass480_119.method29924(this.anInt4962 * 1391304865, (byte) 98);
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "()I")
	@Override
	public int method30352() {
		return this.aClass480_119.method29975(this.anInt4962 * 1391304865, -1403081456) ? 100 : this.aClass480_119.method29924(this.anInt4962 * 1391304865, (byte) 1);
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30346() {
		return Class67.aClass67_1;
	}
}
