package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public class Class28 {

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	public int port2;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
	public int port1;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "Ljava/lang/String;")
	public String host;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "Z")
	boolean aBoolean15 = true;

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "Z")
	boolean aBoolean14 = false;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "()Ljava/net/Socket;", line = 19)
	public Socket method592() throws IOException {
		return this.aBoolean14 ? Class429.method28753(this.host, this.aBoolean15 ? this.port2 * -1815897519 : this.port1 * 721448659, -19069192).method16610(1875748059) : new Socket(InetAddress.getByName(this.host), this.aBoolean15 ? this.port2 * -1815897519 : this.port1 * 721448659);
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(B)Ljava/net/Socket;", line = 19)
	public Socket openSocket(@OriginalArg(0) byte arg0) throws IOException {
		return this.aBoolean14 ? Class429.method28753(this.host, this.aBoolean15 ? this.port2 * -1815897519 : this.port1 * 721448659, -80518013).method16610(1312515116) : new Socket(InetAddress.getByName(this.host), this.aBoolean15 ? this.port2 * -1815897519 : this.port1 * 721448659);
	}

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "(S)V", line = 24)
	public void cycleSettings(@OriginalArg(0) short arg0) {
		if (!this.aBoolean15) {
			this.aBoolean15 = true;
			this.aBoolean14 = true;
		} else if (this.aBoolean14) {
			this.aBoolean14 = false;
		} else {
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "()V", line = 24)
	public void method595() {
		if (!this.aBoolean15) {
			this.aBoolean15 = true;
			this.aBoolean14 = true;
		} else if (this.aBoolean14) {
			this.aBoolean14 = false;
		} else {
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "()V", line = 24)
	public void method596() {
		if (!this.aBoolean15) {
			this.aBoolean15 = true;
			this.aBoolean14 = true;
		} else if (this.aBoolean14) {
			this.aBoolean14 = false;
		} else {
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "(Lclient!aba;I)Z", line = 35)
	public boolean method597(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.id * 2142901097 == this.id * 2142901097 && this.host.equals(arg0.host) && this.port1 * 721448659 == arg0.port1 * 721448659 && arg0.port2 * -1815897519 == this.port2 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "(Lclient!aba;)Z", line = 35)
	public boolean method598(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.id * 2142901097 == this.id * 2142901097 && this.host.equals(arg0.host) && this.port1 * 721448659 == arg0.port1 * 721448659 && arg0.port2 * -1815897519 == this.port2 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "(Lclient!aba;)Z", line = 35)
	public boolean method599(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.id * 2142901097 == this.id * 2142901097 && this.host.equals(arg0.host) && this.port1 * 721448659 == arg0.port1 * 721448659 && arg0.port2 * -1815897519 == this.port2 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "(Lclient!aba;)Z", line = 35)
	public boolean method600(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.id * 2142901097 == this.id * 2142901097 && this.host.equals(arg0.host) && this.port1 * 721448659 == arg0.port1 * 721448659 && arg0.port2 * -1815897519 == this.port2 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)Z", line = 145)
	static boolean method601(@OriginalArg(0) int arg0) {
		return Class90.method1602(Class288.aClass636_1.aClass628_3, 302698186);
	}

	@OriginalMember(owner = "client!aba", name = "ks", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 6802)
	static final void method602(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aString163 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!aba", name = "pp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7846)
	static final void method603(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray32 = Class499.method30149(local13, arg2, 672449356);
		arg0.aBoolean680 = true;
	}
}
