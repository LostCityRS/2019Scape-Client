package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!aht")
public class Class126_Sub2 extends Class126 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aht", name = "this$0", descriptor = "Lclient!jy;")
	final Class370 aClass370_3;

	@OriginalMember(owner = "client!aht", name = "e", descriptor = "Ljava/awt/Image;")
	Image anImage2;

	@OriginalMember(owner = "client!aht", name = "ayn", descriptor = "(Lclient!yp;I)V")
	static void method20385(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.aBoolean705) {
			Class442.aClass442_7.method29194(1170416731);
		}
	}

	@OriginalMember(owner = "client!aht", name = "<init>", descriptor = "(Lclient!jy;Ljava/awt/Image;II)V")
	Class126_Sub2(@OriginalArg(0) Class370 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass370_3 = arg0;
		this.anImage2 = arg1;
	}

	@OriginalMember(owner = "client!aht", name = "u", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20377(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass370_3.method28362(this.anImage2.getWidth(null), 263656921) + this.anInt2867 * 1743086491;
		@Pc(27) int local27 = this.aClass370_3.method28363(this.anImage2.getHeight(null), 1527080047) + this.anInt2866 * -1368453455;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!aht", name = "t", descriptor = "(Ljava/awt/Graphics;I)V")
	@Override
	void method20378(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.aClass370_3.method28362(this.anImage2.getWidth(null), -106330137) + this.anInt2867 * 1743086491;
		@Pc(27) int local27 = this.aClass370_3.method28363(this.anImage2.getHeight(null), 1228787747) + this.anInt2866 * -1368453455;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!aht", name = "e", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20380(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass370_3.method28362(this.anImage2.getWidth(null), -1008605377) + this.anInt2867 * 1743086491;
		@Pc(27) int local27 = this.aClass370_3.method28363(this.anImage2.getHeight(null), -292241145) + this.anInt2866 * -1368453455;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!aht", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20379(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass370_3.method28362(this.anImage2.getWidth(null), -1538064921) + this.anInt2867 * 1743086491;
		@Pc(27) int local27 = this.aClass370_3.method28363(this.anImage2.getHeight(null), 1960911074) + this.anInt2866 * -1368453455;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}
}
