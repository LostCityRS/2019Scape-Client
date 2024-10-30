package com.jagex.game.clientoptions;

import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.game.client.GameShell;
import com.jagex.game.clientoptions.options.Preference;
import com.jagex.game.clientoptions.options.PreferencesAnimDetail;
import com.jagex.game.clientoptions.options.PreferencesAntiAliasing;
import com.jagex.game.clientoptions.options.PreferencesBloom;
import com.jagex.game.clientoptions.options.PreferencesBrightness;
import com.jagex.game.clientoptions.options.PreferencesBuildArea;
import com.jagex.game.clientoptions.options.PreferencesCharacterShadows;
import com.jagex.game.clientoptions.options.PreferencesCpuUsage;
import com.jagex.game.clientoptions.options.PreferencesCustomCursors;
import com.jagex.game.clientoptions.options.PreferencesDisplayMode;
import com.jagex.game.clientoptions.options.PreferencesDrawDistance;
import com.jagex.game.clientoptions.options.PreferencesFlickeringEffects;
import com.jagex.game.clientoptions.options.PreferencesFog;
import com.jagex.game.clientoptions.options.PreferencesGroundBlending;
import com.jagex.game.clientoptions.options.PreferencesGroundDecoration;
import com.jagex.game.clientoptions.options.PreferencesHardwareInfo;
import com.jagex.game.clientoptions.options.PreferencesIdleAnimations;
import com.jagex.game.clientoptions.options.PreferencesLightingDetail;
import com.jagex.game.clientoptions.options.PreferencesLoadingScreen;
import com.jagex.game.clientoptions.options.PreferencesMaxScreenSize;
import com.jagex.game.clientoptions.options.PreferencesOrthographic;
import com.jagex.game.clientoptions.options.PreferencesParticles;
import com.jagex.game.clientoptions.options.PreferencesPreset;
import com.jagex.game.clientoptions.options.PreferencesRemoveRoofs;
import com.jagex.game.clientoptions.options.PreferencesSceneryShadows;
import com.jagex.game.clientoptions.options.PreferencesScreenSize;
import com.jagex.game.clientoptions.options.PreferencesShadowQuality;
import com.jagex.game.clientoptions.options.PreferencesSkyboxes;
import com.jagex.game.clientoptions.options.PreferencesStereo;
import com.jagex.game.clientoptions.options.PreferencesTextures;
import com.jagex.game.clientoptions.options.PreferencesUnknown6;
import com.jagex.game.clientoptions.options.PreferencesUnknown7;
import com.jagex.game.clientoptions.options.PreferencesUnknown8;
import com.jagex.game.clientoptions.options.PreferencesUnused0;
import com.jagex.game.clientoptions.options.PreferencesUnused1;
import com.jagex.game.clientoptions.options.PreferencesUnused10;
import com.jagex.game.clientoptions.options.PreferencesUnused11;
import com.jagex.game.clientoptions.options.PreferencesUnused12;
import com.jagex.game.clientoptions.options.PreferencesUnused13;
import com.jagex.game.clientoptions.options.PreferencesUnused2;
import com.jagex.game.clientoptions.options.PreferencesUnused3;
import com.jagex.game.clientoptions.options.PreferencesUnused4;
import com.jagex.game.clientoptions.options.PreferencesUnused5;
import com.jagex.game.clientoptions.options.PreferencesUnused6;
import com.jagex.game.clientoptions.options.PreferencesUnused7;
import com.jagex.game.clientoptions.options.PreferencesUnused8;
import com.jagex.game.clientoptions.options.PreferencesUnused9;
import com.jagex.game.clientoptions.options.PreferencesVolume;
import com.jagex.game.clientoptions.options.PreferencesWaterDetail;
import deob.ObfuscatedName;

@ObfuscatedName("ali")
public class ClientOptions extends Node {

	@ObfuscatedName("ali.u")
	public final ModeGame modeGame;

	@ObfuscatedName("ali.z")
	public final PreferencesHardwareInfo hardwareInfo;

	@ObfuscatedName("ali.p")
	public PreferencesAnimDetail animDetail;

