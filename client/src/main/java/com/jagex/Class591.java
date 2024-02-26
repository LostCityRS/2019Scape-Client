package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class591 implements Interface66 {

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	final int anInt5316;

	@OriginalMember(owner = "client!ue", name = "kt", descriptor = "(IILclient!hx;I)V")
	static void method31924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6 = arg0 + arg2.anInt4103 * 1892149809;
		@Pc(10) int local10 = arg1 + 15;
		if (!client.aBoolean715) {
			return;
		}
		@Pc(14) int local14 = -256;
		if (client.anInt3413 * -1936589983 < 20) {
			local14 = -65536;
		}
		Class709.aClass104_26.method7629("Fps:" + client.anInt3413 * -1936589983 + " (" + client.anInt3414 * 197513509 + " ms)", local6, local10, local14, -1, 1516686044);
		local10 += 15;
		@Pc(49) Runtime local49 = Runtime.getRuntime();
		@Pc(54) long local54 = local49.totalMemory() / 1024L;
		@Pc(61) long local61 = local54 - local49.freeMemory() / 1024L;
		@Pc(63) int local63 = -256;
		if (local61 > 262144L) {
			local63 = -65536;
		}
		Class709.aClass104_26.method7629("Mem:" + local61 + "/" + local54 + "k", local6, local10, local63, -1, 1755000327);
		local10 += 15;
		@Pc(96) long local96 = client.aClass75_1.aClass566_1.method31486((byte) 1);
		@Pc(98) String local98 = "N/A";
		if (local96 != -1L) {
			local98 = local96 + "ms";
			if (local96 > 500L) {
				local98 = Class90.method1870(16711680, -1345471427) + local98 + Class90.method1870(16776960, -2131854873);
			}
		}
		Class709.aClass104_26.method7629("Game: In:" + client.aClass75_1.anInt244 * 2123726567 + "B/s " + "Out:" + client.aClass75_1.anInt242 * -1835326437 + "B/s " + "Ping:" + local98, local6, local10, -256, -1, 2091622140);
		local10 += 15;
		@Pc(169) long local169 = client.aClass75_2.aClass566_1.method31486((byte) 1);
		@Pc(171) String local171 = "N/A";
		if (local169 != -1L) {
			local171 = local169 + "ms";
			if (local169 > 500L) {
				local171 = Class90.method1870(16711680, -1257171276) + local171 + Class90.method1870(16776960, -1377373127);
			}
		}
		Class709.aClass104_26.method7629("Lobby: In:" + client.aClass75_2.anInt244 * 2123726567 + "B/s " + "Out:" + client.aClass75_2.anInt242 * -1835326437 + "B/s " + "Ping:" + local171, local6, local10, -256, -1, 1841127646);
		local10 += 15;
		@Pc(242) int local242 = Class279.aClass102_9.method20911() / 1024;
		Class709.aClass104_26.method7629("Offheap:" + local242 + "k", local6, local10, local242 > 65536 ? -65536 : -256, -1, 1980129079);
		local10 += 15;
		@Pc(267) int local267 = 0;
		@Pc(269) int local269 = 0;
		@Pc(271) int local271 = 0;
		for (@Pc(273) int local273 = 0; local273 < Class626.aClass141_Sub1Array2.length; local273++) {
			if (Class626.aClass141_Sub1Array2[local273] != null && Class626.aClass141_Sub1Array2[local273].method10918(-2106543281)) {
				local267 += Class626.aClass141_Sub1Array2[local273].method10922((byte) -62);
				local269 += Class626.aClass141_Sub1Array2[local273].method10914(1029385045);
				local271 += Class626.aClass141_Sub1Array2[local273].method10940(1534836965);
			}
		}
		@Pc(328) long local328 = local267 == 0 ? 0L : (long) local271 * 100L / (long) local267;
		@Pc(341) long local341 = local267 == 0 ? 0L : (long) local269 * 10000L / (long) local267;
		@Pc(361) String local361 = "Cache:" + Class638.method32880(local341, 2, true, Class719.aClass719_4, -2062847756) + "% (" + local328 + "%)";
		Class108.aClass104_22.method7629(local361, local6, local10, -256, -1, 1905201329);
		local10 += 12;
	}

	@OriginalMember(owner = "client!ue", name = "hn", descriptor = "(Lclient!yp;S)V")
	static void method31925(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class630.method32716(local11, local14, false, 0, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!ue", name = "um", descriptor = "(Lclient!yp;I)V")
	static void method31926(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2089566819);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4074 * 1940765415;
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
	Class591(@OriginalArg(0) int arg0) {
		this.anInt5316 = arg0 * -1696887869;
	}

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "(I)V")
	@Override
	public void method32127(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_57, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt5316 * -215532309, 1735563340);
		client.aClass75_1.method1325(local5, (byte) -10);
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
	@Override
	public void method32128() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_57, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt5316 * -215532309, 136578615);
		client.aClass75_1.method1325(local5, (byte) -76);
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
	@Override
	public void method32126() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_57, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt5316 * -215532309, 534943251);
		client.aClass75_1.method1325(local5, (byte) -9);
	}
}
