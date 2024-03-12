package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.game.load.LoadingScreenAlignmentX;
import com.jagex.game.load.LoadingScreenAlignmentY;
import com.jagex.game.load.LoadingScreenElementType;
import com.jagex.game.load.LoadingScreenProgressDisplayConfig;
import deob.ObfuscatedName;

@ObfuscatedName("ahs")
public class LoginScreenRelated2 extends LoadingScreenProgressDisplayConfig {

	@ObfuscatedName("ahs.p")
	public final int field10580;

	@ObfuscatedName("ahs.d")
	public final int field10579;

	public LoginScreenRelated2(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.field10580 = arg9;
		this.field10579 = arg10;
	}

	@ObfuscatedName("yd.k(Lalw;I)Lkp;")
	public static LoadingScreenProgressDisplayConfig method13796(Packet arg0) {
		LoadingScreenProgressDisplayConfig var1 = LoadingScreenProgressDisplayConfig.method18899(arg0);
		int var2 = arg0.g4s();
		int var3 = arg0.g4s();
		return new LoginScreenRelated2(var1.field3167, var1.field3159, var1.field3161, var1.field3162, var1.field3163, var1.field3160, var1.field3165, var1.field3166, var1.field3164, var2, var3);
	}

	@ObfuscatedName("ahs.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3188;
	}
}