	@ObfuscatedName("ali.d")
	public PreferencesAntiAliasing antiAliasing;

	@ObfuscatedName("ali.c")
	public PreferencesAntiAliasing antiAliasing2;

	@ObfuscatedName("ali.r")
	public PreferencesUnused0 unused;

	@ObfuscatedName("ali.v")
	public PreferencesBloom bloom;

	@ObfuscatedName("ali.o")
	public PreferencesBrightness brightness;

	@ObfuscatedName("ali.s")
	public PreferencesBuildArea buildArea;

	@ObfuscatedName("ali.y")
	public PreferencesUnknown8 consoleKeyPress;

	@ObfuscatedName("ali.q")
	public PreferencesDrawDistance drawDistance;

	@ObfuscatedName("ali.x")
	public PreferencesFlickeringEffects flickeringEffects;

	@ObfuscatedName("ali.b")
	public PreferencesFog fog;

	@ObfuscatedName("ali.h")
	public PreferencesGroundBlending groundBlending;

	@ObfuscatedName("ali.a")
	public PreferencesGroundDecoration groundDecoration;

	@ObfuscatedName("ali.g")
	public PreferencesIdleAnimations idleAnimations;

	@ObfuscatedName("ali.i")
	public PreferencesLightingDetail lightingDetail;

	@ObfuscatedName("ali.j")
	public PreferencesSceneryShadows sceneryShadows;

	@ObfuscatedName("ali.t")
	public PreferencesShadowQuality shadowQuality;

	@ObfuscatedName("ali.ae")
	public PreferencesOrthographic orthographic;

	@ObfuscatedName("ali.ag")
	public PreferencesParticles particles;

	@ObfuscatedName("ali.ah")
	public PreferencesRemoveRoofs removeRoofs;

	@ObfuscatedName("ali.al")
	public PreferencesRemoveRoofs removeRoofs2;

	@ObfuscatedName("ali.ac")
	public PreferencesScreenSize screenSize;

	@ObfuscatedName("ali.ai")
	public PreferencesSkyboxes skyboxes;

	@ObfuscatedName("ali.aw")
	public PreferencesCharacterShadows characterShadows;

	@ObfuscatedName("ali.as")
	public PreferencesTextures textures;

	@ObfuscatedName("ali.at")
	public PreferencesDisplayMode toolkit;

	@ObfuscatedName("ali.ad")
	public PreferencesDisplayMode displayMode;

	@ObfuscatedName("ali.am")
	public PreferencesWaterDetail waterDetail;

	@ObfuscatedName("ali.au")
	public PreferencesMaxScreenSize windowMode;

	@ObfuscatedName("ali.ar")
	public PreferencesMaxScreenSize maxScreenSize2;

	@ObfuscatedName("ali.ap")
	public PreferencesUnused4 unused4;

	@ObfuscatedName("ali.aq")
	public PreferencesUnused1 unused1;

	@ObfuscatedName("ali.ax")
	public PreferencesUnused2 unused2;

	@ObfuscatedName("ali.av")
	public PreferencesUnused3 unused3;

	@ObfuscatedName("ali.ao")
	public PreferencesUnused5 unused5;

	@ObfuscatedName("ali.aj")
	public PreferencesUnused6 unused6;

	@ObfuscatedName("ali.ay")
	public PreferencesUnused7 unused7;

	@ObfuscatedName("ali.ab")
	public PreferencesUnused8 unused8;

	@ObfuscatedName("ali.az")
	public PreferencesUnused9 unused9;

	@ObfuscatedName("ali.aa")
	public PreferencesUnused10 unused10;

	@ObfuscatedName("ali.af")
	public PreferencesUnused11 unused11;

	@ObfuscatedName("ali.ak")
	public PreferencesUnused12 unused12;

	@ObfuscatedName("ali.an")
	public PreferencesCustomCursors customCursors;

	@ObfuscatedName("ali.bf")
	public PreferencesPreset preset;

	@ObfuscatedName("ali.bl")
	public PreferencesCpuUsage cpuUsage;

