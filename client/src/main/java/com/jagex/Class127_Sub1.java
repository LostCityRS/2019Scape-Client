package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahj")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!ahj", name = "k", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_2;

	@OriginalMember(owner = "client!ahj", name = "o", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_3;

	@OriginalMember(owner = "client!ahj", name = "x", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_4;

	@OriginalMember(owner = "client!ahj", name = "a", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_5;

	@OriginalMember(owner = "client!ahj", name = "s", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_6;

	@OriginalMember(owner = "client!ahj", name = "r", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_7;

	@OriginalMember(owner = "client!ahj", name = "w", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_8;

	@OriginalMember(owner = "client!ahj", name = "q", descriptor = "Lclient!ht;")
	Class114 aClass114_2;

	@OriginalMember(owner = "client!ahj", name = "m", descriptor = "Lclient!hb;")
	Class113 aClass113_3;

	@OriginalMember(owner = "client!ahj", name = "h", descriptor = "Lclient!ht;")
	Class114 aClass114_3;

	@OriginalMember(owner = "client!ahj", name = "d", descriptor = "Lclient!ht;")
	Class114 aClass114_4;

	@OriginalMember(owner = "client!ahj", name = "j", descriptor = "Lclient!pm;")
	final Class487 aClass487_45 = new Class487();

	@OriginalMember(owner = "client!ahj", name = "wt", descriptor = "(Lclient!yp;I)V")
	static void method9903(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class667.method33473(local13, local23, false, 811408569);
	}

	@OriginalMember(owner = "client!ahj", name = "beq", descriptor = "(Lclient!yp;B)V")
	static void method9904(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!ahj", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class127_Sub1(@OriginalArg(0) Class102_Sub1 arg0) throws Exception_Sub5 {
		super(arg0);
		this.method9897((byte) -84);
	}

	@OriginalMember(owner = "client!ahj", name = "h", descriptor = "(ZZ)V")
	void method9896(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8280(this.aClass80_Sub13_Sub1_3, 0, this.anInterface34_17, (short) 28408);
		this.aClass113_3.method8268(this.aClass80_Sub13_Sub1_5, this.aClass487_45, -871388298);
		this.aClass113_3.method8261(this.aClass80_Sub13_Sub1_6, this.aClass487_46, -1089418545);
		this.aClass113_3.method8277(this.aClass80_Sub13_Sub1_7, this.anInt1166, 65280);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass113_3.method8273(this.aClass80_Sub13_Sub1_2, this.aClass456_9.aFloat294, this.aClass456_9.aFloat292, this.aClass456_9.aFloat291, this.aClass456_9.aFloat293, -400567950);
		} else {
			this.aClass113_3.method8270(this.aClass80_Sub13_Sub1_8, Math.min(Math.max(this.aFloat120, 0.0F), 1.0F), -182557703);
		}
		this.aClass113_3.method8272(this.aClass80_Sub13_Sub1_4, this.aClass463_44.aFloat297, this.aClass463_44.aFloat295, this.aClass463_44.aFloat296, -1966947199);
	}

	@OriginalMember(owner = "client!ahj", name = "s", descriptor = "(B)Z")
	boolean method9897(@OriginalArg(0) byte arg0) throws Exception_Sub5 {
		this.aClass113_3 = this.aClass102_Sub1_15.method21142("Particle");
		this.aClass80_Sub13_Sub1_5 = this.aClass113_3.method8302("WVPMatrix", 2102306891);
		this.aClass80_Sub13_Sub1_3 = this.aClass113_3.method8302("DiffuseSampler", 1941995868);
		this.aClass80_Sub13_Sub1_6 = this.aClass113_3.method8302("TexCoordMatrix", 2078507382);
		this.aClass80_Sub13_Sub1_2 = this.aClass113_3.method8302("DistanceFogPlane", 1993873356);
		this.aClass80_Sub13_Sub1_4 = this.aClass113_3.method8302("DistanceFogColour", 2146540606);
		this.aClass80_Sub13_Sub1_8 = this.aClass113_3.method8302("DistanceFogAmount", 2054553844);
		this.aClass80_Sub13_Sub1_7 = this.aClass113_3.method8302("DiffuseColour", 2028812163);
		this.aClass114_2 = this.aClass113_3.method8377("NoFog", (byte) -57);
		this.aClass114_3 = this.aClass113_3.method8377("ParticleFog", (byte) 75);
		this.aClass114_4 = this.aClass113_3.method8377("BillboardFog", (byte) 24);
		if (!this.aClass114_2.method8577()) {
			return false;
		} else if (this.aClass114_3.method8577()) {
			return this.aClass114_4.method8577();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahj", name = "t", descriptor = "(Lclient!pm;)V")
	@Override
	public void method10144(@OriginalArg(0) Class487 arg0) {
		this.aClass487_45.method30075(arg0);
		this.aClass487_45.method30078(this.aClass102_Sub1_15.aClass487_78);
	}

	@OriginalMember(owner = "client!ahj", name = "f", descriptor = "(IZ)V")
	@Override
	public void method10145(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8295(arg1 ? this.aClass114_3 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg1, true, (byte) 6);
		this.aClass102_Sub1_15.method21373(Class415.aClass415_6, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahj", name = "w", descriptor = "()Z")
	boolean method9898() throws Exception_Sub5 {
		this.aClass113_3 = this.aClass102_Sub1_15.method21142("Particle");
		this.aClass80_Sub13_Sub1_5 = this.aClass113_3.method8302("WVPMatrix", 2008029569);
		this.aClass80_Sub13_Sub1_3 = this.aClass113_3.method8302("DiffuseSampler", 2056580587);
		this.aClass80_Sub13_Sub1_6 = this.aClass113_3.method8302("TexCoordMatrix", 2096414007);
		this.aClass80_Sub13_Sub1_2 = this.aClass113_3.method8302("DistanceFogPlane", 1986640656);
		this.aClass80_Sub13_Sub1_4 = this.aClass113_3.method8302("DistanceFogColour", 2141376681);
		this.aClass80_Sub13_Sub1_8 = this.aClass113_3.method8302("DistanceFogAmount", 2029910805);
		this.aClass80_Sub13_Sub1_7 = this.aClass113_3.method8302("DiffuseColour", 1970821894);
		this.aClass114_2 = this.aClass113_3.method8377("NoFog", (byte) -71);
		this.aClass114_3 = this.aClass113_3.method8377("ParticleFog", (byte) -23);
		this.aClass114_4 = this.aClass113_3.method8377("BillboardFog", (byte) -74);
		if (!this.aClass114_2.method8577()) {
			return false;
		} else if (this.aClass114_3.method8577()) {
			return this.aClass114_4.method8577();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahj", name = "k", descriptor = "(ZZB)V")
	void method9899(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		this.aClass113_3.method8280(this.aClass80_Sub13_Sub1_3, 0, this.anInterface34_17, (short) 13295);
		this.aClass113_3.method8268(this.aClass80_Sub13_Sub1_5, this.aClass487_45, -871388298);
		this.aClass113_3.method8261(this.aClass80_Sub13_Sub1_6, this.aClass487_46, -1169058793);
		this.aClass113_3.method8277(this.aClass80_Sub13_Sub1_7, this.anInt1166, 65280);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass113_3.method8273(this.aClass80_Sub13_Sub1_2, this.aClass456_9.aFloat294, this.aClass456_9.aFloat292, this.aClass456_9.aFloat291, this.aClass456_9.aFloat293, 152144877);
		} else {
			this.aClass113_3.method8270(this.aClass80_Sub13_Sub1_8, Math.min(Math.max(this.aFloat120, 0.0F), 1.0F), -1652307718);
		}
		this.aClass113_3.method8272(this.aClass80_Sub13_Sub1_4, this.aClass463_44.aFloat297, this.aClass463_44.aFloat295, this.aClass463_44.aFloat296, -1198477740);
	}

	@OriginalMember(owner = "client!ahj", name = "u", descriptor = "(IZ)V")
	@Override
	public void method10153(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8295(arg1 ? this.aClass114_3 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg1, true, (byte) 6);
		this.aClass102_Sub1_15.method21373(Class415.aClass415_6, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahj", name = "l", descriptor = "(IZ)V")
	@Override
	public void method10147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8295(arg1 ? this.aClass114_3 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg1, true, (byte) 6);
		this.aClass102_Sub1_15.method21373(Class415.aClass415_6, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahj", name = "g", descriptor = "(IZ)V")
	@Override
	public void method10148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8295(arg1 ? this.aClass114_3 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg1, true, (byte) 6);
		this.aClass102_Sub1_15.method21373(Class415.aClass415_6, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahj", name = "i", descriptor = "(Z)V")
	@Override
	public void method10149(@OriginalArg(0) boolean arg0) {
		this.aClass113_3.method8295(arg0 ? this.aClass114_4 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg0, false, (byte) 6);
		this.aClass102_Sub1_15.method21255();
	}

	@OriginalMember(owner = "client!ahj", name = "e", descriptor = "(Z)V")
	@Override
	public void method10152(@OriginalArg(0) boolean arg0) {
		this.aClass113_3.method8295(arg0 ? this.aClass114_4 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg0, false, (byte) 6);
		this.aClass102_Sub1_15.method21255();
	}

	@OriginalMember(owner = "client!ahj", name = "o", descriptor = "(Lclient!pm;)V")
	@Override
	public void method10143(@OriginalArg(0) Class487 arg0) {
		this.aClass487_45.method30075(arg0);
		this.aClass487_45.method30078(this.aClass102_Sub1_15.aClass487_78);
	}

	@OriginalMember(owner = "client!ahj", name = "r", descriptor = "(ZZ)V")
	void method9900(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8280(this.aClass80_Sub13_Sub1_3, 0, this.anInterface34_17, (short) 22771);
		this.aClass113_3.method8268(this.aClass80_Sub13_Sub1_5, this.aClass487_45, -871388298);
		this.aClass113_3.method8261(this.aClass80_Sub13_Sub1_6, this.aClass487_46, -2132807544);
		this.aClass113_3.method8277(this.aClass80_Sub13_Sub1_7, this.anInt1166, 65280);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass113_3.method8273(this.aClass80_Sub13_Sub1_2, this.aClass456_9.aFloat294, this.aClass456_9.aFloat292, this.aClass456_9.aFloat291, this.aClass456_9.aFloat293, 2032034581);
		} else {
			this.aClass113_3.method8270(this.aClass80_Sub13_Sub1_8, Math.min(Math.max(this.aFloat120, 0.0F), 1.0F), 145665078);
		}
		this.aClass113_3.method8272(this.aClass80_Sub13_Sub1_4, this.aClass463_44.aFloat297, this.aClass463_44.aFloat295, this.aClass463_44.aFloat296, -180731903);
	}

	@OriginalMember(owner = "client!ahj", name = "a", descriptor = "(Lclient!pm;)V")
	@Override
	public void method10151(@OriginalArg(0) Class487 arg0) {
		this.aClass487_45.method30075(arg0);
		this.aClass487_45.method30078(this.aClass102_Sub1_15.aClass487_78);
	}

	@OriginalMember(owner = "client!ahj", name = "x", descriptor = "()Z")
	boolean method9901() throws Exception_Sub5 {
		this.aClass113_3 = this.aClass102_Sub1_15.method21142("Particle");
		this.aClass80_Sub13_Sub1_5 = this.aClass113_3.method8302("WVPMatrix", 2073446460);
		this.aClass80_Sub13_Sub1_3 = this.aClass113_3.method8302("DiffuseSampler", 1949862896);
		this.aClass80_Sub13_Sub1_6 = this.aClass113_3.method8302("TexCoordMatrix", 2106344511);
		this.aClass80_Sub13_Sub1_2 = this.aClass113_3.method8302("DistanceFogPlane", 1982418744);
		this.aClass80_Sub13_Sub1_4 = this.aClass113_3.method8302("DistanceFogColour", 2097737933);
		this.aClass80_Sub13_Sub1_8 = this.aClass113_3.method8302("DistanceFogAmount", 2078310459);
		this.aClass80_Sub13_Sub1_7 = this.aClass113_3.method8302("DiffuseColour", 2119521623);
		this.aClass114_2 = this.aClass113_3.method8377("NoFog", (byte) -24);
		this.aClass114_3 = this.aClass113_3.method8377("ParticleFog", (byte) 18);
		this.aClass114_4 = this.aClass113_3.method8377("BillboardFog", (byte) 69);
		if (!this.aClass114_2.method8577()) {
			return false;
		} else if (this.aClass114_3.method8577()) {
			return this.aClass114_4.method8577();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahj", name = "m", descriptor = "(Z)V")
	@Override
	public void method10150(@OriginalArg(0) boolean arg0) {
		this.aClass113_3.method8295(arg0 ? this.aClass114_4 : this.aClass114_2);
		this.aClass113_3.method8256();
		this.method9899(arg0, false, (byte) 6);
		this.aClass102_Sub1_15.method21255();
	}

	@OriginalMember(owner = "client!ahj", name = "q", descriptor = "(ZZ)V")
	void method9902(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass113_3.method8280(this.aClass80_Sub13_Sub1_3, 0, this.anInterface34_17, (short) 17372);
		this.aClass113_3.method8268(this.aClass80_Sub13_Sub1_5, this.aClass487_45, -871388298);
		this.aClass113_3.method8261(this.aClass80_Sub13_Sub1_6, this.aClass487_46, -894965989);
		this.aClass113_3.method8277(this.aClass80_Sub13_Sub1_7, this.anInt1166, 65280);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass113_3.method8273(this.aClass80_Sub13_Sub1_2, this.aClass456_9.aFloat294, this.aClass456_9.aFloat292, this.aClass456_9.aFloat291, this.aClass456_9.aFloat293, 1618828953);
		} else {
			this.aClass113_3.method8270(this.aClass80_Sub13_Sub1_8, Math.min(Math.max(this.aFloat120, 0.0F), 1.0F), 288825152);
		}
		this.aClass113_3.method8272(this.aClass80_Sub13_Sub1_4, this.aClass463_44.aFloat297, this.aClass463_44.aFloat295, this.aClass463_44.aFloat296, -591318057);
	}

	@OriginalMember(owner = "client!ahj", name = "j", descriptor = "(Lclient!pm;)V")
	@Override
	public void method10146(@OriginalArg(0) Class487 arg0) {
		this.aClass487_45.method30075(arg0);
		this.aClass487_45.method30078(this.aClass102_Sub1_15.aClass487_78);
	}
}
