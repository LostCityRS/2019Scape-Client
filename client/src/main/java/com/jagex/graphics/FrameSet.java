package com.jagex.graphics;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("arr")
public class FrameSet extends SecondaryNode {

	@ObfuscatedName("arr.l")
	public static Js5 field12325;

	@ObfuscatedName("arr.u")
    public static Js5 field12326;

	@ObfuscatedName("arr.z")
	public int field12324;

	@ObfuscatedName("arr.p")
	public byte[][] field12323;

	@ObfuscatedName("arr.d")
	public AnimFrame[] field12327;

	@ObfuscatedName("vw.e(Lpy;Lpy;II)V")
	public static void method9393(Js5 arg0, Js5 arg1, int arg2) {
		field12325 = arg0;
		field12326 = arg1;
	}

	public FrameSet(int arg0) {
		this.field12324 = arg0;
	}

	@ObfuscatedName("arr.n(I)Z")
	public boolean method19410() {
		if (this.field12327 != null) {
			return true;
		}
		if (this.field12323 == null) {
			Js5 var1 = field12325;
			synchronized (field12325) {
				if (!field12325.isGroupReady(this.field12324)) {
					return false;
				}
				int[] var2 = field12325.getFileIds(this.field12324);
				this.field12323 = new byte[var2.length][];
				for (int var3 = 0; var3 < var2.length; var3++) {
					this.field12323[var3] = field12325.getfile(this.field12324, var2[var3]);
				}
			}
		}
		boolean var5 = true;
		for (int var6 = 0; var6 < this.field12323.length; var6++) {
			byte[] var7 = this.field12323[var6];
			Packet var8 = new Packet(var7);
			var8.pos = 1;
			int var9 = var8.g2();
			Js5 var10 = field12326;
			synchronized (field12326) {
				var5 &= field12326.loadFile(var9);
			}
		}
		if (!var5) {
			return false;
		}
		LinkList var12 = new LinkList();
		Js5 var13 = field12325;
		int[] var15;
		synchronized (field12325) {
			int var14 = field12325.getGroupCapacity(this.field12324);
			this.field12327 = new AnimFrame[var14];
			var15 = field12325.getFileIds(this.field12324);
		}
		for (int var17 = 0; var17 < var15.length; var17++) {
			byte[] var18 = this.field12323[var17];
			Packet var19 = new Packet(var18);
			var19.pos = 1;
			int var20 = var19.g2();
			AnimBase var21 = null;
			for (AnimBase var22 = (AnimBase) var12.head(); var22 != null; var22 = (AnimBase) var12.next()) {
				if (var22.field11312 == var20) {
					var21 = var22;
					break;
				}
			}
			if (var21 == null) {
				Js5 var23 = field12326;
				synchronized (field12326) {
					var21 = new AnimBase(var20, field12326.fetchFile(var20));
				}
				var12.addTail(var21);
			}
			this.field12327[var15[var17]] = new AnimFrame(var18, var21);
		}
		this.field12323 = null;
		return true;
	}

	@ObfuscatedName("arr.m(II)Z")
	public boolean method19411(int arg0) {
		return this.field12327[arg0].field1636;
	}

	@ObfuscatedName("arr.k(II)Z")
	public boolean method19412(int arg0) {
		return this.field12327[arg0].field1637;
	}

	@ObfuscatedName("arr.f(II)Z")
	public boolean method19409(int arg0) {
		return this.field12327[arg0].field1638;
	}
}
