package com.jagex.game.config.meltype;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MapAlignmentX;
import com.jagex.game.client.MapAlignmentY;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("hs")
public class MapElementType implements ConfigType {

	@ObfuscatedName("hs.e")
	public final MapElementTypeFactory field2368;

	@ObfuscatedName("hs.n")
	public final ConfigTypeList field2412;

	@ObfuscatedName("hs.m")
	public final int field2367;

	@ObfuscatedName("hs.k")
	public int sprite = -1;

	@ObfuscatedName("hs.f")
	public int field2403 = -1;

	@ObfuscatedName("hs.w")
	public String text;

	@ObfuscatedName("hs.l")
	public int field2366;

	@ObfuscatedName("hs.u")
	public int field2372 = -1;

	@ObfuscatedName("hs.z")
	public int textSize = 0;

	@ObfuscatedName("hs.r")
	public int field2377;

	@ObfuscatedName("hs.v")
	public int field2378;

	@ObfuscatedName("hs.o")
	public boolean field2379 = true;

	@ObfuscatedName("hs.s")
	public boolean field2404 = false;

	@ObfuscatedName("hs.y")
	public String[] field2381 = new String[5];

	@ObfuscatedName("hs.q")
	public String field2382;

	@ObfuscatedName("hs.x")
	public int field2383 = -1;

	@ObfuscatedName("hs.b")
	public int field2386 = -1;

	@ObfuscatedName("hs.h")
	public int field2385 = -1;

	@ObfuscatedName("hs.a")
	public int field2371 = -1;

	@ObfuscatedName("hs.g")
	public int field2387 = -1;

	@ObfuscatedName("hs.i")
	public int field2380;

	@ObfuscatedName("hs.j")
	public int field2389;

	@ObfuscatedName("hs.t")
	public int field2390 = -1;

	@ObfuscatedName("hs.ae")
	public int field2391 = -1;

	@ObfuscatedName("hs.ag")
	public int[] field2392 = null;

	@ObfuscatedName("hs.ah")
	public int[] field2393;

	@ObfuscatedName("hs.al")
	public int field2373 = Integer.MAX_VALUE;

	@ObfuscatedName("hs.ac")
	public int field2395 = Integer.MAX_VALUE;

	@ObfuscatedName("hs.ai")
	public int field2396 = Integer.MIN_VALUE;

	@ObfuscatedName("hs.aw")
	public int field2397 = Integer.MIN_VALUE;

	@ObfuscatedName("hs.as")
	public int field2398;

	@ObfuscatedName("hs.at")
	public int field2399 = -1;

	@ObfuscatedName("hs.ad")
	public int field2369 = -1;

	@ObfuscatedName("hs.am")
	public int field2401 = -1;

	@ObfuscatedName("hs.au")
	public int field2410;

	@ObfuscatedName("hs.ar")
	public int field2394;

	@ObfuscatedName("hs.ap")
	public MapAlignmentX field2365 = MapAlignmentX.field2417;

	@ObfuscatedName("hs.aq")
	public MapAlignmentY field2405 = MapAlignmentY.field2424;

	@ObfuscatedName("hs.ax")
	public int[] field2406;

	@ObfuscatedName("hs.av")
	public byte[] field2407;

	@ObfuscatedName("hs.ao")
	public int field2408 = -1;

	@ObfuscatedName("hs.aj")
	public boolean field2409 = true;

	@ObfuscatedName("hs.ay")
	public int category = -1;

	@ObfuscatedName("hs.ab")
	public HashTable params;

	@ObfuscatedName("hs.az")
	public int field2384 = -1;

	public MapElementType(int arg0, ConfigTypeList arg1, MapElementTypeFactory arg2) {
		this.field2367 = arg0;
		this.field2412 = arg1;
		this.field2368 = arg2;
	}

