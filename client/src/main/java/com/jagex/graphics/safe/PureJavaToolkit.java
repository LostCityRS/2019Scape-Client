package com.jagex.graphics.safe;

import com.jagex.core.datastruct.Heap;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.utils.ColourUtils;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.client.DataType;
import com.jagex.game.client.JavaGraphicsRelated3;
import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.*;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("afg")
public class PureJavaToolkit extends Toolkit {

	@ObfuscatedName("afg.at")
	public boolean field9794;

	@ObfuscatedName("afg.ad")
	public int field9776;

	@ObfuscatedName("afg.am")
	public boolean field9777;

	@ObfuscatedName("afg.au")
	public int[] colour;

	@ObfuscatedName("afg.ar")
	public int sizeX;

	@ObfuscatedName("afg.ap")
	public int sizeY;

	@ObfuscatedName("afg.aq")
	public float[] depth;

	@ObfuscatedName("afg.ax")
	public int clipMinX;

	@ObfuscatedName("afg.av")
	public int clipMaxX;

	@ObfuscatedName("afg.ao")
	public int clipMinY;

	@ObfuscatedName("afg.aj")
	public int clipMaxY;

	@ObfuscatedName("afg.ay")
	public int field9804;

	@ObfuscatedName("afg.ab")
	public int field9787;

	@ObfuscatedName("afg.az")
	public int field9788;

	@ObfuscatedName("afg.aa")
	public int field9783;

	@ObfuscatedName("afg.af")
	public int field9790;

	@ObfuscatedName("afg.ak")
	public int field9791;

	@ObfuscatedName("afg.an")
	public Matrix4x3 field9792;

	@ObfuscatedName("afg.bf")
	public Matrix4x4 field9793;

	@ObfuscatedName("afg.bl")
	public Matrix4x4 field9795;

	@ObfuscatedName("afg.bk")
	public Matrix4x4 field9803;

	@ObfuscatedName("afg.bh")
	public float[][] field9796;

	@ObfuscatedName("afg.bx")
	public int field9797;

	@ObfuscatedName("afg.bd")
	public int field9798;

	@ObfuscatedName("afg.bc")
	public int field9782;

	@ObfuscatedName("afg.bi")
	public int field9800;

	@ObfuscatedName("afg.bn")
	public float field9789;

	@ObfuscatedName("afg.bt")
	public float field9814;

	@ObfuscatedName("afg.bq")
	public float field9802;

	@ObfuscatedName("afg.bm")
	public float field9806;

	@ObfuscatedName("afg.bb")
	public float field9813;

	@ObfuscatedName("afg.be")
	public float field9799;

	@ObfuscatedName("afg.by")
	public int threadLocalsCount;

	@ObfuscatedName("afg.bu")
	public PureJavaToolkitContext[] context;

	@ObfuscatedName("afg.bw")
	public SoftLruHashTable materialTextureCache;

	@ObfuscatedName("afg.bo")
	public SoftLruHashTable billboardMaterialSprites;

	@ObfuscatedName("afg.bz")
	public Sprite cachedBillboardSprite;

	@ObfuscatedName("afg.bv")
	public int cachedBillboardMaterial;

	@ObfuscatedName("afg.br")
	public Sprite field9786;

	@ObfuscatedName("afg.bg")
	public FrameBuffer field9775;

	public PureJavaToolkit(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6, int arg7) {
		this(arg1, arg2, arg3, arg4, arg5);
		try {
			this.method2178(arg0, arg6, arg7);
			this.method2140(arg0);
		} catch (Throwable var10) {
			var10.printStackTrace();
			this.dispose();
			throw new RuntimeException("");
		}
	}

