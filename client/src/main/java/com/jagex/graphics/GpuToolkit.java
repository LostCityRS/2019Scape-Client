package com.jagex.graphics;

import com.jagex.core.datastruct.Heap;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.*;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.glx.GlxToolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.postprocess.effects.ColourGradingBloomEffect;
import com.jagex.graphics.postprocess.effects.ColourRemappingFilter;
import com.jagex.graphics.postprocess.effects.LevelsFilterEffect;
import com.jagex.js5.Js5;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("afc")
public abstract class GpuToolkit extends Toolkit {

	@ObfuscatedName("afc.at")
	public static final Object field10206 = new Object();

	@ObfuscatedName("afc.ad")
	public GpuRendererRelated field10031 = new GpuRendererRelated();

	@ObfuscatedName("afc.ay")
	public final Js5 field10041;

	@ObfuscatedName("afc.ab")
	public boolean lightingEnabled;

	@ObfuscatedName("afc.az")
	public int[] field10043;

	@ObfuscatedName("afc.aa")
	public Unsafe field10110;

	@ObfuscatedName("afc.af")
	public ByteBuffer temporaryBuffer;

	@ObfuscatedName("afc.ak")
	public long temporaryBufferAddress;

	@ObfuscatedName("afc.bf")
	public int field10048 = 0;

	@ObfuscatedName("afc.bl")
	public GpuWaterRelated field10049;

	@ObfuscatedName("afc.bk")
	public NativeHeap field10154;

	@ObfuscatedName("afc.bh")
	public LinkList field10051 = new LinkList();

	@ObfuscatedName("afc.bx")
	public int field10052;

	@ObfuscatedName("afc.bd")
	public int field10053;

	@ObfuscatedName("afc.bc")
	public int field10117;

	@ObfuscatedName("afc.bi")
	public Matrix4x3 field10200 = new Matrix4x3();

	@ObfuscatedName("afc.bn")
	public Matrix4x4 field10056 = new Matrix4x4();

	@ObfuscatedName("afc.bt")
	public Matrix4x3 field10201 = new Matrix4x3();

	@ObfuscatedName("afc.bq")
	public Matrix4x3 field10042 = new Matrix4x3();

	@ObfuscatedName("afc.bm")
	public Matrix4x4 field10059 = new Matrix4x4();

	@ObfuscatedName("afc.bb")
	public Matrix4x4 field10035 = new Matrix4x4();

	@ObfuscatedName("afc.be")
	public Matrix4x4 field10190 = new Matrix4x4();

	@ObfuscatedName("afc.by")
	public Matrix4x3 field10062 = new Matrix4x3();

	@ObfuscatedName("afc.bu")
	public Matrix4x4 field10063 = new Matrix4x4();

	@ObfuscatedName("afc.bw")
	public static final Matrix4x4 field10064 = new Matrix4x4();

	@ObfuscatedName("afc.bo")
	public Matrix4x3 field10065 = new Matrix4x3();

	@ObfuscatedName("afc.bz")
	public Matrix4x4 field10066 = new Matrix4x4();

	@ObfuscatedName("afc.bv")
	public Matrix4x4 field10039 = new Matrix4x4();

	@ObfuscatedName("afc.br")
	public Vector3 field10054 = new Vector3();

	@ObfuscatedName("afc.bg")
	public float[] field10069 = new float[4];

	@ObfuscatedName("afc.ba")
	public boolean field10070 = false;

	@ObfuscatedName("afc.bp")
	public GpuRendererRelated3 field10050 = GpuRendererRelated3.field3319;

	@ObfuscatedName("afc.bj")
	public boolean field10121 = false;

	@ObfuscatedName("afc.bs")
	public Matrix4x4 field10073 = new Matrix4x4();

	@ObfuscatedName("afc.cl")
	public Matrix4x4 field10068 = new Matrix4x4();

	@ObfuscatedName("afc.cg")
	public boolean field10194 = false;

	@ObfuscatedName("afc.ce")
	public Matrix4x4 field10076 = new Matrix4x4();

	@ObfuscatedName("afc.cu")
	public Matrix4x4 field10168 = new Matrix4x4();

	@ObfuscatedName("afc.ci")
	public Matrix4x4 field10078 = this.field10168;

	@ObfuscatedName("afc.cn")
	public Matrix4x4 projectionMatrix = new Matrix4x4();

	@ObfuscatedName("afc.cv")
	public Matrix4x4 field10145 = new Matrix4x4();

	@ObfuscatedName("afc.cp")
	public Matrix4x4 field10081 = new Matrix4x4();

	@ObfuscatedName("afc.ca")
	public float[][] field10061 = new float[6][4];

	@ObfuscatedName("afc.cx")
	public float field10083;

	@ObfuscatedName("afc.cw")
	public float field10084;

	@ObfuscatedName("afc.ct")
	public float field10085;

	@ObfuscatedName("afc.cf")
	public float field10086;

	@ObfuscatedName("afc.co")
	public float field10087 = 0.0F;

	@ObfuscatedName("afc.cr")
	public float field10088 = 1.0F;

	@ObfuscatedName("afc.cm")
	public float field10089 = 0.0F;

	@ObfuscatedName("afc.cq")
	public float field10090 = 1.0F;

	@ObfuscatedName("afc.ch")
	public float field10170 = 50.0F;

	@ObfuscatedName("afc.cb")
	public float field10092 = 3584.0F;

	@ObfuscatedName("afc.cs")
	public int top = 0;

	@ObfuscatedName("afc.cy")
	public int bottom = 0;

	@ObfuscatedName("afc.cc")
	public int left = 0;

	@ObfuscatedName("afc.cz")
	public int right = 0;

	@ObfuscatedName("afc.ck")
	public int field10097 = 0;

	@ObfuscatedName("afc.cj")
	public int field10098 = 0;

	@ObfuscatedName("afc.cd")
	public int field10139 = 0;

	@ObfuscatedName("afc.dd")
	public int field10082 = 0;

	@ObfuscatedName("afc.dr")
	public int field10101 = 0;

	@ObfuscatedName("afc.da")
	public int field10102 = 0;

	@ObfuscatedName("afc.dt")
	public int field10103 = 0;

	@ObfuscatedName("afc.do")
	public int field10104 = 0;

	@ObfuscatedName("afc.dz")
	public int field10105 = 0;

	@ObfuscatedName("afc.dv")
	public int field10132 = 0;

	@ObfuscatedName("afc.dm")
	public boolean field10107 = true;

	@ObfuscatedName("afc.dq")
	public boolean field10108 = false;

	@ObfuscatedName("afc.dc")
	public boolean field10109 = true;

	@ObfuscatedName("afc.di")
	public boolean field10044 = false;

	@ObfuscatedName("afc.dk")
	public boolean field10111 = false;

	@ObfuscatedName("afc.dn")
	public boolean field10112 = true;

	@ObfuscatedName("afc.df")
	public boolean field10113 = false;

	@ObfuscatedName("afc.dw")
	public float[] field10114 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@ObfuscatedName("afc.ds")
	public float[] field10072 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@ObfuscatedName("afc.du")
	public float[] field10173 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@ObfuscatedName("afc.dl")
	public float[] field10075 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@ObfuscatedName("afc.dp")
	public int field10118 = -33488896;

	@ObfuscatedName("afc.dy")
	public float field10142 = 1.0F;

	@ObfuscatedName("afc.db")
	public float field10120 = 1.0F;

	@ObfuscatedName("afc.dh")
	public float field10210 = 1.0F;

	@ObfuscatedName("afc.dx")
	public float field10122 = 1.0F;

	@ObfuscatedName("afc.dg")
	public float field10123 = -1.0F;

	@ObfuscatedName("afc.de")
	public float field10124 = -1.0F;

	@ObfuscatedName("afc.dj")
	public Light[] field10045;

	@ObfuscatedName("afc.eo")
	public int field10126;

	@ObfuscatedName("afc.ey")
	public int field10127;

	@ObfuscatedName("afc.eu")
	public int field10128 = 8;

	@ObfuscatedName("afc.ed")
	public int field10129 = 3;

	@ObfuscatedName("afc.ee")
	public int field10130;

	@ObfuscatedName("afc.es")
	public int field10131;

	@ObfuscatedName("afc.ei")
	public int field10177 = 0;

	@ObfuscatedName("afc.el")
	public BaseTexture[] field10093;

	@ObfuscatedName("afc.ej")
	public Matrix4x4[] field10162;

	@ObfuscatedName("afc.ep")
	public TextureTramsformType[] field10135;

	@ObfuscatedName("afc.ev")
	public TextureCombineMode[] field10136;

	@ObfuscatedName("afc.ec")
	public TextureCombineMode[] field10137;

	@ObfuscatedName("afc.ek")
	public int field10160;

	@ObfuscatedName("afc.em")
	public final MaterialTextureProvider field10188;

	@ObfuscatedName("afc.eh")
	public GpuTexture field10140;

	@ObfuscatedName("afc.eq")
	public GpuTexture field10141;

	@ObfuscatedName("afc.eg")
	public GpuSprite field10057;

	@ObfuscatedName("afc.ez")
	public GpuSprite field10143;

	@ObfuscatedName("afc.ef")
	public boolean field10144 = false;

	@ObfuscatedName("afc.et")
	public GpuRendererRelated6 field10146;

	@ObfuscatedName("afc.ea")
	public GpuRendererRelated2 field10067;

	@ObfuscatedName("afc.ew")
	public final GpuRendererRelated2[] field10147 = new GpuRendererRelated2[16];

	@ObfuscatedName("afc.er")
	public ModelShader modelShader;

	@ObfuscatedName("afc.en")
	public SpriteShader spriteShader;

	@ObfuscatedName("afc.eb")
	public BatchedSpriteShader batchedSpriteShader;

	@ObfuscatedName("afc.ex")
	public ParticleShader particleShader;

	@ObfuscatedName("afc.fg")
	public EnvMappedWaterShader waterShader;

	@ObfuscatedName("afc.fu")
	public EnvMappedWaterShader seaWaterShader;

