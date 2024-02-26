package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@OriginalClass("client!ato")
public final class Class108_Sub2_Sub3_Sub1 extends Class108_Sub2_Sub3 {

	@OriginalMember(owner = "client!ato", name = "m", descriptor = "Ljava/awt/Image;")
	Image anImage3;

	@OriginalMember(owner = "client!ato", name = "<init>", descriptor = "(Lclient!aff;Ljava/awt/Canvas;II)V")
	Class108_Sub2_Sub3_Sub1(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg1, arg2, arg3);
		new Rectangle();
		this.method23872(1866689401);
	}

	@OriginalMember(owner = "client!ato", name = "n", descriptor = "(II)I")
	@Override
	public int method24054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!ato", name = "r", descriptor = "(I)V")
	@Override
	void method23872(@OriginalArg(0) int arg0) {
		super.method23872(1866689401);
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray287, this.anIntArray287.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3237 * -226538045, this.anInt3238 * -1201225285), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ato", name = "q", descriptor = "()I")
	@Override
	public int method24053() {
		return this.method24059(0, 0);
	}

	@OriginalMember(owner = "client!ato", name = "h", descriptor = "(II)I")
	@Override
	public int method24059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!ato", name = "p", descriptor = "()I")
	@Override
	public int method24056() {
		return this.method24059(0, 0);
	}

	@OriginalMember(owner = "client!ato", name = "ax", descriptor = "()V")
	@Override
	void method23875() {
		super.method23872(1866689401);
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray287, this.anIntArray287.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3237 * -226538045, this.anInt3238 * -1201225285), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ato", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
	}

	@OriginalMember(owner = "client!ato", name = "y", descriptor = "(II)I")
	@Override
	public int method24058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!ato", name = "v", descriptor = "()I")
	@Override
	public int method24057() {
		return this.method24059(0, 0);
	}

	@OriginalMember(owner = "client!ato", name = "ay", descriptor = "()V")
	@Override
	void method23876() {
		super.method23872(1866689401);
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray287, this.anIntArray287.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3237 * -226538045, this.anInt3238 * -1201225285), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ato", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
	}
}
