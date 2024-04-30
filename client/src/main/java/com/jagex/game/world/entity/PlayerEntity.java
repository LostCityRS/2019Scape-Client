package com.jagex.game.world.entity;

import com.jagex.core.constants.ModeWhere;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.JagException;
import com.jagex.core.utils.TextUtil;
import com.jagex.game.client.GameShell;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.config.enumtype.EnumType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.script.CommunityPartnerType;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.graphics.AnimationNode;
import com.jagex.game.HintArrow;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.camera.CameraTrackableType;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.math.*;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.NpcEntity;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("aqk")
public class PlayerEntity extends PathingEntity {

	@ObfuscatedName("aqk.cn")
	public String name;

	@ObfuscatedName("aqk.cv")
	public String nameUnfiltered;

	@ObfuscatedName("aqk.cp")
	public int titleId;

	@ObfuscatedName("aqk.ca")
	public String title;

	@ObfuscatedName("aqk.cx")
	public byte gender = 0;

	@ObfuscatedName("aqk.cw")
	public PlayerModel model;

	@ObfuscatedName("aqk.ct")
	public int[] headIconsIds = new int[8];

	@ObfuscatedName("aqk.cf")
	public int[] headIconsGroups = new int[8];

	@ObfuscatedName("aqk.co")
	public int combatLevel = 0;

	@ObfuscatedName("aqk.cr")
	public int field12072 = 0;

	@ObfuscatedName("aqk.cm")
	public int field12058 = -1;

	@ObfuscatedName("aqk.cq")
	public int field12059 = 0;

	@ObfuscatedName("aqk.ch")
	public int field12056 = -1;

	@ObfuscatedName("aqk.cb")
	public boolean field12053 = false;

	@ObfuscatedName("aqk.cs")
	public int field12060 = 0;

	@ObfuscatedName("aqk.cy")
	public int bgsound_player = -1;

	@ObfuscatedName("aqk.cc")
	public int bgsound_crawl_player = -1;

	@ObfuscatedName("aqk.cz")
	public int bgsound_walk_player = -1;

	@ObfuscatedName("aqk.ck")
	public int bgsound_run_player = -1;

	@ObfuscatedName("aqk.cj")
	public int bgsound_range = 0;

	@ObfuscatedName("aqk.cd")
	public int bgsound_volume = 255;

	@ObfuscatedName("aqk.dd")
	public int bas;

	@ObfuscatedName("aqk.dr")
	public CommunityPartnerType field12070 = CommunityPartnerType.field1950;

	@ObfuscatedName("aqk.da")
	public PlayerVisibility visibility = PlayerVisibility.VISIBLE;

	@ObfuscatedName("aqk.dt")
	public boolean field12048 = false;

	public PlayerEntity(Scene arg0) {
		super(arg0, Client.varPlayerTypeList);
		this.method19112();
	}

	public PlayerEntity(Scene arg0, int arg1) {
		super(arg0, arg1, Client.varPlayerTypeList);
		this.method19112();
	}

