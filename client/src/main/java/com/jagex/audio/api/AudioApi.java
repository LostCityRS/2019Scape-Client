package com.jagex.audio.api;

import com.jagex.audio.backend.AudioMixer;
import com.jagex.audio.backend.AudioMixerRelated;
import com.jagex.audio.backend.SoundBackendConfig;
import com.jagex.audio.stream.*;
import com.jagex.core.datastruct.SoftLruHashTableRemovalListener;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.PathingEntity;
import rs2.client.scene.entities.ProjectileAnimation;
import rs2.client.scene.entities.SpotAnimation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("fb")
public class AudioApi {

	@ObfuscatedName("fb.u")
	public boolean field1860;

	@ObfuscatedName("fb.z")
	public List field1848 = new ArrayList();

	@ObfuscatedName("fb.p")
	public List sounds = new ArrayList();

	@ObfuscatedName("fb.d")
	public HashMap field1858 = new HashMap();

	@ObfuscatedName("fb.c")
	public HashMap field1865 = new HashMap();

	@ObfuscatedName("fb.r")
	public List field1867 = new ArrayList();

	@ObfuscatedName("fb.v")
	public SoftLruHashTable field1856;

	@ObfuscatedName("fb.o")
	public SoftLruHashTable field1862;

	@ObfuscatedName("fb.s")
	public SoftLruHashTable field1863;

	@ObfuscatedName("fb.y")
	public int field1864;

	@ObfuscatedName("fb.q")
	public Vector3 field1873;

	@ObfuscatedName("fb.x")
	public HashMap field1851 = new HashMap();

	@ObfuscatedName("fb.b")
	public int currentSong;

	@ObfuscatedName("fb.h")
	public Sound field1868;

	@ObfuscatedName("fb.a")
	public Sound field1869 = null;

	@ObfuscatedName("fb.g")
	public boolean field1870 = false;

	@ObfuscatedName("fb.i")
	public int titleScreenSong;

	@ObfuscatedName("fb.j")
	public int field1861;

	@ObfuscatedName("fb.t")
	public boolean field1857;

	@ObfuscatedName("fb.ae")
	public SoundAdjuster field1874 = new SoundStereoAdjuster(this);

	@ObfuscatedName("fb.ag")
	public SoundAdjuster field1872 = new SoundSpatializer(this);

	@ObfuscatedName("fb.ah")
	public SoundAdjuster field1876 = new SoundVolumeAdjuster(this);

	@ObfuscatedName("fb.al")
	public SoundAdjuster field1877 = new SoundPositionAdjuster(this);

	@ObfuscatedName("fn")
	public static class SoundStereoAdjuster implements SoundAdjuster {

		// $FF: synthetic field
		public final AudioApi this$0;

		public SoundStereoAdjuster(AudioApi arg0) {
			this.this$0 = arg0;
		}

