package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public class Class495 implements Interface7 {

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_125;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!py;)V", line = 10)
	Class495(@OriginalArg(0) Class497 arg0) {
		this.aClass497_125 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)I", line = 15)
	@Override
	public int method30020(@OriginalArg(0) int arg0) {
		return this.aClass497_125.method30074(-1875439651) ? 100 : this.aClass497_125.method30077(-1774909861);
	}

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "()I", line = 15)
	@Override
	public int method30026() {
		return this.aClass497_125.method30074(-2027874295) ? 100 : this.aClass497_125.method30077(-1774909861);
	}

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "()I", line = 15)
	@Override
	public int method30023() {
		return this.aClass497_125.method30074(-1978306692) ? 100 : this.aClass497_125.method30077(-1774909861);
	}

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "(B)Lclient!acv;", line = 20)
	@Override
	public Class71 method30021(@OriginalArg(0) byte arg0) {
		return Class71.aClass71_4;
	}

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "()Lclient!acv;", line = 20)
	@Override
	public Class71 method30025() {
		return Class71.aClass71_4;
	}

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "()Lclient!acv;", line = 20)
	@Override
	public Class71 method30024() {
		return Class71.aClass71_4;
	}

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "()Lclient!acv;", line = 20)
	@Override
	public Class71 method30022() {
		return Class71.aClass71_4;
	}

	@OriginalMember(owner = "client!pw", name = "fd", descriptor = "(B)V", line = 2354)
	static void method30027(@OriginalArg(0) byte arg0) {
		@Pc(2) client local2 = Class717.aClient1;
		synchronized (Class717.aClient1) {
			if (Class125_Sub2_Sub1.aFrame1 == null) {
				@Pc(11) Container local11 = Class504.method30196(-283088421);
				if (local11 != null) {
					client.anInt3413 = local11.getSize().width * -1386467717;
					Class504.anInt5201 = local11.getSize().height * -1294184635;
					@Pc(34) Insets local34;
					if (local11 == Class628.aFrame2) {
						local34 = Class628.aFrame2.getInsets();
						client.anInt3413 -= (local34.left + local34.right) * -1386467717;
						Class504.anInt5201 -= (local34.top + local34.bottom) * -1294184635;
					}
					if (client.anInt3413 * -108363597 <= 0) {
						client.anInt3413 = -1386467717;
					}
					if (Class504.anInt5201 * 2090134413 <= 0) {
						Class504.anInt5201 = -1294184635;
					}
					if (Class255.getWindowMode(1309306044) == 1) {
						client.width = client.anInt3511 * 685234053;
						client.anInt3414 = (client.anInt3413 * -108363597 - client.anInt3511 * 2040043391) / 2 * 1405880713;
						client.height = client.anInt3512 * 1344949771;
						client.anInt3415 = 0;
					} else {
						Class503.method30188(163431309);
					}
					if (ModeWhere.aModeWhere_8 != Class280.modeWhere && client.width * -1378711501 < 1024 && client.height * 2091353777 < 768) {
					}
					Class125_Sub3.aCanvas1.setSize(client.width * -1378711501, client.height * 2091353777);
					if (Class694.aClass104_14 != null) {
						Class694.aClass104_14.method20450(Class125_Sub3.aCanvas1, client.width * -1378711501, client.height * 2091353777, -1205668804);
						Class503.method30187(Class694.aClass104_14, Class305.method26797(1721059607));
					}
					if (local11 == Class628.aFrame2) {
						local34 = Class628.aFrame2.getInsets();
						Class125_Sub3.aCanvas1.setLocation(client.anInt3414 * 495533241 + local34.left, local34.top + client.anInt3415 * -1074927711);
					} else {
						Class125_Sub3.aCanvas1.setLocation(client.anInt3414 * 495533241, client.anInt3415 * -1074927711);
					}
					Class183.method24573(2139195022);
					if (client.anInt3526 * -703563959 != -1) {
						Class618.method32103(true, -1743495735);
					}
					Class555.method31054(1022489549);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "wr", descriptor = "(Lclient!yf;I)V", line = 8985)
	static final void method30028(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class274.aClass258_1.method26127(-130336377);
	}

	@OriginalMember(owner = "client!pw", name = "ayv", descriptor = "(Lclient!yf;B)V", line = 13991)
	static final void method30029(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class552.userEmailStatus * 164443283;
	}

	@OriginalMember(owner = "client!pw", name = "bei", descriptor = "(Lclient!yf;I)V", line = 14861)
	static final void method30030(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(19) String local19 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(27) int local27 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (!Class53_Sub1.method14952(local19.charAt(0), (byte) 77)) {
			throw new RuntimeException();
		} else if (local19.isEmpty() || local19.length() > 10) {
			throw new RuntimeException();
		} else if (!Class146.aClass344_3.method27531(local19, local27, local37, 476186666)) {
			throw new RuntimeException();
		}
	}
}
