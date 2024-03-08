package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import sun.misc.Unsafe;

import java.awt.*;
import java.lang.reflect.Field;

@ObfuscatedName("afa")
public class LegacyOpenGLRenderer extends Renderer {

	@ObfuscatedName("afa.cl")
	public OpenGL field10022;

	@ObfuscatedName("afa.cg")
	public int field9967;

	@ObfuscatedName("afa.ce")
	public final class94 field10026;

	@ObfuscatedName("afa.cu")
	public class76 field10023;

	@ObfuscatedName("afa.ci")
	public PostProcessing field9986;

	@ObfuscatedName("afa.cn")
	public ColourGradingBloomFilter field9864;

	@ObfuscatedName("afa.cv")
	public LevelsFilter field9865;

	@ObfuscatedName("afa.cp")
	public ColourRemappingFilter field9853;

	@ObfuscatedName("afa.ca")
	public class89 field9978 = new class89();

	@ObfuscatedName("afa.cx")
	public Matrix4x4 field9866 = new Matrix4x4();

	@ObfuscatedName("afa.cw")
	public Matrix4x4 field9842 = new Matrix4x4();

	@ObfuscatedName("afa.ct")
	public Matrix4x3 field9900 = new Matrix4x3();

	@ObfuscatedName("afa.cf")
	public class93 field9871;

	@ObfuscatedName("afa.co")
	public int field9872;

	@ObfuscatedName("afa.cr")
	public int field9873 = 8;

	@ObfuscatedName("afa.cm")
	public int field9874 = 3;

	@ObfuscatedName("afa.cq")
	public boolean field9875 = false;

	@ObfuscatedName("afa.ch")
	public NativeHeap field9876;

	@ObfuscatedName("afa.cb")
	public IterableQueue field9964 = new IterableQueue();

	@ObfuscatedName("afa.cs")
	public Unsafe field9878 = null;

	@ObfuscatedName("afa.cy")
	public int field9879;

	@ObfuscatedName("afa.cc")
	public int field9880;

	@ObfuscatedName("afa.cz")
	public int field9881;

	@ObfuscatedName("afa.ck")
	public IterableQueue field9938 = new IterableQueue();

	@ObfuscatedName("afa.cj")
	public IterableQueue field9883 = new IterableQueue();

	@ObfuscatedName("afa.cd")
	public IterableQueue field9884 = new IterableQueue();

	@ObfuscatedName("afa.dd")
	public IterableQueue field9885 = new IterableQueue();

	@ObfuscatedName("afa.dr")
	public IterableQueue field9886 = new IterableQueue();

	@ObfuscatedName("afa.da")
	public IterableQueue field9838 = new IterableQueue();

	@ObfuscatedName("afa.dt")
	public IterableQueue field9888 = new IterableQueue();

	@ObfuscatedName("afa.do")
	public long field9823;

	@ObfuscatedName("afa.dz")
	public static int[] field9890 = new int[1000];

	@ObfuscatedName("afa.dv")
	public int field9908;

	@ObfuscatedName("afa.dm")
	public int field9923;

	@ObfuscatedName("afa.dq")
	public int field9893;

	@ObfuscatedName("afa.dc")
	public boolean field9848;

	@ObfuscatedName("afa.di")
	public boolean field9921;

	@ObfuscatedName("afa.dk")
	public int field9896;

	@ObfuscatedName("afa.dn")
	public boolean field9924;

	@ObfuscatedName("afa.df")
	public byte field9943;

	@ObfuscatedName("afa.dw")
	public boolean field9899;

	@ObfuscatedName("afa.ds")
	public boolean field9815;

	@ObfuscatedName("afa.du")
	public int field9940 = 2;

	@ObfuscatedName("afa.dl")
	public Matrix4x3 field9911 = new Matrix4x3();

	@ObfuscatedName("afa.dp")
	public Matrix4x4 field9903 = new Matrix4x4();

	@ObfuscatedName("afa.dy")
	public Matrix4x4 field9904 = new Matrix4x4();

	@ObfuscatedName("afa.db")
	public Matrix4x4 field9939 = new Matrix4x4();

	@ObfuscatedName("afa.dh")
	public Matrix4x4 field9906 = new Matrix4x4();

	@ObfuscatedName("afa.dx")
	public Matrix4x4 field10005 = new Matrix4x4();

	@ObfuscatedName("afa.dg")
	public float[][] field10015 = new float[6][4];

	@ObfuscatedName("afa.de")
	public float[] field9857 = new float[4];

	@ObfuscatedName("afa.dj")
	public float field9910;

	@ObfuscatedName("afa.eo")
	public float field9867;

	@ObfuscatedName("afa.ey")
	public float field9912;

	@ObfuscatedName("afa.eu")
	public float field9882;

	@ObfuscatedName("afa.ed")
	public float field9914 = 0.0F;

	@ObfuscatedName("afa.ee")
	public float field9831 = 1.0F;

	@ObfuscatedName("afa.es")
	public float field9916 = 0.0F;

	@ObfuscatedName("afa.ei")
	public float field9917 = -1.0F;

	@ObfuscatedName("afa.el")
	public Matrix4x3 field9976 = new Matrix4x3();

	@ObfuscatedName("afa.ej")
	public Matrix4x4 field9919 = new Matrix4x4();

	@ObfuscatedName("afa.ep")
	public Matrix4x4 field9920 = new Matrix4x4();

	@ObfuscatedName("afa.ev")
	public float[] field9844 = new float[16];

	@ObfuscatedName("afa.ec")
	public int field9922;

	@ObfuscatedName("afa.ek")
	public boolean field9980 = true;

	@ObfuscatedName("afa.em")
	public boolean field9950 = true;

	@ObfuscatedName("afa.eh")
	public int field9925 = 0;

	@ObfuscatedName("afa.eq")
	public int field9926 = 0;

	@ObfuscatedName("afa.eg")
	public int field9927 = 0;

	@ObfuscatedName("afa.ez")
	public int field9928 = 0;

	@ObfuscatedName("afa.ef")
	public int field9869 = 0;

	@ObfuscatedName("afa.et")
	public int field9930 = 0;

	@ObfuscatedName("afa.ea")
	public int field9897;

	@ObfuscatedName("afa.ew")
	public int field9932;

	@ObfuscatedName("afa.er")
	public int field9931;

	@ObfuscatedName("afa.en")
	public int field9934;

	@ObfuscatedName("afa.eb")
	public static int field9935 = 4;

	@ObfuscatedName("afa.ex")
	public boolean field9936;

	@ObfuscatedName("afa.fg")
	public boolean field9937;

	@ObfuscatedName("afa.fm")
	public float[] field9951 = new float[4];

	@ObfuscatedName("afa.fu")
	public float[] field9895 = new float[4];

	@ObfuscatedName("afa.fs")
	public float[] field9870 = new float[4];

	@ObfuscatedName("afa.fz")
	public float[] field9941 = new float[4];

	@ObfuscatedName("afa.fj")
	public int field9942 = -1;

	@ObfuscatedName("afa.fd")
	public float field9863 = 1.0F;

	@ObfuscatedName("afa.fn")
	public float field9944 = 1.0F;

	@ObfuscatedName("afa.fi")
	public float field9945 = 1.0F;

	@ObfuscatedName("afa.ft")
	public float field9946;

	@ObfuscatedName("afa.fx")
	public float field9947 = -1.0F;

	@ObfuscatedName("afa.fv")
	public float field9948 = -1.0F;

	@ObfuscatedName("afa.fc")
	public Light[] field9949 = new Light[field9935];

	@ObfuscatedName("afa.fw")
	public int field9909;

	@ObfuscatedName("afa.fa")
	public int field9898;

	@ObfuscatedName("afa.fp")
	public int field9915;

	@ObfuscatedName("afa.fq")
	public int field9953;

	@ObfuscatedName("afa.ff")
	public boolean field9954;

	@ObfuscatedName("afa.fl")
	public int field9955 = -1;

	@ObfuscatedName("afa.fb")
	public int field9956 = -1;

	@ObfuscatedName("afa.fo")
	public int field9957 = 0;

	@ObfuscatedName("afa.fy")
	public float field9830;

	@ObfuscatedName("afa.fe")
	public float field9829;

	@ObfuscatedName("afa.fk")
	public float field9960 = 1.0F;

	@ObfuscatedName("afa.fh")
	public float field9961 = 0.0F;

	@ObfuscatedName("afa.fr")
	public boolean field9840;

	@ObfuscatedName("afa.gu")
	public boolean field9963 = false;

	@ObfuscatedName("afa.gq")
	public int field10028;

	@ObfuscatedName("afa.gl")
	public class131 field9892;

	@ObfuscatedName("afa.go")
	public class98 field9966;

	@ObfuscatedName("afa.gk")
	public class79 field9852;

	@ObfuscatedName("afa.gp")
	public int field9968;

	@ObfuscatedName("afa.gy")
	public int field9969 = 8448;

	@ObfuscatedName("afa.ga")
	public int field9970 = 8448;

	@ObfuscatedName("afa.gn")
	public boolean field9958;

	@ObfuscatedName("afa.gc")
	public int field10018;

	@ObfuscatedName("afa.gf")
	public class70[] field9973;

	@ObfuscatedName("afa.gx")
	public class812 field9974;

	@ObfuscatedName("afa.ge")
	public class845 field9887;

	@ObfuscatedName("afa.gg")
	public String field9996;

	@ObfuscatedName("afa.gr")
	public String field9977;

	@ObfuscatedName("afa.gs")
	public boolean field10027;

	@ObfuscatedName("afa.gt")
	public int field9979;

	@ObfuscatedName("afa.gh")
	public boolean field10017;

	@ObfuscatedName("afa.gm")
	public boolean field9981;

	@ObfuscatedName("afa.gv")
	public int field9982;

	@ObfuscatedName("afa.gj")
	public int field9929;

	@ObfuscatedName("afa.gw")
	public int field9984;

	@ObfuscatedName("afa.gd")
	public boolean field9985;

	@ObfuscatedName("afa.gz")
	public boolean field9901;

	@ObfuscatedName("afa.gb")
	public boolean field9987;

	@ObfuscatedName("afa.gi")
	public boolean field9988;

	@ObfuscatedName("afa.hm")
	public boolean field9989;

	@ObfuscatedName("afa.ha")
	public boolean field9990;

	@ObfuscatedName("afa.hk")
	public boolean field9991;

	@ObfuscatedName("afa.hu")
	public boolean field9992;

	@ObfuscatedName("afa.hb")
	public boolean field9889;

	@ObfuscatedName("afa.hl")
	public boolean field9952;

	@ObfuscatedName("afa.hg")
	public boolean field9995;

	@ObfuscatedName("afa.hd")
	public boolean field9965;

	@ObfuscatedName("afa.hx")
	public boolean field9997;

	@ObfuscatedName("afa.hq")
	public boolean field9998;

	@ObfuscatedName("afa.hf")
	public boolean field9999;

	@ObfuscatedName("afa.hr")
	public boolean field10000;

	@ObfuscatedName("afa.hs")
	public boolean field10001;

	@ObfuscatedName("afa.hh")
	public boolean field10002;

	@ObfuscatedName("afa.hp")
	public boolean field10003;

	@ObfuscatedName("afa.hy")
	public boolean field10004;

	@ObfuscatedName("afa.he")
	public final int field9862;

	@ObfuscatedName("afa.hn")
	public float field9983 = -1.0F;

	@ObfuscatedName("afa.hi")
	public float field10007 = -1.0F;

