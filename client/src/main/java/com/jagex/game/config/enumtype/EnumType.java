package com.jagex.game.config.enumtype;

import com.jagex.ConfigRelated;
import com.jagex.Packet;
import com.jagex.SerializableEnums;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;
import deob.Statics;

import java.util.*;
import java.util.Map.Entry;

@ObfuscatedName("abm")
public class EnumType implements ConfigType, ConfigRelated {

	@ObfuscatedName("abm.e")
	public ScriptVarType field8781;

	@ObfuscatedName("abm.n")
	public ScriptVarType field8775;

	@ObfuscatedName("abm.m")
	public String field8777 = "null";

	@ObfuscatedName("abm.k")
	public int field8778;

	@ObfuscatedName("abm.f")
	public Map field8779;

	@ObfuscatedName("abm.w")
	public Object[] field8780;

	@ObfuscatedName("abm.l")
	public int field8776 = 0;

	@ObfuscatedName("abm.u")
	public java.util.HashMap field8782;

	@ObfuscatedName("abm.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method14852(arg0, var2);
		}
	}

	@ObfuscatedName("abm.u(Lalw;II)V")
	public void method14852(Packet arg0, int arg1) {
		if (arg1 == 1) {
			char var3 = Statics.method9576(arg0.g1b());
			this.field8781 = Statics.method7300(var3);
		} else if (arg1 == 2) {
			char var4 = Statics.method9576(arg0.g1b());
			this.field8775 = Statics.method7300(var4);
		} else if (arg1 == 3) {
			this.field8777 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.field8778 = arg0.g4s();
		} else if (arg1 == 5 || arg1 == 6) {
			this.field8776 = arg0.g2();
			this.field8779 = new java.util.HashMap(this.field8776);
			for (int var8 = 0; var8 < this.field8776; var8++) {
				int var9 = arg0.g4s();
				Object var10;
				if (arg1 == 5) {
					var10 = arg0.gjstr();
				} else {
					var10 = Integer.valueOf(arg0.g4s());
				}
				this.field8779.put(Integer.valueOf(var9), var10);
			}
		} else if (arg1 == 7 || arg1 == 8) {
			int var5 = arg0.g2();
			this.field8776 = arg0.g2();
			this.field8780 = new Object[var5];
			for (int var6 = 0; var6 < this.field8776; var6++) {
				int var7 = arg0.g2();
				if (arg1 == 7) {
					this.field8780[var7] = arg0.gjstr();
				} else {
					this.field8780[var7] = Integer.valueOf(arg0.g4s());
				}
			}
		} else if (arg1 == 101) {
			this.field8781 = (ScriptVarType) SerializableEnums.decode(ScriptVarType.method7293(), arg0.gSmart1or2());
		} else if (arg1 == 102) {
			this.field8775 = (ScriptVarType) SerializableEnums.decode(ScriptVarType.method7293(), arg0.gSmart1or2());
		}
	}

	@ObfuscatedName("abm.p(II)I")
	public int method14848(int arg0) {
		Object var2 = this.method14850(arg0);
		return var2 == null ? this.field8778 : (Integer) var2;
	}

	@ObfuscatedName("abm.d(II)Ljava/lang/String;")
	public String method14849(int arg0) {
		Object var2 = this.method14850(arg0);
		return var2 == null ? this.field8777 : (String) var2;
	}

	@ObfuscatedName("abm.c(II)Ljava/lang/Object;")
	public Object method14850(int arg0) {
		if (this.field8780 == null) {
			return this.field8779 == null ? null : this.field8779.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.field8780.length) {
			return this.field8780[arg0];
		} else {
			return null;
		}
	}

	@ObfuscatedName("abm.o(Ljava/lang/Object;B)Z")
	public boolean method14851(Object arg0) {
		if (this.field8776 == 0) {
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
		if (this.field8776 == 0) {
			return null;
		} else {
			if (this.field8782 == null) {
				this.method14853();
			}
			return (int[]) this.field8782.get(arg0);
		}
	}

	@ObfuscatedName("abm.y(I)I")
	public int method14847() {
		return this.field8776;
	}

	@ObfuscatedName("abm.q(B)V")
	public void method14853() {
		java.util.HashMap var1 = new java.util.HashMap();
		if (this.field8780 == null) {
			if (this.field8779 == null) {
				throw new IllegalStateException();
			}
			Iterator var5 = this.field8779.entrySet().iterator();
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
		this.field8782 = new java.util.HashMap();
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
	public void method2998(int arg0) {
	}
}
