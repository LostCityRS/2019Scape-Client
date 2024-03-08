package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("ats")
public final class class1217 extends class1120 {

	@ObfuscatedName("ats.u")
	public Image field12515;

	public class1217(class848 arg0, Canvas arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		new Rectangle();
		this.method18971();
	}

	@ObfuscatedName("ats.b(I)V")
	public void method18971() {
		super.method18971();
		DataBufferInt var1 = new DataBufferInt(this.field11928, this.field11928.length);
		DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field11925, this.field11927), var1, null);
		this.field12515 = new BufferedImage(var2, var3, false, new Hashtable());
	}

	@ObfuscatedName("ats.a()I")
	public int method15451() {
		return this.method15450(0, 0);
	}

	@ObfuscatedName("ats.g(II)I")
	public final int method15450(int arg0, int arg1) {
		Graphics var3 = this.field11926.getGraphics();
		if (var3 == null) {
			return 0;
		} else {
			var3.drawImage(this.field12515, arg0, arg1, this.field11926);
			return 0;
		}
	}

	@ObfuscatedName("ats.m()V")
	public void method1629() {
	}
}
