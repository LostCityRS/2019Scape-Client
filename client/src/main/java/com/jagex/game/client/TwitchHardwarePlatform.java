package com.jagex.game.client;

import com.jagex.game.script.ScriptRunner;
import com.jagex.client;
import com.jagex.game.shared.console.DeveloperConsole;
import com.jagex.core.util.CacheUtil;
import com.jagex.core.util.JagException;
import com.jagex.core.util.TextUtil;
import com.jagex.graphics.GraphicsPacketQueue;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.Sprite;
import com.jagex.twitchtv.*;
import deob.ObfuscatedName;
import deob.Statics;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

@ObfuscatedName("vv")
public class TwitchHardwarePlatform {

	@ObfuscatedName("vv.e")
	public static boolean field7377 = false;

	@ObfuscatedName("vv.z")
	public static float field7375 = 0.2F;

	@ObfuscatedName("vv.p")
	public static int field7398 = 1;

	@ObfuscatedName("vv.d")
	public static int field7387 = 4000;

	@ObfuscatedName("vv.c")
	public static int field7378 = 0;

	@ObfuscatedName("vv.r")
	public static int field7379 = 2000;

	@ObfuscatedName("vv.v")
	public static int field7388 = 0;

	@ObfuscatedName("vv.o")
	public static int field7381 = 0;

	@ObfuscatedName("vv.s")
	public static boolean[] field7371 = null;

	@ObfuscatedName("vv.y")
	public static String[] field7390 = null;

	@ObfuscatedName("vv.q")
	public static boolean field7384 = false;

	@ObfuscatedName("vv.b")
	public static long field7385 = 0L;

	@ObfuscatedName("vv.a")
	public static long field7386 = 0L;

	@ObfuscatedName("vv.g")
	public static long field7393 = 0L;

	@ObfuscatedName("vv.i")
	public static int field7382 = 0;

	@ObfuscatedName("vv.j")
	public static boolean field7389 = false;

	@ObfuscatedName("vv.t")
	public static boolean field7399 = false;

	@ObfuscatedName("vv.ac")
	public static TwitchWebcamFrameData field7391 = null;

	@ObfuscatedName("vv.ai")
	public static LinkedList field7392 = new LinkedList();

	@ObfuscatedName("vv.aw")
	public static LinkedList field7380 = new LinkedList();

	@ObfuscatedName("vv.at")
	public static int field7394 = -1;

	@ObfuscatedName("vv.ad")
	public static TwitchWebcamDevice[] field7395 = null;

	@ObfuscatedName("vv.am")
	public static long field7367 = 0L;

	@ObfuscatedName("vv.au")
	public static Sprite field7397 = null;

	@ObfuscatedName("vv.ar")
	public static boolean field7376 = false;

	@ObfuscatedName("vv.ap")
	public static boolean field7383 = false;

	public TwitchHardwarePlatform() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aar.e(I)V")
	public static void method14297() {
		field7394 = -1;
	}

	@ObfuscatedName("vb.n(B)I")
	public static int method9275() {
		return Statics.field4501 == null || field7394 >= Statics.field4501.streamCount - 1 ? -1 : ++field7394;
	}

	@ObfuscatedName("io.m(I)Lcm;")
	public static Sprite method4367() {
		return field7397;
	}

	@ObfuscatedName("qf.k(ZI)V")
	public static void method7320(boolean arg0) {
	}

	@ObfuscatedName("hq.f(ZI)V")
	public static void method3934(boolean arg0) {
	}

	@ObfuscatedName("tx.w(ZI)V")
	public static void method8882(boolean arg0) {
	}

