package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class ScriptVarType implements SerializableEnum, Interface54 {

	@OriginalMember(owner = "client!qw", name = "gc", descriptor = "[Lclient!qw;")
	public static ScriptVarType[] CHAR_CODE_LOOKUP;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "Lclient!qw;")
	public static final ScriptVarType INT = new ScriptVarType(0, 'i', BaseVarType.INTEGER, 0, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "Lclient!qw;")
	public static final ScriptVarType BOOLEAN = new ScriptVarType(1, '1', BaseVarType.INTEGER, 0, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_2 = new ScriptVarType(2, '2', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2 });

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "Lclient!qw;")
	public static final ScriptVarType QUEST = new ScriptVarType(3, ':', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "Lclient!qw;")
	public static final ScriptVarType QUESTHELP = new ScriptVarType(4, ';', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "Lclient!qw;")
	public static final ScriptVarType CURSOR = new ScriptVarType(5, '@', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Lclient!qw;")
	public static final ScriptVarType SEQ = new ScriptVarType(6, 'A', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "Lclient!qw;")
	public static final ScriptVarType COLOUR = new ScriptVarType(7, 'C', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "z", descriptor = "Lclient!qw;")
	public static final ScriptVarType LOC_SHAPE = new ScriptVarType(8, 'H', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "Lclient!qw;")
	public static final ScriptVarType COMPONENT = new ScriptVarType(9, 'I', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "Lclient!qw;")
	public static final ScriptVarType IDKIT = new ScriptVarType(10, 'K', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "Lclient!qw;")
	public static final ScriptVarType MIDI = new ScriptVarType(11, 'M', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "Lclient!qw;")
	public static final ScriptVarType NPC_MODE = new ScriptVarType(12, 'N', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "Lclient!qw;")
	public static final ScriptVarType NAMEDOBJ = new ScriptVarType(13, 'O', BaseVarType.INTEGER, -1, new Class517[0]);

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!qw;")
	public static final ScriptVarType SYNTH = new ScriptVarType(14, 'P', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_15 = new ScriptVarType(15, 'Q', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2 });

	@OriginalMember(owner = "client!qw", name = "y", descriptor = "Lclient!qw;")
	public static final ScriptVarType AREA = new ScriptVarType(16, 'R', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Lclient!qw;")
	public static final ScriptVarType STAT = new ScriptVarType(17, 'S', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_7, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "x", descriptor = "Lclient!qw;")
	public static final ScriptVarType NPC_STAT = new ScriptVarType(18, 'T', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "Lclient!qw;")
	public static final ScriptVarType WRITEINV = new ScriptVarType(19, 'V', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "Lclient!qw;")
	public static final ScriptVarType MESH = new ScriptVarType(20, '^', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "Lclient!qw;")
	public static final ScriptVarType MAPAREA = new ScriptVarType(21, '`', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "Lclient!qw;")
	public static final ScriptVarType COORDGRID = new ScriptVarType(22, 'c', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "Lclient!qw;")
	public static final ScriptVarType GRAPHIC = new ScriptVarType(23, 'd', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Lclient!qw;")
	public static final ScriptVarType CHATPHRASE = new ScriptVarType(24, 'e', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "Lclient!qw;")
	public static final ScriptVarType FONTMETRICS = new ScriptVarType(25, 'f', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ae", descriptor = "Lclient!qw;")
	public static final ScriptVarType ENUM = new ScriptVarType(26, 'g', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ag", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_27 = new ScriptVarType(27, 'h', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "ah", descriptor = "Lclient!qw;")
	public static final ScriptVarType JINGLE = new ScriptVarType(28, 'j', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "al", descriptor = "Lclient!qw;")
	public static final ScriptVarType CHATCAT = new ScriptVarType(29, 'k', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ac", descriptor = "Lclient!qw;")
	public static final ScriptVarType LOC = new ScriptVarType(30, 'l', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ai", descriptor = "Lclient!qw;")
	public static final ScriptVarType MODEL = new ScriptVarType(31, 'm', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "aw", descriptor = "Lclient!qw;")
	public static final ScriptVarType NPC = new ScriptVarType(32, 'n', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_7, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "as", descriptor = "Lclient!qw;")
	public static final ScriptVarType OBJ = new ScriptVarType(33, 'o', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "at", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_UID = new ScriptVarType(34, 'p', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ad", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_35 = new ScriptVarType(35, 'r', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "am", descriptor = "Lclient!qw;")
	public static final ScriptVarType STRING = new ScriptVarType(36, 's', BaseVarType.STRING, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "au", descriptor = "Lclient!qw;")
	public static final ScriptVarType SPOTANIM = new ScriptVarType(37, 't', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ar", descriptor = "Lclient!qw;")
	public static final ScriptVarType NPC_UID = new ScriptVarType(38, 'u', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ap", descriptor = "Lclient!qw;")
	public static final ScriptVarType INV = new ScriptVarType(39, 'v', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "aq", descriptor = "Lclient!qw;")
	public static final ScriptVarType TEXTURE = new ScriptVarType(40, 'x', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ax", descriptor = "Lclient!qw;")
	public static final ScriptVarType CATEGORY = new ScriptVarType(41, 'y', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "av", descriptor = "Lclient!qw;")
	public static final ScriptVarType CHAR = new ScriptVarType(42, 'z', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ao", descriptor = "Lclient!qw;")
	public static final ScriptVarType LASER = new ScriptVarType(43, '|', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "aj", descriptor = "Lclient!qw;")
	public static final ScriptVarType BAS = new ScriptVarType(44, '€', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ay", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_45 = new ScriptVarType(45, 'ƒ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "ab", descriptor = "Lclient!qw;")
	public static final ScriptVarType COLLISION_GEOMETRY = new ScriptVarType(46, '‡', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "az", descriptor = "Lclient!qw;")
	public static final ScriptVarType PHYSICS_MODEL = new ScriptVarType(47, '‰', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "aa", descriptor = "Lclient!qw;")
	public static final ScriptVarType PHYSICS_CONTROL_MODIFIER = new ScriptVarType(48, 'Š', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "af", descriptor = "Lclient!qw;")
	public static final ScriptVarType CLANHASH = new ScriptVarType(49, 'Œ', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "ak", descriptor = "Lclient!qw;")
	public static final ScriptVarType COORDFINE = new ScriptVarType(50, 'Ž', BaseVarType.COORDFINE, new CoordFine(), new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "an", descriptor = "Lclient!qw;")
	public static final ScriptVarType CUTSCENE = new ScriptVarType(51, 'š', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bf", descriptor = "Lclient!qw;")
	public static final ScriptVarType ITEMCODE = new ScriptVarType(53, '¡', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bl", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_54 = new ScriptVarType(54, '¢', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "bk", descriptor = "Lclient!qw;")
	public static final ScriptVarType MAPSCENEICON = new ScriptVarType(55, '£', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bh", descriptor = "Lclient!qw;")
	public static final ScriptVarType CLANFORUMQFC = new ScriptVarType(56, '§', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bx", descriptor = "Lclient!qw;")
	public static final ScriptVarType VORBIS = new ScriptVarType(57, '«', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bd", descriptor = "Lclient!qw;")
	public static final ScriptVarType VERIFY_OBJECT = new ScriptVarType(58, '®', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bc", descriptor = "Lclient!qw;")
	public static final ScriptVarType MAPELEMENT = new ScriptVarType(59, 'µ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bi", descriptor = "Lclient!qw;")
	public static final ScriptVarType CATEGORYTYPE = new ScriptVarType(60, '¶', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bn", descriptor = "Lclient!qw;")
	public static final ScriptVarType SOCIAL_NETWORK = new ScriptVarType(61, 'Æ', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bt", descriptor = "Lclient!qw;")
	public static final ScriptVarType HITMARK = new ScriptVarType(62, '×', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bq", descriptor = "Lclient!qw;")
	public static final ScriptVarType PACKAGE = new ScriptVarType(63, 'Þ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bm", descriptor = "Lclient!qw;")
	public static final ScriptVarType PARTICLE_EFFECTOR = new ScriptVarType(64, 'á', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bb", descriptor = "Lclient!qw;")
	public static final ScriptVarType aScriptVarType_12 = new ScriptVarType(65, 'æ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3 });

	@OriginalMember(owner = "client!qw", name = "be", descriptor = "Lclient!qw;")
	public static final ScriptVarType PARTICLE_EMITTER = new ScriptVarType(66, 'é', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "by", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLOGTYPE = new ScriptVarType(67, 'í', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bu", descriptor = "Lclient!qw;")
	public static final ScriptVarType UNSIGNED_INT = new ScriptVarType(68, 'î', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bw", descriptor = "Lclient!qw;")
	public static final ScriptVarType SKYBOX = new ScriptVarType(69, 'ó', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bo", descriptor = "Lclient!qw;")
	public static final ScriptVarType SKYDECOR = new ScriptVarType(70, 'ú', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "bz", descriptor = "Lclient!qw;")
	public static final ScriptVarType HASH64 = new ScriptVarType(71, 'û', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_1, Class517.aClass517_3, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "bv", descriptor = "Lclient!qw;")
	public static final ScriptVarType INPUTTYPE = new ScriptVarType(72, 'Î', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "br", descriptor = "Lclient!qw;")
	public static final ScriptVarType STRUCT = new ScriptVarType(73, 'J', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "bg", descriptor = "Lclient!qw;")
	public static final ScriptVarType DBROW = new ScriptVarType(74, 'Ð', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "ba", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_75 = new ScriptVarType(75, '¤', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "bp", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_76 = new ScriptVarType(76, '¥', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "bj", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_77 = new ScriptVarType(77, 'è', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "bs", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_78 = new ScriptVarType(78, '¹', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "cl", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_79 = new ScriptVarType(79, '°', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "cg", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_80 = new ScriptVarType(80, 'ì', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "ce", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_81 = new ScriptVarType(81, 'ë', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "cu", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_82 = new ScriptVarType(83, 'þ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "ci", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_83 = new ScriptVarType(84, 'ý', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "cn", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_84 = new ScriptVarType(85, 'ÿ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "cv", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_85 = new ScriptVarType(86, 'õ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "cp", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_86 = new ScriptVarType(87, 'ô', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "ca", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_87 = new ScriptVarType(88, 'ö', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "cx", descriptor = "Lclient!qw;")
	public static final ScriptVarType GWC_PLATFORM = new ScriptVarType(89, 'ò', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cw", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_90 = new ScriptVarType(90, 'Ü', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "ct", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_91 = new ScriptVarType(91, 'ù', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "cf", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_92 = new ScriptVarType(92, 'ï', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "co", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_93 = new ScriptVarType(93, '¯', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "cr", descriptor = "Lclient!qw;")
	public static final ScriptVarType BUG_TEMPLATE = new ScriptVarType(94, 'ê', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cm", descriptor = "Lclient!qw;")
	public static final ScriptVarType BILLING_AUTH_FLAG = new ScriptVarType(95, 'ð', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cq", descriptor = "Lclient!qw;")
	public static final ScriptVarType ACCOUNT_FEATURE_FLAG = new ScriptVarType(96, 'å', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ch", descriptor = "Lclient!qw;")
	public static final ScriptVarType INTERFACE = new ScriptVarType(97, 'a', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cb", descriptor = "Lclient!qw;")
	public static final ScriptVarType TOPLEVELINTERFACE = new ScriptVarType(98, 'F', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cs", descriptor = "Lclient!qw;")
	public static final ScriptVarType OVERLAYINTERFACE = new ScriptVarType(99, 'L', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cy", descriptor = "Lclient!qw;")
	public static final ScriptVarType CLIENTINTERFACE = new ScriptVarType(100, '©', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cc", descriptor = "Lclient!qw;")
	public static final ScriptVarType MOVESPEED = new ScriptVarType(101, 'Ý', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cz", descriptor = "Lclient!qw;")
	public static final ScriptVarType MATERIAL = new ScriptVarType(102, '¬', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ck", descriptor = "Lclient!qw;")
	public static final ScriptVarType SEQGROUP = new ScriptVarType(103, 'ø', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cj", descriptor = "Lclient!qw;")
	public static final ScriptVarType TEMP_HISCORE = new ScriptVarType(104, 'ä', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "cd", descriptor = "Lclient!qw;")
	public static final ScriptVarType TEMP_HISCORE_LENGTH_TYPE = new ScriptVarType(105, 'ã', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dd", descriptor = "Lclient!qw;")
	public static final ScriptVarType TEMP_HISCORE_DISPLAY_TYPE = new ScriptVarType(106, 'â', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dr", descriptor = "Lclient!qw;")
	public static final ScriptVarType TEMP_HISCORE_CONTRIBUTE_RESULT = new ScriptVarType(107, 'à', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "da", descriptor = "Lclient!qw;")
	public static final ScriptVarType AUDIOGROUP = new ScriptVarType(108, 'À', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dt", descriptor = "Lclient!qw;")
	public static final ScriptVarType AUDIOMIXBUSS = new ScriptVarType(109, 'Ò', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "do", descriptor = "Lclient!qw;")
	public static final ScriptVarType LONG = new ScriptVarType(110, 'Ï', BaseVarType.LONG, 0L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "dz", descriptor = "Lclient!qw;")
	public static final ScriptVarType CRM_CHANNEL = new ScriptVarType(111, 'Ì', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dv", descriptor = "Lclient!qw;")
	public static final ScriptVarType HTTP_IMAGE = new ScriptVarType(112, 'É', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dm", descriptor = "Lclient!qw;")
	public static final ScriptVarType POP_UP_DISPLAY_BEHAVIOUR = new ScriptVarType(113, 'Ê', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dq", descriptor = "Lclient!qw;")
	public static final ScriptVarType POLL = new ScriptVarType(114, '÷', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "dc", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_115 = new ScriptVarType(115, '¼', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "di", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_116 = new ScriptVarType(116, '½', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "dk", descriptor = "Lclient!qw;")
	public static final ScriptVarType POINTLIGHT = new ScriptVarType(117, '•', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dn", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP = new ScriptVarType(118, 'Â', BaseVarType.LONG, -1L, new Class517[] { Class517.aClass517_4, Class517.aClass517_3, Class517.aClass517_1, Class517.aClass517_6, Class517.aClass517_7 });

	@OriginalMember(owner = "client!qw", name = "df", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP_STATUS = new ScriptVarType(119, 'Ã', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dw", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP_INVITE_RESULT = new ScriptVarType(120, 'Å', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "ds", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP_MODIFY_RESULT = new ScriptVarType(121, 'Ë', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "du", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP_JOIN_OR_CREATE_RESULT = new ScriptVarType(122, 'Í', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dl", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP_AFFINITY_MODIFY_RESULT = new ScriptVarType(123, 'Õ', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dp", descriptor = "Lclient!qw;")
	public static final ScriptVarType PLAYER_GROUP_DELTA_TYPE = new ScriptVarType(124, '²', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dy", descriptor = "Lclient!qw;")
	public static final ScriptVarType CLIENT_TYPE = new ScriptVarType(125, 'ª', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "db", descriptor = "Lclient!qw;")
	public static final ScriptVarType TELEMETRY_INTERVAL = new ScriptVarType(126, '\u0000', BaseVarType.INTEGER, 0, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_1, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dh", descriptor = "Lclient!qw;")
	public static final ScriptVarType WORLDAREA = new ScriptVarType(127, '\u0000', BaseVarType.INTEGER, -1, "", new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_7, Class517.aClass517_5, Class517.aClass517_6 });

	@OriginalMember(owner = "client!qw", name = "dx", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_128 = new ScriptVarType(128, '\u0000', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "dg", descriptor = "Lclient!qw;")
	public static final ScriptVarType DBTABLE = new ScriptVarType(129, 'Ø', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_2, Class517.aClass517_3, Class517.aClass517_5, Class517.aClass517_6, Class517.aClass517_7 });

	// ----

	@OriginalMember(owner = "client!qw", name = "de", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_200 = new ScriptVarType(200, 'X', BaseVarType.INTEGER, -1, new Class517[0]);

	@OriginalMember(owner = "client!qw", name = "dj", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_201 = new ScriptVarType(201, 'W', BaseVarType.INTEGER, -1, new Class517[0]);

	@OriginalMember(owner = "client!qw", name = "eo", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_202 = new ScriptVarType(202, 'b', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "ey", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_203 = new ScriptVarType(203, 'B', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "eu", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_204 = new ScriptVarType(204, '4', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "ed", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_205 = new ScriptVarType(205, 'w', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "ee", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_206 = new ScriptVarType(206, 'q', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	@OriginalMember(owner = "client!qw", name = "es", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_207 = new ScriptVarType(207, '0', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4, Class517.aClass517_5 });

	@OriginalMember(owner = "client!qw", name = "ei", descriptor = "Lclient!qw;")
	public static final ScriptVarType TYPE_208 = new ScriptVarType(208, '6', BaseVarType.INTEGER, -1, new Class517[] { Class517.aClass517_4 });

	// ----

	@OriginalMember(owner = "client!qw", name = "el", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_1 = new ScriptVarType(BaseVarType.INTEGER, -1, '#');

	@OriginalMember(owner = "client!qw", name = "ej", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_2 = new ScriptVarType(BaseVarType.INTEGER, -1, '(');

	@OriginalMember(owner = "client!qw", name = "ep", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_3 = new ScriptVarType(BaseVarType.INTEGER, -1, '%');

	@OriginalMember(owner = "client!qw", name = "ev", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_4 = new ScriptVarType(BaseVarType.INTEGER, -1, '&');

	@OriginalMember(owner = "client!qw", name = "ec", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_5 = new ScriptVarType(BaseVarType.INTEGER, -1, ')');

	@OriginalMember(owner = "client!qw", name = "ek", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_6 = new ScriptVarType(BaseVarType.INTEGER, -1, '3');

	@OriginalMember(owner = "client!qw", name = "em", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_7 = new ScriptVarType(BaseVarType.INTEGER, -1, '5');

	@OriginalMember(owner = "client!qw", name = "eh", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_8 = new ScriptVarType(BaseVarType.INTEGER, -1, '7');

	@OriginalMember(owner = "client!qw", name = "eq", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_9 = new ScriptVarType(BaseVarType.INTEGER, -1, '8');

	@OriginalMember(owner = "client!qw", name = "eg", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_10 = new ScriptVarType(BaseVarType.INTEGER, -1, '9');

	@OriginalMember(owner = "client!qw", name = "ez", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_11 = new ScriptVarType(BaseVarType.INTEGER, -1, 'D');

	@OriginalMember(owner = "client!qw", name = "ef", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_12 = new ScriptVarType(BaseVarType.INTEGER, -1, 'G');

	@OriginalMember(owner = "client!qw", name = "et", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_13 = new ScriptVarType(BaseVarType.INTEGER, -1, 'U');

	@OriginalMember(owner = "client!qw", name = "ea", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_14 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Á');

	@OriginalMember(owner = "client!qw", name = "ew", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_15 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Z');

	@OriginalMember(owner = "client!qw", name = "er", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_16 = new ScriptVarType(BaseVarType.INTEGER, -1, '~');

	@OriginalMember(owner = "client!qw", name = "en", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_17 = new ScriptVarType(BaseVarType.INTEGER, -1, '±');

	@OriginalMember(owner = "client!qw", name = "eb", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_18 = new ScriptVarType(BaseVarType.INTEGER, -1, '»');

	@OriginalMember(owner = "client!qw", name = "ex", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_19 = new ScriptVarType(BaseVarType.INTEGER, -1, '¿');

	@OriginalMember(owner = "client!qw", name = "fg", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_20 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ç');

	@OriginalMember(owner = "client!qw", name = "fm", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_21 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ñ');

	@OriginalMember(owner = "client!qw", name = "fu", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_22 = new ScriptVarType(BaseVarType.INTEGER, -1, 'ñ');

	@OriginalMember(owner = "client!qw", name = "fs", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_23 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ù');

	@OriginalMember(owner = "client!qw", name = "fz", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_24 = new ScriptVarType(BaseVarType.INTEGER, -1, 'ß');

	@OriginalMember(owner = "client!qw", name = "fj", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_25 = new ScriptVarType(BaseVarType.INTEGER, -1, 'E');

	@OriginalMember(owner = "client!qw", name = "fd", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_26 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Y');

	@OriginalMember(owner = "client!qw", name = "fn", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_27 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ä');

	@OriginalMember(owner = "client!qw", name = "fi", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_28 = new ScriptVarType(BaseVarType.INTEGER, -1, 'ü');

	@OriginalMember(owner = "client!qw", name = "ft", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_29 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ú');

	@OriginalMember(owner = "client!qw", name = "fx", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_30 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Û');

	@OriginalMember(owner = "client!qw", name = "fv", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_31 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ó');

	@OriginalMember(owner = "client!qw", name = "fc", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_32 = new ScriptVarType(BaseVarType.INTEGER, -1, 'È');

	@OriginalMember(owner = "client!qw", name = "fw", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_33 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ô');

	@OriginalMember(owner = "client!qw", name = "fa", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_34 = new ScriptVarType(BaseVarType.INTEGER, -1, '¾');

	@OriginalMember(owner = "client!qw", name = "fp", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_35 = new ScriptVarType(BaseVarType.INTEGER, -1, 'Ö');

	@OriginalMember(owner = "client!qw", name = "fq", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_36 = new ScriptVarType(BaseVarType.INTEGER, -1, '³');

	@OriginalMember(owner = "client!qw", name = "ff", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_37 = new ScriptVarType(BaseVarType.INTEGER, -1, '·');

	@OriginalMember(owner = "client!qw", name = "fl", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_38 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "fb", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_39 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "fo", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_40 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "fy", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_41 = new ScriptVarType(BaseVarType.INTEGER, -1, 'º');

	@OriginalMember(owner = "client!qw", name = "fe", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_42 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "fk", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_43 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "fh", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_44 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "fr", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_45 = new ScriptVarType(BaseVarType.INTEGER, -1, '\u0000');

	@OriginalMember(owner = "client!qw", name = "gu", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_46 = new ScriptVarType(null, -1, '!');

	@OriginalMember(owner = "client!qw", name = "gq", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_47 = new ScriptVarType(null, -1, '$');

	@OriginalMember(owner = "client!qw", name = "gl", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_48 = new ScriptVarType(null, -1, '?');

	@OriginalMember(owner = "client!qw", name = "go", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_49 = new ScriptVarType(null, -1, 'ç');

	@OriginalMember(owner = "client!qw", name = "gk", descriptor = "Lclient!qw;")
	public static final ScriptVarType RESERVED_50 = new ScriptVarType(null, -1, '*');

	// ----

	@OriginalMember(owner = "client!qw", name = "gy", descriptor = "C")
	public final char charCode;

	@OriginalMember(owner = "client!qw", name = "gp", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!qw", name = "ga", descriptor = "Lclient!qa;")
	public final BaseVarType baseVarType;

	@OriginalMember(owner = "client!qw", name = "gn", descriptor = "Ljava/lang/Object;")
	public final Object defaultValue;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "(Lclient!qw;B)V")
	public static void registerType(@OriginalArg(0) ScriptVarType type) {
		if (CHAR_CODE_LOOKUP == null) {
			CHAR_CODE_LOOKUP = new ScriptVarType[256];
		}

		CHAR_CODE_LOOKUP[Class138_Sub3.method11406(type.charCode, 1849777598) & 0xFF] = type;
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)[Lclient!qw;")
	public static ScriptVarType[] values() {
		return new ScriptVarType[] {RESERVED_42, TYPE_87, TYPE_54, BILLING_AUTH_FLAG, PLAYER_GROUP_STATUS, MODEL, RESERVED_25, TYPE_80, TYPE_200, TYPE_82, VORBIS, RESERVED_39, MAPAREA, TYPE_90, CHATPHRASE, RESERVED_40, TYPE_116, RESERVED_29, RESERVED_28, CLANFORUMQFC, SEQGROUP, RESERVED_47, PACKAGE, SPOTANIM, RESERVED_50, CRM_CHANNEL, RESERVED_33, RESERVED_4, TYPE_77, RESERVED_34, GWC_PLATFORM, RESERVED_19, IDKIT, TYPE_128, MAPELEMENT, STRUCT, BAS, NPC, RESERVED_14, PLAYER_GROUP_AFFINITY_MODIFY_RESULT, RESERVED_24, MAPSCENEICON, POP_UP_DISPLAY_BEHAVIOUR, RESERVED_7, QUEST, RESERVED_11, RESERVED_43, TELEMETRY_INTERVAL, PLAYER_GROUP, RESERVED_30, DBTABLE, LOC_SHAPE, CATEGORYTYPE, INTERFACE, RESERVED_18, CHATCAT, PARTICLE_EFFECTOR, TYPE_115, TYPE_85, TYPE_92, RESERVED_2, TYPE_86, HASH64, TYPE_201, CLIENTINTERFACE, CLANHASH, RESERVED_38, TYPE_45, POLL, QUESTHELP, CATEGORY, RESERVED_23, TYPE_83, TOPLEVELINTERFACE, COMPONENT, RESERVED_13, TEMP_HISCORE_CONTRIBUTE_RESULT, STAT, RESERVED_37, PHYSICS_CONTROL_MODIFIER, POINTLIGHT, WRITEINV, RESERVED_35, TYPE_202, TEMP_HISCORE_DISPLAY_TYPE, RESERVED_6, RESERVED_21, RESERVED_9, RESERVED_26, TYPE_204, CHAR, TYPE_91, GRAPHIC, PHYSICS_MODEL, TYPE_206, RESERVED_5, TYPE_2, PLOGTYPE, SEQ, RESERVED_3, RESERVED_15, TYPE_35, NPC_MODE, UNSIGNED_INT, TYPE_207, RESERVED_1, SOCIAL_NETWORK, TYPE_81, RESERVED_27, TEMP_HISCORE_LENGTH_TYPE, RESERVED_49, RESERVED_8, FONTMETRICS, WORLDAREA, COLOUR, CURSOR, RESERVED_45, RESERVED_48, RESERVED_22, RESERVED_32, AUDIOGROUP, RESERVED_31, TEMP_HISCORE, HTTP_IMAGE, OBJ, RESERVED_46, TYPE_205, TYPE_84, TYPE_76, HITMARK, INPUTTYPE, PLAYER_GROUP_JOIN_OR_CREATE_RESULT, PLAYER_GROUP_MODIFY_RESULT, COLLISION_GEOMETRY, SKYDECOR, SYNTH, TYPE_203, NPC_UID, TYPE_93, COORDFINE, RESERVED_20, RESERVED_17, PLAYER_GROUP_DELTA_TYPE, TYPE_15, PLAYER_UID, AREA, CUTSCENE, MOVESPEED, RESERVED_10, RESERVED_41, TYPE_79, INV, ACCOUNT_FEATURE_FLAG, TYPE_27, RESERVED_44, NPC_STAT, ITEMCODE, VERIFY_OBJECT, STRING, LOC, TYPE_78, NAMEDOBJ, RESERVED_16, PARTICLE_EMITTER, SKYBOX, LASER, MIDI, MESH, INT, AUDIOMIXBUSS, aScriptVarType_12, RESERVED_36, DBROW, CLIENT_TYPE, JINGLE, BUG_TEMPLATE, BOOLEAN, PLAYER_GROUP_INVITE_RESULT, MATERIAL, RESERVED_12, TYPE_208, COORDGRID, ENUM, LONG, TEXTURE, OVERLAYINTERFACE, TYPE_75};
	}

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "(CB)Lclient!qw;")
	public static ScriptVarType method30500(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 'O' ? OBJ : CHAR_CODE_LOOKUP[Class138_Sub3.method11406(arg0, 1831371449) & 0xFF];
	}

	@OriginalMember(owner = "client!qw", name = "gf", descriptor = "(Lclient!yf;I)V")
	public static void method30502(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 200004183);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class606.method32093(local16, local22, arg0, (byte) 55);
	}

	@OriginalMember(owner = "client!qw", name = "ari", descriptor = "(Lclient!yf;B)V")
	public static void method30503(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (client.anInt3435 * -849002901 == 17) {
			@Pc(11) Class93_Sub22 local11 = Class102.method2592(Class446.aClass446_84, client.aClass175_1.aClass24_2, (byte) 112);
			client.aClass175_1.method24363(local11, -2028724292);
		}
	}

	@OriginalMember(owner = "client!qw", name = "acg", descriptor = "(Lclient!yf;I)V")
	public static void method30504(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = arg0.aClass386_3.aStringArray34[local12];
	}

	@OriginalMember(owner = "client!qw", name = "zy", descriptor = "(Lclient!yf;S)V")
	public static void method30505(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3513 * -859840571;
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!qa;Ljava/lang/Object;C)V")
	public ScriptVarType(@OriginalArg(0) BaseVarType baseVarType, @OriginalArg(1) Object defaultValue, @OriginalArg(2) char charCode) {
		this(-1, charCode, baseVarType, defaultValue, new Class517[0]);
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(ICLclient!qa;Ljava/lang/Object;[Lclient!qu;)V")
	public ScriptVarType(@OriginalArg(0) int id, @OriginalArg(1) char charCode, @OriginalArg(2) BaseVarType baseVarType, @OriginalArg(3) Object defaultValue, @OriginalArg(4) Class517[] extra) {
		this(id, charCode, baseVarType, defaultValue, null, extra);
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(ICLclient!qa;Ljava/lang/Object;Ljava/lang/String;[Lclient!qu;)V")
	public ScriptVarType(@OriginalArg(0) int id, @OriginalArg(1) char charCode, @OriginalArg(2) BaseVarType baseVarType, @OriginalArg(3) Object defaultValue, @OriginalArg(4) String name, @OriginalArg(5) Class517[] extra) {
		this.id = id * 1623366081;
		this.charCode = charCode;
		this.baseVarType = baseVarType;
		this.defaultValue = defaultValue;

		if (name != null && name.length() > 0) {
		}

		registerType(this);
	}

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "(B)Lclient!qa;")
	public BaseVarType getBaseVarType() {
		return this.baseVarType;
	}

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.id * 2042132033;
	}

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "(I)Ljava/lang/Object;")
	public Object getDefaultValue() {
		return this.defaultValue;
	}

}
