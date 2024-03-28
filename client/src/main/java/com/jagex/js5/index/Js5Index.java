package com.jagex.js5.index;

import com.jagex.core.datastruct.IntTreeMap;
import com.jagex.core.io.Packet;
import com.jagex.encryption.Whirlpool;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("pl")
public class Js5Index {

	@ObfuscatedName("pl.n")
	public int crc;

	@ObfuscatedName("pl.m")
	public byte[] whirlpool;

	@ObfuscatedName("pl.k")
	public int indexversion;

	@ObfuscatedName("pl.f")
	public int length;

	@ObfuscatedName("pl.w")
	public int[] groupIds;

	@ObfuscatedName("pl.l")
	public int[] field4390;

	@ObfuscatedName("pl.u")
	public IntTreeMap field4391;

	@ObfuscatedName("pl.z")
	public int capacity;

	@ObfuscatedName("pl.p")
	public int[] crcs;

	@ObfuscatedName("pl.d")
	public int[] field4400;

	@ObfuscatedName("pl.c")
	public byte[][] whirlpools;

	@ObfuscatedName("pl.r")
	public int[] groupVersions;

	@ObfuscatedName("pl.v")
	public int[] field4397;

	@ObfuscatedName("pl.o")
	public int[] field4388;

	@ObfuscatedName("pl.s")
	public int[] groupSizes;

	@ObfuscatedName("pl.y")
	public int[][] field4386;

	@ObfuscatedName("pl.q")
	public int[][] field4401;

	@ObfuscatedName("pl.x")
	public IntTreeMap[] field4402;

	@ObfuscatedName("pl.b")
	public int[] groupCapacities;

	public Js5Index(byte[] bytes, int crc, byte[] whirlpool) {
		this.crc = Packet.getcrc(bytes, bytes.length);
		if (this.crc != crc) {
			throw new RuntimeException("Invalid CRC - expected:" + crc + " got:" + this.crc);
		}

		if (whirlpool != null) {
			if (whirlpool.length != 64) {
				throw new RuntimeException("Invalid expectedwhirlpool - must be 64 bytes long");
			}

			this.whirlpool = Whirlpool.method18308(bytes, 0, bytes.length);
			for (int var4 = 0; var4 < 64; var4++) {
				if (this.whirlpool[var4] != whirlpool[var4]) {
	                // throw new RuntimeException("Invalid Whirlpool - expected:" + hexString(arg2) + " got:" + hexString(this.whirlpool));
					throw new RuntimeException("Invalid Whirlpool");
				}
			}
		}

		this.method6849(bytes);
	}

