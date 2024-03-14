package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ew")
public abstract class CutsceneAction {

	@ObfuscatedName("ew.e")
	public final int field1750;

	public CutsceneAction(Packet arg0) {
		this.field1750 = arg0.g2();
	}

	@ObfuscatedName("aap.e(Lalw;I)Lew;")
	public static CutsceneAction method14342(Packet arg0) {
		int var1 = arg0.g1();
		CutsceneCommand var2 = CutsceneCommand.method3108(var1);
		CutsceneAction var3 = null;
		switch(var2.scrambleId) {
			case 0:
				var3 = new EntityHitmarkCutsceneAction(arg0);
				break;
			case 1:
				var3 = new EntityMoveCutsceneAction(arg0);
				break;
			case 2:
				var3 = new FinishCutsceneAction(arg0);
				break;
			case 3:
				var3 = new CutsceneActionOp31(arg0);
				break;
			case 4:
				var3 = new SetVarbitCutsceneAction(arg0, true);
				break;
			case 5:
				var3 = new SoundJingleCutsceneAction(arg0);
				break;
			case 6:
				var3 = new EntityRouteCutsceneAction(arg0);
				break;
			case 7:
			case 17:
			case 18:
			default:
				break;
			case 8:
				var3 = new TextCoordCutsceneAction(arg0);
				break;
			case 9:
				var3 = new EntityLookCutsceneAction(arg0);
				break;
			case 10:
				var3 = new ProjAnimCutsceneAction(arg0, 1, 1);
				break;
			case 11:
				var3 = new EntitySayCutsceneAction(arg0);
				break;
			case 12:
				var3 = new EntityAnimCutsceneAction(arg0);
				break;
			case 13:
				var3 = new EntityDelCutsceneAction(arg0);
				break;
			case 14:
				var3 = new LocCreateCutsceneAction(arg0);
				break;
			case 15:
				var3 = new ProjAnimCutsceneAction(arg0, 0, 0);
				break;
			case 16:
				var3 = new SetVarbitCutsceneAction(arg0, false);
				break;
			case 19:
				var3 = new FadeCutsceneAction(arg0);
				break;
			case 20:
				var3 = new LocDelCutsceneAction(arg0);
				break;
			case 21:
				var3 = new LocAnimCutsceneAction(arg0);
				break;
			case 22:
				var3 = new SoundVorbisCutsceneAction(arg0);
				break;
			case 23:
				var3 = new CamMoveCutsceneAction(arg0);
				break;
			case 24:
				var3 = new EntitySpotAnimCutsceneAction(arg0);
				break;
			case 25:
				var3 = new SoundSongCutsceneAction(arg0);
				break;
			case 26:
				var3 = new ProjAnimCutsceneAction(arg0, 0, 1);
				break;
			case 27:
				var3 = new ProjAnimCutsceneAction(arg0, 1, 0);
				break;
			case 28:
				var3 = new MapAnimCutsceneAction(arg0);
				break;
			case 29:
				var3 = new CamMoveAlongCutsceneAction(arg0);
				break;
			case 30:
				var3 = new SubtitleCutsceneAction(arg0);
				break;
		}
		return var3;
	}

	@ObfuscatedName("ew.m(I)V")
	public void method2896() {
	}

	@ObfuscatedName("ew.k(I)Z")
	public boolean method2891() {
		return true;
	}

	@ObfuscatedName("ew.n(I)V")
	public abstract void method2890();
}
