package com.jagex.graphics.glx;

import com.jagex.graphics.EffectInterface;
import com.jagex.graphics.GpuFrameBuffer;
import com.jagex.graphics.GraphicsDeletable;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ata")
public class GlxFrameBuffer extends GpuFrameBuffer {

	@ObfuscatedName("ata.k")
	public final GlxToolkit renderer;

	@ObfuscatedName("ata.f")
	public int framebuffer;

	@ObfuscatedName("ata.w")
	public int width;

	@ObfuscatedName("ata.l")
	public int height;

	@ObfuscatedName("ata.u")
	public int field12511;

	@ObfuscatedName("ata.z")
	public int field12512;

	@ObfuscatedName("ata.p")
	public GlxRelated2 field12513;

	@ObfuscatedName("ata.d")
	public final GlxRelated2[] field12514 = new GlxRelated2[4];

	public GlxFrameBuffer(GlxToolkit arg0) {
		super(arg0);
		this.renderer = arg0;
		int[] var2 = new int[1];
		if (!this.renderer.hasFramebufferObject) {
			throw new RuntimeException("");
		}
		OpenGL.glGenFramebuffersEXT(1, var2, 0);
		this.framebuffer = var2[0];
	}

	@ObfuscatedName("ata.e()I")
	public int getWidth() {
		return this.width;
	}

	@ObfuscatedName("ata.n()I")
	public int getHeight() {
		return this.height;
	}

	@ObfuscatedName("ata.b(ILdp;)V")
	public void method15439(int arg0, GraphicsDeletable arg1) {
		int var3 = 0x1 << arg0;
		GlxRelated2 var4 = (GlxRelated2) arg1;
		if (arg1 == null) {
			this.field12511 &= ~var3;
			this.field12514[arg0] = null;
			if (this.field12511 == 0) {
				this.height = 0;
				this.width = 0;
			}
		} else {
			if (this.field12511 == 0) {
				this.height = var4.method1009();
				this.width = var4.method1015();
				this.method18969();
			} else if (this.width != var4.method1015() || this.height != var4.method1009()) {
				throw new RuntimeException();
			}
			this.field12511 |= var3;
			this.field12514[arg0] = var4;
		}
		if (this.renderer.getRenderTarget() == this) {
			this.attachColor(arg0);
		} else {
			this.field12512 |= var3;
		}
	}

	@ObfuscatedName("ata.x(Ldw;)V")
	public void method15441(EffectInterface arg0) {
		GlxRelated2 var2 = (GlxRelated2) arg0;
		if (arg0 == null) {
			this.field12511 &= 0xFFFFFFEF;
			this.field12513 = null;
			if (this.field12511 == 0) {
				this.height = 0;
				this.width = 0;
			}
		} else {
			if (this.field12511 == 0) {
				this.height = var2.method1009();
				this.width = var2.method1015();
				this.method18969();
			} else if (this.width != var2.method1015() || this.height != var2.method1009()) {
				throw new RuntimeException();
			}
			this.field12511 |= 0x10;
			this.field12513 = var2;
		}
		if (this.renderer.getRenderTarget() == this) {
			this.attachDepth();
		} else {
			this.field12512 |= 0x10;
		}
	}

	@ObfuscatedName("ata.as(I)V")
	public void attachColor(int arg0) {
		GlxRelated2 var2 = this.field12514[arg0];
		if (var2 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			var2.method7627(arg0 + 36064);
		}
	}

	@ObfuscatedName("ata.at()V")
	public void attachDepth() {
		if (this.field12513 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.field12513.method7627(36096);
		}
	}

	@ObfuscatedName("ata.h()Z")
	public boolean method15446() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	@ObfuscatedName("ata.k()Z")
	public boolean method1630() {
		OpenGL.glBindFramebufferEXT(36160, this.framebuffer);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.field12512 & 0x1 << var1) != 0) {
				this.attachColor(var1);
			}
		}
		if ((this.field12512 & 0x10) != 0) {
			this.attachDepth();
		}
		this.field12512 = 0;
		return super.method1630();
	}

	@ObfuscatedName("ata.f()Z")
	public boolean method1631() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@ObfuscatedName("ata.a(IIIIIIZZ)V")
	public void method15440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.height;
		int var10 = this.renderer.getRenderTarget().getHeight();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.framebuffer);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg2 + arg4, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@ObfuscatedName("ata.m()V")
	public void method1629() {
		if (this.framebuffer != 0) {
			this.renderer.method19074(this.framebuffer);
			this.framebuffer = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		this.method1629();
	}
}
