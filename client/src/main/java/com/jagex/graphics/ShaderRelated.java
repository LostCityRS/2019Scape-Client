package com.jagex.graphics;

import com.jagex.core.datastruct.HashMapKey;
import com.jagex.core.utils.StringTools;
import deob.ObfuscatedName;

@ObfuscatedName("he")
public final class ShaderRelated implements HashMapKey {

	@ObfuscatedName("he.e(Ljava/lang/String;I)J")
	public long hash(String value) {
		return StringTools.method15380(value);
	}
}
