package com.jagex.game.network.protocol;

import deob.ObfuscatedName;

@ObfuscatedName("nz")
public class ServerProt {

	@ObfuscatedName("nz.e")
	public static final ServerProt TELEMETRY_GRID_ADD_GROUP = new ServerProt(0, 5);

	@ObfuscatedName("nz.n")
	public static final ServerProt ENVIRONMENT_OVERRIDE = new ServerProt(1, -1);

	@ObfuscatedName("nz.m")
	public static final ServerProt UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerProt(2, -1);

	@ObfuscatedName("nz.k")
	public static final ServerProt CREATE_CHECK_EMAIL_REPLY = new ServerProt(3, 1);

	@ObfuscatedName("nz.f")
	public static final ServerProt PROJANIM_SPECIFIC = new ServerProt(4, 23);

	@ObfuscatedName("nz.w")
	public static final ServerProt CAM_LOOKAT = new ServerProt(5, 6);

	@ObfuscatedName("nz.l")
	public static final ServerProt UPDATE_INV_FULL = new ServerProt(6, -2);

	@ObfuscatedName("nz.u")
	public static final ServerProt MESSAGE_PRIVATE_ECHO = new ServerProt(7, -2);

	@ObfuscatedName("nz.z")
	public static final ServerProt MESSAGE_PUBLIC = new ServerProt(8, -1);

	@ObfuscatedName("nz.p")
	public static final ServerProt REBUILD_REGION = new ServerProt(9, -2);

	@ObfuscatedName("nz.d")
	public static final ServerProt UPDATE_SITESETTINGS = new ServerProt(10, -1);

	@ObfuscatedName("nz.c")
	public static final ServerProt NPC_ANIM_SPECIFIC = new ServerProt(11, 19);

	@ObfuscatedName("nz.r")
	public static final ServerProt RESET_ANIMS = new ServerProt(12, 0);

	@ObfuscatedName("nz.v")
	public static final ServerProt MAP_PROJANIM = new ServerProt(13, 18);

	@ObfuscatedName("nz.o")
	public static final ServerProt SET_PLAYER_OP = new ServerProt(14, -1);

	@ObfuscatedName("nz.s")
	public static final ServerProt TELEMETRY_GRID_VALUES_DELTA = new ServerProt(15, -2);

	@ObfuscatedName("nz.y")
	public static final ServerProt UPDATE_INV_PARTIAL = new ServerProt(16, -2);

	@ObfuscatedName("nz.q")
	public static final ServerProt MIDI_SONG = new ServerProt(17, 3);

	@ObfuscatedName("nz.x")
	public static final ServerProt SET_MOVEACTION = new ServerProt(18, -1);

	@ObfuscatedName("nz.b")
	public static final ServerProt CREATE_SUGGEST_NAME_ERROR = new ServerProt(19, 1);

	@ObfuscatedName("nz.h")
	public static final ServerProt TELEMETRY_GRID_ADD_COLUMN = new ServerProt(20, 6);

	@ObfuscatedName("nz.a")
	public static final ServerProt CLIENT_SETVARCSTR_LARGE = new ServerProt(21, -2);

	@ObfuscatedName("nz.g")
	public static final ServerProt MESSAGE_CLANCHANNEL = new ServerProt(22, -1);

	@ObfuscatedName("nz.i")
	public static final ServerProt UPDATE_FRIENDCHAT_CHANNEL_FULL = new ServerProt(23, -2);

	@ObfuscatedName("nz.j")
	public static final ServerProt EXECUTE_CLIENT_CHEAT = new ServerProt(24, 2);

	@ObfuscatedName("nz.t")
	public static final ServerProt FRIENDLIST_LOADED = new ServerProt(25, 0);

	@ObfuscatedName("nz.ae")
	public static final ServerProt IF_OPENSUB_ACTIVE_LOC = new ServerProt(26, 32);

	@ObfuscatedName("nz.ag")
	public static final ServerProt CLEAR_PLAYER_SNAPSHOT = new ServerProt(27, 1);

	@ObfuscatedName("nz.ah")
	public static final ServerProt UPDATE_STOCKMARKET_SLOT = new ServerProt(28, 21);

	@ObfuscatedName("nz.al")
	public static final ServerProt SONG_PRELOAD = new ServerProt(29, 2);

