package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.world.entity.PlayerEntity;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.NpcEntity;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("ea")
public final class CutsceneEntity {

	@ObfuscatedName("ea.n")
	public final int field1741;

	@ObfuscatedName("ea.m")
	public final int field1743;

	@ObfuscatedName("ea.k")
	public boolean field1744 = false;

	@ObfuscatedName("ea.f")
	public NpcEntity field1745 = null;

	@ObfuscatedName("ea.w")
	public PlayerEntity field1742 = null;

	@ObfuscatedName("ea.l")
	public int[] field1747;

	public CutsceneEntity(Packet arg0, int arg1) {
		this.field1741 = arg1;
		int var3 = arg0.g1();
		switch(var3) {
			case 0:
				this.field1743 = arg0.gSmart2or4null();
				break;
			case 1:
				this.field1743 = -1;
				break;
			default:
				this.field1743 = -1;
		}
		arg0.gjstr();
	}

	@ObfuscatedName("ea.e(IIIII)V")
	public void method2867(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field1744) {
			this.field1744 = true;
			if (this.field1743 >= 0) {
				this.field1745 = new NpcEntity(Client.world.getScene(), 25);
				this.field1745.field10406 = this.field1741;
				this.field1745.field10440 = Client.field10903;
				this.field1745.method19156((NPCType) Client.field7961.list(this.field1743));
				this.field1745.method16502(this.field1745.field12083.size);
				this.field1745.field10444 = this.field1745.field12083.field2731 << 3;
				this.field1745.field10404 = ++CutsceneManager.field1715 - 1;
			} else {
				this.field1742 = new PlayerEntity(Client.world.getScene(), 25);
				this.field1742.method19129(Client.field8729);
				this.field1742.field10406 = this.field1741;
				this.field1742.field10440 = Client.field10903;
				this.field1742.field10404 = ++CutsceneManager.field1715 - 1;
			}
		}
		if (this.field1743 >= 0) {
			this.field1745.method19159(arg2, arg0, arg1, true, this.field1745.method16546());
			this.field1745.method16491(arg3, true);
		} else {
			this.field1742.field11717 = this.field1742.field11714 = (byte) arg2;
			this.field1742.method19118(arg0, arg1);
			this.field1742.method16491(arg3, true);
		}
	}

	@ObfuscatedName("ea.n(B)V")
	public void method2868() {
		this.field1745 = null;
		this.field1742 = null;
		this.field1744 = false;
	}

	@ObfuscatedName("ea.m(IIII)V")
	public void method2866(int arg0, int arg1, int arg2) {
		if (this.field1745 == null) {
			this.field1742.field11717 = this.field1742.field11714 = (byte) arg0;
			this.field1742.method19118(arg1, arg2);
		} else {
			this.field1745.method19159(arg0, arg1, arg2, true, this.field1745.method16546());
		}
	}

	@ObfuscatedName("ea.k(I)Lahm;")
	public PathingEntity method2870() {
		return this.field1745 == null ? this.field1742 : this.field1745;
	}

	@ObfuscatedName("ea.f(I)Z")
	public boolean method2871() {
		if (this.field1743 < 0) {
			return true;
		}
		NPCType var1 = (NPCType) Client.field7961.list(this.field1743);
		boolean var2 = var1.method4545();
		if (this.field1747 == null) {
			BASType var3 = (BASType) Client.field11742.list(var1.field2762);
			this.field1747 = var3.method9293();
		}
		int[] var4 = this.field1747;
		for (int var5 = 0; var5 < var4.length; var5++) {
			int var6 = var4[var5];
			var2 &= ((SeqType) Client.field8797.list(var6)).method2991();
		}
		return var2;
	}
}