	@ObfuscatedName("pl.e([BI)V")
	public void method6849(byte[] bytes) {
		Packet buf = new Packet(Js5.uncompress(bytes));
		int protocol = buf.g1();
		if (protocol < 5 || protocol > 7) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + protocol);
		}
		if (protocol >= 6) {
			this.indexversion = buf.g4s();
		} else {
			this.indexversion = 0;
		}
		int info = buf.g1();
		boolean var5 = (info & 0x1) != 0;
		boolean isWhirlpool = (info & 0x2) != 0;
		boolean var7 = (info & 0x4) != 0;
		boolean var8 = (info & 0x8) != 0;
		if (protocol >= 7) {
			this.length = buf.gSmart2or4();
		} else {
			this.length = buf.g2();
		}
		int var9 = 0;
		int var10 = -1;
		this.groupIds = new int[this.length];
		if (protocol >= 7) {
			for (int index = 0; index < this.length; index++) {
				this.groupIds[index] = var9 += buf.gSmart2or4();
				if (this.groupIds[index] > var10) {
					var10 = this.groupIds[index];
				}
			}
		} else {
			for (int index = 0; index < this.length; index++) {
				this.groupIds[index] = var9 += buf.g2();
				if (this.groupIds[index] > var10) {
					var10 = this.groupIds[index];
				}
			}
		}
		this.capacity = var10 + 1;
		this.crcs = new int[this.capacity];
		if (var8) {
			this.field4400 = new int[this.capacity];
		}
		if (isWhirlpool) {
			this.whirlpools = new byte[this.capacity][];
		}
		this.groupVersions = new int[this.capacity];
		this.groupSizes = new int[this.capacity];
		this.field4386 = new int[this.capacity][];
		this.groupCapacities = new int[this.capacity];
		if (var5) {
			this.field4390 = new int[this.capacity];
			for (int var13 = 0; var13 < this.capacity; var13++) {
				this.field4390[var13] = -1;
			}
			for (int var14 = 0; var14 < this.length; var14++) {
				this.field4390[this.groupIds[var14]] = buf.g4s();
			}
			this.field4391 = new IntTreeMap(this.field4390);
		}
		for (int index = 0; index < this.length; index++) {
			this.crcs[this.groupIds[index]] = buf.g4s();
		}
		if (var8) {
			for (int var16 = 0; var16 < this.length; var16++) {
				this.field4400[var16] = buf.g4s();
			}
		}
		if (isWhirlpool) {
			for (int var17 = 0; var17 < this.length; var17++) {
				byte[] var18 = new byte[64];
				buf.gdata(var18, 0, 64);
				this.whirlpools[this.groupIds[var17]] = var18;
			}
		}
		if (var7) {
			this.field4397 = new int[this.capacity];
			this.field4388 = new int[this.capacity];
			for (int var19 = 0; var19 < this.length; var19++) {
				this.field4397[this.groupIds[var19]] = buf.g4s();
				this.field4388[this.groupIds[var19]] = buf.g4s();
			}
		}
		for (int var20 = 0; var20 < this.length; var20++) {
			this.groupVersions[this.groupIds[var20]] = buf.g4s();
		}
		if (protocol >= 7) {
			for (int var21 = 0; var21 < this.length; var21++) {
				this.groupSizes[this.groupIds[var21]] = buf.gSmart2or4();
			}
			for (int var22 = 0; var22 < this.length; var22++) {
				int var23 = this.groupIds[var22];
				int var24 = this.groupSizes[var23];
				int var25 = 0;
				int var26 = -1;
				this.field4386[var23] = new int[var24];
				for (int var27 = 0; var27 < var24; var27++) {
					int var28 = this.field4386[var23][var27] = var25 += buf.gSmart2or4();
					if (var28 > var26) {
						var26 = var28;
					}
				}
				this.groupCapacities[var23] = var26 + 1;
				if (var26 + 1 == var24) {
					this.field4386[var23] = null;
				}
			}
		} else {
			for (int var29 = 0; var29 < this.length; var29++) {
				this.groupSizes[this.groupIds[var29]] = buf.g2();
			}
			for (int var30 = 0; var30 < this.length; var30++) {
				int var31 = this.groupIds[var30];
				int var32 = this.groupSizes[var31];
				int var33 = 0;
				int var34 = -1;
				this.field4386[var31] = new int[var32];
				for (int var35 = 0; var35 < var32; var35++) {
					int var36 = this.field4386[var31][var35] = var33 += buf.g2();
					if (var36 > var34) {
						var34 = var36;
					}
				}
				this.groupCapacities[var31] = var34 + 1;
				if (var34 + 1 == var32) {
					this.field4386[var31] = null;
				}
			}
		}
		if (!var5) {
			return;
		}
		this.field4401 = new int[var10 + 1][];
		this.field4402 = new IntTreeMap[var10 + 1];
		for (int var37 = 0; var37 < this.length; var37++) {
			int var38 = this.groupIds[var37];
			int var39 = this.groupSizes[var38];
			this.field4401[var38] = new int[this.groupCapacities[var38]];
			for (int var40 = 0; var40 < this.groupCapacities[var38]; var40++) {
				this.field4401[var38][var40] = -1;
			}
			for (int var41 = 0; var41 < var39; var41++) {
				int var42;
				if (this.field4386[var38] == null) {
					var42 = var41;
				} else {
					var42 = this.field4386[var38][var41];
				}
				this.field4401[var38][var42] = buf.g4s();
			}
			this.field4402[var38] = new IntTreeMap(this.field4401[var38]);
		}
	}
}
