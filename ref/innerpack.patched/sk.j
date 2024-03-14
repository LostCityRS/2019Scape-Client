.version 50 0
.class public super abstract sk
.super java/lang/Object
.implements se
.implements java/lang/Runnable
.implements java/awt/event/FocusListener
.implements java/awt/event/WindowListener
.field static final aq Ljava/lang/String; = "main_file_cache.dat2"
.field static n J
.field public static m I
.field public static r I
.field static p I
.field static final w I = 32
.field static l [J
.field static u I
.field static z [J
.field static final an I = 0
.field protected static d I
.field public static f Lsr;
.field static volatile ah J
.field public static y I
.field public static q I
.field protected static b Ljava/lang/String;
.field protected static volatile j Z
.field public static v I
.field bi Z
.field public static k I
.field protected static ac Z
.field static volatile ai Z
.field static final at J = 3221225472L
.field protected static volatile ag Z
.field static final am Ljava/lang/String; = "rw"
.field static au Ljava/io/File;
.field static bk J
.field static final ax Ljava/lang/String; = "main_file_cache.idx"
.field static final av Ljava/lang/String; = "main_file_cache.idx255"
.field static final ao Ljava/lang/String; = "random.dat"
.field static aj Labp;
.field static ae I
.field protected static ay Labp;
.field public static bd I
.field static final bf I = 1
.field static bl Lsm;
.field protected static ab Labp;
.field static bh Z
.field bx Z
.field static final ad I = 1048576
.field public static bc I
.field static e I

.method <init> : ()V
    .code stack 3 locals 1
        .catch java/lang/RuntimeException from L0 to L15 using L15
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field sk bx Z
L9:     aload_0
L10:    iconst_0
L11:    putfield Field sk bi Z
L14:    return

        .stack full
            locals
            stack Object java/lang/RuntimeException
        .end stack
L15:    new java/lang/StringBuilder
L18:    dup
L19:    invokespecial Method java/lang/StringBuilder <init> ()V
L22:    ldc "sk.<init>("
L24:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L27:    ldc 41
L29:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L32:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L35:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L38:    athrow
L39:    
        .linenumbertable
            L0 89
            L4 76
            L9 79
            L14 89
        .end linenumbertable
    .end code
.end method

.method public supplyApplet : (Ljava/applet/Applet;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L5 using L5
L0:     aload_1
L1:     putstatic Field aol i Ljava/applet/Applet;
L4:     return

        .stack stack_1 Object java/lang/RuntimeException
L5:     new java/lang/StringBuilder
L8:     dup
L9:     invokespecial Method java/lang/StringBuilder <init> ()V
L12:    ldc "sk.supplyApplet("
L14:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L17:    ldc 41
L19:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L22:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L25:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L28:    athrow
L29:    
        .linenumbertable
            L0 92
            L4 93
        .end linenumbertable
    .end code
.end method

.method public final windowDeactivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L1 using L1
L0:     return

        .stack stack_1 Object java/lang/RuntimeException
L1:     new java/lang/StringBuilder
L4:     dup
L5:     invokespecial Method java/lang/StringBuilder <init> ()V
L8:     ldc "sk.windowDeactivated("
L10:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L13:    ldc 41
L15:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L18:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L21:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L24:    athrow
L25:    
        .linenumbertable
            L0 706
        .end linenumbertable
    .end code
.end method

.method final n : (Ljava/lang/String;Ljava/lang/String;IIIII)V
    .code stack 10 locals 13
L0:     iload 4
L2:     ldc -50287977
L4:     imul
L5:     putstatic Field b ap I
L8:     iload_3
L9:     ldc 1992753025
L11:    imul
L12:    putstatic Field jr aa I
L15:    iload 5
L17:    ldc 637270585
L19:    imul
L20:    putstatic Field atc m I
L23:    ldc -501733079
L25:    iload 6
L27:    imul
L28:    putstatic Field atc k I
L31:    ldc "Unknown"
L33:    putstatic Field ky bn Ljava/lang/String;
L36:    ldc "1.1"
L38:    putstatic Field ae bt Ljava/lang/String;
        .catch java/lang/Exception from L41 to L57 using L60
L41:    ldc "java.vendor"
L43:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L46:    putstatic Field ky bn Ljava/lang/String;
L49:    ldc "java.version"
L51:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L54:    putstatic Field ae bt Ljava/lang/String;
L57:    goto L62

        .stack stack_1 Object java/lang/Exception
L60:    astore 8
        .catch java/lang/Exception from L62 to L70 using L73

        .stack same
L62:    ldc "os.name"
L64:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L67:    putstatic Field alc bm Ljava/lang/String;
L70:    goto L80

        .stack stack_1 Object java/lang/Exception
L73:    astore 8
L75:    ldc "Unknown"
L77:    putstatic Field alc bm Ljava/lang/String;

        .stack same
L80:    getstatic Field alc bm Ljava/lang/String;
L83:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L86:    putstatic Field ij bq Ljava/lang/String;
        .catch java/lang/Exception from L89 to L100 using L103
L89:    ldc "os.arch"
L91:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L94:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L97:    putstatic Field hq bb Ljava/lang/String;
L100:   goto L110

        .stack stack_1 Object java/lang/Exception
L103:   astore 8
L105:   ldc ""
L107:   putstatic Field hq bb Ljava/lang/String;
        .catch java/lang/Exception from L110 to L121 using L124

        .stack same
L110:   ldc "os.version"
L112:   invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L115:   invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L118:   putstatic Field xv be Ljava/lang/String;
L121:   goto L131

        .stack stack_1 Object java/lang/Exception
L124:   astore 8
L126:   ldc ""
L128:   putstatic Field xv be Ljava/lang/String;
        .catch java/lang/Exception from L131 to L169 using L172

        .stack same
L131:   ldc "user.home"
L133:   invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L136:   putstatic Field pk by Ljava/lang/String;
L139:   getstatic Field pk by Ljava/lang/String;
L142:   ifnull L169
L145:   new java/lang/StringBuilder
L148:   dup
L149:   invokespecial Method java/lang/StringBuilder <init> ()V
L152:   getstatic Field pk by Ljava/lang/String;
L155:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L158:   ldc "/"
L160:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L163:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L166:   putstatic Field pk by Ljava/lang/String;

        .stack same
L169:   goto L174

        .stack stack_1 Object java/lang/Exception
L172:   astore 8
        .catch java/lang/Exception from L174 to L249 using L252

        .stack same
L174:   getstatic Field ij bq Ljava/lang/String;
L177:   ldc "win"
L179:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L182:   ifeq L203
L185:   aconst_null
L186:   getstatic Field pk by Ljava/lang/String;
L189:   if_acmpne L218
L192:   ldc "USERPROFILE"
L194:   invokestatic Method java/lang/System getenv (Ljava/lang/String;)Ljava/lang/String;
L197:   putstatic Field pk by Ljava/lang/String;
L200:   goto L218

        .stack same
L203:   aconst_null
L204:   getstatic Field pk by Ljava/lang/String;
L207:   if_acmpne L218
L210:   ldc "HOME"
L212:   invokestatic Method java/lang/System getenv (Ljava/lang/String;)Ljava/lang/String;
L215:   putstatic Field pk by Ljava/lang/String;

        .stack same
L218:   aconst_null
L219:   getstatic Field pk by Ljava/lang/String;
L222:   if_acmpeq L249
L225:   new java/lang/StringBuilder
L228:   dup
L229:   invokespecial Method java/lang/StringBuilder <init> ()V
L232:   getstatic Field pk by Ljava/lang/String;
L235:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L238:   ldc "/"
L240:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L243:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L246:   putstatic Field pk by Ljava/lang/String;

        .stack same
L249:   goto L254

        .stack stack_1 Object java/lang/Exception
L252:   astore 8

        .stack same
L254:   aconst_null
L255:   getstatic Field pk by Ljava/lang/String;
L258:   if_acmpne L266
L261:   ldc "~/"
L263:   putstatic Field pk by Ljava/lang/String;
        .catch java/lang/Throwable from L266 to L275 using L278

        .stack same
L266:   invokestatic Method java/awt/Toolkit getDefaultToolkit ()Ljava/awt/Toolkit;
L269:   invokevirtual Method java/awt/Toolkit getSystemEventQueue ()Ljava/awt/EventQueue;
L272:   putstatic Field uw bu Ljava/awt/EventQueue;
L275:   goto L280

        .stack stack_1 Object java/lang/Throwable
L278:   astore 8

        .stack same
L280:   bipush 8
L282:   anewarray java/lang/String
L285:   dup
L286:   iconst_0
L287:   ldc "c:/rscache/"
L289:   aastore
L290:   dup
L291:   iconst_1
L292:   ldc "/rscache/"
L294:   aastore
L295:   dup
L296:   iconst_2
L297:   ldc "c:/windows/"
L299:   aastore
L300:   dup
L301:   iconst_3
L302:   ldc "c:/winnt/"
L304:   aastore
L305:   dup
L306:   iconst_4
L307:   ldc_w "c:/"
L310:   aastore
L311:   dup
L312:   iconst_5
L313:   getstatic Field pk by Ljava/lang/String;
L316:   aastore
L317:   dup
L318:   bipush 6
L320:   ldc_w "/tmp/"
L323:   aastore
L324:   dup
L325:   bipush 7
L327:   ldc ""
L329:   aastore
L330:   putstatic Field y af [Ljava/lang/String;
L333:   iconst_2
L334:   anewarray java/lang/String
L337:   dup
L338:   iconst_0
L339:   new java/lang/StringBuilder
L342:   dup
L343:   invokespecial Method java/lang/StringBuilder <init> ()V
L346:   ldc_w ".jagex_cache_"
L349:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L352:   getstatic Field jr aa I
L355:   ldc_w -1839644543
L358:   imul
L359:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L362:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L365:   aastore
L366:   dup
L367:   iconst_1
L368:   new java/lang/StringBuilder
L371:   dup
L372:   invokespecial Method java/lang/StringBuilder <init> ()V
L375:   ldc_w ".file_store_"
L378:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L381:   ldc_w -1839644543
L384:   getstatic Field jr aa I
L387:   imul
L388:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L391:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L394:   aastore
L395:   putstatic Field la ak [Ljava/lang/String;
L398:   iconst_0
L399:   istore 8

        .stack append Integer
L401:   iload 8
L403:   iconst_4
L404:   if_icmpge L502
L407:   aload_0
L408:   aload_1
L409:   aload_2
L410:   iload 8
L412:   ldc_w 16777215
L415:   invokevirtual Method sk m (Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;
L418:   putstatic Field sx ar Ljava/io/File;
L421:   getstatic Field sx ar Ljava/io/File;
L424:   invokevirtual Method java/io/File exists ()Z
L427:   ifne L437
L430:   getstatic Field sx ar Ljava/io/File;
L433:   invokevirtual Method java/io/File mkdirs ()Z
L436:   pop

        .stack same
L437:   getstatic Field sx ar Ljava/io/File;
L440:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L443:   astore 9
L445:   aload 9
L447:   ifnull L502
L450:   aload 9
L452:   astore 10
L454:   iconst_0
L455:   istore 11

        .stack append Object [Ljava/io/File; Object [Ljava/io/File; Integer
L457:   iload 11
L459:   aload 10
L461:   arraylength
L462:   if_icmpge L493
L465:   aload 10
L467:   iload 11
L469:   aaload
L470:   astore 12
L472:   aload_0
L473:   aload 12
L475:   iconst_0
L476:   bipush -11
L478:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L481:   ifne L487
L484:   goto L496

        .stack append Object java/io/File
L487:   iinc 11 1
L490:   goto L457

        .stack chop 1
L493:   goto L502

        .stack append Object java/io/File
L496:   iinc 8 1
L499:   goto L401

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Integer Integer Integer Integer
            stack
        .end stack
L502:   getstatic Field sx ar Ljava/io/File;
L505:   bipush 21
L507:   invokestatic Method gn e (Ljava/io/File;B)V
L510:   ldc_w 1719882568
L513:   invokestatic Method n u (I)V
L516:   new abp
L519:   dup
L520:   new abl
L523:   dup
L524:   ldc "main_file_cache.dat2"
L526:   ldc_w -861829956
L529:   invokestatic Method aou m (Ljava/lang/String;I)Ljava/io/File;
L532:   ldc "rw"
L534:   ldc2_w 3221225472L
L537:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L540:   sipush 5200
L543:   iconst_0
L544:   invokespecial Method abp <init> (Labl;II)V
L547:   putstatic Field sk ay Labp;
L550:   new abp
L553:   dup
L554:   new abl
L557:   dup
L558:   ldc "main_file_cache.idx255"
L560:   ldc_w -416434094
L563:   invokestatic Method aou m (Ljava/lang/String;I)Ljava/io/File;
L566:   ldc "rw"
L568:   ldc2_w 1048576L
L571:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L574:   sipush 6000
L577:   iconst_0
L578:   invokespecial Method abp <init> (Labl;II)V
L581:   putstatic Field sk ab Labp;
L584:   ldc_w 694777127
L587:   getstatic Field b ap I
L590:   imul
L591:   anewarray abp
L594:   putstatic Field vs az [Labp;
L597:   iconst_0
L598:   istore 8

        .stack same_extended
L600:   iload 8
L602:   ldc_w 694777127
L605:   getstatic Field b ap I
L608:   imul
L609:   if_icmpge L673
L612:   getstatic Field vs az [Labp;
L615:   iload 8
L617:   new abp
L620:   dup
L621:   new abl
L624:   dup
L625:   new java/lang/StringBuilder
L628:   dup
L629:   invokespecial Method java/lang/StringBuilder <init> ()V
L632:   ldc "main_file_cache.idx"
L634:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L637:   iload 8
L639:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L642:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L645:   ldc_w -2006573480
L648:   invokestatic Method aou m (Ljava/lang/String;I)Ljava/io/File;
L651:   ldc "rw"
L653:   ldc2_w 1048576L
L656:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L659:   sipush 6000
L662:   iconst_0
L663:   invokespecial Method abp <init> (Labl;II)V
L666:   aastore
L667:   iinc 8 1
L670:   goto L600
        .catch java/lang/Exception from L673 to L683 using L686
        .catch java/lang/RuntimeException from L0 to L831 using L831

        .stack same_extended
L673:   new aae
L676:   dup
L677:   invokespecial Method aae <init> ()V
L680:   putstatic Field sn al Laae;
L683:   goto L692

        .stack stack_1 Object java/lang/Exception
L686:   astore 8
L688:   iconst_0
L689:   putstatic Field aab e Z

        .stack chop 1
L692:   new si
L695:   dup
L696:   invokespecial Method si <init> ()V
L699:   putstatic Field fo as Lsi;
L702:   invokestatic Method java/lang/Thread currentThread ()Ljava/lang/Thread;
L705:   invokevirtual Method java/lang/Thread getThreadGroup ()Ljava/lang/ThreadGroup;
L708:   astore 8
L710:   aload 8
L712:   invokevirtual Method java/lang/ThreadGroup getParent ()Ljava/lang/ThreadGroup;
L715:   astore 9

        .stack append Object java/lang/ThreadGroup Object java/lang/ThreadGroup
L717:   aload 9
L719:   ifnull L736
L722:   aload 9
L724:   astore 8
L726:   aload 8
L728:   invokevirtual Method java/lang/ThreadGroup getParent ()Ljava/lang/ThreadGroup;
L731:   astore 9
L733:   goto L717

        .stack same
L736:   sipush 1000
L739:   anewarray java/lang/Thread
L742:   astore 10
L744:   aload 8
L746:   aload 10
L748:   invokevirtual Method java/lang/ThreadGroup enumerate ([Ljava/lang/Thread;)I
L751:   pop
L752:   iconst_0
L753:   istore 11

        .stack append Object [Ljava/lang/Thread; Integer
L755:   iload 11
L757:   aload 10
L759:   arraylength
L760:   if_icmpge L803
L763:   aload 10
L765:   iload 11
L767:   aaload
L768:   ifnull L797
L771:   aload 10
L773:   iload 11
L775:   aaload
L776:   invokevirtual Method java/lang/Thread getName ()Ljava/lang/String;
L779:   ldc_w "AWT"
L782:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L785:   ifeq L797
L788:   aload 10
L790:   iload 11
L792:   aaload
L793:   iconst_1
L794:   invokevirtual Method java/lang/Thread setPriority (I)V

        .stack same
L797:   iinc 11 1
L800:   goto L755

        .stack same
L803:   new java/lang/Thread
L806:   dup
L807:   aload_0
L808:   invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L811:   astore 8
L813:   aload 8
L815:   iconst_1
L816:   invokevirtual Method java/lang/Thread setDaemon (Z)V
L819:   aload 8
L821:   invokevirtual Method java/lang/Thread start ()V
L824:   aload 8
L826:   iconst_1
L827:   invokevirtual Method java/lang/Thread setPriority (I)V
L830:   return

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Integer Integer Integer
            stack Object java/lang/RuntimeException
        .end stack
L831:   new java/lang/StringBuilder
L834:   dup
L835:   invokespecial Method java/lang/StringBuilder <init> ()V
L838:   ldc_w "sk.n("
L841:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L844:   ldc 41
L846:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L849:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L852:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L855:   athrow
L856:   
        .linenumbertable
            L0 117
            L8 118
            L15 119
            L23 120
            L31 121
            L36 122
            L41 124
            L49 125
            L57 127
            L62 129
            L70 133
            L73 131
            L75 132
            L80 134
            L89 136
            L100 140
            L103 138
            L105 139
            L110 142
            L121 146
            L124 144
            L126 145
            L131 148
            L139 149
            L169 151
            L174 153
            L185 154
            L203 157
            L218 159
            L249 161
            L254 162
            L266 164
            L275 166
            L280 167
            L333 168
            L398 169
            L407 170
            L421 171
            L437 172
            L445 173
            L450 175
            L454 176
            L465 177
            L472 179
            L487 176
            L493 182
            L496 169
            L502 186
            L510 187
            L516 188
            L550 189
            L584 190
            L597 191
            L612 192
            L667 191
            L673 196
            L683 200
            L686 198
            L688 199
            L692 202
            L702 204
            L710 205
            L717 206
            L722 207
            L726 208
            L736 210
            L744 211
            L752 212
            L763 213
            L788 214
            L797 212
            L803 218
            L813 219
            L819 220
            L824 221
            L830 222
        .end linenumbertable
    .end code
    .exceptions java/lang/Exception
.end method

.method public destroy : ()V
    .code stack 4 locals 1
        .catch java/lang/RuntimeException from L0 to L35 using L35
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     ldc_w 4543014
L10:    invokestatic Method gz e (I)J
L13:    ldc2_w -992610302756464965L
L16:    lmul
L17:    putstatic Field sk bk J
L20:    ldc2_w 5000L
L23:    invokestatic Method cs e (J)V
L26:    aload_0
L27:    iconst_0
L28:    ldc_w 242259386
L31:    invokevirtual Method sk t (ZI)V
L34:    return

        .stack stack_1 Object java/lang/RuntimeException
L35:    new java/lang/StringBuilder
L38:    dup
L39:    invokespecial Method java/lang/StringBuilder <init> ()V
L42:    ldc_w "sk.destroy("
L45:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L48:    ldc 41
L50:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L53:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L56:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L59:    athrow
L60:    
        .linenumbertable
            L0 670
            L7 671
            L20 672
            L26 673
            L34 674
        .end linenumbertable
    .end code
.end method

.method k : (Ljava/io/File;Ljava/io/File;I)V
    .code stack 6 locals 6
        .catch java/io/IOException from L0 to L114 using L117
        .catch java/lang/RuntimeException from L0 to L125 using L125
L0:     new abl
L3:     dup
L4:     getstatic Field sk au Ljava/io/File;
L7:     ldc "rw"
L9:     ldc2_w 10000L
L12:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L15:    astore 4
L17:    new alw
L20:    dup
L21:    sipush 500
L24:    invokespecial Method alw <init> (I)V
L27:    astore 5
L29:    aload 5
L31:    iconst_3
L32:    bipush -88
L34:    invokevirtual Method alw k (IB)V
L37:    aload 5
L39:    aconst_null
L40:    aload_2
L41:    if_acmpeq L48
L44:    iconst_1
L45:    goto L49

        .stack full
            locals Object sk Object java/io/File Object java/io/File Integer Object abl Object alw
            stack Object alw
        .end stack
L48:    iconst_0

        .stack full
            locals Object sk Object java/io/File Object java/io/File Integer Object abl Object alw
            stack Object alw Integer
        .end stack
L49:    bipush -102
L51:    invokevirtual Method alw k (IB)V
L54:    aload 5
L56:    aload_1
L57:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L60:    ldc_w -1489303680
L63:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V
L66:    aconst_null
L67:    aload_2
L68:    if_acmpeq L83
L71:    aload 5
L73:    aload_2
L74:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L77:    ldc_w -1489303680
L80:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V

        .stack same
L83:    aload 4
L85:    aload 5
L87:    getfield Field alw w [B
L90:    iconst_0
L91:    ldc_w 212851357
L94:    aload 5
L96:    getfield Field alw l I
L99:    imul
L100:   ldc_w 1989108324
L103:   invokevirtual Method abl n ([BIII)V
L106:   aload 4
L108:   ldc_w -857072319
L111:   invokevirtual Method abl m (I)V
L114:   goto L124

        .stack full
            locals Object sk Object java/io/File Object java/io/File Integer
            stack Object java/io/IOException
        .end stack
L117:   astore 5
L119:   aload 5
L121:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L124:   return

        .stack full
            locals Object sk Object java/io/File Object java/io/File Integer
            stack Object java/lang/RuntimeException
        .end stack
L125:   new java/lang/StringBuilder
L128:   dup
L129:   invokespecial Method java/lang/StringBuilder <init> ()V
L132:   ldc_w "sk.k("
L135:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L138:   ldc 41
L140:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L143:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L146:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L149:   athrow
L150:   
        .linenumbertable
            L0 318
            L17 319
            L29 320
            L37 321
            L54 322
            L66 323
            L83 324
            L106 325
            L114 329
            L117 327
            L119 328
            L124 330
        .end linenumbertable
    .end code
.end method

.method f : (Ljava/io/File;ZB)Z
    .code stack 4 locals 6
        .catch java/lang/Exception from L0 to L53 using L54
        .catch java/lang/RuntimeException from L0 to L58 using L58
L0:     new java/io/RandomAccessFile
L3:     dup
L4:     aload_1
L5:     ldc "rw"
L7:     invokespecial Method java/io/RandomAccessFile <init> (Ljava/io/File;Ljava/lang/String;)V
L10:    astore 4
L12:    aload 4
L14:    invokevirtual Method java/io/RandomAccessFile read ()I
L17:    istore 5
L19:    aload 4
L21:    lconst_0
L22:    invokevirtual Method java/io/RandomAccessFile seek (J)V
L25:    aload 4
L27:    iload 5
L29:    invokevirtual Method java/io/RandomAccessFile write (I)V
L32:    aload 4
L34:    lconst_0
L35:    invokevirtual Method java/io/RandomAccessFile seek (J)V
L38:    aload 4
L40:    invokevirtual Method java/io/RandomAccessFile close ()V
L43:    iload_2
L44:    ifeq L52
L47:    aload_1
L48:    invokevirtual Method java/io/File delete ()Z
L51:    pop

        .stack append Object java/io/RandomAccessFile Integer
L52:    iconst_1
L53:    ireturn

        .stack full
            locals Object sk Object java/io/File Integer Integer
            stack Object java/lang/Exception
        .end stack
L54:    astore 4
L56:    iconst_0
L57:    ireturn

        .stack stack_1 Object java/lang/RuntimeException
L58:    new java/lang/StringBuilder
L61:    dup
L62:    invokespecial Method java/lang/StringBuilder <init> ()V
L65:    ldc_w "sk.f("
L68:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L71:    ldc 41
L73:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L76:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L79:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L82:    athrow
L83:    
        .linenumbertable
            L0 334
            L12 335
            L19 336
            L25 337
            L32 338
            L38 339
            L43 340
            L52 341
            L54 343
            L56 344
        .end linenumbertable
    .end code
.end method

.method synchronized d : (Ljava/lang/String;B)V
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L101 using L101
L0:     new java/awt/Frame
L3:     dup
L4:     invokespecial Method java/awt/Frame <init> ()V
L7:     putstatic Field vy h Ljava/awt/Frame;
L10:    getstatic Field vy h Ljava/awt/Frame;
L13:    aload_1
L14:    invokevirtual Method java/awt/Frame setTitle (Ljava/lang/String;)V
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    iconst_1
L21:    invokevirtual Method java/awt/Frame setResizable (Z)V
L24:    getstatic Field vy h Ljava/awt/Frame;
L27:    aload_0
L28:    invokevirtual Method java/awt/Frame addWindowListener (Ljava/awt/event/WindowListener;)V
L31:    getstatic Field vy h Ljava/awt/Frame;
L34:    getstatic Field java/awt/Color black Ljava/awt/Color;
L37:    invokevirtual Method java/awt/Frame setBackground (Ljava/awt/Color;)V
L40:    getstatic Field vy h Ljava/awt/Frame;
L43:    iconst_1
L44:    invokevirtual Method java/awt/Frame setVisible (Z)V
L47:    getstatic Field vy h Ljava/awt/Frame;
L50:    invokevirtual Method java/awt/Frame toFront ()V
L53:    getstatic Field vy h Ljava/awt/Frame;
L56:    invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L59:    astore_3
L60:    getstatic Field vy h Ljava/awt/Frame;
L63:    getstatic Field sk d I
L66:    ldc_w -108363597
L69:    imul
L70:    aload_3
L71:    getfield Field java/awt/Insets left I
L74:    iadd
L75:    aload_3
L76:    getfield Field java/awt/Insets right I
L79:    iadd
L80:    aload_3
L81:    getfield Field java/awt/Insets bottom I
L84:    aload_3
L85:    getfield Field java/awt/Insets top I
L88:    getstatic Field qf c I
L91:    ldc_w 2090134413
L94:    imul
L95:    iadd
L96:    iadd
L97:    invokevirtual Method java/awt/Frame setSize (II)V
L100:   return

        .stack stack_1_extended Object java/lang/RuntimeException
L101:   new java/lang/StringBuilder
L104:   dup
L105:   invokespecial Method java/lang/StringBuilder <init> ()V
L108:   ldc_w "sk.d("
L111:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L114:   ldc 41
L116:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L119:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L122:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L125:   athrow
L126:   
        .linenumbertable
            L0 438
            L10 439
            L17 440
            L24 441
            L31 442
            L40 443
            L47 444
            L53 445
            L60 446
            L100 447
        .end linenumbertable
    .end code
.end method

.method synchronized s : (I)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L34 using L34
L0:     aload_0
L1:     ldc_w -1978270461
L4:     invokevirtual Method sk x (I)V
L7:     ldc_w -283088421
L10:    invokestatic Method qf y (I)Ljava/awt/Container;
L13:    astore_2
L14:    new atu
L17:    dup
L18:    aload_2
L19:    invokespecial Method atu <init> (Ljava/awt/Component;)V
L22:    putstatic Field ahs g Ljava/awt/Canvas;
L25:    aload_0
L26:    aload_2
L27:    ldc_w 1220248857
L30:    invokevirtual Method sk q (Ljava/awt/Container;I)V
L33:    return

        .stack stack_1 Object java/lang/RuntimeException
L34:    new java/lang/StringBuilder
L37:    dup
L38:    invokespecial Method java/lang/StringBuilder <init> ()V
L41:    ldc_w "sk.s("
L44:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L47:    ldc 41
L49:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L52:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L55:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L58:    athrow
L59:    
        .linenumbertable
            L0 450
            L7 451
            L14 452
            L25 453
            L33 454
        .end linenumbertable
    .end code
.end method

.method public final do : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 706
        .end linenumbertable
    .end code
.end method

.method x : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L38 using L38
L0:     getstatic Field ahs g Ljava/awt/Canvas;
L3:     ifnull L37
L6:     getstatic Field ahs g Ljava/awt/Canvas;
L9:     aload_0
L10:    invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L13:    getstatic Field ahs g Ljava/awt/Canvas;
L16:    invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L19:    getstatic Field java/awt/Color black Ljava/awt/Color;
L22:    invokevirtual Method java/awt/Container setBackground (Ljava/awt/Color;)V
L25:    getstatic Field ahs g Ljava/awt/Canvas;
L28:    invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L31:    getstatic Field ahs g Ljava/awt/Canvas;
L34:    invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V

        .stack same
L37:    return

        .stack stack_1 Object java/lang/RuntimeException
L38:    new java/lang/StringBuilder
L41:    dup
L42:    invokespecial Method java/lang/StringBuilder <init> ()V
L45:    ldc_w "sk.x("
L48:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L51:    ldc 41
L53:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L56:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L59:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L62:    athrow
L63:    
        .linenumbertable
            L0 484
            L6 485
            L13 486
            L25 487
            L37 489
        .end linenumbertable
    .end code
.end method

.method final b : (I)Z
    .code stack 4 locals 3
L0:    iconst_1
L1:    ireturn
    .end code
.end method

.method m : (Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;
    .code stack 6 locals 17
L0:     iconst_0
L1:     iload_3
L2:     if_icmpne L10
L5:     ldc ""
L7:     goto L29

        .stack same
L10:    new java/lang/StringBuilder
L13:    dup
L14:    invokespecial Method java/lang/StringBuilder <init> ()V
L17:    ldc ""
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    iload_3
L23:    invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L26:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;

        .stack stack_1 Object java/lang/String
L29:    astore 5
L31:    new java/io/File
L34:    dup
L35:    getstatic Field pk by Ljava/lang/String;
L38:    new java/lang/StringBuilder
L41:    dup
L42:    invokespecial Method java/lang/StringBuilder <init> ()V
L45:    ldc_w "jagex_cl_"
L48:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L51:    aload_1
L52:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L55:    ldc_w "_"
L58:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L61:    aload_2
L62:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L65:    aload 5
L67:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L70:    ldc_w ".dat"
L73:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L76:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L79:    invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L82:    putstatic Field sk au Ljava/io/File;
L85:    aconst_null
L86:    astore 6
L88:    aconst_null
L89:    astore 7
L91:    iconst_0
L92:    istore 8
L94:    getstatic Field sk au Ljava/io/File;
L97:    invokevirtual Method java/io/File exists ()Z
L100:   ifeq L444
        .catch java/io/IOException from L103 to L372 using L375
L103:   new abl
L106:   dup
L107:   getstatic Field sk au Ljava/io/File;
L110:   ldc "rw"
L112:   ldc2_w 10000L
L115:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L118:   astore 9
L120:   new alw
L123:   dup
L124:   aload 9
L126:   ldc_w 1660572298
L129:   invokevirtual Method abl f (I)J
L132:   l2i
L133:   invokespecial Method alw <init> (I)V
L136:   astore 10

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Object java/lang/String Null Null Integer Object abl Object alw
            stack
        .end stack
L138:   ldc_w 212851357
L141:   aload 10
L143:   getfield Field alw l I
L146:   imul
L147:   aload 10
L149:   getfield Field alw w [B
L152:   arraylength
L153:   if_icmpge L228
L156:   aload 9
L158:   aload 10
L160:   getfield Field alw w [B
L163:   ldc_w 212851357
L166:   aload 10
L168:   getfield Field alw l I
L171:   imul
L172:   aload 10
L174:   getfield Field alw w [B
L177:   arraylength
L178:   ldc_w 212851357
L181:   aload 10
L183:   getfield Field alw l I
L186:   imul
L187:   isub
L188:   bipush 30
L190:   invokevirtual Method abl w ([BIIB)I
L193:   istore 11
L195:   iconst_m1
L196:   iload 11
L198:   if_icmpne L209
L201:   new java/io/IOException
L204:   dup
L205:   invokespecial Method java/io/IOException <init> ()V
L208:   athrow

        .stack append Integer
L209:   aload 10
L211:   dup
L212:   getfield Field alw l I
L215:   iload 11
L217:   ldc_w -1445626955
L220:   imul
L221:   iadd
L222:   putfield Field alw l I
L225:   goto L138

        .stack chop 1
L228:   aload 10
L230:   iconst_0
L231:   putfield Field alw l I
L234:   aload 10
L236:   sipush 16384
L239:   invokevirtual Method alw ai (S)I
L242:   istore 11
L244:   iload 11
L246:   iconst_1
L247:   if_icmplt L256
L250:   iload 11
L252:   iconst_3
L253:   if_icmple L284

        .stack append Integer
L256:   new java/io/IOException
L259:   dup
L260:   new java/lang/StringBuilder
L263:   dup
L264:   invokespecial Method java/lang/StringBuilder <init> ()V
L267:   ldc ""
L269:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L272:   iload 11
L274:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L277:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L280:   invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L283:   athrow

        .stack same
L284:   iconst_0
L285:   istore 12
L287:   iload 11
L289:   iconst_1
L290:   if_icmple L303
L293:   aload 10
L295:   sipush 16384
L298:   invokevirtual Method alw ai (S)I
L301:   istore 12

        .stack append Integer
L303:   iload 11
L305:   iconst_2
L306:   if_icmpgt L338
L309:   aload 10
L311:   ldc_w 1918013460
L314:   invokevirtual Method alw ab (I)Ljava/lang/String;
L317:   astore 6
L319:   iconst_1
L320:   iload 12
L322:   if_icmpne L364
L325:   aload 10
L327:   ldc_w -360628168
L330:   invokevirtual Method alw ab (I)Ljava/lang/String;
L333:   astore 7
L335:   goto L364

        .stack same
L338:   aload 10
L340:   ldc_w -1927749946
L343:   invokevirtual Method alw az (I)Ljava/lang/String;
L346:   astore 6
L348:   iconst_1
L349:   iload 12
L351:   if_icmpne L364
L354:   aload 10
L356:   ldc_w 1319692524
L359:   invokevirtual Method alw az (I)Ljava/lang/String;
L362:   astore 7

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object abl Object alw Integer Integer
            stack
        .end stack
L364:   aload 9
L366:   ldc_w -1482521954
L369:   invokevirtual Method abl m (I)V
L372:   goto L382

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer
            stack Object java/io/IOException
        .end stack
L375:   astore 10
L377:   aload 10
L379:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L382:   aload 6
L384:   ifnull L409
L387:   new java/io/File
L390:   dup
L391:   aload 6
L393:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L396:   astore 10
L398:   aload 10
L400:   invokevirtual Method java/io/File exists ()Z
L403:   ifne L409
L406:   aconst_null
L407:   astore 6

        .stack same
L409:   aconst_null
L410:   aload 6
L412:   if_acmpeq L444
L415:   new java/io/File
L418:   dup
L419:   aload 6
L421:   ldc_w "test.dat"
L424:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L427:   astore 10
L429:   aload_0
L430:   aload 10
L432:   iconst_1
L433:   bipush -57
L435:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L438:   ifne L444
L441:   aconst_null
L442:   astore 6

        .stack chop 2
L444:   aconst_null
L445:   aload 6
L447:   if_acmpne L586
L450:   iload_3
L451:   ifne L586
L454:   iconst_0
L455:   istore 9

        .stack append Integer
L457:   iload 9
L459:   getstatic Field la ak [Ljava/lang/String;
L462:   arraylength
L463:   if_icmpge L586
L466:   iconst_0
L467:   istore 10

        .stack append Integer
L469:   iload 10
L471:   getstatic Field y af [Ljava/lang/String;
L474:   arraylength
L475:   if_icmpge L580
L478:   new java/io/File
L481:   dup
L482:   new java/lang/StringBuilder
L485:   dup
L486:   invokespecial Method java/lang/StringBuilder <init> ()V
L489:   getstatic Field y af [Ljava/lang/String;
L492:   iload 10
L494:   aaload
L495:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L498:   getstatic Field la ak [Ljava/lang/String;
L501:   iload 9
L503:   aaload
L504:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L507:   getstatic Field java/io/File separatorChar C
L510:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L513:   aload_1
L514:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L517:   getstatic Field java/io/File separatorChar C
L520:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L523:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L526:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L529:   astore 11
L531:   aload 11
L533:   invokevirtual Method java/io/File exists ()Z
L536:   ifeq L574
L539:   aload_0
L540:   new java/io/File
L543:   dup
L544:   aload 11
L546:   ldc_w "test.dat"
L549:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L552:   iconst_1
L553:   bipush -31
L555:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L558:   ifeq L574
L561:   aload 11
L563:   invokevirtual Method java/io/File toString ()Ljava/lang/String;
L566:   astore 6
L568:   iconst_1
L569:   istore 8
L571:   goto L586

        .stack append Object java/io/File
L574:   iinc 10 1
L577:   goto L469

        .stack chop 1
L580:   iinc 9 1
L583:   goto L457

        .stack chop 2
L586:   aconst_null
L587:   aload 6
L589:   if_acmpne L656
L592:   new java/lang/StringBuilder
L595:   dup
L596:   invokespecial Method java/lang/StringBuilder <init> ()V
L599:   getstatic Field pk by Ljava/lang/String;
L602:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L605:   getstatic Field java/io/File separatorChar C
L608:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L611:   ldc_w "jagexcache"
L614:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L617:   aload 5
L619:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L622:   getstatic Field java/io/File separatorChar C
L625:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L628:   aload_1
L629:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L632:   getstatic Field java/io/File separatorChar C
L635:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L638:   aload_2
L639:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L642:   getstatic Field java/io/File separatorChar C
L645:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L648:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L651:   astore 6
L653:   iconst_1
L654:   istore 8

        .stack same_extended
L656:   aconst_null
L657:   aload 7
L659:   if_acmpeq L770
L662:   new java/io/File
L665:   dup
L666:   aload 7
L668:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L671:   astore 9
L673:   new java/io/File
L676:   dup
L677:   aload 6
L679:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L682:   astore 10
        .catch java/lang/Exception from L684 to L757 using L760
        .catch java/lang/RuntimeException from L0 to L802 using L802
L684:   aload 9
L686:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L689:   astore 11
L691:   aload 11
L693:   astore 12
L695:   iconst_0
L696:   istore 13

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File Object [Ljava/io/File; Object [Ljava/io/File; Integer
            stack
        .end stack
L698:   iload 13
L700:   aload 12
L702:   arraylength
L703:   if_icmpge L757
L706:   aload 12
L708:   iload 13
L710:   aaload
L711:   astore 14
L713:   new java/io/File
L716:   dup
L717:   aload 10
L719:   aload 14
L721:   invokevirtual Method java/io/File getName ()Ljava/lang/String;
L724:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L727:   astore 15
L729:   aload 14
L731:   aload 15
L733:   invokevirtual Method java/io/File renameTo (Ljava/io/File;)Z
L736:   istore 16
L738:   iload 16
L740:   ifne L751
L743:   new java/io/IOException
L746:   dup
L747:   invokespecial Method java/io/IOException <init> ()V
L750:   athrow

        .stack append Object java/io/File Object java/io/File Integer
L751:   iinc 13 1
L754:   goto L698

        .stack chop 3
L757:   goto L767

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File
            stack Object java/lang/Exception
        .end stack
L760:   astore 11
L762:   aload 11
L764:   invokevirtual Method java/lang/Exception printStackTrace ()V

        .stack append Object java/lang/Object
L767:   iconst_1
L768:   istore 8

        .stack chop 3
L770:   iload 8
L772:   ifeq L792
L775:   aload_0
L776:   new java/io/File
L779:   dup
L780:   aload 6
L782:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L785:   aconst_null
L786:   ldc_w -1497248091
L789:   invokevirtual Method sk k (Ljava/io/File;Ljava/io/File;I)V

        .stack same
L792:   new java/io/File
L795:   dup
L796:   aload 6
L798:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L801:   areturn

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer
            stack Object java/lang/RuntimeException
        .end stack
L802:   new java/lang/StringBuilder
L805:   dup
L806:   invokespecial Method java/lang/StringBuilder <init> ()V
L809:   ldc_w "sk.m("
L812:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L815:   ldc 41
L817:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L820:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L823:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L826:   athrow
L827:   
        .linenumbertable
            L0 225
            L31 226
            L85 227
            L88 228
            L91 229
            L94 230
            L103 233
            L120 234
            L138 235
            L156 236
            L195 237
            L209 238
            L225 239
            L228 240
            L234 241
            L244 242
            L284 243
            L287 244
            L303 245
            L309 246
            L319 247
            L338 250
            L348 251
            L364 253
            L372 257
            L375 255
            L377 256
            L382 258
            L387 259
            L398 260
            L406 261
            L409 264
            L415 265
            L429 266
            L441 267
            L444 271
            L454 272
            L466 273
            L478 274
            L531 275
            L539 276
            L561 277
            L568 278
            L571 279
            L574 273
            L580 272
            L586 285
            L592 286
            L653 287
            L656 289
            L662 290
            L673 291
            L684 293
            L691 295
            L695 296
            L706 297
            L713 299
            L729 300
            L738 301
            L751 296
            L757 308
            L760 306
            L762 307
            L767 309
            L770 311
            L792 312
        .end linenumbertable
    .end code
.end method

.method h : (I)V
    .code stack 6 locals 6
        .catch java/lang/RuntimeException from L0 to L406 using L406
L0:     aconst_null
L1:     getstatic Field ky bn Ljava/lang/String;
L4:     if_acmpeq L246
L7:     getstatic Field ky bn Ljava/lang/String;
L10:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L13:    astore_2
L14:    aload_2
L15:    ldc_w "sun"
L18:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L21:    iconst_m1
L22:    if_icmpne L36
L25:    aload_2
L26:    ldc_w "apple"
L29:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L32:    iconst_m1
L33:    if_icmpeq L246

        .stack append Object java/lang/String
L36:    getstatic Field ae bt Ljava/lang/String;
L39:    astore_3
L40:    aload_3
L41:    ldc "1.1"
L43:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L46:    ifne L149
L49:    aload_3
L50:    ldc_w "1.1."
L53:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L56:    ifne L149
L59:    aload_3
L60:    ldc_w "1.2"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifne L149
L69:    aload_3
L70:    ldc_w "1.2."
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifne L149
L79:    aload_3
L80:    ldc_w "1.3"
L83:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L86:    ifne L149
L89:    aload_3
L90:    ldc_w "1.3."
L93:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L96:    ifne L149
L99:    aload_3
L100:   ldc_w "1.4"
L103:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L106:   ifne L149
L109:   aload_3
L110:   ldc_w "1.4."
L113:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L116:   ifne L149
L119:   aload_3
L120:   ldc_w "1.5"
L123:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L126:   ifne L149
L129:   aload_3
L130:   ldc_w "1.5."
L133:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L136:   ifne L149
L139:   aload_3
L140:   ldc_w "1.6.0"
L143:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L146:   ifeq L160

        .stack append Object java/lang/String
L149:   aload_0
L150:   ldc_w "wrongjava"
L153:   ldc_w -44089755
L156:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L159:   return

        .stack same
L160:   aload_3
L161:   ldc_w "1.6.0_"
L164:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L167:   ifeq L246
L170:   bipush 6
L172:   istore 4

        .stack append Integer
L174:   iload 4
L176:   aload_3
L177:   invokevirtual Method java/lang/String length ()I
L180:   if_icmpge L202
L183:   aload_3
L184:   iload 4
L186:   invokevirtual Method java/lang/String charAt (I)C
L189:   iconst_1
L190:   invokestatic Method pz o (CB)Z
L193:   ifeq L202
L196:   iinc 4 1
L199:   goto L174

        .stack same
L202:   aload_3
L203:   bipush 6
L205:   iload 4
L207:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L210:   astore 5
L212:   aload 5
L214:   ldc_w 250407149
L217:   invokestatic Method wc m (Ljava/lang/CharSequence;I)Z
L220:   ifeq L246
L223:   aload 5
L225:   bipush 8
L227:   invokestatic Method vk f (Ljava/lang/CharSequence;B)I
L230:   bipush 10
L232:   if_icmpge L246
L235:   aload_0
L236:   ldc_w "wrongjava"
L239:   ldc_w 660211670
L242:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L245:   return

        .stack chop 3
L246:   ldc_w -283088421
L249:   invokestatic Method qf y (I)Ljava/awt/Container;
L252:   iconst_1
L253:   invokevirtual Method java/awt/Container setFocusCycleRoot (Z)V
L256:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L259:   invokevirtual Method java/lang/Runtime maxMemory ()J
L262:   ldc2_w 1048576L
L265:   ldiv
L266:   l2i
L267:   iconst_1
L268:   iadd
L269:   ldc_w 2060182503
L272:   imul
L273:   putstatic Field sk bd I
L276:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L279:   invokevirtual Method java/lang/Runtime availableProcessors ()I
L282:   ldc_w -1401201395
L285:   imul
L286:   putstatic Field sk bc I
L289:   aload_0
L290:   ldc_w -1483631858
L293:   invokevirtual Method sk s (I)V
L296:   aload_0
L297:   ldc_w 1344353626
L300:   invokevirtual Method sk al (I)V
L303:   ldc_w 984252925
L306:   invokestatic Method nv e (I)Lsr;
L309:   putstatic Field sk f Lsr;

        .stack same_extended
L312:   ldc2_w -8807787511991959949L
L315:   getstatic Field sk bk J
L318:   lmul
L319:   lconst_0
L320:   lcmp
L321:   ifeq L341
L324:   ldc_w 778989178
L327:   invokestatic Method gz e (I)J
L330:   ldc2_w -8807787511991959949L
L333:   getstatic Field sk bk J
L336:   lmul
L337:   lcmp
L338:   ifge L405

        .stack same
L341:   getstatic Field sk f Lsr;
L344:   getstatic Field sk n J
L347:   ldc2_w 3394915126462843437L
L350:   lmul
L351:   invokevirtual Method sr n (J)I
L354:   ldc_w -709089635
L357:   imul
L358:   putstatic Field sk e I
L361:   iconst_0
L362:   istore_2

        .stack append Integer
L363:   iload_2
L364:   ldc_w 970166197
L367:   getstatic Field sk e I
L370:   imul
L371:   if_icmpge L386
L374:   aload_0
L375:   bipush -19
L377:   invokevirtual Method sk g (B)V
L380:   iinc 2 1
L383:   goto L363

        .stack same
L386:   aload_0
L387:   ldc_w 787203204
L390:   invokevirtual Method sk i (I)V
L393:   getstatic Field ahs g Ljava/awt/Canvas;
L396:   ldc_w 165759862
L399:   invokestatic Method f a (Ljava/lang/Object;I)V
L402:   goto L312

        .stack chop 1
L405:   return

        .stack stack_1 Object java/lang/RuntimeException
L406:   new java/lang/StringBuilder
L409:   dup
L410:   invokespecial Method java/lang/StringBuilder <init> ()V
L413:   ldc_w "sk.h("
L416:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L419:   ldc 41
L421:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L424:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L427:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L430:   athrow
L431:   
        .linenumbertable
            L0 522
            L7 523
            L14 524
            L36 525
            L40 526
            L149 527
            L159 528
            L160 530
            L170 531
            L174 532
            L202 533
            L212 534
            L235 535
            L245 536
            L246 541
            L256 542
            L276 543
            L289 544
            L296 545
            L303 546
            L312 547
            L341 548
            L361 549
            L386 550
            L393 551
            L405 553
        .end linenumbertable
    .end code
.end method

.method g : (B)V
    .code stack 4 locals 8
L0:     ldc_w 826221803
L3:     invokestatic Method gz e (I)J
L6:     lstore_2
L7:     getstatic Field sk z [J
L10:    ldc_w 950088787
L13:    getstatic Field sk p I
L16:    imul
L17:    laload
L18:    lstore 4
L20:    getstatic Field sk z [J
L23:    getstatic Field sk p I
L26:    ldc_w 950088787
L29:    imul
L30:    lload_2
L31:    lastore
L32:    ldc_w -185651237
L35:    ldc_w 950088787
L38:    getstatic Field sk p I
L41:    imul
L42:    iconst_1
L43:    iadd
L44:    bipush 31
L46:    iand
L47:    imul
L48:    putstatic Field sk p I
L51:    lload 4
L53:    lconst_0
L54:    lcmp
L55:    ifeq L65
L58:    lload_2
L59:    lload 4
L61:    lcmp
L62:    ifle L65

        .stack append Long Long
L65:    aload_0
L66:    dup
L67:    astore 6
L69:    monitorenter
        .catch [0] from L70 to L79 using L82
L70:    getstatic Field sk ai Z
L73:    putstatic Field aar aw Z
L76:    aload 6
L78:    monitorexit
L79:    goto L90
        .catch [0] from L82 to L87 using L82
        .catch java/lang/RuntimeException from L0 to L98 using L98

        .stack full
            locals Object sk Integer Long Long Object sk
            stack Object java/lang/Throwable
        .end stack
L82:    astore 7
L84:    aload 6
L86:    monitorexit
L87:    aload 7
L89:    athrow

        .stack same
L90:    aload_0
L91:    ldc_w -263225392
L94:    invokevirtual Method sk ac (I)V
L97:    return

        .stack full
            locals Object sk Integer
            stack Object java/lang/RuntimeException
        .end stack
L98:    new java/lang/StringBuilder
L101:   dup
L102:   invokespecial Method java/lang/StringBuilder <init> ()V
L105:   ldc_w "sk.g("
L108:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L111:   ldc 41
L113:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L116:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L119:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L122:   athrow
L123:   
        .linenumbertable
            L0 565
            L7 566
            L20 567
            L32 568
            L51 569
            L65 570
            L70 571
            L76 572
            L90 573
            L97 574
        .end linenumbertable
    .end code
.end method

.method i : (I)V
    .code stack 5 locals 9
        .catch java/lang/RuntimeException from L0 to L268 using L268
L0:     ldc_w 1511073804
L3:     invokestatic Method gz e (I)J
L6:     lstore_2
L7:     getstatic Field sk l [J
L10:    getstatic Field sk u I
L13:    ldc_w -1288987007
L16:    imul
L17:    iconst_1
L18:    isub
L19:    bipush 31
L21:    iand
L22:    laload
L23:    lstore 4
L25:    getstatic Field sk l [J
L28:    ldc_w -1288987007
L31:    getstatic Field sk u I
L34:    imul
L35:    laload
L36:    lstore 6
L38:    getstatic Field sk l [J
L41:    ldc_w -1288987007
L44:    getstatic Field sk u I
L47:    imul
L48:    lload_2
L49:    lastore
L50:    iconst_1
L51:    getstatic Field sk u I
L54:    ldc_w -1288987007
L57:    imul
L58:    iadd
L59:    bipush 31
L61:    iand
L62:    ldc_w -1990811263
L65:    imul
L66:    putstatic Field sk u I
L69:    lload 6
L71:    lconst_0
L72:    lcmp
L73:    ifeq L120
L76:    lload_2
L77:    lload 6
L79:    lcmp
L80:    ifle L120
L83:    lload_2
L84:    lload 6
L86:    lsub
L87:    l2i
L88:    istore 8
L90:    ldc_w 406073307
L93:    lload_2
L94:    lload 4
L96:    lsub
L97:    l2i
L98:    imul
L99:    putstatic Field sk k I
L102:   iload 8
L104:   iconst_1
L105:   ishr
L106:   sipush 32000
L109:   iadd
L110:   iload 8
L112:   idiv
L113:   ldc_w -332499549
L116:   imul
L117:   putstatic Field sk m I

        .stack append Long Long Long
L120:   getstatic Field sk ae I
L123:   ldc_w 1670111301
L126:   iadd
L127:   dup
L128:   putstatic Field sk ae I
L131:   ldc_w -133680499
L134:   imul
L135:   iconst_1
L136:   isub
L137:   bipush 50
L139:   if_icmple L260
L142:   getstatic Field sk ae I
L145:   ldc_w 1901186426
L148:   isub
L149:   putstatic Field sk ae I
L152:   iconst_1
L153:   putstatic Field sk j Z
L156:   getstatic Field ahs g Ljava/awt/Canvas;
L159:   ldc_w -1378711501
L162:   getstatic Field sk r I
L165:   imul
L166:   getstatic Field sk v I
L169:   ldc_w 2091353777
L172:   imul
L173:   invokevirtual Method java/awt/Canvas setSize (II)V
L176:   getstatic Field ahs g Ljava/awt/Canvas;
L179:   iconst_1
L180:   invokevirtual Method java/awt/Canvas setVisible (Z)V
L183:   aconst_null
L184:   getstatic Field vy h Ljava/awt/Frame;
L187:   if_acmpeq L240
L190:   aconst_null
L191:   getstatic Field aqy a Ljava/awt/Frame;
L194:   if_acmpne L240
L197:   getstatic Field vy h Ljava/awt/Frame;
L200:   invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L203:   astore 8
L205:   getstatic Field ahs g Ljava/awt/Canvas;
L208:   aload 8
L210:   getfield Field java/awt/Insets left I
L213:   ldc_w 495533241
L216:   getstatic Field sk y I
L219:   imul
L220:   iadd
L221:   getstatic Field sk q I
L224:   ldc_w -1074927711
L227:   imul
L228:   aload 8
L230:   getfield Field java/awt/Insets top I
L233:   iadd
L234:   invokevirtual Method java/awt/Canvas setLocation (II)V
L237:   goto L260

        .stack same_extended
L240:   getstatic Field ahs g Ljava/awt/Canvas;
L243:   getstatic Field sk y I
L246:   ldc_w 495533241
L249:   imul
L250:   ldc_w -1074927711
L253:   getstatic Field sk q I
L256:   imul
L257:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L260:   aload_0
L261:   ldc_w 1943259820
L264:   invokevirtual Method sk ai (I)V
L267:   return

        .stack full
            locals Object sk Integer
            stack Object java/lang/RuntimeException
        .end stack
L268:   new java/lang/StringBuilder
L271:   dup
L272:   invokespecial Method java/lang/StringBuilder <init> ()V
L275:   ldc_w "sk.i("
L278:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L281:   ldc 41
L283:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L286:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L289:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L292:   athrow
L293:   
        .linenumbertable
            L0 577
            L7 578
            L25 579
            L38 580
            L50 581
            L69 582
            L83 583
            L90 584
            L102 585
            L120 587
            L142 588
            L152 589
            L156 590
            L176 591
            L183 592
            L197 593
            L205 594
            L237 595
            L240 596
            L260 598
            L267 599
        .end linenumbertable
    .end code
.end method

.method j : (B)Ljava/lang/String;
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L2 using L2
L0:     aconst_null
L1:     areturn

        .stack stack_1 Object java/lang/RuntimeException
L2:     new java/lang/StringBuilder
L5:     dup
L6:     invokespecial Method java/lang/StringBuilder <init> ()V
L9:     ldc_w "sk.j("
L12:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L15:    ldc 41
L17:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L20:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L23:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L26:    athrow
L27:    
        .linenumbertable
            L0 602
        .end linenumbertable
    .end code
.end method

.method ba : (Ljava/awt/Container;)V
    .code stack 5 locals 3
L0:     aload_1
L1:     getstatic Field java/awt/Color black Ljava/awt/Color;
L4:     invokevirtual Method java/awt/Container setBackground (Ljava/awt/Color;)V
L7:     aload_1
L8:     aconst_null
L9:     invokevirtual Method java/awt/Container setLayout (Ljava/awt/LayoutManager;)V
L12:    aload_1
L13:    getstatic Field ahs g Ljava/awt/Canvas;
L16:    invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L19:    pop
L20:    getstatic Field ahs g Ljava/awt/Canvas;
L23:    ldc_w -1378711501
L26:    getstatic Field sk r I
L29:    imul
L30:    getstatic Field sk v I
L33:    ldc_w 2091353777
L36:    imul
L37:    invokevirtual Method java/awt/Canvas setSize (II)V
L40:    getstatic Field ahs g Ljava/awt/Canvas;
L43:    iconst_1
L44:    invokevirtual Method java/awt/Canvas setVisible (Z)V
L47:    getstatic Field vy h Ljava/awt/Frame;
L50:    aload_1
L51:    if_acmpne L94
L54:    getstatic Field vy h Ljava/awt/Frame;
L57:    invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L60:    astore_2
L61:    getstatic Field ahs g Ljava/awt/Canvas;
L64:    aload_2
L65:    getfield Field java/awt/Insets left I
L68:    ldc_w 495533241
L71:    getstatic Field sk y I
L74:    imul
L75:    iadd
L76:    aload_2
L77:    getfield Field java/awt/Insets top I
L80:    ldc_w -1074927711
L83:    getstatic Field sk q I
L86:    imul
L87:    iadd
L88:    invokevirtual Method java/awt/Canvas setLocation (II)V
L91:    goto L114

        .stack same_extended
L94:    getstatic Field ahs g Ljava/awt/Canvas;
L97:    ldc_w 495533241
L100:   getstatic Field sk y I
L103:   imul
L104:   ldc_w -1074927711
L107:   getstatic Field sk q I
L110:   imul
L111:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L114:   getstatic Field ahs g Ljava/awt/Canvas;
L117:   aload_0
L118:   invokevirtual Method java/awt/Canvas addFocusListener (Ljava/awt/event/FocusListener;)V
L121:   getstatic Field ahs g Ljava/awt/Canvas;
L124:   invokevirtual Method java/awt/Canvas requestFocus ()V
L127:   iconst_1
L128:   putstatic Field aar aw Z
L131:   iconst_1
L132:   putstatic Field sk ai Z
L135:   getstatic Field ahs g Ljava/awt/Canvas;
L138:   iconst_0
L139:   invokevirtual Method java/awt/Canvas setFocusTraversalKeysEnabled (Z)V
L142:   iconst_1
L143:   putstatic Field sk j Z
L146:   iconst_0
L147:   putstatic Field sk ag Z
L150:   ldc_w 1033826531
L153:   invokestatic Method gz e (I)J
L156:   ldc2_w -4981684860522027511L
L159:   lmul
L160:   putstatic Field sk ah J
L163:   return
L164:   
        .linenumbertable
            L0 463
            L7 464
            L12 465
            L20 466
            L40 467
            L47 468
            L54 469
            L61 470
            L91 471
            L94 472
            L114 473
            L121 474
            L127 475
            L131 476
            L135 477
            L142 478
            L146 479
            L150 480
            L163 481
        .end linenumbertable
    .end code
.end method

.method public start : ()V
    .code stack 3 locals 1
        .catch java/lang/RuntimeException from L0 to L12 using L12
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     lconst_0
L8:     putstatic Field sk bk J
L11:    return

        .stack stack_1 Object java/lang/RuntimeException
L12:    new java/lang/StringBuilder
L15:    dup
L16:    invokespecial Method java/lang/StringBuilder <init> ()V
L19:    ldc_w "sk.start("
L22:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L25:    ldc 41
L27:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L30:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L33:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L36:    athrow
L37:    
        .linenumbertable
            L0 660
            L7 661
            L11 662
        .end linenumbertable
    .end code
.end method

.method public stop : ()V
    .code stack 4 locals 1
        .catch java/lang/RuntimeException from L0 to L25 using L25
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     ldc_w 1835689683
L10:    invokestatic Method gz e (I)J
L13:    ldc2_w 4000L
L16:    ladd
L17:    ldc2_w -992610302756464965L
L20:    lmul
L21:    putstatic Field sk bk J
L24:    return

        .stack stack_1 Object java/lang/RuntimeException
L25:    new java/lang/StringBuilder
L28:    dup
L29:    invokespecial Method java/lang/StringBuilder <init> ()V
L32:    ldc_w "sk.stop("
L35:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L38:    ldc 41
L40:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L43:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L46:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L49:    athrow
L50:    
        .linenumbertable
            L0 665
            L7 666
            L24 667
        .end linenumbertable
    .end code
.end method

.method public final windowClosing : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L9 using L9
L0:     iconst_1
L1:     putstatic Field sk ac Z
L4:     aload_0
L5:     invokevirtual Method sk destroy ()V
L8:     return

        .stack stack_1 Object java/lang/RuntimeException
L9:     new java/lang/StringBuilder
L12:    dup
L13:    invokespecial Method java/lang/StringBuilder <init> ()V
L16:    ldc_w "sk.windowClosing("
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    ldc 41
L24:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L27:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L30:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L33:    athrow
L34:    
        .linenumbertable
            L0 702
            L4 703
            L8 704
        .end linenumbertable
    .end code
.end method

.method abstract ds : ()V
.end method

.method public final synchronized paint : (Ljava/awt/Graphics;)V
    .code stack 6 locals 3
        .catch java/lang/RuntimeException from L0 to L75 using L75
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     iconst_1
L8:     putstatic Field sk j Z
L11:    ldc_w 322683967
L14:    invokestatic Method gz e (I)J
L17:    getstatic Field sk ah J
L20:    ldc2_w -8866144438303274951L
L23:    lmul
L24:    lsub
L25:    ldc2_w 1000L
L28:    lcmp
L29:    ifle L74
L32:    aload_1
L33:    invokevirtual Method java/awt/Graphics getClipBounds ()Ljava/awt/Rectangle;
L36:    astore_2
L37:    aconst_null
L38:    aload_2
L39:    if_acmpeq L70
L42:    aload_2
L43:    getfield Field java/awt/Rectangle width I
L46:    getstatic Field sk d I
L49:    ldc_w -108363597
L52:    imul
L53:    if_icmplt L74
L56:    aload_2
L57:    getfield Field java/awt/Rectangle height I
L60:    ldc_w 2090134413
L63:    getstatic Field qf c I
L66:    imul
L67:    if_icmplt L74

        .stack append Object java/awt/Rectangle
L70:    iconst_1
L71:    putstatic Field sk ag Z

        .stack chop 1
L74:    return

        .stack stack_1 Object java/lang/RuntimeException
L75:    new java/lang/StringBuilder
L78:    dup
L79:    invokespecial Method java/lang/StringBuilder <init> ()V
L82:    ldc_w "sk.paint("
L85:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L88:    ldc 41
L90:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L93:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L96:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L99:    athrow
L100:   
        .linenumbertable
            L0 681
            L7 682
            L11 683
            L32 684
            L37 685
            L74 687
        .end linenumbertable
    .end code
.end method

.method public final focusGained : (Ljava/awt/event/FocusEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L9 using L9
L0:     iconst_1
L1:     putstatic Field sk ai Z
L4:     iconst_1
L5:     putstatic Field sk j Z
L8:     return

        .stack stack_1 Object java/lang/RuntimeException
L9:     new java/lang/StringBuilder
L12:    dup
L13:    invokespecial Method java/lang/StringBuilder <init> ()V
L16:    ldc_w "sk.focusGained("
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    ldc 41
L24:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L27:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L30:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L33:    athrow
L34:    
        .linenumbertable
            L0 690
            L4 691
            L8 692
        .end linenumbertable
    .end code
.end method

.method public final focusLost : (Ljava/awt/event/FocusEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L5 using L5
L0:     iconst_0
L1:     putstatic Field sk ai Z
L4:     return

        .stack stack_1 Object java/lang/RuntimeException
L5:     new java/lang/StringBuilder
L8:     dup
L9:     invokespecial Method java/lang/StringBuilder <init> ()V
L12:    ldc_w "sk.focusLost("
L15:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L18:    ldc 41
L20:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L23:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L26:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L29:    athrow
L30:    
        .linenumbertable
            L0 695
            L4 696
        .end linenumbertable
    .end code
.end method

.method public final windowDeiconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L1 using L1
L0:     return

        .stack stack_1 Object java/lang/RuntimeException
L1:     new java/lang/StringBuilder
L4:     dup
L5:     invokespecial Method java/lang/StringBuilder <init> ()V
L8:     ldc_w "sk.windowDeiconified("
L11:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L14:    ldc 41
L16:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L19:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L22:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L25:    athrow
L26:    
        .linenumbertable
            L0 707
        .end linenumbertable
    .end code
.end method

.method public final windowClosed : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L1 using L1
L0:     return

        .stack stack_1 Object java/lang/RuntimeException
L1:     new java/lang/StringBuilder
L4:     dup
L5:     invokespecial Method java/lang/StringBuilder <init> ()V
L8:     ldc_w "sk.windowClosed("
L11:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L14:    ldc 41
L16:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L19:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L22:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L25:    athrow
L26:    
        .linenumbertable
            L0 699
        .end linenumbertable
    .end code
.end method

.method public final windowOpened : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L1 using L1
L0:     return

        .stack stack_1 Object java/lang/RuntimeException
L1:     new java/lang/StringBuilder
L4:     dup
L5:     invokespecial Method java/lang/StringBuilder <init> ()V
L8:     ldc_w "sk.windowOpened("
L11:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L14:    ldc 41
L16:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L19:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L22:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L25:    athrow
L26:    
        .linenumbertable
            L0 709
        .end linenumbertable
    .end code
.end method

.method bn : (Ljava/io/File;Ljava/io/File;)V
    .code stack 6 locals 5
        .catch java/io/IOException from L0 to L111 using L114
L0:     new abl
L3:     dup
L4:     getstatic Field sk au Ljava/io/File;
L7:     ldc "rw"
L9:     ldc2_w 10000L
L12:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L15:    astore_3
L16:    new alw
L19:    dup
L20:    sipush 500
L23:    invokespecial Method alw <init> (I)V
L26:    astore 4
L28:    aload 4
L30:    iconst_3
L31:    bipush -83
L33:    invokevirtual Method alw k (IB)V
L36:    aload 4
L38:    aconst_null
L39:    aload_2
L40:    if_acmpeq L47
L43:    iconst_1
L44:    goto L48

        .stack full
            locals Object sk Object java/io/File Object java/io/File Object abl Object alw
            stack Object alw
        .end stack
L47:    iconst_0

        .stack full
            locals Object sk Object java/io/File Object java/io/File Object abl Object alw
            stack Object alw Integer
        .end stack
L48:    bipush -56
L50:    invokevirtual Method alw k (IB)V
L53:    aload 4
L55:    aload_1
L56:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L59:    ldc_w -1489303680
L62:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V
L65:    aconst_null
L66:    aload_2
L67:    if_acmpeq L82
L70:    aload 4
L72:    aload_2
L73:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L76:    ldc_w -1489303680
L79:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V

        .stack same
L82:    aload_3
L83:    aload 4
L85:    getfield Field alw w [B
L88:    iconst_0
L89:    ldc_w 212851357
L92:    aload 4
L94:    getfield Field alw l I
L97:    imul
L98:    ldc_w 894179715
L101:   invokevirtual Method abl n ([BIII)V
L104:   aload_3
L105:   ldc_w 976031218
L108:   invokevirtual Method abl m (I)V
L111:   goto L121

        .stack full
            locals Object sk Object java/io/File Object java/io/File
            stack Object java/io/IOException
        .end stack
L114:   astore 4
L116:   aload 4
L118:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L121:   return
L122:   
        .linenumbertable
            L0 318
            L16 319
            L28 320
            L36 321
            L53 322
            L65 323
            L82 324
            L104 325
            L111 329
            L114 327
            L116 328
            L121 330
        .end linenumbertable
    .end code
.end method

.method final ak : (Lsq;Ljava/lang/String;Ljava/lang/String;IIIIZ)V
    .code stack 8 locals 10
        .catch java/lang/Throwable from L0 to L146 using L149
L0:     aload_0
L1:     getstatic Field sm n Lsm;
L4:     iload 8
L6:     ldc_w 1101059334
L9:     invokevirtual Method sk ar (Lsm;ZI)V
L12:    aload_1
L13:    ldc_w -820575818
L16:    invokevirtual Method sq e (I)I
L19:    ldc_w 1671148283
L22:    imul
L23:    dup
L24:    putstatic Field sk r I
L27:    ldc_w -1040934271
L30:    imul
L31:    putstatic Field sk d I
L34:    aload_1
L35:    ldc_w -567283080
L38:    invokevirtual Method sq n (I)I
L41:    ldc_w 490799697
L44:    imul
L45:    dup
L46:    putstatic Field sk v I
L49:    ldc_w 500427957
L52:    imul
L53:    putstatic Field qf c I
L56:    iconst_0
L57:    putstatic Field sk y I
L60:    iconst_0
L61:    putstatic Field sk q I
L64:    bipush 45
L66:    invokestatic Method in ap (B)Lsm;
L69:    getstatic Field sm m Lsm;
L72:    if_acmpne L123
L75:    getstatic Field sk d I
L78:    ldc_w 1522031862
L81:    aload_1
L82:    ldc_w -1175088513
L85:    invokevirtual Method sq m (I)I
L88:    imul
L89:    iadd
L90:    putstatic Field sk d I
L93:    getstatic Field qf c I
L96:    ldc_w 1706598026
L99:    aload_1
L100:   ldc_w -1743498683
L103:   invokevirtual Method sq k (I)I
L106:   imul
L107:   iadd
L108:   putstatic Field qf c I
L111:   aload_0
L112:   aload_1
L113:   bipush -13
L115:   invokevirtual Method sq f (B)Ljava/lang/String;
L118:   bipush 114
L120:   invokevirtual Method sk d (Ljava/lang/String;B)V

        .stack same_extended
L123:   getstatic Field aol i Ljava/applet/Applet;
L126:   putstatic Field acs f Ljava/applet/Applet;
L129:   aload_0
L130:   aload_2
L131:   aload_3
L132:   iload 4
L134:   iload 5
L136:   iload 6
L138:   iload 7
L140:   ldc_w -616301363
L143:   invokevirtual Method sk n (Ljava/lang/String;Ljava/lang/String;IIIII)V
L146:   goto L170

        .stack stack_1 Object java/lang/Throwable
L149:   astore 9
L151:   aconst_null
L152:   aload 9
L154:   ldc_w 1579532191
L157:   invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L160:   aload_0
L161:   ldc_w "crash"
L164:   ldc_w 1979386679
L167:   invokevirtual Method sk ad (Ljava/lang/String;I)V

        .stack same
L170:   return
L171:   
        .linenumbertable
            L0 97
            L12 98
            L34 99
            L56 100
            L60 101
            L64 102
            L75 103
            L93 104
            L111 105
            L123 107
            L129 108
            L146 113
            L149 110
            L151 111
            L160 112
            L170 114
        .end linenumbertable
    .end code
.end method

.method public final windowActivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L1 using L1
L0:     return

        .stack stack_1 Object java/lang/RuntimeException
L1:     new java/lang/StringBuilder
L4:     dup
L5:     invokespecial Method java/lang/StringBuilder <init> ()V
L8:     ldc_w "sk.windowActivated("
L11:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L14:    ldc 41
L16:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L19:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L22:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L25:    athrow
L26:    
        .linenumbertable
            L0 698
        .end linenumbertable
    .end code
.end method

.method public cs : ()V
    .code stack 4 locals 1
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     ldc_w 1220090424
L10:    invokestatic Method gz e (I)J
L13:    ldc2_w 4000L
L16:    ladd
L17:    ldc2_w -992610302756464965L
L20:    lmul
L21:    putstatic Field sk bk J
L24:    return
L25:    
        .linenumbertable
            L0 665
            L7 666
            L24 667
        .end linenumbertable
    .end code
.end method

.method dh : (Ljava/lang/String;Ljava/lang/String;)V
    .code stack 6 locals 4
L0:     aload_0
L1:     getfield Field sk bx Z
L4:     ifeq L8
L7:     return

        .stack same
L8:     aload_0
L9:     iconst_1
L10:    putfield Field sk bx Z
L13:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L16:    new java/lang/StringBuilder
L19:    dup
L20:    invokespecial Method java/lang/StringBuilder <init> ()V
L23:    ldc_w "error_game_"
L26:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L29:    aload_1
L30:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L33:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L36:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/lang/Throwable from L39 to L52 using L55
L39:    getstatic Field aol i Ljava/applet/Applet;
L42:    ldc_w "loggedout"
L45:    ldc_w 1622519257
L48:    invokestatic Method act n (Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;
L51:    pop
L52:    goto L56

        .stack stack_1 Object java/lang/Throwable
L55:    astore_3
        .catch java/lang/Exception from L56 to L113 using L116

        .stack same
L56:    getstatic Field aol i Ljava/applet/Applet;
L59:    invokevirtual Method java/applet/Applet getAppletContext ()Ljava/applet/AppletContext;
L62:    new java/net/URL
L65:    dup
L66:    getstatic Field aol i Ljava/applet/Applet;
L69:    invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L72:    new java/lang/StringBuilder
L75:    dup
L76:    invokespecial Method java/lang/StringBuilder <init> ()V
L79:    ldc_w "error_game_"
L82:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L85:    aload_1
L86:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L89:    ldc_w ".ws?"
L92:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L95:    aload_2
L96:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L99:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L102:   invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L105:   ldc_w "_top"
L108:   invokeinterface InterfaceMethod java/applet/AppletContext showDocument (Ljava/net/URL;Ljava/lang/String;)V 3
L113:   goto L117

        .stack stack_1 Object java/lang/Exception
L116:   astore_3

        .stack same
L117:   return
L118:   
        .linenumbertable
            L0 796
            L8 797
            L13 798
            L39 800
            L52 802
            L56 804
            L113 806
            L117 807
        .end linenumbertable
    .end code
.end method

.method abstract al : (I)V
.end method

.method abstract ac : (I)V
.end method

.method abstract ai : (I)V
.end method

.method abstract aw : (B)V
.end method

.method public run : ()V
    .code stack 3 locals 3
        .catch java/lang/ThreadDeath from L0 to L7 using L18
        .catch java/lang/Throwable from L0 to L7 using L21
        .catch [0] from L0 to L7 using L56
L0:     aload_0
L1:     ldc_w 1286359357
L4:     invokevirtual Method sk h (I)V
L7:     aload_0
L8:     iconst_1
L9:     ldc_w -2097600644
L12:    invokevirtual Method sk t (ZI)V
L15:    goto L67
        .catch [0] from L18 to L45 using L56

        .stack stack_1 Object java/lang/ThreadDeath
L18:    astore_1
L19:    aload_1
L20:    athrow

        .stack stack_1 Object java/lang/Throwable
L21:    astore_1
L22:    aload_0
L23:    bipush 112
L25:    invokevirtual Method sk j (B)Ljava/lang/String;
L28:    aload_1
L29:    ldc_w 552130837
L32:    invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L35:    aload_0
L36:    ldc_w "crash"
L39:    ldc_w -684708272
L42:    invokevirtual Method sk ad (Ljava/lang/String;I)V
L45:    aload_0
L46:    iconst_1
L47:    ldc_w -1353705725
L50:    invokevirtual Method sk t (ZI)V
L53:    goto L67
        .catch [0] from L56 to L57 using L56
        .catch java/lang/RuntimeException from L0 to L68 using L68

        .stack stack_1 Object java/lang/Throwable
L56:    astore_2
L57:    aload_0
L58:    iconst_1
L59:    ldc_w -266556112
L62:    invokevirtual Method sk t (ZI)V
L65:    aload_2
L66:    athrow

        .stack same
L67:    return

        .stack stack_1 Object java/lang/RuntimeException
L68:    new java/lang/StringBuilder
L71:    dup
L72:    invokespecial Method java/lang/StringBuilder <init> ()V
L75:    ldc_w "sk.run("
L78:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L81:    ldc 41
L83:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L86:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L89:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L92:    athrow
L93:    
        .linenumbertable
            L0 506
            L7 516
            L15 517
            L18 508
            L19 509
            L21 511
            L22 512
            L35 513
            L45 516
            L53 517
            L56 516
            L67 519
        .end linenumbertable
    .end code
.end method

.method static be : (Lalw;I)V
    .code stack 5 locals 3
L0:     aconst_null
L1:     getstatic Field sk aj Labp;
L4:     if_acmpeq L34
        .catch java/lang/Exception from L7 to L30 using L33
L7:     getstatic Field sk aj Labp;
L10:    lconst_0
L11:    invokevirtual Method abp n (J)V
L14:    getstatic Field sk aj Labp;
L17:    aload_0
L18:    getfield Field alw w [B
L21:    iload_1
L22:    bipush 24
L24:    ldc_w 1992282413
L27:    invokevirtual Method abp l ([BIII)V
L30:    goto L34

        .stack stack_1 Object java/lang/Exception
L33:    astore_2

        .stack same
L34:    return
L35:    
        .linenumbertable
            L0 428
            L7 430
            L14 431
            L30 433
            L34 435
        .end linenumbertable
    .end code
.end method

.method public au : (B)V
    .code stack 4 locals 3
L0:     aload_0
L1:     getfield Field sk bi Z
L4:     ifeq L8
L7:     return

        .stack same
L8:     ldc_w 672839876
L11:    invokestatic Method ke n (I)Lrn;
L14:    ldc_w "jaclib"
L17:    bipush -43
L19:    invokeinterface InterfaceMethod rn e (Ljava/lang/String;B)V 3
        .catch java/lang/Throwable from L24 to L28 using L31
        .catch java/lang/RuntimeException from L0 to L63 using L63
L24:    invokestatic Method jaclib/nanotime/QueryPerformanceCounter init ()Z
L27:    pop
L28:    goto L57

        .stack stack_1 Object java/lang/Throwable
L31:    astore_2
L32:    getstatic Field ij bq Ljava/lang/String;
L35:    ldc "win"
L37:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L40:    ifeq L57
L43:    new apb
L46:    dup
L47:    sipush 128
L50:    ldc_w "jaclib"
L53:    invokespecial Method apb <init> (ILjava/lang/String;)V
L56:    athrow

        .stack same
L57:    aload_0
L58:    iconst_1
L59:    putfield Field sk bi Z
L62:    return

        .stack stack_1 Object java/lang/RuntimeException
L63:    new java/lang/StringBuilder
L66:    dup
L67:    invokespecial Method java/lang/StringBuilder <init> ()V
L70:    ldc_w "sk.au("
L73:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L76:    ldc 41
L78:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L81:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L84:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L87:    athrow
L88:    
        .linenumbertable
            L0 810
            L8 811
            L24 813
            L28 817
            L31 815
            L32 816
            L57 818
            L62 819
        .end linenumbertable
    .end code
    .exceptions apb
.end method

.method ar : (Lsm;ZI)V
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L59 using L59
L0:     aload_1
L1:     ifnonnull L12
L4:     new java/lang/NullPointerException
L7:     dup
L8:     invokespecial Method java/lang/NullPointerException <init> ()V
L11:    athrow

        .stack same
L12:    getstatic Field sm n Lsm;
L15:    aload_1
L16:    if_acmpeq L34
L19:    getstatic Field sm e Lsm;
L22:    aload_1
L23:    if_acmpeq L34
L26:    new java/lang/IllegalStateException
L29:    dup
L30:    invokespecial Method java/lang/IllegalStateException <init> ()V
L33:    athrow

        .stack same
L34:    aload_1
L35:    putstatic Field sk bl Lsm;
L38:    getstatic Field sm e Lsm;
L41:    getstatic Field sk bl Lsm;
L44:    if_acmpne L48
L47:    return

        .stack same
L48:    iload_2
L49:    ifeq L58
L52:    getstatic Field sm m Lsm;
L55:    putstatic Field sk bl Lsm;

        .stack same
L58:    return

        .stack stack_1 Object java/lang/RuntimeException
L59:    new java/lang/StringBuilder
L62:    dup
L63:    invokespecial Method java/lang/StringBuilder <init> ()V
L66:    ldc_w "sk.ar("
L69:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L72:    ldc 41
L74:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L77:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L80:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L83:    athrow
L84:    
        .linenumbertable
            L0 822
            L4 823
            L12 825
            L26 826
            L34 828
            L38 829
            L47 830
            L48 832
            L52 833
            L58 835
        .end linenumbertable
    .end code
.end method

.method public final dj : (Ljava/awt/event/FocusEvent;)V
    .code stack 1 locals 2
L0:     iconst_0
L1:     putstatic Field sk ai Z
L4:     return
L5:     
        .linenumbertable
            L0 695
            L4 696
        .end linenumbertable
    .end code
.end method

.method public c : ()V
    .code stack 3 locals 3
        .catch java/lang/ThreadDeath from L0 to L7 using L18
        .catch java/lang/Throwable from L0 to L7 using L21
        .catch [0] from L0 to L7 using L56
L0:     aload_0
L1:     ldc_w 709894690
L4:     invokevirtual Method sk h (I)V
L7:     aload_0
L8:     iconst_1
L9:     ldc_w -512812427
L12:    invokevirtual Method sk t (ZI)V
L15:    goto L67
        .catch [0] from L18 to L45 using L56

        .stack stack_1 Object java/lang/ThreadDeath
L18:    astore_1
L19:    aload_1
L20:    athrow

        .stack stack_1 Object java/lang/Throwable
L21:    astore_1
L22:    aload_0
L23:    bipush 69
L25:    invokevirtual Method sk j (B)Ljava/lang/String;
L28:    aload_1
L29:    ldc_w 932771544
L32:    invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L35:    aload_0
L36:    ldc_w "crash"
L39:    ldc_w -2040856707
L42:    invokevirtual Method sk ad (Ljava/lang/String;I)V
L45:    aload_0
L46:    iconst_1
L47:    ldc_w 326649974
L50:    invokevirtual Method sk t (ZI)V
L53:    goto L67
        .catch [0] from L56 to L57 using L56

        .stack stack_1 Object java/lang/Throwable
L56:    astore_2
L57:    aload_0
L58:    iconst_1
L59:    ldc_w -1014019599
L62:    invokevirtual Method sk t (ZI)V
L65:    aload_2
L66:    athrow

        .stack same
L67:    return
L68:    
        .linenumbertable
            L0 506
            L7 516
            L15 517
            L18 508
            L19 509
            L21 511
            L22 512
            L35 513
            L45 516
            L53 517
            L56 516
            L67 519
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 2 locals 0
L0:     ldc2_w -1671841977774964480L
L3:     putstatic Field sk n J
L6:     iconst_0
L7:     putstatic Field sk m I
L10:    iconst_0
L11:    putstatic Field sk k I
L14:    bipush 32
L16:    newarray long
L18:    putstatic Field sk l [J
L21:    bipush 32
L23:    newarray long
L25:    putstatic Field sk z [J
L28:    iconst_0
L29:    putstatic Field sk y I
L32:    iconst_0
L33:    putstatic Field sk q I
L36:    aconst_null
L37:    putstatic Field sk b Ljava/lang/String;
L40:    iconst_1
L41:    putstatic Field sk j Z
L44:    ldc_w 1831995076
L47:    putstatic Field sk ae I
L50:    iconst_0
L51:    putstatic Field sk ag Z
L54:    lconst_0
L55:    putstatic Field sk ah J
L58:    iconst_0
L59:    putstatic Field sk ac Z
L62:    iconst_1
L63:    putstatic Field sk ai Z
L66:    aconst_null
L67:    putstatic Field sk aj Labp;
L70:    aconst_null
L71:    putstatic Field sk ay Labp;
L74:    aconst_null
L75:    putstatic Field sk ab Labp;
L78:    aconst_null
L79:    putstatic Field sk bl Lsm;
L82:    lconst_0
L83:    putstatic Field sk bk J
L86:    iconst_0
L87:    putstatic Field sk bh Z
L90:    ldc_w -2060182503
L93:    putstatic Field sk bd I
L96:    ldc_w -1401201395
L99:    putstatic Field sk bc I
L102:   return
L103:   
        .linenumbertable
            L0 21
            L6 22
            L10 23
            L14 26
            L21 28
            L28 36
            L32 37
            L36 39
            L40 44
            L44 46
            L50 47
            L54 48
            L58 50
            L62 51
            L66 64
            L70 65
            L74 66
            L78 73
            L82 74
            L86 75
            L90 77
            L96 78
        .end linenumbertable
    .end code
.end method

.method static cq : ()J
    .code stack 2 locals 0
L0:     getstatic Field sk f Lsr;
L3:     ldc_w 1528120999
L6:     invokevirtual Method sr w (I)J
L9:     lreturn
L10:    
        .linenumbertable
            L0 656
        .end linenumbertable
    .end code
.end method

.method public o : ()V
    .code stack 3 locals 3
        .catch java/lang/ThreadDeath from L0 to L7 using L18
        .catch java/lang/Throwable from L0 to L7 using L21
        .catch [0] from L0 to L7 using L56
L0:     aload_0
L1:     ldc_w 1546186898
L4:     invokevirtual Method sk h (I)V
L7:     aload_0
L8:     iconst_1
L9:     ldc_w -1076171819
L12:    invokevirtual Method sk t (ZI)V
L15:    goto L67
        .catch [0] from L18 to L45 using L56

        .stack stack_1 Object java/lang/ThreadDeath
L18:    astore_1
L19:    aload_1
L20:    athrow

        .stack stack_1 Object java/lang/Throwable
L21:    astore_1
L22:    aload_0
L23:    bipush 92
L25:    invokevirtual Method sk j (B)Ljava/lang/String;
L28:    aload_1
L29:    ldc_w 258427659
L32:    invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L35:    aload_0
L36:    ldc_w "crash"
L39:    ldc_w -584675640
L42:    invokevirtual Method sk ad (Ljava/lang/String;I)V
L45:    aload_0
L46:    iconst_1
L47:    ldc_w -275160914
L50:    invokevirtual Method sk t (ZI)V
L53:    goto L67
        .catch [0] from L56 to L57 using L56

        .stack stack_1 Object java/lang/Throwable
L56:    astore_2
L57:    aload_0
L58:    iconst_1
L59:    ldc_w 211633769
L62:    invokevirtual Method sk t (ZI)V
L65:    aload_2
L66:    athrow

        .stack same
L67:    return
L68:    
        .linenumbertable
            L0 506
            L7 516
            L15 517
            L18 508
            L19 509
            L21 511
            L22 512
            L35 513
            L45 516
            L53 517
            L56 516
            L67 519
        .end linenumbertable
    .end code
.end method

.method abstract aq : ()V
.end method

.method abstract ax : ()V
.end method

.method abstract av : ()V
.end method

.method abstract ao : ()V
.end method

.method bh : (Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;
    .code stack 6 locals 16
L0:     iconst_0
L1:     iload_3
L2:     if_icmpne L10
L5:     ldc ""
L7:     goto L29

        .stack same
L10:    new java/lang/StringBuilder
L13:    dup
L14:    invokespecial Method java/lang/StringBuilder <init> ()V
L17:    ldc ""
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    iload_3
L23:    invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L26:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;

        .stack stack_1 Object java/lang/String
L29:    astore 4
L31:    new java/io/File
L34:    dup
L35:    getstatic Field pk by Ljava/lang/String;
L38:    new java/lang/StringBuilder
L41:    dup
L42:    invokespecial Method java/lang/StringBuilder <init> ()V
L45:    ldc_w "jagex_cl_"
L48:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L51:    aload_1
L52:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L55:    ldc_w "_"
L58:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L61:    aload_2
L62:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L65:    aload 4
L67:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L70:    ldc_w ".dat"
L73:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L76:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L79:    invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L82:    putstatic Field sk au Ljava/io/File;
L85:    aconst_null
L86:    astore 5
L88:    aconst_null
L89:    astore 6
L91:    iconst_0
L92:    istore 7
L94:    getstatic Field sk au Ljava/io/File;
L97:    invokevirtual Method java/io/File exists ()Z
L100:   ifeq L444
        .catch java/io/IOException from L103 to L372 using L375
L103:   new abl
L106:   dup
L107:   getstatic Field sk au Ljava/io/File;
L110:   ldc "rw"
L112:   ldc2_w 10000L
L115:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L118:   astore 8
L120:   new alw
L123:   dup
L124:   aload 8
L126:   ldc_w 1851298646
L129:   invokevirtual Method abl f (I)J
L132:   l2i
L133:   invokespecial Method alw <init> (I)V
L136:   astore 9

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Null Null Integer Object abl Object alw
            stack
        .end stack
L138:   ldc_w 212851357
L141:   aload 9
L143:   getfield Field alw l I
L146:   imul
L147:   aload 9
L149:   getfield Field alw w [B
L152:   arraylength
L153:   if_icmpge L228
L156:   aload 8
L158:   aload 9
L160:   getfield Field alw w [B
L163:   ldc_w 212851357
L166:   aload 9
L168:   getfield Field alw l I
L171:   imul
L172:   aload 9
L174:   getfield Field alw w [B
L177:   arraylength
L178:   ldc_w 212851357
L181:   aload 9
L183:   getfield Field alw l I
L186:   imul
L187:   isub
L188:   bipush 9
L190:   invokevirtual Method abl w ([BIIB)I
L193:   istore 10
L195:   iconst_m1
L196:   iload 10
L198:   if_icmpne L209
L201:   new java/io/IOException
L204:   dup
L205:   invokespecial Method java/io/IOException <init> ()V
L208:   athrow

        .stack append Integer
L209:   aload 9
L211:   dup
L212:   getfield Field alw l I
L215:   iload 10
L217:   ldc_w -1445626955
L220:   imul
L221:   iadd
L222:   putfield Field alw l I
L225:   goto L138

        .stack chop 1
L228:   aload 9
L230:   iconst_0
L231:   putfield Field alw l I
L234:   aload 9
L236:   sipush 16384
L239:   invokevirtual Method alw ai (S)I
L242:   istore 10
L244:   iload 10
L246:   iconst_1
L247:   if_icmplt L256
L250:   iload 10
L252:   iconst_3
L253:   if_icmple L284

        .stack append Integer
L256:   new java/io/IOException
L259:   dup
L260:   new java/lang/StringBuilder
L263:   dup
L264:   invokespecial Method java/lang/StringBuilder <init> ()V
L267:   ldc ""
L269:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L272:   iload 10
L274:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L277:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L280:   invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L283:   athrow

        .stack same
L284:   iconst_0
L285:   istore 11
L287:   iload 10
L289:   iconst_1
L290:   if_icmple L303
L293:   aload 9
L295:   sipush 16384
L298:   invokevirtual Method alw ai (S)I
L301:   istore 11

        .stack append Integer
L303:   iload 10
L305:   iconst_2
L306:   if_icmpgt L338
L309:   aload 9
L311:   ldc_w -954973916
L314:   invokevirtual Method alw ab (I)Ljava/lang/String;
L317:   astore 5
L319:   iconst_1
L320:   iload 11
L322:   if_icmpne L364
L325:   aload 9
L327:   ldc_w -914566597
L330:   invokevirtual Method alw ab (I)Ljava/lang/String;
L333:   astore 6
L335:   goto L364

        .stack same
L338:   aload 9
L340:   ldc_w -2049293466
L343:   invokevirtual Method alw az (I)Ljava/lang/String;
L346:   astore 5
L348:   iconst_1
L349:   iload 11
L351:   if_icmpne L364
L354:   aload 9
L356:   ldc_w 1078310015
L359:   invokevirtual Method alw az (I)Ljava/lang/String;
L362:   astore 6

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object abl Object alw Integer Integer
            stack
        .end stack
L364:   aload 8
L366:   ldc_w -1215743722
L369:   invokevirtual Method abl m (I)V
L372:   goto L382

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer
            stack Object java/io/IOException
        .end stack
L375:   astore 9
L377:   aload 9
L379:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L382:   aload 5
L384:   ifnull L409
L387:   new java/io/File
L390:   dup
L391:   aload 5
L393:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L396:   astore 9
L398:   aload 9
L400:   invokevirtual Method java/io/File exists ()Z
L403:   ifne L409
L406:   aconst_null
L407:   astore 5

        .stack same
L409:   aconst_null
L410:   aload 5
L412:   if_acmpeq L444
L415:   new java/io/File
L418:   dup
L419:   aload 5
L421:   ldc_w "test.dat"
L424:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L427:   astore 9
L429:   aload_0
L430:   aload 9
L432:   iconst_1
L433:   bipush -4
L435:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L438:   ifne L444
L441:   aconst_null
L442:   astore 5

        .stack chop 2
L444:   aconst_null
L445:   aload 5
L447:   if_acmpne L586
L450:   iload_3
L451:   ifne L586
L454:   iconst_0
L455:   istore 8

        .stack append Integer
L457:   iload 8
L459:   getstatic Field la ak [Ljava/lang/String;
L462:   arraylength
L463:   if_icmpge L586
L466:   iconst_0
L467:   istore 9

        .stack append Integer
L469:   iload 9
L471:   getstatic Field y af [Ljava/lang/String;
L474:   arraylength
L475:   if_icmpge L580
L478:   new java/io/File
L481:   dup
L482:   new java/lang/StringBuilder
L485:   dup
L486:   invokespecial Method java/lang/StringBuilder <init> ()V
L489:   getstatic Field y af [Ljava/lang/String;
L492:   iload 9
L494:   aaload
L495:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L498:   getstatic Field la ak [Ljava/lang/String;
L501:   iload 8
L503:   aaload
L504:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L507:   getstatic Field java/io/File separatorChar C
L510:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L513:   aload_1
L514:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L517:   getstatic Field java/io/File separatorChar C
L520:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L523:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L526:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L529:   astore 10
L531:   aload 10
L533:   invokevirtual Method java/io/File exists ()Z
L536:   ifeq L574
L539:   aload_0
L540:   new java/io/File
L543:   dup
L544:   aload 10
L546:   ldc_w "test.dat"
L549:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L552:   iconst_1
L553:   bipush -66
L555:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L558:   ifeq L574
L561:   aload 10
L563:   invokevirtual Method java/io/File toString ()Ljava/lang/String;
L566:   astore 5
L568:   iconst_1
L569:   istore 7
L571:   goto L586

        .stack append Object java/io/File
L574:   iinc 9 1
L577:   goto L469

        .stack chop 1
L580:   iinc 8 1
L583:   goto L457

        .stack chop 2
L586:   aconst_null
L587:   aload 5
L589:   if_acmpne L656
L592:   new java/lang/StringBuilder
L595:   dup
L596:   invokespecial Method java/lang/StringBuilder <init> ()V
L599:   getstatic Field pk by Ljava/lang/String;
L602:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L605:   getstatic Field java/io/File separatorChar C
L608:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L611:   ldc_w "jagexcache"
L614:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L617:   aload 4
L619:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L622:   getstatic Field java/io/File separatorChar C
L625:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L628:   aload_1
L629:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L632:   getstatic Field java/io/File separatorChar C
L635:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L638:   aload_2
L639:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L642:   getstatic Field java/io/File separatorChar C
L645:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L648:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L651:   astore 5
L653:   iconst_1
L654:   istore 7

        .stack same_extended
L656:   aconst_null
L657:   aload 6
L659:   if_acmpeq L770
L662:   new java/io/File
L665:   dup
L666:   aload 6
L668:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L671:   astore 8
L673:   new java/io/File
L676:   dup
L677:   aload 5
L679:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L682:   astore 9
        .catch java/lang/Exception from L684 to L757 using L760
L684:   aload 8
L686:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L689:   astore 10
L691:   aload 10
L693:   astore 11
L695:   iconst_0
L696:   istore 12

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File Object [Ljava/io/File; Object [Ljava/io/File; Integer
            stack
        .end stack
L698:   iload 12
L700:   aload 11
L702:   arraylength
L703:   if_icmpge L757
L706:   aload 11
L708:   iload 12
L710:   aaload
L711:   astore 13
L713:   new java/io/File
L716:   dup
L717:   aload 9
L719:   aload 13
L721:   invokevirtual Method java/io/File getName ()Ljava/lang/String;
L724:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L727:   astore 14
L729:   aload 13
L731:   aload 14
L733:   invokevirtual Method java/io/File renameTo (Ljava/io/File;)Z
L736:   istore 15
L738:   iload 15
L740:   ifne L751
L743:   new java/io/IOException
L746:   dup
L747:   invokespecial Method java/io/IOException <init> ()V
L750:   athrow

        .stack append Object java/io/File Object java/io/File Integer
L751:   iinc 12 1
L754:   goto L698

        .stack chop 3
L757:   goto L767

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File
            stack Object java/lang/Exception
        .end stack
L760:   astore 10
L762:   aload 10
L764:   invokevirtual Method java/lang/Exception printStackTrace ()V

        .stack append Object java/lang/Object
L767:   iconst_1
L768:   istore 7

        .stack chop 3
L770:   iload 7
L772:   ifeq L792
L775:   aload_0
L776:   new java/io/File
L779:   dup
L780:   aload 5
L782:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L785:   aconst_null
L786:   ldc_w -1497248091
L789:   invokevirtual Method sk k (Ljava/io/File;Ljava/io/File;I)V

        .stack same
L792:   new java/io/File
L795:   dup
L796:   aload 5
L798:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L801:   areturn
L802:   
        .linenumbertable
            L0 225
            L31 226
            L85 227
            L88 228
            L91 229
            L94 230
            L103 233
            L120 234
            L138 235
            L156 236
            L195 237
            L209 238
            L225 239
            L228 240
            L234 241
            L244 242
            L284 243
            L287 244
            L303 245
            L309 246
            L319 247
            L338 250
            L348 251
            L364 253
            L372 257
            L375 255
            L377 256
            L382 258
            L387 259
            L398 260
            L406 261
            L409 264
            L415 265
            L429 266
            L441 267
            L444 271
            L454 272
            L466 273
            L478 274
            L531 275
            L539 276
            L561 277
            L568 278
            L571 279
            L574 273
            L580 272
            L586 285
            L592 286
            L653 287
            L656 289
            L662 290
            L673 291
            L684 293
            L691 295
            L695 296
            L706 297
            L713 299
            L729 300
            L738 301
            L751 296
            L757 308
            L760 306
            L762 307
            L767 309
            L770 311
            L792 312
        .end linenumbertable
    .end code
.end method

.method abstract ay : ()V
.end method

.method public final dr : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 699
        .end linenumbertable
    .end code
.end method

.method az : ()Ljava/lang/String;
    .code stack 1 locals 1
L0:     aconst_null
L1:     areturn
L2:     
        .linenumbertable
            L0 602
        .end linenumbertable
    .end code
.end method

.method aa : ()Ljava/lang/String;
    .code stack 1 locals 1
L0:     aconst_null
L1:     areturn
L2:     
        .linenumbertable
            L0 602
        .end linenumbertable
    .end code
.end method

.method public af : (Ljava/applet/Applet;)V
    .code stack 1 locals 2
L0:     aload_1
L1:     putstatic Field aol i Ljava/applet/Applet;
L4:     return
L5:     
        .linenumbertable
            L0 92
            L4 93
        .end linenumbertable
    .end code
.end method

.method final e : (Lsq;Ljava/lang/String;Ljava/lang/String;IIIIZI)V
    .code stack 8 locals 11
        .catch java/lang/Throwable from L0 to L146 using L149
        .catch java/lang/RuntimeException from L0 to L171 using L171
L0:     aload_0
L1:     getstatic Field sm n Lsm;
L4:     iload 8
L6:     ldc_w 1331913860
L9:     invokevirtual Method sk ar (Lsm;ZI)V
L12:    aload_1
L13:    ldc_w -820575818
L16:    invokevirtual Method sq e (I)I
L19:    ldc_w 1671148283
L22:    imul
L23:    dup
L24:    putstatic Field sk r I
L27:    ldc_w -1040934271
L30:    imul
L31:    putstatic Field sk d I
L34:    aload_1
L35:    ldc_w -567283080
L38:    invokevirtual Method sq n (I)I
L41:    ldc_w 490799697
L44:    imul
L45:    dup
L46:    putstatic Field sk v I
L49:    ldc_w 500427957
L52:    imul
L53:    putstatic Field qf c I
L56:    iconst_0
L57:    putstatic Field sk y I
L60:    iconst_0
L61:    putstatic Field sk q I
L64:    bipush 115
L66:    invokestatic Method in ap (B)Lsm;
L69:    getstatic Field sm m Lsm;
L72:    if_acmpne L123
L75:    getstatic Field sk d I
L78:    ldc_w 1522031862
L81:    aload_1
L82:    ldc_w -1726618611
L85:    invokevirtual Method sq m (I)I
L88:    imul
L89:    iadd
L90:    putstatic Field sk d I
L93:    getstatic Field qf c I
L96:    ldc_w 1706598026
L99:    aload_1
L100:   ldc_w -1743498683
L103:   invokevirtual Method sq k (I)I
L106:   imul
L107:   iadd
L108:   putstatic Field qf c I
L111:   aload_0
L112:   aload_1
L113:   bipush -78
L115:   invokevirtual Method sq f (B)Ljava/lang/String;
L118:   bipush 99
L120:   invokevirtual Method sk d (Ljava/lang/String;B)V

        .stack same_extended
L123:   getstatic Field aol i Ljava/applet/Applet;
L126:   putstatic Field acs f Ljava/applet/Applet;
L129:   aload_0
L130:   aload_2
L131:   aload_3
L132:   iload 4
L134:   iload 5
L136:   iload 6
L138:   iload 7
L140:   ldc_w -616301363
L143:   invokevirtual Method sk n (Ljava/lang/String;Ljava/lang/String;IIIII)V
L146:   goto L170

        .stack stack_1 Object java/lang/Throwable
L149:   astore 10
L151:   aconst_null
L152:   aload 10
L154:   ldc_w 1692810338
L157:   invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L160:   aload_0
L161:   ldc_w "crash"
L164:   ldc_w 1399590744
L167:   invokevirtual Method sk ad (Ljava/lang/String;I)V

        .stack same
L170:   return

        .stack stack_1 Object java/lang/RuntimeException
L171:   new java/lang/StringBuilder
L174:   dup
L175:   invokespecial Method java/lang/StringBuilder <init> ()V
L178:   ldc_w "sk.e("
L181:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L184:   ldc 41
L186:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L189:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L192:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L195:   athrow
L196:   
        .linenumbertable
            L0 97
            L12 98
            L34 99
            L56 100
            L60 101
            L64 102
            L75 103
            L93 104
            L111 105
            L123 107
            L129 108
            L146 113
            L149 110
            L151 111
            L160 112
            L170 114
        .end linenumbertable
    .end code
.end method

.method final an : (Lsq;Ljava/lang/String;Ljava/lang/String;IIIIZ)V
    .code stack 8 locals 10
        .catch java/lang/Throwable from L0 to L146 using L149
L0:     aload_0
L1:     getstatic Field sm n Lsm;
L4:     iload 8
L6:     ldc_w 917811850
L9:     invokevirtual Method sk ar (Lsm;ZI)V
L12:    aload_1
L13:    ldc_w -820575818
L16:    invokevirtual Method sq e (I)I
L19:    ldc_w 1671148283
L22:    imul
L23:    dup
L24:    putstatic Field sk r I
L27:    ldc_w -1040934271
L30:    imul
L31:    putstatic Field sk d I
L34:    aload_1
L35:    ldc_w -567283080
L38:    invokevirtual Method sq n (I)I
L41:    ldc_w 490799697
L44:    imul
L45:    dup
L46:    putstatic Field sk v I
L49:    ldc_w 500427957
L52:    imul
L53:    putstatic Field qf c I
L56:    iconst_0
L57:    putstatic Field sk y I
L60:    iconst_0
L61:    putstatic Field sk q I
L64:    bipush 44
L66:    invokestatic Method in ap (B)Lsm;
L69:    getstatic Field sm m Lsm;
L72:    if_acmpne L123
L75:    getstatic Field sk d I
L78:    ldc_w 1522031862
L81:    aload_1
L82:    ldc_w 1426116554
L85:    invokevirtual Method sq m (I)I
L88:    imul
L89:    iadd
L90:    putstatic Field sk d I
L93:    getstatic Field qf c I
L96:    ldc_w 1706598026
L99:    aload_1
L100:   ldc_w -1743498683
L103:   invokevirtual Method sq k (I)I
L106:   imul
L107:   iadd
L108:   putstatic Field qf c I
L111:   aload_0
L112:   aload_1
L113:   bipush -47
L115:   invokevirtual Method sq f (B)Ljava/lang/String;
L118:   bipush 125
L120:   invokevirtual Method sk d (Ljava/lang/String;B)V

        .stack same_extended
L123:   getstatic Field aol i Ljava/applet/Applet;
L126:   putstatic Field acs f Ljava/applet/Applet;
L129:   aload_0
L130:   aload_2
L131:   aload_3
L132:   iload 4
L134:   iload 5
L136:   iload 6
L138:   iload 7
L140:   ldc_w -616301363
L143:   invokevirtual Method sk n (Ljava/lang/String;Ljava/lang/String;IIIII)V
L146:   goto L170

        .stack stack_1 Object java/lang/Throwable
L149:   astore 9
L151:   aconst_null
L152:   aload 9
L154:   ldc_w 1089355595
L157:   invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L160:   aload_0
L161:   ldc_w "crash"
L164:   ldc_w 2102320563
L167:   invokevirtual Method sk ad (Ljava/lang/String;I)V

        .stack same
L170:   return
L171:   
        .linenumbertable
            L0 97
            L12 98
            L34 99
            L56 100
            L60 101
            L64 102
            L75 103
            L93 104
            L111 105
            L123 107
            L129 108
            L146 113
            L149 110
            L151 111
            L160 112
            L170 114
        .end linenumbertable
    .end code
.end method

.method final bf : (Lsq;Ljava/lang/String;Ljava/lang/String;IIIIZ)V
    .code stack 8 locals 10
        .catch java/lang/Throwable from L0 to L146 using L149
L0:     aload_0
L1:     getstatic Field sm n Lsm;
L4:     iload 8
L6:     ldc_w -868112265
L9:     invokevirtual Method sk ar (Lsm;ZI)V
L12:    aload_1
L13:    ldc_w -820575818
L16:    invokevirtual Method sq e (I)I
L19:    ldc_w 1671148283
L22:    imul
L23:    dup
L24:    putstatic Field sk r I
L27:    ldc_w -1040934271
L30:    imul
L31:    putstatic Field sk d I
L34:    aload_1
L35:    ldc_w -567283080
L38:    invokevirtual Method sq n (I)I
L41:    ldc_w 490799697
L44:    imul
L45:    dup
L46:    putstatic Field sk v I
L49:    ldc_w 500427957
L52:    imul
L53:    putstatic Field qf c I
L56:    iconst_0
L57:    putstatic Field sk y I
L60:    iconst_0
L61:    putstatic Field sk q I
L64:    bipush 9
L66:    invokestatic Method in ap (B)Lsm;
L69:    getstatic Field sm m Lsm;
L72:    if_acmpne L123
L75:    getstatic Field sk d I
L78:    ldc_w 1522031862
L81:    aload_1
L82:    ldc_w -1311792139
L85:    invokevirtual Method sq m (I)I
L88:    imul
L89:    iadd
L90:    putstatic Field sk d I
L93:    getstatic Field qf c I
L96:    ldc_w 1706598026
L99:    aload_1
L100:   ldc_w -1743498683
L103:   invokevirtual Method sq k (I)I
L106:   imul
L107:   iadd
L108:   putstatic Field qf c I
L111:   aload_0
L112:   aload_1
L113:   bipush -87
L115:   invokevirtual Method sq f (B)Ljava/lang/String;
L118:   bipush 105
L120:   invokevirtual Method sk d (Ljava/lang/String;B)V

        .stack same_extended
L123:   getstatic Field aol i Ljava/applet/Applet;
L126:   putstatic Field acs f Ljava/applet/Applet;
L129:   aload_0
L130:   aload_2
L131:   aload_3
L132:   iload 4
L134:   iload 5
L136:   iload 6
L138:   iload 7
L140:   ldc_w -616301363
L143:   invokevirtual Method sk n (Ljava/lang/String;Ljava/lang/String;IIIII)V
L146:   goto L170

        .stack stack_1 Object java/lang/Throwable
L149:   astore 9
L151:   aconst_null
L152:   aload 9
L154:   ldc_w 823907050
L157:   invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L160:   aload_0
L161:   ldc_w "crash"
L164:   ldc_w -1380350714
L167:   invokevirtual Method sk ad (Ljava/lang/String;I)V

        .stack same
L170:   return
L171:   
        .linenumbertable
            L0 97
            L12 98
            L34 99
            L56 100
            L60 101
            L64 102
            L75 103
            L93 104
            L111 105
            L123 107
            L129 108
            L146 113
            L149 110
            L151 111
            L160 112
            L170 114
        .end linenumbertable
    .end code
.end method

.method final bl : (Ljava/lang/String;Ljava/lang/String;IIII)V
    .code stack 10 locals 12
L0:     iload 4
L2:     ldc -50287977
L4:     imul
L5:     putstatic Field b ap I
L8:     iload_3
L9:     ldc 1992753025
L11:    imul
L12:    putstatic Field jr aa I
L15:    iload 5
L17:    ldc 637270585
L19:    imul
L20:    putstatic Field atc m I
L23:    ldc -501733079
L25:    iload 6
L27:    imul
L28:    putstatic Field atc k I
L31:    ldc "Unknown"
L33:    putstatic Field ky bn Ljava/lang/String;
L36:    ldc "1.1"
L38:    putstatic Field ae bt Ljava/lang/String;
        .catch java/lang/Exception from L41 to L57 using L60
L41:    ldc "java.vendor"
L43:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L46:    putstatic Field ky bn Ljava/lang/String;
L49:    ldc "java.version"
L51:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L54:    putstatic Field ae bt Ljava/lang/String;
L57:    goto L62

        .stack stack_1 Object java/lang/Exception
L60:    astore 7
        .catch java/lang/Exception from L62 to L70 using L73

        .stack same
L62:    ldc "os.name"
L64:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L67:    putstatic Field alc bm Ljava/lang/String;
L70:    goto L80

        .stack stack_1 Object java/lang/Exception
L73:    astore 7
L75:    ldc "Unknown"
L77:    putstatic Field alc bm Ljava/lang/String;

        .stack same
L80:    getstatic Field alc bm Ljava/lang/String;
L83:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L86:    putstatic Field ij bq Ljava/lang/String;
        .catch java/lang/Exception from L89 to L100 using L103
L89:    ldc "os.arch"
L91:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L94:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L97:    putstatic Field hq bb Ljava/lang/String;
L100:   goto L110

        .stack stack_1 Object java/lang/Exception
L103:   astore 7
L105:   ldc ""
L107:   putstatic Field hq bb Ljava/lang/String;
        .catch java/lang/Exception from L110 to L121 using L124

        .stack same
L110:   ldc "os.version"
L112:   invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L115:   invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L118:   putstatic Field xv be Ljava/lang/String;
L121:   goto L131

        .stack stack_1 Object java/lang/Exception
L124:   astore 7
L126:   ldc ""
L128:   putstatic Field xv be Ljava/lang/String;
        .catch java/lang/Exception from L131 to L169 using L172

        .stack same
L131:   ldc "user.home"
L133:   invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L136:   putstatic Field pk by Ljava/lang/String;
L139:   getstatic Field pk by Ljava/lang/String;
L142:   ifnull L169
L145:   new java/lang/StringBuilder
L148:   dup
L149:   invokespecial Method java/lang/StringBuilder <init> ()V
L152:   getstatic Field pk by Ljava/lang/String;
L155:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L158:   ldc "/"
L160:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L163:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L166:   putstatic Field pk by Ljava/lang/String;

        .stack same
L169:   goto L174

        .stack stack_1 Object java/lang/Exception
L172:   astore 7
        .catch java/lang/Exception from L174 to L249 using L252

        .stack same
L174:   getstatic Field ij bq Ljava/lang/String;
L177:   ldc "win"
L179:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L182:   ifeq L203
L185:   aconst_null
L186:   getstatic Field pk by Ljava/lang/String;
L189:   if_acmpne L218
L192:   ldc "USERPROFILE"
L194:   invokestatic Method java/lang/System getenv (Ljava/lang/String;)Ljava/lang/String;
L197:   putstatic Field pk by Ljava/lang/String;
L200:   goto L218

        .stack same
L203:   aconst_null
L204:   getstatic Field pk by Ljava/lang/String;
L207:   if_acmpne L218
L210:   ldc "HOME"
L212:   invokestatic Method java/lang/System getenv (Ljava/lang/String;)Ljava/lang/String;
L215:   putstatic Field pk by Ljava/lang/String;

        .stack same
L218:   aconst_null
L219:   getstatic Field pk by Ljava/lang/String;
L222:   if_acmpeq L249
L225:   new java/lang/StringBuilder
L228:   dup
L229:   invokespecial Method java/lang/StringBuilder <init> ()V
L232:   getstatic Field pk by Ljava/lang/String;
L235:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L238:   ldc "/"
L240:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L243:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L246:   putstatic Field pk by Ljava/lang/String;

        .stack same
L249:   goto L254

        .stack stack_1 Object java/lang/Exception
L252:   astore 7

        .stack same
L254:   aconst_null
L255:   getstatic Field pk by Ljava/lang/String;
L258:   if_acmpne L266
L261:   ldc "~/"
L263:   putstatic Field pk by Ljava/lang/String;
        .catch java/lang/Throwable from L266 to L275 using L278

        .stack same
L266:   invokestatic Method java/awt/Toolkit getDefaultToolkit ()Ljava/awt/Toolkit;
L269:   invokevirtual Method java/awt/Toolkit getSystemEventQueue ()Ljava/awt/EventQueue;
L272:   putstatic Field uw bu Ljava/awt/EventQueue;
L275:   goto L280

        .stack stack_1 Object java/lang/Throwable
L278:   astore 7

        .stack same
L280:   bipush 8
L282:   anewarray java/lang/String
L285:   dup
L286:   iconst_0
L287:   ldc "c:/rscache/"
L289:   aastore
L290:   dup
L291:   iconst_1
L292:   ldc "/rscache/"
L294:   aastore
L295:   dup
L296:   iconst_2
L297:   ldc "c:/windows/"
L299:   aastore
L300:   dup
L301:   iconst_3
L302:   ldc "c:/winnt/"
L304:   aastore
L305:   dup
L306:   iconst_4
L307:   ldc_w "c:/"
L310:   aastore
L311:   dup
L312:   iconst_5
L313:   getstatic Field pk by Ljava/lang/String;
L316:   aastore
L317:   dup
L318:   bipush 6
L320:   ldc_w "/tmp/"
L323:   aastore
L324:   dup
L325:   bipush 7
L327:   ldc ""
L329:   aastore
L330:   putstatic Field y af [Ljava/lang/String;
L333:   iconst_2
L334:   anewarray java/lang/String
L337:   dup
L338:   iconst_0
L339:   new java/lang/StringBuilder
L342:   dup
L343:   invokespecial Method java/lang/StringBuilder <init> ()V
L346:   ldc_w ".jagex_cache_"
L349:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L352:   getstatic Field jr aa I
L355:   ldc_w -1839644543
L358:   imul
L359:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L362:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L365:   aastore
L366:   dup
L367:   iconst_1
L368:   new java/lang/StringBuilder
L371:   dup
L372:   invokespecial Method java/lang/StringBuilder <init> ()V
L375:   ldc_w ".file_store_"
L378:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L381:   ldc_w -1839644543
L384:   getstatic Field jr aa I
L387:   imul
L388:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L391:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L394:   aastore
L395:   putstatic Field la ak [Ljava/lang/String;
L398:   iconst_0
L399:   istore 7

        .stack append Integer
L401:   iload 7
L403:   iconst_4
L404:   if_icmpge L502
L407:   aload_0
L408:   aload_1
L409:   aload_2
L410:   iload 7
L412:   ldc_w 16777215
L415:   invokevirtual Method sk m (Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;
L418:   putstatic Field sx ar Ljava/io/File;
L421:   getstatic Field sx ar Ljava/io/File;
L424:   invokevirtual Method java/io/File exists ()Z
L427:   ifne L437
L430:   getstatic Field sx ar Ljava/io/File;
L433:   invokevirtual Method java/io/File mkdirs ()Z
L436:   pop

        .stack same
L437:   getstatic Field sx ar Ljava/io/File;
L440:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L443:   astore 8
L445:   aload 8
L447:   ifnull L502
L450:   aload 8
L452:   astore 9
L454:   iconst_0
L455:   istore 10

        .stack append Object [Ljava/io/File; Object [Ljava/io/File; Integer
L457:   iload 10
L459:   aload 9
L461:   arraylength
L462:   if_icmpge L493
L465:   aload 9
L467:   iload 10
L469:   aaload
L470:   astore 11
L472:   aload_0
L473:   aload 11
L475:   iconst_0
L476:   bipush -108
L478:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L481:   ifne L487
L484:   goto L496

        .stack append Object java/io/File
L487:   iinc 10 1
L490:   goto L457

        .stack chop 1
L493:   goto L502

        .stack append Object java/io/File
L496:   iinc 7 1
L499:   goto L401

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Integer Integer Integer Integer
            stack
        .end stack
L502:   getstatic Field sx ar Ljava/io/File;
L505:   bipush 24
L507:   invokestatic Method gn e (Ljava/io/File;B)V
L510:   ldc_w 638430743
L513:   invokestatic Method n u (I)V
L516:   new abp
L519:   dup
L520:   new abl
L523:   dup
L524:   ldc "main_file_cache.dat2"
L526:   ldc_w -852735306
L529:   invokestatic Method aou m (Ljava/lang/String;I)Ljava/io/File;
L532:   ldc "rw"
L534:   ldc2_w 3221225472L
L537:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L540:   sipush 5200
L543:   iconst_0
L544:   invokespecial Method abp <init> (Labl;II)V
L547:   putstatic Field sk ay Labp;
L550:   new abp
L553:   dup
L554:   new abl
L557:   dup
L558:   ldc "main_file_cache.idx255"
L560:   ldc_w -153802781
L563:   invokestatic Method aou m (Ljava/lang/String;I)Ljava/io/File;
L566:   ldc "rw"
L568:   ldc2_w 1048576L
L571:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L574:   sipush 6000
L577:   iconst_0
L578:   invokespecial Method abp <init> (Labl;II)V
L581:   putstatic Field sk ab Labp;
L584:   ldc_w 694777127
L587:   getstatic Field b ap I
L590:   imul
L591:   anewarray abp
L594:   putstatic Field vs az [Labp;
L597:   iconst_0
L598:   istore 7

        .stack same_extended
L600:   iload 7
L602:   ldc_w 694777127
L605:   getstatic Field b ap I
L608:   imul
L609:   if_icmpge L673
L612:   getstatic Field vs az [Labp;
L615:   iload 7
L617:   new abp
L620:   dup
L621:   new abl
L624:   dup
L625:   new java/lang/StringBuilder
L628:   dup
L629:   invokespecial Method java/lang/StringBuilder <init> ()V
L632:   ldc "main_file_cache.idx"
L634:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L637:   iload 7
L639:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L642:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L645:   ldc_w -1664160811
L648:   invokestatic Method aou m (Ljava/lang/String;I)Ljava/io/File;
L651:   ldc "rw"
L653:   ldc2_w 1048576L
L656:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L659:   sipush 6000
L662:   iconst_0
L663:   invokespecial Method abp <init> (Labl;II)V
L666:   aastore
L667:   iinc 7 1
L670:   goto L600
        .catch java/lang/Exception from L673 to L683 using L686

        .stack same_extended
L673:   new aae
L676:   dup
L677:   invokespecial Method aae <init> ()V
L680:   putstatic Field sn al Laae;
L683:   goto L692

        .stack stack_1 Object java/lang/Exception
L686:   astore 7
L688:   iconst_0
L689:   putstatic Field aab e Z

        .stack chop 1
L692:   new si
L695:   dup
L696:   invokespecial Method si <init> ()V
L699:   putstatic Field fo as Lsi;
L702:   invokestatic Method java/lang/Thread currentThread ()Ljava/lang/Thread;
L705:   invokevirtual Method java/lang/Thread getThreadGroup ()Ljava/lang/ThreadGroup;
L708:   astore 7
L710:   aload 7
L712:   invokevirtual Method java/lang/ThreadGroup getParent ()Ljava/lang/ThreadGroup;
L715:   astore 8

        .stack append Object java/lang/ThreadGroup Object java/lang/ThreadGroup
L717:   aload 8
L719:   ifnull L736
L722:   aload 8
L724:   astore 7
L726:   aload 7
L728:   invokevirtual Method java/lang/ThreadGroup getParent ()Ljava/lang/ThreadGroup;
L731:   astore 8
L733:   goto L717

        .stack same
L736:   sipush 1000
L739:   anewarray java/lang/Thread
L742:   astore 9
L744:   aload 7
L746:   aload 9
L748:   invokevirtual Method java/lang/ThreadGroup enumerate ([Ljava/lang/Thread;)I
L751:   pop
L752:   iconst_0
L753:   istore 10

        .stack append Object [Ljava/lang/Thread; Integer
L755:   iload 10
L757:   aload 9
L759:   arraylength
L760:   if_icmpge L803
L763:   aload 9
L765:   iload 10
L767:   aaload
L768:   ifnull L797
L771:   aload 9
L773:   iload 10
L775:   aaload
L776:   invokevirtual Method java/lang/Thread getName ()Ljava/lang/String;
L779:   ldc_w "AWT"
L782:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L785:   ifeq L797
L788:   aload 9
L790:   iload 10
L792:   aaload
L793:   iconst_1
L794:   invokevirtual Method java/lang/Thread setPriority (I)V

        .stack same
L797:   iinc 10 1
L800:   goto L755

        .stack same
L803:   new java/lang/Thread
L806:   dup
L807:   aload_0
L808:   invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L811:   astore 7
L813:   aload 7
L815:   iconst_1
L816:   invokevirtual Method java/lang/Thread setDaemon (Z)V
L819:   aload 7
L821:   invokevirtual Method java/lang/Thread start ()V
L824:   aload 7
L826:   iconst_1
L827:   invokevirtual Method java/lang/Thread setPriority (I)V
L830:   return
L831:   
        .linenumbertable
            L0 117
            L8 118
            L15 119
            L23 120
            L31 121
            L36 122
            L41 124
            L49 125
            L57 127
            L62 129
            L70 133
            L73 131
            L75 132
            L80 134
            L89 136
            L100 140
            L103 138
            L105 139
            L110 142
            L121 146
            L124 144
            L126 145
            L131 148
            L139 149
            L169 151
            L174 153
            L185 154
            L203 157
            L218 159
            L249 161
            L254 162
            L266 164
            L275 166
            L280 167
            L333 168
            L398 169
            L407 170
            L421 171
            L437 172
            L445 173
            L450 175
            L454 176
            L465 177
            L472 179
            L487 176
            L493 182
            L496 169
            L502 186
            L510 187
            L516 188
            L550 189
            L584 190
            L597 191
            L612 192
            L667 191
            L673 196
            L683 200
            L686 198
            L688 199
            L692 202
            L702 204
            L710 205
            L717 206
            L722 207
            L726 208
            L736 210
            L744 211
            L752 212
            L763 213
            L788 214
            L797 212
            L803 218
            L813 219
            L819 220
            L824 221
            L830 222
        .end linenumbertable
    .end code
    .exceptions java/lang/Exception
.end method

.method bk : (Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;
    .code stack 6 locals 16
L0:     iconst_0
L1:     iload_3
L2:     if_icmpne L10
L5:     ldc ""
L7:     goto L29

        .stack same
L10:    new java/lang/StringBuilder
L13:    dup
L14:    invokespecial Method java/lang/StringBuilder <init> ()V
L17:    ldc ""
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    iload_3
L23:    invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L26:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;

        .stack stack_1 Object java/lang/String
L29:    astore 4
L31:    new java/io/File
L34:    dup
L35:    getstatic Field pk by Ljava/lang/String;
L38:    new java/lang/StringBuilder
L41:    dup
L42:    invokespecial Method java/lang/StringBuilder <init> ()V
L45:    ldc_w "jagex_cl_"
L48:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L51:    aload_1
L52:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L55:    ldc_w "_"
L58:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L61:    aload_2
L62:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L65:    aload 4
L67:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L70:    ldc_w ".dat"
L73:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L76:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L79:    invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L82:    putstatic Field sk au Ljava/io/File;
L85:    aconst_null
L86:    astore 5
L88:    aconst_null
L89:    astore 6
L91:    iconst_0
L92:    istore 7
L94:    getstatic Field sk au Ljava/io/File;
L97:    invokevirtual Method java/io/File exists ()Z
L100:   ifeq L444
        .catch java/io/IOException from L103 to L372 using L375
L103:   new abl
L106:   dup
L107:   getstatic Field sk au Ljava/io/File;
L110:   ldc "rw"
L112:   ldc2_w 10000L
L115:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L118:   astore 8
L120:   new alw
L123:   dup
L124:   aload 8
L126:   ldc_w 1387314695
L129:   invokevirtual Method abl f (I)J
L132:   l2i
L133:   invokespecial Method alw <init> (I)V
L136:   astore 9

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Null Null Integer Object abl Object alw
            stack
        .end stack
L138:   ldc_w 212851357
L141:   aload 9
L143:   getfield Field alw l I
L146:   imul
L147:   aload 9
L149:   getfield Field alw w [B
L152:   arraylength
L153:   if_icmpge L228
L156:   aload 8
L158:   aload 9
L160:   getfield Field alw w [B
L163:   ldc_w 212851357
L166:   aload 9
L168:   getfield Field alw l I
L171:   imul
L172:   aload 9
L174:   getfield Field alw w [B
L177:   arraylength
L178:   ldc_w 212851357
L181:   aload 9
L183:   getfield Field alw l I
L186:   imul
L187:   isub
L188:   bipush 53
L190:   invokevirtual Method abl w ([BIIB)I
L193:   istore 10
L195:   iconst_m1
L196:   iload 10
L198:   if_icmpne L209
L201:   new java/io/IOException
L204:   dup
L205:   invokespecial Method java/io/IOException <init> ()V
L208:   athrow

        .stack append Integer
L209:   aload 9
L211:   dup
L212:   getfield Field alw l I
L215:   iload 10
L217:   ldc_w -1445626955
L220:   imul
L221:   iadd
L222:   putfield Field alw l I
L225:   goto L138

        .stack chop 1
L228:   aload 9
L230:   iconst_0
L231:   putfield Field alw l I
L234:   aload 9
L236:   sipush 16384
L239:   invokevirtual Method alw ai (S)I
L242:   istore 10
L244:   iload 10
L246:   iconst_1
L247:   if_icmplt L256
L250:   iload 10
L252:   iconst_3
L253:   if_icmple L284

        .stack append Integer
L256:   new java/io/IOException
L259:   dup
L260:   new java/lang/StringBuilder
L263:   dup
L264:   invokespecial Method java/lang/StringBuilder <init> ()V
L267:   ldc ""
L269:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L272:   iload 10
L274:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L277:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L280:   invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L283:   athrow

        .stack same
L284:   iconst_0
L285:   istore 11
L287:   iload 10
L289:   iconst_1
L290:   if_icmple L303
L293:   aload 9
L295:   sipush 16384
L298:   invokevirtual Method alw ai (S)I
L301:   istore 11

        .stack append Integer
L303:   iload 10
L305:   iconst_2
L306:   if_icmpgt L338
L309:   aload 9
L311:   ldc_w 490795334
L314:   invokevirtual Method alw ab (I)Ljava/lang/String;
L317:   astore 5
L319:   iconst_1
L320:   iload 11
L322:   if_icmpne L364
L325:   aload 9
L327:   ldc_w 368323162
L330:   invokevirtual Method alw ab (I)Ljava/lang/String;
L333:   astore 6
L335:   goto L364

        .stack same
L338:   aload 9
L340:   ldc_w -139136361
L343:   invokevirtual Method alw az (I)Ljava/lang/String;
L346:   astore 5
L348:   iconst_1
L349:   iload 11
L351:   if_icmpne L364
L354:   aload 9
L356:   ldc_w 496690280
L359:   invokevirtual Method alw az (I)Ljava/lang/String;
L362:   astore 6

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object abl Object alw Integer Integer
            stack
        .end stack
L364:   aload 8
L366:   ldc_w 33957482
L369:   invokevirtual Method abl m (I)V
L372:   goto L382

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer
            stack Object java/io/IOException
        .end stack
L375:   astore 9
L377:   aload 9
L379:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L382:   aload 5
L384:   ifnull L409
L387:   new java/io/File
L390:   dup
L391:   aload 5
L393:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L396:   astore 9
L398:   aload 9
L400:   invokevirtual Method java/io/File exists ()Z
L403:   ifne L409
L406:   aconst_null
L407:   astore 5

        .stack same
L409:   aconst_null
L410:   aload 5
L412:   if_acmpeq L444
L415:   new java/io/File
L418:   dup
L419:   aload 5
L421:   ldc_w "test.dat"
L424:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L427:   astore 9
L429:   aload_0
L430:   aload 9
L432:   iconst_1
L433:   bipush -114
L435:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L438:   ifne L444
L441:   aconst_null
L442:   astore 5

        .stack chop 2
L444:   aconst_null
L445:   aload 5
L447:   if_acmpne L586
L450:   iload_3
L451:   ifne L586
L454:   iconst_0
L455:   istore 8

        .stack append Integer
L457:   iload 8
L459:   getstatic Field la ak [Ljava/lang/String;
L462:   arraylength
L463:   if_icmpge L586
L466:   iconst_0
L467:   istore 9

        .stack append Integer
L469:   iload 9
L471:   getstatic Field y af [Ljava/lang/String;
L474:   arraylength
L475:   if_icmpge L580
L478:   new java/io/File
L481:   dup
L482:   new java/lang/StringBuilder
L485:   dup
L486:   invokespecial Method java/lang/StringBuilder <init> ()V
L489:   getstatic Field y af [Ljava/lang/String;
L492:   iload 9
L494:   aaload
L495:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L498:   getstatic Field la ak [Ljava/lang/String;
L501:   iload 8
L503:   aaload
L504:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L507:   getstatic Field java/io/File separatorChar C
L510:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L513:   aload_1
L514:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L517:   getstatic Field java/io/File separatorChar C
L520:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L523:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L526:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L529:   astore 10
L531:   aload 10
L533:   invokevirtual Method java/io/File exists ()Z
L536:   ifeq L574
L539:   aload_0
L540:   new java/io/File
L543:   dup
L544:   aload 10
L546:   ldc_w "test.dat"
L549:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L552:   iconst_1
L553:   bipush -5
L555:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L558:   ifeq L574
L561:   aload 10
L563:   invokevirtual Method java/io/File toString ()Ljava/lang/String;
L566:   astore 5
L568:   iconst_1
L569:   istore 7
L571:   goto L586

        .stack append Object java/io/File
L574:   iinc 9 1
L577:   goto L469

        .stack chop 1
L580:   iinc 8 1
L583:   goto L457

        .stack chop 2
L586:   aconst_null
L587:   aload 5
L589:   if_acmpne L656
L592:   new java/lang/StringBuilder
L595:   dup
L596:   invokespecial Method java/lang/StringBuilder <init> ()V
L599:   getstatic Field pk by Ljava/lang/String;
L602:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L605:   getstatic Field java/io/File separatorChar C
L608:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L611:   ldc_w "jagexcache"
L614:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L617:   aload 4
L619:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L622:   getstatic Field java/io/File separatorChar C
L625:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L628:   aload_1
L629:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L632:   getstatic Field java/io/File separatorChar C
L635:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L638:   aload_2
L639:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L642:   getstatic Field java/io/File separatorChar C
L645:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L648:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L651:   astore 5
L653:   iconst_1
L654:   istore 7

        .stack same_extended
L656:   aconst_null
L657:   aload 6
L659:   if_acmpeq L770
L662:   new java/io/File
L665:   dup
L666:   aload 6
L668:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L671:   astore 8
L673:   new java/io/File
L676:   dup
L677:   aload 5
L679:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L682:   astore 9
        .catch java/lang/Exception from L684 to L757 using L760
L684:   aload 8
L686:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L689:   astore 10
L691:   aload 10
L693:   astore 11
L695:   iconst_0
L696:   istore 12

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File Object [Ljava/io/File; Object [Ljava/io/File; Integer
            stack
        .end stack
L698:   iload 12
L700:   aload 11
L702:   arraylength
L703:   if_icmpge L757
L706:   aload 11
L708:   iload 12
L710:   aaload
L711:   astore 13
L713:   new java/io/File
L716:   dup
L717:   aload 9
L719:   aload 13
L721:   invokevirtual Method java/io/File getName ()Ljava/lang/String;
L724:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L727:   astore 14
L729:   aload 13
L731:   aload 14
L733:   invokevirtual Method java/io/File renameTo (Ljava/io/File;)Z
L736:   istore 15
L738:   iload 15
L740:   ifne L751
L743:   new java/io/IOException
L746:   dup
L747:   invokespecial Method java/io/IOException <init> ()V
L750:   athrow

        .stack append Object java/io/File Object java/io/File Integer
L751:   iinc 12 1
L754:   goto L698

        .stack chop 3
L757:   goto L767

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File
            stack Object java/lang/Exception
        .end stack
L760:   astore 10
L762:   aload 10
L764:   invokevirtual Method java/lang/Exception printStackTrace ()V

        .stack append Object java/lang/Object
L767:   iconst_1
L768:   istore 7

        .stack chop 3
L770:   iload 7
L772:   ifeq L792
L775:   aload_0
L776:   new java/io/File
L779:   dup
L780:   aload 5
L782:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L785:   aconst_null
L786:   ldc_w -1497248091
L789:   invokevirtual Method sk k (Ljava/io/File;Ljava/io/File;I)V

        .stack same
L792:   new java/io/File
L795:   dup
L796:   aload 5
L798:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L801:   areturn
L802:   
        .linenumbertable
            L0 225
            L31 226
            L85 227
            L88 228
            L91 229
            L94 230
            L103 233
            L120 234
            L138 235
            L156 236
            L195 237
            L209 238
            L225 239
            L228 240
            L234 241
            L244 242
            L284 243
            L287 244
            L303 245
            L309 246
            L319 247
            L338 250
            L348 251
            L364 253
            L372 257
            L375 255
            L377 256
            L382 258
            L387 259
            L398 260
            L406 261
            L409 264
            L415 265
            L429 266
            L441 267
            L444 271
            L454 272
            L466 273
            L478 274
            L531 275
            L539 276
            L561 277
            L568 278
            L571 279
            L574 273
            L580 272
            L586 285
            L592 286
            L653 287
            L656 289
            L662 290
            L673 291
            L684 293
            L691 295
            L695 296
            L706 297
            L713 299
            L729 300
            L738 301
            L751 296
            L757 308
            L760 306
            L762 307
            L767 309
            L770 311
            L792 312
        .end linenumbertable
    .end code
.end method

.method am : (Ljava/lang/String;Ljava/lang/String;B)V
    .code stack 6 locals 5
L0:     aload_0
L1:     getfield Field sk bx Z
L4:     ifeq L8
L7:     return

        .stack same
L8:     aload_0
L9:     iconst_1
L10:    putfield Field sk bx Z
L13:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L16:    new java/lang/StringBuilder
L19:    dup
L20:    invokespecial Method java/lang/StringBuilder <init> ()V
L23:    ldc_w "error_game_"
L26:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L29:    aload_1
L30:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L33:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L36:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/lang/Throwable from L39 to L52 using L55
L39:    getstatic Field aol i Ljava/applet/Applet;
L42:    ldc_w "loggedout"
L45:    ldc_w 2002709341
L48:    invokestatic Method act n (Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;
L51:    pop
L52:    goto L57

        .stack stack_1 Object java/lang/Throwable
L55:    astore 4
        .catch java/lang/Exception from L57 to L114 using L117
        .catch java/lang/RuntimeException from L0 to L120 using L120

        .stack same
L57:    getstatic Field aol i Ljava/applet/Applet;
L60:    invokevirtual Method java/applet/Applet getAppletContext ()Ljava/applet/AppletContext;
L63:    new java/net/URL
L66:    dup
L67:    getstatic Field aol i Ljava/applet/Applet;
L70:    invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L73:    new java/lang/StringBuilder
L76:    dup
L77:    invokespecial Method java/lang/StringBuilder <init> ()V
L80:    ldc_w "error_game_"
L83:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L86:    aload_1
L87:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L90:    ldc_w ".ws?"
L93:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L96:    aload_2
L97:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L100:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L103:   invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L106:   ldc_w "_top"
L109:   invokeinterface InterfaceMethod java/applet/AppletContext showDocument (Ljava/net/URL;Ljava/lang/String;)V 3
L114:   goto L119

        .stack stack_1 Object java/lang/Exception
L117:   astore 4

        .stack same
L119:   return

        .stack stack_1 Object java/lang/RuntimeException
L120:   new java/lang/StringBuilder
L123:   dup
L124:   invokespecial Method java/lang/StringBuilder <init> ()V
L127:   ldc_w "sk.am("
L130:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L133:   ldc 41
L135:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L138:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L141:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L144:   athrow
L145:   
        .linenumbertable
            L0 796
            L8 797
            L13 798
            L39 800
            L52 802
            L57 804
            L114 806
            L119 807
        .end linenumbertable
    .end code
.end method

.method public abstract dn : ()V
.end method

.method bd : (Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;
    .code stack 6 locals 16
L0:     iconst_0
L1:     iload_3
L2:     if_icmpne L10
L5:     ldc ""
L7:     goto L29

        .stack same
L10:    new java/lang/StringBuilder
L13:    dup
L14:    invokespecial Method java/lang/StringBuilder <init> ()V
L17:    ldc ""
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    iload_3
L23:    invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L26:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;

        .stack stack_1 Object java/lang/String
L29:    astore 4
L31:    new java/io/File
L34:    dup
L35:    getstatic Field pk by Ljava/lang/String;
L38:    new java/lang/StringBuilder
L41:    dup
L42:    invokespecial Method java/lang/StringBuilder <init> ()V
L45:    ldc_w "jagex_cl_"
L48:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L51:    aload_1
L52:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L55:    ldc_w "_"
L58:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L61:    aload_2
L62:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L65:    aload 4
L67:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L70:    ldc_w ".dat"
L73:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L76:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L79:    invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L82:    putstatic Field sk au Ljava/io/File;
L85:    aconst_null
L86:    astore 5
L88:    aconst_null
L89:    astore 6
L91:    iconst_0
L92:    istore 7
L94:    getstatic Field sk au Ljava/io/File;
L97:    invokevirtual Method java/io/File exists ()Z
L100:   ifeq L444
        .catch java/io/IOException from L103 to L372 using L375
L103:   new abl
L106:   dup
L107:   getstatic Field sk au Ljava/io/File;
L110:   ldc "rw"
L112:   ldc2_w 10000L
L115:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L118:   astore 8
L120:   new alw
L123:   dup
L124:   aload 8
L126:   ldc_w 1154194021
L129:   invokevirtual Method abl f (I)J
L132:   l2i
L133:   invokespecial Method alw <init> (I)V
L136:   astore 9

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Null Null Integer Object abl Object alw
            stack
        .end stack
L138:   ldc_w 212851357
L141:   aload 9
L143:   getfield Field alw l I
L146:   imul
L147:   aload 9
L149:   getfield Field alw w [B
L152:   arraylength
L153:   if_icmpge L228
L156:   aload 8
L158:   aload 9
L160:   getfield Field alw w [B
L163:   ldc_w 212851357
L166:   aload 9
L168:   getfield Field alw l I
L171:   imul
L172:   aload 9
L174:   getfield Field alw w [B
L177:   arraylength
L178:   ldc_w 212851357
L181:   aload 9
L183:   getfield Field alw l I
L186:   imul
L187:   isub
L188:   bipush -67
L190:   invokevirtual Method abl w ([BIIB)I
L193:   istore 10
L195:   iconst_m1
L196:   iload 10
L198:   if_icmpne L209
L201:   new java/io/IOException
L204:   dup
L205:   invokespecial Method java/io/IOException <init> ()V
L208:   athrow

        .stack append Integer
L209:   aload 9
L211:   dup
L212:   getfield Field alw l I
L215:   iload 10
L217:   ldc_w -1445626955
L220:   imul
L221:   iadd
L222:   putfield Field alw l I
L225:   goto L138

        .stack chop 1
L228:   aload 9
L230:   iconst_0
L231:   putfield Field alw l I
L234:   aload 9
L236:   sipush 16384
L239:   invokevirtual Method alw ai (S)I
L242:   istore 10
L244:   iload 10
L246:   iconst_1
L247:   if_icmplt L256
L250:   iload 10
L252:   iconst_3
L253:   if_icmple L284

        .stack append Integer
L256:   new java/io/IOException
L259:   dup
L260:   new java/lang/StringBuilder
L263:   dup
L264:   invokespecial Method java/lang/StringBuilder <init> ()V
L267:   ldc ""
L269:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L272:   iload 10
L274:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L277:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L280:   invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L283:   athrow

        .stack same
L284:   iconst_0
L285:   istore 11
L287:   iload 10
L289:   iconst_1
L290:   if_icmple L303
L293:   aload 9
L295:   sipush 16384
L298:   invokevirtual Method alw ai (S)I
L301:   istore 11

        .stack append Integer
L303:   iload 10
L305:   iconst_2
L306:   if_icmpgt L338
L309:   aload 9
L311:   ldc_w 1036988259
L314:   invokevirtual Method alw ab (I)Ljava/lang/String;
L317:   astore 5
L319:   iconst_1
L320:   iload 11
L322:   if_icmpne L364
L325:   aload 9
L327:   ldc_w 1821938129
L330:   invokevirtual Method alw ab (I)Ljava/lang/String;
L333:   astore 6
L335:   goto L364

        .stack same
L338:   aload 9
L340:   ldc_w 612036406
L343:   invokevirtual Method alw az (I)Ljava/lang/String;
L346:   astore 5
L348:   iconst_1
L349:   iload 11
L351:   if_icmpne L364
L354:   aload 9
L356:   ldc_w 1946811762
L359:   invokevirtual Method alw az (I)Ljava/lang/String;
L362:   astore 6

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object abl Object alw Integer Integer
            stack
        .end stack
L364:   aload 8
L366:   ldc_w -704935415
L369:   invokevirtual Method abl m (I)V
L372:   goto L382

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer
            stack Object java/io/IOException
        .end stack
L375:   astore 9
L377:   aload 9
L379:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L382:   aload 5
L384:   ifnull L409
L387:   new java/io/File
L390:   dup
L391:   aload 5
L393:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L396:   astore 9
L398:   aload 9
L400:   invokevirtual Method java/io/File exists ()Z
L403:   ifne L409
L406:   aconst_null
L407:   astore 5

        .stack same
L409:   aconst_null
L410:   aload 5
L412:   if_acmpeq L444
L415:   new java/io/File
L418:   dup
L419:   aload 5
L421:   ldc_w "test.dat"
L424:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L427:   astore 9
L429:   aload_0
L430:   aload 9
L432:   iconst_1
L433:   bipush -68
L435:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L438:   ifne L444
L441:   aconst_null
L442:   astore 5

        .stack chop 2
L444:   aconst_null
L445:   aload 5
L447:   if_acmpne L586
L450:   iload_3
L451:   ifne L586
L454:   iconst_0
L455:   istore 8

        .stack append Integer
L457:   iload 8
L459:   getstatic Field la ak [Ljava/lang/String;
L462:   arraylength
L463:   if_icmpge L586
L466:   iconst_0
L467:   istore 9

        .stack append Integer
L469:   iload 9
L471:   getstatic Field y af [Ljava/lang/String;
L474:   arraylength
L475:   if_icmpge L580
L478:   new java/io/File
L481:   dup
L482:   new java/lang/StringBuilder
L485:   dup
L486:   invokespecial Method java/lang/StringBuilder <init> ()V
L489:   getstatic Field y af [Ljava/lang/String;
L492:   iload 9
L494:   aaload
L495:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L498:   getstatic Field la ak [Ljava/lang/String;
L501:   iload 8
L503:   aaload
L504:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L507:   getstatic Field java/io/File separatorChar C
L510:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L513:   aload_1
L514:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L517:   getstatic Field java/io/File separatorChar C
L520:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L523:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L526:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L529:   astore 10
L531:   aload 10
L533:   invokevirtual Method java/io/File exists ()Z
L536:   ifeq L574
L539:   aload_0
L540:   new java/io/File
L543:   dup
L544:   aload 10
L546:   ldc_w "test.dat"
L549:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L552:   iconst_1
L553:   bipush -44
L555:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L558:   ifeq L574
L561:   aload 10
L563:   invokevirtual Method java/io/File toString ()Ljava/lang/String;
L566:   astore 5
L568:   iconst_1
L569:   istore 7
L571:   goto L586

        .stack append Object java/io/File
L574:   iinc 9 1
L577:   goto L469

        .stack chop 1
L580:   iinc 8 1
L583:   goto L457

        .stack chop 2
L586:   aconst_null
L587:   aload 5
L589:   if_acmpne L656
L592:   new java/lang/StringBuilder
L595:   dup
L596:   invokespecial Method java/lang/StringBuilder <init> ()V
L599:   getstatic Field pk by Ljava/lang/String;
L602:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L605:   getstatic Field java/io/File separatorChar C
L608:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L611:   ldc_w "jagexcache"
L614:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L617:   aload 4
L619:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L622:   getstatic Field java/io/File separatorChar C
L625:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L628:   aload_1
L629:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L632:   getstatic Field java/io/File separatorChar C
L635:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L638:   aload_2
L639:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L642:   getstatic Field java/io/File separatorChar C
L645:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L648:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L651:   astore 5
L653:   iconst_1
L654:   istore 7

        .stack same_extended
L656:   aconst_null
L657:   aload 6
L659:   if_acmpeq L770
L662:   new java/io/File
L665:   dup
L666:   aload 6
L668:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L671:   astore 8
L673:   new java/io/File
L676:   dup
L677:   aload 5
L679:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L682:   astore 9
        .catch java/lang/Exception from L684 to L757 using L760
L684:   aload 8
L686:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L689:   astore 10
L691:   aload 10
L693:   astore 11
L695:   iconst_0
L696:   istore 12

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File Object [Ljava/io/File; Object [Ljava/io/File; Integer
            stack
        .end stack
L698:   iload 12
L700:   aload 11
L702:   arraylength
L703:   if_icmpge L757
L706:   aload 11
L708:   iload 12
L710:   aaload
L711:   astore 13
L713:   new java/io/File
L716:   dup
L717:   aload 9
L719:   aload 13
L721:   invokevirtual Method java/io/File getName ()Ljava/lang/String;
L724:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L727:   astore 14
L729:   aload 13
L731:   aload 14
L733:   invokevirtual Method java/io/File renameTo (Ljava/io/File;)Z
L736:   istore 15
L738:   iload 15
L740:   ifne L751
L743:   new java/io/IOException
L746:   dup
L747:   invokespecial Method java/io/IOException <init> ()V
L750:   athrow

        .stack append Object java/io/File Object java/io/File Integer
L751:   iinc 12 1
L754:   goto L698

        .stack chop 3
L757:   goto L767

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File
            stack Object java/lang/Exception
        .end stack
L760:   astore 10
L762:   aload 10
L764:   invokevirtual Method java/lang/Exception printStackTrace ()V

        .stack append Object java/lang/Object
L767:   iconst_1
L768:   istore 7

        .stack chop 3
L770:   iload 7
L772:   ifeq L792
L775:   aload_0
L776:   new java/io/File
L779:   dup
L780:   aload 5
L782:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L785:   aconst_null
L786:   ldc_w -1497248091
L789:   invokevirtual Method sk k (Ljava/io/File;Ljava/io/File;I)V

        .stack same
L792:   new java/io/File
L795:   dup
L796:   aload 5
L798:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L801:   areturn
L802:   
        .linenumbertable
            L0 225
            L31 226
            L85 227
            L88 228
            L91 229
            L94 230
            L103 233
            L120 234
            L138 235
            L156 236
            L195 237
            L209 238
            L225 239
            L228 240
            L234 241
            L244 242
            L284 243
            L287 244
            L303 245
            L309 246
            L319 247
            L338 250
            L348 251
            L364 253
            L372 257
            L375 255
            L377 256
            L382 258
            L387 259
            L398 260
            L406 261
            L409 264
            L415 265
            L429 266
            L441 267
            L444 271
            L454 272
            L466 273
            L478 274
            L531 275
            L539 276
            L561 277
            L568 278
            L571 279
            L574 273
            L580 272
            L586 285
            L592 286
            L653 287
            L656 289
            L662 290
            L673 291
            L684 293
            L691 295
            L695 296
            L706 297
            L713 299
            L729 300
            L738 301
            L751 296
            L757 308
            L760 306
            L762 307
            L767 309
            L770 311
            L792 312
        .end linenumbertable
    .end code
.end method

.method public v : ()V
    .code stack 3 locals 3
        .catch java/lang/ThreadDeath from L0 to L7 using L18
        .catch java/lang/Throwable from L0 to L7 using L21
        .catch [0] from L0 to L7 using L56
L0:     aload_0
L1:     ldc_w 76237799
L4:     invokevirtual Method sk h (I)V
L7:     aload_0
L8:     iconst_1
L9:     ldc_w -1507795961
L12:    invokevirtual Method sk t (ZI)V
L15:    goto L67
        .catch [0] from L18 to L45 using L56

        .stack stack_1 Object java/lang/ThreadDeath
L18:    astore_1
L19:    aload_1
L20:    athrow

        .stack stack_1 Object java/lang/Throwable
L21:    astore_1
L22:    aload_0
L23:    bipush 65
L25:    invokevirtual Method sk j (B)Ljava/lang/String;
L28:    aload_1
L29:    ldc_w 661422765
L32:    invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L35:    aload_0
L36:    ldc_w "crash"
L39:    ldc_w -582446019
L42:    invokevirtual Method sk ad (Ljava/lang/String;I)V
L45:    aload_0
L46:    iconst_1
L47:    ldc_w -216665316
L50:    invokevirtual Method sk t (ZI)V
L53:    goto L67
        .catch [0] from L56 to L57 using L56

        .stack stack_1 Object java/lang/Throwable
L56:    astore_2
L57:    aload_0
L58:    iconst_1
L59:    ldc_w -1331069602
L62:    invokevirtual Method sk t (ZI)V
L65:    aload_2
L66:    athrow

        .stack same
L67:    return
L68:    
        .linenumbertable
            L0 506
            L7 516
            L15 517
            L18 508
            L19 509
            L21 511
            L22 512
            L35 513
            L45 516
            L53 517
            L56 516
            L67 519
        .end linenumbertable
    .end code
.end method

.method bi : (Ljava/io/File;Ljava/io/File;)V
    .code stack 6 locals 5
        .catch java/io/IOException from L0 to L111 using L114
L0:     new abl
L3:     dup
L4:     getstatic Field sk au Ljava/io/File;
L7:     ldc "rw"
L9:     ldc2_w 10000L
L12:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L15:    astore_3
L16:    new alw
L19:    dup
L20:    sipush 500
L23:    invokespecial Method alw <init> (I)V
L26:    astore 4
L28:    aload 4
L30:    iconst_3
L31:    bipush -6
L33:    invokevirtual Method alw k (IB)V
L36:    aload 4
L38:    aconst_null
L39:    aload_2
L40:    if_acmpeq L47
L43:    iconst_1
L44:    goto L48

        .stack full
            locals Object sk Object java/io/File Object java/io/File Object abl Object alw
            stack Object alw
        .end stack
L47:    iconst_0

        .stack full
            locals Object sk Object java/io/File Object java/io/File Object abl Object alw
            stack Object alw Integer
        .end stack
L48:    bipush -118
L50:    invokevirtual Method alw k (IB)V
L53:    aload 4
L55:    aload_1
L56:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L59:    ldc_w -1489303680
L62:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V
L65:    aconst_null
L66:    aload_2
L67:    if_acmpeq L82
L70:    aload 4
L72:    aload_2
L73:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L76:    ldc_w -1489303680
L79:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V

        .stack same
L82:    aload_3
L83:    aload 4
L85:    getfield Field alw w [B
L88:    iconst_0
L89:    ldc_w 212851357
L92:    aload 4
L94:    getfield Field alw l I
L97:    imul
L98:    ldc_w -1708741302
L101:   invokevirtual Method abl n ([BIII)V
L104:   aload_3
L105:   ldc_w -457505000
L108:   invokevirtual Method abl m (I)V
L111:   goto L121

        .stack full
            locals Object sk Object java/io/File Object java/io/File
            stack Object java/io/IOException
        .end stack
L114:   astore 4
L116:   aload 4
L118:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L121:   return
L122:   
        .linenumbertable
            L0 318
            L16 319
            L28 320
            L36 321
            L53 322
            L65 323
            L82 324
            L104 325
            L111 329
            L114 327
            L116 328
            L121 330
        .end linenumbertable
    .end code
.end method

.method public static dg : ()Lsm;
    .code stack 1 locals 0
L0:     getstatic Field sk bl Lsm;
L3:     areturn
L4:     
        .linenumbertable
            L0 838
        .end linenumbertable
    .end code
.end method

.method public static bt : (Ljava/lang/String;Ljava/lang/String;Z)Labl;
    .code stack 6 locals 7
L0:     new java/io/File
L3:     dup
L4:     getstatic Field sx ar Ljava/io/File;
L7:     new java/lang/StringBuilder
L10:    dup
L11:    invokespecial Method java/lang/StringBuilder <init> ()V
L14:    ldc_w "preferences"
L17:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L20:    aload_0
L21:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L24:    ldc_w ".dat"
L27:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L30:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L33:    invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L36:    astore_3
L37:    aload_3
L38:    invokevirtual Method java/io/File exists ()Z
L41:    ifeq L64
        .catch java/io/IOException from L44 to L61 using L62
L44:    new abl
L47:    dup
L48:    aload_3
L49:    ldc "rw"
L51:    ldc2_w 10000L
L54:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L57:    astore 4
L59:    aload 4
L61:    areturn

        .stack full
            locals Object java/lang/String Object java/lang/String Integer Object java/io/File
            stack Object java/io/IOException
        .end stack
L62:    astore 4

        .stack same
L64:    ldc ""
L66:    astore 4
L68:    bipush 33
L70:    ldc_w -1839644543
L73:    getstatic Field jr aa I
L76:    imul
L77:    if_icmpne L88
L80:    ldc_w "_rc"
L83:    astore 4
L85:    goto L105

        .stack append Object java/lang/String
L88:    bipush 34
L90:    getstatic Field jr aa I
L93:    ldc_w -1839644543
L96:    imul
L97:    if_icmpne L105
L100:   ldc_w "_wip"
L103:   astore 4

        .stack same
L105:   new java/io/File
L108:   dup
L109:   getstatic Field pk by Ljava/lang/String;
L112:   new java/lang/StringBuilder
L115:   dup
L116:   invokespecial Method java/lang/StringBuilder <init> ()V
L119:   ldc_w "jagex_"
L122:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L125:   aload_1
L126:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L129:   ldc_w "_preferences"
L132:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L135:   aload_0
L136:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L139:   aload 4
L141:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L144:   ldc_w ".dat"
L147:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L150:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L153:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L156:   astore 5
L158:   iload_2
L159:   ifne L191
L162:   aload 5
L164:   invokevirtual Method java/io/File exists ()Z
L167:   ifeq L191
        .catch java/io/IOException from L170 to L188 using L189
L170:   new abl
L173:   dup
L174:   aload 5
L176:   ldc "rw"
L178:   ldc2_w 10000L
L181:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L184:   astore 6
L186:   aload 6
L188:   areturn

        .stack full
            locals Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/lang/String Object java/io/File
            stack Object java/io/IOException
        .end stack
L189:   astore 6
        .catch java/io/IOException from L191 to L208 using L209

        .stack same
L191:   new abl
L194:   dup
L195:   aload_3
L196:   ldc "rw"
L198:   ldc2_w 10000L
L201:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L204:   astore 6
L206:   aload 6
L208:   areturn

        .stack stack_1 Object java/io/IOException
L209:   astore 6
L211:   new java/lang/RuntimeException
L214:   dup
L215:   invokespecial Method java/lang/RuntimeException <init> ()V
L218:   athrow
L219:   
        .linenumbertable
            L0 353
            L37 354
            L44 356
            L59 357
            L62 359
            L64 361
            L68 362
            L88 363
            L105 364
            L158 365
            L170 367
            L186 368
            L189 370
            L191 373
            L206 374
            L209 376
            L211 377
        .end linenumbertable
    .end code
.end method

.method public final synchronized ck : (Ljava/awt/Graphics;)V
    .code stack 6 locals 3
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     iconst_1
L8:     putstatic Field sk j Z
L11:    ldc_w 648936748
L14:    invokestatic Method gz e (I)J
L17:    getstatic Field sk ah J
L20:    ldc2_w -8866144438303274951L
L23:    lmul
L24:    lsub
L25:    ldc2_w 1000L
L28:    lcmp
L29:    ifle L74
L32:    aload_1
L33:    invokevirtual Method java/awt/Graphics getClipBounds ()Ljava/awt/Rectangle;
L36:    astore_2
L37:    aconst_null
L38:    aload_2
L39:    if_acmpeq L70
L42:    aload_2
L43:    getfield Field java/awt/Rectangle width I
L46:    getstatic Field sk d I
L49:    ldc_w -108363597
L52:    imul
L53:    if_icmplt L74
L56:    aload_2
L57:    getfield Field java/awt/Rectangle height I
L60:    ldc_w 2090134413
L63:    getstatic Field qf c I
L66:    imul
L67:    if_icmplt L74

        .stack append Object java/awt/Rectangle
L70:    iconst_1
L71:    putstatic Field sk ag Z

        .stack chop 1
L74:    return
L75:    
        .linenumbertable
            L0 681
            L7 682
            L11 683
            L32 684
            L37 685
            L74 687
        .end linenumbertable
    .end code
.end method

.method public final dm : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 706
        .end linenumbertable
    .end code
.end method

.method public static bb : (Lalw;)V
    .code stack 5 locals 4
L0:     bipush 24
L2:     newarray byte
L4:     astore_1
        .catch java/lang/Exception from L5 to L60 using L63
L5:     getstatic Field sk aj Labp;
L8:     lconst_0
L9:     invokevirtual Method abp n (J)V
L12:    getstatic Field sk aj Labp;
L15:    aload_1
L16:    ldc_w -1632071155
L19:    invokevirtual Method abp k ([BI)V
L22:    iconst_0
L23:    istore_2

        .stack append Object [B Integer
L24:    iload_2
L25:    bipush 24
L27:    if_icmpge L46
L30:    iconst_0
L31:    aload_1
L32:    iload_2
L33:    baload
L34:    if_icmpeq L40
L37:    goto L46

        .stack same
L40:    iinc 2 1
L43:    goto L24

        .stack same
L46:    iload_2
L47:    bipush 24
L49:    if_icmplt L60
L52:    new java/io/IOException
L55:    dup
L56:    invokespecial Method java/io/IOException <init> ()V
L59:    athrow

        .stack same
L60:    goto L82

        .stack full
            locals Object alw Object [B
            stack Object java/lang/Exception
        .end stack
L63:    astore_2
L64:    iconst_0
L65:    istore_3

        .stack append Object java/lang/Exception Integer
L66:    iload_3
L67:    bipush 24
L69:    if_icmpge L82
L72:    aload_1
L73:    iload_3
L74:    iconst_m1
L75:    bastore
L76:    iinc 3 1
L79:    goto L66

        .stack chop 2
L82:    aload_0
L83:    aload_1
L84:    iconst_0
L85:    bipush 24
L87:    ldc_w 2026842986
L90:    invokevirtual Method alw i ([BIII)V
L93:    return
L94:    
        .linenumbertable
            L0 411
            L5 413
            L12 414
            L22 415
            L24 416
            L30 417
            L40 416
            L46 419
            L60 423
            L63 421
            L64 422
            L82 424
            L93 425
        .end linenumbertable
    .end code
.end method

.method public final update : (Ljava/awt/Graphics;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L6 using L6
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method sk paint (Ljava/awt/Graphics;)V
L5:     return

        .stack stack_1 Object java/lang/RuntimeException
L6:     new java/lang/StringBuilder
L9:     dup
L10:    invokespecial Method java/lang/StringBuilder <init> ()V
L13:    ldc_w "sk.update("
L16:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L19:    ldc 41
L21:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L24:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L27:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L30:    athrow
L31:    
        .linenumbertable
            L0 677
            L5 678
        .end linenumbertable
    .end code
.end method

.method static by : (Lalw;I)V
    .code stack 5 locals 3
L0:     aconst_null
L1:     getstatic Field sk aj Labp;
L4:     if_acmpeq L34
        .catch java/lang/Exception from L7 to L30 using L33
L7:     getstatic Field sk aj Labp;
L10:    lconst_0
L11:    invokevirtual Method abp n (J)V
L14:    getstatic Field sk aj Labp;
L17:    aload_0
L18:    getfield Field alw w [B
L21:    iload_1
L22:    bipush 24
L24:    ldc_w 1612784751
L27:    invokevirtual Method abp l ([BIII)V
L30:    goto L34

        .stack stack_1 Object java/lang/Exception
L33:    astore_2

        .stack same
L34:    return
L35:    
        .linenumbertable
            L0 428
            L7 430
            L14 431
            L30 433
            L34 435
        .end linenumbertable
    .end code
.end method

.method synchronized bu : (Ljava/lang/String;)V
    .code stack 6 locals 3
L0:     new java/awt/Frame
L3:     dup
L4:     invokespecial Method java/awt/Frame <init> ()V
L7:     putstatic Field vy h Ljava/awt/Frame;
L10:    getstatic Field vy h Ljava/awt/Frame;
L13:    aload_1
L14:    invokevirtual Method java/awt/Frame setTitle (Ljava/lang/String;)V
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    iconst_1
L21:    invokevirtual Method java/awt/Frame setResizable (Z)V
L24:    getstatic Field vy h Ljava/awt/Frame;
L27:    aload_0
L28:    invokevirtual Method java/awt/Frame addWindowListener (Ljava/awt/event/WindowListener;)V
L31:    getstatic Field vy h Ljava/awt/Frame;
L34:    getstatic Field java/awt/Color black Ljava/awt/Color;
L37:    invokevirtual Method java/awt/Frame setBackground (Ljava/awt/Color;)V
L40:    getstatic Field vy h Ljava/awt/Frame;
L43:    iconst_1
L44:    invokevirtual Method java/awt/Frame setVisible (Z)V
L47:    getstatic Field vy h Ljava/awt/Frame;
L50:    invokevirtual Method java/awt/Frame toFront ()V
L53:    getstatic Field vy h Ljava/awt/Frame;
L56:    invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L59:    astore_2
L60:    getstatic Field vy h Ljava/awt/Frame;
L63:    getstatic Field sk d I
L66:    ldc_w -108363597
L69:    imul
L70:    aload_2
L71:    getfield Field java/awt/Insets left I
L74:    iadd
L75:    aload_2
L76:    getfield Field java/awt/Insets right I
L79:    iadd
L80:    aload_2
L81:    getfield Field java/awt/Insets bottom I
L84:    aload_2
L85:    getfield Field java/awt/Insets top I
L88:    getstatic Field qf c I
L91:    ldc_w 2090134413
L94:    imul
L95:    iadd
L96:    iadd
L97:    invokevirtual Method java/awt/Frame setSize (II)V
L100:   return
L101:   
        .linenumbertable
            L0 438
            L10 439
            L17 440
            L24 441
            L31 442
            L40 443
            L47 444
            L53 445
            L60 446
            L100 447
        .end linenumbertable
    .end code
.end method

.method synchronized bw : (Ljava/lang/String;)V
    .code stack 6 locals 3
L0:     new java/awt/Frame
L3:     dup
L4:     invokespecial Method java/awt/Frame <init> ()V
L7:     putstatic Field vy h Ljava/awt/Frame;
L10:    getstatic Field vy h Ljava/awt/Frame;
L13:    aload_1
L14:    invokevirtual Method java/awt/Frame setTitle (Ljava/lang/String;)V
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    iconst_1
L21:    invokevirtual Method java/awt/Frame setResizable (Z)V
L24:    getstatic Field vy h Ljava/awt/Frame;
L27:    aload_0
L28:    invokevirtual Method java/awt/Frame addWindowListener (Ljava/awt/event/WindowListener;)V
L31:    getstatic Field vy h Ljava/awt/Frame;
L34:    getstatic Field java/awt/Color black Ljava/awt/Color;
L37:    invokevirtual Method java/awt/Frame setBackground (Ljava/awt/Color;)V
L40:    getstatic Field vy h Ljava/awt/Frame;
L43:    iconst_1
L44:    invokevirtual Method java/awt/Frame setVisible (Z)V
L47:    getstatic Field vy h Ljava/awt/Frame;
L50:    invokevirtual Method java/awt/Frame toFront ()V
L53:    getstatic Field vy h Ljava/awt/Frame;
L56:    invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L59:    astore_2
L60:    getstatic Field vy h Ljava/awt/Frame;
L63:    getstatic Field sk d I
L66:    ldc_w -108363597
L69:    imul
L70:    aload_2
L71:    getfield Field java/awt/Insets left I
L74:    iadd
L75:    aload_2
L76:    getfield Field java/awt/Insets right I
L79:    iadd
L80:    aload_2
L81:    getfield Field java/awt/Insets bottom I
L84:    aload_2
L85:    getfield Field java/awt/Insets top I
L88:    getstatic Field qf c I
L91:    ldc_w 2090134413
L94:    imul
L95:    iadd
L96:    iadd
L97:    invokevirtual Method java/awt/Frame setSize (II)V
L100:   return
L101:   
        .linenumbertable
            L0 438
            L10 439
            L17 440
            L24 441
            L31 442
            L40 443
            L47 444
            L53 445
            L60 446
            L100 447
        .end linenumbertable
    .end code
.end method

.method public static bz : ()Ljava/awt/Container;
    .code stack 2 locals 0
L0:     getstatic Field aqy a Ljava/awt/Frame;
L3:     ifnull L10
L6:     getstatic Field aqy a Ljava/awt/Frame;
L9:     areturn

        .stack same
L10:    aconst_null
L11:    getstatic Field vy h Ljava/awt/Frame;
L14:    if_acmpeq L21
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    areturn

        .stack same
L21:    getstatic Field aol i Ljava/applet/Applet;
L24:    areturn
L25:    
        .linenumbertable
            L0 457
            L10 458
            L21 459
        .end linenumbertable
    .end code
.end method

.method final t : (ZI)V
    .code stack 3 locals 5
L0:     aload_0
L1:     dup
L2:     astore_3
L3:     monitorenter
        .catch [0] from L4 to L12 using L22
L4:     getstatic Field sk bh Z
L7:     ifeq L13
L10:    aload_3
L11:    monitorexit
L12:    return
        .catch [0] from L13 to L19 using L22

        .stack append Object sk
L13:    iconst_1
L14:    putstatic Field sk bh Z
L17:    aload_3
L18:    monitorexit
L19:    goto L29
        .catch [0] from L22 to L26 using L22

        .stack stack_1 Object java/lang/Throwable
L22:    astore 4
L24:    aload_3
L25:    monitorexit
L26:    aload 4
L28:    athrow
        .catch java/lang/Exception from L29 to L35 using L38

        .stack same
L29:    aload_0
L30:    bipush -103
L32:    invokevirtual Method sk aw (B)V
L35:    goto L39

        .stack stack_1 Object java/lang/Exception
L38:    astore_3
        .catch java/lang/Exception from L39 to L96 using L99

        .stack full
            locals Object sk Integer Integer Object java/lang/Object
            stack
        .end stack
L39:    getstatic Field sk ay Labp;
L42:    ldc_w 1216916480
L45:    invokevirtual Method abp e (I)V
L48:    iconst_0
L49:    istore_3

        .stack full
            locals Object sk Integer Integer Integer
            stack
        .end stack
L50:    iload_3
L51:    ldc_w 694777127
L54:    getstatic Field b ap I
L57:    imul
L58:    if_icmpge L78
L61:    getstatic Field vs az [Labp;
L64:    iload_3
L65:    aaload
L66:    ldc_w 1216916480
L69:    invokevirtual Method abp e (I)V
L72:    iinc 3 1
L75:    goto L50

        .stack same
L78:    getstatic Field sk ab Labp;
L81:    ldc_w 1216916480
L84:    invokevirtual Method abp e (I)V
L87:    getstatic Field sk aj Labp;
L90:    ldc_w 1216916480
L93:    invokevirtual Method abp e (I)V
L96:    goto L100

        .stack full
            locals Object sk Integer Integer
            stack Object java/lang/Exception
        .end stack
L99:    astore_3

        .stack same
L100:   aload_0
L101:   getfield Field sk bi Z
L104:   ifeq L114
        .catch java/lang/Throwable from L107 to L110 using L113
L107:   invokestatic Method jaclib/nanotime/QueryPerformanceCounter quit ()V
L110:   goto L114

        .stack stack_1 Object java/lang/Throwable
L113:   astore_3

        .stack same
L114:   ldc_w 628717055
L117:   invokestatic Method aah m (I)Z
L120:   ifeq L138
L123:   ldc_w 672839876
L126:   invokestatic Method ke n (I)Lrn;
L129:   ldc_w -998187544
L132:   invokeinterface InterfaceMethod rn m (I)Z 2
L137:   pop

        .stack same
L138:   getstatic Field ahs g Ljava/awt/Canvas;
L141:   ifnull L167
        .catch java/lang/Exception from L144 to L163 using L166
        .catch java/lang/RuntimeException from L0 to L192 using L192
L144:   getstatic Field ahs g Ljava/awt/Canvas;
L147:   aload_0
L148:   invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L151:   getstatic Field ahs g Ljava/awt/Canvas;
L154:   invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L157:   getstatic Field ahs g Ljava/awt/Canvas;
L160:   invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V
L163:   goto L167

        .stack stack_1 Object java/lang/Exception
L166:   astore_3

        .stack same
L167:   aconst_null
L168:   getstatic Field vy h Ljava/awt/Frame;
L171:   if_acmpeq L191
L174:   getstatic Field vy h Ljava/awt/Frame;
L177:   iconst_0
L178:   invokevirtual Method java/awt/Frame setVisible (Z)V
L181:   getstatic Field vy h Ljava/awt/Frame;
L184:   invokevirtual Method java/awt/Frame dispose ()V
L187:   aconst_null
L188:   putstatic Field vy h Ljava/awt/Frame;

        .stack same
L191:   return

        .stack stack_1 Object java/lang/RuntimeException
L192:   new java/lang/StringBuilder
L195:   dup
L196:   invokespecial Method java/lang/StringBuilder <init> ()V
L199:   ldc_w "sk.t("
L202:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L205:   ldc 41
L207:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L210:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L213:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L216:   athrow
L217:   
        .linenumbertable
            L0 606
            L4 607
            L13 608
            L17 609
            L29 611
            L35 613
            L39 615
            L48 616
            L78 617
            L87 618
            L96 620
            L100 621
            L107 623
            L110 625
            L114 628
            L138 630
            L144 632
            L151 633
            L163 635
            L167 637
            L174 638
            L181 639
            L187 640
            L191 642
        .end linenumbertable
    .end code
.end method

.method abstract ab : ()V
.end method

.method ad : (Ljava/lang/String;I)V
    .code stack 6 locals 4
L0:     aload_0
L1:     getfield Field sk bx Z
L4:     ifeq L8
L7:     return

        .stack same
L8:     aload_0
L9:     iconst_1
L10:    putfield Field sk bx Z
L13:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L16:    new java/lang/StringBuilder
L19:    dup
L20:    invokespecial Method java/lang/StringBuilder <init> ()V
L23:    ldc_w "error_game_"
L26:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L29:    aload_1
L30:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L33:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L36:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/lang/Throwable from L39 to L52 using L55
L39:    getstatic Field aol i Ljava/applet/Applet;
L42:    ldc_w "loggedout"
L45:    ldc_w 1946669565
L48:    invokestatic Method act n (Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;
L51:    pop
L52:    goto L56

        .stack stack_1 Object java/lang/Throwable
L55:    astore_3
        .catch java/lang/Exception from L56 to L109 using L112
        .catch java/lang/RuntimeException from L0 to L114 using L114

        .stack same
L56:    getstatic Field aol i Ljava/applet/Applet;
L59:    invokevirtual Method java/applet/Applet getAppletContext ()Ljava/applet/AppletContext;
L62:    new java/net/URL
L65:    dup
L66:    getstatic Field aol i Ljava/applet/Applet;
L69:    invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L72:    new java/lang/StringBuilder
L75:    dup
L76:    invokespecial Method java/lang/StringBuilder <init> ()V
L79:    ldc_w "error_game_"
L82:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L85:    aload_1
L86:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L89:    ldc_w ".ws"
L92:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L95:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L98:    invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L101:   ldc_w "_top"
L104:   invokeinterface InterfaceMethod java/applet/AppletContext showDocument (Ljava/net/URL;Ljava/lang/String;)V 3
L109:   goto L113

        .stack stack_1 Object java/lang/Exception
L112:   astore_3

        .stack same
L113:   return

        .stack stack_1 Object java/lang/RuntimeException
L114:   new java/lang/StringBuilder
L117:   dup
L118:   invokespecial Method java/lang/StringBuilder <init> ()V
L121:   ldc_w "sk.ad("
L124:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L127:   ldc 41
L129:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L132:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L135:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L138:   athrow
L139:   
        .linenumbertable
            L0 782
            L8 783
            L13 784
            L39 786
            L52 788
            L56 790
            L109 792
            L113 793
        .end linenumbertable
    .end code
.end method

.method bg : (Ljava/awt/Container;)V
    .code stack 5 locals 3
L0:     aload_1
L1:     getstatic Field java/awt/Color black Ljava/awt/Color;
L4:     invokevirtual Method java/awt/Container setBackground (Ljava/awt/Color;)V
L7:     aload_1
L8:     aconst_null
L9:     invokevirtual Method java/awt/Container setLayout (Ljava/awt/LayoutManager;)V
L12:    aload_1
L13:    getstatic Field ahs g Ljava/awt/Canvas;
L16:    invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L19:    pop
L20:    getstatic Field ahs g Ljava/awt/Canvas;
L23:    ldc_w -1378711501
L26:    getstatic Field sk r I
L29:    imul
L30:    getstatic Field sk v I
L33:    ldc_w 2091353777
L36:    imul
L37:    invokevirtual Method java/awt/Canvas setSize (II)V
L40:    getstatic Field ahs g Ljava/awt/Canvas;
L43:    iconst_1
L44:    invokevirtual Method java/awt/Canvas setVisible (Z)V
L47:    getstatic Field vy h Ljava/awt/Frame;
L50:    aload_1
L51:    if_acmpne L94
L54:    getstatic Field vy h Ljava/awt/Frame;
L57:    invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L60:    astore_2
L61:    getstatic Field ahs g Ljava/awt/Canvas;
L64:    aload_2
L65:    getfield Field java/awt/Insets left I
L68:    ldc_w 495533241
L71:    getstatic Field sk y I
L74:    imul
L75:    iadd
L76:    aload_2
L77:    getfield Field java/awt/Insets top I
L80:    ldc_w -1074927711
L83:    getstatic Field sk q I
L86:    imul
L87:    iadd
L88:    invokevirtual Method java/awt/Canvas setLocation (II)V
L91:    goto L114

        .stack same_extended
L94:    getstatic Field ahs g Ljava/awt/Canvas;
L97:    ldc_w 495533241
L100:   getstatic Field sk y I
L103:   imul
L104:   ldc_w -1074927711
L107:   getstatic Field sk q I
L110:   imul
L111:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L114:   getstatic Field ahs g Ljava/awt/Canvas;
L117:   aload_0
L118:   invokevirtual Method java/awt/Canvas addFocusListener (Ljava/awt/event/FocusListener;)V
L121:   getstatic Field ahs g Ljava/awt/Canvas;
L124:   invokevirtual Method java/awt/Canvas requestFocus ()V
L127:   iconst_1
L128:   putstatic Field aar aw Z
L131:   iconst_1
L132:   putstatic Field sk ai Z
L135:   getstatic Field ahs g Ljava/awt/Canvas;
L138:   iconst_0
L139:   invokevirtual Method java/awt/Canvas setFocusTraversalKeysEnabled (Z)V
L142:   iconst_1
L143:   putstatic Field sk j Z
L146:   iconst_0
L147:   putstatic Field sk ag Z
L150:   ldc_w 1219722229
L153:   invokestatic Method gz e (I)J
L156:   ldc2_w -4981684860522027511L
L159:   lmul
L160:   putstatic Field sk ah J
L163:   return
L164:   
        .linenumbertable
            L0 463
            L7 464
            L12 465
            L20 466
            L40 467
            L47 468
            L54 469
            L61 470
            L91 471
            L94 472
            L114 473
            L121 474
            L127 475
            L131 476
            L135 477
            L142 478
            L146 479
            L150 480
            L163 481
        .end linenumbertable
    .end code
.end method

.method public final dz : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 706
        .end linenumbertable
    .end code
.end method

.method bp : ()V
    .code stack 2 locals 1
L0:     getstatic Field ahs g Ljava/awt/Canvas;
L3:     ifnull L37
L6:     getstatic Field ahs g Ljava/awt/Canvas;
L9:     aload_0
L10:    invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L13:    getstatic Field ahs g Ljava/awt/Canvas;
L16:    invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L19:    getstatic Field java/awt/Color black Ljava/awt/Color;
L22:    invokevirtual Method java/awt/Container setBackground (Ljava/awt/Color;)V
L25:    getstatic Field ahs g Ljava/awt/Canvas;
L28:    invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L31:    getstatic Field ahs g Ljava/awt/Canvas;
L34:    invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V

        .stack same
L37:    return
L38:    
        .linenumbertable
            L0 484
            L6 485
            L13 486
            L25 487
            L37 489
        .end linenumbertable
    .end code
.end method

.method abstract aj : ()V
.end method

.method bx : (Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;
    .code stack 6 locals 16
L0:     iconst_0
L1:     iload_3
L2:     if_icmpne L10
L5:     ldc ""
L7:     goto L29

        .stack same
L10:    new java/lang/StringBuilder
L13:    dup
L14:    invokespecial Method java/lang/StringBuilder <init> ()V
L17:    ldc ""
L19:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L22:    iload_3
L23:    invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L26:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;

        .stack stack_1 Object java/lang/String
L29:    astore 4
L31:    new java/io/File
L34:    dup
L35:    getstatic Field pk by Ljava/lang/String;
L38:    new java/lang/StringBuilder
L41:    dup
L42:    invokespecial Method java/lang/StringBuilder <init> ()V
L45:    ldc_w "jagex_cl_"
L48:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L51:    aload_1
L52:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L55:    ldc_w "_"
L58:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L61:    aload_2
L62:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L65:    aload 4
L67:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L70:    ldc_w ".dat"
L73:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L76:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L79:    invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L82:    putstatic Field sk au Ljava/io/File;
L85:    aconst_null
L86:    astore 5
L88:    aconst_null
L89:    astore 6
L91:    iconst_0
L92:    istore 7
L94:    getstatic Field sk au Ljava/io/File;
L97:    invokevirtual Method java/io/File exists ()Z
L100:   ifeq L444
        .catch java/io/IOException from L103 to L372 using L375
L103:   new abl
L106:   dup
L107:   getstatic Field sk au Ljava/io/File;
L110:   ldc "rw"
L112:   ldc2_w 10000L
L115:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L118:   astore 8
L120:   new alw
L123:   dup
L124:   aload 8
L126:   ldc_w 1265194522
L129:   invokevirtual Method abl f (I)J
L132:   l2i
L133:   invokespecial Method alw <init> (I)V
L136:   astore 9

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Null Null Integer Object abl Object alw
            stack
        .end stack
L138:   ldc_w 212851357
L141:   aload 9
L143:   getfield Field alw l I
L146:   imul
L147:   aload 9
L149:   getfield Field alw w [B
L152:   arraylength
L153:   if_icmpge L228
L156:   aload 8
L158:   aload 9
L160:   getfield Field alw w [B
L163:   ldc_w 212851357
L166:   aload 9
L168:   getfield Field alw l I
L171:   imul
L172:   aload 9
L174:   getfield Field alw w [B
L177:   arraylength
L178:   ldc_w 212851357
L181:   aload 9
L183:   getfield Field alw l I
L186:   imul
L187:   isub
L188:   bipush -26
L190:   invokevirtual Method abl w ([BIIB)I
L193:   istore 10
L195:   iconst_m1
L196:   iload 10
L198:   if_icmpne L209
L201:   new java/io/IOException
L204:   dup
L205:   invokespecial Method java/io/IOException <init> ()V
L208:   athrow

        .stack append Integer
L209:   aload 9
L211:   dup
L212:   getfield Field alw l I
L215:   iload 10
L217:   ldc_w -1445626955
L220:   imul
L221:   iadd
L222:   putfield Field alw l I
L225:   goto L138

        .stack chop 1
L228:   aload 9
L230:   iconst_0
L231:   putfield Field alw l I
L234:   aload 9
L236:   sipush 16384
L239:   invokevirtual Method alw ai (S)I
L242:   istore 10
L244:   iload 10
L246:   iconst_1
L247:   if_icmplt L256
L250:   iload 10
L252:   iconst_3
L253:   if_icmple L284

        .stack append Integer
L256:   new java/io/IOException
L259:   dup
L260:   new java/lang/StringBuilder
L263:   dup
L264:   invokespecial Method java/lang/StringBuilder <init> ()V
L267:   ldc ""
L269:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L272:   iload 10
L274:   invokevirtual Method java/lang/StringBuilder append (I)Ljava/lang/StringBuilder;
L277:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L280:   invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L283:   athrow

        .stack same
L284:   iconst_0
L285:   istore 11
L287:   iload 10
L289:   iconst_1
L290:   if_icmple L303
L293:   aload 9
L295:   sipush 16384
L298:   invokevirtual Method alw ai (S)I
L301:   istore 11

        .stack append Integer
L303:   iload 10
L305:   iconst_2
L306:   if_icmpgt L338
L309:   aload 9
L311:   ldc_w 1569283594
L314:   invokevirtual Method alw ab (I)Ljava/lang/String;
L317:   astore 5
L319:   iconst_1
L320:   iload 11
L322:   if_icmpne L364
L325:   aload 9
L327:   ldc_w -213334342
L330:   invokevirtual Method alw ab (I)Ljava/lang/String;
L333:   astore 6
L335:   goto L364

        .stack same
L338:   aload 9
L340:   ldc_w 757385102
L343:   invokevirtual Method alw az (I)Ljava/lang/String;
L346:   astore 5
L348:   iconst_1
L349:   iload 11
L351:   if_icmpne L364
L354:   aload 9
L356:   ldc_w 321840681
L359:   invokevirtual Method alw az (I)Ljava/lang/String;
L362:   astore 6

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object abl Object alw Integer Integer
            stack
        .end stack
L364:   aload 8
L366:   ldc_w 871620613
L369:   invokevirtual Method abl m (I)V
L372:   goto L382

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer
            stack Object java/io/IOException
        .end stack
L375:   astore 9
L377:   aload 9
L379:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L382:   aload 5
L384:   ifnull L409
L387:   new java/io/File
L390:   dup
L391:   aload 5
L393:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L396:   astore 9
L398:   aload 9
L400:   invokevirtual Method java/io/File exists ()Z
L403:   ifne L409
L406:   aconst_null
L407:   astore 5

        .stack same
L409:   aconst_null
L410:   aload 5
L412:   if_acmpeq L444
L415:   new java/io/File
L418:   dup
L419:   aload 5
L421:   ldc_w "test.dat"
L424:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L427:   astore 9
L429:   aload_0
L430:   aload 9
L432:   iconst_1
L433:   bipush -98
L435:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L438:   ifne L444
L441:   aconst_null
L442:   astore 5

        .stack chop 2
L444:   aconst_null
L445:   aload 5
L447:   if_acmpne L586
L450:   iload_3
L451:   ifne L586
L454:   iconst_0
L455:   istore 8

        .stack append Integer
L457:   iload 8
L459:   getstatic Field la ak [Ljava/lang/String;
L462:   arraylength
L463:   if_icmpge L586
L466:   iconst_0
L467:   istore 9

        .stack append Integer
L469:   iload 9
L471:   getstatic Field y af [Ljava/lang/String;
L474:   arraylength
L475:   if_icmpge L580
L478:   new java/io/File
L481:   dup
L482:   new java/lang/StringBuilder
L485:   dup
L486:   invokespecial Method java/lang/StringBuilder <init> ()V
L489:   getstatic Field y af [Ljava/lang/String;
L492:   iload 9
L494:   aaload
L495:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L498:   getstatic Field la ak [Ljava/lang/String;
L501:   iload 8
L503:   aaload
L504:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L507:   getstatic Field java/io/File separatorChar C
L510:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L513:   aload_1
L514:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L517:   getstatic Field java/io/File separatorChar C
L520:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L523:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L526:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L529:   astore 10
L531:   aload 10
L533:   invokevirtual Method java/io/File exists ()Z
L536:   ifeq L574
L539:   aload_0
L540:   new java/io/File
L543:   dup
L544:   aload 10
L546:   ldc_w "test.dat"
L549:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L552:   iconst_1
L553:   bipush -118
L555:   invokevirtual Method sk f (Ljava/io/File;ZB)Z
L558:   ifeq L574
L561:   aload 10
L563:   invokevirtual Method java/io/File toString ()Ljava/lang/String;
L566:   astore 5
L568:   iconst_1
L569:   istore 7
L571:   goto L586

        .stack append Object java/io/File
L574:   iinc 9 1
L577:   goto L469

        .stack chop 1
L580:   iinc 8 1
L583:   goto L457

        .stack chop 2
L586:   aconst_null
L587:   aload 5
L589:   if_acmpne L656
L592:   new java/lang/StringBuilder
L595:   dup
L596:   invokespecial Method java/lang/StringBuilder <init> ()V
L599:   getstatic Field pk by Ljava/lang/String;
L602:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L605:   getstatic Field java/io/File separatorChar C
L608:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L611:   ldc_w "jagexcache"
L614:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L617:   aload 4
L619:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L622:   getstatic Field java/io/File separatorChar C
L625:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L628:   aload_1
L629:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L632:   getstatic Field java/io/File separatorChar C
L635:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L638:   aload_2
L639:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L642:   getstatic Field java/io/File separatorChar C
L645:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L648:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L651:   astore 5
L653:   iconst_1
L654:   istore 7

        .stack same_extended
L656:   aconst_null
L657:   aload 6
L659:   if_acmpeq L770
L662:   new java/io/File
L665:   dup
L666:   aload 6
L668:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L671:   astore 8
L673:   new java/io/File
L676:   dup
L677:   aload 5
L679:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L682:   astore 9
        .catch java/lang/Exception from L684 to L757 using L760
L684:   aload 8
L686:   invokevirtual Method java/io/File listFiles ()[Ljava/io/File;
L689:   astore 10
L691:   aload 10
L693:   astore 11
L695:   iconst_0
L696:   istore 12

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File Object [Ljava/io/File; Object [Ljava/io/File; Integer
            stack
        .end stack
L698:   iload 12
L700:   aload 11
L702:   arraylength
L703:   if_icmpge L757
L706:   aload 11
L708:   iload 12
L710:   aaload
L711:   astore 13
L713:   new java/io/File
L716:   dup
L717:   aload 9
L719:   aload 13
L721:   invokevirtual Method java/io/File getName ()Ljava/lang/String;
L724:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L727:   astore 14
L729:   aload 13
L731:   aload 14
L733:   invokevirtual Method java/io/File renameTo (Ljava/io/File;)Z
L736:   istore 15
L738:   iload 15
L740:   ifne L751
L743:   new java/io/IOException
L746:   dup
L747:   invokespecial Method java/io/IOException <init> ()V
L750:   athrow

        .stack append Object java/io/File Object java/io/File Integer
L751:   iinc 12 1
L754:   goto L698

        .stack chop 3
L757:   goto L767

        .stack full
            locals Object sk Object java/lang/String Object java/lang/String Integer Object java/lang/String Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/io/File
            stack Object java/lang/Exception
        .end stack
L760:   astore 10
L762:   aload 10
L764:   invokevirtual Method java/lang/Exception printStackTrace ()V

        .stack append Object java/lang/Object
L767:   iconst_1
L768:   istore 7

        .stack chop 3
L770:   iload 7
L772:   ifeq L792
L775:   aload_0
L776:   new java/io/File
L779:   dup
L780:   aload 5
L782:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L785:   aconst_null
L786:   ldc_w -1497248091
L789:   invokevirtual Method sk k (Ljava/io/File;Ljava/io/File;I)V

        .stack same
L792:   new java/io/File
L795:   dup
L796:   aload 5
L798:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L801:   areturn
L802:   
        .linenumbertable
            L0 225
            L31 226
            L85 227
            L88 228
            L91 229
            L94 230
            L103 233
            L120 234
            L138 235
            L156 236
            L195 237
            L209 238
            L225 239
            L228 240
            L234 241
            L244 242
            L284 243
            L287 244
            L303 245
            L309 246
            L319 247
            L338 250
            L348 251
            L364 253
            L372 257
            L375 255
            L377 256
            L382 258
            L387 259
            L398 260
            L406 261
            L409 264
            L415 265
            L429 266
            L441 267
            L444 271
            L454 272
            L466 273
            L478 274
            L531 275
            L539 276
            L561 277
            L568 278
            L571 279
            L574 273
            L580 272
            L586 285
            L592 286
            L653 287
            L656 289
            L662 290
            L673 291
            L684 293
            L691 295
            L695 296
            L706 297
            L713 299
            L729 300
            L738 301
            L751 296
            L757 308
            L760 306
            L762 307
            L767 309
            L770 311
            L792 312
        .end linenumbertable
    .end code
.end method

.method cl : ()V
    .code stack 6 locals 5
L0:     aconst_null
L1:     getstatic Field ky bn Ljava/lang/String;
L4:     if_acmpeq L242
L7:     getstatic Field ky bn Ljava/lang/String;
L10:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L13:    astore_1
L14:    aload_1
L15:    ldc_w "sun"
L18:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L21:    iconst_m1
L22:    if_icmpne L36
L25:    aload_1
L26:    ldc_w "apple"
L29:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L32:    iconst_m1
L33:    if_icmpeq L242

        .stack append Object java/lang/String
L36:    getstatic Field ae bt Ljava/lang/String;
L39:    astore_2
L40:    aload_2
L41:    ldc "1.1"
L43:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L46:    ifne L149
L49:    aload_2
L50:    ldc_w "1.1."
L53:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L56:    ifne L149
L59:    aload_2
L60:    ldc_w "1.2"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifne L149
L69:    aload_2
L70:    ldc_w "1.2."
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifne L149
L79:    aload_2
L80:    ldc_w "1.3"
L83:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L86:    ifne L149
L89:    aload_2
L90:    ldc_w "1.3."
L93:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L96:    ifne L149
L99:    aload_2
L100:   ldc_w "1.4"
L103:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L106:   ifne L149
L109:   aload_2
L110:   ldc_w "1.4."
L113:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L116:   ifne L149
L119:   aload_2
L120:   ldc_w "1.5"
L123:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L126:   ifne L149
L129:   aload_2
L130:   ldc_w "1.5."
L133:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L136:   ifne L149
L139:   aload_2
L140:   ldc_w "1.6.0"
L143:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L146:   ifeq L160

        .stack append Object java/lang/String
L149:   aload_0
L150:   ldc_w "wrongjava"
L153:   ldc_w -1965439405
L156:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L159:   return

        .stack same
L160:   aload_2
L161:   ldc_w "1.6.0_"
L164:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L167:   ifeq L242
L170:   bipush 6
L172:   istore_3

        .stack append Integer
L173:   iload_3
L174:   aload_2
L175:   invokevirtual Method java/lang/String length ()I
L178:   if_icmpge L199
L181:   aload_2
L182:   iload_3
L183:   invokevirtual Method java/lang/String charAt (I)C
L186:   iconst_1
L187:   invokestatic Method pz o (CB)Z
L190:   ifeq L199
L193:   iinc 3 1
L196:   goto L173

        .stack same
L199:   aload_2
L200:   bipush 6
L202:   iload_3
L203:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L206:   astore 4
L208:   aload 4
L210:   ldc_w 250407149
L213:   invokestatic Method wc m (Ljava/lang/CharSequence;I)Z
L216:   ifeq L242
L219:   aload 4
L221:   bipush 8
L223:   invokestatic Method vk f (Ljava/lang/CharSequence;B)I
L226:   bipush 10
L228:   if_icmpge L242
L231:   aload_0
L232:   ldc_w "wrongjava"
L235:   ldc_w 1364960903
L238:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L241:   return

        .stack chop 3
L242:   ldc_w -283088421
L245:   invokestatic Method qf y (I)Ljava/awt/Container;
L248:   iconst_1
L249:   invokevirtual Method java/awt/Container setFocusCycleRoot (Z)V
L252:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L255:   invokevirtual Method java/lang/Runtime maxMemory ()J
L258:   ldc2_w 1048576L
L261:   ldiv
L262:   l2i
L263:   iconst_1
L264:   iadd
L265:   ldc_w 2060182503
L268:   imul
L269:   putstatic Field sk bd I
L272:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L275:   invokevirtual Method java/lang/Runtime availableProcessors ()I
L278:   ldc_w -1401201395
L281:   imul
L282:   putstatic Field sk bc I
L285:   aload_0
L286:   ldc_w -1483631858
L289:   invokevirtual Method sk s (I)V
L292:   aload_0
L293:   ldc_w 1791314116
L296:   invokevirtual Method sk al (I)V
L299:   ldc_w -652952171
L302:   invokestatic Method nv e (I)Lsr;
L305:   putstatic Field sk f Lsr;

        .stack same_extended
L308:   ldc2_w -8807787511991959949L
L311:   getstatic Field sk bk J
L314:   lmul
L315:   lconst_0
L316:   lcmp
L317:   ifeq L337
L320:   ldc_w -262068893
L323:   invokestatic Method gz e (I)J
L326:   ldc2_w -8807787511991959949L
L329:   getstatic Field sk bk J
L332:   lmul
L333:   lcmp
L334:   ifge L401

        .stack same
L337:   getstatic Field sk f Lsr;
L340:   getstatic Field sk n J
L343:   ldc2_w 3394915126462843437L
L346:   lmul
L347:   invokevirtual Method sr n (J)I
L350:   ldc_w -709089635
L353:   imul
L354:   putstatic Field sk e I
L357:   iconst_0
L358:   istore_1

        .stack append Integer
L359:   iload_1
L360:   ldc_w 970166197
L363:   getstatic Field sk e I
L366:   imul
L367:   if_icmpge L382
L370:   aload_0
L371:   bipush -24
L373:   invokevirtual Method sk g (B)V
L376:   iinc 1 1
L379:   goto L359

        .stack same
L382:   aload_0
L383:   ldc_w -171033447
L386:   invokevirtual Method sk i (I)V
L389:   getstatic Field ahs g Ljava/awt/Canvas;
L392:   ldc_w 165759862
L395:   invokestatic Method f a (Ljava/lang/Object;I)V
L398:   goto L308

        .stack chop 1
L401:   return
L402:   
        .linenumbertable
            L0 522
            L7 523
            L14 524
            L36 525
            L40 526
            L149 527
            L159 528
            L160 530
            L170 531
            L173 532
            L199 533
            L208 534
            L231 535
            L241 536
            L242 541
            L252 542
            L272 543
            L285 544
            L292 545
            L299 546
            L308 547
            L337 548
            L357 549
            L382 550
            L389 551
            L401 553
        .end linenumbertable
    .end code
.end method

.method cg : ()V
    .code stack 6 locals 5
L0:     aconst_null
L1:     getstatic Field ky bn Ljava/lang/String;
L4:     if_acmpeq L242
L7:     getstatic Field ky bn Ljava/lang/String;
L10:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L13:    astore_1
L14:    aload_1
L15:    ldc_w "sun"
L18:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L21:    iconst_m1
L22:    if_icmpne L36
L25:    aload_1
L26:    ldc_w "apple"
L29:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L32:    iconst_m1
L33:    if_icmpeq L242

        .stack append Object java/lang/String
L36:    getstatic Field ae bt Ljava/lang/String;
L39:    astore_2
L40:    aload_2
L41:    ldc "1.1"
L43:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L46:    ifne L149
L49:    aload_2
L50:    ldc_w "1.1."
L53:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L56:    ifne L149
L59:    aload_2
L60:    ldc_w "1.2"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifne L149
L69:    aload_2
L70:    ldc_w "1.2."
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifne L149
L79:    aload_2
L80:    ldc_w "1.3"
L83:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L86:    ifne L149
L89:    aload_2
L90:    ldc_w "1.3."
L93:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L96:    ifne L149
L99:    aload_2
L100:   ldc_w "1.4"
L103:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L106:   ifne L149
L109:   aload_2
L110:   ldc_w "1.4."
L113:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L116:   ifne L149
L119:   aload_2
L120:   ldc_w "1.5"
L123:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L126:   ifne L149
L129:   aload_2
L130:   ldc_w "1.5."
L133:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L136:   ifne L149
L139:   aload_2
L140:   ldc_w "1.6.0"
L143:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L146:   ifeq L160

        .stack append Object java/lang/String
L149:   aload_0
L150:   ldc_w "wrongjava"
L153:   ldc_w 1169828676
L156:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L159:   return

        .stack same
L160:   aload_2
L161:   ldc_w "1.6.0_"
L164:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L167:   ifeq L242
L170:   bipush 6
L172:   istore_3

        .stack append Integer
L173:   iload_3
L174:   aload_2
L175:   invokevirtual Method java/lang/String length ()I
L178:   if_icmpge L199
L181:   aload_2
L182:   iload_3
L183:   invokevirtual Method java/lang/String charAt (I)C
L186:   iconst_1
L187:   invokestatic Method pz o (CB)Z
L190:   ifeq L199
L193:   iinc 3 1
L196:   goto L173

        .stack same
L199:   aload_2
L200:   bipush 6
L202:   iload_3
L203:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L206:   astore 4
L208:   aload 4
L210:   ldc_w 250407149
L213:   invokestatic Method wc m (Ljava/lang/CharSequence;I)Z
L216:   ifeq L242
L219:   aload 4
L221:   bipush 8
L223:   invokestatic Method vk f (Ljava/lang/CharSequence;B)I
L226:   bipush 10
L228:   if_icmpge L242
L231:   aload_0
L232:   ldc_w "wrongjava"
L235:   ldc_w 1191446614
L238:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L241:   return

        .stack chop 3
L242:   ldc_w -283088421
L245:   invokestatic Method qf y (I)Ljava/awt/Container;
L248:   iconst_1
L249:   invokevirtual Method java/awt/Container setFocusCycleRoot (Z)V
L252:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L255:   invokevirtual Method java/lang/Runtime maxMemory ()J
L258:   ldc2_w 1048576L
L261:   ldiv
L262:   l2i
L263:   iconst_1
L264:   iadd
L265:   ldc_w 2060182503
L268:   imul
L269:   putstatic Field sk bd I
L272:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L275:   invokevirtual Method java/lang/Runtime availableProcessors ()I
L278:   ldc_w -1401201395
L281:   imul
L282:   putstatic Field sk bc I
L285:   aload_0
L286:   ldc_w -1483631858
L289:   invokevirtual Method sk s (I)V
L292:   aload_0
L293:   ldc_w 184891866
L296:   invokevirtual Method sk al (I)V
L299:   ldc_w 1469083926
L302:   invokestatic Method nv e (I)Lsr;
L305:   putstatic Field sk f Lsr;

        .stack same_extended
L308:   ldc2_w -8807787511991959949L
L311:   getstatic Field sk bk J
L314:   lmul
L315:   lconst_0
L316:   lcmp
L317:   ifeq L337
L320:   ldc_w 1516693151
L323:   invokestatic Method gz e (I)J
L326:   ldc2_w -8807787511991959949L
L329:   getstatic Field sk bk J
L332:   lmul
L333:   lcmp
L334:   ifge L401

        .stack same
L337:   getstatic Field sk f Lsr;
L340:   getstatic Field sk n J
L343:   ldc2_w 3394915126462843437L
L346:   lmul
L347:   invokevirtual Method sr n (J)I
L350:   ldc_w -709089635
L353:   imul
L354:   putstatic Field sk e I
L357:   iconst_0
L358:   istore_1

        .stack append Integer
L359:   iload_1
L360:   ldc_w 970166197
L363:   getstatic Field sk e I
L366:   imul
L367:   if_icmpge L382
L370:   aload_0
L371:   bipush -95
L373:   invokevirtual Method sk g (B)V
L376:   iinc 1 1
L379:   goto L359

        .stack same
L382:   aload_0
L383:   ldc_w 778132536
L386:   invokevirtual Method sk i (I)V
L389:   getstatic Field ahs g Ljava/awt/Canvas;
L392:   ldc_w 165759862
L395:   invokestatic Method f a (Ljava/lang/Object;I)V
L398:   goto L308

        .stack chop 1
L401:   return
L402:   
        .linenumbertable
            L0 522
            L7 523
            L14 524
            L36 525
            L40 526
            L149 527
            L159 528
            L160 530
            L170 531
            L173 532
            L199 533
            L208 534
            L231 535
            L241 536
            L242 541
            L252 542
            L272 543
            L285 544
            L292 545
            L299 546
            L308 547
            L337 548
            L357 549
            L382 550
            L389 551
            L401 553
        .end linenumbertable
    .end code
.end method

.method public r : ()V
    .code stack 3 locals 3
        .catch java/lang/ThreadDeath from L0 to L7 using L18
        .catch java/lang/Throwable from L0 to L7 using L21
        .catch [0] from L0 to L7 using L56
L0:     aload_0
L1:     ldc_w 1225712396
L4:     invokevirtual Method sk h (I)V
L7:     aload_0
L8:     iconst_1
L9:     ldc_w 241226325
L12:    invokevirtual Method sk t (ZI)V
L15:    goto L67
        .catch [0] from L18 to L45 using L56

        .stack stack_1 Object java/lang/ThreadDeath
L18:    astore_1
L19:    aload_1
L20:    athrow

        .stack stack_1 Object java/lang/Throwable
L21:    astore_1
L22:    aload_0
L23:    bipush 96
L25:    invokevirtual Method sk j (B)Ljava/lang/String;
L28:    aload_1
L29:    ldc_w 1212936138
L32:    invokestatic Method wt e (Ljava/lang/String;Ljava/lang/Throwable;I)V
L35:    aload_0
L36:    ldc_w "crash"
L39:    ldc_w -772458594
L42:    invokevirtual Method sk ad (Ljava/lang/String;I)V
L45:    aload_0
L46:    iconst_1
L47:    ldc_w -377334594
L50:    invokevirtual Method sk t (ZI)V
L53:    goto L67
        .catch [0] from L56 to L57 using L56

        .stack stack_1 Object java/lang/Throwable
L56:    astore_2
L57:    aload_0
L58:    iconst_1
L59:    ldc_w -1699987452
L62:    invokevirtual Method sk t (ZI)V
L65:    aload_2
L66:    athrow

        .stack same
L67:    return
L68:    
        .linenumbertable
            L0 506
            L7 516
            L15 517
            L18 508
            L19 509
            L21 511
            L22 512
            L35 513
            L45 516
            L53 517
            L56 516
            L67 519
        .end linenumbertable
    .end code
.end method

.method cu : ()V
    .code stack 6 locals 5
L0:     aconst_null
L1:     getstatic Field ky bn Ljava/lang/String;
L4:     if_acmpeq L242
L7:     getstatic Field ky bn Ljava/lang/String;
L10:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L13:    astore_1
L14:    aload_1
L15:    ldc_w "sun"
L18:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L21:    iconst_m1
L22:    if_icmpne L36
L25:    aload_1
L26:    ldc_w "apple"
L29:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L32:    iconst_m1
L33:    if_icmpeq L242

        .stack append Object java/lang/String
L36:    getstatic Field ae bt Ljava/lang/String;
L39:    astore_2
L40:    aload_2
L41:    ldc "1.1"
L43:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L46:    ifne L149
L49:    aload_2
L50:    ldc_w "1.1."
L53:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L56:    ifne L149
L59:    aload_2
L60:    ldc_w "1.2"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifne L149
L69:    aload_2
L70:    ldc_w "1.2."
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifne L149
L79:    aload_2
L80:    ldc_w "1.3"
L83:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L86:    ifne L149
L89:    aload_2
L90:    ldc_w "1.3."
L93:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L96:    ifne L149
L99:    aload_2
L100:   ldc_w "1.4"
L103:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L106:   ifne L149
L109:   aload_2
L110:   ldc_w "1.4."
L113:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L116:   ifne L149
L119:   aload_2
L120:   ldc_w "1.5"
L123:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L126:   ifne L149
L129:   aload_2
L130:   ldc_w "1.5."
L133:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L136:   ifne L149
L139:   aload_2
L140:   ldc_w "1.6.0"
L143:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L146:   ifeq L160

        .stack append Object java/lang/String
L149:   aload_0
L150:   ldc_w "wrongjava"
L153:   ldc_w 1619997299
L156:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L159:   return

        .stack same
L160:   aload_2
L161:   ldc_w "1.6.0_"
L164:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L167:   ifeq L242
L170:   bipush 6
L172:   istore_3

        .stack append Integer
L173:   iload_3
L174:   aload_2
L175:   invokevirtual Method java/lang/String length ()I
L178:   if_icmpge L199
L181:   aload_2
L182:   iload_3
L183:   invokevirtual Method java/lang/String charAt (I)C
L186:   iconst_1
L187:   invokestatic Method pz o (CB)Z
L190:   ifeq L199
L193:   iinc 3 1
L196:   goto L173

        .stack same
L199:   aload_2
L200:   bipush 6
L202:   iload_3
L203:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L206:   astore 4
L208:   aload 4
L210:   ldc_w 250407149
L213:   invokestatic Method wc m (Ljava/lang/CharSequence;I)Z
L216:   ifeq L242
L219:   aload 4
L221:   bipush 8
L223:   invokestatic Method vk f (Ljava/lang/CharSequence;B)I
L226:   bipush 10
L228:   if_icmpge L242
L231:   aload_0
L232:   ldc_w "wrongjava"
L235:   ldc_w 58034280
L238:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L241:   return

        .stack chop 3
L242:   ldc_w -283088421
L245:   invokestatic Method qf y (I)Ljava/awt/Container;
L248:   iconst_1
L249:   invokevirtual Method java/awt/Container setFocusCycleRoot (Z)V
L252:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L255:   invokevirtual Method java/lang/Runtime maxMemory ()J
L258:   ldc2_w 1048576L
L261:   ldiv
L262:   l2i
L263:   iconst_1
L264:   iadd
L265:   ldc_w 2060182503
L268:   imul
L269:   putstatic Field sk bd I
L272:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L275:   invokevirtual Method java/lang/Runtime availableProcessors ()I
L278:   ldc_w -1401201395
L281:   imul
L282:   putstatic Field sk bc I
L285:   aload_0
L286:   ldc_w -1483631858
L289:   invokevirtual Method sk s (I)V
L292:   aload_0
L293:   ldc_w 1509528789
L296:   invokevirtual Method sk al (I)V
L299:   ldc_w 2065172053
L302:   invokestatic Method nv e (I)Lsr;
L305:   putstatic Field sk f Lsr;

        .stack same_extended
L308:   ldc2_w -8807787511991959949L
L311:   getstatic Field sk bk J
L314:   lmul
L315:   lconst_0
L316:   lcmp
L317:   ifeq L337
L320:   ldc_w 1972040643
L323:   invokestatic Method gz e (I)J
L326:   ldc2_w -8807787511991959949L
L329:   getstatic Field sk bk J
L332:   lmul
L333:   lcmp
L334:   ifge L401

        .stack same
L337:   getstatic Field sk f Lsr;
L340:   getstatic Field sk n J
L343:   ldc2_w 3394915126462843437L
L346:   lmul
L347:   invokevirtual Method sr n (J)I
L350:   ldc_w -709089635
L353:   imul
L354:   putstatic Field sk e I
L357:   iconst_0
L358:   istore_1

        .stack append Integer
L359:   iload_1
L360:   ldc_w 970166197
L363:   getstatic Field sk e I
L366:   imul
L367:   if_icmpge L382
L370:   aload_0
L371:   bipush -79
L373:   invokevirtual Method sk g (B)V
L376:   iinc 1 1
L379:   goto L359

        .stack same
L382:   aload_0
L383:   ldc_w 1419382199
L386:   invokevirtual Method sk i (I)V
L389:   getstatic Field ahs g Ljava/awt/Canvas;
L392:   ldc_w 165759862
L395:   invokestatic Method f a (Ljava/lang/Object;I)V
L398:   goto L308

        .stack chop 1
L401:   return
L402:   
        .linenumbertable
            L0 522
            L7 523
            L14 524
            L36 525
            L40 526
            L149 527
            L159 528
            L160 530
            L170 531
            L173 532
            L199 533
            L208 534
            L231 535
            L241 536
            L242 541
            L252 542
            L272 543
            L285 544
            L292 545
            L299 546
            L308 547
            L337 548
            L357 549
            L382 550
            L389 551
            L401 553
        .end linenumbertable
    .end code
.end method

.method ci : ()V
    .code stack 4 locals 7
L0:     ldc_w -399227516
L3:     invokestatic Method gz e (I)J
L6:     lstore_1
L7:     getstatic Field sk z [J
L10:    ldc_w 950088787
L13:    getstatic Field sk p I
L16:    imul
L17:    laload
L18:    lstore_3
L19:    getstatic Field sk z [J
L22:    getstatic Field sk p I
L25:    ldc_w 950088787
L28:    imul
L29:    lload_1
L30:    lastore
L31:    ldc_w -185651237
L34:    ldc_w 950088787
L37:    getstatic Field sk p I
L40:    imul
L41:    iconst_1
L42:    iadd
L43:    bipush 31
L45:    iand
L46:    imul
L47:    putstatic Field sk p I
L50:    lload_3
L51:    lconst_0
L52:    lcmp
L53:    ifeq L62
L56:    lload_1
L57:    lload_3
L58:    lcmp
L59:    ifle L62

        .stack append Long Long
L62:    aload_0
L63:    dup
L64:    astore 5
L66:    monitorenter
        .catch [0] from L67 to L76 using L79
L67:    getstatic Field sk ai Z
L70:    putstatic Field aar aw Z
L73:    aload 5
L75:    monitorexit
L76:    goto L87
        .catch [0] from L79 to L84 using L79

        .stack full
            locals Object sk Long Long Object sk
            stack Object java/lang/Throwable
        .end stack
L79:    astore 6
L81:    aload 5
L83:    monitorexit
L84:    aload 6
L86:    athrow

        .stack same
L87:    aload_0
L88:    ldc_w -263225392
L91:    invokevirtual Method sk ac (I)V
L94:    return
L95:    
        .linenumbertable
            L0 565
            L7 566
            L19 567
            L31 568
            L50 569
            L62 570
            L67 571
            L73 572
            L87 573
            L94 574
        .end linenumbertable
    .end code
.end method

.method cn : ()V
    .code stack 4 locals 7
L0:     ldc_w 815538933
L3:     invokestatic Method gz e (I)J
L6:     lstore_1
L7:     getstatic Field sk z [J
L10:    ldc_w 950088787
L13:    getstatic Field sk p I
L16:    imul
L17:    laload
L18:    lstore_3
L19:    getstatic Field sk z [J
L22:    getstatic Field sk p I
L25:    ldc_w 950088787
L28:    imul
L29:    lload_1
L30:    lastore
L31:    ldc_w -185651237
L34:    ldc_w 950088787
L37:    getstatic Field sk p I
L40:    imul
L41:    iconst_1
L42:    iadd
L43:    bipush 31
L45:    iand
L46:    imul
L47:    putstatic Field sk p I
L50:    lload_3
L51:    lconst_0
L52:    lcmp
L53:    ifeq L62
L56:    lload_1
L57:    lload_3
L58:    lcmp
L59:    ifle L62

        .stack append Long Long
L62:    aload_0
L63:    dup
L64:    astore 5
L66:    monitorenter
        .catch [0] from L67 to L76 using L79
L67:    getstatic Field sk ai Z
L70:    putstatic Field aar aw Z
L73:    aload 5
L75:    monitorexit
L76:    goto L87
        .catch [0] from L79 to L84 using L79

        .stack full
            locals Object sk Long Long Object sk
            stack Object java/lang/Throwable
        .end stack
L79:    astore 6
L81:    aload 5
L83:    monitorexit
L84:    aload 6
L86:    athrow

        .stack same
L87:    aload_0
L88:    ldc_w -263225392
L91:    invokevirtual Method sk ac (I)V
L94:    return
L95:    
        .linenumbertable
            L0 565
            L7 566
            L19 567
            L31 568
            L50 569
            L62 570
            L67 571
            L73 572
            L87 573
            L94 574
        .end linenumbertable
    .end code
.end method

.method cv : ()V
    .code stack 5 locals 8
L0:     ldc_w 692459437
L3:     invokestatic Method gz e (I)J
L6:     lstore_1
L7:     getstatic Field sk l [J
L10:    getstatic Field sk u I
L13:    ldc_w -1288987007
L16:    imul
L17:    iconst_1
L18:    isub
L19:    bipush 31
L21:    iand
L22:    laload
L23:    lstore_3
L24:    getstatic Field sk l [J
L27:    ldc_w -1288987007
L30:    getstatic Field sk u I
L33:    imul
L34:    laload
L35:    lstore 5
L37:    getstatic Field sk l [J
L40:    ldc_w -1288987007
L43:    getstatic Field sk u I
L46:    imul
L47:    lload_1
L48:    lastore
L49:    iconst_1
L50:    getstatic Field sk u I
L53:    ldc_w -1288987007
L56:    imul
L57:    iadd
L58:    bipush 31
L60:    iand
L61:    ldc_w -1990811263
L64:    imul
L65:    putstatic Field sk u I
L68:    lload 5
L70:    lconst_0
L71:    lcmp
L72:    ifeq L118
L75:    lload_1
L76:    lload 5
L78:    lcmp
L79:    ifle L118
L82:    lload_1
L83:    lload 5
L85:    lsub
L86:    l2i
L87:    istore 7
L89:    ldc_w 406073307
L92:    lload_1
L93:    lload_3
L94:    lsub
L95:    l2i
L96:    imul
L97:    putstatic Field sk k I
L100:   iload 7
L102:   iconst_1
L103:   ishr
L104:   sipush 32000
L107:   iadd
L108:   iload 7
L110:   idiv
L111:   ldc_w -332499549
L114:   imul
L115:   putstatic Field sk m I

        .stack append Long Long Long
L118:   getstatic Field sk ae I
L121:   ldc_w 1670111301
L124:   iadd
L125:   dup
L126:   putstatic Field sk ae I
L129:   ldc_w -133680499
L132:   imul
L133:   iconst_1
L134:   isub
L135:   bipush 50
L137:   if_icmple L258
L140:   getstatic Field sk ae I
L143:   ldc_w 1901186426
L146:   isub
L147:   putstatic Field sk ae I
L150:   iconst_1
L151:   putstatic Field sk j Z
L154:   getstatic Field ahs g Ljava/awt/Canvas;
L157:   ldc_w -1378711501
L160:   getstatic Field sk r I
L163:   imul
L164:   getstatic Field sk v I
L167:   ldc_w 2091353777
L170:   imul
L171:   invokevirtual Method java/awt/Canvas setSize (II)V
L174:   getstatic Field ahs g Ljava/awt/Canvas;
L177:   iconst_1
L178:   invokevirtual Method java/awt/Canvas setVisible (Z)V
L181:   aconst_null
L182:   getstatic Field vy h Ljava/awt/Frame;
L185:   if_acmpeq L238
L188:   aconst_null
L189:   getstatic Field aqy a Ljava/awt/Frame;
L192:   if_acmpne L238
L195:   getstatic Field vy h Ljava/awt/Frame;
L198:   invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L201:   astore 7
L203:   getstatic Field ahs g Ljava/awt/Canvas;
L206:   aload 7
L208:   getfield Field java/awt/Insets left I
L211:   ldc_w 495533241
L214:   getstatic Field sk y I
L217:   imul
L218:   iadd
L219:   getstatic Field sk q I
L222:   ldc_w -1074927711
L225:   imul
L226:   aload 7
L228:   getfield Field java/awt/Insets top I
L231:   iadd
L232:   invokevirtual Method java/awt/Canvas setLocation (II)V
L235:   goto L258

        .stack same_extended
L238:   getstatic Field ahs g Ljava/awt/Canvas;
L241:   getstatic Field sk y I
L244:   ldc_w 495533241
L247:   imul
L248:   ldc_w -1074927711
L251:   getstatic Field sk q I
L254:   imul
L255:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L258:   aload_0
L259:   ldc_w 1943259820
L262:   invokevirtual Method sk ai (I)V
L265:   return
L266:   
        .linenumbertable
            L0 577
            L7 578
            L24 579
            L37 580
            L49 581
            L68 582
            L82 583
            L89 584
            L100 585
            L118 587
            L140 588
            L150 589
            L154 590
            L174 591
            L181 592
            L195 593
            L203 594
            L235 595
            L238 596
            L258 598
            L265 599
        .end linenumbertable
    .end code
.end method

.method cp : ()V
    .code stack 5 locals 8
L0:     ldc_w -169016978
L3:     invokestatic Method gz e (I)J
L6:     lstore_1
L7:     getstatic Field sk l [J
L10:    getstatic Field sk u I
L13:    ldc_w -1288987007
L16:    imul
L17:    iconst_1
L18:    isub
L19:    bipush 31
L21:    iand
L22:    laload
L23:    lstore_3
L24:    getstatic Field sk l [J
L27:    ldc_w -1288987007
L30:    getstatic Field sk u I
L33:    imul
L34:    laload
L35:    lstore 5
L37:    getstatic Field sk l [J
L40:    ldc_w -1288987007
L43:    getstatic Field sk u I
L46:    imul
L47:    lload_1
L48:    lastore
L49:    iconst_1
L50:    getstatic Field sk u I
L53:    ldc_w -1288987007
L56:    imul
L57:    iadd
L58:    bipush 31
L60:    iand
L61:    ldc_w -1990811263
L64:    imul
L65:    putstatic Field sk u I
L68:    lload 5
L70:    lconst_0
L71:    lcmp
L72:    ifeq L118
L75:    lload_1
L76:    lload 5
L78:    lcmp
L79:    ifle L118
L82:    lload_1
L83:    lload 5
L85:    lsub
L86:    l2i
L87:    istore 7
L89:    ldc_w 406073307
L92:    lload_1
L93:    lload_3
L94:    lsub
L95:    l2i
L96:    imul
L97:    putstatic Field sk k I
L100:   iload 7
L102:   iconst_1
L103:   ishr
L104:   sipush 32000
L107:   iadd
L108:   iload 7
L110:   idiv
L111:   ldc_w -332499549
L114:   imul
L115:   putstatic Field sk m I

        .stack append Long Long Long
L118:   getstatic Field sk ae I
L121:   ldc_w 1670111301
L124:   iadd
L125:   dup
L126:   putstatic Field sk ae I
L129:   ldc_w -133680499
L132:   imul
L133:   iconst_1
L134:   isub
L135:   bipush 50
L137:   if_icmple L258
L140:   getstatic Field sk ae I
L143:   ldc_w 1901186426
L146:   isub
L147:   putstatic Field sk ae I
L150:   iconst_1
L151:   putstatic Field sk j Z
L154:   getstatic Field ahs g Ljava/awt/Canvas;
L157:   ldc_w -1378711501
L160:   getstatic Field sk r I
L163:   imul
L164:   getstatic Field sk v I
L167:   ldc_w 2091353777
L170:   imul
L171:   invokevirtual Method java/awt/Canvas setSize (II)V
L174:   getstatic Field ahs g Ljava/awt/Canvas;
L177:   iconst_1
L178:   invokevirtual Method java/awt/Canvas setVisible (Z)V
L181:   aconst_null
L182:   getstatic Field vy h Ljava/awt/Frame;
L185:   if_acmpeq L238
L188:   aconst_null
L189:   getstatic Field aqy a Ljava/awt/Frame;
L192:   if_acmpne L238
L195:   getstatic Field vy h Ljava/awt/Frame;
L198:   invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L201:   astore 7
L203:   getstatic Field ahs g Ljava/awt/Canvas;
L206:   aload 7
L208:   getfield Field java/awt/Insets left I
L211:   ldc_w 495533241
L214:   getstatic Field sk y I
L217:   imul
L218:   iadd
L219:   getstatic Field sk q I
L222:   ldc_w -1074927711
L225:   imul
L226:   aload 7
L228:   getfield Field java/awt/Insets top I
L231:   iadd
L232:   invokevirtual Method java/awt/Canvas setLocation (II)V
L235:   goto L258

        .stack same_extended
L238:   getstatic Field ahs g Ljava/awt/Canvas;
L241:   getstatic Field sk y I
L244:   ldc_w 495533241
L247:   imul
L248:   ldc_w -1074927711
L251:   getstatic Field sk q I
L254:   imul
L255:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L258:   aload_0
L259:   ldc_w 1943259820
L262:   invokevirtual Method sk ai (I)V
L265:   return
L266:   
        .linenumbertable
            L0 577
            L7 578
            L24 579
            L37 580
            L49 581
            L68 582
            L82 583
            L89 584
            L100 585
            L118 587
            L140 588
            L150 589
            L154 590
            L174 591
            L181 592
            L195 593
            L203 594
            L235 595
            L238 596
            L258 598
            L265 599
        .end linenumbertable
    .end code
.end method

.method ca : ()V
    .code stack 5 locals 8
L0:     ldc_w 428472719
L3:     invokestatic Method gz e (I)J
L6:     lstore_1
L7:     getstatic Field sk l [J
L10:    getstatic Field sk u I
L13:    ldc_w -1288987007
L16:    imul
L17:    iconst_1
L18:    isub
L19:    bipush 31
L21:    iand
L22:    laload
L23:    lstore_3
L24:    getstatic Field sk l [J
L27:    ldc_w -1288987007
L30:    getstatic Field sk u I
L33:    imul
L34:    laload
L35:    lstore 5
L37:    getstatic Field sk l [J
L40:    ldc_w -1288987007
L43:    getstatic Field sk u I
L46:    imul
L47:    lload_1
L48:    lastore
L49:    iconst_1
L50:    getstatic Field sk u I
L53:    ldc_w -1288987007
L56:    imul
L57:    iadd
L58:    bipush 31
L60:    iand
L61:    ldc_w -1990811263
L64:    imul
L65:    putstatic Field sk u I
L68:    lload 5
L70:    lconst_0
L71:    lcmp
L72:    ifeq L118
L75:    lload_1
L76:    lload 5
L78:    lcmp
L79:    ifle L118
L82:    lload_1
L83:    lload 5
L85:    lsub
L86:    l2i
L87:    istore 7
L89:    ldc_w 406073307
L92:    lload_1
L93:    lload_3
L94:    lsub
L95:    l2i
L96:    imul
L97:    putstatic Field sk k I
L100:   iload 7
L102:   iconst_1
L103:   ishr
L104:   sipush 32000
L107:   iadd
L108:   iload 7
L110:   idiv
L111:   ldc_w -332499549
L114:   imul
L115:   putstatic Field sk m I

        .stack append Long Long Long
L118:   getstatic Field sk ae I
L121:   ldc_w 1670111301
L124:   iadd
L125:   dup
L126:   putstatic Field sk ae I
L129:   ldc_w -133680499
L132:   imul
L133:   iconst_1
L134:   isub
L135:   bipush 50
L137:   if_icmple L258
L140:   getstatic Field sk ae I
L143:   ldc_w 1901186426
L146:   isub
L147:   putstatic Field sk ae I
L150:   iconst_1
L151:   putstatic Field sk j Z
L154:   getstatic Field ahs g Ljava/awt/Canvas;
L157:   ldc_w -1378711501
L160:   getstatic Field sk r I
L163:   imul
L164:   getstatic Field sk v I
L167:   ldc_w 2091353777
L170:   imul
L171:   invokevirtual Method java/awt/Canvas setSize (II)V
L174:   getstatic Field ahs g Ljava/awt/Canvas;
L177:   iconst_1
L178:   invokevirtual Method java/awt/Canvas setVisible (Z)V
L181:   aconst_null
L182:   getstatic Field vy h Ljava/awt/Frame;
L185:   if_acmpeq L238
L188:   aconst_null
L189:   getstatic Field aqy a Ljava/awt/Frame;
L192:   if_acmpne L238
L195:   getstatic Field vy h Ljava/awt/Frame;
L198:   invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L201:   astore 7
L203:   getstatic Field ahs g Ljava/awt/Canvas;
L206:   aload 7
L208:   getfield Field java/awt/Insets left I
L211:   ldc_w 495533241
L214:   getstatic Field sk y I
L217:   imul
L218:   iadd
L219:   getstatic Field sk q I
L222:   ldc_w -1074927711
L225:   imul
L226:   aload 7
L228:   getfield Field java/awt/Insets top I
L231:   iadd
L232:   invokevirtual Method java/awt/Canvas setLocation (II)V
L235:   goto L258

        .stack same_extended
L238:   getstatic Field ahs g Ljava/awt/Canvas;
L241:   getstatic Field sk y I
L244:   ldc_w 495533241
L247:   imul
L248:   ldc_w -1074927711
L251:   getstatic Field sk q I
L254:   imul
L255:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L258:   aload_0
L259:   ldc_w 1943259820
L262:   invokevirtual Method sk ai (I)V
L265:   return
L266:   
        .linenumbertable
            L0 577
            L7 578
            L24 579
            L37 580
            L49 581
            L68 582
            L82 583
            L89 584
            L100 585
            L118 587
            L140 588
            L150 589
            L154 590
            L174 591
            L181 592
            L195 593
            L203 594
            L235 595
            L238 596
            L258 598
            L265 599
        .end linenumbertable
    .end code
.end method

.method public final windowIconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L1 using L1
L0:     return

        .stack stack_1 Object java/lang/RuntimeException
L1:     new java/lang/StringBuilder
L4:     dup
L5:     invokespecial Method java/lang/StringBuilder <init> ()V
L8:     ldc_w "sk.windowIconified("
L11:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L14:    ldc 41
L16:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L19:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L22:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L25:    athrow
L26:    
        .linenumbertable
            L0 708
        .end linenumbertable
    .end code
.end method

.method abstract dw : ()V
.end method

.method final ct : (Z)V
    .code stack 3 locals 4
L0:     aload_0
L1:     dup
L2:     astore_2
L3:     monitorenter
        .catch [0] from L4 to L12 using L22
L4:     getstatic Field sk bh Z
L7:     ifeq L13
L10:    aload_2
L11:    monitorexit
L12:    return
        .catch [0] from L13 to L19 using L22

        .stack append Object sk
L13:    iconst_1
L14:    putstatic Field sk bh Z
L17:    aload_2
L18:    monitorexit
L19:    goto L27
        .catch [0] from L22 to L25 using L22

        .stack stack_1 Object java/lang/Throwable
L22:    astore_3
L23:    aload_2
L24:    monitorexit
L25:    aload_3
L26:    athrow
        .catch java/lang/Exception from L27 to L33 using L36

        .stack same
L27:    aload_0
L28:    bipush -4
L30:    invokevirtual Method sk aw (B)V
L33:    goto L37

        .stack stack_1 Object java/lang/Exception
L36:    astore_2
        .catch java/lang/Exception from L37 to L94 using L97

        .stack full
            locals Object sk Integer Object java/lang/Object
            stack
        .end stack
L37:    getstatic Field sk ay Labp;
L40:    ldc_w 1216916480
L43:    invokevirtual Method abp e (I)V
L46:    iconst_0
L47:    istore_2

        .stack full
            locals Object sk Integer Integer
            stack
        .end stack
L48:    iload_2
L49:    ldc_w 694777127
L52:    getstatic Field b ap I
L55:    imul
L56:    if_icmpge L76
L59:    getstatic Field vs az [Labp;
L62:    iload_2
L63:    aaload
L64:    ldc_w 1216916480
L67:    invokevirtual Method abp e (I)V
L70:    iinc 2 1
L73:    goto L48

        .stack same
L76:    getstatic Field sk ab Labp;
L79:    ldc_w 1216916480
L82:    invokevirtual Method abp e (I)V
L85:    getstatic Field sk aj Labp;
L88:    ldc_w 1216916480
L91:    invokevirtual Method abp e (I)V
L94:    goto L98

        .stack full
            locals Object sk Integer
            stack Object java/lang/Exception
        .end stack
L97:    astore_2

        .stack same
L98:    aload_0
L99:    getfield Field sk bi Z
L102:   ifeq L112
        .catch java/lang/Throwable from L105 to L108 using L111
L105:   invokestatic Method jaclib/nanotime/QueryPerformanceCounter quit ()V
L108:   goto L112

        .stack stack_1 Object java/lang/Throwable
L111:   astore_2

        .stack same
L112:   ldc_w 1573015288
L115:   invokestatic Method aah m (I)Z
L118:   ifeq L136
L121:   ldc_w 672839876
L124:   invokestatic Method ke n (I)Lrn;
L127:   ldc_w -1000571758
L130:   invokeinterface InterfaceMethod rn m (I)Z 2
L135:   pop

        .stack same
L136:   getstatic Field ahs g Ljava/awt/Canvas;
L139:   ifnull L165
        .catch java/lang/Exception from L142 to L161 using L164
L142:   getstatic Field ahs g Ljava/awt/Canvas;
L145:   aload_0
L146:   invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L149:   getstatic Field ahs g Ljava/awt/Canvas;
L152:   invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L155:   getstatic Field ahs g Ljava/awt/Canvas;
L158:   invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V
L161:   goto L165

        .stack stack_1 Object java/lang/Exception
L164:   astore_2

        .stack same
L165:   aconst_null
L166:   getstatic Field vy h Ljava/awt/Frame;
L169:   if_acmpeq L189
L172:   getstatic Field vy h Ljava/awt/Frame;
L175:   iconst_0
L176:   invokevirtual Method java/awt/Frame setVisible (Z)V
L179:   getstatic Field vy h Ljava/awt/Frame;
L182:   invokevirtual Method java/awt/Frame dispose ()V
L185:   aconst_null
L186:   putstatic Field vy h Ljava/awt/Frame;

        .stack same
L189:   return
L190:   
        .linenumbertable
            L0 606
            L4 607
            L13 608
            L17 609
            L27 611
            L33 613
            L37 615
            L46 616
            L76 617
            L85 618
            L94 620
            L98 621
            L105 623
            L108 625
            L112 628
            L136 630
            L142 632
            L149 633
            L161 635
            L165 637
            L172 638
            L179 639
            L185 640
            L189 642
        .end linenumbertable
    .end code
.end method

.method public abstract init : ()V
.end method

.method public static final co : ()I
    .code stack 6 locals 0
L0:     ldc2_w 1000000000L
L3:     ldc2_w 3394915126462843437L
L6:     getstatic Field sk n J
L9:     lmul
L10:    ldiv
L11:    l2i
L12:    ireturn
L13:    
        .linenumbertable
            L0 645
        .end linenumbertable
    .end code
.end method

.method bs : ()V
    .code stack 6 locals 5
L0:     aconst_null
L1:     getstatic Field ky bn Ljava/lang/String;
L4:     if_acmpeq L242
L7:     getstatic Field ky bn Ljava/lang/String;
L10:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L13:    astore_1
L14:    aload_1
L15:    ldc_w "sun"
L18:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L21:    iconst_m1
L22:    if_icmpne L36
L25:    aload_1
L26:    ldc_w "apple"
L29:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L32:    iconst_m1
L33:    if_icmpeq L242

        .stack append Object java/lang/String
L36:    getstatic Field ae bt Ljava/lang/String;
L39:    astore_2
L40:    aload_2
L41:    ldc "1.1"
L43:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L46:    ifne L149
L49:    aload_2
L50:    ldc_w "1.1."
L53:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L56:    ifne L149
L59:    aload_2
L60:    ldc_w "1.2"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifne L149
L69:    aload_2
L70:    ldc_w "1.2."
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifne L149
L79:    aload_2
L80:    ldc_w "1.3"
L83:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L86:    ifne L149
L89:    aload_2
L90:    ldc_w "1.3."
L93:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L96:    ifne L149
L99:    aload_2
L100:   ldc_w "1.4"
L103:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L106:   ifne L149
L109:   aload_2
L110:   ldc_w "1.4."
L113:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L116:   ifne L149
L119:   aload_2
L120:   ldc_w "1.5"
L123:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L126:   ifne L149
L129:   aload_2
L130:   ldc_w "1.5."
L133:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L136:   ifne L149
L139:   aload_2
L140:   ldc_w "1.6.0"
L143:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L146:   ifeq L160

        .stack append Object java/lang/String
L149:   aload_0
L150:   ldc_w "wrongjava"
L153:   ldc_w 1979615946
L156:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L159:   return

        .stack same
L160:   aload_2
L161:   ldc_w "1.6.0_"
L164:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L167:   ifeq L242
L170:   bipush 6
L172:   istore_3

        .stack append Integer
L173:   iload_3
L174:   aload_2
L175:   invokevirtual Method java/lang/String length ()I
L178:   if_icmpge L199
L181:   aload_2
L182:   iload_3
L183:   invokevirtual Method java/lang/String charAt (I)C
L186:   iconst_1
L187:   invokestatic Method pz o (CB)Z
L190:   ifeq L199
L193:   iinc 3 1
L196:   goto L173

        .stack same
L199:   aload_2
L200:   bipush 6
L202:   iload_3
L203:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L206:   astore 4
L208:   aload 4
L210:   ldc_w 250407149
L213:   invokestatic Method wc m (Ljava/lang/CharSequence;I)Z
L216:   ifeq L242
L219:   aload 4
L221:   bipush 8
L223:   invokestatic Method vk f (Ljava/lang/CharSequence;B)I
L226:   bipush 10
L228:   if_icmpge L242
L231:   aload_0
L232:   ldc_w "wrongjava"
L235:   ldc_w -519295078
L238:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L241:   return

        .stack chop 3
L242:   ldc_w -283088421
L245:   invokestatic Method qf y (I)Ljava/awt/Container;
L248:   iconst_1
L249:   invokevirtual Method java/awt/Container setFocusCycleRoot (Z)V
L252:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L255:   invokevirtual Method java/lang/Runtime maxMemory ()J
L258:   ldc2_w 1048576L
L261:   ldiv
L262:   l2i
L263:   iconst_1
L264:   iadd
L265:   ldc_w 2060182503
L268:   imul
L269:   putstatic Field sk bd I
L272:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L275:   invokevirtual Method java/lang/Runtime availableProcessors ()I
L278:   ldc_w -1401201395
L281:   imul
L282:   putstatic Field sk bc I
L285:   aload_0
L286:   ldc_w -1483631858
L289:   invokevirtual Method sk s (I)V
L292:   aload_0
L293:   ldc_w -100444539
L296:   invokevirtual Method sk al (I)V
L299:   ldc_w -1514142770
L302:   invokestatic Method nv e (I)Lsr;
L305:   putstatic Field sk f Lsr;

        .stack same_extended
L308:   ldc2_w -8807787511991959949L
L311:   getstatic Field sk bk J
L314:   lmul
L315:   lconst_0
L316:   lcmp
L317:   ifeq L337
L320:   ldc_w 1347965270
L323:   invokestatic Method gz e (I)J
L326:   ldc2_w -8807787511991959949L
L329:   getstatic Field sk bk J
L332:   lmul
L333:   lcmp
L334:   ifge L401

        .stack same
L337:   getstatic Field sk f Lsr;
L340:   getstatic Field sk n J
L343:   ldc2_w 3394915126462843437L
L346:   lmul
L347:   invokevirtual Method sr n (J)I
L350:   ldc_w -709089635
L353:   imul
L354:   putstatic Field sk e I
L357:   iconst_0
L358:   istore_1

        .stack append Integer
L359:   iload_1
L360:   ldc_w 970166197
L363:   getstatic Field sk e I
L366:   imul
L367:   if_icmpge L382
L370:   aload_0
L371:   bipush 42
L373:   invokevirtual Method sk g (B)V
L376:   iinc 1 1
L379:   goto L359

        .stack same
L382:   aload_0
L383:   ldc_w 2058044390
L386:   invokevirtual Method sk i (I)V
L389:   getstatic Field ahs g Ljava/awt/Canvas;
L392:   ldc_w 165759862
L395:   invokestatic Method f a (Ljava/lang/Object;I)V
L398:   goto L308

        .stack chop 1
L401:   return
L402:   
        .linenumbertable
            L0 522
            L7 523
            L14 524
            L36 525
            L40 526
            L149 527
            L159 528
            L160 530
            L170 531
            L173 532
            L199 533
            L208 534
            L231 535
            L241 536
            L242 541
            L252 542
            L272 543
            L285 544
            L292 545
            L299 546
            L308 547
            L337 548
            L357 549
            L382 550
            L389 551
            L401 553
        .end linenumbertable
    .end code
.end method

.method static cm : ()J
    .code stack 2 locals 0
L0:     getstatic Field sk f Lsr;
L3:     ldc_w 1943217329
L6:     invokevirtual Method sr w (I)J
L9:     lreturn
L10:    
        .linenumbertable
            L0 656
        .end linenumbertable
    .end code
.end method

.method public static final dl : (ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V
    .code stack 6 locals 9
L0:     getstatic Field ahs g Ljava/awt/Canvas;
L3:     invokevirtual Method java/awt/Canvas getGraphics ()Ljava/awt/Graphics;
L6:     astore 5
L8:     getstatic Field acr x Ljava/awt/Font;
L11:    ifnonnull L30
L14:    new java/awt/Font
L17:    dup
L18:    ldc_w "Helvetica"
L21:    iconst_1
L22:    bipush 13
L24:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L27:    putstatic Field acr x Ljava/awt/Font;

        .stack append Object java/awt/Graphics
L30:    aload_2
L31:    ifnonnull L49
L34:    new java/awt/Color
L37:    dup
L38:    sipush 140
L41:    bipush 17
L43:    bipush 17
L45:    invokespecial Method java/awt/Color <init> (III)V
L48:    astore_2

        .stack same
L49:    aconst_null
L50:    aload_3
L51:    if_acmpne L69
L54:    new java/awt/Color
L57:    dup
L58:    sipush 140
L61:    bipush 17
L63:    bipush 17
L65:    invokespecial Method java/awt/Color <init> (III)V
L68:    astore_3

        .stack same
L69:    aload 4
L71:    ifnonnull L92
L74:    new java/awt/Color
L77:    dup
L78:    sipush 255
L81:    sipush 255
L84:    sipush 255
L87:    invokespecial Method java/awt/Color <init> (III)V
L90:    astore 4
        .catch java/lang/Exception from L92 to L401 using L404
        .catch java/lang/Exception from L0 to L664 using L667

        .stack same
L92:    aconst_null
L93:    getstatic Field ho t Ljava/awt/Image;
L96:    if_acmpne L122
L99:    getstatic Field ahs g Ljava/awt/Canvas;
L102:   getstatic Field sk r I
L105:   ldc_w -1378711501
L108:   imul
L109:   getstatic Field sk v I
L112:   ldc_w 2091353777
L115:   imul
L116:   invokevirtual Method java/awt/Canvas createImage (II)Ljava/awt/Image;
L119:   putstatic Field ho t Ljava/awt/Image;

        .stack same
L122:   getstatic Field ho t Ljava/awt/Image;
L125:   invokevirtual Method java/awt/Image getGraphics ()Ljava/awt/Graphics;
L128:   astore 6
L130:   aload 6
L132:   getstatic Field java/awt/Color black Ljava/awt/Color;
L135:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L138:   aload 6
L140:   iconst_0
L141:   iconst_0
L142:   getstatic Field sk r I
L145:   ldc_w -1378711501
L148:   imul
L149:   getstatic Field sk v I
L152:   ldc_w 2091353777
L155:   imul
L156:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L159:   ldc_w -1378711501
L162:   getstatic Field sk r I
L165:   imul
L166:   iconst_2
L167:   idiv
L168:   sipush 152
L171:   isub
L172:   istore 7
L174:   getstatic Field sk v I
L177:   ldc_w 2091353777
L180:   imul
L181:   iconst_2
L182:   idiv
L183:   bipush 18
L185:   isub
L186:   istore 8
L188:   aload 6
L190:   aload_3
L191:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L194:   aload 6
L196:   iload 7
L198:   iload 8
L200:   sipush 303
L203:   bipush 33
L205:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L208:   aload 6
L210:   aload_2
L211:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L214:   aload 6
L216:   iconst_2
L217:   iload 7
L219:   iadd
L220:   iload 8
L222:   iconst_2
L223:   iadd
L224:   iload_0
L225:   iconst_3
L226:   imul
L227:   bipush 30
L229:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L232:   aload 6
L234:   getstatic Field java/awt/Color black Ljava/awt/Color;
L237:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L240:   aload 6
L242:   iload 7
L244:   iconst_1
L245:   iadd
L246:   iload 8
L248:   iconst_1
L249:   iadd
L250:   sipush 301
L253:   bipush 31
L255:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L258:   aload 6
L260:   iload_0
L261:   iconst_3
L262:   imul
L263:   iconst_2
L264:   iload 7
L266:   iadd
L267:   iadd
L268:   iload 8
L270:   iconst_2
L271:   iadd
L272:   sipush 300
L275:   iconst_3
L276:   iload_0
L277:   imul
L278:   isub
L279:   bipush 30
L281:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L284:   aload 6
L286:   getstatic Field acr x Ljava/awt/Font;
L289:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L292:   aload 6
L294:   aload 4
L296:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L299:   aload 6
L301:   aload_1
L302:   iload 7
L304:   sipush 304
L307:   aload_1
L308:   invokevirtual Method java/lang/String length ()I
L311:   bipush 6
L313:   imul
L314:   isub
L315:   iconst_2
L316:   idiv
L317:   iadd
L318:   iload 8
L320:   bipush 22
L322:   iadd
L323:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V
L326:   aconst_null
L327:   getstatic Field sk b Ljava/lang/String;
L330:   if_acmpeq L389
L333:   aload 6
L335:   getstatic Field acr x Ljava/awt/Font;
L338:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L341:   aload 6
L343:   aload 4
L345:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L348:   aload 6
L350:   getstatic Field sk b Ljava/lang/String;
L353:   getstatic Field sk r I
L356:   ldc_w -1378711501
L359:   imul
L360:   iconst_2
L361:   idiv
L362:   getstatic Field sk b Ljava/lang/String;
L365:   invokevirtual Method java/lang/String length ()I
L368:   bipush 6
L370:   imul
L371:   iconst_2
L372:   idiv
L373:   isub
L374:   ldc_w 2091353777
L377:   getstatic Field sk v I
L380:   imul
L381:   iconst_2
L382:   idiv
L383:   bipush 26
L385:   isub
L386:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack append Object java/awt/Graphics Integer Integer
L389:   aload 5
L391:   getstatic Field ho t Ljava/awt/Image;
L394:   iconst_0
L395:   iconst_0
L396:   aconst_null
L397:   invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L400:   pop
L401:   goto L664

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color Object java/awt/Graphics
            stack Object java/lang/Exception
        .end stack
L404:   astore 6
L406:   aload 5
L408:   getstatic Field java/awt/Color black Ljava/awt/Color;
L411:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L414:   aload 5
L416:   iconst_0
L417:   iconst_0
L418:   getstatic Field sk r I
L421:   ldc_w -1378711501
L424:   imul
L425:   getstatic Field sk v I
L428:   ldc_w 2091353777
L431:   imul
L432:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L435:   getstatic Field sk r I
L438:   ldc_w -1378711501
L441:   imul
L442:   iconst_2
L443:   idiv
L444:   sipush 152
L447:   isub
L448:   istore 7
L450:   getstatic Field sk v I
L453:   ldc_w 2091353777
L456:   imul
L457:   iconst_2
L458:   idiv
L459:   bipush 18
L461:   isub
L462:   istore 8
L464:   aload 5
L466:   aload_3
L467:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L470:   aload 5
L472:   iload 7
L474:   iload 8
L476:   sipush 303
L479:   bipush 33
L481:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L484:   aload 5
L486:   aload_2
L487:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L490:   aload 5
L492:   iconst_2
L493:   iload 7
L495:   iadd
L496:   iconst_2
L497:   iload 8
L499:   iadd
L500:   iload_0
L501:   iconst_3
L502:   imul
L503:   bipush 30
L505:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L508:   aload 5
L510:   getstatic Field java/awt/Color black Ljava/awt/Color;
L513:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L516:   aload 5
L518:   iload 7
L520:   iconst_1
L521:   iadd
L522:   iconst_1
L523:   iload 8
L525:   iadd
L526:   sipush 301
L529:   bipush 31
L531:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L534:   aload 5
L536:   iload_0
L537:   iconst_3
L538:   imul
L539:   iload 7
L541:   iconst_2
L542:   iadd
L543:   iadd
L544:   iconst_2
L545:   iload 8
L547:   iadd
L548:   sipush 300
L551:   iload_0
L552:   iconst_3
L553:   imul
L554:   isub
L555:   bipush 30
L557:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L560:   aload 5
L562:   getstatic Field acr x Ljava/awt/Font;
L565:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L568:   aload 5
L570:   aload 4
L572:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L575:   getstatic Field sk b Ljava/lang/String;
L578:   ifnull L637
L581:   aload 5
L583:   getstatic Field acr x Ljava/awt/Font;
L586:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L589:   aload 5
L591:   aload 4
L593:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L596:   aload 5
L598:   getstatic Field sk b Ljava/lang/String;
L601:   ldc_w -1378711501
L604:   getstatic Field sk r I
L607:   imul
L608:   iconst_2
L609:   idiv
L610:   getstatic Field sk b Ljava/lang/String;
L613:   invokevirtual Method java/lang/String length ()I
L616:   bipush 6
L618:   imul
L619:   iconst_2
L620:   idiv
L621:   isub
L622:   ldc_w 2091353777
L625:   getstatic Field sk v I
L628:   imul
L629:   iconst_2
L630:   idiv
L631:   bipush 26
L633:   isub
L634:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack append Object java/lang/Exception Integer Integer
L637:   aload 5
L639:   aload_1
L640:   iload 7
L642:   sipush 304
L645:   aload_1
L646:   invokevirtual Method java/lang/String length ()I
L649:   bipush 6
L651:   imul
L652:   isub
L653:   iconst_2
L654:   idiv
L655:   iadd
L656:   bipush 22
L658:   iload 8
L660:   iadd
L661:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color Object java/awt/Graphics Object java/lang/Object Integer Integer
            stack
        .end stack
L664:   goto L675

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color
            stack Object java/lang/Exception
        .end stack
L667:   astore 5
L669:   getstatic Field ahs g Ljava/awt/Canvas;
L672:   invokevirtual Method java/awt/Canvas repaint ()V

        .stack append Object java/lang/Object
L675:   return
L676:   
        .linenumbertable
            L0 718
            L8 719
            L14 720
            L30 722
            L49 723
            L69 724
            L92 726
            L122 727
            L130 728
            L138 729
            L159 730
            L174 731
            L188 732
            L194 733
            L208 734
            L214 735
            L232 736
            L240 737
            L258 738
            L284 739
            L292 740
            L299 741
            L326 742
            L333 743
            L341 744
            L348 745
            L389 747
            L401 769
            L404 749
            L406 750
            L414 751
            L435 752
            L450 753
            L464 754
            L470 755
            L484 756
            L490 757
            L508 758
            L516 759
            L534 760
            L560 761
            L568 762
            L575 763
            L581 764
            L589 765
            L596 766
            L637 768
            L664 773
            L667 771
            L669 772
            L675 774
        .end linenumbertable
    .end code
.end method

.method static ch : ()J
    .code stack 2 locals 0
L0:     getstatic Field sk f Lsr;
L3:     ldc_w 2046501842
L6:     invokevirtual Method sr w (I)J
L9:     lreturn
L10:    
        .linenumbertable
            L0 656
        .end linenumbertable
    .end code
.end method

.method public cb : ()V
    .code stack 4 locals 1
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     ldc_w 2091017695
L10:    invokestatic Method gz e (I)J
L13:    ldc2_w 4000L
L16:    ladd
L17:    ldc2_w -992610302756464965L
L20:    lmul
L21:    putstatic Field sk bk J
L24:    return
L25:    
        .linenumbertable
            L0 665
            L7 666
            L24 667
        .end linenumbertable
    .end code
.end method

.method public final dd : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 699
        .end linenumbertable
    .end code
.end method

.method public cy : ()V
    .code stack 4 locals 1
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     ldc_w 766378930
L10:    invokestatic Method gz e (I)J
L13:    ldc2_w 4000L
L16:    ladd
L17:    ldc2_w -992610302756464965L
L20:    lmul
L21:    putstatic Field sk bk J
L24:    return
L25:    
        .linenumbertable
            L0 665
            L7 666
            L24 667
        .end linenumbertable
    .end code
.end method

.method public cc : ()V
    .code stack 4 locals 1
L0:     getstatic Field sk bh Z
L3:     ifeq L7
L6:     return

        .stack same
L7:     ldc_w 1594748392
L10:    invokestatic Method gz e (I)J
L13:    ldc2_w 4000L
L16:    ladd
L17:    ldc2_w -992610302756464965L
L20:    lmul
L21:    putstatic Field sk bk J
L24:    return
L25:    
        .linenumbertable
            L0 665
            L7 666
            L24 667
        .end linenumbertable
    .end code
.end method

.method public final cz : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method sk paint (Ljava/awt/Graphics;)V
L5:     return
L6:     
        .linenumbertable
            L0 677
            L5 678
        .end linenumbertable
    .end code
.end method

.method bj : ()V
    .code stack 2 locals 1
L0:     getstatic Field ahs g Ljava/awt/Canvas;
L3:     ifnull L37
L6:     getstatic Field ahs g Ljava/awt/Canvas;
L9:     aload_0
L10:    invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L13:    getstatic Field ahs g Ljava/awt/Canvas;
L16:    invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L19:    getstatic Field java/awt/Color black Ljava/awt/Color;
L22:    invokevirtual Method java/awt/Container setBackground (Ljava/awt/Color;)V
L25:    getstatic Field ahs g Ljava/awt/Canvas;
L28:    invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L31:    getstatic Field ahs g Ljava/awt/Canvas;
L34:    invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V

        .stack same
L37:    return
L38:    
        .linenumbertable
            L0 484
            L6 485
            L13 486
            L25 487
            L37 489
        .end linenumbertable
    .end code
.end method

.method public final cj : (Ljava/awt/event/FocusEvent;)V
    .code stack 1 locals 2
L0:     iconst_1
L1:     putstatic Field sk ai Z
L4:     iconst_1
L5:     putstatic Field sk j Z
L8:     return
L9:     
        .linenumbertable
            L0 690
            L4 691
            L8 692
        .end linenumbertable
    .end code
.end method

.method public final cd : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 699
        .end linenumbertable
    .end code
.end method

.method public static br : ()Ljava/awt/Container;
    .code stack 2 locals 0
L0:     getstatic Field aqy a Ljava/awt/Frame;
L3:     ifnull L10
L6:     getstatic Field aqy a Ljava/awt/Frame;
L9:     areturn

        .stack same
L10:    aconst_null
L11:    getstatic Field vy h Ljava/awt/Frame;
L14:    if_acmpeq L21
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    areturn

        .stack same
L21:    getstatic Field aol i Ljava/applet/Applet;
L24:    areturn
L25:    
        .linenumbertable
            L0 457
            L10 458
            L21 459
        .end linenumbertable
    .end code
.end method

.method final cf : (Z)V
    .code stack 3 locals 4
L0:     aload_0
L1:     dup
L2:     astore_2
L3:     monitorenter
        .catch [0] from L4 to L12 using L22
L4:     getstatic Field sk bh Z
L7:     ifeq L13
L10:    aload_2
L11:    monitorexit
L12:    return
        .catch [0] from L13 to L19 using L22

        .stack append Object sk
L13:    iconst_1
L14:    putstatic Field sk bh Z
L17:    aload_2
L18:    monitorexit
L19:    goto L27
        .catch [0] from L22 to L25 using L22

        .stack stack_1 Object java/lang/Throwable
L22:    astore_3
L23:    aload_2
L24:    monitorexit
L25:    aload_3
L26:    athrow
        .catch java/lang/Exception from L27 to L33 using L36

        .stack same
L27:    aload_0
L28:    bipush -68
L30:    invokevirtual Method sk aw (B)V
L33:    goto L37

        .stack stack_1 Object java/lang/Exception
L36:    astore_2
        .catch java/lang/Exception from L37 to L94 using L97

        .stack full
            locals Object sk Integer Object java/lang/Object
            stack
        .end stack
L37:    getstatic Field sk ay Labp;
L40:    ldc_w 1216916480
L43:    invokevirtual Method abp e (I)V
L46:    iconst_0
L47:    istore_2

        .stack full
            locals Object sk Integer Integer
            stack
        .end stack
L48:    iload_2
L49:    ldc_w 694777127
L52:    getstatic Field b ap I
L55:    imul
L56:    if_icmpge L76
L59:    getstatic Field vs az [Labp;
L62:    iload_2
L63:    aaload
L64:    ldc_w 1216916480
L67:    invokevirtual Method abp e (I)V
L70:    iinc 2 1
L73:    goto L48

        .stack same
L76:    getstatic Field sk ab Labp;
L79:    ldc_w 1216916480
L82:    invokevirtual Method abp e (I)V
L85:    getstatic Field sk aj Labp;
L88:    ldc_w 1216916480
L91:    invokevirtual Method abp e (I)V
L94:    goto L98

        .stack full
            locals Object sk Integer
            stack Object java/lang/Exception
        .end stack
L97:    astore_2

        .stack same
L98:    aload_0
L99:    getfield Field sk bi Z
L102:   ifeq L112
        .catch java/lang/Throwable from L105 to L108 using L111
L105:   invokestatic Method jaclib/nanotime/QueryPerformanceCounter quit ()V
L108:   goto L112

        .stack stack_1 Object java/lang/Throwable
L111:   astore_2

        .stack same
L112:   ldc_w 237690969
L115:   invokestatic Method aah m (I)Z
L118:   ifeq L136
L121:   ldc_w 672839876
L124:   invokestatic Method ke n (I)Lrn;
L127:   ldc_w -1046733038
L130:   invokeinterface InterfaceMethod rn m (I)Z 2
L135:   pop

        .stack same
L136:   getstatic Field ahs g Ljava/awt/Canvas;
L139:   ifnull L165
        .catch java/lang/Exception from L142 to L161 using L164
L142:   getstatic Field ahs g Ljava/awt/Canvas;
L145:   aload_0
L146:   invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L149:   getstatic Field ahs g Ljava/awt/Canvas;
L152:   invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L155:   getstatic Field ahs g Ljava/awt/Canvas;
L158:   invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V
L161:   goto L165

        .stack stack_1 Object java/lang/Exception
L164:   astore_2

        .stack same
L165:   aconst_null
L166:   getstatic Field vy h Ljava/awt/Frame;
L169:   if_acmpeq L189
L172:   getstatic Field vy h Ljava/awt/Frame;
L175:   iconst_0
L176:   invokevirtual Method java/awt/Frame setVisible (Z)V
L179:   getstatic Field vy h Ljava/awt/Frame;
L182:   invokevirtual Method java/awt/Frame dispose ()V
L185:   aconst_null
L186:   putstatic Field vy h Ljava/awt/Frame;

        .stack same
L189:   return
L190:   
        .linenumbertable
            L0 606
            L4 607
            L13 608
            L17 609
            L27 611
            L33 613
            L37 615
            L46 616
            L76 617
            L85 618
            L94 620
            L98 621
            L105 623
            L108 625
            L112 628
            L136 630
            L142 632
            L149 633
            L161 635
            L165 637
            L172 638
            L179 639
            L185 640
            L189 642
        .end linenumbertable
    .end code
.end method

.method public final da : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 699
        .end linenumbertable
    .end code
.end method

.method public final dt : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 699
        .end linenumbertable
    .end code
.end method

.method public static bq : (Ljava/lang/String;Ljava/lang/String;Z)Labl;
    .code stack 6 locals 7
L0:     new java/io/File
L3:     dup
L4:     getstatic Field sx ar Ljava/io/File;
L7:     new java/lang/StringBuilder
L10:    dup
L11:    invokespecial Method java/lang/StringBuilder <init> ()V
L14:    ldc_w "preferences"
L17:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L20:    aload_0
L21:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L24:    ldc_w ".dat"
L27:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L30:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L33:    invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L36:    astore_3
L37:    aload_3
L38:    invokevirtual Method java/io/File exists ()Z
L41:    ifeq L64
        .catch java/io/IOException from L44 to L61 using L62
L44:    new abl
L47:    dup
L48:    aload_3
L49:    ldc "rw"
L51:    ldc2_w 10000L
L54:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L57:    astore 4
L59:    aload 4
L61:    areturn

        .stack full
            locals Object java/lang/String Object java/lang/String Integer Object java/io/File
            stack Object java/io/IOException
        .end stack
L62:    astore 4

        .stack same
L64:    ldc ""
L66:    astore 4
L68:    bipush 33
L70:    ldc_w -1839644543
L73:    getstatic Field jr aa I
L76:    imul
L77:    if_icmpne L88
L80:    ldc_w "_rc"
L83:    astore 4
L85:    goto L105

        .stack append Object java/lang/String
L88:    bipush 34
L90:    getstatic Field jr aa I
L93:    ldc_w -1839644543
L96:    imul
L97:    if_icmpne L105
L100:   ldc_w "_wip"
L103:   astore 4

        .stack same
L105:   new java/io/File
L108:   dup
L109:   getstatic Field pk by Ljava/lang/String;
L112:   new java/lang/StringBuilder
L115:   dup
L116:   invokespecial Method java/lang/StringBuilder <init> ()V
L119:   ldc_w "jagex_"
L122:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L125:   aload_1
L126:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L129:   ldc_w "_preferences"
L132:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L135:   aload_0
L136:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L139:   aload 4
L141:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L144:   ldc_w ".dat"
L147:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L150:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L153:   invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L156:   astore 5
L158:   iload_2
L159:   ifne L191
L162:   aload 5
L164:   invokevirtual Method java/io/File exists ()Z
L167:   ifeq L191
        .catch java/io/IOException from L170 to L188 using L189
L170:   new abl
L173:   dup
L174:   aload 5
L176:   ldc "rw"
L178:   ldc2_w 10000L
L181:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L184:   astore 6
L186:   aload 6
L188:   areturn

        .stack full
            locals Object java/lang/String Object java/lang/String Integer Object java/io/File Object java/lang/String Object java/io/File
            stack Object java/io/IOException
        .end stack
L189:   astore 6
        .catch java/io/IOException from L191 to L208 using L209

        .stack same
L191:   new abl
L194:   dup
L195:   aload_3
L196:   ldc "rw"
L198:   ldc2_w 10000L
L201:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L204:   astore 6
L206:   aload 6
L208:   areturn

        .stack stack_1 Object java/io/IOException
L209:   astore 6
L211:   new java/lang/RuntimeException
L214:   dup
L215:   invokespecial Method java/lang/RuntimeException <init> ()V
L218:   athrow
L219:   
        .linenumbertable
            L0 353
            L37 354
            L44 356
            L59 357
            L62 359
            L64 361
            L68 362
            L88 363
            L105 364
            L158 365
            L170 367
            L186 368
            L189 370
            L191 373
            L206 374
            L209 376
            L211 377
        .end linenumbertable
    .end code
.end method

.method static bm : ()V
    .code stack 8 locals 4
        .catch java/io/IOException from L0 to L230 using L233
L0:     new java/io/File
L3:     dup
L4:     getstatic Field pk by Ljava/lang/String;
L7:     ldc "random.dat"
L9:     invokespecial Method java/io/File <init> (Ljava/lang/String;Ljava/lang/String;)V
L12:    astore_0
L13:    aload_0
L14:    invokevirtual Method java/io/File exists ()Z
L17:    ifeq L49
L20:    new abp
L23:    dup
L24:    new abl
L27:    dup
L28:    aload_0
L29:    ldc "rw"
L31:    ldc2_w 25L
L34:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L37:    bipush 24
L39:    iconst_0
L40:    invokespecial Method abp <init> (Labl;II)V
L43:    putstatic Field sk aj Labp;
L46:    goto L162

        .stack append Object java/io/File
L49:    iconst_0
L50:    istore_1

        .stack append Integer
L51:    iload_1
L52:    getstatic Field la ak [Ljava/lang/String;
L55:    arraylength
L56:    if_icmpge L162
L59:    iconst_0
L60:    istore_2

        .stack append Integer
L61:    iload_2
L62:    getstatic Field y af [Ljava/lang/String;
L65:    arraylength
L66:    if_icmpge L156
L69:    new java/io/File
L72:    dup
L73:    new java/lang/StringBuilder
L76:    dup
L77:    invokespecial Method java/lang/StringBuilder <init> ()V
L80:    getstatic Field y af [Ljava/lang/String;
L83:    iload_2
L84:    aaload
L85:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L88:    getstatic Field la ak [Ljava/lang/String;
L91:    iload_1
L92:    aaload
L93:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L96:    getstatic Field java/io/File separatorChar C
L99:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L102:   ldc "random.dat"
L104:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L107:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L110:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L113:   astore_3
L114:   aload_3
L115:   invokevirtual Method java/io/File exists ()Z
L118:   ifeq L150
L121:   new abp
L124:   dup
L125:   new abl
L128:   dup
L129:   aload_3
L130:   ldc "rw"
L132:   ldc2_w 25L
L135:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L138:   bipush 24
L140:   iconst_0
L141:   invokespecial Method abp <init> (Labl;II)V
L144:   putstatic Field sk aj Labp;
L147:   goto L162

        .stack append Object java/io/File
L150:   iinc 2 1
L153:   goto L61

        .stack chop 1
L156:   iinc 1 1
L159:   goto L51

        .stack chop 2
L162:   aconst_null
L163:   getstatic Field sk aj Labp;
L166:   if_acmpne L230
L169:   new java/io/RandomAccessFile
L172:   dup
L173:   aload_0
L174:   ldc "rw"
L176:   invokespecial Method java/io/RandomAccessFile <init> (Ljava/io/File;Ljava/lang/String;)V
L179:   astore_1
L180:   aload_1
L181:   invokevirtual Method java/io/RandomAccessFile read ()I
L184:   istore_2
L185:   aload_1
L186:   lconst_0
L187:   invokevirtual Method java/io/RandomAccessFile seek (J)V
L190:   aload_1
L191:   iload_2
L192:   invokevirtual Method java/io/RandomAccessFile write (I)V
L195:   aload_1
L196:   lconst_0
L197:   invokevirtual Method java/io/RandomAccessFile seek (J)V
L200:   aload_1
L201:   invokevirtual Method java/io/RandomAccessFile close ()V
L204:   new abp
L207:   dup
L208:   new abl
L211:   dup
L212:   aload_0
L213:   ldc "rw"
L215:   ldc2_w 25L
L218:   invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L221:   bipush 24
L223:   iconst_0
L224:   invokespecial Method abp <init> (Labl;II)V
L227:   putstatic Field sk aj Labp;

        .stack same_extended
L230:   goto L234

        .stack full
            locals
            stack Object java/io/IOException
        .end stack
L233:   astore_0

        .stack append Object java/lang/Object
L234:   return
L235:   
        .linenumbertable
            L0 382
            L13 383
            L20 384
            L49 387
            L59 388
            L69 389
            L114 390
            L121 391
            L147 392
            L150 388
            L156 387
            L162 397
            L169 398
            L180 399
            L185 400
            L190 401
            L195 402
            L200 403
            L204 404
            L230 407
            L234 408
        .end linenumbertable
    .end code
.end method

.method public final dv : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 706
        .end linenumbertable
    .end code
.end method

.method public static bv : ()Ljava/awt/Container;
    .code stack 2 locals 0
L0:     getstatic Field aqy a Ljava/awt/Frame;
L3:     ifnull L10
L6:     getstatic Field aqy a Ljava/awt/Frame;
L9:     areturn

        .stack same
L10:    aconst_null
L11:    getstatic Field vy h Ljava/awt/Frame;
L14:    if_acmpeq L21
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    areturn

        .stack same
L21:    getstatic Field aol i Ljava/applet/Applet;
L24:    areturn
L25:    
        .linenumbertable
            L0 457
            L10 458
            L21 459
        .end linenumbertable
    .end code
.end method

.method public static final cr : ()V
    .code stack 4 locals 1
L0:     getstatic Field sk f Lsr;
L3:     bipush -26
L5:     invokevirtual Method sr m (B)V
L8:     iconst_0
L9:     istore_0

        .stack append Integer
L10:    iload_0
L11:    bipush 32
L13:    if_icmpge L28
L16:    getstatic Field sk l [J
L19:    iload_0
L20:    lconst_0
L21:    lastore
L22:    iinc 0 1
L25:    goto L10

        .stack same
L28:    iconst_0
L29:    istore_0

        .stack same
L30:    iload_0
L31:    bipush 32
L33:    if_icmpge L48
L36:    getstatic Field sk z [J
L39:    iload_0
L40:    lconst_0
L41:    lastore
L42:    iinc 0 1
L45:    goto L30

        .stack same
L48:    iconst_0
L49:    putstatic Field sk e I
L52:    return
L53:    
        .linenumbertable
            L0 649
            L8 650
            L28 651
            L48 652
            L52 653
        .end linenumbertable
    .end code
.end method

.method public final dc : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 708
        .end linenumbertable
    .end code
.end method

.method public final di : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 709
        .end linenumbertable
    .end code
.end method

.method public abstract dk : ()V
.end method

.method q : (Ljava/awt/Container;I)V
    .code stack 5 locals 4
        .catch java/lang/RuntimeException from L0 to L164 using L164
L0:     aload_1
L1:     getstatic Field java/awt/Color black Ljava/awt/Color;
L4:     invokevirtual Method java/awt/Container setBackground (Ljava/awt/Color;)V
L7:     aload_1
L8:     aconst_null
L9:     invokevirtual Method java/awt/Container setLayout (Ljava/awt/LayoutManager;)V
L12:    aload_1
L13:    getstatic Field ahs g Ljava/awt/Canvas;
L16:    invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L19:    pop
L20:    getstatic Field ahs g Ljava/awt/Canvas;
L23:    ldc_w -1378711501
L26:    getstatic Field sk r I
L29:    imul
L30:    getstatic Field sk v I
L33:    ldc_w 2091353777
L36:    imul
L37:    invokevirtual Method java/awt/Canvas setSize (II)V
L40:    getstatic Field ahs g Ljava/awt/Canvas;
L43:    iconst_1
L44:    invokevirtual Method java/awt/Canvas setVisible (Z)V
L47:    getstatic Field vy h Ljava/awt/Frame;
L50:    aload_1
L51:    if_acmpne L94
L54:    getstatic Field vy h Ljava/awt/Frame;
L57:    invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L60:    astore_3
L61:    getstatic Field ahs g Ljava/awt/Canvas;
L64:    aload_3
L65:    getfield Field java/awt/Insets left I
L68:    ldc_w 495533241
L71:    getstatic Field sk y I
L74:    imul
L75:    iadd
L76:    aload_3
L77:    getfield Field java/awt/Insets top I
L80:    ldc_w -1074927711
L83:    getstatic Field sk q I
L86:    imul
L87:    iadd
L88:    invokevirtual Method java/awt/Canvas setLocation (II)V
L91:    goto L114

        .stack same_extended
L94:    getstatic Field ahs g Ljava/awt/Canvas;
L97:    ldc_w 495533241
L100:   getstatic Field sk y I
L103:   imul
L104:   ldc_w -1074927711
L107:   getstatic Field sk q I
L110:   imul
L111:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L114:   getstatic Field ahs g Ljava/awt/Canvas;
L117:   aload_0
L118:   invokevirtual Method java/awt/Canvas addFocusListener (Ljava/awt/event/FocusListener;)V
L121:   getstatic Field ahs g Ljava/awt/Canvas;
L124:   invokevirtual Method java/awt/Canvas requestFocus ()V
L127:   iconst_1
L128:   putstatic Field aar aw Z
L131:   iconst_1
L132:   putstatic Field sk ai Z
L135:   getstatic Field ahs g Ljava/awt/Canvas;
L138:   iconst_0
L139:   invokevirtual Method java/awt/Canvas setFocusTraversalKeysEnabled (Z)V
L142:   iconst_1
L143:   putstatic Field sk j Z
L146:   iconst_0
L147:   putstatic Field sk ag Z
L150:   ldc_w -275359244
L153:   invokestatic Method gz e (I)J
L156:   ldc2_w -4981684860522027511L
L159:   lmul
L160:   putstatic Field sk ah J
L163:   return

        .stack stack_1 Object java/lang/RuntimeException
L164:   new java/lang/StringBuilder
L167:   dup
L168:   invokespecial Method java/lang/StringBuilder <init> ()V
L171:   ldc_w "sk.q("
L174:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L177:   ldc 41
L179:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L182:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L185:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L188:   athrow
L189:   
        .linenumbertable
            L0 463
            L7 464
            L12 465
            L20 466
            L40 467
            L47 468
            L54 469
            L61 470
            L91 471
            L94 472
            L114 473
            L121 474
            L127 475
            L131 476
            L135 477
            L142 478
            L146 479
            L150 480
            L163 481
        .end linenumbertable
    .end code
.end method

.method abstract df : ()V
.end method

.method public static bo : ()Ljava/awt/Container;
    .code stack 2 locals 0
L0:     getstatic Field aqy a Ljava/awt/Frame;
L3:     ifnull L10
L6:     getstatic Field aqy a Ljava/awt/Frame;
L9:     areturn

        .stack same
L10:    aconst_null
L11:    getstatic Field vy h Ljava/awt/Frame;
L14:    if_acmpeq L21
L17:    getstatic Field vy h Ljava/awt/Frame;
L20:    areturn

        .stack same
L21:    getstatic Field aol i Ljava/applet/Applet;
L24:    areturn
L25:    
        .linenumbertable
            L0 457
            L10 458
            L21 459
        .end linenumbertable
    .end code
.end method

.method public final dq : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 707
        .end linenumbertable
    .end code
.end method

.method public static final du : (ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V
    .code stack 6 locals 9
L0:     getstatic Field ahs g Ljava/awt/Canvas;
L3:     invokevirtual Method java/awt/Canvas getGraphics ()Ljava/awt/Graphics;
L6:     astore 5
L8:     getstatic Field acr x Ljava/awt/Font;
L11:    ifnonnull L30
L14:    new java/awt/Font
L17:    dup
L18:    ldc_w "Helvetica"
L21:    iconst_1
L22:    bipush 13
L24:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L27:    putstatic Field acr x Ljava/awt/Font;

        .stack append Object java/awt/Graphics
L30:    aload_2
L31:    ifnonnull L49
L34:    new java/awt/Color
L37:    dup
L38:    sipush 140
L41:    bipush 17
L43:    bipush 17
L45:    invokespecial Method java/awt/Color <init> (III)V
L48:    astore_2

        .stack same
L49:    aconst_null
L50:    aload_3
L51:    if_acmpne L69
L54:    new java/awt/Color
L57:    dup
L58:    sipush 140
L61:    bipush 17
L63:    bipush 17
L65:    invokespecial Method java/awt/Color <init> (III)V
L68:    astore_3

        .stack same
L69:    aload 4
L71:    ifnonnull L92
L74:    new java/awt/Color
L77:    dup
L78:    sipush 255
L81:    sipush 255
L84:    sipush 255
L87:    invokespecial Method java/awt/Color <init> (III)V
L90:    astore 4
        .catch java/lang/Exception from L92 to L401 using L404
        .catch java/lang/Exception from L0 to L664 using L667

        .stack same
L92:    aconst_null
L93:    getstatic Field ho t Ljava/awt/Image;
L96:    if_acmpne L122
L99:    getstatic Field ahs g Ljava/awt/Canvas;
L102:   getstatic Field sk r I
L105:   ldc_w -1378711501
L108:   imul
L109:   getstatic Field sk v I
L112:   ldc_w 2091353777
L115:   imul
L116:   invokevirtual Method java/awt/Canvas createImage (II)Ljava/awt/Image;
L119:   putstatic Field ho t Ljava/awt/Image;

        .stack same
L122:   getstatic Field ho t Ljava/awt/Image;
L125:   invokevirtual Method java/awt/Image getGraphics ()Ljava/awt/Graphics;
L128:   astore 6
L130:   aload 6
L132:   getstatic Field java/awt/Color black Ljava/awt/Color;
L135:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L138:   aload 6
L140:   iconst_0
L141:   iconst_0
L142:   getstatic Field sk r I
L145:   ldc_w -1378711501
L148:   imul
L149:   getstatic Field sk v I
L152:   ldc_w 2091353777
L155:   imul
L156:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L159:   ldc_w -1378711501
L162:   getstatic Field sk r I
L165:   imul
L166:   iconst_2
L167:   idiv
L168:   sipush 152
L171:   isub
L172:   istore 7
L174:   getstatic Field sk v I
L177:   ldc_w 2091353777
L180:   imul
L181:   iconst_2
L182:   idiv
L183:   bipush 18
L185:   isub
L186:   istore 8
L188:   aload 6
L190:   aload_3
L191:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L194:   aload 6
L196:   iload 7
L198:   iload 8
L200:   sipush 303
L203:   bipush 33
L205:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L208:   aload 6
L210:   aload_2
L211:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L214:   aload 6
L216:   iconst_2
L217:   iload 7
L219:   iadd
L220:   iload 8
L222:   iconst_2
L223:   iadd
L224:   iload_0
L225:   iconst_3
L226:   imul
L227:   bipush 30
L229:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L232:   aload 6
L234:   getstatic Field java/awt/Color black Ljava/awt/Color;
L237:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L240:   aload 6
L242:   iload 7
L244:   iconst_1
L245:   iadd
L246:   iload 8
L248:   iconst_1
L249:   iadd
L250:   sipush 301
L253:   bipush 31
L255:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L258:   aload 6
L260:   iload_0
L261:   iconst_3
L262:   imul
L263:   iconst_2
L264:   iload 7
L266:   iadd
L267:   iadd
L268:   iload 8
L270:   iconst_2
L271:   iadd
L272:   sipush 300
L275:   iconst_3
L276:   iload_0
L277:   imul
L278:   isub
L279:   bipush 30
L281:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L284:   aload 6
L286:   getstatic Field acr x Ljava/awt/Font;
L289:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L292:   aload 6
L294:   aload 4
L296:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L299:   aload 6
L301:   aload_1
L302:   iload 7
L304:   sipush 304
L307:   aload_1
L308:   invokevirtual Method java/lang/String length ()I
L311:   bipush 6
L313:   imul
L314:   isub
L315:   iconst_2
L316:   idiv
L317:   iadd
L318:   iload 8
L320:   bipush 22
L322:   iadd
L323:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V
L326:   aconst_null
L327:   getstatic Field sk b Ljava/lang/String;
L330:   if_acmpeq L389
L333:   aload 6
L335:   getstatic Field acr x Ljava/awt/Font;
L338:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L341:   aload 6
L343:   aload 4
L345:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L348:   aload 6
L350:   getstatic Field sk b Ljava/lang/String;
L353:   getstatic Field sk r I
L356:   ldc_w -1378711501
L359:   imul
L360:   iconst_2
L361:   idiv
L362:   getstatic Field sk b Ljava/lang/String;
L365:   invokevirtual Method java/lang/String length ()I
L368:   bipush 6
L370:   imul
L371:   iconst_2
L372:   idiv
L373:   isub
L374:   ldc_w 2091353777
L377:   getstatic Field sk v I
L380:   imul
L381:   iconst_2
L382:   idiv
L383:   bipush 26
L385:   isub
L386:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack append Object java/awt/Graphics Integer Integer
L389:   aload 5
L391:   getstatic Field ho t Ljava/awt/Image;
L394:   iconst_0
L395:   iconst_0
L396:   aconst_null
L397:   invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L400:   pop
L401:   goto L664

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color Object java/awt/Graphics
            stack Object java/lang/Exception
        .end stack
L404:   astore 6
L406:   aload 5
L408:   getstatic Field java/awt/Color black Ljava/awt/Color;
L411:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L414:   aload 5
L416:   iconst_0
L417:   iconst_0
L418:   getstatic Field sk r I
L421:   ldc_w -1378711501
L424:   imul
L425:   getstatic Field sk v I
L428:   ldc_w 2091353777
L431:   imul
L432:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L435:   getstatic Field sk r I
L438:   ldc_w -1378711501
L441:   imul
L442:   iconst_2
L443:   idiv
L444:   sipush 152
L447:   isub
L448:   istore 7
L450:   getstatic Field sk v I
L453:   ldc_w 2091353777
L456:   imul
L457:   iconst_2
L458:   idiv
L459:   bipush 18
L461:   isub
L462:   istore 8
L464:   aload 5
L466:   aload_3
L467:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L470:   aload 5
L472:   iload 7
L474:   iload 8
L476:   sipush 303
L479:   bipush 33
L481:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L484:   aload 5
L486:   aload_2
L487:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L490:   aload 5
L492:   iconst_2
L493:   iload 7
L495:   iadd
L496:   iconst_2
L497:   iload 8
L499:   iadd
L500:   iload_0
L501:   iconst_3
L502:   imul
L503:   bipush 30
L505:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L508:   aload 5
L510:   getstatic Field java/awt/Color black Ljava/awt/Color;
L513:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L516:   aload 5
L518:   iload 7
L520:   iconst_1
L521:   iadd
L522:   iconst_1
L523:   iload 8
L525:   iadd
L526:   sipush 301
L529:   bipush 31
L531:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L534:   aload 5
L536:   iload_0
L537:   iconst_3
L538:   imul
L539:   iload 7
L541:   iconst_2
L542:   iadd
L543:   iadd
L544:   iconst_2
L545:   iload 8
L547:   iadd
L548:   sipush 300
L551:   iload_0
L552:   iconst_3
L553:   imul
L554:   isub
L555:   bipush 30
L557:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L560:   aload 5
L562:   getstatic Field acr x Ljava/awt/Font;
L565:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L568:   aload 5
L570:   aload 4
L572:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L575:   getstatic Field sk b Ljava/lang/String;
L578:   ifnull L637
L581:   aload 5
L583:   getstatic Field acr x Ljava/awt/Font;
L586:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L589:   aload 5
L591:   aload 4
L593:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L596:   aload 5
L598:   getstatic Field sk b Ljava/lang/String;
L601:   ldc_w -1378711501
L604:   getstatic Field sk r I
L607:   imul
L608:   iconst_2
L609:   idiv
L610:   getstatic Field sk b Ljava/lang/String;
L613:   invokevirtual Method java/lang/String length ()I
L616:   bipush 6
L618:   imul
L619:   iconst_2
L620:   idiv
L621:   isub
L622:   ldc_w 2091353777
L625:   getstatic Field sk v I
L628:   imul
L629:   iconst_2
L630:   idiv
L631:   bipush 26
L633:   isub
L634:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack append Object java/lang/Exception Integer Integer
L637:   aload 5
L639:   aload_1
L640:   iload 7
L642:   sipush 304
L645:   aload_1
L646:   invokevirtual Method java/lang/String length ()I
L649:   bipush 6
L651:   imul
L652:   isub
L653:   iconst_2
L654:   idiv
L655:   iadd
L656:   bipush 22
L658:   iload 8
L660:   iadd
L661:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color Object java/awt/Graphics Object java/lang/Object Integer Integer
            stack
        .end stack
L664:   goto L675

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color
            stack Object java/lang/Exception
        .end stack
L667:   astore 5
L669:   getstatic Field ahs g Ljava/awt/Canvas;
L672:   invokevirtual Method java/awt/Canvas repaint ()V

        .stack append Object java/lang/Object
L675:   return
L676:   
        .linenumbertable
            L0 718
            L8 719
            L14 720
            L30 722
            L49 723
            L69 724
            L92 726
            L122 727
            L130 728
            L138 729
            L159 730
            L174 731
            L188 732
            L194 733
            L208 734
            L214 735
            L232 736
            L240 737
            L258 738
            L284 739
            L292 740
            L299 741
            L326 742
            L333 743
            L341 744
            L348 745
            L389 747
            L401 769
            L404 749
            L406 750
            L414 751
            L435 752
            L450 753
            L464 754
            L470 755
            L484 756
            L490 757
            L508 758
            L516 759
            L534 760
            L560 761
            L568 762
            L575 763
            L581 764
            L589 765
            L596 766
            L637 768
            L664 773
            L667 771
            L669 772
            L675 774
        .end linenumbertable
    .end code
.end method

.method cx : ()V
    .code stack 5 locals 8
L0:     ldc_w 1515076156
L3:     invokestatic Method gz e (I)J
L6:     lstore_1
L7:     getstatic Field sk l [J
L10:    getstatic Field sk u I
L13:    ldc_w -1288987007
L16:    imul
L17:    iconst_1
L18:    isub
L19:    bipush 31
L21:    iand
L22:    laload
L23:    lstore_3
L24:    getstatic Field sk l [J
L27:    ldc_w -1288987007
L30:    getstatic Field sk u I
L33:    imul
L34:    laload
L35:    lstore 5
L37:    getstatic Field sk l [J
L40:    ldc_w -1288987007
L43:    getstatic Field sk u I
L46:    imul
L47:    lload_1
L48:    lastore
L49:    iconst_1
L50:    getstatic Field sk u I
L53:    ldc_w -1288987007
L56:    imul
L57:    iadd
L58:    bipush 31
L60:    iand
L61:    ldc_w -1990811263
L64:    imul
L65:    putstatic Field sk u I
L68:    lload 5
L70:    lconst_0
L71:    lcmp
L72:    ifeq L118
L75:    lload_1
L76:    lload 5
L78:    lcmp
L79:    ifle L118
L82:    lload_1
L83:    lload 5
L85:    lsub
L86:    l2i
L87:    istore 7
L89:    ldc_w 406073307
L92:    lload_1
L93:    lload_3
L94:    lsub
L95:    l2i
L96:    imul
L97:    putstatic Field sk k I
L100:   iload 7
L102:   iconst_1
L103:   ishr
L104:   sipush 32000
L107:   iadd
L108:   iload 7
L110:   idiv
L111:   ldc_w -332499549
L114:   imul
L115:   putstatic Field sk m I

        .stack append Long Long Long
L118:   getstatic Field sk ae I
L121:   ldc_w 1670111301
L124:   iadd
L125:   dup
L126:   putstatic Field sk ae I
L129:   ldc_w -133680499
L132:   imul
L133:   iconst_1
L134:   isub
L135:   bipush 50
L137:   if_icmple L258
L140:   getstatic Field sk ae I
L143:   ldc_w 1901186426
L146:   isub
L147:   putstatic Field sk ae I
L150:   iconst_1
L151:   putstatic Field sk j Z
L154:   getstatic Field ahs g Ljava/awt/Canvas;
L157:   ldc_w -1378711501
L160:   getstatic Field sk r I
L163:   imul
L164:   getstatic Field sk v I
L167:   ldc_w 2091353777
L170:   imul
L171:   invokevirtual Method java/awt/Canvas setSize (II)V
L174:   getstatic Field ahs g Ljava/awt/Canvas;
L177:   iconst_1
L178:   invokevirtual Method java/awt/Canvas setVisible (Z)V
L181:   aconst_null
L182:   getstatic Field vy h Ljava/awt/Frame;
L185:   if_acmpeq L238
L188:   aconst_null
L189:   getstatic Field aqy a Ljava/awt/Frame;
L192:   if_acmpne L238
L195:   getstatic Field vy h Ljava/awt/Frame;
L198:   invokevirtual Method java/awt/Frame getInsets ()Ljava/awt/Insets;
L201:   astore 7
L203:   getstatic Field ahs g Ljava/awt/Canvas;
L206:   aload 7
L208:   getfield Field java/awt/Insets left I
L211:   ldc_w 495533241
L214:   getstatic Field sk y I
L217:   imul
L218:   iadd
L219:   getstatic Field sk q I
L222:   ldc_w -1074927711
L225:   imul
L226:   aload 7
L228:   getfield Field java/awt/Insets top I
L231:   iadd
L232:   invokevirtual Method java/awt/Canvas setLocation (II)V
L235:   goto L258

        .stack same_extended
L238:   getstatic Field ahs g Ljava/awt/Canvas;
L241:   getstatic Field sk y I
L244:   ldc_w 495533241
L247:   imul
L248:   ldc_w -1074927711
L251:   getstatic Field sk q I
L254:   imul
L255:   invokevirtual Method java/awt/Canvas setLocation (II)V

        .stack same
L258:   aload_0
L259:   ldc_w 1943259820
L262:   invokevirtual Method sk ai (I)V
L265:   return
L266:   
        .linenumbertable
            L0 577
            L7 578
            L24 579
            L37 580
            L49 581
            L68 582
            L82 583
            L89 584
            L100 585
            L118 587
            L140 588
            L150 589
            L154 590
            L174 591
            L181 592
            L195 593
            L203 594
            L235 595
            L238 596
            L258 598
            L265 599
        .end linenumbertable
    .end code
.end method

.method public static final dp : (ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V
    .code stack 6 locals 9
L0:     getstatic Field ahs g Ljava/awt/Canvas;
L3:     invokevirtual Method java/awt/Canvas getGraphics ()Ljava/awt/Graphics;
L6:     astore 5
L8:     getstatic Field acr x Ljava/awt/Font;
L11:    ifnonnull L30
L14:    new java/awt/Font
L17:    dup
L18:    ldc_w "Helvetica"
L21:    iconst_1
L22:    bipush 13
L24:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L27:    putstatic Field acr x Ljava/awt/Font;

        .stack append Object java/awt/Graphics
L30:    aload_2
L31:    ifnonnull L49
L34:    new java/awt/Color
L37:    dup
L38:    sipush 140
L41:    bipush 17
L43:    bipush 17
L45:    invokespecial Method java/awt/Color <init> (III)V
L48:    astore_2

        .stack same
L49:    aconst_null
L50:    aload_3
L51:    if_acmpne L69
L54:    new java/awt/Color
L57:    dup
L58:    sipush 140
L61:    bipush 17
L63:    bipush 17
L65:    invokespecial Method java/awt/Color <init> (III)V
L68:    astore_3

        .stack same
L69:    aload 4
L71:    ifnonnull L92
L74:    new java/awt/Color
L77:    dup
L78:    sipush 255
L81:    sipush 255
L84:    sipush 255
L87:    invokespecial Method java/awt/Color <init> (III)V
L90:    astore 4
        .catch java/lang/Exception from L92 to L401 using L404
        .catch java/lang/Exception from L0 to L664 using L667

        .stack same
L92:    aconst_null
L93:    getstatic Field ho t Ljava/awt/Image;
L96:    if_acmpne L122
L99:    getstatic Field ahs g Ljava/awt/Canvas;
L102:   getstatic Field sk r I
L105:   ldc_w -1378711501
L108:   imul
L109:   getstatic Field sk v I
L112:   ldc_w 2091353777
L115:   imul
L116:   invokevirtual Method java/awt/Canvas createImage (II)Ljava/awt/Image;
L119:   putstatic Field ho t Ljava/awt/Image;

        .stack same
L122:   getstatic Field ho t Ljava/awt/Image;
L125:   invokevirtual Method java/awt/Image getGraphics ()Ljava/awt/Graphics;
L128:   astore 6
L130:   aload 6
L132:   getstatic Field java/awt/Color black Ljava/awt/Color;
L135:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L138:   aload 6
L140:   iconst_0
L141:   iconst_0
L142:   getstatic Field sk r I
L145:   ldc_w -1378711501
L148:   imul
L149:   getstatic Field sk v I
L152:   ldc_w 2091353777
L155:   imul
L156:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L159:   ldc_w -1378711501
L162:   getstatic Field sk r I
L165:   imul
L166:   iconst_2
L167:   idiv
L168:   sipush 152
L171:   isub
L172:   istore 7
L174:   getstatic Field sk v I
L177:   ldc_w 2091353777
L180:   imul
L181:   iconst_2
L182:   idiv
L183:   bipush 18
L185:   isub
L186:   istore 8
L188:   aload 6
L190:   aload_3
L191:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L194:   aload 6
L196:   iload 7
L198:   iload 8
L200:   sipush 303
L203:   bipush 33
L205:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L208:   aload 6
L210:   aload_2
L211:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L214:   aload 6
L216:   iconst_2
L217:   iload 7
L219:   iadd
L220:   iload 8
L222:   iconst_2
L223:   iadd
L224:   iload_0
L225:   iconst_3
L226:   imul
L227:   bipush 30
L229:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L232:   aload 6
L234:   getstatic Field java/awt/Color black Ljava/awt/Color;
L237:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L240:   aload 6
L242:   iload 7
L244:   iconst_1
L245:   iadd
L246:   iload 8
L248:   iconst_1
L249:   iadd
L250:   sipush 301
L253:   bipush 31
L255:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L258:   aload 6
L260:   iload_0
L261:   iconst_3
L262:   imul
L263:   iconst_2
L264:   iload 7
L266:   iadd
L267:   iadd
L268:   iload 8
L270:   iconst_2
L271:   iadd
L272:   sipush 300
L275:   iconst_3
L276:   iload_0
L277:   imul
L278:   isub
L279:   bipush 30
L281:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L284:   aload 6
L286:   getstatic Field acr x Ljava/awt/Font;
L289:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L292:   aload 6
L294:   aload 4
L296:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L299:   aload 6
L301:   aload_1
L302:   iload 7
L304:   sipush 304
L307:   aload_1
L308:   invokevirtual Method java/lang/String length ()I
L311:   bipush 6
L313:   imul
L314:   isub
L315:   iconst_2
L316:   idiv
L317:   iadd
L318:   iload 8
L320:   bipush 22
L322:   iadd
L323:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V
L326:   aconst_null
L327:   getstatic Field sk b Ljava/lang/String;
L330:   if_acmpeq L389
L333:   aload 6
L335:   getstatic Field acr x Ljava/awt/Font;
L338:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L341:   aload 6
L343:   aload 4
L345:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L348:   aload 6
L350:   getstatic Field sk b Ljava/lang/String;
L353:   getstatic Field sk r I
L356:   ldc_w -1378711501
L359:   imul
L360:   iconst_2
L361:   idiv
L362:   getstatic Field sk b Ljava/lang/String;
L365:   invokevirtual Method java/lang/String length ()I
L368:   bipush 6
L370:   imul
L371:   iconst_2
L372:   idiv
L373:   isub
L374:   ldc_w 2091353777
L377:   getstatic Field sk v I
L380:   imul
L381:   iconst_2
L382:   idiv
L383:   bipush 26
L385:   isub
L386:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack append Object java/awt/Graphics Integer Integer
L389:   aload 5
L391:   getstatic Field ho t Ljava/awt/Image;
L394:   iconst_0
L395:   iconst_0
L396:   aconst_null
L397:   invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L400:   pop
L401:   goto L664

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color Object java/awt/Graphics
            stack Object java/lang/Exception
        .end stack
L404:   astore 6
L406:   aload 5
L408:   getstatic Field java/awt/Color black Ljava/awt/Color;
L411:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L414:   aload 5
L416:   iconst_0
L417:   iconst_0
L418:   getstatic Field sk r I
L421:   ldc_w -1378711501
L424:   imul
L425:   getstatic Field sk v I
L428:   ldc_w 2091353777
L431:   imul
L432:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L435:   getstatic Field sk r I
L438:   ldc_w -1378711501
L441:   imul
L442:   iconst_2
L443:   idiv
L444:   sipush 152
L447:   isub
L448:   istore 7
L450:   getstatic Field sk v I
L453:   ldc_w 2091353777
L456:   imul
L457:   iconst_2
L458:   idiv
L459:   bipush 18
L461:   isub
L462:   istore 8
L464:   aload 5
L466:   aload_3
L467:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L470:   aload 5
L472:   iload 7
L474:   iload 8
L476:   sipush 303
L479:   bipush 33
L481:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L484:   aload 5
L486:   aload_2
L487:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L490:   aload 5
L492:   iconst_2
L493:   iload 7
L495:   iadd
L496:   iconst_2
L497:   iload 8
L499:   iadd
L500:   iload_0
L501:   iconst_3
L502:   imul
L503:   bipush 30
L505:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L508:   aload 5
L510:   getstatic Field java/awt/Color black Ljava/awt/Color;
L513:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L516:   aload 5
L518:   iload 7
L520:   iconst_1
L521:   iadd
L522:   iconst_1
L523:   iload 8
L525:   iadd
L526:   sipush 301
L529:   bipush 31
L531:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L534:   aload 5
L536:   iload_0
L537:   iconst_3
L538:   imul
L539:   iload 7
L541:   iconst_2
L542:   iadd
L543:   iadd
L544:   iconst_2
L545:   iload 8
L547:   iadd
L548:   sipush 300
L551:   iload_0
L552:   iconst_3
L553:   imul
L554:   isub
L555:   bipush 30
L557:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L560:   aload 5
L562:   getstatic Field acr x Ljava/awt/Font;
L565:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L568:   aload 5
L570:   aload 4
L572:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L575:   getstatic Field sk b Ljava/lang/String;
L578:   ifnull L637
L581:   aload 5
L583:   getstatic Field acr x Ljava/awt/Font;
L586:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L589:   aload 5
L591:   aload 4
L593:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L596:   aload 5
L598:   getstatic Field sk b Ljava/lang/String;
L601:   ldc_w -1378711501
L604:   getstatic Field sk r I
L607:   imul
L608:   iconst_2
L609:   idiv
L610:   getstatic Field sk b Ljava/lang/String;
L613:   invokevirtual Method java/lang/String length ()I
L616:   bipush 6
L618:   imul
L619:   iconst_2
L620:   idiv
L621:   isub
L622:   ldc_w 2091353777
L625:   getstatic Field sk v I
L628:   imul
L629:   iconst_2
L630:   idiv
L631:   bipush 26
L633:   isub
L634:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack append Object java/lang/Exception Integer Integer
L637:   aload 5
L639:   aload_1
L640:   iload 7
L642:   sipush 304
L645:   aload_1
L646:   invokevirtual Method java/lang/String length ()I
L649:   bipush 6
L651:   imul
L652:   isub
L653:   iconst_2
L654:   idiv
L655:   iadd
L656:   bipush 22
L658:   iload 8
L660:   iadd
L661:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color Object java/awt/Graphics Object java/lang/Object Integer Integer
            stack
        .end stack
L664:   goto L675

        .stack full
            locals Integer Object java/lang/String Object java/awt/Color Object java/awt/Color Object java/awt/Color
            stack Object java/lang/Exception
        .end stack
L667:   astore 5
L669:   getstatic Field ahs g Ljava/awt/Canvas;
L672:   invokevirtual Method java/awt/Canvas repaint ()V

        .stack append Object java/lang/Object
L675:   return
L676:   
        .linenumbertable
            L0 718
            L8 719
            L14 720
            L30 722
            L49 723
            L69 724
            L92 726
            L122 727
            L130 728
            L138 729
            L159 730
            L174 731
            L188 732
            L194 733
            L208 734
            L214 735
            L232 736
            L240 737
            L258 738
            L284 739
            L292 740
            L299 741
            L326 742
            L333 743
            L341 744
            L348 745
            L389 747
            L401 769
            L404 749
            L406 750
            L414 751
            L435 752
            L450 753
            L464 754
            L470 755
            L484 756
            L490 757
            L508 758
            L516 759
            L534 760
            L560 761
            L568 762
            L575 763
            L581 764
            L589 765
            L596 766
            L637 768
            L664 773
            L667 771
            L669 772
            L675 774
        .end linenumbertable
    .end code
.end method

.method public static final dy : ()V
    .code stack 1 locals 0
L0:     aconst_null
L1:     putstatic Field ho t Ljava/awt/Image;
L4:     aconst_null
L5:     putstatic Field acr x Ljava/awt/Font;
L8:     return
L9:     
        .linenumbertable
            L0 777
            L4 778
            L8 779
        .end linenumbertable
    .end code
.end method

.method db : (Ljava/lang/String;)V
    .code stack 6 locals 3
L0:     aload_0
L1:     getfield Field sk bx Z
L4:     ifeq L8
L7:     return

        .stack same
L8:     aload_0
L9:     iconst_1
L10:    putfield Field sk bx Z
L13:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L16:    new java/lang/StringBuilder
L19:    dup
L20:    invokespecial Method java/lang/StringBuilder <init> ()V
L23:    ldc_w "error_game_"
L26:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L29:    aload_1
L30:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L33:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L36:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/lang/Throwable from L39 to L52 using L55
L39:    getstatic Field aol i Ljava/applet/Applet;
L42:    ldc_w "loggedout"
L45:    ldc_w 2092136710
L48:    invokestatic Method act n (Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;
L51:    pop
L52:    goto L56

        .stack stack_1 Object java/lang/Throwable
L55:    astore_2
        .catch java/lang/Exception from L56 to L109 using L112

        .stack same
L56:    getstatic Field aol i Ljava/applet/Applet;
L59:    invokevirtual Method java/applet/Applet getAppletContext ()Ljava/applet/AppletContext;
L62:    new java/net/URL
L65:    dup
L66:    getstatic Field aol i Ljava/applet/Applet;
L69:    invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L72:    new java/lang/StringBuilder
L75:    dup
L76:    invokespecial Method java/lang/StringBuilder <init> ()V
L79:    ldc_w "error_game_"
L82:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L85:    aload_1
L86:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L89:    ldc_w ".ws"
L92:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L95:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L98:    invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L101:   ldc_w "_top"
L104:   invokeinterface InterfaceMethod java/applet/AppletContext showDocument (Ljava/net/URL;Ljava/lang/String;)V 3
L109:   goto L113

        .stack stack_1 Object java/lang/Exception
L112:   astore_2

        .stack same
L113:   return
L114:   
        .linenumbertable
            L0 782
            L8 783
            L13 784
            L39 786
            L52 788
            L56 790
            L109 792
            L113 793
        .end linenumbertable
    .end code
.end method

.method ce : ()V
    .code stack 6 locals 5
L0:     aconst_null
L1:     getstatic Field ky bn Ljava/lang/String;
L4:     if_acmpeq L242
L7:     getstatic Field ky bn Ljava/lang/String;
L10:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L13:    astore_1
L14:    aload_1
L15:    ldc_w "sun"
L18:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L21:    iconst_m1
L22:    if_icmpne L36
L25:    aload_1
L26:    ldc_w "apple"
L29:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L32:    iconst_m1
L33:    if_icmpeq L242

        .stack append Object java/lang/String
L36:    getstatic Field ae bt Ljava/lang/String;
L39:    astore_2
L40:    aload_2
L41:    ldc "1.1"
L43:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L46:    ifne L149
L49:    aload_2
L50:    ldc_w "1.1."
L53:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L56:    ifne L149
L59:    aload_2
L60:    ldc_w "1.2"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifne L149
L69:    aload_2
L70:    ldc_w "1.2."
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifne L149
L79:    aload_2
L80:    ldc_w "1.3"
L83:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L86:    ifne L149
L89:    aload_2
L90:    ldc_w "1.3."
L93:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L96:    ifne L149
L99:    aload_2
L100:   ldc_w "1.4"
L103:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L106:   ifne L149
L109:   aload_2
L110:   ldc_w "1.4."
L113:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L116:   ifne L149
L119:   aload_2
L120:   ldc_w "1.5"
L123:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L126:   ifne L149
L129:   aload_2
L130:   ldc_w "1.5."
L133:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L136:   ifne L149
L139:   aload_2
L140:   ldc_w "1.6.0"
L143:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L146:   ifeq L160

        .stack append Object java/lang/String
L149:   aload_0
L150:   ldc_w "wrongjava"
L153:   ldc_w -313025265
L156:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L159:   return

        .stack same
L160:   aload_2
L161:   ldc_w "1.6.0_"
L164:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L167:   ifeq L242
L170:   bipush 6
L172:   istore_3

        .stack append Integer
L173:   iload_3
L174:   aload_2
L175:   invokevirtual Method java/lang/String length ()I
L178:   if_icmpge L199
L181:   aload_2
L182:   iload_3
L183:   invokevirtual Method java/lang/String charAt (I)C
L186:   iconst_1
L187:   invokestatic Method pz o (CB)Z
L190:   ifeq L199
L193:   iinc 3 1
L196:   goto L173

        .stack same
L199:   aload_2
L200:   bipush 6
L202:   iload_3
L203:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L206:   astore 4
L208:   aload 4
L210:   ldc_w 250407149
L213:   invokestatic Method wc m (Ljava/lang/CharSequence;I)Z
L216:   ifeq L242
L219:   aload 4
L221:   bipush 8
L223:   invokestatic Method vk f (Ljava/lang/CharSequence;B)I
L226:   bipush 10
L228:   if_icmpge L242
L231:   aload_0
L232:   ldc_w "wrongjava"
L235:   ldc_w 1128403157
L238:   invokevirtual Method sk ad (Ljava/lang/String;I)V
L241:   return

        .stack chop 3
L242:   ldc_w -283088421
L245:   invokestatic Method qf y (I)Ljava/awt/Container;
L248:   iconst_1
L249:   invokevirtual Method java/awt/Container setFocusCycleRoot (Z)V
L252:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L255:   invokevirtual Method java/lang/Runtime maxMemory ()J
L258:   ldc2_w 1048576L
L261:   ldiv
L262:   l2i
L263:   iconst_1
L264:   iadd
L265:   ldc_w 2060182503
L268:   imul
L269:   putstatic Field sk bd I
L272:   invokestatic Method java/lang/Runtime getRuntime ()Ljava/lang/Runtime;
L275:   invokevirtual Method java/lang/Runtime availableProcessors ()I
L278:   ldc_w -1401201395
L281:   imul
L282:   putstatic Field sk bc I
L285:   aload_0
L286:   ldc_w -1483631858
L289:   invokevirtual Method sk s (I)V
L292:   aload_0
L293:   ldc_w -273589671
L296:   invokevirtual Method sk al (I)V
L299:   ldc_w 688839595
L302:   invokestatic Method nv e (I)Lsr;
L305:   putstatic Field sk f Lsr;

        .stack same_extended
L308:   ldc2_w -8807787511991959949L
L311:   getstatic Field sk bk J
L314:   lmul
L315:   lconst_0
L316:   lcmp
L317:   ifeq L337
L320:   ldc_w 933605808
L323:   invokestatic Method gz e (I)J
L326:   ldc2_w -8807787511991959949L
L329:   getstatic Field sk bk J
L332:   lmul
L333:   lcmp
L334:   ifge L401

        .stack same
L337:   getstatic Field sk f Lsr;
L340:   getstatic Field sk n J
L343:   ldc2_w 3394915126462843437L
L346:   lmul
L347:   invokevirtual Method sr n (J)I
L350:   ldc_w -709089635
L353:   imul
L354:   putstatic Field sk e I
L357:   iconst_0
L358:   istore_1

        .stack append Integer
L359:   iload_1
L360:   ldc_w 970166197
L363:   getstatic Field sk e I
L366:   imul
L367:   if_icmpge L382
L370:   aload_0
L371:   bipush -64
L373:   invokevirtual Method sk g (B)V
L376:   iinc 1 1
L379:   goto L359

        .stack same
L382:   aload_0
L383:   ldc_w 1116521221
L386:   invokevirtual Method sk i (I)V
L389:   getstatic Field ahs g Ljava/awt/Canvas;
L392:   ldc_w 165759862
L395:   invokestatic Method f a (Ljava/lang/Object;I)V
L398:   goto L308

        .stack chop 1
L401:   return
L402:   
        .linenumbertable
            L0 522
            L7 523
            L14 524
            L36 525
            L40 526
            L149 527
            L159 528
            L160 530
            L170 531
            L173 532
            L199 533
            L208 534
            L231 535
            L241 536
            L242 541
            L252 542
            L272 543
            L285 544
            L292 545
            L299 546
            L308 547
            L337 548
            L357 549
            L382 550
            L389 551
            L401 553
        .end linenumbertable
    .end code
.end method

.method public dx : ()V
    .code stack 4 locals 2
L0:     aload_0
L1:     getfield Field sk bi Z
L4:     ifeq L8
L7:     return

        .stack same
L8:     ldc_w 672839876
L11:    invokestatic Method ke n (I)Lrn;
L14:    ldc_w "jaclib"
L17:    bipush -87
L19:    invokeinterface InterfaceMethod rn e (Ljava/lang/String;B)V 3
        .catch java/lang/Throwable from L24 to L28 using L31
L24:    invokestatic Method jaclib/nanotime/QueryPerformanceCounter init ()Z
L27:    pop
L28:    goto L57

        .stack stack_1 Object java/lang/Throwable
L31:    astore_1
L32:    getstatic Field ij bq Ljava/lang/String;
L35:    ldc "win"
L37:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L40:    ifeq L57
L43:    new apb
L46:    dup
L47:    sipush 128
L50:    ldc_w "jaclib"
L53:    invokespecial Method apb <init> (ILjava/lang/String;)V
L56:    athrow

        .stack same
L57:    aload_0
L58:    iconst_1
L59:    putfield Field sk bi Z
L62:    return
L63:    
        .linenumbertable
            L0 810
            L8 811
            L24 813
            L28 817
            L31 815
            L32 816
            L57 818
            L62 819
        .end linenumbertable
    .end code
    .exceptions apb
.end method

.method bc : (Ljava/io/File;Ljava/io/File;)V
    .code stack 6 locals 5
        .catch java/io/IOException from L0 to L111 using L114
L0:     new abl
L3:     dup
L4:     getstatic Field sk au Ljava/io/File;
L7:     ldc "rw"
L9:     ldc2_w 10000L
L12:    invokespecial Method abl <init> (Ljava/io/File;Ljava/lang/String;J)V
L15:    astore_3
L16:    new alw
L19:    dup
L20:    sipush 500
L23:    invokespecial Method alw <init> (I)V
L26:    astore 4
L28:    aload 4
L30:    iconst_3
L31:    bipush -36
L33:    invokevirtual Method alw k (IB)V
L36:    aload 4
L38:    aconst_null
L39:    aload_2
L40:    if_acmpeq L47
L43:    iconst_1
L44:    goto L48

        .stack full
            locals Object sk Object java/io/File Object java/io/File Object abl Object alw
            stack Object alw
        .end stack
L47:    iconst_0

        .stack full
            locals Object sk Object java/io/File Object java/io/File Object abl Object alw
            stack Object alw Integer
        .end stack
L48:    bipush -7
L50:    invokevirtual Method alw k (IB)V
L53:    aload 4
L55:    aload_1
L56:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L59:    ldc_w -1489303680
L62:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V
L65:    aconst_null
L66:    aload_2
L67:    if_acmpeq L82
L70:    aload 4
L72:    aload_2
L73:    invokevirtual Method java/io/File getPath ()Ljava/lang/String;
L76:    ldc_w -1489303680
L79:    invokevirtual Method alw g (Ljava/lang/CharSequence;I)V

        .stack same
L82:    aload_3
L83:    aload 4
L85:    getfield Field alw w [B
L88:    iconst_0
L89:    ldc_w 212851357
L92:    aload 4
L94:    getfield Field alw l I
L97:    imul
L98:    ldc_w -1272482105
L101:   invokevirtual Method abl n ([BIII)V
L104:   aload_3
L105:   ldc_w 257370419
L108:   invokevirtual Method abl m (I)V
L111:   goto L121

        .stack full
            locals Object sk Object java/io/File Object java/io/File
            stack Object java/io/IOException
        .end stack
L114:   astore 4
L116:   aload 4
L118:   invokevirtual Method java/io/IOException printStackTrace ()V

        .stack append Top Object java/lang/Object
L121:   return
L122:   
        .linenumbertable
            L0 318
            L16 319
            L28 320
            L36 321
            L53 322
            L65 323
            L82 324
            L104 325
            L111 329
            L114 327
            L116 328
            L121 330
        .end linenumbertable
    .end code
.end method

.method public final de : (Ljava/awt/event/FocusEvent;)V
    .code stack 1 locals 2
L0:     iconst_0
L1:     putstatic Field sk ai Z
L4:     return
L5:     
        .linenumbertable
            L0 695
            L4 696
        .end linenumbertable
    .end code
.end method

.method final cw : (Z)V
    .code stack 3 locals 4
L0:     aload_0
L1:     dup
L2:     astore_2
L3:     monitorenter
        .catch [0] from L4 to L12 using L22
L4:     getstatic Field sk bh Z
L7:     ifeq L13
L10:    aload_2
L11:    monitorexit
L12:    return
        .catch [0] from L13 to L19 using L22

        .stack append Object sk
L13:    iconst_1
L14:    putstatic Field sk bh Z
L17:    aload_2
L18:    monitorexit
L19:    goto L27
        .catch [0] from L22 to L25 using L22

        .stack stack_1 Object java/lang/Throwable
L22:    astore_3
L23:    aload_2
L24:    monitorexit
L25:    aload_3
L26:    athrow
        .catch java/lang/Exception from L27 to L33 using L36

        .stack same
L27:    aload_0
L28:    bipush -101
L30:    invokevirtual Method sk aw (B)V
L33:    goto L37

        .stack stack_1 Object java/lang/Exception
L36:    astore_2
        .catch java/lang/Exception from L37 to L94 using L97

        .stack full
            locals Object sk Integer Object java/lang/Object
            stack
        .end stack
L37:    getstatic Field sk ay Labp;
L40:    ldc_w 1216916480
L43:    invokevirtual Method abp e (I)V
L46:    iconst_0
L47:    istore_2

        .stack full
            locals Object sk Integer Integer
            stack
        .end stack
L48:    iload_2
L49:    ldc_w 694777127
L52:    getstatic Field b ap I
L55:    imul
L56:    if_icmpge L76
L59:    getstatic Field vs az [Labp;
L62:    iload_2
L63:    aaload
L64:    ldc_w 1216916480
L67:    invokevirtual Method abp e (I)V
L70:    iinc 2 1
L73:    goto L48

        .stack same
L76:    getstatic Field sk ab Labp;
L79:    ldc_w 1216916480
L82:    invokevirtual Method abp e (I)V
L85:    getstatic Field sk aj Labp;
L88:    ldc_w 1216916480
L91:    invokevirtual Method abp e (I)V
L94:    goto L98

        .stack full
            locals Object sk Integer
            stack Object java/lang/Exception
        .end stack
L97:    astore_2

        .stack same
L98:    aload_0
L99:    getfield Field sk bi Z
L102:   ifeq L112
        .catch java/lang/Throwable from L105 to L108 using L111
L105:   invokestatic Method jaclib/nanotime/QueryPerformanceCounter quit ()V
L108:   goto L112

        .stack stack_1 Object java/lang/Throwable
L111:   astore_2

        .stack same
L112:   ldc_w 492037067
L115:   invokestatic Method aah m (I)Z
L118:   ifeq L136
L121:   ldc_w 672839876
L124:   invokestatic Method ke n (I)Lrn;
L127:   ldc_w -1575976234
L130:   invokeinterface InterfaceMethod rn m (I)Z 2
L135:   pop

        .stack same
L136:   getstatic Field ahs g Ljava/awt/Canvas;
L139:   ifnull L165
        .catch java/lang/Exception from L142 to L161 using L164
L142:   getstatic Field ahs g Ljava/awt/Canvas;
L145:   aload_0
L146:   invokevirtual Method java/awt/Canvas removeFocusListener (Ljava/awt/event/FocusListener;)V
L149:   getstatic Field ahs g Ljava/awt/Canvas;
L152:   invokevirtual Method java/awt/Canvas getParent ()Ljava/awt/Container;
L155:   getstatic Field ahs g Ljava/awt/Canvas;
L158:   invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V
L161:   goto L165

        .stack stack_1 Object java/lang/Exception
L164:   astore_2

        .stack same
L165:   aconst_null
L166:   getstatic Field vy h Ljava/awt/Frame;
L169:   if_acmpeq L189
L172:   getstatic Field vy h Ljava/awt/Frame;
L175:   iconst_0
L176:   invokevirtual Method java/awt/Frame setVisible (Z)V
L179:   getstatic Field vy h Ljava/awt/Frame;
L182:   invokevirtual Method java/awt/Frame dispose ()V
L185:   aconst_null
L186:   putstatic Field vy h Ljava/awt/Frame;

        .stack same
L189:   return
L190:   
        .linenumbertable
            L0 606
            L4 607
            L13 608
            L17 609
            L27 611
            L33 613
            L37 615
            L46 616
            L76 617
            L85 618
            L94 620
            L98 621
            L105 623
            L108 625
            L112 628
            L136 630
            L142 632
            L149 633
            L161 635
            L165 637
            L172 638
            L179 639
            L185 640
            L189 642
        .end linenumbertable
    .end code
.end method

.method static final wl : (Lyf;I)V
    .code stack 15 locals 9
        .catch java/lang/RuntimeException from L0 to L171 using L171
L0:     aload_0
L1:     dup
L2:     getfield Field yf l I
L5:     ldc_w -1451722994
L8:     isub
L9:     putfield Field yf l I
L12:    aload_0
L13:    getfield Field yf w [I
L16:    aload_0
L17:    getfield Field yf l I
L20:    ldc_w -1497248091
L23:    imul
L24:    iaload
L25:    istore_2
L26:    aload_0
L27:    getfield Field yf w [I
L30:    aload_0
L31:    getfield Field yf l I
L34:    ldc_w -1497248091
L37:    imul
L38:    iconst_1
L39:    iadd
L40:    iaload
L41:    istore_3
L42:    aload_0
L43:    getfield Field yf w [I
L46:    iconst_2
L47:    aload_0
L48:    getfield Field yf l I
L51:    ldc_w -1497248091
L54:    imul
L55:    iadd
L56:    iaload
L57:    istore 4
L59:    aload_0
L60:    getfield Field yf w [I
L63:    aload_0
L64:    getfield Field yf l I
L67:    ldc_w -1497248091
L70:    imul
L71:    iconst_3
L72:    iadd
L73:    iaload
L74:    istore 5
L76:    aload_0
L77:    getfield Field yf w [I
L80:    iconst_4
L81:    aload_0
L82:    getfield Field yf l I
L85:    ldc_w -1497248091
L88:    imul
L89:    iadd
L90:    iaload
L91:    istore 6
L93:    aload_0
L94:    getfield Field yf w [I
L97:    iconst_5
L98:    ldc_w -1497248091
L101:   aload_0
L102:   getfield Field yf l I
L105:   imul
L106:   iadd
L107:   iaload
L108:   istore 7
L110:   getstatic Field fs we Lfb;
L113:   getstatic Field ft p Lft;
L116:   getstatic Field fs we Lfb;
L119:   iload_2
L120:   iload_3
L121:   iload 5
L123:   getstatic Field fz e Lfz;
L126:   ldc_w -743817974
L129:   invokevirtual Method fz e (I)I
L132:   getstatic Field fx f Lfx;
L135:   fconst_0
L136:   fconst_0
L137:   aconst_null
L138:   iconst_0
L139:   iload 6
L141:   iconst_0
L142:   ldc_w 96674096
L145:   invokevirtual Method fb j (Lft;Ljava/lang/Object;IIIILfx;FFLox;IIZI)Lrw;
L148:   astore 8
L150:   aload 8
L152:   ifnull L170
L155:   getstatic Field fs we Lfb;
L158:   aload 8
L160:   iload 7
L162:   iload 4
L164:   ldc_w -895310388
L167:   invokevirtual Method fb z (Lrw;III)V

        .stack full
            locals Object yf Integer Integer Integer Integer Integer Integer Integer Object rw
            stack
        .end stack
L170:   return

        .stack full
            locals Object yf Integer
            stack Object java/lang/RuntimeException
        .end stack
L171:   new java/lang/StringBuilder
L174:   dup
L175:   invokespecial Method java/lang/StringBuilder <init> ()V
L178:   ldc_w "sk.wl("
L181:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L184:   ldc 41
L186:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L189:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L192:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L195:   athrow
L196:   
        .linenumbertable
            L0 8989
            L12 8990
            L26 8991
            L42 8992
            L59 8993
            L76 8994
            L93 8995
            L110 8996
            L150 8997
            L155 8998
            L170 9000
        .end linenumbertable
    .end code
.end method

.method public static e : (FLox;Lov;Lox;Lox;Lox;Lox;FFFFB)V
    .code stack 4 locals 25
        .catch java/lang/RuntimeException from L0 to L941 using L941
L0:     aload_3
L1:     aload_1
L2:     invokevirtual Method ox d (Lox;)Z
L5:     ifeq L9
L8:     return

        .stack same
L9:     fconst_0
L10:    fconst_0
L11:    fconst_0
L12:    invokestatic Method ox m (FFF)Lox;
L15:    astore 12
L17:    aload_3
L18:    aload_1
L19:    invokestatic Method ox q (Lox;Lox;)Lox;
L22:    invokestatic Method ox k (Lox;)Lox;
L25:    astore 13
L27:    aload 13
L29:    aload_2
L30:    invokevirtual Method ox ai (Lov;)V
L33:    aload 13
L35:    aload 12
L37:    invokestatic Method ox q (Lox;Lox;)Lox;
L40:    astore 14
L42:    aload 14
L44:    invokevirtual Method ox g ()F
L47:    fstore 15
L49:    fload 7
L51:    fconst_0
L52:    fcmpl
L53:    ifle L76
L56:    aload 5
L58:    invokestatic Method ox k (Lox;)Lox;
L61:    astore 5
L63:    aload 5
L65:    fload 15
L67:    fload 7
L69:    fdiv
L70:    fload 8
L72:    fmul
L73:    invokevirtual Method ox ae (F)V

        .stack full
            locals Float Object ox Object ov Object ox Object ox Object ox Object ox Float Float Float Float Integer Object ox Object ox Object ox Float
            stack
        .end stack
L76:    ldc_w +Infinityf
L79:    aload 5
L81:    getfield Field ox k F
L84:    fcmpl
L85:    ifeq L114
L88:    aload_1
L89:    getfield Field ox k F
L92:    invokestatic Method java/lang/Float isNaN (F)Z
L95:    ifne L114
L98:    fload 15
L100:   fload 9
L102:   fcmpl
L103:   ifgt L114
L106:   fload 15
L108:   fload 10
L110:   fcmpg
L111:   ifge L127

        .stack same
L114:   aload_1
L115:   aload_3
L116:   invokevirtual Method ox z (Lox;)V
L119:   aload 4
L121:   invokevirtual Method ox p ()V
L124:   goto L940

        .stack same
L127:   aload_2
L128:   invokevirtual Method ov v ()V
L131:   fconst_1
L132:   fconst_0
L133:   fconst_0
L134:   invokestatic Method ox m (FFF)Lox;
L137:   astore 16
L139:   fconst_0
L140:   fconst_1
L141:   fconst_0
L142:   invokestatic Method ox m (FFF)Lox;
L145:   astore 17
L147:   fconst_0
L148:   fconst_0
L149:   fconst_1
L150:   invokestatic Method ox m (FFF)Lox;
L153:   astore 18
L155:   aload 16
L157:   aload_2
L158:   invokevirtual Method ox ai (Lov;)V
L161:   aload 17
L163:   aload_2
L164:   invokevirtual Method ox ai (Lov;)V
L167:   aload 18
L169:   aload_2
L170:   invokevirtual Method ox ai (Lov;)V
L173:   aload 16
L175:   aload 4
L177:   invokestatic Method ox b (Lox;Lox;)F
L180:   aload 17
L182:   aload 4
L184:   invokestatic Method ox b (Lox;Lox;)F
L187:   aload 18
L189:   aload 4
L191:   invokestatic Method ox b (Lox;Lox;)F
L194:   invokestatic Method ox m (FFF)Lox;
L197:   astore 19
L199:   aload 19
L201:   invokestatic Method ox k (Lox;)Lox;
L204:   astore 20
L206:   aload 20
L208:   invokevirtual Method ox i ()V
L211:   aload 20
L213:   aload 20
L215:   invokestatic Method ox t (Lox;Lox;)Lox;
L218:   aload 5
L220:   fconst_2
L221:   invokestatic Method ox ac (Lox;F)Lox;
L224:   invokestatic Method ox ah (Lox;Lox;)Lox;
L227:   astore 21
L229:   aload 14
L231:   invokestatic Method ox k (Lox;)Lox;
L234:   astore 22
L236:   aload 22
L238:   invokevirtual Method ox i ()V
L241:   aload 19
L243:   invokestatic Method ox k (Lox;)Lox;
L246:   astore 23
L248:   aload 21
L250:   getfield Field ox k F
L253:   aload 22
L255:   getfield Field ox k F
L258:   fcmpl
L259:   ifle L344
L262:   aload 14
L264:   getfield Field ox k F
L267:   fconst_0
L268:   fcmpg
L269:   ifge L308
L272:   aload 23
L274:   dup
L275:   getfield Field ox k F
L278:   fload_0
L279:   aload 5
L281:   getfield Field ox k F
L284:   fmul
L285:   fadd
L286:   putfield Field ox k F
L289:   aload 23
L291:   getfield Field ox k F
L294:   fconst_0
L295:   fcmpl
L296:   ifle L455
L299:   aload 23
L301:   fconst_0
L302:   putfield Field ox k F
L305:   goto L455

        .stack full
            locals Float Object ox Object ov Object ox Object ox Object ox Object ox Float Float Float Float Integer Object ox Object ox Object ox Float Object ox Object ox Object ox Object ox Object ox Object ox Object ox Object ox
            stack
        .end stack
L308:   aload 23
L310:   dup
L311:   getfield Field ox k F
L314:   aload 5
L316:   getfield Field ox k F
L319:   fload_0
L320:   fmul
L321:   fsub
L322:   putfield Field ox k F
L325:   aload 23
L327:   getfield Field ox k F
L330:   fconst_0
L331:   fcmpg
L332:   ifge L455
L335:   aload 23
L337:   fconst_0
L338:   putfield Field ox k F
L341:   goto L455

        .stack same
L344:   aload 20
L346:   getfield Field ox k F
L349:   aload 6
L351:   getfield Field ox k F
L354:   fcmpg
L355:   ifge L455
L358:   aload 14
L360:   getfield Field ox k F
L363:   fconst_0
L364:   fcmpg
L365:   ifge L414
L368:   aload 23
L370:   dup
L371:   getfield Field ox k F
L374:   aload 5
L376:   getfield Field ox k F
L379:   fload_0
L380:   fmul
L381:   fsub
L382:   putfield Field ox k F
L385:   aload 23
L387:   getfield Field ox k F
L390:   aload 6
L392:   getfield Field ox k F
L395:   fneg
L396:   fcmpg
L397:   ifge L455
L400:   aload 23
L402:   aload 6
L404:   getfield Field ox k F
L407:   fneg
L408:   putfield Field ox k F
L411:   goto L455

        .stack same_extended
L414:   aload 23
L416:   dup
L417:   getfield Field ox k F
L420:   fload_0
L421:   aload 5
L423:   getfield Field ox k F
L426:   fmul
L427:   fadd
L428:   putfield Field ox k F
L431:   aload 23
L433:   getfield Field ox k F
L436:   aload 6
L438:   getfield Field ox k F
L441:   fcmpl
L442:   ifle L455
L445:   aload 23
L447:   aload 6
L449:   getfield Field ox k F
L452:   putfield Field ox k F

        .stack same
L455:   aload 21
L457:   getfield Field ox f F
L460:   aload 22
L462:   getfield Field ox f F
L465:   fcmpl
L466:   ifle L551
L469:   aload 14
L471:   getfield Field ox f F
L474:   fconst_0
L475:   fcmpg
L476:   ifge L515
L479:   aload 23
L481:   dup
L482:   getfield Field ox f F
L485:   aload 5
L487:   getfield Field ox f F
L490:   fload_0
L491:   fmul
L492:   fadd
L493:   putfield Field ox f F
L496:   aload 23
L498:   getfield Field ox f F
L501:   fconst_0
L502:   fcmpl
L503:   ifle L662
L506:   aload 23
L508:   fconst_0
L509:   putfield Field ox f F
L512:   goto L662

        .stack same
L515:   aload 23
L517:   dup
L518:   getfield Field ox f F
L521:   fload_0
L522:   aload 5
L524:   getfield Field ox f F
L527:   fmul
L528:   fsub
L529:   putfield Field ox f F
L532:   aload 23
L534:   getfield Field ox f F
L537:   fconst_0
L538:   fcmpg
L539:   ifge L662
L542:   aload 23
L544:   fconst_0
L545:   putfield Field ox f F
L548:   goto L662

        .stack same
L551:   aload 20
L553:   getfield Field ox f F
L556:   aload 6
L558:   getfield Field ox f F
L561:   fcmpg
L562:   ifge L662
L565:   aload 14
L567:   getfield Field ox f F
L570:   fconst_0
L571:   fcmpg
L572:   ifge L621
L575:   aload 23
L577:   dup
L578:   getfield Field ox f F
L581:   aload 5
L583:   getfield Field ox f F
L586:   fload_0
L587:   fmul
L588:   fsub
L589:   putfield Field ox f F
L592:   aload 23
L594:   getfield Field ox f F
L597:   aload 6
L599:   getfield Field ox f F
L602:   fneg
L603:   fcmpg
L604:   ifge L662
L607:   aload 23
L609:   aload 6
L611:   getfield Field ox f F
L614:   fneg
L615:   putfield Field ox f F
L618:   goto L662

        .stack same_extended
L621:   aload 23
L623:   dup
L624:   getfield Field ox f F
L627:   fload_0
L628:   aload 5
L630:   getfield Field ox f F
L633:   fmul
L634:   fadd
L635:   putfield Field ox f F
L638:   aload 23
L640:   getfield Field ox f F
L643:   aload 6
L645:   getfield Field ox f F
L648:   fcmpl
L649:   ifle L662
L652:   aload 23
L654:   aload 6
L656:   getfield Field ox f F
L659:   putfield Field ox f F

        .stack same
L662:   aload 21
L664:   getfield Field ox w F
L667:   aload 22
L669:   getfield Field ox w F
L672:   fcmpl
L673:   ifle L758
L676:   aload 14
L678:   getfield Field ox w F
L681:   fconst_0
L682:   fcmpg
L683:   ifge L722
L686:   aload 23
L688:   dup
L689:   getfield Field ox w F
L692:   fload_0
L693:   aload 5
L695:   getfield Field ox w F
L698:   fmul
L699:   fadd
L700:   putfield Field ox w F
L703:   aload 23
L705:   getfield Field ox w F
L708:   fconst_0
L709:   fcmpl
L710:   ifle L869
L713:   aload 23
L715:   fconst_0
L716:   putfield Field ox w F
L719:   goto L869

        .stack same
L722:   aload 23
L724:   dup
L725:   getfield Field ox w F
L728:   aload 5
L730:   getfield Field ox w F
L733:   fload_0
L734:   fmul
L735:   fsub
L736:   putfield Field ox w F
L739:   aload 23
L741:   getfield Field ox w F
L744:   fconst_0
L745:   fcmpg
L746:   ifge L869
L749:   aload 23
L751:   fconst_0
L752:   putfield Field ox w F
L755:   goto L869

        .stack same
L758:   aload 20
L760:   getfield Field ox w F
L763:   aload 6
L765:   getfield Field ox w F
L768:   fcmpg
L769:   ifge L869
L772:   aload 14
L774:   getfield Field ox w F
L777:   fconst_0
L778:   fcmpg
L779:   ifge L828
L782:   aload 23
L784:   dup
L785:   getfield Field ox w F
L788:   aload 5
L790:   getfield Field ox w F
L793:   fload_0
L794:   fmul
L795:   fsub
L796:   putfield Field ox w F
L799:   aload 23
L801:   getfield Field ox w F
L804:   aload 6
L806:   getfield Field ox w F
L809:   fneg
L810:   fcmpg
L811:   ifge L869
L814:   aload 23
L816:   aload 6
L818:   getfield Field ox w F
L821:   fneg
L822:   putfield Field ox w F
L825:   goto L869

        .stack same_extended
L828:   aload 23
L830:   dup
L831:   getfield Field ox w F
L834:   aload 5
L836:   getfield Field ox w F
L839:   fload_0
L840:   fmul
L841:   fadd
L842:   putfield Field ox w F
L845:   aload 23
L847:   getfield Field ox w F
L850:   aload 6
L852:   getfield Field ox w F
L855:   fcmpl
L856:   ifle L869
L859:   aload 23
L861:   aload 6
L863:   getfield Field ox w F
L866:   putfield Field ox w F

        .stack same
L869:   aload 16
L871:   aload 23
L873:   getfield Field ox k F
L876:   invokestatic Method ox ac (Lox;F)Lox;
L879:   astore 24
L881:   aload 24
L883:   aload 17
L885:   aload 23
L887:   getfield Field ox f F
L890:   invokevirtual Method ox o (Lox;F)V
L893:   aload 24
L895:   aload 18
L897:   aload 23
L899:   getfield Field ox w F
L902:   invokevirtual Method ox o (Lox;F)V
L905:   aload 4
L907:   aload 24
L909:   ldc_w 8e-1f
L912:   invokevirtual Method ox at (Lox;F)V
L915:   aload_1
L916:   aload 4
L918:   fload_0
L919:   invokestatic Method ox ac (Lox;F)Lox;
L922:   invokevirtual Method ox v (Lox;)V
L925:   aload 20
L927:   invokevirtual Method ox w ()V
L930:   aload 23
L932:   invokevirtual Method ox w ()V
L935:   aload 22
L937:   invokevirtual Method ox w ()V

        .stack full
            locals Float Object ox Object ov Object ox Object ox Object ox Object ox Float Float Float Float Integer Object ox Object ox Object ox Float
            stack
        .end stack
L940:   return

        .stack full
            locals Float Object ox Object ov Object ox Object ox Object ox Object ox Float Float Float Float Integer
            stack Object java/lang/RuntimeException
        .end stack
L941:   new java/lang/StringBuilder
L944:   dup
L945:   invokespecial Method java/lang/StringBuilder <init> ()V
L948:   ldc_w "sk.e("
L951:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L954:   ldc 41
L956:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L959:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L962:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L965:   athrow
L966:   
        .linenumbertable
            L0 13
            L9 14
            L17 15
            L27 16
            L33 17
            L42 18
            L49 19
            L56 20
            L63 21
            L76 23
            L114 24
            L119 25
            L127 28
            L131 29
            L139 30
            L147 31
            L155 32
            L161 33
            L167 34
            L173 35
            L199 36
            L206 37
            L211 38
            L229 39
            L236 40
            L241 41
            L248 42
            L262 43
            L272 44
            L289 45
            L308 48
            L325 49
            L344 52
            L358 53
            L368 54
            L385 55
            L414 58
            L431 59
            L455 62
            L469 63
            L479 64
            L496 65
            L515 68
            L532 69
            L551 72
            L565 73
            L575 74
            L592 75
            L621 78
            L638 79
            L662 82
            L676 83
            L686 84
            L703 85
            L722 88
            L739 89
            L758 92
            L772 93
            L782 94
            L799 95
            L828 98
            L845 99
            L869 102
            L881 103
            L893 104
            L905 105
            L915 106
            L925 107
            L930 108
            L935 109
            L940 111
        .end linenumbertable
    .end code
.end method

.method public static ea : (IIII)I
    .code stack 4 locals 13
        .catch java/lang/RuntimeException from L0 to L177 using L177
L0:     getstatic Field alj bs I
L3:     ldc_w -1574654625
L6:     imul
L7:     bipush 100
L9:     if_icmpge L15
L12:    bipush -2
L14:    ireturn

        .stack same
L15:    bipush -2
L17:    istore 4
L19:    ldc_w 2147483647
L22:    istore 5
L24:    iload_1
L25:    getstatic Field alj g I
L28:    isub
L29:    istore 6
L31:    iload_2
L32:    getstatic Field alj i I
L35:    isub
L36:    istore 7
L38:    getstatic Field alj a Laat;
L41:    bipush 84
L43:    invokevirtual Method aat l (B)Ltj;
L46:    checkcast aks
L49:    astore 8

        .stack full
            locals Integer Integer Integer Integer Integer Integer Integer Integer Object aks
            stack
        .end stack
L51:    aload 8
L53:    ifnull L174
L56:    iload_0
L57:    ldc_w 1208139441
L60:    aload 8
L62:    getfield Field aks k I
L65:    imul
L66:    if_icmpeq L72
L69:    goto L157

        .stack same
L72:    ldc_w 1012619213
L75:    aload 8
L77:    getfield Field aks w I
L80:    imul
L81:    istore 9
L83:    aload 8
L85:    getfield Field aks l I
L88:    ldc_w -2087611449
L91:    imul
L92:    istore 10
L94:    getstatic Field alj g I
L97:    iload 9
L99:    iadd
L100:   bipush 14
L102:   ishl
L103:   getstatic Field alj i I
L106:   iload 10
L108:   iadd
L109:   ior
L110:   istore 11
L112:   iload 6
L114:   iload 9
L116:   isub
L117:   iload 6
L119:   iload 9
L121:   isub
L122:   imul
L123:   iload 7
L125:   iload 10
L127:   isub
L128:   iload 7
L130:   iload 10
L132:   isub
L133:   imul
L134:   iadd
L135:   istore 12
L137:   iload 4
L139:   iflt L149
L142:   iload 12
L144:   iload 5
L146:   if_icmpge L157

        .stack full
            locals Integer Integer Integer Integer Integer Integer Integer Integer Object aks Integer Integer Integer Integer
            stack
        .end stack
L149:   iload 11
L151:   istore 4
L153:   iload 12
L155:   istore 5

        .stack full
            locals Integer Integer Integer Integer Integer Integer Integer Integer Object aks
            stack
        .end stack
L157:   getstatic Field alj a Laat;
L160:   ldc_w 2131125755
L163:   invokevirtual Method aat v (I)Ltj;
L166:   checkcast aks
L169:   astore 8
L171:   goto L51

        .stack same
L174:   iload 4
L176:   ireturn

        .stack full
            locals Integer Integer Integer Integer
            stack Object java/lang/RuntimeException
        .end stack
L177:   new java/lang/StringBuilder
L180:   dup
L181:   invokespecial Method java/lang/StringBuilder <init> ()V
L184:   ldc_w "sk.ea("
L187:   invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L190:   ldc 41
L192:   invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L195:   invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L198:   invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L201:   athrow
L202:   
        .linenumbertable
            L0 917
            L15 918
            L19 919
            L24 920
            L31 921
            L38 922
            L56 923
            L72 924
            L83 925
            L94 926
            L112 927
            L137 928
            L149 929
            L153 930
            L157 922
            L174 933
        .end linenumbertable
    .end code
.end method

.method public static n : (II)Laaa;
    .code stack 3 locals 5
        .catch java/lang/RuntimeException from L0 to L43 using L43
L0:     bipush 32
L2:     invokestatic Method rg e (B)[Laaa;
L5:     astore_2
L6:     iconst_0
L7:     istore_3

        .stack append Object [Laaa; Integer
L8:     iload_3
L9:     aload_2
L10:    arraylength
L11:    if_icmpge L41
L14:    aload_2
L15:    iload_3
L16:    aaload
L17:    astore 4
L19:    iload_0
L20:    ldc_w 1108974345
L23:    aload 4
L25:    getfield Field aaa l I
L28:    imul
L29:    if_icmpne L35
L32:    aload 4
L34:    areturn

        .stack append Object aaa
L35:    iinc 3 1
L38:    goto L8

        .stack chop 1
L41:    aconst_null
L42:    areturn

        .stack full
            locals Integer Integer
            stack Object java/lang/RuntimeException
        .end stack
L43:    new java/lang/StringBuilder
L46:    dup
L47:    invokespecial Method java/lang/StringBuilder <init> ()V
L50:    ldc_w "sk.n("
L53:    invokevirtual Method java/lang/StringBuilder append (Ljava/lang/String;)Ljava/lang/StringBuilder;
L56:    ldc 41
L58:    invokevirtual Method java/lang/StringBuilder append (C)Ljava/lang/StringBuilder;
L61:    invokevirtual Method java/lang/StringBuilder toString ()Ljava/lang/String;
L64:    invokestatic Method atl n (Ljava/lang/Throwable;Ljava/lang/String;)Latc;
L67:    athrow
L68:    
        .linenumbertable
            L0 24
            L6 25
            L14 26
            L19 28
            L35 25
            L41 32
        .end linenumbertable
    .end code
.end method
.sourcefile "sk.java"
.end class
