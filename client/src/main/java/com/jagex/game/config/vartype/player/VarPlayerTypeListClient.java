package com.jagex.game.config.vartype.player;

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

@ObfuscatedName("adj")
public class VarPlayerTypeListClient extends VarTypeList implements ConfigTypeList {

	@ObfuscatedName("adj.n")
	public final Js5 field9255;

	@ObfuscatedName("adj.m")
	public final SoftLruHashTable field9254 = new SoftLruHashTable(64);

	public VarPlayerTypeListClient(ModeGame arg0, VarDomainType arg1, Language arg2, Js5 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.getGroupCapacity(arg1.getJs5GroupID().id));
		this.field9255 = arg3;
	}

	@ObfuscatedName("adj.e(II)Lay;")
	public ConfigType list(int id) {
		SoftLruHashTable var2 = this.field9254;
		synchronized (this.field9254) {
			VarPlayerType var3 = (VarPlayerType) this.field9254.get((long) id);
			if (var3 == null) {
				var3 = this.method15255(id);
				this.field9254.put(var3, (long) id);
			}
			return var3;
		}
	}

	@ObfuscatedName("adj.r(II)Laff;")
	public VarPlayerType method15255(int arg0) {
		byte[] var2 = this.field9255.getfile(this.variableDomain.getJs5GroupID().id, arg0);
		VarPlayerType var3 = new VarPlayerType(this.variableDomain, arg0);
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		return var3;
	}

	@ObfuscatedName("adj.v(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.reset();
		}
	}

	@ObfuscatedName("adj.o(II)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.clean(arg0);
		}
	}

	// line 54
	@ObfuscatedName("adj.s(B)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.clear();
		}
	}

	// line 60
	public Iterator iterator() {
		return new VarPlayerTypeListIterator(this);
	}

	@ObfuscatedName("gj")
	public static class VarPlayerTypeListIterator implements Iterator {

		// $FF: synthetic field
		public final VarPlayerTypeListClient this$0;

		@ObfuscatedName("gj.e")
		public int field1982;

		public VarPlayerTypeListIterator(VarPlayerTypeListClient arg0) {
			this.this$0 = arg0;
		}

		public boolean hasNext() {
			return this.field1982 < this.this$0.length();
		}

		// line 68
		public Object next() {
			int var1 = ++this.field1982 - 1;
			VarPlayerType var2 = (VarPlayerType) this.this$0.field9254.get((long) var1);
			return var2 == null ? this.this$0.method15255(var1) : var2;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	// line 81
	@ObfuscatedName("adj.n(I)I")
	public int length() {
		return super.length();
	}
}
