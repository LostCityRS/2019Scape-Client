package com.jagex.game.world.entity;

import com.jagex.audio.api.SubBussType;
import com.jagex.audio.stream.*;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.cutscene.CutsceneManager;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.NpcEntity;

@ObfuscatedName("akc")
public class PositionedSound extends Node {

	@ObfuscatedName("akc.f")
	public static LinkList field11346 = new LinkList();

	@ObfuscatedName("akc.w")
	public static LinkList field11347 = new LinkList();

	@ObfuscatedName("akc.l")
	public static HashTable field11366 = new HashTable(16);

	@ObfuscatedName("akc.u")
	public int level;

	@ObfuscatedName("akc.z")
	public int maxX;

	@ObfuscatedName("akc.p")
	public int minX;

	@ObfuscatedName("akc.d")
	public int minZ;

	@ObfuscatedName("akc.c")
	public int maxZ;

	@ObfuscatedName("akc.r")
	public Vector3 field11350 = new Vector3(0.0F, 0.0F, 0.0F);

	@ObfuscatedName("akc.v")
	public Vector3 field11355 = new Vector3(0.0F, 0.0F, 0.0F);

	@ObfuscatedName("akc.o")
	public int size;

	@ObfuscatedName("akc.s")
	public int range;

	@ObfuscatedName("akc.y")
	public int volume;

	@ObfuscatedName("akc.q")
	public LocType loc;

	@ObfuscatedName("akc.x")
	public NpcEntity npc;

	@ObfuscatedName("akc.b")
	public PlayerEntity player;

	@ObfuscatedName("akc.j")
	public int field11360 = 0;

	@ObfuscatedName("akc.t")
	public boolean multisound;

	@ObfuscatedName("akc.ae")
	public int minrate;

	@ObfuscatedName("akc.ag")
	public int maxrate;

	@ObfuscatedName("akc.ah")
	public int sound;

	@ObfuscatedName("akc.al")
	public Sound field11371;

	@ObfuscatedName("akc.ac")
	public Sound field11372;

	@ObfuscatedName("akc.ai")
	public int mindelay;

	@ObfuscatedName("akc.aw")
	public int maxdelay;

	@ObfuscatedName("akc.as")
	public int[] random;

	@ObfuscatedName("akc.at")
	public int delay;

	@ObfuscatedName("zj.e(ZB)V")
	public static void method13908(boolean arg0) {
		for (PositionedSound var1 = (PositionedSound) field11346.head(); var1 != null; var1 = (PositionedSound) field11346.next()) {
			if (var1.field11371 != null) {
				var1.field11371.method7380(150);
				Client.audioApi.play(var1.field11371);
				var1.field11371 = null;
			}
			if (var1.field11372 != null) {
				var1.field11372.method7380(150);
				Client.audioApi.play(var1.field11372);
				var1.field11372 = null;
			}
			var1.unlink();
		}
		if (!arg0) {
			return;
		}
		for (PositionedSound var2 = (PositionedSound) field11347.head(); var2 != null; var2 = (PositionedSound) field11347.next()) {
			if (var2.field11371 != null) {
				var2.field11371.method7380(150);
				Client.audioApi.play(var2.field11371);
				var2.field11371 = null;
			}
			var2.unlink();
		}
		for (PositionedSound var3 = (PositionedSound) field11366.head(); var3 != null; var3 = (PositionedSound) field11366.next()) {
			if (var3.field11371 != null) {
				var3.field11371.method7380(150);
				Client.audioApi.play(var3.field11371);
				var3.field11371 = null;
			}
			var3.unlink();
		}
	}

	@ObfuscatedName("ada.n(I)V")
	public static void method15185() {
		for (PositionedSound var0 = (PositionedSound) field11346.head(); var0 != null; var0 = (PositionedSound) field11346.next()) {
			if (var0.multisound) {
				var0.method17660();
			}
		}
		for (PositionedSound var1 = (PositionedSound) field11347.head(); var1 != null; var1 = (PositionedSound) field11347.next()) {
			if (var1.multisound) {
				var1.method17660();
			}
		}
	}

