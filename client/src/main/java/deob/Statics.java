package deob;

import com.jagex.encryption.Isaac;
import com.jagex.game.config.iftype.Component;
import com.jagex.audio.*;
import com.jagex.core.constants.*;
import com.jagex.core.datastruct.*;
import com.jagex.core.utils.*;
import com.jagex.game.compression.huffman.WordPack;
import com.jagex.game.config.iftype.Interface;
import com.jagex.game.config.npctype.NPCHeadIconCustomisation;
import com.jagex.game.load.*;
import com.jagex.game.network.ServerConnection;
import rs2.client.Client;
import rs2.client.clientscript.ScriptRunner;
import rs2.client.login.*;
import rs2.client.login.LoginRelated6;
import rs2.client.logic.chat.ChatHistory;
import com.jagex.game.client.*;
import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.game.config.*;
import com.jagex.game.config.db.DbTableIndex;
import com.jagex.game.config.db.DBUtils;
import com.jagex.game.config.db.dbrowtype.DBRowType;
import com.jagex.game.config.db.dbtabletype.DBTableType;
import com.jagex.game.config.defaults.*;
import com.jagex.game.cutscene.*;
import com.jagex.game.fullscreen.Fullscreen;
import com.jagex.game.group.PlayerGroup;
import com.jagex.game.scene.ChangeLocationRequest;
import com.jagex.game.script.*;
import com.jagex.game.script.activepointers.ActiveComponent;
import com.jagex.game.shared.framework.gwc.GWC;
import com.jagex.game.shared.framework.gwc.GWCLocation;
import com.jagex.game.shared.framework.gwc.GWCWorld;
import com.jagex.game.shared.framework.input.Keyboard;
import com.jagex.game.shared.framework.input.Mouse;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.world.*;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.core.utils.Timer;
import com.jagex.core.io.*;
import rs2.client.logic.clans.ClanChannel;
import rs2.client.logic.clans.ClanChannelUser;
import rs2.client.logic.clans.ClanSettings;
import com.jagex.graphics.camera.CameraEffectType;
import com.jagex.graphics.camera.CameraException;
import com.jagex.graphics.camera.CameraTrackableType;
import com.jagex.graphics.camera.ShakeMode;
import com.jagex.graphics.dx.Direct3DRendererFactory;
import com.jagex.graphics.gl.OpenGLRendererFactory;
import com.jagex.graphics.legacygl.LegacyOpenGLRendererFactory;
import com.jagex.graphics.safe.PureJavaRenderer;
import com.jagex.math.CurveEvaluator;
import com.jagex.math.Spline;
import com.jagex.math.Trig1;
import rs2.client.clientscript.emoji.EmojiList;
import com.jagex.game.clientoptions.Preferences;
import com.jagex.game.shared.console.DeveloperConsole;
import com.jagex.game.compression.huffman.Huffman;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.cursortype.CursorTypeList;
import com.jagex.game.config.enumtype.EnumType;
import com.jagex.game.config.enumtype.EnumTypeList;
import com.jagex.game.config.flotype.FloorOverlayTypeList;
import com.jagex.game.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.config.headbartype.HeadbarTypeList;
import com.jagex.game.config.hitmarktype.HitmarkTypeList;
import com.jagex.game.config.idktype.IDKTypeList;
import com.jagex.game.config.invtype.InvTypeList;
import com.jagex.game.config.lighttype.LightTypeList;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.meltype.MapElementType;
import com.jagex.game.config.meltype.MapElementTypeList;
import com.jagex.game.config.msitype.MSIType;
import com.jagex.game.config.msitype.MSITypeList;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.npctype.NPCTypeList;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.objtype.ObjTypeList;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.paramtype.ParamTypeList;
import com.jagex.game.config.questtype.QuestType;
import com.jagex.game.config.questtype.QuestTypeList;
import com.jagex.game.config.quickchatcattype.QuickChatCatTypeList;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseTypeList;
import com.jagex.game.config.seqgrouptype.SeqGroupTypeList;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.skyboxtype.SkyBoxTypeList;
import com.jagex.game.config.skydecortype.SkyDecorTypeList;
import com.jagex.game.config.effectanimtype.EffectAnimTypeList;
import com.jagex.game.config.structtype.StructTypeList;
import com.jagex.game.config.vartype.SparseVarDomain;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitTypeEncodingKey;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import com.jagex.game.config.vartype.general.VarBasicTypeListClient;
import com.jagex.game.config.vartype.player.VarPlayerTypeListClient;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.js5.Js5CompressionType;
import com.jagex.js5.Js5;
import com.jagex.js5.network.Js5GroupHeader;
import com.jagex.js5.caching.Js5DiskCache;
import com.jagex.js5.network.Js5HttpClient;
import com.jagex.js5.network.Js5Client;
import com.jagex.js5.network.Js5NetResourceProvider;
import com.jagex.js5.network.Js5TcpClient;
import rs2.client.logic.DelayedStateChange;
import rs2.client.logic.friendchat.Friend;
import rs2.client.logic.friendchat.FriendChatUser;
import rs2.client.logic.friendchat.Ignore;
import rs2.client.scene.ObjStackList;
import rs2.client.scene.entities.PathingEntity;
import rs2.client.scene.entities.NpcEntity;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.network.protocol.ServerProt;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamFrameData;

