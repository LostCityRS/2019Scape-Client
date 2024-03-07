package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public class LoginProt {

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "Lclient!nu;")
	public static final LoginProt INIT_GAME_CONNECTION = new LoginProt(14, 0);

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "Lclient!nu;")
	public static final LoginProt INIT_JS5REMOTE_CONNECTION = new LoginProt(15, -1);

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "Lclient!nu;")
	public static final LoginProt GAMELOGIN = new LoginProt(16, -2);

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "Lclient!nu;")
	public static final LoginProt LOBBYLOGIN = new LoginProt(19, -2);

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "Lclient!nu;")
	public static final LoginProt REQUEST_WORLDLIST = new LoginProt(23, 4);

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "Lclient!nu;")
	public static final LoginProt CHECK_WORLD_SUITABILITY = new LoginProt(24, -1);

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "Lclient!nu;")
	public static final LoginProt GAMELOGIN_CONTINUE = new LoginProt(26, 0);

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "Lclient!nu;")
	public static final LoginProt SSL_WEBCONNECTION = new LoginProt(27, 0);

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "Lclient!nu;")
	public static final LoginProt CREATE_ACCOUNT_CONNECT = new LoginProt(28, -2);

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "Lclient!nu;")
	public static final LoginProt INIT_SOCIAL_NETWORK_CONNECTION = new LoginProt(29, -2);

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Lclient!nu;")
	public static final LoginProt SOCIAL_NETWORK_LOGIN = new LoginProt(30, -2);

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!nu;")
	public static final LoginProt INIT_DEBUG_CONNECTION = new LoginProt(31, 4);

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "[Lclient!nu;")
	public static final LoginProt[] BY_ID = new LoginProt[32];

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
	public final int opcode;

	static {
		@Pc(77) LoginProt[] all = values(-1396233847);
		for (@Pc(79) int i = 0; i < all.length; i++) {
			BY_ID[all[i].opcode * 1690737369] = all[i];
		}
	}

	@OriginalMember(owner = "client!acb", name = "e", descriptor = "(I)[Lclient!nu;", line = 28)
	public static LoginProt[] values(@OriginalArg(0) int arg0) {
		return new LoginProt[] {SSL_WEBCONNECTION, INIT_DEBUG_CONNECTION, INIT_JS5REMOTE_CONNECTION, LOBBYLOGIN, SOCIAL_NETWORK_LOGIN, CHECK_WORLD_SUITABILITY, INIT_SOCIAL_NETWORK_CONNECTION, GAMELOGIN_CONTINUE, REQUEST_WORLDLIST, CREATE_ACCOUNT_CONNECT, GAMELOGIN, INIT_GAME_CONNECTION};
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(II)V", line = 31)
	public LoginProt(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.opcode = arg0 * -864139927;
	}
}
