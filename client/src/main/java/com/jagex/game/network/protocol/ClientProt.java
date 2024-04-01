package com.jagex.game.network.protocol;

import deob.ObfuscatedName;

@ObfuscatedName("nr")
public class ClientProt {

	@ObfuscatedName("nr.e")
	public static final ClientProt MAP_BUILD_STUCK = new ClientProt(0, 15);

	@ObfuscatedName("nr.n")
	public static final ClientProt RESUME_P_HSLDIALOG = new ClientProt(1, 2);

	@ObfuscatedName("nr.m")
	public static final ClientProt OPNPC5 = new ClientProt(2, 3);

	@ObfuscatedName("nr.k")
	public static final ClientProt RESUME_P_STRINGDIALOG = new ClientProt(3, -1);

	@ObfuscatedName("nr.f")
	public static final ClientProt OPPLAYER6 = new ClientProt(4, 3);

	@ObfuscatedName("nr.w")
	public static final ClientProt EVENT_NATIVE_MOUSE_MOVE = new ClientProt(5, -1);

	@ObfuscatedName("nr.l")
	public static final ClientProt OPPLAYER9 = new ClientProt(6, 3);

	@ObfuscatedName("nr.u")
	public static final ClientProt MESSAGE_PRIVATE = new ClientProt(7, -2);

	@ObfuscatedName("nr.z")
	public static final ClientProt AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL = new ClientProt(8, -1);

	@ObfuscatedName("nr.p")
	public static final ClientProt CLIENT_DETAILOPTIONS_STATUS = new ClientProt(9, -1);

	@ObfuscatedName("nr.d")
	public static final ClientProt RESUME_P_COUNTDIALOG = new ClientProt(10, 4);

	@ObfuscatedName("nr.c")
	public static final ClientProt SEND_SNAPSHOT = new ClientProt(11, -1);

	@ObfuscatedName("nr.r")
	public static final ClientProt OPLOC1 = new ClientProt(12, 9);

	@ObfuscatedName("nr.v")
	public static final ClientProt IGNORELIST_ADD = new ClientProt(13, -1);

	@ObfuscatedName("nr.o")
	public static final ClientProt SOUND_SONGEND = new ClientProt(14, 4);

	@ObfuscatedName("nr.s")
	public static final ClientProt field3697 = new ClientProt(15, 9);

	@ObfuscatedName("nr.y")
	public static final ClientProt OPOBJ5 = new ClientProt(16, 7);

	@ObfuscatedName("nr.q")
	public static final ClientProt MESSAGE_QUICKCHAT_PUBLIC = new ClientProt(17, -1);

	@ObfuscatedName("nr.x")
	public static final ClientProt CLICKWORLDMAP = new ClientProt(18, 4);

	@ObfuscatedName("nr.b")
	public static final ClientProt field3701 = new ClientProt(19, 1);

	@ObfuscatedName("nr.h")
	public static final ClientProt CREATE_ACCOUNT = new ClientProt(20, -2);

	@ObfuscatedName("nr.a")
	public static final ClientProt OPLOCT = new ClientProt(21, 17);

	@ObfuscatedName("nr.g")
	public static final ClientProt TRANSMITVAR_VERIFYID = new ClientProt(22, 4);

	@ObfuscatedName("nr.i")
	public static final ClientProt REFLECTION_CHECK_REPLY = new ClientProt(23, -1);

	@ObfuscatedName("nr.j")
	public static final ClientProt NATIVE_LIBRARY_FAILURE = new ClientProt(24, -1);

	@ObfuscatedName("nr.t")
	public static final ClientProt OPOBJ2 = new ClientProt(25, 7);

	@ObfuscatedName("nr.ae")
	public static final ClientProt OPOBJ3 = new ClientProt(26, 7);

	@ObfuscatedName("nr.ag")
	public static final ClientProt OPLOC3 = new ClientProt(27, 9);

	@ObfuscatedName("nr.ah")
	public static final ClientProt CREATE_CHECK_EMAIL = new ClientProt(28, -2);

	@ObfuscatedName("nr.al")
	public static final ClientProt IF_BUTTON4 = new ClientProt(29, 8);

