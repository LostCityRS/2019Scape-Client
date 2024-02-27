package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

@OriginalClass("client!ug")
public abstract class BufferedSocket {

	@OriginalMember(owner = "client!ug", name = "ub", descriptor = "Lclient!ahd;")
	public static Class121_Sub1 aClass121_Sub1_2;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Ljava/net/Socket;II)Lclient!ug;")
	static BufferedSocket method15544(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return new BufferedSocket_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Ljava/net/Socket;II)Lclient!ug;")
	static BufferedSocket method15546(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return new BufferedSocket_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "(Ljava/net/Socket;I)Lclient!ug;")
	public static BufferedSocket method15565(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return Class515.method30572(arg0, arg1, arg1, 1535694702);
	}

	@OriginalMember(owner = "client!ug", name = "aoy", descriptor = "(Lclient!yp;I)V")
	static void method15568(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class354 local16 = Class389.method28648(local12, 2136729899);
		if (local16 == null) {
			throw new RuntimeException();
		}
		aClass121_Sub1_2.method9649(local16, (byte) 67);
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	BufferedSocket() {
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(IB)Z")
	public abstract boolean hasBytes(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) throws IOException;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "(I)I")
	public abstract int available(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "([BIII)V")
	public abstract void write(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(S)V")
	public abstract void close(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(B)V")
	public abstract void method15550(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "([BIII)I")
	public abstract int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Z")
	public abstract boolean method15552(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "(I)Z")
	public abstract boolean method15553(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "()I")
	public abstract int method15554() throws IOException;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "()I")
	public abstract int method15555() throws IOException;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "([BII)I")
	public abstract int method15556(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "([BII)I")
	public abstract int method15557(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "([BII)I")
	public abstract int method15558(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "([BII)I")
	public abstract int method15559(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "([BII)V")
	public abstract void method15560(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "()V")
	public abstract void method15561();

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "()V")
	public abstract void method15562();

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "()V")
	public abstract void method15563();

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "()V")
	public abstract void method15564();

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(I)Z")
	public abstract boolean method15566(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "(I)Z")
	public abstract boolean method15567(@OriginalArg(0) int arg0) throws IOException;
}
