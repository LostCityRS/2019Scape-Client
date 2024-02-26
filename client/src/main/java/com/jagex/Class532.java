package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
final class Class532 implements Interface41 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!rk", name = "this$0", descriptor = "Lclient!ry;")
	final Class541 aClass541_2;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "(Lclient!di;I)V")
	static void method30822(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (Class380.method28557((byte) 54) && Class155.method15057(1327990308)) {
			Class550.method31318(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, -1529312893);
		}
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, Class149.anInt1527 * 1338436645 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (Class149.anInt1528 * -1660817591);
		@Pc(55) int local55;
		if (Class149.anInt1522 * -2043909027 > 0) {
			local55 = 346 - Class149.anInt1528 * -1660817591 - 4;
			@Pc(67) int local67 = local43 * local55 / (local43 + Class149.anInt1522 * -2043909027 - 1);
			@Pc(69) int local69 = 4;
			if (Class149.anInt1522 * -2043909027 > 1) {
				local69 += (Class149.anInt1522 * -2043909027 - 1 - Class149.anInt1524 * -868725591) * (local55 - local67) / (Class149.anInt1522 * -2043909027 - 1);
			}
			arg0.method20722(Class80_Sub1_Sub1.anInt254 * -255202897 - 16, local69, 12, local67, Class149.anInt1527 * 1338436645 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = Class149.anInt1524 * -868725591; local118 < Class149.anInt1524 * -868725591 + local43 && local118 < Class149.anInt1522 * -2043909027; local118++) {
				@Pc(137) String[] local137 = Class313.method27482(Class149.aStringArray16[local118], '\b', 2036747717);
				@Pc(148) int local148 = (Class80_Sub1_Sub1.anInt254 * -255202897 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20986(local160, 0, local148 + local160 - 8, 350);
					Class709.aClass104_26.method7655(Class343.method27946(local137[local150], (byte) 76), local160, 350 - Class149.anInt1521 * 353598737 - 2 - Class689.aClass15_13.anInt46 * -191270971 - Class149.anInt1528 * -1660817591 * (local118 - Class149.anInt1524 * -868725591), -1, -16777216, -1714499272);
				}
			}
		}
		Class108.aClass104_22.method7629("910 1", Class80_Sub1_Sub1.anInt254 * -255202897 - 25, 330, -1, -16777216, 1884396762);
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20893(0, 350 - Class149.anInt1521 * 353598737, Class80_Sub1_Sub1.anInt254 * -255202897, -1, -1859623006);
		Class8.aClass104_1.method7655("--> " + Class343.method27946(Class149.aString48, (byte) 36), 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 1, -1, -16777216, -1268477993);
		if (Class597.aBoolean926) {
			local55 = -1;
			if (client.anInt3436 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20719(Class375.aClass15_9.method373("--> " + Class343.method27946(Class149.aString48, (byte) 109).substring(0, Class149.anInt1523 * -187541765), -1743680922) + 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 11, 12, local55, (byte) -84);
		}
		arg0.method20877();
		Class333.method27800((short) -23564);
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ry;)V")
	Class532(@OriginalArg(0) Class541 arg0) {
		this.aClass541_2 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "(B)V")
	@Override
	public void method30821(@OriginalArg(0) byte arg0) {
		this.aClass541_2.method31115(true, -1828780399);
	}

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "()V")
	@Override
	public void method30820() {
		this.aClass541_2.method31115(true, -1828780399);
	}
}
