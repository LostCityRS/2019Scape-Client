package jagex3;

import java.awt.Container;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class288 implements Interface26 {

	@OriginalMember(owner = "client!gh", name = "as", descriptor = "[I")
	static int[] anIntArray372;

	@OriginalMember(owner = "client!gh", name = "bo", descriptor = "Lclient!wf;")
	public static Class636 aClass636_1;

	@OriginalMember(owner = "client!gh", name = "hn", descriptor = "Lclient!apw;")
	public static Class55_Sub2 aClass55_Sub2_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gh", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_6;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	final int anInt3944;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	final int anInt3943;

	@OriginalMember(owner = "client!gh", name = "bem", descriptor = "(Lclient!yf;I)V")
	static void method26640(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(Lclient!alc;Lclient!alc;IZIZI)I")
	static int method26641(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(6) int local6 = Class243.method25983(arg0, arg1, arg2, arg3, (byte) -18);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class243.method25983(arg0, arg1, arg4, arg5, (byte) -38);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!gh", name = "at", descriptor = "(Lclient!yf;I)V")
	static void method26642(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		if (arg0.anIntArray521[arg0.anInt6052 * -1497248091] >= arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "([BI)Lclient!cm;")
	static Class100 method26643(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(14) Container local14 = BaseVarTypeString.method30377(-283088421);
				@Pc(19) MediaTracker local19 = new MediaTracker(local14);
				local19.addImage(local11, 0);
				local19.waitForAll();
				@Pc(29) int local29 = local11.getWidth(local14);
				@Pc(33) int local33 = local11.getHeight(local14);
				if (!local19.isErrorAny() && local29 >= 0 && local33 >= 0) {
					@Pc(50) int[] local50 = new int[local33 * local29];
					@Pc(62) PixelGrabber local62 = new PixelGrabber(local11, 0, 0, local29, local33, local50, 0, local29);
					local62.grabPixels();
					return Class694.aClass104_14.method20510(local50, 0, local29, local29, local33, 438797212);
				}
				throw new RuntimeException("");
			} catch (@Pc(75) InterruptedException local75) {
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class288(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_6 = arg0;
		this.anInt3944 = arg1.method22427(-1434290800) * 1131038967;
		this.anInt3943 = arg1.method22427(-1434290800) * 877711957;
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26723(this.anInt3944 * 559872199, this.anInt3943 * -1707762947, -554393298);
		arg0.method26715(this.anInt3944 * 559872199, -1893240721).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26723(this.anInt3944 * 559872199, this.anInt3943 * -1707762947, -1783370834);
		arg0.method26715(this.anInt3944 * 559872199, -1267069017).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26723(this.anInt3944 * 559872199, this.anInt3943 * -1707762947, -373864220);
		arg0.method26715(this.anInt3944 * 559872199, 902008669).method26849(-1942433304);
	}
}
