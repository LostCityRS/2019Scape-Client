package com.jagex;

import com.jagex.twitchtv.TwitchEventResult;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class LoginProt {

	@OriginalMember(owner = "client!nf", name = "jg", descriptor = "I")
	static int anInt4803;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!nf;")
	public static final LoginProt INIT_GAME_CONNECTION = new LoginProt(14, 0);

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!nf;")
	public static final LoginProt INIT_JS5REMOTE_CONNECTION = new LoginProt(15, -1);

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!nf;")
	public static final LoginProt GAMELOGIN = new LoginProt(16, -2);

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Lclient!nf;")
	public static final LoginProt LOBBYLOGIN = new LoginProt(19, -2);

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!nf;")
	public static final LoginProt REQUEST_WORLDLIST = new LoginProt(23, 4);

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!nf;")
	public static final LoginProt CHECK_WORLD_SUITABILITY = new LoginProt(24, -1);

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!nf;")
	public static final LoginProt GAMELOGIN_CONTINUE = new LoginProt(26, 0);

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!nf;")
	public static final LoginProt SSL_WEBCONNECTION = new LoginProt(27, 0);

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!nf;")
	public static final LoginProt CREATE_ACCOUNT_CONNECT = new LoginProt(28, -2);

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!nf;")
	public static final LoginProt INIT_SOCIAL_NETWORK_CONNECTION = new LoginProt(29, -2);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!nf;")
	public static final LoginProt SOCIAL_NETWORK_LOGIN = new LoginProt(30, -2);

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!nf;")
	public static final LoginProt INIT_DEBUG_CONNECTION = new LoginProt(31, 4);

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "[Lclient!nf;")
	static final LoginProt[] PACKETS = new LoginProt[32];

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public final int opcode;

	static {
		@Pc(77) LoginProt[] all = getAllPackets();
		for (@Pc(79) int i = 0; i < all.length; i++) {
			PACKETS[all[i].opcode * 663664571] = all[i];
		}
	}

	@OriginalMember(owner = "client!nf", name = "ao", descriptor = "(III)V")
	static void method29129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class601 local8 = local5.f();
		if (local8 != null) {
			Class312.method27463(local8.getId(), local5, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "(B)I")
	public static int method29130(@OriginalArg(0) byte arg0) {
		return Class669.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!nf", name = "aq", descriptor = "(Lclient!yp;I)V")
	static void method29131(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		if (arg0.anIntArray525[arg0.anInt5778 * 1896589581] > arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!nf", name = "aya", descriptor = "(Lclient!yp;I)V")
	static void method29132(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!nf", name = "bdq", descriptor = "(Lclient!yp;S)V")
	static void method29133(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local12, 326461728).anInt3920 * -1506819259;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	static void method29134(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class149.aString48 = Class149.aString48.trim();
		Class149.anInt1525 = 0;
		if (Class149.aString48.length() == 0) {
			Class149.anInt1523 = 0;
			return;
		}
		Class294.method26961("--> " + Class149.aString48, 1455295997);
		Class138.method11536(Class149.aString48, false, arg0, (byte) 70);
		if (arg0) {
			Class149.anInt1523 = Class149.aString48.length() * -1734720461;
		} else {
			Class149.anInt1523 = 0;
			Class149.aString48 = "";
		}
	}

	@OriginalMember(owner = "client!nf", name = "mz", descriptor = "(II)V")
	static void method29135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) Class80 local3 = client.aClass24_21.method580((byte) -18); local3 != null; local3 = client.aClass24_21.method566((byte) 7)) {
			if ((local3.aLong338 * 3209506792906532031L >> 48 & 0xFFFFL) == (long) arg0) {
				local3.method24395((byte) 112);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "aj", descriptor = "(Lclient!yp;I)V")
	static void method29136(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class374 local9 = (Class374) arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
		@Pc(32) Interface22 local32 = (Interface22) (arg0.anIntArray526[arg0.anInt5780 * -1336568839] == 0 ? arg0.aMap23.get(local9.aClass107_1.aClass143_6) : arg0.aMap24.get(local9.aClass107_1.aClass143_6));
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local32.method36978(local9, (byte) -29);
	}

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "(I)[Lclient!hd;")
	static Class309[] method29137(@OriginalArg(0) int arg0) {
		return new Class309[] { Class309.aClass309_2, Class309.aClass309_1, Class309.aClass309_3 };
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(II)V")
	LoginProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.opcode = opcode * -795773581;
	}

	@OriginalMember(owner = "client!id", name = "t", descriptor = "(I)[Lclient!nf;")
	static LoginProt[] getAllPackets() {
		return new LoginProt[] { SSL_WEBCONNECTION, CREATE_ACCOUNT_CONNECT, LOBBYLOGIN, CHECK_WORLD_SUITABILITY, INIT_SOCIAL_NETWORK_CONNECTION, INIT_DEBUG_CONNECTION, REQUEST_WORLDLIST, SOCIAL_NETWORK_LOGIN, GAMELOGIN, GAMELOGIN_CONTINUE, INIT_JS5REMOTE_CONNECTION, INIT_GAME_CONNECTION };
	}
}
