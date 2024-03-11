package com.jagex.game.runetek5.config.vartype;

import com.jagex.game.runetek5.clanchannel.ClanSettingsNode;
import com.jagex.IterableMap;
import com.jagex.MonotonicTime;
import com.jagex.game.runetek5.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.runetek5.config.vartype.bit.VarBitType;
import com.jagex.game.runetek5.config.vartype.player.VarPlayerType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("wu")
public final class VarPlayerDomain implements VarDomain {

	@ObfuscatedName("wu.f")
	public int[] field7604 = new int[Statics.field8485.size()];

	@ObfuscatedName("wu.w")
	public int[] field7609 = new int[Statics.field8485.size()];

	@ObfuscatedName("wu.l")
	public IterableMap field7610 = new IterableMap(128);

	@ObfuscatedName("wu.i(ZI)I")
	public int method9623(boolean arg0) {
		long var2 = MonotonicTime.method3655();
		for (ClanSettingsNode var4 = (ClanSettingsNode) (arg0 ? this.field7610.method14500() : this.field7610.method14502()); var4 != null; var4 = (ClanSettingsNode) this.field7610.method14502()) {
			if ((var4.field11441 & 0x3FFFFFFFFFFFFFFFL) < var2) {
				if ((var4.field11441 & 0x4000000000000000L) != 0L) {
					int var5 = (int) var4.field6760;
					this.field7609[var5] = this.field7604[var5];
					var4.method8440();
					return var5;
				}
				var4.method8440();
			}
		}
		return -1;
	}

	@ObfuscatedName("wu.j(B)V")
	public void method9624() {
		for (int var1 = 0; var1 < Statics.field8485.size(); var1++) {
			VarPlayerType var2 = (VarPlayerType) Statics.field8485.get(var1);
			if (var2 != null) {
				this.field7604[var1] = 0;
				this.field7609[var1] = 0;
			}
		}
		this.field7610 = new IterableMap(128);
	}

	@ObfuscatedName("wu.u(Lec;I)I")
	public int method679(VarType arg0) {
		return this.field7609[arg0.id];
	}

	@ObfuscatedName("wu.e(Lec;II)V")
	public void method2798(VarType arg0, int arg1) {
		this.field7609[arg0.id] = arg1;
		ClanSettingsNode var3 = (ClanSettingsNode) this.field7610.method14495((long) arg0.id);
		if (var3 == null) {
			ClanSettingsNode var4 = new ClanSettingsNode(MonotonicTime.method3655() + 500L);
			this.field7610.method14501(var4, (long) arg0.id);
		} else {
			var3.field11441 = MonotonicTime.method3655() + 500L;
		}
	}

	@ObfuscatedName("wu.t(Lec;IB)V")
	public void method9625(VarType arg0, int arg1) {
		this.field7604[arg0.id] = arg1;
		ClanSettingsNode var3 = (ClanSettingsNode) this.field7610.method14495((long) arg0.id);
		if (var3 == null) {
			ClanSettingsNode var4 = new ClanSettingsNode(4611686018427387905L);
			this.field7610.method14501(var4, (long) arg0.id);
		} else if (var3.field11441 != 4611686018427387905L) {
			var3.field11441 = MonotonicTime.method3655() + 500L | 0x4000000000000000L;
		}
	}

	@ObfuscatedName("wu.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		return arg0.getVarbitValue(this.field7609[arg0.baseVar.id]);
	}

	@ObfuscatedName("wu.w(Lkh;II)V")
	public void method2804(VarBitType arg0, int arg1) throws VarBitOverflowException {
		int var3 = arg0.setVarbitValue(this.field7609[arg0.baseVar.id], arg1);
		this.method2798(arg0.baseVar, var3);
	}

	@ObfuscatedName("wu.ae(Lkh;II)V")
	public void method9629(VarBitType arg0, int arg1) {
		try {
			int var3 = arg0.setVarbitValue(this.field7604[arg0.baseVar.id], arg1);
			this.method9625(arg0.baseVar, var3);
		} catch (VarBitOverflowException var5) {
		}
	}

	@ObfuscatedName("wu.n(Lec;I)J")
	public long method2799(VarType arg0) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.m(Lec;J)V")
	public void method2800(VarType arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(VarType arg0) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(VarType arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}
}