	@ObfuscatedName("ali.bk")
	public PreferencesLoadingScreen loadingScreen;

	@ObfuscatedName("ali.bh")
	public PreferencesUnknown6 safeMode;

	@ObfuscatedName("ali.bx")
	public PreferencesUnknown7 unknown7;

	@ObfuscatedName("ali.bd")
	public PreferencesUnused13 unused13;

	@ObfuscatedName("ali.bc")
	public PreferencesVolume soundVolume;

	@ObfuscatedName("ali.bi")
	public PreferencesVolume backgroundSoundVolume;

	@ObfuscatedName("ali.bn")
	public PreferencesVolume speechVolume;

	@ObfuscatedName("ali.bt")
	public PreferencesVolume unknownVolume1;

	@ObfuscatedName("ali.bq")
	public PreferencesVolume unknownVolume2;

	@ObfuscatedName("ali.bm")
	public PreferencesStereo stereo;

	public ClientOptions(ModeGame arg0, int arg1) {
		this.modeGame = arg0;
		this.hardwareInfo = new PreferencesHardwareInfo(GameShell.maxmemory, GameShell.cpucount, GameShell.osArchRaw.toLowerCase().indexOf("arm") != -1, GameShell.osName.startsWith("win"), false);
		this.displayMode = new PreferencesDisplayMode(arg1, this);
		this.setDefaultPreferences(true, true);
	}

	public ClientOptions(Packet arg0, ModeGame arg1, int arg2) {
		this.modeGame = arg1;
		this.hardwareInfo = new PreferencesHardwareInfo(GameShell.maxmemory, GameShell.cpucount, GameShell.osArchRaw.indexOf("arm") != -1, GameShell.osName.startsWith("win"), false);
		this.displayMode = new PreferencesDisplayMode(arg2, this);
		this.readPreferences(arg0);
	}

