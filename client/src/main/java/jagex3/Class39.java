package jagex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abm")
public final class Class39 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!abm", name = "io", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_1;

	@OriginalMember(owner = "client!abm", name = "n", descriptor = "Lclient!qw;")
	public ScriptVarType aScriptVarType_1;

	@OriginalMember(owner = "client!abm", name = "k", descriptor = "I")
	int anInt124;

	@OriginalMember(owner = "client!abm", name = "f", descriptor = "Ljava/util/Map;")
	Map aMap2;

	@OriginalMember(owner = "client!abm", name = "w", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray1;

	@OriginalMember(owner = "client!abm", name = "e", descriptor = "Lclient!qw;")
	public ScriptVarType aScriptVarType_2;

	@OriginalMember(owner = "client!abm", name = "u", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap1;

	@OriginalMember(owner = "client!abm", name = "m", descriptor = "Ljava/lang/String;")
	String aString5 = "null";

	@OriginalMember(owner = "client!abm", name = "l", descriptor = "I")
	int anInt123 = 0;

	@OriginalMember(owner = "client!abm", name = "f", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	static Class method769(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "p", descriptor = "(IS)V")
	public static void method770(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(6, (long) arg0);
		local4.method21877(2145346431);
	}

	@OriginalMember(owner = "client!abm", name = "<init>", descriptor = "()V")
	Class39() {
	}

	@OriginalMember(owner = "client!abm", name = "ac", descriptor = "(Ljava/lang/Object;)[I")
	public int[] method746(@OriginalArg(0) Object arg0) {
		if (this.anInt123 * -1630596103 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "y", descriptor = "(I)I")
	public int method747(@OriginalArg(0) int arg0) {
		return this.anInt123 * -1630596103;
	}

	@OriginalMember(owner = "client!abm", name = "p", descriptor = "(II)I")
	public int method748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object local4 = this.method750(arg0, -1381789981);
		return local4 == null ? this.anInt124 * -1577094517 : (Integer) local4;
	}

	@OriginalMember(owner = "client!abm", name = "d", descriptor = "(II)Ljava/lang/String;")
	public String method749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object local4 = this.method750(arg0, -245018447);
		return local4 == null ? this.aString5 : (String) local4;
	}

	@OriginalMember(owner = "client!abm", name = "c", descriptor = "(II)Ljava/lang/Object;")
	Object method750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abm", name = "o", descriptor = "(Ljava/lang/Object;B)Z")
	public boolean method751(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt123 * -1630596103 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "u", descriptor = "(Lclient!alw;II)V")
	void method752(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class615.method32270(arg0.method22426(495285591), (short) 150);
			this.aScriptVarType_2 = ScriptVarType.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			local8 = Class615.method32270(arg0.method22426(1839076446), (short) 150);
			this.aScriptVarType_1 = ScriptVarType.method30500(local8, (byte) 8);
		} else if (arg1 == 3) {
			this.aString5 = arg0.method22439(-139955878);
		} else if (arg1 == 4) {
			this.anInt124 = arg0.method22431(-118643075) * -1904745181;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt123 = arg0.method22427(-1434290800) * 507854409;
				this.aMap2 = new HashMap(this.anInt123 * -1630596103);
				for (local73 = 0; local73 < this.anInt123 * -1630596103; local73++) {
					local83 = arg0.method22431(-118643075);
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.method22439(1334482136);
					} else {
						local90 = Integer.valueOf(arg0.method22431(-118643075));
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.method22427(-1434290800);
				this.anInt123 = arg0.method22427(-1434290800) * 507854409;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt123 * -1630596103; local83++) {
					@Pc(143) int local143 = arg0.method22427(-1434290800);
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.method22439(1595170634);
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.method22431(-118643075));
					}
				}
			} else if (arg1 == 101) {
				this.aScriptVarType_2 = (ScriptVarType) Class107.method18131(ScriptVarType.values(), arg0.method22644((byte) -9), -1915563430);
			} else if (arg1 == 102) {
				this.aScriptVarType_1 = (ScriptVarType) Class107.method18131(ScriptVarType.values(), arg0.method22644((byte) -91), -1915563430);
			}
		}
	}

	@OriginalMember(owner = "client!abm", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abm", name = "q", descriptor = "(B)V")
	void method753(@OriginalArg(0) byte arg0) {
		@Pc(3) HashMap local3 = new HashMap();
		@Pc(31) List local31;
		@Pc(60) Iterator local60;
		@Pc(67) Entry local67;
		if (this.anObjectArray1 == null) {
			if (this.aMap2 == null) {
				throw new IllegalStateException();
			}
			local60 = this.aMap2.entrySet().iterator();
			while (local60.hasNext()) {
				local67 = (Entry) local60.next();
				@Pc(70) Object local70 = local67.getValue();
				@Pc(75) List local75 = (List) local3.get(local70);
				if (local75 == null) {
					local75 = new LinkedList();
					local3.put(local70, local75);
				}
				local75.add(local67.getKey());
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
		local60 = local3.entrySet().iterator();
		while (local60.hasNext()) {
			local67 = (Entry) local60.next();
			local31 = (List) local67.getValue();
			@Pc(122) int[] local122 = new int[local31.size()];
			@Pc(124) int local124 = 0;
			@Pc(127) Iterator local127 = local31.iterator();
			while (local127.hasNext()) {
				@Pc(134) Integer local134 = (Integer) local127.next();
				local122[local124++] = local134;
			}
			if (this.anObjectArray1 == null) {
				Arrays.sort(local122);
			}
			this.aHashMap1.put(local67.getKey(), local122);
		}
	}

	@OriginalMember(owner = "client!abm", name = "aw", descriptor = "()I")
	public int method754() {
		return this.anInt123 * -1630596103;
	}

	@OriginalMember(owner = "client!abm", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!abm", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abm", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method752(arg0, local3, -1830356806);
		}
	}

	@OriginalMember(owner = "client!abm", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method752(arg0, local3, -1265997758);
		}
	}

	@OriginalMember(owner = "client!abm", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method752(arg0, local3, -921091194);
		}
	}

	@OriginalMember(owner = "client!abm", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method755(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method750(arg0, 1632201641);
		return local4 == null ? this.aString5 : (String) local4;
	}

	@OriginalMember(owner = "client!abm", name = "al", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method756(@OriginalArg(0) Object arg0) {
		if (this.anInt123 * -1630596103 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abm", name = "x", descriptor = "(Lclient!alw;I)V")
	void method757(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) char local8;
		if (arg1 == 1) {
			local8 = Class615.method32270(arg0.method22426(555189002), (short) 150);
			this.aScriptVarType_2 = ScriptVarType.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			local8 = Class615.method32270(arg0.method22426(1205391096), (short) 150);
			this.aScriptVarType_1 = ScriptVarType.method30500(local8, (byte) 8);
		} else if (arg1 == 3) {
			this.aString5 = arg0.method22439(182992110);
		} else if (arg1 == 4) {
			this.anInt124 = arg0.method22431(-118643075) * -1904745181;
		} else {
			@Pc(83) int local83;
			@Pc(73) int local73;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt123 = arg0.method22427(-1434290800) * 507854409;
				this.aMap2 = new HashMap(this.anInt123 * -1630596103);
				for (local73 = 0; local73 < this.anInt123 * -1630596103; local73++) {
					local83 = arg0.method22431(-118643075);
					@Pc(90) Object local90;
					if (arg1 == 5) {
						local90 = arg0.method22439(16080687);
					} else {
						local90 = Integer.valueOf(arg0.method22431(-118643075));
					}
					this.aMap2.put(Integer.valueOf(local83), local90);
				}
			} else if (arg1 == 7 || arg1 == 8) {
				local73 = arg0.method22427(-1434290800);
				this.anInt123 = arg0.method22427(-1434290800) * 507854409;
				this.anObjectArray1 = new Object[local73];
				for (local83 = 0; local83 < this.anInt123 * -1630596103; local83++) {
					@Pc(143) int local143 = arg0.method22427(-1434290800);
					if (arg1 == 7) {
						this.anObjectArray1[local143] = arg0.method22439(1501588332);
					} else {
						this.anObjectArray1[local143] = Integer.valueOf(arg0.method22431(-118643075));
					}
				}
			} else if (arg1 == 101) {
				this.aScriptVarType_2 = (ScriptVarType) Class107.method18131(ScriptVarType.values(), arg0.method22644((byte) -112), -1915563430);
			} else if (arg1 == 102) {
				this.aScriptVarType_1 = (ScriptVarType) Class107.method18131(ScriptVarType.values(), arg0.method22644((byte) -66), -1915563430);
			}
		}
	}

	@OriginalMember(owner = "client!abm", name = "ai", descriptor = "()I")
	public int method758() {
		return this.anInt123 * -1630596103;
	}

	@OriginalMember(owner = "client!abm", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method759(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method750(arg0, -220105267);
		return local4 == null ? this.aString5 : (String) local4;
	}

	@OriginalMember(owner = "client!abm", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!abm", name = "g", descriptor = "(I)Ljava/lang/Object;")
	Object method760(@OriginalArg(0) int arg0) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abm", name = "i", descriptor = "(I)Ljava/lang/Object;")
	Object method761(@OriginalArg(0) int arg0) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abm", name = "j", descriptor = "(I)Ljava/lang/Object;")
	Object method762(@OriginalArg(0) int arg0) {
		if (this.anObjectArray1 == null) {
			return this.aMap2 == null ? null : this.aMap2.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.anObjectArray1.length) {
			return this.anObjectArray1[arg0];
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!abm", name = "t", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method763(@OriginalArg(0) Object arg0) {
		if (this.anInt123 * -1630596103 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "ae", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method764(@OriginalArg(0) Object arg0) {
		if (this.anInt123 * -1630596103 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "ag", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method765(@OriginalArg(0) Object arg0) {
		if (this.anInt123 * -1630596103 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "ah", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method766(@OriginalArg(0) Object arg0) {
		if (this.anInt123 * -1630596103 == 0) {
			return false;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return this.aHashMap1.containsKey(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method752(arg0, local3, -305748665);
		}
	}

	@OriginalMember(owner = "client!abm", name = "s", descriptor = "(Ljava/lang/Object;I)[I")
	public int[] method767(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (this.anInt123 * -1630596103 == 0) {
			return null;
		} else {
			if (this.aHashMap1 == null) {
				this.method753((byte) 9);
			}
			return (int[]) this.aHashMap1.get(arg0);
		}
	}

	@OriginalMember(owner = "client!abm", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method768(@OriginalArg(0) int arg0) {
		@Pc(4) Object local4 = this.method750(arg0, -308098723);
		return local4 == null ? this.aString5 : (String) local4;
	}

	@OriginalMember(owner = "client!abm", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method752(arg0, local3, -98694344);
		}
	}
}
