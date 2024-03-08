package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jagdx.*;

import java.awt.*;

@ObfuscatedName("aqd")
public class class1126 extends GpuRenderer {

	@ObfuscatedName("aqd.hx")
	public final int field11956;

	@ObfuscatedName("aqd.hq")
	public final int field11954;

	@ObfuscatedName("aqd.hf")
	public long field11955 = 0L;

	@ObfuscatedName("aqd.hr")
	public long field11978 = 0L;

	@ObfuscatedName("aqd.hs")
	public final D3DPRESENT_PARAMETERS field11957;

	@ObfuscatedName("aqd.hh")
	public final D3DDISPLAYMODE field11958;

	@ObfuscatedName("aqd.hp")
	public IterableQueue field11959 = new IterableQueue();

	@ObfuscatedName("aqd.hy")
	public boolean field11960 = false;

	@ObfuscatedName("aqd.he")
	public long field11961 = 0L;

	@ObfuscatedName("aqd.hn")
	public long field11988 = 0L;

	@ObfuscatedName("aqd.hi")
	public long field11970 = 0L;

	@ObfuscatedName("aqd.hw")
	public boolean field11989 = false;

	@ObfuscatedName("aqd.ht")
	public boolean[] field11965;

	@ObfuscatedName("aqd.hc")
	public boolean[] field11966;

	@ObfuscatedName("aqd.ho")
	public boolean[] field11981;

	@ObfuscatedName("aqd.hj")
	public boolean[] field11977;

	@ObfuscatedName("aqd.hv")
	public class343[] field11969;

	@ObfuscatedName("aqd.hz")
	public int[] field11962;

	@ObfuscatedName("aqd.ij")
	public Matrix4x4 field11968;

	@ObfuscatedName("aqd.io")
	public class887 field11972;

	@ObfuscatedName("aqd.iq")
	public long field11973;

	@ObfuscatedName("aqd.ig")
	public final D3DCAPS field11974;

	@ObfuscatedName("aqd.iv")
	public final boolean field11975;

	@ObfuscatedName("aqd.ie")
	public final boolean field11976;

	@ObfuscatedName("aqd.iu")
	public final boolean field11967;

	@ObfuscatedName("aqd.in")
	public final boolean field11963;

	@ObfuscatedName("aqd.ir")
	public final boolean field11979;

	@ObfuscatedName("aqd.it")
	public final boolean field11980;

	@ObfuscatedName("aqd.ix")
	public final boolean field11971;

	@ObfuscatedName("aqd.is")
	public final boolean field11953;

	@ObfuscatedName("aqd.ib")
	public final boolean field11983;

	@ObfuscatedName("aqd.il")
	public boolean field11984;

	@ObfuscatedName("aqd.iw")
	public final float[] field11985 = new float[16];

	@ObfuscatedName("aqd.ip")
	public int field11986 = 128;

	@ObfuscatedName("aqd.id")
	public int field11982 = 0;

	@ObfuscatedName("aqd.ia")
	public long[] field11992 = new long[this.field11986];

	@ObfuscatedName("aqd.ih")
	public long field11990 = 0L;

	@ObfuscatedName("aqd.iy")
	public long[] field11991 = new long[3];

	@ObfuscatedName("aqd.ii")
	public long[] field11994 = new long[3];

	@ObfuscatedName("aqd.iz")
	public int[] field11993 = new int[3];

	@ObfuscatedName("aqd.ik")
	public int field11987 = 0;

	@ObfuscatedName("aqd.im")
	public int field11995 = 0;

	@ObfuscatedName("aqd.ic")
	public static final int[] field11996 = new int[] { 77, 80 };

	@ObfuscatedName("aqd.jd")
	public static final int[] field11997 = new int[] { 22, 23 };

