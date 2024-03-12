package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.game.load.LoadingScreenAlignmentX;
import com.jagex.game.load.LoadingScreenAlignmentY;
import com.jagex.game.load.LoadingScreenElementType;
import com.jagex.game.load.LoadingScreenSpriteConfig;
import deob.ObfuscatedName;

@ObfuscatedName("aht")
public class LoginScreenRelated3 extends LoadingScreenSpriteConfig {

	@ObfuscatedName("aht.w")
	public final int field10582;

	public LoginScreenRelated3(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field10582 = arg5;
	}

	@ObfuscatedName("aha.k(Lalw;I)Lla;")
	public static LoadingScreenSpriteConfig method16658(Packet arg0) {
		LoadingScreenSpriteConfig var1 = LoadingScreenSpriteConfig.method6073(arg0);
		int var2 = arg0.g3s();
		return new LoginScreenRelated3(var1.field3218, var1.field3215, var1.field3214, var1.field3216, var1.field3217, var2);
	}

	@ObfuscatedName("aht.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3192;
	}
}
