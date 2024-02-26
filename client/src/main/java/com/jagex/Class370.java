package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@OriginalClass("client!jy")
public final class Class370 implements Interface30 {

	@OriginalMember(owner = "client!jy", name = "hy", descriptor = "Lclient!aon;")
	public static Class41_Sub10 aClass41_Sub10_1;

	@OriginalMember(owner = "client!jy", name = "i", descriptor = "Ljava/lang/String;")
	String aString200;

	@OriginalMember(owner = "client!jy", name = "u", descriptor = "Z")
	boolean aBoolean843;

	@OriginalMember(owner = "client!jy", name = "t", descriptor = "Z")
	boolean aBoolean844;

	@OriginalMember(owner = "client!jy", name = "l", descriptor = "Z")
	boolean aBoolean845;

	@OriginalMember(owner = "client!jy", name = "g", descriptor = "Ljava/lang/String;")
	String aString201;

	@OriginalMember(owner = "client!jy", name = "f", descriptor = "Z")
	boolean aBoolean846;

	@OriginalMember(owner = "client!jy", name = "e", descriptor = "Ljava/util/List;")
	List aList21 = new ArrayList();

	@OriginalMember(owner = "client!jy", name = "m", descriptor = "Ljava/awt/geom/AffineTransform;")
	AffineTransform anAffineTransform1 = new AffineTransform();

	@OriginalMember(owner = "client!jy", name = "k", descriptor = "(I)V")
	public static void method28375(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = Class672.aClass243_95;
		synchronized (Class672.aClass243_95) {
			Class672.aClass243_95.method26256(1693912082);
		}
		local2 = Class672.aClass243_94;
		synchronized (Class672.aClass243_94) {
			Class672.aClass243_94.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!jy", name = "en", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;S)V")
	static void method28376(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) short arg3) {
		arg0.anInt4118 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -2047026297;
		Class296.method26998(arg0, -415150416);
	}