	@ObfuscatedName("ali.e(Lalw;B)V")
	public void readPreferences(Packet arg0) {
		if (arg0 == null || arg0.data == null) {
			this.setDefaultPreferences(true, true);
		} else {
			int var2 = arg0.g1();
			if (var2 < 23) {
				try {
					this.method18155(arg0, var2);
				} catch (Exception var4) {
					this.setDefaultPreferences(true, true);
				}
				this.setDefaultPreferences(false, true);
			} else if (var2 > 38) {
				this.setDefaultPreferences(true, true);
			} else {
				if (var2 >= 29) {
					this.animDetail = new PreferencesAnimDetail(arg0.g1(), this);
				}
				this.antiAliasing = new PreferencesAntiAliasing(arg0.g1(), this);
				if (var2 >= 31) {
					this.unused = new PreferencesUnused0(arg0.g1(), this);
				}
				this.antiAliasing2 = new PreferencesAntiAliasing(this.antiAliasing.getValue(), this);
				this.bloom = new PreferencesBloom(arg0.g1(), this);
				this.brightness = new PreferencesBrightness(arg0.g1(), this);
				this.buildArea = new PreferencesBuildArea(arg0.g1(), this);
				if (var2 >= 27) {
					this.drawDistance = new PreferencesDrawDistance(arg0.g1(), this);
				}
				this.flickeringEffects = new PreferencesFlickeringEffects(arg0.g1(), this);
				this.fog = new PreferencesFog(arg0.g1(), this);
				this.groundBlending = new PreferencesGroundBlending(arg0.g1(), this);
				this.groundDecoration = new PreferencesGroundDecoration(arg0.g1(), this);
				this.idleAnimations = new PreferencesIdleAnimations(arg0.g1(), this);
				this.lightingDetail = new PreferencesLightingDetail(arg0.g1(), this);
				this.sceneryShadows = new PreferencesSceneryShadows(arg0.g1(), this);
				if (var2 >= 33) {
					this.shadowQuality = new PreferencesShadowQuality(arg0.g1(), this);
				}
				if (var2 >= 34) {
					arg0.g1();
				}
				if (var2 >= 24) {
					this.orthographic = new PreferencesOrthographic(arg0.g1(), this);
				}
				this.particles = new PreferencesParticles(arg0.g1(), this);
				this.removeRoofs = new PreferencesRemoveRoofs(arg0.g1(), this);
				this.removeRoofs2 = new PreferencesRemoveRoofs(this.removeRoofs.getValue(), this);
				this.screenSize = new PreferencesScreenSize(arg0.g1(), this);
				if (var2 >= 25) {
					this.skyboxes = new PreferencesSkyboxes(arg0.g1(), this);
				}
				this.characterShadows = new PreferencesCharacterShadows(arg0.g1(), this);
				if (var2 <= 25) {
					arg0.pos++;
				}
				this.textures = new PreferencesTextures(arg0.g1(), this);
				this.toolkit = new PreferencesDisplayMode(arg0.g1(), this);
				this.displayMode = new PreferencesDisplayMode(this.toolkit.getValue(), this);
				arg0.g1();
				this.waterDetail = new PreferencesWaterDetail(arg0.g1(), this);
				this.windowMode = new PreferencesMaxScreenSize(arg0.g1(), this);
				if (var2 >= 35) {
					this.unused1 = new PreferencesUnused1(arg0.g1(), this);
					this.unused2 = new PreferencesUnused2(arg0.g1(), this);
					this.unused3 = new PreferencesUnused3(arg0.g1(), this);
					this.unused4 = new PreferencesUnused4(arg0.g1(), this);
					this.unused5 = new PreferencesUnused5(arg0.g1(), this);
					this.unused6 = new PreferencesUnused6(arg0.g1b(), this);
				}
				if (var2 >= 36) {
					this.unused7 = new PreferencesUnused7(arg0.g1(), this);
					this.unused8 = new PreferencesUnused8(arg0.g1(), this);
				}
				if (var2 >= 37) {
					this.unused9 = new PreferencesUnused9(arg0.g2(), this);
					this.unused10 = new PreferencesUnused10(arg0.g2(), this);
				}
				if (var2 >= 38) {
					this.unused11 = new PreferencesUnused11(arg0.g2(), this);
					this.unused12 = new PreferencesUnused12(arg0.g2(), this);
				}
				this.maxScreenSize2 = new PreferencesMaxScreenSize(this.windowMode.getValue(), this);
				this.customCursors = new PreferencesCustomCursors(arg0.g1(), this);
				this.preset = new PreferencesPreset(arg0.g1(), this);
				this.cpuUsage = new PreferencesCpuUsage(arg0.g1(), this);
				this.loadingScreen = new PreferencesLoadingScreen(arg0.g1(), this);
				this.safeMode = new PreferencesUnknown6(arg0.g1(), this);
				if (var2 >= 26) {
					this.unknown7 = new PreferencesUnknown7(arg0.g1(), this);
				}
				if (var2 >= 28) {
					this.unused13 = new PreferencesUnused13(arg0.g1(), this);
				}
				if (var2 >= 30) {
					this.consoleKeyPress = new PreferencesUnknown8(arg0.g1(), this);
				}
				this.soundVolume = new PreferencesVolume(arg0.g1(), this);
				this.backgroundSoundVolume = new PreferencesVolume(arg0.g1(), this);
				this.speechVolume = new PreferencesVolume(arg0.g1(), this);
				this.unknownVolume1 = new PreferencesVolume(arg0.g1(), this);
				this.unknownVolume2 = new PreferencesVolume(arg0.g1(), this);
				this.stereo = new PreferencesStereo(arg0.g1(), this);
				this.setDefaultPreferences(false, var2 < 32);
			}
		}
		this.clampPreferencesValues();
	}

