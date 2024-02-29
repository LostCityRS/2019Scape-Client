package jagex3;

import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adk")
public final class Class84 {

	@OriginalMember(owner = "client!adk", name = "e", descriptor = "I")
	public final int anInt258;

	@OriginalMember(owner = "client!adk", name = "n", descriptor = "I")
	public final int anInt256;

	@OriginalMember(owner = "client!adk", name = "m", descriptor = "I")
	public final int anInt257;

	@OriginalMember(owner = "client!adk", name = "eb", descriptor = "(I)V")
	static void method1430(@OriginalArg(0) int arg0) {
		Class112_Sub2_Sub2.aClass158_2.method14299(-1651286399);
		Class82.aClass153_1.method14092(2124971094);
		Class717.aClient1.method24857(-1483631858);
		Class125_Sub3.aCanvas1.setBackground(Color.black);
		client.anInt3522 = 1480566643;
		Class112_Sub2_Sub2.aClass158_2 = Class57.method1077(Class125_Sub3.aCanvas1, -1602779149);
		Class82.aClass153_1 = Class487.method29995(Class125_Sub3.aCanvas1, true, -225620915);
	}

	@OriginalMember(owner = "client!adk", name = "<init>", descriptor = "(III)V")
	Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt258 = arg0 * 299068675;
		this.anInt256 = arg1 * 38318045;
		this.anInt257 = arg2 * 479788341;
	}
}
