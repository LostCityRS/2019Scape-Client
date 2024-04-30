package rs2.client.scene.entities;

import com.jagex.core.datastruct.LinkQueue;
import com.jagex.game.client.EasedAngle;
import com.jagex.game.client.Headbar;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.config.headbartype.HeadbarType;
import com.jagex.game.config.hitmarktype.HitmarkType;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.Interface;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.vartype.VarContainer;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.config.vartype.VarDomain;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.graphics.camera.CameraTrackable;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Trig1;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.clientscript.ScriptRunner;

@ObfuscatedName("ahm")
public abstract class PathingEntity extends PrimaryLayerEntity implements CameraTrackable {

	@ObfuscatedName("ahm.v")
	public int localPlayerIndex;

	@ObfuscatedName("ahm.o")
	public int size;

	@ObfuscatedName("ahm.s")
	public int field11715;

	@ObfuscatedName("ahm.y")
	public int minY;

	@ObfuscatedName("ahm.q")
	public int height;

	@ObfuscatedName("ahm.x")
	public boolean field10452;

	@ObfuscatedName("ahm.b")
	public boolean field10401;

	@ObfuscatedName("ahm.h")
	public int field10402;

	@ObfuscatedName("ahm.a")
	public int field10403;

	@ObfuscatedName("ahm.g")
	public int field10404;

	@ObfuscatedName("ahm.i")
	public int field10405;

	@ObfuscatedName("ahm.j")
	public int field12466;

	@ObfuscatedName("ahm.t")
	public int field10407;

	@ObfuscatedName("ahm.ae")
	public int field10408;

	@ObfuscatedName("ahm.ag")
	public EntityChatLine currentChatLine;

	@ObfuscatedName("ahm.ah")
	public byte field10410;

	@ObfuscatedName("ahm.al")
	public int[] field10411;

	@ObfuscatedName("ahm.ac")
	public int[] field10412;

	@ObfuscatedName("ahm.ai")
	public int[] field10421;

	@ObfuscatedName("ahm.aw")
	public int[] field10456;

	@ObfuscatedName("ahm.as")
	public int[] field10445;

	@ObfuscatedName("ahm.at")
	public LinkQueue field10416;

	@ObfuscatedName("ahm.ad")
	public int targetId;

	@ObfuscatedName("ahm.am")
	public int[] field10418;

	@ObfuscatedName("ahm.au")
	public int[] field10427;

	@ObfuscatedName("ahm.ar")
	public EntityWalkAnimationNode field10432;

	@ObfuscatedName("ahm.ap")
	public AnimationNode field10454;

	@ObfuscatedName("ahm.aq")
	public EntitySpotAnim[] spotAnims;

	@ObfuscatedName("ahm.ax")
	public int forceMoveStartSceneTileX;

	@ObfuscatedName("ahm.av")
	public int forceMoveEndSceneTileX;

	@ObfuscatedName("ahm.ao")
	public int forceMoveStartSceneTileZ;

	@ObfuscatedName("ahm.aj")
	public int forceMoveEndSceneTileZ;

	@ObfuscatedName("ahm.ay")
	public int field10419;

	@ObfuscatedName("ahm.ab")
	public int field10428;

	@ObfuscatedName("ahm.az")
	public int forceMoveEndCycle;

	@ObfuscatedName("ahm.aa")
	public int forceMoveStartCycle;

	@ObfuscatedName("ahm.af")
	public int field10431;

	@ObfuscatedName("ahm.ak")
	public int field10446;

	@ObfuscatedName("ahm.an")
	public int field10464;

	@ObfuscatedName("ahm.bf")
	public byte field10434;

	@ObfuscatedName("ahm.bl")
	public byte field10435;

	@ObfuscatedName("ahm.bk")
	public byte field10436;

	@ObfuscatedName("ahm.bh")
	public byte field10437;

	@ObfuscatedName("ahm.bx")
	public int field10438;

	@ObfuscatedName("ahm.bd")
	public int field10433;

	@ObfuscatedName("ahm.bc")
	public int field10440;

	@ObfuscatedName("ahm.bi")
	public final UnknownEntityAnimationNode[] field10398;

	@ObfuscatedName("ahm.bn")
	public int[] field10442;

	@ObfuscatedName("ahm.bt")
	public int field10443;

