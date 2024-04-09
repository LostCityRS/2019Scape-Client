package com.jagex.game.client;

import com.jagex.graphics.*;
import deob.ObfuscatedName;

import java.nio.ByteBuffer;
import java.util.Vector;

@ObfuscatedName("ls")
public class GpuPostProcessManager {

	@ObfuscatedName("ls.e")
	public GpuToolkit field3247;

	@ObfuscatedName("ls.n")
	public FrameBuffer field3245;

	@ObfuscatedName("ls.m")
	public FrameBuffer field3265;

	@ObfuscatedName("ls.k")
	public Texture2 field3244;

	@ObfuscatedName("ls.f")
	public Texture2 field3248;

	@ObfuscatedName("ls.w")
	public Texture2 field3249;

	@ObfuscatedName("ls.l")
	public GraphicsDeletable field3250;

	@ObfuscatedName("ls.u")
	public GraphicsDeletable field3251;

	@ObfuscatedName("ls.z")
	public GraphicsDeletable field3255;

	@ObfuscatedName("ls.p")
	public GraphicsDeletable field3253;

	@ObfuscatedName("ls.d")
	public EffectInterface field3254;

	@ObfuscatedName("ls.c")
	public EffectInterface field3262;

	@ObfuscatedName("ls.r")
	public int field3256;

	@ObfuscatedName("ls.v")
	public int field3246;

	@ObfuscatedName("ls.o")
	public int field3258;

	@ObfuscatedName("ls.s")
	public int field3259 = 0;

	@ObfuscatedName("ls.y")
	public DataType field3260;

	@ObfuscatedName("ls.q")
	public boolean field3261;

	@ObfuscatedName("ls.x")
	public Vector field3257 = new Vector();

	@ObfuscatedName("ls.b")
	public VertexBuffer field3263;

	@ObfuscatedName("ls.h")
	public VertexDeclaration field3264;

	@ObfuscatedName("ls.a")
	public int field3252 = 0;

	@ObfuscatedName("ls.g")
	public int field3266 = 0;

	public GpuPostProcessManager(GpuToolkit arg0, int arg1, int arg2) {
		this.field3247 = arg0;
		this.field3260 = DataType.UNSIGNED_INT_8;
		this.field3256 = arg1;
		this.field3246 = arg2;
	}

