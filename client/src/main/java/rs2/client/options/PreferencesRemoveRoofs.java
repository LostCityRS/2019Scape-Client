package rs2.client.options;

import com.jagex.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amo")
public class PreferencesRemoveRoofs extends PreferencesOption {

	public PreferencesRemoveRoofs(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesRemoveRoofs(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amo.o(I)V")
	public void method18495() {
		if (this.field8417.unknown4.method18504() == 2 && this.field8416 == 2) {
			this.field8416 = 1;
		}
		if (this.field8416 < 0 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amo.e(B)I")
	public int method14069() {
		return 2;
	}

	@ObfuscatedName("amo.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amo.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amo.s(I)I")
	public int method18496() {
		return this.field8416;
	}
}
