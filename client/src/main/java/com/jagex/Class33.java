package com.jagex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abg")
public final class Class33 implements Interface4 {

	@OriginalMember(owner = "client!abg", name = "t", descriptor = "Ljava/util/Map;")
	Map aMap1;

	@OriginalMember(owner = "client!abg", name = "f", descriptor = "Lclient!ox;")
	final Interface53 anInterface53_1;

	@OriginalMember(owner = "client!abg", name = "u", descriptor = "(IIII)V")
	public static void method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class130_Sub1.method10205(new Class58_Sub1(arg0, arg1, arg2, client.anInt3583 * 292509161, Class108_Sub2.aClass139_8.anInt1250 * -1981136693, Class108_Sub2.aClass139_8.anInt1251 * 861114341, Class108_Sub2.aClass139_8.method10788((short) -2892), Class108_Sub2.aClass139_8.method10764((byte) 119), Class504.aClass495_3.method30298(527183928)), (byte) -105);
	}

	@OriginalMember(owner = "client!abg", name = "ih", descriptor = "(B)V")
	static void method740(@OriginalArg(0) byte arg0) {
		Class411.method28964(Class279.aClass102_9, (long) client.anInt3436);
		if (client.anInt3460 * 1849344509 != -1) {
			Class489.method30219(client.anInt3460 * 1849344509, 108158930);
		}
		@Pc(15) int local15;
		for (local15 = 0; local15 < client.anInt3530 * 14557067; local15++) {
			client.aBooleanArray20[local15] = client.aBooleanArray19[local15];
			client.aBooleanArray19[local15] = false;
		}
		client.anInt3560 = client.anInt3436 * -1141210301;
		if (client.anInt3460 * 1849344509 != -1) {
			client.anInt3530 = 0;
			Class294.method26966((byte) -24);
		}
		Class279.aClass102_9.method20877();
		Class350.method28014(Class279.aClass102_9, 1057181892);
		local15 = Class570.method31724((byte) -21);
		if (local15 == -1) {
			local15 = client.anInt3502 * -1621806571;
		}
		if (local15 == -1) {
			local15 = client.anInt3521 * -1968123903;
		}
		Class289.method26925(local15, (byte) 0);
		client.anInt3516 = 0;
	}

	@OriginalMember(owner = "client!abg", name = "x", descriptor = "(B)Ljava/lang/String;")
	public static String method741(@OriginalArg(0) byte arg0) {
		return Class2_Sub1.aString13;
	}

	@OriginalMember(owner = "client!abg", name = "<init>", descriptor = "(Lclient!ox;)V")
	public Class33(@OriginalArg(0) Interface53 arg0) {
		this.anInterface53_1 = arg0;
	}

	@OriginalMember(owner = "client!abg", name = "f", descriptor = "(III)V")
	@Override
	public void method730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class460(arg0, arg1));
			return;
		}
		@Pc(28) Class460 local28 = (Class460) this.aMap1.get(arg0);
		if (local28 == null) {
			this.aMap1.put(arg0, new Class460(arg0, arg1));
		} else {
			local28.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abg", name = "d", descriptor = "()V")
	@Override
	public void method732() {
		if (this.aMap1 != null) {
			this.aMap1.clear();
		}
	}

	@OriginalMember(owner = "client!abg", name = "x", descriptor = "(II)V")
	@Override
	public void method723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class460(arg0, arg1));
			return;
		}
		@Pc(28) Class460 local28 = (Class460) this.aMap1.get(arg0);
		if (local28 == null) {
			this.aMap1.put(arg0, new Class460(arg0, arg1));
		} else {
			local28.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abg", name = "e", descriptor = "(IB)J")
	@Override
	public long method716(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface53_1.method1817(arg0, -1864761190);
	}

	@OriginalMember(owner = "client!abg", name = "u", descriptor = "(IJ)V")
	@Override
	public void method717(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class460(arg0, arg1));
			return;
		}
		@Pc(27) Class460 local27 = (Class460) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class460(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abg", name = "l", descriptor = "(IB)Ljava/lang/Object;")
	@Override
	public Object method718(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface53_1.method1817(arg0, 2118335175);
	}

	@OriginalMember(owner = "client!abg", name = "g", descriptor = "(ILjava/lang/Object;I)V")
	@Override
	public void method719(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class460(arg0, arg1));
			return;
		}
		@Pc(27) Class460 local27 = (Class460) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class460(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abg", name = "n", descriptor = "(I)J")
	@Override
	public long method734(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface53_1.method1817(arg0, 696313859);
	}

	@OriginalMember(owner = "client!abg", name = "m", descriptor = "(II)V")
	@Override
	public void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abg", name = "q", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method715(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface53_1.method1817(arg0, 589941176);
	}

	@OriginalMember(owner = "client!abg", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method736() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!abg", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method737() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!abg", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method738() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!abg", name = "t", descriptor = "(IB)I")
	@Override
	public int method722(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1817(arg0, 1615811685);
	}

	@OriginalMember(owner = "client!abg", name = "k", descriptor = "(I)I")
	@Override
	public int method714(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1817(arg0, -35153165);
	}

	@OriginalMember(owner = "client!abg", name = "w", descriptor = "(IJ)V")
	@Override
	public void method725(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class460(arg0, arg1));
			return;
		}
		@Pc(27) Class460 local27 = (Class460) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class460(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abg", name = "z", descriptor = "(I)V")
	@Override
	public void method727(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abg", name = "i", descriptor = "(B)V")
	@Override
	public void method720(@OriginalArg(0) byte arg0) {
		if (this.aMap1 != null) {
			this.aMap1.clear();
		}
	}

	@OriginalMember(owner = "client!abg", name = "r", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method726(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface53_1.method1817(arg0, -1042124050);
	}

	@OriginalMember(owner = "client!abg", name = "s", descriptor = "(I)I")
	@Override
	public int method729(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1817(arg0, 1104599551);
	}

	@OriginalMember(owner = "client!abg", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!abg", name = "p", descriptor = "(I)V")
	@Override
	public void method731(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abg", name = "v", descriptor = "(I)V")
	@Override
	public void method724(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abg", name = "y", descriptor = "(I)J")
	@Override
	public long method733(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface53_1.method1817(arg0, 1785899098);
	}

	@OriginalMember(owner = "client!abg", name = "h", descriptor = "(ILjava/lang/Object;)V")
	@Override
	public void method728(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class460(arg0, arg1));
			return;
		}
		@Pc(27) Class460 local27 = (Class460) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class460(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abg", name = "c", descriptor = "(I)J")
	@Override
	public long method735(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class460 local9 = (Class460) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface53_1.method1817(arg0, 1834692891);
	}
}
