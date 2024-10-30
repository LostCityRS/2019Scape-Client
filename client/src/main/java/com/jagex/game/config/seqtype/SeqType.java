package com.jagex.game.config.seqtype;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.seqgrouptype.SeqGroupType;
import com.jagex.game.world.entity.ObjectNode;
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
	public int length = 0;

	@ObfuscatedName("fg.u")
	public int field1784 = -1;

	@ObfuscatedName("fg.z")
	public SeqGroupType field1792;

	@ObfuscatedName("fg.p")
	public int field1787 = -1;

	@ObfuscatedName("fg.d")
	public int[][] sound;

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
	public HashTable params;

	@ObfuscatedName("fg.t")
	public int field1783 = -1;

	public SeqType(int arg0, SeqTypeFactory arg1) {
		this.id = arg0;
		this.factory = arg1;
	}

	@ObfuscatedName("fg.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("fg.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g2();
			this.frames = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.frames[var4] = arg0.g2();
			}
			this.field1770 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field1770[var5] = arg0.g2();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field1770[var6] += arg0.g2() << 16;
			}
		} else if (arg1 == 2) {
			this.replayoff = arg0.g2();
		} else if (arg1 == 5) {
			this.priority = arg0.g1();
		} else if (arg1 == 6) {
			this.mainhand = arg0.g2();
		} else if (arg1 == 7) {
			this.offhand = arg0.g2();
		} else if (arg1 == 8) {
			this.replaycount = arg0.g1();
		} else if (arg1 == 9) {
			this.field1767 = arg0.g1();
		} else if (arg1 == 10) {
			this.field1782 = arg0.g1();
		} else if (arg1 == 11) {
			this.field1768 = arg0.g1();
		} else if (arg1 == 12 || arg1 == 112) {
			int var21;
			if (arg1 == 12) {
				var21 = arg0.g1();
			} else {
				var21 = arg0.g2();
			}
			this.field1771 = new int[var21];
			for (int var22 = 0; var22 < var21; var22++) {
				this.field1771[var22] = arg0.g2();
			}
			for (int var23 = 0; var23 < var21; var23++) {
				this.field1771[var23] += arg0.g2() << 16;
			}
		} else if (arg1 == 13) {
			int var7 = arg0.g2();
			this.sound = new int[var7][];
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.g1();
				if (var9 > 0) {
					this.sound[var8] = new int[var9];
					this.sound[var8][0] = arg0.g3();
					for (int var10 = 1; var10 < var9; var10++) {
						this.sound[var8][var10] = arg0.g2();
					}
				}
			}
		} else if (arg1 == 14) {
			this.field1786 = true;
		} else if (arg1 == 15) {
			this.field1772 = true;
		} else if (arg1 != 16 && arg1 != 18) {
			if (arg1 == 19 || arg1 == 119) {
				if (this.field1788 == null) {
					this.field1788 = new int[this.sound.length];
					for (int var19 = 0; var19 < this.sound.length; var19++) {
						this.field1788[var19] = 255;
					}
				}
				int var20;
				if (arg1 == 19) {
					var20 = arg0.g1();
				} else {
					var20 = arg0.g2();
				}
				this.field1788[var20] = arg0.g1();
			} else if (arg1 == 20 || arg1 == 120) {
				if (this.field1789 == null || this.field1790 == null) {
					this.field1789 = new int[this.sound.length];
					this.field1790 = new int[this.sound.length];
					for (int var17 = 0; var17 < this.sound.length; var17++) {
						this.field1789[var17] = 256;
						this.field1790[var17] = 256;
					}
				}
				int var18;
				if (arg1 == 20) {
					var18 = arg0.g1();
				} else {
					var18 = arg0.g2();
				}
				this.field1789[var18] = arg0.g2();
				this.field1790[var18] = arg0.g2();
			} else if (arg1 == 22) {
				this.field1783 = arg0.g1();
			} else if (arg1 == 23) {
				arg0.g2();
			} else if (arg1 == 24) {
				this.field1787 = arg0.g2();
				if (this.factory != null) {
					this.field1792 = (SeqGroupType) this.factory.configTypeList.list(this.field1787);
				}
			} else if (arg1 == 25) {
				this.field1784 = arg0.g2();
			} else if (arg1 == 249) {
				int var11 = arg0.g1();
				if (this.params == null) {
					int var12 = IntMath.bitceil(var11);
					this.params = new HashTable(var12);
				}
				for (int var13 = 0; var13 < var11; var13++) {
					boolean var14 = arg0.g1() == 1;
					int var15 = arg0.g3();
					Node var16;
					if (var14) {
						var16 = new ObjectNode(arg0.gjstr());
					} else {
						var16 = new IntNode(arg0.g4s());
					}
					this.params.put(var16, (long) var15);
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
			this.length = 0;
			for (int var1 = 0; var1 < this.frames.length; var1++) {
				this.length += this.frames[var1];
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
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("fg.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String method2989(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("fg.c(I)Z")
	public boolean method2985() {
		return this.field1784 != -1;
	}
}
