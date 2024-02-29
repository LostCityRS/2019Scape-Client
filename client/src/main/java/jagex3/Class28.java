package jagex3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class28 {

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "Z")
	boolean aBoolean15 = true;

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "Z")
	boolean aBoolean14 = false;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)Z")
	static boolean method601(@OriginalArg(0) int arg0) {
		return Class90.method1602(Class288.aClass636_1.aClass628_3, 302698186);
	}

	@OriginalMember(owner = "client!aba", name = "ks", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method602(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aString169 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!aba", name = "pp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method603(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray32 = Class499.method30329(local13, arg2, 672449356);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "(Lclient!aba;I)Z")
	public boolean method592(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt101 * 2142901097 == this.anInt101 * 2142901097 && this.aString4.equals(arg0.aString4) && this.anInt100 * 721448659 == arg0.anInt100 * 721448659 && arg0.anInt99 * -1815897519 == this.anInt99 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "(S)V")
	public void method593(@OriginalArg(0) short arg0) {
		if (!this.aBoolean15) {
			this.aBoolean15 = true;
			this.aBoolean14 = true;
		} else if (this.aBoolean14) {
			this.aBoolean14 = false;
		} else {
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "(Lclient!aba;)Z")
	public boolean method594(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt101 * 2142901097 == this.anInt101 * 2142901097 && this.aString4.equals(arg0.aString4) && this.anInt100 * 721448659 == arg0.anInt100 * 721448659 && arg0.anInt99 * -1815897519 == this.anInt99 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "(Lclient!aba;)Z")
	public boolean method595(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt101 * 2142901097 == this.anInt101 * 2142901097 && this.aString4.equals(arg0.aString4) && this.anInt100 * 721448659 == arg0.anInt100 * 721448659 && arg0.anInt99 * -1815897519 == this.anInt99 * -1815897519;
		}
	}

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "()Ljava/net/Socket;")
	public Socket method596() throws IOException {
		return this.aBoolean14 ? Class429.method28935(this.aString4, this.aBoolean15 ? this.anInt99 * -1815897519 : this.anInt100 * 721448659, -19069192).method16611(1875748059) : new Socket(InetAddress.getByName(this.aString4), this.aBoolean15 ? this.anInt99 * -1815897519 : this.anInt100 * 721448659);
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "()V")
	public void method597() {
		if (!this.aBoolean15) {
			this.aBoolean15 = true;
			this.aBoolean14 = true;
		} else if (this.aBoolean14) {
			this.aBoolean14 = false;
		} else {
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "()V")
	public void method598() {
		if (!this.aBoolean15) {
			this.aBoolean15 = true;
			this.aBoolean14 = true;
		} else if (this.aBoolean14) {
			this.aBoolean14 = false;
		} else {
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(B)Ljava/net/Socket;")
	public Socket method599(@OriginalArg(0) byte arg0) throws IOException {
		return this.aBoolean14 ? Class429.method28935(this.aString4, this.aBoolean15 ? this.anInt99 * -1815897519 : this.anInt100 * 721448659, -80518013).method16611(1312515116) : new Socket(InetAddress.getByName(this.aString4), this.aBoolean15 ? this.anInt99 * -1815897519 : this.anInt100 * 721448659);
	}

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "(Lclient!aba;)Z")
	public boolean method600(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt101 * 2142901097 == this.anInt101 * 2142901097 && this.aString4.equals(arg0.aString4) && this.anInt100 * 721448659 == arg0.anInt100 * 721448659 && arg0.anInt99 * -1815897519 == this.anInt99 * -1815897519;
		}
	}
}
