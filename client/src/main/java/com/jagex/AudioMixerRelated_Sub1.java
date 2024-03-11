package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fl")
public class AudioMixerRelated_Sub1 implements AudioMixerRelated {

	// $FF: synthetic field
	public final AudioApi this$0;

	public AudioMixerRelated_Sub1(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fl.e(Lwr;IIZB)V")
	public void method3130(AudioApiRelated2 arg0, int arg1, int arg2, boolean arg3) {
		this.this$0.method3233().add(arg0);
		if (arg3) {
			this.this$0.method3146().method2921(arg0, (long) arg2);
		} else {
			this.this$0.method3145().method2922(arg0, (long) arg2, arg0.method9678());
		}
	}

	@ObfuscatedName("fl.n(Lwr;I)V")
	public void method3131(AudioApiRelated2 arg0) {
		if (arg0 != null) {
			this.this$0.method3145().method2930((long) arg0.method9680());
		}
	}
}