import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class Statics {

	@ObfuscatedName("afh.i")
	public static int field10232;

	@ObfuscatedName("aff.fa")
	public static Js5 field10249;

	@ObfuscatedName("afv.dl")
	public static String field10250;

	@ObfuscatedName("afu.jz")
	public static int field10260;

	@ObfuscatedName("afp.s")
	public static FontMetrics field10268;

	@ObfuscatedName("agg.fn")
	public static Js5 field10287;

	@ObfuscatedName("age.ko")
	public static int field10297;

	@ObfuscatedName("agk.ae")
	public static Sprite[] field10302;

	@ObfuscatedName("agf.jr")
	public static SecureRandom field10311;

	@ObfuscatedName("agd.fw")
	public static Js5 field10317;

	@ObfuscatedName("agq.fz")
	public static long field10353;

	@ObfuscatedName("agr.ti")
	public static PrivateChatFilter field10354;

	@ObfuscatedName("agr.x")
	public static Font field10355;

	@ObfuscatedName("bz.c")
	public static Object field1039;

	@ObfuscatedName("bz.d")
	public static Object field1046;

	@ObfuscatedName("ahw.ch")
	public static FontMetrics field10471;

	@ObfuscatedName("bz.r")
	public static Object field1048;

	@ObfuscatedName("ahq.lq")
	public static int field10518;

	@ObfuscatedName("ahx.c")
	public static short field10538;

	@ObfuscatedName("ahg.jg")
	public static int field10546;

	@ObfuscatedName("ahn.bd")
	public static Sprite field10568;

	@ObfuscatedName("ahe.gv")
	public static HardwarePlatformLoader field10577;

	@ObfuscatedName("ahs.g")
	public static Canvas canvas;

	@ObfuscatedName("ahs.dv")
	public static HardwarePlatform field10581;

	@ObfuscatedName("aij.vn")
	public static int[] field10750;

	@ObfuscatedName("aik.gx")
	public static Js5 field10752;

	@ObfuscatedName("aip.x")
	public static short[][] field10766;

	@ObfuscatedName("client.hi")
	public static SeqGroupTypeList field10771;

	@ObfuscatedName("client.bw")
	public static Namespace field10782;

	@ObfuscatedName("ajo.w")
	public static int field11222;

	@ObfuscatedName("ajw.ck")
	public static IterableQueue field11253;

	@ObfuscatedName("ajf.fi")
	public static Js5 field11262;

	@ObfuscatedName("aje.z")
	public static int[] field11269;

	@ObfuscatedName("cu.q")
	public static float field1137;

	@ObfuscatedName("akp.ib")
	public static GraphicsDefaults field11389;

	@ObfuscatedName("akr.wk")
	public static GarbageCollectorMXBean field11399;

	@ObfuscatedName("akd.cv")
	public static int field11443;

	@ObfuscatedName("alk.an")
	public static int field11642;

	@ObfuscatedName("alj.cp")
	public static int field11654;

	@ObfuscatedName("alv.bn")
	public static Sprite field11699;

	@ObfuscatedName("ala.r")
	public static short field11700;

	@ObfuscatedName("alc.bm")
	public static String osNameRaw;

	@ObfuscatedName("alc.ok")
	public static boolean field11709;

	@ObfuscatedName("alr.e")
	public static volatile NativeMouse field11719;

	@ObfuscatedName("ama.h")
	public static Interface[] field11725;

	@ObfuscatedName("amq.t")
	public static int field11738;

	@ObfuscatedName("amf.gz")
	public static BASTypeList field11742;

	@ObfuscatedName("amo.fv")
	public static Js5 field11752;

	@ObfuscatedName("amm.x")
	public static TwitchTV field11755;

	@ObfuscatedName("amt.jd")
	public static Stream field11764;

	@ObfuscatedName("aml.r")
	public static int field11775;

	@ObfuscatedName("ann.j")
	public static Sprite[] field11793;

	@ObfuscatedName("anq.al")
	public static int field11802;

	@ObfuscatedName("anh.ak")
	public static int field11819;

	@ObfuscatedName("ank.az")
	public static int field11830;

	@ObfuscatedName("ank.bt")
	public static Sprite field11831;

	@ObfuscatedName("anx.ft")
	public static Js5 field11838;

	@ObfuscatedName("aov.ph")
	public static boolean field11883;

	@ObfuscatedName("aol.i")
	public static Applet field11885;

	@ObfuscatedName("aoh.g")
	public static int field11888;

	@ObfuscatedName("apy.c")
	public static int field11891;

	@ObfuscatedName("apj.rf")
	public static int field11893;

	@ObfuscatedName("apn.o")
	public static MinimenuEntry field11913;

	@ObfuscatedName("aph.ek")
	public static Keyboard field11931;

	@ObfuscatedName("aqn.p")
	public static ParticleEffectorTypeList field12041;

	@ObfuscatedName("aqy.a")
	public static Frame fsframe;

	@ObfuscatedName("ari.ig")
	public static VarBasicTypeListClient field12225;

	@ObfuscatedName("cr.bi")
	public static Sprite field1224;

	@ObfuscatedName("arc.r")
	public static int field12241;

	@ObfuscatedName("ch.iu")
	public static Map field1232;

	@ObfuscatedName("arr.l")
	public static Js5 field12325;

	@ObfuscatedName("arr.u")
	public static Js5 field12326;

	@ObfuscatedName("asg.af")
	public static int field12340;

	@ObfuscatedName("cb.oj")
	public static long field1238;

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

	@ObfuscatedName("cz.uk")
	public static int field1267;

	@ObfuscatedName("cj.v")
	public static MinimenuEntry field1280;

	@ObfuscatedName("da.ag")
	public static int field1289;

	@ObfuscatedName("dk.q")
	public static short[][][] field1434;

	@ObfuscatedName("dn.fy")
	public static Js5 field1450;

	@ObfuscatedName("ds.w")
	public static int field1455;

	@ObfuscatedName("ds.n")
	public static int field1456;

	@ObfuscatedName("ds.m")
	public static int field1457;

	@ObfuscatedName("ds.f")
	public static int field1458;

	@ObfuscatedName("ds.e")
	public static int field1459;

	@ObfuscatedName("ds.k")
	public static int[] field1460;

	@ObfuscatedName("ds.l")
	public static int field1461;

	@ObfuscatedName("ds.u")
	public static int field1462;

	@ObfuscatedName("db.ga")
	public static Js5 field1587;

	@ObfuscatedName("eu.br")
	public static Language field1680;

	@ObfuscatedName("eu.lf")
	public static int field1681;

	@ObfuscatedName("ev.jc")
	public static int field1701;

	@ObfuscatedName("ec.i")
	public static Js5 field1707;

	@ObfuscatedName("ek.ix")
	public static WearposDefaults field1709;

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

	@ObfuscatedName("ez.qo")
	public static Component field1734;

	@ObfuscatedName("ea.ak")
	public static int field1748;

	@ObfuscatedName("ea.gs")
	public static DiskStore field1749;

	@ObfuscatedName("ex.pg")
	public static int field1765;

	@ObfuscatedName("ex.to")
	public static ClanChannel field1766;

	@ObfuscatedName("fs.kc")
	public static int field1797;

	@ObfuscatedName("fs.we")
	public static AudioApi field1798;

	@ObfuscatedName("fz.y")
	public static Js5 field1810;

	@ObfuscatedName("fz.bz")
	public static ModeWhere field1811;

	@ObfuscatedName("fj.ie")
	public static VarBasicTypeListClient field1819;

	@ObfuscatedName("ft.fm")
	public static Js5Client field1833;

	@ObfuscatedName("fx.oc")
	public static int field1839;

	@ObfuscatedName("fv.hm")
	public static CachingConfigTypeList field1840;

	@ObfuscatedName("fv.bb")
	public static Font field1841;

	@ObfuscatedName("fw.hy")
	public static ObjTypeList field1842;

	@ObfuscatedName("fa.kx")
	public static int field1843;

	@ObfuscatedName("fp.pj")
	public static int field1844;

	@ObfuscatedName("fq.y")
	public static MinimenuEntry field1846;

	@ObfuscatedName("fl.bf")
	public static int field1847;

	@ObfuscatedName("fo.as")
	public static CursorManager mouseImp;

	@ObfuscatedName("fo.lo")
	public static int field1881;

	@ObfuscatedName("fy.tv")
	public static ClanSettings field1890;

	@ObfuscatedName("fy.kd")
	public static int field1891;

	@ObfuscatedName("fk.wv")
	public static TotpPreferences field1895;

	@ObfuscatedName("fr.hr")
	public static LocTypeList field1897;

	@ObfuscatedName("gq.th")
	public static byte field1914;

	@ObfuscatedName("gp.f")
	public static ParticleSystem[] field1920;

	@ObfuscatedName("gp.u")
	public static int field1921;

	@ObfuscatedName("gy.gk")
	public static Js5 field1935;

	@ObfuscatedName("gc.ah")
	public static Sprite field1940;

	@ObfuscatedName("gh.as")
	public static int[] field1970;

	@ObfuscatedName("gh.bo")
	public static MiniMenuDefaults field1971;

	@ObfuscatedName("gh.hn")
	public static QuestTypeList field1972;

	@ObfuscatedName("gv.al")
	public static int field1981;

	@ObfuscatedName("gj.ua")
	public static int field1983;

	@ObfuscatedName("gd.l")
	public static Map field2010;

	@ObfuscatedName("gz.n")
	public static long field2011;

	@ObfuscatedName("gz.e")
	public static long field2012;

	@ObfuscatedName("gb.do")
	public static BasicParticleEffectorTypeList field2013;

	@ObfuscatedName("hx.gq")
	public static Js5 field2149;

	@ObfuscatedName("hq.bb")
	public static String osArchRaw;

	@ObfuscatedName("hq.tf")
	public static byte field2154;

	@ObfuscatedName("hr.ao")
	public static int field2364;

	@ObfuscatedName("hs.rq")
	public static int field2413;

	@ObfuscatedName("hp.x")
	public static TextureList field2421;

	@ObfuscatedName("he.gb")
	public static CursorTypeList field2427;

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

	@ObfuscatedName("ij.bq")
	public static String osName;

	@ObfuscatedName("io.cl")
	public static int field2606;

	@ObfuscatedName("ig.fl")
	public static Js5 field2613;

	@ObfuscatedName("iv.e")
	public static Huffman huffman;

	@ObfuscatedName("iv.v")
	public static String[] field2615;

	@ObfuscatedName("iu.ui")
	public static int field2626;

	@ObfuscatedName("iu.cy")
	public static int field2627;

	@ObfuscatedName("in.hx")
	public static IDKTypeList field2628;

	@ObfuscatedName("is.lu")
	public static int field2656;

	@ObfuscatedName("is.o")
	public static FontMetrics field2657;

	@ObfuscatedName("iw.or")
	public static int field2676;

	@ObfuscatedName("if.is")
	public static SkillDefaults field2767;

	@ObfuscatedName("ih.il")
	public static CutsceneDefaults field2775;

	@ObfuscatedName("ic.p")
	public static long field2826;

	@ObfuscatedName("jd.pi")
	public static int field2830;

	@ObfuscatedName("jl.k")
	public static LoadingRelated3 field2841;

	@ObfuscatedName("je.ht")
	public static SkyBoxTypeList field2879;

	@ObfuscatedName("jm.ah")
	public static int[] field2899;

	@ObfuscatedName("jm.gc")
	public static Js5 field2900;

	@ObfuscatedName("jm.bm")
	public static int field2901;

	@ObfuscatedName("jr.aa")
	public static int historicCacheId;

	@ObfuscatedName("jr.hg")
	public static HitmarkTypeList field2936;

	@ObfuscatedName("jr.um")
	public static int field2937;

	@ObfuscatedName("ji.e")
	public static LoadingStage[] field2938;

	@ObfuscatedName("ji.n")
	public static LoadingScreen[] field2939;

	@ObfuscatedName("ji.u")
	public static Thread field2940;

	@ObfuscatedName("ji.x")
	public static boolean field2941;

	@ObfuscatedName("ji.d")
	public static String field2942;

	@ObfuscatedName("jv.ae")
	public static int field2960;

	@ObfuscatedName("jg.aw")
	public static int field3005;

	@ObfuscatedName("jh.l")
	public static int field3011;

	@ObfuscatedName("jk.tg")
	public static ClanChannel field3022;

	@ObfuscatedName("jk.ml")
	public static int field3023;

	@ObfuscatedName("kg.ca")
	public static Component field3044;

	@ObfuscatedName("ki.ou")
	public static int field3056;

	@ObfuscatedName("kl.fb")
	public static Js5 field3085;

	@ObfuscatedName("kl.he")
	public static ParamTypeList field3086;

	@ObfuscatedName("kr.ce")
	public static int field3121;

	@ObfuscatedName("km.es")
	public static Spline field3178;

	@ObfuscatedName("ky.bn")
	public static String javaVendor;

	@ObfuscatedName("ky.ji")
	public static AsyncRebuild field3183;

	@ObfuscatedName("kt.q")
	public static MaterialList field3199;

	@ObfuscatedName("la.ak")
	public static String[] historicCacheDirectories;

	@ObfuscatedName("lp.r")
	public static Object field3225;

	@ObfuscatedName("lp.d")
	public static Object field3230;

	@ObfuscatedName("lp.c")
	public static Object field3231;

	@ObfuscatedName("ld.s")
	public static float field3325;

	@ObfuscatedName("mz.iv")
	public static VarBasicTypeListClient field3415;

	@ObfuscatedName("mz.tk")
	public static int field3416;

	@ObfuscatedName("mt.r")
	public static LoadingStage field3419;

	@ObfuscatedName("mt.gd")
	public static EmojiList field3420;

	@ObfuscatedName("mc.su")
	public static Clipboard field3428;

	@ObfuscatedName("mc.ay")
	public static long field3429;

	@ObfuscatedName("nm.jb")
	public static long field3457;

	@ObfuscatedName("no.up")
	public static int field3538;

	@ObfuscatedName("nl.bh")
	public static Sprite field3568;

	@ObfuscatedName("nl.lt")
	public static int field3569;

	@ObfuscatedName("nn.gl")
	public static Js5 field3611;

	@ObfuscatedName("nr.gf")
	public static Js5 field3808;

	@ObfuscatedName("nu.ir")
	public static QuickChatCatTypeList field3823;

	@ObfuscatedName("ns.i")
	public static int field4037;

	@ObfuscatedName("nv.bo")
	public static ModeWhat field4093;

	@ObfuscatedName("on.hh")
	public static MSITypeList field4241;

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

	@ObfuscatedName("pk.by")
	public static String homeDir;

	@ObfuscatedName("pm.e")
	public static LoadableResource[] field4334;

	@ObfuscatedName("m.w")
	public static long field434;

	@ObfuscatedName("m.l")
	public static int[] field435;

	@ObfuscatedName("m.u")
	public static int[] field436;

	@ObfuscatedName("pl.go")
	public static Js5 field4404;

	@ObfuscatedName("pr.l")
	public static CreateAccountReply field4406;

	@ObfuscatedName("pr.y")
	public static String field4407;

	@ObfuscatedName("pg.pq")
	public static int field4427;

	@ObfuscatedName("pj.ex")
	public static Js5HttpClient field4436;

	@ObfuscatedName("pu.fe")
	public static Js5 field4475;

	@ObfuscatedName("pc.fg")
	public static Js5DiskCache field4479;

	@ObfuscatedName("qx.ay")
	public static int field4488;

	@ObfuscatedName("qx.eb")
	public static Js5TcpClient field4489;

	@ObfuscatedName("qx.ns")
	public static PlayerEntity field4490;

	@ObfuscatedName("qz.as")
	public static TwitchEventLiveStreams field4501;

	@ObfuscatedName("qe.cu")
	public static int field4603;

	@ObfuscatedName("ql.f")
	public static int field4608;

	@ObfuscatedName("qr.fh")
	public static Js5 field4618;

	@ObfuscatedName("qi.in")
	public static VariableTypeProvider field4626;

	@ObfuscatedName("qw.gc")
	public static ScriptVarType[] varByLegacyChar;

	@ObfuscatedName("qo.nf")
	public static int field4826;

	@ObfuscatedName("qf.c")
	public static int frameHei;

	@ObfuscatedName("qv.k")
	public static String[] field4845;

	@ObfuscatedName("qk.uj")
	public static int field4857;

	@ObfuscatedName("qn.on")
	public static String field4868;

	@ObfuscatedName("qn.rw")
	public static int field4869;

	@ObfuscatedName("qb.ho")
	public static EffectAnimTypeList field4874;

	@ObfuscatedName("k.u")
	public static boolean field488;

	@ObfuscatedName("k.it")
	public static QuickChatPhraseTypeList field489;

	@ObfuscatedName("rp.hd")
	public static HeadbarTypeList field4894;

	@ObfuscatedName("f.uq")
	public static int field490;

	@ObfuscatedName("rk.r")
	public static SpriteData field4963;

	@ObfuscatedName("rk.p")
	public static String field4964;

	@ObfuscatedName("rg.pe")
	public static int field5009;

	@ObfuscatedName("rz.fq")
	public static Js5 field5010;

	@ObfuscatedName("rz.hs")
	public static MapElementTypeList field5011;

	@ObfuscatedName("l.u")
	public static int field504;

	@ObfuscatedName("l.n")
	public static int field505;

	@ObfuscatedName("l.e")
	public static int field506;

	@ObfuscatedName("l.k")
	public static int field507;

	@ObfuscatedName("rb.e")
	public static NativeLibraryLoader field5077;

	@ObfuscatedName("l.w")
	public static int field508;

	@ObfuscatedName("l.m")
	public static int field509;

	@ObfuscatedName("l.t")
	public static Sprite[] field510;

	@ObfuscatedName("sv.rj")
	public static int field5107;

	@ObfuscatedName("l.z")
	public static int field511;

	@ObfuscatedName("sw.ah")
	public static Sprite field5118;

	@ObfuscatedName("l.d")
	public static int field512;

	@ObfuscatedName("sw.ag")
	public static Model field5129;

	@ObfuscatedName("l.h")
	public static Sprite[] field513;

	@ObfuscatedName("sw.al")
	public static Sprite field5137;

	@ObfuscatedName("l.f")
	public static int field514;

	@ObfuscatedName("u.f")
	public static CreateConnectStage field517;

	@ObfuscatedName("p.n")
	public static Process field520;

	@ObfuscatedName("c.fx")
	public static Js5 field527;

	@ObfuscatedName("r.rm")
	public static int field530;

	@ObfuscatedName("v.u")
	public static int field533;

	@ObfuscatedName("o.ai")
	public static int field554;

	@ObfuscatedName("o.bc")
	public static Sprite field566;

	@ObfuscatedName("o.cp")
	public static String field579;

	@ObfuscatedName("y.n")
	public static int[] field581;

	@ObfuscatedName("y.w")
	public static ConnectReply field584;

	@ObfuscatedName("y.p")
	public static SuggestNameReply field585;

	@ObfuscatedName("y.af")
	public static String[] historicCacheLocations;

	@ObfuscatedName("x.w")
	public static int field592;

	@ObfuscatedName("x.l")
	public static LoadingScreenRenderer field593;

	@ObfuscatedName("x.jm")
	public static PingRequest field594;

	@ObfuscatedName("b.ap")
	public static int archiveCount;

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

	@ObfuscatedName("ae.bt")
	public static String javaVersion;

	@ObfuscatedName("ag.n")
	public static Font field629;

	@ObfuscatedName("ag.e")
	public static Renderer field630;

	@ObfuscatedName("ah.dh")
	public static HostNameProvider field636;

	@ObfuscatedName("ah.us")
	public static long field637;

	@ObfuscatedName("sx.ar")
	public static File cacheDirectory;

	@ObfuscatedName("sk.r")
	public static int canvasWid;

	@ObfuscatedName("sk.p")
	public static int field6587;

	@ObfuscatedName("sk.u")
	public static int field6590;

	@ObfuscatedName("sk.d")
	public static int frameWid;

	@ObfuscatedName("sk.f")
	public static Timer field6594;

	@ObfuscatedName("sk.v")
	public static int canvasHei;

	@ObfuscatedName("sk.au")
	public static File cacheLocator;

	@ObfuscatedName("sk.e")
	public static int field6624;

	@ObfuscatedName("sn.n")
	public static File field6626;

	@ObfuscatedName("sn.al")
	public static FullscreenImpl fsimp14;

	@ObfuscatedName("sh.qn")
	public static int field6656;

	@ObfuscatedName("sy.po")
	public static int field6707;

	@ObfuscatedName("sy.ab")
	public static int field6708;

	@ObfuscatedName("sb.uc")
	public static int field6714;

	@ObfuscatedName("sj.al")
	public static Sprite[] field6719;

	@ObfuscatedName("sj.pt")
	public static int field6720;

	@ObfuscatedName("so.tq")
	public static PlayerGroup field6721;

	@ObfuscatedName("sg.pb")
	public static int field6729;

	@ObfuscatedName("tb.j")
	public static int[] field6767;

	@ObfuscatedName("tw.v")
	public static FontMetrics field6778;

	@ObfuscatedName("tf.m")
	public static LocTypeList field6785;

	@ObfuscatedName("tf.g")
	public static int field6786;

	@ObfuscatedName("tf.bc")
	public static int[] field6787;

	@ObfuscatedName("tf.k")
	public static MapElementTypeList field6788;

	@ObfuscatedName("tf.f")
	public static MSITypeList field6789;

	@ObfuscatedName("tf.w")
	public static VarIntDomain field6790;

	@ObfuscatedName("tf.l")
	public static VariableTypeProvider field6791;

	@ObfuscatedName("tf.u")
	public static WorldMapDefaults field6792;

	@ObfuscatedName("tf.p")
	public static Js5 field6794;

	@ObfuscatedName("tf.d")
	public static Js5 field6795;

	@ObfuscatedName("tf.o")
	public static byte[][][] field6799;

	@ObfuscatedName("tf.bb")
	public static int field6801;

	@ObfuscatedName("tf.ai")
	public static byte[] field6802;

	@ObfuscatedName("tf.x")
	public static float field6803;

	@ObfuscatedName("tf.b")
	public static float field6804;

	@ObfuscatedName("tf.h")
	public static WorldMapRelated field6805;

	@ObfuscatedName("tf.i")
	public static int field6808;

	@ObfuscatedName("tf.ag")
	public static short[] field6809;

	@ObfuscatedName("tf.t")
	public static int field6810;

	@ObfuscatedName("tf.z")
	public static WorldMapAreaMetadata field6811;

	@ObfuscatedName("tf.j")
	public static int field6812;

	@ObfuscatedName("tf.ah")
	public static byte[] field6813;

	@ObfuscatedName("tf.al")
	public static short[] field6814;

	@ObfuscatedName("tf.ac")
	public static short[] field6815;

	@ObfuscatedName("tf.aw")
	public static Object[] field6817;

	@ObfuscatedName("tf.as")
	public static byte[] field6818;

	@ObfuscatedName("tf.ad")
	public static boolean[][] field6820;

	@ObfuscatedName("tf.ay")
	public static java.util.HashMap[][][] field6830;

	@ObfuscatedName("tf.be")
	public static int field6837;

	@ObfuscatedName("tf.bf")
	public static int[] field6838;

	@ObfuscatedName("tf.s")
	public static int field6840;

	@ObfuscatedName("tf.bi")
	public static int[] field6844;

	@ObfuscatedName("tf.bn")
	public static int field6845;

	@ObfuscatedName("tf.bt")
	public static int field6846;

	@ObfuscatedName("tf.bq")
	public static int field6847;

	@ObfuscatedName("tf.bm")
	public static int field6848;

	@ObfuscatedName("tf.by")
	public static int field6851;

	@ObfuscatedName("tf.bu")
	public static int field6852;

	@ObfuscatedName("tf.ae")
	public static int[] field6854;

	@ObfuscatedName("th.ri")
	public static int field6866;

	@ObfuscatedName("tt.tp")
	public static ClanSettings field6867;

	@ObfuscatedName("ac.hc")
	public static SkyDecorTypeList field687;

	@ObfuscatedName("tp.gp")
	public static Js5 field6879;

	@ObfuscatedName("ac.dz")
	public static ClientOptions field688;

	@ObfuscatedName("tg.fj")
	public static Js5NetResourceProvider[] field6888;

	@ObfuscatedName("ai.q")
	public static CutsceneLoadingStage field694;

	@ObfuscatedName("ul.xg")
	public static Iterator field7015;

	@ObfuscatedName("um.t")
	public static Renderer field7041;

	@ObfuscatedName("uc.gn")
	public static Js5 field7060;

	@ObfuscatedName("aw.uz")
	public static int field708;

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

	@ObfuscatedName("uj.ag")
	public static Sprite field7207;

	@ObfuscatedName("uk.sr")
	public static ClientVariableManager field7228;

	@ObfuscatedName("uy.ut")
	public static int field7231;

	@ObfuscatedName("uw.bu")
	public static EventQueue eventQueue;

	@ObfuscatedName("uw.cw")
	public static Sprite field7241;

	@ObfuscatedName("uh.vf")
	public static int field7272;

	@ObfuscatedName("uu.dq")
	public static WorldMapAreaMetadata field7280;

	@ObfuscatedName("uo.dt")
	public static BasicParticleEmitterTypeList field7282;

	@ObfuscatedName("vq.fo")
	public static Js5 field7283;

	@ObfuscatedName("vx.k")
	public static int field7284;

	@ObfuscatedName("vx.nd")
	public static Component field7285;

	@ObfuscatedName("vx.uv")
	public static int field7286;

	@ObfuscatedName("vl.k")
	public static CutsceneLocation[] field7317;

	@ObfuscatedName("at.y")
	public static Sprite field734;

	@ObfuscatedName("ad.gy")
	public static Js5 field736;

	@ObfuscatedName("vo.dd")
	public static MaterialList field7366;

	@ObfuscatedName("am.aa")
	public static int field740;

	@ObfuscatedName("vw.oh")
	public static int field7406;

	@ObfuscatedName("am.ul")
	public static int field741;

	@ObfuscatedName("vu.dj")
	public static PlayerVariableManager field7410;

	@ObfuscatedName("vi.l")
	public static Js5 field7411;

	@ObfuscatedName("va.w")
	public static int field7414;

	@ObfuscatedName("va.d")
	public static Packet field7415;

	@ObfuscatedName("vs.fd")
	public static Js5 field7420;

	@ObfuscatedName("vs.ts")
	public static int field7421;

	@ObfuscatedName("vs.az")
	public static BufferedFile[] cacheIndex;

	@ObfuscatedName("vy.z")
	public static int field7424;

	@ObfuscatedName("vy.h")
	public static Frame frame;

	@ObfuscatedName("vp.bu")
	public static boolean field7446;

	@ObfuscatedName("vp.lh")
	public static int field7447;

	@ObfuscatedName("au.c")
	public static int field753;

	@ObfuscatedName("vh.fr")
	public static Js5 field7537;

	@ObfuscatedName("vh.gj")
	public static FontProvider field7538;

	@ObfuscatedName("au.vk")
	public static List field754;

	@ObfuscatedName("vz.af")
	public static int field7542;

	@ObfuscatedName("vc.en")
	public static Stream field7571;

	@ObfuscatedName("vc.p")
	public static int field7572;

	@ObfuscatedName("vn.y")
	public static short[][] field7577;

	@ObfuscatedName("wo.qb")
	public static Component[] field7603;

	@ObfuscatedName("ap.m")
	public static int field763;

	@ObfuscatedName("wb.p")
	public static int field7642;

	@ObfuscatedName("wb.f")
	public static GWCWorld[] field7644;

	@ObfuscatedName("wb.z")
	public static GWCLocation[] field7647;

	@ObfuscatedName("ap.c")
	public static long field765;

	@ObfuscatedName("wm.aj")
	public static int field7658;

	@ObfuscatedName("wf.dr")
	public static TextureList field7669;

	@ObfuscatedName("wc.ff")
	public static Js5 field7672;

	@ObfuscatedName("wx.k")
	public static PrimaryLayerEntityList field7674;

	@ObfuscatedName("wx.aj")
	public static int field7676;

	@ObfuscatedName("wx.pv")
	public static int field7677;

	@ObfuscatedName("ap.n")
	public static int field768;

	@ObfuscatedName("wh.sq")
	public static SparseVarDomain field7698;

	@ObfuscatedName("ww.hj")
	public static StructTypeList field7713;

	@ObfuscatedName("ap.o")
	public static FileOutputStream field773;

	@ObfuscatedName("wi.hq")
	public static InvTypeList field7762;

	@ObfuscatedName("xl.n")
	public static MovingParticle[] field7794;

	@ObfuscatedName("xu.n")
	public static EnvironmentSampler field7832;

	@ObfuscatedName("xu.m")
	public static SkyBox field7846;

	@ObfuscatedName("xv.el")
	public static boolean field7880;

	@ObfuscatedName("xv.be")
	public static String osVersionRaw;

	@ObfuscatedName("xn.r")
	public static int field7883;

	@ObfuscatedName("xh.iw")
	public static TitleDefaults field7921;

	@ObfuscatedName("xh.ov")
	public static int field7922;

	@ObfuscatedName("xs.ox")
	public static int field7942;

	@ObfuscatedName("xr.hf")
	public static LightTypeList field7943;

	@ObfuscatedName("xc.ku")
	public static int field7950;

	@ObfuscatedName("xb.lr")
	public static int field7956;

	@ObfuscatedName("xb.wr")
	public static HttpClient field7957;

	@ObfuscatedName("xd.hp")
	public static NPCTypeList field7961;

	@ObfuscatedName("xj.z")
	public static long field7966;

	@ObfuscatedName("xf.vj")
	public static int[] field8054;

	@ObfuscatedName("xf.cg")
	public static int field8055;

	@ObfuscatedName("ax.uw")
	public static int field810;

	@ObfuscatedName("yj.iq")
	public static VarBasicTypeListClient field8135;

	@ObfuscatedName("ys.hl")
	public static FloorUnderlayTypeList field8145;

	@ObfuscatedName("ys.bj")
	public static int field8146;

	@ObfuscatedName("yk.m")
	public static int[] field8149;

	@ObfuscatedName("yk.f")
	public static int[] field8150;

	@ObfuscatedName("yk.k")
	public static int[] field8151;

	@ObfuscatedName("yg.hb")
	public static FloorOverlayTypeList field8168;

	@ObfuscatedName("yp.q")
	public static boolean[][] field8182;

	@ObfuscatedName("yz.o")
	public static int field8186;

	@ObfuscatedName("yv.cd")
	public static Renderer field8198;

	@ObfuscatedName("zh.gu")
	public static Js5 field8285;

	@ObfuscatedName("zn.rs")
	public static int field8287;

	@ObfuscatedName("zt.dg")
	public static Client field8301;

	@ObfuscatedName("zy.u")
	public static Js5 field8302;

	@ObfuscatedName("zj.y")
	public static Font field8321;

	@ObfuscatedName("zj.og")
	public static long field8322;

	@ObfuscatedName("zj.b")
	public static Sprite[] field8323;

	@ObfuscatedName("zo.cl")
	public static String field8327;

	@ObfuscatedName("zm.ge")
	public static Js5 field8332;

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

	@ObfuscatedName("aas.ij")
	public static VarPlayerTypeListClient field8485;

	@ObfuscatedName("aar.aw")
	public static boolean focus;

	@ObfuscatedName("aar.td")
	public static int field8492;

	@ObfuscatedName("aaq.hu")
	public static EnumTypeList field8514;

	@ObfuscatedName("aau.kf")
	public static int field8521;

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

	@ObfuscatedName("aaz.tl")
	public static int field8550;

	@ObfuscatedName("aac.uf")
	public static int field8576;

	@ObfuscatedName("aav.ls")
	public static int field8586;

	@ObfuscatedName("abv.fk")
	public static Js5 field8700;

	@ObfuscatedName("af.u")
	public static CheckEmailReply field872;

	@ObfuscatedName("abh.uy")
	public static int field8720;

	@ObfuscatedName("abi.vc")
	public static int field8728;

	@ObfuscatedName("abi.kz")
	public static Packet field8729;

	@ObfuscatedName("abc.hz")
	public static VarBitTypeList field8736;

	@ObfuscatedName("abn.fp")
	public static Js5 field8741;

	@ObfuscatedName("abz.n")
	public static ServerAddress content;

	@ObfuscatedName("abz.e")
	public static ServerAddress lobby;

	@ObfuscatedName("abz.f")
	public static ServerAddress world;

	@ObfuscatedName("abz.l")
	public static ServerAddress field8753;

	@ObfuscatedName("abz.k")
	public static ServerAddress field8755;

	@ObfuscatedName("abz.m")
	public static ServerAddress httpContent;

	@ObfuscatedName("abm.io")
	public static VarBasicTypeListClient field8783;

	@ObfuscatedName("abx.be")
	public static FontMetrics field8786;

	@ObfuscatedName("abe.hw")
	public static SeqTypeList field8797;

	@ObfuscatedName("acm.v")
	public static FontMetrics field8851;

	@ObfuscatedName("aci.wn")
	public static Iterator field8853;

	@ObfuscatedName("acb.ny")
	public static FullscreenMode[] field8871;

	@ObfuscatedName("acw.ln")
	public static int field8910;

	@ObfuscatedName("acw.hv")
	public static VarBasicTypeListClient field8911;

	@ObfuscatedName("bf.al")
	public static int[] field894;

	@ObfuscatedName("acz.gi")
	public static CachingConfigTypeList field9123;

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

	@ObfuscatedName("acj.a")
	public static Sprite[] field9149;

	@ObfuscatedName("aco.uh")
	public static BasicCamera field9155;

	@ObfuscatedName("acl.e")
	public static Random field9158;

	@ObfuscatedName("acs.f")
	public static Applet field9164;

	@ObfuscatedName("acn.di")
	public static byte[][] field9166;

	@ObfuscatedName("adh.ep")
	public static Mouse field9182;

	@ObfuscatedName("adh.oe")
	public static int field9183;

	@ObfuscatedName("adh.q")
	public static Font field9184;

	@ObfuscatedName("adz.w")
	public static ServerAddress field9200;

	@ObfuscatedName("adg.l")
	public static int field9210;

	@ObfuscatedName("adg.da")
	public static BasicBillboardTypeList field9211;

	@ObfuscatedName("adn.fc")
	public static Js5 field9213;

	@ObfuscatedName("adn.ub")
	public static int field9214;

	@ObfuscatedName("adw.bx")
	public static Sprite field9253;

	@ObfuscatedName("adj.s")
	public static int field9256;

	@ObfuscatedName("adm.b")
	public static short[][][] field9259;

	@ObfuscatedName("adx.y")
	public static boolean field9262;

	@ObfuscatedName("ady.tt")
	public static FriendChatUser[] field9267;

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

	@ObfuscatedName("afm.er")
	public static Socket field9774;

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

	@ObfuscatedName("jp.e(IB)Lie;")
	public static CameraEffectType method5101(int arg0) {
		if (CameraEffectType.field2618.field2617 == arg0) {
			return CameraEffectType.field2618;
		} else if (CameraEffectType.field2616.field2617 == arg0) {
			return CameraEffectType.field2616;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ads.e(II)Ljl;")
	public static CameraTrackableType method15213(int arg0) {
		if (CameraTrackableType.field2838.field2840 == arg0) {
			return CameraTrackableType.field2838;
		} else if (CameraTrackableType.field2839.field2840 == arg0) {
			return CameraTrackableType.field2839;
		} else {
			return null;
		}
	}

	@ObfuscatedName("tz.e(I)[Lvn;")
	public static MaterialAlphaMode[] method8501() {
		return new MaterialAlphaMode[] { MaterialAlphaMode.field7573, MaterialAlphaMode.field7575, MaterialAlphaMode.TEST };
	}

	@ObfuscatedName("ua.e(S)[Lvg;")
	public static LocTypeRelated[] method9002() {
		return new LocTypeRelated[] { LocTypeRelated.field7440, LocTypeRelated.field7439, LocTypeRelated.field7438 };
	}

	@ObfuscatedName("ace.e(I)[Lhy;")
	public static MapAlignmentY[] method15088() {
		return new MapAlignmentY[] { MapAlignmentY.field2422, MapAlignmentY.field2426, MapAlignmentY.field2424 };
	}

	@ObfuscatedName("anb.e(I)[Lib;")
	public static BuildAreaSize[] method18813() {
		return new BuildAreaSize[] { BuildAreaSize.field2662, BuildAreaSize.field2661, BuildAreaSize.field2663, BuildAreaSize.field2658, BuildAreaSize.field2659, BuildAreaSize.field2660 };
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

	@ObfuscatedName("cj.e(II)Liu;")
	public static ShakeMode method1599(int arg0) {
		if (ShakeMode.field2625.field2621 == arg0) {
			return ShakeMode.field2625;
		} else if (ShakeMode.field2620.field2621 == arg0) {
			return ShakeMode.field2620;
		} else if (ShakeMode.field2619.field2621 == arg0) {
			return ShakeMode.field2619;
		} else if (ShakeMode.field2622.field2621 == arg0) {
			return ShakeMode.field2622;
		} else if (ShakeMode.field2623.field2621 == arg0) {
			return ShakeMode.field2623;
		} else if (ShakeMode.field2624.field2621 == arg0) {
			return ShakeMode.field2624;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hj.e(I)[Lzx;")
	public static CheckEmailReply[] method4289() {
		return new CheckEmailReply[] { CheckEmailReply.field8397, CheckEmailReply.field8402, CheckEmailReply.field8401, CheckEmailReply.field8400, CheckEmailReply.field8399, CheckEmailReply.field8398 };
	}

	@ObfuscatedName("yk.e(Ljava/lang/CharSequence;B)J")
	public static long method10482(CharSequence arg0) {
		long var1 = 0L;
		int var3 = arg0.length();
		for (int var4 = 0; var4 < var3; var4++) {
			var1 *= 37L;
			char var5 = arg0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += var5 + 1 - 65;
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += var5 + 1 - 97;
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += var5 + 27 - 48;
			}
			if (var1 >= 177917621779460413L) {
				break;
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	@ObfuscatedName("qx.e(B)[Lzd;")
	public static ModeGame[] method7118() {
		return new ModeGame[] { ModeGame.RUNESCAPE, ModeGame.ALTERNATEREALITY, ModeGame.OLDSCAPE, ModeGame.TRANSFORMERS, ModeGame.SCRATCH, ModeGame.STELLARDAWN};
	}

	@ObfuscatedName("abn.n(IIII)I")
	public static int method14756(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return 7 - arg0;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("ka.w(I)Z")
	public static boolean method5216() {
		try {
			if (!NativeMouse.available()) {
				return false;
			}
		} catch (Throwable var2) {
			return false;
		}
		if (field11719 != null) {
			throw new IllegalStateException("");
		}
		field11719 = new NativeMouse();
		Thread var1 = new Thread(new NativeMouseTask());
		var1.setDaemon(true);
		var1.start();
		return true;
	}

	@ObfuscatedName("ke.n(I)Lrn;")
	public static NativeLibraryLoader method5134() {
		if (field5077 == null) {
			throw new IllegalStateException("");
		}
		return field5077;
	}

	@ObfuscatedName("h.n(II)Ljava/lang/String;")
	public static String method596(int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@ObfuscatedName("nd.m(Lalw;I)Ljava/lang/String;")
	public static String method5939(Packet arg0) {
		return WordPack.decode(arg0, 32767);
	}

	@ObfuscatedName("amx.n(I)I")
	public static int method18587() {
		return ChatHistory.field2595 - 1;
	}

	@ObfuscatedName("dd.e(I)[Lks;")
	public static VarBitTypeEncodingKey[] method1624() {
		return new VarBitTypeEncodingKey[] { VarBitTypeEncodingKey.IGNOREOVERLAP, VarBitTypeEncodingKey.DEBUGNAME, VarBitTypeEncodingKey.VARBITNAME_HASH32, VarBitTypeEncodingKey.TRANSMITLEVELOTHER, VarBitTypeEncodingKey.field3071, VarBitTypeEncodingKey.QUESTPOINTS, VarBitTypeEncodingKey.BITS, VarBitTypeEncodingKey.WEALTHEQUIVALENT, VarBitTypeEncodingKey.WARNONDECREASE, VarBitTypeEncodingKey.TRANSMITLEVEL, VarBitTypeEncodingKey.BASEVAR, VarBitTypeEncodingKey.MASTERQUEST, VarBitTypeEncodingKey.SETVARALLOWED, VarBitTypeEncodingKey.field3061, VarBitTypeEncodingKey.SENDTOGAMELOGWORLD};
	}

	@ObfuscatedName("cj.n(Lnr;Laav;B)Lakl;")
	public static ClientMessage method1604(ClientProt arg0, Isaac arg1) {
		ClientMessage var2 = ClientMessage.method7898();
		var2.field11435 = arg0;
		var2.field11431 = arg0.field3807;
		if (var2.field11431 == -1) {
			var2.field11432 = new PacketBit(260);
		} else if (var2.field11431 == -2) {
			var2.field11432 = new PacketBit(10000);
		} else if (var2.field11431 <= 18) {
			var2.field11432 = new PacketBit(20);
		} else if (var2.field11431 <= 98) {
			var2.field11432 = new PacketBit(100);
		} else {
			var2.field11432 = new PacketBit(260);
		}
		var2.field11432.setIsaac(arg1);
		var2.field11432.method19555(var2.field11435.field3806);
		var2.field11430 = 0;
		return var2;
	}

	@ObfuscatedName("jagdx/m.e(CCCC)I")
	public static int method38(char arg0, char arg1, char arg2, char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
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

	@ObfuscatedName("xj.k(Lalw;B)Lkp;")
	public static LoadingScreenProgressDisplayConfig method10312(Packet arg0) {
		LoadingScreenProgressDisplayConfig var1 = LoadingScreenProgressDisplayConfig.method18899(arg0);
		int var2 = arg0.gSmart2or4null();
		int var3 = arg0.gSmart2or4null();
		int var4 = arg0.gSmart2or4null();
		int var5 = arg0.gSmart2or4null();
		int var6 = arg0.gSmart2or4null();
		int var7 = arg0.gSmart2or4null();
		return new LoadingScreenRelated4(var1.field3167, var1.field3159, var1.field3161, var1.field3162, var1.field3163, var1.field3160, var1.field3165, var1.field3166, var1.field3164, var2, var3, var4, var5, var6, var7);
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

	@ObfuscatedName("js.m(Ljava/lang/String;B)V")
	public static void method4943(String arg0) {
		ChatHistory.method2664(0, 0, "", "", "", arg0, null);
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
			ModelUnlit var10 = ModelUnlit.method1931(field9213, arg5, 0);
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
	public static int method6106(short[] arg0, int arg1, LZMARangeDecoder arg2, int arg3) throws IOException {
		int var4 = 1;
		int var5 = 0;
		for (int var6 = 0; var6 < arg3; var6++) {
			int var7 = arg2.method5086(arg0, arg1 + var4);
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

	@ObfuscatedName("qa.e(I)[Lqa;")
	public static BaseVarType[] method7338() {
		return new BaseVarType[] { BaseVarType.field4839, BaseVarType.field4838, BaseVarType.field4836, BaseVarType.INTEGER, BaseVarType.field4837 };
	}

	@ObfuscatedName("wn.f(IIIIIIB)I")
	public static int method9606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg4;
			arg4 = var6;
		}
		int var7 = arg2 & 0x3;
		if (var7 == 0) {
			return arg0;
		} else if (var7 == 1) {
			return arg1;
		} else if (var7 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@ObfuscatedName("sg.m(II)Z")
	public static boolean method8381(int arg0) {
		return arg0 >= LocShape.field7554.field7562 && arg0 <= LocShape.field7546.field7562 || LocShape.field7547.field7562 == arg0;
	}

	@ObfuscatedName("eq.e(Lalw;B)Llv;")
	public static LoginRelated6 method2836(Packet arg0) {
		String var1 = arg0.gjstr();
		LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var4 = arg0.g2s();
		int var5 = arg0.g2s();
		int var6 = arg0.g1();
		int var7 = arg0.g1();
		int var8 = arg0.g1();
		int var9 = arg0.g2();
		int var10 = arg0.g2();
		int var11 = arg0.gSmart2or4null();
		int var12 = arg0.g4s();
		int var13 = arg0.g4s();
		return new LoginRelated6(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
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

	@ObfuscatedName("ji.m(JIZB)Ljava/lang/String;")
	public static String method4984(long arg0, int arg1, boolean arg2) {
		Calendar var4;
		if (arg2) {
			TimeFormatter.method485(arg0);
			var4 = TimeFormatter.field9163;
		} else {
			TimeFormatter.method4389(arg0);
			var4 = TimeFormatter.field9161;
		}
		int var5 = var4.get(5);
		int var6 = var4.get(2) + 1;
		int var7 = var4.get(1);
		int var8 = var4.get(11);
		int var9 = var4.get(12);
		return Integer.toString(var5 / 10) + var5 % 10 + "/" + var6 / 10 + var6 % 10 + "/" + var7 % 100 / 10 + var7 % 10 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
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

	@ObfuscatedName("zt.w(II)Lzt;")
	public static Language method13875(int arg0) {
		return arg0 >= 0 && arg0 < Language.field8300.length ? Language.field8300[arg0] : null;
	}

	@ObfuscatedName("abe.f(IIZI)I")
	public static int method14914(int arg0, int arg1, boolean arg2) {
		int var3 = 0;
		ClientInvCache var4 = method8358(arg0, arg2);
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field11223.length; var5++) {
			if (var4.field11223[var5] >= 0 && ((ObjType) field1842.get(var4.field11223[var5])).field8628 == arg1) {
				var3 += ClientInvCache.method14483(arg0, var5, arg2);
			}
		}
		return var3;
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

	@ObfuscatedName("pr.f(Z[BI)V")
	public static void method6876(boolean arg0, byte[] arg1) {
		if (field7415 == null) {
			field7415 = new Packet(20000);
		}
		field7415.pdata(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		GWC.method570(field7415.data);
		WorldSwitcher.field8748 = new GWCWorld[field533];
		int var2 = 0;
		for (int var3 = field7414; var3 <= field3011; var3++) {
			GWCWorld var4 = GWC.method4944(var3);
			if (var4 != null) {
				WorldSwitcher.field8748[var2++] = var4;
			}
		}
		WorldSwitcher.field8754 = false;
		field2826 = MonotonicTime.method3655();
		field7415 = null;
	}

	@ObfuscatedName("qa.v(Lyf;I)V")
	public static void method7344(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method6966(var1);
	}

	@ObfuscatedName("vj.k(BS)C")
	public static char method9576(byte arg0) {
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

	@ObfuscatedName("tx.i(Lyf;B)V")
	public static void method8883(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) field1972.get(arg0.field8216[arg0.field8226 - 1])).method4430(field7410) ? 1 : 0;
	}

	@ObfuscatedName("gs.x(S)I")
	public static int method3582() {
		return 13;
	}

	@ObfuscatedName("xd.u(B)V")
	public static void method10298() {
		if (DeveloperConsole.field776 * 36 < 102) {
			DeveloperConsole.field776 = DeveloperConsole.field776 * 36 + 6;
		}
		if (DeveloperConsole.field772 != -1 && field765 < MonotonicTime.method3655()) {
			for (int var0 = DeveloperConsole.field772; var0 < field2615.length; var0++) {
				if (field2615[var0].startsWith("pause")) {
					int var1 = 5;
					try {
						var1 = Integer.parseInt(field2615[var0].substring(6));
					} catch (Exception var14) {
					}
					DeveloperConsole.addline("Pausing for " + var1 + " seconds...");
					DeveloperConsole.field772 = var0 + 1;
					field765 = MonotonicTime.method3655() + (long) (var1 * 1000);
					return;
				}
				DeveloperConsole.currententry = field2615[var0];
				DeveloperConsole.method14718(false);
			}
			DeveloperConsole.field772 = -1;
		}
		if (Client.field10817 != 0) {
			DeveloperConsole.field771 -= Client.field10817 * 5;
			if (DeveloperConsole.field771 >= DeveloperConsole.field764) {
				DeveloperConsole.field771 = DeveloperConsole.field764 - 1;
			}
			if (DeveloperConsole.field771 < 0) {
				DeveloperConsole.field771 = 0;
			}
			Client.field10817 = 0;
		}
		for (int var3 = 0; var3 < Client.field10819; var3++) {
			KeyboardEvent var4 = Client.field11067[var3];
			int var5 = var4.method9141();
			char var6 = var4.method9131();
			int var7 = var4.method9134();
			if (var5 == 84) {
				DeveloperConsole.method14718(false);
			}
			if (var5 == 80) {
				DeveloperConsole.method14718(true);
			} else if (var5 == 66 && (var7 & 0x4) != 0) {
				if (field3428 != null) {
					String var8 = "";
					for (int var9 = field4845.length - 1; var9 >= 0; var9--) {
						if (field4845[var9] != null && field4845[var9].length() > 0) {
							var8 = var8 + field4845[var9] + '\n';
						}
					}
					field3428.setContents(new StringSelection(var8), null);
				}
			} else if (var5 == 67 && (var7 & 0x4) != 0) {
				if (field3428 != null) {
					try {
						Transferable var10 = field3428.getContents(null);
						if (var10 != null) {
							String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
							if (var11 != null) {
								String[] var12 = StringUtils.method17361(var11, '\n');
								DeveloperConsole.method15383(var12);
							}
						}
					} catch (Exception var15) {
					}
				}
			} else if (var5 == 85 && DeveloperConsole.commandcharpointer > 0) {
				DeveloperConsole.currententry = DeveloperConsole.currententry.substring(0, DeveloperConsole.commandcharpointer - 1) + DeveloperConsole.currententry.substring(DeveloperConsole.commandcharpointer);
				DeveloperConsole.commandcharpointer--;
			} else if (var5 == 101 && DeveloperConsole.commandcharpointer < DeveloperConsole.currententry.length()) {
				DeveloperConsole.currententry = DeveloperConsole.currententry.substring(0, DeveloperConsole.commandcharpointer) + DeveloperConsole.currententry.substring(DeveloperConsole.commandcharpointer + 1);
			} else if (var5 == 96 && DeveloperConsole.commandcharpointer > 0) {
				DeveloperConsole.commandcharpointer--;
			} else if (var5 == 97 && DeveloperConsole.commandcharpointer < DeveloperConsole.currententry.length()) {
				DeveloperConsole.commandcharpointer++;
			} else if (var5 == 102) {
				DeveloperConsole.commandcharpointer = 0;
			} else if (var5 == 103) {
				DeveloperConsole.commandcharpointer = DeveloperConsole.currententry.length();
			} else if (var5 == 104 && DeveloperConsole.commandpointer < field4845.length) {
				DeveloperConsole.commandpointer++;
				DeveloperConsole.method3085();
				DeveloperConsole.commandcharpointer = DeveloperConsole.currententry.length();
			} else if (var5 == 105 && DeveloperConsole.commandpointer > 0) {
				DeveloperConsole.commandpointer--;
				DeveloperConsole.method3085();
				DeveloperConsole.commandcharpointer = DeveloperConsole.currententry.length();
			} else if (StringUtils.method2883(var6) || "\\/.:, _-+[]~@".indexOf(var6) != -1) {
				DeveloperConsole.currententry = DeveloperConsole.currententry.substring(0, DeveloperConsole.commandcharpointer) + Client.field11067[var3].method9131() + DeveloperConsole.currententry.substring(DeveloperConsole.commandcharpointer);
				DeveloperConsole.commandcharpointer++;
			}
		}
		Client.field10819 = 0;
		Client.field10822 = 0;
		Client.method9734();
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

	@ObfuscatedName("sj.g(Lyf;B)V")
	public static void method8356(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[arg0.field8226] = method4596(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1]);
		arg0.field8226++;
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

	@ObfuscatedName("akc.y(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
	public static String method17687(String arg0, char arg1, String arg2) {
		int var3 = arg0.length();
		int var4 = arg2.length();
		int var5 = var3;
		int var6 = var4 - 1;
		if (var6 != 0) {
			int var7 = 0;
			while (true) {
				var7 = arg0.indexOf(arg1, var7);
				if (var7 < 0) {
					break;
				}
				var7++;
				var5 += var6;
			}
		}
		StringBuilder var8 = new StringBuilder(var5);
		int var9 = 0;
		while (true) {
			int var10 = arg0.indexOf(arg1, var9);
			if (var10 < 0) {
				var8.append(arg0.substring(var9));
				return var8.toString();
			}
			var8.append(arg0.substring(var9, var10));
			var8.append(arg2);
			var9 = var10 + 1;
		}
	}

	@ObfuscatedName("amc.e(I)[Lnz;")
	public static ServerProt[] method18494() {
		return new ServerProt[] { ServerProt.TELEMETRY_GRID_ADD_GROUP, ServerProt.ENVIRONMENT_OVERRIDE, ServerProt.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, ServerProt.CREATE_CHECK_EMAIL_REPLY, ServerProt.PROJANIM_SPECIFIC, ServerProt.CAM_LOOKAT, ServerProt.UPDATE_INV_FULL, ServerProt.MESSAGE_PRIVATE_ECHO, ServerProt.MESSAGE_PUBLIC, ServerProt.REBUILD_REGION, ServerProt.UPDATE_SITESETTINGS, ServerProt.NPC_ANIM_SPECIFIC, ServerProt.RESET_ANIMS, ServerProt.MAP_PROJANIM, ServerProt.SET_PLAYER_OP, ServerProt.TELEMETRY_GRID_VALUES_DELTA, ServerProt.UPDATE_INV_PARTIAL, ServerProt.MIDI_SONG, ServerProt.SET_MOVEACTION, ServerProt.CREATE_SUGGEST_NAME_ERROR, ServerProt.TELEMETRY_GRID_ADD_COLUMN, ServerProt.CLIENT_SETVARCSTR_LARGE, ServerProt.MESSAGE_CLANCHANNEL, ServerProt.UPDATE_FRIENDCHAT_CHANNEL_FULL, ServerProt.EXECUTE_CLIENT_CHEAT, ServerProt.FRIENDLIST_LOADED, ServerProt.IF_OPENSUB_ACTIVE_LOC, ServerProt.CLEAR_PLAYER_SNAPSHOT, ServerProt.UPDATE_STOCKMARKET_SLOT, ServerProt.SONG_PRELOAD, ServerProt.CLIENT_SETVARCSTR_SMALL, ServerProt.IF_SETTEXTFONT, ServerProt.TELEMETRY_GRID_REMOVE_COLUMN, ServerProt.UPDATE_STAT, ServerProt.LOC_CUSTOMISE, ServerProt.IF_OPENTOP, ServerProt.MESSAGE_FRIENDCHANNEL, ServerProt.VORBIS_SOUND, ServerProt.IF_OPENSUB, ServerProt.TELEMETRY_GRID_MOVE_COLUMN, ServerProt.PLAYER_GROUP_FULL, ServerProt.MESSAGE_PLAYER_GROUP, ServerProt.VORBIS_SOUND_GROUP, ServerProt.IF_SETPLAYERHEAD, ServerProt.VARBIT_SMALL, ServerProt.LOC_DEL, ServerProt.UPDATE_FRIENDLIST, ServerProt.SHOW_FACE_HERE, ServerProt.SEND_PING, ServerProt.OBJ_DEL, ServerProt.VARP_LARGE, ServerProt.field3853, ServerProt.DEBUG_SERVER_TRIGGERS, ServerProt.UPDATE_UID192, ServerProt.CLIENT_SETVARCBIT_SMALL, ServerProt.MIDI_JINGLE, ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerProt.LOGOUT_TRANSFER, ServerProt.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerProt.CLANCHANNEL_FULL, ServerProt.URL_OPEN, ServerProt.IF_OPENSUB_ACTIVE_PLAYER, ServerProt.IF_SETPLAYERHEAD_OTHER, ServerProt.IF_SETRECOL, ServerProt.CAM_REMOVEROOF, ServerProt.UPDATE_INV_STOP_TRANSMIT, ServerProt.CREATE_SUGGEST_NAME_REPLY, ServerProt.PLAYER_SNAPSHOT, ServerProt.TELEMETRY_GRID_REMOVE_GROUP, ServerProt.CLIENT_SETVARCBIT_LARGE, ServerProt.SOUND_AREA, ServerProt.MAP_PROJANIM_HALFSQ, ServerProt.IF_SETPOSITION, ServerProt.OBJ_COUNT, ServerProt.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerProt.TELEMETRY_GRID_FULL, ServerProt.SETDRAWORDER, ServerProt.SOCIAL_NETWORK_LOGOUT, ServerProt.HINT_ARROW, ServerProt.IF_SETSCROLLPOS, ServerProt.MESSAGE_QUICKCHAT_PRIVATE, ServerProt.CAM2_ENABLE, ServerProt.MESSAGE_CLANCHANNEL_SYSTEM, ServerProt.NO_TIMEOUT, ServerProt.LOC_ANIM_SPECIFIC, ServerProt.OBJ_ADD, ServerProt.LOGOUT_FULL, ServerProt.CAM_SMOOTHRESET, ServerProt.REBUILD_NORMAL, ServerProt.MESSAGE_QUICKCHAT_CLANCHANNEL, ServerProt.MESSAGE_PRIVATE, ServerProt.VARCLAN_DISABLE, ServerProt.VORBIS_SOUND_GROUP_START, ServerProt.MESSAGE_QUICKCHAT_PRIVATE_ECHO, ServerProt.SET_MAP_FLAG, ServerProt.VORBIS_SOUND_GROUP_STOP, ServerProt.TELEMETRY_GRID_MOVE_ROW, ServerProt.VORBIS_PRELOAD_SOUNDS, ServerProt.CAM_MOVETO, ServerProt.RESET_CLIENT_VARCACHE, ServerProt.IF_SETPLAYERMODEL_OTHER, ServerProt.CLANSETTINGS_FULL, ServerProt.IF_OPENSUB_ACTIVE_NPC, ServerProt.IF_SETANIM, ServerProt.CAM_RESET, ServerProt.LOBBY_APPEARANCE, ServerProt.VARCLAN_ENABLE, ServerProt.POINTLIGHT_COLOUR, ServerProt.IF_SETRETEX, ServerProt.IF_SETHIDE, ServerProt.LAST_LOGIN_INFO, ServerProt.REFLECTION_CHECKER, ServerProt.IF_SETANGLE, ServerProt.TEXT_COORD, ServerProt.VORBIS_SPEECH_STOP, ServerProt.VORBIS_PRELOAD_SOUND_GROUP, ServerProt.IF_SETMODEL, ServerProt.DO_CHEAT, ServerProt.OBJ_REVEAL, ServerProt.HINT_TRAIL, ServerProt.MESSAGE_GAME, ServerProt.IF_OPENSUB_ACTIVE_OBJ, ServerProt.PLAYER_INFO, ServerProt.SOUND_MIXBUSS_ADD, ServerProt.LOC_PREFETCH, ServerProt.NPC_HEADICON_SPECIFIC, ServerProt.UPDATE_DOB, ServerProt.MIDI_SONG_LOCATION, ServerProt.CLIENT_SETVARC_LARGE, ServerProt.SERVER_TICK_END, ServerProt.IF_SETPLAYERHEAD_IGNOREWORN, ServerProt.CREATE_ACCOUNT_REPLY, ServerProt.CLANSETTINGS_DELTA, ServerProt.TRIGGER_ONDIALOGABORT, ServerProt.REDUCE_PLAYER_ATTACK_PRIORITY, ServerProt.IF_SET_HTTP_IMAGE, ServerProt.CUTSCENE, ServerProt.MINIMAP_TOGGLE, ServerProt.CHAT_FILTER_SETTINGS, ServerProt.LOC_ADD_CHANGE, ServerProt.IF_SETCOLOUR, ServerProt.REDUCE_NPC_ATTACK_PRIORITY, ServerProt.VARBIT_LARGE, ServerProt.VORBIS_SPEECH_SOUND, ServerProt.POINTLIGHT_INTENSITY, ServerProt.MESSAGE_QUICKCHAT_FRIENDCHAT, ServerProt.CLANCHANNEL_DELTA, ServerProt.LOC_ANIM, ServerProt.STORE_SERVERPERM_VARCS_ACK, ServerProt.CLIENT_SETVARC_SMALL, ServerProt.SET_TARGET, ServerProt.IF_SETPLAYERMODEL_SELF, ServerProt.CAMERA_UPDATE, ServerProt.JS5_RELOAD, ServerProt.CHANGE_LOBBY, ServerProt.IF_SETEVENTS, ServerProt.RUNCLIENTSCRIPT, ServerProt.VARP_SMALL, ServerProt.IF_SETOBJECT, ServerProt.PLAYER_GROUP_VARPS, ServerProt.TELEMETRY_GRID_REMOVE_ROW, ServerProt.UPDATE_RUNENERGY, ServerProt.SOUND_MIXBUSS_SETLEVEL, ServerProt.CREATE_CHECK_NAME_REPLY, ServerProt.CAM_FORCEANGLE, ServerProt.IF_SETTEXTANTIMACRO, ServerProt.IF_CLOSESUB, ServerProt.WORLDLIST_FETCH_REPLY, ServerProt.LOGOUT, ServerProt.UPDATE_RUNWEIGHT, ServerProt.field3996, ServerProt.CAM_SHAKE, ServerProt.VARCLAN, ServerProt.TELEMETRY_GRID_SET_ROW_PINNED, ServerProt.UPDATE_IGNORELIST, ServerProt.UPDATE_ZONE_FULL_FOLLOWS, ServerProt.MESSAGE_QUICKCHAT_PLAYER_GROUP, ServerProt.UPDATE_REBOOT_TIMER, ServerProt.SPOTANIM_SPECIFIC, ServerProt.IF_SETTARGETPARAM, ServerProt.IF_SETPLAYERMODEL_SNAPSHOT, ServerProt.IF_SETTEXT, ServerProt.SYNTH_SOUND, ServerProt.IF_SETGRAPHIC, ServerProt.IF_SETCLICKMASK, ServerProt.TELEMETRY_GRID_ADD_ROW, ServerProt.NPC_INFO, ServerProt.PLAYER_GROUP_DELTA, ServerProt.LOYALTY_UPDATE, ServerProt.IF_SETNPCHEAD, ServerProt.MIDI_SONG_STOP, ServerProt.IF_MOVESUB, ServerProt.TELEMETRY_CLEAR_GRID_VALUE, ServerProt.MAP_ANIM, ServerProt.JCOINS_UPDATE};
	}

	@ObfuscatedName("fi.at(III)V")
	public static void method3073(int arg0, int arg1) {
		DelayedStateChange var2 = DelayedStateChange.method5072(5, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("akv.x(CI)Z")
	public static boolean method17828(char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
		}
	}

	@ObfuscatedName("qw.w(CB)Lqw;")
	public static ScriptVarType method7300(char arg0) {
		return arg0 == 'O' ? ScriptVarType.OBJ : varByLegacyChar[Cp1252.encode(arg0) & 0xFF];
	}

	@ObfuscatedName("ks.x(Lep;Lao;B)I")
	public static int method5179(VarIntDomain arg0, ConfigTypeList arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg1.size(); var3++) {
			QuestType var4 = (QuestType) arg1.get(var3);
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

	@ObfuscatedName("ub.ap(IIIII)V")
	public static void method9085(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = DelayedStateChange.method5072(10, (long) arg0);
		var4.method19269();
		var4.field12268 = arg1;
		var4.field12274 = arg2;
		var4.field12267 = arg3;
	}

	@ObfuscatedName("kg.l(Laqk;I)V")
	public static void method5142(PlayerEntity arg0) {
		PositionedSound var1 = (PositionedSound) PositionedSound.field11366.method14495((long) arg0.field10406);
		if (var1 == null) {
			return;
		}
		if (var1.field11371 != null) {
			var1.field11371.method7380(100);
			field1798.method3185(var1.field11371);
			var1.field11371 = null;
		}
		var1.method8440();
	}

	@ObfuscatedName("ajh.a(I)V")
	public static void method17428() {
		Client.field10835.method938();
		if (AccountCreationManager.field580 < 2) {
			lobby.method14758();
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
		return field11725[arg0 >> 16];
	}

	@ObfuscatedName("eo.l(Ljava/lang/Float;Ljava/lang/Float;I)V")
	public static void method2672(Float arg0, Float arg1) {
		if (arg0 + CurveEvaluator.field1287 >= 1.3333334F) {
			Float var9 = 1.3333334F - CurveEvaluator.field1287;
			Float var10 = 0.33333334F - CurveEvaluator.field1287;
			return;
		}
		float var2 = arg0 - 2.0F;
		float var3 = arg0 - 1.0F;
		float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
		float var5 = (-var2 + var4) * 0.5F;
		if (arg1 + CurveEvaluator.field1287 > var5) {
			Float var6 = var5 - CurveEvaluator.field1287;
		} else {
			float var7 = (-var2 - var4) * 0.5F;
			if (arg1 < CurveEvaluator.field1287 + var7) {
				Float var8 = CurveEvaluator.field1287 + var7;
			}
		}
	}

	@ObfuscatedName("am.p(Luh;III)V")
	public static void method830(ClientTriggerType arg0, int arg1, int arg2) {
		ClientScriptState var3 = ScriptRunner.method1516();
		ScriptRunner.method4374(arg0, arg1, arg2, var3);
	}

	@ObfuscatedName("fi.w(S)Ljava/io/File;")
	public static File method3068() {
		return cacheDirectory;
	}

	@ObfuscatedName("aom.dg(Lhs;B)Z")
	public static boolean method18887(MapElementType arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.field2392 != null) {
			arg0 = arg0.method4024(field6791, field6790);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.field2379) {
			return false;
		} else if (!arg0.method4030(field6791, field6790)) {
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
			field688.method18157(field688.cpuUsage, 4);
		} else {
			field688.method18157(field688.cpuUsage, 2);
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
		MSIType var5 = (MSIType) field4241.get(arg1.field7486);
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
		int var9 = arg1.field7499;
		int var10 = arg1.field7492;
		if ((var7 & 0x1) == 1) {
			var9 = arg1.field7492;
			var10 = arg1.field7499;
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

	@ObfuscatedName("qi.ai([BB)[B")
	public static final byte[] method7275(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		Js5GroupHeader var2 = new Js5GroupHeader(var1);
		Js5CompressionType var3 = var2.method7080();
		int var4 = var2.method7081();
		if (var4 < 0 || Js5.field4419 != 0 && var4 > Js5.field4419) {
			throw new RuntimeException();
		} else if (Js5CompressionType.field4434 == var3) {
			byte[] var5 = new byte[var4];
			var1.gdata(var5, 0, var4);
			return var5;
		} else {
			int var6 = var2.method7091();
			if (var6 < 0 || Js5.field4419 != 0 && var6 > Js5.field4419) {
				throw new RuntimeException();
			}
			byte[] var7;
			if (Js5CompressionType.field4430 == var3) {
				var7 = new byte[var6];
				BZip2.method14100(var7, var6, arg0, var4, 9);
			} else if (Js5CompressionType.field4432 == var3) {
				var7 = new byte[var6];
				GZip var8 = Js5.field4409;
				synchronized (Js5.field4409) {
					Js5.field4409.method15245(var1, var7);
				}
			} else if (Js5CompressionType.LZMA == var3) {
				try {
					var7 = LZMA.method8503(var1, var6);
				} catch (IOException var11) {
					throw new RuntimeException(var11);
				}
			} else {
				throw new RuntimeException();
			}
			return var7;
		}
	}

	@ObfuscatedName("xt.ac(IIB)V")
	public static void method10361(int arg0, int arg1) {
		TwitchEventResult var2 = new TwitchEventResult(arg0, arg1);
		TwitchVarType var3 = var2.method11();
		if (var3 != null) {
			ScriptRunner.method13907(var3.getId(), var2);
		}
	}

	@ObfuscatedName("iy.as(III)I")
	public static int method4596(int arg0, int arg1) {
		TwitchHardwarePlatform.field7391 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < TwitchHardwarePlatform.field7395.length ? field11755.StartWebcamDevice(TwitchHardwarePlatform.field7395[arg0].field239, arg1) : -1;
	}

	@ObfuscatedName("alb.d(I)I")
	public static int method18304() {
		WeightedCache var0 = PlayerModel.field7901;
		synchronized (PlayerModel.field7901) {
			return PlayerModel.field7901.method2927();
		}
	}

	@ObfuscatedName("ks.ad(S)V")
	public static void method5177() {
		TwitchHardwarePlatform.field7395 = field11755.GetWebcamDevices();
	}

	@ObfuscatedName("fq.am(I)I")
	public static int method3123() {
		return TwitchHardwarePlatform.field7395 == null ? 0 : TwitchHardwarePlatform.field7395.length;
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

	@ObfuscatedName("dk.ap(ZZI)V")
	public static void method2011(boolean arg0, boolean arg1) {
		TwitchHardwarePlatform.field7376 = arg0;
		TwitchHardwarePlatform.field7383 = arg1;
	}

	@ObfuscatedName("rm.q(Lhf;III)V")
	public static void method7624(Component arg0, int arg1, int arg2) {
		if (Client.field10973) {
			ParamType var3 = (ParamType) (field7677 == -1 ? null : field3086.get(field7677));
			if (Client.method17197(arg0).method17708() && (field1765 & 0x20) != 0 && (var3 == null || arg0.method3950(field7677, var3.field9172) != var3.field9172)) {
				MiniMenu.method3042(Client.field11039, Client.field10977 + " " + TextUtil.ARROW + " " + arg0.field2279, field1844, 58, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		for (int var4 = 9; var4 >= 5; var4--) {
			String var5 = MiniMenu.method2846(arg0, var4);
			if (var5 != null) {
				MiniMenu.method3042(var5, arg0.field2279, method17826(arg0, var4), 1007, arg0.field2334, (long) (var4 + 1), arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		String var6 = Client.method9557(arg0);
		if (var6 != null) {
			MiniMenu.method3042(var6, arg0.field2279, arg0.field2283, 25, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		}
		for (int var7 = 4; var7 >= 0; var7--) {
			String var8 = MiniMenu.method2846(arg0, var7);
			if (var8 != null) {
				MiniMenu.method3042(var8, arg0.field2279, method17826(arg0, var7), 57, arg0.field2334, (long) (var7 + 1), arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
			}
		}
		if (!Client.method17197(arg0).method17689()) {
			return;
		}
		if (arg0.field2180 == null) {
			MiniMenu.method3042(LocalisedText.CONTINUE.method15021(field1680), "", -1, 30, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		} else {
			MiniMenu.method3042(arg0.field2180, "", -1, 30, arg0.field2334, 0L, arg0.field2183, arg0.field2158, true, false, (long) (arg0.field2183 << 32 | arg0.field2158), false);
		}
	}

	@ObfuscatedName("f.a(Ljava/lang/Object;I)V")
	public static void method218(Object arg0) {
		if (eventQueue == null) {
			return;
		}
		for (int var1 = 0; var1 < 50 && eventQueue.peekEvent() != null; var1++) {
			PreciseSleep.sleep(1L);
		}
		try {
			if (arg0 != null) {
				eventQueue.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("ace.q(Ldh;Lch;Lhf;IIIIIB)V")
	public static void method15085(Renderer arg0, GraphicsRelated arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		MapElementType var8 = (MapElementType) field5011.get(arg7);
		if (var8 != null && var8.field2392 != null && var8.method4030(field7410, field7410)) {
			var8 = var8.method4024(field7410, field7410);
		}
		if (var8 == null || !var8.field2404 || !var8.method4030(field7410, field7410)) {
			return;
		}
		if (var8.field2393 != null) {
			int[] var9 = new int[var8.field2393.length];
			for (int var10 = 0; var10 < var9.length / 2; var10++) {
				int var11;
				if (field3416 == 3) {
					var11 = (int) ((double) field9155.method4719() * 2607.5945876176133D) + Client.field10885 & 0x3FFF;
				} else if (field3416 == 4) {
					var11 = (int) Client.field10895 & 0x3FFF;
				} else {
					var11 = Client.field10885 + (int) Client.field10895 & 0x3FFF;
				}
				int var12 = Trig1.field4270[var11];
				int var13 = Trig1.field4272[var11];
				if (field3416 != 4) {
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
				int var33 = var8.field2408 > 0 ? var8.field2408 : field11389.field7730;
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
		Font var35 = field8321;
		FontMetrics var36 = field6778;
		if (var8.field2388 == 1) {
			var35 = field9184;
			var36 = field2657;
		}
		if (var8.field2388 == 2) {
			var35 = field10355;
			var36 = field10268;
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

	@ObfuscatedName("ey.eo(II)V")
	public static void method2678(int arg0) {
		byte var1;
		if (arg0 == 0) {
			var1 = 0;
		} else if (arg0 == 1) {
			var1 = 1;
		} else if (arg0 == 2) {
			var1 = 2;
		} else {
			return;
		}
		byte var2;
		if ((double) field6804 == 2.0D) {
			var2 = 0;
		} else if ((double) field6804 == 3.0D) {
			var2 = 1;
		} else if ((double) field6804 == 4.0D) {
			var2 = 2;
		} else if ((double) field6804 == 6.0D) {
			var2 = 3;
		} else if ((double) field6804 >= 8.0D) {
			var2 = 4;
		} else {
			return;
		}
		field717 = ClientWorldMap.field11659[var1][var2];
		field10471 = ClientWorldMap.field11660[var1][var2];
	}

	@ObfuscatedName("gc.eu(Ldh;IIIIB)V")
	public static final void method3549(Renderer arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0.method2168(arg1, arg2, arg1 + arg3, arg2 + arg4);
		arg0.method2301(arg1, arg2, arg3, arg4, -16777216);
		if (ClientWorldMap.field11651 < 100) {
			return;
		}
		float var5 = (float) field6810 / (float) field6812;
		int var6 = arg3;
		int var7 = arg4;
		if (var5 < 1.0F) {
			var7 = (int) ((float) arg3 * var5);
		} else {
			var6 = (int) ((float) arg4 / var5);
		}
		int var8 = (arg3 - var6) / 2 + arg1;
		int var9 = (arg4 - var7) / 2 + arg2;
		if (field7241 == null || field7241.method1459() != var6 || field7241.method1435() != var7) {
			ClientWorldMap.field6833 = ClientWorldMap.field6832;
			ClientWorldMap.method8620(field6786, field6810 + field6808, field6812 + field6786, field6808, var8, var9, var6 + var8, var7 + var9);
			ClientWorldMap.method8523(arg0, false, false, Client.field10948, true);
			arg0.method2202();
			field7241 = arg0.method2314(var8, var9, var6, var7, true);
		}
		field7241.method1439(var8, var9);
		int var10 = field3121 * var6 / field6812;
		int var11 = field4603 * var7 / field6810;
		int var12 = field2606 * var6 / field6812 + var8;
		int var13 = var7 + var9 - field8055 * var7 / field6810 - var11;
		int var14 = -1996554240;
		if (Client.field10768 == ModeGame.STELLARDAWN) {
			var14 = -1996488705;
		}
		arg0.method2354(var12, var13, var10, var11, var14, 1);
		arg0.method2179(var12, var13, var10, var11, var14, 0);
		for (WorldMapElement var15 = (WorldMapElement) ClientWorldMap.field6806.method14191(); var15 != null; var15 = (WorldMapElement) ClientWorldMap.field6806.method14161()) {
			MapElementType var16 = (MapElementType) field6788.get(var15.field11446);
			if (method18887(var16)) {
				WorldMapFlash var17 = (WorldMapFlash) ClientWorldMap.field11661.get(var15.field11446);
				if (var17 == null) {
					var17 = (WorldMapFlash) ClientWorldMap.field11662.get(var16.field2374);
				}
				if (var17 != null) {
					int var18;
					if (var17.field619 > ClientWorldMap.field11664 / 2) {
						var18 = (ClientWorldMap.field11664 * 255 - var17.field619 * 255) / ClientWorldMap.field11664;
					} else {
						var18 = var17.field619 * 255 / ClientWorldMap.field11664;
					}
					int var19 = var15.field11448 * var6 / field6812 + var8;
					int var20 = (field6810 - var15.field11452) * var7 / field6810 + var9;
					arg0.method2301(var19 - 2, var20 - 2, 4, 4, var18 << 24 | 0xFFFF00);
				}
			}
		}
		ClientWorldMap.field6832.method2923(5);
	}

	@ObfuscatedName("acp.x(Lhf;Lhx;IIIIIJ)V")
	public static void method15035(Component arg0, Graphic arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
		int var9 = arg4 * arg4 + arg5 * arg5;
		if ((long) var9 > arg7) {
			return;
		}
		int var10;
		if (field3416 == 3) {
			var10 = (int) ((double) field9155.method4719() * 2607.5945876176133D) + Client.field10885 & 0x3FFF;
		} else if (field3416 == 4) {
			var10 = (int) Client.field10895 & 0x3FFF;
		} else {
			var10 = Client.field10885 + (int) Client.field10895 & 0x3FFF;
		}
		int var11 = Trig1.field4270[var10];
		int var12 = Trig1.field4272[var10];
		if (field3416 != 4) {
			var11 = var11 * 256 / (Client.field10887 + 256);
			var12 = var12 * 256 / (Client.field10887 + 256);
		}
		int var13 = arg4 * var12 + arg5 * var11 >> 14;
		int var14 = arg5 * var12 - arg4 * var11 >> 14;
		Sprite var15 = field513[arg6];
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
			field6719[arg6].method1450((float) arg0.field2196 / 2.0F + (float) arg2 + 0.0F, (float) arg0.field2197 / 2.0F + (float) arg3 - 0.0F, (float) field6719[arg6].method1434() / 2.0F, (float) var37, 4096, (int) (-var25 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			var15.method1439(arg2 + var18, arg3 + var20);
		} else {
			var15.method1444(arg2 + var18, arg3 + var20, arg1.field2147, arg2, arg3);
		}
	}

	@ObfuscatedName("acl.ee(IIIB)V")
	public static void method15110(int arg0, int arg1, int arg2) {
		if (arg0 == 1008) {
			method830(ClientTriggerType.field7258, arg1, arg2);
		} else if (arg0 == 1009) {
			method830(ClientTriggerType.field7249, arg1, arg2);
		} else if (arg0 == 1010) {
			method830(ClientTriggerType.field7257, arg1, arg2);
		} else if (arg0 == 1011) {
			method830(ClientTriggerType.field7253, arg1, arg2);
		} else if (arg0 == 1012) {
			method830(ClientTriggerType.field7252, arg1, arg2);
		}
	}

	@ObfuscatedName("aji.em(S)I")
	public static int method17462() {
		if ((double) field6804 == 2.0D) {
			return 25;
		} else if ((double) field6804 == 3.0D) {
			return 37;
		} else if ((double) field6804 == 4.0D) {
			return 50;
		} else if ((double) field6804 == 6.0D) {
			return 75;
		} else if ((double) field6804 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@ObfuscatedName("adv.t(I)Z")
	public static boolean method15249() {
		return MiniMenu.field546 > 0;
	}

	@ObfuscatedName("kp.et(I)V")
	public static void method5370() {
		ClientWorldMap.field11661.clear();
		ClientWorldMap.field11662.clear();
	}

	@ObfuscatedName("zt.er(I)Laks;")
	public static WorldMapElement method13882() {
		if (ClientWorldMap.field6806 == null || ClientWorldMap.field11669 == null) {
			return null;
		}
		for (WorldMapElement var0 = (WorldMapElement) ClientWorldMap.field11669.next(); var0 != null; var0 = (WorldMapElement) ClientWorldMap.field11669.next()) {
			MapElementType var1 = (MapElementType) field6788.get(var0.field11446);
			if (var1 != null && var1.field2409 && var1.method4030(field6791, field6790)) {
				return var0;
			}
		}
		return null;
	}

	@ObfuscatedName("ys.eb(IIB)V")
	public static void method10453(int arg0, int arg1) {
		field11443 = arg0 - field6786;
		field11654 = arg1 - field6808;
		ClientWorldMap.field11665 = -1;
		ClientWorldMap.field11653 = -1;
		ClientWorldMap.method4643();
	}

	@ObfuscatedName("wo.ex(IZI)Z")
	public static boolean method9621(int arg0, boolean arg1) {
		if (ClientWorldMap.field11657 == arg0) {
			ClientWorldMap.field11674 = arg1;
		} else if (ClientWorldMap.field11646 == arg0) {
			ClientWorldMap.field11655 = arg1;
		} else if (ClientWorldMap.field11673 == arg0) {
			ClientWorldMap.field11652 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@ObfuscatedName("aab.ae(Lase;I)V")
	public static void method14463(PacketBit arg0) {
		Js5Archive[] var1 = Js5Archive.method3566();
		for (int var2 = 0; var2 < var1.length; var2++) {
			Js5Archive var3 = var1[var2];
			if (Js5Archive.LOADING_SPRITES != var3) {
				Js5 var4 = (Js5) field8540.get(var3);
				if (var4 == null) {
					arg0.p4(0);
				} else {
					arg0.p4(var4.method6881());
				}
			}
		}
	}

	@ObfuscatedName("pr.ac(B)V")
	public static void method6877() {
		field432.method952();
		field432.field795.pos = 0;
		field432.field796 = null;
		field432.field790 = null;
		field432.field806 = null;
		field432.field805 = null;
		field432.field797 = 0;
		field432.field789 = 0;
		Client.field10831 = 0;
		MiniMenu.method5175();
		Minimap.method3552();
		for (int var0 = 0; var0 < 2048; var0++) {
			Client.field10944[var0] = null;
		}
		field4490 = null;
		for (int var1 = 0; var1 < Client.field10906; var1++) {
			PathingEntity var2 = (PathingEntity) Client.field10839[var1].field11436;
			if (var2 != null) {
				var2.field10417 = -1;
			}
		}
		ClientInvCache.method2752();
		Client.method4046(Client.method14298());
		Client.setState(18);
		for (int var3 = 0; var3 < 114; var3++) {
			Client.field11072[var3] = true;
		}
		Client.method4336(field432);
		field594 = null;
		field3457 = 0L;
		Client.method3652();
		field7228.method16421();
	}

	@ObfuscatedName("ahe.aa(IIIIIIILarn;Leu;Laac;III)V")
	public static void method16748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, MinimenuSubmenu arg7, Font arg8, FontMetrics arg9, int arg10, int arg11) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field8562 - 1 && arg1 < arg9.field8569 + arg6) {
			arg10 = arg11;
		}
		String var12 = MiniMenu.method15244(arg7);
		arg8.method2689(var12, arg2 + 3, arg6, arg10, 0, Client.field10890, field1681, field10302, null);
	}

	@ObfuscatedName("zd.bc(IB)Z")
	public static boolean method13985(int arg0) {
		return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
	}

	@ObfuscatedName("aku.by(III)Ljava/lang/String;")
	public static String method17760(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return method596(16711680);
		} else if (var2 < -6) {
			return method596(16723968);
		} else if (var2 < -3) {
			return method596(16740352);
		} else if (var2 < 0) {
			return method596(16756736);
		} else if (var2 > 9) {
			return method596(65280);
		} else if (var2 > 6) {
			return method596(4259584);
		} else if (var2 > 3) {
			return method596(8453888);
		} else if (var2 > 0) {
			return method596(12648192);
		} else {
			return method596(16776960);
		}
	}

	@ObfuscatedName("dl.eu(II)Z")
	public static boolean method2092(int arg0) {
		return arg0 == 5 || arg0 == 11 || arg0 == 1;
	}

	@ObfuscatedName("aga.ed(IB)Z")
	public static boolean method16436(int arg0) {
		return arg0 == 4 || arg0 == 13 || arg0 == 15 || arg0 == 18;
	}

	@ObfuscatedName("a.ei(II)Z")
	public static boolean method611(int arg0) {
		return arg0 == 4 || arg0 == 10 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@ObfuscatedName("ace.ej(II)Z")
	public static boolean method15084(int arg0) {
		return arg0 == 13 || arg0 == 6 || arg0 == 15 || arg0 == 16;
	}

	@ObfuscatedName("zg.ea(ILjava/lang/String;ZB)V")
	public static void method14060(int arg0, String arg1, boolean arg2) {
		Loading.method8005();
		Client.method7239();
		Client.method15235();
		Client.method3596(arg0, arg1, arg2);
		field7538.method6158();
		field7538.method6157(Client.field10833);
		field7538.method6165();
		DefaultSprites.method7114(field8198);
		DefaultSprites.method5202(field8198, field10317);
		MiniMenu.method5147();
		Client.method9734();
		Client.method9516();
		if (Client.state == 4) {
			Client.setState(10);
		} else if (Client.state == 13) {
			Client.setState(6);
		} else if (Client.state == 15) {
			Client.setState(16);
		} else if (Client.state == 18) {
			Client.setState(3);
		} else if (Client.state == 11 || Client.state == 1) {
			Loading.method18929();
		} else if (Client.state == 0) {
			Client.setState(8);
		} else if (Client.state == 3) {
			PositionedSound.method13908(false);
		}
	}

	@ObfuscatedName("zb.fl(ZB)V")
	public static final void method14055(boolean arg0) {
		if (!arg0) {
			field8168.method14895();
			field8145.method14895();
			field2628.method14895();
			Client.world.method7750().method14895();
			field7961.method14895();
			field1842.method14895();
			field8797.method14895();
			field4874.method14895();
			field8736.method14895();
			field8485.method15256();
			field8135.method15277();
			field8783.method15277();
			field12225.method15277();
			field3415.method15277();
			field1819.method15277();
			field11742.method14895();
			field4241.method14895();
			field5011.method14895();
			field3086.method14895();
			field2879.method14895();
			field687.method14895();
			field7943.method14895();
			field2427.method14895();
			field2936.method14895();
			field4894.method14895();
			PlayerModel.method15184();
			Component.method5403();
			field7538.method6165();
			method14941();
			if (field1811 != ModeWhere.field8273) {
				for (int var1 = 0; var1 < field9166.length; var1++) {
					field9166[var1] = null;
				}
				Client.field10798 = 0;
			}
			Client.world.method7816().method9984();
			HintArrow.method2086();
			SpotShadowFactory.method3076();
			field7282.method6008();
			field2013.method5974();
			ScriptRunner.field8204.method2924();
			Client.field10830.method2924();
			Client.field10894.method2924();
			Client.field11013.method2924();
			field9123.method14895();
			field1840.method14895();
			Client.field10834.method2924();
		}
		ClientScriptHelpers.method8004();
		ObjIconFactory.method17658();
	}

	@ObfuscatedName("hf.gf(B)V")
	public static final void method4019() {
		if (!Client.field11059) {
			Client.field10896 += (-24.0F - Client.field10896) / 2.0F;
			Client.field10902 = true;
			Client.field11059 = true;
		}
	}

	@ObfuscatedName("vo.ah(Lyf;I)V")
	public static final void method9305(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] < arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("o.az(Lyf;B)V")
	public static final void method474(ClientScriptState arg0) {
		arg0.field8224[++arg0.field8238 - 1] = (Long) arg0.field8239.field12366[arg0.field8220];
	}

	@ObfuscatedName("fg.aa(Lyf;I)V")
	public static final void method2996(ClientScriptState arg0) {
		arg0.field8238--;
	}

	@ObfuscatedName("el.af(Lyf;B)V")
	public static final void method2760(ClientScriptState arg0) {
		arg0.field8224[++arg0.field8238 - 1] = arg0.field8219[arg0.field8236[arg0.field8220]];
	}

	@ObfuscatedName("qx.bi(Lyf;I)V")
	public static final void method7117(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Component.method10202(var1);
		ScriptRunner.method5172(field11725[var1 >>> 16], var1 & 0xFFFF, var2, var3, arg0.field8235, arg0);
	}

	@ObfuscatedName("dk.he(II)I")
	public static final int method2014(int arg0) {
		int var1 = arg0 & 0x3F;
		int var2 = arg0 >> 6 & 0x3;
		if (var1 == 18) {
			if (var2 == 0) {
				return 1;
			}
			if (var2 == 1) {
				return 2;
			}
			if (var2 == 2) {
				return 4;
			}
			if (var2 == 3) {
				return 8;
			}
		} else if (var1 == 19 || var1 == 21) {
			if (var2 == 0) {
				return 16;
			}
			if (var2 == 1) {
				return 32;
			}
			if (var2 == 2) {
				return 64;
			}
			if (var2 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@ObfuscatedName("nl.bu(Lyf;I)V")
	public static final void method6022(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		ScriptRunner.method8666(var2, arg0);
	}

	@ObfuscatedName("iv.cj(Lyf;I)V")
	public static final void method4399(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method7972(var2, var3, arg0);
	}

	@ObfuscatedName("jx.dd(Lhf;Lhq;Lyf;I)V")
	public static final void method5066(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		arg0.field2334 = -1;
		if (arg0.field2215 != var3) {
			arg0.field2215 = var3;
			Client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method7714(arg0.field2158);
		}
	}

	@ObfuscatedName("xc.dx(Lyf;B)V")
	public static final void method10252(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method2098(var2, var3, arg0);
	}

	@ObfuscatedName("adg.de(Lhf;Lhq;Lyf;I)V")
	public static final void method15227(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 10;
		arg0.field2250 = true;
		arg0.field2248 = Math.max(Math.min(arg2.field8216[arg2.field8226], 2816), 0);
		arg0.field2251 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 1], 2816), 0);
		arg0.field2255 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 2], 2816), 0);
		int var3 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 3], 255), 0);
		int var4 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 4], 255), 0);
		int var5 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 5], 255), 0);
		arg0.field2257 = var3 << 16 | var4 << 8 | var5;
		arg0.field2345 = arg2.field8216[arg2.field8226 + 6];
		arg0.field2252 = arg2.field8216[arg2.field8226 + 7];
		arg0.field2302 = arg2.field8216[arg2.field8226 + 8];
		arg0.field2258 = arg2.field8216[arg2.field8226 + 9];
		Client.method4616(arg0);
	}

	@ObfuscatedName("ef.ei(Lyf;B)V")
	public static final void method2857(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method3258(var2, var3, arg0);
	}

	@ObfuscatedName("gt.ej(Lyf;I)V")
	public static final void method3585(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method3077(var2, var3, arg0);
	}

	@ObfuscatedName("dm.ek(Lyf;I)V")
	public static final void method1929(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method4079(var2, var3, arg0);
	}

	@ObfuscatedName("sj.en(Lyf;I)V")
	public static final void method8353(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method9791(var2, var3, arg0);
	}

	@ObfuscatedName("uf.ex(Lhf;Lhq;Lyf;I)V")
	public static final void method9019(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2220 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("ff.fx(Lyf;I)V")
	public static final void method3125(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method7620(var2, var3, arg0);
	}

	@ObfuscatedName("aq.fe(Lyf;I)V")
	public static final void method930(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method310(var2, var3, arg0);
	}

	@ObfuscatedName("abc.go(Lhf;Lhq;Lyf;I)V")
	public static final void method14717(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 3;
		int var3 = arg2.field8216[arg2.field8226];
		short var4 = (short) arg2.field8216[arg2.field8226 + 1];
		short var5 = (short) arg2.field8216[arg2.field8226 + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3964(var3, var4, var5);
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method14614(arg0.field2158, var3);
		}
	}

	@ObfuscatedName("aag.gp(Lyf;B)V")
	public static final void method14097(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14717(var2, var3, arg0);
	}

	@ObfuscatedName("qw.gf(Lyf;I)V")
	public static final void method7302(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method331(var2, var3, arg0);
	}

	@ObfuscatedName("je.hq(Lyf;I)V")
	public static final void method4839(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method14455(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("adi.ip(IIIIII)I")
	public static final int method15200(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (Client.world.method7743() == null) {
			return 0;
		}
		if (arg4 < 3) {
			LinkMap var5 = Client.world.method7793();
			int var6 = arg0 >> 9;
			int var7 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > Client.world.method7728() - 1 || arg3 > Client.world.method7758() - 1) {
				return 0;
			}
			if (var6 < 1 || var7 < 1 || var6 > Client.world.method7728() - 1 || var7 > Client.world.method7758() - 1) {
				return 0;
			}
			boolean var8 = (var5.field4487[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			if ((arg0 & 0x1FF) == 0) {
				boolean var9 = (var5.field4487[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
				boolean var10 = (var5.field4487[1][var6][arg1 >> 9] & 0x2) != 0;
				if (var9 != var10) {
					var8 = (var5.field4487[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				boolean var11 = (var5.field4487[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
				boolean var12 = (var5.field4487[1][arg0 >> 9][var7] & 0x2) != 0;
				if (var11 != var12) {
					var8 = (var5.field4487[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (var8) {
				arg4++;
			}
		}
		return Client.world.method7743().field6913[arg4].method1527(arg0, arg1);
	}

	@ObfuscatedName("nj.hp(Lyf;B)V")
	public static final void method5972(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method8884(var2, var3, arg0);
	}

	@ObfuscatedName("gm.iw(Lhf;Lhq;Lyf;I)V")
	public static final void method3600(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		if (Component.field2234 == var3 || Component.field2301 == var3 || Component.field2157 == var3 || Component.field2266 == var3) {
			arg0.field2271 = var3;
		}
	}

	@ObfuscatedName("sc.ip(Lyf;I)V")
	public static final void method8372(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		method3600(var2, var3, arg0);
	}

	@ObfuscatedName("ud.if(Lyf;B)V")
	public static final void method9191(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method9456(var2, var3, arg0);
	}

	@ObfuscatedName("aj.kf(Lhf;Lhq;Lyf;B)V")
	public static final void method969(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		int var4 = arg2.field8216[--arg2.field8226];
		if (var4 >= 1 && var4 <= 10) {
			arg0.method3948(var4 - 1, var3);
		}
	}

	@ObfuscatedName("el.kx(Lyf;S)V")
	public static final void method2761(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		method969(var2, var3, arg0);
	}

	@ObfuscatedName("yx.la(Lyf;I)V")
	public static final void method10609(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method1515(var2, var3, arg0);
	}

	@ObfuscatedName("d.mw(Lhf;Lhq;Lyf;I)V")
	public static final void method307(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (ScriptRunner.method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2314 = ScriptRunner.method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("nd.nx(Lyf;I)V")
	public static final void method5935(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method5206(var2, var3, arg0);
	}

	@ObfuscatedName("xu.nl(Lyf;I)V")
	public static final void method10059(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method5206(var2, var3, arg0);
	}

	@ObfuscatedName("z.nf(Lyf;B)V")
	public static final void method272(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method852(var2, var3, arg0);
	}

	@ObfuscatedName("zq.oq(Lhf;Lhq;Lyf;B)V")
	public static final void method13925(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (ScriptRunner.method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2296 = ScriptRunner.method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("cz.om(Lyf;B)V")
	public static final void method1590(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method7719(var2, var3, arg0);
	}

	@ObfuscatedName("wo.of(Lhf;Lhq;Lyf;I)V")
	public static final void method9616(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (ScriptRunner.method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2249 = ScriptRunner.method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("pp.oe(Lhf;Lhq;Lyf;I)V")
	public static final void method7046(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (ScriptRunner.method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2295 = ScriptRunner.method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("vn.pl(Lyf;I)V")
	public static final void method9582(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method4497(var2, var3, arg0);
	}

	@ObfuscatedName("ny.qg(Lyf;I)V")
	public static final void method5947(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method10108(var2, var3, arg0);
	}

	@ObfuscatedName("wy.qe(Lyf;I)V")
	public static final void method9893(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		ScriptRunner.method10108(var2, var3, arg0);
	}

	@ObfuscatedName("v.rv(Lyf;B)V")
	public static final void method330(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = field11725[var1 >> 16];
		ScriptRunner.method10372(var2, var3, arg0);
	}

	@ObfuscatedName("sq.rd(Lyf;I)V")
	public static final void method8191(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2210;
	}

	@ObfuscatedName("iy.rn(Lyf;I)V")
	public static final void method4600(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2206;
	}

	@ObfuscatedName("ajd.sm(Lyf;B)V")
	public static final void method17448(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2331;
	}

	@ObfuscatedName("rm.sd(Lyf;S)V")
	public static final void method7625(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2334;
	}

	@ObfuscatedName("mj.ti(Lhf;IIFIIIIIIB)V")
	public static void method5921(Component arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0.field2363 == null) {
			NPCType var10 = (NPCType) field7961.get(arg0.field2294);
			arg0.field2363 = new NPCHeadIconCustomisation(var10, true);
		}
		arg0.field2363.field2688 = ScriptRunner.method5390();
		arg0.field2363.method4528(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("q.ua(Lyf;B)V")
	public static final void method555(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2206;
	}

	@ObfuscatedName("dz.uz(Lyf;I)V")
	public static final void method1899(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8218[++arg0.field8211 - 1] = var2.field2261;
	}

	@ObfuscatedName("jv.ug(Lyf;I)V")
	public static final void method5012(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2208;
	}

	@ObfuscatedName("zt.uv(Lyf;I)V")
	public static final void method13881(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2212;
	}

	@ObfuscatedName("h.un(Lyf;I)V")
	public static final void method594(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		if (var1.field2334 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.field2335;
		}
	}

	@ObfuscatedName("hy.vx(Lyf;I)V")
	public static final void method4067(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		SubInterface var3 = (SubInterface) Client.field10979.method14495((long) var1);
		if (var3 != null && var3.field11571 == var2) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("sq.vs(Lyf;I)V")
	public static final void method8192(ClientScriptState arg0) {
		ClientMessage var1 = method1604(ClientProt.ABORT_P_DIALOG, Client.field10849.field794);
		Client.field10849.method934(var1);
	}

	@ObfuscatedName("tg.wz(Lyf;B)V")
	public static final void method8688(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		short var5 = 256;
		field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ahp.we(Lyf;I)V")
	public static final void method16745(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ey.wm(Lyf;I)V")
	public static final void method2676(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10903;
	}

	@ObfuscatedName("tg.wx(Lyf;S)V")
	public static final void method8692(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = method14914(var1, var2, false);
	}

	@ObfuscatedName("eb.wi(Lyf;I)V")
	public static final void method2965(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = field7410.method674(var1);
	}

	@ObfuscatedName("xa.wy(Lyf;B)V")
	public static final void method10148(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = field7410.method671(var1);
	}

	@ObfuscatedName("xl.xm(Lyf;I)V")
	public static final void method9924(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = field7410.method687(var1);
	}

	@ObfuscatedName("afv.xy(Lyf;I)V")
	public static final void method16412(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field4490.field10395.method316();
	}

	@ObfuscatedName("xk.xp(Lyf;I)V")
	public static final void method10326(ClientScriptState arg0) {
		CoordFine var1 = CoordFine.method7078((CoordFine) arg0.field8218[--arg0.field8211]);
		arg0.field8226 -= 4;
		var1.field11477 += arg0.field8216[arg0.field8226];
		var1.field11478 += arg0.field8216[arg0.field8226 + 1];
		var1.field11479 += arg0.field8216[arg0.field8226 + 2];
		var1.field11480 += arg0.field8216[arg0.field8226 + 3];
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("ul.xk(Lyf;I)V")
	public static final void method8911(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method6002(var1, var2, true);
	}

	@ObfuscatedName("zu.yo(Lyf;I)V")
	public static final void method13988(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11049;
	}

	@ObfuscatedName("qh.ys(Lyf;B)V")
	public static final void method7351(ClientScriptState arg0) {
		if (Client.field10950 >= 5 && Client.field10950 <= 9) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("ux.yq(Lyf;I)V")
	public static final void method9210(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field4490.field12061 != null && field4490.field12061.field7897 ? 1 : 0;
	}

	@ObfuscatedName("uh.yh(Lyf;I)V")
	public static final void method9196(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11101 ? 1 : 0;
	}

	@ObfuscatedName("hn.yb(Lyf;B)V")
	public static final void method4080(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method7007(var1, false);
	}

	@ObfuscatedName("adp.yv(Lyf;I)V")
	public static final void method15157(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = focus ? 1 : 0;
	}

	@ObfuscatedName("oh.yy(Lyf;B)V")
	public static final void method6125(ClientScriptState arg0) {
		ScriptRunner.method4597(MiniMenu.method3558(), arg0);
	}

	@ObfuscatedName("y.ii(IIILajf;I)V")
	public static void method540(int arg0, int arg1, int arg2, Obj arg3) {
		long var4 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		ObjStackList var6 = (ObjStackList) Client.field10964.method14495(var4);
		if (var6 == null) {
			ObjStackList var7 = new ObjStackList();
			Client.field10964.method14501(var7, var4);
			var7.field11263.method14153(arg3);
			return;
		}
		ObjType var8 = (ObjType) field1842.get(arg3.field11261);
		int var9 = var8.field8620;
		if (var8.field8644 == 1) {
			var9 = (arg3.field11260 + 1) * var9;
		}
		for (Obj var10 = (Obj) var6.field11263.method14191(); var10 != null; var10 = (Obj) var6.field11263.method14161()) {
			ObjType var11 = (ObjType) field1842.get(var10.field11261);
			int var12 = var11.field8620;
			if (var11.field8644 == 1) {
				var12 = (var10.field11260 + 1) * var12;
			}
			if (var9 > var12) {
				IterableQueue.method926(arg3, var10);
				return;
			}
		}
		var6.field11263.method14153(arg3);
	}

	@ObfuscatedName("qw.zy(Lyf;S)V")
	public static final void method7305(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10945;
	}

	@ObfuscatedName("rg.ze(Lyf;I)V")
	public static final void method7707(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		String var4 = (String) arg0.field8218[--arg0.field8211];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var5 = (EnumType) field8514.get(var2);
		if (var5.field8781.getId() != var1) {
			throw new RuntimeException();
		} else if (var5.field8775.getId() == ScriptVarType.STRING.getId()) {
			int[] var6 = var5.method14867(var4);
			if (var3 < 0 || var6 == null || var6.length <= var3) {
				throw new RuntimeException();
			}
			arg0.field8216[++arg0.field8226 - 1] = var6[var3];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("vv.zl(Lyf;I)V")
	public static final void method9388(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field608;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("qm.zx(Lyf;B)V")
	public static final void method7318(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field615;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("wm.aaf(Lyf;I)V")
	public static final void method9823(ClientScriptState arg0) {
		if (Client.field11055 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Base37.method15309(Client.field11055);
		}
	}

	@ObfuscatedName("afq.aap(Lyf;I)V")
	public static final void method15449(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= field7421) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = field9267[var1].field758;
		}
	}

	@ObfuscatedName("fo.aaq(Lyf;B)V")
	public static final void method3281(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= field7421) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = field9267[var1].field760;
		}
	}

	@ObfuscatedName("fl.aaz(Lyf;I)V")
	public static final void method3138(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 0 || var1 >= Client.field11084) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		Ignore var2 = Client.field11086[var1];
		arg0.field8218[++arg0.field8211 - 1] = var2.field598;
		if (var2.field596 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field596;
		}
	}

	@ObfuscatedName("ft.aay(Lyf;I)V")
	public static final void method3078(ClientScriptState arg0) {
		if (Client.field11030 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11030;
		}
	}

	@ObfuscatedName("ey.abo(Lyf;I)V")
	public static final void method2677(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = Client.method3598(var1);
	}

	@ObfuscatedName("tc.abh(Lyf;I)V")
	public static final void method8434(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 0 || var1 >= Client.field11084) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11086[var1].field598;
		}
	}

	@ObfuscatedName("ahj.abb(Lyf;B)V")
	public static final void method16611(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field6721 == null ? 0 : 1;
	}

	@ObfuscatedName("dm.abu(Lyf;S)V")
	public static final void method1925(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = field6721.method3392(var1).method3529() ? 1 : 0;
	}

	@ObfuscatedName("ew.acm(Lyf;B)V")
	public static final void method2899(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field6721.method3390();
	}

	@ObfuscatedName("b.adp(Lyf;I)V")
	public static final void method576(ClientScriptState arg0) {
		if (field3022 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8228 = field3022;
		}
	}

	@ObfuscatedName("xu.adf(Lyf;I)V")
	public static final void method10060(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].field4961;
	}

	@ObfuscatedName("mj.jr(Lhf;B)V")
	public static void method5926(Component arg0) {
		if (!Client.field10973) {
			return;
		}
		if (arg0.field2225 != null) {
			Component var1 = Component.method16682(field6707, Client.field10974);
			if (var1 != null) {
				HookRequest var2 = new HookRequest();
				var2.field11491 = arg0;
				var2.field11495 = var1;
				var2.field11493 = arg0.field2225;
				ScriptRunner.method1428(var2);
			}
		}
		ClientMessage var3 = method1604(ClientProt.IF_BUTTONT, Client.field10849.field794);
		var3.field11432.p4_alt1(arg0.field2158);
		var3.field11432.p2(arg0.field2334);
		var3.field11432.p2_alt2(Client.field10975);
		var3.field11432.p2_alt2(arg0.field2183);
		var3.field11432.p2_alt2(Client.field10974);
		var3.field11432.p4_alt1(field6707);
		Client.field10849.method934(var3);
	}

	@ObfuscatedName("ru.adx(Lyf;I)V")
	public static final void method7936(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = Client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 2 ? 1 : 0;
	}

	@ObfuscatedName("id.js(IIILjava/lang/String;S)V")
	public static void method4527(int arg0, int arg1, int arg2, String arg3) {
		Component var4 = Component.method16682(arg1, arg2);
		if (var4 == null) {
			return;
		}
		if (var4.field2315 != null) {
			HookRequest var5 = new HookRequest();
			var5.field11491 = var4;
			var5.field11494 = arg0;
			var5.field11498 = arg3;
			var5.field11493 = var4.field2315;
			ScriptRunner.method1428(var5);
		}
		if (!Client.method17197(var4).method17690(arg0 - 1)) {
			return;
		}
		ServerConnection var6 = Client.method640();
		if (Client.state != 13 && Client.state != 18 && Client.state != 0) {
			return;
		}
		if (var4.field2336 == null || var4.field2337 == null) {
			Client.method7076(var6, var4, arg0, arg1, arg2);
			return;
		}
		ClientMessage var7 = method1604(ClientProt.IF_PLAYER, var6.field794);
		var7.field11432.p1(Packet.pjstrlen(var4.field2336) + 7 + 1);
		var7.field11432.pjstr(var4.field2336);
		var7.field11432.p2_alt1(arg2);
		var7.field11432.p1_alt2(arg0);
		var7.field11432.p1_alt3(var4.field2337.getId());
		var7.field11432.p4_alt2(arg1);
		var6.method934(var7);
	}

	@ObfuscatedName("at.aeh(Lyf;I)V")
	public static final void method808(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		arg0.field8216[++arg0.field8226 - 1] = (var2 - var1) * (var5 - var3) / (var4 - var3) + var1;
	}

	@ObfuscatedName("akp.aep(Lyf;B)V")
	public static final void method17731(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Trig1.method6280(var1, var2);
	}

	@ObfuscatedName("kz.afq(Lyf;I)V")
	public static final void method5128(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = field8149[var1 & 0xFFFF];
	}

	@ObfuscatedName("qi.afy(Lyf;I)V")
	public static final void method7272(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ~var1;
	}

	@ObfuscatedName("tl.afz(Lyf;B)V")
	public static final void method8893(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = method596(var1);
	}

	@ObfuscatedName("pn.afx(Lyf;I)V")
	public static final void method6828(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Cp1252.method10348((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("ji.agd(Lyf;I)V")
	public static final void method4979(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ObjType var3 = (ObjType) field1842.get(var1);
		if (var2 < 1 || var2 > 5 || var3.field8648[var2 - 1] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var3.field8648[var2 - 1];
		}
	}

	@ObfuscatedName("ajf.agb(Lyf;B)V")
	public static final void method17524(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) field1842.get(var1)).field8620;
	}

	@ObfuscatedName("vg.ahq(Lyf;B)V")
	public static final void method9462(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) field3086.get(var2);
		if (var3.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = ((LocType) Client.world.method7750().get(var1)).method9479(var2, var3.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((LocType) Client.world.method7750().get(var1)).method9481(var2, var3.field9172);
		}
	}

	@ObfuscatedName("xr.aic(Lyf;I)V")
	public static final void method10232(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = field3823.list(var1).field12347[var2];
	}

	@ObfuscatedName("rc.aip(Lyf;I)V")
	public static final void method7891(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = field489.method14982(var1).method19509(var2).field7938;
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("wo.ako(Lyf;B)V")
	public static final void method9617(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8512(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12354;
		}
	}

	@ObfuscatedName("dk.akr(Lyf;I)V")
	public static final void method2013(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8512(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12356;
		}
	}

	@ObfuscatedName("xi.aku(Lyf;B)V")
	public static final void method10154(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11651 == 100 ? 1 : 0;
	}

	@ObfuscatedName("ua.akx(Lyf;I)V")
	public static final void method9004(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		method10453(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("qs.ku(Lhf;I)V")
	public static void method7332(Component arg0) {
		if (arg0.field2184 == 5 && arg0.field2334 != -1) {
			ObjIconFactory.method539(field8198, arg0);
		}
	}

	@ObfuscatedName("bl.ko(III)V")
	public static final void method1023(int arg0, int arg1) {
		if (Component.method5364(arg0, null)) {
			Client.method8199(field11725[arg0].field2151, arg1);
		}
	}

	@ObfuscatedName("fd.als(Lyf;I)V")
	public static final void method3063(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field6811 == null ? -1 : field6811.field12359;
	}

	@ObfuscatedName("abn.kl(Lhf;I)Lhf;")
	public static Component method14755(Component arg0) {
		Component var1 = Client.method17238(arg0);
		if (var1 == null) {
			var1 = arg0.field2284;
		}
		return var1;
	}

	@ObfuscatedName("aw.alk(Lyf;I)V")
	public static final void method747(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = ClientWorldMap.method9736(var1);
		if (var2 < 0) {
			throw new RuntimeException();
		}
		arg0.field8216[++arg0.field8226 - 1] = var2;
	}

	@ObfuscatedName("z.aln(Lyf;B)V")
	public static final void method274(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Fullscreen.allowed) {
			Client.setWindowMode(3, var1, var2, false);
			arg0.field8216[++arg0.field8226 - 1] = fsframe == null ? 0 : 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("wt.alg(Lyf;B)V")
	public static final void method9842(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Fullscreen.allowed) {
			FullscreenMode[] var2 = Client.method16741();
			arg0.field8216[++arg0.field8226 - 1] = var2[var1].field8537;
			arg0.field8216[++arg0.field8226 - 1] = var2[var1].field8538;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("kb.alb(Lyf;I)V")
	public static final void method5248(ClientScriptState arg0) {
		int var1 = field8186;
		int var2 = field9256;
		int var3 = -1;
		if (Fullscreen.allowed) {
			FullscreenMode[] var4 = Client.method16741();
			for (int var5 = 0; var5 < var4.length; var5++) {
				FullscreenMode var6 = var4[var5];
				if (var6.field8537 == var1 && var6.field8538 == var2) {
					var3 = var5;
					break;
				}
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("qi.ale(Lyf;S)V")
	public static final void method7273(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.getWindowMode();
	}

	@ObfuscatedName("tk.kv(Lhf;III)V")
	public static void method8887(Component arg0, int arg1, int arg2) {
		Graphic var3 = arg0.method3970(field8198);
		if (var3 == null) {
			return;
		}
		field8198.method2168(arg1, arg2, arg0.field2196 + arg1, arg0.field2197 + arg2);
		if (Minimap.field724 >= 3) {
			field8198.method2206(-16777216, var3.field2147, arg1, arg2);
			return;
		}
		int var4;
		if (field3416 == 3) {
			var4 = (int) -((double) field9155.method4719() * 2607.5945876176133D);
		} else {
			var4 = (int) -Client.field10895;
		}
		int var5 = Client.field10885 * 2 + var4 & 0x3FFF;
		int var6 = var5 << 2;
		field7207.method1455((float) arg0.field2196 / 2.0F + (float) arg1, (float) arg0.field2197 / 2.0F + (float) arg2, 4226, var6, var3.field2147, arg1, arg2);
	}

	@ObfuscatedName("cj.ll(Ljava/lang/String;I)V")
	public static final void method1600(String arg0) {
		if (arg0.equals("")) {
			return;
		}
		ServerConnection var1 = Client.method640();
		ClientMessage var2 = method1604(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var1.field794);
		var2.field11432.p1(Packet.pjstrlen(arg0));
		var2.field11432.pjstr(arg0);
		var1.method934(var2);
	}

	@ObfuscatedName("ang.le(ZIB)V")
	public static final void method18674(boolean arg0, int arg1) {
		ClanChannel var2 = arg0 ? field3022 : field1766;
		if (var2 == null || arg1 < 0 || arg1 >= var2.field11393) {
			return;
		}
		ClanChannelUser var3 = var2.field11392[arg1];
		if (var3.field3089 != -1) {
			return;
		}
		String var4 = var3.field3087;
		ServerConnection var5 = Client.method640();
		ClientMessage var6 = method1604(ClientProt.CLANCHANNEL_KICKUSER, var5.field794);
		var6.field11432.p1(Packet.pjstrlen(var4) + 3);
		var6.field11432.p1(arg0 ? 1 : 0);
		var6.field11432.p2(arg1);
		var6.field11432.pjstr(var4);
		var5.method934(var6);
	}

	@ObfuscatedName("ys.amk(Lyf;B)V")
	public static final void method10452(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		ScriptRunner.method7005((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], (String) arg0.field8218[arg0.field8211 + 2], arg0.field8216[--arg0.field8226] == 1, true);
	}

	@ObfuscatedName("ku.amz(Lyf;I)V")
	public static final void method5146(ClientScriptState arg0) {
		RuneScapeSetup.method4589();
	}

	@ObfuscatedName("az.lh(Ljava/lang/String;ZB)V")
	public static final void method1002(String arg0, boolean arg1) {
		int var2 = Client.field11006 ? 400 : 100;
		if (arg0 == null) {
			return;
		}
		if (Client.field11084 >= var2) {
			ChatHistory.method1006(4, Client.field11006 ? LocalisedText.IGNORELISTFULL_MEMBERS.method15021(field1680) : LocalisedText.IGNORELISTFULL.method15021(field1680));
			return;
		}
		String var3 = NamespaceUtil.method15191(arg0, field10782);
		if (var3 == null) {
			return;
		}
		for (int var4 = 0; var4 < Client.field11084; var4++) {
			Ignore var5 = Client.field11086[var4];
			String var6 = NamespaceUtil.method15191(var5.field598, field10782);
			if (var6 != null && var6.equals(var3)) {
				ChatHistory.method1006(4, arg0 + LocalisedText.IGNORELISTDUPE.method15021(field1680));
				return;
			}
			if (var5.field596 != null) {
				String var7 = NamespaceUtil.method15191(var5.field596, field10782);
				if (var7 != null && var7.equals(var3)) {
					ChatHistory.method1006(4, arg0 + LocalisedText.IGNORELISTDUPE.method15021(field1680));
					return;
				}
			}
		}
		for (int var8 = 0; var8 < Client.field10811; var8++) {
			Friend var9 = Client.field11065[var8];
			String var10 = NamespaceUtil.method15191(var9.field606, field10782);
			if (var10 != null && var10.equals(var3)) {
				ChatHistory.method1006(4, LocalisedText.REMOVEFRIEND1.method15021(field1680) + arg0 + LocalisedText.REMOVEFRIEND2.method15021(field1680));
				return;
			}
			if (var9.field607 != null) {
				String var11 = NamespaceUtil.method15191(var9.field607, field10782);
				if (var11 != null && var11.equals(var3)) {
					ChatHistory.method1006(4, LocalisedText.REMOVEFRIEND1.method15021(field1680) + arg0 + LocalisedText.REMOVEFRIEND2.method15021(field1680));
					return;
				}
			}
		}
		if (NamespaceUtil.method15191(field4490.field12062, field10782).equals(var3)) {
			ChatHistory.method1006(4, LocalisedText.IGNORECANTADDSELF.method15021(field1680));
			return;
		}
		ServerConnection var12 = Client.method640();
		ClientMessage var13 = method1604(ClientProt.IGNORELIST_ADD, var12.field794);
		var13.field11432.p1(Packet.pjstrlen(arg0) + 1);
		var13.field11432.pjstr(arg0);
		var13.field11432.p1(arg1 ? 1 : 0);
		var12.method934(var13);
	}

	@ObfuscatedName("vg.and(Lyf;I)V")
	public static final void method9466(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 < 0) {
			var1 = 0;
		}
		Client.field10901 = Client.field11089 * 35 + var1;
	}

	@ObfuscatedName("akv.lw(Lhf;IS)I")
	public static int method17826(Component arg0, int arg1) {
		if (!Client.method17197(arg0).method17690(arg1) && arg0.field2315 == null) {
			return -1;
		} else if (arg0.field2282 == null || arg0.field2282.length <= arg1) {
			return -1;
		} else {
			return arg0.field2282[arg1];
		}
	}

	@ObfuscatedName("agz.anl(Lyf;I)V")
	public static final void method16461(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		if (field9155.method4780() != PositionMode.field2816) {
			throw new RuntimeException();
		}
		PositionPoint var2 = (PositionPoint) field9155.method4709();
		var2.method16671(var1);
		Client.field10902 = true;
	}

	@ObfuscatedName("vw.aoo(Lyf;I)V")
	public static final void method9392(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field9155.method4743() == null ? -1 : field9155.method4743().field2794;
	}

	@ObfuscatedName("rm.mp(II)V")
	public static void method7623(int arg0) {
		int var1 = Client.field11114.indexOf(arg0);
		if (var1 == -1) {
			Client.field11114.add(arg0);
		}
	}

	@ObfuscatedName("qe.aoa(Lyf;I)V")
	public static final void method7225(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		boolean var1 = arg0.field8216[arg0.field8226] == 1;
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		field9155.method4700(var1, var2);
	}

	@ObfuscatedName("eq.apj(Lyf;B)V")
	public static final void method2833(ClientScriptState arg0) throws CameraException {
		field9155.method4756();
	}

	@ObfuscatedName("aaj.apn(Lyf;I)V")
	public static final void method14453(ClientScriptState arg0) {
		AccountCreationManager.method648();
	}

	@ObfuscatedName("xn.apt(Lyf;I)V")
	public static final void method10109(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field477;
	}

	@ObfuscatedName("et.aqc(Lyf;I)V")
	public static final void method2864(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field477;
	}

	@ObfuscatedName("er.aro(Lyf;B)V")
	public static final void method2909(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10778;
		arg0.field8216[++arg0.field8226 - 1] = Client.field10777;
	}

	@ObfuscatedName("pu.arq(Lyf;I)V")
	public static final void method7075(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		field688.method18157(field688.brightness, var1);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("any.arn(Lyf;I)V")
	public static final void method18661(ClientScriptState arg0) {
		field688.method18157(field688.flickeringEffects, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("pd.asr(Lyf;B)V")
	public static final void method6825(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = field688.themeMusicVolume3.method18763();
		if (var1 != var2) {
			field688.method18157(field688.themeMusicVolume3, var1);
			Preferences.method16391();
			Client.field10800 = false;
		}
	}

	@ObfuscatedName("py.asz(Lyf;I)V")
	public static final void method6965(ClientScriptState arg0) {
		field688.method18157(field688.customCursors, arg0.field8216[--arg0.field8226] == 0 ? 0 : 1);
		Preferences.method16391();
	}

	@ObfuscatedName("ul.atz(Lyf;I)V")
	public static final void method8916(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field688.brightness.method18408();
	}

	@ObfuscatedName("ji.ate(Lyf;B)V")
	public static final void method4980(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field688.sceneryShadows.method18515();
	}

	@ObfuscatedName("ty.avp(Lyf;I)V")
	public static final void method8477(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field688.unknown.method18665();
	}

	@ObfuscatedName("rp.awi(Lyf;I)V")
	public static final void method7477(ClientScriptState arg0) {
		int var1 = Client.field10979.method14498();
		if (Client.field10978 != -1) {
			var1++;
		}
		arg0.field8216[++arg0.field8226 - 1] = var1;
	}

	@ObfuscatedName("sp.axe(Lyf;I)V")
	public static final void method8277(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) field5011.get(var1);
		if (var2.field2370 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2370;
		}
	}

	@ObfuscatedName("fi.axr(Lyf;B)V")
	public static final void method3075(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) field5011.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2400;
	}

	@ObfuscatedName("ny.ayu(Lyf;B)V")
	public static final void method5948(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field2830;
	}

	@ObfuscatedName("oh.ayr(Lyf;I)V")
	public static final void method6127(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field5009;
	}

	@ObfuscatedName("ik.azw(Lyf;I)V")
	public static final void method4620(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field688.bloom.method18624() && field8198.method2266() ? 1 : 0;
	}

	@ObfuscatedName("rd.bay(Lyf;B)V")
	public static final void method7894(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (field8198.method2141()) {
			arg0.field8216[++arg0.field8226 - 1] = field688.unknown1.method14070(var1);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 3;
		}
	}

	@ObfuscatedName("abx.bbf(Lyf;B)V")
	public static final void method14885(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((PlayerEntity) arg0.field8221).method19115(true);
	}

	@ObfuscatedName("d.bbn(Lyf;B)V")
	public static final void method311(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		String var2 = var1.field12082;
		NPCType var3 = var1.field12083;
		if (var3.field2735 != null) {
			NPCType var4 = var3.method4547(field7410, field7410);
			if (var4 == null) {
				var2 = "";
			} else {
				var2 = var4.field2703;
			}
		}
		if (var2 == null) {
			var2 = "";
		}
		arg0.field8218[++arg0.field8211 - 1] = var2;
	}

	@ObfuscatedName("ty.bci(Lyf;B)V")
	public static final void method8475(ClientScriptState arg0) {
		Client.method14574(arg0.field8232, arg0.field8216[--arg0.field8226], true);
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[0];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[1];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[2];
	}

	@ObfuscatedName("qo.bch(Lyf;B)V")
	public static final void method7312(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8232.method16501();
	}

	@ObfuscatedName("qs.bcc(Lyf;I)V")
	public static final void method7333(ClientScriptState arg0) {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < field6888.length; var3++) {
			if (field6888[var3] != null && field6888[var3].method16837()) {
				var1 += field6888[var3].method16826();
				var2 += field6888[var3].method16828();
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 == 0 ? 0 : var2 * 100 / var1;
	}

	@ObfuscatedName("ix.bdz(Lyf;I)V")
	public static final void method4480(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3261();
	}

	@ObfuscatedName("wf.bdr(Lyf;I)V")
	public static final void method9830(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3286();
	}

	@ObfuscatedName("fu.beo(Lyf;I)V")
	public static final void method3024(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = 0;
		int var4 = var2 >>> 8;
		int var5 = var2 & 0xFF;
		DBRowType var6 = (DBRowType) field9123.get(var1);
		DBTableType var7 = (DBTableType) field1840.get(var4);
		ScriptVarType[] var8 = var7.field9185[var5];
		Object[] var9 = var6.method14711(var5);
		if (var9 == null && var7.field9186 != null) {
			var9 = var7.field9186[var5];
		}
		if (var9 != null) {
			var3 = var9.length / var8.length;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("vy.bep(Lyf;I)V")
	public static final void method9429(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		DbTableIndex var3 = Client.method146(var1);
		if (var3 == null) {
			throw new RuntimeException();
		} else if (DBUtils.method746(var1) != Client.field10767) {
			throw new RuntimeException();
		} else if (field754 == null && field754.isEmpty()) {
			throw new RuntimeException();
		} else {
			List var4 = var3.method15187(var2);
			field754 = new LinkedList(field754);
			if (var4 == null) {
				field754.clear();
			} else {
				field754.retainAll(var4);
			}
			field8853 = field754.iterator();
			arg0.field8216[++arg0.field8226 - 1] = field754.size();
		}
	}
}