	@ObfuscatedName("ahm.bq")
	public int field10444;

	@ObfuscatedName("ahm.bm")
	public int field10414;

	@ObfuscatedName("ahm.bb")
	public EasedAngle field10395;

	@ObfuscatedName("ahm.be")
	public EasedAngle field10447;

	@ObfuscatedName("ahm.by")
	public EasedAngle field10413;

	@ObfuscatedName("ahm.bu")
	public int routeLength;

	@ObfuscatedName("ahm.bw")
	public int[] routeWaypointX;

	@ObfuscatedName("ahm.bo")
	public int[] routeWaypointZ;

	@ObfuscatedName("ahm.bz")
	public byte[] routeSpeeds;

	@ObfuscatedName("ahm.bv")
	public int seqTrigger;

	@ObfuscatedName("ahm.br")
	public int field10396;

	@ObfuscatedName("ahm.bg")
	public int field10455;

	@ObfuscatedName("ahm.ba")
	public ParticleSystem field10393;

	@ObfuscatedName("ahm.bp")
	public boolean field10449;

	@ObfuscatedName("ahm.bj")
	public boolean field10458;

	@ObfuscatedName("ahm.bs")
	public Model[] idk;

	@ObfuscatedName("ahm.cl")
	public final VarContainer vars;

	@ObfuscatedName("ahm.cg")
	public Interface field10461;

	@ObfuscatedName("ahm.ce")
	public int field10462;

	@ObfuscatedName("ahm.cu")
	public int field10439;

	@ObfuscatedName("ahm.ci")
	public VarDomain varDomain;