	@ObfuscatedName("nz.ac")
	public static final ServerProt CLIENT_SETVARCSTR_SMALL = new ServerProt(30, -1);

	@ObfuscatedName("nz.ai")
	public static final ServerProt IF_SETTEXTFONT = new ServerProt(31, 8);

	@ObfuscatedName("nz.aw")
	public static final ServerProt TELEMETRY_GRID_REMOVE_COLUMN = new ServerProt(32, 2);

	@ObfuscatedName("nz.as")
	public static final ServerProt UPDATE_STAT = new ServerProt(33, 6);

	@ObfuscatedName("nz.at")
	public static final ServerProt LOC_CUSTOMISE = new ServerProt(34, -1);

	@ObfuscatedName("nz.ad")
	public static final ServerProt IF_OPENTOP = new ServerProt(35, 19);

	@ObfuscatedName("nz.am")
	public static final ServerProt MESSAGE_FRIENDCHANNEL = new ServerProt(36, -1);

	@ObfuscatedName("nz.au")
	public static final ServerProt VORBIS_SOUND = new ServerProt(37, 8);

	@ObfuscatedName("nz.ar")
	public static final ServerProt IF_OPENSUB = new ServerProt(38, 23);

	@ObfuscatedName("nz.ap")
	public static final ServerProt TELEMETRY_GRID_MOVE_COLUMN = new ServerProt(39, 3);

	@ObfuscatedName("nz.aq")
	public static final ServerProt PLAYER_GROUP_FULL = new ServerProt(40, -2);

	@ObfuscatedName("nz.ax")
	public static final ServerProt MESSAGE_PLAYER_GROUP = new ServerProt(41, -1);

	@ObfuscatedName("nz.av")
	public static final ServerProt VORBIS_SOUND_GROUP = new ServerProt(42, 10);

	@ObfuscatedName("nz.ao")
	public static final ServerProt IF_SETPLAYERHEAD = new ServerProt(43, 4);

	@ObfuscatedName("nz.aj")
	public static final ServerProt VARBIT_SMALL = new ServerProt(44, 3);

	@ObfuscatedName("nz.ay")
	public static final ServerProt LOC_DEL = new ServerProt(45, 2);

	@ObfuscatedName("nz.ab")
	public static final ServerProt UPDATE_FRIENDLIST = new ServerProt(46, -2);

	@ObfuscatedName("nz.az")
	public static final ServerProt SETDRAWORDER = new ServerProt(47, 1);

	@ObfuscatedName("nz.aa")
	public static final ServerProt SEND_PING = new ServerProt(48, 8);

	@ObfuscatedName("nz.af")
	public static final ServerProt OBJ_DEL = new ServerProt(49, 3);

	@ObfuscatedName("nz.ak")
	public static final ServerProt VARP_LARGE = new ServerProt(50, 6);

	@ObfuscatedName("nz.an")
	public static final ServerProt field3853 = new ServerProt(51, -2);

	@ObfuscatedName("nz.bf")
	public static final ServerProt DEBUG_SERVER_TRIGGERS = new ServerProt(52, -1);

	@ObfuscatedName("nz.bl")
	public static final ServerProt UPDATE_UID192 = new ServerProt(53, 28);

	@ObfuscatedName("nz.bk")
	public static final ServerProt CLIENT_SETVARCBIT_SMALL = new ServerProt(54, 3);

	@ObfuscatedName("nz.bh")
	public static final ServerProt MIDI_JINGLE = new ServerProt(55, 3);

	@ObfuscatedName("nz.bx")
	public static final ServerProt UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerProt(56, 3);

	@ObfuscatedName("nz.bd")
	public static final ServerProt LOGOUT_TRANSFER = new ServerProt(57, -1);

	@ObfuscatedName("nz.bc")
	public static final ServerProt UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerProt(58, -2);

	@ObfuscatedName("nz.bi")
	public static final ServerProt CLANCHANNEL_FULL = new ServerProt(59, -2);

	@ObfuscatedName("nz.bn")
	public static final ServerProt URL_OPEN = new ServerProt(60, -2);

	@ObfuscatedName("nz.bt")
	public static final ServerProt IF_OPENSUB_ACTIVE_PLAYER = new ServerProt(61, 25);

	@ObfuscatedName("nz.bq")
	public static final ServerProt IF_SETPLAYERHEAD_OTHER = new ServerProt(62, 10);

