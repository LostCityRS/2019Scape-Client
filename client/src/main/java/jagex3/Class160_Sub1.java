package jagex3;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!all")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!all", name = "e", descriptor = "Ljava/net/Socket;")
	Socket aSocket2;

	@OriginalMember(owner = "client!all", name = "n", descriptor = "Lclient!ua;")
	Class589 aClass589_1;

	@OriginalMember(owner = "client!all", name = "m", descriptor = "Lclient!ug;")
	Class594 aClass594_1;

	@OriginalMember(owner = "client!all", name = "ayq", descriptor = "(Lclient!yf;I)V")
	static void method14734(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!all", name = "<init>", descriptor = "(Ljava/net/Socket;II)V")
	Class160_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aSocket2.setReceiveBufferSize(65536);
		this.aSocket2.setSendBufferSize(65536);
		this.aClass589_1 = new Class589(this.aSocket2.getInputStream(), arg1);
		this.aClass594_1 = new Class594(this.aSocket2.getOutputStream(), arg2);
	}

	@OriginalMember(owner = "client!all", name = "v", descriptor = "([BII)V")
	@Override
	public void method14710(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass594_1.method31908(arg0, arg1, arg2, (byte) -19);
	}

	@OriginalMember(owner = "client!all", name = "m", descriptor = "(II)Z")
	@Override
	public boolean method14720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		return this.aClass589_1.method31847(arg0, -1593034678);
	}

	@OriginalMember(owner = "client!all", name = "u", descriptor = "(I)V")
	@Override
	public void method14714(@OriginalArg(0) int arg0) {
		this.aClass589_1.method31855(1863702203);
		this.aClass594_1.method31910(1025532681);
	}

	@OriginalMember(owner = "client!all", name = "r", descriptor = "([BII)I")
	@Override
	public int method14719(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass589_1.method31844(arg0, arg1, arg2, -991468413);
	}

	@OriginalMember(owner = "client!all", name = "w", descriptor = "([BIII)V")
	@Override
	public void method14712(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		this.aClass594_1.method31908(arg0, arg1, arg2, (byte) 16);
	}

	@OriginalMember(owner = "client!all", name = "l", descriptor = "(I)V")
	@Override
	public void method14713(@OriginalArg(0) int arg0) {
		this.aClass594_1.method31909((byte) 89);
		try {
			this.aSocket2.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass589_1.method31840(-1122101457);
	}

	@OriginalMember(owner = "client!all", name = "f", descriptor = "([BIIB)I")
	@Override
	public int method14711(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		return this.aClass589_1.method31844(arg0, arg1, arg2, -290440176);
	}

	@OriginalMember(owner = "client!all", name = "hl", descriptor = "()V")
	void method14733() {
		this.method14713(-1801289143);
	}

	@OriginalMember(owner = "client!all", name = "z", descriptor = "(I)Z")
	@Override
	public boolean method14709(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass589_1.method31847(arg0, -1593034678);
	}

	@OriginalMember(owner = "client!all", name = "k", descriptor = "(B)I")
	@Override
	public int method14725(@OriginalArg(0) byte arg0) throws IOException {
		return this.aClass589_1.method31839(-196271940);
	}

	@OriginalMember(owner = "client!all", name = "p", descriptor = "()I")
	@Override
	public int method14716() throws IOException {
		return this.aClass589_1.method31839(-1666270062);
	}

	@OriginalMember(owner = "client!all", name = "c", descriptor = "()I")
	@Override
	public int method14718() throws IOException {
		return this.aClass589_1.method31839(-1884729936);
	}

	@OriginalMember(owner = "client!all", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method14713(-734619071);
	}

	@OriginalMember(owner = "client!all", name = "d", descriptor = "()I")
	@Override
	public int method14724() throws IOException {
		return this.aClass589_1.method31839(-88180973);
	}

	@OriginalMember(owner = "client!all", name = "o", descriptor = "()V")
	@Override
	public void method14721() {
		this.aClass594_1.method31909((byte) 7);
		try {
			this.aSocket2.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass589_1.method31840(-1122101457);
	}

	@OriginalMember(owner = "client!all", name = "s", descriptor = "()V")
	@Override
	public void method14722() {
		this.aClass589_1.method31855(1977555894);
		this.aClass594_1.method31910(599193165);
	}

	@OriginalMember(owner = "client!all", name = "y", descriptor = "()V")
	@Override
	public void method14723() {
		this.aClass589_1.method31855(1488531699);
		this.aClass594_1.method31910(-1088302040);
	}
}