	public PathingEntity(Scene arg0, int arg1, VarTypeList arg2) {
		super(arg0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		this.localPlayerIndex = -1;
		this.size = 1;
		this.minY = -32768;
		this.height = -32768;
		this.field10452 = true;
		this.field10402 = 0;
		this.field10403 = -1;
		this.field10404 = 0;
		this.field10408 = 0;
		this.field10410 = 0;
		this.field10411 = new int[Client.graphicsDefaults.maxhitmarks];
		this.field10412 = new int[Client.graphicsDefaults.maxhitmarks];
		this.field10421 = new int[Client.graphicsDefaults.maxhitmarks];
		this.field10456 = new int[Client.graphicsDefaults.maxhitmarks];
		this.field10445 = new int[Client.graphicsDefaults.maxhitmarks];
		this.field10416 = new LinkQueue();
		this.targetId = -1;
		this.field10427 = null;
		this.field10432 = new EntityWalkAnimationNode(this, false);
		this.field10454 = new EntityAnimationNode(this, false);
		this.field10446 = -1;
		this.field10464 = -1;
		this.field10437 = 0;
		this.field10438 = -1;
		this.field10433 = 0;
		this.field10440 = 0;
		this.field10443 = 0;
		this.field10444 = 256;
		this.field10395 = new EasedAngle();
		this.field10447 = new EasedAngle();
		this.field10413 = new EasedAngle();
		this.routeLength = 0;
		this.seqTrigger = 0;
		this.field10396 = 0;
		this.field10455 = 0;
		this.field10449 = false;
		this.field10458 = false;
		this.field10462 = -1;
		this.field10439 = -1;
		this.varDomain = new PathingEntityVarDomain(this);
		this.routeWaypointX = new int[arg1];
		this.routeWaypointZ = new int[arg1];
		this.routeSpeeds = new byte[arg1];
		this.idk = new Model[6];
		this.spotAnims = new EntitySpotAnim[5];
		for (int var4 = 0; var4 < 5; var4++) {
			this.spotAnims[var4] = new EntitySpotAnim(this);
		}
		this.field10398 = new UnknownEntityAnimationNode[Client.wearposDefaults.field7766.length];
		this.vars = new VarContainerSparse(arg2);
	}

	public PathingEntity(Scene arg0, VarTypeList arg1) {
		this(arg0, 10, arg1);
	}

	@ObfuscatedName("ahm.by(B)I")
	public int overlayHeight() {
		return this.minY == -32768 ? 0 : this.minY;
	}

	@ObfuscatedName("ahm.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ahm.bw(S)Z")
	public boolean method16489() {
		return this.field10458;
	}

	@ObfuscatedName("ahm.o(IB)V")
	public void method16490(int arg0) {
		BASType var2 = this.getBASType();
		if (var2.field7321 == 0 && this.field10444 == 0) {
			return;
		}
		this.field10395.method317();
		int var3 = arg0 - this.field10395.field528 & 0x3FFF;
		if (var3 > 8192) {
			this.field10414 = this.field10395.field528 - (16384 - var3);
		} else {
			this.field10414 = this.field10395.field528 + var3;
		}
	}

	@ObfuscatedName("ahm.s(IZI)V")
	public void method16491(int arg0, boolean arg1) {
		BASType var3 = this.getBASType();
		if (arg1 || var3.field7321 != 0 || this.field10444 != 0) {
			this.field10414 = arg0 & 0x3FFF;
			this.field10395.method314(this.field10414);
		}
	}

	@ObfuscatedName("ahm.y(I)I")
	public int method16539() {
		BASType var1 = this.getBASType();
		int var2 = this.field10395.field528;
		boolean var3;
		if (var1.field7321 == 0) {
			var3 = this.field10395.method315(this.field10414, this.field10444, this.field10444);
		} else {
			var3 = this.field10395.method315(this.field10414, var1.field7321, var1.field7340);
		}
		int var4 = this.field10395.field528 - var2;
		if (var4 == 0) {
			this.field10443 = 0;
			this.field10395.method314(this.field10414);
		} else {
			this.field10443++;
		}
		if (var3) {
			if (var1.field7353 != 0) {
				if (var4 > 0) {
					this.field10447.method315(var1.field7355, var1.field7353, var1.field7336);
				} else {
					this.field10447.method315(-var1.field7355, var1.field7353, var1.field7336);
				}
			}
			if (var1.field7356 != 0) {
				this.field10413.method315(var1.field7358, var1.field7356, var1.field7334);
			}
		} else {
			if (var1.field7353 == 0) {
				this.field10447.method314(0);
			} else {
				this.field10447.method315(0, var1.field7353, var1.field7336);
			}
			if (var1.field7356 == 0) {
				this.field10413.method314(0);
			} else {
				this.field10413.method315(0, var1.field7356, var1.field7334);
			}
		}
		return var4;
	}

	@ObfuscatedName("ahm.q([I[II)V")
	public void method16493(int[] arg0, int[] arg1) {
		if (this.field10418 == null && arg0 != null) {
			this.field10418 = new int[Client.wearposDefaults.field7766.length];
		} else if (arg0 == null) {
			this.field10418 = null;
			return;
		}
		for (int var3 = 0; var3 < this.field10418.length; var3++) {
			this.field10418[var3] = -1;
		}
		for (int var4 = 0; var4 < arg0.length; var4++) {
			int var5 = arg1[var4];
			int var6 = 0;
			while (var6 < this.field10418.length) {
				if ((var5 & 0x1) != 0) {
					this.field10418[var6] = arg0[var4];
				}
				var6++;
				var5 >>= 0x1;
			}
		}
	}

	@ObfuscatedName("ahm.x(IIB)Z")
	public boolean method16583(int arg0, int arg1) {
		if (this.field10442 == null) {
			if (arg1 == -1) {
				return true;
			}
			this.field10442 = new int[Client.wearposDefaults.field7766.length];
			for (int var3 = 0; var3 < Client.wearposDefaults.field7766.length; var3++) {
				this.field10442[var3] = -1;
			}
		}
		BASType var4 = this.getBASType();
		int var5 = 256;
		if (var4.field7349 != null && var4.field7349[arg0] > 0) {
			var5 = var4.field7349[arg0];
		}
		if (arg1 != -1) {
			if (this.field10442[arg0] == -1) {
				this.field10442[arg0] = this.field10395.method316();
			}
			int var10 = this.field10442[arg0];
			int var11 = arg1 - var10;
			if (var11 >= -var5 && var11 <= var5) {
				this.field10442[arg0] = arg1;
				return true;
			}
			if ((var11 <= 0 || var11 > 8192) && var11 > -8192) {
				this.field10442[arg0] = var10 - var5 & 0x3FFF;
			} else {
				this.field10442[arg0] = var5 + var10 & 0x3FFF;
			}
			return false;
		} else if (this.field10442[arg0] == -1) {
			return true;
		} else {
			int var6 = this.field10395.method316();
			int var7 = this.field10442[arg0];
			int var8 = var6 - var7;
			if (var8 < -var5 || var8 > var5) {
				if ((var8 <= 0 || var8 > 8192) && var8 > -8192) {
					this.field10442[arg0] = var7 - var5 & 0x3FFF;
				} else {
					this.field10442[arg0] = var5 + var7 & 0x3FFF;
				}
				return false;
			}
			this.field10442[arg0] = -1;
			for (int var9 = 0; var9 < Client.wearposDefaults.field7766.length; var9++) {
				if (this.field10442[var9] != -1) {
					return true;
				}
			}
			this.field10442 = null;
			return true;
		}
	}

	@ObfuscatedName("ahm.b(Ldh;[Ldo;Lou;ZI)V")
	public void method16576(Toolkit arg0, Model[] arg1, Matrix4x3 arg2, boolean arg3) {
		if (!arg3) {
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			int var9 = -1;
			int var10 = -1;
			ModelParticleEmitter[][] var11 = new ModelParticleEmitter[arg1.length][];
			ModelParticleEffector[][] var12 = new ModelParticleEffector[arg1.length][];
			for (int var13 = 0; var13 < arg1.length; var13++) {
				if (arg1[var13] != null) {
					arg1[var13].method1689(arg2);
					var11[var13] = arg1[var13].method1750();
					var12[var13] = arg1[var13].method1765();
					if (var11[var13] != null) {
						var9 = var13;
						var6++;
						var5 += var11[var13].length;
					}
					if (var12[var13] != null) {
						var10 = var13;
						var8++;
						var7 += var12[var13].length;
					}
				}
			}
			if ((this.field10393 == null || this.field10393.field7804) && (var6 > 0 || var8 > 0)) {
				this.field10393 = ParticleSystem.method9962(Client.loopCycle, true);
			}
			if (this.field10393 != null) {
				Object var14 = null;
				ModelParticleEmitter[] var15;
				if (var6 == 1) {
					var15 = var11[var9];
				} else {
					var15 = new ModelParticleEmitter[var5];
					int var16 = 0;
					for (int var17 = 0; var17 < arg1.length; var17++) {
						if (var11[var17] != null) {
							System.arraycopy(var11[var17], 0, var15, var16, var11[var17].length);
							var16 += var11[var17].length;
						}
					}
				}
				Object var18 = null;
				ModelParticleEffector[] var19;
				if (var8 == 1) {
					var19 = var12[var10];
				} else {
					var19 = new ModelParticleEffector[var7];
					int var20 = 0;
					for (int var21 = 0; var21 < arg1.length; var21++) {
						if (var12[var21] != null) {
							System.arraycopy(var12[var21], 0, var19, var20, var12[var21].length);
							var20 += var12[var21].length;
						}
					}
				}
				this.field10393.method9936(arg0, (long) Client.loopCycle, var15, var19, false);
				this.field10449 = true;
			}
		} else if (this.field10393 != null) {
			this.field10393.method9935((long) Client.loopCycle);
		}
		if (this.field10393 != null) {
			this.field10393.method9963(this.level, this.minSceneTileX, this.maxSceneTileX, this.minSceneTileZ, this.maxSceneTileZ);
		}
	}

	@ObfuscatedName("ahm.h(IIIIZIB)V")
	public final void addSpotAnimation(int spotAnimId, int arg1, int arg2, int arg3, boolean arg4, int index) {
		EntitySpotAnim var7 = this.spotAnims[index];
		int var8 = var7.field6657;
		if (spotAnimId != -1 && var8 != -1) {
			if (spotAnimId == var8) {
				EffectAnimType var9 = (EffectAnimType) Client.effectAnimTypeList.list(spotAnimId);
				if (var9.field8261 && var9.anim != -1) {
					SeqType var10 = (SeqType) Client.seqTypeList.list(var9.anim);
					int var11 = var10.field1768;
					if (var11 == 0) {
						return;
					}
					if (var11 == 2) {
						var7.field6659.method14422();
						return;
					}
				}
			} else {
				EffectAnimType var12 = (EffectAnimType) Client.effectAnimTypeList.list(spotAnimId);
				EffectAnimType var13 = (EffectAnimType) Client.effectAnimTypeList.list(var8);
				if (var12.anim != -1 && var13.anim != -1) {
					SeqType var14 = (SeqType) Client.seqTypeList.list(var12.anim);
					SeqType var15 = (SeqType) Client.seqTypeList.list(var13.anim);
					if (var14.priority < var15.priority) {
						return;
					}
				}
			}
		}
		byte var16 = 0;
		if (spotAnimId != -1 && !((EffectAnimType) Client.effectAnimTypeList.list(spotAnimId)).field8261) {
			var16 = 2;
		}
		if (spotAnimId != -1 && arg4) {
			var16 = 1;
		}
		var7.field6657 = spotAnimId;
		var7.field6658 = arg3;
		var7.field6661 = arg1 >> 16;
		var7.field6660 = arg2;
		var7.field6659.method14353(spotAnimId == -1 ? -1 : ((EffectAnimType) Client.effectAnimTypeList.list(spotAnimId)).anim, arg1 & 0xFFFF, var16, false);
	}

	@ObfuscatedName("ahm.a(B)V")
	public final void method16517() {
		this.routeLength = 0;
		this.field10396 = 0;
	}

	@ObfuscatedName("ahm.g(IIIIIII)V")
	public final void addHitmark(int hitmarkId, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		boolean var8 = true;
		for (int var9 = 0; var9 < Client.graphicsDefaults.maxhitmarks; var9++) {
			if (this.field10421[var9] > arg4) {
				var7 = false;
			} else {
				var8 = false;
			}
		}
		int var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (hitmarkId >= 0) {
			HitmarkType var13 = (HitmarkType) Client.hitmarkTypeList.list(hitmarkId);
			var11 = var13.replacemode;
			var12 = var13.sticktime;
		}
		if (var8) {
			if (var11 == -1) {
				return;
			}
			var10 = 0;
			int var14 = 0;
			if (var11 == 0) {
				var14 = this.field10421[0];
			} else if (var11 == 1) {
				var14 = this.field10412[0];
			}
			for (int var15 = 1; var15 < Client.graphicsDefaults.maxhitmarks; var15++) {
				if (var11 == 0) {
					if (this.field10421[var15] < var14) {
						var10 = var15;
						var14 = this.field10421[var15];
					}
				} else if (var11 == 1 && this.field10412[var15] < var14) {
					var10 = var15;
					var14 = this.field10412[var15];
				}
			}
			if (var11 == 1 && var14 >= arg1) {
				return;
			}
		} else {
			if (var7) {
				this.field10410 = 0;
			}
			for (int var16 = 0; var16 < Client.graphicsDefaults.maxhitmarks; var16++) {
				byte var17 = this.field10410;
				this.field10410 = (byte) ((this.field10410 + 1) % Client.graphicsDefaults.maxhitmarks);
				if (this.field10421[var17] <= arg4) {
					var10 = var17;
					break;
				}
			}
		}
		if (var10 < 0) {
			return;
		}
		this.field10411[var10] = hitmarkId;
		this.field10412[var10] = arg1;
		this.field10456[var10] = arg2;
		this.field10445[var10] = arg3;
		this.field10421[var10] = arg4 + var12 + arg5;
	}

	@ObfuscatedName("ahm.i(IIIIIII)V")
	public final void addHeadbar(int headbarId, int arg1, int arg2, int arg3, int arg4, int arg5) {
		HeadbarType var7 = (HeadbarType) Client.headbarTypeList.list(headbarId);
		Headbar var8 = null;
		Headbar var9 = null;
		int var10 = var7.hidepriority;
		int var11 = 0;
		for (Headbar var12 = (Headbar) this.field10416.peekFront(); var12 != null; var12 = (Headbar) this.field10416.prev()) {
			var11++;
			if (var12.field11215 == var7) {
				var12.method17456(arg1 + arg3, arg4, arg5, arg2);
				return;
			}
			if (var12.field11215.showpriority <= var7.showpriority) {
				var8 = var12;
			}
			if (var12.field11215.hidepriority > var10) {
				var9 = var12;
				var10 = var12.field11215.hidepriority;
			}
		}
		if (var9 == null && var11 >= Client.graphicsDefaults.field7745) {
			return;
		}
		Headbar var13 = new Headbar(var7);
		if (var8 == null) {
			this.field10416.pushFront(var13);
		} else {
			LinkQueue.pushNode(var13, var8);
		}
		var13.method17456(arg1 + arg3, arg4, arg5, arg2);
		if (var11 >= Client.graphicsDefaults.field7745) {
			var9.unlink();
		}
	}

	@ObfuscatedName("ahm.j(II)V")
	public final void method16500(int arg0) {
		HeadbarType var2 = (HeadbarType) Client.headbarTypeList.list(arg0);
		for (Headbar var3 = (Headbar) this.field10416.peekFront(); var3 != null; var3 = (Headbar) this.field10416.prev()) {
			if (var3.field11215 == var2) {
				var3.unlink();
				return;
			}
		}
	}

	@ObfuscatedName("ahm.bo(I)I")
	public int height() {
		BASType var1 = this.getBASType();
		int var2;
		if (var1.field7360 != -1) {
			var2 = var1.field7360;
		} else if (this.height == -32768) {
			var2 = 200;
		} else {
			var2 = -this.height;
		}
		ScaleRotTrans var3 = this.getTransform();
		int var4 = (int) var3.trans.x >> 9;
		int var5 = (int) var3.trans.z >> 9;
		if (this.scene != null && var4 >= 1 && var5 >= 1 && var4 <= Client.world.getSizeX() - 1 && var5 <= Client.world.getSizeZ() - 1) {
			Tile var6 = this.scene.levelTiles[this.level][var4][var5];
			if (var6 != null && var6.groundDecoration != null) {
				return var6.groundDecoration.field12448 + var2;
			}
		}
		return var2;
	}

	@ObfuscatedName("ahm.t(II)V")
	public void setSize(int size) {
		this.size = size;
	}

	@ObfuscatedName("ahm.bz(I)I")
	public int size() {
		return this.size;
	}

	@ObfuscatedName("ahm.bv(I)V")
	public void method16529() {
		int var1 = (this.size - 1 << 8) + 240;
		Vector3 var2 = this.getTransform().trans;
		this.minSceneTileX = (short) ((int) var2.x - var1 >> 9);
		this.minSceneTileZ = (short) ((int) var2.z - var1 >> 9);
		this.maxSceneTileX = (short) ((int) var2.x + var1 >> 9);
		this.maxSceneTileZ = (short) ((int) var2.z + var1 >> 9);
	}

	@ObfuscatedName("ahm.br(Ldo;I)V")
	public void method16505(Model arg0) {
		int var2 = this.field10447.field528;
		int var3 = this.field10413.field528;
		if (var2 == 0 && var3 == 0) {
			return;
		}
		int var4 = arg0.getMinY() / 2;
		arg0.translate(0, -var4, 0);
		arg0.rotateZ(var2 & 0x3FFF);
		arg0.rotateX(var3 & 0x3FFF);
		arg0.translate(0, var4, 0);
	}

	@ObfuscatedName("ahm.bg(Ldh;Lvr;IIIII)V")
	public void method16506(Toolkit arg0, BASType arg1, int arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < this.spotAnims.length; var7++) {
			byte var8 = 0;
			if (var7 == 0) {
				var8 = 2;
			} else if (var7 == 1) {
				var8 = 5;
			} else if (var7 == 2) {
				var8 = 1;
			} else if (var7 == 3) {
				var8 = 7;
			} else if (var7 == 4) {
				var8 = 8;
			}
			EntitySpotAnim var9 = this.spotAnims[var7];
			if (var9.field6657 == -1 || var9.field6659.method14355()) {
				this.idk[var7 + 1] = null;
			} else {
				EffectAnimType var10 = (EffectAnimType) Client.effectAnimTypeList.list(var9.field6657);
				int var11 = arg2;
				if (var9.field6660 != 0) {
					var11 = arg2 | 0x5;
				}
				if (var9.field6661 != 0) {
					var11 |= 0x2;
				}
				if (var9.field6658 >= 0) {
					var11 |= 0x7;
				}
				if (var9.field6658 < 0 || arg1.field7357 == null || arg1.field7357[var9.field6658] == null) {
					Model var21 = this.idk[var7 + 1] = var10.getModel(arg0, var11, var9.field6660 * 2048, this.field10405, this.field12466, this.field10407, var9.field6659, var8);
					if (var21 != null) {
						if (var9.field6661 != 0) {
							var21.translate(0, -var9.field6661 << 2, 0);
						}
						var21.field1298 = false;
					}
				} else {
					Model var12 = this.idk[var7 + 1] = var10.getModel(arg0, var11, var9.field6659, var8);
					if (var12 != null) {
						int var13 = 0;
						int var14 = 0;
						int var15 = 0;
						if (arg1.field7357 != null && arg1.field7357[var9.field6658] != null) {
							var13 += arg1.field7357[var9.field6658][0];
							var14 += arg1.field7357[var9.field6658][1];
							var15 += arg1.field7357[var9.field6658][2];
						}
						if (arg1.field7347 != null && arg1.field7347[var9.field6658] != null) {
							var13 += arg1.field7347[var9.field6658][0];
							var14 += arg1.field7347[var9.field6658][1];
							var15 += arg1.field7347[var9.field6658][2];
						}
						if (var15 != 0 || var13 != 0) {
							int var16 = arg5;
							if (this.field10442 != null && this.field10442[var9.field6658] != -1) {
								var16 = this.field10442[var9.field6658];
							}
							int var17 = var9.field6660 * 2048 + var16 - arg5 & 0x3FFF;
							if (var17 != 0) {
								var12.method1693(var17);
							}
							int var18 = Trig1.sin[var17];
							int var19 = Trig1.cos[var17];
							int var20 = var13 * var19 + var15 * var18 >> 14;
							var15 = var15 * var19 - var13 * var18 >> 14;
							var13 = var20;
						}
						var12.translate(var13, var14, var15);
						if (var9.field6661 != 0) {
							var12.translate(0, -var9.field6661 << 2, 0);
						}
						var12.field1298 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("ahm.ba(IIIIIB)V")
	public void method16507(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Vector3 var6 = this.getTransform().trans;
		int var7 = this.maxSceneTileX + this.minSceneTileX >> 1;
		int var8 = this.minSceneTileZ + this.maxSceneTileZ >> 1;
		int var9 = Trig1.sin[arg0];
		int var10 = Trig1.cos[arg0];
		int var11 = -arg1 / 2;
		int var12 = -arg2 / 2;
		int var13 = var9 * var12 + var10 * var11 >> 14;
		int var14 = var10 * var12 - var9 * var11 >> 14;
		int var15 = Client.method15200((int) var6.x + var13, (int) var6.z + var14, var7, var8, this.level);
		int var16 = arg1 / 2;
		int var17 = -arg2 / 2;
		int var18 = var9 * var17 + var10 * var16 >> 14;
		int var19 = var10 * var17 - var9 * var16 >> 14;
		int var20 = Client.method15200((int) var6.x + var18, (int) var6.z + var19, var7, var8, this.level);
		int var21 = -arg1 / 2;
		int var22 = arg2 / 2;
		int var23 = var9 * var22 + var10 * var21 >> 14;
		int var24 = var10 * var22 - var9 * var21 >> 14;
		int var25 = Client.method15200((int) var6.x + var23, (int) var6.z + var24, var7, var8, this.level);
		int var26 = arg1 / 2;
		int var27 = arg2 / 2;
		int var28 = var9 * var27 + var10 * var26 >> 14;
		int var29 = var10 * var27 - var9 * var26 >> 14;
		int var30 = Client.method15200((int) var6.x + var28, (int) var6.z + var29, var7, var8, this.level);
		int var31 = var15 < var20 ? var15 : var20;
		int var32 = var25 < var30 ? var25 : var30;
		int var33 = var20 < var30 ? var20 : var30;
		int var34 = var15 < var25 ? var15 : var25;
		this.field10405 = (int) (Math.atan2((double) (var31 - var32), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		this.field12466 = (int) (Math.atan2((double) (var34 - var33), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		if (this.field10405 != 0 && arg3 != 0) {
			int var35 = 16384 - arg3;
			if (this.field10405 > 8192) {
				if (this.field10405 < var35) {
					this.field10405 = var35;
				}
			} else if (this.field10405 > arg3) {
				this.field10405 = arg3;
			}
		}
		if (this.field12466 != 0 && arg4 != 0) {
			int var36 = 16384 - arg4;
			if (this.field12466 > 8192) {
				if (this.field12466 < var36) {
					this.field12466 = var36;
				}
			} else if (this.field12466 > arg4) {
				this.field12466 = arg4;
			}
		}
		this.field10407 = var15 + var30;
		if (var20 + var25 < this.field10407) {
			this.field10407 = var20 + var25;
		}
		this.field10407 = (this.field10407 >> 1) - (int) var6.y;
	}

	@ObfuscatedName("ahm.bp(I)Lvr;")
	public BASType getBASType() {
		int var1 = this.getBASId();
		return var1 == -1 ? BASTypeList.field11886 : (BASType) Client.basTypeList.list(var1);
	}

	@ObfuscatedName("ahm.cl(B)V")
	public void removeChatLine() {
		if (this.currentChatLine != null && this.currentChatLine.text != null) {
			this.currentChatLine.time--;
			if (this.currentChatLine.time == 0) {
				this.currentChatLine.text = null;
			}
		}
	}

	@ObfuscatedName("ahm.cu(Ljava/lang/String;IIII)V")
	public void setChatLine(String text, int color, int effect, int time) {
		if (this.currentChatLine == null) {
			this.currentChatLine = new EntityChatLine();
		}
		this.currentChatLine.text = text;
		this.currentChatLine.colour = color;
		this.currentChatLine.effect = effect;
		this.currentChatLine.time = this.currentChatLine.field6685 = time;
	}

	@ObfuscatedName("ahm.ci(I)Z")
	public boolean method16515() {
		return this.field10439 == -1 ? false : this.method16516(this.field10439);
	}

	@ObfuscatedName("ahm.cn(II)Z")
	public boolean method16516(int arg0) {
		if (this.field10462 == arg0) {
			return true;
		}
		this.field10461 = Component.method5405(arg0, null, null, true);
		if (this.field10461 == null) {
			return false;
		} else {
			this.field10462 = arg0;
			ScriptRunner.executeOnLoadComponents(this.field10461.components);
			return true;
		}
	}

	@ObfuscatedName("ahm.cv(IIIIIIIII)V")
	public void method16571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.method16515()) {
			Client.updateInterfaceAnimation(this.field10461, this.field10461.method3923(), -1, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		}
	}

	@ObfuscatedName("ahm.cp(IIIIIIII)V")
	public void method16518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.method16515()) {
			Client.drawInterfaceComponents(this.field10461.method3923(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg0, false);
		} else if (arg0 == -1) {
			for (int var8 = 0; var8 < 114; var8++) {
				Client.topLevelComponentRedrawRequestedTemp[var8] = true;
			}
		} else {
			Client.topLevelComponentRedrawRequestedTemp[arg0] = true;
		}
	}

	@ObfuscatedName("ahm.ca(IIZB)V")
	public void method16519(int arg0, int arg1, boolean arg2) {
		if (this.method16515()) {
			Client.method1597(this.field10461.components, -1, arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("ahm.cw(I)Lve;")
	public CoordGrid coord() {
		Vector3 var1 = this.getTransform().trans;
		CoordGrid var2 = Client.world.getBase();
		int var3 = ((int) var1.x >> 9) + var2.x;
		int var4 = ((int) var1.z >> 9) + var2.z;
		return new CoordGrid(this.level, var3, var4);
	}

	@ObfuscatedName("ahm.ct(I)Lakt;")
	public CoordFine coordFine() {
		Vector3 var1 = this.getTransform().trans;
		CoordGrid var2 = Client.world.getBase();
		int var3 = var2.x * 512 + (int) var1.x;
		int var4 = (int) var1.y;
		int var5 = var2.z * 512 + (int) var1.z;
		return new CoordFine(this.level, var3, var4, var5);
	}

	public void finalize() {
		if (this.field10393 != null) {
			this.field10393.method9932();
		}
	}

	@ObfuscatedName("ahm.bs(B)I")
	public abstract int getCoverMarker();

	@ObfuscatedName("ahm.bj(S)I")
	public abstract int getBASId();

	@ObfuscatedName("ahm.cg(I)Z")
	public abstract boolean showChat();

	@ObfuscatedName("ahm.ce(I)Lsu;")
	public abstract EntityChatLine getChatLine();

	@ObfuscatedName("ahm.cx(I)I")
	public abstract int targeted();
}
