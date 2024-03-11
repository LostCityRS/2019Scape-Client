package rs2.client.options;

import com.jagex.game.client.ClientOptions;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import deob.ObfuscatedName;

@ObfuscatedName("amf")
public class PreferencesParticles extends PreferencesOption {

	public PreferencesParticles(ClientOptions arg0) {
		super(arg0);
		ParticleSystemRenderer.method4293(this.field8416);
	}

	public PreferencesParticles(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
		ParticleSystemRenderer.method4293(this.field8416);
	}

	@ObfuscatedName("amf.o(I)V")
	public void method18465() {
		if (this.field8417.hardwareInfo().maxmemory() < 245) {
			this.field8416 = 0;
		}
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amf.e(B)I")
	public int method14069() {
		return this.field8417.hardwareInfo().maxmemory() < 245 ? 0 : 2;
	}

	@ObfuscatedName("amf.s(S)Z")
	public boolean method18466() {
		return this.field8417.hardwareInfo().maxmemory() >= 245;
	}

	@ObfuscatedName("amf.n(II)I")
	public int method14070(int arg0) {
		return this.field8417.hardwareInfo().maxmemory() < 245 ? 3 : 1;
	}

	@ObfuscatedName("amf.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
		ParticleSystemRenderer.method4293(this.field8416);
	}

	@ObfuscatedName("amf.y(I)I")
	public int method18468() {
		return this.field8416;
	}
}
