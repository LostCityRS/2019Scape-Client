package com.jagex.game.client;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.GZip;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.load.*;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

@ObfuscatedName("jr")
public class MainLoadingScreen implements LoadingScreen {

	@ObfuscatedName("jr.e")
	public static final byte[] field2927 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@ObfuscatedName("jr.n")
	public static SoftLruHashTable field2930 = new SoftLruHashTable(128, 4);

	@ObfuscatedName("jr.m")
	public final LoadingScreenType field2928;

	@ObfuscatedName("jr.k")
	public final LoadingScreenElement[] field2934;

	@ObfuscatedName("jr.f")
	public final int field2931;

	@ObfuscatedName("jr.w")
	public final int field2932;

	@ObfuscatedName("jr.l")
	public Toolkit field2933;

	@ObfuscatedName("jr.u")
	public boolean field2929;

	@ObfuscatedName("z.e(B)V")
	public static void method271() {
		field2930.reset();
	}

	public MainLoadingScreen(LoadingScreenType arg0, int arg1, int arg2, LoadingScreenElementFactory arg3) {
		this.field2928 = arg0;
		this.field2931 = arg1;
		this.field2932 = arg2;
		this.field2934 = new LoadingScreenElement[this.field2928.field9212.length];
		for (int var5 = 0; var5 < this.field2934.length; var5++) {
			this.field2934[var5] = arg3.method5137(this.field2928.field9212[var5]);
		}
	}

	@ObfuscatedName("jr.l(S)V")
	public void method4916() {
		if (Client.toolkit != this.field2933) {
			this.field2933 = Client.toolkit;
			this.field2929 = true;
		}
		this.field2933.method2475(3, 0);
		LoadingScreenElement[] var1 = this.field2934;
		for (int var2 = 0; var2 < var1.length; var2++) {
			LoadingScreenElement var3 = var1[var2];
			if (var3 != null) {
				var3.method5104();
			}
		}
	}

	@ObfuscatedName("jr.m(ZI)V")
	public void method4888(boolean arg0) {
		boolean var2 = true;
		LoadingScreenElement[] var3 = this.field2934;
		for (int var4 = 0; var4 < var3.length; var4++) {
			LoadingScreenElement var5 = var3[var4];
			if (var5 != null) {
				var5.method5105(var2 || this.field2929);
			}
		}
		this.field2929 = false;
	}

	@ObfuscatedName("jr.u(I)I")
	public int method4912() {
		int var1 = 0;
		LoadingScreenElement[] var2 = this.field2934;
		for (int var3 = 0; var3 < var2.length; var3++) {
			LoadingScreenElement var4 = var2[var3];
			if (var4 == null || var4.method5106()) {
				var1++;
			}
		}
		return var1 * 100 / this.field2934.length;
	}

	@ObfuscatedName("jr.w(B)V")
	public void method4891() {
	}

	@ObfuscatedName("jr.z(J)Z")
	public boolean method4894(long arg0) {
		return MonotonicTime.get() >= (long) this.field2931 + arg0;
	}

	@ObfuscatedName("cz.n(Lpy;IB)Lcm;")
	public static Sprite method1589(Js5 arg0, int arg1) {
		Sprite var2 = (Sprite) field2930.get((long) arg1);
		if (var2 == null) {
			if (Loading.field2941) {
				var2 = Client.toolkit.createSprite(SpriteDataProvider.get(arg0, arg1), true);
			} else {
				var2 = method3594(arg0.fetchFile(arg1));
			}
			field2930.put(var2, (long) arg1);
		}
		return var2;
	}

	@ObfuscatedName("hp.k(B)Z")
	public static boolean method4062() {
		try {
			GZip var0 = new GZip();
			byte[] var1 = var0.method15246(field2927);
			method3594(var1);
			return true;
		} catch (Exception var3) {
			return false;
		}
	}

	@ObfuscatedName("gh.f([BI)Lcm;")
	public static Sprite method3594(byte[] src) {
		if (src == null) {
			throw new RuntimeException("");
		}

		try {
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(src));
			int width = img.getWidth();
			int height = img.getHeight();
			int[] pixels = new int[width * height];
			img.getRGB(0, 0, width, height, pixels, 0, width);
			return Client.toolkit.createSprite(pixels, 0, width, width, height);
		} catch (Exception ex) {
			return null;
		}
	}

	@ObfuscatedName("jr.p(B)I")
	public int method4895() {
		return this.field2932;
	}
}