	@ObfuscatedName("akc.m(B)V")
	public void method17660() {
		int var1 = this.sound;
		if (this.loc != null) {
			LocType var2 = this.loc.getMultiLoc(Client.localPlayerGameState, Client.sceneState == 0 ? CutsceneManager.field1723 : Client.localPlayerGameState);
			if (var2 == null) {
				this.sound = -1;
				this.range = 0;
				this.volume = 0;
				this.mindelay = 0;
				this.maxdelay = 0;
				this.random = null;
				this.maxrate = 256;
				this.minrate = 256;
				this.size = 0;
			} else {
				this.sound = var2.bgsound_sound;
				this.range = var2.bgsound_range << 9;
				this.volume = var2.bgsound_volume;
				this.mindelay = var2.bgsound_mindelay;
				this.maxdelay = var2.bgsound_maxdelay;
				this.random = var2.bgsound_random;
				this.maxrate = var2.bgsound_maxrate;
				this.minrate = var2.bgsound_minrate;
			}
		} else if (this.npc != null) {
			int var3 = getNpcSound(this.npc);
			if (var1 != var3) {
				this.sound = var3;
				NPCType var4 = this.npc.npcType;
				if (var4.multinpc != null) {
					var4 = var4.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
				}
				if (var4 == null) {
					this.size = 0;
					this.range = 0;
					this.volume = 0;
					this.maxrate = 256;
					this.minrate = 256;
				} else {
					this.range = var4.bgsound_range << 9;
					this.size = var4.bgsound_size << 9;
					this.volume = var4.bgsound_volume;
					this.maxrate = var4.bgsound_maxrate;
					this.minrate = var4.bgsound_minrate;
				}
			}
		} else if (this.player != null) {
			this.sound = getPlayerSound(this.player);
			this.range = this.player.bgsound_range << 9;
			this.size = 0;
			this.volume = this.player.bgsound_volume;
			this.maxrate = 256;
			this.minrate = 256;
		}
		if (this.sound != var1 && this.field11371 != null && this.field11371 != null) {
			this.field11371.method7380(100);
			Client.audioApi.play(this.field11371);
			this.field11371 = null;
		}
	}

	@ObfuscatedName("wp.k(IIIILvd;Laqc;Laqk;I)V")
	public static void method9739(int level, int x, int z, int arg3, LocType loc, NpcEntity npc, PlayerEntity player) {
		PositionedSound sound = new PositionedSound();
		sound.level = level;
		sound.minX = x << 9;
		sound.minZ = z << 9;
		if (loc != null) {
			sound.loc = loc;
			int width = loc.width;
			int length = loc.length;
			if (arg3 == 1 || arg3 == 3) {
				width = loc.length;
				length = loc.width;
			}
			sound.maxX = x + width << 9;
			sound.maxZ = z + length << 9;
			sound.sound = loc.bgsound_sound;
			sound.range = loc.bgsound_range << 9;
			sound.volume = loc.bgsound_volume;
			sound.mindelay = loc.bgsound_mindelay;
			sound.maxdelay = loc.bgsound_maxdelay;
			sound.random = loc.bgsound_random;
			sound.maxrate = loc.bgsound_maxrate;
			sound.minrate = loc.bgsound_minrate;
			sound.size = loc.bgsound_size << 9;
			if (loc.multiloc != null) {
				sound.multisound = true;
				sound.method17660();
			}
			if (sound.random != null) {
				sound.delay = sound.mindelay + (int) (Math.random() * (double) (sound.maxdelay - sound.mindelay));
			}
			field11346.addTail(sound);
			Client.audioApi.preloadSounds(sound.sound);
			Client.audioApi.loadSounds(sound.random);
		} else if (npc != null) {
			sound.npc = npc;
			NPCType npcType = npc.npcType;
			if (npcType.multinpc != null) {
				sound.multisound = true;
				npcType = npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			}
			if (npcType != null) {
				sound.maxX = npcType.size + x << 9;
				sound.maxZ = npcType.size + z << 9;
				sound.sound = getNpcSound(npc);
				sound.range = npcType.bgsound_range << 9;
				sound.volume = npcType.bgsound_volume;
				sound.maxrate = npcType.bgsound_maxrate;
				sound.minrate = npcType.bgsound_minrate;
				sound.size = npcType.bgsound_size << 9;
				Client.audioApi.preloadSounds(npcType.bgsound);
				Client.audioApi.preloadSounds(npcType.bgsound_crawl);
				Client.audioApi.preloadSounds(npcType.bgsound_walk);
				Client.audioApi.preloadSounds(npcType.bgsound_run);
			}
			field11347.addTail(sound);
		} else if (player != null) {
			sound.player = player;
			sound.maxX = x + player.size() << 9;
			sound.maxZ = z + player.size() << 9;
			sound.sound = getPlayerSound(player);
			sound.range = player.bgsound_range << 9;
			sound.volume = player.bgsound_volume;
			sound.maxrate = 256;
			sound.minrate = 256;
			sound.size = 0;
			field11366.put(sound, (long) player.localPlayerIndex);
			Client.audioApi.preloadSounds(player.bgsound_player);
			Client.audioApi.preloadSounds(player.bgsound_crawl_player);
			Client.audioApi.preloadSounds(player.bgsound_walk_player);
			Client.audioApi.preloadSounds(player.bgsound_run_player);
		}
	}