	@ObfuscatedName("nr.ac")
	public static final ClientProt SOUND_SONGPRELOADED = new ClientProt(30, 4);

	@ObfuscatedName("nr.ai")
	public static final ClientProt OPNPC4 = new ClientProt(31, 3);

	@ObfuscatedName("nr.aw")
	public static final ClientProt CLAN_KICKUSER = new ClientProt(32, -1);

	@ObfuscatedName("nr.as")
	public static final ClientProt MOVE_GAMECLICK = new ClientProt(33, 5);

	@ObfuscatedName("nr.at")
	public static final ClientProt CHANGE_EMAIL_ADDRESS = new ClientProt(34, -2);

	@ObfuscatedName("nr.ad")
	public static final ClientProt FRIENDLIST_DEL = new ClientProt(35, -1);

	@ObfuscatedName("nr.am")
	public static final ClientProt OPNPC6 = new ClientProt(36, 3);

	@ObfuscatedName("nr.au")
	public static final ClientProt EVENT_CAMERA_POSITION = new ClientProt(37, 4);

	@ObfuscatedName("nr.ar")
	public static final ClientProt field3797 = new ClientProt(38, -2);

	@ObfuscatedName("nr.ap")
	public static final ClientProt OPLOC6 = new ClientProt(39, 9);

	@ObfuscatedName("nr.aq")
	public static final ClientProt CUTSCENE_FINISHED = new ClientProt(40, 1);

	@ObfuscatedName("nr.ax")
	public static final ClientProt OPPLAYERT = new ClientProt(41, 11);

	@ObfuscatedName("nr.av")
	public static final ClientProt IGNORE_SETNOTES = new ClientProt(42, -1);

	@ObfuscatedName("nr.ao")
	public static final ClientProt field3753 = new ClientProt(43, 1);

	@ObfuscatedName("nr.aj")
	public static final ClientProt CHAT_SETMODE = new ClientProt(44, 1);

	@ObfuscatedName("nr.ay")
	public static final ClientProt EVENT_MOUSE_CLICK = new ClientProt(45, 6);

	@ObfuscatedName("nr.ab")
	public static final ClientProt field3700 = new ClientProt(46, -2);

	@ObfuscatedName("nr.az")
	public static final ClientProt IGNORELIST_DEL = new ClientProt(47, -1);

	@ObfuscatedName("nr.aa")
	public static final ClientProt OPPLAYER8 = new ClientProt(48, 3);

	@ObfuscatedName("nr.af")
	public static final ClientProt OPPLAYER5 = new ClientProt(49, 3);

	@ObfuscatedName("nr.ak")
	public static final ClientProt IF_BUTTON8 = new ClientProt(50, 8);

	@ObfuscatedName("nr.an")
	public static final ClientProt OPNPC1 = new ClientProt(51, 3);

	@ObfuscatedName("nr.bf")
	public static final ClientProt AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL = new ClientProt(52, -1);

	@ObfuscatedName("nr.bl")
	public static final ClientProt SIMPLE_TOOLKIT_CHANGE = new ClientProt(53, 1);

	@ObfuscatedName("nr.bk")
	public static final ClientProt OPPLAYER7 = new ClientProt(54, 3);

	@ObfuscatedName("nr.bh")
	public static final ClientProt DIRECTX_FAILURE = new ClientProt(55, 2);

	@ObfuscatedName("nr.bx")
	public static final ClientProt OPNPC2 = new ClientProt(56, 3);

	@ObfuscatedName("nr.bd")
	public static final ClientProt CLOSE_MODAL = new ClientProt(57, 0);

	@ObfuscatedName("nr.bc")
	public static final ClientProt IF_BUTTONT = new ClientProt(58, 16);

	@ObfuscatedName("nr.bi")
	public static final ClientProt APCOORDT = new ClientProt(59, 12);

	@ObfuscatedName("nr.bn")
	public static final ClientProt SEND_EMAIL_VALIDATION_CODE = new ClientProt(60, -1);

	@ObfuscatedName("nr.bt")
	public static final ClientProt OPLOC4 = new ClientProt(61, 9);

	@ObfuscatedName("nr.bq")
	public static final ClientProt OPPLAYER2 = new ClientProt(62, 3);

