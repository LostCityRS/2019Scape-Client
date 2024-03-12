package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.game.load.LoadingScreenElementConfig;
import com.jagex.game.load.LoadingScreenElementType;
import deob.ObfuscatedName;

@ObfuscatedName("li")
public class LoginRelated5 implements LoadingScreenElementConfig {

	@ObfuscatedName("li.e")
	public final int field3200;

	public LoginRelated5(int arg0) {
		this.field3200 = arg0;
	}

	@ObfuscatedName("uc.e(Lalw;I)Lli;")
	public static LoginRelated5 method8975(Packet arg0) {
		int var1 = arg0.gSmart2or4null();
		return new LoginRelated5(var1);
	}

	@ObfuscatedName("li.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3195;
	}
}
