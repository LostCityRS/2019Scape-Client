package com.jagex;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqv")
public final class Class104_Sub2_Sub2 extends Class104_Sub2 {

	@OriginalMember(owner = "client!aqv", name = "id", descriptor = "I")
	static final int anInt2962 = 3;

	@OriginalMember(owner = "client!aqv", name = "he", descriptor = "J")
	long aLong133;

	@OriginalMember(owner = "client!aqv", name = "hi", descriptor = "Z")
	boolean aBoolean487;

	@OriginalMember(owner = "client!aqv", name = "hw", descriptor = "Z")
	boolean aBoolean488;

	@OriginalMember(owner = "client!aqv", name = "ht", descriptor = "Z")
	boolean aBoolean489;

	@OriginalMember(owner = "client!aqv", name = "hz", descriptor = "Lclient!agl;")
	Class116_Sub1 aClass116_Sub1_2;

	@OriginalMember(owner = "client!aqv", name = "il", descriptor = "Z")
	boolean aBoolean497;

	@OriginalMember(owner = "client!aqv", name = "hj", descriptor = "Lclient!aid;")
	Class139_Sub1 aClass139_Sub1_1;

	@OriginalMember(owner = "client!aqv", name = "hc", descriptor = "I")
	int anInt2965;

	@OriginalMember(owner = "client!aqv", name = "hq", descriptor = "Lclient!aat;")
	Class22 aClass22_39 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hf", descriptor = "Lclient!aat;")
	Class22 aClass22_35 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hr", descriptor = "Lclient!aat;")
	Class22 aClass22_40 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hs", descriptor = "Lclient!aat;")
	Class22 aClass22_41 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hh", descriptor = "Lclient!aat;")
	Class22 aClass22_36 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hp", descriptor = "Lclient!aat;")
	Class22 aClass22_37 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hy", descriptor = "Lclient!aat;")
	Class22 aClass22_38 = new Class22();

	@OriginalMember(owner = "client!aqv", name = "hn", descriptor = "[I")
	final int[] anIntArray252 = new int[1000];

	@OriginalMember(owner = "client!aqv", name = "ho", descriptor = "[Lclient!aix;")
	Class139_Sub2[] aClass139_Sub2Array1 = new Class139_Sub2[16];

	@OriginalMember(owner = "client!aqv", name = "iw", descriptor = "[F")
	final float[] aFloatArray65;

	@OriginalMember(owner = "client!aqv", name = "ip", descriptor = "[F")
	final float[] aFloatArray66;

	@OriginalMember(owner = "client!aqv", name = "ia", descriptor = "Lclient!cm;")
	Class100 aClass100_34;

	@OriginalMember(owner = "client!aqv", name = "if", descriptor = "Lclient!cm;")
	Class100 aClass100_35;

	@OriginalMember(owner = "client!aqv", name = "ih", descriptor = "Lclient!afq;")
	Class112_Sub1 aClass112_Sub1_3;

	@OriginalMember(owner = "client!aqv", name = "iy", descriptor = "[I")
	int[] anIntArray254;

	@OriginalMember(owner = "client!aqv", name = "ii", descriptor = "[J")
	long[] aLongArray16;

	@OriginalMember(owner = "client!aqv", name = "iz", descriptor = "[I")
	int[] anIntArray255;

	@OriginalMember(owner = "client!aqv", name = "ik", descriptor = "I")
	int anInt2964;

	@OriginalMember(owner = "client!aqv", name = "im", descriptor = "I")
	int anInt2961;

