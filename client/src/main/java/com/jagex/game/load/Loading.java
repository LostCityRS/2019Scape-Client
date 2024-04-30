package com.jagex.game.load;

import com.jagex.audio.api.AudioApi;
import com.jagex.core.constants.PublicKeys;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.Timer;
import com.jagex.core.utils.TotpPreferences;
import com.jagex.game.MiniMenu;
import com.jagex.game.client.*;
import com.jagex.game.clientoptions.Preferences;
import com.jagex.game.compression.huffman.Huffman;
import com.jagex.game.compression.huffman.WordPack;
import com.jagex.game.config.*;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.cursortype.CursorTypeList;
import com.jagex.game.config.db.dbrowtype.DBRowType;
import com.jagex.game.config.db.dbtabletype.DBTableType;
import com.jagex.game.config.defaults.*;
import com.jagex.game.config.effectanimtype.EffectAnimTypeList;
import com.jagex.game.config.enumtype.EnumTypeList;
import com.jagex.game.config.flotype.FloorOverlayTypeList;
import com.jagex.game.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.config.headbartype.HeadbarTypeList;
import com.jagex.game.config.hitmarktype.HitmarkTypeList;
import com.jagex.game.config.idktype.IDKTypeList;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.invtype.InvTypeList;
import com.jagex.game.config.lighttype.LightTypeList;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.meltype.MapElementTypeList;
import com.jagex.game.config.msitype.MSITypeList;
import com.jagex.game.config.npctype.NPCTypeList;
import com.jagex.game.config.objtype.ObjTypeList;
import com.jagex.game.config.paramtype.ParamTypeList;
import com.jagex.game.config.questtype.QuestTypeList;
import com.jagex.game.config.quickchatcattype.QuickChatCatTypeList;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseTypeList;
import com.jagex.game.config.seqgrouptype.SeqGroupTypeList;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.skyboxtype.SkyBoxTypeList;
import com.jagex.game.config.skydecortype.SkyDecorTypeList;
import com.jagex.game.config.structtype.StructTypeList;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.VariableTypeProviderClient;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.config.vartype.general.VarBasicTypeListClient;
import com.jagex.game.config.vartype.player.VarPlayerTypeListClient;
import com.jagex.game.script.ClientVarDomain;
import com.jagex.game.world.WorldMap;
import com.jagex.game.world.entity.PlayerGameState;
import com.jagex.game.world.entity.PlayerModel;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.js5.Js5;
import com.jagex.js5.network.Js5Client;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.login.LoginManager;

@ObfuscatedName("ji")
public class Loading {
	@ObfuscatedName("ji.e")
	public static LoadingStage[] field2938;

	@ObfuscatedName("ji.n")
	public static LoadingScreen[] field2939;

	@ObfuscatedName("ji.m")
	public static int field2946 = -1;

	@ObfuscatedName("jl.k")
	public static LoadingRelated3 field2841;

	@ObfuscatedName("aao.f")
	public static Js5 loadingSpritesJs5;

	@ObfuscatedName("aae.w")
	public static Js5 loadingScreensJs5;

	@ObfuscatedName("x.l")
	public static LoadingScreenRenderer field593;

	@ObfuscatedName("ji.u")
	public static Thread field2940;

	@ObfuscatedName("xj.z")
	public static long field7966;

	@ObfuscatedName("rk.p")
	public static String field4964;

	@ObfuscatedName("ji.d")
	public static String field2942;

	@ObfuscatedName("mt.r")
	public static LoadingStage field3419;

	@ObfuscatedName("ji.o")
	public static boolean field2944 = false;

	@ObfuscatedName("aae.s")
	public static String field8535;

	@ObfuscatedName("pr.y")
	public static String field4407;

	@ObfuscatedName("ji.q")
	public static int field2945 = -1;

	@ObfuscatedName("ji.x")
	public static boolean field2941;

	public Loading() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jb.e(I)V")
	public static void reload() {
		field2944 = true;
		field8535 = LoginManager.username;
		field4407 = LoginManager.password;
		Client.logout(false);
		LoadableResourceManager.method3670();
		field2938 = null;
		Client.js5Client = null;
		Client.setState(5);
	}

	@ObfuscatedName("nt.n(B)Z")
	public static boolean method6040() {
		return field2944;
	}