	@ObfuscatedName("hs.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method4038(buf, var2);
		}
	}

	@ObfuscatedName("hs.u(Lalw;II)V")
	public void method4038(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.sprite = arg0.gSmart2or4null();
		} else if (arg1 == 2) {
			this.field2403 = arg0.gSmart2or4null();
		} else if (arg1 == 3) {
			this.text = arg0.gjstr();
		} else if (arg1 == 4) {
			this.field2366 = arg0.g3();
		} else if (arg1 == 5) {
			this.field2372 = arg0.g3();
		} else if (arg1 == 6) {
			this.textSize = arg0.g1();
		} else if (arg1 == 7) {
			int var3 = arg0.g1();
			if ((var3 & 0x1) == 0) {
				this.field2379 = false;
			}
			if ((var3 & 0x2) == 2) {
				this.field2404 = true;
			}
		} else if (arg1 == 8) {
			arg0.g1();
		} else if (arg1 == 9) {
			this.field2371 = arg0.g2();
			if (this.field2371 == 65535) {
				this.field2371 = -1;
			}
			this.field2387 = arg0.g2();
			if (this.field2387 == 65535) {
				this.field2387 = -1;
			}
			this.field2386 = arg0.g4s();
			this.field2385 = arg0.g4s();
		} else if (arg1 >= 10 && arg1 <= 14) {
			this.field2381[arg1 - 10] = arg0.gjstr();
		} else if (arg1 == 15) {
			int var4 = arg0.g1();
			this.field2393 = new int[var4 * 2];
			for (int var5 = 0; var5 < var4 * 2; var5++) {
				this.field2393[var5] = arg0.g2s();
			}
			this.field2398 = arg0.g4s();
			int var6 = arg0.g1();
			this.field2406 = new int[var6];
			for (int var7 = 0; var7 < this.field2406.length; var7++) {
				this.field2406[var7] = arg0.g4s();
			}
			this.field2407 = new byte[var4];
			for (int var8 = 0; var8 < var4; var8++) {
				this.field2407[var8] = arg0.g1b();
			}
		} else if (arg1 == 16) {
			this.field2409 = false;
		} else if (arg1 == 17) {
			this.field2382 = arg0.gjstr();
		} else if (arg1 == 18) {
			this.field2383 = arg0.gSmart2or4null();
		} else if (arg1 == 19) {
			this.category = arg0.g2();
		} else if (arg1 == 20) {
			this.field2390 = arg0.g2();
			if (this.field2390 == 65535) {
				this.field2390 = -1;
			}
			this.field2391 = arg0.g2();
			if (this.field2391 == 65535) {
				this.field2391 = -1;
			}
			this.field2380 = arg0.g4s();
			this.field2389 = arg0.g4s();
		} else if (arg1 == 21) {
			this.field2378 = arg0.g4s();
		} else if (arg1 == 22) {
			this.field2377 = arg0.g4s();
		} else if (arg1 == 23) {
			this.field2399 = arg0.g1();
			this.field2369 = arg0.g1();
			this.field2401 = arg0.g1();
		} else if (arg1 == 24) {
			this.field2410 = arg0.g2s();
			this.field2394 = arg0.g2s();
		} else if (arg1 == 25) {
			this.field2384 = arg0.gSmart2or4null();
		} else if (arg1 == 26 || arg1 == 27) {
			this.field2371 = arg0.g2();
			if (this.field2371 == 65535) {
				this.field2371 = -1;
			}
			this.field2387 = arg0.g2();
			if (this.field2387 == 65535) {
				this.field2387 = -1;
			}
			int var15 = -1;
			if (arg1 == 27) {
				var15 = arg0.g2();
				if (var15 == 65535) {
					var15 = -1;
				}
			}
			int var16 = arg0.g1();
			this.field2392 = new int[var16 + 2];
			for (int var17 = 0; var17 <= var16; var17++) {
				this.field2392[var17] = arg0.g2();
				if (this.field2392[var17] == 65535) {
					this.field2392[var17] = -1;
				}
			}
			this.field2392[var16 + 1] = var15;
		} else if (arg1 == 28) {
			this.field2408 = arg0.g1();
		} else if (arg1 == 29) {
			this.field2365 = (MapAlignmentX) SerializableEnums.decode(MapAlignmentX.values(), arg0.g1());
		} else if (arg1 == 30) {
			this.field2405 = (MapAlignmentY) SerializableEnums.decode(MapAlignmentY.values(), arg0.g1());
		} else if (arg1 == 249) {
			int var9 = arg0.g1();
			if (this.params == null) {
				int var10 = IntMath.bitceil(var9);
				this.params = new HashTable(var10);
			}
			for (int var11 = 0; var11 < var9; var11++) {
				boolean var12 = arg0.g1() == 1;
				int var13 = arg0.g3();
				Node var14;
				if (var12) {
					var14 = new ObjectNode(arg0.gjstr());
				} else {
					var14 = new IntNode(arg0.g4s());
				}
				this.params.put(var14, (long) var13);
			}
		}
	}

	@ObfuscatedName("hs.n(I)V")
	public void postDecode() {
		if (this.field2393 == null) {
			return;
		}
		for (int var1 = 0; var1 < this.field2393.length; var1 += 2) {
			if (this.field2393[var1] < this.field2373) {
				this.field2373 = this.field2393[var1];
			} else if (this.field2393[var1] > this.field2396) {
				this.field2396 = this.field2393[var1];
			}
			if (this.field2393[var1 + 1] < this.field2395) {
				this.field2395 = this.field2393[var1 + 1];
			} else if (this.field2393[var1 + 1] > this.field2397) {
				this.field2397 = this.field2393[var1 + 1];
			}
		}
	}

	@ObfuscatedName("hs.z(Lem;Lep;I)Z")
	public boolean method4030(VariableTypeProvider arg0, VarIntDomain arg1) {
		boolean var3 = true;
		int var5;
		if (this.field2387 == -1) {
			if (this.field2371 == -1) {
				return true;
			}
			VarBitType var6 = arg0.getVarBitType(this.field2371);
			var5 = arg1.getVarBitValue(var6);
		} else {
			VarType var4 = arg0.getVarType(VarDomainType.PLAYER, this.field2387);
			var5 = arg1.getVarValueInt(var4);
		}
		if (this.field2392 != null) {
			if (var5 < 0 || var5 >= this.field2392.length - 1) {
				int var7 = this.field2392[this.field2392.length - 1];
				if (var7 == -1) {
					return false;
				}
				if (this.field2386 != -1 && this.field2385 != -1 && (var5 < this.field2386 || var5 > this.field2385)) {
					return false;
				}
			}
			if (this.field2392[var5] == -1) {
				return false;
			}
		} else if (var5 < this.field2386 || var5 > this.field2385) {
			return false;
		}
		boolean var8 = false;
		int var10;
		if (this.field2391 == -1) {
			if (this.field2390 == -1) {
				return true;
			}
			VarBitType var11 = arg0.getVarBitType(this.field2390);
			var10 = arg1.getVarBitValue(var11);
		} else {
			VarType var9 = arg0.getVarType(VarDomainType.PLAYER, this.field2391);
			var10 = arg1.getVarValueInt(var9);
		}
		if (var10 >= this.field2380 && var10 <= this.field2389) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hs.p(Ldh;ZI)Lcm;")
	public Sprite method4025(Toolkit arg0, boolean arg1) {
		int var3 = arg1 ? this.field2403 : this.sprite;
		int var4 = var3 | arg0.field1595 << 29;
		Sprite var5 = (Sprite) this.field2368.elementCache.get((long) var4);
		if (var5 != null) {
			return var5;
		} else if (this.field2368.configClient.loadFile(var3)) {
			SpriteData var6 = SpriteDataProvider.method1609(this.field2368.configClient, var3, 0);
			if (var6 != null) {
				var5 = arg0.createSprite(var6, true);
				this.field2368.elementCache.put(var5, (long) var4);
			}
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hs.d(Ldh;B)Lcm;")
	public Sprite method4026(Toolkit arg0) {
		int var2 = this.field2384 | arg0.field1595 << 29;
		Sprite var3 = (Sprite) this.field2368.elementCache.get((long) var2);
		if (var3 != null) {
			return var3;
		} else if (this.field2368.configClient.loadFile(this.field2384)) {
			SpriteData var4 = SpriteDataProvider.method1609(this.field2368.configClient, this.field2384, 0);
			if (var4 != null) {
				var3 = arg0.createSprite(var4, true);
				this.field2368.elementCache.put(var3, (long) var2);
			}
			return var3;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hs.c(Ldh;I)Lcm;")
	public Sprite method4027(Toolkit arg0) {
		Sprite var2 = (Sprite) this.field2368.elementCache.get((long) (this.field2383 | 0x20000 | arg0.field1595 << 29));
		if (var2 != null) {
			return var2;
		}
		this.field2368.configClient.loadFile(this.field2383);
		SpriteData var3 = SpriteDataProvider.method1609(this.field2368.configClient, this.field2383, 0);
		if (var3 != null) {
			var2 = arg0.createSprite(var3, true);
			this.field2368.elementCache.put(var2, (long) (this.field2383 | 0x20000 | arg0.field1595 << 29));
		}
		return var2;
	}

	@ObfuscatedName("hs.r(III)I")
	public int method4028(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("hs.v(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4029(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("hs.o(Lem;Lep;S)Lhs;")
	public final MapElementType method4024(VariableTypeProvider arg0, VarIntDomain arg1) {
		int var3 = -1;
		if (this.field2371 != -1) {
			VarBitType var4 = arg0.getVarBitType(this.field2371);
			if (var4 != null) {
				var3 = arg1.getVarBitValue(var4);
			}
		} else if (this.field2387 != -1) {
			VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.field2387);
			if (var5 != null) {
				var3 = arg1.getVarValueInt(var5);
			}
		}
		if (var3 >= 0 && var3 < this.field2392.length - 1) {
			return this.field2392[var3] == -1 ? null : (MapElementType) this.field2412.list(this.field2392[var3]);
		} else {
			int var6 = this.field2392[this.field2392.length - 1];
			return var6 == -1 ? null : (MapElementType) this.field2412.list(var6);
		}
	}
}
