package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akl")
public class ClientMessage extends Class93 {

	@OriginalMember(owner = "client!akl", name = "u", descriptor = "[Lclient!akl;")
	static ClientMessage[] aClientMessageArray1 = new ClientMessage[300];

	@OriginalMember(owner = "client!akl", name = "z", descriptor = "I")
	static int anInt1571 = 0;

	@OriginalMember(owner = "client!akl", name = "l", descriptor = "I")
	public int anInt1569;

	@OriginalMember(owner = "client!akl", name = "f", descriptor = "I")
	int anInt1570;

	@OriginalMember(owner = "client!akl", name = "w", descriptor = "Lclient!ase;")
	public PacketBit packet;

	@OriginalMember(owner = "client!akl", name = "k", descriptor = "Lclient!nr;")
	ClientProt aClientProt_1;

	@OriginalMember(owner = "client!akl", name = "<init>", descriptor = "()V", line = 16)
	ClientMessage() {
	}

	@OriginalMember(owner = "client!akl", name = "w", descriptor = "()Lclient!akl;", line = 19)
	static ClientMessage method13711() {
		return anInt1571 * -1803982567 == 0 ? new ClientMessage() : aClientMessageArray1[(anInt1571 -= -1780096215) * -1803982567];
	}

	@OriginalMember(owner = "client!akl", name = "u", descriptor = "()Lclient!akl;", line = 19)
	static ClientMessage method13712() {
		return anInt1571 * -1803982567 == 0 ? new ClientMessage() : aClientMessageArray1[(anInt1571 -= -1780096215) * -1803982567];
	}

	@OriginalMember(owner = "client!akl", name = "f", descriptor = "()Lclient!akl;", line = 19)
	static ClientMessage method13713() {
		return anInt1571 * -1803982567 == 0 ? new ClientMessage() : aClientMessageArray1[(anInt1571 -= -1780096215) * -1803982567];
	}

	@OriginalMember(owner = "client!akl", name = "l", descriptor = "()Lclient!akl;", line = 19)
	static ClientMessage method13714() {
		return anInt1571 * -1803982567 == 0 ? new ClientMessage() : aClientMessageArray1[(anInt1571 -= -1780096215) * -1803982567];
	}

	@OriginalMember(owner = "client!akl", name = "p", descriptor = "()Lclient!akl;", line = 39)
	public static ClientMessage method13715() {
		@Pc(2) ClientMessage local2 = Class527.method30386(25568396);
		local2.aClientProt_1 = null;
		local2.anInt1570 = 0;
		local2.packet = new PacketBit(5000);
		return local2;
	}

	@OriginalMember(owner = "client!akl", name = "z", descriptor = "()Lclient!akl;", line = 39)
	public static ClientMessage method13716() {
		@Pc(2) ClientMessage local2 = Class527.method30386(1668852778);
		local2.aClientProt_1 = null;
		local2.anInt1570 = 0;
		local2.packet = new PacketBit(5000);
		return local2;
	}

	@OriginalMember(owner = "client!akl", name = "k", descriptor = "(I)V", line = 47)
	public void method13717(@OriginalArg(0) int arg0) {
		if (anInt1571 * -1803982567 < aClientMessageArray1.length) {
			aClientMessageArray1[(anInt1571 += -1780096215) * -1803982567 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!akl", name = "d", descriptor = "()V", line = 47)
	public void method13718() {
		if (anInt1571 * -1803982567 < aClientMessageArray1.length) {
			aClientMessageArray1[(anInt1571 += -1780096215) * -1803982567 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!akl", name = "c", descriptor = "()V", line = 47)
	public void method13719() {
		if (anInt1571 * -1803982567 < aClientMessageArray1.length) {
			aClientMessageArray1[(anInt1571 += -1780096215) * -1803982567 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!akl", name = "r", descriptor = "()V", line = 47)
	public void method13720() {
		if (anInt1571 * -1803982567 < aClientMessageArray1.length) {
			aClientMessageArray1[(anInt1571 += -1780096215) * -1803982567 - 1] = this;
		}
	}
}