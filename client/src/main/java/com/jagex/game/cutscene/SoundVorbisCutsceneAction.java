package com.jagex.game.cutscene;

import com.jagex.audio.Sound;
import com.jagex.audio.SoundShape;
import com.jagex.audio.SoundType;
import com.jagex.audio.SubBussType;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("agu")
public class SoundVorbisCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agu.n")
	public final int field10323;

	@ObfuscatedName("agu.m")
	public final int field10324;

	@ObfuscatedName("agu.k")
	public final int field10325;

	@ObfuscatedName("agu.f")
	public final int field10326;

	@ObfuscatedName("agu.w")
	public Sound field10327;

	public SoundVorbisCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10323 = arg0.g2();
		this.field10324 = arg0.g1();
		this.field10325 = arg0.g1();
		this.field10326 = arg0.g1();
		this.field10327 = Client.audioApi.method3236(SoundType.field1828, this, this.field10323, this.field10326, this.field10324, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, this.field10325, false);
		if (this.field10327 != null) {
			this.field10327.method7392();
		}
	}

	@ObfuscatedName("agu.n(I)V")
	public void method2890() {
		if (this.field10327 != null) {
			this.field10327.method7441();
		}
	}

	@ObfuscatedName("agu.m(I)V")
	public void method2896() {
		if (this.field10327 != null) {
			this.field10327.method7380(50);
			Client.audioApi.method3185(this.field10327);
			this.field10327 = null;
		}
	}
}