	@OriginalMember(owner = "client!jy", name = "bbs", descriptor = "(Lclient!yp;I)V")
	static void method28377(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!jy", name = "ayc", descriptor = "(Lclient!yp;I)V")
	static void method28378(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class143.method11833(1413071081);
		RuntimeException_Sub2.method23509(2035679442);
		client.aClass539_1.method30938(694581205);
		Class719.method37291(-686791255);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!jy", name = "az", descriptor = "(Lclient!di;I)V")
	static void method28379(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -10660793;
		Class362.method28159(arg0, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local1, -16777216, (byte) 114);
		Class8.aClass104_1.method7655(Class60.aClass60_132.method1180(Class512.aClass719_3, -1115872110), Class594.anInt5325 * 2014486095 + 3, Class103_Sub15.anInt970 * -1540302901 + 14, local1, -1, -2009474655);
		@Pc(41) int local41 = Class363.aClass152_1.method14615(-1419501698);
		@Pc(45) int local45 = Class363.aClass152_1.method14598(1910012391);
		@Pc(49) int local49;
		@Pc(54) Class80_Sub1_Sub11 local54;
		@Pc(74) int local74;
		if (!Class630.aBoolean956) {
			local49 = 0;
			for (local54 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local54 != null; local54 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-407753371)) {
				local74 = Class103_Sub15.anInt970 * -1540302901 + 31 + (Class630.anInt5553 * 721317679 - 1 - local49) * Class630.anInt5547 * 1378633515;
				Class646.method33049(local41, local45, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local74, local54, Class8.aClass104_1, Class375.aClass15_9, -1, -256, (byte) 1);
				local49++;
			}
			return;
		}
		local49 = 0;
		for (@Pc(111) Class80_Sub1_Sub4 local111 = (Class80_Sub1_Sub4) Class630.aClass3_17.method50((byte) -29); local111 != null; local111 = (Class80_Sub1_Sub4) Class630.aClass3_17.method46((byte) -102)) {
			local74 = Class630.anInt5547 * 1378633515 * local49 + 31 + Class103_Sub15.anInt970 * -1540302901;
			if (local111.anInt3022 * 855388281 == 1) {
				Class646.method33049(local41, local45, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local74, (Class80_Sub1_Sub11) local111.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68, Class8.aClass104_1, Class375.aClass15_9, -1, -256, (byte) 1);
			} else {
				Class588.method31900(local41, local45, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local74, local111, Class8.aClass104_1, Class375.aClass15_9, -1, -256, 470825790);
			}
			local49++;
		}
		if (Class630.aClass80_Sub1_Sub4_1 == null) {
			return;
		}
		Class362.method28159(arg0, Class41_Sub12.anInt2441 * 1627981811, Class630.anInt5557 * -1965654097, Class40.anInt116 * -477951091, Class681.anInt5749 * -1929920381, local1, -16777216, (byte) 74);
		Class8.aClass104_1.method7655(Class630.aClass80_Sub1_Sub4_1.aString95, Class41_Sub12.anInt2441 * 1627981811 + 3, Class630.anInt5557 * -1965654097 + 14, local1, -1, -1506850063);
		local49 = 0;
		for (local54 = (Class80_Sub1_Sub11) Class630.aClass80_Sub1_Sub4_1.aClass3_10.method50((byte) 27); local54 != null; local54 = (Class80_Sub1_Sub11) Class630.aClass80_Sub1_Sub4_1.aClass3_10.method46((byte) -102)) {
			local74 = Class630.anInt5557 * -1965654097 + 31 + local49 * Class630.anInt5547 * 1378633515;
			Class646.method33049(local41, local45, Class41_Sub12.anInt2441 * 1627981811, Class630.anInt5557 * -1965654097, Class40.anInt116 * -477951091, Class681.anInt5749 * -1929920381, local74, local54, Class8.aClass104_1, Class375.aClass15_9, -1, -256, (byte) 1);
			local49++;
		}
	}

	@OriginalMember(owner = "client!jy", name = "<init>", descriptor = "()V")
	Class370() {
	}

	@OriginalMember(owner = "client!jy", name = "ac", descriptor = "(J)Z")
	@Override
	public boolean method28360(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!jy", name = "t", descriptor = "(II)I")
	int method28362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aBoolean843 ? (Class80_Sub1_Sub1.anInt254 * -255202897 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "f", descriptor = "(II)I")
	int method28363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aBoolean845 ? (Class80_Sub25.anInt1627 * 167687103 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "e", descriptor = "(ZI)V")
	@Override
	public void method28354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean844 && !this.aBoolean846) {
			this.aBoolean846 = true;
			try {
				@Pc(13) String[] local13 = Class313.method27482(client.aString141, '|', 2036747717);
				if (local13.length < 3) {
					this.aBoolean844 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class454.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class313.method27482(local13[local30].trim(), '=', 2036747717);
						if (local42[0].equals("halign")) {
							this.aBoolean843 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean845 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 224303236);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2(this, local88, Class679.method33621(local81[1], -1778315973), Class679.method33621(local81[2], 1907295739)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 1220576166);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2_Sub1(this, local88, Class679.method33621(local81[1], 1183096494), Class679.method33621(local81[2], 1902572467), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								this.aList21.add(new Class126_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method33621(local81[2], 308475906), Integer.decode(local81[3]), Class679.method33621(local81[4], 787169131), Class679.method33621(local81[5], -1823384287)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean844 = true;
			}
		}
		if (this.aBoolean844) {
			this.method28365(-1445059480);
			return;
		}
		@Pc(244) Graphics local244 = Class454.aCanvas6.getGraphics();
		if (local244 == null) {
			Class454.aCanvas6.repaint();
			return;
		}
		try {
			this.aString201 = "" + Class365.aClass369_1.method28332(-1974503527) + "%";
			this.aString200 = Class365.aClass369_1.method28304(-699284490);
			if (Class407.anImage4 == null) {
				Class407.anImage4 = Class454.aCanvas6.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			}
			@Pc(280) Graphics local280 = Class407.anImage4.getGraphics();
			local280.setColor(Color.BLACK);
			local280.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			@Pc(297) Iterator local297 = this.aList21.iterator();
			while (local297.hasNext()) {
				@Pc(304) Class126 local304 = (Class126) local297.next();
				local304.method20378(local280, 591854885);
			}
			local244.drawImage(Class407.anImage4, 0, 0, null);
		} catch (@Pc(318) Exception local318) {
			this.aBoolean844 = true;
		}
	}

	@OriginalMember(owner = "client!jy", name = "u", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	Image method28364(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class306.anApplet1.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!jy", name = "l", descriptor = "(I)V")
	void method28365(@OriginalArg(0) int arg0) {
		Class390.method28666(Class365.aClass369_1.method28332(32866953), Class365.aClass369_1.method28304(735740293), client.aColorArray1[client.anInt3570 * 1973763491], client.aColorArray2[client.anInt3570 * 1973763491], client.aColorArray3[client.anInt3570 * 1973763491], (byte) -1);
	}

	@OriginalMember(owner = "client!jy", name = "i", descriptor = "(I)V")
	@Override
	public void method28342(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jy", name = "v", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;")
	Image method28366(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class306.anApplet1.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!jy", name = "o", descriptor = "(J)Z")
	@Override
	public boolean method28357(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!jy", name = "j", descriptor = "(I)I")
	@Override
	public int method28346(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!jy", name = "a", descriptor = "(I)I")
	int method28367(@OriginalArg(0) int arg0) {
		return this.aBoolean843 ? (Class80_Sub1_Sub1.anInt254 * -255202897 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "s", descriptor = "(I)I")
	int method28368(@OriginalArg(0) int arg0) {
		return this.aBoolean843 ? (Class80_Sub1_Sub1.anInt254 * -255202897 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "k", descriptor = "(I)I")
	int method28369(@OriginalArg(0) int arg0) {
		return this.aBoolean845 ? (Class80_Sub25.anInt1627 * 167687103 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "p", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;")
	Image method28370(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class306.anApplet1.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!jy", name = "aj", descriptor = "()I")
	@Override
	public int method28353() {
		return 100;
	}

	@OriginalMember(owner = "client!jy", name = "m", descriptor = "(I)I")
	@Override
	public int method28351(@OriginalArg(0) int arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!jy", name = "q", descriptor = "(Z)V")
	@Override
	public void method28348(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean844 && !this.aBoolean846) {
			this.aBoolean846 = true;
			try {
				@Pc(13) String[] local13 = Class313.method27482(client.aString141, '|', 2036747717);
				if (local13.length < 3) {
					this.aBoolean844 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class454.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class313.method27482(local13[local30].trim(), '=', 2036747717);
						if (local42[0].equals("halign")) {
							this.aBoolean843 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean845 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 1611063211);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2(this, local88, Class679.method33621(local81[1], 1693484663), Class679.method33621(local81[2], -1437100498)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 2060823543);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2_Sub1(this, local88, Class679.method33621(local81[1], 1619103302), Class679.method33621(local81[2], -2046557671), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								this.aList21.add(new Class126_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method33621(local81[2], 1997537160), Integer.decode(local81[3]), Class679.method33621(local81[4], -636927524), Class679.method33621(local81[5], 1528460442)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean844 = true;
			}
		}
		if (this.aBoolean844) {
			this.method28365(-1697806478);
			return;
		}
		@Pc(244) Graphics local244 = Class454.aCanvas6.getGraphics();
		if (local244 == null) {
			Class454.aCanvas6.repaint();
			return;
		}
		try {
			this.aString201 = "" + Class365.aClass369_1.method28332(-1858951767) + "%";
			this.aString200 = Class365.aClass369_1.method28304(506456926);
			if (Class407.anImage4 == null) {
				Class407.anImage4 = Class454.aCanvas6.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			}
			@Pc(280) Graphics local280 = Class407.anImage4.getGraphics();
			local280.setColor(Color.BLACK);
			local280.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			@Pc(297) Iterator local297 = this.aList21.iterator();
			while (local297.hasNext()) {
				@Pc(304) Class126 local304 = (Class126) local297.next();
				local304.method20378(local280, 1799604597);
			}
			local244.drawImage(Class407.anImage4, 0, 0, null);
		} catch (@Pc(318) Exception local318) {
			this.aBoolean844 = true;
		}
	}

	@OriginalMember(owner = "client!jy", name = "h", descriptor = "(Z)V")
	@Override
	public void method28349(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean844 && !this.aBoolean846) {
			this.aBoolean846 = true;
			try {
				@Pc(13) String[] local13 = Class313.method27482(client.aString141, '|', 2036747717);
				if (local13.length < 3) {
					this.aBoolean844 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class454.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class313.method27482(local13[local30].trim(), '=', 2036747717);
						if (local42[0].equals("halign")) {
							this.aBoolean843 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean845 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 1052080964);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2(this, local88, Class679.method33621(local81[1], 1735510649), Class679.method33621(local81[2], -204154958)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], -757593854);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2_Sub1(this, local88, Class679.method33621(local81[1], -205264110), Class679.method33621(local81[2], -216392442), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								this.aList21.add(new Class126_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method33621(local81[2], -2085182433), Integer.decode(local81[3]), Class679.method33621(local81[4], 849323672), Class679.method33621(local81[5], -1640335195)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean844 = true;
			}
		}
		if (this.aBoolean844) {
			this.method28365(-1316164156);
			return;
		}
		@Pc(244) Graphics local244 = Class454.aCanvas6.getGraphics();
		if (local244 == null) {
			Class454.aCanvas6.repaint();
			return;
		}
		try {
			this.aString201 = "" + Class365.aClass369_1.method28332(-888244878) + "%";
			this.aString200 = Class365.aClass369_1.method28304(758809845);
			if (Class407.anImage4 == null) {
				Class407.anImage4 = Class454.aCanvas6.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			}
			@Pc(280) Graphics local280 = Class407.anImage4.getGraphics();
			local280.setColor(Color.BLACK);
			local280.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			@Pc(297) Iterator local297 = this.aList21.iterator();
			while (local297.hasNext()) {
				@Pc(304) Class126 local304 = (Class126) local297.next();
				local304.method20378(local280, 857845631);
			}
			local244.drawImage(Class407.anImage4, 0, 0, null);
		} catch (@Pc(318) Exception local318) {
			this.aBoolean844 = true;
		}
	}

	@OriginalMember(owner = "client!jy", name = "aq", descriptor = "()V")
	@Override
	public void method28343() {
	}

	@OriginalMember(owner = "client!jy", name = "z", descriptor = "(Z)V")
	@Override
	public void method28352(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean844 && !this.aBoolean846) {
			this.aBoolean846 = true;
			try {
				@Pc(13) String[] local13 = Class313.method27482(client.aString141, '|', 2036747717);
				if (local13.length < 3) {
					this.aBoolean844 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class454.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class313.method27482(local13[local30].trim(), '=', 2036747717);
						if (local42[0].equals("halign")) {
							this.aBoolean843 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean845 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 1306947381);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2(this, local88, Class679.method33621(local81[1], 998689564), Class679.method33621(local81[2], -382123713)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 1108554776);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2_Sub1(this, local88, Class679.method33621(local81[1], -841567389), Class679.method33621(local81[2], 736385881), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								this.aList21.add(new Class126_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method33621(local81[2], -1029067651), Integer.decode(local81[3]), Class679.method33621(local81[4], 1668783914), Class679.method33621(local81[5], 29867036)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean844 = true;
			}
		}
		if (this.aBoolean844) {
			this.method28365(1726895513);
			return;
		}
		@Pc(244) Graphics local244 = Class454.aCanvas6.getGraphics();
		if (local244 == null) {
			Class454.aCanvas6.repaint();
			return;
		}
		try {
			this.aString201 = "" + Class365.aClass369_1.method28332(-860128348) + "%";
			this.aString200 = Class365.aClass369_1.method28304(-526878947);
			if (Class407.anImage4 == null) {
				Class407.anImage4 = Class454.aCanvas6.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			}
			@Pc(280) Graphics local280 = Class407.anImage4.getGraphics();
			local280.setColor(Color.BLACK);
			local280.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			@Pc(297) Iterator local297 = this.aList21.iterator();
			while (local297.hasNext()) {
				@Pc(304) Class126 local304 = (Class126) local297.next();
				local304.method20378(local280, 608533561);
			}
			local244.drawImage(Class407.anImage4, 0, 0, null);
		} catch (@Pc(318) Exception local318) {
			this.aBoolean844 = true;
		}
	}

	@OriginalMember(owner = "client!jy", name = "g", descriptor = "(I)V")
	@Override
	public void method28344(@OriginalArg(0) int arg0) {
		Class346.method27971(-1040794002);
	}

	@OriginalMember(owner = "client!jy", name = "w", descriptor = "(I)I")
	int method28371(@OriginalArg(0) int arg0) {
		return this.aBoolean845 ? (Class80_Sub25.anInt1627 * 167687103 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "y", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;")
	Image method28372(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class306.anApplet1.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!jy", name = "n", descriptor = "()V")
	void method28373() {
		Class390.method28666(Class365.aClass369_1.method28332(-897978186), Class365.aClass369_1.method28304(892172083), client.aColorArray1[client.anInt3570 * 1973763491], client.aColorArray2[client.anInt3570 * 1973763491], client.aColorArray3[client.anInt3570 * 1973763491], (byte) -1);
	}

	@OriginalMember(owner = "client!jy", name = "x", descriptor = "(I)I")
	int method28374(@OriginalArg(0) int arg0) {
		return this.aBoolean845 ? (Class80_Sub25.anInt1627 * 167687103 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jy", name = "b", descriptor = "()V")
	@Override
	public void method28345() {
		Class346.method27971(-1040794002);
	}

	@OriginalMember(owner = "client!jy", name = "ax", descriptor = "()V")
	@Override
	public void method28341() {
		Class346.method27971(-1040794002);
	}

	@OriginalMember(owner = "client!jy", name = "ay", descriptor = "()V")
	@Override
	public void method28355() {
	}

	@OriginalMember(owner = "client!jy", name = "ai", descriptor = "()V")
	@Override
	public void method28356() {
	}

	@OriginalMember(owner = "client!jy", name = "ag", descriptor = "()I")
	@Override
	public int method28361() {
		return 0;
	}

	@OriginalMember(owner = "client!jy", name = "ao", descriptor = "()V")
	@Override
	public void method28358() {
	}

	@OriginalMember(owner = "client!jy", name = "r", descriptor = "(Z)V")
	@Override
	public void method28347(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean844 && !this.aBoolean846) {
			this.aBoolean846 = true;
			try {
				@Pc(13) String[] local13 = Class313.method27482(client.aString141, '|', 2036747717);
				if (local13.length < 3) {
					this.aBoolean844 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class454.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class313.method27482(local13[local30].trim(), '=', 2036747717);
						if (local42[0].equals("halign")) {
							this.aBoolean843 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean845 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], -169745302);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2(this, local88, Class679.method33621(local81[1], 1527710150), Class679.method33621(local81[2], 1885488141)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], 1029072756);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2_Sub1(this, local88, Class679.method33621(local81[1], -488588629), Class679.method33621(local81[2], -989446323), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								this.aList21.add(new Class126_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method33621(local81[2], 524916401), Integer.decode(local81[3]), Class679.method33621(local81[4], -1005026781), Class679.method33621(local81[5], 1910938955)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean844 = true;
			}
		}
		if (this.aBoolean844) {
			this.method28365(1839336722);
			return;
		}
		@Pc(244) Graphics local244 = Class454.aCanvas6.getGraphics();
		if (local244 == null) {
			Class454.aCanvas6.repaint();
			return;
		}
		try {
			this.aString201 = "" + Class365.aClass369_1.method28332(-1554177391) + "%";
			this.aString200 = Class365.aClass369_1.method28304(2130978741);
			if (Class407.anImage4 == null) {
				Class407.anImage4 = Class454.aCanvas6.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			}
			@Pc(280) Graphics local280 = Class407.anImage4.getGraphics();
			local280.setColor(Color.BLACK);
			local280.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			@Pc(297) Iterator local297 = this.aList21.iterator();
			while (local297.hasNext()) {
				@Pc(304) Class126 local304 = (Class126) local297.next();
				local304.method20378(local280, 1605009987);
			}
			local244.drawImage(Class407.anImage4, 0, 0, null);
		} catch (@Pc(318) Exception local318) {
			this.aBoolean844 = true;
		}
	}

	@OriginalMember(owner = "client!jy", name = "d", descriptor = "(Z)V")
	@Override
	public void method28350(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean844 && !this.aBoolean846) {
			this.aBoolean846 = true;
			try {
				@Pc(13) String[] local13 = Class313.method27482(client.aString141, '|', 2036747717);
				if (local13.length < 3) {
					this.aBoolean844 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class454.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class313.method27482(local13[local30].trim(), '=', 2036747717);
						if (local42[0].equals("halign")) {
							this.aBoolean843 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean845 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], -1511634640);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2(this, local88, Class679.method33621(local81[1], -863760112), Class679.method33621(local81[2], -203934228)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								try {
									local88 = this.method28364(local81[0], -1879891928);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList21.add(new Class126_Sub2_Sub1(this, local88, Class679.method33621(local81[1], -851902002), Class679.method33621(local81[2], -539714522), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class313.method27482(local42[1], ',', 2036747717);
								this.aList21.add(new Class126_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method33621(local81[2], -1116493608), Integer.decode(local81[3]), Class679.method33621(local81[4], -447663693), Class679.method33621(local81[5], -1295453507)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean844 = true;
			}
		}
		if (this.aBoolean844) {
			this.method28365(-836611279);
			return;
		}
		@Pc(244) Graphics local244 = Class454.aCanvas6.getGraphics();
		if (local244 == null) {
			Class454.aCanvas6.repaint();
			return;
		}
		try {
			this.aString201 = "" + Class365.aClass369_1.method28332(-912328548) + "%";
			this.aString200 = Class365.aClass369_1.method28304(1903642237);
			if (Class407.anImage4 == null) {
				Class407.anImage4 = Class454.aCanvas6.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			}
			@Pc(280) Graphics local280 = Class407.anImage4.getGraphics();
			local280.setColor(Color.BLACK);
			local280.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			@Pc(297) Iterator local297 = this.aList21.iterator();
			while (local297.hasNext()) {
				@Pc(304) Class126 local304 = (Class126) local297.next();
				local304.method20378(local280, 1867158258);
			}
			local244.drawImage(Class407.anImage4, 0, 0, null);
		} catch (@Pc(318) Exception local318) {
			this.aBoolean844 = true;
		}
	}

	@OriginalMember(owner = "client!jy", name = "c", descriptor = "()V")
	@Override
	public void method28359() {
		Class346.method27971(-1040794002);
	}
}
