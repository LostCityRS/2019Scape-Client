package com.jagex.game.config.vartype.general;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("adm")
public class VarBasicTypeListClient extends VarTypeList implements ConfigTypeList {

	@ObfuscatedName("adm.n")
	public final Js5 configClient;

	@ObfuscatedName("adm.m")
	public final SoftLruHashTable recentUse = new SoftLruHashTable(64);

	public VarBasicTypeListClient(ModeGame arg0, VarDomainType arg1, Language arg2, Js5 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.getGroupCapacity(arg1.getJs5GroupID().id));
		this.configClient = arg3;
	}

	@ObfuscatedName("adm.e(II)Lay;")
	public ConfigType list(int id) {
		SoftLruHashTable var2 = this.recentUse;
		synchronized (this.recentUse) {
			VarBasicType var3 = (VarBasicType) this.recentUse.get((long) id);
			if (var3 == null) {
				var3 = this.method15266(id);
				this.recentUse.put(var3, (long) id);
			}
			return var3;
		}
	}

	@ObfuscatedName("adm.r(IB)Lafv;")
	public VarBasicType method15266(int arg0) {
		byte[] var2 = this.configClient.getfile(this.variableDomain.getJs5GroupID().id, arg0);
		VarBasicType var3 = new VarBasicType(this.variableDomain, arg0);
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		return var3;
	}

	@ObfuscatedName("adm.v(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.reset();
		}
	}

	@ObfuscatedName("adm.o(II)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.clean(arg0);
		}
	}

	@ObfuscatedName("adm.s(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.clear();
		}
	}

	public Iterator iterator() {
		return new VarBasicTypeListClientIterator(this);
	}

	@ObfuscatedName("xn")
	public static class VarBasicTypeListClientIterator implements Iterator {

		// $FF: synthetic field
		public final VarBasicTypeListClient this$0;

		@ObfuscatedName("xn.e")
		public int field7882;

		public VarBasicTypeListClientIterator(VarBasicTypeListClient arg0) {
			this.this$0 = arg0;
		}

		public boolean hasNext() {
			return this.field7882 < this.this$0.length();
		}

		// line 68
		public Object next() {
			int var1 = ++this.field7882 - 1;
			VarBasicType var2 = (VarBasicType) this.this$0.recentUse.get((long) var1);
			return var2 == null ? this.this$0.method15266(var1) : var2;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	// line 81
	@ObfuscatedName("adm.n(I)I")
	public int length() {
		return super.length();
	}
}