	@ObfuscatedName("adf.m(I)V")
	public static void update() {
		if (field2938 == null) {
			field2938 = LoadingStage.method4920();
			field3419 = field2938[0];
			field7966 = MonotonicTime.get();
		}
		if (field593 == null) {
			method254();
		}
		LoadingStage var0 = field3419;
		int var1 = method7622();
		if (field3419 == var0) {
			field2942 = field3419.field2908.forLang(Client.language);
			field4964 = field2942;
			if (field3419.field2926) {
				NoiseGeneratorRelated.field9130 = (field3419.field2924 - field3419.field2923) * var1 / 100 + field3419.field2923;
			}
			if (field3419.field2925) {
				field4964 = field4964 + " - " + NoiseGeneratorRelated.field9130 + "%";
			}
		} else if (field3419 == LoadingStage.field2919) {
			field593 = null;
			Client.setState(4);
			if (field2944) {
				field2944 = false;
				LoginManager.requestLogin(field8535, field4407, "", false);
			}
		} else {
			field2942 = var0.field2922.forLang(Client.language);
			field4964 = field2942;
			if (field3419.field2925) {
				field4964 = field4964 + " - " + var0.field2924 + "%";
			}
			NoiseGeneratorRelated.field9130 = var0.field2924;
			if (field3419.field2926 || var0.field2926) {
				field7966 = MonotonicTime.get();
			}
		}
		if (field593 == null) {
			return;
		}
		field593.method4849(field7966, field2942, field4964, NoiseGeneratorRelated.field9130, field3419);
		if (field2939 == null) {
			return;
		}
		for (int var2 = field2946 + 1; var2 < field2939.length; var2++) {
			if (field2939[var2].method4912() >= 100 && field2946 == var2 - 1 && Client.state != 5 && field593.method4857()) {
				try {
					field2939[var2].method4916();
				} catch (Exception var4) {
					field2939 = null;
					break;
				}
				field593.method4879(field2939[var2]);
				field2946++;
				if (field2946 >= field2939.length - 1 && field2939.length > 1) {
					field2946 = field2841.method15223() ? 0 : -1;
				}
			}
		}
	}

	@ObfuscatedName("l.k(B)V")
	public static void method254() {
		if (field3419 != null) {
			field593 = new LoadingScreenRenderer();
			field593.method4849(field7966, field3419.field2908.forLang(Client.language), field3419.field2908.forLang(Client.language), field3419.field2923, field3419);
			field2940 = new Thread(field593, "");
			field2940.start();
		}
	}

	@ObfuscatedName("dk.f(ZI)V")
	public static void draw(boolean arg0) {
		if (field593 == null) {
			method254();
		}
		if (arg0) {
			field593.method4845();
		}
	}

	@ObfuscatedName("gt.w(I)I")
	public static int method3583() {
		return field593.method4846();
	}

	@ObfuscatedName("apb.l(I)V")
	public static void method18929() {
		if (field2939 == null) {
			return;
		}
		LoadingScreen[] var0 = field2939;
		for (int var1 = 0; var1 < var0.length; var1++) {
			LoadingScreen var2 = var0[var1];
			var2.method4916();
		}
	}

	@ObfuscatedName("gt.u(I)I")
	public static int method3584() {
		int var0 = field3419.field2920;
		if (var0 < field2938.length - 1) {
			field3419 = field2938[var0 + 1];
		}
		return 100;
	}

