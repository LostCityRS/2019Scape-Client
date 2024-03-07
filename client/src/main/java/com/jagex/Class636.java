package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public class Class636 {

	@OriginalMember(owner = "client!wf", name = "dr", descriptor = "Lclient!es;")
	public static Interface24 anInterface24_10;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!vy;")
	public Class628 aClass628_1;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!vt;")
	public Interface67 anInterface67_1;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	public int anInt5728;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!vt;")
	public Interface67 anInterface67_2;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!vy;")
	public Class628 aClass628_2;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "Lclient!vy;")
	public Class628 aClass628_3;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public int anInt5729;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!vt;")
	public Interface67 anInterface67_3;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!vt;")
	public Interface67 anInterface67_4;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
	public boolean aBoolean854;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!py;)V", line = 21)
	public Class636(@OriginalArg(0) Class497 arg0) {
		@Pc(9) byte[] local9 = arg0.method30079(Class649.aClass649_7.anInt5795 * -51136173, (byte) 90);
		this.method32443(new Packet(local9), (byte) -113);
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(Lclient!alw;B)V", line = 28)
	void method32443(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 3) {
				this.anInterface67_3 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 4) {
				this.anInterface67_2 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 5) {
				this.aClass628_2 = Class448.method28920(arg0, -21899488);
			} else if (local3 == 6) {
				this.aClass628_3 = Class448.method28920(arg0, 459672529);
			} else if (local3 == 7) {
				this.aClass628_1 = Class448.method28920(arg0, -607202125);
			} else if (local3 == 8) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 9) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 10) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 11) {
				this.aBoolean854 = true;
			} else if (local3 == 12) {
				this.anInt5729 = arg0.g4(-118643075) * 317135379;
			} else if (local3 == 13) {
				this.anInt5728 = arg0.g4(-118643075) * 844544901;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "(Lclient!alw;)V", line = 28)
	void method32444(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 3) {
				this.anInterface67_3 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 4) {
				this.anInterface67_2 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 5) {
				this.aClass628_2 = Class448.method28920(arg0, -6366649);
			} else if (local3 == 6) {
				this.aClass628_3 = Class448.method28920(arg0, 1467148010);
			} else if (local3 == 7) {
				this.aClass628_1 = Class448.method28920(arg0, 655383930);
			} else if (local3 == 8) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 9) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 10) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 11) {
				this.aBoolean854 = true;
			} else if (local3 == 12) {
				this.anInt5729 = arg0.g4(-118643075) * 317135379;
			} else if (local3 == 13) {
				this.anInt5728 = arg0.g4(-118643075) * 844544901;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "(Lclient!alw;)V", line = 28)
	void method32445(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 3) {
				this.anInterface67_3 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 4) {
				this.anInterface67_2 = Class118.method8408(arg0, 1750994723);
			} else if (local3 == 5) {
				this.aClass628_2 = Class448.method28920(arg0, 156651478);
			} else if (local3 == 6) {
				this.aClass628_3 = Class448.method28920(arg0, 3173184);
			} else if (local3 == 7) {
				this.aClass628_1 = Class448.method28920(arg0, 1864773096);
			} else if (local3 == 8) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 9) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 10) {
				Class118.method8408(arg0, 1750994723);
			} else if (local3 == 11) {
				this.aBoolean854 = true;
			} else if (local3 == 12) {
				this.anInt5729 = arg0.g4(-118643075) * 317135379;
			} else if (local3 == 13) {
				this.anInt5728 = arg0.g4(-118643075) * 844544901;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "ew", descriptor = "(B)Lclient!aks;", line = 937)
	public static Class93_Sub29 method32446(@OriginalArg(0) byte arg0) {
		if (Class159_Sub1.aClass22_28 == null || Class159_Sub1.aClass20_1 == null) {
			return null;
		}
		Class159_Sub1.aClass20_1.method360(Class159_Sub1.aClass22_28, -1799212345);
		@Pc(14) Class93_Sub29 local14 = (Class93_Sub29) Class159_Sub1.aClass20_1.method366(699749822);
		if (local14 == null) {
			return null;
		} else {
			@Pc(27) Class322 local27 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local14.anInt1603 * 1208139441, 453195580);
			return local27 != null && local27.aBoolean711 && local27.method27252(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface23_2, -1486934819) ? local14 : Class717.method36894(-1720438426);
		}
	}

	@OriginalMember(owner = "client!wf", name = "uc", descriptor = "(Lclient!yf;I)V", line = 8575)
	static final void method32447(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1786901464);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >>> 16];
		@Pc(27) Class312 local27 = Class431.method28780(local22, local16, 1745676068);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local27 == null ? -1 : -1549590237 * local27.anInt3953;
	}

	@OriginalMember(owner = "client!wf", name = "bdr", descriptor = "(Lclient!yf;I)V", line = 14824)
	static final void method32448(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26280(local12, 942276463).method26367((byte) -98);
	}
}
