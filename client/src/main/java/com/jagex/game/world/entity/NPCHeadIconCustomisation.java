package com.jagex.game.world.entity;

import com.jagex.game.config.npctype.NPCType;
import deob.ObfuscatedName;

@ObfuscatedName("id")
public class NPCHeadIconCustomisation {

	@ObfuscatedName("id.e")
	public int[] field2682;

	@ObfuscatedName("id.n")
	public short[] field2681;

	public NPCHeadIconCustomisation(int[] arg0, short[] arg1) {
		this.field2682 = arg0;
		this.field2681 = arg1;
	}

	public NPCHeadIconCustomisation(NPCType arg0) {
		this.field2682 = new int[8];
		this.field2681 = new short[8];
		int var2 = 0;
		if (arg0.headicon_groupid != null && arg0.headicon_id != null) {
			var2 = arg0.headicon_groupid.length;
			System.arraycopy(arg0.headicon_groupid, 0, this.field2682, 0, var2);
			System.arraycopy(arg0.headicon_id, 0, this.field2681, 0, var2);
		}
		for (int var3 = var2; var3 < 8; var3++) {
			this.field2682[var3] = -1;
			this.field2681[var3] = -1;
		}
	}
}
