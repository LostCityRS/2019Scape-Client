package rs2.client.options;

import com.jagex.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ame")
public class PreferencesUnused11 extends PreferencesOption {

	public PreferencesUnused11(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused11(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ame.o(B)V")
	public void method18393() {
		if (this.field8416 < 33 || this.field8416 > 200) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ame.e(B)I")
	public int method14069() {
		return 100;
	}

	@ObfuscatedName("ame.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ame.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ame.s(B)I")
	public int method18391() {
		return this.field8416;
	}
}