	@OriginalMember(owner = "client!aqv", name = "hx", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL3;

	@OriginalMember(owner = "client!aqv", name = "io", descriptor = "Ljava/lang/String;")
	final String aString88;

	@OriginalMember(owner = "client!aqv", name = "iq", descriptor = "Ljava/lang/String;")
	final String aString87;

	@OriginalMember(owner = "client!aqv", name = "ig", descriptor = "I")
	final int anInt2960;

	@OriginalMember(owner = "client!aqv", name = "iv", descriptor = "Z")
	boolean aBoolean490;

	@OriginalMember(owner = "client!aqv", name = "ie", descriptor = "Z")
	boolean aBoolean486;

	@OriginalMember(owner = "client!aqv", name = "iu", descriptor = "Z")
	boolean aBoolean492;

	@OriginalMember(owner = "client!aqv", name = "in", descriptor = "Z")
	final boolean aBoolean498;

	@OriginalMember(owner = "client!aqv", name = "ir", descriptor = "Z")
	final boolean aBoolean493;

	@OriginalMember(owner = "client!aqv", name = "it", descriptor = "Z")
	final boolean aBoolean494;

	@OriginalMember(owner = "client!aqv", name = "ix", descriptor = "Z")
	final boolean aBoolean495;

	@OriginalMember(owner = "client!aqv", name = "ib", descriptor = "Z")
	boolean aBoolean496;

	@OriginalMember(owner = "client!aqv", name = "hv", descriptor = "[I")
	int[] anIntArray253;

	@OriginalMember(owner = "client!aqv", name = "is", descriptor = "I")
	final int anInt2963;

	@OriginalMember(owner = "client!aqv", name = "ij", descriptor = "Z")
	boolean aBoolean491;

	@OriginalMember(owner = "client!aqv", name = "ahu", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method21298(@OriginalArg(0) String arg0) {
		return this.method20901("gl", arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "air", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method21299(@OriginalArg(0) String arg0) {
		return this.method20901("gl", arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "rc", descriptor = "(Ljava/lang/String;)Lclient!ho;", line = 81)
	@Override
	public Class115 method21124(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method21298(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20904(local3);
			return new Class115_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "xi", descriptor = "(Ljava/lang/String;)Lclient!ho;", line = 81)
	@Override
	public Class115 method21184(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method21298(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20904(local3);
			return new Class115_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!ho;", line = 81)
	@Override
	public Class115 method21200(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method21298(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20904(local3);
			return new Class115_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "rx", descriptor = "()Z", line = 88)
	@Override
	public boolean method21120() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!aqv", name = "wt", descriptor = "()Z", line = 88)
	@Override
	public boolean method21186() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!aqv", name = "wx", descriptor = "()Z", line = 92)
	@Override
	public boolean method21193() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqv", name = "ww", descriptor = "()Z", line = 92)
	@Override
	public boolean method21196() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqv", name = "wh", descriptor = "()Z", line = 92)
	@Override
	public boolean method21194() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqv", name = "ws", descriptor = "()Z", line = 92)
	@Override
	public boolean method21224() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqv", name = "wd", descriptor = "()Z", line = 92)
	@Override
	public boolean method21195() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqv", name = "ry", descriptor = "()Z", line = 92)
	@Override
	public boolean method21121() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqv", name = "xy", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method21199(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "rg", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method21122(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "xm", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method21173(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "wy", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method21134(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "xl", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method21183(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "wi", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method21197(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)V", line = 101)
	Class104_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class225 arg3, @OriginalArg(4) Interface24 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Interface46 arg6, @OriginalArg(7) Interface47 arg7, @OriginalArg(8) Class497 arg8, @OriginalArg(9) int arg9) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, 1);
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray65 = new float[4];
		this.aFloatArray66 = new float[16];
		this.aClass100_34 = null;
		this.aClass100_35 = null;
		this.aClass112_Sub1_3 = null;
		this.anIntArray254 = new int[3];
		this.aLongArray16 = new long[3];
		this.anIntArray255 = new int[3];
		this.anInt2964 = 0;
		this.anInt2961 = 0;
		@Pc(98) int[] local98 = new int[1];
		try {
			this.anOpenGL3 = arg0;
			this.anOpenGL3.method27726();
			this.aString88 = OpenGL.glGetString(7936).toLowerCase();
			this.aString87 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString88.indexOf("microsoft") != -1 || this.aString88.indexOf("brian paul") != -1 || this.aString88.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(141) String local141 = OpenGL.glGetString(7938);
			@Pc(149) String[] local149 = client.method24953(local141.replace('.', ' '), ' ', 1726146343);
			if (local149.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(159) int local159;
			try {
				local159 = Class616.method32090(local149[0], (byte) 8);
				@Pc(165) int local165 = Class616.method32090(local149[1], (byte) 8);
				this.anInt2960 = local159 * 10 + local165;
			} catch (@Pc(174) NumberFormatException local174) {
				throw new RuntimeException("");
			}
			if (this.anInt2960 < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, local98, 0);
			this.anInt2954 = local98[0];
			if (this.anInt2954 < 2) {
				throw new RuntimeException("");
			}
			this.anInt2920 = 8;
			this.aBoolean490 = this.anOpenGL3.method27723("GL_ARB_vertex_buffer_object");
			this.aBoolean479 = this.anOpenGL3.method27723("GL_ARB_multisample");
			this.aBoolean460 = this.anOpenGL3.method27723("GL_EXT_blend_func_separate");
			this.aBoolean486 = this.anOpenGL3.method27723("GL_ARB_texture_rectangle");
			this.aBoolean483 = this.anOpenGL3.method27723("GL_ARB_texture_cube_map");
			this.aBoolean492 = this.anOpenGL3.method27723("GL_ARB_texture_non_power_of_two");
			this.aBoolean471 = true;
			this.aBoolean498 = this.anOpenGL3.method27723("GL_ARB_vertex_shader");
			this.aBoolean493 = this.anOpenGL3.method27723("GL_ARB_vertex_program");
			this.aBoolean494 = this.anOpenGL3.method27723("GL_ARB_fragment_shader");
			this.aBoolean495 = this.anOpenGL3.method27723("GL_ARB_fragment_program");
			this.aBoolean475 = this.anOpenGL3.method27723("GL_EXT_framebuffer_object");
			this.aBoolean469 = this.aBoolean475;
			this.aBoolean473 = this.anOpenGL3.method27723("GL_EXT_framebuffer_blit");
			this.aBoolean485 = this.anOpenGL3.method27723("GL_EXT_framebuffer_multisample");
			this.aBoolean496 = this.anUnsafe4 != null && (this.anInt2960 >= 32 || this.anOpenGL3.method27723("GL_ARB_sync"));
			this.anIntArray253 = new int[this.anInt2954];
			if (!this.method21120() || !this.method21121()) {
				if (!this.anOpenGL3.method27723("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!this.anOpenGL3.method27723("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			Class527.aString222.startsWith("mac");
			this.anInt2963 = Stream.u() ? 33639 : 5121;
			if (this.aString87.indexOf("radeon") != -1 || this.aString88.indexOf("intel") != -1) {
				local159 = 0;
				@Pc(382) boolean local382 = this.aString88.indexOf("intel") != -1;
				@Pc(384) boolean local384 = false;
				@Pc(386) boolean local386 = false;
				@Pc(395) String[] local395 = client.method24953(this.aString87.replace('/', ' '), ' ', 1593575963);
				for (@Pc(397) int local397 = 0; local397 < local395.length; local397++) {
					@Pc(405) String local405 = local395[local397];
					try {
						if (local405.length() > 0) {
							if (local405.charAt(0) == 'x' && local405.length() >= 3 && Class633.method32304(local405.substring(1, 3), 250407149)) {
								local405 = local405.substring(1);
								local386 = true;
							}
							if (local405.equals("hd")) {
								local384 = true;
							} else {
								if (local405.startsWith("hd")) {
									local405 = local405.substring(2);
									local384 = true;
								}
								if (local405.length() >= 4 && Class633.method32304(local405.substring(0, 4), 250407149)) {
									local159 = Class616.method32090(local405.substring(0, 4), (byte) 8);
									break;
								}
							}
						}
					} catch (@Pc(469) Exception local469) {
					}
				}
				if (!local382) {
					if (!local386 && !local384) {
						if (local159 >= 7000 && local159 <= 7999) {
							this.aBoolean490 = false;
						}
						if (local159 >= 7000 && local159 <= 9250) {
							this.aBoolean471 = false;
						}
					}
					this.aBoolean486 &= this.anOpenGL3.method27723("GL_ARB_half_float_pixel");
					this.aBoolean491 = true;
				} else if (!local384) {
					this.aBoolean475 = false;
				}
			}
			if (!this.aBoolean490) {
				throw new RuntimeException("");
			}
			try {
				@Pc(519) int[] local519 = new int[1];
				OpenGL.glGenBuffersARB(1, local519, 0);
			} catch (@Pc(525) Throwable local525) {
				throw new RuntimeException("");
			}
			this.method20442(arg1, new Class112_Sub2_Sub1_Sub2(this, arg1, arg2), (byte) 0);
			this.method20446(arg1, (byte) 14);
			this.method20954(32768, false);
			this.method20954(32768, false);
		} catch (@Pc(561) Throwable local561) {
			local561.printStackTrace();
			this.method20429(33210355);
			if (local561 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local561;
			}
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aqv", name = "xt", descriptor = "()V", line = 217)
	@Override
	void method20915() {
		OpenGL.glDepthFunc(515);
		this.method21309();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean479) {
			this.method21255(this.anInt2951 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2954 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
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
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method20916();
	}

	@OriginalMember(owner = "client!aqv", name = "sw", descriptor = "()V", line = 217)
	@Override
	void method20916() {
		OpenGL.glDepthFunc(515);
		this.method21309();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean479) {
			this.method21255(this.anInt2951 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2954 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
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
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method20916();
	}

	@OriginalMember(owner = "client!aqv", name = "f", descriptor = "()Lclient!cz;", line = 255)
	@Override
	public Class219 method20644() {
		@Pc(1) int local1 = -1;
		if (this.aString88.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString88.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString88.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class219(local1, this.method20892() ? "OpenGL FF" : "OpenGL", this.anInt2960, this.aString87, 0L, this.method20892());
	}

	@OriginalMember(owner = "client!aqv", name = "eq", descriptor = "()Lclient!cz;", line = 255)
	@Override
	public Class219 method20629() {
		@Pc(1) int local1 = -1;
		if (this.aString88.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString88.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString88.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class219(local1, this.method20892() ? "OpenGL FF" : "OpenGL", this.anInt2960, this.aString87, 0L, this.method20892());
	}

	@OriginalMember(owner = "client!aqv", name = "l", descriptor = "(II)V", line = 263)
	@Override
	void method20528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		this.aClass112_Sub2_6.method23756();
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6778((byte) -3);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "eg", descriptor = "(II)V", line = 263)
	@Override
	void method20837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		this.aClass112_Sub2_6.method23756();
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6778((byte) -24);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ez", descriptor = "(II)V", line = 263)
	@Override
	void method20658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		this.aClass112_Sub2_6.method23756();
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6778((byte) -85);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "u", descriptor = "()V", line = 268)
	@Override
	public void method20529() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqv", name = "et", descriptor = "()V", line = 268)
	@Override
	public void method20632() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqv", name = "ef", descriptor = "()V", line = 268)
	@Override
	public void method20631() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqv", name = "p", descriptor = "()V", line = 272)
	@Override
	void method20735() {
		super.method20735();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27729();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "er", descriptor = "()V", line = 272)
	@Override
	void method20815() {
		super.method20735();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27729();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ea", descriptor = "()V", line = 272)
	@Override
	void method20633() {
		super.method20735();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27729();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ew", descriptor = "()V", line = 272)
	@Override
	void method20634() {
		super.method20735();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27729();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "sr", descriptor = "()F", line = 281)
	@Override
	public float method21118() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!aqv", name = "yx", descriptor = "()F", line = 281)
	@Override
	public float method21206() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!aqv", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;", line = 285)
	@Override
	Class112_Sub2 method20547(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "gq", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;", line = 285)
	@Override
	Class112_Sub2 method20664(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "am", descriptor = "()Lclient!afq;", line = 289)
	@Override
	public Class112_Sub1 method20548() {
		return new Class112_Sub1_Sub3_Sub1(this);
	}

	@OriginalMember(owner = "client!aqv", name = "ng", descriptor = "()Lclient!afq;", line = 289)
	@Override
	public Class112_Sub1 method20839() {
		return new Class112_Sub1_Sub3_Sub1(this);
	}

	@OriginalMember(owner = "client!aqv", name = "nt", descriptor = "()Lclient!afq;", line = 289)
	@Override
	public Class112_Sub1 method20840() {
		return new Class112_Sub1_Sub3_Sub1(this);
	}

	@OriginalMember(owner = "client!aqv", name = "au", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;", line = 293)
	@Override
	public Interface18 method20549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class540(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqv", name = "nn", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;", line = 293)
	@Override
	public Interface18 method20879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class540(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqv", name = "ar", descriptor = "(II)Lclient!dw;", line = 297)
	@Override
	public Interface19 method20532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class540(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1);
	}

	@OriginalMember(owner = "client!aqv", name = "nk", descriptor = "(II)Lclient!dw;", line = 297)
	@Override
	public Interface19 method20744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class540(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1);
	}

	@OriginalMember(owner = "client!aqv", name = "ap", descriptor = "(III)Lclient!dw;", line = 301)
	@Override
	public Interface19 method20723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class540(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqv", name = "nq", descriptor = "(III)Lclient!dw;", line = 301)
	@Override
	public Interface19 method20843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class540(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqv", name = "aq", descriptor = "(IIII)[I", line = 305)
	@Override
	public int[] method20552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass112_6.method23738();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2963, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqv", name = "gl", descriptor = "(IIII)[I", line = 305)
	@Override
	public int[] method20665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass112_6.method23738();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2963, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqv", name = "go", descriptor = "()V", line = 314)
	@Override
	public void method20666() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass112_6.method23737();
		@Pc(11) int local11 = this.aClass112_6.method23738();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2925;
		@Pc(22) int local22 = this.anInt2926;
		@Pc(25) int local25 = this.anInt2927;
		@Pc(28) int local28 = this.anInt2928;
		this.method20637();
		@Pc(33) int local33 = this.anInt2921;
		@Pc(36) int local36 = this.anInt2958;
		@Pc(39) int local39 = this.anInt2940;
		@Pc(42) int local42 = this.anInt2930;
		this.method20568();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20995();
		this.method21094(false);
		this.method21031(false);
		this.method21020(false);
		this.method21028(false);
		this.method21061(null);
		this.method21064(1);
		this.method21087(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20569(local33, local39, local36, local42);
		this.method20566(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqv", name = "gk", descriptor = "()V", line = 314)
	@Override
	public void method20756() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass112_6.method23737();
		@Pc(11) int local11 = this.aClass112_6.method23738();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2925;
		@Pc(22) int local22 = this.anInt2926;
		@Pc(25) int local25 = this.anInt2927;
		@Pc(28) int local28 = this.anInt2928;
		this.method20637();
		@Pc(33) int local33 = this.anInt2921;
		@Pc(36) int local36 = this.anInt2958;
		@Pc(39) int local39 = this.anInt2940;
		@Pc(42) int local42 = this.anInt2930;
		this.method20568();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20995();
		this.method21094(false);
		this.method21031(false);
		this.method21020(false);
		this.method21028(false);
		this.method21061(null);
		this.method21064(1);
		this.method21087(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20569(local33, local39, local36, local42);
		this.method20566(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqv", name = "gp", descriptor = "()V", line = 314)
	@Override
	public void method20654() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass112_6.method23737();
		@Pc(11) int local11 = this.aClass112_6.method23738();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2925;
		@Pc(22) int local22 = this.anInt2926;
		@Pc(25) int local25 = this.anInt2927;
		@Pc(28) int local28 = this.anInt2928;
		this.method20637();
		@Pc(33) int local33 = this.anInt2921;
		@Pc(36) int local36 = this.anInt2958;
		@Pc(39) int local39 = this.anInt2940;
		@Pc(42) int local42 = this.anInt2930;
		this.method20568();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20995();
		this.method21094(false);
		this.method21031(false);
		this.method21020(false);
		this.method21028(false);
		this.method21061(null);
		this.method21064(1);
		this.method21087(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20569(local33, local39, local36, local42);
		this.method20566(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqv", name = "gy", descriptor = "()V", line = 314)
	@Override
	public void method20669() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass112_6.method23737();
		@Pc(11) int local11 = this.aClass112_6.method23738();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2925;
		@Pc(22) int local22 = this.anInt2926;
		@Pc(25) int local25 = this.anInt2927;
		@Pc(28) int local28 = this.anInt2928;
		this.method20637();
		@Pc(33) int local33 = this.anInt2921;
		@Pc(36) int local36 = this.anInt2958;
		@Pc(39) int local39 = this.anInt2940;
		@Pc(42) int local42 = this.anInt2930;
		this.method20568();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20995();
		this.method21094(false);
		this.method21031(false);
		this.method21020(false);
		this.method21028(false);
		this.method21061(null);
		this.method21064(1);
		this.method21087(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20569(local33, local39, local36, local42);
		this.method20566(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqv", name = "ax", descriptor = "()V", line = 314)
	@Override
	public void method20553() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass112_6.method23737();
		@Pc(11) int local11 = this.aClass112_6.method23738();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2925;
		@Pc(22) int local22 = this.anInt2926;
		@Pc(25) int local25 = this.anInt2927;
		@Pc(28) int local28 = this.anInt2928;
		this.method20637();
		@Pc(33) int local33 = this.anInt2921;
		@Pc(36) int local36 = this.anInt2958;
		@Pc(39) int local39 = this.anInt2940;
		@Pc(42) int local42 = this.anInt2930;
		this.method20568();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20995();
		this.method21094(false);
		this.method21031(false);
		this.method21020(false);
		this.method21028(false);
		this.method21061(null);
		this.method21064(1);
		this.method21087(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20569(local33, local39, local36, local42);
		this.method20566(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqv", name = "av", descriptor = "()Z", line = 355)
	@Override
	public boolean method20727() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqv", name = "gc", descriptor = "()Z", line = 355)
	@Override
	public boolean method20842() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqv", name = "gf", descriptor = "()Z", line = 355)
	@Override
	public boolean method20807() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqv", name = "ao", descriptor = "()Z", line = 359)
	@Override
	public boolean method20586() {
		return !this.aBoolean496 || this.aLongArray16[this.anInt2961] == 0L;
	}

	@OriginalMember(owner = "client!aqv", name = "gx", descriptor = "()Z", line = 359)
	@Override
	public boolean method20670() {
		return !this.aBoolean496 || this.aLongArray16[this.anInt2961] == 0L;
	}

	@OriginalMember(owner = "client!aqv", name = "gg", descriptor = "()Z", line = 359)
	@Override
	public boolean method20616() {
		return !this.aBoolean496 || this.aLongArray16[this.anInt2961] == 0L;
	}

	@OriginalMember(owner = "client!aqv", name = "ge", descriptor = "()Z", line = 359)
	@Override
	public boolean method20671() {
		return !this.aBoolean496 || this.aLongArray16[this.anInt2961] == 0L;
	}

	@OriginalMember(owner = "client!aqv", name = "gr", descriptor = "()Z", line = 359)
	@Override
	public boolean method20673() {
		return !this.aBoolean496 || this.aLongArray16[this.anInt2961] == 0L;
	}

	@OriginalMember(owner = "client!aqv", name = "aj", descriptor = "()Z", line = 368)
	@Override
	public boolean method20555() {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "gs", descriptor = "()Z", line = 368)
	@Override
	public boolean method20881() {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "gt", descriptor = "()Z", line = 368)
	@Override
	public boolean method20675() {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "gh", descriptor = "()Z", line = 368)
	@Override
	public boolean method20676() {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "ay", descriptor = "()Z", line = 372)
	@Override
	public boolean method20672() {
		return false;
	}

	@OriginalMember(owner = "client!aqv", name = "gv", descriptor = "()Z", line = 372)
	@Override
	public boolean method20543() {
		return false;
	}

	@OriginalMember(owner = "client!aqv", name = "gm", descriptor = "()Z", line = 372)
	@Override
	public boolean method20677() {
		return false;
	}

	@OriginalMember(owner = "client!aqv", name = "ab", descriptor = "()I", line = 376)
	@Override
	public int method20854() {
		if (!this.aBoolean496) {
			return -1;
		} else if (this.aLongArray16[this.anInt2964] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray16[this.anInt2964], 0, 0);
			if (local21 == 37149) {
				this.method20558();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray255[this.anInt2964];
			}
		}
	}

	@OriginalMember(owner = "client!aqv", name = "gw", descriptor = "()I", line = 376)
	@Override
	public int method20719() {
		if (!this.aBoolean496) {
			return -1;
		} else if (this.aLongArray16[this.anInt2964] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray16[this.anInt2964], 0, 0);
			if (local21 == 37149) {
				this.method20558();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray255[this.anInt2964];
			}
		}
	}

	@OriginalMember(owner = "client!aqv", name = "gj", descriptor = "()I", line = 376)
	@Override
	public int method20830() {
		if (!this.aBoolean496) {
			return -1;
		} else if (this.aLongArray16[this.anInt2964] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray16[this.anInt2964], 0, 0);
			if (local21 == 37149) {
				this.method20558();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray255[this.anInt2964];
			}
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aa", descriptor = "(III)V", line = 389)
	@Override
	public void method20565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20492();
		if (this.aClass112_Sub1_3 == null) {
			this.method21301(arg1, arg2);
		}
		if (this.aClass100_34 == null) {
			this.aClass100_34 = this.method20682(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), false);
		} else {
			this.aClass100_34.method18196(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), 0, 0);
		}
		this.method20453(this.aClass112_Sub1_3, (byte) 1);
		this.method20829(1, -16777216);
		this.aClass100_34.method18162(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
		OpenGL.glBindBufferARB(35051, this.anIntArray254[this.anInt2961]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2900 * 106932625, this.anInt2882 * -28194907, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20456(this.aClass112_Sub1_3, -1497248091);
		this.aLongArray16[this.anInt2961] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray255[this.anInt2961] = arg0;
		if (++this.anInt2961 >= 3) {
			this.anInt2961 = 0;
		}
		this.method20497();
	}

	@OriginalMember(owner = "client!aqv", name = "gd", descriptor = "(III)V", line = 389)
	@Override
	public void method20681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20492();
		if (this.aClass112_Sub1_3 == null) {
			this.method21301(arg1, arg2);
		}
		if (this.aClass100_34 == null) {
			this.aClass100_34 = this.method20682(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), false);
		} else {
			this.aClass100_34.method18196(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), 0, 0);
		}
		this.method20453(this.aClass112_Sub1_3, (byte) 1);
		this.method20829(1, -16777216);
		this.aClass100_34.method18162(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
		OpenGL.glBindBufferARB(35051, this.anIntArray254[this.anInt2961]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2900 * 106932625, this.anInt2882 * -28194907, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20456(this.aClass112_Sub1_3, -1497248091);
		this.aLongArray16[this.anInt2961] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray255[this.anInt2961] = arg0;
		if (++this.anInt2961 >= 3) {
			this.anInt2961 = 0;
		}
		this.method20497();
	}

	@OriginalMember(owner = "client!aqv", name = "gz", descriptor = "(III)V", line = 389)
	@Override
	public void method20752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20492();
		if (this.aClass112_Sub1_3 == null) {
			this.method21301(arg1, arg2);
		}
		if (this.aClass100_34 == null) {
			this.aClass100_34 = this.method20682(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), false);
		} else {
			this.aClass100_34.method18196(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), 0, 0);
		}
		this.method20453(this.aClass112_Sub1_3, (byte) 1);
		this.method20829(1, -16777216);
		this.aClass100_34.method18162(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
		OpenGL.glBindBufferARB(35051, this.anIntArray254[this.anInt2961]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2900 * 106932625, this.anInt2882 * -28194907, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20456(this.aClass112_Sub1_3, -1497248091);
		this.aLongArray16[this.anInt2961] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray255[this.anInt2961] = arg0;
		if (++this.anInt2961 >= 3) {
			this.anInt2961 = 0;
		}
		this.method20497();
	}

	@OriginalMember(owner = "client!aqv", name = "az", descriptor = "()V", line = 407)
	@Override
	public void method20558() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "hm", descriptor = "()V", line = 407)
	@Override
	public void method20685() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "gb", descriptor = "()V", line = 407)
	@Override
	public void method20683() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "gi", descriptor = "()V", line = 407)
	@Override
	public void method20684() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "af", descriptor = "(II)J", line = 418)
	@Override
	public long method20560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21300(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqv", name = "ha", descriptor = "(II)J", line = 418)
	@Override
	public long method20853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21300(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqv", name = "hk", descriptor = "(II)J", line = 418)
	@Override
	public long method20577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21300(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqv", name = "hu", descriptor = "(II)J", line = 418)
	@Override
	public long method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21300(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqv", name = "an", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21300(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "hx", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21300(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "hq", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21300(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "ahz", descriptor = "(II[I[I)J", line = 426)
	long method21300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean496) {
			if (this.aClass100_35 == null) {
				this.method21301(arg0, arg1);
			}
			if (this.aClass100_34 == null) {
				this.aClass100_34 = this.method20682(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), false);
			} else {
				this.aClass100_34.method18196(0, 0, this.aClass112_6.method23737(), this.aClass112_6.method23738(), 0, 0);
			}
			this.method20453(this.aClass112_Sub1_3, (byte) 1);
			this.method20829(1, -16777216);
			this.aClass100_34.method18162(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
			this.aClass100_35.method18219(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20456(this.aClass112_Sub1_3, -1497248091);
			return 0L;
		}
		if (this.aLongArray16[this.anInt2964] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray16[this.anInt2964]);
			this.aLongArray16[this.anInt2964] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray254[this.anInt2964]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (@Pc(37) int local37 = 0; local37 < arg0 * arg1; local37++) {
				arg2[local37] = this.anUnsafe4.getInt(local33 + (long) (local37 * 4));
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt2964 >= 3) {
			this.anInt2964 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aqv", name = "ak", descriptor = "(J)V", line = 457)
	@Override
	public void method20561(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "hg", descriptor = "(J)V", line = 457)
	@Override
	public void method20690(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "hb", descriptor = "(J)V", line = 457)
	@Override
	public void method20689(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "hd", descriptor = "(J)V", line = 457)
	@Override
	public void method20691(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "bl", descriptor = "()V", line = 463)
	@Override
	public void method20536() {
		if (this.aBoolean496) {
			this.aClass100_34 = null;
			if (this.aClass112_Sub1_3 != null) {
				this.aClass112_Sub1_3.method23739();
				this.aClass112_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray254, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray254[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass112_Sub1_3 = null;
			this.aClass100_35 = null;
			this.aClass100_34 = null;
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "hf", descriptor = "()V", line = 463)
	@Override
	public void method20848() {
		if (this.aBoolean496) {
			this.aClass100_34 = null;
			if (this.aClass112_Sub1_3 != null) {
				this.aClass112_Sub1_3.method23739();
				this.aClass112_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray254, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray254[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass112_Sub1_3 = null;
			this.aClass100_35 = null;
			this.aClass100_34 = null;
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "hr", descriptor = "()V", line = 463)
	@Override
	public void method20695() {
		if (this.aBoolean496) {
			this.aClass100_34 = null;
			if (this.aClass112_Sub1_3 != null) {
				this.aClass112_Sub1_3.method23739();
				this.aClass112_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray254, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray254[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass112_Sub1_3 = null;
			this.aClass100_35 = null;
			this.aClass100_34 = null;
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "hs", descriptor = "()V", line = 463)
	@Override
	public void method20696() {
		if (this.aBoolean496) {
			this.aClass100_34 = null;
			if (this.aClass112_Sub1_3 != null) {
				this.aClass112_Sub1_3.method23739();
				this.aClass112_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray254, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray254[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass112_Sub1_3 = null;
			this.aClass100_35 = null;
			this.aClass100_34 = null;
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "hh", descriptor = "()V", line = 463)
	@Override
	public void method20564() {
		if (this.aBoolean496) {
			this.aClass100_34 = null;
			if (this.aClass112_Sub1_3 != null) {
				this.aClass112_Sub1_3.method23739();
				this.aClass112_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray254, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray254[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass112_Sub1_3 = null;
			this.aClass100_35 = null;
			this.aClass100_34 = null;
		}
		this.anInt2961 = 0;
		this.anInt2964 = 0;
	}

	@OriginalMember(owner = "client!aqv", name = "aha", descriptor = "(II)V", line = 488)
	void method21301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20536();
		this.method20457(arg0, arg1, (byte) 0);
		if (!this.aBoolean496) {
			this.aClass100_35 = this.method20587(arg0, arg1, false, true);
			this.aClass112_Sub1_3 = this.method20548();
			this.aClass112_Sub1_3.method23435(0, this.aClass100_35.method18194());
			return;
		}
		this.aClass100_35 = this.method20587(arg0, arg1, false, true);
		this.aClass112_Sub1_3 = this.method20548();
		this.aClass112_Sub1_3.method23435(0, this.aClass100_35.method18194());
		OpenGL.glGenBuffersARB(3, this.anIntArray254, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray254[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aix", descriptor = "(II)V", line = 488)
	void method21302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20536();
		this.method20457(arg0, arg1, (byte) 0);
		if (!this.aBoolean496) {
			this.aClass100_35 = this.method20587(arg0, arg1, false, true);
			this.aClass112_Sub1_3 = this.method20548();
			this.aClass112_Sub1_3.method23435(0, this.aClass100_35.method18194());
			return;
		}
		this.aClass100_35 = this.method20587(arg0, arg1, false, true);
		this.aClass112_Sub1_3 = this.method20548();
		this.aClass112_Sub1_3.method23435(0, this.aClass100_35.method18194());
		OpenGL.glGenBuffersARB(3, this.anIntArray254, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray254[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "dl", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 509)
	@Override
	public Class107 method20792(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "lj", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 509)
	@Override
	public Class107 method20796(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "lw", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 509)
	@Override
	public Class107 method20544(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "lz", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 509)
	@Override
	public Class107 method20798(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "bm", descriptor = "(II)V", line = 513)
	@Override
	public void method20829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method21028(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aqv", name = "ir", descriptor = "(II)V", line = 513)
	@Override
	public void method20717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method21028(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aqv", name = "sa", descriptor = "()V", line = 527)
	@Override
	void method21131() {
		if (this.aClass112_6 != null) {
			OpenGL.glViewport(this.anInt2929 + this.anInt2925, this.anInt2939 + this.aClass112_6.method23738() - this.anInt2926 - this.anInt2928, this.anInt2927, this.anInt2928);
		}
		OpenGL.glDepthRange(this.aFloat204, this.aFloat205);
	}

	@OriginalMember(owner = "client!aqv", name = "zv", descriptor = "()V", line = 527)
	@Override
	void method21213() {
		if (this.aClass112_6 != null) {
			OpenGL.glViewport(this.anInt2929 + this.anInt2925, this.anInt2939 + this.aClass112_6.method23738() - this.anInt2926 - this.anInt2928, this.anInt2927, this.anInt2928);
		}
		OpenGL.glDepthRange(this.aFloat204, this.aFloat205);
	}

	@OriginalMember(owner = "client!aqv", name = "zc", descriptor = "()V", line = 527)
	@Override
	void method21123() {
		if (this.aClass112_6 != null) {
			OpenGL.glViewport(this.anInt2929 + this.anInt2925, this.anInt2939 + this.aClass112_6.method23738() - this.anInt2926 - this.anInt2928, this.anInt2927, this.anInt2928);
		}
		OpenGL.glDepthRange(this.aFloat204, this.aFloat205);
	}

	@OriginalMember(owner = "client!aqv", name = "zu", descriptor = "()V", line = 527)
	@Override
	void method21211() {
		if (this.aClass112_6 != null) {
			OpenGL.glViewport(this.anInt2929 + this.anInt2925, this.anInt2939 + this.aClass112_6.method23738() - this.anInt2926 - this.anInt2928, this.anInt2927, this.anInt2928);
		}
		OpenGL.glDepthRange(this.aFloat204, this.aFloat205);
	}

	@OriginalMember(owner = "client!aqv", name = "ze", descriptor = "()V", line = 527)
	@Override
	void method21212() {
		if (this.aClass112_6 != null) {
			OpenGL.glViewport(this.anInt2929 + this.anInt2925, this.anInt2939 + this.aClass112_6.method23738() - this.anInt2926 - this.anInt2928, this.anInt2927, this.anInt2928);
		}
		OpenGL.glDepthRange(this.aFloat204, this.aFloat205);
	}

	@OriginalMember(owner = "client!aqv", name = "sb", descriptor = "()V", line = 532)
	@Override
	void method21119() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2929 + this.anInt2921;
		@Pc(18) int local18 = this.anInt2939 + this.aClass112_6.method23738() - this.anInt2930;
		@Pc(24) int local24 = this.anInt2958 - this.anInt2921;
		@Pc(30) int local30 = this.anInt2930 - this.anInt2940;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!aqv", name = "zs", descriptor = "()V", line = 532)
	@Override
	void method21219() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2929 + this.anInt2921;
		@Pc(18) int local18 = this.anInt2939 + this.aClass112_6.method23738() - this.anInt2930;
		@Pc(24) int local24 = this.anInt2958 - this.anInt2921;
		@Pc(30) int local30 = this.anInt2930 - this.anInt2940;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!aqv", name = "zp", descriptor = "()V", line = 532)
	@Override
	void method21125() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2929 + this.anInt2921;
		@Pc(18) int local18 = this.anInt2939 + this.aClass112_6.method23738() - this.anInt2930;
		@Pc(24) int local24 = this.anInt2958 - this.anInt2921;
		@Pc(30) int local30 = this.anInt2930 - this.anInt2940;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!aqv", name = "zz", descriptor = "()V", line = 532)
	@Override
	void method21130() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2929 + this.anInt2921;
		@Pc(18) int local18 = this.anInt2939 + this.aClass112_6.method23738() - this.anInt2930;
		@Pc(24) int local24 = this.anInt2958 - this.anInt2921;
		@Pc(30) int local30 = this.anInt2930 - this.anInt2940;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!aqv", name = "sj", descriptor = "()V", line = 544)
	@Override
	void method21132() {
		if (this.aBoolean481) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "zb", descriptor = "()V", line = 544)
	@Override
	void method21275() {
		if (this.aBoolean481) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "zl", descriptor = "()V", line = 544)
	@Override
	void method21192() {
		if (this.aBoolean481) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "xs", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 549)
	@Override
	public void method21188(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass489_78.method29857(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass489_78.aFloatArray116, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "xr", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 549)
	@Override
	public void method21202(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass489_78.method29857(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass489_78.aFloatArray116, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "xc", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 549)
	@Override
	public void method21203(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass489_78.method29857(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass489_78.aFloatArray116, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "xb", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 549)
	@Override
	public void method21245(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass489_78.method29857(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass489_78.aFloatArray116, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "xe", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 549)
	@Override
	public void method21205(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass489_78.method29857(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass489_78.aFloatArray116, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "rn", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 549)
	@Override
	public void method21126(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass489_78.method29857(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass489_78.aFloatArray116, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ti", descriptor = "(Lclient!pq;)V", line = 557)
	@Override
	public void method21133(@OriginalArg(0) Class489 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray116;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!aqv", name = "aap", descriptor = "(Lclient!pq;)V", line = 557)
	@Override
	public void method21217(@OriginalArg(0) Class489 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray116;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!aqv", name = "aai", descriptor = "(Lclient!pq;)V", line = 557)
	@Override
	public void method21216(@OriginalArg(0) Class489 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray116;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!aqv", name = "abg", descriptor = "()V", line = 565)
	@Override
	void method21221() {
		if (this.aBoolean465 && this.aBoolean458) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "abn", descriptor = "()V", line = 565)
	@Override
	void method21222() {
		if (this.aBoolean465 && this.aBoolean458) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "abj", descriptor = "()V", line = 565)
	@Override
	void method21223() {
		if (this.aBoolean465 && this.aBoolean458) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aba", descriptor = "()V", line = 565)
	@Override
	void method21209() {
		if (this.aBoolean465 && this.aBoolean458) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "tp", descriptor = "()V", line = 565)
	@Override
	void method21136() {
		if (this.aBoolean465 && this.aBoolean458) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "tv", descriptor = "()V", line = 570)
	@Override
	void method21137() {
		OpenGL.glDepthMask(this.aBoolean463 && this.aBoolean464);
	}

	@OriginalMember(owner = "client!aqv", name = "ahl", descriptor = "()V", line = 570)
	@Override
	void method21295() {
		OpenGL.glDepthMask(this.aBoolean463 && this.aBoolean464);
	}

	@OriginalMember(owner = "client!aqv", name = "tg", descriptor = "()V", line = 574)
	@Override
	void method21220() {
		if (this.aBoolean466 && !this.aBoolean468) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "abm", descriptor = "()V", line = 574)
	@Override
	void method21227() {
		if (this.aBoolean466 && !this.aBoolean468) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "abp", descriptor = "()V", line = 574)
	@Override
	void method21226() {
		if (this.aBoolean466 && !this.aBoolean468) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "tq", descriptor = "()V", line = 579)
	@Override
	void method21129() {
		this.aFloatArray65[0] = this.aFloat211 * this.aFloat214;
		this.aFloatArray65[1] = this.aFloat211 * this.aFloat210;
		this.aFloatArray65[2] = this.aFloat211 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "abx", descriptor = "()V", line = 579)
	@Override
	void method21150() {
		this.aFloatArray65[0] = this.aFloat211 * this.aFloat214;
		this.aFloatArray65[1] = this.aFloat211 * this.aFloat210;
		this.aFloatArray65[2] = this.aFloat211 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "abk", descriptor = "()V", line = 587)
	@Override
	void method21228() {
		this.aFloatArray65[0] = this.aFloat212 * this.aFloat214;
		this.aFloatArray65[1] = this.aFloat212 * this.aFloat210;
		this.aFloatArray65[2] = this.aFloat212 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray65, 0);
		this.aFloatArray65[0] = -this.aFloat213 * this.aFloat214;
		this.aFloatArray65[1] = -this.aFloat213 * this.aFloat210;
		this.aFloatArray65[2] = -this.aFloat213 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "aby", descriptor = "()V", line = 587)
	@Override
	void method21229() {
		this.aFloatArray65[0] = this.aFloat212 * this.aFloat214;
		this.aFloatArray65[1] = this.aFloat212 * this.aFloat210;
		this.aFloatArray65[2] = this.aFloat212 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray65, 0);
		this.aFloatArray65[0] = -this.aFloat213 * this.aFloat214;
		this.aFloatArray65[1] = -this.aFloat213 * this.aFloat210;
		this.aFloatArray65[2] = -this.aFloat213 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "tx", descriptor = "()V", line = 587)
	@Override
	void method21140() {
		this.aFloatArray65[0] = this.aFloat212 * this.aFloat214;
		this.aFloatArray65[1] = this.aFloat212 * this.aFloat210;
		this.aFloatArray65[2] = this.aFloat212 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray65, 0);
		this.aFloatArray65[0] = -this.aFloat213 * this.aFloat214;
		this.aFloatArray65[1] = -this.aFloat213 * this.aFloat210;
		this.aFloatArray65[2] = -this.aFloat213 * this.aFloat217;
		this.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "abd", descriptor = "()V", line = 600)
	@Override
	void method21230() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "tk", descriptor = "()V", line = 600)
	@Override
	void method21259() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "abe", descriptor = "()V", line = 600)
	@Override
	void method21249() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "abt", descriptor = "()V", line = 600)
	@Override
	void method21231() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "abs", descriptor = "()V", line = 600)
	@Override
	void method21232() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "td", descriptor = "()V", line = 607)
	@Override
	void method21142() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "acm", descriptor = "()V", line = 607)
	@Override
	void method21235() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "act", descriptor = "()V", line = 607)
	@Override
	void method21236() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aci", descriptor = "()V", line = 607)
	@Override
	void method21237() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ach", descriptor = "()V", line = 607)
	@Override
	void method21238() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "acb", descriptor = "()V", line = 607)
	@Override
	void method21201() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ack", descriptor = "()V", line = 607)
	@Override
	void method21234() {
		if (this.aBoolean467) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "tl", descriptor = "()V", line = 617)
	@Override
	void method21141() {
	}

	@OriginalMember(owner = "client!aqv", name = "acd", descriptor = "()V", line = 617)
	@Override
	void method21233() {
	}

	@OriginalMember(owner = "client!aqv", name = "aca", descriptor = "()V", line = 617)
	@Override
	void method21214() {
	}

	@OriginalMember(owner = "client!aqv", name = "acu", descriptor = "()V", line = 620)
	@Override
	void method21241() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2934; local8++) {
			@Pc(17) Class93_Sub16 local17 = this.aClass93_Sub16Array19[local8];
			@Pc(21) int local21 = local17.method13532((byte) -121);
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13535(-1340332443) / 255.0F;
			this.aFloatArray65[0] = local17.method13520(-347658368);
			this.aFloatArray65[1] = local17.method13521(1655674161);
			this.aFloatArray65[2] = local17.method13524(602941408);
			this.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray65, 0);
			this.aFloatArray65[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray65[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray65[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray65, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13528((byte) -74) * local17.method13528((byte) -117)));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2933) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "um", descriptor = "()V", line = 620)
	@Override
	void method21143() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2934; local8++) {
			@Pc(17) Class93_Sub16 local17 = this.aClass93_Sub16Array19[local8];
			@Pc(21) int local21 = local17.method13532((byte) -79);
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13535(212132943) / 255.0F;
			this.aFloatArray65[0] = local17.method13520(-2046646798);
			this.aFloatArray65[1] = local17.method13521(1655674161);
			this.aFloatArray65[2] = local17.method13524(107285319);
			this.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray65, 0);
			this.aFloatArray65[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray65[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray65[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray65, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13528((byte) -8) * local17.method13528((byte) -1)));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2933) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "acg", descriptor = "()V", line = 620)
	@Override
	void method21151() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass489_75.aFloatArray116, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2934; local8++) {
			@Pc(17) Class93_Sub16 local17 = this.aClass93_Sub16Array19[local8];
			@Pc(21) int local21 = local17.method13532((byte) -40);
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13535(1687052296) / 255.0F;
			this.aFloatArray65[0] = local17.method13520(2128309524);
			this.aFloatArray65[1] = local17.method13521(1655674161);
			this.aFloatArray65[2] = local17.method13524(-137733248);
			this.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray65, 0);
			this.aFloatArray65[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray65[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray65[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray65, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13528((byte) -8) * local17.method13528((byte) -83)));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2933) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "acz", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 647)
	@Override
	boolean method21242(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "uq", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 647)
	@Override
	boolean method21144(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!aqv", name = "acp", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 651)
	@Override
	boolean method21243(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		return this.aBoolean471;
	}

	@OriginalMember(owner = "client!aqv", name = "uc", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 651)
	@Override
	boolean method21254(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		return this.aBoolean471;
	}

	@OriginalMember(owner = "client!aqv", name = "acq", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 651)
	@Override
	boolean method21244(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		return this.aBoolean471;
	}

	@OriginalMember(owner = "client!aqv", name = "acr", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 651)
	@Override
	boolean method21277(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		return this.aBoolean471;
	}

	@OriginalMember(owner = "client!aqv", name = "uz", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;", line = 655)
	@Override
	Interface38 method21145(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21175(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "ada", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;", line = 655)
	@Override
	Interface38 method21247(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21175(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "adh", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;", line = 655)
	@Override
	Interface38 method21248(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21175(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "adz", descriptor = "(IIZ[III)Lclient!lz;", line = 659)
	@Override
	Interface38 method21250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqv", name = "uj", descriptor = "(IIZ[III)Lclient!lz;", line = 659)
	@Override
	Interface38 method21148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqv", name = "adg", descriptor = "(IIZ[III)Lclient!lz;", line = 659)
	@Override
	Interface38 method21268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqv", name = "ads", descriptor = "(IIZ[III)Lclient!lz;", line = 659)
	@Override
	Interface38 method21198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqv", name = "ug", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;", line = 663)
	@Override
	Interface38 method21127(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqv", name = "adb", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;", line = 663)
	@Override
	Interface38 method21178(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqv", name = "adi", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;", line = 663)
	@Override
	Interface38 method21267(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqv", name = "ahf", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;", line = 667)
	@Override
	Interface38 method21296(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqv", name = "ub", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;", line = 667)
	@Override
	Interface38 method21147(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqv", name = "ahv", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;", line = 667)
	@Override
	Interface38 method21240(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqv", name = "adf", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;", line = 671)
	@Override
	Interface42 method21177(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "uy", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;", line = 671)
	@Override
	Interface42 method21175(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "ade", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;", line = 671)
	@Override
	Interface42 method21253(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class141_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqv", name = "ut", descriptor = "(IZ[[I)Lclient!mr;", line = 675)
	@Override
	Interface44 method21149(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class141_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqv", name = "ado", descriptor = "(IZ[[I)Lclient!mr;", line = 675)
	@Override
	Interface44 method21252(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class141_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqv", name = "adn", descriptor = "(IZ[[I)Lclient!mr;", line = 675)
	@Override
	Interface44 method21251(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class141_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqv", name = "adk", descriptor = "(IZ[[I)Lclient!mr;", line = 675)
	@Override
	Interface44 method21191(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class141_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqv", name = "uk", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;", line = 679)
	@Override
	Interface35 method21215(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class141_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqv", name = "adr", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;", line = 679)
	@Override
	Interface35 method21204(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class141_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqv", name = "ud", descriptor = "()V", line = 683)
	@Override
	public void method21176() {
		@Pc(5) int local5 = this.anIntArray253[this.anInt2949];
		if (local5 != 0) {
			this.anIntArray253[this.anInt2949] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "adq", descriptor = "()V", line = 683)
	@Override
	public void method21161() {
		@Pc(5) int local5 = this.anIntArray253[this.anInt2949];
		if (local5 != 0) {
			this.anIntArray253[this.anInt2949] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "vo", descriptor = "()V", line = 692)
	@Override
	void method21155() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass489Array5[this.anInt2949].method29940(this.aFloatArray66), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqv", name = "aef", descriptor = "()V", line = 692)
	@Override
	void method21190() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass489Array5[this.anInt2949].method29940(this.aFloatArray66), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqv", name = "aej", descriptor = "()V", line = 692)
	@Override
	void method21261() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass489Array5[this.anInt2949].method29940(this.aFloatArray66), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqv", name = "vv", descriptor = "()V", line = 701)
	@Override
	void method21156() {
		OpenGL.glActiveTexture(this.anInt2949 + 33984);
	}

	@OriginalMember(owner = "client!aqv", name = "aea", descriptor = "()V", line = 701)
	@Override
	void method21262() {
		OpenGL.glActiveTexture(this.anInt2949 + 33984);
	}

	@OriginalMember(owner = "client!aqv", name = "aed", descriptor = "()V", line = 701)
	@Override
	void method21263() {
		OpenGL.glActiveTexture(this.anInt2949 + 33984);
	}

	@OriginalMember(owner = "client!aqv", name = "aee", descriptor = "()V", line = 701)
	@Override
	void method21264() {
		OpenGL.glActiveTexture(this.anInt2949 + 33984);
	}

	@OriginalMember(owner = "client!aqv", name = "vw", descriptor = "()V", line = 705)
	@Override
	void method21239() {
		OpenGL.glTexEnvi(8960, 34161, method21303(this.aClass421Array5[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "aek", descriptor = "()V", line = 705)
	@Override
	void method21265() {
		OpenGL.glTexEnvi(8960, 34161, method21303(this.aClass421Array5[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "aem", descriptor = "()V", line = 705)
	@Override
	void method21266() {
		OpenGL.glTexEnvi(8960, 34161, method21303(this.aClass421Array5[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "aep", descriptor = "()V", line = 705)
	@Override
	void method21153() {
		OpenGL.glTexEnvi(8960, 34161, method21303(this.aClass421Array5[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "vt", descriptor = "()V", line = 709)
	@Override
	void method21157() {
		OpenGL.glTexEnvi(8960, 34162, method21303(this.aClass421Array6[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "afq", descriptor = "()V", line = 709)
	@Override
	void method21138() {
		OpenGL.glTexEnvi(8960, 34162, method21303(this.aClass421Array6[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "aeq", descriptor = "()V", line = 709)
	@Override
	void method21258() {
		OpenGL.glTexEnvi(8960, 34162, method21303(this.aClass421Array6[this.anInt2949]));
	}

	@OriginalMember(owner = "client!aqv", name = "ur", descriptor = "(ILclient!mn;ZZ)V", line = 713)
	@Override
	final void method21146(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method21306(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aen", descriptor = "(ILclient!mn;ZZ)V", line = 713)
	@Override
	final void method21256(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method21306(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aer", descriptor = "(ILclient!mn;Z)V", line = 719)
	@Override
	final void method21225(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method21306(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!aqv", name = "aes", descriptor = "(ILclient!mn;Z)V", line = 719)
	@Override
	final void method21257(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method21306(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!aqv", name = "uo", descriptor = "(ILclient!mn;Z)V", line = 719)
	@Override
	final void method21152(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method21306(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!aqv", name = "vr", descriptor = "()V", line = 724)
	@Override
	final void method21154() {
		this.aFloatArray65[0] = (float) (this.anInt2945 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray65[1] = (float) (this.anInt2945 & 0xFF00) / 65280.0F;
		this.aFloatArray65[2] = (float) (this.anInt2945 & 0xFF) / 255.0F;
		this.aFloatArray65[3] = (float) (this.anInt2945 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "aeg", descriptor = "()V", line = 724)
	@Override
	final void method21218() {
		this.aFloatArray65[0] = (float) (this.anInt2945 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray65[1] = (float) (this.anInt2945 & 0xFF00) / 65280.0F;
		this.aFloatArray65[2] = (float) (this.anInt2945 & 0xFF) / 255.0F;
		this.aFloatArray65[3] = (float) (this.anInt2945 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ael", descriptor = "()V", line = 724)
	@Override
	final void method21162() {
		this.aFloatArray65[0] = (float) (this.anInt2945 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray65[1] = (float) (this.anInt2945 & 0xFF00) / 65280.0F;
		this.aFloatArray65[2] = (float) (this.anInt2945 & 0xFF) / 255.0F;
		this.aFloatArray65[3] = (float) (this.anInt2945 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "aei", descriptor = "()V", line = 724)
	@Override
	final void method21260() {
		this.aFloatArray65[0] = (float) (this.anInt2945 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray65[1] = (float) (this.anInt2945 & 0xFF00) / 65280.0F;
		this.aFloatArray65[2] = (float) (this.anInt2945 & 0xFF) / 255.0F;
		this.aFloatArray65[3] = (float) (this.anInt2945 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ahx", descriptor = "(Lclient!mk;)I", line = 732)
	static final int method21303(@OriginalArg(0) Class421 arg0) {
		if (arg0 == Class421.aClass421_2) {
			return 7681;
		} else if (arg0 == Class421.aClass421_1) {
			return 8448;
		} else if (arg0 == Class421.aClass421_5) {
			return 34165;
		} else if (arg0 == Class421.aClass421_3) {
			return 260;
		} else if (arg0 == Class421.aClass421_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aiq", descriptor = "(Lclient!mk;)I", line = 732)
	static final int method21304(@OriginalArg(0) Class421 arg0) {
		if (arg0 == Class421.aClass421_2) {
			return 7681;
		} else if (arg0 == Class421.aClass421_1) {
			return 8448;
		} else if (arg0 == Class421.aClass421_5) {
			return 34165;
		} else if (arg0 == Class421.aClass421_3) {
			return 260;
		} else if (arg0 == Class421.aClass421_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ait", descriptor = "(Lclient!mk;)I", line = 732)
	static final int method21305(@OriginalArg(0) Class421 arg0) {
		if (arg0 == Class421.aClass421_2) {
			return 7681;
		} else if (arg0 == Class421.aClass421_1) {
			return 8448;
		} else if (arg0 == Class421.aClass421_5) {
			return 34165;
		} else if (arg0 == Class421.aClass421_3) {
			return 260;
		} else if (arg0 == Class421.aClass421_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ahb", descriptor = "(Lclient!mn;)I", line = 741)
	static final int method21306(@OriginalArg(0) Class422 arg0) {
		if (arg0 == Class422.aClass422_1) {
			return 5890;
		} else if (arg0 == Class422.aClass422_3) {
			return 34167;
		} else if (arg0 == Class422.aClass422_2) {
			return 34168;
		} else if (arg0 == Class422.aClass422_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aii", descriptor = "(Lclient!mn;)I", line = 741)
	static final int method21307(@OriginalArg(0) Class422 arg0) {
		if (arg0 == Class422.aClass422_1) {
			return 5890;
		} else if (arg0 == Class422.aClass422_3) {
			return 34167;
		} else if (arg0 == Class422.aClass422_2) {
			return 34168;
		} else if (arg0 == Class422.aClass422_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aia", descriptor = "(Lclient!mn;)I", line = 741)
	static final int method21308(@OriginalArg(0) Class422 arg0) {
		if (arg0 == Class422.aClass422_1) {
			return 5890;
		} else if (arg0 == Class422.aClass422_3) {
			return 34167;
		} else if (arg0 == Class422.aClass422_2) {
			return 34168;
		} else if (arg0 == Class422.aClass422_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqv", name = "vy", descriptor = "(I)V", line = 749)
	@Override
	void method21158(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ahk", descriptor = "(I)V", line = 749)
	@Override
	void method21185(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ahr", descriptor = "(I)V", line = 749)
	@Override
	void method21139(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ahq", descriptor = "(I)V", line = 749)
	@Override
	void method21297(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqv", name = "ve", descriptor = "()V", line = 753)
	@Override
	void method21159() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2951 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afe", descriptor = "()V", line = 753)
	@Override
	void method21269() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2951 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afm", descriptor = "()V", line = 753)
	@Override
	void method21270() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2951 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afg", descriptor = "()V", line = 753)
	@Override
	void method21271() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2951 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afa", descriptor = "()V", line = 753)
	@Override
	void method21168() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2951 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afb", descriptor = "()V", line = 763)
	@Override
	void method21273() {
		if (this.aBoolean460) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2948 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2948 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2948 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2948 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass415_3 == Class415.aClass415_7) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_6) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_5) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_4) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass415_3 == Class415.aClass415_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass415_3 == Class415.aClass415_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass415_3 == Class415.aClass415_5) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "vm", descriptor = "()V", line = 763)
	@Override
	void method21160() {
		if (this.aBoolean460) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2948 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2948 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2948 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2948 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass415_3 == Class415.aClass415_7) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_6) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_5) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_4) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass415_3 == Class415.aClass415_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass415_3 == Class415.aClass415_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass415_3 == Class415.aClass415_5) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afr", descriptor = "()V", line = 763)
	@Override
	void method21274() {
		if (this.aBoolean460) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2948 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2948 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2948 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2948 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass415_3 == Class415.aClass415_7) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_6) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_5) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_4) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass415_3 == Class415.aClass415_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass415_3 == Class415.aClass415_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass415_3 == Class415.aClass415_5) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afc", descriptor = "()V", line = 763)
	@Override
	void method21272() {
		if (this.aBoolean460) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2948 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2948 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2948 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2948 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass415_3 == Class415.aClass415_7) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_6) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_5) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass415_3 == Class415.aClass415_4) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass415_3 == Class415.aClass415_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass415_3 == Class415.aClass415_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass415_3 == Class415.aClass415_5) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afd", descriptor = "()V", line = 805)
	@Override
	void method21276() {
		if (this.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "vg", descriptor = "()V", line = 805)
	@Override
	void method21207() {
		if (this.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afh", descriptor = "()V", line = 805)
	@Override
	void method21182() {
		if (this.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afw", descriptor = "()V", line = 805)
	@Override
	void method21181() {
		if (this.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afl", descriptor = "()V", line = 805)
	@Override
	void method21163() {
		if (this.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aho", descriptor = "()V", line = 810)
	void method21309() {
		if (this.anInt2950 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2950 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2950 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ais", descriptor = "()V", line = 810)
	void method21310() {
		if (this.anInt2950 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2950 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2950 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aiy", descriptor = "()V", line = 810)
	void method21311() {
		if (this.anInt2950 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2950 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2950 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "vz", descriptor = "()V", line = 825)
	@Override
	void method21128() {
		if (this.aBoolean478 && this.aBoolean477 && this.anInt2947 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aft", descriptor = "()V", line = 825)
	@Override
	void method21279() {
		if (this.aBoolean478 && this.aBoolean477 && this.anInt2947 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "vh", descriptor = "()V", line = 830)
	@Override
	void method21189() {
		this.aFloat209 = this.aFloat208 - (float) this.anInt2956;
		this.aFloat216 = this.aFloat209 - (float) this.anInt2947;
		if (this.aFloat216 < this.aFloat215) {
			this.aFloat216 = this.aFloat215;
		}
		if (!this.aBoolean462) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat216);
		OpenGL.glFogf(2916, this.aFloat209);
		this.aFloatArray65[0] = (float) (this.anInt2957 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray65[1] = (float) (this.anInt2957 & 0xFF00) / 65280.0F;
		this.aFloatArray65[2] = (float) (this.anInt2957 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "afu", descriptor = "()V", line = 830)
	@Override
	void method21278() {
		this.aFloat209 = this.aFloat208 - (float) this.anInt2956;
		this.aFloat216 = this.aFloat209 - (float) this.anInt2947;
		if (this.aFloat216 < this.aFloat215) {
			this.aFloat216 = this.aFloat215;
		}
		if (!this.aBoolean462) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat216);
		OpenGL.glFogf(2916, this.aFloat209);
		this.aFloatArray65[0] = (float) (this.anInt2957 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray65[1] = (float) (this.anInt2957 & 0xFF00) / 65280.0F;
		this.aFloatArray65[2] = (float) (this.anInt2957 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!aqv", name = "vj", descriptor = "(Z)V", line = 844)
	@Override
	void method21255(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afj", descriptor = "(Z)V", line = 844)
	@Override
	void method21210(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "afn", descriptor = "(Z)V", line = 844)
	@Override
	void method21166(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "aga", descriptor = "(Z)Lclient!lr;", line = 849)
	@Override
	final Interface37 method21281(@OriginalArg(0) boolean arg0) {
		return new Class139_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "agv", descriptor = "(Z)Lclient!lr;", line = 849)
	@Override
	final Interface37 method21179(@OriginalArg(0) boolean arg0) {
		return new Class139_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "vn", descriptor = "(Z)Lclient!lr;", line = 849)
	@Override
	final Interface37 method21174(@OriginalArg(0) boolean arg0) {
		return new Class139_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "vc", descriptor = "(Z)Lclient!ml;", line = 853)
	@Override
	final Interface40 method21165(@OriginalArg(0) boolean arg0) {
		return new Class139_Sub1(this, Class226.aClass226_23, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "afp", descriptor = "(Z)Lclient!ml;", line = 853)
	@Override
	final Interface40 method21280(@OriginalArg(0) boolean arg0) {
		return new Class139_Sub1(this, Class226.aClass226_23, arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "vf", descriptor = "([Lclient!lk;)Lclient!lo;", line = 857)
	@Override
	Class145 method21164(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "agi", descriptor = "([Lclient!lk;)Lclient!lo;", line = 857)
	@Override
	Class145 method21282(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "agg", descriptor = "([Lclient!lk;)Lclient!lo;", line = 857)
	@Override
	Class145 method21283(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqv", name = "age", descriptor = "(ILclient!lr;)V", line = 861)
	@Override
	public void method21286(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		this.aClass139_Sub2Array1[arg0] = (Class139_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "wn", descriptor = "(ILclient!lr;)V", line = 861)
	@Override
	public void method21187(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		this.aClass139_Sub2Array1[arg0] = (Class139_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "agk", descriptor = "(ILclient!lr;)V", line = 861)
	@Override
	public void method21287(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		this.aClass139_Sub2Array1[arg0] = (Class139_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqv", name = "wa", descriptor = "(Lclient!ml;)V", line = 865)
	@Override
	void method21180(@OriginalArg(0) Interface40 arg0) {
		this.aClass139_Sub1_1 = (Class139_Sub1) arg0;
		this.aClass139_Sub1_1.method11635();
	}

	@OriginalMember(owner = "client!aqv", name = "agm", descriptor = "(Lclient!ml;)V", line = 865)
	@Override
	void method21246(@OriginalArg(0) Interface40 arg0) {
		this.aClass139_Sub1_1 = (Class139_Sub1) arg0;
		this.aClass139_Sub1_1.method11635();
	}

	@OriginalMember(owner = "client!aqv", name = "vk", descriptor = "(Lclient!lo;)V", line = 870)
	@Override
	public void method21208(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class400[] local2 = arg0.aClass400Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class400 local20 = local2[local12];
			@Pc(25) Class139_Sub2 local25 = this.aClass139_Sub2Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11668();
			@Pc(33) long local33 = local25.method11631();
			local25.method11635();
			for (@Pc(37) int local37 = 0; local37 < local20.method28497(); local37++) {
				@Pc(45) Class399 local45 = local20.method28502(local37);
				switch(local45.anInt4675) {
					case 2:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 3:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 4:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
					case 6:
					case 8:
					case 10:
					default:
						break;
					case 7:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 9:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
				}
				local27 += local45.anInt4676;
			}
		}
		if (this.aBoolean489 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean489 = local10;
		}
		if (this.aBoolean487 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean487 = local8;
		}
		if (this.aBoolean488 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean488 = local6;
		}
		if (this.anInt2965 < local4) {
			for (local12 = this.anInt2965; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2965 = local4;
		} else if (this.anInt2965 > local4) {
			for (local12 = local4; local12 < this.anInt2965; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2965 = local4;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "agx", descriptor = "(Lclient!lo;)V", line = 870)
	@Override
	public void method21284(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class400[] local2 = arg0.aClass400Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class400 local20 = local2[local12];
			@Pc(25) Class139_Sub2 local25 = this.aClass139_Sub2Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11668();
			@Pc(33) long local33 = local25.method11631();
			local25.method11635();
			for (@Pc(37) int local37 = 0; local37 < local20.method28497(); local37++) {
				@Pc(45) Class399 local45 = local20.method28502(local37);
				switch(local45.anInt4675) {
					case 2:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 3:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 4:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
					case 6:
					case 8:
					case 10:
					default:
						break;
					case 7:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 9:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
				}
				local27 += local45.anInt4676;
			}
		}
		if (this.aBoolean489 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean489 = local10;
		}
		if (this.aBoolean487 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean487 = local8;
		}
		if (this.aBoolean488 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean488 = local6;
		}
		if (this.anInt2965 < local4) {
			for (local12 = this.anInt2965; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2965 = local4;
		} else if (this.anInt2965 > local4) {
			for (local12 = local4; local12 < this.anInt2965; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2965 = local4;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "agj", descriptor = "(Lclient!lo;)V", line = 870)
	@Override
	public void method21285(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class400[] local2 = arg0.aClass400Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class400 local20 = local2[local12];
			@Pc(25) Class139_Sub2 local25 = this.aClass139_Sub2Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11668();
			@Pc(33) long local33 = local25.method11631();
			local25.method11635();
			for (@Pc(37) int local37 = 0; local37 < local20.method28497(); local37++) {
				@Pc(45) Class399 local45 = local20.method28502(local37);
				switch(local45.anInt4675) {
					case 2:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 3:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 4:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
					case 6:
					case 8:
					case 10:
					default:
						break;
					case 7:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 9:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
				}
				local27 += local45.anInt4676;
			}
		}
		if (this.aBoolean489 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean489 = local10;
		}
		if (this.aBoolean487 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean487 = local8;
		}
		if (this.aBoolean488 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean488 = local6;
		}
		if (this.anInt2965 < local4) {
			for (local12 = this.anInt2965; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2965 = local4;
		} else if (this.anInt2965 > local4) {
			for (local12 = local4; local12 < this.anInt2965; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2965 = local4;
		}
	}

	@OriginalMember(owner = "client!aqv", name = "agp", descriptor = "(Lclient!ms;II)V", line = 953)
	@Override
	public final void method21167(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!aqv", name = "agz", descriptor = "(Lclient!ms;II)V", line = 953)
	@Override
	public final void method21288(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!aqv", name = "wz", descriptor = "(Lclient!ms;II)V", line = 953)
	@Override
	public final void method21169(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!aqv", name = "wj", descriptor = "(Lclient!ml;Lclient!ms;IIII)V", line = 983)
	@Override
	final void method21170(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class226 local56 = arg0.method29352();
		@Pc(59) Class139_Sub1 local59 = (Class139_Sub1) arg0;
		local59.method11635();
		OpenGL.glDrawElements(local4, local8, method21330(local56), local59.method11631() + (long) (arg4 * local56.anInt3646 * -1066472467));
	}

	@OriginalMember(owner = "client!aqv", name = "agh", descriptor = "(Lclient!ml;Lclient!ms;IIII)V", line = 983)
	@Override
	final void method21289(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class226 local56 = arg0.method29352();
		@Pc(59) Class139_Sub1 local59 = (Class139_Sub1) arg0;
		local59.method11635();
		OpenGL.glDrawElements(local4, local8, method21330(local56), local59.method11631() + (long) (arg4 * local56.anInt3646 * -1066472467));
	}

	@OriginalMember(owner = "client!aqv", name = "we", descriptor = "(Lclient!ms;IIII)V", line = 1016)
	@Override
	public final void method21171(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class226 local57 = this.aClass139_Sub1_1.method29352();
		OpenGL.glDrawElements(local4, local8, method21330(local57), this.aClass139_Sub1_1.method11631() + (long) (arg3 * local57.anInt3646 * -1066472467));
	}

	@OriginalMember(owner = "client!aqv", name = "agq", descriptor = "(Lclient!ms;IIII)V", line = 1016)
	@Override
	public final void method21135(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class226 local57 = this.aClass139_Sub1_1.method29352();
		OpenGL.glDrawElements(local4, local8, method21330(local57), this.aClass139_Sub1_1.method11631() + (long) (arg3 * local57.anInt3646 * -1066472467));
	}

	@OriginalMember(owner = "client!aqv", name = "agr", descriptor = "(Lclient!ms;IIII)V", line = 1016)
	@Override
	public final void method21291(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class226 local57 = this.aClass139_Sub1_1.method29352();
		OpenGL.glDrawElements(local4, local8, method21330(local57), this.aClass139_Sub1_1.method11631() + (long) (arg3 * local57.anInt3646 * -1066472467));
	}

	@OriginalMember(owner = "client!aqv", name = "agt", descriptor = "(Lclient!ms;IIII)V", line = 1016)
	@Override
	public final void method21292(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class424.aClass424_6) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class424.aClass424_1) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class424.aClass424_3) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class424.aClass424_4) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class424.aClass424_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class226 local57 = this.aClass139_Sub1_1.method29352();
		OpenGL.glDrawElements(local4, local8, method21330(local57), this.aClass139_Sub1_1.method11631() + (long) (arg3 * local57.anInt3646 * -1066472467));
	}

	@OriginalMember(owner = "client!aqv", name = "d", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20531(@OriginalArg(0) int arg0) {
		try {
			this.method21341();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class93_Sub14 local21;
		while (!this.aClass22_35.method453(2071346624)) {
			local21 = (Class93_Sub14) this.aClass22_35.method415(742291621);
			this.anIntArray252[local6++] = (int) (local21.aLong232 * -3750704643647536275L);
			this.anInt2917 -= local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray252, 0);
			local6 = 0;
		}
		while (!this.aClass22_40.method453(1826710522)) {
			local21 = (Class93_Sub14) this.aClass22_40.method415(742291621);
			this.anIntArray252[local6++] = (int) (local21.aLong232 * -3750704643647536275L);
			this.anInt2916 -= local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray252, 0);
			local6 = 0;
		}
		while (!this.aClass22_41.method453(1924961318)) {
			local21 = (Class93_Sub14) this.aClass22_41.method415(742291621);
			this.anIntArray252[local6++] = local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray252, 0);
			local6 = 0;
		}
		while (!this.aClass22_36.method453(2024032573)) {
			local21 = (Class93_Sub14) this.aClass22_36.method415(742291621);
			this.anIntArray252[local6++] = (int) (local21.aLong232 * -3750704643647536275L);
			this.anInt2931 -= local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray252, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass22_39.method453(1925950909)) {
			local21 = (Class93_Sub14) this.aClass22_39.method415(742291621);
			OpenGL.glDeleteLists((int) (local21.aLong232 * -3750704643647536275L), local21.anInt1526 * 1279598251);
		}
		@Pc(232) Class93 local232;
		while (!this.aClass22_37.method453(2020343651)) {
			local232 = this.aClass22_37.method415(742291621);
			OpenGL.glDeleteProgram((int) (local232.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_38.method453(2048451165)) {
			local232 = this.aClass22_38.method415(742291621);
			OpenGL.glDeleteShader((int) (local232.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_39.method453(1955006961)) {
			local21 = (Class93_Sub14) this.aClass22_39.method415(742291621);
			OpenGL.glDeleteLists((int) (local21.aLong232 * -3750704643647536275L), local21.anInt1526 * 1279598251);
		}
		if (this.method20862() > 100663296 && Class305.method26797(1498939757) > this.aLong133 + 60000L) {
			System.gc();
			this.aLong133 = Class305.method26797(1859202917);
		}
		super.method20531(local10);
	}

	@OriginalMember(owner = "client!aqv", name = "en", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20636(@OriginalArg(0) int arg0) {
		try {
			this.method21341();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class93_Sub14 local21;
		while (!this.aClass22_35.method453(1777624758)) {
			local21 = (Class93_Sub14) this.aClass22_35.method415(742291621);
			this.anIntArray252[local6++] = (int) (local21.aLong232 * -3750704643647536275L);
			this.anInt2917 -= local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray252, 0);
			local6 = 0;
		}
		while (!this.aClass22_40.method453(2088499701)) {
			local21 = (Class93_Sub14) this.aClass22_40.method415(742291621);
			this.anIntArray252[local6++] = (int) (local21.aLong232 * -3750704643647536275L);
			this.anInt2916 -= local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray252, 0);
			local6 = 0;
		}
		while (!this.aClass22_41.method453(1970378204)) {
			local21 = (Class93_Sub14) this.aClass22_41.method415(742291621);
			this.anIntArray252[local6++] = local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray252, 0);
			local6 = 0;
		}
		while (!this.aClass22_36.method453(1852736753)) {
			local21 = (Class93_Sub14) this.aClass22_36.method415(742291621);
			this.anIntArray252[local6++] = (int) (local21.aLong232 * -3750704643647536275L);
			this.anInt2931 -= local21.anInt1526 * 1279598251;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray252, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray252, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass22_39.method453(1891371279)) {
			local21 = (Class93_Sub14) this.aClass22_39.method415(742291621);
			OpenGL.glDeleteLists((int) (local21.aLong232 * -3750704643647536275L), local21.anInt1526 * 1279598251);
		}
		@Pc(232) Class93 local232;
		while (!this.aClass22_37.method453(1684987364)) {
			local232 = this.aClass22_37.method415(742291621);
			OpenGL.glDeleteProgram((int) (local232.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_38.method453(1721961053)) {
			local232 = this.aClass22_38.method415(742291621);
			OpenGL.glDeleteShader((int) (local232.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_39.method453(2076346574)) {
			local21 = (Class93_Sub14) this.aClass22_39.method415(742291621);
			OpenGL.glDeleteLists((int) (local21.aLong232 * -3750704643647536275L), local21.anInt1526 * 1279598251);
		}
		if (this.method20862() > 100663296 && Class305.method26797(1318639114) > this.aLong133 + 60000L) {
			System.gc();
			this.aLong133 = Class305.method26797(744599574);
		}
		super.method20531(local10);
	}

	@OriginalMember(owner = "client!aqv", name = "aio", descriptor = "(II)V", line = 1128)
	final synchronized void method21312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_35.method408(local4, -1112467469);
	}

	@OriginalMember(owner = "client!aqv", name = "ahg", descriptor = "(II)V", line = 1128)
	final synchronized void method21313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_35.method408(local4, -960772357);
	}

	@OriginalMember(owner = "client!aqv", name = "aig", descriptor = "(II)V", line = 1128)
	final synchronized void method21314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_35.method408(local4, -1795138666);
	}

	@OriginalMember(owner = "client!aqv", name = "aid", descriptor = "(II)V", line = 1128)
	final synchronized void method21315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_35.method408(local4, -547632804);
	}

	@OriginalMember(owner = "client!aqv", name = "aif", descriptor = "(II)V", line = 1128)
	final synchronized void method21316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_35.method408(local4, -1948165996);
	}

	@OriginalMember(owner = "client!aqv", name = "ahh", descriptor = "(II)V", line = 1134)
	final synchronized void method21317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_40.method408(local4, -14422400);
	}

	@OriginalMember(owner = "client!aqv", name = "ail", descriptor = "(II)V", line = 1134)
	final synchronized void method21318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_40.method408(local4, -1340676891);
	}

	@OriginalMember(owner = "client!aqv", name = "aiw", descriptor = "(II)V", line = 1134)
	final synchronized void method21319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_40.method408(local4, -409693283);
	}

	@OriginalMember(owner = "client!aqv", name = "ahd", descriptor = "(I)V", line = 1140)
	final synchronized void method21320(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg0);
		this.aClass22_41.method408(local4, -780580763);
	}

	@OriginalMember(owner = "client!aqv", name = "aiz", descriptor = "(I)V", line = 1140)
	final synchronized void method21321(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg0);
		this.aClass22_41.method408(local4, -91514615);
	}

	@OriginalMember(owner = "client!aqv", name = "aij", descriptor = "(II)V", line = 1145)
	final synchronized void method21322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_36.method408(local4, -532242112);
	}

	@OriginalMember(owner = "client!aqv", name = "ahn", descriptor = "(II)V", line = 1145)
	final synchronized void method21323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_36.method408(local4, -1132087491);
	}

	@OriginalMember(owner = "client!aqv", name = "aie", descriptor = "(II)V", line = 1145)
	final synchronized void method21324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_36.method408(local4, -1879498868);
	}

	@OriginalMember(owner = "client!aqv", name = "aim", descriptor = "(II)V", line = 1145)
	final synchronized void method21325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_36.method408(local4, 583847180);
	}

	@OriginalMember(owner = "client!aqv", name = "aic", descriptor = "(II)V", line = 1145)
	final synchronized void method21326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_36.method408(local4, -1907292274);
	}

	@OriginalMember(owner = "client!aqv", name = "ahp", descriptor = "(J)V", line = 1151)
	final synchronized void method21327(@OriginalArg(0) long arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = arg0 * -284080703297520027L;
		this.aClass22_38.method408(local3, -1354269057);
	}

	@OriginalMember(owner = "client!aqv", name = "ahe", descriptor = "(I)V", line = 1157)
	final synchronized void method21328(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_37.method408(local3, 427274222);
	}

	@OriginalMember(owner = "client!aqv", name = "aik", descriptor = "(I)V", line = 1157)
	final synchronized void method21329(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_37.method408(local3, -719665232);
	}

	@OriginalMember(owner = "client!aqv", name = "ahs", descriptor = "(Lclient!dg;)I", line = 1163)
	static final int method21330(@OriginalArg(0) Class226 arg0) {
		switch(arg0.anInt3645 * 2069827685) {
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

	@OriginalMember(owner = "client!aqv", name = "aih", descriptor = "(Lclient!dg;)I", line = 1163)
	static final int method21331(@OriginalArg(0) Class226 arg0) {
		switch(arg0.anInt3645 * 2069827685) {
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

	@OriginalMember(owner = "client!aqv", name = "aip", descriptor = "(Lclient!dg;)I", line = 1163)
	static final int method21332(@OriginalArg(0) Class226 arg0) {
		switch(arg0.anInt3645 * 2069827685) {
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

	@OriginalMember(owner = "client!aqv", name = "aiu", descriptor = "(Lclient!dg;)I", line = 1163)
	static final int method21333(@OriginalArg(0) Class226 arg0) {
		switch(arg0.anInt3645 * 2069827685) {
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

	@OriginalMember(owner = "client!aqv", name = "aht", descriptor = "(Lclient!ck;)I", line = 1186)
	static int method21334(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "aiv", descriptor = "(Lclient!ck;)I", line = 1186)
	static int method21335(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "aib", descriptor = "(Lclient!ck;)I", line = 1186)
	static int method21336(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "ain", descriptor = "(Lclient!ck;)I", line = 1186)
	static int method21337(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "aja", descriptor = "(Lclient!ck;)I", line = 1186)
	static int method21338(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "ahi", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 1205)
	static int method21339(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		if (arg1 == Class226.aClass226_22) {
			switch(arg0.anInt3388 * 811184495) {
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
		} else if (arg1 == Class226.aClass226_23) {
			switch(arg0.anInt3388 * 811184495) {
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
		} else if (arg1 == Class226.aClass226_26) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_25) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_24) {
			switch(arg0.anInt3388 * 811184495) {
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
		} else if (arg1 == Class226.aClass226_19) {
			switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "ajp", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 1205)
	static int method21340(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		if (arg1 == Class226.aClass226_22) {
			switch(arg0.anInt3388 * 811184495) {
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
		} else if (arg1 == Class226.aClass226_23) {
			switch(arg0.anInt3388 * 811184495) {
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
		} else if (arg1 == Class226.aClass226_26) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_25) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_24) {
			switch(arg0.anInt3388 * 811184495) {
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
		} else if (arg1 == Class226.aClass226_19) {
			switch(arg0.anInt3388 * 811184495) {
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

	@OriginalMember(owner = "client!aqv", name = "fk", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20660(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqv", name = "fr", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20662(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqv", name = "eh", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20628(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqv", name = "fh", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20661(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqv", name = "gu", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20663(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqv", name = "ahy", descriptor = "()V", line = 1297)
	void method21341() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.method27726()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class212.method25431(1000L);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "wp", descriptor = "(I)V", line = 1305)
	@Override
	void method21172(@OriginalArg(0) int arg0) {
		if (!this.aBoolean497) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ahc", descriptor = "(I)V", line = 1305)
	@Override
	void method21294(@OriginalArg(0) int arg0) {
		if (!this.aBoolean497) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "agy", descriptor = "(I)V", line = 1305)
	@Override
	void method21293(@OriginalArg(0) int arg0) {
		if (!this.aBoolean497) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "ahm", descriptor = "(I)V", line = 1305)
	@Override
	void method21290(@OriginalArg(0) int arg0) {
		if (!this.aBoolean497) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqv", name = "g", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20542() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2963 + local3;
		@Pc(39) String local39 = local27 + this.anInt2954 + local3;
		@Pc(51) String local51 = local39 + this.anInt2920 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean490 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean498 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean460 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!aqv", name = "fb", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20875() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2963 + local3;
		@Pc(39) String local39 = local27 + this.anInt2954 + local3;
		@Pc(51) String local51 = local39 + this.anInt2920 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean490 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean498 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean460 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!aqv", name = "fo", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20657() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2963 + local3;
		@Pc(39) String local39 = local27 + this.anInt2954 + local3;
		@Pc(51) String local51 = local39 + this.anInt2920 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean490 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean498 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean460 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!aqv", name = "fy", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20824() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2963 + local3;
		@Pc(39) String local39 = local27 + this.anInt2954 + local3;
		@Pc(51) String local51 = local39 + this.anInt2920 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean490 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean498 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean460 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!aqv", name = "fl", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20655() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2963 + local3;
		@Pc(39) String local39 = local27 + this.anInt2954 + local3;
		@Pc(51) String local51 = local39 + this.anInt2920 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean490 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean498 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean460 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}
}
