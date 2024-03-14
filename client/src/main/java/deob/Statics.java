package deob;

import com.jagex.audio.*;
import com.jagex.core.datastruct.*;
import com.jagex.core.io.*;
import com.jagex.core.utils.*;
import com.jagex.game.client.*;
import com.jagex.game.config.*;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.Interface;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.meltype.MapElementType;
import com.jagex.game.config.msitype.MSIType;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.questtype.QuestType;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import com.jagex.game.cutscene.*;
import com.jagex.game.load.*;
import com.jagex.game.network.ServerConnection;
import com.jagex.game.scene.ChangeLocationRequest;
import com.jagex.game.world.*;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.*;
import com.jagex.graphics.dx.Direct3DRendererFactory;
import com.jagex.graphics.gl.OpenGLRendererFactory;
import com.jagex.graphics.legacygl.LegacyOpenGLRendererFactory;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.graphics.safe.PureJavaRenderer;
import com.jagex.js5.Js5;
import com.jagex.math.Trig1;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchTV;
import lzma.sdk.rangecoder.Decoder;
import rs2.client.Client;
import rs2.client.logic.DelayedStateChange;
import rs2.client.login.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class Statics {

	@ObfuscatedName("bz.c")
	public static Object field1039;

	@ObfuscatedName("bz.d")
	public static Object field1046;

	@ObfuscatedName("ahw.ch")
	public static FontMetrics field10471;

	@ObfuscatedName("bz.r")
	public static Object field1048;

	@ObfuscatedName("ahx.c")
	public static short field10538;

	@ObfuscatedName("ahn.bd")
	public static Sprite field10568;

	@ObfuscatedName("aip.x")
	public static short[][] field10766;

	@ObfuscatedName("ajo.w")
	public static int field11222;

	@ObfuscatedName("ajw.ck")
	public static IterableQueue field11253;

	@ObfuscatedName("aje.z")
	public static int[] field11269;

	@ObfuscatedName("cu.q")
	public static float field1137;

	@ObfuscatedName("akd.cv")
	public static int field11443;

	@ObfuscatedName("alk.an")
	public static int field11642;

	@ObfuscatedName("alv.bn")
	public static Sprite field11699;

	@ObfuscatedName("ala.r")
	public static short field11700;

	@ObfuscatedName("amq.t")
	public static int field11738;

	@ObfuscatedName("amm.x")
	public static TwitchTV field11755;

	@ObfuscatedName("aml.r")
	public static int field11775;

	@ObfuscatedName("anq.al")
	public static int field11802;

	@ObfuscatedName("anh.ak")
	public static int field11819;

	@ObfuscatedName("ank.az")
	public static int field11830;

	@ObfuscatedName("ank.bt")
	public static Sprite field11831;

	@ObfuscatedName("apn.o")
	public static MinimenuEntry field11913;

	@ObfuscatedName("aqn.p")
	public static ParticleEffectorTypeList field12041;

	@ObfuscatedName("cr.bi")
	public static Sprite field1224;

	@ObfuscatedName("arr.l")
	public static Js5 field12325;

	@ObfuscatedName("arr.u")
	public static Js5 field12326;

	@ObfuscatedName("asg.af")
	public static int field12340;

	@ObfuscatedName("asf.v")
	public static int field12384;

	@ObfuscatedName("asw.j")
	public static final int field12460 = 64;

	@ObfuscatedName("atl.v")
	public static SeqTypeList field12490;

	@ObfuscatedName("atc.n")
	public static String field12492;

	@ObfuscatedName("atc.m")
	public static int field12493;

	@ObfuscatedName("atc.k")
	public static int field12494;

	@ObfuscatedName("atc.e")
	public static long field12496;

	@ObfuscatedName("cz.bq")
	public static int field1266;

	@ObfuscatedName("cj.v")
	public static MinimenuEntry field1280;

	@ObfuscatedName("da.ag")
	public static int field1289;

	@ObfuscatedName("dk.q")
	public static short[][][] field1434;

	@ObfuscatedName("ds.w")
	public static int field1455;

	@ObfuscatedName("ds.n")
	public static int field1456;

	@ObfuscatedName("ds.m")
	public static int field1457;

	@ObfuscatedName("ds.f")
	public static int field1458;

	@ObfuscatedName("ds.l")
	public static int field1461;

	@ObfuscatedName("ds.u")
	public static int field1462;

	@ObfuscatedName("ec.i")
	public static Js5 field1707;

	@ObfuscatedName("eq.w")
	public static CutsceneAction[] field1713;

	@ObfuscatedName("eq.n")
	public static CutsceneSpline[] field1714;

	@ObfuscatedName("eq.v")
	public static short field1719;

	@ObfuscatedName("eq.o")
	public static short field1720;

	@ObfuscatedName("eq.m")
	public static CutsceneEntity[] field1721;

	@ObfuscatedName("ea.ak")
	public static int field1748;

	@ObfuscatedName("fz.y")
	public static Js5 field1810;

	@ObfuscatedName("fv.bb")
	public static Font field1841;

	@ObfuscatedName("fq.y")
	public static MinimenuEntry field1846;

	@ObfuscatedName("fl.bf")
	public static int field1847;

	@ObfuscatedName("gp.f")
	public static ParticleSystem[] field1920;

	@ObfuscatedName("gp.u")
	public static int field1921;

	@ObfuscatedName("gh.as")
	public static int[] field1970;

	@ObfuscatedName("gv.al")
	public static int field1981;

	@ObfuscatedName("gd.l")
	public static Map field2010;

	@ObfuscatedName("hr.ao")
	public static int field2364;

	@ObfuscatedName("hp.x")
	public static TextureList field2421;

	@ObfuscatedName("hn.ac")
	public static int field2433;

	@ObfuscatedName("ho.t")
	public static Image field2575;

	@ObfuscatedName("ho.ah")
	public static int field2576;

	@ObfuscatedName("hj.h")
	public static long field2584;

	@ObfuscatedName("hj.ae")
	public static int field2585;

	@ObfuscatedName("hv.z")
	public static CheckNameReply field2589;

	@ObfuscatedName("io.cl")
	public static int field2606;

	@ObfuscatedName("iv.v")
	public static String[] field2615;

	@ObfuscatedName("ic.p")
	public static long field2826;

	@ObfuscatedName("jl.k")
	public static LoadingRelated3 field2841;

	@ObfuscatedName("jm.ah")
	public static int[] field2899;

	@ObfuscatedName("jm.bm")
	public static int field2901;

	@ObfuscatedName("jv.ae")
	public static int field2960;

	@ObfuscatedName("jg.aw")
	public static int field3005;

	@ObfuscatedName("kg.ca")
	public static Component field3044;

	@ObfuscatedName("kr.ce")
	public static int field3121;

	@ObfuscatedName("kt.q")
	public static MaterialList field3199;

	@ObfuscatedName("lp.r")
	public static Object field3225;

	@ObfuscatedName("lp.d")
	public static Object field3230;

	@ObfuscatedName("lp.c")
	public static Object field3231;

	@ObfuscatedName("ld.s")
	public static float field3325;

	@ObfuscatedName("mt.r")
	public static LoadingStage field3419;

	@ObfuscatedName("mc.ay")
	public static long field3429;

	@ObfuscatedName("nl.bh")
	public static Sprite field3568;

	@ObfuscatedName("ns.i")
	public static int field4037;

	@ObfuscatedName("ov.m")
	public static int field4302;

	@ObfuscatedName("ov.n")
	public static int field4306;

	@ObfuscatedName("m.m")
	public static int field431;

	@ObfuscatedName("ox.m")
	public static int field4310;

	@ObfuscatedName("ox.n")
	public static int field4312;

	@ObfuscatedName("pq.m")
	public static int field4318;

	@ObfuscatedName("pq.k")
	public static int field4319;

	@ObfuscatedName("m.k")
	public static ServerConnection field432;

	@ObfuscatedName("m.w")
	public static long field434;

	@ObfuscatedName("m.l")
	public static int[] field435;

	@ObfuscatedName("m.u")
	public static int[] field436;

	@ObfuscatedName("pr.l")
	public static CreateAccountReply field4406;

	@ObfuscatedName("pr.y")
	public static String field4407;

	@ObfuscatedName("qx.ay")
	public static int field4488;

	@ObfuscatedName("qz.as")
	public static TwitchEventLiveStreams field4501;

	@ObfuscatedName("qe.cu")
	public static int field4603;

	@ObfuscatedName("ql.f")
	public static int field4608;

	@ObfuscatedName("qw.gc")
	public static ScriptVarType[] varByLegacyChar;

	@ObfuscatedName("qv.k")
	public static String[] field4845;

	@ObfuscatedName("k.u")
	public static boolean field488;

	@ObfuscatedName("rk.r")
	public static SpriteData field4963;

	@ObfuscatedName("rk.p")
	public static String field4964;

	@ObfuscatedName("sw.ah")
	public static Sprite field5118;

	@ObfuscatedName("sw.ag")
	public static Model field5129;

	@ObfuscatedName("sw.al")
	public static Sprite field5137;

	@ObfuscatedName("u.f")
	public static CreateConnectStage field517;

	@ObfuscatedName("o.ai")
	public static int field554;

	@ObfuscatedName("o.bc")
	public static Sprite field566;

	@ObfuscatedName("y.n")
	public static int[] field581;

	@ObfuscatedName("y.w")
	public static ConnectReply field584;

	@ObfuscatedName("y.p")
	public static SuggestNameReply field585;

	@ObfuscatedName("x.w")
	public static int field592;

	@ObfuscatedName("x.l")
	public static LoadingScreenRenderer field593;

	@ObfuscatedName("a.n")
	public static BasicCamera field604;

	@ObfuscatedName("a.m")
	public static int field605;

	@ObfuscatedName("i.n")
	public static int field616;

	@ObfuscatedName("j.d")
	public static String field618;

	@ObfuscatedName("j.k")
	public static int field621;

	@ObfuscatedName("t.aa")
	public static int field622;

	@ObfuscatedName("ae.s")
	public static int field627;

	@ObfuscatedName("ag.n")
	public static Font field629;

	@ObfuscatedName("sn.n")
	public static File field6626;

	@ObfuscatedName("sy.ab")
	public static int field6708;

	@ObfuscatedName("tb.j")
	public static int[] field6767;

	@ObfuscatedName("ai.q")
	public static CutsceneLoadingStage field694;

	@ObfuscatedName("ul.xg")
	public static Iterator field7015;

	@ObfuscatedName("um.t")
	public static Renderer field7041;

	@ObfuscatedName("ua.g")
	public static Js5 field7085;

	@ObfuscatedName("as.e")
	public static LoadingScreenAlignmentX field709;

	@ObfuscatedName("uz.l")
	public static int field7091;

	@ObfuscatedName("as.c")
	public static SpriteData field710;

	@ObfuscatedName("ug.s")
	public static MinimenuEntry field7100;

	@ObfuscatedName("as.m")
	public static int field711;

	@ObfuscatedName("as.f")
	public static int field712;

	@ObfuscatedName("as.p")
	public static int field713;

	@ObfuscatedName("as.d")
	public static SpriteData field714;

	@ObfuscatedName("as.n")
	public static LoadingScreenAlignmentY field715;

	@ObfuscatedName("as.o")
	public static PalettedSpriteData field716;

	@ObfuscatedName("as.cq")
	public static Font field717;

	@ObfuscatedName("uw.cw")
	public static Sprite field7241;

	@ObfuscatedName("uu.dq")
	public static WorldMapAreaMetadata field7280;

	@ObfuscatedName("vx.k")
	public static int field7284;

	@ObfuscatedName("vl.k")
	public static CutsceneLocation[] field7317;

	@ObfuscatedName("at.y")
	public static Sprite field734;

	@ObfuscatedName("am.aa")
	public static int field740;

	@ObfuscatedName("vi.l")
	public static Js5 field7411;

	@ObfuscatedName("va.d")
	public static Packet field7415;

	@ObfuscatedName("vy.z")
	public static int field7424;

	@ObfuscatedName("vp.bu")
	public static boolean field7446;

	@ObfuscatedName("au.c")
	public static int field753;

	@ObfuscatedName("vz.af")
	public static int field7542;

	@ObfuscatedName("vn.y")
	public static short[][] field7577;

	@ObfuscatedName("wm.aj")
	public static int field7658;

	@ObfuscatedName("wx.k")
	public static PrimaryLayerEntityList field7674;

	@ObfuscatedName("wx.aj")
	public static int field7676;

	@ObfuscatedName("xl.n")
	public static MovingParticle[] field7794;

	@ObfuscatedName("xu.n")
	public static EnvironmentSampler field7832;

	@ObfuscatedName("xu.m")
	public static SkyBox field7846;

	@ObfuscatedName("xn.r")
	public static int field7883;

	@ObfuscatedName("xj.z")
	public static long field7966;

	@ObfuscatedName("xf.cg")
	public static int field8055;

	@ObfuscatedName("yk.m")
	public static int[] field8149;

	@ObfuscatedName("yk.f")
	public static int[] field8150;

	@ObfuscatedName("yk.k")
	public static int[] field8151;

	@ObfuscatedName("yp.q")
	public static boolean[][] field8182;

	@ObfuscatedName("yz.o")
	public static int lastFullscreenWidth;

	@ObfuscatedName("zy.u")
	public static Js5 field8302;

	@ObfuscatedName("zc.m")
	public static MinimenuEntry field8348;

	@ObfuscatedName("zc.e")
	public static List field8349;

	@ObfuscatedName("zs.f")
	public static CutsceneRoute[] field8358;

	@ObfuscatedName("zl.j")
	public static Js5 field8370;

	@ObfuscatedName("aag.a")
	public static boolean[] field8424;

	@ObfuscatedName("aak.bl")
	public static int field8463;

	@ObfuscatedName("aax.bk")
	public static Sprite field8480;

	@ObfuscatedName("aao.f")
	public static Js5 field8522;

	@ObfuscatedName("aao.ag")
	public static int field8526;

	@ObfuscatedName("aae.w")
	public static Js5 field8532;

	@ObfuscatedName("aae.s")
	public static String field8535;

	@ObfuscatedName("aal.gg")
	public static Map field8540;

	@ObfuscatedName("af.u")
	public static CheckEmailReply field872;

	@ObfuscatedName("abx.be")
	public static FontMetrics field8786;

	@ObfuscatedName("acm.v")
	public static FontMetrics field8851;

	@ObfuscatedName("bf.al")
	public static int[] field894;

	@ObfuscatedName("acp.k")
	public static int[] field9124;

	@ObfuscatedName("acp.n")
	public static int field9125;

	@ObfuscatedName("acp.m")
	public static int field9126;

	@ObfuscatedName("acp.f")
	public static int[] field9128;

	@ObfuscatedName("acp.c")
	public static int field9130;

	@ObfuscatedName("acr.x")
	public static java.awt.Font field9147;

	@ObfuscatedName("acs.f")
	public static Applet field9164;

	@ObfuscatedName("adz.w")
	public static ServerAddress field9200;

	@ObfuscatedName("adw.bx")
	public static Sprite field9253;

	@ObfuscatedName("adj.s")
	public static int lastFullscreenHeight;

	@ObfuscatedName("adm.b")
	public static short[][][] field9259;

	@ObfuscatedName("adx.y")
	public static boolean field9262;

	@ObfuscatedName("ael.q")
	public static int field9357;

	@ObfuscatedName("ael.ag")
	public static int field9361;

	@ObfuscatedName("ael.r")
	public static int field9367;

	@ObfuscatedName("ael.v")
	public static int field9368;

	@ObfuscatedName("ael.o")
	public static int field9369;

	@ObfuscatedName("ael.s")
	public static int field9370;

	@ObfuscatedName("ael.y")
	public static int field9371;

	@ObfuscatedName("ael.b")
	public static int field9374;

	@ObfuscatedName("ael.x")
	public static int field9375;

	@ObfuscatedName("ael.a")
	public static int field9376;

	@ObfuscatedName("ael.g")
	public static int field9377;

	@ObfuscatedName("ael.i")
	public static int field9378;

	@ObfuscatedName("ael.t")
	public static int field9380;

	@ObfuscatedName("ael.ae")
	public static int field9381;

	@ObfuscatedName("ael.h")
	public static int field9384;

	@ObfuscatedName("ael.c")
	public static int field9385;

	@ObfuscatedName("ael.j")
	public static int field9389;

	@ObfuscatedName("afk.br")
	public static long[] field9661;

	@ObfuscatedName("afk.bs")
	public static int field9692;

	@ObfuscatedName("afk.cl")
	public static int field9693;

	@ObfuscatedName("afk.cg")
	public static int field9694;

	@ObfuscatedName("afk.ce")
	public static boolean field9695;

	@ObfuscatedName("afo.ce")
	public static GpuModelUnknown field9772;

	@ObfuscatedName("agh.e(III)I")
	public static int method16462(int arg0, int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@ObfuscatedName("ie.e([BI)[B")
	public static byte[] method4405(byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			byte[] var1 = new byte[arg0.length];
			System.arraycopy(arg0, 0, var1, 0, arg0.length);
			return var1;
		}
	}

	@ObfuscatedName("fy.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;IIB)Ldh;")
	public static Renderer method3367(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6, int arg7) {
		return new PureJavaRenderer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("zd.n([SI)[S")
	public static short[] method13987(short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			short[] var1 = new short[arg0.length];
			System.arraycopy(arg0, 0, var1, 0, arg0.length);
			return var1;
		}
	}

	@ObfuscatedName("ke.n(I)Lrn;")
	public static NativeLibraryLoader method5134() {
		if (NativeLibraries.field5077 == null) {
			throw new IllegalStateException("");
		}
		return NativeLibraries.field5077;
	}

	@ObfuscatedName("h.n(II)Ljava/lang/String;")
	public static String method596(int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@ObfuscatedName("s.n(Ldh;IILhf;II)V")
	public static void method480(Renderer arg0, int arg1, int arg2, Component arg3, int arg4) {
		for (int var5 = 7; var5 >= 0; var5--) {
			for (int var6 = 127; var6 >= 0; var6--) {
				int var7 = (arg4 & 0x3F) << 10 | (var5 & 0x7) << 7 | var6 & 0x7F;
				ColourUtils.method10156(false, true);
				int var8 = field8149[var7];
				ColourUtils.method14805(false, true);
				arg0.method2354((arg3.field2196 * var6 >> 7) + arg1, (arg3.field2197 * (7 - var5) >> 3) + arg2, (arg3.field2196 >> 7) + 1, (arg3.field2197 >> 3) + 1, var8 | 0xFF000000, 0);
			}
		}
	}

	@ObfuscatedName("gz.n(Ltl;B)V")
	public static void method3657(PickableEntity arg0) {
		arg0.field6978 = null;
		Stack var1 = PickableEntity.field6979;
		synchronized (PickableEntity.field6979) {
			if (PickableEntity.field6979.size() < 200) {
				PickableEntity.field6979.push(arg0);
			}
		}
	}

	@ObfuscatedName("vj.m(Laky;Laky;I)V")
	public static void method9574(SecondaryNode arg0, SecondaryNode arg1) {
		if (arg0.field11438 != null) {
			arg0.method17806();
		}
		arg0.field11438 = arg1.field11438;
		arg0.field11439 = arg1;
		arg0.field11438.field11439 = arg0;
		arg0.field11439.field11438 = arg0;
	}

	@ObfuscatedName("ka.e(Ldh;IIIIIB)Ldo;")
	public static Model method5210(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg5;
		Model var8 = (Model) HintArrow.field752.method2930(var6);
		short var9 = 2055;
		if (var8 == null) {
			ModelUnlit var10 = ModelUnlit.method1931(Client.field9213, arg5, 0);
			if (var10 == null) {
				return null;
			}
			if (var10.field1372 < 13) {
				var10.method1947(2);
			}
			var8 = arg0.method2211(var10, var9, field753, 64, 768);
			HintArrow.field752.method2921(var8, var6);
		}
		Model var11 = var8.method1773((byte) 6, var9, true);
		if (arg1 != 0) {
			var11.method1693(arg1);
		}
		if (arg2 != 0) {
			var11.method1852(arg2);
		}
		if (arg3 != 0) {
			var11.method1696(arg3);
		}
		if (arg4 != 0) {
			var11.method1805(0, arg4, 0);
		}
		return var11;
	}

	@ObfuscatedName("nc.k([SILjp;II)I")
	public static int reverseDecode(short[] arg0, int arg1, Decoder arg2, int arg3) throws IOException {
		int var4 = 1;
		int var5 = 0;
		for (int var6 = 0; var6 < arg3; var6++) {
			int var7 = arg2.decodeBit(arg0, arg1 + var4);
			int var8 = var4 << 1;
			var4 = var7 + var8;
			var5 |= var7 << var6;
		}
		return var5;
	}

	@ObfuscatedName("acc.m(S)V")
	public static void method15000() {
		Stack var0 = PickableEntity.field6979;
		synchronized (PickableEntity.field6979) {
			PickableEntity.field6979 = new Stack();
		}
	}

	@ObfuscatedName("adz.k(Ltc;Ltc;B)V")
	public static void method15212(Link arg0, Link arg1) {
		if (arg0.field6758 != null) {
			arg0.method8433();
		}
		arg0.field6758 = arg1;
		arg0.field6759 = arg1.field6759;
		arg0.field6758.field6759 = arg0;
		arg0.field6759.field6758 = arg0;
	}

	@ObfuscatedName("pd.bz(III)B")
	public static byte method6824(int arg0, int arg1) {
		if (LocShape.field7547.field7562 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("alj.t(II)V")
	public static void method18259(int arg0) {
		field2364 = arg0;
		NativeMouseEvent.field12413 = new NativeMouseEvent[arg0];
		field7658 = 0;
	}

	@ObfuscatedName("xq.l(III)Z")
	public static boolean method10338(int arg0, int arg1) {
		if (AudioMixer.field8056 == null || AudioMixer.field8056.method5880() == null) {
			return false;
		} else if (arg0 == arg1) {
			return true;
		} else {
			AudioBuss var2 = AudioMixer.field8056.method5880().method5851(arg0);
			AudioBuss var3 = AudioMixer.field8056.method5880().method5851(arg1);
			AudioBuss var4 = var2;
			do {
				if (var4 == null) {
					AudioBuss var5 = var3;
					do {
						if (var5 == null) {
							return false;
						}
						var5 = var5.method5904();
						if (var2 == var5) {
							return true;
						}
					} while (var3 != var5);
					return false;
				}
				var4 = var4.method5904();
				if (var3 == var4) {
					return true;
				}
			} while (var2 != var4);
			return false;
		}
	}

	@ObfuscatedName("dh.n(ILjava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;IIII)Ldh;")
	public static synchronized Renderer method2180(int arg0, Canvas arg1, MaterialList arg2, TextureList arg3, BillboardTypeList arg4, ParticleEmitterTypeList arg5, ParticleEffectorTypeList arg6, Js5 arg7, int arg8, int arg9, int arg10) {
		if (arg0 == 0) {
			return method3367(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10);
		} else if (arg0 == 1) {
			return LegacyOpenGLRendererFactory.method1417(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return OpenGLRendererFactory.method7664(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Direct3DRendererFactory.method6218(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("atl.n(Ljava/lang/Throwable;Ljava/lang/String;)Latc;")
	public static JagException method19636(Throwable arg0, String arg1) {
		JagException var2;
		if (arg0 instanceof JagException) {
			var2 = (JagException) arg0;
			var2.field12491 = var2.field12491 + ' ' + arg1;
		} else {
			var2 = new JagException(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("vj.k(BS)C")
	public static char byteToCp1252Char(byte arg0) {
		int var1 = arg0 & 0xFF;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		}
		if (var1 >= 128 && var1 < 160) {
			char var2 = Cp1252.field8326[var1 - 128];
			if (var2 == 0) {
				var2 = '?';
			}
			var1 = var2;
		}
		return (char) var1;
	}

	@ObfuscatedName("zg.bz(III)B")
	public static byte method14062(int arg0, int arg1) {
		if (LocShape.field7547.field7562 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("zi.w(J)I")
	public static int method13899(long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@ObfuscatedName("aam.w(I)I")
	public static int method14611() {
		return 10;
	}

	@ObfuscatedName("tm.l(I)I")
	public static int method8461() {
		return ParticleSystemRenderer.field7802;
	}

	@ObfuscatedName("aqh.u(II)V")
	public static void method19198(int arg0) {
		DelayedStateChange var1 = DelayedStateChange.method5072(4, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("wc.w(B)V")
	public static void method9835() {
		Queue var0 = ClientWatch.field7946;
		synchronized (ClientWatch.field7946) {
			while (true) {
				NativeMouseEvent var1 = (NativeMouseEvent) ClientWatch.field7946.poll();
				if (var1 == null) {
					return;
				}
				var1.method17835();
			}
		}
	}

	@ObfuscatedName("so.u(IZS)Lajo;")
	public static ClientInvCache method8358(int arg0, boolean arg1) {
		long var2 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (ClientInvCache) ClientInvCache.field11220.method14495(var2);
	}

	@ObfuscatedName("ts.p(IIB)I")
	public static int method8658(int arg0, int arg1) {
		int var2 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + var2;
	}

	@ObfuscatedName("gs.x(S)I")
	public static int method3582() {
		return 13;
	}

	@ObfuscatedName("gp.f(B)V")
	public static final void method3486() {
		for (ChangeLocationRequest var0 = (ChangeLocationRequest) ChangeLocationRequest.field11237.method14191(); var0 != null; var0 = (ChangeLocationRequest) ChangeLocationRequest.field11237.method14161()) {
			ChangeLocationRequest.method2834(var0, false);
		}
		for (ChangeLocationRequest var1 = (ChangeLocationRequest) ChangeLocationRequest.field11242.method14191(); var1 != null; var1 = (ChangeLocationRequest) ChangeLocationRequest.field11242.method14161()) {
			ChangeLocationRequest.method2834(var1, true);
		}
	}

	@ObfuscatedName("nw.j(Ljava/awt/Canvas;I)V")
	public static void method6020(Canvas arg0) {
		try {
			Class var1 = Class.forName("java.awt.Canvas");
			Method var2 = var1.getMethod("setIgnoreRepaint", Boolean.TYPE);
			var2.invoke(arg0, Boolean.TRUE);
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("pl.o(Lzb;I)V")
	public static void method6851(CreateAccountReply arg0) {
		field4406 = arg0;
	}

	@ObfuscatedName("vn.l(B)V")
	public static void method9584() {
		if (LoginManager.field445 == 103) {
			LoginManager.field445 = 110;
		}
	}

	@ObfuscatedName("al.m(IB)Ldb;")
	public static TransformInfinityType method713(int arg0) {
		TransformInfinityType var1 = (TransformInfinityType) SerializableEnums.decode(TransformInfinityType.method9164(), arg0);
		if (var1 == null) {
			var1 = TransformInfinityType.field1581;
		}
		return var1;
	}

	@ObfuscatedName("ads.k(Lvy;I)Z")
	public static boolean method15214(KeyHeldBinding arg0) {
		return MiniMenu.method3483(arg0, null);
	}

	@ObfuscatedName("abu.c(Ljava/awt/image/BufferedImage;I)[I")
	public static int[] method14804(BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		Object var1 = null;
		int[] var2 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) var1);
		int[] var3 = new int[arg0.getWidth() * arg0.getHeight()];
		if (arg0.getType() == 10) {
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (var2[var4] << 16) + (var2[var4] << 8) + var2[var4] + -16777216;
			}
		} else {
			for (int var5 = 0; var5 < var3.length; var5++) {
				int var6 = var5 * 2;
				var3[var5] = (var2[var6 + 1] << 24) + var2[var6] + (var2[var6] << 16) + (var2[var6] << 8);
			}
		}
		return var3;
	}

	@ObfuscatedName("uj.p(I)V")
	public static void method9128() {
		if (!TwitchHardwarePlatform.field7384) {
			return;
		}
		int var0 = field11755.ShutdownTTV();
		if (var0 == 0) {
			field11755 = null;
			TwitchHardwarePlatform.field7384 = false;
		}
	}

	@ObfuscatedName("abe.t(II)V")
	public static void method14915(int arg0) {
		field7883 = arg0;
		BasicMouseEvent.field12388 = new BasicMouseEvent[arg0];
		field12384 = 0;
	}

	@ObfuscatedName("tc.ae(IIIJII)Lasf;")
	public static BasicMouseEvent method8438(int arg0, int arg1, int arg2, long arg3, int arg4) {
		BasicMouseEvent[] var6 = BasicMouseEvent.field12388;
		synchronized (BasicMouseEvent.field12388) {
			BasicMouseEvent var7;
			if (field12384 == 0) {
				var7 = new BasicMouseEvent();
			} else {
				var7 = BasicMouseEvent.field12388[--field12384];
			}
			var7.field12385 = arg0;
			var7.field12386 = arg1;
			var7.field12387 = arg2;
			var7.field12389 = arg3;
			var7.field12383 = arg4;
			return var7;
		}
	}

	@ObfuscatedName("ks.x(Lep;Lao;B)I")
	public static int method5179(VarIntDomain arg0, ConfigTypeList arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			QuestType var4 = (QuestType) arg1.list(var3);
			if (var4.method4430(arg0)) {
				var2 += var4.field2637;
			}
		}
		return var2;
	}

	@ObfuscatedName("acd.x(I)V")
	public static void method14941() {
		ClientInvCache.field11221.method2924();
	}

	@ObfuscatedName("kg.l(Laqk;I)V")
	public static void method5142(PlayerEntity arg0) {
		PositionedSound var1 = (PositionedSound) PositionedSound.field11366.method14495((long) arg0.field10406);
		if (var1 == null) {
			return;
		}
		if (var1.field11371 != null) {
			var1.field11371.method7380(100);
			Client.field1798.method3185(var1.field11371);
			var1.field11371 = null;
		}
		var1.method8440();
	}

	@ObfuscatedName("ajh.a(I)V")
	public static void method17428() {
		Client.field10835.closeGracefully();
		if (AccountCreationManager.field580 < 2) {
			WorldSwitcher.lobby.configureSocketType();
			AccountCreationManager.field583 = 0;
			AccountCreationManager.field580++;
			field517 = CreateConnectStage.field515;
		} else {
			field517 = null;
			field584 = ConnectReply.field8363;
			Client.setState(4);
		}
	}

	@ObfuscatedName("kp.m(II)Lhq;")
	public static Interface method5367(int arg0) {
		return Component.field11725[arg0 >> 16];
	}

	@ObfuscatedName("aom.dg(Lhs;B)Z")
	public static boolean method18887(MapElementType arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.field2392 != null) {
			arg0 = arg0.method4024(WorldMap.field6791, WorldMap.field6790);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.field2379) {
			return false;
		} else if (!arg0.method4030(WorldMap.field6791, WorldMap.field6790)) {
			return false;
		} else if (ClientWorldMap.field11667.method14495((long) arg0.field2367) != null) {
			return false;
		} else if (ClientWorldMap.field11668.method14495((long) arg0.field2374) == null) {
			if (arg0.field2370 != null) {
				if (arg0.field2388 == 0 && ClientWorldMap.field11670) {
					return false;
				}
				if (arg0.field2388 == 1 && ClientWorldMap.field11666) {
					return false;
				}
				if (arg0.field2388 == 2 && ClientWorldMap.field11675) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("kr.d(B)V")
	public static void method5326() {
		if (GameShell.cpucount > 1) {
			Client.field688.method18157(Client.field688.cpuUsage, 4);
		} else {
			Client.field688.method18157(Client.field688.cpuUsage, 2);
		}
	}

	@ObfuscatedName("xh.u(IIB)V")
	public static void method10201(int arg0, int arg1) {
		if (MiniMenu.field545 == 1) {
			MiniMenu.method923(field1280, arg0, arg1, false);
		} else if (MiniMenu.field545 == 2) {
			MiniMenu.method14926(arg0, arg1);
		}
		MiniMenu.field545 = 0;
		field1280 = null;
	}

	@ObfuscatedName("dz.r(Ldh;Lvd;IIII)V")
	public static void method1900(Renderer arg0, LocType arg1, int arg2, int arg3, int arg4) {
		MSIType var5 = (MSIType) Client.field4241.list(arg1.field7486);
		if (var5.field9151 == -1) {
			return;
		}
		int var7;
		if (arg1.field7487) {
			int var6 = arg1.field7488 + arg2;
			var7 = var6 & 0x3;
		} else {
			var7 = 0;
		}
		Sprite var8 = var5.method15057(arg0, var7, arg1.field7504);
		if (var8 == null) {
			return;
		}
		int var9 = arg1.width;
		int var10 = arg1.length;
		if ((var7 & 0x1) == 1) {
			var9 = arg1.length;
			var10 = arg1.width;
		}
		int var11 = var8.method1434();
		int var12 = var8.method1436();
		if (var5.field9152) {
			var11 = var9 * 4;
			var12 = var10 * 4;
		}
		if (var5.field9154 == 0) {
			var8.method1474(arg3, arg4 - (var10 - 1) * 4, var11, var12);
		} else {
			var8.method1446(arg3, arg4 - (var10 - 1) * 4, var11, var12, 0, var5.field9154 | 0xFF000000, 1);
		}
	}

	@ObfuscatedName("alb.d(I)I")
	public static int method18304() {
		WeightedCache var0 = PlayerModel.field7901;
		synchronized (PlayerModel.field7901) {
			return PlayerModel.field7901.method2927();
		}
	}

	@ObfuscatedName("xw.v(IB)V")
	public static void method9976(int arg0) {
		WeightedCache var1 = PlayerModel.field7901;
		synchronized (PlayerModel.field7901) {
			PlayerModel.field7901.method2923(arg0);
		}
		WeightedCache var3 = PlayerModel.field7902;
		synchronized (PlayerModel.field7902) {
			PlayerModel.field7902.method2923(arg0);
		}
	}

	@ObfuscatedName("rm.q(Lhf;III)V")
	public static void method7624(Component arg0, int arg1, int arg2) {
		if (Client.field10973) {
			ParamType var3 = (ParamType) (Client.field7677 == -1 ? null : Client.field3086.list(Client.field7677));
			if (Client.method17197(arg0).method17708() && (Client.field1765 & 0x20) != 0 && (var3 == null || arg0.method3950(Client.field7677, var3.defaultInt) != var3.defaultInt)) {
				MiniMenu.method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + arg0.field2279, Client.field1844, 58, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		for (int var4 = 9; var4 >= 5; var4--) {
			String var5 = MiniMenu.method2846(arg0, var4);
			if (var5 != null) {
				MiniMenu.method3042(var5, arg0.field2279, Client.method17826(arg0, var4), 1007, arg0.field2334, (long) (var4 + 1), arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		String var6 = Client.method9557(arg0);
		if (var6 != null) {
			MiniMenu.method3042(var6, arg0.field2279, arg0.field2283, 25, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		}
		for (int var7 = 4; var7 >= 0; var7--) {
			String var8 = MiniMenu.method2846(arg0, var7);
			if (var8 != null) {
				MiniMenu.method3042(var8, arg0.field2279, Client.method17826(arg0, var7), 57, arg0.field2334, (long) (var7 + 1), arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		if (!Client.method17197(arg0).method17689()) {
			return;
		}
		if (arg0.field2180 == null) {
			MiniMenu.method3042(LocalisedText.CONTINUE.method15021(Client.language), "", -1, 30, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		} else {
			MiniMenu.method3042(arg0.field2180, "", -1, 30, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		}
	}

	@ObfuscatedName("ace.q(Ldh;Lch;Lhf;IIIIIB)V")
	public static void method15085(Renderer arg0, GraphicsRelated arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		MapElementType var8 = (MapElementType) Client.field5011.list(arg7);
		if (var8 != null && var8.field2392 != null && var8.method4030(Client.field7410, Client.field7410)) {
			var8 = var8.method4024(Client.field7410, Client.field7410);
		}
		if (var8 == null || !var8.field2404 || !var8.method4030(Client.field7410, Client.field7410)) {
			return;
		}
		if (var8.field2393 != null) {
			int[] var9 = new int[var8.field2393.length];
			for (int var10 = 0; var10 < var9.length / 2; var10++) {
				int var11;
				if (Client.field3416 == 3) {
					var11 = (int) ((double) Client.field9155.method4719() * 2607.5945876176133D) + Client.field10885 & 0x3FFF;
				} else if (Client.field3416 == 4) {
					var11 = (int) Client.field10895 & 0x3FFF;
				} else {
					var11 = Client.field10885 + (int) Client.field10895 & 0x3FFF;
				}
				int var12 = Trig1.field4270[var11];
				int var13 = Trig1.field4272[var11];
				if (Client.field3416 != 4) {
					var12 = var12 * 256 / (Client.field10887 + 256);
					var13 = var13 * 256 / (Client.field10887 + 256);
				}
				var9[var10 * 2] = ((var8.field2393[var10 * 2] * 4 + arg5) * var13 + (var8.field2393[var10 * 2 + 1] * 4 + arg6) * var12 >> 14) + arg2.field2196 / 2 + arg3;
				var9[var10 * 2 + 1] = arg2.field2197 / 2 + arg4 - ((var8.field2393[var10 * 2 + 1] * 4 + arg6) * var13 - (var8.field2393[var10 * 2] * 4 + arg5) * var12 >> 14);
			}
			Graphic var14 = arg2.method3970(arg0);
			if (var14 != null) {
				WorldMapRelated2.method2054(arg0, var9, var8.field2398, var14.field2143, var14.field2145);
			}
			if (var8.field2399 > 0) {
				for (int var15 = 0; var15 < var9.length / 2 - 1; var15++) {
					int var16 = var9[var15 * 2];
					int var17 = var9[var15 * 2 + 1];
					int var18 = var9[(var15 + 1) * 2];
					int var19 = var9[(var15 + 1) * 2 + 1];
					if (var18 < var16) {
						int var20 = var16;
						int var21 = var17;
						var16 = var18;
						var17 = var19;
						var18 = var20;
						var19 = var21;
					} else if (var16 == var18 && var19 < var17) {
						int var22 = var17;
						var17 = var19;
						var19 = var22;
					}
					if (arg1 == null) {
						arg0.method2187(var16, var17, var18, var19, var8.field2406[var8.field2407[var15] & 0xFF], 1, var8.field2399, var8.field2369, var8.field2401);
					} else {
						arg0.method2537(var16, var17, var18, var19, var8.field2406[var8.field2407[var15] & 0xFF], 1, arg1, arg3, arg4, var8.field2399, var8.field2369, var8.field2401);
					}
				}
				int var23 = var9[var9.length - 2];
				int var24 = var9[var9.length - 1];
				int var25 = var9[0];
				int var26 = var9[1];
				if (var25 < var23) {
					int var27 = var23;
					int var28 = var24;
					var23 = var25;
					var24 = var26;
					var25 = var27;
					var26 = var28;
				} else if (var23 == var25 && var26 < var24) {
					int var29 = var24;
					var24 = var26;
					var26 = var29;
				}
				if (arg1 == null) {
					arg0.method2187(var23, var24, var25, var26, var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1, var8.field2399, var8.field2369, var8.field2401);
				} else {
					arg0.method2537(var23, var24, var25, var26, var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1, arg1, arg3, arg4, var8.field2399, var8.field2369, var8.field2401);
				}
			} else if (arg1 == null) {
				for (int var31 = 0; var31 < var9.length / 2 - 1; var31++) {
					arg0.method2185(var9[var31 * 2], var9[var31 * 2 + 1], var9[(var31 + 1) * 2], var9[(var31 + 1) * 2 + 1], var8.field2406[var8.field2407[var31] & 0xFF], 1);
				}
				arg0.method2185(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1);
			} else {
				for (int var30 = 0; var30 < var9.length / 2 - 1; var30++) {
					arg0.method2183(var9[var30 * 2], var9[var30 * 2 + 1], var9[(var30 + 1) * 2], var9[(var30 + 1) * 2 + 1], var8.field2406[var8.field2407[var30] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method2183(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field2406[var8.field2407[var8.field2407.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		Sprite var32 = null;
		if (var8.field2400 != -1) {
			var32 = var8.method4025(arg0, false);
			if (var32 != null) {
				int var33 = var8.field2408 > 0 ? var8.field2408 : Client.field11389.field7730;
				Minimap.method4142(arg2, arg1, arg3, arg4, arg5, arg6, var32, (double) var33, var8.field2365, var8.field2405);
			}
		}
		if (var8.field2370 == null) {
			return;
		}
		int var34 = 0;
		if (var32 != null) {
			var34 = var32.method1435();
		}
		Font var35 = DefaultSprites.field8321;
		FontMetrics var36 = DefaultSprites.field6778;
		if (var8.field2388 == 1) {
			var35 = DefaultSprites.field9184;
			var36 = DefaultSprites.field2657;
		}
		if (var8.field2388 == 2) {
			var35 = DefaultSprites.field10355;
			var36 = DefaultSprites.field10268;
		}
		Minimap.method3654(arg2, arg1, arg3, arg4, arg5, arg6, var34, var8.field2370, var35, var36, var8.field2366);
	}

	@ObfuscatedName("ku.b(IB)Ljava/lang/String;")
	public static String method5153(int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@ObfuscatedName("ab.p([BB)V")
	public static void method987(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		while (true) {
			int var2 = var1.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				EnvironmentManager.field7859 = var1.g2();
			} else if (var2 == 10) {
				var1.g2();
			}
		}
	}

	@ObfuscatedName("acp.x(Lhf;Lhx;IIIIIJ)V")
	public static void method15035(Component arg0, Graphic arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
		int var9 = arg4 * arg4 + arg5 * arg5;
		if ((long) var9 > arg7) {
			return;
		}
		int var10;
		if (Client.field3416 == 3) {
			var10 = (int) ((double) Client.field9155.method4719() * 2607.5945876176133D) + Client.field10885 & 0x3FFF;
		} else if (Client.field3416 == 4) {
			var10 = (int) Client.field10895 & 0x3FFF;
		} else {
			var10 = Client.field10885 + (int) Client.field10895 & 0x3FFF;
		}
		int var11 = Trig1.field4270[var10];
		int var12 = Trig1.field4272[var10];
		if (Client.field3416 != 4) {
			var11 = var11 * 256 / (Client.field10887 + 256);
			var12 = var12 * 256 / (Client.field10887 + 256);
		}
		int var13 = arg4 * var12 + arg5 * var11 >> 14;
		int var14 = arg5 * var12 - arg4 * var11 >> 14;
		Sprite var15 = DefaultSprites.field513[arg6];
		int var16 = var15.method1459();
		int var17 = var15.method1435();
		int var18 = arg0.field2196 / 2 + var13 - var16 / 2;
		int var19 = var16 + var18;
		int var20 = arg0.field2197 / 2 + -var14 - var17;
		int var21 = var17 + var20;
		boolean var22;
		if (arg1 == null) {
			int var24 = var16 / 2;
			var22 = var20 <= -var17 || var21 >= arg0.field2197 || var18 <= -var24 || var19 >= arg0.field2196 + var24;
		} else {
			var22 = !arg1.method3914(var18, var20) || !arg1.method3914(var19, var20) || !arg1.method3914(var18, var21) || !arg1.method3914(var19, var21);
		}
		if (var22) {
			double var25 = Math.atan2((double) var13, (double) var14);
			double var27 = Math.atan2((double) Math.abs(var13), (double) Math.abs(var14));
			double var29 = Math.atan2((double) (arg0.field2196 / 2), (double) (arg0.field2197 / 2));
			boolean var31 = false;
			double var32 = 0.0D;
			double var34;
			int var36;
			if (var27 < var29) {
				var34 = 1.5707963267948966D - var25;
				var36 = arg0.field2197 / 2;
			} else {
				var34 = var25;
				var36 = arg0.field2196 / 2;
			}
			int var37 = Math.abs((int) -((double) var36 * Math.sin(1.5707963267948966D) / Math.sin(var34)));
			DefaultSprites.field6719[arg6].method1450((float) arg0.field2196 / 2.0F + (float) arg2 + 0.0F, (float) arg0.field2197 / 2.0F + (float) arg3 - 0.0F, (float) DefaultSprites.field6719[arg6].method1434() / 2.0F, (float) var37, 4096, (int) (-var25 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			var15.method1439(arg2 + var18, arg3 + var20);
		} else {
			var15.method1444(arg2 + var18, arg3 + var20, arg1.field2147, arg2, arg3);
		}
	}

}
