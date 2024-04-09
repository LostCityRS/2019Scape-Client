package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Pair;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.cutscene.CutsceneManager;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("sp")
public class DynamicLoc {

	@ObfuscatedName("sp.e")
	public LocTypeList field6681;

	@ObfuscatedName("sp.n")
	public byte field6663;

	@ObfuscatedName("sp.m")
	public GraphEntity field6672;

	@ObfuscatedName("sp.k")
	public int field6665;

	@ObfuscatedName("sp.f")
	public int field6666;

	@ObfuscatedName("sp.w")
	public int field6667;

	@ObfuscatedName("sp.l")
	public boolean field6668 = false;

	@ObfuscatedName("sp.u")
	public Model field6669;

	@ObfuscatedName("sp.z")
	public AnimationNode field6664;

	@ObfuscatedName("sp.p")
	public AnimationNode field6671;

	@ObfuscatedName("sp.d")
	public int field6662;

	@ObfuscatedName("sp.c")
	public int field6673 = -1;

	@ObfuscatedName("sp.r")
	public int field6674 = 0;

	@ObfuscatedName("sp.v")
	public boolean field6675 = false;

	@ObfuscatedName("sp.o")
	public boolean field6676;

	@ObfuscatedName("sp.s")
	public HardShadow field6677;

	@ObfuscatedName("sp.y")
	public boolean field6670 = false;

	@ObfuscatedName("sp.q")
	public boolean[] field6679;

	@ObfuscatedName("sp.x")
	public ParticleSystem field6680;

	@ObfuscatedName("sp.b")
	public LocTypeCustomisation field6678;

	public DynamicLoc(Toolkit arg0, LocTypeList arg1, LocType arg2, int arg3, int arg4, int arg5, GraphEntity arg6, boolean arg7, int arg8, int arg9) {
		this.field6681 = arg1;
		this.field6665 = arg2.id;
		this.field6666 = arg3;
		this.field6667 = arg4;
		this.field6672 = arg6;
		this.field6675 = arg8 != -1;
		this.field6663 = (byte) arg5;
		this.field6668 = arg7;
		this.field6676 = arg0.supportsHardShadows() && arg2.hardshadow && !this.field6668;
		this.field6664 = new EntityAnimationNode(arg6, false);
		this.method8244(false, arg8, 1, this.field6675 ? arg9 : 0);
	}

	@ObfuscatedName("sp.e(III)V")
	public void method8260(int arg0, int arg1) {
		this.field6671 = null;
		if (arg1 > 0) {
			this.field6671 = new EntityAnimationNode(this.field6672, false);
			this.field6671.method14353(arg0, arg1, 1, false);
		} else {
			this.field6675 = true;
			this.method8244(false, arg0, 1, 0);
		}
	}

	@ObfuscatedName("sp.n(I)I")
	public int method8262() {
		return this.field6674;
	}

	@ObfuscatedName("sp.m(Lvp;I)V")
	public void method8265(LocTypeCustomisation arg0) {
		this.field6678 = arg0;
		this.field6669 = null;
	}

	@ObfuscatedName("sp.k(I)I")
	public int method8236() {
		return -this.method8262();
	}

	@ObfuscatedName("sp.f(S)Lvd;")
	public LocType method8237() {
		return (LocType) this.field6681.list(this.field6665);
	}

	@ObfuscatedName("sp.w(Ldh;IZZI)Ldo;")
	public final Model method8238(Toolkit arg0, int arg1, boolean arg2, boolean arg3) {
		LocType var5 = (LocType) this.field6681.list(this.field6665);
		if (var5.multiloc != null) {
			var5 = var5.getMultiLoc(Client.localPlayerGameState, Client.sceneState == 0 ? CutsceneManager.field1723 : Client.localPlayerGameState);
		}
		if (var5 == null) {
			this.method8242(arg0);
			this.field6673 = -1;
			return null;
		}
		if (!this.field6675 && this.field6673 != var5.id) {
			this.method8244(true, -1, 0, 0);
			this.field6670 = false;
			this.field6669 = null;
		}
		this.method8243(this.field6672);
		if (arg3) {
			arg3 &= this.field6676 & !this.field6670 & Client.preferences.sceneryShadows.getValue() != 0;
		}
		if (arg2 && !arg3) {
			this.field6673 = var5.id;
			return null;
		}
		Vector3 var6 = this.field6672.getTransform().trans;
		Scene var7 = Client.world.getScene();
		if (arg3) {
			var7.method8814(this.field6677, this.field6663, (int) var6.x, (int) var6.z, this.field6679);
			this.field6670 = false;
		}
		FloorModel var8 = var7.field6913[this.field6663];
		FloorModel var9;
		if (this.field6668) {
			var9 = var7.field6915[0];
		} else {
			var9 = this.field6663 < 3 ? var7.field6913[this.field6663 + 1] : null;
		}
		Model var10 = null;
		if (this.field6664.hasSeqType()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			var10 = var5.method9470(arg0, arg1, this.field6666 == 11 ? 10 : this.field6666, this.field6666 == 11 ? this.field6667 + 4 : this.field6667, var8, var9, (int) var6.x, var8.getFineHeight((int) var6.x, (int) var6.z), (int) var6.z, this.field6664, this.field6678);
			if (var10 == null) {
				this.field6679 = null;
				this.field6677 = null;
				this.field6674 = 0;
			} else {
				if (arg3) {
					if (this.field6679 == null) {
						this.field6679 = new boolean[4];
					}
					this.field6677 = var10.method1726(this.field6677);
					var7.method8750(this.field6677, this.field6663, (int) var6.x, (int) var6.z, this.field6679);
					this.field6670 = true;
				}
				this.field6674 = var10.getMinY();
				var10.getRadius();
			}
			this.field6669 = null;
		} else if (this.field6669 != null && (this.field6669.method1691() & arg1) == arg1 && this.field6673 == var5.id) {
			var10 = this.field6669;
		} else {
			if (this.field6669 != null) {
				arg1 |= this.field6669.method1691();
			}
			Pair var11 = var5.method9475(arg0, arg1, this.field6666 == 11 ? 10 : this.field6666, this.field6666 == 11 ? this.field6667 + 4 : this.field6667, var8, var9, (int) var6.x, var8.getFineHeight((int) var6.x, (int) var6.z), (int) var6.z, arg3, this.field6678);
			if (var11 == null) {
				this.field6679 = null;
				this.field6677 = null;
				this.field6669 = null;
				this.field6674 = 0;
			} else {
				this.field6669 = var10 = (Model) var11.first;
				if (arg3) {
					this.field6677 = (HardShadow) var11.second;
					this.field6679 = null;
					var7.method8750(this.field6677, this.field6663, (int) var6.x, (int) var6.z, null);
					this.field6670 = true;
				}
				this.field6674 = var10.getMinY();
				var10.getRadius();
			}
		}
		this.field6673 = var5.id;
		return var10;
	}

