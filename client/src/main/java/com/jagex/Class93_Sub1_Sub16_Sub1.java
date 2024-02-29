package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atb")
public class Class93_Sub1_Sub16_Sub1 extends Class93_Sub1_Sub16 {

	@OriginalMember(owner = "client!atb", name = "p", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture2;

	@OriginalMember(owner = "client!atb", name = "d", descriptor = "I")
	final int anInt3187;

	@OriginalMember(owner = "client!atb", name = "<init>", descriptor = "(I)V", line = 9)
	Class93_Sub1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.anInt3187 = arg0 * 1592416151;
	}

	@OriginalMember(owner = "client!atb", name = "u", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method23310(@OriginalArg(0) Future arg0) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atb", name = "l", descriptor = "(Ljava/util/concurrent/Future;B)V", line = 14)
	void method23311(@OriginalArg(0) Future arg0, @OriginalArg(1) byte arg1) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atb", name = "z", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method23312(@OriginalArg(0) Future arg0) {
		this.aFuture2 = arg0;
	}

	@OriginalMember(owner = "client!atb", name = "e", descriptor = "(I)[B", line = 18)
	@Override
	byte[] method23981(@OriginalArg(0) int arg0) {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class490) this.aFuture2.get()).method29973(909118639);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atb", name = "k", descriptor = "()[B", line = 18)
	@Override
	byte[] method23982() {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class490) this.aFuture2.get()).method29973(1687838643);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atb", name = "m", descriptor = "()[B", line = 18)
	@Override
	byte[] method23980() {
		if (this.aFuture2.isDone()) {
			try {
				return ((Class490) this.aFuture2.get()).method29973(793898483);
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!atb", name = "n", descriptor = "(I)I", line = 33)
	@Override
	int method23983(@OriginalArg(0) int arg0) {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atb", name = "f", descriptor = "()I", line = 33)
	@Override
	int method23979() {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!atb", name = "w", descriptor = "()I", line = 33)
	@Override
	int method23984() {
		if (this.aFuture2 == null) {
			return 0;
		} else if (this.aFuture2.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}
}