	@ObfuscatedName("re.l(B)I")
	public static int method7716() {
		if (field7388 == 3) {
			return -1;
		} else if (field7388 == 0) {
			if (field7390 == null) {
				if (NativeLibraryConfig.field5074.startsWith("mac ")) {
					if (NativeLibraryConfig.field5076.startsWith("ppc")) {
						field7388 = 3;
						return -1;
					}
					field7390 = new String[3];
					field7390[0] = "sdk-mac-dynamic";
					field7390[1] = "twitchsdk";
					field7390[2] = "twitchtv";
					field7371 = new boolean[3];
					field7371[0] = false;
					field7371[1] = false;
					field7371[2] = true;
				} else if (NativeLibraryConfig.field5074.startsWith("win")) {
					field7390 = new String[6];
					field7390[0] = "avutil-ttv-51";
					field7390[1] = "libmp3lame-ttv";
					field7390[2] = "swresample-ttv-0";
					field7390[5] = "twitchtv";
					if (NativeLibraryConfig.field5076.startsWith("amd64") || NativeLibraryConfig.field5076.startsWith("x86_64")) {
						field7390[3] = "libmfxsw64";
						field7390[4] = "twitchsdk_64_release";
					} else if (NativeLibraryConfig.field5076.startsWith("i386") || NativeLibraryConfig.field5076.startsWith("i486") || NativeLibraryConfig.field5076.startsWith("i586") || NativeLibraryConfig.field5076.startsWith("x86")) {
						field7390[3] = "libmfxsw32";
						field7390[4] = "twitchsdk_32_release";
					} else {
						field7388 = 3;
						return -1;
					}
					field7371 = new boolean[6];
					field7371[0] = true;
					field7371[1] = true;
					field7371[2] = true;
					field7371[3] = false;
					field7371[4] = true;
					field7371[5] = true;
				} else {
					field7388 = 3;
					return -1;
				}
			}
			field7388 = 1;
			return 0;
		} else {
			return field7381;
		}
	}

	@ObfuscatedName("qx.u(I)I")
	public static int method7116() {
		return field7388;
	}

	@ObfuscatedName("rq.z(I)I")
	public static int method7603() {
		try {
			for (int var0 = 0; var0 < field7390.length; var0++) {
				if (field7390[var0] != null && field7371[var0]) {
					Statics.method5134().method7902(field7390[var0]);
				}
			}
		} catch (NativeLibraryException var3) {
			return 3;
		}
		Statics.field11755 = new TwitchTV();
		int var2 = Statics.field11755.InitialiseTTV(CacheUtil.method9844());
		if (var2 == 0) {
			field7384 = true;
		} else {
			JagException.report(10 + TextUtil.COMMA + var2, new RuntimeException());
		}
		return 2;
	}