	@ObfuscatedName("afc.fs")
	public WaterfallShader waterfallShader;

	@ObfuscatedName("afc.fz")
	public GpuPostProcessManager field10155;

	@ObfuscatedName("afc.fi")
	public final GpuPostProcessEffect[] field10080 = new GpuPostProcessEffect[4];

	@ObfuscatedName("afc.ft")
	public GpuEnvironmentSampler field10161;

	@ObfuscatedName("afc.fx")
	public boolean field10133;

	@ObfuscatedName("afc.fv")
	public boolean field10163 = false;

	@ObfuscatedName("afc.fc")
	public int field10164;

	@ObfuscatedName("afc.fw")
	public WaterFogData field10165;

	@ObfuscatedName("afc.fa")
	public boolean field10166;

	@ObfuscatedName("afc.fp")
	public boolean field10167 = true;

	@ObfuscatedName("afc.fq")
	public int fogDensity = -1;

	@ObfuscatedName("afc.ff")
	public int field10169 = -1;

	@ObfuscatedName("afc.fl")
	public int field10189 = 0;

	@ObfuscatedName("afc.fb")
	public float fogStart;

	@ObfuscatedName("afc.fo")
	public float fogEnd;

	@ObfuscatedName("afc.fy")
	public int field10096 = 1;

	@ObfuscatedName("afc.fe")
	public int field10174 = -1;

	@ObfuscatedName("afc.fk")
	public BlendMode field10211 = BlendMode.field3364;

	@ObfuscatedName("afc.fh")
	public boolean alphaBlendEnabled = true;

	@ObfuscatedName("afc.fr")
	public boolean alphaTestEnabled = true;

	@ObfuscatedName("afc.gu")
	public byte alphaRef = 0;

	@ObfuscatedName("afc.gq")
	public int cullModeEnabled = 2;

	@ObfuscatedName("afc.gl")
	public final int field10180;

	@ObfuscatedName("afc.go")
	public int field10181;

	@ObfuscatedName("afc.gk")
	public int field10205;

	@ObfuscatedName("afc.gp")
	public boolean field10183 = false;

	@ObfuscatedName("afc.gy")
	public GpuParticleRenderer field10198;

	@ObfuscatedName("afc.ga")
	public int field10185;

	@ObfuscatedName("afc.gn")
	public int maxSimutaneousTextures;

	@ObfuscatedName("afc.gc")
	public int maxActiveLights;

	@ObfuscatedName("afc.gf")
	public boolean hasFramebufferObject;

	@ObfuscatedName("afc.gx")
	public boolean hasFramebufferBlit;

	@ObfuscatedName("afc.ge")
	public boolean hasFramebufferMultisample;

	@ObfuscatedName("afc.gg")
	public boolean hasMultiSample;

	@ObfuscatedName("afc.gr")
	public boolean hasTextureCubeMap;

	@ObfuscatedName("afc.gs")
	public boolean field10125;

	@ObfuscatedName("afc.gt")
	public boolean field10116;

	@ObfuscatedName("afc.gh")
	public boolean hasBlendFuncSeparate;

	@ObfuscatedName("afc.gm")
	public VertexBuffer field10196;

	@ObfuscatedName("afc.gv")
	public VertexBuffer field10197;

	@ObfuscatedName("afc.gj")
	public VertexBuffer field10195;

	@ObfuscatedName("afc.gw")
	public VertexDeclaration field10150;

	@ObfuscatedName("afc.gd")
	public VertexDeclaration field10055;

	@ObfuscatedName("afc.gz")
	public VertexDeclaration field10184;

	@ObfuscatedName("afc.gb")
	public VertexDeclaration field10202;

	@ObfuscatedName("afc.gi")
	public VertexDeclaration field10203;

	@ObfuscatedName("afc.hm")
	public VertexDeclaration field10204;

	@ObfuscatedName("afc.ha")
	public GpuIndexBuffer field10077;

	@ObfuscatedName("afc.hk")
	public GpuModel[] field10058;

	@ObfuscatedName("afc.hu")
	public GpuModel[] field10207;

	@ObfuscatedName("afc.hb")
	public Matrix4x4 field10208;

	@ObfuscatedName("afc.hl")
	public Matrix4x3 field10209;

	@ObfuscatedName("afc.hg")
	public PrimitiveVertexBuffer field10100;

	@ObfuscatedName("afc.hd")
	public boolean field10182;

	@ObfuscatedName("afc.rv(Lle;)V")
	public void method15985(DeletableResource arg0) {
		this.field10031.method15159(arg0, field10206);
	}

	@ObfuscatedName("afc.rh(Lle;)V")
	public void method16198(DeletableResource arg0) {
		this.field10031.method15160(arg0);
	}

	@ObfuscatedName("afc.ra()V")
	public void method15956() {
		ArrayList var1 = this.field10031.method15161();
		Iterator var2 = var1.iterator();
		while (var2.hasNext()) {
			DeletableResource var3 = (DeletableResource) var2.next();
			var3.delete();
		}
	}

	@ObfuscatedName("afc.rz()Z")
	public final boolean method16279() {
		return this.lightingEnabled;
	}

	@ObfuscatedName("afc.re(I)V")
	public void ensureTemporaryBufferCapacity(int arg0) {
		if (arg0 > this.field10048) {
			this.field10048 = arg0;
			this.temporaryBuffer = ByteBuffer.allocateDirect(this.field10048);
			this.temporaryBuffer.order(ByteOrder.nativeOrder());
			this.temporaryBufferAddress = DirectBufferHelper.getDirectBufferAddress(this.temporaryBuffer);
		}
	}

	@ObfuscatedName("afc.rt(I)Ljava/nio/ByteBuffer;")
	public ByteBuffer method16151(int arg0) {
		ByteBuffer var2 = ByteBuffer.allocateDirect(arg0);
		var2.order(ByteOrder.nativeOrder());
		return var2;
	}

