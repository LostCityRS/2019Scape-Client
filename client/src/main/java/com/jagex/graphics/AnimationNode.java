package com.jagex.graphics;

import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.seqtype.SeqTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("aaq")
public class AnimationNode {

	@ObfuscatedName("aaq.k")
	public SeqType seqType;

	@ObfuscatedName("aaq.f")
	public int field8502;

	@ObfuscatedName("aaq.w")
	public int field8503;

	@ObfuscatedName("aaq.l")
	public int field8504;

	@ObfuscatedName("aaq.u")
	public int field8511;

	@ObfuscatedName("aaq.z")
	public int field8506;

	@ObfuscatedName("aaq.p")
	public boolean field8507 = false;

	@ObfuscatedName("aaq.d")
	public boolean field8500 = false;

	@ObfuscatedName("aaq.c")
	public int field8509 = 0;

	@ObfuscatedName("aaq.r")
	public boolean field8505 = false;

	@ObfuscatedName("atl.v")
	public static SeqTypeList field12490;

	@ObfuscatedName("aaq.o")
	public final FrameSetLoader field8513;

	@ObfuscatedName("aaq.s")
	public final FrameSetLoader field8512;

	@ObfuscatedName("aaq.y")
	public final KeyFrameSetLoader field8498;

	@ObfuscatedName("nv.e(Laos;I)V")
	public static void method6114(SeqTypeList arg0) {
		field12490 = arg0;
	}

	public AnimationNode(boolean arg0) {
		this.field8500 = arg0;
		this.field8513 = new FrameSetLoader();
		this.field8498 = new KeyFrameSetLoader();
		if (this.field8500) {
			this.field8512 = new FrameSetLoader();
		} else {
			this.field8512 = null;
		}
	}

	@ObfuscatedName("aaq.n(Laaq;I)V")
	public final void method14370(AnimationNode arg0) {
		this.seqType = arg0.seqType;
		this.field8507 = arg0.field8507;
		this.field8500 = arg0.field8500;
		this.field8503 = arg0.field8503;
		this.field8504 = arg0.field8504;
		this.field8511 = arg0.field8511;
		this.field8506 = arg0.field8506;
		this.field8502 = arg0.field8502;
		this.method14373();
	}

	@ObfuscatedName("aaq.m(I)Z")
	public final boolean hasSeqType() {
		return this.seqType != null;
	}

	@ObfuscatedName("aaq.k(I)Lfg;")
	public final SeqType getSeqType() {
		return this.seqType;
	}

	@ObfuscatedName("aaq.f(B)I")
	public final int getSeqTypeId() {
		return this.seqType == null ? -1 : this.seqType.id;
	}

	@ObfuscatedName("aaq.w(II)V")
	public final void method14362(int arg0) {
		this.method14353(arg0, 0, 0, false);
	}

	@ObfuscatedName("aaq.l(III)V")
	public final void method14350(int arg0, int arg1) {
		this.method14353(arg0, arg1, 0, false);
	}

	@ObfuscatedName("aaq.u(IZI)V")
	public final void method14351(int arg0, boolean arg1) {
		this.method14353(arg0, 0, 0, arg1);
	}

	@ObfuscatedName("aaq.z(IZZB)V")
	public final void method14352(int arg0, boolean arg1, boolean arg2) {
		this.method14354(arg0, 0, 0, arg1, arg2);
	}

	@ObfuscatedName("aaq.p(IIIZS)V")
	public final void method14353(int arg0, int arg1, int arg2, boolean arg3) {
		this.method14354(arg0, arg1, arg2, arg3, false);
	}