	@ObfuscatedName("nz.bm")
	public static final ServerProt IF_SETRECOL = new ServerProt(63, 9);

	@ObfuscatedName("nz.bb")
	public static final ServerProt CAM_REMOVEROOF = new ServerProt(64, 4);

	@ObfuscatedName("nz.be")
	public static final ServerProt UPDATE_INV_STOP_TRANSMIT = new ServerProt(65, 3);

	@ObfuscatedName("nz.by")
	public static final ServerProt CREATE_SUGGEST_NAME_REPLY = new ServerProt(66, -1);

	@ObfuscatedName("nz.bu")
	public static final ServerProt PLAYER_SNAPSHOT = new ServerProt(67, -2);

	@ObfuscatedName("nz.bw")
	public static final ServerProt TELEMETRY_GRID_REMOVE_GROUP = new ServerProt(68, 1);

	@ObfuscatedName("nz.bo")
	public static final ServerProt CLIENT_SETVARCBIT_LARGE = new ServerProt(69, 6);

	@ObfuscatedName("nz.bz")
	public static final ServerProt SOUND_AREA = new ServerProt(70, 6);

	@ObfuscatedName("nz.bv")
	public static final ServerProt MAP_PROJANIM_HALFSQ = new ServerProt(71, 21);

	@ObfuscatedName("nz.br")
	public static final ServerProt IF_SETPOSITION = new ServerProt(72, 8);

	@ObfuscatedName("nz.bg")
	public static final ServerProt OBJ_COUNT = new ServerProt(73, 7);

	@ObfuscatedName("nz.ba")
	public static final ServerProt CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerProt(74, 1);

	@ObfuscatedName("nz.bp")
	public static final ServerProt TELEMETRY_GRID_FULL = new ServerProt(75, -2);

	@ObfuscatedName("nz.bj")
	public static final ServerProt SHOW_FACE_HERE = new ServerProt(76, 1);

	@ObfuscatedName("nz.bs")
	public static final ServerProt SOCIAL_NETWORK_LOGOUT = new ServerProt(77, -2);

	@ObfuscatedName("nz.cl")
	public static final ServerProt HINT_ARROW = new ServerProt(78, 14);

	@ObfuscatedName("nz.cg")
	public static final ServerProt IF_SETSCROLLPOS = new ServerProt(79, 6);

	@ObfuscatedName("nz.ce")
	public static final ServerProt MESSAGE_QUICKCHAT_PRIVATE = new ServerProt(80, -1);

	@ObfuscatedName("nz.cu")
	public static final ServerProt CAM2_ENABLE = new ServerProt(81, 1);

	@ObfuscatedName("nz.ci")
	public static final ServerProt MESSAGE_CLANCHANNEL_SYSTEM = new ServerProt(82, -1);

	@ObfuscatedName("nz.cn")
	public static final ServerProt NO_TIMEOUT = new ServerProt(83, 0);

	@ObfuscatedName("nz.cv")
	public static final ServerProt LOC_ANIM_SPECIFIC = new ServerProt(84, 10);

	@ObfuscatedName("nz.cp")
	public static final ServerProt OBJ_ADD = new ServerProt(85, 5);

	@ObfuscatedName("nz.ca")
	public static final ServerProt LOGOUT_FULL = new ServerProt(86, 1);

	@ObfuscatedName("nz.cx")
	public static final ServerProt CAM_SMOOTHRESET = new ServerProt(87, 0);

	@ObfuscatedName("nz.cw")
	public static final ServerProt REBUILD_NORMAL = new ServerProt(88, -2);

	@ObfuscatedName("nz.ct")
	public static final ServerProt MESSAGE_QUICKCHAT_CLANCHANNEL = new ServerProt(89, -1);

	@ObfuscatedName("nz.cf")
	public static final ServerProt MESSAGE_PRIVATE = new ServerProt(90, -2);

	@ObfuscatedName("nz.co")
	public static final ServerProt VARCLAN_DISABLE = new ServerProt(91, 0);

	@ObfuscatedName("nz.cr")
	public static final ServerProt VORBIS_SOUND_GROUP_START = new ServerProt(92, 2);

	@ObfuscatedName("nz.cm")
	public static final ServerProt MESSAGE_QUICKCHAT_PRIVATE_ECHO = new ServerProt(93, -1);

