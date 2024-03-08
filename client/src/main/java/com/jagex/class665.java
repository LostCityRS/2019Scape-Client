package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yq")
public class class665 {

	@ObfuscatedName("yq.e")
	public class420 field8173 = new class420();

	@ObfuscatedName("yq.n")
	public class420 field8170 = new class420();

	@ObfuscatedName("yq.m")
	public boolean field8171 = true;

	@ObfuscatedName("yq.k")
	public class420 field8172 = new class420();

	@ObfuscatedName("yq.f")
	public boolean field8177 = true;

	@ObfuscatedName("yq.w")
	public class419 field8179;

	@ObfuscatedName("yq.l")
	public boolean field8175;

	@ObfuscatedName("yq.u")
	public boolean field8176;

	@ObfuscatedName("yq.z")
	public class665 field8169;

	@ObfuscatedName("yq.p")
	public class665 field8178;

	@ObfuscatedName("yq.d")
	public class665 field8174;

	public class665() {
		new class426();
		new class426();
		this.field8179 = new class419();
		this.field8175 = true;
		this.field8176 = true;
		this.field8169 = null;
		this.field8178 = null;
		this.field8174 = null;
	}

	@ObfuscatedName("yq.ae()Loe;")
	public final class420 method10525() {
		return this.field8173;
	}

	@ObfuscatedName("yq.ag()Loe;")
	public final class420 method10536() {
		if (this.field8171) {
			this.field8171 = false;
			this.field8170.method6386(this.field8173);
			if (this.field8169 != null) {
				this.field8170.method6398(this.field8169.method10536());
			}
		}
		return this.field8170;
	}

	@ObfuscatedName("yq.ah()Loe;")
	public final class420 method10527() {
		if (this.field8177) {
			this.field8177 = false;
			this.field8172.method6386(this.method10536());
			this.field8172.method6387();
		}
		return this.field8170;
	}

	@ObfuscatedName("yq.al()Lou;")
	public final class419 method10533() {
		if (this.field8175) {
			this.field8175 = false;
			this.field8179.method6294(this.method10536());
		}
		return this.field8179;
	}

	@ObfuscatedName("yq.ac(Loe;)V")
	public final void method10529(class420 arg0) {
		this.field8173.method6386(arg0);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.ai(Lov;)V")
	public final void method10556(class421 arg0) {
		this.field8173.field4297.method6412(arg0);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.aw(Lox;)V")
	public final void method10531(class423 arg0) {
		this.field8173.field4298.method6492(arg0);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.as(FFF)V")
	public final void method10532(float arg0, float arg1, float arg2) {
		this.method10538(this.field8173.field4298.field4308 + arg0, this.field8173.field4298.field4311 + arg1, this.field8173.field4298.field4313 + arg2);
	}

	@ObfuscatedName("yq.at(FFF)V")
	public final void method10538(float arg0, float arg1, float arg2) {
		this.field8173.field4298.method6491(arg0, arg1, arg2);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.ad(Loe;)V")
	public final void method10534(class420 arg0) {
		if (this.field8169 == null) {
			this.method10529(arg0);
		} else {
			class420 var2 = new class420(arg0);
			var2.method6398(this.field8169.method10527());
			this.method10529(var2);
		}
	}

	@ObfuscatedName("yq.am()V")
	public final void method10535() {
		this.field8171 = true;
		this.field8177 = true;
		this.field8175 = true;
		this.field8176 = true;
	}

	@ObfuscatedName("yq.au()V")
	public final void method10549() {
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
		if (this.field8174 != null) {
			this.field8174.method10549();
		}
	}

	@ObfuscatedName("yq.ar()V")
	public final void method10537() {
		if (this.field8169 != null) {
			class665 var1 = this.field8169.field8178;
			if (var1 == this) {
				this.field8169.field8178 = this.field8174;
			} else {
				while (var1.field8174 != this) {
					var1 = var1.field8174;
				}
				var1.field8174 = this.field8174;
			}
		}
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
			class665 var2 = this.field8178;
			while (true) {
				var2.field8173.method6398(this.field8173);
				var2.field8169 = this.field8169;
				if (var2.field8174 == null) {
					var2.field8174 = this.field8169.field8178;
					this.field8169.field8178 = this.field8178;
					break;
				}
				var2 = var2.field8174;
			}
		}
		this.field8169 = null;
		this.field8174 = null;
		this.field8178 = null;
	}
}
