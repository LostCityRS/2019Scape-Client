package com.jagex.game.client;

import com.jagex.game.script.ClientScriptState;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("yi")
public final class TwitchCommands {

	@ObfuscatedName("yi.e")
	public static boolean field8194 = false;

	public TwitchCommands() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("u.e(Lyf;B)V")
	public static void ttv_library_request(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method7716();
	}

	@ObfuscatedName("sl.n(Lyf;I)V")
	public static void ttv_library_getstate(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method7116();
	}

	@ObfuscatedName("yx.m(Lyf;B)V")
	public static void ttv_login(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method3124(var1, var2);
	}

	@ObfuscatedName("gp.k(Lyf;S)V")
	public static void ttv_logout(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method8632();
	}

	@ObfuscatedName("mt.f(Lyf;I)V")
	public static void method5894(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method2107();
	}

	@ObfuscatedName("qv.w(Lyf;I)V")
	public static void method7360(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method321();
	}

	@ObfuscatedName("rq.l(Lyf;I)V")
	public static void ttv_stream_start(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method15252(var1, var2, var3, var4 != 0);
	}

	@ObfuscatedName("p.u(Lyf;B)V")
	public static void ttv_stream_stop(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method8885(Client.renderer);
	}

	@ObfuscatedName("yo.z(Lyf;S)V")
	public static void method10369(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] != 0;
		TwitchHardwarePlatform.method4501(var1);
	}

	@ObfuscatedName("io.p(Lyf;B)V")
	public static void method4368(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method5950();
	}

	@ObfuscatedName("sq.d(Lyf;I)V")
	public static void method8190(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method6056(var1);
	}

	@ObfuscatedName("fb.c(Lyf;B)V")
	public static void method3257(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method10324();
	}

	@ObfuscatedName("anu.r(Lyf;I)V")
	public static void method18699(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method9008();
	}

	@ObfuscatedName("qa.v(Lyf;I)V")
	public static void ttv_chat_sendmessage(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method6966(var1);
	}

	@ObfuscatedName("is.o(Lyf;I)V")
	public static void ttv_webcam_getstate(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method536();
	}

	@ObfuscatedName("ns.s(Lyf;I)V")
	public static void ttv_webcam_supported(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method4595() ? 1 : 0;
	}

	@ObfuscatedName("xu.y(Lyf;I)V")
	public static void ttv_webcam_getdevice_count(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method3123();
	}

	@ObfuscatedName("rl.q(Lyf;I)V")
	public static void ttv_webcam_getdevice_byindex(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		TwitchWebcamDevice var2 = TwitchHardwarePlatform.method16410(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8218[++arg0.field8211 - 1] = "";
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field238;
			arg0.field8218[++arg0.field8211 - 1] = var2.field236;
			arg0.field8218[++arg0.field8211 - 1] = var2.field237;
		}
	}

	@ObfuscatedName("fx.x(Lyf;I)V")
	public static void ttv_webcam_getdevice_byuniquename(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		TwitchWebcamDevice var2 = TwitchHardwarePlatform.method8367(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8218[++arg0.field8211 - 1] = "";
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field238;
			arg0.field8218[++arg0.field8211 - 1] = var2.field236;
			arg0.field8218[++arg0.field8211 - 1] = var2.field237;
		}
	}

	@ObfuscatedName("n.b(Lyf;I)V")
	public static void ttv_webcam_getcap_count(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		TwitchWebcamDevice var2 = TwitchHardwarePlatform.method16410(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.method28();
		}
	}

	@ObfuscatedName("fq.h(Lyf;B)V")
	public static void ttv_webcam_getcap_byindex(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		TwitchWebcamDevice var3 = TwitchHardwarePlatform.method16410(var1);
		TwitchWebcamDeviceCapability var4 = null;
		if (var3 != null) {
			var4 = var3.method26(var2);
		}
		if (var4 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var4.field214;
			arg0.field8216[++arg0.field8226 - 1] = var4.field215;
			arg0.field8216[++arg0.field8226 - 1] = var4.field216;
			arg0.field8216[++arg0.field8226 - 1] = var4.field217;
			arg0.field8216[++arg0.field8226 - 1] = var4.field218;
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("tr.a(Lyf;I)V")
	public static void method8427(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		TwitchWebcamDevice var3 = TwitchHardwarePlatform.method16410(var1);
		TwitchWebcamDeviceCapability var4 = null;
		if (var3 != null) {
			var4 = var3.method27(var2);
		}
		if (var4 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var4.field214;
			arg0.field8216[++arg0.field8226 - 1] = var4.field215;
			arg0.field8216[++arg0.field8226 - 1] = var4.field216;
			arg0.field8216[++arg0.field8226 - 1] = var4.field217;
			arg0.field8216[++arg0.field8226 - 1] = var4.field218;
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("sj.g(Lyf;B)V")
	public static void method8356(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[arg0.field8226] = TwitchHardwarePlatform.method4596(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1]);
		arg0.field8226++;
	}

	@ObfuscatedName("ni.i(Lyf;I)V")
	public static void ttv_webcam_stop(ClientScriptState arg0) {
		int var1 = TwitchHardwarePlatform.method557(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1;
	}

	@ObfuscatedName("p.j(Lyf;B)V")
	public static void ttv_webcam_flip(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		boolean var1 = arg0.field8216[arg0.field8226] != 0;
		boolean var2 = arg0.field8216[arg0.field8226 + 1] != 0;
		TwitchHardwarePlatform.method2011(var1, var2);
	}

	@ObfuscatedName("hh.t(Lyf;B)V")
	public static void ttv_livestreams_update(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method3065();
	}

	@ObfuscatedName("iw.ae(Lyf;I)V")
	public static void method4519(ClientScriptState arg0) {
		TwitchHardwarePlatform.method14297();
		method2012(arg0);
	}

	@ObfuscatedName("dk.ag(Lyf;I)V")
	public static void method2012(ClientScriptState arg0) {
		int var1 = TwitchHardwarePlatform.method9275();
		if (var1 >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.field4501.viewerCounts[var1];
			arg0.field8218[++arg0.field8211 - 1] = TwitchHardwarePlatform.field4501.channelUrls[var1];
			arg0.field8218[++arg0.field8211 - 1] = TwitchHardwarePlatform.field4501.previewUrlTemplates[var1];
			arg0.field8218[++arg0.field8211 - 1] = TwitchHardwarePlatform.field4501.streamTitles[var1];
			arg0.field8218[++arg0.field8211 - 1] = TwitchHardwarePlatform.field4501.channelDisplayNames[var1];
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("u.ah(Lyf;I)V")
	public static void ttv_setdebugoutput(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		if (field8194) {
			TwitchHardwarePlatform.method7320(arg0.field8216[arg0.field8226] != 0);
			TwitchHardwarePlatform.method3934(arg0.field8216[arg0.field8226 + 1] != 0);
			TwitchHardwarePlatform.method8882(arg0.field8216[arg0.field8226 + 2] != 0);
		}
	}

	@ObfuscatedName("gb.al(Lyf;I)V")
	public static void ttv_hasprerequisites(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = TwitchHardwarePlatform.method5399() ? 1 : 0;
	}
}