	@ObfuscatedName("nz.cq")
	public static final ServerProt SET_MAP_FLAG = new ServerProt(94, 2);

	@ObfuscatedName("nz.ch")
	public static final ServerProt VORBIS_SOUND_GROUP_STOP = new ServerProt(95, 2);

	@ObfuscatedName("nz.cb")
	public static final ServerProt TELEMETRY_GRID_MOVE_ROW = new ServerProt(96, 3);

	@ObfuscatedName("nz.cs")
	public static final ServerProt VORBIS_PRELOAD_SOUNDS = new ServerProt(97, 2);

	@ObfuscatedName("nz.cy")
	public static final ServerProt CAM_MOVETO = new ServerProt(98, 6);

	@ObfuscatedName("nz.cc")
	public static final ServerProt RESET_CLIENT_VARCACHE = new ServerProt(99, 0);

	@ObfuscatedName("nz.cz")
	public static final ServerProt IF_SETPLAYERMODEL_OTHER = new ServerProt(100, 10);

	@ObfuscatedName("nz.ck")
	public static final ServerProt CLANSETTINGS_FULL = new ServerProt(101, -2);

	@ObfuscatedName("nz.cj")
	public static final ServerProt IF_OPENSUB_ACTIVE_NPC = new ServerProt(102, 25);

	@ObfuscatedName("nz.cd")
	public static final ServerProt IF_SETANIM = new ServerProt(103, 8);

	@ObfuscatedName("nz.dd")
	public static final ServerProt CAM_RESET = new ServerProt(104, 0);

	@ObfuscatedName("nz.dr")
	public static final ServerProt LOBBY_APPEARANCE = new ServerProt(105, -2);

	@ObfuscatedName("nz.da")
	public static final ServerProt VARCLAN_ENABLE = new ServerProt(106, 0);

	@ObfuscatedName("nz.dt")
	public static final ServerProt POINTLIGHT_COLOUR = new ServerProt(107, 8);

	@ObfuscatedName("nz.do")
	public static final ServerProt IF_SETRETEX = new ServerProt(108, 9);

	@ObfuscatedName("nz.dz")
	public static final ServerProt IF_SETHIDE = new ServerProt(109, 5);

	@ObfuscatedName("nz.dv")
	public static final ServerProt LAST_LOGIN_INFO = new ServerProt(110, 4);

	@ObfuscatedName("nz.dm")
	public static final ServerProt REFLECTION_CHECKER = new ServerProt(111, -2);

	@ObfuscatedName("nz.dq")
	public static final ServerProt IF_SETANGLE = new ServerProt(112, 10);

	@ObfuscatedName("nz.dc")
	public static final ServerProt TEXT_COORD = new ServerProt(113, -1);

	@ObfuscatedName("nz.di")
	public static final ServerProt VORBIS_SPEECH_STOP = new ServerProt(114, 0);

	@ObfuscatedName("nz.dk")
	public static final ServerProt VORBIS_PRELOAD_SOUND_GROUP = new ServerProt(115, 2);

	@ObfuscatedName("nz.dn")
	public static final ServerProt IF_SETMODEL = new ServerProt(116, 8);

	@ObfuscatedName("nz.df")
	public static final ServerProt DO_CHEAT = new ServerProt(117, -1);

	@ObfuscatedName("nz.dw")
	public static final ServerProt OBJ_REVEAL = new ServerProt(118, 7);

	@ObfuscatedName("nz.ds")
	public static final ServerProt HINT_TRAIL = new ServerProt(119, -2);

	@ObfuscatedName("nz.du")
	public static final ServerProt MESSAGE_GAME = new ServerProt(120, -1);

	@ObfuscatedName("nz.dl")
	public static final ServerProt IF_OPENSUB_ACTIVE_OBJ = new ServerProt(121, 29);

	@ObfuscatedName("nz.dp")
	public static final ServerProt PLAYER_INFO = new ServerProt(122, -2);

	@ObfuscatedName("nz.dy")
	public static final ServerProt SOUND_MIXBUSS_ADD = new ServerProt(123, 6);

	@ObfuscatedName("nz.db")
	public static final ServerProt LOC_PREFETCH = new ServerProt(124, 5);

	@ObfuscatedName("nz.dh")
	public static final ServerProt NPC_HEADICON_SPECIFIC = new ServerProt(125, 9);

