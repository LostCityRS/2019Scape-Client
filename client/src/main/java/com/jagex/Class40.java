package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abp")
public final class Class40 {

	@OriginalMember(owner = "client!abp", name = "l", descriptor = "[Lclient!xe;")
	static Class658[] aClass658Array1;

	@OriginalMember(owner = "client!abp", name = "aj", descriptor = "I")
	static int anInt116;

	@OriginalMember(owner = "client!abp", name = "gp", descriptor = "Lclient!pf;")
	public static Class480 aClass480_3;

	@OriginalMember(owner = "client!abp", name = "t", descriptor = "Ljava/io/RandomAccessFile;")
	RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!abp", name = "f", descriptor = "J")
	final long aLong8;

	@OriginalMember(owner = "client!abp", name = "e", descriptor = "J")
	long aLong9;

	@OriginalMember(owner = "client!abp", name = "t", descriptor = "(I)V")
	static void method844(@OriginalArg(0) int arg0) {
		Class27.anInt86 = 0;
		Class27.anInt83 = -208096495;
		Class27.anInt85 = 1198271169;
		Class27.anInt88 = 2069609469;
	}

	@OriginalMember(owner = "client!abp", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class40(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong8 = arg2 * -868889435825743905L;
		this.aLong9 = 0L;
		@Pc(34) int local34 = this.aRandomAccessFile1.read();
		if (local34 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local34);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!abp", name = "j", descriptor = "()V")
	public void method826() throws IOException {
		this.method830(false, (byte) -3);
	}

	@OriginalMember(owner = "client!abp", name = "t", descriptor = "(J)V")
	void method827(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong9 = arg0 * -1186021796598229801L;
	}

	@OriginalMember(owner = "client!abp", name = "a", descriptor = "()V")
	public void method828() throws IOException {
		this.method830(false, (byte) -62);
	}

	@OriginalMember(owner = "client!abp", name = "x", descriptor = "([BII)I")
	public int method829(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong9 += (long) local6 * -1186021796598229801L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abp", name = "u", descriptor = "(ZB)V")
	void method830(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) throws IOException {
		if (this.aRandomAccessFile1 == null) {
			return;
		}
		if (arg0) {
			try {
				this.aRandomAccessFile1.getFD().sync();
			} catch (@Pc(11) SyncFailedException local11) {
			}
		}
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!abp", name = "k", descriptor = "(Z)V")
	void method831(@OriginalArg(0) boolean arg0) throws IOException {
		if (this.aRandomAccessFile1 == null) {
			return;
		}
		if (arg0) {
			try {
				this.aRandomAccessFile1.getFD().sync();
			} catch (@Pc(11) SyncFailedException local11) {
			}
		}
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!abp", name = "g", descriptor = "([BIIB)I")
	public int method832(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong9 += (long) local6 * -1186021796598229801L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abp", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method838(-557722830);
		}
	}

	@OriginalMember(owner = "client!abp", name = "hj", descriptor = "()V")
	void method833() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method838(-2089976258);
		}
	}

	@OriginalMember(owner = "client!abp", name = "f", descriptor = "([BIIB)V")
	public void method834(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		if ((long) arg2 + this.aLong9 * 7557773997205872359L > this.aLong8 * -8836652103685233633L) {
			this.aRandomAccessFile1.seek(this.aLong8 * -8836652103685233633L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong9 += (long) arg2 * -1186021796598229801L;
		}
	}

	@OriginalMember(owner = "client!abp", name = "i", descriptor = "(J)V")
	void method835(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong9 = arg0 * -1186021796598229801L;
	}

	@OriginalMember(owner = "client!abp", name = "ht", descriptor = "()V")
	void method836() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method838(-1437336402);
		}
	}

	@OriginalMember(owner = "client!abp", name = "o", descriptor = "()V")
	public void method837() throws IOException {
		this.method830(false, (byte) -69);
	}

	@OriginalMember(owner = "client!abp", name = "e", descriptor = "(I)V")
	public void method838(@OriginalArg(0) int arg0) throws IOException {
		this.method830(false, (byte) -93);
	}

	@OriginalMember(owner = "client!abp", name = "l", descriptor = "(B)J")
	public long method839(@OriginalArg(0) byte arg0) throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abp", name = "s", descriptor = "(Z)V")
	void method840(@OriginalArg(0) boolean arg0) throws IOException {
		if (this.aRandomAccessFile1 == null) {
			return;
		}
		if (arg0) {
			try {
				this.aRandomAccessFile1.getFD().sync();
			} catch (@Pc(11) SyncFailedException local11) {
			}
		}
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!abp", name = "hy", descriptor = "()V")
	void method841() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method838(-1279204988);
		}
	}

	@OriginalMember(owner = "client!abp", name = "m", descriptor = "(J)V")
	void method842(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong9 = arg0 * -1186021796598229801L;
	}

	@OriginalMember(owner = "client!abp", name = "w", descriptor = "([BII)I")
	public int method843(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong9 += (long) local6 * -1186021796598229801L;
		}
		return local6;
	}
}
