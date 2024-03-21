package com.jagex.game.world.entity;

import com.jagex.audio.api.SubBussType;
import com.jagex.audio.stream.*;
import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.IterableQueue;
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
	public static IterableQueue field11346 = new IterableQueue();

	@ObfuscatedName("akc.w")
	public static IterableQueue field11347 = new IterableQueue();

	@ObfuscatedName("akc.l")
	public static IterableMap field11366 = new IterableMap(16);

	@ObfuscatedName("akc.u")
	public int field11349;

	@ObfuscatedName("akc.z")
	public int field11352;

	@ObfuscatedName("akc.p")
	public int field11358;

	@ObfuscatedName("akc.d")
	public int field11351;

	@ObfuscatedName("akc.c")
	public int field11353;

	@ObfuscatedName("akc.r")
	public Vector3 field11350 = new Vector3(0.0F, 0.0F, 0.0F);

	@ObfuscatedName("akc.v")
	public Vector3 field11355 = new Vector3(0.0F, 0.0F, 0.0F);

	@ObfuscatedName("akc.o")
	public int field11356;

	@ObfuscatedName("akc.s")
	public int field11357;

	@ObfuscatedName("akc.y")
	public int field11359;

	@ObfuscatedName("akc.q")
	public LocType field11348;

	@ObfuscatedName("akc.x")
	public NpcEntity field11345;

	@ObfuscatedName("akc.b")
	public PlayerEntity field11361;

	@ObfuscatedName("akc.j")
	public int field11360 = 0;

	@ObfuscatedName("akc.t")
	public boolean field11367;

	@ObfuscatedName("akc.ae")
	public int field11368;

	@ObfuscatedName("akc.ag")
	public int field11369;

	@ObfuscatedName("akc.ah")
	public int field11370;

	@ObfuscatedName("akc.al")
	public Sound field11371;

	@ObfuscatedName("akc.ac")
	public Sound field11372;

	@ObfuscatedName("akc.ai")
	public int field11373;

	@ObfuscatedName("akc.aw")
	public int field11374;

	@ObfuscatedName("akc.as")
	public int[] field11375;

	@ObfuscatedName("akc.at")
	public int field11354;

	@ObfuscatedName("zj.e(ZB)V")
	public static void method13908(boolean arg0) {
		for (PositionedSound var1 = (PositionedSound) field11346.peekFront(); var1 != null; var1 = (PositionedSound) field11346.prev()) {
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
			var1.remove();
		}
		if (!arg0) {
			return;
		}
		for (PositionedSound var2 = (PositionedSound) field11347.peekFront(); var2 != null; var2 = (PositionedSound) field11347.prev()) {
			if (var2.field11371 != null) {
				var2.field11371.method7380(150);
				Client.audioApi.play(var2.field11371);
				var2.field11371 = null;
			}
			var2.remove();
		}
		for (PositionedSound var3 = (PositionedSound) field11366.peekFront(); var3 != null; var3 = (PositionedSound) field11366.prev()) {
			if (var3.field11371 != null) {
				var3.field11371.method7380(150);
				Client.audioApi.play(var3.field11371);
				var3.field11371 = null;
			}
			var3.remove();
		}
	}

	@ObfuscatedName("ada.n(I)V")
	public static void method15185() {
		for (PositionedSound var0 = (PositionedSound) field11346.peekFront(); var0 != null; var0 = (PositionedSound) field11346.prev()) {
			if (var0.field11367) {
				var0.method17660();
			}
		}
		for (PositionedSound var1 = (PositionedSound) field11347.peekFront(); var1 != null; var1 = (PositionedSound) field11347.prev()) {
			if (var1.field11367) {
				var1.method17660();
			}
		}
	}

	@ObfuscatedName("akc.m(B)V")
	public void method17660() {
		int var1 = this.field11370;
		if (this.field11348 != null) {
			LocType var2 = this.field11348.getVisible(Client.localPlayerGameState, Client.sceneState == 0 ? CutsceneManager.field1723 : Client.localPlayerGameState);
			if (var2 == null) {
				this.field11370 = -1;
				this.field11357 = 0;
				this.field11359 = 0;
				this.field11373 = 0;
				this.field11374 = 0;
				this.field11375 = null;
				this.field11369 = 256;
				this.field11368 = 256;
				this.field11356 = 0;
			} else {
				this.field11370 = var2.bgsound_sound;
				this.field11357 = var2.bgsound_range << 9;
				this.field11359 = var2.bgsound_volume;
				this.field11373 = var2.bgsound_mindelay;
				this.field11374 = var2.bgsound_maxdelay;
				this.field11375 = var2.bgsound_random;
				this.field11369 = var2.bgsound_maxrate;
				this.field11368 = var2.bgsound_minrate;
			}
		} else if (this.field11345 != null) {
			int var3 = method647(this.field11345);
			if (var1 != var3) {
				this.field11370 = var3;
				NPCType var4 = this.field11345.npcType;
				if (var4.multinpc != null) {
					var4 = var4.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
				}
				if (var4 == null) {
					this.field11356 = 0;
					this.field11357 = 0;
					this.field11359 = 0;
					this.field11369 = 256;
					this.field11368 = 256;
				} else {
					this.field11357 = var4.bgsound_range << 9;
					this.field11356 = var4.bgsound_size << 9;
					this.field11359 = var4.bgsound_volume;
					this.field11369 = var4.bgsound_maxrate;
					this.field11368 = var4.bgsound_minrate;
				}
			}
		} else if (this.field11361 != null) {
			this.field11370 = method16456(this.field11361);
			this.field11357 = this.field11361.field12067 << 9;
			this.field11356 = 0;
			this.field11359 = this.field11361.field12068;
			this.field11369 = 256;
			this.field11368 = 256;
		}
		if (this.field11370 != var1 && this.field11371 != null && this.field11371 != null) {
			this.field11371.method7380(100);
			Client.audioApi.play(this.field11371);
			this.field11371 = null;
		}
	}

	@ObfuscatedName("wp.k(IIIILvd;Laqc;Laqk;I)V")
	public static void method9739(int arg0, int arg1, int arg2, int arg3, LocType arg4, NpcEntity arg5, PlayerEntity arg6) {
		PositionedSound var7 = new PositionedSound();
		var7.field11349 = arg0;
		var7.field11358 = arg1 << 9;
		var7.field11351 = arg2 << 9;
		if (arg4 != null) {
			var7.field11348 = arg4;
			int var8 = arg4.width;
			int var9 = arg4.length;
			if (arg3 == 1 || arg3 == 3) {
				var8 = arg4.length;
				var9 = arg4.width;
			}
			var7.field11352 = arg1 + var8 << 9;
			var7.field11353 = arg2 + var9 << 9;
			var7.field11370 = arg4.bgsound_sound;
			var7.field11357 = arg4.bgsound_range << 9;
			var7.field11359 = arg4.bgsound_volume;
			var7.field11373 = arg4.bgsound_mindelay;
			var7.field11374 = arg4.bgsound_maxdelay;
			var7.field11375 = arg4.bgsound_random;
			var7.field11369 = arg4.bgsound_maxrate;
			var7.field11368 = arg4.bgsound_minrate;
			var7.field11356 = arg4.bgsound_size << 9;
			if (arg4.multiloc != null) {
				var7.field11367 = true;
				var7.method17660();
			}
			if (var7.field11375 != null) {
				var7.field11354 = var7.field11373 + (int) (Math.random() * (double) (var7.field11374 - var7.field11373));
			}
			field11346.pushBack(var7);
			Client.audioApi.preloadSounds(var7.field11370);
			Client.audioApi.loadSounds(var7.field11375);
		} else if (arg5 != null) {
			var7.field11345 = arg5;
			NPCType var10 = arg5.npcType;
			if (var10.multinpc != null) {
				var7.field11367 = true;
				var10 = var10.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
			}
			if (var10 != null) {
				var7.field11352 = var10.size + arg1 << 9;
				var7.field11353 = var10.size + arg2 << 9;
				var7.field11370 = method647(arg5);
				var7.field11357 = var10.bgsound_range << 9;
				var7.field11359 = var10.bgsound_volume;
				var7.field11369 = var10.bgsound_maxrate;
				var7.field11368 = var10.bgsound_minrate;
				var7.field11356 = var10.bgsound_size << 9;
				Client.audioApi.preloadSounds(var10.bgsound);
				Client.audioApi.preloadSounds(var10.bgsound_crawl);
				Client.audioApi.preloadSounds(var10.bgsound_walk);
				Client.audioApi.preloadSounds(var10.bgsound_run);
			}
			field11347.pushBack(var7);
		} else if (arg6 != null) {
			var7.field11361 = arg6;
			var7.field11352 = arg1 + arg6.size() << 9;
			var7.field11353 = arg2 + arg6.size() << 9;
			var7.field11370 = method16456(arg6);
			var7.field11357 = arg6.field12067 << 9;
			var7.field11359 = arg6.field12068;
			var7.field11369 = 256;
			var7.field11368 = 256;
			var7.field11356 = 0;
			field11366.pushNode(var7, (long) arg6.localPlayerIndex);
			Client.audioApi.preloadSounds(arg6.field12063);
			Client.audioApi.preloadSounds(arg6.field12049);
			Client.audioApi.preloadSounds(arg6.field12065);
			Client.audioApi.preloadSounds(arg6.field12066);
		}
	}

	@ObfuscatedName("oi.f(IIILvd;B)V")
	public static void method6206(int arg0, int arg1, int arg2, LocType arg3) {
		for (PositionedSound var4 = (PositionedSound) field11346.peekFront(); var4 != null; var4 = (PositionedSound) field11346.prev()) {
			if (var4.field11349 == arg0 && arg1 << 9 == var4.field11358 && arg2 << 9 == var4.field11351 && var4.field11348.id == arg3.id) {
				if (var4.field11371 != null) {
					var4.field11371.method7380(100);
					Client.audioApi.play(var4.field11371);
					var4.field11371 = null;
				}
				var4.remove();
				return;
			}
		}
	}

	@ObfuscatedName("xn.w(Laqc;I)V")
	public static void method10111(NpcEntity arg0) {
		for (PositionedSound var1 = (PositionedSound) field11347.peekFront(); var1 != null; var1 = (PositionedSound) field11347.prev()) {
			if (var1.field11345 == arg0) {
				if (var1.field11371 != null) {
					var1.field11371.method7380(100);
					Client.audioApi.play(var1.field11371);
					var1.field11371 = null;
				}
				var1.remove();
				return;
			}
		}
	}

	@ObfuscatedName("kg.l(Laqk;I)V")
	public static void method5142(PlayerEntity arg0) {
		PositionedSound var1 = (PositionedSound) field11366.getNode((long) arg0.localPlayerIndex);
		if (var1 == null) {
			return;
		}
		if (var1.field11371 != null) {
			var1.field11371.method7380(100);
			Client.audioApi.play(var1.field11371);
			var1.field11371 = null;
		}
		var1.remove();
	}

	@ObfuscatedName("xj.u(Laqk;I)V")
	public static void method10310(PlayerEntity arg0) {
		PositionedSound var1 = (PositionedSound) field11366.getNode((long) arg0.localPlayerIndex);
		if (var1 == null) {
			method9739(arg0.level, arg0.routeWaypointX[0], arg0.routeWaypointZ[0], 0, null, null, arg0);
		} else {
			var1.method17660();
		}
	}

	@ObfuscatedName("t.z(Laqc;I)I")
	public static int method647(NpcEntity arg0) {
		NPCType var1 = arg0.npcType;
		if (var1.multinpc != null) {
			var1 = var1.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var1 == null) {
				return -1;
			}
		}
		int var2 = var1.bgsound_walk;
		BASType var3 = arg0.getBASType();
		int var4 = arg0.field10432.method14348();
		if (var4 == -1 || arg0.field10432.field11877) {
			var2 = var1.bgsound;
		} else if (var3.field7361 == var4 || var3.field7329 == var4 || var3.field7331 == var4 || var3.field7330 == var4) {
			var2 = var1.bgsound_run;
		} else if (var3.field7332 == var4 || var3.field7333 == var4 || var3.field7319 == var4 || var3.field7328 == var4) {
			var2 = var1.bgsound_crawl;
		}
		return var2;
	}

	@ObfuscatedName("ags.p(Laqk;I)I")
	public static int method16456(PlayerEntity arg0) {
		int var1 = arg0.field12065;
		BASType var2 = arg0.getBASType();
		int var3 = arg0.field10432.method14348();
		if (var3 == -1 || arg0.field10432.field11877) {
			var1 = arg0.field12063;
		} else if (var2.field7361 == var3 || var2.field7329 == var3 || var2.field7331 == var3 || var2.field7330 == var3) {
			var1 = arg0.field12066;
		} else if (var2.field7332 == var3 || var2.field7333 == var3 || var2.field7319 == var3 || var2.field7328 == var3) {
			var1 = arg0.field12049;
		}
		return var1;
	}

	@ObfuscatedName("agz.d(IIIII)V")
	public static void method16460(int arg0, int arg1, int arg2, int arg3) {
		for (PositionedSound var4 = (PositionedSound) field11346.peekFront(); var4 != null; var4 = (PositionedSound) field11346.prev()) {
			method7896(var4, arg0, arg1, arg2, arg3);
		}
		for (PositionedSound var5 = (PositionedSound) field11347.peekFront(); var5 != null; var5 = (PositionedSound) field11347.prev()) {
			byte var6 = 1;
			BASType var7 = var5.field11345.getBASType();
			int var8 = var5.field11345.field10432.method14348();
			if (var8 == -1 || var5.field11345.field10432.field11877) {
				var6 = 0;
			} else if (var7.field7361 == var8 || var7.field7329 == var8 || var7.field7331 == var8 || var7.field7330 == var8) {
				var6 = 2;
			} else if (var7.field7332 == var8 || var7.field7333 == var8 || var7.field7319 == var8 || var7.field7328 == var8) {
				var6 = 3;
			}
			if (var5.field11360 != var6) {
				int var9 = method647(var5.field11345);
				NPCType var10 = var5.field11345.npcType;
				if (var10.multinpc != null) {
					var10 = var10.getVisible(Client.localPlayerGameState, Client.localPlayerGameState);
				}
				if (var10 == null || var9 == -1) {
					var5.field11370 = -1;
					var5.field11360 = var6;
				} else if (var5.field11370 == var9) {
					var5.field11360 = var6;
					var5.field11359 = var10.bgsound_volume;
				} else {
					boolean var11 = false;
					if (var5.field11371 == null) {
						var11 = true;
					} else {
						var5.field11359 -= 512;
						if (var5.field11359 <= 0) {
							var5.field11371.method7380(100);
							Client.audioApi.play(var5.field11371);
							var5.field11371 = null;
							var11 = true;
						}
					}
					if (var11) {
						var5.field11359 = var10.bgsound_volume;
						var5.field11370 = var9;
						var5.field11360 = var6;
					}
				}
			}
			Vector3 var12 = var5.field11345.getTransform().trans;
			var5.field11358 = (int) var12.x;
			var5.field11352 = (int) var12.x + (var5.field11345.size() << 8);
			var5.field11351 = (int) var12.z;
			var5.field11353 = (int) var12.z + (var5.field11345.size() << 8);
			var5.field11349 = var5.field11345.level;
			method7896(var5, arg0, arg1, arg2, arg3);
		}
		for (PositionedSound var13 = (PositionedSound) field11366.peekFront(); var13 != null; var13 = (PositionedSound) field11366.prev()) {
			byte var14 = 1;
			BASType var15 = var13.field11361.getBASType();
			int var16 = var13.field11361.field10432.method14348();
			if (var16 == -1 || var13.field11361.field10432.field11877) {
				var14 = 0;
			} else if (var15.field7361 == var16 || var15.field7329 == var16 || var15.field7331 == var16 || var15.field7330 == var16) {
				var14 = 2;
			} else if (var15.field7332 == var16 || var15.field7333 == var16 || var15.field7319 == var16 || var15.field7328 == var16) {
				var14 = 3;
			}
			if (var13.field11360 != var14) {
				int var17 = method16456(var13.field11361);
				if (var13.field11370 == var17) {
					var13.field11359 = var13.field11361.field12068;
					var13.field11360 = var14;
				} else {
					boolean var18 = false;
					if (var13.field11371 == null) {
						var18 = true;
					} else {
						var13.field11359 -= 512;
						if (var13.field11359 <= 0) {
							var13.field11371.method7380(100);
							Client.audioApi.play(var13.field11371);
							var13.field11371 = null;
							var18 = true;
						}
					}
					if (var18) {
						var13.field11359 = var13.field11361.field12068;
						var13.field11370 = var17;
						var13.field11360 = var14;
					}
				}
			}
			Vector3 var19 = var13.field11361.getTransform().trans;
			var13.field11358 = (int) var19.x;
			var13.field11352 = (int) var19.x + (var13.field11361.size() << 8);
			var13.field11351 = (int) var19.z;
			var13.field11353 = (int) var19.z + (var13.field11361.size() << 8);
			var13.field11349 = var13.field11361.level;
			method7896(var13, arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("rd.c(Lakc;IIIII)V")
	public static void method7896(PositionedSound arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0.field11370 == -1 && arg0.field11375 == null) {
			return;
		}
		int var5 = arg0.field11359;
		if (arg0.field11357 != 0 && Client.preferences.backgroundSoundVolume.getValue() != 0 && arg0.field11349 == arg1) {
			if (arg0.field11371 != null && (arg0.field11371.method7385() == SoundVolume.field4953 || arg0.field11371.method7385() == SoundVolume.field4947)) {
				Client.audioApi.play(arg0.field11371);
				arg0.field11371 = null;
			}
			if (arg0.field11371 != null) {
				int var10 = (int) ((float) (arg0.field11352 - arg0.field11358) * 0.5F + (float) arg0.field11358);
				int var11 = (int) ((float) (arg0.field11353 - arg0.field11351) * 0.5F + (float) arg0.field11351);
				arg0.field11350.x = var10;
				arg0.field11350.z = var11;
			} else if (arg0.field11370 >= 0) {
				short var6 = 256;
				int var7 = (int) ((float) (arg0.field11352 - arg0.field11358) * 0.5F + (float) arg0.field11358);
				int var8 = (int) ((float) (arg0.field11353 - arg0.field11351) * 0.5F + (float) arg0.field11351);
				arg0.field11350.x = var7;
				arg0.field11350.z = var8;
				arg0.field11371 = Client.audioApi.createSound(SoundType.field1821, arg0, arg0.field11370, -1, 0, SubBussType.LOCATION_GENERIC_SUB.getId(), SoundShape.field1838, (float) arg0.field11356, (float) arg0.field11357, arg0.field11350, 0, var6, false);
				if (arg0.field11371 != null) {
					float var9 = (float) var5 / 255.0F;
					arg0.field11371.method7403(var9, 150);
					arg0.field11371.method7441();
				}
			}
			if (arg0.field11372 != null) {
				int var16 = (int) ((float) (arg0.field11352 - arg0.field11358) * 0.5F + (float) arg0.field11358);
				int var17 = (int) ((float) (arg0.field11353 - arg0.field11351) * 0.5F + (float) arg0.field11351);
				arg0.field11355.x = var16;
				arg0.field11355.z = var17;
				if (arg0.field11372.method7385() == SoundVolume.field4953 || arg0.field11372.method7385() == SoundVolume.field4947) {
					Client.audioApi.play(arg0.field11372);
					arg0.field11372 = null;
				}
			} else if (arg0.field11375 != null && (arg0.field11354 -= arg4) <= 0) {
				int var12 = arg0.field11369 == 256 && arg0.field11368 == 256 ? 256 : (int) (Math.random() * (double) (arg0.field11369 - arg0.field11368)) + arg0.field11368;
				int var13 = (int) (Math.random() * (double) arg0.field11375.length);
				int var14 = (int) ((float) (arg0.field11352 - arg0.field11358) * 0.5F + (float) arg0.field11358);
				int var15 = (int) ((float) (arg0.field11353 - arg0.field11351) * 0.5F + (float) arg0.field11351);
				arg0.field11355.x = var14;
				arg0.field11355.z = var15;
				arg0.field11372 = Client.audioApi.createSound(SoundType.field1822, arg0, arg0.field11375[var13], 0, var5, SubBussType.LOCATION_RANDOM_SUB.getId(), SoundShape.field1838, (float) arg0.field11356, (float) (arg0.field11357 + arg0.field11356), arg0.field11355, 0, var12, false);
				if (arg0.field11372 != null) {
					arg0.field11372.method7441();
				}
				arg0.field11354 = arg0.field11373 + (int) (Math.random() * (double) (arg0.field11374 - arg0.field11373));
			}
		} else if (arg0.field11371 != null) {
			arg0.field11371.method7380(100);
			Client.audioApi.play(arg0.field11371);
			arg0.field11371 = null;
		}
	}
}
