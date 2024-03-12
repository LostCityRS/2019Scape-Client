package com.jagex.game.config.vartype;

import com.jagex.game.client.DefaultVarValueProvider;
import com.jagex.core.utils.VarValue;
import deob.ObfuscatedName;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("abn")
public class VarContainerSparse implements VarContainer {

	@ObfuscatedName("abn.e")
	public Map field8740;

	@ObfuscatedName("abn.n")
	public final DefaultVarValueProvider field8739;

	public VarContainerSparse(DefaultVarValueProvider arg0) {
		this.field8739 = arg0;
	}

	@ObfuscatedName("abn.e(II)I")
	public int method14728(int arg0) {
		if (this.field8740 != null) {
			VarValue var2 = (VarValue) this.field8740.get(arg0);
			if (var2 != null) {
				return (Integer) var2.field4239;
			}
		}
		return (Integer) this.field8739.getDefaultValue(arg0);
	}

	@ObfuscatedName("abn.n(IIB)V")
	public void method14729(int arg0, int arg1) {
		if (this.field8740 == null) {
			this.field8740 = new HashMap();
			this.field8740.put(arg0, new VarValue(arg0, arg1));
			return;
		}
		VarValue var3 = (VarValue) this.field8740.get(arg0);
		if (var3 == null) {
			this.field8740.put(arg0, new VarValue(arg0, arg1));
		} else {
			var3.field4239 = arg1;
		}
	}

	@ObfuscatedName("abn.m(II)J")
	public long method14730(int arg0) {
		if (this.field8740 != null) {
			VarValue var2 = (VarValue) this.field8740.get(arg0);
			if (var2 != null) {
				return (Long) var2.field4239;
			}
		}
		return (Long) this.field8739.getDefaultValue(arg0);
	}

	@ObfuscatedName("abn.k(IJ)V")
	public void method14742(int arg0, long arg1) {
		if (this.field8740 == null) {
			this.field8740 = new HashMap();
			this.field8740.put(arg0, new VarValue(arg0, arg1));
			return;
		}
		VarValue var4 = (VarValue) this.field8740.get(arg0);
		if (var4 == null) {
			this.field8740.put(arg0, new VarValue(arg0, arg1));
		} else {
			var4.field4239 = arg1;
		}
	}

	@ObfuscatedName("abn.f(II)Ljava/lang/Object;")
	public Object method14738(int arg0) {
		if (this.field8740 != null) {
			VarValue var2 = (VarValue) this.field8740.get(arg0);
			if (var2 != null) {
				return var2.field4239;
			}
		}
		return this.field8739.getDefaultValue(arg0);
	}

	@ObfuscatedName("abn.w(ILjava/lang/Object;B)V")
	public void method14735(int arg0, Object arg1) {
		if (this.field8740 == null) {
			this.field8740 = new HashMap();
			this.field8740.put(arg0, new VarValue(arg0, arg1));
			return;
		}
		VarValue var3 = (VarValue) this.field8740.get(arg0);
		if (var3 == null) {
			this.field8740.put(arg0, new VarValue(arg0, arg1));
		} else {
			var3.field4239 = arg1;
		}
	}

	@ObfuscatedName("abn.l(I)V")
	public void method14749() {
		if (this.field8740 != null) {
			this.field8740.clear();
		}
	}

	@ObfuscatedName("abn.u(IB)V")
	public void method14734(int arg0) {
		if (this.field8740 != null) {
			this.field8740.remove(arg0);
		}
	}

	public Iterator iterator() {
		return this.field8740 == null ? Collections.emptyList().iterator() : this.field8740.values().iterator();
	}
}
