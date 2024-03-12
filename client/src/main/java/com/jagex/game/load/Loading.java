package com.jagex.game.load;

import com.jagex.audio.AudioApi;
import com.jagex.core.constants.PublicKeys;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.compression.huffman.WordPack;
import com.jagex.core.utils.Timer;
import com.jagex.core.utils.TotpPreferences;
import com.jagex.game.config.iftype.Component;
import rs2.client.Client;
import rs2.client.login.LoginManager;
import com.jagex.game.client.*;
import com.jagex.game.script.ClientVariableManager;
import com.jagex.game.compression.huffman.Huffman;
import com.jagex.game.config.*;
import com.jagex.game.config.db.dbrowtype.DBRowType;
import com.jagex.game.config.db.dbtabletype.DBTableType;
import com.jagex.game.config.defaults.*;
import com.jagex.game.config.enumtype.EnumTypeList;
import com.jagex.game.config.flotype.FloorOverlayTypeList;
import com.jagex.game.config.headbartype.HeadbarTypeList;
import com.jagex.game.config.idktype.IDKTypeList;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.msitype.MSITypeList;
import com.jagex.game.config.npctype.NPCTypeList;
import com.jagex.game.config.quickchatcattype.QuickChatCatTypeList;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseTypeList;
import com.jagex.game.config.seqgrouptype.SeqGroupTypeList;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.skydecortype.SkyDecorTypeList;
import com.jagex.game.config.structtype.StructTypeList;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.VariableTypeProviderClient;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.config.vartype.player.VarPlayerTypeListClient;
import com.jagex.game.world.WorldMap;
import com.jagex.game.world.entity.PlayerGameState;
import com.jagex.graphics.*;
import com.jagex.game.clientoptions.Preferences;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.cursortype.CursorTypeList;
import com.jagex.game.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.config.hitmarktype.HitmarkTypeList;
import com.jagex.game.config.invtype.InvTypeList;
import com.jagex.game.config.lighttype.LightTypeList;
import com.jagex.game.config.meltype.MapElementTypeList;
import com.jagex.game.config.objtype.ObjTypeList;
import com.jagex.game.config.paramtype.ParamTypeList;
import com.jagex.game.config.questtype.QuestTypeList;
import com.jagex.game.config.skyboxtype.SkyBoxTypeList;
import com.jagex.game.config.effectanimtype.EffectAnimTypeList;
import com.jagex.game.config.vartype.general.VarBasicTypeListClient;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.js5.network.Js5Client;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ji")
public class Loading {

	@ObfuscatedName("ji.m")
	public static int field2946 = -1;

	@ObfuscatedName("ji.o")
	public static boolean field2944 = false;

	@ObfuscatedName("ji.q")
	public static int field2945 = -1;

	public Loading() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jb.e(I)V")
	public static void method4883() {
		field2944 = true;
		Statics.field8535 = LoginManager.username;
		Statics.field4407 = LoginManager.password;
		Client.logout(false);
		LoadableResourceManager.method3670();
		Statics.field2938 = null;
		Statics.field1833 = null;
		Client.setState(5);
	}

	@ObfuscatedName("nt.n(B)Z")
	public static boolean method6040() {
		return field2944;
	}