	@ObfuscatedName("ali.n(ZZB)V")
	public void setDefaultPreferences(boolean arg0, boolean arg1) {
		if (arg0 || this.animDetail == null) {
			this.animDetail = new PreferencesAnimDetail(this);
		}
		if (arg0 || this.antiAliasing == null) {
			this.antiAliasing = new PreferencesAntiAliasing(this);
		}
		if (arg0 || this.unused == null) {
			this.unused = new PreferencesUnused0(this);
		}
		if (arg0 || this.antiAliasing2 == null) {
			this.antiAliasing2 = new PreferencesAntiAliasing(this.antiAliasing.getValue(), this);
		}
		if (arg0 || this.bloom == null) {
			this.bloom = new PreferencesBloom(this);
		}
		if (arg0 || this.brightness == null) {
			this.brightness = new PreferencesBrightness(this);
		}
		if (arg0 || this.buildArea == null) {
			this.buildArea = new PreferencesBuildArea(this);
		}
		if (arg0 || this.drawDistance == null) {
			this.drawDistance = new PreferencesDrawDistance(this);
		}
		if (arg0 || this.flickeringEffects == null) {
			this.flickeringEffects = new PreferencesFlickeringEffects(this);
		}
		if (arg0 || this.fog == null) {
			this.fog = new PreferencesFog(this);
		}
		if (arg0 || this.groundBlending == null) {
			this.groundBlending = new PreferencesGroundBlending(this);
		}
		if (arg0 || this.groundDecoration == null) {
			this.groundDecoration = new PreferencesGroundDecoration(this);
		}
		if (arg0 || this.idleAnimations == null) {
			this.idleAnimations = new PreferencesIdleAnimations(this);
		}
		if (arg0 || this.lightingDetail == null) {
			this.lightingDetail = new PreferencesLightingDetail(this);
		}
		if (arg0 || this.sceneryShadows == null) {
			this.sceneryShadows = new PreferencesSceneryShadows(this);
		}
		if (arg0 || this.shadowQuality == null) {
			this.shadowQuality = new PreferencesShadowQuality(this);
		}
		if (arg0 || this.orthographic == null) {
			this.orthographic = new PreferencesOrthographic(this);
		}
		if (arg0 || this.particles == null) {
			this.particles = new PreferencesParticles(this);
		}
		if (arg0 || this.removeRoofs == null) {
			this.removeRoofs = new PreferencesRemoveRoofs(this);
		}
		if (arg0 || this.removeRoofs2 == null) {
			this.removeRoofs2 = new PreferencesRemoveRoofs(this.removeRoofs.getValue(), this);
		}
		if (arg0 || this.screenSize == null) {
			this.screenSize = new PreferencesScreenSize(this);
		}
		if (arg0 || this.skyboxes == null) {
			this.skyboxes = new PreferencesSkyboxes(this);
		}
		if (arg0 || this.characterShadows == null) {
			this.characterShadows = new PreferencesCharacterShadows(this);
		}
		if (arg0 || this.textures == null) {
			this.textures = new PreferencesTextures(this);
		}
		if (arg0 || this.toolkit == null) {
			this.toolkit = new PreferencesDisplayMode(this);
		}
		if (arg0 || this.displayMode == null) {
			this.displayMode = new PreferencesDisplayMode(this.toolkit.getValue(), this);
		}
		if (arg0 || this.waterDetail == null) {
			this.waterDetail = new PreferencesWaterDetail(this);
		}
		if (arg0 || this.windowMode == null) {
			this.windowMode = new PreferencesMaxScreenSize(this);
		}
		if (arg0 || this.maxScreenSize2 == null) {
			this.maxScreenSize2 = new PreferencesMaxScreenSize(this.windowMode.getValue(), this);
		}
		if (arg0 || this.unused4 == null) {
			this.unused4 = new PreferencesUnused4(this);
		}
		if (arg0 || this.unused1 == null) {
			this.unused1 = new PreferencesUnused1(this);
		}
		if (arg0 || this.unused2 == null) {
			this.unused2 = new PreferencesUnused2(this);
		}
		if (arg0 || this.unused3 == null) {
			this.unused3 = new PreferencesUnused3(this);
		}
		if (arg0 || this.unused5 == null) {
			this.unused5 = new PreferencesUnused5(this);
		}
		if (arg0 || this.unused6 == null) {
			this.unused6 = new PreferencesUnused6(this);
		}
		if (arg0 || this.unused7 == null) {
			this.unused7 = new PreferencesUnused7(this);
		}
		if (arg0 || this.unused8 == null) {
			this.unused8 = new PreferencesUnused8(this);
		}
		if (arg0 || this.unused9 == null) {
			this.unused9 = new PreferencesUnused9(this);
		}
		if (arg0 || this.unused10 == null) {
			this.unused10 = new PreferencesUnused10(this);
		}
		if (arg0 || this.unused11 == null) {
			this.unused11 = new PreferencesUnused11(this);
		}
		if (arg0 || this.unused12 == null) {
			this.unused12 = new PreferencesUnused12(this);
		}
		if (arg0 || this.customCursors == null) {
			this.customCursors = new PreferencesCustomCursors(this);
		}
		if (arg0 || this.preset == null) {
			this.preset = new PreferencesPreset(this);
		}
		if (arg0 || this.cpuUsage == null) {
			this.cpuUsage = new PreferencesCpuUsage(this);
		}
		if (arg0 || this.loadingScreen == null) {
			this.loadingScreen = new PreferencesLoadingScreen(this);
		}
		if (arg0 || this.safeMode == null) {
			this.safeMode = new PreferencesUnknown6(this);
		}
		if (arg0 || this.unknown7 == null) {
			this.unknown7 = new PreferencesUnknown7(this);
		}
		if (arg0 || this.unused13 == null) {
			this.unused13 = new PreferencesUnused13(this);
		}
		if (arg0 || this.consoleKeyPress == null) {
			this.consoleKeyPress = new PreferencesUnknown8(this);
		}
		if (arg0 || arg1 || this.soundVolume == null) {
			this.soundVolume = new PreferencesVolume(this);
		}
		if (arg0 || arg1 || this.backgroundSoundVolume == null) {
			this.backgroundSoundVolume = new PreferencesVolume(this);
		}
		if (arg0 || arg1 || this.speechVolume == null) {
			this.speechVolume = new PreferencesVolume(this);
		}
		if (arg0 || arg1 || this.unknownVolume1 == null) {
			this.unknownVolume1 = new PreferencesVolume(this);
		}
		if (arg0 || arg1 || this.unknownVolume2 == null) {
			this.unknownVolume2 = new PreferencesVolume(this);
		}
		if (arg0 || arg1 || this.stereo == null) {
			this.stereo = new PreferencesStereo(this);
		}
	}

