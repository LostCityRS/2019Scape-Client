package com.jagex;

import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("aqv")
public final class OpenGLRenderer extends GpuRenderer {

	@ObfuscatedName("aqv.hx")
	public OpenGL field12020;

	@ObfuscatedName("aqv.hq")
	public IterableQueue field12011 = new IterableQueue();

	@ObfuscatedName("aqv.hf")
	public IterableQueue field12000 = new IterableQueue();

	@ObfuscatedName("aqv.hr")
	public IterableQueue field12023 = new IterableQueue();

	@ObfuscatedName("aqv.hs")
	public IterableQueue field12035 = new IterableQueue();

	@ObfuscatedName("aqv.hh")
	public IterableQueue field12003 = new IterableQueue();

	@ObfuscatedName("aqv.hp")
	public IterableQueue field12004 = new IterableQueue();

	@ObfuscatedName("aqv.hy")
	public IterableQueue field12005 = new IterableQueue();

	@ObfuscatedName("aqv.he")
	public long field12006;

	@ObfuscatedName("aqv.hn")
	public final int[] field12007 = new int[1000];

	@ObfuscatedName("aqv.hi")
	public boolean field12008;

	@ObfuscatedName("aqv.hw")
	public boolean field12009;

	@ObfuscatedName("aqv.ht")
	public boolean field12010;

	@ObfuscatedName("aqv.hc")
	public int field12040;

	@ObfuscatedName("aqv.ho")
	public OpenGLVertexBuffer[] field12012 = new OpenGLVertexBuffer[16];

	@ObfuscatedName("aqv.hj")
	public OpenGLIndexBuffer field12036;

	@ObfuscatedName("aqv.hv")
	public int[] field12014;

	@ObfuscatedName("aqv.hz")
	public OpenGLProgram field12015;

	@ObfuscatedName("aqv.ij")
	public boolean field12016;

	@ObfuscatedName("aqv.io")
	public final String field12037;

	@ObfuscatedName("aqv.iq")
	public final String field12001;

	@ObfuscatedName("aqv.ig")
	public final int field11999;

	@ObfuscatedName("aqv.iv")
	public boolean field12013;

	@ObfuscatedName("aqv.ie")
	public boolean field12002;

	@ObfuscatedName("aqv.iu")
	public boolean field12022;

	@ObfuscatedName("aqv.in")
	public final boolean field12032;

	@ObfuscatedName("aqv.ir")
	public final boolean field12024;

	@ObfuscatedName("aqv.it")
	public final boolean field12025;

	@ObfuscatedName("aqv.ix")
	public final boolean field12026;

	@ObfuscatedName("aqv.is")
	public final int field12027;

	@ObfuscatedName("aqv.ib")
	public boolean field12028;

	@ObfuscatedName("aqv.il")
	public boolean field12029;

	@ObfuscatedName("aqv.iw")
	public final float[] field12030;

	@ObfuscatedName("aqv.ip")
	public final float[] field12031;

	@ObfuscatedName("aqv.ia")
	public Sprite field12033;

	@ObfuscatedName("aqv.if")
	public Sprite field12034;

	@ObfuscatedName("aqv.ih")
	public Framebuffer field12018;

	@ObfuscatedName("aqv.iy")
	public int[] field12017;

	@ObfuscatedName("aqv.ii")
	public long[] field11998;

	@ObfuscatedName("aqv.iz")
	public int[] field12038;

	@ObfuscatedName("aqv.ik")
	public int field12039;

	@ObfuscatedName("aqv.im")
	public int field12019;

	@ObfuscatedName("aqv.ahu(Ljava/lang/String;)[B")
	public byte[] method19089(String arg0) {
		return this.method15965("gl", arg0);
	}

	@ObfuscatedName("aqv.rc(Ljava/lang/String;)Lho;")
	public Shader method15964(String arg0) {
		byte[] var2 = this.method19089(arg0);
		if (var2 == null) {
			return null;
		} else {
			ShaderData var3 = this.method15971(var2);
			return new OpenGLProgramManager(this, var3);
		}
	}

	@ObfuscatedName("aqv.rx()Z")
	public boolean method15957() {
		return this.field12032;
	}

	@ObfuscatedName("aqv.ry()Z")
	public boolean method15958() {
		return this.field12025;
	}

	@ObfuscatedName("aqv.rg(Z)Z")
	public boolean method15959(boolean arg0) {
		return true;
	}

