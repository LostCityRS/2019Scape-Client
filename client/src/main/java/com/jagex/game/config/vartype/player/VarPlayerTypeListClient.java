package com.jagex.game.config.vartype.player;

import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.Packet;
import com.jagex.WeightedCache;
import com.jagex.core.constants.Language;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("adj")
public class VarPlayerTypeListClient extends VarTypeList implements ConfigTypeList {

	@ObfuscatedName("adj.n")
	public final Js5 field9255;

	@ObfuscatedName("adj.m")
	public final WeightedCache field9254 = new WeightedCache(64);

	public VarPlayerTypeListClient(ModeGame arg0, VarDomainType arg1, Language arg2, Js5 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method6897(arg1.getJs5GroupID().id));
		this.field9255 = arg3;
	}

	@ObfuscatedName("adj.e(II)Lay;")
	public ConfigType get(int arg0) {
		WeightedCache var2 = this.field9254;
		synchronized (this.field9254) {
			VarPlayerType var3 = (VarPlayerType) this.field9254.method2930((long) arg0);
			if (var3 == null) {
				var3 = this.method15255(arg0);
				this.field9254.method2921(var3, (long) arg0);
			}
			return var3;
		}
	}

	@ObfuscatedName("adj.r(II)Laff;")
	public VarPlayerType method15255(int arg0) {
		byte[] var2 = this.field9255.method6879(this.field9260.getJs5GroupID().id, arg0);
		VarPlayerType var3 = new VarPlayerType(this.field9260, arg0);
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		return var3;
	}

	@ObfuscatedName("adj.v(I)V")
	public void method15256() {
		WeightedCache var1 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.method2924();
		}
	}

	@ObfuscatedName("adj.o(II)V")
	public void method15259(int arg0) {
		WeightedCache var2 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.method2923(arg0);
		}
	}

	// line 54
	@ObfuscatedName("adj.s(B)V")
	public void method15257() {
		WeightedCache var1 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.method2928();
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
			return this.field1982 < this.this$0.size();
		}

		// line 68
		public Object next() {
			int var1 = ++this.field1982 - 1;
			VarPlayerType var2 = (VarPlayerType) this.this$0.field9254.method2930((long) var1);
			return var2 == null ? this.this$0.method15255(var1) : var2;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	// line 81
	@ObfuscatedName("adj.n(I)I")
	public int size() {
		return super.size();
	}
}
