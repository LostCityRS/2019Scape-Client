package jagex3;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class165 {

	@OriginalMember(owner = "client!am", name = "aa", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!am", name = "ul", descriptor = "I")
	static int anInt2068;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[B")
	volatile byte[] aByteArray44;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
	volatile boolean aBoolean365;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Ljava/net/URL;")
	final URL anURL1;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V")
	public static void method15331(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = client.aClass532_1.method30625(182359137);
		@Pc(7) int local7 = client.aClass532_1.method30655((short) 128);
		Class690.aBooleanArrayArray15 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(Lclient!uh;III)V")
	public static void method15332(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class681 local2 = Class96.method2324(362248239);
		Class346.method27658(arg0, arg1, arg2, local2, 1677070776);
	}

	@OriginalMember(owner = "client!am", name = "bfw", descriptor = "(Lclient!yf;I)V")
	static void method15333(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/net/URL;)V")
	Class165(@OriginalArg(0) URL arg0) {
		this.anURL1 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "n", descriptor = "(I)[B")
	byte[] method15323(@OriginalArg(0) int arg0) {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "()Z")
	boolean method15324() {
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!am", name = "m", descriptor = "()Z")
	boolean method15325() {
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "()Z")
	boolean method15326() {
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!am", name = "w", descriptor = "()[B")
	byte[] method15327() {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(I)Z")
	boolean method15328(@OriginalArg(0) int arg0) {
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "()[B")
	byte[] method15329() {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "u", descriptor = "()[B")
	byte[] method15330() {
		return this.aByteArray44;
	}
}
