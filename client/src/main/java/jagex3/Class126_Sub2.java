package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahr")
public final class Class126_Sub2 extends Class126 {

	@OriginalMember(owner = "client!ahr", name = "o", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_18;

	@OriginalMember(owner = "client!ahr", name = "c", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_19;

	@OriginalMember(owner = "client!ahr", name = "u", descriptor = "Lclient!ho;")
	Class115 aClass115_3;

	@OriginalMember(owner = "client!ahr", name = "d", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_20;

	@OriginalMember(owner = "client!ahr", name = "r", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_21;

	@OriginalMember(owner = "client!ahr", name = "v", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_22;

	@OriginalMember(owner = "client!ahr", name = "x", descriptor = "Lclient!hi;")
	Class116 aClass116_2;

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_23;

	@OriginalMember(owner = "client!ahr", name = "z", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_24;

	@OriginalMember(owner = "client!ahr", name = "q", descriptor = "Lclient!hi;")
	Class116 aClass116_3;

	@OriginalMember(owner = "client!ahr", name = "y", descriptor = "Lclient!hi;")
	Class116 aClass116_4;

	@OriginalMember(owner = "client!ahr", name = "p", descriptor = "Lclient!pq;")
	final Class489 aClass489_38 = new Class489();

	@OriginalMember(owner = "client!ahr", name = "lm", descriptor = "(Ljava/lang/String;I)V")
	public static void method10049(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class93_Sub1_Sub2.aClass170Array1 == null) {
			return;
		}
		@Pc(5) Class175 local5 = Class330.method27465(-1569486854);
		@Pc(11) Class93_Sub22 local11 = Class102.method2592(Class446.aClass446_34, local5.aClass24_2, (byte) 107);
		local11.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -1727046151), (byte) -93);
		local11.aClass93_Sub41_Sub2_1.method22414(arg0, -1517906929);
		local5.method24363(local11, -1632891367);
	}

	@OriginalMember(owner = "client!ahr", name = "w", descriptor = "(Lclient!dn;[F[FI)V")
	static void method10050(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "(II)V")
	static void method10051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (-1 != arg0 && !Class9.aBooleanArray1[arg0]) {
			Class589.aClass497_132.method30245(arg0, 10576364);
			Class166_Sub1.aClass320Array1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "<init>", descriptor = "(Lclient!afc;)V")
	public Class126_Sub2(@OriginalArg(0) Class104_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method10041((byte) 104);
	}

	@OriginalMember(owner = "client!ahr", name = "d", descriptor = "(ZZB)V")
	void method10040(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13, 2116646691);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38, -1291718363);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37, 347334485);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118, (byte) 1);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat301, this.aClass460_7.aFloat300, this.aClass460_7.aFloat299, this.aClass460_7.aFloat302, 1891475941);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F), (byte) -86);
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat325, this.aClass472_37.aFloat326, this.aClass472_37.aFloat327, -1492527849);
	}

	@OriginalMember(owner = "client!ahr", name = "p", descriptor = "(B)Z")
	boolean method10041(@OriginalArg(0) byte arg0) throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20904("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount", (byte) 0);
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour", (byte) 0);
		this.aClass116_4 = this.aClass115_3.method8268("NoFog", 1249273355);
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog", 1249273355);
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog", 1249273355);
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "e", descriptor = "(Lclient!pq;)V")
	@Override
	public void method10032(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method30018(arg0);
		this.aClass489_38.method30134(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "n", descriptor = "(IZ)V")
	@Override
	public void method10033(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8203(arg1 ? this.aClass116_3 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg1, true, (byte) 12);
		this.aClass104_Sub2_15.method21019(Class424.aClass424_3, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahr", name = "c", descriptor = "()Z")
	boolean method10042() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20904("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount", (byte) 0);
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour", (byte) 0);
		this.aClass116_4 = this.aClass115_3.method8268("NoFog", 1249273355);
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog", 1249273355);
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog", 1249273355);
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "(IZ)V")
	@Override
	public void method10037(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8203(arg1 ? this.aClass116_3 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg1, true, (byte) -45);
		this.aClass104_Sub2_15.method21019(Class424.aClass424_3, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahr", name = "k", descriptor = "(Lclient!pq;)V")
	@Override
	public void method10036(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method30018(arg0);
		this.aClass489_38.method30134(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "f", descriptor = "(Lclient!pq;)V")
	@Override
	public void method10035(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method30018(arg0);
		this.aClass489_38.method30134(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "w", descriptor = "(Lclient!pq;)V")
	@Override
	public void method10039(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method30018(arg0);
		this.aClass489_38.method30134(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "m", descriptor = "(Z)V")
	@Override
	public void method10034(@OriginalArg(0) boolean arg0) {
		this.aClass115_3.method8203(arg0 ? this.aClass116_2 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg0, false, (byte) -31);
		this.aClass104_Sub2_15.method21015();
	}

	@OriginalMember(owner = "client!ahr", name = "u", descriptor = "(Z)V")
	@Override
	public void method10038(@OriginalArg(0) boolean arg0) {
		this.aClass115_3.method8203(arg0 ? this.aClass116_2 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg0, false, (byte) 22);
		this.aClass104_Sub2_15.method21015();
	}

	@OriginalMember(owner = "client!ahr", name = "z", descriptor = "(Z)V")
	@Override
	public void method10031(@OriginalArg(0) boolean arg0) {
		this.aClass115_3.method8203(arg0 ? this.aClass116_2 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg0, false, (byte) 32);
		this.aClass104_Sub2_15.method21015();
	}

	@OriginalMember(owner = "client!ahr", name = "v", descriptor = "()Z")
	boolean method10043() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20904("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount", (byte) 0);
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour", (byte) 0);
		this.aClass116_4 = this.aClass115_3.method8268("NoFog", 1249273355);
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog", 1249273355);
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog", 1249273355);
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "r", descriptor = "()Z")
	boolean method10044() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20904("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler", (byte) 0);
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour", (byte) 0);
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount", (byte) 0);
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour", (byte) 0);
		this.aClass116_4 = this.aClass115_3.method8268("NoFog", 1249273355);
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog", 1249273355);
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog", 1249273355);
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "y", descriptor = "(ZZ)V")
	void method10045(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13, 2113679798);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38, -923654827);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37, 55039810);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118, (byte) 1);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat301, this.aClass460_7.aFloat300, this.aClass460_7.aFloat299, this.aClass460_7.aFloat302, 1155712834);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F), (byte) -73);
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat325, this.aClass472_37.aFloat326, this.aClass472_37.aFloat327, 723167992);
	}

	@OriginalMember(owner = "client!ahr", name = "o", descriptor = "(ZZ)V")
	void method10046(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13, 2136625390);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38, -632591444);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37, -262744406);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118, (byte) 1);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat301, this.aClass460_7.aFloat300, this.aClass460_7.aFloat299, this.aClass460_7.aFloat302, 1534554383);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F), (byte) -42);
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat325, this.aClass472_37.aFloat326, this.aClass472_37.aFloat327, 1211981701);
	}

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "(ZZ)V")
	void method10047(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13, 2115916371);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38, -785458695);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37, 650141737);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118, (byte) 1);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat301, this.aClass460_7.aFloat300, this.aClass460_7.aFloat299, this.aClass460_7.aFloat302, 677112254);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F), (byte) -51);
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat325, this.aClass472_37.aFloat326, this.aClass472_37.aFloat327, 2111896077);
	}

	@OriginalMember(owner = "client!ahr", name = "q", descriptor = "(ZZ)V")
	void method10048(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13, 2139879614);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38, -986043346);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37, 1012851644);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118, (byte) 1);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat301, this.aClass460_7.aFloat300, this.aClass460_7.aFloat299, this.aClass460_7.aFloat302, 120310903);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F), (byte) -23);
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat325, this.aClass472_37.aFloat326, this.aClass472_37.aFloat327, 1859299356);
	}
}
