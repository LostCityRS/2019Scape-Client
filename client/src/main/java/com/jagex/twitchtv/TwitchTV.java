package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchTV")
public class TwitchTV {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "e", descriptor = "I")
	public static final int e = 0;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "n", descriptor = "I")
	public static final int n = 12;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "m", descriptor = "I")
	public static final int m = 23;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "k", descriptor = "I")
	public static final int k = 42;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "f", descriptor = "I")
	public static final int f = 2072;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "w", descriptor = "I")
	public static final int w = -995;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "l", descriptor = "I")
	public static final int l = 7;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "u", descriptor = "I")
	public static final int u = 8;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "z", descriptor = "I")
	public static final int z = 9;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "p", descriptor = "I")
	public static final int p = 10;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "d", descriptor = "I")
	public static final int d = 30;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "c", descriptor = "I")
	public static final int c = 33;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "r", descriptor = "I")
	public static final int r = 34;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "v", descriptor = "I")
	public static final int v = 5;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "o", descriptor = "I")
	public static final int o = 0;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "s", descriptor = "I")
	public static final int s = 1;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "y", descriptor = "I")
	public static final int y = 2;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "InitialiseTTV", descriptor = "(Ljava/lang/String;)I")
	public native int InitialiseTTV(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "ShutdownTTV", descriptor = "()I")
	public native int ShutdownTTV();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "Login", descriptor = "(Ljava/lang/String;Ljava/lang/String;)I")
	public native int Login(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "Logout", descriptor = "()I")
	public native int Logout();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetUsername", descriptor = "()Ljava/lang/String;")
	public native String GetUsername();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "Service", descriptor = "()[Lclient!com/jagex/twitchtv/TwitchEvent;")
	public native TwitchEvent[] Service();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetLoginState", descriptor = "()I")
	public native int GetLoginState();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "SetAuthResponse", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public native void SetAuthResponse(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "RequestLiveStreams", descriptor = "(Ljava/lang/String;)I")
	public native int RequestLiveStreams(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "StartStreaming", descriptor = "(IIIIZFIZ)I")
	public native int StartStreaming(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "Pause", descriptor = "()I")
	public native int Pause();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetStreamState", descriptor = "()I")
	public native int GetStreamState();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "IsStreaming", descriptor = "()Z")
	public native boolean IsStreaming();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "IsReadyToStream", descriptor = "()Z")
	public native boolean IsReadyToStream();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "FlushStreamingEvents", descriptor = "()V")
	public native void FlushStreamingEvents();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "StopStreaming", descriptor = "()I")
	public native int StopStreaming();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "RunCommercial", descriptor = "()I")
	public native int RunCommercial();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetNextFreeFrameBuffer", descriptor = "()J")
	public native long GetNextFreeFrameBuffer();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "SubmitFrame", descriptor = "(JZZII)I")
	public native int SubmitFrame(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "SubmitFrameRaw", descriptor = "([IZII)I")
	public native int SubmitFrameRaw(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetRecommendedSettings", descriptor = "(IIIIIFZ)[I")
	public native int[] GetRecommendedSettings(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "SetUserStreamRefreshInterval", descriptor = "(I)V")
	public native void SetUserStreamRefreshInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetViewerCount", descriptor = "()I")
	public native int GetViewerCount();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "SetStreamTitle", descriptor = "(Ljava/lang/String;Ljava/lang/String;)I")
	public native int SetStreamTitle(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "ChatSendMessage", descriptor = "(Ljava/lang/String;)I")
	public native int ChatSendMessage(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetChatState", descriptor = "()I")
	public native int GetChatState();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetWebcamState", descriptor = "()I")
	public native int GetWebcamState();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetWebcamFrameData", descriptor = "(ILclient!com/jagex/twitchtv/TwitchWebcamFrameData;)I")
	public native int GetWebcamFrameData(@OriginalArg(0) int arg0, @OriginalArg(1) TwitchWebcamFrameData arg1);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetWebcamFrameResolution", descriptor = "(I)[I")
	public native int[] GetWebcamFrameResolution(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "StartWebcamDevice", descriptor = "(II)I")
	public native int StartWebcamDevice(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "StopWebcamDevice", descriptor = "(I)I")
	public native int StopWebcamDevice(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "GetWebcamDevices", descriptor = "()[Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public native TwitchWebcamDevice[] GetWebcamDevices();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchTV", name = "RestartWebcamDevice", descriptor = "()V")
	public native void RestartWebcamDevice();
}
