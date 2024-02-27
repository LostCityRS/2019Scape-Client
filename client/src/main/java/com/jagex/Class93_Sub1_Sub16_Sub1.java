package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atb")
public final class Class93_Sub1_Sub16_Sub1 extends Class93_Sub1_Sub16 {

	@OriginalMember(owner = "client!atb", name = "p", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture2;

	@OriginalMember(owner = "client!atb", name = "d", descriptor = "I")
	final int anInt3187;

	@OriginalMember(owner = "client!atb", name = "<init>", descriptor = "(I)V")
	Class93_Sub1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.anInt3187 = arg0 * 1592416151;
	}

	@OriginalMember(owner = "client!atb", name = "u", descriptor = "(Ljava/util/concurrent/Future;)V")
	void method23322(@OriginalArg(0) Future arg0) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atb", name = "l", descriptor = "(Ljava/util/concurrent/Future;B)V")
	void method23323(@OriginalArg(0) Future arg0, @OriginalArg(1) byte arg1) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atb", name = "e", descriptor = "(I)[B")
	@Override
	byte[] method23993(@OriginalArg(0) int arg0) {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class490) this.aFuture2.get()).method30153(909118639);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atb", name = "n", descriptor = "(I)I")
	@Override
	int method23995(@OriginalArg(0) int arg0) {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atb", name = "k", descriptor = "()[B")
	@Override
	byte[] method23994() {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class490) this.aFuture2.get()).method30153(1687838643);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atb", name = "f", descriptor = "()I")
	@Override
	int method23991() {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atb", name = "w", descriptor = "()I")
	@Override
	int method23996() {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atb", name = "m", descriptor = "()[B")
	@Override
	byte[] method23992() {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class490) this.aFuture2.get()).method30153(793898483);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atb", name = "z", descriptor = "(Ljava/util/concurrent/Future;)V")
	void method23324(@OriginalArg(0) Future arg0) {
		this.aFuture2 = arg0;
	}
}