	@ObfuscatedName("rm.z(I)I")
	public static int method7622() {
		if (Client.preferences.safeMode.getValue() == 0) {
			for (int var0 = 0; var0 < Client.allKeyboardEventCount; var0++) {
				if (Client.allKeyboardEvents[var0].method9131() == 's' || Client.allKeyboardEvents[var0].method9131() == 'S') {
					Client.preferences.setPreference(Client.preferences.safeMode, 1);
					Client.field10812 = true;
					GraphicsPacketQueue.method6971(ToolkitType.field8880);
					break;
				}
			}
		}
		if (field3419 == LoadingStage.field2913) {
			if (Client.js5Client == null) {
				Client.js5Client = new Js5Client(Client.js5TcpClient, Client.js5HttpClient, Client.js5DiskCache, PublicKeys.JS5_RSAE, PublicKeys.JS5_RSAN);
			}
			if (!Client.js5Client.loadMasterIndex()) {
				return 0;
			}
			Client.createToolkit(0, null, true);
			field2941 = !MainLoadingScreen.method4062();
			loadingSpritesJs5 = Client.createJs5(field2941 ? Js5Archive.LOADING_SPRITES_RAW : Js5Archive.LOADING_SPRITES, false, 1, true, true);
			loadingScreensJs5 = Client.createJs5(Js5Archive.LOADING_SCREENS, false, 1, true, true);
			Client.fontmetricsJs5 = Client.createJs5(Js5Archive.FONTMETRICS, false, 1, true, true);
			Client.defaultsJs5 = Client.createJs5(Js5Archive.DEFAULTS, true, 1, true, true);
		}
		if (field3419 == LoadingStage.field2911) {
			boolean var1 = loadingScreensJs5.fetchAll();
			boolean var2 = Client.defaultsJs5.fetchAll();
			int var3 = Client.js5Providers[Js5Archive.LOADING_SCREENS.getArchiveId()].getPercentageComplete();
			int var4 = var3 + Client.js5Providers[field2941 ? Js5Archive.LOADING_SPRITES_RAW.getArchiveId() : Js5Archive.LOADING_SPRITES.getArchiveId()].getPercentageComplete();
			int var5 = var4 + Client.js5Providers[Js5Archive.FONTMETRICS.getArchiveId()].getPercentageComplete();
			int var6 = var5 + (var2 ? 100 : Client.defaultsJs5.getPercentageComplete());
			int var7 = var6 + (var1 ? 100 : loadingScreensJs5.getPercentageComplete());
			if (var7 != 500) {
				return var7 / 5;
			}
			Client.graphicsDefaults = new GraphicsDefaults(Client.defaultsJs5);
			Client.titleDefaults = new TitleDefaults(Client.defaultsJs5);
			DefaultSprites.method3470(Client.graphicsDefaults);
			int var8 = Client.preferences.loadingScreen.getValue();
			field2841 = new LoadingRelated3(Client.modegame, Client.language, loadingScreensJs5);
			LoadingRelated1[] var9 = field2841.method15218(var8);
			if (var9.length == 0) {
				var9 = field2841.method15218(0);
			}
			LoadingScreenElementFactory var10 = new LoadingScreenElementFactory(loadingSpritesJs5, Client.fontmetricsJs5);
			if (var9.length > 0) {
				field2939 = new LoadingScreen[var9.length];
				for (int var11 = 0; var11 < field2939.length; var11++) {
					field2939[var11] = new MainLoadingScreen(field2841.method15217(var9[var11].field9217), var9[var11].field9215, var9[var11].field9216, var10);
				}
			}
		}
		if (field3419 == LoadingStage.field2904) {
			Client.fontProvider = new FontProvider(Client.toolkit, loadingSpritesJs5, Client.fontmetricsJs5, DefaultSprites.fonts());
		}
		if (field3419 == LoadingStage.field2905) {
			int var12 = Client.fontProvider.getLoadedFontsCount();
			int var13 = Client.fontProvider.getFontsCount();
			if (var12 < var13) {
				return var12 * 100 / var13;
			}
		}
		if (field3419 == LoadingStage.field2906) {
			if (field2939 != null && field2939.length > 0) {
				if (field2939[0].method4912() < 100) {
					return 0;
				}
				if (field2939.length > 1 && field2841.method15223() && field2939[1].method4912() < 100) {
					return 0;
				}
			}
			Client.fontProvider.loadFonts(Client.fontFactory);
			DefaultSprites.loadFonts(Client.toolkit);
			Client.setState(11);
		}
		if (field3419 == LoadingStage.OPEN_JS5_ARCHIVES) {
			Client.spritesJs5 = Client.createJs5(Js5Archive.SPRITES, false, 1, false, true);
			Client.animsJs5 = Client.createJs5(Js5Archive.ANIMS, false, 1, false, true);
			Client.animsKeyframesJs5 = Client.createJs5(Js5Archive.ANIMS_KEYFRAMES, false, 1, false, true);
			Client.basesJs5 = Client.createJs5(Js5Archive.BASES, false, 1, false, true);
			Client.configJs5 = Client.createJs5(Js5Archive.CONFIG, false, 1, true, true);
			Client.dbtableIndexJs5 = Client.createJs5(Js5Archive.DBTABLEINDEX, false, 1, true, true);
			Client.interfacesJs5 = Client.createJs5(Js5Archive.INTERFACES, false, 1, true, true);
			Client.mapsJs5 = Client.createJs5(Js5Archive.MAPS, true, 1, false, true);
			Client.modelsJs5 = Client.createJs5(Js5Archive.MODELS, false, 1, false, true);
			Client.texturesPngJs5 = Client.createJs5(Js5Archive.TEXTURES_PNG, true, 1, false, true);
			Client.binaryJs5 = Client.createJs5(Js5Archive.BINARY, false, 1, false, true);
			Client.clientscriptsJs5 = Client.createJs5(Js5Archive.CLIENTSCRIPTS, false, 1, true, true);
			Client.vorbisJs5 = Client.createJs5(Js5Archive.VORBIS, true, 1, false, false);
			Client.audiostreamsJs5 = Client.createJs5(Js5Archive.AUDIOSTREAMS, true, 1, false, false);
			Client.configLocJs5 = Client.createJs5(Js5Archive.CONFIG_LOC, false, 1, true, true);
			Client.configEnumJs5 = Client.createJs5(Js5Archive.CONFIG_ENUM, false, 1, true, true);
			Client.configNpcJs5 = Client.createJs5(Js5Archive.CONFIG_NPC, false, 1, true, true);
			Client.configObjJs5 = Client.createJs5(Js5Archive.CONFIG_OBJ, false, 1, true, true);
			Client.configSeqJs5 = Client.createJs5(Js5Archive.CONFIG_SEQ, false, 1, true, true);
			Client.configSpotJs5 = Client.createJs5(Js5Archive.CONFIG_SPOT, false, 1, true, true);
			Client.configStructJs5 = Client.createJs5(Js5Archive.CONFIG_STRUCT, false, 1, true, true);
			Client.worldmapJs5 = Client.createJs5(Js5Archive.WORLDMAP, true, 1, false, false);
			Client.worldmapAreaDataJs5 = Client.createJs5(Js5Archive.WORLDMAPAREADATA, true, 1, false, true);
			Client.quickchatJs5 = Client.createJs5(Js5Archive.QUICKCHAT, false, 1, true, true);
			Client.quickchatGlobalJs5 = Client.createJs5(Js5Archive.QUICKCHAT_GLOBAL, false, 1, true, true);
			Client.materialsJs5 = Client.createJs5(Js5Archive.MATERIALS, true, 1, true, true);
			Client.configParticleJs5 = Client.createJs5(Js5Archive.CONFIG_PARTICLE, false, 1, true, true);
			Client.configBillboardJs5 = Client.createJs5(Js5Archive.CONFIG_BILLBOARD, false, 1, true, true);
			Client.cutscenesJs5 = Client.createJs5(Js5Archive.CUTSCENES, true, 1, false, true);
			Client.dllsJs5 = Client.createJs5(Js5Archive.DLLS, true, 1, false, true);
			Client.shadersJs5 = Client.createJs5(Js5Archive.SHADERS, true, 1, true, true);
		}
		if (field3419 == LoadingStage.GET_JS5_INDEXES) {
			int var14 = 0;
			int var15 = 0;
			for (int var16 = 0; var16 < Client.js5Providers.length; var16++) {
				if (Client.js5Providers[var16] != null) {
					var14 += Client.js5Providers[var16].getPercentageComplete();
					var15++;
				}
			}
			if (var15 > 0) {
				var14 /= var15;
			}
			if (var14 != 100) {
				if (field2945 < 0) {
					field2945 = var14;
				}
				return (var14 - field2945) * 100 / (100 - field2945);
			}
			DefaultSprites.method16430(Client.graphicsDefaults);
			Client.fontProvider = new FontProvider(Client.toolkit, Client.spritesJs5, Client.fontmetricsJs5, DefaultSprites.fonts());
		}
		if (field3419 == LoadingStage.field2909) {
			byte[] var17 = Client.defaultsJs5.fetchFile(DefaultsGroup.AUDIO.js5GroupId);
			if (var17 == null) {
				return 0;
			}
			Client.audioApi = new AudioApi();
			Client.audioApi.init(50, 7340032);
			method714(var17);
			Client.setState(1);
		}
		if (field3419 == LoadingStage.field2910 && Client.hardwarePlatformLoader == null) {
			Client.hardwarePlatformLoader = new HardwarePlatformLoader(Client.dllsJs5);
			NativeLibraries.method14694(Client.hardwarePlatformLoader);
		}
		if (field3419 == LoadingStage.DOWNLOAD_STUFF) {
			int var18 = LoadableResourceManager.method5140();
			if (var18 < 100) {
				return var18;
			}
			method987(Client.defaultsJs5.fetchFile(DefaultsGroup.MAP.js5GroupId));
			PlayerModel.field7577 = Client.graphicsDefaults.field7731;
			PlayerModel.field1434 = Client.graphicsDefaults.field7729;
			PlayerModel.field10766 = Client.graphicsDefaults.field7714;
			PlayerModel.field9259 = Client.graphicsDefaults.field7734;
			if (Client.graphicsDefaults.field7739 != -1 && Client.graphicsDefaults.field7740 != -1) {
				Client.frameWidth = Client.graphicsDefaults.field7739;
				Client.frameHeight = Client.graphicsDefaults.field7740;
			}
			Client.wearposDefaults = new WearposDefaults(Client.defaultsJs5);
			Client.skillDefaults = new SkillDefaults(Client.defaultsJs5);
			MiniMenu.miniMenuDefaults = new MiniMenuDefaults(Client.defaultsJs5);
			Client.cutsceneDefaults = new CutsceneDefaults(Client.defaultsJs5);
			WorldMap.worldMapDefaults = new WorldMapDefaults(Client.defaultsJs5);
		}
		if (field3419 == LoadingStage.SETUP_CONFIG_DECODERS) {
			if (Client.graphicsDefaults.performancemetricsmodel != -1 && !Client.modelsJs5.requestdownload(Client.graphicsDefaults.performancemetricsmodel, 0)) {
				return 99;
			}
			Client.materialList = new MaterialList(Client.materialsJs5);
			Client.textureList = new BasicTextureList(Client.texturesPngJs5);
			Client.paramTypeList = new ParamTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.basTypeList = new BASTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.cursorTypeList = new CursorTypeList(Client.modegame, Client.language, Client.configJs5, Client.spritesJs5);
			Client.dbRowTypeList = new CachingConfigTypeList(Client.modegame, Client.language, Client.configJs5, Js5ConfigGroup.DBROWTYPE, 64, new BasicTypeFactory(DBRowType.class));
			Client.dbTableTypeList = new CachingConfigTypeList(Client.modegame, Client.language, Client.configJs5, Js5ConfigGroup.DBTABLETYPE, 16, new BasicTypeFactory(DBTableType.class));
			Client.enumTypeList = new EnumTypeList(Client.modegame, Client.language, Client.configEnumJs5);
			Client.overlayTypeList = new FloorOverlayTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.underlayTypeList = new FloorUnderlayTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.hitmarkTypeList = new HitmarkTypeList(Client.modegame, Client.language, Client.configJs5, Client.spritesJs5);
			Client.headbarTypeList = new HeadbarTypeList(Client.modegame, Client.language, Client.configJs5, Client.spritesJs5);
			Client.idkTypeList = new IDKTypeList(Client.modegame, Client.language, Client.configJs5, Client.modelsJs5);
			Client.invTypeList = new InvTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.lightTypeList = new LightTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.locTypeList = new LocTypeList(Client.modegame, Client.language, true, Client.configLocJs5, Client.modelsJs5);
			Client.world.method7733(Client.locTypeList);
			Client.asyncRebuild.method7674(new LocTypeList(Client.modegame, Client.language, true, Client.configLocJs5, Client.modelsJs5));
			Client.mapElementTypeList = new MapElementTypeList(Client.modegame, Client.language, Client.configJs5, Client.spritesJs5);
			Client.msiTypeList = new MSITypeList(Client.modegame, Client.language, Client.configJs5, Client.spritesJs5);
			Client.npcTypeList = new NPCTypeList(Client.modegame, Client.language, true, Client.configNpcJs5, Client.modelsJs5);
			Client.objTypeList = new ObjTypeList(Client.modegame, Client.language, true, Client.paramTypeList, Client.configObjJs5, Client.modelsJs5);
			Client.questTypeList = new QuestTypeList(Client.modegame, Client.language, Client.configJs5, true);
			Client.seqGroupTypeList = new SeqGroupTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.seqTypeList = new SeqTypeList(Client.modegame, Client.language, Client.configSeqJs5, Client.animsJs5, Client.animsKeyframesJs5, Client.basesJs5, Client.seqGroupTypeList);
			Client.skyBoxTypeList = new SkyBoxTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.skyDecorTypeList = new SkyDecorTypeList(Client.modegame, Client.language, Client.configJs5);
			Client.effectAnimTypeList = new EffectAnimTypeList(Client.modegame, Client.language, Client.configSpotJs5, Client.modelsJs5);
			Client.structTypeList = new StructTypeList(Client.modegame, Client.language, Client.configStructJs5, true);
			Client.varBasicTypeList = new VarBasicTypeListClient(Client.modegame, VarDomainType.CLIENT, Client.language, Client.configJs5);
			Client.varPlayerTypeList = new VarPlayerTypeListClient(Client.modegame, VarDomainType.PLAYER, Client.language, Client.configJs5);
			Client.varNpcTypeList = new VarBasicTypeListClient(Client.modegame, VarDomainType.NPC, Client.language, Client.configJs5);
			Client.varClanTypeList = new VarBasicTypeListClient(Client.modegame, VarDomainType.CLAN, Client.language, Client.configJs5);
			Client.varClanSettingTypeList = new VarBasicTypeListClient(Client.modegame, VarDomainType.CLAN_SETTING, Client.language, Client.configJs5);
			Client.varPlayerGroupTypeList = new VarBasicTypeListClient(Client.modegame, VarDomainType.PLAYER_GROUP, Client.language, Client.configJs5);
			Client.varObjTypeList = new VarBasicTypeListClient(Client.modegame, VarDomainType.OBJECT, Client.language, Client.configJs5);
			Client.varDomainToListEnumMap = VarTypeList.createDomainToListEnumMap(new VarTypeList[] { Client.varBasicTypeList, Client.varPlayerTypeList, Client.varNpcTypeList, Client.varClanTypeList, Client.varClanSettingTypeList, Client.varPlayerGroupTypeList, Client.varObjTypeList});
			Client.varBitTypeList = new VarBitTypeList(Client.modegame, Client.language, Client.configJs5, Client.varDomainToListEnumMap);
			Client.variableTypeProvider = new VariableTypeProviderClient();
			Component.method3669(Client.interfacesJs5, Client.modelsJs5, Client.spritesJs5, Client.fontmetricsJs5);
			Client.basicBillboardTypeList = new BasicBillboardTypeList(Client.configBillboardJs5);
			Client.basicParticleEffectorTypeList = new BasicParticleEffectorTypeList(Client.configParticleJs5);
			Client.basicParticleEmitterTypeList = new BasicParticleEmitterTypeList(Client.configParticleJs5);
			Client.quickChatCatTypeList = new QuickChatCatTypeList(Client.language, Client.quickchatJs5, Client.quickchatGlobalJs5);
			Client.quickChatPhraseTypeList = new QuickChatPhraseTypeList(Client.language, Client.quickchatJs5, Client.quickchatGlobalJs5, new ClientDynamicProvider());
			Client.localPlayerGameState = new PlayerGameState(Client.varPlayerTypeList, Client.varBitTypeList, Client.skillDefaults.getSkillCount());
			Client.resetModelCaches();
			AnimationNode.method6114(Client.seqTypeList);
			ParticleSystemRenderer.method706(Client.basicParticleEmitterTypeList, Client.basicParticleEffectorTypeList);
			SkyBox.method13864(Client.modelsJs5, Client.materialList, Client.textureList);
			Huffman var19 = new Huffman(Client.binaryJs5.getfile("huffman", ""));
			WordPack.setHuffman(var19);
			GameShell.field6594 = Timer.method6109();
			Client.hardwarePlatform = new HardwarePlatform(true);
		}
		if (field3419 == LoadingStage.SETUP_STATIC_SPRITES) {
			int var20 = DefaultSprites.getLoadedSpritesCount(Client.spritesJs5) + Client.fontProvider.getLoadedFontsCount(true);
			int var21 = DefaultSprites.getSpritesCount() + Client.fontProvider.getFontsCount();
			if (var20 < var21) {
				return var20 * 100 / var21;
			}
		}
		if (field3419 == LoadingStage.field2914) {
			WorldMap.method8506(Client.worldmapJs5, Client.worldmapAreaDataJs5, Client.overlayTypeList, Client.underlayTypeList, Client.world.getLocTypeList(), Client.mapElementTypeList, Client.msiTypeList, Client.localPlayerGameState, Client.localPlayerGameState);
		}
		if (field3419 == LoadingStage.SETUP_VARC_SYSTEM) {
			Client.clientVarDomain = new ClientVarDomain(Client.varBasicTypeList);
			method9212();
			Client.authPreferences = TotpPreferences.method18618();
			Client.mapsJs5.discardNames(false, true);
			Client.spritesJs5.discardNames(true, true);
			Client.fontmetricsJs5.discardNames(true, true);
			Client.binaryJs5.discardNames(true, true);
			Client.field10807 = true;
		}
		if (field3419 == LoadingStage.field2916 && Client.graphicsDefaults.login_interface != -1) {
			if (!Component.openInterface(Client.graphicsDefaults.login_interface, null)) {
				return 0;
			}
			boolean var22 = true;
			for (int var23 = 0; var23 < Component.interfaces[Client.graphicsDefaults.login_interface].components.length; var23++) {
				Component var24 = Component.interfaces[Client.graphicsDefaults.login_interface].components[var23];
				if (var24.type == 5 && var24.graphic != -1 && !Client.spritesJs5.requestdownload(var24.graphic, 0)) {
					var22 = false;
				}
			}
			if (!var22) {
				return 0;
			}
		}
		if (field3419 == LoadingStage.field2917) {
			Client.method7227(true);
		}
		if (field3419 == LoadingStage.field2903) {
			field593.method4856();
			try {
				field2940.join();
			} catch (InterruptedException var26) {
				return 0;
			}
			field593 = null;
			field2940 = null;
			loadingSpritesJs5 = null;
			loadingScreensJs5 = null;
			field2841 = null;
			field2939 = null;
			Client.js5Archives.remove(Js5Archive.LOADING_SCREENS);
			Client.js5Archives.remove(Js5Archive.LOADING_SPRITES);
			Client.js5Archives.remove(Js5Archive.LOADING_SPRITES_RAW);
			MainLoadingScreen.method271();
			Client.isSafeMode = Client.preferences.safeMode.getValue() == 1;
			Client.preferences.setPreference(Client.preferences.safeMode, 1);
			if (Client.isSafeMode) {
				Client.preferences.setPreference(Client.preferences.toolkit, 0);
			} else if (Client.preferences.toolkit.defaulted && Client.hardwarePlatform.cpuInfoRam < 512 && Client.hardwarePlatform.cpuInfoRam != 0) {
				Client.preferences.setPreference(Client.preferences.toolkit, 0);
			}
			Preferences.save();
			if (Client.isSafeMode) {
				Client.setToolkit(0, false);
				if (!Client.field10812) {
					GraphicsPacketQueue.method6971(ToolkitType.field8881);
				}
			} else {
				Client.setToolkit(Client.preferences.toolkit.getValue(), false);
				if (Client.preferences.toolkit.getValue() == 0) {
					GraphicsPacketQueue.method6971(ToolkitType.field8882);
				}
			}
			Client.setWindowMode(Client.preferences.windowMode.getValue(), -1, -1, false);
			Client.fontProvider.loadFonts(Client.fontFactory);
			DefaultSprites.loadFonts(Client.toolkit);
			DefaultSprites.loadSprites(Client.toolkit, Client.spritesJs5);
		}
		return method3584();
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
				EnvironmentManager.samplerMaterial = var1.g2();
			} else if (var2 == 10) {
				var1.g2();
			}
		}
	}

	@ObfuscatedName("al.d([BB)V")
	public static void method714(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		while (true) {
			int var2 = var1.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = var1.g2();
				Client.audioApi.setTitleScreenSong(var3);
			}
		}
	}

	@ObfuscatedName("ux.c(I)V")
	public static void method9212() {
		FileOnDisk var0 = GameShell.openPrefs("2", Client.modegame.titleURL, false);
		Client.clientVarDomain.method16420(var0);
	}

	@ObfuscatedName("ss.r(B)V")
	public static void stopRendererThread() {
		if (field593 != null) {
			field593.method4856();
		}
		if (field2940 == null) {
			return;
		}
		while (true) {
			try {
				field2940.join();
				break;
			} catch (InterruptedException var1) {
			}
		}
	}
}
