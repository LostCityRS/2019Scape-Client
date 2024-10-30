package com.jagex.game.network.protocol;

import deob.ObfuscatedName;

@ObfuscatedName("nu")
public class LoginProt {

	@ObfuscatedName("nu.e")
	public static final LoginProt INIT_GAME_CONNECTION = new LoginProt(14, 0);

	@ObfuscatedName("nu.n")
	public static final LoginProt INIT_JS5REMOTE_CONNECTION = new LoginProt(15, -1);

	@ObfuscatedName("nu.m")
	public static final LoginProt GAMELOGIN = new LoginProt(16, -2);

	@ObfuscatedName("nu.k")
	public static final LoginProt LOBBYLOGIN = new LoginProt(19, -2);

	@ObfuscatedName("nu.f")
	public static final LoginProt REQUEST_WORLDLIST = new LoginProt(23, 4);

	@ObfuscatedName("nu.w")
	public static final LoginProt CHECK_WORLD_SUITABILITY = new LoginProt(24, -1);

	@ObfuscatedName("nu.l")
	public static final LoginProt GAMELOGIN_CONTINUE = new LoginProt(26, 0);

	@ObfuscatedName("nu.u")
	public static final LoginProt SSL_WEBCONNECTION = new LoginProt(27, 0);

	@ObfuscatedName("nu.z")
	public static final LoginProt CREATE_ACCOUNT_CONNECT = new LoginProt(28, -2);

	@ObfuscatedName("nu.p")
	public static final LoginProt INIT_SOCIAL_NETWORK_CONNECTION = new LoginProt(29, -2);

	@ObfuscatedName("nu.d")
	public static final LoginProt SOCIAL_NETWORK_LOGIN = new LoginProt(30, -2);

	@ObfuscatedName("nu.c")
	public static final LoginProt INIT_DEBUG_CONNECTION = new LoginProt(31, 4);

	@ObfuscatedName("nu.r")
	public final int id;

	@ObfuscatedName("nu.v")
	public static final LoginProt[] BY_ID = new LoginProt[32];

	static {
		LoginProt[] var0 = values();
		for (int var1 = 0; var1 < var0.length; var1++) {
			BY_ID[var0[var1].id] = var0[var1];
		}
	}

	@ObfuscatedName("acb.e(I)[Lnu;")
	public static LoginProt[] values() {
		return new LoginProt[] { SSL_WEBCONNECTION, INIT_DEBUG_CONNECTION, INIT_JS5REMOTE_CONNECTION, LOBBYLOGIN, SOCIAL_NETWORK_LOGIN, CHECK_WORLD_SUITABILITY, INIT_SOCIAL_NETWORK_CONNECTION, GAMELOGIN_CONTINUE, REQUEST_WORLDLIST, CREATE_ACCOUNT_CONNECT, GAMELOGIN, INIT_GAME_CONNECTION };
	}

	public LoginProt(int arg0, int arg1) {
		this.id = arg0;
	}
}
