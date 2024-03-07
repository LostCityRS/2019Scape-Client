package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ack")
class Class61 implements Iterator {

	@OriginalMember(owner = "client!ack", name = "e", descriptor = "I")
	int anInt229;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ack", name = "this$0", descriptor = "Lclient!acd;")
	final Class55 this$0;

	@OriginalMember(owner = "client!ack", name = "<init>", descriptor = "(Lclient!acd;)V", line = 63)
	Class61(@OriginalArg(0) Class55 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ack", name = "e", descriptor = "()Z", line = 67)
	public boolean method1124() {
		return this.anInt229 * 339631723 < this.this$0.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!ack", name = "hasNext", descriptor = "()Z", line = 67)
	@Override
	public boolean hasNext() {
		return this.anInt229 * 339631723 < this.this$0.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!ack", name = "n", descriptor = "()Z", line = 67)
	public boolean method1125() {
		return this.anInt229 * 339631723 < this.this$0.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!ack", name = "next", descriptor = "()Ljava/lang/Object;", line = 71)
	@Override
	public Object next() {
		return this.this$0.anInterface13Array3[(this.anInt229 += 1669750339) * 339631723 - 1];
	}

	@OriginalMember(owner = "client!ack", name = "k", descriptor = "()Ljava/lang/Object;", line = 71)
	public Object method1126() {
		return this.this$0.anInterface13Array3[(this.anInt229 += 1669750339) * 339631723 - 1];
	}

	@OriginalMember(owner = "client!ack", name = "m", descriptor = "()Ljava/lang/Object;", line = 71)
	public Object method1127() {
		return this.this$0.anInterface13Array3[(this.anInt229 += 1669750339) * 339631723 - 1];
	}

	@OriginalMember(owner = "client!ack", name = "remove", descriptor = "()V", line = 75)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ack", name = "f", descriptor = "()V", line = 75)
	public void method1128() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ack", name = "w", descriptor = "()V", line = 75)
	public void method1129() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ack", name = "b", descriptor = "(I)V", line = 173)
	static void method1130(@OriginalArg(0) int arg0) {
		if (Class588.aClass588_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (Class676.anInt5883 * -1667786339 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			Class676.anInt5885 += -2146389243;
			if (Class676.anInt5885 * -1394007603 > local9) {
				Class132_Sub1_Sub3_Sub1.method12303(-109098973);
			}
			@Pc(62) int local62;
			if (Class588.aClass588_1 == Class588.aClass588_3) {
				client.aClass175_1.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) -5827), Class50.lobby.host, 2126602668);
				client.aClass175_1.clear(1778124812);
				@Pc(43) ClientMessage local43 = Class720.createLoginMessage((byte) 31);
				local43.packet.p1(LoginProt.CREATE_ACCOUNT_CONNECT.opcode * 1690737369, (byte) -94);
				local43.packet.p2(0, 2129088042);
				local62 = local43.packet.pos * 212851357;
				local43.packet.p2(910, 2124806922);
				local43.packet.p2(1, 2141744574);
				Class676.anIntArray516 = Class367.method27961(local43, (byte) 117);
				@Pc(82) int local82 = local43.packet.pos * 212851357;
				local43.packet.pjstr(client.clientToken, 802881230);
				local43.packet.p2(client.affiliate * -1765120027, 2143561161);
				local43.packet.p4(client.userFlowFlag1 * 1672118199, (byte) 61);
				local43.packet.p4(client.userFlowFlag2 * -1830493323, (byte) 109);
				local43.packet.pjstr(Class454.aString210, -569118241);
				local43.packet.p1(Class106.lang.getId(), (byte) -97);
				local43.packet.p1(client.modeGame.id * -1111983921, (byte) -80);
				Class314.getUid192(local43.packet, 1822213152);
				@Pc(133) String local133 = client.aString138;
				local43.packet.p1(local133 == null ? 0 : 1, (byte) -103);
				if (local133 != null) {
					local43.packet.pjstr(local133, 1575484636);
				}
				Class125_Sub3.platformStats.encode(local43.packet, 1797123567);
				local43.packet.pos += -1529454093;
				local43.packet.tinyenc(Class676.anIntArray516, local82, local43.packet.pos * 212851357, (byte) -117);
				local43.packet.psize2(local43.packet.pos * 212851357 - local62, 1251011626);
				client.aClass175_1.send(local43, -1683542800);
				client.aClass175_1.flush((byte) 15);
				Class588.aClass588_3 = Class588.aClass588_2;
			}
			if (Class588.aClass588_2 == Class588.aClass588_3) {
				if (client.aClass175_1.getStream((byte) 21) == null) {
					Class132_Sub1_Sub3_Sub1.method12303(-109098973);
					return;
				}
				if (!client.aClass175_1.getStream((byte) 41).available(1, 30631038)) {
					return;
				}
				client.aClass175_1.getStream((byte) 3).read(client.aClass175_1.packet.data, 0, 1, (byte) -80);
				Class676.aClass709_1 = (Class709) Class107.method18116(Class124_Sub3.method21431(-1406618035), client.aClass175_1.packet.data[0] & 0xFF, -1915563430);
				if (Class709.aClass709_7 == Class676.aClass709_1) {
					client.aClass175_1.clientIsaac = new IsaacRandom(Class676.anIntArray516);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = Class676.anIntArray516[local62] + 50;
					}
					client.aClass175_1.serverIsaac = new IsaacRandom(local247);
					new IsaacRandom(local247);
					client.aClass175_1.packet.setRandom(client.aClass175_1.serverIsaac, (byte) -60);
					Class481.setState(0, 1823202236);
					client.aClass175_1.clear(-62093601);
					client.aClass175_1.packet.pos = 0;
					client.aClass175_1.prevServerPacketType1 = null;
					client.aClass175_1.prevServerPacketType2 = null;
					client.aClass175_1.prevServerPacketType3 = null;
					client.aClass175_1.anInt3298 = 0;
					Class624.playerVariableManager.vars.method32643((byte) 119);
					Class151.method13978(-2015714483);
				} else {
					client.aClass175_1.close((byte) 34);
				}
				client.aClass175_1.serverPacketType = null;
				Class588.aClass588_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class132_Sub1_Sub3_Sub1.method12303(-109098973);
		}
	}

	@OriginalMember(owner = "client!ack", name = "q", descriptor = "(IB)V", line = 708)
	public static void method1131(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class166_Sub39.anInt2328 = arg0 * -1893474517;
		Class312.aClass240_77.method25847((byte) -68);
	}

	@OriginalMember(owner = "client!ack", name = "uq", descriptor = "(Lclient!yf;I)V", line = 8569)
	static final void method1132(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1743635460);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3985 * 897022795;
	}
}
