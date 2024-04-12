package com.jagex.game.config.vartype;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.player.VarPlayerType;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.clans.LongNode;

@ObfuscatedName("wu")
public final class VarPlayerDomain implements VarDomain {

	@ObfuscatedName("wu.f")
	public int[] field7604 = new int[Client.varPlayerTypeList.length()];

	@ObfuscatedName("wu.w")
	public int[] field7609 = new int[Client.varPlayerTypeList.length()];

	@ObfuscatedName("wu.l")
	public HashTable field7610 = new HashTable(128);

	@ObfuscatedName("wu.i(ZI)I")
	public int pollServerValue(boolean arg0) {
		long var2 = MonotonicTime.get();
        for (LongNode var4 = (LongNode) (arg0 ? this.field7610.head() : this.field7610.next()); var4 != null; var4 = (LongNode) this.field7610.next()) {
			if ((var4.value & 0x3FFFFFFFFFFFFFFFL) < var2) {
				if ((var4.value & 0x4000000000000000L) != 0L) {
					int var5 = (int) var4.nodeId;
					this.field7609[var5] = this.field7604[var5];
					var4.unlink();
					return var5;
				}
				var4.unlink();
			}
		}
		return -1;
	}

	@ObfuscatedName("wu.j(B)V")
	public void method9624() {
		for (int var1 = 0; var1 < Client.varPlayerTypeList.length(); var1++) {
			VarPlayerType var2 = (VarPlayerType) Client.varPlayerTypeList.list(var1);
			if (var2 != null) {
				this.field7604[var1] = 0;
				this.field7609[var1] = 0;
			}
		}
		this.field7610 = new HashTable(128);
	}

	@ObfuscatedName("wu.u(Lec;I)I")
	public int getVarValueInt(VarType arg0) {
		return this.field7609[arg0.id];
	}

	@ObfuscatedName("wu.e(Lec;II)V")
	public void setVarValueInt(VarType arg0, int arg1) {
		this.field7609[arg0.id] = arg1;
		LongNode var3 = (LongNode) this.field7610.get((long) arg0.id);
		if (var3 == null) {
			LongNode var4 = new LongNode(MonotonicTime.get() + 500L);
            this.field7610.put(var4, (long) arg0.id);
		} else {
			var3.value = MonotonicTime.get() + 500L;
		}
	}

	@ObfuscatedName("wu.t(Lec;IB)V")
	public void setVarValueIntFromServer(VarType arg0, int arg1) {
		this.field7604[arg0.id] = arg1;
		LongNode var3 = (LongNode) this.field7610.get((long) arg0.id);
		if (var3 == null) {
			LongNode var4 = new LongNode(4611686018427387905L);
			this.field7610.put(var4, (long) arg0.id);
		} else if (var3.value != 4611686018427387905L) {
			var3.value = MonotonicTime.get() + 500L | 0x4000000000000000L;
		}
	}

	@ObfuscatedName("wu.z(Lkh;I)I")
	public int getVarBitValue(VarBitType arg0) {
		return arg0.getVarbitValue(this.field7609[arg0.baseVar.id]);
	}

	@ObfuscatedName("wu.w(Lkh;II)V")
	public void setVarbitValue(VarBitType arg0, int arg1) throws VarBitOverflowException {
		int var3 = arg0.setVarbitValue(this.field7609[arg0.baseVar.id], arg1);
		this.setVarValueInt(arg0.baseVar, var3);
	}

	@ObfuscatedName("wu.ae(Lkh;II)V")
	public void setVarBitValueFromServer(VarBitType arg0, int arg1) {
		try {
			int var3 = arg0.setVarbitValue(this.field7604[arg0.baseVar.id], arg1);
			this.setVarValueIntFromServer(arg0.baseVar, var3);
		} catch (VarBitOverflowException var5) {
		}
	}

	@ObfuscatedName("wu.n(Lec;I)J")
	public long getVarValueLong(VarType arg0) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.m(Lec;J)V")
	public void setVarValueLong(VarType arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.k(Lec;B)Ljava/lang/Object;")
	public Object getVarValue(VarType arg0) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("wu.f(Lec;Ljava/lang/Object;I)V")
	public void setVarValue(VarType arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}
}