	@ObfuscatedName("nz.dx")
	public static final ServerProt UPDATE_DOB = new ServerProt(126, 4);

	@ObfuscatedName("nz.dg")
	public static final ServerProt MIDI_SONG_LOCATION = new ServerProt(127, 11);

	@ObfuscatedName("nz.de")
	public static final ServerProt CLIENT_SETVARC_LARGE = new ServerProt(128, 6);

	@ObfuscatedName("nz.dj")
	public static final ServerProt SERVER_TICK_END = new ServerProt(129, 0);

	@ObfuscatedName("nz.eo")
	public static final ServerProt IF_SETPLAYERHEAD_IGNOREWORN = new ServerProt(130, 10);

	@ObfuscatedName("nz.ey")
	public static final ServerProt CREATE_ACCOUNT_REPLY = new ServerProt(131, 1);

	@ObfuscatedName("nz.eu")
	public static final ServerProt CLANSETTINGS_DELTA = new ServerProt(132, -2);

	@ObfuscatedName("nz.ed")
	public static final ServerProt TRIGGER_ONDIALOGABORT = new ServerProt(133, 0);

	@ObfuscatedName("nz.ee")
	public static final ServerProt REDUCE_PLAYER_ATTACK_PRIORITY = new ServerProt(134, 1);

	@ObfuscatedName("nz.es")
	public static final ServerProt IF_SET_HTTP_IMAGE = new ServerProt(135, 8);

	@ObfuscatedName("nz.ei")
	public static final ServerProt CUTSCENE = new ServerProt(136, -2);

	@ObfuscatedName("nz.el")
	public static final ServerProt MINIMAP_TOGGLE = new ServerProt(137, 1);

	@ObfuscatedName("nz.ej")
	public static final ServerProt CHAT_FILTER_SETTINGS = new ServerProt(138, 2);

	@ObfuscatedName("nz.ep")
	public static final ServerProt LOC_ADD_CHANGE = new ServerProt(139, -1);

	@ObfuscatedName("nz.ev")
	public static final ServerProt IF_SETCOLOUR = new ServerProt(140, 6);

	@ObfuscatedName("nz.ec")
	public static final ServerProt REDUCE_NPC_ATTACK_PRIORITY = new ServerProt(141, 1);

	@ObfuscatedName("nz.ek")
	public static final ServerProt VARBIT_LARGE = new ServerProt(142, 6);

	@ObfuscatedName("nz.em")
	public static final ServerProt VORBIS_SPEECH_SOUND = new ServerProt(143, 6);

	@ObfuscatedName("nz.eh")
	public static final ServerProt POINTLIGHT_INTENSITY = new ServerProt(144, 5);

	@ObfuscatedName("nz.eq")
	public static final ServerProt MESSAGE_QUICKCHAT_FRIENDCHAT = new ServerProt(145, -1);

	@ObfuscatedName("nz.eg")
	public static final ServerProt CLANCHANNEL_DELTA = new ServerProt(146, -2);

	@ObfuscatedName("nz.ez")
	public static final ServerProt LOC_ANIM = new ServerProt(147, 7);

	@ObfuscatedName("nz.ef")
	public static final ServerProt STORE_SERVERPERM_VARCS_ACK = new ServerProt(148, 0);

	@ObfuscatedName("nz.et")
	public static final ServerProt CLIENT_SETVARC_SMALL = new ServerProt(149, 3);

	@ObfuscatedName("nz.ea")
	public static final ServerProt SET_TARGET = new ServerProt(150, 2);

	@ObfuscatedName("nz.ew")
	public static final ServerProt IF_SETPLAYERMODEL_SELF = new ServerProt(151, 4);

	@ObfuscatedName("nz.er")
	public static final ServerProt CAMERA_UPDATE = new ServerProt(152, -2);

	@ObfuscatedName("nz.en")
	public static final ServerProt JS5_RELOAD = new ServerProt(153, 0);

	@ObfuscatedName("nz.eb")
	public static final ServerProt CHANGE_LOBBY = new ServerProt(154, -1);

	@ObfuscatedName("nz.ex")
	public static final ServerProt IF_SETEVENTS = new ServerProt(155, 12);

	@ObfuscatedName("nz.fg")
	public static final ServerProt RUNCLIENTSCRIPT = new ServerProt(156, -2);

