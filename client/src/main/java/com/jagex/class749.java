package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("aba")
public class class749 {

	@ObfuscatedName("aba.e")
	public int field8746;

	@ObfuscatedName("aba.n")
	public String field8745;

	@ObfuscatedName("aba.m")
	public int field8744;

	@ObfuscatedName("aba.k")
	public int field8742;

	@ObfuscatedName("aba.f")
	public boolean field8747 = true;

	@ObfuscatedName("aba.w")
	public boolean field8743 = false;

	@ObfuscatedName("aba.e(B)Ljava/net/Socket;")
	public Socket method14764() throws IOException {
		return this.field8743 ? class755.method5846(this.field8745, this.field8747 ? this.field8742 : this.field8744).method14876() : new Socket(InetAddress.getByName(this.field8745), this.field8747 ? this.field8742 : this.field8744);
	}

	@ObfuscatedName("aba.n(S)V")
	public void method14758() {
		if (!this.field8747) {
			this.field8747 = true;
			this.field8743 = true;
		} else if (this.field8743) {
			this.field8743 = false;
		} else {
			this.field8747 = false;
		}
	}

	@ObfuscatedName("aba.m(Laba;I)Z")
	public boolean method14757(class749 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.field8746 == arg0.field8746 && this.field8745.equals(arg0.field8745) && this.field8744 == arg0.field8744 && this.field8742 == arg0.field8742;
		}
	}
}
