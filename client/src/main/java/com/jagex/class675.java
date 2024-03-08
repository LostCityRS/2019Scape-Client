package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yv")
public class class675 {

	@ObfuscatedName("yv.e")
	public final class594 field8196;

	@ObfuscatedName("yv.n")
	public final int field8195;

	@ObfuscatedName("yv.m")
	public final int field8197;

	public class675(class594 arg0, int arg1, int arg2, int arg3) {
		this.field8196 = arg0;
		this.field8195 = arg1;
		this.field8197 = arg3;
	}

	@ObfuscatedName("yv.e(I)I")
	public int method10759() {
		return client.field10914[this.field8195];
	}

	@ObfuscatedName("yv.n(I)Lst;")
	public class514 method10760() {
		class514 var1 = this.method10761();
		if (var1 == null) {
			return null;
		} else if (var1.method8223() == this.field8197) {
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("yv.m(I)Lst;")
	public class514 method10761() {
		int var1 = this.field8196.field7428;
		class594 var2 = client.field10855.method7727();
		int var3 = this.field8196.field7426 - var2.field7426;
		int var4 = this.field8196.field7427 - var2.field7427;
		if (var3 < 0 || var4 < 0 || var3 >= client.field10855.method7728() || var4 >= client.field10855.method7758() || client.field10855.method7743() == null) {
			return null;
		}
		switch(this.method10759()) {
			case 0:
				return (class514) client.field10855.method7743().method8711(var1, var3, var4);
			case 1:
				return (class514) client.field10855.method7743().method8735(var1, var3, var4);
			case 2:
				return (class514) client.field10855.method7743().method8856(var1, var3, var4, client.field11001);
			case 3:
				return (class514) client.field10855.method7743().method8767(var1, var3, var4);
			default:
				return null;
		}
	}
}
