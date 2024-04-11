package rs2.client.scene.entities;

import com.jagex.game.MiniMenu;
import com.jagex.game.client.GameShell;
import com.jagex.game.client.MoveSpeed;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.config.npctype.NPCTypeCustomisation;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.graphics.camera.CameraTrackableType;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.math.*;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aqc")
public class NpcEntity extends PathingEntity {

	@ObfuscatedName("aqc.cn")
	public NPCType npcType;

	@ObfuscatedName("aqc.cv")
	public int field12074 = -1;

	@ObfuscatedName("aqc.cp")
	public int field12075 = -1;

	@ObfuscatedName("aqc.ca")
	public NPCTypeCustomisation field12076;

	@ObfuscatedName("aqc.cx")
	public static int field12077 = 1;

	@ObfuscatedName("aqc.cw")
	public static int field12078 = 1;

	@ObfuscatedName("aqc.ct")
	public int field12079 = -1;

	@ObfuscatedName("aqc.cf")
	public NPCHeadIconCustomisation field12080;

	@ObfuscatedName("aqc.co")
	public int vislevel;

	@ObfuscatedName("aqc.cr")
	public String name;

	@ObfuscatedName("aqc.cm")
	public int[] field12087 = new int[6];

	@ObfuscatedName("aqc.cq")
	public int[] field12084 = new int[6];

	@ObfuscatedName("aqc.ch")
	public int field12073;

	@ObfuscatedName("aqc.cb")
	public int field12086;

	@ObfuscatedName("aqc.cs")
	public int field12088;

	@ObfuscatedName("aqc.cy")
	public int field12089;

	@ObfuscatedName("aqc.cc")
	public int field12090;

	@ObfuscatedName("aqc.cz")
	public boolean field12085;

	public NpcEntity(Scene arg0) {
		super(arg0, Client.varNpcTypeList);
		this.method19184();
	}

	public NpcEntity(Scene arg0, int arg1) {
		super(arg0, arg1, Client.varNpcTypeList);
		this.method19184();
	}

	@ObfuscatedName("aqc.hq(B)V")
	public void method19155() {
		this.field10433 = 255;
		this.field10438 = Client.loopCycle;
	}

	@ObfuscatedName("aqc.hf(I)V")
	public void method19184() {
		this.field12073 = (int) (Math.random() * 4.0D) + 32;
		this.field12086 = (int) (Math.random() * 2.0D) + 3;
		this.field12088 = (int) (Math.random() * 3.0D) + 16;
		if (Client.preferences.textures.getValue() == 1) {
			this.field12089 = (int) (Math.random() * 6.0D);
		} else {
			this.field12089 = (int) (Math.random() * 12.0D);
		}
	}

	@ObfuscatedName("aqc.hr(Lif;I)V")
	public void method19156(NPCType arg0) {
		this.method19157(arg0, true, true, true);
	}

	@ObfuscatedName("aqc.hs(Lif;ZZZS)V")
	public void method19157(NPCType arg0, boolean arg1, boolean arg2, boolean arg3) {
		if (this.npcType != arg0 && MiniMenu.open && MiniMenu.method8494(this.localPlayerIndex)) {
			MiniMenu.close();
		}
		this.npcType = arg0;
		if (this.npcType != null) {
			if (arg1) {
				this.name = this.npcType.name;
			}
			if (arg2) {
				this.vislevel = this.npcType.vislevel;
			}
			if (arg3) {
				this.field12080 = null;
			}
		}
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
	}

	@ObfuscatedName("aqc.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		return null;
	}

