package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

@OriginalClass("client!abz")
public final class Class50 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!abz", name = "u", descriptor = "I")
	int anInt188;

	@OriginalMember(owner = "client!abz", name = "f", descriptor = "Lclient!qy;")
	public Class521 aClass521_1;

	@OriginalMember(owner = "client!abz", name = "t", descriptor = "Lclient!qy;")
	public Class521 aClass521_2;

	@OriginalMember(owner = "client!abz", name = "l", descriptor = "Ljava/util/Map;")
	Map aMap2;

	@OriginalMember(owner = "client!abz", name = "g", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray1;

	@OriginalMember(owner = "client!abz", name = "m", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap1;

	@OriginalMember(owner = "client!abz", name = "e", descriptor = "Ljava/lang/String;")
	String aString9 = "null";

	@OriginalMember(owner = "client!abz", name = "i", descriptor = "I")
	int anInt189 = 0;

	@OriginalMember(owner = "client!abz", name = "gw", descriptor = "(I)V")
	public static void method1038(@OriginalArg(0) int arg0) {
		if (Class411.aFrame2 != null) {
			return;
		}
		@Pc(6) int local6 = client.anInt3415 * 317681859;
		@Pc(10) int local10 = client.anInt3417 * -1044003729;
		@Pc(20) int local20 = Class334.anInt4196 * -455826321 - Class80_Sub1_Sub1.anInt254 * -255202897 - local6;
		@Pc(30) int local30 = Class286.anInt3942 * -1411780839 - Class80_Sub25.anInt1627 * 167687103 - local10;
		if (local6 <= 0 && local20 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41 = Class60.method1187(796005397);
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			if (Class244.aFrame1 == local41) {
				@Pc(51) Insets local51 = Class244.aFrame1.getInsets();
				local43 = local51.left;
				local45 = local51.top;
			}
			@Pc(60) Graphics local60 = local41.getGraphics();
			local60.setColor(Color.black);
			if (local6 > 0) {
				local60.fillRect(local43, local45, local6, Class286.anInt3942 * -1411780839);
			}
			if (local10 > 0) {
				local60.fillRect(local43, local45, Class334.anInt4196 * -455826321, local10);
			}
			if (local20 > 0) {
				local60.fillRect(local43 + Class334.anInt4196 * -455826321 - local20, local45, local20, Class286.anInt3942 * -1411780839);
			}
			if (local30 > 0) {
				local60.fillRect(local43, Class286.anInt3942 * -1411780839 + local45 - local30, Class334.anInt4196 * -455826321, local30);
			}
		} catch (@Pc(117) Exception local117) {
		}
	}

	@OriginalMember(owner = "client!abz", name = "t", descriptor = "(I)I")
	static int method1039(@OriginalArg(0) int arg0) {
		return (Class329.anInt4183 += -1221804427) * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!abz", name = "ok", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method1040(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1701769524) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray8 = Class431.method29089(local13, arg2, 893218024);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!abz", name = "<init>", descriptor = "()V")
	Class50() {
	}

	@OriginalMember(owner = "client!abz", name = "d", descriptor = "(Lclient!ald;I)V")
	void method1013(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_2 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 2) {
			local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_1 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 3) {
			this.aString9 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.anInt188 = arg0.g4() * 147862363;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt189 = arg0.g2() * -861961745;
				this.aMap2 = new HashMap(this.anInt189 * 1360383247);
				for (local73 = 0; local73 < this.anInt189 * 1360383247; local73++) {
					local83 = arg0.g4();
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.gjstr();
					} else {
						local90 = Integer.valueOf(arg0.g4());
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.g2();
				this.anInt189 = arg0.g2() * -861961745;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt189 * 1360383247; local83++) {
					@Pc(143) int local143 = arg0.g2();
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.gjstr();
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.g4());
					}
				}
			} else if (arg1 == 101) {
				this.aClass521_2 = (Class521) Class80_Sub39.method15030(Class521.method30628(1333296275), arg0.gSmart1or2(), -958640959);
			} else if (arg1 == 102) {
				this.aClass521_1 = (Class521) Class80_Sub39.method15030(Class521.method30628(1571051127), arg0.gSmart1or2(), -1051961921);
			}
		}
	}

	@OriginalMember(owner = "client!abz", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1028(arg0, local3, 1487496790);
		}
	}

	@OriginalMember(owner = "client!abz", name = "q", descriptor = "(I)V")
	void method1014(@OriginalArg(0) int arg0) {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(31) List local31;
		@Pc(62) Iterator local62;
		@Pc(69) Entry local69;
		if (this.anObjectArray1 == null) {
			if (this.aMap2 == null) {
				throw new IllegalStateException();
			}
			local62 = this.aMap2.entrySet().iterator();
			while (local62.hasNext()) {
				local69 = (Entry) local62.next();
				@Pc(72) Object local72 = local69.getValue();
				@Pc(77) List local77 = (List) local3.get(local72);
				if (local77 == null) {
					local77 = new LinkedList();
					local3.put(local72, local77);
				}
				local77.add(local69.getKey());
			}
		} else {
			for (@Pc(9) int local9 = 0; local9 < this.anObjectArray1.length; local9++) {
				if (this.anObjectArray1[local9] != null) {
					@Pc(26) Object local26 = this.anObjectArray1[local9];
					local31 = (List) local3.get(local26);
					if (local31 == null) {
						local31 = new LinkedList();
						local3.put(local26, local31);
					}
					local31.add(Integer.valueOf(local9));
				}
			}
		}
		this.aHashMap1 = new HashMap();
		local62 = local3.entrySet().iterator();
		while (local62.hasNext()) {
			local69 = (Entry) local62.next();
			local31 = (List) local69.getValue();
			@Pc(124) int[] local124 = new int[local31.size()];
			@Pc(126) int local126 = 0;
			@Pc(129) Iterator local129 = local31.iterator();
			while (local129.hasNext()) {
				@Pc(136) Integer local136 = (Integer) local129.next();
				local124[local126++] = local136;
			}
			if (this.anObjectArray1 == null) {
				Arrays.sort(local124);
			}
			this.aHashMap1.put(local69.getKey(), local124);
		}
	}

	@OriginalMember(owner = "client!abz", name = "ay", descriptor = "(Ljava/lang/Object;)[I")
	public int[] method1015(@OriginalArg(0) Object arg0) {
		if (this.anInt189 * 1360383247 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(1448512345);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "m", descriptor = "(II)Ljava/lang/String;")
	public String method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object local4 = this.method1017(arg0, -251176963);
		return local4 == null ? this.aString9 : (String) local4;
	}

	@OriginalMember(owner = "client!abz", name = "k", descriptor = "(II)Ljava/lang/Object;")
	Object method1017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abz", name = "x", descriptor = "(Ljava/lang/Object;S)Z")
	public boolean method1018(@OriginalArg(0) Object arg0, @OriginalArg(1) short arg1) {
		if (this.anInt189 * 1360383247 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(1852363573);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "w", descriptor = "(Ljava/lang/Object;I)[I")
	public int[] method1019(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (this.anInt189 * 1360383247 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(-538797278);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "r", descriptor = "(I)I")
	public int method1020(@OriginalArg(0) int arg0) {
		return this.anInt189 * 1360383247;
	}

	@OriginalMember(owner = "client!abz", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!abz", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!abz", name = "n", descriptor = "(I)Ljava/lang/Object;")
	Object method1021(@OriginalArg(0) int arg0) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abz", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1028(arg0, local3, 1617402683);
		}
	}

	@OriginalMember(owner = "client!abz", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abz", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abz", name = "ag", descriptor = "()V")
	void method1022() {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(31) List local31;
		@Pc(62) Iterator local62;
		@Pc(69) Entry local69;
		if (this.anObjectArray1 == null) {
			if (this.aMap2 == null) {
				throw new IllegalStateException();
			}
			local62 = this.aMap2.entrySet().iterator();
			while (local62.hasNext()) {
				local69 = (Entry) local62.next();
				@Pc(72) Object local72 = local69.getValue();
				@Pc(77) List local77 = (List) local3.get(local72);
				if (local77 == null) {
					local77 = new LinkedList();
					local3.put(local72, local77);
				}
				local77.add(local69.getKey());
			}
		} else {
			for (@Pc(9) int local9 = 0; local9 < this.anObjectArray1.length; local9++) {
				if (this.anObjectArray1[local9] != null) {
					@Pc(26) Object local26 = this.anObjectArray1[local9];
					local31 = (List) local3.get(local26);
					if (local31 == null) {
						local31 = new LinkedList();
						local3.put(local26, local31);
					}
					local31.add(Integer.valueOf(local9));
				}
			}
		}
		this.aHashMap1 = new HashMap();
		local62 = local3.entrySet().iterator();
		while (local62.hasNext()) {
			local69 = (Entry) local62.next();
			local31 = (List) local69.getValue();
			@Pc(124) int[] local124 = new int[local31.size()];
			@Pc(126) int local126 = 0;
			@Pc(129) Iterator local129 = local31.iterator();
			while (local129.hasNext()) {
				@Pc(136) Integer local136 = (Integer) local129.next();
				local124[local126++] = local136;
			}
			if (this.anObjectArray1 == null) {
				Arrays.sort(local124);
			}
			this.aHashMap1.put(local69.getKey(), local124);
		}
	}

	@OriginalMember(owner = "client!abz", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abz", name = "h", descriptor = "(Lclient!ald;I)V")
	void method1023(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_2 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 2) {
			local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_1 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 3) {
			this.aString9 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.anInt188 = arg0.g4() * 147862363;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt189 = arg0.g2() * -861961745;
				this.aMap2 = new HashMap(this.anInt189 * 1360383247);
				for (local73 = 0; local73 < this.anInt189 * 1360383247; local73++) {
					local83 = arg0.g4();
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.gjstr();
					} else {
						local90 = Integer.valueOf(arg0.g4());
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.g2();
				this.anInt189 = arg0.g2() * -861961745;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt189 * 1360383247; local83++) {
					@Pc(143) int local143 = arg0.g2();
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.gjstr();
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.g4());
					}
				}
			} else if (arg1 == 101) {
				this.aClass521_2 = (Class521) Class80_Sub39.method15030(Class521.method30628(1967978399), arg0.gSmart1or2(), -1653818763);
			} else if (arg1 == 102) {
				this.aClass521_1 = (Class521) Class80_Sub39.method15030(Class521.method30628(1957019721), arg0.gSmart1or2(), -1978348100);
			}
		}
	}

	@OriginalMember(owner = "client!abz", name = "y", descriptor = "(I)Ljava/lang/String;")
	public String method1024(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method1017(arg0, 56782652);
		return local4 == null ? this.aString9 : (String) local4;
	}

	@OriginalMember(owner = "client!abz", name = "z", descriptor = "(I)I")
	public int method1025(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method1017(arg0, -1350678480);
		return local4 == null ? this.anInt188 * 1870447827 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abz", name = "p", descriptor = "(I)I")
	public int method1026(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method1017(arg0, 1557363931);
		return local4 == null ? this.anInt188 * 1870447827 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abz", name = "aj", descriptor = "()I")
	public int method1027() {
		return this.anInt189 * 1360383247;
	}

	@OriginalMember(owner = "client!abz", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1028(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_2 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 2) {
			local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_1 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 3) {
			this.aString9 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.anInt188 = arg0.g4() * 147862363;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt189 = arg0.g2() * -861961745;
				this.aMap2 = new HashMap(this.anInt189 * 1360383247);
				for (local73 = 0; local73 < this.anInt189 * 1360383247; local73++) {
					local83 = arg0.g4();
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.gjstr();
					} else {
						local90 = Integer.valueOf(arg0.g4());
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.g2();
				this.anInt189 = arg0.g2() * -861961745;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt189 * 1360383247; local83++) {
					@Pc(143) int local143 = arg0.g2();
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.gjstr();
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.g4());
					}
				}
			} else if (arg1 == 101) {
				this.aClass521_2 = (Class521) Class80_Sub39.method15030(Class521.method30628(1191280726), arg0.gSmart1or2(), -1794825555);
			} else if (arg1 == 102) {
				this.aClass521_1 = (Class521) Class80_Sub39.method15030(Class521.method30628(1923490397), arg0.gSmart1or2(), -800170730);
			}
		}
	}

	@OriginalMember(owner = "client!abz", name = "c", descriptor = "(I)Ljava/lang/Object;")
	Object method1029(@OriginalArg(0) int arg0) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abz", name = "ax", descriptor = "(Ljava/lang/Object;)[I")
	public int[] method1030(@OriginalArg(0) Object arg0) {
		if (this.anInt189 * 1360383247 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(100282488);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "b", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method1031(@OriginalArg(0) Object arg0) {
		if (this.anInt189 * 1360383247 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(-370741387);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "v", descriptor = "(I)Ljava/lang/String;")
	public String method1032(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method1017(arg0, -1233136339);
		return local4 == null ? this.aString9 : (String) local4;
	}

	@OriginalMember(owner = "client!abz", name = "i", descriptor = "(II)I")
	public int method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object local4 = this.method1017(arg0, -889799063);
		return local4 == null ? this.anInt188 * 1870447827 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abz", name = "ai", descriptor = "(Ljava/lang/Object;)[I")
	public int[] method1034(@OriginalArg(0) Object arg0) {
		if (this.anInt189 * 1360383247 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(-1458702904);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "aq", descriptor = "(Ljava/lang/Object;)[I")
	public int[] method1035(@OriginalArg(0) Object arg0) {
		if (this.anInt189 * 1360383247 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method1014(-2059475385);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abz", name = "ao", descriptor = "()I")
	public int method1036() {
		return this.anInt189 * 1360383247;
	}

	@OriginalMember(owner = "client!abz", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!abz", name = "ac", descriptor = "()I")
	public int method1037() {
		return this.anInt189 * 1360383247;
	}

	@OriginalMember(owner = "client!abz", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}
}
