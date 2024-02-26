package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atl")
public final class Class80_Sub1_Sub15_Sub1 extends Class80_Sub1_Sub15 {

	@OriginalMember(owner = "client!atl", name = "j", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture2;

	@OriginalMember(owner = "client!atl", name = "a", descriptor = "I")
	final int anInt3234;

	@OriginalMember(owner = "client!atl", name = "<init>", descriptor = "(I)V")
	Class80_Sub1_Sub15_Sub1(@OriginalArg(0) int arg0) {
		this.anInt3234 = arg0 * 1138467671;
	}

	@OriginalMember(owner = "client!atl", name = "i", descriptor = "(Ljava/util/concurrent/Future;)V")
	void method23822(@OriginalArg(0) Future arg0) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atl", name = "g", descriptor = "(Ljava/util/concurrent/Future;I)V")
	void method23823(@OriginalArg(0) Future arg0, @OriginalArg(1) int arg1) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atl", name = "u", descriptor = "()[B")
	@Override
	byte[] method24392() {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class483) this.aFuture2.get()).method30024(1163527714);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atl", name = "f", descriptor = "(I)I")
	@Override
	int method24391(@OriginalArg(0) int arg0) {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atl", name = "t", descriptor = "(I)[B")
	@Override
	byte[] method24390(@OriginalArg(0) int arg0) {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class483) this.aFuture2.get()).method30024(1555262089);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atl", name = "l", descriptor = "()I")
	@Override
	int method24393() {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atl", name = "e", descriptor = "()[B")
	@Override
	byte[] method24389() {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class483) this.aFuture2.get()).method30024(1483095854);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}
}