	@ObfuscatedName("adf.m(I)V")
	public static void method15243() {
		if (Statics.field2938 == null) {
			Statics.field2938 = LoadingStage.method4920();
			Statics.field3419 = Statics.field2938[0];
			Statics.field7966 = MonotonicTime.method3655();
		}
		if (Statics.field593 == null) {
			method254();
		}
		LoadingStage var0 = Statics.field3419;
		int var1 = method7622();
		if (Statics.field3419 == var0) {
			Statics.field2942 = Statics.field3419.field2908.method15021(Statics.field1680);
			Statics.field4964 = Statics.field2942;
			if (Statics.field3419.field2926) {
				Statics.field9130 = (Statics.field3419.field2924 - Statics.field3419.field2923) * var1 / 100 + Statics.field3419.field2923;
			}
			if (Statics.field3419.field2925) {
				Statics.field4964 = Statics.field4964 + " - " + Statics.field9130 + "%";
			}
		} else if (Statics.field3419 == LoadingStage.field2919) {
			Statics.field593 = null;
			Client.setState(4);
			if (field2944) {
				field2944 = false;
				LoginManager.method665(Statics.field8535, Statics.field4407, "", false);
			}
		} else {
			Statics.field2942 = var0.field2922.method15021(Statics.field1680);
			Statics.field4964 = Statics.field2942;
			if (Statics.field3419.field2925) {
				Statics.field4964 = Statics.field4964 + " - " + var0.field2924 + "%";
			}
			Statics.field9130 = var0.field2924;
			if (Statics.field3419.field2926 || var0.field2926) {
				Statics.field7966 = MonotonicTime.method3655();
			}
		}
		if (Statics.field593 == null) {
			return;
		}
		Statics.field593.method4849(Statics.field7966, Statics.field2942, Statics.field4964, Statics.field9130, Statics.field3419);
		if (Statics.field2939 == null) {
			return;
		}
		for (int var2 = field2946 + 1; var2 < Statics.field2939.length; var2++) {
			if (Statics.field2939[var2].method4912() >= 100 && field2946 == var2 - 1 && Client.state != 5 && Statics.field593.method4857()) {
				try {
					Statics.field2939[var2].method4916();
				} catch (Exception var4) {
					Statics.field2939 = null;
					break;
				}
				Statics.field593.method4879(Statics.field2939[var2]);
				field2946++;
				if (field2946 >= Statics.field2939.length - 1 && Statics.field2939.length > 1) {
					field2946 = Statics.field2841.method15223() ? 0 : -1;
				}
			}
		}
	}

	@ObfuscatedName("l.k(B)V")
	public static void method254() {
		if (Statics.field3419 != null) {
			Statics.field593 = new LoadingScreenRenderer();
			Statics.field593.method4849(Statics.field7966, Statics.field3419.field2908.method15021(Statics.field1680), Statics.field3419.field2908.method15021(Statics.field1680), Statics.field3419.field2923, Statics.field3419);
			Statics.field2940 = new Thread(Statics.field593, "");
			Statics.field2940.start();
		}
	}

	@ObfuscatedName("dk.f(ZI)V")
	public static void method2010(boolean arg0) {
		if (Statics.field593 == null) {
			method254();
		}
		if (arg0) {
			Statics.field593.method4845();
		}
	}

	@ObfuscatedName("gt.w(I)I")
	public static int method3583() {
		return Statics.field593.method4846();
	}

	@ObfuscatedName("apb.l(I)V")
	public static void method18929() {
		if (Statics.field2939 == null) {
			return;
		}
		LoadingScreen[] var0 = Statics.field2939;
		for (int var1 = 0; var1 < var0.length; var1++) {
			LoadingScreen var2 = var0[var1];
			var2.method4916();
		}
	}

	@ObfuscatedName("gt.u(I)I")
	public static int method3584() {
		int var0 = Statics.field3419.field2920;
		if (var0 < Statics.field2938.length - 1) {
			Statics.field3419 = Statics.field2938[var0 + 1];
		}
		return 100;
	}

