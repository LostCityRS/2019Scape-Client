package com.jagex;

import deob.ObfuscatedName;

import java.io.*;

@ObfuscatedName("abl")
public final class class752 {

	@ObfuscatedName("abl.e")
	public RandomAccessFile field8761;

	@ObfuscatedName("abl.n")
	public final long field8762;

	@ObfuscatedName("abl.m")
	public long field8760;

	public class752(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.field8761 = new RandomAccessFile(arg0, arg1);
		this.field8762 = arg2;
		this.field8760 = 0L;
		int var5 = this.field8761.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.field8761.seek(0L);
			this.field8761.write(var5);
		}
		this.field8761.seek(0L);
	}

	@ObfuscatedName("abl.e(J)V")
	public final void method14809(long arg0) throws IOException {
		this.field8761.seek(arg0);
		this.field8760 = arg0;
	}

	@ObfuscatedName("abl.n([BIII)V")
	public final void method14808(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.field8760 + (long) arg2 > this.field8762) {
			this.field8761.seek(this.field8762);
			this.field8761.write(1);
			throw new EOFException();
		} else {
			this.field8761.write(arg0, arg1, arg2);
			this.field8760 += arg2;
		}
	}

	@ObfuscatedName("abl.m(I)V")
	public final void method14818() throws IOException {
		this.method14810(false);
	}

	@ObfuscatedName("abl.k(ZI)V")
	public final void method14810(boolean arg0) throws IOException {
		if (this.field8761 == null) {
			return;
		}
		if (arg0) {
			try {
				this.field8761.getFD().sync();
			} catch (SyncFailedException var3) {
			}
		}
		this.field8761.close();
		this.field8761 = null;
	}

	@ObfuscatedName("abl.f(I)J")
	public final long method14821() throws IOException {
		return this.field8761.length();
	}

	@ObfuscatedName("abl.w([BIIB)I")
	public final int method14812(byte[] arg0, int arg1, int arg2) throws IOException {
		int var4 = this.field8761.read(arg0, arg1, arg2);
		if (var4 > 0) {
			this.field8760 += var4;
		}
		return var4;
	}

	public void finalize() throws Throwable {
		if (this.field8761 != null) {
			System.out.println("");
			this.method14818();
		}
	}
}