	public OpenGLRenderer(OpenGL arg0, Canvas arg1, long arg2, MaterialList arg3, TextureList arg4, BillboardTypeList arg5, ParticleEmitterTypeList arg6, ParticleEffectorTypeList arg7, Js5 arg8, int arg9) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, 1);
		new MapBuffer();
		new MapBuffer();
		this.field12030 = new float[4];
		this.field12031 = new float[16];
		this.field12033 = null;
		this.field12034 = null;
		this.field12018 = null;
		this.field12017 = new int[3];
		this.field11998 = new long[3];
		this.field12038 = new int[3];
		this.field12039 = 0;
		this.field12019 = 0;
		int[] var12 = new int[1];
		try {
			this.field12020 = arg0;
			this.field12020.method1();
			this.field12037 = OpenGL.glGetString(7936).toLowerCase();
			this.field12001 = OpenGL.glGetString(7937).toLowerCase();
			if (this.field12037.indexOf("microsoft") != -1 || this.field12037.indexOf("brian paul") != -1 || this.field12037.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			String var13 = OpenGL.glGetString(7938);
			String[] var14 = StringUtils.method17361(var13.replace('.', ' '), ' ');
			if (var14.length < 2) {
				throw new RuntimeException("");
			}
			try {
				int var15 = StringUtils.method9595(var14[0]);
				int var16 = StringUtils.method9595(var14[1]);
				this.field11999 = var15 * 10 + var16;
			} catch (NumberFormatException var30) {
				throw new RuntimeException("");
			}
			if (this.field11999 < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, var12, 0);
			this.field10186 = var12[0];
			if (this.field10186 < 2) {
				throw new RuntimeException("");
			}
			this.field10094 = 8;
			this.field12013 = this.field12020.method0("GL_ARB_vertex_buffer_object");
			this.field10172 = this.field12020.method0("GL_ARB_multisample");
			this.field10074 = this.field12020.method0("GL_EXT_blend_func_separate");
			this.field12002 = this.field12020.method0("GL_ARB_texture_rectangle");
			this.field10192 = this.field12020.method0("GL_ARB_texture_cube_map");
			this.field12022 = this.field12020.method0("GL_ARB_texture_non_power_of_two");
			this.field10125 = true;
			this.field12032 = this.field12020.method0("GL_ARB_vertex_shader");
			this.field12024 = this.field12020.method0("GL_ARB_vertex_program");
			this.field12025 = this.field12020.method0("GL_ARB_fragment_shader");
			this.field12026 = this.field12020.method0("GL_ARB_fragment_program");
			this.field10159 = this.field12020.method0("GL_EXT_framebuffer_object");
			this.field10116 = this.field10159;
			this.field10134 = this.field12020.method0("GL_EXT_framebuffer_blit");
			this.field10199 = this.field12020.method0("GL_EXT_framebuffer_multisample");
			this.field12028 = this.field10110 != null && (this.field11999 >= 32 || this.field12020.method0("GL_ARB_sync"));
			this.field12014 = new int[this.field10186];
			if (!this.method15957() || !this.method15958()) {
				if (!this.field12020.method0("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!this.field12020.method0("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			NativeLibraryConfig.field5074.startsWith("mac");
			this.field12027 = Stream.method61() ? 33639 : 5121;
			if (this.field12001.indexOf("radeon") != -1 || this.field12037.indexOf("intel") != -1) {
				int var18 = 0;
				boolean var19 = this.field12037.indexOf("intel") != -1;
				boolean var20 = false;
				boolean var21 = false;
				String[] var22 = StringUtils.method17361(this.field12001.replace('/', ' '), ' ');
				for (int var23 = 0; var23 < var22.length; var23++) {
					String var24 = var22[var23];
					try {
						if (var24.length() > 0) {
							if (var24.charAt(0) == 'x' && var24.length() >= 3 && StringUtils.method9836(var24.substring(1, 3))) {
								var24 = var24.substring(1);
								var21 = true;
							}
							if (var24.equals("hd")) {
								var20 = true;
							} else {
								if (var24.startsWith("hd")) {
									var24 = var24.substring(2);
									var20 = true;
								}
								if (var24.length() >= 4 && StringUtils.method9836(var24.substring(0, 4))) {
									var18 = StringUtils.method9595(var24.substring(0, 4));
									break;
								}
							}
						}
					} catch (Exception var31) {
					}
				}
				if (!var19) {
					if (!var21 && !var20) {
						if (var18 >= 7000 && var18 <= 7999) {
							this.field12013 = false;
						}
						if (var18 >= 7000 && var18 <= 9250) {
							this.field10125 = false;
						}
					}
					this.field12002 &= this.field12020.method0("GL_ARB_half_float_pixel");
					this.field12016 = true;
				} else if (!var20) {
					this.field10159 = false;
				}
			}
			if (!this.field12013) {
				throw new RuntimeException("");
			}
			try {
				int[] var26 = new int[1];
				OpenGL.glGenBuffersARB(1, var26, 0);
			} catch (Throwable var29) {
				throw new RuntimeException("");
			}
			this.method2138(arg1, new OpenGLSurface(this, arg1, arg2));
			this.method2140(arg1);
			this.method15987(32768, false);
			this.method15987(32768, false);
		} catch (Throwable var32) {
			var32.printStackTrace();
			this.method2578();
			if (var32 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var32;
			}
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aqv.sw()V")
	public void method16232() {
		OpenGL.glDepthFunc(515);
		this.method19084();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.field10172) {
			this.method16294(this.field10180 > 1);
			OpenGL.glDisable(32926);
		}
		for (int var1 = this.field10186 - 1; var1 >= 0; var1--) {
			OpenGL.glActiveTexture(var1 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var3 = 0; var3 < 8; var3++) {
			int var4 = var3 + 16384;
			OpenGL.glLightfv(var4, 4608, var2, 0);
			OpenGL.glLightf(var4, 4615, 0.0F);
			OpenGL.glLightf(var4, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.field12020.setSwapInterval(0);
		super.method16232();
	}

	@ObfuscatedName("aqv.f()Lcz;")
	public RendererInfo method2272() {
		int var1 = -1;
		if (this.field12037.indexOf("nvidia") != -1) {
			var1 = 4318;
		} else if (this.field12037.indexOf("intel") != -1) {
			var1 = 32902;
		} else if (this.field12037.indexOf("ati") != -1) {
			var1 = 4098;
		}
		return new RendererInfo(var1, this.method16279() ? "OpenGL FF" : "OpenGL", this.field11999, this.field12001, 0L, this.method16279());
	}

	@ObfuscatedName("aqv.l(II)V")
	public void method2116(int arg0, int arg1) throws RendererException {
		this.field1612.method15451();
		if (this.field1596 != null) {
			this.field1596.method1982();
		}
	}

	@ObfuscatedName("aqv.u()V")
	public void method2117() {
		OpenGL.glFinish();
	}

	@ObfuscatedName("aqv.p()V")
	public void method2369() {
		super.method2369();
		if (this.field12020 != null) {
			this.field12020.method2();
			this.field12020.release();
			this.field12020 = null;
		}
	}

	@ObfuscatedName("aqv.sr()F")
	public float method15954() {
		return 0.0F;
	}

	@ObfuscatedName("aqv.ad(Ljava/awt/Canvas;II)Lafy;")
	public Surface method2144(Canvas arg0, int arg1, int arg2) {
		return new OpenGLSurface(this, arg0);
	}

	@ObfuscatedName("aqv.am()Lafq;")
	public Framebuffer method2145() {
		return new OpenGLFramebuffer(this);
	}

	@ObfuscatedName("aqv.au(IILck;Ldg;I)Ldp;")
	public class130 method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
		return new OpenGLRenderBuffer(this, arg2, arg3, arg0, arg1, arg4);
	}

	@ObfuscatedName("aqv.ar(II)Ldw;")
	public class126 method2121(int arg0, int arg1) {
		return new OpenGLRenderBuffer(this, TextureFormat.field1268, DataType.UNSIGNED_INT_24, arg0, arg1);
	}

	@ObfuscatedName("aqv.ap(III)Ldw;")
	public class126 method2356(int arg0, int arg1, int arg2) {
		return new OpenGLRenderBuffer(this, TextureFormat.field1268, DataType.UNSIGNED_INT_24, arg0, arg1, arg2);
	}

	@ObfuscatedName("aqv.aq(IIII)[I")
	public int[] method2149(int arg0, int arg1, int arg2, int arg3) {
		int[] var5 = new int[arg2 * arg3];
		int var6 = this.field1614.method1628();
		for (int var7 = 0; var7 < arg3; var7++) {
			OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field12027, var5, arg2 * var7);
		}
		return var5;
	}

	@ObfuscatedName("aqv.ax()V")
	public void method2150() {
		if (this.field1614 == null) {
			return;
		}
		int var1 = this.field1614.method1627();
		int var2 = this.field1614.method1628();
		if (var1 <= 0 && var2 <= 0) {
			return;
		}
		int var3 = this.field10101;
		int var4 = this.field10102;
		int var5 = this.field10103;
		int var6 = this.field10104;
		this.method2263();
		int var7 = this.field10095;
		int var8 = this.field10193;
		int var9 = this.field10138;
		int var10 = this.field10106;
		this.method2167();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method16084();
		this.method16061(false);
		this.method16118(false);
		this.method16015(false);
		this.method16361(false);
		this.method16092(null);
		this.method15991(1);
		this.method16054(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method2168(var7, var9, var8, var10);
		this.method2164(var3, var4, var5, var6);
	}

	@ObfuscatedName("aqv.av()Z")
	public boolean method2360() {
		return this.field12028;
	}

	@ObfuscatedName("aqv.ao()Z")
	public boolean method2196() {
		return !this.field12028 || this.field11998[this.field12019] == 0L;
	}

	@ObfuscatedName("aqv.aj()Z")
	public boolean method2153() {
		return true;
	}

	@ObfuscatedName("aqv.ay()Z")
	public boolean method2304() {
		return false;
	}

	@ObfuscatedName("aqv.ab()I")
	public int method2502() {
		if (!this.field12028) {
			return -1;
		} else if (this.field11998[this.field12039] == 0L) {
			return -1;
		} else {
			int var1 = OpenGL.glClientWaitSync(this.field11998[this.field12039], 0, 0);
			if (var1 == 37149) {
				this.method2156();
				return -1;
			} else if (var1 == 37147) {
				return -1;
			} else {
				return this.field12038[this.field12039];
			}
		}
	}

	@ObfuscatedName("aqv.aa(III)V")
	public void method2163(int arg0, int arg1, int arg2) {
		this.method2203();
		if (this.field12018 == null) {
			this.method19069(arg1, arg2);
		}
		if (this.field12033 == null) {
			this.field12033 = this.method2314(0, 0, this.field1614.method1627(), this.field1614.method1628(), false);
		} else {
			this.field12033.method1440(0, 0, this.field1614.method1627(), this.field1614.method1628(), 0, 0);
		}
		this.method2142(this.field12018);
		this.method2475(1, -16777216);
		this.field12033.method1474(this.field1611, this.field1618, this.field1619, this.field1610);
		OpenGL.glBindBufferARB(35051, this.field12017[this.field12019]);
		OpenGL.glReadPixelsub(0, 0, this.field1615, this.field1588, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method2143(this.field12018);
		this.field11998[this.field12019] = OpenGL.glFenceSync(37143, 0);
		this.field12038[this.field12019] = arg0;
		if (++this.field12019 >= 3) {
			this.field12019 = 0;
		}
		this.method2204();
	}

	@ObfuscatedName("aqv.az()V")
	public void method2156() {
		for (int var1 = 0; var1 < 3; var1++) {
			if (this.field11998[var1] != 0L) {
				OpenGL.glDeleteSync(this.field11998[var1]);
				this.field11998[var1] = 0L;
			}
		}
		this.field12019 = 0;
		this.field12039 = 0;
	}

	@ObfuscatedName("aqv.af(II)J")
	public long method2158(int arg0, int arg1) {
		return this.method19070(arg0, arg1, null, null);
	}

	@ObfuscatedName("aqv.an(II[I[I)V")
	public void method2160(int arg0, int arg1, int[] arg2, int[] arg3) {
		this.method19070(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqv.ahz(II[I[I)J")
	public long method19070(int arg0, int arg1, int[] arg2, int[] arg3) {
		if (!this.field12028) {
			if (this.field12034 == null) {
				this.method19069(arg0, arg1);
			}
			if (this.field12033 == null) {
				this.field12033 = this.method2314(0, 0, this.field1614.method1627(), this.field1614.method1628(), false);
			} else {
				this.field12033.method1440(0, 0, this.field1614.method1627(), this.field1614.method1628(), 0, 0);
			}
			this.method2142(this.field12018);
			this.method2475(1, -16777216);
			this.field12033.method1474(this.field1611, this.field1618, this.field1619, this.field1610);
			this.field12034.method1476(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method2143(this.field12018);
			return 0L;
		}
		if (this.field11998[this.field12039] != 0L) {
			OpenGL.glDeleteSync(this.field11998[this.field12039]);
			this.field11998[this.field12039] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.field12017[this.field12039]);
		long var5 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (int var7 = 0; var7 < arg0 * arg1; var7++) {
				arg2[var7] = this.field10110.getInt((long) (var7 * 4) + var5);
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			var5 = 0L;
		}
		if (++this.field12039 >= 3) {
			this.field12039 = 0;
		}
		return var5;
	}

	@ObfuscatedName("aqv.ak(J)V")
	public void method2159(long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@ObfuscatedName("aqv.bl()V")
	public void method2126() {
		if (this.field12028) {
			this.field12033 = null;
			if (this.field12018 != null) {
				this.field12018.method1629();
				this.field12018 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.field12017, 0);
			for (int var1 = 0; var1 < 3; var1++) {
				this.field12017[var1] = 0;
				if (this.field11998[var1] != 0L) {
					OpenGL.glDeleteSync(this.field11998[var1]);
					this.field11998[var1] = 0L;
				}
			}
		} else {
			this.field12018 = null;
			this.field12034 = null;
			this.field12033 = null;
		}
		this.field12019 = 0;
		this.field12039 = 0;
	}

	@ObfuscatedName("aqv.aha(II)V")
	public void method19069(int arg0, int arg1) {
		this.method2126();
		this.method2419(arg0, arg1);
		if (!this.field12028) {
			this.field12034 = this.method2197(arg0, arg1, false, true);
			this.field12018 = this.method2145();
			this.field12018.method15439(0, this.field12034.method1437());
			return;
		}
		this.field12034 = this.method2197(arg0, arg1, false, true);
		this.field12018 = this.method2145();
		this.field12018.method15439(0, this.field12034.method1437());
		OpenGL.glGenBuffersARB(3, this.field12017, 0);
		for (int var3 = 0; var3 < 3; var3++) {
			OpenGL.glBindBufferARB(35051, this.field12017[var3]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@ObfuscatedName("aqv.dl(Ldz;Ldz;FLdz;)Ldz;")
	public EnvironmentSampler method2435(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("aqv.bm(II)V")
	public void method2475(int arg0, int arg1) {
		int var3 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			var3 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method16361(true);
			var3 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			var3 |= 0x400;
		}
		OpenGL.glClear(var3);
	}

	@ObfuscatedName("aqv.sa()V")
	public void method15997() {
		if (this.field1614 != null) {
			OpenGL.glViewport(this.field10105 + this.field10101, this.field10132 + this.field1614.method1628() - this.field10102 - this.field10104, this.field10103, this.field10104);
		}
		OpenGL.glDepthRange(this.field10087, this.field10088);
	}

	@ObfuscatedName("aqv.sb()V")
	public void method15955() {
		if (this.field1614 == null) {
			return;
		}
		int var1 = this.field10105 + this.field10095;
		int var2 = this.field10132 + this.field1614.method1628() - this.field10106;
		int var3 = this.field10193 - this.field10095;
		int var4 = this.field10106 - this.field10138;
		if (var3 < 0) {
			var3 = 0;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		OpenGL.glScissor(var1, var2, var3, var4);
	}

	@ObfuscatedName("aqv.sj()V")
	public void method15999() {
		if (this.field10182) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@ObfuscatedName("aqv.rn(Lpq;Lpq;Lpq;)V")
	public void method15967(Matrix4x4 arg0, Matrix4x4 arg1, Matrix4x4 arg2) {
		OpenGL.glMatrixMode(5888);
		this.field10066.method6606(arg0, arg1);
		OpenGL.glLoadMatrixf(this.field10066.field4315, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.field4315, 0);
	}

	@ObfuscatedName("aqv.ti(Lpq;)V")
	public void method16006(Matrix4x4 arg0) {
		float[] var2 = arg0.field4315;
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
	}

	@ObfuscatedName("aqv.tp()V")
	public void method16016() {
		if (this.field10109 && this.field10044) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@ObfuscatedName("aqv.tv()V")
	public void method16017() {
		OpenGL.glDepthMask(this.field10107 && this.field10108);
	}

	@ObfuscatedName("aqv.tg()V")
	public void method16233() {
		if (this.field10111 && !this.field10113) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@ObfuscatedName("aqv.tq()V")
	public void method15990() {
		this.field12030[0] = this.field10142 * this.field10122;
		this.field12030[1] = this.field10122 * this.field10120;
		this.field12030[2] = this.field10210 * this.field10122;
		this.field12030[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.field12030, 0);
	}

	@ObfuscatedName("aqv.tx()V")
	public void method16021() {
		this.field12030[0] = this.field10142 * this.field10123;
		this.field12030[1] = this.field10123 * this.field10120;
		this.field12030[2] = this.field10210 * this.field10123;
		this.field12030[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.field12030, 0);
		this.field12030[0] = -this.field10124 * this.field10142;
		this.field12030[1] = -this.field10124 * this.field10120;
		this.field12030[2] = -this.field10124 * this.field10210;
		this.field12030[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.field12030, 0);
	}

	@ObfuscatedName("aqv.tk()V")
	public void method16307() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.field10059.field4315, 0);
		OpenGL.glLightfv(16384, 4611, this.field10114, 0);
		OpenGL.glLightfv(16385, 4611, this.field10072, 0);
	}

	@ObfuscatedName("aqv.td()V")
	public void method16024() {
		if (this.field10112) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@ObfuscatedName("aqv.tl()V")
	public void method16023() {
	}

	@ObfuscatedName("aqv.um()V")
	public void method16025() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.field10059.field4315, 0);
		int var1;
		for (var1 = 0; var1 < this.field10127; var1++) {
			Light var2 = this.field10045[var1];
			int var3 = var2.method17624();
			int var4 = var1 + 16386;
			float var5 = var2.method17610() / 255.0F;
			this.field12030[0] = var2.method17605();
			this.field12030[1] = var2.method17606();
			this.field12030[2] = var2.method17607();
			this.field12030[3] = 1.0F;
			OpenGL.glLightfv(var4, 4611, this.field12030, 0);
			this.field12030[0] = (float) (var3 >> 16 & 0xFF) * var5;
			this.field12030[1] = (float) (var3 >> 8 & 0xFF) * var5;
			this.field12030[2] = (float) (var3 & 0xFF) * var5;
			this.field12030[3] = 1.0F;
			OpenGL.glLightfv(var4, 4609, this.field12030, 0);
			OpenGL.glLightf(var4, 4617, 1.0F / (float) (var2.method17608() * var2.method17608()));
			OpenGL.glEnable(var4);
		}
		while (var1 < this.field10126) {
			OpenGL.glDisable(var1 + 16386);
			var1++;
		}
	}

	@ObfuscatedName("aqv.uq(Lck;Ldg;)Z")
	public boolean method16026(TextureFormat arg0, DataType arg1) {
		return true;
	}

	@ObfuscatedName("aqv.uc(Lck;Ldg;)Z")
	public boolean method16289(TextureFormat arg0, DataType arg1) {
		return this.field10125;
	}

	@ObfuscatedName("aqv.uz(Lck;Ldg;II)Llz;")
	public GpuTexture method16030(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
		return this.method16089(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqv.uj(IIZ[III)Llz;")
	public GpuTexture method16033(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new OpenGLTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqv.ug(Lck;IIZ[BII)Llz;")
	public GpuTexture method15975(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		return new OpenGLTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aqv.ub(Lck;IIZ[FII)Llz;")
	public GpuTexture method16032(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new OpenGLTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aqv.uy(Lck;Ldg;II)Lmo;")
	public Texture2 method16089(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
		return new OpenGLTexture(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqv.ut(IZ[[I)Lmr;")
	public GpuCubeTexture method16034(int arg0, boolean arg1, int[][] arg2) {
		return new OpenGLCubeTexture(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("aqv.uk(Lck;IIIZ[B)Lll;")
	public VolumeTexture method16197(TextureFormat arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new OpenGLVolumeTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqv.ud()V")
	public void method16091() {
		int var1 = this.field12014[this.field10177];
		if (var1 != 0) {
			this.field12014[this.field10177] = 0;
			OpenGL.glBindTexture(var1, 0);
			OpenGL.glDisable(var1);
		}
	}

	@ObfuscatedName("aqv.vo()V")
	public void method16050() {
		OpenGL.glMatrixMode(5890);
		if (this.field10135[this.field10177] == class352.field3372) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.field10162[this.field10177].method6594(this.field12031), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("aqv.vv()V")
	public void method16051() {
		OpenGL.glActiveTexture(this.field10177 + 33984);
	}

	@ObfuscatedName("aqv.vw()V")
	public void method16256() {
		OpenGL.glTexEnvi(8960, 34161, method19066(this.field10136[this.field10177]));
	}

	@ObfuscatedName("aqv.vt()V")
	public void method16052() {
		OpenGL.glTexEnvi(8960, 34162, method19066(this.field10137[this.field10177]));
	}

	@ObfuscatedName("aqv.ur(ILmn;ZZ)V")
	public final void method16031(int arg0, TextureCombiner arg1, boolean arg2, boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method19082(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@ObfuscatedName("aqv.uo(ILmn;Z)V")
	public final void method16043(int arg0, TextureCombiner arg1, boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method19082(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@ObfuscatedName("aqv.vr()V")
	public final void method16049() {
		this.field12030[0] = (float) (this.field10160 & 0xFF0000) / 1.671168E7F;
		this.field12030[1] = (float) (this.field10160 & 0xFF00) / 65280.0F;
		this.field12030[2] = (float) (this.field10160 & 0xFF) / 255.0F;
		this.field12030[3] = (float) (this.field10160 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.field12030, 0);
	}

	@ObfuscatedName("aqv.ahx(Lmk;)I")
	public static final int method19066(TextureCombineMode arg0) {
		if (TextureCombineMode.field3396 == arg0) {
			return 7681;
		} else if (TextureCombineMode.field3395 == arg0) {
			return 8448;
		} else if (TextureCombineMode.field3399 == arg0) {
			return 34165;
		} else if (TextureCombineMode.field3397 == arg0) {
			return 260;
		} else if (TextureCombineMode.field3398 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aqv.ahb(Lmn;)I")
	public static final int method19082(TextureCombiner arg0) {
		if (TextureCombiner.field3365 == arg0) {
			return 5890;
		} else if (TextureCombiner.field3367 == arg0) {
			return 34167;
		} else if (TextureCombiner.field3366 == arg0) {
			return 34168;
		} else if (TextureCombiner.field3368 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aqv.vy(I)V")
	public void method16057(int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@ObfuscatedName("aqv.ve()V")
	public void method16058() {
		if (this.field10091) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.field10178 & 0xFF) / 255.0F);
		if (this.field10180 <= 1) {
			return;
		}
		if (this.field10178 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@ObfuscatedName("aqv.vm()V")
	public void method16059() {
		if (this.field10074) {
			byte var1 = 0;
			byte var2 = 0;
			if (this.field10174 == 0) {
				var1 = 0;
				var2 = 0;
			} else if (this.field10174 == 1) {
				var1 = 1;
				var2 = 0;
			} else if (this.field10174 == 2) {
				var1 = 1;
				var2 = 1;
			} else if (this.field10174 == 3) {
				var1 = 0;
				var2 = 1;
			}
			if (BlendMode.field3364 == this.field10211) {
				OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
			} else if (BlendMode.field3363 == this.field10211) {
				OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
			} else if (BlendMode.field3362 == this.field10211) {
				OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
			} else if (BlendMode.field3361 == this.field10211) {
				OpenGL.glBlendFuncSeparate(1, 0, var1, var2);
			}
		} else if (BlendMode.field3364 == this.field10211) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (BlendMode.field3363 == this.field10211) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (BlendMode.field3362 == this.field10211) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@ObfuscatedName("aqv.vg()V")
	public void method16175() {
		if (this.field10176) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@ObfuscatedName("aqv.aho()V")
	public void method19084() {
		if (this.field10179 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.field10179 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.field10179 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@ObfuscatedName("aqv.vz()V")
	public void method15978() {
		if (this.field10167 && this.field10166 && this.field10169 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@ObfuscatedName("aqv.vh()V")
	public void method16123() {
		this.field10119 = this.field10092 - (float) this.field10189;
		this.field10171 = this.field10119 - (float) this.field10169;
		if (this.field10171 < this.field10170) {
			this.field10171 = this.field10170;
		}
		if (!this.field10099) {
			return;
		}
		OpenGL.glFogf(2915, this.field10171);
		OpenGL.glFogf(2916, this.field10119);
		this.field12030[0] = (float) (this.field10191 & 0xFF0000) / 1.671168E7F;
		this.field12030[1] = (float) (this.field10191 & 0xFF00) / 65280.0F;
		this.field12030[2] = (float) (this.field10191 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.field12030, 0);
	}

	@ObfuscatedName("aqv.vj(Z)V")
	public void method16294(boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@ObfuscatedName("aqv.vn(Z)Llr;")
	public final VertexBuffer method16085(boolean arg0) {
		return new OpenGLVertexBuffer(this, arg0);
	}

	@ObfuscatedName("aqv.vc(Z)Lml;")
	public final IndexBuffer method16067(boolean arg0) {
		return new OpenGLIndexBuffer(this, DataType.UNSIGNED_INT_16, arg0);
	}

	@ObfuscatedName("aqv.vf([Llk;)Llo;")
	public VertexDeclaration method16065(VertexDeclarationElement[] arg0) {
		return new VertexDeclaration_Sub1(arg0);
	}

	@ObfuscatedName("aqv.wn(ILlr;)V")
	public void method16120(int arg0, VertexBuffer arg1) {
		this.field12012[arg0] = (OpenGLVertexBuffer) arg1;
	}

	@ObfuscatedName("aqv.wa(Lml;)V")
	public void method16102(IndexBuffer arg0) {
		this.field12036 = (OpenGLIndexBuffer) arg0;
		this.field12036.method7658();
	}

	@ObfuscatedName("aqv.vk(Llo;)V")
	public void method16177(VertexDeclaration arg0) {
		VertexDeclarationElement[] var2 = arg0.field3241;
		int var3 = 0;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		for (int var7 = 0; var7 < var2.length; var7++) {
			VertexDeclarationElement var8 = var2[var7];
			OpenGLVertexBuffer var9 = this.field12012[var7];
			int var10 = 0;
			int var11 = var9.method16793();
			long var12 = var9.getAddress();
			var9.method7658();
			for (int var14 = 0; var14 < var8.method5776(); var14++) {
				VertexDeclarationElementComponent var15 = var8.method5777(var14);
				switch(var15.field3312) {
					case 2:
						OpenGL.glColorPointer(4, 5121, var11, (long) var10 + var12);
						var4 = true;
						break;
					case 3:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, var11, (long) var10 + var12);
						break;
					case 4:
						OpenGL.glVertexPointer(3, 5126, var11, (long) var10 + var12);
						var6 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, var11, (long) var10 + var12);
					case 6:
					case 8:
					case 10:
					default:
						break;
					case 7:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, var11, (long) var10 + var12);
						break;
					case 9:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, var11, (long) var10 + var12);
						break;
					case 11:
						OpenGL.glNormalPointer(5126, var11, (long) var10 + var12);
						var5 = true;
				}
				var10 += var15.field3313;
			}
		}
		if (this.field12010 != var6) {
			if (var6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.field12010 = var6;
		}
		if (this.field12008 != var5) {
			if (var5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.field12008 = var5;
		}
		if (this.field12009 != var4) {
			if (var4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.field12009 = var4;
		}
		if (this.field12040 < var3) {
			for (int var16 = this.field12040; var16 < var3; var16++) {
				OpenGL.glClientActiveTexture(var16 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.field12040 = var3;
		} else if (this.field12040 > var3) {
			for (int var17 = var3; var17 < this.field12040; var17++) {
				OpenGL.glClientActiveTexture(var17 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.field12040 = var3;
		}
	}

	@ObfuscatedName("aqv.wz(Lms;II)V")
	public final void method16077(PrimitiveType arg0, int arg1, int arg2) {
		byte var4;
		int var5;
		if (PrimitiveType.field3406 == arg0) {
			var4 = 1;
			var5 = arg2 * 2;
		} else if (PrimitiveType.field3400 == arg0) {
			var4 = 3;
			var5 = arg2 + 1;
		} else if (PrimitiveType.field3403 == arg0) {
			var4 = 4;
			var5 = arg2 * 3;
		} else if (PrimitiveType.field3404 == arg0) {
			var4 = 6;
			var5 = arg2 + 2;
		} else if (PrimitiveType.field3405 == arg0) {
			var4 = 5;
			var5 = arg2 + 2;
		} else {
			var4 = 0;
			var5 = arg2;
		}
		OpenGL.glDrawArrays(var4, arg1, var5);
	}

	@ObfuscatedName("aqv.wj(Lml;Lms;IIII)V")
	public final void method16078(IndexBuffer arg0, PrimitiveType arg1, int arg2, int arg3, int arg4, int arg5) {
		byte var7;
		int var8;
		if (PrimitiveType.field3406 == arg1) {
			var7 = 1;
			var8 = arg5 * 2;
		} else if (PrimitiveType.field3400 == arg1) {
			var7 = 3;
			var8 = arg5 + 1;
		} else if (PrimitiveType.field3403 == arg1) {
			var7 = 4;
			var8 = arg5 * 3;
		} else if (PrimitiveType.field3404 == arg1) {
			var7 = 6;
			var8 = arg5 + 2;
		} else if (PrimitiveType.field3405 == arg1) {
			var7 = 5;
			var8 = arg5 + 2;
		} else {
			var7 = 0;
			var8 = arg5;
		}
		DataType var9 = arg0.method5832();
		OpenGLIndexBuffer var10 = (OpenGLIndexBuffer) arg0;
		var10.method7658();
		OpenGL.glDrawElements(var7, var8, method19076(var9), var10.getAddress() + (long) (var9.field1652 * arg4));
	}

	@ObfuscatedName("aqv.we(Lms;IIII)V")
	public final void method16079(PrimitiveType arg0, int arg1, int arg2, int arg3, int arg4) {
		byte var6;
		int var7;
		if (PrimitiveType.field3406 == arg0) {
			var6 = 1;
			var7 = arg4 * 2;
		} else if (PrimitiveType.field3400 == arg0) {
			var6 = 3;
			var7 = arg4 + 1;
		} else if (PrimitiveType.field3403 == arg0) {
			var6 = 4;
			var7 = arg4 * 3;
		} else if (PrimitiveType.field3404 == arg0) {
			var6 = 6;
			var7 = arg4 + 2;
		} else if (PrimitiveType.field3405 == arg0) {
			var6 = 5;
			var7 = arg4 + 2;
		} else {
			var6 = 0;
			var7 = arg4;
		}
		DataType var8 = this.field12036.method5832();
		OpenGL.glDrawElements(var6, var7, method19076(var8), this.field12036.getAddress() + (long) (var8.field1652 * arg3));
	}

	@ObfuscatedName("aqv.d(I)V")
	public final synchronized void method2120(int arg0) {
		try {
			this.method19078();
		} catch (Exception var14) {
			return;
		}
		int var3 = 0;
		int var4 = arg0 & Integer.MAX_VALUE;
		while (!this.field12000.method14164()) {
			IntWrapper var5 = (IntWrapper) this.field12000.method14154();
			this.field12007[var3++] = (int) var5.field6760;
			this.field10053 -= var5.field11442;
			if (var3 == 1000) {
				OpenGL.glDeleteBuffersARB(var3, this.field12007, 0);
				var3 = 0;
			}
		}
		if (var3 > 0) {
			OpenGL.glDeleteBuffersARB(var3, this.field12007, 0);
			var3 = 0;
		}
		while (!this.field12023.method14164()) {
			IntWrapper var6 = (IntWrapper) this.field12023.method14154();
			this.field12007[var3++] = (int) var6.field6760;
			this.field10052 -= var6.field11442;
			if (var3 == 1000) {
				OpenGL.glDeleteTextures(var3, this.field12007, 0);
				var3 = 0;
			}
		}
		if (var3 > 0) {
			OpenGL.glDeleteTextures(var3, this.field12007, 0);
			var3 = 0;
		}
		while (!this.field12035.method14164()) {
			IntWrapper var7 = (IntWrapper) this.field12035.method14154();
			this.field12007[var3++] = var7.field11442;
			if (var3 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(var3, this.field12007, 0);
				var3 = 0;
			}
		}
		if (var3 > 0) {
			OpenGL.glDeleteFramebuffersEXT(var3, this.field12007, 0);
			var3 = 0;
		}
		while (!this.field12003.method14164()) {
			IntWrapper var8 = (IntWrapper) this.field12003.method14154();
			this.field12007[var3++] = (int) var8.field6760;
			this.field10117 -= var8.field11442;
			if (var3 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(var3, this.field12007, 0);
				var3 = 0;
			}
		}
		if (var3 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(var3, this.field12007, 0);
			boolean var9 = false;
		}
		while (!this.field12011.method14164()) {
			IntWrapper var10 = (IntWrapper) this.field12011.method14154();
			OpenGL.glDeleteLists((int) var10.field6760, var10.field11442);
		}
		while (!this.field12004.method14164()) {
			Node var11 = this.field12004.method14154();
			OpenGL.glDeleteProgram((int) var11.field6760);
		}
		while (!this.field12005.method14164()) {
			Node var12 = this.field12005.method14154();
			OpenGL.glDeleteShader((int) var12.field6760);
		}
		while (!this.field12011.method14164()) {
			IntWrapper var13 = (IntWrapper) this.field12011.method14154();
			OpenGL.glDeleteLists((int) var13.field6760, var13.field11442);
		}
		if (this.method2520() > 100663296 && MonotonicTime.method3655() > this.field12006 + 60000L) {
			System.gc();
			this.field12006 = MonotonicTime.method3655();
		}
		super.method2120(var4);
	}

	@ObfuscatedName("aqv.ahg(II)V")
	public final synchronized void method19072(int arg0, int arg1) {
		IntWrapper var3 = new IntWrapper(arg1);
		var3.field6760 = arg0;
		this.field12000.method14153(var3);
	}

	@ObfuscatedName("aqv.ahh(II)V")
	public final synchronized void method19073(int arg0, int arg1) {
		IntWrapper var3 = new IntWrapper(arg1);
		var3.field6760 = arg0;
		this.field12023.method14153(var3);
	}

	@ObfuscatedName("aqv.ahd(I)V")
	public final synchronized void method19074(int arg0) {
		IntWrapper var2 = new IntWrapper(arg0);
		this.field12035.method14153(var2);
	}

	@ObfuscatedName("aqv.ahn(II)V")
	public final synchronized void method19071(int arg0, int arg1) {
		IntWrapper var3 = new IntWrapper(arg1);
		var3.field6760 = arg0;
		this.field12003.method14153(var3);
	}

	@ObfuscatedName("aqv.ahp(J)V")
	public final synchronized void method19075(long arg0) {
		Node var3 = new Node();
		var3.field6760 = arg0;
		this.field12005.method14153(var3);
	}

	@ObfuscatedName("aqv.ahe(I)V")
	public final synchronized void method19087(int arg0) {
		Node var2 = new Node();
		var2.field6760 = arg0;
		this.field12004.method14153(var2);
	}

	@ObfuscatedName("aqv.ahs(Ldg;)I")
	public static final int method19076(DataType arg0) {
		switch(arg0.field1650) {
			case 0:
				return 5126;
			case 1:
				return 5122;
			case 2:
				return 5124;
			case 3:
				return 5131;
			case 4:
				return 5120;
			case 5:
			default:
				return 5121;
			case 6:
				return 5123;
			case 7:
				return 5121;
			case 8:
				return 5125;
		}
	}

	@ObfuscatedName("aqv.aht(Lck;)I")
	public static int method19085(TextureFormat arg0) {
		switch(arg0.field1278) {
			case 0:
				return 6402;
			case 1:
			case 5:
			default:
				throw new IllegalStateException();
			case 2:
				return 6407;
			case 3:
				return 6410;
			case 4:
				return 6408;
			case 6:
				return 6406;
			case 7:
				return 6409;
		}
	}

	@ObfuscatedName("aqv.ahi(Lck;Ldg;)I")
	public static int method19077(TextureFormat arg0, DataType arg1) {
		if (DataType.UNSIGNED_INT_8 == arg1) {
			switch(arg0.field1278) {
				case 1:
					return 33777;
				case 2:
					return 6407;
				case 3:
					return 6410;
				case 4:
					return 6408;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 6406;
				case 7:
					return 6409;
				case 8:
					return 33779;
			}
		} else if (DataType.UNSIGNED_INT_16 == arg1) {
			switch(arg0.field1278) {
				case 0:
					return 33189;
				case 1:
				case 5:
				default:
					throw new IllegalArgumentException();
				case 2:
					return 32852;
				case 3:
					return 36219;
				case 4:
					return 32859;
				case 6:
					return 32830;
				case 7:
					return 32834;
			}
		} else if (DataType.UNSIGNED_INT_24 == arg1) {
			switch(arg0.field1278) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (DataType.UNSIGNED_INT_32 == arg1) {
			switch(arg0.field1278) {
				case 0:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (DataType.FLOAT_16 == arg1) {
			switch(arg0.field1278) {
				case 2:
					return 34843;
				case 3:
					return 34847;
				case 4:
					return 34842;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34844;
				case 7:
					return 34846;
			}
		} else if (DataType.FLOAT_32 == arg1) {
			switch(arg0.field1278) {
				case 2:
					return 34837;
				case 3:
					return 34841;
				case 4:
					return 34836;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34838;
				case 7:
					return 34840;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aqv.eh(Z)V")
	public void method2253(boolean arg0) {
	}

	@ObfuscatedName("aqv.ahy()V")
	public void method19078() {
		int var1 = 0;
		while (!this.field12020.method1()) {
			if (var1++ > 5) {
				throw new RuntimeException("");
			}
			PreciseSleep.sleep(1000L);
		}
	}

	@ObfuscatedName("aqv.wp(I)V")
	public void method16081(int arg0) {
		if (!this.field12029) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@ObfuscatedName("aqv.g()Ljava/lang/String;")
	public String method2132() {
		String var1 = "Caps: 4:";
		String var2 = ":";
		String var3 = var1 + this.field10180 + var2;
		String var4 = var3 + this.field12027 + var2;
		String var5 = var4 + this.field10186 + var2;
		String var6 = var5 + this.field10094 + var2;
		String var7 = var6 + (this.field12013 ? 1 : 0) + var2;
		String var8 = var7 + (this.field10172 ? 1 : 0) + var2;
		String var9 = var8 + (this.field12024 ? 1 : 0) + var2;
		String var10 = var9 + (this.field12026 ? 1 : 0) + var2;
		String var11 = var10 + (this.field12032 ? 1 : 0) + var2;
		String var12 = var11 + (this.field12025 ? 1 : 0) + var2;
		String var13 = var12 + (this.field10125 ? 1 : 0) + var2;
		String var14 = var13 + (this.field12002 ? 1 : 0) + var2;
		String var15 = var14 + (this.field10192 ? 1 : 0) + var2;
		String var16 = var15 + (this.field12022 ? 1 : 0) + var2;
		String var17 = var16 + (this.field10159 ? 1 : 0) + var2;
		String var18 = var17 + (this.field10134 ? 1 : 0) + var2;
		String var19 = var18 + (this.field10199 ? 1 : 0) + var2;
		String var20 = var19 + (this.field10074 ? 1 : 0) + var2;
		return var20 + OpenGL.glGetString(35724).toLowerCase();
	}
}