	@ObfuscatedName("aqd.rx()Z")
	public boolean method15957() {
		return (this.field11974.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@ObfuscatedName("aqd.ry()Z")
	public boolean method15958() {
		return (this.field11974.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@ObfuscatedName("aqd.rg(Z)Z")
	public boolean method15959(boolean arg0) {
		if (arg0) {
			return this.field11953;
		} else {
			return this.field11953 && this.field11983;
		}
	}

	@ObfuscatedName("aqd.ahu(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;Ljava/lang/Integer;)Ldh;")
	public static Renderer method19043(Canvas arg0, class125 arg1, class143 arg2, class383 arg3, class381 arg4, class378 arg5, Js5 arg6, Integer arg7) {
		class1126 var8 = null;
		try {
			byte var9 = 0;
			byte var10 = 1;
			long var11 = IDirect3D.Direct3DCreate();
			D3DCAPS var13 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(var11, var9, var10, var13);
			if ((var13.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (var13.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((var13.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((var13.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((var13.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((var13.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((var13.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((var13.SrcBlendCaps & var13.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((var13.SrcBlendCaps & var13.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((var13.SrcBlendCaps & var13.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (var13.MaxActiveLights > 0 && var13.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (var13.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				D3DPRESENT_PARAMETERS var14 = new D3DPRESENT_PARAMETERS(arg0);
				var14.Windowed = true;
				var14.EnableAutoDepthStencil = true;
				var14.BackBufferWidth = arg0.getWidth();
				var14.BackBufferHeight = arg0.getHeight();
				var14.BackBufferCount = 1;
				var14.PresentationInterval = Integer.MIN_VALUE;
				D3DDISPLAYMODE var15 = new D3DDISPLAYMODE();
				if (!method19016(var9, var10, var11, arg7, var15, var14)) {
					throw new RuntimeException("");
				}
				int var16 = 0;
				if ((var13.DevCaps & 0x100000) != 0) {
					var16 |= 0x10;
				}
				long var17 = 0L;
				long var19;
				try {
					var19 = IDirect3D.CreateDeviceContext(var11, var9, var10, arg0, var16 | 0x40, var14);
				} catch (class7 var23) {
					var19 = IDirect3D.CreateDeviceContext(var11, var9, var10, arg0, var16 & 0xFFEFFFFF | 0x20, var14);
				}
				var8 = new class1126(var9, var10, var11, var19, var15, var14, var13, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!var8.field1613.containsKey(arg0)) {
					Statics.method6020(arg0);
					var8.method2138(arg0, new class935(var8, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				var8.method2140(arg0);
				var8.method15969();
				return var8;
			}
		} catch (RuntimeException var24) {
			if (var8 != null) {
				var8.method2369();
			}
			throw var24;
		}
	}

	public class1126(int arg0, int arg1, long arg2, long arg3, D3DDISPLAYMODE arg4, D3DPRESENT_PARAMETERS arg5, D3DCAPS arg6, class125 arg7, class143 arg8, class383 arg9, class381 arg10, class378 arg11, Js5 arg12, int arg13) {
		super(arg7, arg8, arg9, arg10, arg11, arg12, arg13, 0);
		try {
			this.field11956 = arg0;
			this.field11954 = arg1;
			this.field11955 = arg2;
			this.field11978 = arg3;
			this.field11958 = arg4;
			this.field11957 = arg5;
			this.field11974 = arg6;
			this.field11961 = D3DLIGHT.Create();
			this.field11988 = D3DLIGHT.Create();
			this.field11970 = D3DLIGHT.Create();
			this.field10186 = this.field11974.MaxSimultaneousTextures;
			this.field10094 = this.field11974.MaxActiveLights > 0 ? this.field11974.MaxActiveLights : 8;
			this.field11975 = (this.field11974.TextureCaps & 0x2) == 0;
			this.field10192 = (this.field11974.TextureCaps & 0x800) != 0;
			this.field10125 = (this.field11974.TextureCaps & 0x2000) != 0;
			this.field11963 = (this.field11974.TextureCaps & 0x8000) != 0;
			this.field11967 = (this.field11974.TextureCaps & 0x10000) != 0;
			this.field11976 = (this.field11974.TextureCaps & 0x4000) != 0;
			this.field10159 = this.field11974.NumSimultaneousRTs > 0;
			this.field10116 = this.field10159;
			this.field10134 = this.field11974.NumSimultaneousRTs > 0;
			this.field10172 = this.field10180 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field11955, this.field11956, this.field11954, this.field11957.BackBufferFormat, true, 2) == 0;
			this.field10199 = this.field11974.NumSimultaneousRTs > 0 && this.field10180 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field11955, this.field11956, this.field11954, 113, true, 2) == 0;
			this.field11979 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.field11957.BackBufferFormat, 0, 1, method16082('A', 'T', 'O', 'C')) == 0;
			this.field11980 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.field11957.BackBufferFormat, 0, 1, method16082('A', '2', 'M', '1')) == 0;
			this.field11971 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.field11957.BackBufferFormat, 0, 1, method16082('S', 'S', 'A', 'A')) == 0;
			this.field10074 = (this.field11974.PrimitiveMiscCaps & 0x20000) != 0;
			this.field11953 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.field11958.Format, 524288, 3, 113) == 0;
			this.field11983 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.field11958.Format, 524288, 3, 116) == 0;
			this.field11965 = new boolean[this.field10186];
			this.field11966 = new boolean[this.field10186];
			this.field11981 = new boolean[this.field10186];
			this.field11969 = new class343[this.field10186];
			this.field11977 = new boolean[this.field10186];
			this.field11962 = new int[this.field10186];
			Matrix4x3 var17 = new Matrix4x3();
			var17.method6348(1.0F, -1.0F, 0.5F);
			var17.method6315(0.0F, 0.0F, 0.5F);
			this.field11968 = new Matrix4x4();
			this.field11968.method6609(var17);
			IDirect3DDevice.BeginScene(this.field11978);
		} catch (Throwable var19) {
			var19.printStackTrace();
			this.method2578();
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aqd.sm()V")
	public void method16105() {
		for (class984 var1 = (class984) this.field11959.method14191(); var1 != null; var1 = (class984) this.field11959.method14161()) {
			class406 var2 = (class406) var1.field11436;
			var2.method6220();
			if (this.field1614 == var2) {
				var2.method1630();
			}
		}
		super.method16105();
	}

	@ObfuscatedName("aqd.sx()V")
	public void method15973() {
		this.method2126();
		for (class984 var1 = (class984) this.field11959.method14191(); var1 != null; var1 = (class984) this.field11959.method14161()) {
			class406 var2 = (class406) var1.field11436;
			var2.method1629();
		}
		super.method15973();
	}

	@ObfuscatedName("aqd.ahz(II)Z")
	public boolean method19019(int arg0, int arg1) {
		int var3 = IDirect3DDevice.TestCooperativeLevel(this.field11978);
		if (var3 == 0 || var3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.field11978, 0L);
			for (int var4 = 1; var4 < 4; var4++) {
				IDirect3DDevice.SetRenderTarget(this.field11978, var4, 0L);
			}
			for (int var5 = 0; var5 < 4; var5++) {
				IDirect3DDevice.SetStreamSource(this.field11978, var5, 0L, 0, 0);
			}
			for (int var6 = 0; var6 < 4; var6++) {
				IDirect3DDevice.SetTexture(this.field11978, var6, 0L);
			}
			IDirect3DDevice.SetIndices(this.field11978, 0L);
			this.method15973();
			this.field11957.BackBufferWidth = arg0;
			this.field11957.BackBufferHeight = arg1;
			this.field11957.BackBufferCount = 1;
			if (method19016(this.field11956, this.field11954, this.field11955, this.field10180, this.field11958, this.field11957)) {
				int var7 = IDirect3DDevice.Reset(this.field11978, this.field11957);
				if (class0.method35(var7)) {
					this.field11960 = false;
					this.method16105();
					this.method16232();
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("aqd.sw()V")
	public void method16232() {
		for (int var1 = 0; var1 < this.field10186; var1++) {
			IDirect3DDevice.SetSamplerState(this.field11978, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.field11978, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.field11978, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.field11978, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.field11978, var1, 2, 1);
			this.field11969[var1] = class343.field3323;
			boolean[] var2 = this.field11965;
			this.field11966[var1] = true;
			var2[var1] = true;
			this.field11977[var1] = false;
			this.field11962[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.field11978, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.field11978, 9, 2);
		IDirect3DDevice.SetRenderState(this.field11978, 23, 4);
		IDirect3DDevice.SetRenderState(this.field11978, 25, 5);
		IDirect3DDevice.SetRenderState(this.field11978, 24, 0);
		IDirect3DDevice.method43(this.field11978, 206, this.field10074);
		IDirect3DDevice.SetRenderState(this.field11978, 181, 0);
		this.method19007();
		IDirect3DDevice.SetRenderState(this.field11978, 147, 1);
		IDirect3DDevice.SetRenderState(this.field11978, 145, 1);
		IDirect3DDevice.method42(this.field11978, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.field11978, 35, 3);
		IDirect3DDevice.method42(this.field11978, 154, 1.0F);
		D3DLIGHT.SetType(this.field11961, 3);
		D3DLIGHT.SetType(this.field11988, 3);
		D3DLIGHT.SetType(this.field11970, 1);
		this.field11989 = false;
		super.method16232();
	}

	@ObfuscatedName("aqd.f()Lcz;")
	public class108 method2272() {
		D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.field11955, this.field11956, 0, var1);
		return new class108(var1.VendorID, this.method16279() ? "Direct3D FF" : "Direct3D", 9, var1.Description, var1.DriverVersion, this.method16279());
	}

	@ObfuscatedName("aqd.l(II)V")
	public void method2116(int arg0, int arg1) throws class1106 {
		if (this.field11960) {
			if (!this.method19019(this.field1612.method1627(), this.field1612.method1628())) {
				return;
			}
			((class935) this.field1612).method6220();
		} else {
			IDirect3DDevice.EndScene(this.field11978);
		}
		int var3 = this.field1612.method15451();
		if (class0.method34(var3)) {
			this.field11960 = true;
			this.field1612.method1629();
		} else {
			IDirect3DDevice.BeginScene(this.field11978);
			if (this.field1596 != null) {
				this.field1596.method1982();
			}
		}
	}

	@ObfuscatedName("aqd.u()V")
	public void method2117() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.field11978);
		if (class0.method35(IDirect3DEventQuery.Issue(var1))) {
			while (true) {
				int var3 = IDirect3DEventQuery.IsSignaled(var1);
				if (var3 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(var1);
	}

	@ObfuscatedName("aqd.p()V")
	public void method2369() {
		super.method2369();
		if (this.field11961 != 0L) {
			D3DLIGHT.Destroy(this.field11961);
			this.field11961 = 0L;
		}
		if (this.field11988 != 0L) {
			D3DLIGHT.Destroy(this.field11988);
			this.field11988 = 0L;
		}
		if (this.field11970 != 0L) {
			D3DLIGHT.Destroy(this.field11970);
			this.field11970 = 0L;
		}
		if (this.field11978 != 0L) {
			IDirect3DDevice.Destroy(this.field11978);
			this.field11978 = 0L;
		}
		if (this.field11955 != 0L) {
			IUnknown.Release(this.field11955);
			this.field11955 = 0L;
		}
	}

	public void finalize() {
		super.finalize();
	}

	@ObfuscatedName("aqd.sr()F")
	public float method15954() {
		return -0.5F;
	}

	@ObfuscatedName("aqd.am()Lafq;")
	public Framebuffer method2145() {
		return new class1215(this);
	}

	@ObfuscatedName("aqd.ad(Ljava/awt/Canvas;II)Lafy;")
	public class841 method2144(Canvas arg0, int arg1, int arg2) {
		return new class935(this, arg0, arg1, arg2, false);
	}

	@ObfuscatedName("aqd.au(IILck;Ldg;I)Ldp;")
	public class130 method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
		return new class410(this, arg2, arg3, arg0, arg1, arg4);
	}

	@ObfuscatedName("aqd.ar(II)Ldw;")
	public class126 method2121(int arg0, int arg1) {
		return new class411(this, DataType.field1649, arg0, arg1, 0);
	}

	@ObfuscatedName("aqd.ap(III)Ldw;")
	public class126 method2356(int arg0, int arg1, int arg2) {
		return new class411(this, DataType.field1649, arg0, arg1, arg2);
	}

	@ObfuscatedName("aqd.aha(Loz;)Lake;")
	public class984 method19005(class406 arg0) {
		for (class984 var2 = (class984) this.field11959.method14191(); var2 != null; var2 = (class984) this.field11959.method14161()) {
			if (var2.field11436 == arg0) {
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("aqd.ahx(Loz;)V")
	public void method18995(class406 arg0) {
		if (this.method19005(arg0) == null) {
			this.field11959.method14153(new class984(arg0));
		}
	}

	@ObfuscatedName("aqd.ahb(Loz;)V")
	public void method19000(class406 arg0) {
		class984 var2 = this.method19005(arg0);
		if (var2 != null) {
			var2.method8440();
		}
	}

	@ObfuscatedName("aqd.aq(IIII)[I")
	public int[] method2149(int arg0, int arg1, int arg2, int arg3) {
		this.method2202();
		int[] var5 = null;
		long var6 = IDirect3DDevice.GetRenderTarget(this.field11978, 0);
		long var8 = IDirect3DDevice.CreateRenderTarget(this.field11978, arg2, arg3, 21, 0, 0, true);
		int var10 = IDirect3DDevice.StretchRect(this.field11978, var6, arg0, arg1, arg2, arg3, var8, 0, 0, arg2, arg3, 1);
		this.method15961(arg2 * arg3 * 4);
		if (class0.method35(var10)) {
			var5 = new int[arg2 * arg3];
			IDirect3DSurface.Download(var8, 0, 0, arg2, arg3, arg2 * 4, 16, this.field10046);
			this.field10071.clear();
			this.field10071.asIntBuffer().get(var5);
		}
		IUnknown.Release(var6);
		IUnknown.Release(var8);
		return var5;
	}

	@ObfuscatedName("aqd.ax()V")
	public void method2150() {
	}

	@ObfuscatedName("aqd.av()Z")
	public boolean method2360() {
		return true;
	}

	@ObfuscatedName("aqd.aho(II)V")
	public void method19024(int arg0, int arg1) {
		this.method2126();
		this.method2419(arg0, arg1);
		this.field11990 = IDirect3DDevice.CreateRenderTarget(this.field11978, arg0, arg1, method19011(TextureFormat.field1273, DataType.field1645), 0, 0, false);
		for (int var3 = 0; var3 < 3; var3++) {
			this.field11994[var3] = IDirect3DDevice.CreateOffscreenPlainSurface(this.field11978, arg0, arg1, method19011(TextureFormat.field1273, DataType.field1645), 2);
		}
		this.method15961(arg0 * arg1 * 4);
	}

	@ObfuscatedName("aqd.ao()Z")
	public boolean method2196() {
		if (this.field11960) {
			return false;
		} else {
			return this.field11991[this.field11995] == 0L;
		}
	}

	@ObfuscatedName("aqd.aj()Z")
	public boolean method2153() {
		return true;
	}

	@ObfuscatedName("aqd.ay()Z")
	public boolean method2304() {
		return false;
	}

	@ObfuscatedName("aqd.aa(III)V")
	public void method2163(int arg0, int arg1, int arg2) {
		if (this.field11990 == 0L) {
			this.method19024(arg1, arg2);
		}
		long var4 = IDirect3DDevice.GetRenderTarget(this.field11978, 0);
		if (class0.method34(IDirect3DDevice.StretchRect(this.field11978, var4, 0, 0, this.field1614.method1627(), this.field1614.method1628(), this.field11990, this.field1611, this.field1618, this.field1619, this.field1610, 2))) {
		}
		IUnknown.Release(var4);
		IDirect3DDevice.GetRenderTargetData(this.field11978, this.field11990, this.field11994[this.field11995]);
		long var6 = IDirect3DDevice.CreateEventQuery(this.field11978);
		if (class0.method35(IDirect3DEventQuery.Issue(var6))) {
			this.field11991[this.field11995] = var6;
		}
		this.field11993[this.field11995] = arg0;
		if (++this.field11995 >= 3) {
			this.field11995 = 0;
		}
	}

	@ObfuscatedName("aqd.ab()I")
	public int method2502() {
		if (this.field11991[this.field11987] == 0L) {
			return -1;
		} else if (class0.method35(IDirect3DEventQuery.IsSignaled(this.field11991[this.field11987]))) {
			return this.field11993[this.field11987];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aqd.az()V")
	public void method2156() {
		for (int var1 = 0; var1 < 3; var1++) {
			if (this.field11991[var1] != 0L) {
				IUnknown.Release(this.field11991[var1]);
				this.field11991[var1] = 0L;
			}
		}
		this.field11995 = 0;
		this.field11987 = 0;
	}

	@ObfuscatedName("aqd.af(II)J")
	public long method2158(int arg0, int arg1) {
		return this.method18996(arg0, arg1, null, null);
	}

	@ObfuscatedName("aqd.an(II[I[I)V")
	public void method2160(int arg0, int arg1, int[] arg2, int[] arg3) {
		this.method18996(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqd.ahg(II[I[I)J")
	public long method18996(int arg0, int arg1, int[] arg2, int[] arg3) {
		if (this.field11991[this.field11987] != 0L) {
			IUnknown.Release(this.field11991[this.field11987]);
			this.field11991[this.field11987] = 0L;
		}
		this.field10071.clear();
		IDirect3DSurface.Download(this.field11994[this.field11987], 0, 0, arg0, arg1, arg0 * 4, 0, this.field10046);
		if (++this.field11987 >= 3) {
			this.field11987 = 0;
		}
		if (arg2 == null) {
			return this.field10046;
		} else {
			this.field10071.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@ObfuscatedName("aqd.ak(J)V")
	public void method2159(long arg0) {
	}

	@ObfuscatedName("aqd.bl()V")
	public void method2126() {
		if (this.field11990 != 0L) {
			IUnknown.Release(this.field11990);
			this.field11990 = 0L;
		}
		for (int var1 = 0; var1 < 3; var1++) {
			if (this.field11991[var1] != 0L) {
				IUnknown.Release(this.field11991[var1]);
				this.field11991[var1] = 0L;
			}
			if (this.field11994[var1] != 0L) {
				IUnknown.Release(this.field11994[var1]);
				this.field11994[var1] = 0L;
			}
		}
		this.field11995 = 0;
		this.field11987 = 0;
	}

	@ObfuscatedName("aqd.dl(Ldz;Ldz;FLdz;)Ldz;")
	public class117 method2435(class117 arg0, class117 arg1, float arg2, class117 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("aqd.bm(II)V")
	public void method2475(int arg0, int arg1) {
		IDirect3DDevice.Clear(this.field11978, arg0, arg1, 1.0F, 0);
	}

	@ObfuscatedName("aqd.sa()V")
	public void method15997() {
		if (this.field1614 != null) {
			IDirect3DDevice.SetViewport(this.field11978, this.field10105 + this.field10101, this.field10132 + this.field10102, this.field10103, this.field10104, this.field10087, this.field10088);
		}
	}

	@ObfuscatedName("aqd.sb()V")
	public void method15955() {
		IDirect3DDevice.SetScissorRect(this.field11978, this.field10105 + this.field10095, this.field10138 + this.field10132, this.field10193, this.field10106);
	}

	@ObfuscatedName("aqd.sj()V")
	public void method15999() {
		IDirect3DDevice.method43(this.field11978, 174, this.field10182);
	}

	@ObfuscatedName("aqd.ahh(J)V")
	public final void method19032(long arg0) {
		this.field11973 = arg0;
		IDirect3DDevice.SetVertexShader(this.field11978, arg0);
	}

	@ObfuscatedName("aqd.ahd(J)V")
	public final void method18998(long arg0) {
		IDirect3DDevice.SetPixelShader(this.field11978, arg0);
	}

	@ObfuscatedName("aqd.rn(Lpq;Lpq;Lpq;)V")
	public void method15967(Matrix4x4 arg0, Matrix4x4 arg1, Matrix4x4 arg2) {
		IDirect3DDevice.SetTransform(this.field11978, 256, arg0.field4315);
		IDirect3DDevice.SetTransform(this.field11978, 2, arg1.field4315);
		IDirect3DDevice.SetTransform(this.field11978, 3, arg2.field4315);
	}

	@ObfuscatedName("aqd.ti(Lpq;)V")
	public void method16006(Matrix4x4 arg0) {
		arg0.method6720(this.field11968);
	}

	@ObfuscatedName("aqd.tp()V")
	public void method16016() {
		IDirect3DDevice.method43(this.field11978, 7, this.field10109 && this.field10044);
	}

	@ObfuscatedName("aqd.tv()V")
	public void method16017() {
		IDirect3DDevice.method43(this.field11978, 14, this.field10107 && this.field10108);
	}

	@ObfuscatedName("aqd.tg()V")
	public void method16233() {
		if (this.field10099) {
			IDirect3DDevice.method43(this.field11978, 137, this.field10111 && !this.field10113);
		}
	}

	@ObfuscatedName("aqd.tq()V")
	public void method15990() {
		if (this.field10099) {
			D3DLIGHT.SetAmbient(this.field11961, this.field10142 * this.field10122, this.field10122 * this.field10120, this.field10210 * this.field10122, 0.0F);
			this.field11989 = false;
		}
	}

	@ObfuscatedName("aqd.tx()V")
	public void method16021() {
		if (!this.field10099) {
			return;
		}
		float var1 = this.field10112 ? this.field10123 : 0.0F;
		float var2 = this.field10112 ? -this.field10124 : 0.0F;
		D3DLIGHT.SetDiffuse(this.field11961, this.field10142 * var1, this.field10120 * var1, this.field10210 * var1, 0.0F);
		D3DLIGHT.SetDiffuse(this.field11988, this.field10142 * var2, this.field10120 * var2, this.field10210 * var2, 0.0F);
		this.field11989 = false;
	}

	@ObfuscatedName("aqd.tk()V")
	public void method16307() {
		if (this.field10099) {
			D3DLIGHT.SetDirection(this.field11961, -this.field10114[0], -this.field10114[1], -this.field10114[2]);
			D3DLIGHT.SetDirection(this.field11988, -this.field10072[0], -this.field10072[1], -this.field10072[2]);
			this.field11989 = false;
		}
	}

	@ObfuscatedName("aqd.td()V")
	public void method16024() {
		this.method16021();
		this.method16023();
	}

	@ObfuscatedName("aqd.tl()V")
	public void method16023() {
		if (!this.field10099 || this.field11989) {
			return;
		}
		IDirect3DDevice.LightEnable(this.field11978, 0, false);
		IDirect3DDevice.LightEnable(this.field11978, 1, false);
		IDirect3DDevice.SetLight(this.field11978, 0, this.field11961);
		IDirect3DDevice.SetLight(this.field11978, 1, this.field11988);
		IDirect3DDevice.LightEnable(this.field11978, 0, true);
		IDirect3DDevice.LightEnable(this.field11978, 1, true);
		this.field11989 = true;
	}

	@ObfuscatedName("aqd.um()V")
	public void method16025() {
		int var1;
		for (var1 = 0; var1 < this.field10127; var1++) {
			Light var2 = this.field10045[var1];
			int var3 = var1 + 2;
			int var4 = var2.method17624();
			float var5 = var2.method17610() / 255.0F;
			D3DLIGHT.SetPosition(this.field11970, (float) var2.method17605(), (float) var2.method17606(), (float) var2.method17607());
			D3DLIGHT.SetDiffuse(this.field11970, (float) (var4 >> 16 & 0xFF) * var5, (float) (var4 >> 8 & 0xFF) * var5, (float) (var4 & 0xFF) * var5, 0.0F);
			D3DLIGHT.SetAttenuation(this.field11970, 0.0F, 0.0F, 1.0F / (float) (var2.method17608() * var2.method17608()));
			D3DLIGHT.SetRange(this.field11970, (float) var2.method17608());
			IDirect3DDevice.SetLight(this.field11978, var3, this.field11970);
			IDirect3DDevice.LightEnable(this.field11978, var3, true);
		}
		while (var1 < this.field10126) {
			IDirect3DDevice.LightEnable(this.field11978, var1 + 2, false);
			var1++;
		}
	}

	@ObfuscatedName("aqd.uq(Lck;Ldg;)Z")
	public boolean method16026(TextureFormat arg0, DataType arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return class0.method35(IDirect3D.GetAdapterDisplayMode(this.field11955, this.field11956, var3)) && class0.method35(IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, var3.Format, 0, 3, method19011(arg0, arg1)));
	}

	@ObfuscatedName("aqd.uc(Lck;Ldg;)Z")
	public boolean method16289(TextureFormat arg0, DataType arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return class0.method35(IDirect3D.GetAdapterDisplayMode(this.field11955, this.field11956, var3)) && class0.method35(IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, var3.Format, 0, 4, method19011(arg0, arg1)));
	}

	@ObfuscatedName("aqd.uz(Lck;Ldg;II)Llz;")
	public GpuTexture method16030(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
		return new class925(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqd.uj(IIZ[III)Llz;")
	public GpuTexture method16033(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new class925(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqd.ug(Lck;IIZ[BII)Llz;")
	public GpuTexture method15975(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		return new class925(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aqd.ub(Lck;IIZ[FII)Llz;")
	public GpuTexture method16032(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new class925(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aqd.uy(Lck;Ldg;II)Lmo;")
	public class359 method16089(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
		return new class926(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqd.ut(IZ[[I)Lmr;")
	public GpuCubeTexture method16034(int arg0, boolean arg1, int[][] arg2) {
		return new class929(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("aqd.uk(Lck;IIIZ[B)Lll;")
	public VolumeTexture method16197(TextureFormat arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new class917(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqd.ahn(Lop;)V")
	public final void method19001(class408 arg0) {
		IDirect3DDevice.SetTexture(this.field11978, this.field10177, arg0.method6225());
		if (this.field10099 && !this.field11981[this.field10177]) {
			this.field11981[this.field10177] = true;
			this.method16052();
			this.method16256();
		}
	}

	@ObfuscatedName("aqd.ahp(Laiy;)V")
	public final void method19002(class925 arg0) {
		this.method19001(arg0);
		if (this.field11965[this.field10177] != arg0.field10669) {
			IDirect3DDevice.SetSamplerState(this.field11978, this.field10177, 1, arg0.field10669 ? 1 : 3);
			this.field11965[this.field10177] = arg0.field10669;
		}
		if (this.field11966[this.field10177] != arg0.field10670) {
			IDirect3DDevice.SetSamplerState(this.field11978, this.field10177, 2, arg0.field10670 ? 1 : 3);
			this.field11966[this.field10177] = arg0.field10670;
		}
	}

	@ObfuscatedName("aqd.ahe(Lahy;)V")
	public final void method19003(class917 arg0) {
		this.method19001(arg0);
		if (!this.field11965[this.field10177]) {
			IDirect3DDevice.SetSamplerState(this.field11978, this.field10177, 1, 1);
			this.field11965[this.field10177] = true;
		}
		if (!this.field11966[this.field10177]) {
			IDirect3DDevice.SetSamplerState(this.field11978, this.field10177, 2, 1);
			this.field11966[this.field10177] = true;
		}
	}

	@ObfuscatedName("aqd.ud()V")
	public void method16091() {
		if (this.field11981[this.field10177]) {
			this.field11981[this.field10177] = false;
			IDirect3DDevice.SetTexture(this.field11978, this.field10177, 0L);
			this.method16052();
			this.method16256();
		}
	}

	@ObfuscatedName("aqd.vo()V")
	public void method16050() {
		if (this.field11973 != 0L || this.field10135[this.field10177] == class352.field3372) {
			IDirect3DDevice.SetTextureStageState(this.field11978, this.field10177, 24, 0);
			this.field11962[this.field10177] = 0;
			return;
		}
		if (this.field10135[this.field10177] == class352.field3370) {
			IDirect3DDevice.SetTransform(this.field11978, this.field10177 + 16, this.field10162[this.field10177].method6638(this.field11985));
		} else {
			IDirect3DDevice.SetTransform(this.field11978, this.field10177 + 16, this.field10162[this.field10177].method6594(this.field11985));
		}
		int var1 = method19006(this.field10135[this.field10177]);
		if (this.field11962[this.field10177] != var1) {
			IDirect3DDevice.SetTextureStageState(this.field11978, this.field10177, 24, var1);
			this.field11962[this.field10177] = var1;
		}
	}

	@ObfuscatedName("aqd.vv()V")
	public void method16051() {
	}

	@ObfuscatedName("aqd.vw()V")
	public void method16256() {
		if (this.field10099) {
			int var1 = this.field11981[this.field10177] ? method19027(this.field10136[this.field10177]) : 1;
			IDirect3DDevice.SetTextureStageState(this.field11978, this.field10177, 1, var1);
		}
	}

	@ObfuscatedName("aqd.vt()V")
	public void method16052() {
		if (this.field10099) {
			int var1 = this.field11981[this.field10177] ? method19027(this.field10137[this.field10177]) : 1;
			IDirect3DDevice.SetTextureStageState(this.field11978, this.field10177, 4, var1);
		}
	}

	@ObfuscatedName("aqd.ur(ILmn;ZZ)V")
	public final void method16031(int arg0, class351 arg1, boolean arg2, boolean arg3) {
		if (!this.field10099) {
			return;
		}
		int var5 = 0;
		byte var6;
		switch(arg0) {
			case 1:
				var6 = 3;
				break;
			case 2:
				var6 = 26;
				break;
			default:
				var6 = 2;
		}
		if (arg2) {
			var5 |= 0x20;
		}
		if (arg3) {
			var5 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.field11978, this.field10177, var6, method18999(arg1) | var5);
	}

	@ObfuscatedName("aqd.uo(ILmn;Z)V")
	public final void method16043(int arg0, class351 arg1, boolean arg2) {
		if (!this.field10099) {
			return;
		}
		int var4 = 0;
		byte var5;
		switch(arg0) {
			case 1:
				var5 = 6;
				break;
			case 2:
				var5 = 27;
				break;
			default:
				var5 = 5;
		}
		if (arg2) {
			var4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.field11978, this.field10177, var5, method18999(arg1) | var4);
	}

	@ObfuscatedName("aqd.vr()V")
	public final void method16049() {
		if (this.field10099) {
			IDirect3DDevice.SetRenderState(this.field11978, 60, this.field10160);
		}
	}

	@ObfuscatedName("aqd.ahs(Lmk;)I")
	public static final int method19027(class355 arg0) {
		switch(arg0.field3394) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aqd.aht(Lmn;)I")
	public static final int method18999(class351 arg0) {
		switch(arg0.field3369) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aqd.ahi(Lmv;)I")
	public static final int method19006(class352 arg0) {
		switch(arg0.field3376) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@ObfuscatedName("aqd.vy(I)V")
	public void method16057(int arg0) {
		IDirect3DDevice.SetRenderState(this.field11978, 168, arg0);
	}

	@ObfuscatedName("aqd.ve()V")
	public void method16058() {
		IDirect3DDevice.method43(this.field11978, 15, this.field10091);
		IDirect3DDevice.SetRenderState(this.field11978, 24, this.field10178 & 0xFF);
		if (this.field11957.MultiSampleType <= 0) {
			return;
		}
		if (this.field10091 && this.field10178 != 0) {
			if (this.field11971) {
				IDirect3DDevice.SetRenderState(this.field11978, 181, method16082('S', 'S', 'A', 'A'));
			} else if (this.field11979) {
				IDirect3DDevice.SetRenderState(this.field11978, 181, method16082('A', 'T', 'O', 'C'));
			} else if (this.field11980) {
				IDirect3DDevice.SetRenderState(this.field11978, 154, method16082('A', '2', 'M', '1'));
			}
		} else if (this.field11971 || this.field11979) {
			IDirect3DDevice.SetRenderState(this.field11978, 181, 0);
		} else if (this.field11980) {
			IDirect3DDevice.method42(this.field11978, 154, 1.0F);
		}
	}

	@ObfuscatedName("aqd.vm()V")
	public void method16059() {
		switch(this.field10211.field3360) {
			case 0:
				IDirect3DDevice.SetRenderState(this.field11978, 19, 2);
				IDirect3DDevice.SetRenderState(this.field11978, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.field11978, 19, 9);
				IDirect3DDevice.SetRenderState(this.field11978, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.field11978, 19, 5);
				IDirect3DDevice.SetRenderState(this.field11978, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.field11978, 19, 2);
				IDirect3DDevice.SetRenderState(this.field11978, 20, 2);
		}
		switch(this.field10174) {
			case 0:
				IDirect3DDevice.SetRenderState(this.field11978, 207, 1);
				IDirect3DDevice.SetRenderState(this.field11978, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.field11978, 207, 2);
				IDirect3DDevice.SetRenderState(this.field11978, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.field11978, 207, 2);
				IDirect3DDevice.SetRenderState(this.field11978, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.field11978, 207, 1);
				IDirect3DDevice.SetRenderState(this.field11978, 208, 2);
		}
	}

	@ObfuscatedName("aqd.vg()V")
	public void method16175() {
		IDirect3DDevice.method43(this.field11978, 27, this.field10176);
	}

	@ObfuscatedName("aqd.ahy()V")
	public void method19007() {
		IDirect3DDevice.SetRenderState(this.field11978, 22, this.field10179);
	}

	@ObfuscatedName("aqd.vz()V")
	public void method15978() {
		if (this.field10099) {
			IDirect3DDevice.method43(this.field11978, 28, this.field10167 && this.field10166 && this.field10169 >= 0);
		}
	}

	@ObfuscatedName("aqd.vh()V")
	public void method16123() {
		this.field10119 = this.field10092 - (float) this.field10189;
		this.field10171 = this.field10119 - (float) this.field10169;
		if (this.field10171 < this.field10170) {
			this.field10171 = this.field10170;
		}
		if (this.field10099) {
			IDirect3DDevice.method42(this.field11978, 36, this.field10171);
			IDirect3DDevice.method42(this.field11978, 37, this.field10119);
			IDirect3DDevice.SetRenderState(this.field11978, 34, this.field10191);
		}
	}

	@ObfuscatedName("aqd.vj(Z)V")
	public void method16294(boolean arg0) {
		IDirect3DDevice.method43(this.field11978, 161, arg0);
	}

	@ObfuscatedName("aqd.vc(Z)Lml;")
	public final class360 method16067(boolean arg0) {
		return new class403(this, DataType.field1646, arg0);
	}

	@ObfuscatedName("aqd.vn(Z)Llr;")
	public final class330 method16085(boolean arg0) {
		return new class409(this, arg0);
	}

	@ObfuscatedName("aqd.vf([Llk;)Llo;")
	public class332 method16065(class345[] arg0) {
		return new class920(this, arg0);
	}

	@ObfuscatedName("aqd.vk(Llo;)V")
	public void method16177(class332 arg0) {
		class920 var2 = (class920) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.field11978, var2.field10621);
	}

	@ObfuscatedName("aqd.wn(ILlr;)V")
	public void method16120(int arg0, class330 arg1) {
		class409 var3 = (class409) arg1;
		IDirect3DDevice.SetStreamSource(this.field11978, arg0, var3.field4227, 0, var3.method6229());
	}

	@ObfuscatedName("aqd.wa(Lml;)V")
	public void method16102(class360 arg0) {
		IDirect3DDevice.SetIndices(this.field11978, ((class403) arg0).field4213);
	}

	@ObfuscatedName("aqd.wz(Lms;II)V")
	public final void method16077(class357 arg0, int arg1, int arg2) {
		if (this.field11972 != null) {
			this.field11972.method16476();
		}
		IDirect3DDevice.DrawPrimitive(this.field11978, method19029(arg0), arg1, arg2);
	}

	@ObfuscatedName("aqd.wj(Lml;Lms;IIII)V")
	public final void method16078(class360 arg0, class357 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.field11972 != null) {
			this.field11972.method16476();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.field11978, ((class403) arg0).field4213, 4, 0, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqd.we(Lms;IIII)V")
	public final void method16079(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field11972 != null) {
			this.field11972.method16476();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.field11978, method19029(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("aqd.air(Ljava/lang/String;)[B")
	public byte[] method19009(String arg0) {
		return this.method15965("dx", arg0);
	}

	@ObfuscatedName("aqd.rc(Ljava/lang/String;)Lho;")
	public class238 method15964(String arg0) {
		byte[] var2 = this.method19009(arg0);
		if (var2 == null) {
			return null;
		} else {
			class239 var3 = this.method15971(var2);
			return new class889(this, var3);
		}
	}

	@ObfuscatedName("aqd.d(I)V")
	public final synchronized void method2120(int arg0) {
		for (int var2 = 0; var2 < this.field11982; var2++) {
			IUnknown.Release(this.field11992[var2]);
		}
		this.field11982 = 0;
		super.method2120(arg0);
	}

	@ObfuscatedName("aqd.aix(Lck;Ldg;)I")
	public static final int method19011(TextureFormat arg0, DataType arg1) {
		switch(arg1.field1650) {
			case 0:
				if (TextureFormat.field1273 == arg0) {
					return 116;
				}
				break;
			case 3:
				if (TextureFormat.field1273 == arg0) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.field1278) {
					case 0:
						return 77;
					case 1:
						return class2.field262;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return class2.field263;
				}
		}
		throw new IllegalArgumentException("");
	}

	@ObfuscatedName("aqd.ait(Ldg;)I")
	public static final int method19035(DataType arg0) {
		if (DataType.field1646 == arg0) {
			return 80;
		} else if (DataType.field1649 == arg0) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("aqd.aiq(Lms;)I")
	public static final int method19029(class357 arg0) {
		switch(arg0.field3401) {
			case 0:
				return 5;
			case 1:
				return 4;
			case 2:
				return 3;
			case 3:
				return 6;
			case 4:
				return 1;
			case 5:
				return 2;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("aqd.eh(Z)V")
	public void method2253(boolean arg0) {
	}

	@ObfuscatedName("aqd.aii(IIJILjagdx/D3DDISPLAYMODE;Ljagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method19016(int arg0, int arg1, long arg2, int arg3, D3DDISPLAYMODE arg4, D3DPRESENT_PARAMETERS arg5) {
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		try {
			if (class0.method34(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					var9 = arg3;
					for (int var10 = 0; var10 < field11997.length; var10++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, field11997[var10], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, field11997[var10]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, field11997[var10], true, var9) == 0)) {
							for (int var11 = 0; var11 < field11996.length; var11++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, field11996[var11]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, field11997[var10], field11996[var11]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, field11996[var10], true, var9) == 0)) {
									var8 = field11997[var10];
									var7 = field11996[var11];
									break label76;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || var8 == 0 || var7 == 0) {
				return false;
			}
			arg5.BackBufferFormat = var8;
			arg5.AutoDepthStencilFormat = var7;
			arg5.MultiSampleType = var9;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (Throwable var13) {
			return false;
		}
	}

	@ObfuscatedName("aqd.aia(J)V")
	public synchronized void method19023(long arg0) {
		if (this.field11986 == this.field11982) {
			this.field11986 *= 2;
			long[] var3 = new long[this.field11986];
			System.arraycopy(this.field11992, 0, var3, 0, this.field11982);
			this.field11992 = var3;
		}
		this.field11992[this.field11982] = arg0;
		this.field11982++;
	}

	@ObfuscatedName("aqd.wp(I)V")
	public void method16081(int arg0) {
		if (!this.field11984) {
			int var2 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.field11978, 8, var2);
		}
	}

	@ObfuscatedName("aqd.g()Ljava/lang/String;")
	public String method2132() {
		String var1 = "Caps: 4:";
		String var2 = ":";
		String var3 = var1 + this.field10180 + var2;
		String var4 = var3 + this.field10186 + var2;
		String var5 = var4 + this.field10094 + var2;
		String var6 = var5 + (this.field10172 ? 1 : 0) + var2;
		String var7 = var6 + (this.method15957() ? 1 : 0) + var2;
		String var8 = var7 + (this.method15958() ? 1 : 0) + var2;
		String var9 = var8 + (this.field10125 ? 1 : 0) + var2;
		String var10 = var9 + (this.field10192 ? 1 : 0) + var2;
		String var11 = var10 + (this.field11975 ? 1 : 0) + var2;
		String var12 = var11 + (this.field11963 ? 1 : 0) + var2;
		String var13 = var12 + (this.field11967 ? 1 : 0) + var2;
		String var14 = var13 + (this.field11976 ? 1 : 0) + var2;
		String var15 = var14 + (this.field10159 ? 1 : 0) + var2;
		String var16 = var15 + (this.field10134 ? 1 : 0) + var2;
		String var17 = var16 + (this.field10199 ? 1 : 0) + var2;
		String var18 = var17 + (this.field11979 ? 1 : 0) + var2;
		String var19 = var18 + (this.field11980 ? 1 : 0) + var2;
		String var20 = var19 + (this.field11971 ? 1 : 0) + var2;
		String var21 = var20 + (this.field10074 ? 1 : 0) + var2;
		String var22 = var21 + (this.field11953 ? 1 : 0) + var2;
		return var22 + (this.field11983 ? 1 : 0);
	}
}
