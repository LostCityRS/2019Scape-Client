package com.jagex.game.clientoptions;

import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.game.client.GameShell;
import com.jagex.game.clientoptions.options.*;
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

	public ClientOptions(ModeGame arg0, int displayModeValue) {
		this.modeGame = arg0;
		this.hardwareInfo = new PreferencesHardwareInfo(GameShell.maxmemory, GameShell.cpucount, GameShell.osArchRaw.toLowerCase().indexOf("arm") != -1, GameShell.osName.startsWith("win"), false);
		this.displayMode = new PreferencesDisplayMode(displayModeValue, this);
		this.setDefaultPreferences(true, true);
	}

	public ClientOptions(Packet buf, ModeGame modeGame, int displayModeValue) {
		this.modeGame = modeGame;
		this.hardwareInfo = new PreferencesHardwareInfo(GameShell.maxmemory, GameShell.cpucount, GameShell.osArchRaw.indexOf("arm") != -1, GameShell.osName.startsWith("win"), false);
		this.displayMode = new PreferencesDisplayMode(displayModeValue, this);
		this.readPreferences(buf);
	}

	@ObfuscatedName("ali.e(Lalw;B)V")
	public void readPreferences(Packet buf) {
		if (buf == null || buf.data == null) {
			this.setDefaultPreferences(true, true);
		} else {
			int version = buf.g1();
			if (version < 23) {
				try {
					this.method18155(buf, version);
				} catch (Exception var4) {
					this.setDefaultPreferences(true, true);
				}
				this.setDefaultPreferences(false, true);
			} else if (version > 38) {
				this.setDefaultPreferences(true, true);
			} else {
				if (version >= 29) {
					this.animDetail = new PreferencesAnimDetail(buf.g1(), this);
				}
				this.antiAliasing = new PreferencesAntiAliasing(buf.g1(), this);
				if (version >= 31) {
					this.unused = new PreferencesUnused0(buf.g1(), this);
				}
				this.antiAliasing2 = new PreferencesAntiAliasing(this.antiAliasing.getValue(), this);
				this.bloom = new PreferencesBloom(buf.g1(), this);
				this.brightness = new PreferencesBrightness(buf.g1(), this);
				this.buildArea = new PreferencesBuildArea(buf.g1(), this);
				if (version >= 27) {
					this.drawDistance = new PreferencesDrawDistance(buf.g1(), this);
				}
				this.flickeringEffects = new PreferencesFlickeringEffects(buf.g1(), this);
				this.fog = new PreferencesFog(buf.g1(), this);
				this.groundBlending = new PreferencesGroundBlending(buf.g1(), this);
				this.groundDecoration = new PreferencesGroundDecoration(buf.g1(), this);
				this.idleAnimations = new PreferencesIdleAnimations(buf.g1(), this);
				this.lightingDetail = new PreferencesLightingDetail(buf.g1(), this);
				this.sceneryShadows = new PreferencesSceneryShadows(buf.g1(), this);
				if (version >= 33) {
					this.shadowQuality = new PreferencesShadowQuality(buf.g1(), this);
				}
				if (version >= 34) {
					buf.g1();
				}
				if (version >= 24) {
					this.orthographic = new PreferencesOrthographic(buf.g1(), this);
				}
				this.particles = new PreferencesParticles(buf.g1(), this);
				this.removeRoofs = new PreferencesRemoveRoofs(buf.g1(), this);
				this.removeRoofs2 = new PreferencesRemoveRoofs(this.removeRoofs.getValue(), this);
				this.screenSize = new PreferencesScreenSize(buf.g1(), this);
				if (version >= 25) {
					this.skyboxes = new PreferencesSkyboxes(buf.g1(), this);
				}
				this.characterShadows = new PreferencesCharacterShadows(buf.g1(), this);
				if (version <= 25) {
					buf.pos++;
				}
				this.textures = new PreferencesTextures(buf.g1(), this);
				this.toolkit = new PreferencesDisplayMode(buf.g1(), this);
				this.displayMode = new PreferencesDisplayMode(this.toolkit.getValue(), this);
				buf.g1();
				this.waterDetail = new PreferencesWaterDetail(buf.g1(), this);
				this.windowMode = new PreferencesMaxScreenSize(buf.g1(), this);
				if (version >= 35) {
					this.unused1 = new PreferencesUnused1(buf.g1(), this);
					this.unused2 = new PreferencesUnused2(buf.g1(), this);
					this.unused3 = new PreferencesUnused3(buf.g1(), this);
					this.unused4 = new PreferencesUnused4(buf.g1(), this);
					this.unused5 = new PreferencesUnused5(buf.g1(), this);
					this.unused6 = new PreferencesUnused6(buf.g1b(), this);
				}
				if (version >= 36) {
					this.unused7 = new PreferencesUnused7(buf.g1(), this);
					this.unused8 = new PreferencesUnused8(buf.g1(), this);
				}
				if (version >= 37) {
					this.unused9 = new PreferencesUnused9(buf.g2(), this);
					this.unused10 = new PreferencesUnused10(buf.g2(), this);
				}
				if (version >= 38) {
					this.unused11 = new PreferencesUnused11(buf.g2(), this);
					this.unused12 = new PreferencesUnused12(buf.g2(), this);
				}
				this.maxScreenSize2 = new PreferencesMaxScreenSize(this.windowMode.getValue(), this);
				this.customCursors = new PreferencesCustomCursors(buf.g1(), this);
				this.preset = new PreferencesPreset(buf.g1(), this);
				this.cpuUsage = new PreferencesCpuUsage(buf.g1(), this);
				this.loadingScreen = new PreferencesLoadingScreen(buf.g1(), this);
				this.safeMode = new PreferencesUnknown6(buf.g1(), this);
				if (version >= 26) {
					this.unknown7 = new PreferencesUnknown7(buf.g1(), this);
				}
				if (version >= 28) {
					this.unused13 = new PreferencesUnused13(buf.g1(), this);
				}
				if (version >= 30) {
					this.consoleKeyPress = new PreferencesUnknown8(buf.g1(), this);
				}
				this.soundVolume = new PreferencesVolume(buf.g1(), this);
				this.backgroundSoundVolume = new PreferencesVolume(buf.g1(), this);
				this.speechVolume = new PreferencesVolume(buf.g1(), this);
				this.unknownVolume1 = new PreferencesVolume(buf.g1(), this);
				this.unknownVolume2 = new PreferencesVolume(buf.g1(), this);
				this.stereo = new PreferencesStereo(buf.g1(), this);
				this.setDefaultPreferences(false, version < 32);
			}
		}
		this.clampPreferencesValues();
	}

	@ObfuscatedName("ali.n(ZZB)V")
	public void setDefaultPreferences(boolean preferences, boolean sounds) {
		if (preferences || this.animDetail == null) {
			this.animDetail = new PreferencesAnimDetail(this);
		}
		if (preferences || this.antiAliasing == null) {
			this.antiAliasing = new PreferencesAntiAliasing(this);
		}
		if (preferences || this.unused == null) {
			this.unused = new PreferencesUnused0(this);
		}
		if (preferences || this.antiAliasing2 == null) {
			this.antiAliasing2 = new PreferencesAntiAliasing(this.antiAliasing.getValue(), this);
		}
		if (preferences || this.bloom == null) {
			this.bloom = new PreferencesBloom(this);
		}
		if (preferences || this.brightness == null) {
			this.brightness = new PreferencesBrightness(this);
		}
		if (preferences || this.buildArea == null) {
			this.buildArea = new PreferencesBuildArea(this);
		}
		if (preferences || this.drawDistance == null) {
			this.drawDistance = new PreferencesDrawDistance(this);
		}
		if (preferences || this.flickeringEffects == null) {
			this.flickeringEffects = new PreferencesFlickeringEffects(this);
		}
		if (preferences || this.fog == null) {
			this.fog = new PreferencesFog(this);
		}
		if (preferences || this.groundBlending == null) {
			this.groundBlending = new PreferencesGroundBlending(this);
		}
		if (preferences || this.groundDecoration == null) {
			this.groundDecoration = new PreferencesGroundDecoration(this);
		}
		if (preferences || this.idleAnimations == null) {
			this.idleAnimations = new PreferencesIdleAnimations(this);
		}
		if (preferences || this.lightingDetail == null) {
			this.lightingDetail = new PreferencesLightingDetail(this);
		}
		if (preferences || this.sceneryShadows == null) {
			this.sceneryShadows = new PreferencesSceneryShadows(this);
		}
		if (preferences || this.shadowQuality == null) {
			this.shadowQuality = new PreferencesShadowQuality(this);
		}
		if (preferences || this.orthographic == null) {
			this.orthographic = new PreferencesOrthographic(this);
		}
		if (preferences || this.particles == null) {
			this.particles = new PreferencesParticles(this);
		}
		if (preferences || this.removeRoofs == null) {
			this.removeRoofs = new PreferencesRemoveRoofs(this);
		}
		if (preferences || this.removeRoofs2 == null) {
			this.removeRoofs2 = new PreferencesRemoveRoofs(this.removeRoofs.getValue(), this);
		}
		if (preferences || this.screenSize == null) {
			this.screenSize = new PreferencesScreenSize(this);
		}
		if (preferences || this.skyboxes == null) {
			this.skyboxes = new PreferencesSkyboxes(this);
		}
		if (preferences || this.characterShadows == null) {
			this.characterShadows = new PreferencesCharacterShadows(this);
		}
		if (preferences || this.textures == null) {
			this.textures = new PreferencesTextures(this);
		}
		if (preferences || this.toolkit == null) {
			this.toolkit = new PreferencesDisplayMode(this);
		}
		if (preferences || this.displayMode == null) {
			this.displayMode = new PreferencesDisplayMode(this.toolkit.getValue(), this);
		}
		if (preferences || this.waterDetail == null) {
			this.waterDetail = new PreferencesWaterDetail(this);
		}
		if (preferences || this.windowMode == null) {
			this.windowMode = new PreferencesMaxScreenSize(this);
		}
		if (preferences || this.maxScreenSize2 == null) {
			this.maxScreenSize2 = new PreferencesMaxScreenSize(this.windowMode.getValue(), this);
		}
		if (preferences || this.unused4 == null) {
			this.unused4 = new PreferencesUnused4(this);
		}
		if (preferences || this.unused1 == null) {
			this.unused1 = new PreferencesUnused1(this);
		}
		if (preferences || this.unused2 == null) {
			this.unused2 = new PreferencesUnused2(this);
		}
		if (preferences || this.unused3 == null) {
			this.unused3 = new PreferencesUnused3(this);
		}
		if (preferences || this.unused5 == null) {
			this.unused5 = new PreferencesUnused5(this);
		}
		if (preferences || this.unused6 == null) {
			this.unused6 = new PreferencesUnused6(this);
		}
		if (preferences || this.unused7 == null) {
			this.unused7 = new PreferencesUnused7(this);
		}
		if (preferences || this.unused8 == null) {
			this.unused8 = new PreferencesUnused8(this);
		}
		if (preferences || this.unused9 == null) {
			this.unused9 = new PreferencesUnused9(this);
		}
		if (preferences || this.unused10 == null) {
			this.unused10 = new PreferencesUnused10(this);
		}
		if (preferences || this.unused11 == null) {
			this.unused11 = new PreferencesUnused11(this);
		}
		if (preferences || this.unused12 == null) {
			this.unused12 = new PreferencesUnused12(this);
		}
		if (preferences || this.customCursors == null) {
			this.customCursors = new PreferencesCustomCursors(this);
		}
		if (preferences || this.preset == null) {
			this.preset = new PreferencesPreset(this);
		}
		if (preferences || this.cpuUsage == null) {
			this.cpuUsage = new PreferencesCpuUsage(this);
		}
		if (preferences || this.loadingScreen == null) {
			this.loadingScreen = new PreferencesLoadingScreen(this);
		}
		if (preferences || this.safeMode == null) {
			this.safeMode = new PreferencesUnknown6(this);
		}
		if (preferences || this.unknown7 == null) {
			this.unknown7 = new PreferencesUnknown7(this);
		}
		if (preferences || this.unused13 == null) {
			this.unused13 = new PreferencesUnused13(this);
		}
		if (preferences || this.consoleKeyPress == null) {
			this.consoleKeyPress = new PreferencesUnknown8(this);
		}
		if (preferences || sounds || this.soundVolume == null) {
			this.soundVolume = new PreferencesVolume(this);
		}
		if (preferences || sounds || this.backgroundSoundVolume == null) {
			this.backgroundSoundVolume = new PreferencesVolume(this);
		}
		if (preferences || sounds || this.speechVolume == null) {
			this.speechVolume = new PreferencesVolume(this);
		}
		if (preferences || sounds || this.unknownVolume1 == null) {
			this.unknownVolume1 = new PreferencesVolume(this);
		}
		if (preferences || sounds || this.unknownVolume2 == null) {
			this.unknownVolume2 = new PreferencesVolume(this);
		}
		if (preferences || sounds || this.stereo == null) {
			this.stereo = new PreferencesStereo(this);
		}
	}

	@ObfuscatedName("ali.m(Lalw;IB)V")
	public void method18155(Packet buf, int version) {
		this.brightness = new PreferencesBrightness(buf.g1(), this);
		buf.pos++;
		this.removeRoofs = new PreferencesRemoveRoofs(buf.g1() + 1, this);
		this.groundDecoration = new PreferencesGroundDecoration(buf.g1(), this);
		buf.pos++;
		this.idleAnimations = new PreferencesIdleAnimations(buf.g1(), this);
		this.flickeringEffects = new PreferencesFlickeringEffects(buf.g1(), this);
		buf.g1();
		this.characterShadows = new PreferencesCharacterShadows(buf.g1(), this);
		int var3 = buf.g1();
		int var4 = 0;
		if (version >= 17) {
			var4 = buf.g1();
		}
		this.sceneryShadows = new PreferencesSceneryShadows(var3 > var4 ? var3 : var4, this);
		boolean var5 = true;
		boolean var6 = true;
		boolean var7;
		if (version >= 2) {
			var7 = buf.g1() == 1;
			if (version >= 17) {
				var6 = buf.g1() == 1;
			}
		} else {
			var7 = buf.g1() == 1;
			buf.g1();
		}
		this.lightingDetail = new PreferencesLightingDetail(var7 | var6 ? 1 : 0, this);
		this.waterDetail = new PreferencesWaterDetail(buf.g1(), this);
		this.fog = new PreferencesFog(buf.g1(), this);
		this.antiAliasing = new PreferencesAntiAliasing(buf.g1(), this);
		this.stereo = new PreferencesStereo(buf.g1(), this);
		this.soundVolume = new PreferencesVolume(buf.g1(), this);
		if (version >= 20) {
			this.speechVolume = new PreferencesVolume(buf.g1(), this);
		} else {
			this.speechVolume = new PreferencesVolume(this.soundVolume.getValue(), this);
		}
		this.unknownVolume1 = new PreferencesVolume(buf.g1(), this);
		this.backgroundSoundVolume = new PreferencesVolume(buf.g1(), this);
		if (version >= 21) {
			this.unknownVolume2 = new PreferencesVolume(buf.g1(), this);
		} else {
			this.unknownVolume2 = new PreferencesVolume(this.unknownVolume1.getValue(), this);
		}
		if (version >= 1) {
			buf.g2();
			buf.g2();
		}
		if (version >= 3 && version < 6) {
			buf.g1();
		}
		if (version >= 4) {
			this.particles = new PreferencesParticles(buf.g1(), this);
		}
		buf.g4s();
		if (version >= 6) {
			this.windowMode = new PreferencesMaxScreenSize(buf.g1(), this);
		}
		if (version >= 7) {
			this.safeMode = new PreferencesUnknown6(buf.g1(), this);
		}
		if (version >= 8) {
			buf.g1();
		}
		if (version >= 9) {
			this.buildArea = new PreferencesBuildArea(buf.g1(), this);
		}
		if (version >= 10) {
			this.bloom = new PreferencesBloom(buf.g1(), this);
		}
		if (version >= 11) {
			this.customCursors = new PreferencesCustomCursors(buf.g1(), this);
		}
		if (version >= 12) {
			this.idleAnimations = new PreferencesIdleAnimations(buf.g1(), this);
		}
		if (version >= 13) {
			this.groundBlending = new PreferencesGroundBlending(buf.g1(), this);
		}
		if (version >= 14) {
			this.toolkit = new PreferencesDisplayMode(buf.g1(), this);
		}
		if (version >= 15) {
			this.cpuUsage = new PreferencesCpuUsage(buf.g1(), this);
		}
		if (version >= 16) {
			this.textures = new PreferencesTextures(buf.g1(), this);
		}
		if (version >= 18) {
			this.preset = new PreferencesPreset(buf.g1(), this);
		}
		if (version >= 19) {
			this.screenSize = new PreferencesScreenSize(buf.g1(), this);
		}
		if (version >= 22) {
			this.loadingScreen = new PreferencesLoadingScreen(buf.g1(), this);
		}
	}

	@ObfuscatedName("ali.k(I)Lalw;")
	public Packet createPreferencesBlock() {
		Packet buf = new Packet(59);
		buf.p1(38);
		buf.p1(this.animDetail.getValue());
		buf.p1(this.antiAliasing.getValue());
		buf.p1(this.unused.getValue());
		buf.p1(this.bloom.getValue());
		buf.p1(this.brightness.getValue());
		buf.p1(this.buildArea.getValue());
		buf.p1(this.drawDistance.getValue());
		buf.p1(this.flickeringEffects.getValue());
		buf.p1(this.fog.getValue());
		buf.p1(this.groundBlending.getValue());
		buf.p1(this.groundDecoration.getValue());
		buf.p1(this.idleAnimations.getValue());
		buf.p1(this.lightingDetail.getValue());
		buf.p1(this.sceneryShadows.getValue());
		buf.p1(this.shadowQuality.getValue());
		buf.p1(0);
		buf.p1(this.orthographic.getValue());
		buf.p1(this.particles.getValue());
		buf.p1(this.removeRoofs.getValue());
		buf.p1(this.screenSize.getValue());
		buf.p1(this.skyboxes.getValue());
		buf.p1(this.characterShadows.getValue());
		buf.p1(this.textures.getValue());
		buf.p1(this.toolkit.getValue());
		buf.p1(0);
		buf.p1(this.waterDetail.getValue());
		buf.p1(this.windowMode.getValue());
		buf.p1(this.unused1.getValue());
		buf.p1(this.unused2.getValue());
		buf.p1(this.unused3.getValue());
		buf.p1(this.unused4.getValue());
		buf.p1(this.unused5.getValue());
		buf.p1(this.unused6.getValue());
		buf.p1(this.unused7.getValue());
		buf.p1(this.unused8.getValue());
		buf.p2(this.unused9.getValue());
		buf.p2(this.unused10.getValue());
		buf.p2(this.unused11.getValue());
		buf.p2(this.unused12.getValue());
		buf.p1(this.customCursors.getValue());
		buf.p1(this.preset.getValue());
		buf.p1(this.cpuUsage.getValue());
		buf.p1(this.loadingScreen.getValue());
		buf.p1(this.safeMode.getValue());
		buf.p1(this.unknown7.getValue());
		buf.p1(this.unused13.getValue());
		buf.p1(this.consoleKeyPress.getValue());
		buf.p1(this.soundVolume.getValue());
		buf.p1(this.backgroundSoundVolume.getValue());
		buf.p1(this.speechVolume.getValue());
		buf.p1(this.unknownVolume1.getValue());
		buf.p1(this.unknownVolume2.getValue());
		buf.p1(this.stereo.getValue());
		return buf;
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
