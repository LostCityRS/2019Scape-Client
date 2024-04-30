package rs2.client;

import com.jagex.audio.api.AudioApi;
import com.jagex.audio.stream.Sound;
import com.jagex.audio.stream.SoundShape;
import com.jagex.audio.stream.SoundType;
import com.jagex.audio.api.SubBussType;
import com.jagex.core.constants.*;
import com.jagex.core.datastruct.*;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.*;
import com.jagex.game.*;
import com.jagex.game.camera.LookatEntity;
import com.jagex.game.camera.LookatMode;
import com.jagex.game.camera.position.PositionEntity;
import com.jagex.game.client.*;
import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.game.clientoptions.Preferences;
import com.jagex.game.compression.huffman.WordPack;
import com.jagex.game.config.*;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.cursortype.CursorType;
import com.jagex.game.config.cursortype.CursorTypeList;
import com.jagex.game.config.db.DBTableIndex;
import com.jagex.game.config.db.DBUtils;
import com.jagex.game.config.defaults.*;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.config.effectanimtype.EffectAnimTypeList;
import com.jagex.game.config.enumtype.EnumTypeList;
import com.jagex.game.config.flotype.FloorOverlayTypeList;
import com.jagex.game.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.config.headbartype.HeadbarType;
import com.jagex.game.config.headbartype.HeadbarTypeList;
import com.jagex.game.config.hitmarktype.HitmarkType;
import com.jagex.game.config.hitmarktype.HitmarkTypeList;
import com.jagex.game.config.idktype.IDKTypeList;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.Interface;
import com.jagex.game.config.iftype.componentproperties.ServerKeyProperties;
import com.jagex.game.config.invtype.InvTypeList;
import com.jagex.game.config.lighttype.LightTypeList;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.meltype.MapElementTypeList;
import com.jagex.game.config.msitype.MSITypeList;
import com.jagex.game.config.npctype.NPCTypeCustomisation;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.npctype.NPCTypeList;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.objtype.ObjTypeList;
import com.jagex.game.config.paramtype.ParamTypeList;
import com.jagex.game.config.questtype.QuestTypeList;
import com.jagex.game.config.quickchatcattype.QuickChatCatTypeList;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhrase;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseType;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseTypeList;
import com.jagex.game.config.seqgrouptype.SeqGroupTypeList;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.skyboxtype.SkyBoxTypeList;
import com.jagex.game.config.skydecortype.SkyDecorTypeList;
import com.jagex.game.config.structtype.StructTypeList;
import com.jagex.game.config.vartype.SparseVarDomain;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.game.config.vartype.general.VarBasicTypeListClient;
import com.jagex.game.config.vartype.player.VarPlayerType;
import com.jagex.game.config.vartype.player.VarPlayerTypeListClient;
import com.jagex.game.cutscene.CutsceneAction;
import com.jagex.game.cutscene.CutsceneEntity;
import com.jagex.game.cutscene.CutsceneManager;
import com.jagex.game.fullscreen.Fullscreen;
import com.jagex.game.group.PlayerGroup;
import com.jagex.game.group.PlayerGroupDelta;
import com.jagex.game.group.PlayerGroupMember;
import com.jagex.game.group.PlayerGroupResourceProvider;
import com.jagex.game.load.Loading;
import com.jagex.game.load.MessageBox;
import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.network.protocol.LoginProt;
import com.jagex.game.network.protocol.ServerProt;
import com.jagex.game.network.protocol.ZoneProt;
import com.jagex.game.player.AttackOpPriority;
import com.jagex.game.scene.ChangeLocationRequest;
import com.jagex.game.scene.World;
import com.jagex.game.script.*;
import com.jagex.game.shared.console.DeveloperConsole;
import com.jagex.game.shared.framework.chat.ChatCrownType;
import com.jagex.game.shared.framework.gwc.GWC;
import com.jagex.game.shared.framework.input.Keyboard;
import com.jagex.game.shared.framework.input.Mouse;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.telemetry.grid.TelemetryGrid;
import com.jagex.game.telemetry.grid.TelemetryGroup;
import com.jagex.game.world.WorldMap;
import com.jagex.game.world.WorldMapAreaMetadata;
import com.jagex.game.world.WorldMapRenderer;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.*;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.camera.CameraControlMode;
import com.jagex.graphics.camera.CameraException;
import com.jagex.graphics.camera.CameraManager;
import com.jagex.graphics.gl.GlException;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.js5.Js5;
import com.jagex.js5.caching.Js5DiskCache;
import com.jagex.js5.network.Js5Client;
import com.jagex.js5.network.Js5HttpClient;
import com.jagex.js5.network.Js5NetResourceProvider;
import com.jagex.js5.network.Js5TcpClient;
import com.jagex.math.*;
import deob.ObfuscatedName;
import jaclib.ping.Ping;
import rs2.client.clientscript.ScriptRunner;
import rs2.client.clientscript.emoji.EmojiList;
import rs2.client.logic.DelayedStateChange;
import rs2.client.logic.chat.ChatHistory;
import rs2.client.logic.clans.*;
import rs2.client.logic.friendchat.Friend;
import rs2.client.logic.friendchat.FriendChatUser;
import rs2.client.logic.friendchat.Ignore;
import rs2.client.login.*;
import rs2.client.scene.ObjStackList;
import rs2.client.scene.entities.NpcEntity;
import rs2.client.scene.entities.PathingEntity;
import rs2.client.scene.entities.ProjectileAnimation;
import rs2.client.scene.entities.SpotAnimation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

public final class Client extends GameShell {

    public static final boolean ENABLE_RSA = false;
    public static final boolean ENABLE_JS5_RSA = false;
    public static final boolean ENABLE_JS5_XOR = false;
    public static final boolean ENABLE_HOST_CHECK = false;
    public static final boolean ENABLE_ISAAC = false;
	public static final boolean ENABLE_TINYENC = false;
	public static final boolean ALLOW_COMMANDS_ANYWHERE = true;

	@ObfuscatedName("client.bw")
	public static Namespace namespace;

	@ObfuscatedName("nv.bo")
	public static ModeWhat modewhat;

	@ObfuscatedName("fz.bz")
	public static ModeWhere modewhere;

	@ObfuscatedName("client.bv")
	public static ModeGame modegame = null;

	@ObfuscatedName("eu.br")
	public static Language language;

	@ObfuscatedName("client.bg")
	public static boolean javascriptEnabled = false;

	@ObfuscatedName("client.ba")
	public static boolean showAdvertisement = false;

	@ObfuscatedName("client.bp")
	public static String siteSettings = null;

	@ObfuscatedName("ys.bj")
	public static int currentPlayerCountry;

	@ObfuscatedName("client.bs")
	public static int playerIsAffiliate = 0;

	@ObfuscatedName("zo.cl")
	public static String field8327;

	@ObfuscatedName("client.cg")
	public static int field10773 = 0;

	@ObfuscatedName("client.ce")
	public static boolean fromBilling = false;

	@ObfuscatedName("client.cu")
	public static int userFlow1 = 0;

	@ObfuscatedName("client.ci")
	public static int userFlow2 = 0;

	@ObfuscatedName("client.cn")
	public static int field10777 = 0;

	@ObfuscatedName("client.cv")
	public static int field10778 = 0;

	@ObfuscatedName("o.cp")
	public static String field579;

	@ObfuscatedName("client.ca")
	public static boolean isSafeMode = false;

	@ObfuscatedName("client.cx")
	public static boolean field10812 = false;

	@ObfuscatedName("client.cw")
	public static String createAdditionalInfo = null;

	@ObfuscatedName("client.ct")
	public static String loadingBarConfig = null;

	@ObfuscatedName("client.cf")
	public static String pngHost = null;

	@ObfuscatedName("client.co")
	public static boolean field10784 = false;

	@ObfuscatedName("client.cr")
	public static boolean haveChrome = false;

	@ObfuscatedName("client.cm")
	public static boolean runInFrame = false;

	@ObfuscatedName("client.cq")
	public static int activeTarget = 0;

	@ObfuscatedName("client.ch")
	public static int field10788 = -1;

	@ObfuscatedName("client.cb")
	public static String gamepack = null;

	@ObfuscatedName("client.cs")
	public static String createEmail = null;

	@ObfuscatedName("iu.cy")
	public static int clientType;

	@ObfuscatedName("client.cc")
	public static int state = 5;

	@ObfuscatedName("client.cz")
	public static Matrix4x4 field10792 = new Matrix4x4();

	@ObfuscatedName("client.ck")
	public static Matrix4x3 field10793 = new Matrix4x3();

	@ObfuscatedName("client.cj")
	public static Matrix4x3 field10875 = new Matrix4x3();

	@ObfuscatedName("yv.cd")
	public static Toolkit toolkit;

	@ObfuscatedName("vo.dd")
	public static MaterialList materialList;

	@ObfuscatedName("wf.dr")
	public static TextureList textureList;

	@ObfuscatedName("adg.da")
	public static BasicBillboardTypeList basicBillboardTypeList;

	@ObfuscatedName("uo.dt")
	public static BasicParticleEmitterTypeList basicParticleEmitterTypeList;

	@ObfuscatedName("gb.do")
	public static BasicParticleEffectorTypeList basicParticleEffectorTypeList;

	@ObfuscatedName("ac.dz")
	public static ClientOptions preferences;

	@ObfuscatedName("ahs.dv")
	public static HardwarePlatform hardwarePlatform;

	@ObfuscatedName("client.dm")
	public static long field10795 = 0L;

	@ObfuscatedName("client.dq")
	public static boolean field10796 = false;

	@ObfuscatedName("client.dc")
	public static boolean field11023 = true;

	@ObfuscatedName("acn.di")
	public static byte[][] field9166;

	@ObfuscatedName("client.dk")
	public static int field10798 = 0;

	@ObfuscatedName("client.dn")
	public static int loopCycle = 0;

	@ObfuscatedName("client.df")
	public static boolean preferencesChangeNotified = true;

	@ObfuscatedName("client.dw")
	public static boolean compressedTextureFormatSupportTransmitted = true;

	@ObfuscatedName("client.ds")
	public static boolean field10794 = false;

	@ObfuscatedName("client.du")
	public static boolean field10848 = false;

	@ObfuscatedName("afv.dl")
	public static String owner;

	@ObfuscatedName("client.dp")
	public static int rebootTimer = 0;

	@ObfuscatedName("client.dy")
	public static HintArrow[] hintArrows = new HintArrow[9];

	@ObfuscatedName("client.db")
	public static HintTrail[] hintTrails = new HintTrail[8];

	@ObfuscatedName("ah.dh")
	public static HostNameProvider hostNameProvider;

	@ObfuscatedName("client.dx")
	public static boolean field10807 = false;

	@ObfuscatedName("zt.dg")
	public static Client field8301;

	@ObfuscatedName("client.de")
	public static boolean field10808 = false;

	@ObfuscatedName("vu.dj")
	public static PlayerGameState localPlayerGameState;

	@ObfuscatedName("client.eo")
	public static boolean field10809 = true;

	@ObfuscatedName("client.ey")
	public static long field10810 = (long) (Math.random() * 9.999999999E9D);

	@ObfuscatedName("client.eu")
	public static boolean field10836 = false;

	@ObfuscatedName("client.ed")
	public static int field11005 = 0;

	@ObfuscatedName("client.ee")
	public static int field10915 = 0;

	@ObfuscatedName("km.es")
	public static Spline field3178;

	@ObfuscatedName("client.ei")
	public static boolean isUnder13 = false;

	@ObfuscatedName("xv.el")
	public static boolean field7880;

	@ObfuscatedName("client.ej")
	public static LogoutReason logoutReason = LogoutReason.field9132;

	@ObfuscatedName("adh.ep")
	public static Mouse mouse;

	@ObfuscatedName("client.ev")
	public static LinkList mouseEvents = new LinkList();

	@ObfuscatedName("client.ec")
	public static int field10817 = 0;

	@ObfuscatedName("aph.ek")
	public static Keyboard keyboard;

	@ObfuscatedName("client.eh")
	public static int allKeyboardEventCount = 0;

	@ObfuscatedName("client.eq")
	public static KeyboardEvent[] allKeyboardEvents = new KeyboardEvent[131];

	@ObfuscatedName("client.ez")
	public static int keyboardEventCount = 0;

	@ObfuscatedName("client.ef")
	public static KeyboardEvent[] keyboardEvents = new KeyboardEvent[75];

	@ObfuscatedName("client.et")
	public static Color[] loadingBarFillColour = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@ObfuscatedName("client.ea")
	public static Color[] loadingBarOutlineColour = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@ObfuscatedName("client.ew")
	public static Color[] loadingBarTextColour = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@ObfuscatedName("afm.er")
	public static Socket js5Socket;

	@ObfuscatedName("vc.en")
	public static Stream js5Stream;

	@ObfuscatedName("qx.eb")
	public static Js5TcpClient js5TcpClient;

	@ObfuscatedName("pj.ex")
	public static Js5HttpClient js5HttpClient;

	@ObfuscatedName("pc.fg")
	public static Js5DiskCache js5DiskCache;

	@ObfuscatedName("ft.fm")
	public static Js5Client js5Client;

	@ObfuscatedName("client.fu")
	public static int js5ConnectState = 0;

	@ObfuscatedName("client.fs")
	public static int field10821 = 0;

	@ObfuscatedName("agq.fz")
	public static long field10353;

	@ObfuscatedName("tg.fj")
	public static Js5NetResourceProvider[] js5Providers;

	@ObfuscatedName("vs.fd")
	public static Js5 animsJs5;

	@ObfuscatedName("agg.fn")
	public static Js5 animsKeyframesJs5;

	@ObfuscatedName("ajf.fi")
	public static Js5 basesJs5;

	@ObfuscatedName("anx.ft")
	public static Js5 configJs5;

	@ObfuscatedName("c.fx")
	public static Js5 interfacesJs5;

	@ObfuscatedName("amo.fv")
	public static Js5 mapsJs5;

	@ObfuscatedName("adn.fc")
	public static Js5 modelsJs5;

	@ObfuscatedName("agd.fw")
	public static Js5 spritesJs5;

	@ObfuscatedName("aff.fa")
	public static Js5 materialsJs5;

	@ObfuscatedName("abn.fp")
	public static Js5 binaryJs5;

	@ObfuscatedName("rz.fq")
	public static Js5 clientscriptsJs5;

	@ObfuscatedName("wc.ff")
	public static Js5 fontmetricsJs5;

	@ObfuscatedName("ig.fl")
	public static Js5 vorbisJs5;

	@ObfuscatedName("kl.fb")
	public static Js5 audiostreamsJs5;

	@ObfuscatedName("vq.fo")
	public static Js5 dbtableIndexJs5;

	@ObfuscatedName("dn.fy")
	public static Js5 texturesPngJs5;

	@ObfuscatedName("pu.fe")
	public static Js5 configLocJs5;

	@ObfuscatedName("abv.fk")
	public static Js5 configEnumJs5;

	@ObfuscatedName("qr.fh")
	public static Js5 configNpcJs5;

	@ObfuscatedName("vh.fr")
	public static Js5 configObjJs5;

	@ObfuscatedName("zh.gu")
	public static Js5 configSeqJs5;

	@ObfuscatedName("hx.gq")
	public static Js5 configSpotJs5;

	@ObfuscatedName("nn.gl")
	public static Js5 configStructJs5;

	@ObfuscatedName("pl.go")
	public static Js5 quickchatJs5;

	@ObfuscatedName("gy.gk")
	public static Js5 quickchatGlobalJs5;

	@ObfuscatedName("tp.gp")
	public static Js5 configParticleJs5;

	@ObfuscatedName("ad.gy")
	public static Js5 configBillboardJs5;

	@ObfuscatedName("db.ga")
	public static Js5 defaultsJs5;

	@ObfuscatedName("uc.gn")
	public static Js5 dllsJs5;

	@ObfuscatedName("jm.gc")
	public static Js5 shadersJs5;

	@ObfuscatedName("nr.gf")
	public static Js5 cutscenesJs5;

	@ObfuscatedName("aik.gx")
	public static Js5 worldmapJs5;

	@ObfuscatedName("zm.ge")
	public static Js5 worldmapAreaDataJs5;

	@ObfuscatedName("aal.gg")
	public static Map js5Archives;

	@ObfuscatedName("client.gr")
	public static int field10829 = 0;

	@ObfuscatedName("ea.gs")
	public static DiskStore diskStore;

	@ObfuscatedName("client.gt")
	public static SoftLruHashTable field10830 = new SoftLruHashTable(8);

	@ObfuscatedName("client.gh")
	public static SoftLruHashTable headIconsCache = new SoftLruHashTable(8);

	@ObfuscatedName("client.gm")
	public static String field11068 = null;

	@ObfuscatedName("ahe.gv")
	public static HardwarePlatformLoader hardwarePlatformLoader;

	@ObfuscatedName("vh.gj")
	public static FontProvider fontProvider;

	@ObfuscatedName("client.gw")
	public static final FontFactory fontFactory = new ClientFontFactory();

	@ObfuscatedName("mt.gd")
	public static EmojiList emojiList;

	@ObfuscatedName("amf.gz")
	public static BASTypeList basTypeList;

	@ObfuscatedName("he.gb")
	public static CursorTypeList cursorTypeList;

	@ObfuscatedName("acz.gi")
	public static CachingConfigTypeList dbRowTypeList;

	@ObfuscatedName("fv.hm")
	public static CachingConfigTypeList dbTableTypeList;

	@ObfuscatedName("client.ha")
	public static SoftLruHashTable field10834 = new SoftLruHashTable(16);

	@ObfuscatedName("client.hk")
	public static SoftLruHashTable field10857 = new SoftLruHashTable(8);

	@ObfuscatedName("aaq.hu")
	public static EnumTypeList enumTypeList;

	@ObfuscatedName("yg.hb")
	public static FloorOverlayTypeList overlayTypeList;

	@ObfuscatedName("ys.hl")
	public static FloorUnderlayTypeList underlayTypeList;

	@ObfuscatedName("jr.hg")
	public static HitmarkTypeList hitmarkTypeList;

	@ObfuscatedName("rp.hd")
	public static HeadbarTypeList headbarTypeList;

	@ObfuscatedName("in.hx")
	public static IDKTypeList idkTypeList;

	@ObfuscatedName("wi.hq")
	public static InvTypeList invTypeList;

	@ObfuscatedName("xr.hf")
	public static LightTypeList lightTypeList;

	@ObfuscatedName("fr.hr")
	public static LocTypeList locTypeList;

	@ObfuscatedName("rz.hs")
	public static MapElementTypeList mapElementTypeList;

	@ObfuscatedName("on.hh")
	public static MSITypeList msiTypeList;

	@ObfuscatedName("xd.hp")
	public static NPCTypeList npcTypeList;

	@ObfuscatedName("fw.hy")
	public static ObjTypeList objTypeList;

	@ObfuscatedName("kl.he")
	public static ParamTypeList paramTypeList;

	@ObfuscatedName("gh.hn")
	public static QuestTypeList questTypeList;

	@ObfuscatedName("client.hi")
	public static SeqGroupTypeList seqGroupTypeList;

	@ObfuscatedName("abe.hw")
	public static SeqTypeList seqTypeList;

	@ObfuscatedName("je.ht")
	public static SkyBoxTypeList skyBoxTypeList;

	@ObfuscatedName("ac.hc")
	public static SkyDecorTypeList skyDecorTypeList;

	@ObfuscatedName("qb.ho")
	public static EffectAnimTypeList effectAnimTypeList;

	@ObfuscatedName("ww.hj")
	public static StructTypeList structTypeList;

	@ObfuscatedName("acw.hv")
	public static VarBasicTypeListClient varBasicTypeList;

	@ObfuscatedName("abc.hz")
	public static VarBitTypeList varBitTypeList;

	@ObfuscatedName("aas.ij")
	public static VarPlayerTypeListClient varPlayerTypeList;

	@ObfuscatedName("abm.io")
	public static VarBasicTypeListClient varClanTypeList;

	@ObfuscatedName("yj.iq")
	public static VarBasicTypeListClient varNpcTypeList;

	@ObfuscatedName("ari.ig")
	public static VarBasicTypeListClient varClanSettingTypeList;

	@ObfuscatedName("mz.iv")
	public static VarBasicTypeListClient varPlayerGroupTypeList;

	@ObfuscatedName("fj.ie")
	public static VarBasicTypeListClient varObjTypeList;

	@ObfuscatedName("ch.iu")
	public static Map varDomainToListEnumMap;

	@ObfuscatedName("qi.in")
	public static VariableTypeProvider variableTypeProvider;

	@ObfuscatedName("nu.ir")
	public static QuickChatCatTypeList quickChatCatTypeList;

	@ObfuscatedName("k.it")
	public static QuickChatPhraseTypeList quickChatPhraseTypeList;

	@ObfuscatedName("ek.ix")
	public static WearposDefaults wearposDefaults;

	@ObfuscatedName("if.is")
	public static SkillDefaults skillDefaults;

	@ObfuscatedName("akp.ib")
	public static GraphicsDefaults graphicsDefaults;

	@ObfuscatedName("ih.il")
	public static CutsceneDefaults cutsceneDefaults;

	@ObfuscatedName("xh.iw")
	public static TitleDefaults titleDefaults;

	@ObfuscatedName("client.ip")
	public static PlayerGroupResourceProvider field10837 = new ClientPlayerGroupResourceProvider();

	@ObfuscatedName("client.id")
	public static HashTable npcs = new HashTable(64);

	@ObfuscatedName("client.ia")
	public static ObjectNode[] field10839 = new ObjectNode[1024];

	@ObfuscatedName("client.if")
	public static int npcCount = 0;

	@ObfuscatedName("client.ih")
	public static int npcSlotCount = 0;

	@ObfuscatedName("client.iy")
	public static int[] field11036 = new int[1024];

	@ObfuscatedName("client.ii")
	public static int field10876 = 0;

	@ObfuscatedName("client.iz")
	public static int[] field10844 = new int[251];

	@ObfuscatedName("client.ik")
	public static int field10815 = 0;

	@ObfuscatedName("client.im")
	public static int field10846 = 0;

	@ObfuscatedName("client.ic")
	public static int[] field10847 = new int[1000];

	@ObfuscatedName("amt.jd")
	public static Stream field11764;

	@ObfuscatedName("client.jf")
	public static final ServerConnection lobbyConnection = new ServerConnection();

	@ObfuscatedName("client.ju")
	public static final ServerConnection gameConnection = new ServerConnection();

	@ObfuscatedName("client.jy")
	public static final ServerConnection[] connections = new ServerConnection[] {gameConnection, lobbyConnection};

	@ObfuscatedName("client.jl")
	public static int currentIncrementVerifyId = 0;

	@ObfuscatedName("client.jn")
	public static boolean incrementVerifyIdChanged = false;

	@ObfuscatedName("client.je")
	public static InetAddressLookupRequest inetAddressLookupRequest = new InetAddressLookupRequest();

	@ObfuscatedName("nm.jb")
	public static long field3457;

	@ObfuscatedName("x.jm")
	public static PingRequest pingRequest;

	@ObfuscatedName("client.jw")
	public static SecureRandomProvider secureRandomProvider = new SecureRandomProvider();

	@ObfuscatedName("agf.jr")
	public static SecureRandom secureRandom;

	@ObfuscatedName("client.js")
	public static World world = new World(false);

	@ObfuscatedName("ky.ji")
	public static AsyncRebuild asyncRebuild;

	@ObfuscatedName("client.jt")
	public static volatile boolean field10856 = false;

	@ObfuscatedName("client.jq")
	public static Object field10920 = new Object();

	@ObfuscatedName("client.jv")
	public static Object field10858 = new Object();

	@ObfuscatedName("client.ja")
	public static int[] field10859 = new int[64];

	@ObfuscatedName("client.jj")
	public static int field10938 = 0;

	@ObfuscatedName("client.jo")
	public static final int[] locShapeToLayer = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("afu.jz")
	public static int zoneBaseLevel;

	@ObfuscatedName("ev.jc")
	public static int zoneBaseX;

	@ObfuscatedName("ahg.jg")
	public static int zoneBaseZ;

	@ObfuscatedName("client.jx")
	public static int cutsceneId = -1;

	@ObfuscatedName("client.jh")
	public static int sceneState = 3;

	@ObfuscatedName("client.jp")
	public static boolean field10877 = false;

	@ObfuscatedName("client.jk")
	public static int field11041 = -1;

	@ObfuscatedName("client.kw")
	public static int field10797 = 0;

	@ObfuscatedName("abi.kz")
	public static Packet field8729;

	@ObfuscatedName("client.ke")
	public static int field10769 = 0;

	@ObfuscatedName("client.kq")
	public static int field10868 = -1;

	@ObfuscatedName("client.kg")
	public static int field10869 = -1;

	@ObfuscatedName("xc.ku")
	public static int field7950;

	@ObfuscatedName("age.ko")
	public static int field10297;

	@ObfuscatedName("aau.kf")
	public static int field8521;

	@ObfuscatedName("fa.kx")
	public static int field1843;

	@ObfuscatedName("client.ki")
	public static int field11002 = 255;

	@ObfuscatedName("client.ks")
	public static int field10871 = 0;

	@ObfuscatedName("client.kh")
	public static int field10872 = 0;

	@ObfuscatedName("client.ka")
	public static int field10805 = 0;

	@ObfuscatedName("client.kb")
	public static int[] field11092 = new int[4096];

	@ObfuscatedName("client.kr")
	public static int[] field10984 = new int[4096];

	@ObfuscatedName("fy.kd")
	public static int field1891;

	@ObfuscatedName("fs.kc")
	public static int field1797;

	@ObfuscatedName("client.kj")
	public static final int[] field10823 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@ObfuscatedName("client.kn")
	public static int cameraAnticheatOffsetX = 0;

	@ObfuscatedName("client.kp")
	public static int cameraOffsetXModifier = 2;

	@ObfuscatedName("client.km")
	public static int cameraAnticheatOffsetZ = 0;

	@ObfuscatedName("client.ky")
	public static int cameraOffsetZModifier = 2;

	@ObfuscatedName("client.kk")
	public static int cameraAnticheatAngle = 0;

	@ObfuscatedName("client.kv")
	public static int cameraOffsetYawModifier = 1;

	@ObfuscatedName("client.kt")
	public static int cameraOffsetCycle = 0;

	@ObfuscatedName("client.li")
	public static int minimapAnticheatAngle = 0;

	@ObfuscatedName("client.lv")
	public static int minimapAngleModifier = 2;

	@ObfuscatedName("client.la")
	public static int minimapZoom = 0;

	@ObfuscatedName("client.lp")
	public static int minimapZoomModifier = 1;

	@ObfuscatedName("client.lc")
	public static int minimapOffsetCycle = 0;

	@ObfuscatedName("eu.lf")
	public static int field1681;

	@ObfuscatedName("client.lm")
	public static Random field10890 = new Random();

	@ObfuscatedName("client.ll")
	public static int sceneDelta = 0;

	@ObfuscatedName("client.lb")
	public static int field10892 = 0;

	@ObfuscatedName("client.le")
	public static int field10893 = 0;

	@ObfuscatedName("xb.lr")
	public static int cameraX;

	@ObfuscatedName("ahq.lq")
	public static int cameraY;

	@ObfuscatedName("fo.lo")
	public static int cameraZ;

	@ObfuscatedName("vp.lh")
	public static int cameraPitch;

	@ObfuscatedName("aav.ls")
	public static int cameraYaw;

	@ObfuscatedName("is.lu")
	public static int cameraRoll;

	@ObfuscatedName("client.ly")
	public static float orbitCameraPitch = 1088.0F;

	@ObfuscatedName("client.lg")
	public static float orbitCameraYaw = 0.0F;

	@ObfuscatedName("client.lx")
	public static float field10896 = 0.0F;

	@ObfuscatedName("client.lj")
	public static float field10897 = 0.0F;

	@ObfuscatedName("client.lw")
	public static boolean field10898 = false;

	@ObfuscatedName("client.lz")
	public static boolean field11059 = false;

	@ObfuscatedName("acw.ln")
	public static int orbitCameraX;

	@ObfuscatedName("nl.lt")
	public static int orbitCameraZ;

	@ObfuscatedName("client.ld")
	public static int field11089 = 1;

	@ObfuscatedName("client.lk")
	public static int cameraFollowHeight = field11089 * 35 + 200;

	@ObfuscatedName("client.mf")
	public static boolean field10902 = true;

	@ObfuscatedName("client.mh")
	public static int cameraPitchClamp = 0;

	@ObfuscatedName("client.me")
	public static int[][][] cutsceneSpline = new int[2][][];

	@ObfuscatedName("client.mn")
	public static int field10904 = -1;

	@ObfuscatedName("client.mv")
	public static int field10908 = -1;

	@ObfuscatedName("client.my")
	public static int field10909 = 0;

	@ObfuscatedName("client.md")
	public static int field10932 = 0;

	@ObfuscatedName("client.mk")
	public static int field10976 = 0;

	@ObfuscatedName("client.mq")
	public static int field10843 = 0;

	@ObfuscatedName("client.ms")
	public static int field10913 = 0;

	@ObfuscatedName("client.mp")
	public static boolean field10813 = false;

	@ObfuscatedName("client.mo")
	public static boolean field10969 = false;

	@ObfuscatedName("jk.ml")
	public static int field3023;

	@ObfuscatedName("client.mi")
	public static int sceneCycle = 0;

	@ObfuscatedName("client.mr")
	public static int[] field10917 = new int[503];

	@ObfuscatedName("client.mz")
	public static int[] field10918 = new int[512];

	@ObfuscatedName("client.mb")
	public static int field10919 = 0;

	@ObfuscatedName("client.mu")
	public static LinkQueue field10882 = new LinkQueue();

	@ObfuscatedName("client.mt")
	public static int drawOrder = 0;

	@ObfuscatedName("client.mc")
	public static float[] projection = new float[3];

	@ObfuscatedName("client.ma")
	public static int crossX = 0;

	@ObfuscatedName("client.mj")
	public static int crossY = 0;

	@ObfuscatedName("client.mw")
	public static int crossCycle = 0;

	@ObfuscatedName("client.mm")
	public static int crossMode = 0;

	@ObfuscatedName("vx.nd")
	public static Component selectedArea;

	@ObfuscatedName("client.ne")
	public static int selectedCycle = 0;

	@ObfuscatedName("acb.ny")
	public static FullscreenMode[] field8871;

	@ObfuscatedName("client.np")
	public static int field11046 = -1;

	@ObfuscatedName("client.na")
	public static int[] field11061 = new int[2];

	@ObfuscatedName("client.ni")
	public static int[] field10933 = new int[2];

	@ObfuscatedName("client.nb")
	public static int[] field10934 = new int[2];

	@ObfuscatedName("client.nw")
	public static int[] field10935 = new int[2];

	@ObfuscatedName("client.nx")
	public static int[] field10820 = new int[2];

	@ObfuscatedName("client.nl")
	public static long windowModeChangeTime = 0L;

	@ObfuscatedName("client.ng")
	public static boolean field10960 = true;

	@ObfuscatedName("client.nt")
	public static int frameXMargin = 32;

	@ObfuscatedName("client.nn")
	public static int frameYMargin = 16;

	@ObfuscatedName("client.nk")
	public static int frameWidth = 765;

	@ObfuscatedName("client.nq")
	public static int frameHeight = 553;

	@ObfuscatedName("client.nu")
	public static PlayerEntity[] players = new PlayerEntity[2048];

	@ObfuscatedName("qo.nf")
	public static int currentPlayerLevel;

	@ObfuscatedName("client.nz")
	public static int currentPlayerUid = -1;

	@ObfuscatedName("qx.ns")
	public static PlayerEntity localPlayerEntity;

	@ObfuscatedName("client.nc")
	public static Map playerSnapshots = new java.util.HashMap();

	@ObfuscatedName("client.nv")
	public static boolean playerIsMembers = false;

	@ObfuscatedName("client.nh")
	public static boolean loggedInMembers = false;

	@ObfuscatedName("vw.oh")
	public static int lobbyDOB;

	@ObfuscatedName("client.oo")
	public static int staffModLevel = 0;

	@ObfuscatedName("client.ol")
	public static int playerModLevel = 0;

	@ObfuscatedName("client.oq")
	public static boolean field10951 = false;

	@ObfuscatedName("client.oi")
	public static boolean playerIsQuickChat = false;

	@ObfuscatedName("client.ot")
	public static boolean field10953 = false;

	@ObfuscatedName("client.ow")
	public static AttackOpPriority field10954 = AttackOpPriority.field7908;

	@ObfuscatedName("client.oa")
	public static AttackOpPriority field10955 = AttackOpPriority.field7908;

	@ObfuscatedName("client.oz")
	public static boolean loggedInQuickChat = false;

	@ObfuscatedName("client.op")
	public static final short[] field10958 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };

	@ObfuscatedName("client.om")
	public static final short[] field10959 = new short[] { 9, 10, 11, 12, 13, 1003 };

	@ObfuscatedName("client.of")
	public static int[] field10832 = new int[8];

	@ObfuscatedName("client.oy")
	public static String[] field10961 = new String[8];

	@ObfuscatedName("client.od")
	public static boolean[] field10962 = new boolean[8];

	@ObfuscatedName("qn.on")
	public static String field4868;

	@ObfuscatedName("client.os")
	public static int field10963 = -1;

	@ObfuscatedName("zj.og")
	public static long lobbyMembership;

	@ObfuscatedName("cb.oj")
	public static long field1238;

	@ObfuscatedName("alc.ok")
	public static boolean field11709;

	@ObfuscatedName("iw.or")
	public static int lobbyJCoinsBalance;

	@ObfuscatedName("ki.ou")
	public static int lobbyLoyaltyBalance;

	@ObfuscatedName("adh.oe")
	public static int lobbyRecoveryDay;

	@ObfuscatedName("xh.ov")
	public static int lobbyUnreadMessages;

	@ObfuscatedName("fx.oc")
	public static int lobbyLastLoginDay;

	@ObfuscatedName("xs.ox")
	public static int playerHostName;

	@ObfuscatedName("sj.pt")
	public static int lobbyEmailStatus;

	@ObfuscatedName("jd.pi")
	public static int lobbyCCExpiry;

	@ObfuscatedName("pg.pq")
	public static int lobbyGraceExpiry;

	@ObfuscatedName("aov.ph")
	public static boolean lobbyDOBRequested;

	@ObfuscatedName("rg.pe")
	public static int lobbyMembersStats;

	@ObfuscatedName("sg.pb")
	public static int lobbyPlayAge;

	@ObfuscatedName("client.pw")
	public static HashTable objStacks = new HashTable(64);

	@ObfuscatedName("client.pk")
	public static LinkList projectiles = new LinkList();

	@ObfuscatedName("client.pm")
	public static HashTable spotanims = new HashTable(16);

	@ObfuscatedName("client.pa")
	public static LinkQueue textCoords = new LinkQueue();

	@ObfuscatedName("client.pz")
	public static int field10968 = 0;

	@ObfuscatedName("client.pd")
	public static int field11038 = -1;

	@ObfuscatedName("client.pn")
	public static int defaultCursor = -1;

	@ObfuscatedName("client.px")
	public static int field10971 = -1;

	@ObfuscatedName("client.ps")
	public static int currentCursor = -1;

	@ObfuscatedName("client.pl")
	public static boolean targetModeActive = false;

	@ObfuscatedName("sy.po")
	public static int activeComponentParentLayer;

	@ObfuscatedName("client.pr")
	public static int activeComponentId = -1;

	@ObfuscatedName("client.py")
	public static int activeComponentInvobject = -1;

	@ObfuscatedName("ex.pg")
	public static int field1765;

	@ObfuscatedName("wx.pv")
	public static int field7677;

	@ObfuscatedName("fp.pj")
	public static int field1844;

	@ObfuscatedName("client.pf")
	public static String field11039 = null;

	@ObfuscatedName("client.pp")
	public static String field10977 = null;

	@ObfuscatedName("client.pu")
	public static volatile int openedTopInterface = -1;

	@ObfuscatedName("client.pc")
	public static HashTable openedSubInterfaces = new HashTable(8);

	@ObfuscatedName("client.qp")
	public static int chatEffects = 0;

	@ObfuscatedName("client.qx")
	public static Component pressedContinueOption = null;

	@ObfuscatedName("client.qt")
	public static int runEnergy = 0;

	@ObfuscatedName("client.qz")
	public static int runWeight = 0;

	@ObfuscatedName("client.qg")
	public static boolean field10881 = false;

	@ObfuscatedName("client.qe")
	public static boolean field10985 = false;

	@ObfuscatedName("client.ql")
	public static Component field10986 = null;

	@ObfuscatedName("client.qj")
	public static boolean gameScreenEnabled = true;

	@ObfuscatedName("client.qr")
	public static boolean field10988 = false;

	@ObfuscatedName("client.qc")
	public static Component field10989 = null;

	@ObfuscatedName("client.qd")
	public static Component field10828 = null;

	@ObfuscatedName("client.qi")
	public static int field10991 = 0;

	@ObfuscatedName("client.qy")
	public static int field10992 = 0;

	@ObfuscatedName("client.qw")
	public static Component field10993 = null;

	@ObfuscatedName("ez.qo")
	public static Component field1734;

	@ObfuscatedName("client.qm")
	public static boolean field10878 = false;

	@ObfuscatedName("client.qq")
	public static int field10995 = -1;

	@ObfuscatedName("client.qf")
	public static int field10889 = -1;

	@ObfuscatedName("client.qu")
	public static int field10799 = -1;

	@ObfuscatedName("client.qs")
	public static int field10998 = -1;

	@ObfuscatedName("client.qa")
	public static boolean field10999 = false;

	@ObfuscatedName("client.qh")
	public static int field11000 = -1;

	@ObfuscatedName("client.qv")
	public static int field10852 = -1;

	@ObfuscatedName("client.qk")
	public static boolean field10886 = false;

	@ObfuscatedName("sh.qn")
	public static int field6656;

	@ObfuscatedName("wo.qb")
	public static Component[] field7603;

	@ObfuscatedName("qn.rw")
	public static int field4869;

	@ObfuscatedName("apj.rf")
	public static int field11893;

	@ObfuscatedName("client.rp")
	public static int field11003 = 0;

	@ObfuscatedName("client.ro")
	public static boolean field10860 = false;

	@ObfuscatedName("hs.rq")
	public static int field2413;

	@ObfuscatedName("zn.rs")
	public static int field8287;

	@ObfuscatedName("client.rk")
	public static boolean minimapClicked = false;

	@ObfuscatedName("r.rm")
	public static int field530;

	@ObfuscatedName("th.ri")
	public static int field6866;

	@ObfuscatedName("sv.rj")
	public static int field5107;

	@ObfuscatedName("client.rv")
	public static int redrawCycle = 1;

	@ObfuscatedName("client.rx")
	public static int[] varpTransmitted = new int[64];

	@ObfuscatedName("client.ry")
	public static int varpTransmitNum = 0;

	@ObfuscatedName("client.rg")
	public static int[] field10783 = new int[64];

	@ObfuscatedName("client.rz")
	public static int field11012 = 0;

	@ObfuscatedName("client.re")
	public static int[] field11015 = new int[64];

	@ObfuscatedName("client.rt")
	public static int field11014 = 0;

	@ObfuscatedName("client.rl")
	public static int[] varcTransmitted = new int[64];

	@ObfuscatedName("client.rc")
	public static int varcTransmitNum = 0;

	@ObfuscatedName("client.rr")
	public static int[] varcstrTransmitted = new int[64];

	@ObfuscatedName("client.rd")
	public static int varcstrTransmitNum = 0;

	@ObfuscatedName("client.rn")
	public static int[] field10841 = new int[64];

	@ObfuscatedName("client.rb")
	public static int field11020 = 0;

	@ObfuscatedName("client.ru")
	public static int lastOnChatTransmitRedrawCycle = 0;

	@ObfuscatedName("client.sv")
	public static int lastOnFriendTransmitRedrawCycle = 0;

	@ObfuscatedName("client.sw")
	public static int lastOnClanTransmitRedrawCycle = 0;

	@ObfuscatedName("client.ss")
	public static int lastOnClanSettingsTransmitRedrawCycle = 0;

	@ObfuscatedName("client.sx")
	public static int lastOnClanChannelTransmitRedrawCycle = 0;

	@ObfuscatedName("client.sm")
	public static int lastOnStockTransmitRedrawCycle = 0;

	@ObfuscatedName("client.sk")
	public static int lastOnMiscTransmitRedrawCycle = 0;

	@ObfuscatedName("client.si")
	public static int lastOnPlayerGroupTransmitRedrawCycle = 0;

	@ObfuscatedName("client.se")
	public static int lastOnPlayerGroupVarpTransmitRedrawCycle = 0;

	@ObfuscatedName("client.sn")
	public static int lastOnCameraUpdateTransmitRedrawCycle = 0;

	@ObfuscatedName("uk.sr")
	public static ClientVarDomain clientVarDomain;

	@ObfuscatedName("wh.sq")
	public static SparseVarDomain varClan;

	@ObfuscatedName("client.sh")
	public static LinkList hookRequests = new LinkList();

	@ObfuscatedName("client.st")
	public static LinkList hookRequestsTimer = new LinkList();

	@ObfuscatedName("client.sl")
	public static LinkList hookRequestsMouseStop = new LinkList();

	@ObfuscatedName("client.sp")
	public static HashTable field10873 = new HashTable(512);

	@ObfuscatedName("mc.su")
	public static Clipboard clipboard;

	@ObfuscatedName("client.sz")
	public static int topLevelComponentCount = 0;

	@ObfuscatedName("client.sf")
	public static int field11037 = -2;

	@ObfuscatedName("client.sy")
	public static boolean[] topLevelComponentRedrawRequestedTemp = new boolean[114];

	@ObfuscatedName("client.sa")
	public static boolean[] topLevelComponentRedrawRequested = new boolean[114];

	@ObfuscatedName("client.sb")
	public static Rectangle[] field11040 = new Rectangle[114];

	@ObfuscatedName("client.sj")
	public static int componentDrawMode;

	@ObfuscatedName("client.so")
	public static final int[] field11042;

	@ObfuscatedName("client.sc")
	public static int chatCount;

	@ObfuscatedName("client.sg")
	public static int field11044;

	@ObfuscatedName("client.tu")
	public static int[] chatX;

	@ObfuscatedName("client.ta")
	public static int[] chatY;

	@ObfuscatedName("client.tr")
	public static int[] chatWidth;

	@ObfuscatedName("client.tc")
	public static EntityChatLine[] chats;

	@ObfuscatedName("client.tj")
	public static final int[] chatColours;

	@ObfuscatedName("client.te")
	public static int publicChatFilter;

	@ObfuscatedName("agr.ti")
	public static PrivateChatFilter privateChatFilter;

	@ObfuscatedName("client.tm")
	public static int tradeChatFilter;

	@ObfuscatedName("client.tb")
	public static long[] messageIds;

	@ObfuscatedName("client.tn")
	public static int messageCount;

	@ObfuscatedName("client.tw")
	public static String clanChatDisplayName;

	@ObfuscatedName("client.tz")
	public static String clanChatOwnerName;

	@ObfuscatedName("hq.tf")
	public static byte clanChatMinKick;

	@ObfuscatedName("gq.th")
	public static byte clanChatRank;

	@ObfuscatedName("ady.tt")
	public static FriendChatUser[] clanChatUsers;

	@ObfuscatedName("vs.ts")
	public static int clanChatCount;

	@ObfuscatedName("tt.tp")
	public static ClanSettings listenedClanSettings;

	@ObfuscatedName("fy.tv")
	public static ClanSettings affinedClanSettings;

	@ObfuscatedName("ex.to")
	public static ClanChannel listenedClanChannel;

	@ObfuscatedName("jk.tg")
	public static ClanChannel affinedClanChannel;

	@ObfuscatedName("so.tq")
	public static PlayerGroup currentPlayerGroup;

	@ObfuscatedName("client.tx")
	public static StockmarketSlot[][] stockmarketSlots;

	@ObfuscatedName("mz.tk")
	public static int cameraState;

	@ObfuscatedName("aaz.tl")
	public static int cameraMoveX;

	@ObfuscatedName("aar.td")
	public static int cameraMoveZ;

	@ObfuscatedName("am.ul")
	public static int cameraSrcHeight;

	@ObfuscatedName("jr.um")
	public static int cameraMoveAcceleration;

	@ObfuscatedName("f.uq")
	public static int cameraMoveSpeed;

	@ObfuscatedName("sb.uc")
	public static int cameraLookX;

	@ObfuscatedName("iu.ui")
	public static int cameraLookZ;

	@ObfuscatedName("gj.ua")
	public static int field1983;

	@ObfuscatedName("aac.uf")
	public static int cameraRotateAcceleration;

	@ObfuscatedName("aw.uz")
	public static int cameraRotateSpeed;

	@ObfuscatedName("client.ug")
	public static int field10899;

	@ObfuscatedName("adn.ub")
	public static int field9214;

	@ObfuscatedName("qk.uj")
	public static int field4857;

	@ObfuscatedName("uy.ut")
	public static int field7231;

	@ObfuscatedName("cz.uk")
	public static int field1267;

	@ObfuscatedName("abh.uy")
	public static int field8720;

	@ObfuscatedName("vx.uv")
	public static int field7286;

	@ObfuscatedName("ax.uw")
	public static int field810;

	@ObfuscatedName("no.up")
	public static int field3538;

	@ObfuscatedName("client.ud")
	public static ClientCameraTrackableProvider cameraProvider;

	@ObfuscatedName("aco.uh")
	public static BasicCamera cam2;

	@ObfuscatedName("ah.us")
	public static long field637;

	@ObfuscatedName("client.ur")
	public static boolean[] cameraModifierEnabled;

	@ObfuscatedName("client.uu")
	public static int[] cameraModifierJitter;

	@ObfuscatedName("client.uo")
	public static int[] cameraModifierWobbleScale;

	@ObfuscatedName("client.un")
	public static int[] cameraModifierCycle;

	@ObfuscatedName("client.ue")
	public static int[] cameraModifierWobbleSpeed;

	@ObfuscatedName("client.vq")
	public static short viewportFovMax;

	@ObfuscatedName("client.vx")
	public static short viewportFovMin;

	@ObfuscatedName("client.vb")
	public static short viewportZoomMin;

	@ObfuscatedName("client.vl")
	public static short viewportZoomMax;

	@ObfuscatedName("client.vr")
	public static short field11070;

	@ObfuscatedName("client.vo")
	public static short field11071;

	@ObfuscatedName("client.vv")
	public static short field10900;

	@ObfuscatedName("client.vw")
	public static short field10943;

	@ObfuscatedName("client.vt")
	public static int viewportX;

	@ObfuscatedName("client.vu")
	public static int viewportY;

	@ObfuscatedName("client.vi")
	public static int viewportWidth;

	@ObfuscatedName("client.va")
	public static int viewportHeight;

	@ObfuscatedName("client.vs")
	public static int field11078;

	@ObfuscatedName("client.vy")
	public static int friendsCount;

	@ObfuscatedName("client.ve")
	public static int friendsListState;

	@ObfuscatedName("client.vg")
	public static Friend[] friends;

	@ObfuscatedName("client.vp")
	public static LinkQueue field10910;

	@ObfuscatedName("client.vd")
	public static int ignoresCount;

	@ObfuscatedName("client.vz")
	public static Ignore[] ignores;

	@ObfuscatedName("xf.vj")
	public static int[] objFindResults;

	@ObfuscatedName("abi.vc")
	public static int objFindResultsIndex;

	@ObfuscatedName("aij.vn")
	public static int[] chatPhraseFindResults;

	@ObfuscatedName("uh.vf")
	public static int chatPhraseFindResultsIndex;

	@ObfuscatedName("au.vk")
	public static List field754;

	@ObfuscatedName("aci.wn")
	public static Iterator field8853;

	@ObfuscatedName("client.wa")
	public static int field10767;

	@ObfuscatedName("client.wo")
	public static Calendar field11088;

	@ObfuscatedName("client.wu")
	public static PrimaryLayerEntityPredicate field11001;

	@ObfuscatedName("akr.wk")
	public static GarbageCollectorMXBean field11399;

	@ObfuscatedName("client.wz")
	public static long field11090;

	@ObfuscatedName("client.wj")
	public static long field11091;

	@ObfuscatedName("fs.we")
	public static AudioApi audioApi;

	@ObfuscatedName("xb.wr")
	public static HttpClient field7957;

	@ObfuscatedName("client.wl")
	public static SoftLruHashTable field11013;

	@ObfuscatedName("client.wp")
	public static Map field11093;

	@ObfuscatedName("fk.wv")
	public static TotpPreferences authPreferences;

	@ObfuscatedName("client.wg")
	public static TelemetryGrid telemetry;

	@ObfuscatedName("client.wb")
	public static boolean telemetryError;

	@ObfuscatedName("client.wq")
	public static boolean field11096;

	@ObfuscatedName("client.xv")
	public static final int[] field11113;

	@ObfuscatedName("client.xn")
	public static List field11114;

	@ObfuscatedName("ul.xg")
	public static Iterator field7015;

	static {
		for (int var0 = 0; var0 < 114; var0++) {
			field11040[var0] = new Rectangle();
		}
		componentDrawMode = 0;
		field11042 = new int[4];
		chatCount = 0;
		field11044 = 54;
		chatX = new int[field11044];
		chatY = new int[field11044];
		chatWidth = new int[field11044];
		chats = new EntityChatLine[field11044];
		chatColours = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		publicChatFilter = 0;
		tradeChatFilter = 0;
		messageIds = new long[100];
		messageCount = 0;
		clanChatDisplayName = null;
		clanChatOwnerName = null;
		stockmarketSlots = new StockmarketSlot[3][8];
		field10899 = 0;
		cameraProvider = new ClientCameraTrackableProvider();
		cameraModifierEnabled = new boolean[5];
		cameraModifierJitter = new int[5];
		cameraModifierWobbleScale = new int[5];
		cameraModifierCycle = new int[5];
		cameraModifierWobbleSpeed = new int[5];
		viewportFovMax = 256;
		viewportFovMin = 205;
		viewportZoomMin = 256;
		viewportZoomMax = 320;
		field11070 = 1;
		field11071 = 32767;
		field10900 = 1;
		field10943 = 32767;
		viewportX = 0;
		viewportY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		field11078 = 0;
		friendsCount = 0;
		friendsListState = 0;
		friends = new Friend[400];
		field10910 = new LinkQueue();
		ignoresCount = 0;
		ignores = new Ignore[400];
		field10767 = -1;
		field11088 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		field11001 = new PrimaryLayerLocEntityPredicate();
		field11090 = -1L;
		field11091 = -1L;
		field11013 = new SoftLruHashTable(8);
		field11093 = new java.util.HashMap();
		telemetry = new TelemetryGrid();
		telemetryError = false;
		field11096 = false;
		field11113 = new int[4];
		field11114 = new ArrayList();
	}

	@ObfuscatedName("aaj.eo(I)V")
	public static void resetTransmitNums() {
		varpTransmitNum = 0;
		field11012 = 0;
		field11014 = 0;
		varcTransmitNum = 0;
		varcstrTransmitNum = 0;
		field11020 = 0;
		lastOnChatTransmitRedrawCycle = 0;
		lastOnFriendTransmitRedrawCycle = 0;
		lastOnClanTransmitRedrawCycle = 0;
		lastOnClanSettingsTransmitRedrawCycle = 0;
		lastOnClanChannelTransmitRedrawCycle = 0;
		lastOnStockTransmitRedrawCycle = 0;
		lastOnMiscTransmitRedrawCycle = 0;
		lastOnPlayerGroupTransmitRedrawCycle = 0;
		lastOnPlayerGroupVarpTransmitRedrawCycle = 0;
	}

	public final void init() {
		if (!this.checkhost()) {
			return;
		}
		String var1 = "";
		JavConfigParameter[] javConfigParameters = JavConfigParameter.values();
		for (int index = 0; index < javConfigParameters.length; index++) {
			JavConfigParameter parameter = javConfigParameters[index];
			String value = GameShell.field11885.getParameter(parameter.key);
			if (value != null) {
				switch(Integer.parseInt(parameter.key)) {
					case 1:
						field579 = value;
						break;
					case 2:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
							showAdvertisement = true;
						} else {
							showAdvertisement = false;
						}
						break;
					case 3:
						field10778 = Integer.parseInt(value);
						break;
					case 4:
						field8327 = value;
						break;
					case 5:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
						}
						break;
					case 6:
						gamepack = value;
						break;
					case 7:
					default:
						JagException.report("", new RuntimeException());
						break;
					case 8:
						if (WorldSwitcher.world == null) {
							WorldSwitcher.world = new ServerAddress();
						}
						WorldSwitcher.world.port = Integer.parseInt(value);
						break;
					case 9:
						userFlow2 = Integer.parseInt(value);
					case 10:
					case 13:
					case 18:
					case 22:
					case 37:
					case 38:
					case 48:
						break;
					case 11:
						field10788 = Integer.parseInt(value);
						break;
					case 12:
						if (WorldSwitcher.content == null) {
							WorldSwitcher.content = new ServerAddress();
						}
						WorldSwitcher.content.port = Integer.parseInt(value);
						break;
					case 14:
						if (WorldSwitcher.httpContent == null) {
							WorldSwitcher.httpContent = new ServerAddress();
						}
						WorldSwitcher.httpContent.host = value;
						break;
					case 15:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
							field10784 = true;
						} else {
							field10784 = false;
						}
						break;
					case 16:
						owner = value;
						break;
					case 17:
						clientType = Integer.parseInt(value);
						break;
					case 19:
						if (WorldSwitcher.world == null) {
							WorldSwitcher.world = new ServerAddress();
						}
						WorldSwitcher.world.port2 = Integer.parseInt(value);
						break;
					case 20:
						currentPlayerCountry = Integer.parseInt(value);
						break;
					case 21:
						createEmail = value;
						break;
					case 23:
						if (WorldSwitcher.content == null) {
							WorldSwitcher.content = new ServerAddress();
						}
						WorldSwitcher.content.host = value;
						break;
					case 24:
						playerIsAffiliate = Integer.parseInt(value);
						break;
					case 25:
						userFlow1 = Integer.parseInt(value);
						break;
					case 26:
						language = Language.getLanguage(Integer.parseInt(value));
						break;
					case 27:
						modewhere = (ModeWhere) SerializableEnums.decode(ModeWhere.values(), Integer.parseInt(value));
						if (modewhere == ModeWhere.LOCAL) {
							modewhere = ModeWhere.WTWIP;
						} else if (!modewhere.hasMode(ModeWhereProperty.OFFICE) && modewhere != ModeWhere.LIVE) {
							modewhere = ModeWhere.LIVE;
						}
						break;
					case 28:
						pngHost = value;
						break;
					case 29:
						if (WorldSwitcher.currentLobby == null) {
							WorldSwitcher.currentLobby = new ServerAddress();
						}
						WorldSwitcher.currentLobby.port = Integer.parseInt(value);
						break;
					case 30:
						if (WorldSwitcher.content == null) {
							WorldSwitcher.content = new ServerAddress();
						}
						WorldSwitcher.content.port2 = Integer.parseInt(value);
						break;
					case 31:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
							javascriptEnabled = true;
						} else {
							javascriptEnabled = false;
						}
						break;
					case 32:
						if (WorldSwitcher.content == null) {
							WorldSwitcher.content = new ServerAddress();
						}
						WorldSwitcher.content.node = Integer.parseInt(value);
						break;
					case 33:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
							runInFrame = true;
						} else {
							runInFrame = false;
						}
						break;
					case 34:
						field10773 = Integer.parseInt(value);
						if (field10773 < 0 || field10773 >= loadingBarFillColour.length) {
							field10773 = 0;
						}
						break;
					case 35:
						siteSettings = value;
						break;
					case 36:
						modewhat = ModeWhat.method8146(Integer.parseInt(value));
						if (modewhat != ModeWhat.WIP && modewhat != ModeWhat.RC && modewhat != ModeWhat.BUILDLIVE && modewhat != ModeWhat.LIVE) {
							modewhat = ModeWhat.LIVE;
						}
						break;
					case 39:
						field10777 = Integer.parseInt(value);
						break;
					case 40:
						loadingBarConfig = value;
						break;
					case 41:
						if (WorldSwitcher.currentLobby == null) {
							WorldSwitcher.currentLobby = new ServerAddress();
						}
						WorldSwitcher.currentLobby.port2 = Integer.parseInt(value);
						break;
					case 42:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
							haveChrome = true;
						} else {
							haveChrome = false;
						}
						break;
					case 43:
						if (WorldSwitcher.currentLobby == null) {
							WorldSwitcher.currentLobby = new ServerAddress();
						}
						WorldSwitcher.currentLobby.host = value;
						break;
					case 44:
						if (WorldSwitcher.httpContent == null) {
							WorldSwitcher.httpContent = new ServerAddress();
						}
						WorldSwitcher.httpContent.port = Integer.parseInt(value);
						break;
					case 45:
						if (WorldSwitcher.httpContent == null) {
							WorldSwitcher.httpContent = new ServerAddress();
						}
						WorldSwitcher.httpContent.node = Integer.parseInt(value);
						break;
					case 46:
						modegame = ModeGame.of(Integer.parseInt(value));
						if (modegame == ModeGame.RUNESCAPE) {
							namespace = Namespace.RUNESCAPE;
						} else {
							namespace = Namespace.LEGACY;
						}
						break;
					case 47:
						var1 = value;
						break;
					case 49:
						if (value.equals(TextUtil.TRUE)) {
							isUnder13 = true;
						} else {
							isUnder13 = false;
						}
						break;
					case 50:
						if (WorldSwitcher.world == null) {
							WorldSwitcher.world = new ServerAddress();
						}
						WorldSwitcher.world.node = Integer.parseInt(value);
						break;
					case 51:
						createAdditionalInfo = value;
						if (createAdditionalInfo.length() > 100) {
							createAdditionalInfo = null;
						}
						break;
					case 52:
						if (value.equalsIgnoreCase(TextUtil.TRUE)) {
							playerIsMembers = true;
						}
						break;
					case 53:
						if (WorldSwitcher.httpContent == null) {
							WorldSwitcher.httpContent = new ServerAddress();
						}
						WorldSwitcher.httpContent.port2 = Integer.parseInt(value);
						break;
					case 54:
						if (WorldSwitcher.currentLobby == null) {
							WorldSwitcher.currentLobby = new ServerAddress();
						}
						WorldSwitcher.currentLobby.node = Integer.parseInt(value);
						break;
					case 55:
						if (value.equals(TextUtil.TRUE)) {
							fromBilling = true;
						} else {
							fromBilling = false;
						}
				}
			}
		}
		if (siteSettings == null) {
			siteSettings = "";
		}
		GameShell3$FrameParameters var6 = new GameShell3$FrameParameters(frameWidth, frameHeight, frameXMargin, frameYMargin, modegame.title);
		field8301 = this;
		String var7 = modewhat.field8478;
		int var8 = modewhat.field8477 + 32;
		if (!var1.equals("")) {
			var7 = var7 + "_" + var1;
			var8 = 0;
		}
		this.startApplet(var6, modegame.titleURL, var7, var8, Js5Archive.getRequiredArrayLength(), 910, 1, runInFrame);
	}

	@ObfuscatedName("client.al(I)V")
	public final void maininit() {
		Frame var1 = new Frame(" ");
		var1.pack();
		var1.dispose();
		field1734 = new Component();
		method6793();
		ByteArrayPool.method4398(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 });
		Vector3.init(100);
		Quaternion.init(10);
		Matrix4x4.init(20);
		Mouse.method7232(100);
		NativeMouseEvent.method18259(100);
		if (modewhere != ModeWhere.LIVE) {
			field9166 = new byte[50][];
		}
		preferences = Preferences.method6822();
		if (preferences.unknown7.getValue() == 1) {
			Scene.field6937 = false;
		}
		switch(preferences.safeMode.getValue()) {
			case 3:
				Preferences.field788 = true;
				preferences.setPreference(preferences.safeMode, 0);
				GraphicsPacketQueue.method6971(ToolkitType.field8885);
				break;
			case 4:
				Preferences.field786 = true;
				preferences.setPreference(preferences.safeMode, 0);
				GraphicsPacketQueue.method6971(ToolkitType.field8872);
		}
		if (WorldSwitcher.world.host == null) {
			WorldSwitcher.world.host = GameShell.field11885.getCodeBase().getHost();
		}
		WorldSwitcher.currentWorld = WorldSwitcher.world;
		js5DiskCache = new Js5DiskCache();
		js5TcpClient = new ClientJs5TcpClient();
		js5HttpClient = new Js5HttpClient(WorldSwitcher.httpContent.host, WorldSwitcher.httpContent.port, modegame.game);
		if (modegame == ModeGame.RUNESCAPE) {
			field10809 = false;
		}
		LocType.clientpalette = NPCType.clientpalette = ObjType.clientpalette = new short[256];
		try {
			clipboard = GameShell.getTopContainer().getToolkit().getSystemClipboard();
		} catch (Exception var5) {
		}
		keyboard = Keyboard.create(GameShell.canvas);
		mouse = Mouse.create(GameShell.canvas, true);
		if (cacheDat != null) {
			diskStore = new DiskStore(255, cacheDat, masterIndex, 2000000);
		}
		cam2 = new BasicCamera(cameraProvider);
		try {
			cam2.setControlMode(CameraControlMode.CLIENT);
			cam2.setPositionMode(PositionMode.POINT, false);
			cam2.setLookatMode(LookatMode.POINT, false);
			cam2.setPositionMode(PositionMode.POINT, false);
			cam2.setPositionMaxSpeed(Vector3.create(99999.0F, 99999.0F, 99999.0F));
			cam2.setPositionAcceleration(Vector3.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			cam2.setLookatMaxSpeed(Vector3.create(99999.0F, 99999.0F, 99999.0F));
			cam2.setLookatAcceleration(Vector3.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (CameraException var4) {
		}
		Browser.method9163(GameShell.field11885, GameShell.osName);
		if (modewhere != ModeWhere.LIVE && modewhere != ModeWhere.field8276) {
			field10794 = true;
		}
		field6598 = LocalisedText.LOADING.forLang(language);
		asyncRebuild = new AsyncRebuild();
		(new Thread(asyncRebuild)).start();
		field7957 = new HttpClient();
		emojiList = new EmojiList();
	}

	@ObfuscatedName("client.ac(I)V")
	public final void mainloop() {
		if (state == 2) {
			return;
		}
		if ((state == 1 || isStateTitle(state) || isStateLobby(state)) && audioApi != null) {
            audioApi.playSong(audioApi.getTitleScreenSong(), preferences.unknownVolume2.getValue());
		}
		if (field10856) {
			Object var1 = field10858;
			synchronized (field10858) {
				field10858.notify();
			}
			Object var3 = field10920;
			synchronized (field10920) {
				try {
					field10920.wait();
				} catch (InterruptedException var23) {
				}
			}
			field10856 = false;
		}
		loopCycle++;
		if (loopCycle % 1000 == 1) {
			GregorianCalendar var6 = new GregorianCalendar();
			field1681 = var6.get(Calendar.HOUR_OF_DAY) * 600 + var6.get(Calendar.MINUTE) * 10 + var6.get(Calendar.SECOND) / 6;
			field10890.setSeed((long) field1681);
		}
		long var7 = MonotonicTime.get();
		gameConnection.refreshNetStats();
		lobbyConnection.refreshNetStats();
		this.processJs5TcpClient();
		if (js5Client != null) {
			js5Client.update();
		}
		if (audioApi != null) {
			audioApi.update();
		}
		keyboard.method9069();
		mouse.method9087();
		TwitchHardwarePlatform.update(toolkit, var7);
		this.method16971();
		if (toolkit != null) {
			toolkit.cycle((int) var7);
		}
		allKeyboardEventCount = 0;
		keyboardEventCount = 0;
		for (KeyboardEvent var9 = keyboard.method9075(); var9 != null; var9 = keyboard.method9075()) {
			int var10 = var9.method9145();
			if (var10 == 2 || var10 == 3) {
				if (allKeyboardEventCount < 131) {
					allKeyboardEvents[allKeyboardEventCount] = var9;
					allKeyboardEventCount++;
				}
			} else if (var10 == 0) {
				if (DeveloperConsole.method1584() && var9.method9141() == 28) {
					if (staffModLevel >= 2 && keyboard.keyheld(82)) {
						if (CameraManager.method2978()) {
							CameraManager.method3913();
						} else {
							CameraManager.method542(localPlayerEntity.getTrackableCoord());
						}
					} else if (DeveloperConsole.isopen() && (preferences.consoleKeyPress.getValue() == 0 || keyboard.keyheld(86))) {
						DeveloperConsole.close();
					} else if (preferences.consoleKeyPress.getValue() == 0 || keyboard.keyheld(86)) {
						DeveloperConsole.method638();
					} else {
						ChatHistory.method4943(LocalisedText.DEVELOPER_CONSOLE_SHORTCUT_INFO.forLang(language));
					}
				}
				if (keyboardEventCount < 75) {
					keyboardEvents[keyboardEventCount] = var9;
					keyboardEventCount++;
				}
			}
		}
		field10817 = 0;
		for (MouseEvent var11 = mouse.pollEvent(); var11 != null; var11 = mouse.pollEvent()) {
			int var12 = var11.getButtonAction();
			if (var12 == -1) {
				ClientWatch.method670(var11);
			} else if (var12 == 6) {
				field10817 += var11.getCount();
				var11.release();
			} else if (MouseEvent.method15143(var12)) {
				mouseEvents.addTail(var11);
				if (mouseEvents._size() > 10) {
					MouseEvent var13 = (MouseEvent) mouseEvents.removeHead();
					if (var13 != null) {
						var13.release();
					}
				}
			}
		}
		if (DeveloperConsole.isopen()) {
			DeveloperConsole.update();
		}
		if (isStateLoading(state)) {
			Loading.update();
			GameShell.method135();
		} else if (isStateRebuild(state)) {
			world.rebuildScene();
		}
		if (isStateTitle(state) && !isStateRebuild(state)) {
			this.updateTitleScreen();
			AccountCreationManager.update();
			LoginManager.update();
		} else if (isStateLobby(state) && !isStateRebuild(state)) {
			this.updateTitleScreen();
			LoginManager.update();
		} else if (state == 9) {
			LoginManager.update();
		} else if (isStateGame(state) && !isStateRebuild(state)) {
			updateGame();
		} else if (state == 14 || state == 19) {
			LoginManager.update();
			if (LoginManager.enterGameReply != -3 && LoginManager.enterGameReply != 2 && LoginManager.enterGameReply != 15) {
				if (state == 19) {
					LoginManager.lastTransferDisallowResult = LoginManager.disallowResult;
					LoginManager.lastTransferDisallowTrigger = LoginManager.disallowTrigger;
					LoginManager.lastTransferReply = LoginManager.enterGameReply;
					if (WorldSwitcher.transferCancellable) {
						WorldSwitcher.setWorld(WorldSwitcher.field8753.node, WorldSwitcher.field8753.host, WorldSwitcher.field8753.port, WorldSwitcher.field8753.port2);
						gameConnection.closeForcefully();
						setState(14);
					} else {
						logout(LoginManager.field485);
					}
				} else {
					logout(false);
				}
			}
		}
		ObjIconFactory.update(toolkit);
		mouseEvents.removeHead();

        if (toolkit != null) {
            Iterator var14 = field11093.entrySet().iterator();
            while (var14.hasNext()) {
                Entry var15 = (Entry) var14.next();
                HttpRequest var16 = (HttpRequest) var15.getValue();
                if (var16.isComplete()) {
                    byte[] var17 = var16.getData();
                    if (var17 != null) {
                        try {
                            BufferedImage var18 = ImageIO.read(new ByteArrayInputStream(var17));
                            int[] var19 = BasicTextureListInner.method14804(var18);
                            Sprite var20 = toolkit.createSprite(var19, 0, var18.getWidth(), var18.getWidth(), var18.getHeight());
                            field11013.put(var20, (long) (Integer) var15.getKey());
                        } catch (IOException var22) {
                            JagException.report(field8301.method8038(), var22);
                        }
                    }
                    var14.remove();
                }
            }
        }
    }

	@ObfuscatedName("client.ai(I)V")
	public final void mainredraw() {
		if (state == 2) {
			return;
		}
		long var1 = GameShell.method8660() / 1000000L - field10795;
		field10795 = GameShell.method8660() / 1000000L;
		if (method16436(state)) {
			if (windowModeChangeTime != 0L && MonotonicTime.get() > windowModeChangeTime) {
				setWindowMode(getWindowMode(), -1, -1, false);
			} else if (!toolkit.method2123() && canvasReplaceRecommended) {
				method15024();
			}
		}
		if (GameShell.fsframe == null) {
			method3033();
		}
		if (Fullscreen.allowed && GameShell.fsframe != null && !GameShell.focus && method16436(state)) {
			setWindowMode(preferences.windowMode.getValue(), -1, -1, false);
		}
		boolean var3 = false;
		if (fullredraw) {
			fullredraw = false;
			var3 = true;
		}
		if (var3) {
			method8024();
		}
		if (toolkit != null && toolkit.method2123() || getWindowMode() != 1) {
			method9734();
		}
		if (isStateLoading(state)) {
			Loading.draw(var3);
		} else if (isStateLoginLobby(state)) {
			drawTitleOrLobby();
		} else if (isStateLoginGame(state)) {
			drawTitleOrLobby();
		} else if (isStateRebuild(state)) {
			if (world.getRebuildStage() == RebuildStage.LOAD_MAPS) {
				int var4 = world.method7725() / 2;
				MessageBox.draw(LocalisedText.LOADING.forLang(language) + TextUtil.BR + "(" + var4 + "%)", true, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);
			} else if (world.getRebuildStage() == RebuildStage.LOAD_LOCS) {
				int var5 = world.method7726() / 2 + 50;
				MessageBox.draw(LocalisedText.LOADING.forLang(language) + TextUtil.BR + "(" + var5 + "%)", true, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);
			} else {
				MessageBox.draw(LocalisedText.LOADING.forLang(language), true, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);
			}
		} else if (state == 18) {
			drawGame(var1);
		} else if (state == 14) {
			MessageBox.draw(LocalisedText.CONLOST.forLang(language) + TextUtil.BR + LocalisedText.ATTEMPT_TO_REESTABLISH.forLang(language), false, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);
		} else if (state == 19) {
			MessageBox.draw(LocalisedText.PLEASEWAIT.forLang(language), false, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);
		}
		if (componentDrawMode == 3) {
			for (int var6 = 0; var6 < topLevelComponentCount; var6++) {
				Rectangle var7 = field11040[var6];
				if (topLevelComponentRedrawRequested[var6]) {
					toolkit.drawRectangle(var7.x, var7.y, var7.width, var7.height, -65281);
				} else {
					toolkit.drawRectangle(var7.x, var7.y, var7.width, var7.height, -16711936);
				}
			}
		}
		if (DeveloperConsole.isopen()) {
			DeveloperConsole.draw(toolkit);
		}
		if (!isStateLoading(state) && !isStateRebuild(state) && openedTopInterface != -1) {
			try {
				toolkit.flush();
				TwitchHardwarePlatform.method593(toolkit, MonotonicTime.get(), GameShell.canvasWid, GameShell.canvasHei);
				toolkit.method2115();
			} catch (RendererException var10) {
				JagException.report(var10.getMessage() + " " + this.method8038(), var10);
				switch(preferences.displayMode.getValue()) {
					case 3:
						GraphicsPacketQueue.sendDirectXFailure(var10.getErrorCode());
						setToolkit(1, false);
						break;
					default:
						setToolkit(0, false);
						break;
				}
			}
		}
		int var9 = preferences.cpuUsage.getValue();
		if (var9 == 0) {
			PreciseSleep.sleep(15L);
		} else if (var9 == 1) {
			PreciseSleep.sleep(10L);
		} else if (var9 == 2) {
			PreciseSleep.sleep(5L);
		} else if (var9 == 3) {
			PreciseSleep.sleep(2L);
		}
		if (field10807) {
			cleanCaches();
		}
		if (preferences.safeMode.getValue() == 1 && state == 4 && openedTopInterface != -1) {
			preferences.setPreference(preferences.safeMode, 0);
			Preferences.save();
		}
	}

	@ObfuscatedName("uy.ey(I)V")
	public static final void method9175() {
		String var0 = field8327 == null ? method7363() : field8327;
		Browser.openUrl(var0, false, field10784);
	}

	@ObfuscatedName("dl.eu(II)Z")
	public static boolean isStateLoading(int arg0) {
		return arg0 == 5 || arg0 == 11 || arg0 == 1;
	}

	@ObfuscatedName("client.aw(B)V")
	public final void mainquit() {
		if (clientVarDomain != null && clientVarDomain.field10252) {
			method14147();
		}
		Loading.stopRendererThread();
		TwitchHardwarePlatform.method9128();
		if (toolkit != null) {
			toolkit.dispose();
		}
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Fullscreen.method4277(GameShell.fsimp14, GameShell.fsframe);
			GameShell.fsframe = null;
		}
		gameConnection.closeGracefully();
		gameConnection.pingProvider.stop();
		lobbyConnection.closeGracefully();
		lobbyConnection.pingProvider.stop();
		if (audioApi != null) {
			audioApi.stop();
		}
		js5TcpClient.closeGracefully();
		js5HttpClient.shutdownExecutor();
		js5DiskCache.quit();
		if (inetAddressLookupRequest != null) {
			inetAddressLookupRequest.method10572();
			inetAddressLookupRequest = null;
		}
		try {
			Ping.quit();
		} catch (Throwable var4) {
		}
		ClientWatch.method19265();
		try {
			DeveloperConsole.method8023();
		} catch (Exception var3) {
		}
		if (field7957 != null) {
			field7957.method559();
		}
		if (windowClosing && modewhere != ModeWhere.LOCAL) {
			method9175();
		}
	}

	@ObfuscatedName("client.j(B)Ljava/lang/String;")
	public String method8038() {
		String var1 = " ";
		try {
			CoordGrid var2 = world.getBase();
			var1 = var1 + var2.x + TextUtil.COMMA + var2.z + TextUtil.COMMA + world.getSizeX() + TextUtil.COMMA + world.getSizeZ() + " ";
			if (localPlayerEntity == null) {
				var1 = var1 + currentPlayerLevel + TextUtil.COMMA + currentPlayerLevel + TextUtil.COMMA + currentPlayerLevel + TextUtil.COMMA + " ";
			} else {
				var1 = var1 + currentPlayerLevel + TextUtil.COMMA + (var2.x + localPlayerEntity.routeWaypointX[0]) + TextUtil.COMMA + (var2.z + localPlayerEntity.routeWaypointZ[0]) + " ";
			}
			var1 = var1 + preferences.displayMode.getValue() + " " + preferences.antiAliasing.getValue() + " " + getWindowMode() + " " + GameShell.canvasWid + TextUtil.COMMA + GameShell.canvasHei + " ";
			var1 = var1 + preferences.lightingDetail.getValue() + " ";
			var1 = var1 + preferences.sceneryShadows.getValue() + " ";
			var1 = var1 + preferences.waterDetail.getValue() + " ";
			var1 = var1 + preferences.textures.getValue() + " ";
			var1 = var1 + preferences.bloom.getValue() + " ";
			var1 = var1 + "0 ";
			var1 = var1 + maxmemory + " ";
			var1 = var1 + state + " ";
			if (hardwarePlatform == null) {
				var1 = var1 + -1;
			} else {
				var1 = var1 + hardwarePlatform.cpuInfoRam;
			}
			var1 = var1 + " ";
			if (gamepack == null) {
				var1 = var1 + TextUtil.COMMA;
			} else {
				var1 = var1 + gamepack;
			}
		} catch (Throwable var4) {
		}
		return var1;
	}

	@ObfuscatedName("aga.ed(IB)Z")
	public static boolean method16436(int arg0) {
		return arg0 == 4 || arg0 == 13 || arg0 == 15 || arg0 == 18;
	}

	@ObfuscatedName("aau.ee(IB)Z")
	public static boolean method14437(int arg0) {
		return arg0 == 15 || arg0 == 16;
	}

	@ObfuscatedName("vb.es(IB)Z")
	public static boolean isStateRebuild(int arg0) {
		return arg0 == 10 || arg0 == 6 || arg0 == 3 || arg0 == 16 || arg0 == 8;
	}

	@ObfuscatedName("a.ei(II)Z")
	public static boolean isStateTitle(int arg0) {
		return arg0 == 4 || arg0 == 10 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@ObfuscatedName("gy.el(II)Z")
	public static boolean isStateLoginLobby(int arg0) {
		return arg0 == 4 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@ObfuscatedName("ace.ej(II)Z")
	public static boolean isStateLobby(int arg0) {
		return arg0 == 13 || arg0 == 6 || arg0 == 15 || arg0 == 16;
	}

	@ObfuscatedName("yd.ep(II)Z")
	public static boolean isStateLoginGame(int arg0) {
		return arg0 == 13 || arg0 == 15;
	}

	@ObfuscatedName("eu.ev(II)Z")
	public static boolean isStateGame(int arg0) {
		return arg0 == 18 || arg0 == 3 || arg0 == 9;
	}

	@ObfuscatedName("pg.ec(II)V")
	public static void setState(int state) {
		if (Client.state == state) {
			return;
		}
		field10915 = 0;
		if (Client.state == 18 && state != 3) {
			TwitchHardwarePlatform.logout();
		}
		if (state == 14 || state == 19) {
			LoginManager.requestGameLogin();
		}
		if (state != 14 && field11764 != null) {
			field11764.closeGracefully();
			field11764 = null;
		}
		if (state == 4) {
			method7227(Client.state == 0 || Client.state == 12 || openedTopInterface != graphicsDefaults.login_interface);
			ChatHistory.clear();
		}
		if (state == 13) {
			boolean var1;
			if (graphicsDefaults.lobby_interface == -1) {
				var1 = Client.state == 17 || Client.state == 9;
			} else {
				var1 = openedTopInterface != graphicsDefaults.lobby_interface;
			}
			method9287(var1);
		}
		if (state == 17 || state == 9) {
			if (!LoginManager.requestLobbyLogin()) {
				return;
			}
		} else if (state == 7 || state == 15 && Client.state != 16) {
			if (!LoginManager.requestGameLogin()) {
				return;
			}
		} else if (state == 12) {
			AccountCreationManager.method18476();
		}
		if (isStateRebuild(state)) {
			world.completeRebuild();
			world.field5060 = -1L;
		}
		if (state == 3 || state == 4) {
			method3095();
		}
		boolean var2 = state == 1 || isStateTitle(state) || isStateLobby(state);
		boolean var3 = Client.state == 1 || isStateTitle(Client.state) || isStateLobby(Client.state);
		if (var2 != var3) {
			js5TcpClient.sendLoginStatus(!var2);
		}
		if (isStateRebuild(state) || state == 14 || state == 19) {
			toolkit.method2150();
		}
		Client.state = state;
	}

	@ObfuscatedName("client.ek(B)V")
	public void processJs5TcpClient() {
		boolean processed = js5TcpClient.process();
		if (!processed) {
			this.js5Error();
		}
	}

	@ObfuscatedName("client.em(B)V")
	public void js5Error() {
		if (js5TcpClient.errorCount > field10829) {
			WorldSwitcher.content.configureSocketType();
			field10821 = js5TcpClient.errorCount * 250 - 250;
			if (field10821 > 3000) {
				field10821 = 3000;
			}
			if (js5TcpClient.errorCount >= 2 && js5TcpClient.js5State == 6) {
				this.error("js5connect_outofdate");
				state = 2;
				return;
			}
			if (js5TcpClient.errorCount >= 1 && js5TcpClient.js5State == 48) {
				this.error("sessionexpired");
				state = 2;
				return;
			}
			if (js5TcpClient.errorCount >= 4 && js5TcpClient.js5State == -1) {
				this.error("js5crc", "a=" + js5TcpClient.archive + "&g=" + js5TcpClient.group);
				state = 2;
				return;
			}
			if (js5TcpClient.errorCount >= 4 && isStateLoading(state)) {
				if (js5TcpClient.js5State == 7 || js5TcpClient.js5State == 9) {
					this.error("js5connect_full");
				} else if (js5TcpClient.js5State <= 0) {
					this.error("js5io");
				} else if (field11068 == null) {
					this.error("js5connect");
				} else {
					this.error("js5proxy_" + field11068.trim());
				}
				state = 2;
				return;
			}
		}
		field10829 = js5TcpClient.errorCount;
		if (field10821 > 0) {
			field10821--;
			return;
		}
		try {
			if (js5ConnectState == 0) {
				js5Socket = WorldSwitcher.content.getSocket();
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				js5Stream = Stream.createStream(js5Socket, 131072);
				int length = gamepack.length() + 10;
				Packet buf = new Packet(length + 2);
				buf.p1(LoginProt.INIT_JS5REMOTE_CONNECTION.id);
				buf.p1(length);
				buf.p4(910);
				buf.p4(1);
				buf.pjstr(gamepack);
				buf.p1(language.serialID);
				js5Stream.write(buf.data, 0, length + 2);
				js5ConnectState++;
				field10353 = MonotonicTime.get();
			}
			if (js5ConnectState == 2) {
				if (js5Stream.hasAvailable(1)) {
					byte[] bytes = new byte[1];
					int reply = js5Stream.read(bytes, 0, 1);
					if (bytes[0] != 0) {
						this.setJs5ErrorState(reply);
						return;
					}
					js5ConnectState++;
				} else if (MonotonicTime.get() - field10353 > 30000L) {
					this.setJs5ErrorState(1001);
					return;
				}
			}
			if (js5ConnectState == 3) {
				LoadableResource[] resources = LoadableResource.values();
				int length = resources.length * 4;
				if (js5Stream.hasAvailable(length)) {
					Packet buf = new Packet(length);
					js5Stream.read(buf.data, 0, buf.data.length);
					for (int index = 0; index < resources.length; index++) {
						resources[index].setLength(buf.g4s());
					}
					boolean isLoggedIn = isStateLoading(state) || isStateTitle(state) || isStateLobby(state);
					js5TcpClient.createNewJs5Stream(js5Stream, !isLoggedIn);
					js5Socket = null;
					js5Stream = null;
					js5ConnectState = 0;
				}
			}
		} catch (IOException var11) {
			this.setJs5ErrorState(1002);
		}
	}

	@ObfuscatedName("client.eh(II)V")
	public void setJs5ErrorState(int state) {
		js5Socket = null;
		js5Stream = null;
		js5ConnectState = 0;
		js5TcpClient.errorCount++;
		js5TcpClient.js5State = state;
	}

	@ObfuscatedName("qe.eq(ZI)V")
	public static void method7227(boolean arg0) {
		if (arg0) {
			if (openedTopInterface != -1) {
				Component.method7602(openedTopInterface);
			}
			for (SubInterface var1 = (SubInterface) openedSubInterfaces.head(); var1 != null; var1 = (SubInterface) openedSubInterfaces.next()) {
				if (!var1.isLinked()) {
					var1 = (SubInterface) openedSubInterfaces.head();
					if (var1 == null) {
						break;
					}
				}
				ifCloseSub(var1, true, false);
			}
			openedTopInterface = -1;
			openedSubInterfaces = new HashTable(8);
			Component.method5075();
			openedTopInterface = graphicsDefaults.login_interface;
			if (openedTopInterface != -1) {
				computeTopLevelInterfaceLayout(false);
				method9734();
				ScriptRunner.executeOnLoad(openedTopInterface, null);
			}
		}
		LoginManager.resetCredentials();
		cam2.method4680(true);
		LoginManager.field485 = false;
		MiniMenu.method8326();
		defaultCursor = -1;
		method10615(field11038);
		localPlayerEntity = new PlayerEntity(null);
		playerSnapshots.clear();
		localPlayerEntity.setPosition((float) (world.getSizeX() * 512 / 2), 0.0F, (float) (world.getSizeZ() * 512 / 2));
		localPlayerEntity.routeWaypointX[0] = world.getSizeX() / 2;
		localPlayerEntity.routeWaypointZ[0] = world.getSizeZ() / 2;
		cameraZ = 0;
		cameraX = 0;
		if (Client.cameraState == 5) {
			cameraX = cameraMoveX << 9;
			cameraZ = cameraMoveZ << 9;
		} else {
			applyCameraMoveAlong();
		}
		world.getEnvironmentManager().resetFade();
	}

	@ObfuscatedName("vl.eg(ZI)V")
	public static void method9287(boolean arg0) {
		if (arg0) {
			if (openedTopInterface != -1) {
				Component.method7602(openedTopInterface);
			}
			for (SubInterface var1 = (SubInterface) openedSubInterfaces.head(); var1 != null; var1 = (SubInterface) openedSubInterfaces.next()) {
				if (!var1.isLinked()) {
					var1 = (SubInterface) openedSubInterfaces.head();
					if (var1 == null) {
						break;
					}
				}
				ifCloseSub(var1, true, false);
			}
			openedTopInterface = -1;
			openedSubInterfaces = new HashTable(8);
			Component.method5075();
			openedTopInterface = graphicsDefaults.lobby_interface;
			if (openedTopInterface != -1) {
				computeTopLevelInterfaceLayout(false);
				method9734();
				ScriptRunner.executeOnLoad(openedTopInterface, null);
			}
		}
		LoginManager.field485 = true;
	}

	@ObfuscatedName("ko.ez(Labd;ZIZZI)Lpy;")
	public static Js5 createJs5(Js5Archive archive, boolean arg1, int arg2, boolean arg3, boolean arg4) {
		if (js5Providers == null) {
			js5Providers = new Js5NetResourceProvider[Js5Archive.getRequiredArrayLength()];
			js5Archives = new java.util.HashMap();
		}
		DiskStore diskStore = null;
		int archiveId = archive.getArchiveId();
		if (cacheDat != null && !field7880) {
			diskStore = new DiskStore(archiveId, cacheDat, GameShell.cacheIndex[archiveId], archiveId == Js5Archive.DLLS.getArchiveId() ? 8000000 : 2500000);
		}
		js5Providers[archiveId] = js5Client.method6835(archiveId, diskStore, Client.diskStore, archive.method14918());
		if (arg4) {
			js5Providers[archiveId].method16829();
		}
		Js5 js5 = new Js5(js5Providers[archiveId], arg1, arg2);
		js5Archives.put(archive, js5);
		return js5;
	}

	@ObfuscatedName("i.ef(I)Lax;")
	public static ServerConnection getCurrentConnection() {
		return isStateLobby(state) || state == 0 ? lobbyConnection : gameConnection;
	}

	@ObfuscatedName("s.et(IZI)V")
	public static void setToolkit(int arg0, boolean arg1) {
		changeToolkit(arg0, LocalisedText.LOADING.forLang(language), arg1);
	}

	@ObfuscatedName("zg.ea(ILjava/lang/String;ZB)V")
	public static void changeToolkit(int arg0, String arg1, boolean arg2) {
		Loading.stopRendererThread();
		deleteToolkit();
		method15235();
		createToolkit(arg0, arg1, arg2);
		fontProvider.clearFonts();
		fontProvider.loadFonts(fontFactory);
		fontProvider.cacheReset();
		DefaultSprites.loadFonts(toolkit);
		DefaultSprites.loadSprites(toolkit, spritesJs5);
		MiniMenu.setFormattingDefault();
		method9734();
		resetModelCaches();
		if (state == 4) {
			setState(10);
		} else if (state == 13) {
			setState(6);
		} else if (state == 15) {
			setState(16);
		} else if (state == 18) {
			setState(3);
		} else if (state == 11 || state == 1) {
			Loading.method18929();
		} else if (state == 0) {
			setState(8);
		} else if (state == 3) {
			PositionedSound.method13908(false);
		}
	}

	@ObfuscatedName("gm.ew(ILjava/lang/String;ZI)V")
	public static void createToolkit(int arg0, String arg1, boolean arg2) {
		if (arg0 == 0) {
			toolkit = Toolkit.create(0, GameShell.canvas, materialList, textureList, basicBillboardTypeList, basicParticleEmitterTypeList, basicParticleEffectorTypeList, shadersJs5, preferences.antiAliasing2.getValue() * 2);
			if (arg1 != null) {
				toolkit.method2475(1, 0);
				FontMetrics var3 = FontMetrics.createFontMetrics(fontmetricsJs5, DefaultSprites.p12_full, 0, fontProvider);
				Font var4 = toolkit.createFont(var3, SpriteDataProvider.method1609(spritesJs5, DefaultSprites.p12_full, 0), true);
				method8024();
				MessageBox.draw(arg1, true, toolkit, var4, var3);
			}
		} else {
			label245: {
				Toolkit var5 = null;
				if (arg1 != null) {
					var5 = Toolkit.create(0, GameShell.canvas, materialList, textureList, basicBillboardTypeList, basicParticleEmitterTypeList, basicParticleEffectorTypeList, shadersJs5, 0);
					var5.method2475(1, 0);
					FontMetrics var6 = FontMetrics.createFontMetrics(fontmetricsJs5, DefaultSprites.p12_full, 0);
					Font var7 = var5.createFont(var6, SpriteDataProvider.method1609(spritesJs5, DefaultSprites.p12_full, 0), true);
					method8024();
					MessageBox.draw(arg1, true, var5, var7, var6);
					try {
						var5.dispose();
						var5 = null;
					} catch (Throwable var30) {
					}
				}
				try {
					try {
						deleteToolkit();
						System.gc();
						toolkit = Toolkit.create(arg0, GameShell.canvas, materialList, textureList, basicBillboardTypeList, basicParticleEmitterTypeList, basicParticleEffectorTypeList, shadersJs5, preferences.antiAliasing2.getValue() * 2);
						fontProvider = new FontProvider(toolkit, spritesJs5, fontmetricsJs5, DefaultSprites.fonts());
						if (toolkit.method2194()) {
							boolean var9 = true;
							try {
								var9 = hardwarePlatform.cpuInfoRam > 256;
							} catch (Throwable var29) {
							}
							Heap var11;
							if (var9) {
								var11 = toolkit.createHeap(146800640);
							} else {
								var11 = toolkit.createHeap(104857600);
							}
							toolkit.setBufferHeap(var11);
						}
						break label245;
					} catch (Throwable var31) {
						switch(arg0) {
							case 1:
								GraphicsPacketQueue.method6971(ToolkitType.field8883);
								break;
							case 3:
								GraphicsPacketQueue.method6971(ToolkitType.field8876);
								break;
						}
						if (var31 instanceof GlException) {
							preferences.antiAliasing.setValue(0);
							preferences.antiAliasing2.setValue(0);
						}
						int var14 = preferences.displayMode.getValue();
						preferences.setPreference(preferences.displayMode, 0);
						if (var5 != null) {
							try {
								var5.dispose();
								var5 = null;
							} catch (Throwable var28) {
							}
						}
						deleteToolkit();
						System.gc();
						createToolkit(var14, arg1, arg2);
					}
				} finally {
					if (var5 != null) {
						try {
							var5.dispose();
						} catch (Throwable var27) {
						}
					}
				}
				return;
			}
		}
		if (arg2) {
			preferences.setPreferencesDisplayMode(preferences.displayMode, !arg2);
		}
		preferences.setPreference(preferences.displayMode, arg0);
		if (!arg2) {
			preferences.setPreferencesDisplayMode(preferences.displayMode, !arg2);
		}
		ObjIconFactory.reset();
		toolkit.setVertexCapacity(20000);
		toolkit.method2224(32);
		world.method7820();
		if (toolkit.isBloomSupported()) {
			setBloom(preferences.bloom.getValue() == 1);
		}
		world.createEnvironmentManager(true);
		world.getEnvironmentManager().resetFade();
		MiniMap.method829();
		preferencesChangeNotified = false;
		compressedTextureFormatSupportTransmitted = false;
		field10836 = true;
		field8871 = null;
		toolkit.method2339(0.0F, 1.0F);
	}

	@ObfuscatedName("acs.er(Lpq;ZFFFFIII)V")
	public static void method15141(Matrix4x4 arg0, boolean arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
		int var8 = world.method7734();
		int var9 = world.method7760();
		arg0.method6703(arg2, arg3, arg4, arg5, (float) var9, (float) var8, (float) arg6, (float) arg7);
	}

	@ObfuscatedName("qj.en(I)V")
	public static void deleteToolkit() {
		if (toolkit == null) {
			return;
		}
		world.method7747();
		MiniMap.rebuild();
		MiniMenu.setFormattingDefault();
		PickableEntity.resetStack();
		TwitchHardwarePlatform.method2739();
		world.createEnvironmentManager(true);
		SkyBox.method7713();
		MiniMap.method829();
		resetCaches(false);
		DefaultSprites.clear();
		ClientWorldMap.method18566();
		Loading.method18929();
		for (int var0 = 0; var0 < hintTrails.length; var0++) {
			if (hintTrails[var0] != null) {
				hintTrails[var0].model = null;
			}
		}
		for (int var1 = 0; var1 < 2048; var1++) {
			PlayerEntity var2 = players[var1];
			if (var2 != null) {
				for (int var3 = 0; var3 < var2.idk.length; var3++) {
					var2.idk[var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < npcCount; var4++) {
			NpcEntity var5 = (NpcEntity) field10839[var4].value;
			if (var5 != null) {
				for (int var6 = 0; var6 < var5.idk.length; var6++) {
					var5.idk[var6] = null;
				}
			}
		}
		spotanims.removeAll();
		toolkit.dispose();
		toolkit = null;
	}

	@ObfuscatedName("adk.eb(I)V")
	public static void method15235() {
		keyboard.unbind();
		mouse.unbind();
		field8301.addcanvas();
		GameShell.canvas.setBackground(Color.black);
		currentCursor = -1;
		keyboard = Keyboard.create(GameShell.canvas);
		mouse = Mouse.create(GameShell.canvas, true);
	}

	@ObfuscatedName("acz.ex(B)V")
	public static void method15024() {
		if (toolkit.method2240()) {
			toolkit.method2192(GameShell.canvas);
			method15235();
			Dimension var0 = GameShell.canvas.getSize();
			toolkit.method2178(GameShell.canvas, var0.width, var0.height);
			toolkit.method2140(GameShell.canvas);
		} else {
			setToolkit(preferences.displayMode.getValue(), false);
		}
		method9734();
	}

	@ObfuscatedName("adc.fg(III)I")
	public static int getPerformanceMetric(int displayMode, int threshold) {
		if (graphicsDefaults.performancemetricsmodel == -1) {
			return 1;
		}

		if (displayMode != preferences.displayMode.getValue()) {
			changeToolkit(displayMode, LocalisedText.PROFILING.forLang(language), true);
			if (preferences.displayMode.getValue() != displayMode) {
				return -1;
			}
		}

		try {
			Dimension canvasSize = GameShell.canvas.getSize();
			MessageBox.draw(LocalisedText.PROFILING.forLang(language), true, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);

			ModelUnlit baseModelTest = ModelUnlit.get(modelsJs5, graphicsDefaults.performancemetricsmodel, 0);

			long var4 = MonotonicTime.get();
			toolkit.resetClip();
			field10793.setToTranslation(0.0F, 256.0F, 0.0F);
			toolkit.method2217(field10793);
			Matrix4x4 var6 = toolkit.method2208();
			var6.method6703((float) (canvasSize.width / 2), (float) (canvasSize.height / 2), 512.0F, 512.0F, (float) world.method7760(), (float) world.method7734(), (float) canvasSize.width, (float) canvasSize.height);
			toolkit.method2220(var6);
			toolkit.setSunAmbientIntensity(1.0F);
			toolkit.setSun(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			Model modelTest = toolkit.createModel(baseModelTest, 2048, 64, 64, 768);

			if (modelTest == null) {
				System.out.println("Exception prevented: modelTest == null");
				return -1;
			}

			int var8 = 0;
			label42: for (int var9 = 0; var9 < 500; var9++) {
				toolkit.method2475(3, 0);
				for (int var10 = 15; var10 >= 0; var10--) {
					for (int var11 = 0; var11 <= var10; var11++) {
						field10875.setToTranslation((float) ((int) (((float) var11 - (float) var10 / 2.0F) * 512.0F)), 0.0F, (float) ((var10 + 1) * 512));

						modelTest.draw(field10875, null, 0);
						var8++;

						if (MonotonicTime.get() - var4 >= (long) threshold) {
							break label42;
						}
					}
				}
			}

			toolkit.method2117();
			long var12 = (long) (var8 * 1000) / (MonotonicTime.get() - var4);
			toolkit.method2475(3, 0);
			return (int) var12;
		} catch (Throwable ex) {
			ex.printStackTrace();
			return -1;
		}
	}

	@ObfuscatedName("ez.fm(I)I")
	public static int getWindowMode() {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			return 3;
		} else if (field10960) {
			return 2;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("zt.fu(IIIZB)V")
	public static void setWindowMode(int arg0, int arg1, int arg2, boolean arg3) {
		windowModeChangeTime = 0L;
		int var4 = getWindowMode();
		if (arg0 == 3 || var4 == 3) {
			arg3 = true;
		}
		if (!toolkit.method2124()) {
			arg3 = true;
		}
		method13784(var4, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ym.fs(IIIIZB)V")
	public static void method13784(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (Fullscreen.allowed && GameShell.fsframe != null && (arg1 != 3 || GameShell.lastFullscreenWidth != arg2 || GameShell.lastFullscreenHeight != arg3)) {
			Fullscreen.method4277(GameShell.fsimp14, GameShell.fsframe);
			GameShell.fsframe = null;
		}
		if (Fullscreen.allowed && arg1 == 3 && GameShell.fsframe == null) {
			GameShell.fsframe = Fullscreen.method4572(GameShell.fsimp14, arg2, arg3, 0, 0);
			if (GameShell.fsframe != null) {
				GameShell.lastFullscreenWidth = arg2;
				GameShell.lastFullscreenHeight = arg3;
				Preferences.save();
			}
		}
		if (arg1 == 3 && (!Fullscreen.allowed || GameShell.fsframe == null)) {
			method13784(arg0, preferences.windowMode.getValue(), -1, -1, true);
			return;
		}
		Container var5 = GameShell.getTopContainer();
		if (GameShell.fsframe != null) {
			GameShell.frameWid = arg2;
			GameShell.frameHei = arg3;
		} else if (GameShell.frame == null) {
			GameShell.frameWid = var5.getSize().width;
			GameShell.frameHei = var5.getSize().height;
		} else {
			Insets var6 = GameShell.frame.getInsets();
			int var10001 = var6.right + var6.left;
			GameShell.frameWid = GameShell.frame.getSize().width - var10001;
			int var9 = var6.top + var6.bottom;
			GameShell.frameHei = GameShell.frame.getSize().height - var9;
		}
		if (GameShell.frameWid <= 0) {
			GameShell.frameWid = 1;
		}
		if (GameShell.frameHei <= 0) {
			GameShell.frameHei = 1;
		}
		if (arg1 == 1) {
			GameShell.canvasWid = frameWidth;
			leftMargin = (GameShell.frameWid - frameWidth) / 2;
			GameShell.canvasHei = frameHeight;
			topMargin = 0;
		} else {
			method7263();
		}
		if (modewhere != ModeWhere.LIVE && GameShell.canvasWid < 1024 && GameShell.canvasHei < 768) {
		}
		if (arg4) {
			method15024();
		} else {
			GameShell.canvas.setSize(GameShell.canvasWid, GameShell.canvasHei);
			toolkit.method2216(GameShell.canvas, GameShell.canvasWid, GameShell.canvasHei);
			if (GameShell.frame == var5) {
				Insets var7 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(leftMargin + var7.left, topMargin + var7.top);
			} else {
				GameShell.canvas.setLocation(leftMargin, topMargin);
			}
		}
		if (arg1 >= 2) {
			field10960 = true;
		} else {
			field10960 = false;
		}
		method1018();
		if (openedTopInterface != -1) {
			computeTopLevelInterfaceLayout(true);
		}
		if (getCurrentConnection().getStream() != null && (isStateGame(state) || isStateLobby(state))) {
			notifyWindowStatus(getCurrentConnection());
		}
		for (int var8 = 0; var8 < 114; var8++) {
			topLevelComponentRedrawRequestedTemp[var8] = true;
		}
		fullredraw = true;
	}

	@ObfuscatedName("ij.fz(Lax;B)V")
	public static void notifyWindowStatus(ServerConnection connection) {
		ClientMessage message = ClientMessage.createMessage(ClientProt.WINDOW_STATUS, connection.randomOut);
		message.buf.p1(getWindowMode());
		message.buf.p2(GameShell.canvasWid);
		message.buf.p2(GameShell.canvasHei);
		message.buf.p1(preferences.antiAliasing2.getValue());
		connection.queue(message);
	}

	@ObfuscatedName("fs.fj(B)V")
	public static void method3033() {
		Container var0 = GameShell.getTopContainer();
		int var1 = var0.getSize().width;
		int var2 = var0.getSize().height;
		if (GameShell.frame == var0) {
			Insets var3 = GameShell.frame.getInsets();
			var1 -= var3.right + var3.left;
			var2 -= var3.top + var3.bottom;
		}
		if (GameShell.frameWid == var1 && GameShell.frameHei == var2 && !field10836) {
			return;
		}
		if (toolkit == null || toolkit.method2124()) {
			method6793();
		} else {
			GameShell.frameWid = var1;
			GameShell.frameHei = var2;
		}
		windowModeChangeTime = MonotonicTime.get() + 500L;
		field10836 = false;
	}

	@ObfuscatedName("pw.fd(B)V")
	public static void method6793() {
		Client var0 = field8301;
		synchronized (field8301) {
			if (GameShell.fsframe == null) {
				Container var1 = GameShell.getTopContainer();
				if (var1 != null) {
					GameShell.frameWid = var1.getSize().width;
					GameShell.frameHei = var1.getSize().height;
					if (GameShell.frame == var1) {
						Insets var2 = GameShell.frame.getInsets();
						GameShell.frameWid -= var2.right + var2.left;
						GameShell.frameHei -= var2.top + var2.bottom;
					}
					if (GameShell.frameWid <= 0) {
						GameShell.frameWid = 1;
					}
					if (GameShell.frameHei <= 0) {
						GameShell.frameHei = 1;
					}
					if (getWindowMode() == 1) {
						GameShell.canvasWid = frameWidth;
						leftMargin = (GameShell.frameWid - frameWidth) / 2;
						GameShell.canvasHei = frameHeight;
						topMargin = 0;
					} else {
						method7263();
					}
					if (modewhere != ModeWhere.LIVE && GameShell.canvasWid < 1024 && GameShell.canvasHei < 768) {
					}
					GameShell.canvas.setSize(GameShell.canvasWid, GameShell.canvasHei);
					if (toolkit != null) {
						toolkit.method2216(GameShell.canvas, GameShell.canvasWid, GameShell.canvasHei);
						TwitchHardwarePlatform.method7259(toolkit, MonotonicTime.get());
					}
					if (GameShell.frame == var1) {
						Insets var3 = GameShell.frame.getInsets();
						GameShell.canvas.setLocation(leftMargin + var3.left, topMargin + var3.top);
					} else {
						GameShell.canvas.setLocation(leftMargin, topMargin);
					}
					method1018();
					if (openedTopInterface != -1) {
						computeTopLevelInterfaceLayout(true);
					}
					method8024();
				}
			}
		}
	}

	@ObfuscatedName("bf.fn(I)V")
	public static void method1018() {
		int var0 = GameShell.canvasWid;
		int var1 = GameShell.canvasHei;
		if (GameShell.frameWid < var0) {
			var0 = GameShell.frameWid;
		}
		if (GameShell.frameHei < var1) {
			var1 = GameShell.frameHei;
		}
		try {
			if (preferences != null) {
				JavascriptFunction.field4027.method6089(new Object[] { var0, var1, getWindowMode(), preferences.screenSize.getValue() });
			}
		} catch (Throwable var3) {
		}
	}

	@ObfuscatedName("qd.fi(I)V")
	public static void method7263() {
		int var0 = 0;
		if (preferences != null) {
			var0 = preferences.screenSize.getValue();
		}
		if (var0 == 2) {
			int var1 = GameShell.frameWid > 800 ? 800 : GameShell.frameWid;
			int var2 = GameShell.frameHei > 600 ? 600 : GameShell.frameHei;
			GameShell.canvasWid = var1;
			leftMargin = (GameShell.frameWid - var1) / 2;
			GameShell.canvasHei = var2;
			topMargin = 0;
		} else if (var0 == 1) {
			int var3 = GameShell.frameWid > 1024 ? 1024 : GameShell.frameWid;
			int var4 = GameShell.frameHei > 768 ? 768 : GameShell.frameHei;
			GameShell.canvasWid = var3;
			leftMargin = (GameShell.frameWid - var3) / 2;
			GameShell.canvasHei = var4;
			topMargin = 0;
		} else {
			GameShell.canvasWid = GameShell.frameWid;
			leftMargin = 0;
			GameShell.canvasHei = GameShell.frameHei;
			topMargin = 0;
		}
	}

	@ObfuscatedName("sm.ft(I)V")
	public static void method8024() {
		if (GameShell.fsframe != null) {
			return;
		}
		int var0 = leftMargin;
		int var1 = topMargin;
		int var2 = GameShell.frameWid - GameShell.canvasWid - var0;
		int var3 = GameShell.frameHei - GameShell.canvasHei - var1;
		if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
			return;
		}
		try {
			Container var4 = GameShell.getTopContainer();
			int var5 = 0;
			int var6 = 0;
			if (GameShell.frame == var4) {
				Insets var7 = GameShell.frame.getInsets();
				var5 = var7.left;
				var6 = var7.top;
			}
			Graphics var8 = var4.getGraphics();
			var8.setColor(Color.black);
			if (var0 > 0) {
				var8.fillRect(var5, var6, var0, GameShell.frameHei);
			}
			if (var1 > 0) {
				var8.fillRect(var5, var6, GameShell.frameWid, var1);
			}
			if (var2 > 0) {
				var8.fillRect(GameShell.frameWid + var5 - var2, var6, var2, GameShell.frameHei);
			}
			if (var3 > 0) {
				var8.fillRect(var5, GameShell.frameHei + var6 - var3, GameShell.frameWid, var3);
			}
		} catch (Exception var10) {
		}
	}

	@ObfuscatedName("wg.fx(ZI)Z")
	public static boolean setBloom(boolean useBloom) {
		boolean rendererBloomEnabled = toolkit.isBloomEnabled();
		if (useBloom == rendererBloomEnabled) {
			return true;
		}
		if (!useBloom) {
			toolkit.disableBloom();
		} else if (!toolkit.enableBloom()) {
			useBloom = false;
		}
		if (useBloom == rendererBloomEnabled) {
			return false;
		} else {
			preferences.setPreference(preferences.bloom, useBloom ? 1 : 0);
			Preferences.save();
			return true;
		}
	}

	@ObfuscatedName("yx.fv(II)V")
	public static void method10615(int arg0) {
		if (preferences.customCursors.getValue() == 0) {
			arg0 = -1;
		}
		if (currentCursor == arg0) {
			return;
		}
		if (arg0 != -1) {
			CursorType var1 = (CursorType) cursorTypeList.list(arg0);
			SpriteData var2 = var1.getCursor();
			if (var2 == null) {
				arg0 = -1;
			} else {
				GameShell.mouseImp.setcustomcursor(GameShell.canvas, var2.method2604(true), var2.method2596(), var2.method2597(), new Point(var1.hotspotx, var1.hotspoty));
				currentCursor = arg0;
			}
		}
		if (arg0 == -1 && currentCursor != -1) {
			GameShell.mouseImp.setcustomcursor(GameShell.canvas, null, -1, -1, new Point());
			currentCursor = -1;
		}
	}

	@ObfuscatedName("vd.fc(I)V")
	public static void resetModelCaches() {
		int var0 = 0;
		if (preferences.lightingDetail.getValue() == 1) {
			int var1 = var0 | 0x1;
			int var2 = var1 | 0x10;
			int var3 = var2 | 0x20;
			int var4 = var3 | 0x2;
			var0 = var4 | 0x4;
		}
		if (preferences.textures.getValue() == 0) {
			var0 |= 0x40;
		}
		Component.resetModelCache(var0);
		world.getLocTypeList().resetModelCache(var0);
		asyncRebuild.method7677().getLocTypeList().resetModelCache(var0);
		objTypeList.resetModelCache(var0);
		npcTypeList.resetModelCache(var0);
		effectAnimTypeList.resetModelCache(var0);
		HintArrow.resetModelCache(var0);
		HintTrail.resetModelCache(var0);
		SpotShadowFactory.resetModelCache(var0);
		PlayerModel.resetModelCache(var0);
		ClientInvCache.resetModelCache(var0);
		world.rebuild();
	}

	@ObfuscatedName("gd.fw(I)V")
	public static final void method3652() {
		cutsceneId = -1;
		sceneState = 3;
		field8729 = null;
		CutsceneManager.method3551();
	}

	@ObfuscatedName("wd.fa(I)V")
	public static final void method9872() {
		method3652();
		world.method7746();
		for (int var0 = 0; var0 < hintArrows.length; var0++) {
			hintArrows[var0] = null;
		}
		for (int var1 = 0; var1 < hintTrails.length; var1++) {
			hintTrails[var1] = null;
		}
		ReceivePlayerPositions.reset();
		for (int var2 = 0; var2 < 2048; var2++) {
			players[var2] = null;
		}
		npcSlotCount = 0;
		npcs.removeAll();
		npcCount = 0;
		objStacks.removeAll();
		cameraReset(getDefaultCameraState());
		currentIncrementVerifyId = 0;
		localPlayerGameState.varps.method9624();
		listenedClanSettings = null;
		affinedClanSettings = null;
		listenedClanChannel = null;
		affinedClanChannel = null;
		currentPlayerGroup = null;
		telemetryError = true;
		pingRequest = null;
		field3457 = 0L;
		MiniMenu.close();
		MiniMenu.method3074();
	}

	@ObfuscatedName("wo.fp(ZS)V")
	public static final void logout(boolean arg0) {
		ServerConnection[] var1 = connections;
		for (int var2 = 0; var2 < var1.length; var2++) {
			ServerConnection var3 = var1[var2];
			try {
				var3.flush();
			} catch (IOException var7) {
			}
			var3.closeGracefully();
		}
		LoginManager.resetLoginState();
		resetTransmitNums();
		resetCaches(false);
		world.method7747();
		world.method7746();
		world.clearEnvironmentOverride();
		ClientWorldMap.reset();
		CameraManager.method3913();
		PositionedSound.method13908(true);
		ClientWorldMap.method6003();
		method9872();
		currentPlayerUid = -1;
		if (arg0) {
			setState(9);
			return;
		}
		setState(4);
		try {
			BrowserControl.call(GameShell.field11885, "loggedout");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("r.fq(I)V")
	public static final void cleanCaches() {
		overlayTypeList.cacheClean(5);
		underlayTypeList.cacheClean(5);
		idkTypeList.cacheClean(5);
		world.getLocTypeList().cacheClean(5);
		npcTypeList.cacheClean(5);
		objTypeList.cacheClean(5);
		seqTypeList.cacheClean(5);
		effectAnimTypeList.cacheClean(5);
		varBitTypeList.cacheClean(5);
		varPlayerTypeList.cacheClean(5);
		varNpcTypeList.cacheClean(5);
		varClanTypeList.cacheClean(5);
		varClanSettingTypeList.cacheClean(5);
		varPlayerGroupTypeList.cacheClean(5);
		varObjTypeList.cacheClean(5);
		basTypeList.cacheClean(5);
		mapElementTypeList.cacheClean(5);
		msiTypeList.cacheClean(5);
		paramTypeList.cacheClean(5);
		skyBoxTypeList.cacheClean(5);
		skyDecorTypeList.cacheClean(5);
		lightTypeList.cacheClean(5);
		cursorTypeList.cacheClean(5);
		hitmarkTypeList.cacheClean(5);
		headbarTypeList.cacheClean(5);
		PlayerModel.cacheClean(5);
		Component.cacheClean(50);
		fontProvider.cacheClean(50);
		HintArrow.cacheClean(5);
		SpotShadowFactory.cacheClean(5);
		field10830.clean(5);
		headIconsCache.clean(5);
		ScriptRunner.field8204.clean(5);
		field11013.clean(5);
		dbRowTypeList.cacheClean(5);
		dbTableTypeList.cacheClean(5);
		field10834.clean(5);
	}

	@ObfuscatedName("yj.ff(B)V")
	public static final void removeSoftReferencesCaches() {
		overlayTypeList.cacheRemoveSoftReferences();
		underlayTypeList.cacheRemoveSoftReferences();
		idkTypeList.cacheRemoveSoftReferences();
		world.getLocTypeList().cacheRemoveSoftReferences();
		npcTypeList.cacheRemoveSoftReferences();
		objTypeList.cacheRemoveSoftReferences();
		seqTypeList.cacheRemoveSoftReferences();
		effectAnimTypeList.cacheRemoveSoftReferences();
		varBitTypeList.cacheRemoveSoftReferences();
		varPlayerTypeList.cacheRemoveSoftReferences();
		varNpcTypeList.cacheRemoveSoftReferences();
		varClanTypeList.cacheRemoveSoftReferences();
		varClanSettingTypeList.cacheRemoveSoftReferences();
		varPlayerGroupTypeList.cacheRemoveSoftReferences();
		varObjTypeList.cacheRemoveSoftReferences();
		basTypeList.cacheRemoveSoftReferences();
		msiTypeList.cacheRemoveSoftReferences();
		mapElementTypeList.cacheRemoveSoftReferences();
		paramTypeList.cacheRemoveSoftReferences();
		skyBoxTypeList.cacheRemoveSoftReferences();
		skyDecorTypeList.cacheRemoveSoftReferences();
		lightTypeList.cacheRemoveSoftReferences();
		cursorTypeList.cacheRemoveSoftReferences();
		hitmarkTypeList.cacheRemoveSoftReferences();
		headbarTypeList.cacheRemoveSoftReferences();
		PlayerModel.cacheRemoveSoftReferences();
		Component.cacheRemoveSoftReferences();
		fontProvider.cacheRemoveSoftReferences();
		HintArrow.cacheRemoveSoftReferences();
		SpotShadowFactory.cacheRemoveSoftReferences();
		field10830.clear();
		headIconsCache.clear();
		ScriptRunner.field8204.clear();
		field11013.clear();
		dbRowTypeList.cacheRemoveSoftReferences();
		dbTableTypeList.cacheRemoveSoftReferences();
		field10834.clear();
	}

	@ObfuscatedName("zb.fl(ZB)V")
	public static final void resetCaches(boolean notResetAll) {
		if (!notResetAll) {
			overlayTypeList.cacheReset();
			underlayTypeList.cacheReset();
			idkTypeList.cacheReset();
			world.getLocTypeList().cacheReset();
			npcTypeList.cacheReset();
			objTypeList.cacheReset();
			seqTypeList.cacheReset();
			effectAnimTypeList.cacheReset();
			varBitTypeList.cacheReset();
			varPlayerTypeList.cacheReset();
			varNpcTypeList.cacheReset();
			varClanTypeList.cacheReset();
			varClanSettingTypeList.cacheReset();
			varPlayerGroupTypeList.cacheReset();
			varObjTypeList.cacheReset();
			basTypeList.cacheReset();
			msiTypeList.cacheReset();
			mapElementTypeList.cacheReset();
			paramTypeList.cacheReset();
			skyBoxTypeList.cacheReset();
			skyDecorTypeList.cacheReset();
			lightTypeList.cacheReset();
			cursorTypeList.cacheReset();
			hitmarkTypeList.cacheReset();
			headbarTypeList.cacheReset();
			PlayerModel.cacheReset();
			Component.cacheReset();
			fontProvider.cacheReset();
			ClientInvCache.cacheReset();
			if (modewhere != ModeWhere.LIVE) {
				for (int var1 = 0; var1 < field9166.length; var1++) {
					field9166[var1] = null;
				}
				field10798 = 0;
			}
			world.getEnvironmentManager().cacheReset();
			HintArrow.cacheReset();
			SpotShadowFactory.cacheReset();
			basicParticleEmitterTypeList.cacheReset();
			basicParticleEffectorTypeList.cacheReset();
			ScriptRunner.field8204.reset();
			field10830.reset();
			headIconsCache.reset();
			field11013.reset();
			dbRowTypeList.cacheReset();
			dbTableTypeList.cacheReset();
			field10834.reset();
		}
		ClientScriptHelpers.method8004();
		ObjIconFactory.reset();
	}

	@ObfuscatedName("sz.fb(I)V")
	public static final void tryReconnect() {
		if (isStateLobby(state) || isStateTitle(state)) {
			logoutReason = LogoutReason.field9135;
			logout(false);
		} else {
			logoutReason = LogoutReason.field9141;
			field11764 = gameConnection.getStream();
			gameConnection.closeForcefully();
			setState(14);
		}
	}

	@ObfuscatedName("aax.fo(I)V")
	public static void method14147() {
		FileOnDisk var0 = GameShell.openPrefs("2", modegame.titleURL, true);
		clientVarDomain.method16418(var0);
	}

	@ObfuscatedName("client.fy(I)V")
	public final void updateTitleScreen() {
		if (state == 13 && !LoginManager.isInProgress() || state == 15 && LoginManager.enterGameReply == 42 || state == 17 && (LoginManager.enterLobbyReply == 49 || LoginManager.enterLobbyReply == 52) || state == 0) {
			if (rebootTimer > 1) {
				rebootTimer--;
				lastOnMiscTransmitRedrawCycle = redrawCycle;
			}
			if (!MiniMenu.open) {
				MiniMenu.method3074();
			}
			if (state != 17 || LoginManager.enterLobbyReply != 49 && LoginManager.enterLobbyReply != 52) {
				for (int var1 = 0; var1 < 100 && readConnection(lobbyConnection); var1++) {
				}
			}
		}
		updateInterfaces();
		ClientWatch.method9835();
		sceneDelta++;
		MiniMenu.setBounds(-1, -1);
		MiniMenu.updateMouseOverText(null, -1, -1);
		updateTopLevelInterface();
		redrawCycle++;
		for (int var2 = 0; var2 < npcCount; var2++) {
			NpcEntity var3 = (NpcEntity) field10839[var2].value;
			if (var3 != null) {
				byte var4 = var3.npcType.walkflags;
				if ((var4 & 0x1) != 0) {
					int var5 = var3.size();
					if ((var4 & 0x2) != 0 && var3.routeLength == 0 && Math.random() * 1000.0D < 10.0D) {
						int var6 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (var6 != 0 || var7 != 0) {
							int var8 = var3.routeWaypointX[0] + var6;
							int var9 = var3.routeWaypointZ[0] + var7;
							if (var8 < 0) {
								boolean var10 = false;
							} else if (var8 > world.getSizeX() - var5 - 1) {
								int var11 = world.getSizeX() - var5 - 1;
							}
							if (var9 < 0) {
								boolean var12 = false;
							} else if (var9 > world.getSizeZ() - var5 - 1) {
								int var13 = world.getSizeZ() - var5 - 1;
							}
						}
					}
					updateMovement(var3, true);
					int var14 = method14063(var3);
					method10222(var3);
					updateWalkAnim(var3, field1891, field1797, var14);
					updateMainAnim(var3, field1891);
					updateSpotAnim(var3);
					Quaternion var15 = Quaternion.create();
					var15.setToRotation(Trig1.radians(var3.field10395.method316()), Trig1.radians(var3.field10413.method316()), Trig1.radians(var3.field10447.method316()));
					var3.setRotation(var15);
					var15.release();
				}
			}
		}
		if ((state == 4 || state == 15 || state == 13 || state == 0) && (!LoginManager.isInProgress() || state == 15 && LoginManager.enterGameReply == 42 || state == 17 && (LoginManager.enterLobbyReply == 49 || LoginManager.enterLobbyReply == 52)) && !AccountCreationManager.isInProgress()) {
			if (Client.cameraState == 5) {
				applyCameraCutscene();
			} else {
				applyCameraMoveAlong();
			}
			if (cameraX >> 9 < 14 || cameraX >> 9 >= world.getSizeX() - 14 || cameraZ >> 9 < 14 || cameraZ >> 9 >= world.getSizeZ() - 14) {
				world.rebuildMap(new RebuildRequest(RebuildType.field5063, null));
			}
		}
		while (true) {
			HookRequest var16;
			Component var17;
			Component var18;
			do {
				var16 = (HookRequest) hookRequestsTimer.removeHead();
				if (var16 == null) {
					while (true) {
						HookRequest var19;
						Component var20;
						Component var21;
						do {
							var19 = (HookRequest) hookRequestsMouseStop.removeHead();
							if (var19 == null) {
								while (true) {
									HookRequest var22;
									Component var23;
									Component var24;
									do {
										var22 = (HookRequest) hookRequests.removeHead();
										if (var22 == null) {
											if (field10989 != null) {
												method6847();
											}
											if (loopCycle % 15000 == 0) {
												method3095();
											}
											if (state == 13 && !LoginManager.isInProgress() || state == 15 && LoginManager.enterGameReply == 42 || state == 17 && (LoginManager.enterLobbyReply == 49 || LoginManager.enterLobbyReply == 52) || state == 0) {
												MiniMenu.method9026();
											}
											WorldSwitcher.method2778();
											if (incrementVerifyIdChanged && state == 13) {
												notifyIncrementIdVerification();
												incrementVerifyIdChanged = false;
											}
											if (clientVarDomain.field10252 && clientVarDomain.field10253 < MonotonicTime.get() - 60000L) {
												method14147();
											}
											for (TimestampMessage var25 = (TimestampMessage) field10910.peekFront(); var25 != null; var25 = (TimestampMessage) field10910.prev()) {
												if ((long) var25.timestamp < MonotonicTime.get() / 1000L - 5L) {
													if (var25.worldId > 0) {
														ChatHistory.addMessage(5, 0, "", "", "", var25.message + LocalisedText.FRIENDLOGIN.forLang(language), null);
													}
													if (var25.worldId == 0) {
														ChatHistory.addMessage(5, 0, "", "", "", var25.message + LocalisedText.FRIENDLOGOUT.forLang(language), null);
													}
													var25.unlink();
												}
											}
											if (state == 13 && !LoginManager.isInProgress() || state == 15 && LoginManager.enterGameReply == 42 || state == 17 && (LoginManager.enterLobbyReply == 49 || LoginManager.enterLobbyReply == 52) || state == 0) {
												if (state != 15 && lobbyConnection.getStream() == null) {
													logoutReason = LogoutReason.field9135;
													logout(false);
													return;
												}
												if (lobbyConnection != null) {
													lobbyConnection.numConnections++;
													if (lobbyConnection.numConnections > 50) {
														ClientMessage var26 = ClientMessage.createMessage(ClientProt.NO_TIMEOUT, lobbyConnection.randomOut);
														lobbyConnection.queue(var26);
													}
													try {
														lobbyConnection.flush();
													} catch (IOException var28) {
														if (state == 15) {
															lobbyConnection.closeGracefully();
														} else {
															logout(false);
														}
													}
												}
											}
											return;
										}
										var23 = var22.component;
										if (var23.id < 0) {
											break;
										}
										var24 = Component.get(var23.layer);
									} while (var24 == null || var24.subcomponents == null || var23.id >= var24.subcomponents.length || var24.subcomponents[var23.id] != var23);
									ScriptRunner.runHook(var22);
								}
							}
							var20 = var19.component;
							if (var20.id < 0) {
								break;
							}
							var21 = Component.get(var20.layer);
						} while (var21 == null || var21.subcomponents == null || var20.id >= var21.subcomponents.length || var21.subcomponents[var20.id] != var20);
						ScriptRunner.runHook(var19);
					}
				}
				var17 = var16.component;
				if (var17.id < 0) {
					break;
				}
				var18 = Component.get(var17.layer);
			} while (var18 == null || var18.subcomponents == null || var17.id >= var18.subcomponents.length || var18.subcomponents[var17.id] != var17);
			ScriptRunner.runHook(var16);
		}
	}

	@ObfuscatedName("fm.fe(I)V")
	public static final void updateGame() {
		if (rebootTimer > 1) {
			rebootTimer--;
			lastOnMiscTransmitRedrawCycle = redrawCycle;
		}
		if (gameConnection.disconnected) {
			gameConnection.disconnected = false;
			tryReconnect();
			return;
		}
		if (!MiniMenu.open) {
			MiniMenu.method3074();
		}
		for (int index = 0; index < 100 && readConnection(gameConnection); index++) {
		}
		if (state != 18) {
			return;
		}
		while (ReflectionCheck.hasNext()) {
			ClientMessage message = ClientMessage.createMessage(ClientProt.REFLECTION_CHECK_REPLY, gameConnection.randomOut);
			message.buf.p1(0);
			int start = message.buf.pos;
			ReflectionCheck.createReflectionCheck(message.buf);
			message.buf.psize1(message.buf.pos - start);
			gameConnection.queue(message);
		}
		if (pingRequest == null) {
			if (MonotonicTime.get() >= field3457) {
				pingRequest = inetAddressLookupRequest.method10589(WorldSwitcher.currentWorld.host);
			}
		} else if (pingRequest.hostpacked != -1) {
			ClientMessage var3 = ClientMessage.createMessage(ClientProt.PING_STATISTICS, gameConnection.randomOut);
			if (field11399 == null || !field11399.isValid()) {
				try {
					Iterator var4 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (var4.hasNext()) {
						GarbageCollectorMXBean var5 = (GarbageCollectorMXBean) var4.next();
						if (var5.isValid()) {
							field11399 = var5;
							field11091 = -1L;
							field11090 = -1L;
						}
					}
				} catch (Throwable var48) {
				}
			}
			long var7 = MonotonicTime.get();
			int var9 = -1;
			if (field11399 != null) {
				long var10 = field11399.getCollectionTime();
				if (field11090 != -1L) {
					long var12 = var10 - field11090;
					long var14 = var7 - field11091;
					if (var14 != 0L) {
						var9 = (int) (var12 * 100L / var14);
					}
				}
				field11090 = var10;
				field11091 = var7;
			}
			var3.buf.p2_alt1(pingRequest.hostpacked);
			var3.buf.p1_alt3(fps);
			var3.buf.p1(var9);
			gameConnection.queue(var3);
			pingRequest = null;
			field3457 = var7 + 30000L;
		}
		ClientWatch.method3648();
		GraphicsPacketQueue.flush();
		MouseEvent var16 = (MouseEvent) mouseEvents.head();
		if (world.getScene() != null) {
			if (Client.cameraState == 5) {
				applyCameraCutscene();
			} else if (Client.cameraState == 6) {
				applyCameraMoveAlong();
			}
		}
		if (field10898) {
			field10898 = false;
		} else {
			field10897 /= 2.0F;
		}
		if (field11059) {
			field11059 = false;
		} else {
			field10896 /= 2.0F;
		}
		if (CameraManager.method2978()) {
			CameraManager.method2585();
		} else if (Client.cameraState == 3) {
			CoordGrid var17 = world.getBase();
			int var18 = var17.x << 9;
			int var19 = var17.z << 9;
			if (field637 <= 0L) {
				field637 = MonotonicTime.get();
			}
			float var20 = (float) (MonotonicTime.get() - field637);
			int var21 = 1000 / GameShell.getLogicRate();
			int var22 = (int) ((double) var21 * 1.25D);
			while (var20 > 0.0F) {
				float var23 = Math.min(var20, (float) var22);
				cam2.update(var23 / 1000.0F, world.method7744().levelHeightmap, world.getSceneLevelTileFlags(), var18, var19);
				var20 -= var22;
			}
			field637 = MonotonicTime.get();
		}
		method1680();
		if (state != 18) {
			return;
		}
		world.getEnvironmentManager().updatePartial(world);
		ChangeLocationRequest.updateLocs();
		if (field10915 > 10) {
			gameConnection.idleNetCycles++;
		}
		if (gameConnection.idleNetCycles > 2250) {
			tryReconnect();
			return;
		}
		if (sceneState == 3) {
			updatePlayers();
			updateNpcs();
		} else if (cutsceneDefaults.cancelbinding.test(var16, keyboardEvents, keyboardEventCount, keyboard)) {
			CutsceneManager.finish(false);
		} else {
			if (sceneState == 2 && CutsceneManager.load(cutsceneId)) {
				world.rebuildMap(new RebuildRequest(RebuildType.CUTSCENE, null));
				sceneState = 1;
			}
			if (sceneState == 1 && state != 3) {
				CutsceneManager.varPlayerOverrides.removeAll();
				sceneState = 0;
				field11041 = loopCycle;
				field10797 = 0;
				field10877 = false;
				CutsceneManager.method1576();
			}
			if (sceneState == 0) {
				int var24 = loopCycle - field11041;
				if (field10797 < CutsceneManager.actions.length) {
					do {
						CutsceneAction var25 = CutsceneManager.actions[field10797];
						if (var25.field1750 > var24) {
							break;
						}
						var25.method2890();
					} while (sceneState == 0 && ++field10797 < CutsceneManager.actions.length);
				}
				if (sceneState == 0) {
					for (int var26 = 0; var26 < CutsceneManager.entities.length; var26++) {
						CutsceneEntity var27 = CutsceneManager.entities[var26];
						if (var27.exists) {
							PathingEntity var28 = var27.getEntity();
							updateEntity(var28, true);
						}
					}
				}
			}
		}
		updateEntityChats();
		updateSpotAnims();
		updateInterfaces();
		ClientWorldMap.method3079(false);
		ClientWorldMap.method9231(toolkit, materialList);
		sceneDelta++;
		if (crossMode != 0) {
			crossCycle = crossCycle + 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}
		if (selectedArea != null) {
			selectedCycle++;
			if (selectedCycle >= 15) {
				requestRedrawComponent(selectedArea);
				selectedArea = null;
			}
		}
		field10993 = null;
		field10999 = false;
		field10878 = false;
		ClientWorldMap.component = null;
		MiniMenu.updateMouseOverText(null, -1, -1);
		if (!targetModeActive) {
			defaultCursor = -1;
		}
		updateTopLevelInterface();
		redrawCycle++;
		if (minimapClicked) {
			ClientMessage message = ClientMessage.createMessage(ClientProt.CLICKWORLDMAP, gameConnection.randomOut);
			message.buf.p4_alt3(field6866 << 28 | field530 << 14 | field5107);
			gameConnection.queue(message);
			minimapClicked = false;
		}
		while (true) {
			HookRequest var30;
			Component var31;
			Component var32;
			do {
				var30 = (HookRequest) hookRequestsTimer.removeHead();
				if (var30 == null) {
					while (true) {
						HookRequest var33;
						Component var34;
						Component var35;
						do {
							var33 = (HookRequest) hookRequestsMouseStop.removeHead();
							if (var33 == null) {
								while (true) {
									HookRequest var36;
									Component var37;
									Component var38;
									do {
										var36 = (HookRequest) hookRequests.removeHead();
										if (var36 == null) {
											if (ClientWorldMap.component == null) {
												field11003 = 0;
											}
											if (field10989 != null) {
												method6847();
											}
											MiniMenu.method9026();
											if (staffModLevel > 0 && keyboard.keyheld(82) && keyboard.keyheld(81) && field10817 != 0) {
												int var39 = localPlayerEntity.level - field10817;
												if (var39 < 0) {
													var39 = 0;
												} else if (var39 > 3) {
													var39 = 3;
												}
												CoordGrid var40 = world.getBase();
												jtele(var39, var40.x + localPlayerEntity.routeWaypointX[0], var40.z + localPlayerEntity.routeWaypointZ[0]);
											}
											for (int var41 = 0; var41 < 5; var41++) {
												int var10002 = cameraModifierWobbleSpeed[var41]++;
											}
											if (clientVarDomain.field10252 && clientVarDomain.field10253 < MonotonicTime.get() - 60000L) {
												method14147();
											}
											clientVarDomain.method16414();
											for (TimestampMessage var42 = (TimestampMessage) field10910.peekFront(); var42 != null; var42 = (TimestampMessage) field10910.prev()) {
												if ((long) var42.timestamp < MonotonicTime.get() / 1000L - 5L) {
													if (var42.worldId > 0) {
														ChatHistory.addMessage(5, 0, "", "", "", var42.message + LocalisedText.FRIENDLOGIN.forLang(language), null);
													}
													if (var42.worldId == 0) {
														ChatHistory.addMessage(5, 0, "", "", "", var42.message + LocalisedText.FRIENDLOGOUT.forLang(language), null);
													}
													var42.unlink();
												}
											}
											cameraOffsetCycle++;
											if (cameraOffsetCycle > 509) {
												cameraOffsetCycle = 0;
												int rand = (int) (Math.random() * 8.0D);
												if ((rand & 0x1) == 1) {
													cameraAnticheatOffsetX += cameraOffsetXModifier;
												}
												if ((rand & 0x2) == 2) {
													cameraAnticheatOffsetZ += cameraOffsetZModifier;
												}
												if ((rand & 0x4) == 4) {
													cameraAnticheatAngle += cameraOffsetYawModifier;
												}
											}
											if (cameraAnticheatOffsetX < -52) {
												cameraOffsetXModifier = 4;
											}
											if (cameraAnticheatOffsetX > 50) {
												cameraOffsetXModifier = -4;
											}
											if (cameraAnticheatOffsetZ < -58) {
												cameraOffsetZModifier = 2;
											}
											if (cameraAnticheatOffsetZ > 61) {
												cameraOffsetZModifier = -2;
											}
											if (cameraAnticheatAngle < -44) {
												cameraOffsetYawModifier = 1;
											}
											if (cameraAnticheatAngle > 44) {
												cameraOffsetYawModifier = -1;
											}
											minimapOffsetCycle++;
											if (minimapOffsetCycle > 509) {
												minimapOffsetCycle = 0;
												int rand = (int) (Math.random() * 8.0D);
												if ((rand & 0x1) == 1) {
													minimapAnticheatAngle += minimapAngleModifier;
												}
												if ((rand & 0x2) == 2) {
													minimapZoom += minimapZoomModifier;
												}
											}
											if (minimapAnticheatAngle < -69) {
												minimapAngleModifier = -2;
											}
											if (minimapAnticheatAngle > 63) {
												minimapAngleModifier = 2;
											}
											if (minimapZoom < -22) {
												minimapZoomModifier = 1;
											}
											if (minimapZoom > 10) {
												minimapZoomModifier = -1;
											}
											gameConnection.numConnections++;
											if (gameConnection.numConnections > 50) {
												ClientMessage var45 = ClientMessage.createMessage(ClientProt.NO_TIMEOUT, gameConnection.randomOut);
												gameConnection.queue(var45);
											}
											if (incrementVerifyIdChanged) {
												notifyIncrementIdVerification();
												incrementVerifyIdChanged = false;
											}
											try {
												gameConnection.flush();
											} catch (IOException ioException) {
												tryReconnect();
											}
											return;
										}
										var37 = var36.component;
										if (var37.id < 0) {
											break;
										}
										var38 = Component.get(var37.layer);
									} while (var38 == null || var38.subcomponents == null || var37.id >= var38.subcomponents.length || var38.subcomponents[var37.id] != var37);
									ScriptRunner.runHook(var36);
								}
							}
							var34 = var33.component;
							if (var34.id < 0) {
								break;
							}
							var35 = Component.get(var34.layer);
						} while (var35 == null || var35.subcomponents == null || var34.id >= var35.subcomponents.length || var35.subcomponents[var34.id] != var34);
						ScriptRunner.runHook(var33);
					}
				}
				var31 = var30.component;
				if (var31.id < 0) {
					break;
				}
				var32 = Component.get(var31.layer);
			} while (var32 == null || var32.subcomponents == null || var31.id >= var32.subcomponents.length || var32.subcomponents[var31.id] != var31);
			ScriptRunner.runHook(var30);
		}
	}

	@ObfuscatedName("xl.fk(B)V")
	public static final void updateInterfaces() {
		for (int var0 = localPlayerGameState.varps.pollServerValue(true); var0 != -1; var0 = localPlayerGameState.varps.pollServerValue(false)) {
			onVarPlayerChanged(var0);
			varpTransmitted[++varpTransmitNum - 1 & 0x3F] = var0;
		}
		for (DelayedStateChange var1 = DelayedStateChange.poll(); var1 != null; var1 = DelayedStateChange.poll()) {
			int var2 = var1.getType();
			long var3 = var1.getTarget();
			if (var2 == 1) {
				VarType var5 = (VarType) varBasicTypeList.list((int) var3);
				clientVarDomain.setVarValueInt(var5, var1.int0);
				varcTransmitted[++varcTransmitNum - 1 & 0x3F] = (int) var3;
			} else if (var2 == 2) {
				VarType var6 = (VarType) varBasicTypeList.list((int) var3);
				clientVarDomain.setVarValue(var6, var1.str0);
				varcstrTransmitted[++varcstrTransmitNum - 1 & 0x3F] = (int) var3;
			} else if (var2 == 3) {
				Component var7 = Component.get((int) var3);
				if (!var1.str0.equals(var7.text)) {
					var7.text = var1.str0;
					requestRedrawComponent(var7);
				}
			} else if (var2 == 23) {
				Component var8 = Component.get((int) var3);
				if (var8.textantimacro != (var1.int0 == 1)) {
					var8.textantimacro = var1.int0 == 1;
					requestRedrawComponent(var8);
				}
			} else if (var2 == 4) {
				Component var9 = Component.get((int) var3);
				int var10 = var1.int0;
				int var11 = var1.int1;
				int var12 = var1.int2;
				if (var9.modelkind != var10 || var9.model != var11 || var9.field2298 != var12) {
					var9.modelkind = var10;
					var9.model = var11;
					var9.field2298 = var12;
					var9.customisation = null;
					requestRedrawComponent(var9);
				}
			} else if (var2 == 5) {
				Component var13 = Component.get((int) var3);
				if (var1.int0 != var13.modelanim) {
					if (var1.int0 == -1) {
						var13.modelAnimator = null;
					} else {
						if (var13.modelAnimator == null) {
							var13.modelAnimator = new InterfaceAnimationNode();
						}
						var13.modelAnimator.method14362(var1.int0);
					}
					var13.modelanim = var1.int0;
					requestRedrawComponent(var13);
				}
			} else if (var2 == 6) {
				int var14 = var1.int0;
				int var15 = var14 >> 10 & 0x1F;
				int var16 = var14 >> 5 & 0x1F;
				int var17 = var14 & 0x1F;
				int var18 = (var17 << 3) + (var15 << 19) + (var16 << 11);
				Component var19 = Component.get((int) var3);
				if (var19.colour != var18) {
					var19.colour = var18;
					requestRedrawComponent(var19);
				}
			} else if (var2 == 7) {
				Component var20 = Component.get((int) var3);
				boolean var21 = var1.int0 == 1;
				if (var20.hide != var21) {
					var20.hide = var21;
					requestRedrawComponent(var20);
				}
			} else if (var2 == 8) {
				Component var22 = Component.get((int) var3);
				if (var1.int0 != var22.modelangle_x || var1.int1 != var22.modelangle_y || var1.int2 != var22.modelzoom) {
					var22.modelangle_x = var1.int0;
					var22.modelangle_y = var1.int1;
					var22.modelzoom = var1.int2;
					if (var22.invobject != -1) {
						if (var22.modelobjwidth > 0) {
							var22.modelzoom = var22.modelzoom * 32 / var22.modelobjwidth;
						} else if (var22.wsize > 0) {
							var22.modelzoom = var22.modelzoom * 32 / var22.wsize;
						}
					}
					requestRedrawComponent(var22);
				}
			} else if (var2 == 9) {
				Component var23 = Component.get((int) var3);
				if (var1.int0 != var23.invobject || var1.int1 != var23.invcount) {
					var23.invobject = var1.int0;
					var23.invcount = var1.int1;
					requestRedrawComponent(var23);
				}
			} else if (var2 == 10) {
				Component var24 = Component.get((int) var3);
				if (var1.int0 != var24.modelxof || var1.int1 != var24.modelyof || var1.int2 != var24.modelangle_z) {
					var24.modelxof = var1.int0;
					var24.modelyof = var1.int1;
					var24.modelangle_z = var1.int2;
					requestRedrawComponent(var24);
				}
			} else if (var2 == 11) {
				Component var25 = Component.get((int) var3);
				var25.xmode = 0;
				var25.x = var25.xpos = var1.int0;
				var25.ymode = 0;
				var25.y = var25.ypos = var1.int1;
				requestRedrawComponent(var25);
			} else if (var2 == 12) {
				Component var26 = Component.get((int) var3);
				int var27 = var1.int0;
				if (var26 != null && var26.type == 0) {
					if (var27 > var26.scrollheight - var26.height) {
						var27 = var26.scrollheight - var26.height;
					}
					if (var27 < 0) {
						var27 = 0;
					}
					if (var26.scrolly != var27) {
						var26.scrolly = var27;
						requestRedrawComponent(var26);
					}
				}
			} else if (var2 == 13) {
				Component var28 = Component.get((int) var3);
				var28.graphic = var1.int0;
			} else if (var2 == 14) {
				MiniMap.mapFlag = true;
				MiniMap.flagSceneTileX = var1.int0;
				MiniMap.flagSceneTileZ = var1.int1;
			} else if (var2 == 15) {
				Component var29 = Component.get((int) var3);
				var29.textfont = var1.int0;
			} else if (var2 == 21) {
				Component var30 = Component.get((int) var3);
				var30.fontmono = var1.int0 == 1;
			} else if (var2 == 22) {
				Component var31 = Component.get((int) var3);
				var31.clickmask = var1.int0 == 1;
			} else if (var2 == 17) {
				Component var32 = Component.get((int) var3);
				int var33 = (int) (var3 >> 32);
				var32.setrecol(var33, (short) var1.int0, (short) var1.int1);
			} else if (var2 == 20) {
				Component var34 = Component.get((int) var3);
				int var35 = (int) (var3 >> 32);
				var34.setretex(var35, (short) var1.int0, (short) var1.int1);
			}
		}
	}

	@ObfuscatedName("dt.fh(I)V")
	public static final void method1680() {
		MiniMap.method16903(toolkit);
		if (currentPlayerLevel != field11046) {
			method3128();
		}
	}

	@ObfuscatedName("l.fr(B)V")
	public static final void updateEntityChats() {
		int[] var0 = ReceivePlayerPositions.highResolutionsIndices;
		for (int var1 = 0; var1 < ReceivePlayerPositions.highResolutionsCount; var1++) {
			PlayerEntity var2 = players[var0[var1]];
			if (var2 != null) {
				var2.removeChatLine();
			}
		}
		for (int var3 = 0; var3 < npcSlotCount; var3++) {
			long var4 = (long) field11036[var3];
			ObjectNode var6 = (ObjectNode) npcs.get(var4);
			if (var6 != null) {
				((PathingEntity) var6.value).removeChatLine();
			}
		}
		if (sceneState != 0) {
			return;
		}
		for (int var7 = 0; var7 < CutsceneManager.entities.length; var7++) {
			CutsceneEntity var8 = CutsceneManager.entities[var7];
			if (var8.exists) {
				var8.getEntity().removeChatLine();
			}
		}
	}

	@ObfuscatedName("yj.gu(IIIB)V")
	public static final void jtele(int arg0, int arg1, int arg2) {
		String var3 = "tele " + arg0 + TextUtil.COMMA + (arg1 >> 6) + TextUtil.COMMA + (arg2 >> 6) + TextUtil.COMMA + (arg1 & 0x3F) + TextUtil.COMMA + (arg2 & 0x3F);
		System.out.println(var3);
		DeveloperConsole.doCheat(var3, true, false);
	}

	@ObfuscatedName("ahn.gq(I)[Laal;")
	public static FullscreenMode[] getFullscreenModes() {
		if (field8871 == null) {
			FullscreenMode[] var0 = Fullscreen.getFullscreenModes(GameShell.fsimp14);
			FullscreenMode[] var1 = new FullscreenMode[var0.length];
			int var2 = 0;
			int var3 = preferences.screenSize.getValue();
			label71: for (int var4 = 0; var4 < var0.length; var4++) {
				FullscreenMode var5 = var0[var4];
				if ((var5.bitDepth <= 0 || var5.bitDepth >= 24) && var5.width >= 800 && var5.height >= 600 && (var3 != 2 || var5.width <= 800 && var5.height <= 600) && (var3 != 1 || var5.width <= 1024 && var5.height <= 768)) {
					for (int var6 = 0; var6 < var2; var6++) {
						FullscreenMode var7 = var1[var6];
						if (var5.width == var7.width && var5.height == var7.height) {
							if (var5.bitDepth > var7.bitDepth) {
								var1[var6] = var5;
							}
							continue label71;
						}
					}
					var1[var2] = var5;
					var2++;
				}
			}
			field8871 = new FullscreenMode[var2];
			System.arraycopy(var1, 0, field8871, 0, var2);
			int[] var8 = new int[field8871.length];
			for (int var9 = 0; var9 < field8871.length; var9++) {
				FullscreenMode var10 = field8871[var9];
				var8[var9] = var10.height * var10.width;
			}
			Algorithms.quickSortParallel(var8, field8871);
		}
		return field8871;
	}

	@ObfuscatedName("wa.gl(I)V")
	public static final void applyCameraMoveAlong() {
		if (field10904 == -1 || field10908 == -1) {
			return;
		}
		int var0 = (field10976 * (field10913 - field10843) >> 16) + field10843;
		field10976 += var0;
		if (field10976 >= 65535) {
			field10976 = 65535;
			if (field10969) {
				field10813 = false;
			} else {
				field10813 = true;
			}
			field10969 = true;
		} else {
			field10813 = false;
			field10969 = false;
		}
		float var1 = (float) field10976 / 65535.0F;
		float[] var2 = new float[3];
		int var3 = field10909 * 4;
		for (int var4 = 0; var4 < 3; var4++) {
			int var5 = cutsceneSpline[field10904][var3][var4] * 3;
			int var6 = cutsceneSpline[field10904][var3 + 1][var4] * 3;
			int var7 = (cutsceneSpline[field10904][var3 + 2][var4] - (cutsceneSpline[field10904][var3 + 3][var4] - cutsceneSpline[field10904][var3 + 2][var4])) * 3;
			int var8 = cutsceneSpline[field10904][var3][var4];
			int var9 = var6 - var5;
			int var10 = var5 - var6 * 2 + var7;
			int var11 = cutsceneSpline[field10904][var3 + 2][var4] - var8 + var6 - var7;
			var2[var4] = (((float) var11 * var1 + (float) var10) * var1 + (float) var9) * var1 + (float) var8;
		}
		CoordGrid var12 = world.getBase();
		cameraX = (int) var2[0] - var12.x * 512;
		cameraY = (int) var2[1] * -1;
		cameraZ = (int) var2[2] - var12.z * 512;
		float[] var13 = new float[3];
		int var14 = field10932 * 2;
		for (int var15 = 0; var15 < 3; var15++) {
			int var16 = cutsceneSpline[field10908][var14][var15] * 3;
			int var17 = cutsceneSpline[field10908][var14 + 1][var15] * 3;
			int var18 = (cutsceneSpline[field10908][var14 + 2][var15] - (cutsceneSpline[field10908][var14 + 3][var15] - cutsceneSpline[field10908][var14 + 2][var15])) * 3;
			int var19 = cutsceneSpline[field10908][var14][var15];
			int var20 = var17 - var16;
			int var21 = var16 - var17 * 2 + var18;
			int var22 = cutsceneSpline[field10908][var14 + 2][var15] - var19 + var17 - var18;
			var13[var15] = (((float) var22 * var1 + (float) var21) * var1 + (float) var20) * var1 + (float) var19;
		}
		float var23 = var13[0] - var2[0];
		float var24 = (var13[1] - var2[1]) * -1.0F;
		float var25 = var13[2] - var2[2];
		double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
		cameraPitch = (int) (Math.atan2((double) var24, var26) * 2607.5945876176133D) & 0x3FFF;
		cameraYaw = (int) (-Math.atan2((double) var23, (double) var25) * 2607.5945876176133D) & 0x3FFF;
		cameraRoll = (field10976 * (cutsceneSpline[field10904][var3 + 2][3] - cutsceneSpline[field10904][var3][3]) >> 16) + cutsceneSpline[field10904][var3][3];
	}

	@ObfuscatedName("amf.go(B)V")
	public static final void applyCameraCutscene() {
		int var0 = cameraMoveX * 512 + 256;
		int var1 = cameraMoveZ * 512 + 256;
		int var2 = getHeightmapY(var0, var1, currentPlayerLevel) - cameraSrcHeight;
		if (cameraMoveSpeed >= 100) {
			cameraX = cameraMoveX * 512 + 256;
			cameraZ = cameraMoveZ * 512 + 256;
			cameraY = getHeightmapY(cameraX, cameraZ, currentPlayerLevel) - cameraSrcHeight;
		} else {
			if (cameraX < var0) {
				cameraX += cameraMoveSpeed * (var0 - cameraX) / 1000 + cameraMoveAcceleration;
				if (cameraX > var0) {
					cameraX = var0;
				}
			}
			if (cameraX > var0) {
				cameraX -= cameraMoveSpeed * (cameraX - var0) / 1000 + cameraMoveAcceleration;
				if (cameraX < var0) {
					cameraX = var0;
				}
			}
			if (cameraY < var2) {
				cameraY += cameraMoveSpeed * (var2 - cameraY) / 1000 + cameraMoveAcceleration;
				if (cameraY > var2) {
					cameraY = var2;
				}
			}
			if (cameraY > var2) {
				cameraY -= cameraMoveSpeed * (cameraY - var2) / 1000 + cameraMoveAcceleration;
				if (cameraY < var2) {
					cameraY = var2;
				}
			}
			if (cameraZ < var1) {
				cameraZ += cameraMoveSpeed * (var1 - cameraZ) / 1000 + cameraMoveAcceleration;
				if (cameraZ > var1) {
					cameraZ = var1;
				}
			}
			if (cameraZ > var1) {
				cameraZ -= cameraMoveSpeed * (cameraZ - var1) / 1000 + cameraMoveAcceleration;
				if (cameraZ < var1) {
					cameraZ = var1;
				}
			}
		}
		int var3 = cameraLookX * 512 + 256;
		int var4 = cameraLookZ * 512 + 256;
		int var5 = getHeightmapY(var3, var4, currentPlayerLevel) - field1983;
		int var6 = var3 - cameraX;
		int var7 = var5 - cameraY;
		int var8 = var4 - cameraZ;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 2607.5945876176133D) & 0x3FFF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -2607.5945876176133D) & 0x3FFF;
		if (var10 < 1024) {
			var10 = 1024;
		}
		if (var10 > 3072) {
			var10 = 3072;
		}
		if (cameraPitch < var10) {
			cameraPitch += (var10 - cameraPitch >> 3) * cameraRotateSpeed / 1000 + cameraRotateAcceleration << 3;
			if (cameraPitch > var10) {
				cameraPitch = var10;
			}
		}
		if (cameraPitch > var10) {
			cameraPitch -= (cameraPitch - var10 >> 3) * cameraRotateSpeed / 1000 + cameraRotateAcceleration << 3;
			if (cameraPitch < var10) {
				cameraPitch = var10;
			}
		}
		int var12 = var11 - cameraYaw;
		if (var12 > 8192) {
			var12 -= 16384;
		}
		if (var12 < -8192) {
			var12 += 16384;
		}
		int var13 = var12 >> 3;
		if (var13 > 0) {
			cameraYaw += cameraRotateSpeed * var13 / 1000 + cameraRotateAcceleration << 3;
			cameraYaw &= 0x3FFF;
		}
		if (var13 < 0) {
			cameraYaw -= cameraRotateSpeed * -var13 / 1000 + cameraRotateAcceleration << 3;
			cameraYaw &= 0x3FFF;
		}
		int var14 = var11 - cameraYaw;
		if (var14 > 8192) {
			var14 -= 16384;
		}
		if (var14 < -8192) {
			var14 += 16384;
		}
		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			cameraYaw = var11;
		}
		cameraRoll = 0;
	}

	@ObfuscatedName("yn.gk(II)V")
	public static final void method10490(int arg0) {
		int var1 = loopCycle - field10899;
		if (var1 >= 100) {
			Client.cameraState = getDefaultCameraState();
			field3538 = -1;
			field810 = -1;
			return;
		}
		float var2 = 1.0F - (float) ((100 - var1) * (100 - var1) * (100 - var1)) / 1000000.0F;
		int var5;
		if (getDefaultCameraState() == 3) {
			CoordFine var3 = cam2.getPosition().method5221();
			CoordGrid var4 = world.getBase();
			cameraPitch = (int) ((double) cam2.method4718() * 2607.5945876176133D) & 0x3FFF;
			cameraYaw = (int) ((double) cam2.method4719() * -2607.5945876176133D) & 0x3FFF;
			cameraRoll = 0;
			field11078 = (int) ((float) field7286 + (float) ((int) ((double) viewportWidth / (Math.tan((double) (cam2.method4784() / 2.0F)) * 4.0D)) - field7286) * var2);
			cameraX = (int) ((float) (var3.x - var4.x * 512 - field9214) * var2 + (float) field9214);
			cameraY = (int) ((float) (-var3.y - field4857) * var2 + (float) field4857);
			cameraZ = (int) ((float) (var3.z - var4.z * 512 - field7231) * var2 + (float) field7231);
			var5 = -cameraYaw - field8720 & 0x3FFF;
			if (var5 > 8192) {
				var5 -= 16384;
			} else if (var5 < -8192) {
				var5 += 16384;
			}
		} else {
			int pitch = (int) orbitCameraPitch;
			if (cameraPitchClamp >> 8 > pitch) {
				pitch = cameraPitchClamp >> 8;
			}
			if (cameraModifierEnabled[4] && cameraModifierWobbleScale[4] + 128 > pitch) {
				pitch = cameraModifierWobbleScale[4] + 128;
			}
			int yaw = cameraAnticheatAngle + (int) orbitCameraYaw & 0x3FFF;
			Vector3 var8 = localPlayerEntity.getTransform().trans;
			orbitCamera(orbitCameraX, getHeightmapY((int) var8.x, (int) var8.z, currentPlayerLevel) - cameraFollowHeight, orbitCameraZ, pitch, yaw, (pitch >> 3) * 3 + 600 << 2, arg0);
			cameraX = (int) ((float) (cameraX - field9214) * var2 + (float) field9214);
			cameraY = (int) ((float) (cameraY - field4857) * var2 + (float) field4857);
			cameraZ = (int) ((float) (cameraZ - field7231) * var2 + (float) field7231);
			cameraPitch = (int) ((float) (cameraPitch - field1267) * var2 + (float) field1267);
			var5 = cameraYaw - field8720;
			if (var5 > 8192) {
				var5 -= 16384;
			} else if (var5 < -8192) {
				var5 += 16384;
			}
		}
		cameraYaw = (int) ((float) var5 * var2 + (float) field8720);
		cameraYaw &= 0x3FFF;
		field11078 = (int) ((float) (field11078 - field7286) * var2 + (float) field7286);
	}

	@ObfuscatedName("a.gp(J)V")
	public static final void method614(long arg0) {
		Vector3 var2 = localPlayerEntity.getTransform().trans;
		int var3 = cameraAnticheatOffsetX + (int) var2.x;
		int var4 = cameraAnticheatOffsetZ + (int) var2.z;
		if (orbitCameraX - var3 < -2000 || orbitCameraX - var3 > 2000 || orbitCameraZ - var4 < -2000 || orbitCameraZ - var4 > 2000) {
			orbitCameraX = var3;
			orbitCameraZ = var4;
		}
		if (orbitCameraX != var3) {
			int var5 = var3 - orbitCameraX;
			int var6 = (int) ((long) var5 * arg0 / 320L);
			if (var5 > 0) {
				if (var6 == 0) {
					var6 = 1;
				} else if (var6 > var5) {
					var6 = var5;
				}
			} else if (var6 == 0) {
				var6 = -1;
			} else if (var6 < var5) {
				var6 = var5;
			}
			orbitCameraX += var6;
		}
		if (orbitCameraZ != var4) {
			int var7 = var4 - orbitCameraZ;
			int var8 = (int) ((long) var7 * arg0 / 320L);
			if (var7 > 0) {
				if (var8 == 0) {
					var8 = 1;
				} else if (var8 > var7) {
					var8 = var7;
				}
			} else if (var8 == 0) {
				var8 = -1;
			} else if (var8 < var7) {
				var8 = var7;
			}
			orbitCameraZ += var8;
		}
		orbitCameraYaw += (float) arg0 * field10896 / 6.0F;
		orbitCameraPitch += (float) arg0 * field10897 / 6.0F;
		method14884();
	}

	@ObfuscatedName("fw.gy(J)V")
	public static final void method3093(long arg0) {
		int var2 = field10892;
		int var3 = field10893;
		if (orbitCameraX != var2) {
			int var4 = var2 - orbitCameraX;
			int var5 = (int) ((long) var4 * arg0 / 320L);
			if (var4 > 0) {
				if (var5 == 0) {
					var5 = 1;
				} else if (var5 > var4) {
					var5 = var4;
				}
			} else if (var5 == 0) {
				var5 = -1;
			} else if (var5 < var4) {
				var5 = var4;
			}
			orbitCameraX += var5;
		}
		if (orbitCameraZ != var3) {
			int var6 = var3 - orbitCameraZ;
			int var7 = (int) ((long) var6 * arg0 / 320L);
			if (var6 > 0) {
				if (var7 == 0) {
					var7 = 1;
				} else if (var7 > var6) {
					var7 = var6;
				}
			} else if (var7 == 0) {
				var7 = -1;
			} else if (var7 < var6) {
				var7 = var6;
			}
			orbitCameraZ += var7;
		}
		orbitCameraYaw += (float) arg0 * field10896 / 40.0F * 8.0F;
		orbitCameraPitch += (float) arg0 * field10897 / 40.0F * 8.0F;
		method14884();
	}

	@ObfuscatedName("gd.ga(B)V")
	public static final void cameraIncX() {
		if (!field10898) {
			field10897 += (12.0F - field10897) / 2.0F;
			field10902 = true;
			field10898 = true;
		}
	}

	@ObfuscatedName("aai.gn(I)V")
	public static final void cameraDecX() {
		if (!field10898) {
			field10897 += (-12.0F - field10897) / 2.0F;
			field10902 = true;
			field10898 = true;
		}
	}

	@ObfuscatedName("yc.gc(I)V")
	public static final void cameraIncY() {
		if (!field11059) {
			field10896 += (24.0F - field10896) / 2.0F;
			field10902 = true;
			field11059 = true;
		}
	}

	@ObfuscatedName("hf.gf(B)V")
	public static final void cameraDecY() {
		if (!field11059) {
			field10896 += (-24.0F - field10896) / 2.0F;
			field10902 = true;
			field11059 = true;
		}
	}

	@ObfuscatedName("je.gx(IIII)V")
	public static void cameraForceAngle(int arg0, int arg1, int arg2) {
		int var3 = arg0 << 3;
		int var4 = arg1 << 3;
		int var5 = arg2 << 3;
		if (Client.cameraState != 3) {
			orbitCameraPitch = var3;
			orbitCameraYaw = var4;
			if (Client.cameraState == 5) {
				cameraPitch = var3;
				cameraYaw = var4;
				cameraRoll = var5;
			}
			method14884();
		} else if (cam2.getPositionMode() == PositionMode.ENTITY) {
			PositionEntity var6 = (PositionEntity) cam2.getPosition();
			Quaternion var7 = new Quaternion();
			Quaternion var8 = new Quaternion();
			var7.setToRotation(0.0F, 1.0F, 0.0F, 3.1415927F - (float) ((double) var4 * 3.141592653589793D * 2.0D / 16384.0D));
			Vector3 var9 = new Vector3(1.0F, 0.0F, 0.0F);
			var9.rotate(var7);
			var9.negate();
			var8.setToRotation(var9, (float) ((double) var3 * 3.141592653589793D * 2.0D) / 16384.0F);
			var7.multiply(var8);
			var6.field10554.setTo(var7);
		}
		field10902 = true;
	}

	@ObfuscatedName("abx.ge(B)V")
	public static final void method14884() {
		if (orbitCameraPitch < 1077.0F) {
			orbitCameraPitch = 1077.0F;
		}
		if (orbitCameraPitch > 2787.0F) {
			orbitCameraPitch = 2787.0F;
		}
		while (orbitCameraYaw >= 16384.0F) {
			orbitCameraYaw -= 16384.0F;
		}
		while (orbitCameraYaw < 0.0F) {
			orbitCameraYaw += 16384.0F;
		}
		SceneLevelTileFlags var0 = world.getSceneLevelTileFlags();
		Scene var1 = world.getScene();
		int var2 = orbitCameraX >> 9;
		int var3 = orbitCameraZ >> 9;
		int var4 = getHeightmapY(orbitCameraX, orbitCameraZ, currentPlayerLevel);
		int var5 = 0;
		if (var2 > 3 && var3 > 3 && var2 < world.getSizeX() - 4 && var3 < world.getSizeZ() - 4) {
			for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					int var8 = currentPlayerLevel;
					if (var8 < 3 && var0.isLinkBelow(var6, var7)) {
						var8++;
					}
					int var9 = 0;
					byte[][] var10 = world.method7736(var8);
					if (var10 != null) {
						var9 = (var10[var6][var7] & 0xFF) * 8 << 2;
					}
					if (var1.levelHeightmaps != null && var1.levelHeightmaps[var8] != null) {
						int var11 = var4 - (var1.levelHeightmaps[var8].getTileHeight(var6, var7) - var9);
						if (var11 > var5) {
							var5 = var11;
						}
					}
				}
			}
		}
		int var12 = (var5 >> 2) * 1536;
		if (var12 > 786432) {
			var12 = 786432;
		}
		if (var12 < 262144) {
			var12 = 262144;
		}
		if (var12 > cameraPitchClamp) {
			cameraPitchClamp += (var12 - cameraPitchClamp) / 24;
		} else if (var12 < cameraPitchClamp) {
			cameraPitchClamp += (var12 - cameraPitchClamp) / 80;
		}
	}

	@ObfuscatedName("afg.gg(IIIIIZI)V")
	public static final void cameraMoveTo(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		cameraMoveX = arg0;
		cameraMoveZ = arg1;
		cameraSrcHeight = arg2;
		cameraMoveAcceleration = arg3;
		cameraMoveSpeed = arg4;
		if (Client.cameraState == 3) {
			method9025();
		}
		if (arg5 && cameraMoveSpeed >= 100) {
			cameraX = cameraMoveX * 512 + 256;
			cameraZ = cameraMoveZ * 512 + 256;
			cameraY = getHeightmapY(cameraX, cameraZ, currentPlayerLevel) - cameraSrcHeight;
		}
		Client.cameraState = 5;
		field3538 = -1;
		field810 = -1;
	}

	@ObfuscatedName("abb.gr(IIIIIB)V")
	public static final void cameraLookAt(int arg0, int arg1, int arg2, int arg3, int arg4) {
		cameraLookX = arg0;
		cameraLookZ = arg1;
		field1983 = arg2;
		cameraRotateAcceleration = arg3;
		cameraRotateSpeed = arg4;
		if (Client.cameraState == 3) {
			method9025();
		}
		if (cameraRotateSpeed >= 100) {
			int var5 = cameraLookX * 512 + 256;
			int var6 = cameraLookZ * 512 + 256;
			int var7 = getHeightmapY(var5, var6, currentPlayerLevel) - field1983;
			int var8 = var5 - cameraX;
			int var9 = var7 - cameraY;
			int var10 = var6 - cameraZ;
			int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
			cameraPitch = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
			cameraYaw = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 0x3FFF;
			cameraRoll = 0;
			if (cameraPitch < 1024) {
				cameraPitch = 1024;
			}
			if (cameraPitch > 3072) {
				cameraPitch = 3072;
			}
		}
		Client.cameraState = 5;
		field3538 = -1;
		field810 = -1;
	}

	@ObfuscatedName("hs.gs(II)V")
	public static final void cameraReset(int state) {
		for (int index = 0; index < 5; index++) {
			cameraModifierEnabled[index] = false;
		}
		field10904 = -1;
		field10908 = -1;
		cameraRotateAcceleration = 0;
		cameraRotateSpeed = 0;
		field3538 = -1;
		field810 = -1;
		Client.cameraState = state;
		if (Client.cameraState != 3) {
			field637 = 0L;
		}
	}

	@ObfuscatedName("gv.gt(B)V")
	public static final void cameraSmoothReset() {
		for (int var0 = 0; var0 < 5; var0++) {
			cameraModifierEnabled[var0] = false;
		}
		field10904 = -1;
		field10908 = -1;
		cameraRotateAcceleration = 0;
		cameraRotateSpeed = 0;
		Client.cameraState = 1;
		if (getDefaultCameraState() == 3) {
			CoordGrid var1 = world.getBase();
			int var2 = var1.x << 9;
			int var3 = var1.z << 9;
			int var4 = 1000 / GameShell.getLogicRate();
			cam2.update((float) var4 / 1000.0F, world.method7744().levelHeightmap, world.getSceneLevelTileFlags(), var2, var3);
		}
		field3538 = -1;
		field810 = -1;
		field10899 = loopCycle;
		field9214 = cameraX;
		field4857 = cameraY;
		field7231 = cameraZ;
		field1267 = cameraPitch;
		field8720 = cameraYaw;
		field7286 = field11078;
	}

	@ObfuscatedName("uf.gh(S)V")
	public static final void method9025() {
		CoordGrid var0 = world.getBase();
		Vector3 var1 = cam2.method4714();
		cameraX = (int) var1.x - (var0.x << 9);
		cameraY = -((int) var1.y);
		cameraZ = (int) var1.z - (var0.z << 9);
		cameraPitch = (int) ((double) cam2.method4718() * 2607.5945876176133D) & 0x3FFF;
		cameraYaw = (int) ((double) cam2.method4719() * 2607.5945876176133D) & 0x3FFF;
		cameraRoll = 0;
	}

	@ObfuscatedName("vb.gm(B)V")
	public static final void updatePlayers() {
		int var0 = ReceivePlayerPositions.highResolutionsCount;
		int[] var1 = ReceivePlayerPositions.highResolutionsIndices;
		for (int var2 = 0; var2 < var0; var2++) {
			PlayerEntity var3 = players[var1[var2]];
			if (var3 != null) {
				updateEntity(var3, false);
			}
		}
	}

	@ObfuscatedName("afj.gv(I)V")
	public static final void updateNpcs() {
		for (int var0 = 0; var0 < npcSlotCount; var0++) {
			int var1 = field11036[var0];
			ObjectNode var2 = (ObjectNode) npcs.get((long) var1);
			if (var2 != null) {
				NpcEntity var3 = (NpcEntity) var2.value;
				updateEntity(var3, false);
			}
		}
	}

	@ObfuscatedName("dt.gj(Lahm;ZB)V")
	public static final void updateEntity(PathingEntity entity, boolean arg1) {
		int var2 = MoveSpeed.STATIONARY.serialID;
		int var3 = 0;
		if (entity.forceMoveEndCycle > loopCycle) {
			updateForceMovement(entity);
		} else if (entity.forceMoveStartCycle >= loopCycle) {
			startForceMovement(entity);
		} else {
			updateMovement(entity, arg1);
			var2 = field1891;
			var3 = field1797;
		}
		Vector3 var4 = entity.getTransform().trans;
		if ((int) var4.x < 512 || (int) var4.z < 512 || (int) var4.x >= (world.getSizeX() - 1) * 512 || (int) var4.z >= (world.getSizeZ() - 1) * 512) {
			entity.field10454.method14362(-1);
			for (int var5 = 0; var5 < entity.spotAnims.length; var5++) {
				entity.spotAnims[var5].field6657 = -1;
				entity.spotAnims[var5].field6659.method14362(-1);
			}
			entity.field10427 = null;
			entity.forceMoveEndCycle = 0;
			entity.forceMoveStartCycle = 0;
			var2 = MoveSpeed.STATIONARY.serialID;
			var3 = 0;
			entity.setPosition((float) (entity.routeWaypointX[0] * 512 + entity.size() * 256), var4.y, (float) (entity.routeWaypointZ[0] * 512 + entity.size() * 256));
			entity.method16517();
		}
		if (localPlayerEntity == entity && ((int) var4.x < 6144 || (int) var4.z < 6144 || (int) var4.x >= (world.getSizeX() - 12) * 512 || (int) var4.z >= (world.getSizeZ() - 12) * 512)) {
			entity.field10454.method14362(-1);
			for (int var6 = 0; var6 < entity.spotAnims.length; var6++) {
				entity.spotAnims[var6].field6657 = -1;
				entity.spotAnims[var6].field6659.method14362(-1);
			}
			entity.field10427 = null;
			entity.forceMoveEndCycle = 0;
			entity.forceMoveStartCycle = 0;
			var2 = MoveSpeed.STATIONARY.serialID;
			var3 = 0;
			entity.setPosition((float) (entity.routeWaypointX[0] * 512 + entity.size() * 256), var4.y, (float) (entity.routeWaypointZ[0] * 512 + entity.size() * 256));
			entity.method16517();
		}
		int var7 = method14063(entity);
		method10222(entity);
		updateWalkAnim(entity, var2, var3, var7);
		updateMainAnim(entity, var2);
		updateSpotAnim(entity);
		Quaternion var8 = Quaternion.create();
		var8.setToRotation(Trig1.radians(entity.field10395.method316()), Trig1.radians(entity.field10413.method316()), Trig1.radians(entity.field10447.method316()));
		entity.setRotation(var8);
		var8.release();
	}

	@ObfuscatedName("aar.gw(Lahm;S)V")
	public static final void updateForceMovement(PathingEntity arg0) {
		int var1 = arg0.forceMoveEndCycle - loopCycle;
		int var2 = arg0.forceMoveStartSceneTileX * 512 + arg0.size() * 256;
		int var3 = arg0.forceMoveStartSceneTileZ * 512 + arg0.size() * 256;
		int var4 = getHeightmapY(var2, var3, arg0.field10419);
		Vector3 var5 = arg0.getTransform().trans;
		arg0.setPosition((float) ((var2 - (int) var5.x) / var1 + (int) var5.x), (float) ((var4 - (int) var5.y) / var1 + (int) var5.y), (float) ((var3 - (int) var5.z) / var1 + (int) var5.z));
		arg0.seqTrigger = 0;
		arg0.method16490(arg0.field10431);
	}

	@ObfuscatedName("kw.gd(Lahm;I)V")
	public static final void startForceMovement(PathingEntity arg0) {
		AnimationNode var1 = arg0.field10454;
		if (arg0.forceMoveStartCycle == loopCycle || !var1.hasSeqType() || var1.method14369(1)) {
			int var2 = arg0.forceMoveStartCycle - arg0.forceMoveEndCycle;
			int var3 = loopCycle - arg0.forceMoveEndCycle;
			int var4 = arg0.forceMoveStartSceneTileX * 512 + arg0.size() * 256;
			int var5 = arg0.forceMoveStartSceneTileZ * 512 + arg0.size() * 256;
			int var6 = arg0.forceMoveEndSceneTileX * 512 + arg0.size() * 256;
			int var7 = arg0.forceMoveEndSceneTileZ * 512 + arg0.size() * 256;
			int var8 = ((var2 - var3) * var4 + var3 * var6) / var2;
			int var9 = ((var2 - var3) * var5 + var3 * var7) / var2;
			int var10 = getHeightmapY(var8, var9, arg0.field10419);
			int var11 = getHeightmapY(var6, var7, arg0.field10428);
			int var12 = ((var2 - var3) * var10 + var3 * var11) / var2;
			arg0.setPosition((float) var8, (float) var12, (float) var9);
		}
		arg0.seqTrigger = 0;
		arg0.method16491(arg0.field10431, false);
	}

	@ObfuscatedName("aco.gz(Lahm;ZI)V")
	public static final void updateMovement(PathingEntity arg0, boolean arg1) {
		BASType var2 = arg0.getBASType();
		if (arg0.routeLength == 0) {
			arg0.seqTrigger = 0;
			field1891 = MoveSpeed.STATIONARY.serialID;
			field1797 = 0;
			return;
		}
		if (arg0.field10454.hasSeqType() && !arg0.field10454.method14355()) {
			SeqType var3 = arg0.field10454.getSeqType();
			if (arg0.field10396 > 0 && var3.field1767 == 0) {
				arg0.seqTrigger++;
				field1891 = MoveSpeed.STATIONARY.serialID;
				field1797 = 0;
				return;
			}
			if (arg0.field10396 <= 0 && var3.field1782 == 0) {
				arg0.seqTrigger++;
				field1891 = MoveSpeed.STATIONARY.serialID;
				field1797 = 0;
				return;
			}
		}
		for (int var4 = 0; var4 < arg0.spotAnims.length; var4++) {
			if (arg0.spotAnims[var4].field6657 != -1 && arg0.spotAnims[var4].field6659.method14355()) {
				EffectAnimType var5 = (EffectAnimType) effectAnimTypeList.list(arg0.spotAnims[var4].field6657);
				if (var5.field8261 && var5.anim != -1) {
					SeqType var6 = (SeqType) seqTypeList.list(var5.anim);
					if (arg0.field10396 > 0 && var6.field1767 == 0) {
						arg0.seqTrigger++;
						field1891 = MoveSpeed.STATIONARY.serialID;
						field1797 = 0;
						return;
					}
					if (arg0.field10396 <= 0 && var6.field1782 == 0) {
						arg0.seqTrigger++;
						field1891 = MoveSpeed.STATIONARY.serialID;
						field1797 = 0;
						return;
					}
				}
			}
		}
		Vector3 var7 = Vector3.create(arg0.getTransform().trans);
		int var8 = (int) var7.x;
		int var9 = (int) var7.z;
		int var10 = arg0.routeWaypointX[arg0.routeLength - 1] * 512 + arg0.size() * 256;
		int var11 = arg0.routeWaypointZ[arg0.routeLength - 1] * 512 + arg0.size() * 256;
		if (var8 < var10) {
			if (var9 < var11) {
				arg0.method16490(10240);
			} else if (var9 > var11) {
				arg0.method16490(14336);
			} else {
				arg0.method16490(12288);
			}
		} else if (var8 > var10) {
			if (var9 < var11) {
				arg0.method16490(6144);
			} else if (var9 > var11) {
				arg0.method16490(2048);
			} else {
				arg0.method16490(4096);
			}
		} else if (var9 < var11) {
			arg0.method16490(8192);
		} else if (var9 > var11) {
			arg0.method16490(0);
		}
		byte var12 = arg0.routeSpeeds[arg0.routeLength - 1];
		if (!arg1 && (var10 - var8 > 1024 || var10 - var8 < -1024 || var11 - var9 > 1024 || var11 - var9 < -1024)) {
			arg0.setPosition((float) var10, var7.y, (float) var11);
			arg0.method16491(arg0.field10414, false);
			arg0.routeLength--;
			if (arg0.field10396 > 0) {
				arg0.field10396--;
			}
			field1891 = MoveSpeed.STATIONARY.serialID;
			field1797 = 0;
			var7.release();
			return;
		}
		int moveSpeed = 16;
		boolean var14 = true;
		if (arg0 instanceof NpcEntity) {
			var14 = ((NpcEntity) arg0).npcType.walksmoothing;
		}
		if (var14) {
			int var15 = arg0.field10414 - arg0.field10395.field528;
			if (var15 != 0 && arg0.targetId == -1 && arg0.field10444 != 0) {
				moveSpeed = 8;
			}
			if (!arg1 && arg0.routeLength > 2) {
				moveSpeed = 24;
			}
			if (!arg1 && arg0.routeLength > 3) {
				moveSpeed = 32;
			}
		} else {
			if (!arg1 && arg0.routeLength > 1) {
				moveSpeed = 24;
			}
			if (!arg1 && arg0.routeLength > 2) {
				moveSpeed = 32;
			}
		}
		if (arg0.seqTrigger > 0 && arg0.routeLength > 1) {
			moveSpeed = 32;
			arg0.seqTrigger--;
		}
		if (MoveSpeed.RUN.serialID == var12) {
			moveSpeed <<= 0x1;
		} else if (MoveSpeed.CRAWL.serialID == var12) {
			moveSpeed >>= 0x1;
		}
		if (var2.walkspeed != -1) {
			int var16 = moveSpeed << 9;
			if (arg0.routeLength == 1) {
				int var17 = arg0.field10455 * arg0.field10455;
				int var18 = ((int) var7.x > var10 ? (int) var7.x - var10 : var10 - (int) var7.x) << 9;
				int var19 = ((int) var7.z > var11 ? (int) var7.z - var11 : var11 - (int) var7.z) << 9;
				int var20 = var18 > var19 ? var18 : var19;
				int var21 = var2.walkspeed * 2 * var20;
				if (var17 > var21) {
					arg0.field10455 /= 2;
				} else if (var17 / 2 > var20) {
					arg0.field10455 -= var2.walkspeed;
					if (arg0.field10455 < 0) {
						arg0.field10455 = 0;
					}
				} else if (arg0.field10455 < var16) {
					arg0.field10455 += var2.walkspeed;
					if (arg0.field10455 > var16) {
						arg0.field10455 = var16;
					}
				}
			} else if (arg0.field10455 < var16) {
				arg0.field10455 += var2.walkspeed;
				if (arg0.field10455 > var16) {
					arg0.field10455 = var16;
				}
			} else if (arg0.field10455 > 0) {
				arg0.field10455 -= var2.walkspeed;
				if (arg0.field10455 < 0) {
					arg0.field10455 = 0;
				}
			}
			moveSpeed = arg0.field10455 >> 9;
			if (moveSpeed < 1) {
				moveSpeed = 1;
			}
		}
		field1797 = 0;
		if (var8 == var10 && var9 == var11) {
			field1891 = MoveSpeed.STATIONARY.serialID;
		} else {
			if (var8 < var10) {
				var7.x += moveSpeed;
				field1797 |= 0x4;
				if (var7.x > (float) var10) {
					var7.x = var10;
				}
			} else if (var8 > var10) {
				var7.x -= moveSpeed;
				field1797 |= 0x8;
				if (var7.x < (float) var10) {
					var7.x = var10;
				}
			}
			if (var9 < var11) {
				var7.z += moveSpeed;
				field1797 |= 0x1;
				if (var7.z > (float) var11) {
					var7.z = var11;
				}
			} else if (var9 > var11) {
				var7.z -= moveSpeed;
				field1797 |= 0x2;
				if (var7.z < (float) var11) {
					var7.z = var11;
				}
			}
			arg0.method10531(var7);
			if (moveSpeed >= 32) {
				field1891 = MoveSpeed.RUN.serialID;
			} else {
				field1891 = var12;
			}
		}
		if ((int) var7.x == var10 && (int) var7.z == var11) {
			arg0.routeLength--;
			if (arg0.field10396 > 0) {
				arg0.field10396--;
			}
		}
		var7.release();
	}

	@ObfuscatedName("zx.gb(Lahm;B)I")
	public static final int method14063(PathingEntity arg0) {
		if (arg0.field10444 == 0) {
			return 0;
		}
		if (arg0.targetId != -1) {
			PathingEntity var1 = null;
			if (arg0.targetId < 32768) {
				ObjectNode var2 = (ObjectNode) npcs.get((long) arg0.targetId);
				if (var2 != null) {
					var1 = (PathingEntity) var2.value;
				}
			} else if (arg0.targetId >= 32768) {
				var1 = players[arg0.targetId - 32768];
			}
			if (var1 != null) {
				Vector3 var3 = Vector3.sub(arg0.getTransform().trans, var1.getTransform().trans);
				int var4 = (int) var3.x;
				int var5 = (int) var3.z;
				if (var4 != 0 || var5 != 0) {
					arg0.method16490((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof PlayerEntity) {
			PlayerEntity var6 = (PlayerEntity) arg0;
			if (var6.field12056 != -1 && (var6.routeLength == 0 || var6.seqTrigger > 0)) {
				var6.method16490(var6.field12056);
				var6.field12056 = -1;
			}
		} else if (arg0 instanceof NpcEntity) {
			NpcEntity var7 = (NpcEntity) arg0;
			if (var7.field12074 != -1 && (var7.routeLength == 0 || var7.seqTrigger > 0)) {
				Vector3 var8 = var7.getTransform().trans;
				CoordGrid var9 = world.getBase();
				int var10 = (int) var8.x - (var7.field12074 * 256 - var9.x * 256 - var9.x * 256);
				int var11 = (int) var8.z - (var7.field12075 * 256 - var9.z * 256 - var9.z * 256);
				if (var10 != 0 || var11 != 0) {
					var7.method16490((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
				}
				var7.field12074 = -1;
			}
		}
		return arg0.method16539();
	}

	@ObfuscatedName("xs.gi(Lahm;I)V")
	public static final void method10222(PathingEntity arg0) {
		if (arg0.field10418 == null && arg0.field10442 == null) {
			return;
		}
		boolean var1 = true;
		CoordGrid var2 = world.getBase();
		for (int var3 = 0; var3 < arg0.field10418.length; var3++) {
			int var4 = -1;
			if (arg0.field10418 != null) {
				var4 = arg0.field10418[var3];
			}
			if (var4 != -1) {
				var1 = false;
				boolean var5 = false;
				boolean var6 = false;
				Vector3 var7 = arg0.getTransform().trans;
				int var11;
				int var12;
				if ((var4 & -1073741824) == -1073741824) {
					int var8 = var4 & 0xFFFFFFF;
					int var9 = var8 >> 14;
					int var10 = var8 & 0x3FFF;
					var11 = (int) var7.x - ((var9 - var2.x) * 512 + 256);
					var12 = (int) var7.z - ((var10 - var2.z) * 512 + 256);
				} else if ((var4 & 0x8000) == 0) {
					ObjectNode var16 = (ObjectNode) npcs.get((long) var4);
					if (var16 == null) {
						arg0.method16583(var3, -1);
						continue;
					}
					NpcEntity var17 = (NpcEntity) var16.value;
					Vector3 var18 = var17.getTransform().trans;
					var11 = (int) var7.x - (int) var18.x;
					var12 = (int) var7.z - (int) var18.z;
				} else {
					int var13 = var4 & 0x7FFF;
					PlayerEntity var14 = players[var13];
					if (var14 == null) {
						arg0.method16583(var3, -1);
						continue;
					}
					Vector3 var15 = var14.getTransform().trans;
					var11 = (int) var7.x - (int) var15.x;
					var12 = (int) var7.z - (int) var15.z;
				}
				if (var11 != 0 || var12 != 0) {
					arg0.method16583(var3, (int) (Math.atan2((double) var11, (double) var12) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method16583(var3, -1)) {
				var1 = false;
			}
		}
		if (var1) {
			arg0.field10418 = null;
			arg0.field10442 = null;
		}
	}

	@ObfuscatedName("sj.hm(Lahm;IB)V")
	public static void updateMainAnim(PathingEntity arg0, int arg1) {
		if (arg0.field10427 == null) {
			return;
		}
		MoveSpeed var2 = (MoveSpeed) SerializableEnums.decode(MoveSpeed.values(), arg1);
		int var3 = arg0.field10427[var2.method13906()];
		if (var3 != arg0.field10454.getSeqTypeId()) {
			arg0.field10454.method14350(var3, arg0.field10454.method14398());
			arg0.field10396 = arg0.routeLength;
		}
	}

	@ObfuscatedName("qf.ha(Lahm;IIII)V")
	public static void updateWalkAnim(PathingEntity arg0, int arg1, int arg2, int arg3) {
		BASType var4 = arg0.getBASType();
		EntityWalkAnimationNode var5 = arg0.field10432;
		int var6 = arg0.field10414 - arg0.field10395.field528 & 0x3FFF;
		if (MoveSpeed.STATIONARY.serialID == arg1) {
			if (var6 == 0 && arg0.field10443 <= 25) {
				if (!var5.field11877 || !var4.method9290(var5.getSeqTypeId())) {
					var5.method14352(var4.method9295(), false, true);
					var5.field11877 = var5.hasSeqType();
				}
			} else if (arg3 < 0 && var4.readyanim_l != -1) {
				var5.method14352(var4.readyanim_l, false, true);
				var5.field11877 = false;
			} else if (arg3 > 0 && var4.readyanim_r != -1) {
				var5.method14352(var4.readyanim_r, false, true);
				var5.field11877 = false;
			} else if (!var5.field11877 || !var4.method9290(var5.getSeqTypeId())) {
				var5.method14352(var4.method9295(), false, true);
				var5.field11877 = arg0.field10432.hasSeqType();
			}
		} else if (arg0.targetId != -1 && (var6 >= 10240 || var6 <= 2048)) {
			int var7 = field10823[arg2] - arg0.field10395.field528 & 0x3FFF;
			if (MoveSpeed.RUN.serialID == arg1 && var4.runanim != -1) {
				if (var7 > 2048 && var7 <= 6144 && var4.runanim_r != -1) {
					var5.method14352(var4.runanim_r, false, true);
				} else if (var7 >= 10240 && var7 < 14336 && var4.runanim_l != -1) {
					var5.method14352(var4.runanim_l, false, true);
				} else if (var7 <= 6144 || var7 >= 10240 || var4.runanim_b == -1) {
					var5.method14352(var4.runanim, false, true);
				} else {
					var5.method14352(var4.runanim_b, false, true);
				}
			} else if (MoveSpeed.CRAWL.serialID == arg1 && var4.crawlanim != -1) {
				if (var7 > 2048 && var7 <= 6144 && var4.crawlanim_r != -1) {
					var5.method14352(var4.crawlanim_r, false, true);
				} else if (var7 >= 10240 && var7 < 14336 && var4.crawlanim_l != -1) {
					var5.method14352(var4.crawlanim_l, false, true);
				} else if (var7 <= 6144 || var7 >= 10240 || var4.crawlanim_b == -1) {
					var5.method14352(var4.crawlanim, false, true);
				} else {
					var5.method14352(var4.crawlanim_b, false, true);
				}
			} else if (var7 > 2048 && var7 <= 6144 && var4.walkanim_r != -1) {
				var5.method14352(var4.walkanim_r, false, true);
			} else if (var7 >= 10240 && var7 < 14336 && var4.walkanim_l != -1) {
				var5.method14352(var4.walkanim_l, false, true);
			} else if (var7 <= 6144 || var7 >= 10240 || var4.walkanim_b == -1) {
				var5.method14352(var4.walkanim, false, true);
			} else {
				var5.method14352(var4.walkanim_b, false, true);
			}
			var5.field11877 = false;
		} else if (var6 == 0 && arg0.field10443 <= 25) {
			if (MoveSpeed.RUN.serialID == arg1 && var4.runanim != -1) {
				var5.method14352(var4.runanim, false, true);
			} else if (MoveSpeed.CRAWL.serialID == arg1 && var4.crawlanim != -1) {
				var5.method14352(var4.crawlanim, false, true);
			} else {
				var5.method14352(var4.walkanim, false, true);
			}
			var5.field11877 = false;
		} else {
			if (MoveSpeed.RUN.serialID == arg1 && var4.runanim != -1) {
				if (arg3 < 0 && var4.field7338 != -1) {
					var5.method14352(var4.field7338, false, true);
				} else if (arg3 <= 0 || var4.field7339 == -1) {
					var5.method14352(var4.runanim, false, true);
				} else {
					var5.method14352(var4.field7339, false, true);
				}
			} else if (MoveSpeed.CRAWL.serialID == arg1 && var4.crawlanim != -1) {
				if (arg3 < 0 && var4.field7352 != -1) {
					var5.method14352(var4.field7352, false, true);
				} else if (arg3 <= 0 || var4.field7337 == -1) {
					var5.method14352(var4.crawlanim, false, true);
				} else {
					var5.method14352(var4.field7337, false, true);
				}
			} else if (arg3 < 0 && var4.field7320 != -1) {
				var5.method14352(var4.field7320, false, true);
			} else if (arg3 <= 0 || var4.field7341 == -1) {
				var5.method14352(var4.walkanim, false, true);
			} else {
				var5.method14352(var4.field7341, false, true);
			}
			var5.field11877 = false;
		}
	}

	@ObfuscatedName("ach.hk(Lahm;I)V")
	public static final void updateSpotAnim(PathingEntity arg0) {
		EntityWalkAnimationNode var1 = arg0.field10432;
		if (var1.hasSeqType() && var1.method14367(1) && var1.method14375()) {
			if (var1.field11877) {
				var1.method14352(arg0.getBASType().method9295(), false, true);
				var1.field11877 = var1.hasSeqType();
			}
			var1.method14364();
		}
		for (int var2 = 0; var2 < arg0.spotAnims.length; var2++) {
			if (arg0.spotAnims[var2].field6657 != -1) {
				AnimationNode var3 = arg0.spotAnims[var2].field6659;
				if (var3.method14355()) {
					EffectAnimType var4 = (EffectAnimType) effectAnimTypeList.list(arg0.spotAnims[var2].field6657);
					SeqType var5 = var3.getSeqType();
					if (var4.field8261) {
						if (var5.field1767 == 3) {
							if (arg0.field10396 > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
								var3.method14362(-1);
								arg0.spotAnims[var2].field6657 = -1;
								continue;
							}
						} else if (var5.field1767 == 1 && arg0.field10396 > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
							continue;
						}
					}
				}
				if (var3.method14367(1) && var3.method14375()) {
					var3.method14362(-1);
					arg0.spotAnims[var2].field6657 = -1;
				}
			}
		}
		AnimationNode var6 = arg0.field10454;
		if (var6.hasSeqType()) {
			label84: {
				SeqType var7 = var6.getSeqType();
				if (var7.field1767 == 3) {
					if (arg0.field10396 > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
						arg0.field10427 = null;
						var6.method14362(-1);
						break label84;
					}
				} else if (var7.field1767 == 1) {
					if (arg0.field10396 > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
						var6.method14357(1);
						break label84;
					}
					var6.method14357(0);
				}
				if (var6.method14367(1) && var6.method14375()) {
					arg0.field10427 = null;
					var6.method14362(-1);
				}
			}
		}
		for (int var8 = 0; var8 < arg0.field10398.length; var8++) {
			UnknownEntityAnimationNode var9 = arg0.field10398[var8];
			if (var9 != null) {
				if (var9.field12481 > 0) {
					var9.field12481--;
				} else if (var9.method14367(1) && var9.method14375()) {
					arg0.field10398[var8] = null;
				}
			}
		}
	}

	@ObfuscatedName("aht.hu(Lahm;[I[I[IS)V")
	public static void addSequences(PathingEntity arg0, int[] seqs, int[] arg2, int[] arg3) {
		for (int var4 = 0; var4 < seqs.length; var4++) {
			int seqId = seqs[var4];
			int var6 = arg3[var4];
			int var7 = arg2[var4];
			int var8 = 0;
			while (var6 != 0 && var8 < arg0.field10398.length) {
				if ((var6 & 0x1) != 0) {
					if (seqId == -1) {
						arg0.field10398[var8] = null;
					} else {
						SeqType var9 = (SeqType) seqTypeList.list(seqId);
						int var10 = var9.field1768;
						UnknownEntityAnimationNode var11 = arg0.field10398[var8];
						if (var11 != null && var11.hasSeqType()) {
							if (seqId == var11.getSeqTypeId()) {
								if (var10 == 0) {
									arg0.field10398[var8] = null;
									var11 = null;
								} else if (var10 == 1) {
									var11.method14364();
									var11.field12481 = var7;
								} else if (var10 == 2) {
									var11.method14422();
								}
							} else if (var9.priority >= var11.getSeqType().priority) {
								arg0.field10398[var8] = null;
								var11 = null;
							}
						}
						if (var11 == null || !var11.hasSeqType()) {
							UnknownEntityAnimationNode var12 = arg0.field10398[var8] = new UnknownEntityAnimationNode(arg0);
							var12.method14362(seqId);
							var12.field12481 = var7;
						}
					}
				}
				var8++;
				var6 >>>= 0x1;
			}
		}
	}

	@ObfuscatedName("yo.hb(B)V")
	public static final void drawTitleOrLobby() {
		ParticleSystemRenderer.method6866(toolkit, (long) loopCycle);
		if (openedTopInterface != -1) {
			method14428(openedTopInterface);
		}
		for (int var0 = 0; var0 < topLevelComponentCount; var0++) {
			topLevelComponentRedrawRequested[var0] = topLevelComponentRedrawRequestedTemp[var0];
			topLevelComponentRedrawRequestedTemp[var0] = false;
		}
		field11037 = loopCycle;
		if (openedTopInterface != -1) {
			topLevelComponentCount = 0;
			method15281();
		}
		toolkit.resetClip();
		MiniMenu.method7316(toolkit);
		int var1 = MiniMenu.method895();
		if (var1 == -1) {
			var1 = defaultCursor;
		}
		if (var1 == -1) {
			var1 = field11038;
		}
		method10615(var1);
		sceneDelta = 0;
	}

	@ObfuscatedName("alf.hg(J)V")
	public static final void drawGame(long arg0) {
		if (world.getScene() != null) {
			if (Client.cameraState == 2 || Client.cameraState == 1) {
				method614(arg0);
			} else if (Client.cameraState == 4) {
				method3093(arg0);
			}
		}
		ParticleSystemRenderer.method6866(toolkit, (long) loopCycle);
		if (openedTopInterface != -1) {
			method14428(openedTopInterface);
		}
		for (int var2 = 0; var2 < topLevelComponentCount; var2++) {
			topLevelComponentRedrawRequested[var2] = topLevelComponentRedrawRequestedTemp[var2];
			topLevelComponentRedrawRequestedTemp[var2] = false;
		}
		field11037 = loopCycle;
		MiniMenu.setBounds(-1, -1);
		if (openedTopInterface != -1) {
			topLevelComponentCount = 0;
			method15281();
		}
		toolkit.resetClip();
		MiniMenu.method7316(toolkit);
		int var3 = MiniMenu.method895();
		if (var3 == -1) {
			var3 = defaultCursor;
		}
		if (var3 == -1) {
			var3 = field11038;
		}
		method10615(var3);
		int var4 = localPlayerEntity.size() << 8;
		Vector3 var5 = localPlayerEntity.getTransform().trans;
		PositionedSound.method16460(localPlayerEntity.level, (int) var5.x + var4, (int) var5.z + var4, sceneDelta);
		sceneDelta = 0;
	}

	@ObfuscatedName("dy.hd(IIIIZI)V")
	public static final void drawScene(int x, int y, int width, int height, boolean arg4) {
		if (world.getScene() == null) {
			toolkit.fillRectangle(x, y, width, height, -16777216);
			return;
		}
		Vector3 var5 = localPlayerEntity.getTransform().trans;
		boolean var6 = false;
		if (sceneState == 3) {
			if ((int) var5.x < 0 || (int) var5.x >= world.getSizeX() * 512 || (int) var5.z < 0 || (int) var5.z >= world.getSizeZ() * 512) {
				var6 = true;
			}
			if (Client.cameraState == 3 && !cam2.method4744()) {
				var6 = true;
			}
		} else if (!field10877) {
			var6 = true;
		}
		if (var6) {
			toolkit.fillRectangle(x, y, width, height, -16777216);
			return;
		}
		sceneCycle++;
		if (localPlayerEntity != null && (int) var5.x - (localPlayerEntity.size() - 1) * 256 >> 9 == MiniMap.flagSceneTileX && (int) var5.z - (localPlayerEntity.size() - 1) * 256 >> 9 == MiniMap.flagSceneTileZ) {
			MiniMap.flagSceneTileX = -1;
			MiniMap.flagSceneTileZ = -1;
			DelayedStateChange.onMiniMapFlag();
		}
		pushEntities();
		if (!arg4) {
			pushProjectiles();
		}
		pushSpotanims();
		for (int var7 = 0; var7 < hintTrails.length; var7++) {
			if (hintTrails[var7] != null && !hintTrails[var7].method8407() && hintTrails[var7].method8408(toolkit)) {
				hintTrails[var7].method8412(world.getScene());
			}
		}
		setViewport(x, y, width, height, true);
		int viewportX = Client.viewportX;
		int viewportY = Client.viewportY;
		int viewportWidth = Client.viewportWidth;
		int viewportHeight = Client.viewportHeight;
		MiniMenu.setBounds(viewportX, viewportY);
		if (Client.cameraState == 2) {
			int pitch = (int) orbitCameraPitch;
			if (cameraPitchClamp >> 8 > pitch) {
				pitch = cameraPitchClamp >> 8;
			}
			if (cameraModifierEnabled[4] && cameraModifierWobbleScale[4] + 128 > pitch) {
				pitch = cameraModifierWobbleScale[4] + 128;
			}
			int yaw = cameraAnticheatAngle + (int) orbitCameraYaw & 0x3FFF;
			orbitCamera(orbitCameraX, getHeightmapY((int) var5.x, (int) var5.z, currentPlayerLevel) - cameraFollowHeight, orbitCameraZ, pitch, yaw, (pitch >> 3) * 3 + 600 << 2, viewportHeight);
		} else if (Client.cameraState == 4) {
			int pitch = (int) orbitCameraPitch;
			if (cameraPitchClamp >> 8 > pitch) {
				pitch = cameraPitchClamp >> 8;
			}
			if (cameraModifierEnabled[4] && cameraModifierWobbleScale[4] + 128 > pitch) {
				pitch = cameraModifierWobbleScale[4] + 128;
			}
			int yaw = (int) orbitCameraYaw & 0x3FFF;
			orbitCamera(orbitCameraX, getHeightmapY(field10892, field10893, currentPlayerLevel) - cameraFollowHeight, orbitCameraZ, pitch, yaw, (pitch >> 3) * 3 + 600 << 2, viewportHeight);
		} else if (Client.cameraState == 1) {
			method10490(viewportHeight);
		}
		int cameraX = Client.cameraX;
		int cameraY = Client.cameraY;
		int cameraZ = Client.cameraZ;
		int cameraPitch = Client.cameraPitch;
		int cameraYaw = Client.cameraYaw;
		for (int type = 0; type < 5; type++) {
			if (cameraModifierEnabled[type]) {
				int jitter = (int) (Math.random() * (double) (cameraModifierJitter[type] * 2 + 1) - (double) cameraModifierJitter[type] + Math.sin((double) cameraModifierCycle[type] / 100.0D * (double) cameraModifierWobbleSpeed[type]) * (double) cameraModifierWobbleScale[type]);
				if (type == 0) {
					Client.cameraX += jitter << 2;
				}
				if (type == 1) {
					Client.cameraY += jitter << 2;
				}
				if (type == 2) {
					Client.cameraZ += jitter << 2;
				}
				if (type == 3) {
					Client.cameraYaw = Client.cameraYaw + jitter & 0x3FFF;
				}
				if (type == 4) {
					Client.cameraPitch += jitter;
					if (Client.cameraPitch < 1024) {
						Client.cameraPitch = 1024;
					} else if (Client.cameraPitch > 3072) {
						Client.cameraPitch = 3072;
					}
				}
			}
		}
		if (Client.cameraX < 0) {
			Client.cameraX = 0;
		}
		if (Client.cameraX > (world.getScene().maxTileX << 9) - 1) {
			Client.cameraX = (world.getScene().maxTileX << 9) - 1;
		}
		if (Client.cameraZ < 0) {
			Client.cameraZ = 0;
		}
		if (Client.cameraZ > (world.getScene().maxTileZ << 9) - 1) {
			Client.cameraZ = (world.getScene().maxTileZ << 9) - 1;
		}
		if (preferences.removeRoofs2.getValue() == 2) {
			method16610();
		} else if (preferences.removeRoofs2.getValue() == 3) {
			method2671();
		}
		toolkit.method2164(viewportX, viewportY, viewportWidth, viewportHeight);
		toolkit.method2170(true);
		toolkit.resetBounds(viewportX, viewportY, viewportX + viewportWidth, viewportY + viewportHeight);
		Environment var23 = world.getEnvironmentManager().getCurrentEnv();
		int var24 = var23.getFogColour();
		Vector3i var25 = new Vector3i();
		CoordGrid var26 = world.getBase();
		if (CameraManager.method2978()) {
			CameraManager.camera.method4707(var25, field10793, field10792, var26.x << 9, var26.z << 9);
		} else if (Client.cameraState == 3) {
			cam2.method4707(var25, field10793, field10792, var26.x << 9, var26.z << 9);
		} else {
			field10793.setToTranslation((float) -Client.cameraX, (float) -Client.cameraY, (float) -Client.cameraZ);
			field10793.rotateAroundAxis(0.0F, -1.0F, 0.0F, Trig1.radians(-Client.cameraYaw & 0x3FFF));
			field10793.rotateAroundAxis(-1.0F, 0.0F, 0.0F, Trig1.radians(-Client.cameraPitch & 0x3FFF));
			field10793.rotateAroundAxis(0.0F, 0.0F, -1.0F, Trig1.radians(-cameraRoll & 0x3FFF));
			method15141(field10792, true, (float) (viewportWidth / 2), (float) (viewportHeight / 2), (float) (field11078 << 1), (float) (field11078 << 1), viewportWidth, viewportHeight);
		}
		toolkit.method2217(field10793);
		toolkit.method2220(field10792);
		if (var23.getSkybox() == null) {
			toolkit.method2475(3, var24);
		} else {
			toolkit.setSunAmbientIntensity(1.0F);
			toolkit.setSun(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Client.cameraState == 3) {
				int var27 = (int) ((double) cam2.method4718() * 2607.5945876176133D);
				int var28 = (int) ((double) cam2.method4719() * 2607.5945876176133D);
				var23.getSkybox().method7946(toolkit, field3023 << 3, viewportX, viewportY, viewportWidth, viewportHeight, var27, var28, 0, var24, true, false);
			} else {
				var23.getSkybox().method7946(toolkit, field3023 << 3, viewportX, viewportY, viewportWidth, viewportHeight, Client.cameraPitch, Client.cameraYaw, cameraRoll, var24, true, false);
			}
			toolkit.flush();
		}
		toolkit.method2170(false);
		MiniMenu.method5928(field10793, field10792, viewportWidth, viewportHeight);
		world.getEnvironmentManager().updatePartial(world);
		int var29 = preferences.removeRoofs2.getValue();
		byte var30;
		if (var29 == 2) {
			var30 = (byte) sceneCycle;
		} else if (var29 == 3) {
			var30 = (byte) (field11096 ? 1 : -1);
		} else {
			var30 = 1;
		}
		if (CameraManager.method2978() || Client.cameraState == 3) {
			world.getScene().draw(loopCycle, var25.field2835, var25.field2836, var25.field2837, world.method7742(), field11061, field10933, field10934, field10935, field10820, localPlayerEntity.level + 1, var30, (int) var5.x >> 9, (int) var5.z >> 9, preferences.flickeringEffects.getValue() == 0, true, 0, true);
		} else {
			world.getScene().draw(loopCycle, Client.cameraX, Client.cameraY, Client.cameraZ, world.method7742(), field11061, field10933, field10934, field10935, field10820, localPlayerEntity.level + 1, var30, (int) var5.x >> 9, (int) var5.z >> 9, preferences.flickeringEffects.getValue() == 0, true, 0, true);
		}
		field10915++;
		if (!toolkit.method2234() && state == 18) {
			draw3DEntityElements(viewportX, viewportY, viewportWidth, viewportHeight);
		}
		world.getScene().clearEntities();
		Client.cameraX = cameraX;
		Client.cameraY = cameraY;
		Client.cameraZ = cameraZ;
		Client.cameraPitch = cameraPitch;
		Client.cameraYaw = cameraYaw;
		if (field11023 && js5TcpClient.getTotalUrgents() == 0) {
			field11023 = false;
		}
		if (field11023) {
			toolkit.fillRectangle(viewportX, viewportY, viewportWidth, viewportHeight, -16777216);
			MessageBox.draw(LocalisedText.LOADING.forLang(language), false, toolkit, DefaultSprites.p12FullFont, DefaultSprites.p12FullMetrics);
		}
		method15141(field10792, false, (float) (viewportWidth / 2 + viewportX), (float) (viewportHeight / 2 + viewportY), (float) (field11078 << 1), (float) (field11078 << 1), viewportWidth, viewportHeight);
		toolkit.method2220(field10792);
		MiniMenu.method9927(field10792);
	}

	@ObfuscatedName("zm.hx(IIIIZI)V")
	public static final void setViewport(int x, int y, int width, int height, boolean drawing) {
		if (width < 1) {
			width = 1;
		}
		if (height < 1) {
			height = 1;
		}
		int var5 = height - 334;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 > 100) {
			var5 = 100;
		}
		int var6 = (viewportFovMin - viewportFovMax) * var5 / 100 + viewportFovMax;
		int var7 = height * var6 * 512 / (width * 334);
		if (var7 < field10900) {
			short var8 = field10900;
			var6 = width * var8 * 334 / (height * 512);
			if (var6 > field11071) {
				var6 = field11071;
				int var9 = height * var6 * 512 / (var8 * 334);
				int var10 = (width - var9) / 2;
				if (drawing) {
					toolkit.resetClip();
					toolkit.fillRectangle(x, y, var10, height, -16777216);
					toolkit.fillRectangle(x + width - var10, y, var10, height, -16777216);
				}
				x += var10;
				width -= var10 * 2;
			}
		} else if (var7 > field10943) {
			short var11 = field10943;
			var6 = width * var11 * 334 / (height * 512);
			if (var6 < field11070) {
				var6 = field11070;
				int var12 = width * var11 * 334 / (var6 * 512);
				int var13 = (height - var12) / 2;
				if (drawing) {
					toolkit.resetClip();
					toolkit.fillRectangle(x, y, width, var13, -16777216);
					toolkit.fillRectangle(x, y + height - var13, width, var13, -16777216);
				}
				y += var13;
				height -= var13 * 2;
			}
		}
		field11078 = height * var6 / 334;
		viewportX = x;
		viewportY = y;
		viewportWidth = (short) width;
		viewportHeight = (short) height;
	}

	@ObfuscatedName("ff.hq(I)V")
	public static final void method3128() {
		int var0 = preferences.removeRoofs2.getValue();
		if (var0 == 0) {
			world.method7775(null);
			method818(0);
		} else if (var0 == 1 || var0 == 3) {
			method2835((byte) 0);
			method818(512);
			if (world.getScene() != null) {
				method2900();
			}
		} else {
			method2835((byte) (sceneCycle - 4 & 0xFF));
			method818(2);
		}
		field11046 = currentPlayerLevel;
	}

	@ObfuscatedName("eq.hf(BI)V")
	public static final void method2835(byte arg0) {
		byte[][][] var1 = world.method7742();
		if (var1 == null) {
			var1 = new byte[4][world.getSizeX()][world.getSizeZ()];
			world.method7775(var1);
		}
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < world.getSizeX(); var3++) {
				for (int var4 = 0; var4 < world.getSizeZ(); var4++) {
					var1[var2][var3][var4] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("ad.hr(IB)V")
	public static final void method818(int arg0) {
		field11061 = new int[arg0];
		field10933 = new int[arg0];
		field10934 = new int[arg0];
		field10935 = new int[arg0];
		field10820 = new int[arg0];
	}

	@ObfuscatedName("ew.hs(I)V")
	public static final void method2900() {
		int var0 = 0;
		Scene var1 = world.getScene();
		for (int var2 = 0; var2 < world.getSizeX(); var2++) {
			for (int var3 = 0; var3 < world.getSizeZ(); var3++) {
				if (method7472(var1.levelTiles, var0, var2, var3, true)) {
					var0++;
				}
				if (var0 >= 512) {
					return;
				}
			}
		}
	}

	@ObfuscatedName("eo.hh(B)V")
	public static final void method2671() {
		field11096 = false;
		if (currentPlayerLevel == 3) {
			return;
		}
		Vector3 var0 = localPlayerEntity.getTransform().trans;
		SceneLevelTileFlags var1 = world.getSceneLevelTileFlags();
		if (Client.cameraState != 2 && Client.cameraState != 3 && field810 == -1) {
			int var2 = getHeightmapY(cameraX, cameraZ, currentPlayerLevel);
			if (var2 - cameraY < 3200 && (var1.flags[currentPlayerLevel][cameraX >> 9][cameraZ >> 9] & 0x4) != 0) {
				field11096 = true;
			}
			return;
		}
		CoordGrid var3 = world.getBase();
		int var5;
		int var6;
		if (Client.cameraState == 3) {
			Vector3 var4 = cam2.getLookat().method14135();
			if (Float.isNaN(var4.x)) {
				return;
			}
			var5 = (int) var4.x - (var3.x << 9);
			var6 = (int) var4.z - (var3.z << 9);
			if (var5 < 0 || var6 < 0 || var5 >> 9 >= var1.flags[currentPlayerLevel].length || var6 >> 9 >= var1.flags[currentPlayerLevel][var5 >> 9].length) {
				return;
			}
		} else if (Client.cameraState == 2) {
			var5 = (int) var0.x;
			var6 = (int) var0.z;
		} else {
			var5 = field810;
			var6 = field3538;
		}
		if ((var1.flags[currentPlayerLevel][var5 >> 9][var6 >> 9] & 0x4) != 0) {
			field11096 = true;
			return;
		}
		int var8;
		int var9;
		if (Client.cameraState == 3) {
			Vector3 var7 = cam2.getPosition().method5219();
			var8 = ((int) var7.x >> 9) - var3.x;
			var9 = ((int) var7.z >> 9) - var3.z;
			if (var8 < 0 || var9 < 0 || var8 >= var1.flags[currentPlayerLevel].length || var9 >= var1.flags[currentPlayerLevel][var8].length) {
				return;
			}
		} else {
			var8 = cameraX >> 9;
			var9 = cameraZ >> 9;
		}
		int var10 = var5 >> 9;
		int var11 = var6 >> 9;
		if (var1.method7102(var8, var9)) {
			int var12 = getHeightmapY(cameraX, cameraZ, 3);
			if (cameraY >= var12) {
				field11096 = true;
			}
			return;
		}
		if (cameraPitch >= 2560) {
			return;
		}
		int var13;
		if (var10 > var8) {
			var13 = var10 - var8;
		} else {
			var13 = var8 - var10;
		}
		int var14;
		if (var11 > var9) {
			var14 = var11 - var9;
		} else {
			var14 = var9 - var11;
		}
		if (var13 == 0 && var14 == 0 || var13 <= -world.getSizeX() || var13 >= world.getSizeX() || var14 <= -world.getSizeZ() || var14 >= world.getSizeZ()) {
			if (Client.cameraState != 3) {
				JagException.report(var8 + TextUtil.COMMA + var9 + " " + var10 + TextUtil.COMMA + var11 + " " + var3.x + TextUtil.COMMA + var3.z, new RuntimeException());
			}
			return;
		}
		if (var13 <= var14) {
			int var17 = var13 * 65536 / var14;
			int var18 = 32768;
			while (var9 != var11) {
				if (var9 < var11) {
					var9++;
				} else if (var9 > var11) {
					var9--;
				}
				if ((var1.flags[currentPlayerLevel][var8][var9] & 0x4) != 0) {
					field11096 = true;
					return;
				}
				if (var8 + 1 < var1.flags[currentPlayerLevel].length && (var1.flags[currentPlayerLevel][var8 + 1][var9] & 0x4) != 0) {
					field11096 = true;
					return;
				}
				if (var8 > 0 && (var1.flags[currentPlayerLevel][var8 - 1][var9] & 0x4) != 0) {
					field11096 = true;
					return;
				}
				var18 += var17;
				if (var18 >= 65536) {
					var18 -= 65536;
					if (var8 < var10) {
						var8++;
						if (var8 + 1 < var1.flags[currentPlayerLevel].length && (var1.flags[currentPlayerLevel][var8 + 1][var9] & 0x4) != 0) {
							field11096 = true;
							return;
						}
					} else if (var8 > var10) {
						var8--;
						if (var8 > 0 && (var1.flags[currentPlayerLevel][var8 - 1][var9] & 0x4) != 0) {
							field11096 = true;
							return;
						}
					}
				}
			}
			return;
		}
		int var15 = var14 * 65536 / var13;
		int var16 = 32768;
		while (var8 != var10) {
			if (var8 < var10) {
				var8++;
			} else if (var8 > var10) {
				var8--;
			}
			if ((var1.flags[currentPlayerLevel][var8][var9] & 0x4) != 0) {
				field11096 = true;
				return;
			}
			if (var9 + 1 < var1.flags[currentPlayerLevel][var8].length && (var1.flags[currentPlayerLevel][var8][var9 + 1] & 0x4) != 0) {
				field11096 = true;
				return;
			}
			if (var9 > 0 && (var1.flags[currentPlayerLevel][var8][var9 - 1] & 0x4) != 0) {
				field11096 = true;
				return;
			}
			var16 += var15;
			if (var16 >= 65536) {
				var16 -= 65536;
				if (var9 < var11) {
					var9++;
					if (var9 + 1 < var1.flags[currentPlayerLevel][var8].length && (var1.flags[currentPlayerLevel][var8][var9 + 1] & 0x4) != 0) {
						field11096 = true;
						return;
					}
				} else if (var9 > var11) {
					var9--;
					if (var9 > 0 && (var1.flags[currentPlayerLevel][var8][var9 - 1] & 0x4) != 0) {
						field11096 = true;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("ahj.hp(I)V")
	public static final void method16610() {
		byte[][][] var0 = world.method7742();
		byte var1 = (byte) (sceneCycle - 4 & 0xFF);
		int var2 = sceneCycle % world.getSizeX();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < world.getSizeZ(); var4++) {
				var0[var3][var2][var4] = var1;
			}
		}
		if (currentPlayerLevel == 3) {
			return;
		}
		for (int var5 = 0; var5 < 2; var5++) {
			field11061[var5] = -1000000;
			field10933[var5] = 1000000;
			field10934[var5] = 0;
			field10820[var5] = 1000000;
			field10935[var5] = 0;
		}
		Vector3 var6 = localPlayerEntity.getTransform().trans;
		SceneLevelTileFlags var7 = world.getSceneLevelTileFlags();
		Scene var8 = world.getScene();
		if (Client.cameraState != 2 && Client.cameraState != 3 && field810 == -1) {
			int var9 = getHeightmapY(cameraX, cameraZ, currentPlayerLevel);
			if (var9 - cameraY < 3200 && (var7.flags[currentPlayerLevel][cameraX >> 9][cameraZ >> 9] & 0x4) != 0) {
				method7472(var8.levelTiles, 1, cameraX >> 9, cameraZ >> 9, false);
			}
			return;
		}
		CoordGrid var10 = world.getBase();
		int var12;
		int var13;
		if (Client.cameraState == 3) {
			Vector3 var11 = cam2.getLookat().method14135();
			if (Float.isNaN(var11.x)) {
				return;
			}
			var12 = (int) var11.x - (var10.x << 9);
			var13 = (int) var11.z - (var10.z << 9);
			if (var12 < 0 || var13 < 0 || var12 >> 9 >= var7.flags[currentPlayerLevel].length || var13 >> 9 >= var7.flags[currentPlayerLevel][var12 >> 9].length) {
				return;
			}
		} else if (Client.cameraState == 2) {
			var12 = (int) var6.x;
			var13 = (int) var6.z;
		} else {
			var12 = field810;
			var13 = field3538;
		}
		if ((var7.flags[currentPlayerLevel][var12 >> 9][var13 >> 9] & 0x4) != 0) {
			method7472(var8.levelTiles, 0, var12 >> 9, var13 >> 9, false);
			return;
		}
		int var15;
		int var16;
		if (Client.cameraState == 3) {
			Vector3 var14 = cam2.getPosition().method5219();
			var15 = ((int) var14.x >> 9) - var10.x;
			var16 = ((int) var14.z >> 9) - var10.z;
			if (var15 < 0 || var16 < 0 || var15 >= var7.flags[currentPlayerLevel].length || var16 >= var7.flags[currentPlayerLevel][var15].length) {
				return;
			}
		} else {
			var15 = cameraX >> 9;
			var16 = cameraZ >> 9;
		}
		int var17 = var12 >> 9;
		int var18 = var13 >> 9;
		if (var7.method7102(var15, var16)) {
			int var19 = getHeightmapY(cameraX, cameraZ, 3);
			if (cameraY >= var19) {
				method7472(var8.levelTiles, 1, var15, var16, false);
			}
			return;
		}
		if (cameraPitch >= 2560) {
			return;
		}
		int var20;
		if (var17 > var15) {
			var20 = var17 - var15;
		} else {
			var20 = var15 - var17;
		}
		int var21;
		if (var18 > var16) {
			var21 = var18 - var16;
		} else {
			var21 = var16 - var18;
		}
		if ((var20 != 0 || var21 != 0) && var20 > -world.getSizeX() && var20 < world.getSizeX() && var21 > -world.getSizeZ() && var21 < world.getSizeZ()) {
			if (var20 <= var21) {
				int var24 = var20 * 65536 / var21;
				int var25 = 32768;
				while (var16 != var18) {
					if (var16 < var18) {
						var16++;
					} else if (var16 > var18) {
						var16--;
					}
					if ((var7.flags[currentPlayerLevel][var15][var16] & 0x4) != 0) {
						method7472(var8.levelTiles, 1, var15, var16, false);
						return;
					}
					if (var15 + 1 < var7.flags[currentPlayerLevel].length && (var7.flags[currentPlayerLevel][var15 + 1][var16] & 0x4) != 0) {
						method7472(var8.levelTiles, 1, var15 + 1, var16, false);
						return;
					}
					if (var15 > 0 && (var7.flags[currentPlayerLevel][var15 - 1][var16] & 0x4) != 0) {
						method7472(var8.levelTiles, 1, var15 - 1, var16, false);
						return;
					}
					var25 += var24;
					if (var25 >= 65536) {
						var25 -= 65536;
						if (var15 < var17) {
							var15++;
							if (var15 + 1 < var7.flags[currentPlayerLevel].length && (var7.flags[currentPlayerLevel][var15 + 1][var16] & 0x4) != 0) {
								method7472(var8.levelTiles, 1, var15 + 1, var16, false);
								return;
							}
						} else if (var15 > var17) {
							var15--;
							if (var15 > 0 && (var7.flags[currentPlayerLevel][var15 - 1][var16] & 0x4) != 0) {
								method7472(var8.levelTiles, 1, var15 - 1, var16, false);
								return;
							}
						}
					}
				}
				return;
			}
			int var22 = var21 * 65536 / var20;
			int var23 = 32768;
			while (var15 != var17) {
				if (var15 < var17) {
					var15++;
				} else if (var15 > var17) {
					var15--;
				}
				if ((var7.flags[currentPlayerLevel][var15][var16] & 0x4) != 0) {
					method7472(var8.levelTiles, 1, var15, var16, false);
					return;
				}
				if (var16 + 1 < var7.flags[currentPlayerLevel][var15].length && (var7.flags[currentPlayerLevel][var15][var16 + 1] & 0x4) != 0) {
					method7472(var8.levelTiles, 1, var15, var16 + 1, false);
					return;
				}
				if (var16 > 0 && (var7.flags[currentPlayerLevel][var15][var16 - 1] & 0x4) != 0) {
					method7472(var8.levelTiles, 1, var15, var16 - 1, false);
					return;
				}
				var23 += var22;
				if (var23 >= 65536) {
					var23 -= 65536;
					if (var16 < var18) {
						var16++;
						if (var16 + 1 < var7.flags[currentPlayerLevel][var15].length && (var7.flags[currentPlayerLevel][var15][var16 + 1] & 0x4) != 0) {
							method7472(var8.levelTiles, 1, var15, var16 + 1, false);
							return;
						}
					} else if (var16 > var18) {
						var16--;
						if (var16 > 0 && (var7.flags[currentPlayerLevel][var15][var16 - 1] & 0x4) != 0) {
							method7472(var8.levelTiles, 1, var15, var16 - 1, false);
							return;
						}
					}
				}
			}
			return;
		}
		if (Client.cameraState != 3) {
			JagException.report(var15 + TextUtil.COMMA + var16 + " " + var17 + TextUtil.COMMA + var18 + " " + var10.x + TextUtil.COMMA + var10.z, new RuntimeException());
		}
		return;
	}

	@ObfuscatedName("rw.hy([[[Ltk;IIIZI)Z")
	public static final boolean method7472(Tile[][][] arg0, int arg1, int arg2, int arg3, boolean arg4) {
		byte[][][] var5 = world.method7742();
		byte var6 = arg4 ? 1 : (byte) (sceneCycle & 0xFF);
		if (var5[currentPlayerLevel][arg2][arg3] == var6) {
			return false;
		}
		SceneLevelTileFlags var7 = world.getSceneLevelTileFlags();
		if ((var7.flags[currentPlayerLevel][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		byte var8 = 0;
		int var9 = 0;
		field11092[var8] = arg2;
		int var42 = var8 + 1;
		field10984[var8] = arg3;
		var5[currentPlayerLevel][arg2][arg3] = var6;
		while (var42 != var9) {
			int var10 = field11092[var9] & 0xFFFF;
			int var11 = field11092[var9] >> 16 & 0xFF;
			int var12 = field11092[var9] >> 24 & 0xFF;
			int var13 = field10984[var9] & 0xFFFF;
			int var14 = field10984[var9] >> 16 & 0xFF;
			var9 = var9 + 1 & 0xFFF;
			boolean var15 = false;
			if ((var7.flags[currentPlayerLevel][var10][var13] & 0x4) == 0) {
				var15 = true;
			}
			boolean var16 = false;
			if (arg0 != null) {
				label240: for (int var17 = currentPlayerLevel + 1; var17 <= 3; var17++) {
					if (arg0[var17] != null && (var7.flags[var17][var10][var13] & 0x8) == 0) {
						if (var15 && arg0[var17][var10][var13] != null) {
							if (arg0[var17][var10][var13].wall != null) {
								int var18 = method2014(var11);
								if (arg0[var17][var10][var13].wall.type == var18 || arg0[var17][var10][var13].dynamicWall != null && arg0[var17][var10][var13].dynamicWall.type == var18) {
									continue;
								}
								if (var12 != 0) {
									int var19 = method2014(var12);
									if (arg0[var17][var10][var13].wall.type == var19 || arg0[var17][var10][var13].dynamicWall != null && arg0[var17][var10][var13].dynamicWall.type == var19) {
										continue;
									}
								}
								if (var14 != 0) {
									int var20 = method2014(var14);
									if (arg0[var17][var10][var13].wall.type == var20 || arg0[var17][var10][var13].dynamicWall != null && arg0[var17][var10][var13].dynamicWall.type == var20) {
										continue;
									}
								}
							}
							Tile var21 = arg0[var17][var10][var13];
							if (var21.entities != null) {
								for (PrimaryLayerEntityList var22 = var21.entities; var22 != null; var22 = var22.field7058) {
									PrimaryLayerEntity var23 = var22.field7057;
									if (var23 instanceof Location) {
										Location var24 = (Location) var23;
										int var25 = var24.getShape();
										int var26 = var24.getAngle();
										if (var25 == 21) {
											var25 = 19;
										}
										int var27 = var25 | var26 << 6;
										if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
											continue label240;
										}
									}
								}
							}
						}
						Tile var28 = arg0[var17][var10][var13];
						if (var28 != null && var28.entities != null) {
							for (PrimaryLayerEntityList var29 = var28.entities; var29 != null; var29 = var29.field7058) {
								PrimaryLayerEntity var30 = var29.field7057;
								if (var30.maxSceneTileX != var30.minSceneTileX || var30.minSceneTileZ != var30.maxSceneTileZ) {
									short var31 = var30.minSceneTileX;
									short var32 = var30.maxSceneTileX;
									short var33 = var30.minSceneTileZ;
									short var34 = var30.maxSceneTileZ;
									int var35 = Math.max(0, Math.min(var31, var5[var17].length - 1));
									int var36 = Math.max(0, Math.min(var33, var5[var17][0].length - 1));
									int var37 = Math.max(0, Math.min(var32, var5[var17].length - 1));
									int var38 = Math.max(0, Math.min(var34, var5[var17][0].length - 1));
									while (var35 <= var37) {
										while (var36 <= var38) {
											var5[var17][var35][var36] = var6;
											var36++;
										}
										var35++;
									}
								}
							}
						}
						var5[var17][var10][var13] = var6;
						var16 = true;
					}
				}
			}
			if (var16) {
				int var39 = world.getScene().levelHeightmaps[currentPlayerLevel + 1].getTileHeight(var10, var13);
				if (field11061[arg1] < var39) {
					field11061[arg1] = var39;
				}
				int var40 = var10 << 9;
				int var41 = var13 << 9;
				if (field10933[arg1] > var40) {
					field10933[arg1] = var40;
				} else if (field10934[arg1] < var40) {
					field10934[arg1] = var40;
				}
				if (field10820[arg1] > var41) {
					field10820[arg1] = var41;
				} else if (field10935[arg1] < var41) {
					field10935[arg1] = var41;
				}
			}
			if (!var15) {
				if (var10 >= 1 && var5[currentPlayerLevel][var10 - 1][var13] != var6) {
					field11092[var42] = var10 - 1 | 0x120000 | 0xD3000000;
					field10984[var42] = var13 | 0x130000;
					var42 = var42 + 1 & 0xFFF;
					var5[currentPlayerLevel][var10 - 1][var13] = var6;
				}
				var13++;
				if (var13 < world.getSizeZ()) {
					if (var10 - 1 >= 0 && var5[currentPlayerLevel][var10 - 1][var13] != var6 && (var7.flags[currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.flags[currentPlayerLevel][var10 - 1][var13 - 1] & 0x4) == 0) {
						field11092[var42] = var10 - 1 | 0x120000 | 0x52000000;
						field10984[var42] = var13 | 0x130000;
						var42 = var42 + 1 & 0xFFF;
						var5[currentPlayerLevel][var10 - 1][var13] = var6;
					}
					if (var5[currentPlayerLevel][var10][var13] != var6) {
						field11092[var42] = var10 | 0x520000 | 0x13000000;
						field10984[var42] = var13 | 0x530000;
						var42 = var42 + 1 & 0xFFF;
						var5[currentPlayerLevel][var10][var13] = var6;
					}
					if (var10 + 1 < world.getSizeX() && var5[currentPlayerLevel][var10 + 1][var13] != var6 && (var7.flags[currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.flags[currentPlayerLevel][var10 + 1][var13 - 1] & 0x4) == 0) {
						field11092[var42] = var10 + 1 | 0x520000 | 0x92000000;
						field10984[var42] = var13 | 0x530000;
						var42 = var42 + 1 & 0xFFF;
						var5[currentPlayerLevel][var10 + 1][var13] = var6;
					}
				}
				var13--;
				if (var10 + 1 < world.getSizeX() && var5[currentPlayerLevel][var10 + 1][var13] != var6) {
					field11092[var42] = var10 + 1 | 0x920000 | 0x53000000;
					field10984[var42] = var13 | 0x930000;
					var42 = var42 + 1 & 0xFFF;
					var5[currentPlayerLevel][var10 + 1][var13] = var6;
				}
				var13--;
				if (var13 >= 0) {
					if (var10 - 1 >= 0 && var5[currentPlayerLevel][var10 - 1][var13] != var6 && (var7.flags[currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.flags[currentPlayerLevel][var10 - 1][var13 + 1] & 0x4) == 0) {
						field11092[var42] = var10 - 1 | 0xD20000 | 0x12000000;
						field10984[var42] = var13 | 0xD30000;
						var42 = var42 + 1 & 0xFFF;
						var5[currentPlayerLevel][var10 - 1][var13] = var6;
					}
					if (var5[currentPlayerLevel][var10][var13] != var6) {
						field11092[var42] = var10 | 0xD20000 | 0x93000000;
						field10984[var42] = var13 | 0xD30000;
						var42 = var42 + 1 & 0xFFF;
						var5[currentPlayerLevel][var10][var13] = var6;
					}
					if (var10 + 1 < world.getSizeX() && var5[currentPlayerLevel][var10 + 1][var13] != var6 && (var7.flags[currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.flags[currentPlayerLevel][var10 + 1][var13 + 1] & 0x4) == 0) {
						field11092[var42] = var10 + 1 | 0x920000 | 0xD2000000;
						field10984[var42] = var13 | 0x930000;
						var42 = var42 + 1 & 0xFFF;
						var5[currentPlayerLevel][var10 + 1][var13] = var6;
					}
				}
			}
		}
		if (field11061[arg1] != -1000000) {
			field11061[arg1] += 40;
			field10933[arg1] -= 512;
			field10934[arg1] += 512;
			field10935[arg1] += 512;
			field10820[arg1] -= 512;
		}
		return true;
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

	@ObfuscatedName("sq.hn(I)V")
	public static final void pushEntities() {
		for (CoverMarkerClickbox var0 = (CoverMarkerClickbox) field10882.pollFront(); var0 != null; var0 = (CoverMarkerClickbox) field10882.pollFront()) {
			CoverMarkerClickbox.method3032(var0);
		}
		byte var1 = 0;
		byte var2 = 3;
		if (sceneState == 0) {
			for (int var3 = var1; var3 <= var2; var3++) {
				method16924(var3);
			}
			method16929();
			return;
		}
		method17138();
		for (int var4 = var1; var4 <= var2; var4++) {
			method16922();
			method17232(var4);
			method16924(var4);
		}
		method16925();
		method16929();
	}

	@ObfuscatedName("client.hi()V")
	public static final void method17138() {
		int var0 = ReceivePlayerPositions.highResolutionsCount;
		int[] var1 = ReceivePlayerPositions.highResolutionsIndices;
		int var2 = preferences.idleAnimations.getValue();
		boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
		for (int var4 = 0; var4 < var0; var4++) {
			PlayerEntity var5 = players[var1[var4]];
			if (!var5.method19119()) {
				var5.field10404 = -1;
			} else if (var5.visibility.isHidden()) {
				var5.field10404 = -1;
			} else {
				var5.method16529();
				if (var5.minSceneTileX >= 0 && var5.minSceneTileZ >= 0 && var5.maxSceneTileX < world.getSizeX() && var5.maxSceneTileZ < world.getSizeZ()) {
					var5.field12053 = var5.field10432.field11877 ? var3 : false;
					if (localPlayerEntity == var5) {
						var5.field10404 = Integer.MAX_VALUE;
					} else {
						int var6 = 0;
						if (!var5.field10452) {
							var6++;
						}
						if (!var5.field10416.isEmpty()) {
							var6 += 2;
						}
						int var7 = var6 + (5 - var5.size() << 2);
						if (CommunityPartnerType.field1950 == var5.field12070 && !var5.field12048) {
							if (drawOrder == 0) {
								var7 += 32;
							} else {
								var7 += 128;
							}
							var7 += 256;
						} else {
							var7 += 512;
						}
						if (var5.targeted() == activeTarget) {
							var7 += 2047;
						}
						var5.field10404 = var7 + 1;
					}
				} else {
					var5.field10404 = -1;
				}
			}
		}
		for (int var8 = 0; var8 < npcSlotCount; var8++) {
			NpcEntity var9 = (NpcEntity) ((ObjectNode) npcs.get((long) field11036[var8])).value;
			if (var9.exists() && var9.npcType.isVisible(localPlayerGameState, localPlayerGameState)) {
				var9.method16529();
				if (var9.minSceneTileX >= 0 && var9.minSceneTileZ >= 0 && var9.maxSceneTileX < world.getSizeX() && var9.maxSceneTileZ < world.getSizeZ()) {
					int var10 = 0;
					if (!var9.field10452) {
						var10++;
					}
					if (!var9.field10416.isEmpty()) {
						var10 += 2;
					}
					if (var9.size() < 5) {
						var10 += 5 - var9.size() << 2;
					}
					if (drawOrder == 0) {
						if (var9.npcType.follower) {
							var10 += 64;
						} else {
							var10 += 128;
						}
					} else if (drawOrder == 1) {
						if (var9.npcType.follower) {
							var10 += 32;
						} else {
							var10 += 64;
						}
					}
					if (var9.npcType.drawabove) {
						var10 += 1024;
					} else if (!var9.npcType.drawbelow) {
						var10 += 256;
					}
					if (var9.targeted() == activeTarget) {
						var10 += 2047;
					}
					var9.field10404 = var10 + 1;
				} else {
					var9.field10404 = -1;
				}
			} else {
				var9.field10404 = -1;
			}
		}
		for (int var11 = 0; var11 < hintArrows.length; var11++) {
			HintArrow var12 = hintArrows[var11];
			if (var12 != null) {
				if (var12.hintType == 1) {
					ObjectNode var13 = (ObjectNode) npcs.get((long) var12.field744);
					if (var13 != null) {
						NpcEntity var14 = (NpcEntity) var13.value;
						if (var14.field10404 >= 0) {
							var14.field10404 += 2048;
						}
					}
				} else if (var12.hintType == 10) {
					PlayerEntity var15 = players[var12.field744];
					if (var15 != null && localPlayerEntity != var15 && var15.field10404 >= 0) {
						var15.field10404 += 2048;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.hw()V")
	public static final void method16922() {
		int[][] var0 = world.method7740();
		int var1 = world.getSizeX();
		int var2 = world.getSizeZ();
		for (int var3 = 0; var3 < var1; var3++) {
			int[] var4 = var0[var3];
			for (int var5 = 0; var5 < var2; var5++) {
				var4[var5] = 0;
			}
		}
	}

	@ObfuscatedName("client.ht(I)V")
	public static final void method17232(int arg0) {
		int var1 = ReceivePlayerPositions.highResolutionsCount;
		int[] var2 = ReceivePlayerPositions.highResolutionsIndices;
		int[][] var3 = world.method7740();
		int[][] var4 = world.method7858();
		int var5;
		if (sceneState == 0) {
			var5 = CutsceneManager.entities.length;
		} else {
			var5 = npcSlotCount + var1;
		}
		for (int var6 = 0; var6 < var5; var6++) {
			PathingEntity var8;
			if (sceneState == 0) {
				CutsceneEntity var7 = CutsceneManager.entities[var6];
				if (!var7.exists) {
					continue;
				}
				var8 = var7.getEntity();
			} else {
				if (var6 < var1) {
					var8 = players[var2[var6]];
				} else {
					var8 = (PathingEntity) ((ObjectNode) npcs.get((long) field11036[var6 - var1])).value;
				}
				if (var8.level != arg0 || var8.field10404 < 0 || var8.field10401) {
					continue;
				}
			}
			int var9 = var8.size();
			Vector3 var10 = var8.getTransform().trans;
			if ((var9 & 0x1) == 0) {
				if (((int) var10.x & 0x1FF) != 0 || ((int) var10.z & 0x1FF) != 0) {
					continue;
				}
			} else if (((int) var10.x & 0x1FF) != 256 || ((int) var10.z & 0x1FF) != 256) {
				continue;
			}
			int var10002;
			if (var9 == 1) {
				int var11 = (int) var10.x >> 9;
				int var12 = (int) var10.z >> 9;
				if (var8.field10404 > var3[var11][var12]) {
					var3[var11][var12] = var8.field10404;
					var4[var11][var12] = 1;
				} else if (var8.field10404 == var3[var11][var12]) {
					var10002 = var4[var11][var12]++;
				}
			} else {
				int var13 = (var9 - 1) * 256 + 60;
				int var14 = (int) var10.x - var13 >> 9;
				int var15 = (int) var10.z - var13 >> 9;
				int var16 = (int) var10.x + var13 >> 9;
				int var17 = (int) var10.z + var13 >> 9;
				for (int var18 = var14; var18 <= var16; var18++) {
					for (int var19 = var15; var19 <= var17; var19++) {
						if (var8.field10404 > var3[var18][var19]) {
							var3[var18][var19] = var8.field10404;
							var4[var18][var19] = 1;
						} else if (var8.field10404 == var3[var18][var19]) {
							var10002 = var4[var18][var19]++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.hc(I)V")
	public static final void method16924(int arg0) {
		int var1 = ReceivePlayerPositions.highResolutionsCount;
		int[] var2 = ReceivePlayerPositions.highResolutionsIndices;
		int[][] var3 = world.method7740();
		int[][] var4 = world.method7858();
		int var5;
		if (sceneState == 0) {
			var5 = CutsceneManager.entities.length;
		} else {
			var5 = field10808 ? var1 : npcSlotCount + var1;
		}
		for (int var6 = 0; var6 < var5; var6++) {
			PathingEntity var8;
			if (sceneState == 0) {
				CutsceneEntity var7 = CutsceneManager.entities[var6];
				if (!var7.exists) {
					continue;
				}
				var8 = var7.getEntity();
			} else {
				if (var6 < var1) {
					var8 = players[var2[var6]];
				} else {
					var8 = (PathingEntity) ((ObjectNode) npcs.get((long) field11036[var6 - var1])).value;
				}
				if (var8.level != arg0) {
					continue;
				}
				if (var8.field10404 < 0) {
					var8.field10452 = false;
					continue;
				}
			}
			var8.field10402 = 0;
			int var9 = var8.size();
			Vector3 var10 = var8.getTransform().trans;
			if ((var9 & 0x1) == 0) {
				if (((int) var10.x & 0x1FF) != 0 || ((int) var10.z & 0x1FF) != 0) {
					var8.field10452 = false;
					continue;
				}
			} else if (((int) var10.x & 0x1FF) != 256 || ((int) var10.z & 0x1FF) != 256) {
				var8.field10452 = false;
				continue;
			}
			if (sceneState != 0 && !var8.field10401) {
				int var10002;
				if (var9 == 1) {
					int var11 = (int) var10.x >> 9;
					int var12 = (int) var10.z >> 9;
					if (var8.field10404 != var3[var11][var12]) {
						var8.field10452 = true;
						continue;
					}
					if (var4[var11][var12] > 1) {
						var10002 = var4[var11][var12]--;
						var8.field10452 = true;
						continue;
					}
				} else {
					int var13 = (var9 - 1) * 256 + 252;
					int var14 = (int) var10.x - var13 >> 9;
					int var15 = (int) var10.z - var13 >> 9;
					int var16 = (int) var10.x + var13 >> 9;
					int var17 = (int) var10.z + var13 >> 9;
					if (!method4507(var3, var4, var8.field10404, var14, var15, var16, var17)) {
						for (int var18 = var14; var18 <= var16; var18++) {
							for (int var19 = var15; var19 <= var17; var19++) {
								if (var8.field10404 == var3[var18][var19]) {
									var10002 = var4[var18][var19]--;
								}
							}
						}
						var8.field10452 = true;
						continue;
					}
				}
			}
			var8.field10452 = false;
			if (var8.forceMoveEndCycle <= loopCycle && var8.forceMoveStartCycle < loopCycle || var8.field10428 == var8.field10419) {
				var8.setPosition(var10.x, (float) getHeightmapY((int) var10.x, (int) var10.z, var8.level), var10.z);
			}
			world.getScene().addEntity(var8, true);
		}
	}

	@ObfuscatedName("il.ho([[I[[IIIIIII)Z")
	public static final boolean method4507(int[][] arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		for (int var7 = arg3; var7 <= arg5; var7++) {
			for (int var8 = arg4; var8 <= arg6; var8++) {
				if (arg0[var7][var8] == arg2 && arg1[var7][var8] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("client.hj()V")
	public static final void method16925() {
		field10919 = 0;
		for (int var0 = 0; var0 < npcSlotCount; var0++) {
			NpcEntity var1 = (NpcEntity) ((ObjectNode) npcs.get((long) field11036[var0])).value;
			if (var1.field10452 && var1.getCoverMarker() != -1) {
				int var2 = (var1.size() - 1) * 256 + 252;
				Vector3 var3 = var1.getTransform().trans;
				int var4 = (int) var3.x - var2 >> 9;
				int var5 = (int) var3.z - var2 >> 9;
				PathingEntity var6 = method16448(var1.level, var4, var5);
				if (var6 != null) {
					int var7 = var6.localPlayerIndex;
					if (var6 instanceof NpcEntity) {
						var7 += 2048;
					}
					if (var6.field10402 == 0 && var6.getCoverMarker() != -1) {
						field10917[field10919] = var7;
						field10918[field10919] = var7;
						field10919++;
						var6.field10402++;
					}
					field10917[field10919] = var7;
					field10918[field10919] = var1.localPlayerIndex + 2048;
					field10919++;
					var6.field10402++;
				}
			}
		}
		Algorithms.method15233(field10918, field10917, 0, field10919 - 1);
	}

	@ObfuscatedName("agd.hv(IIII)Lahm;")
	public static PathingEntity method16448(int arg0, int arg1, int arg2) {
		Tile var3 = world.getScene().levelTiles[arg0][arg1][arg2];
		if (var3 == null) {
			return null;
		}
		PathingEntity var4 = null;
		int var5 = -1;
		for (PrimaryLayerEntityList var6 = var3.entities; var6 != null; var6 = var6.field7058) {
			PrimaryLayerEntity var7 = var6.field7057;
			if (var7 instanceof PathingEntity) {
				PathingEntity var8 = (PathingEntity) var7;
				int var9 = (var8.size() - 1) * 256 + 252;
				Vector3 var10 = var8.getTransform().trans;
				int var11 = (int) var10.x - var9 >> 9;
				int var12 = (int) var10.z - var9 >> 9;
				int var13 = (int) var10.x + var9 >> 9;
				int var14 = (int) var10.z + var9 >> 9;
				if (var11 <= arg1 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
					int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
					if (var15 > var5) {
						var4 = var8;
						var5 = var15;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("client.hz()V")
	public static final void method16929() {
		int var0 = ReceivePlayerPositions.highResolutionsCount;
		int[] var1 = ReceivePlayerPositions.highResolutionsIndices;
		int var2;
		if (sceneState == 0) {
			var2 = CutsceneManager.entities.length;
		} else {
			var2 = field10808 ? var0 : npcSlotCount + var0;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			PathingEntity var5;
			if (sceneState == 0) {
				CutsceneEntity var4 = CutsceneManager.entities[var3];
				if (!var4.exists) {
					continue;
				}
				var5 = var4.getEntity();
			} else {
				if (var3 < var0) {
					var5 = players[var1[var3]];
				} else {
					var5 = (PathingEntity) ((ObjectNode) npcs.get((long) field11036[var3 - var0])).value;
				}
				if (var5.field10404 < 0) {
					continue;
				}
			}
			int var6 = var5.size();
			Vector3 var7 = var5.getTransform().trans;
			if ((var6 & 0x1) == 0) {
				if (((int) var7.x & 0x1FF) == 0 && ((int) var7.z & 0x1FF) == 0) {
					continue;
				}
			} else if (((int) var7.x & 0x1FF) == 256 && ((int) var7.z & 0x1FF) == 256) {
				continue;
			}
			if (var5.forceMoveEndCycle <= loopCycle && var5.forceMoveStartCycle < loopCycle || var5.field10428 == var5.field10419) {
				var5.setPosition(var7.x, (float) getHeightmapY((int) var7.x, (int) var7.z, var5.level), var7.z);
			}
			world.getScene().addEntity(var5, true);
		}
	}

	@ObfuscatedName("ks.ij(I)V")
	public static final void pushProjectiles() {
		for (ProjectileEntityNode var0 = (ProjectileEntityNode) projectiles.head(); var0 != null; var0 = (ProjectileEntityNode) projectiles.next()) {
			ProjectileAnimation var1 = var0.field12309;
			if (loopCycle > var1.lastCycle) {
				var0.unlink();
				var1.method19728();
			} else if (loopCycle >= var1.startCycle) {
				var1.method19729();
				if (var1.target > 0) {
					if (sceneState == 0) {
						PathingEntity var2 = CutsceneManager.entities[var1.target - 1].getEntity();
						if (var2 != null) {
							Vector3 var3 = var2.getTransform().trans;
							if ((int) var3.x >= 0 && (int) var3.x < world.getSizeX() * 512 && (int) var3.z >= 0 && (int) var3.z < world.getSizeZ() * 512) {
								var1.updateVelocity((int) var3.x, (int) var3.z, getHeightmapY((int) var3.x, (int) var3.z, var2.level) - var1.offsetY, loopCycle);
							}
						}
					} else {
						ObjectNode var4 = (ObjectNode) npcs.get((long) (var1.target - 1));
						if (var4 != null) {
							NpcEntity var5 = (NpcEntity) var4.value;
							Vector3 var6 = var5.getTransform().trans;
							if ((int) var6.x >= 0 && (int) var6.x < world.getSizeX() * 512 && (int) var6.z >= 0 && (int) var6.z < world.getSizeZ() * 512) {
								var1.updateVelocity((int) var6.x, (int) var6.z, getHeightmapY((int) var6.x, (int) var6.z, var1.level) - var1.offsetY, loopCycle);
							}
						}
					}
				}
				if (var1.target < 0) {
					int var7 = -var1.target - 1;
					PlayerEntity var8;
					if (currentPlayerUid == var7) {
						var8 = localPlayerEntity;
					} else {
						var8 = players[var7];
					}
					if (var8 != null) {
						Vector3 var9 = var8.getTransform().trans;
						if ((int) var9.x >= 0 && (int) var9.x < world.getSizeX() * 512 && (int) var9.z >= 0 && (int) var9.z < world.getSizeZ() * 512) {
							var1.updateVelocity((int) var9.x, (int) var9.z, getHeightmapY((int) var9.x, (int) var9.z, var1.level) - var1.offsetY, loopCycle);
						}
					}
				}
				var1.update(sceneDelta);
				world.getScene().addEntity(var1, true);
			}
		}
	}

	@ObfuscatedName("sr.io(B)V")
	public static final void updateSpotAnims() {
		Iterator var0 = spotanims.iterator();
		while (var0.hasNext()) {
			SpotAnimEntityNode var1 = (SpotAnimEntityNode) var0.next();
			SpotAnimation var2 = var1.field12264;
			var2.method19746(1);
			if (var2.method19747()) {
				var1.unlink();
				var2.method19749();
			}
		}
	}

	@ObfuscatedName("gm.iq(I)V")
	public static final void pushSpotanims() {
		Iterator var0 = spotanims.iterator();
		while (var0.hasNext()) {
			SpotAnimEntityNode var1 = (SpotAnimEntityNode) var0.next();
			SpotAnimation var2 = var1.field12264;
			if (world.getScene() != null && var2.method19751()) {
				world.getScene().addEntity(var2, true);
			}
		}
	}

	@ObfuscatedName("sp.ig(IIIII)V")
	public static final void draw3DEntityElements(int arg0, int arg1, int arg2, int arg3) {
		MiniMenu.drawMenu(toolkit);
		drawTextCoords(arg0, arg1, arg2, arg3, 256, 256);
		draw2DEntityElements(arg0, arg1, arg2, arg3, 256, 256);
		drawHintArrows(arg0, arg1, arg2, arg3, 256, 256);
		drawCrossSprites(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ahs.iv(IIIIIII)V")
	public static final void drawTextCoords(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		for (TextCoord var6 = (TextCoord) textCoords.peekFront(); var6 != null; var6 = (TextCoord) textCoords.prev()) {
			if (loopCycle >= var6.field11203) {
				var6.unlink();
			} else {
				project(var6.field11206, (var6.field11202 << 9) + 256, (var6.field11204 << 9) + 256, 0, var6.field11205 * 2, false, false);
				DefaultSprites.b12FullFont.drawStringCenter(var6.field11208, (int) (projection[0] + (float) arg0), (int) (projection[1] + (float) arg1), var6.field11207 | 0xFF000000, 0);
			}
		}
	}

	@ObfuscatedName("pm.ie(IIIIIIB)V")
	public static final void drawHintArrows(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		HintArrow[] var6 = hintArrows;
		for (int var7 = 0; var7 < var6.length; var7++) {
			HintArrow var8 = var6[var7];
			if (var8 != null && var8.hintType == 2) {
				project(var8.field749, var8.hintOffsetX, var8.hintOffsetZ, 0, var8.field742 * 2, false, false);
				if (projection[0] > -1.0F && loopCycle % 20 < 10) {
					Sprite var9 = DefaultSprites.hintarrowSprites[var8.field751];
					int var10 = (int) (projection[0] + (float) arg0 - 12.0F);
					int var11 = (int) (projection[1] + (float) arg1 - 28.0F);
					var9.drawSprite(var10, var11);
				}
			}
		}
	}

	@ObfuscatedName("qz.iu(IIIIIIB)V")
	public static final void draw2DEntityElements(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int playerCount = ReceivePlayerPositions.highResolutionsCount;
		int[] var7 = ReceivePlayerPositions.highResolutionsIndices;
		chatCount = 0;
		int var8;
		if (sceneState == 0) {
			var8 = CutsceneManager.entities.length;
		} else {
			var8 = npcSlotCount + playerCount;
		}
		for (int var9 = 0; var9 < var8; var9++) {
			NPCType var10 = null;
			PathingEntity var12;
			if (sceneState == 0) {
				CutsceneEntity var11 = CutsceneManager.entities[var9];
				if (!var11.exists) {
					continue;
				}
				var12 = var11.getEntity();
				if (sceneCycle != var12.field11715) {
					continue;
				}
				if (var11.field1743 >= 0) {
					var10 = ((NpcEntity) var12).npcType;
					if (var10.multinpc != null) {
						var10 = var10.getMultiNPC(localPlayerGameState, localPlayerGameState);
						if (var10 == null) {
							continue;
						}
					}
				}
			} else {
				if (var9 < playerCount) {
					var12 = players[var7[var9]];
				} else {
					var12 = (PathingEntity) ((ObjectNode) npcs.get((long) field11036[var9 - playerCount])).value;
					var10 = ((NpcEntity) var12).npcType;
					if (var10.multinpc != null) {
						var10 = var10.getMultiNPC(localPlayerGameState, localPlayerGameState);
						if (var10 == null) {
							continue;
						}
					}
				}
				if (var12.field10404 < 0 || sceneCycle != var12.field11715 && localPlayerEntity.level != var12.level) {
					continue;
				}
			}
			projectFromEntity2d(var12, var12.height(), false);
			if (!(projection[0] < 0.0F)) {
				if (var12.showChat()) {
					EntityChatLine var13 = var12.getChatLine();
					if (var13 != null && chatCount < field11044) {
						String var14 = var13.getText();
						if (emojiList.isAutochat()) {
							var14 = emojiList.substitute(var14);
						}
						chatWidth[chatCount] = DefaultSprites.b12FullMetrics.stringWidth(var14) / 2;
						chatX[chatCount] = (int) projection[0];
						chatY[chatCount] = (int) projection[1];
						chats[chatCount] = var13;
						chatCount++;
					}
				}
				int var15 = (int) (projection[1] + (float) arg1);
				int var16 = var15 - DefaultSprites.b12FullMetrics.field8562;
				boolean var17 = false;
				if (!var12.field10452 && !var12.field10416.isEmpty()) {
					for (Headbar var18 = (Headbar) var12.field10416.peekFront(); var18 != null; var18 = (Headbar) var12.field10416.prev()) {
						HeadbarUpdate var19 = var18.method17457(loopCycle);
						if (var19 != null) {
							HeadbarType var20 = var18.field11215;
							PlayerEntity var21 = players[var7[var9]];
							Sprite var22;
							Sprite var23;
							if (var21 == null || CommunityPartnerType.field1950 == var21.field12070) {
								var22 = var20.getSprite(toolkit, var20.empty);
								var23 = var20.getSprite(toolkit, var20.full);
							} else if (CommunityPartnerType.field1947 == var21.field12070) {
								var22 = var20.getSprite(toolkit, var20.emptylocalpartner);
								var23 = var20.getSprite(toolkit, var20.fulllocalpartner);
							} else {
								var22 = var20.getSprite(toolkit, var20.emptyglobalpartner);
								var23 = var20.getSprite(toolkit, var20.fullglobalpartner);
							}
							if (var22 != null && var23 != null) {
								int var24 = 255;
								boolean var25 = true;
								int var26 = loopCycle - var19.field11219;
								int var27 = var23.getWidth() * var19.field11218 / 255;
								int var30;
								if (var19.field11217 > var26) {
									int var28 = var20.field7220 == 0 ? 0 : var26 / var20.field7220 * var20.field7220;
									int var29 = var23.getWidth() * var19.field11216 / 255;
									var30 = (var27 - var29) * var28 / var19.field11217 + var29;
								} else {
									var30 = var27;
									int var31 = var19.field11217 + var20.sticktime - var26;
									if (var20.fadeout >= 0) {
										var24 = (var31 << 8) / (var20.sticktime - var20.fadeout);
									}
								}
								if (var19.field11218 > 0 && var30 < 2) {
									var30 = 2;
								}
								int var32 = var22.getHeight();
								int var33 = (int) (projection[0] + (float) arg0 - (float) (var22.getWidth() >> 1));
								var16 -= var32;
								if (var24 >= 0 && var24 < 255) {
									int var34 = var24 << 24;
									int var35 = var34 | 0xFFFFFF;
									var22.drawSprite(var33, var16, 0, var35, 1);
									toolkit.setBounds(var33, var16, var30 + var33, var16 + var32);
									var23.drawSprite(var33, var16, 0, var35, 1);
								} else {
									var22.drawSprite(var33, var16);
									toolkit.setBounds(var33, var16, var30 + var33, var16 + var32);
									var23.drawSprite(var33, var16);
								}
								toolkit.resetBounds(arg0, arg1, arg0 + arg2, arg1 + arg3);
								var16 -= 2;
								var17 = true;
							}
						} else if (var18.method17461()) {
							var18.unlink();
						}
					}
				}
				if (!var17) {
					var16 -= graphicsDefaults.field7723 + 2;
				}
				if (!var12.field10452) {
					if (var10 == null) {
						PlayerEntity var36 = (PlayerEntity) var12;
						for (int var37 = 0; var37 < var36.headIconsIds.length; var37++) {
							if (var36.headIconsIds[var37] >= 0) {
								Object var38 = null;
								int var39 = var36.headIconsIds[var37];
								int group = var36.headIconsGroups[var37];
								long var41 = (long) (group << 8 | var39);
								Sprite var43 = (Sprite) headIconsCache.get(var41);
								if (var43 == null) {
									SpriteData[] var44 = SpriteDataProvider.method1608(spritesJs5, group, 0);
									if (var44 == null) {
										continue;
									}
									var43 = toolkit.createSprite(var44[var39], true);
									headIconsCache.put(var43, var41);
								}
								if (var43 != null) {
									var16 -= var43.getHeight();
									var43.drawSprite((int) (projection[0] + (float) arg0 - 12.0F), var16);
									var16 -= 2;
								}
							}
						}
					} else {
						NpcEntity var45 = (NpcEntity) var12;
						int[] var46 = var45.field12080 == null ? var45.npcType.headicon_groupid : var45.field12080.field2682;
						short[] var47 = var45.field12080 == null ? var45.npcType.headicon_id : var45.field12080.field2681;
						if (var47 != null && var46 != null) {
							for (int var48 = 0; var48 < var47.length; var48++) {
								if (var47[var48] >= 0 && var46[var48] >= 0) {
									Object var49 = null;
									long var50 = (long) (var46[var48] << 8 | var47[var48]);
									Sprite var52 = (Sprite) headIconsCache.get(var50);
									if (var52 == null) {
										SpriteData[] var53 = SpriteDataProvider.method1608(spritesJs5, var46[var48], 0);
										if (var53 == null) {
											continue;
										}
										var52 = toolkit.createSprite(var53[var47[var48]], true);
										headIconsCache.put(var52, var50);
									}
									if (var52 != null) {
										var16 -= var52.getHeight();
										var52.drawSprite((int) (projection[0] + (float) arg0 - (float) (var52.getWidth() >> 1)), var16);
										var16 -= 2;
									}
								}
							}
						}
					}
				}
				int var10000;
				if (!(var12 instanceof PlayerEntity)) {
					int var60 = 0;
					HintArrow[] var61 = hintArrows;
					for (int var62 = 0; var62 < var61.length; var62++) {
						HintArrow var63 = var61[var62];
						if (var63 != null && var63.hintType == 1 && var63.field744 == field11036[var9 - playerCount]) {
							Sprite var64 = DefaultSprites.hintarrowSprites[var63.field751];
							if (var64.getHeight() > var60) {
								var60 = var64.getHeight();
							}
							boolean var65;
							if (var63.field743 == 0) {
								var65 = true;
							} else {
								int var66 = GameShell.getLogicRate() * 1000 / var63.field743 / 2;
								var65 = loopCycle % (var66 * 2) < var66;
							}
							if (var65) {
								var64.drawSprite((int) (projection[0] + (float) arg0 - 12.0F), var16 - var64.getHeight());
							}
						}
					}
					if (var60 > 0) {
						var10000 = var16 - (var60 + 2);
					}
				} else if (var9 >= 0) {
					int var54 = 0;
					HintArrow[] var55 = hintArrows;
					for (int var56 = 0; var56 < var55.length; var56++) {
						HintArrow var57 = var55[var56];
						if (var57 != null && var57.hintType == 10 && var57.field744 == var7[var9]) {
							Sprite var58 = DefaultSprites.hintarrowSprites[var57.field751];
							if (var58.getHeight() > var54) {
								var54 = var58.getHeight();
							}
							var58.drawSprite((int) (projection[0] + (float) arg0 - 12.0F), var16 - var58.getHeight());
						}
					}
					if (var54 > 0) {
						var10000 = var16 - (var54 + 2);
					}
				}
				for (int var68 = 0; var68 < graphicsDefaults.maxhitmarks; var68++) {
					int var69 = var12.field10421[var68];
					int var70 = var12.field10411[var68];
					HitmarkType var71 = null;
					int var72 = 0;
					if (var70 >= 0) {
						if (var69 <= loopCycle) {
							continue;
						}
						var71 = (HitmarkType) hitmarkTypeList.list(var12.field10411[var68]);
						var72 = var71.sticktime;
						if (var71 != null && var71.multimark != null) {
							var71 = var71.getVisible(localPlayerGameState, localPlayerGameState);
							if (var71 == null) {
								var12.field10421[var68] = -1;
								continue;
							}
						}
					} else if (var69 < 0) {
						continue;
					}
					int var73 = var12.field10456[var68];
					HitmarkType var74 = null;
					if (var73 >= 0) {
						var74 = (HitmarkType) hitmarkTypeList.list(var73);
						if (var74 != null && var74.multimark != null) {
							var74 = var74.getVisible(localPlayerGameState, localPlayerGameState);
						}
					}
					if (var69 - var72 <= loopCycle) {
						if (var71 == null) {
							var12.field10421[var68] = -1;
						} else {
							int var75 = var12.height() / 2;
							projectFromEntity2d(var12, var75, false);
							if (projection[0] > -1.0F) {
								projection[0] += graphicsDefaults.hitmarkpos_x[var68];
								projection[1] += graphicsDefaults.hitmarkpos_y[var68];
								Object var76 = null;
								Object var77 = null;
								Object var78 = null;
								Object var79 = null;
								int var80 = 0;
								int var81 = 0;
								int var82 = 0;
								int var83 = 0;
								int var84 = 0;
								int var85 = 0;
								int var86 = 0;
								int var87 = 0;
								Sprite var88 = null;
								Sprite var89 = null;
								Sprite var90 = null;
								Sprite var91 = null;
								int var92 = 0;
								int var93 = 0;
								int var94 = 0;
								int var95 = 0;
								int var96 = 0;
								int var97 = 0;
								int var98 = 0;
								int var99 = 0;
								Sprite var100 = var71.getSprite(toolkit);
								if (var100 != null) {
									var80 = var100.getWidth();
									var100.method1432(field11113);
									var84 = field11113[0];
								}
								Sprite var101 = var71.getMiddleGraphicSprite(toolkit);
								if (var101 != null) {
									var81 = var101.getWidth();
									var101.method1432(field11113);
									var85 = field11113[0];
								}
								Sprite var102 = var71.getLeftGraphicSprite(toolkit);
								if (var102 != null) {
									var82 = var102.getWidth();
									var102.method1432(field11113);
									var86 = field11113[0];
								}
								Sprite var103 = var71.getRightGraphicSprite(toolkit);
								if (var103 != null) {
									var83 = var103.getWidth();
									var103.method1432(field11113);
									var87 = field11113[0];
								}
								if (var74 != null) {
									var88 = var74.getSprite(toolkit);
									if (var88 != null) {
										var92 = var88.getWidth();
										var88.method1432(field11113);
										var96 = field11113[0];
									}
									var89 = var74.getMiddleGraphicSprite(toolkit);
									if (var89 != null) {
										var93 = var89.getWidth();
										var89.method1432(field11113);
										var97 = field11113[0];
									}
									var90 = var74.getLeftGraphicSprite(toolkit);
									if (var90 != null) {
										var94 = var90.getWidth();
										var90.method1432(field11113);
										var98 = field11113[0];
									}
									var91 = var74.getRightGraphicSprite(toolkit);
									if (var91 != null) {
										var95 = var91.getWidth();
										var91.method1432(field11113);
										var99 = field11113[0];
									}
								}
								Font var104 = DefaultSprites.p11FullFont;
								Font var105 = DefaultSprites.p11FullFont;
								FontMetrics var106 = DefaultSprites.p11FullMetrics;
								FontMetrics var107 = DefaultSprites.p11FullMetrics;
								int var108 = var71.damagefont;
								if (var108 >= 0) {
									Font var109 = (Font) fontProvider.getFont(fontFactory, var108, true, var71.damagecolour_set);
									FontMetrics var110 = fontProvider.getFontMetrics(fontFactory, var108);
									if (var109 != null && var110 != null) {
										var104 = var109;
										var106 = var110;
									}
								}
								if (var74 != null) {
									int var111 = var74.damagefont;
									if (var111 >= 0) {
										Font var112 = (Font) fontProvider.getFont(fontFactory, var111, true, var74.damagecolour_set);
										FontMetrics var113 = fontProvider.getFontMetrics(fontFactory, var111);
										if (var112 != null && var113 != null) {
											var105 = var112;
											var107 = var113;
										}
									}
								}
								Object var114 = null;
								String var115 = null;
								boolean var116 = false;
								int var117 = 0;
								String var118 = var71.method9252(var12.field10412[var68]);
								int var119 = var106.stringWidth(var118);
								if (var74 != null) {
									var115 = var74.method9252(var12.field10445[var68]);
									var117 = var107.stringWidth(var115);
								}
								int var120 = 0;
								int var121 = 0;
								if (var81 > 0) {
									var120 = var119 / var81 + 1;
								}
								if (var74 != null && var93 > 0) {
									var121 = var117 / var93 + 1;
								}
								int var122 = 0;
								int var123 = var122;
								if (var80 > 0) {
									var122 += var80;
								}
								var122 += 2;
								int var124 = var122;
								if (var82 > 0) {
									var122 += var82;
								}
								int var125 = var122;
								int var126 = var122;
								int var128;
								if (var81 > 0) {
									int var127 = var81 * var120;
									var128 = var122 + var127;
									var126 = (var127 - var119) / 2 + var122;
								} else {
									var128 = var119 + var122;
								}
								int var129 = var128;
								if (var83 > 0) {
									var128 += var83;
								}
								int var130 = 0;
								int var131 = 0;
								int var132 = 0;
								int var133 = 0;
								int var134 = 0;
								if (var74 != null) {
									var128 += 2;
									var130 = var128;
									if (var92 > 0) {
										var128 += var92;
									}
									var128 += 2;
									var131 = var128;
									if (var94 > 0) {
										var128 += var94;
									}
									var132 = var128;
									var134 = var128;
									if (var93 > 0) {
										int var135 = var93 * var121;
										var128 += var135;
										var134 += (var135 - var117) / 2;
									} else {
										var128 += var117;
									}
									var133 = var128;
									if (var95 > 0) {
										var128 += var95;
									}
								}
								int var136 = var12.field10421[var68] - loopCycle;
								int var137 = var71.scrolltooffsetx - var71.scrolltooffsetx * var136 / var71.sticktime;
								int var138 = var71.scrolltooffsety * var136 / var71.sticktime + -var71.scrolltooffsety;
								int var139 = (int) (projection[0] + (float) arg0 - (float) (var128 >> 1) + (float) var137);
								int var140 = (int) (projection[1] + (float) arg1 - 12.0F + (float) var138);
								int var141 = var71.damageyof + var140 + 15;
								int var142 = 0;
								if (var74 != null) {
									var142 = var74.damageyof + var140 + 15;
								}
								int var143 = 255;
								if (var71.fadeat >= 0) {
									var143 = (var136 << 8) / (var71.sticktime - var71.fadeat);
								}
								if (var143 >= 0 && var143 < 255) {
									int var144 = var143 << 24;
									int var145 = var144 | 0xFFFFFF;
									if (var100 != null) {
										var100.drawSprite(var123 + var139 - var84, var140, 0, var145, 1);
									}
									if (var102 != null) {
										var102.drawSprite(var71.graphicxof + (var124 + var139 - var86), var71.graphicyof + var140, 0, var145, 1);
									}
									if (var101 != null) {
										for (int var146 = 0; var146 < var120; var146++) {
											var101.drawSprite(var71.graphicxof + var81 * var146 + (var125 + var139 - var85), var71.graphicyof + var140, 0, var145, 1);
										}
									}
									if (var103 != null) {
										var103.drawSprite(var71.graphicxof + (var129 + var139 - var87), var71.graphicyof + var140, 0, var145, 1);
									}
									var104.drawString(var118, var126 + var139, var141, var71.damagecolour | var144, 0);
									if (var74 != null) {
										if (var88 != null) {
											var88.drawSprite(var130 + var139 - var96, var140, 0, var145, 1);
										}
										if (var90 != null) {
											var90.drawSprite(var74.graphicxof + (var131 + var139 - var98), var74.graphicyof + var140, 0, var145, 1);
										}
										if (var89 != null) {
											for (int var147 = 0; var147 < var121; var147++) {
												var89.drawSprite(var74.graphicxof + var93 * var147 + (var132 + var139 - var97), var74.graphicyof + var140, 0, var145, 1);
											}
										}
										if (var91 != null) {
											var91.drawSprite(var74.graphicxof + (var133 + var139 - var99), var74.graphicyof + var140, 0, var145, 1);
										}
										var105.drawString(var115, var134 + var139, var142, var74.damagecolour | var144, 0);
									}
								} else {
									if (var100 != null) {
										var100.drawSprite(var123 + var139 - var84, var140);
									}
									if (var102 != null) {
										var102.drawSprite(var71.graphicxof + (var124 + var139 - var86), var71.graphicyof + var140);
									}
									if (var101 != null) {
										for (int var148 = 0; var148 < var120; var148++) {
											var101.drawSprite(var71.graphicxof + var81 * var148 + (var125 + var139 - var85), var71.graphicyof + var140);
										}
									}
									if (var103 != null) {
										var103.drawSprite(var71.graphicxof + (var129 + var139 - var87), var71.graphicyof + var140);
									}
									var104.drawString(var118, var126 + var139, var141, var71.damagecolour | 0xFF000000, 0);
									if (var74 != null) {
										if (var88 != null) {
											var88.drawSprite(var130 + var139 - var96, var140);
										}
										if (var90 != null) {
											var90.drawSprite(var74.graphicxof + (var131 + var139 - var98), var74.graphicyof + var140);
										}
										if (var89 != null) {
											for (int var149 = 0; var149 < var121; var149++) {
												var89.drawSprite(var74.graphicxof + var93 * var149 + (var132 + var139 - var97), var74.graphicyof + var140);
											}
										}
										if (var91 != null) {
											var91.drawSprite(var74.graphicxof + (var133 + var139 - var99), var74.graphicyof + var140);
										}
										var105.drawString(var115, var134 + var139, var142, var74.damagecolour | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int var150 = 0; var150 < field10919; var150++) {
			int var151 = field10917[var150];
			PathingEntity var152;
			if (var151 < 2048) {
				var152 = players[var151];
			} else {
				var152 = (PathingEntity) ((ObjectNode) npcs.get((long) (var151 - 2048))).value;
			}
			int var153 = field10918[var150];
			PathingEntity var154;
			if (var153 < 2048) {
				var154 = players[var153];
			} else {
				var154 = (PathingEntity) ((ObjectNode) npcs.get((long) (var153 - 2048))).value;
			}
			method6810(var152, var154, --var152.field10402, arg0, arg1, arg2, arg3, arg4, arg5);
		}
		int chatHeight = DefaultSprites.b12FullMetrics.field8569 + DefaultSprites.b12FullMetrics.field8562 + 2;
		for (int index = 0; index < chatCount; index++) {
			int x = chatX[index];
			int y = chatY[index];
			int padding = chatWidth[index];
			boolean sorting = true;
			while (sorting) {
				sorting = false;
				for (int j = 0; j < index; j++) {
					if (y + 2 > chatY[j] - chatHeight && y - chatHeight < chatY[j] + 2 && x - padding < chatWidth[j] + chatX[j] && x + padding > chatX[j] - chatWidth[j] && chatY[j] - chatHeight < y) {
						y = chatY[j] - chatHeight;
						sorting = true;
					}
				}
			}
			chatY[index] = y;
			String message = chats[index].getText();
			if (emojiList.isAutochat()) {
				message = emojiList.substitute(message);
			}
			if (chatEffects == 0) {
				int colour = 16776960;
				int chatColour = chats[index].getColour();
				if (chatColour < 6) {
					colour = chatColours[chatColour];
				}
				if (chatColour == 6) {
					colour = sceneCycle % 20 < 10 ? 16711680 : 16776960;
				}
				if (chatColour == 7) {
					colour = sceneCycle % 20 < 10 ? 255 : 65535;
				}
				if (chatColour == 8) {
					colour = sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				if (chatColour == 9) {
					int delta = 150 - chats[index].getTime() * 150 / chats[index].method8280();
					if (delta < 50) {
						colour = delta * 1280 + 16711680;
					} else if (delta < 100) {
						colour = 16776960 - (delta - 50) * 327680;
					} else if (delta < 150) {
						colour = (delta - 100) * 5 + 65280;
					}
				}
				if (chatColour == 10) {
					int delta = 150 - chats[index].getTime() * 150 / chats[index].method8280();
					if (delta < 50) {
						colour = delta * 5 + 16711680;
					} else if (delta < 100) {
						colour = 16711935 - (delta - 50) * 327680;
					} else if (delta < 150) {
						colour = (delta - 100) * 327680 + 255 - (delta - 100) * 5;
					}
				}
				if (chatColour == 11) {
					int delta = 150 - chats[index].getTime() * 150 / chats[index].method8280();
					if (delta < 50) {
						colour = 16777215 - delta * 327685;
					} else if (delta < 100) {
						colour = (delta - 50) * 327685 + 65280;
					} else if (delta < 150) {
						colour = 16777215 - (delta - 100) * 327680;
					}
				}
				int var168 = colour | 0xFF000000;
				int effect = chats[index].getEffect();
				if (effect == 0) {
					DefaultSprites.b12FullFont.drawStringCenter(message, arg0 + x, arg1 + y, var168, -16777216);
				}
				if (effect == 1) {
					DefaultSprites.b12FullFont.drawCenteredWave(message, arg0 + x, arg1 + y, var168, -16777216, sceneCycle);
				}
				if (effect == 2) {
					DefaultSprites.b12FullFont.drawCenteredWave2(message, arg0 + x, arg1 + y, var168, -16777216, sceneCycle);
				}
				if (effect == 3) {
					int var170 = 150 - chats[index].getTime() * 150 / chats[index].method8280();
					DefaultSprites.b12FullFont.drawCenteredShake(message, arg0 + x, arg1 + y, var168, -16777216, sceneCycle, var170);
				}
				if (effect == 4) {
					int delta = 150 - chats[index].getTime() * 150 / chats[index].method8280();
					int var172 = delta * (DefaultSprites.b12FullMetrics.stringWidth(message) + 100) / 150;
					toolkit.setBounds(arg0 + x - 50, arg1, arg0 + x + 50, arg1 + arg3);
					DefaultSprites.b12FullFont.drawString(message, arg0 + x + 50 - var172, arg1 + y, var168, -16777216);
					toolkit.resetBounds(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (effect == 5) {
					int delta = 150 - chats[index].getTime() * 150 / chats[index].method8280();
					int var174 = 0;
					if (delta < 25) {
						var174 = delta - 25;
					} else if (delta > 125) {
						var174 = delta - 125;
					}
					int var175 = DefaultSprites.b12FullMetrics.field8569 + DefaultSprites.b12FullMetrics.field8562;
					toolkit.setBounds(arg0, arg1 + y - var175 - 1, arg0 + arg2, arg1 + y + 5);
					DefaultSprites.b12FullFont.drawStringCenter(message, arg0 + x, arg1 + y + var174, var168, -16777216);
					toolkit.resetBounds(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				DefaultSprites.b12FullFont.drawStringCenter(message, arg0 + x, arg1 + y, -256, -16777216);
			}
		}
	}

	@ObfuscatedName("pm.in(Lahm;Lahm;IIIIIIIB)V")
	public static final void method6810(PathingEntity arg0, PathingEntity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = arg1.getCoverMarker();
		if (var9 == -1) {
			return;
		}
		Object var10 = null;
		Sprite var11 = (Sprite) field10830.get((long) var9);
		if (var11 == null) {
			SpriteData[] var12 = SpriteDataProvider.method1608(spritesJs5, var9, 0);
			if (var12 == null) {
				return;
			}
			var11 = toolkit.createSprite(var12[0], true);
			field10830.put(var11, (long) var9);
		}
		Vector3 var13 = arg0.getTransform().trans;
		project(arg0.level, (int) var13.x, (int) var13.z, arg0.size() * 256, 0, false, false);
		int var14 = (int) (projection[0] + (float) arg3 - 18.0F);
		int var15 = (int) (projection[1] + (float) arg4 - 16.0F - 54.0F);
		int var16 = arg2 / 4 * 18 + var14;
		int var17 = arg2 % 4 * 18 + var15;
		var11.drawSprite(var16, var17);
		if (arg0 == arg1) {
			toolkit.drawRectangle(var16 - 1, var17 - 1, 18, 18, -256);
		}
		CoverMarkerClickbox var18 = CoverMarkerClickbox.method14429();
		var18.field11197 = arg1;
		var18.field11199 = var16;
		var18.field11195 = var17;
		var18.field11200 = var16 + 16;
		var18.field11201 = var17 + 16;
		field10882.pushBack(var18);
	}

	@ObfuscatedName("fp.ir(IIIII)V")
	public static final void drawCrossSprites(int arg0, int arg1, int arg2, int arg3) {
		int var4 = crossX;
		int var5 = crossY;
		if (crossMode == 1) {
			Sprite var6 = DefaultSprites.crossSprites[crossCycle / 100];
			var6.drawSprite(var4 - 8, var5 - 8);
		}
		if (crossMode == 2) {
			Sprite var7 = DefaultSprites.crossSprites[crossCycle / 100 + 4];
			var7.drawSprite(var4 - 8, var5 - 8);
		}
	}

	@ObfuscatedName("vh.it(IIIIIIII)V")
	public static final void method9547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (sceneState != 3) {
			return;
		}
		int var7 = ReceivePlayerPositions.highResolutionsCount;
		int[] var8 = ReceivePlayerPositions.highResolutionsIndices;
		for (int var9 = 0; var9 < var7; var9++) {
			PlayerEntity var10 = players[var8[var9]];
			if (var10 != null) {
				var10.method16518(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
		for (int var11 = 0; var11 < npcSlotCount; var11++) {
			int var12 = field11036[var11];
			ObjectNode var13 = (ObjectNode) npcs.get((long) var12);
			if (var13 != null) {
				((PathingEntity) var13.value).method16518(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
	}

	@ObfuscatedName("aac.ix(Lalh;IZI)V")
	public static final void projectFromEntity3d(GraphEntity arg0, int arg1, boolean arg2) {
		projectFromEntity(arg0, arg1, true, arg2);
	}

	@ObfuscatedName("agy.is(Lalh;IZI)V")
	public static final void projectFromEntity2d(GraphEntity arg0, int arg1, boolean arg2) {
		projectFromEntity(arg0, arg1, false, arg2);
	}

	@ObfuscatedName("adb.ib(Lalh;IZZI)V")
	public static final void projectFromEntity(GraphEntity arg0, int arg1, boolean arg2, boolean arg3) {
		int var7;
		int var8;
		if (arg0 instanceof PrimaryLayerEntity && arg0 instanceof Location) {
			PrimaryLayerEntity var4 = (PrimaryLayerEntity) arg0;
			int var5 = var4.maxSceneTileX - var4.minSceneTileX + 1 << 9;
			int var6 = var4.maxSceneTileZ - var4.minSceneTileZ + 1 << 9;
			var7 = (var4.minSceneTileX << 9) + var5 / 2;
			var8 = (var4.minSceneTileZ << 9) + var6 / 2;
		} else {
			Vector3 var9 = arg0.getTransform().trans;
			var7 = (int) var9.x;
			var8 = (int) var9.z;
		}
		project(arg0.level, var7, var8, 0, arg1, arg2, arg3);
	}

	@ObfuscatedName("amk.il(IIIIIZZI)V")
	public static final void project(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (world.getSizeX() - 2) * 512 || arg2 > (world.getSizeZ() - 2) * 512)) {
			float[] var7 = projection;
			projection[1] = -1.0F;
			var7[0] = -1.0F;
			return;
		}
		int var8 = getHeightmapY(arg1, arg2, arg0) - arg4;
		field10793.setTo(toolkit.method2218());
		field10793.translate((float) arg3, 0.0F, 0.0F);
		toolkit.method2217(field10793);
		if (arg5) {
			toolkit.method2525((float) arg1, (float) var8, (float) arg2, projection);
		} else {
			toolkit.method2507((float) arg1, (float) var8, (float) arg2, projection);
		}
		field10793.translate((float) -arg3, 0.0F, 0.0F);
		toolkit.method2217(field10793);
		if (!arg6) {
			projection[0] -= viewportX;
			projection[1] -= viewportY;
		}
	}

	@ObfuscatedName("gz.iw(IIIB)I")
	public static final int getHeightmapY(int x, int z, int level) {
		if (world.getScene() == null) {
			return 0;
		}
		int var3 = x >> 9;
		int var4 = z >> 9;
		if (var3 < 0 || var4 < 0 || var3 > world.getSizeX() - 1 || var4 > world.getSizeZ() - 1) {
			return 0;
		}
		int realLevel = level;
		if (level < 3 && (world.getSceneLevelTileFlags().flags[1][var3][var4] & 0x2) != 0) {
			realLevel = level + 1;
		}
		return world.getScene().levelHeightmaps[realLevel].getFineHeight(x, z);
	}

	@ObfuscatedName("adi.ip(IIIIII)I")
	public static final int method15200(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (world.getScene() == null) {
			return 0;
		}
		if (arg4 < 3) {
			SceneLevelTileFlags var5 = world.getSceneLevelTileFlags();
			int var6 = arg0 >> 9;
			int var7 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > world.getSizeX() - 1 || arg3 > world.getSizeZ() - 1) {
				return 0;
			}
			if (var6 < 1 || var7 < 1 || var6 > world.getSizeX() - 1 || var7 > world.getSizeZ() - 1) {
				return 0;
			}
			boolean var8 = (var5.flags[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			if ((arg0 & 0x1FF) == 0) {
				boolean var9 = (var5.flags[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
				boolean var10 = (var5.flags[1][var6][arg1 >> 9] & 0x2) != 0;
				if (var9 != var10) {
					var8 = (var5.flags[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				boolean var11 = (var5.flags[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
				boolean var12 = (var5.flags[1][arg0 >> 9][var7] & 0x2) != 0;
				if (var11 != var12) {
					var8 = (var5.flags[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (var8) {
				arg4++;
			}
		}
		return world.getScene().levelHeightmaps[arg4].getFineHeight(arg0, arg1);
	}

	@ObfuscatedName("zs.id(IIIIIIIB)V")
	public static final void orbitCamera(int targetX, int targetY, int targetZ, int pitch, int yaw, int distance, int viewportHeight) {
		int var7 = viewportHeight - 334;
		if (var7 < 0) {
			var7 = 0;
		} else if (var7 > 100) {
			var7 = 100;
		}
		int var8 = (viewportZoomMax - viewportZoomMin) * var7 / 100 + viewportZoomMin;
		int tmp = distance * var8 >> 8;
		int invPitch = 16384 - pitch & 0x3FFF;
		int invYaw = 16384 - yaw & 0x3FFF;
		int x = 0;
		int y = 0;
		int z = tmp;
		if (invPitch != 0) {
			y = Trig1.sin[invPitch] * -tmp >> 14;
			z = Trig1.cos[invPitch] * tmp >> 14;
		}
		if (invYaw != 0) {
			x = Trig1.sin[invYaw] * z >> 14;
			z = Trig1.cos[invYaw] * z >> 14;
		}
		cameraX = targetX - x;
		cameraY = targetY - y;
		cameraZ = targetZ - z;
		cameraPitch = pitch;
		cameraYaw = yaw;
		cameraRoll = 0;
	}

	@ObfuscatedName("pz.ia(III)V")
	public static final void method6820(int arg0, int arg1) {
		MiniMap.flagSceneTileX = arg0;
		MiniMap.flagSceneTileZ = arg1;
		MiniMap.mapFlag = false;
		DelayedStateChange.onMiniMapFlag();
	}

	@ObfuscatedName("el.if(Lax;I)Z")
	public static final boolean readConnection(ServerConnection connection) {
		try {
			return read(connection);
		} catch (IOException ioException) {
			if (state == 15) {
				connection.closeForcefully();
				return false;
			} else {
				tryReconnect();
				return true;
			}
		} catch (Exception exception) {
			CoordGrid var3 = world.getBase();
			String exceptionString = (connection.packetType == null ? -1 : connection.packetType.id) + TextUtil.COMMA + (connection.lastPacketType1 == null ? -1 : connection.lastPacketType1.id) + TextUtil.COMMA + (connection.lastPacketType2 == null ? -1 : connection.lastPacketType2.id) + " " + connection.packetSize + TextUtil.COMMA + (var3.x + localPlayerEntity.routeWaypointX[0]) + TextUtil.COMMA + (var3.z + localPlayerEntity.routeWaypointZ[0]) + " ";
			for (int index = 0; index < connection.packetSize && index < 50; index++) {
                exceptionString = exceptionString + connection.in.data[index] + TextUtil.COMMA;
			}
			JagException.report(exceptionString, exception);
			logout(false);
			return true;
		}
	}

	@ObfuscatedName("yx.ih(Lax;B)Z")
	public static final boolean read(ServerConnection connection) throws IOException {
		Stream stream = connection.getStream();
		PacketBit in = connection.in;
		if (stream == null) {
			return false;
		}
		if (connection.packetType == null) {
			if (connection.field799) {
				if (!stream.hasAvailable(1)) {
					return false;
				}
				stream.read(connection.in.data, 0, 1);
				connection.readPos++;
				connection.idleNetCycles = 0;
				connection.field799 = false;
			}
			in.pos = 0;
			if (in.isIsaac2()) {
				if (!stream.hasAvailable(1)) {
					return false;
				}
				stream.read(connection.in.data, 1, 1);
				connection.readPos++;
				connection.idleNetCycles = 0;
			}
			connection.field799 = true;
			ServerProt[] serverProts = ServerProt.values();
			int packetId = in.gIsaac1or2();
			if (packetId < 0 || packetId >= serverProts.length) {
				throw new IOException(packetId + " " + in.pos);
			}
			connection.packetType = serverProts[packetId];
			connection.packetSize = connection.packetType.size;
		}
		if (connection.packetSize == -1) {
			if (!stream.hasAvailable(1)) {
				return false;
			}
			stream.read(in.data, 0, 1);
			connection.packetSize = in.data[0] & 0xFF;
			connection.readPos++;
			connection.idleNetCycles = 0;
		}
		if (connection.packetSize == -2) {
			if (!stream.hasAvailable(2)) {
				return false;
			}
			stream.read(in.data, 0, 2);
			in.pos = 0;
			connection.packetSize = in.g2();
			connection.readPos += 2;
			connection.idleNetCycles = 0;
		}
		if (connection.packetSize > 0) {
			if (!stream.hasAvailable(connection.packetSize)) {
				return false;
			}
			in.pos = 0;
			stream.read(in.data, 0, connection.packetSize);
			connection.readPos += connection.packetSize;
			connection.idleNetCycles = 0;
		}
		connection.lastPacketType2 = connection.lastPacketType1;
		connection.lastPacketType1 = connection.lastPacketType0;
		connection.lastPacketType0 = connection.packetType;
		if (ServerProt.IF_SETTEXTANTIMACRO == connection.packetType) {
			int var5 = in.g4_alt3();
			boolean var6 = in.g1() == 1;
			incrementVerifyId();
			DelayedStateChange.setInterfaceAntiTextMacro(var5, var6);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLANCHANNEL_FULL == connection.packetType) {
			lastOnClanChannelTransmitRedrawCycle = redrawCycle;
			boolean var7 = in.g1() == 1;
			if (connection.packetSize != 1) {
				if (var7) {
					affinedClanChannel = new ClanChannel(in);
				} else {
					listenedClanChannel = new ClanChannel(in);
				}
				connection.packetType = null;
				return true;
			}
			if (var7) {
				affinedClanChannel = null;
			} else {
				listenedClanChannel = null;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARC_SMALL == connection.packetType) {
			byte var8 = in.g1b_alt3();
			int var9 = in.g2();
			incrementVerifyId();
			DelayedStateChange.setVarC(var9, var8);
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_FULL == connection.packetType) {
			telemetry.method3273();
			int var10 = in.g1();
			for (int var11 = 0; var11 < var10; var11++) {
				int var12 = in.g4s();
				TelemetryGroup var13 = new TelemetryGroup(var12);
				telemetry.method3270(var13);
				int var14 = in.g1();
				for (int var15 = 0; var15 < var14; var15++) {
					var13.method3298(in.g4s());
				}
				int var16 = in.g1();
				for (int var17 = 0; var17 < var16; var17++) {
					var13.method3320(in.g4s());
				}
				for (int var18 = 0; var18 < var14; var18++) {
					byte var19 = in.g1b();
					var13.method3319(var18, var19);
					for (int var20 = 0; var20 < var16; var20++) {
						if (in.g1() == 0) {
							var13.clearGridValue(var18, var20, null);
						} else {
							var13.clearGridValue(var18, var20, in.g4s());
						}
					}
				}
			}
			telemetryError = false;
			connection.packetType = null;
			return true;
		} else if (ServerProt.SET_MOVEACTION == connection.packetType) {
			field4868 = connection.packetSize > 2 ? in.gjstr() : LocalisedText.WALKHERE.forLang(language);
			field10963 = connection.packetSize > 0 ? in.g2() : -1;
			if (field10963 == 65535) {
				field10963 = -1;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_SITESETTINGS == connection.packetType) {
			setSiteSettings(in.gjstr());
			connection.packetType = null;
			return true;
		} else if (ServerProt.SHOW_FACE_HERE == connection.packetType) {
			boolean var21 = in.g1_alt3() == 1;
			incrementVerifyId();
			MiniMenu.showFaceHere = var21;
			connection.packetType = null;
			return true;
		} else if (ServerProt.CHAT_FILTER_SETTINGS_PRIVATECHAT == connection.packetType) {
			privateChatFilter = PrivateChatFilter.method3374(in.g1());
			connection.packetType = null;
			return true;
		} else if (ServerProt.NO_TIMEOUT == connection.packetType) {
			connection.packetType = null;
			return true;
		} else if (ServerProt.URL_OPEN == connection.packetType) {
			if (Fullscreen.allowed && GameShell.fsframe != null) {
				setWindowMode(preferences.windowMode.getValue(), -1, -1, false);
			}
			byte[] var22 = new byte[connection.packetSize - 1];
			boolean var23 = in.g1() == 1;
			in.gIsaacArrayBuffer(var22, 0, connection.packetSize - 1);
			Packet var24 = new Packet(var22);
			String var25 = var24.gjstr();
			if (var23) {
				String var26 = var24.gjstr();
				if (var26.length() == 0) {
					var26 = var25;
				}
				if (!javascriptEnabled || GameShell.osName.startsWith("mac") || !Browser.method2898(var25, 1, JavascriptFunction.field4033.method6087())) {
					Browser.openUrl(var26, true, field10784);
				}
			} else {
				Browser.openUrl(var25, true, field10784);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_FORCEANGLE == connection.packetType) {
			int var27 = in.g2_alt1();
			int var28 = in.g2();
			incrementVerifyId();
			cameraForceAngle(var28, var27, 0);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_RESET == connection.packetType) {
			incrementVerifyId();
			cameraReset(getDefaultCameraState());
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_INV_PARTIAL == connection.packetType) {
			int var29 = in.g2();
			int var30 = in.g1();
			boolean var31 = (var30 & 0x1) != 0;
			boolean var32 = (var30 & 0x2) != 0;
			while (in.pos < connection.packetSize) {
				int var33 = in.gSmart1or2();
				int var34 = in.g2();
				int var35 = 0;
				VarContainerSparse var36 = null;
				if (var34 != 0) {
					var35 = in.g1();
					if (var35 == 255) {
						var35 = in.g4s();
					}
					if (var32) {
						int var37 = in.g1();
						if (var37 > 0) {
							var36 = new VarContainerSparse(varObjTypeList);
							while (var37-- > 0) {
								VarValue var38 = varObjTypeList.decodeVarValue(in);
								var36.setVarValue(var38.var, var38.value);
							}
						}
					}
				}
				ClientInvCache.update(var29, var33, var34 - 1, var35, var36, var31);
			}
			field10783[++field11012 - 1 & 0x3F] = var29;
			connection.packetType = null;
			return true;
		} else if (ServerProt.TEXT_COORD == connection.packetType) {
			handleZonePacket(ZoneProt.TEXT_COORD);
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_CLEAR_GRID_VALUE == connection.packetType) {
			if (!telemetryError) {
				try {
					int var39 = in.g1();
					int var40 = in.g1_alt3();
					int var41 = in.g1_alt3();
					telemetry.getGroup(var39).clearGridValue(var40, var41, null);
				} catch (RuntimeException var719) {
					JagException.report(null, var719);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.OBJ_REVEAL == connection.packetType) {
			handleZonePacket(ZoneProt.OBJ_REVEAL);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETCOLOUR == connection.packetType) {
			int var43 = in.g2_alt2();
			int var44 = in.g4s();
			incrementVerifyId();
			DelayedStateChange.setInterfaceColour(var44, var43);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOGOUT_FULL == connection.packetType) {
			logoutReason = (LogoutReason) SerializableEnums.decode(LogoutReason.method10365(), in.g1());
			logout(LoginManager.field485);
			connection.packetType = null;
			return false;
		} else if (ServerProt.TELEMETRY_GRID_ADD_ROW == connection.packetType) {
			if (!telemetryError) {
				try {
					byte var45 = in.g1b_alt1();
					int var46 = in.g4s();
					int var47 = in.g1_alt3();
					telemetry.getGroup(var47).addRow(var46, var45);
				} catch (RuntimeException var720) {
					JagException.report(null, var720);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SET_PLAYER_OP == connection.packetType) {
			int var49 = in.g1_alt2();
			int var50 = in.g2_alt3();
			if (var50 == 65535) {
				var50 = -1;
			}
			String var51 = in.gjstr();
			int var52 = in.g1_alt3();
			if (var49 >= 1 && var49 <= 8) {
				if (var51.equalsIgnoreCase("null")) {
					var51 = null;
				}
				field10961[var49 - 1] = var51;
				field10832[var49 - 1] = var50;
				field10962[var49 - 1] = var52 == 0;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_INV_STOP_TRANSMIT == connection.packetType) {
			int var53 = in.g1_alt1();
			int var54 = in.g2();
			boolean var55 = (var53 & 0x1) == 1;
			ClientInvCache.remove(var54, var55);
			field10783[++field11012 - 1 & 0x3F] = var54;
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARCLAN_DISABLE == connection.packetType) {
			varClan = null;
			connection.packetType = null;
			return true;
		} else if (ServerProt.NPC_ANIM_SPECIFIC == connection.packetType) {
			int[] var56 = new int[4];
			for (int var57 = 0; var57 < 4; var57++) {
				var56[var57] = in.g4_alt1();
			}
			int var58 = in.g2();
			int var59 = in.g1_alt2();
			ObjectNode var60 = (ObjectNode) npcs.get((long) var58);
			if (var60 != null) {
				addSequences((PathingEntity) var60.value, var56, var59, true);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETANGLE == connection.packetType) {
			int var61 = in.g4_alt2();
			int var62 = in.g2_alt1();
			int var63 = in.g2_alt1();
			int var64 = in.g2_alt2();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModelXAnYAnZoom(var61, var62, var63, var64);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLANSETTINGS_FULL == connection.packetType) {
			lastOnClanSettingsTransmitRedrawCycle = redrawCycle;
			boolean var65 = in.g1() == 1;
			if (connection.packetSize != 1) {
				if (var65) {
					affinedClanSettings = new ClanSettings(in);
				} else {
					listenedClanSettings = new ClanSettings(in);
				}
				connection.packetType = null;
				return true;
			}
			if (var65) {
				affinedClanSettings = null;
			} else {
				listenedClanSettings = null;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.HINT_TRAIL == connection.packetType) {
			int var66 = in.g1();
			int var67 = in.gSmart2or4null();
			if (hintTrails[var66] != null) {
				hintTrails[var66].method8404(world.getScene());
				hintTrails[var66] = null;
			}
			if (var67 != -1) {
				hintTrails[var66] = new HintTrail(toolkit, in, var67);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_CLANCHANNEL_SYSTEM == connection.packetType) {
			boolean var68 = in.g1() == 1;
			long var69 = (long) in.g2();
			long var71 = (long) in.g3();
			long var73 = (var69 << 32) + var71;
			boolean var75 = false;
			ClanChannel var76 = var68 ? affinedClanChannel : listenedClanChannel;
			if (var76 == null) {
				var75 = true;
			} else {
				for (int var77 = 0; var77 < 100; var77++) {
					if (messageIds[var77] == var73) {
						var75 = true;
						break;
					}
				}
			}
			if (!var75) {
				messageIds[messageCount] = var73;
				messageCount = (messageCount + 1) % 100;
				String var78 = WordPack.method5939(in);
				int var79 = var68 ? 43 : 46;
				ChatHistory.method15054(var79, 0, "", "", "", var78, var76.clanName, -1, null);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.PLAYER_INFO == connection.packetType) {
			ReceivePlayerPositions.readPlayerInfo(in, connection.packetSize);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCBIT_LARGE == connection.packetType) {
			int var80 = in.g2_alt2();
			int var81 = in.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.setVarCBit(var80, var81);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_LOC == connection.packetType) {
			int var82 = in.g4_alt1();
			CoordGrid var83 = new CoordGrid(in.g4_alt3());
			int var84 = in.g2();
			int var85 = in.g1_alt3();
			int var86 = in.g4_alt3();
			int var87 = in.g4s();
			int var88 = in.g4_alt2();
			int var89 = in.g4_alt3();
			int var90 = in.g1();
			int var91 = in.g4s();
			LocPositionAdjustment var92 = new LocPositionAdjustment(in, var90, false);
			incrementVerifyId();
			ifOpenSub(var82, new SubInterfaceActiveLoc(var84, var85, new LocReference(var83, var92.shape, var92.angle, var91)), new int[] { var86, var87, var88, var89 }, false);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_FRIENDLIST == connection.packetType) {
			while (in.pos < connection.packetSize) {
				boolean var93 = in.g1() == 1;
				String var94 = in.gjstr();
				String var95 = in.gjstr();
				int var96 = in.g2();
				int var97 = in.g1();
				int var98 = in.g1();
				boolean var99 = (var98 & 0x2) != 0;
				boolean var100 = (var98 & 0x1) != 0;
				String var101 = "";
				int var102 = -1;
				int var103 = 0;
				if (var96 > 0) {
					var101 = in.gjstr();
					var102 = in.g1();
					var103 = in.g4s();
				}
				String var104 = in.gjstr();
				for (int var105 = 0; var105 < friendsCount; var105++) {
					Friend var106 = friends[var105];
					if (var93) {
						if (var95.equals(var106.field606)) {
							var106.field606 = var94;
							var106.field607 = var95;
							var94 = null;
							break;
						}
					} else if (var94.equals(var106.field606)) {
						if (var106.worldId != var96) {
							boolean var107 = true;
							for (TimestampMessage var108 = (TimestampMessage) field10910.peekFront(); var108 != null; var108 = (TimestampMessage) field10910.prev()) {
								if (var108.message.equals(var94)) {
									if (var96 != 0 && var108.worldId == 0) {
										var108.unlink();
										var107 = false;
									} else if (var96 == 0 && var108.worldId != 0) {
										var108.unlink();
										var107 = false;
									}
								}
							}
							if (var107) {
								field10910.pushBack(new TimestampMessage(var94, var96));
							}
							var106.worldId = var96;
						}
						var106.field607 = var95;
						var106.worldName = var101;
						var106.rank = var97;
						var106.platform = var102;
						var106.referrer = var99;
						var106.referred = var100;
						var106.notes = var104;
						var106.worldFlags = var103;
						var94 = null;
						break;
					}
				}
				if (var94 != null && friendsCount < 400) {
					Friend var109 = new Friend();
					friends[friendsCount] = var109;
					var109.field606 = var94;
					var109.field607 = var95;
					var109.worldId = var96;
					var109.worldName = var101;
					var109.rank = var97;
					var109.platform = var102;
					var109.referrer = var99;
					var109.referred = var100;
					var109.notes = var104;
					var109.worldFlags = var103;
					friendsCount++;
				}
			}
			friendsListState = 2;
			lastOnFriendTransmitRedrawCycle = redrawCycle;
			boolean var110 = false;
			int var111 = friendsCount;
			while (var111 > 0) {
				boolean var112 = true;
				var111--;
				for (int var113 = 0; var113 < var111; var113++) {
					boolean var114 = false;
					Friend var115 = friends[var113];
					Friend var116 = friends[var113 + 1];
					if (WorldSwitcher.currentWorld.node != var115.worldId && WorldSwitcher.currentWorld.node == var116.worldId) {
						var114 = true;
					}
					if (!var114 && var115.worldId == 0 && var116.worldId != 0) {
						var114 = true;
					}
					if (!var114 && !var115.referrer && var116.referrer) {
						var114 = true;
					}
					if (!var114 && !var115.referred && var116.referred) {
						var114 = true;
					}
					if (var114) {
						Friend var117 = friends[var113];
						friends[var113] = friends[var113 + 1];
						friends[var113 + 1] = var117;
						var112 = false;
					}
				}
				if (var112) {
					break;
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETEVENTS == connection.packetType) {
			int var118 = in.g2_alt2();
			if (var118 == 65535) {
				var118 = -1;
			}
			int var119 = in.g4s();
			int var120 = in.g2_alt3();
			if (var120 == 65535) {
				var120 = -1;
			}
			int var121 = in.g4_alt1();
			incrementVerifyId();
			for (int var122 = var118; var122 <= var120; var122++) {
				long var123 = ((long) var121 << 32) + (long) var122;
				ServerKeyProperties var125 = (ServerKeyProperties) field10873.get(var123);
				ServerKeyProperties var126;
				if (var125 != null) {
					var126 = new ServerKeyProperties(var119, var125.field11381);
					var125.unlink();
				} else if (var122 == -1) {
					var126 = new ServerKeyProperties(var119, Component.get(var121).field2268.field11381);
				} else {
					var126 = new ServerKeyProperties(var119, -1);
				}
				field10873.put(var126, var123);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.OBJ_COUNT == connection.packetType) {
			handleZonePacket(ZoneProt.OBJ_COUNT);
			connection.packetType = null;
			return true;
		} else if (ServerProt.PLAYER_SNAPSHOT == connection.packetType) {
			int var127 = in.g1();
			int var128 = -var127 - 2;
			byte var129 = in.g1b();
			PlayerEntity var130 = (PlayerEntity) playerSnapshots.get(var128);
			if (var130 == null) {
				var130 = new PlayerEntity(null);
				var130.localPlayerIndex = var128;
				playerSnapshots.put(var128, var130);
			}
			var130.setIdentityKit(in, var129);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MIDI_JINGLE == connection.packetType) {
			int var131 = in.g1_alt1();
			int var132 = in.g2_alt1();
			if (var132 == 65535) {
				var132 = -1;
			}
			audioApi.playJingle(var132, var131);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOC_ANIM_SPECIFIC == connection.packetType) {
			int var133 = in.g4_alt1();
			int var134 = var133 >> 28 & 0x3;
			int var135 = var133 >> 14 & 0x3FFF;
			int var136 = var133 & 0x3FFF;
			int var137 = in.g1();
			int var138 = in.g4s();
			int var139 = in.g1();
			LocPositionAdjustment var140 = new LocPositionAdjustment(in, var139, false);
			int var141 = locShapeToLayer[var140.shape];
			CoordGrid var142 = world.getBase();
			int var143 = var135 - var142.x;
			int var144 = var136 - var142.z;
			method8895(var134, var143, var144, var141, var140.shape, var140.angle, var140.field7539, var138, var137);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CREATE_SUGGEST_NAME_ERROR == connection.packetType) {
			int var145 = in.g1();
			SuggestNameReply var146 = (SuggestNameReply) SerializableEnums.decode(SuggestNameReply.method9840(), var145);
			if (var146 == null) {
				var146 = SuggestNameReply.field8393;
			}
			AccountCreationManager.method4664(var146);
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_PRELOAD_SOUND_GROUP == connection.packetType) {
			int var147 = in.g2();
			audioApi.preloadSoundGroup(var147);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_REMOVEROOF == connection.packetType) {
			int var148 = in.g4_alt2();
			incrementVerifyId();
			if (var148 == -1) {
				field810 = -1;
				field3538 = -1;
			} else {
				CoordGrid var149 = world.getBase();
				int var150 = var148 >> 14 & 0x3FFF;
				int var151 = var148 & 0x3FFF;
				int var152 = var150 - var149.x;
				if (var152 < 0) {
					var152 = 0;
				} else if (var152 >= world.getSizeX()) {
					var152 = world.getSizeX();
				}
				int var153 = var151 - var149.z;
				if (var153 < 0) {
					var153 = 0;
				} else if (var153 >= world.getSizeZ()) {
					var153 = world.getSizeZ();
				}
				field810 = (var152 << 9) + 256;
				field3538 = (var153 << 9) + 256;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MAP_PROJANIM == connection.packetType) {
			handleZonePacket(ZoneProt.MAP_PROJANIM);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETHIDE == connection.packetType) {
			int var154 = in.g4s();
			int var155 = in.g1_alt2();
			incrementVerifyId();
			DelayedStateChange.setInterfaceHide(var154, var155);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_CLANCHANNEL == connection.packetType) {
			boolean var156 = in.g1() == 1;
			String var157 = in.gjstr();
			long var158 = (long) in.g2();
			long var160 = (long) in.g3();
			ChatCrownType var162 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			long var163 = (var158 << 32) + var160;
			boolean var165 = false;
			Object var166 = null;
			ClanChannel var167 = var156 ? affinedClanChannel : listenedClanChannel;
			if (var167 == null) {
				var165 = true;
			} else {
				int var168 = 0;
				while (true) {
					if (var168 >= 100) {
						if (var162.ignorable) {
							if (field10951 && !playerIsQuickChat || loggedInQuickChat) {
								var165 = true;
							} else if (ignoreTest(var157)) {
								var165 = true;
							}
						}
						break;
					}
					if (messageIds[var168] == var163) {
						var165 = true;
						break;
					}
					var168++;
				}
			}
			if (!var165) {
				messageIds[messageCount] = var163;
				messageCount = (messageCount + 1) % 100;
				String var169 = StringHelper.escape(WordPack.method5939(in));
				int var170 = var156 ? 41 : 44;
				if (var162.img == -1) {
					ChatHistory.method15054(var170, 0, var157, var157, var157, var169, var167.clanName, -1, var162);
				} else {
					ChatHistory.method15054(var170, 0, TextUtil.imgTag(var162.img) + var157, TextUtil.imgTag(var162.img) + var157, var157, var169, var167.clanName, -1, var162);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARCLAN_ENABLE == connection.packetType) {
			varClan = new SparseVarDomain(varClanTypeList);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LAST_LOGIN_INFO == connection.packetType) {
			int var171 = in.g4s();
			hostNameProvider = new HostNameProvider(var171);
			Thread var172 = new Thread(hostNameProvider);
			var172.setPriority(1);
			var172.start();
			connection.packetType = null;
			return true;
		} else if (ServerProt.SYNTH_SOUND == connection.packetType) {
			int var173 = in.g2();
			if (var173 == 65535) {
				var173 = -1;
			}
			int var174 = in.g1();
			int var175 = in.g2();
			int var176 = in.g1();
			int var177 = in.g2();
			audioApi.playSound(SoundType.field1832, var173, var174, var176, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var177, var175);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_PRIVATE == connection.packetType) {
			boolean var178 = in.g1() == 1;
			String var179 = in.gjstr();
			String var180 = var179;
			if (var178) {
				var180 = in.gjstr();
			}
			long var181 = (long) in.g2();
			long var183 = (long) in.g3();
			ChatCrownType var185 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			int var186 = in.g2();
			long var187 = (var181 << 32) + var183;
			boolean var189 = false;
			int var190 = 0;
			while (true) {
				if (var190 >= 100) {
					if (var185.ignorable && ignoreTest(var180)) {
						var189 = true;
					}
					break;
				}
				if (messageIds[var190] == var187) {
					var189 = true;
					break;
				}
				var190++;
			}
			if (!var189) {
				messageIds[messageCount] = var187;
				messageCount = (messageCount + 1) % 100;
				String var191 = quickChatPhraseTypeList.list(var186).method19507(in);
				if (var185.img == -1) {
					ChatHistory.method15054(18, 0, var179, var180, var179, var191, null, var186, var185);
				} else {
					ChatHistory.method15054(18, 0, TextUtil.imgTag(var185.img) + var179, TextUtil.imgTag(var185.img) + var180, var179, var191, null, var186, var185);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MAP_ANIM == connection.packetType) {
			handleZonePacket(ZoneProt.MAP_ANIM);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOC_PREFETCH == connection.packetType) {
			handleZonePacket(ZoneProt.LOC_PREFETCH);
			connection.packetType = null;
			return true;
		} else if (ServerProt.JS5_RELOAD == connection.packetType) {
			Loading.reload();
			connection.packetType = null;
			return false;
		} else if (ServerProt.LOC_ANIM == connection.packetType) {
			handleZonePacket(ZoneProt.LOC_ANIM);
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARP_LARGE == connection.packetType) {
			int var192 = in.g2_alt1();
			int var193 = in.g4s();
			localPlayerGameState.varps.setVarValueIntFromServer((VarType) varPlayerTypeList.list(var192), var193);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOYALTY_UPDATE == connection.packetType) {
			int var194 = in.g4_alt3();
			if (lobbyLoyaltyBalance != var194) {
				lobbyLoyaltyBalance = var194;
				ScriptRunner.executeTriggeredScriptMapElement(ClientTriggerType.LOYALTY_UPDATED, -1, -1);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERHEAD_IGNOREWORN == connection.packetType) {
			int var195 = in.g2();
			int var196 = in.g4_alt2();
			int var197 = in.g2_alt1();
			int var198 = in.g2_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var196, 7, var198 << 16 | var195, var197);
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_REMOVE_COLUMN == connection.packetType) {
			if (!telemetryError) {
				try {
					int var199 = in.g1_alt2();
					int var200 = in.g1_alt3();
					telemetry.getGroup(var199).removeColumn(var200);
				} catch (RuntimeException var721) {
					JagException.report(null, var721);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.CREATE_SUGGEST_NAME_REPLY == connection.packetType) {
			String var202 = in.gjstr();
			AccountCreationManager.method1587(var202);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM2_ENABLE == connection.packetType) {
			boolean var203 = in.g1() == 1;
			if (var203) {
				cameraReset(3);
			} else {
				cameraReset(2);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_STAT == connection.packetType) {
			int var204 = in.g1_alt2();
			int var205 = in.g4_alt1();
			int var206 = in.g1_alt3();
			skillDefaults.getSkill(var206);
			localPlayerGameState.stats[var206].setXP(var205);
			localPlayerGameState.stats[var206].setLevel(var204);
			field11015[++field11014 - 1 & 0x3F] = var206;
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_SPEECH_STOP == connection.packetType) {
			audioApi.stopVorbisSpeech(SubBussType.DIALOG_SUB.getId());
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_GAME == connection.packetType) {
			int var207 = in.gSmart1or2();
			int var208 = in.g4s();
			int var209 = in.g1();
			String var210 = "";
			String var211 = var210;
			if ((var209 & 0x1) != 0) {
				var210 = in.gjstr();
				if ((var209 & 0x2) == 0) {
					var211 = var210;
				} else {
					var211 = in.gjstr();
				}
			}
			String var212 = in.gjstr();
			if (var207 == 99) {
				DeveloperConsole.addline(var212);
			} else if (var207 == 98) {
				DeveloperConsole.method722(var212);
			} else if (var211.equals("") || !ignoreTest(var211)) {
				ChatHistory.addMessage(var207, var208, var210, var211, var210, var212, null);
			} else {
				connection.packetType = null;
				return true;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.WORLDLIST_FETCH_REPLY == connection.packetType) {
			boolean var213 = in.g1() == 1;
			byte[] var214 = new byte[connection.packetSize - 1];
			in.gdata(var214, 0, connection.packetSize - 1);
			GWC.method6876(var213, var214);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERMODEL_SNAPSHOT == connection.packetType) {
			int var215 = in.g4_alt3();
			int var216 = in.g1_alt1();
			int var217 = -var216 - 2;
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var215, 5, var217, 0);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERMODEL_SELF == connection.packetType) {
			int var218 = in.g4s();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var218, 5, currentPlayerUid, 0);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_PUBLIC == connection.packetType) {
			int var219 = in.g2();
			PlayerEntity var220;
			if (currentPlayerUid == var219) {
				var220 = localPlayerEntity;
			} else {
				var220 = players[var219];
			}
			if (var220 == null) {
				connection.packetType = null;
				return true;
			}
			int var221 = in.g2();
			ChatCrownType var222 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			boolean var223 = (var221 & 0x8000) != 0;
			if (var220.nameUnfiltered != null && var220.model != null) {
				boolean var224 = false;
				if (var222.ignorable) {
					if (!var223 && (field10951 && !playerIsQuickChat || loggedInQuickChat)) {
						var224 = true;
					} else if (ignoreTest(var220.nameUnfiltered)) {
						var224 = true;
					}
				}
				if (!var224) {
					int var225 = -1;
					String var227;
					if (var223) {
						var221 &= 0x7FFF;
						QuickChatPhrase var226 = QuickChatPhrase.createQuickChatPhrase(in);
						var225 = var226.id;
						var227 = var226.quickChatPhraseType.method19507(in);
					} else {
						var227 = StringHelper.escape(WordPack.method5939(in));
					}
					var220.addMessage(var227.trim(), var221 >> 8, var221 & 0xFF);
					int var228;
					if (var222.field3609) {
						var228 = var223 ? 17 : 1;
					} else {
						var228 = var223 ? 17 : 2;
					}
					if (var222.img == -1) {
						ChatHistory.method15054(var228, 0, var220.getNameWithExtras(true), var220.getName(false), var220.name, var227, null, var225, var222);
					} else {
						ChatHistory.method15054(var228, 0, TextUtil.imgTag(var222.img) + var220.getNameWithExtras(true), TextUtil.imgTag(var222.img) + var220.getName(false), var220.name, var227, null, var225, var222);
					}
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETMODEL == connection.packetType) {
			int var229 = in.g4_alt2();
			int var230 = in.g4s();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var229, 1, var230, -1);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCBIT_SMALL == connection.packetType) {
			int var231 = in.g2();
			byte var232 = in.g1b_alt1();
			incrementVerifyId();
			DelayedStateChange.setVarCBit(var231, var232);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_SMOOTHRESET == connection.packetType) {
			incrementVerifyId();
			cameraSmoothReset();
			connection.packetType = null;
			return true;
		} else if (ServerProt.MAP_PROJANIM_HALFSQ == connection.packetType) {
			handleZonePacket(ZoneProt.MAP_PROJANIM_HALFSQ);
			connection.packetType = null;
			return true;
		} else if (ServerProt.SONG_PRELOAD == connection.packetType) {
			int var233 = in.g2_alt1();
			if (var233 == 65535) {
				var233 = -1;
			}
			audioApi.preloadSong(var233, 255);
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_PRELOAD_SOUNDS == connection.packetType) {
			audioApi.preloadSounds(in.g2());
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_RUNENERGY == connection.packetType) {
			runEnergy = in.g1();
			lastOnMiscTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETGRAPHIC == connection.packetType) {
			int var234 = in.g4_alt2();
			int var235 = in.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceGraphic(var235, var234);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_PRIVATE_ECHO == connection.packetType) {
			String var236 = in.gjstr();
			int var237 = in.g2();
			String var238 = quickChatPhraseTypeList.list(var237).method19507(in);
			ChatHistory.method15054(19, 0, var236, var236, var236, var238, null, var237, null);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_ZONE_PARTIAL_ENCLOSED == connection.packetType) {
			zoneBaseLevel = in.g1_alt1();
			zoneBaseZ = in.g1b_alt2() << 3;
			zoneBaseX = in.g1b_alt2() << 3;
			while (in.pos < connection.packetSize) {
				ZoneProt var239 = ZoneProt.values()[in.g1()];
				handleZonePacket(var239);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_SPEECH_SOUND == connection.packetType) {
			int var240 = in.g2();
			if (var240 == 65535) {
				var240 = -1;
			}
			int var241 = in.g1();
			int var242 = in.g2();
			int var243 = in.g1();
			audioApi.playSound(SoundType.field1832, var240, var241, var243, SubBussType.DIALOG_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, 256, var242);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CREATE_ACCOUNT_REPLY == connection.packetType) {
			int var244 = in.g1();
			CreateAccountReply var245 = (CreateAccountReply) SerializableEnums.decode(CreateAccountReply.method4614(), var244);
			if (var245 == null) {
				var245 = CreateAccountReply.field8378;
			}
			AccountCreationManager.method6851(var245);
			connection.packetType = null;
			return true;
		} else if (ServerProt.REDUCE_NPC_ATTACK_PRIORITY == connection.packetType) {
			field10955 = (AttackOpPriority) SerializableEnums.decode(AttackOpPriority.method10149(), in.g1_alt3());
			if (field10955 == null) {
				field10955 = AttackOpPriority.field7908;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_REMOVE_GROUP == connection.packetType) {
			if (!telemetryError) {
				try {
					int var246 = in.g1();
					telemetry.removeGroup(var246);
				} catch (RuntimeException var722) {
					JagException.report(null, var722);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS == connection.packetType) {
			zoneBaseLevel = in.g1();
			zoneBaseZ = in.g1b_alt2() << 3;
			zoneBaseX = in.g1b() << 3;
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETTARGETPARAM == connection.packetType) {
			int var248 = in.g4s();
			int var249 = in.g2();
			if (var249 == 65535) {
				var249 = -1;
			}
			int var250 = in.g2_alt2();
			int var251 = in.g2_alt2();
			if (var251 == 65535) {
				var251 = -1;
			}
			incrementVerifyId();
			for (int var252 = var251; var252 <= var249; var252++) {
				long var253 = ((long) var248 << 32) + (long) var252;
				ServerKeyProperties var255 = (ServerKeyProperties) field10873.get(var253);
				ServerKeyProperties var256;
				if (var255 != null) {
					var256 = new ServerKeyProperties(var255.field11385, var250);
					var255.unlink();
				} else if (var252 == -1) {
					var256 = new ServerKeyProperties(Component.get(var248).field2268.field11385, var250);
				} else {
					var256 = new ServerKeyProperties(0, var250);
				}
				field10873.put(var256, var253);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.CUTSCENE == connection.packetType) {
			int var257 = in.g2();
			field11041 = -1;
			cutsceneId = var257;
			sceneState = 2;
			cutscenesJs5.loadFile(cutsceneId);
			MiniMenu.close();
			MiniMenu.method3074();
			int var258 = in.g2();
			field10769 = var258;
			int var259 = in.g1();
			field8729 = new Packet(var259);
			field8729.pdata(in.data, in.pos, var259);
			in.pos += var259;
			connection.packetType = null;
			return false;
		} else if (ServerProt.SOUND_AREA == connection.packetType) {
			handleZonePacket(ZoneProt.SOUND_AREA);
			connection.packetType = null;
			return true;
		} else if (ServerProt.SOCIAL_NETWORK_LOGOUT == connection.packetType) {
			if (Fullscreen.allowed && GameShell.fsframe != null) {
				setWindowMode(preferences.windowMode.getValue(), -1, -1, false);
			}
			byte[] var260 = new byte[connection.packetSize];
			in.gIsaacArrayBuffer(var260, 0, connection.packetSize);
			String var261 = Cp1252.method9199(var260, 0, connection.packetSize);
			Browser.openUrl(var261, true, field10784);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARC_LARGE == connection.packetType) {
			int var262 = in.g4_alt1();
			int var263 = in.g2_alt2();
			incrementVerifyId();
			DelayedStateChange.setVarC(var263, var262);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_MOVESUB == connection.packetType) {
			int var264 = in.g4_alt2();
			int var265 = in.g4_alt2();
			incrementVerifyId();
			SubInterface var266 = (SubInterface) openedSubInterfaces.get((long) var264);
			SubInterface var267 = (SubInterface) openedSubInterfaces.get((long) var265);
			if (var267 != null) {
				ifCloseSub(var267, var266 == null || var266.field11571 != var267.field11571, false);
			}
			if (var266 != null) {
				var266.unlink();
				openedSubInterfaces.put(var266, (long) var265);
			}
			Component var268 = Component.get(var264);
			if (var268 != null) {
				requestRedrawComponent(var268);
			}
			Component var269 = Component.get(var265);
			if (var269 != null) {
				requestRedrawComponent(var269);
				method8329(Component.interfaces[var269.parentlayer >>> 16], var269, true);
			}
			if (openedTopInterface != -1) {
				method1023(openedTopInterface, 1);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERHEAD_OTHER == connection.packetType) {
			int var270 = in.g4_alt1();
			int var271 = in.g2_alt2();
			int var272 = in.g4_alt3();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var272, 3, var271, var270);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOBBY_APPEARANCE == connection.packetType) {
			byte var273 = in.g1b();
			localPlayerEntity.setIdentityKit(in, var273);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_IGNORELIST == connection.packetType) {
			while (in.pos < connection.packetSize) {
				int var274 = in.g1();
				boolean var275 = (var274 & 0x1) == 1;
				String var276 = in.gjstr();
				String var277 = in.gjstr();
				String var278 = in.gjstr();
				for (int var279 = 0; var279 < ignoresCount; var279++) {
					Ignore var280 = ignores[var279];
					if (var275) {
						if (var277.equals(var280.nameUnfiltered)) {
							var280.nameUnfiltered = var276;
							var280.field596 = var277;
							var276 = null;
							break;
						}
					} else if (var276.equals(var280.nameUnfiltered)) {
						var280.nameUnfiltered = var276;
						var280.field596 = var277;
						var280.notes = var278;
						var276 = null;
						break;
					}
				}
				if (var276 != null && ignoresCount < 400) {
					Ignore var281 = new Ignore();
					ignores[ignoresCount] = var281;
					var281.nameUnfiltered = var276;
					var281.field596 = var277;
					var281.notes = var278;
					var281.temporary = (var274 & 0x2) == 2;
					ignoresCount++;
				}
			}
			lastOnFriendTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETTEXT == connection.packetType) {
			int var282 = in.g4_alt1();
			String var283 = in.gjstr();
			incrementVerifyId();
			DelayedStateChange.setInterfaceText(var282, var283);
			connection.packetType = null;
			return true;
		} else if (ServerProt.PLAYER_GROUP_DELTA == connection.packetType) {
			lastOnPlayerGroupTransmitRedrawCycle = redrawCycle;
			PlayerGroupDelta var284 = new PlayerGroupDelta(in, field10837);
			var284.method3555(currentPlayerGroup);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETRECOL == connection.packetType) {
			int var285 = in.g4_alt1();
			int var286 = in.g2_alt2();
			int var287 = in.g2_alt1();
			int var288 = in.g1_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceRecol(var285, var288, var286, var287);
			connection.packetType = null;
			return true;
		} else if (ServerProt.RESET_CLIENT_VARCACHE == connection.packetType) {
			localPlayerGameState.varps.method9624();
			varpTransmitNum += 64;
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_DOB == connection.packetType) {
			lobbyDOB = in.g3s();
			field10951 = in.g1() == 1;
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_ADD_GROUP == connection.packetType) {
			if (!telemetryError) {
				try {
					int var289 = in.g4_alt1();
					byte var290 = in.g1b_alt1();
					telemetry.addGroup(new TelemetryGroup(var289), var290);
				} catch (RuntimeException var723) {
					JagException.report(null, var723);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_CLANCHANNEL == connection.packetType) {
			boolean var292 = in.g1() == 1;
			String var293 = in.gjstr();
			long var294 = (long) in.g2();
			long var296 = (long) in.g3();
			ChatCrownType var298 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			int var299 = in.g2();
			long var300 = (var294 << 32) + var296;
			boolean var302 = false;
			Object var303 = null;
			ClanChannel var304 = var292 ? affinedClanChannel : listenedClanChannel;
			if (var304 == null) {
				var302 = true;
			} else {
				int var305 = 0;
				while (true) {
					if (var305 >= 100) {
						if (var298.ignorable && ignoreTest(var293)) {
							var302 = true;
						}
						break;
					}
					if (messageIds[var305] == var300) {
						var302 = true;
						break;
					}
					var305++;
				}
			}
			if (!var302) {
				messageIds[messageCount] = var300;
				messageCount = (messageCount + 1) % 100;
				String var306 = quickChatPhraseTypeList.list(var299).method19507(in);
				int var307 = var292 ? 42 : 45;
				if (var298.img == -1) {
					ChatHistory.method15054(var307, 0, var293, var293, var293, var306, var304.clanName, var299, var298);
				} else {
					ChatHistory.method15054(var307, 0, TextUtil.imgTag(var298.img) + var293, TextUtil.imgTag(var298.img) + var293, var293, var306, var304.clanName, var299, var298);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MINIMAP_TOGGLE == connection.packetType) {
			MiniMap.toggle = in.g1();
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_ZONE_FULL_FOLLOWS == connection.packetType) {
			zoneBaseZ = in.g1b_alt2() << 3;
			zoneBaseLevel = in.g1_alt2();
			zoneBaseX = in.g1b_alt3() << 3;
			CoordGrid var308 = world.getBase();
			for (ObjStackList var309 = (ObjStackList) objStacks.head(); var309 != null; var309 = (ObjStackList) objStacks.next()) {
				int var310 = (int) (var309.nodeId >> 28 & 0x3L);
				int var311 = (int) (var309.nodeId & 0x3FFFL);
				int var312 = var311 - var308.x;
				int var313 = (int) (var309.nodeId >> 14 & 0x3FFFL);
				int var314 = var313 - var308.z;
				if (zoneBaseLevel == var310 && var312 >= zoneBaseX && var312 < zoneBaseX + 8 && var314 >= zoneBaseZ && var314 < zoneBaseZ + 8) {
					var309.unlink();
					if (var312 >= 0 && var314 >= 0 && var312 < world.getSizeX() && var314 < world.getSizeZ()) {
						sortObjStacks(zoneBaseLevel, var312, var314);
					}
				}
			}
			for (ChangeLocationRequest var315 = (ChangeLocationRequest) ChangeLocationRequest.field11237.head(); var315 != null; var315 = (ChangeLocationRequest) ChangeLocationRequest.field11237.next()) {
				if (var315.x >= zoneBaseX && var315.x < zoneBaseX + 8 && var315.z >= zoneBaseZ && var315.z < zoneBaseZ + 8 && zoneBaseLevel == var315.level) {
					var315.field11240 = true;
				}
			}
			for (ChangeLocationRequest var316 = (ChangeLocationRequest) ChangeLocationRequest.field11242.head(); var316 != null; var316 = (ChangeLocationRequest) ChangeLocationRequest.field11242.next()) {
				if (var316.x >= zoneBaseX && var316.x < zoneBaseX + 8 && var316.z >= zoneBaseZ && var316.z < zoneBaseZ + 8 && zoneBaseLevel == var316.level) {
					var316.field11240 = true;
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARBIT_SMALL == connection.packetType) {
			int var317 = in.g1_alt3();
			int var318 = in.g2_alt2();
			localPlayerGameState.varps.setVarBitValueFromServer((VarBitType) varBitTypeList.list(var318), var317);
			connection.packetType = null;
			return true;
		} else if (ServerProt.FRIENDLIST_LOADED == connection.packetType) {
			friendsListState = 1;
			lastOnFriendTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERHEAD == connection.packetType) {
			int var319 = in.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var319, 3, currentPlayerUid, 0);
			connection.packetType = null;
			return true;
		} else if (ServerProt.PLAYER_GROUP_VARPS == connection.packetType) {
			lastOnPlayerGroupVarpTransmitRedrawCycle = redrawCycle;
			int var320 = in.pos;
			int var321 = in.g2();
			boolean var322 = in.g1() == 1;
			PlayerGroupMember var323 = currentPlayerGroup.doGetMember(var321);
			VarContainerSparse var324 = var323.clearVariables();
			if (var324 == null || var322) {
				var323.resetVariables(field10837);
				var324 = var323.clearVariables();
			}
			while (connection.packetSize - (in.pos - var320) > 0) {
				VarValue var325 = varPlayerTypeList.decodeVarValue(in);
				var324.setVarValue(var325.var, var325.value);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.JCOINS_UPDATE == connection.packetType) {
			int var326 = in.g4_alt2();
			if (lobbyJCoinsBalance != var326) {
				lobbyJCoinsBalance = var326;
				ScriptRunner.executeTriggeredScriptMapElement(ClientTriggerType.JCOINS_UPDATED, -1, -1);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SEND_PING == connection.packetType) {
			int var327 = in.g4s();
			int var328 = in.g4s();
			ClientMessage var329 = ClientMessage.createMessage(ClientProt.SEND_PING_REPLY, connection.randomOut);
			var329.buf.p4_alt1(var327);
			var329.buf.p4_alt3(var328);
			var329.buf.p1_alt2(fps);
			connection.queue(var329);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_OPENTOP == connection.packetType) {
			int var330 = in.g4_alt2();
			int var331 = in.g4_alt1();
			int var332 = in.g4_alt2();
			int var333 = in.g4s();
			in.g1();
			int var334 = in.g2_alt3();
			incrementVerifyId();
			int[] var335 = new int[] { var332, var333, var331, var330 };
			openedTopInterface = var334;
			method17758(var334, var335);
			computeTopLevelInterfaceLayout(false);
			ScriptRunner.executeOnLoad(openedTopInterface, var335);
			for (int var336 = 0; var336 < 114; var336++) {
				topLevelComponentRedrawRequestedTemp[var336] = true;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MIDI_SONG_LOCATION == connection.packetType) {
			int var337 = in.g4_alt3();
			int var338 = in.g4s();
			int var339 = in.g1_alt1();
			int var340 = in.g1();
			int var341 = in.g1_alt2();
			int var342 = var337 >> 28;
			int var343 = var337 >> 14 & 0x3FFF;
			int var344 = var337 & 0x3FFF;
			audioApi.playSong(var338, var340, true, var342, var343 << 9, var344 << 9, var339 << 9, var341 << 9);
			connection.packetType = null;
			return true;
		} else if (ServerProt.DEBUG_SERVER_TRIGGERS == connection.packetType) {
			int var345 = in.g2();
			int var346 = in.g2();
			int var347 = in.g2();
			incrementVerifyId();
			if (Component.interfaces[var345] != null) {
				for (int var348 = var346; var348 < var347; var348++) {
					int var349 = in.g3();
					if (var348 < Component.interfaces[var345].components.length && Component.interfaces[var345].components[var348] != null) {
						Component.interfaces[var345].components[var348].field2181 = var349;
					}
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SOUND_MIXBUSS_SETLEVEL == connection.packetType) {
			int var350 = in.g2();
			int var351 = in.g2();
			audioApi.setMixBussLevel(var350, var351);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_REBOOT_TIMER == connection.packetType) {
			if (isStateLobby(state)) {
				rebootTimer = (int) ((float) in.g2() * 2.5F);
			} else {
				rebootTimer = in.g2() * 30;
			}
			lastOnMiscTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARCLAN == connection.packetType) {
			if (varClan == null) {
				varClan = new SparseVarDomain(varClanTypeList);
			}
			VarValue var352 = varClanTypeList.decodeVarValue(in);
			varClan.field1708.setVarValue(var352.var, var352.value);
			field10841[++field11020 - 1 & 0x3F] = var352.var;
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_SOUND_GROUP == connection.packetType) {
			int var353 = in.g2();
			if (var353 == 65535) {
				var353 = -1;
			}
			int var354 = in.g1();
			int var355 = in.g2();
			int var356 = in.g1();
			int var357 = in.g2();
			int var358 = in.g2();
			Sound var359 = audioApi.createSound(SoundType.field1832, audioApi, var353, var354, var356, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var357, false);
			if (var359 != null) {
				audioApi.method3251(var359, var358, var355);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_RUNWEIGHT == connection.packetType) {
			runWeight = in.g2s();
			lastOnMiscTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.REBUILD_REGION == connection.packetType) {
			PacketBit var360 = new PacketBit(connection.packetSize);
			System.arraycopy(connection.in.data, connection.in.pos, var360.data, 0, connection.packetSize);
			method3652();
			if (preferences.unknown7.getValue() == 1) {
				asyncRebuild.method7680(new RebuildRequest(RebuildType.REBUILD_REGION, var360));
			} else {
				world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_REGION, var360));
			}
			connection.packetType = null;
			return false;
		} else if (ServerProt.MESSAGE_PLAYER_GROUP == connection.packetType) {
			String var361 = in.gjstr();
			long var362 = (long) in.g2();
			long var364 = (long) in.g3();
			ChatCrownType var366 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			boolean var367 = in.g1() == 1;
			long var368 = (var362 << 32) + var364;
			boolean var370 = false;
			if (currentPlayerGroup == null) {
				var370 = true;
			} else {
				int var371 = 0;
				while (true) {
					if (var371 >= 100) {
						if (var366.ignorable) {
							if (field10951 && !playerIsQuickChat || loggedInQuickChat) {
								var370 = true;
							} else if (ignoreTest(var361)) {
								var370 = true;
							}
						}
						break;
					}
					if (messageIds[var371] == var368) {
						var370 = true;
						break;
					}
					var371++;
				}
			}
			if (!var370) {
				messageIds[messageCount] = var368;
				messageCount = (messageCount + 1) % 100;
				String var372 = StringHelper.escape(WordPack.method5939(in));
				int var373 = var367 ? 22 : 24;
				if (var366.img == -1) {
					ChatHistory.method15054(var373, 0, var361, var361, var361, var372, currentPlayerGroup.getDisplayName(), -1, var366);
				} else {
					ChatHistory.method15054(var373, 0, TextUtil.imgTag(var366.img) + var361, TextUtil.imgTag(var366.img) + var361, var361, var372, currentPlayerGroup.getDisplayName(), -1, var366);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SERVER_TICK_END == connection.packetType) {
			connection.packetType = null;
			return false;
		} else if (ServerProt.HINT_ARROW == connection.packetType) {
			int var374 = in.g1();
			int var375 = var374 >> 5;
			int var376 = var374 & 0x1F;
			if (var376 == 0) {
				hintArrows[var375] = null;
				connection.packetType = null;
				return true;
			}
			HintArrow var377 = new HintArrow();
			var377.hintType = var376;
			var377.field751 = in.g1();
			if (var377.field751 >= 0 && var377.field751 < DefaultSprites.hintarrowSprites.length) {
				if (var377.hintType == 1 || var377.hintType == 10) {
					var377.field744 = in.g2();
					var377.field743 = in.g2();
					in.pos += 4;
				} else if (var377.hintType >= 2 && var377.hintType <= 6) {
					if (var377.hintType == 2) {
						var377.hintOffsetX = 256;
						var377.hintOffsetZ = 256;
					}
					if (var377.hintType == 3) {
						var377.hintOffsetX = 0;
						var377.hintOffsetZ = 256;
					}
					if (var377.hintType == 4) {
						var377.hintOffsetX = 512;
						var377.hintOffsetZ = 256;
					}
					if (var377.hintType == 5) {
						var377.hintOffsetX = 256;
						var377.hintOffsetZ = 0;
					}
					if (var377.hintType == 6) {
						var377.hintOffsetX = 256;
						var377.hintOffsetZ = 512;
					}
					var377.hintType = 2;
					var377.field749 = in.g1();
					CoordGrid var378 = world.getBase();
					var377.hintOffsetX += in.g2() - var378.x << 9;
					var377.hintOffsetZ += in.g2() - var378.z << 9;
					var377.field742 = in.g1() << 2;
					var377.field748 = in.g2();
				}
				var377.field750 = in.g4s();
				hintArrows[var375] = var377;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SPOTANIM_SPECIFIC == connection.packetType) {
			int var379 = in.g1();
			int var380 = in.g2_alt2();
			int var381 = in.g4_alt1();
			int var382 = in.g2();
			if (var382 == 65535) {
				var382 = -1;
			}
			int var383 = in.g2();
			int var384 = in.g1_alt2();
			int var385 = var379 & 0x7;
			int var386 = var379 >> 3 & 0xF;
			if (var386 == 15) {
				var386 = -1;
			}
			boolean var387 = (var379 >> 7 & 0x1) == 1;
			if (var381 >> 30 != 0) {
				CoordGrid var388 = world.getBase();
				int var389 = var381 >> 28 & 0x3;
				int var390 = (var381 >> 14 & 0x3FFF) - var388.x;
				int var391 = (var381 & 0x3FFF) - var388.z;
				if (var390 >= 0 && var391 >= 0 && var390 < world.getSizeX() && var391 < world.getSizeZ()) {
					if (var382 == -1) {
						SpotAnimEntityNode var392 = (SpotAnimEntityNode) spotanims.get((long) (var390 << 16 | var391));
						if (var392 != null) {
							var392.field12264.method19749();
							var392.unlink();
						}
					} else {
						int var393 = var390 * 512 + 256;
						int var394 = var391 * 512 + 256;
						int var395 = var389;
						if (var389 < 3 && world.getSceneLevelTileFlags().isLinkBelow(var390, var391)) {
							var395 = var389 + 1;
						}
						SpotAnimation var396 = new SpotAnimation(world.getScene(), var382, var383, var389, var395, var393, getHeightmapY(var393, var394, var389) - var380, var394, var390, var390, var391, var391, var385, var387, 0);
						spotanims.put(new SpotAnimEntityNode(var396), (long) (var390 << 16 | var391));
					}
				}
			} else if (var381 >> 29 != 0) {
				int var397 = var381 & 0xFFFF;
				ObjectNode var398 = (ObjectNode) npcs.get((long) var397);
				if (var398 != null) {
					NpcEntity var399 = (NpcEntity) var398.value;
					EntitySpotAnim var400 = var399.spotAnims[var384];
					if (var382 == 65535) {
						var382 = -1;
					}
					boolean var401 = true;
					int var402 = var400.field6657;
					if (var382 != -1 && var402 != -1) {
						if (var382 == var402) {
							EffectAnimType var403 = (EffectAnimType) effectAnimTypeList.list(var382);
							if (var403.field8261 && var403.anim != -1) {
								SeqType var404 = (SeqType) seqTypeList.list(var403.anim);
								int var405 = var404.field1768;
								if (var405 == 0 || var405 == 2) {
									var401 = false;
								} else if (var405 == 1) {
									var401 = true;
								}
							}
						} else {
							EffectAnimType var406 = (EffectAnimType) effectAnimTypeList.list(var382);
							EffectAnimType var407 = (EffectAnimType) effectAnimTypeList.list(var402);
							if (var406.anim != -1 && var407.anim != -1) {
								SeqType var408 = (SeqType) seqTypeList.list(var406.anim);
								SeqType var409 = (SeqType) seqTypeList.list(var407.anim);
								if (var408.priority < var409.priority) {
									var401 = false;
								}
							}
						}
					}
					if (var401) {
						var400.field6657 = var382;
						var400.field6661 = var380;
						var400.field6658 = var386;
						if (var382 == -1) {
							var400.field6659.method14362(-1);
						} else {
							EffectAnimType var410 = (EffectAnimType) effectAnimTypeList.list(var382);
							int var411 = var410.field8261 ? 0 : 2;
							if (var387) {
								var411 = 1;
							}
							var400.field6659.method14353(var410.anim, var383, var411, false);
						}
					}
				}
			} else if (var381 >> 28 != 0) {
				int var412 = var381 & 0xFFFF;
				PlayerEntity var413;
				if (currentPlayerUid == var412) {
					var413 = localPlayerEntity;
				} else {
					var413 = players[var412];
				}
				if (var413 != null) {
					EntitySpotAnim var414 = var413.spotAnims[var384];
					if (var382 == 65535) {
						var382 = -1;
					}
					boolean var415 = true;
					int var416 = var414.field6657;
					if (var382 != -1 && var416 != -1) {
						if (var382 == var416) {
							EffectAnimType var417 = (EffectAnimType) effectAnimTypeList.list(var382);
							if (var417.field8261 && var417.anim != -1) {
								SeqType var418 = (SeqType) seqTypeList.list(var417.anim);
								int var419 = var418.field1768;
								if (var419 == 0 || var419 == 2) {
									var415 = false;
								} else if (var419 == 1) {
									var415 = true;
								}
							}
						} else {
							EffectAnimType var420 = (EffectAnimType) effectAnimTypeList.list(var382);
							EffectAnimType var421 = (EffectAnimType) effectAnimTypeList.list(var416);
							if (var420.anim != -1 && var421.anim != -1) {
								SeqType var422 = (SeqType) seqTypeList.list(var420.anim);
								SeqType var423 = (SeqType) seqTypeList.list(var421.anim);
								if (var422.priority < var423.priority) {
									var415 = false;
								}
							}
						}
					}
					if (var415) {
						var414.field6657 = var382;
						var414.field6661 = var380;
						var414.field6658 = var386;
						var414.field6660 = var385;
						if (var382 == -1) {
							var414.field6659.method14362(-1);
						} else {
							EffectAnimType var424 = (EffectAnimType) effectAnimTypeList.list(var382);
							int var425 = var424.field8261 ? 0 : 2;
							if (var387) {
								var425 = 1;
							}
							var414.field6659.method14353(var424.anim, var383, var425, false);
						}
					}
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_SHAKE == connection.packetType) {
			int var426 = in.g2_alt2();
			int var427 = in.g1_alt1();
			int var428 = in.g1_alt2();
			int var429 = in.g1_alt3();
			int var430 = in.g1();
			incrementVerifyId();
			cameraModifierEnabled[var427] = true;
			cameraModifierJitter[var427] = var428;
			cameraModifierWobbleScale[var427] = var429;
			cameraModifierCycle[var427] = var430;
			cameraModifierWobbleSpeed[var427] = var426;
			connection.packetType = null;
			return true;
		} else if (ServerProt.MIDI_SONG == connection.packetType) {
			int var431 = in.g2_alt3();
			if (var431 == 65535) {
				var431 = -1;
			}
			int var432 = in.g1_alt2();
			audioApi.playSong(var431, var432);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_PRIVATE_ECHO == connection.packetType) {
			String var433 = in.gjstr();
			String var434 = StringHelper.escape(WordPack.method5939(in));
			ChatHistory.addMessage(6, 0, var433, var433, var433, var434, null);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOGOUT == connection.packetType) {
			logoutReason = (LogoutReason) SerializableEnums.decode(LogoutReason.method10365(), in.g1());
			logout(false);
			connection.packetType = null;
			return false;
		} else if (ServerProt.UPDATE_UID192 == connection.packetType) {
			in.pos += 28;
			if (in.checkcrc()) {
				GameShell.storeUID192(in, in.pos - 28);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MIDI_SONG_STOP == connection.packetType) {
			audioApi.stopSong();
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_MOVE_ROW == connection.packetType) {
			if (!telemetryError) {
				try {
					int var435 = in.g1_alt1();
					int var436 = in.g1_alt3();
					int var437 = in.g1();
					telemetry.getGroup(var436).moveRow(var437, var435);
				} catch (RuntimeException var724) {
					JagException.report(null, var724);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_OBJ == connection.packetType) {
			int var439 = in.g2();
			int var440 = in.g4_alt3();
			CoordGrid var441 = new CoordGrid(in.g4_alt2());
			int var442 = in.g4_alt1();
			int var443 = in.g4s();
			int var444 = in.g2_alt1();
			int var445 = in.g4_alt3();
			int var446 = in.g1_alt1();
			int var447 = in.g4_alt2();
			incrementVerifyId();
			ifOpenSub(var442, new SubInterfaceActiveObj(var439, var446, new ObjReference(var441, var444)), new int[] { var445, var447, var440, var443 }, false);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOC_DEL == connection.packetType) {
			handleZonePacket(ZoneProt.LOC_DEL);
			connection.packetType = null;
			return true;
		} else if (ServerProt.NPC_INFO == connection.packetType) {
			method7099(world.npcViewDistance);
			connection.packetType = null;
			return true;
		} else if (ServerProt.POINTLIGHT_COLOUR == connection.packetType) {
			int var448 = in.g4_alt3();
			int var449 = in.g2_alt1();
			int var450 = in.g2_alt3();
			world.getScene().addPointLightColour(var450, var448, var449);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_STOCKMARKET_SLOT == connection.packetType) {
			int var451 = in.g1();
			int var452 = in.g1();
			if (in.g1() == 0) {
				stockmarketSlots[var451][var452] = new StockmarketSlot();
			} else {
				in.pos -= 1;
				stockmarketSlots[var451][var452] = new StockmarketSlot(in, null);
			}
			lastOnStockTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_REMOVE_ROW == connection.packetType) {
			if (!telemetryError) {
				try {
					int var453 = in.g1_alt3();
					int var454 = in.g1();
					telemetry.getGroup(var453).removeRow(var454);
				} catch (RuntimeException var725) {
					JagException.report(null, var725);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_FRIENDCHAT == connection.packetType) {
			boolean var456 = in.g1() == 1;
			String var457 = in.gjstr();
			String var458 = var457;
			if (var456) {
				var458 = in.gjstr();
			}
			String var459 = in.gjstr();
			long var460 = (long) in.g2();
			long var462 = (long) in.g3();
			ChatCrownType var464 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			int var465 = in.g2();
			long var466 = (var460 << 32) + var462;
			boolean var468 = false;
			int var469 = 0;
			while (true) {
				if (var469 >= 100) {
					if (var464.ignorable && ignoreTest(var458)) {
						var468 = true;
					}
					break;
				}
				if (messageIds[var469] == var466) {
					var468 = true;
					break;
				}
				var469++;
			}
			if (!var468) {
				messageIds[messageCount] = var466;
				messageCount = (messageCount + 1) % 100;
				String var470 = quickChatPhraseTypeList.list(var465).method19507(in);
				if (var464.img == -1) {
					ChatHistory.method15054(20, 0, var457, var458, var457, var470, var459, var465, var464);
				} else {
					ChatHistory.method15054(20, 0, TextUtil.imgTag(var464.img) + var457, TextUtil.imgTag(var464.img) + var458, var457, var470, var459, var465, var464);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_PLAYER == connection.packetType) {
			int var471 = in.g4_alt2();
			int var472 = in.g4_alt3();
			int var473 = in.g4_alt2();
			int var474 = in.g4s();
			int var475 = in.g1();
			int var476 = in.g2();
			int var477 = in.g4_alt3();
			int var478 = in.g2_alt3();
			incrementVerifyId();
			ifOpenSub(var473, new SubInterfaceActivePlayer(var478, var475, var476), new int[] { var471, var477, var472, var474 }, false);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_PLAYER_GROUP == connection.packetType) {
			String var479 = in.gjstr();
			long var480 = (long) in.g2();
			long var482 = (long) in.g3();
			ChatCrownType var484 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			boolean var485 = in.g1() == 1;
			int var486 = in.g2();
			long var487 = (var480 << 32) + var482;
			boolean var489 = false;
			if (currentPlayerGroup == null) {
				var489 = true;
			} else {
				int var490 = 0;
				while (true) {
					if (var490 >= 100) {
						if (var484.ignorable && ignoreTest(var479)) {
							var489 = true;
						}
						break;
					}
					if (messageIds[var490] == var487) {
						var489 = true;
						break;
					}
					var490++;
				}
			}
			if (!var489) {
				messageIds[messageCount] = var487;
				messageCount = (messageCount + 1) % 100;
				String var491 = quickChatPhraseTypeList.list(var486).method19507(in);
				int var492 = var485 ? 23 : 25;
				if (var484.img == -1) {
					ChatHistory.method15054(var492, 0, var479, var479, var479, var491, currentPlayerGroup.getDisplayName(), var486, var484);
				} else {
					ChatHistory.method15054(var492, 0, TextUtil.imgTag(var484.img) + var479, TextUtil.imgTag(var484.img) + var479, var479, var491, currentPlayerGroup.getDisplayName(), var486, var484);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_CLOSESUB == connection.packetType) {
			int var493 = in.g4_alt2();
			incrementVerifyId();
			SubInterface var494 = (SubInterface) openedSubInterfaces.get((long) var493);
			if (var494 != null) {
				ifCloseSub(var494, true, false);
			}
			if (pressedContinueOption != null) {
				requestRedrawComponent(pressedContinueOption);
				pressedContinueOption = null;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_VALUES_DELTA == connection.packetType) {
			if (!telemetryError) {
				try {
					for (byte var495 = in.g1b(); var495 != -1; var495 = in.g1b()) {
						for (byte var496 = in.g1b(); var496 != -1; var496 = in.g1b()) {
							for (byte var497 = in.g1b(); var497 != -1; var497 = in.g1b()) {
								telemetry.getGroup(var495).clearGridValue(var496, var497, in.g4s());
							}
						}
					}
				} catch (RuntimeException var729) {
					JagException.report(null, var729);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLANCHANNEL_DELTA == connection.packetType) {
			lastOnClanChannelTransmitRedrawCycle = redrawCycle;
			boolean var499 = in.g1() == 1;
			ClanChannelDelta var500 = new ClanChannelDelta(in);
			ClanChannel var501;
			if (var499) {
				var501 = affinedClanChannel;
			} else {
				var501 = listenedClanChannel;
			}
			var500.applyToClanChannel(var501);
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_FRIENDCHANNEL == connection.packetType) {
			boolean var502 = in.g1() == 1;
			String var503 = in.gjstr();
			String var504 = var503;
			if (var502) {
				var504 = in.gjstr();
			}
			String var505 = in.gjstr();
			long var506 = (long) in.g2();
			long var508 = (long) in.g3();
			ChatCrownType var510 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			long var511 = (var506 << 32) + var508;
			boolean var513 = false;
			int var514 = 0;
			while (true) {
				if (var514 >= 100) {
					if (var510.ignorable) {
						if (field10951 && !playerIsQuickChat || loggedInQuickChat) {
							var513 = true;
						} else if (ignoreTest(var504)) {
							var513 = true;
						}
					}
					break;
				}
				if (messageIds[var514] == var511) {
					var513 = true;
					break;
				}
				var514++;
			}
			if (!var513) {
				messageIds[messageCount] = var511;
				messageCount = (messageCount + 1) % 100;
				String var515 = StringHelper.escape(WordPack.method5939(in));
				if (var510.img == -1) {
					ChatHistory.method15054(9, 0, var503, var504, var503, var515, var505, -1, var510);
				} else {
					ChatHistory.method15054(9, 0, TextUtil.imgTag(var510.img) + var503, TextUtil.imgTag(var510.img) + var504, var503, var515, var505, -1, var510);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.RESET_ANIMS == connection.packetType) {
			for (int var516 = 0; var516 < players.length; var516++) {
				if (players[var516] != null) {
					players[var516].field10427 = null;
					players[var516].field10454.method14362(-1);
				}
			}
			for (int var517 = 0; var517 < npcCount; var517++) {
				((PathingEntity) field10839[var517].value).field10427 = null;
				((PathingEntity) field10839[var517].value).field10454.method14362(-1);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SET_MAP_FLAG == connection.packetType) {
			int var518 = in.g1_alt1();
			int var519 = in.g1();
			if (var518 == 255) {
				var518 = -1;
				var519 = -1;
			}
			DelayedStateChange.setMiniMapFlag(var518, var519);
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARP_SMALL == connection.packetType) {
			byte var520 = in.g1b();
			int var521 = in.g2_alt2();
			localPlayerGameState.varps.setVarValueIntFromServer((VarType) varPlayerTypeList.list(var521), var520);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLEAR_PLAYER_SNAPSHOT == connection.packetType) {
			int var522 = in.g1();
			int var523 = -var522 - 2;
			playerSnapshots.remove(var523);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SET_HTTP_IMAGE == connection.packetType) {
			int var524 = in.g4s();
			int var525 = in.g4_alt1();
			incrementVerifyId();
			Component var526 = Component.get(var524);
			var526.field2188 = var525;
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETOBJECT == connection.packetType) {
			int var527 = in.g2();
			if (var527 == 65535) {
				var527 = -1;
			}
			int var528 = in.g4_alt3();
			int var529 = in.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceLinkObjTypeCount(var528, var527, var529);
			ObjType var530 = (ObjType) objTypeList.list(var527);
			DelayedStateChange.setInterfaceModelXAnYAnZoom(var528, var530.xan2d, var530.yan2d, var530.zoom2d);
			DelayedStateChange.setInterfaceModelXOfYOfZAn(var528, var530.xof2d, var530.yof2d, var530.zan2d);
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_SET_ROW_PINNED == connection.packetType) {
			if (!telemetryError) {
				try {
					int var531 = in.g1_alt1();
					int var532 = in.g1_alt1();
					boolean var533 = in.g1_alt3() == 1;
					telemetry.getGroup(var532).setRowPinned(var531, var533);
				} catch (RuntimeException var726) {
					JagException.report(null, var726);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.SOUND_MIXBUSS_ADD == connection.packetType) {
			int var535 = in.g2();
			int var536 = in.g2();
			int var537 = in.g2();
			audioApi.addBuss(var535, var536, var537);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_INV_FULL == connection.packetType) {
			int var538 = in.g2();
			int var539 = in.g1();
			boolean var540 = (var539 & 0x1) != 0;
			boolean var541 = (var539 & 0x2) != 0;
			ClientInvCache.clear(var538, var540);
			int var542 = in.g2();
			for (int var543 = 0; var543 < var542; var543++) {
				int var544 = in.g2();
				int var545 = in.g1();
				if (var545 == 255) {
					var545 = in.g4s();
				}
				VarContainerSparse var546 = null;
				if (var541) {
					int var547 = in.g1();
					if (var547 > 0) {
						var546 = new VarContainerSparse(varObjTypeList);
						while (var547-- > 0) {
							VarValue var548 = varObjTypeList.decodeVarValue(in);
							var546.setVarValue(var548.var, var548.value);
						}
					}
				}
				ClientInvCache.update(var538, var543, var544 - 1, var545, var546, var540);
			}
			field10783[++field11012 - 1 & 0x3F] = var538;
			connection.packetType = null;
			return true;
		} else if (ServerProt.MESSAGE_PRIVATE == connection.packetType) {
			boolean var549 = in.g1() == 1;
			String var550 = in.gjstr();
			String var551 = var550;
			if (var549) {
				var551 = in.gjstr();
			}
			long var552 = (long) in.g2();
			long var554 = (long) in.g3();
			ChatCrownType var556 = (ChatCrownType) SerializableEnums.decode(ChatCrownType.method6043(), in.g1());
			long var557 = (var552 << 32) + var554;
			boolean var559 = false;
			int var560 = 0;
			while (true) {
				if (var560 >= 100) {
					if (var556.ignorable) {
						if (field10951 && !playerIsQuickChat || loggedInQuickChat) {
							var559 = true;
						} else if (ignoreTest(var551)) {
							var559 = true;
						}
					}
					break;
				}
				if (messageIds[var560] == var557) {
					var559 = true;
					break;
				}
				var560++;
			}
			if (!var559) {
				messageIds[messageCount] = var557;
				messageCount = (messageCount + 1) % 100;
				String var561 = StringHelper.escape(WordPack.method5939(in));
				int var562 = var556.field3609 ? 7 : 3;
				if (var556.img == -1) {
					ChatHistory.method15054(var562, 0, var550, var551, var550, var561, null, -1, var556);
				} else {
					ChatHistory.method15054(var562, 0, TextUtil.imgTag(var556.img) + var550, TextUtil.imgTag(var556.img) + var551, var550, var561, null, -1, var556);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.POINTLIGHT_INTENSITY == connection.packetType) {
			int var563 = in.g2_alt2();
			int var564 = in.g2_alt2();
			int var565 = in.g1();
			if (var565 == 255) {
				var565 = -1;
			}
			world.getScene().setPointLightIntensity(var564, var565, var563);
			connection.packetType = null;
			return true;
		} else if (ServerProt.STORE_SERVERPERM_VARCS_ACK == connection.packetType) {
			clientVarDomain.method16413();
			connection.packetType = null;
			return false;
		} else if (ServerProt.CREATE_CHECK_EMAIL_REPLY == connection.packetType) {
			int var566 = in.g1();
			CheckEmailReply var567 = (CheckEmailReply) SerializableEnums.decode(CheckEmailReply.method4289(), var566);
			if (var567 == null) {
				var567 = CheckEmailReply.field8402;
			}
			AccountCreationManager.method3581(var567);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_MOVETO == connection.packetType) {
			int var568 = in.g1_alt2();
			int var569 = in.g1_alt1();
			int var570 = in.g1();
			int var571 = in.g1_alt3();
			int var572 = in.g2() << 2;
			incrementVerifyId();
			cameraMoveTo(var568, var570, var572, var569, var571, true);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOC_ADD_CHANGE == connection.packetType) {
			handleZonePacket(ZoneProt.LOC_ADD_CHANGE);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETTEXTFONT == connection.packetType) {
			int var573 = in.g4_alt1();
			int var574 = in.g4_alt3();
			incrementVerifyId();
			DelayedStateChange.setInterfaceFontType(var573, var574);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_OPENSUB == connection.packetType) {
			int var575 = in.g4_alt2();
			int var576 = in.g4_alt1();
			int var577 = in.g1_alt2();
			int var578 = in.g4s();
			int var579 = in.g2();
			int var580 = in.g4_alt2();
			int var581 = in.g4_alt2();
			incrementVerifyId();
			ifOpenSub(var576, new SubInterface(var579, var577), new int[] { var581, var580, var575, var578 }, false);
			connection.packetType = null;
			return true;
		} else if (ServerProt.SETDRAWORDER == connection.packetType) {
			int var582 = in.g1_alt3();
			incrementVerifyId();
			drawOrder = var582;
			connection.packetType = null;
			return true;
		} else if (ServerProt.VARBIT_LARGE == connection.packetType) {
			int var583 = in.g2_alt2();
			int var584 = in.g4_alt1();
			localPlayerGameState.varps.setVarBitValueFromServer((VarBitType) varBitTypeList.list(var583), var584);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CHAT_FILTER_SETTINGS == connection.packetType) {
			tradeChatFilter = in.g1_alt2();
			publicChatFilter = in.g1_alt2();
			connection.packetType = null;
			return true;
		} else if (ServerProt.REFLECTION_CHECKER == connection.packetType) {
			ReflectionCheck.method10680(in, connection.packetSize);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_FRIENDCHAT_CHANNEL_FULL == connection.packetType) {
			lastOnClanTransmitRedrawCycle = redrawCycle;
			if (connection.packetSize == 0) {
				clanChatDisplayName = null;
				clanChatOwnerName = null;
				clanChatCount = 0;
				clanChatUsers = null;
				connection.packetType = null;
				return true;
			}
			clanChatOwnerName = in.gjstr();
			boolean var585 = in.g1() == 1;
			if (var585) {
				in.gjstr();
			}
			clanChatDisplayName = in.gjstr();
			clanChatMinKick = in.g1b();
			int var586 = in.g1();
			if (var586 == 255) {
				connection.packetType = null;
				return true;
			}
			clanChatCount = var586;
			FriendChatUser[] var587 = new FriendChatUser[100];
			for (int var588 = 0; var588 < clanChatCount; var588++) {
				var587[var588] = new FriendChatUser();
				var587[var588].name = in.gjstr();
				boolean var589 = in.g1() == 1;
				if (var589) {
					var587[var588].nameUnfiltered = in.gjstr();
				} else {
					var587[var588].nameUnfiltered = var587[var588].name;
				}
				var587[var588].field755 = NamespaceUtil.normalize(var587[var588].nameUnfiltered, namespace);
				var587[var588].world = in.g2();
				var587[var588].rank = in.g1b();
				var587[var588].worldName = in.gjstr();
				if (var587[var588].nameUnfiltered.equals(localPlayerEntity.nameUnfiltered)) {
					clanChatRank = var587[var588].rank;
				}
			}
			boolean var590 = false;
			int var591 = clanChatCount;
			while (var591 > 0) {
				boolean var592 = true;
				var591--;
				for (int var593 = 0; var593 < var591; var593++) {
					if (var587[var593].field755.compareTo(var587[var593 + 1].field755) > 0) {
						FriendChatUser var594 = var587[var593];
						var587[var593] = var587[var593 + 1];
						var587[var593 + 1] = var594;
						var592 = false;
					}
				}
				if (var592) {
					break;
				}
			}
			clanChatUsers = var587;
			connection.packetType = null;
			return true;
		} else if (ServerProt.PROJANIM_SPECIFIC == connection.packetType) {
			int var595 = in.g2_alt1();
			byte var596 = in.g1b_alt2();
			int var597 = in.g2_alt3();
			int var598 = in.g2();
			int var599 = in.g2_alt2();
			int var600 = in.g1_alt2();
			if (var600 == 255) {
				var600 = -1;
			}
			int var601 = in.g2s_alt1();
			int var602 = in.g1_alt3();
			int var603 = in.g1();
			int var604 = in.g2s_alt1();
			int var605 = in.g2();
			byte var606 = in.g1b_alt3();
			int var607 = in.g1_alt1() * 4;
			int var608 = in.g1();
			int var609 = in.g2_alt1();
			boolean var610 = (var602 & 0x1) != 0;
			boolean var611 = (var602 & 0x2) != 0;
			int var612 = var611 ? var602 >> 2 : -1;
			int var613;
			if (var611) {
				var613 = (byte) var608;
			} else {
				var613 = var608 * 4;
			}
			CoordGrid var614 = world.getBase();
			int var615 = var595 - var614.x * 2;
			int var616 = var605 - var614.z * 2;
			int var617 = var596 + var615;
			int var618 = var606 + var616;
			if (var615 >= 0 && var616 >= 0 && var615 < world.getSizeX() * 2 && var616 < world.getSizeX() * 2 && var617 >= 0 && var618 >= 0 && var617 < world.getSizeZ() * 2 && var618 < world.getSizeZ() * 2 && var609 != 65535) {
				int var619 = var615 * 256;
				int var620 = var616 * 256;
				int var621 = var617 * 256;
				int var622 = var618 * 256;
				int var623 = var613 << 2;
				int var624 = var607 << 2;
				int var625 = var599 << 2;
				method3621(var609, var601, var604, var612, var623, var624, var619, var620, var621, var622, var597, var598, var600, var625, var610, 0, var603);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_NPC == connection.packetType) {
			int var626 = in.g2_alt3();
			int var627 = in.g4_alt1();
			int var628 = in.g4_alt3();
			int var629 = in.g4_alt3();
			int var630 = in.g2_alt1();
			int var631 = in.g1();
			int var632 = in.g4s();
			int var633 = in.g4_alt1();
			incrementVerifyId();
			ifOpenSub(var633, new SubInterfaceActiveNpc(var626, var631, var630), new int[] { var627, var628, var632, var629 }, false);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLANSETTINGS_DELTA == connection.packetType) {
			lastOnClanSettingsTransmitRedrawCycle = redrawCycle;
			boolean var634 = in.g1() == 1;
			ClanSettingsDelta var635 = new ClanSettingsDelta(in);
			ClanSettings var636;
			if (var634) {
				var636 = affinedClanSettings;
			} else {
				var636 = listenedClanSettings;
			}
			var635.applyToClanSettings(var636);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CHANGE_LOBBY == connection.packetType) {
			String var637 = in.gjstr();
			int var638 = in.g2();
			int var639 = in.g2();
			int var640 = in.g2();
			WorldSwitcher.currentLobby.host = var637;
			WorldSwitcher.currentLobby.node = var638;
			WorldSwitcher.currentLobby.port = var639;
			WorldSwitcher.currentLobby.port2 = var640;
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOC_CUSTOMISE == connection.packetType) {
			handleZonePacket(ZoneProt.LOC_CUSTOMISE);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPOSITION == connection.packetType) {
			int var641 = in.g2s_alt1();
			int var642 = in.g2s_alt2();
			int var643 = in.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceDataXY(var643, var641, var642);
			connection.packetType = null;
			return true;
		} else if (ServerProt.REDUCE_PLAYER_ATTACK_PRIORITY == connection.packetType) {
			field10954 = (AttackOpPriority) SerializableEnums.decode(AttackOpPriority.method10149(), in.g1());
			if (field10954 == null) {
				field10954 = AttackOpPriority.field7908;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_SOUND_GROUP_STOP == connection.packetType) {
			int var644 = in.g2();
			audioApi.stopGroup(var644);
			connection.packetType = null;
			return true;
		} else if (ServerProt.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER == connection.packetType) {
			String var645 = in.gjstr();
			boolean var646 = in.g1() == 1;
			String var647;
			if (var646) {
				var647 = in.gjstr();
			} else {
				var647 = var645;
			}
			int var648 = in.g2();
			byte var649 = in.g1b();
			boolean var650 = false;
			if (var649 == -128) {
				var650 = true;
			}
			if (var650) {
				if (clanChatCount == 0) {
					connection.packetType = null;
					return true;
				}
				boolean var651 = false;
				int var652;
				for (var652 = 0; var652 < clanChatCount && (!clanChatUsers[var652].nameUnfiltered.equals(var647) || clanChatUsers[var652].world != var648); var652++) {
				}
				if (var652 < clanChatCount) {
					while (var652 < clanChatCount - 1) {
						clanChatUsers[var652] = clanChatUsers[var652 + 1];
						var652++;
					}
					clanChatCount--;
					clanChatUsers[clanChatCount] = null;
				}
			} else {
				String var653 = in.gjstr();
				FriendChatUser var654 = new FriendChatUser();
				var654.name = var645;
				var654.nameUnfiltered = var647;
				var654.field755 = NamespaceUtil.normalize(var654.nameUnfiltered, namespace);
				var654.world = var648;
				var654.rank = var649;
				var654.worldName = var653;
				int var655;
				for (var655 = clanChatCount - 1; var655 >= 0; var655--) {
					int var656 = clanChatUsers[var655].field755.compareTo(var654.field755);
					if (var656 == 0) {
						clanChatUsers[var655].world = var648;
						clanChatUsers[var655].rank = var649;
						clanChatUsers[var655].worldName = var653;
						if (var647.equals(localPlayerEntity.nameUnfiltered)) {
							clanChatRank = var649;
						}
						lastOnClanTransmitRedrawCycle = redrawCycle;
						connection.packetType = null;
						return true;
					}
					if (var656 < 0) {
						break;
					}
				}
				if (clanChatCount >= clanChatUsers.length) {
					connection.packetType = null;
					return true;
				}
				for (int var657 = clanChatCount - 1; var657 > var655; var657--) {
					clanChatUsers[var657 + 1] = clanChatUsers[var657];
				}
				if (clanChatCount == 0) {
					clanChatUsers = new FriendChatUser[100];
				}
				clanChatUsers[var655 + 1] = var654;
				clanChatCount++;
				if (var647.equals(localPlayerEntity.nameUnfiltered)) {
					clanChatRank = var649;
				}
			}
			lastOnClanTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETANIM == connection.packetType) {
			int var658 = in.g4s();
			int var659 = in.g4_alt3();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModelAnim(var658, var659);
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_MOVE_COLUMN == connection.packetType) {
			if (!telemetryError) {
				try {
					int var660 = in.g1_alt2();
					int var661 = in.g1();
					int var662 = in.g1();
					telemetry.getGroup(var661).moveColumn(var660, var662);
				} catch (RuntimeException var727) {
					JagException.report(null, var727);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETCLICKMASK == connection.packetType) {
			int var664 = in.g4_alt3();
			boolean var665 = in.g1_alt2() == 1;
			incrementVerifyId();
			DelayedStateChange.setInterfaceClickMask(var664, var665);
			connection.packetType = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_ADD_COLUMN == connection.packetType) {
			if (!telemetryError) {
				try {
					byte var666 = in.g1b_alt1();
					int var667 = in.g4s();
					int var668 = in.g1_alt3();
					telemetry.getGroup(var668).addColumn(var667, var666);
				} catch (RuntimeException var728) {
					JagException.report(null, var728);
					notifyTelemetryError(connection);
				}
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.OBJ_DEL == connection.packetType) {
			handleZonePacket(ZoneProt.OBJ_DEL);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCSTR_SMALL == connection.packetType) {
			int var670 = in.g2();
			String var671 = in.gjstr();
			incrementVerifyId();
			DelayedStateChange.setVarCStr(var670, var671);
			connection.packetType = null;
			return true;
		} else if (ServerProt.ENVIRONMENT_OVERRIDE == connection.packetType) {
			EnvironmentOverride var672 = new EnvironmentOverride();
			boolean var673 = var672.method10382(in);
			world.getEnvironmentManager().setOverride(world, var673 ? var672 : null, var672.getFadeDuration());
			connection.packetType = null;
			return true;
		} else if (ServerProt.RUNCLIENTSCRIPT == connection.packetType) {
			String var674 = in.gjstr();
			Object[] var675 = new Object[var674.length() + 1];
			for (int var676 = var674.length() - 1; var676 >= 0; var676--) {
				if (var674.charAt(var676) == 's') {
					var675[var676 + 1] = in.gjstr();
				} else {
					var675[var676 + 1] = Integer.valueOf(in.g4s());
				}
			}
			var675[0] = Integer.valueOf(in.g4s());
			incrementVerifyId();
			HookRequest var677 = new HookRequest();
			var677.onop = var675;
			ScriptRunner.runHook(var677);
			connection.packetType = null;
			return true;
		} else if (ServerProt.DO_CHEAT == connection.packetType) {
			String var678 = in.gjstr();
			DeveloperConsole.doCheat(var678, false, false);
			connection.packetType = null;
			return true;
		} else if (ServerProt.OBJ_ADD == connection.packetType) {
			handleZonePacket(ZoneProt.OBJ_ADD);
			connection.packetType = null;
			return true;
		} else if (ServerProt.NPC_HEADICON_SPECIFIC == connection.packetType) {
			int var679 = in.g4s();
			int var680 = in.g2s();
			int var681 = in.g1_alt1();
			int var682 = in.g2_alt3();
			ObjectNode var683 = (ObjectNode) npcs.get((long) var682);
			if (var683 != null) {
				NpcEntity var684 = (NpcEntity) var683.value;
				if (var684.field12080 == null) {
					var684.field12080 = new NPCHeadIconCustomisation(var684.npcType);
				}
				var684.field12080.field2682[var681] = var679;
				var684.field12080.field2681[var681] = (short) var680;
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.TRIGGER_ONDIALOGABORT == connection.packetType) {
			if (openedTopInterface != -1) {
				method1023(openedTopInterface, 0);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETSCROLLPOS == connection.packetType) {
			int var685 = in.g4s();
			int var686 = in.g2_alt2();
			incrementVerifyId();
			DelayedStateChange.setInterfaceScrollYPos(var685, var686);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETNPCHEAD == connection.packetType) {
			int var687 = in.g4_alt3();
			int var688 = in.g4_alt2();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var687, 2, var688, -1);
			connection.packetType = null;
			return true;
		} else if (ServerProt.LOGOUT_TRANSFER == connection.packetType) {
			int var689 = in.g2();
			String var690 = in.gjstr();
			int var691 = in.g2();
			int var692 = in.g2();
			boolean var693 = in.g1() == 1;
			WorldSwitcher.field8753 = WorldSwitcher.currentWorld;
			WorldSwitcher.transferCancellable = var693;
			WorldSwitcher.setWorld(var689, var690, var691, var692);
			Object var694 = null;
			setState(19);
			connection.packetType = null;
			return false;
		} else if (ServerProt.VORBIS_SOUND_GROUP_START == connection.packetType) {
			int var695 = in.g2();
			audioApi.startGroup(var695);
			connection.packetType = null;
			return true;
		} else if (ServerProt.PLAYER_GROUP_FULL == connection.packetType) {
			lastOnPlayerGroupTransmitRedrawCycle = redrawCycle;
			if (connection.packetSize == 0) {
				currentPlayerGroup = null;
			} else {
				currentPlayerGroup = new PlayerGroup(0L, in, true, field10837);
			}
			connection.packetType = null;
			return true;
		} else if (ServerProt.VORBIS_SOUND == connection.packetType) {
			int var696 = in.g2();
			if (var696 == 65535) {
				var696 = -1;
			}
			int var697 = in.g1();
			int var698 = in.g2();
			int var699 = in.g1();
			int var700 = in.g2();
			audioApi.playSound(SoundType.field1832, var696, var697, var699, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var700, var698);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAM_LOOKAT == connection.packetType) {
			int var701 = in.g1_alt2();
			int var702 = in.g1();
			int var703 = in.g1_alt3();
			int var704 = in.g1_alt2();
			int var705 = in.g2_alt2() << 2;
			incrementVerifyId();
			cameraLookAt(var701, var702, var705, var704, var703);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETRETEX == connection.packetType) {
			int var706 = in.g2_alt3();
			int var707 = in.g2_alt1();
			int var708 = in.g4s();
			int var709 = in.g1_alt1();
			incrementVerifyId();
			DelayedStateChange.setInterfaceRetex(var708, var709, var706, var707);
			connection.packetType = null;
			return true;
		} else if (ServerProt.REBUILD_NORMAL == connection.packetType) {
			PacketBit var710 = new PacketBit(connection.packetSize);
			System.arraycopy(connection.in.data, connection.in.pos, var710.data, 0, connection.packetSize);
			method3652();
			if (preferences.unknown7.getValue() == 1) {
				asyncRebuild.method7680(new RebuildRequest(RebuildType.REBUILD_NORMAL, var710));
			} else {
				world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_NORMAL, var710));
			}
			connection.packetType = null;
			return false;
		} else if (ServerProt.SET_TARGET == connection.packetType) {
			activeTarget = in.g2s_alt2();
			connection.packetType = null;
			return true;
		} else if (ServerProt.CREATE_CHECK_NAME_REPLY == connection.packetType) {
			int var711 = in.g1();
			CheckNameReply var712 = (CheckNameReply) SerializableEnums.decode(CheckNameReply.method6019(), var711);
			if (var712 == null) {
				var712 = CheckNameReply.field8404;
			}
			AccountCreationManager.method717(var712);
			connection.packetType = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERMODEL_OTHER == connection.packetType) {
			int var713 = in.g2_alt1();
			int var714 = in.g4s();
			int var715 = in.g4s();
			incrementVerifyId();
			DelayedStateChange.setInterfaceModel(var714, 5, var713, var715);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CAMERA_UPDATE == connection.packetType) {
			cam2.decode(in, connection.packetSize);
			lastOnCameraUpdateTransmitRedrawCycle = redrawCycle;
			connection.packetType = null;
			return true;
		} else if (ServerProt.EXECUTE_CLIENT_CHEAT == connection.packetType) {
			int var716 = in.g2();
			DeveloperConsole.method16614(var716);
			connection.packetType = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCSTR_LARGE == connection.packetType) {
			int var717 = in.g2();
			String var718 = in.gjstr();
			incrementVerifyId();
			DelayedStateChange.setVarCStr(var717, var718);
			connection.packetType = null;
			return true;
		} else {
			JagException.report((connection.packetType == null ? -1 : connection.packetType.id) + TextUtil.COMMA + (connection.lastPacketType1 == null ? -1 : connection.lastPacketType1.id) + TextUtil.COMMA + (connection.lastPacketType2 == null ? -1 : connection.lastPacketType2.id) + " " + connection.packetSize, new RuntimeException());
			logout(false);
			return true;
		}
	}

	@ObfuscatedName("wn.iy(Lnk;I)V")
	public static final void handleZonePacket(ZoneProt arg0) {
		PacketBit var1 = gameConnection.in;
		if (ZoneProt.OBJ_COUNT == arg0) {
			int var2 = var1.g1();
			CoordGrid var3 = world.getBase();
			int var4 = (var2 & 0x7) + zoneBaseZ;
			int var5 = var3.z + var4;
			int var6 = (var2 >> 4 & 0x7) + zoneBaseX;
			int var7 = var3.x + var6;
			int var8 = var1.g2();
			int var9 = var1.g2();
			int var10 = var1.g2();
			if (objStacks != null) {
				ObjStackList var11 = (ObjStackList) objStacks.get((long) (zoneBaseLevel << 28 | var5 << 14 | var7));
				if (var11 != null) {
					for (Obj var12 = (Obj) var11.levelObjStacks.head(); var12 != null; var12 = (Obj) var11.levelObjStacks.next()) {
						if (var12.index == var8 && var12.count == var9) {
							var12.unlink();
							var12.count = var10;
							method540(zoneBaseLevel, var7, var5, var12);
							break;
						}
					}
					if (var6 >= 0 && var4 >= 0 && var6 < world.getSizeX() && var4 < world.getSizeZ()) {
						sortObjStacks(zoneBaseLevel, var6, var4);
					}
				}
			}
		} else if (ZoneProt.LOC_DEL == arg0) {
			int var13 = var1.g1();
			int var14 = var1.g1_alt3();
			int var15 = (var14 >> 4 & 0x7) + zoneBaseX;
			int var16 = (var14 & 0x7) + zoneBaseZ;
			LocPositionAdjustment var17 = new LocPositionAdjustment(var1, var13, false);
			int var18 = locShapeToLayer[var17.shape];
			if (world.getRebuildType().method7888() || var15 >= 0 && var16 >= 0 && var15 < world.getSizeX() && var16 < world.getSizeZ()) {
				ChangeLocationRequest.method4653(zoneBaseLevel, var15, var16, var18, -1, var17.shape, var17.angle, var17.field7539);
			}
		} else if (ZoneProt.SOUND_AREA == arg0) {
			int var19 = var1.g1();
			int var20 = (var19 >> 4 & 0x7) + zoneBaseX;
			int var21 = (var19 & 0x7) + zoneBaseZ;
			int var22 = var1.g2();
			if (var22 == 65535) {
				var22 = -1;
			}
			int var23 = var1.g1();
			int var24 = var23 >> 4 & 0xF;
			int var25 = var23 & 0x7;
			int var26 = var1.g1();
			int var27 = var1.g1();
			int var28 = var1.g2();
			if (world.getRebuildType() != RebuildType.CUTSCENE && (var20 >= 0 && var21 >= 0 && var20 < world.getSizeX() && var21 < world.getSizeZ())) {
				int var29 = var24 + 1;
				if (localPlayerEntity.routeWaypointX[0] >= var20 - var29 && localPlayerEntity.routeWaypointX[0] <= var20 + var29 && localPlayerEntity.routeWaypointZ[0] >= var21 - var29 && localPlayerEntity.routeWaypointZ[0] <= var21 + var29) {
					Vector3 var30 = new Vector3((float) (var20 << 9), 0.0F, (float) (var21 << 9));
					int var31 = zoneBaseLevel;
					audioApi.playSound(SoundType.field1832, var22, var25, var27, SubBussType.SFX_SUB.getId(), SoundShape.field1838, 0.0F, (float) (var24 << 9), var30, var31, var28, var26);
				}
			}
		} else if (ZoneProt.field3618 == arg0) {
			int var32 = var1.g1();
			int var33 = (var32 >> 4 & 0x7) + zoneBaseX;
			int var34 = (var32 & 0x7) + zoneBaseZ;
			int var35 = var1.g2();
			if (var35 == 65535) {
				var35 = -1;
			}
			int var36 = var1.g1();
			int var37 = var36 >> 4 & 0xF;
			int var38 = var36 & 0x7;
			int var39 = var1.g1();
			int var40 = var1.g1();
			int var41 = var1.g2();
			boolean var42 = var1.g1() == 1;
			if (world.getRebuildType() != RebuildType.CUTSCENE && (var33 >= 0 && var34 >= 0 && var33 < world.getSizeX() && var34 < world.getSizeZ())) {
				int var43 = var37 + 1;
				if (localPlayerEntity.routeWaypointX[0] >= var33 - var43 && localPlayerEntity.routeWaypointX[0] <= var33 + var43 && localPlayerEntity.routeWaypointZ[0] >= var34 - var43 && localPlayerEntity.routeWaypointZ[0] <= var34 + var43) {
					Vector3 var44 = new Vector3((float) (var33 << 9), 0.0F, (float) (var34 << 9));
					int var45 = zoneBaseLevel;
					int var46 = var42 ? SubBussType.DIALOG_SUB.getId() : SubBussType.SFX_SUB.getId();
					audioApi.playSound(SoundType.field1832, var35, var38, var40, var46, SoundShape.field1838, 0.0F, (float) (var37 << 9), var44, var45, var41, var39);
				}
			}
		} else if (ZoneProt.MAP_PROJANIM_HALFSQ == arg0) {
			int var47 = var1.g1();
			int var48 = (var47 >> 4 & 0xF) + zoneBaseX * 2;
			int var49 = (var47 & 0xF) + zoneBaseZ * 2;
			int var50 = var1.g1();
			boolean var51 = (var50 & 0x1) != 0;
			boolean var52 = (var50 & 0x2) != 0;
			int var53 = var52 ? var50 >> 2 : -1;
			int var54 = var48 + var1.g1b();
			int var55 = var49 + var1.g1b();
			int var56 = var1.g2s();
			int var57 = var1.g2s();
			int var58 = var1.g2();
			int var59 = var1.g1();
			int var60;
			if (var52) {
				var60 = (byte) var59;
			} else {
				var60 = var59 * 4;
			}
			int var61 = var1.g1() * 4;
			int var62 = var1.g2();
			int var63 = var1.g2();
			int var64 = var1.g1();
			int var65 = var1.g2();
			if (var64 == 255) {
				var64 = -1;
			}
			int var66 = var1.g2s();
			if (world.getRebuildType() != RebuildType.CUTSCENE && (var48 >= 0 && var49 >= 0 && var48 < world.getSizeX() * 2 && var49 < world.getSizeX() * 2 && var54 >= 0 && var55 >= 0 && var54 < world.getSizeZ() * 2 && var55 < world.getSizeZ() * 2 && var58 != 65535)) {
				int var67 = var48 * 256;
				int var68 = var49 * 256;
				int var69 = var54 * 256;
				int var70 = var55 * 256;
				int var71 = var60 << 2;
				int var72 = var61 << 2;
				int var73 = var65 << 2;
				method3621(var58, var56, var57, var53, var71, var72, var67, var68, var69, var70, var62, var63, var64, var73, var51, var66, zoneBaseLevel);
			}
		} else if (ZoneProt.TEXT_COORD == arg0) {
			var1.g1();
			int var74 = var1.g1();
			int var75 = (var74 >> 4 & 0x7) + zoneBaseX;
			int var76 = (var74 & 0x7) + zoneBaseZ;
			int var77 = var1.g2();
			int var78 = var1.g1();
			int var79 = var1.g3();
			String var80 = var1.gjstr();
			if (world.getRebuildType() != RebuildType.CUTSCENE) {
				method8476(zoneBaseLevel, var75, var76, var78, var77, var79, var80);
			}
		} else if (ZoneProt.LOC_ADD_CHANGE == arg0) {
			int var81 = var1.g1();
			int var82 = var1.g4_alt3();
			int var83 = var1.g1_alt2();
			int var84 = (var83 >> 4 & 0x7) + zoneBaseX;
			int var85 = (var83 & 0x7) + zoneBaseZ;
			LocPositionAdjustment var86 = new LocPositionAdjustment(var1, var81, false);
			int var87 = locShapeToLayer[var86.shape];
			if (world.getRebuildType().method7888() || var84 >= 0 && var85 >= 0 && var84 < world.getSizeX() && var85 < world.getSizeZ()) {
				ChangeLocationRequest.method4653(zoneBaseLevel, var84, var85, var87, var82, var86.shape, var86.angle, var86.field7539);
			}
		} else if (ZoneProt.LOC_PREFETCH == arg0) {
			int var88 = var1.g4s();
			int var89 = var1.g1();
			((LocType) world.getLocTypeList().list(var88)).method9473(var89);
		} else if (ZoneProt.MAP_PROJANIM == arg0) {
			int var90 = var1.g1();
			boolean var91 = (var90 & 0x80) != 0;
			int var92 = (var90 >> 3 & 0x7) + zoneBaseX;
			int var93 = (var90 & 0x7) + zoneBaseZ;
			int var94 = var92 + var1.g1b();
			int var95 = var93 + var1.g1b();
			int var96 = var1.g2s();
			int var97 = var1.g2();
			int var98 = var1.g1() * 4;
			int var99 = var1.g1() * 4;
			int var100 = var1.g2();
			int var101 = var1.g2();
			int var102 = var1.g1();
			int var103 = var1.g2();
			int var104 = var1.g2s();
			if (var102 == 255) {
				var102 = -1;
			}
			if (world.getRebuildType() != RebuildType.CUTSCENE && (var92 >= 0 && var93 >= 0 && var92 < world.getSizeX() && var93 < world.getSizeZ() && var94 >= 0 && var95 >= 0 && var94 < world.getSizeX() && var95 < world.getSizeZ() && var97 != 65535)) {
				int var105 = var92 * 512 + 256;
				int var106 = var93 * 512 + 256;
				int var107 = var94 * 512 + 256;
				int var108 = var95 * 512 + 256;
				int var109 = var98 << 2;
				int var110 = var99 << 2;
				int var111 = var103 << 2;
				ProjectileAnimation var112 = new ProjectileAnimation(world.getScene(), var97, zoneBaseLevel, zoneBaseLevel, var105, var106, var109, loopCycle + var100, loopCycle + var101, var102, var111, 0, var96, var110, var91, -1, var104);
				var112.updateVelocity(var107, var108, getHeightmapY(var107, var108, zoneBaseLevel) - var110, loopCycle + var100);
				projectiles.addTail(new ProjectileEntityNode(var112));
			}
		} else if (ZoneProt.OBJ_DEL == arg0) {
			int var113 = var1.g2();
			int var114 = var1.g1_alt3();
			CoordGrid var115 = world.getBase();
			int var116 = (var114 & 0x7) + zoneBaseZ;
			int var117 = var115.z + var116;
			int var118 = (var114 >> 4 & 0x7) + zoneBaseX;
			int var119 = var115.x + var118;
			ObjStackList var120 = (ObjStackList) objStacks.get((long) (zoneBaseLevel << 28 | var117 << 14 | var119));
			if (var120 != null) {
				for (Obj var121 = (Obj) var120.levelObjStacks.head(); var121 != null; var121 = (Obj) var120.levelObjStacks.next()) {
					if (var121.index == var113) {
						var121.unlink();
						break;
					}
				}
				if (var120.levelObjStacks._isEmpty()) {
					var120.unlink();
				}
				if (var118 >= 0 && var116 >= 0 && var118 < world.getSizeX() && var116 < world.getSizeZ()) {
					sortObjStacks(zoneBaseLevel, var118, var116);
				}
			}
		} else if (ZoneProt.OBJ_REVEAL == arg0) {
			int var122 = var1.g2_alt3();
			int var123 = var1.g1();
			CoordGrid var124 = world.getBase();
			int var125 = (var123 & 0x7) + zoneBaseZ;
			int var126 = var124.z + var125;
			int var127 = (var123 >> 4 & 0x7) + zoneBaseX;
			int var128 = var124.x + var127;
			int var129 = var1.g2_alt2();
			int var130 = var1.g2();
			if (currentPlayerUid != var130) {
				boolean var131 = var127 >= 0 && var125 >= 0 && var127 < world.getSizeX() && var125 < world.getSizeZ();
				if (var131 || world.getRebuildType().method7888()) {
					method540(zoneBaseLevel, var128, var126, new Obj(var129, var122));
					if (var131) {
						sortObjStacks(zoneBaseLevel, var127, var125);
					}
				}
			}
		} else if (ZoneProt.LOC_ANIM == arg0) {
			int var132 = var1.g4_alt1();
			int var133 = var1.g1_alt1();
			int var134 = var1.g1_alt3();
			int var135 = (var134 >> 4 & 0x7) + zoneBaseX;
			int var136 = (var134 & 0x7) + zoneBaseZ;
			int var137 = var1.g1_alt3();
			LocPositionAdjustment var138 = new LocPositionAdjustment(var1, var133, false);
			int layer = locShapeToLayer[var138.shape];
			if (world.getRebuildType() != RebuildType.CUTSCENE) {
				method8895(zoneBaseLevel, var135, var136, layer, var138.shape, var138.angle, var138.field7539, var132, var137);
			}
		} else if (ZoneProt.LOC_CUSTOMISE == arg0) {
			int var140 = var1.g1();
			int var141 = var1.g4_alt3();
			int var142 = var1.g1_alt2();
			int var143 = var1.g1_alt3();
			int var144 = (var143 >> 4 & 0x7) + zoneBaseX;
			int var145 = (var143 & 0x7) + zoneBaseZ;
			LocPositionAdjustment var146 = new LocPositionAdjustment(var1, var142, false);
			int var147 = locShapeToLayer[var146.shape];
			if (LocShape.CENTREPIECE_DIAGONAL.id == var146.shape) {
				var146.shape = LocShape.CENTREPIECE_STRAIGHT.id;
			}
			if ((var140 & 0x1) == 1) {
				ChangeLocationRequest.method6816(zoneBaseLevel, var144, var145, var147, var141, var146.shape, null);
			} else {
				int[] var148 = null;
				if ((var140 & 0x2) == 2) {
					int var149 = var1.g1();
					var148 = new int[var149];
					for (int var150 = 0; var150 < var149; var150++) {
						var148[var150] = var1.g4s();
					}
				}
				short[] var151 = null;
				if ((var140 & 0x4) == 4) {
					int var152 = var1.g1();
					var151 = new short[var152];
					for (int var153 = 0; var153 < var152; var153++) {
						var151[var153] = (short) var1.g2();
					}
				}
				short[] var154 = null;
				if ((var140 & 0x8) == 8) {
					int var155 = var1.g1();
					var154 = new short[var155];
					for (int var156 = 0; var156 < var155; var156++) {
						var154[var156] = (short) var1.g2();
					}
				}
				ChangeLocationRequest.method6816(zoneBaseLevel, var144, var145, var147, var141, var146.shape, new LocTypeCustomisation(ChangeLocationRequest.field11243, var148, var151, var154));
				ChangeLocationRequest.field11243++;
			}
		} else if (ZoneProt.MAP_ANIM == arg0) {
			int var157 = var1.g1();
			int var158 = (var157 >> 4 & 0x7) + zoneBaseX;
			int var159 = (var157 & 0x7) + zoneBaseZ;
			int var160 = var1.g2();
			if (var160 == 65535) {
				var160 = -1;
			}
			int var161 = var1.g2();
			int var162 = var1.g2();
			int var163 = var1.g1();
			int var164 = var1.g2s();
			if (world.getRebuildType() != RebuildType.CUTSCENE && (var158 >= 0 && var159 >= 0 && var158 < world.getSizeX() && var159 < world.getSizeZ())) {
				if (var160 == -1) {
					SpotAnimEntityNode var165 = (SpotAnimEntityNode) spotanims.get((long) (var158 << 16 | var159));
					if (var165 != null) {
						var165.field12264.method19749();
						var165.unlink();
					}
				} else {
					int var166 = var158 * 512 + 256;
					int var167 = var159 * 512 + 256;
					int var168 = zoneBaseLevel;
					if (var168 < 3 && world.getSceneLevelTileFlags().isLinkBelow(var158, var159)) {
						var168++;
					}
					SpotAnimation var169 = new SpotAnimation(world.getScene(), var160, var162, zoneBaseLevel, var168, var166, getHeightmapY(var166, var167, zoneBaseLevel) - var161, var167, var158, var158, var159, var159, var163, false, var164);
					spotanims.put(new SpotAnimEntityNode(var169), (long) (var158 << 16 | var159));
				}
			}
		} else if (ZoneProt.OBJ_ADD == arg0) {
			int var170 = var1.g1_alt3();
			CoordGrid var171 = world.getBase();
			int var172 = (var170 & 0x7) + zoneBaseZ;
			int var173 = var171.z + var172;
			int var174 = (var170 >> 4 & 0x7) + zoneBaseX;
			int var175 = var171.x + var174;
			int var176 = var1.g2_alt3();
			int var177 = var1.g2_alt1();
			boolean var178 = var174 >= 0 && var172 >= 0 && var174 < world.getSizeX() && var172 < world.getSizeZ();
			if (var178 || world.getRebuildType().method7888()) {
				method540(zoneBaseLevel, var175, var173, new Obj(var176, var177));
				if (var178) {
					sortObjStacks(zoneBaseLevel, var174, var172);
				}
			}
		} else {
			JagException.report("" + arg0, new RuntimeException());
			logout(false);
		}
	}

	@ObfuscatedName("y.ii(IIILajf;I)V")
	public static void method540(int arg0, int arg1, int arg2, Obj arg3) {
		long var4 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		ObjStackList var6 = (ObjStackList) objStacks.get(var4);
		if (var6 == null) {
			ObjStackList var7 = new ObjStackList();
			objStacks.put(var7, var4);
			var7.levelObjStacks.addTail(arg3);
			return;
		}
		ObjType var8 = (ObjType) objTypeList.list(arg3.index);
		int var9 = var8.cost;
		if (var8.stackable == 1) {
			var9 = (arg3.count + 1) * var9;
		}
		for (Obj var10 = (Obj) var6.levelObjStacks.head(); var10 != null; var10 = (Obj) var6.levelObjStacks.next()) {
			ObjType var11 = (ObjType) objTypeList.list(var10.index);
			int var12 = var11.cost;
			if (var11.stackable == 1) {
				var12 = (var10.count + 1) * var12;
			}
			if (var9 > var12) {
				LinkList.addTail(arg3, var10);
				return;
			}
		}
		var6.levelObjStacks.addTail(arg3);
	}

	@ObfuscatedName("qv.iz(IIII)V")
	public static void sortObjStacks(int level, int x, int z) {
		CoordGrid var3 = world.getBase();
		int var4 = var3.x + x;
		int var5 = var3.z + z;
		if (world.getScene() == null || world.getRebuildType() == RebuildType.CUTSCENE || x < 0 || z < 0 || x >= world.getSizeX() || z >= world.getSizeZ()) {
			return;
		}
		long var6 = (long) (level << 28 | var5 << 14 | var4);
		ObjStackList var8 = (ObjStackList) objStacks.get(var6);
		if (var8 == null) {
			world.getScene().removeObjStack(level, x, z);
			return;
		}
		Obj var9 = (Obj) var8.levelObjStacks.head();
		if (var9 == null) {
			world.getScene().removeObjStack(level, x, z);
			return;
		}
		int var10 = -1;
		int var11 = -1;
		int var12 = -1;
		Matrix4x3 var13 = null;
		Matrix4x3 var14 = null;
		Matrix4x3 var15 = null;
		ObjStackEntity var16 = (ObjStackEntity) world.getScene().removeObjStack(level, x, z);
		if (var16 == null) {
			var16 = new ObjStackEntity(world.getScene(), x << 265, world.getScene().levelHeightmaps[level].getTileHeight(x, z), z << 265, level, level);
		} else {
			var10 = var16.field12580;
			var11 = var16.field12569;
			var12 = var16.field12573;
			var13 = var16.field12571;
			var14 = var16.field12568;
			var15 = var16.field12577;
			var16.field12573 = -1;
			var16.field12569 = -1;
			var16.scene = world.getScene();
		}
		var16.field12580 = var9.index;
		var16.field12570 = var9.count;
		label98: while (true) {
			Obj var18 = (Obj) var8.levelObjStacks.next();
			if (var18 == null) {
				break;
			}
			if (var16.field12580 != var18.index) {
				var16.field12569 = var18.index;
				var16.field12572 = var18.count;
				while (true) {
					Obj var19 = (Obj) var8.levelObjStacks.next();
					if (var19 == null) {
						break label98;
					}
					if (var16.field12580 != var19.index && var16.field12569 != var19.index) {
						var16.field12573 = var19.index;
						var16.field12583 = var19.count;
					}
				}
			}
		}
		int var20 = getHeightmapY((x << 9) + 256, (z << 9) + 256, level);
		var16.setPosition((float) (x << 265), (float) var20, (float) (z << 265));
		if (var16.field12580 != var10) {
			if (var16.field12580 == var11) {
				var16.field12571 = var14;
			} else if (var16.field12580 == var12) {
				var16.field12571 = var15;
			} else if (((ObjType) objTypeList.list(var16.field12580)).field8697) {
				var16.field12571 = ObjStackEntity.method820();
			} else {
				var16.field12571 = null;
			}
		}
		if (var16.field12569 == -1) {
			var16.field12568 = null;
		} else if (var16.field12569 != var11) {
			if (var16.field12569 == var10) {
				var16.field12568 = var13;
			} else if (var16.field12569 == var12) {
				var16.field12568 = var15;
			} else if (((ObjType) objTypeList.list(var16.field12569)).field8697) {
				var16.field12568 = ObjStackEntity.method820();
			} else {
				var16.field12568 = null;
			}
		}
		if (var16.field12573 == -1) {
			var16.field12577 = null;
		} else if (var16.field12573 != var12) {
			if (var16.field12573 == var10) {
				var16.field12577 = var13;
			} else if (var16.field12573 == var11) {
				var16.field12577 = var14;
			} else if (((ObjType) objTypeList.list(var16.field12573)).field8697) {
				var16.field12577 = ObjStackEntity.method820();
			} else {
				var16.field12577 = null;
			}
		}
		var16.field12578 = 0;
		var16.level = (byte) level;
		var16.occludeLevel = (byte) level;
		if (world.getSceneLevelTileFlags().isLinkBelow(x, z)) {
			var16.occludeLevel++;
		}
		world.getScene().addObjStack(level, x, z, var20, var16);
	}

	@ObfuscatedName("qp.ik(II)V")
	public static final void method7099(int arg0) {
		field10846 = 0;
		field10876 = 0;
		field10815++;
		method8430();
		method3366(arg0);
		method6243();
		boolean var1 = false;
		for (int var2 = 0; var2 < field10846; var2++) {
			int var3 = field10847[var2];
			ObjectNode var4 = (ObjectNode) npcs.get((long) var3);
			NpcEntity var5 = (NpcEntity) var4.value;
			if (field10815 != var5.field10440) {
				if (MiniMenu.open && MiniMenu.method8494(var3)) {
					MiniMenu.close();
				}
				if (var5.npcType.hasBackgroundSound()) {
					PositionedSound.method10111(var5);
				}
				var5.method19156(null);
				var4.unlink();
				var1 = true;
			}
		}
		if (var1) {
			int var6 = npcCount;
			npcCount = npcs.size();
			int var7 = 0;
			Iterator var8 = npcs.iterator();
			while (var8.hasNext()) {
				ObjectNode var9 = (ObjectNode) var8.next();
				field10839[var7++] = var9;
			}
			for (int var10 = npcCount; var10 < var6; var10++) {
				field10839[var10] = null;
			}
			PositionMode var11 = cam2.getPositionMode();
			if (PositionMode.ENTITY == var11) {
				PositionEntity var12 = (PositionEntity) cam2.getPosition();
				var12.method16684();
			}
			LookatMode var13 = cam2.getLookatMode();
			if (LookatMode.ENTITY == var13) {
				LookatEntity var14 = (LookatEntity) cam2.getLookat();
				var14.method18815();
			}
		}
		if (gameConnection.packetSize != gameConnection.in.pos) {
			throw new RuntimeException(gameConnection.in.pos + " " + gameConnection.packetSize);
		}
		for (int var15 = 0; var15 < npcSlotCount; var15++) {
			if (npcs.get((long) field11036[var15]) == null) {
				throw new RuntimeException(var15 + " " + npcSlotCount);
			}
		}
		if (npcCount - npcSlotCount != 0) {
			throw new RuntimeException("" + (npcCount - npcSlotCount));
		}
		for (int var16 = 0; var16 < npcCount; var16++) {
			if (((PathingEntity) field10839[var16].value).field10440 != field10815) {
				throw new RuntimeException("" + ((PathingEntity) field10839[var16].value).localPlayerIndex);
			}
		}
	}

	@ObfuscatedName("tr.im(I)V")
	public static final void method8430() {
		PacketBit var0 = gameConnection.in;
		var0.accessBits();
		int var1 = var0.gBit(8);
		if (var1 < npcSlotCount) {
			for (int var2 = var1; var2 < npcSlotCount; var2++) {
				field10847[++field10846 - 1] = field11036[var2];
			}
		}
		if (var1 > npcSlotCount) {
			throw new RuntimeException();
		}
		npcSlotCount = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			int var4 = field11036[var3];
			NpcEntity var5 = (NpcEntity) ((ObjectNode) npcs.get((long) var4)).value;
			int var6 = var0.gBit(1);
			if (var6 == 0) {
				field11036[++npcSlotCount - 1] = var4;
				var5.field10440 = field10815;
			} else {
				int var7 = var0.gBit(2);
				if (var7 == 0) {
					field11036[++npcSlotCount - 1] = var4;
					var5.field10440 = field10815;
					field10844[++field10876 - 1] = var4;
				} else if (var7 == 1) {
					field11036[++npcSlotCount - 1] = var4;
					var5.field10440 = field10815;
					CompassPoint var8 = (CompassPoint) SerializableEnums.decode(CompassPoint.values(), var0.gBit(3));
					var5.step(var8, MoveSpeed.WALK.serialID);
					int var9 = var0.gBit(1);
					if (var9 == 1) {
						field10844[++field10876 - 1] = var4;
					}
				} else if (var7 == 2) {
					field11036[++npcSlotCount - 1] = var4;
					var5.field10440 = field10815;
					if (var0.gBit(1) == 1) {
						CompassPoint var10 = (CompassPoint) SerializableEnums.decode(CompassPoint.values(), var0.gBit(3));
						var5.step(var10, MoveSpeed.RUN.serialID);
						CompassPoint var11 = (CompassPoint) SerializableEnums.decode(CompassPoint.values(), var0.gBit(3));
						var5.step(var11, MoveSpeed.RUN.serialID);
					} else {
						CompassPoint var12 = (CompassPoint) SerializableEnums.decode(CompassPoint.values(), var0.gBit(3));
						var5.step(var12, MoveSpeed.CRAWL.serialID);
					}
					int var13 = var0.gBit(1);
					if (var13 == 1) {
						field10844[++field10876 - 1] = var4;
					}
				} else if (var7 == 3) {
					field10847[++field10846 - 1] = var4;
				}
			}
		}
	}

	@ObfuscatedName("fy.ic(IB)V")
	public static final void method3366(int arg0) {
		PacketBit var1 = gameConnection.in;
		while (var1.bitsAvailable(gameConnection.packetSize) >= 15) {
			int var2 = var1.gBit(15);
			if (var2 == 32767) {
				break;
			}
			boolean var3 = false;
			ObjectNode var4 = (ObjectNode) npcs.get((long) var2);
			if (var4 == null) {
				NpcEntity var5 = new NpcEntity(world.getScene());
				var5.localPlayerIndex = var2;
				var4 = new ObjectNode(var5);
				npcs.put(var4, (long) var2);
				field10839[++npcCount - 1] = var4;
				var3 = true;
			}
			NpcEntity var6 = (NpcEntity) var4.value;
			field11036[++npcSlotCount - 1] = var2;
			var6.field10440 = field10815;
			if (var6.npcType != null && var6.npcType.hasBackgroundSound()) {
				PositionedSound.method10111(var6);
			}
			int var7 = var1.gBit(2);
			int var8 = var1.gBit(arg0);
			if (var8 > (0x1 << arg0 - 1) - 1) {
				var8 -= 0x1 << arg0;
			}
			int var9 = var1.gBit(1);
			if (var9 == 1) {
				field10844[++field10876 - 1] = var2;
			}
			var6.method19156((NPCType) npcTypeList.list(var1.gBit(15)));
			int var10 = var1.gBit(1);
			int var11 = var1.gBit(3) + 4 << 11 & 0x3FFF;
			int var12 = var1.gBit(arg0);
			if (var12 > (0x1 << arg0 - 1) - 1) {
				var12 -= 0x1 << arg0;
			}
			var6.setSize(var6.npcType.size);
			var6.field10444 = var6.npcType.turnspeed << 3;
			if (var3) {
				var6.method16491(var11, true);
			}
			var6.move(var7, localPlayerEntity.routeWaypointX[0] + var12, localPlayerEntity.routeWaypointZ[0] + var8, var10 == 1, var6.size());
			if (var6.npcType.hasBackgroundSound()) {
				PositionedSound.method9739(var6.level, var6.routeWaypointX[0], var6.routeWaypointZ[0], 0, null, var6, null);
			}
			if (var3) {
				var6.method19155();
			}
		}
		var1.accessBytes();
	}

	@ObfuscatedName("on.jd(I)V")
	public static final void method6243() {
		PacketBit var0 = gameConnection.in;
		for (int var1 = 0; var1 < field10876; var1++) {
			int var2 = field10844[var1];
			NpcEntity var3 = (NpcEntity) ((ObjectNode) npcs.get((long) var2)).value;
			var0.g2();
			int var4 = var0.g1();
			if ((var4 & 0x2) != 0) {
				var4 += var0.g1() << 8;
			}
			if ((var4 & 0x200) != 0) {
				var4 += var0.g1() << 16;
			}
			if ((var4 & 0x100000) != 0) {
				var4 += var0.g1() << 24;
			}
			if ((var4 & 0x4000000) != 0) {
				int var5 = var0.g2_alt1();
				int var6 = var0.g4_alt3();
				if (var5 == 65535) {
					var5 = -1;
				}
				int var7 = var0.g1();
				int var8 = var7 & 0x7;
				int var9 = var7 >> 3 & 0xF;
				if (var9 == 15) {
					var9 = -1;
				}
				boolean var10 = (var7 >> 7 & 0x1) == 1;
				var3.addSpotAnimation(var5, var6, var8, var9, var10, 3);
			}
			if ((var4 & 0x2000) != 0) {
				int var11 = var0.g2_alt1();
				int var12 = var0.g4_alt3();
				if (var11 == 65535) {
					var11 = -1;
				}
				int var13 = var0.g1_alt3();
				int var14 = var13 & 0x7;
				int var15 = var13 >> 3 & 0xF;
				if (var15 == 15) {
					var15 = -1;
				}
				boolean var16 = (var13 >> 7 & 0x1) == 1;
				var3.addSpotAnimation(var11, var12, var14, var15, var16, 1);
			}
			if ((var4 & 0x1000) != 0) {
				int var17 = var0.g1_alt3();
				int[] var18 = new int[var17];
				int[] var19 = new int[var17];
				int[] var20 = new int[var17];
				for (int var21 = 0; var21 < var17; var21++) {
					int var22 = var0.gSmart2or4null();
					var18[var21] = var22;
					var19[var21] = var0.g1();
					var20[var21] = var0.g2_alt2();
				}
				addSequences(var3, var18, var19, var20);
			}
			if ((var4 & 0x4000) != 0) {
				int var23 = var0.g1_alt3();
				int[] var24 = new int[var23];
				int[] var25 = new int[var23];
				for (int var26 = 0; var26 < var23; var26++) {
					int var27 = var0.g2_alt2();
					if ((var27 & 0xC000) == 49152) {
						int var28 = var0.g2_alt3();
						var24[var26] = var27 << 16 | var28;
					} else {
						var24[var26] = var27;
					}
					var25[var26] = var0.g2();
				}
				var3.method16493(var24, var25);
			}
			if ((var4 & 0x1000000) != 0) {
				var3.field12090 = var0.g1_alt1();
			}
			if ((var4 & 0x1) != 0) {
				var3.field12074 = var0.g2_alt1();
				var3.field12075 = var0.g2_alt1();
			}
			if ((var4 & 0x80000) != 0) {
				int var29 = 0;
				if (var3.npcType.recol_d != null) {
					var29 = var3.npcType.recol_d.length;
				}
				byte var30 = 0;
				if (var3.npcType.retex_d != null) {
					var29 = var3.npcType.retex_d.length;
				}
				int var31 = var0.g1();
				if ((var31 & 0x1) != 1) {
					var0.pos += 2;
					int[] var32 = null;
					if ((var31 & 0x2) == 2) {
						int var33 = var0.g1();
						var32 = new int[var33];
						for (int var34 = 0; var34 < var33; var34++) {
							var32[var34] = var0.gSmart2or4null();
						}
					}
					short[] var35 = null;
					if ((var31 & 0x4) == 4) {
						var35 = new short[var29];
						for (int var36 = 0; var36 < var29; var36++) {
							var35[var36] = (short) var0.g2_alt1();
						}
					}
					short[] var37 = null;
					if ((var31 & 0x8) == 8) {
						var37 = new short[var30];
						for (int var38 = 0; var38 < var30; var38++) {
							var37[var38] = (short) var0.g2_alt3();
						}
					}
					long var39 = (long) (++NpcEntity.field12078 - 1);
					new NPCTypeCustomisation(var39, var32, null, null, null, var35, var37);
				}
			}
			if ((var4 & 0x2000000) != 0) {
				int var41 = var0.g2();
				int var42 = var0.g4_alt3();
				if (var41 == 65535) {
					var41 = -1;
				}
				int var43 = var0.g1_alt2();
				int var44 = var43 & 0x7;
				int var45 = var43 >> 3 & 0xF;
				if (var45 == 15) {
					var45 = -1;
				}
				boolean var46 = (var43 >> 7 & 0x1) == 1;
				var3.addSpotAnimation(var41, var42, var44, var45, var46, 4);
			}
			if ((var4 & 0x40) != 0) {
				int[] var47 = new int[4];
				for (int var48 = 0; var48 < 4; var48++) {
					var47[var48] = var0.gSmart2or4null();
				}
				int var49 = var0.g1_alt2();
				addSequences(var3, var47, var49, true);
			}
			if ((var4 & 0x800000) != 0) {
				var3.vislevel = var0.g2_alt3();
				if (var3.vislevel == 65535) {
					var3.vislevel = var3.npcType.vislevel;
				}
			}
			if ((var4 & 0x10) != 0) {
				if (var3.npcType.hasBackgroundSound()) {
					PositionedSound.method10111(var3);
				}
				var3.method19157((NPCType) npcTypeList.list(var0.gSmart2or4null()), (var4 & 0x10000) == 0, (var4 & 0x800000) == 0, true);
				var3.setSize(var3.npcType.size);
				var3.field10444 = var3.npcType.turnspeed << 3;
				if (var3.npcType.hasBackgroundSound()) {
					PositionedSound.method9739(var3.level, var3.routeWaypointX[0], var3.routeWaypointZ[0], 0, null, var3, null);
				}
			}
			if ((var4 & 0x8000) != 0) {
				var3.forceMoveStartSceneTileX = var0.g1b_alt2();
				var3.forceMoveStartSceneTileZ = var0.g1b_alt1();
				var3.forceMoveEndSceneTileX = var0.g1b_alt1();
				var3.forceMoveEndSceneTileZ = var0.g1b_alt2();
				var3.field10419 = var0.g1b_alt3();
				var3.field10428 = var0.g1b_alt3();
				var3.forceMoveEndCycle = var0.g2() + loopCycle;
				var3.forceMoveStartCycle = var0.g2_alt1() + loopCycle;
				var3.field10431 = var0.g2_alt1();
				var3.routeLength = 1;
				var3.field10396 = 0;
				var3.forceMoveStartSceneTileX += var3.routeWaypointX[0];
				var3.forceMoveStartSceneTileZ += var3.routeWaypointZ[0];
				var3.forceMoveEndSceneTileX += var3.routeWaypointX[0];
				var3.forceMoveEndSceneTileZ += var3.routeWaypointZ[0];
				var3.field10419 += var3.level;
				var3.field10428 += var3.level;
			}
			if ((var4 & 0x10000000) != 0) {
				var3.field10434 = var0.g1b_alt2();
				var3.field10435 = var0.g1b_alt1();
				var3.field10436 = var0.g1b();
				var3.field10437 = (byte) var0.g1();
				var3.field10446 = loopCycle + var0.g2();
				var3.field10464 = loopCycle + var0.g2_alt1();
			}
			if ((var4 & 0x20) != 0) {
				var3.targetId = var0.g2_alt3();
				if (var3.targetId == 65535) {
					var3.targetId = -1;
				}
			}
			if ((var4 & 0x40000) != 0) {
				int var50 = var0.data[(++var0.pos) - 1] & 0xFF;
				for (int var51 = 0; var51 < var50; var51++) {
					int var52 = var0.g1();
					int var53 = var0.g4_alt2();
					int var54 = var0.g3_alt3();
					var3.method19165(var52, var53, var54);
				}
			}
			if ((var4 & 0x8) != 0) {
				int var55 = var0.g1_alt1();
				if (var55 > 0) {
					for (int var56 = 0; var56 < var55; var56++) {
						int var57 = -1;
						boolean var58 = true;
						int var59 = -1;
						int var60 = var0.gSmart1or2();
						int var61;
						if (var60 == 32767) {
							var60 = var0.gSmart1or2();
							var61 = var0.gSmart1or2();
							var57 = var0.gSmart1or2();
							var59 = var0.gSmart1or2();
						} else if (var60 == 32766) {
							var60 = -1;
							var61 = var0.g1_alt2();
						} else {
							var61 = var0.gSmart1or2();
						}
						int var62 = var0.gSmart1or2();
						var3.addHitmark(var60, var61, var57, var59, loopCycle, var62);
					}
				}
				int var63 = var0.g1_alt1();
				if (var63 > 0) {
					for (int var64 = 0; var64 < var63; var64++) {
						int var65 = var0.gSmart1or2();
						int var66 = var0.gSmart1or2();
						if (var66 == 32767) {
							var3.method16500(var65);
						} else {
							int var67 = var0.gSmart1or2();
							int var68 = var0.g1_alt3();
							int var69 = var66 > 0 ? var0.g1() : var68;
							var3.addHeadbar(var65, loopCycle, var66, var67, var68, var69);
						}
					}
				}
			}
			if ((var4 & 0x200000) != 0) {
				var3.vars.clear();
				var0.pos += 2;
				int var70 = var0.data[(++var0.pos) - 1] & 0xFF;
				for (int var71 = 0; var71 < var70; var71++) {
					int var72 = var0.g1_alt2();
					BaseVarType var73 = (BaseVarType) SerializableEnums.decode(BaseVarType.values(), var72);
					VarValue var74 = varNpcTypeList.decodeVarValue(var0, var73);
					var3.vars.setVarValue(var74.var, var74.value);
				}
			}
			if ((var4 & 0x20000) != 0) {
				int var75 = var0.g1_alt1();
				int[] var76 = new int[8];
				short[] var77 = new short[8];
				for (int var78 = 0; var78 < 8; var78++) {
					if ((var75 & 0x1 << var78) == 0) {
						var76[var78] = -1;
						var77[var78] = -1;
					} else {
						var76[var78] = var0.gSmart2or4null();
						var77[var78] = (short) var0.gSmart1or2null();
					}
				}
				var3.field12080 = new NPCHeadIconCustomisation(var76, var77);
			}
			if ((var4 & 0x800) != 0) {
				var3.field12079 = var0.g2_alt3();
				if (var3.field12079 == 65535) {
					var3.field12079 = -1;
				}
			}
			if ((var4 & 0x4) != 0) {
				var3.method19166(var0.gjstr(), 0, 0);
			}
			if ((var4 & 0x80) != 0) {
				int var79 = var0.g2();
				int var80 = var0.g4_alt3();
				if (var79 == 65535) {
					var79 = -1;
				}
				int var81 = var0.g1_alt1();
				int var82 = var81 & 0x7;
				int var83 = var81 >> 3 & 0xF;
				if (var83 == 15) {
					var83 = -1;
				}
				boolean var84 = (var81 >> 7 & 0x1) == 1;
				var3.addSpotAnimation(var79, var80, var82, var83, var84, 0);
			}
			if ((var4 & 0x400) != 0) {
				int var85 = 0;
				if (var3.npcType.recol_d != null) {
					var85 = var3.npcType.recol_d.length;
				}
				int var86 = 0;
				if (var3.npcType.retex_d != null) {
					var86 = var3.npcType.retex_d.length;
				}
				int var87 = var0.g1_alt2();
				if ((var87 & 0x1) == 1) {
					var3.field12076 = null;
				} else {
					var0.pos += 2;
					int[] var88 = null;
					float[] var89 = null;
					int[][] var90 = null;
					int[][] var91 = null;
					if ((var87 & 0x2) == 2) {
						int var92 = var0.g1_alt2();
						var88 = new int[var92];
						if ((var87 & 0x10) == 16) {
							var89 = new float[var92];
							var90 = new int[var92][3];
							var91 = new int[var92][3];
						}
						for (int var93 = 0; var93 < var92; var93++) {
							var88[var93] = var0.gSmart2or4null();
							if ((var87 & 0x10) == 16 && var88[var93] != -1) {
								var89[var93] = var0.gFloat();
								for (int var94 = 0; var94 < 3; var94++) {
									var90[var93][var94] = var0.g2s_alt1();
								}
								for (int var95 = 0; var95 < 3; var95++) {
									var91[var93][var95] = var0.g2s();
								}
							}
						}
					}
					short[] var96 = null;
					if ((var87 & 0x4) == 4) {
						var96 = new short[var85];
						for (int var97 = 0; var97 < var85; var97++) {
							var96[var97] = (short) var0.g2();
						}
					}
					short[] var98 = null;
					if ((var87 & 0x8) == 8) {
						var98 = new short[var86];
						for (int var99 = 0; var99 < var86; var99++) {
							var98[var99] = (short) var0.g2();
						}
					}
					long var100 = (long) (++NpcEntity.field12077 - 1);
					var3.field12076 = new NPCTypeCustomisation(var100, var88, var89, var90, var91, var96, var98);
				}
			}
			if ((var4 & 0x10000) != 0) {
				var3.name = var0.gjstr();
				if ("".equals(var3.name) || var3.name.equals(var3.npcType.name)) {
					var3.name = var3.npcType.name;
				}
			}
			if ((var4 & 0x20000000) != 0) {
				var3.field10401 = var0.g1() == 1;
			}
			if ((var4 & 0x8000000) != 0) {
				int var102 = var0.g2();
				int var103 = var0.g4_alt3();
				if (var102 == 65535) {
					var102 = -1;
				}
				int var104 = var0.g1();
				int var105 = var104 & 0x7;
				int var106 = var104 >> 3 & 0xF;
				if (var106 == 15) {
					var106 = -1;
				}
				boolean var107 = (var104 >> 7 & 0x1) == 1;
				var3.addSpotAnimation(var102, var103, var105, var106, var107, 2);
			}
			if ((var4 & 0x400000) != 0) {
				var0.pos += 2;
				int var108 = var0.data[(++var0.pos) - 1] & 0xFF;
				for (int var109 = 0; var109 < var108; var109++) {
					int var110 = var0.g1_alt3();
					BaseVarType var111 = (BaseVarType) SerializableEnums.decode(BaseVarType.values(), var110);
					VarValue var112 = varNpcTypeList.decodeVarValue(var0, var111);
					var3.vars.setVarValue(var112.var, var112.value);
				}
			}
		}
	}

	@ObfuscatedName("vs.jf(Lahm;[IIZI)V")
	public static void addSequences(PathingEntity arg0, int[] seqs, int arg2, boolean arg3) {
		if (arg0.field10427 != null) {
			boolean var4 = true;
			for (int var5 = 0; var5 < arg0.field10427.length; var5++) {
				if (arg0.field10427[var5] != seqs[var5]) {
					var4 = false;
					break;
				}
			}
			AnimationNode var6 = arg0.field10454;
			if (var4 && var6.hasSeqType()) {
				SeqType var7 = arg0.field10454.getSeqType();
				int var8 = var7.field1768;
				if (var8 == 1) {
					var6.method14389(arg2);
				}
				if (var8 == 2) {
					var6.method14422();
				}
			}
		}
		boolean var9 = true;
		for (int var10 = 0; var10 < seqs.length; var10++) {
			if (seqs[var10] != -1) {
				var9 = false;
			}
			if (arg0.field10427 == null || arg0.field10427[var10] == -1 || ((SeqType) seqTypeList.list(seqs[var10])).priority >= ((SeqType) seqTypeList.list(arg0.field10427[var10])).priority) {
				arg0.field10427 = seqs;
				arg0.field10454.method14357(arg2);
				if (arg3) {
					arg0.field10396 = arg0.routeLength;
				}
			}
		}
		if (!var9) {
			return;
		}
		arg0.field10427 = seqs;
		arg0.field10454.method14357(arg2);
		if (arg3) {
			arg0.field10396 = arg0.routeLength;
		}
	}

	@ObfuscatedName("tl.ju(IIIIIILoe;IIB)V")
	public static void method8895(int arg0, int arg1, int arg2, int layer, int shape, int angle, ScaleRotTrans arg6, int arg7, int arg8) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= world.getSizeX() - 1 || arg2 >= world.getSizeZ() - 1) {
			return;
		}
		if (world.getScene() == null) {
			return;
		}
		if (layer == 0) {
			Location var9 = (Location) world.getScene().getWall(arg0, arg1, arg2);
			Location var10 = (Location) world.getScene().getDynamicWall(arg0, arg1, arg2);
			if (var9 != null && shape != 2) {
				if (var9 instanceof DynamicWallEntity) {
					((DynamicWallEntity) var9).loc.method8260(arg7, arg8);
				} else {
					ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var9.getId(), angle, shape, arg6, arg7, arg8);
				}
			}
			if (var10 != null) {
				if (var10 instanceof DynamicWallEntity) {
					((DynamicWallEntity) var10).loc.method8260(arg7, arg8);
				} else {
					ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var10.getId(), angle, shape, arg6, arg7, arg8);
				}
			}
		} else if (layer == 1) {
			Location var11 = (Location) world.getScene().getWallDecoration(arg0, arg1, arg2);
			if (var11 != null) {
				if (var11 instanceof DynamicWallDecorEntity) {
					((DynamicWallDecorEntity) var11).loc.method8260(arg7, arg8);
				} else {
					int var12 = var11.getId();
					if (shape == 4 || shape == 5) {
						ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var12, angle, 4, arg6, arg7, arg8);
					} else if (shape == 6) {
						ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var12, angle + 4, 4, arg6, arg7, arg8);
					} else if (shape == 7) {
						ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var12, (angle + 2 & 0x3) + 4, 4, arg6, arg7, arg8);
					} else if (shape == 8) {
						ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var12, angle + 4, 4, arg6, arg7, arg8);
						ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var12, (angle + 2 & 0x3) + 4, 4, arg6, arg7, arg8);
					}
				}
			}
		} else if (layer == 2) {
			Location var13 = (Location) world.getScene().getEntity(arg0, arg1, arg2, field11001);
			if (var13 != null) {
				if (shape == 11) {
					shape = 10;
				}
				if (var13 instanceof DynamicSceneryEntity) {
					((DynamicSceneryEntity) var13).loc.method8260(arg7, arg8);
				} else {
					ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var13.getId(), angle, shape, arg6, arg7, arg8);
				}
			}
		} else if (layer == 3) {
			Location var14 = (Location) world.getScene().getGroundDecoration(arg0, arg1, arg2);
			if (var14 != null) {
				if (var14 instanceof DynamicGroundDecorEntity) {
					((DynamicGroundDecorEntity) var14).loc.method8260(arg7, arg8);
				} else {
					ChangeLocationRequest.method15005(arg0, layer, arg1, arg2, var14.getId(), angle, shape, arg6, arg7, arg8);
				}
			}
		}
	}

	@ObfuscatedName("fn.jy(IIIIB)V")
	public static final void requestRedrawAtPoint(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < topLevelComponentCount; var4++) {
			Rectangle var5 = field11040[var4];
			if (var5.x + var5.width > arg0 && var5.x < arg0 + arg2 && var5.y + var5.height > arg1 && var5.y < arg1 + arg3) {
				topLevelComponentRedrawRequestedTemp[var4] = true;
			}
		}
	}

	@ObfuscatedName("adh.jl(ILjava/lang/String;I)V")
	public static void opplayer(int arg0, String arg1) {
		int var2 = ReceivePlayerPositions.highResolutionsCount;
		int[] var3 = ReceivePlayerPositions.highResolutionsIndices;
		boolean var4 = false;
		for (int var5 = 0; var5 < var2; var5++) {
			PlayerEntity var6 = players[var3[var5]];
			if (var6 != null && localPlayerEntity != var6 && var6.nameUnfiltered != null && var6.nameUnfiltered.equalsIgnoreCase(arg1)) {
				ClientProt var7 = null;
				if (arg0 == 1) {
					var7 = ClientProt.OPPLAYER1;
				} else if (arg0 == 2) {
					var7 = ClientProt.OPPLAYER2;
				} else if (arg0 == 3) {
					var7 = ClientProt.OPPLAYER3;
				} else if (arg0 == 4) {
					var7 = ClientProt.OPPLAYER4;
				} else if (arg0 == 5) {
					var7 = ClientProt.OPPLAYER5;
				} else if (arg0 == 6) {
					var7 = ClientProt.OPPLAYER6;
				} else if (arg0 == 7) {
					var7 = ClientProt.OPPLAYER7;
				} else if (arg0 == 8) {
					var7 = ClientProt.OPPLAYER8;
				} else if (arg0 == 9) {
					var7 = ClientProt.OPPLAYER9;
				} else if (arg0 == 10) {
					var7 = ClientProt.OPPLAYER10;
				}
				if (var7 != null) {
					ClientMessage var8 = ClientMessage.createMessage(var7, gameConnection.randomOut);
					var8.buf.p2(var3[var5]);
					var8.buf.p1_alt1(0);
					gameConnection.queue(var8);
				}
				var4 = true;
				break;
			}
		}
		if (!var4) {
			ChatHistory.method1006(4, LocalisedText.UNABLETOFIND.forLang(language) + arg1);
		}
	}

	@ObfuscatedName("ie.jn(Ljava/lang/String;I)V")
	public static void opplayert(String arg0) {
		if (!targetModeActive || (field1765 & 0x18) == 0) {
			return;
		}
		boolean var1 = false;
		int var2 = ReceivePlayerPositions.highResolutionsCount;
		int[] var3 = ReceivePlayerPositions.highResolutionsIndices;
		for (int var4 = 0; var4 < var2; var4++) {
			PlayerEntity var5 = players[var3[var4]];
			if (var5.nameUnfiltered != null && var5.nameUnfiltered.equalsIgnoreCase(arg0) && (localPlayerEntity == var5 && (field1765 & 0x10) != 0 || (field1765 & 0x8) != 0)) {
				ClientMessage var6 = ClientMessage.createMessage(ClientProt.OPPLAYERT, gameConnection.randomOut);
				var6.buf.p2(activeComponentId);
				var6.buf.p1_alt1(0);
				var6.buf.p2_alt1(activeComponentInvobject);
				var6.buf.p2_alt3(var3[var4]);
				var6.buf.p4_alt2(activeComponentParentLayer);
				gameConnection.queue(var6);
				method6820(var5.routeWaypointX[0], var5.routeWaypointZ[0]);
				var1 = true;
				break;
			}
		}
		if (!var1) {
			ChatHistory.method1006(4, LocalisedText.UNABLETOFIND.forLang(language) + arg0);
		}
		if (targetModeActive) {
			method9403();
		}
	}

	@ObfuscatedName("yz.je(Lhf;IIB)V")
	public static void setTargetActiveComponent(Component arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.ontargetenter != null) {
			HookRequest var3 = new HookRequest();
			var3.component = arg0;
			var3.onop = arg0.ontargetenter;
			ScriptRunner.runHook(var3);
		}
		targetModeActive = true;
		activeComponentParentLayer = arg0.parentlayer;
		activeComponentId = arg0.id;
		field1765 = arg1;
		field7677 = arg2;
		activeComponentInvobject = arg0.invobject;
		field1844 = arg0.field2202;
		defaultCursor = arg0.field2269;
		requestRedrawComponent(arg0);
	}

	@ObfuscatedName("vu.jb(I)V")
	public static void method9403() {
		if (!targetModeActive) {
			return;
		}
		Component var0 = Component.method16682(activeComponentParentLayer, activeComponentId);
		if (var0 != null && var0.ontargetleave != null) {
			HookRequest var1 = new HookRequest();
			var1.component = var0;
			var1.onop = var0.ontargetleave;
			ScriptRunner.runHook(var1);
		}
		defaultCursor = -1;
		activeComponentInvobject = -1;
		targetModeActive = false;
		if (var0 != null) {
			requestRedrawComponent(var0);
		}
	}

	@ObfuscatedName("a.jm(III)V")
	public static void method612(int arg0, int arg1) {
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.RESUME_PAUSEBUTTON, gameConnection.randomOut);
		var2.buf.p4_alt3(arg0);
		var2.buf.p2_alt2(arg1);
		gameConnection.queue(var2);
	}

	@ObfuscatedName("ahm.jw(Lhf;Lhf;I)V")
	public static void method16600(Component arg0, Component arg1) {
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.IF_BUTTOND, gameConnection.randomOut);
		var2.buf.p2(arg1.id);
		var2.buf.p4_alt3(arg0.parentlayer);
		var2.buf.p2_alt1(arg1.invobject);
		var2.buf.p2_alt3(arg0.invobject);
		var2.buf.p4_alt3(arg1.parentlayer);
		var2.buf.p2_alt1(arg0.id);
		gameConnection.queue(var2);
	}

	@ObfuscatedName("mj.jr(Lhf;B)V")
	public static void method5926(Component arg0) {
		if (!targetModeActive) {
			return;
		}
		if (arg0.onopt != null) {
			Component var1 = Component.method16682(activeComponentParentLayer, activeComponentId);
			if (var1 != null) {
				HookRequest var2 = new HookRequest();
				var2.component = arg0;
				var2.drop = var1;
				var2.onop = arg0.onopt;
				ScriptRunner.runHook(var2);
			}
		}
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.IF_BUTTONT, gameConnection.randomOut);
		var3.buf.p4_alt1(arg0.parentlayer);
		var3.buf.p2(arg0.invobject);
		var3.buf.p2_alt2(activeComponentInvobject);
		var3.buf.p2_alt2(arg0.id);
		var3.buf.p2_alt2(activeComponentId);
		var3.buf.p4_alt1(activeComponentParentLayer);
		gameConnection.queue(var3);
	}

	@ObfuscatedName("id.js(IIILjava/lang/String;S)V")
	public static void method4527(int arg0, int arg1, int arg2, String arg3) {
		Component var4 = Component.method16682(arg1, arg2);
		if (var4 == null) {
			return;
		}
		if (var4.onop != null) {
			HookRequest var5 = new HookRequest();
			var5.component = var4;
			var5.opindex = arg0;
			var5.opbase = arg3;
			var5.onop = var4.onop;
			ScriptRunner.runHook(var5);
		}
		if (!method17197(var4).method17690(arg0 - 1)) {
			return;
		}
		ServerConnection var6 = getCurrentConnection();
		if (state != 13 && state != 18 && state != 0) {
			return;
		}
		if (var4.link == null || var4.groupKind == null) {
			method7076(var6, var4, arg0, arg1, arg2);
			return;
		}
		ClientMessage var7 = ClientMessage.createMessage(ClientProt.IF_PLAYER, var6.randomOut);
		var7.buf.p1(Packet.pjstrlen(var4.link) + 7 + 1);
		var7.buf.pjstr(var4.link);
		var7.buf.p2_alt1(arg2);
		var7.buf.p1_alt2(arg0);
		var7.buf.p1_alt3(var4.groupKind.getId());
		var7.buf.p4_alt2(arg1);
		var6.queue(var7);
	}

	@ObfuscatedName("pu.ji(Lax;Lhf;IIII)V")
	public static void method7076(ServerConnection arg0, Component arg1, int arg2, int arg3, int arg4) {
		if (arg2 == 1) {
			ClientMessage var5 = ClientMessage.createMessage(ClientProt.IF_BUTTON1, arg0.randomOut);
			method6985(var5, arg3, arg4, arg1.invobject);
			arg0.queue(var5);
		}
		if (arg2 == 2) {
			ClientMessage var6 = ClientMessage.createMessage(ClientProt.IF_BUTTON2, arg0.randomOut);
			method6985(var6, arg3, arg4, arg1.invobject);
			arg0.queue(var6);
		}
		if (arg2 == 3) {
			ClientMessage var7 = ClientMessage.createMessage(ClientProt.IF_BUTTON3, arg0.randomOut);
			method6985(var7, arg3, arg4, arg1.invobject);
			arg0.queue(var7);
		}
		if (arg2 == 4) {
			ClientMessage var8 = ClientMessage.createMessage(ClientProt.IF_BUTTON4, arg0.randomOut);
			method6985(var8, arg3, arg4, arg1.invobject);
			arg0.queue(var8);
		}
		if (arg2 == 5) {
			ClientMessage var9 = ClientMessage.createMessage(ClientProt.IF_BUTTON5, arg0.randomOut);
			method6985(var9, arg3, arg4, arg1.invobject);
			arg0.queue(var9);
		}
		if (arg2 == 6) {
			ClientMessage var10 = ClientMessage.createMessage(ClientProt.IF_BUTTON6, arg0.randomOut);
			method6985(var10, arg3, arg4, arg1.invobject);
			arg0.queue(var10);
		}
		if (arg2 == 7) {
			ClientMessage var11 = ClientMessage.createMessage(ClientProt.IF_BUTTON7, arg0.randomOut);
			method6985(var11, arg3, arg4, arg1.invobject);
			arg0.queue(var11);
		}
		if (arg2 == 8) {
			ClientMessage var12 = ClientMessage.createMessage(ClientProt.IF_BUTTON8, arg0.randomOut);
			method6985(var12, arg3, arg4, arg1.invobject);
			arg0.queue(var12);
		}
		if (arg2 == 9) {
			ClientMessage var13 = ClientMessage.createMessage(ClientProt.IF_BUTTON9, arg0.randomOut);
			method6985(var13, arg3, arg4, arg1.invobject);
			arg0.queue(var13);
		}
		if (arg2 == 10) {
			ClientMessage var14 = ClientMessage.createMessage(ClientProt.IF_BUTTON10, arg0.randomOut);
			method6985(var14, arg3, arg4, arg1.invobject);
			arg0.queue(var14);
		}
	}

	@ObfuscatedName("pj.jt(Lakl;IIII)V")
	public static void method6985(ClientMessage arg0, int arg1, int arg2, int arg3) {
		arg0.buf.p2_alt3(arg3);
		arg0.buf.p2_alt2(arg2);
		arg0.buf.p4(arg1);
	}

	@ObfuscatedName("adm.jq(I)V")
	public static final void method15281() {
		field7603 = null;
		drawInterface(openedTopInterface, 0, 0, GameShell.canvasWid, GameShell.canvasHei, 0, 0, -1);
		if (field7603 != null) {
			drawInterfaceComponents(field7603, -1412584499, 0, 0, GameShell.canvasWid, GameShell.canvasHei, field4869, field11893, field1734 == field10828 ? -1 : field10828.field2182, true);
			field7603 = null;
		}
	}

	@ObfuscatedName("xi.jv(IIIIIIIII)V")
	public static final void drawInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (Component.openInterface(arg0, null)) {
			drawInterfaceComponents(Component.interfaces[arg0].method3923(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
		} else if (arg7 == -1) {
			for (int var8 = 0; var8 < 114; var8++) {
				topLevelComponentRedrawRequestedTemp[var8] = true;
			}
		} else {
			topLevelComponentRedrawRequestedTemp[arg7] = true;
		}
	}

	@ObfuscatedName("pk.ja([Lhf;IIIIIIIIZI)V")
	public static final void drawInterfaceComponents(Component[] children, int arg1, int arg2, int arg3, int arg4, int arg5, int x, int y, int arg8, boolean arg9) {
		toolkit.resetBounds(arg2, arg3, arg4, arg5);
		for (int index = 0; index < children.length; index++) {
			Component child = children[index];
			if (child != null && (child.layer == arg1 || arg1 == -1412584499 && field10989 == child)) {
				int var12;
				if (arg8 == -1) {
					field11040[topLevelComponentCount].setBounds(child.x + x, child.y + y, child.width, child.height);
					var12 = ++topLevelComponentCount - 1;
				} else {
					var12 = arg8;
				}
				child.field2182 = var12;
				child.field2237 = loopCycle;
				if (!ifIsVisible(child)) {
					if (child.clientcode != 0) {
						method9454(child);
					}
					int childX = child.x + x;
					int childY = child.y + y;
					int var15 = child.trans;
					if (field10881 && (method17197(child).field11385 != 0 || child.type == 0) && var15 > 127) {
						var15 = 127;
					}
					if (field10989 == child) {
						if (arg1 != -1412584499 && (Component.field2157 == child.dragrenderbehaviour || Component.field2234 == child.dragrenderbehaviour || method17197(child).method17701() && Component.field2266 != child.dragrenderbehaviour)) {
							field7603 = children;
							field4869 = x;
							field11893 = y;
							continue;
						}
						if (field10886 && field10878) {
							int var16 = mouse.getX();
							int var17 = mouse.getY();
							int var18 = var16 - field10991;
							int var19 = var17 - field10992;
							if (var18 < field10995) {
								var18 = field10995;
							}
							if (child.width + var18 > field10995 + field10799) {
								var18 = field10995 + field10799 - child.width;
							}
							if (var19 < field10889) {
								var19 = field10889;
							}
							if (child.height + var19 > field10998 + field10889) {
								var19 = field10998 + field10889 - child.height;
							}
							if (method17197(child).method17701()) {
								requestRedrawAtPoint(var18, var19, child.width, child.height);
							}
							if (Component.field2266 != child.dragrenderbehaviour) {
								childX = var18;
								childY = var19;
							}
						}
						if (Component.field2234 == child.dragrenderbehaviour) {
							var15 = 128;
						}
					}
					int var20;
					int var21;
					int var22;
					int var23;
					if (child.type == 2) {
						var20 = arg2;
						var21 = arg3;
						var22 = arg4;
						var23 = arg5;
					} else {
						int var24 = child.width + childX;
						int var25 = child.height + childY;
						if (child.type == 9) {
							var24++;
							var25++;
						}
						var20 = childX > arg2 ? childX : arg2;
						var21 = childY > arg3 ? childY : arg3;
						var22 = var24 < arg4 ? var24 : arg4;
						var23 = var25 < arg5 ? var25 : arg5;
					}
					if (var20 < var22 && var21 < var23) {
						if (child.clientcode != 0) {
							if (Component.field2341 == child.clientcode || Component.field2161 == child.clientcode) {
								if (gameScreenEnabled) {
									toolkit.flush();
									drawScene(childX, childY, child.width, child.height, Component.field2161 == child.clientcode);
									method9547(var12, var20, var21, var22, var23, childX, childY);
									toolkit.method2263();
									toolkit.resetBounds(arg2, arg3, arg4, arg5);
									topLevelComponentRedrawRequestedTemp[var12] = true;
								}
								continue;
							}
							if (Component.field2171 == child.clientcode && sceneState == 3) {
								if (child.type != 5 || child.method3970(toolkit) != null) {
									MiniMap.drawMiniMap(toolkit, child, childX, childY);
									toolkit.resetBounds(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Component.field2169 == child.clientcode) {
								WorldMapRenderer.method7274(toolkit, childX, childY, child);
								continue;
							}
							if (Component.field2340 == child.clientcode) {
								WorldMapRenderer.method480(toolkit, childX, childY, child, child.colour % 64);
								continue;
							}
							if (Component.COMPASS == child.clientcode) {
								if (child.method3970(toolkit) != null) {
									toolkit.flush();
									drawCompass(child, childX, childY);
									toolkit.resetBounds(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Component.WORLD_MAP == child.clientcode) {
								ClientWorldMap.drawWorldMap(toolkit, childX, childY, child.width, child.height);
								topLevelComponentRedrawRequestedTemp[var12] = true;
								toolkit.resetBounds(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Component.WORLD_MAP_OVERVIEW == child.clientcode) {
								ClientWorldMap.drawWorldMapOverview(toolkit, childX, childY, child.width, child.height);
								topLevelComponentRedrawRequestedTemp[var12] = true;
								toolkit.resetBounds(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Component.DEBUG == child.clientcode) {
								if (field10794 || field10848) {
									drawDebug(childX, childY, child);
									topLevelComponentRedrawRequestedTemp[var12] = true;
								}
								continue;
							}
							if (Component.field2163 == child.clientcode) {
								Sprite var26 = TwitchHardwarePlatform.method4367();
								if (var26 != null) {
									int var27 = arg4 - arg2;
									int var28 = arg5 - arg3;
									float var29 = (float) var27 / (float) var28;
									float var30 = (float) var26.getWidth() / (float) var26.getHeight();
									int var31;
									int var32;
									if (var29 < var30) {
										var31 = var27;
										var32 = (int) ((float) var27 / var30);
									} else {
										var31 = (int) ((float) var28 * var30);
										var32 = var28;
									}
									int var33 = (var27 - var31) / 2 + arg2;
									int var34 = (var28 - var32) / 2 + arg3;
									var26.drawTintedScaled(var33, var34, var31, var32);
								}
								continue;
							}
							if (Component.field2172 == child.clientcode) {
								if (TwitchHardwarePlatform.isStreaming() && TwitchHardwarePlatform.method8634()) {
									TwitchHardwarePlatform.drawTwitchStream(arg2, arg3, arg4, arg5);
								}
								continue;
							}
						}
						if (child.type == 0) {
							if (Component.field2168 == child.clientcode) {
								toolkit.flush();
								world.getEnvironmentManager().updateFull(world);
								toolkit.method2172(childX, childY, GameShell.canvasWid, GameShell.canvasHei);
							}
							drawInterfaceComponents(children, child.parentlayer, var20, var21, var22, var23, childX - child.scrollx, childY - child.scrolly, var12, arg9);
							if (child.sortedsubcomponents != null) {
								drawInterfaceComponents(child.sortedsubcomponents, child.parentlayer, var20, var21, var22, var23, childX - child.scrollx, childY - child.scrolly, var12, arg9);
							}
							SubInterface var35 = (SubInterface) openedSubInterfaces.get((long) child.parentlayer);
							if (var35 != null) {
								drawInterface(var35.field11571, var20, var21, var22, var23, childX - child.scrollx, childY - child.scrolly, var12);
							}
							if (Component.field2168 == child.clientcode) {
								if (toolkit.method2234()) {
									toolkit.method2233(child.width, child.height);
									if (state == 18) {
										draw3DEntityElements(childX, childY, child.width, child.height);
									}
								}
								if (sceneState == 0) {
									int var36 = field11002;
									int var37 = field10871;
									int var38 = field10872;
									int var39 = field10805;
									if (loopCycle < field10869) {
										float var40 = (float) (loopCycle - field10868) * 1.0F / (float) (field10869 - field10868);
										var36 = (int) ((1.0F - var40) * (float) field7950 + (float) field11002 * var40);
										var37 = (int) ((1.0F - var40) * (float) field10297 + (float) field10871 * var40);
										var38 = (int) ((1.0F - var40) * (float) field8521 + (float) field10872 * var40);
										var39 = (int) ((1.0F - var40) * (float) field1843 + (float) field10805 * var40);
									}
									if (var36 > 0) {
										toolkit.fillRectangle(var20, var21, var22 - var20, var23 - var21, var36 << 24 | var37 << 16 | var38 << 8 | var39);
									}
								}
							}
							toolkit.resetBounds(arg2, arg3, arg4, arg5);
						}
						if (topLevelComponentRedrawRequested[var12] || componentDrawMode > 1) {
							if (child.type == 3) {
								if (var15 == 0) {
									if (child.fill) {
										toolkit.fillRectangle(childX, childY, child.width, child.height, child.colour | 0xFF000000, 0);
									} else {
										toolkit.drawRectangle(childX, childY, child.width, child.height, child.colour | 0xFF000000, 0);
									}
								} else if (child.fill) {
									toolkit.fillRectangle(childX, childY, child.width, child.height, 255 - (var15 & 0xFF) << 24 | child.colour & 0xFFFFFF, 1);
								} else {
									toolkit.drawRectangle(childX, childY, child.width, child.height, 255 - (var15 & 0xFF) << 24 | child.colour & 0xFFFFFF, 1);
								}
							} else if (child.type == 4) {
								int var41 = 255 - (var15 & 0xFF);
								if (var41 != 0) {
									Font font = child.method3942(fontProvider, fontFactory);
									if (font != null) {
										int rgb = child.colour;
										String text = child.text;
										if (child.invobject != -1) {
											ObjType var45 = (ObjType) objTypeList.list(child.invobject);
											text = var45.name;
											if (text == null) {
												text = "null";
											}
											if ((var45.stackable == 1 || child.invcount != 1) && child.invcount != -1) {
												text = TextUtil.colTag(16748608) + text + TextUtil.ENDCOL + " x" + formatObjCountTagged(child.invcount);
											}
										}
										if (pressedContinueOption == child) {
											text = LocalisedText.PLEASEWAIT.forLang(language);
											rgb = child.colour;
										}
										if (field10988) {
											toolkit.setBounds(childX, childY, child.width + childX, child.height + childY);
										}
										int shadow = var41 << 24;
										if (child.textantimacro) {
											font.drawStringTaggableAntimacro(text, childX, childY, child.width, child.height, shadow | rgb, child.textshadow ? shadow : -1, child.field2223, child.field2264, field10890, field1681, field11042, DefaultSprites.field10302, null);
										} else {
											font.drawStringTaggable(text, childX, childY, child.width, child.height, shadow | rgb, child.textshadow ? shadow : -1, child.field2223, child.field2264, child.field2229, child.maxlines, DefaultSprites.field10302, null, null, 0, 0);
										}
										if (field10988) {
											toolkit.resetBounds(arg2, arg3, arg4, arg5);
										}
									} else if (Component.field2338) {
										requestRedrawComponent(child);
									}
								}
							} else if (child.type == 5) {
								if (child.field2339 >= 0) {
									child.method4012(skyBoxTypeList, skyDecorTypeList).method7945(toolkit, 0, childX, childY, child.width, child.height, child.field2348 << 3, child.field2162 << 3, 0, 0);
								} else {
									Sprite var48;
									if (child.invobject != -1) {
										PlayerModel var47 = child.field2246 ? localPlayerEntity.model : null;
										var48 = objTypeList.method18900(toolkit, child.invobject, child.invcount, child.outline, child.graphicshadow | 0xFF000000, child.field2241, var47);
									} else if (child.field2188 == -1) {
										var48 = child.method3941(toolkit);
									} else {
										var48 = (Sprite) field11013.get((long) child.field2188);
										if (var48 == null && !field11093.containsKey(child.field2188)) {
											try {
												field11093.put(child.field2188, field7957.method563(new URL(pngHost + "/img/image_" + child.field2188 + ".png?a=" + MonotonicTime.get())));
											} catch (MalformedURLException var86) {
												JagException.report(null, var86);
											}
										}
									}
									if (var48 != null) {
										int var50 = var48.getX();
										int var51 = var48.getY();
										int var52 = 255 - (var15 & 0xFF);
										if (var52 != 0) {
											int var53;
											if (child.colour == -1) {
												var53 = 16777215;
											} else {
												var53 = child.colour & 0xFFFFFF;
												if (var53 == 0) {
													var53 = 16777215;
												}
											}
											int var54 = var53 | var52 << 24;
											boolean var55 = var54 != -1;
											if (child.tiling) {
												toolkit.setBounds(childX, childY, child.width + childX, child.height + childY);
												if (child.angle2d != 0) {
													int var56 = (child.width + (var50 - 1)) / var50;
													int var57 = (child.height + (var51 - 1)) / var51;
													for (int var58 = 0; var58 < var56; var58++) {
														for (int var59 = 0; var59 < var57; var59++) {
															if (var55) {
																var48.method1452((float) var50 / 2.0F + (float) (var50 * var58 + childX), (float) var51 / 2.0F + (float) (var51 * var59 + childY), 4096, child.angle2d, 0, var54, 1);
															} else {
																var48.method1451((float) var50 / 2.0F + (float) (var50 * var58 + childX), (float) var51 / 2.0F + (float) (var51 * var59 + childY), 4096, child.angle2d);
															}
														}
													}
												} else if (var55) {
													var48.drawTiledTinted(childX, childY, child.width, child.height, 0, var54, 1);
												} else {
													var48.drawTiled(childX, childY, child.width, child.height);
												}
												toolkit.resetBounds(arg2, arg3, arg4, arg5);
											} else if (var55) {
												if (child.angle2d != 0) {
													var48.method1452((float) child.width / 2.0F + (float) childX, (float) child.height / 2.0F + (float) childY, child.width * 4096 / var50, child.angle2d, 0, var54, 1);
												} else if (child.width == var50 && child.height == var51) {
													var48.drawSprite(childX, childY, 0, var54, 1);
												} else {
													var48.drawTintedScaled(childX, childY, child.width, child.height, 0, var54, 1);
												}
											} else if (child.angle2d != 0) {
												var48.method1497((float) child.width / 2.0F + (float) childX, (float) child.height / 2.0F + (float) childY, (float) var50 / 2.0F, (float) var51 / 2.0F, child.width * 4096 / var50, child.height * 4096 / var51, child.angle2d, 1, -1, 1);
											} else if (child.width == var50 && child.height == var51) {
												var48.drawSprite(childX, childY);
											} else {
												var48.drawTintedScaled(childX, childY, child.width, child.height);
											}
										}
									} else if (Component.field2338) {
										requestRedrawComponent(child);
									}
								}
							} else if (child.type == 6) {
								toolkit.flush();
								Model var60 = null;
								int var61 = 2048;
								if (child.tint_weight != 0) {
									var61 |= 0x80000;
								}
								int var62 = 0;
								if (child.invobject != -1) {
									ObjType var63 = (ObjType) objTypeList.list(child.invobject);
									if (var63 != null) {
										ObjType var64 = var63.getMeshAddress(child.invcount);
										var60 = var64.method14644(toolkit, var61, 1, child.field2246 ? localPlayerEntity.model : null, child.modelAnimator, 0, 0, 0, 0);
										if (var60 == null) {
											requestRedrawComponent(child);
										} else {
											var62 = -var60.getMinY() >> 1;
										}
									}
								} else if (child.modelkind == 3) {
									int var65 = child.model;
									if (var65 >= 0 && var65 < 2048) {
										PlayerEntity var66 = players[var65];
										if (var66 != null && (currentPlayerUid == var65 || StringTools.method14059(var66.nameUnfiltered) == child.field2298)) {
											var60 = child.method3944(toolkit, var61, basTypeList, idkTypeList, npcTypeList, objTypeList, seqTypeList, localPlayerGameState, localPlayerGameState, child.modelAnimator, var66.model);
											if (var60 == null && Component.field2338) {
												requestRedrawComponent(child);
											}
										}
									}
								} else if (child.modelkind == 5) {
									int var67 = child.model;
									PlayerEntity var68 = null;
									boolean var69 = false;
									if (var67 >= 0 && var67 < 2048) {
										var68 = players[var67];
										var69 = var68 != null && (currentPlayerUid == var67 || StringTools.method14059(var68.nameUnfiltered) == child.field2298);
									} else if (var67 == -1) {
										var69 = true;
										var68 = localPlayerEntity;
									} else {
										PlayerEntity var70 = (PlayerEntity) playerSnapshots.get(var67);
										if (var70 != null && var70.localPlayerIndex == var67) {
											var69 = true;
											var68 = var70;
										}
									}
									if (var69 && var68 != null && var68.model != null) {
										var60 = var68.model.getBodyModel(toolkit, var61, basTypeList, idkTypeList, npcTypeList, objTypeList, localPlayerGameState, localPlayerGameState, child.modelAnimator, null, null, null, 0, true, wearposDefaults);
									}
								} else if (child.modelkind == 8 || child.modelkind == 9) {
									ClientInvCache var71 = ClientInvCache.getCachedInvs(child.model, false);
									if (var71 != null) {
										var60 = var71.method17475(toolkit, var61, child.modelAnimator, child.field2298, child.modelkind == 9, child.field2246 ? localPlayerEntity.model : null);
									}
								} else if (child.modelAnimator != null && child.modelAnimator.hasSeqType()) {
									var60 = child.method3944(toolkit, var61, basTypeList, idkTypeList, npcTypeList, objTypeList, seqTypeList, localPlayerGameState, localPlayerGameState, child.modelAnimator, localPlayerEntity.model);
									if (var60 == null && Component.field2338) {
										requestRedrawComponent(child);
									}
								} else {
									var60 = child.method3944(toolkit, var61, basTypeList, idkTypeList, npcTypeList, objTypeList, seqTypeList, localPlayerGameState, localPlayerGameState, null, localPlayerEntity.model);
									if (var60 == null && Component.field2338) {
										requestRedrawComponent(child);
									}
								}
								if (var60 != null) {
									if (child.tint_weight != 0) {
										var60.method1745(child.tint_hue, child.tint_saturation, child.tint_luminence, child.tint_weight);
									}
									int var72;
									if (child.modelobjwidth > 0) {
										var72 = (child.width << 9) / child.modelobjwidth;
									} else {
										var72 = 512;
									}
									int var73;
									if (child.field2238 > 0) {
										var73 = (child.height << 9) / child.field2238;
									} else {
										var73 = 512;
									}
									int var74 = child.width / 2 + childX;
									int var75 = child.height / 2 + childY;
									if (!child.field2274) {
										var74 += child.modelorigin_x * var72 >> 9;
										var75 += child.modelorigin_y * var73 >> 9;
									}
									field10793.setToIdentity();
									toolkit.method2217(field10793);
									Matrix4x4 var76 = toolkit.method2208();
									int var77 = world.method7760();
									int var78 = world.method7734();
									int var79 = child.modelzoom + var78;
									if (child.modelorthog) {
										if (Client.cameraState == 3) {
											if (child.field2274) {
												var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, cam2.method4727(), cam2.method4785(), (float) GameShell.canvasWid, (float) GameShell.canvasHei, (float) child.modelzoom);
											} else {
												var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, cam2.method4727(), cam2.method4785(), (float) GameShell.canvasWid, (float) GameShell.canvasHei, (float) (child.modelzoom << 2));
											}
										} else if (child.field2274) {
											var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, (float) var77, (float) var79, (float) GameShell.canvasWid, (float) GameShell.canvasHei, (float) child.modelzoom);
										} else {
											var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, (float) var77, (float) var79, (float) GameShell.canvasWid, (float) GameShell.canvasHei, (float) (child.modelzoom << 2));
										}
									} else if (Client.cameraState == 3) {
										var76.method6703((float) var74, (float) var75, (float) var72, (float) var73, cam2.method4727(), cam2.method4785(), (float) GameShell.canvasWid, (float) GameShell.canvasHei);
									} else {
										var76.method6703((float) var74, (float) var75, (float) var72, (float) var73, (float) var77, (float) var79, (float) GameShell.canvasWid, (float) GameShell.canvasHei);
									}
									toolkit.method2220(var76);
									toolkit.method2475(2, 0);
									if (child.field2260) {
										toolkit.method2219(false);
									}
									if (child.field2274) {
										field10875.setToRotation(1.0F, 0.0F, 0.0F, Trig1.radians(child.modelangle_x));
										field10875.rotateAroundAxis(0.0F, 1.0F, 0.0F, Trig1.radians(child.modelangle_y));
										field10875.rotateAroundAxis(0.0F, 0.0F, 1.0F, Trig1.radians(child.modelangle_z));
										field10875.translate((float) child.modelorigin_x, (float) child.modelorigin_y, (float) child.modelorigin_z);
									} else {
										int var80 = (child.modelzoom << 2) * Trig1.sin[child.modelangle_x << 3] >> 14;
										int var81 = (child.modelzoom << 2) * Trig1.cos[child.modelangle_x << 3] >> 14;
										field10875.setToRotation(0.0F, 0.0F, 1.0F, Trig1.radians(-child.modelangle_z << 3));
										field10875.rotateAroundAxis(0.0F, 1.0F, 0.0F, Trig1.radians(child.modelangle_y << 3));
										field10875.translate((float) (child.modelxof << 2), (float) ((child.modelyof << 2) + var80 + var62), (float) ((child.modelyof << 2) + var81));
										field10875.rotateAroundAxis(1.0F, 0.0F, 0.0F, Trig1.radians(child.modelangle_x << 3));
									}
									child.method3951(toolkit, var60, field10875, loopCycle);
									toolkit.method2263();
									toolkit.method2170(true);
									toolkit.resetBounds(arg2, arg3, arg4, arg5);
									if (field10988) {
										toolkit.setBounds(childX, childY, child.width + childX, child.height + childY);
									}
									if (child.customlighting) {
										world.getEnvironmentManager().setLighting((float) child.field2248 / 256.0F, (float) child.field2251 / 256.0F, (float) child.field2255 / 256.0F, child.field2257, child.field2345, child.field2252, child.field2302, child.field2258);
									} else {
										world.getEnvironmentManager().setLightingInterface();
									}
									var60.draw(field10875, null, 1);
									if (!child.modelorthog && child.field2254 != null) {
										toolkit.drawParticles(child.field2254.method9939());
									}
									if (field10988) {
										toolkit.resetBounds(arg2, arg3, arg4, arg5);
									}
									toolkit.method2170(false);
									toolkit.resetClip();
									toolkit.resetBounds(arg2, arg3, arg4, arg5);
									if (child.customlighting) {
										world.getEnvironmentManager().setLightingInterface();
									}
									if (child.field2260) {
										toolkit.method2219(true);
									}
								}
							} else if (child.type == 9) {
								int var82;
								int var83;
								int var84;
								int var85;
								if (child.linedirection) {
									var82 = childX;
									var83 = child.height + childY;
									var84 = child.width + childX;
									var85 = childY;
								} else {
									var82 = childX;
									var83 = childY;
									var84 = child.width + childX;
									var85 = child.height + childY;
								}
								if (child.linewid == 1) {
									toolkit.drawLine(var82, var83, var84, var85, child.colour | 0xFF000000, 0);
								} else {
									toolkit.drawLine(var82, var83, var84, var85, child.colour | 0xFF000000, child.linewid, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aft.jj(IILhf;B)V")
	public static void drawDebug(int arg0, int arg1, Component arg2) {
		int var3 = arg2.width + arg0;
		int var4 = arg1 + 15;
		if (!field10794) {
			return;
		}
		int var5 = -256;
		if (fps < 20) {
			var5 = -65536;
		}
		DefaultSprites.p12FullFont.drawStringRight("Fps:" + fps + " (" + fpsAverage + " ms)", var3, var4, var5, -1);
		var4 += 15;
		Runtime var6 = Runtime.getRuntime();
		long var7 = var6.totalMemory() / 1024L;
		long var9 = var7 - var6.freeMemory() / 1024L;
		int var11 = -256;
		if (var9 > 262144L) {
			var11 = -65536;
		}
		DefaultSprites.p12FullFont.drawStringRight("Mem:" + var9 + "/" + var7 + "k", var3, var4, var11, -1);
		var4 += 15;
		long var12 = gameConnection.pingProvider.getPingedAddress();
		String var14 = "N/A";
		if (var12 != -1L) {
			var14 = var12 + "ms";
			if (var12 > 500L) {
				var14 = TextUtil.colTag(16711680) + var14 + TextUtil.colTag(16776960);
			}
		}
		DefaultSprites.p12FullFont.drawStringRight("Game: In:" + gameConnection.inBytesPerSecond + "B/s " + "Out:" + gameConnection.outBytesPerSecond + "B/s " + "Ping:" + var14, var3, var4, -256, -1);
		var4 += 15;
		long var15 = lobbyConnection.pingProvider.getPingedAddress();
		String var17 = "N/A";
		if (var15 != -1L) {
			var17 = var15 + "ms";
			if (var15 > 500L) {
				var17 = TextUtil.colTag(16711680) + var17 + TextUtil.colTag(16776960);
			}
		}
		DefaultSprites.p12FullFont.drawStringRight("Lobby: In:" + lobbyConnection.inBytesPerSecond + "B/s " + "Out:" + lobbyConnection.outBytesPerSecond + "B/s " + "Ping:" + var17, var3, var4, -256, -1);
		var4 += 15;
		int var18 = toolkit.method2520() / 1024;
		DefaultSprites.p12FullFont.drawStringRight("Offheap:" + var18 + "k", var3, var4, var18 > 65536 ? -65536 : -256, -1);
		var4 += 15;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		for (int var22 = 0; var22 < js5Providers.length; var22++) {
			if (js5Providers[var22] != null && js5Providers[var22].method16837()) {
				var19 += js5Providers[var22].method16826();
				var20 += js5Providers[var22].method16827();
				var21 += js5Providers[var22].method16828();
			}
		}
		long var23 = var19 == 0 ? 0L : (long) var21 * 100L / (long) var19;
		long var25 = var19 == 0 ? 0L : (long) var20 * 10000L / (long) var19;
		String var27 = "Cache:" + StringComparator.localised(var25, 2, true, Language.EN) + "% (" + var23 + "%)";
		DefaultSprites.p11FullFont.drawStringRight(var27, var3, var4, -256, -1);
		var4 += 12;
	}

	@ObfuscatedName("rd.jo(II)Ljava/lang/String;")
	public static final String formatObjCountTagged(int arg0) {
		String s = Integer.toString(arg0);
		for (int i = s.length() - 3; i > 0; i -= 3) {
			s = s.substring(0, i) + TextUtil.COMMA + s.substring(i);
		}
		if (s.length() > 9) {
			return " " + TextUtil.colTag(65408) + s.substring(0, s.length() - 8) + LocalisedText.MILLION.forLang(language) + " (" + s + ")" + TextUtil.ENDCOL;
		} else if (s.length() > 6) {
			return " " + TextUtil.colTag(16777215) + s.substring(0, s.length() - 4) + LocalisedText.THOUSAND.forLang(language) + " (" + s + ")" + TextUtil.ENDCOL;
		} else {
			return " " + TextUtil.colTag(16776960) + s + TextUtil.ENDCOL;
		}
	}

	@ObfuscatedName("na.jz(Lhq;Lhf;I)Lhf;")
	public static final Component method6000(Interface arg0, Component arg1) {
		if (arg1.layer != -1) {
			return arg0.getComponent(arg1.layer);
		}
		if (!arg0.field2150) {
			int var2 = arg1.parentlayer >>> 16;
			HashTableIterator var3 = new HashTableIterator(openedSubInterfaces);
			for (SubInterface var4 = (SubInterface) var3.nextNode(); var4 != null; var4 = (SubInterface) var3.next()) {
				if (var4.field11571 == var2) {
					return Component.get((int) var4.nodeId);
				}
			}
		}
		return null;
	}

	@ObfuscatedName("vn.jc(ZI)V")
	public static final void computeTopLevelInterfaceLayout(boolean arg0) {
		method8493(openedTopInterface, GameShell.canvasWid, GameShell.canvasHei, arg0);
	}

	@ObfuscatedName("dy.jg(Lhq;Lhf;B)V")
	public static void method2103(Interface arg0, Component arg1) {
		Component var2 = method6000(arg0, arg1);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GameShell.canvasWid;
			var4 = GameShell.canvasHei;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}
		method8197(arg1, var3, var4, false);
		method18883(arg1, var3, var4);
	}

	@ObfuscatedName("sf.jx(Lhq;Lhf;ZI)V")
	public static void method8329(Interface arg0, Component arg1, boolean arg2) {
		method16452(arg0.components, arg1, arg2);
	}

	@ObfuscatedName("agw.jh([Lhf;Lhf;ZI)V")
	public static void method16452(Component[] arg0, Component arg1, boolean arg2) {
		int var3 = arg1.scrollwidth == 0 ? arg1.width : arg1.scrollwidth;
		int var4 = arg1.scrollheight == 0 ? arg1.height : arg1.scrollheight;
		method1597(arg0, arg1.parentlayer, var3, var4, arg2);
		if (arg1.sortedsubcomponents != null) {
			method1597(arg1.sortedsubcomponents, arg1.parentlayer, var3, var4, arg2);
		}
		SubInterface var5 = (SubInterface) openedSubInterfaces.get((long) arg1.parentlayer);
		if (var5 != null) {
			method8493(var5.field11571, var3, var4, arg2);
		}
		if (field10986 != arg1) {
			return;
		}
		int var6 = ReceivePlayerPositions.highResolutionsCount;
		int[] var7 = ReceivePlayerPositions.highResolutionsIndices;
		for (int var8 = 0; var8 < var6; var8++) {
			PlayerEntity var9 = players[var7[var8]];
			if (var9 != null) {
				var9.method16519(var3, var4, arg2);
			}
		}
		for (int var10 = 0; var10 < npcSlotCount; var10++) {
			int var11 = field11036[var10];
			ObjectNode var12 = (ObjectNode) npcs.get((long) var11);
			if (var12 != null) {
				((PathingEntity) var12.value).method16519(var3, var4, arg2);
			}
		}
	}

	@ObfuscatedName("tb.jp(IIIZB)V")
	public static final void method8493(int arg0, int arg1, int arg2, boolean arg3) {
		if (Component.openInterface(arg0, null)) {
			method1597(Component.interfaces[arg0].components, -1, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("ck.jk([Lhf;IIIZI)V")
	public static void method1597(Component[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
		for (int var5 = 0; var5 < arg0.length; var5++) {
			Component var6 = arg0[var5];
			if (var6 != null && var6.layer == arg1) {
				method8197(var6, arg2, arg3, arg4);
				method18883(var6, arg2, arg3);
				if (var6.scrollx > var6.scrollwidth - var6.width) {
					var6.scrollx = var6.scrollwidth - var6.width;
				}
				if (var6.scrollx < 0) {
					var6.scrollx = 0;
				}
				if (var6.scrolly > var6.scrollheight - var6.height) {
					var6.scrolly = var6.scrollheight - var6.height;
				}
				if (var6.scrolly < 0) {
					var6.scrolly = 0;
				}
				if (var6.type == 0) {
					method16452(arg0, var6, arg4);
				}
			}
		}
	}

	@ObfuscatedName("sh.kw(Lhf;IIZB)V")
	public static void method8197(Component arg0, int arg1, int arg2, boolean arg3) {
		int var4 = arg0.width;
		int var5 = arg0.height;
		if (arg0.field2356 == 0) {
			arg0.width = arg0.wsize;
		} else if (arg0.field2356 == 1) {
			arg0.width = arg1 - arg0.wsize;
		} else if (arg0.field2356 == 2) {
			arg0.width = arg0.wsize * arg1 >> 14;
		}
		if (arg0.field2174 == 0) {
			arg0.height = arg0.hsize;
		} else if (arg0.field2174 == 1) {
			arg0.height = arg2 - arg0.hsize;
		} else if (arg0.field2174 == 2) {
			arg0.height = arg0.hsize * arg2 >> 14;
		}
		if (arg0.field2356 == 4) {
			arg0.width = arg0.aspectwidth * arg0.height / arg0.aspectheight;
		}
		if (arg0.field2174 == 4) {
			arg0.height = arg0.aspectheight * arg0.width / arg0.aspectwidth;
		}
		if (field10881 && (method17197(arg0).field11385 != 0 || arg0.type == 0)) {
			if (arg0.height < 5 && arg0.width < 5) {
				arg0.height = 5;
				arg0.width = 5;
			} else {
				if (arg0.height <= 0) {
					arg0.height = 5;
				}
				if (arg0.width <= 0) {
					arg0.width = 5;
				}
			}
		}
		if (Component.field2341 == arg0.clientcode) {
			field10986 = arg0;
		}
		if (arg3 && arg0.onresize != null && (arg0.width != var4 || arg0.height != var5)) {
			HookRequest var6 = new HookRequest();
			var6.component = arg0;
			var6.onop = arg0.onresize;
			hookRequests.addTail(var6);
		}
	}

	@ObfuscatedName("aod.kz(Lhf;III)V")
	public static void method18883(Component arg0, int arg1, int arg2) {
		if (arg0.xmode == 0) {
			arg0.x = arg0.xpos;
		} else if (arg0.xmode == 1) {
			arg0.x = (arg1 - arg0.width) / 2 + arg0.xpos;
		} else if (arg0.xmode == 2) {
			arg0.x = arg1 - arg0.width - arg0.xpos;
		} else if (arg0.xmode == 3) {
			arg0.x = arg0.xpos * arg1 >> 14;
		} else if (arg0.xmode == 4) {
			arg0.x = (arg0.xpos * arg1 >> 14) + (arg1 - arg0.width) / 2;
		} else {
			arg0.x = arg1 - arg0.width - (arg0.xpos * arg1 >> 14);
		}
		if (arg0.ymode == 0) {
			arg0.y = arg0.ypos;
		} else if (arg0.ymode == 1) {
			arg0.y = (arg2 - arg0.height) / 2 + arg0.ypos;
		} else if (arg0.ymode == 2) {
			arg0.y = arg2 - arg0.height - arg0.ypos;
		} else if (arg0.ymode == 3) {
			arg0.y = arg0.ypos * arg2 >> 14;
		} else if (arg0.ymode == 4) {
			arg0.y = (arg0.ypos * arg2 >> 14) + (arg2 - arg0.height) / 2;
		} else {
			arg0.y = arg2 - arg0.height - (arg0.ypos * arg2 >> 14);
		}
		if (!field10881 || method17197(arg0).field11385 == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.x < 0) {
			arg0.x = 0;
		} else if (arg0.width + arg0.x > arg1) {
			arg0.x = arg1 - arg0.width;
		}
		if (arg0.y < 0) {
			arg0.y = 0;
		} else if (arg0.height + arg0.y > arg2) {
			arg0.y = arg2 - arg0.height;
		}
	}

	@ObfuscatedName("ja.ke(I)V")
	public static final void updateTopLevelInterface() {
		if (openedTopInterface == -1) {
			return;
		}
		int var0 = mouse.getX();
		int var1 = mouse.getY();
		MouseEvent var2 = (MouseEvent) mouseEvents.head();
		if (var2 != null) {
			var0 = var2.getMouseClickX();
			var1 = var2.getMouseClickY();
		}
		if (field10989 != null && field1734 == field10828) {
			field10878 = true;
			field10995 = 0;
			field10889 = 0;
			field10799 = GameShell.canvasWid;
			field10998 = GameShell.canvasHei;
		}
		method8198(null, openedTopInterface, 0, 0, GameShell.canvasWid, GameShell.canvasHei, 0, 0, var0, var1);
		if (ClientWorldMap.component != null) {
			ClientWorldMap.method929(var0, var1);
		}
	}

	@ObfuscatedName("sh.kq(Lalu;IIIIIIIIII)V")
	public static final void method8198(SubInterface arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (!Component.openInterface(arg1, null)) {
			return;
		}
		if (arg0 == null || arg0.method18183()) {
			Interface var10 = Component.interfaces[arg1];
			updateInterfaceAnimation(var10, var10.method3923(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			ifCloseSub(arg0, true, false);
		}
	}

	@ObfuscatedName("client.kg(Lhq;[Lhf;IIIIIIIII)V")
	public static final void updateInterfaceAnimation(Interface arg0, Component[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < arg1.length; var11++) {
			Component var12 = arg1[var11];
			if (var12 != null && var12.layer == arg2) {
				int var13 = var12.x + arg7;
				int var14 = var12.y + arg8;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var12.type == 2) {
					var15 = arg3;
					var16 = arg4;
					var17 = arg5;
					var18 = arg6;
				} else {
					int var19 = var12.width + var13;
					int var20 = var12.height + var14;
					if (var12.type == 9) {
						var19++;
						var20++;
					}
					var15 = var13 > arg3 ? var13 : arg3;
					var16 = var14 > arg4 ? var14 : arg4;
					var17 = var19 < arg5 ? var19 : arg5;
					var18 = var20 < arg6 ? var20 : arg6;
				}
				if (var12.type == 0 || var12.hashook || method17197(var12).field11385 != 0 || field10828 == var12 || Component.field2171 == var12.clientcode || Component.field2167 == var12.clientcode || Component.field2341 == var12.clientcode || Component.field2161 == var12.clientcode) {
					if (!ifIsVisible(var12)) {
						if (field10989 == var12 && method4411(field10989)) {
							field10999 = true;
							field11000 = var13;
							field10852 = var14;
						}
						if (var12.field2324 || var15 < var17 && var16 < var18) {
							if (var12.noclickthrough && arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
								for (HookRequest var21 = (HookRequest) hookRequests.head(); var21 != null; var21 = (HookRequest) hookRequests.next()) {
									if (var21.isMouseHook) {
										var21.unlink();
										var21.component.field2350 = false;
									}
								}
								if (field6656 == 0) {
									field10989 = null;
									field10828 = null;
								}
								field11003 = 0;
								ClientWorldMap.field11663 = false;
								minimapClicked = false;
								if (!MiniMenu.open) {
									MiniMenu.method3074();
								}
							}
							boolean var22 = var12.clickmask && var12.type == 5 && var12.trans == 0 && var12.field2339 < 0 && var12.invobject == -1 && !var12.tiling && var12.angle2d == 0;
							boolean var23 = false;
							if (arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
								if (var22) {
									Graphic var24 = var12.method3970(toolkit);
									if (var24 != null && var12.width == var24.field2144 && var12.height == var24.field2146) {
										int var25 = arg9 - var13;
										int var26 = arg10 - var14;
										if (var26 >= 0 && var26 < var24.field2143.length) {
											int var27 = var24.field2143[var26];
											if (var25 >= var27 && var25 <= var24.field2145[var26] + var27) {
												var23 = true;
											}
										}
									} else {
										var23 = true;
									}
								} else {
									var23 = true;
								}
							}
							if (!targetModeActive && var23) {
								if (var12.mouseovercursor >= 0) {
									defaultCursor = var12.mouseovercursor;
								} else if (var12.noclickthrough) {
									defaultCursor = -1;
								}
							}
							if (!MiniMenu.open && var23 && !arg0.field2150) {
								MiniMenu.method7624(var12, arg9 - var13, arg10 - var14);
							}
							boolean var28 = false;
							if (mouse.method9101() && var23) {
								var28 = true;
							}
							boolean var29 = false;
							MouseEvent var30 = (MouseEvent) mouseEvents.head();
							if (var30 != null && var30.getButtonAction() == 0 && var30.getMouseClickX() >= var15 && var30.getMouseClickY() >= var16 && var30.getMouseClickX() < var17 && var30.getMouseClickY() < var18) {
								if (var22) {
									Graphic var31 = var12.method3970(toolkit);
									if (var31 != null && var12.width == var31.field2144 && var12.height == var31.field2146) {
										int var32 = var30.getMouseClickX() - var13;
										int var33 = var30.getMouseClickY() - var14;
										if (var33 >= 0 && var33 < var31.field2143.length) {
											int var34 = var31.field2143[var33];
											if (var32 >= var34 && var32 <= var31.field2145[var33] + var34) {
												var29 = true;
											}
										}
									} else {
										var29 = true;
									}
								} else {
									var29 = true;
								}
							}
							if (var12.field2324 && !DeveloperConsole.isopen()) {
								for (int var35 = 0; var35 < var12.field2270.length; var35++) {
									boolean var36 = false;
									boolean var37 = false;
									if (var12.field2300[var35] > 0) {
										for (int var38 = 0; var38 < allKeyboardEventCount; var38++) {
											if (var12.field2300[var35] == allKeyboardEvents[var38].method9131()) {
												var36 = true;
												if (var12.field2361 == null || var12.field2361[var35] <= loopCycle) {
													var37 = true;
												}
												break;
											}
										}
									}
									if (!var36 && var12.field2270[var35] != null) {
										for (int var39 = 0; var39 < var12.field2270[var35].length; var39++) {
											if (keyboard.keyheld(var12.field2270[var35][var39])) {
												var36 = true;
												if (var12.field2361 != null && var12.field2361[var35] > loopCycle) {
													break;
												}
												byte var40 = var12.field2281[var35][var39];
												if (var40 == 0 || ((var40 & 0x8) == 0 || !keyboard.keyheld(86) && !keyboard.keyheld(82) && !keyboard.keyheld(81)) && ((var40 & 0x2) == 0 || keyboard.keyheld(86)) && ((var40 & 0x1) == 0 || keyboard.keyheld(82)) && ((var40 & 0x4) == 0 || keyboard.keyheld(81))) {
													var37 = true;
													break;
												}
											}
										}
									}
									if (var37) {
										if (var35 < 10) {
											method4527(var35 + 1, var12.parentlayer, var12.id, "");
										} else if (var35 == 10) {
											method9403();
											ServerKeyProperties var41 = method17197(var12);
											setTargetActiveComponent(var12, var41.method17691(), var41.field11381);
											field11039 = method9557(var12);
											if (field11039 == null) {
												field11039 = "Null";
											}
											field10977 = var12.opbase + TextUtil.colTag(16777215);
										}
										int var42 = var12.field2211[var35];
										if (var12.field2361 == null) {
											var12.field2361 = new int[var12.field2270.length];
										}
										if (var12.field2273 == null) {
											var12.field2273 = new int[var12.field2270.length];
										}
										if (var42 == 0) {
											var12.field2361[var35] = Integer.MAX_VALUE;
										} else if (var12.field2361[var35] == 0) {
											var12.field2361[var35] = loopCycle + var42 + var12.field2273[var35];
										} else {
											var12.field2361[var35] = loopCycle + var42;
										}
									}
									if (!var36 && var12.field2361 != null) {
										var12.field2361[var35] = 0;
									}
								}
							}
							if (var29) {
								ifDragPickup(var12, var30.getMouseClickX() - var13, var30.getMouseClickY() - var14);
							}
							if (field10989 != null && field10989 != var12 && var23) {
								if (var12.noclickthrough) {
									field10993 = null;
								}
								if (method17197(var12).method17693()) {
									field10993 = var12;
								}
							}
							if (field10828 == var12) {
								field10878 = true;
								field10995 = var13;
								field10889 = var14;
								field10799 = field10828.width;
								field10998 = field10828.height;
							}
							if (var12.hashook || var12.clientcode != 0) {
								if (var23 && field10817 != 0 && var12.onscrollwheel != null) {
									HookRequest var43 = new HookRequest();
									var43.isMouseHook = true;
									var43.component = var12;
									var43.mouseY = field10817;
									var43.onop = var12.onscrollwheel;
									hookRequests.addTail(var43);
								}
								if (field10989 != null) {
									var29 = false;
									var28 = false;
								} else if (MiniMenu.open || Component.WORLD_MAP != var12.clientcode && field11003 > 0) {
									var29 = false;
									var28 = false;
									var23 = false;
								}
								if (var12.clientcode != 0) {
									if (Component.field2341 == var12.clientcode || Component.field2161 == var12.clientcode) {
										field10986 = var12;
										Environment var67 = world.getEnvironmentManager().getCurrentEnv();
										if (var67.getSkybox() != null && !asyncRebuild.method7676()) {
											var67.getSkybox().method7944(toolkit, var12.height, preferences.skyboxes.getValue());
										}
										if (Component.field2341 == var12.clientcode) {
											if (MiniMenu.open || arg9 < var15 || arg10 < var16 || arg9 >= var17 || arg10 >= var18) {
												MiniMenu.drawMenu(toolkit);
											} else {
												MiniMenu.method5015(toolkit, arg9, arg10);
												for (CoverMarkerClickbox var68 = (CoverMarkerClickbox) field10882.peekFront(); var68 != null; var68 = (CoverMarkerClickbox) field10882.prev()) {
													if (arg9 >= var68.field11199 && arg9 < var68.field11200 && arg10 >= var68.field11195 && arg10 < var68.field11201) {
														MiniMenu.method3074();
														MiniMenu.method2897(var68.field11197);
													}
												}
											}
										}
										int var69 = ReceivePlayerPositions.highResolutionsCount;
										int[] var70 = ReceivePlayerPositions.highResolutionsIndices;
										for (int var71 = 0; var71 < var69; var71++) {
											PlayerEntity var72 = players[var70[var71]];
											if (var72 != null) {
												ScriptRunner.executeTriggeredScriptPathingEntity(ClientTriggerType.PROCESS_PLAYER, -1, -1, var72, var70[var71]);
												var72.method16571(var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, arg9, arg10);
											}
										}
										for (int var73 = 0; var73 < npcSlotCount; var73++) {
											int var74 = field11036[var73];
											ObjectNode var75 = (ObjectNode) npcs.get((long) var74);
											if (var75 != null) {
												ScriptRunner.executeTriggeredScriptPathingEntity(ClientTriggerType.PROCESS_NPC, ((NpcEntity) var75.value).npcType.id, -1, (PathingEntity) var75.value, var74);
												((PathingEntity) var75.value).method16571(var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, arg9, arg10);
											}
										}
										continue;
									}
									if (Component.field2171 == var12.clientcode) {
										int var44 = 0;
										int var45 = arg5 - arg3;
										int var46 = arg9 - var13;
										int var47 = arg10 - var14;
										if (var12.type == 5) {
											Graphic var48 = var12.method3970(toolkit);
											if (var48 == null) {
												continue;
											}
											if (arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
												var44 = var48.field2143[var47];
												var45 = var48.field2145[var47];
											}
										}
										if (MiniMap.toggle != 0 && MiniMap.toggle != 3 || MiniMenu.open || arg9 < var15 || arg10 < var16 || arg9 >= var17 || arg10 >= var18 || var46 < var44 || var46 > var44 + var45) {
											continue;
										}
										int var49 = var46 - var12.width / 2;
										int var50 = var47 - var12.height / 2;
										int var51;
										if (Client.cameraState == 4) {
											var51 = (int) orbitCameraYaw & 0x3FFF;
										} else if (Client.cameraState == 3) {
											var51 = (int) ((double) cam2.method4719() * 2607.5945876176133D);
										} else {
											var51 = minimapAnticheatAngle + (int) orbitCameraYaw & 0x3FFF;
										}
										int var52 = Trig1.sin[var51];
										int var53 = Trig1.cos[var51];
										if (Client.cameraState != 4) {
											var52 = (minimapZoom + 256) * var52 >> 8;
											var53 = (minimapZoom + 256) * var53 >> 8;
										}
										int var54 = var49 * var53 + var50 * var52 >> 14;
										int var55 = var50 * var53 - var49 * var52 >> 14;
										int var56;
										int var57;
										if (Client.cameraState == 4) {
											var56 = (field10892 >> 9) + (var54 >> 2);
											var57 = (field10893 >> 9) - (var55 >> 2);
										} else {
											int var58 = (localPlayerEntity.size() - 1) * 256;
											Vector3 var59 = localPlayerEntity.getTransform().trans;
											var56 = ((int) var59.x - var58 >> 9) + (var54 >> 2);
											var57 = ((int) var59.z - var58 >> 9) - (var55 >> 2);
										}
										if (targetModeActive && (field1765 & 0x40) != 0) {
											Component var60 = Component.method16682(activeComponentParentLayer, activeComponentId);
											if (var60 == null) {
												method9403();
											} else {
												MiniMenu.method3042(field11039, " " + TextUtil.ARROW, field1844, 59, var12.invobject, 1L, var56, var57, true, false, (long) (var12.id << 32 | var12.parentlayer), true);
											}
											continue;
										}
										if (modegame == ModeGame.STELLARDAWN) {
											MiniMenu.method3042(LocalisedText.FACEHERE.forLang(language), "", -1, 60, -1, 1L, var56, var57, true, false, 0L, true);
										}
										MiniMenu.method3042(field4868, "", field10963, 23, -1, 1L, var56, var57, true, false, 0L, true);
										continue;
									}
									if (Component.WORLD_MAP == var12.clientcode) {
										ClientWorldMap.component = var12;
										if (var23) {
											ClientWorldMap.field11663 = true;
										}
										if (var29) {
											int var61 = (int) ((double) (var30.getMouseClickX() - var13 - var12.width / 2) * 2.0D / (double) WorldMap.field6803);
											int var62 = (int) -((double) (var30.getMouseClickY() - var14 - var12.height / 2) * 2.0D / (double) WorldMap.field6803);
											int var63 = ClientWorldMap.field11443 + var61 + WorldMap.field6786;
											int var64 = ClientWorldMap.field11654 + var62 + WorldMap.field6808;
											WorldMapAreaMetadata var65 = ClientWorldMap.method17877();
											if (var65 == null) {
												continue;
											}
											int[] var66 = new int[3];
											var65.method19482(var63, var64, var66);
											if (var66 != null) {
												if (keyboard.keyheld(82) && staffModLevel > 0) {
													jtele(var66[0], var66[1], var66[2]);
													continue;
												}
												minimapClicked = true;
												field6866 = var66[0];
												field530 = var66[1];
												field5107 = var66[2];
											}
											field11003 = 1;
											field10860 = false;
											field10991 = mouse.getX();
											field10992 = mouse.getY();
											continue;
										}
										if (var28 && field11003 > 0) {
											if (field11003 == 1 && (field10991 != mouse.getX() || field10992 != mouse.getY())) {
												field2413 = ClientWorldMap.field11443;
												field8287 = ClientWorldMap.field11654;
												field11003 = 2;
											}
											if (field11003 == 2) {
												field10860 = true;
												ClientWorldMap.method8432(field2413 + (int) ((double) (field10991 - mouse.getX()) * 2.0D / (double) WorldMap.field6804));
												ClientWorldMap.method9548(field8287 - (int) ((double) (field10992 - mouse.getY()) * 2.0D / (double) WorldMap.field6804));
											}
											continue;
										}
										if (field11003 > 0 && !field10860) {
											if ((field10968 == 1 || MiniMenu.method6848()) && MiniMenu.field546 > 2) {
												MiniMenu.method10201(field10991, field10992);
											} else if (MiniMenu.method15249()) {
												MiniMenu.method10201(field10991, field10992);
											}
										}
										field11003 = 0;
										continue;
									}
									if (Component.WORLD_MAP_OVERVIEW == var12.clientcode) {
										if (var28) {
											ClientWorldMap.method9843(mouse.getX() - var13, mouse.getY() - var14, var12.width, var12.height);
										}
										continue;
									}
									if (Component.field2167 == var12.clientcode) {
										MiniMenu.updateMouseOverText(var12, var13, var14);
										continue;
									}
								}
								if (!var12.held && var29) {
									var12.held = true;
									if (var12.onclick != null) {
										HookRequest var76 = new HookRequest();
										var76.isMouseHook = true;
										var76.component = var12;
										var76.mouseX = var30.getMouseClickX() - var13;
										var76.mouseY = var30.getMouseClickY() - var14;
										var76.onop = var12.onclick;
										hookRequests.addTail(var76);
									}
								}
								if (var12.held && var28 && var12.onclickrepeat != null) {
									HookRequest var77 = new HookRequest();
									var77.isMouseHook = true;
									var77.component = var12;
									var77.mouseX = mouse.getX() - var13;
									var77.mouseY = mouse.getY() - var14;
									var77.onop = var12.onclickrepeat;
									hookRequests.addTail(var77);
								}
								if (var12.held && !var28) {
									var12.held = false;
									if (var12.onrelease != null) {
										HookRequest var78 = new HookRequest();
										var78.isMouseHook = true;
										var78.component = var12;
										var78.mouseX = mouse.getX() - var13;
										var78.mouseY = mouse.getY() - var14;
										var78.onop = var12.onrelease;
										hookRequestsMouseStop.addTail(var78);
									}
								}
								if (var28 && var12.onhold != null) {
									HookRequest var79 = new HookRequest();
									var79.isMouseHook = true;
									var79.component = var12;
									var79.mouseX = mouse.getX() - var13;
									var79.mouseY = mouse.getY() - var14;
									var79.onop = var12.onhold;
									hookRequests.addTail(var79);
								}
								if (!var12.field2350 && var23) {
									var12.field2350 = true;
									if (var12.onmouseover != null) {
										HookRequest var80 = new HookRequest();
										var80.isMouseHook = true;
										var80.component = var12;
										var80.mouseX = mouse.getX() - var13;
										var80.mouseY = mouse.getY() - var14;
										var80.onop = var12.onmouseover;
										hookRequests.addTail(var80);
									}
								}
								if (var12.field2350 && var23 && var12.onmouserepeat != null) {
									HookRequest var81 = new HookRequest();
									var81.isMouseHook = true;
									var81.component = var12;
									var81.mouseX = mouse.getX() - var13;
									var81.mouseY = mouse.getY() - var14;
									var81.onop = var12.onmouserepeat;
									hookRequests.addTail(var81);
								}
								if (var12.field2350 && !var23) {
									var12.field2350 = false;
									if (var12.onmouseleave != null) {
										HookRequest var82 = new HookRequest();
										var82.isMouseHook = true;
										var82.component = var12;
										var82.mouseX = mouse.getX() - var13;
										var82.mouseY = mouse.getY() - var14;
										var82.onop = var12.onmouseleave;
										hookRequestsMouseStop.addTail(var82);
									}
								}
								if (var12.ontimer != null) {
									HookRequest var83 = new HookRequest();
									var83.component = var12;
									var83.onop = var12.ontimer;
									hookRequestsTimer.addTail(var83);
								}
								if (var12.onvarctransmit != null && varcTransmitNum > var12.field2289) {
									if (var12.onvarctransmitlist == null || varcTransmitNum - var12.field2289 > 64) {
										HookRequest var88 = new HookRequest();
										var88.component = var12;
										var88.onop = var12.onvarctransmit;
										hookRequests.addTail(var88);
									} else {
										label867: for (int var84 = var12.field2289; var84 < varcTransmitNum; var84++) {
											int var85 = varcTransmitted[var84 & 0x3F];
											for (int var86 = 0; var86 < var12.onvarctransmitlist.length; var86++) {
												if (var12.onvarctransmitlist[var86] == var85) {
													HookRequest var87 = new HookRequest();
													var87.component = var12;
													var87.onop = var12.onvarctransmit;
													hookRequests.addTail(var87);
													break label867;
												}
											}
										}
									}
									var12.field2289 = varcTransmitNum;
								}
								if (var12.onvarcstrtransmit != null && varcstrTransmitNum > var12.field2357) {
									if (var12.onvarcstrtransmitlist == null || varcstrTransmitNum - var12.field2357 > 64) {
										HookRequest var93 = new HookRequest();
										var93.component = var12;
										var93.onop = var12.onvarcstrtransmit;
										hookRequests.addTail(var93);
									} else {
										label843: for (int var89 = var12.field2357; var89 < varcstrTransmitNum; var89++) {
											int var90 = varcstrTransmitted[var89 & 0x3F];
											for (int var91 = 0; var91 < var12.onvarcstrtransmitlist.length; var91++) {
												if (var12.onvarcstrtransmitlist[var91] == var90) {
													HookRequest var92 = new HookRequest();
													var92.component = var12;
													var92.onop = var12.onvarcstrtransmit;
													hookRequests.addTail(var92);
													break label843;
												}
											}
										}
									}
									var12.field2357 = varcstrTransmitNum;
								}
								if (var12.onvartransmit != null && varpTransmitNum > var12.field2353) {
									if (var12.onvartransmitlist == null || varpTransmitNum - var12.field2353 > 64) {
										HookRequest var98 = new HookRequest();
										var98.component = var12;
										var98.onop = var12.onvartransmit;
										hookRequests.addTail(var98);
									} else {
										label819: for (int var94 = var12.field2353; var94 < varpTransmitNum; var94++) {
											int var95 = varpTransmitted[var94 & 0x3F];
											for (int var96 = 0; var96 < var12.onvartransmitlist.length; var96++) {
												if (var12.onvartransmitlist[var96] == var95) {
													HookRequest var97 = new HookRequest();
													var97.component = var12;
													var97.onop = var12.onvartransmit;
													hookRequests.addTail(var97);
													break label819;
												}
											}
										}
									}
									var12.field2353 = varpTransmitNum;
								}
								if (var12.oninvtransmit != null && field11012 > var12.field2354) {
									if (var12.oninvtransmitlist == null || field11012 - var12.field2354 > 64) {
										HookRequest var103 = new HookRequest();
										var103.component = var12;
										var103.onop = var12.oninvtransmit;
										hookRequests.addTail(var103);
									} else {
										label795: for (int var99 = var12.field2354; var99 < field11012; var99++) {
											int var100 = field10783[var99 & 0x3F];
											for (int var101 = 0; var101 < var12.oninvtransmitlist.length; var101++) {
												if (var12.oninvtransmitlist[var101] == var100) {
													HookRequest var102 = new HookRequest();
													var102.component = var12;
													var102.onop = var12.oninvtransmit;
													hookRequests.addTail(var102);
													break label795;
												}
											}
										}
									}
									var12.field2354 = field11012;
								}
								if (var12.onstattransmit != null && field11014 > var12.field2160) {
									if (var12.onstattransmitlist == null || field11014 - var12.field2160 > 64) {
										HookRequest var108 = new HookRequest();
										var108.component = var12;
										var108.onop = var12.onstattransmit;
										hookRequests.addTail(var108);
									} else {
										label771: for (int var104 = var12.field2160; var104 < field11014; var104++) {
											int var105 = field11015[var104 & 0x3F];
											for (int var106 = 0; var106 < var12.onstattransmitlist.length; var106++) {
												if (var12.onstattransmitlist[var106] == var105) {
													HookRequest var107 = new HookRequest();
													var107.component = var12;
													var107.onop = var12.onstattransmit;
													hookRequests.addTail(var107);
													break label771;
												}
											}
										}
									}
									var12.field2160 = field11014;
								}
								if (var12.onvarclantransmit != null && field11020 > var12.field2358) {
									if (var12.field2313 == null || field11020 - var12.field2358 > 64) {
										HookRequest var113 = new HookRequest();
										var113.component = var12;
										var113.onop = var12.onvarclantransmit;
										hookRequests.addTail(var113);
									} else {
										label747: for (int var109 = var12.field2358; var109 < field11020; var109++) {
											int var110 = field10841[var109 & 0x3F];
											for (int var111 = 0; var111 < var12.field2313.length; var111++) {
												if (var12.field2313[var111] == var110) {
													HookRequest var112 = new HookRequest();
													var112.component = var12;
													var112.onop = var12.onvarclantransmit;
													hookRequests.addTail(var112);
													break label747;
												}
											}
										}
									}
									var12.field2358 = field11020;
								}
								if (lastOnChatTransmitRedrawCycle > var12.lastRedrawCycle && var12.onchattransmit != null) {
									HookRequest var114 = new HookRequest();
									var114.component = var12;
									var114.onop = var12.onchattransmit;
									hookRequests.addTail(var114);
								}
								if (lastOnFriendTransmitRedrawCycle > var12.lastRedrawCycle && var12.onfriendtransmit != null) {
									HookRequest var115 = new HookRequest();
									var115.component = var12;
									var115.onop = var12.onfriendtransmit;
									hookRequests.addTail(var115);
								}
								if (lastOnClanTransmitRedrawCycle > var12.lastRedrawCycle && var12.onclantransmit != null) {
									HookRequest var116 = new HookRequest();
									var116.component = var12;
									var116.onop = var12.onclantransmit;
									hookRequests.addTail(var116);
								}
								if (lastOnClanSettingsTransmitRedrawCycle > var12.lastRedrawCycle && var12.onclansettingstransmit != null) {
									HookRequest var117 = new HookRequest();
									var117.component = var12;
									var117.onop = var12.onclansettingstransmit;
									hookRequests.addTail(var117);
								}
								if (lastOnClanChannelTransmitRedrawCycle > var12.lastRedrawCycle && var12.onclanchanneltransmit != null) {
									HookRequest var118 = new HookRequest();
									var118.component = var12;
									var118.onop = var12.onclanchanneltransmit;
									hookRequests.addTail(var118);
								}
								if (lastOnStockTransmitRedrawCycle > var12.lastRedrawCycle && var12.onstocktransmit != null) {
									HookRequest var119 = new HookRequest();
									var119.component = var12;
									var119.onop = var12.onstocktransmit;
									hookRequests.addTail(var119);
								}
								if (lastOnMiscTransmitRedrawCycle > var12.lastRedrawCycle && var12.onmisctransmit != null) {
									HookRequest var120 = new HookRequest();
									var120.component = var12;
									var120.onop = var12.onmisctransmit;
									hookRequests.addTail(var120);
								}
								if (lastOnPlayerGroupTransmitRedrawCycle > var12.lastRedrawCycle && var12.onplayergrouptransmit != null) {
									HookRequest var121 = new HookRequest();
									var121.component = var12;
									var121.onop = var12.onplayergrouptransmit;
									hookRequests.addTail(var121);
								}
								if (lastOnPlayerGroupVarpTransmitRedrawCycle > var12.lastRedrawCycle && var12.onplayergroupvarptransmit != null) {
									HookRequest var122 = new HookRequest();
									var122.component = var12;
									var122.onop = var12.onplayergroupvarptransmit;
									hookRequests.addTail(var122);
								}
								if (lastOnCameraUpdateTransmitRedrawCycle > var12.lastRedrawCycle && var12.oncameraupdatetransmit != null) {
									HookRequest var123 = new HookRequest();
									var123.component = var12;
									var123.onop = var12.oncameraupdatetransmit;
									hookRequests.addTail(var123);
								}
								var12.lastRedrawCycle = redrawCycle;
								if (var12.onkey != null) {
									for (int var124 = 0; var124 < allKeyboardEventCount; var124++) {
										HookRequest var125 = new HookRequest();
										var125.component = var12;
										var125.key = allKeyboardEvents[var124].method9141();
										var125.keychar = allKeyboardEvents[var124].method9131();
										var125.onop = var12.onkey;
										hookRequests.addTail(var125);
									}
								}
								if (field10813 && var12.oncamfinished != null) {
									HookRequest var126 = new HookRequest();
									var126.component = var12;
									var126.onop = var12.oncamfinished;
									hookRequests.addTail(var126);
								}
							}
							if (var12.type == 5 && var12.field2339 != -1) {
								var12.method4012(skyBoxTypeList, skyDecorTypeList).method7944(toolkit, var12.height, preferences.skyboxes.getValue());
							}
							method7332(var12);
							if (var12.type == 0) {
								updateInterfaceAnimation(arg0, arg1, var12.parentlayer, var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, arg9, arg10);
								if (var12.sortedsubcomponents != null) {
									updateInterfaceAnimation(arg0, var12.sortedsubcomponents, var12.parentlayer, var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, arg9, arg10);
								}
								SubInterface var127 = (SubInterface) openedSubInterfaces.get((long) var12.parentlayer);
								if (var127 != null) {
									method8198(var127, var127.field11571, var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, arg9, arg10);
								}
							}
						}
					}
				} else if (var15 < var17 && var16 < var18) {
					method7332(var12);
				}
			}
		}
	}

	@ObfuscatedName("qs.ku(Lhf;I)V")
	public static void method7332(Component arg0) {
		if (arg0.type == 5 && arg0.invobject != -1) {
			ObjIconFactory.method539(toolkit, arg0);
		}
	}

	@ObfuscatedName("bl.ko(III)V")
	public static final void method1023(int arg0, int arg1) {
		if (Component.openInterface(arg0, null)) {
			method8199(Component.interfaces[arg0].components, arg1);
		}
	}

	@ObfuscatedName("sh.kf([Lhf;IB)V")
	public static final void method8199(Component[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			Component var3 = arg0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.sortedsubcomponents != null) {
						method8199(var3.sortedsubcomponents, arg1);
					}
					SubInterface var4 = (SubInterface) openedSubInterfaces.get((long) var3.parentlayer);
					if (var4 != null) {
						method1023(var4.field11571, arg1);
					}
				}
				if (arg1 == 0 && var3.ondialogabort != null) {
					HookRequest var5 = new HookRequest();
					var5.component = var3;
					var5.onop = var3.ondialogabort;
					ScriptRunner.runHook(var5);
				}
				if (arg1 == 1 && var3.onsubchange != null) {
					if (var3.id >= 0) {
						Component var6 = Component.get(var3.parentlayer);
						if (var6 == null || var6.subcomponents == null || var3.id >= var6.subcomponents.length || var6.subcomponents[var3.id] != var3) {
							continue;
						}
					}
					HookRequest var7 = new HookRequest();
					var7.component = var3;
					var7.onop = var3.onsubchange;
					ScriptRunner.runHook(var7);
				}
			}
		}
	}

	@ObfuscatedName("ahe.kx(Lhf;III)V")
	public static final void ifDragPickup(Component arg0, int arg1, int arg2) {
		if (field10989 != null || MiniMenu.open || (arg0 == null || !method4411(arg0))) {
			return;
		}
		field10989 = arg0;
		field10828 = method14755(arg0);
		field10991 = arg1;
		field10992 = arg2;
		field6656 = 0;
		field10886 = false;
	}

	@ObfuscatedName("ajt.ki(I)V")
	public static final void method17515() {
		field10886 = true;
	}

	@ObfuscatedName("ps.ks(I)V")
	public static final void method6847() {
		requestRedrawComponent(field10989);
		field6656++;
		if (field10999 && field10878) {
			int var0 = mouse.getX();
			int var1 = mouse.getY();
			int var2 = var0 - field10991;
			int var3 = var1 - field10992;
			if (var2 < field10995) {
				var2 = field10995;
			}
			if (field10989.width + var2 > field10995 + field10799) {
				var2 = field10995 + field10799 - field10989.width;
			}
			if (var3 < field10889) {
				var3 = field10889;
			}
			if (field10989.height + var3 > field10998 + field10889) {
				var3 = field10998 + field10889 - field10989.height;
			}
			int var4;
			int var5;
			if (field1734 == field10828) {
				var4 = var2;
				var5 = var3;
			} else {
				var4 = field10828.scrollx + (var2 - field10995);
				var5 = field10828.scrolly + (var3 - field10889);
			}
			if (mouse.method9090()) {
				if (field6656 > field10989.dragdeadtime) {
					int var10 = var2 - field11000;
					int var11 = var3 - field10852;
					if (var10 > field10989.dragdeadzone || var10 < -field10989.dragdeadzone || var11 > field10989.dragdeadzone || var11 < -field10989.dragdeadzone) {
						field10886 = true;
					}
				}
				if (field10989.ondrag != null && field10886) {
					HookRequest var12 = new HookRequest();
					var12.component = field10989;
					var12.mouseX = var4;
					var12.mouseY = var5;
					var12.onop = field10989.ondrag;
					ScriptRunner.runHook(var12);
				}
			} else {
				if (field10886) {
					method9403();
					if (field10989.ondragcomplete != null) {
						HookRequest var6 = new HookRequest();
						var6.component = field10989;
						var6.mouseX = var4;
						var6.mouseY = var5;
						Component var7 = method17238(field10989);
						Component var8 = field10993;
						boolean var9 = false;
						while (var8 != null && var8.layer != -1 && var7 != null) {
							if (var7.parentlayer == var8.parentlayer) {
								var9 = true;
								break;
							}
							var8 = Component.interfaces[var8.parentlayer >> 16].components[var8.layer & 0xFFFF];
						}
						if (var8 == null || var7 == null || field1734 == var7 || var9) {
							var6.drop = field10993;
						} else {
							var6.drop = field1734;
						}
						var6.onop = field10989.ondragcomplete;
						ScriptRunner.runHook(var6);
					}
					if (field10993 != null && method17238(field10989) != null) {
						method16600(field10989, field10993);
					}
				} else if ((field10968 == 1 || MiniMenu.method6848()) && MiniMenu.field546 > 2) {
					MiniMenu.method10201(field11000 + field10991, field10992 + field10852);
				} else if (MiniMenu.method15249()) {
					MiniMenu.method10201(field11000 + field10991, field10992 + field10852);
				}
				field10989 = null;
				field10828 = null;
			}
		} else if (field6656 > 1) {
			field10989 = null;
			field10828 = null;
		}
	}

	@ObfuscatedName("iz.kh(Lhf;I)V")
	public static void requestRedrawComponent(Component arg0) {
		if (field11037 == arg0.field2237) {
			topLevelComponentRedrawRequestedTemp[arg0.field2182] = true;
		}
	}

	@ObfuscatedName("we.ka(S)V")
	public static void method9734() {
		for (int var0 = 0; var0 < 114; var0++) {
			topLevelComponentRedrawRequestedTemp[var0] = true;
		}
	}

	@ObfuscatedName("abn.kl(Lhf;I)Lhf;")
	public static Component method14755(Component arg0) {
		Component var1 = method17238(arg0);
		if (var1 == null) {
			var1 = arg0.draggable;
		}
		return var1;
	}

	@ObfuscatedName("iu.kb(Lhf;I)Z")
	public static boolean method4411(Component arg0) {
		ServerKeyProperties var1 = method17197(arg0);
		if (var1.method17710() > 0) {
			return true;
		} else if (var1.method17701()) {
			return true;
		} else {
			return arg0.draggable != null;
		}
	}

	@ObfuscatedName("anr.kr([Ljava/lang/String;I)[Ljava/lang/String;")
	public static final String[] method18725(String[] arg0) {
		String[] var1 = new String[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = var2 + " ";
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = var1[var2] + arg0[var2];
			}
		}
		return var1;
	}

	@ObfuscatedName("aku.kd(I[IB)V")
	public static final void method17758(int arg0, int[] arg1) {
		if (!Component.openInterface(arg0, arg1)) {
			return;
		}
		Component[] var2 = Component.interfaces[arg0].components;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Component var4 = var2[var3];
			if (var4 != null && var4.modelAnimator != null) {
				var4.modelAnimator.method14364();
			}
		}
	}

	@ObfuscatedName("aaq.kc(II)V")
	public static final void method14428(int arg0) {
		if (Component.openInterface(arg0, null)) {
			method6107(Component.interfaces[arg0].components, -1);
		}
	}

	@ObfuscatedName("nc.kj([Lhf;II)V")
	public static final void method6107(Component[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			Component var3 = arg0[var2];
			if (var3 != null && var3.layer == arg1 && !ifIsVisible(var3)) {
				if (var3.type == 0) {
					method6107(arg0, var3.parentlayer);
					if (var3.sortedsubcomponents != null) {
						method6107(var3.sortedsubcomponents, var3.parentlayer);
					}
					SubInterface var4 = (SubInterface) openedSubInterfaces.get((long) var3.parentlayer);
					if (var4 != null) {
						method14428(var4.field11571);
					}
				}
				if (var3.type == 6 && var3.modelanim != -1) {
					if (var3.modelAnimator == null) {
						var3.modelAnimator = new InterfaceAnimationNode();
						var3.modelAnimator.method14362(var3.modelanim);
					}
					if (var3.modelAnimator.method14367(sceneDelta) && var3.modelAnimator.method14375()) {
						var3.modelAnimator.method14364();
					}
				}
			}
		}
	}

	@ObfuscatedName("ank.kn(II)V")
	public static final void onVarPlayerChanged(int arg0) {
		PositionedSound.method15185();
		int var1 = ((VarPlayerType) varPlayerTypeList.list(arg0)).clientCode;
		if (var1 == 0) {
			return;
		}
		int var2 = localPlayerGameState.getVarValueInt((VarType) varPlayerTypeList.list(arg0));
		if (var1 == 5) {
			field10968 = var2;
		}
		if (var1 == 6) {
			chatEffects = var2;
		}
	}

	@ObfuscatedName("ve.kp(Lhf;I)V")
	public static final void method9454(Component arg0) {
		if (Component.field2159 != arg0.clientcode) {
			return;
		}
		if (localPlayerEntity.nameUnfiltered == null) {
			arg0.model = 0;
			arg0.field2298 = 0;
			return;
		}
		arg0.modelangle_x = 150;
		arg0.modelangle_y = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
		arg0.modelkind = 5;
		arg0.model = currentPlayerUid;
		arg0.field2298 = StringTools.method14059(localPlayerEntity.nameUnfiltered);
		EntityWalkAnimationNode var1 = localPlayerEntity.field10432;
		if (var1 == null) {
			arg0.modelAnimator = null;
			return;
		}
		if (arg0.modelAnimator == null) {
			arg0.modelAnimator = new InterfaceAnimationNode();
		}
		arg0.modelanim = var1.getSeqTypeId();
		arg0.modelAnimator.method14370(var1);
	}

	@ObfuscatedName("sp.km(ZI)V")
	public static final void ifClose(boolean arg0) {
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.CLOSE_MODAL, gameConnection.randomOut);
		gameConnection.queue(var1);
		for (SubInterface var2 = (SubInterface) openedSubInterfaces.head(); var2 != null; var2 = (SubInterface) openedSubInterfaces.next()) {
			if (!var2.isLinked()) {
				var2 = (SubInterface) openedSubInterfaces.head();
				if (var2 == null) {
					break;
				}
			}
			if (var2.field11570 == 0) {
				ifCloseSub(var2, true, arg0);
			}
		}
		if (pressedContinueOption != null) {
			requestRedrawComponent(pressedContinueOption);
			pressedContinueOption = null;
		}
	}

	@ObfuscatedName("is.ky(ILalu;[IZB)Lalu;")
	public static final SubInterface ifOpenSub(int arg0, SubInterface arg1, int[] arg2, boolean arg3) {
		SubInterface var4 = (SubInterface) openedSubInterfaces.get((long) arg0);
		if (var4 != null) {
			ifCloseSub(var4, arg1.field11571 != var4.field11571, arg3);
		}
		openedSubInterfaces.put(arg1, (long) arg0);
		method17758(arg1.field11571, arg2);
		Component var5 = Component.get(arg0);
		if (var5 != null) {
			requestRedrawComponent(var5);
		}
		if (pressedContinueOption != null) {
			requestRedrawComponent(pressedContinueOption);
			pressedContinueOption = null;
		}
		if (var5 != null) {
			method8329(Component.interfaces[var5.parentlayer >>> 16], var5, !arg3);
		}
		if (!arg3) {
			ScriptRunner.executeOnLoad(arg1.field11571, arg2);
		}
		if (!arg3 && openedTopInterface != -1) {
			method1023(openedTopInterface, 1);
		}
		return arg1;
	}

	@ObfuscatedName("k.kk(Lalu;ZZI)V")
	public static final void ifCloseSub(SubInterface arg0, boolean arg1, boolean arg2) {
		int var3 = arg0.field11571;
		int var4 = (int) arg0.nodeId;
		arg0.unlink();
		if (arg1) {
			Component.method7602(var3);
		}
		method5080(var3);
		Component var5 = Component.get(var4);
		if (var5 != null) {
			requestRedrawComponent(var5);
		}
		MiniMenu.method15023(var3);
		if (!arg2 && openedTopInterface != -1) {
			method1023(openedTopInterface, 1);
		}
		HashTableIterator var6 = new HashTableIterator(openedSubInterfaces);
		for (SubInterface var7 = (SubInterface) var6.nextNode(); var7 != null; var7 = (SubInterface) var6.next()) {
			if (!var7.isLinked()) {
				var7 = (SubInterface) var6.nextNode();
				if (var7 == null) {
					break;
				}
			}
			if (var7.field11570 == 3) {
				int var8 = (int) var7.nodeId;
				if (var8 >>> 16 == var3) {
					ifCloseSub(var7, true, arg2);
				}
			}
		}
	}

	@ObfuscatedName("tk.kv(Lhf;III)V")
	public static void drawCompass(Component arg0, int arg1, int arg2) {
		Graphic var3 = arg0.method3970(toolkit);
		if (var3 == null) {
			return;
		}
		toolkit.resetBounds(arg1, arg2, arg0.width + arg1, arg0.height + arg2);
		if (MiniMap.toggle >= 3) {
			toolkit.method2206(-16777216, var3.field2147, arg1, arg2);
			return;
		}
		int var4;
		if (cameraState == 3) {
			var4 = (int) -((double) cam2.method4719() * 2607.5945876176133D);
		} else {
			var4 = (int) -orbitCameraYaw;
		}
		int var5 = minimapAnticheatAngle * 2 + var4 & 0x3FFF;
		int var6 = var5 << 2;
		DefaultSprites.compassSprites.method1455((float) arg0.width / 2.0F + (float) arg1, (float) arg0.height / 2.0F + (float) arg2, 4226, var6, var3.field2147, arg1, arg2);
	}

	@ObfuscatedName("qa.kt(Ljava/lang/String;I)I")
	public static final int friendGetSlotFromName(String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < friendsCount; var1++) {
			if (arg0.equalsIgnoreCase(friends[var1].field606)) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("gm.li(Ljava/lang/String;I)I")
	public static final int ignoreGetSlotFromName(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (int var1 = 0; var1 < ignoresCount; var1++) {
			if (arg0.equalsIgnoreCase(ignores[var1].nameUnfiltered)) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("fd.lv(Ljava/lang/String;I)Z")
	public static boolean friendTest(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < friendsCount; var1++) {
			if (arg0.equalsIgnoreCase(friends[var1].field606)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(localPlayerEntity.nameUnfiltered)) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("pb.la(Ljava/lang/String;B)Z")
	public static boolean ignoreTest(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < ignoresCount; var1++) {
			Ignore var2 = ignores[var1];
			if (arg0.equalsIgnoreCase(var2.nameUnfiltered)) {
				return true;
			}
			if (arg0.equalsIgnoreCase(var2.field596)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("xf.lp(Ljava/lang/String;II)V")
	public static final void friendSetRank(String arg0, int arg1) {
		ServerConnection var2 = getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.FRIEND_SETRANK, var2.randomOut);
		var3.buf.p1(Packet.pjstrlen(arg0) + 1);
		var3.buf.pjstr(arg0);
		var3.buf.p1_alt2(arg1);
		var2.queue(var3);
	}

	@ObfuscatedName("xt.lc(Ljava/lang/String;Ljava/lang/String;I)V")
	public static final void friendSetNotes(String arg0, String arg1) {
		ServerConnection var2 = getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.FRIEND_SETNOTES, var2.randomOut);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		var3.buf.p1(Packet.pjstrlen(arg0) + Packet.pjstrlen(arg1));
		var3.buf.pjstr(arg0);
		var3.buf.pjstr(arg1);
		var2.queue(var3);
	}

	@ObfuscatedName("abh.lf(Ljava/lang/String;Ljava/lang/String;I)V")
	public static final void ignoreSetNotes(String arg0, String arg1) {
		ServerConnection var2 = getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.IGNORE_SETNOTES, var2.randomOut);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		var3.buf.p1(Packet.pjstrlen(arg0) + Packet.pjstrlen(arg1));
		var3.buf.pjstr(arg1);
		var3.buf.pjstr(arg0);
		var2.queue(var3);
	}

	@ObfuscatedName("ahr.lm(Ljava/lang/String;I)V")
	public static final void clanKickUser(String arg0) {
		if (clanChatUsers == null) {
			return;
		}
		ServerConnection var1 = getCurrentConnection();
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.CLAN_KICKUSER, var1.randomOut);
		var2.buf.p1(Packet.pjstrlen(arg0));
		var2.buf.pjstr(arg0);
		var1.queue(var2);
	}

	@ObfuscatedName("cj.ll(Ljava/lang/String;I)V")
	public static final void clanJoinChat(String arg0) {
		if (arg0.equals("")) {
			return;
		}
		ServerConnection var1 = getCurrentConnection();
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var1.randomOut);
		var2.buf.p1(Packet.pjstrlen(arg0));
		var2.buf.pjstr(arg0);
		var1.queue(var2);
	}

	@ObfuscatedName("sf.lb(B)V")
	public static final void clanLeaveChat() {
		ServerConnection var0 = getCurrentConnection();
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var0.randomOut);
		var1.buf.p1(0);
		var0.queue(var1);
	}

	@ObfuscatedName("ang.le(ZIB)V")
	public static final void clanChannelKickUser(boolean arg0, int arg1) {
		ClanChannel var2 = arg0 ? affinedClanChannel : listenedClanChannel;
		if (var2 == null || arg1 < 0 || arg1 >= var2.userCount) {
			return;
		}
		ClanChannelUser var3 = var2.channelUsers[arg1];
		if (var3.rank != -1) {
			return;
		}
		String var4 = var3.name;
		ServerConnection var5 = getCurrentConnection();
		ClientMessage var6 = ClientMessage.createMessage(ClientProt.CLANCHANNEL_KICKUSER, var5.randomOut);
		var6.buf.p1(Packet.pjstrlen(var4) + 3);
		var6.buf.p1(arg0 ? 1 : 0);
		var6.buf.p2(arg1);
		var6.buf.pjstr(var4);
		var5.queue(var6);
	}

	@ObfuscatedName("xl.lr(II)V")
	public static final void affinedClanSettingsAddBannedFromChannel(int arg0) {
		if (affinedClanChannel == null || (arg0 < 0 || arg0 >= affinedClanChannel.userCount)) {
			return;
		}
		ClanChannelUser var1 = affinedClanChannel.channelUsers[arg0];
		if (var1.rank != -1) {
			return;
		}
		ServerConnection var2 = getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL, var2.randomOut);
		var3.buf.p1(Packet.pjstrlen(var1.name) + 2);
		var3.buf.p2(arg0);
		var3.buf.pjstr(var1.name);
		var2.queue(var3);
	}

	@ObfuscatedName("pp.lq(IZB)V")
	public static final void affinedClanSettingsSetMutedFromChannel(int arg0, boolean arg1) {
		if (affinedClanChannel == null || (arg0 < 0 || arg0 >= affinedClanChannel.userCount)) {
			return;
		}
		ClanChannelUser var2 = affinedClanChannel.channelUsers[arg0];
		ServerConnection var3 = getCurrentConnection();
		ClientMessage var4 = ClientMessage.createMessage(ClientProt.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL, var3.randomOut);
		var4.buf.p1(Packet.pjstrlen(var2.name) + 3);
		var4.buf.p2(arg0);
		var4.buf.p1(arg1 ? 1 : 0);
		var4.buf.pjstr(var2.name);
		var3.queue(var4);
	}

	@ObfuscatedName("pn.lo(Ljava/lang/String;I)V")
	public static final void friendAdd(String arg0) {
		int var1 = playerIsMembers ? 400 : 200;
		if (arg0 == null) {
			return;
		}
		if (friendsCount >= var1) {
			ChatHistory.method1006(4, playerIsMembers ? LocalisedText.FRIENDLIST_FULL_MEMBERS.forLang(language) : LocalisedText.FRIENDLIST_FULL.forLang(language));
			return;
		}
		String var2 = NamespaceUtil.normalize(arg0, namespace);
		if (var2 == null) {
			return;
		}
		for (int var3 = 0; var3 < friendsCount; var3++) {
			Friend var4 = friends[var3];
			String var5 = NamespaceUtil.normalize(var4.field606, namespace);
			if (var5 != null && var5.equals(var2)) {
				ChatHistory.method1006(4, arg0 + LocalisedText.FRIENDLISTDUPE.forLang(language));
				return;
			}
			if (var4.field607 != null) {
				String var6 = NamespaceUtil.normalize(var4.field607, namespace);
				if (var6 != null && var6.equals(var2)) {
					ChatHistory.method1006(4, arg0 + LocalisedText.FRIENDLISTDUPE.forLang(language));
					return;
				}
			}
		}
		for (int var7 = 0; var7 < ignoresCount; var7++) {
			Ignore var8 = ignores[var7];
			String var9 = NamespaceUtil.normalize(var8.nameUnfiltered, namespace);
			if (var9 != null && var9.equals(var2)) {
				ChatHistory.method1006(4, LocalisedText.REMOVEIGNORE1.forLang(language) + arg0 + LocalisedText.REMOVEIGNORE2.forLang(language));
				return;
			}
			if (var8.field596 != null) {
				String var10 = NamespaceUtil.normalize(var8.field596, namespace);
				if (var10 != null && var10.equals(var2)) {
					ChatHistory.method1006(4, LocalisedText.REMOVEIGNORE1.forLang(language) + arg0 + LocalisedText.REMOVEIGNORE2.forLang(language));
					return;
				}
			}
		}
		if (NamespaceUtil.normalize(localPlayerEntity.nameUnfiltered, namespace).equals(var2)) {
			ChatHistory.method1006(4, LocalisedText.FRIENDCANTADDSELF.forLang(language));
			return;
		}
		ServerConnection var11 = getCurrentConnection();
		ClientMessage var12 = ClientMessage.createMessage(ClientProt.FRIENDLIST_ADD, var11.randomOut);
		var12.buf.p1(Packet.pjstrlen(arg0));
		var12.buf.pjstr(arg0);
		var11.queue(var12);
	}

	@ObfuscatedName("az.lh(Ljava/lang/String;ZB)V")
	public static final void ignoreAdd(String arg0, boolean temporary) {
		int var2 = playerIsMembers ? 400 : 100;
		if (arg0 == null) {
			return;
		}
		if (ignoresCount >= var2) {
			ChatHistory.method1006(4, playerIsMembers ? LocalisedText.IGNORELISTFULL_MEMBERS.forLang(language) : LocalisedText.IGNORELISTFULL.forLang(language));
			return;
		}
		String var3 = NamespaceUtil.normalize(arg0, namespace);
		if (var3 == null) {
			return;
		}
		for (int var4 = 0; var4 < ignoresCount; var4++) {
			Ignore var5 = ignores[var4];
			String var6 = NamespaceUtil.normalize(var5.nameUnfiltered, namespace);
			if (var6 != null && var6.equals(var3)) {
				ChatHistory.method1006(4, arg0 + LocalisedText.IGNORELISTDUPE.forLang(language));
				return;
			}
			if (var5.field596 != null) {
				String var7 = NamespaceUtil.normalize(var5.field596, namespace);
				if (var7 != null && var7.equals(var3)) {
					ChatHistory.method1006(4, arg0 + LocalisedText.IGNORELISTDUPE.forLang(language));
					return;
				}
			}
		}
		for (int var8 = 0; var8 < friendsCount; var8++) {
			Friend var9 = friends[var8];
			String var10 = NamespaceUtil.normalize(var9.field606, namespace);
			if (var10 != null && var10.equals(var3)) {
				ChatHistory.method1006(4, LocalisedText.REMOVEFRIEND1.forLang(language) + arg0 + LocalisedText.REMOVEFRIEND2.forLang(language));
				return;
			}
			if (var9.field607 != null) {
				String var11 = NamespaceUtil.normalize(var9.field607, namespace);
				if (var11 != null && var11.equals(var3)) {
					ChatHistory.method1006(4, LocalisedText.REMOVEFRIEND1.forLang(language) + arg0 + LocalisedText.REMOVEFRIEND2.forLang(language));
					return;
				}
			}
		}
		if (NamespaceUtil.normalize(localPlayerEntity.nameUnfiltered, namespace).equals(var3)) {
			ChatHistory.method1006(4, LocalisedText.IGNORECANTADDSELF.forLang(language));
			return;
		}
		ServerConnection var12 = getCurrentConnection();
		ClientMessage var13 = ClientMessage.createMessage(ClientProt.IGNORELIST_ADD, var12.randomOut);
		var13.buf.p1(Packet.pjstrlen(arg0) + 1);
		var13.buf.pjstr(arg0);
		var13.buf.p1(temporary ? 1 : 0);
		var12.queue(var13);
	}

	@ObfuscatedName("vv.ls(Ljava/lang/String;B)V")
	public static final void friendDelete(String arg0) {
		if (arg0 == null) {
			return;
		}
		String var1 = NamespaceUtil.normalize(arg0, namespace);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < friendsCount; var2++) {
			Friend var3 = friends[var2];
			String var4 = var3.field606;
			String var5 = NamespaceUtil.normalize(var4, namespace);
			if (FriendRelated.method18886(arg0, var1, var4, var5)) {
				friendsCount--;
				for (int var6 = var2; var6 < friendsCount; var6++) {
					friends[var6] = friends[var6 + 1];
				}
				lastOnFriendTransmitRedrawCycle = redrawCycle;
				ServerConnection var7 = getCurrentConnection();
				ClientMessage var8 = ClientMessage.createMessage(ClientProt.FRIENDLIST_DEL, var7.randomOut);
				var8.buf.p1(Packet.pjstrlen(arg0));
				var8.buf.pjstr(arg0);
				var7.queue(var8);
				break;
			}
		}
	}

	@ObfuscatedName("cs.lu(Ljava/lang/String;B)V")
	public static final void ignoreDelete(String arg0) {
		if (arg0 == null) {
			return;
		}
		String var1 = NamespaceUtil.normalize(arg0, namespace);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < ignoresCount; var2++) {
			Ignore var3 = ignores[var2];
			String var4 = var3.nameUnfiltered;
			String var5 = NamespaceUtil.normalize(var4, namespace);
			if (FriendRelated.method18886(arg0, var1, var4, var5)) {
				ignoresCount--;
				for (int var6 = var2; var6 < ignoresCount; var6++) {
					ignores[var6] = ignores[var6 + 1];
				}
				lastOnFriendTransmitRedrawCycle = redrawCycle;
				ServerConnection var7 = getCurrentConnection();
				ClientMessage var8 = ClientMessage.createMessage(ClientProt.IGNORELIST_DEL, var7.randomOut);
				var8.buf.p1(Packet.pjstrlen(arg0));
				var8.buf.pjstr(arg0);
				var7.queue(var8);
				break;
			}
		}
	}

	@ObfuscatedName("jh.ly(II)V")
	public static void method5080(int arg0) {
		for (Node var1 = field10873.head(); var1 != null; var1 = field10873.next()) {
			if ((var1.nodeId >> 48 & 0xFFFFL) == (long) arg0) {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("client.lg(Lhf;)Laki;")
	public static ServerKeyProperties method17197(Component arg0) {
		ServerKeyProperties var1 = (ServerKeyProperties) field10873.get(((long) arg0.parentlayer << 32) + (long) arg0.id);
		return var1 == null ? arg0.field2268 : var1;
	}

	@ObfuscatedName("client.lx(Lhf;)Lhf;")
	public static Component method17238(Component arg0) {
		ServerKeyProperties var1 = method17197(arg0);
		if (var1.method17701()) {
			return field1734;
		}
		int var2 = var1.method17710();
		if (var2 == 0) {
			return null;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			arg0 = method6000(Component.method5367(arg0.parentlayer), arg0);
			if (arg0 == null) {
				return field1734;
			}
		}
		return arg0;
	}

	@ObfuscatedName("client.lj(Lhf;)Z")
	public static boolean ifIsVisible(Component arg0) {
		if (field10881) {
			if (method17197(arg0).field11385 != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		if (Component.DEBUG == arg0.clientcode) {
			return arg0.hide || !field10794 && !field10848;
		} else {
			return arg0.hide;
		}
	}

	@ObfuscatedName("akv.lw(Lhf;IS)I")
	public static int method17826(Component arg0, int arg1) {
		if (!method17197(arg0).method17690(arg1) && arg0.onop == null) {
			return -1;
		} else if (arg0.opcursor == null || arg0.opcursor.length <= arg1) {
			return -1;
		} else {
			return arg0.opcursor[arg1];
		}
	}

	@ObfuscatedName("vz.lz(Lhf;I)Ljava/lang/String;")
	public static String method9557(Component arg0) {
		if (method17197(arg0).method17691() == 0) {
			return null;
		} else if (arg0.targetverb == null || arg0.targetverb.trim().length() == 0) {
			return field10881 ? "Hidden-use" : null;
		} else {
			return arg0.targetverb;
		}
	}

	@ObfuscatedName("zg.ln(S)Z")
	public static boolean incrementVerifyId() {
		currentIncrementVerifyId++;
		incrementVerifyIdChanged = true;
		return true;
	}

	@ObfuscatedName("adb.lt(I)V")
	public static void notifyIncrementIdVerification() {
		ServerConnection connection = getCurrentConnection();
		ClientMessage message = ClientMessage.createMessage(ClientProt.TRANSMITVAR_VERIFYID, connection.randomOut);
		message.buf.p4(currentIncrementVerifyId);
		connection.queue(message);
	}

	@ObfuscatedName("im.ld(Ljava/lang/String;ZS)I")
	public static int findObjs(String arg0, boolean arg1) {
		String var2 = arg0.toLowerCase();
		objFindResults = null;
		objFindResultsIndex = 0;
		java.util.LinkedList var3 = new java.util.LinkedList();
		java.util.LinkedList var4 = new java.util.LinkedList();
		for (int var5 = 0; var5 < objTypeList.num; var5++) {
			ObjType var6 = (ObjType) objTypeList.list(var5);
			if ((!arg1 || var6.stockmarket) && var6.certtemplate == -1 && var6.lenttemplate == -1 && var6.boughttemplate == -1 && var6.dummyitem == 0 && var6.name.toLowerCase().indexOf(var2) != -1) {
				if (var3.size() >= 250) {
					return -1;
				}
				var3.add(var5);
				var4.add(var6.name);
			}
		}
		objFindResults = new int[var3.size()];
		int var7 = 0;
		Iterator var8 = var3.iterator();
		while (var8.hasNext()) {
			Integer var9 = (Integer) var8.next();
			objFindResults[var7++] = var9;
		}
		String[] var10 = (String[]) var4.toArray(new String[objFindResults.length]);
		Algorithms.method4054(var10, objFindResults);
		return var3.size();
	}

	@ObfuscatedName("hv.lk(Ljava/lang/String;ZB)I")
	public static int findChatPhrases(String arg0, boolean arg1) {
		String var2 = arg0.toLowerCase();
		chatPhraseFindResults = null;
		chatPhraseFindResultsIndex = 0;
		java.util.LinkedList var3 = new java.util.LinkedList();
		java.util.LinkedList var4 = new java.util.LinkedList();
		int var5 = arg1 ? 32768 : 0;
		int var6 = var5 + (arg1 ? quickChatPhraseTypeList.configClientLargeNum : quickChatPhraseTypeList.configClientSmallNum);
		for (int var7 = var5; var7 < var6; var7++) {
			QuickChatPhraseType var8 = quickChatPhraseTypeList.list(var7);
			if (var8.field12382 && var8.getText().toLowerCase().indexOf(var2) != -1) {
				if (var3.size() >= 50) {
					return -1;
				}
				var3.add(var7);
				var4.add(var8.getText());
			}
		}
		chatPhraseFindResults = new int[var3.size()];
		int var9 = 0;
		Iterator var10 = var3.iterator();
		while (var10.hasNext()) {
			Integer var11 = (Integer) var10.next();
			chatPhraseFindResults[var9++] = var11;
		}
		String[] var12 = (String[]) var4.toArray(new String[chatPhraseFindResults.length]);
		Algorithms.method4054(var12, chatPhraseFindResults);
		return var3.size();
	}

	@ObfuscatedName("n.mf(II)Ladh;")
	public static DBTableIndex method146(int arg0) {
		DBTableIndex var1 = (DBTableIndex) field10834.get((long) arg0);
		if (var1 == null) {
			var1 = new DBTableIndex(dbtableIndexJs5, DBUtils.method746(arg0), DBUtils.method15018(arg0));
			field10834.put(var1, (long) arg0);
		}
		return var1;
	}

	@ObfuscatedName("if.mh(IS)Ladh;")
	public static DBTableIndex method4574(int arg0) {
		DBTableIndex var1 = (DBTableIndex) field10857.get((long) arg0);
		if (var1 == null) {
			var1 = new DBTableIndex(dbtableIndexJs5, arg0);
		}
		return var1;
	}

	@ObfuscatedName("acb.mx(J)Ljava/lang/String;")
	public static String method14989(long arg0) {
		return TimeZones.method3647(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}

	@ObfuscatedName("ke.mg(Ljava/lang/String;B)V")
	public static void setSiteSettings(String arg0) {
		siteSettings = arg0;
		if (GameShell.getEnvironment() == GameShell3$Environment.APPLICATION) {
			return;
		}
		try {
			String var1 = GameShell.field11885.getParameter(JavConfigParameter.field4122.key);
			String var2 = GameShell.field11885.getParameter(JavConfigParameter.DOMAIN.key);
			String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
			String var4;
			if (arg0.length() == 0) {
				var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var3 + "; Expires=" + method14989(MonotonicTime.get() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			BrowserControl.eval(GameShell.field11885, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("fw.me(B)V")
	public static void method3094() {
		if (GameShell.getEnvironment() == GameShell3$Environment.APPLICATION) {
			return;
		}
		try {
			String var0 = GameShell.field11885.getParameter(JavConfigParameter.DOMAIN.key);
			int var1 = (int) (MonotonicTime.get() / 86400000L) - 11745;
			String var2 = "usrdob=" + var1 + "; version=1; path=/; domain=" + var0;
			BrowserControl.eval(GameShell.field11885, "document.cookie=\"" + var2 + "\"");
		} catch (Throwable var4) {
		}
	}

	@ObfuscatedName("qk.mn(I)Ljava/lang/String;")
	public static String method7363() {
		return method4591("www", false);
	}

	@ObfuscatedName("ih.mv(Ljava/lang/String;ZI)Ljava/lang/String;")
	public static String method4591(String arg0, boolean arg1) {
		String var2 = arg1 ? "https://" : "http://";
		if (modewhere == ModeWhere.WTRC) {
			arg0 = arg0 + "-wtrc";
		} else if (modewhere == ModeWhere.WTQA) {
			arg0 = arg0 + "-wtqa";
		} else if (modewhere == ModeWhere.WTWIP) {
			arg0 = arg0 + "-wtwip";
		} else if (modewhere == ModeWhere.WTI) {
			arg0 = arg0 + "-wti";
		} else if (modewhere == ModeWhere.field8276) {
			arg0 = arg0 + "-demo";
		} else if (modewhere == ModeWhere.LOCAL) {
			arg0 = "local";
		}
		String var3 = "";
		if (siteSettings != null) {
			var3 = "/p=" + siteSettings;
		}
		String var4 = modegame.titleURL + ".com";
		return var2 + arg0 + "." + var4 + "/l=" + language.serialID + "/a=" + playerIsAffiliate + var3 + "/";
	}

	@ObfuscatedName("ty.my(IIIIIILjava/lang/String;I)V")
	public static void method8476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
		TextCoord var7 = new TextCoord();
		var7.field11206 = arg0;
		var7.field11202 = arg1;
		var7.field11204 = arg2;
		var7.field11203 = loopCycle + arg4;
		var7.field11205 = arg3 * 4;
		var7.field11208 = arg6;
		var7.field11207 = arg5;
		textCoords.pushBack(var7);
	}

	@ObfuscatedName("aar.md(I)I")
	public static int getDefaultCameraState() {
		return graphicsDefaults.field7749 ? 3 : 2;
	}

	@ObfuscatedName("gw.mk(IIIIIIIIIIIIIIZIII)V")
	public static void method3621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
		if (arg1 != 0 && arg3 != -1) {
			PathingEntity var17 = null;
			if (arg1 < 0) {
				int var18 = -arg1 - 1;
				if (currentPlayerUid == var18) {
					var17 = localPlayerEntity;
				} else {
					var17 = players[var18];
				}
			} else {
				int var19 = arg1 - 1;
				ObjectNode var20 = (ObjectNode) npcs.get((long) var19);
				if (var20 != null) {
					var17 = (PathingEntity) var20.value;
				}
			}
			if (var17 != null) {
				BASType var21 = var17.getBASType();
				if (var21.field7357 != null && var21.field7357[arg3] != null) {
					arg4 -= var21.field7357[arg3][1];
				}
				if (var21.field7347 != null && var21.field7347[arg3] != null) {
					arg4 -= var21.field7347[arg3][1];
				}
			}
		}
		ProjectileAnimation var22 = new ProjectileAnimation(world.getScene(), arg0, arg16, arg16, arg6, arg7, arg4, loopCycle + arg10, loopCycle + arg11, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
		var22.updateVelocity(arg8, arg9, getHeightmapY(arg8, arg9, arg16) - arg5, loopCycle + arg10);
		projectiles.addTail(new ProjectileEntityNode(var22));
	}

	@ObfuscatedName("fw.mq(I)V")
	public static void method3095() {
		if (modewhere != ModeWhere.LOCAL) {
			JavascriptFunction.field4036.method6090();
		}
	}

	@ObfuscatedName("ib.ms(Lax;I)V")
	public static void notifyTelemetryError(ServerConnection arg0) {
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.TELEMETRY_ERROR, arg0.randomOut);
		arg0.queue(var1);
		telemetryError = true;
	}

	@ObfuscatedName("rm.mp(II)V")
	public static void method7623(int arg0) {
		int var1 = field11114.indexOf(arg0);
		if (var1 == -1) {
			field11114.add(arg0);
		}
	}

	@ObfuscatedName("client.mo(B)V")
	public void method16971() {
		field7015 = field11114.iterator();
		while (field7015.hasNext()) {
			int var1 = (Integer) field7015.next();
			if (spritesJs5.loadFile(var1)) {
				field7015.remove();
			}
		}
	}
}