	@ObfuscatedName("sp.l(Ldh;Ldo;Lou;IIIIZB)V")
	public void method8239(Toolkit arg0, Model arg1, Matrix4x3 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		ModelParticleEmitter[] var9 = arg1.method1750();
		ModelParticleEffector[] var10 = arg1.method1765();
		if ((this.field6680 == null || this.field6680.field7804) && (var9 != null || var10 != null)) {
			LocType var11 = (LocType) this.field6681.list(this.field6665);
			if (var11.multiloc != null) {
				var11 = var11.getMultiLoc(Client.localPlayerGameState, Client.sceneState == 0 ? CutsceneManager.field1723 : Client.localPlayerGameState);
			}
			if (var11 != null) {
				this.field6680 = ParticleSystem.method9962(Client.loopCycle, true);
			}
		}
		if (this.field6680 == null) {
			return;
		}
		arg1.method1689(arg2);
		if (arg7) {
			this.field6680.method9936(arg0, (long) Client.loopCycle, var9, var10, false);
		} else {
			this.field6680.method9935((long) Client.loopCycle);
		}
		this.field6680.method9963(this.field6663, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("sp.u(B)Z")
	public boolean method8240() {
		return this.field6676;
	}

	@ObfuscatedName("sp.z(Ldh;I)V")
	public void method8241(Toolkit arg0) {
		this.method8238(arg0, 262144, true, true);
	}

	@ObfuscatedName("sp.p(Ldh;B)V")
	public void method8242(Toolkit arg0) {
		if (this.field6677 != null) {
			Vector3 var2 = this.field6672.getTransform().trans;
			Client.world.getScene().method8814(this.field6677, this.field6663, (int) var2.x, (int) var2.z, this.field6679);
			this.field6679 = null;
			this.field6677 = null;
		}
	}

	@ObfuscatedName("sp.d(Lalh;I)V")
	public void method8243(GraphEntity arg0) {
		if (this.field6671 != null && this.field6671.hasSeqType()) {
			this.field6671.method14367(Client.loopCycle - this.field6662);
			if (this.field6671.method14375()) {
				this.field6671.method14362(-1);
			}
			if (!this.field6671.method14355()) {
				this.field6664 = this.field6671;
				this.field6675 = true;
				this.field6662 = Client.loopCycle;
				return;
			}
		}
		if (!this.field6664.hasSeqType()) {
			this.method8244(false, -1, 0, 0);
		} else if (this.field6664.method14367(Client.loopCycle - this.field6662)) {
			if (Client.preferences.sceneryShadows.getValue() == 2) {
				this.field6670 = false;
			}
			if (this.field6664.method14375()) {
				this.field6664.method14362(-1);
				this.field6675 = false;
				this.method8244(false, -1, 0, 0);
			}
		}
		this.field6662 = Client.loopCycle;
	}

	@ObfuscatedName("sp.c(ZIIII)V")
	public void method8244(boolean arg0, int arg1, int arg2, int arg3) {
		int var5 = arg1;
		boolean var6 = false;
		if (arg1 == -1) {
			LocType var7 = (LocType) this.field6681.list(this.field6665);
			LocType var8 = var7;
			if (var7.multiloc != null) {
				var7 = var7.getMultiLoc(Client.localPlayerGameState, Client.sceneState == 0 ? CutsceneManager.field1723 : Client.localPlayerGameState);
			}
			if (var7 == null) {
				return;
			}
			if (var7 == var8) {
				var8 = null;
			}
			if (var7.method9504()) {
				if (!var7.field7479 || Client.preferences.animDetail.getValue() == 1) {
					if (arg0 && this.field6664.hasSeqType() && var7.hasAnim(this.field6664.getSeqTypeId())) {
						return;
					}
					if (this.field6673 != var7.id) {
						var6 = var7.randomanimframe;
					}
					var5 = var7.method9483();
					if (var7.method9514()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (var8 != null && var8.method9504() && (!var8.field7479 || Client.preferences.animDetail.getValue() == 1)) {
				if (arg0 && this.field6664.hasSeqType() && var8.hasAnim(this.field6664.getSeqTypeId())) {
					return;
				}
				if (this.field6673 != var7.id) {
					var6 = var8.randomanimframe;
				}
				var5 = var8.method9483();
				if (var8.method9514()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (var5 == -1) {
			this.field6664.method14351(-1, false);
		} else {
			this.field6664.method14353(var5, arg3, arg2, var6);
			this.field6662 = Client.loopCycle;
			this.field6670 = false;
			this.field6669 = null;
		}
	}
}
