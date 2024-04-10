package rs2.client.login;

import com.jagex.core.utils.PingRequest;
import com.jagex.core.utils.StringComparator;
import com.jagex.game.client.ServerAddress;
import com.jagex.game.client.ServerPorts;
import com.jagex.game.client.ServerType;
import com.jagex.game.shared.framework.gwc.GWC;
import com.jagex.game.shared.framework.gwc.GWCWorld;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("abz")
public class WorldSwitcher {

	@ObfuscatedName("abz.e")
	public static ServerAddress currentLobby;

	@ObfuscatedName("abz.n")
	public static ServerAddress content;

	@ObfuscatedName("abz.m")
	public static ServerAddress httpContent;

	@ObfuscatedName("abz.k")
	public static ServerAddress currentWorld;

	@ObfuscatedName("abz.f")
	public static ServerAddress world;

	@ObfuscatedName("adz.w")
	public static ServerAddress field9200;

	@ObfuscatedName("abz.l")
	public static ServerAddress field8753;

	@ObfuscatedName("k.u")
	public static boolean transferCancellable;

	@ObfuscatedName("abz.z")
	public static boolean field8754 = false;

	@ObfuscatedName("ic.p")
	public static long field2826;

	@ObfuscatedName("abz.c")
	public static GWCWorld[] field8748 = new GWCWorld[0];

	@ObfuscatedName("abz.r")
	public static int field8756 = 1001127;

	@ObfuscatedName("abz.v")
	public static int field8757 = 0;

	@ObfuscatedName("abz.o")
	public static PingRequest field8750 = null;

	@ObfuscatedName("abz.s")
	public static boolean field8759 = false;

	public WorldSwitcher() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ev.e(I)V")
	public static void method2778() {
		if (!field8759) {
			return;
		}
		if (field8757 < GWC.field7414) {
			field8757 = GWC.field7414;
		}
		while (true) {
			while (field8757 < GWC.field3011) {
				GWCWorld var0 = GWC.method4944(field8757);
				if (var0 != null && var0.field11707 == -1) {
					if (field8750 == null) {
						field8750 = Client.inetAddressLookupRequest.method10589(var0.field11703);
					}
					int var1 = field8750.hostpacked;
					if (var1 == -1) {
						return;
					}
					var0.field11707 = var1;
					field8757++;
					field8750 = null;
				} else {
					field8757++;
				}
			}
			return;
		}
	}

	@ObfuscatedName("vu.n(ILjava/lang/String;III)Z")
	public static boolean setWorld(int arg0, String arg1, int arg2, int arg3) {
		currentWorld = new ServerAddress();
		currentWorld.node = arg0;
		currentWorld.host = arg1;
		currentWorld.port = arg2;
		currentWorld.port2 = arg3;
		return true;
	}

	@ObfuscatedName("dy.m(Ljava/lang/String;II)V")
	public static void method2105(String arg0, int arg1) {
		if (currentLobby == null) {
			currentLobby = new ServerAddress();
		}
		currentLobby.host = arg0;
		currentLobby.node = arg1 + 1099;
		currentLobby.port = ServerPorts.method2912(Client.modewhere, ServerType.field8346, currentLobby.node);
		currentLobby.port2 = ServerPorts.method10147(Client.modewhere, ServerType.field8346, currentLobby.node);
	}

	@ObfuscatedName("xq.k(I)V")
	public static void method10337() {
		if (field9200.node != -1) {
			setWorld(field9200.node, field9200.host, field9200.port, field9200.port2);
		}
	}

	@ObfuscatedName("ym.w(I)Lalc;")
	public static GWCWorld method13782() {
		field8756 = 0;
		return method6048();
	}

	@ObfuscatedName("nn.l(I)Lalc;")
	public static GWCWorld method6048() {
		return field8756 < field8748.length ? field8748[++field8756 - 1] : null;
	}

	@ObfuscatedName("o.u(I)Lalc;")
	public static GWCWorld method477() {
		return GWC.method4944(currentWorld.node);
	}

	@ObfuscatedName("kt.z(IZIZB)V")
	public static void method5394(int arg0, boolean arg1, int arg2, boolean arg3) {
		method3107(0, field8748.length - 1, arg0, arg1, arg2, arg3);
		field8757 = 0;
		field8750 = null;
	}

	@ObfuscatedName("fp.p(IIIZIZI)V")
	public static void method3107(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		int var6 = (arg0 + arg1) / 2;
		int var7 = arg0;
		GWCWorld var8 = field8748[var6];
		field8748[var6] = field8748[arg1];
		field8748[arg1] = var8;
		for (int var9 = arg0; var9 < arg1; var9++) {
			if (method3592(field8748[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
				GWCWorld var10 = field8748[var9];
				field8748[var9] = field8748[var7];
				field8748[var7++] = var10;
			}
		}
		field8748[arg1] = field8748[var7];
		field8748[var7] = var8;
		method3107(arg0, var7 - 1, arg2, arg3, arg4, arg5);
		method3107(var7 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("gh.d(Lalc;Lalc;IZIZI)I")
	public static int method3592(GWCWorld arg0, GWCWorld arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		int var6 = method2856(arg0, arg1, arg2, arg3);
		if (var6 != 0) {
			return arg3 ? -var6 : var6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			int var7 = method2856(arg0, arg1, arg4, arg5);
			return arg5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("ef.c(Lalc;Lalc;IZB)I")
	public static int method2856(GWCWorld arg0, GWCWorld arg1, int arg2, boolean arg3) {
		if (arg2 == 1) {
			int var4 = arg0.field7641;
			int var5 = arg1.field7641;
			if (!arg3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (arg2 == 2) {
			return StringComparator.method6827(arg0.method18336(), arg1.method18336(), Client.language);
		} else if (arg2 == 3) {
			if (arg0.field11704.equals("-")) {
				if (arg1.field11704.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.field11704.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return StringComparator.method6827(arg0.field11704, arg1.field11704, Client.language);
			}
		} else if (arg2 == 4) {
			return arg0.method9747() ? (arg1.method9747() ? 0 : 1) : (arg1.method9747() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method9750() ? (arg1.method9750() ? 0 : 1) : (arg1.method9750() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method9746() ? (arg1.method9746() ? 0 : 1) : (arg1.method9746() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method9744() ? (arg1.method9744() ? 0 : 1) : (arg1.method9744() ? -1 : 0);
		} else if (arg2 == 8) {
			int var6 = arg0.field11707;
			int var7 = arg1.field11707;
			if (arg3) {
				if (var6 == 1000) {
					var6 = -1;
				}
				if (var7 == 1000) {
					var7 = -1;
				}
			} else {
				if (var6 == -1) {
					var6 = 1000;
				}
				if (var7 == -1) {
					var7 = 1000;
				}
			}
			return var6 - var7;
		} else {
			return arg0.field11705 - arg1.field11705;
		}
	}
}
