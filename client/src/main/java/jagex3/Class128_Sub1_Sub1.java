package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqe")
public final class Class128_Sub1_Sub1 extends Class128_Sub1 {

	@OriginalMember(owner = "client!aqe", name = "bc", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!aqe", name = "as", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_56;

	@OriginalMember(owner = "client!aqe", name = "at", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_57;

	@OriginalMember(owner = "client!aqe", name = "ad", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_58;

	@OriginalMember(owner = "client!aqe", name = "au", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_59;

	@OriginalMember(owner = "client!aqe", name = "bq", descriptor = "Lclient!hi;")
	Class116 aClass116_11;

	@OriginalMember(owner = "client!aqe", name = "aj", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_60;

	@OriginalMember(owner = "client!aqe", name = "ab", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_61;

	@OriginalMember(owner = "client!aqe", name = "aa", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_62;

	@OriginalMember(owner = "client!aqe", name = "ak", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_63;

	@OriginalMember(owner = "client!aqe", name = "ap", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_64;

	@OriginalMember(owner = "client!aqe", name = "av", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_65;

	@OriginalMember(owner = "client!aqe", name = "bx", descriptor = "I")
	public int anInt2747;

	@OriginalMember(owner = "client!aqe", name = "bd", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!aqe", name = "ax", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!aqe", name = "bi", descriptor = "I")
	public int anInt2750;

	@OriginalMember(owner = "client!aqe", name = "bk", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_66;

	@OriginalMember(owner = "client!aqe", name = "bf", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_67;

	@OriginalMember(owner = "client!aqe", name = "am", descriptor = "Lclient!pq;")
	public final Class489 aClass489_71 = new Class489();

	@OriginalMember(owner = "client!aqe", name = "ar", descriptor = "Lclient!pq;")
	public final Class489 aClass489_70 = new Class489();

	@OriginalMember(owner = "client!aqe", name = "aq", descriptor = "Lclient!ox;")
	public final Class472 aClass472_56 = new Class472();

	@OriginalMember(owner = "client!aqe", name = "ao", descriptor = "Lclient!og;")
	final Class460 aClass460_13 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "ay", descriptor = "Lclient!og;")
	final Class460 aClass460_14 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "az", descriptor = "Lclient!og;")
	final Class460 aClass460_15 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "af", descriptor = "Lclient!og;")
	public final Class460 aClass460_16 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "an", descriptor = "Lclient!ox;")
	public final Class472 aClass472_57 = new Class472();

	@OriginalMember(owner = "client!aqe", name = "bl", descriptor = "Lclient!og;")
	public final Class460 aClass460_12 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "bh", descriptor = "Lclient!ox;")
	public final Class472 aClass472_58 = new Class472();

	@OriginalMember(owner = "client!aqe", name = "bn", descriptor = "F")
	float aFloat185 = 0.0F;

	@OriginalMember(owner = "client!aqe", name = "aw", descriptor = "Lclient!lp;")
	final Class402 aClass402_3;

	@OriginalMember(owner = "client!aqe", name = "bt", descriptor = "Z")
	boolean aBoolean444;

	@OriginalMember(owner = "client!aqe", name = "ai", descriptor = "Z")
	final boolean aBoolean443;

	@OriginalMember(owner = "client!aqe", name = "ah", descriptor = "(III)V")
	static void method19660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(1, (long) arg0);
		local4.method21813(-1023757134);
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!aqe", name = "<init>", descriptor = "(Lclient!afc;Lclient!lp;Z)V")
	public Class128_Sub1_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) boolean arg2) throws Exception_Sub2 {
		super(arg0);
		new Class489();
		this.aClass402_3 = arg1;
		this.aBoolean444 = arg2;
		if (arg0.method20897() && arg0.method20898()) {
			this.aBoolean443 = this.method21374("EnvMappedWater");
		} else {
			this.aBoolean443 = false;
		}
	}

	@OriginalMember(owner = "client!aqe", name = "aw", descriptor = "()Z")
	@Override
	boolean method21377() throws Exception_Sub2 {
		if (!this.aClass402_3.method28691()) {
			return false;
		}
		this.aClass93_Sub33_Sub1_56 = this.aClass115_10.method8198("NormalSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_57 = this.aClass115_10.method8198("EnvMapSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_58 = this.aClass115_10.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_59 = this.aClass115_10.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_64 = this.aClass115_10.method8198("EyePosAndTime", (byte) 0);
		this.aClass93_Sub33_Sub1_65 = this.aClass115_10.method8198("SunDirectionAndExponent", (byte) 0);
		this.aClass93_Sub33_Sub1_60 = this.aClass115_10.method8198("SunColourAndWaveExponent", (byte) 0);
		this.aClass93_Sub33_Sub1_61 = this.aClass115_10.method8198("WaveIntensityAndBreakWaterDepthAndOffset", (byte) 0);
		this.aClass93_Sub33_Sub1_62 = this.aClass115_10.method8198("HeightFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_63 = this.aClass115_10.method8198("HeightFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_67 = this.aClass115_10.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_66 = this.aClass115_10.method8198("DistanceFogColour", (byte) 0);
		this.aClass116_11 = this.aClass115_10.method8268(this.aBoolean444 ? "EnvMappedSea" : "EnvMappedWater", 1249273355);
		this.aClass115_10.method8203(this.aClass116_11);
		return true;
	}

	@OriginalMember(owner = "client!aqe", name = "a", descriptor = "()Z")
	@Override
	boolean method21375() throws Exception_Sub2 {
		if (!this.aClass402_3.method28691()) {
			return false;
		}
		this.aClass93_Sub33_Sub1_56 = this.aClass115_10.method8198("NormalSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_57 = this.aClass115_10.method8198("EnvMapSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_58 = this.aClass115_10.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_59 = this.aClass115_10.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_64 = this.aClass115_10.method8198("EyePosAndTime", (byte) 0);
		this.aClass93_Sub33_Sub1_65 = this.aClass115_10.method8198("SunDirectionAndExponent", (byte) 0);
		this.aClass93_Sub33_Sub1_60 = this.aClass115_10.method8198("SunColourAndWaveExponent", (byte) 0);
		this.aClass93_Sub33_Sub1_61 = this.aClass115_10.method8198("WaveIntensityAndBreakWaterDepthAndOffset", (byte) 0);
		this.aClass93_Sub33_Sub1_62 = this.aClass115_10.method8198("HeightFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_63 = this.aClass115_10.method8198("HeightFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_67 = this.aClass115_10.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_66 = this.aClass115_10.method8198("DistanceFogColour", (byte) 0);
		this.aClass116_11 = this.aClass115_10.method8268(this.aBoolean444 ? "EnvMappedSea" : "EnvMappedWater", 1249273355);
		this.aClass115_10.method8203(this.aClass116_11);
		return true;
	}

	@OriginalMember(owner = "client!aqe", name = "i", descriptor = "(Lclient!pq;)V")
	@Override
	void method21378(@OriginalArg(0) Class489 arg0) {
		@Pc(3) Class489 local3 = new Class489();
		local3.method30026(this.aFloat185, this.aFloat185, 1.0F, 1.0F);
		local3.method30020(arg0, local3);
		super.method21378(local3);
	}

	@OriginalMember(owner = "client!aqe", name = "bk", descriptor = "(I)V")
	void method19653(@OriginalArg(0) int arg0) {
		this.aFloat185 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass489_70.method30026(this.aFloat185, this.aFloat185, this.aFloat185, this.aFloat185);
		this.aClass460_13.method29375(-this.aClass104_Sub2_31.aFloatArray63[0], -this.aClass104_Sub2_31.aFloatArray63[1], -this.aClass104_Sub2_31.aFloatArray63[2], 32.0F);
		this.aClass460_14.method29375(this.aClass104_Sub2_31.aFloat214, this.aClass104_Sub2_31.aFloat210, this.aClass104_Sub2_31.aFloat217, (float) local12);
		this.aClass460_15.method29375(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!aqe", name = "bf", descriptor = "(I)Z")
	public boolean method19654(@OriginalArg(0) int arg0) {
		return this.aBoolean443;
	}

	@OriginalMember(owner = "client!aqe", name = "bl", descriptor = "(B)V")
	public void method19655(@OriginalArg(0) byte arg0) {
		this.method19653(56073926);
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1, 2140337850);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20934(), 2134065776);
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71, -1409878120);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70, -261542639);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat325, this.aClass472_56.aFloat326, this.aClass472_56.aFloat327, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F, -1583321258);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13, 2119647315);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14, 2061273635);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15, 1988169722);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16, 1973938723);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57, -1557725107);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12, 2138118940);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58, -387086024);
		this.aClass104_Sub2_31.method21019(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "aj", descriptor = "(Z)V")
	@Override
	void method21399(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass104_Sub2_31.aFloatArray63[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass104_Sub2_31.aFloat212;
		this.aClass104_Sub2_31.aFloat212 *= local12;
		super.method21382(arg0);
		this.aClass104_Sub2_31.aFloat212 = local16;
	}

	@OriginalMember(owner = "client!aqe", name = "ai", descriptor = "()Z")
	@Override
	boolean method21388() throws Exception_Sub2 {
		if (!this.aClass402_3.method28691()) {
			return false;
		}
		this.aClass93_Sub33_Sub1_56 = this.aClass115_10.method8198("NormalSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_57 = this.aClass115_10.method8198("EnvMapSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_58 = this.aClass115_10.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_59 = this.aClass115_10.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_64 = this.aClass115_10.method8198("EyePosAndTime", (byte) 0);
		this.aClass93_Sub33_Sub1_65 = this.aClass115_10.method8198("SunDirectionAndExponent", (byte) 0);
		this.aClass93_Sub33_Sub1_60 = this.aClass115_10.method8198("SunColourAndWaveExponent", (byte) 0);
		this.aClass93_Sub33_Sub1_61 = this.aClass115_10.method8198("WaveIntensityAndBreakWaterDepthAndOffset", (byte) 0);
		this.aClass93_Sub33_Sub1_62 = this.aClass115_10.method8198("HeightFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_63 = this.aClass115_10.method8198("HeightFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_67 = this.aClass115_10.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_66 = this.aClass115_10.method8198("DistanceFogColour", (byte) 0);
		this.aClass116_11 = this.aClass115_10.method8268(this.aBoolean444 ? "EnvMappedSea" : "EnvMappedWater", 1249273355);
		this.aClass115_10.method8203(this.aClass116_11);
		return true;
	}

	@OriginalMember(owner = "client!aqe", name = "am", descriptor = "(Lclient!pq;)V")
	@Override
	void method21391(@OriginalArg(0) Class489 arg0) {
		@Pc(3) Class489 local3 = new Class489();
		local3.method30026(this.aFloat185, this.aFloat185, 1.0F, 1.0F);
		local3.method30020(arg0, local3);
		super.method21378(local3);
	}

	@OriginalMember(owner = "client!aqe", name = "ad", descriptor = "(Lclient!pq;)V")
	@Override
	void method21376(@OriginalArg(0) Class489 arg0) {
		@Pc(3) Class489 local3 = new Class489();
		local3.method30026(this.aFloat185, this.aFloat185, 1.0F, 1.0F);
		local3.method30020(arg0, local3);
		super.method21378(local3);
	}

	@OriginalMember(owner = "client!aqe", name = "bx", descriptor = "()V")
	public void method19656() {
		this.method19653(-1749694845);
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1, 2138637976);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20934(), 2123084179);
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71, -559230707);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70, -287137981);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat325, this.aClass472_56.aFloat326, this.aClass472_56.aFloat327, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F, -1144891526);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13, 1981042806);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14, 2013692688);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15, 2103896830);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16, 2012063691);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57, 1009610681);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12, 2002058705);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58, -1546953864);
		this.aClass104_Sub2_31.method21019(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "ao", descriptor = "(Z)V")
	@Override
	void method21398(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass104_Sub2_31.aFloatArray63[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass104_Sub2_31.aFloat212;
		this.aClass104_Sub2_31.aFloat212 *= local12;
		super.method21382(arg0);
		this.aClass104_Sub2_31.aFloat212 = local16;
	}

	@OriginalMember(owner = "client!aqe", name = "ag", descriptor = "(Z)V")
	@Override
	void method21382(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass104_Sub2_31.aFloatArray63[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass104_Sub2_31.aFloat212;
		this.aClass104_Sub2_31.aFloat212 *= local12;
		super.method21382(arg0);
		this.aClass104_Sub2_31.aFloat212 = local16;
	}

	@OriginalMember(owner = "client!aqe", name = "bh", descriptor = "()Z")
	public boolean method19657() {
		return this.aBoolean443;
	}

	@OriginalMember(owner = "client!aqe", name = "bd", descriptor = "()V")
	public void method19658() {
		this.method19653(-1592258029);
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1, 2127152340);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20934(), 2117440573);
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71, -1844175039);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70, 873513443);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat325, this.aClass472_56.aFloat326, this.aClass472_56.aFloat327, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F, -1967183866);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13, 2120114248);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14, 2048807461);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15, 2104704932);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16, 2026979998);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57, 564804529);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12, 2141618095);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58, -520300879);
		this.aClass104_Sub2_31.method21019(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "bc", descriptor = "()V")
	public void method19659() {
		this.method19653(118345059);
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1, 2132534934);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20934(), 2110635699);
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71, -1257771990);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70, 1304096548);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat325, this.aClass472_56.aFloat326, this.aClass472_56.aFloat327, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F, -175059270);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13, 2122285424);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14, 2099116466);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15, 2113505897);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16, 2007136677);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57, -1664566666);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12, 1968951593);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58, -1589420975);
		this.aClass104_Sub2_31.method21019(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}
}