	public PureJavaToolkit(MaterialList arg0, TextureList arg1, BillboardTypeList arg2, ParticleEmitterTypeList arg3, ParticleEffectorTypeList arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field9794 = false;
		this.field9777 = false;
		this.clipMinX = 0;
		this.clipMaxX = 0;
		this.clipMinY = 0;
		this.clipMaxY = 0;
		this.field9783 = 45823;
		this.field9790 = 78642;
		this.field9791 = 75518;
		this.field9796 = new float[6][4];
		this.field9813 = 1.0F;
		this.field9799 = 0.0F;
		this.billboardMaterialSprites = new SoftLruHashTable(16);
		this.cachedBillboardMaterial = -1;

		try {
			this.materialTextureCache = new SoftLruHashTable(10485760, 256);
			this.field9792 = new Matrix4x3();
			this.field9793 = new Matrix4x4();
			this.field9795 = new Matrix4x4();
			this.field9803 = new Matrix4x4();
			this.method15670(1);
			this.method15722(0);
			ColourUtils.method10156(true, true);
			this.field9777 = true;
			this.field9776 = (int) MonotonicTime.get();
		} catch (Throwable var7) {
			var7.printStackTrace();
			this.dispose();
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("afg.f()Lcz;")
	public RendererInfo getRendererInfo() {
		return new RendererInfo(0, "Pure Java", 1, "CPU", 0L, false);
	}

	@ObfuscatedName("afg.l(II)V")
	public void method2116(int arg0, int arg1) throws RendererException {
		this.surface.method15450(arg0, arg1);
		if (this.field1596 != null) {
			this.field1596.method1982();
		}
	}

	@ObfuscatedName("afg.u()V")
	public void method2117() {
	}

	@ObfuscatedName("afg.p()V")
	public void method2369() {
		if (this.field9777) {
			ColourUtils.method14805(true, false);
			this.field9777 = false;
		}
		this.field9794 = true;
	}

	@ObfuscatedName("afg.d(I)V")
	public void cycle(int arg0) {
		int var2 = arg0 - this.field9776;
		for (PureJavaTexture var3 = (PureJavaTexture) this.materialTextureCache.method2950(); var3 != null; var3 = (PureJavaTexture) this.materialTextureCache.method2937()) {
			if (var3.field11265) {
				var3.field11266 += var2;
				int var4 = var3.field11266 / 50;
				if (var4 > 0) {
					Material var5 = this.materialList.get(var3.field11267);
					float var6 = (float) var5.size;
					var3.method17527((int) ((float) var2 / 1000.0F * var5.speedU * var6), (int) ((float) var2 / 1000.0F * var5.speedV * var6));
					var3.field11266 -= var4 * 50;
				}
				var3.field11265 = false;
			}
		}
		this.field9776 = arg0;
		this.billboardMaterialSprites.clean(5);
		this.materialTextureCache.clean(5);
	}

	@ObfuscatedName("afg.c()I")
	public int method2520() {
		return 0;
	}

	@ObfuscatedName("afg.rv()Z")
	public boolean method15654() {
		return this.field9794;
	}

	@ObfuscatedName("afg.rh(I)[I")
	public int[] getMaterialTexture(int arg0) {
		SoftLruHashTable var2 = this.materialTextureCache;
		PureJavaTexture var4;
		synchronized (var2) {
			Material var3 = this.materialList.get(arg0);
			var4 = (PureJavaTexture) this.materialTextureCache.get((long) (var3.diffuseTexture & 0xFFFF) | Long.MIN_VALUE);
			if (var4 == null) {
				int var5 = var3.size;
				if (!this.field1596.loadTexture(TextureRelated2.field7586, var3.diffuseTexture, -1, TextureRelated1.field7569, 0.7F, var5, var5, true)) {
					return null;
				}
				int[] var6;
				if (MaterialAlphaMode.NONE == var3.alphaMode) {
					var6 = this.field1596.getTexture(TextureRelated2.field7586, var3.diffuseTexture, 0.7F, var5, var5, true);
				} else {
					var6 = this.field1596.getSpecialTexture(TextureRelated2.field7586, var3.diffuseTexture, 0.7F, var5, var5, true);
				}
				var4 = new PureJavaTexture(var3.diffuseTexture, var3.field1329, var5, var6, MaterialAlphaMode.TEST != var3.alphaMode);
				this.materialTextureCache.put(var4, (long) (var3.diffuseTexture & 0xFFFF) | Long.MIN_VALUE, var5 * var5);
			}
		}
		var4.field11265 = true;
		return var4.getPixels();
	}

	@ObfuscatedName("afg.ra(I)Z")
	public boolean loadMaterialTexture(int arg0) {
		Material var2 = this.materialList.get(arg0);
		return this.field1596.loadTexture(TextureRelated2.field7586, var2.diffuseTexture, -1, TextureRelated1.field7569, 0.7F, var2.size, var2.size, true);
	}

	@ObfuscatedName("afg.rx(I)I")
	public int getMaterialSize(int arg0) {
		return this.materialList.get(arg0).size;
	}

	@ObfuscatedName("afg.ry(I)Lvn;")
	public MaterialAlphaMode getMaterialAlphaMode(int arg0) {
		return this.materialList.get(arg0).alphaMode;
	}

	@ObfuscatedName("afg.rg(I)B")
	public byte getMaterialAlphaThreshold(int arg0) {
		return this.materialList.get(arg0).alphaThreshold;
	}

	@ObfuscatedName("afg.rz(I)I")
	public int getMaterialAverageColour(int arg0) {
		return this.materialList.get(arg0).averageColour & 0xFFFF;
	}

	@ObfuscatedName("afg.re(I)Z")
	public boolean getMaterialRepeat(int arg0) {
		Material var2 = this.materialList.get(arg0);
		return var2.repeatS != 0 || var2.repeatT != 0;
	}

	@ObfuscatedName("afg.r()Z")
	public boolean method2194() {
		return false;
	}

	@ObfuscatedName("afg.v()Z")
	public boolean method2123() {
		return false;
	}

	@ObfuscatedName("afg.o()Z")
	public boolean method2124() {
		return true;
	}

	@ObfuscatedName("afg.y()Z")
	public boolean isBloomSupported() {
		return false;
	}

	@ObfuscatedName("afg.q()Z")
	public boolean method2127() {
		return false;
	}

	@ObfuscatedName("afg.s()Z")
	public boolean supportsHardShadows() {
		return false;
	}

	@ObfuscatedName("afg.x()Z")
	public boolean supportsAntiAliasing() {
		return false;
	}

	@ObfuscatedName("afg.b()Z")
	public boolean method2129() {
		return false;
	}

	@ObfuscatedName("afg.h()Z")
	public boolean hasExtraDrawDistance() {
		return false;
	}

	@ObfuscatedName("afg.a()Z")
	public boolean method2240() {
		return true;
	}

	@ObfuscatedName("afg.g()Ljava/lang/String;")
	public String hardwareInfo() {
		return "";
	}

	@ObfuscatedName("afg.i()[I")
	public int[] textureFormat() {
		return null;
	}

	@ObfuscatedName("afg.eh(Z)V")
	public void method2253(boolean arg0) {
	}

	@ObfuscatedName("afg.ad(Ljava/awt/Canvas;II)Lafy;")
	public Surface createSurface(Canvas arg0, int arg1, int arg2) {
		return PureJavaSurface.method18912(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("afg.rt(II[I[F)V")
	public void method15662(int arg0, int arg1, int[] arg2, float[] arg3) {
		this.sizeX = arg0;
		this.sizeY = arg1;
		this.colour = arg2;
		this.depth = arg3;
		for (int var5 = 0; var5 < this.threadLocalsCount; var5++) {
			this.context[var5].method999();
		}
		this.resetClip();
		this.method2263();
	}

	@ObfuscatedName("afg.aq(IIII)[I")
	public int[] method2149(int arg0, int arg1, int arg2, int arg3) {
		if (this.colour == null) {
			throw new IllegalStateException("");
		}
		int[] var5 = new int[arg2 * arg3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg3; var7++) {
			int var8 = this.sizeX * (arg1 + var7) + arg0;
			for (int var9 = 0; var9 < arg2; var9++) {
				var5[var6++] = this.colour[var8 + var9];
			}
		}
		return var5;
	}

	@ObfuscatedName("afg.ax()V")
	public void method2150() {
	}

	@ObfuscatedName("afg.t([I)V")
	public void method2134(int[] arg0) {
		arg0[0] = this.sizeX;
		arg0[1] = this.sizeY;
	}

	@ObfuscatedName("afg.av()Z")
	public boolean method2360() {
		return false;
	}

	@ObfuscatedName("afg.ao()Z")
	public boolean method2196() {
		return true;
	}

	@ObfuscatedName("afg.aj()Z")
	public boolean method2153() {
		return false;
	}

	@ObfuscatedName("afg.ay()Z")
	public boolean method2304() {
		return false;
	}

	@ObfuscatedName("afg.ab()I")
	public int method2502() {
		return -1;
	}

	@ObfuscatedName("afg.aa(III)V")
	public void method2163(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("afg.az()V")
	public void method2156() {
	}

	@ObfuscatedName("afg.af(II)J")
	public long method2158(int arg0, int arg1) {
		return 0L;
	}

	@ObfuscatedName("afg.ak(J)V")
	public void method2159(long arg0) {
	}

	@ObfuscatedName("afg.an(II[I[I)V")
	public void method2160(int arg0, int arg1, int[] arg2, int[] arg3) {
		this.method2419(arg0, arg1);
		if (this.field9786 == null || this.field9786.getWidth() != arg0 || this.field9786.getHeight() != arg1) {
			this.field9786 = this.createSprite(arg0, arg1, true, true);
			this.field9775 = null;
		}
		if (this.field9775 == null) {
			this.field9775 = this.createFramebuffer();
			this.field9775.method15439(0, this.field9786.method1437());
		}
		PureJavaSpriteAlpha var5 = new PureJavaSpriteAlpha(this, this.colour, this.sizeX, this.sizeY);
		this.method2142(this.field9775);
		this.method2475(1, -16777216);
		var5.drawTintedScaled(this.field1611, this.field1618, this.field1619, this.field1610, 1, 0, 0, 0);
		this.field9786.download(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
		this.method2143(this.field9775);
	}

	@ObfuscatedName("afg.bl()V")
	public void method2126() {
		this.field9775 = null;
		this.field9786 = null;
	}

	@ObfuscatedName("afg.rl()V")
	public void method15687() {
		if (this.depth == null) {
			return;
		}
		if (this.clipMinX == 0 && this.clipMaxX == this.sizeX && this.clipMinY == 0 && this.clipMaxY == this.sizeY) {
			int var1 = this.depth.length;
			int var2 = var1 - (var1 & 0x7);
			int var3 = 0;
			while (var3 < var2) {
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
				this.depth[var3++] = 2.14748365E9F;
			}
			while (var3 < var1) {
				this.depth[var3++] = 2.14748365E9F;
			}
			return;
		}
		int var4 = this.clipMaxX - this.clipMinX;
		int var5 = this.clipMaxY - this.clipMinY;
		int var6 = this.sizeX - var4;
		int var7 = this.clipMinY * this.sizeX + this.clipMinX;
		int var8 = var4 >> 3;
		int var9 = var4 & 0x7;
		int var10 = var7 - 1;
		for (int var11 = -var5; var11 < 0; var11++) {
			if (var8 > 0) {
				int var12 = var8;
				do {
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var12--;
				} while (var12 > 0);
			}
			if (var9 > 0) {
				int var13 = var9;
				do {
					var10++;
					this.depth[var10] = 2.14748365E9F;
					var13--;
				} while (var13 > 0);
			}
			var10 += var6;
		}
	}

	@ObfuscatedName("afg.dv(Z)V")
	public void method2219(boolean arg0) {
		PureJavaToolkitContext var2 = this.getContext(Thread.currentThread());
		var2.field834 = arg0;
	}

	@ObfuscatedName("afg.bk()V")
	public void method2263() {
		this.field9797 = 0;
		this.field9798 = 0;
		this.field9782 = this.sizeX;
		this.field9800 = this.sizeY;
		this.method15664();
	}

	@ObfuscatedName("afg.bh(IIII)V")
	public void method2164(int arg0, int arg1, int arg2, int arg3) {
		this.field9797 = arg0;
		this.field9798 = arg1;
		this.field9782 = arg2;
		this.field9800 = arg3;
		this.method15664();
	}

	@ObfuscatedName("afg.bx([I)V")
	public void method2326(int[] arg0) {
		arg0[0] = this.field9797;
		arg0[1] = this.field9798;
		arg0[2] = this.field9782;
		arg0[3] = this.field9800;
	}

	@ObfuscatedName("afg.bd(FF)V")
	public void method2339(float arg0, float arg1) {
		this.field9813 = arg1 - arg0;
		this.field9799 = arg0 + arg1 - 1.0F;
		for (int var3 = 0; var3 < this.threadLocalsCount; var3++) {
			PureJavaToolkitContext var4 = this.context[var3];
			PureJavaRasteriser var5 = var4.rasteriser;
			var5.field932 = this.field9813;
			var5.field958 = this.field9799;
		}
	}

	@ObfuscatedName("afg.rc()V")
	public void method15664() {
		int var1 = this.clipMaxX - this.clipMinX;
		int var2 = this.clipMaxY - this.clipMinY;
		float var3 = this.field9789 = (float) this.field9782 / 2.0F;
		float var4 = this.field9802 = (float) this.field9800 / 2.0F;
		this.field9814 = (float) this.field9797 + var3;
		this.field9806 = (float) this.field9798 + var4;
		for (int var5 = 0; var5 < this.threadLocalsCount; var5++) {
			PureJavaToolkitContext var6 = this.context[var5];
			PureJavaRasteriser var7 = var6.rasteriser;
			var7.field964 = var3;
			var7.field942 = var4;
			var7.field934 = this.field9814 - (float) this.clipMinX;
			var7.field941 = this.field9806 - (float) this.clipMinY;
			var7.field945 = var1;
			var7.field946 = var2;
		}
		int var8 = this.clipMinY * this.sizeX + this.clipMinX;
		for (int var9 = this.clipMinY; var9 < this.clipMaxY; var9++) {
			for (int var10 = 0; var10 < this.threadLocalsCount; var10++) {
				this.context[var10].rasteriser.field938[var9 - this.clipMinY] = var8;
			}
			var8 += this.sizeX;
		}
	}

	@ObfuscatedName("afg.bc()V")
	public void resetClip() {
		this.clipMinX = 0;
		this.clipMinY = 0;
		this.clipMaxX = this.sizeX;
		this.clipMaxY = this.sizeY;
		this.method15664();
	}

	@ObfuscatedName("afg.bi(IIII)V")
	public void resetBounds(int left, int top, int right, int bottom) {
		if (left < 0) {
			left = 0;
		}
		if (top < 0) {
			top = 0;
		}
		if (right > this.sizeX) {
			right = this.sizeX;
		}
		if (bottom > this.sizeY) {
			bottom = this.sizeY;
		}
		this.clipMinX = left;
		this.clipMaxX = right;
		this.clipMinY = top;
		this.clipMaxY = bottom;
		this.method15664();
	}

	@ObfuscatedName("afg.bn(IIII)V")
	public void setBounds(int left, int top, int right, int bottom) {
		if (this.clipMinX < left) {
			this.clipMinX = left;
		}
		if (this.clipMinY < top) {
			this.clipMinY = top;
		}
		if (this.clipMaxX > right) {
			this.clipMaxX = right;
		}
		if (this.clipMaxY > bottom) {
			this.clipMaxY = bottom;
		}
		this.method15664();
	}

	@ObfuscatedName("afg.bq([I)V")
	public void method2171(int[] arg0) {
		arg0[0] = this.clipMinX;
		arg0[1] = this.clipMinY;
		arg0[2] = this.clipMaxX;
		arg0[3] = this.clipMaxY;
	}

	@ObfuscatedName("afg.bm(II)V")
	public void method2475(int arg0, int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.fillRectangle(0, 0, this.sizeX, this.sizeY, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method15687();
		}
	}

	@ObfuscatedName("afg.bz(IIIIII)V")
	public void drawRectangle(int x, int y, int width, int height, int rgb, int arg5) {
		this.drawHorizontalLine(x, y, width, rgb, arg5);
		this.drawHorizontalLine(x, y + height - 1, width, rgb, arg5);
		this.drawVerticalLine(x, y + 1, height - 2, rgb, arg5);
		this.drawVerticalLine(x + width - 1, y + 1, height - 2, rgb, arg5);
	}

	@ObfuscatedName("afg.bv(IIIIII)V")
	public void fillRectangle(int x, int y, int width, int height, int rgb, int arg5) {
		if (this.colour == null) {
			return;
		}
		if (x < this.clipMinX) {
			width -= this.clipMinX - x;
			x = this.clipMinX;
		}
		if (y < this.clipMinY) {
			height -= this.clipMinY - y;
			y = this.clipMinY;
		}
		if (x + width > this.clipMaxX) {
			width = this.clipMaxX - x;
		}
		if (y + height > this.clipMaxY) {
			height = this.clipMaxY - y;
		}
		if (width <= 0 || height <= 0 || x > this.clipMaxX || y > this.clipMaxY) {
			return;
		}
		int var7 = this.sizeX - width;
		int var8 = this.sizeX * y + x;
		int var9 = rgb >>> 24;
		if (arg5 == 0 || arg5 == 1 && var9 == 255) {
			int var22 = width >> 3;
			int var23 = width & 0x7;
			int var24 = var8 - 1;
			for (int var25 = -height; var25 < 0; var25++) {
				if (var22 > 0) {
					int var26 = var22;
					do {
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var24++;
						this.colour[var24] = rgb;
						var26--;
					} while (var26 > 0);
				}
				if (var23 > 0) {
					int var27 = var23;
					do {
						var24++;
						this.colour[var24] = rgb;
						var27--;
					} while (var27 > 0);
				}
				var24 += var7;
			}
		} else if (arg5 == 1) {
			int var10 = ((rgb & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + (((rgb & 0xFF00FF00) >>> 8) * var9 & 0xFF00FF00);
			int var11 = 256 - var9;
			for (int var12 = 0; var12 < height; var12++) {
				for (int var13 = -width; var13 < 0; var13++) {
					int var14 = this.colour[var8];
					int var15 = ((var14 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + (((var14 & 0xFF00FF00) >>> 8) * var11 & 0xFF00FF00);
					this.colour[var8++] = var10 + var15;
				}
				var8 += var7;
			}
		} else if (arg5 == 2) {
			for (int var16 = 0; var16 < height; var16++) {
				for (int var17 = -width; var17 < 0; var17++) {
					int var18 = this.colour[var8];
					int var19 = rgb + var18;
					int var20 = (rgb & 0xFF00FF) + (var18 & 0xFF00FF);
					int var21 = (var19 - var20 & 0x10000) + (var20 & 0x1000100);
					this.colour[var8++] = var19 - var21 | var21 - (var21 >>> 8);
				}
				var8 += var7;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.bg(IIIII)V")
	public void method2182(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.colour == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		int var6 = arg1 - arg2;
		if (var6 < this.clipMinY) {
			var6 = this.clipMinY;
		}
		int var7 = arg1 + arg2 + 1;
		if (var7 > this.clipMaxY) {
			var7 = this.clipMaxY;
		}
		int var8 = var6;
		int var9 = arg2 * arg2;
		int var10 = 0;
		int var11 = arg1 - var6;
		int var12 = var11 * var11;
		int var13 = var12 - var11;
		if (arg1 > var7) {
			arg1 = var7;
		}
		int var14 = arg3 >>> 24;
		if (arg4 == 0 || arg4 == 1 && var14 == 255) {
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				int var55 = arg0 - var10 + 1;
				if (var55 < this.clipMinX) {
					var55 = this.clipMinX;
				}
				int var56 = arg0 + var10;
				if (var56 > this.clipMaxX) {
					var56 = this.clipMaxX;
				}
				int var57 = this.sizeX * var8 + var55;
				for (int var58 = var55; var58 < var56; var58++) {
					this.colour[var57++] = arg3;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			int var59 = arg2;
			int var60 = var8 - arg1;
			int var61 = var60 * var60 + var9;
			int var62 = var61 - arg2;
			int var63 = var61 - var60;
			while (var8 < var7) {
				while (var63 > var9 && var62 > var9) {
					var63 -= var59-- + var59;
					var62 -= var59 + var59;
				}
				int var64 = arg0 - var59;
				if (var64 < this.clipMinX) {
					var64 = this.clipMinX;
				}
				int var65 = arg0 + var59;
				if (var65 > this.clipMaxX - 1) {
					var65 = this.clipMaxX - 1;
				}
				int var66 = this.sizeX * var8 + var64;
				for (int var67 = var64; var67 <= var65; var67++) {
					this.colour[var66++] = arg3;
				}
				var8++;
				var63 += var60 + var60;
				var62 += var60++ + var60;
			}
			return;
		} else if (arg4 == 1) {
			int var15 = (var14 << 24) + ((arg3 & 0xFF00) * var14 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * var14 >> 8 & 0xFF00FF);
			int var16 = 256 - var14;
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				int var17 = arg0 - var10 + 1;
				if (var17 < this.clipMinX) {
					var17 = this.clipMinX;
				}
				int var18 = arg0 + var10;
				if (var18 > this.clipMaxX) {
					var18 = this.clipMaxX;
				}
				int var19 = this.sizeX * var8 + var17;
				for (int var20 = var17; var20 < var18; var20++) {
					int var21 = this.colour[var19];
					int var22 = ((var21 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var21 & 0xFF00FF) * var16 >> 8 & 0xFF00FF);
					this.colour[var19++] = var15 + var22;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			int var23 = arg2;
			int var24 = -var11;
			int var25 = var24 * var24 + var9;
			int var26 = var25 - arg2;
			int var27 = var25 - var24;
			while (var8 < var7) {
				while (var27 > var9 && var26 > var9) {
					var27 -= var23-- + var23;
					var26 -= var23 + var23;
				}
				int var28 = arg0 - var23;
				if (var28 < this.clipMinX) {
					var28 = this.clipMinX;
				}
				int var29 = arg0 + var23;
				if (var29 > this.clipMaxX - 1) {
					var29 = this.clipMaxX - 1;
				}
				int var30 = this.sizeX * var8 + var28;
				for (int var31 = var28; var31 <= var29; var31++) {
					int var32 = this.colour[var30];
					int var33 = ((var32 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var16 >> 8 & 0xFF00FF);
					this.colour[var30++] = var15 + var33;
				}
				var8++;
				var27 += var24 + var24;
				var26 += var24++ + var24;
			}
		} else if (arg4 == 2) {
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				int var34 = arg0 - var10 + 1;
				if (var34 < this.clipMinX) {
					var34 = this.clipMinX;
				}
				int var35 = arg0 + var10;
				if (var35 > this.clipMaxX) {
					var35 = this.clipMaxX;
				}
				int var36 = this.sizeX * var8 + var34;
				for (int var37 = var34; var37 < var35; var37++) {
					int var38 = this.colour[var36];
					int var39 = arg3 + var38;
					int var40 = (arg3 & 0xFF00FF) + (var38 & 0xFF00FF);
					int var41 = (var39 - var40 & 0x10000) + (var40 & 0x1000100);
					this.colour[var36++] = var39 - var41 | var41 - (var41 >>> 8);
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			int var42 = arg2;
			int var43 = -var11;
			int var44 = var43 * var43 + var9;
			int var45 = var44 - arg2;
			int var46 = var44 - var43;
			while (var8 < var7) {
				while (var46 > var9 && var45 > var9) {
					var46 -= var42-- + var42;
					var45 -= var42 + var42;
				}
				int var47 = arg0 - var42;
				if (var47 < this.clipMinX) {
					var47 = this.clipMinX;
				}
				int var48 = arg0 + var42;
				if (var48 > this.clipMaxX - 1) {
					var48 = this.clipMaxX - 1;
				}
				int var49 = this.sizeX * var8 + var47;
				for (int var50 = var47; var50 <= var48; var50++) {
					int var51 = this.colour[var49];
					int var52 = arg3 + var51;
					int var53 = (arg3 & 0xFF00FF) + (var51 & 0xFF00FF);
					int var54 = (var52 - var53 & 0x10000) + (var53 & 0x1000100);
					this.colour[var49++] = var52 - var54 | var54 - (var54 >>> 8);
				}
				var8++;
				var46 += var43 + var43;
				var45 += var43++ + var43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.ba(IIIII)V")
	public void drawHorizontalLine(int x, int y, int width, int rgb, int arg4) {
		if (this.colour == null || (y < this.clipMinY || y >= this.clipMaxY)) {
			return;
		}
		if (x < this.clipMinX) {
			width -= this.clipMinX - x;
			x = this.clipMinX;
		}
		if (x + width > this.clipMaxX) {
			width = this.clipMaxX - x;
		}
		int var6 = this.sizeX * y + x;
		int var7 = rgb >>> 24;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (int var18 = 0; var18 < width; var18++) {
				this.colour[var6 + var18] = rgb;
			}
		} else if (arg4 == 1) {
			int var8 = (var7 << 24) + ((rgb & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((rgb & 0xFF00) * var7 >> 8 & 0xFF00);
			int var9 = 256 - var7;
			for (int var10 = 0; var10 < width; var10++) {
				int var11 = this.colour[var6 + var10];
				int var12 = ((var11 & 0xFF00) * var9 >> 8 & 0xFF00) + ((var11 & 0xFF00FF) * var9 >> 8 & 0xFF00FF);
				this.colour[var6 + var10] = var8 + var12;
			}
		} else if (arg4 == 2) {
			for (int var13 = 0; var13 < width; var13++) {
				int var14 = this.colour[var6 + var13];
				int var15 = rgb + var14;
				int var16 = (rgb & 0xFF00FF) + (var14 & 0xFF00FF);
				int var17 = (var15 - var16 & 0x10000) + (var16 & 0x1000100);
				this.colour[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.rr(IIIIIIII)V")
	public void method15666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.colour == null || (arg1 < this.clipMinY || arg1 >= this.clipMaxY)) {
			return;
		}
		int var9 = this.sizeX * arg1 + arg0;
		int var10 = arg3 >>> 24;
		int var11 = arg5 + arg6;
		int var12 = arg7 % var11;
		if (arg4 == 0 || arg4 == 1 && var10 == 255) {
			int var23 = 0;
			while (var23 < arg2) {
				if (arg0 + var23 >= this.clipMinX && arg0 + var23 < this.clipMaxX && var12 < arg5) {
					this.colour[var9 + var23] = arg3;
				}
				var23++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 1) {
			int var13 = (var10 << 24) + ((arg3 & 0xFF00) * var10 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * var10 >> 8 & 0xFF00FF);
			int var14 = 256 - var10;
			int var15 = 0;
			while (var15 < arg2) {
				if (arg0 + var15 >= this.clipMinX && arg0 + var15 < this.clipMaxX && var12 < arg5) {
					int var16 = this.colour[var9 + var15];
					int var17 = ((var16 & 0xFF00) * var14 >> 8 & 0xFF00) + ((var16 & 0xFF00FF) * var14 >> 8 & 0xFF00FF);
					this.colour[var9 + var15] = var13 + var17;
				}
				var15++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 2) {
			int var18 = 0;
			while (var18 < arg2) {
				if (arg0 + var18 >= this.clipMinX && arg0 + var18 < this.clipMaxX && var12 < arg5) {
					int var19 = this.colour[var9 + var18];
					int var20 = arg3 + var19;
					int var21 = (arg3 & 0xFF00FF) + (var19 & 0xFF00FF);
					int var22 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
					this.colour[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
				}
				var18++;
				var12++;
				var12 %= var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.bp(IIIII)V")
	public void drawVerticalLine(int x1, int y1, int x2, int y2, int arg4) {
		if (this.colour == null || (x1 < this.clipMinX || x1 >= this.clipMaxX)) {
			return;
		}
		if (y1 < this.clipMinY) {
			x2 -= this.clipMinY - y1;
			y1 = this.clipMinY;
		}
		if (y1 + x2 > this.clipMaxY) {
			x2 = this.clipMaxY - y1;
		}
		int var6 = this.sizeX * y1 + x1;
		int var7 = y2 >>> 24;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (int var20 = 0; var20 < x2; var20++) {
				this.colour[this.sizeX * var20 + var6] = y2;
			}
		} else if (arg4 == 1) {
			int var8 = (var7 << 24) + ((y2 & 0xFF00) * var7 >> 8 & 0xFF00) + ((y2 & 0xFF00FF) * var7 >> 8 & 0xFF00FF);
			int var9 = 256 - var7;
			for (int var10 = 0; var10 < x2; var10++) {
				int var11 = this.sizeX * var10 + var6;
				int var12 = this.colour[var11];
				int var13 = ((var12 & 0xFF00) * var9 >> 8 & 0xFF00) + ((var12 & 0xFF00FF) * var9 >> 8 & 0xFF00FF);
				this.colour[var11] = var8 + var13;
			}
		} else if (arg4 == 2) {
			for (int var14 = 0; var14 < x2; var14++) {
				int var15 = this.sizeX * var14 + var6;
				int var16 = this.colour[var15];
				int var17 = y2 + var16;
				int var18 = (y2 & 0xFF00FF) + (var16 & 0xFF00FF);
				int var19 = (var17 - var18 & 0x10000) + (var18 & 0x1000100);
				this.colour[var15] = var17 - var19 | var19 - (var19 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.rd(IIIIIIII)V")
	public void method15667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.colour == null || (arg0 < this.clipMinX || arg0 >= this.clipMaxX)) {
			return;
		}
		int var9 = this.sizeX * arg1 + arg0;
		int var10 = arg3 >>> 24;
		int var11 = arg5 + arg6;
		int var12 = arg7 % var11;
		if (arg4 == 0 || arg4 == 1 && var10 == 255) {
			int var25 = 0;
			while (var25 < arg2) {
				if (arg1 + var25 >= this.clipMinY && arg1 + var25 < this.clipMaxY && var12 < arg5) {
					this.colour[this.sizeX * var25 + var9] = arg3;
				}
				var25++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 1) {
			int var13 = (var10 << 24) + ((arg3 & 0xFF00) * var10 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * var10 >> 8 & 0xFF00FF);
			int var14 = 256 - var10;
			int var15 = 0;
			while (var15 < arg2) {
				if (arg1 + var15 >= this.clipMinY && arg1 + var15 < this.clipMaxY && var12 < arg5) {
					int var16 = this.sizeX * var15 + var9;
					int var17 = this.colour[var16];
					int var18 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
					this.colour[var16] = var13 + var18;
				}
				var15++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 2) {
			int var19 = 0;
			while (var19 < arg2) {
				if (arg1 + var19 >= this.clipMinY && arg1 + var19 < this.clipMaxY && var12 < arg5) {
					int var20 = this.sizeX * var19 + var9;
					int var21 = this.colour[var20];
					int var22 = arg3 + var21;
					int var23 = (arg3 & 0xFF00FF) + (var21 & 0xFF00FF);
					int var24 = (var22 - var23 & 0x10000) + (var23 & 0x1000100);
					this.colour[var20] = var22 - var24 | var24 - (var24 >>> 8);
				}
				var19++;
				var12++;
				var12 %= var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.bj(IIIIII)V")
	public void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5) {
		if (this.colour == null) {
			return;
		}
		int var7 = x2 - x1;
		int var8 = y2 - y1;
		if (var8 == 0) {
			if (var7 >= 0) {
				this.drawHorizontalLine(x1, y1, var7 + 1, rgb, arg5);
			} else {
				this.drawHorizontalLine(x1 + var7, y1, -var7 + 1, rgb, arg5);
			}
		} else if (var7 != 0) {
			if (var7 + var8 < 0) {
				x1 += var7;
				var7 = -var7;
				y1 += var8;
				var8 = -var8;
			}
			if (var7 > var8) {
				int var9 = y1 << 16;
				int var10 = var9 + 32768;
				int var11 = var8 << 16;
				int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
				int var13 = x1 + var7;
				if (x1 < this.clipMinX) {
					var10 += (this.clipMinX - x1) * var12;
					x1 = this.clipMinX;
				}
				if (var13 >= this.clipMaxX) {
					var13 = this.clipMaxX - 1;
				}
				int var14 = rgb >>> 24;
				if (arg5 == 0 || arg5 == 1 && var14 == 255) {
					while (x1 <= var13) {
						int var27 = var10 >> 16;
						if (var27 >= this.clipMinY && var27 < this.clipMaxY) {
							this.colour[this.sizeX * var27 + x1] = rgb;
						}
						var10 += var12;
						x1++;
					}
				} else if (arg5 == 1) {
					int var15 = (var14 << 24) + ((rgb & 0xFF00) * var14 >> 8 & 0xFF00) + ((rgb & 0xFF00FF) * var14 >> 8 & 0xFF00FF);
					int var16 = 256 - var14;
					while (x1 <= var13) {
						int var17 = var10 >> 16;
						if (var17 >= this.clipMinY && var17 < this.clipMaxY) {
							int var18 = this.sizeX * var17 + x1;
							int var19 = this.colour[var18];
							int var20 = ((var19 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var19 & 0xFF00FF) * var16 >> 8 & 0xFF00FF);
							this.colour[var18] = var15 + var20;
						}
						var10 += var12;
						x1++;
					}
				} else if (arg5 == 2) {
					while (x1 <= var13) {
						int var21 = var10 >> 16;
						if (var21 >= this.clipMinY && var21 < this.clipMaxY) {
							int var22 = this.sizeX * var21 + x1;
							int var23 = this.colour[var22];
							int var24 = rgb + var23;
							int var25 = (rgb & 0xFF00FF) + (var23 & 0xFF00FF);
							int var26 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
							this.colour[var22] = var24 - var26 | var26 - (var26 >>> 8);
						}
						var10 += var12;
						x1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				int var28 = x1 << 16;
				int var29 = var28 + 32768;
				int var30 = var7 << 16;
				int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
				int var32 = y1 + var8;
				if (y1 < this.clipMinY) {
					var29 += (this.clipMinY - y1) * var31;
					y1 = this.clipMinY;
				}
				if (var32 >= this.clipMaxY) {
					var32 = this.clipMaxY - 1;
				}
				int var33 = rgb >>> 24;
				if (arg5 == 0 || arg5 == 1 && var33 == 255) {
					while (y1 <= var32) {
						int var46 = var29 >> 16;
						if (var46 >= this.clipMinX && var46 < this.clipMaxX) {
							this.colour[this.sizeX * y1 + var46] = rgb;
						}
						var29 += var31;
						y1++;
					}
				} else if (arg5 == 1) {
					int var34 = (var33 << 24) + ((rgb & 0xFF00FF) * var33 >> 8 & 0xFF00FF) + ((rgb & 0xFF00) * var33 >> 8 & 0xFF00);
					int var35 = 256 - var33;
					while (y1 <= var32) {
						int var36 = var29 >> 16;
						if (var36 >= this.clipMinX && var36 < this.clipMaxX) {
							int var37 = this.sizeX * y1 + var36;
							int var38 = this.colour[var37];
							int var39 = ((var38 & 0xFF00FF) * var35 >> 8 & 0xFF00FF) + ((var38 & 0xFF00) * var35 >> 8 & 0xFF00);
							this.colour[this.sizeX * y1 + var36] = var34 + var39;
						}
						var29 += var31;
						y1++;
					}
				} else if (arg5 == 2) {
					while (y1 <= var32) {
						int var40 = var29 >> 16;
						if (var40 >= this.clipMinX && var40 < this.clipMaxX) {
							int var41 = this.sizeX * y1 + var40;
							int var42 = this.colour[var41];
							int var43 = rgb + var42;
							int var44 = (rgb & 0xFF00FF) + (var42 & 0xFF00FF);
							int var45 = (var43 - var44 & 0x10000) + (var44 & 0x1000100);
							this.colour[var41] = var43 - var45 | var45 - (var45 >>> 8);
						}
						var29 += var31;
						y1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (var8 >= 0) {
			this.drawVerticalLine(x1, y1, var8 + 1, rgb, arg5);
		} else {
			this.drawVerticalLine(x1, y1 + var8, -var8 + 1, rgb, arg5);
		}
	}

	@ObfuscatedName("afg.cl(IIIIIIIII)V")
	public void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.colour == null) {
			return;
		}
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		if (var11 == 0) {
			if (var10 >= 0) {
				this.method15666(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				int var12 = arg6 + arg7;
				int var13 = arg8 % var12;
				int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
				int var15 = var14 % var12;
				if (var15 < 0) {
					var15 += var12;
				}
				this.method15666(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
			}
		} else if (var10 != 0) {
			int var20 = arg8 << 8;
			int var21 = arg6 << 8;
			int var22 = arg7 << 8;
			int var23 = var21 + var22;
			int var24 = var20 % var23;
			if (var10 + var11 < 0) {
				int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
				int var26 = var25 % var23;
				int var27 = var21 + var23 - var24 - var26;
				var24 = var27 % var23;
				if (var24 < 0) {
					var24 += var23;
				}
				arg0 += var10;
				var10 = -var10;
				arg1 += var11;
				var11 = -var11;
			}
			if (var10 > var11) {
				int var28 = arg1 << 16;
				int var29 = var28 + 32768;
				int var30 = var11 << 16;
				int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
				int var32 = arg0 + var10;
				int var33 = arg4 >>> 24;
				int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var33 == 255) {
					while (arg0 <= var32) {
						int var49 = var29 >> 16;
						if (arg0 >= this.clipMinX && arg0 < this.clipMaxX && var49 >= this.clipMinY && var49 < this.clipMaxY && var24 < var21) {
							this.colour[this.sizeX * var49 + arg0] = arg4;
						}
						var29 += var31;
						arg0++;
						int var50 = var24 + var34;
						var24 = var50 % var23;
					}
				} else if (arg5 == 1) {
					int var35 = (var33 << 24) + ((arg4 & 0xFF00) * var33 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var33 >> 8 & 0xFF00FF);
					int var36 = 256 - var33;
					while (arg0 <= var32) {
						int var37 = var29 >> 16;
						if (arg0 >= this.clipMinX && arg0 < this.clipMaxX && var37 >= this.clipMinY && var37 < this.clipMaxY && var24 < var21) {
							int var38 = this.sizeX * var37 + arg0;
							int var39 = this.colour[var38];
							int var40 = ((var39 & 0xFF00) * var36 >> 8 & 0xFF00) + ((var39 & 0xFF00FF) * var36 >> 8 & 0xFF00FF);
							this.colour[var38] = var35 + var40;
						}
						var29 += var31;
						arg0++;
						int var41 = var24 + var34;
						var24 = var41 % var23;
					}
				} else if (arg5 == 2) {
					while (arg0 <= var32) {
						int var42 = var29 >> 16;
						if (arg0 >= this.clipMinX && arg0 < this.clipMaxX && var42 >= this.clipMinY && var42 < this.clipMaxY && var24 < var21) {
							int var43 = this.sizeX * var42 + arg0;
							int var44 = this.colour[var43];
							int var45 = arg4 + var44;
							int var46 = (arg4 & 0xFF00FF) + (var44 & 0xFF00FF);
							int var47 = (var45 - var46 & 0x10000) + (var46 & 0x1000100);
							this.colour[var43] = var45 - var47 | var47 - (var47 >>> 8);
						}
						var29 += var31;
						arg0++;
						int var48 = var24 + var34;
						var24 = var48 % var23;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				int var51 = arg0 << 16;
				int var52 = var51 + 32768;
				int var53 = var10 << 16;
				int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
				int var55 = arg1 + var11;
				int var56 = arg4 >>> 24;
				int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var56 == 255) {
					while (arg1 <= var55) {
						int var72 = var52 >> 16;
						if (arg1 >= this.clipMinY && arg1 < this.clipMaxY && var72 >= this.clipMinX && var72 < this.clipMaxX && var24 < var21) {
							this.colour[this.sizeX * arg1 + var72] = arg4;
						}
						var52 += var54;
						arg1++;
						int var73 = var24 + var57;
						var24 = var73 % var23;
					}
				} else if (arg5 == 1) {
					int var58 = (var56 << 24) + ((arg4 & 0xFF00FF) * var56 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var56 >> 8 & 0xFF00);
					int var59 = 256 - var56;
					while (arg1 <= var55) {
						int var60 = var52 >> 16;
						if (arg1 >= this.clipMinY && arg1 < this.clipMaxY && var60 >= this.clipMinX && var60 < this.clipMaxX && var24 < var21) {
							int var61 = this.sizeX * arg1 + var60;
							int var62 = this.colour[var61];
							int var63 = ((var62 & 0xFF00FF) * var59 >> 8 & 0xFF00FF) + ((var62 & 0xFF00) * var59 >> 8 & 0xFF00);
							this.colour[this.sizeX * arg1 + var60] = var58 + var63;
						}
						var52 += var54;
						arg1++;
						int var64 = var24 + var57;
						var24 = var64 % var23;
					}
				} else if (arg5 == 2) {
					while (arg1 <= var55) {
						int var65 = var52 >> 16;
						if (arg1 >= this.clipMinY && arg1 < this.clipMaxY && var65 >= this.clipMinX && var65 < this.clipMaxX && var24 < var21) {
							int var66 = this.sizeX * arg1 + var65;
							int var67 = this.colour[var66];
							int var68 = arg4 + var67;
							int var69 = (arg4 & 0xFF00FF) + (var67 & 0xFF00FF);
							int var70 = (var68 - var69 & 0x10000) + (var69 & 0x1000100);
							this.colour[var66] = var68 - var70 | var70 - (var70 >>> 8);
						}
						var52 += var54;
						arg1++;
						int var71 = var24 + var57;
						var24 = var71 % var23;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (var11 >= 0) {
			this.method15667(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			int var16 = arg6 + arg7;
			int var17 = arg8 % var16;
			int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
			int var19 = var18 % var16;
			if (var19 < 0) {
				var19 += var16;
			}
			this.method15667(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
		}
	}

	@ObfuscatedName("afg.bs(IIIIIILch;II)V")
	public void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8) {
		if (this.colour == null) {
			return;
		}
		JavaGraphicsRelated3 var10 = (JavaGraphicsRelated3) arg6;
		int[] var11 = var10.field9414;
		int[] var12 = var10.field9415;
		int var13 = this.clipMinY > arg8 ? this.clipMinY : arg8;
		int var14 = this.clipMaxY < var11.length + arg8 ? this.clipMaxY : var11.length + arg8;
		int var15 = arg2 - arg0;
		int var16 = arg3 - arg1;
		if (var15 + var16 < 0) {
			arg0 += var15;
			var15 = -var15;
			arg1 += var16;
			var16 = -var16;
		}
		if (var15 <= var16) {
			int var42 = arg0 << 16;
			int var43 = var42 + 32768;
			int var44 = var15 << 16;
			int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
			int var46 = arg1 + var16;
			if (arg1 < var13) {
				var43 += (var13 - arg1) * var45;
				arg1 = var13;
			}
			if (var46 >= var14) {
				var46 = var14 - 1;
			}
			int var47 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var47 == 255) {
				while (arg1 <= var46) {
					int var64 = var43 >> 16;
					int var65 = arg1 - arg8;
					int var66 = var11[var65] + arg7;
					if (var64 >= this.clipMinX && var64 < this.clipMaxX && var64 >= var66 && var64 < var12[var65] + var66) {
						this.colour[this.sizeX * arg1 + var64] = arg4;
					}
					var43 += var45;
					arg1++;
				}
			} else if (arg5 == 1) {
				int var48 = (var47 << 24) + ((arg4 & 0xFF00FF) * var47 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var47 >> 8 & 0xFF00);
				int var49 = 256 - var47;
				while (arg1 <= var46) {
					int var50 = var43 >> 16;
					int var51 = arg1 - arg8;
					int var52 = var11[var51] + arg7;
					if (var50 >= this.clipMinX && var50 < this.clipMaxX && var50 >= var52 && var50 < var12[var51] + var52) {
						int var53 = this.sizeX * arg1 + var50;
						int var54 = this.colour[var53];
						int var55 = ((var54 & 0xFF00) * var49 >> 8 & 0xFF00) + ((var54 & 0xFF00FF) * var49 >> 8 & 0xFF00FF);
						this.colour[this.sizeX * arg1 + var50] = var48 + var55;
					}
					var43 += var45;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var46) {
					int var56 = var43 >> 16;
					int var57 = arg1 - arg8;
					int var58 = var11[var57] + arg7;
					if (var56 >= this.clipMinX && var56 < this.clipMaxX && var56 >= var58 && var56 < var12[var57] + var58) {
						int var59 = this.sizeX * arg1 + var56;
						int var60 = this.colour[var59];
						int var61 = arg4 + var60;
						int var62 = (arg4 & 0xFF00FF) + (var60 & 0xFF00FF);
						int var63 = (var61 - var62 & 0x10000) + (var62 & 0x1000100);
						this.colour[var59] = var61 - var63 | var63 - (var63 >>> 8);
					}
					var43 += var45;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		int var17 = arg1 << 16;
		int var18 = var17 + 32768;
		int var19 = var16 << 16;
		int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
		int var21 = arg0 + var15;
		if (arg0 < this.clipMinX) {
			var18 += (this.clipMinX - arg0) * var20;
			arg0 = this.clipMinX;
		}
		if (var21 >= this.clipMaxX) {
			var21 = this.clipMaxX - 1;
		}
		int var22 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && var22 == 255) {
			while (arg0 <= var21) {
				int var39 = var18 >> 16;
				int var40 = var39 - arg8;
				if (var39 >= var13 && var39 < var14) {
					int var41 = var11[var40] + arg7;
					if (arg0 >= var41 && arg0 < var12[var40] + var41) {
						this.colour[this.sizeX * var39 + arg0] = arg4;
					}
				}
				var18 += var20;
				arg0++;
			}
		} else if (arg5 == 1) {
			int var23 = (var22 << 24) + ((arg4 & 0xFF00) * var22 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var22 >> 8 & 0xFF00FF);
			int var24 = 256 - var22;
			while (arg0 <= var21) {
				int var25 = var18 >> 16;
				int var26 = var25 - arg8;
				if (var25 >= var13 && var25 < var14) {
					int var27 = var11[var26] + arg7;
					if (arg0 >= var27 && arg0 < var12[var26] + var27) {
						int var28 = this.sizeX * var25 + arg0;
						int var29 = this.colour[var28];
						int var30 = ((var29 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((var29 & 0xFF00) * var24 >> 8 & 0xFF00);
						this.colour[var28] = var23 + var30;
					}
				}
				var18 += var20;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var21) {
				int var31 = var18 >> 16;
				int var32 = var31 - arg8;
				if (var31 >= var13 && var31 < var14) {
					int var33 = var11[var32] + arg7;
					if (arg0 >= var33 && arg0 < var12[var32] + var33) {
						int var34 = this.sizeX * var31 + arg0;
						int var35 = this.colour[var34];
						int var36 = arg4 + var35;
						int var37 = (arg4 & 0xFF00FF) + (var35 & 0xFF00FF);
						int var38 = (var36 - var37 & 0x10000) + (var37 & 0x1000100);
						this.colour[var34] = var36 - var38 | var38 - (var38 >>> 8);
					}
				}
				var18 += var20;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.cg(IIIIIILch;IIIII)V")
	public void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (this.colour == null) {
			return;
		}
		JavaGraphicsRelated3 var13 = (JavaGraphicsRelated3) arg6;
		int[] var14 = var13.field9414;
		int[] var15 = var13.field9415;
		int var16 = this.clipMinY > arg8 ? this.clipMinY : arg8;
		int var17 = this.clipMaxY < var14.length + arg8 ? this.clipMaxY : var14.length + arg8;
		int var18 = arg11 << 8;
		int var19 = arg9 << 8;
		int var20 = arg10 << 8;
		int var21 = var19 + var20;
		int var22 = var18 % var21;
		int var23 = arg2 - arg0;
		int var24 = arg3 - arg1;
		if (var23 + var24 < 0) {
			int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
			int var26 = var25 % var21;
			int var27 = var19 + var21 - var22 - var26;
			var22 = var27 % var21;
			if (var22 < 0) {
				var22 += var21;
			}
			arg0 += var23;
			var23 = -var23;
			arg1 += var24;
			var24 = -var24;
		}
		if (var23 <= var24) {
			int var57 = arg0 << 16;
			int var58 = var57 + 32768;
			int var59 = var23 << 16;
			int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
			int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
			int var62 = arg1 + var24;
			int var63 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var63 == 255) {
				while (arg1 <= var62) {
					int var80 = var58 >> 16;
					int var81 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var80 >= this.clipMinX && var80 < this.clipMaxX && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
						this.colour[this.sizeX * arg1 + var80] = arg4;
					}
					var58 += var60;
					arg1++;
					int var82 = var22 + var61;
					var22 = var82 % var21;
				}
			} else if (arg5 == 1) {
				int var64 = (var63 << 24) + ((arg4 & 0xFF00) * var63 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var63 >> 8 & 0xFF00FF);
				int var65 = 256 - var63;
				while (arg1 <= var62) {
					int var66 = var58 >> 16;
					int var67 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var66 >= this.clipMinX && var66 < this.clipMaxX && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
						int var68 = this.sizeX * arg1 + var66;
						int var69 = this.colour[var68];
						int var70 = ((var69 & 0xFF00) * var65 >> 8 & 0xFF00) + ((var69 & 0xFF00FF) * var65 >> 8 & 0xFF00FF);
						this.colour[this.sizeX * arg1 + var66] = var64 + var70;
					}
					var58 += var60;
					arg1++;
					int var71 = var22 + var61;
					var22 = var71 % var21;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var62) {
					int var72 = var58 >> 16;
					int var73 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var72 >= this.clipMinX && var72 < this.clipMaxX && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
						int var74 = this.sizeX * arg1 + var72;
						int var75 = this.colour[var74];
						int var76 = arg4 + var75;
						int var77 = (arg4 & 0xFF00FF) + (var75 & 0xFF00FF);
						int var78 = (var76 - var77 & 0x10000) + (var77 & 0x1000100);
						this.colour[var74] = var76 - var78 | var78 - (var78 >>> 8);
					}
					var58 += var60;
					arg1++;
					int var79 = var22 + var61;
					var22 = var79 % var21;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		int var28 = arg1 << 16;
		int var29 = var28 + 32768;
		int var30 = var24 << 16;
		int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
		int var32 = arg0 + var23;
		int var33 = arg4 >>> 24;
		int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && var33 == 255) {
			while (arg0 <= var32) {
				int var53 = var29 >> 16;
				int var54 = var53 - arg8;
				if (arg0 >= this.clipMinX && arg0 < this.clipMaxX && var53 >= var16 && var53 < var17 && var22 < var19) {
					int var55 = var14[var54] + arg7;
					if (arg0 >= var55 && arg0 < var15[var54] + var55) {
						this.colour[this.sizeX * var53 + arg0] = arg4;
					}
				}
				var29 += var31;
				arg0++;
				int var56 = var22 + var34;
				var22 = var56 % var21;
			}
		} else if (arg5 == 1) {
			int var35 = (var33 << 24) + ((arg4 & 0xFF00FF) * var33 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var33 >> 8 & 0xFF00);
			int var36 = 256 - var33;
			while (arg0 <= var32) {
				int var37 = var29 >> 16;
				int var38 = var37 - arg8;
				if (arg0 >= this.clipMinX && arg0 < this.clipMaxX && var37 >= var16 && var37 < var17 && var22 < var19) {
					int var39 = var14[var38] + arg7;
					if (arg0 >= var39 && arg0 < var15[var38] + var39) {
						int var40 = this.sizeX * var37 + arg0;
						int var41 = this.colour[var40];
						int var42 = ((var41 & 0xFF00) * var36 >> 8 & 0xFF00) + ((var41 & 0xFF00FF) * var36 >> 8 & 0xFF00FF);
						this.colour[var40] = var35 + var42;
					}
				}
				var29 += var31;
				arg0++;
				int var43 = var22 + var34;
				var22 = var43 % var21;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var32) {
				int var44 = var29 >> 16;
				int var45 = var44 - arg8;
				if (arg0 >= this.clipMinX && arg0 < this.clipMaxX && var44 >= var16 && var44 < var17 && var22 < var19) {
					int var46 = var14[var45] + arg7;
					if (arg0 >= var46 && arg0 < var15[var45] + var46) {
						int var47 = this.sizeX * var44 + arg0;
						int var48 = this.colour[var47];
						int var49 = arg4 + var48;
						int var50 = (arg4 & 0xFF00FF) + (var48 & 0xFF00FF);
						int var51 = (var49 - var50 & 0x10000) + (var50 & 0x1000100);
						this.colour[var47] = var49 - var51 | var51 - (var51 >>> 8);
					}
				}
				var29 += var31;
				arg0++;
				int var52 = var22 + var34;
				var22 = var52 % var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.ce(IIIIIII)V")
	public void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5, int arg6) {
		if (this.colour == null) {
			return;
		}
		PureJavaToolkitContext var8 = this.getContext(Thread.currentThread());
		PureJavaRasteriser var9 = var8.rasteriser;
		int var10 = x2 - x1;
		int var11 = y2 - y1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		int var17 = (var15 >> 16) + var10;
		int var18 = (var16 >> 16) + var11;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var19 = arg5 * var16 >> 17;
		int var20 = arg5 * var16 + 1 >> 17;
		int var21 = arg5 * var15 >> 17;
		int var22 = arg5 * var15 + 1 >> 17;
		int var23 = x1 - var9.method1025();
		int var24 = y1 - var9.method1026();
		int var25 = var19 + var23;
		int var26 = var23 - var20;
		int var27 = var17 + var23 - var20;
		int var28 = var17 + var23 + var19;
		int var29 = var21 + var24;
		int var30 = var24 - var22;
		int var31 = var18 + var24 - var22;
		int var32 = var18 + var24 + var21;
		if (arg6 == 0) {
			var9.field935 = 0;
		} else if (arg6 == 1) {
			var9.field935 = 255 - (rgb >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method2219(false);
		var9.field936 = var25 < 0 || var25 > var9.field945 || var26 < 0 || var26 > var9.field945 || var27 < 0 || var27 > var9.field945;
		var9.drawTriangle(true, false, false, (float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, rgb);
		var9.field936 = var25 < 0 || var25 > var9.field945 || var27 < 0 || var27 > var9.field945 || var28 < 0 || var28 > var9.field945;
		var9.drawTriangle(true, false, false, (float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, rgb);
		this.method2219(true);
	}

	@ObfuscatedName("afg.cu(IIIIII)I")
	public int method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field9803.entries[10] * (float) arg2 + this.field9803.entries[6] * (float) arg1 + this.field9803.entries[2] * (float) arg0 + this.field9803.entries[14];
		float var9 = this.field9803.entries[10] * (float) arg5 + this.field9803.entries[6] * (float) arg4 + this.field9803.entries[2] * (float) arg3 + this.field9803.entries[14];
		float var10 = this.field9803.entries[11] * (float) arg2 + this.field9803.entries[7] * (float) arg1 + this.field9803.entries[3] * (float) arg0 + this.field9803.entries[15];
		float var11 = this.field9803.entries[11] * (float) arg5 + this.field9803.entries[7] * (float) arg4 + this.field9803.entries[3] * (float) arg3 + this.field9803.entries[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field9803.entries[8] * (float) arg2 + this.field9803.entries[4] * (float) arg1 + this.field9803.entries[0] * (float) arg0 + this.field9803.entries[12];
		float var13 = this.field9803.entries[8] * (float) arg5 + this.field9803.entries[4] * (float) arg4 + this.field9803.entries[0] * (float) arg3 + this.field9803.entries[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field9803.entries[9] * (float) arg2 + this.field9803.entries[5] * (float) arg1 + this.field9803.entries[1] * (float) arg0 + this.field9803.entries[13];
		float var15 = this.field9803.entries[9] * (float) arg5 + this.field9803.entries[5] * (float) arg4 + this.field9803.entries[1] * (float) arg3 + this.field9803.entries[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("afg.cn(IIIILou;Loj;)Z")
	public boolean pick(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, Cuboid arg5) {
		Matrix4x4 var7 = this.method2208();
		var7.setToMatrix4x3(arg4);
		var7.multiply(this.field9803);
		return arg5.pick(arg0, arg1, arg2, arg3, var7, this.field9814, this.field9806, this.field9789, this.field9802);
	}

	@ObfuscatedName("afg.cv(Lou;Led;Loj;)V")
	public void method2193(Matrix4x3 arg0, ScreenBoundingBox arg1, Cuboid arg2) {
		Matrix4x4 var4 = this.method2208();
		var4.setToMatrix4x3(arg0);
		var4.multiply(this.field9803);
		arg1.method2746(arg2, this.field9795, var4, this.field9814, this.field9806, this.field9789, this.field9802);
	}

	@ObfuscatedName("afg.cp(I)Lakz;")
	public Heap createHeap(int arg0) {
		return null;
	}

	@ObfuscatedName("afg.ca(Lakz;)V")
	public void setBufferHeap(Heap arg0) {
	}

	@ObfuscatedName("afg.cw(IIZZ)Lcm;")
	public Sprite createSprite(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new PureJavaSpriteAlpha(this, arg0, arg1) : new PureJavaSpriteNormal(this, arg0, arg1);
	}

	@ObfuscatedName("afg.ct([IIIIIZ)Lcm;")
	public Sprite createSprite(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = false;
		int var8 = arg1;
		for (int var9 = 0; var9 < arg4; var9++) {
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg0[var8++] >>> 24;
				if (var11 != 0 && var11 != 255) {
					var7 = true;
					return var7 ? new PureJavaSpriteAlpha(this, arg0, arg1, arg2, arg3, arg4, arg5) : new PureJavaSpriteNormal(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return var7 ? new PureJavaSpriteAlpha(this, arg0, arg1, arg2, arg3, arg4, arg5) : new PureJavaSpriteNormal(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("afg.co(Lde;Z)Lcm;")
	public Sprite createSprite(SpriteData arg0, boolean arg1) {
		int var3 = arg0.getWidth();
		int var4 = arg0.getHeight();
		PureJavaSprite var12;
		if (arg1 && !arg0.isTranslucent() && arg0.isPaletted()) {
			PalettedSpriteData var5 = (PalettedSpriteData) arg0;
			int[] var6 = new int[var5.palette.length];
			byte[] var7 = new byte[var3 * var4];
			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = var3 * var8;
				for (int var10 = 0; var10 < var3; var10++) {
					var7[var9 + var10] = var5.colour[var9 + var10];
				}
			}
			for (int var11 = 0; var11 < var5.palette.length; var11++) {
				var6[var11] = var5.palette[var11];
			}
			var12 = new PureJavaSpritePaletted(this, var7, var6, var3, var4);
		} else {
			int[] var13 = arg0.method2604(false);
			if (arg0.isTranslucent()) {
				var12 = new PureJavaSpriteAlpha(this, var13, var3, var4);
			} else {
				var12 = new PureJavaSpriteNormal(this, var13, var3, var4);
			}
		}
		var12.setPadding(arg0.getPaddingLeft(), arg0.getPaddingTop(), arg0.getPaddingRight(), arg0.getPaddingBottom());
		return var12;
	}

	@ObfuscatedName("afg.cr(IIIIZ)Lcm;")
	public Sprite method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.colour == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg2 * arg3];
		int var7 = this.sizeX * arg1 + arg0;
		int var8 = this.sizeX - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = arg2 * var9;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var10 + var11] = this.colour[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new PureJavaSpriteAlpha(this, var6, arg2, arg3);
		} else {
			return new PureJavaSpriteNormal(this, var6, arg2, arg3);
		}
	}

	@ObfuscatedName("afg.cb(II[I[I)Lch;")
	public SpriteRelated method2205(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new JavaGraphicsRelated3(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("afg.cs(ILch;II)V")
	public void method2206(int arg0, SpriteRelated arg1, int arg2, int arg3) {
		if (this.colour == null) {
			return;
		}
		JavaGraphicsRelated3 var5 = (JavaGraphicsRelated3) arg1;
		int[] var6 = var5.field9414;
		int[] var7 = var5.field9415;
		int var8;
		if (this.clipMaxY < var6.length + arg3) {
			var8 = this.clipMaxY - arg3;
		} else {
			var8 = var6.length;
		}
		int var9;
		if (this.clipMinY > arg3) {
			var9 = this.clipMinY - arg3;
			arg3 = this.clipMinY;
		} else {
			var9 = 0;
		}
		if (var8 - var9 <= 0) {
			return;
		}
		int var10 = this.sizeX * arg3;
		for (int var11 = var9; var11 < var8; var11++) {
			int var12 = var6[var11] + arg2;
			int var13 = var7[var11];
			if (this.clipMinX > var12) {
				var13 -= this.clipMinX - var12;
				var12 = this.clipMinX;
			}
			if (this.clipMaxX < var12 + var13) {
				var13 = this.clipMaxX - var12;
			}
			int var14 = var10 + var12;
			for (int var15 = -var13; var15 < 0; var15++) {
				this.colour[var14++] = arg0;
			}
			var10 += this.sizeX;
		}
	}

	@ObfuscatedName("afg.cy(Laac;Lde;Z)Leu;")
	public Font createFont(FontMetrics metrics, SpriteData sprite, boolean font) {
		boolean translucent = sprite.isTranslucent();
		boolean paletted = sprite.isPaletted();

		if (font) {
			if (paletted) {
				if (translucent) {
					return new PureJavaTranslucentFont(this, metrics, (PalettedSpriteData) sprite);
				} else {
					return new PureJavaOpaqueFont(this, metrics, (PalettedSpriteData) sprite);
				}
			}

			if (translucent) {
				return new PureJavaTranslucentFont(this, metrics, (FullSpriteData) sprite);
			} else {
				return new PureJavaOpaqueFont(this, metrics, (FullSpriteData) sprite);
			}
		}

		if (!paletted) {
			return new PureJavaFont1(this, metrics, (FullSpriteData) sprite);
		} else if (!translucent) {
			return new PureJavaFont2(this, metrics, (PalettedSpriteData) sprite);
		}

		throw new IllegalArgumentException("");
	}

	@ObfuscatedName("afg.ck(I)V")
	public void setVertexCapacity(int arg0) {
		PureJavaModel.field9547 = arg0;
		PureJavaModel.field9564 = arg0;
		if (this.threadLocalsCount > 1) {
			throw new IllegalStateException();
		}
		this.method15670(this.threadLocalsCount);
		this.method15722(0);
	}

	@ObfuscatedName("afg.cj(Ldq;IIII)Ldo;")
	public Model createModel(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
		return new PureJavaModel(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("afg.cd(II)I")
	public int method2394(int arg0, int arg1) {
		int var3 = arg0 | 0x20800;
		return var3 & arg1 ^ arg1;
	}

	@ObfuscatedName("afg.dd(II)I")
	public int method2213(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("afg.dr(II[[I[[IIII)Lcb;")
	public FloorModel createFloor(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new PureJavaFloorModel(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("afg.cc()Lpq;")
	public Matrix4x4 method2208() {
		PureJavaToolkitContext var1 = this.getContext(Thread.currentThread());
		return var1.field829;
	}

	@ObfuscatedName("afg.cz()Lou;")
	public Matrix4x3 method2209() {
		PureJavaToolkitContext var1 = this.getContext(Thread.currentThread());
		return var1.field836;
	}

	@ObfuscatedName("afg.df()I")
	public int getMaxLights() {
		return 0;
	}

	@ObfuscatedName("afg.dw(IIIIIF)Lakf;")
	public Light createLight(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return null;
	}

	@ObfuscatedName("afg.ds(I[Lakf;)V")
	public void setActiveLights(int arg0, Light[] arg1) {
	}

	@ObfuscatedName("afg.rn(I)V")
	public void method15722(int arg0) {
		this.context[arg0].setThread(Thread.currentThread());
	}

	@ObfuscatedName("afg.rb(I)V")
	public void method15670(int arg0) {
		this.threadLocalsCount = arg0;
		this.context = new PureJavaToolkitContext[this.threadLocalsCount];
		for (int var2 = 0; var2 < this.threadLocalsCount; var2++) {
			this.context[var2] = new PureJavaToolkitContext(this);
		}
	}

	@ObfuscatedName("afg.ru(Ljava/lang/Runnable;)Laz;")
	public PureJavaToolkitContext getContext(Runnable arg0) {
		for (int var2 = 0; var2 < this.threadLocalsCount; var2++) {
			if (this.context[var2].field824 == arg0) {
				return this.context[var2];
			}
		}
		return null;
	}

	@ObfuscatedName("afg.dt(Ldm;)V")
	public void drawParticles(ParticleList arg0) {
		this.drawParticles(this.colour != null, this.depth != null, false, arg0);
	}

	@ObfuscatedName("afg.sv(ZZZLdm;)V")
	public void drawParticles(boolean arg0, boolean arg1, boolean arg2, ParticleList arg3) {
		PureJavaToolkitContext var5 = this.getContext(Thread.currentThread());
		for (Particle var6 = (Particle) arg3.list.peekFront(); var6 != null; var6 = (Particle) arg3.list.prev()) {
			int var7 = var6.x >> 12;
			int var8 = var6.y >> 12;
			int var9 = var6.z >> 12;
			float var10 = this.field9803.entries[10] * (float) var9 + this.field9803.entries[2] * (float) var7 + this.field9803.entries[6] * (float) var8 + this.field9803.entries[14];
			float var11 = this.field9803.entries[11] * (float) var9 + this.field9803.entries[7] * (float) var8 + this.field9803.entries[3] * (float) var7 + this.field9803.entries[15];
			if (var10 < -var11) {
				continue;
			}

			float var12 = this.field9813 * var10 / var11 + this.field9799;
			if (var10 > var5.field865) {
				continue;
			}

			float var13 = this.field9803.entries[8] * (float) var9 + this.field9803.entries[4] * (float) var8 + this.field9803.entries[0] * (float) var7 + this.field9803.entries[12];
			float var14 = this.field9803.entries[9] * (float) var9 + this.field9803.entries[5] * (float) var8 + this.field9803.entries[1] * (float) var7 + this.field9803.entries[13];
			if (var13 < -var11 || var13 > var11 || var14 < -var11 || var14 > var11) {
				continue;
			}

			float var15 = (float) var6.field12162 / 4096.0F;
			float var16 = this.field9795.entries[0] * var15 + var13;
			float var17 = this.field9795.entries[3] * var15 + var11;
			float var18 = this.field9789 * var13 / var11 + this.field9814;
			float var19 = this.field9802 * var14 / var11 + this.field9806;
			float var20 = this.field9789 * var16 / var17 + this.field9814;
			this.drawParticle(arg0, arg1, arg2, var6, (int) var18, (int) var19, var12, (int) (var20 < var18 ? var18 - var20 : var20 - var18));
		}
	}

	@ObfuscatedName("afg.sw(ZZZLaqb;IIFI)V")
	public void drawParticle(boolean arg0, boolean arg1, boolean arg2, Particle arg3, int arg4, int arg5, float arg6, int arg7) {
		int var9 = arg3.field12160;
		int var11 = arg7 << 1;
		if (var9 == -1) {
			this.drawBillboard(arg1, arg4, arg5, arg6, arg7, arg3.field12158, 1);
			return;
		}
		if (this.cachedBillboardMaterial != var9) {
			Sprite var12 = (Sprite) this.billboardMaterialSprites.get((long) var9);
			if (var12 == null) {
				Material var13 = this.materialList.get(var9);
				int[] var14 = this.getMaterialTexture(var9);
				if (var14 == null) {
					return;
				}
				int var15 = var13.size;
				var12 = this.createSprite(var14, 0, var15, var15, var15);
				this.billboardMaterialSprites.put(var12, (long) var9);
			}
			this.cachedBillboardMaterial = var9;
			this.cachedBillboardSprite = var12;
		}
		var11++;
		((PureJavaSprite) this.cachedBillboardSprite).drawAsBillboard(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, var11, var11, 0, arg3.field12158, 1, 1, false);
	}

	@ObfuscatedName("afg.ss(ZZZIIFIISIII)V")
	public void method15686(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, short arg8, int arg9, int arg10, int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			Material var13 = this.materialList.get(arg8);
			if (!var13.highDetail) {
				if (this.cachedBillboardMaterial != arg8) {
					Sprite var14 = (Sprite) this.billboardMaterialSprites.get((long) arg8);
					if (var14 == null) {
						int[] var15 = this.getMaterialTexture(arg8);
						if (var15 == null) {
							return;
						}
						int var16 = var13.size;
						var14 = this.createSprite(var15, 0, var16, var16, var16);
						this.billboardMaterialSprites.put(var14, (long) arg8);
					}
					this.cachedBillboardMaterial = arg8;
					this.cachedBillboardSprite = var14;
				}
				((PureJavaSprite) this.cachedBillboardSprite).drawAsBillboard(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, 1, MaterialAlphaMode.MULTIPLY != var13.alphaMode);
				return;
			}
		}
		this.drawBillboard(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@ObfuscatedName("afg.sx(ZIIFIII)V")
	public void drawBillboard(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6) {
		if (this.colour == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		int var8 = arg2 - arg4;
		if (var8 < this.clipMinY) {
			var8 = this.clipMinY;
		}
		int var9 = arg2 + arg4 + 1;
		if (var9 > this.clipMaxY) {
			var9 = this.clipMaxY;
		}
		int var10 = var8;
		int var11 = arg4 * arg4;
		int var12 = 0;
		int var13 = arg2 - var8;
		int var14 = var13 * var13;
		int var15 = var14 - var13;
		if (arg2 > var9) {
			arg2 = var9;
		}
		int var16 = arg5 >>> 24;
		if (arg6 == 0 || arg6 == 1 && var16 == 255) {
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				int var57 = arg1 - var12 + 1;
				if (var57 < this.clipMinX) {
					var57 = this.clipMinX;
				}
				int var58 = arg1 + var12;
				if (var58 > this.clipMaxX) {
					var58 = this.clipMaxX;
				}
				int var59 = this.sizeX * var10 + var57;
				for (int var60 = var57; var60 < var58; var60++) {
					if (!arg0 || arg3 < this.depth[var59]) {
						this.colour[var59] = arg5;
					}
					var59++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			int var61 = arg4;
			int var62 = var10 - arg2;
			int var63 = var62 * var62 + var11;
			int var64 = var63 - arg4;
			int var65 = var63 - var62;
			while (var10 < var9) {
				while (var65 > var11 && var64 > var11) {
					var65 -= var61-- + var61;
					var64 -= var61 + var61;
				}
				int var66 = arg1 - var61;
				if (var66 < this.clipMinX) {
					var66 = this.clipMinX;
				}
				int var67 = arg1 + var61;
				if (var67 > this.clipMaxX - 1) {
					var67 = this.clipMaxX - 1;
				}
				int var68 = this.sizeX * var10 + var66;
				for (int var69 = var66; var69 <= var67; var69++) {
					if (!arg0 || arg3 < this.depth[var68]) {
						this.colour[var68] = arg5;
					}
					var68++;
				}
				var10++;
				var65 += var62 + var62;
				var64 += var62++ + var62;
			}
			return;
		} else if (arg6 == 1) {
			int var17 = (var16 << 24) + ((arg5 & 0xFF00) * var16 >> 8 & 0xFF00) + ((arg5 & 0xFF00FF) * var16 >> 8 & 0xFF00FF);
			int var18 = 256 - var16;
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				int var19 = arg1 - var12 + 1;
				if (var19 < this.clipMinX) {
					var19 = this.clipMinX;
				}
				int var20 = arg1 + var12;
				if (var20 > this.clipMaxX) {
					var20 = this.clipMaxX;
				}
				int var21 = this.sizeX * var10 + var19;
				for (int var22 = var19; var22 < var20; var22++) {
					if (!arg0 || arg3 < this.depth[var21]) {
						int var23 = this.colour[var21];
						int var24 = ((var23 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var23 & 0xFF00) * var18 >> 8 & 0xFF00);
						this.colour[var21] = var17 + var24;
					}
					var21++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			int var25 = arg4;
			int var26 = -var13;
			int var27 = var26 * var26 + var11;
			int var28 = var27 - arg4;
			int var29 = var27 - var26;
			while (var10 < var9) {
				while (var29 > var11 && var28 > var11) {
					var29 -= var25-- + var25;
					var28 -= var25 + var25;
				}
				int var30 = arg1 - var25;
				if (var30 < this.clipMinX) {
					var30 = this.clipMinX;
				}
				int var31 = arg1 + var25;
				if (var31 > this.clipMaxX - 1) {
					var31 = this.clipMaxX - 1;
				}
				int var32 = this.sizeX * var10 + var30;
				for (int var33 = var30; var33 <= var31; var33++) {
					if (!arg0 || arg3 < this.depth[var32]) {
						int var34 = this.colour[var32];
						int var35 = ((var34 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var18 >> 8 & 0xFF00FF);
						this.colour[var32] = var17 + var35;
					}
					var32++;
				}
				var10++;
				var29 += var26 + var26;
				var28 += var26++ + var26;
			}
		} else if (arg6 == 2) {
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				int var36 = arg1 - var12 + 1;
				if (var36 < this.clipMinX) {
					var36 = this.clipMinX;
				}
				int var37 = arg1 + var12;
				if (var37 > this.clipMaxX) {
					var37 = this.clipMaxX;
				}
				int var38 = this.sizeX * var10 + var36;
				for (int var39 = var36; var39 < var37; var39++) {
					if (!arg0 || arg3 < this.depth[var38]) {
						int var40 = this.colour[var38];
						int var41 = arg5 + var40;
						int var42 = (arg5 & 0xFF00FF) + (var40 & 0xFF00FF);
						int var43 = (var41 - var42 & 0x10000) + (var42 & 0x1000100);
						this.colour[var38] = var41 - var43 | var43 - (var43 >>> 8);
					}
					var38++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			int var44 = arg4;
			int var45 = -var13;
			int var46 = var45 * var45 + var11;
			int var47 = var46 - arg4;
			int var48 = var46 - var45;
			while (var10 < var9) {
				while (var48 > var11 && var47 > var11) {
					var48 -= var44-- + var44;
					var47 -= var44 + var44;
				}
				int var49 = arg1 - var44;
				if (var49 < this.clipMinX) {
					var49 = this.clipMinX;
				}
				int var50 = arg1 + var44;
				if (var50 > this.clipMaxX - 1) {
					var50 = this.clipMaxX - 1;
				}
				int var51 = this.sizeX * var10 + var49;
				for (int var52 = var49; var52 <= var50; var52++) {
					if (!arg0 || arg3 < this.depth[var51]) {
						int var53 = this.colour[var51];
						int var54 = arg5 + var53;
						int var55 = (arg5 & 0xFF00FF) + (var53 & 0xFF00FF);
						int var56 = (var54 - var55 & 0x10000) + (var55 & 0x1000100);
						this.colour[var51] = var54 - var56 | var56 - (var56 >>> 8);
					}
					var51++;
				}
				var10++;
				var48 += var45 + var45;
				var47 += var45++ + var45;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afg.do(Lou;)V")
	public void method2217(Matrix4x3 arg0) {
		this.field9792 = arg0;
		this.method15683();
	}

	@ObfuscatedName("afg.dz()Lou;")
	public Matrix4x3 method2218() {
		return new Matrix4x3(this.field9792);
	}

	@ObfuscatedName("afg.dm(Lpq;)V")
	public void method2220(Matrix4x4 arg0) {
		this.field9795.setTo(arg0);
		this.method15683();
	}

	@ObfuscatedName("afg.dq()Lpq;")
	public Matrix4x4 method2355() {
		return new Matrix4x4(this.field9795);
	}

	@ObfuscatedName("afg.dc(F)V")
	public void setSunAmbientIntensity(float arg0) {
		this.field9791 = (int) (arg0 * 65535.0F);
	}

	@ObfuscatedName("afg.di(IFFFFF)V")
	public void setSun(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field9783 = (int) (arg1 * 65535.0F);
		this.field9790 = (int) (arg2 * 65535.0F);
		float var7 = (float) Math.sqrt(arg5 * arg5 + arg3 * arg3 + arg4 * arg4);
		this.field9804 = (int) (arg3 * 65535.0F / var7);
		this.field9787 = (int) (arg4 * 65535.0F / var7);
		this.field9788 = (int) (arg5 * 65535.0F / var7);
	}

	@ObfuscatedName("afg.dk(I)V")
	public void method2224(int arg0) {
	}

	@ObfuscatedName("afg.dn(III)V")
	public void setFog(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.context.length; var4++) {
			PureJavaToolkitContext var5 = this.context[var4];
			var5.fadeColour = arg0 & 0xFFFFFF;
			int var6 = var5.fadeColour >>> 16 & 0xFF;
			if (var6 < 2) {
				var6 = 2;
			}
			int var7 = var5.fadeColour >> 8 & 0xFF;
			if (var7 < 2) {
				var7 = 2;
			}
			int var8 = var5.fadeColour & 0xFF;
			if (var8 < 2) {
				var8 = 2;
			}
			var5.fadeColour = var6 << 16 | var7 << 8 | var8;
			if (arg1 < 0) {
				var5.field826 = false;
			} else {
				var5.field826 = true;
			}
		}
	}

	@ObfuscatedName("afg.sm()V")
	public void method15683() {
		this.field9793.setToMatrix4x3(this.field9792);
		this.field9803.setTo(this.field9793);
		this.field9803.multiply(this.field9795);
		this.field9803.method6607(this.field9796[0]);
		this.field9803.method6643(this.field9796[1]);
		this.field9803.method6625(this.field9796[2]);
		this.field9803.method6626(this.field9796[3]);
		this.field9803.method6627(this.field9796[4]);
		this.field9803.method6628(this.field9796[5]);
		float var1 = this.field9795.method6632();
		float var2 = (var1 - 255.0F) * this.field9795.entries[10] + this.field9795.entries[14];
		float var3 = this.field9795.entries[10] * var1 + this.field9795.entries[14];
		float var4 = var3 - var2;
		for (int var5 = 0; var5 < this.threadLocalsCount; var5++) {
			PureJavaToolkitContext var6 = this.context[var5];
			var6.field865 = var2;
			var6.field855 = var4;
		}
	}

	@ObfuscatedName("afg.du(I)Ldz;")
	public EnvironmentSampler createEnvironmentSampler(int arg0) {
		return null;
	}

	@ObfuscatedName("afg.dl(Ldz;Ldz;FLdz;)Ldz;")
	public EnvironmentSampler method2435(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
		return null;
	}

	@ObfuscatedName("afg.dp(Ldz;)V")
	public void setEnvironmentSampler(EnvironmentSampler arg0) {
	}

	@ObfuscatedName("afg.dy(IIII)V")
	public void method2172(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("afg.db(II)V")
	public void method2233(int arg0, int arg1) {
	}

	@ObfuscatedName("afg.dh()Z")
	public boolean method2234() {
		return false;
	}

	@ObfuscatedName("afg.dx()Z")
	public boolean isLevelsEnabled() {
		return false;
	}

	@ObfuscatedName("afg.dg(FFFFF)V")
	public void setLevels(float arg0, float arg1, float arg2, float arg3, float arg4) {
	}

	@ObfuscatedName("afg.de([I)Lcj;")
	public ColourRemapper createColourRemapper(int[] arg0) {
		return null;
	}

	@ObfuscatedName("afg.dj()Z")
	public boolean method2238() {
		return false;
	}

	@ObfuscatedName("afg.eo(Lcj;FLcj;FLcj;F)V")
	public void setColourRemapping(ColourRemapper arg0, float arg1, ColourRemapper arg2, float arg3, ColourRemapper arg4, float arg5) {
	}

	@ObfuscatedName("afg.ey()Z")
	public boolean enableBloom() {
		return false;
	}

	@ObfuscatedName("afg.eu()V")
	public void disableBloom() {
	}

	@ObfuscatedName("afg.ed()Z")
	public boolean isBloomEnabled() {
		return false;
	}

	@ObfuscatedName("afg.es(FFFFFF)V")
	public void setBloom(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("afg.ei(ILdy;)V")
	public void method2245(int arg0, WaterFogData arg1) {
		for (int var3 = 0; var3 < this.context.length; var3++) {
			this.context[var3].field823 = this.context[var3].fadeColour;
			this.context[var3].field832 = arg0;
			this.context[var3].fadeColour = arg1.colour;
			this.context[var3].field861 = arg1.scale;
			this.context[var3].field867 = true;
		}
	}

	@ObfuscatedName("afg.el(ILdy;)V")
	public void setWaterFog(int arg0, WaterFogData arg1) {
		PureJavaToolkitContext var3 = this.getContext(Thread.currentThread());
		var3.field832 = arg0;
		var3.fadeColour = arg1.colour;
		var3.field861 = arg1.scale;
	}

	@ObfuscatedName("afg.ej()V")
	public void method2247() {
		for (int var1 = 0; var1 < this.context.length; var1++) {
			this.context[var1].fadeColour = this.context[var1].field823;
			this.context[var1].field867 = false;
		}
	}

	@ObfuscatedName("afg.br(IIFIIFIIFIIII)V")
	public void method2552(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		boolean var14 = this.colour != null;
		boolean var15 = this.depth != null;
		if (!var14 && !var15) {
			return;
		}
		PureJavaToolkitContext var16 = this.getContext(Thread.currentThread());
		PureJavaRasteriser var17 = var16.rasteriser;
		var17.field933 = false;
		int var18 = arg0 - this.clipMinX;
		int var19 = arg3 - this.clipMinX;
		int var20 = arg6 - this.clipMinX;
		int var21 = arg1 - this.clipMinY;
		int var22 = arg4 - this.clipMinY;
		int var23 = arg7 - this.clipMinY;
		var17.field936 = var18 < 0 || var18 > var17.field945 || var19 < 0 || var19 > var17.field945 || var20 < 0 || var20 > var17.field945;
		int var24 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && var24 == 255) {
			var17.field935 = 0;
			var17.field968 = false;
			var17.drawTriangle(var14, var15, false, (float) var21, (float) var22, (float) var23, (float) var18, (float) var19, (float) var20, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			var17.field935 = 255 - var24;
			var17.field968 = false;
			var17.drawTriangle(var14, var15, false, (float) var21, (float) var22, (float) var23, (float) var18, (float) var19, (float) var20, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			var17.field935 = 128;
			var17.field968 = true;
			var17.drawTriangle(var14, var15, false, (float) var21, (float) var22, (float) var23, (float) var18, (float) var19, (float) var20, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		var17.field933 = true;
	}

	@ObfuscatedName("afg.ev(FFF[F)V")
	public void method2525(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field9803.entries[11] * arg2 + this.field9803.entries[7] * arg1 + this.field9803.entries[3] * arg0 + this.field9803.entries[15];
		float var6 = this.field9803.entries[8] * arg2 + this.field9803.entries[4] * arg1 + this.field9803.entries[0] * arg0 + this.field9803.entries[12];
		float var7 = this.field9803.entries[9] * arg2 + this.field9803.entries[5] * arg1 + this.field9803.entries[1] * arg0 + this.field9803.entries[13];
		float var8 = this.field9793.entries[10] * arg2 + this.field9793.entries[6] * arg1 + this.field9793.entries[2] * arg0 + this.field9793.entries[14];
		arg3[0] = this.field9789 * var6 / var5 + this.field9814;
		arg3[1] = this.field9802 * var7 / var5 + this.field9806;
		arg3[2] = var8;
	}

	@ObfuscatedName("afg.ep(FFF[F)V")
	public void method2507(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field9803.entries[10] * arg2 + this.field9803.entries[6] * arg1 + this.field9803.entries[2] * arg0 + this.field9803.entries[14];
		float var6 = this.field9803.entries[11] * arg2 + this.field9803.entries[7] * arg1 + this.field9803.entries[3] * arg0 + this.field9803.entries[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field9803.entries[8] * arg2 + this.field9803.entries[4] * arg1 + this.field9803.entries[0] * arg0 + this.field9803.entries[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field9803.entries[9] * arg2 + this.field9803.entries[5] * arg1 + this.field9803.entries[1] * arg0 + this.field9803.entries[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field9793.entries[10] * arg2 + this.field9793.entries[6] * arg1 + this.field9793.entries[2] * arg0 + this.field9793.entries[14];
			arg3[0] = this.field9789 * var7 / var6 + this.field9814;
			arg3[1] = this.field9802 * var8 / var6 + this.field9806;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("afg.am()Lafq;")
	public FrameBuffer createFramebuffer() {
		return new PureJavaFrameBuffer(this);
	}

	@ObfuscatedName("afg.sk(II)Ldp;")
	public GraphicsDeletable method15676(int arg0, int arg1) {
		return new PureJavaColorBuffer(arg0, arg1);
	}

	@ObfuscatedName("afg.au(IILck;Ldg;I)Ldp;")
	public GraphicsDeletable method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
		return this.method15676(arg0, arg1);
	}

	@ObfuscatedName("afg.ar(II)Ldw;")
	public EffectInterface method2121(int arg0, int arg1) {
		return new PureJavaDepthBuffer(arg0, arg1);
	}

	@ObfuscatedName("afg.ap(III)Ldw;")
	public EffectInterface method2356(int arg0, int arg1, int arg2) {
		return new PureJavaDepthBuffer(arg0, arg1);
	}
}
