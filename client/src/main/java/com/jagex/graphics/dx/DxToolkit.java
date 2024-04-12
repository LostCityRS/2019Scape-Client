package com.jagex.graphics.dx;

import com.jagex.graphics.Toolkit;
import com.jagex.graphics.GpuVolumeTexture;
import com.jagex.core.datastruct.LinkList;
import com.jagex.game.client.DataType;
import com.jagex.game.client.PrimitiveType;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.graphics.*;
import com.jagex.js5.Js5;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;
import jagdx.*;

import java.awt.*;

@ObfuscatedName("aqd")
public class DxToolkit extends GpuToolkit {

	@ObfuscatedName("aqd.hx")
	public final int field11956;

	@ObfuscatedName("aqd.hq")
	public final int field11954;

	@ObfuscatedName("aqd.hf")
	public long field11955 = 0L;

	@ObfuscatedName("aqd.hr")
	public long device = 0L;

	@ObfuscatedName("aqd.hs")
	public final D3DPRESENT_PARAMETERS present;

	@ObfuscatedName("aqd.hh")
	public final D3DDISPLAYMODE displayMode;

	@ObfuscatedName("aqd.hp")
	public LinkList field11959 = new LinkList();

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
	public GpuTextureRelated[] field11969;

	@ObfuscatedName("aqd.hz")
	public int[] field11962;

	@ObfuscatedName("aqd.ij")
	public Matrix4x4 field11968;

	@ObfuscatedName("aqd.io")
	public DxProgram program;

	@ObfuscatedName("aqd.iq")
	public long vertexShader;

	@ObfuscatedName("aqd.ig")
	public final D3DCAPS caps;

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
	public boolean fillModeEnabled;

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
	public static final int[] field11996 = new int[] { D3DFORMAT.D3DFMT_D24X8, D3DFORMAT.D3DFMT_D16 };

	@ObfuscatedName("aqd.jd")
	public static final int[] field11997 = new int[] { D3DFORMAT.D3DFMT_X8R8G8B8, D3DFORMAT.D3DFMT_R5G6B5 };

