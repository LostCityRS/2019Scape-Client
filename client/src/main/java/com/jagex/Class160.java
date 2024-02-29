package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uz")
public abstract class Class160 {

	@OriginalMember(owner = "client!uz", name = "l", descriptor = "I")
	static int anInt1962;

	@OriginalMember(owner = "client!uz", name = "<init>", descriptor = "()V", line = 7)
	Class160() {
	}

	@OriginalMember(owner = "client!uz", name = "x", descriptor = "(Ljava/net/Socket;I)Lclient!uz;", line = 10)
	public static Class160 method14709(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return Class117.method8366(arg0, arg1, arg1, 1924752289);
	}

	@OriginalMember(owner = "client!uz", name = "b", descriptor = "(Ljava/net/Socket;I)Lclient!uz;", line = 10)
	public static Class160 method14710(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return Class117.method8366(arg0, arg1, arg1, 1685367087);
	}

	@OriginalMember(owner = "client!uz", name = "q", descriptor = "(Ljava/net/Socket;I)Lclient!uz;", line = 10)
	public static Class160 method14711(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return Class117.method8366(arg0, arg1, arg1, 1982828000);
	}

	@OriginalMember(owner = "client!uz", name = "h", descriptor = "(Ljava/net/Socket;II)Lclient!uz;", line = 14)
	static Class160 method14712(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return new Class160_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uz", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!uz;", line = 14)
	static Class160 method14713(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return new Class160_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uz", name = "g", descriptor = "(Ljava/net/Socket;II)Lclient!uz;", line = 14)
	static Class160 method14714(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return new Class160_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uz", name = "n", descriptor = "(II)I", line = 16)
	static int method14715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!uz", name = "mk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7209)
	static final void method14716(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray9 = Class499.method30149(local13, arg2, 1466146270);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!uz", name = "bab", descriptor = "(Lclient!yf;I)V", line = 14237)
	static final void method14717(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!uz", name = "z", descriptor = "(I)Z")
	public abstract boolean method14718(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!uz", name = "v", descriptor = "([BII)V")
	public abstract void method14719(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!uz", name = "f", descriptor = "([BIIB)I")
	public abstract int method14720(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException;

	@OriginalMember(owner = "client!uz", name = "w", descriptor = "([BIII)V")
	public abstract void method14721(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException;

	@OriginalMember(owner = "client!uz", name = "l", descriptor = "(I)V")
	public abstract void method14722(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uz", name = "u", descriptor = "(I)V")
	public abstract void method14723(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uz", name = "p", descriptor = "()I")
	public abstract int method14724() throws IOException;

	@OriginalMember(owner = "client!uz", name = "c", descriptor = "()I")
	public abstract int method14725() throws IOException;

	@OriginalMember(owner = "client!uz", name = "r", descriptor = "([BII)I")
	public abstract int method14726(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!uz", name = "m", descriptor = "(II)Z")
	public abstract boolean method14727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException;

	@OriginalMember(owner = "client!uz", name = "o", descriptor = "()V")
	public abstract void method14728();

	@OriginalMember(owner = "client!uz", name = "s", descriptor = "()V")
	public abstract void method14729();

	@OriginalMember(owner = "client!uz", name = "y", descriptor = "()V")
	public abstract void method14730();

	@OriginalMember(owner = "client!uz", name = "d", descriptor = "()I")
	public abstract int method14731() throws IOException;

	@OriginalMember(owner = "client!uz", name = "k", descriptor = "(B)I")
	public abstract int method14732(@OriginalArg(0) byte arg0) throws IOException;
}
