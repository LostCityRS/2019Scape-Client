package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import rs2.shared.prot.ClientProt;

@ObfuscatedName("ur")
public class ClientNativeLibraryFailure implements SendablePacket {

	@ObfuscatedName("ur.e")
	public final NativeLibraryFailureType field7278;

	@ObfuscatedName("ur.n")
	public final String field7276;

	@ObfuscatedName("ur.m")
	public final int field7277;

	@ObfuscatedName("ur.k")
	public final String field7275;

	public ClientNativeLibraryFailure(NativeLibraryFailureType arg0, String arg1, int arg2, Throwable arg3) {
		this.field7278 = arg0;
		this.field7276 = arg1;
		this.field7277 = arg2;
		this.field7275 = arg3 == null ? null : arg3.getMessage();
	}

	@ObfuscatedName("ur.e(I)V")
	public void method9201() {
		ClientMessage var1 = Statics.method1604(ClientProt.NATIVE_LIBRARY_FAILURE, client.field10849.field794);
		int var2 = var1.field11432.pos++;
		var1.field11432.p1(this.field7278.getId());
		var1.field11432.pjstr(this.field7276);
		var1.field11432.p2(this.field7277);
		var1.field11432.pjstr(NativeLibraryConfig.field5075);
		if (this.field7275 == null) {
			var1.field11432.p1(0);
		} else {
			var1.field11432.p1(1);
			String var3 = this.field7275;
			if (var3.length() > 100) {
				var3 = var3.substring(0, 100);
			}
			var1.field11432.pjstr(var3);
		}
		var1.field11432.psize1(var1.field11432.pos - var2);
		client.field10849.method934(var1);
	}
}
