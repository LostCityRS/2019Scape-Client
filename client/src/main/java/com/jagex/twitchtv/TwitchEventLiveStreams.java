package com.jagex.twitchtv;

import com.jagex.class571;
import deob.ObfuscatedName;

public class TwitchEventLiveStreams extends TwitchEvent {

	public int streamCount;

	public String[] channelUrls;

	public String[] previewUrlTemplates;

	public String[] streamTitles;

	public String[] channelDisplayNames;

	public int[] viewerCounts;

	public TwitchEventLiveStreams(int arg0, int arg1) {
		super(arg0);
		this.streamCount = arg1;
		if (this.streamCount > 0) {
			this.channelUrls = new String[this.streamCount];
			this.previewUrlTemplates = new String[this.streamCount];
			this.streamTitles = new String[this.streamCount];
			this.channelDisplayNames = new String[this.streamCount];
			this.viewerCounts = new int[this.streamCount];
		}
	}

	public void SetStream(int arg0, String arg1, String arg2, String arg3, String arg4, int arg5) {
		if (arg0 < 0 || arg0 >= this.streamCount) {
			return;
		}
		this.channelUrls[arg0] = arg1;
		this.previewUrlTemplates[arg0] = arg2;
		this.streamTitles[arg0] = arg3;
		this.channelDisplayNames[arg0] = arg4;
		this.viewerCounts[arg0] = arg5;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEventLiveStreams.n()Lud;")
	public class571 method11() {
		return null;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEventLiveStreams.e([I[J[Ljava/lang/Object;)V")
	public void method12(int[] arg0, long[] arg1, Object[] arg2) {
	}
}