	@ObfuscatedName("ali.m(Lalw;IB)V")
	public void method18155(Packet arg0, int arg1) {
		this.brightness = new PreferencesBrightness(arg0.g1(), this);
		arg0.pos++;
		this.removeRoofs = new PreferencesRemoveRoofs(arg0.g1() + 1, this);
		this.groundDecoration = new PreferencesGroundDecoration(arg0.g1(), this);
		arg0.pos++;
		this.idleAnimations = new PreferencesIdleAnimations(arg0.g1(), this);
		this.flickeringEffects = new PreferencesFlickeringEffects(arg0.g1(), this);
		arg0.g1();
		this.characterShadows = new PreferencesCharacterShadows(arg0.g1(), this);
		int var3 = arg0.g1();
		int var4 = 0;
		if (arg1 >= 17) {
			var4 = arg0.g1();
		}
		this.sceneryShadows = new PreferencesSceneryShadows(var3 > var4 ? var3 : var4, this);
		boolean var5 = true;
		boolean var6 = true;
		boolean var7;
		if (arg1 >= 2) {
			var7 = arg0.g1() == 1;
			if (arg1 >= 17) {
				var6 = arg0.g1() == 1;
			}
		} else {
			var7 = arg0.g1() == 1;
			arg0.g1();
		}
		this.lightingDetail = new PreferencesLightingDetail(var7 | var6 ? 1 : 0, this);
		this.waterDetail = new PreferencesWaterDetail(arg0.g1(), this);
		this.fog = new PreferencesFog(arg0.g1(), this);
		this.antiAliasing = new PreferencesAntiAliasing(arg0.g1(), this);
		this.stereo = new PreferencesStereo(arg0.g1(), this);
		this.soundVolume = new PreferencesVolume(arg0.g1(), this);
		if (arg1 >= 20) {
			this.speechVolume = new PreferencesVolume(arg0.g1(), this);
		} else {
			this.speechVolume = new PreferencesVolume(this.soundVolume.getValue(), this);
		}
		this.unknownVolume1 = new PreferencesVolume(arg0.g1(), this);
		this.backgroundSoundVolume = new PreferencesVolume(arg0.g1(), this);
		if (arg1 >= 21) {
			this.unknownVolume2 = new PreferencesVolume(arg0.g1(), this);
		} else {
			this.unknownVolume2 = new PreferencesVolume(this.unknownVolume1.getValue(), this);
		}
		if (arg1 >= 1) {
			arg0.g2();
			arg0.g2();
		}
		if (arg1 >= 3 && arg1 < 6) {
			arg0.g1();
		}
		if (arg1 >= 4) {
			this.particles = new PreferencesParticles(arg0.g1(), this);
		}
		arg0.g4s();
		if (arg1 >= 6) {
			this.windowMode = new PreferencesMaxScreenSize(arg0.g1(), this);
		}
		if (arg1 >= 7) {
			this.safeMode = new PreferencesUnknown6(arg0.g1(), this);
		}
		if (arg1 >= 8) {
			arg0.g1();
		}
		if (arg1 >= 9) {
			this.buildArea = new PreferencesBuildArea(arg0.g1(), this);
		}
		if (arg1 >= 10) {
			this.bloom = new PreferencesBloom(arg0.g1(), this);
		}
		if (arg1 >= 11) {
			this.customCursors = new PreferencesCustomCursors(arg0.g1(), this);
		}
		if (arg1 >= 12) {
			this.idleAnimations = new PreferencesIdleAnimations(arg0.g1(), this);
		}
		if (arg1 >= 13) {
			this.groundBlending = new PreferencesGroundBlending(arg0.g1(), this);
		}
		if (arg1 >= 14) {
			this.toolkit = new PreferencesDisplayMode(arg0.g1(), this);
		}
		if (arg1 >= 15) {
			this.cpuUsage = new PreferencesCpuUsage(arg0.g1(), this);
		}
		if (arg1 >= 16) {
			this.textures = new PreferencesTextures(arg0.g1(), this);
		}
		if (arg1 >= 18) {
			this.preset = new PreferencesPreset(arg0.g1(), this);
		}
		if (arg1 >= 19) {
			this.screenSize = new PreferencesScreenSize(arg0.g1(), this);
		}
		if (arg1 >= 22) {
			this.loadingScreen = new PreferencesLoadingScreen(arg0.g1(), this);
		}
	}

