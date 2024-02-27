package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

@OriginalClass("client!alr")
public final class BufferedSocket_Sub1 extends BufferedSocket {

	@OriginalMember(owner = "client!alr", name = "t", descriptor = "Ljava/net/Socket;")
	Socket aSocket3;

	@OriginalMember(owner = "client!alr", name = "f", descriptor = "Lclient!up;")
	Class597 aClass597_1;

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "Lclient!ul;")
	Class596 aClass596_1;

	@OriginalMember(owner = "client!alr", name = "<init>", descriptor = "(Ljava/net/Socket;II)V")
	BufferedSocket_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket3 = arg0;
		this.aSocket3.setSoTimeout(30000);
		this.aSocket3.setTcpNoDelay(true);
		this.aSocket3.setReceiveBufferSize(65536);
		this.aSocket3.setSendBufferSize(65536);
		this.aClass597_1 = new Class597(this.aSocket3.getInputStream(), arg1);
		this.aClass596_1 = new Class596(this.aSocket3.getOutputStream(), arg2);
	}

	@OriginalMember(owner = "client!alr", name = "x", descriptor = "()I")
	@Override
	public int method15555() throws IOException {
		return this.aClass597_1.method32001(1756451254);
	}

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "(IB)Z")
	@Override
	public boolean hasBytes(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) throws IOException {
		return this.aClass597_1.method32000(arg0, -996463965);
	}

	@OriginalMember(owner = "client!alr", name = "u", descriptor = "(I)I")
	@Override
	public int available(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass597_1.method32001(1935144914);
	}

	@OriginalMember(owner = "client!alr", name = "ht", descriptor = "()V")
	void method15569() {
		this.close((short) 20602);
	}

	@OriginalMember(owner = "client!alr", name = "k", descriptor = "()I")
	@Override
	public int method15554() throws IOException {
		return this.aClass597_1.method32001(1635473515);
	}

	@OriginalMember(owner = "client!alr", name = "i", descriptor = "(S)V")
	@Override
	public void close(@OriginalArg(0) short arg0) {
		this.aClass596_1.method31981(-1552725369);
		try {
			this.aSocket3.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass597_1.method32003((short) -26727);
	}

	@OriginalMember(owner = "client!alr", name = "m", descriptor = "(B)V")
	@Override
	public void method15550(@OriginalArg(0) byte arg0) {
		this.aClass597_1.method32004((byte) -70);
		this.aClass596_1.method31982(2093794252);
	}

	@OriginalMember(owner = "client!alr", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.close((short) 9381);
	}

	@OriginalMember(owner = "client!alr", name = "hy", descriptor = "()V")
	void method15570() {
		this.close((short) 23525);
	}

	@OriginalMember(owner = "client!alr", name = "hj", descriptor = "()V")
	void method15571() {
		this.close((short) 10197);
	}

	@OriginalMember(owner = "client!alr", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method15566(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass597_1.method32000(arg0, -743668530);
	}

	@OriginalMember(owner = "client!alr", name = "o", descriptor = "(I)Z")
	@Override
	public boolean method15567(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass597_1.method32000(arg0, -1907050812);
	}

	@OriginalMember(owner = "client!alr", name = "d", descriptor = "([BII)V")
	@Override
	public void method15560(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass596_1.method31980(arg0, arg1, arg2, (byte) 45);
	}

	@OriginalMember(owner = "client!alr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method15552(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass597_1.method32000(arg0, 1402137557);
	}

	@OriginalMember(owner = "client!alr", name = "s", descriptor = "(I)Z")
	@Override
	public boolean method15553(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass597_1.method32000(arg0, 1110651633);
	}

	@OriginalMember(owner = "client!alr", name = "q", descriptor = "([BII)I")
	@Override
	public int method15558(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass597_1.method32002(arg0, arg1, arg2, 1206901479);
	}

	@OriginalMember(owner = "client!alr", name = "w", descriptor = "([BII)I")
	@Override
	public int method15556(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass597_1.method32002(arg0, arg1, arg2, 1206901479);
	}

	@OriginalMember(owner = "client!alr", name = "h", descriptor = "([BII)I")
	@Override
	public int method15559(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass597_1.method32002(arg0, arg1, arg2, 1206901479);
	}

	@OriginalMember(owner = "client!alr", name = "r", descriptor = "([BII)I")
	@Override
	public int method15557(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass597_1.method32002(arg0, arg1, arg2, 1206901479);
	}

	@OriginalMember(owner = "client!alr", name = "g", descriptor = "([BIII)V")
	@Override
	public void write(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		this.aClass596_1.method31980(arg0, arg1, arg2, (byte) 51);
	}

	@OriginalMember(owner = "client!alr", name = "l", descriptor = "([BIII)I")
	@Override
	public int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		return this.aClass597_1.method32002(arg0, arg1, arg2, 1206901479);
	}

	@OriginalMember(owner = "client!alr", name = "z", descriptor = "()V")
	@Override
	public void method15561() {
		this.aClass596_1.method31981(-1552725369);
		try {
			this.aSocket3.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass597_1.method32003((short) -16008);
	}

	@OriginalMember(owner = "client!alr", name = "p", descriptor = "()V")
	@Override
	public void method15562() {
		this.aClass597_1.method32004((byte) -64);
		this.aClass596_1.method31982(2107350708);
	}

	@OriginalMember(owner = "client!alr", name = "v", descriptor = "()V")
	@Override
	public void method15563() {
		this.aClass597_1.method32004((byte) -99);
		this.aClass596_1.method31982(1996606955);
	}

	@OriginalMember(owner = "client!alr", name = "y", descriptor = "()V")
	@Override
	public void method15564() {
		this.aClass597_1.method32004((byte) -14);
		this.aClass596_1.method31982(2099466973);
	}
}
