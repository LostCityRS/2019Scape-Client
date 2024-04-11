package com.jagex.graphics;

import com.jagex.core.datastruct.Heap;
import com.jagex.game.client.DataType;
import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.dx.DxToolkitFactory;
import com.jagex.graphics.glx.GlxRendererFactory;
import com.jagex.graphics.gl.GlToolkitFactory;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.safe.PureJavaToolkitFactory;
import com.jagex.js5.Js5;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

@ObfuscatedName("dh")
public abstract class Toolkit {

	@ObfuscatedName("dh.l")
	public static boolean[] field1594 = new boolean[8];

	@ObfuscatedName("dh.u")
	public final int field1595;

	@ObfuscatedName("dh.z")
	public final TextureList field1596;

	@ObfuscatedName("dh.p")
	public final MaterialList materialList;

	@ObfuscatedName("dh.d")
	public final BillboardTypeList billboardList;

	@ObfuscatedName("dh.c")
	public final ParticleEmitterTypeList emitterTypeList;

	@ObfuscatedName("dh.g")
	public int field1616 = -1;

	@ObfuscatedName("dh.i")
	public RenderTarget renderTarget;

	@ObfuscatedName("dh.j")
	public Surface surface;

	@ObfuscatedName("dh.t")
	public Hashtable field1613 = new Hashtable();

	@ObfuscatedName("dh.ae")
	public final FrameBuffer[] field1620 = new FrameBuffer[4];

	@ObfuscatedName("dh.ag")
	public int field1615;

	@ObfuscatedName("dh.ah")
	public int field1588;

	@ObfuscatedName("dh.al")
	public int field1611;

	@ObfuscatedName("dh.ac")
	public int field1618;

	@ObfuscatedName("dh.ai")
	public int field1619;

	@ObfuscatedName("dh.aw")
	public int field1610 = 0;

	@ObfuscatedName("dh.as")
	public float field1602 = 0.0F;

	@ObfuscatedName("aac.e(ILjava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;II)Ldh;")
	public static Toolkit create(int arg0, Canvas arg1, MaterialList arg2, TextureList arg3, BillboardTypeList arg4, ParticleEmitterTypeList arg5, ParticleEffectorTypeList arg6, Js5 arg7, int arg8) {
		int var9 = 0;
		int var10 = 0;
		if (arg1 != null) {
			Dimension var11 = arg1.getSize();
			var9 = var11.width;
			var10 = var11.height;
		}
		return create(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var9, var10);
	}

