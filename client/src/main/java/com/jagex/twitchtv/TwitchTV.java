package com.jagex.twitchtv;

public class TwitchTV {

	public native int InitialiseTTV(String arg0);

	public native int ShutdownTTV();

	public native int Login(String arg0, String arg1);

	public native int Logout();

	public native String GetUsername();

	public native TwitchEvent[] Service();

	public native int GetLoginState();

	public native void SetAuthResponse(String arg0, int arg1, String arg2);

	public native int RequestLiveStreams(String arg0);

	public native int StartStreaming(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5, int arg6, boolean arg7);

	public native int Pause();

	public native int GetStreamState();

	public native boolean IsStreaming();

	public native boolean IsReadyToStream();

	public native void FlushStreamingEvents();

	public native int StopStreaming();

	public native int RunCommercial();

	public native long GetNextFreeFrameBuffer();

	public native int SubmitFrame(long arg0, boolean arg1, boolean arg2, int arg3, int arg4);

	public native int SubmitFrameRaw(int[] arg0, boolean arg1, int arg2, int arg3);

	public native int[] GetRecommendedSettings(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6);

	public native void SetUserStreamRefreshInterval(int arg0);

	public native int GetViewerCount();

	public native int SetStreamTitle(String arg0, String arg1);

	public native int ChatSendMessage(String arg0);

	public native int GetChatState();

	public native int GetWebcamState();

	public native int GetWebcamFrameData(int arg0, TwitchWebcamFrameData arg1);

	public native int[] GetWebcamFrameResolution(int arg0);

	public native int StartWebcamDevice(int arg0, int arg1);

	public native int StopWebcamDevice(int arg0);

	public native TwitchWebcamDevice[] GetWebcamDevices();

	public native void RestartWebcamDevice();
}
