package com.jagex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public class Class494 implements Callable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!pv", name = "this$0", descriptor = "Lclient!pu;")
	final Class493 this$0;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Ljava/net/URL;")
	URL anURL2;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 aClass93_Sub1_Sub16_Sub1_1;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!pu;Ljava/net/URL;Lclient!atb;)V", line = 82)
	Class494(@OriginalArg(0) Class493 arg0, @OriginalArg(1) URL arg1, @OriginalArg(2) Class93_Sub1_Sub16_Sub1 arg2) {
		this.this$0 = arg0;
		this.anURL2 = arg1;
		this.aClass93_Sub1_Sub16_Sub1_1 = arg2;
	}

	@OriginalMember(owner = "client!pv", name = "call", descriptor = "()Ljava/lang/Object;", line = 88)
	@Override
	public Object call() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong282 = Class305.method26797(-116007928) * -5586450964000289177L;
			local11 = false;
		}
		return new Class490(this.this$0, local11 ? local3.getInputStream() : null, this.aClass93_Sub1_Sub16_Sub1_1, this.anURL2);
	}

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "()Ljava/lang/Object;", line = 88)
	public Object method30016() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong282 = Class305.method26797(1958897194) * -5586450964000289177L;
			local11 = false;
		}
		return new Class490(this.this$0, local11 ? local3.getInputStream() : null, this.aClass93_Sub1_Sub16_Sub1_1, this.anURL2);
	}

	@OriginalMember(owner = "client!pv", name = "id", descriptor = "(Lclient!yf;I)V", line = 6570)
	static final void method30017(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class293.method26589(local11, local14, arg0, 857036546);
	}

	@OriginalMember(owner = "client!pv", name = "abj", descriptor = "(Lclient!yf;I)V", line = 9883)
	static final void method30018(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26646(local12, -1757912643).method26770((byte) 110);
	}

	@OriginalMember(owner = "client!pv", name = "aou", descriptor = "(Lclient!yf;B)V", line = 12404)
	static final void method30019(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class295.method26602(arg0, arg0.aClass132_Sub1_Sub1_Sub1_4, 762968398);
	}
}
