package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!ahi")
public final class Class126_Sub1 extends Class126 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ahi", name = "this$0", descriptor = "Lclient!jy;")
	final Class370 aClass370_2;

	@OriginalMember(owner = "client!ahi", name = "e", descriptor = "Z")
	boolean aBoolean216;

	@OriginalMember(owner = "client!ahi", name = "u", descriptor = "Ljava/awt/Font;")
	Font aFont1;

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "Ljava/awt/FontMetrics;")
	FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "Ljava/awt/Color;")
	Color aColor1;

	@OriginalMember(owner = "client!ahi", name = "<init>", descriptor = "(Lclient!jy;ZLjava/lang/String;IIII)V")
	Class126_Sub1(@OriginalArg(0) Class370 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg5, arg6);
		this.aClass370_2 = arg0;
		this.aBoolean216 = arg1;
		this.aFont1 = new Font(arg2, 0, arg3);
		this.aFontMetrics1 = Class454.canvas.getFontMetrics(this.aFont1);
		this.aColor1 = new Color(arg4);
	}

	@OriginalMember(owner = "client!ahi", name = "t", descriptor = "(Ljava/awt/Graphics;I)V")
	@Override
	void method20378(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1) {
		@Pc(6) String local6;
		if (this.aBoolean216) {
			local6 = this.aClass370_2.aString201;
		} else {
			local6 = this.aClass370_2.aString200 + " " + this.aClass370_2.aString201;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.aClass370_2.method28362(this.aFontMetrics1.stringWidth(local6), -267460248) + this.anInt2867 * 1743086491, this.aClass370_2.method28363(0, -1670441319) + this.anInt2866 * -1368453455);
	}

	@OriginalMember(owner = "client!ahi", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20379(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean216) {
			local6 = this.aClass370_2.aString201;
		} else {
			local6 = this.aClass370_2.aString200 + " " + this.aClass370_2.aString201;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.aClass370_2.method28362(this.aFontMetrics1.stringWidth(local6), -195952856) + this.anInt2867 * 1743086491, this.aClass370_2.method28363(0, 1332421030) + this.anInt2866 * -1368453455);
	}

	@OriginalMember(owner = "client!ahi", name = "e", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20380(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean216) {
			local6 = this.aClass370_2.aString201;
		} else {
			local6 = this.aClass370_2.aString200 + " " + this.aClass370_2.aString201;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.aClass370_2.method28362(this.aFontMetrics1.stringWidth(local6), -1000161085) + this.anInt2867 * 1743086491, this.aClass370_2.method28363(0, -220212765) + this.anInt2866 * -1368453455);
	}

	@OriginalMember(owner = "client!ahi", name = "u", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20377(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean216) {
			local6 = this.aClass370_2.aString201;
		} else {
			local6 = this.aClass370_2.aString200 + " " + this.aClass370_2.aString201;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.aClass370_2.method28362(this.aFontMetrics1.stringWidth(local6), -1388596294) + this.anInt2867 * 1743086491, this.aClass370_2.method28363(0, 843031712) + this.anInt2866 * -1368453455);
	}
}
