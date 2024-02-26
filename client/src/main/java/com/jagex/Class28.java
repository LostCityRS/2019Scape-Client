package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abb")
public final class Class28 {

	@OriginalMember(owner = "client!abb", name = "tj", descriptor = "I")
	public static int anInt92;

	@OriginalMember(owner = "client!abb", name = "f", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!abb", name = "t", descriptor = "I")
	public int anInt89;

	@OriginalMember(owner = "client!abb", name = "e", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!abb", name = "u", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!abb", name = "l", descriptor = "Z")
	boolean aBoolean16 = true;

	@OriginalMember(owner = "client!abb", name = "g", descriptor = "Z")
	boolean aBoolean17 = false;

	@OriginalMember(owner = "client!abb", name = "b", descriptor = "(Lclient!yp;I)V")
	static void method660(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class306.method27215((byte) 63);
	}

	@OriginalMember(owner = "client!abb", name = "t", descriptor = "(I)Ljava/net/Socket;")
	public Socket method655(@OriginalArg(0) int arg0) throws IOException {
		return this.aBoolean17 ? Class171.method23505(this.aString4, this.aBoolean16 ? this.anInt91 * -1614303315 : this.anInt90 * -1516712071, 378389686).method17286(-1338066305) : new Socket(InetAddress.getByName(this.aString4), this.aBoolean16 ? this.anInt91 * -1614303315 : this.anInt90 * -1516712071);
	}

	@OriginalMember(owner = "client!abb", name = "f", descriptor = "(B)V")
	public void method656(@OriginalArg(0) byte arg0) {
		if (!this.aBoolean16) {
			this.aBoolean16 = true;
			this.aBoolean17 = true;
		} else if (this.aBoolean17) {
			this.aBoolean17 = false;
		} else {
			this.aBoolean16 = false;
		}
	}

	@OriginalMember(owner = "client!abb", name = "e", descriptor = "(Lclient!abb;I)Z")
	public boolean method657(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt89 * 307612145 == arg0.anInt89 * 307612145 && this.aString4.equals(arg0.aString4) && this.anInt90 * -1516712071 == arg0.anInt90 * -1516712071 && arg0.anInt91 * -1614303315 == this.anInt91 * -1614303315;
		}
	}

	@OriginalMember(owner = "client!abb", name = "u", descriptor = "()Ljava/net/Socket;")
	public Socket method658() throws IOException {
		return this.aBoolean17 ? Class171.method23505(this.aString4, this.aBoolean16 ? this.anInt91 * -1614303315 : this.anInt90 * -1516712071, -680918254).method17286(318703713) : new Socket(InetAddress.getByName(this.aString4), this.aBoolean16 ? this.anInt91 * -1614303315 : this.anInt90 * -1516712071);
	}

	@OriginalMember(owner = "client!abb", name = "l", descriptor = "(Lclient!abb;)Z")
	public boolean method659(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt89 * 307612145 == arg0.anInt89 * 307612145 && this.aString4.equals(arg0.aString4) && this.anInt90 * -1516712071 == arg0.anInt90 * -1516712071 && arg0.anInt91 * -1614303315 == this.anInt91 * -1614303315;
		}
	}
}