	@ObfuscatedName("afc.rl(Ljava/nio/ByteBuffer;)J")
	public long method15963(ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@ObfuscatedName("afc.rr(Ljava/lang/String;Ljava/lang/String;)[B")
	public byte[] method15965(String arg0, String arg1) {
		return this.field10041.getfile(arg0, arg1);
	}

	@ObfuscatedName("afc.rd([B)Lhj;")
	public ShaderData method15971(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new ShaderData(arg0);
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfuscatedName("afc.rb()V")
	public static void method15968() throws NativeLibraryException {
		NativeLibraries.getLoader().load("jaclib");
	}

	public GpuToolkit(MaterialList arg0, TextureList arg1, BillboardTypeList arg2, ParticleEmitterTypeList arg3, ParticleEffectorTypeList arg4, Js5 arg5, int arg6, int arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		new Stream();
		this.field10058 = new GpuModel[8];
		this.field10207 = new GpuModel[8];
		this.field10208 = new Matrix4x4();
		this.field10209 = new Matrix4x3();
		try {
			this.field10041 = arg5;
			this.field10180 = arg6;
			this.field10185 = arg7;
			ColourUtils.method10156(false, true);
			if (this.field1596 == null) {
				this.field10188 = null;
			} else {
				this.field10188 = new MaterialTextureProvider(this, this.field1596);
			}
			if (this.field10185 == 0) {
				this.field10043 = ColourUtils.field8151;
			} else {
				this.field10043 = ColourUtils.field8150;
			}
			try {
				Field var9 = Unsafe.class.getDeclaredField("theUnsafe");
				var9.setAccessible(true);
				this.field10110 = (Unsafe) var9.get(null);
			} catch (Exception var12) {
			}
			this.ensureTemporaryBufferCapacity(4194304);
		} catch (Throwable var13) {
			var13.printStackTrace();
			this.dispose();
			if (var13 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var13;
			}
			throw new RuntimeException("");
		}
		this.setBufferHeap(this.createHeap(131072));
	}

	@ObfuscatedName("afc.ru()V")
	public final void init() {
		this.field10093 = new BaseTexture[this.maxSimutaneousTextures];
		this.field10162 = new Matrix4x4[this.maxSimutaneousTextures];
		this.field10135 = new TextureTramsformType[this.maxSimutaneousTextures];
		this.field10136 = new TextureCombineMode[this.maxSimutaneousTextures];
		this.field10137 = new TextureCombineMode[this.maxSimutaneousTextures];
		for (int var1 = 0; var1 < this.maxSimutaneousTextures; var1++) {
			this.field10137[var1] = TextureCombineMode.field3395;
			this.field10136[var1] = TextureCombineMode.field3395;
			this.field10135[var1] = TextureTramsformType.DISABLE;
			this.field10162[var1] = new Matrix4x4();
		}
		this.field10045 = new Light[this.maxActiveLights - 2];
		int[] var2 = new int[] { -1 };
		this.field10140 = this.method16033(1, 1, false, var2, 0, 0);
		var2[0] = -16777216;
		this.field10141 = this.method16033(1, 1, false, var2, 0, 0);
		this.setBufferHeap(new GpuHeap(262144));
		this.field10203 = this.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.TEX_COORD_2 }) });
		this.field10204 = this.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.COLOR }) });
		this.field10202 = this.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(VertexDeclarationElementComponent.VERTEX), new VertexDeclarationElement(VertexDeclarationElementComponent.COLOR), new VertexDeclarationElement(VertexDeclarationElementComponent.TEX_COORD_2), new VertexDeclarationElement(VertexDeclarationElementComponent.NORMAL) });
		this.field10184 = this.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(VertexDeclarationElementComponent.VERTEX), new VertexDeclarationElement(VertexDeclarationElementComponent.COLOR), new VertexDeclarationElement(VertexDeclarationElementComponent.TEX_COORD_2) });
		for (int var3 = 0; var3 < 8; var3++) {
			this.field10058[var3] = new GpuModel(this, 0, 0, false, false);
			this.field10207[var3] = new GpuModel(this, 0, 0, true, true);
		}
		this.method15970();
		this.field10077 = this.createIndexBuffer(true);
		this.method16232();
		this.resetClip();
		this.method2150();
		this.field10057 = new GpuSprite(this, this.field10140);
		this.field10143 = new GpuSprite(this, this.field10141);
		this.method2475(3, 0);
	}

	@ObfuscatedName("afc.sv()V")
	public final void method15970() {
		this.field10049 = new GpuWaterRelated(this);
		this.lightingEnabled = false;
		try {
			this.modelShader = new ProgrammableModelShader(this);
			this.spriteShader = new ProgrammableSpriteShader(this);
			this.batchedSpriteShader = new ProgrammableBatchedSpriteShader(this);
			this.particleShader = new ProgrammableParticleShader(this);
			this.waterShader = new EnvMappedWaterShader(this, this.field10049, false);
			this.seaWaterShader = new EnvMappedWaterShader(this, this.field10049, true);
			this.waterfallShader = new WaterfallShader(this, this.field10049);
		} catch (Exception var4) {
			var4.printStackTrace();
			this.modelShader = new FixedFunctionModelShader(this);
			this.spriteShader = new FixedFunctionSpriteShader(this);
			this.batchedSpriteShader = new FixedFunctionBatchedSpriteShader(this);
			this.particleShader = new FixedFunctionParticleShader(this);
			this.waterShader = null;
			this.seaWaterShader = null;
			this.waterfallShader = null;
			this.lightingEnabled = true;
		}
		if (!this.lightingEnabled) {
			int var2;
			int var3;
			if (this.renderTarget == null) {
				var3 = 0;
				var2 = 0;
			} else {
				var2 = this.renderTarget.getWidth();
				var3 = this.renderTarget.getHeight();
			}
			this.field10155 = new GpuPostProcessManager(this, var2, var3);
			this.field10080[3] = new ColourGradingBloomEffect(this);
			this.field10080[1] = new LevelsFilterEffect(this);
			this.field10080[2] = new ColourRemappingFilter(this);
			if (this.field10080[3].method5558()) {
				this.field10155.method5599(this.field10080[3]);
			}
			this.field10155.method5599(this.field10080[1]);
			this.field10155.method5599(this.field10080[2]);
			this.method15980();
			this.method15986();
		}
		if (this.field10067 != null) {
			this.field10067.method5416();
			this.field10067 = null;
		}
		this.method16105();
	}

	@ObfuscatedName("afc.sw()V")
	public void method16232() {
		this.enableColorWriteTest(7);
		this.method16367();
	}

	@ObfuscatedName("afc.ss()V")
	public final void method16367() {
		this.enableLightingAmbient();
		this.enableLightingDiffuse();
		this.enableLighting();
		this.method16199();
		this.enableLightingView();
		this.method16023();
		this.enableLighting0and1();
		this.enableDepth();
		this.enableDepthWrite();
		this.enableFog();
		this.setFogParameters();
		this.enableAlphaBlend();
		this.enableBlend();
		this.enableAlphaTest();
		for (int var1 = this.maxSimutaneousTextures - 1; var1 >= 0; var1--) {
			this.setActiveTexture(var1);
			this.method16256();
			this.method16052();
			this.method16048();
		}
		this.enableTextureFactor();
		this.method15997();
	}

	@ObfuscatedName("afc.sx()V")
	public void method15973() {
		if (this.field10155 != null) {
			this.field10155.method5607();
		}
		if (this.field10197 != null) {
			this.field10197.delete();
		}
		if (this.field10196 != null) {
			this.field10196.delete();
		}
		if (this.field10195 != null) {
			this.field10195.delete();
		}
		if (this.field10100 != null) {
			this.field10100.method5838();
		}
		for (int var1 = 0; var1 < 8; var1++) {
			if (this.field10207[var1] != null) {
				this.field10207[var1].method15612();
			}
		}
		if (this.field10198 != null) {
			this.field10198.method5756();
		}
		if (this.field10077 != null) {
			this.field10077.delete();
		}
		if (this.field10146 != null) {
			this.field10146.method5795();
			this.field10146 = null;
		}
	}

	@ObfuscatedName("afc.sm()V")
	public void method16105() {
		if (this.field10155 != null) {
			this.field10155.method5608();
		}
		if (this.field10080 != null) {
			for (int var1 = 0; var1 < this.field10080.length; var1++) {
				if (this.field10080[var1] != null && this.field10080[var1].method5593()) {
					this.field10080[var1].method5561();
				}
			}
		}
		this.field10198 = new GpuParticleRenderer(this);
		this.method15974();
		this.method16125();
		this.method15976();
		this.field10100 = new PrimitiveVertexBuffer(this, 1024);
		this.field10198.method5755(this);
		if (this.hasFramebufferObject) {
			this.field10146 = new GpuRendererRelated6(this, 1024);
		}
	}

	@ObfuscatedName("afc.sk()V")
	public final void method15974() {
		this.field10197 = this.createVertexBuffer(false);
		short var1 = 160;
		this.field10197.allocate(var1, 32);
		this.temporaryBuffer.clear();
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putInt(-1);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putInt(-1);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putInt(-1);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putInt(-1);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(1.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putInt(-1);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.field10197.upload(0, this.temporaryBuffer.position(), this.temporaryBufferAddress);
		this.field10055 = this.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.COLOR, VertexDeclarationElementComponent.TEX_COORD_2, VertexDeclarationElementComponent.TEX_COORD_2 }) });
	}

	@ObfuscatedName("afc.si()V")
	public final void method16125() {
		this.field10196 = this.createVertexBuffer(true);
		byte var1 = 24;
		this.field10196.allocate(var1, 12);
		this.field10150 = this.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(VertexDeclarationElementComponent.VERTEX) });
	}

	@ObfuscatedName("afc.se()V")
	public final void method15976() {
		this.field10195 = this.createVertexBuffer(false);
		this.field10195.allocate(3096, 12);
		this.temporaryBuffer.clear();
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		this.temporaryBuffer.putFloat(0.0F);
		for (int var1 = 0; var1 <= 256; var1++) {
			double var2 = (double) (var1 * 2) * 3.141592653589793D / 256.0D;
			float var4 = (float) Math.cos(var2);
			float var5 = (float) Math.sin(var2);
			this.temporaryBuffer.putFloat(var5);
			this.temporaryBuffer.putFloat(var4);
			this.temporaryBuffer.putFloat(0.0F);
		}
		this.field10195.upload(0, this.temporaryBuffer.position(), this.temporaryBufferAddress);
	}

	@ObfuscatedName("afc.sn(FFFFFF)Z")
	public boolean method15977(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.ensureTemporaryBufferCapacity(24);
		this.temporaryBuffer.clear();
		this.temporaryBuffer.putFloat(arg0);
		this.temporaryBuffer.putFloat(arg1);
		this.temporaryBuffer.putFloat(arg2);
		this.temporaryBuffer.putFloat(arg3);
		this.temporaryBuffer.putFloat(arg4);
		this.temporaryBuffer.putFloat(arg5);
		return this.field10196.upload(0, this.temporaryBuffer.position(), this.temporaryBufferAddress);
	}

	@ObfuscatedName("afc.p()V")
	public void method2369() {
		if (this.field10183) {
			return;
		}
		this.method15973();
		this.field10188.method5644();
		for (Node var1 = this.field10051.head(); var1 != null; var1 = this.field10051.next()) {
			((GpuHeap) var1).method19240();
		}
		ColourUtils.method14805(false, true);
		for (int var2 = 0; var2 < this.field10147.length; var2++) {
			if (this.field10147[var2] != null) {
				this.field10147[var2].method5429();
				this.field10147[var2] = null;
			}
		}
		for (int var3 = 0; var3 < this.field10080.length; var3++) {
			if (this.field10080[var3] != null) {
				this.field10080[var3].method5570();
				this.field10080[var3] = null;
			}
		}
		this.method15956();
		this.cycle(0);
		this.field10183 = true;
	}

	@ObfuscatedName("afc.r()Z")
	public final boolean method2194() {
		return true;
	}

	@ObfuscatedName("afc.v()Z")
	public final boolean method2123() {
		return true;
	}

	@ObfuscatedName("afc.o()Z")
	public final boolean method2124() {
		return true;
	}

	@ObfuscatedName("afc.y()Z")
	public final boolean isBloomSupported() {
		return this.field10080[3] != null;
	}

	@ObfuscatedName("afc.q()Z")
	public final boolean method2127() {
		return true;
	}

	@ObfuscatedName("afc.s()Z")
	public final boolean supportsHardShadows() {
		return true;
	}

	@ObfuscatedName("afc.b()Z")
	public final boolean method2129() {
		return true;
	}

	@ObfuscatedName("afc.h()Z")
	public final boolean hasExtraDrawDistance() {
		return true;
	}

	@ObfuscatedName("afc.a()Z")
	public final boolean method2240() {
		return false;
	}

	@ObfuscatedName("afc.x()Z")
	public final boolean supportsAntiAliasing() {
		return this.hasMultiSample;
	}

	@ObfuscatedName("afc.i()[I")
	public final int[] textureFormat() {
		return null;
	}

	@ObfuscatedName("afc.d(I)V")
	public void cycle(int arg0) {
		if (this.field10188 != null) {
			this.field10188.method5643();
		}
		this.field10181 = arg0 & Integer.MAX_VALUE;
	}

	@ObfuscatedName("afc.sq()Llm;")
	public GpuImageRelated method16337() {
		return this.field10146 == null ? GpuImageRelated.field3236 : this.field10146.method5803();
	}

	@ObfuscatedName("afc.cm()V")
	public void flush() {
		if (this.field10146 != null) {
			this.field10146.method5796();
		}
	}

	@ObfuscatedName("afc.cq()V")
	public void method2203() {
		if (this.field10146 != null) {
			this.field10146.method5805();
		}
	}

	@ObfuscatedName("afc.ch()V")
	public void method2204() {
		if (this.field10146 != null) {
			this.field10146.method5802();
		}
	}

	@ObfuscatedName("afc.sh()V")
	public void method15989() {
		this.method15982();
	}

	@ObfuscatedName("afc.st()V")
	public void method15982() {
		this.method16009();
		this.method16011();
		this.method16084();
		this.method2263();
		this.resetClip();
	}

	@ObfuscatedName("afc.dy(IIII)V")
	public final void method2172(int arg0, int arg1, int arg2, int arg3) {
		if (this.field10155 == null) {
			return;
		}
		for (int var5 = 0; var5 < this.field10080.length; var5++) {
			if (this.field10080[var5] != null && this.field10080[var5].method5593() && !this.field10080[var5].method5571()) {
				if (!this.field10155.method5600(arg0, arg1, arg2, arg3)) {
					this.field10155.method5607();
					this.field10155 = null;
				}
				return;
			}
		}
	}

	@ObfuscatedName("afc.db(II)V")
	public final void method2233(int arg0, int arg1) {
		if (this.field10155 != null) {
			this.field10155.method5605(arg0, arg1);
		}
	}

	@ObfuscatedName("afc.dh()Z")
	public final boolean method2234() {
		return this.field10155 != null && this.field10155.field3261;
	}

	@ObfuscatedName("afc.sl()Z")
	public boolean method15980() {
		if (this.field10080[1] == null || this.field10080[1].method5593()) {
			return false;
		}
		boolean var1 = this.field10155.method5599(this.field10080[1]);
		if (var1) {
			this.field10188.method5644();
		}
		return var1;
	}

	@ObfuscatedName("afc.dx()Z")
	public boolean isLevelsEnabled() {
		return this.field10080[1] != null && this.field10080[1].method5593();
	}

	@ObfuscatedName("afc.dg(FFFFF)V")
	public void setLevels(float arg0, float arg1, float arg2, float arg3, float arg4) {
		LevelsFilterEffect.paramsGamma = arg0;
		LevelsFilterEffect.field10642 = arg1;
		LevelsFilterEffect.field10643 = arg2;
		LevelsFilterEffect.field10650 = arg3;
		LevelsFilterEffect.field10651 = arg4;
	}

	@ObfuscatedName("afc.de([I)Lcj;")
	public ColourRemapper createColourRemapper(int[] arg0) {
		return new GpuColourRemapper(this, arg0);
	}

	@ObfuscatedName("afc.sp()Z")
	public boolean method15986() {
		if (this.field10080[2] == null || this.field10080[2].method5593()) {
			return false;
		}
		boolean var1 = this.field10155.method5599(this.field10080[2]);
		if (var1) {
			this.field10188.method5644();
		}
		return var1;
	}

	@ObfuscatedName("afc.dj()Z")
	public boolean method2238() {
		return this.field10080[2] != null && this.field10080[2].method5593();
	}

	@ObfuscatedName("afc.eo(Lcj;FLcj;FLcj;F)V")
	public void setColourRemapping(ColourRemapper arg0, float arg1, ColourRemapper arg2, float arg3, ColourRemapper arg4, float arg5) {
		int var7 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		ColourRemappingFilter.field10653[0] = (GpuColourRemapper) arg0;
		ColourRemappingFilter.field10663[0] = arg1;
		if (arg1 > 0.0F) {
			var7++;
		}
		ColourRemappingFilter.field10653[1] = (GpuColourRemapper) arg2;
		ColourRemappingFilter.field10663[1] = arg3;
		if (arg3 > 0.0F) {
			var7++;
		}
		ColourRemappingFilter.field10653[2] = (GpuColourRemapper) arg4;
		ColourRemappingFilter.field10663[2] = arg5;
		if (arg5 > 0.0F) {
			var7++;
		}
		ColourRemappingFilter.field10655 = var7;
		ColourRemappingFilter.field10656 = 1.0F - (arg1 + arg3 + arg5);
	}

	@ObfuscatedName("afc.ey()Z")
	public final boolean enableBloom() {
		if (this.field10080[3] == null || this.field10080[3].method5593()) {
			return false;
		}
		boolean var1 = this.field10155.method5599(this.field10080[3]);
		if (var1) {
			this.field10188.method5644();
		}
		return var1;
	}

	@ObfuscatedName("afc.eu()V")
	public final void disableBloom() {
		if (this.field10080[3] != null && this.field10080[3].method5593()) {
			this.field10155.method5606(this.field10080[3]);
			this.field10188.method5644();
		}
	}

	@ObfuscatedName("afc.ed()Z")
	public final boolean isBloomEnabled() {
		return this.field10080[3] != null && this.field10080[3].method5593();
	}

	@ObfuscatedName("afc.es(FFFFFF)V")
	public final void setBloom(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		ColourGradingBloomEffect.field10625 = arg0;
		ColourGradingBloomEffect.field10624 = arg1;
		ColourGradingBloomEffect.field10623 = arg2;
		ColourGradingBloomEffect.field10626 = arg5;
	}

	@ObfuscatedName("afc.cp(I)Lakz;")
	public final Heap createHeap(int arg0) {
		GpuHeap var2 = new GpuHeap(arg0);
		this.field10051.addTail(var2);
		return var2;
	}

	@ObfuscatedName("afc.ca(Lakz;)V")
	public final void setBufferHeap(Heap arg0) {
		this.field10154 = ((GpuHeap) arg0).field12208;
	}

	@ObfuscatedName("afc.su(IZ)Ljaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer createHeapBuffer(int arg0, boolean arg1) {
		return this.field10154.method92(arg0, arg1);
	}

	@ObfuscatedName("afc.sd(I)Lml;")
	public final GpuIndexBuffer method15988(int arg0) {
		if (this.field10077.method5743() < arg0 * 2) {
			this.field10077.method5831(arg0);
		}
		return this.field10077;
	}

	@ObfuscatedName("afc.c()I")
	public final int method2520() {
		return this.field10053 + this.field10052 + this.field10117;
	}

	@ObfuscatedName("afc.cw(IIZZ)Lcm;")
	public final Sprite createSprite(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new GpuSprite(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("afc.co(Lde;Z)Lcm;")
	public final Sprite createSprite(SpriteData arg0, boolean arg1) {
		Sprite var4;
		if (arg0.getWidth() == 0 || arg0.getHeight() == 0) {
			var4 = this.createSprite(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			int[] var3 = arg0.method2604(false);
			var4 = this.createSprite(var3, 0, arg0.getWidth(), arg0.getWidth(), arg0.getHeight());
		}
		var4.setPadding(arg0.getPaddingLeft(), arg0.getPaddingTop(), arg0.getPaddingRight(), arg0.getPaddingBottom());
		return var4;
	}

	@ObfuscatedName("afc.ct([IIIIIZ)Lcm;")
	public final Sprite createSprite(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new GpuSprite(this, arg3, arg4, arg0, arg1, arg2);
	}

	@ObfuscatedName("afc.cr(IIIIZ)Lcm;")
	public final Sprite method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		GpuSprite var6 = new GpuSprite(this, arg2, arg3, arg4, false);
		var6.draw(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("afc.cy(Laac;Lde;Z)Leu;")
	public final Font createFont(FontMetrics arg0, SpriteData arg1, boolean arg2) {
		return new GpuFont(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("afc.cb(II[I[I)Lch;")
	public final SpriteRelated method2205(int arg0, int arg1, int[] arg2, int[] arg3) {
		return GpuRelated2.method15388(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("afc.ck(I)V")
	public final void setVertexCapacity(int arg0) {
	}

	@ObfuscatedName("afc.cj(Ldq;IIII)Ldo;")
	public final Model createModel(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
		return new GpuModel(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("afc.cd(II)I")
	public final int method2394(int arg0, int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@ObfuscatedName("afc.dd(II)I")
	public final int method2213(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("afc.dr(II[[I[[IIII)Lcb;")
	public final FloorModel createFloor(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new GpuFloorModel(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("afc.cc()Lpq;")
	public final Matrix4x4 method2208() {
		return this.field10208;
	}

	@ObfuscatedName("afc.cz()Lou;")
	public final Matrix4x3 method2209() {
		return this.field10209;
	}

	@ObfuscatedName("afc.du(I)Ldz;")
	public final EnvironmentSampler createEnvironmentSampler(int arg0) {
		return new GpuEnvironmentSampler_Sub1(this, arg0);
	}

	@ObfuscatedName("afc.dp(Ldz;)V")
	public final void setEnvironmentSampler(EnvironmentSampler arg0) {
		this.field10161 = (GpuEnvironmentSampler) arg0;
	}

	@ObfuscatedName("afc.sz()Lmr;")
	public final GpuCubeTexture getEnvMapSampler() {
		return this.field10161 == null ? null : this.field10161.method15652();
	}

	@ObfuscatedName("afc.bk()V")
	public void method2263() {
		this.field10097 = 0;
		this.field10098 = 0;
		this.field10139 = this.renderTarget.getWidth();
		this.field10082 = this.renderTarget.getHeight();
		this.method16063();
	}

	@ObfuscatedName("afc.bh(IIII)V")
	public void method2164(int arg0, int arg1, int arg2, int arg3) {
		this.field10097 = arg0;
		this.field10098 = arg1;
		this.field10139 = arg2;
		this.field10082 = arg3;
		this.method16063();
	}

	@ObfuscatedName("afc.bx([I)V")
	public void method2326(int[] arg0) {
		arg0[0] = this.field10097;
		arg0[1] = this.field10098;
		arg0[2] = this.field10139;
		arg0[3] = this.field10082;
	}

	@ObfuscatedName("afc.sf()V")
	public final void method16063() {
		if (GpuRendererRelated3.field3321 == this.field10050) {
			this.field10101 = this.field10097;
			this.field10102 = this.field10098;
			this.field10103 = this.field10139;
			this.field10104 = this.field10082;
			this.field10087 = this.field10089;
			this.field10088 = this.field10090;
		} else {
			this.field10101 = 0;
			this.field10102 = 0;
			this.field10103 = this.renderTarget.getWidth();
			this.field10104 = this.renderTarget.getHeight();
			this.field10087 = 0.0F;
			this.field10088 = 1.0F;
		}
		this.method15997();
		this.field10084 = (float) this.field10139 / 2.0F;
		this.field10086 = (float) this.field10082 / 2.0F;
		this.field10083 = (float) this.field10097 + this.field10084;
		this.field10085 = (float) this.field10098 + this.field10086;
	}

	@ObfuscatedName("afc.bd(FF)V")
	public void method2339(float arg0, float arg1) {
		this.field10089 = arg0;
		this.field10090 = arg1;
		this.method16063();
	}

	@ObfuscatedName("afc.bq([I)V")
	public final void method2171(int[] arg0) {
		arg0[0] = this.left;
		arg0[1] = this.top;
		arg0[2] = this.right;
		arg0[3] = this.bottom;
	}

	@ObfuscatedName("afc.bc()V")
	public final void resetClip() {
		if (this.renderTarget == null) {
			this.bottom = 0;
			this.right = 0;
			this.top = 0;
			this.left = 0;
		} else {
			this.top = 0;
			this.left = 0;
			this.right = this.renderTarget.getWidth();
			this.bottom = this.renderTarget.getHeight();
		}
		if (this.field10182) {
			this.field10182 = false;
			this.enableScissorTest();
		}
	}

	@ObfuscatedName("afc.bi(IIII)V")
	public final void resetBounds(int left, int top, int right, int bottom) {
		int width;
		int height;
		if (this.renderTarget == null) {
			height = 0;
			width = 0;
		} else {
			width = this.renderTarget.getWidth();
			height = this.renderTarget.getHeight();
		}
		if (left <= 0 && right >= width - 1 && top <= 0 && bottom >= height - 1) {
			this.resetClip();
			return;
		}
		this.left = left >= 0 ? left : 0;
		this.right = right <= width ? right : width;
		this.top = top >= 0 ? top : 0;
		this.bottom = bottom <= height ? bottom : height;
		if (!this.field10182 && (this.field10144 || this.method16337() == GpuImageRelated.field3236)) {
			this.field10182 = true;
			this.enableScissorTest();
		}
		if (this.field10182) {
			this.method15955();
		}
	}

	@ObfuscatedName("afc.bn(IIII)V")
	public final void setBounds(int left, int top, int right, int bottom) {
		int width;
		int height;
		if (this.renderTarget == null) {
			height = 0;
			width = 0;
		} else {
			width = this.renderTarget.getWidth();
			height = this.renderTarget.getHeight();
		}
		int var7 = left >= 0 ? left : 0;
		int var8 = right <= width ? right : width;
		int var9 = top >= 0 ? top : 0;
		int var10 = bottom <= height ? bottom : height;
		boolean var11 = false;
		if (this.left < var7) {
			this.left = var7;
			var11 = true;
		}
		if (this.right > var8) {
			this.right = var8;
			var11 = true;
		}
		if (this.top < var9) {
			this.top = var9;
			var11 = true;
		}
		if (this.bottom > var10) {
			this.bottom = var10;
			var11 = true;
		}
		if (!var11) {
			return;
		}
		if (!this.field10182 && (this.field10144 || this.method16337() == GpuImageRelated.field3236)) {
			this.field10182 = true;
			this.enableScissorTest();
		}
		if (this.field10182) {
			this.method15955();
		}
	}

	@ObfuscatedName("afc.sy(II)V")
	public final void method15996(int arg0, int arg1) {
		this.field10105 = arg0;
		this.field10132 = arg1;
		this.method15997();
		if (!this.field10182 && (this.field10144 || this.method16337() == GpuImageRelated.field3236)) {
			this.field10182 = true;
			this.enableScissorTest();
		}
		if (this.field10182) {
			this.method15955();
		}
	}

	@ObfuscatedName("afc.bt(Z)V")
	public void method2170(boolean arg0) {
		this.field10144 = arg0;
	}

	@ObfuscatedName("afc.so()Lpq;")
	public final Matrix4x4 getViewMatrix() {
		return GpuRendererRelated3.field3321 == this.field10050 ? this.field10059 : field10064;
	}

	@ObfuscatedName("afc.sc()Lpq;")
	public final Matrix4x4 method16035() {
		return GpuRendererRelated3.field3321 == this.field10050 ? this.field10035 : field10064;
	}

	@ObfuscatedName("afc.do(Lou;)V")
	public final void method2217(Matrix4x3 arg0) {
		this.field10201 = arg0;
		this.field10059.setToMatrix4x3(this.field10201);
		this.field10190.setTo(this.field10059);
		this.field10190.method6631();
		this.field10042.setTo(arg0);
		this.field10042.method6300();
		this.field10035.setToMatrix4x3(this.field10042);
		this.method16001();
		if (GpuRendererRelated3.field3321 == this.field10050) {
			this.method16366();
		}
	}

	@ObfuscatedName("afc.dz()Lou;")
	public Matrix4x3 method2218() {
		return this.field10201;
	}

	@ObfuscatedName("afc.dm(Lpq;)V")
	public final void method2220(Matrix4x4 arg0) {
		this.field10076.setTo(arg0);
		this.method16001();
		if (GpuRendererRelated3.field3321 == this.field10050) {
			this.method16013();
		}
	}

	@ObfuscatedName("afc.sg()V")
	public final void method16001() {
		this.field10145.setTo(this.field10059);
		this.field10145.multiply(this.field10076);
		this.field10145.method6607(this.field10061[0]);
		this.field10145.method6643(this.field10061[1]);
		this.field10145.method6625(this.field10061[2]);
		this.field10145.method6626(this.field10061[3]);
		this.field10145.method6627(this.field10061[4]);
		this.field10145.method6628(this.field10061[5]);
		this.field10081.setTo(this.field10145);
		this.method16006(this.field10081);
	}

	@ObfuscatedName("afc.dq()Lpq;")
	public final Matrix4x4 method2355() {
		return this.field10076;
	}

	@ObfuscatedName("afc.tu()V")
	public final void method16366() {
		this.field10070 = false;
	}

	@ObfuscatedName("afc.ta()Lpq;")
	public Matrix4x4 getModelMatrix() {
		return this.field10056;
	}

	@ObfuscatedName("afc.tr()Lou;")
	public Matrix4x3 method16003() {
		if (GpuRendererRelated3.field3321 != this.field10050) {
			return this.field10200;
		}
		if (!this.field10070) {
			this.field10062.setTo(this.field10200);
			this.field10062.method6316(this.field10201);
			this.field10063.setToMatrix4x3(this.field10062);
			this.field10070 = true;
		}
		return this.field10062;
	}

	@ObfuscatedName("afc.tc()Lpq;")
	public Matrix4x4 getModelViewMatrix() {
		if (GpuRendererRelated3.field3321 == this.field10050) {
			if (!this.field10070) {
				this.method16003();
			}
			return this.field10063;
		} else {
			return this.field10056;
		}
	}

	@ObfuscatedName("afc.tj()Lpq;")
	public final Matrix4x4 method16228() {
		return this.field10081;
	}

	@ObfuscatedName("afc.te()Lpq;")
	public final Matrix4x4 getProjectionMatrix() {
		return this.projectionMatrix;
	}

	@ObfuscatedName("afc.tm()V")
	public final void method16084() {
		if (GpuRendererRelated3.field3319 == this.field10050) {
			return;
		}
		GpuRendererRelated3 var1 = this.field10050;
		this.field10050 = GpuRendererRelated3.field3319;
		if (GpuRendererRelated3.field3321 == var1) {
			this.method16366();
		}
		this.field10078 = this.field10168;
		this.method16013();
		this.method16063();
		this.field10205 &= 0xFFFFFFE0;
	}

	@ObfuscatedName("afc.ty()V")
	public final void method15981() {
		if (GpuRendererRelated3.field3320 == this.field10050) {
			return;
		}
		GpuRendererRelated3 var1 = this.field10050;
		this.field10050 = GpuRendererRelated3.field3320;
		if (GpuRendererRelated3.field3321 == var1) {
			this.method16366();
		}
		this.method16086();
		this.field10078 = this.field10073;
		this.method16013();
		this.method16063();
		this.field10205 &= 0xFFFFFFE7;
	}

	@ObfuscatedName("afc.tb()V")
	public final void method16009() {
		this.field10121 = false;
		if (GpuRendererRelated3.field3320 == this.field10050) {
			this.method16086();
			this.method16013();
		}
	}

	@ObfuscatedName("afc.tn()V")
	public final void method16010() {
		if (GpuRendererRelated3.field3321 == this.field10050) {
			return;
		}
		this.field10050 = GpuRendererRelated3.field3321;
		this.method16366();
		this.method16116();
		this.field10078 = this.field10076;
		this.method16013();
		this.method16063();
		this.field10205 &= 0xFFFFFFF8;
	}

	@ObfuscatedName("afc.tw()V")
	public final void method16011() {
		this.field10194 = false;
		this.method16116();
		if (GpuRendererRelated3.field3321 == this.field10050) {
			this.method16013();
		}
	}

	@ObfuscatedName("afc.tz()V")
	public final void method16086() {
		if (this.field10121) {
			return;
		}
		int var1;
		int var2;
		if (this.renderTarget == null) {
			var2 = 0;
			var1 = 0;
		} else {
			var1 = this.renderTarget.getWidth();
			var2 = this.renderTarget.getHeight();
		}
		Matrix4x4 var3 = this.field10073;
		if (var1 == 0 || var2 == 0) {
			var3.setToIdentity();
		} else {
			var3.method6617(0.0F, (float) var1, 0.0F, (float) var2, -1.0F, 1.0F);
		}
		this.field10068.setTo(var3);
		this.method16006(this.field10068);
		this.field10121 = true;
	}

	@ObfuscatedName("afc.tf()V")
	public final void method16116() {
		if (!this.field10194) {
			this.field10194 = true;
		}
	}

	@ObfuscatedName("afc.th()V")
	public final void method16013() {
		this.projectionMatrix.setTo(this.field10078);
		this.method16006(this.projectionMatrix);
		this.field10092 = (this.projectionMatrix.entries[14] - this.projectionMatrix.entries[15]) / (this.projectionMatrix.entries[11] - this.projectionMatrix.entries[10]);
		this.field10170 = -this.projectionMatrix.entries[14] / this.projectionMatrix.entries[10];
		this.method16088();
	}

	@ObfuscatedName("afc.dv(Z)V")
	public final void method2219(boolean arg0) {
		this.field10107 = arg0;
		this.enableDepthWrite();
	}

	@ObfuscatedName("afc.tt(Z)V")
	public final void method16015(boolean arg0) {
		if (this.field10044 != arg0) {
			this.field10044 = arg0;
			this.enableDepth();
			this.field10205 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afc.ts(Z)V")
	public final void method16361(boolean arg0) {
		if (this.field10108 != arg0) {
			this.field10108 = arg0;
			this.enableDepthWrite();
			this.field10205 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afc.ev(FFF[F)V")
	public void method2525(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field10145.entries[11] * arg2 + this.field10145.entries[7] * arg1 + this.field10145.entries[3] * arg0 + this.field10145.entries[15];
		float var6 = this.field10145.entries[8] * arg2 + this.field10145.entries[4] * arg1 + this.field10145.entries[0] * arg0 + this.field10145.entries[12];
		float var7 = this.field10145.entries[9] * arg2 + this.field10145.entries[5] * arg1 + this.field10145.entries[1] * arg0 + this.field10145.entries[13];
		float var8 = this.field10059.entries[10] * arg2 + this.field10059.entries[6] * arg1 + this.field10059.entries[2] * arg0 + this.field10059.entries[14];
		arg3[0] = this.field10084 * var6 / var5 + this.field10083;
		arg3[1] = this.field10086 * var7 / var5 + this.field10085;
		arg3[2] = var8;
	}

	@ObfuscatedName("afc.ep(FFF[F)V")
	public void method2507(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field10145.entries[10] * arg2 + this.field10145.entries[6] * arg1 + this.field10145.entries[2] * arg0 + this.field10145.entries[14];
		float var6 = this.field10145.entries[11] * arg2 + this.field10145.entries[7] * arg1 + this.field10145.entries[3] * arg0 + this.field10145.entries[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field10145.entries[8] * arg2 + this.field10145.entries[4] * arg1 + this.field10145.entries[0] * arg0 + this.field10145.entries[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field10145.entries[9] * arg2 + this.field10145.entries[5] * arg1 + this.field10145.entries[1] * arg0 + this.field10145.entries[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field10059.entries[10] * arg2 + this.field10059.entries[6] * arg1 + this.field10059.entries[2] * arg0 + this.field10059.entries[14];
			arg3[0] = this.field10084 * var7 / var6 + this.field10083;
			arg3[1] = this.field10086 * var8 / var6 + this.field10085;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("afc.cu(IIIIII)I")
	public int method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field10145.entries[10] * (float) arg2 + this.field10145.entries[6] * (float) arg1 + this.field10145.entries[2] * (float) arg0 + this.field10145.entries[14];
		float var9 = this.field10145.entries[10] * (float) arg5 + this.field10145.entries[6] * (float) arg4 + this.field10145.entries[2] * (float) arg3 + this.field10145.entries[14];
		float var10 = this.field10145.entries[11] * (float) arg2 + this.field10145.entries[7] * (float) arg1 + this.field10145.entries[3] * (float) arg0 + this.field10145.entries[15];
		float var11 = this.field10145.entries[11] * (float) arg5 + this.field10145.entries[7] * (float) arg4 + this.field10145.entries[3] * (float) arg3 + this.field10145.entries[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field10145.entries[8] * (float) arg2 + this.field10145.entries[4] * (float) arg1 + this.field10145.entries[0] * (float) arg0 + this.field10145.entries[12];
		float var13 = this.field10145.entries[8] * (float) arg5 + this.field10145.entries[4] * (float) arg4 + this.field10145.entries[0] * (float) arg3 + this.field10145.entries[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field10145.entries[9] * (float) arg2 + this.field10145.entries[5] * (float) arg1 + this.field10145.entries[1] * (float) arg0 + this.field10145.entries[13];
		float var15 = this.field10145.entries[9] * (float) arg5 + this.field10145.entries[5] * (float) arg4 + this.field10145.entries[1] * (float) arg3 + this.field10145.entries[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("afc.cn(IIIILou;Loj;)Z")
	public boolean pick(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, Cuboid arg5) {
		Matrix4x4 var7 = this.field10066;
		var7.setToMatrix4x3(arg4);
		var7.multiply(this.field10145);
		return arg5.pick(arg0, arg1, arg2, arg3, var7, this.field10083, this.field10085, this.field10084, this.field10086);
	}

	@ObfuscatedName("afc.cv(Lou;Led;Loj;)V")
	public void method2193(Matrix4x3 arg0, ScreenBoundingBox arg1, Cuboid arg2) {
		Matrix4x4 var4 = this.field10066;
		var4.setToMatrix4x3(arg0);
		var4.multiply(this.field10145);
		arg1.method2746(arg2, this.field10076, var4, this.field10083, this.field10085, this.field10084, this.field10086);
	}

	@ObfuscatedName("afc.df()I")
	public final int getMaxLights() {
		return this.maxActiveLights - 2;
	}

	@ObfuscatedName("afc.to(Z)V")
	public final void method16118(boolean arg0) {
		if (this.field10111 != arg0) {
			this.field10111 = arg0;
			this.enableLighting();
			this.field10205 &= 0xFFFFFFF8;
		}
	}

	@ObfuscatedName("afc.ds(I[Lakf;)V")
	public final void setActiveLights(int arg0, Light[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field10045[var3] = arg1[var3];
		}
		this.field10127 = arg0;
	}

	@ObfuscatedName("afc.dc(F)V")
	public final void setSunAmbientIntensity(float arg0) {
		if (this.field10122 != arg0) {
			this.field10122 = arg0;
			this.enableLightingAmbient();
			this.method16023();
		}
	}

	@ObfuscatedName("afc.di(IFFFFF)V")
	public final void setSun(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.field10118 != arg0;
		float var8 = arg1 * 0.5F;
		float var9 = arg2 * 0.5F;
		if (var7 || this.field10123 != var8 || this.field10124 != var9) {
			this.field10118 = arg0;
			this.field10123 = var8;
			this.field10124 = var9;
			if (var7) {
				this.field10142 = (float) (this.field10118 & 0xFF0000) / 1.671168E7F;
				this.field10120 = (float) (this.field10118 & 0xFF00) / 65280.0F;
				this.field10210 = (float) (this.field10118 & 0xFF) / 255.0F;
				this.enableLightingAmbient();
			}
			this.enableLightingDiffuse();
		}
		if (this.field10173[0] != arg3 || this.field10173[1] != arg4 || this.field10173[2] != arg5) {
			this.field10173[0] = arg3;
			this.field10173[1] = arg4;
			this.field10173[2] = arg5;
			this.field10075[0] = -arg3;
			this.field10075[1] = -arg4;
			this.field10075[2] = -arg5;
			float var10 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.field10114[0] = arg3 * var10;
			this.field10114[1] = arg4 * var10;
			this.field10114[2] = arg5 * var10;
			this.field10072[0] = -this.field10114[0];
			this.field10072[1] = -this.field10114[1];
			this.field10072[2] = -this.field10114[2];
			this.enableLightingView();
			this.field10130 = (int) (arg3 * 256.0F / arg4);
			this.field10131 = (int) (arg5 * 256.0F / arg4);
		}
		this.method16023();
	}

	@ObfuscatedName("afc.dk(I)V")
	public final void method2224(int arg0) {
		this.field10129 = 0;
		while (arg0 > 1) {
			this.field10129++;
			arg0 >>= 0x1;
		}
		this.field10128 = 0x1 << this.field10129;
	}

	@ObfuscatedName("afc.ul()V")
	public final void method16199() {
		if (this.method16279()) {
			this.method16025();
		}
		this.field10126 = this.field10127;
	}

	@ObfuscatedName("afc.ui(IIZ[I)Llz;")
	public final GpuTexture method16204(int arg0, int arg1, boolean arg2, int[] arg3) {
		return this.method16033(arg0, arg1, arg2, arg3, 0, 0);
	}

	@ObfuscatedName("afc.ua(Lck;IIZ[B)Llz;")
	public final GpuTexture method16028(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
		return this.method15975(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@ObfuscatedName("afc.uf(Lck;IIZ[F)Llz;")
	public final GpuTexture method15992(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4) {
		return this.method16032(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@ObfuscatedName("afc.uv()I")
	public final int method16037() {
		return this.field10177;
	}

	@ObfuscatedName("afc.uw(I)V")
	public final void setActiveTexture(int arg0) {
		if (this.field10177 != arg0) {
			this.field10177 = arg0;
			this.method16051();
		}
	}

	public final void add(int arg0) {
		if (this.field10177 != arg0) {
			this.field10177 = arg0;
			this.method16051();
		}
	}

	@ObfuscatedName("afc.up(Lmq;)V")
	public final void setTexture(BaseTexture arg0) {
		if (this.field10093[this.field10177] == arg0) {
			return;
		}
		this.field10093[this.field10177] = arg0;
		if (arg0 == null) {
			this.field10140.method5823();
		} else {
			arg0.method5823();
		}
		this.field10205 &= 0xFFFFFFEE;
	}

	@ObfuscatedName("afc.uh(I)V")
	public final void method15991(int arg0) {
		switch(arg0) {
			case 0:
				this.method16115(TextureCombineMode.field3395, TextureCombineMode.field3395);
				break;
			case 1:
				this.method16115(TextureCombineMode.field3396, TextureCombineMode.field3396);
				break;
			case 2:
				this.method16115(TextureCombineMode.field3399, TextureCombineMode.field3396);
				break;
			case 3:
				this.method16115(TextureCombineMode.field3397, TextureCombineMode.field3395);
				break;
			case 4:
				this.method16115(TextureCombineMode.field3398, TextureCombineMode.field3398);
		}
	}

	@ObfuscatedName("afc.us(Lmk;Lmk;)V")
	public final void method16115(TextureCombineMode arg0, TextureCombineMode arg1) {
		boolean var3 = false;
		if (this.field10136[this.field10177] != arg0) {
			this.field10136[this.field10177] = arg0;
			this.method16256();
			var3 = true;
		}
		if (this.field10137[this.field10177] != arg1) {
			this.field10137[this.field10177] = arg1;
			this.method16052();
			var3 = true;
		}
		if (var3) {
			this.field10205 &= 0xFFFFFFE2;
		}
	}

	@ObfuscatedName("afc.ux(ILmn;)V")
	public final void method16041(int arg0, TextureCombiner arg1) {
		this.method16031(arg0, arg1, false, false);
	}

	@ObfuscatedName("afc.uu(ILmn;)V")
	public final void method16042(int arg0, TextureCombiner arg1) {
		this.method16043(arg0, arg1, false);
	}

	@ObfuscatedName("afc.un(I)V")
	public void method16044(int arg0) {
		if (this.field10160 != arg0) {
			this.field10160 = arg0;
			this.enableTextureFactor();
		}
	}

	@ObfuscatedName("afc.ue()Lpq;")
	public final Matrix4x4 getTextureMatrix() {
		return this.field10162[this.field10177];
	}

	@ObfuscatedName("afc.vq()Lpq;")
	public final Matrix4x4 method16046() {
		return this.field10162[this.field10177];
	}

	@ObfuscatedName("afc.vx(Lmv;)V")
	public final void method16174(TextureTramsformType arg0) {
		this.field10135[this.field10177] = arg0;
		this.method16270();
	}

	@ObfuscatedName("afc.vb()V")
	public final void method16048() {
		if (this.field10135[this.field10177] != TextureTramsformType.DISABLE) {
			this.field10135[this.field10177] = TextureTramsformType.DISABLE;
			this.field10162[this.field10177].setToIdentity();
			this.method16270();
		}
	}

	@ObfuscatedName("afc.vl()V")
	public final void method16270() {
		this.method16050();
	}

	@ObfuscatedName("afc.vu()Ldy;")
	public WaterFogData method16053() {
		return this.field10165;
	}

	@ObfuscatedName("afc.ei(ILdy;)V")
	public final void method2245(int arg0, WaterFogData arg1) {
		this.field10164 = arg0;
		this.field10165 = arg1;
		this.field10133 = true;
	}

	@ObfuscatedName("afc.el(ILdy;)V")
	public final void setWaterFog(int arg0, WaterFogData arg1) {
		if (!this.field10133) {
			throw new RuntimeException("");
		}
		this.field10164 = arg0;
		this.field10165 = arg1;
		if (this.field10163) {
			this.field10147[3].method5418();
			this.field10147[3].method5419();
		}
	}

	@ObfuscatedName("afc.ej()V")
	public final void method2247() {
		this.field10133 = false;
	}

	@ObfuscatedName("afc.vi(I)V")
	public final void method16054(int arg0) {
		if (this.field10096 == arg0) {
			return;
		}
		BlendMode var2;
		boolean var3;
		boolean var4;
		if (arg0 == 1) {
			var2 = BlendMode.field3364;
			var3 = true;
			var4 = true;
		} else if (arg0 == 2) {
			var2 = BlendMode.field3363;
			var3 = false;
			var4 = true;
		} else if (arg0 == 128) {
			var2 = BlendMode.field3362;
			var3 = true;
			var4 = true;
		} else if (arg0 == 3) {
			var2 = BlendMode.field3361;
			var3 = true;
			var4 = false;
		} else {
			var2 = BlendMode.field3361;
			var3 = false;
			var4 = false;
		}
		if (this.alphaTestEnabled != var3) {
			this.alphaTestEnabled = var3;
			this.enableAlphaTest();
		}
		if (this.alphaBlendEnabled != var4) {
			this.alphaBlendEnabled = var4;
			this.enableAlphaBlend();
		}
		if (this.field10211 != var2) {
			this.field10211 = var2;
			this.enableBlend();
		}
		this.field10096 = arg0;
		this.field10205 &= 0xFFFFFFE3;
	}

	@ObfuscatedName("afc.va(I)V")
	public final void method16055(int arg0) {
		if (this.field10174 != arg0) {
			this.field10174 = arg0;
			this.enableBlend();
		}
	}

	@ObfuscatedName("afc.vs(B)V")
	public final void method16056(byte arg0) {
		if (this.alphaRef == arg0) {
			return;
		}
		this.alphaRef = arg0;
		if (arg0 == 0) {
			this.method16055(0);
			this.method16054(1);
		} else {
			this.method16055(3);
			this.method16054(3);
		}
		this.enableAlphaTest();
	}

	@ObfuscatedName("afc.vp(Z)V")
	public final void method16061(boolean arg0) {
		if (this.field10166 != arg0) {
			this.field10166 = arg0;
			this.enableFog();
			this.field10205 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afc.dn(III)V")
	public final void setFog(int arg0, int arg1, int arg2) {
		if (this.fogDensity == arg0 && this.field10169 == arg1 && this.field10189 == arg2) {
			return;
		}
		this.fogDensity = arg0;
		this.field10169 = arg1;
		this.field10189 = arg2;
		this.method16088();
		this.enableFog();
	}

	@ObfuscatedName("afc.vd()V")
	public final void method16088() {
		if (this.field10067 != null) {
			this.field10067.method5419();
		}
		this.setFogParameters();
	}

	@ObfuscatedName("afc.cs(ILch;II)V")
	public final void method2206(int arg0, SpriteRelated arg1, int arg2, int arg3) {
		this.method2219(false);
		this.field10143.method1454(0.0F, 0.0F, (float) this.getRenderTarget().getWidth(), 0.0F, 0.0F, (float) this.getRenderTarget().getHeight(), 0, arg1, arg2, arg3);
		this.method2219(true);
	}

	@ObfuscatedName("afc.bv(IIIIII)V")
	public final void fillRectangle(int x, int y, int width, int height, int rgb, int arg5) {
		if (this.hasMultiSample && this.field10180 != 0) {
			this.enableAntiAliasing(false);
		}
		if (this.field10107) {
			this.method2219(false);
			this.field10057.drawTintedScaled(x, y, width, height, 0, rgb, arg5);
			this.method2219(true);
		} else {
			this.field10057.drawTintedScaled(x, y, width, height, 0, rgb, arg5);
		}
		if (this.hasMultiSample && this.field10180 != 0) {
			this.enableAntiAliasing(true);
		}
	}

	@ObfuscatedName("afc.bz(IIIIII)V")
	public final void drawRectangle(int x, int y, int width, int height, int rgb, int arg5) {
		int var8 = width - 1;
		int var9 = height - 1;
		byte var7 = 0;
		if (this instanceof GlxToolkit) {
			var7 = -1;
		}
		if (this.hasMultiSample && this.field10180 != 0) {
			this.enableAntiAliasing(false);
		}
		this.drawLine(x, y + var7, x + var8, y + var7, rgb, arg5);
		this.drawLine(x, y + var9 + var7, x + var8, y + var9 + var7, rgb, arg5);
		this.drawLine(x, y, x, y + var9, rgb, arg5);
		this.drawLine(x + var8, y, x + var8, y + var9, rgb, arg5);
		if (this.hasMultiSample && this.field10180 != 0) {
			this.enableAntiAliasing(true);
		}
	}

	@ObfuscatedName("afc.br(IIFIIFIIFIIII)V")
	public final void method2552(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
	}

	@ObfuscatedName("afc.bg(IIIII)V")
	public final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4) {
	}

	@ObfuscatedName("afc.ba(IIIII)V")
	public final void drawHorizontalLine(int x, int y, int width, int rgb, int arg4) {
		this.drawLine(x, y, x + width, y, rgb, arg4);
	}

	@ObfuscatedName("afc.bp(IIIII)V")
	public final void drawVerticalLine(int x1, int y1, int x2, int y2, int arg4) {
		this.drawLine(x1, y1, x1, y1 + x2, y2, arg4);
	}

	@ObfuscatedName("afc.bj(IIIIII)V")
	public final void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5) {
		this.drawLine(x1, y1, x2, y2, rgb, 1, arg5);
	}

	@ObfuscatedName("afc.cl(IIIIIIIII)V")
	public void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		float var10 = (float) arg2 - (float) arg0;
		float var11 = (float) arg3 - (float) arg1;
		float var12;
		if (var10 == 0.0F && var11 == 0.0F) {
			var12 = 1.0F;
		} else {
			float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
			var12 = var10 * var13;
			var11 *= var13;
		}
		this.method15981();
		GpuRendererRelated2 var14 = this.field10147[13];
		var14.method5417();
		var14.method5433(arg4);
		this.method16054(arg5);
		var14.method5421();
		this.enableAntiAliasing(false);
		int var15 = arg8 % (arg6 + arg7);
		float var16 = (float) arg6 * var12;
		float var17 = (float) arg6 * var11;
		float var18 = 0.0F;
		float var19 = 0.0F;
		float var20 = var16;
		float var21 = var17;
		if (var15 > arg6) {
			var18 = (float) (arg6 + arg7 - var15) * var12;
			var19 = (float) (arg6 + arg7 - var15) * var11;
		} else {
			var20 = (float) (arg6 - var15) * var12;
			var21 = (float) (arg6 - var15) * var11;
		}
		float var22 = (float) arg0 + var18;
		float var23 = (float) arg1 + var19;
		float var24 = (float) arg7 * var12;
		float var25 = (float) arg7 * var11;
		while (true) {
			if (arg2 > arg0) {
				if (var22 > (float) arg2) {
					break;
				}
				if (var20 + var22 > (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			} else {
				if (var22 < (float) arg2) {
					break;
				}
				if (var20 + var22 < (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			}
			if (arg3 > arg1) {
				if (var23 > (float) arg3) {
					break;
				}
				if (var21 + var23 > (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			} else {
				if (var23 < (float) arg3) {
					break;
				}
				if (var21 + var23 < (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			}
			if (!this.method15977(var22, var23, 0.0F, var20 + var22, var21 + var23, 0.0F)) {
				return;
			}
			this.method16074();
			var22 += var20 + var24;
			var23 += var21 + var25;
			var20 = var16;
			var21 = var17;
		}
		this.enableAntiAliasing(true);
		var14.method5416();
	}

	@ObfuscatedName("afc.cg(IIIIIILch;IIIII)V")
	public void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("afc.bs(IIIIIILch;II)V")
	public final void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("afc.ce(IIIIIII)V")
	public final void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5, int arg6) {
		int var8 = (int) ((float) x1 + 1.0F);
		int var9 = (int) ((float) y1 + 1.0F);
		int var10 = (int) ((float) x2 + 1.0F);
		int var11 = (int) ((float) y2 + 1.0F);
		float var12 = (float) (var10 - var8);
		float var13 = (float) (var11 - var9);
		float var14 = 1.0F / (float) Math.sqrt((double) (var12 * var12 + var13 * var13));
		float var15 = var12 * var14;
		float var16 = var13 * var14;
		int var17 = (int) ((float) var8 - var15);
		int var18 = (int) ((float) var9 - var16);
		float var19 = -var16;
		float var21 = (float) arg5 * 0.5F * var19;
		float var22 = (float) arg5 * 0.5F * var15;
		this.field10057.method1442((float) var17 - var21, (float) var18 - var22, (float) var10 - var21, (float) var11 - var22, (float) var17 + var21, (float) var18 + var22, 0, rgb, arg6);
	}

	@ObfuscatedName("afc.dt(Ldm;)V")
	public final void drawParticles(ParticleList arg0) {
		this.field10198.method5770(this, arg0);
	}

	@ObfuscatedName("afc.wo()V")
	public final void method16074() {
		this.setStreamSource(0, this.field10196);
		this.setVertexDeclaration(this.field10150);
		this.drawPrimitive(PrimitiveType.LINELIST, 0, 1);
	}

	@ObfuscatedName("afc.wu()V")
	public final void method16075() {
		this.method16076(PrimitiveType.TRIANGLEFAN, 2);
	}

	@ObfuscatedName("afc.wk(Lms;I)V")
	public final void method16076(PrimitiveType arg0, int arg1) {
		this.setStreamSource(0, this.field10197);
		this.setVertexDeclaration(this.field10055);
		this.drawPrimitive(arg0, 0, arg1);
	}

	@ObfuscatedName("afc.wr()V")
	public final void method16080() {
		if (this.field10205 == 2) {
			return;
		}
		this.method15981();
		this.method16061(false);
		this.method16118(false);
		this.method16015(false);
		this.method16361(false);
		this.method16054(1);
		this.method16056((byte) 0);
		this.field10205 = 2;
	}

	@ObfuscatedName("afc.wl()V")
	public final void method16022() {
		if (this.field10205 == 8) {
			return;
		}
		this.method16010();
		this.method16061(true);
		this.method16015(true);
		this.method16361(true);
		this.method16054(1);
		this.method16056((byte) 0);
		this.field10205 = 8;
	}

	// line 1872
	@ObfuscatedName("afc.wv(CCCC)I")
	public static int makeFourCC(char arg0, char arg1, char arg2, char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@ObfuscatedName("mi")
	public static class PrimitiveVertexBuffer {

		// $FF: synthetic field
		public final GpuToolkit this$0;

		@ObfuscatedName("mi.e")
		public VertexBuffer field3412;

		@ObfuscatedName("mi.n")
		public int field3411;

		// line 1879
		public PrimitiveVertexBuffer(GpuToolkit arg0, int arg1) {
			this.this$0 = arg0;
			this.method5836();
			this.method5840(arg1, this.field3411);
		}

		@ObfuscatedName("mi.e()V")
		public void method5836() {
			this.field3412 = this.this$0.createVertexBuffer(true);
			this.this$0.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.COLOR }) });
			this.this$0.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.COLOR }) });
			this.this$0.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.COLOR }) });
			this.field3411 = 16;
		}

		@ObfuscatedName("mi.n()V")
		public void method5838() {
			this.field3412.delete();
		}

		@ObfuscatedName("mi.m(II)V")
		public void method5840(int arg0, int arg1) {
			if (!this.field3412.allocate(arg0, arg1)) {
				System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
			}
		}
	}

	@ObfuscatedName("afc.sr()F")
	public abstract float method15954();

	@ObfuscatedName("afc.sb()V")
	public abstract void method15955();

	@ObfuscatedName("afc.rx()Z")
	public abstract boolean hasVertexShader();

	@ObfuscatedName("afc.ry()Z")
	public abstract boolean hasFragmentShader();

	@ObfuscatedName("afc.rg(Z)Z")
	public abstract boolean method15959(boolean arg0);

	@ObfuscatedName("afc.rc(Ljava/lang/String;)Lho;")
	public abstract GpuShader createShader(String arg0);

	@ObfuscatedName("afc.rn(Lpq;Lpq;Lpq;)V")
	public abstract void method15967(Matrix4x4 arg0, Matrix4x4 arg1, Matrix4x4 arg2);

	@ObfuscatedName("afc.ug(Lck;IIZ[BII)Llz;")
	public abstract GpuTexture method15975(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6);

	@ObfuscatedName("afc.vz()V")
	public abstract void enableFog();

	@ObfuscatedName("afc.g()Ljava/lang/String;")
	public abstract String hardwareInfo();

	@ObfuscatedName("afc.tq()V")
	public abstract void enableLightingAmbient();

	@ObfuscatedName("afc.sa()V")
	public abstract void method15997();

	@ObfuscatedName("afc.sj()V")
	public abstract void enableScissorTest();

	@ObfuscatedName("afc.ti(Lpq;)V")
	public abstract void method16006(Matrix4x4 arg0);

	@ObfuscatedName("afc.tp()V")
	public abstract void enableDepth();

	@ObfuscatedName("afc.tv()V")
	public abstract void enableDepthWrite();

	@ObfuscatedName("afc.tx()V")
	public abstract void enableLightingDiffuse();

	@ObfuscatedName("afc.tl()V")
	public abstract void method16023();

	@ObfuscatedName("afc.td()V")
	public abstract void enableLighting0and1();

	@ObfuscatedName("afc.um()V")
	public abstract void method16025();

	@ObfuscatedName("afc.uq(Lck;Ldg;)Z")
	public abstract boolean method16026(TextureFormat arg0, DataType arg1);

	@ObfuscatedName("afc.uz(Lck;Ldg;II)Llz;")
	public abstract GpuTexture method16030(TextureFormat arg0, DataType arg1, int arg2, int arg3);

	@ObfuscatedName("afc.ur(ILmn;ZZ)V")
	public abstract void method16031(int arg0, TextureCombiner arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("afc.ub(Lck;IIZ[FII)Llz;")
	public abstract GpuTexture method16032(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	@ObfuscatedName("afc.uj(IIZ[III)Llz;")
	public abstract GpuTexture method16033(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

	@ObfuscatedName("afc.ut(IZ[[I)Lmr;")
	public abstract GpuCubeTexture method16034(int arg0, boolean arg1, int[][] arg2);

	@ObfuscatedName("afc.uo(ILmn;Z)V")
	public abstract void method16043(int arg0, TextureCombiner arg1, boolean arg2);

	@ObfuscatedName("afc.vr()V")
	public abstract void enableTextureFactor();

	@ObfuscatedName("afc.vo()V")
	public abstract void method16050();

	@ObfuscatedName("afc.vv()V")
	public abstract void method16051();

	@ObfuscatedName("afc.vt()V")
	public abstract void method16052();

	@ObfuscatedName("afc.vy(I)V")
	public abstract void enableColorWriteTest(int arg0);

	@ObfuscatedName("afc.ve()V")
	public abstract void enableAlphaTest();

	@ObfuscatedName("afc.vm()V")
	public abstract void enableBlend();

	@ObfuscatedName("afc.vf([Llk;)Llo;")
	public abstract VertexDeclaration createVertexDeclaration(VertexDeclarationElement[] arg0);

	@ObfuscatedName("afc.vc(Z)Lml;")
	public abstract GpuIndexBuffer createIndexBuffer(boolean arg0);

	@ObfuscatedName("afc.wz(Lms;II)V")
	public abstract void drawPrimitive(PrimitiveType arg0, int arg1, int arg2);

	@ObfuscatedName("afc.wj(Lml;Lms;IIII)V")
	public abstract void drawIndexedPrimitiveIB(GpuIndexBuffer arg0, PrimitiveType arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("afc.we(Lms;IIII)V")
	public abstract void drawIndexedPrimitive(PrimitiveType arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("afc.wp(I)V")
	public abstract void enableFillMode(int arg0);

	@ObfuscatedName("afc.vn(Z)Llr;")
	public abstract VertexBuffer createVertexBuffer(boolean arg0);

	@ObfuscatedName("afc.uy(Lck;Ldg;II)Lmo;")
	public abstract Texture2 method16089(TextureFormat arg0, DataType arg1, int arg2, int arg3);

	@ObfuscatedName("afc.ud()V")
	public abstract void method16091();

	@ObfuscatedName("afc.wa(Lml;)V")
	public abstract void setIndices(GpuIndexBuffer arg0);

	@ObfuscatedName("afc.wn(ILlr;)V")
	public abstract void setStreamSource(int arg0, VertexBuffer arg1);

	@ObfuscatedName("afc.vh()V")
	public abstract void setFogParameters();

	@ObfuscatedName("afc.vg()V")
	public abstract void enableAlphaBlend();

	@ObfuscatedName("afc.vk(Llo;)V")
	public abstract void setVertexDeclaration(VertexDeclaration arg0);

	@ObfuscatedName("afc.uk(Lck;IIIZ[B)Lll;")
	public abstract GpuVolumeTexture method16197(TextureFormat arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

	@ObfuscatedName("afc.tg()V")
	public abstract void enableLighting();

	@ObfuscatedName("afc.vw()V")
	public abstract void method16256();

	@ObfuscatedName("afc.uc(Lck;Ldg;)Z")
	public abstract boolean method16289(TextureFormat arg0, DataType arg1);

	@ObfuscatedName("afc.vj(Z)V")
	public abstract void enableAntiAliasing(boolean arg0);

	@ObfuscatedName("afc.tk()V")
	public abstract void enableLightingView();
}
