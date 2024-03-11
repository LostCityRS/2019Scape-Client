package com.jagex.game.cutscene;

import deob.ObfuscatedName;

@ObfuscatedName("adr")
public class CutsceneCommand {

	@ObfuscatedName("adr.e")
	public static final CutsceneCommand CAM_MOVE = new CutsceneCommand(23, 0);

	@ObfuscatedName("adr.n")
	public static final CutsceneCommand CAM_MOVEALONG = new CutsceneCommand(29, 1);

	@ObfuscatedName("adr.m")
	public static final CutsceneCommand field9220 = new CutsceneCommand(18, 2);

	@ObfuscatedName("adr.k")
	public static final CutsceneCommand field9240 = new CutsceneCommand(17, 3);

	@ObfuscatedName("adr.f")
	public static final CutsceneCommand ENTITY_MOVE = new CutsceneCommand(1, 10);

	@ObfuscatedName("adr.w")
	public static final CutsceneCommand ENTITY_DEL = new CutsceneCommand(13, 11);

	@ObfuscatedName("adr.l")
	public static final CutsceneCommand ENTITY_ROUTE = new CutsceneCommand(6, 12);

	@ObfuscatedName("adr.u")
	public static final CutsceneCommand ENTITY_SAY = new CutsceneCommand(11, 13);

	@ObfuscatedName("adr.z")
	public static final CutsceneCommand ENTITY_ANIM = new CutsceneCommand(12, 14);

	@ObfuscatedName("adr.p")
	public static final CutsceneCommand ENTITY_HITMARK = new CutsceneCommand(0, 15);

	@ObfuscatedName("adr.d")
	public static final CutsceneCommand ENTITY_LOOK = new CutsceneCommand(9, 16);

	@ObfuscatedName("adr.c")
	public static final CutsceneCommand ENTITY_SPOTANIM = new CutsceneCommand(24, 17);

	@ObfuscatedName("adr.r")
	public static final CutsceneCommand LOC_CREATE = new CutsceneCommand(14, 20);

	@ObfuscatedName("adr.v")
	public static final CutsceneCommand LOC_DEL = new CutsceneCommand(20, 21);

	@ObfuscatedName("adr.o")
	public static final CutsceneCommand LOC_ANIM = new CutsceneCommand(21, 22);

	@ObfuscatedName("adr.s")
	public static final CutsceneCommand SOUND_SONG = new CutsceneCommand(25, 30);

	@ObfuscatedName("adr.y")
	public static final CutsceneCommand field9246 = new CutsceneCommand(3, 31);

	@ObfuscatedName("adr.q")
	public static final CutsceneCommand SOUND_JINGLE = new CutsceneCommand(5, 32);

	@ObfuscatedName("adr.x")
	public static final CutsceneCommand SOUND_VORBIS = new CutsceneCommand(22, 33);

	@ObfuscatedName("adr.b")
	public static final CutsceneCommand FADE = new CutsceneCommand(19, 40);

	@ObfuscatedName("adr.h")
	public static final CutsceneCommand TEXT_COROD = new CutsceneCommand(8, 41);

	@ObfuscatedName("adr.a")
	public static final CutsceneCommand MAP_ANIM = new CutsceneCommand(28, 42);

	@ObfuscatedName("adr.g")
	public static final CutsceneCommand field9243 = new CutsceneCommand(7, 43);

	@ObfuscatedName("adr.i")
	public static final CutsceneCommand PROJANIM_ENTITY_ENTITY = new CutsceneCommand(10, 50);

	@ObfuscatedName("adr.j")
	public static final CutsceneCommand PROJANIM_COORD_ENTITY = new CutsceneCommand(26, 51);

	@ObfuscatedName("adr.t")
	public static final CutsceneCommand PROJANIM_COORD_COORD = new CutsceneCommand(15, 52);

	@ObfuscatedName("adr.ae")
	public static final CutsceneCommand PROJANIM_ENTITY_COORD = new CutsceneCommand(27, 53);

	@ObfuscatedName("adr.ag")
	public static final CutsceneCommand SET_VAR = new CutsceneCommand(16, 60);

	@ObfuscatedName("adr.ah")
	public static final CutsceneCommand SET_VARBIT = new CutsceneCommand(4, 61);

	@ObfuscatedName("adr.al")
	public static final CutsceneCommand SUBTITLE = new CutsceneCommand(30, 70);

	@ObfuscatedName("adr.ac")
	public static final CutsceneCommand FINISH = new CutsceneCommand(2, 255);

	@ObfuscatedName("adr.ai")
	public final int scrambleId;

	@ObfuscatedName("adr.aw")
	public int id;

	@ObfuscatedName("aag.e(B)[Ladr;")
	public static CutsceneCommand[] values() {
		return new CutsceneCommand[] { SET_VAR, SUBTITLE, SOUND_JINGLE, SOUND_SONG, field9243, PROJANIM_ENTITY_ENTITY, ENTITY_DEL, CAM_MOVE, field9240, LOC_ANIM, LOC_CREATE, field9246, TEXT_COROD, PROJANIM_ENTITY_COORD, ENTITY_SAY, LOC_DEL, ENTITY_LOOK, ENTITY_MOVE, FADE, PROJANIM_COORD_ENTITY, FINISH, ENTITY_HITMARK, CAM_MOVEALONG, field9220, PROJANIM_COORD_COORD, ENTITY_ROUTE, ENTITY_ANIM, SET_VARBIT, ENTITY_SPOTANIM, SOUND_VORBIS, MAP_ANIM };
	}

	public CutsceneCommand(int arg0, int arg1) {
		this.scrambleId = arg0;
		this.id = arg1;
	}

	@ObfuscatedName("fp.n(IB)Ladr;")
	public static CutsceneCommand method3108(int id) {
		CutsceneCommand[] values = values();
		CutsceneCommand[] ref = values;

		for (int i = 0; i < ref.length; i++) {
			CutsceneCommand command = ref[i];
			if (command.id == id) {
				return command;
			}
		}

		return null;
	}
}
