package com.jagex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class475 implements Callable {

	@OriginalMember(owner = "client!pa", name = "dd", descriptor = "Lclient!nq;")
	public static Class445 aClass445_1;

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
	static int anInt4961;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pa", name = "this$0", descriptor = "Lclient!pq;")
	final Class490 aClass490_3;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Ljava/net/URL;")
	URL anURL2;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 aClass80_Sub1_Sub15_Sub1_1;

	@OriginalMember(owner = "client!pa", name = "tn", descriptor = "(B)J")
	static long method29884(@OriginalArg(0) byte arg0) {
		return (long) ((Class681.anInt5744 += 111564141) * -1395786651 - 1) << 32 | 0xFFFFFFFFL;
	}

	@OriginalMember(owner = "client!pa", name = "hb", descriptor = "(Lclient!ahb;I)V")
	static void method29885(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class6 local2 = arg0.aClass6_3;
		if (client.anInt3436 == arg0.anInt2689 * 1790159189 || !local2.method23590(-499060808) || local2.method23629(1, -1127446556)) {
			@Pc(27) int local27 = arg0.anInt2689 * 1790159189 - arg0.anInt2688 * -1881785185;
			@Pc(34) int local34 = client.anInt3436 - arg0.anInt2688 * -1881785185;
			@Pc(45) int local45 = arg0.anInt2684 * -2097547776 + arg0.method18966((byte) -121) * 256;
			@Pc(56) int local56 = arg0.anInt2704 * -73903616 + arg0.method18966((byte) -76) * 256;
			@Pc(67) int local67 = arg0.anInt2676 * -415562240 + arg0.method18966((byte) -23) * 256;
			@Pc(78) int local78 = arg0.anInt2675 * -519902720 + arg0.method18966((byte) -121) * 256;
			@Pc(90) int local90 = (local67 * local34 + local45 * (local27 - local34)) / local27;
			@Pc(102) int local102 = (local34 * local78 + (local27 - local34) * local56) / local27;
			@Pc(111) int local111 = Class439.method29150(local90, local102, arg0.anInt2686 * -1606116371, 1037753497);
			@Pc(120) int local120 = Class439.method29150(local67, local78, arg0.anInt2687 * 2081287233, 1037753497);
			@Pc(132) int local132 = (local120 * local34 + local111 * (local27 - local34)) / local27;
			arg0.method24531((float) local90, (float) local132, (float) local102);
		}
		arg0.anInt2678 = 0;
		arg0.method18986(arg0.anInt2677 * 1640742599, false, (byte) -2);
	}

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;")
	public static String method29886(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class308.method27442(local16, (byte) -24);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!pq;Ljava/net/URL;Lclient!atl;)V")
	Class475(@OriginalArg(0) Class490 arg0, @OriginalArg(1) URL arg1, @OriginalArg(2) Class80_Sub1_Sub15_Sub1 arg2) {
		this.aClass490_3 = arg0;
		this.anURL2 = arg1;
		this.aClass80_Sub1_Sub15_Sub1_1 = arg2;
	}

	@OriginalMember(owner = "client!pa", name = "call", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object call() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.aClass490_3.aLong387 = Class303.method27111((byte) 12) * -7572508353662902279L;
			local11 = false;
		}
		return new Class483(this.aClass490_3, local11 ? local3.getInputStream() : null, this.aClass80_Sub1_Sub15_Sub1_1, this.anURL2);
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "()Ljava/lang/Object;")
	public Object method29883() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.aClass490_3.aLong387 = Class303.method27111((byte) 58) * -7572508353662902279L;
			local11 = false;
		}
		return new Class483(this.aClass490_3, local11 ? local3.getInputStream() : null, this.aClass80_Sub1_Sub15_Sub1_1, this.anURL2);
	}
}