	@ObfuscatedName("ali.k(I)Lalw;")
	public Packet createPreferencesBlock() {
		Packet var1 = new Packet(59);
		var1.p1(38);
		var1.p1(this.animDetail.getValue());
		var1.p1(this.antiAliasing.getValue());
		var1.p1(this.unused.getValue());
		var1.p1(this.bloom.getValue());
		var1.p1(this.brightness.getValue());
		var1.p1(this.buildArea.getValue());
		var1.p1(this.drawDistance.getValue());
		var1.p1(this.flickeringEffects.getValue());
		var1.p1(this.fog.getValue());
		var1.p1(this.groundBlending.getValue());
		var1.p1(this.groundDecoration.getValue());
		var1.p1(this.idleAnimations.getValue());
		var1.p1(this.lightingDetail.getValue());
		var1.p1(this.sceneryShadows.getValue());
		var1.p1(this.shadowQuality.getValue());
		var1.p1(0);
		var1.p1(this.orthographic.getValue());
		var1.p1(this.particles.getValue());
		var1.p1(this.removeRoofs.getValue());
		var1.p1(this.screenSize.getValue());
		var1.p1(this.skyboxes.getValue());
		var1.p1(this.characterShadows.getValue());
		var1.p1(this.textures.getValue());
		var1.p1(this.toolkit.getValue());
		var1.p1(0);
		var1.p1(this.waterDetail.getValue());
		var1.p1(this.windowMode.getValue());
		var1.p1(this.unused1.getValue());
		var1.p1(this.unused2.getValue());
		var1.p1(this.unused3.getValue());
		var1.p1(this.unused4.getValue());
		var1.p1(this.unused5.getValue());
		var1.p1(this.unused6.getValue());
		var1.p1(this.unused7.getValue());
		var1.p1(this.unused8.getValue());
		var1.p2(this.unused9.getValue());
		var1.p2(this.unused10.getValue());
		var1.p2(this.unused11.getValue());
		var1.p2(this.unused12.getValue());
		var1.p1(this.customCursors.getValue());
		var1.p1(this.preset.getValue());
		var1.p1(this.cpuUsage.getValue());
		var1.p1(this.loadingScreen.getValue());
		var1.p1(this.safeMode.getValue());
		var1.p1(this.unknown7.getValue());
		var1.p1(this.unused13.getValue());
		var1.p1(this.consoleKeyPress.getValue());
		var1.p1(this.soundVolume.getValue());
		var1.p1(this.backgroundSoundVolume.getValue());
		var1.p1(this.speechVolume.getValue());
		var1.p1(this.unknownVolume1.getValue());
		var1.p1(this.unknownVolume2.getValue());
		var1.p1(this.stereo.getValue());
		return var1;
	}