	@ObfuscatedName("aqd.rx()Z")
	public boolean hasVertexShader() {
		return (this.caps.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@ObfuscatedName("aqd.ry()Z")
	public boolean hasFragmentShader() {
		return (this.caps.PixelShaderVersion & 0xFFFF) >= 257;
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
	public static Toolkit method19043(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, Js5 arg6, Integer arg7) {
		DxToolkit var8 = null;
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
				} catch (JagDXException var23) {
					var19 = IDirect3D.CreateDeviceContext(var11, var9, var10, arg0, var16 & 0xFFEFFFFF | 0x20, var14);
				}
				var8 = new DxToolkit(var9, var10, var11, var19, var15, var14, var13, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!var8.field1613.containsKey(arg0)) {
					Toolkit.setIgnoreRepaint(arg0);
					var8.method2138(arg0, new DxSurface(var8, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				var8.method2140(arg0);
				var8.init();
				return var8;
			}
		} catch (RuntimeException var24) {
			if (var8 != null) {
				var8.method2369();
			}
			throw var24;
		}
	}

	public DxToolkit(int arg0, int arg1, long arg2, long arg3, D3DDISPLAYMODE arg4, D3DPRESENT_PARAMETERS arg5, D3DCAPS arg6, MaterialList arg7, TextureList arg8, BillboardTypeList arg9, ParticleEmitterTypeList arg10, ParticleEffectorTypeList arg11, Js5 arg12, int arg13) {
		super(arg7, arg8, arg9, arg10, arg11, arg12, arg13, 0);
		try {
			this.field11956 = arg0;
			this.field11954 = arg1;
			this.field11955 = arg2;
			this.device = arg3;
			this.displayMode = arg4;
			this.present = arg5;
			this.caps = arg6;
			this.field11961 = D3DLIGHT.Create();
			this.field11988 = D3DLIGHT.Create();
			this.field11970 = D3DLIGHT.Create();
			this.maxSimutaneousTextures = this.caps.MaxSimultaneousTextures;
			this.maxActiveLights = this.caps.MaxActiveLights > 0 ? this.caps.MaxActiveLights : 8;
			this.field11975 = (this.caps.TextureCaps & 0x2) == 0;
			this.hasTextureCubeMap = (this.caps.TextureCaps & 0x800) != 0;
			this.field10125 = (this.caps.TextureCaps & 0x2000) != 0;
			this.field11963 = (this.caps.TextureCaps & 0x8000) != 0;
			this.field11967 = (this.caps.TextureCaps & 0x10000) != 0;
			this.field11976 = (this.caps.TextureCaps & 0x4000) != 0;
			this.hasFramebufferObject = this.caps.NumSimultaneousRTs > 0;
			this.field10116 = this.hasFramebufferObject;
			this.hasFramebufferBlit = this.caps.NumSimultaneousRTs > 0;
			this.hasMultiSample = this.field10180 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field11955, this.field11956, this.field11954, this.present.BackBufferFormat, true, 2) == 0;
			this.hasFramebufferMultisample = this.caps.NumSimultaneousRTs > 0 && this.field10180 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field11955, this.field11956, this.field11954, D3DFORMAT.D3DFMT_A16B16G16R16F, true, 2) == 0;
			this.field11979 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.present.BackBufferFormat, 0, 1, makeFourCC('A', 'T', 'O', 'C')) == 0;
			this.field11980 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.present.BackBufferFormat, 0, 1, makeFourCC('A', '2', 'M', '1')) == 0;
			this.field11971 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.present.BackBufferFormat, 0, 1, makeFourCC('S', 'S', 'A', 'A')) == 0;
			this.hasBlendFuncSeparate = (this.caps.PrimitiveMiscCaps & 0x20000) != 0;
			this.field11953 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.displayMode.Format, 524288, 3, D3DFORMAT.D3DFMT_A16B16G16R16F) == 0;
			this.field11983 = IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, this.displayMode.Format, 524288, 3, D3DFORMAT.D3DFMT_A32B32G32R32F) == 0;
			this.field11965 = new boolean[this.maxSimutaneousTextures];
			this.field11966 = new boolean[this.maxSimutaneousTextures];
			this.field11981 = new boolean[this.maxSimutaneousTextures];
			this.field11969 = new GpuTextureRelated[this.maxSimutaneousTextures];
			this.field11977 = new boolean[this.maxSimutaneousTextures];
			this.field11962 = new int[this.maxSimutaneousTextures];
			Matrix4x3 var17 = new Matrix4x3();
			var17.setToScale(1.0F, -1.0F, 0.5F);
			var17.translate(0.0F, 0.0F, 0.5F);
			this.field11968 = new Matrix4x4();
			this.field11968.setToMatrix4x3(var17);
			IDirect3DDevice.BeginScene(this.device);
		} catch (Throwable ex) {
			ex.printStackTrace();
			this.dispose();
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aqd.sm()V")
	public void method16105() {
		for (ObjectNode var1 = (ObjectNode) this.field11959.head(); var1 != null; var1 = (ObjectNode) this.field11959.next()) {
			DxInterface1 var2 = (DxInterface1) var1.value;
			var2.method6220();
			if (this.renderTarget == var2) {
				var2.method1630();
			}
		}
		super.method16105();
	}

	@ObfuscatedName("aqd.sx()V")
	public void method15973() {
		this.method2126();
		for (ObjectNode var1 = (ObjectNode) this.field11959.head(); var1 != null; var1 = (ObjectNode) this.field11959.next()) {
			DxInterface1 var2 = (DxInterface1) var1.value;
			var2.method1629();
		}
		super.method15973();
	}

	@ObfuscatedName("aqd.ahz(II)Z")
	public boolean method19019(int arg0, int arg1) {
		int var3 = IDirect3DDevice.TestCooperativeLevel(this.device);
		if (var3 == 0 || var3 == 0x88760869) {
			IDirect3DDevice.SetDepthStencilSurface(this.device, 0L);
			for (int var4 = 1; var4 < 4; var4++) {
				IDirect3DDevice.SetRenderTarget(this.device, var4, 0L);
			}
			for (int var5 = 0; var5 < 4; var5++) {
				IDirect3DDevice.SetStreamSource(this.device, var5, 0L, 0, 0);
			}
			for (int var6 = 0; var6 < 4; var6++) {
				IDirect3DDevice.SetTexture(this.device, var6, 0L);
			}
			IDirect3DDevice.SetIndices(this.device, 0L);
			this.method15973();
			this.present.BackBufferWidth = arg0;
			this.present.BackBufferHeight = arg1;
			this.present.BackBufferCount = 1;
			if (method19016(this.field11956, this.field11954, this.field11955, this.field10180, this.displayMode, this.present)) {
				int var7 = IDirect3DDevice.Reset(this.device, this.present);
				if (HRESULT.SUCCEEDED(var7)) {
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
		for (int var1 = 0; var1 < this.maxSimutaneousTextures; var1++) {
			IDirect3DDevice.SetSamplerState(this.device, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.device, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.device, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.device, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.device, var1, 2, 1);
			this.field11969[var1] = GpuTextureRelated.field3323;
			boolean[] var2 = this.field11965;
			this.field11966[var1] = true;
			var2[var1] = true;
			this.field11977[var1] = false;
			this.field11962[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.device, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SHADEMODE, 2);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ZFUNC, 4);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ALPHAFUNC, 5);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ALPHAREF, 0);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SEPARATEALPHABLENDENABLE, this.hasBlendFuncSeparate);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ADAPTIVETESS_Y, 0);
		this.enableCullMode();
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_AMBIENTMATERIALSOURCE, 1);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DIFFUSEMATERIALSOURCE, 1);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FOGDENSITY, 0.95F);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FOGTABLEMODE, 3);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_POINTSIZE, 1.0F);
		D3DLIGHT.SetType(this.field11961, 3);
		D3DLIGHT.SetType(this.field11988, 3);
		D3DLIGHT.SetType(this.field11970, 1);
		this.field11989 = false;
		super.method16232();
	}

	@ObfuscatedName("aqd.f()Lcz;")
	public RendererInfo getRendererInfo() {
		D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.field11955, this.field11956, 0, var1);
		return new RendererInfo(var1.VendorID, this.method16279() ? "Direct3D FF" : "Direct3D", 9, var1.Description, var1.DriverVersion, this.method16279());
	}

	@ObfuscatedName("aqd.l(II)V")
	public void method2116(int arg0, int arg1) throws RendererException {
		if (this.field11960) {
			if (!this.method19019(this.surface.getWidth(), this.surface.getHeight())) {
				return;
			}
			((DxSurface) this.surface).method6220();
		} else {
			IDirect3DDevice.EndScene(this.device);
		}
		int var3 = this.surface.method15451();
		if (HRESULT.FAILED(var3)) {
			this.field11960 = true;
			this.surface.method1629();
		} else {
			IDirect3DDevice.BeginScene(this.device);
			if (this.field1596 != null) {
				this.field1596.method1982();
			}
		}
	}

	@ObfuscatedName("aqd.u()V")
	public void method2117() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.device);
		if (HRESULT.SUCCEEDED(IDirect3DEventQuery.Issue(var1))) {
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
		if (this.device != 0L) {
			IDirect3DDevice.Destroy(this.device);
			this.device = 0L;
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
	public FrameBuffer createFramebuffer() {
		return new DxFrameBuffer(this);
	}

	@ObfuscatedName("aqd.ad(Ljava/awt/Canvas;II)Lafy;")
	public Surface createSurface(Canvas arg0, int arg1, int arg2) {
		return new DxSurface(this, arg0, arg1, arg2, false);
	}

	@ObfuscatedName("aqd.au(IILck;Ldg;I)Ldp;")
	public GraphicsDeletable method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
		return new DxGraphicsDeletable_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@ObfuscatedName("aqd.ar(II)Ldw;")
	public EffectInterface method2121(int arg0, int arg1) {
		return new DxFrameBufferInterface_Sub1(this, DataType.UNSIGNED_INT_24, arg0, arg1, 0);
	}

	@ObfuscatedName("aqd.ap(III)Ldw;")
	public EffectInterface method2356(int arg0, int arg1, int arg2) {
		return new DxFrameBufferInterface_Sub1(this, DataType.UNSIGNED_INT_24, arg0, arg1, arg2);
	}

	@ObfuscatedName("aqd.aha(Loz;)Lake;")
	public ObjectNode method19005(DxInterface1 arg0) {
		for (ObjectNode var2 = (ObjectNode) this.field11959.head(); var2 != null; var2 = (ObjectNode) this.field11959.next()) {
			if (var2.value == arg0) {
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("aqd.ahx(Loz;)V")
	public void method18995(DxInterface1 arg0) {
		if (this.method19005(arg0) == null) {
			this.field11959.addTail(new ObjectNode(arg0));
		}
	}

	@ObfuscatedName("aqd.ahb(Loz;)V")
	public void method19000(DxInterface1 arg0) {
		ObjectNode var2 = this.method19005(arg0);
		if (var2 != null) {
			var2.unlink();
		}
	}

	@ObfuscatedName("aqd.aq(IIII)[I")
	public int[] method2149(int arg0, int arg1, int arg2, int arg3) {
		this.flush();
		int[] var5 = null;
		long var6 = IDirect3DDevice.GetRenderTarget(this.device, 0);
		long var8 = IDirect3DDevice.CreateRenderTarget(this.device, arg2, arg3, 21, 0, 0, true);
		int var10 = IDirect3DDevice.StretchRect(this.device, var6, arg0, arg1, arg2, arg3, var8, 0, 0, arg2, arg3, 1);
		this.ensureTemporaryBufferCapacity(arg2 * arg3 * 4);
		if (HRESULT.SUCCEEDED(var10)) {
			var5 = new int[arg2 * arg3];
			IDirect3DSurface.Download(var8, 0, 0, arg2, arg3, arg2 * 4, 16, this.temporaryBufferAddress);
			this.temporaryBuffer.clear();
			this.temporaryBuffer.asIntBuffer().get(var5);
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
		this.field11990 = IDirect3DDevice.CreateRenderTarget(this.device, arg0, arg1, getD3DFormat(TextureFormat.RGBA, DataType.UNSIGNED_INT_8), 0, 0, false);
		for (int var3 = 0; var3 < 3; var3++) {
			this.field11994[var3] = IDirect3DDevice.CreateOffscreenPlainSurface(this.device, arg0, arg1, getD3DFormat(TextureFormat.RGBA, DataType.UNSIGNED_INT_8), 2);
		}
		this.ensureTemporaryBufferCapacity(arg0 * arg1 * 4);
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
		long var4 = IDirect3DDevice.GetRenderTarget(this.device, 0);
		if (HRESULT.FAILED(IDirect3DDevice.StretchRect(this.device, var4, 0, 0, this.renderTarget.getWidth(), this.renderTarget.getHeight(), this.field11990, this.field1611, this.field1618, this.field1619, this.field1610, 2))) {
		}
		IUnknown.Release(var4);
		IDirect3DDevice.GetRenderTargetData(this.device, this.field11990, this.field11994[this.field11995]);
		long var6 = IDirect3DDevice.CreateEventQuery(this.device);
		if (HRESULT.SUCCEEDED(IDirect3DEventQuery.Issue(var6))) {
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
		} else if (HRESULT.SUCCEEDED(IDirect3DEventQuery.IsSignaled(this.field11991[this.field11987]))) {
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
		this.temporaryBuffer.clear();
		IDirect3DSurface.Download(this.field11994[this.field11987], 0, 0, arg0, arg1, arg0 * 4, 0, this.temporaryBufferAddress);
		if (++this.field11987 >= 3) {
			this.field11987 = 0;
		}
		if (arg2 == null) {
			return this.temporaryBufferAddress;
		} else {
			this.temporaryBuffer.asIntBuffer().get(arg2);
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
	public EnvironmentSampler method2435(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("aqd.bm(II)V")
	public void method2475(int arg0, int arg1) {
		IDirect3DDevice.Clear(this.device, arg0, arg1, 1.0F, 0);
	}

	@ObfuscatedName("aqd.sa()V")
	public void method15997() {
		if (this.renderTarget != null) {
			IDirect3DDevice.SetViewport(this.device, this.field10105 + this.field10101, this.field10132 + this.field10102, this.field10103, this.field10104, this.field10087, this.field10088);
		}
	}

	@ObfuscatedName("aqd.sb()V")
	public void method15955() {
		IDirect3DDevice.SetScissorRect(this.device, this.field10105 + this.left, this.top + this.field10132, this.right, this.bottom);
	}

	@ObfuscatedName("aqd.sj()V")
	public void enableScissorTest() {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SCISSORTESTENABLE, this.field10182);
	}

	@ObfuscatedName("aqd.ahh(J)V")
	public final void setVertexShader(long arg0) {
		this.vertexShader = arg0;
		IDirect3DDevice.SetVertexShader(this.device, arg0);
	}

	@ObfuscatedName("aqd.ahd(J)V")
	public final void setPixelShader(long arg0) {
		IDirect3DDevice.SetPixelShader(this.device, arg0);
	}

	@ObfuscatedName("aqd.rn(Lpq;Lpq;Lpq;)V")
	public void method15967(Matrix4x4 arg0, Matrix4x4 arg1, Matrix4x4 arg2) {
		IDirect3DDevice.SetTransform(this.device, class6.D3DTTFF_PROJECTED, arg0.entries);
		IDirect3DDevice.SetTransform(this.device, class6.D3DTTFF_COUNT2, arg1.entries);
		IDirect3DDevice.SetTransform(this.device, class6.D3DTTFF_COUNT3, arg2.entries);
	}

	@ObfuscatedName("aqd.ti(Lpq;)V")
	public void method16006(Matrix4x4 arg0) {
		arg0.multiply(this.field11968);
	}

	@ObfuscatedName("aqd.tp()V")
	public void enableDepth() {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ZENABLE, this.field10109 && this.field10044);
	}

	@ObfuscatedName("aqd.tv()V")
	public void enableDepthWrite() {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ZWRITEENABLE, this.field10107 && this.field10108);
	}

	@ObfuscatedName("aqd.tg()V")
	public void enableLighting() {
		if (this.lightingEnabled) {
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_LIGHTING, this.field10111 && !this.field10113);
		}
	}

	@ObfuscatedName("aqd.tq()V")
	public void enableLightingAmbient() {
		if (this.lightingEnabled) {
			D3DLIGHT.SetAmbient(this.field11961, this.field10142 * this.field10122, this.field10122 * this.field10120, this.field10210 * this.field10122, 0.0F);
			this.field11989 = false;
		}
	}

	@ObfuscatedName("aqd.tx()V")
	public void enableLightingDiffuse() {
		if (!this.lightingEnabled) {
			return;
		}
		float var1 = this.field10112 ? this.field10123 : 0.0F;
		float var2 = this.field10112 ? -this.field10124 : 0.0F;
		D3DLIGHT.SetDiffuse(this.field11961, this.field10142 * var1, this.field10120 * var1, this.field10210 * var1, 0.0F);
		D3DLIGHT.SetDiffuse(this.field11988, this.field10142 * var2, this.field10120 * var2, this.field10210 * var2, 0.0F);
		this.field11989 = false;
	}

	@ObfuscatedName("aqd.tk()V")
	public void enableLightingView() {
		if (this.lightingEnabled) {
			D3DLIGHT.SetDirection(this.field11961, -this.field10114[0], -this.field10114[1], -this.field10114[2]);
			D3DLIGHT.SetDirection(this.field11988, -this.field10072[0], -this.field10072[1], -this.field10072[2]);
			this.field11989 = false;
		}
	}

	@ObfuscatedName("aqd.td()V")
	public void enableLighting0and1() {
		this.enableLightingDiffuse();
		this.method16023();
	}

	@ObfuscatedName("aqd.tl()V")
	public void method16023() {
		if (!this.lightingEnabled || this.field11989) {
			return;
		}
		IDirect3DDevice.LightEnable(this.device, 0, false);
		IDirect3DDevice.LightEnable(this.device, 1, false);
		IDirect3DDevice.SetLight(this.device, 0, this.field11961);
		IDirect3DDevice.SetLight(this.device, 1, this.field11988);
		IDirect3DDevice.LightEnable(this.device, 0, true);
		IDirect3DDevice.LightEnable(this.device, 1, true);
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
			IDirect3DDevice.SetLight(this.device, var3, this.field11970);
			IDirect3DDevice.LightEnable(this.device, var3, true);
		}
		while (var1 < this.field10126) {
			IDirect3DDevice.LightEnable(this.device, var1 + 2, false);
			var1++;
		}
	}

	@ObfuscatedName("aqd.uq(Lck;Ldg;)Z")
	public boolean method16026(TextureFormat arg0, DataType arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return HRESULT.SUCCEEDED(IDirect3D.GetAdapterDisplayMode(this.field11955, this.field11956, var3)) && HRESULT.SUCCEEDED(IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, var3.Format, 0, 3, getD3DFormat(arg0, arg1)));
	}

	@ObfuscatedName("aqd.uc(Lck;Ldg;)Z")
	public boolean method16289(TextureFormat arg0, DataType arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return HRESULT.SUCCEEDED(IDirect3D.GetAdapterDisplayMode(this.field11955, this.field11956, var3)) && HRESULT.SUCCEEDED(IDirect3D.CheckDeviceFormat(this.field11955, this.field11956, this.field11954, var3.Format, 0, 4, getD3DFormat(arg0, arg1)));
	}

	@ObfuscatedName("aqd.uz(Lck;Ldg;II)Llz;")
	public GpuTexture method16030(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
		return new DxTexture(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqd.uj(IIZ[III)Llz;")
	public GpuTexture method16033(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new DxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqd.ug(Lck;IIZ[BII)Llz;")
	public GpuTexture method15975(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		return new DxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aqd.ub(Lck;IIZ[FII)Llz;")
	public GpuTexture method16032(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new DxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aqd.uy(Lck;Ldg;II)Lmo;")
	public Texture2 method16089(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
		return new DxTexture_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aqd.ut(IZ[[I)Lmr;")
	public GpuCubeTexture method16034(int arg0, boolean arg1, int[][] arg2) {
		return new DxCubeTexture(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("aqd.uk(Lck;IIIZ[B)Lll;")
	public GpuVolumeTexture method16197(TextureFormat arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new DxVolumeTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqd.ahn(Lop;)V")
	public final void method19001(DxBaseTexture arg0) {
		IDirect3DDevice.SetTexture(this.device, this.field10177, arg0.method6225());
		if (this.lightingEnabled && !this.field11981[this.field10177]) {
			this.field11981[this.field10177] = true;
			this.method16052();
			this.method16256();
		}
	}

	@ObfuscatedName("aqd.ahp(Laiy;)V")
	public final void method19002(DxTexture arg0) {
		this.method19001(arg0);
		if (this.field11965[this.field10177] != arg0.field10669) {
			IDirect3DDevice.SetSamplerState(this.device, this.field10177, 1, arg0.field10669 ? 1 : 3);
			this.field11965[this.field10177] = arg0.field10669;
		}
		if (this.field11966[this.field10177] != arg0.field10670) {
			IDirect3DDevice.SetSamplerState(this.device, this.field10177, 2, arg0.field10670 ? 1 : 3);
			this.field11966[this.field10177] = arg0.field10670;
		}
	}

	@ObfuscatedName("aqd.ahe(Lahy;)V")
	public final void method19003(DxVolumeTexture arg0) {
		this.method19001(arg0);
		if (!this.field11965[this.field10177]) {
			IDirect3DDevice.SetSamplerState(this.device, this.field10177, 1, 1);
			this.field11965[this.field10177] = true;
		}
		if (!this.field11966[this.field10177]) {
			IDirect3DDevice.SetSamplerState(this.device, this.field10177, 2, 1);
			this.field11966[this.field10177] = true;
		}
	}

	@ObfuscatedName("aqd.ud()V")
	public void method16091() {
		if (this.field11981[this.field10177]) {
			this.field11981[this.field10177] = false;
			IDirect3DDevice.SetTexture(this.device, this.field10177, 0L);
			this.method16052();
			this.method16256();
		}
	}

	@ObfuscatedName("aqd.vo()V")
	public void method16050() {
		if (this.vertexShader != 0L || this.field10135[this.field10177] == TextureTramsformType.DISABLE) {
			IDirect3DDevice.SetTextureStageState(this.device, this.field10177, 24, 0);
			this.field11962[this.field10177] = 0;
			return;
		}
		if (this.field10135[this.field10177] == TextureTramsformType.COUNT2) {
			IDirect3DDevice.SetTransform(this.device, this.field10177 + 16, this.field10162[this.field10177].method6638(this.field11985));
		} else {
			IDirect3DDevice.SetTransform(this.device, this.field10177 + 16, this.field10162[this.field10177].toArray(this.field11985));
		}
		int var1 = getTextureTransformFormat(this.field10135[this.field10177]);
		if (this.field11962[this.field10177] != var1) {
			IDirect3DDevice.SetTextureStageState(this.device, this.field10177, 24, var1);
			this.field11962[this.field10177] = var1;
		}
	}

	@ObfuscatedName("aqd.vv()V")
	public void method16051() {
	}

	@ObfuscatedName("aqd.vw()V")
	public void method16256() {
		if (this.lightingEnabled) {
			int var1 = this.field11981[this.field10177] ? getTextureCombineModeStage(this.field10136[this.field10177]) : 1;
			IDirect3DDevice.SetTextureStageState(this.device, this.field10177, 1, var1);
		}
	}

	@ObfuscatedName("aqd.vt()V")
	public void method16052() {
		if (this.lightingEnabled) {
			int var1 = this.field11981[this.field10177] ? getTextureCombineModeStage(this.field10137[this.field10177]) : class6.D3DTSS_COLOROP;
			IDirect3DDevice.SetTextureStageState(this.device, this.field10177, 4, var1);
		}
	}

	@ObfuscatedName("aqd.ur(ILmn;ZZ)V")
	public final void method16031(int arg0, TextureCombiner arg1, boolean arg2, boolean arg3) {
		if (!this.lightingEnabled) {
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
		IDirect3DDevice.SetTextureStageState(this.device, this.field10177, var6, method18999(arg1) | var5);
	}

	@ObfuscatedName("aqd.uo(ILmn;Z)V")
	public final void method16043(int arg0, TextureCombiner arg1, boolean arg2) {
		if (!this.lightingEnabled) {
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
		IDirect3DDevice.SetTextureStageState(this.device, this.field10177, var5, method18999(arg1) | var4);
	}

	@ObfuscatedName("aqd.vr()V")
	public final void enableTextureFactor() {
		if (this.lightingEnabled) {
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_TEXTUREFACTOR, this.field10160);
		}
	}

	@ObfuscatedName("aqd.ahs(Lmk;)I")
	public static final int getTextureCombineModeStage(TextureCombineMode arg0) {
		switch(arg0.field3394) {
			case 0:
				return class6.D3DTSS_BUMPENVMAT11;
			case 1:
				return class6.D3DTSS_BUMPENVMAT00;
			case 2:
				return class6.D3DTSS_COLORARG0;
			case 3:
				return class6.D3DTSS_COLORARG1;
			case 4:
				return class6.D3DTSS_ALPHAOP;
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aqd.aht(Lmn;)I")
	public static final int method18999(TextureCombiner arg0) {
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
	public static final int getTextureTransformFormat(TextureTramsformType textureTramsformType) {
		switch(textureTramsformType.index) {
			case 0:
				return class6.D3DTTFF_COUNT2;
			case 1:
				return class6.D3DTTFF_COUNT3;
			case 2:
				return class6.D3DTTFF_COUNT4;
			case 3:
				return class6.D3DTTFF_COUNT1;
			case 4:
				return class6.D3DTTFF_PROJECTED;
			default:
				return class6.D3DTTFF_DISABLE;
		}
	}

	@ObfuscatedName("aqd.vy(I)V")
	public void enableColorWriteTest(int arg0) {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_COLORWRITEENABLE, arg0);
	}

	@ObfuscatedName("aqd.ve()V")
	public void enableAlphaTest() {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ALPHATESTENABLE, this.alphaTestEnabled);
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ALPHAREF, this.alphaRef & 0xFF);
		if (this.present.MultiSampleType <= 0) {
			return;
		}
		if (this.alphaTestEnabled && this.alphaRef != 0) {
			if (this.field11971) {
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ADAPTIVETESS_Y, makeFourCC('S', 'S', 'A', 'A'));
			} else if (this.field11979) {
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ADAPTIVETESS_Y, makeFourCC('A', 'T', 'O', 'C'));
			} else if (this.field11980) {
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_POINTSIZE, makeFourCC('A', '2', 'M', '1'));
			}
		} else if (this.field11971 || this.field11979) {
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ADAPTIVETESS_Y, 0);
		} else if (this.field11980) {
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_POINTSIZE, 1.0F);
		}
	}

	@ObfuscatedName("aqd.vm()V")
	public void enableBlend() {
		switch(this.field10211.field3360) {
			case 0:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLEND, 2);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLEND, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLEND, 9);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLEND, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLEND, 5);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLEND, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLEND, 2);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLEND, 2);
		}
		switch(this.field10174) {
			case 0:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLENDALPHA, 1);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLENDALPHA, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLENDALPHA, 2);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLENDALPHA, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLENDALPHA, 2);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLENDALPHA, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_SRCBLENDALPHA, 1);
				IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_DESTBLENDALPHA, 2);
		}
	}

	@ObfuscatedName("aqd.vg()V")
	public void enableAlphaBlend() {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_ALPHABLENDENABLE, this.alphaBlendEnabled);
	}

	@ObfuscatedName("aqd.ahy()V")
	public void enableCullMode() {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_CULLMODE, this.cullModeEnabled);
	}

	@ObfuscatedName("aqd.vz()V")
	public void enableFog() {
		if (this.lightingEnabled) {
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FOGENABLE, this.field10167 && this.field10166 && this.field10169 >= 0);
		}
	}

	@ObfuscatedName("aqd.vh()V")
	public void setFogParameters() {
		this.fogEnd = this.field10092 - (float) this.field10189;
		this.fogStart = this.fogEnd - (float) this.field10169;
		if (this.fogStart < this.field10170) {
			this.fogStart = this.field10170;
		}
		if (this.lightingEnabled) {
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FOGSTART, this.fogStart);
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FOGEND, this.fogEnd);
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FOGDENSITY, this.fogDensity);
		}
	}

	@ObfuscatedName("aqd.vj(Z)V")
	public void enableAntiAliasing(boolean multisampleEnabled) {
		IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_MULTISAMPLEANTIALIAS, multisampleEnabled);
	}

	@ObfuscatedName("aqd.vc(Z)Lml;")
	public final GpuIndexBuffer createIndexBuffer(boolean arg0) {
		return new DxIndexBuffer(this, DataType.UNSIGNED_INT_16, arg0);
	}

	@ObfuscatedName("aqd.vn(Z)Llr;")
	public final VertexBuffer createVertexBuffer(boolean arg0) {
		return new DxVertexBuffer(this, arg0);
	}

	@ObfuscatedName("aqd.vf([Llk;)Llo;")
	public VertexDeclaration createVertexDeclaration(VertexDeclarationElement[] arg0) {
		return new DxVertexDeclaration(this, arg0);
	}

	@ObfuscatedName("aqd.vk(Llo;)V")
	public void setVertexDeclaration(VertexDeclaration arg0) {
		DxVertexDeclaration var2 = (DxVertexDeclaration) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.device, var2.pointer);
	}

	@ObfuscatedName("aqd.wn(ILlr;)V")
	public void setStreamSource(int arg0, VertexBuffer arg1) {
		DxVertexBuffer var3 = (DxVertexBuffer) arg1;
		IDirect3DDevice.SetStreamSource(this.device, arg0, var3.field4227, 0, var3.method6229());
	}

	@ObfuscatedName("aqd.wa(Lml;)V")
	public void setIndices(GpuIndexBuffer arg0) {
		IDirect3DDevice.SetIndices(this.device, ((DxIndexBuffer) arg0).field4213);
	}

	@ObfuscatedName("aqd.wz(Lms;II)V")
	public final void drawPrimitive(PrimitiveType arg0, int arg1, int arg2) {
		if (this.program != null) {
			this.program.method16476();
		}
		IDirect3DDevice.DrawPrimitive(this.device, getD3DPrimitiveType(arg0), arg1, arg2);
	}

	@ObfuscatedName("aqd.wj(Lml;Lms;IIII)V")
	public final void drawIndexedPrimitiveIB(GpuIndexBuffer arg0, PrimitiveType arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.program != null) {
			this.program.method16476();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.device, ((DxIndexBuffer) arg0).field4213, 4, 0, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aqd.we(Lms;IIII)V")
	public final void drawIndexedPrimitive(PrimitiveType arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.program != null) {
			this.program.method16476();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.device, getD3DPrimitiveType(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("aqd.air(Ljava/lang/String;)[B")
	public byte[] getShader(String arg0) {
		return this.method15965("dx", arg0);
	}

	@ObfuscatedName("aqd.rc(Ljava/lang/String;)Lho;")
	public GpuShader createShader(String arg0) {
		byte[] var2 = this.getShader(arg0);
		if (var2 == null) {
			return null;
		} else {
			ShaderData var3 = this.method15971(var2);
			return new DxProgramManager(this, var3);
		}
	}

	@ObfuscatedName("aqd.d(I)V")
	public final synchronized void cycle(int arg0) {
		for (int var2 = 0; var2 < this.field11982; var2++) {
			IUnknown.Release(this.field11992[var2]);
		}
		this.field11982 = 0;
		super.cycle(arg0);
	}

	@ObfuscatedName("aqd.aix(Lck;Ldg;)I")
	public static final int getD3DFormat(TextureFormat textureFormat, DataType dataType) {
		switch(dataType.index) {
			case 0:
				if (TextureFormat.RGBA == textureFormat) {
					return D3DFORMAT.D3DFMT_A32B32G32R32F;
				}
				break;
			case 3:
				if (TextureFormat.RGBA == textureFormat) {
					return D3DFORMAT.D3DFMT_A16B16G16R16F;
				}
				break;
			case 7:
				switch(textureFormat.index) {
					case 0:
						return D3DFORMAT.D3DFMT_D24X8;
					case 1:
						return D3DFORMAT.D3DFMT_DXT1;
					case 2:
						return D3DFORMAT.D3DFMT_X8R8G8B8;
					case 3:
						return D3DFORMAT.D3DFMT_A8L8;
					case 4:
						return D3DFORMAT.D3DFMT_A8R8G8B8;
					case 5:
					default:
						break;
					case 6:
						return D3DFORMAT.D3DFMT_A8;
					case 7:
						return D3DFORMAT.D3DFMT_L8;
					case 8:
						return D3DFORMAT.D3DFMT_DXT5;
				}
		}
		throw new IllegalArgumentException("");
	}

	@ObfuscatedName("aqd.ait(Ldg;)I")
	public static final int getD3DFormatForDataType(DataType arg0) {
		if (DataType.UNSIGNED_INT_16 == arg0) {
			return D3DFORMAT.D3DFMT_D16;
		} else if (DataType.UNSIGNED_INT_24 == arg0) {
			return D3DFORMAT.D3DFMT_D24X8;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("aqd.aiq(Lms;)I")
	public static final int getD3DPrimitiveType(PrimitiveType arg0) {
		switch(arg0.index) {
			case 0:
				return class6.D3DPT_TRIANGLESTRIP;
			case 1:
				return class6.D3DPT_TRIANGLELIST;
			case 2:
				return class6.D3DPT_LINESTRIP;
			case 3:
				return class6.D3DPT_TRIANGLEFAN;
			case 4:
				return class6.D3DPT_POINTLIST;
			case 5:
				return class6.D3DPT_LINELIST;
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
			if (HRESULT.FAILED(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
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
	public void enableFillMode(int arg0) {
		if (!this.fillModeEnabled) {
			int var2 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.device, class6.D3DRS_FILLMODE, var2);
		}
	}

	@ObfuscatedName("aqd.g()Ljava/lang/String;")
	public String hardwareInfo() {
		String var1 = "Caps: 4:";
		String var2 = ":";
		String var3 = var1 + this.field10180 + var2;
		String var4 = var3 + this.maxSimutaneousTextures + var2;
		String var5 = var4 + this.maxActiveLights + var2;
		String var6 = var5 + (this.hasMultiSample ? 1 : 0) + var2;
		String var7 = var6 + (this.hasVertexShader() ? 1 : 0) + var2;
		String var8 = var7 + (this.hasFragmentShader() ? 1 : 0) + var2;
		String var9 = var8 + (this.field10125 ? 1 : 0) + var2;
		String var10 = var9 + (this.hasTextureCubeMap ? 1 : 0) + var2;
		String var11 = var10 + (this.field11975 ? 1 : 0) + var2;
		String var12 = var11 + (this.field11963 ? 1 : 0) + var2;
		String var13 = var12 + (this.field11967 ? 1 : 0) + var2;
		String var14 = var13 + (this.field11976 ? 1 : 0) + var2;
		String var15 = var14 + (this.hasFramebufferObject ? 1 : 0) + var2;
		String var16 = var15 + (this.hasFramebufferBlit ? 1 : 0) + var2;
		String var17 = var16 + (this.hasFramebufferMultisample ? 1 : 0) + var2;
		String var18 = var17 + (this.field11979 ? 1 : 0) + var2;
		String var19 = var18 + (this.field11980 ? 1 : 0) + var2;
		String var20 = var19 + (this.field11971 ? 1 : 0) + var2;
		String var21 = var20 + (this.hasBlendFuncSeparate ? 1 : 0) + var2;
		String var22 = var21 + (this.field11953 ? 1 : 0) + var2;
		return var22 + (this.field11983 ? 1 : 0);
	}
}
