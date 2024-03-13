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
	public PreferencesUnknown0 unknown;

	@ObfuscatedName("ali.d")
	public PreferencesUnknown1 unknown1;

	@ObfuscatedName("ali.c")
	public PreferencesUnknown1 unknown2;

	@ObfuscatedName("ali.r")
	public PreferencesUnused0 unused;

	@ObfuscatedName("ali.v")
	public PreferencesBloom bloom;

	@ObfuscatedName("ali.o")
	public PreferencesBrightness brightness;

	@ObfuscatedName("ali.s")
	public PreferencesBuildArea buildArea;

	@ObfuscatedName("ali.y")
	public PreferencesUnknown8 unknown8;

	@ObfuscatedName("ali.q")
	public PreferencesBuildAreaSize buildAreaSize;

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
	public PreferencesUnknown3 unknown3;

	@ObfuscatedName("ali.ae")
	public PreferencesUnknown4 unknown4;

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
	public PreferencesDisplayMode displayMode;

	@ObfuscatedName("ali.ad")
	public PreferencesDisplayMode displayMode2;

	@ObfuscatedName("ali.am")
	public PreferencesWaterDetail waterDetail;

	@ObfuscatedName("ali.au")
	public PreferencesMaxScreenSize maxScreenSize;

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
	public PreferencesUnknown5 unknown5;

	@ObfuscatedName("ali.bh")
	public PreferencesUnknown6 unknown6;

	@ObfuscatedName("ali.bx")
	public PreferencesUnknown7 unknown7;

	@ObfuscatedName("ali.bd")
	public PreferencesUnused13 unused13;

	@ObfuscatedName("ali.bc")
	public PreferencesThemeMusicVolume themeMusicVolume;

	@ObfuscatedName("ali.bi")
	public PreferencesThemeMusicVolume themeMusicVolume1;

	@ObfuscatedName("ali.bn")
	public PreferencesThemeMusicVolume themeMusicVolume2;

	@ObfuscatedName("ali.bt")
	public PreferencesThemeMusicVolume themeMusicVolume3;

	@ObfuscatedName("ali.bq")
	public PreferencesThemeMusicVolume themeMusicVolume4;

	@ObfuscatedName("ali.bm")
	public PreferencesUnknown9 unknown9;

	public ClientOptions(ModeGame arg0, int arg1) {
		this.modeGame = arg0;
		this.hardwareInfo = new PreferencesHardwareInfo(GameShell.maxmemory, GameShell.cpucount, GameShell.osArchRaw.toLowerCase().indexOf("arm") != -1, GameShell.osName.startsWith("win"), false);
		this.displayMode2 = new PreferencesDisplayMode(arg1, this);
		this.method18154(true, true);
	}

	public ClientOptions(Packet arg0, ModeGame arg1, int arg2) {
		this.modeGame = arg1;
		this.hardwareInfo = new PreferencesHardwareInfo(GameShell.maxmemory, GameShell.cpucount, GameShell.osArchRaw.indexOf("arm") != -1, GameShell.osName.startsWith("win"), false);
		this.displayMode2 = new PreferencesDisplayMode(arg2, this);
		this.method18163(arg0);
	}

	@ObfuscatedName("ali.e(Lalw;B)V")
	public void method18163(Packet arg0) {
		if (arg0 == null || arg0.data == null) {
			this.method18154(true, true);
		} else {
			int var2 = arg0.g1();
			if (var2 < 23) {
				try {
					this.method18155(arg0, var2);
				} catch (Exception var4) {
					this.method18154(true, true);
				}
				this.method18154(false, true);
			} else if (var2 > 38) {
				this.method18154(true, true);
			} else {
				if (var2 >= 29) {
					this.unknown = new PreferencesUnknown0(arg0.g1(), this);
				}
				this.unknown1 = new PreferencesUnknown1(arg0.g1(), this);
				if (var2 >= 31) {
					this.unused = new PreferencesUnused0(arg0.g1(), this);
				}
				this.unknown2 = new PreferencesUnknown1(this.unknown1.method18639(), this);
				this.bloom = new PreferencesBloom(arg0.g1(), this);
				this.brightness = new PreferencesBrightness(arg0.g1(), this);
				this.buildArea = new PreferencesBuildArea(arg0.g1(), this);
				if (var2 >= 27) {
					this.buildAreaSize = new PreferencesBuildAreaSize(arg0.g1(), this);
				}
				this.flickeringEffects = new PreferencesFlickeringEffects(arg0.g1(), this);
				this.fog = new PreferencesFog(arg0.g1(), this);
				this.groundBlending = new PreferencesGroundBlending(arg0.g1(), this);
				this.groundDecoration = new PreferencesGroundDecoration(arg0.g1(), this);
				this.idleAnimations = new PreferencesIdleAnimations(arg0.g1(), this);
				this.lightingDetail = new PreferencesLightingDetail(arg0.g1(), this);
				this.sceneryShadows = new PreferencesSceneryShadows(arg0.g1(), this);
				if (var2 >= 33) {
					this.unknown3 = new PreferencesUnknown3(arg0.g1(), this);
				}
				if (var2 >= 34) {
					arg0.g1();
				}
				if (var2 >= 24) {
					this.unknown4 = new PreferencesUnknown4(arg0.g1(), this);
				}
				this.particles = new PreferencesParticles(arg0.g1(), this);
				this.removeRoofs = new PreferencesRemoveRoofs(arg0.g1(), this);
				this.removeRoofs2 = new PreferencesRemoveRoofs(this.removeRoofs.method18496(), this);
				this.screenSize = new PreferencesScreenSize(arg0.g1(), this);
				if (var2 >= 25) {
					this.skyboxes = new PreferencesSkyboxes(arg0.g1(), this);
				}
				this.characterShadows = new PreferencesCharacterShadows(arg0.g1(), this);
				if (var2 <= 25) {
					arg0.pos++;
				}
				this.textures = new PreferencesTextures(arg0.g1(), this);
				this.displayMode = new PreferencesDisplayMode(arg0.g1(), this);
				this.displayMode2 = new PreferencesDisplayMode(this.displayMode.method18545(), this);
				arg0.g1();
				this.waterDetail = new PreferencesWaterDetail(arg0.g1(), this);
				this.maxScreenSize = new PreferencesMaxScreenSize(arg0.g1(), this);
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
				this.maxScreenSize2 = new PreferencesMaxScreenSize(this.maxScreenSize.method18539(), this);
				this.customCursors = new PreferencesCustomCursors(arg0.g1(), this);
				this.preset = new PreferencesPreset(arg0.g1(), this);
				this.cpuUsage = new PreferencesCpuUsage(arg0.g1(), this);
				this.unknown5 = new PreferencesUnknown5(arg0.g1(), this);
				this.unknown6 = new PreferencesUnknown6(arg0.g1(), this);
				if (var2 >= 26) {
					this.unknown7 = new PreferencesUnknown7(arg0.g1(), this);
				}
				if (var2 >= 28) {
					this.unused13 = new PreferencesUnused13(arg0.g1(), this);
				}
				if (var2 >= 30) {
					this.unknown8 = new PreferencesUnknown8(arg0.g1(), this);
				}
				this.themeMusicVolume = new PreferencesThemeMusicVolume(arg0.g1(), this);
				this.themeMusicVolume1 = new PreferencesThemeMusicVolume(arg0.g1(), this);
				this.themeMusicVolume2 = new PreferencesThemeMusicVolume(arg0.g1(), this);
				this.themeMusicVolume3 = new PreferencesThemeMusicVolume(arg0.g1(), this);
				this.themeMusicVolume4 = new PreferencesThemeMusicVolume(arg0.g1(), this);
				this.unknown9 = new PreferencesUnknown9(arg0.g1(), this);
				this.method18154(false, var2 < 32);
			}
		}
		this.method18179();
	}

	@ObfuscatedName("ali.n(ZZB)V")
	public void method18154(boolean arg0, boolean arg1) {
		if (arg0 || this.unknown == null) {
			this.unknown = new PreferencesUnknown0(this);
		}
		if (arg0 || this.unknown1 == null) {
			this.unknown1 = new PreferencesUnknown1(this);
		}
		if (arg0 || this.unused == null) {
			this.unused = new PreferencesUnused0(this);
		}
		if (arg0 || this.unknown2 == null) {
			this.unknown2 = new PreferencesUnknown1(this.unknown1.method18639(), this);
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
		if (arg0 || this.buildAreaSize == null) {
			this.buildAreaSize = new PreferencesBuildAreaSize(this);
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
		if (arg0 || this.unknown3 == null) {
			this.unknown3 = new PreferencesUnknown3(this);
		}
		if (arg0 || this.unknown4 == null) {
			this.unknown4 = new PreferencesUnknown4(this);
		}
		if (arg0 || this.particles == null) {
			this.particles = new PreferencesParticles(this);
		}
		if (arg0 || this.removeRoofs == null) {
			this.removeRoofs = new PreferencesRemoveRoofs(this);
		}
		if (arg0 || this.removeRoofs2 == null) {
			this.removeRoofs2 = new PreferencesRemoveRoofs(this.removeRoofs.method18496(), this);
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
		if (arg0 || this.displayMode == null) {
			this.displayMode = new PreferencesDisplayMode(this);
		}
		if (arg0 || this.displayMode2 == null) {
			this.displayMode2 = new PreferencesDisplayMode(this.displayMode.method18545(), this);
		}
		if (arg0 || this.waterDetail == null) {
			this.waterDetail = new PreferencesWaterDetail(this);
		}
		if (arg0 || this.maxScreenSize == null) {
			this.maxScreenSize = new PreferencesMaxScreenSize(this);
		}
		if (arg0 || this.maxScreenSize2 == null) {
			this.maxScreenSize2 = new PreferencesMaxScreenSize(this.maxScreenSize.method18539(), this);
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
		if (arg0 || this.unknown5 == null) {
			this.unknown5 = new PreferencesUnknown5(this);
		}
		if (arg0 || this.unknown6 == null) {
			this.unknown6 = new PreferencesUnknown6(this);
		}
		if (arg0 || this.unknown7 == null) {
			this.unknown7 = new PreferencesUnknown7(this);
		}
		if (arg0 || this.unused13 == null) {
			this.unused13 = new PreferencesUnused13(this);
		}
		if (arg0 || this.unknown8 == null) {
			this.unknown8 = new PreferencesUnknown8(this);
		}
		if (arg0 || arg1 || this.themeMusicVolume == null) {
			this.themeMusicVolume = new PreferencesThemeMusicVolume(this);
		}
		if (arg0 || arg1 || this.themeMusicVolume1 == null) {
			this.themeMusicVolume1 = new PreferencesThemeMusicVolume(this);
		}
		if (arg0 || arg1 || this.themeMusicVolume2 == null) {
			this.themeMusicVolume2 = new PreferencesThemeMusicVolume(this);
		}
		if (arg0 || arg1 || this.themeMusicVolume3 == null) {
			this.themeMusicVolume3 = new PreferencesThemeMusicVolume(this);
		}
		if (arg0 || arg1 || this.themeMusicVolume4 == null) {
			this.themeMusicVolume4 = new PreferencesThemeMusicVolume(this);
		}
		if (arg0 || arg1 || this.unknown9 == null) {
			this.unknown9 = new PreferencesUnknown9(this);
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
		this.unknown1 = new PreferencesUnknown1(arg0.g1(), this);
		this.unknown9 = new PreferencesUnknown9(arg0.g1(), this);
		this.themeMusicVolume = new PreferencesThemeMusicVolume(arg0.g1(), this);
		if (arg1 >= 20) {
			this.themeMusicVolume2 = new PreferencesThemeMusicVolume(arg0.g1(), this);
		} else {
			this.themeMusicVolume2 = new PreferencesThemeMusicVolume(this.themeMusicVolume.method18763(), this);
		}
		this.themeMusicVolume3 = new PreferencesThemeMusicVolume(arg0.g1(), this);
		this.themeMusicVolume1 = new PreferencesThemeMusicVolume(arg0.g1(), this);
		if (arg1 >= 21) {
			this.themeMusicVolume4 = new PreferencesThemeMusicVolume(arg0.g1(), this);
		} else {
			this.themeMusicVolume4 = new PreferencesThemeMusicVolume(this.themeMusicVolume3.method18763(), this);
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
			this.maxScreenSize = new PreferencesMaxScreenSize(arg0.g1(), this);
		}
		if (arg1 >= 7) {
			this.unknown6 = new PreferencesUnknown6(arg0.g1(), this);
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
			this.displayMode = new PreferencesDisplayMode(arg0.g1(), this);
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
			this.unknown5 = new PreferencesUnknown5(arg0.g1(), this);
		}
	}

	@ObfuscatedName("ali.k(I)Lalw;")
	public Packet method18156() {
		Packet var1 = new Packet(59);
		var1.p1(38);
		var1.p1(this.unknown.method18665());
		var1.p1(this.unknown1.method18639());
		var1.p1(this.unused.method18695());
		var1.p1(this.bloom.method18625());
		var1.p1(this.brightness.method18408());
		var1.p1(this.buildArea.method18570());
		var1.p1(this.buildAreaSize.method18688());
		var1.p1(this.flickeringEffects.method18419());
		var1.p1(this.fog.method18434());
		var1.p1(this.groundBlending.method18651());
		var1.p1(this.groundDecoration.method18489());
		var1.p1(this.idleAnimations.method18645());
		var1.p1(this.lightingDetail.method18389());
		var1.p1(this.sceneryShadows.method18515());
		var1.p1(this.unknown3.method18458());
		var1.p1(0);
		var1.p1(this.unknown4.method18504());
		var1.p1(this.particles.method18468());
		var1.p1(this.removeRoofs.method18496());
		var1.p1(this.screenSize.method18581());
		var1.p1(this.skyboxes.method18607());
		var1.p1(this.characterShadows.method18453());
		var1.p1(this.textures.method18426());
		var1.p1(this.displayMode.method18545());
		var1.p1(0);
		var1.p1(this.waterDetail.method18522());
		var1.p1(this.maxScreenSize.method18539());
		var1.p1(this.unused1.method18601());
		var1.p1(this.unused2.method18533());
		var1.p1(this.unused3.method18498());
		var1.p1(this.unused4.method18400());
		var1.p1(this.unused5.method18594());
		var1.p1(this.unused6.method18588());
		var1.p1(this.unused7.method18676());
		var1.p1(this.unused8.method18559());
		var1.p2(this.unused9.method18633());
		var1.p2(this.unused10.method18482());
		var1.p2(this.unused11.method18391());
		var1.p2(this.unused12.method18621());
		var1.p1(this.customCursors.method18771());
		var1.p1(this.preset.method18721());
		var1.p1(this.cpuUsage.method18735());
		var1.p1(this.unknown5.method18714());
		var1.p1(this.unknown6.method18740());
		var1.p1(this.unknown7.method18750());
		var1.p1(this.unused13.method18707());
		var1.p1(this.unknown8.method18701());
		var1.p1(this.themeMusicVolume.method18763());
		var1.p1(this.themeMusicVolume1.method18763());
		var1.p1(this.themeMusicVolume2.method18763());
		var1.p1(this.themeMusicVolume3.method18763());
		var1.p1(this.themeMusicVolume4.method18763());
		var1.p1(this.unknown9.method18758());
		return var1;
	}

	@ObfuscatedName("ali.f(Lzf;IB)V")
	public void method18157(PreferencesOption arg0, int arg1) {
		arg0.method14071(arg1);
		this.method18179();
	}

	@ObfuscatedName("ali.w(Lamd;ZI)V")
	public void method18177(PreferencesDisplayMode arg0, boolean arg1) {
		arg0.method18544(arg1);
		this.method18179();
	}

	@ObfuscatedName("ali.l(I)V")
	public void method18179() {
		this.unknown.method18663();
		this.unknown1.method18637();
		this.unused.method18694();
		this.unknown2.method18637();
		this.bloom.method18626();
		this.brightness.method18416();
		this.buildArea.method18568();
		this.buildAreaSize.method18687();
		this.flickeringEffects.method18418();
		this.fog.method18430();
		this.groundBlending.method18653();
		this.groundDecoration.method18490();
		this.idleAnimations.method18643();
		this.lightingDetail.method18390();
		this.sceneryShadows.method18513();
		this.unknown3.method18455();
		this.unknown4.method18510();
		this.particles.method18465();
		this.removeRoofs.method18495();
		this.removeRoofs2.method18495();
		this.screenSize.method18579();
		this.skyboxes.method18608();
		this.characterShadows.method18446();
		this.textures.method18423();
		this.displayMode.method18549();
		this.displayMode2.method18549();
		this.waterDetail.method18523();
		this.maxScreenSize.method18536();
		this.maxScreenSize2.method18536();
		this.unused4.method18401();
		this.unused1.method18600();
		this.unused2.method18532();
		this.unused3.method18497();
		this.unused5.method18595();
		this.unused6.method18592();
		this.unused7.method18675();
		this.unused8.method18558();
		this.unused9.method18631();
		this.unused10.method18480();
		this.unused11.method18393();
		this.unused12.method18622();
		this.customCursors.method18770();
		this.preset.method18720();
		this.cpuUsage.method18729();
		this.unknown5.method18713();
		this.unknown6.method18739();
		this.unknown7.method18749();
		this.unused13.method18706();
		this.unknown8.method18700();
		this.themeMusicVolume.method18762();
		this.themeMusicVolume1.method18762();
		this.themeMusicVolume2.method18762();
		this.themeMusicVolume3.method18762();
		this.themeMusicVolume4.method18762();
		this.unknown9.method18757();
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
