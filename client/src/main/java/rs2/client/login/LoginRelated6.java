package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.game.load.LoadingScreenAlignmentX;
import com.jagex.game.load.LoadingScreenAlignmentY;
import com.jagex.game.load.LoadingScreenElementConfig;
import com.jagex.game.load.LoadingScreenElementType;
import deob.ObfuscatedName;

@ObfuscatedName("lv")
public class LoginRelated6 implements LoadingScreenElementConfig {

	@ObfuscatedName("lv.e")
	public final String field3203;

	@ObfuscatedName("lv.n")
	public final LoadingScreenAlignmentX field3201;

	@ObfuscatedName("lv.m")
	public final LoadingScreenAlignmentY field3208;

	@ObfuscatedName("lv.k")
	public final int field3204;

	@ObfuscatedName("lv.f")
	public final int field3205;

	@ObfuscatedName("lv.w")
	public final int field3210;

	@ObfuscatedName("lv.l")
	public final int field3207;

	@ObfuscatedName("lv.u")
	public final int field3202;

	@ObfuscatedName("lv.z")
	public final int field3209;

	@ObfuscatedName("lv.p")
	public final int field3206;

	@ObfuscatedName("lv.d")
	public final int field3211;

	@ObfuscatedName("lv.c")
	public final int field3212;

	@ObfuscatedName("lv.r")
	public final int field3213;

	public LoginRelated6(String arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		this.field3203 = arg0;
		this.field3201 = arg1;
		this.field3208 = arg2;
		this.field3204 = arg3;
		this.field3205 = arg4;
		this.field3210 = arg5;
		this.field3207 = arg6;
		this.field3202 = arg7;
		this.field3209 = arg8;
		this.field3206 = arg9;
		this.field3211 = arg10;
		this.field3212 = arg11;
		this.field3213 = arg12;
	}

	@ObfuscatedName("eq.e(Lalw;B)Llv;")
	public static LoginRelated6 method2836(Packet arg0) {
		String var1 = arg0.gjstr();
		LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var4 = arg0.g2s();
		int var5 = arg0.g2s();
		int var6 = arg0.g1();
		int var7 = arg0.g1();
		int var8 = arg0.g1();
		int var9 = arg0.g2();
		int var10 = arg0.g2();
		int var11 = arg0.gSmart2or4null();
		int var12 = arg0.g4s();
		int var13 = arg0.g4s();
		return new LoginRelated6(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}

	@ObfuscatedName("lv.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3187;
	}
}