	@ObfuscatedName("dh.n(ILjava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;IIII)Ldh;")
	public static synchronized Toolkit create(int arg0, Canvas arg1, MaterialList arg2, TextureList arg3, BillboardTypeList arg4, ParticleEmitterTypeList arg5, ParticleEffectorTypeList arg6, Js5 arg7, int arg8, int arg9, int arg10) {
		if (arg0 == 0) {
			return PureJavaToolkitFactory.create(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10);
		} else if (arg0 == 1) {
			return GlToolkitFactory.create(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return GlxRendererFactory.create(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return DxToolkitFactory.create(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("ai.m(II)Z")
	public static boolean method723(int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@ObfuscatedName("q.k(II)Z")
	public static boolean method551(int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	public Toolkit(MaterialList arg0, TextureList arg1, BillboardTypeList arg2, ParticleEmitterTypeList arg3, ParticleEffectorTypeList arg4) {
		this.materialList = arg0;
		this.field1596 = arg1;
		this.billboardList = arg2;
		this.emitterTypeList = arg3;
		int var6 = -1;
		for (int var7 = 0; var7 < 8; var7++) {
			if (!field1594[var7]) {
				field1594[var7] = true;
				var6 = var7;
				break;
			}
		}
		if (var6 == -1) {
			throw new IllegalStateException("");
		}
		this.field1595 = var6;
	}

	@ObfuscatedName("dh.w(I)V")
	public final void method2115() throws RendererException {
		this.method2116(0, 0);
	}

	@ObfuscatedName("dh.z(I)V")
	public void dispose() {
		field1594[this.field1595] = false;
		Enumeration var1 = this.field1613.keys();
		while (var1.hasMoreElements()) {
			Canvas var2 = (Canvas) var1.nextElement();
			Surface var3 = (Surface) this.field1613.get(var2);
			var3.method1629();
		}
		this.method2369();
	}

	public void finalize() {
		this.dispose();
	}

	@ObfuscatedName("nw.j(Ljava/awt/Canvas;I)V")
	public static void setIgnoreRepaint(Canvas arg0) {
		try {
			Class var1 = Class.forName("java.awt.Canvas");
			Method var2 = var1.getMethod("setIgnoreRepaint", Boolean.TYPE);
			var2.invoke(arg0, Boolean.TRUE);
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("dh.t([I)V")
	public void method2134(int[] arg0) {
		if (this.surface == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.surface.getWidth();
			arg0[1] = this.surface.getHeight();
		}
	}

	@ObfuscatedName("dh.ae(B)Ldr;")
	public final RenderTarget getRenderTarget() {
		return this.renderTarget;
	}

	@ObfuscatedName("dh.ag(I)Lafy;")
	public final Surface getSurface() {
		return this.surface;
	}

	@ObfuscatedName("dh.ah(Ljava/awt/Canvas;III)V")
	public final void method2178(Canvas arg0, int arg1, int arg2) {
		if (!this.field1613.containsKey(arg0)) {
			setIgnoreRepaint(arg0);
			this.method2138(arg0, this.createSurface(arg0, arg1, arg2));
		}
	}

	@ObfuscatedName("dh.al(Ljava/awt/Canvas;Lafy;B)V")
	public final void method2138(Canvas arg0, Surface arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.field1613.put(arg0, arg1);
	}

	@ObfuscatedName("dh.ac(Ljava/awt/Canvas;I)V")
	public final void method2192(Canvas arg0) {
		if (this.field1613.containsKey(arg0)) {
			Surface var2 = (Surface) this.field1613.get(arg0);
			var2.method1629();
			this.field1613.remove(arg0);
		}
	}

	@ObfuscatedName("dh.ai(Ljava/awt/Canvas;B)V")
	public final void method2140(Canvas arg0) {
		Surface var2 = (Surface) this.field1613.get(arg0);
		if (var2 == null) {
			throw new RuntimeException();
		} else if (this.field1616 <= 0 && this.surface == this.renderTarget) {
			if (this.renderTarget != null) {
				this.renderTarget.method1631();
			}
			if (this.field1616 < 0) {
				this.renderTarget = var2;
			}
			this.surface = var2;
			var2.method1630();
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("dh.aw(Ljava/awt/Canvas;III)V")
	public final void method2216(Canvas arg0, int arg1, int arg2) {
		Surface var4 = (Surface) this.field1613.get(arg0);
		if (var4 == null) {
			throw new RuntimeException("");
		}
		var4.onResize(arg1, arg2);
	}

	@ObfuscatedName("dh.as(Lafq;B)V")
	public final void method2142(FrameBuffer arg0) {
		if (this.field1616 >= 3) {
			throw new RuntimeException();
		}
		if (this.field1616 >= 0) {
			this.field1620[this.field1616].method1631();
		} else {
			this.surface.method1631();
		}
		this.renderTarget = this.field1620[++this.field1616] = arg0;
		arg0.method1630();
	}

	@ObfuscatedName("dh.at(Lafq;I)V")
	public final void method2143(FrameBuffer arg0) {
		if (this.field1616 < 0 || this.field1620[this.field1616] != arg0) {
			throw new RuntimeException();
		}
		this.field1620[--this.field1616 + 1] = null;
		arg0.method1631();
		if (this.field1616 >= 0) {
			this.renderTarget = this.field1620[this.field1616];
			this.field1620[this.field1616].method1630();
		} else {
			this.renderTarget = this.surface;
			this.surface.method1630();
		}
	}

	@ObfuscatedName("dh.bf(IIB)V")
	public void method2419(int arg0, int arg1) {
		this.field1615 = arg0;
		this.field1588 = arg1;
		float var3 = (float) this.renderTarget.getWidth() / (float) this.renderTarget.getHeight();
		float var4 = (float) this.field1615 / (float) this.field1588;
		if (var3 < var4) {
			this.field1619 = (int) ((float) this.field1588 * var3);
			this.field1610 = this.field1588;
		} else {
			this.field1619 = this.field1615;
			this.field1610 = (int) ((float) this.field1615 / var3);
		}
		this.field1602 = (float) this.field1619 / (float) this.renderTarget.getWidth();
		this.field1611 = (this.field1615 - this.field1619) / 2;
		this.field1618 = (this.field1588 - this.field1610) / 2;
	}

	@ObfuscatedName("dh.bt(Z)V")
	public void method2170(boolean arg0) {
	}

	@ObfuscatedName("dh.bb(IIIIII)V")
	public final void drawRectangle(int x, int y, int width, int height, int rgb) {
		this.drawRectangle(x, y, width, height, rgb, 1);
	}

	@ObfuscatedName("dh.be(IIIIIB)V")
	public final void fillRectangle(int x, int y, int width, int height, int rgb) {
		this.fillRectangle(x, y, width, height, rgb, 1);
	}

	@ObfuscatedName("dh.by(IIIII)V")
	public final void method2175(int arg0, int arg1, int arg2, int arg3) {
		this.method2182(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("dh.bu(IIIIB)V")
	public final void drawHorizontalLine(int x, int y, int width, int rgb) {
		this.drawHorizontalLine(x, y, width, rgb, 1);
	}

	@ObfuscatedName("dh.bw(IIIII)V")
	public final void drawVerticalLine(int x, int y, int height, int rgb) {
		this.drawVerticalLine(x, y, height, rgb, 1);
	}

	@ObfuscatedName("dh.bo(IIIIII)V")
	public final void drawLine(int x1, int y1, int x2, int y2, int rgb) {
		this.drawLine(x1, y1, x2, y2, rgb, 1);
	}

	@ObfuscatedName("dh.ci(IILou;Loj;I)Z")
	public boolean pick(int arg0, int arg1, Matrix4x3 arg2, Cuboid arg3) {
		return this.pick(arg0, arg1, 0, 0, arg2, arg3);
	}

	@ObfuscatedName("dh.cx(IIZI)Lcm;")
	public Sprite createSprite(int arg0, int arg1, boolean arg2) {
		return this.createSprite(arg0, arg1, arg2, false);
	}

	@ObfuscatedName("dh.cf([IIIIII)Lcm;")
	public Sprite createSprite(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		return this.createSprite(arg0, arg1, arg2, arg3, arg4, true);
	}

	@ObfuscatedName("dh.cm()V")
	public void flush() {
	}

	@ObfuscatedName("dh.cq()V")
	public void method2203() {
	}

	@ObfuscatedName("dh.ch()V")
	public void method2204() {
	}

	@ObfuscatedName("dh.da(I)Z")
	public boolean method2215() {
		return true;
	}

	@ObfuscatedName("dh.dw(IIIIIF)Lakf;")
	public Light createLight(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return new Light(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("dh.ee(FFFI)V")
	public void setBloom(float arg0, float arg1, float arg2) {
		this.setBloom(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("dh.ec(IIII[IIII)[I")
	public int[] method2250(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int[] var8 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (int var9 = 0; var9 < arg3; var9++) {
			if (var9 >= arg1) {
				int var14 = (arg1 - 1) * arg2;
				for (int var15 = 0; var15 < arg2; var15++) {
					var8[arg2 * var9 + var15] = var8[var14 + var15];
				}
			} else {
				int var10 = arg6 * var9 + arg5;
				for (int var11 = 0; var11 < arg0; var11++) {
					var8[arg2 * var9 + var11] = arg4[var10 + var11];
				}
				int var12 = arg4[arg0 - 1 + var10];
				for (int var13 = arg0; var13 < arg2; var13++) {
					var8[arg2 * var9 + var13] = var12;
				}
			}
		}
		return var8;
	}

	@ObfuscatedName("dh.ek(IIII[FIIII)[F")
	public float[] method2230(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7) {
		float[] var9 = new float[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			if (var10 < arg1) {
				int var11 = arg6 * var10 + arg5;
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
					}
				}
				float[] var14 = new float[arg7];
				for (int var15 = 0; var15 < arg7; var15++) {
					var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
				}
				for (int var16 = arg0; var16 < arg2; var16++) {
					for (int var17 = 0; var17 < arg7; var17++) {
						var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
					}
				}
			} else {
				int var18 = (arg1 - 1) * arg2 * arg7;
				for (int var19 = 0; var19 < arg2; var19++) {
					for (int var20 = 0; var20 < arg7; var20++) {
						var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("dh.em(IIII[BIIII)[B")
	public byte[] method2256(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
		byte[] var9 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			if (var10 < arg1) {
				int var11 = arg6 * var10 + arg5;
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
					}
				}
				byte[] var14 = new byte[arg7];
				for (int var15 = 0; var15 < arg7; var15++) {
					var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
				}
				for (int var16 = arg0; var16 < arg2; var16++) {
					for (int var17 = 0; var17 < arg7; var17++) {
						var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
					}
				}
			} else {
				int var18 = (arg1 - 1) * arg2 * arg7;
				for (int var19 = 0; var19 < arg2; var19++) {
					for (int var20 = 0; var20 < arg7; var20++) {
						var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("dh.df()I")
	public abstract int getMaxLights();

	@ObfuscatedName("dh.l(II)V")
	public abstract void method2116(int arg0, int arg1) throws RendererException;

	@ObfuscatedName("dh.u()V")
	public abstract void method2117();

	@ObfuscatedName("dh.d(I)V")
	public abstract void cycle(int arg0);

	@ObfuscatedName("dh.ar(II)Ldw;")
	public abstract EffectInterface method2121(int arg0, int arg1);

	@ObfuscatedName("dh.v()Z")
	public abstract boolean method2123();

	@ObfuscatedName("dh.o()Z")
	public abstract boolean method2124();

	@ObfuscatedName("dh.s()Z")
	public abstract boolean supportsHardShadows();

	@ObfuscatedName("dh.bl()V")
	public abstract void method2126();

	@ObfuscatedName("dh.q()Z")
	public abstract boolean method2127();

	@ObfuscatedName("dh.cn(IIIILou;Loj;)Z")
	public abstract boolean pick(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, Cuboid arg5);

	@ObfuscatedName("dh.b()Z")
	public abstract boolean method2129();

	@ObfuscatedName("dh.h()Z")
	public abstract boolean hasExtraDrawDistance();

	@ObfuscatedName("dh.g()Ljava/lang/String;")
	public abstract String hardwareInfo();

	@ObfuscatedName("dh.bp(IIIII)V")
	public abstract void drawVerticalLine(int x1, int y1, int x2, int y2, int arg4);

	@ObfuscatedName("dh.x()Z")
	public abstract boolean supportsAntiAliasing();

	@ObfuscatedName("dh.ad(Ljava/awt/Canvas;II)Lafy;")
	public abstract Surface createSurface(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("dh.am()Lafq;")
	public abstract FrameBuffer createFramebuffer();

	@ObfuscatedName("dh.au(IILck;Ldg;I)Ldp;")
	public abstract GraphicsDeletable method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4);

	@ObfuscatedName("dh.aq(IIII)[I")
	public abstract int[] method2149(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.ax()V")
	public abstract void method2150();

	@ObfuscatedName("dh.dx()Z")
	public abstract boolean isLevelsEnabled();

	@ObfuscatedName("dh.aj()Z")
	public abstract boolean method2153();

	@ObfuscatedName("dh.az()V")
	public abstract void method2156();

	@ObfuscatedName("dh.af(II)J")
	public abstract long method2158(int arg0, int arg1);

	@ObfuscatedName("dh.ak(J)V")
	public abstract void method2159(long arg0);

	@ObfuscatedName("dh.an(II[I[I)V")
	public abstract void method2160(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("dh.bn(IIII)V")
	public abstract void setBounds(int left, int top, int right, int bottom);

	@ObfuscatedName("dh.aa(III)V")
	public abstract void method2163(int arg0, int arg1, int arg2);

	@ObfuscatedName("dh.bh(IIII)V")
	public abstract void method2164(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.bc()V")
	public abstract void resetClip();

	@ObfuscatedName("dh.bi(IIII)V")
	public abstract void resetBounds(int left, int top, int right, int bottom);

	@ObfuscatedName("dh.bq([I)V")
	public abstract void method2171(int[] arg0);

	@ObfuscatedName("dh.dy(IIII)V")
	public abstract void method2172(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.bz(IIIIII)V")
	public abstract void drawRectangle(int x, int y, int width, int height, int rgb, int arg5);

	@ObfuscatedName("dh.bg(IIIII)V")
	public abstract void method2182(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("dh.bs(IIIIIILch;II)V")
	public abstract void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8);

	@ObfuscatedName("dh.bj(IIIIII)V")
	public abstract void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5);

	@ObfuscatedName("dh.cl(IIIIIIIII)V")
	public abstract void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("dh.ct([IIIIIZ)Lcm;")
	public abstract Sprite createSprite(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("dh.ce(IIIIIII)V")
	public abstract void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5, int arg6);

	@ObfuscatedName("dh.cv(Lou;Led;Loj;)V")
	public abstract void method2193(Matrix4x3 arg0, ScreenBoundingBox arg1, Cuboid arg2);

	@ObfuscatedName("dh.r()Z")
	public abstract boolean method2194();

	@ObfuscatedName("dh.ca(Lakz;)V")
	public abstract void setBufferHeap(Heap arg0);

	@ObfuscatedName("dh.ao()Z")
	public abstract boolean method2196();

	@ObfuscatedName("dh.cw(IIZZ)Lcm;")
	public abstract Sprite createSprite(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("dh.dt(Ldm;)V")
	public abstract void drawParticles(ParticleList arg0);

	@ObfuscatedName("dh.co(Lde;Z)Lcm;")
	public abstract Sprite createSprite(SpriteData arg0, boolean arg1);

	@ObfuscatedName("dh.cb(II[I[I)Lch;")
	public abstract SpriteRelated method2205(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("dh.cs(ILch;II)V")
	public abstract void method2206(int arg0, SpriteRelated arg1, int arg2, int arg3);

	@ObfuscatedName("dh.cy(Laac;Lde;Z)Leu;")
	public abstract Font createFont(FontMetrics arg0, SpriteData arg1, boolean arg2);

	@ObfuscatedName("dh.cc()Lpq;")
	public abstract Matrix4x4 method2208();

	@ObfuscatedName("dh.cz()Lou;")
	public abstract Matrix4x3 method2209();

	@ObfuscatedName("dh.cj(Ldq;IIII)Ldo;")
	public abstract Model createModel(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("dh.dd(II)I")
	public abstract int method2213(int arg0, int arg1);

	@ObfuscatedName("dh.dr(II[[I[[IIII)Lcb;")
	public abstract FloorModel createFloor(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("dh.do(Lou;)V")
	public abstract void method2217(Matrix4x3 arg0);

	@ObfuscatedName("dh.dz()Lou;")
	public abstract Matrix4x3 method2218();

	@ObfuscatedName("dh.dv(Z)V")
	public abstract void method2219(boolean arg0);

	@ObfuscatedName("dh.dm(Lpq;)V")
	public abstract void method2220(Matrix4x4 arg0);

	@ObfuscatedName("dh.cp(I)Lakz;")
	public abstract Heap createHeap(int arg0);

	@ObfuscatedName("dh.dc(F)V")
	public abstract void setSunAmbientIntensity(float arg0);

	@ObfuscatedName("dh.di(IFFFFF)V")
	public abstract void setSun(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("dh.dk(I)V")
	public abstract void method2224(int arg0);

	@ObfuscatedName("dh.du(I)Ldz;")
	public abstract EnvironmentSampler createEnvironmentSampler(int arg0);

	@ObfuscatedName("dh.db(II)V")
	public abstract void method2233(int arg0, int arg1);

	@ObfuscatedName("dh.dh()Z")
	public abstract boolean method2234();

	@ObfuscatedName("dh.dg(FFFFF)V")
	public abstract void setLevels(float arg0, float arg1, float arg2, float arg3, float arg4);

	@ObfuscatedName("dh.de([I)Lcj;")
	public abstract ColourRemapper createColourRemapper(int[] arg0);

	@ObfuscatedName("dh.dj()Z")
	public abstract boolean method2238();

	@ObfuscatedName("dh.eo(Lcj;FLcj;FLcj;F)V")
	public abstract void setColourRemapping(ColourRemapper arg0, float arg1, ColourRemapper arg2, float arg3, ColourRemapper arg4, float arg5);

	@ObfuscatedName("dh.a()Z")
	public abstract boolean method2240();

	@ObfuscatedName("dh.ed()Z")
	public abstract boolean isBloomEnabled();

	@ObfuscatedName("dh.es(FFFFFF)V")
	public abstract void setBloom(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("dh.ei(ILdy;)V")
	public abstract void method2245(int arg0, WaterFogData arg1);

	@ObfuscatedName("dh.el(ILdy;)V")
	public abstract void setWaterFog(int arg0, WaterFogData arg1);

	@ObfuscatedName("dh.ej()V")
	public abstract void method2247();

	@ObfuscatedName("dh.eh(Z)V")
	public abstract void method2253(boolean arg0);

	@ObfuscatedName("dh.bk()V")
	public abstract void method2263();

	@ObfuscatedName("dh.y()Z")
	public abstract boolean isBloomSupported();

	@ObfuscatedName("dh.f()Lcz;")
	public abstract RendererInfo getRendererInfo();

	@ObfuscatedName("dh.eu()V")
	public abstract void disableBloom();

	@ObfuscatedName("dh.ey()Z")
	public abstract boolean enableBloom();

	@ObfuscatedName("dh.ay()Z")
	public abstract boolean method2304();

	@ObfuscatedName("dh.cr(IIIIZ)Lcm;")
	public abstract Sprite method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("dh.bx([I)V")
	public abstract void method2326(int[] arg0);

	@ObfuscatedName("dh.bd(FF)V")
	public abstract void method2339(float arg0, float arg1);

	@ObfuscatedName("dh.cu(IIIIII)I")
	public abstract int method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("dh.bv(IIIIII)V")
	public abstract void fillRectangle(int x, int y, int width, int height, int rgb, int arg5);

	@ObfuscatedName("dh.dq()Lpq;")
	public abstract Matrix4x4 method2355();

	@ObfuscatedName("dh.ap(III)Ldw;")
	public abstract EffectInterface method2356(int arg0, int arg1, int arg2);

	@ObfuscatedName("dh.av()Z")
	public abstract boolean method2360();

	@ObfuscatedName("dh.p()V")
	public abstract void method2369();

	@ObfuscatedName("dh.cd(II)I")
	public abstract int method2394(int arg0, int arg1);

	@ObfuscatedName("dh.i()[I")
	public abstract int[] textureFormat();

	@ObfuscatedName("dh.ba(IIIII)V")
	public abstract void drawHorizontalLine(int x, int y, int width, int rgb, int arg4);

	@ObfuscatedName("dh.dl(Ldz;Ldz;FLdz;)Ldz;")
	public abstract EnvironmentSampler method2435(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3);

	@ObfuscatedName("dh.bm(II)V")
	public abstract void method2475(int arg0, int arg1);

	@ObfuscatedName("dh.ds(I[Lakf;)V")
	public abstract void setActiveLights(int arg0, Light[] arg1);

	@ObfuscatedName("dh.ab()I")
	public abstract int method2502();

	@ObfuscatedName("dh.ep(FFF[F)V")
	public abstract void method2507(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("dh.dp(Ldz;)V")
	public abstract void setEnvironmentSampler(EnvironmentSampler arg0);

	@ObfuscatedName("dh.c()I")
	public abstract int method2520();

	@ObfuscatedName("dh.ev(FFF[F)V")
	public abstract void method2525(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("dh.ck(I)V")
	public abstract void setVertexCapacity(int arg0);

	@ObfuscatedName("dh.cg(IIIIIILch;IIIII)V")
	public abstract void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("dh.br(IIFIIFIIFIIII)V")
	public abstract void method2552(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12);

	@ObfuscatedName("dh.dn(III)V")
	public abstract void setFog(int arg0, int arg1, int arg2);
}
