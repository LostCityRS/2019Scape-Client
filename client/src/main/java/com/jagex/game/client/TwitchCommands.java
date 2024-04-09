package com.jagex.game.client;

import com.jagex.game.script.ClientScriptState;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("yi")
public final class TwitchCommands {

	@ObfuscatedName("yi.e")
	public static boolean debugging = false;

	public TwitchCommands() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("u.e(Lyf;B)V")
	public static void ttv_library_request(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getHardwarePlatform();
	}

	@ObfuscatedName("sl.n(Lyf;I)V")
	public static void ttv_library_getstate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getHardwareState();
	}

	@ObfuscatedName("yx.m(Lyf;B)V")
	public static void ttv_login(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.login(var1, var2);
	}

	@ObfuscatedName("gp.k(Lyf;S)V")
	public static void ttv_logout(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.logout();
	}

	@ObfuscatedName("mt.f(Lyf;I)V")
	public static void ttv_login_getstate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getLoginState();
	}

	@ObfuscatedName("qv.w(Lyf;I)V")
	public static void ttv_stream_getstate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getStreamState();
	}

	@ObfuscatedName("rq.l(Lyf;I)V")
	public static void ttv_stream_start(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.startStream(var1, var2, var3, var4 != 0);
	}

	@ObfuscatedName("p.u(Lyf;B)V")
	public static void ttv_stream_stop(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.stopStream(Client.toolkit);
	}

	@ObfuscatedName("yo.z(Lyf;S)V")
	public static void ttv_stream_setsmoothresize(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] != 0;
		TwitchHardwarePlatform.setStreamSmoothResize(var1);
	}

	@ObfuscatedName("io.p(Lyf;B)V")
	public static void ttv_stream_getviewers(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getViewerCount();
	}

	@ObfuscatedName("sq.d(Lyf;I)V")
	public static void ttv_stream_settitle(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.setStreamTitle(var1);
	}

	@ObfuscatedName("fb.c(Lyf;B)V")
	public static void ttv_stream_getquality(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getStreamQuality();
	}

	@ObfuscatedName("anu.r(Lyf;I)V")
	public static void ttv_chat_getstate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getChatState();
	}

	@ObfuscatedName("qa.v(Lyf;I)V")
	public static void ttv_chat_sendmessage(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.sendChatMessage(var1);
	}

	@ObfuscatedName("is.o(Lyf;I)V")
	public static void ttv_webcam_getstate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getWebcamState();
	}

	@ObfuscatedName("ns.s(Lyf;I)V")
	public static void ttv_webcam_supported(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.isWebcamSupported() ? 1 : 0;
	}

	@ObfuscatedName("xu.y(Lyf;I)V")
	public static void ttv_webcam_getdevice_count(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.getWebcamDeviceCount();
	}

	@ObfuscatedName("rl.q(Lyf;I)V")
	public static void ttv_webcam_getdevice_byindex(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		TwitchWebcamDevice var2 = TwitchHardwarePlatform.getWebcamDeviceByIndex(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field238;
			arg0.objectStack[++arg0.osp - 1] = var2.field236;
			arg0.objectStack[++arg0.osp - 1] = var2.field237;
		}
	}

	@ObfuscatedName("fx.x(Lyf;I)V")
	public static void ttv_webcam_getdevice_byuniquename(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		TwitchWebcamDevice var2 = TwitchHardwarePlatform.getWebcamDeviceByName(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field238;
			arg0.objectStack[++arg0.osp - 1] = var2.field236;
			arg0.objectStack[++arg0.osp - 1] = var2.field237;
		}
	}

	@ObfuscatedName("n.b(Lyf;I)V")
	public static void ttv_webcam_getcap_count(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		TwitchWebcamDevice var2 = TwitchHardwarePlatform.getWebcamDeviceByIndex(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.method28();
		}
	}

	@ObfuscatedName("fq.h(Lyf;B)V")
	public static void ttv_webcam_getcap_byindex(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		TwitchWebcamDevice var3 = TwitchHardwarePlatform.getWebcamDeviceByIndex(var1);
		TwitchWebcamDeviceCapability var4 = null;
		if (var3 != null) {
			var4 = var3.method26(var2);
		}
		if (var4 != null) {
			arg0.intStack[++arg0.isp - 1] = var4.field214;
			arg0.intStack[++arg0.isp - 1] = var4.field215;
			arg0.intStack[++arg0.isp - 1] = var4.field216;
			arg0.intStack[++arg0.isp - 1] = var4.field217;
			arg0.intStack[++arg0.isp - 1] = var4.field218;
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("tr.a(Lyf;I)V")
	public static void ttv_webcam_getcap_byuniqueid(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		TwitchWebcamDevice var3 = TwitchHardwarePlatform.getWebcamDeviceByIndex(var1);
		TwitchWebcamDeviceCapability var4 = null;
		if (var3 != null) {
			var4 = var3.method27(var2);
		}
		if (var4 != null) {
			arg0.intStack[++arg0.isp - 1] = var4.field214;
			arg0.intStack[++arg0.isp - 1] = var4.field215;
			arg0.intStack[++arg0.isp - 1] = var4.field216;
			arg0.intStack[++arg0.isp - 1] = var4.field217;
			arg0.intStack[++arg0.isp - 1] = var4.field218;
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("sj.g(Lyf;B)V")
	public static void ttv_webcam_start(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[arg0.isp] = TwitchHardwarePlatform.startWebcamDevice(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1]);
		arg0.isp++;
	}

	@ObfuscatedName("ni.i(Lyf;I)V")
	public static void ttv_webcam_stop(ClientScriptState arg0) {
		int var1 = TwitchHardwarePlatform.stopWebcamDevice(arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = var1;
	}

	@ObfuscatedName("p.j(Lyf;B)V")
	public static void ttv_webcam_flip(ClientScriptState arg0) {
		arg0.isp -= 2;
		boolean var1 = arg0.intStack[arg0.isp] != 0;
		boolean var2 = arg0.intStack[arg0.isp + 1] != 0;
		TwitchHardwarePlatform.flipWebcamDevice(var1, var2);
	}

	@ObfuscatedName("hh.t(Lyf;B)V")
	public static void ttv_livestreams_update(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.updateLivestreams();
	}

	@ObfuscatedName("iw.ae(Lyf;I)V")
	public static void ttv_livestreams_getstream_start(ClientScriptState arg0) {
		TwitchHardwarePlatform.method14297();
		ttv_livestreams_getstream_next(arg0);
	}

	@ObfuscatedName("dk.ag(Lyf;I)V")
	public static void ttv_livestreams_getstream_next(ClientScriptState arg0) {
		int var1 = TwitchHardwarePlatform.method9275();
		if (var1 >= 0) {
			arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.field4501.viewerCounts[var1];
			arg0.objectStack[++arg0.osp - 1] = TwitchHardwarePlatform.field4501.channelUrls[var1];
			arg0.objectStack[++arg0.osp - 1] = TwitchHardwarePlatform.field4501.previewUrlTemplates[var1];
			arg0.objectStack[++arg0.osp - 1] = TwitchHardwarePlatform.field4501.streamTitles[var1];
			arg0.objectStack[++arg0.osp - 1] = TwitchHardwarePlatform.field4501.channelDisplayNames[var1];
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("u.ah(Lyf;I)V")
	public static void ttv_setdebugoutput(ClientScriptState arg0) {
		arg0.isp -= 3;
		if (debugging) {
			TwitchHardwarePlatform.debug1(arg0.intStack[arg0.isp] != 0);
			TwitchHardwarePlatform.debug2(arg0.intStack[arg0.isp + 1] != 0);
			TwitchHardwarePlatform.debug3(arg0.intStack[arg0.isp + 2] != 0);
		}
	}

	@ObfuscatedName("gb.al(Lyf;I)V")
	public static void ttv_hasprerequisites(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = TwitchHardwarePlatform.hasPrerequisites() ? 1 : 0;
	}
}
