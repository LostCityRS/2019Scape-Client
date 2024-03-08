package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Comparator;

@ObfuscatedName("qi")
public class class461 implements Comparator {

	// $FF: synthetic field
	public final class462 this$0;

	public class461(class462 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("qi.e(Lqd;Lqd;B)I")
	public int method7264(class460 arg0, class460 arg1) {
		if (arg0.field4624 > arg1.field4624) {
			return 1;
		} else if (arg0.field4624 < arg1.field4624) {
			return -1;
		} else {
			return 0;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method7264((class460) arg0, (class460) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
