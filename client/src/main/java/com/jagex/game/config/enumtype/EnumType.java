package com.jagex.game.config.enumtype;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("abm")
public class EnumType implements ConfigType, MutableConfig {

	@ObfuscatedName("abm.e")
	public ScriptVarType inputtype;

	@ObfuscatedName("abm.n")
	public ScriptVarType outputtype;

	@ObfuscatedName("abm.m")
	public String defaultString = "null";

	@ObfuscatedName("abm.k")
	public int defaultInt;

	@ObfuscatedName("abm.f")
	public Map values;

	@ObfuscatedName("abm.w")
	public Object[] field8780;

	@ObfuscatedName("abm.l")
	public int valuesCount = 0;

	@ObfuscatedName("abm.u")
	public HashMap field8782;

	@ObfuscatedName("abm.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("abm.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			char var3 = Cp1252.byteToCp1252Char(arg0.g1b());
			this.inputtype = ScriptVarType.getByLegacyChar(var3);
		} else if (arg1 == 2) {
			char var4 = Cp1252.byteToCp1252Char(arg0.g1b());
			this.outputtype = ScriptVarType.getByLegacyChar(var4);
		} else if (arg1 == 3) {
			this.defaultString = arg0.gjstr();
		} else if (arg1 == 4) {
			this.defaultInt = arg0.g4s();
		} else if (arg1 == 5 || arg1 == 6) {
			this.valuesCount = arg0.g2();
			this.values = new HashMap(this.valuesCount);
			for (int var8 = 0; var8 < this.valuesCount; var8++) {
				int var9 = arg0.g4s();
				Object var10;
				if (arg1 == 5) {
					var10 = arg0.gjstr();
				} else {
					var10 = Integer.valueOf(arg0.g4s());
				}
				this.values.put(Integer.valueOf(var9), var10);
			}
		} else if (arg1 == 7 || arg1 == 8) {
			int var5 = arg0.g2();
			this.valuesCount = arg0.g2();
			this.field8780 = new Object[var5];
			for (int var6 = 0; var6 < this.valuesCount; var6++) {
				int var7 = arg0.g2();
				if (arg1 == 7) {
					this.field8780[var7] = arg0.gjstr();
				} else {
					this.field8780[var7] = Integer.valueOf(arg0.g4s());
				}
			}
		} else if (arg1 == 101) {
			this.inputtype = (ScriptVarType) SerializableEnums.decode((SerializableEnum[]) ScriptVarType.values(), arg0.gSmart1or2());
		} else if (arg1 == 102) {
			this.outputtype = (ScriptVarType) SerializableEnums.decode((SerializableEnum[]) ScriptVarType.values(), arg0.gSmart1or2());
		}
	}

	@ObfuscatedName("abm.p(II)I")
	public int getValueInt(int arg0) {
		Object var2 = this.method14850(arg0);
		return var2 == null ? this.defaultInt : (Integer) var2;
	}

	@ObfuscatedName("abm.d(II)Ljava/lang/String;")
	public String getValueString(int arg0) {
		Object var2 = this.method14850(arg0);
		return var2 == null ? this.defaultString : (String) var2;
	}

	@ObfuscatedName("abm.c(II)Ljava/lang/Object;")
	public Object method14850(int arg0) {
		if (this.field8780 == null) {
			return this.values == null ? null : this.values.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.field8780.length) {
			return this.field8780[arg0];
		} else {
			return null;
		}
	}

	@ObfuscatedName("abm.o(Ljava/lang/Object;B)Z")
	public boolean hasOutputString(Object arg0) {
		if (this.valuesCount == 0) {
			return false;
		} else {
			if (this.field8782 == null) {
				this.method14853();
			}
			return this.field8782.containsKey(arg0);
		}
	}

	@ObfuscatedName("abm.s(Ljava/lang/Object;I)[I")
	public int[] method14867(Object arg0) {
		if (this.valuesCount == 0) {
			return null;
		} else {
			if (this.field8782 == null) {
				this.method14853();
			}
			return (int[]) this.field8782.get(arg0);
		}
	}

	@ObfuscatedName("abm.y(I)I")
	public int getOutputCount() {
		return this.valuesCount;
	}

	@ObfuscatedName("abm.q(B)V")
	public void method14853() {
		HashMap var1 = new HashMap();
		if (this.field8780 == null) {
			if (this.values == null) {
				throw new IllegalStateException();
			}
			Iterator var5 = this.values.entrySet().iterator();
			while (var5.hasNext()) {
				Entry var6 = (Entry) var5.next();
				Object var7 = var6.getValue();
				List var8 = (List) var1.get(var7);
				if (var8 == null) {
					var8 = new LinkedList();
					var1.put(var7, var8);
				}
				var8.add(var6.getKey());
			}
		} else {
			for (int var2 = 0; var2 < this.field8780.length; var2++) {
				if (this.field8780[var2] != null) {
					Object var3 = this.field8780[var2];
					List var4 = (List) var1.get(var3);
					if (var4 == null) {
						var4 = new LinkedList();
						var1.put(var3, var4);
					}
					var4.add(Integer.valueOf(var2));
				}
			}
		}
		this.field8782 = new HashMap();
		Iterator var9 = var1.entrySet().iterator();
		while (var9.hasNext()) {
			Entry var10 = (Entry) var9.next();
			List var11 = (List) var10.getValue();
			int[] var12 = new int[var11.size()];
			int var13 = 0;
			Iterator var14 = var11.iterator();
			while (var14.hasNext()) {
				Integer var15 = (Integer) var14.next();
				var12[var13++] = var15;
			}
			if (this.field8780 == null) {
				Arrays.sort(var12);
			}
			this.field8782.put(var10.getKey(), var12);
		}
	}

	@ObfuscatedName("abm.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("abm.z(IB)V")
	public void setId(int arg0) {
	}
}