	@ObfuscatedName("ali.f(Lzf;IB)V")
	public void setPreference(Preference arg0, int arg1) {
		arg0.method14071(arg1);
		this.clampPreferencesValues();
	}

	@ObfuscatedName("ali.w(Lamd;ZI)V")
	public void setPreferencesDisplayMode(PreferencesDisplayMode arg0, boolean arg1) {
		arg0.method18544(arg1);
		this.clampPreferencesValues();
	}

	@ObfuscatedName("ali.l(I)V")
	public void clampPreferencesValues() {
		this.animDetail.clampValue();
		this.antiAliasing.clampValue();
		this.unused.clampValue();
		this.antiAliasing2.clampValue();
		this.bloom.clampValue();
		this.brightness.clampValue();
		this.buildArea.clampValue();
		this.drawDistance.clampValue();
		this.flickeringEffects.clampValue();
		this.fog.clampValue();
		this.groundBlending.clampValue();
		this.groundDecoration.clampValue();
		this.idleAnimations.clampValue();
		this.lightingDetail.clampValue();
		this.sceneryShadows.clampValue();
		this.shadowQuality.clampValue();
		this.orthographic.clampValue();
		this.particles.clampValue();
		this.removeRoofs.clampValue();
		this.removeRoofs2.clampValue();
		this.screenSize.clampValue();
		this.skyboxes.clampValue();
		this.characterShadows.clampValue();
		this.textures.clampValue();
		this.toolkit.clampValue();
		this.displayMode.clampValue();
		this.waterDetail.clampValue();
		this.windowMode.clampValue();
		this.maxScreenSize2.clampValue();
		this.unused4.clampValue();
		this.unused1.clampValue();
		this.unused2.clampValue();
		this.unused3.clampValue();
		this.unused5.clampValue();
		this.unused6.clampValue();
		this.unused7.clampValue();
		this.unused8.clampValue();
		this.unused9.clampValue();
		this.unused10.clampValue();
		this.unused11.clampValue();
		this.unused12.clampValue();
		this.customCursors.clampValue();
		this.preset.clampValue();
		this.cpuUsage.clampValue();
		this.loadingScreen.clampValue();
		this.safeMode.clampValue();
		this.unknown7.clampValue();
		this.unused13.clampValue();
		this.consoleKeyPress.clampValue();
		this.soundVolume.clampValue();
		this.backgroundSoundVolume.clampValue();
		this.speechVolume.clampValue();
		this.unknownVolume1.clampValue();
		this.unknownVolume2.clampValue();
		this.stereo.clampValue();
	}

	@ObfuscatedName("ali.u(B)Lzd;")
	public ModeGame modeGame() {
		return this.modeGame;
	}

	@ObfuscatedName("ali.z(I)Laag;")
	public PreferencesHardwareInfo hardwareInfo() {
		return this.hardwareInfo;
	}
}
