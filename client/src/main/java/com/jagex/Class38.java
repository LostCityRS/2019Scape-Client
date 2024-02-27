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

@OriginalClass("client!abl")
public final class Class38 {

	@OriginalMember(owner = "client!abl", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!abl", name = "n", descriptor = "J")
	final long aLong3;

	@OriginalMember(owner = "client!abl", name = "m", descriptor = "J")
	long aLong2;

	@OriginalMember(owner = "client!abl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class38(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong3 = arg2 * 6871427037469275183L;
		this.aLong2 = 0L;
		@Pc(34) int local34 = this.aRandomAccessFile1.read();
		if (local34 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local34);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!abl", name = "o", descriptor = "([BII)I")
	public int method720(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong2 += (long) local6 * 652475383648725799L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abl", name = "c", descriptor = "()V")
	public void method721() throws IOException {
		this.method724(false, -968138374);
	}

	@OriginalMember(owner = "client!abl", name = "n", descriptor = "([BIII)V")
	public void method722(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong2 * -1533135506001161065L + (long) arg2 > this.aLong3 * -4840109512671702321L) {
			this.aRandomAccessFile1.seek(this.aLong3 * -4840109512671702321L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong2 += (long) arg2 * 652475383648725799L;
		}
	}

	@OriginalMember(owner = "client!abl", name = "e", descriptor = "(J)V")
	void method723(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong2 = arg0 * 652475383648725799L;
	}

	@OriginalMember(owner = "client!abl", name = "k", descriptor = "(ZI)V")
	void method724(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aRandomAccessFile1 == null) {
			return;
		}
		if (arg0) {
			try {
				this.aRandomAccessFile1.getFD().sync();
			} catch (@Pc(10) SyncFailedException local10) {
			}
		}
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!abl", name = "z", descriptor = "(J)V")
	void method725(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong2 = arg0 * 652475383648725799L;
	}

	@OriginalMember(owner = "client!abl", name = "w", descriptor = "([BIIB)I")
	public int method726(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong2 += (long) local6 * 652475383648725799L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abl", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method732(-1178992354);
		}
	}

	@OriginalMember(owner = "client!abl", name = "u", descriptor = "(J)V")
	void method727(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong2 = arg0 * 652475383648725799L;
	}

	@OriginalMember(owner = "client!abl", name = "l", descriptor = "(J)V")
	void method728(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong2 = arg0 * 652475383648725799L;
	}

	@OriginalMember(owner = "client!abl", name = "hl", descriptor = "()V")
	void method729() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method732(-419794684);
		}
	}

	@OriginalMember(owner = "client!abl", name = "p", descriptor = "(J)V")
	void method730(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong2 = arg0 * 652475383648725799L;
	}

	@OriginalMember(owner = "client!abl", name = "d", descriptor = "([BII)V")
	public void method731(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong2 * -1533135506001161065L + (long) arg2 > this.aLong3 * -4840109512671702321L) {
			this.aRandomAccessFile1.seek(this.aLong3 * -4840109512671702321L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong2 += (long) arg2 * 652475383648725799L;
		}
	}

	@OriginalMember(owner = "client!abl", name = "m", descriptor = "(I)V")
	public void method732(@OriginalArg(0) int arg0) throws IOException {
		this.method724(false, -968138374);
	}

	@OriginalMember(owner = "client!abl", name = "r", descriptor = "()J")
	public long method733() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abl", name = "v", descriptor = "()J")
	public long method734() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abl", name = "f", descriptor = "(I)J")
	public long method735(@OriginalArg(0) int arg0) throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