	@ObfuscatedName("afa.hw")
	public LegacyOpenGLModel[] field10008 = new LegacyOpenGLModel[8];

	@ObfuscatedName("afa.ht")
	public LegacyOpenGLModel[] field10009 = new LegacyOpenGLModel[8];

	@ObfuscatedName("afa.hc")
	public LegacyOpenGLFramebuffer field9877;

	@ObfuscatedName("afa.ho")
	public class83 field9918;

	@ObfuscatedName("afa.hj")
	public class83 field10012;

	@ObfuscatedName("afa.hv")
	public class79 field10013;

	@ObfuscatedName("afa.hz")
	public static final float[] field10014 = new float[4];

	@ObfuscatedName("afa.ij")
	public static final float[] field9894 = new float[4];

	@ObfuscatedName("afa.io")
	public GpuPacket field10016 = new GpuPacket(8192);

	@ObfuscatedName("afa.iq")
	public int[] field9993 = new int[1];

	@ObfuscatedName("afa.ig")
	public int[] field9913 = new int[1];

	@ObfuscatedName("afa.iv")
	public int[] field10019 = new int[1];

	@ObfuscatedName("afa.ie")
	public final byte[] field10020 = new byte[16384];

	@ObfuscatedName("afa.in")
	public Sprite field9854 = null;

	@ObfuscatedName("afa.ir")
	public Sprite field9975 = null;

	@ObfuscatedName("afa.it")
	public Framebuffer field10024 = null;

	@ObfuscatedName("afa.ix")
	public int[] field10025 = new int[3];

	@ObfuscatedName("afa.is")
	public long[] field9959 = new long[3];

	@ObfuscatedName("afa.ib")
	public int[] field9902 = new int[3];

	@ObfuscatedName("afa.il")
	public int field9891 = 0;

	@ObfuscatedName("afa.iw")
	public int field10029 = 0;