	@ObfuscatedName("oi.f(IIILvd;B)V")
	public static void method6206(int arg0, int arg1, int arg2, LocType arg3) {
		for (PositionedSound var4 = (PositionedSound) field11346.head(); var4 != null; var4 = (PositionedSound) field11346.next()) {
			if (var4.level == arg0 && arg1 << 9 == var4.minX && arg2 << 9 == var4.minZ && var4.loc.id == arg3.id) {
				if (var4.field11371 != null) {
					var4.field11371.method7380(100);
					Client.audioApi.play(var4.field11371);
					var4.field11371 = null;
				}
				var4.unlink();
				return;
			}
		}
	}

	@ObfuscatedName("xn.w(Laqc;I)V")
	public static void method10111(NpcEntity arg0) {
		for (PositionedSound var1 = (PositionedSound) field11347.head(); var1 != null; var1 = (PositionedSound) field11347.next()) {
			if (var1.npc == arg0) {
				if (var1.field11371 != null) {
					var1.field11371.method7380(100);
					Client.audioApi.play(var1.field11371);
					var1.field11371 = null;
				}
				var1.unlink();
				return;
			}
		}
	}

	@ObfuscatedName("kg.l(Laqk;I)V")
	public static void method5142(PlayerEntity arg0) {
		PositionedSound var1 = (PositionedSound) field11366.get((long) arg0.localPlayerIndex);
		if (var1 == null) {
			return;
		}
		if (var1.field11371 != null) {
			var1.field11371.method7380(100);
			Client.audioApi.play(var1.field11371);
			var1.field11371 = null;
		}
		var1.unlink();
	}

	@ObfuscatedName("xj.u(Laqk;I)V")
	public static void method10310(PlayerEntity arg0) {
		PositionedSound var1 = (PositionedSound) field11366.get((long) arg0.localPlayerIndex);
		if (var1 == null) {
			method9739(arg0.level, arg0.routeWaypointX[0], arg0.routeWaypointZ[0], 0, null, null, arg0);
		} else {
			var1.method17660();
		}
	}

	@ObfuscatedName("t.z(Laqc;I)I")
	public static int getNpcSound(NpcEntity npc) {
		NPCType npcType = npc.npcType;
		if (npcType.multinpc != null) {
			npcType = npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			if (npcType == null) {
				return -1;
			}
		}
		int sound = npcType.bgsound_walk;
		BASType var3 = npc.getBASType();
		int var4 = npc.field10432.getSeqTypeId();
		if (var4 == -1 || npc.field10432.field11877) {
			sound = npcType.bgsound;
		} else if (var3.runanim == var4 || var3.runanim_b == var4 || var3.runanim_r == var4 || var3.runanim_l == var4) {
			sound = npcType.bgsound_run;
		} else if (var3.crawlanim == var4 || var3.crawlanim_b == var4 || var3.crawlanim_r == var4 || var3.crawlanim_l == var4) {
			sound = npcType.bgsound_crawl;
		}
		return sound;
	}