	@ObfuscatedName("nr.bm")
	public static final ClientProt IF_BUTTON7 = new ClientProt(63, 8);

	@ObfuscatedName("nr.bb")
	public static final ClientProt ADD_NEW_EMAIL_ADDRESS = new ClientProt(64, -2);

	@ObfuscatedName("nr.be")
	public static final ClientProt CREATE_CHECK_NAME = new ClientProt(65, -1);

	@ObfuscatedName("nr.by")
	public static final ClientProt IF_BUTTON9 = new ClientProt(66, 8);

	@ObfuscatedName("nr.bu")
	public static final ClientProt IF_BUTTON10 = new ClientProt(67, 8);

	@ObfuscatedName("nr.bw")
	public static final ClientProt IF_BUTTON2 = new ClientProt(68, 8);

	@ObfuscatedName("nr.bo")
	public static final ClientProt CREATE_SUGGEST_NAMES = new ClientProt(69, 0);

	@ObfuscatedName("nr.bz")
	public static final ClientProt IF_BUTTON5 = new ClientProt(70, 8);

	@ObfuscatedName("nr.bv")
	public static final ClientProt STORE_SERVERPERM_VARCS = new ClientProt(71, -2);

	@ObfuscatedName("nr.br")
	public static final ClientProt EVENT_NATIVE_MOUSE_CLICK = new ClientProt(72, 7);

	@ObfuscatedName("nr.bg")
	public static final ClientProt FRIEND_SETRANK = new ClientProt(73, -1);

	@ObfuscatedName("nr.ba")
	public static final ClientProt PING_STATISTICS = new ClientProt(74, 4);

	@ObfuscatedName("nr.bp")
	public static final ClientProt FRIEND_SETNOTES = new ClientProt(75, -1);

	@ObfuscatedName("nr.bj")
	public static final ClientProt OPPLAYER3 = new ClientProt(76, 3);

	@ObfuscatedName("nr.bs")
	public static final ClientProt WORLDLIST_FETCH = new ClientProt(77, 4);

	@ObfuscatedName("nr.cl")
	public static final ClientProt MOVE_MINIMAPCLICK = new ClientProt(78, 18);

	@ObfuscatedName("nr.cg")
	public static final ClientProt MAP_BUILD_COMPLETE = new ClientProt(79, 4);

	@ObfuscatedName("nr.ce")
	public static final ClientProt TELEMETRY_ERROR = new ClientProt(80, 0);

	@ObfuscatedName("nr.cu")
	public static final ClientProt OPOBJ1 = new ClientProt(81, 7);

	@ObfuscatedName("nr.ci")
	public static final ClientProt UID_PASSPORT_RESEND_REQUEST = new ClientProt(82, 0);

	@ObfuscatedName("nr.cn")
	public static final ClientProt IF_BUTTON6 = new ClientProt(83, 8);

	@ObfuscatedName("nr.cv")
	public static final ClientProt CLIENT_CHEAT = new ClientProt(84, -1);

	@ObfuscatedName("nr.cp")
	public static final ClientProt FRIENDLIST_ADD = new ClientProt(85, -1);

	@ObfuscatedName("nr.ca")
	public static final ClientProt IF_BUTTON3 = new ClientProt(86, 8);

	@ObfuscatedName("nr.cx")
	public static final ClientProt EVENT_KEYBOARD = new ClientProt(87, -2);

	@ObfuscatedName("nr.cw")
	public static final ClientProt SET_CHATFILTERSETTINGS = new ClientProt(88, 3);

	@ObfuscatedName("nr.ct")
	public static final ClientProt MOVE_SCRIPTED = new ClientProt(89, 5);

	@ObfuscatedName("nr.cf")
	public static final ClientProt DETECT_MODIFIED_CLIENT = new ClientProt(90, 4);

	@ObfuscatedName("nr.co")
	public static final ClientProt OPPLAYER10 = new ClientProt(91, 3);

	@ObfuscatedName("nr.cr")
	public static final ClientProt CLAN_JOINCHAT_LEAVECHAT = new ClientProt(92, -1);

	@ObfuscatedName("nr.cm")
	public static final ClientProt EVENT_APPLET_FOCUS = new ClientProt(93, 1);

