package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("acq")
public class LogoutReason implements SerializableEnum {

	@ObfuscatedName("acq.e")
	public static final LogoutReason field9132 = new LogoutReason(0);

	@ObfuscatedName("acq.n")
	public static final LogoutReason field9131 = new LogoutReason(1);

	@ObfuscatedName("acq.m")
	public static final LogoutReason field9133 = new LogoutReason(2);

	@ObfuscatedName("acq.k")
	public static final LogoutReason field9134 = new LogoutReason(3);

	@ObfuscatedName("acq.f")
	public static final LogoutReason field9143 = new LogoutReason(4);

	@ObfuscatedName("acq.w")
	public static final LogoutReason field9136 = new LogoutReason(5);

	@ObfuscatedName("acq.l")
	public static final LogoutReason field9137 = new LogoutReason(6);

	@ObfuscatedName("acq.u")
	public static final LogoutReason field9138 = new LogoutReason(10);

	@ObfuscatedName("acq.z")
	public static final LogoutReason field9139 = new LogoutReason(20);

	@ObfuscatedName("acq.p")
	public static final LogoutReason field9140 = new LogoutReason(21);

	@ObfuscatedName("acq.d")
	public static final LogoutReason field9141 = new LogoutReason(100);

	@ObfuscatedName("acq.c")
	public static final LogoutReason field9135 = new LogoutReason(101);

	@ObfuscatedName("acq.r")
	public static final LogoutReason field9144 = new LogoutReason(102);

	@ObfuscatedName("acq.v")
	public static final LogoutReason field9142 = new LogoutReason(103);

	@ObfuscatedName("acq.o")
	public final int field9145;

	@ObfuscatedName("ye.e(B)[Lacq;")
	public static LogoutReason[] method10365() {
		return new LogoutReason[] { field9140, field9134, field9133, field9135, field9138, field9143, field9139, field9132, field9141, field9137, field9144, field9142, field9131, field9136 };
	}

	public LogoutReason(int arg0) {
		this.field9145 = arg0;
	}

	@ObfuscatedName("acq.n()I")
	public int getId() {
		return this.field9145;
	}

	public String toString() {
		return "";
	}
}
