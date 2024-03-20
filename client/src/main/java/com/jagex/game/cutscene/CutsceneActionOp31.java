package com.jagex.game.cutscene;

import com.jagex.audio.stream.Sound;
import com.jagex.audio.stream.SoundShape;
import com.jagex.audio.stream.SoundType;
import com.jagex.audio.api.SubBussType;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("agz")
public class CutsceneActionOp31 extends CutsceneAction {

	@ObfuscatedName("agz.n")
	public final int field10337;

	@ObfuscatedName("agz.m")
	public final int field10334;

	@ObfuscatedName("agz.k")
	public final int field10333;

	@ObfuscatedName("agz.f")
	public final int field10336;

	@ObfuscatedName("agz.w")
	public Sound field10335;

	public CutsceneActionOp31(Packet arg0) {
		super(arg0);
		this.field10337 = arg0.g2();
		this.field10334 = arg0.g1();
		this.field10333 = arg0.g1();
		this.field10336 = arg0.g1();
		this.field10335 = Client.audioApi.createSound(SoundType.field1828, this, this.field10337, this.field10336, this.field10334, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, this.field10333, false);
		if (this.field10335 != null) {
			this.field10335.method7392();
		}
	}

	@ObfuscatedName("agz.n(I)V")
	public void method2890() {
		if (this.field10335 != null) {
			this.field10335.method7441();
		}
	}

	@ObfuscatedName("agz.m(I)V")
	public void method2896() {
		if (this.field10335 != null) {
			this.field10335.method7380(50);
			Client.audioApi.play(this.field10335);
			this.field10335 = null;
		}
	}
}
