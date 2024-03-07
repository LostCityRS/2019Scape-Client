package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public class Class624 implements Interface67 {

	@OriginalMember(owner = "client!vu", name = "dj", descriptor = "Lclient!ah;")
	public static Class120 playerVariableManager;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	final int anInt5684;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	final int anInt5683;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "[I")
	final int[] anIntArray499;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(II[I)V", line = 13)
	Class624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt5684 = arg0 * 588828987;
		this.anInt5683 = arg1 * -399770467;
		this.anIntArray499 = arg2;
	}

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;I)Z", line = 20)
	@Override
	public boolean method32253(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			if (this.anInt5684 * 1084088307 != arg0.method22891(1485620374)) {
				return false;
			}
			if (this.anInt5683 * 877816245 > arg0.method22877(-432282299)) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray499;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method14313(local42, -40307730)) {
					return false;
				}
			}
		} else if (this.anInt5684 * 1084088307 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z", line = 20)
	@Override
	public boolean method32251(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3) {
		if (arg0 != null) {
			if (this.anInt5684 * 1084088307 != arg0.method22891(-633495157)) {
				return false;
			}
			if (this.anInt5683 * 877816245 > arg0.method22877(-432282299)) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray499;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method14313(local42, 1520200603)) {
					return false;
				}
			}
		} else if (this.anInt5684 * 1084088307 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z", line = 20)
	@Override
	public boolean method32252(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3) {
		if (arg0 != null) {
			if (this.anInt5684 * 1084088307 != arg0.method22891(1846223849)) {
				return false;
			}
			if (this.anInt5683 * 877816245 > arg0.method22877(-432282299)) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray499;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method14313(local42, 2134180431)) {
					return false;
				}
			}
		} else if (this.anInt5684 * 1084088307 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "(Lclient!alw;)Lclient!vu;", line = 40)
	static Class624 method32154(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(7) int local7 = arg0.g1((short) 16384);
		@Pc(11) int local11 = arg0.g1((short) 16384);
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.g1((short) 16384);
		}
		return new Class624(local3, local7, local14);
	}

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "(Lclient!alw;)Lclient!vu;", line = 40)
	static Class624 method32155(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(7) int local7 = arg0.g1((short) 16384);
		@Pc(11) int local11 = arg0.g1((short) 16384);
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.g1((short) 16384);
		}
		return new Class624(local3, local7, local14);
	}

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "(ILjava/lang/String;III)Z", line = 55)
	public static boolean method32156(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class50.world = new Class28();
		Class50.world.id = arg0 * 470002905;
		Class50.world.host = arg1;
		Class50.world.port1 = arg2 * -1138615973;
		Class50.world.port2 = arg3 * 702279345;
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "(B)V", line = 213)
	static final void method32157(@OriginalArg(0) byte arg0) {
		Class687.anInt5907 -= 1465143003;
	}

	@OriginalMember(owner = "client!vu", name = "jd", descriptor = "(Lclient!yf;B)V", line = 6625)
	static final void method32158(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!vu", name = "jb", descriptor = "(I)V", line = 10150)
	public static void method32159(@OriginalArg(0) int arg0) {
		if (!client.aBoolean625) {
			return;
		}
		@Pc(11) Class312 local11 = Class124_Sub2.method9308(Class148.anInt1394 * -278883695, client.anInt3523 * 1573685689, (byte) 34);
		if (local11 != null && local11.anObjectArray19 != null) {
			@Pc(20) Class93_Sub39 local20 = new Class93_Sub39();
			local20.aClass312_1 = local11;
			local20.anObjectArray4 = local11.anObjectArray19;
			Class211.method25429(local20, 351677968);
		}
		client.anInt3520 = 410366683;
		client.anInt3524 = -1250176741;
		client.aBoolean625 = false;
		if (local11 != null) {
			Class354.method27694(local11, -1174743804);
		}
	}

	@OriginalMember(owner = "client!vu", name = "bdt", descriptor = "(Lclient!yf;B)V", line = 14803)
	static final void method32160(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26280(local13, 1830450514).method26379(local23, -1113809210);
	}
}
