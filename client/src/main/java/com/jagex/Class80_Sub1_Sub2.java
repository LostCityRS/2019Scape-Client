package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adn")
public final class Class80_Sub1_Sub2 extends Class80_Sub1 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!adn", name = "g", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!adn", name = "l", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!adn", name = "u", descriptor = "I")
	public int anInt279 = 0;

	@OriginalMember(owner = "client!adn", name = "i", descriptor = "I")
	public int anInt280 = 0;

	@OriginalMember(owner = "client!adn", name = "aho", descriptor = "(Lclient!yp;I)V")
	static void method1686(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3566 * 788343467;
	}

	@OriginalMember(owner = "client!adn", name = "<init>", descriptor = "()V")
	Class80_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!adn", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!adn", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1684(arg0, local3, -1672568046);
		}
	}

	@OriginalMember(owner = "client!adn", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1684(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 2) {
			this.anInt280 = arg0.g2() * 373523545;
		} else if (arg1 == 4) {
			this.anInt279 = arg0.g1() * 1559324799;
			this.anIntArray30 = new int[this.anInt279 * 960911231];
			this.anIntArray29 = new int[this.anInt279 * 960911231];
			for (@Pc(36) int local36 = 0; local36 < this.anInt279 * 960911231; local36++) {
				this.anIntArray30[local36] = arg0.g2();
				this.anIntArray29[local36] = arg0.g2();
			}
		}
	}

	@OriginalMember(owner = "client!adn", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adn", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!adn", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1684(arg0, local3, -1672568046);
		}
	}

	@OriginalMember(owner = "client!adn", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!adn", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adn", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adn", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adn", name = "i", descriptor = "(Lclient!ald;I)V")
	void method1685(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt280 = arg0.g2() * 373523545;
		} else if (arg1 == 4) {
			this.anInt279 = arg0.g1() * 1559324799;
			this.anIntArray30 = new int[this.anInt279 * 960911231];
			this.anIntArray29 = new int[this.anInt279 * 960911231];
			for (@Pc(36) int local36 = 0; local36 < this.anInt279 * 960911231; local36++) {
				this.anIntArray30[local36] = arg0.g2();
				this.anIntArray29[local36] = arg0.g2();
			}
		}
	}
}