	public LegacyOpenGLRenderer(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6) {
		super(arg1, arg2, arg3, arg4, arg5);
		try {
			try {
				Field var8 = Unsafe.class.getDeclaredField("theUnsafe");
				var8.setAccessible(true);
				this.field9878 = (Unsafe) var8.get(null);
			} catch (Exception var34) {
			}
			this.field9967 = arg6;
			Statics.method5134().method7902("jaclib");
			Statics.method5134().method7902("jaggl");
			this.field10022 = new OpenGL();
			long var10 = this.field10022.init(arg0, 8, 8, 8, 24, 0, this.field9967);
			if (var10 == 0L) {
				throw new RuntimeException("");
			}
			this.method15727();
			int var12 = this.method15861();
			if (var12 != 0) {
				throw new RuntimeException("");
			}
			if (this.field9981 && this.field9985) {
				String var13 = System.getProperty("java.version");
				int var14 = var13.indexOf(95);
				if (var14 > -1) {
					var13 = var13.substring(0, var14);
				}
				int var15 = var13.indexOf(46);
				if (var15 > -1) {
					int var16 = var13.indexOf(46, var15 + 1);
					if (var16 > -1) {
						var13 = var13.substring(0, var16);
					}
				}
				try {
					int var17 = (int) (Float.parseFloat(var13) * 100.0F);
					if (var17 >= 170) {
						this.field9985 = false;
						this.field9988 = false;
						this.field9989 = false;
					}
				} catch (NumberFormatException var33) {
					this.field9985 = false;
					this.field9988 = false;
					this.field9989 = false;
				}
			}
			this.field9862 = this.field10017 ? 33639 : 5121;
			this.field10027 = this.field9977.indexOf("radeon") != -1;
			boolean var19 = this.field9996.indexOf("intel") != -1;
			boolean var20 = false;
			boolean var21 = false;
			int var22 = 0;
			if (this.field10027 || var19) {
				String[] var23 = class695.method17361(this.field9977.replace('/', ' '), ' ');
				for (int var24 = 0; var24 < var23.length; var24++) {
					String var25 = var23[var24];
					try {
						if (var25.length() > 0) {
							if (var25.charAt(0) == 'x' && var25.length() >= 3 && class695.method9836(var25.substring(1, 3))) {
								var25 = var25.substring(1);
								var21 = true;
							}
							if (var25.equals("hd")) {
								var20 = true;
							} else {
								if (var25.startsWith("hd")) {
									var25 = var25.substring(2);
									var20 = true;
								}
								if (var25.length() >= 4 && class695.method9836(var25.substring(0, 4))) {
									var22 = class695.method9595(var25.substring(0, 4));
									break;
								}
							}
						}
					} catch (Exception var35) {
					}
				}
			}
			if (this.field9967 != 0 && var19 && !var20) {
				throw new class1208("");
			}
			if (this.field10027 || var19) {
				if (!var19) {
					if (!var21 && !var20) {
						if (var22 >= 7000 && var22 <= 7999) {
							this.field9990 = false;
						}
						if (var22 >= 7000 && var22 <= 9250) {
							this.field9889 = false;
						}
					}
					if (!var20 || var22 < 4000) {
						this.field9997 = false;
					}
					this.field9965 &= this.field10022.method0("GL_ARB_half_float_pixel");
					this.field9991 = this.field9990;
				} else if (!var20) {
					this.field9985 = false;
					this.field9988 = false;
					this.field9989 = false;
				}
			}
			this.field10003 = !this.field9996.equals("s3 graphics");
			if (this.field9990) {
				try {
					int[] var27 = new int[1];
					OpenGL.glGenBuffersARB(1, var27, 0);
				} catch (Throwable var32) {
					throw new RuntimeException("");
				}
			}
			class662.method10156(false, true);
			this.field9875 = true;
			this.field10026 = new class94(this, this.field1596);
			this.method15728();
			this.field9871 = new class93(this);
			this.field9986 = new PostProcessing(this);
			if (this.field9986.method1363()) {
				this.field9864 = new ColourGradingBloomFilter(this);
				if (!this.field9864.method19235()) {
					this.field9864.method17570();
					this.field9864 = null;
				}
				this.field9865 = new LevelsFilter(this);
				if (!this.field9865.method19231()) {
					this.field9865.method17570();
					this.field9865 = null;
				}
				this.field9853 = new ColourRemappingFilter(this);
				if (!this.field9853.method19234()) {
					this.field9853.method17570();
					this.field9853 = null;
				}
			} else {
				this.field9986.method1375();
				this.field9986 = null;
			}
			this.method2138(arg0, new LegacyOpenGLSurface(this, arg0, var10));
			this.method2140(arg0);
			if (this.field9981) {
				int var29 = arg0.getLocation().x;
				int var30 = arg0.getLocation().y;
				arg0.setLocation(var29 + 1, var30);
				arg0.setLocation(var29, var30);
			}
			this.field10023 = new class76(this);
			this.method15814();
			this.method2150();
			if (this.field9986 != null) {
				this.method15762();
				this.method15803();
			}
		} catch (Throwable var36) {
			var36.printStackTrace();
			this.method2578();
			if (var36 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var36;
			} else if (var36 instanceof class1208) {
				throw (class1208) var36;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	@ObfuscatedName("afa.rv()V")
	public void method15727() {
		int var1 = 0;
		while (!this.field10022.method1()) {
			if (var1++ > 5) {
				throw new RuntimeException("");
			}
			class214.method1571(1000L);
		}
	}

	@ObfuscatedName("afa.rh()I")
	public int method15861() {
		int var1 = 0;
		this.field9996 = OpenGL.glGetString(7936).toLowerCase();
		this.field9977 = OpenGL.glGetString(7937).toLowerCase();
		if (this.field9996.indexOf("microsoft") != -1) {
			var1 |= 0x1;
		}
		if (this.field9996.indexOf("brian paul") != -1 || this.field9996.indexOf("mesa") != -1) {
			var1 |= 0x1;
		}
		String var2 = OpenGL.glGetString(7938);
		String[] var3 = class695.method17361(var2.replace('.', ' '), ' ');
		if (var3.length >= 2) {
			try {
				int var4 = class695.method9595(var3[0]);
				int var5 = class695.method9595(var3[1]);
				this.field9979 = var4 * 10 + var5;
			} catch (NumberFormatException var8) {
				var1 |= 0x4;
			}
		} else {
			var1 |= 0x4;
		}
		if (this.field9979 < 12) {
			var1 |= 0x2;
		}
		if (!this.field10022.method0("GL_ARB_multitexture")) {
			var1 |= 0x8;
		}
		if (!this.field10022.method0("GL_ARB_texture_env_combine")) {
			var1 |= 0x20;
		}
		int[] var7 = new int[1];
		OpenGL.glGetIntegerv(34018, var7, 0);
		this.field9982 = var7[0];
		OpenGL.glGetIntegerv(34929, var7, 0);
		this.field9929 = var7[0];
		OpenGL.glGetIntegerv(34930, var7, 0);
		this.field9984 = var7[0];
		if (this.field9982 < 2 || this.field9929 < 2 || this.field9984 < 2) {
			var1 |= 0x10;
		}
		this.field10017 = Stream.method61();
		this.field9990 = this.field10022.method0("GL_ARB_vertex_buffer_object");
		this.field9988 = this.field10022.method0("GL_ARB_multisample");
		this.field9999 = this.field10022.method0("GL_ARB_vertex_program");
		this.field10001 = this.field10022.method0("GL_ARB_fragment_program");
		this.field10000 = this.field10022.method0("GL_ARB_vertex_shader");
		this.field10002 = this.field10022.method0("GL_ARB_fragment_shader");
		this.field9889 = this.field10022.method0("GL_EXT_texture3D");
		this.field9965 = this.field10022.method0("GL_ARB_texture_rectangle");
		this.field9952 = this.field10022.method0("GL_ARB_texture_cube_map");
		this.field9995 = this.field10022.method0("GL_ARB_seamless_cube_map");
		this.field9997 = this.field10022.method0("GL_ARB_texture_float");
		this.field9998 = this.field10022.method0("GL_ARB_texture_non_power_of_two");
		this.field9985 = this.field10022.method0("GL_EXT_framebuffer_object");
		this.field9901 = this.field10022.method0("GL_EXT_framebuffer_blit");
		this.field9987 = this.field10022.method0("GL_EXT_framebuffer_multisample");
		this.field9989 = this.field9901 & this.field9987;
		this.field10004 = this.field10022.method0("GL_EXT_blend_func_separate");
		this.field9992 = this.field9878 != null && (this.field9979 >= 32 || this.field10022.method0("GL_ARB_sync"));
		this.field9981 = NativeLibraryConfig.field5074.startsWith("mac");
		OpenGL.glGetFloatv(2834, field10014, 0);
		this.field10007 = field10014[0];
		this.field9983 = field10014[1];
		return var1 == 0 ? 0 : var1;
	}

	@ObfuscatedName("afa.ra()V")
	public void method15728() {
		this.field9973 = new class70[this.field9982];
		this.field9974 = new class812(this, 3553, TextureFormat.field1273, DataType.field1645, 1, 1);
		new class812(this, 3553, TextureFormat.field1273, DataType.field1645, 1, 1);
		new class812(this, 3553, TextureFormat.field1273, DataType.field1645, 1, 1);
		for (int var1 = 0; var1 < 8; var1++) {
			this.field10008[var1] = new LegacyOpenGLModel(this);
			this.field10009[var1] = new LegacyOpenGLModel(this);
		}
		if (this.field9985) {
			this.field9877 = new LegacyOpenGLFramebuffer(this);
			new LegacyOpenGLFramebuffer(this);
		}
	}

	@ObfuscatedName("afa.rx()V")
	public void method15814() {
		this.method15774(-2);
		for (int var1 = this.field9982 - 1; var1 >= 0; var1--) {
			this.method15776(var1);
			this.method15777(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method15810(8448, 8448);
		this.method15780(2, 34168, 770);
		this.method15785();
		this.field9923 = 1;
		this.field9896 = 0;
		this.field9921 = true;
		if (this.field10004) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.field9893 = 1;
		this.field9943 = -1;
		this.method15794((byte) 0);
		this.field9924 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.field9943);
		if (this.field9988) {
			if (this.field9967 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.field9848 = true;
		this.method15738(true);
		this.method15764(true);
		this.method15788(true);
		this.method15789(true);
		this.method2339(0.0F, 1.0F);
		this.method15748();
		this.field10022.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method15798(this.field9940);
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
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.field9995) {
			OpenGL.glEnable(34895);
		}
		this.field9955 = -1;
		this.field9942 = -1;
		this.method2263();
		this.method2167();
	}

	@ObfuscatedName("afa.f()Lcz;")
	public class108 method2272() {
		int var1 = -1;
		if (this.field9996.indexOf("nvidia") != -1) {
			var1 = 4318;
		} else if (this.field9996.indexOf("intel") != -1) {
			var1 = 32902;
		} else if (this.field9996.indexOf("ati") != -1) {
			var1 = 4098;
		}
		return new class108(var1, "OpenGL", this.field9979, this.field9977, 0L, false);
	}

	@ObfuscatedName("afa.l(II)V")
	public void method2116(int arg0, int arg1) throws class1106 {
		try {
			this.field1612.method15451();
		} catch (Exception var4) {
		}
		if (this.field1596 != null) {
			this.field1596.method1982();
		}
	}

	@ObfuscatedName("afa.u()V")
	public void method2117() {
		OpenGL.glFinish();
	}

	@ObfuscatedName("afa.p()V")
	public void method2369() {
		for (Node var1 = this.field9964.method14191(); var1 != null; var1 = this.field9964.method14161()) {
			((class1148) var1).method19237();
		}
		if (this.field9986 != null) {
			this.field9986.method1375();
		}
		if (this.field9875) {
			class662.method14805(false, true);
			this.field9875 = false;
		}
	}

	@ObfuscatedName("afa.r()Z")
	public boolean method2194() {
		return true;
	}

	@ObfuscatedName("afa.v()Z")
	public boolean method2123() {
		return true;
	}

	@ObfuscatedName("afa.o()Z")
	public boolean method2124() {
		return true;
	}

	@ObfuscatedName("afa.y()Z")
	public boolean method2266() {
		return this.field9864 != null && (this.field9967 <= 1 || this.field9989);
	}

	@ObfuscatedName("afa.q()Z")
	public boolean method2127() {
		return true;
	}

	@ObfuscatedName("afa.s()Z")
	public boolean method2125() {
		return true;
	}

	@ObfuscatedName("afa.x()Z")
	public boolean method2141() {
		return this.field9988 && (!this.method2242() || this.field9989);
	}

	@ObfuscatedName("afa.b()Z")
	public boolean method2129() {
		return true;
	}

	@ObfuscatedName("afa.ry()Z")
	public boolean method15730() {
		return this.field10023.method1277(3);
	}

	@ObfuscatedName("afa.h()Z")
	public boolean method2130() {
		return true;
	}

	@ObfuscatedName("afa.a()Z")
	public boolean method2240() {
		return false;
	}

	@ObfuscatedName("afa.g()Ljava/lang/String;")
	public String method2132() {
		String var1 = "Caps: 2:";
		String var2 = ":";
		String var3 = var1 + this.field9967 + var2;
		String var4 = var3 + this.field9862 + var2;
		String var5 = var4 + this.field9982 + var2;
		String var6 = var5 + this.field9929 + var2;
		String var7 = var6 + this.field9984 + var2;
		String var8 = var7 + this.field10007 + var2;
		String var9 = var8 + this.field9983 + var2;
		String var10 = var9 + (this.field10017 ? 1 : 0) + var2;
		String var11 = var10 + (this.field10027 ? 1 : 0) + var2;
		String var12 = var11 + (this.field9981 ? 1 : 0) + var2;
		String var13 = var12 + (this.field9990 ? 1 : 0) + var2;
		String var14 = var13 + (this.field9991 ? 1 : 0) + var2;
		String var15 = var14 + (this.field9988 ? 1 : 0) + var2;
		String var16 = var15 + (this.field9999 ? 1 : 0) + var2;
		String var17 = var16 + (this.field10001 ? 1 : 0) + var2;
		String var18 = var17 + (this.field10000 ? 1 : 0) + var2;
		String var19 = var18 + (this.field10002 ? 1 : 0) + var2;
		String var20 = var19 + (this.field9889 ? 1 : 0) + var2;
		String var21 = var20 + (this.field9965 ? 1 : 0) + var2;
		String var22 = var21 + (this.field9952 ? 1 : 0) + var2;
		String var23 = var22 + (this.field9995 ? 1 : 0) + var2;
		String var24 = var23 + (this.field9998 ? 1 : 0) + var2;
		String var25 = var24 + (this.field9985 ? 1 : 0) + var2;
		String var26 = var25 + (this.field9901 ? 1 : 0) + var2;
		String var27 = var26 + (this.field9987 ? 1 : 0) + var2;
		String var28 = var27 + (this.field9997 ? 1 : 0) + var2;
		String var29 = var28 + (this.field10003 ? 1 : 0) + var2;
		return var29 + (this.field10004 ? 1 : 0);
	}

	@ObfuscatedName("afa.i()[I")
	public int[] method2413() {
		int[] var1 = new int[1];
		OpenGL.glGetIntegerv(34466, var1, 0);
		int var2 = var1[0];
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			OpenGL.glGetIntegerv(34467, var3, 0);
			return var3;
		}
	}

	@ObfuscatedName("afa.ad(Ljava/awt/Canvas;II)Lafy;")
	public Surface method2144(Canvas arg0, int arg1, int arg2) {
		return new LegacyOpenGLSurface(this, arg0);
	}

	@ObfuscatedName("afa.rg()V")
	public void method15883() {
		this.method15757();
	}

	@ObfuscatedName("afa.rz()V")
	public void method15757() {
		int var1 = this.field1614.method1627();
		int var2 = this.field1614.method1628();
		this.field9906.method6617(0.0F, (float) var1, 0.0F, (float) var2, -1.0F, 1.0F);
		this.method2263();
		this.method15748();
		this.method2167();
	}

	@ObfuscatedName("afa.aq(IIII)[I")
	public int[] method2149(int arg0, int arg1, int arg2, int arg3) {
		if (this.field1614 == null) {
			return null;
		}
		int[] var5 = new int[arg2 * arg3];
		int var6 = this.field1614.method1628();
		for (int var7 = 0; var7 < arg3; var7++) {
			OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field9862, var5, arg2 * var7);
		}
		return var5;
	}

	@ObfuscatedName("afa.ax()V")
	public void method2150() {
		if (!this.field10003 || this.field1614 == null) {
			return;
		}
		int var1 = this.field9927;
		int var2 = this.field9928;
		int var3 = this.field9925;
		int var4 = this.field9926;
		this.method2167();
		int var5 = this.field9897;
		int var6 = this.field9932;
		int var7 = this.field9931;
		int var8 = this.field9934;
		this.method2263();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method15748();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15777(null);
		this.method15774(-2);
		this.method15778(1);
		this.method15791(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.field1614.method1627(), this.field1614.method1628(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method2168(var1, var3, var2, var4);
		this.method2164(var5, var6, var7, var8);
	}

	@ObfuscatedName("afa.av()Z")
	public boolean method2360() {
		return this.field9992;
	}

	@ObfuscatedName("afa.ao()Z")
	public boolean method2196() {
		return !this.field9992 || this.field9959[this.field10029] == 0L;
	}

	@ObfuscatedName("afa.aj()Z")
	public boolean method2153() {
		return true;
	}

	@ObfuscatedName("afa.ay()Z")
	public boolean method2304() {
		return true;
	}

	@ObfuscatedName("afa.ab()I")
	public int method2502() {
		if (!this.field9992) {
			return -1;
		} else if (this.field9959[this.field9891] == 0L) {
			return -1;
		} else {
			int var1 = OpenGL.glClientWaitSync(this.field9959[this.field9891], 0, 0);
			if (var1 == 37149) {
				this.method2156();
				return -1;
			} else if (var1 == 37147) {
				return -1;
			} else {
				return this.field9902[this.field9891];
			}
		}
	}

	@ObfuscatedName("afa.aa(III)V")
	public void method2163(int arg0, int arg1, int arg2) {
		this.method2203();
		if (this.field10024 == null) {
			this.method15735(arg1, arg2);
		}
		if (this.field9854 == null) {
			this.field9854 = this.method2314(0, 0, this.field1614.method1627(), this.field1614.method1628(), true);
		} else {
			((class830) this.field9854).method15372(0, 0, this.field1614.method1627(), this.field1614.method1628(), 0, 0, true);
		}
		this.method2142(this.field10024);
		this.method2475(1, -16777216);
		this.field9854.method1474(this.field1611, this.field1618, this.field1619, this.field1610);
		OpenGL.glBindBufferARB(35051, this.field10025[this.field10029]);
		OpenGL.glReadPixelsub(0, 0, this.field1615, this.field1588, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method2143(this.field10024);
		this.field9959[this.field10029] = OpenGL.glFenceSync(37143, 0);
		this.field9902[this.field10029] = arg0;
		if (++this.field10029 >= 3) {
			this.field10029 = 0;
		}
		this.method2204();
	}

	@ObfuscatedName("afa.az()V")
	public void method2156() {
		for (int var1 = 0; var1 < 3; var1++) {
			if (this.field9959[var1] != 0L) {
				OpenGL.glDeleteSync(this.field9959[var1]);
				this.field9959[var1] = 0L;
			}
		}
		this.field10029 = 0;
		this.field9891 = 0;
	}

	@ObfuscatedName("afa.af(II)J")
	public long method2158(int arg0, int arg1) {
		return this.method15733(arg0, arg1, null, null);
	}

	@ObfuscatedName("afa.an(II[I[I)V")
	public void method2160(int arg0, int arg1, int[] arg2, int[] arg3) {
		this.method15733(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("afa.re(II[I[I)J")
	public long method15733(int arg0, int arg1, int[] arg2, int[] arg3) {
		if (!this.field9992) {
			if (this.field9975 == null) {
				this.method15735(arg0, arg1);
			}
			if (this.field9854 == null) {
				this.field9854 = this.method2314(0, 0, this.field1614.method1627(), this.field1614.method1628(), true);
			} else {
				((class830) this.field9854).method15372(0, 0, this.field1614.method1627(), this.field1614.method1628(), 0, 0, true);
			}
			this.method2142(this.field10024);
			this.method2475(1, -16777216);
			this.field9854.method1474(this.field1611, this.field1618, this.field1619, this.field1610);
			this.field9975.method1476(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method2143(this.field10024);
			return 0L;
		}
		if (this.field9959[this.field9891] != 0L) {
			OpenGL.glDeleteSync(this.field9959[this.field9891]);
			this.field9959[this.field9891] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.field10025[this.field9891]);
		long var5 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			int var7 = 0;
			for (int var8 = arg1 - 1; var8 >= 0; var8--) {
				for (int var9 = 0; var9 < arg0; var9++) {
					arg2[var7++] = this.field9878.getInt((long) ((arg0 * var8 + var9) * 4) + var5);
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			var5 = 0L;
		}
		if (++this.field9891 >= 3) {
			this.field9891 = 0;
		}
		return var5;
	}

	@ObfuscatedName("afa.ak(J)V")
	public void method2159(long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@ObfuscatedName("afa.bl()V")
	public void method2126() {
		if (!this.field9992) {
			this.field10024 = null;
			this.field9975 = null;
			this.field9854 = null;
			return;
		}
		this.field9854 = null;
		if (this.field10024 != null) {
			this.field10024.method1629();
			this.field10024 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.field10025, 0);
		for (int var1 = 0; var1 < 3; var1++) {
			this.field10025[var1] = 0;
			if (this.field9959[var1] != 0L) {
				OpenGL.glDeleteSync(this.field9959[var1]);
				this.field9959[var1] = 0L;
			}
		}
	}

	@ObfuscatedName("afa.rt(II)V")
	public void method15735(int arg0, int arg1) {
		this.method2126();
		this.method2419(arg0, arg1);
		if (!this.field9992) {
			this.field9975 = this.method2197(arg0, arg1, true, true);
			this.field10024 = this.method2145();
			this.field10024.method15439(0, this.field9975.method1437());
			return;
		}
		this.field9975 = this.method2197(arg0, arg1, true, true);
		this.field10024 = this.method2145();
		this.field10024.method15439(0, this.field9975.method1437());
		OpenGL.glGenBuffersARB(3, this.field10025, 0);
		for (int var3 = 0; var3 < 3; var3++) {
			OpenGL.glBindBufferARB(35051, this.field10025[var3]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@ObfuscatedName("afa.bm(II)V")
	public void method2475(int arg0, int arg1) {
		int var3 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			var3 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method15789(true);
			var3 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			var3 |= 0x400;
		}
		OpenGL.glClear(var3);
	}

	@ObfuscatedName("afa.bz(IIIIII)V")
	public void method2179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		float var7 = (float) arg0 + 0.35F;
		float var8 = (float) arg1 + 0.35F;
		float var9 = (float) arg2 + var7 - 1.0F;
		float var10 = (float) arg3 + var8 - 1.0F;
		this.method15771();
		this.method15791(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.field9988) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(var7, var8);
		OpenGL.glVertex2f(var7, var10);
		OpenGL.glVertex2f(var9, var10);
		OpenGL.glVertex2f(var9, var8);
		OpenGL.glEnd();
		if (this.field9988) {
			OpenGL.glEnable(32925);
		}
	}

	@ObfuscatedName("afa.bv(IIIIII)V")
	public void method2354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		float var7 = (float) arg0 + 0.35F;
		float var8 = (float) arg1 + 0.35F;
		float var9 = (float) arg2 + var7;
		float var10 = (float) arg3 + var8;
		this.method15771();
		this.method15791(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.field9988) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(var7, var8);
		OpenGL.glVertex2f(var7, var10);
		OpenGL.glVertex2f(var9, var10);
		OpenGL.glVertex2f(var9, var8);
		OpenGL.glEnd();
		if (this.field9988) {
			OpenGL.glEnable(32925);
		}
	}

	@ObfuscatedName("afa.br(IIFIIFIIFIIII)V")
	public void method2552(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		this.method15771();
		this.method15791(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@ObfuscatedName("afa.bg(IIIII)V")
	public void method2182(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.field9927 || arg0 - arg2 > this.field9928 || arg1 + arg2 < this.field9925 || arg1 - arg2 > this.field9926) {
			return;
		}
		this.method15771();
		this.method15791(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		float var6 = (float) arg0 + 0.35F;
		float var7 = (float) arg1 + 0.35F;
		int var8 = arg2 << 1;
		if ((float) var8 < this.field10007) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
			OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
			OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
			OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) var8 <= this.field9983) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) var8);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(var6, var7);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(var6, var7);
			int var9 = 262144 / (arg2 * 6);
			if (var9 <= 64) {
				var9 = 64;
			} else if (var9 > 512) {
				var9 = 512;
			}
			int var10 = class783.method3082(var9);
			OpenGL.glVertex2f((float) arg2 + var6, var7);
			for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
				OpenGL.glVertex2f(Trig2.field1159[var11] * (float) arg2 + var6, Trig2.field1160[var11] * (float) arg2 + var7);
			}
			OpenGL.glVertex2f((float) arg2 + var6, var7);
			OpenGL.glEnd();
		}
	}

	@ObfuscatedName("afa.ba(IIIII)V")
	public void method2433(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method15771();
		this.method15791(arg4);
		float var6 = (float) arg0 + 0.35F;
		float var7 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(var6, var7);
		OpenGL.glVertex2f((float) arg2 + var6, var7);
		OpenGL.glEnd();
	}

	@ObfuscatedName("afa.bp(IIIII)V")
	public void method2139(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method15771();
		this.method15791(arg4);
		float var6 = (float) arg0 + 0.35F;
		float var7 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(var6, var7);
		OpenGL.glVertex2f(var6, (float) arg2 + var7);
		OpenGL.glEnd();
	}

	@ObfuscatedName("afa.bj(IIIIII)V")
	public void method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.method15771();
		this.method15791(arg5);
		float var7 = (float) arg2 - (float) arg0;
		float var8 = (float) arg3 - (float) arg1;
		float var9;
		if (var7 == 0.0F && var8 == 0.0F) {
			var9 = 1.0F;
		} else {
			float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
			var9 = var7 * var10;
			var8 *= var10;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
		OpenGL.glEnd();
	}

	@ObfuscatedName("afa.cl(IIIIIIIII)V")
	public void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method15771();
		this.method15791(arg5);
		float var10 = (float) arg2 - (float) arg0;
		float var11 = (float) arg3 - (float) arg1;
		float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
		float var13 = var10 * var12;
		float var14 = var11 * var12;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		int var15 = arg8 % (arg6 + arg7);
		float var16 = (float) arg6 * var13;
		float var17 = (float) arg6 * var14;
		float var18 = 0.0F;
		float var19 = 0.0F;
		float var20 = var16;
		float var21 = var17;
		if (var15 > arg6) {
			var18 = (float) (arg6 + arg7 - var15) * var13;
			var19 = (float) (arg6 + arg7 - var15) * var14;
		} else {
			var20 = (float) (arg6 - var15) * var13;
			var21 = (float) (arg6 - var15) * var14;
		}
		float var22 = (float) arg0 + 0.35F + var18;
		float var23 = (float) arg1 + 0.35F + var19;
		float var24 = (float) arg7 * var13;
		float var25 = (float) arg7 * var14;
		while (true) {
			if (arg2 > arg0) {
				if (var22 > (float) arg2 + 0.35F) {
					break;
				}
				if (var20 + var22 > (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			} else {
				if (var22 < (float) arg2 + 0.35F) {
					break;
				}
				if (var20 + var22 < (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			}
			if (arg3 > arg1) {
				if (var23 > (float) arg3 + 0.35F) {
					break;
				}
				if (var21 + var23 > (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			} else {
				if (var23 < (float) arg3 + 0.35F) {
					break;
				}
				if (var21 + var23 < (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(var22, var23);
			OpenGL.glVertex2f(var20 + var22, var21 + var23);
			OpenGL.glEnd();
			var22 += var20 + var24;
			var23 += var21 + var25;
			var20 = var16;
			var21 = var17;
		}
	}

	@ObfuscatedName("afa.bs(IIIIIILch;II)V")
	public void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6, int arg7, int arg8) {
		class833 var10 = (class833) arg6;
		class1113 var11 = var10.field9416;
		this.method15772();
		this.method15777(var10.field9416);
		this.method15791(arg5);
		this.method15810(7681, 8448);
		this.method15780(0, 34167, 768);
		float var12 = var11.field11901 / (float) var11.field11900;
		float var13 = var11.field11898 / (float) var11.field11902;
		float var14 = (float) arg2 - (float) arg0;
		float var15 = (float) arg3 - (float) arg1;
		float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
		float var17 = var14 * var16;
		float var18 = var15 * var16;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
		OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
		OpenGL.glEnd();
		this.method15780(0, 5890, 768);
	}

	@ObfuscatedName("afa.cg(IIIIIILch;IIIII)V")
	public void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		class833 var13 = (class833) arg6;
		class1113 var14 = var13.field9416;
		this.method15772();
		this.method15777(var13.field9416);
		this.method15791(arg5);
		this.method15810(7681, 8448);
		this.method15780(0, 34167, 768);
		float var15 = var14.field11901 / (float) var14.field11900;
		float var16 = var14.field11898 / (float) var14.field11902;
		float var17 = (float) arg2 - (float) arg0;
		float var18 = (float) arg3 - (float) arg1;
		float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
		float var20 = var17 * var19;
		float var21 = var18 * var19;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		int var22 = arg11 % (arg9 + arg10);
		float var23 = (float) arg9 * var20;
		float var24 = (float) arg9 * var21;
		float var25 = 0.0F;
		float var26 = 0.0F;
		float var27 = var23;
		float var28 = var24;
		if (var22 > arg9) {
			var25 = (float) (arg9 + arg10 - var22) * var20;
			var26 = (float) (arg9 + arg10 - var22) * var21;
		} else {
			var27 = (float) (arg9 - var22) * var20;
			var28 = (float) (arg9 - var22) * var21;
		}
		float var29 = (float) arg0 + 0.35F + var25;
		float var30 = (float) arg1 + 0.35F + var26;
		float var31 = (float) arg10 * var20;
		float var32 = (float) arg10 * var21;
		while (true) {
			if (arg2 > arg0) {
				if (var29 > (float) arg2 + 0.35F) {
					break;
				}
				if (var27 + var29 > (float) arg2) {
					var27 = (float) arg2 - var29;
				}
			} else {
				if (var29 < (float) arg2 + 0.35F) {
					break;
				}
				if (var27 + var29 < (float) arg2) {
					var27 = (float) arg2 - var29;
				}
			}
			if (arg3 > arg1) {
				if (var30 > (float) arg3 + 0.35F) {
					break;
				}
				if (var28 + var30 > (float) arg3) {
					var28 = (float) arg3 - var30;
				}
			} else {
				if (var30 < (float) arg3 + 0.35F) {
					break;
				}
				if (var28 + var30 < (float) arg3) {
					var28 = (float) arg3 - var30;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
			OpenGL.glVertex2f(var29, var30);
			OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
			OpenGL.glVertex2f(var27 + var29, var28 + var30);
			OpenGL.glEnd();
			var29 += var27 + var31;
			var30 += var28 + var32;
			var27 = var23;
			var28 = var24;
		}
		this.method15780(0, 5890, 768);
	}

	@ObfuscatedName("afa.ce(IIIIIII)V")
	public void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method2185(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@ObfuscatedName("afa.ev(FFF[F)V")
	public void method2525(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field10005.field4315[11] * arg2 + this.field10005.field4315[7] * arg1 + this.field10005.field4315[3] * arg0 + this.field10005.field4315[15];
		float var6 = this.field10005.field4315[8] * arg2 + this.field10005.field4315[4] * arg1 + this.field10005.field4315[0] * arg0 + this.field10005.field4315[12];
		float var7 = this.field10005.field4315[9] * arg2 + this.field10005.field4315[5] * arg1 + this.field10005.field4315[1] * arg0 + this.field10005.field4315[13];
		float var8 = this.field9903.field4315[10] * arg2 + this.field9903.field4315[6] * arg1 + this.field9903.field4315[2] * arg0 + this.field9903.field4315[14];
		arg3[0] = this.field9867 * var6 / var5 + this.field9910;
		arg3[1] = this.field9882 * var7 / var5 + this.field9912;
		arg3[2] = var8;
	}

	@ObfuscatedName("afa.ep(FFF[F)V")
	public void method2507(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field10005.field4315[10] * arg2 + this.field10005.field4315[6] * arg1 + this.field10005.field4315[2] * arg0 + this.field10005.field4315[14];
		float var6 = this.field10005.field4315[11] * arg2 + this.field10005.field4315[7] * arg1 + this.field10005.field4315[3] * arg0 + this.field10005.field4315[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field10005.field4315[8] * arg2 + this.field10005.field4315[4] * arg1 + this.field10005.field4315[0] * arg0 + this.field10005.field4315[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field10005.field4315[9] * arg2 + this.field10005.field4315[5] * arg1 + this.field10005.field4315[1] * arg0 + this.field10005.field4315[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field9903.field4315[10] * arg2 + this.field9903.field4315[6] * arg1 + this.field9903.field4315[2] * arg0 + this.field9903.field4315[14];
			arg3[0] = this.field9867 * var7 / var6 + this.field9910;
			arg3[1] = this.field9882 * var8 / var6 + this.field9912;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("afa.cu(IIIIII)I")
	public int method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field10005.field4315[10] * (float) arg2 + this.field10005.field4315[6] * (float) arg1 + this.field10005.field4315[2] * (float) arg0 + this.field10005.field4315[14];
		float var9 = this.field10005.field4315[10] * (float) arg5 + this.field10005.field4315[6] * (float) arg4 + this.field10005.field4315[2] * (float) arg3 + this.field10005.field4315[14];
		float var10 = this.field10005.field4315[11] * (float) arg2 + this.field10005.field4315[7] * (float) arg1 + this.field10005.field4315[3] * (float) arg0 + this.field10005.field4315[15];
		float var11 = this.field10005.field4315[11] * (float) arg5 + this.field10005.field4315[7] * (float) arg4 + this.field10005.field4315[3] * (float) arg3 + this.field10005.field4315[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field10005.field4315[8] * (float) arg2 + this.field10005.field4315[4] * (float) arg1 + this.field10005.field4315[0] * (float) arg0 + this.field10005.field4315[12];
		float var13 = this.field10005.field4315[8] * (float) arg5 + this.field10005.field4315[4] * (float) arg4 + this.field10005.field4315[0] * (float) arg3 + this.field10005.field4315[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field10005.field4315[9] * (float) arg2 + this.field10005.field4315[5] * (float) arg1 + this.field10005.field4315[1] * (float) arg0 + this.field10005.field4315[13];
		float var15 = this.field10005.field4315[9] * (float) arg5 + this.field10005.field4315[5] * (float) arg4 + this.field10005.field4315[1] * (float) arg3 + this.field10005.field4315[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("afa.cn(IIIILou;Loj;)Z")
	public boolean method2128(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, class416 arg5) {
		Matrix4x4 var7 = this.field9919;
		var7.method6609(arg4);
		var7.method6720(this.field10005);
		return arg5.method6275(arg0, arg1, arg2, arg3, var7, this.field9910, this.field9912, this.field9867, this.field9882);
	}

	@ObfuscatedName("afa.cv(Lou;Led;Loj;)V")
	public void method2193(Matrix4x3 arg0, class141 arg1, class416 arg2) {
		Matrix4x4 var4 = this.field9919;
		var4.method6609(arg0);
		var4.method6720(this.field10005);
		arg1.method2746(arg2, this.field9939, var4, this.field9910, this.field9912, this.field9867, this.field9882);
	}

	@ObfuscatedName("afa.cp(I)Lakz;")
	public class972 method2221(int arg0) {
		class1148 var2 = new class1148(arg0);
		this.field9964.method14153(var2);
		return var2;
	}

	@ObfuscatedName("afa.ca(Lakz;)V")
	public void method2195(class972 arg0) {
		this.field9876 = ((class1148) arg0).field12207;
		if (this.field10013 != null) {
			return;
		}
		GpuPacket var2 = new GpuPacket(80);
		if (this.field10017) {
			var2.method19550(-1.0F);
			var2.method19550(-1.0F);
			var2.method19550(0.0F);
			var2.method19550(0.0F);
			var2.method19550(0.0F);
			var2.method19550(-1.0F);
			var2.method19550(1.0F);
			var2.method19550(0.0F);
			var2.method19550(0.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(0.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(-1.0F);
			var2.method19550(0.0F);
			var2.method19550(1.0F);
			var2.method19550(0.0F);
		} else {
			var2.method19553(-1.0F);
			var2.method19553(-1.0F);
			var2.method19553(0.0F);
			var2.method19553(0.0F);
			var2.method19553(0.0F);
			var2.method19553(-1.0F);
			var2.method19553(1.0F);
			var2.method19553(0.0F);
			var2.method19553(0.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(0.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(-1.0F);
			var2.method19553(0.0F);
			var2.method19553(1.0F);
			var2.method19553(0.0F);
		}
		this.field10013 = this.method15767(20, var2.data, var2.pos, false);
		this.field9918 = new class83(this.field10013, 5126, 3, 0);
		this.field10012 = new class83(this.field10013, 5126, 2, 12);
		this.field9978.method1323(this);
	}

	@ObfuscatedName("afa.cw(IIZZ)Lcm;")
	public Sprite method2197(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new class830(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("afa.co(Lde;Z)Lcm;")
	public Sprite method2200(SpriteData arg0, boolean arg1) {
		int[] var3 = arg0.method2604(false);
		Sprite var4 = this.method2199(var3, 0, arg0.method2639(), arg0.method2639(), arg0.method2631());
		var4.method1431(arg0.method2591(), arg0.method2593(), arg0.method2603(), arg0.method2651());
		return var4;
	}

	@ObfuscatedName("afa.ct([IIIIIZ)Lcm;")
	public Sprite method2188(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new class830(this, arg3, arg4, arg0, arg1, arg2);
	}

	@ObfuscatedName("afa.cr(IIIIZ)Lcm;")
	public Sprite method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new class830(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("afa.cb(II[I[I)Lch;")
	public class103 method2205(int arg0, int arg1, int[] arg2, int[] arg3) {
		return class833.method15384(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("afa.cs(ILch;II)V")
	public void method2206(int arg0, class103 arg1, int arg2, int arg3) {
		class833 var5 = (class833) arg1;
		class1113 var6 = var5.field9416;
		this.method15772();
		this.method15777(var5.field9416);
		this.method15791(1);
		this.method15810(7681, 8448);
		this.method15780(0, 34167, 768);
		float var7 = var6.field11901 / (float) var6.field11900;
		float var8 = var6.field11898 / (float) var6.field11902;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.field9927 - arg2) * var7, (float) (this.field9925 - arg3) * var8);
		OpenGL.glVertex2i(this.field9927, this.field9925);
		OpenGL.glTexCoord2f((float) (this.field9927 - arg2) * var7, (float) (this.field9926 - arg3) * var8);
		OpenGL.glVertex2i(this.field9927, this.field9926);
		OpenGL.glTexCoord2f((float) (this.field9928 - arg2) * var7, (float) (this.field9926 - arg3) * var8);
		OpenGL.glVertex2i(this.field9928, this.field9926);
		OpenGL.glTexCoord2f((float) (this.field9928 - arg2) * var7, (float) (this.field9925 - arg3) * var8);
		OpenGL.glVertex2i(this.field9928, this.field9925);
		OpenGL.glEnd();
		this.method15780(0, 5890, 768);
	}

	@ObfuscatedName("afa.cy(Laac;Lde;Z)Leu;")
	public class140 method2207(FontMetrics arg0, SpriteData arg1, boolean arg2) {
		return new class857(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("afa.ck(I)V")
	public void method2532(int arg0) {
	}

	@ObfuscatedName("afa.cj(Ldq;IIII)Ldo;")
	public Model method2211(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
		return new LegacyOpenGLModel(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("afa.cd(II)I")
	public int method2394(int arg0, int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@ObfuscatedName("afa.dd(II)I")
	public int method2213(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("afa.dr(II[[I[[IIII)Lcb;")
	public FloorModel method2214(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new LegacyOpenGLFloorModel(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("afa.cc()Lpq;")
	public Matrix4x4 method2208() {
		return this.field9866;
	}

	@ObfuscatedName("afa.cz()Lou;")
	public Matrix4x3 method2209() {
		return this.field9900;
	}

	@ObfuscatedName("afa.dt(Ldm;)V")
	public void method2198(ParticleList arg0) {
		this.field9978.method1324(this, arg0);
	}

	@ObfuscatedName("afa.ei(ILdy;)V")
	public void method2245(int arg0, class131 arg1) {
		this.field10028 = arg0;
		this.field9892 = arg1;
		this.field9840 = true;
	}

	@ObfuscatedName("afa.el(ILdy;)V")
	public void method2246(int arg0, class131 arg1) {
		if (!this.field9840) {
			throw new RuntimeException("");
		}
		this.field10028 = arg0;
		this.field9892 = arg1;
		if (this.field9963) {
			this.field10023.field1032.method15343();
			this.field10023.field1032.method15344();
		}
	}

	@ObfuscatedName("afa.ej()V")
	public void method2247() {
		this.field9840 = false;
	}

	@ObfuscatedName("afa.bk()V")
	public void method2263() {
		this.field9897 = 0;
		this.field9932 = 0;
		this.field9931 = this.field1614.method1627();
		this.field9934 = this.field1614.method1628();
		this.method15937();
	}

	@ObfuscatedName("afa.bh(IIII)V")
	public void method2164(int arg0, int arg1, int arg2, int arg3) {
		this.field9897 = arg0;
		this.field9932 = arg1;
		this.field9931 = arg2;
		this.field9934 = arg3;
		this.method15937();
	}

	@ObfuscatedName("afa.bx([I)V")
	public void method2326(int[] arg0) {
		arg0[0] = this.field9897;
		arg0[1] = this.field9932;
		arg0[2] = this.field9931;
		arg0[3] = this.field9934;
	}

	@ObfuscatedName("afa.bd(FF)V")
	public void method2339(float arg0, float arg1) {
		this.field9914 = arg0;
		this.field9831 = arg1;
		this.method15924();
	}

	@ObfuscatedName("afa.bq([I)V")
	public final void method2171(int[] arg0) {
		arg0[0] = this.field9927;
		arg0[1] = this.field9925;
		arg0[2] = this.field9928;
		arg0[3] = this.field9926;
	}

	@ObfuscatedName("afa.bc()V")
	public final void method2167() {
		if (this.field1614 == null) {
			return;
		}
		this.field9927 = 0;
		this.field9925 = 0;
		this.field9928 = this.field1614.method1627();
		this.field9926 = this.field1614.method1628();
		OpenGL.glDisable(3089);
	}

	@ObfuscatedName("afa.bi(IIII)V")
	public final void method2168(int arg0, int arg1, int arg2, int arg3) {
		if (this.field1614 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.field1614.method1627()) {
			arg2 = this.field1614.method1627();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.field1614.method1628()) {
			arg3 = this.field1614.method1628();
		}
		this.field9927 = arg0;
		this.field9925 = arg1;
		this.field9928 = arg2;
		this.field9926 = arg3;
		OpenGL.glEnable(3089);
		this.method15743();
	}

	@ObfuscatedName("afa.bn(IIII)V")
	public final void method2161(int arg0, int arg1, int arg2, int arg3) {
		if (this.field9927 < arg0) {
			this.field9927 = arg0;
		}
		if (this.field9928 > arg2) {
			this.field9928 = arg2;
		}
		if (this.field9925 < arg1) {
			this.field9925 = arg1;
		}
		if (this.field9926 > arg3) {
			this.field9926 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method15743();
	}

	@ObfuscatedName("afa.rl(II)V")
	public final void method15925(int arg0, int arg1) {
		this.field9869 = arg0;
		this.field9930 = arg1;
		this.method15937();
		this.method15743();
	}

	@ObfuscatedName("afa.rc()V")
	public final void method15937() {
		if (this.field1614 == null) {
			return;
		}
		int var1;
		int var2;
		int var3;
		int var4;
		if (this.field9922 == 2) {
			var1 = this.field9897;
			var2 = this.field9932;
			var3 = this.field9931;
			var4 = this.field9934;
		} else {
			var1 = 0;
			var2 = 0;
			var3 = this.field1614.method1627();
			var4 = this.field1614.method1628();
		}
		if (var3 < 1) {
			var3 = 1;
		}
		if (var4 < 1) {
			var4 = 1;
		}
		OpenGL.glViewport(this.field9869 + var1, this.field9930 + this.field1614.method1628() - var2 - var4, var3, var4);
		this.field9867 = (float) this.field9931 / 2.0F;
		this.field9882 = (float) this.field9934 / 2.0F;
		this.field9910 = (float) this.field9897 + this.field9867;
		this.field9912 = (float) this.field9932 + this.field9882;
	}

	@ObfuscatedName("afa.rr()V")
	public final void method15924() {
		if (this.field9922 == 2) {
			OpenGL.glDepthRange(this.field9914, this.field9831);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@ObfuscatedName("afa.rd()V")
	public final void method15743() {
		if (this.field1614 == null || this.field9927 >= this.field9928 || this.field9925 >= this.field9926) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.field9927 + this.field9869, this.field9930 + this.field1614.method1628() - this.field9926, this.field9928 - this.field9927, this.field9926 - this.field9925);
		}
	}

	@ObfuscatedName("afa.rn()V")
	public final void method15744() {
		OpenGL.glPushMatrix();
	}

	@ObfuscatedName("afa.rb(Lpq;)V")
	public final void method15818(Matrix4x4 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.field4315, 0);
	}

	@ObfuscatedName("afa.ru(Lpq;)V")
	public final void method15928(Matrix4x4 arg0) {
		OpenGL.glLoadMatrixf(arg0.field4315, 0);
	}

	@ObfuscatedName("afa.sv()V")
	public final void method15745() {
		OpenGL.glPopMatrix();
	}

	@ObfuscatedName("afa.do(Lou;)V")
	public final void method2217(Matrix4x3 arg0) {
		this.field9911.method6292(arg0);
		this.field9903.method6609(this.field9911);
		this.field9976.method6292(arg0);
		this.field9976.method6300();
		this.field9904.method6609(this.field9976);
		this.method15752();
		if (this.field9922 != 1) {
			this.method15841();
		}
	}

	@ObfuscatedName("afa.dz()Lou;")
	public Matrix4x3 method2218() {
		return new Matrix4x3(this.field9911);
	}

	@ObfuscatedName("afa.sw()V")
	public final void method15841() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.field9903.field4315, 0);
		if (this.field9963) {
			this.field10023.field1032.method15343();
		}
		this.method15758();
		this.method15742();
	}

	@ObfuscatedName("afa.dm(Lpq;)V")
	public final void method2220(Matrix4x4 arg0) {
		this.field9939.method6604(arg0);
		this.method15752();
		this.method15751();
	}

	@ObfuscatedName("afa.dq()Lpq;")
	public final Matrix4x4 method2355() {
		return new Matrix4x4(this.field9939);
	}

	@ObfuscatedName("afa.ss()V")
	public final void method15748() {
		if (this.field9922 != 0) {
			this.field9922 = 0;
			this.method15937();
			this.method15924();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afa.sx()V")
	public final void method15749() {
		if (this.field9922 == 1) {
			return;
		}
		this.field9922 = 1;
		this.method15751();
		this.method15937();
		this.method15924();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.field9908 &= 0xFFFFFFE7;
	}

	@ObfuscatedName("afa.sm()V")
	public final void method15763() {
		if (this.field9922 == 2) {
			return;
		}
		this.field9922 = 2;
		this.method15753(this.field9939.field4315);
		this.method15841();
		this.method15937();
		this.method15924();
		this.field9908 &= 0xFFFFFFF8;
	}

	@ObfuscatedName("afa.sk()V")
	public final void method15751() {
		this.field9917 = this.field9939.method6632();
		this.field9916 = this.field9939.method6654();
		this.method15806();
		if (this.field9922 == 2) {
			this.method15753(this.field9939.field4315);
		} else if (this.field9922 == 1) {
			this.method15753(this.field9906.field4315);
		}
	}

	@ObfuscatedName("afa.si()V")
	public final void method15752() {
		this.field10005.method6604(this.field9903);
		this.field10005.method6720(this.field9939);
		this.field10005.method6607(this.field10015[0]);
		this.field10005.method6643(this.field10015[1]);
		this.field10005.method6625(this.field10015[2]);
		this.field10005.method6626(this.field10015[3]);
		this.field10005.method6627(this.field10015[4]);
		this.field10005.method6628(this.field10015[5]);
	}

	@ObfuscatedName("afa.se([F)V")
	public final void method15753(float[] arg0) {
		float[] var2 = new float[16];
		System.arraycopy(arg0, 0, var2, 0, 16);
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(var2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("afa.dv(Z)V")
	public void method2219(boolean arg0) {
		this.field9980 = arg0;
		this.method15826();
	}

	@ObfuscatedName("afa.df()I")
	public int method2114() {
		return 4;
	}

	@ObfuscatedName("afa.ds(I[Lakf;)V")
	public void method2491(int arg0, Light[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field9949[var3] = arg1[var3];
		}
		this.field9898 = arg0;
		if (this.field9922 != 1) {
			this.method15742();
		}
	}

	@ObfuscatedName("afa.sn()V")
	public void method15742() {
		int var1;
		for (var1 = 0; var1 < this.field9898; var1++) {
			Light var2 = this.field9949[var1];
			int var3 = var1 + 16386;
			field9894[0] = var2.method17605();
			field9894[1] = var2.method17606();
			field9894[2] = var2.method17607();
			field9894[3] = 1.0F;
			OpenGL.glLightfv(var3, 4611, field9894, 0);
			int var4 = var2.method17624();
			float var5 = var2.method17610() / 255.0F;
			field9894[0] = (float) (var4 >> 16 & 0xFF) * var5;
			field9894[1] = (float) (var4 >> 8 & 0xFF) * var5;
			field9894[2] = (float) (var4 & 0xFF) * var5;
			OpenGL.glLightfv(var3, 4609, field9894, 0);
			OpenGL.glLightf(var3, 4617, 1.0F / (float) (var2.method17608() * var2.method17608()));
			OpenGL.glEnable(var3);
		}
		while (var1 < this.field9909) {
			OpenGL.glDisable(var1 + 16386);
			var1++;
		}
		this.field9909 = this.field9898;
	}

	@ObfuscatedName("afa.dc(F)V")
	public final void method2222(float arg0) {
		if (this.field9946 != arg0) {
			this.field9946 = arg0;
			this.method15756();
		}
	}

	@ObfuscatedName("afa.di(IFFFFF)V")
	public final void method2223(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.field9942 != arg0;
		if (var7 || this.field9947 != arg1 || this.field9948 != arg2) {
			this.field9942 = arg0;
			this.field9947 = arg1;
			this.field9948 = arg2;
			if (var7) {
				this.field9863 = (float) (this.field9942 & 0xFF0000) / 1.671168E7F;
				this.field9944 = (float) (this.field9942 & 0xFF00) / 65280.0F;
				this.field9945 = (float) (this.field9942 & 0xFF) / 255.0F;
				this.method15756();
			}
			this.method15819();
		}
		if (this.field9951[0] == arg3 && this.field9951[1] == arg4 && this.field9951[2] == arg5) {
			return;
		}
		this.field9951[0] = arg3;
		this.field9951[1] = arg4;
		this.field9951[2] = arg5;
		this.field9895[0] = -arg3;
		this.field9895[1] = -arg4;
		this.field9895[2] = -arg5;
		float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.field9870[0] = arg3 * var8;
		this.field9870[1] = arg4 * var8;
		this.field9870[2] = arg5 * var8;
		this.field9941[0] = -this.field9870[0];
		this.field9941[1] = -this.field9870[1];
		this.field9941[2] = -this.field9870[2];
		this.method15758();
		this.field9915 = (int) (arg3 * 256.0F / arg4);
		this.field9953 = (int) (arg5 * 256.0F / arg4);
	}

	@ObfuscatedName("afa.dk(I)V")
	public final void method2224(int arg0) {
		this.field9874 = 0;
		while (arg0 > 1) {
			this.field9874++;
			arg0 >>= 0x1;
		}
		this.field9873 = 0x1 << this.field9874;
	}

	@ObfuscatedName("afa.dn(III)V")
	public final void method2572(int arg0, int arg1, int arg2) {
		if (this.field9955 == arg0 && this.field9956 == arg1 && this.field9957 == arg2) {
			return;
		}
		this.field9955 = arg0;
		this.field9956 = arg1;
		this.field9957 = arg2;
		this.method15806();
		this.method15828();
	}

	@ObfuscatedName("afa.sr(FF)V")
	public final void method15755(float arg0, float arg1) {
		this.field9960 = arg0;
		this.field9961 = arg1;
		this.method15806();
	}

	@ObfuscatedName("afa.sq()V")
	public void method15756() {
		field10014[0] = this.field9946 * this.field9863;
		field10014[1] = this.field9946 * this.field9944;
		field10014[2] = this.field9946 * this.field9945;
		field10014[3] = 1.0F;
		OpenGL.glLightModelfv(2899, field10014, 0);
	}

	@ObfuscatedName("afa.sh()V")
	public void method15819() {
		field10014[0] = this.field9947 * this.field9863;
		field10014[1] = this.field9947 * this.field9944;
		field10014[2] = this.field9947 * this.field9945;
		field10014[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, field10014, 0);
		field10014[0] = -this.field9948 * this.field9863;
		field10014[1] = -this.field9948 * this.field9944;
		field10014[2] = -this.field9948 * this.field9945;
		field10014[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, field10014, 0);
	}

	@ObfuscatedName("afa.st()V")
	public void method15758() {
		OpenGL.glLightfv(16384, 4611, this.field9870, 0);
		OpenGL.glLightfv(16385, 4611, this.field9941, 0);
	}

	@ObfuscatedName("afa.sl()V")
	public void method15828() {
		if (this.field9954 && this.field9956 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@ObfuscatedName("afa.sp()V")
	public void method15806() {
		this.field9829 = this.field9917 - (float) this.field9957 - this.field9961;
		this.field9830 = this.field9829 - (float) this.field9956 * this.field9960;
		if (this.field9830 < this.field9916) {
			this.field9830 = this.field9916;
		}
		OpenGL.glFogf(2915, this.field9830);
		OpenGL.glFogf(2916, this.field9829);
		field10014[0] = (float) (this.field9955 & 0xFF0000) / 1.671168E7F;
		field10014[1] = (float) (this.field9955 & 0xFF00) / 65280.0F;
		field10014[2] = (float) (this.field9955 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, field10014, 0);
	}

	@ObfuscatedName("afa.du(I)Ldz;")
	public class117 method2229(int arg0) {
		return this.field9952 ? new class1124(this, arg0) : null;
	}

	@ObfuscatedName("afa.dl(Ldz;Ldz;FLdz;)Ldz;")
	public class117 method2435(class117 arg0, class117 arg1, float arg2, class117 arg3) {
		if (arg0 != null && arg1 != null && this.field9952 && this.field9985) {
			class1123 var5 = null;
			class845 var6 = (class845) arg0;
			class845 var7 = (class845) arg1;
			class813 var8 = var6.method15649();
			class813 var9 = var7.method15649();
			if (var8 != null && var9 != null) {
				int var10 = var8.field9279 > var9.field9279 ? var8.field9279 : var9.field9279;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class1123) {
					class1123 var11 = (class1123) arg3;
					if (var11.method18982() == var10) {
						var5 = var11;
					}
				}
				if (var5 == null) {
					var5 = new class1123(this, var10);
				}
				if (var5.method18984(var8, var9, arg2)) {
					return var5;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("afa.dp(Ldz;)V")
	public final void method2516(class117 arg0) {
		this.field9887 = (class845) arg0;
	}

	@ObfuscatedName("afa.su()Ladq;")
	public final class813 method15760() {
		return this.field9887 == null ? null : this.field9887.method15649();
	}

	@ObfuscatedName("afa.dy(IIII)V")
	public final void method2172(int arg0, int arg1, int arg2, int arg3) {
		if (this.field9986 != null) {
			this.field9986.method1367(arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("afa.db(II)V")
	public final void method2233(int arg0, int arg1) {
		if (this.field9986 != null) {
			this.field9986.method1368(arg0, arg1);
		}
	}

	@ObfuscatedName("afa.dh()Z")
	public final boolean method2234() {
		return this.field9986 == null ? false : this.field9986.method1378();
	}

	@ObfuscatedName("afa.sd()Z")
	public boolean method15762() {
		if (this.field9865 == null) {
			return false;
		}
		if (!this.field9865.method17543()) {
			if (!this.field9986.method1369(this.field9865)) {
				return false;
			}
			this.field10026.method1399();
		}
		return true;
	}

	@ObfuscatedName("afa.dx()Z")
	public boolean method2152() {
		return this.field9865 != null && this.field9865.method17543();
	}

	@ObfuscatedName("afa.dg(FFFFF)V")
	public void method2236(float arg0, float arg1, float arg2, float arg3, float arg4) {
		LevelsFilter.field12167 = arg0;
		LevelsFilter.field12172 = arg1;
		LevelsFilter.field12168 = arg2;
		LevelsFilter.field12166 = arg3;
		LevelsFilter.field12170 = arg4;
	}

	@ObfuscatedName("afa.de([I)Lcj;")
	public class110 method2237(int[] arg0) {
		return new class838(this, arg0);
	}

	@ObfuscatedName("afa.sz()Z")
	public boolean method15803() {
		if (this.field9853 == null) {
			return false;
		}
		if (!this.field9853.method17543()) {
			if (!this.field9986.method1369(this.field9853)) {
				return false;
			}
			this.field10026.method1399();
		}
		return true;
	}

	@ObfuscatedName("afa.dj()Z")
	public boolean method2238() {
		return this.field9853 != null && this.field9853.method17543();
	}

	@ObfuscatedName("afa.eo(Lcj;FLcj;FLcj;F)V")
	public void method2239(class110 arg0, float arg1, class110 arg2, float arg3, class110 arg4, float arg5) {
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
		ColourRemappingFilter.field12179[0] = (class838) arg0;
		ColourRemappingFilter.field12183[0] = arg1;
		if (arg1 > 0.0F) {
			var7++;
		}
		ColourRemappingFilter.field12179[1] = (class838) arg2;
		ColourRemappingFilter.field12183[1] = arg3;
		if (arg3 > 0.0F) {
			var7++;
		}
		ColourRemappingFilter.field12179[2] = (class838) arg4;
		ColourRemappingFilter.field12183[2] = arg5;
		if (arg5 > 0.0F) {
			var7++;
		}
		ColourRemappingFilter.field12175 = var7;
		ColourRemappingFilter.field12174 = 1.0F - (arg1 + arg3 + arg5);
	}

	@ObfuscatedName("afa.ey()Z")
	public final boolean method2274() {
		if (this.field9864 == null) {
			return false;
		}
		if (!this.field9864.method17543()) {
			if (!this.field9986.method1369(this.field9864)) {
				return false;
			}
			this.field10026.method1399();
		}
		return true;
	}

	@ObfuscatedName("afa.eu()V")
	public final void method2273() {
		if (this.field9864 != null && this.field9864.method17543()) {
			this.field9986.method1370(this.field9864);
			this.field10026.method1399();
		}
	}

	@ObfuscatedName("afa.ed()Z")
	public final boolean method2242() {
		return this.field9864 != null && this.field9864.method17543();
	}

	@ObfuscatedName("afa.es(FFFFFF)V")
	public final void method2244(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		ColourGradingBloomFilter.field12189 = arg0;
		ColourGradingBloomFilter.field12188 = arg1;
		ColourGradingBloomFilter.field12205 = arg2;
	}

	@ObfuscatedName("afa.am()Lafq;")
	public Framebuffer method2145() {
		return new LegacyOpenGLFramebuffer(this);
	}

	@ObfuscatedName("afa.ar(II)Ldw;")
	public class126 method2121(int arg0, int arg1) {
		return new class828(this, TextureFormat.field1268, DataType.field1649, arg0, arg1);
	}

	@ObfuscatedName("afa.ap(III)Ldw;")
	public class126 method2356(int arg0, int arg1, int arg2) {
		return new class828(this, TextureFormat.field1268, DataType.field1649, arg0, arg1, arg2);
	}

	@ObfuscatedName("afa.au(IILck;Ldg;I)Ldp;")
	public class130 method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
		return new class828(this, arg2, arg3, arg0, arg1, arg4);
	}

	@ObfuscatedName("afa.sf(I[BIZ)Lcf;")
	public final class98 method15766(int arg0, byte[] arg1, int arg2, boolean arg3) {
		return (class98) (this.field9990 && (!arg3 || this.field9991) ? new class826(this, arg0, arg1, arg2, arg3) : new class827(this, arg0, arg1, arg2));
	}

	@ObfuscatedName("afa.sy(I[BIZ)Lbv;")
	public final class79 method15767(int arg0, byte[] arg1, int arg2, boolean arg3) {
		return (class79) (this.field9990 && (!arg3 || this.field9991) ? new class825(this, arg0, arg1, arg2, arg3) : new class824(this, arg0, arg1, arg2));
	}

	@ObfuscatedName("afa.sa(ILjaclib/memory/Buffer;IZ)Lbv;")
	public final class79 method15804(int arg0, Buffer arg1, int arg2, boolean arg3) {
		return (class79) (this.field9990 && (!arg3 || this.field9991) ? new class825(this, arg0, arg1, arg2, arg3) : new class824(this, arg0, arg1));
	}

	@ObfuscatedName("afa.sb(Lbv;)V")
	public final void method15842(class79 arg0) {
		if (this.field9852 != arg0) {
			if (this.field9990) {
				OpenGL.glBindBufferARB(34962, arg0.method1294());
			}
			this.field9852 = arg0;
		}
	}

	@ObfuscatedName("afa.sj(Lcf;)V")
	public final void method15769(class98 arg0) {
		if (this.field9966 != arg0) {
			if (this.field9990) {
				OpenGL.glBindBufferARB(34963, arg0.method1416());
			}
			this.field9966 = arg0;
		}
	}

	@ObfuscatedName("afa.so(Lbp;Lbp;Lbp;Lbp;)V")
	public final void method15809(class83 arg0, class83 arg1, class83 arg2, class83 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method15842(arg0.field1111);
			OpenGL.glVertexPointer(arg0.field1110, arg0.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg0.field1112);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method15842(arg1.field1111);
			OpenGL.glNormalPointer(arg1.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg1.field1112);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method15842(arg2.field1111);
			OpenGL.glColorPointer(arg2.field1110, arg2.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg2.field1112);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method15842(arg3.field1111);
			OpenGL.glTexCoordPointer(arg3.field1110, arg3.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg3.field1112);
			OpenGL.glEnableClientState(32888);
		}
	}

	@ObfuscatedName("afa.sc(III)V")
	public final void method15801(int arg0, int arg1, int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@ObfuscatedName("afa.sg(Lcf;III)V")
	public final void method15921(class98 arg0, int arg1, int arg2, int arg3) {
		this.method15769(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.getAddress() + (long) (arg2 * 2));
	}

	@ObfuscatedName("afa.tu()V")
	public final void method15771() {
		if (this.field9908 == 1) {
			return;
		}
		this.method15749();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15777(null);
		this.method15774(-2);
		this.method15778(1);
		this.method15794((byte) 0);
		this.field9908 = 1;
	}

	@ObfuscatedName("afa.ta()V")
	public final void method15772() {
		if (this.field9908 == 2) {
			return;
		}
		this.method15749();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15774(-2);
		this.method15794((byte) 0);
		this.field9908 = 2;
	}

	@ObfuscatedName("afa.tr()V")
	public final void method15731() {
		if (this.field9908 == 4) {
			return;
		}
		this.method15749();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15774(-2);
		this.method15791(1);
		this.method15794((byte) 0);
		this.field9908 = 4;
	}

	@ObfuscatedName("afa.tc()V")
	public final void method15773() {
		if (this.field9908 == 8) {
			return;
		}
		this.method15763();
		this.method15738(true);
		this.method15788(true);
		this.method15789(true);
		this.method15774(-2);
		this.method15791(1);
		this.method15794((byte) 0);
		this.field9908 = 8;
	}

	@ObfuscatedName("afa.tj(I)V")
	public final void method15774(int arg0) {
		this.method15775(arg0, true);
	}

	@ObfuscatedName("afa.te(IZ)V")
	public final void method15775(int arg0, boolean arg1) {
		this.method15795(arg0, arg1, true);
	}

	@ObfuscatedName("afa.ti(IZZ)V")
	public final void method15795(int arg0, boolean arg1, boolean arg2) {
		if (this.field9968 != arg0 || this.field9963 != this.field9840) {
			class812 var4 = null;
			byte var5 = 0;
			byte var6 = 0;
			int var7 = 0;
			int var8 = this.field9840 ? 3 : 0;
			byte var9 = 0;
			if (arg0 < 0) {
				this.method15785();
			} else {
				Material var10 = this.field1597.method2043(arg0);
				if (var10.field1330) {
					var4 = this.field10026.method1404(var10);
					if (var10.field1317 == 0.0F && var10.field1338 == 0.0F) {
						this.method15785();
					} else {
						this.method15784((float) (this.field9872 % 128000) / 1000.0F * var10.field1317 % 1.0F, (float) (this.field9872 % 128000) / 1000.0F * var10.field1338 % 1.0F, 0.0F);
					}
					if (!this.field9840) {
						var6 = var10.field1305;
						var7 = var10.field1359;
						var8 = var10.field1308;
					}
					var5 = var10.field1311;
				} else {
					this.method15785();
				}
				if (class603.field7574 == var10.field1340) {
					var9 = var10.field1358;
				}
			}
			this.method15794(var9);
			this.field10023.method1278(var8, var6, var7, arg1, arg2);
			if (!this.field10023.method1276(var4, var5)) {
				this.method15777(var4);
				this.method15778(var5);
			}
			this.field9963 = this.field9840;
			this.field9968 = arg0;
		}
		this.field9908 &= 0xFFFFFFF8;
	}

	@ObfuscatedName("afa.tm(I)V")
	public final void method15776(int arg0) {
		if (this.field10018 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.field10018 = arg0;
		}
	}

	@ObfuscatedName("afa.ty(Lbq;)V")
	public final void method15777(class70 arg0) {
		class70 var2 = this.field9973[this.field10018];
		if (arg0 != var2) {
			if (arg0 == null) {
				OpenGL.glDisable(var2.field1009);
			} else {
				if (var2 == null) {
					OpenGL.glEnable(arg0.field1009);
				} else if (arg0.field1009 != var2.field1009) {
					OpenGL.glDisable(var2.field1009);
					OpenGL.glEnable(arg0.field1009);
				}
				OpenGL.glBindTexture(arg0.field1009, arg0.field1007);
			}
			this.field9973[this.field10018] = arg0;
		}
		this.field9908 &= 0xFFFFFFEE;
	}

	@ObfuscatedName("afa.tb(I)V")
	public final void method15778(int arg0) {
		if (arg0 == 1) {
			this.method15810(7681, 7681);
		} else if (arg0 == 0) {
			this.method15810(8448, 8448);
		} else if (arg0 == 2) {
			this.method15810(34165, 7681);
		} else if (arg0 == 3) {
			this.method15810(260, 8448);
		} else if (arg0 == 4) {
			this.method15810(34023, 34023);
		}
	}

	@ObfuscatedName("afa.tn(I)I")
	public final int method15779(int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("afa.tw(II)V")
	public final void method15810(int arg0, int arg1) {
		if (this.field10018 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		boolean var3 = false;
		if (this.field9969 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.field9969 = arg0;
			var3 = true;
		}
		if (this.field9970 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.field9970 = arg1;
			var3 = true;
		}
		if (var3) {
			this.field9908 &= 0xFFFFFFE2;
		}
	}

	@ObfuscatedName("afa.tz(III)V")
	public final void method15780(int arg0, int arg1, int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@ObfuscatedName("afa.tf(III)V")
	public final void method15781(int arg0, int arg1, int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@ObfuscatedName("afa.th(I)V")
	public final void method15765(int arg0) {
		field10014[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		field10014[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		field10014[2] = (float) (arg0 & 0xFF) / 255.0F;
		field10014[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, field10014, 0);
	}

	@ObfuscatedName("afa.tt(FFFF)V")
	public final void method15783(float arg0, float arg1, float arg2, float arg3) {
		field10014[0] = arg0;
		field10014[1] = arg1;
		field10014[2] = arg2;
		field10014[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, field10014, 0);
	}

	@ObfuscatedName("afa.ts(FFF)V")
	public final void method15784(float arg0, float arg1, float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.field9958) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.field9958 = true;
	}

	@ObfuscatedName("afa.tp()V")
	public final void method15785() {
		if (this.field9958) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.field9958 = false;
		}
	}

	@ObfuscatedName("afa.tv(Z)V")
	public final void method15738(boolean arg0) {
		if (this.field9954 != arg0) {
			this.field9954 = arg0;
			this.method15828();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afa.to(Z)V")
	public final void method15764(boolean arg0) {
		if (this.field9936 != arg0) {
			this.field9936 = arg0;
			this.method15831();
			this.field9908 &= 0xFFFFFFF8;
		}
	}

	@ObfuscatedName("afa.tg(Z)V")
	public final void method15840(boolean arg0) {
		if (this.field9937 != arg0) {
			this.field9937 = arg0;
			this.method15831();
		}
	}

	@ObfuscatedName("afa.tq()V")
	public void method15831() {
		if (this.field9936 && !this.field9937) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@ObfuscatedName("afa.tx(Z)V")
	public final void method15788(boolean arg0) {
		if (this.field9899 != arg0) {
			this.field9899 = arg0;
			this.method15790();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afa.tk(Z)V")
	public final void method15789(boolean arg0) {
		if (this.field9815 != arg0) {
			this.field9815 = arg0;
			this.method15826();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

	@ObfuscatedName("afa.tl()V")
	public final void method15826() {
		OpenGL.glDepthMask(this.field9815 && this.field9980);
	}

	@ObfuscatedName("afa.td()V")
	public final void method15790() {
		if (this.field9899 && this.field9950) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@ObfuscatedName("afa.ul(I)V")
	public final void method15791(int arg0) {
		if (this.field9923 == arg0) {
			return;
		}
		byte var2;
		boolean var3;
		boolean var4;
		boolean var5;
		if (arg0 == 1) {
			var2 = 1;
			var3 = true;
			var4 = true;
			var5 = true;
		} else if (arg0 == 2) {
			var2 = 2;
			var3 = true;
			var4 = false;
			var5 = true;
		} else if (arg0 == 128) {
			var2 = 3;
			var3 = true;
			var4 = true;
			var5 = true;
		} else if (arg0 == 3) {
			var2 = 0;
			var3 = true;
			var4 = true;
			var5 = false;
		} else {
			var2 = 0;
			var3 = true;
			var4 = false;
			var5 = false;
		}
		if (this.field9848 != var3) {
			OpenGL.glColorMask(var3, var3, var3, true);
			this.field9848 = var3;
		}
		if (this.field9924 != var4) {
			this.field9924 = var4;
			this.method15839();
		}
		if (this.field9921 != var5) {
			this.field9921 = var5;
			this.method15792();
		}
		if (this.field9893 != var2) {
			this.field9893 = var2;
			this.method15793();
		}
		this.field9923 = arg0;
		this.field9908 &= 0xFFFFFFE3;
	}

	@ObfuscatedName("afa.um()V")
	public final void method15792() {
		if (this.field9921) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@ObfuscatedName("afa.uq()V")
	public final void method15793() {
		if (this.field10004) {
			byte var1 = 0;
			byte var2 = 0;
			if (this.field9896 == 0) {
				var1 = 0;
				var2 = 0;
			} else if (this.field9896 == 1) {
				var1 = 1;
				var2 = 0;
			} else if (this.field9896 == 2) {
				var1 = 1;
				var2 = 1;
			} else if (this.field9896 == 3) {
				var1 = 0;
				var2 = 1;
			}
			if (this.field9893 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
			} else if (this.field9893 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
			} else if (this.field9893 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
			} else if (this.field9893 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, var1, var2);
			}
		} else if (this.field9893 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.field9893 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.field9893 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@ObfuscatedName("afa.uc(I)V")
	public final void method15759(int arg0) {
		if (this.field9896 != arg0) {
			this.field9896 = arg0;
			this.method15793();
		}
	}

	@ObfuscatedName("afa.ui()V")
	public final void method15839() {
		if (this.field9924) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.field9943 & 0xFF) / 255.0F);
		if (this.field9967 <= 0) {
			return;
		}
		if (this.field9943 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@ObfuscatedName("afa.ua(B)V")
	public final void method15794(byte arg0) {
		if (this.field9943 == arg0) {
			return;
		}
		this.field9943 = arg0;
		if (arg0 == 0) {
			this.method15759(2);
			this.method15791(1);
		} else {
			this.method15759(3);
			this.method15791(3);
		}
		this.method15839();
	}

	@ObfuscatedName("afa.c()I")
	public final int method2520() {
		return this.field9880 + this.field9879 + this.field9881;
	}

	@ObfuscatedName("afa.d(I)V")
	public final synchronized void method2120(int arg0) {
		int var2 = 0;
		int var3 = arg0 & Integer.MAX_VALUE;
		while (!this.field9883.method14164()) {
			class988 var4 = (class988) this.field9883.method14154();
			field9890[var2++] = (int) var4.field6760;
			this.field9880 -= var4.field11442;
			if (var2 == 1000) {
				OpenGL.glDeleteBuffersARB(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteBuffersARB(var2, field9890, 0);
			var2 = 0;
		}
		while (!this.field9884.method14164()) {
			class988 var5 = (class988) this.field9884.method14154();
			field9890[var2++] = (int) var5.field6760;
			this.field9879 -= var5.field11442;
			if (var2 == 1000) {
				OpenGL.glDeleteTextures(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteTextures(var2, field9890, 0);
			var2 = 0;
		}
		while (!this.field9885.method14164()) {
			class988 var6 = (class988) this.field9885.method14154();
			field9890[var2++] = var6.field11442;
			if (var2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(var2, field9890, 0);
			var2 = 0;
		}
		while (!this.field9886.method14164()) {
			class988 var7 = (class988) this.field9886.method14154();
			field9890[var2++] = (int) var7.field6760;
			this.field9881 -= var7.field11442;
			if (var2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(var2, field9890, 0);
			boolean var8 = false;
		}
		while (!this.field9938.method14164()) {
			class988 var9 = (class988) this.field9938.method14154();
			OpenGL.glDeleteLists((int) var9.field6760, var9.field11442);
		}
		while (!this.field9838.method14164()) {
			Node var10 = this.field9838.method14154();
			OpenGL.glDeleteProgramARB((int) var10.field6760);
		}
		while (!this.field9888.method14164()) {
			Node var11 = this.field9888.method14154();
			OpenGL.glDeleteShader((int) var11.field6760);
		}
		while (!this.field9938.method14164()) {
			class988 var12 = (class988) this.field9938.method14154();
			OpenGL.glDeleteLists((int) var12.field6760, var12.field11442);
		}
		this.field10026.method1402();
		if (this.method2520() > 100663296 && MonotonicTime.method3655() > this.field9823 + 60000L) {
			System.gc();
			this.field9823 = MonotonicTime.method3655();
		}
		this.field9872 = var3;
	}

	@ObfuscatedName("afa.uf(II)V")
	public final synchronized void method15870(int arg0, int arg1) {
		class988 var3 = new class988(arg1);
		var3.field6760 = arg0;
		this.field9883.method14153(var3);
	}

	@ObfuscatedName("afa.uz(II)V")
	public final synchronized void method15822(int arg0, int arg1) {
		class988 var3 = new class988(arg1);
		var3.field6760 = arg0;
		this.field9884.method14153(var3);
	}

	@ObfuscatedName("afa.ug(I)V")
	public final synchronized void method15802(int arg0) {
		class988 var2 = new class988(arg0);
		this.field9885.method14153(var2);
	}

	@ObfuscatedName("afa.ub(II)V")
	public final synchronized void method15796(int arg0, int arg1) {
		class988 var3 = new class988(arg1);
		var3.field6760 = arg0;
		this.field9886.method14153(var3);
	}

	@ObfuscatedName("afa.uj(J)V")
	public final synchronized void method15816(long arg0) {
		Node var3 = new Node();
		var3.field6760 = arg0;
		this.field9888.method14153(var3);
	}

	@ObfuscatedName("afa.ut(I)V")
	public final synchronized void method15797(int arg0) {
		Node var2 = new Node();
		var2.field6760 = arg0;
		this.field9838.method14153(var2);
	}

	@ObfuscatedName("afa.uk(I)V")
	public void method15798(int arg0) {
		this.field9940 = arg0;
		if (this.field9940 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.field9940 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.field9940 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@ObfuscatedName("afa.uy(Lck;)I")
	public static int method15899(TextureFormat arg0) {
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

	@ObfuscatedName("afa.uv(Lck;Ldg;)I")
	public static int method15799(TextureFormat arg0, DataType arg1) {
		if (DataType.field1645 == arg1) {
			switch(arg0.field1278) {
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
			}
		} else if (DataType.field1646 == arg1) {
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
		} else if (DataType.field1649 == arg1) {
			switch(arg0.field1278) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (DataType.field1647 == arg1) {
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
		} else if (DataType.field1642 == arg1) {
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

	@ObfuscatedName("afa.eh(Z)V")
	public void method2253(boolean arg0) {
	}
}
