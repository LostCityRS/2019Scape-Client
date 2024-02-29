package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!all")
public class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!all", name = "e", descriptor = "Ljava/net/Socket;")
	Socket aSocket2;

	@OriginalMember(owner = "client!all", name = "n", descriptor = "Lclient!ua;")
	Class589 aClass589_1;

	@OriginalMember(owner = "client!all", name = "m", descriptor = "Lclient!ug;")
	Class594 aClass594_1;

	@OriginalMember(owner = "client!all", name = "<init>", descriptor = "(Ljava/net/Socket;II)V", line = 12)
	Class160_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aSocket2.setReceiveBufferSize(65536);
		this.aSocket2.setSendBufferSize(65536);
		this.aClass589_1 = new Class589(this.aSocket2.getInputStream(), arg1);
		this.aClass594_1 = new Class594(this.aSocket2.getOutputStream(), arg2);
	}

	@OriginalMember(owner = "client!all", name = "m", descriptor = "(II)Z", line = 23)
	@Override
	public boolean method14727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		return this.aClass589_1.method31664(arg0, -1593034678);
	}

	@OriginalMember(owner = "client!all", name = "z", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method14718(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass589_1.method31664(arg0, -1593034678);
	}

	@OriginalMember(owner = "client!all", name = "k", descriptor = "(B)I", line = 27)
	@Override
	public int method14732(@OriginalArg(0) byte arg0) throws IOException {
		return this.aClass589_1.method31667(-196271940);
	}

	@OriginalMember(owner = "client!all", name = "p", descriptor = "()I", line = 27)
	@Override
	public int method14724() throws IOException {
		return this.aClass589_1.method31667(-1666270062);
	}

	@OriginalMember(owner = "client!all", name = "c", descriptor = "()I", line = 27)
	@Override
	public int method14725() throws IOException {
		return this.aClass589_1.method31667(-1884729936);
	}

	@OriginalMember(owner = "client!all", name = "d", descriptor = "()I", line = 27)
	@Override
	public int method14731() throws IOException {
		return this.aClass589_1.method31667(-88180973);
	}

	@OriginalMember(owner = "client!all", name = "r", descriptor = "([BII)I", line = 31)
	@Override
	public int method14726(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass589_1.method31671(arg0, arg1, arg2, -991468413);
	}

	@OriginalMember(owner = "client!all", name = "f", descriptor = "([BIIB)I", line = 31)
	@Override
	public int method14720(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		return this.aClass589_1.method31671(arg0, arg1, arg2, -290440176);
	}

	@OriginalMember(owner = "client!all", name = "v", descriptor = "([BII)V", line = 35)
	@Override
	public void method14719(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass594_1.method31731(arg0, arg1, arg2, (byte) -19);
	}

	@OriginalMember(owner = "client!all", name = "w", descriptor = "([BIII)V", line = 35)
	@Override
	public void method14721(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		this.aClass594_1.method31731(arg0, arg1, arg2, (byte) 16);
	}

	@OriginalMember(owner = "client!all", name = "l", descriptor = "(I)V", line = 39)
	@Override
	public void method14722(@OriginalArg(0) int arg0) {
		this.aClass594_1.method31736((byte) 89);
		try {
			this.aSocket2.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass589_1.method31676(-1122101457);
	}

	@OriginalMember(owner = "client!all", name = "o", descriptor = "()V", line = 39)
	@Override
	public void method14728() {
		this.aClass594_1.method31736((byte) 7);
		try {
			this.aSocket2.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass589_1.method31676(-1122101457);
	}

	@OriginalMember(owner = "client!all", name = "u", descriptor = "(I)V", line = 48)
	@Override
	public void method14723(@OriginalArg(0) int arg0) {
		this.aClass589_1.method31677(1863702203);
		this.aClass594_1.method31739(1025532681);
	}

	@OriginalMember(owner = "client!all", name = "s", descriptor = "()V", line = 48)
	@Override
	public void method14729() {
		this.aClass589_1.method31677(1977555894);
		this.aClass594_1.method31739(599193165);
	}

	@OriginalMember(owner = "client!all", name = "y", descriptor = "()V", line = 48)
	@Override
	public void method14730() {
		this.aClass589_1.method31677(1488531699);
		this.aClass594_1.method31739(-1088302040);
	}

	@OriginalMember(owner = "client!all", name = "hl", descriptor = "()V", line = 53)
	void method14733() {
		this.method14722(-1801289143);
	}

	@OriginalMember(owner = "client!all", name = "finalize", descriptor = "()V", line = 53)
	@Override
	void finalize() {
		this.method14722(-734619071);
	}

	@OriginalMember(owner = "client!all", name = "ayq", descriptor = "(Lclient!yf;I)V", line = 14043)
	static final void method14734(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}
}