	@ObfuscatedName("rm.z(I)I")
	public static int method7622() {
		if (Statics.field688.unknown6.method18740() == 0) {
			for (int var0 = 0; var0 < Client.field10819; var0++) {
				if (Client.field11067[var0].method9131() == 's' || Client.field11067[var0].method9131() == 'S') {
					Statics.field688.method18157(Statics.field688.unknown6, 1);
					Client.field10812 = true;
					GraphicsPacketQueue.method6971(ToolkitType.field8880);
					break;
				}
			}
		}
		if (Statics.field3419 == LoadingStage.field2913) {
			if (Statics.field1833 == null) {
				Statics.field1833 = new Js5Client(Statics.field4489, Statics.field4436, Statics.field4479, PublicKeys.field623, PublicKeys.field625);
			}
			if (!Statics.field1833.method6834()) {
				return 0;
			}
			Client.method3596(0, null, true);
			Statics.field2941 = !MainLoadingScreen.method4062();
			Statics.field8522 = Client.method5156(Statics.field2941 ? Js5Archive.LOADING_SPRITES_RAW : Js5Archive.LOADING_SPRITES, false, 1, true, true);
			Statics.field8532 = Client.method5156(Js5Archive.LOADING_SCREENS, false, 1, true, true);
			Statics.field7672 = Client.method5156(Js5Archive.FONTMETRICS, false, 1, true, true);
			Statics.field1587 = Client.method5156(Js5Archive.DEFAULTS, true, 1, true, true);
		}
		if (Statics.field3419 == LoadingStage.field2911) {
			boolean var1 = Statics.field8532.method6896();
			boolean var2 = Statics.field1587.method6896();
			int var3 = Statics.field6888[Js5Archive.LOADING_SCREENS.getArchiveId()].method16823();
			int var4 = var3 + Statics.field6888[Statics.field2941 ? Js5Archive.LOADING_SPRITES_RAW.getArchiveId() : Js5Archive.LOADING_SPRITES.getArchiveId()].method16823();
			int var5 = var4 + Statics.field6888[Js5Archive.FONTMETRICS.getArchiveId()].method16823();
			int var6 = var5 + (var2 ? 100 : Statics.field1587.method6893());
			int var7 = var6 + (var1 ? 100 : Statics.field8532.method6893());
			if (var7 != 500) {
				return var7 / 5;
			}
			Statics.field11389 = new GraphicsDefaults(Statics.field1587);
			Statics.field7921 = new TitleDefaults(Statics.field1587);
			DefaultSprites.method3470(Statics.field11389);
			int var8 = Statics.field688.unknown5.method18714();
			Statics.field2841 = new LoadingRelated3(Client.field10768, Statics.field1680, Statics.field8532);
			LoadingRelated1[] var9 = Statics.field2841.method15218(var8);
			if (var9.length == 0) {
				var9 = Statics.field2841.method15218(0);
			}
			LoadingScreenElementFactory var10 = new LoadingScreenElementFactory(Statics.field8522, Statics.field7672);
			if (var9.length > 0) {
				Statics.field2939 = new LoadingScreen[var9.length];
				for (int var11 = 0; var11 < Statics.field2939.length; var11++) {
					Statics.field2939[var11] = new MainLoadingScreen(Statics.field2841.method15217(var9[var11].field9217), var9[var11].field9215, var9[var11].field9216, var10);
				}
			}
		}
		if (Statics.field3419 == LoadingStage.field2904) {
			Statics.field7538 = new FontProvider(Statics.field8198, Statics.field8522, Statics.field7672, DefaultSprites.method845());
		}
		if (Statics.field3419 == LoadingStage.field2905) {
			int var12 = Statics.field7538.method6179();
			int var13 = Statics.field7538.method6161();
			if (var12 < var13) {
				return var12 * 100 / var13;
			}
		}
		if (Statics.field3419 == LoadingStage.field2906) {
			if (Statics.field2939 != null && Statics.field2939.length > 0) {
				if (Statics.field2939[0].method4912() < 100) {
					return 0;
				}
				if (Statics.field2939.length > 1 && Statics.field2841.method15223() && Statics.field2939[1].method4912() < 100) {
					return 0;
				}
			}
			Statics.field7538.method6157(Client.field10833);
			DefaultSprites.method7114(Statics.field8198);
			Client.setState(11);
		}
		if (Statics.field3419 == LoadingStage.OPEN_JS5_ARCHIVES) {
			Statics.field10317 = Client.method5156(Js5Archive.SPRITES, false, 1, false, true);
			Statics.field7420 = Client.method5156(Js5Archive.ANIMS, false, 1, false, true);
			Statics.field10287 = Client.method5156(Js5Archive.ANIMS_KEYFRAMES, false, 1, false, true);
			Statics.field11262 = Client.method5156(Js5Archive.BASES, false, 1, false, true);
			Statics.field11838 = Client.method5156(Js5Archive.CONFIG, false, 1, true, true);
			Statics.field7283 = Client.method5156(Js5Archive.DBTABLEINDEX, false, 1, true, true);
			Statics.field527 = Client.method5156(Js5Archive.INTERFACES, false, 1, true, true);
			Statics.field11752 = Client.method5156(Js5Archive.MAPS, true, 1, false, true);
			Statics.field9213 = Client.method5156(Js5Archive.MODELS, false, 1, false, true);
			Statics.field1450 = Client.method5156(Js5Archive.TEXTURES_PNG, true, 1, false, true);
			Statics.field8741 = Client.method5156(Js5Archive.BINARY, false, 1, false, true);
			Statics.field5010 = Client.method5156(Js5Archive.CLIENTSCRIPTS, false, 1, true, true);
			Statics.field2613 = Client.method5156(Js5Archive.VORBIS, true, 1, false, false);
			Statics.field3085 = Client.method5156(Js5Archive.AUDIOSTREAMS, true, 1, false, false);
			Statics.field4475 = Client.method5156(Js5Archive.CONFIG_LOC, false, 1, true, true);
			Statics.field8700 = Client.method5156(Js5Archive.CONFIG_ENUM, false, 1, true, true);
			Statics.field4618 = Client.method5156(Js5Archive.CONFIG_NPC, false, 1, true, true);
			Statics.field7537 = Client.method5156(Js5Archive.CONFIG_OBJ, false, 1, true, true);
			Statics.field8285 = Client.method5156(Js5Archive.CONFIG_SEQ, false, 1, true, true);
			Statics.field2149 = Client.method5156(Js5Archive.CONFIG_SPOT, false, 1, true, true);
			Statics.field3611 = Client.method5156(Js5Archive.CONFIG_STRUCT, false, 1, true, true);
			Statics.field10752 = Client.method5156(Js5Archive.WORLDMAP, true, 1, false, false);
			Statics.field8332 = Client.method5156(Js5Archive.WORLDMAPAREADATA, true, 1, false, true);
			Statics.field4404 = Client.method5156(Js5Archive.QUICKCHAT, false, 1, true, true);
			Statics.field1935 = Client.method5156(Js5Archive.QUICKCHAT_GLOBAL, false, 1, true, true);
			Statics.field10249 = Client.method5156(Js5Archive.MATERIALS, true, 1, true, true);
			Statics.field6879 = Client.method5156(Js5Archive.CONFIG_PARTICLE, false, 1, true, true);
			Statics.field736 = Client.method5156(Js5Archive.CONFIG_BILLBOARD, false, 1, true, true);
			Statics.field3808 = Client.method5156(Js5Archive.CUTSCENES, true, 1, false, true);
			Statics.field7060 = Client.method5156(Js5Archive.DLLS, true, 1, false, true);
			Statics.field2900 = Client.method5156(Js5Archive.SHADERS, true, 1, true, true);
		}
		if (Statics.field3419 == LoadingStage.GET_JS5_INDEXES) {
			int var14 = 0;
			int var15 = 0;
			for (int var16 = 0; var16 < Statics.field6888.length; var16++) {
				if (Statics.field6888[var16] != null) {
					var14 += Statics.field6888[var16].method16823();
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
			DefaultSprites.method16430(Statics.field11389);
			Statics.field7538 = new FontProvider(Statics.field8198, Statics.field10317, Statics.field7672, DefaultSprites.method845());
		}
		if (Statics.field3419 == LoadingStage.field2909) {
			byte[] var17 = Statics.field1587.method6894(DefaultsGroup.field7705.field7708);
			if (var17 == null) {
				return 0;
			}
			Statics.field1798 = new AudioApi();
			Statics.field1798.method3148(50, 7340032);
			method714(var17);
			Client.setState(1);
		}
		if (Statics.field3419 == LoadingStage.field2910 && Statics.field10577 == null) {
			Statics.field10577 = new HardwarePlatformLoader(Statics.field7060);
			NativeLibraries.method14694(Statics.field10577);
		}
		if (Statics.field3419 == LoadingStage.DOWNLOAD_STUFF) {
			int var18 = LoadableResourceManager.method5140();
			if (var18 < 100) {
				return var18;
			}
			Statics.method987(Statics.field1587.method6894(DefaultsGroup.field7701.field7708));
			Statics.field7577 = Statics.field11389.field7731;
			Statics.field1434 = Statics.field11389.field7729;
			Statics.field10766 = Statics.field11389.field7714;
			Statics.field9259 = Statics.field11389.field7734;
			if (Statics.field11389.field7739 != -1 && Statics.field11389.field7740 != -1) {
				Client.field10941 = Statics.field11389.field7739;
				Client.field10942 = Statics.field11389.field7740;
			}
			Statics.field1709 = new WearposDefaults(Statics.field1587);
			Statics.skillDefaults = new SkillDefaults(Statics.field1587);
			Statics.field1971 = new MiniMenuDefaults(Statics.field1587);
			Statics.field2775 = new CutsceneDefaults(Statics.field1587);
			Statics.field6792 = new WorldMapDefaults(Statics.field1587);
		}
		if (Statics.field3419 == LoadingStage.SETUP_CONFIG_DECODERS) {
			if (Statics.field11389.field7738 != -1 && !Statics.field9213.requestdownload(Statics.field11389.field7738, 0)) {
				return 99;
			}
			Statics.field7366 = new MaterialList(Statics.field10249);
			Statics.field7669 = new BasicTextureList(Statics.field1450);
			Statics.field3086 = new ParamTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field11742 = new BASTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field2427 = new CursorTypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field9123 = new CachingConfigTypeList(Client.field10768, Statics.field1680, Statics.field11838, Js5ConfigGroup.DBROWTYPE, 64, new BasicTypeFactory(DBRowType.class));
			Statics.field1840 = new CachingConfigTypeList(Client.field10768, Statics.field1680, Statics.field11838, Js5ConfigGroup.DBTABLETYPE, 16, new BasicTypeFactory(DBTableType.class));
			Statics.field8514 = new EnumTypeList(Client.field10768, Statics.field1680, Statics.field8700);
			Statics.field8168 = new FloorOverlayTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field8145 = new FloorUnderlayTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field2936 = new HitmarkTypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field4894 = new HeadbarTypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field2628 = new IDKTypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field9213);
			Statics.field7762 = new InvTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field7943 = new LightTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field1897 = new LocTypeList(Client.field10768, Statics.field1680, true, Statics.field4475, Statics.field9213);
			Client.world.method7733(Statics.field1897);
			Statics.field3183.method7674(new LocTypeList(Client.field10768, Statics.field1680, true, Statics.field4475, Statics.field9213));
			Statics.field5011 = new MapElementTypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field4241 = new MSITypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field7961 = new NPCTypeList(Client.field10768, Statics.field1680, true, Statics.field4618, Statics.field9213);
			Statics.field1842 = new ObjTypeList(Client.field10768, Statics.field1680, true, Statics.field3086, Statics.field7537, Statics.field9213);
			Statics.field1972 = new QuestTypeList(Client.field10768, Statics.field1680, Statics.field11838, true);
			Statics.field10771 = new SeqGroupTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field8797 = new SeqTypeList(Client.field10768, Statics.field1680, Statics.field8285, Statics.field7420, Statics.field10287, Statics.field11262, Statics.field10771);
			Statics.field2879 = new SkyBoxTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field687 = new SkyDecorTypeList(Client.field10768, Statics.field1680, Statics.field11838);
			Statics.field4874 = new EffectAnimTypeList(Client.field10768, Statics.field1680, Statics.field2149, Statics.field9213);
			Statics.field7713 = new StructTypeList(Client.field10768, Statics.field1680, Statics.field3611, true);
			Statics.field8911 = new VarBasicTypeListClient(Client.field10768, VarDomainType.CLIENT, Statics.field1680, Statics.field11838);
			Statics.field8485 = new VarPlayerTypeListClient(Client.field10768, VarDomainType.PLAYER, Statics.field1680, Statics.field11838);
			Statics.field8135 = new VarBasicTypeListClient(Client.field10768, VarDomainType.NPC, Statics.field1680, Statics.field11838);
			Statics.field8783 = new VarBasicTypeListClient(Client.field10768, VarDomainType.CLAN, Statics.field1680, Statics.field11838);
			Statics.field12225 = new VarBasicTypeListClient(Client.field10768, VarDomainType.CLAN_SETTING, Statics.field1680, Statics.field11838);
			Statics.field3415 = new VarBasicTypeListClient(Client.field10768, VarDomainType.PLAYER_GROUP, Statics.field1680, Statics.field11838);
			Statics.field1819 = new VarBasicTypeListClient(Client.field10768, VarDomainType.OBJECT, Statics.field1680, Statics.field11838);
			Statics.field1232 = VarTypeList.createDomainToListEnumMap(new VarTypeList[] { Statics.field8911, Statics.field8485, Statics.field8135, Statics.field8783, Statics.field12225, Statics.field3415, Statics.field1819 });
			Statics.field8736 = new VarBitTypeList(Client.field10768, Statics.field1680, Statics.field11838, Statics.field1232);
			Statics.field4626 = new VariableTypeProviderClient();
			Component.method3669(Statics.field527, Statics.field9213, Statics.field10317, Statics.field7672);
			Statics.field9211 = new BasicBillboardTypeList(Statics.field736);
			Statics.field2013 = new BasicParticleEffectorTypeList(Statics.field6879);
			Statics.field7282 = new BasicParticleEmitterTypeList(Statics.field6879);
			Statics.field3823 = new QuickChatCatTypeList(Statics.field1680, Statics.field4404, Statics.field1935);
			Statics.field489 = new QuickChatPhraseTypeList(Statics.field1680, Statics.field4404, Statics.field1935, new ClientDynamicProvider());
			Statics.field7410 = new PlayerGameState(Statics.field8485, Statics.field8736, Statics.skillDefaults.getSkillCount());
			Client.method9516();
			AnimationWrapper.method6114(Statics.field8797);
			ParticleSystemRenderer.method706(Statics.field7282, Statics.field2013);
			SkyBox.method13864(Statics.field9213, Statics.field7366, Statics.field7669);
			Huffman var19 = new Huffman(Statics.field8741.method6906("huffman", ""));
			WordPack.setHuffman(var19);
			Statics.field6594 = Timer.method6109();
			Statics.field10581 = new HardwarePlatform(true);
		}
		if (Statics.field3419 == LoadingStage.SETUP_STATIC_SPRITES) {
			int var20 = DefaultSprites.method15381(Statics.field10317) + Statics.field7538.method6191(true);
			int var21 = Statics.method14611() + Statics.field7538.method6161();
			if (var20 < var21) {
				return var20 * 100 / var21;
			}
		}
		if (Statics.field3419 == LoadingStage.field2914) {
			WorldMap.method8506(Statics.field10752, Statics.field8332, Statics.field8168, Statics.field8145, Client.world.method7750(), Statics.field5011, Statics.field4241, Statics.field7410, Statics.field7410);
		}
		if (Statics.field3419 == LoadingStage.SETUP_VARC_SYSTEM) {
			Statics.field7228 = new ClientVariableManager(Statics.field8911);
			method9212();
			Statics.field1895 = TotpPreferences.method18618();
			Statics.field11752.method6900(false, true);
			Statics.field10317.method6900(true, true);
			Statics.field7672.method6900(true, true);
			Statics.field8741.method6900(true, true);
			Client.field10807 = true;
		}
		if (Statics.field3419 == LoadingStage.field2916 && Statics.field11389.field7724 != -1) {
			if (!Component.method5364(Statics.field11389.field7724, null)) {
				return 0;
			}
			boolean var22 = true;
			for (int var23 = 0; var23 < Statics.field11725[Statics.field11389.field7724].field2151.length; var23++) {
				Component var24 = Statics.field11725[Statics.field11389.field7724].field2151[var23];
				if (var24.field2184 == 5 && var24.field2215 != -1 && !Statics.field10317.requestdownload(var24.field2215, 0)) {
					var22 = false;
				}
			}
			if (!var22) {
				return 0;
			}
		}
		if (Statics.field3419 == LoadingStage.field2917) {
			Client.method7227(true);
		}
		if (Statics.field3419 == LoadingStage.field2903) {
			Statics.field593.method4856();
			try {
				Statics.field2940.join();
			} catch (InterruptedException var26) {
				return 0;
			}
			Statics.field593 = null;
			Statics.field2940 = null;
			Statics.field8522 = null;
			Statics.field8532 = null;
			Statics.field2841 = null;
			Statics.field2939 = null;
			Statics.field8540.remove(Js5Archive.LOADING_SCREENS);
			Statics.field8540.remove(Js5Archive.LOADING_SPRITES);
			Statics.field8540.remove(Js5Archive.LOADING_SPRITES_RAW);
			MainLoadingScreen.method271();
			Client.field10779 = Statics.field688.unknown6.method18740() == 1;
			Statics.field688.method18157(Statics.field688.unknown6, 1);
			if (Client.field10779) {
				Statics.field688.method18157(Statics.field688.displayMode, 0);
			} else if (Statics.field688.displayMode.field11771 && Statics.field10581.cpuInfoRam < 512 && Statics.field10581.cpuInfoRam != 0) {
				Statics.field688.method18157(Statics.field688.displayMode, 0);
			}
			Preferences.method16391();
			if (Client.field10779) {
				Client.method486(0, false);
				if (!Client.field10812) {
					GraphicsPacketQueue.method6971(ToolkitType.field8881);
				}
			} else {
				Client.method486(Statics.field688.displayMode.method18545(), false);
				if (Statics.field688.displayMode.method18545() == 0) {
					GraphicsPacketQueue.method6971(ToolkitType.field8882);
				}
			}
			Client.setWindowMode(Statics.field688.maxScreenSize.method18539(), -1, -1, false);
			Statics.field7538.method6157(Client.field10833);
			DefaultSprites.method7114(Statics.field8198);
			DefaultSprites.method5202(Statics.field8198, Statics.field10317);
		}
		return method3584();
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
				Statics.field1798.method3171(var3);
			}
		}
	}

	@ObfuscatedName("ux.c(I)V")
	public static void method9212() {
		FileOnDisk var0 = GameShell.openPrefs("2", Client.field10768.field8333, false);
		Statics.field7228.method16420(var0);
	}

	@ObfuscatedName("ss.r(B)V")
	public static void method8005() {
		if (Statics.field593 != null) {
			Statics.field593.method4856();
		}
		if (Statics.field2940 == null) {
			return;
		}
		while (true) {
			try {
				Statics.field2940.join();
				break;
			} catch (InterruptedException var1) {
			}
		}
	}
}