	@ObfuscatedName("ls.e()V")
	public void method5596() {
		if (this.field3263 != null) {
			return;
		}
		this.field3263 = this.field3247.createVertexBuffer(false);
		this.field3263.allocate(12, 4);
		ByteBuffer var1 = this.field3247.temporaryBuffer;
		var1.clear();
		var1.putFloat(0.0F);
		var1.putFloat(1.0F);
		var1.putFloat(2.0F);
		this.field3263.upload(0, var1.position(), this.field3247.temporaryBufferAddress);
		this.field3264 = this.field3247.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(VertexDeclarationElementComponent.TEX_COORD_1) });
	}

	@ObfuscatedName("ls.n()V")
	public void method5597() {
		this.field3247.setStreamSource(0, this.field3263);
		this.field3247.setVertexDeclaration(this.field3264);
		this.field3247.drawPrimitive(PrimitiveType.TRIANGLELIST, 0, 1);
	}

	@ObfuscatedName("ls.m()V")
	public void method5608() {
		this.method5596();
		switch(this.field3252) {
			case 0:
				this.field3260 = DataType.UNSIGNED_INT_8;
				break;
			case 1:
				this.field3260 = DataType.FLOAT_16;
				break;
			case 2:
				this.field3260 = DataType.FLOAT_32;
				break;
			default:
				throw new RuntimeException();
		}
		this.field3265 = this.field3247.createFramebuffer();
		if (this.field3247.field10180 > 1 && this.field3247.hasFramebufferBlit && this.field3247.hasFramebufferMultisample) {
			this.field3245 = this.field3247.createFramebuffer();
			this.field3253 = this.field3247.method2146(this.field3256, this.field3246, TextureFormat.RGBA, this.field3260, this.field3247.field10180);
			this.field3262 = this.field3247.method2356(this.field3256, this.field3246, this.field3247.field10180);
		}
		this.field3244 = this.field3247.method16089(TextureFormat.RGBA, this.field3260, this.field3256, this.field3246);
		this.field3250 = this.field3244.method5828(0);
		this.field3248 = this.field3247.method16089(TextureFormat.RGBA, this.field3260, this.field3256, this.field3246);
		this.field3251 = this.field3248.method5828(0);
		this.field3249 = this.field3247.method16089(TextureFormat.RGBA, this.field3260, this.field3256, this.field3246);
		this.field3255 = this.field3249.method5828(0);
		this.field3254 = this.field3247.method2121(this.field3249.getWidth(), this.field3249.getHeight());
		int var1 = this.field3257.size();
		for (int var2 = 0; var2 < var1; var2++) {
			GpuPostProcessEffect var3 = (GpuPostProcessEffect) this.field3257.elementAt(var2);
			var3.method5574(this.field3256, this.field3246);
		}
	}

	@ObfuscatedName("ls.k(Llh;)Z")
	public boolean method5599(GpuPostProcessEffect arg0) {
		Vector var2 = new Vector();
		boolean var3 = false;
		for (int var4 = 0; var4 < this.field3257.size(); var4++) {
			if (!var3 && arg0.method5567() < this.method5633(var4).method5567()) {
				var3 = true;
				if (!this.method5604(var2, var2.size(), arg0)) {
					return false;
				}
			}
			var2.addElement(this.method5633(var4));
		}
		if (var3 || this.method5604(var2, var2.size(), arg0)) {
			this.field3257 = var2;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ls.f(Ljava/util/Vector;ILlh;)Z")
	public boolean method5604(Vector arg0, int arg1, GpuPostProcessEffect arg2) {
		if (!arg2.method5559() && !arg2.method5572()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method5574(this.field3256, this.field3246);
		int var4 = arg2.method5568();
		if (var4 > this.field3252) {
			this.field3252 = var4;
		}
		arg2.field3243 = true;
		return true;
	}

	@ObfuscatedName("ls.w(Llh;)V")
	public void method5606(GpuPostProcessEffect arg0) {
		arg0.method5562();
		arg0.field3243 = false;
		this.field3257.removeElement(arg0);
	}

	@ObfuscatedName("ls.l(I)Llh;")
	public GpuPostProcessEffect method5633(int arg0) {
		return (GpuPostProcessEffect) this.field3257.elementAt(arg0);
	}

	@ObfuscatedName("ls.u()Z")
	public boolean method5603() {
		int var1 = this.field3257.size();
		for (int var2 = 0; var2 < var1; var2++) {
			if (!((GpuPostProcessEffect) this.field3257.elementAt(var2)).method5571()) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("ls.z(IIII)Z")
	public boolean method5600(int arg0, int arg1, int arg2, int arg3) {
		if (this.field3257.isEmpty() || this.method5603()) {
			return true;
		}
		if (this.field3256 != arg2 || this.field3246 != arg3 || this.field3247.field10180 != this.field3266) {
			this.field3266 = this.field3247.field10180;
			this.field3256 = arg2;
			this.field3246 = arg3;
			this.method5607();
			this.method5608();
		}
		this.field3265.method15439(0, this.field3255);
		if (this.field3254 != null) {
			this.field3265.method15441(this.field3254);
		}
		if (this.field3245 == null) {
			this.field3247.method2142(this.field3265);
		} else {
			this.field3245.method15439(0, this.field3253);
			this.field3245.method15441(this.field3262);
			this.field3247.method2142(this.field3245);
		}
		if (!this.field3265.method15446()) {
			this.field3247.method2143(this.field3245 == null ? this.field3265 : this.field3245);
			return false;
		}
		this.field3258 = arg0;
		this.field3259 = arg1;
		this.field3247.method2475(3, -16777216);
		this.field3247.enableColorWriteTest(15);
		this.field3247.method16055(0);
		this.field3261 = true;
		return true;
	}

	@ObfuscatedName("ls.p(II)V")
	public void method5605(int arg0, int arg1) {
		if (!this.field3261) {
			return;
		}
		if (this.field3245 != null) {
			this.field3247.method2143(this.field3245);
			this.field3247.method2142(this.field3265);
			this.field3245.method15440(0, 0, this.field3256, this.field3246, 0, 0, true, this.field3254 != null);
		}
		this.method5635(arg0, arg1);
		this.field3261 = false;
	}

	@ObfuscatedName("ls.d(II)V")
	public void method5635(int arg0, int arg1) {
		this.field3247.method2170(true);
		this.field3247.method16080();
		this.field3247.method16054(0);
		this.field3247.method15991(1);
		this.field3247.resetClip();
		this.field3265.method15441(null);
		this.field3247.method15996(0, 0);
		int var3 = this.field3257.size();
		Vector var4 = this.field3257;
		for (int var5 = 0; var5 < var3; var5++) {
			if (((GpuPostProcessEffect) this.field3257.elementAt(var5)).method5571()) {
				var4 = new Vector();
				for (int var6 = 0; var6 < var3; var6++) {
					if (!((GpuPostProcessEffect) this.field3257.elementAt(var6)).method5571()) {
						var4.addElement(this.field3257.elementAt(var6));
					}
				}
				var3 = var4.size();
				break;
			}
		}
		this.field3249.method5708();
		for (int var7 = 0; var7 < var3; var7++) {
			GpuPostProcessEffect var8 = (GpuPostProcessEffect) var4.elementAt(var7);
			int var9 = var8.method5566();
			boolean var10 = var3 - 1 == var7;
			boolean var11 = false;
			for (int var12 = 0; var12 < var9; var12++) {
				if (var9 - 1 != var12) {
					this.field3265.method15439(0, this.field3251);
				} else if (var10) {
					this.field3247.method2143(this.field3265);
					this.field3247.resetBounds(this.field3258, this.field3259, this.field3258 + arg0, this.field3259 + arg1);
				} else {
					var11 = true;
					this.field3265.method15439(0, this.field3255);
				}
				Texture2 var13 = this.field3244;
				if (var12 == 0) {
					var13 = this.field3249;
				}
				var8.method5564(var12, this.field3265, var13, this.field3254, this.field3249, var10 && var9 - 1 == var12);
				this.method5597();
				var8.method5565(var12);
				if (var11) {
					this.field3249.method5708();
				}
				Texture2 var14 = this.field3244;
				this.field3244 = this.field3248;
				this.field3248 = var14;
				GraphicsDeletable var15 = this.field3250;
				this.field3250 = this.field3251;
				this.field3251 = var15;
			}
		}
		this.field3247.method16054(1);
		this.field3247.method15991(0);
		this.field3247.method2170(false);
		this.field3247.resetClip();
		Object var16 = null;
	}

	@ObfuscatedName("ls.c()V")
	public void method5607() {
		if (this.field3245 != null) {
			this.field3245.method1629();
			this.field3245 = null;
		}
		if (this.field3253 != null) {
			this.field3253.delete();
			this.field3253 = null;
		}
		if (this.field3262 != null) {
			this.field3262.delete();
			this.field3262 = null;
		}
		if (this.field3265 != null) {
			this.field3265.method1629();
		}
		if (this.field3250 != null) {
			this.field3250.delete();
		}
		if (this.field3251 != null) {
			this.field3251.delete();
		}
		if (this.field3255 != null) {
			this.field3255.delete();
		}
		if (this.field3244 != null) {
			this.field3244.delete();
		}
		if (this.field3248 != null) {
			this.field3248.delete();
		}
		if (this.field3249 != null) {
			this.field3249.delete();
		}
		if (this.field3254 != null) {
			this.field3254.delete();
		}
		int var1 = this.field3257.size();
		for (int var2 = 0; var2 < var1; var2++) {
			GpuPostProcessEffect var3 = (GpuPostProcessEffect) this.field3257.elementAt(var2);
			var3.method5562();
		}
	}
}