		// line 61
		@ObfuscatedName("fn.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
		public void method3053(Object arg0, float[] arg1, Object[] arg2) {
			Sound var4 = (Sound) arg0;
			Vector3 var5 = var4.method7395();
			float var6 = var4.method7436();
			float var7 = var4.method7397();
			Vector3 var8 = Vector3.sub(var5, this.this$0.method3147());
			float var9 = 0.0F;
			float var10 = var8.length();
			if (var10 >= var7) {
				float var11 = 0.0F;
			}
			float var12;
			if (var10 <= var6) {
				var12 = 1.0F;
			} else {
				float var13 = 1.0F - 1.0F / (var7 - var6) * (var10 - var6);
				if ((double) var13 < 0.0D || (double) var13 > 1.0D) {
					var13 = Math.min(Math.max(var13, 0.0F), 1.0F);
				}
				var12 = var13;
			}
			int var14 = 8192;
			float var15 = 0.0F;
			float var19;
			if (Client.cameraState == 3) {
				float var16 = Client.cam2.method4719();
				if (var8.x != 0.0F || var8.z != 0.0F) {
					int var17 = (int) ((double) (var16 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) var8.x, (double) var8.z) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (var17 > 8192) {
						var17 = 16384 - var17;
					}
					int var18;
					if (var10 <= 0.0F) {
						var18 = 8192;
					} else if (var10 >= 4096.0F) {
						var18 = 16384;
					} else {
						var18 = (int) (var10 * 8192.0F / 4096.0F + 8192.0F);
					}
					var14 = (16384 - var18 >> 1) + var17 * var18 / 8192;
				}
				var19 = (float) var14 * 6.1035156E-5F;
			} else {
				if (var8.x != 0.0F || var8.z != 0.0F) {
					int var20 = -Client.cameraYaw - (int) (Math.atan2((double) var8.x, (double) var8.z) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (var20 > 8192) {
						var20 = 16384 - var20;
					}
					int var21;
					if (var10 <= 0.0F) {
						var21 = 8192;
					} else if (var10 >= 4096.0F) {
						var21 = 16384;
					} else {
						var21 = (int) (var10 * 8192.0F / 4096.0F + 8192.0F);
					}
					var14 = (16384 - var21 >> 1) + var20 * var21 / 8192;
				}
				var19 = (float) var14 * 6.1035156E-5F;
			}
			arg1[0] = (float) (var14 < 0 ? (double) var12 : (double) var12 * Math.sqrt((double) ((1.0F - var19) * 2.0F)));
			arg1[1] = (float) (var14 < 0 ? (double) -var12 : (double) var12 * Math.sqrt((double) (var19 * 2.0F)));
		}
	}

	@ObfuscatedName("fd")
	public static class SoundSpatializer implements SoundAdjuster {

		// $FF: synthetic field
		public final AudioApi this$0;

		public SoundSpatializer(AudioApi arg0) {
			this.this$0 = arg0;
		}

		// line 116
		@ObfuscatedName("fd.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
		public void method3053(Object arg0, float[] arg1, Object[] arg2) {
			Sound var4 = (Sound) arg0;
			Vector3 var5 = var4.method7395();
			float var6 = var4.method7436();
			float var7 = var4.method7397();
			Vector3 var8 = this.this$0.method3147();
			Vector3 var9 = Vector3.sub(var5, var8);
			float var10 = 0.0F;
			int var11 = 8192;
			float var12 = var9.length();
			float var13 = 0.0F;
			if (var12 >= var7) {
				var10 = 0.0F;
			} else {
				float var14 = (Float) arg2[0];
				float var15 = (Float) arg2[1];
				if (var8.x > var5.x - var14 / 2.0F && var8.x < var14 / 2.0F + var5.x && var8.z > var5.z - var15 / 2.0F && var8.z < var15 / 2.0F + var5.z) {
					float var16 = Math.abs(var8.x - (var14 / 2.0F + var5.x));
					float var17 = Math.abs(var8.x - (var5.x - var14 / 2.0F));
					float var18 = Math.abs(var8.z - (var15 / 2.0F + var5.x));
					float var19 = Math.abs(var8.z - (var5.x - var15 / 2.0F));
					float var20 = var7 - var6;
					float var21 = Math.min(var16, var17);
					float var22 = Math.min(var18, var19);
					float var23 = 1.0F / var20 * var21;
					float var24 = 1.0F / var20 * var22;
					float var25 = Math.min(Math.max(var23, 0.0F), 1.0F);
					float var26 = Math.min(Math.max(var24, 0.0F), 1.0F);
					var10 = Math.min(var25, var26);
				}
				if (var9.x != 0.0F || var9.z != 0.0F) {
					if (Client.cameraState == 3) {
						float var27 = Client.cam2.method4719();
						if (var9.x != 0.0F || var9.z != 0.0F) {
							int var28 = (int) ((double) (var27 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) var9.x, (double) var9.z) * 2607.5945876176133D) - 4096 & 0x3FFF;
							if (var28 > 8192) {
								var28 = 16384 - var28;
							}
							int var29;
							if (var12 <= 0.0F) {
								var29 = 8192;
							} else if (var12 >= 4096.0F) {
								var29 = 16384;
							} else {
								var29 = (int) (var12 * 8192.0F / 4096.0F + 8192.0F);
							}
							var11 = (16384 - var29 >> 1) + var28 * var29 / 8192;
						}
						var13 = (float) var11 * 6.1035156E-5F;
					} else {
						int var30 = -Client.cameraYaw - (int) (Math.atan2((double) var9.x, (double) var9.z) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (var30 > 8192) {
							var30 = 16384 - var30;
						}
						int var31;
						if (var12 <= 0.0F) {
							var31 = 8192;
						} else if (var12 >= 4096.0F) {
							var31 = 16384;
						} else {
							var31 = (int) (var12 * 8192.0F / 4096.0F + 8192.0F);
						}
						var11 = (16384 - var31 >> 1) + var30 * var31 / 8192;
						var13 = (float) var11 * 6.1035156E-5F;
					}
				}
			}
			arg1[0] = (float) (var11 < 0 ? (double) var10 : (double) var10 * Math.sqrt((double) (1.0F - var13)));
			arg1[1] = (float) (var11 < 0 ? (double) -var10 : (double) var10 * Math.sqrt((double) var13));
		}
	}

	@ObfuscatedName("fw")
	public static class SoundVolumeAdjuster implements SoundAdjuster {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 182
		public SoundVolumeAdjuster(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("fw.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
		public void method3053(Object arg0, float[] arg1, Object[] arg2) {
			Sound var4 = (Sound) arg0;
			Vector3 var5 = var4.method7395();
			float var6 = var4.method7436();
			float var7 = var4.method7397();
			Vector3 var8 = Vector3.sub(var5, this.this$0.method3147());
			float var9 = 0.0F;
			float var10 = var8.length();
			if (var10 >= var7) {
				float var11 = 0.0F;
			}
			float var12;
			if (var10 <= var6) {
				var12 = 1.0F;
			} else {
				float var13 = 1.0F - 1.0F / (var7 - var6) * (var10 - var6);
				if ((double) var13 < 0.0D || (double) var13 > 1.0D) {
					var13 = Math.min(Math.max(var13, 0.0F), 1.0F);
				}
				var12 = var13;
			}
			arg1[0] = var12;
			arg1[1] = var12;
		}
	}

	@ObfuscatedName("fi")
	public static class SoundPositionAdjuster implements SoundAdjuster {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 204
		public SoundPositionAdjuster(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("fi.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
		public void method3053(Object arg0, float[] arg1, Object[] arg2) {
			Sound var4 = (Sound) arg0;
			Vector3 var5 = var4.method7395();
			float var6 = var4.method7436();
			float var7 = var4.method7397();
			Vector3 var8 = this.this$0.method3147();
			Vector3 var9 = Vector3.sub(var5, var8);
			float var10 = 0.0F;
			float var11 = var9.length();
			if (var11 >= var7) {
				var10 = 0.0F;
			} else {
				float var12 = (Float) arg2[0];
				float var13 = (Float) arg2[1];
				if (var8.x > var5.x - var12 / 2.0F && var8.x < var12 / 2.0F + var5.x && var8.z > var5.z - var13 / 2.0F && var8.z < var13 / 2.0F + var5.z) {
					float var14 = Math.abs(var8.x - (var12 / 2.0F + var5.x));
					float var15 = Math.abs(var8.x - (var5.x - var12 / 2.0F));
					float var16 = Math.abs(var8.z - (var13 / 2.0F + var5.x));
					float var17 = Math.abs(var8.z - (var5.x - var13 / 2.0F));
					float var18 = var7 - var6;
					float var19 = Math.min(var14, var15);
					float var20 = Math.min(var16, var17);
					float var21 = 1.0F / var18 * var19;
					float var22 = 1.0F / var18 * var20;
					float var23 = Math.min(Math.max(var21, 0.0F), 1.0F);
					float var24 = Math.min(Math.max(var22, 0.0F), 1.0F);
					var10 = Math.min(var23, var24);
				}
			}
			arg1[0] = var10;
			arg1[1] = var10;
		}
	}

	// line 241
	@ObfuscatedName("fb.e(I)Ljava/util/List;")
	public List getSounds() {
		return this.sounds;
	}

	@ObfuscatedName("fb.n(I)Ljava/util/List;")
	public List method3233() {
		return this.field1867;
	}

	@ObfuscatedName("fb.m(I)Leb;")
	public SoftLruHashTable method3145() {
		return this.field1856;
	}

	@ObfuscatedName("fb.k(I)Leb;")
	public SoftLruHashTable method3146() {
		return this.field1862;
	}

	@ObfuscatedName("fb.f(I)Lox;")
	public Vector3 method3147() {
		return this.field1873;
	}

	// line 263
	@ObfuscatedName("fb.w(III)V")
	public void init(int arg0, int arg1) {
		if (this.field1860) {
			return;
		}
		this.field1864 = arg0;
		this.field1856 = new SoftLruHashTable(arg1, 100);
		this.field1862 = new SoftLruHashTable(10);
		this.field1856.setRemovalListener(new AudioApiRemovalListener(this));
		SoundBackendConfig var3 = new SoundBackendConfig(SoundBackendType.DUMMY);
		AudioMixer.createBackend(var3);
		this.configureRoutingArchitecture();
		this.currentSong = -1;
		this.field1860 = true;
	}

	@ObfuscatedName("fs")
	public static class AudioApiRemovalListener implements SoftLruHashTableRemovalListener {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 267
		public AudioApiRemovalListener(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("fs.f(Lwr;I)V")
		public void method3027(AudioProcessingInterface arg0) {
			Iterator var2 = this.this$0.getSounds().iterator();
			while (var2.hasNext()) {
				Sound var3 = (Sound) var2.next();
				if (var3.method7386() == arg0) {
					var3.method7377();
					var2.remove();
				}
			}
		}

		@ObfuscatedName("fs.e(Ljava/lang/Object;I)V")
		public void method2914(Object arg0) {
			this.method3027((AudioProcessingInterface) arg0);
		}
	}

	// line 291
	@ObfuscatedName("fb.l(S)V")
	public void update() {
		if (!this.field1860) {
			return;
		}
		AudioMixer.method306();
		if (Client.localPlayerEntity != null && Client.localPlayerEntity.getTransform() != null) {
			if (this.field1873 == null) {
				this.field1873 = new Vector3();
			}
			this.field1873.x = Client.localPlayerEntity.getTransform().trans.x;
			this.field1873.y = 0.0F;
			this.field1873.z = Client.localPlayerEntity.getTransform().trans.z;
		}
		Iterator var1 = this.field1858.values().iterator();
		while (var1.hasNext()) {
			AudioProcessingInterface var2 = (AudioProcessingInterface) var1.next();
			var2.method9672();
		}
		Iterator var3 = this.field1865.values().iterator();
		while (var3.hasNext()) {
			AudioProcessingInterface var4 = (AudioProcessingInterface) var3.next();
			var4.method9672();
		}
		Iterator var5 = this.field1867.iterator();
		while (var5.hasNext()) {
			AudioProcessingInterface var6 = (AudioProcessingInterface) var5.next();
			if (var6.method9675()) {
				this.field1865.remove(var6.method9680());
			} else {
				this.field1858.remove(var6.method9680());
			}
		}
		this.field1867.clear();
		if (this.field1869 != null && this.field1869.method7385() == SoundVolume.field4949 && !this.field1870 && Client.gameConnection.randomOut != null && Client.isStateGame(Client.state)) {
			ClientMessage var7 = ClientMessage.createMessage(ClientProt.SOUND_SONGPRELOADED, Client.gameConnection.randomOut);
			var7.buf.p4(this.field1869.method7386().method9680());
			Client.gameConnection.queue(var7);
			this.field1870 = true;
		}
		Iterator var8 = this.field1848.iterator();
		while (true) {
			label163: while (true) {
				Sound var9;
				SoundVolume var10;
				do {
					if (!var8.hasNext()) {
						return;
					}
					var9 = (Sound) var8.next();
					var9.method7402();
					var9.method7384();
					var10 = var9.method7385();
				} while (var9.getSoundSystem() != this);
				if (SoundVolume.field4947 == var10 || SoundVolume.field4953 == var10) {
					if (var9.getType() != SoundType.field1824 && var9.getType() != SoundType.field1826) {
						Iterator var12 = this.field1851.keySet().iterator();
						while (var12.hasNext()) {
							int var13 = (Integer) var12.next();
							AudioApiRelated5 var14 = (AudioApiRelated5) this.field1851.get(var13);
							if (var14.method3120().contains(var9)) {
								var14.method3114(var9);
								break;
							}
						}
						var9.method7377();
						this.sounds.remove(var9);
					} else if (this.field1869 == var9) {
						this.field1870 = false;
						this.field1869 = null;
						var9.method7377();
						this.sounds.remove(var9);
					} else {
						int var15 = var9.method7386().method9680();
						boolean var16 = this.method3189(SubBussType.MUSIC_SUB.getId()) > 0.0F;
						if (!this.field1857 && var16) {
							if (this.currentSong == var15) {
								this.sendSongEnd(var15);
								this.currentSong = -1;
							}
							var9.method7377();
							this.sounds.remove(var9);
						} else if (this.field1861 == var15) {
							this.field1861 = -1;
							this.field1857 = false;
							var9.method7377();
							this.sounds.remove(var9);
							Iterator var17 = this.field1848.iterator();
							Sound var18;
							int var19;
							do {
								do {
									if (!var17.hasNext()) {
										continue label163;
									}
									var18 = (Sound) var17.next();
								} while (var18.getType() != SoundType.field1824);
								var19 = var18.method7386().method9680();
							} while ((this.currentSong != var19 || var18.method7385() != SoundVolume.field4947) && var18.method7385() != SoundVolume.field4946 && var18.method7385() != SoundVolume.field4948 && var18.method7385() != SoundVolume.field4949);
							if (var18.method7385() == SoundVolume.field4947) {
								var18.method7382();
							} else {
								var18.method7441();
							}
						} else if (var16) {
							if (!this.field1857 || this.currentSong != var15) {
								var9.method7377();
								this.sounds.remove(var9);
							}
							if (!this.field1857 && this.currentSong == var15) {
								this.currentSong = -1;
								this.field1868 = null;
							}
						}
					}
				} else if (var9.method7385() != SoundVolume.field4951 && var9.method7419() == SubBussType.MUSIC_SUB.getId()) {
					boolean var11 = this.method3189(SubBussType.MUSIC_SUB.getId()) > 1.0E-4F;
					if (!var11) {
						var9.method7380(150);
					}
				}
			}
		}
	}

	// line 411
	@ObfuscatedName("fb.u(B)V")
	public void stop() {
		AudioMixer.method7606();
	}

	@ObfuscatedName("fb.z(Lrw;III)V")
	public void method3251(Sound arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return;
		}
		AudioApiRelated5 var4 = (AudioApiRelated5) this.field1851.get(arg1);
		if (var4 == null) {
			var4 = new AudioApiRelated5(this);
			this.field1851.put(arg1, var4);
		}
		if (!var4.method3113(arg0)) {
			arg0.method7400(arg2, true);
			var4.method3110(arg0);
		}
	}

	@ObfuscatedName("fb.p(IB)V")
	public void startGroup(int arg0) {
		AudioApiRelated5 var2 = (AudioApiRelated5) this.field1851.get(arg0);
		if (var2 == null) {
			return;
		}
		List var3 = var2.method3120();
		Iterator var4 = var3.iterator();
		while (var4.hasNext()) {
			Sound var5 = (Sound) var4.next();
			if (!var5.method7390()) {
				var5.method7441();
			}
		}
	}

	@ObfuscatedName("fb.d(II)V")
	public void stopGroup(int arg0) {
		AudioApiRelated5 var2 = (AudioApiRelated5) this.field1851.get(arg0);
		if (var2 == null) {
			return;
		}
		List var3 = var2.method3120();
		Iterator var4 = var3.iterator();
		while (var4.hasNext()) {
			Sound var5 = (Sound) var4.next();
			var5.method7380(50);
		}
	}

	@ObfuscatedName("fb.c(IB)V")
	public void preloadSoundGroup(int arg0) {
		AudioApiRelated5 var2 = (AudioApiRelated5) this.field1851.get(arg0);
		if (var2 == null) {
			return;
		}
		List var3 = var2.method3120();
		Iterator var4 = var3.iterator();
		while (var4.hasNext()) {
			Sound var5 = (Sound) var4.next();
			var5.method7392();
		}
	}

	// line 470
	@ObfuscatedName("fb.r(I)V")
	public void configureRoutingArchitecture() {
		MainEffectsVolumeProvider var1 = new MainEffectsVolumeProvider(this);
		MainMusicVolumeProvider var2 = new MainMusicVolumeProvider(this);
		LoginMusicVolumeProvider var3 = new LoginMusicVolumeProvider(this);
		BackgroundEffectsVolumeProvider var4 = new BackgroundEffectsVolumeProvider(this);
		SpeechVolumeProvider var5 = new SpeechVolumeProvider(this);
		AudioMixer.addBuss(BussType.SFX.getId(), BussType.MASTER.getId(), 0.2F, var1);
		AudioMixer.addBuss(BussType.MUSIC.getId(), BussType.MASTER.getId(), 1.0F, var2);
		AudioMixer.addBuss(BussType.MUSIC_LOGIN.getId(), BussType.MASTER.getId(), 1.0F, var3);
		AudioMixer.addBuss(BussType.AMBIENT.getId(), BussType.MASTER.getId(), 0.8F, var4);
		AudioMixer.addBuss(BussType.VOICEOVER.getId(), BussType.MASTER.getId(), 1.0F, var5);
		AudioMixer.addBuss(SubBussType.MUSIC_SUB.getId(), BussType.MUSIC.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.DIALOG_SUB.getId(), BussType.VOICEOVER.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.SFX_SUB.getId(), BussType.SFX.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.PLAYER_ANIMATION_SUB.getId(), BussType.SFX.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.NPC_ANIMATION_SUB.getId(), BussType.SFX.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.LOCATION_ANIMATION_SUB.getId(), BussType.SFX.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.GENERAL_ANIMATION_SUB.getId(), BussType.SFX.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.LOCATIONS_SUB.getId(), BussType.AMBIENT.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.LOCATION_GENERIC_SUB.getId(), SubBussType.LOCATIONS_SUB.getId(), 1.0F, null);
		AudioMixer.addBuss(SubBussType.LOCATION_RANDOM_SUB.getId(), SubBussType.LOCATIONS_SUB.getId(), 1.0F, null);
		AudioMixer.method5401(SubBussType.MUSIC_SUB.getId()).method5897(0.75F);
	}

	@ObfuscatedName("fv")
	public static class MainEffectsVolumeProvider implements VolumeProvider {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 470
		public MainEffectsVolumeProvider(AudioApi arg0) {
			this.this$0 = arg0;
		}

		// line 472
		@ObfuscatedName("fv.e(I)F")
		public float getVolume() {
			return (float) Client.preferences.soundVolume.getValue() / 255.0F;
		}
	}

	@ObfuscatedName("fc")
	public static class MainMusicVolumeProvider implements VolumeProvider {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 475
		public MainMusicVolumeProvider(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("fc.e(I)F")
		public float getVolume() {
			return (float) Client.preferences.unknownVolume1.getValue() / 255.0F;
		}
	}

	@ObfuscatedName("fp")
	public static class LoginMusicVolumeProvider implements VolumeProvider {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 480
		public LoginMusicVolumeProvider(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("fp.e(I)F")
		public float getVolume() {
			return (float) Client.preferences.unknownVolume2.getValue() / 255.0F;
		}
	}

	@ObfuscatedName("ff")
	public static class BackgroundEffectsVolumeProvider implements VolumeProvider {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 485
		public BackgroundEffectsVolumeProvider(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("ff.e(I)F")
		public float getVolume() {
			return (float) Client.preferences.backgroundSoundVolume.getValue() / 255.0F;
		}
	}

	@ObfuscatedName("fa")
	public static class SpeechVolumeProvider implements VolumeProvider {

		// $FF: synthetic field
		public final AudioApi this$0;

		public SpeechVolumeProvider(AudioApi arg0) {
			this.this$0 = arg0;
		}

		// line 492
		@ObfuscatedName("fa.e(I)F")
		public float getVolume() {
			return (float) Client.preferences.speechVolume.getValue() / 255.0F;
		}
	}

	// line 514
	@ObfuscatedName("fb.v(IIIB)V")
	public void addBuss(int arg0, int arg1, int arg2) {
		int var4 = BussType.MASTER.getId();
		if (AudioMixer.method5401(arg0) == null && (arg1 == var4 || AudioMixer.method5401(arg1) != null)) {
			float var5 = (float) arg2 * 1.5258789E-5F;
			AudioMixer.addBuss(arg0, arg1 == var4 ? -1 : arg1, var5, null);
		}
	}

	@ObfuscatedName("fb.o(III)V")
	public void setMixBussLevel(int arg0, int arg1) {
		AudioBuss var3 = AudioMixer.method5401(arg0);
		if (var3 != null) {
			float var4 = (float) arg1 * 1.5258789E-5F;
			var3.method5897(var4);
		}
	}

	@ObfuscatedName("fb.s(II)F")
	public float method3189(int arg0) {
		AudioBuss var2 = AudioMixer.method5401(arg0);
		float var3 = 1.0F;
		while (var2 != null) {
			var3 *= var2.getSelfVolume();
			var2 = var2.getParent();
		}
		return var3;
	}

	// line 541
	@ObfuscatedName("fb.y(IB)V")
	public void stopVorbisSpeech(int arg0) {
		Iterator var2 = this.sounds.iterator();
		while (var2.hasNext()) {
			Sound var3 = (Sound) var2.next();
			int var4 = var3.method7419();
			boolean var5 = AudioMixer.commonParentExists(var4, arg0);
			if (var5) {
				var3.method7380(50);
			}
		}
	}

	@ObfuscatedName("fb.q([IB)V")
	public void loadSounds(int[] arg0) {
		if (!this.field1860 || arg0 == null) {
			return;
		}
		int[] var2 = arg0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			int var4 = var2[var3];
			this.preloadSounds(var4);
		}
	}

	@ObfuscatedName("fb.x(IB)V")
	public void preloadSounds(int arg0) {
		if (this.field1860 && arg0 >= 0) {
			this.method3163(arg0, false);
		}
	}

	@ObfuscatedName("fb.b(IZI)Lwr;")
	public AudioProcessingInterface method3162(int arg0, boolean arg1) {
		if (!this.field1860) {
			return null;
		}
		AudioProcessingInterface var3 = (AudioProcessingInterface) (arg1 ? this.field1862.get((long) arg0) : this.field1856.get((long) arg0));
		if (var3 == null) {
			if (arg1) {
				var3 = (AudioProcessingInterface) this.field1865.get(arg0);
			} else {
				var3 = (AudioProcessingInterface) this.field1858.get(arg0);
			}
		}
		return var3;
	}

	// line 583
	@ObfuscatedName("fb.h(IZI)Lwr;")
	public AudioProcessingInterface method3163(int arg0, boolean arg1) {
		if (!this.field1860) {
			return null;
		}
		AudioProcessingInterface var3 = this.method3162(arg0, arg1);
		if (var3 == null) {
			AudioMixerRelated_Sub1 var4 = new AudioMixerRelated_Sub1(this);
			var3 = AudioMixer.method6064(arg1 ? Client.audiostreamsJs5 : Client.vorbisJs5, arg0, var4, arg1, this.field1863);
			if (arg1) {
				this.field1865.put(arg0, var3);
			} else {
				this.field1858.put(arg0, var3);
			}
		}
		return var3;
	}

	@ObfuscatedName("fl")
	public static class AudioMixerRelated_Sub1 implements AudioMixerRelated {

		// $FF: synthetic field
		public final AudioApi this$0;

		// line 586
		public AudioMixerRelated_Sub1(AudioApi arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("fl.e(Lwr;IIZB)V")
		public void method3130(AudioProcessingInterface arg0, int arg1, int arg2, boolean arg3) {
			this.this$0.method3233().add(arg0);
			if (arg3) {
				this.this$0.method3146().put(arg0, (long) arg2);
			} else {
				this.this$0.method3145().put(arg0, (long) arg2, arg0.method9678());
			}
		}

		@ObfuscatedName("fl.n(Lwr;I)V")
		public void method3131(AudioProcessingInterface arg0) {
			if (arg0 != null) {
				this.this$0.method3145().get((long) arg0.method9680());
			}
		}
	}

	@ObfuscatedName("fb.a(Lwr;I)Lrw;")
	public Sound method3164(AudioProcessingInterface arg0) {
		if (!this.field1860) {
			return null;
		}
		int var2 = 0;
		Iterator var3 = this.field1848.iterator();
		Sound var4;
		do {
			if (!var3.hasNext()) {
				if (var2 >= this.field1864) {
					return null;
				}
				Sound var5 = arg0.method9710();
				this.field1848.add(var5);
				return var5;
			}
			var4 = (Sound) var3.next();
			var2++;
		} while (var4.method7385() != SoundVolume.field4955);
		var4.method7376(arg0);
		return var4;
	}

	@ObfuscatedName("fb.g(Lrw;I)V")
	public void play(Sound arg0) {
		arg0.setSoundSystem(this);
		this.sounds.add(arg0);
	}

	@ObfuscatedName("fb.i(Lox;Lox;FI)Z")
	public boolean method3231(Vector3 arg0, Vector3 arg1, float arg2) {
		Vector3 var4 = Vector3.sub(arg1, arg0);
		return !(var4.length() >= arg2);
	}

	@ObfuscatedName("fb.j(Lft;Ljava/lang/Object;IIIILfx;FFLox;IIZI)Lrw;")
	public Sound createSound(SoundType arg0, Object arg1, int arg2, int arg3, int arg4, int arg5, SoundShape arg6, float arg7, float arg8, Vector3 arg9, int arg10, int arg11, boolean arg12) {
		if (!this.field1860) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			int var14 = Math.max(0, Math.min(arg4, 255));
			int var15 = Math.max(0, arg11);
			if (SoundShape.field1835 != arg6 && !this.method3231(this.field1873, arg9, arg8)) {
				return null;
			}
			if (var15 <= 0) {
				var15 = 255;
			}
			float var16 = (float) var14 / 255.0F;
			float var17 = (float) var15 / 255.0F;
			AudioProcessingInterface var18 = this.method3163(arg2, arg12);
			Sound var19 = this.method3164(var18);
			if (var19 == null) {
				return null;
			}
			var19.setSoundSystem(arg1);
			var19.method7391(arg5);
			if (SoundShape.field1835 != arg6) {
				var19.method7421(true);
				var19.setPosition(arg9);
				var19.setSize(arg7);
				var19.setRange(arg8);
				if (SoundShape.field1836 == arg6) {
					var19.method7383(this.field1872);
				} else if (SoundShape.field1837 == arg6) {
					var19.method7383(this.field1877);
				} else if (SoundShape.field1838 == arg6) {
					var19.method7383(this.field1874);
				} else if (SoundShape.field1834 == arg6) {
					var19.method7383(this.field1876);
				} else {
					var19.method7421(false);
				}
			}
			var19.method7403(var16, 0);
			var19.method7404(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			var19.setRate(var17);
			var19.setType(arg0);
			return var19;
		}
	}

	@ObfuscatedName("fb.t(Lft;IIIILfx;FFLox;IIII)V")
	public void playSound(SoundType arg0, int arg1, int arg2, int arg3, int arg4, SoundShape arg5, float arg6, float arg7, Vector3 arg8, int arg9, int arg10, int arg11) {
		if (!this.field1860) {
			return;
		}
		Sound var13 = this.createSound(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (var13 == null) {
			return;
		}
		if (arg11 == 0) {
			var13.method7441();
		} else {
			var13.method7400(arg11, false);
		}
		this.play(var13);
	}

	@ObfuscatedName("fb.ae(III)V")
	public void preloadSong(int arg0, int arg1) {
		if (this.currentSong == arg0) {
			return;
		}
		if (this.field1869 != null) {
			this.field1869.method7380(0);
			this.play(this.field1869);
			this.field1869 = null;
		}
		Sound var3 = this.createSound(SoundType.field1824, this, arg0, 0, arg1, SubBussType.MUSIC_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, 255, true);
		if (var3 != null) {
			var3.method7392();
			this.field1869 = var3;
		}
		this.field1870 = false;
	}

	@ObfuscatedName("fb.ag(I)I")
	public int getCurrentSong() {
		return this.currentSong;
	}

	@ObfuscatedName("fb.ah(II)V")
	public void setTitleScreenSong(int arg0) {
		this.titleScreenSong = arg0;
	}

	@ObfuscatedName("fb.al(I)I")
	public int getTitleScreenSong() {
		return this.titleScreenSong;
	}

	@ObfuscatedName("fb.ac(II)V")
	public void sendSongEnd(int arg0) {
		if (Client.gameConnection.randomOut != null && Client.isStateGame(Client.state)) {
			ClientMessage var2 = ClientMessage.createMessage(ClientProt.SOUND_SONGEND, Client.gameConnection.randomOut);
			var2.buf.p4(arg0);
			Client.gameConnection.queue(var2);
		}
	}

	@ObfuscatedName("fb.ai(II)V")
	public void playSong(int arg0) {
		this.playSong(arg0, 255);
	}

	@ObfuscatedName("fb.aw(IIB)V")
	public void playSong(int arg0, int arg1) {
		this.playSong(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@ObfuscatedName("fb.as(IIZIIIIIB)V")
	public void playSong(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (!this.field1860 || this.currentSong == arg0) {
			return;
		}
		if (this.field1857 && this.field1868 != null && this.currentSong != arg0) {
			this.field1868.method7382();
			this.field1868.method7377();
			this.sounds.remove(this.field1868);
		}
		Sound var9 = this.method3152();
		if (var9 != null && var9.method7386().method9680() == arg0) {
			this.field1868 = var9;
			this.currentSong = var9.method7386().method9680();
			return;
		}
		boolean var10 = false;
		if (this.currentSong >= 0) {
			Iterator var11 = this.sounds.iterator();
			while (var11.hasNext()) {
				Sound var12 = (Sound) var11.next();
				if (var12.getType() == SoundType.field1824) {
					var12.method7380(2000);
					var10 = true;
				}
			}
		}
		this.field1868 = null;
		this.currentSong = -1;
		Sound var13 = null;
		if (this.field1869 != null && this.field1869.method7386() != null && this.field1869.method7386().method9680() == arg0 && this.field1869.method7385() == SoundVolume.field4949) {
			var13 = this.field1869;
			this.field1869 = null;
			this.field1870 = false;
		}
		if (var13 == null) {
			if (arg2) {
				float var14 = (float) arg6;
				float var15 = (float) arg7;
				Vector3 var16 = new Vector3((float) arg4, 0.0F, (float) arg5);
				var13 = this.createSound(SoundType.field1824, this, arg0, 0, var10 ? 0 : arg1, this.titleScreenSong == arg0 ? BussType.MUSIC_LOGIN.getId() : SubBussType.MUSIC_SUB.getId(), SoundShape.field1834, var14, var15, var16, arg3, 255, true);
			} else {
				var13 = this.createSound(SoundType.field1824, this, arg0, 0, var10 ? 0 : arg1, this.titleScreenSong == arg0 ? BussType.MUSIC_LOGIN.getId() : SubBussType.MUSIC_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (var13 == null) {
			return;
		}
		if (var10) {
			float var17 = (float) arg1 / 255.0F;
			var13.method7403(var17, 2000);
		}
		var13.method7441();
		this.play(var13);
		this.field1868 = var13;
		this.currentSong = arg0;
		if (this.field1857) {
			this.field1868.method7381();
		}
		if (Client.gameConnection.randomOut != null && Client.isStateGame(Client.state)) {
			ClientMessage var18 = ClientMessage.createMessage(ClientProt.SOUND_SONGPRELOADED, Client.gameConnection.randomOut);
			var18.buf.p4(this.currentSong);
			Client.gameConnection.queue(var18);
		}
	}

	@ObfuscatedName("fb.at(I)Lrw;")
	public Sound method3152() {
		Iterator var1 = this.sounds.iterator();
		Sound var2;
		do {
			if (!var1.hasNext()) {
				return null;
			}
			var2 = (Sound) var1.next();
		} while (var2.getType() != SoundType.field1824 || var2.method7385() != SoundVolume.field4950);
		return var2;
	}

	@ObfuscatedName("fb.ad(I)V")
	public void stopSong() {
		Iterator var1 = this.sounds.iterator();
		while (var1.hasNext()) {
			Sound var2 = (Sound) var1.next();
			if (var2.getType() == SoundType.field1824) {
				var2.method7380(500);
				if (var2.method7386().method9680() == this.currentSong) {
					this.sendSongEnd(this.currentSong);
					break;
				}
			}
		}
		this.field1868 = null;
		this.currentSong = -1;
	}

	@ObfuscatedName("fb.am(III)V")
	public void playJingle(int arg0, int arg1) {
		if (!this.field1860 || this.field1857 && this.field1861 == arg0) {
			return;
		}
		if (this.field1857 && this.field1861 != arg0) {
			Iterator var3 = this.field1848.iterator();
			while (var3.hasNext()) {
				Sound var4 = (Sound) var3.next();
				if (var4.getType() == SoundType.field1826) {
					var4.method7377();
					this.sounds.remove(var4);
					this.field1857 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.field1857 && this.field1868 != null) {
			this.field1868.method7381();
		}
		Sound var5 = this.createSound(SoundType.field1826, this, arg0, 0, arg1, SubBussType.MUSIC_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, 255, true);
		if (var5 != null) {
			var5.method7441();
			this.play(var5);
			this.field1857 = true;
			this.field1861 = arg0;
		}
	}

	@ObfuscatedName("fb.au(Lfg;ILalh;B)V")
	public void playSequenceSound(SeqType arg0, int arg1, GraphEntity arg2) {
		if (arg0 == null || arg0.sound == null || arg1 >= arg0.sound.length || arg0.sound[arg1] == null || (Client.localPlayerEntity.level != arg2.level || !arg2.method18359())) {
			return;
		}
		int var4 = arg0.sound[arg1][0];
		int var5 = var4 >> 8;
		int var6 = var4 >> 5 & 0x7;
		int var7 = var4 & 0x1F;
		if (arg0.sound[arg1].length > 1) {
			int var8 = (int) (Math.random() * (double) arg0.sound[arg1].length);
			if (var8 > 0) {
				var5 = arg0.sound[arg1][var8];
			}
		}
		int var9 = 256;
		if (arg0.field1789 != null && arg0.field1790 != null) {
			var9 = (int) (Math.random() * (double) (arg0.field1790[arg1] - arg0.field1789[arg1])) + arg0.field1789[arg1];
		}
		int var10 = arg0.field1788 == null ? 255 : arg0.field1788[arg1];
		if (var7 != 0) {
			if (Client.localPlayerEntity == arg2) {
				if (Client.preferences.soundVolume.getValue() == 0) {
					return;
				}
			} else if (Client.preferences.backgroundSoundVolume.getValue() == 0) {
				return;
			}
			if (arg0.field1783 != -1) {
				int var11 = 0;
				if (arg2 instanceof PathingEntity) {
					var11 = ((PathingEntity) arg2).targeted();
				} else if (arg2 instanceof SpotAnimation) {
					var11 = ((SpotAnimation) arg2).targeted();
				} else if (arg2 instanceof ProjectileAnimation) {
					var11 = ((ProjectileAnimation) arg2).targeted();
				}
				if (var11 != 0 && var11 != Client.localPlayerEntity.targeted() && Client.activeTarget != var11) {
					var10 = arg0.field1783 * var10 / 100;
					if (var10 < 0) {
						var10 = 0;
					} else if (var10 > 255) {
						var10 = 255;
					}
				}
			}
			Vector3 var12 = arg2.getTransform().trans;
			int var13 = (int) var12.x - 256 >> 9;
			int var14 = (int) var12.z - 256 >> 9;
			Vector3 var15 = new Vector3((float) (var13 << 9), 0.0F, (float) (var14 << 9));
			int var16 = arg2.level << 24;
			this.playSound(SoundType.field1820, var5, var6, var10, SubBussType.NPC_ANIMATION_SUB.getId(), Client.localPlayerEntity == arg2 ? SoundShape.field1835 : SoundShape.field1838, 0.0F, (float) (var7 << 9), var15, var16, var9, 0);
		} else if (Client.localPlayerEntity == arg2) {
			this.playSound(SoundType.field1825, var5, var6, var10, SubBussType.PLAYER_ANIMATION_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, arg2.level, var9, 0);
		}
	}

	// line 916
	@ObfuscatedName("fb.ar(Lfg;II)V")
	public void playSequenceSound(SeqType arg0, int arg1) {
		if (arg0 == null || arg0.sound == null || arg1 >= arg0.sound.length || arg0.sound[arg1] == null) {
			return;
		}
		int var3 = arg0.sound[arg1][0];
		int var4 = var3 >> 8;
		int var5 = var3 >> 5 & 0x7;
		if (arg0.sound[arg1].length > 1) {
			int var6 = (int) (Math.random() * (double) arg0.sound[arg1].length);
			if (var6 > 0) {
				var4 = arg0.sound[arg1][var6];
			}
		}
		int var7 = 256;
		if (arg0.field1789 != null && arg0.field1790 != null) {
			var7 = (int) ((double) arg0.field1789[arg1] + Math.random() * (double) (arg0.field1790[arg1] - arg0.field1789[arg1]));
		}
		int var8 = arg0.field1788 == null ? 255 : arg0.field1788[arg1];
		this.playSound(SoundType.field1832, var4, var5, var8, SubBussType.NPC_ANIMATION_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var7, 0);
	}

	@ObfuscatedName("fq")
	public static class AudioApiRelated5 {

		// $FF: synthetic field
		public final AudioApi this$0;

		@ObfuscatedName("fq.e")
		public List field1845;

		// line 933
		public AudioApiRelated5(AudioApi arg0) {
			this.this$0 = arg0;
			this.field1845 = new ArrayList();
		}

		@ObfuscatedName("fq.e(Lrw;I)V")
		public void method3110(Sound arg0) {
			this.field1845.add(arg0);
		}

		@ObfuscatedName("fq.n(Lrw;I)V")
		public void method3114(Sound arg0) {
			this.field1845.remove(arg0);
		}

		@ObfuscatedName("fq.m(B)Ljava/util/List;")
		public List method3120() {
			return this.field1845;
		}

		@ObfuscatedName("fq.k(Lrw;I)Z")
		public boolean method3113(Sound arg0) {
			return this.field1845.contains(arg0);
		}
	}
}