	@ObfuscatedName("ff.d(Ljava/lang/String;Ljava/lang/String;B)I")
	public static int method3124(String arg0, String arg1) {
		if (field7384) {
			return client.method640() == client.field10849 ? Statics.field11755.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@ObfuscatedName("db.c(I)I")
	public static int method2107() {
		return Statics.field11755.GetLoginState();
	}

	@ObfuscatedName("th.r(I)I")
	public static int method8632() {
		if (field7384) {
			method8885(Statics.field8198);
			return Statics.field11755.Logout();
		} else {
			return 12;
		}
	}

	@ObfuscatedName("r.v(I)I")
	public static int method321() {
		return Statics.field11755.GetStreamState();
	}

	@ObfuscatedName("adv.o(IIIZI)I")
	public static int method15252(int arg0, int arg1, int arg2, boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		boolean var4 = NativeLibraryConfig.field5074.startsWith("mac");
		int[] var5 = Statics.field11755.GetRecommendedSettings(Statics.canvasWid, Statics.canvasHei, arg0, 2000, arg2, field7375, var4);
		if (var5[0] != 0) {
			return var5[0];
		}
		int var6 = var5[1];
		int var7 = var5[2];
		int var8 = var5[3];
		int var9 = var8;
		field7385 = 0L;
		Statics.field2584 = (long) (1000.0F / (float) arg2);
		Statics.field2585 = var6;
		Statics.field8526 = var7;
		if (arg1 != 0) {
			var8 = arg1 * var8 / 100;
		}
		DeveloperConsole.addline("Stream - Input: " + Statics.canvasWid + "x" + Statics.canvasHei + " (" + var9 + "kbps)" + " => " + "Output: " + var6 + "x" + var7 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + var8 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])");
		return Statics.field11755.StartStreaming(var6, var7, arg2, var8, arg1 != 0, field7375, field7398, arg3);
	}

	@ObfuscatedName("tk.s(Ldh;I)I")
	public static int method8885(Renderer arg0) {
		method4014();
		return Statics.field11755.StopStreaming();
	}

	@ObfuscatedName("hf.y(I)V")
	public static void method4014() {
		field7389 = false;
		Statics.field2899 = null;
		Statics.field894 = null;
		field7392.clear();
		field7380.clear();
		Statics.field8198.method2126();
	}

	@ObfuscatedName("nk.q(Ljava/lang/String;I)I")
	public static int method6056(String arg0) {
		return Statics.field11755.SetStreamTitle(arg0, client.field10768.field8341);
	}

	@ObfuscatedName("xk.x(I)I")
	public static int method10324() {
		return method5076() ? field7382 : 0;
	}

	@ObfuscatedName("il.b(ZI)V")
	public static void method4501(boolean arg0) {
		if (field7399 != arg0) {
			method4014();
			field7399 = arg0;
		}
	}

	@ObfuscatedName("ua.h(S)I")
	public static int method9008() {
		return Statics.field11755.GetChatState();
	}

	@ObfuscatedName("py.a(Ljava/lang/String;I)I")
	public static int method6966(String arg0) {
		return Statics.field11755.ChatSendMessage(arg0);
	}

	@ObfuscatedName("iy.g(B)Z")
	public static boolean method4595() {
		return NativeLibraryConfig.field5074.startsWith("win");
	}

	@ObfuscatedName("y.i(I)I")
	public static int method536() {
		return Statics.field11755.GetWebcamState();
	}

	@ObfuscatedName("hy.j(Ldh;J)V")
	public static void method4069(Renderer arg0, long arg1) {
		if (field7388 == 3 || field7388 == 0) {
			return;
		}
		if (field7388 == 1) {
			if (field7390 == null || field7390.length == 0) {
				throw new RuntimeException("");
			}
			int var3 = 0;
			for (int var4 = 0; var4 < field7390.length; var4++) {
				if (field7390[var4] == null) {
					var3 += 100;
				} else {
					try {
						var3 += Statics.field10577.method8464(field7390[var4], false);
					} catch (HardwarePlatformLoaderException var10) {
						GraphicsPacketQueue.method18474(NativeLibraryFailureType.field8907, var10.field11896, var10.field11897, var10.getCause());
						field7388 = 3;
						return;
					}
				}
			}
			field7381 = var3 / field7390.length;
			if (field7381 != 100) {
				return;
			}
			field7388 = method7603();
			if (field7388 != 2) {
				return;
			}
		}
		TwitchEvent[] var6 = Statics.field11755.Service();
		if (var6 != null) {
			for (int var7 = 0; var7 < var6.length; var7++) {
				TwitchEvent var8 = var6[var7];
				if (var8 != null && method6878(var8, arg1)) {
					TwitchVarType var9 = var8.method11();
					if (var9 != null) {
						ScriptRunner.method13907(var9.getId(), var8);
					}
				}
			}
		}
		if (Statics.field11755.IsStreaming() && arg1 - field7385 > Statics.field2584) {
			field7385 = arg1;
			if (arg0.method2196()) {
				field7389 = true;
			}
		}
		if (!Statics.field11755.IsStreaming()) {
			field7382 = 0;
		} else if (arg1 - field7386 < (long) field7387) {
			field7382 = 2;
		} else if (arg1 - field7393 < (long) field7387) {
			field7382 = 1;
		} else {
			field7382 = 0;
		}
		if (arg1 - field7367 > (long) field7379 && Statics.field11755.GetWebcamState() == 5) {
			Statics.field11755.RestartWebcamDevice();
			field7367 = arg1;
		}
	}

	@ObfuscatedName("h.t(Ldh;JIIB)V")
	public static void method593(Renderer arg0, long arg1, int arg2, int arg3) {
		if (arg0.method2360() && arg0.method2502() > -1) {
			int var5 = arg0.method2502();
			TwitchRelated2 var6 = null;
			if (!field7380.isEmpty()) {
				var6 = (TwitchRelated2) field7380.getFirst();
			}
			if (var6 != null && var6.field7401 == var5) {
				field7380.removeFirst();
				arg0.method2203();
				boolean var7 = false;
				int var10;
				if (var6.field7402.isEmpty() && arg0.method2153()) {
					long var8 = arg0.method2158(Statics.field2585, Statics.field8526);
					var10 = Statics.field11755.SubmitFrame(var8, arg0.method2304(), field7399, arg2, arg3);
					arg0.method2159(var8);
				} else {
					arg0.method2160(Statics.field2585, Statics.field8526, Statics.field2899, Statics.field894);
					method4456(Statics.field2899, var6.field7402, var6.field7405, var6.field7403, var6.field7404);
					var10 = Statics.field11755.SubmitFrameRaw(Statics.field2899, field7399, arg2, arg3);
				}
				arg0.method2204();
				if (var10 == 2072) {
					field7386 = arg1;
				} else if (var10 == 23) {
					field7393 = arg1;
				} else if (var10 != -995 && var10 != 0) {
				}
			} else {
				arg0.method2156();
				field7380.clear();
			}
		}
		if (!field7389) {
			return;
		}
		if (Statics.field2899 == null) {
			Statics.field2899 = new int[field7399 ? arg2 * arg3 : Statics.field8526 * Statics.field2585];
			Statics.field894 = new int[field7399 ? arg2 * arg3 : Statics.field8526 * Statics.field2585];
		}
		if (arg0.method2360()) {
			arg0.method2163(client.field10903, Statics.field2585, Statics.field8526);
			field7380.add(new TwitchRelated2(client.field10903, field7392, arg0.field1611, arg0.field1618, arg0.field1602));
			field7392 = new LinkedList();
		} else {
			arg0.method2203();
			arg0.method2160(Statics.field2585, Statics.field8526, Statics.field2899, Statics.field894);
			method4456(Statics.field2899, field7392, arg0.field1611, arg0.field1618, arg0.field1602);
			int var11 = Statics.field11755.SubmitFrameRaw(Statics.field2899, field7399, arg2, arg3);
			arg0.method2204();
			field7392.clear();
			if (var11 == 2072) {
				field7386 = arg1;
			} else if (var11 == 23) {
				field7393 = arg1;
			} else if (var11 != -995 && var11 != 0) {
			}
		}
		field7389 = false;
	}

	@ObfuscatedName("th.ae(I)Z")
	public static boolean method8634() {
		return field7389;
	}

	@ObfuscatedName("jh.ag(I)Z")
	public static boolean method5076() {
		return Statics.field11755 != null && Statics.field11755.IsStreaming();
	}

	@ObfuscatedName("qd.ah(Ldh;J)V")
	public static void method7259(Renderer arg0, long arg1) {
		arg0.method2126();
		field7392.clear();
		field7380.clear();
		field7385 = (long) field7378 + arg1;
	}

	@ObfuscatedName("pr.al(Lcom/jagex/twitchtv/TwitchEvent;J)Z")
	public static boolean method6878(TwitchEvent arg0, long arg1) {
		if (!field7377) {
			switch(arg0.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		if (arg0.eventType != 33) {
			if (arg0.eventType == 30) {
				int var5 = ((TwitchEventResult) arg0).result;
				if (var5 == 0 || var5 == 1) {
					Statics.method5177();
				} else if (var5 == 2) {
					field7367 = arg1;
				}
			}
			if (arg0.eventType == 34) {
				Statics.field4501 = (TwitchEventLiveStreams) arg0;
				Statics.method10361(34, 0);
			}
			return true;
		} else if (field7391 == null) {
			return false;
		} else {
			int var3 = ((TwitchEventResult) arg0).result;
			int var4 = Statics.field11755.GetWebcamFrameData(var3, field7391);
			if (var4 == 0) {
				if (field7376) {
					field7391.method22();
				}
				if (field7383) {
					field7391.method23();
				}
				method6846();
				field7367 = arg1;
				Statics.method10361(33, 0);
			} else {
				field7397 = null;
			}
			return false;
		}
	}

	@ObfuscatedName("ps.ai(B)V")
	public static void method6846() {
		if (field7397 != null && field7397.method1459() == field7391.width && field7397.method1435() == field7391.height) {
			field7397.method1469(0, 0, field7391.width, field7391.height, field7391.buffer, 0, field7391.width);
		} else {
			field7397 = Statics.field8198.method2188(field7391.buffer, 0, field7391.width, field7391.width, field7391.height, false);
		}
	}

	@ObfuscatedName("eu.aw(B)V")
	public static void method2739() {
		field7397 = null;
	}

	@ObfuscatedName("q.at(II)I")
	public static int method557(int arg0) {
		field7391 = null;
		field7397 = null;
		return arg0 >= 0 && arg0 < field7395.length ? Statics.field11755.StopWebcamDevice(field7395[arg0].field239) : -1;
	}

	@ObfuscatedName("aff.au(IB)Lcom/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method16410(int arg0) {
		if (field7395 == null) {
			return null;
		}
		for (int var1 = 0; var1 < field7395.length; var1++) {
			if (field7395[var1].field238 == arg0) {
				return field7395[var1];
			}
		}
		return null;
	}

	@ObfuscatedName("sc.ar(Ljava/lang/String;B)Lcom/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method8367(String arg0) {
		if (field7395 == null) {
			return null;
		}
		for (int var1 = 0; var1 < field7395.length; var1++) {
			if (field7395[var1].field236.equals(arg0)) {
				return field7395[var1];
			}
		}
		return null;
	}

	@ObfuscatedName("fn.aq(I)I")
	public static int method3065() {
		Statics.field4501 = null;
		return Statics.field11755.RequestLiveStreams(client.field10768.field8341);
	}

	@ObfuscatedName("ny.ax(B)I")
	public static int method5950() {
		return Statics.field11755.GetViewerCount();
	}

	@ObfuscatedName("kt.av(IIIII)V")
	public static void method5389(int arg0, int arg1, int arg2, int arg3) {
		field7392.addLast(new TwitchRelated(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@ObfuscatedName("ir.ao([ILjava/util/LinkedList;IIFI)V")
	public static void method4456(int[] arg0, LinkedList arg1, int arg2, int arg3, float arg4) {
		if (arg1.isEmpty()) {
			return;
		}
		for (int var5 = 0; var5 < arg1.size(); var5++) {
			TwitchRelated var6 = (TwitchRelated) arg1.get(var5);
			int var7 = (int) ((float) var6.field7364 * arg4) + arg2;
			int var8 = (int) ((float) var6.field7363 * arg4) + arg3;
			int var9 = (int) ((float) var6.field7365 * arg4);
			int var10 = (int) ((float) var6.field7362 * arg4);
			if (var7 < Statics.field2585 && var8 < Statics.field8526) {
				if (var7 + var9 > Statics.field2585) {
					var9 = Statics.field2585 - var7;
				}
				if (var8 + var10 > Statics.field8526) {
					var10 = Statics.field8526 - var8;
				}
				for (int var11 = var8; var11 < var8 + var10; var11++) {
					int var12 = Statics.field2585 * var11 + var7;
					Arrays.fill(arg0, var12, var9 + var12, -16777216);
				}
			}
		}
	}

	@ObfuscatedName("lv.aj(I)Z")
	public static boolean method5399() {
		if (NativeLibraryConfig.field5074.startsWith("win")) {
			String var0 = "msvcr110.dll";
			String var1 = "msvcp110.dll";
			String[] var2 = new String[] { var0, var1 };
			String var3 = System.getenv("WINDIR");
			if (var3 == "") {
				return false;
			}
			for (int var4 = 0; var4 < var2.length; var4++) {
				File var5 = new File(var3 + "\\system32\\" + var2[var4]);
				if (!var5.exists() || var5.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (NativeLibraryConfig.field5074.startsWith("mac")) {
			try {
				Process var6 = Runtime.getRuntime().exec("ps -few");
				BufferedReader var7 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
				try {
					int var8 = var6.waitFor();
					if (var8 != 0) {
						return false;
					}
				} catch (InterruptedException var13) {
					return false;
				}
				boolean var10 = false;
				String var11;
				while ((var11 = var7.readLine()) != null) {
					if (var11.toLowerCase().indexOf("soundflowerbed") != -1) {
						var10 = true;
						break;
					}
				}
				var7.close();
				return var10;
			} catch (Exception var14) {
				return false;
			}
		} else {
			return false;
		}
	}
}
