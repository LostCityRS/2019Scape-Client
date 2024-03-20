package com.jagex.game.config.seqtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.seqgrouptype.SeqGroupTypeList;
import com.jagex.graphics.FrameSet;
import com.jagex.graphics.KeyFrameSet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aos")
public class SeqTypeList extends CachingConfigTypeList {

	public SeqTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3, Js5 arg4, Js5 arg5, SeqGroupTypeList arg6) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SEQTYPE, 64, new BasicSeqTypeFactory(arg6, arg3, arg4, arg5));
	}

	@ObfuscatedName("aos.al(II)Larr;")
	public FrameSet method18864(int arg0) {
		return ((SeqTypeFactory) this.factory).method3020(arg0);
	}

	@ObfuscatedName("aos.ac(II)Lard;")
	public KeyFrameSet method18865(int arg0) {
		return ((SeqTypeFactory) this.factory).method3010(arg0);
	}

	@ObfuscatedName("aos.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((SeqTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aos.v(II)V")
	public void cacheClean(int num) {
		super.cacheClean(num);
		((SeqTypeFactory) this.factory).cacheClean(num);
	}

	@ObfuscatedName("aos.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((SeqTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
