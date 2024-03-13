package com.jagex.game.config.seqtype;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.seqgrouptype.SeqGroupType;
import com.jagex.game.world.entity.ObjectWrapper;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("fg")
public class SeqType implements ConfigType {

	@ObfuscatedName("fg.e")
	public static boolean field1775 = false;

	@ObfuscatedName("fg.n")
	public SeqTypeFactory factory;

	@ObfuscatedName("fg.m")
	public int id;

	@ObfuscatedName("fg.k")
	public int[] field1770;

	@ObfuscatedName("fg.f")
	public int[] field1771;

	@ObfuscatedName("fg.w")
	public int[] frames;

	@ObfuscatedName("fg.l")
	public int field1776 = 0;

	@ObfuscatedName("fg.u")
	public int field1784 = -1;

	@ObfuscatedName("fg.z")
	public SeqGroupType field1792;

	@ObfuscatedName("fg.p")
	public int field1787 = -1;

	@ObfuscatedName("fg.d")
	public int[][] field1777;

	@ObfuscatedName("fg.c")
	public int replayoff = -1;

	@ObfuscatedName("fg.r")
	public int priority = 5;

	@ObfuscatedName("fg.v")
	public int mainhand = -1;

	@ObfuscatedName("fg.o")
	public int offhand = -1;

	@ObfuscatedName("fg.s")
	public int replaycount = 99;

	@ObfuscatedName("fg.y")
	public int field1767 = -1;

	@ObfuscatedName("fg.q")
	public int field1782 = -1;

	@ObfuscatedName("fg.x")
	public int field1768 = 2;

	@ObfuscatedName("fg.b")
	public boolean field1786 = false;

	@ObfuscatedName("fg.h")
	public boolean field1772 = false;

	@ObfuscatedName("fg.a")
	public int[] field1788;

	@ObfuscatedName("fg.g")
	public int[] field1789;

	@ObfuscatedName("fg.i")
	public int[] field1790;

	@ObfuscatedName("fg.j")
	public IterableMap params;

	@ObfuscatedName("fg.t")
	public int field1783 = -1;

	public SeqType(int id, SeqTypeFactory factory) {
		this.id = id;
		this.factory = factory;
	}

	@ObfuscatedName("fg.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("fg.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			int frameCount = buf.g2();
			this.frames = new int[frameCount];
			for (int var4 = 0; var4 < frameCount; var4++) {
				this.frames[var4] = buf.g2();
			}
			this.field1770 = new int[frameCount];
			for (int var5 = 0; var5 < frameCount; var5++) {
				this.field1770[var5] = buf.g2();
			}
			for (int var6 = 0; var6 < frameCount; var6++) {
				this.field1770[var6] += buf.g2() << 16;
			}
		} else if (code == 2) {
			this.replayoff = buf.g2();
		} else if (code == 5) {
			this.priority = buf.g1();
		} else if (code == 6) {
			this.mainhand = buf.g2();
		} else if (code == 7) {
			this.offhand = buf.g2();
		} else if (code == 8) {
			this.replaycount = buf.g1();
		} else if (code == 9) {
			this.field1767 = buf.g1();
		} else if (code == 10) {
			this.field1782 = buf.g1();
		} else if (code == 11) {
			this.field1768 = buf.g1();
		} else if (code == 12 || code == 112) {
			int var21;
			if (code == 12) {
				var21 = buf.g1();
			} else {
				var21 = buf.g2();
			}
			this.field1771 = new int[var21];
			for (int var22 = 0; var22 < var21; var22++) {
				this.field1771[var22] = buf.g2();
			}
			for (int var23 = 0; var23 < var21; var23++) {
				this.field1771[var23] += buf.g2() << 16;
			}
		} else if (code == 13) {
			int var7 = buf.g2();
			this.field1777 = new int[var7][];
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = buf.g1();
				if (var9 > 0) {
					this.field1777[var8] = new int[var9];
					this.field1777[var8][0] = buf.g3();
					for (int var10 = 1; var10 < var9; var10++) {
						this.field1777[var8][var10] = buf.g2();
					}
				}
			}
		} else if (code == 14) {
			this.field1786 = true;
		} else if (code == 15) {
			this.field1772 = true;
		} else if (code != 16 && code != 18) {
			if (code == 19 || code == 119) {
				if (this.field1788 == null) {
					this.field1788 = new int[this.field1777.length];
					for (int var19 = 0; var19 < this.field1777.length; var19++) {
						this.field1788[var19] = 255;
					}
				}
				int var20;
				if (code == 19) {
					var20 = buf.g1();
				} else {
					var20 = buf.g2();
				}
				this.field1788[var20] = buf.g1();
			} else if (code == 20 || code == 120) {
				if (this.field1789 == null || this.field1790 == null) {
					this.field1789 = new int[this.field1777.length];
					this.field1790 = new int[this.field1777.length];
					for (int var17 = 0; var17 < this.field1777.length; var17++) {
						this.field1789[var17] = 256;
						this.field1790[var17] = 256;
					}
				}
				int var18;
				if (code == 20) {
					var18 = buf.g1();
				} else {
					var18 = buf.g2();
				}
				this.field1789[var18] = buf.g2();
				this.field1790[var18] = buf.g2();
			} else if (code == 22) {
				this.field1783 = buf.g1();
			} else if (code == 23) {
				buf.g2();
			} else if (code == 24) {
				this.field1787 = buf.g2();
				if (this.factory != null) {
					this.field1792 = (SeqGroupType) this.factory.configTypeList.list(this.field1787);
				}
			} else if (code == 25) {
				this.field1784 = buf.g2();
			} else if (code == 249) {
				int var11 = buf.g1();
				if (this.params == null) {
					int var12 = IntMath.bitceil(var11);
					this.params = new IterableMap(var12);
				}
				for (int var13 = 0; var13 < var11; var13++) {
					boolean var14 = buf.g1() == 1;
					int var15 = buf.g3();
					Node var16;
					if (var14) {
						var16 = new ObjectWrapper(buf.gjstr());
					} else {
						var16 = new IntWrapper(buf.g4s());
					}
					this.params.method14501(var16, (long) var15);
				}
			}
		}
	}

	@ObfuscatedName("fg.n(I)V")
	public void postDecode() {
		if (this.field1767 == -1) {
			if (this.field1792 == null || this.field1792.field1793 == null) {
				this.field1767 = 0;
			} else {
				this.field1767 = 2;
			}
		}
		if (this.field1782 == -1) {
			if (this.field1792 == null || this.field1792.field1793 == null) {
				this.field1782 = 0;
			} else {
				this.field1782 = 2;
			}
		}
		if (this.frames != null) {
			this.field1776 = 0;
			for (int var1 = 0; var1 < this.frames.length; var1++) {
				this.field1776 += this.frames[var1];
			}
		}
	}

	@ObfuscatedName("fg.z(B)Z")
	public boolean method2991() {
		if (this.field1770 == null && this.field1784 == -1) {
			return true;
		}
		boolean var1 = true;
		if (this.field1770 != null) {
			int[] var2 = this.field1770;
			for (int var3 = 0; var3 < var2.length; var3++) {
				int var4 = var2[var3];
				if (this.factory.method3020(var4 >>> 16) == null) {
					var1 = false;
				}
			}
		} else if (this.factory.method3010(this.field1784) == null) {
			var1 = false;
		}
		return var1;
	}

	@ObfuscatedName("fg.p(IIB)I")
	public int method2981(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.params.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("fg.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String method2989(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.params.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("fg.c(I)Z")
	public boolean method2985() {
		return this.field1784 != -1;
	}
}
