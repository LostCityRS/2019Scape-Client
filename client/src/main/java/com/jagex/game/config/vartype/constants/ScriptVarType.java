package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.utils.Cp1252;
import com.jagex.game.script.ScriptVarInterface;
import com.jagex.game.script.ScriptVarProperty;
import com.jagex.game.shared.movement.CoordFine;
import deob.ObfuscatedName;

@ObfuscatedName("qw")
public class ScriptVarType implements SerializableEnum, ScriptVarInterface {

	@ObfuscatedName("qw.e")
	public static final ScriptVarType INT = new ScriptVarType(0, 'i', BaseVarType.INTEGER, 0, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.n")
	public static final ScriptVarType BOOLEAN = new ScriptVarType(1, '1', BaseVarType.INTEGER, 0, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.m")
	public static final ScriptVarType field4636 = new ScriptVarType(2, '2', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829 });

	@ObfuscatedName("qw.k")
	public static final ScriptVarType QUEST = new ScriptVarType(3, ':', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.f")
	public static final ScriptVarType QUESTHELP = new ScriptVarType(4, ';', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.w")
	public static final ScriptVarType CURSOR = new ScriptVarType(5, '@', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.l")
	public static final ScriptVarType SEQ = new ScriptVarType(6, 'A', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.u")
	public static final ScriptVarType COLOUR = new ScriptVarType(7, 'C', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.z")
	public static final ScriptVarType LOC_SHAPE = new ScriptVarType(8, 'H', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.p")
	public static final ScriptVarType COMPONENT = new ScriptVarType(9, 'I', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.d")
	public static final ScriptVarType IDKIT = new ScriptVarType(10, 'K', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.c")
	public static final ScriptVarType MIDI = new ScriptVarType(11, 'M', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.r")
	public static final ScriptVarType NPC_MODE = new ScriptVarType(12, 'N', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.v")
	public static final ScriptVarType NAMEDOBJ = new ScriptVarType(13, 'O', BaseVarType.INTEGER, -1, new ScriptVarProperty[0]);

	@ObfuscatedName("qw.o")
	public static final ScriptVarType SYNTH = new ScriptVarType(14, 'P', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.s")
	public static final ScriptVarType field4649 = new ScriptVarType(15, 'Q', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829 });

	@ObfuscatedName("qw.y")
	public static final ScriptVarType AREA = new ScriptVarType(16, 'R', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.q")
	public static final ScriptVarType STAT = new ScriptVarType(17, 'S', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4834, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.x")
	public static final ScriptVarType NPC_STAT = new ScriptVarType(18, 'T', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.b")
	public static final ScriptVarType WRITEINV = new ScriptVarType(19, 'V', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.h")
	public static final ScriptVarType MESH = new ScriptVarType(20, '^', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.a")
	public static final ScriptVarType MAPAREA = new ScriptVarType(21, '`', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.g")
	public static final ScriptVarType COORDGRID = new ScriptVarType(22, 'c', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.i")
	public static final ScriptVarType GRAPHIC = new ScriptVarType(23, 'd', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.j")
	public static final ScriptVarType CHATPHRASE = new ScriptVarType(24, 'e', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.t")
	public static final ScriptVarType FONTMETRICS = new ScriptVarType(25, 'f', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ae")
	public static final ScriptVarType ENUM = new ScriptVarType(26, 'g', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ag")
	public static final ScriptVarType field4661 = new ScriptVarType(27, 'h', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.ah")
	public static final ScriptVarType JINGLE = new ScriptVarType(28, 'j', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.al")
	public static final ScriptVarType CHATCAT = new ScriptVarType(29, 'k', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ac")
	public static final ScriptVarType LOC = new ScriptVarType(30, 'l', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ai")
	public static final ScriptVarType MODEL = new ScriptVarType(31, 'm', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.aw")
	public static final ScriptVarType NPC = new ScriptVarType(32, 'n', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4834, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.as")
	public static final ScriptVarType OBJ = new ScriptVarType(33, 'o', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.at")
	public static final ScriptVarType PLAYER_UID = new ScriptVarType(34, 'p', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ad")
	public static final ScriptVarType field4760 = new ScriptVarType(35, 'r', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.am")
	public static final ScriptVarType STRING = new ScriptVarType(36, 's', BaseVarType.STRING, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.au")
	public static final ScriptVarType SPOTANIM = new ScriptVarType(37, 't', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ar")
	public static final ScriptVarType NPC_UID = new ScriptVarType(38, 'u', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ap")
	public static final ScriptVarType INV = new ScriptVarType(39, 'v', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.aq")
	public static final ScriptVarType TEXTURE = new ScriptVarType(40, 'x', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ax")
	public static final ScriptVarType CATEGORY = new ScriptVarType(41, 'y', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.av")
	public static final ScriptVarType CHAR = new ScriptVarType(42, 'z', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ao")
	public static final ScriptVarType LASER = new ScriptVarType(43, '|', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.aj")
	public static final ScriptVarType BAS = new ScriptVarType(44, '€', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ay")
	public static final ScriptVarType field4679 = new ScriptVarType(45, 'ƒ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.ab")
	public static final ScriptVarType COLLISION_GEOMETRY = new ScriptVarType(46, '‡', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.az")
	public static final ScriptVarType PHYSICS_MODEL = new ScriptVarType(47, '‰', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.aa")
	public static final ScriptVarType PHYSICS_CONTROL_MODIFIER = new ScriptVarType(48, 'Š', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.af")
	public static final ScriptVarType CLANHASH = new ScriptVarType(49, 'Œ', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.ak")
	public static final ScriptVarType COORDFINE = new ScriptVarType(50, 'Ž', BaseVarType.COORDFINE, new CoordFine(), new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.an")
	public static final ScriptVarType CUTSCENE = new ScriptVarType(51, 'š', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bf")
	public static final ScriptVarType ITEMCODE = new ScriptVarType(53, '¡', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bl")
	public static final ScriptVarType field4771 = new ScriptVarType(54, '¢', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.bk")
	public static final ScriptVarType MAPSCENEICON = new ScriptVarType(55, '£', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bh")
	public static final ScriptVarType CLANFORUMQFC = new ScriptVarType(56, '§', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bx")
	public static final ScriptVarType VORBIS = new ScriptVarType(57, '«', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bd")
	public static final ScriptVarType VERIFY_OBJECT = new ScriptVarType(58, '®', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bc")
	public static final ScriptVarType MAPELEMENT = new ScriptVarType(59, 'µ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bi")
	public static final ScriptVarType CATEGORYTYPE = new ScriptVarType(60, '¶', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bn")
	public static final ScriptVarType SOCIAL_NETWORK = new ScriptVarType(61, 'Æ', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bt")
	public static final ScriptVarType HITMARK = new ScriptVarType(62, '×', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bq")
	public static final ScriptVarType PACKAGE = new ScriptVarType(63, 'Þ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bm")
	public static final ScriptVarType PARTICLE_EFFECTOR = new ScriptVarType(64, 'á', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bb")
	public static final ScriptVarType field4639 = new ScriptVarType(65, 'æ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830 });

	@ObfuscatedName("qw.be")
	public static final ScriptVarType PARTICLE_EMITTER = new ScriptVarType(66, 'é', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.by")
	public static final ScriptVarType PLOGTYPE = new ScriptVarType(67, 'í', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bu")
	public static final ScriptVarType UNSIGNED_INT = new ScriptVarType(68, 'î', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bw")
	public static final ScriptVarType SKYBOX = new ScriptVarType(69, 'ó', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bo")
	public static final ScriptVarType SKYDECOR = new ScriptVarType(70, 'ú', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.bz")
	public static final ScriptVarType HASH64 = new ScriptVarType(71, 'û', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4828, ScriptVarProperty.field4830, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.bv")
	public static final ScriptVarType INPUTTYPE = new ScriptVarType(72, 'Î', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.br")
	public static final ScriptVarType STRUCT = new ScriptVarType(73, 'J', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.bg")
	public static final ScriptVarType DBROW = new ScriptVarType(74, 'Ð', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.ba")
	public static final ScriptVarType field4796 = new ScriptVarType(75, '¤', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.bp")
	public static final ScriptVarType field4685 = new ScriptVarType(76, '¥', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.bj")
	public static final ScriptVarType field4752 = new ScriptVarType(77, 'è', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.bs")
	public static final ScriptVarType field4711 = new ScriptVarType(78, '¹', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.cl")
	public static final ScriptVarType field4712 = new ScriptVarType(79, '°', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.cg")
	public static final ScriptVarType field4713 = new ScriptVarType(80, 'ì', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.ce")
	public static final ScriptVarType field4714 = new ScriptVarType(81, 'ë', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.cu")
	public static final ScriptVarType field4747 = new ScriptVarType(83, 'þ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.ci")
	public static final ScriptVarType field4716 = new ScriptVarType(84, 'ý', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.cn")
	public static final ScriptVarType field4764 = new ScriptVarType(85, 'ÿ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.cv")
	public static final ScriptVarType field4718 = new ScriptVarType(86, 'õ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.cp")
	public static final ScriptVarType field4719 = new ScriptVarType(87, 'ô', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.ca")
	public static final ScriptVarType field4720 = new ScriptVarType(88, 'ö', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.cx")
	public static final ScriptVarType GWC_PLATFORM = new ScriptVarType(89, 'ò', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cw")
	public static final ScriptVarType field4654 = new ScriptVarType(90, 'Ü', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.ct")
	public static final ScriptVarType field4723 = new ScriptVarType(91, 'ù', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.cf")
	public static final ScriptVarType field4724 = new ScriptVarType(92, 'ï', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.co")
	public static final ScriptVarType field4748 = new ScriptVarType(93, '¯', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.cr")
	public static final ScriptVarType BUG_TEMPLATE = new ScriptVarType(94, 'ê', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cm")
	public static final ScriptVarType BILLING_AUTH_FLAG = new ScriptVarType(95, 'ð', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cq")
	public static final ScriptVarType ACCOUNT_FEATURE_FLAG = new ScriptVarType(96, 'å', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ch")
	public static final ScriptVarType INTERFACE = new ScriptVarType(97, 'a', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cb")
	public static final ScriptVarType TOPLEVELINTERFACE = new ScriptVarType(98, 'F', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cs")
	public static final ScriptVarType OVERLAYINTERFACE = new ScriptVarType(99, 'L', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cy")
	public static final ScriptVarType CLIENTINTERFACE = new ScriptVarType(100, '©', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cc")
	public static final ScriptVarType MOVESPEED = new ScriptVarType(101, 'Ý', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cz")
	public static final ScriptVarType MATERIAL = new ScriptVarType(102, '¬', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ck")
	public static final ScriptVarType SEQGROUP = new ScriptVarType(103, 'ø', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cj")
	public static final ScriptVarType TEMP_HISCORE = new ScriptVarType(104, 'ä', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.cd")
	public static final ScriptVarType TEMP_HISCORE_LENGTH_TYPE = new ScriptVarType(105, 'ã', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dd")
	public static final ScriptVarType TEMP_HISCORE_DISPLAY_TYPE = new ScriptVarType(106, 'â', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dr")
	public static final ScriptVarType TEMP_HISCORE_CONTRIBUTE_RESULT = new ScriptVarType(107, 'à', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.da")
	public static final ScriptVarType AUDIOGROUP = new ScriptVarType(108, 'À', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dt")
	public static final ScriptVarType AUDIOMIXBUSS = new ScriptVarType(109, 'Ò', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.do")
	public static final ScriptVarType LONG = new ScriptVarType(110, 'Ï', BaseVarType.LONG, 0L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.dz")
	public static final ScriptVarType CRM_CHANNEL = new ScriptVarType(111, 'Ì', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dv")
	public static final ScriptVarType HTTP_IMAGE = new ScriptVarType(112, 'É', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dm")
	public static final ScriptVarType POP_UP_DISPLAY_BEHAVIOUR = new ScriptVarType(113, 'Ê', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dq")
	public static final ScriptVarType POLL = new ScriptVarType(114, '÷', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.dc")
	public static final ScriptVarType field4648 = new ScriptVarType(115, '¼', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.di")
	public static final ScriptVarType field4687 = new ScriptVarType(116, '½', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.dk")
	public static final ScriptVarType POINTLIGHT = new ScriptVarType(117, '•', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dn")
	public static final ScriptVarType PLAYER_GROUP = new ScriptVarType(118, 'Â', BaseVarType.LONG, -1L, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4830, ScriptVarProperty.field4828, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.df")
	public static final ScriptVarType PLAYER_GROUP_STATUS = new ScriptVarType(119, 'Ã', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dw")
	public static final ScriptVarType PLAYER_GROUP_INVITE_RESULT = new ScriptVarType(120, 'Å', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.ds")
	public static final ScriptVarType PLAYER_GROUP_MODIFY_RESULT = new ScriptVarType(121, 'Ë', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.du")
	public static final ScriptVarType PLAYER_GROUP_JOIN_OR_CREATE_RESULT = new ScriptVarType(122, 'Í', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dl")
	public static final ScriptVarType PLAEYR_GROUP_AFFINITY_MODIFY_RESULT = new ScriptVarType(123, 'Õ', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dp")
	public static final ScriptVarType PLAYER_GROUP_DELTA_TYPE = new ScriptVarType(124, '²', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dy")
	public static final ScriptVarType CLIENT_TYPE = new ScriptVarType(125, 'ª', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.db")
	public static final ScriptVarType TELEMETRY_INTERVAL = new ScriptVarType(126, '\u0000', BaseVarType.INTEGER, 0, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4828, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dh")
	public static final ScriptVarType field4759 = new ScriptVarType(127, '\u0000', BaseVarType.INTEGER, -1, "", new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4834, ScriptVarProperty.field4832, ScriptVarProperty.field4833 });

	@ObfuscatedName("qw.dx")
	public static final ScriptVarType field4691 = new ScriptVarType(128, '\u0000', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.dg")
	public static final ScriptVarType field4761 = new ScriptVarType(129, 'Ø', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4829, ScriptVarProperty.field4830, ScriptVarProperty.field4832, ScriptVarProperty.field4833, ScriptVarProperty.field4834 });

	@ObfuscatedName("qw.de")
	public static final ScriptVarType field4762 = new ScriptVarType(200, 'X', BaseVarType.INTEGER, -1, new ScriptVarProperty[0]);

	@ObfuscatedName("qw.dj")
	public static final ScriptVarType field4763 = new ScriptVarType(201, 'W', BaseVarType.INTEGER, -1, new ScriptVarProperty[0]);

	@ObfuscatedName("qw.eo")
	public static final ScriptVarType field4777 = new ScriptVarType(202, 'b', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.ey")
	public static final ScriptVarType field4765 = new ScriptVarType(203, 'B', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.eu")
	public static final ScriptVarType field4766 = new ScriptVarType(204, '4', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.ed")
	public static final ScriptVarType field4664 = new ScriptVarType(205, 'w', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.ee")
	public static final ScriptVarType field4768 = new ScriptVarType(206, 'q', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.es")
	public static final ScriptVarType field4769 = new ScriptVarType(207, '0', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831, ScriptVarProperty.field4832 });

	@ObfuscatedName("qw.ei")
	public static final ScriptVarType field4770 = new ScriptVarType(208, '6', BaseVarType.INTEGER, -1, new ScriptVarProperty[] { ScriptVarProperty.field4831 });

	@ObfuscatedName("qw.el")
	public static final ScriptVarType field4726 = new ScriptVarType(BaseVarType.INTEGER, -1, '#');

	@ObfuscatedName("qw.ej")
	public static final ScriptVarType field4772 = new ScriptVarType(BaseVarType.INTEGER, -1, '(');

	@ObfuscatedName("qw.ep")
	public static final ScriptVarType field4750 = new ScriptVarType(BaseVarType.INTEGER, -1, '%');

	@ObfuscatedName("qw.ev")
	public static final ScriptVarType field4774 = new ScriptVarType(BaseVarType.INTEGER, -1, '&');

	@ObfuscatedName("qw.ec")
	public static final ScriptVarType field4775 = new ScriptVarType(BaseVarType.INTEGER, -1, ')');

	@ObfuscatedName("qw.ek")
	public static final ScriptVarType field4776 = new ScriptVarType(BaseVarType.INTEGER, -1, '3');

	@ObfuscatedName("qw.em")
	public static final ScriptVarType field4745 = new ScriptVarType(BaseVarType.INTEGER, -1, '5');

	@ObfuscatedName("qw.eh")
	public static final ScriptVarType field4676 = new ScriptVarType(BaseVarType.INTEGER, -1, '7');

	@ObfuscatedName("qw.eq")
	public static final ScriptVarType field4773 = new ScriptVarType(BaseVarType.INTEGER, -1, '8');

	@ObfuscatedName("qw.eg")
	public static final ScriptVarType field4780 = new ScriptVarType(BaseVarType.INTEGER, -1, '9');

	@ObfuscatedName("qw.ez")
	public static final ScriptVarType field4778 = new ScriptVarType(BaseVarType.INTEGER, -1, 'D');

	@ObfuscatedName("qw.ef")
	public static final ScriptVarType field4782 = new ScriptVarType(BaseVarType.INTEGER, -1, 'G');

	@ObfuscatedName("qw.et")
	public static final ScriptVarType field4783 = new ScriptVarType(BaseVarType.INTEGER, -1, 'U');

	@ObfuscatedName("qw.ea")
	public static final ScriptVarType field4784 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Á');

	@ObfuscatedName("qw.ew")
	public static final ScriptVarType field4785 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Z');

	@ObfuscatedName("qw.er")
	public static final ScriptVarType field4786 = new ScriptVarType(BaseVarType.INTEGER, -1, '~');

	@ObfuscatedName("qw.en")
	public static final ScriptVarType field4787 = new ScriptVarType(BaseVarType.INTEGER, -1, '±');

	@ObfuscatedName("qw.eb")
	public static final ScriptVarType field4646 = new ScriptVarType(BaseVarType.INTEGER, -1, '»');

	@ObfuscatedName("qw.ex")
	public static final ScriptVarType field4789 = new ScriptVarType(BaseVarType.INTEGER, -1, '¿');

	@ObfuscatedName("qw.fg")
	public static final ScriptVarType field4790 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ç');

	@ObfuscatedName("qw.fm")
	public static final ScriptVarType field4791 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ñ');

	@ObfuscatedName("qw.fu")
	public static final ScriptVarType field4722 = new ScriptVarType(BaseVarType.INTEGER, -1, 'ñ');

	@ObfuscatedName("qw.fs")
	public static final ScriptVarType field4793 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ù');

	@ObfuscatedName("qw.fz")
	public static final ScriptVarType field4817 = new ScriptVarType(BaseVarType.INTEGER, -1, 'ß');

	@ObfuscatedName("qw.fj")
	public static final ScriptVarType field4795 = new ScriptVarType(BaseVarType.INTEGER, -1, 'E');

	@ObfuscatedName("qw.fd")
	public static final ScriptVarType field4658 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Y');

	@ObfuscatedName("qw.fn")
	public static final ScriptVarType field4797 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ä');

	@ObfuscatedName("qw.fi")
	public static final ScriptVarType field4798 = new ScriptVarType(BaseVarType.INTEGER, -1, 'ü');

	@ObfuscatedName("qw.ft")
	public static final ScriptVarType field4799 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ú');

	@ObfuscatedName("qw.fx")
	public static final ScriptVarType field4800 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Û');

	@ObfuscatedName("qw.fv")
	public static final ScriptVarType field4703 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ó');

	@ObfuscatedName("qw.fc")
	public static final ScriptVarType field4802 = new ScriptVarType(BaseVarType.INTEGER, -1, 'È');

	@ObfuscatedName("qw.fw")
	public static final ScriptVarType field4803 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ô');

	@ObfuscatedName("qw.fa")
	public static final ScriptVarType field4804 = new ScriptVarType(BaseVarType.INTEGER, -1, '¾');

	@ObfuscatedName("qw.fp")
	public static final ScriptVarType field4805 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ö');

	@ObfuscatedName("qw.fq")
	public static final ScriptVarType field4806 = new ScriptVarType(BaseVarType.INTEGER, -1, '³');

	@ObfuscatedName("qw.ff")
	public static final ScriptVarType field4807 = new ScriptVarType(BaseVarType.INTEGER, -1, '·');

	@ObfuscatedName("qw.fl")
	public static final ScriptVarType field4733 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.fb")
	public static final ScriptVarType field4809 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.fo")
	public static final ScriptVarType field4779 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.fy")
	public static final ScriptVarType field4811 = new ScriptVarType(BaseVarType.INTEGER, -1, 'º');

	@ObfuscatedName("qw.fe")
	public static final ScriptVarType field4812 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.fk")
	public static final ScriptVarType field4698 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.fh")
	public static final ScriptVarType field4814 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.fr")
	public static final ScriptVarType field4815 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@ObfuscatedName("qw.gu")
	public static final ScriptVarType field4706 = new ScriptVarType(null, -1, '!');

	@ObfuscatedName("qw.gq")
	public static final ScriptVarType field4736 = new ScriptVarType(null, -1, '$');

	@ObfuscatedName("qw.gl")
	public static final ScriptVarType field4818 = new ScriptVarType(null, -1, '?');

	@ObfuscatedName("qw.go")
	public static final ScriptVarType field4819 = new ScriptVarType(null, -1, 'ç');

	@ObfuscatedName("qw.gk")
	public static final ScriptVarType field4820 = new ScriptVarType(null, -1, '*');

	@ObfuscatedName("qw.gp")
	public final int serialID;

	@ObfuscatedName("qw.gy")
	public final char legacyChar;

	@ObfuscatedName("qw.ga")
	public final BaseVarType baseType;

	@ObfuscatedName("qw.gn")
	public Object defaultValue;

	@ObfuscatedName("qw.gc")
	public static ScriptVarType[] varByLegacyChar;

	@ObfuscatedName("qw.e(I)[Lqw;")
	public static ScriptVarType[] values() {
		return new ScriptVarType[] { field4812, field4720, field4771, BILLING_AUTH_FLAG, PLAYER_GROUP_STATUS, MODEL, field4795, field4713, field4762, field4747, VORBIS, field4809, MAPAREA, field4654, CHATPHRASE, field4779, field4687, field4799, field4798, CLANFORUMQFC, SEQGROUP, field4736, PACKAGE, SPOTANIM, field4820, CRM_CHANNEL, field4803, field4774, field4752, field4804, GWC_PLATFORM, field4789, IDKIT, field4691, MAPELEMENT, STRUCT, BAS, NPC, field4784, PLAEYR_GROUP_AFFINITY_MODIFY_RESULT, field4817, MAPSCENEICON, POP_UP_DISPLAY_BEHAVIOUR, field4745, QUEST, field4778, field4698, TELEMETRY_INTERVAL, PLAYER_GROUP, field4800, field4761, LOC_SHAPE, CATEGORYTYPE, INTERFACE, field4646, CHATCAT, PARTICLE_EFFECTOR, field4648, field4718, field4724, field4772, field4719, HASH64, field4763, CLIENTINTERFACE, CLANHASH, field4733, field4679, POLL, QUESTHELP, CATEGORY, field4793, field4716, TOPLEVELINTERFACE, COMPONENT, field4783, TEMP_HISCORE_CONTRIBUTE_RESULT, STAT, field4807, PHYSICS_CONTROL_MODIFIER, POINTLIGHT, WRITEINV, field4805, field4777, TEMP_HISCORE_DISPLAY_TYPE, field4776, field4791, field4773, field4658, field4766, CHAR, field4723, GRAPHIC, PHYSICS_MODEL, field4768, field4775, field4636, PLOGTYPE, SEQ, field4750, field4785, field4760, NPC_MODE, UNSIGNED_INT, field4769, field4726, SOCIAL_NETWORK, field4714, field4797, TEMP_HISCORE_LENGTH_TYPE, field4819, field4676, FONTMETRICS, field4759, COLOUR, CURSOR, field4815, field4818, field4722, field4802, AUDIOGROUP, field4703, TEMP_HISCORE, HTTP_IMAGE, OBJ, field4706, field4664, field4764, field4685, HITMARK, INPUTTYPE, PLAYER_GROUP_JOIN_OR_CREATE_RESULT, PLAYER_GROUP_MODIFY_RESULT, COLLISION_GEOMETRY, SKYDECOR, SYNTH, field4765, NPC_UID, field4748, COORDFINE, field4790, field4787, PLAYER_GROUP_DELTA_TYPE, field4649, PLAYER_UID, AREA, CUTSCENE, MOVESPEED, field4780, field4811, field4712, INV, ACCOUNT_FEATURE_FLAG, field4661, field4814, NPC_STAT, ITEMCODE, VERIFY_OBJECT, STRING, LOC, field4711, NAMEDOBJ, field4786, PARTICLE_EMITTER, SKYBOX, LASER, MIDI, MESH, INT, AUDIOMIXBUSS, field4639, field4806, DBROW, CLIENT_TYPE, JINGLE, BUG_TEMPLATE, BOOLEAN, PLAYER_GROUP_INVITE_RESULT, MATERIAL, field4782, field4770, COORDGRID, ENUM, LONG, TEXTURE, OVERLAYINTERFACE, field4796 };
	}

	public ScriptVarType(BaseVarType baseType, Object defaultValue, char legacyChar) {
		this(-1, legacyChar, baseType, defaultValue, new ScriptVarProperty[0]);
	}

	public ScriptVarType(int serialID, char legacyChar, BaseVarType baseType, Object defaultValue, ScriptVarProperty[] arg4) {
		this(serialID, legacyChar, baseType, defaultValue, (String) null, arg4);
	}

	public ScriptVarType(int serialID, char legacyChar, BaseVarType baseType, Object defaultValue, String arg4, ScriptVarProperty[] arg5) {
		this.serialID = serialID;
		this.legacyChar = legacyChar;
		this.baseType = baseType;
		this.defaultValue = defaultValue;
		if (arg4 != null && arg4.length() > 0) {
		}
		method7291(this);
	}

	@ObfuscatedName("qw.m(Lqw;B)V")
	public static void method7291(ScriptVarType arg0) {
		if (varByLegacyChar == null) {
			varByLegacyChar = new ScriptVarType[256];
		}
		varByLegacyChar[Cp1252.encode(arg0.legacyChar) & 0xFF] = arg0;
	}

	@ObfuscatedName("qw.f(B)Lqa;")
	public BaseVarType getVarBaseType() {
		return this.baseType;
	}

	@ObfuscatedName("qw.w(CB)Lqw;")
	public static ScriptVarType getByLegacyChar(char arg0) {
		return arg0 == 'O' ? OBJ : varByLegacyChar[Cp1252.encode(arg0) & 0xFF];
	}

	@ObfuscatedName("qw.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("qw.l(I)Ljava/lang/Object;")
	public Object getDefaultValue() {
		return this.defaultValue;
	}
}