	@ObfuscatedName("nz.fm")
	public static final ServerProt VARP_SMALL = new ServerProt(157, 3);

	@ObfuscatedName("nz.fu")
	public static final ServerProt IF_SETOBJECT = new ServerProt(158, 10);

	@ObfuscatedName("nz.fs")
	public static final ServerProt PLAYER_GROUP_VARPS = new ServerProt(159, -2);

	@ObfuscatedName("nz.fz")
	public static final ServerProt TELEMETRY_GRID_REMOVE_ROW = new ServerProt(160, 2);

	@ObfuscatedName("nz.fj")
	public static final ServerProt UPDATE_RUNENERGY = new ServerProt(161, 1);

	@ObfuscatedName("nz.fd")
	public static final ServerProt SOUND_MIXBUSS_SETLEVEL = new ServerProt(162, 4);

	@ObfuscatedName("nz.fn")
	public static final ServerProt CREATE_CHECK_NAME_REPLY = new ServerProt(163, 1);

	@ObfuscatedName("nz.fi")
	public static final ServerProt CAM_FORCEANGLE = new ServerProt(164, 4);

	@ObfuscatedName("nz.ft")
	public static final ServerProt IF_SETTEXTANTIMACRO = new ServerProt(165, 5);

	@ObfuscatedName("nz.fx")
	public static final ServerProt IF_CLOSESUB = new ServerProt(166, 4);

	@ObfuscatedName("nz.fv")
	public static final ServerProt WORLDLIST_FETCH_REPLY = new ServerProt(167, -2);

	@ObfuscatedName("nz.fc")
	public static final ServerProt LOGOUT = new ServerProt(168, 1);

	@ObfuscatedName("nz.fw")
	public static final ServerProt UPDATE_RUNWEIGHT = new ServerProt(169, 2);

	@ObfuscatedName("nz.fa")
	public static final ServerProt field3996 = new ServerProt(170, -2);

	@ObfuscatedName("nz.fp")
	public static final ServerProt CAM_SHAKE = new ServerProt(171, 6);

	@ObfuscatedName("nz.fq")
	public static final ServerProt VARCLAN = new ServerProt(172, -1);

	@ObfuscatedName("nz.ff")
	public static final ServerProt TELEMETRY_GRID_SET_ROW_PINNED = new ServerProt(173, 3);

	@ObfuscatedName("nz.fl")
	public static final ServerProt UPDATE_IGNORELIST = new ServerProt(174, -2);

	@ObfuscatedName("nz.fb")
	public static final ServerProt UPDATE_ZONE_FULL_FOLLOWS = new ServerProt(175, 3);

	@ObfuscatedName("nz.fo")
	public static final ServerProt MESSAGE_QUICKCHAT_PLAYER_GROUP = new ServerProt(176, -1);

	@ObfuscatedName("nz.fy")
	public static final ServerProt UPDATE_REBOOT_TIMER = new ServerProt(177, 2);

	@ObfuscatedName("nz.fe")
	public static final ServerProt SPOTANIM_SPECIFIC = new ServerProt(178, 12);

	@ObfuscatedName("nz.fk")
	public static final ServerProt IF_SETTARGETPARAM = new ServerProt(179, 10);

	@ObfuscatedName("nz.fh")
	public static final ServerProt IF_SETPLAYERMODEL_SNAPSHOT = new ServerProt(180, 5);

	@ObfuscatedName("nz.fr")
	public static final ServerProt IF_SETTEXT = new ServerProt(181, -2);

	@ObfuscatedName("nz.gu")
	public static final ServerProt SYNTH_SOUND = new ServerProt(182, 8);

	@ObfuscatedName("nz.gq")
	public static final ServerProt IF_SETGRAPHIC = new ServerProt(183, 8);

	@ObfuscatedName("nz.gl")
	public static final ServerProt IF_SETCLICKMASK = new ServerProt(184, 5);

	@ObfuscatedName("nz.go")
	public static final ServerProt TELEMETRY_GRID_ADD_ROW = new ServerProt(185, 6);

	@ObfuscatedName("nz.gk")
	public static final ServerProt NPC_INFO = new ServerProt(186, -2);

	@ObfuscatedName("nz.gp")
	public static final ServerProt PLAYER_GROUP_DELTA = new ServerProt(187, -2);

