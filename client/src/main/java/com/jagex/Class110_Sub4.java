package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aft")
public final class Class110_Sub4 extends Class110 {

	@OriginalMember(owner = "client!aft", name = "n", descriptor = "I")
	final int anInt862;

	@OriginalMember(owner = "client!aft", name = "m", descriptor = "I")
	final int anInt860;

	@OriginalMember(owner = "client!aft", name = "k", descriptor = "I")
	final int anInt861;

	@OriginalMember(owner = "client!aft", name = "f", descriptor = "I")
	final int anInt859;

	@OriginalMember(owner = "client!aft", name = "w", descriptor = "I")
	final int anInt863;

	@OriginalMember(owner = "client!aft", name = "jj", descriptor = "(IILclient!hf;B)V")
	static void method7301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) byte arg3) {
		@Pc(6) int local6 = arg2.anInt4022 * 1215292027 + arg0;
		@Pc(10) int local10 = arg1 + 15;
		if (!client.aBoolean601) {
			return;
		}
		@Pc(14) int local14 = -256;
		if (client.anInt3407 * 1249273355 < 20) {
			local14 = -65536;
		}
		Class82.aClass106_1.method7525("Fps:" + client.anInt3407 * 1249273355 + " (" + client.anInt3417 * -2066467757 + " ms)", local6, local10, local14, -1, 1336485814);
		local10 += 15;
		@Pc(49) Runtime local49 = Runtime.getRuntime();
		@Pc(54) long local54 = local49.totalMemory() / 1024L;
		@Pc(61) long local61 = local54 - local49.freeMemory() / 1024L;
		@Pc(63) int local63 = -256;
		if (local61 > 262144L) {
			local63 = -65536;
		}
		Class82.aClass106_1.method7525("Mem:" + local61 + "/" + local54 + "k", local6, local10, local63, -1, 1336485814);
		local10 += 15;
		@Pc(96) long local96 = client.aClass175_2.aClass238_1.method25874((byte) 44);
		@Pc(98) String local98 = "N/A";
		if (local96 != -1L) {
			local98 = local96 + "ms";
			if (local96 > 500L) {
				local98 = Class306.method26916(16711680, 2016878805) + local98 + Class306.method26916(16776960, 298459686);
			}
		}
		Class82.aClass106_1.method7525("Game: In:" + client.aClass175_2.anInt3305 * -495442903 + "B/s " + "Out:" + client.aClass175_2.anInt3302 * 4621161 + "B/s " + "Ping:" + local98, local6, local10, -256, -1, 1336485814);
		local10 += 15;
		@Pc(169) long local169 = client.aClass175_1.aClass238_1.method25874((byte) 72);
		@Pc(171) String local171 = "N/A";
		if (local169 != -1L) {
			local171 = local169 + "ms";
			if (local169 > 500L) {
				local171 = Class306.method26916(16711680, 1779407828) + local171 + Class306.method26916(16776960, 1607586527);
			}
		}
		Class82.aClass106_1.method7525("Lobby: In:" + client.aClass175_1.anInt3305 * -495442903 + "B/s " + "Out:" + client.aClass175_1.anInt3302 * 4621161 + "B/s " + "Ping:" + local171, local6, local10, -256, -1, 1336485814);
		local10 += 15;
		@Pc(242) int local242 = Class694.aClass104_14.method20831() / 1024;
		Class82.aClass106_1.method7525("Offheap:" + local242 + "k", local6, local10, local242 > 65536 ? -65536 : -256, -1, 1336485814);
		local10 += 15;
		@Pc(267) int local267 = 0;
		@Pc(269) int local269 = 0;
		@Pc(271) int local271 = 0;
		for (@Pc(273) int local273 = 0; local273 < Class569.aClass143_Sub1Array2.length; local273++) {
			if (Class569.aClass143_Sub1Array2[local273] != null && Class569.aClass143_Sub1Array2[local273].method11085(-1964309414)) {
				local267 += Class569.aClass143_Sub1Array2[local273].method11074((byte) -19);
				local269 += Class569.aClass143_Sub1Array2[local273].method11075((byte) 32);
				local271 += Class569.aClass143_Sub1Array2[local273].method11076(1792508096);
			}
		}
		@Pc(328) long local328 = local267 == 0 ? 0L : (long) local271 * 100L / (long) local267;
		@Pc(340) long local340 = local267 == 0 ? 0L : (long) local269 * 10000L / (long) local267;
		@Pc(360) String local360 = "Cache:" + Class218.method25601(local340, 2, true, Class717.aClass717_15, -433742498) + "% (" + local328 + "%)";
		Class707.aClass106_13.method7525(local360, local6, local10, -256, -1, 1336485814);
		local10 += 12;
	}

	@OriginalMember(owner = "client!aft", name = "n", descriptor = "(Lclient!ws;I)V")
	public static void method7302(@OriginalArg(0) Class645 arg0, @OriginalArg(1) int arg1) {
		Class393.anInt4816 = arg0.anInt5944 * 256747865;
		Class393.anInt4821 = arg0.anInt5920 * -242887863;
		Class393.anInt4817 = arg0.anInt5945 * -1862207309;
		Class32_Sub7.anInt2393 = arg0.anInt5946 * -1765554381;
		Class106_Sub2.anInt749 = arg0.anInt5947 * 834916619;
		Class81.anInt248 = arg0.anInt5948 * -143199265;
		Class393.anInt4813 = arg0.anInt5931 * 1255722141;
		Class393.anInt4819 = arg0.anInt5950 * -1022421593;
		Class609.anInt5745 = arg0.anInt5951 * -1589769053;
		InputStream_Sub1.anInt2587 = arg0.anInt5923 * -337713749;
		Class393.anInt4820 = arg0.anInt5924 * 1472209741;
		Class93_Sub26_Sub3.anInt2999 = arg0.anInt5937 * -1317269457;
	}

	@OriginalMember(owner = "client!aft", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub4(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt862 = arg0.method22427(-1434290800) * -719734379;
		this.anInt860 = arg0.method22427(-1434290800) * -685673635;
		this.anInt861 = arg0.method22427(-1434290800) * -772206359;
		this.anInt859 = arg0.method22427(-1434290800) * 363761603;
		this.anInt863 = arg0.method22427(-1434290800) * -207321745;
	}

	@OriginalMember(owner = "client!aft", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class104_Sub3.method5765(this.anInt862 * 958187965, this.anInt861 * -1213937831, this.anInt860 * 1560115445, 100, 100, false, 1902992729);
		Class123.method9086(this.anInt859 * 1423792363, this.anInt863 * -394757745, 0, -1223039695);
		client.aBoolean615 = true;
	}

	@OriginalMember(owner = "client!aft", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class104_Sub3.method5765(this.anInt862 * 958187965, this.anInt861 * -1213937831, this.anInt860 * 1560115445, 100, 100, false, 1390084290);
		Class123.method9086(this.anInt859 * 1423792363, this.anInt863 * -394757745, 0, -1223039695);
		client.aBoolean615 = true;
	}
}