	@ObfuscatedName("ags.p(Laqk;I)I")
	public static int getPlayerSound(PlayerEntity player) {
		int sound = player.bgsound_walk_player;
		BASType bas = player.getBASType();
		int var3 = player.field10432.getSeqTypeId();
		if (var3 == -1 || player.field10432.field11877) {
			sound = player.bgsound_player;
		} else if (bas.runanim == var3 || bas.runanim_b == var3 || bas.runanim_r == var3 || bas.runanim_l == var3) {
			sound = player.bgsound_run_player;
		} else if (bas.crawlanim == var3 || bas.crawlanim_b == var3 || bas.crawlanim_r == var3 || bas.crawlanim_l == var3) {
			sound = player.bgsound_crawl_player;
		}
		return sound;
	}

	@ObfuscatedName("agz.d(IIIII)V")
	public static void method16460(int arg0, int arg1, int arg2, int arg3) {
		for (PositionedSound var4 = (PositionedSound) field11346.head(); var4 != null; var4 = (PositionedSound) field11346.next()) {
			method7896(var4, arg0, arg1, arg2, arg3);
		}
		for (PositionedSound var5 = (PositionedSound) field11347.head(); var5 != null; var5 = (PositionedSound) field11347.next()) {
			byte var6 = 1;
			BASType var7 = var5.npc.getBASType();
			int var8 = var5.npc.field10432.getSeqTypeId();
			if (var8 == -1 || var5.npc.field10432.field11877) {
				var6 = 0;
			} else if (var7.runanim == var8 || var7.runanim_b == var8 || var7.runanim_r == var8 || var7.runanim_l == var8) {
				var6 = 2;
			} else if (var7.crawlanim == var8 || var7.crawlanim_b == var8 || var7.crawlanim_r == var8 || var7.crawlanim_l == var8) {
				var6 = 3;
			}
			if (var5.field11360 != var6) {
				int var9 = getNpcSound(var5.npc);
				NPCType var10 = var5.npc.npcType;
				if (var10.multinpc != null) {
					var10 = var10.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
				}
				if (var10 == null || var9 == -1) {
					var5.sound = -1;
					var5.field11360 = var6;
				} else if (var5.sound == var9) {
					var5.field11360 = var6;
					var5.volume = var10.bgsound_volume;
				} else {
					boolean var11 = false;
					if (var5.field11371 == null) {
						var11 = true;
					} else {
						var5.volume -= 512;
						if (var5.volume <= 0) {
							var5.field11371.method7380(100);
							Client.audioApi.play(var5.field11371);
							var5.field11371 = null;
							var11 = true;
						}
					}
					if (var11) {
						var5.volume = var10.bgsound_volume;
						var5.sound = var9;
						var5.field11360 = var6;
					}
				}
			}
			Vector3 var12 = var5.npc.getTransform().trans;
			var5.minX = (int) var12.x;
			var5.maxX = (int) var12.x + (var5.npc.size() << 8);
			var5.minZ = (int) var12.z;
			var5.maxZ = (int) var12.z + (var5.npc.size() << 8);
			var5.level = var5.npc.level;
			method7896(var5, arg0, arg1, arg2, arg3);
		}
		for (PositionedSound var13 = (PositionedSound) field11366.head(); var13 != null; var13 = (PositionedSound) field11366.next()) {
			byte var14 = 1;
			BASType var15 = var13.player.getBASType();
			int var16 = var13.player.field10432.getSeqTypeId();
			if (var16 == -1 || var13.player.field10432.field11877) {
				var14 = 0;
			} else if (var15.runanim == var16 || var15.runanim_b == var16 || var15.runanim_r == var16 || var15.runanim_l == var16) {
				var14 = 2;
			} else if (var15.crawlanim == var16 || var15.crawlanim_b == var16 || var15.crawlanim_r == var16 || var15.crawlanim_l == var16) {
				var14 = 3;
			}
			if (var13.field11360 != var14) {
				int var17 = getPlayerSound(var13.player);
				if (var13.sound == var17) {
					var13.volume = var13.player.bgsound_volume;
					var13.field11360 = var14;
				} else {
					boolean var18 = false;
					if (var13.field11371 == null) {
						var18 = true;
					} else {
						var13.volume -= 512;
						if (var13.volume <= 0) {
							var13.field11371.method7380(100);
							Client.audioApi.play(var13.field11371);
							var13.field11371 = null;
							var18 = true;
						}
					}
					if (var18) {
						var13.volume = var13.player.bgsound_volume;
						var13.sound = var17;
						var13.field11360 = var14;
					}
				}
			}
			Vector3 var19 = var13.player.getTransform().trans;
			var13.minX = (int) var19.x;
			var13.maxX = (int) var19.x + (var13.player.size() << 8);
			var13.minZ = (int) var19.z;
			var13.maxZ = (int) var19.z + (var13.player.size() << 8);
			var13.level = var13.player.level;
			method7896(var13, arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("rd.c(Lakc;IIIII)V")
	public static void method7896(PositionedSound arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0.sound == -1 && arg0.random == null) {
			return;
		}
		int var5 = arg0.volume;
		if (arg0.range != 0 && Client.preferences.backgroundSoundVolume.getValue() != 0 && arg0.level == arg1) {
			if (arg0.field11371 != null && (arg0.field11371.method7385() == SoundVolume.field4953 || arg0.field11371.method7385() == SoundVolume.field4947)) {
				Client.audioApi.play(arg0.field11371);
				arg0.field11371 = null;
			}
			if (arg0.field11371 != null) {
				int var10 = (int) ((float) (arg0.maxX - arg0.minX) * 0.5F + (float) arg0.minX);
				int var11 = (int) ((float) (arg0.maxZ - arg0.minZ) * 0.5F + (float) arg0.minZ);
				arg0.field11350.x = var10;
				arg0.field11350.z = var11;
			} else if (arg0.sound >= 0) {
				short var6 = 256;
				int var7 = (int) ((float) (arg0.maxX - arg0.minX) * 0.5F + (float) arg0.minX);
				int var8 = (int) ((float) (arg0.maxZ - arg0.minZ) * 0.5F + (float) arg0.minZ);
				arg0.field11350.x = var7;
				arg0.field11350.z = var8;
				arg0.field11371 = Client.audioApi.createSound(SoundType.field1821, arg0, arg0.sound, -1, 0, SubBussType.LOCATION_GENERIC_SUB.getId(), SoundShape.field1838, (float) arg0.size, (float) arg0.range, arg0.field11350, 0, var6, false);
				if (arg0.field11371 != null) {
					float var9 = (float) var5 / 255.0F;
					arg0.field11371.method7403(var9, 150);
					arg0.field11371.method7441();
				}
			}
			if (arg0.field11372 != null) {
				int var16 = (int) ((float) (arg0.maxX - arg0.minX) * 0.5F + (float) arg0.minX);
				int var17 = (int) ((float) (arg0.maxZ - arg0.minZ) * 0.5F + (float) arg0.minZ);
				arg0.field11355.x = var16;
				arg0.field11355.z = var17;
				if (arg0.field11372.method7385() == SoundVolume.field4953 || arg0.field11372.method7385() == SoundVolume.field4947) {
					Client.audioApi.play(arg0.field11372);
					arg0.field11372 = null;
				}
			} else if (arg0.random != null && (arg0.delay -= arg4) <= 0) {
				int var12 = arg0.maxrate == 256 && arg0.minrate == 256 ? 256 : (int) (Math.random() * (double) (arg0.maxrate - arg0.minrate)) + arg0.minrate;
				int var13 = (int) (Math.random() * (double) arg0.random.length);
				int var14 = (int) ((float) (arg0.maxX - arg0.minX) * 0.5F + (float) arg0.minX);
				int var15 = (int) ((float) (arg0.maxZ - arg0.minZ) * 0.5F + (float) arg0.minZ);
				arg0.field11355.x = var14;
				arg0.field11355.z = var15;
				arg0.field11372 = Client.audioApi.createSound(SoundType.field1822, arg0, arg0.random[var13], 0, var5, SubBussType.LOCATION_RANDOM_SUB.getId(), SoundShape.field1838, (float) arg0.size, (float) (arg0.range + arg0.size), arg0.field11355, 0, var12, false);
				if (arg0.field11372 != null) {
					arg0.field11372.method7441();
				}
				arg0.delay = arg0.mindelay + (int) (Math.random() * (double) (arg0.maxdelay - arg0.mindelay));
			}
		} else if (arg0.field11371 != null) {
			arg0.field11371.method7380(100);
			Client.audioApi.play(arg0.field11371);
			arg0.field11371 = null;
		}
	}
}
