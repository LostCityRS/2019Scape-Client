package com.jagex;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqo")
public final class Class126_Sub2_Sub1 extends Class126_Sub2 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqo", name = "this$0", descriptor = "Lclient!jy;")
	final Class370 aClass370_4;

	@OriginalMember(owner = "client!aqo", name = "u", descriptor = "F")
	float aFloat191;

	@OriginalMember(owner = "client!aqo", name = "l", descriptor = "F")
	float aFloat190;

	@OriginalMember(owner = "client!aqo", name = "<init>", descriptor = "(Lclient!jy;Ljava/awt/Image;IIF)V")
	Class126_Sub2_Sub1(@OriginalArg(0) Class370 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		super(arg0, arg1, arg2, arg3);
		this.aClass370_4 = arg0;
		this.aFloat191 = arg4;
		this.aFloat190 = -this.aFloat191;
	}

	@OriginalMember(owner = "client!aqo", name = "u", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20377(@OriginalArg(0) Graphics arg0) {
		this.aFloat190 += this.aFloat191;
		if (this.aFloat190 < 0.0F) {
			this.aFloat190 += 360.0F;
		}
		this.aFloat190 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat190);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass370_4.method28362(local33, 271775637) + local33 / 2 + this.anInt2867 * 1743086491), (double) (this.aClass370_4.method28363(local38, 526811681) + local38 / 2 + this.anInt2866 * -1368453455));
		local41.translate(this.aClass370_4.method28362(local33, 47657964) + this.anInt2867 * 1743086491, this.aClass370_4.method28363(local38, 1440452379) + this.anInt2866 * -1368453455);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.aClass370_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqo", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20379(@OriginalArg(0) Graphics arg0) {
		this.aFloat190 += this.aFloat191;
		if (this.aFloat190 < 0.0F) {
			this.aFloat190 += 360.0F;
		}
		this.aFloat190 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat190);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass370_4.method28362(local33, -1877755607) + local33 / 2 + this.anInt2867 * 1743086491), (double) (this.aClass370_4.method28363(local38, -150460371) + local38 / 2 + this.anInt2866 * -1368453455));
		local41.translate(this.aClass370_4.method28362(local33, -2022034232) + this.anInt2867 * 1743086491, this.aClass370_4.method28363(local38, 249950355) + this.anInt2866 * -1368453455);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.aClass370_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqo", name = "e", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method20380(@OriginalArg(0) Graphics arg0) {
		this.aFloat190 += this.aFloat191;
		if (this.aFloat190 < 0.0F) {
			this.aFloat190 += 360.0F;
		}
		this.aFloat190 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat190);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass370_4.method28362(local33, 235781240) + local33 / 2 + this.anInt2867 * 1743086491), (double) (this.aClass370_4.method28363(local38, -1590480389) + local38 / 2 + this.anInt2866 * -1368453455));
		local41.translate(this.aClass370_4.method28362(local33, 297638507) + this.anInt2867 * 1743086491, this.aClass370_4.method28363(local38, 1608263495) + this.anInt2866 * -1368453455);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.aClass370_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqo", name = "t", descriptor = "(Ljava/awt/Graphics;I)V")
	@Override
	void method20378(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1) {
		this.aFloat190 += this.aFloat191;
		if (this.aFloat190 < 0.0F) {
			this.aFloat190 += 360.0F;
		}
		this.aFloat190 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat190);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass370_4.method28362(local33, -837985683) + local33 / 2 + this.anInt2867 * 1743086491), (double) (this.aClass370_4.method28363(local38, -281006023) + local38 / 2 + this.anInt2866 * -1368453455));
		local41.translate(this.aClass370_4.method28362(local33, -1528896049) + this.anInt2867 * 1743086491, this.aClass370_4.method28363(local38, 1335581195) + this.anInt2866 * -1368453455);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.aClass370_4.anAffineTransform1);
	}
}
