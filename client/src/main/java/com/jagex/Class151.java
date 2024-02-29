package com.jagex;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public class Class151 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService1 = Executors.newSingleThreadExecutor();

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture1 = this.anExecutorService1.submit(new Class256());

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 13)
	Class151() {
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 18)
	void method13974(@OriginalArg(0) int arg0) {
		this.anExecutorService1.shutdown();
		this.anExecutorService1 = null;
	}

	@OriginalMember(owner = "client!al", name = "n", descriptor = "(I)Ljava/security/SecureRandom;", line = 24)
	SecureRandom method13975(@OriginalArg(0) int arg0) {
		try {
			return (SecureRandom) this.aFuture1.get();
		} catch (@Pc(5) Exception local5) {
			return Class517.method30291(1774809527);
		}
	}

	@OriginalMember(owner = "client!al", name = "k", descriptor = "()Ljava/security/SecureRandom;", line = 24)
	SecureRandom method13976() {
		try {
			return (SecureRandom) this.aFuture1.get();
		} catch (@Pc(5) Exception local5) {
			return Class517.method30291(1749841031);
		}
	}

	@OriginalMember(owner = "client!al", name = "m", descriptor = "()Ljava/security/SecureRandom;", line = 24)
	SecureRandom method13977() {
		try {
			return (SecureRandom) this.aFuture1.get();
		} catch (@Pc(5) Exception local5) {
			return Class517.method30291(2073155034);
		}
	}

	@OriginalMember(owner = "client!al", name = "n", descriptor = "(I)V", line = 58)
	static void method13978(@OriginalArg(0) int arg0) {
		Class93_Sub1_Sub11.aClass16_17.method225((byte) 73);
		Class93_Sub1_Sub11.aClass18_12.method244(368759775);
		Class93_Sub1_Sub11.aClass18_11.method244(1547213573);
	}

	@OriginalMember(owner = "client!al", name = "m", descriptor = "(IB)Lclient!db;", line = 153)
	static Class222 method13979(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class222 local6 = (Class222) Class107.method18116(Class596.method31763((byte) 2), arg0, -1915563430);
		if (local6 == null) {
			local6 = Class222.aClass222_2;
		}
		return local6;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "([BB)V", line = 633)
	static void method13980(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22465((short) 16384);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22472(-1434290800);
				Class274.aClass258_1.method26107(local19, -1457431552);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;I)V", line = 791)
	static void method13981(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6, @OriginalArg(7) int arg7) {
		Class323.method27276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class319.aClass319_1, Class328.aClass328_3, 1714399906);
	}
}
