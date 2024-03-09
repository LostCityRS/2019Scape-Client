package com.jagex;

import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.playergroup.PlayerGroup;
import com.jagex.playergroup.PlayerGroupDelta;
import com.jagex.playergroup.PlayerGroupResourceProvider;
import deob.ObfuscatedName;
import deob.Statics;
import jaclib.ping.Ping;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

public final class client extends GameShell {

    public static final boolean ENABLE_RSA = false;
    public static final boolean ENABLE_JS5_RSA = false;
    public static final boolean ENABLE_JS5_XOR = false;
    public static final boolean ENABLE_HOST_CHECK = false;
    public static final boolean ENABLE_ISAAC = false;
	public static final boolean ENABLE_TINYENC = false;
	public static final boolean ALLOW_COMMANDS_ANYWHERE = true;

	@ObfuscatedName("client.bv")
	public static ModeGame field10768 = null;

	@ObfuscatedName("client.bg")
	public static boolean field11079 = false;

	@ObfuscatedName("client.ba")
	public static boolean field10770 = false;

	@ObfuscatedName("client.bp")
	public static String field10990 = null;

	@ObfuscatedName("client.bs")
	public static int field10772 = 0;

	@ObfuscatedName("client.cg")
	public static int field10773 = 0;

	@ObfuscatedName("client.ce")
	public static boolean field10774 = false;

	@ObfuscatedName("client.cu")
	public static int field10775 = 0;

	@ObfuscatedName("client.ci")
	public static int field10776 = 0;

	@ObfuscatedName("client.cn")
	public static int field10777 = 0;

	@ObfuscatedName("client.cv")
	public static int field10778 = 0;

	@ObfuscatedName("client.ca")
	public static boolean field10779 = false;

	@ObfuscatedName("client.cx")
	public static boolean field10812 = false;

	@ObfuscatedName("client.cw")
	public static String field10781 = null;

	@ObfuscatedName("client.ct")
	public static String field11073 = null;

	@ObfuscatedName("client.cf")
	public static String field10947 = null;

	@ObfuscatedName("client.co")
	public static boolean field10784 = false;

	@ObfuscatedName("client.cr")
	public static boolean field10785 = false;

	@ObfuscatedName("client.cm")
	public static boolean field10786 = false;

	@ObfuscatedName("client.cq")
	public static int field10787 = 0;

	@ObfuscatedName("client.ch")
	public static int field10788 = -1;

	@ObfuscatedName("client.cb")
	public static String field10789 = null;

	@ObfuscatedName("client.cs")
	public static String field10790 = null;

	@ObfuscatedName("client.cc")
	public static int state = 5;

	@ObfuscatedName("client.cz")
	public static Matrix4x4 field10792 = new Matrix4x4();

	@ObfuscatedName("client.ck")
	public static Matrix4x3 field10793 = new Matrix4x3();

	@ObfuscatedName("client.cj")
	public static Matrix4x3 field10875 = new Matrix4x3();

	@ObfuscatedName("client.dm")
	public static long field10795 = 0L;

	@ObfuscatedName("client.dq")
	public static boolean field10796 = false;

	@ObfuscatedName("client.dc")
	public static boolean field11023 = true;

	@ObfuscatedName("client.dk")
	public static int field10798 = 0;

	@ObfuscatedName("client.dn")
	public static int field10903 = 0;

	@ObfuscatedName("client.df")
	public static boolean field10800 = true;

	@ObfuscatedName("client.dw")
	public static boolean field10801 = true;

	@ObfuscatedName("client.ds")
	public static boolean field10794 = false;

	@ObfuscatedName("client.du")
	public static boolean field10848 = false;

	@ObfuscatedName("client.dp")
	public static int field10831 = 0;

	@ObfuscatedName("client.dy")
	public static HintArrow[] field10851 = new HintArrow[9];

	@ObfuscatedName("client.db")
	public static class529[] field10931 = new class529[8];

	@ObfuscatedName("client.dx")
	public static boolean field10807 = false;

	@ObfuscatedName("client.de")
	public static boolean field10808 = false;

	@ObfuscatedName("client.eo")
	public static boolean field10809 = true;

	@ObfuscatedName("client.ey")
	public static long field10810 = (long) (Math.random() * 9.999999999E9D);

	@ObfuscatedName("client.eu")
	public static boolean field10836 = false;

	@ObfuscatedName("client.ed")
	public static int field11005 = 0;

	@ObfuscatedName("client.ee")
	public static int field10915 = 0;

	@ObfuscatedName("client.ei")
	public static boolean field10814 = false;

	@ObfuscatedName("client.ej")
	public static LogoutReason field10853 = LogoutReason.field9132;

	@ObfuscatedName("client.ev")
	public static IterableQueue field10816 = new IterableQueue();

	@ObfuscatedName("client.ec")
	public static int field10817 = 0;

	@ObfuscatedName("client.eh")
	public static int field10819 = 0;

	@ObfuscatedName("client.eq")
	public static class565[] field11067 = new class565[131];

	@ObfuscatedName("client.ez")
	public static int field10822 = 0;

	@ObfuscatedName("client.ef")
	public static class565[] field11024 = new class565[75];

	@ObfuscatedName("client.et")
	public static Color[] field10824 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@ObfuscatedName("client.ea")
	public static Color[] field10825 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@ObfuscatedName("client.ew")
	public static Color[] field10826 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@ObfuscatedName("client.fu")
	public static int field10827 = 0;

	@ObfuscatedName("client.fs")
	public static int field10821 = 0;

	@ObfuscatedName("client.gr")
	public static int field10829 = 0;

	@ObfuscatedName("client.gt")
	public static WeightedCache field10830 = new WeightedCache(8);

	@ObfuscatedName("client.gh")
	public static WeightedCache field10894 = new WeightedCache(8);

	@ObfuscatedName("client.gm")
	public static String field11068 = null;

	@ObfuscatedName("client.gw")
	public static final class401 field10833 = new class11();

	@ObfuscatedName("client.ha")
	public static WeightedCache field10834 = new WeightedCache(16);

	@ObfuscatedName("client.hk")
	public static WeightedCache field10857 = new WeightedCache(8);

	@ObfuscatedName("client.ip")
	public static PlayerGroupResourceProvider field10837 = new ClientPlayerGroupResourceProvider();

	@ObfuscatedName("client.id")
	public static IterableMap field10838 = new IterableMap(64);

	@ObfuscatedName("client.ia")
	public static ObjectWrapper[] field10839 = new ObjectWrapper[1024];

	@ObfuscatedName("client.if")
	public static int field10906 = 0;

	@ObfuscatedName("client.ih")
	public static int field11011 = 0;

	@ObfuscatedName("client.iy")
	public static int[] field11036 = new int[1024];

	@ObfuscatedName("client.ii")
	public static int field10876 = 0;

	@ObfuscatedName("client.iz")
	public static int[] field10844 = new int[251];

	@ObfuscatedName("client.ik")
	public static int field10815 = 0;

	@ObfuscatedName("client.im")
	public static int field10846 = 0;

	@ObfuscatedName("client.ic")
	public static int[] field10847 = new int[1000];

	@ObfuscatedName("client.jf")
	public static final ServerConnection field10835 = new ServerConnection();

	@ObfuscatedName("client.ju")
	public static final ServerConnection field10849 = new ServerConnection();

	@ObfuscatedName("client.jy")
	public static final ServerConnection[] field10850 = new ServerConnection[] { field10849, field10835 };

	@ObfuscatedName("client.jl")
	public static int field10842 = 0;

	@ObfuscatedName("client.jn")
	public static boolean field11082 = false;

	@ObfuscatedName("client.je")
	public static class669 field10994 = new class669();

	@ObfuscatedName("client.jw")
	public static SecureRandomProvider field10967 = new SecureRandomProvider();

	@ObfuscatedName("client.js")
	public static World world = new World(false);

	@ObfuscatedName("client.jt")
	public static volatile boolean field10856 = false;

	@ObfuscatedName("client.jq")
	public static Object field10920 = new Object();

	@ObfuscatedName("client.jv")
	public static Object field10858 = new Object();

	@ObfuscatedName("client.ja")
	public static int[] field10859 = new int[64];

	@ObfuscatedName("client.jj")
	public static int field10938 = 0;

	@ObfuscatedName("client.jo")
	public static final int[] field10914 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.jx")
	public static int field10862 = -1;

	@ObfuscatedName("client.jh")
	public static int field10863 = 3;

	@ObfuscatedName("client.jp")
	public static boolean field10877 = false;

	@ObfuscatedName("client.jk")
	public static int field11041 = -1;

	@ObfuscatedName("client.kw")
	public static int field10797 = 0;

	@ObfuscatedName("client.ke")
	public static int field10769 = 0;

	@ObfuscatedName("client.kq")
	public static int field10868 = -1;

	@ObfuscatedName("client.kg")
	public static int field10869 = -1;

	@ObfuscatedName("client.ki")
	public static int field11002 = 255;

	@ObfuscatedName("client.ks")
	public static int field10871 = 0;

	@ObfuscatedName("client.kh")
	public static int field10872 = 0;

	@ObfuscatedName("client.ka")
	public static int field10805 = 0;

	@ObfuscatedName("client.kb")
	public static int[] field11092 = new int[4096];

	@ObfuscatedName("client.kr")
	public static int[] field10984 = new int[4096];

	@ObfuscatedName("client.kj")
	public static final int[] field10823 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@ObfuscatedName("client.kn")
	public static int field10870 = 0;

	@ObfuscatedName("client.kp")
	public static int field10879 = 4;

	@ObfuscatedName("client.km")
	public static int field10880 = 0;

	@ObfuscatedName("client.ky")
	public static int field11008 = -1103918620;

	@ObfuscatedName("client.kk")
	public static int field10861 = 0;

	@ObfuscatedName("client.kv")
	public static int field10883 = 1;

	@ObfuscatedName("client.kt")
	public static int field10884 = 0;

	@ObfuscatedName("client.li")
	public static int field10885 = 0;

	@ObfuscatedName("client.lv")
	public static int field11026 = -630688752;

	@ObfuscatedName("client.la")
	public static int field10887 = 0;

	@ObfuscatedName("client.lp")
	public static int field11074 = 1;

	@ObfuscatedName("client.lc")
	public static int field10952 = 0;

	@ObfuscatedName("client.lm")
	public static Random field10890 = new Random();

	@ObfuscatedName("client.ll")
	public static int field10891 = 0;

	@ObfuscatedName("client.lb")
	public static int field10892 = 0;

	@ObfuscatedName("client.le")
	public static int field10893 = 0;

	@ObfuscatedName("client.ly")
	public static float field11004 = 1088.0F;

	@ObfuscatedName("client.lg")
	public static float field10895 = 0.0F;

	@ObfuscatedName("client.lx")
	public static float field10896 = 0.0F;

	@ObfuscatedName("client.lj")
	public static float field10897 = 0.0F;

	@ObfuscatedName("client.lw")
	public static boolean field10898 = false;

	@ObfuscatedName("client.lz")
	public static boolean field11059 = false;

	@ObfuscatedName("client.ld")
	public static int field11089 = 1;

	@ObfuscatedName("client.lk")
	public static int field10901 = field11089 * 35 + 200;

	@ObfuscatedName("client.mf")
	public static boolean field10902 = true;

	@ObfuscatedName("client.mh")
	public static int field10806 = 0;

	@ObfuscatedName("client.me")
	public static int[][][] field10981 = new int[2][][];

	@ObfuscatedName("client.mn")
	public static int field10904 = -1;

	@ObfuscatedName("client.mv")
	public static int field10908 = -1;

	@ObfuscatedName("client.my")
	public static int field10909 = 0;

	@ObfuscatedName("client.md")
	public static int field10932 = 0;

	@ObfuscatedName("client.mk")
	public static int field10976 = 0;

	@ObfuscatedName("client.mq")
	public static int field10843 = 0;

	@ObfuscatedName("client.ms")
	public static int field10913 = 0;

	@ObfuscatedName("client.mp")
	public static boolean field10813 = false;

	@ObfuscatedName("client.mo")
	public static boolean field10969 = false;

	@ObfuscatedName("client.mi")
	public static int field10916 = 0;

	@ObfuscatedName("client.mr")
	public static int[] field10917 = new int[503];

	@ObfuscatedName("client.mz")
	public static int[] field10918 = new int[512];

	@ObfuscatedName("client.mb")
	public static int field10919 = 0;

	@ObfuscatedName("client.mu")
	public static class716 field10882 = new class716();

	@ObfuscatedName("client.mt")
	public static int field10921 = 0;

	@ObfuscatedName("client.mc")
	public static float[] field10922 = new float[3];

	@ObfuscatedName("client.ma")
	public static int field10866 = 0;

	@ObfuscatedName("client.mj")
	public static int field10924 = 0;

	@ObfuscatedName("client.mw")
	public static int field10925 = 0;

	@ObfuscatedName("client.mm")
	public static int field10926 = 0;

	@ObfuscatedName("client.ne")
	public static int field10927 = 0;

	@ObfuscatedName("client.np")
	public static int field11046 = -1;

	@ObfuscatedName("client.na")
	public static int[] field11061 = new int[2];

	@ObfuscatedName("client.ni")
	public static int[] field10933 = new int[2];

	@ObfuscatedName("client.nb")
	public static int[] field10934 = new int[2];

	@ObfuscatedName("client.nw")
	public static int[] field10935 = new int[2];

	@ObfuscatedName("client.nx")
	public static int[] field10820 = new int[2];

	@ObfuscatedName("client.nl")
	public static long field10937 = 0L;

	@ObfuscatedName("client.ng")
	public static boolean field10960 = true;

	@ObfuscatedName("client.nt")
	public static int field10939 = 32;

	@ObfuscatedName("client.nn")
	public static int field10940 = 16;

	@ObfuscatedName("client.nk")
	public static int field10941 = 765;

	@ObfuscatedName("client.nq")
	public static int field10942 = 553;

	@ObfuscatedName("client.nu")
	public static PlayerEntity[] field10944 = new PlayerEntity[2048];

	@ObfuscatedName("client.nz")
	public static int field10945 = -1;

	@ObfuscatedName("client.nc")
	public static Map field10946 = new HashMap();

	@ObfuscatedName("client.nv")
	public static boolean field11006 = false;

	@ObfuscatedName("client.nh")
	public static boolean field10948 = false;

	@ObfuscatedName("client.oo")
	public static int field10949 = 0;

	@ObfuscatedName("client.ol")
	public static int field10950 = 0;

	@ObfuscatedName("client.oq")
	public static boolean field10951 = false;

	@ObfuscatedName("client.oi")
	public static boolean field11081 = false;

	@ObfuscatedName("client.ot")
	public static boolean field10953 = false;

	@ObfuscatedName("client.ow")
	public static AttackOpPriority field10954 = AttackOpPriority.field7908;

	@ObfuscatedName("client.oa")
	public static AttackOpPriority field10955 = AttackOpPriority.field7908;

	@ObfuscatedName("client.oz")
	public static boolean field11101 = false;

	@ObfuscatedName("client.op")
	public static final short[] field10958 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };

	@ObfuscatedName("client.om")
	public static final short[] field10959 = new short[] { 9, 10, 11, 12, 13, 1003 };

	@ObfuscatedName("client.of")
	public static int[] field10832 = new int[8];

	@ObfuscatedName("client.oy")
	public static String[] field10961 = new String[8];

	@ObfuscatedName("client.od")
	public static boolean[] field10962 = new boolean[8];

	@ObfuscatedName("client.os")
	public static int field10963 = -1;

	@ObfuscatedName("client.pw")
	public static IterableMap field10964 = new IterableMap(64);

	@ObfuscatedName("client.pk")
	public static IterableQueue field10965 = new IterableQueue();

	@ObfuscatedName("client.pm")
	public static IterableMap field10966 = new IterableMap(16);

	@ObfuscatedName("client.pa")
	public static class716 field10864 = new class716();

	@ObfuscatedName("client.pz")
	public static int field10968 = 0;

	@ObfuscatedName("client.pd")
	public static int field11038 = -1;

	@ObfuscatedName("client.pn")
	public static int field10970 = -1;

	@ObfuscatedName("client.px")
	public static int field10971 = -1;

	@ObfuscatedName("client.ps")
	public static int field10972 = -1;

	@ObfuscatedName("client.pl")
	public static boolean field10973 = false;

	@ObfuscatedName("client.pr")
	public static int field10974 = -1;

	@ObfuscatedName("client.py")
	public static int field10975 = -1;

	@ObfuscatedName("client.pf")
	public static String field11039 = null;

	@ObfuscatedName("client.pp")
	public static String field10977 = null;

	@ObfuscatedName("client.pu")
	public static volatile int field10978 = -1;

	@ObfuscatedName("client.pc")
	public static IterableMap field10979 = new IterableMap(8);

	@ObfuscatedName("client.qp")
	public static int field10980 = 0;

	@ObfuscatedName("client.qx")
	public static Component field11056 = null;

	@ObfuscatedName("client.qt")
	public static int field11049 = 0;

	@ObfuscatedName("client.qz")
	public static int field11102 = 0;

	@ObfuscatedName("client.qg")
	public static boolean field10881 = false;

	@ObfuscatedName("client.qe")
	public static boolean field10985 = false;

	@ObfuscatedName("client.ql")
	public static Component field10986 = null;

	@ObfuscatedName("client.qj")
	public static boolean field10888 = true;

	@ObfuscatedName("client.qr")
	public static boolean field10988 = false;

	@ObfuscatedName("client.qc")
	public static Component field10989 = null;

	@ObfuscatedName("client.qd")
	public static Component field10828 = null;

	@ObfuscatedName("client.qi")
	public static int field10991 = 0;

	@ObfuscatedName("client.qy")
	public static int field10992 = 0;

	@ObfuscatedName("client.qw")
	public static Component field10993 = null;

	@ObfuscatedName("client.qm")
	public static boolean field10878 = false;

	@ObfuscatedName("client.qq")
	public static int field10995 = -1;

	@ObfuscatedName("client.qf")
	public static int field10889 = -1;

	@ObfuscatedName("client.qu")
	public static int field10799 = -1;

	@ObfuscatedName("client.qs")
	public static int field10998 = -1;

	@ObfuscatedName("client.qa")
	public static boolean field10999 = false;

	@ObfuscatedName("client.qh")
	public static int field11000 = -1;

	@ObfuscatedName("client.qv")
	public static int field10852 = -1;

	@ObfuscatedName("client.qk")
	public static boolean field10886 = false;

	@ObfuscatedName("client.rp")
	public static int field11003 = 0;

	@ObfuscatedName("client.ro")
	public static boolean field10860 = false;

	@ObfuscatedName("client.rk")
	public static boolean field11083 = false;

	@ObfuscatedName("client.rv")
	public static int field11058 = 1;

	@ObfuscatedName("client.rx")
	public static int[] field11009 = new int[64];

	@ObfuscatedName("client.ry")
	public static int field11010 = 0;

	@ObfuscatedName("client.rg")
	public static int[] field10783 = new int[64];

	@ObfuscatedName("client.rz")
	public static int field11012 = 0;

	@ObfuscatedName("client.re")
	public static int[] field11015 = new int[64];

	@ObfuscatedName("client.rt")
	public static int field11014 = 0;

	@ObfuscatedName("client.rl")
	public static int[] field11019 = new int[64];

	@ObfuscatedName("client.rc")
	public static int field11016 = 0;

	@ObfuscatedName("client.rr")
	public static int[] field11017 = new int[64];

	@ObfuscatedName("client.rd")
	public static int field11018 = 0;

	@ObfuscatedName("client.rn")
	public static int[] field10841 = new int[64];

	@ObfuscatedName("client.rb")
	public static int field11020 = 0;

	@ObfuscatedName("client.ru")
	public static int field11021 = 0;

	@ObfuscatedName("client.sv")
	public static int field11022 = 0;

	@ObfuscatedName("client.sw")
	public static int field10936 = 0;

	@ObfuscatedName("client.ss")
	public static int field10818 = 0;

	@ObfuscatedName("client.sx")
	public static int field11025 = 0;

	@ObfuscatedName("client.sm")
	public static int field10803 = 0;

	@ObfuscatedName("client.sk")
	public static int field11027 = 0;

	@ObfuscatedName("client.si")
	public static int field11028 = 0;

	@ObfuscatedName("client.se")
	public static int field10957 = 0;

	@ObfuscatedName("client.sn")
	public static int field10907 = 0;

	@ObfuscatedName("client.sh")
	public static IterableQueue field11031 = new IterableQueue();

	@ObfuscatedName("client.st")
	public static IterableQueue field11032 = new IterableQueue();

	@ObfuscatedName("client.sl")
	public static IterableQueue field11033 = new IterableQueue();

	@ObfuscatedName("client.sp")
	public static IterableMap field10873 = new IterableMap(512);

	@ObfuscatedName("client.sz")
	public static int field11051 = 0;

	@ObfuscatedName("client.sf")
	public static int field11037 = -2;

	@ObfuscatedName("client.sy")
	public static boolean[] field11072 = new boolean[114];

	@ObfuscatedName("client.sa")
	public static boolean[] field10911 = new boolean[114];

	@ObfuscatedName("client.sb")
	public static Rectangle[] field11040 = new Rectangle[114];

	@ObfuscatedName("client.sj")
	public static int field10997;

	@ObfuscatedName("client.so")
	public static final int[] field11042;

	@ObfuscatedName("client.sc")
	public static int field10865;

	@ObfuscatedName("client.sg")
	public static int field11044;

	@ObfuscatedName("client.tu")
	public static int[] field11045;

	@ObfuscatedName("client.ta")
	public static int[] field10982;

	@ObfuscatedName("client.tr")
	public static int[] field11047;

	@ObfuscatedName("client.tc")
	public static class517[] field11048;

	@ObfuscatedName("client.tj")
	public static final int[] field10956;

	@ObfuscatedName("client.te")
	public static int field11050;

	@ObfuscatedName("client.tm")
	public static int field11029;

	@ObfuscatedName("client.tb")
	public static long[] field11053;

	@ObfuscatedName("client.tn")
	public static int field11054;

	@ObfuscatedName("client.tw")
	public static String field11055;

	@ObfuscatedName("client.tz")
	public static String field11030;

	@ObfuscatedName("client.tx")
	public static class482[][] field11057;

	@ObfuscatedName("client.ug")
	public static int field10899;

	@ObfuscatedName("client.ud")
	public static class16 field11034;

	@ObfuscatedName("client.ur")
	public static boolean[] field10983;

	@ObfuscatedName("client.uu")
	public static int[] field11062;

	@ObfuscatedName("client.uo")
	public static int[] field11063;

	@ObfuscatedName("client.un")
	public static int[] field11064;

	@ObfuscatedName("client.ue")
	public static int[] field10996;

	@ObfuscatedName("client.vq")
	public static short field11066;

	@ObfuscatedName("client.vx")
	public static short field10987;

	@ObfuscatedName("client.vb")
	public static short field10874;

	@ObfuscatedName("client.vl")
	public static short field11069;

	@ObfuscatedName("client.vr")
	public static short field11070;

	@ObfuscatedName("client.vo")
	public static short field11071;

	@ObfuscatedName("client.vv")
	public static short field10900;

	@ObfuscatedName("client.vw")
	public static short field10943;

	@ObfuscatedName("client.vt")
	public static int field10780;

	@ObfuscatedName("client.vu")
	public static int field11075;

	@ObfuscatedName("client.vi")
	public static int field11076;

	@ObfuscatedName("client.va")
	public static int field11077;

	@ObfuscatedName("client.vs")
	public static int field11078;

	@ObfuscatedName("client.vy")
	public static int field10811;

	@ObfuscatedName("client.ve")
	public static int field11080;

	@ObfuscatedName("client.vg")
	public static Friend[] field11065;

	@ObfuscatedName("client.vp")
	public static class716 field10910;

	@ObfuscatedName("client.vd")
	public static int field11084;

	@ObfuscatedName("client.vz")
	public static class27[] field11086;

	@ObfuscatedName("client.wa")
	public static int field10767;

	@ObfuscatedName("client.wo")
	public static Calendar field11088;

	@ObfuscatedName("client.wu")
	public static class553 field11001;

	@ObfuscatedName("client.wz")
	public static long field11090;

	@ObfuscatedName("client.wj")
	public static long field11091;

	@ObfuscatedName("client.wl")
	public static WeightedCache field11013;

	@ObfuscatedName("client.wp")
	public static Map field11093;

	@ObfuscatedName("client.wg")
	public static class184 field11094;

	@ObfuscatedName("client.wb")
	public static boolean field11095;

	@ObfuscatedName("client.wq")
	public static boolean field11096;

	@ObfuscatedName("client.xv")
	public static final int[] field11113;

	@ObfuscatedName("client.xn")
	public static List field11114;

	static {
		for (int var0 = 0; var0 < 114; var0++) {
			field11040[var0] = new Rectangle();
		}
		field10997 = 0;
		field11042 = new int[4];
		field10865 = 0;
		field11044 = 54;
		field11045 = new int[field11044];
		field10982 = new int[field11044];
		field11047 = new int[field11044];
		field11048 = new class517[field11044];
		field10956 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		field11050 = 0;
		field11029 = 0;
		field11053 = new long[100];
		field11054 = 0;
		field11055 = null;
		field11030 = null;
		field11057 = new class482[3][8];
		field10899 = 0;
		field11034 = new class16();
		field10983 = new boolean[5];
		field11062 = new int[5];
		field11063 = new int[5];
		field11064 = new int[5];
		field10996 = new int[5];
		field11066 = 256;
		field10987 = 205;
		field10874 = 256;
		field11069 = 320;
		field11070 = 1;
		field11071 = 32767;
		field10900 = 1;
		field10943 = 32767;
		field10780 = 0;
		field11075 = 0;
		field11076 = 0;
		field11077 = 0;
		field11078 = 0;
		field10811 = 0;
		field11080 = 0;
		field11065 = new Friend[400];
		field10910 = new class716();
		field11084 = 0;
		field11086 = new class27[400];
		field10767 = -1;
		field11088 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		field11001 = new class23();
		field11090 = -1L;
		field11091 = -1L;
		field11013 = new WeightedCache(8);
		field11093 = new HashMap();
		field11094 = new class184();
		field11095 = false;
		field11096 = false;
		field11113 = new int[4];
		field11114 = new ArrayList();
	}

	@ObfuscatedName("aaj.eo(I)V")
	public static void method14454() {
		field11010 = 0;
		field11012 = 0;
		field11014 = 0;
		field11016 = 0;
		field11018 = 0;
		field11020 = 0;
		field11021 = 0;
		field11022 = 0;
		field10936 = 0;
		field10818 = 0;
		field11025 = 0;
		field10803 = 0;
		field11027 = 0;
		field11028 = 0;
		field10957 = 0;
	}

	public final void init() {
		if (!this.checkhost()) {
			return;
		}
		String var1 = "";
		JavConfigParameter[] var2 = JavConfigParameter.method14975();
		for (int var3 = 0; var3 < var2.length; var3++) {
			JavConfigParameter var4 = var2[var3];
			String var5 = Statics.field11885.getParameter(var4.field4162);
			if (var5 != null) {
				switch(Integer.parseInt(var4.field4162)) {
					case 1:
						Statics.field579 = var5;
						break;
					case 2:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
							field10770 = true;
						} else {
							field10770 = false;
						}
						break;
					case 3:
						field10778 = Integer.parseInt(var5);
						break;
					case 4:
						Statics.field8327 = var5;
						break;
					case 5:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
						}
						break;
					case 6:
						field10789 = var5;
						break;
					case 7:
					default:
						JagException.method9845("", new RuntimeException());
						break;
					case 8:
						if (Statics.world == null) {
							Statics.world = new class749();
						}
						Statics.world.port = Integer.parseInt(var5);
						break;
					case 9:
						field10776 = Integer.parseInt(var5);
					case 10:
					case 13:
					case 18:
					case 22:
					case 37:
					case 38:
					case 48:
						break;
					case 11:
						field10788 = Integer.parseInt(var5);
						break;
					case 12:
						if (Statics.content == null) {
							Statics.content = new class749();
						}
						Statics.content.port = Integer.parseInt(var5);
						break;
					case 14:
						if (Statics.httpContent == null) {
							Statics.httpContent = new class749();
						}
						Statics.httpContent.host = var5;
						break;
					case 15:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
							field10784 = true;
						} else {
							field10784 = false;
						}
						break;
					case 16:
						Statics.field10250 = var5;
						break;
					case 17:
						Statics.field2627 = Integer.parseInt(var5);
						break;
					case 19:
						if (Statics.world == null) {
							Statics.world = new class749();
						}
						Statics.world.port2 = Integer.parseInt(var5);
						break;
					case 20:
						Statics.field8146 = Integer.parseInt(var5);
						break;
					case 21:
						field10790 = var5;
						break;
					case 23:
						if (Statics.content == null) {
							Statics.content = new class749();
						}
						Statics.content.host = var5;
						break;
					case 24:
						field10772 = Integer.parseInt(var5);
						break;
					case 25:
						field10775 = Integer.parseInt(var5);
						break;
					case 26:
						Statics.field1680 = Statics.method13875(Integer.parseInt(var5));
						break;
					case 27:
						Statics.field1811 = (ModeWhere) class686.method1897(ModeWhere.method13843(), Integer.parseInt(var5));
						if (Statics.field1811 == ModeWhere.field8277) {
							Statics.field1811 = ModeWhere.field8268;
						} else if (!Statics.field1811.method13838(class684.field8283) && Statics.field1811 != ModeWhere.field8273) {
							Statics.field1811 = ModeWhere.field8273;
						}
						break;
					case 28:
						field10947 = var5;
						break;
					case 29:
						if (Statics.lobby == null) {
							Statics.lobby = new class749();
						}
						Statics.lobby.port = Integer.parseInt(var5);
						break;
					case 30:
						if (Statics.content == null) {
							Statics.content = new class749();
						}
						Statics.content.port2 = Integer.parseInt(var5);
						break;
					case 31:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
							field11079 = true;
						} else {
							field11079 = false;
						}
						break;
					case 32:
						if (Statics.content == null) {
							Statics.content = new class749();
						}
						Statics.content.node = Integer.parseInt(var5);
						break;
					case 33:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
							field10786 = true;
						} else {
							field10786 = false;
						}
						break;
					case 34:
						field10773 = Integer.parseInt(var5);
						if (field10773 < 0 || field10773 >= field10824.length) {
							field10773 = 0;
						}
						break;
					case 35:
						field10990 = var5;
						break;
					case 36:
						Statics.field4093 = ModeWhat.method8146(Integer.parseInt(var5));
						if (Statics.field4093 != ModeWhat.WIP && Statics.field4093 != ModeWhat.RC && Statics.field4093 != ModeWhat.BUILDLIVE && Statics.field4093 != ModeWhat.LIVE) {
							Statics.field4093 = ModeWhat.LIVE;
						}
						break;
					case 39:
						field10777 = Integer.parseInt(var5);
						break;
					case 40:
						field11073 = var5;
						break;
					case 41:
						if (Statics.lobby == null) {
							Statics.lobby = new class749();
						}
						Statics.lobby.port2 = Integer.parseInt(var5);
						break;
					case 42:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
							field10785 = true;
						} else {
							field10785 = false;
						}
						break;
					case 43:
						if (Statics.lobby == null) {
							Statics.lobby = new class749();
						}
						Statics.lobby.host = var5;
						break;
					case 44:
						if (Statics.httpContent == null) {
							Statics.httpContent = new class749();
						}
						Statics.httpContent.port = Integer.parseInt(var5);
						break;
					case 45:
						if (Statics.httpContent == null) {
							Statics.httpContent = new class749();
						}
						Statics.httpContent.node = Integer.parseInt(var5);
						break;
					case 46:
						field10768 = ModeGame.method7704(Integer.parseInt(var5));
						if (field10768 == ModeGame.RUNESCAPE) {
							Statics.field10782 = class794.RUNESCAPE;
						} else {
							Statics.field10782 = class794.LEGACY;
						}
						break;
					case 47:
						var1 = var5;
						break;
					case 49:
						if (var5.equals(TextUtil.TRUE)) {
							field10814 = true;
						} else {
							field10814 = false;
						}
						break;
					case 50:
						if (Statics.world == null) {
							Statics.world = new class749();
						}
						Statics.world.node = Integer.parseInt(var5);
						break;
					case 51:
						field10781 = var5;
						if (field10781.length() > 100) {
							field10781 = null;
						}
						break;
					case 52:
						if (var5.equalsIgnoreCase(TextUtil.TRUE)) {
							field11006 = true;
						}
						break;
					case 53:
						if (Statics.httpContent == null) {
							Statics.httpContent = new class749();
						}
						Statics.httpContent.port2 = Integer.parseInt(var5);
						break;
					case 54:
						if (Statics.lobby == null) {
							Statics.lobby = new class749();
						}
						Statics.lobby.node = Integer.parseInt(var5);
						break;
					case 55:
						if (var5.equals(TextUtil.TRUE)) {
							field10774 = true;
						} else {
							field10774 = false;
						}
				}
			}
		}
		if (field10990 == null) {
			field10990 = "";
		}
		GameShell3$FrameParameters var6 = new GameShell3$FrameParameters(field10941, field10942, field10939, field10940, field10768.field8341);
		Statics.field8301 = this;
		String var7 = Statics.field4093.field8478;
		int var8 = Statics.field4093.field8477 + 32;
		if (!var1.equals("")) {
			var7 = var7 + "_" + var1;
			var8 = 0;
		}
		this.startApplet(var6, field10768.field8333, var7, var8, Js5Archive.getRequiredArrayLength(), 910, 1, field10786);
	}

	@ObfuscatedName("client.al(I)V")
	public final void maininit() {
		Frame var1 = new Frame(" ");
		var1.pack();
		var1.dispose();
		Statics.field1734 = new Component();
		method6793();
		ByteArrayPool.method4398(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 });
		Vector3.method6481(100);
		class421.method6406(10);
		Matrix4x4.method6651(20);
		Mouse.method7232(100);
		Statics.method18259(100);
		if (Statics.field1811 != ModeWhere.field8273) {
			Statics.field9166 = new byte[50][];
		}
		Statics.field688 = class48.method6822();
		if (Statics.field688.unknown7.method18750() == 1) {
			Scene.field6937 = false;
		}
		switch(Statics.field688.unknown6.method18740()) {
			case 3:
				class48.field788 = true;
				Statics.field688.method18157(Statics.field688.unknown6, 0);
				class576.method6971(ToolkitType.field8885);
				break;
			case 4:
				class48.field786 = true;
				Statics.field688.method18157(Statics.field688.unknown6, 0);
				class576.method6971(ToolkitType.field8872);
		}
		if (Statics.world.host == null) {
			Statics.world.host = Statics.field11885.getCodeBase().getHost();
		}
		Statics.field8755 = Statics.world;
		Statics.field4479 = new Js5DiskCache();
		Statics.field4489 = new ClientJs5TcpClient();
		Statics.field4436 = new Js5HttpClient(Statics.httpContent.host, Statics.httpContent.port, field10768.field8339);
		if (field10768 == ModeGame.RUNESCAPE) {
			field10809 = false;
		}
		LocType.field7501 = NPCType.field2694 = ObjType.field8650 = new short[256];
		try {
			Statics.field3428 = GameShell.method7321().getToolkit().getSystemClipboard();
		} catch (Exception var5) {
		}
		Statics.field11931 = Keyboard.method15006(Statics.canvas);
		Statics.field9182 = Mouse.method6806(Statics.canvas, true);
		if (cacheDat != null) {
			Statics.field1749 = new DiskStore(255, cacheDat, masterIndex, 2000000);
		}
		Statics.field9155 = new class893(field11034);
		try {
			Statics.field9155.method4683(class268.field2828);
			Statics.field9155.method4688(PositionMode.field2816, false);
			Statics.field9155.method4684(LookatMode.field2790, false);
			Statics.field9155.method4688(PositionMode.field2816, false);
			Statics.field9155.method4695(Vector3.method6483(99999.0F, 99999.0F, 99999.0F));
			Statics.field9155.method4814(Vector3.method6483(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			Statics.field9155.method4832(Vector3.method6483(99999.0F, 99999.0F, 99999.0F));
			Statics.field9155.method4690(Vector3.method6483(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (class1109 var4) {
		}
		Browser.method9163(Statics.field11885, Statics.osName);
		if (Statics.field1811 != ModeWhere.field8273 && Statics.field1811 != ModeWhere.field8276) {
			field10794 = true;
		}
		field6598 = LocalisedText.LOADING.method15021(Statics.field1680);
		Statics.field3183 = new AsyncRebuild();
		(new Thread(Statics.field3183)).start();
		Statics.field7957 = new class26();
		Statics.field3420 = new class243();
	}

	@ObfuscatedName("client.ac(I)V")
	public final void mainloop() {
		if (state == 2) {
			return;
		}
		if ((state == 1 || Statics.method611(state) || Statics.method15084(state)) && Statics.field1798 != null) {
			Statics.field1798.method3235(Statics.field1798.method3169(), Statics.field688.themeMusicVolume4.method18763());
		}
		if (field10856) {
			Object var1 = field10858;
			synchronized (field10858) {
				field10858.notify();
			}
			Object var3 = field10920;
			synchronized (field10920) {
				try {
					field10920.wait();
				} catch (InterruptedException var23) {
				}
			}
			field10856 = false;
		}
		field10903++;
		if (field10903 % 1000 == 1) {
			GregorianCalendar var6 = new GregorianCalendar();
			Statics.field1681 = var6.get(11) * 600 + var6.get(12) * 10 + var6.get(13) / 6;
			field10890.setSeed((long) Statics.field1681);
		}
		long var7 = MonotonicTime.method3655();
		field10849.method946();
		field10835.method946();
		this.method16917();
		if (Statics.field1833 != null) {
			Statics.field1833.method6837();
		}
		if (Statics.field1798 != null) {
			Statics.field1798.method3149();
		}
		Statics.field11931.method9069();
		Statics.field9182.method9087();
		TwitchHardwarePlatform.method4069(Statics.field8198, var7);
		this.method16971();
		if (Statics.field8198 != null) {
			Statics.field8198.method2120((int) var7);
		}
		field10819 = 0;
		field10822 = 0;
		for (class565 var9 = Statics.field11931.method9075(); var9 != null; var9 = Statics.field11931.method9075()) {
			int var10 = var9.method9145();
			if (var10 == 2 || var10 == 3) {
				if (field10819 < 131) {
					field11067[field10819] = var9;
					field10819++;
				}
			} else if (var10 == 0) {
				if (DeveloperConsole.method1584() && var9.method9141() == 28) {
					if (field10949 >= 2 && Statics.field11931.method9080(82)) {
						if (class29.method2978()) {
							class29.method3913();
						} else {
							class29.method542(Statics.field4490.method4667());
						}
					} else if (DeveloperConsole.method10211() && (Statics.field688.unknown8.method18701() == 0 || Statics.field11931.method9080(86))) {
						DeveloperConsole.close();
					} else if (Statics.field688.unknown8.method18701() == 0 || Statics.field11931.method9080(86)) {
						DeveloperConsole.method638();
					} else {
						Statics.method4943(LocalisedText.field8948.method15021(Statics.field1680));
					}
				}
				if (field10822 < 75) {
					field11024[field10822] = var9;
					field10822++;
				}
			}
		}
		field10817 = 0;
		for (class993 var11 = Statics.field9182.method9093(); var11 != null; var11 = Statics.field9182.method9093()) {
			int var12 = var11.method17848();
			if (var12 == -1) {
				class648.method670(var11);
			} else if (var12 == 6) {
				field10817 += var11.method17833();
				var11.method17835();
			} else if (class993.method15143(var12)) {
				field10816.method14153(var11);
				if (field10816.method14157() > 10) {
					class993 var13 = (class993) field10816.method14154();
					if (var13 != null) {
						var13.method17835();
					}
				}
			}
		}
		if (DeveloperConsole.method10211()) {
			Statics.method10298();
		}
		if (Statics.method2092(state)) {
			Loading.method15243();
			GameShell.method135();
		} else if (method9273(state)) {
			world.method7723();
		}
		if (Statics.method611(state) && !method9273(state)) {
			this.method16920();
			AccountCreationManager.method14952();
			LoginManager.method3048();
		} else if (Statics.method15084(state) && !method9273(state)) {
			this.method16920();
			LoginManager.method3048();
		} else if (state == 9) {
			LoginManager.method3048();
		} else if (isStateGame(state) && !method9273(state)) {
			method3006();
		} else if (state == 14 || state == 19) {
			LoginManager.method3048();
			if (LoginManager.field477 != -3 && LoginManager.field477 != 2 && LoginManager.field477 != 15) {
				if (state == 19) {
					LoginManager.field444 = LoginManager.field483;
					LoginManager.field479 = LoginManager.field482;
					LoginManager.field469 = LoginManager.field477;
					if (Statics.field488) {
						class750.method9401(Statics.field8753.node, Statics.field8753.host, Statics.field8753.port, Statics.field8753.port2);
						field10849.method941();
						setState(14);
					} else {
						logout(LoginManager.field485);
					}
				} else {
					logout(false);
				}
			}
		}
		class35.method10323(Statics.field8198);
		field10816.method14154();
		if (Statics.field8198 == null) {
			return;
		}
		Iterator var14 = field11093.entrySet().iterator();
		while (var14.hasNext()) {
			Entry var15 = (Entry) var14.next();
			class44 var16 = (class44) var15.getValue();
			if (var16.method826()) {
				byte[] var17 = var16.method821();
				if (var17 != null) {
					try {
						BufferedImage var18 = ImageIO.read(new ByteArrayInputStream(var17));
						int[] var19 = Statics.method14804(var18);
						Sprite var20 = Statics.field8198.method2199(var19, 0, var18.getWidth(), var18.getWidth(), var18.getHeight());
						field11013.method2921(var20, (long) (Integer) var15.getKey());
					} catch (IOException var22) {
						JagException.method9845(Statics.field8301.method8038(), var22);
					}
				}
				var14.remove();
			}
		}
	}

	@ObfuscatedName("client.ai(I)V")
	public final void mainredraw() {
		if (state == 2) {
			return;
		}
		long var1 = GameShell.method8660() / 1000000L - field10795;
		field10795 = GameShell.method8660() / 1000000L;
		if (Statics.method16436(state)) {
			if (field10937 != 0L && MonotonicTime.method3655() > field10937) {
				setWindowMode(getWindowMode(), -1, -1, false);
			} else if (!Statics.field8198.method2123() && canvasReplaceRecommended) {
				method15024();
			}
		}
		if (Statics.fsframe == null) {
			method3033();
		}
		if (Fullscreen.allowed && Statics.fsframe != null && !Statics.focus && Statics.method16436(state)) {
			setWindowMode(Statics.field688.maxScreenSize.method18539(), -1, -1, false);
		}
		boolean var3 = false;
		if (fullredraw) {
			fullredraw = false;
			var3 = true;
		}
		if (var3) {
			method8024();
		}
		if (Statics.field8198 != null && Statics.field8198.method2123() || getWindowMode() != 1) {
			method9734();
		}
		if (Statics.method2092(state)) {
			Loading.method2010(var3);
		} else if (method3538(state)) {
			method10376();
		} else if (method13797(state)) {
			method10376();
		} else if (method9273(state)) {
			if (world.method7724() == RebuildStage.field5006) {
				int var4 = world.method7725() / 2;
				MessageBox.method649(LocalisedText.LOADING.method15021(Statics.field1680) + TextUtil.BR + "(" + var4 + "%)", true, Statics.field8198, Statics.field9184, Statics.field2657);
			} else if (world.method7724() == RebuildStage.field5005) {
				int var5 = world.method7726() / 2 + 50;
				MessageBox.method649(LocalisedText.LOADING.method15021(Statics.field1680) + TextUtil.BR + "(" + var5 + "%)", true, Statics.field8198, Statics.field9184, Statics.field2657);
			} else {
				MessageBox.method649(LocalisedText.LOADING.method15021(Statics.field1680), true, Statics.field8198, Statics.field9184, Statics.field2657);
			}
		} else if (state == 18) {
			method18329(var1);
		} else if (state == 14) {
			MessageBox.method649(LocalisedText.CONLOST.method15021(Statics.field1680) + TextUtil.BR + LocalisedText.ATTEMPT_TO_REESTABLISH.method15021(Statics.field1680), false, Statics.field8198, Statics.field9184, Statics.field2657);
		} else if (state == 19) {
			MessageBox.method649(LocalisedText.PLEASEWAIT.method15021(Statics.field1680), false, Statics.field8198, Statics.field9184, Statics.field2657);
		}
		if (field10997 == 3) {
			for (int var6 = 0; var6 < field11051; var6++) {
				Rectangle var7 = field11040[var6];
				if (field10911[var6]) {
					Statics.field8198.method2173(var7.x, var7.y, var7.width, var7.height, -65281);
				} else {
					Statics.field8198.method2173(var7.x, var7.y, var7.width, var7.height, -16711936);
				}
			}
		}
		if (DeveloperConsole.method10211()) {
			DeveloperConsole.method5378(Statics.field8198);
		}
		if (!Statics.method2092(state) && !method9273(state) && field10978 != -1) {
			try {
				Statics.field8198.method2202();
				TwitchHardwarePlatform.method593(Statics.field8198, MonotonicTime.method3655(), Statics.canvasWid, Statics.canvasHei);
				Statics.field8198.method2115();
			} catch (class1106 var10) {
				JagException.method9845(var10.getMessage() + " " + this.method8038(), var10);
				switch(Statics.field688.displayMode2.method18545()) {
					case 3:
						class576.method473(var10.method18925());
						method486(1, false);
						break;
					default:
						method486(0, false);
				}
			}
		}
		int var9 = Statics.field688.cpuUsage.method18735();
		if (var9 == 0) {
			PreciseSleep.sleep(15L);
		} else if (var9 == 1) {
			PreciseSleep.sleep(10L);
		} else if (var9 == 2) {
			PreciseSleep.sleep(5L);
		} else if (var9 == 3) {
			PreciseSleep.sleep(2L);
		}
		if (field10807) {
			method323();
		}
		if (Statics.field688.unknown6.method18740() == 1 && state == 4 && field10978 != -1) {
			Statics.field688.method18157(Statics.field688.unknown6, 0);
			class48.method16391();
		}
	}

	@ObfuscatedName("uy.ey(I)V")
	public static final void method9175() {
		String var0 = Statics.field8327 == null ? method7363() : Statics.field8327;
		Browser.method4607(var0, false, field10784);
	}

	@ObfuscatedName("client.aw(B)V")
	public final void mainquit() {
		if (Statics.field7228 != null && Statics.field7228.field10252) {
			method14147();
		}
		Loading.method8005();
		Statics.method9128();
		if (Statics.field8198 != null) {
			Statics.field8198.method2578();
		}
		if (Fullscreen.allowed && Statics.fsframe != null) {
			Fullscreen.method4277(Statics.fsimp14, Statics.fsframe);
			Statics.fsframe = null;
		}
		field10849.method938();
		field10849.field807.method130();
		field10835.method938();
		field10835.field807.method130();
		if (Statics.field1798 != null) {
			Statics.field1798.method3165();
		}
		Statics.field4489.method7020();
		Statics.field4436.method7063();
		Statics.field4479.method6992();
		if (field10994 != null) {
			field10994.method10572();
			field10994 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable var4) {
		}
		class648.method19265();
		try {
			DeveloperConsole.method8023();
		} catch (Exception var3) {
		}
		if (Statics.field7957 != null) {
			Statics.field7957.method559();
		}
		if (field6603 && Statics.field1811 != ModeWhere.field8277) {
			method9175();
		}
	}

	@ObfuscatedName("client.j(B)Ljava/lang/String;")
	public String method8038() {
		String var1 = " ";
		try {
			CoordGrid var2 = world.method7727();
			var1 = var1 + var2.field7426 + TextUtil.COMMA + var2.field7427 + TextUtil.COMMA + world.method7728() + TextUtil.COMMA + world.method7758() + " ";
			if (Statics.field4490 == null) {
				var1 = var1 + Statics.field4826 + TextUtil.COMMA + Statics.field4826 + TextUtil.COMMA + Statics.field4826 + TextUtil.COMMA + " ";
			} else {
				var1 = var1 + Statics.field4826 + TextUtil.COMMA + (var2.field7426 + Statics.field4490.field10450[0]) + TextUtil.COMMA + (var2.field7427 + Statics.field4490.field10448[0]) + " ";
			}
			var1 = var1 + Statics.field688.displayMode2.method18545() + " " + Statics.field688.unknown1.method18639() + " " + getWindowMode() + " " + Statics.canvasWid + TextUtil.COMMA + Statics.canvasHei + " ";
			var1 = var1 + Statics.field688.lightingDetail.method18389() + " ";
			var1 = var1 + Statics.field688.sceneryShadows.method18515() + " ";
			var1 = var1 + Statics.field688.waterDetail.method18522() + " ";
			var1 = var1 + Statics.field688.textures.method18426() + " ";
			var1 = var1 + Statics.field688.bloom.method18625() + " ";
			var1 = var1 + "0 ";
			var1 = var1 + maxmemory + " ";
			var1 = var1 + state + " ";
			if (Statics.field10581 == null) {
				var1 = var1 + -1;
			} else {
				var1 = var1 + Statics.field10581.cpuInfoRam;
			}
			var1 = var1 + " ";
			if (field10789 == null) {
				var1 = var1 + TextUtil.COMMA;
			} else {
				var1 = var1 + field10789;
			}
		} catch (Throwable var4) {
		}
		return var1;
	}

	@ObfuscatedName("aau.ee(IB)Z")
	public static boolean method14437(int arg0) {
		return arg0 == 15 || arg0 == 16;
	}

	@ObfuscatedName("vb.es(IB)Z")
	public static boolean method9273(int arg0) {
		return arg0 == 10 || arg0 == 6 || arg0 == 3 || arg0 == 16 || arg0 == 8;
	}

	@ObfuscatedName("gy.el(II)Z")
	public static boolean method3538(int arg0) {
		return arg0 == 4 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@ObfuscatedName("yd.ep(II)Z")
	public static boolean method13797(int arg0) {
		return arg0 == 13 || arg0 == 15;
	}

	@ObfuscatedName("eu.ev(II)Z")
	public static boolean isStateGame(int arg0) {
		return arg0 == 18 || arg0 == 3 || arg0 == 9;
	}

	@ObfuscatedName("pg.ec(II)V")
	public static void setState(int arg0) {
		if (state == arg0) {
			return;
		}
		field10915 = 0;
		if (state == 18 && arg0 != 3) {
			TwitchHardwarePlatform.method8632();
		}
		if (arg0 == 14 || arg0 == 19) {
			LoginManager.method5143();
		}
		if (arg0 != 14 && Statics.field11764 != null) {
			Statics.field11764.method9031();
			Statics.field11764 = null;
		}
		if (arg0 == 4) {
			method7227(state == 0 || state == 12 || field10978 != Statics.field11389.field7724);
			ChatHistory.method329();
		}
		if (arg0 == 13) {
			boolean var1;
			if (Statics.field11389.field7726 == -1) {
				var1 = state == 17 || state == 9;
			} else {
				var1 = field10978 != Statics.field11389.field7726;
			}
			method9287(var1);
		}
		if (arg0 == 17 || arg0 == 9) {
			if (!LoginManager.method4407()) {
				return;
			}
		} else if (arg0 == 7 || arg0 == 15 && state != 16) {
			if (!LoginManager.method5143()) {
				return;
			}
		} else if (arg0 == 12) {
			AccountCreationManager.method18476();
		}
		if (method9273(arg0)) {
			world.method7729();
			world.field5060 = -1L;
		}
		if (arg0 == 3 || arg0 == 4) {
			method3095();
		}
		boolean var2 = arg0 == 1 || Statics.method611(arg0) || Statics.method15084(arg0);
		boolean var3 = state == 1 || Statics.method611(state) || Statics.method15084(state);
		if (var2 != var3) {
			Statics.field4489.method7010(!var2);
		}
		if (method9273(arg0) || arg0 == 14 || arg0 == 19) {
			Statics.field8198.method2150();
		}
		state = arg0;
	}

	@ObfuscatedName("client.ek(B)V")
	public void method16917() {
		boolean var1 = Statics.field4489.method7016();
		if (!var1) {
			this.method16918();
		}
	}

	@ObfuscatedName("client.em(B)V")
	public void method16918() {
		if (Statics.field4489.field4455 > field10829) {
			Statics.content.method14758();
			field10821 = Statics.field4489.field4455 * 250 - 250;
			if (field10821 > 3000) {
				field10821 = 3000;
			}
			if (Statics.field4489.field4455 >= 2 && Statics.field4489.field4454 == 6) {
				this.error("js5connect_outofdate");
				state = 2;
				return;
			}
			if (Statics.field4489.field4455 >= 1 && Statics.field4489.field4454 == 48) {
				this.error("sessionexpired");
				state = 2;
				return;
			}
			if (Statics.field4489.field4455 >= 4 && Statics.field4489.field4454 == -1) {
				this.method8071("js5crc", "a=" + Statics.field4489.field4457 + "&g=" + Statics.field4489.field4456);
				state = 2;
				return;
			}
			if (Statics.field4489.field4455 >= 4 && Statics.method2092(state)) {
				if (Statics.field4489.field4454 == 7 || Statics.field4489.field4454 == 9) {
					this.error("js5connect_full");
				} else if (Statics.field4489.field4454 <= 0) {
					this.error("js5io");
				} else if (field11068 == null) {
					this.error("js5connect");
				} else {
					this.error("js5proxy_" + field11068.trim());
				}
				state = 2;
				return;
			}
		}
		field10829 = Statics.field4489.field4455;
		if (field10821 > 0) {
			field10821--;
			return;
		}
		try {
			if (field10827 == 0) {
				Statics.field9774 = Statics.content.method14764();
				field10827++;
			}
			if (field10827 == 1) {
				Statics.field7571 = Stream.method7130(Statics.field9774, 131072);
				int var1 = field10789.length() + 10;
				Packet var2 = new Packet(var1 + 2);
				var2.p1(LoginProt.field3820.field3812);
				var2.p1(var1);
				var2.p4(910);
				var2.p4(1);
				var2.pjstr(field10789);
				var2.p1(Statics.field1680.field8298);
				Statics.field7571.method9030(var2.data, 0, var1 + 2);
				field10827++;
				Statics.field10353 = MonotonicTime.method3655();
			}
			if (field10827 == 2) {
				if (Statics.field7571.method9038(1)) {
					byte[] var3 = new byte[1];
					int var4 = Statics.field7571.method9029(var3, 0, 1);
					if (var3[0] != 0) {
						this.method16986(var4);
						return;
					}
					field10827++;
				} else if (MonotonicTime.method3655() - Statics.field10353 > 30000L) {
					this.method16986(1001);
					return;
				}
			}
			if (field10827 == 3) {
				class775[] var5 = class775.method15007();
				int var6 = var5.length * 4;
				if (Statics.field7571.method9038(var6)) {
					Packet var7 = new Packet(var6);
					Statics.field7571.method9029(var7.data, 0, var7.data.length);
					for (int var8 = 0; var8 < var5.length; var8++) {
						var5[var8].method15009(var7.g4s());
					}
					boolean var9 = Statics.method2092(state) || Statics.method611(state) || Statics.method15084(state);
					Statics.field4489.method7017(Statics.field7571, !var9);
					Statics.field9774 = null;
					Statics.field7571 = null;
					field10827 = 0;
				}
			}
		} catch (IOException var11) {
			this.method16986(1002);
		}
	}

	@ObfuscatedName("client.eh(II)V")
	public void method16986(int arg0) {
		Statics.field9774 = null;
		Statics.field7571 = null;
		field10827 = 0;
		Statics.field4489.field4455++;
		Statics.field4489.field4454 = arg0;
	}

	@ObfuscatedName("qe.eq(ZI)V")
	public static void method7227(boolean arg0) {
		if (arg0) {
			if (field10978 != -1) {
				Component.method7602(field10978);
			}
			for (SubInterface var1 = (SubInterface) field10979.method14500(); var1 != null; var1 = (SubInterface) field10979.method14502()) {
				if (!var1.method8441()) {
					var1 = (SubInterface) field10979.method14500();
					if (var1 == null) {
						break;
					}
				}
				method214(var1, true, false);
			}
			field10978 = -1;
			field10979 = new IterableMap(8);
			Component.method5075();
			field10978 = Statics.field11389.field7724;
			if (field10978 != -1) {
				method9585(false);
				method9734();
				ScriptRunner.method15086(field10978, null);
			}
		}
		LoginManager.method10450();
		Statics.field9155.method4680(true);
		LoginManager.field485 = false;
		MiniMenu.method8326();
		field10970 = -1;
		method10615(field11038);
		Statics.field4490 = new PlayerEntity(null);
		field10946.clear();
		Statics.field4490.method10538((float) (world.method7728() * 512 / 2), 0.0F, (float) (world.method7758() * 512 / 2));
		Statics.field4490.field10450[0] = world.method7728() / 2;
		Statics.field4490.field10448[0] = world.method7758() / 2;
		Statics.field1881 = 0;
		Statics.field7956 = 0;
		if (Statics.field3416 == 5) {
			Statics.field7956 = Statics.field8550 << 9;
			Statics.field1881 = Statics.field8492 << 9;
		} else {
			method9611();
		}
		world.method7816().method10019();
	}

	@ObfuscatedName("vl.eg(ZI)V")
	public static void method9287(boolean arg0) {
		if (arg0) {
			if (field10978 != -1) {
				Component.method7602(field10978);
			}
			for (SubInterface var1 = (SubInterface) field10979.method14500(); var1 != null; var1 = (SubInterface) field10979.method14502()) {
				if (!var1.method8441()) {
					var1 = (SubInterface) field10979.method14500();
					if (var1 == null) {
						break;
					}
				}
				method214(var1, true, false);
			}
			field10978 = -1;
			field10979 = new IterableMap(8);
			Component.method5075();
			field10978 = Statics.field11389.field7726;
			if (field10978 != -1) {
				method9585(false);
				method9734();
				ScriptRunner.method15086(field10978, null);
			}
		}
		LoginManager.field485 = true;
	}

	@ObfuscatedName("ko.ez(Labd;ZIZZI)Lpy;")
	public static Js5 method5156(Js5Archive arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
		if (Statics.field6888 == null) {
			Statics.field6888 = new Js5NetResourceProvider[Js5Archive.getRequiredArrayLength()];
			Statics.field8540 = new HashMap();
		}
		DiskStore var5 = null;
		int var6 = arg0.getArchiveId();
		if (cacheDat != null && !Statics.field7880) {
			var5 = new DiskStore(var6, cacheDat, Statics.cacheIndex[var6], var6 == Js5Archive.DLLS.getArchiveId() ? 8000000 : 2500000);
		}
		Statics.field6888[var6] = Statics.field1833.method6835(var6, var5, Statics.field1749, arg0.method14918());
		if (arg4) {
			Statics.field6888[var6].method16829();
		}
		Js5 var7 = new Js5(Statics.field6888[var6], arg1, arg2);
		Statics.field8540.put(arg0, var7);
		return var7;
	}

	@ObfuscatedName("i.ef(I)Lax;")
	public static ServerConnection method640() {
		return Statics.method15084(state) || state == 0 ? field10835 : field10849;
	}

	@ObfuscatedName("s.et(IZI)V")
	public static void method486(int arg0, boolean arg1) {
		Statics.method14060(arg0, LocalisedText.LOADING.method15021(Statics.field1680), arg1);
	}

	@ObfuscatedName("gm.ew(ILjava/lang/String;ZI)V")
	public static void method3596(int arg0, String arg1, boolean arg2) {
		if (arg0 == 0) {
			Statics.field8198 = Renderer.method14575(0, Statics.canvas, Statics.field7366, Statics.field7669, Statics.field9211, Statics.field7282, Statics.field2013, Statics.field2900, Statics.field688.unknown2.method18639() * 2);
			if (arg1 != null) {
				Statics.field8198.method2475(1, 0);
				FontMetrics var3 = FontMetrics.method6068(Statics.field7672, Statics.field505, 0, Statics.field7538);
				class140 var4 = Statics.field8198.method2207(var3, SpriteDataProvider.method1609(Statics.field10317, Statics.field505, 0), true);
				method8024();
				MessageBox.method649(arg1, true, Statics.field8198, var4, var3);
			}
		} else {
			label245: {
				Renderer var5 = null;
				if (arg1 != null) {
					var5 = Renderer.method14575(0, Statics.canvas, Statics.field7366, Statics.field7669, Statics.field9211, Statics.field7282, Statics.field2013, Statics.field2900, 0);
					var5.method2475(1, 0);
					FontMetrics var6 = FontMetrics.method1593(Statics.field7672, Statics.field505, 0);
					class140 var7 = var5.method2207(var6, SpriteDataProvider.method1609(Statics.field10317, Statics.field505, 0), true);
					method8024();
					MessageBox.method649(arg1, true, var5, var7, var6);
					try {
						var5.method2578();
						var5 = null;
					} catch (Throwable var30) {
					}
				}
				try {
					try {
						method7239();
						System.gc();
						Statics.field8198 = Renderer.method14575(arg0, Statics.canvas, Statics.field7366, Statics.field7669, Statics.field9211, Statics.field7282, Statics.field2013, Statics.field2900, Statics.field688.unknown2.method18639() * 2);
						Statics.field7538 = new class402(Statics.field8198, Statics.field10317, Statics.field7672, DefaultSprites.method845());
						if (Statics.field8198.method2194()) {
							boolean var9 = true;
							try {
								var9 = Statics.field10581.cpuInfoRam > 256;
							} catch (Throwable var29) {
							}
							class972 var11;
							if (var9) {
								var11 = Statics.field8198.method2221(146800640);
							} else {
								var11 = Statics.field8198.method2221(104857600);
							}
							Statics.field8198.method2195(var11);
						}
						break label245;
					} catch (Throwable var31) {
						switch(arg0) {
							case 1:
								class576.method6971(ToolkitType.field8883);
								break;
							case 3:
								class576.method6971(ToolkitType.field8876);
								break;
						}
						if (var31 instanceof class1208) {
							Statics.field688.unknown1.method14072(0);
							Statics.field688.unknown2.method14072(0);
						}
						int var14 = Statics.field688.displayMode2.method18545();
						Statics.field688.method18157(Statics.field688.displayMode2, 0);
						if (var5 != null) {
							try {
								var5.method2578();
								var5 = null;
							} catch (Throwable var28) {
							}
						}
						method7239();
						System.gc();
						method3596(var14, arg1, arg2);
					}
				} finally {
					if (var5 != null) {
						try {
							var5.method2578();
						} catch (Throwable var27) {
						}
					}
				}
				return;
			}
		}
		if (arg2) {
			Statics.field688.method18177(Statics.field688.displayMode2, !arg2);
		}
		Statics.field688.method18157(Statics.field688.displayMode2, arg0);
		if (!arg2) {
			Statics.field688.method18177(Statics.field688.displayMode2, !arg2);
		}
		class35.method17658();
		Statics.field8198.method2532(20000);
		Statics.field8198.method2224(32);
		world.method7820();
		if (Statics.field8198.method2266()) {
			method9756(Statics.field688.bloom.method18625() == 1);
		}
		world.method7737(true);
		world.method7816().method10019();
		class42.method829();
		field10800 = false;
		field10801 = false;
		field10836 = true;
		Statics.field8871 = null;
		Statics.field8198.method2339(0.0F, 1.0F);
	}

	@ObfuscatedName("acs.er(Lpq;ZFFFFIII)V")
	public static void method15141(Matrix4x4 arg0, boolean arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
		int var8 = world.method7734();
		int var9 = world.method7760();
		arg0.method6703(arg2, arg3, arg4, arg5, (float) var9, (float) var8, (float) arg6, (float) arg7);
	}

	@ObfuscatedName("qj.en(I)V")
	public static void method7239() {
		if (Statics.field8198 == null) {
			return;
		}
		world.method7747();
		class42.method5065();
		MiniMenu.method5147();
		Statics.method15000();
		TwitchHardwarePlatform.method2739();
		world.method7737(true);
		class502.method7713();
		class42.method829();
		Statics.method14055(false);
		DefaultSprites.method3568();
		class1004.method18566();
		Loading.method18929();
		for (int var0 = 0; var0 < field10931.length; var0++) {
			if (field10931[var0] != null) {
				field10931[var0].field6754 = null;
			}
		}
		for (int var1 = 0; var1 < 2048; var1++) {
			PlayerEntity var2 = field10944[var1];
			if (var2 != null) {
				for (int var3 = 0; var3 < var2.field10459.length; var3++) {
					var2.field10459[var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field10906; var4++) {
			NpcEntity var5 = (NpcEntity) field10839[var4].field11436;
			if (var5 != null) {
				for (int var6 = 0; var6 < var5.field10459.length; var6++) {
					var5.field10459[var6] = null;
				}
			}
		}
		field10966.method14499();
		Statics.field8198.method2578();
		Statics.field8198 = null;
	}

	@ObfuscatedName("adk.eb(I)V")
	public static void method15235() {
		Statics.field11931.method9071();
		Statics.field9182.method9120();
		Statics.field8301.addcanvas();
		Statics.canvas.setBackground(Color.black);
		field10972 = -1;
		Statics.field11931 = Keyboard.method15006(Statics.canvas);
		Statics.field9182 = Mouse.method6806(Statics.canvas, true);
	}

	@ObfuscatedName("acz.ex(B)V")
	public static void method15024() {
		if (Statics.field8198.method2240()) {
			Statics.field8198.method2192(Statics.canvas);
			method15235();
			Dimension var0 = Statics.canvas.getSize();
			Statics.field8198.method2178(Statics.canvas, var0.width, var0.height);
			Statics.field8198.method2140(Statics.canvas);
		} else {
			method486(Statics.field688.displayMode2.method18545(), false);
		}
		method9734();
	}

	@ObfuscatedName("adc.fg(III)I")
	public static int method15172(int arg0, int arg1) {
		if (Statics.field11389.field7738 == -1) {
			return 1;
		}
		if (arg0 != Statics.field688.displayMode2.method18545()) {
			Statics.method14060(arg0, LocalisedText.PROFILING.method15021(Statics.field1680), true);
			if (Statics.field688.displayMode2.method18545() != arg0) {
				return -1;
			}
		}
		try {
			Dimension var2 = Statics.canvas.getSize();
			MessageBox.method649(LocalisedText.PROFILING.method15021(Statics.field1680), true, Statics.field8198, Statics.field9184, Statics.field2657);
			ModelUnlit var3 = ModelUnlit.method1931(Statics.field9213, Statics.field11389.field7738, 0);
			long var4 = MonotonicTime.method3655();
			Statics.field8198.method2167();
			field10793.method6313(0.0F, 256.0F, 0.0F);
			Statics.field8198.method2217(field10793);
			Matrix4x4 var6 = Statics.field8198.method2208();
			var6.method6703((float) (var2.width / 2), (float) (var2.height / 2), 512.0F, 512.0F, (float) world.method7760(), (float) world.method7734(), (float) var2.width, (float) var2.height);
			Statics.field8198.method2220(var6);
			Statics.field8198.method2222(1.0F);
			Statics.field8198.method2223(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			Model var7 = Statics.field8198.method2211(var3, 2048, 64, 64, 768);
			int var8 = 0;
			label42: for (int var9 = 0; var9 < 500; var9++) {
				Statics.field8198.method2475(3, 0);
				for (int var10 = 15; var10 >= 0; var10--) {
					for (int var11 = 0; var11 <= var10; var11++) {
						field10875.method6313((float) (((float) var11 - (float) var10 / 2.0F) * 512.0F), 0.0F, (float) ((var10 + 1) * 512));
						var7.method1813(field10875, null, 0);
						var8++;
						if (MonotonicTime.method3655() - var4 >= (long) arg1) {
							break label42;
						}
					}
				}
			}
			Statics.field8198.method2117();
			long var12 = (long) (var8 * 1000) / (MonotonicTime.method3655() - var4);
			Statics.field8198.method2475(3, 0);
			return (int) var12;
		} catch (Throwable var15) {
			var15.printStackTrace();
			return -1;
		}
	}

	@ObfuscatedName("ez.fm(I)I")
	public static int getWindowMode() {
		if (Fullscreen.allowed && Statics.fsframe != null) {
			return 3;
		} else if (field10960) {
			return 2;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("zt.fu(IIIZB)V")
	public static void setWindowMode(int arg0, int arg1, int arg2, boolean arg3) {
		field10937 = 0L;
		int var4 = getWindowMode();
		if (arg0 == 3 || var4 == 3) {
			arg3 = true;
		}
		if (!Statics.field8198.method2124()) {
			arg3 = true;
		}
		method13784(var4, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ym.fs(IIIIZB)V")
	public static void method13784(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (Fullscreen.allowed && Statics.fsframe != null && (arg1 != 3 || Statics.field8186 != arg2 || Statics.field9256 != arg3)) {
			Fullscreen.method4277(Statics.fsimp14, Statics.fsframe);
			Statics.fsframe = null;
		}
		if (Fullscreen.allowed && arg1 == 3 && Statics.fsframe == null) {
			Statics.fsframe = Fullscreen.method4572(Statics.fsimp14, arg2, arg3, 0, 0);
			if (Statics.fsframe != null) {
				Statics.field8186 = arg2;
				Statics.field9256 = arg3;
				class48.method16391();
			}
		}
		if (arg1 == 3 && (!Fullscreen.allowed || Statics.fsframe == null)) {
			method13784(arg0, Statics.field688.maxScreenSize.method18539(), -1, -1, true);
			return;
		}
		Container var5 = GameShell.method7321();
		if (Statics.fsframe != null) {
			Statics.frameWid = arg2;
			Statics.frameHei = arg3;
		} else if (Statics.frame == null) {
			Statics.frameWid = var5.getSize().width;
			Statics.frameHei = var5.getSize().height;
		} else {
			Insets var6 = Statics.frame.getInsets();
			int var10001 = var6.right + var6.left;
			Statics.frameWid = Statics.frame.getSize().width - var10001;
			int var9 = var6.top + var6.bottom;
			Statics.frameHei = Statics.frame.getSize().height - var9;
		}
		if (Statics.frameWid <= 0) {
			Statics.frameWid = 1;
		}
		if (Statics.frameHei <= 0) {
			Statics.frameHei = 1;
		}
		if (arg1 == 1) {
			Statics.canvasWid = field10941;
			leftMargin = (Statics.frameWid - field10941) / 2;
			Statics.canvasHei = field10942;
			topMargin = 0;
		} else {
			method7263();
		}
		if (Statics.field1811 != ModeWhere.field8273 && Statics.canvasWid < 1024 && Statics.canvasHei < 768) {
		}
		if (arg4) {
			method15024();
		} else {
			Statics.canvas.setSize(Statics.canvasWid, Statics.canvasHei);
			Statics.field8198.method2216(Statics.canvas, Statics.canvasWid, Statics.canvasHei);
			if (Statics.frame == var5) {
				Insets var7 = Statics.frame.getInsets();
				Statics.canvas.setLocation(leftMargin + var7.left, topMargin + var7.top);
			} else {
				Statics.canvas.setLocation(leftMargin, topMargin);
			}
		}
		if (arg1 >= 2) {
			field10960 = true;
		} else {
			field10960 = false;
		}
		method1018();
		if (field10978 != -1) {
			method9585(true);
		}
		if (method640().method939() != null && (isStateGame(state) || Statics.method15084(state))) {
			method4336(method640());
		}
		for (int var8 = 0; var8 < 114; var8++) {
			field11072[var8] = true;
		}
		fullredraw = true;
	}

	@ObfuscatedName("ij.fz(Lax;B)V")
	public static void method4336(ServerConnection arg0) {
		ClientMessage var1 = Statics.method1604(ClientProt.WINDOW_STATUS, arg0.field794);
		var1.field11432.p1(getWindowMode());
		var1.field11432.p2(Statics.canvasWid);
		var1.field11432.p2(Statics.canvasHei);
		var1.field11432.p1(Statics.field688.unknown2.method18639());
		arg0.method934(var1);
	}

	@ObfuscatedName("fs.fj(B)V")
	public static void method3033() {
		Container var0 = GameShell.method7321();
		int var1 = var0.getSize().width;
		int var2 = var0.getSize().height;
		if (Statics.frame == var0) {
			Insets var3 = Statics.frame.getInsets();
			var1 -= var3.right + var3.left;
			var2 -= var3.top + var3.bottom;
		}
		if (Statics.frameWid == var1 && Statics.frameHei == var2 && !field10836) {
			return;
		}
		if (Statics.field8198 == null || Statics.field8198.method2124()) {
			method6793();
		} else {
			Statics.frameWid = var1;
			Statics.frameHei = var2;
		}
		field10937 = MonotonicTime.method3655() + 500L;
		field10836 = false;
	}

	@ObfuscatedName("pw.fd(B)V")
	public static void method6793() {
		client var0 = Statics.field8301;
		synchronized (Statics.field8301) {
			if (Statics.fsframe == null) {
				Container var1 = GameShell.method7321();
				if (var1 != null) {
					Statics.frameWid = var1.getSize().width;
					Statics.frameHei = var1.getSize().height;
					if (Statics.frame == var1) {
						Insets var2 = Statics.frame.getInsets();
						Statics.frameWid -= var2.right + var2.left;
						Statics.frameHei -= var2.top + var2.bottom;
					}
					if (Statics.frameWid <= 0) {
						Statics.frameWid = 1;
					}
					if (Statics.frameHei <= 0) {
						Statics.frameHei = 1;
					}
					if (getWindowMode() == 1) {
						Statics.canvasWid = field10941;
						leftMargin = (Statics.frameWid - field10941) / 2;
						Statics.canvasHei = field10942;
						topMargin = 0;
					} else {
						method7263();
					}
					if (Statics.field1811 != ModeWhere.field8273 && Statics.canvasWid < 1024 && Statics.canvasHei < 768) {
					}
					Statics.canvas.setSize(Statics.canvasWid, Statics.canvasHei);
					if (Statics.field8198 != null) {
						Statics.field8198.method2216(Statics.canvas, Statics.canvasWid, Statics.canvasHei);
						TwitchHardwarePlatform.method7259(Statics.field8198, MonotonicTime.method3655());
					}
					if (Statics.frame == var1) {
						Insets var3 = Statics.frame.getInsets();
						Statics.canvas.setLocation(leftMargin + var3.left, topMargin + var3.top);
					} else {
						Statics.canvas.setLocation(leftMargin, topMargin);
					}
					method1018();
					if (field10978 != -1) {
						method9585(true);
					}
					method8024();
				}
			}
		}
	}

	@ObfuscatedName("bf.fn(I)V")
	public static void method1018() {
		int var0 = Statics.canvasWid;
		int var1 = Statics.canvasHei;
		if (Statics.frameWid < var0) {
			var0 = Statics.frameWid;
		}
		if (Statics.frameHei < var1) {
			var1 = Statics.frameHei;
		}
		try {
			if (Statics.field688 != null) {
				JavascriptFunction.field4027.method6089(new Object[] { var0, var1, getWindowMode(), Statics.field688.screenSize.method18581() });
			}
		} catch (Throwable var3) {
		}
	}

	@ObfuscatedName("qd.fi(I)V")
	public static void method7263() {
		int var0 = 0;
		if (Statics.field688 != null) {
			var0 = Statics.field688.screenSize.method18581();
		}
		if (var0 == 2) {
			int var1 = Statics.frameWid > 800 ? 800 : Statics.frameWid;
			int var2 = Statics.frameHei > 600 ? 600 : Statics.frameHei;
			Statics.canvasWid = var1;
			leftMargin = (Statics.frameWid - var1) / 2;
			Statics.canvasHei = var2;
			topMargin = 0;
		} else if (var0 == 1) {
			int var3 = Statics.frameWid > 1024 ? 1024 : Statics.frameWid;
			int var4 = Statics.frameHei > 768 ? 768 : Statics.frameHei;
			Statics.canvasWid = var3;
			leftMargin = (Statics.frameWid - var3) / 2;
			Statics.canvasHei = var4;
			topMargin = 0;
		} else {
			Statics.canvasWid = Statics.frameWid;
			leftMargin = 0;
			Statics.canvasHei = Statics.frameHei;
			topMargin = 0;
		}
	}

	@ObfuscatedName("sm.ft(I)V")
	public static void method8024() {
		if (Statics.fsframe != null) {
			return;
		}
		int var0 = leftMargin;
		int var1 = topMargin;
		int var2 = Statics.frameWid - Statics.canvasWid - var0;
		int var3 = Statics.frameHei - Statics.canvasHei - var1;
		if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
			return;
		}
		try {
			Container var4 = GameShell.method7321();
			int var5 = 0;
			int var6 = 0;
			if (Statics.frame == var4) {
				Insets var7 = Statics.frame.getInsets();
				var5 = var7.left;
				var6 = var7.top;
			}
			Graphics var8 = var4.getGraphics();
			var8.setColor(Color.black);
			if (var0 > 0) {
				var8.fillRect(var5, var6, var0, Statics.frameHei);
			}
			if (var1 > 0) {
				var8.fillRect(var5, var6, Statics.frameWid, var1);
			}
			if (var2 > 0) {
				var8.fillRect(Statics.frameWid + var5 - var2, var6, var2, Statics.frameHei);
			}
			if (var3 > 0) {
				var8.fillRect(var5, Statics.frameHei + var6 - var3, Statics.frameWid, var3);
			}
		} catch (Exception var10) {
		}
	}

	@ObfuscatedName("wg.fx(ZI)Z")
	public static boolean method9756(boolean arg0) {
		boolean var1 = Statics.field8198.method2242();
		if (arg0 == var1) {
			return true;
		}
		if (!arg0) {
			Statics.field8198.method2273();
		} else if (!Statics.field8198.method2274()) {
			arg0 = false;
		}
		if (arg0 == var1) {
			return false;
		} else {
			Statics.field688.method18157(Statics.field688.bloom, arg0 ? 1 : 0);
			class48.method16391();
			return true;
		}
	}

	@ObfuscatedName("yx.fv(II)V")
	public static void method10615(int arg0) {
		if (Statics.field688.customCursors.method18771() == 0) {
			arg0 = -1;
		}
		if (field10972 == arg0) {
			return;
		}
		if (arg0 != -1) {
			CursorType var1 = (CursorType) Statics.field2427.get(arg0);
			SpriteData var2 = var1.method10302();
			if (var2 == null) {
				arg0 = -1;
			} else {
				Statics.mouseImp.setcustomcursor(Statics.canvas, var2.method2604(true), var2.method2596(), var2.method2597(), new Point(var1.field7964, var1.field7965));
				field10972 = arg0;
			}
		}
		if (arg0 == -1 && field10972 != -1) {
			Statics.mouseImp.setcustomcursor(Statics.canvas, null, -1, -1, new Point());
			field10972 = -1;
		}
	}

	@ObfuscatedName("vd.fc(I)V")
	public static void method9516() {
		int var0 = 0;
		if (Statics.field688.lightingDetail.method18389() == 1) {
			int var1 = var0 | 0x1;
			int var2 = var1 | 0x10;
			int var3 = var2 | 0x20;
			int var4 = var3 | 0x2;
			var0 = var4 | 0x4;
		}
		if (Statics.field688.textures.method18426() == 0) {
			var0 |= 0x40;
		}
		Component.method14950(var0);
		world.method7750().method18891(var0);
		Statics.field3183.method7677().method7750().method18891(var0);
		Statics.field1842.method18902(var0);
		Statics.field7961.method18877(var0);
		Statics.field4874.method18896(var0);
		HintArrow.method8643(var0);
		class529.method7309(var0);
		class31.method17441(var0);
		PlayerModel.method2837(var0);
		ClientInvCache.method5150(var0);
		world.method7753();
	}

	@ObfuscatedName("gd.fw(I)V")
	public static final void method3652() {
		field10862 = -1;
		field10863 = 3;
		Statics.field8729 = null;
		class153.method3551();
	}

	@ObfuscatedName("wd.fa(I)V")
	public static final void method9872() {
		method3652();
		world.method7746();
		for (int var0 = 0; var0 < field10851.length; var0++) {
			field10851[var0] = null;
		}
		for (int var1 = 0; var1 < field10931.length; var1++) {
			field10931[var1] = null;
		}
		ReceivePlayerPositions.method17516();
		for (int var2 = 0; var2 < 2048; var2++) {
			field10944[var2] = null;
		}
		field11011 = 0;
		field10838.method14499();
		field10906 = 0;
		field10964.method14499();
		method4046(method14298());
		field10842 = 0;
		Statics.field7410.field632.method9624();
		Statics.field6867 = null;
		Statics.field1890 = null;
		Statics.field1766 = null;
		Statics.field3022 = null;
		Statics.field6721 = null;
		field11095 = true;
		Statics.field594 = null;
		Statics.field3457 = 0L;
		MiniMenu.method6031();
		MiniMenu.method3074();
	}

	@ObfuscatedName("wo.fp(ZS)V")
	public static final void logout(boolean arg0) {
		ServerConnection[] var1 = field10850;
		for (int var2 = 0; var2 < var1.length; var2++) {
			ServerConnection var3 = var1[var2];
			try {
				var3.method933();
			} catch (IOException var7) {
			}
			var3.method938();
		}
		LoginManager.method9067();
		method14454();
		Statics.method14055(false);
		world.method7747();
		world.method7746();
		world.method7730();
		class1004.method14689();
		class29.method3913();
		class975.method13908(true);
		class1004.method6003();
		method9872();
		field10945 = -1;
		if (arg0) {
			setState(9);
			return;
		}
		setState(4);
		try {
			BrowserControl.call(Statics.field11885, "loggedout");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("r.fq(I)V")
	public static final void method323() {
		Statics.field8168.method14896(5);
		Statics.field8145.method14896(5);
		Statics.field2628.method14896(5);
		world.method7750().method14896(5);
		Statics.field7961.method14896(5);
		Statics.field1842.method14896(5);
		Statics.field8797.method14896(5);
		Statics.field4874.method14896(5);
		Statics.field8736.method14896(5);
		Statics.field8485.method15259(5);
		Statics.field8135.method15274(5);
		Statics.field8783.method15274(5);
		Statics.field12225.method15274(5);
		Statics.field3415.method15274(5);
		Statics.field1819.method15274(5);
		Statics.field11742.method14896(5);
		Statics.field5011.method14896(5);
		Statics.field4241.method14896(5);
		Statics.field3086.method14896(5);
		Statics.field2879.method14896(5);
		Statics.field687.method14896(5);
		Statics.field7943.method14896(5);
		Statics.field2427.method14896(5);
		Statics.field2936.method14896(5);
		Statics.field4894.method14896(5);
		Statics.method9976(5);
		Component.method8274(50);
		Statics.field7538.method6166(50);
		HintArrow.method10284(5);
		class31.method9467(5);
		field10830.method2923(5);
		field10894.method2923(5);
		ScriptRunner.field8204.method2923(5);
		field11013.method2923(5);
		Statics.field9123.method14896(5);
		Statics.field1840.method14896(5);
		field10834.method2923(5);
	}

	@ObfuscatedName("yj.ff(B)V")
	public static final void method10444() {
		Statics.field8168.method14899();
		Statics.field8145.method14899();
		Statics.field2628.method14899();
		world.method7750().method14899();
		Statics.field7961.method14899();
		Statics.field1842.method14899();
		Statics.field8797.method14899();
		Statics.field4874.method14899();
		Statics.field8736.method14899();
		Statics.field8485.method15257();
		Statics.field8135.method15268();
		Statics.field8783.method15268();
		Statics.field12225.method15268();
		Statics.field3415.method15268();
		Statics.field1819.method15268();
		Statics.field11742.method14899();
		Statics.field4241.method14899();
		Statics.field5011.method14899();
		Statics.field3086.method14899();
		Statics.field2879.method14899();
		Statics.field687.method14899();
		Statics.field7943.method14899();
		Statics.field2427.method14899();
		Statics.field2936.method14899();
		Statics.field4894.method14899();
		PlayerModel.method8366();
		Component.method5204();
		Statics.field7538.method6167();
		HintArrow.method16718();
		class31.method5201();
		field10830.method2928();
		field10894.method2928();
		ScriptRunner.field8204.method2928();
		field11013.method2928();
		Statics.field9123.method14899();
		Statics.field1840.method14899();
		field10834.method2928();
	}

	@ObfuscatedName("sz.fb(I)V")
	public static final void method8321() {
		if (Statics.method15084(state) || Statics.method611(state)) {
			field10853 = LogoutReason.field9135;
			logout(false);
		} else {
			field10853 = LogoutReason.field9141;
			Statics.field11764 = field10849.method939();
			field10849.method941();
			setState(14);
		}
	}

	@ObfuscatedName("aax.fo(I)V")
	public static void method14147() {
		FileOnDisk var0 = GameShell.openPrefs("2", field10768.field8333, true);
		Statics.field7228.method16418(var0);
	}

	@ObfuscatedName("client.fy(I)V")
	public final void method16920() {
		if (state == 13 && !LoginManager.method2865() || state == 15 && LoginManager.field477 == 42 || state == 17 && (LoginManager.field476 == 49 || LoginManager.field476 == 52) || state == 0) {
			if (field10831 > 1) {
				field10831--;
				field11027 = field11058;
			}
			if (!MiniMenu.field562) {
				MiniMenu.method3074();
			}
			if (state != 17 || LoginManager.field476 != 49 && LoginManager.field476 != 52) {
				for (int var1 = 0; var1 < 100 && method2765(field10835); var1++) {
				}
			}
		}
		method9926();
		Statics.method9835();
		field10891++;
		MiniMenu.method6967(-1, -1);
		MiniMenu.method18919(null, -1, -1);
		method5013();
		field11058++;
		for (int var2 = 0; var2 < field10906; var2++) {
			NpcEntity var3 = (NpcEntity) field10839[var2].field11436;
			if (var3 != null) {
				byte var4 = var3.field12083.field2743;
				if ((var4 & 0x1) != 0) {
					int var5 = var3.method16546();
					if ((var4 & 0x2) != 0 && var3.field10400 == 0 && Math.random() * 1000.0D < 10.0D) {
						int var6 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (var6 != 0 || var7 != 0) {
							int var8 = var3.field10450[0] + var6;
							int var9 = var3.field10448[0] + var7;
							if (var8 < 0) {
								boolean var10 = false;
							} else if (var8 > world.method7728() - var5 - 1) {
								int var11 = world.method7728() - var5 - 1;
							}
							if (var9 < 0) {
								boolean var12 = false;
							} else if (var9 > world.method7758() - var5 - 1) {
								int var13 = world.method7758() - var5 - 1;
							}
						}
					}
					method15071(var3, true);
					int var14 = method14063(var3);
					method10222(var3);
					method7326(var3, Statics.field1891, Statics.field1797, var14);
					method8354(var3, Statics.field1891);
					method14988(var3);
					class421 var15 = class421.method6469();
					var15.method6415(Trig1.method6277(var3.field10395.method316()), Trig1.method6277(var3.field10413.method316()), Trig1.method6277(var3.field10447.method316()));
					var3.method10556(var15);
					var15.method6407();
				}
			}
		}
		if ((state == 4 || state == 15 || state == 13 || state == 0) && (!LoginManager.method2865() || state == 15 && LoginManager.field477 == 42 || state == 17 && (LoginManager.field476 == 49 || LoginManager.field476 == 52)) && !AccountCreationManager.method9610()) {
			if (Statics.field3416 == 5) {
				method18478();
			} else {
				method9611();
			}
			if (Statics.field7956 >> 9 < 14 || Statics.field7956 >> 9 >= world.method7728() - 14 || Statics.field1881 >> 9 < 14 || Statics.field1881 >> 9 >= world.method7758() - 14) {
				world.method7749(new RebuildRequest(RebuildType.field5063, null));
			}
		}
		while (true) {
			HookRequest var16;
			Component var17;
			Component var18;
			do {
				var16 = (HookRequest) field11032.method14154();
				if (var16 == null) {
					while (true) {
						HookRequest var19;
						Component var20;
						Component var21;
						do {
							var19 = (HookRequest) field11033.method14154();
							if (var19 == null) {
								while (true) {
									HookRequest var22;
									Component var23;
									Component var24;
									do {
										var22 = (HookRequest) field11031.method14154();
										if (var22 == null) {
											if (field10989 != null) {
												method6847();
											}
											if (field10903 % 15000 == 0) {
												method3095();
											}
											if (state == 13 && !LoginManager.method2865() || state == 15 && LoginManager.field477 == 42 || state == 17 && (LoginManager.field476 == 49 || LoginManager.field476 == 52) || state == 0) {
												MiniMenu.method9026();
											}
											class750.method2778();
											if (field11082 && state == 13) {
												method15198();
												field11082 = false;
											}
											if (Statics.field7228.field10252 && Statics.field7228.field10253 < MonotonicTime.method3655() - 60000L) {
												method14147();
											}
											for (class957 var25 = (class957) field10910.method14254(); var25 != null; var25 = (class957) field10910.method14241()) {
												if ((long) var25.field11211 < MonotonicTime.method3655() / 1000L - 5L) {
													if (var25.field11209 > 0) {
														ChatHistory.method2664(5, 0, "", "", "", var25.field11210 + LocalisedText.FRIENDLOGIN.method15021(Statics.field1680), null);
													}
													if (var25.field11209 == 0) {
														ChatHistory.method2664(5, 0, "", "", "", var25.field11210 + LocalisedText.FRIENDLOGOUT.method15021(Statics.field1680), null);
													}
													var25.method8433();
												}
											}
											if (state == 13 && !LoginManager.method2865() || state == 15 && LoginManager.field477 == 42 || state == 17 && (LoginManager.field476 == 49 || LoginManager.field476 == 52) || state == 0) {
												if (state != 15 && field10835.method939() == null) {
													field10853 = LogoutReason.field9135;
													logout(false);
													return;
												}
												if (field10835 != null) {
													field10835.field793++;
													if (field10835.field793 > 50) {
														ClientMessage var26 = Statics.method1604(ClientProt.NO_TIMEOUT, field10835.field794);
														field10835.method934(var26);
													}
													try {
														field10835.method933();
													} catch (IOException var28) {
														if (state == 15) {
															field10835.method938();
														} else {
															logout(false);
														}
													}
												}
											}
											return;
										}
										var23 = var22.field11491;
										if (var23.field2183 < 0) {
											break;
										}
										var24 = Component.method10202(var23.field2200);
									} while (var24 == null || var24.field2351 == null || var23.field2183 >= var24.field2351.length || var24.field2351[var23.field2183] != var23);
									ScriptRunner.method1428(var22);
								}
							}
							var20 = var19.field11491;
							if (var20.field2183 < 0) {
								break;
							}
							var21 = Component.method10202(var20.field2200);
						} while (var21 == null || var21.field2351 == null || var20.field2183 >= var21.field2351.length || var21.field2351[var20.field2183] != var20);
						ScriptRunner.method1428(var19);
					}
				}
				var17 = var16.field11491;
				if (var17.field2183 < 0) {
					break;
				}
				var18 = Component.method10202(var17.field2200);
			} while (var18 == null || var18.field2351 == null || var17.field2183 >= var18.field2351.length || var18.field2351[var17.field2183] != var17);
			ScriptRunner.method1428(var16);
		}
	}

	@ObfuscatedName("fm.fe(I)V")
	public static final void method3006() {
		if (field10831 > 1) {
			field10831--;
			field11027 = field11058;
		}
		if (field10849.field808) {
			field10849.field808 = false;
			method8321();
			return;
		}
		if (!MiniMenu.field562) {
			MiniMenu.method3074();
		}
		for (int var0 = 0; var0 < 100 && method2765(field10849); var0++) {
		}
		if (state != 18) {
			return;
		}
		while (class780.method14703()) {
			ClientMessage var1 = Statics.method1604(ClientProt.REFLECTION_CHECK_REPLY, field10849.field794);
			var1.field11432.p1(0);
			int var2 = var1.field11432.pos;
			class780.method4651(var1.field11432);
			var1.field11432.psize1(var1.field11432.pos - var2);
			field10849.method934(var1);
		}
		if (Statics.field594 == null) {
			if (MonotonicTime.method3655() >= Statics.field3457) {
				Statics.field594 = field10994.method10589(Statics.field8755.host);
			}
		} else if (Statics.field594.field8180 != -1) {
			ClientMessage var3 = Statics.method1604(ClientProt.PING_STATISTICS, field10849.field794);
			if (Statics.field11399 == null || !Statics.field11399.isValid()) {
				try {
					Iterator var4 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (var4.hasNext()) {
						GarbageCollectorMXBean var5 = (GarbageCollectorMXBean) var4.next();
						if (var5.isValid()) {
							Statics.field11399 = var5;
							field11091 = -1L;
							field11090 = -1L;
						}
					}
				} catch (Throwable var48) {
				}
			}
			long var7 = MonotonicTime.method3655();
			int var9 = -1;
			if (Statics.field11399 != null) {
				long var10 = Statics.field11399.getCollectionTime();
				if (field11090 != -1L) {
					long var12 = var10 - field11090;
					long var14 = var7 - field11091;
					if (var14 != 0L) {
						var9 = (int) (var12 * 100L / var14);
					}
				}
				field11090 = var10;
				field11091 = var7;
			}
			var3.field11432.p2_alt1(Statics.field594.field8180);
			var3.field11432.p1_alt3(fps);
			var3.field11432.p1(var9);
			field10849.method934(var3);
			Statics.field594 = null;
			Statics.field3457 = var7 + 30000L;
		}
		class648.method3648();
		class576.method9189();
		class993 var16 = (class993) field10816.method14191();
		if (world.method7743() != null) {
			if (Statics.field3416 == 5) {
				method18478();
			} else if (Statics.field3416 == 6) {
				method9611();
			}
		}
		if (field10898) {
			field10898 = false;
		} else {
			field10897 /= 2.0F;
		}
		if (field11059) {
			field11059 = false;
		} else {
			field10896 /= 2.0F;
		}
		if (class29.method2978()) {
			class29.method2585();
		} else if (Statics.field3416 == 3) {
			CoordGrid var17 = world.method7727();
			int var18 = var17.field7426 << 9;
			int var19 = var17.field7427 << 9;
			if (Statics.field637 <= 0L) {
				Statics.field637 = MonotonicTime.method3655();
			}
			float var20 = (float) (MonotonicTime.method3655() - Statics.field637);
			int var21 = 1000 / GameShell.method6016();
			int var22 = (int) ((double) var21 * 1.25D);
			while (var20 > 0.0F) {
				float var23 = Math.min(var20, (float) var22);
				Statics.field9155.method4681(var23 / 1000.0F, world.method7744().field4540, world.method7793(), var18, var19);
				var20 -= var22;
			}
			Statics.field637 = MonotonicTime.method3655();
		}
		method1680();
		if (state != 18) {
			return;
		}
		world.method7816().method10003(world);
		Statics.method3486();
		if (field10915 > 10) {
			field10849.field789++;
		}
		if (field10849.field789 > 2250) {
			method8321();
			return;
		}
		if (field10863 == 3) {
			method9274();
			method16431();
		} else if (Statics.field2775.field7675.method9396(var16, field11024, field10822, Statics.field11931)) {
			class153.method7372(false);
		} else {
			if (field10863 == 2 && class153.method10308(field10862)) {
				world.method7749(new RebuildRequest(RebuildType.field5064, null));
				field10863 = 1;
			}
			if (field10863 == 1 && state != 3) {
				class153.field1718.method14499();
				field10863 = 0;
				field11041 = field10903;
				field10797 = 0;
				field10877 = false;
				class153.method1576();
			}
			if (field10863 == 0) {
				int var24 = field10903 - field11041;
				if (field10797 < Statics.field1713.length) {
					do {
						CutsceneAction var25 = Statics.field1713[field10797];
						if (var25.field1750 > var24) {
							break;
						}
						var25.method2890();
					} while (field10863 == 0 && ++field10797 < Statics.field1713.length);
				}
				if (field10863 == 0) {
					for (int var26 = 0; var26 < Statics.field1721.length; var26++) {
						class158 var27 = Statics.field1721[var26];
						if (var27.field1744) {
							PathingEntity var28 = var27.method2870();
							method1679(var28, true);
						}
					}
				}
			}
		}
		method260();
		method8176();
		method9926();
		class1004.method3079(false);
		class1004.method9231(Statics.field8198, Statics.field7366);
		field10891++;
		if (field10926 != 0) {
			field10925 = field10925 * 400 + 20;
			if (field10925 * 400 >= 400) {
				field10926 = 0;
			}
		}
		if (Statics.field7285 != null) {
			field10927++;
			if (field10927 >= 15) {
				method4616(Statics.field7285);
				Statics.field7285 = null;
			}
		}
		field10993 = null;
		field10999 = false;
		field10878 = false;
		Statics.field3044 = null;
		MiniMenu.method18919(null, -1, -1);
		if (!field10973) {
			field10970 = -1;
		}
		method5013();
		field11058++;
		if (field11083) {
			ClientMessage var29 = Statics.method1604(ClientProt.CLICKWORLDMAP, field10849.field794);
			var29.field11432.p4_alt3(Statics.field6866 << 28 | Statics.field530 << 14 | Statics.field5107);
			field10849.method934(var29);
			field11083 = false;
		}
		while (true) {
			HookRequest var30;
			Component var31;
			Component var32;
			do {
				var30 = (HookRequest) field11032.method14154();
				if (var30 == null) {
					while (true) {
						HookRequest var33;
						Component var34;
						Component var35;
						do {
							var33 = (HookRequest) field11033.method14154();
							if (var33 == null) {
								while (true) {
									HookRequest var36;
									Component var37;
									Component var38;
									do {
										var36 = (HookRequest) field11031.method14154();
										if (var36 == null) {
											if (Statics.field3044 == null) {
												field11003 = 0;
											}
											if (field10989 != null) {
												method6847();
											}
											MiniMenu.method9026();
											if (field10949 > 0 && Statics.field11931.method9080(82) && Statics.field11931.method9080(81) && field10817 != 0) {
												int var39 = Statics.field4490.field11717 - field10817;
												if (var39 < 0) {
													var39 = 0;
												} else if (var39 > 3) {
													var39 = 3;
												}
												CoordGrid var40 = world.method7727();
												method10445(var39, var40.field7426 + Statics.field4490.field10450[0], var40.field7427 + Statics.field4490.field10448[0]);
											}
											for (int var41 = 0; var41 < 5; var41++) {
												int var10002 = field10996[var41]++;
											}
											if (Statics.field7228.field10252 && Statics.field7228.field10253 < MonotonicTime.method3655() - 60000L) {
												method14147();
											}
											Statics.field7228.method16414();
											for (class957 var42 = (class957) field10910.method14254(); var42 != null; var42 = (class957) field10910.method14241()) {
												if ((long) var42.field11211 < MonotonicTime.method3655() / 1000L - 5L) {
													if (var42.field11209 > 0) {
														ChatHistory.method2664(5, 0, "", "", "", var42.field11210 + LocalisedText.FRIENDLOGIN.method15021(Statics.field1680), null);
													}
													if (var42.field11209 == 0) {
														ChatHistory.method2664(5, 0, "", "", "", var42.field11210 + LocalisedText.FRIENDLOGOUT.method15021(Statics.field1680), null);
													}
													var42.method8433();
												}
											}
											field10884++;
											if (field10884 > 509) {
												field10884 = 0;
												int var43 = (int) (Math.random() * 8.0D);
												if ((var43 & 0x1) == 1) {
													field10870 += field10879 * 2;
												}
												if ((var43 & 0x2) == 2) {
													field10880 += field11008 * 2;
												}
												if ((var43 & 0x4) == 4) {
													field10861 += field10883;
												}
											}
											if (field10870 < -52) {
												field10879 = 4;
											}
											if (field10870 > 50) {
												field10879 = -4;
											}
											if (field10880 < -58) {
												field11008 = -1103918620;
											}
											if (field10880 > 61) {
												field11008 = 1103918620;
											}
											if (field10861 < -44) {
												field10883 = 1;
											}
											if (field10861 > 44) {
												field10883 = -1;
											}
											field10952++;
											if (field10952 > 509) {
												field10952 = 0;
												int var44 = (int) (Math.random() * 8.0D);
												if ((var44 & 0x1) == 1) {
													field10885 += field11026 * 2;
												}
												if ((var44 & 0x2) == 2) {
													field10887 += field11074;
												}
											}
											if (field10885 < -69) {
												field11026 = -630688752;
											}
											if (field10885 > 63) {
												field11026 = 630688752;
											}
											if (field10887 < -22) {
												field11074 = 1;
											}
											if (field10887 > 10) {
												field11074 = -1;
											}
											field10849.field793++;
											if (field10849.field793 > 50) {
												ClientMessage var45 = Statics.method1604(ClientProt.NO_TIMEOUT, field10849.field794);
												field10849.method934(var45);
											}
											if (field11082) {
												method15198();
												field11082 = false;
											}
											try {
												field10849.method933();
											} catch (IOException var47) {
												method8321();
											}
											return;
										}
										var37 = var36.field11491;
										if (var37.field2183 < 0) {
											break;
										}
										var38 = Component.method10202(var37.field2200);
									} while (var38 == null || var38.field2351 == null || var37.field2183 >= var38.field2351.length || var38.field2351[var37.field2183] != var37);
									ScriptRunner.method1428(var36);
								}
							}
							var34 = var33.field11491;
							if (var34.field2183 < 0) {
								break;
							}
							var35 = Component.method10202(var34.field2200);
						} while (var35 == null || var35.field2351 == null || var34.field2183 >= var35.field2351.length || var35.field2351[var34.field2183] != var34);
						ScriptRunner.method1428(var33);
					}
				}
				var31 = var30.field11491;
				if (var31.field2183 < 0) {
					break;
				}
				var32 = Component.method10202(var31.field2200);
			} while (var32 == null || var32.field2351 == null || var31.field2183 >= var32.field2351.length || var32.field2351[var31.field2183] != var31);
			ScriptRunner.method1428(var30);
		}
	}

	@ObfuscatedName("xl.fk(B)V")
	public static final void method9926() {
		for (int var0 = Statics.field7410.field632.method9623(true); var0 != -1; var0 = Statics.field7410.field632.method9623(false)) {
			method18736(var0);
			field11009[++field11010 - 1 & 0x3F] = var0;
		}
		for (DelayedStateChange var1 = DelayedStateChange.method5207(); var1 != null; var1 = DelayedStateChange.method5207()) {
			int var2 = var1.method19276();
			long var3 = var1.method19271();
			if (var2 == 1) {
				VarType var5 = (VarType) Statics.field8911.get((int) var3);
				Statics.field7228.method2798(var5, var1.field12268);
				field11019[++field11016 - 1 & 0x3F] = (int) var3;
			} else if (var2 == 2) {
				VarType var6 = (VarType) Statics.field8911.get((int) var3);
				Statics.field7228.method2802(var6, var1.field12269);
				field11017[++field11018 - 1 & 0x3F] = (int) var3;
			} else if (var2 == 3) {
				Component var7 = Component.method10202((int) var3);
				if (!var1.field12269.equals(var7.field2261)) {
					var7.field2261 = var1.field12269;
					method4616(var7);
				}
			} else if (var2 == 23) {
				Component var8 = Component.method10202((int) var3);
				if (var8.field2267 != (var1.field12268 == 1)) {
					var8.field2267 = var1.field12268 == 1;
					method4616(var8);
				}
			} else if (var2 == 4) {
				Component var9 = Component.method10202((int) var3);
				int var10 = var1.field12268;
				int var11 = var1.field12274;
				int var12 = var1.field12267;
				if (var9.field2224 != var10 || var9.field2294 != var11 || var9.field2298 != var12) {
					var9.field2224 = var10;
					var9.field2294 = var11;
					var9.field2298 = var12;
					var9.field2363 = null;
					method4616(var9);
				}
			} else if (var2 == 5) {
				Component var13 = Component.method10202((int) var3);
				if (var1.field12268 != var13.field2262) {
					if (var1.field12268 == -1) {
						var13.field2170 = null;
					} else {
						if (var13.field2170 == null) {
							var13.field2170 = new class1074();
						}
						var13.field2170.method14362(var1.field12268);
					}
					var13.field2262 = var1.field12268;
					method4616(var13);
				}
			} else if (var2 == 6) {
				int var14 = var1.field12268;
				int var15 = var14 >> 10 & 0x1F;
				int var16 = var14 >> 5 & 0x1F;
				int var17 = var14 & 0x1F;
				int var18 = (var17 << 3) + (var15 << 19) + (var16 << 11);
				Component var19 = Component.method10202((int) var3);
				if (var19.field2210 != var18) {
					var19.field2210 = var18;
					method4616(var19);
				}
			} else if (var2 == 7) {
				Component var20 = Component.method10202((int) var3);
				boolean var21 = var1.field12268 == 1;
				if (var20.field2201 != var21) {
					var20.field2201 = var21;
					method4616(var20);
				}
			} else if (var2 == 8) {
				Component var22 = Component.method10202((int) var3);
				if (var1.field12268 != var22.field2230 || var1.field12274 != var22.field2231 || var1.field12267 != var22.field2272) {
					var22.field2230 = var1.field12268;
					var22.field2231 = var1.field12274;
					var22.field2272 = var1.field12267;
					if (var22.field2334 != -1) {
						if (var22.field2227 > 0) {
							var22.field2272 = var22.field2272 * 32 / var22.field2227;
						} else if (var22.field2192 > 0) {
							var22.field2272 = var22.field2272 * 32 / var22.field2192;
						}
					}
					method4616(var22);
				}
			} else if (var2 == 9) {
				Component var23 = Component.method10202((int) var3);
				if (var1.field12268 != var23.field2334 || var1.field12274 != var23.field2335) {
					var23.field2334 = var1.field12268;
					var23.field2335 = var1.field12274;
					method4616(var23);
				}
			} else if (var2 == 10) {
				Component var24 = Component.method10202((int) var3);
				if (var1.field12268 != var24.field2228 || var1.field12274 != var24.field2316 || var1.field12267 != var24.field2331) {
					var24.field2228 = var1.field12268;
					var24.field2316 = var1.field12274;
					var24.field2331 = var1.field12267;
					method4616(var24);
				}
			} else if (var2 == 11) {
				Component var25 = Component.method10202((int) var3);
				var25.field2186 = 0;
				var25.field2194 = var25.field2190 = var1.field12268;
				var25.field2187 = 0;
				var25.field2195 = var25.field2191 = var1.field12274;
				method4616(var25);
			} else if (var2 == 12) {
				Component var26 = Component.method10202((int) var3);
				int var27 = var1.field12268;
				if (var26 != null && var26.field2184 == 0) {
					if (var27 > var26.field2319 - var26.field2197) {
						var27 = var26.field2319 - var26.field2197;
					}
					if (var27 < 0) {
						var27 = 0;
					}
					if (var26.field2207 != var27) {
						var26.field2207 = var27;
						method4616(var26);
					}
				}
			} else if (var2 == 13) {
				Component var28 = Component.method10202((int) var3);
				var28.field2215 = var1.field12268;
			} else if (var2 == 14) {
				class42.field730 = true;
				class42.field731 = var1.field12268;
				class42.field718 = var1.field12274;
			} else if (var2 == 15) {
				Component var29 = Component.method10202((int) var3);
				var29.field2287 = var1.field12268;
			} else if (var2 == 21) {
				Component var30 = Component.method10202((int) var3);
				var30.field2275 = var1.field12268 == 1;
			} else if (var2 == 22) {
				Component var31 = Component.method10202((int) var3);
				var31.field2253 = var1.field12268 == 1;
			} else if (var2 == 17) {
				Component var32 = Component.method10202((int) var3);
				int var33 = (int) (var3 >> 32);
				var32.method3964(var33, (short) var1.field12268, (short) var1.field12274);
			} else if (var2 == 20) {
				Component var34 = Component.method10202((int) var3);
				int var35 = (int) (var3 >> 32);
				var34.method3993(var35, (short) var1.field12268, (short) var1.field12274);
			}
		}
	}

	@ObfuscatedName("dt.fh(I)V")
	public static final void method1680() {
		class42.method16903(Statics.field8198);
		if (Statics.field4826 != field11046) {
			method3128();
		}
	}

	@ObfuscatedName("l.fr(B)V")
	public static final void method260() {
		int[] var0 = ReceivePlayerPositions.field703;
		for (int var1 = 0; var1 < ReceivePlayerPositions.field698; var1++) {
			PlayerEntity var2 = field10944[var0[var1]];
			if (var2 != null) {
				var2.method16520();
			}
		}
		for (int var3 = 0; var3 < field11011; var3++) {
			long var4 = (long) field11036[var3];
			ObjectWrapper var6 = (ObjectWrapper) field10838.method14495(var4);
			if (var6 != null) {
				((PathingEntity) var6.field11436).method16520();
			}
		}
		if (field10863 != 0) {
			return;
		}
		for (int var7 = 0; var7 < Statics.field1721.length; var7++) {
			class158 var8 = Statics.field1721[var7];
			if (var8.field1744) {
				var8.method2870().method16520();
			}
		}
	}

	@ObfuscatedName("yj.gu(IIIB)V")
	public static final void method10445(int arg0, int arg1, int arg2) {
		String var3 = "tele " + arg0 + TextUtil.COMMA + (arg1 >> 6) + TextUtil.COMMA + (arg2 >> 6) + TextUtil.COMMA + (arg1 & 0x3F) + TextUtil.COMMA + (arg2 & 0x3F);
		System.out.println(var3);
		DeveloperConsole.method18913(var3, true, false);
	}

	@ObfuscatedName("ahn.gq(I)[Laal;")
	public static class727[] method16741() {
		if (Statics.field8871 == null) {
			class727[] var0 = Fullscreen.method9554(Statics.fsimp14);
			class727[] var1 = new class727[var0.length];
			int var2 = 0;
			int var3 = Statics.field688.screenSize.method18581();
			label71: for (int var4 = 0; var4 < var0.length; var4++) {
				class727 var5 = var0[var4];
				if ((var5.field8539 <= 0 || var5.field8539 >= 24) && var5.field8537 >= 800 && var5.field8538 >= 600 && (var3 != 2 || var5.field8537 <= 800 && var5.field8538 <= 600) && (var3 != 1 || var5.field8537 <= 1024 && var5.field8538 <= 768)) {
					for (int var6 = 0; var6 < var2; var6++) {
						class727 var7 = var1[var6];
						if (var5.field8537 == var7.field8537 && var5.field8538 == var7.field8538) {
							if (var5.field8539 > var7.field8539) {
								var1[var6] = var5;
							}
							continue label71;
						}
					}
					var1[var2] = var5;
					var2++;
				}
			}
			Statics.field8871 = new class727[var2];
			System.arraycopy(var1, 0, Statics.field8871, 0, var2);
			int[] var8 = new int[Statics.field8871.length];
			for (int var9 = 0; var9 < Statics.field8871.length; var9++) {
				class727 var10 = Statics.field8871[var9];
				var8[var9] = var10.field8538 * var10.field8537;
			}
			class664.method1901(var8, Statics.field8871);
		}
		return Statics.field8871;
	}

	@ObfuscatedName("wa.gl(I)V")
	public static final void method9611() {
		if (field10904 == -1 || field10908 == -1) {
			return;
		}
		int var0 = (field10976 * (field10913 - field10843) >> 16) + field10843;
		field10976 += var0;
		if (field10976 >= 65535) {
			field10976 = 65535;
			if (field10969) {
				field10813 = false;
			} else {
				field10813 = true;
			}
			field10969 = true;
		} else {
			field10813 = false;
			field10969 = false;
		}
		float var1 = (float) field10976 / 65535.0F;
		float[] var2 = new float[3];
		int var3 = field10909 * 4;
		for (int var4 = 0; var4 < 3; var4++) {
			int var5 = field10981[field10904][var3][var4] * 3;
			int var6 = field10981[field10904][var3 + 1][var4] * 3;
			int var7 = (field10981[field10904][var3 + 2][var4] - (field10981[field10904][var3 + 3][var4] - field10981[field10904][var3 + 2][var4])) * 3;
			int var8 = field10981[field10904][var3][var4];
			int var9 = var6 - var5;
			int var10 = var5 - var6 * 2 + var7;
			int var11 = field10981[field10904][var3 + 2][var4] - var8 + var6 - var7;
			var2[var4] = (((float) var11 * var1 + (float) var10) * var1 + (float) var9) * var1 + (float) var8;
		}
		CoordGrid var12 = world.method7727();
		Statics.field7956 = (int) var2[0] - var12.field7426 * 512;
		Statics.field10518 = (int) var2[1] * -1;
		Statics.field1881 = (int) var2[2] - var12.field7427 * 512;
		float[] var13 = new float[3];
		int var14 = field10932 * 2;
		for (int var15 = 0; var15 < 3; var15++) {
			int var16 = field10981[field10908][var14][var15] * 3;
			int var17 = field10981[field10908][var14 + 1][var15] * 3;
			int var18 = (field10981[field10908][var14 + 2][var15] - (field10981[field10908][var14 + 3][var15] - field10981[field10908][var14 + 2][var15])) * 3;
			int var19 = field10981[field10908][var14][var15];
			int var20 = var17 - var16;
			int var21 = var16 - var17 * 2 + var18;
			int var22 = field10981[field10908][var14 + 2][var15] - var19 + var17 - var18;
			var13[var15] = (((float) var22 * var1 + (float) var21) * var1 + (float) var20) * var1 + (float) var19;
		}
		float var23 = var13[0] - var2[0];
		float var24 = (var13[1] - var2[1]) * -1.0F;
		float var25 = var13[2] - var2[2];
		double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
		Statics.field7447 = (int) (Math.atan2((double) var24, var26) * 2607.5945876176133D) & 0x3FFF;
		Statics.field8586 = (int) (-Math.atan2((double) var23, (double) var25) * 2607.5945876176133D) & 0x3FFF;
		Statics.field2656 = (field10976 * (field10981[field10904][var3 + 2][3] - field10981[field10904][var3][3]) >> 16) + field10981[field10904][var3][3];
	}

	@ObfuscatedName("amf.go(B)V")
	public static final void method18478() {
		int var0 = Statics.field8550 * 512 + 256;
		int var1 = Statics.field8492 * 512 + 256;
		int var2 = method3660(var0, var1, Statics.field4826) - Statics.field741;
		if (Statics.field490 >= 100) {
			Statics.field7956 = Statics.field8550 * 512 + 256;
			Statics.field1881 = Statics.field8492 * 512 + 256;
			Statics.field10518 = method3660(Statics.field7956, Statics.field1881, Statics.field4826) - Statics.field741;
		} else {
			if (Statics.field7956 < var0) {
				Statics.field7956 += Statics.field490 * (var0 - Statics.field7956) / 1000 + Statics.field2937;
				if (Statics.field7956 > var0) {
					Statics.field7956 = var0;
				}
			}
			if (Statics.field7956 > var0) {
				Statics.field7956 -= Statics.field490 * (Statics.field7956 - var0) / 1000 + Statics.field2937;
				if (Statics.field7956 < var0) {
					Statics.field7956 = var0;
				}
			}
			if (Statics.field10518 < var2) {
				Statics.field10518 += Statics.field490 * (var2 - Statics.field10518) / 1000 + Statics.field2937;
				if (Statics.field10518 > var2) {
					Statics.field10518 = var2;
				}
			}
			if (Statics.field10518 > var2) {
				Statics.field10518 -= Statics.field490 * (Statics.field10518 - var2) / 1000 + Statics.field2937;
				if (Statics.field10518 < var2) {
					Statics.field10518 = var2;
				}
			}
			if (Statics.field1881 < var1) {
				Statics.field1881 += Statics.field490 * (var1 - Statics.field1881) / 1000 + Statics.field2937;
				if (Statics.field1881 > var1) {
					Statics.field1881 = var1;
				}
			}
			if (Statics.field1881 > var1) {
				Statics.field1881 -= Statics.field490 * (Statics.field1881 - var1) / 1000 + Statics.field2937;
				if (Statics.field1881 < var1) {
					Statics.field1881 = var1;
				}
			}
		}
		int var3 = Statics.field6714 * 512 + 256;
		int var4 = Statics.field2626 * 512 + 256;
		int var5 = method3660(var3, var4, Statics.field4826) - Statics.field1983;
		int var6 = var3 - Statics.field7956;
		int var7 = var5 - Statics.field10518;
		int var8 = var4 - Statics.field1881;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 2607.5945876176133D) & 0x3FFF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -2607.5945876176133D) & 0x3FFF;
		if (var10 < 1024) {
			var10 = 1024;
		}
		if (var10 > 3072) {
			var10 = 3072;
		}
		if (Statics.field7447 < var10) {
			Statics.field7447 += (var10 - Statics.field7447 >> 3) * Statics.field708 / 1000 + Statics.field8576 << 3;
			if (Statics.field7447 > var10) {
				Statics.field7447 = var10;
			}
		}
		if (Statics.field7447 > var10) {
			Statics.field7447 -= (Statics.field7447 - var10 >> 3) * Statics.field708 / 1000 + Statics.field8576 << 3;
			if (Statics.field7447 < var10) {
				Statics.field7447 = var10;
			}
		}
		int var12 = var11 - Statics.field8586;
		if (var12 > 8192) {
			var12 -= 16384;
		}
		if (var12 < -8192) {
			var12 += 16384;
		}
		int var13 = var12 >> 3;
		if (var13 > 0) {
			Statics.field8586 += Statics.field708 * var13 / 1000 + Statics.field8576 << 3;
			Statics.field8586 &= 0x3FFF;
		}
		if (var13 < 0) {
			Statics.field8586 -= Statics.field708 * -var13 / 1000 + Statics.field8576 << 3;
			Statics.field8586 &= 0x3FFF;
		}
		int var14 = var11 - Statics.field8586;
		if (var14 > 8192) {
			var14 -= 16384;
		}
		if (var14 < -8192) {
			var14 += 16384;
		}
		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			Statics.field8586 = var11;
		}
		Statics.field2656 = 0;
	}

	@ObfuscatedName("yn.gk(II)V")
	public static final void method10490(int arg0) {
		int var1 = field10903 - field10899;
		if (var1 >= 100) {
			Statics.field3416 = method14298();
			Statics.field3538 = -1;
			Statics.field810 = -1;
			return;
		}
		float var2 = 1.0F - (float) ((100 - var1) * (100 - var1) * (100 - var1)) / 1000000.0F;
		int var5;
		if (method14298() == 3) {
			CoordFine var3 = Statics.field9155.method4709().method5221();
			CoordGrid var4 = world.method7727();
			Statics.field7447 = (int) ((double) Statics.field9155.method4718() * 2607.5945876176133D) & 0x3FFF;
			Statics.field8586 = (int) ((double) Statics.field9155.method4719() * -2607.5945876176133D) & 0x3FFF;
			Statics.field2656 = 0;
			field11078 = (int) ((float) Statics.field7286 + (float) ((int) ((double) field11076 / (Math.tan((double) (Statics.field9155.method4784() / 2.0F)) * 4.0D)) - Statics.field7286) * var2);
			Statics.field7956 = (int) ((float) (var3.field11478 - var4.field7426 * 512 - Statics.field9214) * var2 + (float) Statics.field9214);
			Statics.field10518 = (int) ((float) (-var3.field11479 - Statics.field4857) * var2 + (float) Statics.field4857);
			Statics.field1881 = (int) ((float) (var3.field11480 - var4.field7427 * 512 - Statics.field7231) * var2 + (float) Statics.field7231);
			var5 = -Statics.field8586 - Statics.field8720 & 0x3FFF;
			if (var5 > 8192) {
				var5 -= 16384;
			} else if (var5 < -8192) {
				var5 += 16384;
			}
		} else {
			int var6 = (int) field11004;
			if (field10806 >> 8 > var6) {
				var6 = field10806 >> 8;
			}
			if (field10983[4] && field11063[4] + 128 > var6) {
				var6 = field11063[4] + 128;
			}
			int var7 = field10861 + (int) field10895 & 0x3FFF;
			Vector3 var8 = Statics.field4490.method10536().field4298;
			method14042(Statics.field8910, method3660((int) var8.field4308, (int) var8.field4313, Statics.field4826) - field10901, Statics.field3569, var6, var7, (var6 >> 3) * 3 + 600 << 2, arg0);
			Statics.field7956 = (int) ((float) (Statics.field7956 - Statics.field9214) * var2 + (float) Statics.field9214);
			Statics.field10518 = (int) ((float) (Statics.field10518 - Statics.field4857) * var2 + (float) Statics.field4857);
			Statics.field1881 = (int) ((float) (Statics.field1881 - Statics.field7231) * var2 + (float) Statics.field7231);
			Statics.field7447 = (int) ((float) (Statics.field7447 - Statics.field1267) * var2 + (float) Statics.field1267);
			var5 = Statics.field8586 - Statics.field8720;
			if (var5 > 8192) {
				var5 -= 16384;
			} else if (var5 < -8192) {
				var5 += 16384;
			}
		}
		Statics.field8586 = (int) ((float) var5 * var2 + (float) Statics.field8720);
		Statics.field8586 &= 0x3FFF;
		field11078 = (int) ((float) (field11078 - Statics.field7286) * var2 + (float) Statics.field7286);
	}

	@ObfuscatedName("a.gp(J)V")
	public static final void method614(long arg0) {
		Vector3 var2 = Statics.field4490.method10536().field4298;
		int var3 = field10870 + (int) var2.field4308;
		int var4 = field10880 + (int) var2.field4313;
		if (Statics.field8910 - var3 < -2000 || Statics.field8910 - var3 > 2000 || Statics.field3569 - var4 < -2000 || Statics.field3569 - var4 > 2000) {
			Statics.field8910 = var3;
			Statics.field3569 = var4;
		}
		if (Statics.field8910 != var3) {
			int var5 = var3 - Statics.field8910;
			int var6 = (int) ((long) var5 * arg0 / 320L);
			if (var5 > 0) {
				if (var6 == 0) {
					var6 = 1;
				} else if (var6 > var5) {
					var6 = var5;
				}
			} else if (var6 == 0) {
				var6 = -1;
			} else if (var6 < var5) {
				var6 = var5;
			}
			Statics.field8910 += var6;
		}
		if (Statics.field3569 != var4) {
			int var7 = var4 - Statics.field3569;
			int var8 = (int) ((long) var7 * arg0 / 320L);
			if (var7 > 0) {
				if (var8 == 0) {
					var8 = 1;
				} else if (var8 > var7) {
					var8 = var7;
				}
			} else if (var8 == 0) {
				var8 = -1;
			} else if (var8 < var7) {
				var8 = var7;
			}
			Statics.field3569 += var8;
		}
		field10895 += (float) arg0 * field10896 / 6.0F;
		field11004 += (float) arg0 * field10897 / 6.0F;
		method14884();
	}

	@ObfuscatedName("fw.gy(J)V")
	public static final void method3093(long arg0) {
		int var2 = field10892;
		int var3 = field10893;
		if (Statics.field8910 != var2) {
			int var4 = var2 - Statics.field8910;
			int var5 = (int) ((long) var4 * arg0 / 320L);
			if (var4 > 0) {
				if (var5 == 0) {
					var5 = 1;
				} else if (var5 > var4) {
					var5 = var4;
				}
			} else if (var5 == 0) {
				var5 = -1;
			} else if (var5 < var4) {
				var5 = var4;
			}
			Statics.field8910 += var5;
		}
		if (Statics.field3569 != var3) {
			int var6 = var3 - Statics.field3569;
			int var7 = (int) ((long) var6 * arg0 / 320L);
			if (var6 > 0) {
				if (var7 == 0) {
					var7 = 1;
				} else if (var7 > var6) {
					var7 = var6;
				}
			} else if (var7 == 0) {
				var7 = -1;
			} else if (var7 < var6) {
				var7 = var6;
			}
			Statics.field3569 += var7;
		}
		field10895 += (float) arg0 * field10896 / 40.0F * 8.0F;
		field11004 += (float) arg0 * field10897 / 40.0F * 8.0F;
		method14884();
	}

	@ObfuscatedName("gd.ga(B)V")
	public static final void method3653() {
		if (!field10898) {
			field10897 += (12.0F - field10897) / 2.0F;
			field10902 = true;
			field10898 = true;
		}
	}

	@ObfuscatedName("aai.gn(I)V")
	public static final void method14311() {
		if (!field10898) {
			field10897 += (-12.0F - field10897) / 2.0F;
			field10902 = true;
			field10898 = true;
		}
	}

	@ObfuscatedName("yc.gc(I)V")
	public static final void method13836() {
		if (!field11059) {
			field10896 += (24.0F - field10896) / 2.0F;
			field10902 = true;
			field11059 = true;
		}
	}

	@ObfuscatedName("je.gx(IIII)V")
	public static void method4843(int arg0, int arg1, int arg2) {
		int var3 = arg0 << 3;
		int var4 = arg1 << 3;
		int var5 = arg2 << 3;
		if (Statics.field3416 != 3) {
			field11004 = var3;
			field10895 = var4;
			if (Statics.field3416 == 5) {
				Statics.field7447 = var3;
				Statics.field8586 = var4;
				Statics.field2656 = var5;
			}
			method14884();
		} else if (Statics.field9155.method4780() == PositionMode.field2815) {
			PositionEntity var6 = (PositionEntity) Statics.field9155.method4709();
			class421 var7 = new class421();
			class421 var8 = new class421();
			var7.method6414(0.0F, 1.0F, 0.0F, 3.1415927F - (float) ((double) var4 * 3.141592653589793D * 2.0D / 16384.0D));
			Vector3 var9 = new Vector3(1.0F, 0.0F, 0.0F);
			var9.method6526(var7);
			var9.method6494();
			var8.method6413(var9, (float) ((double) var3 * 3.141592653589793D * 2.0D) / 16384.0F);
			var7.method6424(var8);
			var6.field10554.method6412(var7);
		}
		field10902 = true;
	}

	@ObfuscatedName("abx.ge(B)V")
	public static final void method14884() {
		if (field11004 < 1077.0F) {
			field11004 = 1077.0F;
		}
		if (field11004 > 2787.0F) {
			field11004 = 2787.0F;
		}
		while (field10895 >= 16384.0F) {
			field10895 -= 16384.0F;
		}
		while (field10895 < 0.0F) {
			field10895 += 16384.0F;
		}
		LinkMap var0 = world.method7793();
		Scene var1 = world.method7743();
		int var2 = Statics.field8910 >> 9;
		int var3 = Statics.field3569 >> 9;
		int var4 = method3660(Statics.field8910, Statics.field3569, Statics.field4826);
		int var5 = 0;
		if (var2 > 3 && var3 > 3 && var2 < world.method7728() - 4 && var3 < world.method7758() - 4) {
			for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					int var8 = Statics.field4826;
					if (var8 < 3 && var0.method7105(var6, var7)) {
						var8++;
					}
					int var9 = 0;
					byte[][] var10 = world.method7736(var8);
					if (var10 != null) {
						var9 = (var10[var6][var7] & 0xFF) * 8 << 2;
					}
					if (var1.field6913 != null && var1.field6913[var8] != null) {
						int var11 = var4 - (var1.field6913[var8].method1529(var6, var7) - var9);
						if (var11 > var5) {
							var5 = var11;
						}
					}
				}
			}
		}
		int var12 = (var5 >> 2) * 1536;
		if (var12 > 786432) {
			var12 = 786432;
		}
		if (var12 < 262144) {
			var12 = 262144;
		}
		if (var12 > field10806) {
			field10806 += (var12 - field10806) / 24;
		} else if (var12 < field10806) {
			field10806 += (var12 - field10806) / 80;
		}
	}

	@ObfuscatedName("afg.gg(IIIIIZI)V")
	public static final void method15723(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		Statics.field8550 = arg0 * 262144;
		Statics.field8492 = arg1 * 262144;
		Statics.field741 = arg2;
		Statics.field2937 = arg3;
		Statics.field490 = arg4;
		if (Statics.field3416 == 3) {
			method9025();
		}
		if (arg5 && Statics.field490 >= 100) {
			Statics.field7956 = Statics.field8550 * 512 + 256;
			Statics.field1881 = Statics.field8492 * 512 + 256;
			Statics.field10518 = method3660(Statics.field7956, Statics.field1881, Statics.field4826) - Statics.field741;
		}
		Statics.field3416 = 5;
		Statics.field3538 = -1;
		Statics.field810 = -1;
	}

	@ObfuscatedName("abb.gr(IIIIIB)V")
	public static final void method14706(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Statics.field6714 = arg0;
		Statics.field2626 = arg1;
		Statics.field1983 = arg2;
		Statics.field8576 = arg3;
		Statics.field708 = arg4;
		if (Statics.field3416 == 3) {
			method9025();
		}
		if (Statics.field708 >= 100) {
			int var5 = Statics.field6714 * 512 + 256;
			int var6 = Statics.field2626 * 512 + 256;
			int var7 = method3660(var5, var6, Statics.field4826) - Statics.field1983;
			int var8 = var5 - Statics.field7956;
			int var9 = var7 - Statics.field10518;
			int var10 = var6 - Statics.field1881;
			int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
			Statics.field7447 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
			Statics.field8586 = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 0x3FFF;
			Statics.field2656 = 0;
			if (Statics.field7447 < 1024) {
				Statics.field7447 = 1024;
			}
			if (Statics.field7447 > 3072) {
				Statics.field7447 = 3072;
			}
		}
		Statics.field3416 = 5;
		Statics.field3538 = -1;
		Statics.field810 = -1;
	}

	@ObfuscatedName("hs.gs(II)V")
	public static final void method4046(int arg0) {
		for (int var1 = 0; var1 < 5; var1++) {
			field10983[var1] = false;
		}
		field10904 = -1;
		field10908 = -1;
		Statics.field8576 = 0;
		Statics.field708 = 0;
		Statics.field3538 = -1;
		Statics.field810 = -1;
		Statics.field3416 = arg0;
		if (Statics.field3416 != 3) {
			Statics.field637 = 0L;
		}
	}

	@ObfuscatedName("gv.gt(B)V")
	public static final void method3605() {
		for (int var0 = 0; var0 < 5; var0++) {
			field10983[var0] = false;
		}
		field10904 = -1;
		field10908 = -1;
		Statics.field8576 = 0;
		Statics.field708 = 0;
		Statics.field3416 = 1;
		if (method14298() == 3) {
			CoordGrid var1 = world.method7727();
			int var2 = var1.field7426 << 9;
			int var3 = var1.field7427 << 9;
			int var4 = 1000 / GameShell.method6016();
			Statics.field9155.method4681((float) var4 / 1000.0F, world.method7744().field4540, world.method7793(), var2, var3);
		}
		Statics.field3538 = -1;
		Statics.field810 = -1;
		field10899 = field10903;
		Statics.field9214 = Statics.field7956;
		Statics.field4857 = Statics.field10518;
		Statics.field7231 = Statics.field1881;
		Statics.field1267 = Statics.field7447;
		Statics.field8720 = Statics.field8586;
		Statics.field7286 = field11078;
	}

	@ObfuscatedName("uf.gh(S)V")
	public static final void method9025() {
		CoordGrid var0 = world.method7727();
		Vector3 var1 = Statics.field9155.method4714();
		Statics.field7956 = (int) var1.field4308 - (var0.field7426 << 9);
		Statics.field10518 = -((int) var1.field4311);
		Statics.field1881 = (int) var1.field4313 - (var0.field7427 << 9);
		Statics.field7447 = (int) ((double) Statics.field9155.method4718() * 2607.5945876176133D) & 0x3FFF;
		Statics.field8586 = (int) ((double) Statics.field9155.method4719() * 2607.5945876176133D) & 0x3FFF;
		Statics.field2656 = 0;
	}

	@ObfuscatedName("vb.gm(B)V")
	public static final void method9274() {
		int var0 = ReceivePlayerPositions.field698;
		int[] var1 = ReceivePlayerPositions.field703;
		for (int var2 = 0; var2 < var0; var2++) {
			PlayerEntity var3 = field10944[var1[var2]];
			if (var3 != null) {
				method1679(var3, false);
			}
		}
	}

	@ObfuscatedName("afj.gv(I)V")
	public static final void method16431() {
		for (int var0 = 0; var0 < field11011; var0++) {
			int var1 = field11036[var0];
			ObjectWrapper var2 = (ObjectWrapper) field10838.method14495((long) var1);
			if (var2 != null) {
				NpcEntity var3 = (NpcEntity) var2.field11436;
				method1679(var3, false);
			}
		}
	}

	@ObfuscatedName("dt.gj(Lahm;ZB)V")
	public static final void method1679(PathingEntity arg0, boolean arg1) {
		int var2 = MoveSpeed.field8318.field8313;
		int var3 = 0;
		if (arg0.field10429 > field10903) {
			method14296(arg0);
		} else if (arg0.field10399 >= field10903) {
			method5120(arg0);
		} else {
			method15071(arg0, arg1);
			var2 = Statics.field1891;
			var3 = Statics.field1797;
		}
		Vector3 var4 = arg0.method10536().field4298;
		if ((int) var4.field4308 < 512 || (int) var4.field4313 < 512 || (int) var4.field4308 >= (world.method7728() - 1) * 512 || (int) var4.field4313 >= (world.method7758() - 1) * 512) {
			arg0.field10454.method14362(-1);
			for (int var5 = 0; var5 < arg0.field10422.length; var5++) {
				arg0.field10422[var5].field6657 = -1;
				arg0.field10422[var5].field6659.method14362(-1);
			}
			arg0.field10427 = null;
			arg0.field10429 = 0;
			arg0.field10399 = 0;
			var2 = MoveSpeed.field8318.field8313;
			var3 = 0;
			arg0.method10538((float) (arg0.field10450[0] * 512 + arg0.method16546() * 256), var4.field4311, (float) (arg0.field10448[0] * 512 + arg0.method16546() * 256));
			arg0.method16517();
		}
		if (Statics.field4490 == arg0 && ((int) var4.field4308 < 6144 || (int) var4.field4313 < 6144 || (int) var4.field4308 >= (world.method7728() - 12) * 512 || (int) var4.field4313 >= (world.method7758() - 12) * 512)) {
			arg0.field10454.method14362(-1);
			for (int var6 = 0; var6 < arg0.field10422.length; var6++) {
				arg0.field10422[var6].field6657 = -1;
				arg0.field10422[var6].field6659.method14362(-1);
			}
			arg0.field10427 = null;
			arg0.field10429 = 0;
			arg0.field10399 = 0;
			var2 = MoveSpeed.field8318.field8313;
			var3 = 0;
			arg0.method10538((float) (arg0.field10450[0] * 512 + arg0.method16546() * 256), var4.field4311, (float) (arg0.field10448[0] * 512 + arg0.method16546() * 256));
			arg0.method16517();
		}
		int var7 = method14063(arg0);
		method10222(arg0);
		method7326(arg0, var2, var3, var7);
		method8354(arg0, var2);
		method14988(arg0);
		class421 var8 = class421.method6469();
		var8.method6415(Trig1.method6277(arg0.field10395.method316()), Trig1.method6277(arg0.field10413.method316()), Trig1.method6277(arg0.field10447.method316()));
		arg0.method10556(var8);
		var8.method6407();
	}

	@ObfuscatedName("aar.gw(Lahm;S)V")
	public static final void method14296(PathingEntity arg0) {
		int var1 = arg0.field10429 - field10903;
		int var2 = arg0.field10423 * 512 + arg0.method16546() * 256;
		int var3 = arg0.field10425 * 512 + arg0.method16546() * 256;
		int var4 = method3660(var2, var3, arg0.field10419);
		Vector3 var5 = arg0.method10536().field4298;
		arg0.method10538((float) ((var2 - (int) var5.field4308) / var1 + (int) var5.field4308), (float) ((var4 - (int) var5.field4311) / var1 + (int) var5.field4311), (float) ((var3 - (int) var5.field4313) / var1 + (int) var5.field4313));
		arg0.field10453 = 0;
		arg0.method16490(arg0.field10431);
	}

	@ObfuscatedName("kw.gd(Lahm;I)V")
	public static final void method5120(PathingEntity arg0) {
		class721 var1 = arg0.field10454;
		if (arg0.field10399 == field10903 || !var1.method14346() || var1.method14369(1)) {
			int var2 = arg0.field10399 - arg0.field10429;
			int var3 = field10903 - arg0.field10429;
			int var4 = arg0.field10423 * 512 + arg0.method16546() * 256;
			int var5 = arg0.field10425 * 512 + arg0.method16546() * 256;
			int var6 = arg0.field10457 * 512 + arg0.method16546() * 256;
			int var7 = arg0.field10426 * 512 + arg0.method16546() * 256;
			int var8 = ((var2 - var3) * var4 + var3 * var6) / var2;
			int var9 = ((var2 - var3) * var5 + var3 * var7) / var2;
			int var10 = method3660(var8, var9, arg0.field10419);
			int var11 = method3660(var6, var7, arg0.field10428);
			int var12 = ((var2 - var3) * var10 + var3 * var11) / var2;
			arg0.method10538((float) var8, (float) var12, (float) var9);
		}
		arg0.field10453 = 0;
		arg0.method16491(arg0.field10431, false);
	}

	@ObfuscatedName("aco.gz(Lahm;ZI)V")
	public static final void method15071(PathingEntity arg0, boolean arg1) {
		BASType var2 = arg0.method16508();
		if (arg0.field10400 == 0) {
			arg0.field10453 = 0;
			Statics.field1891 = MoveSpeed.field8318.field8313;
			Statics.field1797 = 0;
			return;
		}
		if (arg0.field10454.method14346() && !arg0.field10454.method14355()) {
			SeqType var3 = arg0.field10454.method14347();
			if (arg0.field10396 > 0 && var3.field1767 == 0) {
				arg0.field10453++;
				Statics.field1891 = MoveSpeed.field8318.field8313;
				Statics.field1797 = 0;
				return;
			}
			if (arg0.field10396 <= 0 && var3.field1782 == 0) {
				arg0.field10453++;
				Statics.field1891 = MoveSpeed.field8318.field8313;
				Statics.field1797 = 0;
				return;
			}
		}
		for (int var4 = 0; var4 < arg0.field10422.length; var4++) {
			if (arg0.field10422[var4].field6657 != -1 && arg0.field10422[var4].field6659.method14355()) {
				EffectAnimType var5 = (EffectAnimType) Statics.field4874.get(arg0.field10422[var4].field6657);
				if (var5.field8261 && var5.field8260 != -1) {
					SeqType var6 = (SeqType) Statics.field8797.get(var5.field8260);
					if (arg0.field10396 > 0 && var6.field1767 == 0) {
						arg0.field10453++;
						Statics.field1891 = MoveSpeed.field8318.field8313;
						Statics.field1797 = 0;
						return;
					}
					if (arg0.field10396 <= 0 && var6.field1782 == 0) {
						arg0.field10453++;
						Statics.field1891 = MoveSpeed.field8318.field8313;
						Statics.field1797 = 0;
						return;
					}
				}
			}
		}
		Vector3 var7 = Vector3.method6484(arg0.method10536().field4298);
		int var8 = (int) var7.field4308;
		int var9 = (int) var7.field4313;
		int var10 = arg0.field10450[arg0.field10400 - 1] * 512 + arg0.method16546() * 256;
		int var11 = arg0.field10448[arg0.field10400 - 1] * 512 + arg0.method16546() * 256;
		if (var8 < var10) {
			if (var9 < var11) {
				arg0.method16490(10240);
			} else if (var9 > var11) {
				arg0.method16490(14336);
			} else {
				arg0.method16490(12288);
			}
		} else if (var8 > var10) {
			if (var9 < var11) {
				arg0.method16490(6144);
			} else if (var9 > var11) {
				arg0.method16490(2048);
			} else {
				arg0.method16490(4096);
			}
		} else if (var9 < var11) {
			arg0.method16490(8192);
		} else if (var9 > var11) {
			arg0.method16490(0);
		}
		byte var12 = arg0.field10441[arg0.field10400 - 1];
		if (!arg1 && (var10 - var8 > 1024 || var10 - var8 < -1024 || var11 - var9 > 1024 || var11 - var9 < -1024)) {
			arg0.method10538((float) var10, var7.field4311, (float) var11);
			arg0.method16491(arg0.field10414, false);
			arg0.field10400--;
			if (arg0.field10396 > 0) {
				arg0.field10396--;
			}
			Statics.field1891 = MoveSpeed.field8318.field8313;
			Statics.field1797 = 0;
			var7.method6486();
			return;
		}
		int var13 = 16;
		boolean var14 = true;
		if (arg0 instanceof NpcEntity) {
			var14 = ((NpcEntity) arg0).field12083.field2736;
		}
		if (var14) {
			int var15 = arg0.field10414 - arg0.field10395.field528;
			if (var15 != 0 && arg0.field10417 == -1 && arg0.field10444 != 0) {
				var13 = 8;
			}
			if (!arg1 && arg0.field10400 > 2) {
				var13 = 24;
			}
			if (!arg1 && arg0.field10400 > 3) {
				var13 = 32;
			}
		} else {
			if (!arg1 && arg0.field10400 > 1) {
				var13 = 24;
			}
			if (!arg1 && arg0.field10400 > 2) {
				var13 = 32;
			}
		}
		if (arg0.field10453 > 0 && arg0.field10400 > 1) {
			var13 = 32;
			arg0.field10453--;
		}
		if (MoveSpeed.field8316.field8313 == var12) {
			var13 <<= 0x1;
		} else if (MoveSpeed.field8314.field8313 == var12) {
			var13 >>= 0x1;
		}
		if (var2.field7359 != -1) {
			int var16 = var13 << 9;
			if (arg0.field10400 == 1) {
				int var17 = arg0.field10455 * arg0.field10455;
				int var18 = ((int) var7.field4308 > var10 ? (int) var7.field4308 - var10 : var10 - (int) var7.field4308) << 9;
				int var19 = ((int) var7.field4313 > var11 ? (int) var7.field4313 - var11 : var11 - (int) var7.field4313) << 9;
				int var20 = var18 > var19 ? var18 : var19;
				int var21 = var2.field7359 * 2 * var20;
				if (var17 > var21) {
					arg0.field10455 /= 2;
				} else if (var17 / 2 > var20) {
					arg0.field10455 -= var2.field7359;
					if (arg0.field10455 < 0) {
						arg0.field10455 = 0;
					}
				} else if (arg0.field10455 < var16) {
					arg0.field10455 += var2.field7359;
					if (arg0.field10455 > var16) {
						arg0.field10455 = var16;
					}
				}
			} else if (arg0.field10455 < var16) {
				arg0.field10455 += var2.field7359;
				if (arg0.field10455 > var16) {
					arg0.field10455 = var16;
				}
			} else if (arg0.field10455 > 0) {
				arg0.field10455 -= var2.field7359;
				if (arg0.field10455 < 0) {
					arg0.field10455 = 0;
				}
			}
			var13 = arg0.field10455 >> 9;
			if (var13 < 1) {
				var13 = 1;
			}
		}
		Statics.field1797 = 0;
		if (var8 == var10 && var9 == var11) {
			Statics.field1891 = MoveSpeed.field8318.field8313;
		} else {
			if (var8 < var10) {
				var7.field4308 += var13;
				Statics.field1797 |= 0x4;
				if (var7.field4308 > (float) var10) {
					var7.field4308 = var10;
				}
			} else if (var8 > var10) {
				var7.field4308 -= var13;
				Statics.field1797 |= 0x8;
				if (var7.field4308 < (float) var10) {
					var7.field4308 = var10;
				}
			}
			if (var9 < var11) {
				var7.field4313 += var13;
				Statics.field1797 |= 0x1;
				if (var7.field4313 > (float) var11) {
					var7.field4313 = var11;
				}
			} else if (var9 > var11) {
				var7.field4313 -= var13;
				Statics.field1797 |= 0x2;
				if (var7.field4313 < (float) var11) {
					var7.field4313 = var11;
				}
			}
			arg0.method10531(var7);
			if (var13 >= 32) {
				Statics.field1891 = MoveSpeed.field8316.field8313;
			} else {
				Statics.field1891 = var12;
			}
		}
		if ((int) var7.field4308 == var10 && (int) var7.field4313 == var11) {
			arg0.field10400--;
			if (arg0.field10396 > 0) {
				arg0.field10396--;
			}
		}
		var7.method6486();
	}

	@ObfuscatedName("zx.gb(Lahm;B)I")
	public static final int method14063(PathingEntity arg0) {
		if (arg0.field10444 == 0) {
			return 0;
		}
		if (arg0.field10417 != -1) {
			PathingEntity var1 = null;
			if (arg0.field10417 < 32768) {
				ObjectWrapper var2 = (ObjectWrapper) field10838.method14495((long) arg0.field10417);
				if (var2 != null) {
					var1 = (PathingEntity) var2.field11436;
				}
			} else if (arg0.field10417 >= 32768) {
				var1 = field10944[arg0.field10417 - 32768];
			}
			if (var1 != null) {
				Vector3 var3 = Vector3.method6528(arg0.method10536().field4298, var1.method10536().field4298);
				int var4 = (int) var3.field4308;
				int var5 = (int) var3.field4313;
				if (var4 != 0 || var5 != 0) {
					arg0.method16490((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof PlayerEntity) {
			PlayerEntity var6 = (PlayerEntity) arg0;
			if (var6.field12056 != -1 && (var6.field10400 == 0 || var6.field10453 > 0)) {
				var6.method16490(var6.field12056);
				var6.field12056 = -1;
			}
		} else if (arg0 instanceof NpcEntity) {
			NpcEntity var7 = (NpcEntity) arg0;
			if (var7.field12074 != -1 && (var7.field10400 == 0 || var7.field10453 > 0)) {
				Vector3 var8 = var7.method10536().field4298;
				CoordGrid var9 = world.method7727();
				int var10 = (int) var8.field4308 - (var7.field12074 * 256 - var9.field7426 * 256 - var9.field7426 * 256);
				int var11 = (int) var8.field4313 - (var7.field12075 * 256 - var9.field7427 * 256 - var9.field7427 * 256);
				if (var10 != 0 || var11 != 0) {
					var7.method16490((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
				}
				var7.field12074 = -1;
			}
		}
		return arg0.method16539();
	}

	@ObfuscatedName("xs.gi(Lahm;I)V")
	public static final void method10222(PathingEntity arg0) {
		if (arg0.field10418 == null && arg0.field10442 == null) {
			return;
		}
		boolean var1 = true;
		CoordGrid var2 = world.method7727();
		for (int var3 = 0; var3 < arg0.field10418.length; var3++) {
			int var4 = -1;
			if (arg0.field10418 != null) {
				var4 = arg0.field10418[var3];
			}
			if (var4 != -1) {
				var1 = false;
				boolean var5 = false;
				boolean var6 = false;
				Vector3 var7 = arg0.method10536().field4298;
				int var11;
				int var12;
				if ((var4 & -1073741824) == -1073741824) {
					int var8 = var4 & 0xFFFFFFF;
					int var9 = var8 >> 14;
					int var10 = var8 & 0x3FFF;
					var11 = (int) var7.field4308 - ((var9 - var2.field7426) * 512 + 256);
					var12 = (int) var7.field4313 - ((var10 - var2.field7427) * 512 + 256);
				} else if ((var4 & 0x8000) == 0) {
					ObjectWrapper var16 = (ObjectWrapper) field10838.method14495((long) var4);
					if (var16 == null) {
						arg0.method16583(var3, -1);
						continue;
					}
					NpcEntity var17 = (NpcEntity) var16.field11436;
					Vector3 var18 = var17.method10536().field4298;
					var11 = (int) var7.field4308 - (int) var18.field4308;
					var12 = (int) var7.field4313 - (int) var18.field4313;
				} else {
					int var13 = var4 & 0x7FFF;
					PlayerEntity var14 = field10944[var13];
					if (var14 == null) {
						arg0.method16583(var3, -1);
						continue;
					}
					Vector3 var15 = var14.method10536().field4298;
					var11 = (int) var7.field4308 - (int) var15.field4308;
					var12 = (int) var7.field4313 - (int) var15.field4313;
				}
				if (var11 != 0 || var12 != 0) {
					arg0.method16583(var3, (int) (Math.atan2((double) var11, (double) var12) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method16583(var3, -1)) {
				var1 = false;
			}
		}
		if (var1) {
			arg0.field10418 = null;
			arg0.field10442 = null;
		}
	}

	@ObfuscatedName("sj.hm(Lahm;IB)V")
	public static void method8354(PathingEntity arg0, int arg1) {
		if (arg0.field10427 == null) {
			return;
		}
		MoveSpeed var2 = (MoveSpeed) class686.method1897(MoveSpeed.method13901(), arg1);
		int var3 = arg0.field10427[var2.method13906()];
		if (var3 != arg0.field10454.method14348()) {
			arg0.field10454.method14350(var3, arg0.field10454.method14398());
			arg0.field10396 = arg0.field10400;
		}
	}

	@ObfuscatedName("qf.ha(Lahm;IIII)V")
	public static void method7326(PathingEntity arg0, int arg1, int arg2, int arg3) {
		BASType var4 = arg0.method16508();
		class1075 var5 = arg0.field10432;
		int var6 = arg0.field10414 - arg0.field10395.field528 & 0x3FFF;
		if (MoveSpeed.field8318.field8313 == arg1) {
			if (var6 == 0 && arg0.field10443 <= 25) {
				if (!var5.field11877 || !var4.method9290(var5.method14348())) {
					var5.method14352(var4.method9295(), false, true);
					var5.field11877 = var5.method14346();
				}
			} else if (arg3 < 0 && var4.field7322 != -1) {
				var5.method14352(var4.field7322, false, true);
				var5.field11877 = false;
			} else if (arg3 > 0 && var4.field7354 != -1) {
				var5.method14352(var4.field7354, false, true);
				var5.field11877 = false;
			} else if (!var5.field11877 || !var4.method9290(var5.method14348())) {
				var5.method14352(var4.method9295(), false, true);
				var5.field11877 = arg0.field10432.method14346();
			}
		} else if (arg0.field10417 != -1 && (var6 >= 10240 || var6 <= 2048)) {
			int var7 = field10823[arg2] - arg0.field10395.field528 & 0x3FFF;
			if (MoveSpeed.field8316.field8313 == arg1 && var4.field7361 != -1) {
				if (var7 > 2048 && var7 <= 6144 && var4.field7331 != -1) {
					var5.method14352(var4.field7331, false, true);
				} else if (var7 >= 10240 && var7 < 14336 && var4.field7330 != -1) {
					var5.method14352(var4.field7330, false, true);
				} else if (var7 <= 6144 || var7 >= 10240 || var4.field7329 == -1) {
					var5.method14352(var4.field7361, false, true);
				} else {
					var5.method14352(var4.field7329, false, true);
				}
			} else if (MoveSpeed.field8314.field8313 == arg1 && var4.field7332 != -1) {
				if (var7 > 2048 && var7 <= 6144 && var4.field7319 != -1) {
					var5.method14352(var4.field7319, false, true);
				} else if (var7 >= 10240 && var7 < 14336 && var4.field7328 != -1) {
					var5.method14352(var4.field7328, false, true);
				} else if (var7 <= 6144 || var7 >= 10240 || var4.field7333 == -1) {
					var5.method14352(var4.field7332, false, true);
				} else {
					var5.method14352(var4.field7333, false, true);
				}
			} else if (var7 > 2048 && var7 <= 6144 && var4.field7351 != -1) {
				var5.method14352(var4.field7351, false, true);
			} else if (var7 >= 10240 && var7 < 14336 && var4.field7326 != -1) {
				var5.method14352(var4.field7326, false, true);
			} else if (var7 <= 6144 || var7 >= 10240 || var4.field7325 == -1) {
				var5.method14352(var4.field7350, false, true);
			} else {
				var5.method14352(var4.field7325, false, true);
			}
			var5.field11877 = false;
		} else if (var6 == 0 && arg0.field10443 <= 25) {
			if (MoveSpeed.field8316.field8313 == arg1 && var4.field7361 != -1) {
				var5.method14352(var4.field7361, false, true);
			} else if (MoveSpeed.field8314.field8313 == arg1 && var4.field7332 != -1) {
				var5.method14352(var4.field7332, false, true);
			} else {
				var5.method14352(var4.field7350, false, true);
			}
			var5.field11877 = false;
		} else {
			if (MoveSpeed.field8316.field8313 == arg1 && var4.field7361 != -1) {
				if (arg3 < 0 && var4.field7338 != -1) {
					var5.method14352(var4.field7338, false, true);
				} else if (arg3 <= 0 || var4.field7339 == -1) {
					var5.method14352(var4.field7361, false, true);
				} else {
					var5.method14352(var4.field7339, false, true);
				}
			} else if (MoveSpeed.field8314.field8313 == arg1 && var4.field7332 != -1) {
				if (arg3 < 0 && var4.field7352 != -1) {
					var5.method14352(var4.field7352, false, true);
				} else if (arg3 <= 0 || var4.field7337 == -1) {
					var5.method14352(var4.field7332, false, true);
				} else {
					var5.method14352(var4.field7337, false, true);
				}
			} else if (arg3 < 0 && var4.field7320 != -1) {
				var5.method14352(var4.field7320, false, true);
			} else if (arg3 <= 0 || var4.field7341 == -1) {
				var5.method14352(var4.field7350, false, true);
			} else {
				var5.method14352(var4.field7341, false, true);
			}
			var5.field11877 = false;
		}
	}

	@ObfuscatedName("ach.hk(Lahm;I)V")
	public static final void method14988(PathingEntity arg0) {
		class1075 var1 = arg0.field10432;
		if (var1.method14346() && var1.method14367(1) && var1.method14375()) {
			if (var1.field11877) {
				var1.method14352(arg0.method16508().method9295(), false, true);
				var1.field11877 = var1.method14346();
			}
			var1.method14364();
		}
		for (int var2 = 0; var2 < arg0.field10422.length; var2++) {
			if (arg0.field10422[var2].field6657 != -1) {
				class721 var3 = arg0.field10422[var2].field6659;
				if (var3.method14355()) {
					EffectAnimType var4 = (EffectAnimType) Statics.field4874.get(arg0.field10422[var2].field6657);
					SeqType var5 = var3.method14347();
					if (var4.field8261) {
						if (var5.field1767 == 3) {
							if (arg0.field10396 > 0 && arg0.field10429 <= field10903 && arg0.field10399 < field10903) {
								var3.method14362(-1);
								arg0.field10422[var2].field6657 = -1;
								continue;
							}
						} else if (var5.field1767 == 1 && arg0.field10396 > 0 && arg0.field10429 <= field10903 && arg0.field10399 < field10903) {
							continue;
						}
					}
				}
				if (var3.method14367(1) && var3.method14375()) {
					var3.method14362(-1);
					arg0.field10422[var2].field6657 = -1;
				}
			}
		}
		class721 var6 = arg0.field10454;
		if (var6.method14346()) {
			label84: {
				SeqType var7 = var6.method14347();
				if (var7.field1767 == 3) {
					if (arg0.field10396 > 0 && arg0.field10429 <= field10903 && arg0.field10399 < field10903) {
						arg0.field10427 = null;
						var6.method14362(-1);
						break label84;
					}
				} else if (var7.field1767 == 1) {
					if (arg0.field10396 > 0 && arg0.field10429 <= field10903 && arg0.field10399 < field10903) {
						var6.method14357(1);
						break label84;
					}
					var6.method14357(0);
				}
				if (var6.method14367(1) && var6.method14375()) {
					arg0.field10427 = null;
					var6.method14362(-1);
				}
			}
		}
		for (int var8 = 0; var8 < arg0.field10398.length; var8++) {
			class1204 var9 = arg0.field10398[var8];
			if (var9 != null) {
				if (var9.field12481 > 0) {
					var9.field12481--;
				} else if (var9.method14367(1) && var9.method14375()) {
					arg0.field10398[var8] = null;
				}
			}
		}
	}

	@ObfuscatedName("aht.hu(Lahm;[I[I[IS)V")
	public static void method16758(PathingEntity arg0, int[] arg1, int[] arg2, int[] arg3) {
		for (int var4 = 0; var4 < arg1.length; var4++) {
			int var5 = arg1[var4];
			int var6 = arg3[var4];
			int var7 = arg2[var4];
			int var8 = 0;
			while (var6 != 0 && var8 < arg0.field10398.length) {
				if ((var6 & 0x1) != 0) {
					if (var5 == -1) {
						arg0.field10398[var8] = null;
					} else {
						SeqType var9 = (SeqType) Statics.field8797.get(var5);
						int var10 = var9.field1768;
						class1204 var11 = arg0.field10398[var8];
						if (var11 != null && var11.method14346()) {
							if (var5 == var11.method14348()) {
								if (var10 == 0) {
									arg0.field10398[var8] = null;
									var11 = null;
								} else if (var10 == 1) {
									var11.method14364();
									var11.field12481 = var7;
								} else if (var10 == 2) {
									var11.method14422();
								}
							} else if (var9.field1779 >= var11.method14347().field1779) {
								arg0.field10398[var8] = null;
								var11 = null;
							}
						}
						if (var11 == null || !var11.method14346()) {
							class1204 var12 = arg0.field10398[var8] = new class1204(arg0);
							var12.method14362(var5);
							var12.field12481 = var7;
						}
					}
				}
				var8++;
				var6 >>>= 0x1;
			}
		}
	}

	@ObfuscatedName("yo.hb(B)V")
	public static final void method10376() {
		class633.method6866(Statics.field8198, (long) field10903);
		if (field10978 != -1) {
			method14428(field10978);
		}
		for (int var0 = 0; var0 < field11051; var0++) {
			field10911[var0] = field11072[var0];
			field11072[var0] = false;
		}
		field11037 = field10903;
		if (field10978 != -1) {
			field11051 = 0;
			method15281();
		}
		Statics.field8198.method2167();
		MiniMenu.method7316(Statics.field8198);
		int var1 = MiniMenu.method895();
		if (var1 == -1) {
			var1 = field10970;
		}
		if (var1 == -1) {
			var1 = field11038;
		}
		method10615(var1);
		field10891 = 0;
	}

	@ObfuscatedName("alf.hg(J)V")
	public static final void method18329(long arg0) {
		if (world.method7743() != null) {
			if (Statics.field3416 == 2 || Statics.field3416 == 1) {
				method614(arg0);
			} else if (Statics.field3416 == 4) {
				method3093(arg0);
			}
		}
		class633.method6866(Statics.field8198, (long) field10903);
		if (field10978 != -1) {
			method14428(field10978);
		}
		for (int var2 = 0; var2 < field11051; var2++) {
			field10911[var2] = field11072[var2];
			field11072[var2] = false;
		}
		field11037 = field10903;
		MiniMenu.method6967(-1, -1);
		if (field10978 != -1) {
			field11051 = 0;
			method15281();
		}
		Statics.field8198.method2167();
		MiniMenu.method7316(Statics.field8198);
		int var3 = MiniMenu.method895();
		if (var3 == -1) {
			var3 = field10970;
		}
		if (var3 == -1) {
			var3 = field11038;
		}
		method10615(var3);
		int var4 = Statics.field4490.method16546() << 8;
		Vector3 var5 = Statics.field4490.method10536().field4298;
		class975.method16460(Statics.field4490.field11717, (int) var5.field4308 + var4, (int) var5.field4313 + var4, field10891);
		field10891 = 0;
	}

	@ObfuscatedName("dy.hd(IIIIZI)V")
	public static final void method2104(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (world.method7743() == null) {
			Statics.field8198.method2301(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		Vector3 var5 = Statics.field4490.method10536().field4298;
		boolean var6 = false;
		if (field10863 == 3) {
			if ((int) var5.field4308 < 0 || (int) var5.field4308 >= world.method7728() * 512 || (int) var5.field4313 < 0 || (int) var5.field4313 >= world.method7758() * 512) {
				var6 = true;
			}
			if (Statics.field3416 == 3 && !Statics.field9155.method4744()) {
				var6 = true;
			}
		} else if (!field10877) {
			var6 = true;
		}
		if (var6) {
			Statics.field8198.method2301(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		field10916++;
		if (Statics.field4490 != null && (int) var5.field4308 - (Statics.field4490.method16546() - 1) * 256 >> 9 == class42.field731 && (int) var5.field4313 - (Statics.field4490.method16546() - 1) * 256 >> 9 == class42.field718) {
			class42.field731 = -1;
			class42.field718 = -1;
			DelayedStateChange.method14036();
		}
		method8193();
		if (!arg4) {
			method5180();
		}
		method3597();
		for (int var7 = 0; var7 < field10931.length; var7++) {
			if (field10931[var7] != null && !field10931[var7].method8407() && field10931[var7].method8408(Statics.field8198)) {
				field10931[var7].method8412(world.method7743());
			}
		}
		method13981(arg0, arg1, arg2, arg3, true);
		int var8 = field10780;
		int var9 = field11075;
		int var10 = field11076;
		int var11 = field11077;
		MiniMenu.method6967(var8, var9);
		if (Statics.field3416 == 2) {
			int var12 = (int) field11004;
			if (field10806 >> 8 > var12) {
				var12 = field10806 >> 8;
			}
			if (field10983[4] && field11063[4] + 128 > var12) {
				var12 = field11063[4] + 128;
			}
			int var13 = field10861 + (int) field10895 & 0x3FFF;
			method14042(Statics.field8910, method3660((int) var5.field4308, (int) var5.field4313, Statics.field4826) - field10901, Statics.field3569, var12, var13, (var12 >> 3) * 3 + 600 << 2, var11);
		} else if (Statics.field3416 == 4) {
			int var14 = (int) field11004;
			if (field10806 >> 8 > var14) {
				var14 = field10806 >> 8;
			}
			if (field10983[4] && field11063[4] + 128 > var14) {
				var14 = field11063[4] + 128;
			}
			int var15 = (int) field10895 & 0x3FFF;
			method14042(Statics.field8910, method3660(field10892, field10893, Statics.field4826) - field10901, Statics.field3569, var14, var15, (var14 >> 3) * 3 + 600 << 2, var11);
		} else if (Statics.field3416 == 1) {
			method10490(var11);
		}
		int var16 = Statics.field7956;
		int var17 = Statics.field10518;
		int var18 = Statics.field1881;
		int var19 = Statics.field7447;
		int var20 = Statics.field8586;
		for (int var21 = 0; var21 < 5; var21++) {
			if (field10983[var21]) {
				int var22 = (int) (Math.random() * (double) (field11062[var21] * 2 + 1) - (double) field11062[var21] + Math.sin((double) field11064[var21] / 100.0D * (double) field10996[var21]) * (double) field11063[var21]);
				if (var21 == 0) {
					Statics.field7956 += var22 << 2;
				}
				if (var21 == 1) {
					Statics.field10518 += var22 << 2;
				}
				if (var21 == 2) {
					Statics.field1881 += var22 << 2;
				}
				if (var21 == 3) {
					Statics.field8586 = Statics.field8586 + var22 & 0x3FFF;
				}
				if (var21 == 4) {
					Statics.field7447 += var22;
					if (Statics.field7447 < 1024) {
						Statics.field7447 = 1024;
					} else if (Statics.field7447 > 3072) {
						Statics.field7447 = 3072;
					}
				}
			}
		}
		if (Statics.field7956 < 0) {
			Statics.field7956 = 0;
		}
		if (Statics.field7956 > (world.method7743().field6910 << 9) - 1) {
			Statics.field7956 = (world.method7743().field6910 << 9) - 1;
		}
		if (Statics.field1881 < 0) {
			Statics.field1881 = 0;
		}
		if (Statics.field1881 > (world.method7743().field6911 << 9) - 1) {
			Statics.field1881 = (world.method7743().field6911 << 9) - 1;
		}
		if (Statics.field688.removeRoofs2.method18496() == 2) {
			method16610();
		} else if (Statics.field688.removeRoofs2.method18496() == 3) {
			method2671();
		}
		Statics.field8198.method2164(var8, var9, var10, var11);
		Statics.field8198.method2170(true);
		Statics.field8198.method2168(var8, var9, var8 + var10, var9 + var11);
		class637 var23 = world.method7816().method9982();
		int var24 = var23.method10073();
		class270 var25 = new class270();
		CoordGrid var26 = world.method7727();
		if (class29.method2978()) {
			Statics.field604.method4707(var25, field10793, field10792, var26.field7426 << 9, var26.field7427 << 9);
		} else if (Statics.field3416 == 3) {
			Statics.field9155.method4707(var25, field10793, field10792, var26.field7426 << 9, var26.field7427 << 9);
		} else {
			field10793.method6313((float) -Statics.field7956, (float) -Statics.field10518, (float) -Statics.field1881);
			field10793.method6307(0.0F, -1.0F, 0.0F, Trig1.method6277(-Statics.field8586 & 0x3FFF));
			field10793.method6307(-1.0F, 0.0F, 0.0F, Trig1.method6277(-Statics.field7447 & 0x3FFF));
			field10793.method6307(0.0F, 0.0F, -1.0F, Trig1.method6277(-Statics.field2656 & 0x3FFF));
			method15141(field10792, true, (float) (var10 / 2), (float) (var11 / 2), (float) (field11078 << 1), (float) (field11078 << 1), var10, var11);
		}
		Statics.field8198.method2217(field10793);
		Statics.field8198.method2220(field10792);
		if (var23.method10074() == null) {
			Statics.field8198.method2475(3, var24);
		} else {
			Statics.field8198.method2222(1.0F);
			Statics.field8198.method2223(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Statics.field3416 == 3) {
				int var27 = (int) ((double) Statics.field9155.method4718() * 2607.5945876176133D);
				int var28 = (int) ((double) Statics.field9155.method4719() * 2607.5945876176133D);
				var23.method10074().method7946(Statics.field8198, Statics.field3023 << 3, var8, var9, var10, var11, var27, var28, 0, var24, true, false);
			} else {
				var23.method10074().method7946(Statics.field8198, Statics.field3023 << 3, var8, var9, var10, var11, Statics.field7447, Statics.field8586, Statics.field2656, var24, true, false);
			}
			Statics.field8198.method2202();
		}
		Statics.field8198.method2170(false);
		MiniMenu.method5928(field10793, field10792, var10, var11);
		world.method7816().method10003(world);
		int var29 = Statics.field688.removeRoofs2.method18496();
		byte var30;
		if (var29 == 2) {
			var30 = (byte) field10916;
		} else if (var29 == 3) {
			var30 = (byte) (field11096 ? 1 : -1);
		} else {
			var30 = 1;
		}
		if (class29.method2978() || Statics.field3416 == 3) {
			world.method7743().method8845(field10903, var25.field2835, var25.field2836, var25.field2837, world.method7742(), field11061, field10933, field10934, field10935, field10820, Statics.field4490.field11717 + 1, var30, (int) var5.field4308 >> 9, (int) var5.field4313 >> 9, Statics.field688.flickeringEffects.method18419() == 0, true, 0, true);
		} else {
			world.method7743().method8845(field10903, Statics.field7956, Statics.field10518, Statics.field1881, world.method7742(), field11061, field10933, field10934, field10935, field10820, Statics.field4490.field11717 + 1, var30, (int) var5.field4308 >> 9, (int) var5.field4313 >> 9, Statics.field688.flickeringEffects.method18419() == 0, true, 0, true);
		}
		field10915++;
		if (!Statics.field8198.method2234() && state == 18) {
			method8275(var8, var9, var10, var11);
		}
		world.method7743().method8723();
		Statics.field7956 = var16;
		Statics.field10518 = var17;
		Statics.field1881 = var18;
		Statics.field7447 = var19;
		Statics.field8586 = var20;
		if (field11023 && Statics.field4489.method7021() == 0) {
			field11023 = false;
		}
		if (field11023) {
			Statics.field8198.method2301(var8, var9, var10, var11, -16777216);
			MessageBox.method649(LocalisedText.LOADING.method15021(Statics.field1680), false, Statics.field8198, Statics.field9184, Statics.field2657);
		}
		method15141(field10792, false, (float) (var10 / 2 + var8), (float) (var11 / 2 + var9), (float) (field11078 << 1), (float) (field11078 << 1), var10, var11);
		Statics.field8198.method2220(field10792);
		MiniMenu.method9927(field10792);
	}

	@ObfuscatedName("zm.hx(IIIIZI)V")
	public static final void method13981(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		int var5 = arg3 - 334;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 > 100) {
			var5 = 100;
		}
		int var6 = (field10987 - field11066) * var5 / 100 + field11066;
		int var7 = arg3 * var6 * 512 / (arg2 * 334);
		if (var7 < field10900) {
			short var8 = field10900;
			var6 = arg2 * var8 * 334 / (arg3 * 512);
			if (var6 > field11071) {
				var6 = field11071;
				int var9 = arg3 * var6 * 512 / (var8 * 334);
				int var10 = (arg2 - var9) / 2;
				if (arg4) {
					Statics.field8198.method2167();
					Statics.field8198.method2301(arg0, arg1, var10, arg3, -16777216);
					Statics.field8198.method2301(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
				}
				arg0 += var10;
				arg2 -= var10 * 2;
			}
		} else if (var7 > field10943) {
			short var11 = field10943;
			var6 = arg2 * var11 * 334 / (arg3 * 512);
			if (var6 < field11070) {
				var6 = field11070;
				int var12 = arg2 * var11 * 334 / (var6 * 512);
				int var13 = (arg3 - var12) / 2;
				if (arg4) {
					Statics.field8198.method2167();
					Statics.field8198.method2301(arg0, arg1, arg2, var13, -16777216);
					Statics.field8198.method2301(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
				}
				arg1 += var13;
				arg3 -= var13 * 2;
			}
		}
		field11078 = arg3 * var6 / 334;
		field10780 = arg0;
		field11075 = arg1;
		field11076 = (short) arg2;
		field11077 = (short) arg3;
	}

	@ObfuscatedName("ff.hq(I)V")
	public static final void method3128() {
		int var0 = Statics.field688.removeRoofs2.method18496();
		if (var0 == 0) {
			world.method7775(null);
			method818(0);
		} else if (var0 == 1 || var0 == 3) {
			method2835((byte) 0);
			method818(512);
			if (world.method7743() != null) {
				method2900();
			}
		} else {
			method2835((byte) (field10916 - 4 & 0xFF));
			method818(2);
		}
		field11046 = Statics.field4826;
	}

	@ObfuscatedName("eq.hf(BI)V")
	public static final void method2835(byte arg0) {
		byte[][][] var1 = world.method7742();
		if (var1 == null) {
			var1 = new byte[4][world.method7728()][world.method7758()];
			world.method7775(var1);
		}
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < world.method7728(); var3++) {
				for (int var4 = 0; var4 < world.method7758(); var4++) {
					var1[var2][var3][var4] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("ad.hr(IB)V")
	public static final void method818(int arg0) {
		field11061 = new int[arg0];
		field10933 = new int[arg0];
		field10934 = new int[arg0];
		field10935 = new int[arg0];
		field10820 = new int[arg0];
	}

	@ObfuscatedName("ew.hs(I)V")
	public static final void method2900() {
		int var0 = 0;
		Scene var1 = world.method7743();
		for (int var2 = 0; var2 < world.method7728(); var2++) {
			for (int var3 = 0; var3 < world.method7758(); var3++) {
				if (method7472(var1.field6928, var0, var2, var3, true)) {
					var0++;
				}
				if (var0 >= 512) {
					return;
				}
			}
		}
	}

	@ObfuscatedName("eo.hh(B)V")
	public static final void method2671() {
		field11096 = false;
		if (Statics.field4826 == 3) {
			return;
		}
		Vector3 var0 = Statics.field4490.method10536().field4298;
		LinkMap var1 = world.method7793();
		if (Statics.field3416 != 2 && Statics.field3416 != 3 && Statics.field810 == -1) {
			int var2 = method3660(Statics.field7956, Statics.field1881, Statics.field4826);
			if (var2 - Statics.field10518 < 3200 && (var1.field4487[Statics.field4826][Statics.field7956 >> 9][Statics.field1881 >> 9] & 0x4) != 0) {
				field11096 = true;
			}
			return;
		}
		CoordGrid var3 = world.method7727();
		int var5;
		int var6;
		if (Statics.field3416 == 3) {
			Vector3 var4 = Statics.field9155.method4797().method14135();
			if (Float.isNaN(var4.field4308)) {
				return;
			}
			var5 = (int) var4.field4308 - (var3.field7426 << 9);
			var6 = (int) var4.field4313 - (var3.field7427 << 9);
			if (var5 < 0 || var6 < 0 || var5 >> 9 >= var1.field4487[Statics.field4826].length || var6 >> 9 >= var1.field4487[Statics.field4826][var5 >> 9].length) {
				return;
			}
		} else if (Statics.field3416 == 2) {
			var5 = (int) var0.field4308;
			var6 = (int) var0.field4313;
		} else {
			var5 = Statics.field810;
			var6 = Statics.field3538;
		}
		if ((var1.field4487[Statics.field4826][var5 >> 9][var6 >> 9] & 0x4) != 0) {
			field11096 = true;
			return;
		}
		int var8;
		int var9;
		if (Statics.field3416 == 3) {
			Vector3 var7 = Statics.field9155.method4709().method5219();
			var8 = ((int) var7.field4308 >> 9) - var3.field7426;
			var9 = ((int) var7.field4313 >> 9) - var3.field7427;
			if (var8 < 0 || var9 < 0 || var8 >= var1.field4487[Statics.field4826].length || var9 >= var1.field4487[Statics.field4826][var8].length) {
				return;
			}
		} else {
			var8 = Statics.field7956 >> 9;
			var9 = Statics.field1881 >> 9;
		}
		int var10 = var5 >> 9;
		int var11 = var6 >> 9;
		if (var1.method7102(var8, var9)) {
			int var12 = method3660(Statics.field7956, Statics.field1881, 3);
			if (Statics.field10518 >= var12) {
				field11096 = true;
			}
			return;
		}
		if (Statics.field7447 >= 2560) {
			return;
		}
		int var13;
		if (var10 > var8) {
			var13 = var10 - var8;
		} else {
			var13 = var8 - var10;
		}
		int var14;
		if (var11 > var9) {
			var14 = var11 - var9;
		} else {
			var14 = var9 - var11;
		}
		if (var13 == 0 && var14 == 0 || var13 <= -world.method7728() || var13 >= world.method7728() || var14 <= -world.method7758() || var14 >= world.method7758()) {
			if (Statics.field3416 != 3) {
				JagException.method9845(var8 + TextUtil.COMMA + var9 + " " + var10 + TextUtil.COMMA + var11 + " " + var3.field7426 + TextUtil.COMMA + var3.field7427, new RuntimeException());
			}
			return;
		}
		if (var13 <= var14) {
			int var17 = var13 * 65536 / var14;
			int var18 = 32768;
			while (var9 != var11) {
				if (var9 < var11) {
					var9++;
				} else if (var9 > var11) {
					var9--;
				}
				if ((var1.field4487[Statics.field4826][var8][var9] & 0x4) != 0) {
					field11096 = true;
					return;
				}
				if (var8 + 1 < var1.field4487[Statics.field4826].length && (var1.field4487[Statics.field4826][var8 + 1][var9] & 0x4) != 0) {
					field11096 = true;
					return;
				}
				if (var8 > 0 && (var1.field4487[Statics.field4826][var8 - 1][var9] & 0x4) != 0) {
					field11096 = true;
					return;
				}
				var18 += var17;
				if (var18 >= 65536) {
					var18 -= 65536;
					if (var8 < var10) {
						var8++;
						if (var8 + 1 < var1.field4487[Statics.field4826].length && (var1.field4487[Statics.field4826][var8 + 1][var9] & 0x4) != 0) {
							field11096 = true;
							return;
						}
					} else if (var8 > var10) {
						var8--;
						if (var8 > 0 && (var1.field4487[Statics.field4826][var8 - 1][var9] & 0x4) != 0) {
							field11096 = true;
							return;
						}
					}
				}
			}
			return;
		}
		int var15 = var14 * 65536 / var13;
		int var16 = 32768;
		while (var8 != var10) {
			if (var8 < var10) {
				var8++;
			} else if (var8 > var10) {
				var8--;
			}
			if ((var1.field4487[Statics.field4826][var8][var9] & 0x4) != 0) {
				field11096 = true;
				return;
			}
			if (var9 + 1 < var1.field4487[Statics.field4826][var8].length && (var1.field4487[Statics.field4826][var8][var9 + 1] & 0x4) != 0) {
				field11096 = true;
				return;
			}
			if (var9 > 0 && (var1.field4487[Statics.field4826][var8][var9 - 1] & 0x4) != 0) {
				field11096 = true;
				return;
			}
			var16 += var15;
			if (var16 >= 65536) {
				var16 -= 65536;
				if (var9 < var11) {
					var9++;
					if (var9 + 1 < var1.field4487[Statics.field4826][var8].length && (var1.field4487[Statics.field4826][var8][var9 + 1] & 0x4) != 0) {
						field11096 = true;
						return;
					}
				} else if (var9 > var11) {
					var9--;
					if (var9 > 0 && (var1.field4487[Statics.field4826][var8][var9 - 1] & 0x4) != 0) {
						field11096 = true;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("ahj.hp(I)V")
	public static final void method16610() {
		byte[][][] var0 = world.method7742();
		byte var1 = (byte) (field10916 - 4 & 0xFF);
		int var2 = field10916 % world.method7728();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < world.method7758(); var4++) {
				var0[var3][var2][var4] = var1;
			}
		}
		if (Statics.field4826 == 3) {
			return;
		}
		for (int var5 = 0; var5 < 2; var5++) {
			field11061[var5] = -1000000;
			field10933[var5] = 1000000;
			field10934[var5] = 0;
			field10820[var5] = 1000000;
			field10935[var5] = 0;
		}
		Vector3 var6 = Statics.field4490.method10536().field4298;
		LinkMap var7 = world.method7793();
		Scene var8 = world.method7743();
		if (Statics.field3416 != 2 && Statics.field3416 != 3 && Statics.field810 == -1) {
			int var9 = method3660(Statics.field7956, Statics.field1881, Statics.field4826);
			if (var9 - Statics.field10518 < 3200 && (var7.field4487[Statics.field4826][Statics.field7956 >> 9][Statics.field1881 >> 9] & 0x4) != 0) {
				method7472(var8.field6928, 1, Statics.field7956 >> 9, Statics.field1881 >> 9, false);
			}
			return;
		}
		CoordGrid var10 = world.method7727();
		int var12;
		int var13;
		if (Statics.field3416 == 3) {
			Vector3 var11 = Statics.field9155.method4797().method14135();
			if (Float.isNaN(var11.field4308)) {
				return;
			}
			var12 = (int) var11.field4308 - (var10.field7426 << 9);
			var13 = (int) var11.field4313 - (var10.field7427 << 9);
			if (var12 < 0 || var13 < 0 || var12 >> 9 >= var7.field4487[Statics.field4826].length || var13 >> 9 >= var7.field4487[Statics.field4826][var12 >> 9].length) {
				return;
			}
		} else if (Statics.field3416 == 2) {
			var12 = (int) var6.field4308;
			var13 = (int) var6.field4313;
		} else {
			var12 = Statics.field810;
			var13 = Statics.field3538;
		}
		if ((var7.field4487[Statics.field4826][var12 >> 9][var13 >> 9] & 0x4) != 0) {
			method7472(var8.field6928, 0, var12 >> 9, var13 >> 9, false);
			return;
		}
		int var15;
		int var16;
		if (Statics.field3416 == 3) {
			Vector3 var14 = Statics.field9155.method4709().method5219();
			var15 = ((int) var14.field4308 >> 9) - var10.field7426;
			var16 = ((int) var14.field4313 >> 9) - var10.field7427;
			if (var15 < 0 || var16 < 0 || var15 >= var7.field4487[Statics.field4826].length || var16 >= var7.field4487[Statics.field4826][var15].length) {
				return;
			}
		} else {
			var15 = Statics.field7956 >> 9;
			var16 = Statics.field1881 >> 9;
		}
		int var17 = var12 >> 9;
		int var18 = var13 >> 9;
		if (var7.method7102(var15, var16)) {
			int var19 = method3660(Statics.field7956, Statics.field1881, 3);
			if (Statics.field10518 >= var19) {
				method7472(var8.field6928, 1, var15, var16, false);
			}
			return;
		}
		if (Statics.field7447 >= 2560) {
			return;
		}
		int var20;
		if (var17 > var15) {
			var20 = var17 - var15;
		} else {
			var20 = var15 - var17;
		}
		int var21;
		if (var18 > var16) {
			var21 = var18 - var16;
		} else {
			var21 = var16 - var18;
		}
		if ((var20 != 0 || var21 != 0) && var20 > -world.method7728() && var20 < world.method7728() && var21 > -world.method7758() && var21 < world.method7758()) {
			if (var20 <= var21) {
				int var24 = var20 * 65536 / var21;
				int var25 = 32768;
				while (var16 != var18) {
					if (var16 < var18) {
						var16++;
					} else if (var16 > var18) {
						var16--;
					}
					if ((var7.field4487[Statics.field4826][var15][var16] & 0x4) != 0) {
						method7472(var8.field6928, 1, var15, var16, false);
						return;
					}
					if (var15 + 1 < var7.field4487[Statics.field4826].length && (var7.field4487[Statics.field4826][var15 + 1][var16] & 0x4) != 0) {
						method7472(var8.field6928, 1, var15 + 1, var16, false);
						return;
					}
					if (var15 > 0 && (var7.field4487[Statics.field4826][var15 - 1][var16] & 0x4) != 0) {
						method7472(var8.field6928, 1, var15 - 1, var16, false);
						return;
					}
					var25 += var24;
					if (var25 >= 65536) {
						var25 -= 65536;
						if (var15 < var17) {
							var15++;
							if (var15 + 1 < var7.field4487[Statics.field4826].length && (var7.field4487[Statics.field4826][var15 + 1][var16] & 0x4) != 0) {
								method7472(var8.field6928, 1, var15 + 1, var16, false);
								return;
							}
						} else if (var15 > var17) {
							var15--;
							if (var15 > 0 && (var7.field4487[Statics.field4826][var15 - 1][var16] & 0x4) != 0) {
								method7472(var8.field6928, 1, var15 - 1, var16, false);
								return;
							}
						}
					}
				}
				return;
			}
			int var22 = var21 * 65536 / var20;
			int var23 = 32768;
			while (var15 != var17) {
				if (var15 < var17) {
					var15++;
				} else if (var15 > var17) {
					var15--;
				}
				if ((var7.field4487[Statics.field4826][var15][var16] & 0x4) != 0) {
					method7472(var8.field6928, 1, var15, var16, false);
					return;
				}
				if (var16 + 1 < var7.field4487[Statics.field4826][var15].length && (var7.field4487[Statics.field4826][var15][var16 + 1] & 0x4) != 0) {
					method7472(var8.field6928, 1, var15, var16 + 1, false);
					return;
				}
				if (var16 > 0 && (var7.field4487[Statics.field4826][var15][var16 - 1] & 0x4) != 0) {
					method7472(var8.field6928, 1, var15, var16 - 1, false);
					return;
				}
				var23 += var22;
				if (var23 >= 65536) {
					var23 -= 65536;
					if (var16 < var18) {
						var16++;
						if (var16 + 1 < var7.field4487[Statics.field4826][var15].length && (var7.field4487[Statics.field4826][var15][var16 + 1] & 0x4) != 0) {
							method7472(var8.field6928, 1, var15, var16 + 1, false);
							return;
						}
					} else if (var16 > var18) {
						var16--;
						if (var16 > 0 && (var7.field4487[Statics.field4826][var15][var16 - 1] & 0x4) != 0) {
							method7472(var8.field6928, 1, var15, var16 - 1, false);
							return;
						}
					}
				}
			}
			return;
		}
		if (Statics.field3416 != 3) {
			JagException.method9845(var15 + TextUtil.COMMA + var16 + " " + var17 + TextUtil.COMMA + var18 + " " + var10.field7426 + TextUtil.COMMA + var10.field7427, new RuntimeException());
		}
		return;
	}

	@ObfuscatedName("rw.hy([[[Ltk;IIIZI)Z")
	public static final boolean method7472(class551[][][] arg0, int arg1, int arg2, int arg3, boolean arg4) {
		byte[][][] var5 = world.method7742();
		byte var6 = arg4 ? 1 : (byte) (field10916 & 0xFF);
		if (var5[Statics.field4826][arg2][arg3] == var6) {
			return false;
		}
		LinkMap var7 = world.method7793();
		if ((var7.field4487[Statics.field4826][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		byte var8 = 0;
		int var9 = 0;
		field11092[var8] = arg2;
		int var42 = var8 + 1;
		field10984[var8] = arg3;
		var5[Statics.field4826][arg2][arg3] = var6;
		while (var42 != var9) {
			int var10 = field11092[var9] & 0xFFFF;
			int var11 = field11092[var9] >> 16 & 0xFF;
			int var12 = field11092[var9] >> 24 & 0xFF;
			int var13 = field10984[var9] & 0xFFFF;
			int var14 = field10984[var9] >> 16 & 0xFF;
			var9 = var9 + 1 & 0xFFF;
			boolean var15 = false;
			if ((var7.field4487[Statics.field4826][var10][var13] & 0x4) == 0) {
				var15 = true;
			}
			boolean var16 = false;
			if (arg0 != null) {
				label240: for (int var17 = Statics.field4826 + 1; var17 <= 3; var17++) {
					if (arg0[var17] != null && (var7.field4487[var17][var10][var13] & 0x8) == 0) {
						if (var15 && arg0[var17][var10][var13] != null) {
							if (arg0[var17][var10][var13].field6966 != null) {
								int var18 = Statics.method2014(var11);
								if (arg0[var17][var10][var13].field6966.field12463 == var18 || arg0[var17][var10][var13].field6967 != null && arg0[var17][var10][var13].field6967.field12463 == var18) {
									continue;
								}
								if (var12 != 0) {
									int var19 = Statics.method2014(var12);
									if (arg0[var17][var10][var13].field6966.field12463 == var19 || arg0[var17][var10][var13].field6967 != null && arg0[var17][var10][var13].field6967.field12463 == var19) {
										continue;
									}
								}
								if (var14 != 0) {
									int var20 = Statics.method2014(var14);
									if (arg0[var17][var10][var13].field6966.field12463 == var20 || arg0[var17][var10][var13].field6967 != null && arg0[var17][var10][var13].field6967.field12463 == var20) {
										continue;
									}
								}
							}
							class551 var21 = arg0[var17][var10][var13];
							if (var21.field6964 != null) {
								for (PrimaryLayerEntityList var22 = var21.field6964; var22 != null; var22 = var22.field7058) {
									PrimaryLayerEntity var23 = var22.field7057;
									if (var23 instanceof Location) {
										Location var24 = (Location) var23;
										int var25 = var24.method8220();
										int var26 = var24.method8204();
										if (var25 == 21) {
											var25 = 19;
										}
										int var27 = var25 | var26 << 6;
										if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
											continue label240;
										}
									}
								}
							}
						}
						class551 var28 = arg0[var17][var10][var13];
						if (var28 != null && var28.field6964 != null) {
							for (PrimaryLayerEntityList var29 = var28.field6964; var29 != null; var29 = var29.field7058) {
								PrimaryLayerEntity var30 = var29.field7057;
								if (var30.field12472 != var30.field12471 || var30.field12468 != var30.field12467) {
									short var31 = var30.field12471;
									short var32 = var30.field12472;
									short var33 = var30.field12468;
									short var34 = var30.field12467;
									int var35 = Math.max(0, Math.min(var31, var5[var17].length - 1));
									int var36 = Math.max(0, Math.min(var33, var5[var17][0].length - 1));
									int var37 = Math.max(0, Math.min(var32, var5[var17].length - 1));
									int var38 = Math.max(0, Math.min(var34, var5[var17][0].length - 1));
									while (var35 <= var37) {
										while (var36 <= var38) {
											var5[var17][var35][var36] = var6;
											var36++;
										}
										var35++;
									}
								}
							}
						}
						var5[var17][var10][var13] = var6;
						var16 = true;
					}
				}
			}
			if (var16) {
				int var39 = world.method7743().field6913[Statics.field4826 + 1].method1529(var10, var13);
				if (field11061[arg1] < var39) {
					field11061[arg1] = var39;
				}
				int var40 = var10 << 9;
				int var41 = var13 << 9;
				if (field10933[arg1] > var40) {
					field10933[arg1] = var40;
				} else if (field10934[arg1] < var40) {
					field10934[arg1] = var40;
				}
				if (field10820[arg1] > var41) {
					field10820[arg1] = var41;
				} else if (field10935[arg1] < var41) {
					field10935[arg1] = var41;
				}
			}
			if (!var15) {
				if (var10 >= 1 && var5[Statics.field4826][var10 - 1][var13] != var6) {
					field11092[var42] = var10 - 1 | 0x120000 | 0xD3000000;
					field10984[var42] = var13 | 0x130000;
					var42 = var42 + 1 & 0xFFF;
					var5[Statics.field4826][var10 - 1][var13] = var6;
				}
				var13++;
				if (var13 < world.method7758()) {
					if (var10 - 1 >= 0 && var5[Statics.field4826][var10 - 1][var13] != var6 && (var7.field4487[Statics.field4826][var10][var13] & 0x4) == 0 && (var7.field4487[Statics.field4826][var10 - 1][var13 - 1] & 0x4) == 0) {
						field11092[var42] = var10 - 1 | 0x120000 | 0x52000000;
						field10984[var42] = var13 | 0x130000;
						var42 = var42 + 1 & 0xFFF;
						var5[Statics.field4826][var10 - 1][var13] = var6;
					}
					if (var5[Statics.field4826][var10][var13] != var6) {
						field11092[var42] = var10 | 0x520000 | 0x13000000;
						field10984[var42] = var13 | 0x530000;
						var42 = var42 + 1 & 0xFFF;
						var5[Statics.field4826][var10][var13] = var6;
					}
					if (var10 + 1 < world.method7728() && var5[Statics.field4826][var10 + 1][var13] != var6 && (var7.field4487[Statics.field4826][var10][var13] & 0x4) == 0 && (var7.field4487[Statics.field4826][var10 + 1][var13 - 1] & 0x4) == 0) {
						field11092[var42] = var10 + 1 | 0x520000 | 0x92000000;
						field10984[var42] = var13 | 0x530000;
						var42 = var42 + 1 & 0xFFF;
						var5[Statics.field4826][var10 + 1][var13] = var6;
					}
				}
				var13--;
				if (var10 + 1 < world.method7728() && var5[Statics.field4826][var10 + 1][var13] != var6) {
					field11092[var42] = var10 + 1 | 0x920000 | 0x53000000;
					field10984[var42] = var13 | 0x930000;
					var42 = var42 + 1 & 0xFFF;
					var5[Statics.field4826][var10 + 1][var13] = var6;
				}
				var13--;
				if (var13 >= 0) {
					if (var10 - 1 >= 0 && var5[Statics.field4826][var10 - 1][var13] != var6 && (var7.field4487[Statics.field4826][var10][var13] & 0x4) == 0 && (var7.field4487[Statics.field4826][var10 - 1][var13 + 1] & 0x4) == 0) {
						field11092[var42] = var10 - 1 | 0xD20000 | 0x12000000;
						field10984[var42] = var13 | 0xD30000;
						var42 = var42 + 1 & 0xFFF;
						var5[Statics.field4826][var10 - 1][var13] = var6;
					}
					if (var5[Statics.field4826][var10][var13] != var6) {
						field11092[var42] = var10 | 0xD20000 | 0x93000000;
						field10984[var42] = var13 | 0xD30000;
						var42 = var42 + 1 & 0xFFF;
						var5[Statics.field4826][var10][var13] = var6;
					}
					if (var10 + 1 < world.method7728() && var5[Statics.field4826][var10 + 1][var13] != var6 && (var7.field4487[Statics.field4826][var10][var13] & 0x4) == 0 && (var7.field4487[Statics.field4826][var10 + 1][var13 + 1] & 0x4) == 0) {
						field11092[var42] = var10 + 1 | 0x920000 | 0xD2000000;
						field10984[var42] = var13 | 0x930000;
						var42 = var42 + 1 & 0xFFF;
						var5[Statics.field4826][var10 + 1][var13] = var6;
					}
				}
			}
		}
		if (field11061[arg1] != -1000000) {
			field11061[arg1] += 40;
			field10933[arg1] -= 512;
			field10934[arg1] += 512;
			field10935[arg1] += 512;
			field10820[arg1] -= 512;
		}
		return true;
	}

	@ObfuscatedName("sq.hn(I)V")
	public static final void method8193() {
		for (class955 var0 = (class955) field10882.method14245(); var0 != null; var0 = (class955) field10882.method14245()) {
			class955.method3032(var0);
		}
		byte var1 = 0;
		byte var2 = 3;
		if (field10863 == 0) {
			for (int var3 = var1; var3 <= var2; var3++) {
				method16924(var3);
			}
			method16929();
			return;
		}
		method17138();
		for (int var4 = var1; var4 <= var2; var4++) {
			method16922();
			method17232(var4);
			method16924(var4);
		}
		method16925();
		method16929();
	}

	@ObfuscatedName("client.hi()V")
	public static final void method17138() {
		int var0 = ReceivePlayerPositions.field698;
		int[] var1 = ReceivePlayerPositions.field703;
		int var2 = Statics.field688.idleAnimations.method18645();
		boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
		for (int var4 = 0; var4 < var0; var4++) {
			PlayerEntity var5 = field10944[var1[var4]];
			if (!var5.method19119()) {
				var5.field10404 = -1;
			} else if (var5.field12071.method10191()) {
				var5.field10404 = -1;
			} else {
				var5.method16529();
				if (var5.field12471 >= 0 && var5.field12468 >= 0 && var5.field12472 < world.method7728() && var5.field12467 < world.method7758()) {
					var5.field12053 = var5.field10432.field11877 ? var3 : false;
					if (Statics.field4490 == var5) {
						var5.field10404 = Integer.MAX_VALUE;
					} else {
						int var6 = 0;
						if (!var5.field10452) {
							var6++;
						}
						if (!var5.field10416.method14248()) {
							var6 += 2;
						}
						int var7 = var6 + (5 - var5.method16546() << 2);
						if (CommunityPartnerType.field1950 == var5.field12070 && !var5.field12048) {
							if (field10921 == 0) {
								var7 += 32;
							} else {
								var7 += 128;
							}
							var7 += 256;
						} else {
							var7 += 512;
						}
						if (var5.method16578() == field10787) {
							var7 += 2047;
						}
						var5.field10404 = var7 + 1;
					}
				} else {
					var5.field10404 = -1;
				}
			}
		}
		for (int var8 = 0; var8 < field11011; var8++) {
			NpcEntity var9 = (NpcEntity) ((ObjectWrapper) field10838.method14495((long) field11036[var8])).field11436;
			if (var9.method19160() && var9.field12083.method4567(Statics.field7410, Statics.field7410)) {
				var9.method16529();
				if (var9.field12471 >= 0 && var9.field12468 >= 0 && var9.field12472 < world.method7728() && var9.field12467 < world.method7758()) {
					int var10 = 0;
					if (!var9.field10452) {
						var10++;
					}
					if (!var9.field10416.method14248()) {
						var10 += 2;
					}
					if (var9.method16546() < 5) {
						var10 += 5 - var9.method16546() << 2;
					}
					if (field10921 == 0) {
						if (var9.field12083.field2756) {
							var10 += 64;
						} else {
							var10 += 128;
						}
					} else if (field10921 == 1) {
						if (var9.field12083.field2756) {
							var10 += 32;
						} else {
							var10 += 64;
						}
					}
					if (var9.field12083.field2722) {
						var10 += 1024;
					} else if (!var9.field12083.field2723) {
						var10 += 256;
					}
					if (var9.method16578() == field10787) {
						var10 += 2047;
					}
					var9.field10404 = var10 + 1;
				} else {
					var9.field10404 = -1;
				}
			} else {
				var9.field10404 = -1;
			}
		}
		for (int var11 = 0; var11 < field10851.length; var11++) {
			HintArrow var12 = field10851[var11];
			if (var12 != null) {
				if (var12.field745 == 1) {
					ObjectWrapper var13 = (ObjectWrapper) field10838.method14495((long) var12.field744);
					if (var13 != null) {
						NpcEntity var14 = (NpcEntity) var13.field11436;
						if (var14.field10404 >= 0) {
							var14.field10404 += 2048;
						}
					}
				} else if (var12.field745 == 10) {
					PlayerEntity var15 = field10944[var12.field744];
					if (var15 != null && Statics.field4490 != var15 && var15.field10404 >= 0) {
						var15.field10404 += 2048;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.hw()V")
	public static final void method16922() {
		int[][] var0 = world.method7740();
		int var1 = world.method7728();
		int var2 = world.method7758();
		for (int var3 = 0; var3 < var1; var3++) {
			int[] var4 = var0[var3];
			for (int var5 = 0; var5 < var2; var5++) {
				var4[var5] = 0;
			}
		}
	}

	@ObfuscatedName("client.ht(I)V")
	public static final void method17232(int arg0) {
		int var1 = ReceivePlayerPositions.field698;
		int[] var2 = ReceivePlayerPositions.field703;
		int[][] var3 = world.method7740();
		int[][] var4 = world.method7858();
		int var5;
		if (field10863 == 0) {
			var5 = Statics.field1721.length;
		} else {
			var5 = field11011 + var1;
		}
		for (int var6 = 0; var6 < var5; var6++) {
			PathingEntity var8;
			if (field10863 == 0) {
				class158 var7 = Statics.field1721[var6];
				if (!var7.field1744) {
					continue;
				}
				var8 = var7.method2870();
			} else {
				if (var6 < var1) {
					var8 = field10944[var2[var6]];
				} else {
					var8 = (PathingEntity) ((ObjectWrapper) field10838.method14495((long) field11036[var6 - var1])).field11436;
				}
				if (var8.field11717 != arg0 || var8.field10404 < 0 || var8.field10401) {
					continue;
				}
			}
			int var9 = var8.method16546();
			Vector3 var10 = var8.method10536().field4298;
			if ((var9 & 0x1) == 0) {
				if (((int) var10.field4308 & 0x1FF) != 0 || ((int) var10.field4313 & 0x1FF) != 0) {
					continue;
				}
			} else if (((int) var10.field4308 & 0x1FF) != 256 || ((int) var10.field4313 & 0x1FF) != 256) {
				continue;
			}
			int var10002;
			if (var9 == 1) {
				int var11 = (int) var10.field4308 >> 9;
				int var12 = (int) var10.field4313 >> 9;
				if (var8.field10404 > var3[var11][var12]) {
					var3[var11][var12] = var8.field10404;
					var4[var11][var12] = 1;
				} else if (var8.field10404 == var3[var11][var12]) {
					var10002 = var4[var11][var12]++;
				}
			} else {
				int var13 = (var9 - 1) * 256 + 60;
				int var14 = (int) var10.field4308 - var13 >> 9;
				int var15 = (int) var10.field4313 - var13 >> 9;
				int var16 = (int) var10.field4308 + var13 >> 9;
				int var17 = (int) var10.field4313 + var13 >> 9;
				for (int var18 = var14; var18 <= var16; var18++) {
					for (int var19 = var15; var19 <= var17; var19++) {
						if (var8.field10404 > var3[var18][var19]) {
							var3[var18][var19] = var8.field10404;
							var4[var18][var19] = 1;
						} else if (var8.field10404 == var3[var18][var19]) {
							var10002 = var4[var18][var19]++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.hc(I)V")
	public static final void method16924(int arg0) {
		int var1 = ReceivePlayerPositions.field698;
		int[] var2 = ReceivePlayerPositions.field703;
		int[][] var3 = world.method7740();
		int[][] var4 = world.method7858();
		int var5;
		if (field10863 == 0) {
			var5 = Statics.field1721.length;
		} else {
			var5 = field10808 ? var1 : field11011 + var1;
		}
		for (int var6 = 0; var6 < var5; var6++) {
			PathingEntity var8;
			if (field10863 == 0) {
				class158 var7 = Statics.field1721[var6];
				if (!var7.field1744) {
					continue;
				}
				var8 = var7.method2870();
			} else {
				if (var6 < var1) {
					var8 = field10944[var2[var6]];
				} else {
					var8 = (PathingEntity) ((ObjectWrapper) field10838.method14495((long) field11036[var6 - var1])).field11436;
				}
				if (var8.field11717 != arg0) {
					continue;
				}
				if (var8.field10404 < 0) {
					var8.field10452 = false;
					continue;
				}
			}
			var8.field10402 = 0;
			int var9 = var8.method16546();
			Vector3 var10 = var8.method10536().field4298;
			if ((var9 & 0x1) == 0) {
				if (((int) var10.field4308 & 0x1FF) != 0 || ((int) var10.field4313 & 0x1FF) != 0) {
					var8.field10452 = false;
					continue;
				}
			} else if (((int) var10.field4308 & 0x1FF) != 256 || ((int) var10.field4313 & 0x1FF) != 256) {
				var8.field10452 = false;
				continue;
			}
			if (field10863 != 0 && !var8.field10401) {
				int var10002;
				if (var9 == 1) {
					int var11 = (int) var10.field4308 >> 9;
					int var12 = (int) var10.field4313 >> 9;
					if (var8.field10404 != var3[var11][var12]) {
						var8.field10452 = true;
						continue;
					}
					if (var4[var11][var12] > 1) {
						var10002 = var4[var11][var12]--;
						var8.field10452 = true;
						continue;
					}
				} else {
					int var13 = (var9 - 1) * 256 + 252;
					int var14 = (int) var10.field4308 - var13 >> 9;
					int var15 = (int) var10.field4313 - var13 >> 9;
					int var16 = (int) var10.field4308 + var13 >> 9;
					int var17 = (int) var10.field4313 + var13 >> 9;
					if (!method4507(var3, var4, var8.field10404, var14, var15, var16, var17)) {
						for (int var18 = var14; var18 <= var16; var18++) {
							for (int var19 = var15; var19 <= var17; var19++) {
								if (var8.field10404 == var3[var18][var19]) {
									var10002 = var4[var18][var19]--;
								}
							}
						}
						var8.field10452 = true;
						continue;
					}
				}
			}
			var8.field10452 = false;
			if (var8.field10429 <= field10903 && var8.field10399 < field10903 || var8.field10428 == var8.field10419) {
				var8.method10538(var10.field4308, (float) method3660((int) var10.field4308, (int) var10.field4313, var8.field11717), var10.field4313);
			}
			world.method7743().method8768(var8, true);
		}
	}

	@ObfuscatedName("il.ho([[I[[IIIIIII)Z")
	public static final boolean method4507(int[][] arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		for (int var7 = arg3; var7 <= arg5; var7++) {
			for (int var8 = arg4; var8 <= arg6; var8++) {
				if (arg0[var7][var8] == arg2 && arg1[var7][var8] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("client.hj()V")
	public static final void method16925() {
		field10919 = 0;
		for (int var0 = 0; var0 < field11011; var0++) {
			NpcEntity var1 = (NpcEntity) ((ObjectWrapper) field10838.method14495((long) field11036[var0])).field11436;
			if (var1.field10452 && var1.method16486() != -1) {
				int var2 = (var1.method16546() - 1) * 256 + 252;
				Vector3 var3 = var1.method10536().field4298;
				int var4 = (int) var3.field4308 - var2 >> 9;
				int var5 = (int) var3.field4313 - var2 >> 9;
				PathingEntity var6 = method16448(var1.field11717, var4, var5);
				if (var6 != null) {
					int var7 = var6.field10406;
					if (var6 instanceof NpcEntity) {
						var7 += 2048;
					}
					if (var6.field10402 == 0 && var6.method16486() != -1) {
						field10917[field10919] = var7;
						field10918[field10919] = var7;
						field10919++;
						var6.field10402++;
					}
					field10917[field10919] = var7;
					field10918[field10919] = var1.field10406 + 2048;
					field10919++;
					var6.field10402++;
				}
			}
		}
		class664.method15233(field10918, field10917, 0, field10919 - 1);
	}

	@ObfuscatedName("agd.hv(IIII)Lahm;")
	public static PathingEntity method16448(int arg0, int arg1, int arg2) {
		class551 var3 = world.method7743().field6928[arg0][arg1][arg2];
		if (var3 == null) {
			return null;
		}
		PathingEntity var4 = null;
		int var5 = -1;
		for (PrimaryLayerEntityList var6 = var3.field6964; var6 != null; var6 = var6.field7058) {
			PrimaryLayerEntity var7 = var6.field7057;
			if (var7 instanceof PathingEntity) {
				PathingEntity var8 = (PathingEntity) var7;
				int var9 = (var8.method16546() - 1) * 256 + 252;
				Vector3 var10 = var8.method10536().field4298;
				int var11 = (int) var10.field4308 - var9 >> 9;
				int var12 = (int) var10.field4313 - var9 >> 9;
				int var13 = (int) var10.field4308 + var9 >> 9;
				int var14 = (int) var10.field4313 + var9 >> 9;
				if (var11 <= arg1 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
					int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
					if (var15 > var5) {
						var4 = var8;
						var5 = var15;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("client.hz()V")
	public static final void method16929() {
		int var0 = ReceivePlayerPositions.field698;
		int[] var1 = ReceivePlayerPositions.field703;
		int var2;
		if (field10863 == 0) {
			var2 = Statics.field1721.length;
		} else {
			var2 = field10808 ? var0 : field11011 + var0;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			PathingEntity var5;
			if (field10863 == 0) {
				class158 var4 = Statics.field1721[var3];
				if (!var4.field1744) {
					continue;
				}
				var5 = var4.method2870();
			} else {
				if (var3 < var0) {
					var5 = field10944[var1[var3]];
				} else {
					var5 = (PathingEntity) ((ObjectWrapper) field10838.method14495((long) field11036[var3 - var0])).field11436;
				}
				if (var5.field10404 < 0) {
					continue;
				}
			}
			int var6 = var5.method16546();
			Vector3 var7 = var5.method10536().field4298;
			if ((var6 & 0x1) == 0) {
				if (((int) var7.field4308 & 0x1FF) == 0 && ((int) var7.field4313 & 0x1FF) == 0) {
					continue;
				}
			} else if (((int) var7.field4308 & 0x1FF) == 256 && ((int) var7.field4313 & 0x1FF) == 256) {
				continue;
			}
			if (var5.field10429 <= field10903 && var5.field10399 < field10903 || var5.field10428 == var5.field10419) {
				var5.method10538(var7.field4308, (float) method3660((int) var7.field4308, (int) var7.field4313, var5.field11717), var7.field4313);
			}
			world.method7743().method8768(var5, true);
		}
	}

	@ObfuscatedName("ks.ij(I)V")
	public static final void method5180() {
		for (class1173 var0 = (class1173) field10965.method14191(); var0 != null; var0 = (class1173) field10965.method14161()) {
			class1234 var1 = var0.field12309;
			if (field10903 > var1.field12589) {
				var0.method8440();
				var1.method19728();
			} else if (field10903 >= var1.field12588) {
				var1.method19729();
				if (var1.field12593 > 0) {
					if (field10863 == 0) {
						PathingEntity var2 = Statics.field1721[var1.field12593 - 1].method2870();
						if (var2 != null) {
							Vector3 var3 = var2.method10536().field4298;
							if ((int) var3.field4308 >= 0 && (int) var3.field4308 < world.method7728() * 512 && (int) var3.field4313 >= 0 && (int) var3.field4313 < world.method7758() * 512) {
								var1.method19725((int) var3.field4308, (int) var3.field4313, method3660((int) var3.field4308, (int) var3.field4313, var2.field11717) - var1.field12587, field10903);
							}
						}
					} else {
						ObjectWrapper var4 = (ObjectWrapper) field10838.method14495((long) (var1.field12593 - 1));
						if (var4 != null) {
							NpcEntity var5 = (NpcEntity) var4.field11436;
							Vector3 var6 = var5.method10536().field4298;
							if ((int) var6.field4308 >= 0 && (int) var6.field4308 < world.method7728() * 512 && (int) var6.field4313 >= 0 && (int) var6.field4313 < world.method7758() * 512) {
								var1.method19725((int) var6.field4308, (int) var6.field4313, method3660((int) var6.field4308, (int) var6.field4313, var1.field11717) - var1.field12587, field10903);
							}
						}
					}
				}
				if (var1.field12593 < 0) {
					int var7 = -var1.field12593 - 1;
					PlayerEntity var8;
					if (field10945 == var7) {
						var8 = Statics.field4490;
					} else {
						var8 = field10944[var7];
					}
					if (var8 != null) {
						Vector3 var9 = var8.method10536().field4298;
						if ((int) var9.field4308 >= 0 && (int) var9.field4308 < world.method7728() * 512 && (int) var9.field4313 >= 0 && (int) var9.field4313 < world.method7758() * 512) {
							var1.method19725((int) var9.field4308, (int) var9.field4313, method3660((int) var9.field4308, (int) var9.field4313, var1.field11717) - var1.field12587, field10903);
						}
					}
				}
				var1.method19732(field10891);
				world.method7743().method8768(var1, true);
			}
		}
	}

	@ObfuscatedName("sr.io(B)V")
	public static final void method8176() {
		Iterator var0 = field10966.iterator();
		while (var0.hasNext()) {
			class1170 var1 = (class1170) var0.next();
			class1235 var2 = var1.field12264;
			var2.method19746(1);
			if (var2.method19747()) {
				var1.method8440();
				var2.method19749();
			}
		}
	}

	@ObfuscatedName("gm.iq(I)V")
	public static final void method3597() {
		Iterator var0 = field10966.iterator();
		while (var0.hasNext()) {
			class1170 var1 = (class1170) var0.next();
			class1235 var2 = var1.field12264;
			if (world.method7743() != null && var2.method19751()) {
				world.method7743().method8768(var2, true);
			}
		}
	}

	@ObfuscatedName("sp.ig(IIIII)V")
	public static final void method8275(int arg0, int arg1, int arg2, int arg3) {
		MiniMenu.method6036(Statics.field8198);
		method16754(arg0, arg1, arg2, arg3, 256, 256);
		method7133(arg0, arg1, arg2, arg3, 256, 256);
		method6809(arg0, arg1, arg2, arg3, 256, 256);
		method3109(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ahs.iv(IIIIIII)V")
	public static final void method16754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		for (class956 var6 = (class956) field10864.method14254(); var6 != null; var6 = (class956) field10864.method14241()) {
			if (field10903 >= var6.field11203) {
				var6.method8433();
			} else {
				method18486(var6.field11206, (var6.field11202 << 9) + 256, (var6.field11204 << 9) + 256, 0, var6.field11205 * 2, false, false);
				Statics.field10355.method2683(var6.field11208, (int) (field10922[0] + (float) arg0), (int) (field10922[1] + (float) arg1), var6.field11207 | 0xFF000000, 0);
			}
		}
	}

	@ObfuscatedName("pm.ie(IIIIIIB)V")
	public static final void method6809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		HintArrow[] var6 = field10851;
		for (int var7 = 0; var7 < var6.length; var7++) {
			HintArrow var8 = var6[var7];
			if (var8 != null && var8.field745 == 2) {
				method18486(var8.field749, var8.field746 * 262144, var8.field747 * 512, 0, var8.field742 * 2, false, false);
				if (field10922[0] > -1.0F && field10903 % 20 < 10) {
					Sprite var9 = Statics.field8323[var8.field751];
					int var10 = (int) (field10922[0] + (float) arg0 - 12.0F);
					int var11 = (int) (field10922[1] + (float) arg1 - 28.0F);
					var9.method1439(var10, var11);
				}
			}
		}
	}

	@ObfuscatedName("qz.iu(IIIIIIB)V")
	public static final void method7133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = ReceivePlayerPositions.field698;
		int[] var7 = ReceivePlayerPositions.field703;
		field10865 = 0;
		int var8;
		if (field10863 == 0) {
			var8 = Statics.field1721.length;
		} else {
			var8 = field11011 + var6;
		}
		for (int var9 = 0; var9 < var8; var9++) {
			NPCType var10 = null;
			PathingEntity var12;
			if (field10863 == 0) {
				class158 var11 = Statics.field1721[var9];
				if (!var11.field1744) {
					continue;
				}
				var12 = var11.method2870();
				if (field10916 != var12.field11715) {
					continue;
				}
				if (var11.field1743 >= 0) {
					var10 = ((NpcEntity) var12).field12083;
					if (var10.field2735 != null) {
						var10 = var10.method4547(Statics.field7410, Statics.field7410);
						if (var10 == null) {
							continue;
						}
					}
				}
			} else {
				if (var9 < var6) {
					var12 = field10944[var7[var9]];
				} else {
					var12 = (PathingEntity) ((ObjectWrapper) field10838.method14495((long) field11036[var9 - var6])).field11436;
					var10 = ((NpcEntity) var12).field12083;
					if (var10.field2735 != null) {
						var10 = var10.method4547(Statics.field7410, Statics.field7410);
						if (var10 == null) {
							continue;
						}
					}
				}
				if (var12.field10404 < 0 || field10916 != var12.field11715 && Statics.field4490.field11717 != var12.field11717) {
					continue;
				}
			}
			method16483(var12, var12.method16501(), false);
			if (!(field10922[0] < 0.0F)) {
				if (var12.method16512()) {
					class517 var13 = var12.method16513();
					if (var13 != null && field10865 < field11044) {
						String var14 = var13.method8281();
						if (Statics.field3420.method4340()) {
							var14 = Statics.field3420.method4339(var14);
						}
						field11047[field10865] = Statics.field10268.method14532(var14) / 2;
						field11045[field10865] = (int) field10922[0];
						field10982[field10865] = (int) field10922[1];
						field11048[field10865] = var13;
						field10865++;
					}
				}
				int var15 = (int) (field10922[1] + (float) arg1);
				int var16 = var15 - Statics.field10268.field8562;
				boolean var17 = false;
				if (!var12.field10452 && !var12.field10416.method14248()) {
					for (class959 var18 = (class959) var12.field10416.method14254(); var18 != null; var18 = (class959) var12.field10416.method14241()) {
						class960 var19 = var18.method17457(field10903);
						if (var19 != null) {
							HeadbarType var20 = var18.field11215;
							PlayerEntity var21 = field10944[var7[var9]];
							Sprite var22;
							Sprite var23;
							if (var21 == null || CommunityPartnerType.field1950 == var21.field12070) {
								var22 = var20.method9150(Statics.field8198, var20.field7215);
								var23 = var20.method9150(Statics.field8198, var20.field7217);
							} else if (CommunityPartnerType.field1947 == var21.field12070) {
								var22 = var20.method9150(Statics.field8198, var20.field7225);
								var23 = var20.method9150(Statics.field8198, var20.field7224);
							} else {
								var22 = var20.method9150(Statics.field8198, var20.field7221);
								var23 = var20.method9150(Statics.field8198, var20.field7222);
							}
							if (var22 != null && var23 != null) {
								int var24 = 255;
								boolean var25 = true;
								int var26 = field10903 - var19.field11219;
								int var27 = var23.method1459() * var19.field11218 / 255;
								int var30;
								if (var19.field11217 > var26) {
									int var28 = var20.field7220 == 0 ? 0 : var26 / var20.field7220 * var20.field7220;
									int var29 = var23.method1459() * var19.field11216 / 255;
									var30 = (var27 - var29) * var28 / var19.field11217 + var29;
								} else {
									var30 = var27;
									int var31 = var19.field11217 + var20.field7227 - var26;
									if (var20.field7219 >= 0) {
										var24 = (var31 << 8) / (var20.field7227 - var20.field7219);
									}
								}
								if (var19.field11218 > 0 && var30 < 2) {
									var30 = 2;
								}
								int var32 = var22.method1435();
								int var33 = (int) (field10922[0] + (float) arg0 - (float) (var22.method1459() >> 1));
								var16 -= var32;
								if (var24 >= 0 && var24 < 255) {
									int var34 = var24 << 24;
									int var35 = var34 | 0xFFFFFF;
									var22.method1443(var33, var16, 0, var35, 1);
									Statics.field8198.method2161(var33, var16, var30 + var33, var16 + var32);
									var23.method1443(var33, var16, 0, var35, 1);
								} else {
									var22.method1439(var33, var16);
									Statics.field8198.method2161(var33, var16, var30 + var33, var16 + var32);
									var23.method1439(var33, var16);
								}
								Statics.field8198.method2168(arg0, arg1, arg0 + arg2, arg1 + arg3);
								var16 -= 2;
								var17 = true;
							}
						} else if (var18.method17461()) {
							var18.method8433();
						}
					}
				}
				if (!var17) {
					var16 -= Statics.field11389.field7723 + 2;
				}
				if (!var12.field10452) {
					if (var10 == null) {
						PlayerEntity var36 = (PlayerEntity) var12;
						for (int var37 = 0; var37 < var36.field12054.length; var37++) {
							if (var36.field12054[var37] >= 0) {
								Object var38 = null;
								int var39 = var36.field12054[var37];
								int var40 = var36.field12055[var37];
								long var41 = (long) (var40 << 8 | var39);
								Sprite var43 = (Sprite) field10894.method2930(var41);
								if (var43 == null) {
									SpriteData[] var44 = SpriteDataProvider.method1608(Statics.field10317, var40, 0);
									if (var44 == null) {
										continue;
									}
									var43 = Statics.field8198.method2200(var44[var39], true);
									field10894.method2921(var43, var41);
								}
								if (var43 != null) {
									var16 -= var43.method1435();
									var43.method1439((int) (field10922[0] + (float) arg0 - 12.0F), var16);
									var16 -= 2;
								}
							}
						}
					} else {
						NpcEntity var45 = (NpcEntity) var12;
						int[] var46 = var45.field12080 == null ? var45.field12083.field2738 : var45.field12080.field2682;
						short[] var47 = var45.field12080 == null ? var45.field12083.field2728 : var45.field12080.field2681;
						if (var47 != null && var46 != null) {
							for (int var48 = 0; var48 < var47.length; var48++) {
								if (var47[var48] >= 0 && var46[var48] >= 0) {
									Object var49 = null;
									long var50 = (long) (var46[var48] << 8 | var47[var48]);
									Sprite var52 = (Sprite) field10894.method2930(var50);
									if (var52 == null) {
										SpriteData[] var53 = SpriteDataProvider.method1608(Statics.field10317, var46[var48], 0);
										if (var53 == null) {
											continue;
										}
										var52 = Statics.field8198.method2200(var53[var47[var48]], true);
										field10894.method2921(var52, var50);
									}
									if (var52 != null) {
										var16 -= var52.method1435();
										var52.method1439((int) (field10922[0] + (float) arg0 - (float) (var52.method1459() >> 1)), var16);
										var16 -= 2;
									}
								}
							}
						}
					}
				}
				int var10000;
				if (!(var12 instanceof PlayerEntity)) {
					int var60 = 0;
					HintArrow[] var61 = field10851;
					for (int var62 = 0; var62 < var61.length; var62++) {
						HintArrow var63 = var61[var62];
						if (var63 != null && var63.field745 == 1 && var63.field744 == field11036[var9 - var6]) {
							Sprite var64 = Statics.field8323[var63.field751];
							if (var64.method1435() > var60) {
								var60 = var64.method1435();
							}
							boolean var65;
							if (var63.field743 == 0) {
								var65 = true;
							} else {
								int var66 = GameShell.method6016() * 1000 / var63.field743 / 2;
								var65 = field10903 % (var66 * 2) < var66;
							}
							if (var65) {
								var64.method1439((int) (field10922[0] + (float) arg0 - 12.0F), var16 - var64.method1435());
							}
						}
					}
					if (var60 > 0) {
						var10000 = var16 - (var60 + 2);
					}
				} else if (var9 >= 0) {
					int var54 = 0;
					HintArrow[] var55 = field10851;
					for (int var56 = 0; var56 < var55.length; var56++) {
						HintArrow var57 = var55[var56];
						if (var57 != null && var57.field745 == 10 && var57.field744 == var7[var9]) {
							Sprite var58 = Statics.field8323[var57.field751];
							if (var58.method1435() > var54) {
								var54 = var58.method1435();
							}
							var58.method1439((int) (field10922[0] + (float) arg0 - 12.0F), var16 - var58.method1435());
						}
					}
					if (var54 > 0) {
						var10000 = var16 - (var54 + 2);
					}
				}
				for (int var68 = 0; var68 < Statics.field11389.field7758; var68++) {
					int var69 = var12.field10421[var68];
					int var70 = var12.field10411[var68];
					HitmarkType var71 = null;
					int var72 = 0;
					if (var70 >= 0) {
						if (var69 <= field10903) {
							continue;
						}
						var71 = (HitmarkType) Statics.field2936.get(var12.field10411[var68]);
						var72 = var71.field7297;
						if (var71 != null && var71.field7298 != null) {
							var71 = var71.method9251(Statics.field7410, Statics.field7410);
							if (var71 == null) {
								var12.field10421[var68] = -1;
								continue;
							}
						}
					} else if (var69 < 0) {
						continue;
					}
					int var73 = var12.field10456[var68];
					HitmarkType var74 = null;
					if (var73 >= 0) {
						var74 = (HitmarkType) Statics.field2936.get(var73);
						if (var74 != null && var74.field7298 != null) {
							var74 = var74.method9251(Statics.field7410, Statics.field7410);
						}
					}
					if (var69 - var72 <= field10903) {
						if (var71 == null) {
							var12.field10421[var68] = -1;
						} else {
							int var75 = var12.method16501() / 2;
							method16483(var12, var75, false);
							if (field10922[0] > -1.0F) {
								field10922[0] += Statics.field11389.field7716[var68];
								field10922[1] += Statics.field11389.field7717[var68];
								Object var76 = null;
								Object var77 = null;
								Object var78 = null;
								Object var79 = null;
								int var80 = 0;
								int var81 = 0;
								int var82 = 0;
								int var83 = 0;
								int var84 = 0;
								int var85 = 0;
								int var86 = 0;
								int var87 = 0;
								Sprite var88 = null;
								Sprite var89 = null;
								Sprite var90 = null;
								Sprite var91 = null;
								int var92 = 0;
								int var93 = 0;
								int var94 = 0;
								int var95 = 0;
								int var96 = 0;
								int var97 = 0;
								int var98 = 0;
								int var99 = 0;
								Sprite var100 = var71.method9258(Statics.field8198);
								if (var100 != null) {
									var80 = var100.method1459();
									var100.method1432(field11113);
									var84 = field11113[0];
								}
								Sprite var101 = var71.method9253(Statics.field8198);
								if (var101 != null) {
									var81 = var101.method1459();
									var101.method1432(field11113);
									var85 = field11113[0];
								}
								Sprite var102 = var71.method9254(Statics.field8198);
								if (var102 != null) {
									var82 = var102.method1459();
									var102.method1432(field11113);
									var86 = field11113[0];
								}
								Sprite var103 = var71.method9255(Statics.field8198);
								if (var103 != null) {
									var83 = var103.method1459();
									var103.method1432(field11113);
									var87 = field11113[0];
								}
								if (var74 != null) {
									var88 = var74.method9258(Statics.field8198);
									if (var88 != null) {
										var92 = var88.method1459();
										var88.method1432(field11113);
										var96 = field11113[0];
									}
									var89 = var74.method9253(Statics.field8198);
									if (var89 != null) {
										var93 = var89.method1459();
										var89.method1432(field11113);
										var97 = field11113[0];
									}
									var90 = var74.method9254(Statics.field8198);
									if (var90 != null) {
										var94 = var90.method1459();
										var90.method1432(field11113);
										var98 = field11113[0];
									}
									var91 = var74.method9255(Statics.field8198);
									if (var91 != null) {
										var95 = var91.method1459();
										var91.method1432(field11113);
										var99 = field11113[0];
									}
								}
								class140 var104 = Statics.field8321;
								class140 var105 = Statics.field8321;
								FontMetrics var106 = Statics.field6778;
								FontMetrics var107 = Statics.field6778;
								int var108 = var71.field7310;
								if (var108 >= 0) {
									class140 var109 = (class140) Statics.field7538.method6188(field10833, var108, true, var71.field7294);
									FontMetrics var110 = Statics.field7538.method6163(field10833, var108);
									if (var109 != null && var110 != null) {
										var104 = var109;
										var106 = var110;
									}
								}
								if (var74 != null) {
									int var111 = var74.field7310;
									if (var111 >= 0) {
										class140 var112 = (class140) Statics.field7538.method6188(field10833, var111, true, var74.field7294);
										FontMetrics var113 = Statics.field7538.method6163(field10833, var111);
										if (var112 != null && var113 != null) {
											var105 = var112;
											var107 = var113;
										}
									}
								}
								Object var114 = null;
								String var115 = null;
								boolean var116 = false;
								int var117 = 0;
								String var118 = var71.method9252(var12.field10412[var68]);
								int var119 = var106.method14532(var118);
								if (var74 != null) {
									var115 = var74.method9252(var12.field10445[var68]);
									var117 = var107.method14532(var115);
								}
								int var120 = 0;
								int var121 = 0;
								if (var81 > 0) {
									var120 = var119 / var81 + 1;
								}
								if (var74 != null && var93 > 0) {
									var121 = var117 / var93 + 1;
								}
								int var122 = 0;
								int var123 = var122;
								if (var80 > 0) {
									var122 += var80;
								}
								var122 += 2;
								int var124 = var122;
								if (var82 > 0) {
									var122 += var82;
								}
								int var125 = var122;
								int var126 = var122;
								int var128;
								if (var81 > 0) {
									int var127 = var81 * var120;
									var128 = var122 + var127;
									var126 = (var127 - var119) / 2 + var122;
								} else {
									var128 = var119 + var122;
								}
								int var129 = var128;
								if (var83 > 0) {
									var128 += var83;
								}
								int var130 = 0;
								int var131 = 0;
								int var132 = 0;
								int var133 = 0;
								int var134 = 0;
								if (var74 != null) {
									var128 += 2;
									var130 = var128;
									if (var92 > 0) {
										var128 += var92;
									}
									var128 += 2;
									var131 = var128;
									if (var94 > 0) {
										var128 += var94;
									}
									var132 = var128;
									var134 = var128;
									if (var93 > 0) {
										int var135 = var93 * var121;
										var128 += var135;
										var134 += (var135 - var117) / 2;
									} else {
										var128 += var117;
									}
									var133 = var128;
									if (var95 > 0) {
										var128 += var95;
									}
								}
								int var136 = var12.field10421[var68] - field10903;
								int var137 = var71.field7302 - var71.field7302 * var136 / var71.field7297;
								int var138 = var71.field7306 * var136 / var71.field7297 + -var71.field7306;
								int var139 = (int) (field10922[0] + (float) arg0 - (float) (var128 >> 1) + (float) var137);
								int var140 = (int) (field10922[1] + (float) arg1 - 12.0F + (float) var138);
								int var141 = var71.field7289 + var140 + 15;
								int var142 = 0;
								if (var74 != null) {
									var142 = var74.field7289 + var140 + 15;
								}
								int var143 = 255;
								if (var71.field7304 >= 0) {
									var143 = (var136 << 8) / (var71.field7297 - var71.field7304);
								}
								if (var143 >= 0 && var143 < 255) {
									int var144 = var143 << 24;
									int var145 = var144 | 0xFFFFFF;
									if (var100 != null) {
										var100.method1443(var123 + var139 - var84, var140, 0, var145, 1);
									}
									if (var102 != null) {
										var102.method1443(var71.field7308 + (var124 + var139 - var86), var71.field7288 + var140, 0, var145, 1);
									}
									if (var101 != null) {
										for (int var146 = 0; var146 < var120; var146++) {
											var101.method1443(var71.field7308 + var81 * var146 + (var125 + var139 - var85), var71.field7288 + var140, 0, var145, 1);
										}
									}
									if (var103 != null) {
										var103.method1443(var71.field7308 + (var129 + var139 - var87), var71.field7288 + var140, 0, var145, 1);
									}
									var104.method2681(var118, var126 + var139, var141, var71.field7296 | var144, 0);
									if (var74 != null) {
										if (var88 != null) {
											var88.method1443(var130 + var139 - var96, var140, 0, var145, 1);
										}
										if (var90 != null) {
											var90.method1443(var74.field7308 + (var131 + var139 - var98), var74.field7288 + var140, 0, var145, 1);
										}
										if (var89 != null) {
											for (int var147 = 0; var147 < var121; var147++) {
												var89.method1443(var74.field7308 + var93 * var147 + (var132 + var139 - var97), var74.field7288 + var140, 0, var145, 1);
											}
										}
										if (var91 != null) {
											var91.method1443(var74.field7308 + (var133 + var139 - var99), var74.field7288 + var140, 0, var145, 1);
										}
										var105.method2681(var115, var134 + var139, var142, var74.field7296 | var144, 0);
									}
								} else {
									if (var100 != null) {
										var100.method1439(var123 + var139 - var84, var140);
									}
									if (var102 != null) {
										var102.method1439(var71.field7308 + (var124 + var139 - var86), var71.field7288 + var140);
									}
									if (var101 != null) {
										for (int var148 = 0; var148 < var120; var148++) {
											var101.method1439(var71.field7308 + var81 * var148 + (var125 + var139 - var85), var71.field7288 + var140);
										}
									}
									if (var103 != null) {
										var103.method1439(var71.field7308 + (var129 + var139 - var87), var71.field7288 + var140);
									}
									var104.method2681(var118, var126 + var139, var141, var71.field7296 | 0xFF000000, 0);
									if (var74 != null) {
										if (var88 != null) {
											var88.method1439(var130 + var139 - var96, var140);
										}
										if (var90 != null) {
											var90.method1439(var74.field7308 + (var131 + var139 - var98), var74.field7288 + var140);
										}
										if (var89 != null) {
											for (int var149 = 0; var149 < var121; var149++) {
												var89.method1439(var74.field7308 + var93 * var149 + (var132 + var139 - var97), var74.field7288 + var140);
											}
										}
										if (var91 != null) {
											var91.method1439(var74.field7308 + (var133 + var139 - var99), var74.field7288 + var140);
										}
										var105.method2681(var115, var134 + var139, var142, var74.field7296 | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int var150 = 0; var150 < field10919; var150++) {
			int var151 = field10917[var150];
			PathingEntity var152;
			if (var151 < 2048) {
				var152 = field10944[var151];
			} else {
				var152 = (PathingEntity) ((ObjectWrapper) field10838.method14495((long) (var151 - 2048))).field11436;
			}
			int var153 = field10918[var150];
			PathingEntity var154;
			if (var153 < 2048) {
				var154 = field10944[var153];
			} else {
				var154 = (PathingEntity) ((ObjectWrapper) field10838.method14495((long) (var153 - 2048))).field11436;
			}
			method6810(var152, var154, --var152.field10402, arg0, arg1, arg2, arg3, arg4, arg5);
		}
		int var155 = Statics.field10268.field8569 + Statics.field10268.field8562 + 2;
		for (int var156 = 0; var156 < field10865; var156++) {
			int var157 = field11045[var156];
			int var158 = field10982[var156];
			int var159 = field11047[var156];
			boolean var160 = true;
			while (var160) {
				var160 = false;
				for (int var161 = 0; var161 < var156; var161++) {
					if (var158 + 2 > field10982[var161] - var155 && var158 - var155 < field10982[var161] + 2 && var157 - var159 < field11047[var161] + field11045[var161] && var157 + var159 > field11045[var161] - field11047[var161] && field10982[var161] - var155 < var158) {
						var158 = field10982[var161] - var155;
						var160 = true;
					}
				}
			}
			field10982[var156] = var158;
			String var162 = field11048[var156].method8281();
			if (Statics.field3420.method4340()) {
				var162 = Statics.field3420.method4339(var162);
			}
			if (field10980 == 0) {
				int var163 = 16776960;
				int var164 = field11048[var156].method8284();
				if (var164 < 6) {
					var163 = field10956[var164];
				}
				if (var164 == 6) {
					var163 = field10916 % 20 < 10 ? 16711680 : 16776960;
				}
				if (var164 == 7) {
					var163 = field10916 % 20 < 10 ? 255 : 65535;
				}
				if (var164 == 8) {
					var163 = field10916 % 20 < 10 ? 45056 : 8454016;
				}
				if (var164 == 9) {
					int var165 = 150 - field11048[var156].method8285() * 150 / field11048[var156].method8280();
					if (var165 < 50) {
						var163 = var165 * 1280 + 16711680;
					} else if (var165 < 100) {
						var163 = 16776960 - (var165 - 50) * 327680;
					} else if (var165 < 150) {
						var163 = (var165 - 100) * 5 + 65280;
					}
				}
				if (var164 == 10) {
					int var166 = 150 - field11048[var156].method8285() * 150 / field11048[var156].method8280();
					if (var166 < 50) {
						var163 = var166 * 5 + 16711680;
					} else if (var166 < 100) {
						var163 = 16711935 - (var166 - 50) * 327680;
					} else if (var166 < 150) {
						var163 = (var166 - 100) * 327680 + 255 - (var166 - 100) * 5;
					}
				}
				if (var164 == 11) {
					int var167 = 150 - field11048[var156].method8285() * 150 / field11048[var156].method8280();
					if (var167 < 50) {
						var163 = 16777215 - var167 * 327685;
					} else if (var167 < 100) {
						var163 = (var167 - 50) * 327685 + 65280;
					} else if (var167 < 150) {
						var163 = 16777215 - (var167 - 100) * 327680;
					}
				}
				int var168 = var163 | 0xFF000000;
				int var169 = field11048[var156].method8283();
				if (var169 == 0) {
					Statics.field10355.method2683(var162, arg0 + var157, arg1 + var158, var168, -16777216);
				}
				if (var169 == 1) {
					Statics.field10355.method2710(var162, arg0 + var157, arg1 + var158, var168, -16777216, field10916);
				}
				if (var169 == 2) {
					Statics.field10355.method2687(var162, arg0 + var157, arg1 + var158, var168, -16777216, field10916);
				}
				if (var169 == 3) {
					int var170 = 150 - field11048[var156].method8285() * 150 / field11048[var156].method8280();
					Statics.field10355.method2730(var162, arg0 + var157, arg1 + var158, var168, -16777216, field10916, var170);
				}
				if (var169 == 4) {
					int var171 = 150 - field11048[var156].method8285() * 150 / field11048[var156].method8280();
					int var172 = var171 * (Statics.field10268.method14532(var162) + 100) / 150;
					Statics.field8198.method2161(arg0 + var157 - 50, arg1, arg0 + var157 + 50, arg1 + arg3);
					Statics.field10355.method2681(var162, arg0 + var157 + 50 - var172, arg1 + var158, var168, -16777216);
					Statics.field8198.method2168(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (var169 == 5) {
					int var173 = 150 - field11048[var156].method8285() * 150 / field11048[var156].method8280();
					int var174 = 0;
					if (var173 < 25) {
						var174 = var173 - 25;
					} else if (var173 > 125) {
						var174 = var173 - 125;
					}
					int var175 = Statics.field10268.field8569 + Statics.field10268.field8562;
					Statics.field8198.method2161(arg0, arg1 + var158 - var175 - 1, arg0 + arg2, arg1 + var158 + 5);
					Statics.field10355.method2683(var162, arg0 + var157, arg1 + var158 + var174, var168, -16777216);
					Statics.field8198.method2168(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Statics.field10355.method2683(var162, arg0 + var157, arg1 + var158, -256, -16777216);
			}
		}
	}

	@ObfuscatedName("pm.in(Lahm;Lahm;IIIIIIIB)V")
	public static final void method6810(PathingEntity arg0, PathingEntity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = arg1.method16486();
		if (var9 == -1) {
			return;
		}
		Object var10 = null;
		Sprite var11 = (Sprite) field10830.method2930((long) var9);
		if (var11 == null) {
			SpriteData[] var12 = SpriteDataProvider.method1608(Statics.field10317, var9, 0);
			if (var12 == null) {
				return;
			}
			var11 = Statics.field8198.method2200(var12[0], true);
			field10830.method2921(var11, (long) var9);
		}
		Vector3 var13 = arg0.method10536().field4298;
		method18486(arg0.field11717, (int) var13.field4308, (int) var13.field4313, arg0.method16546() * 256, 0, false, false);
		int var14 = (int) (field10922[0] + (float) arg3 - 18.0F);
		int var15 = (int) (field10922[1] + (float) arg4 - 16.0F - 54.0F);
		int var16 = arg2 / 4 * 18 + var14;
		int var17 = arg2 % 4 * 18 + var15;
		var11.method1439(var16, var17);
		if (arg0 == arg1) {
			Statics.field8198.method2173(var16 - 1, var17 - 1, 18, 18, -256);
		}
		class955 var18 = class955.method14429();
		var18.field11197 = arg1;
		var18.field11199 = var16;
		var18.field11195 = var17;
		var18.field11200 = var16 + 16;
		var18.field11201 = var17 + 16;
		field10882.method14243(var18);
	}

	@ObfuscatedName("fp.ir(IIIII)V")
	public static final void method3109(int arg0, int arg1, int arg2, int arg3) {
		int var4 = field10866;
		int var5 = field10924;
		if (field10926 == 1) {
			Sprite var6 = Statics.field11793[field10925 * 400 / 100];
			var6.method1439(var4 - 8, var5 - 8);
		}
		if (field10926 == 2) {
			Sprite var7 = Statics.field11793[field10925 * 400 / 100 + 4];
			var7.method1439(var4 - 8, var5 - 8);
		}
	}

	@ObfuscatedName("vh.it(IIIIIIII)V")
	public static final void method9547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (field10863 != 3) {
			return;
		}
		int var7 = ReceivePlayerPositions.field698;
		int[] var8 = ReceivePlayerPositions.field703;
		for (int var9 = 0; var9 < var7; var9++) {
			PlayerEntity var10 = field10944[var8[var9]];
			if (var10 != null) {
				var10.method16518(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
		for (int var11 = 0; var11 < field11011; var11++) {
			int var12 = field11036[var11];
			ObjectWrapper var13 = (ObjectWrapper) field10838.method14495((long) var12);
			if (var13 != null) {
				((PathingEntity) var13.field11436).method16518(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
	}

	@ObfuscatedName("aac.ix(Lalh;IZI)V")
	public static final void method14574(GraphEntity arg0, int arg1, boolean arg2) {
		method15197(arg0, arg1, true, arg2);
	}

	@ObfuscatedName("agy.is(Lalh;IZI)V")
	public static final void method16483(GraphEntity arg0, int arg1, boolean arg2) {
		method15197(arg0, arg1, false, arg2);
	}

	@ObfuscatedName("adb.ib(Lalh;IZZI)V")
	public static final void method15197(GraphEntity arg0, int arg1, boolean arg2, boolean arg3) {
		int var7;
		int var8;
		if (arg0 instanceof PrimaryLayerEntity && arg0 instanceof Location) {
			PrimaryLayerEntity var4 = (PrimaryLayerEntity) arg0;
			int var5 = var4.field12472 - var4.field12471 + 1 << 9;
			int var6 = var4.field12467 - var4.field12468 + 1 << 9;
			var7 = (var4.field12471 << 9) + var5 / 2;
			var8 = (var4.field12468 << 9) + var6 / 2;
		} else {
			Vector3 var9 = arg0.method10536().field4298;
			var7 = (int) var9.field4308;
			var8 = (int) var9.field4313;
		}
		method18486(arg0.field11717, var7, var8, 0, arg1, arg2, arg3);
	}

	@ObfuscatedName("amk.il(IIIIIZZI)V")
	public static final void method18486(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (world.method7728() - 2) * 512 || arg2 > (world.method7758() - 2) * 512)) {
			float[] var7 = field10922;
			field10922[1] = -1.0F;
			var7[0] = -1.0F;
			return;
		}
		int var8 = method3660(arg1, arg2, arg0) - arg4;
		field10793.method6292(Statics.field8198.method2218());
		field10793.method6315((float) arg3, 0.0F, 0.0F);
		Statics.field8198.method2217(field10793);
		if (arg5) {
			Statics.field8198.method2525((float) arg1, (float) var8, (float) arg2, field10922);
		} else {
			Statics.field8198.method2507((float) arg1, (float) var8, (float) arg2, field10922);
		}
		field10793.method6315((float) -arg3, 0.0F, 0.0F);
		Statics.field8198.method2217(field10793);
		if (!arg6) {
			field10922[0] -= field10780;
			field10922[1] -= field11075;
		}
	}

	@ObfuscatedName("gz.iw(IIIB)I")
	public static final int method3660(int arg0, int arg1, int arg2) {
		if (world.method7743() == null) {
			return 0;
		}
		int var3 = arg0 >> 9;
		int var4 = arg1 >> 9;
		if (var3 < 0 || var4 < 0 || var3 > world.method7728() - 1 || var4 > world.method7758() - 1) {
			return 0;
		}
		int var5 = arg2;
		if (arg2 < 3 && (world.method7793().field4487[1][var3][var4] & 0x2) != 0) {
			var5 = arg2 + 1;
		}
		return world.method7743().field6913[var5].method1527(arg0, arg1);
	}

	@ObfuscatedName("zs.id(IIIIIIIB)V")
	public static final void method14042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg6 - 334;
		if (var7 < 0) {
			var7 = 0;
		} else if (var7 > 100) {
			var7 = 100;
		}
		int var8 = (field11069 - field10874) * var7 / 100 + field10874;
		int var9 = arg5 * var8 >> 8;
		int var10 = 16384 - arg3 & 0x3FFF;
		int var11 = 16384 - arg4 & 0x3FFF;
		int var12 = 0;
		int var13 = 0;
		int var14 = var9;
		if (var10 != 0) {
			var13 = Trig1.field4270[var10] * -var9 >> 14;
			var14 = Trig1.field4272[var10] * var9 >> 14;
		}
		if (var11 != 0) {
			var12 = Trig1.field4270[var11] * var14 >> 14;
			var14 = Trig1.field4272[var11] * var14 >> 14;
		}
		Statics.field7956 = arg0 - var12;
		Statics.field10518 = arg1 - var13;
		Statics.field1881 = arg2 - var14;
		Statics.field7447 = arg3;
		Statics.field8586 = arg4;
		Statics.field2656 = 0;
	}

	@ObfuscatedName("pz.ia(III)V")
	public static final void method6820(int arg0, int arg1) {
		class42.field731 = arg0;
		class42.field718 = arg1;
		class42.field730 = false;
		DelayedStateChange.method14036();
	}

	@ObfuscatedName("el.if(Lax;I)Z")
	public static final boolean method2765(ServerConnection arg0) {
		try {
			return method10616(arg0);
		} catch (IOException var6) {
			if (state == 15) {
				arg0.method941();
				return false;
			} else {
				method8321();
				return true;
			}
		} catch (Exception var7) {
			CoordGrid var3 = world.method7727();
			String var4 = (arg0.field796 == null ? -1 : arg0.field796.field4021) + TextUtil.COMMA + (arg0.field806 == null ? -1 : arg0.field806.field4021) + TextUtil.COMMA + (arg0.field805 == null ? -1 : arg0.field805.field4021) + " " + arg0.field797 + TextUtil.COMMA + (var3.field7426 + Statics.field4490.field10450[0]) + TextUtil.COMMA + (var3.field7427 + Statics.field4490.field10448[0]) + " ";
			for (int var5 = 0; var5 < arg0.field797 && var5 < 50; var5++) {
				var4 = var4 + arg0.field795.data[var5] + TextUtil.COMMA;
			}
			JagException.method9845(var4, var7);
			logout(false);
			return true;
		}
	}

	@ObfuscatedName("yx.ih(Lax;B)Z")
	public static final boolean method10616(ServerConnection arg0) throws IOException {
		Stream var1 = arg0.method939();
		PacketBit var2 = arg0.field795;
		if (var1 == null) {
			return false;
		}
		if (arg0.field796 == null) {
			if (arg0.field799) {
				if (!var1.method9038(1)) {
					return false;
				}
				var1.method9029(arg0.field795.data, 0, 1);
				arg0.field802++;
				arg0.field789 = 0;
				arg0.field799 = false;
			}
			var2.pos = 0;
			if (var2.method19573()) {
				if (!var1.method9038(1)) {
					return false;
				}
				var1.method9029(arg0.field795.data, 1, 1);
				arg0.field802++;
				arg0.field789 = 0;
			}
			arg0.field799 = true;
			ServerProt[] var3 = Statics.method18494();
			int var4 = var2.gIsaac1or2();
			if (var4 < 0 || var4 >= var3.length) {
				throw new IOException(var4 + " " + var2.pos);
			}
			arg0.field796 = var3[var4];
			arg0.field797 = arg0.field796.field3941;
		}
		if (arg0.field797 == -1) {
			if (!var1.method9038(1)) {
				return false;
			}
			var1.method9029(var2.data, 0, 1);
			arg0.field797 = var2.data[0] & 0xFF;
			arg0.field802++;
			arg0.field789 = 0;
		}
		if (arg0.field797 == -2) {
			if (!var1.method9038(2)) {
				return false;
			}
			var1.method9029(var2.data, 0, 2);
			var2.pos = 0;
			arg0.field797 = var2.g2();
			arg0.field802 += 2;
			arg0.field789 = 0;
		}
		if (arg0.field797 > 0) {
			if (!var1.method9038(arg0.field797)) {
				return false;
			}
			var2.pos = 0;
			var1.method9029(var2.data, 0, arg0.field797);
			arg0.field802 += arg0.field797;
			arg0.field789 = 0;
		}
		arg0.field805 = arg0.field806;
		arg0.field806 = arg0.field790;
		arg0.field790 = arg0.field796;
		if (ServerProt.IF_SETTEXTANTIMACRO == arg0.field796) {
			int var5 = var2.g4_alt3();
			boolean var6 = var2.g1() == 1;
			incrementVerifyId();
			DelayedStateChange.method9874(var5, var6);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLANCHANNEL_FULL == arg0.field796) {
			field11025 = field11058;
			boolean var7 = var2.g1() == 1;
			if (arg0.field797 != 1) {
				if (var7) {
					Statics.field3022 = new ClanChannel(var2);
				} else {
					Statics.field1766 = new ClanChannel(var2);
				}
				arg0.field796 = null;
				return true;
			}
			if (var7) {
				Statics.field3022 = null;
			} else {
				Statics.field1766 = null;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARC_SMALL == arg0.field796) {
			byte var8 = var2.g1b_alt3();
			int var9 = var2.g2();
			incrementVerifyId();
			DelayedStateChange.method19215(var9, var8);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_FULL == arg0.field796) {
			field11094.method3273();
			int var10 = var2.g1();
			for (int var11 = 0; var11 < var10; var11++) {
				int var12 = var2.g4s();
				class185 var13 = new class185(var12);
				field11094.method3270(var13);
				int var14 = var2.g1();
				for (int var15 = 0; var15 < var14; var15++) {
					var13.method3298(var2.g4s());
				}
				int var16 = var2.g1();
				for (int var17 = 0; var17 < var16; var17++) {
					var13.method3320(var2.g4s());
				}
				for (int var18 = 0; var18 < var14; var18++) {
					byte var19 = var2.g1b();
					var13.method3319(var18, var19);
					for (int var20 = 0; var20 < var16; var20++) {
						if (var2.g1() == 0) {
							var13.method3307(var18, var20, null);
						} else {
							var13.method3307(var18, var20, var2.g4s());
						}
					}
				}
			}
			field11095 = false;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SET_MOVEACTION == arg0.field796) {
			Statics.field4868 = arg0.field797 > 2 ? var2.gjstr() : LocalisedText.WALKHERE.method15021(Statics.field1680);
			field10963 = arg0.field797 > 0 ? var2.g2() : -1;
			if (field10963 == 65535) {
				field10963 = -1;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_SITESETTINGS == arg0.field796) {
			method5135(var2.gjstr());
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SETDRAWORDER == arg0.field796) {
			boolean var21 = var2.g1_alt3() == 1;
			incrementVerifyId();
			Statics.field7446 = var21;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CHAT_FILTER_SETTINGS_PRIVATECHAT == arg0.field796) {
			Statics.field10354 = class724.method3374(var2.g1());
			arg0.field796 = null;
			return true;
		} else if (ServerProt.NO_TIMEOUT == arg0.field796) {
			arg0.field796 = null;
			return true;
		} else if (ServerProt.URL_OPEN == arg0.field796) {
			if (Fullscreen.allowed && Statics.fsframe != null) {
				setWindowMode(Statics.field688.maxScreenSize.method18539(), -1, -1, false);
			}
			byte[] var22 = new byte[arg0.field797 - 1];
			boolean var23 = var2.g1() == 1;
			var2.gIsaacArrayBuffer(var22, 0, arg0.field797 - 1);
			Packet var24 = new Packet(var22);
			String var25 = var24.gjstr();
			if (var23) {
				String var26 = var24.gjstr();
				if (var26.length() == 0) {
					var26 = var25;
				}
				if (!field11079 || Statics.osName.startsWith("mac") || !Browser.method2898(var25, 1, JavascriptFunction.field4033.method6087())) {
					Browser.method4607(var26, true, field10784);
				}
			} else {
				Browser.method4607(var25, true, field10784);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_FORCEANGLE == arg0.field796) {
			int var27 = var2.g2_alt1();
			int var28 = var2.g2();
			incrementVerifyId();
			method4843(var28, var27, 0);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_RESET == arg0.field796) {
			incrementVerifyId();
			method4046(method14298());
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_INV_PARTIAL == arg0.field796) {
			int var29 = var2.g2();
			int var30 = var2.g1();
			boolean var31 = (var30 & 0x1) != 0;
			boolean var32 = (var30 & 0x2) != 0;
			while (var2.pos < arg0.field797) {
				int var33 = var2.gSmart1or2();
				int var34 = var2.g2();
				int var35 = 0;
				VarContainerSparse var36 = null;
				if (var34 != 0) {
					var35 = var2.g1();
					if (var35 == 255) {
						var35 = var2.g4s();
					}
					if (var32) {
						int var37 = var2.g1();
						if (var37 > 0) {
							var36 = new VarContainerSparse(Statics.field1819);
							while (var37-- > 0) {
								VarValue var38 = Statics.field1819.method15284(var2);
								var36.method14735(var38.field4240, var38.field4239);
							}
						}
					}
				}
				ClientInvCache.method3912(var29, var33, var34 - 1, var35, var36, var31);
			}
			field10783[++field11012 - 1 & 0x3F] = var29;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TEXT_COORD == arg0.field796) {
			method9605(ZoneProt.field3612);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_CLEAR_GRID_VALUE == arg0.field796) {
			if (!field11095) {
				try {
					int var39 = var2.g1();
					int var40 = var2.g1_alt3();
					int var41 = var2.g1_alt3();
					field11094.method3263(var39).method3307(var40, var41, null);
				} catch (RuntimeException var719) {
					JagException.method9845(null, var719);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.OBJ_REVEAL == arg0.field796) {
			method9605(ZoneProt.field3620);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETCOLOUR == arg0.field796) {
			int var43 = var2.g2_alt2();
			int var44 = var2.g4s();
			incrementVerifyId();
			DelayedStateChange.method3379(var44, var43);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOGOUT_FULL == arg0.field796) {
			field10853 = (LogoutReason) class686.method1897(LogoutReason.method10365(), var2.g1());
			logout(LoginManager.field485);
			arg0.field796 = null;
			return false;
		} else if (ServerProt.TELEMETRY_GRID_ADD_ROW == arg0.field796) {
			if (!field11095) {
				try {
					byte var45 = var2.g1b_alt1();
					int var46 = var2.g4s();
					int var47 = var2.g1_alt3();
					field11094.method3263(var47).method3301(var46, var45);
				} catch (RuntimeException var720) {
					JagException.method9845(null, var720);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SET_PLAYER_OP == arg0.field796) {
			int var49 = var2.g1_alt2();
			int var50 = var2.g2_alt3();
			if (var50 == 65535) {
				var50 = -1;
			}
			String var51 = var2.gjstr();
			int var52 = var2.g1_alt3();
			if (var49 >= 1 && var49 <= 8) {
				if (var51.equalsIgnoreCase("null")) {
					var51 = null;
				}
				field10961[var49 - 1] = var51;
				field10832[var49 - 1] = var50;
				field10962[var49 - 1] = var52 == 0;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_INV_STOP_TRANSMIT == arg0.field796) {
			int var53 = var2.g1_alt1();
			int var54 = var2.g2();
			boolean var55 = (var53 & 0x1) == 1;
			ClientInvCache.method10309(var54, var55);
			field10783[++field11012 - 1 & 0x3F] = var54;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARCLAN_DISABLE == arg0.field796) {
			Statics.field7698 = null;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.NPC_ANIM_SPECIFIC == arg0.field796) {
			int[] var56 = new int[4];
			for (int var57 = 0; var57 < 4; var57++) {
				var56[var57] = var2.g4_alt1();
			}
			int var58 = var2.g2();
			int var59 = var2.g1_alt2();
			ObjectWrapper var60 = (ObjectWrapper) field10838.method14495((long) var58);
			if (var60 != null) {
				method9423((PathingEntity) var60.field11436, var56, var59, true);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETANGLE == arg0.field796) {
			int var61 = var2.g4_alt2();
			int var62 = var2.g2_alt1();
			int var63 = var2.g2_alt1();
			int var64 = var2.g2_alt2();
			incrementVerifyId();
			DelayedStateChange.method16746(var61, var62, var63, var64);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLANSETTINGS_FULL == arg0.field796) {
			field10818 = field11058;
			boolean var65 = var2.g1() == 1;
			if (arg0.field797 != 1) {
				if (var65) {
					Statics.field1890 = new ClanSettings(var2);
				} else {
					Statics.field6867 = new ClanSettings(var2);
				}
				arg0.field796 = null;
				return true;
			}
			if (var65) {
				Statics.field1890 = null;
			} else {
				Statics.field6867 = null;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.HINT_TRAIL == arg0.field796) {
			int var66 = var2.g1();
			int var67 = var2.gSmart2or4null();
			if (field10931[var66] != null) {
				field10931[var66].method8404(world.method7743());
				field10931[var66] = null;
			}
			if (var67 != -1) {
				field10931[var66] = new class529(Statics.field8198, var2, var67);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_CLANCHANNEL_SYSTEM == arg0.field796) {
			boolean var68 = var2.g1() == 1;
			long var69 = (long) var2.g2();
			long var71 = (long) var2.g3();
			long var73 = (var69 << 32) + var71;
			boolean var75 = false;
			ClanChannel var76 = var68 ? Statics.field3022 : Statics.field1766;
			if (var76 == null) {
				var75 = true;
			} else {
				for (int var77 = 0; var77 < 100; var77++) {
					if (field11053[var77] == var73) {
						var75 = true;
						break;
					}
				}
			}
			if (!var75) {
				field11053[field11054] = var73;
				field11054 = (field11054 + 1) % 100;
				String var78 = Statics.method5939(var2);
				int var79 = var68 ? 43 : 46;
				ChatHistory.method15054(var79, 0, "", "", "", var78, var76.field11396, -1, null);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.PLAYER_INFO == arg0.field796) {
			ReceivePlayerPositions.method8355(var2, arg0.field797);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCBIT_LARGE == arg0.field796) {
			int var80 = var2.g2_alt2();
			int var81 = var2.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.method18309(var80, var81);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_LOC == arg0.field796) {
			int var82 = var2.g4_alt1();
			CoordGrid var83 = new CoordGrid(var2.g4_alt3());
			int var84 = var2.g2();
			int var85 = var2.g1_alt3();
			int var86 = var2.g4_alt3();
			int var87 = var2.g4s();
			int var88 = var2.g4_alt2();
			int var89 = var2.g4_alt3();
			int var90 = var2.g1();
			int var91 = var2.g4s();
			LocPositionAdjustment var92 = new LocPositionAdjustment(var2, var90, false);
			incrementVerifyId();
			method4489(var82, new class1192(var84, var85, new class675(var83, var92.field7541, var92.field7540, var91)), new int[] { var86, var87, var88, var89 }, false);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_FRIENDLIST == arg0.field796) {
			while (var2.pos < arg0.field797) {
				boolean var93 = var2.g1() == 1;
				String var94 = var2.gjstr();
				String var95 = var2.gjstr();
				int var96 = var2.g2();
				int var97 = var2.g1();
				int var98 = var2.g1();
				boolean var99 = (var98 & 0x2) != 0;
				boolean var100 = (var98 & 0x1) != 0;
				String var101 = "";
				int var102 = -1;
				int var103 = 0;
				if (var96 > 0) {
					var101 = var2.gjstr();
					var102 = var2.g1();
					var103 = var2.g4s();
				}
				String var104 = var2.gjstr();
				for (int var105 = 0; var105 < field10811; var105++) {
					Friend var106 = field11065[var105];
					if (var93) {
						if (var95.equals(var106.field606)) {
							var106.field606 = var94;
							var106.field607 = var95;
							var94 = null;
							break;
						}
					} else if (var94.equals(var106.field606)) {
						if (var106.field608 != var96) {
							boolean var107 = true;
							for (class957 var108 = (class957) field10910.method14254(); var108 != null; var108 = (class957) field10910.method14241()) {
								if (var108.field11210.equals(var94)) {
									if (var96 != 0 && var108.field11209 == 0) {
										var108.method8433();
										var107 = false;
									} else if (var96 == 0 && var108.field11209 != 0) {
										var108.method8433();
										var107 = false;
									}
								}
							}
							if (var107) {
								field10910.method14243(new class957(var94, var96));
							}
							var106.field608 = var96;
						}
						var106.field607 = var95;
						var106.field612 = var101;
						var106.field610 = var97;
						var106.field611 = var102;
						var106.field609 = var99;
						var106.field613 = var100;
						var106.field614 = var104;
						var106.field615 = var103;
						var94 = null;
						break;
					}
				}
				if (var94 != null && field10811 < 400) {
					Friend var109 = new Friend();
					field11065[field10811] = var109;
					var109.field606 = var94;
					var109.field607 = var95;
					var109.field608 = var96;
					var109.field612 = var101;
					var109.field610 = var97;
					var109.field611 = var102;
					var109.field609 = var99;
					var109.field613 = var100;
					var109.field614 = var104;
					var109.field615 = var103;
					field10811++;
				}
			}
			field11080 = 2;
			field11022 = field11058;
			boolean var110 = false;
			int var111 = field10811;
			while (var111 > 0) {
				boolean var112 = true;
				var111--;
				for (int var113 = 0; var113 < var111; var113++) {
					boolean var114 = false;
					Friend var115 = field11065[var113];
					Friend var116 = field11065[var113 + 1];
					if (Statics.field8755.node != var115.field608 && Statics.field8755.node == var116.field608) {
						var114 = true;
					}
					if (!var114 && var115.field608 == 0 && var116.field608 != 0) {
						var114 = true;
					}
					if (!var114 && !var115.field609 && var116.field609) {
						var114 = true;
					}
					if (!var114 && !var115.field613 && var116.field613) {
						var114 = true;
					}
					if (var114) {
						Friend var117 = field11065[var113];
						field11065[var113] = field11065[var113 + 1];
						field11065[var113 + 1] = var117;
						var112 = false;
					}
				}
				if (var112) {
					break;
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETEVENTS == arg0.field796) {
			int var118 = var2.g2_alt2();
			if (var118 == 65535) {
				var118 = -1;
			}
			int var119 = var2.g4s();
			int var120 = var2.g2_alt3();
			if (var120 == 65535) {
				var120 = -1;
			}
			int var121 = var2.g4_alt1();
			incrementVerifyId();
			for (int var122 = var118; var122 <= var120; var122++) {
				long var123 = ((long) var121 << 32) + (long) var122;
				ServerActiveProperties var125 = (ServerActiveProperties) field10873.method14495(var123);
				ServerActiveProperties var126;
				if (var125 != null) {
					var126 = new ServerActiveProperties(var119, var125.field11381);
					var125.method8440();
				} else if (var122 == -1) {
					var126 = new ServerActiveProperties(var119, Component.method10202(var121).field2268.field11381);
				} else {
					var126 = new ServerActiveProperties(var119, -1);
				}
				field10873.method14501(var126, var123);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.OBJ_COUNT == arg0.field796) {
			method9605(ZoneProt.field3615);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.PLAYER_SNAPSHOT == arg0.field796) {
			int var127 = var2.g1();
			int var128 = -var127 - 2;
			byte var129 = var2.g1b();
			PlayerEntity var130 = (PlayerEntity) field10946.get(var128);
			if (var130 == null) {
				var130 = new PlayerEntity(null);
				var130.field10406 = var128;
				field10946.put(var128, var130);
			}
			var130.method19121(var2, var129);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MIDI_JINGLE == arg0.field796) {
			int var131 = var2.g1_alt1();
			int var132 = var2.g2_alt1();
			if (var132 == 65535) {
				var132 = -1;
			}
			Statics.field1798.method3179(var132, var131);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOC_ANIM_SPECIFIC == arg0.field796) {
			int var133 = var2.g4_alt1();
			int var134 = var133 >> 28 & 0x3;
			int var135 = var133 >> 14 & 0x3FFF;
			int var136 = var133 & 0x3FFF;
			int var137 = var2.g1();
			int var138 = var2.g4s();
			int var139 = var2.g1();
			LocPositionAdjustment var140 = new LocPositionAdjustment(var2, var139, false);
			int var141 = field10914[var140.field7541];
			CoordGrid var142 = world.method7727();
			int var143 = var135 - var142.field7426;
			int var144 = var136 - var142.field7427;
			method8895(var134, var143, var144, var141, var140.field7541, var140.field7540, var140.field7539, var138, var137);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CREATE_SUGGEST_NAME_ERROR == arg0.field796) {
			int var145 = var2.g1();
			SuggestNameReply var146 = (SuggestNameReply) class686.method1897(SuggestNameReply.method9840(), var145);
			if (var146 == null) {
				var146 = SuggestNameReply.field8393;
			}
			AccountCreationManager.method4664(var146);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_PRELOAD_SOUND_GROUP == arg0.field796) {
			int var147 = var2.g2();
			Statics.field1798.method3215(var147);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_REMOVEROOF == arg0.field796) {
			int var148 = var2.g4_alt2();
			incrementVerifyId();
			if (var148 == -1) {
				Statics.field810 = -1;
				Statics.field3538 = -1;
			} else {
				CoordGrid var149 = world.method7727();
				int var150 = var148 >> 14 & 0x3FFF;
				int var151 = var148 & 0x3FFF;
				int var152 = var150 - var149.field7426;
				if (var152 < 0) {
					var152 = 0;
				} else if (var152 >= world.method7728()) {
					var152 = world.method7728();
				}
				int var153 = var151 - var149.field7427;
				if (var153 < 0) {
					var153 = 0;
				} else if (var153 >= world.method7758()) {
					var153 = world.method7758();
				}
				Statics.field810 = (var152 << 9) + 256;
				Statics.field3538 = (var153 << 9) + 256;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MAP_PROJANIM == arg0.field796) {
			method9605(ZoneProt.field3614);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETHIDE == arg0.field796) {
			int var154 = var2.g4s();
			int var155 = var2.g1_alt2();
			incrementVerifyId();
			DelayedStateChange.method3570(var154, var155);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_CLANCHANNEL == arg0.field796) {
			boolean var156 = var2.g1() == 1;
			String var157 = var2.gjstr();
			long var158 = (long) var2.g2();
			long var160 = (long) var2.g3();
			ChatCrownType var162 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			long var163 = (var158 << 32) + var160;
			boolean var165 = false;
			Object var166 = null;
			ClanChannel var167 = var156 ? Statics.field3022 : Statics.field1766;
			if (var167 == null) {
				var165 = true;
			} else {
				int var168 = 0;
				while (true) {
					if (var168 >= 100) {
						if (var162.field3599) {
							if (field10951 && !field11081 || field11101) {
								var165 = true;
							} else if (method6789(var157)) {
								var165 = true;
							}
						}
						break;
					}
					if (field11053[var168] == var163) {
						var165 = true;
						break;
					}
					var168++;
				}
			}
			if (!var165) {
				field11053[field11054] = var163;
				field11054 = (field11054 + 1) % 100;
				String var169 = class107.method10347(Statics.method5939(var2));
				int var170 = var156 ? 41 : 44;
				if (var162.field3602 == -1) {
					ChatHistory.method15054(var170, 0, var157, var157, var157, var169, var167.field11396, -1, var162);
				} else {
					ChatHistory.method15054(var170, 0, TextUtil.imgTag(var162.field3602) + var157, TextUtil.imgTag(var162.field3602) + var157, var157, var169, var167.field11396, -1, var162);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARCLAN_ENABLE == arg0.field796) {
			Statics.field7698 = new class150(Statics.field8783);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LAST_LOGIN_INFO == arg0.field796) {
			int var171 = var2.g4s();
			Statics.field636 = new class25(var171);
			Thread var172 = new Thread(Statics.field636);
			var172.setPriority(1);
			var172.start();
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SYNTH_SOUND == arg0.field796) {
			int var173 = var2.g2();
			if (var173 == 65535) {
				var173 = -1;
			}
			int var174 = var2.g1();
			int var175 = var2.g2();
			int var176 = var2.g1();
			int var177 = var2.g2();
			Statics.field1798.method3191(class173.field1832, var173, var174, var176, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var177, var175);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_PRIVATE == arg0.field796) {
			boolean var178 = var2.g1() == 1;
			String var179 = var2.gjstr();
			String var180 = var179;
			if (var178) {
				var180 = var2.gjstr();
			}
			long var181 = (long) var2.g2();
			long var183 = (long) var2.g3();
			ChatCrownType var185 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			int var186 = var2.g2();
			long var187 = (var181 << 32) + var183;
			boolean var189 = false;
			int var190 = 0;
			while (true) {
				if (var190 >= 100) {
					if (var185.field3599 && method6789(var180)) {
						var189 = true;
					}
					break;
				}
				if (field11053[var190] == var187) {
					var189 = true;
					break;
				}
				var190++;
			}
			if (!var189) {
				field11053[field11054] = var187;
				field11054 = (field11054 + 1) % 100;
				String var191 = Statics.field489.method14982(var186).method19507(var2);
				if (var185.field3602 == -1) {
					ChatHistory.method15054(18, 0, var179, var180, var179, var191, null, var186, var185);
				} else {
					ChatHistory.method15054(18, 0, TextUtil.imgTag(var185.field3602) + var179, TextUtil.imgTag(var185.field3602) + var180, var179, var191, null, var186, var185);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MAP_ANIM == arg0.field796) {
			method9605(ZoneProt.field3613);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOC_PREFETCH == arg0.field796) {
			method9605(ZoneProt.field3619);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.JS5_RELOAD == arg0.field796) {
			Loading.method4883();
			arg0.field796 = null;
			return false;
		} else if (ServerProt.LOC_ANIM == arg0.field796) {
			method9605(ZoneProt.field3616);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARP_LARGE == arg0.field796) {
			int var192 = var2.g2_alt1();
			int var193 = var2.g4s();
			Statics.field7410.field632.method9625((VarType) Statics.field8485.get(var192), var193);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOYALTY_UPDATE == arg0.field796) {
			int var194 = var2.g4_alt3();
			if (Statics.field3056 != var194) {
				Statics.field3056 = var194;
				Statics.method830(ClientTriggerType.field7259, -1, -1);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERHEAD_IGNOREWORN == arg0.field796) {
			int var195 = var2.g2();
			int var196 = var2.g4_alt2();
			int var197 = var2.g2_alt1();
			int var198 = var2.g2_alt1();
			incrementVerifyId();
			DelayedStateChange.method17439(var196, 7, var198 << 16 | var195, var197);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_REMOVE_COLUMN == arg0.field796) {
			if (!field11095) {
				try {
					int var199 = var2.g1_alt2();
					int var200 = var2.g1_alt3();
					field11094.method3263(var199).method3322(var200);
				} catch (RuntimeException var721) {
					JagException.method9845(null, var721);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CREATE_SUGGEST_NAME_REPLY == arg0.field796) {
			String var202 = var2.gjstr();
			AccountCreationManager.method1587(var202);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM2_ENABLE == arg0.field796) {
			boolean var203 = var2.g1() == 1;
			if (var203) {
				method4046(3);
			} else {
				method4046(2);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_STAT == arg0.field796) {
			int var204 = var2.g1_alt2();
			int var205 = var2.g4_alt1();
			int var206 = var2.g1_alt3();
			Statics.field2767.method9778(var206);
			Statics.field7410.field635[var206].method10160(var205);
			Statics.field7410.field635[var206].method10164(var204);
			field11015[++field11014 - 1 & 0x3F] = var206;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_SPEECH_STOP == arg0.field796) {
			Statics.field1798.method3203(SubBussType.field1801.method3034());
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_GAME == arg0.field796) {
			int var207 = var2.gSmart1or2();
			int var208 = var2.g4s();
			int var209 = var2.g1();
			String var210 = "";
			String var211 = var210;
			if ((var209 & 0x1) != 0) {
				var210 = var2.gjstr();
				if ((var209 & 0x2) == 0) {
					var211 = var210;
				} else {
					var211 = var2.gjstr();
				}
			}
			String var212 = var2.gjstr();
			if (var207 == 99) {
				DeveloperConsole.addline(var212);
			} else if (var207 == 98) {
				DeveloperConsole.method722(var212);
			} else if (var211.equals("") || !method6789(var211)) {
				ChatHistory.method2664(var207, var208, var210, var211, var210, var212, null);
			} else {
				arg0.field796 = null;
				return true;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.WORLDLIST_FETCH_REPLY == arg0.field796) {
			boolean var213 = var2.g1() == 1;
			byte[] var214 = new byte[arg0.field797 - 1];
			var2.gdata(var214, 0, arg0.field797 - 1);
			Statics.method6876(var213, var214);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERMODEL_SNAPSHOT == arg0.field796) {
			int var215 = var2.g4_alt3();
			int var216 = var2.g1_alt1();
			int var217 = -var216 - 2;
			incrementVerifyId();
			DelayedStateChange.method17439(var215, 5, var217, 0);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERMODEL_SELF == arg0.field796) {
			int var218 = var2.g4s();
			incrementVerifyId();
			DelayedStateChange.method17439(var218, 5, field10945, 0);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_PUBLIC == arg0.field796) {
			int var219 = var2.g2();
			PlayerEntity var220;
			if (field10945 == var219) {
				var220 = Statics.field4490;
			} else {
				var220 = field10944[var219];
			}
			if (var220 == null) {
				arg0.field796 = null;
				return true;
			}
			int var221 = var2.g2();
			ChatCrownType var222 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			boolean var223 = (var221 & 0x8000) != 0;
			if (var220.field12062 != null && var220.field12061 != null) {
				boolean var224 = false;
				if (var222.field3599) {
					if (!var223 && (field10951 && !field11081 || field11101)) {
						var224 = true;
					} else if (method6789(var220.field12062)) {
						var224 = true;
					}
				}
				if (!var224) {
					int var225 = -1;
					String var227;
					if (var223) {
						var221 &= 0x7FFF;
						ChatPhrase var226 = ChatPhrase.method14572(var2);
						var225 = var226.field3448;
						var227 = var226.field3447.method19507(var2);
					} else {
						var227 = class107.method10347(Statics.method5939(var2));
					}
					var220.method19124(var227.trim(), var221 >> 8, var221 & 0xFF);
					int var228;
					if (var222.field3609) {
						var228 = var223 ? 17 : 1;
					} else {
						var228 = var223 ? 17 : 2;
					}
					if (var222.field3602 == -1) {
						ChatHistory.method15054(var228, 0, var220.method19115(true), var220.method19116(false), var220.field12057, var227, null, var225, var222);
					} else {
						ChatHistory.method15054(var228, 0, TextUtil.imgTag(var222.field3602) + var220.method19115(true), TextUtil.imgTag(var222.field3602) + var220.method19116(false), var220.field12057, var227, null, var225, var222);
					}
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETMODEL == arg0.field796) {
			int var229 = var2.g4_alt2();
			int var230 = var2.g4s();
			incrementVerifyId();
			DelayedStateChange.method17439(var229, 1, var230, -1);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCBIT_SMALL == arg0.field796) {
			int var231 = var2.g2();
			byte var232 = var2.g1b_alt1();
			incrementVerifyId();
			DelayedStateChange.method18309(var231, var232);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_SMOOTHRESET == arg0.field796) {
			incrementVerifyId();
			method3605();
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MAP_PROJANIM_HALFSQ == arg0.field796) {
			method9605(ZoneProt.field3624);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SONG_PRELOAD == arg0.field796) {
			int var233 = var2.g2_alt1();
			if (var233 == 65535) {
				var233 = -1;
			}
			Statics.field1798.method3239(var233, 255);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_PRELOAD_SOUNDS == arg0.field796) {
			Statics.field1798.method3200(var2.g2());
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_RUNENERGY == arg0.field796) {
			field11049 = var2.g1();
			field11027 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETGRAPHIC == arg0.field796) {
			int var234 = var2.g4_alt2();
			int var235 = var2.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.method9637(var235, var234);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_PRIVATE_ECHO == arg0.field796) {
			String var236 = var2.gjstr();
			int var237 = var2.g2();
			String var238 = Statics.field489.method14982(var237).method19507(var2);
			ChatHistory.method15054(19, 0, var236, var236, var236, var238, null, var237, null);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_ZONE_PARTIAL_ENCLOSED == arg0.field796) {
			Statics.field10260 = var2.g1_alt1();
			Statics.field10546 = var2.g1b_alt2() << 3;
			Statics.field1701 = var2.g1b_alt2() << 3;
			while (var2.pos < arg0.field797) {
				ZoneProt var239 = ZoneProt.method5195()[var2.g1()];
				method9605(var239);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_SPEECH_SOUND == arg0.field796) {
			int var240 = var2.g2();
			if (var240 == 65535) {
				var240 = -1;
			}
			int var241 = var2.g1();
			int var242 = var2.g2();
			int var243 = var2.g1();
			Statics.field1798.method3191(class173.field1832, var240, var241, var243, SubBussType.field1801.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, 256, var242);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CREATE_ACCOUNT_REPLY == arg0.field796) {
			int var244 = var2.g1();
			CreateAccountReply var245 = (CreateAccountReply) class686.method1897(CreateAccountReply.method4614(), var244);
			if (var245 == null) {
				var245 = CreateAccountReply.field8378;
			}
			Statics.method6851(var245);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.REDUCE_NPC_ATTACK_PRIORITY == arg0.field796) {
			field10955 = (AttackOpPriority) class686.method1897(AttackOpPriority.method10149(), var2.g1_alt3());
			if (field10955 == null) {
				field10955 = AttackOpPriority.field7908;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_REMOVE_GROUP == arg0.field796) {
			if (!field11095) {
				try {
					int var246 = var2.g1();
					field11094.method3266(var246);
				} catch (RuntimeException var722) {
					JagException.method9845(null, var722);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS == arg0.field796) {
			Statics.field10260 = var2.g1();
			Statics.field10546 = var2.g1b_alt2() << 3;
			Statics.field1701 = var2.g1b() << 3;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETTARGETPARAM == arg0.field796) {
			int var248 = var2.g4s();
			int var249 = var2.g2();
			if (var249 == 65535) {
				var249 = -1;
			}
			int var250 = var2.g2_alt2();
			int var251 = var2.g2_alt2();
			if (var251 == 65535) {
				var251 = -1;
			}
			incrementVerifyId();
			for (int var252 = var251; var252 <= var249; var252++) {
				long var253 = ((long) var248 << 32) + (long) var252;
				ServerActiveProperties var255 = (ServerActiveProperties) field10873.method14495(var253);
				ServerActiveProperties var256;
				if (var255 != null) {
					var256 = new ServerActiveProperties(var255.field11385, var250);
					var255.method8440();
				} else if (var252 == -1) {
					var256 = new ServerActiveProperties(Component.method10202(var248).field2268.field11385, var250);
				} else {
					var256 = new ServerActiveProperties(0, var250);
				}
				field10873.method14501(var256, var253);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CUTSCENE == arg0.field796) {
			int var257 = var2.g2();
			field11041 = -1;
			field10862 = var257;
			field10863 = 2;
			Statics.field3808.method6889(field10862);
			MiniMenu.method6031();
			MiniMenu.method3074();
			int var258 = var2.g2();
			field10769 = var258;
			int var259 = var2.g1();
			Statics.field8729 = new Packet(var259);
			Statics.field8729.pdata(var2.data, var2.pos, var259);
			var2.pos += var259;
			arg0.field796 = null;
			return false;
		} else if (ServerProt.SOUND_AREA == arg0.field796) {
			method9605(ZoneProt.field3626);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SOCIAL_NETWORK_LOGOUT == arg0.field796) {
			if (Fullscreen.allowed && Statics.fsframe != null) {
				setWindowMode(Statics.field688.maxScreenSize.method18539(), -1, -1, false);
			}
			byte[] var260 = new byte[arg0.field797];
			var2.gIsaacArrayBuffer(var260, 0, arg0.field797);
			String var261 = Cp1252.method9199(var260, 0, arg0.field797);
			Browser.method4607(var261, true, field10784);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARC_LARGE == arg0.field796) {
			int var262 = var2.g4_alt1();
			int var263 = var2.g2_alt2();
			incrementVerifyId();
			DelayedStateChange.method19215(var263, var262);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_MOVESUB == arg0.field796) {
			int var264 = var2.g4_alt2();
			int var265 = var2.g4_alt2();
			incrementVerifyId();
			SubInterface var266 = (SubInterface) field10979.method14495((long) var264);
			SubInterface var267 = (SubInterface) field10979.method14495((long) var265);
			if (var267 != null) {
				method214(var267, var266 == null || var266.field11571 != var267.field11571, false);
			}
			if (var266 != null) {
				var266.method8440();
				field10979.method14501(var266, (long) var265);
			}
			Component var268 = Component.method10202(var264);
			if (var268 != null) {
				method4616(var268);
			}
			Component var269 = Component.method10202(var265);
			if (var269 != null) {
				method4616(var269);
				method8329(Statics.field11725[var269.field2158 >>> 16], var269, true);
			}
			if (field10978 != -1) {
				Statics.method1023(field10978, 1);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERHEAD_OTHER == arg0.field796) {
			int var270 = var2.g4_alt1();
			int var271 = var2.g2_alt2();
			int var272 = var2.g4_alt3();
			incrementVerifyId();
			DelayedStateChange.method17439(var272, 3, var271, var270);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOBBY_APPEARANCE == arg0.field796) {
			byte var273 = var2.g1b();
			Statics.field4490.method19121(var2, var273);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_IGNORELIST == arg0.field796) {
			while (var2.pos < arg0.field797) {
				int var274 = var2.g1();
				boolean var275 = (var274 & 0x1) == 1;
				String var276 = var2.gjstr();
				String var277 = var2.gjstr();
				String var278 = var2.gjstr();
				for (int var279 = 0; var279 < field11084; var279++) {
					class27 var280 = field11086[var279];
					if (var275) {
						if (var277.equals(var280.field598)) {
							var280.field598 = var276;
							var280.field596 = var277;
							var276 = null;
							break;
						}
					} else if (var276.equals(var280.field598)) {
						var280.field598 = var276;
						var280.field596 = var277;
						var280.field597 = var278;
						var276 = null;
						break;
					}
				}
				if (var276 != null && field11084 < 400) {
					class27 var281 = new class27();
					field11086[field11084] = var281;
					var281.field598 = var276;
					var281.field596 = var277;
					var281.field597 = var278;
					var281.field595 = (var274 & 0x2) == 2;
					field11084++;
				}
			}
			field11022 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETTEXT == arg0.field796) {
			int var282 = var2.g4_alt1();
			String var283 = var2.gjstr();
			incrementVerifyId();
			DelayedStateChange.method2887(var282, var283);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.PLAYER_GROUP_DELTA == arg0.field796) {
			field11028 = field11058;
			PlayerGroupDelta var284 = new PlayerGroupDelta(var2, field10837);
			var284.method3555(Statics.field6721);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETRECOL == arg0.field796) {
			int var285 = var2.g4_alt1();
			int var286 = var2.g2_alt2();
			int var287 = var2.g2_alt1();
			int var288 = var2.g1_alt1();
			incrementVerifyId();
			DelayedStateChange.method18895(var285, var288, var286, var287);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.RESET_CLIENT_VARCACHE == arg0.field796) {
			Statics.field7410.field632.method9624();
			field11010 += 64;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_DOB == arg0.field796) {
			Statics.field7406 = var2.g3s();
			field10951 = var2.g1() == 1;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_ADD_GROUP == arg0.field796) {
			if (!field11095) {
				try {
					int var289 = var2.g4_alt1();
					byte var290 = var2.g1b_alt1();
					field11094.method3265(new class185(var289), var290);
				} catch (RuntimeException var723) {
					JagException.method9845(null, var723);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_CLANCHANNEL == arg0.field796) {
			boolean var292 = var2.g1() == 1;
			String var293 = var2.gjstr();
			long var294 = (long) var2.g2();
			long var296 = (long) var2.g3();
			ChatCrownType var298 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			int var299 = var2.g2();
			long var300 = (var294 << 32) + var296;
			boolean var302 = false;
			Object var303 = null;
			ClanChannel var304 = var292 ? Statics.field3022 : Statics.field1766;
			if (var304 == null) {
				var302 = true;
			} else {
				int var305 = 0;
				while (true) {
					if (var305 >= 100) {
						if (var298.field3599 && method6789(var293)) {
							var302 = true;
						}
						break;
					}
					if (field11053[var305] == var300) {
						var302 = true;
						break;
					}
					var305++;
				}
			}
			if (!var302) {
				field11053[field11054] = var300;
				field11054 = (field11054 + 1) % 100;
				String var306 = Statics.field489.method14982(var299).method19507(var2);
				int var307 = var292 ? 42 : 45;
				if (var298.field3602 == -1) {
					ChatHistory.method15054(var307, 0, var293, var293, var293, var306, var304.field11396, var299, var298);
				} else {
					ChatHistory.method15054(var307, 0, TextUtil.imgTag(var298.field3602) + var293, TextUtil.imgTag(var298.field3602) + var293, var293, var306, var304.field11396, var299, var298);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MINIMAP_TOGGLE == arg0.field796) {
			class42.field724 = var2.g1();
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_ZONE_FULL_FOLLOWS == arg0.field796) {
			Statics.field10546 = var2.g1b_alt2() << 3;
			Statics.field10260 = var2.g1_alt2();
			Statics.field1701 = var2.g1b_alt3() << 3;
			CoordGrid var308 = world.method7727();
			for (class966 var309 = (class966) field10964.method14500(); var309 != null; var309 = (class966) field10964.method14502()) {
				int var310 = (int) (var309.field6760 >> 28 & 0x3L);
				int var311 = (int) (var309.field6760 & 0x3FFFL);
				int var312 = var311 - var308.field7426;
				int var313 = (int) (var309.field6760 >> 14 & 0x3FFFL);
				int var314 = var313 - var308.field7427;
				if (Statics.field10260 == var310 && var312 >= Statics.field1701 && var312 < Statics.field1701 + 8 && var314 >= Statics.field10546 && var314 < Statics.field10546 + 8) {
					var309.method8440();
					if (var312 >= 0 && var314 >= 0 && var312 < world.method7728() && var314 < world.method7758()) {
						method7359(Statics.field10260, var312, var314);
					}
				}
			}
			for (class962 var315 = (class962) class962.field11237.method14191(); var315 != null; var315 = (class962) class962.field11237.method14161()) {
				if (var315.field11226 >= Statics.field1701 && var315.field11226 < Statics.field1701 + 8 && var315.field11228 >= Statics.field10546 && var315.field11228 < Statics.field10546 + 8 && Statics.field10260 == var315.field11238) {
					var315.field11240 = true;
				}
			}
			for (class962 var316 = (class962) class962.field11242.method14191(); var316 != null; var316 = (class962) class962.field11242.method14161()) {
				if (var316.field11226 >= Statics.field1701 && var316.field11226 < Statics.field1701 + 8 && var316.field11228 >= Statics.field10546 && var316.field11228 < Statics.field10546 + 8 && Statics.field10260 == var316.field11238) {
					var316.field11240 = true;
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARBIT_SMALL == arg0.field796) {
			int var317 = var2.g1_alt3();
			int var318 = var2.g2_alt2();
			Statics.field7410.field632.method9629((VarBitType) Statics.field8736.get(var318), var317);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.FRIENDLIST_LOADED == arg0.field796) {
			field11080 = 1;
			field11022 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERHEAD == arg0.field796) {
			int var319 = var2.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.method17439(var319, 3, field10945, 0);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.PLAYER_GROUP_VARPS == arg0.field796) {
			field10957 = field11058;
			int var320 = var2.pos;
			int var321 = var2.g2();
			boolean var322 = var2.g1() == 1;
			PlayerGroupMember var323 = Statics.field6721.method3392(var321);
			VarContainerSparse var324 = var323.method3504();
			if (var324 == null || var322) {
				var323.method3503(field10837);
				var324 = var323.method3504();
			}
			while (arg0.field797 - (var2.pos - var320) > 0) {
				VarValue var325 = Statics.field8485.method15284(var2);
				var324.method14735(var325.field4240, var325.field4239);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.JCOINS_UPDATE == arg0.field796) {
			int var326 = var2.g4_alt2();
			if (Statics.field2676 != var326) {
				Statics.field2676 = var326;
				Statics.method830(ClientTriggerType.field7261, -1, -1);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SEND_PING == arg0.field796) {
			int var327 = var2.g4s();
			int var328 = var2.g4s();
			ClientMessage var329 = Statics.method1604(ClientProt.SEND_PING_REPLY, arg0.field794);
			var329.field11432.p4_alt1(var327);
			var329.field11432.p4_alt3(var328);
			var329.field11432.p1_alt2(fps);
			arg0.method934(var329);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_OPENTOP == arg0.field796) {
			int var330 = var2.g4_alt2();
			int var331 = var2.g4_alt1();
			int var332 = var2.g4_alt2();
			int var333 = var2.g4s();
			var2.g1();
			int var334 = var2.g2_alt3();
			incrementVerifyId();
			int[] var335 = new int[] { var332, var333, var331, var330 };
			field10978 = var334;
			method17758(var334, var335);
			method9585(false);
			ScriptRunner.method15086(field10978, var335);
			for (int var336 = 0; var336 < 114; var336++) {
				field11072[var336] = true;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MIDI_SONG_LOCATION == arg0.field796) {
			int var337 = var2.g4_alt3();
			int var338 = var2.g4s();
			int var339 = var2.g1_alt1();
			int var340 = var2.g1();
			int var341 = var2.g1_alt2();
			int var342 = var337 >> 28;
			int var343 = var337 >> 14 & 0x3FFF;
			int var344 = var337 & 0x3FFF;
			Statics.field1798.method3143(var338, var340, true, var342, var343 << 9, var344 << 9, var339 << 9, var341 << 9);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.DEBUG_SERVER_TRIGGERS == arg0.field796) {
			int var345 = var2.g2();
			int var346 = var2.g2();
			int var347 = var2.g2();
			incrementVerifyId();
			if (Statics.field11725[var345] != null) {
				for (int var348 = var346; var348 < var347; var348++) {
					int var349 = var2.g3();
					if (var348 < Statics.field11725[var345].field2151.length && Statics.field11725[var345].field2151[var348] != null) {
						Statics.field11725[var345].field2151[var348].field2181 = var349;
					}
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SOUND_MIXBUSS_SETLEVEL == arg0.field796) {
			int var350 = var2.g2();
			int var351 = var2.g2();
			Statics.field1798.method3157(var350, var351);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_REBOOT_TIMER == arg0.field796) {
			if (Statics.method15084(state)) {
				field10831 = (int) ((float) var2.g2() * 2.5F);
			} else {
				field10831 = var2.g2() * 30;
			}
			field11027 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARCLAN == arg0.field796) {
			if (Statics.field7698 == null) {
				Statics.field7698 = new class150(Statics.field8783);
			}
			VarValue var352 = Statics.field8783.method15284(var2);
			Statics.field7698.field1708.method14735(var352.field4240, var352.field4239);
			field10841[++field11020 - 1 & 0x3F] = var352.field4240;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_SOUND_GROUP == arg0.field796) {
			int var353 = var2.g2();
			if (var353 == 65535) {
				var353 = -1;
			}
			int var354 = var2.g1();
			int var355 = var2.g2();
			int var356 = var2.g1();
			int var357 = var2.g2();
			int var358 = var2.g2();
			Sound var359 = Statics.field1798.method3236(class173.field1832, Statics.field1798, var353, var354, var356, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var357, false);
			if (var359 != null) {
				Statics.field1798.method3251(var359, var358, var355);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_RUNWEIGHT == arg0.field796) {
			field11102 = var2.g2s();
			field11027 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.REBUILD_REGION == arg0.field796) {
			PacketBit var360 = new PacketBit(arg0.field797);
			System.arraycopy(arg0.field795.data, arg0.field795.pos, var360.data, 0, arg0.field797);
			method3652();
			if (Statics.field688.unknown7.method18750() == 1) {
				Statics.field3183.method7680(new RebuildRequest(RebuildType.field5066, var360));
			} else {
				world.method7749(new RebuildRequest(RebuildType.field5066, var360));
			}
			arg0.field796 = null;
			return false;
		} else if (ServerProt.MESSAGE_PLAYER_GROUP == arg0.field796) {
			String var361 = var2.gjstr();
			long var362 = (long) var2.g2();
			long var364 = (long) var2.g3();
			ChatCrownType var366 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			boolean var367 = var2.g1() == 1;
			long var368 = (var362 << 32) + var364;
			boolean var370 = false;
			if (Statics.field6721 == null) {
				var370 = true;
			} else {
				int var371 = 0;
				while (true) {
					if (var371 >= 100) {
						if (var366.field3599) {
							if (field10951 && !field11081 || field11101) {
								var370 = true;
							} else if (method6789(var361)) {
								var370 = true;
							}
						}
						break;
					}
					if (field11053[var371] == var368) {
						var370 = true;
						break;
					}
					var371++;
				}
			}
			if (!var370) {
				field11053[field11054] = var368;
				field11054 = (field11054 + 1) % 100;
				String var372 = class107.method10347(Statics.method5939(var2));
				int var373 = var367 ? 22 : 24;
				if (var366.field3602 == -1) {
					ChatHistory.method15054(var373, 0, var361, var361, var361, var372, Statics.field6721.method3386(), -1, var366);
				} else {
					ChatHistory.method15054(var373, 0, TextUtil.imgTag(var366.field3602) + var361, TextUtil.imgTag(var366.field3602) + var361, var361, var372, Statics.field6721.method3386(), -1, var366);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SERVER_TICK_END == arg0.field796) {
			arg0.field796 = null;
			return false;
		} else if (ServerProt.HINT_ARROW == arg0.field796) {
			int var374 = var2.g1();
			int var375 = var374 >> 5;
			int var376 = var374 & 0x1F;
			if (var376 == 0) {
				field10851[var375] = null;
				arg0.field796 = null;
				return true;
			}
			HintArrow var377 = new HintArrow();
			var377.field745 = var376;
			var377.field751 = var2.g1();
			if (var377.field751 >= 0 && var377.field751 < Statics.field8323.length) {
				if (var377.field745 == 1 || var377.field745 == 10) {
					var377.field744 = var2.g2();
					var377.field743 = var2.g2();
					var2.pos += 4;
				} else if (var377.field745 >= 2 && var377.field745 <= 6) {
					if (var377.field745 == 2) {
						var377.field746 = 256;
						var377.field747 = 131072;
					}
					if (var377.field745 == 3) {
						var377.field746 = 0;
						var377.field747 = 131072;
					}
					if (var377.field745 == 4) {
						var377.field746 = 512;
						var377.field747 = 131072;
					}
					if (var377.field745 == 5) {
						var377.field746 = 256;
						var377.field747 = 0;
					}
					if (var377.field745 == 6) {
						var377.field746 = 256;
						var377.field747 = 262144;
					}
					var377.field745 = 2;
					var377.field749 = var2.g1();
					CoordGrid var378 = world.method7727();
					var377.field746 = var377.field746 * 262144 + (var2.g2() - var378.field7426 << 9);
					var377.field747 = var377.field747 * 262144 + (var2.g2() - var378.field7427 << 9) * 512;
					var377.field742 = (var2.g1() << 2) * 4;
					var377.field748 = var2.g2();
				}
				var377.field750 = var2.g4s();
				field10851[var375] = var377;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SPOTANIM_SPECIFIC == arg0.field796) {
			int var379 = var2.g1();
			int var380 = var2.g2_alt2();
			int var381 = var2.g4_alt1();
			int var382 = var2.g2();
			if (var382 == 65535) {
				var382 = -1;
			}
			int var383 = var2.g2();
			int var384 = var2.g1_alt2();
			int var385 = var379 & 0x7;
			int var386 = var379 >> 3 & 0xF;
			if (var386 == 15) {
				var386 = -1;
			}
			boolean var387 = (var379 >> 7 & 0x1) == 1;
			if (var381 >> 30 != 0) {
				CoordGrid var388 = world.method7727();
				int var389 = var381 >> 28 & 0x3;
				int var390 = (var381 >> 14 & 0x3FFF) - var388.field7426;
				int var391 = (var381 & 0x3FFF) - var388.field7427;
				if (var390 >= 0 && var391 >= 0 && var390 < world.method7728() && var391 < world.method7758()) {
					if (var382 == -1) {
						class1170 var392 = (class1170) field10966.method14495((long) (var390 << 16 | var391));
						if (var392 != null) {
							var392.field12264.method19749();
							var392.method8440();
						}
					} else {
						int var393 = var390 * 512 + 256;
						int var394 = var391 * 512 + 256;
						int var395 = var389;
						if (var389 < 3 && world.method7793().method7105(var390, var391)) {
							var395 = var389 + 1;
						}
						class1235 var396 = new class1235(world.method7743(), var382, var383, var389, var395, var393, method3660(var393, var394, var389) - var380, var394, var390, var390, var391, var391, var385, var387, 0);
						field10966.method14501(new class1170(var396), (long) (var390 << 16 | var391));
					}
				}
			} else if (var381 >> 29 != 0) {
				int var397 = var381 & 0xFFFF;
				ObjectWrapper var398 = (ObjectWrapper) field10838.method14495((long) var397);
				if (var398 != null) {
					NpcEntity var399 = (NpcEntity) var398.field11436;
					EntitySpotAnim var400 = var399.field10422[var384];
					if (var382 == 65535) {
						var382 = -1;
					}
					boolean var401 = true;
					int var402 = var400.field6657;
					if (var382 != -1 && var402 != -1) {
						if (var382 == var402) {
							EffectAnimType var403 = (EffectAnimType) Statics.field4874.get(var382);
							if (var403.field8261 && var403.field8260 != -1) {
								SeqType var404 = (SeqType) Statics.field8797.get(var403.field8260);
								int var405 = var404.field1768;
								if (var405 == 0 || var405 == 2) {
									var401 = false;
								} else if (var405 == 1) {
									var401 = true;
								}
							}
						} else {
							EffectAnimType var406 = (EffectAnimType) Statics.field4874.get(var382);
							EffectAnimType var407 = (EffectAnimType) Statics.field4874.get(var402);
							if (var406.field8260 != -1 && var407.field8260 != -1) {
								SeqType var408 = (SeqType) Statics.field8797.get(var406.field8260);
								SeqType var409 = (SeqType) Statics.field8797.get(var407.field8260);
								if (var408.field1779 < var409.field1779) {
									var401 = false;
								}
							}
						}
					}
					if (var401) {
						var400.field6657 = var382;
						var400.field6661 = var380;
						var400.field6658 = var386;
						if (var382 == -1) {
							var400.field6659.method14362(-1);
						} else {
							EffectAnimType var410 = (EffectAnimType) Statics.field4874.get(var382);
							int var411 = var410.field8261 ? 0 : 2;
							if (var387) {
								var411 = 1;
							}
							var400.field6659.method14353(var410.field8260, var383, var411, false);
						}
					}
				}
			} else if (var381 >> 28 != 0) {
				int var412 = var381 & 0xFFFF;
				PlayerEntity var413;
				if (field10945 == var412) {
					var413 = Statics.field4490;
				} else {
					var413 = field10944[var412];
				}
				if (var413 != null) {
					EntitySpotAnim var414 = var413.field10422[var384];
					if (var382 == 65535) {
						var382 = -1;
					}
					boolean var415 = true;
					int var416 = var414.field6657;
					if (var382 != -1 && var416 != -1) {
						if (var382 == var416) {
							EffectAnimType var417 = (EffectAnimType) Statics.field4874.get(var382);
							if (var417.field8261 && var417.field8260 != -1) {
								SeqType var418 = (SeqType) Statics.field8797.get(var417.field8260);
								int var419 = var418.field1768;
								if (var419 == 0 || var419 == 2) {
									var415 = false;
								} else if (var419 == 1) {
									var415 = true;
								}
							}
						} else {
							EffectAnimType var420 = (EffectAnimType) Statics.field4874.get(var382);
							EffectAnimType var421 = (EffectAnimType) Statics.field4874.get(var416);
							if (var420.field8260 != -1 && var421.field8260 != -1) {
								SeqType var422 = (SeqType) Statics.field8797.get(var420.field8260);
								SeqType var423 = (SeqType) Statics.field8797.get(var421.field8260);
								if (var422.field1779 < var423.field1779) {
									var415 = false;
								}
							}
						}
					}
					if (var415) {
						var414.field6657 = var382;
						var414.field6661 = var380;
						var414.field6658 = var386;
						var414.field6660 = var385;
						if (var382 == -1) {
							var414.field6659.method14362(-1);
						} else {
							EffectAnimType var424 = (EffectAnimType) Statics.field4874.get(var382);
							int var425 = var424.field8261 ? 0 : 2;
							if (var387) {
								var425 = 1;
							}
							var414.field6659.method14353(var424.field8260, var383, var425, false);
						}
					}
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_SHAKE == arg0.field796) {
			int var426 = var2.g2_alt2();
			int var427 = var2.g1_alt1();
			int var428 = var2.g1_alt2();
			int var429 = var2.g1_alt3();
			int var430 = var2.g1();
			incrementVerifyId();
			field10983[var427] = true;
			field11062[var427] = var428;
			field11063[var427] = var429;
			field11064[var427] = var430;
			field10996[var427] = var426;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MIDI_SONG == arg0.field796) {
			int var431 = var2.g2_alt3();
			if (var431 == 65535) {
				var431 = -1;
			}
			int var432 = var2.g1_alt2();
			Statics.field1798.method3235(var431, var432);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_PRIVATE_ECHO == arg0.field796) {
			String var433 = var2.gjstr();
			String var434 = class107.method10347(Statics.method5939(var2));
			ChatHistory.method2664(6, 0, var433, var433, var433, var434, null);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOGOUT == arg0.field796) {
			field10853 = (LogoutReason) class686.method1897(LogoutReason.method10365(), var2.g1());
			logout(false);
			arg0.field796 = null;
			return false;
		} else if (ServerProt.UPDATE_UID192 == arg0.field796) {
			var2.pos += 28;
			if (var2.checkcrc()) {
				GameShell.storeUID192(var2, var2.pos - 28);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MIDI_SONG_STOP == arg0.field796) {
			Statics.field1798.method3178();
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_MOVE_ROW == arg0.field796) {
			if (!field11095) {
				try {
					int var435 = var2.g1_alt1();
					int var436 = var2.g1_alt3();
					int var437 = var2.g1();
					field11094.method3263(var436).method3325(var437, var435);
				} catch (RuntimeException var724) {
					JagException.method9845(null, var724);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_OBJ == arg0.field796) {
			int var439 = var2.g2();
			int var440 = var2.g4_alt3();
			CoordGrid var441 = new CoordGrid(var2.g4_alt2());
			int var442 = var2.g4_alt1();
			int var443 = var2.g4s();
			int var444 = var2.g2_alt1();
			int var445 = var2.g4_alt3();
			int var446 = var2.g1_alt1();
			int var447 = var2.g4_alt2();
			incrementVerifyId();
			method4489(var442, new class1194(var439, var446, new class679(var441, var444)), new int[] { var445, var447, var440, var443 }, false);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOC_DEL == arg0.field796) {
			method9605(ZoneProt.field3625);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.NPC_INFO == arg0.field796) {
			method7099(world.field5027);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.POINTLIGHT_COLOUR == arg0.field796) {
			int var448 = var2.g4_alt3();
			int var449 = var2.g2_alt1();
			int var450 = var2.g2_alt3();
			world.method7743().method8756(var450, var448, var449);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_STOCKMARKET_SLOT == arg0.field796) {
			int var451 = var2.g1();
			int var452 = var2.g1();
			if (var2.g1() == 0) {
				field11057[var451][var452] = new class482();
			} else {
				var2.pos -= 1;
				field11057[var451][var452] = new class482(var2, null);
			}
			field10803 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_REMOVE_ROW == arg0.field796) {
			if (!field11095) {
				try {
					int var453 = var2.g1_alt3();
					int var454 = var2.g1();
					field11094.method3263(var453).method3303(var454);
				} catch (RuntimeException var725) {
					JagException.method9845(null, var725);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_FRIENDCHAT == arg0.field796) {
			boolean var456 = var2.g1() == 1;
			String var457 = var2.gjstr();
			String var458 = var457;
			if (var456) {
				var458 = var2.gjstr();
			}
			String var459 = var2.gjstr();
			long var460 = (long) var2.g2();
			long var462 = (long) var2.g3();
			ChatCrownType var464 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			int var465 = var2.g2();
			long var466 = (var460 << 32) + var462;
			boolean var468 = false;
			int var469 = 0;
			while (true) {
				if (var469 >= 100) {
					if (var464.field3599 && method6789(var458)) {
						var468 = true;
					}
					break;
				}
				if (field11053[var469] == var466) {
					var468 = true;
					break;
				}
				var469++;
			}
			if (!var468) {
				field11053[field11054] = var466;
				field11054 = (field11054 + 1) % 100;
				String var470 = Statics.field489.method14982(var465).method19507(var2);
				if (var464.field3602 == -1) {
					ChatHistory.method15054(20, 0, var457, var458, var457, var470, var459, var465, var464);
				} else {
					ChatHistory.method15054(20, 0, TextUtil.imgTag(var464.field3602) + var457, TextUtil.imgTag(var464.field3602) + var458, var457, var470, var459, var465, var464);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_PLAYER == arg0.field796) {
			int var471 = var2.g4_alt2();
			int var472 = var2.g4_alt3();
			int var473 = var2.g4_alt2();
			int var474 = var2.g4s();
			int var475 = var2.g1();
			int var476 = var2.g2();
			int var477 = var2.g4_alt3();
			int var478 = var2.g2_alt3();
			incrementVerifyId();
			method4489(var473, new class1193(var478, var475, var476), new int[] { var471, var477, var472, var474 }, false);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_QUICKCHAT_PLAYER_GROUP == arg0.field796) {
			String var479 = var2.gjstr();
			long var480 = (long) var2.g2();
			long var482 = (long) var2.g3();
			ChatCrownType var484 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			boolean var485 = var2.g1() == 1;
			int var486 = var2.g2();
			long var487 = (var480 << 32) + var482;
			boolean var489 = false;
			if (Statics.field6721 == null) {
				var489 = true;
			} else {
				int var490 = 0;
				while (true) {
					if (var490 >= 100) {
						if (var484.field3599 && method6789(var479)) {
							var489 = true;
						}
						break;
					}
					if (field11053[var490] == var487) {
						var489 = true;
						break;
					}
					var490++;
				}
			}
			if (!var489) {
				field11053[field11054] = var487;
				field11054 = (field11054 + 1) % 100;
				String var491 = Statics.field489.method14982(var486).method19507(var2);
				int var492 = var485 ? 23 : 25;
				if (var484.field3602 == -1) {
					ChatHistory.method15054(var492, 0, var479, var479, var479, var491, Statics.field6721.method3386(), var486, var484);
				} else {
					ChatHistory.method15054(var492, 0, TextUtil.imgTag(var484.field3602) + var479, TextUtil.imgTag(var484.field3602) + var479, var479, var491, Statics.field6721.method3386(), var486, var484);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_CLOSESUB == arg0.field796) {
			int var493 = var2.g4_alt2();
			incrementVerifyId();
			SubInterface var494 = (SubInterface) field10979.method14495((long) var493);
			if (var494 != null) {
				method214(var494, true, false);
			}
			if (field11056 != null) {
				method4616(field11056);
				field11056 = null;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_VALUES_DELTA == arg0.field796) {
			if (!field11095) {
				try {
					for (byte var495 = var2.g1b(); var495 != -1; var495 = var2.g1b()) {
						for (byte var496 = var2.g1b(); var496 != -1; var496 = var2.g1b()) {
							for (byte var497 = var2.g1b(); var497 != -1; var497 = var2.g1b()) {
								field11094.method3263(var495).method3307(var496, var497, var2.g4s());
							}
						}
					}
				} catch (RuntimeException var729) {
					JagException.method9845(null, var729);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLANCHANNEL_DELTA == arg0.field796) {
			field11025 = field11058;
			boolean var499 = var2.g1() == 1;
			ClanChannelDelta var500 = new ClanChannelDelta(var2);
			ClanChannel var501;
			if (var499) {
				var501 = Statics.field3022;
			} else {
				var501 = Statics.field1766;
			}
			var500.method5342(var501);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_FRIENDCHANNEL == arg0.field796) {
			boolean var502 = var2.g1() == 1;
			String var503 = var2.gjstr();
			String var504 = var503;
			if (var502) {
				var504 = var2.gjstr();
			}
			String var505 = var2.gjstr();
			long var506 = (long) var2.g2();
			long var508 = (long) var2.g3();
			ChatCrownType var510 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			long var511 = (var506 << 32) + var508;
			boolean var513 = false;
			int var514 = 0;
			while (true) {
				if (var514 >= 100) {
					if (var510.field3599) {
						if (field10951 && !field11081 || field11101) {
							var513 = true;
						} else if (method6789(var504)) {
							var513 = true;
						}
					}
					break;
				}
				if (field11053[var514] == var511) {
					var513 = true;
					break;
				}
				var514++;
			}
			if (!var513) {
				field11053[field11054] = var511;
				field11054 = (field11054 + 1) % 100;
				String var515 = class107.method10347(Statics.method5939(var2));
				if (var510.field3602 == -1) {
					ChatHistory.method15054(9, 0, var503, var504, var503, var515, var505, -1, var510);
				} else {
					ChatHistory.method15054(9, 0, TextUtil.imgTag(var510.field3602) + var503, TextUtil.imgTag(var510.field3602) + var504, var503, var515, var505, -1, var510);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.RESET_ANIMS == arg0.field796) {
			for (int var516 = 0; var516 < field10944.length; var516++) {
				if (field10944[var516] != null) {
					field10944[var516].field10427 = null;
					field10944[var516].field10454.method14362(-1);
				}
			}
			for (int var517 = 0; var517 < field10906; var517++) {
				((PathingEntity) field10839[var517].field11436).field10427 = null;
				((PathingEntity) field10839[var517].field11436).field10454.method14362(-1);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SET_MAP_FLAG == arg0.field796) {
			int var518 = var2.g1_alt1();
			int var519 = var2.g1();
			if (var518 == 255) {
				var518 = -1;
				var519 = -1;
			}
			DelayedStateChange.method14994(var518, var519);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARP_SMALL == arg0.field796) {
			byte var520 = var2.g1b();
			int var521 = var2.g2_alt2();
			Statics.field7410.field632.method9625((VarType) Statics.field8485.get(var521), var520);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLEAR_PLAYER_SNAPSHOT == arg0.field796) {
			int var522 = var2.g1();
			int var523 = -var522 - 2;
			field10946.remove(var523);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SET_HTTP_IMAGE == arg0.field796) {
			int var524 = var2.g4s();
			int var525 = var2.g4_alt1();
			incrementVerifyId();
			Component var526 = Component.method10202(var524);
			var526.field2188 = var525;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETOBJECT == arg0.field796) {
			int var527 = var2.g2();
			if (var527 == 65535) {
				var527 = -1;
			}
			int var528 = var2.g4_alt3();
			int var529 = var2.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.method5369(var528, var527, var529);
			ObjType var530 = (ObjType) Statics.field1842.get(var527);
			DelayedStateChange.method16746(var528, var530.field8639, var530.field8626, var530.field8638);
			Statics.method9085(var528, var530.field8695, var530.field8643, var530.field8641);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_SET_ROW_PINNED == arg0.field796) {
			if (!field11095) {
				try {
					int var531 = var2.g1_alt1();
					int var532 = var2.g1_alt1();
					boolean var533 = var2.g1_alt3() == 1;
					field11094.method3263(var532).method3293(var531, var533);
				} catch (RuntimeException var726) {
					JagException.method9845(null, var726);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SOUND_MIXBUSS_ADD == arg0.field796) {
			int var535 = var2.g2();
			int var536 = var2.g2();
			int var537 = var2.g2();
			Statics.field1798.method3156(var535, var536, var537);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_INV_FULL == arg0.field796) {
			int var538 = var2.g2();
			int var539 = var2.g1();
			boolean var540 = (var539 & 0x1) != 0;
			boolean var541 = (var539 & 0x2) != 0;
			ClientInvCache.method7228(var538, var540);
			int var542 = var2.g2();
			for (int var543 = 0; var543 < var542; var543++) {
				int var544 = var2.g2();
				int var545 = var2.g1();
				if (var545 == 255) {
					var545 = var2.g4s();
				}
				VarContainerSparse var546 = null;
				if (var541) {
					int var547 = var2.g1();
					if (var547 > 0) {
						var546 = new VarContainerSparse(Statics.field1819);
						while (var547-- > 0) {
							VarValue var548 = Statics.field1819.method15284(var2);
							var546.method14735(var548.field4240, var548.field4239);
						}
					}
				}
				ClientInvCache.method3912(var538, var543, var544 - 1, var545, var546, var540);
			}
			field10783[++field11012 - 1 & 0x3F] = var538;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.MESSAGE_PRIVATE == arg0.field796) {
			boolean var549 = var2.g1() == 1;
			String var550 = var2.gjstr();
			String var551 = var550;
			if (var549) {
				var551 = var2.gjstr();
			}
			long var552 = (long) var2.g2();
			long var554 = (long) var2.g3();
			ChatCrownType var556 = (ChatCrownType) class686.method1897(ChatCrownType.method6043(), var2.g1());
			long var557 = (var552 << 32) + var554;
			boolean var559 = false;
			int var560 = 0;
			while (true) {
				if (var560 >= 100) {
					if (var556.field3599) {
						if (field10951 && !field11081 || field11101) {
							var559 = true;
						} else if (method6789(var551)) {
							var559 = true;
						}
					}
					break;
				}
				if (field11053[var560] == var557) {
					var559 = true;
					break;
				}
				var560++;
			}
			if (!var559) {
				field11053[field11054] = var557;
				field11054 = (field11054 + 1) % 100;
				String var561 = class107.method10347(Statics.method5939(var2));
				int var562 = var556.field3609 ? 7 : 3;
				if (var556.field3602 == -1) {
					ChatHistory.method15054(var562, 0, var550, var551, var550, var561, null, -1, var556);
				} else {
					ChatHistory.method15054(var562, 0, TextUtil.imgTag(var556.field3602) + var550, TextUtil.imgTag(var556.field3602) + var551, var550, var561, null, -1, var556);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.POINTLIGHT_INTENSITY == arg0.field796) {
			int var563 = var2.g2_alt2();
			int var564 = var2.g2_alt2();
			int var565 = var2.g1();
			if (var565 == 255) {
				var565 = -1;
			}
			world.method7743().method8757(var564, var565, var563);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.STORE_SERVERPERM_VARCS_ACK == arg0.field796) {
			Statics.field7228.method16413();
			arg0.field796 = null;
			return false;
		} else if (ServerProt.CREATE_CHECK_EMAIL_REPLY == arg0.field796) {
			int var566 = var2.g1();
			CheckEmailReply var567 = (CheckEmailReply) class686.method1897(Statics.method4289(), var566);
			if (var567 == null) {
				var567 = CheckEmailReply.field8402;
			}
			AccountCreationManager.method3581(var567);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_MOVETO == arg0.field796) {
			int var568 = var2.g1_alt2();
			int var569 = var2.g1_alt1();
			int var570 = var2.g1();
			int var571 = var2.g1_alt3();
			int var572 = var2.g2() << 2;
			incrementVerifyId();
			method15723(var568, var570, var572, var569, var571, true);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOC_ADD_CHANGE == arg0.field796) {
			method9605(ZoneProt.field3622);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETTEXTFONT == arg0.field796) {
			int var573 = var2.g4_alt1();
			int var574 = var2.g4_alt3();
			incrementVerifyId();
			DelayedStateChange.method16659(var573, var574);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_OPENSUB == arg0.field796) {
			int var575 = var2.g4_alt2();
			int var576 = var2.g4_alt1();
			int var577 = var2.g1_alt2();
			int var578 = var2.g4s();
			int var579 = var2.g2();
			int var580 = var2.g4_alt2();
			int var581 = var2.g4_alt2();
			incrementVerifyId();
			method4489(var576, new SubInterface(var579, var577), new int[] { var581, var580, var575, var578 }, false);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.SHOW_FACE_HERE == arg0.field796) {
			int var582 = var2.g1_alt3();
			incrementVerifyId();
			field10921 = var582;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VARBIT_LARGE == arg0.field796) {
			int var583 = var2.g2_alt2();
			int var584 = var2.g4_alt1();
			Statics.field7410.field632.method9629((VarBitType) Statics.field8736.get(var583), var584);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CHAT_FILTER_SETTINGS == arg0.field796) {
			field11029 = var2.g1_alt2();
			field11050 = var2.g1_alt2();
			arg0.field796 = null;
			return true;
		} else if (ServerProt.REFLECTION_CHECKER == arg0.field796) {
			class780.method10680(var2, arg0.field797);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_FRIENDCHAT_CHANNEL_FULL == arg0.field796) {
			field10936 = field11058;
			if (arg0.field797 == 0) {
				field11055 = null;
				field11030 = null;
				Statics.field7421 = 0;
				Statics.field9267 = null;
				arg0.field796 = null;
				return true;
			}
			field11030 = var2.gjstr();
			boolean var585 = var2.g1() == 1;
			if (var585) {
				var2.gjstr();
			}
			field11055 = var2.gjstr();
			Statics.field2154 = var2.g1b();
			int var586 = var2.g1();
			if (var586 == 255) {
				arg0.field796 = null;
				return true;
			}
			Statics.field7421 = var586;
			FriendChatUser[] var587 = new FriendChatUser[100];
			for (int var588 = 0; var588 < Statics.field7421; var588++) {
				var587[var588] = new FriendChatUser();
				var587[var588].field756 = var2.gjstr();
				boolean var589 = var2.g1() == 1;
				if (var589) {
					var587[var588].field757 = var2.gjstr();
				} else {
					var587[var588].field757 = var587[var588].field756;
				}
				var587[var588].field755 = class795.method15191(var587[var588].field757, Statics.field10782);
				var587[var588].field758 = var2.g2();
				var587[var588].field760 = var2.g1b();
				var587[var588].field759 = var2.gjstr();
				if (var587[var588].field757.equals(Statics.field4490.field12062)) {
					Statics.field1914 = var587[var588].field760;
				}
			}
			boolean var590 = false;
			int var591 = Statics.field7421;
			while (var591 > 0) {
				boolean var592 = true;
				var591--;
				for (int var593 = 0; var593 < var591; var593++) {
					if (var587[var593].field755.compareTo(var587[var593 + 1].field755) > 0) {
						FriendChatUser var594 = var587[var593];
						var587[var593] = var587[var593 + 1];
						var587[var593 + 1] = var594;
						var592 = false;
					}
				}
				if (var592) {
					break;
				}
			}
			Statics.field9267 = var587;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.PROJANIM_SPECIFIC == arg0.field796) {
			int var595 = var2.g2_alt1();
			byte var596 = var2.g1b_alt2();
			int var597 = var2.g2_alt3();
			int var598 = var2.g2();
			int var599 = var2.g2_alt2();
			int var600 = var2.g1_alt2();
			if (var600 == 255) {
				var600 = -1;
			}
			int var601 = var2.g2s_alt1();
			int var602 = var2.g1_alt3();
			int var603 = var2.g1();
			int var604 = var2.g2s_alt1();
			int var605 = var2.g2();
			byte var606 = var2.g1b_alt3();
			int var607 = var2.g1_alt1() * 4;
			int var608 = var2.g1();
			int var609 = var2.g2_alt1();
			boolean var610 = (var602 & 0x1) != 0;
			boolean var611 = (var602 & 0x2) != 0;
			int var612 = var611 ? var602 >> 2 : -1;
			int var613;
			if (var611) {
				var613 = (byte) var608;
			} else {
				var613 = var608 * 4;
			}
			CoordGrid var614 = world.method7727();
			int var615 = var595 - var614.field7426 * 2;
			int var616 = var605 - var614.field7427 * 2;
			int var617 = var596 + var615;
			int var618 = var606 + var616;
			if (var615 >= 0 && var616 >= 0 && var615 < world.method7728() * 2 && var616 < world.method7728() * 2 && var617 >= 0 && var618 >= 0 && var617 < world.method7758() * 2 && var618 < world.method7758() * 2 && var609 != 65535) {
				int var619 = var615 * 256;
				int var620 = var616 * 256;
				int var621 = var617 * 256;
				int var622 = var618 * 256;
				int var623 = var613 << 2;
				int var624 = var607 << 2;
				int var625 = var599 << 2;
				method3621(var609, var601, var604, var612, var623, var624, var619, var620, var621, var622, var597, var598, var600, var625, var610, 0, var603);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_OPENSUB_ACTIVE_NPC == arg0.field796) {
			int var626 = var2.g2_alt3();
			int var627 = var2.g4_alt1();
			int var628 = var2.g4_alt3();
			int var629 = var2.g4_alt3();
			int var630 = var2.g2_alt1();
			int var631 = var2.g1();
			int var632 = var2.g4s();
			int var633 = var2.g4_alt1();
			incrementVerifyId();
			method4489(var633, new class1191(var626, var631, var630), new int[] { var627, var628, var632, var629 }, false);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLANSETTINGS_DELTA == arg0.field796) {
			field10818 = field11058;
			boolean var634 = var2.g1() == 1;
			ClanSettingsDelta var635 = new ClanSettingsDelta(var2);
			ClanSettings var636;
			if (var634) {
				var636 = Statics.field1890;
			} else {
				var636 = Statics.field6867;
			}
			var635.method5333(var636);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CHANGE_LOBBY == arg0.field796) {
			String var637 = var2.gjstr();
			int var638 = var2.g2();
			int var639 = var2.g2();
			int var640 = var2.g2();
			Statics.lobby.host = var637;
			Statics.lobby.node = var638;
			Statics.lobby.port = var639;
			Statics.lobby.port2 = var640;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOC_CUSTOMISE == arg0.field796) {
			method9605(ZoneProt.field3623);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPOSITION == arg0.field796) {
			int var641 = var2.g2s_alt1();
			int var642 = var2.g2s_alt2();
			int var643 = var2.g4_alt1();
			incrementVerifyId();
			DelayedStateChange.method4400(var643, var641, var642);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.REDUCE_PLAYER_ATTACK_PRIORITY == arg0.field796) {
			field10954 = (AttackOpPriority) class686.method1897(AttackOpPriority.method10149(), var2.g1());
			if (field10954 == null) {
				field10954 = AttackOpPriority.field7908;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_SOUND_GROUP_STOP == arg0.field796) {
			int var644 = var2.g2();
			Statics.field1798.method3153(var644);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER == arg0.field796) {
			String var645 = var2.gjstr();
			boolean var646 = var2.g1() == 1;
			String var647;
			if (var646) {
				var647 = var2.gjstr();
			} else {
				var647 = var645;
			}
			int var648 = var2.g2();
			byte var649 = var2.g1b();
			boolean var650 = false;
			if (var649 == -128) {
				var650 = true;
			}
			if (var650) {
				if (Statics.field7421 == 0) {
					arg0.field796 = null;
					return true;
				}
				boolean var651 = false;
				int var652;
				for (var652 = 0; var652 < Statics.field7421 && (!Statics.field9267[var652].field757.equals(var647) || Statics.field9267[var652].field758 != var648); var652++) {
				}
				if (var652 < Statics.field7421) {
					while (var652 < Statics.field7421 - 1) {
						Statics.field9267[var652] = Statics.field9267[var652 + 1];
						var652++;
					}
					Statics.field7421--;
					Statics.field9267[Statics.field7421] = null;
				}
			} else {
				String var653 = var2.gjstr();
				FriendChatUser var654 = new FriendChatUser();
				var654.field756 = var645;
				var654.field757 = var647;
				var654.field755 = class795.method15191(var654.field757, Statics.field10782);
				var654.field758 = var648;
				var654.field760 = var649;
				var654.field759 = var653;
				int var655;
				for (var655 = Statics.field7421 - 1; var655 >= 0; var655--) {
					int var656 = Statics.field9267[var655].field755.compareTo(var654.field755);
					if (var656 == 0) {
						Statics.field9267[var655].field758 = var648;
						Statics.field9267[var655].field760 = var649;
						Statics.field9267[var655].field759 = var653;
						if (var647.equals(Statics.field4490.field12062)) {
							Statics.field1914 = var649;
						}
						field10936 = field11058;
						arg0.field796 = null;
						return true;
					}
					if (var656 < 0) {
						break;
					}
				}
				if (Statics.field7421 >= Statics.field9267.length) {
					arg0.field796 = null;
					return true;
				}
				for (int var657 = Statics.field7421 - 1; var657 > var655; var657--) {
					Statics.field9267[var657 + 1] = Statics.field9267[var657];
				}
				if (Statics.field7421 == 0) {
					Statics.field9267 = new FriendChatUser[100];
				}
				Statics.field9267[var655 + 1] = var654;
				Statics.field7421++;
				if (var647.equals(Statics.field4490.field12062)) {
					Statics.field1914 = var649;
				}
			}
			field10936 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETANIM == arg0.field796) {
			int var658 = var2.g4s();
			int var659 = var2.g4_alt3();
			incrementVerifyId();
			Statics.method3073(var658, var659);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_MOVE_COLUMN == arg0.field796) {
			if (!field11095) {
				try {
					int var660 = var2.g1_alt2();
					int var661 = var2.g1();
					int var662 = var2.g1();
					field11094.method3263(var661).method3356(var660, var662);
				} catch (RuntimeException var727) {
					JagException.method9845(null, var727);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETCLICKMASK == arg0.field796) {
			int var664 = var2.g4_alt3();
			boolean var665 = var2.g1_alt2() == 1;
			incrementVerifyId();
			DelayedStateChange.method8279(var664, var665);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TELEMETRY_GRID_ADD_COLUMN == arg0.field796) {
			if (!field11095) {
				try {
					byte var666 = var2.g1b_alt1();
					int var667 = var2.g4s();
					int var668 = var2.g1_alt3();
					field11094.method3263(var668).method3296(var667, var666);
				} catch (RuntimeException var728) {
					JagException.method9845(null, var728);
					method4499(arg0);
				}
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.OBJ_DEL == arg0.field796) {
			method9605(ZoneProt.field3617);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCSTR_SMALL == arg0.field796) {
			int var670 = var2.g2();
			String var671 = var2.gjstr();
			incrementVerifyId();
			DelayedStateChange.method14051(var670, var671);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.ENVIRONMENT_OVERRIDE == arg0.field796) {
			EnvironmentOverride var672 = new EnvironmentOverride();
			boolean var673 = var672.method10382(var2);
			world.method7816().method9980(world, var673 ? var672 : null, var672.method10380());
			arg0.field796 = null;
			return true;
		} else if (ServerProt.RUNCLIENTSCRIPT == arg0.field796) {
			String var674 = var2.gjstr();
			Object[] var675 = new Object[var674.length() + 1];
			for (int var676 = var674.length() - 1; var676 >= 0; var676--) {
				if (var674.charAt(var676) == 's') {
					var675[var676 + 1] = var2.gjstr();
				} else {
					var675[var676 + 1] = Integer.valueOf(var2.g4s());
				}
			}
			var675[0] = Integer.valueOf(var2.g4s());
			incrementVerifyId();
			HookRequest var677 = new HookRequest();
			var677.field11493 = var675;
			ScriptRunner.method1428(var677);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.DO_CHEAT == arg0.field796) {
			String var678 = var2.gjstr();
			DeveloperConsole.method18913(var678, false, false);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.OBJ_ADD == arg0.field796) {
			method9605(ZoneProt.field3621);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.NPC_HEADICON_SPECIFIC == arg0.field796) {
			int var679 = var2.g4s();
			int var680 = var2.g2s();
			int var681 = var2.g1_alt1();
			int var682 = var2.g2_alt3();
			ObjectWrapper var683 = (ObjectWrapper) field10838.method14495((long) var682);
			if (var683 != null) {
				NpcEntity var684 = (NpcEntity) var683.field11436;
				if (var684.field12080 == null) {
					var684.field12080 = new NpcTypeHeadIconSet(var684.field12083);
				}
				var684.field12080.field2682[var681] = var679;
				var684.field12080.field2681[var681] = (short) var680;
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.TRIGGER_ONDIALOGABORT == arg0.field796) {
			if (field10978 != -1) {
				Statics.method1023(field10978, 0);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETSCROLLPOS == arg0.field796) {
			int var685 = var2.g4s();
			int var686 = var2.g2_alt2();
			incrementVerifyId();
			DelayedStateChange.method5081(var685, var686);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETNPCHEAD == arg0.field796) {
			int var687 = var2.g4_alt3();
			int var688 = var2.g4_alt2();
			incrementVerifyId();
			DelayedStateChange.method17439(var687, 2, var688, -1);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.LOGOUT_TRANSFER == arg0.field796) {
			int var689 = var2.g2();
			String var690 = var2.gjstr();
			int var691 = var2.g2();
			int var692 = var2.g2();
			boolean var693 = var2.g1() == 1;
			Statics.field8753 = Statics.field8755;
			Statics.field488 = var693;
			class750.method9401(var689, var690, var691, var692);
			Object var694 = null;
			setState(19);
			arg0.field796 = null;
			return false;
		} else if (ServerProt.VORBIS_SOUND_GROUP_START == arg0.field796) {
			int var695 = var2.g2();
			Statics.field1798.method3208(var695);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.PLAYER_GROUP_FULL == arg0.field796) {
			field11028 = field11058;
			if (arg0.field797 == 0) {
				Statics.field6721 = null;
			} else {
				Statics.field6721 = new PlayerGroup(0L, var2, true, field10837);
			}
			arg0.field796 = null;
			return true;
		} else if (ServerProt.VORBIS_SOUND == arg0.field796) {
			int var696 = var2.g2();
			if (var696 == 65535) {
				var696 = -1;
			}
			int var697 = var2.g1();
			int var698 = var2.g2();
			int var699 = var2.g1();
			int var700 = var2.g2();
			Statics.field1798.method3191(class173.field1832, var696, var697, var699, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var700, var698);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAM_LOOKAT == arg0.field796) {
			int var701 = var2.g1_alt2();
			int var702 = var2.g1();
			int var703 = var2.g1_alt3();
			int var704 = var2.g1_alt2();
			int var705 = var2.g2_alt2() << 2;
			incrementVerifyId();
			method14706(var701, var702, var705, var704, var703);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETRETEX == arg0.field796) {
			int var706 = var2.g2_alt3();
			int var707 = var2.g2_alt1();
			int var708 = var2.g4s();
			int var709 = var2.g1_alt1();
			incrementVerifyId();
			DelayedStateChange.method5395(var708, var709, var706, var707);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.REBUILD_NORMAL == arg0.field796) {
			PacketBit var710 = new PacketBit(arg0.field797);
			System.arraycopy(arg0.field795.data, arg0.field795.pos, var710.data, 0, arg0.field797);
			method3652();
			if (Statics.field688.unknown7.method18750() == 1) {
				Statics.field3183.method7680(new RebuildRequest(RebuildType.field5071, var710));
			} else {
				world.method7749(new RebuildRequest(RebuildType.field5071, var710));
			}
			arg0.field796 = null;
			return false;
		} else if (ServerProt.SET_TARGET == arg0.field796) {
			field10787 = var2.g2s_alt2();
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CREATE_CHECK_NAME_REPLY == arg0.field796) {
			int var711 = var2.g1();
			CheckNameReply var712 = (CheckNameReply) class686.method1897(CheckNameReply.method6019(), var711);
			if (var712 == null) {
				var712 = CheckNameReply.field8404;
			}
			AccountCreationManager.method717(var712);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.IF_SETPLAYERMODEL_OTHER == arg0.field796) {
			int var713 = var2.g2_alt1();
			int var714 = var2.g4s();
			int var715 = var2.g4s();
			incrementVerifyId();
			DelayedStateChange.method17439(var714, 5, var713, var715);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CAMERA_UPDATE == arg0.field796) {
			Statics.field9155.method16604(var2, arg0.field797);
			field10907 = field11058;
			arg0.field796 = null;
			return true;
		} else if (ServerProt.EXECUTE_CLIENT_CHEAT == arg0.field796) {
			int var716 = var2.g2();
			DeveloperConsole.method16614(var716);
			arg0.field796 = null;
			return true;
		} else if (ServerProt.CLIENT_SETVARCSTR_LARGE == arg0.field796) {
			int var717 = var2.g2();
			String var718 = var2.gjstr();
			incrementVerifyId();
			DelayedStateChange.method14051(var717, var718);
			arg0.field796 = null;
			return true;
		} else {
			JagException.method9845((arg0.field796 == null ? -1 : arg0.field796.field4021) + TextUtil.COMMA + (arg0.field806 == null ? -1 : arg0.field806.field4021) + TextUtil.COMMA + (arg0.field805 == null ? -1 : arg0.field805.field4021) + " " + arg0.field797, new RuntimeException());
			logout(false);
			return true;
		}
	}

	@ObfuscatedName("wn.iy(Lnk;I)V")
	public static final void method9605(ZoneProt arg0) {
		PacketBit var1 = field10849.field795;
		if (ZoneProt.field3615 == arg0) {
			int var2 = var1.g1();
			CoordGrid var3 = world.method7727();
			int var4 = (var2 & 0x7) + Statics.field10546;
			int var5 = var3.field7427 + var4;
			int var6 = (var2 >> 4 & 0x7) + Statics.field1701;
			int var7 = var3.field7426 + var6;
			int var8 = var1.g2();
			int var9 = var1.g2();
			int var10 = var1.g2();
			if (field10964 != null) {
				class966 var11 = (class966) field10964.method14495((long) (Statics.field10260 << 28 | var5 << 14 | var7));
				if (var11 != null) {
					for (class965 var12 = (class965) var11.field11263.method14191(); var12 != null; var12 = (class965) var11.field11263.method14161()) {
						if (var12.field11261 == var8 && var12.field11260 == var9) {
							var12.method8440();
							var12.field11260 = var10;
							Statics.method540(Statics.field10260, var7, var5, var12);
							break;
						}
					}
					if (var6 >= 0 && var4 >= 0 && var6 < world.method7728() && var4 < world.method7758()) {
						method7359(Statics.field10260, var6, var4);
					}
				}
			}
		} else if (ZoneProt.field3625 == arg0) {
			int var13 = var1.g1();
			int var14 = var1.g1_alt3();
			int var15 = (var14 >> 4 & 0x7) + Statics.field1701;
			int var16 = (var14 & 0x7) + Statics.field10546;
			LocPositionAdjustment var17 = new LocPositionAdjustment(var1, var13, false);
			int var18 = field10914[var17.field7541];
			if (world.method7828().method7888() || var15 >= 0 && var16 >= 0 && var15 < world.method7728() && var16 < world.method7758()) {
				class962.method4653(Statics.field10260, var15, var16, var18, -1, var17.field7541, var17.field7540, var17.field7539);
			}
		} else if (ZoneProt.field3626 == arg0) {
			int var19 = var1.g1();
			int var20 = (var19 >> 4 & 0x7) + Statics.field1701;
			int var21 = (var19 & 0x7) + Statics.field10546;
			int var22 = var1.g2();
			if (var22 == 65535) {
				var22 = -1;
			}
			int var23 = var1.g1();
			int var24 = var23 >> 4 & 0xF;
			int var25 = var23 & 0x7;
			int var26 = var1.g1();
			int var27 = var1.g1();
			int var28 = var1.g2();
			if (world.method7828() != RebuildType.field5064 && (var20 >= 0 && var21 >= 0 && var20 < world.method7728() && var21 < world.method7758())) {
				int var29 = var24 + 1;
				if (Statics.field4490.field10450[0] >= var20 - var29 && Statics.field4490.field10450[0] <= var20 + var29 && Statics.field4490.field10448[0] >= var21 - var29 && Statics.field4490.field10448[0] <= var21 + var29) {
					Vector3 var30 = new Vector3((float) (var20 << 9), 0.0F, (float) (var21 << 9));
					int var31 = Statics.field10260;
					Statics.field1798.method3191(class173.field1832, var22, var25, var27, SubBussType.field1805.method3034(), class174.field1838, 0.0F, (float) (var24 << 9), var30, var31, var28, var26);
				}
			}
		} else if (ZoneProt.field3618 == arg0) {
			int var32 = var1.g1();
			int var33 = (var32 >> 4 & 0x7) + Statics.field1701;
			int var34 = (var32 & 0x7) + Statics.field10546;
			int var35 = var1.g2();
			if (var35 == 65535) {
				var35 = -1;
			}
			int var36 = var1.g1();
			int var37 = var36 >> 4 & 0xF;
			int var38 = var36 & 0x7;
			int var39 = var1.g1();
			int var40 = var1.g1();
			int var41 = var1.g2();
			boolean var42 = var1.g1() == 1;
			if (world.method7828() != RebuildType.field5064 && (var33 >= 0 && var34 >= 0 && var33 < world.method7728() && var34 < world.method7758())) {
				int var43 = var37 + 1;
				if (Statics.field4490.field10450[0] >= var33 - var43 && Statics.field4490.field10450[0] <= var33 + var43 && Statics.field4490.field10448[0] >= var34 - var43 && Statics.field4490.field10448[0] <= var34 + var43) {
					Vector3 var44 = new Vector3((float) (var33 << 9), 0.0F, (float) (var34 << 9));
					int var45 = Statics.field10260;
					int var46 = var42 ? SubBussType.field1801.method3034() : SubBussType.field1805.method3034();
					Statics.field1798.method3191(class173.field1832, var35, var38, var40, var46, class174.field1838, 0.0F, (float) (var37 << 9), var44, var45, var41, var39);
				}
			}
		} else if (ZoneProt.field3624 == arg0) {
			int var47 = var1.g1();
			int var48 = (var47 >> 4 & 0xF) + Statics.field1701 * 2;
			int var49 = (var47 & 0xF) + Statics.field10546 * 2;
			int var50 = var1.g1();
			boolean var51 = (var50 & 0x1) != 0;
			boolean var52 = (var50 & 0x2) != 0;
			int var53 = var52 ? var50 >> 2 : -1;
			int var54 = var48 + var1.g1b();
			int var55 = var49 + var1.g1b();
			int var56 = var1.g2s();
			int var57 = var1.g2s();
			int var58 = var1.g2();
			int var59 = var1.g1();
			int var60;
			if (var52) {
				var60 = (byte) var59;
			} else {
				var60 = var59 * 4;
			}
			int var61 = var1.g1() * 4;
			int var62 = var1.g2();
			int var63 = var1.g2();
			int var64 = var1.g1();
			int var65 = var1.g2();
			if (var64 == 255) {
				var64 = -1;
			}
			int var66 = var1.g2s();
			if (world.method7828() != RebuildType.field5064 && (var48 >= 0 && var49 >= 0 && var48 < world.method7728() * 2 && var49 < world.method7728() * 2 && var54 >= 0 && var55 >= 0 && var54 < world.method7758() * 2 && var55 < world.method7758() * 2 && var58 != 65535)) {
				int var67 = var48 * 256;
				int var68 = var49 * 256;
				int var69 = var54 * 256;
				int var70 = var55 * 256;
				int var71 = var60 << 2;
				int var72 = var61 << 2;
				int var73 = var65 << 2;
				method3621(var58, var56, var57, var53, var71, var72, var67, var68, var69, var70, var62, var63, var64, var73, var51, var66, Statics.field10260);
			}
		} else if (ZoneProt.field3612 == arg0) {
			var1.g1();
			int var74 = var1.g1();
			int var75 = (var74 >> 4 & 0x7) + Statics.field1701;
			int var76 = (var74 & 0x7) + Statics.field10546;
			int var77 = var1.g2();
			int var78 = var1.g1();
			int var79 = var1.g3();
			String var80 = var1.gjstr();
			if (world.method7828() != RebuildType.field5064) {
				method8476(Statics.field10260, var75, var76, var78, var77, var79, var80);
			}
		} else if (ZoneProt.field3622 == arg0) {
			int var81 = var1.g1();
			int var82 = var1.g4_alt3();
			int var83 = var1.g1_alt2();
			int var84 = (var83 >> 4 & 0x7) + Statics.field1701;
			int var85 = (var83 & 0x7) + Statics.field10546;
			LocPositionAdjustment var86 = new LocPositionAdjustment(var1, var81, false);
			int var87 = field10914[var86.field7541];
			if (world.method7828().method7888() || var84 >= 0 && var85 >= 0 && var84 < world.method7728() && var85 < world.method7758()) {
				class962.method4653(Statics.field10260, var84, var85, var87, var82, var86.field7541, var86.field7540, var86.field7539);
			}
		} else if (ZoneProt.field3619 == arg0) {
			int var88 = var1.g4s();
			int var89 = var1.g1();
			((LocType) world.method7750().get(var88)).method9473(var89);
		} else if (ZoneProt.field3614 == arg0) {
			int var90 = var1.g1();
			boolean var91 = (var90 & 0x80) != 0;
			int var92 = (var90 >> 3 & 0x7) + Statics.field1701;
			int var93 = (var90 & 0x7) + Statics.field10546;
			int var94 = var92 + var1.g1b();
			int var95 = var93 + var1.g1b();
			int var96 = var1.g2s();
			int var97 = var1.g2();
			int var98 = var1.g1() * 4;
			int var99 = var1.g1() * 4;
			int var100 = var1.g2();
			int var101 = var1.g2();
			int var102 = var1.g1();
			int var103 = var1.g2();
			int var104 = var1.g2s();
			if (var102 == 255) {
				var102 = -1;
			}
			if (world.method7828() != RebuildType.field5064 && (var92 >= 0 && var93 >= 0 && var92 < world.method7728() && var93 < world.method7758() && var94 >= 0 && var95 >= 0 && var94 < world.method7728() && var95 < world.method7758() && var97 != 65535)) {
				int var105 = var92 * 512 + 256;
				int var106 = var93 * 512 + 256;
				int var107 = var94 * 512 + 256;
				int var108 = var95 * 512 + 256;
				int var109 = var98 << 2;
				int var110 = var99 << 2;
				int var111 = var103 << 2;
				class1234 var112 = new class1234(world.method7743(), var97, Statics.field10260, Statics.field10260, var105, var106, var109, field10903 + var100, field10903 + var101, var102, var111, 0, var96, var110, var91, -1, var104);
				var112.method19725(var107, var108, method3660(var107, var108, Statics.field10260) - var110, field10903 + var100);
				field10965.method14153(new class1173(var112));
			}
		} else if (ZoneProt.field3617 == arg0) {
			int var113 = var1.g2();
			int var114 = var1.g1_alt3();
			CoordGrid var115 = world.method7727();
			int var116 = (var114 & 0x7) + Statics.field10546;
			int var117 = var115.field7427 + var116;
			int var118 = (var114 >> 4 & 0x7) + Statics.field1701;
			int var119 = var115.field7426 + var118;
			class966 var120 = (class966) field10964.method14495((long) (Statics.field10260 << 28 | var117 << 14 | var119));
			if (var120 != null) {
				for (class965 var121 = (class965) var120.field11263.method14191(); var121 != null; var121 = (class965) var120.field11263.method14161()) {
					if (var121.field11261 == var113) {
						var121.method8440();
						break;
					}
				}
				if (var120.field11263.method14164()) {
					var120.method8440();
				}
				if (var118 >= 0 && var116 >= 0 && var118 < world.method7728() && var116 < world.method7758()) {
					method7359(Statics.field10260, var118, var116);
				}
			}
		} else if (ZoneProt.field3620 == arg0) {
			int var122 = var1.g2_alt3();
			int var123 = var1.g1();
			CoordGrid var124 = world.method7727();
			int var125 = (var123 & 0x7) + Statics.field10546;
			int var126 = var124.field7427 + var125;
			int var127 = (var123 >> 4 & 0x7) + Statics.field1701;
			int var128 = var124.field7426 + var127;
			int var129 = var1.g2_alt2();
			int var130 = var1.g2();
			if (field10945 != var130) {
				boolean var131 = var127 >= 0 && var125 >= 0 && var127 < world.method7728() && var125 < world.method7758();
				if (var131 || world.method7828().method7888()) {
					Statics.method540(Statics.field10260, var128, var126, new class965(var129, var122));
					if (var131) {
						method7359(Statics.field10260, var127, var125);
					}
				}
			}
		} else if (ZoneProt.field3616 == arg0) {
			int var132 = var1.g4_alt1();
			int var133 = var1.g1_alt1();
			int var134 = var1.g1_alt3();
			int var135 = (var134 >> 4 & 0x7) + Statics.field1701;
			int var136 = (var134 & 0x7) + Statics.field10546;
			int var137 = var1.g1_alt3();
			LocPositionAdjustment var138 = new LocPositionAdjustment(var1, var133, false);
			int var139 = field10914[var138.field7541];
			if (world.method7828() != RebuildType.field5064) {
				method8895(Statics.field10260, var135, var136, var139, var138.field7541, var138.field7540, var138.field7539, var132, var137);
			}
		} else if (ZoneProt.field3623 == arg0) {
			int var140 = var1.g1();
			int var141 = var1.g4_alt3();
			int var142 = var1.g1_alt2();
			int var143 = var1.g1_alt3();
			int var144 = (var143 >> 4 & 0x7) + Statics.field1701;
			int var145 = (var143 & 0x7) + Statics.field10546;
			LocPositionAdjustment var146 = new LocPositionAdjustment(var1, var142, false);
			int var147 = field10914[var146.field7541];
			if (class601.field7564.field7562 == var146.field7541) {
				var146.field7541 = class601.field7563.field7562;
			}
			if ((var140 & 0x1) == 1) {
				class962.method6816(Statics.field10260, var144, var145, var147, var141, var146.field7541, null);
			} else {
				int[] var148 = null;
				if ((var140 & 0x2) == 2) {
					int var149 = var1.g1();
					var148 = new int[var149];
					for (int var150 = 0; var150 < var149; var150++) {
						var148[var150] = var1.g4s();
					}
				}
				short[] var151 = null;
				if ((var140 & 0x4) == 4) {
					int var152 = var1.g1();
					var151 = new short[var152];
					for (int var153 = 0; var153 < var152; var153++) {
						var151[var153] = (short) var1.g2();
					}
				}
				short[] var154 = null;
				if ((var140 & 0x8) == 8) {
					int var155 = var1.g1();
					var154 = new short[var155];
					for (int var156 = 0; var156 < var155; var156++) {
						var154[var156] = (short) var1.g2();
					}
				}
				class962.method6816(Statics.field10260, var144, var145, var147, var141, var146.field7541, new class597(class962.field11243, var148, var151, var154));
				class962.field11243++;
			}
		} else if (ZoneProt.field3613 == arg0) {
			int var157 = var1.g1();
			int var158 = (var157 >> 4 & 0x7) + Statics.field1701;
			int var159 = (var157 & 0x7) + Statics.field10546;
			int var160 = var1.g2();
			if (var160 == 65535) {
				var160 = -1;
			}
			int var161 = var1.g2();
			int var162 = var1.g2();
			int var163 = var1.g1();
			int var164 = var1.g2s();
			if (world.method7828() != RebuildType.field5064 && (var158 >= 0 && var159 >= 0 && var158 < world.method7728() && var159 < world.method7758())) {
				if (var160 == -1) {
					class1170 var165 = (class1170) field10966.method14495((long) (var158 << 16 | var159));
					if (var165 != null) {
						var165.field12264.method19749();
						var165.method8440();
					}
				} else {
					int var166 = var158 * 512 + 256;
					int var167 = var159 * 512 + 256;
					int var168 = Statics.field10260;
					if (var168 < 3 && world.method7793().method7105(var158, var159)) {
						var168++;
					}
					class1235 var169 = new class1235(world.method7743(), var160, var162, Statics.field10260, var168, var166, method3660(var166, var167, Statics.field10260) - var161, var167, var158, var158, var159, var159, var163, false, var164);
					field10966.method14501(new class1170(var169), (long) (var158 << 16 | var159));
				}
			}
		} else if (ZoneProt.field3621 == arg0) {
			int var170 = var1.g1_alt3();
			CoordGrid var171 = world.method7727();
			int var172 = (var170 & 0x7) + Statics.field10546;
			int var173 = var171.field7427 + var172;
			int var174 = (var170 >> 4 & 0x7) + Statics.field1701;
			int var175 = var171.field7426 + var174;
			int var176 = var1.g2_alt3();
			int var177 = var1.g2_alt1();
			boolean var178 = var174 >= 0 && var172 >= 0 && var174 < world.method7728() && var172 < world.method7758();
			if (var178 || world.method7828().method7888()) {
				Statics.method540(Statics.field10260, var175, var173, new class965(var176, var177));
				if (var178) {
					method7359(Statics.field10260, var174, var172);
				}
			}
		} else {
			JagException.method9845("" + arg0, new RuntimeException());
			logout(false);
		}
	}

	@ObfuscatedName("qv.iz(IIII)V")
	public static void method7359(int arg0, int arg1, int arg2) {
		CoordGrid var3 = world.method7727();
		int var4 = var3.field7426 + arg1;
		int var5 = var3.field7427 + arg2;
		if (world.method7743() == null || world.method7828() == RebuildType.field5064 || arg1 < 0 || arg2 < 0 || arg1 >= world.method7728() || arg2 >= world.method7758()) {
			return;
		}
		long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
		class966 var8 = (class966) field10964.method14495(var6);
		if (var8 == null) {
			world.method7743().method8742(arg0, arg1, arg2);
			return;
		}
		class965 var9 = (class965) var8.field11263.method14191();
		if (var9 == null) {
			world.method7743().method8742(arg0, arg1, arg2);
			return;
		}
		int var10 = -1;
		int var11 = -1;
		int var12 = -1;
		Matrix4x3 var13 = null;
		Matrix4x3 var14 = null;
		Matrix4x3 var15 = null;
		ObjStackEntity var16 = (ObjStackEntity) world.method7743().method8742(arg0, arg1, arg2);
		if (var16 == null) {
			var16 = new ObjStackEntity(world.method7743(), arg1 << 265, world.method7743().field6913[arg0].method1529(arg1, arg2), arg2 << 265, arg0, arg0);
		} else {
			var10 = var16.field12580;
			var11 = var16.field12569;
			var12 = var16.field12573;
			var13 = var16.field12571;
			var14 = var16.field12568;
			var15 = var16.field12577;
			var16.field12573 = -1;
			var16.field12569 = -1;
			var16.field11716 = world.method7743();
		}
		var16.field12580 = var9.field11261;
		var16.field12570 = var9.field11260;
		label98: while (true) {
			class965 var18 = (class965) var8.field11263.method14161();
			if (var18 == null) {
				break;
			}
			if (var16.field12580 != var18.field11261) {
				var16.field12569 = var18.field11261;
				var16.field12572 = var18.field11260;
				while (true) {
					class965 var19 = (class965) var8.field11263.method14161();
					if (var19 == null) {
						break label98;
					}
					if (var16.field12580 != var19.field11261 && var16.field12569 != var19.field11261) {
						var16.field12573 = var19.field11261;
						var16.field12583 = var19.field11260;
					}
				}
			}
		}
		int var20 = method3660((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
		var16.method10538((float) (arg1 << 265), (float) var20, (float) (arg2 << 265));
		if (var16.field12580 != var10) {
			if (var16.field12580 == var11) {
				var16.field12571 = var14;
			} else if (var16.field12580 == var12) {
				var16.field12571 = var15;
			} else if (((ObjType) Statics.field1842.get(var16.field12580)).field8697) {
				var16.field12571 = ObjStackEntity.method820();
			} else {
				var16.field12571 = null;
			}
		}
		if (var16.field12569 == -1) {
			var16.field12568 = null;
		} else if (var16.field12569 != var11) {
			if (var16.field12569 == var10) {
				var16.field12568 = var13;
			} else if (var16.field12569 == var12) {
				var16.field12568 = var15;
			} else if (((ObjType) Statics.field1842.get(var16.field12569)).field8697) {
				var16.field12568 = ObjStackEntity.method820();
			} else {
				var16.field12568 = null;
			}
		}
		if (var16.field12573 == -1) {
			var16.field12577 = null;
		} else if (var16.field12573 != var12) {
			if (var16.field12573 == var10) {
				var16.field12577 = var13;
			} else if (var16.field12573 == var11) {
				var16.field12577 = var14;
			} else if (((ObjType) Statics.field1842.get(var16.field12573)).field8697) {
				var16.field12577 = ObjStackEntity.method820();
			} else {
				var16.field12577 = null;
			}
		}
		var16.field12578 = 0;
		var16.field11717 = (byte) arg0;
		var16.field11714 = (byte) arg0;
		if (world.method7793().method7105(arg1, arg2)) {
			var16.field11714++;
		}
		world.method7743().method8718(arg0, arg1, arg2, var20, var16);
	}

	@ObfuscatedName("qp.ik(II)V")
	public static final void method7099(int arg0) {
		field10846 = 0;
		field10876 = 0;
		field10815++;
		method8430();
		method3366(arg0);
		method6243();
		boolean var1 = false;
		for (int var2 = 0; var2 < field10846; var2++) {
			int var3 = field10847[var2];
			ObjectWrapper var4 = (ObjectWrapper) field10838.method14495((long) var3);
			NpcEntity var5 = (NpcEntity) var4.field11436;
			if (field10815 != var5.field10440) {
				if (MiniMenu.field562 && MiniMenu.method8494(var3)) {
					MiniMenu.method6031();
				}
				if (var5.field12083.method4556()) {
					class975.method10111(var5);
				}
				var5.method19156(null);
				var4.method8440();
				var1 = true;
			}
		}
		if (var1) {
			int var6 = field10906;
			field10906 = field10838.method14498();
			int var7 = 0;
			Iterator var8 = field10838.iterator();
			while (var8.hasNext()) {
				ObjectWrapper var9 = (ObjectWrapper) var8.next();
				field10839[var7++] = var9;
			}
			for (int var10 = field10906; var10 < var6; var10++) {
				field10839[var10] = null;
			}
			PositionMode var11 = Statics.field9155.method4780();
			if (PositionMode.field2815 == var11) {
				PositionEntity var12 = (PositionEntity) Statics.field9155.method4709();
				var12.method16684();
			}
			LookatMode var13 = Statics.field9155.method4743();
			if (LookatMode.field2788 == var13) {
				LookatEntity var14 = (LookatEntity) Statics.field9155.method4797();
				var14.method18815();
			}
		}
		if (field10849.field797 != field10849.field795.pos) {
			throw new RuntimeException(field10849.field795.pos + " " + field10849.field797);
		}
		for (int var15 = 0; var15 < field11011; var15++) {
			if (field10838.method14495((long) field11036[var15]) == null) {
				throw new RuntimeException(var15 + " " + field11011);
			}
		}
		if (field10906 - field11011 != 0) {
			throw new RuntimeException("" + (field10906 - field11011));
		}
		for (int var16 = 0; var16 < field10906; var16++) {
			if (((PathingEntity) field10839[var16].field11436).field10440 != field10815) {
				throw new RuntimeException("" + ((PathingEntity) field10839[var16].field11436).field10406);
			}
		}
	}

	@ObfuscatedName("tr.im(I)V")
	public static final void method8430() {
		PacketBit var0 = field10849.field795;
		var0.accessBits();
		int var1 = var0.gBit(8);
		if (var1 < field11011) {
			for (int var2 = var1; var2 < field11011; var2++) {
				field10847[++field10846 - 1] = field11036[var2];
			}
		}
		if (var1 > field11011) {
			throw new RuntimeException();
		}
		field11011 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			int var4 = field11036[var3];
			NpcEntity var5 = (NpcEntity) ((ObjectWrapper) field10838.method14495((long) var4)).field11436;
			int var6 = var0.gBit(1);
			if (var6 == 0) {
				field11036[++field11011 - 1] = var4;
				var5.field10440 = field10815;
			} else {
				int var7 = var0.gBit(2);
				if (var7 == 0) {
					field11036[++field11011 - 1] = var4;
					var5.field10440 = field10815;
					field10844[++field10876 - 1] = var4;
				} else if (var7 == 1) {
					field11036[++field11011 - 1] = var4;
					var5.field10440 = field10815;
					CompassPoint var8 = (CompassPoint) class686.method1897(CompassPoint.method9573(), var0.gBit(3));
					var5.method19168(var8, MoveSpeed.field8315.field8313);
					int var9 = var0.gBit(1);
					if (var9 == 1) {
						field10844[++field10876 - 1] = var4;
					}
				} else if (var7 == 2) {
					field11036[++field11011 - 1] = var4;
					var5.field10440 = field10815;
					if (var0.gBit(1) == 1) {
						CompassPoint var10 = (CompassPoint) class686.method1897(CompassPoint.method9573(), var0.gBit(3));
						var5.method19168(var10, MoveSpeed.field8316.field8313);
						CompassPoint var11 = (CompassPoint) class686.method1897(CompassPoint.method9573(), var0.gBit(3));
						var5.method19168(var11, MoveSpeed.field8316.field8313);
					} else {
						CompassPoint var12 = (CompassPoint) class686.method1897(CompassPoint.method9573(), var0.gBit(3));
						var5.method19168(var12, MoveSpeed.field8314.field8313);
					}
					int var13 = var0.gBit(1);
					if (var13 == 1) {
						field10844[++field10876 - 1] = var4;
					}
				} else if (var7 == 3) {
					field10847[++field10846 - 1] = var4;
				}
			}
		}
	}

	@ObfuscatedName("fy.ic(IB)V")
	public static final void method3366(int arg0) {
		PacketBit var1 = field10849.field795;
		while (var1.bitsAvailable(field10849.field797) >= 15) {
			int var2 = var1.gBit(15);
			if (var2 == 32767) {
				break;
			}
			boolean var3 = false;
			ObjectWrapper var4 = (ObjectWrapper) field10838.method14495((long) var2);
			if (var4 == null) {
				NpcEntity var5 = new NpcEntity(world.method7743());
				var5.field10406 = var2;
				var4 = new ObjectWrapper(var5);
				field10838.method14501(var4, (long) var2);
				field10839[++field10906 - 1] = var4;
				var3 = true;
			}
			NpcEntity var6 = (NpcEntity) var4.field11436;
			field11036[++field11011 - 1] = var2;
			var6.field10440 = field10815;
			if (var6.field12083 != null && var6.field12083.method4556()) {
				class975.method10111(var6);
			}
			int var7 = var1.gBit(2);
			int var8 = var1.gBit(arg0);
			if (var8 > (0x1 << arg0 - 1) - 1) {
				var8 -= 0x1 << arg0;
			}
			int var9 = var1.gBit(1);
			if (var9 == 1) {
				field10844[++field10876 - 1] = var2;
			}
			var6.method19156((NPCType) Statics.field7961.get(var1.gBit(15)));
			int var10 = var1.gBit(1);
			int var11 = var1.gBit(3) + 4 << 11 & 0x3FFF;
			int var12 = var1.gBit(arg0);
			if (var12 > (0x1 << arg0 - 1) - 1) {
				var12 -= 0x1 << arg0;
			}
			var6.method16502(var6.field12083.field2699);
			var6.field10444 = var6.field12083.field2731 << 3;
			if (var3) {
				var6.method16491(var11, true);
			}
			var6.method19159(var7, Statics.field4490.field10450[0] + var12, Statics.field4490.field10448[0] + var8, var10 == 1, var6.method16546());
			if (var6.field12083.method4556()) {
				class975.method9739(var6.field11717, var6.field10450[0], var6.field10448[0], 0, null, var6, null);
			}
			if (var3) {
				var6.method19155();
			}
		}
		var1.accessBytes();
	}

	@ObfuscatedName("on.jd(I)V")
	public static final void method6243() {
		PacketBit var0 = field10849.field795;
		for (int var1 = 0; var1 < field10876; var1++) {
			int var2 = field10844[var1];
			NpcEntity var3 = (NpcEntity) ((ObjectWrapper) field10838.method14495((long) var2)).field11436;
			var0.g2();
			int var4 = var0.g1();
			if ((var4 & 0x2) != 0) {
				var4 += var0.g1() << 8;
			}
			if ((var4 & 0x200) != 0) {
				var4 += var0.g1() << 16;
			}
			if ((var4 & 0x100000) != 0) {
				var4 += var0.g1() << 24;
			}
			if ((var4 & 0x4000000) != 0) {
				int var5 = var0.g2_alt1();
				int var6 = var0.g4_alt3();
				if (var5 == 65535) {
					var5 = -1;
				}
				int var7 = var0.g1();
				int var8 = var7 & 0x7;
				int var9 = var7 >> 3 & 0xF;
				if (var9 == 15) {
					var9 = -1;
				}
				boolean var10 = (var7 >> 7 & 0x1) == 1;
				var3.method16563(var5, var6, var8, var9, var10, 3);
			}
			if ((var4 & 0x2000) != 0) {
				int var11 = var0.g2_alt1();
				int var12 = var0.g4_alt3();
				if (var11 == 65535) {
					var11 = -1;
				}
				int var13 = var0.g1_alt3();
				int var14 = var13 & 0x7;
				int var15 = var13 >> 3 & 0xF;
				if (var15 == 15) {
					var15 = -1;
				}
				boolean var16 = (var13 >> 7 & 0x1) == 1;
				var3.method16563(var11, var12, var14, var15, var16, 1);
			}
			if ((var4 & 0x1000) != 0) {
				int var17 = var0.g1_alt3();
				int[] var18 = new int[var17];
				int[] var19 = new int[var17];
				int[] var20 = new int[var17];
				for (int var21 = 0; var21 < var17; var21++) {
					int var22 = var0.gSmart2or4null();
					var18[var21] = var22;
					var19[var21] = var0.g1();
					var20[var21] = var0.g2_alt2();
				}
				method16758(var3, var18, var19, var20);
			}
			if ((var4 & 0x4000) != 0) {
				int var23 = var0.g1_alt3();
				int[] var24 = new int[var23];
				int[] var25 = new int[var23];
				for (int var26 = 0; var26 < var23; var26++) {
					int var27 = var0.g2_alt2();
					if ((var27 & 0xC000) == 49152) {
						int var28 = var0.g2_alt3();
						var24[var26] = var27 << 16 | var28;
					} else {
						var24[var26] = var27;
					}
					var25[var26] = var0.g2();
				}
				var3.method16493(var24, var25);
			}
			if ((var4 & 0x1000000) != 0) {
				var3.field12090 = var0.g1_alt1();
			}
			if ((var4 & 0x1) != 0) {
				var3.field12074 = var0.g2_alt1();
				var3.field12075 = var0.g2_alt1();
			}
			if ((var4 & 0x80000) != 0) {
				int var29 = 0;
				if (var3.field12083.field2705 != null) {
					var29 = var3.field12083.field2705.length;
				}
				byte var30 = 0;
				if (var3.field12083.field2708 != null) {
					var29 = var3.field12083.field2708.length;
				}
				int var31 = var0.g1();
				if ((var31 & 0x1) != 1) {
					var0.pos += 2;
					int[] var32 = null;
					if ((var31 & 0x2) == 2) {
						int var33 = var0.g1();
						var32 = new int[var33];
						for (int var34 = 0; var34 < var33; var34++) {
							var32[var34] = var0.gSmart2or4null();
						}
					}
					short[] var35 = null;
					if ((var31 & 0x4) == 4) {
						var35 = new short[var29];
						for (int var36 = 0; var36 < var29; var36++) {
							var35[var36] = (short) var0.g2_alt1();
						}
					}
					short[] var37 = null;
					if ((var31 & 0x8) == 8) {
						var37 = new short[var30];
						for (int var38 = 0; var38 < var30; var38++) {
							var37[var38] = (short) var0.g2_alt3();
						}
					}
					long var39 = (long) (++NpcEntity.field12078 - 1);
					new NpcTypeCustomization(var39, var32, null, null, null, var35, var37);
				}
			}
			if ((var4 & 0x2000000) != 0) {
				int var41 = var0.g2();
				int var42 = var0.g4_alt3();
				if (var41 == 65535) {
					var41 = -1;
				}
				int var43 = var0.g1_alt2();
				int var44 = var43 & 0x7;
				int var45 = var43 >> 3 & 0xF;
				if (var45 == 15) {
					var45 = -1;
				}
				boolean var46 = (var43 >> 7 & 0x1) == 1;
				var3.method16563(var41, var42, var44, var45, var46, 4);
			}
			if ((var4 & 0x40) != 0) {
				int[] var47 = new int[4];
				for (int var48 = 0; var48 < 4; var48++) {
					var47[var48] = var0.gSmart2or4null();
				}
				int var49 = var0.g1_alt2();
				method9423(var3, var47, var49, true);
			}
			if ((var4 & 0x800000) != 0) {
				var3.field12081 = var0.g2_alt3();
				if (var3.field12081 == 65535) {
					var3.field12081 = var3.field12083.field2719;
				}
			}
			if ((var4 & 0x10) != 0) {
				if (var3.field12083.method4556()) {
					class975.method10111(var3);
				}
				var3.method19157((NPCType) Statics.field7961.get(var0.gSmart2or4null()), (var4 & 0x10000) == 0, (var4 & 0x800000) == 0, true);
				var3.method16502(var3.field12083.field2699);
				var3.field10444 = var3.field12083.field2731 << 3;
				if (var3.field12083.method4556()) {
					class975.method9739(var3.field11717, var3.field10450[0], var3.field10448[0], 0, null, var3, null);
				}
			}
			if ((var4 & 0x8000) != 0) {
				var3.field10423 = var0.g1b_alt2() * 262144;
				var3.field10425 = var0.g1b_alt1() * 262144;
				var3.field10457 = var0.g1b_alt1() * 262144;
				var3.field10426 = var0.g1b_alt2() * 262144;
				var3.field10419 = var0.g1b_alt3();
				var3.field10428 = var0.g1b_alt3();
				var3.field10429 = var0.g2() + field10903;
				var3.field10399 = var0.g2_alt1() + field10903;
				var3.field10431 = var0.g2_alt1();
				var3.field10400 = 1;
				var3.field10396 = 0;
				var3.field10423 = var3.field10423 * 262144 + var3.field10450[0] * 262144;
				var3.field10425 = var3.field10425 * 262144 + var3.field10448[0] * 262144;
				var3.field10457 = var3.field10457 * 262144 + var3.field10450[0] * 262144;
				var3.field10426 = var3.field10426 * 262144 + var3.field10448[0] * 262144;
				var3.field10419 += var3.field11717;
				var3.field10428 += var3.field11717;
			}
			if ((var4 & 0x10000000) != 0) {
				var3.field10434 = var0.g1b_alt2();
				var3.field10435 = var0.g1b_alt1();
				var3.field10436 = var0.g1b();
				var3.field10437 = (byte) var0.g1();
				var3.field10446 = field10903 + var0.g2();
				var3.field10464 = field10903 + var0.g2_alt1();
			}
			if ((var4 & 0x20) != 0) {
				var3.field10417 = var0.g2_alt3();
				if (var3.field10417 == 65535) {
					var3.field10417 = -1;
				}
			}
			if ((var4 & 0x40000) != 0) {
				int var50 = var0.data[(++var0.pos) - 1] & 0xFF;
				for (int var51 = 0; var51 < var50; var51++) {
					int var52 = var0.g1();
					int var53 = var0.g4_alt2();
					int var54 = var0.g3_alt3();
					var3.method19165(var52, var53, var54);
				}
			}
			if ((var4 & 0x8) != 0) {
				int var55 = var0.g1_alt1();
				if (var55 > 0) {
					for (int var56 = 0; var56 < var55; var56++) {
						int var57 = -1;
						boolean var58 = true;
						int var59 = -1;
						int var60 = var0.gSmart1or2();
						int var61;
						if (var60 == 32767) {
							var60 = var0.gSmart1or2();
							var61 = var0.gSmart1or2();
							var57 = var0.gSmart1or2();
							var59 = var0.gSmart1or2();
						} else if (var60 == 32766) {
							var60 = -1;
							var61 = var0.g1_alt2();
						} else {
							var61 = var0.gSmart1or2();
						}
						int var62 = var0.gSmart1or2();
						var3.method16498(var60, var61, var57, var59, field10903, var62);
					}
				}
				int var63 = var0.g1_alt1();
				if (var63 > 0) {
					for (int var64 = 0; var64 < var63; var64++) {
						int var65 = var0.gSmart1or2();
						int var66 = var0.gSmart1or2();
						if (var66 == 32767) {
							var3.method16500(var65);
						} else {
							int var67 = var0.gSmart1or2();
							int var68 = var0.g1_alt3();
							int var69 = var66 > 0 ? var0.g1() : var68;
							var3.method16499(var65, field10903, var66, var67, var68, var69);
						}
					}
				}
			}
			if ((var4 & 0x200000) != 0) {
				var3.field10460.method14749();
				var0.pos += 2;
				int var70 = var0.data[(++var0.pos) - 1] & 0xFF;
				for (int var71 = 0; var71 < var70; var71++) {
					int var72 = var0.g1_alt2();
					BaseVarType var73 = (BaseVarType) class686.method1897(Statics.method7338(), var72);
					VarValue var74 = Statics.field8135.method15285(var0, var73);
					var3.field10460.method14735(var74.field4240, var74.field4239);
				}
			}
			if ((var4 & 0x20000) != 0) {
				int var75 = var0.g1_alt1();
				int[] var76 = new int[8];
				short[] var77 = new short[8];
				for (int var78 = 0; var78 < 8; var78++) {
					if ((var75 & 0x1 << var78) == 0) {
						var76[var78] = -1;
						var77[var78] = -1;
					} else {
						var76[var78] = var0.gSmart2or4null();
						var77[var78] = (short) var0.gSmart1or2null();
					}
				}
				var3.field12080 = new NpcTypeHeadIconSet(var76, var77);
			}
			if ((var4 & 0x800) != 0) {
				var3.field12079 = var0.g2_alt3();
				if (var3.field12079 == 65535) {
					var3.field12079 = -1;
				}
			}
			if ((var4 & 0x4) != 0) {
				var3.method19166(var0.gjstr(), 0, 0);
			}
			if ((var4 & 0x80) != 0) {
				int var79 = var0.g2();
				int var80 = var0.g4_alt3();
				if (var79 == 65535) {
					var79 = -1;
				}
				int var81 = var0.g1_alt1();
				int var82 = var81 & 0x7;
				int var83 = var81 >> 3 & 0xF;
				if (var83 == 15) {
					var83 = -1;
				}
				boolean var84 = (var81 >> 7 & 0x1) == 1;
				var3.method16563(var79, var80, var82, var83, var84, 0);
			}
			if ((var4 & 0x400) != 0) {
				int var85 = 0;
				if (var3.field12083.field2705 != null) {
					var85 = var3.field12083.field2705.length;
				}
				int var86 = 0;
				if (var3.field12083.field2708 != null) {
					var86 = var3.field12083.field2708.length;
				}
				int var87 = var0.g1_alt2();
				if ((var87 & 0x1) == 1) {
					var3.field12076 = null;
				} else {
					var0.pos += 2;
					int[] var88 = null;
					float[] var89 = null;
					int[][] var90 = null;
					int[][] var91 = null;
					if ((var87 & 0x2) == 2) {
						int var92 = var0.g1_alt2();
						var88 = new int[var92];
						if ((var87 & 0x10) == 16) {
							var89 = new float[var92];
							var90 = new int[var92][3];
							var91 = new int[var92][3];
						}
						for (int var93 = 0; var93 < var92; var93++) {
							var88[var93] = var0.gSmart2or4null();
							if ((var87 & 0x10) == 16 && var88[var93] != -1) {
								var89[var93] = var0.gFloat();
								for (int var94 = 0; var94 < 3; var94++) {
									var90[var93][var94] = var0.g2s_alt1();
								}
								for (int var95 = 0; var95 < 3; var95++) {
									var91[var93][var95] = var0.g2s();
								}
							}
						}
					}
					short[] var96 = null;
					if ((var87 & 0x4) == 4) {
						var96 = new short[var85];
						for (int var97 = 0; var97 < var85; var97++) {
							var96[var97] = (short) var0.g2();
						}
					}
					short[] var98 = null;
					if ((var87 & 0x8) == 8) {
						var98 = new short[var86];
						for (int var99 = 0; var99 < var86; var99++) {
							var98[var99] = (short) var0.g2();
						}
					}
					long var100 = (long) (++NpcEntity.field12077 - 1);
					var3.field12076 = new NpcTypeCustomization(var100, var88, var89, var90, var91, var96, var98);
				}
			}
			if ((var4 & 0x10000) != 0) {
				var3.field12082 = var0.gjstr();
				if ("".equals(var3.field12082) || var3.field12082.equals(var3.field12083.field2703)) {
					var3.field12082 = var3.field12083.field2703;
				}
			}
			if ((var4 & 0x20000000) != 0) {
				var3.field10401 = var0.g1() == 1;
			}
			if ((var4 & 0x8000000) != 0) {
				int var102 = var0.g2();
				int var103 = var0.g4_alt3();
				if (var102 == 65535) {
					var102 = -1;
				}
				int var104 = var0.g1();
				int var105 = var104 & 0x7;
				int var106 = var104 >> 3 & 0xF;
				if (var106 == 15) {
					var106 = -1;
				}
				boolean var107 = (var104 >> 7 & 0x1) == 1;
				var3.method16563(var102, var103, var105, var106, var107, 2);
			}
			if ((var4 & 0x400000) != 0) {
				var0.pos += 2;
				int var108 = var0.data[(++var0.pos) - 1] & 0xFF;
				for (int var109 = 0; var109 < var108; var109++) {
					int var110 = var0.g1_alt3();
					BaseVarType var111 = (BaseVarType) class686.method1897(Statics.method7338(), var110);
					VarValue var112 = Statics.field8135.method15285(var0, var111);
					var3.field10460.method14735(var112.field4240, var112.field4239);
				}
			}
		}
	}

	@ObfuscatedName("vs.jf(Lahm;[IIZI)V")
	public static void method9423(PathingEntity arg0, int[] arg1, int arg2, boolean arg3) {
		if (arg0.field10427 != null) {
			boolean var4 = true;
			for (int var5 = 0; var5 < arg0.field10427.length; var5++) {
				if (arg0.field10427[var5] != arg1[var5]) {
					var4 = false;
					break;
				}
			}
			class721 var6 = arg0.field10454;
			if (var4 && var6.method14346()) {
				SeqType var7 = arg0.field10454.method14347();
				int var8 = var7.field1768;
				if (var8 == 1) {
					var6.method14389(arg2);
				}
				if (var8 == 2) {
					var6.method14422();
				}
			}
		}
		boolean var9 = true;
		for (int var10 = 0; var10 < arg1.length; var10++) {
			if (arg1[var10] != -1) {
				var9 = false;
			}
			if (arg0.field10427 == null || arg0.field10427[var10] == -1 || ((SeqType) Statics.field8797.get(arg1[var10])).field1779 >= ((SeqType) Statics.field8797.get(arg0.field10427[var10])).field1779) {
				arg0.field10427 = arg1;
				arg0.field10454.method14357(arg2);
				if (arg3) {
					arg0.field10396 = arg0.field10400;
				}
			}
		}
		if (!var9) {
			return;
		}
		arg0.field10427 = arg1;
		arg0.field10454.method14357(arg2);
		if (arg3) {
			arg0.field10396 = arg0.field10400;
		}
	}

	@ObfuscatedName("tl.ju(IIIIIILoe;IIB)V")
	public static void method8895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ScaleRotTrans arg6, int arg7, int arg8) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= world.method7728() - 1 || arg2 >= world.method7758() - 1) {
			return;
		}
		if (world.method7743() == null) {
			return;
		}
		if (arg3 == 0) {
			Location var9 = (Location) world.method7743().method8711(arg0, arg1, arg2);
			Location var10 = (Location) world.method7743().method8880(arg0, arg1, arg2);
			if (var9 != null && arg4 != 2) {
				if (var9 instanceof DynamicWallEntity) {
					((DynamicWallEntity) var9).field11179.method8260(arg7, arg8);
				} else {
					class962.method15005(arg0, arg3, arg1, arg2, var9.method8223(), arg5, arg4, arg6, arg7, arg8);
				}
			}
			if (var10 != null) {
				if (var10 instanceof DynamicWallEntity) {
					((DynamicWallEntity) var10).field11179.method8260(arg7, arg8);
				} else {
					class962.method15005(arg0, arg3, arg1, arg2, var10.method8223(), arg5, arg4, arg6, arg7, arg8);
				}
			}
		} else if (arg3 == 1) {
			Location var11 = (Location) world.method7743().method8735(arg0, arg1, arg2);
			if (var11 != null) {
				if (var11 instanceof DynamicWallDecorEntity) {
					((DynamicWallDecorEntity) var11).field11174.method8260(arg7, arg8);
				} else {
					int var12 = var11.method8223();
					if (arg4 == 4 || arg4 == 5) {
						class962.method15005(arg0, arg3, arg1, arg2, var12, arg5, 4, arg6, arg7, arg8);
					} else if (arg4 == 6) {
						class962.method15005(arg0, arg3, arg1, arg2, var12, arg5 + 4, 4, arg6, arg7, arg8);
					} else if (arg4 == 7) {
						class962.method15005(arg0, arg3, arg1, arg2, var12, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7, arg8);
					} else if (arg4 == 8) {
						class962.method15005(arg0, arg3, arg1, arg2, var12, arg5 + 4, 4, arg6, arg7, arg8);
						class962.method15005(arg0, arg3, arg1, arg2, var12, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7, arg8);
					}
				}
			}
		} else if (arg3 == 2) {
			Location var13 = (Location) world.method7743().method8856(arg0, arg1, arg2, field11001);
			if (var13 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (var13 instanceof DynamicSceneryEntity) {
					((DynamicSceneryEntity) var13).field11131.method8260(arg7, arg8);
				} else {
					class962.method15005(arg0, arg3, arg1, arg2, var13.method8223(), arg5, arg4, arg6, arg7, arg8);
				}
			}
		} else if (arg3 == 3) {
			Location var14 = (Location) world.method7743().method8767(arg0, arg1, arg2);
			if (var14 != null) {
				if (var14 instanceof DynamicGroundDecorEntity) {
					((DynamicGroundDecorEntity) var14).field11133.method8260(arg7, arg8);
				} else {
					class962.method15005(arg0, arg3, arg1, arg2, var14.method8223(), arg5, arg4, arg6, arg7, arg8);
				}
			}
		}
	}

	@ObfuscatedName("fn.jy(IIIIB)V")
	public static final void method3066(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < field11051; var4++) {
			Rectangle var5 = field11040[var4];
			if (var5.x + var5.width > arg0 && var5.x < arg0 + arg2 && var5.y + var5.height > arg1 && var5.y < arg1 + arg3) {
				field11072[var4] = true;
			}
		}
	}

	@ObfuscatedName("adh.jl(ILjava/lang/String;I)V")
	public static void method15190(int arg0, String arg1) {
		int var2 = ReceivePlayerPositions.field698;
		int[] var3 = ReceivePlayerPositions.field703;
		boolean var4 = false;
		for (int var5 = 0; var5 < var2; var5++) {
			PlayerEntity var6 = field10944[var3[var5]];
			if (var6 != null && Statics.field4490 != var6 && var6.field12062 != null && var6.field12062.equalsIgnoreCase(arg1)) {
				ClientProt var7 = null;
				if (arg0 == 1) {
					var7 = ClientProt.OPPLAYER1;
				} else if (arg0 == 2) {
					var7 = ClientProt.OPPLAYER2;
				} else if (arg0 == 3) {
					var7 = ClientProt.OPPLAYER3;
				} else if (arg0 == 4) {
					var7 = ClientProt.OPPLAYER4;
				} else if (arg0 == 5) {
					var7 = ClientProt.OPPLAYER5;
				} else if (arg0 == 6) {
					var7 = ClientProt.OPPLAYER6;
				} else if (arg0 == 7) {
					var7 = ClientProt.OPPLAYER7;
				} else if (arg0 == 8) {
					var7 = ClientProt.OPPLAYER8;
				} else if (arg0 == 9) {
					var7 = ClientProt.OPPLAYER9;
				} else if (arg0 == 10) {
					var7 = ClientProt.OPPLAYER10;
				}
				if (var7 != null) {
					ClientMessage var8 = Statics.method1604(var7, field10849.field794);
					var8.field11432.p2(var3[var5]);
					var8.field11432.p1_alt1(0);
					field10849.method934(var8);
				}
				var4 = true;
				break;
			}
		}
		if (!var4) {
			ChatHistory.method1006(4, LocalisedText.UNABLETOFIND.method15021(Statics.field1680) + arg1);
		}
	}

	@ObfuscatedName("ie.jn(Ljava/lang/String;I)V")
	public static void method4406(String arg0) {
		if (!field10973 || (Statics.field1765 & 0x18) == 0) {
			return;
		}
		boolean var1 = false;
		int var2 = ReceivePlayerPositions.field698;
		int[] var3 = ReceivePlayerPositions.field703;
		for (int var4 = 0; var4 < var2; var4++) {
			PlayerEntity var5 = field10944[var3[var4]];
			if (var5.field12062 != null && var5.field12062.equalsIgnoreCase(arg0) && (Statics.field4490 == var5 && (Statics.field1765 & 0x10) != 0 || (Statics.field1765 & 0x8) != 0)) {
				ClientMessage var6 = Statics.method1604(ClientProt.OPPLAYERT, field10849.field794);
				var6.field11432.p2(field10974);
				var6.field11432.p1_alt1(0);
				var6.field11432.p2_alt1(field10975);
				var6.field11432.p2_alt3(var3[var4]);
				var6.field11432.p4_alt2(Statics.field6707);
				field10849.method934(var6);
				method6820(var5.field10450[0], var5.field10448[0]);
				var1 = true;
				break;
			}
		}
		if (!var1) {
			ChatHistory.method1006(4, LocalisedText.UNABLETOFIND.method15021(Statics.field1680) + arg0);
		}
		if (field10973) {
			method9403();
		}
	}

	@ObfuscatedName("yz.je(Lhf;IIB)V")
	public static void method10592(Component arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.field2249 != null) {
			HookRequest var3 = new HookRequest();
			var3.field11491 = arg0;
			var3.field11493 = arg0.field2249;
			ScriptRunner.method1428(var3);
		}
		field10973 = true;
		Statics.field6707 = arg0.field2158;
		field10974 = arg0.field2183;
		Statics.field1765 = arg1;
		Statics.field7677 = arg2;
		field10975 = arg0.field2334;
		Statics.field1844 = arg0.field2202;
		field10970 = arg0.field2269;
		method4616(arg0);
	}

	@ObfuscatedName("vu.jb(I)V")
	public static void method9403() {
		if (!field10973) {
			return;
		}
		Component var0 = Component.method16682(Statics.field6707, field10974);
		if (var0 != null && var0.field2299 != null) {
			HookRequest var1 = new HookRequest();
			var1.field11491 = var0;
			var1.field11493 = var0.field2299;
			ScriptRunner.method1428(var1);
		}
		field10970 = -1;
		field10975 = -1;
		field10973 = false;
		if (var0 != null) {
			method4616(var0);
		}
	}

	@ObfuscatedName("a.jm(III)V")
	public static void method612(int arg0, int arg1) {
		ClientMessage var2 = Statics.method1604(ClientProt.RESUME_PAUSEBUTTON, field10849.field794);
		var2.field11432.p4_alt3(arg0);
		var2.field11432.p2_alt2(arg1);
		field10849.method934(var2);
	}

	@ObfuscatedName("ahm.jw(Lhf;Lhf;I)V")
	public static void method16600(Component arg0, Component arg1) {
		ClientMessage var2 = Statics.method1604(ClientProt.IF_BUTTOND, field10849.field794);
		var2.field11432.p2(arg1.field2183);
		var2.field11432.p4_alt3(arg0.field2158);
		var2.field11432.p2_alt1(arg1.field2334);
		var2.field11432.p2_alt3(arg0.field2334);
		var2.field11432.p4_alt3(arg1.field2158);
		var2.field11432.p2_alt1(arg0.field2183);
		field10849.method934(var2);
	}

	@ObfuscatedName("pu.ji(Lax;Lhf;IIII)V")
	public static void method7076(ServerConnection arg0, Component arg1, int arg2, int arg3, int arg4) {
		if (arg2 == 1) {
			ClientMessage var5 = Statics.method1604(ClientProt.IF_BUTTON1, arg0.field794);
			method6985(var5, arg3, arg4, arg1.field2334);
			arg0.method934(var5);
		}
		if (arg2 == 2) {
			ClientMessage var6 = Statics.method1604(ClientProt.IF_BUTTON2, arg0.field794);
			method6985(var6, arg3, arg4, arg1.field2334);
			arg0.method934(var6);
		}
		if (arg2 == 3) {
			ClientMessage var7 = Statics.method1604(ClientProt.IF_BUTTON3, arg0.field794);
			method6985(var7, arg3, arg4, arg1.field2334);
			arg0.method934(var7);
		}
		if (arg2 == 4) {
			ClientMessage var8 = Statics.method1604(ClientProt.IF_BUTTON4, arg0.field794);
			method6985(var8, arg3, arg4, arg1.field2334);
			arg0.method934(var8);
		}
		if (arg2 == 5) {
			ClientMessage var9 = Statics.method1604(ClientProt.IF_BUTTON5, arg0.field794);
			method6985(var9, arg3, arg4, arg1.field2334);
			arg0.method934(var9);
		}
		if (arg2 == 6) {
			ClientMessage var10 = Statics.method1604(ClientProt.IF_BUTTON6, arg0.field794);
			method6985(var10, arg3, arg4, arg1.field2334);
			arg0.method934(var10);
		}
		if (arg2 == 7) {
			ClientMessage var11 = Statics.method1604(ClientProt.IF_BUTTON7, arg0.field794);
			method6985(var11, arg3, arg4, arg1.field2334);
			arg0.method934(var11);
		}
		if (arg2 == 8) {
			ClientMessage var12 = Statics.method1604(ClientProt.IF_BUTTON8, arg0.field794);
			method6985(var12, arg3, arg4, arg1.field2334);
			arg0.method934(var12);
		}
		if (arg2 == 9) {
			ClientMessage var13 = Statics.method1604(ClientProt.IF_BUTTON9, arg0.field794);
			method6985(var13, arg3, arg4, arg1.field2334);
			arg0.method934(var13);
		}
		if (arg2 == 10) {
			ClientMessage var14 = Statics.method1604(ClientProt.IF_BUTTON10, arg0.field794);
			method6985(var14, arg3, arg4, arg1.field2334);
			arg0.method934(var14);
		}
	}

	@ObfuscatedName("pj.jt(Lakl;IIII)V")
	public static void method6985(ClientMessage arg0, int arg1, int arg2, int arg3) {
		arg0.field11432.p2_alt3(arg3);
		arg0.field11432.p2_alt2(arg2);
		arg0.field11432.p4(arg1);
	}

	@ObfuscatedName("adm.jq(I)V")
	public static final void method15281() {
		Statics.field7603 = null;
		method10155(field10978, 0, 0, Statics.canvasWid, Statics.canvasHei, 0, 0, -1);
		if (Statics.field7603 != null) {
			method6797(Statics.field7603, -1412584499, 0, 0, Statics.canvasWid, Statics.canvasHei, Statics.field4869, Statics.field11893, Statics.field1734 == field10828 ? -1 : field10828.field2182, true);
			Statics.field7603 = null;
		}
	}

	@ObfuscatedName("xi.jv(IIIIIIIII)V")
	public static final void method10155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (Component.method5364(arg0, null)) {
			method6797(Statics.field11725[arg0].method3923(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
		} else if (arg7 == -1) {
			for (int var8 = 0; var8 < 114; var8++) {
				field11072[var8] = true;
			}
		} else {
			field11072[arg7] = true;
		}
	}

	@ObfuscatedName("pk.ja([Lhf;IIIIIIIIZI)V")
	public static final void method6797(Component[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
		Statics.field8198.method2168(arg2, arg3, arg4, arg5);
		for (int var10 = 0; var10 < arg0.length; var10++) {
			Component var11 = arg0[var10];
			if (var11 != null && (var11.field2200 == arg1 || arg1 == -1412584499 && field10989 == var11)) {
				int var12;
				if (arg8 == -1) {
					field11040[field11051].setBounds(var11.field2194 + arg6, var11.field2195 + arg7, var11.field2196, var11.field2197);
					var12 = ++field11051 - 1;
				} else {
					var12 = arg8;
				}
				var11.field2182 = var12;
				var11.field2237 = field10903;
				if (!method16930(var11)) {
					if (var11.field2185 != 0) {
						method9454(var11);
					}
					int var13 = var11.field2194 + arg6;
					int var14 = var11.field2195 + arg7;
					int var15 = var11.field2212;
					if (field10881 && (method17197(var11).field11385 != 0 || var11.field2184 == 0) && var15 > 127) {
						var15 = 127;
					}
					if (field10989 == var11) {
						if (arg1 != -1412584499 && (Component.field2157 == var11.field2271 || Component.field2234 == var11.field2271 || method17197(var11).method17701() && Component.field2266 != var11.field2271)) {
							Statics.field7603 = arg0;
							Statics.field4869 = arg6;
							Statics.field11893 = arg7;
							continue;
						}
						if (field10886 && field10878) {
							int var16 = Statics.field9182.method9086();
							int var17 = Statics.field9182.method9092();
							int var18 = var16 - field10991;
							int var19 = var17 - field10992;
							if (var18 < field10995) {
								var18 = field10995;
							}
							if (var11.field2196 + var18 > field10995 + field10799) {
								var18 = field10995 + field10799 - var11.field2196;
							}
							if (var19 < field10889) {
								var19 = field10889;
							}
							if (var11.field2197 + var19 > field10998 + field10889) {
								var19 = field10998 + field10889 - var11.field2197;
							}
							if (method17197(var11).method17701()) {
								method3066(var18, var19, var11.field2196, var11.field2197);
							}
							if (Component.field2266 != var11.field2271) {
								var13 = var18;
								var14 = var19;
							}
						}
						if (Component.field2234 == var11.field2271) {
							var15 = 128;
						}
					}
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.field2184 == 2) {
						var20 = arg2;
						var21 = arg3;
						var22 = arg4;
						var23 = arg5;
					} else {
						int var24 = var11.field2196 + var13;
						int var25 = var11.field2197 + var14;
						if (var11.field2184 == 9) {
							var24++;
							var25++;
						}
						var20 = var13 > arg2 ? var13 : arg2;
						var21 = var14 > arg3 ? var14 : arg3;
						var22 = var24 < arg4 ? var24 : arg4;
						var23 = var25 < arg5 ? var25 : arg5;
					}
					if (var20 < var22 && var21 < var23) {
						if (var11.field2185 != 0) {
							if (Component.field2341 == var11.field2185 || Component.field2161 == var11.field2185) {
								if (field10888) {
									Statics.field8198.method2202();
									method2104(var13, var14, var11.field2196, var11.field2197, Component.field2161 == var11.field2185);
									method9547(var12, var20, var21, var22, var23, var13, var14);
									Statics.field8198.method2263();
									Statics.field8198.method2168(arg2, arg3, arg4, arg5);
									field11072[var12] = true;
								}
								continue;
							}
							if (Component.field2171 == var11.field2185 && field10863 == 3) {
								if (var11.field2184 != 5 || var11.method3970(Statics.field8198) != null) {
									class42.method328(Statics.field8198, var11, var13, var14);
									Statics.field8198.method2168(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Component.field2169 == var11.field2185) {
								class21.method7274(Statics.field8198, var13, var14, var11);
								continue;
							}
							if (Component.field2340 == var11.field2185) {
								Statics.method480(Statics.field8198, var13, var14, var11, var11.field2210 % 64);
								continue;
							}
							if (Component.field2259 == var11.field2185) {
								if (var11.method3970(Statics.field8198) != null) {
									Statics.field8198.method2202();
									Statics.method8887(var11, var13, var14);
									Statics.field8198.method2168(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Component.field2164 == var11.field2185) {
								class1004.method7008(Statics.field8198, var13, var14, var11.field2196, var11.field2197);
								field11072[var12] = true;
								Statics.field8198.method2168(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Component.field2165 == var11.field2185) {
								Statics.method3549(Statics.field8198, var13, var14, var11.field2196, var11.field2197);
								field11072[var12] = true;
								Statics.field8198.method2168(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Component.field2166 == var11.field2185) {
								if (field10794 || field10848) {
									method16429(var13, var14, var11);
									field11072[var12] = true;
								}
								continue;
							}
							if (Component.field2163 == var11.field2185) {
								Sprite var26 = TwitchHardwarePlatform.method4367();
								if (var26 != null) {
									int var27 = arg4 - arg2;
									int var28 = arg5 - arg3;
									float var29 = (float) var27 / (float) var28;
									float var30 = (float) var26.method1459() / (float) var26.method1435();
									int var31;
									int var32;
									if (var29 < var30) {
										var31 = var27;
										var32 = (int) ((float) var27 / var30);
									} else {
										var31 = (int) ((float) var28 * var30);
										var32 = var28;
									}
									int var33 = (var27 - var31) / 2 + arg2;
									int var34 = (var28 - var32) / 2 + arg3;
									var26.method1474(var33, var34, var31, var32);
								}
								continue;
							}
							if (Component.field2172 == var11.field2185) {
								if (TwitchHardwarePlatform.method5076() && TwitchHardwarePlatform.method8634()) {
									TwitchHardwarePlatform.method5389(arg2, arg3, arg4, arg5);
								}
								continue;
							}
						}
						if (var11.field2184 == 0) {
							if (Component.field2168 == var11.field2185) {
								Statics.field8198.method2202();
								world.method7816().method9979(world);
								Statics.field8198.method2172(var13, var14, Statics.canvasWid, Statics.canvasHei);
							}
							method6797(arg0, var11.field2158, var20, var21, var22, var23, var13 - var11.field2206, var14 - var11.field2207, var12, arg9);
							if (var11.field2349 != null) {
								method6797(var11.field2349, var11.field2158, var20, var21, var22, var23, var13 - var11.field2206, var14 - var11.field2207, var12, arg9);
							}
							SubInterface var35 = (SubInterface) field10979.method14495((long) var11.field2158);
							if (var35 != null) {
								method10155(var35.field11571, var20, var21, var22, var23, var13 - var11.field2206, var14 - var11.field2207, var12);
							}
							if (Component.field2168 == var11.field2185) {
								if (Statics.field8198.method2234()) {
									Statics.field8198.method2233(var11.field2196, var11.field2197);
									if (state == 18) {
										method8275(var13, var14, var11.field2196, var11.field2197);
									}
								}
								if (field10863 == 0) {
									int var36 = field11002;
									int var37 = field10871;
									int var38 = field10872;
									int var39 = field10805;
									if (field10903 < field10869) {
										float var40 = (float) (field10903 - field10868) * 1.0F / (float) (field10869 - field10868);
										var36 = (int) ((1.0F - var40) * (float) Statics.field7950 + (float) field11002 * var40);
										var37 = (int) ((1.0F - var40) * (float) Statics.field10297 + (float) field10871 * var40);
										var38 = (int) ((1.0F - var40) * (float) Statics.field8521 + (float) field10872 * var40);
										var39 = (int) ((1.0F - var40) * (float) Statics.field1843 + (float) field10805 * var40);
									}
									if (var36 > 0) {
										Statics.field8198.method2301(var20, var21, var22 - var20, var23 - var21, var36 << 24 | var37 << 16 | var38 << 8 | var39);
									}
								}
							}
							Statics.field8198.method2168(arg2, arg3, arg4, arg5);
						}
						if (field10911[var12] || field10997 > 1) {
							if (var11.field2184 == 3) {
								if (var15 == 0) {
									if (var11.field2263) {
										Statics.field8198.method2354(var13, var14, var11.field2196, var11.field2197, var11.field2210 | 0xFF000000, 0);
									} else {
										Statics.field8198.method2179(var13, var14, var11.field2196, var11.field2197, var11.field2210 | 0xFF000000, 0);
									}
								} else if (var11.field2263) {
									Statics.field8198.method2354(var13, var14, var11.field2196, var11.field2197, 255 - (var15 & 0xFF) << 24 | var11.field2210 & 0xFFFFFF, 1);
								} else {
									Statics.field8198.method2179(var13, var14, var11.field2196, var11.field2197, 255 - (var15 & 0xFF) << 24 | var11.field2210 & 0xFFFFFF, 1);
								}
							} else if (var11.field2184 == 4) {
								int var41 = 255 - (var15 & 0xFF);
								if (var41 != 0) {
									class140 var42 = var11.method3942(Statics.field7538, field10833);
									if (var42 != null) {
										int var43 = var11.field2210;
										String var44 = var11.field2261;
										if (var11.field2334 != -1) {
											ObjType var45 = (ObjType) Statics.field1842.get(var11.field2334);
											var44 = var45.field8630;
											if (var44 == null) {
												var44 = "null";
											}
											if ((var45.field8644 == 1 || var11.field2335 != 1) && var11.field2335 != -1) {
												var44 = Statics.method596(16748608) + var44 + TextUtil.ENDCOL + " x" + method7895(var11.field2335);
											}
										}
										if (field11056 == var11) {
											var44 = LocalisedText.PLEASEWAIT.method15021(Statics.field1680);
											var43 = var11.field2210;
										}
										if (field10988) {
											Statics.field8198.method2161(var13, var14, var11.field2196 + var13, var11.field2197 + var14);
										}
										int var46 = var41 << 24;
										if (var11.field2267) {
											var42.method2700(var44, var13, var14, var11.field2196, var11.field2197, var46 | var43, var11.field2265 ? var46 : -1, var11.field2223, var11.field2264, field10890, Statics.field1681, field11042, Statics.field10302, null);
										} else {
											var42.method2685(var44, var13, var14, var11.field2196, var11.field2197, var46 | var43, var11.field2265 ? var46 : -1, var11.field2223, var11.field2264, var11.field2229, var11.field2236, Statics.field10302, null, null, 0, 0);
										}
										if (field10988) {
											Statics.field8198.method2168(arg2, arg3, arg4, arg5);
										}
									} else if (Component.field2338) {
										method4616(var11);
									}
								}
							} else if (var11.field2184 == 5) {
								if (var11.field2339 >= 0) {
									var11.method4012(Statics.field2879, Statics.field687).method7945(Statics.field8198, 0, var13, var14, var11.field2196, var11.field2197, var11.field2348 << 3, var11.field2162 << 3, 0, 0);
								} else {
									Sprite var48;
									if (var11.field2334 != -1) {
										PlayerModel var47 = var11.field2246 ? Statics.field4490.field12061 : null;
										var48 = Statics.field1842.method18900(Statics.field8198, var11.field2334, var11.field2335, var11.field2218, var11.field2219 | 0xFF000000, var11.field2241, var47);
									} else if (var11.field2188 == -1) {
										var48 = var11.method3941(Statics.field8198);
									} else {
										var48 = (Sprite) field11013.method2930((long) var11.field2188);
										if (var48 == null && !field11093.containsKey(var11.field2188)) {
											try {
												field11093.put(var11.field2188, Statics.field7957.method563(new URL(field10947 + "/img/image_" + var11.field2188 + ".png?a=" + MonotonicTime.method3655())));
											} catch (MalformedURLException var86) {
												JagException.method9845(null, var86);
											}
										}
									}
									if (var48 != null) {
										int var50 = var48.method1434();
										int var51 = var48.method1436();
										int var52 = 255 - (var15 & 0xFF);
										if (var52 != 0) {
											int var53;
											if (var11.field2210 == -1) {
												var53 = 16777215;
											} else {
												var53 = var11.field2210 & 0xFFFFFF;
												if (var53 == 0) {
													var53 = 16777215;
												}
											}
											int var54 = var53 | var52 << 24;
											boolean var55 = var54 != -1;
											if (var11.field2217) {
												Statics.field8198.method2161(var13, var14, var11.field2196 + var13, var11.field2197 + var14);
												if (var11.field2216 != 0) {
													int var56 = (var11.field2196 + (var50 - 1)) / var50;
													int var57 = (var11.field2197 + (var51 - 1)) / var51;
													for (int var58 = 0; var58 < var56; var58++) {
														for (int var59 = 0; var59 < var57; var59++) {
															if (var55) {
																var48.method1452((float) var50 / 2.0F + (float) (var50 * var58 + var13), (float) var51 / 2.0F + (float) (var51 * var59 + var14), 4096, var11.field2216, 0, var54, 1);
															} else {
																var48.method1451((float) var50 / 2.0F + (float) (var50 * var58 + var13), (float) var51 / 2.0F + (float) (var51 * var59 + var14), 4096, var11.field2216);
															}
														}
													}
												} else if (var55) {
													var48.method1449(var13, var14, var11.field2196, var11.field2197, 0, var54, 1);
												} else {
													var48.method1448(var13, var14, var11.field2196, var11.field2197);
												}
												Statics.field8198.method2168(arg2, arg3, arg4, arg5);
											} else if (var55) {
												if (var11.field2216 != 0) {
													var48.method1452((float) var11.field2196 / 2.0F + (float) var13, (float) var11.field2197 / 2.0F + (float) var14, var11.field2196 * 4096 / var50, var11.field2216, 0, var54, 1);
												} else if (var11.field2196 == var50 && var11.field2197 == var51) {
													var48.method1443(var13, var14, 0, var54, 1);
												} else {
													var48.method1446(var13, var14, var11.field2196, var11.field2197, 0, var54, 1);
												}
											} else if (var11.field2216 != 0) {
												var48.method1497((float) var11.field2196 / 2.0F + (float) var13, (float) var11.field2197 / 2.0F + (float) var14, (float) var50 / 2.0F, (float) var51 / 2.0F, var11.field2196 * 4096 / var50, var11.field2197 * 4096 / var51, var11.field2216, 1, -1, 1);
											} else if (var11.field2196 == var50 && var11.field2197 == var51) {
												var48.method1439(var13, var14);
											} else {
												var48.method1474(var13, var14, var11.field2196, var11.field2197);
											}
										}
									} else if (Component.field2338) {
										method4616(var11);
									}
								}
							} else if (var11.field2184 == 6) {
								Statics.field8198.method2202();
								Model var60 = null;
								int var61 = 2048;
								if (var11.field2189 != 0) {
									var61 |= 0x80000;
								}
								int var62 = 0;
								if (var11.field2334 != -1) {
									ObjType var63 = (ObjType) Statics.field1842.get(var11.field2334);
									if (var63 != null) {
										ObjType var64 = var63.method14645(var11.field2335);
										var60 = var64.method14644(Statics.field8198, var61, 1, var11.field2246 ? Statics.field4490.field12061 : null, var11.field2170, 0, 0, 0, 0);
										if (var60 == null) {
											method4616(var11);
										} else {
											var62 = -var60.method1748() >> 1;
										}
									}
								} else if (var11.field2224 == 3) {
									int var65 = var11.field2294;
									if (var65 >= 0 && var65 < 2048) {
										PlayerEntity var66 = field10944[var65];
										if (var66 != null && (field10945 == var65 || class695.method14059(var66.field12062) == var11.field2298)) {
											var60 = var11.method3944(Statics.field8198, var61, Statics.field11742, Statics.field2628, Statics.field7961, Statics.field1842, Statics.field8797, Statics.field7410, Statics.field7410, var11.field2170, var66.field12061);
											if (var60 == null && Component.field2338) {
												method4616(var11);
											}
										}
									}
								} else if (var11.field2224 == 5) {
									int var67 = var11.field2294;
									PlayerEntity var68 = null;
									boolean var69 = false;
									if (var67 >= 0 && var67 < 2048) {
										var68 = field10944[var67];
										var69 = var68 != null && (field10945 == var67 || class695.method14059(var68.field12062) == var11.field2298);
									} else if (var67 == -1) {
										var69 = true;
										var68 = Statics.field4490;
									} else {
										PlayerEntity var70 = (PlayerEntity) field10946.get(var67);
										if (var70 != null && var70.field10406 == var67) {
											var69 = true;
											var68 = var70;
										}
									}
									if (var69 && var68 != null && var68.field12061 != null) {
										var60 = var68.field12061.method10126(Statics.field8198, var61, Statics.field11742, Statics.field2628, Statics.field7961, Statics.field1842, Statics.field7410, Statics.field7410, var11.field2170, null, null, null, 0, true, Statics.field1709);
									}
								} else if (var11.field2224 == 8 || var11.field2224 == 9) {
									ClientInvCache var71 = Statics.method8358(var11.field2294, false);
									if (var71 != null) {
										var60 = var71.method17475(Statics.field8198, var61, var11.field2170, var11.field2298, var11.field2224 == 9, var11.field2246 ? Statics.field4490.field12061 : null);
									}
								} else if (var11.field2170 != null && var11.field2170.method14346()) {
									var60 = var11.method3944(Statics.field8198, var61, Statics.field11742, Statics.field2628, Statics.field7961, Statics.field1842, Statics.field8797, Statics.field7410, Statics.field7410, var11.field2170, Statics.field4490.field12061);
									if (var60 == null && Component.field2338) {
										method4616(var11);
									}
								} else {
									var60 = var11.method3944(Statics.field8198, var61, Statics.field11742, Statics.field2628, Statics.field7961, Statics.field1842, Statics.field8797, Statics.field7410, Statics.field7410, null, Statics.field4490.field12061);
									if (var60 == null && Component.field2338) {
										method4616(var11);
									}
								}
								if (var60 != null) {
									if (var11.field2189 != 0) {
										var60.method1745(var11.field2240, var11.field2256, var11.field2203, var11.field2189);
									}
									int var72;
									if (var11.field2227 > 0) {
										var72 = (var11.field2196 << 9) / var11.field2227;
									} else {
										var72 = 512;
									}
									int var73;
									if (var11.field2238 > 0) {
										var73 = (var11.field2197 << 9) / var11.field2238;
									} else {
										var73 = 512;
									}
									int var74 = var11.field2196 / 2 + var13;
									int var75 = var11.field2197 / 2 + var14;
									if (!var11.field2274) {
										var74 += var11.field2305 * var72 >> 9;
										var75 += var11.field2209 * var73 >> 9;
									}
									field10793.method6376();
									Statics.field8198.method2217(field10793);
									Matrix4x4 var76 = Statics.field8198.method2208();
									int var77 = world.method7760();
									int var78 = world.method7734();
									int var79 = var11.field2272 + var78;
									if (var11.field2239) {
										if (Statics.field3416 == 3) {
											if (var11.field2274) {
												var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, Statics.field9155.method4727(), Statics.field9155.method4785(), (float) Statics.canvasWid, (float) Statics.canvasHei, (float) var11.field2272);
											} else {
												var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, Statics.field9155.method4727(), Statics.field9155.method4785(), (float) Statics.canvasWid, (float) Statics.canvasHei, (float) (var11.field2272 << 2));
											}
										} else if (var11.field2274) {
											var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, (float) var77, (float) var79, (float) Statics.canvasWid, (float) Statics.canvasHei, (float) var11.field2272);
										} else {
											var76.method6622((float) var74, (float) var75, (float) var72, (float) var73, (float) var77, (float) var79, (float) Statics.canvasWid, (float) Statics.canvasHei, (float) (var11.field2272 << 2));
										}
									} else if (Statics.field3416 == 3) {
										var76.method6703((float) var74, (float) var75, (float) var72, (float) var73, Statics.field9155.method4727(), Statics.field9155.method4785(), (float) Statics.canvasWid, (float) Statics.canvasHei);
									} else {
										var76.method6703((float) var74, (float) var75, (float) var72, (float) var73, (float) var77, (float) var79, (float) Statics.canvasWid, (float) Statics.canvasHei);
									}
									Statics.field8198.method2220(var76);
									Statics.field8198.method2475(2, 0);
									if (var11.field2260) {
										Statics.field8198.method2219(false);
									}
									if (var11.field2274) {
										field10875.method6372(1.0F, 0.0F, 0.0F, Trig1.method6277(var11.field2230));
										field10875.method6307(0.0F, 1.0F, 0.0F, Trig1.method6277(var11.field2231));
										field10875.method6307(0.0F, 0.0F, 1.0F, Trig1.method6277(var11.field2331));
										field10875.method6315((float) var11.field2305, (float) var11.field2209, (float) var11.field2235);
									} else {
										int var80 = (var11.field2272 << 2) * Trig1.field4270[var11.field2230 << 3] >> 14;
										int var81 = (var11.field2272 << 2) * Trig1.field4272[var11.field2230 << 3] >> 14;
										field10875.method6372(0.0F, 0.0F, 1.0F, Trig1.method6277(-var11.field2331 << 3));
										field10875.method6307(0.0F, 1.0F, 0.0F, Trig1.method6277(var11.field2231 << 3));
										field10875.method6315((float) (var11.field2228 << 2), (float) ((var11.field2316 << 2) + var80 + var62), (float) ((var11.field2316 << 2) + var81));
										field10875.method6307(1.0F, 0.0F, 0.0F, Trig1.method6277(var11.field2230 << 3));
									}
									var11.method3951(Statics.field8198, var60, field10875, field10903);
									Statics.field8198.method2263();
									Statics.field8198.method2170(true);
									Statics.field8198.method2168(arg2, arg3, arg4, arg5);
									if (field10988) {
										Statics.field8198.method2161(var13, var14, var11.field2196 + var13, var11.field2197 + var14);
									}
									if (var11.field2250) {
										world.method7816().method9996((float) var11.field2248 / 256.0F, (float) var11.field2251 / 256.0F, (float) var11.field2255 / 256.0F, var11.field2257, var11.field2345, var11.field2252, var11.field2302, var11.field2258);
									} else {
										world.method7816().method9983();
									}
									var60.method1813(field10875, null, 1);
									if (!var11.field2239 && var11.field2254 != null) {
										Statics.field8198.method2198(var11.field2254.method9939());
									}
									if (field10988) {
										Statics.field8198.method2168(arg2, arg3, arg4, arg5);
									}
									Statics.field8198.method2170(false);
									Statics.field8198.method2167();
									Statics.field8198.method2168(arg2, arg3, arg4, arg5);
									if (var11.field2250) {
										world.method7816().method9983();
									}
									if (var11.field2260) {
										Statics.field8198.method2219(true);
									}
								}
							} else if (var11.field2184 == 9) {
								int var82;
								int var83;
								int var84;
								int var85;
								if (var11.field2214) {
									var82 = var13;
									var83 = var11.field2197 + var14;
									var84 = var11.field2196 + var13;
									var85 = var14;
								} else {
									var82 = var13;
									var83 = var14;
									var84 = var11.field2196 + var13;
									var85 = var11.field2197 + var14;
								}
								if (var11.field2156 == 1) {
									Statics.field8198.method2185(var82, var83, var84, var85, var11.field2210 | 0xFF000000, 0);
								} else {
									Statics.field8198.method2189(var82, var83, var84, var85, var11.field2210 | 0xFF000000, var11.field2156, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aft.jj(IILhf;B)V")
	public static void method16429(int arg0, int arg1, Component arg2) {
		int var3 = arg2.field2196 + arg0;
		int var4 = arg1 + 15;
		if (!field10794) {
			return;
		}
		int var5 = -256;
		if (fps < 20) {
			var5 = -65536;
		}
		Statics.field9184.method2682("Fps:" + fps + " (" + fpsAverage + " ms)", var3, var4, var5, -1);
		var4 += 15;
		Runtime var6 = Runtime.getRuntime();
		long var7 = var6.totalMemory() / 1024L;
		long var9 = var7 - var6.freeMemory() / 1024L;
		int var11 = -256;
		if (var9 > 262144L) {
			var11 = -65536;
		}
		Statics.field9184.method2682("Mem:" + var9 + "/" + var7 + "k", var3, var4, var11, -1);
		var4 += 15;
		long var12 = field10849.field807.method116();
		String var14 = "N/A";
		if (var12 != -1L) {
			var14 = var12 + "ms";
			if (var12 > 500L) {
				var14 = Statics.method596(16711680) + var14 + Statics.method596(16776960);
			}
		}
		Statics.field9184.method2682("Game: In:" + field10849.field804 + "B/s " + "Out:" + field10849.field798 + "B/s " + "Ping:" + var14, var3, var4, -256, -1);
		var4 += 15;
		long var15 = field10835.field807.method116();
		String var17 = "N/A";
		if (var15 != -1L) {
			var17 = var15 + "ms";
			if (var15 > 500L) {
				var17 = Statics.method596(16711680) + var17 + Statics.method596(16776960);
			}
		}
		Statics.field9184.method2682("Lobby: In:" + field10835.field804 + "B/s " + "Out:" + field10835.field798 + "B/s " + "Ping:" + var17, var3, var4, -256, -1);
		var4 += 15;
		int var18 = Statics.field8198.method2520() / 1024;
		Statics.field9184.method2682("Offheap:" + var18 + "k", var3, var4, var18 > 65536 ? -65536 : -256, -1);
		var4 += 15;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		for (int var22 = 0; var22 < Statics.field6888.length; var22++) {
			if (Statics.field6888[var22] != null && Statics.field6888[var22].method16837()) {
				var19 += Statics.field6888[var22].method16826();
				var20 += Statics.field6888[var22].method16827();
				var21 += Statics.field6888[var22].method16828();
			}
		}
		long var23 = var19 == 0 ? 0L : (long) var21 * 100L / (long) var19;
		long var25 = var19 == 0 ? 0L : (long) var20 * 10000L / (long) var19;
		String var27 = "Cache:" + class691.method1582(var25, 2, true, Language.EN) + "% (" + var23 + "%)";
		Statics.field8321.method2682(var27, var3, var4, -256, -1);
		var4 += 12;
	}

	@ObfuscatedName("rd.jo(II)Ljava/lang/String;")
	public static final String method7895(int arg0) {
		String var1 = Integer.toString(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + TextUtil.COMMA + var1.substring(var2);
		}
		if (var1.length() > 9) {
			return " " + Statics.method596(65408) + var1.substring(0, var1.length() - 8) + LocalisedText.MILLION.method15021(Statics.field1680) + " (" + var1 + ")" + TextUtil.ENDCOL;
		} else if (var1.length() > 6) {
			return " " + Statics.method596(16777215) + var1.substring(0, var1.length() - 4) + LocalisedText.THOUSAND.method15021(Statics.field1680) + " (" + var1 + ")" + TextUtil.ENDCOL;
		} else {
			return " " + Statics.method596(16776960) + var1 + TextUtil.ENDCOL;
		}
	}

	@ObfuscatedName("na.jz(Lhq;Lhf;I)Lhf;")
	public static final Component method6000(Interface arg0, Component arg1) {
		if (arg1.field2200 != -1) {
			return arg0.method3924(arg1.field2200);
		}
		if (!arg0.field2150) {
			int var2 = arg1.field2158 >>> 16;
			class730 var3 = new class730(field10979);
			for (SubInterface var4 = (SubInterface) var3.method14520(); var4 != null; var4 = (SubInterface) var3.next()) {
				if (var4.field11571 == var2) {
					return Component.method10202((int) var4.field6760);
				}
			}
		}
		return null;
	}

	@ObfuscatedName("vn.jc(ZI)V")
	public static final void method9585(boolean arg0) {
		method8493(field10978, Statics.canvasWid, Statics.canvasHei, arg0);
	}

	@ObfuscatedName("dy.jg(Lhq;Lhf;B)V")
	public static void method2103(Interface arg0, Component arg1) {
		Component var2 = method6000(arg0, arg1);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Statics.canvasWid;
			var4 = Statics.canvasHei;
		} else {
			var3 = var2.field2196;
			var4 = var2.field2197;
		}
		method8197(arg1, var3, var4, false);
		method18883(arg1, var3, var4);
	}

	@ObfuscatedName("sf.jx(Lhq;Lhf;ZI)V")
	public static void method8329(Interface arg0, Component arg1, boolean arg2) {
		method16452(arg0.field2151, arg1, arg2);
	}

	@ObfuscatedName("agw.jh([Lhf;Lhf;ZI)V")
	public static void method16452(Component[] arg0, Component arg1, boolean arg2) {
		int var3 = arg1.field2208 == 0 ? arg1.field2196 : arg1.field2208;
		int var4 = arg1.field2319 == 0 ? arg1.field2197 : arg1.field2319;
		method1597(arg0, arg1.field2158, var3, var4, arg2);
		if (arg1.field2349 != null) {
			method1597(arg1.field2349, arg1.field2158, var3, var4, arg2);
		}
		SubInterface var5 = (SubInterface) field10979.method14495((long) arg1.field2158);
		if (var5 != null) {
			method8493(var5.field11571, var3, var4, arg2);
		}
		if (field10986 != arg1) {
			return;
		}
		int var6 = ReceivePlayerPositions.field698;
		int[] var7 = ReceivePlayerPositions.field703;
		for (int var8 = 0; var8 < var6; var8++) {
			PlayerEntity var9 = field10944[var7[var8]];
			if (var9 != null) {
				var9.method16519(var3, var4, arg2);
			}
		}
		for (int var10 = 0; var10 < field11011; var10++) {
			int var11 = field11036[var10];
			ObjectWrapper var12 = (ObjectWrapper) field10838.method14495((long) var11);
			if (var12 != null) {
				((PathingEntity) var12.field11436).method16519(var3, var4, arg2);
			}
		}
	}

	@ObfuscatedName("tb.jp(IIIZB)V")
	public static final void method8493(int arg0, int arg1, int arg2, boolean arg3) {
		if (Component.method5364(arg0, null)) {
			method1597(Statics.field11725[arg0].field2151, -1, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("ck.jk([Lhf;IIIZI)V")
	public static void method1597(Component[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
		for (int var5 = 0; var5 < arg0.length; var5++) {
			Component var6 = arg0[var5];
			if (var6 != null && var6.field2200 == arg1) {
				method8197(var6, arg2, arg3, arg4);
				method18883(var6, arg2, arg3);
				if (var6.field2206 > var6.field2208 - var6.field2196) {
					var6.field2206 = var6.field2208 - var6.field2196;
				}
				if (var6.field2206 < 0) {
					var6.field2206 = 0;
				}
				if (var6.field2207 > var6.field2319 - var6.field2197) {
					var6.field2207 = var6.field2319 - var6.field2197;
				}
				if (var6.field2207 < 0) {
					var6.field2207 = 0;
				}
				if (var6.field2184 == 0) {
					method16452(arg0, var6, arg4);
				}
			}
		}
	}

	@ObfuscatedName("sh.kw(Lhf;IIZB)V")
	public static void method8197(Component arg0, int arg1, int arg2, boolean arg3) {
		int var4 = arg0.field2196;
		int var5 = arg0.field2197;
		if (arg0.field2356 == 0) {
			arg0.field2196 = arg0.field2192;
		} else if (arg0.field2356 == 1) {
			arg0.field2196 = arg1 - arg0.field2192;
		} else if (arg0.field2356 == 2) {
			arg0.field2196 = arg0.field2192 * arg1 >> 14;
		}
		if (arg0.field2174 == 0) {
			arg0.field2197 = arg0.field2193;
		} else if (arg0.field2174 == 1) {
			arg0.field2197 = arg2 - arg0.field2193;
		} else if (arg0.field2174 == 2) {
			arg0.field2197 = arg0.field2193 * arg2 >> 14;
		}
		if (arg0.field2356 == 4) {
			arg0.field2196 = arg0.field2198 * arg0.field2197 / arg0.field2199;
		}
		if (arg0.field2174 == 4) {
			arg0.field2197 = arg0.field2199 * arg0.field2196 / arg0.field2198;
		}
		if (field10881 && (method17197(arg0).field11385 != 0 || arg0.field2184 == 0)) {
			if (arg0.field2197 < 5 && arg0.field2196 < 5) {
				arg0.field2197 = 5;
				arg0.field2196 = 5;
			} else {
				if (arg0.field2197 <= 0) {
					arg0.field2197 = 5;
				}
				if (arg0.field2196 <= 0) {
					arg0.field2196 = 5;
				}
			}
		}
		if (Component.field2341 == arg0.field2185) {
			field10986 = arg0;
		}
		if (arg3 && arg0.field2329 != null && (arg0.field2196 != var4 || arg0.field2197 != var5)) {
			HookRequest var6 = new HookRequest();
			var6.field11491 = arg0;
			var6.field11493 = arg0.field2329;
			field11031.method14153(var6);
		}
	}

	@ObfuscatedName("aod.kz(Lhf;III)V")
	public static void method18883(Component arg0, int arg1, int arg2) {
		if (arg0.field2186 == 0) {
			arg0.field2194 = arg0.field2190;
		} else if (arg0.field2186 == 1) {
			arg0.field2194 = (arg1 - arg0.field2196) / 2 + arg0.field2190;
		} else if (arg0.field2186 == 2) {
			arg0.field2194 = arg1 - arg0.field2196 - arg0.field2190;
		} else if (arg0.field2186 == 3) {
			arg0.field2194 = arg0.field2190 * arg1 >> 14;
		} else if (arg0.field2186 == 4) {
			arg0.field2194 = (arg0.field2190 * arg1 >> 14) + (arg1 - arg0.field2196) / 2;
		} else {
			arg0.field2194 = arg1 - arg0.field2196 - (arg0.field2190 * arg1 >> 14);
		}
		if (arg0.field2187 == 0) {
			arg0.field2195 = arg0.field2191;
		} else if (arg0.field2187 == 1) {
			arg0.field2195 = (arg2 - arg0.field2197) / 2 + arg0.field2191;
		} else if (arg0.field2187 == 2) {
			arg0.field2195 = arg2 - arg0.field2197 - arg0.field2191;
		} else if (arg0.field2187 == 3) {
			arg0.field2195 = arg0.field2191 * arg2 >> 14;
		} else if (arg0.field2187 == 4) {
			arg0.field2195 = (arg0.field2191 * arg2 >> 14) + (arg2 - arg0.field2197) / 2;
		} else {
			arg0.field2195 = arg2 - arg0.field2197 - (arg0.field2191 * arg2 >> 14);
		}
		if (!field10881 || method17197(arg0).field11385 == 0 && arg0.field2184 != 0) {
			return;
		}
		if (arg0.field2194 < 0) {
			arg0.field2194 = 0;
		} else if (arg0.field2196 + arg0.field2194 > arg1) {
			arg0.field2194 = arg1 - arg0.field2196;
		}
		if (arg0.field2195 < 0) {
			arg0.field2195 = 0;
		} else if (arg0.field2197 + arg0.field2195 > arg2) {
			arg0.field2195 = arg2 - arg0.field2197;
		}
	}

	@ObfuscatedName("ja.ke(I)V")
	public static final void method5013() {
		if (field10978 == -1) {
			return;
		}
		int var0 = Statics.field9182.method9086();
		int var1 = Statics.field9182.method9092();
		class993 var2 = (class993) field10816.method14191();
		if (var2 != null) {
			var0 = var2.method17831();
			var1 = var2.method17832();
		}
		if (field10989 != null && Statics.field1734 == field10828) {
			field10878 = true;
			field10995 = 0;
			field10889 = 0;
			field10799 = Statics.canvasWid;
			field10998 = Statics.canvasHei;
		}
		method8198(null, field10978, 0, 0, Statics.canvasWid, Statics.canvasHei, 0, 0, var0, var1);
		if (Statics.field3044 != null) {
			class1004.method929(var0, var1);
		}
	}

	@ObfuscatedName("sh.kq(Lalu;IIIIIIIIII)V")
	public static final void method8198(SubInterface arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (!Component.method5364(arg1, null)) {
			return;
		}
		if (arg0 == null || arg0.method18183()) {
			Interface var10 = Statics.field11725[arg1];
			method17231(var10, var10.method3923(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			method214(arg0, true, false);
		}
	}

	@ObfuscatedName("client.kg(Lhq;[Lhf;IIIIIIIII)V")
	public static final void method17231(Interface arg0, Component[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < arg1.length; var11++) {
			Component var12 = arg1[var11];
			if (var12 != null && var12.field2200 == arg2) {
				int var13 = var12.field2194 + arg7;
				int var14 = var12.field2195 + arg8;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var12.field2184 == 2) {
					var15 = arg3;
					var16 = arg4;
					var17 = arg5;
					var18 = arg6;
				} else {
					int var19 = var12.field2196 + var13;
					int var20 = var12.field2197 + var14;
					if (var12.field2184 == 9) {
						var19++;
						var20++;
					}
					var15 = var13 > arg3 ? var13 : arg3;
					var16 = var14 > arg4 ? var14 : arg4;
					var17 = var19 < arg5 ? var19 : arg5;
					var18 = var20 < arg6 ? var20 : arg6;
				}
				if (var12.field2184 == 0 || var12.field2179 || method17197(var12).field11385 != 0 || field10828 == var12 || Component.field2171 == var12.field2185 || Component.field2167 == var12.field2185 || Component.field2341 == var12.field2185 || Component.field2161 == var12.field2185) {
					if (!method16930(var12)) {
						if (field10989 == var12 && method4411(field10989)) {
							field10999 = true;
							field11000 = var13;
							field10852 = var14;
						}
						if (var12.field2324 || var15 < var17 && var16 < var18) {
							if (var12.field2205 && arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
								for (HookRequest var21 = (HookRequest) field11031.method14191(); var21 != null; var21 = (HookRequest) field11031.method14161()) {
									if (var21.field11490) {
										var21.method8440();
										var21.field11491.field2350 = false;
									}
								}
								if (Statics.field6656 == 0) {
									field10989 = null;
									field10828 = null;
								}
								field11003 = 0;
								class1004.field11663 = false;
								field11083 = false;
								if (!MiniMenu.field562) {
									MiniMenu.method3074();
								}
							}
							boolean var22 = var12.field2253 && var12.field2184 == 5 && var12.field2212 == 0 && var12.field2339 < 0 && var12.field2334 == -1 && !var12.field2217 && var12.field2216 == 0;
							boolean var23 = false;
							if (arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
								if (var22) {
									class224 var24 = var12.method3970(Statics.field8198);
									if (var24 != null && var12.field2196 == var24.field2144 && var12.field2197 == var24.field2146) {
										int var25 = arg9 - var13;
										int var26 = arg10 - var14;
										if (var26 >= 0 && var26 < var24.field2143.length) {
											int var27 = var24.field2143[var26];
											if (var25 >= var27 && var25 <= var24.field2145[var26] + var27) {
												var23 = true;
											}
										}
									} else {
										var23 = true;
									}
								} else {
									var23 = true;
								}
							}
							if (!field10973 && var23) {
								if (var12.field2204 >= 0) {
									field10970 = var12.field2204;
								} else if (var12.field2205) {
									field10970 = -1;
								}
							}
							if (!MiniMenu.field562 && var23 && !arg0.field2150) {
								Statics.method7624(var12, arg9 - var13, arg10 - var14);
							}
							boolean var28 = false;
							if (Statics.field9182.method9101() && var23) {
								var28 = true;
							}
							boolean var29 = false;
							class993 var30 = (class993) field10816.method14191();
							if (var30 != null && var30.method17848() == 0 && var30.method17831() >= var15 && var30.method17832() >= var16 && var30.method17831() < var17 && var30.method17832() < var18) {
								if (var22) {
									class224 var31 = var12.method3970(Statics.field8198);
									if (var31 != null && var12.field2196 == var31.field2144 && var12.field2197 == var31.field2146) {
										int var32 = var30.method17831() - var13;
										int var33 = var30.method17832() - var14;
										if (var33 >= 0 && var33 < var31.field2143.length) {
											int var34 = var31.field2143[var33];
											if (var32 >= var34 && var32 <= var31.field2145[var33] + var34) {
												var29 = true;
											}
										}
									} else {
										var29 = true;
									}
								} else {
									var29 = true;
								}
							}
							if (var12.field2324 && !DeveloperConsole.method10211()) {
								for (int var35 = 0; var35 < var12.field2270.length; var35++) {
									boolean var36 = false;
									boolean var37 = false;
									if (var12.field2300[var35] > 0) {
										for (int var38 = 0; var38 < field10819; var38++) {
											if (var12.field2300[var35] == field11067[var38].method9131()) {
												var36 = true;
												if (var12.field2361 == null || var12.field2361[var35] <= field10903) {
													var37 = true;
												}
												break;
											}
										}
									}
									if (!var36 && var12.field2270[var35] != null) {
										for (int var39 = 0; var39 < var12.field2270[var35].length; var39++) {
											if (Statics.field11931.method9080(var12.field2270[var35][var39])) {
												var36 = true;
												if (var12.field2361 != null && var12.field2361[var35] > field10903) {
													break;
												}
												byte var40 = var12.field2281[var35][var39];
												if (var40 == 0 || ((var40 & 0x8) == 0 || !Statics.field11931.method9080(86) && !Statics.field11931.method9080(82) && !Statics.field11931.method9080(81)) && ((var40 & 0x2) == 0 || Statics.field11931.method9080(86)) && ((var40 & 0x1) == 0 || Statics.field11931.method9080(82)) && ((var40 & 0x4) == 0 || Statics.field11931.method9080(81))) {
													var37 = true;
													break;
												}
											}
										}
									}
									if (var37) {
										if (var35 < 10) {
											Statics.method4527(var35 + 1, var12.field2158, var12.field2183, "");
										} else if (var35 == 10) {
											method9403();
											ServerActiveProperties var41 = method17197(var12);
											method10592(var12, var41.method17691(), var41.field11381);
											field11039 = method9557(var12);
											if (field11039 == null) {
												field11039 = "Null";
											}
											field10977 = var12.field2279 + Statics.method596(16777215);
										}
										int var42 = var12.field2211[var35];
										if (var12.field2361 == null) {
											var12.field2361 = new int[var12.field2270.length];
										}
										if (var12.field2273 == null) {
											var12.field2273 = new int[var12.field2270.length];
										}
										if (var42 == 0) {
											var12.field2361[var35] = Integer.MAX_VALUE;
										} else if (var12.field2361[var35] == 0) {
											var12.field2361[var35] = field10903 + var42 + var12.field2273[var35];
										} else {
											var12.field2361[var35] = field10903 + var42;
										}
									}
									if (!var36 && var12.field2361 != null) {
										var12.field2361[var35] = 0;
									}
								}
							}
							if (var29) {
								method16750(var12, var30.method17831() - var13, var30.method17832() - var14);
							}
							if (field10989 != null && field10989 != var12 && var23) {
								if (var12.field2205) {
									field10993 = null;
								}
								if (method17197(var12).method17693()) {
									field10993 = var12;
								}
							}
							if (field10828 == var12) {
								field10878 = true;
								field10995 = var13;
								field10889 = var14;
								field10799 = field10828.field2196;
								field10998 = field10828.field2197;
							}
							if (var12.field2179 || var12.field2185 != 0) {
								if (var23 && field10817 != 0 && var12.field2317 != null) {
									HookRequest var43 = new HookRequest();
									var43.field11490 = true;
									var43.field11491 = var12;
									var43.field11497 = field10817;
									var43.field11493 = var12.field2317;
									field11031.method14153(var43);
								}
								if (field10989 != null) {
									var29 = false;
									var28 = false;
								} else if (MiniMenu.field562 || Component.field2164 != var12.field2185 && field11003 > 0) {
									var29 = false;
									var28 = false;
									var23 = false;
								}
								if (var12.field2185 != 0) {
									if (Component.field2341 == var12.field2185 || Component.field2161 == var12.field2185) {
										field10986 = var12;
										class637 var67 = world.method7816().method9982();
										if (var67.method10074() != null && !Statics.field3183.method7676()) {
											var67.method10074().method7944(Statics.field8198, var12.field2197, Statics.field688.skyboxes.method18607());
										}
										if (Component.field2341 == var12.field2185) {
											if (MiniMenu.field562 || arg9 < var15 || arg10 < var16 || arg9 >= var17 || arg10 >= var18) {
												MiniMenu.method6036(Statics.field8198);
											} else {
												MiniMenu.method5015(Statics.field8198, arg9, arg10);
												for (class955 var68 = (class955) field10882.method14254(); var68 != null; var68 = (class955) field10882.method14241()) {
													if (arg9 >= var68.field11199 && arg9 < var68.field11200 && arg10 >= var68.field11195 && arg10 < var68.field11201) {
														MiniMenu.method3074();
														MiniMenu.method2897(var68.field11197);
													}
												}
											}
										}
										int var69 = ReceivePlayerPositions.field698;
										int[] var70 = ReceivePlayerPositions.field703;
										for (int var71 = 0; var71 < var69; var71++) {
											PlayerEntity var72 = field10944[var70[var71]];
											if (var72 != null) {
												ScriptRunner.method3661(ClientTriggerType.field7251, -1, -1, var72, var70[var71]);
												var72.method16571(var15, var16, var17, var18, var13 - var12.field2206, var14 - var12.field2207, arg9, arg10);
											}
										}
										for (int var73 = 0; var73 < field11011; var73++) {
											int var74 = field11036[var73];
											ObjectWrapper var75 = (ObjectWrapper) field10838.method14495((long) var74);
											if (var75 != null) {
												ScriptRunner.method3661(ClientTriggerType.field7260, ((NpcEntity) var75.field11436).field12083.field2732, -1, (PathingEntity) var75.field11436, var74);
												((PathingEntity) var75.field11436).method16571(var15, var16, var17, var18, var13 - var12.field2206, var14 - var12.field2207, arg9, arg10);
											}
										}
										continue;
									}
									if (Component.field2171 == var12.field2185) {
										int var44 = 0;
										int var45 = arg5 - arg3;
										int var46 = arg9 - var13;
										int var47 = arg10 - var14;
										if (var12.field2184 == 5) {
											class224 var48 = var12.method3970(Statics.field8198);
											if (var48 == null) {
												continue;
											}
											if (arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
												var44 = var48.field2143[var47];
												var45 = var48.field2145[var47];
											}
										}
										if (class42.field724 != 0 && class42.field724 != 3 || MiniMenu.field562 || arg9 < var15 || arg10 < var16 || arg9 >= var17 || arg10 >= var18 || var46 < var44 || var46 > var44 + var45) {
											continue;
										}
										int var49 = var46 - var12.field2196 / 2;
										int var50 = var47 - var12.field2197 / 2;
										int var51;
										if (Statics.field3416 == 4) {
											var51 = (int) field10895 & 0x3FFF;
										} else if (Statics.field3416 == 3) {
											var51 = (int) ((double) Statics.field9155.method4719() * 2607.5945876176133D);
										} else {
											var51 = field10885 + (int) field10895 & 0x3FFF;
										}
										int var52 = Trig1.field4270[var51];
										int var53 = Trig1.field4272[var51];
										if (Statics.field3416 != 4) {
											var52 = (field10887 + 256) * var52 >> 8;
											var53 = (field10887 + 256) * var53 >> 8;
										}
										int var54 = var49 * var53 + var50 * var52 >> 14;
										int var55 = var50 * var53 - var49 * var52 >> 14;
										int var56;
										int var57;
										if (Statics.field3416 == 4) {
											var56 = (field10892 >> 9) + (var54 >> 2);
											var57 = (field10893 >> 9) - (var55 >> 2);
										} else {
											int var58 = (Statics.field4490.method16546() - 1) * 256;
											Vector3 var59 = Statics.field4490.method10536().field4298;
											var56 = ((int) var59.field4308 - var58 >> 9) + (var54 >> 2);
											var57 = ((int) var59.field4313 - var58 >> 9) - (var55 >> 2);
										}
										if (field10973 && (Statics.field1765 & 0x40) != 0) {
											Component var60 = Component.method16682(Statics.field6707, field10974);
											if (var60 == null) {
												method9403();
											} else {
												MiniMenu.method3042(field11039, " " + TextUtil.ARROW, Statics.field1844, 59, var12.field2334, 1L, var56, var57, true, false, (long) (var12.field2183 << 32 | var12.field2158), true);
											}
											continue;
										}
										if (field10768 == ModeGame.STELLARDAWN) {
											MiniMenu.method3042(LocalisedText.FACEHERE.method15021(Statics.field1680), "", -1, 60, -1, 1L, var56, var57, true, false, 0L, true);
										}
										MiniMenu.method3042(Statics.field4868, "", field10963, 23, -1, 1L, var56, var57, true, false, 0L, true);
										continue;
									}
									if (Component.field2164 == var12.field2185) {
										Statics.field3044 = var12;
										if (var23) {
											class1004.field11663 = true;
										}
										if (var29) {
											int var61 = (int) ((double) (var30.method17831() - var13 - var12.field2196 / 2) * 2.0D / (double) Statics.field6803);
											int var62 = (int) -((double) (var30.method17832() - var14 - var12.field2197 / 2) * 2.0D / (double) Statics.field6803);
											int var63 = Statics.field11443 + var61 + Statics.field6786;
											int var64 = Statics.field11654 + var62 + Statics.field6808;
											WorldMapAreaMetadata var65 = class1004.method17877();
											if (var65 == null) {
												continue;
											}
											int[] var66 = new int[3];
											var65.method19482(var63, var64, var66);
											if (var66 != null) {
												if (Statics.field11931.method9080(82) && field10949 > 0) {
													method10445(var66[0], var66[1], var66[2]);
													continue;
												}
												field11083 = true;
												Statics.field6866 = var66[0];
												Statics.field530 = var66[1];
												Statics.field5107 = var66[2];
											}
											field11003 = 1;
											field10860 = false;
											field10991 = Statics.field9182.method9086();
											field10992 = Statics.field9182.method9092();
											continue;
										}
										if (var28 && field11003 > 0) {
											if (field11003 == 1 && (field10991 != Statics.field9182.method9086() || field10992 != Statics.field9182.method9092())) {
												Statics.field2413 = Statics.field11443;
												Statics.field8287 = Statics.field11654;
												field11003 = 2;
											}
											if (field11003 == 2) {
												field10860 = true;
												class1004.method8432(Statics.field2413 + (int) ((double) (field10991 - Statics.field9182.method9086()) * 2.0D / (double) Statics.field6804));
												class1004.method9548(Statics.field8287 - (int) ((double) (field10992 - Statics.field9182.method9092()) * 2.0D / (double) Statics.field6804));
											}
											continue;
										}
										if (field11003 > 0 && !field10860) {
											if ((field10968 == 1 || MiniMenu.method6848()) && MiniMenu.field546 > 2) {
												Statics.method10201(field10991, field10992);
											} else if (Statics.method15249()) {
												Statics.method10201(field10991, field10992);
											}
										}
										field11003 = 0;
										continue;
									}
									if (Component.field2165 == var12.field2185) {
										if (var28) {
											class1004.method9843(Statics.field9182.method9086() - var13, Statics.field9182.method9092() - var14, var12.field2196, var12.field2197);
										}
										continue;
									}
									if (Component.field2167 == var12.field2185) {
										MiniMenu.method18919(var12, var13, var14);
										continue;
									}
								}
								if (!var12.field2360 && var29) {
									var12.field2360 = true;
									if (var12.field2291 != null) {
										HookRequest var76 = new HookRequest();
										var76.field11490 = true;
										var76.field11491 = var12;
										var76.field11492 = var30.method17831() - var13;
										var76.field11497 = var30.method17832() - var14;
										var76.field11493 = var12.field2291;
										field11031.method14153(var76);
									}
								}
								if (var12.field2360 && var28 && var12.field2292 != null) {
									HookRequest var77 = new HookRequest();
									var77.field11490 = true;
									var77.field11491 = var12;
									var77.field11492 = Statics.field9182.method9086() - var13;
									var77.field11497 = Statics.field9182.method9092() - var14;
									var77.field11493 = var12.field2292;
									field11031.method14153(var77);
								}
								if (var12.field2360 && !var28) {
									var12.field2360 = false;
									if (var12.field2293 != null) {
										HookRequest var78 = new HookRequest();
										var78.field11490 = true;
										var78.field11491 = var12;
										var78.field11492 = Statics.field9182.method9086() - var13;
										var78.field11497 = Statics.field9182.method9092() - var14;
										var78.field11493 = var12.field2293;
										field11033.method14153(var78);
									}
								}
								if (var28 && var12.field2244 != null) {
									HookRequest var79 = new HookRequest();
									var79.field11490 = true;
									var79.field11491 = var12;
									var79.field11492 = Statics.field9182.method9086() - var13;
									var79.field11497 = Statics.field9182.method9092() - var14;
									var79.field11493 = var12.field2244;
									field11031.method14153(var79);
								}
								if (!var12.field2350 && var23) {
									var12.field2350 = true;
									if (var12.field2233 != null) {
										HookRequest var80 = new HookRequest();
										var80.field11490 = true;
										var80.field11491 = var12;
										var80.field11492 = Statics.field9182.method9086() - var13;
										var80.field11497 = Statics.field9182.method9092() - var14;
										var80.field11493 = var12.field2233;
										field11031.method14153(var80);
									}
								}
								if (var12.field2350 && var23 && var12.field2296 != null) {
									HookRequest var81 = new HookRequest();
									var81.field11490 = true;
									var81.field11491 = var12;
									var81.field11492 = Statics.field9182.method9086() - var13;
									var81.field11497 = Statics.field9182.method9092() - var14;
									var81.field11493 = var12.field2296;
									field11031.method14153(var81);
								}
								if (var12.field2350 && !var23) {
									var12.field2350 = false;
									if (var12.field2280 != null) {
										HookRequest var82 = new HookRequest();
										var82.field11490 = true;
										var82.field11491 = var12;
										var82.field11492 = Statics.field9182.method9086() - var13;
										var82.field11497 = Statics.field9182.method9092() - var14;
										var82.field11493 = var12.field2280;
										field11033.method14153(var82);
									}
								}
								if (var12.field2314 != null) {
									HookRequest var83 = new HookRequest();
									var83.field11491 = var12;
									var83.field11493 = var12.field2314;
									field11032.method14153(var83);
								}
								if (var12.field2308 != null && field11016 > var12.field2289) {
									if (var12.field2309 == null || field11016 - var12.field2289 > 64) {
										HookRequest var88 = new HookRequest();
										var88.field11491 = var12;
										var88.field11493 = var12.field2308;
										field11031.method14153(var88);
									} else {
										label867: for (int var84 = var12.field2289; var84 < field11016; var84++) {
											int var85 = field11019[var84 & 0x3F];
											for (int var86 = 0; var86 < var12.field2309.length; var86++) {
												if (var12.field2309[var86] == var85) {
													HookRequest var87 = new HookRequest();
													var87.field11491 = var12;
													var87.field11493 = var12.field2308;
													field11031.method14153(var87);
													break label867;
												}
											}
										}
									}
									var12.field2289 = field11016;
								}
								if (var12.field2310 != null && field11018 > var12.field2357) {
									if (var12.field2311 == null || field11018 - var12.field2357 > 64) {
										HookRequest var93 = new HookRequest();
										var93.field11491 = var12;
										var93.field11493 = var12.field2310;
										field11031.method14153(var93);
									} else {
										label843: for (int var89 = var12.field2357; var89 < field11018; var89++) {
											int var90 = field11017[var89 & 0x3F];
											for (int var91 = 0; var91 < var12.field2311.length; var91++) {
												if (var12.field2311[var91] == var90) {
													HookRequest var92 = new HookRequest();
													var92.field11491 = var12;
													var92.field11493 = var12.field2310;
													field11031.method14153(var92);
													break label843;
												}
											}
										}
									}
									var12.field2357 = field11018;
								}
								if (var12.field2322 != null && field11010 > var12.field2353) {
									if (var12.field2303 == null || field11010 - var12.field2353 > 64) {
										HookRequest var98 = new HookRequest();
										var98.field11491 = var12;
										var98.field11493 = var12.field2322;
										field11031.method14153(var98);
									} else {
										label819: for (int var94 = var12.field2353; var94 < field11010; var94++) {
											int var95 = field11009[var94 & 0x3F];
											for (int var96 = 0; var96 < var12.field2303.length; var96++) {
												if (var12.field2303[var96] == var95) {
													HookRequest var97 = new HookRequest();
													var97.field11491 = var12;
													var97.field11493 = var12.field2322;
													field11031.method14153(var97);
													break label819;
												}
											}
										}
									}
									var12.field2353 = field11010;
								}
								if (var12.field2304 != null && field11012 > var12.field2354) {
									if (var12.field2247 == null || field11012 - var12.field2354 > 64) {
										HookRequest var103 = new HookRequest();
										var103.field11491 = var12;
										var103.field11493 = var12.field2304;
										field11031.method14153(var103);
									} else {
										label795: for (int var99 = var12.field2354; var99 < field11012; var99++) {
											int var100 = field10783[var99 & 0x3F];
											for (int var101 = 0; var101 < var12.field2247.length; var101++) {
												if (var12.field2247[var101] == var100) {
													HookRequest var102 = new HookRequest();
													var102.field11491 = var12;
													var102.field11493 = var12.field2304;
													field11031.method14153(var102);
													break label795;
												}
											}
										}
									}
									var12.field2354 = field11012;
								}
								if (var12.field2306 != null && field11014 > var12.field2160) {
									if (var12.field2307 == null || field11014 - var12.field2160 > 64) {
										HookRequest var108 = new HookRequest();
										var108.field11491 = var12;
										var108.field11493 = var12.field2306;
										field11031.method14153(var108);
									} else {
										label771: for (int var104 = var12.field2160; var104 < field11014; var104++) {
											int var105 = field11015[var104 & 0x3F];
											for (int var106 = 0; var106 < var12.field2307.length; var106++) {
												if (var12.field2307[var106] == var105) {
													HookRequest var107 = new HookRequest();
													var107.field11491 = var12;
													var107.field11493 = var12.field2306;
													field11031.method14153(var107);
													break label771;
												}
											}
										}
									}
									var12.field2160 = field11014;
								}
								if (var12.field2312 != null && field11020 > var12.field2358) {
									if (var12.field2313 == null || field11020 - var12.field2358 > 64) {
										HookRequest var113 = new HookRequest();
										var113.field11491 = var12;
										var113.field11493 = var12.field2312;
										field11031.method14153(var113);
									} else {
										label747: for (int var109 = var12.field2358; var109 < field11020; var109++) {
											int var110 = field10841[var109 & 0x3F];
											for (int var111 = 0; var111 < var12.field2313.length; var111++) {
												if (var12.field2313[var111] == var110) {
													HookRequest var112 = new HookRequest();
													var112.field11491 = var12;
													var112.field11493 = var12.field2312;
													field11031.method14153(var112);
													break label747;
												}
											}
										}
									}
									var12.field2358 = field11020;
								}
								if (field11021 > var12.field2352 && var12.field2318 != null) {
									HookRequest var114 = new HookRequest();
									var114.field11491 = var12;
									var114.field11493 = var12.field2318;
									field11031.method14153(var114);
								}
								if (field11022 > var12.field2352 && var12.field2320 != null) {
									HookRequest var115 = new HookRequest();
									var115.field11491 = var12;
									var115.field11493 = var12.field2320;
									field11031.method14153(var115);
								}
								if (field10936 > var12.field2352 && var12.field2355 != null) {
									HookRequest var116 = new HookRequest();
									var116.field11491 = var12;
									var116.field11493 = var12.field2355;
									field11031.method14153(var116);
								}
								if (field10818 > var12.field2352 && var12.field2232 != null) {
									HookRequest var117 = new HookRequest();
									var117.field11491 = var12;
									var117.field11493 = var12.field2232;
									field11031.method14153(var117);
								}
								if (field11025 > var12.field2352 && var12.field2323 != null) {
									HookRequest var118 = new HookRequest();
									var118.field11491 = var12;
									var118.field11493 = var12.field2323;
									field11031.method14153(var118);
								}
								if (field10803 > var12.field2352 && var12.field2325 != null) {
									HookRequest var119 = new HookRequest();
									var119.field11491 = var12;
									var119.field11493 = var12.field2325;
									field11031.method14153(var119);
								}
								if (field11027 > var12.field2352 && var12.field2347 != null) {
									HookRequest var120 = new HookRequest();
									var120.field11491 = var12;
									var120.field11493 = var12.field2347;
									field11031.method14153(var120);
								}
								if (field11028 > var12.field2352 && var12.field2330 != null) {
									HookRequest var121 = new HookRequest();
									var121.field11491 = var12;
									var121.field11493 = var12.field2330;
									field11031.method14153(var121);
								}
								if (field10957 > var12.field2352 && var12.field2359 != null) {
									HookRequest var122 = new HookRequest();
									var122.field11491 = var12;
									var122.field11493 = var12.field2359;
									field11031.method14153(var122);
								}
								if (field10907 > var12.field2352 && var12.field2332 != null) {
									HookRequest var123 = new HookRequest();
									var123.field11491 = var12;
									var123.field11493 = var12.field2332;
									field11031.method14153(var123);
								}
								var12.field2352 = field11058;
								if (var12.field2295 != null) {
									for (int var124 = 0; var124 < field10819; var124++) {
										HookRequest var125 = new HookRequest();
										var125.field11491 = var12;
										var125.field11496 = field11067[var124].method9141();
										var125.field11489 = field11067[var124].method9131();
										var125.field11493 = var12.field2295;
										field11031.method14153(var125);
									}
								}
								if (field10813 && var12.field2328 != null) {
									HookRequest var126 = new HookRequest();
									var126.field11491 = var12;
									var126.field11493 = var12.field2328;
									field11031.method14153(var126);
								}
							}
							if (var12.field2184 == 5 && var12.field2339 != -1) {
								var12.method4012(Statics.field2879, Statics.field687).method7944(Statics.field8198, var12.field2197, Statics.field688.skyboxes.method18607());
							}
							Statics.method7332(var12);
							if (var12.field2184 == 0) {
								method17231(arg0, arg1, var12.field2158, var15, var16, var17, var18, var13 - var12.field2206, var14 - var12.field2207, arg9, arg10);
								if (var12.field2349 != null) {
									method17231(arg0, var12.field2349, var12.field2158, var15, var16, var17, var18, var13 - var12.field2206, var14 - var12.field2207, arg9, arg10);
								}
								SubInterface var127 = (SubInterface) field10979.method14495((long) var12.field2158);
								if (var127 != null) {
									method8198(var127, var127.field11571, var15, var16, var17, var18, var13 - var12.field2206, var14 - var12.field2207, arg9, arg10);
								}
							}
						}
					}
				} else if (var15 < var17 && var16 < var18) {
					Statics.method7332(var12);
				}
			}
		}
	}

	@ObfuscatedName("sh.kf([Lhf;IB)V")
	public static final void method8199(Component[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			Component var3 = arg0[var2];
			if (var3 != null) {
				if (var3.field2184 == 0) {
					if (var3.field2349 != null) {
						method8199(var3.field2349, arg1);
					}
					SubInterface var4 = (SubInterface) field10979.method14495((long) var3.field2158);
					if (var4 != null) {
						Statics.method1023(var4.field11571, arg1);
					}
				}
				if (arg1 == 0 && var3.field2326 != null) {
					HookRequest var5 = new HookRequest();
					var5.field11491 = var3;
					var5.field11493 = var3.field2326;
					ScriptRunner.method1428(var5);
				}
				if (arg1 == 1 && var3.field2327 != null) {
					if (var3.field2183 >= 0) {
						Component var6 = Component.method10202(var3.field2158);
						if (var6 == null || var6.field2351 == null || var3.field2183 >= var6.field2351.length || var6.field2351[var3.field2183] != var3) {
							continue;
						}
					}
					HookRequest var7 = new HookRequest();
					var7.field11491 = var3;
					var7.field11493 = var3.field2327;
					ScriptRunner.method1428(var7);
				}
			}
		}
	}

	@ObfuscatedName("ahe.kx(Lhf;III)V")
	public static final void method16750(Component arg0, int arg1, int arg2) {
		if (field10989 != null || MiniMenu.field562 || (arg0 == null || !method4411(arg0))) {
			return;
		}
		field10989 = arg0;
		field10828 = Statics.method14755(arg0);
		field10991 = arg1;
		field10992 = arg2;
		Statics.field6656 = 0;
		field10886 = false;
	}

	@ObfuscatedName("ajt.ki(I)V")
	public static final void method17515() {
		field10886 = true;
	}

	@ObfuscatedName("ps.ks(I)V")
	public static final void method6847() {
		method4616(field10989);
		Statics.field6656++;
		if (field10999 && field10878) {
			int var0 = Statics.field9182.method9086();
			int var1 = Statics.field9182.method9092();
			int var2 = var0 - field10991;
			int var3 = var1 - field10992;
			if (var2 < field10995) {
				var2 = field10995;
			}
			if (field10989.field2196 + var2 > field10995 + field10799) {
				var2 = field10995 + field10799 - field10989.field2196;
			}
			if (var3 < field10889) {
				var3 = field10889;
			}
			if (field10989.field2197 + var3 > field10998 + field10889) {
				var3 = field10998 + field10889 - field10989.field2197;
			}
			int var4;
			int var5;
			if (Statics.field1734 == field10828) {
				var4 = var2;
				var5 = var3;
			} else {
				var4 = field10828.field2206 + (var2 - field10995);
				var5 = field10828.field2207 + (var3 - field10889);
			}
			if (Statics.field9182.method9090()) {
				if (Statics.field6656 > field10989.field2286) {
					int var10 = var2 - field11000;
					int var11 = var3 - field10852;
					if (var10 > field10989.field2285 || var10 < -field10989.field2285 || var11 > field10989.field2285 || var11 < -field10989.field2285) {
						field10886 = true;
					}
				}
				if (field10989.field2362 != null && field10886) {
					HookRequest var12 = new HookRequest();
					var12.field11491 = field10989;
					var12.field11492 = var4;
					var12.field11497 = var5;
					var12.field11493 = field10989.field2362;
					ScriptRunner.method1428(var12);
				}
			} else {
				if (field10886) {
					method9403();
					if (field10989.field2178 != null) {
						HookRequest var6 = new HookRequest();
						var6.field11491 = field10989;
						var6.field11492 = var4;
						var6.field11497 = var5;
						Component var7 = method17238(field10989);
						Component var8 = field10993;
						boolean var9 = false;
						while (var8 != null && var8.field2200 != -1 && var7 != null) {
							if (var7.field2158 == var8.field2158) {
								var9 = true;
								break;
							}
							var8 = Statics.field11725[var8.field2158 >> 16].field2151[var8.field2200 & 0xFFFF];
						}
						if (var8 == null || var7 == null || Statics.field1734 == var7 || var9) {
							var6.field11495 = field10993;
						} else {
							var6.field11495 = Statics.field1734;
						}
						var6.field11493 = field10989.field2178;
						ScriptRunner.method1428(var6);
					}
					if (field10993 != null && method17238(field10989) != null) {
						method16600(field10989, field10993);
					}
				} else if ((field10968 == 1 || MiniMenu.method6848()) && MiniMenu.field546 > 2) {
					Statics.method10201(field11000 + field10991, field10992 + field10852);
				} else if (Statics.method15249()) {
					Statics.method10201(field11000 + field10991, field10992 + field10852);
				}
				field10989 = null;
				field10828 = null;
			}
		} else if (Statics.field6656 > 1) {
			field10989 = null;
			field10828 = null;
		}
	}

	@ObfuscatedName("iz.kh(Lhf;I)V")
	public static void method4616(Component arg0) {
		if (field11037 == arg0.field2237) {
			field11072[arg0.field2182] = true;
		}
	}

	@ObfuscatedName("we.ka(S)V")
	public static void method9734() {
		for (int var0 = 0; var0 < 114; var0++) {
			field11072[var0] = true;
		}
	}

	@ObfuscatedName("iu.kb(Lhf;I)Z")
	public static boolean method4411(Component arg0) {
		ServerActiveProperties var1 = method17197(arg0);
		if (var1.method17710() > 0) {
			return true;
		} else if (var1.method17701()) {
			return true;
		} else {
			return arg0.field2284 != null;
		}
	}

	@ObfuscatedName("anr.kr([Ljava/lang/String;I)[Ljava/lang/String;")
	public static final String[] method18725(String[] arg0) {
		String[] var1 = new String[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = var2 + " ";
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = var1[var2] + arg0[var2];
			}
		}
		return var1;
	}

	@ObfuscatedName("aku.kd(I[IB)V")
	public static final void method17758(int arg0, int[] arg1) {
		if (!Component.method5364(arg0, arg1)) {
			return;
		}
		Component[] var2 = Statics.field11725[arg0].field2151;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Component var4 = var2[var3];
			if (var4 != null && var4.field2170 != null) {
				var4.field2170.method14364();
			}
		}
	}

	@ObfuscatedName("aaq.kc(II)V")
	public static final void method14428(int arg0) {
		if (Component.method5364(arg0, null)) {
			method6107(Statics.field11725[arg0].field2151, -1);
		}
	}

	@ObfuscatedName("nc.kj([Lhf;II)V")
	public static final void method6107(Component[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			Component var3 = arg0[var2];
			if (var3 != null && var3.field2200 == arg1 && !method16930(var3)) {
				if (var3.field2184 == 0) {
					method6107(arg0, var3.field2158);
					if (var3.field2349 != null) {
						method6107(var3.field2349, var3.field2158);
					}
					SubInterface var4 = (SubInterface) field10979.method14495((long) var3.field2158);
					if (var4 != null) {
						method14428(var4.field11571);
					}
				}
				if (var3.field2184 == 6 && var3.field2262 != -1) {
					if (var3.field2170 == null) {
						var3.field2170 = new class1074();
						var3.field2170.method14362(var3.field2262);
					}
					if (var3.field2170.method14367(field10891) && var3.field2170.method14375()) {
						var3.field2170.method14364();
					}
				}
			}
		}
	}

	@ObfuscatedName("ank.kn(II)V")
	public static final void method18736(int arg0) {
		class975.method15185();
		int var1 = ((VarPlayerType) Statics.field8485.get(arg0)).clientCode;
		if (var1 == 0) {
			return;
		}
		int var2 = Statics.field7410.method679((VarType) Statics.field8485.get(arg0));
		if (var1 == 5) {
			field10968 = var2;
		}
		if (var1 == 6) {
			field10980 = var2;
		}
	}

	@ObfuscatedName("ve.kp(Lhf;I)V")
	public static final void method9454(Component arg0) {
		if (Component.field2159 != arg0.field2185) {
			return;
		}
		if (Statics.field4490.field12062 == null) {
			arg0.field2294 = 0;
			arg0.field2298 = 0;
			return;
		}
		arg0.field2230 = 150;
		arg0.field2231 = (int) (Math.sin((double) field10903 / 40.0D) * 256.0D) & 0x7FF;
		arg0.field2224 = 5;
		arg0.field2294 = field10945;
		arg0.field2298 = class695.method14059(Statics.field4490.field12062);
		class1075 var1 = Statics.field4490.field10432;
		if (var1 == null) {
			arg0.field2170 = null;
			return;
		}
		if (arg0.field2170 == null) {
			arg0.field2170 = new class1074();
		}
		arg0.field2262 = var1.method14348();
		arg0.field2170.method14370(var1);
	}

	@ObfuscatedName("sp.km(ZI)V")
	public static final void method8276(boolean arg0) {
		ClientMessage var1 = Statics.method1604(ClientProt.CLOSE_MODAL, field10849.field794);
		field10849.method934(var1);
		for (SubInterface var2 = (SubInterface) field10979.method14500(); var2 != null; var2 = (SubInterface) field10979.method14502()) {
			if (!var2.method8441()) {
				var2 = (SubInterface) field10979.method14500();
				if (var2 == null) {
					break;
				}
			}
			if (var2.field11570 == 0) {
				method214(var2, true, arg0);
			}
		}
		if (field11056 != null) {
			method4616(field11056);
			field11056 = null;
		}
	}

	@ObfuscatedName("is.ky(ILalu;[IZB)Lalu;")
	public static final SubInterface method4489(int arg0, SubInterface arg1, int[] arg2, boolean arg3) {
		SubInterface var4 = (SubInterface) field10979.method14495((long) arg0);
		if (var4 != null) {
			method214(var4, arg1.field11571 != var4.field11571, arg3);
		}
		field10979.method14501(arg1, (long) arg0);
		method17758(arg1.field11571, arg2);
		Component var5 = Component.method10202(arg0);
		if (var5 != null) {
			method4616(var5);
		}
		if (field11056 != null) {
			method4616(field11056);
			field11056 = null;
		}
		if (var5 != null) {
			method8329(Statics.field11725[var5.field2158 >>> 16], var5, !arg3);
		}
		if (!arg3) {
			ScriptRunner.method15086(arg1.field11571, arg2);
		}
		if (!arg3 && field10978 != -1) {
			Statics.method1023(field10978, 1);
		}
		return arg1;
	}

	@ObfuscatedName("k.kk(Lalu;ZZI)V")
	public static final void method214(SubInterface arg0, boolean arg1, boolean arg2) {
		int var3 = arg0.field11571;
		int var4 = (int) arg0.field6760;
		arg0.method8440();
		if (arg1) {
			Component.method7602(var3);
		}
		method5080(var3);
		Component var5 = Component.method10202(var4);
		if (var5 != null) {
			method4616(var5);
		}
		MiniMenu.method15023(var3);
		if (!arg2 && field10978 != -1) {
			Statics.method1023(field10978, 1);
		}
		class730 var6 = new class730(field10979);
		for (SubInterface var7 = (SubInterface) var6.method14520(); var7 != null; var7 = (SubInterface) var6.next()) {
			if (!var7.method8441()) {
				var7 = (SubInterface) var6.method14520();
				if (var7 == null) {
					break;
				}
			}
			if (var7.field11570 == 3) {
				int var8 = (int) var7.field6760;
				if (var8 >>> 16 == var3) {
					method214(var7, true, arg2);
				}
			}
		}
	}

	@ObfuscatedName("qa.kt(Ljava/lang/String;I)I")
	public static final int method7345(String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < field10811; var1++) {
			if (arg0.equalsIgnoreCase(field11065[var1].field606)) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("gm.li(Ljava/lang/String;I)I")
	public static final int method3598(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (int var1 = 0; var1 < field11084; var1++) {
			if (arg0.equalsIgnoreCase(field11086[var1].field598)) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("fd.lv(Ljava/lang/String;I)Z")
	public static boolean method3060(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field10811; var1++) {
			if (arg0.equalsIgnoreCase(field11065[var1].field606)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Statics.field4490.field12062)) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("pb.la(Ljava/lang/String;B)Z")
	public static boolean method6789(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field11084; var1++) {
			class27 var2 = field11086[var1];
			if (arg0.equalsIgnoreCase(var2.field598)) {
				return true;
			}
			if (arg0.equalsIgnoreCase(var2.field596)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("xf.lp(Ljava/lang/String;II)V")
	public static final void method10344(String arg0, int arg1) {
		ServerConnection var2 = method640();
		ClientMessage var3 = Statics.method1604(ClientProt.FRIEND_SETRANK, var2.field794);
		var3.field11432.p1(Packet.pjstrlen(arg0) + 1);
		var3.field11432.pjstr(arg0);
		var3.field11432.p1_alt2(arg1);
		var2.method934(var3);
	}

	@ObfuscatedName("xt.lc(Ljava/lang/String;Ljava/lang/String;I)V")
	public static final void method10360(String arg0, String arg1) {
		ServerConnection var2 = method640();
		ClientMessage var3 = Statics.method1604(ClientProt.FRIEND_SETNOTES, var2.field794);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		var3.field11432.p1(Packet.pjstrlen(arg0) + Packet.pjstrlen(arg1));
		var3.field11432.pjstr(arg0);
		var3.field11432.pjstr(arg1);
		var2.method934(var3);
	}

	@ObfuscatedName("abh.lf(Ljava/lang/String;Ljava/lang/String;I)V")
	public static final void method14701(String arg0, String arg1) {
		ServerConnection var2 = method640();
		ClientMessage var3 = Statics.method1604(ClientProt.IGNORE_SETNOTES, var2.field794);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		var3.field11432.p1(Packet.pjstrlen(arg0) + Packet.pjstrlen(arg1));
		var3.field11432.pjstr(arg1);
		var3.field11432.pjstr(arg0);
		var2.method934(var3);
	}

	@ObfuscatedName("ahr.lm(Ljava/lang/String;I)V")
	public static final void method16638(String arg0) {
		if (Statics.field9267 == null) {
			return;
		}
		ServerConnection var1 = method640();
		ClientMessage var2 = Statics.method1604(ClientProt.CLAN_KICKUSER, var1.field794);
		var2.field11432.p1(Packet.pjstrlen(arg0));
		var2.field11432.pjstr(arg0);
		var1.method934(var2);
	}

	@ObfuscatedName("sf.lb(B)V")
	public static final void method8328() {
		ServerConnection var0 = method640();
		ClientMessage var1 = Statics.method1604(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var0.field794);
		var1.field11432.p1(0);
		var0.method934(var1);
	}

	@ObfuscatedName("xl.lr(II)V")
	public static final void method9925(int arg0) {
		if (Statics.field3022 == null || (arg0 < 0 || arg0 >= Statics.field3022.field11393)) {
			return;
		}
		class308 var1 = Statics.field3022.field11392[arg0];
		if (var1.field3089 != -1) {
			return;
		}
		ServerConnection var2 = method640();
		ClientMessage var3 = Statics.method1604(ClientProt.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL, var2.field794);
		var3.field11432.p1(Packet.pjstrlen(var1.field3087) + 2);
		var3.field11432.p2(arg0);
		var3.field11432.pjstr(var1.field3087);
		var2.method934(var3);
	}

	@ObfuscatedName("pp.lq(IZB)V")
	public static final void method7045(int arg0, boolean arg1) {
		if (Statics.field3022 == null || (arg0 < 0 || arg0 >= Statics.field3022.field11393)) {
			return;
		}
		class308 var2 = Statics.field3022.field11392[arg0];
		ServerConnection var3 = method640();
		ClientMessage var4 = Statics.method1604(ClientProt.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL, var3.field794);
		var4.field11432.p1(Packet.pjstrlen(var2.field3087) + 3);
		var4.field11432.p2(arg0);
		var4.field11432.p1(arg1 ? 1 : 0);
		var4.field11432.pjstr(var2.field3087);
		var3.method934(var4);
	}

	@ObfuscatedName("pn.lo(Ljava/lang/String;I)V")
	public static final void method6829(String arg0) {
		int var1 = field11006 ? 400 : 200;
		if (arg0 == null) {
			return;
		}
		if (field10811 >= var1) {
			ChatHistory.method1006(4, field11006 ? LocalisedText.FRIENDLIST_FULL_MEMBERS.method15021(Statics.field1680) : LocalisedText.FRIENDLIST_FULL.method15021(Statics.field1680));
			return;
		}
		String var2 = class795.method15191(arg0, Statics.field10782);
		if (var2 == null) {
			return;
		}
		for (int var3 = 0; var3 < field10811; var3++) {
			Friend var4 = field11065[var3];
			String var5 = class795.method15191(var4.field606, Statics.field10782);
			if (var5 != null && var5.equals(var2)) {
				ChatHistory.method1006(4, arg0 + LocalisedText.FRIENDLISTDUPE.method15021(Statics.field1680));
				return;
			}
			if (var4.field607 != null) {
				String var6 = class795.method15191(var4.field607, Statics.field10782);
				if (var6 != null && var6.equals(var2)) {
					ChatHistory.method1006(4, arg0 + LocalisedText.FRIENDLISTDUPE.method15021(Statics.field1680));
					return;
				}
			}
		}
		for (int var7 = 0; var7 < field11084; var7++) {
			class27 var8 = field11086[var7];
			String var9 = class795.method15191(var8.field598, Statics.field10782);
			if (var9 != null && var9.equals(var2)) {
				ChatHistory.method1006(4, LocalisedText.REMOVEIGNORE1.method15021(Statics.field1680) + arg0 + LocalisedText.REMOVEIGNORE2.method15021(Statics.field1680));
				return;
			}
			if (var8.field596 != null) {
				String var10 = class795.method15191(var8.field596, Statics.field10782);
				if (var10 != null && var10.equals(var2)) {
					ChatHistory.method1006(4, LocalisedText.REMOVEIGNORE1.method15021(Statics.field1680) + arg0 + LocalisedText.REMOVEIGNORE2.method15021(Statics.field1680));
					return;
				}
			}
		}
		if (class795.method15191(Statics.field4490.field12062, Statics.field10782).equals(var2)) {
			ChatHistory.method1006(4, LocalisedText.FRIENDCANTADDSELF.method15021(Statics.field1680));
			return;
		}
		ServerConnection var11 = method640();
		ClientMessage var12 = Statics.method1604(ClientProt.FRIENDLIST_ADD, var11.field794);
		var12.field11432.p1(Packet.pjstrlen(arg0));
		var12.field11432.pjstr(arg0);
		var11.method934(var12);
	}

	@ObfuscatedName("vv.ls(Ljava/lang/String;B)V")
	public static final void method9390(String arg0) {
		if (arg0 == null) {
			return;
		}
		String var1 = class795.method15191(arg0, Statics.field10782);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < field10811; var2++) {
			Friend var3 = field11065[var2];
			String var4 = var3.field606;
			String var5 = class795.method15191(var4, Statics.field10782);
			if (class222.method18886(arg0, var1, var4, var5)) {
				field10811--;
				for (int var6 = var2; var6 < field10811; var6++) {
					field11065[var6] = field11065[var6 + 1];
				}
				field11022 = field11058;
				ServerConnection var7 = method640();
				ClientMessage var8 = Statics.method1604(ClientProt.FRIENDLIST_DEL, var7.field794);
				var8.field11432.p1(Packet.pjstrlen(arg0));
				var8.field11432.pjstr(arg0);
				var7.method934(var8);
				break;
			}
		}
	}

	@ObfuscatedName("cs.lu(Ljava/lang/String;B)V")
	public static final void method1574(String arg0) {
		if (arg0 == null) {
			return;
		}
		String var1 = class795.method15191(arg0, Statics.field10782);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < field11084; var2++) {
			class27 var3 = field11086[var2];
			String var4 = var3.field598;
			String var5 = class795.method15191(var4, Statics.field10782);
			if (class222.method18886(arg0, var1, var4, var5)) {
				field11084--;
				for (int var6 = var2; var6 < field11084; var6++) {
					field11086[var6] = field11086[var6 + 1];
				}
				field11022 = field11058;
				ServerConnection var7 = method640();
				ClientMessage var8 = Statics.method1604(ClientProt.IGNORELIST_DEL, var7.field794);
				var8.field11432.p1(Packet.pjstrlen(arg0));
				var8.field11432.pjstr(arg0);
				var7.method934(var8);
				break;
			}
		}
	}

	@ObfuscatedName("jh.ly(II)V")
	public static void method5080(int arg0) {
		for (Node var1 = field10873.method14500(); var1 != null; var1 = field10873.method14502()) {
			if ((var1.field6760 >> 48 & 0xFFFFL) == (long) arg0) {
				var1.method8440();
			}
		}
	}

	@ObfuscatedName("client.lg(Lhf;)Laki;")
	public static ServerActiveProperties method17197(Component arg0) {
		ServerActiveProperties var1 = (ServerActiveProperties) field10873.method14495(((long) arg0.field2158 << 32) + (long) arg0.field2183);
		return var1 == null ? arg0.field2268 : var1;
	}

	@ObfuscatedName("client.lx(Lhf;)Lhf;")
	public static Component method17238(Component arg0) {
		ServerActiveProperties var1 = method17197(arg0);
		if (var1.method17701()) {
			return Statics.field1734;
		}
		int var2 = var1.method17710();
		if (var2 == 0) {
			return null;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			arg0 = method6000(Statics.method5367(arg0.field2158), arg0);
			if (arg0 == null) {
				return Statics.field1734;
			}
		}
		return arg0;
	}

	@ObfuscatedName("client.lj(Lhf;)Z")
	public static boolean method16930(Component arg0) {
		if (field10881) {
			if (method17197(arg0).field11385 != 0) {
				return false;
			}
			if (arg0.field2184 == 0) {
				return false;
			}
		}
		if (Component.field2166 == arg0.field2185) {
			return arg0.field2201 || !field10794 && !field10848;
		} else {
			return arg0.field2201;
		}
	}

	@ObfuscatedName("vz.lz(Lhf;I)Ljava/lang/String;")
	public static String method9557(Component arg0) {
		if (method17197(arg0).method17691() == 0) {
			return null;
		} else if (arg0.field2288 == null || arg0.field2288.trim().length() == 0) {
			return field10881 ? "Hidden-use" : null;
		} else {
			return arg0.field2288;
		}
	}

	@ObfuscatedName("zg.ln(S)Z")
	public static boolean incrementVerifyId() {
		field10842++;
		field11082 = true;
		return true;
	}

	@ObfuscatedName("adb.lt(I)V")
	public static void method15198() {
		ServerConnection var0 = method640();
		ClientMessage var1 = Statics.method1604(ClientProt.TRANSMITVAR_VERIFYID, var0.field794);
		var1.field11432.p4(field10842);
		var0.method934(var1);
	}

	@ObfuscatedName("im.ld(Ljava/lang/String;ZS)I")
	public static int method4628(String arg0, boolean arg1) {
		String var2 = arg0.toLowerCase();
		Statics.field8054 = null;
		Statics.field8728 = 0;
		LinkedList var3 = new LinkedList();
		LinkedList var4 = new LinkedList();
		for (int var5 = 0; var5 < Statics.field1842.field8794; var5++) {
			ObjType var6 = (ObjType) Statics.field1842.get(var5);
			if ((!arg1 || var6.field8645) && var6.field8663 == -1 && var6.field8675 == -1 && var6.field8694 == -1 && var6.field8689 == 0 && var6.field8630.toLowerCase().indexOf(var2) != -1) {
				if (var3.size() >= 250) {
					return -1;
				}
				var3.add(var5);
				var4.add(var6.field8630);
			}
		}
		Statics.field8054 = new int[var3.size()];
		int var7 = 0;
		Iterator var8 = var3.iterator();
		while (var8.hasNext()) {
			Integer var9 = (Integer) var8.next();
			Statics.field8054[var7++] = var9;
		}
		String[] var10 = (String[]) var4.toArray(new String[Statics.field8054.length]);
		class664.method4054(var10, Statics.field8054);
		return var3.size();
	}

	@ObfuscatedName("hv.lk(Ljava/lang/String;ZB)I")
	public static int method4296(String arg0, boolean arg1) {
		String var2 = arg0.toLowerCase();
		Statics.field10750 = null;
		Statics.field7272 = 0;
		LinkedList var3 = new LinkedList();
		LinkedList var4 = new LinkedList();
		int var5 = arg1 ? 32768 : 0;
		int var6 = var5 + (arg1 ? Statics.field489.field8857 : Statics.field489.field8856);
		for (int var7 = var5; var7 < var6; var7++) {
			class1186 var8 = Statics.field489.method14982(var7);
			if (var8.field12382 && var8.method19534().toLowerCase().indexOf(var2) != -1) {
				if (var3.size() >= 50) {
					return -1;
				}
				var3.add(var7);
				var4.add(var8.method19534());
			}
		}
		Statics.field10750 = new int[var3.size()];
		int var9 = 0;
		Iterator var10 = var3.iterator();
		while (var10.hasNext()) {
			Integer var11 = (Integer) var10.next();
			Statics.field10750[var9++] = var11;
		}
		String[] var12 = (String[]) var4.toArray(new String[Statics.field10750.length]);
		class664.method4054(var12, Statics.field10750);
		return var3.size();
	}

	@ObfuscatedName("n.mf(II)Ladh;")
	public static class792 method146(int arg0) {
		class792 var1 = (class792) field10834.method2930((long) arg0);
		if (var1 == null) {
			var1 = new class792(Statics.field7283, class791.method746(arg0), class791.method15018(arg0));
			field10834.method2921(var1, (long) arg0);
		}
		return var1;
	}

	@ObfuscatedName("if.mh(IS)Ladh;")
	public static class792 method4574(int arg0) {
		class792 var1 = (class792) field10857.method2930((long) arg0);
		if (var1 == null) {
			var1 = new class792(Statics.field7283, arg0);
		}
		return var1;
	}

	@ObfuscatedName("acb.mx(J)Ljava/lang/String;")
	public static String method14989(long arg0) {
		return TimeZones.method3647(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}

	@ObfuscatedName("ke.mg(Ljava/lang/String;B)V")
	public static void method5135(String arg0) {
		field10990 = arg0;
		if (GameShell.getEnvironment() == GameShell3$Environment.APPLICATION) {
			return;
		}
		try {
			String var1 = Statics.field11885.getParameter(JavConfigParameter.field4122.field4162);
			String var2 = Statics.field11885.getParameter(JavConfigParameter.field4132.field4162);
			String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
			String var4;
			if (arg0.length() == 0) {
				var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var3 + "; Expires=" + method14989(MonotonicTime.method3655() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			BrowserControl.eval(Statics.field11885, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("fw.me(B)V")
	public static void method3094() {
		if (GameShell.getEnvironment() == GameShell3$Environment.APPLICATION) {
			return;
		}
		try {
			String var0 = Statics.field11885.getParameter(JavConfigParameter.field4132.field4162);
			int var1 = (int) (MonotonicTime.method3655() / 86400000L) - 11745;
			String var2 = "usrdob=" + var1 + "; version=1; path=/; domain=" + var0;
			BrowserControl.eval(Statics.field11885, "document.cookie=\"" + var2 + "\"");
		} catch (Throwable var4) {
		}
	}

	@ObfuscatedName("qk.mn(I)Ljava/lang/String;")
	public static String method7363() {
		return method4591("www", false);
	}

	@ObfuscatedName("ih.mv(Ljava/lang/String;ZI)Ljava/lang/String;")
	public static String method4591(String arg0, boolean arg1) {
		String var2 = arg1 ? "https://" : "http://";
		if (Statics.field1811 == ModeWhere.field8270) {
			arg0 = arg0 + "-wtrc";
		} else if (Statics.field1811 == ModeWhere.field8269) {
			arg0 = arg0 + "-wtqa";
		} else if (Statics.field1811 == ModeWhere.field8268) {
			arg0 = arg0 + "-wtwip";
		} else if (Statics.field1811 == ModeWhere.field8272) {
			arg0 = arg0 + "-wti";
		} else if (Statics.field1811 == ModeWhere.field8276) {
			arg0 = arg0 + "-demo";
		} else if (Statics.field1811 == ModeWhere.field8277) {
			arg0 = "local";
		}
		String var3 = "";
		if (field10990 != null) {
			var3 = "/p=" + field10990;
		}
		String var4 = field10768.field8333 + ".com";
		return var2 + arg0 + "." + var4 + "/l=" + Statics.field1680.field8298 + "/a=" + field10772 + var3 + "/";
	}

	@ObfuscatedName("ty.my(IIIIIILjava/lang/String;I)V")
	public static void method8476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
		class956 var7 = new class956();
		var7.field11206 = arg0;
		var7.field11202 = arg1;
		var7.field11204 = arg2;
		var7.field11203 = field10903 + arg4;
		var7.field11205 = arg3 * 4;
		var7.field11208 = arg6;
		var7.field11207 = arg5;
		field10864.method14243(var7);
	}

	@ObfuscatedName("aar.md(I)I")
	public static int method14298() {
		return Statics.field11389.field7749 ? 3 : 2;
	}

	@ObfuscatedName("gw.mk(IIIIIIIIIIIIIIZIII)V")
	public static void method3621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
		if (arg1 != 0 && arg3 != -1) {
			PathingEntity var17 = null;
			if (arg1 < 0) {
				int var18 = -arg1 - 1;
				if (field10945 == var18) {
					var17 = Statics.field4490;
				} else {
					var17 = field10944[var18];
				}
			} else {
				int var19 = arg1 - 1;
				ObjectWrapper var20 = (ObjectWrapper) field10838.method14495((long) var19);
				if (var20 != null) {
					var17 = (PathingEntity) var20.field11436;
				}
			}
			if (var17 != null) {
				BASType var21 = var17.method16508();
				if (var21.field7357 != null && var21.field7357[arg3] != null) {
					arg4 -= var21.field7357[arg3][1];
				}
				if (var21.field7347 != null && var21.field7347[arg3] != null) {
					arg4 -= var21.field7347[arg3][1];
				}
			}
		}
		class1234 var22 = new class1234(world.method7743(), arg0, arg16, arg16, arg6, arg7, arg4, field10903 + arg10, field10903 + arg11, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
		var22.method19725(arg8, arg9, method3660(arg8, arg9, arg16) - arg5, field10903 + arg10);
		field10965.method14153(new class1173(var22));
	}

	@ObfuscatedName("fw.mq(I)V")
	public static void method3095() {
		if (Statics.field1811 != ModeWhere.field8277) {
			JavascriptFunction.field4036.method6090();
		}
	}

	@ObfuscatedName("ib.ms(Lax;I)V")
	public static void method4499(ServerConnection arg0) {
		ClientMessage var1 = Statics.method1604(ClientProt.field3762, arg0.field794);
		arg0.method934(var1);
		field11095 = true;
	}

	@ObfuscatedName("client.mo(B)V")
	public void method16971() {
		Statics.field7015 = field11114.iterator();
		while (Statics.field7015.hasNext()) {
			int var1 = (Integer) Statics.field7015.next();
			if (Statics.field10317.method6889(var1)) {
				Statics.field7015.remove();
			}
		}
	}
}
