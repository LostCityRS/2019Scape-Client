package com.jagex;

import com.jagex.twitchtv.TwitchTV;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@OriginalClass("client!l")
public final class Class393 implements Callable {

	@OriginalMember(owner = "client!l", name = "aq", descriptor = "[Lclient!cm;")
	static Class99[] aClass99Array7;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Ljava/security/SecureRandom;")
	static SecureRandom method28686() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Ljava/security/SecureRandom;")
	static SecureRandom method28687() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Ljava/security/SecureRandom;")
	static SecureRandom method28688() {
		@Pc(3) SecureRandom local3 = new SecureRandom();
		local3.nextInt();
		return local3;
	}

	@OriginalMember(owner = "client!l", name = "aod", descriptor = "(Lclient!yp;I)V")
	static void method28689(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class160.aClass121_Sub1_2.method9607(-1459478280) != Class340.aClass340_7 || Class160.aClass121_Sub1_2.method9702(757298057) != Class347.aClass347_3) {
			throw new RuntimeException();
		}
		@Pc(20) Class463 local20 = ((Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1923755221)).method10019(1839083426);
		@Pc(27) Class463 local27 = ((Class20_Sub5) Class160.aClass121_Sub1_2.method9693(2067870696)).method16940(-761692517);
		@Pc(30) Class463 local30 = Class463.method29472(local20);
		local30.method29486(local27);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) local30.method29481();
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "(S)I")
	static int method28690(@OriginalArg(0) short arg0) {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < Class622.aStringArray32.length; local1++) {
				if (Class622.aStringArray32[local1] != null && Class622.aBooleanArray33[local1]) {
					Class588.method31902(350319923).method31859(Class622.aStringArray32[local1], -1195008882);
				}
			}
		} catch (@Pc(25) Exception_Sub7 local25) {
			return 3;
		}
		Class669.aTwitchTV1 = new TwitchTV();
		local1 = Class669.aTwitchTV1.InitialiseTTV(Class501.method30419(259011172));
		if (local1 == 0) {
			Class622.aBoolean936 = true;
		} else {
			Class603.method32133(10 + Class256.aString157 + local1, new RuntimeException(), 839300151);
		}
		return 2;
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	Class393() {
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Ljava/lang/Object;")
	public Object method28685() {
		return Class310.method27458(2138253761);
	}

	@OriginalMember(owner = "client!l", name = "call", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object call() {
		return Class310.method27458(2120900655);
	}
}