	@ObfuscatedName("nr.cq")
	public static final ClientProt CLANCHANNEL_KICKUSER = new ClientProt(94, -1);

	@ObfuscatedName("nr.ch")
	public static final ClientProt MESSAGE_PUBLIC = new ClientProt(95, -1);

	@ObfuscatedName("nr.cb")
	public static final ClientProt OPLOC2 = new ClientProt(96, 9);

	@ObfuscatedName("nr.cs")
	public static final ClientProt EVENT_MOUSE_MOVE = new ClientProt(97, -1);

	@ObfuscatedName("nr.cy")
	public static final ClientProt RESUME_PAUSEBUTTON = new ClientProt(98, 6);

	@ObfuscatedName("nr.cc")
	public static final ClientProt RESUME_P_OBJDIALOG = new ClientProt(99, 2);

	@ObfuscatedName("nr.cz")
	public static final ClientProt SEND_PING_REPLY = new ClientProt(100, 9);

	@ObfuscatedName("nr.ck")
	public static final ClientProt RESUME_P_NAMEDIALOG = new ClientProt(101, -1);

	@ObfuscatedName("nr.cj")
	public static final ClientProt OPPLAYER4 = new ClientProt(102, 3);

	@ObfuscatedName("nr.cd")
	public static final ClientProt NO_TIMEOUT = new ClientProt(103, 0);

	@ObfuscatedName("nr.dd")
	public static final ClientProt IF_PLAYER = new ClientProt(104, -1);

	@ObfuscatedName("nr.dr")
	public static final ClientProt OPOBJ6 = new ClientProt(105, 7);

	@ObfuscatedName("nr.da")
	public static final ClientProt ABORT_P_DIALOG = new ClientProt(106, 0);

	@ObfuscatedName("nr.dt")
	public static final ClientProt FACE_SQUARE = new ClientProt(107, 4);

	@ObfuscatedName("nr.do")
	public static final ClientProt BUG_REPORT = new ClientProt(108, -2);

	@ObfuscatedName("nr.dz")
	public static final ClientProt CLIENT_COMPRESSEDTEXTUREFORMAT_SUPPORT = new ClientProt(109, -2);

	@ObfuscatedName("nr.dv")
	public static final ClientProt RESUME_P_CLANFORUMQFCDIALOG = new ClientProt(110, -1);

	@ObfuscatedName("nr.dm")
	public static final ClientProt IF_BUTTON1 = new ClientProt(111, 8);

	@ObfuscatedName("nr.dq")
	public static final ClientProt AUTO_SETUP_RESULT = new ClientProt(112, 18);

	@ObfuscatedName("nr.dc")
	public static final ClientProt OPNPCT = new ClientProt(113, 11);

	@ObfuscatedName("nr.di")
	public static final ClientProt OPOBJT = new ClientProt(114, 15);

	@ObfuscatedName("nr.dk")
	public static final ClientProt MESSAGE_QUICKCHAT_PRIVATE = new ClientProt(115, -1);

	@ObfuscatedName("nr.dn")
	public static final ClientProt OPNPC3 = new ClientProt(116, 3);

	@ObfuscatedName("nr.df")
	public static final ClientProt OPPLAYER1 = new ClientProt(117, 3);

	@ObfuscatedName("nr.dw")
	public static final ClientProt CREATE_LOG_PROGRESS = new ClientProt(118, 1);

	@ObfuscatedName("nr.ds")
	public static final ClientProt OPLOC5 = new ClientProt(119, 9);

	@ObfuscatedName("nr.du")
	public static final ClientProt URL_REQUEST = new ClientProt(120, -2);

	@ObfuscatedName("nr.dl")
	public static final ClientProt OPOBJ4 = new ClientProt(121, 7);

	@ObfuscatedName("nr.dp")
	public static final ClientProt IF_BUTTOND = new ClientProt(122, 16);

	@ObfuscatedName("nr.dy")
	public static final ClientProt WINDOW_STATUS = new ClientProt(123, 6);

	@ObfuscatedName("nr.db")
	public final int id;

	@ObfuscatedName("nr.dh")
	public final int size;

	public ClientProt(int id, int size) {
		this.id = id;
		this.size = size;
	}
}
