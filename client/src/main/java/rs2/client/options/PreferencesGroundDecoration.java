package rs2.client.options;

import com.jagex.ClientOptions;
import com.jagex.core.constants.ModeGame;
import deob.ObfuscatedName;

@ObfuscatedName("amc")
public class PreferencesGroundDecoration extends PreferencesOption {

	public PreferencesGroundDecoration(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesGroundDecoration(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amc.o(S)V")
	public void method18490() {
		if (this.field8417.modeGame() != ModeGame.RUNESCAPE) {
			this.field8416 = 1;
		}
		if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amc.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amc.s(B)Z")
	public boolean method18488() {
		return this.field8417.modeGame() == ModeGame.RUNESCAPE;
	}

	@ObfuscatedName("amc.n(II)I")
	public int method14070(int arg0) {
		return this.field8417.modeGame() == ModeGame.RUNESCAPE ? 1 : 3;
	}

	@ObfuscatedName("amc.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amc.y(I)I")
	public int method18489() {
		return this.field8416;
	}
}