	@ObfuscatedName("aaq.d(IIIZZI)V")
	public final void method14354(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		if (arg0 == this.getSeqTypeId()) {
			return;
		}
		if (arg0 == -1) {
			this.seqType = null;
		} else {
			if (this.seqType == null || this.seqType.id != arg0) {
				this.seqType = (SeqType) field12490.list(arg0);
				if (this.seqType == null || this.seqType.field1770 == null && !this.seqType.method2985()) {
					this.seqType = null;
					return;
				}
			} else if (this.seqType.field1768 == 0) {
				return;
			}
			this.field8504 = 0;
			this.field8503 = arg1;
			this.field8509 = arg2;
			this.field8505 = arg4;
			if (this.seqType.method2985()) {
				if (arg3) {
					this.field8502 = -1;
				} else {
					this.field8502 = 0;
				}
				this.method14413(this.seqType, this.field8502);
			} else {
				if (arg3) {
					this.field8511 = (int) (Math.random() * (double) this.seqType.field1770.length);
					this.field8502 = (int) (Math.random() * (double) this.seqType.frames[this.field8511]);
				} else {
					this.field8511 = 0;
					this.field8502 = 0;
				}
				this.field8506 = this.field8511 + 1;
				if (this.field8506 < 0 || this.field8506 >= this.seqType.field1770.length) {
					this.field8506 = 0;
				}
				if (this.field8503 == 0) {
					this.method14407(this.seqType, this.field8511);
				}
			}
			this.field8507 = false;
		}
		this.method14373();
	}

	@ObfuscatedName("aaq.c(B)Z")
	public final boolean method14355() {
		return this.field8503 != 0;
	}

	@ObfuscatedName("aaq.r(S)I")
	public final int method14398() {
		return this.field8503;
	}

	@ObfuscatedName("aaq.v(IB)V")
	public final void method14357(int arg0) {
		this.field8503 = arg0;
	}