	@ObfuscatedName("aqc.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		if (this.npcType == null || !this.isVisible(toolkit, 526336)) {
			return null;
		}
		Matrix4x3 var2 = this.method10533();
		ScaleRotTrans var3 = this.getTransform();
		Matrix4x3 var4 = toolkit.method2209();
		int var5 = this.field10395.method316();
		Tile var6 = this.scene.levelTiles[this.level][(int) var3.trans.x >> 9][(int) var3.trans.z >> 9];
		if (var6 == null || var6.groundDecoration == null) {
			this.field10408 = (int) ((float) this.field10408 - (float) this.field10408 / 10.0F);
		} else {
			int var7 = this.field10408 - var6.groundDecoration.field12448;
			this.field10408 = (int) ((float) this.field10408 - (float) var7 / 10.0F);
		}
		var4.setTo(var2);
		var4.translate(0.0F, (float) (-20 - this.field10408), 0.0F);
		BASType var8 = this.getBASType();
		NPCType var9 = this.npcType.multinpc == null ? this.npcType : this.npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
		boolean var10 = var9.clickbox != null;
		this.field10458 = false;
		PickableEntity var11 = null;
		if (Client.preferences.characterShadows.getValue() == 1 && var9.spotshadow && var8.field7346) {
			AnimationNode var12 = this.field10454.hasSeqType() && this.field10454.method14355() ? this.field10454 : null;
			EntityWalkAnimationNode var13 = this.field10432.hasSeqType() && (!this.field10432.field11877 || var12 == null) ? this.field10432 : null;
			short var14 = Client.graphicsDefaults.spotshadowtexture;
			byte var15 = Client.graphicsDefaults.spotshadowtexture_alpha;
			if (this.npcType.spotshadowtexture > -1) {
				var14 = this.npcType.spotshadowtexture;
				var15 = this.npcType.spotshadowtexture_alpha;
			}
			Model var16;
			if (var14 > -1 && Client.preferences.textures.getValue() == 1) {
				var16 = SpotShadowFactory.method3283(toolkit, var5, this.field10405, this.field12466, this.field10407, this.idk[0], var14, var15, var13 == null ? var12 : var13);
			} else {
				var16 = SpotShadowFactory.method5102(toolkit, var5, this.field10405, this.field12466, this.field10407, this.npcType.size, this.idk[0], this.npcType.spotshadowcolour_1 & 0xFFFF, this.npcType.spotshadowcolour_2 & 0xFFFF, this.npcType.spotshadowtrans_1 & 0xFF, this.npcType.spotshadowtrans_2 & 0xFF, var13 == null ? var12 : var13);
			}
			if (var16 != null) {
				var11 = PickableEntity.getPickableEntity(this.method19162());
				this.field10458 = true;
				toolkit.method2219(false);
				if (var10) {
					var16.draw(var4, null, 0);
				} else {
					if (this.entityBounds == null || this.entityBounds.length < this.idk.length + 1) {
						this.createEntityBounds(this.idk.length + 1);
					}
					var16.draw(var4, this.entityBounds[this.idk.length], 0);
				}
				toolkit.method2219(true);
			}
		}
		if (var10) {
			if (this.entityBounds == null || this.entityBounds.length > 1) {
				this.createEntityBounds(1);
			}
			toolkit.method2193(var4, this.entityBounds[0], var9.clickbox);
		} else if (this.entityBounds == null || this.entityBounds.length < this.idk.length) {
			this.createEntityBounds(this.idk.length);
		}
		if (var11 == null) {
			var11 = PickableEntity.getPickableEntity(this.method19162());
		}
		this.method16576(toolkit, this.idk, var4, false);
		for (int var17 = 0; var17 < this.idk.length; var17++) {
			if (this.idk[var17] != null) {
				if (this.npcType.antimacro) {
					this.idk[var17].method1745(this.field12073, this.field12086, this.field12088, this.field12089);
				}
				if (var10) {
					this.idk[var17].draw(var4, null, 0);
				} else {
					this.idk[var17].draw(var4, this.entityBounds[var17], 0);
				}
			} else if (!var10) {
				this.entityBounds[var17].field1686 = false;
			}
		}
		if (this.field10393 != null) {
			ParticleList var18 = this.field10393.method9965();
			toolkit.drawParticles(var18);
		}
		for (int var19 = 0; var19 < this.idk.length; var19++) {
			if (this.idk[var19] != null) {
				this.field10458 |= this.idk[var19].method1731();
			}
			this.idk[var19] = null;
		}
		this.field11715 = Client.sceneCycle;
		return var11;
	}

	@ObfuscatedName("aqc.hh(Ldh;II)Z")
	public boolean isVisible(Toolkit arg0, int arg1) {
		int var3 = arg1;
		BASType var4 = this.getBASType();
		AnimationNode var5 = this.field10454.hasSeqType() && !this.field10454.method14355() ? this.field10454 : null;
		EntityWalkAnimationNode var6 = this.field10432.hasSeqType() && (!this.field10432.field11877 || var5 == null) ? this.field10432 : null;
		int var7 = var4.field7342;
		int var8 = var4.field7343;
		if (var7 != 0 || var8 != 0 || var4.field7355 != 0 || var4.field7358 != 0) {
			arg1 |= 0x7;
		}
		boolean var9 = this.field10437 != 0 && Client.loopCycle >= this.field10446 && Client.loopCycle < this.field10464;
		if (var9) {
			arg1 |= 0x80000;
		}
		boolean var10 = false;
		if (this.field10433 != 0) {
			NPCType var11 = this.npcType.multinpc == null ? this.npcType : this.npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var11 == null || Client.loopCycle >= this.field10438 + var11.field2765) {
				this.field10433 = 0;
			} else {
				this.field10433 = 255 - (Client.loopCycle - this.field10438) * 255 / var11.field2765;
				var10 = true;
			}
		}
		if (var10) {
			arg1 |= 0x100;
		}
		int var12 = this.field10395.method316();
		Model var13 = this.idk[0] = this.npcType.getSequencedModel(arg0, arg1, Client.basTypeList, Client.localPlayerGameState, Client.localPlayerGameState, var5, var6, this.field10398, this.field10442, var12, this.field12076, this.getBASId(), false);
		if (var13 == null) {
			return false;
		}
		this.minY = var13.getMinY();
		this.height = var13.getHeight();
		var13.getRadius();
		this.method16505(var13);
		if (var7 == 0 && var8 == 0) {
			this.method16507(var12, this.size() << 9, this.size() << 9, 0, 0);
		} else {
			this.method16507(var12, var7, var8, var4.field7344, var4.field7323);
			if (this.field10405 != 0) {
				this.idk[0].rotateX(this.field10405);
			}
			if (this.field12466 != 0) {
				this.idk[0].rotateZ(this.field12466);
			}
			if (this.field10407 != 0) {
				this.idk[0].translate(0, this.field10407, 0);
			}
		}
		if (var9) {
			var13.method1745(this.field10434, this.field10435, this.field10436, this.field10437 & 0xFF);
		}
		if (var10) {
			var13.method1747((byte) this.field10433, null);
		}
		this.method16506(arg0, var4, var3, var7, var8, var12);
		return true;
	}

	@ObfuscatedName("aqc.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
		if (this.npcType == null || !this.field10449 && !this.isVisible(toolkit, 0)) {
			return;
		}
		Matrix4x3 var2 = toolkit.method2209();
		var2.setTo(this.method10533());
		var2.translate(0.0F, -5.0F, 0.0F);
		this.method16576(toolkit, this.idk, var2, this.field10449);
		for (int var3 = 0; var3 < this.idk.length; var3++) {
			this.idk[var3] = null;
		}
	}

	@ObfuscatedName("aqc.hp(Lzi;II)V")
	public final void step(CompassPoint arg0, int arg1) {
		int var3 = this.routeWaypointX[0];
		int var4 = this.routeWaypointZ[0];
		switch(arg0.index) {
			case 0:
				var4--;
				break;
			case 1:
				var3--;
				break;
			case 2:
				var3--;
				var4++;
				break;
			case 3:
				var3++;
				break;
			case 4:
				var3--;
				var4--;
				break;
			case 5:
				var3++;
				var4--;
				break;
			case 6:
				var3++;
				var4++;
				break;
			case 7:
				var4++;
		}
		if (this.field10454.hasSeqType() && this.field10454.getSeqType().field1782 == 1) {
			this.field10427 = null;
			this.field10454.method14362(-1);
		}
		for (int var5 = 0; var5 < this.spotAnims.length; var5++) {
			if (this.spotAnims[var5].field6657 != -1) {
				EffectAnimType var6 = (EffectAnimType) Client.effectAnimTypeList.list(this.spotAnims[var5].field6657);
				if (var6.field8261 && var6.anim != -1 && ((SeqType) Client.seqTypeList.list(var6.anim)).field1782 == 1) {
					this.spotAnims[var5].field6659.method14362(-1);
					this.spotAnims[var5].field6657 = -1;
				}
			}
		}
		if (this.routeLength < this.routeWaypointX.length - 1) {
			this.routeLength++;
		}
		for (int var7 = this.routeLength; var7 > 0; var7--) {
			this.routeWaypointX[var7] = this.routeWaypointX[var7 - 1];
			this.routeWaypointZ[var7] = this.routeWaypointZ[var7 - 1];
			this.routeSpeeds[var7] = this.routeSpeeds[var7 - 1];
		}
		this.routeWaypointX[0] = var3;
		this.routeWaypointZ[0] = var4;
		this.routeSpeeds[0] = (byte) arg1;
	}

	@ObfuscatedName("aqc.hy(IIIZIB)V")
	public void move(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		this.level = this.occludeLevel = (byte) arg0;
		if (Client.world.getSceneLevelTileFlags().isLinkBelow(arg1, arg2)) {
			this.occludeLevel++;
		}
		if (this.field10454.hasSeqType() && this.field10454.getSeqType().field1782 == 1) {
			this.field10427 = null;
			this.field10454.method14362(-1);
		}
		for (int var6 = 0; var6 < this.spotAnims.length; var6++) {
			if (this.spotAnims[var6].field6657 != -1) {
				EffectAnimType var7 = (EffectAnimType) Client.effectAnimTypeList.list(this.spotAnims[var6].field6657);
				if (var7.field8261 && var7.anim != -1 && ((SeqType) Client.seqTypeList.list(var7.anim)).field1782 == 1) {
					this.spotAnims[var6].field6659.method14362(-1);
					this.spotAnims[var6].field6657 = -1;
				}
			}
		}
		if (!arg3) {
			int var8 = arg1 - this.routeWaypointX[0];
			int var9 = arg2 - this.routeWaypointZ[0];
			if (var8 >= -8 && var8 <= 8 && var9 >= -8 && var9 <= 8) {
				if (this.routeLength < this.routeWaypointX.length - 1) {
					this.routeLength++;
				}
				for (int var10 = this.routeLength; var10 > 0; var10--) {
					this.routeWaypointX[var10] = this.routeWaypointX[var10 - 1];
					this.routeWaypointZ[var10] = this.routeWaypointZ[var10 - 1];
					this.routeSpeeds[var10] = this.routeSpeeds[var10 - 1];
				}
				this.routeWaypointX[0] = arg1;
				this.routeWaypointZ[0] = arg2;
				this.routeSpeeds[0] = MoveSpeed.WALK.serialID;
				return;
			}
		}
		this.routeLength = 0;
		this.field10396 = 0;
		this.seqTrigger = 0;
		this.routeWaypointX[0] = arg1;
		this.routeWaypointZ[0] = arg2;
		Vector3 var11 = Vector3.create(this.getTransform().trans);
		var11.x = (this.routeWaypointX[0] << 9) + (arg4 << 8);
		var11.z = (this.routeWaypointZ[0] << 9) + (arg4 << 8);
		this.method10531(var11);
		var11.release();
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
	}

	@ObfuscatedName("aqc.he(I)Z")
	public final boolean exists() {
		return this.npcType != null;
	}

	@ObfuscatedName("aqc.bj(S)I")
	public int getBASId() {
		if (this.field12079 != -1) {
			return this.field12079;
		}
		if (this.npcType.multinpc != null) {
			NPCType var1 = this.npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var1 != null && var1.bas != -1) {
				return var1.bas;
			}
		}
		return this.npcType.bas;
	}

	@ObfuscatedName("aqc.bs(B)I")
	public int getCoverMarker() {
		if (this.npcType.multinpc != null) {
			NPCType var1 = this.npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var1 != null && var1.covermarker != -1) {
				return var1.covermarker;
			}
		}
		return this.npcType.covermarker;
	}

	@ObfuscatedName("aqc.bo(I)I")
	public int height() {
		if (this.npcType.multinpc != null) {
			NPCType var1 = this.npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var1 != null && var1.overlayheight != -1) {
				return var1.overlayheight;
			}
		}
		return this.npcType.overlayheight == -1 ? super.height() : this.npcType.overlayheight;
	}

	@ObfuscatedName("aqc.hn(I)Z")
	public boolean method19162() {
		return this.field12085 || this.npcType.active;
	}

	@ObfuscatedName("aqc.gp(I)I")
	public int getPickSizeShift() {
		return this.npcType == null ? 0 : this.npcType.picksizeshift;
	}

	@ObfuscatedName("aqc.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		if (this.npcType == null) {
			return false;
		} else if (this.npcType.clickbox != null) {
			return toolkit.pick(arg1, arg2, this.method10533(), this.npcType.clickbox);
		} else if (this.isVisible(toolkit, 131072)) {
			Matrix4x3 var4 = this.method10533();
			boolean var5 = false;
			for (int var6 = 0; var6 < this.idk.length; var6++) {
				if (this.idk[var6] != null && this.idk[var6].field1298) {
					boolean var10000;
					label52: {
						label51: {
							if (this.npcType.picksizeshift <= 0) {
								if (this.npcType.picksize == -1) {
									if (this.npcType.size != 1) {
										break label51;
									}
								} else if (this.npcType.picksize != 1) {
									break label51;
								}
							}
							var10000 = true;
							break label52;
						}
						var10000 = false;
					}
					boolean var7 = var10000;
					boolean var8 = this.idk[var6].method1725(arg1, arg2, var4, var7, this.npcType.picksizeshift);
					if (var8) {
						var5 = true;
						break;
					}
				}
			}
			for (int var9 = 0; var9 < this.idk.length; var9++) {
				this.idk[var9] = null;
			}
			return var5;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aqc.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aqc.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqc.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqc.hi(IB)I")
	public int method19163(int arg0) {
		return this.field12087[arg0];
	}

	@ObfuscatedName("aqc.hw(IB)I")
	public int method19164(int arg0) {
		return this.field12084[arg0];
	}

	@ObfuscatedName("aqc.ht(IIIB)V")
	public void method19165(int arg0, int arg1, int arg2) {
		this.field12087[arg0] = arg1;
		this.field12084[arg0] = arg2;
	}

	@ObfuscatedName("aqc.cg(I)Z")
	public boolean showChat() {
		return Client.graphicsDefaults.npcShouldDisplayChat;
	}

	@ObfuscatedName("aqc.ce(I)Lsu;")
	public EntityChatLine getChatLine() {
		return this.currentChatLine != null && this.currentChatLine.text == null ? null : this.currentChatLine;
	}

	@ObfuscatedName("aqc.hc(Ljava/lang/String;III)V")
	public void method19166(String arg0, int arg1, int arg2) {
		int var4 = GameShell.getLogicRate() * Client.graphicsDefaults.npcChatTimeout;
		this.setChatLine(arg0, arg1, arg2, var4);
	}

	@ObfuscatedName("aqc.cx(I)I")
	public int targeted() {
		return this.localPlayerIndex + 1;
	}

	@ObfuscatedName("aqc.e(I)Ljl;")
	public CameraTrackableType getCameraTrackableType() {
		return CameraTrackableType.NPC;
	}

	@ObfuscatedName("aqc.n(I)I")
	public int getIndex() {
		return this.localPlayerIndex;
	}

	@ObfuscatedName("aqc.m(B)Lakt;")
	public CoordFine getTrackableCoord() {
		CoordGrid var1 = Client.world.getBase();
		return CoordFine.method258(this.level, (int) this.getTransform().trans.x + var1.x * 512, -((int) this.getTransform().trans.y), (int) this.getTransform().trans.z + var1.z * 512);
	}

	@ObfuscatedName("aqc.k(I)Lov;")
	public Quaternion method4668() {
		Quaternion var1 = Quaternion.create();
		var1.setToRotation(Trig1.radians(this.field10395.field528), 0.0F, 0.0F);
		return var1;
	}

	@ObfuscatedName("aqc.f(B)Lox;")
	public Vector3 createVector3() {
		return Vector3.create();
	}

	@ObfuscatedName("aqc.gc(I)Z")
	public boolean method18359() {
		return this.npcType.multinpc == null || this.npcType.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState) != null;
	}
}
