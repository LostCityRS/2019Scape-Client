package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("fs")
public class class167 implements class161 {

	// $FF: synthetic field
	public final class183 this$0;

	public class167(class183 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fs.f(Lwr;I)V")
	public void method3027(class614 arg0) {
		Iterator var2 = this.this$0.method3150().iterator();
		while (var2.hasNext()) {
			class476 var3 = (class476) var2.next();
			if (var3.method7386() == arg0) {
				var3.method7377();
				var2.remove();
			}
		}
	}

	@ObfuscatedName("fs.e(Ljava/lang/Object;I)V")
	public void method2914(Object arg0) {
		this.method3027((class614) arg0);
	}
}