	@ObfuscatedName("aaq.o(I)I")
	public final int method14358() {
		if (!this.method14372()) {
			return 0;
		}
		int var1 = 0;
		if (this.method14372()) {
			if (this.seqType.method2985()) {
				var1 |= this.field8498.field8525;
			} else {
				var1 |= this.field8513.field8515;
				if (this.field8500 && this.seqType.field1771 != null) {
					var1 |= this.field8512.field8515;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("aaq.s(Ldo;II)V")
	public final void method14359(Model arg0, int arg1) {
		if (this.seqType == null) {
			return;
		}
		if (this.seqType.field1770 == null) {
			if (this.seqType.method2985() && this.method14372()) {
				arg0.method1705(this.field8498.field8523, this.field8502, arg1, this.seqType.field1786);
			}
		} else if (this.method14372()) {
			arg0.method1704(this.field8513.field8520, this.field8513.field8516, this.field8513.field8519, this.field8513.field8517, this.field8502, this.seqType.frames[this.field8511], arg1, this.seqType.field1786);
			if (this.field8500 && this.seqType.field1771 != null && this.field8512.field8518) {
				arg0.method1704(this.field8512.field8520, this.field8512.field8516, this.field8512.field8519, this.field8512.field8517, this.field8502, this.seqType.frames[this.field8511], arg1, this.seqType.field1786);
			}
		}
	}

	@ObfuscatedName("aaq.y(Ldo;IIB)V")
	public final void method14360(Model arg0, int arg1, int arg2) {
		if (this.seqType.field1770 != null && this.method14372()) {
			arg0.method1706(this.field8513.field8520, this.field8513.field8516, this.field8513.field8519, this.field8513.field8517, this.field8502, this.seqType.frames[this.field8511], arg1, arg2, this.seqType.field1786, null);
			if (this.field8500 && this.seqType.field1771 != null && this.field8512.field8518) {
				arg0.method1706(this.field8512.field8520, this.field8512.field8516, this.field8512.field8519, this.field8512.field8517, this.field8502, this.seqType.frames[this.field8511], arg1, arg2, this.seqType.field1786, null);
			}
		}
	}

	@ObfuscatedName("aaq.q(Ldo;B)V")
	public final void method14361(Model arg0) {
		if (this.seqType.field1770 != null && this.method14372()) {
			arg0.method1878(this.field8513.field8520, this.field8513.field8516);
			if (this.field8500 && this.seqType.field1771 != null && this.field8512.field8518) {
				arg0.method1878(this.field8512.field8520, this.field8512.field8516);
			}
		}
	}

	@ObfuscatedName("dy.x(Ldo;Laaq;Laaq;I)V")
	public static final void method2099(Model arg0, AnimationNode arg1, AnimationNode arg2) {
		if (!arg1.method14372() || !arg2.method14372()) {
			return;
		}
		SeqType var3 = arg1.seqType;
		SeqType var4 = arg2.seqType;
		if (var3.field1770 == null) {
			if (var3.method2985()) {
				if (var4.field1770 != null) {
					arg0.method1709(arg1.field8498.field8523, arg1.field8502, arg2.field8513.field8520, arg2.field8513.field8516, arg2.field8513.field8519, arg2.field8513.field8517, arg2.field8502, var4.frames[arg2.field8511], var3.field1792 == null ? null : var3.field1792.field1793, var3.field1786 | var4.field1786);
				} else if (var4.method2985()) {
					arg0.method1682(arg1.field8498.field8523, arg1.field8502, arg2.field8498.field8523, arg2.field8502, var3.field1792 == null ? null : var3.field1792.field1793, var3.field1786);
				}
			}
		} else if (var4.field1770 != null) {
			arg0.method1697(arg1.field8513.field8520, arg1.field8513.field8516, arg1.field8513.field8519, arg1.field8513.field8517, arg1.field8502, var3.frames[arg1.field8511], arg2.field8513.field8520, arg2.field8513.field8516, arg2.field8513.field8519, arg2.field8513.field8517, arg2.field8502, var4.frames[arg2.field8511], var3.field1792 == null ? null : var3.field1792.field1793, var3.field1786 | var4.field1786);
		} else if (var4.method2985()) {
			arg0.method1710(arg1.field8513.field8520, arg1.field8513.field8516, arg1.field8513.field8519, arg1.field8513.field8517, arg1.field8502, var3.frames[arg1.field8511], arg2.field8498.field8523, arg2.field8502, var3.field1792 == null ? null : var3.field1792.field1793, var3.field1786 | var4.field1786);
		}
	}

	@ObfuscatedName("aaq.b(I)Z")
	public final boolean method14375() {
		return this.field8507;
	}

	@ObfuscatedName("aaq.h(S)V")
	public final void method14422() {
		this.field8504 = 0;
	}

	@ObfuscatedName("aaq.a(I)V")
	public final void method14364() {
		this.method14389(0);
	}

	@ObfuscatedName("aaq.g(IB)V")
	public final void method14389(int arg0) {
		if (this.seqType.method2985()) {
			this.method14366(arg0);
			return;
		}
		this.field8511 = 0;
		this.field8506 = this.seqType.field1770.length > 1 ? 1 : -1;
		this.field8502 = 0;
		this.field8507 = false;
		this.field8503 = arg0;
		this.field8504 = 0;
		if (this.seqType != null & this.seqType.field1770 != null) {
			this.method14407(this.seqType, this.field8511);
			this.method14373();
		}
	}

	@ObfuscatedName("aaq.i(II)V")
	public final void method14366(int arg0) {
		this.field8507 = false;
		this.field8503 = arg0;
		this.field8504 = 0;
		this.field8502 = 0;
		if (this.seqType != null) {
			this.method14413(this.seqType, this.field8502);
		}
	}

	@ObfuscatedName("aaq.j(II)Z")
	public final boolean method14367(int arg0) {
		if (this.seqType == null || arg0 == 0) {
			return false;
		} else if (this.seqType.method2985()) {
			return this.method14356(arg0);
		} else {
			if (this.field8503 > 0) {
				if (this.field8503 > arg0) {
					this.field8503 -= arg0;
					return false;
				}
				arg0 -= this.field8503;
				this.field8503 = 0;
				this.method14407(this.seqType, this.field8511);
			}
			int var2 = this.field8502 + arg0;
			boolean var3 = this.seqType.field1772 | SeqType.field1775;
			if (var2 > 100 && this.seqType.replayoff > 0) {
				int var4 = this.seqType.field1770.length - this.seqType.replayoff;
				while (this.field8511 < var4 && var2 > this.seqType.frames[this.field8511]) {
					var2 -= this.seqType.frames[this.field8511];
					this.field8511++;
				}
				if (this.field8511 >= var4) {
					int var5 = 0;
					for (int var6 = var4; var6 < this.seqType.field1770.length; var6++) {
						var5 += this.seqType.frames[var6];
					}
					if (this.field8509 == 0) {
						this.field8504 += var2 / var5;
					}
					var2 %= var5;
				}
				this.field8506 = this.field8511 + 1;
				if (this.field8506 >= this.seqType.field1770.length) {
					if (this.seqType.replayoff == -1 && this.field8505) {
						this.field8506 = 0;
					} else {
						this.field8506 -= this.seqType.replayoff;
					}
					if (this.field8506 < 0 || this.field8506 >= this.seqType.field1770.length) {
						this.field8506 = 0;
					}
				}
				var3 = true;
			}
			while (var2 > this.seqType.frames[this.field8511]) {
				var3 = true;
				var2 -= this.seqType.frames[++this.field8511 - 1];
				if (this.field8511 >= this.seqType.field1770.length) {
					if (this.seqType.replayoff != -1 && this.field8509 != 2) {
						this.field8511 -= this.seqType.replayoff;
						if (this.field8509 == 0) {
							this.field8504++;
						}
					}
					if (this.field8504 >= this.seqType.replaycount || this.field8511 < 0 || this.field8511 >= this.seqType.field1770.length) {
						this.field8507 = true;
						break;
					}
				}
				this.method14407(this.seqType, this.field8511);
				this.field8506 = this.field8511 + 1;
				if (this.field8506 >= this.seqType.field1770.length) {
					if (this.seqType.replayoff == -1 && this.field8505) {
						this.field8506 = 0;
					} else {
						this.field8506 -= this.seqType.replayoff;
					}
					if (this.field8506 < 0 || this.field8506 >= this.seqType.field1770.length) {
						this.field8506 = 0;
					}
				}
			}
			this.field8502 = var2;
			if (var3) {
				this.method14373();
			}
			return var3;
		}
	}

	@ObfuscatedName("aaq.t(IB)Z")
	public boolean method14356(int arg0) {
		boolean var2 = false;
		KeyFrameSet var3 = this.field8498.field8523;
		if (var3 == null) {
			return false;
		}
		if (this.field8502 < 0) {
			this.field8502 = var3.method19382() + (int) (Math.random() * (double) var3.method19384());
		}
		int var4 = this.method14398();
		if (var4 > 0) {
			if (var4 > arg0) {
				this.method14357(var4 - arg0);
				return false;
			}
			arg0 -= var4;
			this.method14357(0);
		}
		boolean var5 = arg0 != 0;
		for (int var6 = 0; var6 < arg0; var6++) {
			this.method14413(this.seqType, this.field8502);
			this.field8502++;
			if (this.field8502 >= var3.method19383()) {
				if (this.seqType.replayoff == -1 || this.field8509 == 2) {
					this.field8507 = true;
				} else {
					int var7 = var3.method19384() - this.seqType.replayoff;
					this.field8502 = var7;
					if (this.field8509 == 0) {
						this.field8504++;
					}
					if (this.field8504 >= this.seqType.replaycount) {
						this.field8507 = true;
					}
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("aaq.ae(II)Z")
	public final boolean method14369(int arg0) {
		int var2;
		if (this.seqType == null | (var2 = arg0 - this.field8503) <= 0) {
			return false;
		} else if (this.seqType.method2985()) {
			return true;
		} else {
			return this.seqType.field1772 | this.field8502 + var2 > this.seqType.frames[this.field8511];
		}
	}

	@ObfuscatedName("aaq.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
	}

	@ObfuscatedName("aaq.ah(Lfg;II)V")
	public void method14413(SeqType arg0, int arg1) {
		this.method14407(arg0, arg1);
	}

	@ObfuscatedName("aaq.al(B)Z")
	public final boolean method14372() {
		if (this.seqType == null) {
			return false;
		}
		boolean var1 = false;
		boolean var2;
		if (this.seqType.method2985()) {
			var2 = this.field8498.method14443(field12490, this.seqType);
		} else {
			var2 = this.field8513.method14431(field12490, this.seqType, this.field8511, this.field8506, this.seqType.field1770);
			if (var2 && this.field8500 && this.seqType.field1771 != null) {
				this.field8512.method14431(field12490, this.seqType, this.field8511, this.field8506, this.seqType.field1771);
			}
		}
		return var2;
	}

	@ObfuscatedName("aaq.ac(I)V")
	public final void method14373() {
		if (this.seqType == null || this.seqType.method2985()) {
			this.field8498.method14442();
		} else {
			this.field8513.method14432();
			if (this.field8500) {
				this.field8512.method14432();
			}
		}
	}
}