	@ObfuscatedName("nz.gy")
	public static final ServerProt LOYALTY_UPDATE = new ServerProt(188, 4);

	@ObfuscatedName("nz.ga")
	public static final ServerProt IF_SETNPCHEAD = new ServerProt(189, 8);

	@ObfuscatedName("nz.gn")
	public static final ServerProt MIDI_SONG_STOP = new ServerProt(190, 0);

	@ObfuscatedName("nz.gc")
	public static final ServerProt IF_MOVESUB = new ServerProt(191, 8);

	@ObfuscatedName("nz.gf")
	public static final ServerProt TELEMETRY_CLEAR_GRID_VALUE = new ServerProt(192, 3);

	@ObfuscatedName("nz.gx")
	public static final ServerProt MAP_ANIM = new ServerProt(193, 10);

	@ObfuscatedName("nz.ge")
	public static final ServerProt JCOINS_UPDATE = new ServerProt(194, 4);

	@ObfuscatedName("nz.gg")
	public final int id;

	@ObfuscatedName("nz.gr")
	public final int size;

	public ServerProt(int id, int size) {
		this.id = id;
		this.size = size;
	}

    @ObfuscatedName("amc.e(I)[Lnz;")
    public static ServerProt[] values() {
        return new ServerProt[] {TELEMETRY_GRID_ADD_GROUP, ENVIRONMENT_OVERRIDE, UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, CREATE_CHECK_EMAIL_REPLY, PROJANIM_SPECIFIC, CAM_LOOKAT, UPDATE_INV_FULL, MESSAGE_PRIVATE_ECHO, MESSAGE_PUBLIC, REBUILD_REGION, UPDATE_SITESETTINGS, NPC_ANIM_SPECIFIC, RESET_ANIMS, MAP_PROJANIM, SET_PLAYER_OP, TELEMETRY_GRID_VALUES_DELTA, UPDATE_INV_PARTIAL, MIDI_SONG, SET_MOVEACTION, CREATE_SUGGEST_NAME_ERROR, TELEMETRY_GRID_ADD_COLUMN, CLIENT_SETVARCSTR_LARGE, MESSAGE_CLANCHANNEL, UPDATE_FRIENDCHAT_CHANNEL_FULL, EXECUTE_CLIENT_CHEAT, FRIENDLIST_LOADED, IF_OPENSUB_ACTIVE_LOC, CLEAR_PLAYER_SNAPSHOT, UPDATE_STOCKMARKET_SLOT, SONG_PRELOAD, CLIENT_SETVARCSTR_SMALL, IF_SETTEXTFONT, TELEMETRY_GRID_REMOVE_COLUMN, UPDATE_STAT, LOC_CUSTOMISE, IF_OPENTOP, MESSAGE_FRIENDCHANNEL, VORBIS_SOUND, IF_OPENSUB, TELEMETRY_GRID_MOVE_COLUMN, PLAYER_GROUP_FULL, MESSAGE_PLAYER_GROUP, VORBIS_SOUND_GROUP, IF_SETPLAYERHEAD, VARBIT_SMALL, LOC_DEL, UPDATE_FRIENDLIST, SETDRAWORDER, SEND_PING, OBJ_DEL, VARP_LARGE, field3853, DEBUG_SERVER_TRIGGERS, UPDATE_UID192, CLIENT_SETVARCBIT_SMALL, MIDI_JINGLE, UPDATE_ZONE_PARTIAL_FOLLOWS, LOGOUT_TRANSFER, UPDATE_ZONE_PARTIAL_ENCLOSED, CLANCHANNEL_FULL, URL_OPEN, IF_OPENSUB_ACTIVE_PLAYER, IF_SETPLAYERHEAD_OTHER, IF_SETRECOL, CAM_REMOVEROOF, UPDATE_INV_STOP_TRANSMIT, CREATE_SUGGEST_NAME_REPLY, PLAYER_SNAPSHOT, TELEMETRY_GRID_REMOVE_GROUP, CLIENT_SETVARCBIT_LARGE, SOUND_AREA, MAP_PROJANIM_HALFSQ, IF_SETPOSITION, OBJ_COUNT, CHAT_FILTER_SETTINGS_PRIVATECHAT, TELEMETRY_GRID_FULL, SHOW_FACE_HERE, SOCIAL_NETWORK_LOGOUT, HINT_ARROW, IF_SETSCROLLPOS, MESSAGE_QUICKCHAT_PRIVATE, CAM2_ENABLE, MESSAGE_CLANCHANNEL_SYSTEM, NO_TIMEOUT, LOC_ANIM_SPECIFIC, OBJ_ADD, LOGOUT_FULL, CAM_SMOOTHRESET, REBUILD_NORMAL, MESSAGE_QUICKCHAT_CLANCHANNEL, MESSAGE_PRIVATE, VARCLAN_DISABLE, VORBIS_SOUND_GROUP_START, MESSAGE_QUICKCHAT_PRIVATE_ECHO, SET_MAP_FLAG, VORBIS_SOUND_GROUP_STOP, TELEMETRY_GRID_MOVE_ROW, VORBIS_PRELOAD_SOUNDS, CAM_MOVETO, RESET_CLIENT_VARCACHE, IF_SETPLAYERMODEL_OTHER, CLANSETTINGS_FULL, IF_OPENSUB_ACTIVE_NPC, IF_SETANIM, CAM_RESET, LOBBY_APPEARANCE, VARCLAN_ENABLE, POINTLIGHT_COLOUR, IF_SETRETEX, IF_SETHIDE, LAST_LOGIN_INFO, REFLECTION_CHECKER, IF_SETANGLE, TEXT_COORD, VORBIS_SPEECH_STOP, VORBIS_PRELOAD_SOUND_GROUP, IF_SETMODEL, DO_CHEAT, OBJ_REVEAL, HINT_TRAIL, MESSAGE_GAME, IF_OPENSUB_ACTIVE_OBJ, PLAYER_INFO, SOUND_MIXBUSS_ADD, LOC_PREFETCH, NPC_HEADICON_SPECIFIC, UPDATE_DOB, MIDI_SONG_LOCATION, CLIENT_SETVARC_LARGE, SERVER_TICK_END, IF_SETPLAYERHEAD_IGNOREWORN, CREATE_ACCOUNT_REPLY, CLANSETTINGS_DELTA, TRIGGER_ONDIALOGABORT, REDUCE_PLAYER_ATTACK_PRIORITY, IF_SET_HTTP_IMAGE, CUTSCENE, MINIMAP_TOGGLE, CHAT_FILTER_SETTINGS, LOC_ADD_CHANGE, IF_SETCOLOUR, REDUCE_NPC_ATTACK_PRIORITY, VARBIT_LARGE, VORBIS_SPEECH_SOUND, POINTLIGHT_INTENSITY, MESSAGE_QUICKCHAT_FRIENDCHAT, CLANCHANNEL_DELTA, LOC_ANIM, STORE_SERVERPERM_VARCS_ACK, CLIENT_SETVARC_SMALL, SET_TARGET, IF_SETPLAYERMODEL_SELF, CAMERA_UPDATE, JS5_RELOAD, CHANGE_LOBBY, IF_SETEVENTS, RUNCLIENTSCRIPT, VARP_SMALL, IF_SETOBJECT, PLAYER_GROUP_VARPS, TELEMETRY_GRID_REMOVE_ROW, UPDATE_RUNENERGY, SOUND_MIXBUSS_SETLEVEL, CREATE_CHECK_NAME_REPLY, CAM_FORCEANGLE, IF_SETTEXTANTIMACRO, IF_CLOSESUB, WORLDLIST_FETCH_REPLY, LOGOUT, UPDATE_RUNWEIGHT, field3996, CAM_SHAKE, VARCLAN, TELEMETRY_GRID_SET_ROW_PINNED, UPDATE_IGNORELIST, UPDATE_ZONE_FULL_FOLLOWS, MESSAGE_QUICKCHAT_PLAYER_GROUP, UPDATE_REBOOT_TIMER, SPOTANIM_SPECIFIC, IF_SETTARGETPARAM, IF_SETPLAYERMODEL_SNAPSHOT, IF_SETTEXT, SYNTH_SOUND, IF_SETGRAPHIC, IF_SETCLICKMASK, TELEMETRY_GRID_ADD_ROW, NPC_INFO, PLAYER_GROUP_DELTA, LOYALTY_UPDATE, IF_SETNPCHEAD, MIDI_SONG_STOP, IF_MOVESUB, TELEMETRY_CLEAR_GRID_VALUE, MAP_ANIM, JCOINS_UPDATE};
    }
}
