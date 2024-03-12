package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.game.load.LoadingScreenAlignmentX;
import com.jagex.game.load.LoadingScreenAlignmentY;
import com.jagex.game.load.LoadingScreenElementConfig;
import com.jagex.game.load.LoadingScreenElementType;
import deob.ObfuscatedName;

@ObfuscatedName("km")
public class LoginRelated4 implements LoadingScreenElementConfig {

	@ObfuscatedName("km.k")
	public final LoadingScreenAlignmentX field3177;

	@ObfuscatedName("km.f")
	public final LoadingScreenAlignmentY field3172;

	@ObfuscatedName("km.w")
	public final int field3174;

	@ObfuscatedName("km.l")
	public final int field3171;

	@ObfuscatedName("km.u")
	public final int field3175;

	@ObfuscatedName("km.z")
	public final int field3176;

	@ObfuscatedName("km.p")
	public final int field3168;

	public LoginRelated4(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field3177 = arg0;
		this.field3172 = arg1;
		this.field3174 = arg2;
		this.field3171 = arg3;
		this.field3175 = arg4;
		this.field3176 = arg5;
		this.field3168 = arg6;
	}

	@ObfuscatedName("acp.e(Lalw;I)Lkm;")
	public static LoginRelated4 method15034(Packet arg0) {
		LoadingScreenAlignmentX var1 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var2 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var3 = arg0.g2s();
		int var4 = arg0.g2s();
		int var5 = arg0.gSmart2or4null();
		int var6 = arg0.g4s();
		int var7 = arg0.g1();
		return new LoginRelated4(var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfuscatedName("km.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3197;
	}
}