	@ObfuscatedName("aqk.hq(Lalw;BI)V")
	public void setIdentityKit(Packet buf, byte gender) {
		this.gender = gender;
		int var3 = -1;
		this.field12060 = 0;
		int[] var4 = new int[Client.wearposDefaults.field7766.length];
		ObjTypeCustomisation[] var5 = new ObjTypeCustomisation[Client.wearposDefaults.field7766.length];
		ObjType[] var6 = new ObjType[Client.wearposDefaults.field7766.length];
		for (int var7 = 0; var7 < Client.wearposDefaults.field7766.length; var7++) {
			if (Client.wearposDefaults.field7766[var7] != 1) {
				int var8 = buf.g1();
				if (var8 == 0) {
					var4[var7] = 0;
				} else {
					int var9 = buf.g1();
					int var10 = (var8 << 8) + var9;
					if (var7 == 0 && var10 == 65535) {
						var3 = buf.gSmart2or4null();
						this.field12060 = buf.g1();
						break;
					}
					if (var10 >= 2048) {
						int var11 = var10 - 2048;
						var4[var7] = var11 | 0x40000000;
						var6[var7] = (ObjType) Client.objTypeList.list(var11);
						int var12 = var6[var7].team;
						if (var12 != 0) {
							this.field12060 = var12;
						}
					} else {
						var4[var7] = var10 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (var3 == -1) {
			int var13 = buf.g2();
			int var14 = 0;
			for (int var15 = 0; var15 < Client.wearposDefaults.field7766.length; var15++) {
				if (Client.wearposDefaults.field7766[var15] == 0) {
					if ((var13 & 0x1 << var14) != 0) {
						var5[var15] = ObjTypeCustomisation.method1061(var6[var15], buf);
					}
					var14++;
				}
			}
		}
		int[] var16 = new int[10];
		for (int var17 = 0; var17 < 10; var17++) {
			int var18 = buf.g1();
			if (PlayerModel.field1434.length < 1 || var18 < 0 || var18 >= PlayerModel.field1434[var17][0].length) {
				var18 = 0;
			}
			var16[var17] = var18;
		}
		int[] var19 = new int[10];
		for (int var20 = 0; var20 < 10; var20++) {
			int var21 = buf.g1();
			if (PlayerModel.field9259.length < 1 || var21 < 0 || var21 >= PlayerModel.field9259[var20][0].length) {
				var21 = 0;
			}
			var19[var20] = var21;
		}
		this.bas = buf.g2();
		if (this.model == null) {
			this.model = new PlayerModel();
		}
		int var22 = this.model.field7892;
		int[] var23 = this.model.field7894;
		this.model.setAppearance(this.getBASId(), var4, var5, var16, var19, this.gender == 1, var3);
		if (var3 != var22) {
			Vector3 var24 = Vector3.create(this.getTransform().trans);
			var24.x = (this.routeWaypointX[0] << 9) + (this.size() << 8);
			var24.z = (this.routeWaypointZ[0] << 9) + (this.size() << 8);
			this.method10531(var24);
			var24.release();
		}
		if (Client.currentPlayerUid == this.localPlayerIndex && var23 != null) {
			for (int var25 = 0; var25 < var16.length; var25++) {
				if (var16[var25] != var23[var25]) {
					Client.objTypeList.resetIconCache();
					break;
				}
			}
		}
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
		if (!this.field10432.hasSeqType() || !this.field10432.field11877) {
			return;
		}
		BASType var26 = this.getBASType();
		if (!var26.method9290(this.field10432.getSeqTypeId())) {
			this.field10432.method14362(-1);
			this.field10432.field11877 = false;
		}
	}

	@ObfuscatedName("aqk.hf(Lalw;I)V")
	public final void getAppearance(Packet buf) {
		buf.pos = 0;
		int info = buf.g1();
		byte gender = (byte) (info & 0x1);
		boolean var4 = (info & 0x4) != 0;
		int size = super.size();
		this.setSize((info >> 3 & 0x7) + 1);
		boolean showTitle = (info & 0x40) != 0;
		Vector3 var7 = Vector3.create(this.getTransform().trans);
		var7.x += this.size() - size << 8;
		var7.z += this.size() - size << 8;
		this.method10531(var7);
		var7.release();
		if (showTitle) {
			this.titleId = buf.gSmart1or2();
			int titleEnumId = gender == 0 ? Client.titleDefaults.field7671 : Client.titleDefaults.field7670;
			this.title = ((EnumType) Client.enumTypeList.list(titleEnumId)).getValueString(this.titleId);
		} else {
			this.titleId = -1;
			this.title = null;
		}
		this.visibility = (PlayerVisibility) SerializableEnums.decode(PlayerVisibility.values(), buf.g1b());
		if (Client.modewhere == ModeWhere.LIVE && Client.staffModLevel >= 2) {
			this.visibility = PlayerVisibility.VISIBLE;
		}
		this.setIdentityKit(buf, gender);
		this.name = buf.gjstr();
		this.nameUnfiltered = this.name;
		if (Client.localPlayerEntity == this) {
			JagException.user = this.name;
		}
		this.combatLevel = buf.g1();
		if (var4) {
			this.field12059 = buf.g2();
			if (this.field12059 == 65535) {
				this.field12059 = -1;
			}
			this.field12072 = this.combatLevel;
			this.field12058 = -1;
		} else {
			this.field12059 = 0;
			this.field12072 = buf.g1();
			this.field12058 = buf.g1();
			if (this.field12058 == 255) {
				this.field12058 = -1;
			}
		}
		int bgsound_range = this.bgsound_range;
		this.bgsound_range = buf.g1();
		if (this.bgsound_range == 0) {
			PositionedSound.method5142(this);
			return;
		}
		int bgsound = this.bgsound_player;
		int bgsound_crawl = this.bgsound_crawl_player;
		int bgsound_walk = this.bgsound_walk_player;
		int bgsound_run = this.bgsound_run_player;
		int bgsound_volume = this.bgsound_volume;
		this.bgsound_player = buf.g2();
		this.bgsound_crawl_player = buf.g2();
		this.bgsound_walk_player = buf.g2();
		this.bgsound_run_player = buf.g2();
		this.bgsound_volume = buf.g1();
		if (this.bgsound_range != bgsound_range || this.bgsound_player != bgsound || this.bgsound_crawl_player != bgsound_crawl || this.bgsound_walk_player != bgsound_walk || this.bgsound_run_player != bgsound_run || this.bgsound_volume != bgsound_volume) {
			PositionedSound.method10310(this);
		}
	}

	@ObfuscatedName("aqk.hr(Lalw;I)V")
	public void getHeadIcons(Packet buf) {
		buf.pos = 0;
		int slots = buf.g1();
		for (int index = 0; index < this.headIconsIds.length; index++) {
			if ((slots & 0x1 << index) == 0) {
				this.headIconsIds[index] = -1;
				this.headIconsGroups[index] = -1;
			} else {
				int id = buf.g1();
				int groupId = buf.g2();
				this.headIconsIds[index] = id;
				this.headIconsGroups[index] = groupId;
			}
		}
	}

	@ObfuscatedName("aqk.hs(B)V")
	public void method19112() {
		for (int var1 = 0; var1 < this.headIconsIds.length; var1++) {
			this.headIconsIds[var1] = -1;
		}
		for (int var2 = 0; var2 < this.headIconsGroups.length; var2++) {
			this.headIconsGroups[var2] = -1;
		}
	}

	@ObfuscatedName("aqk.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		return null;
	}

	@ObfuscatedName("aqk.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		if (this.model == null || !this.method19114(toolkit, 2048)) {
			return null;
		}
		Matrix4x3 var2 = toolkit.method2209();
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		int var5 = this.field10395.method316();
		Tile var6 = this.scene.levelTiles[this.level][(int) var4.trans.x >> 9][(int) var4.trans.z >> 9];
		if (var6 == null || var6.groundDecoration == null) {
			this.field10408 = (int) ((float) this.field10408 - (float) this.field10408 / 10.0F);
		} else {
			int var7 = this.field10408 - var6.groundDecoration.field12448;
			this.field10408 = (int) ((float) this.field10408 - (float) var7 / 10.0F);
		}
		var2.setTo(var3);
		var2.translate(0.0F, (float) (-20 - this.field10408), 0.0F);
		PickableEntity var8 = null;
		this.field10458 = false;
		if (Client.preferences.characterShadows.getValue() == 1) {
			BASType var9 = this.getBASType();
			if (var9.field7346 && (this.model.field7892 == -1 || ((NPCType) Client.npcTypeList.list(this.model.field7892)).spotshadow)) {
				AnimationNode var10 = this.field10454.hasSeqType() && this.field10454.method14355() ? this.field10454 : null;
				EntityWalkAnimationNode var11 = this.field10432.hasSeqType() && (!this.field10432.field11877 || var10 == null) ? this.field10432 : null;
				short var12 = Client.graphicsDefaults.spotshadowtexture;
				byte var13 = Client.graphicsDefaults.spotshadowtexture_alpha;
				if (this.model.field7892 != -1) {
					var12 = ((NPCType) Client.npcTypeList.list(this.model.field7892)).spotshadowtexture;
					var13 = ((NPCType) Client.npcTypeList.list(this.model.field7892)).spotshadowtexture_alpha;
				}
				Object var14 = null;
				Model var15;
				if (var12 > -1 && Client.preferences.textures.getValue() == 1) {
					var15 = SpotShadowFactory.method3283(toolkit, var5, this.field10405, this.field12466, this.field10407, this.idk[0], var12, var13, var11 == null ? var10 : var11);
				} else {
					var15 = SpotShadowFactory.method5102(toolkit, var5, this.field10405, this.field12466, this.field10407, 1, this.idk[0], 0, 0, 160, 240, var11 == null ? var10 : var11);
				}
				if (var15 != null) {
					if (this.entityBounds == null || this.entityBounds.length < this.idk.length + 1) {
						this.createEntityBounds(this.idk.length + 1);
					}
					var8 = PickableEntity.getPickableEntity(true);
					this.field10458 = true;
					toolkit.method2219(false);
					var15.draw(var2, this.entityBounds[this.idk.length], 0);
					toolkit.method2219(true);
				}
			}
		}
		if (Client.localPlayerEntity == this) {
			for (int var16 = Client.hintArrows.length - 1; var16 >= 0; var16--) {
				HintArrow var17 = Client.hintArrows[var16];
				if (var17 != null && var17.field750 != -1) {
					if (var17.hintType == 1) {
						ObjectNode var18 = (ObjectNode) Client.npcs.get((long) var17.field744);
						if (var18 != null) {
							NpcEntity var19 = (NpcEntity) var18.value;
							Vector3 var20 = Vector3.sub(var19.getTransform().trans, Client.localPlayerEntity.getTransform().trans);
							int var21 = (int) var20.x;
							int var22 = (int) var20.z;
							this.method19113(toolkit, var2, this.idk[0], (long) var21, (long) var22, var17.field750, 92160000L);
						}
					}
					if (var17.hintType == 2) {
						Vector3 var23 = Client.localPlayerEntity.getTransform().trans;
						long var24 = (long) (var17.hintOffsetX - (int) var23.x);
						long var26 = (long) (var17.hintOffsetZ - (int) var23.z);
						long var28 = (long) (var17.field748 << 9);
						long var30 = var28 * var28;
						this.method19113(toolkit, var2, this.idk[0], var24, var26, var17.field750, var30);
					}
					if (var17.hintType == 10 && var17.field744 >= 0 && var17.field744 < Client.players.length) {
						PlayerEntity var32 = Client.players[var17.field744];
						if (var32 != null) {
							Vector3 var33 = Vector3.sub(var32.getTransform().trans, Client.localPlayerEntity.getTransform().trans);
							int var34 = (int) var33.x;
							int var35 = (int) var33.z;
							this.method19113(toolkit, var2, this.idk[0], (long) var34, (long) var35, var17.field750, 92160000L);
						}
					}
				}
			}
		}
		var2.setTo(var3);
		var2.translate(0.0F, (float) (-5 - this.field10408), 0.0F);
		if (this.entityBounds == null || this.entityBounds.length < this.idk.length) {
			this.createEntityBounds(this.idk.length);
		}
		if (var8 == null) {
			var8 = PickableEntity.getPickableEntity(true);
		}
		this.method16576(toolkit, this.idk, var2, false);
		for (int var36 = 0; var36 < this.idk.length; var36++) {
			if (this.idk[var36] == null) {
				this.entityBounds[var36].field1686 = false;
			} else {
				this.idk[var36].draw(var2, this.entityBounds[var36], Client.localPlayerEntity == this ? 1 : 0);
			}
		}
		if (this.field10393 != null) {
			ParticleList var37 = this.field10393.method9965();
			toolkit.drawParticles(var37);
		}
		for (int var38 = 0; var38 < this.idk.length; var38++) {
			if (this.idk[var38] != null) {
				this.field10458 |= this.idk[var38].method1731();
			}
			this.idk[var38] = null;
		}
		this.field11715 = Client.sceneCycle;
		return var8;
	}

	@ObfuscatedName("aqk.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
		if (this.model == null || !this.field10449 && !this.method19114(toolkit, 0)) {
			return;
		}
		Matrix4x3 var2 = toolkit.method2209();
		var2.setToTransform2(this.getTransform());
		var2.translate(0.0F, -5.0F, 0.0F);
		this.method16576(toolkit, this.idk, var2, this.field10449);
		for (int var3 = 0; var3 < this.idk.length; var3++) {
			this.idk[var3] = null;
		}
	}

	@ObfuscatedName("aqk.hh(Ldh;Lou;Ldo;JJIJ)V")
	public void method19113(Toolkit arg0, Matrix4x3 arg1, Model arg2, long arg3, long arg4, int arg5, long arg6) {
		long var11 = arg3 * arg3 + arg4 * arg4;
		if (var11 < 262144L || var11 > arg6) {
			return;
		}
		int var13 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.field10395.method316()) & 0x3FFF;
		Model var14 = HintArrow.method5210(arg0, var13, this.field10405, this.field12466, this.field10407, arg5);
		if (var14 != null) {
			arg0.method2219(false);
			var14.draw(arg1, null, 0);
			arg0.method2219(true);
		}
	}

	@ObfuscatedName("aqk.hp(Ldh;IB)Z")
	public boolean method19114(Toolkit arg0, int arg1) {
		int var3 = arg1;
		BASType var4 = this.getBASType();
		AnimationNode var5 = this.field10454.hasSeqType() && !this.field10454.method14355() ? this.field10454 : null;
		EntityWalkAnimationNode var6 = !this.field10432.hasSeqType() || this.field12053 || this.field10432.field11877 && var5 != null ? null : this.field10432;
		int var7 = var4.field7342;
		int var8 = var4.field7343;
		if (var7 != 0 || var8 != 0 || var4.field7355 != 0 || var4.field7358 != 0) {
			arg1 |= 0x7;
		}
		int var9 = this.field10395.method316();
		boolean var10 = this.field10437 != 0 && Client.loopCycle >= this.field10446 && Client.loopCycle < this.field10464;
		if (var10) {
			arg1 |= 0x80000;
		}
		Model var11 = this.idk[0] = this.model.getBodyModel(arg0, arg1, Client.basTypeList, Client.idkTypeList, Client.npcTypeList, Client.objTypeList, Client.localPlayerGameState, Client.localPlayerGameState, var5, var6, this.field10398, this.field10442, var9, true, Client.wearposDefaults);
		int var12 = PlayerModel.method18304();
		if (GameShell.maxmemory < 96 && var12 > 50) {
			SceneManager.method7319();
		}
		if (Client.modewhere != ModeWhere.LIVE && var12 < 50) {
			int var13 = 50 - var12;
			while (var13 > Client.field10798) {
				Client.field9166[Client.field10798] = new byte[102400];
				Client.field10798++;
			}
			while (var13 < Client.field10798) {
				Client.field10798--;
				Client.field9166[Client.field10798] = null;
			}
		} else if (Client.modewhere != ModeWhere.LIVE) {
			Client.field9166 = new byte[50][];
			Client.field10798 = 0;
		}
		if (var11 == null) {
			return false;
		}
		this.minY = var11.getMinY();
		this.height = var11.getHeight();
		var11.getRadius();
		this.method16505(var11);
		if (var7 == 0 && var8 == 0) {
			this.method16507(var9, this.size() << 9, this.size() << 9, 0, 0);
		} else {
			this.method16507(var9, var7, var8, var4.field7344, var4.field7323);
			if (this.field10405 != 0) {
				var11.rotateX(this.field10405);
			}
			if (this.field12466 != 0) {
				var11.rotateZ(this.field12466);
			}
			if (this.field10407 != 0) {
				var11.translate(0, this.field10407, 0);
			}
		}
		if (var10) {
			var11.method1745(this.field10434, this.field10435, this.field10436, this.field10437 & 0xFF);
		}
		if (!this.field12053) {
			this.method16506(arg0, var4, var3, var7, var8, var9);
		}
		return true;
	}

	@ObfuscatedName("aqk.hy(ZB)Ljava/lang/String;")
	public String getNameWithExtras(boolean arg0) {
		String var2 = arg0 ? this.name : this.nameUnfiltered;
		return this.title == null ? var2 : this.title.replaceAll(TextUtil.NAME, var2);
	}

	@ObfuscatedName("aqk.he(ZI)Ljava/lang/String;")
	public String getName(boolean isFiltered) {
		return isFiltered ? this.name : this.nameUnfiltered;
	}

	@ObfuscatedName("aqk.hn(IIBB)V")
	public final void movePlayer(int x, int z, byte speed) {
		if (this.field10454.hasSeqType() && this.field10454.getSeqType().field1782 == 1) {
			this.field10427 = null;
			this.field10454.method14362(-1);
		}
		for (int var4 = 0; var4 < this.spotAnims.length; var4++) {
			if (this.spotAnims[var4].field6657 != -1) {
				EffectAnimType var5 = (EffectAnimType) Client.effectAnimTypeList.list(this.spotAnims[var4].field6657);
				if (var5.field8261 && var5.anim != -1 && ((SeqType) Client.seqTypeList.list(var5.anim)).field1782 == 1) {
					this.spotAnims[var4].field6659.method14362(-1);
					this.spotAnims[var4].field6657 = -1;
				}
			}
		}
		this.field12056 = -1;
		if (x < 0 || x >= Client.world.getSizeX() || z < 0 || z >= Client.world.getSizeZ()) {
			this.tele(x, z);
		} else if (this.routeWaypointX[0] >= 0 && this.routeWaypointX[0] < Client.world.getSizeX() && this.routeWaypointZ[0] >= 0 && this.routeWaypointZ[0] < Client.world.getSizeZ()) {
			this.move(x, z, speed);
		} else {
			this.tele(x, z);
		}
	}

	@ObfuscatedName("aqk.hi(IIB)V")
	public void tele(int x, int z) {
		this.routeLength = 0;
		this.field10396 = 0;
		this.seqTrigger = 0;
		this.routeWaypointX[0] = x;
		this.routeWaypointZ[0] = z;
		int size = this.size();
		Vector3 var4 = Vector3.create(this.getTransform().trans);
		var4.x = this.routeWaypointX[0] * 512 + size * 256;
		var4.z = this.routeWaypointZ[0] * 512 + size * 256;
		this.method10531(var4);
		var4.release();
		if (Client.localPlayerEntity == this) {
			Client.world.getEnvironmentManager().resetFade();
		}
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
	}

	@ObfuscatedName("aqk.hw(IIBI)V")
	public final void move(int nextX, int nextZ, byte speed) {
		if (this.routeLength < this.routeWaypointX.length - 1) {
			this.routeLength++;
		}
		for (int index = this.routeLength; index > 0; index--) {
			this.routeWaypointX[index] = this.routeWaypointX[index - 1];
			this.routeWaypointZ[index] = this.routeWaypointZ[index - 1];
			this.routeSpeeds[index] = this.routeSpeeds[index - 1];
		}
		this.routeWaypointX[0] = nextX;
		this.routeWaypointZ[0] = nextZ;
		this.routeSpeeds[0] = speed;
	}

	@ObfuscatedName("aqk.ht(I)Z")
	public final boolean method19119() {
		return this.model != null;
	}

	@ObfuscatedName("aqk.bz(I)I")
	public int size() {
		return this.model == null || this.model.field7892 == -1 ? super.size() : ((NPCType) Client.npcTypeList.list(this.model.field7892)).size;
	}

	@ObfuscatedName("aqk.bj(S)I")
	public int getBASId() {
		return this.bas;
	}

	@ObfuscatedName("aqk.bs(B)I")
	public int getCoverMarker() {
		return -1;
	}

	@ObfuscatedName("aqk.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		if (this.model == null || !this.method19114(toolkit, 131072)) {
			return false;
		}
		Matrix4x3 var4 = this.method10533();
		boolean var5 = false;
		for (int var6 = 0; var6 < this.idk.length; var6++) {
			if (this.idk[var6] != null && this.idk[var6].field1298 && this.idk[var6].method1725(arg1, arg2, var4, true, 0)) {
				var5 = true;
				break;
			}
		}
		for (int var7 = 0; var7 < this.idk.length; var7++) {
			this.idk[var7] = null;
		}
		return var5;
	}

	@ObfuscatedName("aqk.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aqk.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqk.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqk.cg(I)Z")
	public boolean showChat() {
		return Client.graphicsDefaults.playerShouldDisplayChat;
	}

	@ObfuscatedName("aqk.ce(I)Lsu;")
	public EntityChatLine getChatLine() {
		if (this.currentChatLine != null) {
			if (this.currentChatLine.text == null) {
				return null;
			}
			if (Client.publicChatFilter == 0 || Client.publicChatFilter == 3 || Client.publicChatFilter == 1 && Client.friendTest(this.nameUnfiltered)) {
				return this.currentChatLine;
			}
		}
		return null;
	}

	@ObfuscatedName("aqk.hc(Ljava/lang/String;III)V")
	public void addMessage(String arg0, int arg1, int arg2) {
		this.setChatLine(arg0, arg1, arg2, GameShell.getLogicRate() * Client.graphicsDefaults.playerChatTimeout);
	}

	@ObfuscatedName("aqk.e(I)Ljl;")
	public CameraTrackableType getCameraTrackableType() {
		return CameraTrackableType.PLAYER;
	}

	@ObfuscatedName("aqk.n(I)I")
	public int getIndex() {
		return this.localPlayerIndex;
	}

	@ObfuscatedName("aqk.m(B)Lakt;")
	public CoordFine getTrackableCoord() {
		CoordGrid var1 = Client.world.getBase();
		return CoordFine.method258(this.level, (int) this.getTransform().trans.x + var1.x * 512, -((int) this.getTransform().trans.y), (int) this.getTransform().trans.z + var1.z * 512);
	}

	@ObfuscatedName("aqk.k(I)Lov;")
	public Quaternion method4668() {
		Quaternion var1 = Quaternion.create();
		var1.setToRotation(Trig1.radians(this.field10395.field528), 0.0F, 0.0F);
		return var1;
	}

	@ObfuscatedName("aqk.f(B)Lox;")
	public Vector3 createVector3() {
		return Vector3.create();
	}

	@ObfuscatedName("aqk.cx(I)I")
	public int targeted() {
		return -this.localPlayerIndex - 1;
	}
}
