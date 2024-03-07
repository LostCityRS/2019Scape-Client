package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqn")
public class Class110_Sub15_Sub2 extends Class110_Sub15 {

	@OriginalMember(owner = "client!aqn", name = "p", descriptor = "Lclient!np;")
	static Interface47 anInterface47_1;

	@OriginalMember(owner = "client!aqn", name = "f", descriptor = "I")
	final int anInt2825;

	@OriginalMember(owner = "client!aqn", name = "w", descriptor = "I")
	final int anInt2824;

	@OriginalMember(owner = "client!aqn", name = "l", descriptor = "I")
	final int anInt2826;

	@OriginalMember(owner = "client!aqn", name = "<init>", descriptor = "(Lclient!alw;)V", line = 14)
	Class110_Sub15_Sub2(@OriginalArg(0) Packet arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.g4(-118643075);
		this.anInt2825 = (local6 >>> 16) * 1778595823;
		this.anInt2824 = (local6 & 0xFFFF) * 159157325;
		this.anInt2826 = arg0.g1((short) 16384) * 256284111;
	}

	@OriginalMember(owner = "client!aqn", name = "f", descriptor = "()V", line = 22)
	@Override
	public void method20150() {
		@Pc(6) int local6 = this.anInt2825 * 363732480 + 256;
		@Pc(13) int local13 = this.anInt2824 * -1424422400 + 256;
		@Pc(18) int local18 = this.anInt2826 * 1713131823;
		if (local18 < 3 && client.aClass532_1.method30487(-197179419).method30330(this.anInt2825 * 25876239, this.anInt2824 * -531264379, -662808309)) {
			local18++;
		}
		@Pc(90) Class132_Sub1_Sub1_Sub5 local90 = new Class132_Sub1_Sub1_Sub5(client.aClass532_1.method30481(-1540802915), this.anInt2821 * 1307909245, 0, this.anInt2826 * 1713131823, local18, local6, Class305.method26802(local6, local13, this.anInt2826 * 1713131823, (byte) -36) - this.anInt2823 * -1630065793, local13, this.anInt2825 * 25876239, this.anInt2825 * 25876239, this.anInt2824 * -531264379, this.anInt2824 * -531264379, this.anInt2822 * 187367639, false, 0);
		client.aClass16_21.method220(new Class93_Sub1_Sub9(local90), (long) (this.anInt2825 * 25876239 << 16 | this.anInt2824 * -531264379));
	}

	@OriginalMember(owner = "client!aqn", name = "n", descriptor = "(I)V", line = 22)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt2825 * 363732480 + 256;
		@Pc(13) int local13 = this.anInt2824 * -1424422400 + 256;
		@Pc(18) int local18 = this.anInt2826 * 1713131823;
		if (local18 < 3 && client.aClass532_1.method30487(-1236241695).method30330(this.anInt2825 * 25876239, this.anInt2824 * -531264379, -662808309)) {
			local18++;
		}
		@Pc(90) Class132_Sub1_Sub1_Sub5 local90 = new Class132_Sub1_Sub1_Sub5(client.aClass532_1.method30481(-1694543326), this.anInt2821 * 1307909245, 0, this.anInt2826 * 1713131823, local18, local6, Class305.method26802(local6, local13, this.anInt2826 * 1713131823, (byte) -86) - this.anInt2823 * -1630065793, local13, this.anInt2825 * 25876239, this.anInt2825 * 25876239, this.anInt2824 * -531264379, this.anInt2824 * -531264379, this.anInt2822 * 187367639, false, 0);
		client.aClass16_21.method220(new Class93_Sub1_Sub9(local90), (long) (this.anInt2825 * 25876239 << 16 | this.anInt2824 * -531264379));
	}
}
