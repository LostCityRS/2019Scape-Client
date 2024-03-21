package com.jagex.game.cutscene;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.scene.ChangeLocationRequest;
import com.jagex.game.world.entity.LocShape;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ef")
public class CutsceneLocation {

	@ObfuscatedName("ef.e")
	public final int field1735;

	@ObfuscatedName("ef.n")
	public final LocShape field1736;

	@ObfuscatedName("ef.m")
	public int field1740;

	@ObfuscatedName("ef.k")
	public int field1737;

	@ObfuscatedName("ef.f")
	public int field1739;

	@ObfuscatedName("ef.w")
	public int field1738;

	public CutsceneLocation(Packet arg0) {
		this.field1735 = arg0.gSmart2or4null();
		this.field1736 = (LocShape) SerializableEnums.decode(LocShape.values(), arg0.g1());
	}

	@ObfuscatedName("ef.e(IIIIB)V")
	public void method2847(int arg0, int arg1, int arg2, int arg3) {
		ChangeLocationRequest.method4653(arg0, arg1, arg2, this.field1736.layer, this.field1735, this.field1736.id, arg3, null);
		this.field1740 = arg0;
		this.field1737 = arg1;
		this.field1739 = arg2;
		this.field1738 = arg3;
	}

	@ObfuscatedName("ef.n(B)V")
	public void method2848() {
		ChangeLocationRequest.method4653(this.field1740, this.field1737, this.field1739, this.field1736.layer, -1, this.field1736.id, this.field1738, null);
	}

	@ObfuscatedName("ef.m(I)Z")
	public boolean method2849() {
		if (this.field1735 < 0) {
			return true;
		}
		LocType var1 = (LocType) Client.locTypeList.list(this.field1735);
		boolean var2 = var1.method9473(this.field1736.id);
		int[] var3 = var1.getAnim();
		if (var3 != null) {
			int[] var4 = var3;
			for (int var5 = 0; var5 < var4.length; var5++) {
				int var6 = var4[var5];
				var2 &= ((SeqType) Client.seqTypeList.list(var6)).method2991();
			}
		}
		return var2;
	}
}
