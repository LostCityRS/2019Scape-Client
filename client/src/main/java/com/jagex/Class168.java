package com.jagex;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class168 {

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService1 = Executors.newSingleThreadExecutor();

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture1 = this.anExecutorService1.submit(new Class393());

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "(Lclient!yp;I)V")
	static void method18548(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class352 local16 = (Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -1140453464);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anIntArray425 == null ? 0 : local16.anIntArray425.length;
	}

	@OriginalMember(owner = "client!aq", name = "fp", descriptor = "(Lclient!yp;I)V")
	static void method18549(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2034864763);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class692.method36975(local16, local22, arg0, (byte) -82);
	}

	@OriginalMember(owner = "client!aq", name = "azs", descriptor = "(Lclient!yp;I)V")
	static void method18550(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16081(16711935) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	Class168() {
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(B)Ljava/security/SecureRandom;")
	SecureRandom method18543(@OriginalArg(0) byte arg0) {
		try {
			return (SecureRandom) this.aFuture1.get();
		} catch (@Pc(5) Exception local5) {
			return Class310.method27458(2044896505);
		}
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "(B)V")
	void method18544(@OriginalArg(0) byte arg0) {
		this.anExecutorService1.shutdown();
		this.anExecutorService1 = null;
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "()V")
	void method18545() {
		this.anExecutorService1.shutdown();
		this.anExecutorService1 = null;
	}

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "()V")
	void method18546() {
		this.anExecutorService1.shutdown();
		this.anExecutorService1 = null;
	}

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "()Ljava/security/SecureRandom;")
	SecureRandom method18547() {
		try {
			return (SecureRandom) this.aFuture1.get();
		} catch (@Pc(5) Exception local5) {
			return Class310.method27458(2108702835);
		}
	}
}
