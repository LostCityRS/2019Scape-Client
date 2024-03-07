package com.jagex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public class Class364 implements Interface30 {

	@OriginalMember(owner = "client!jm", name = "ah", descriptor = "[I")
	static int[] anIntArray427;

	@OriginalMember(owner = "client!jm", name = "gc", descriptor = "Lclient!py;")
	public static Class497 aClass497_105;

	@OriginalMember(owner = "client!jm", name = "bm", descriptor = "I")
	public static int anInt4575;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Z")
	boolean aBoolean731;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Z")
	boolean aBoolean732;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
	boolean aBoolean733;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
	boolean aBoolean734;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "Ljava/lang/String;")
	String aString189;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Ljava/lang/String;")
	String aString190;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Ljava/util/List;")
	List aList20 = new ArrayList();

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "Ljava/awt/geom/AffineTransform;")
	AffineTransform anAffineTransform1 = new AffineTransform();

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 30)
	Class364() {
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(II)I", line = 33)
	final int method27882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aBoolean733 ? (Class553.width * -1378711501 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)I", line = 33)
	final int method27883(@OriginalArg(0) int arg0) {
		return this.aBoolean733 ? (Class553.width * -1378711501 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)I", line = 33)
	final int method27884(@OriginalArg(0) int arg0) {
		return this.aBoolean733 ? (Class553.width * -1378711501 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "(I)I", line = 33)
	final int method27885(@OriginalArg(0) int arg0) {
		return this.aBoolean733 ? (Class553.width * -1378711501 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "(II)I", line = 38)
	final int method27886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aBoolean732 ? (Class553.height * 2091353777 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "(I)I", line = 38)
	final int method27887(@OriginalArg(0) int arg0) {
		return this.aBoolean732 ? (Class553.height * 2091353777 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "(I)I", line = 38)
	final int method27888(@OriginalArg(0) int arg0) {
		return this.aBoolean732 ? (Class553.height * 2091353777 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "(ZI)V", line = 43)
	@Override
	public void method27924(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean734 && !this.aBoolean731) {
			this.aBoolean731 = true;
			try {
				@Pc(13) String[] local13 = client.method24953(client.aString148, '|', 1822851704);
				if (local13.length < 3) {
					this.aBoolean734 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class125_Sub3.aCanvas1);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = client.method24953(local13[local30].trim(), '=', 1941630767);
						if (local42[0].equals("halign")) {
							this.aBoolean733 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean732 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = client.method24953(local42[1], ',', 1615197979);
								try {
									local88 = this.method27892(local81[0], -173246230);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList20.add(new Class129_Sub2(this, local88, Class616.method32090(local81[1], (byte) 8), Class616.method32090(local81[2], (byte) 8)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = client.method24953(local42[1], ',', 2101413543);
								try {
									local88 = this.method27892(local81[0], -720276248);
								} catch (@Pc(143) Exception local143) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList20.add(new Class129_Sub2_Sub1(this, local88, Class616.method32090(local81[1], (byte) 8), Class616.method32090(local81[2], (byte) 8), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = client.method24953(local42[1], ',', 1871956333);
								this.aList20.add(new Class129_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class616.method32090(local81[2], (byte) 8), Integer.decode(local81[3]), Class616.method32090(local81[4], (byte) 8), Class616.method32090(local81[5], (byte) 8)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(233) Exception local233) {
				this.aBoolean734 = true;
			}
		}
		if (this.aBoolean734) {
			this.method27897(-145012110);
			return;
		}
		@Pc(246) Graphics local246 = Class125_Sub3.aCanvas1.getGraphics();
		if (local246 == null) {
			Class125_Sub3.aCanvas1.repaint();
			return;
		}
		try {
			this.aString189 = "" + Class653.aClass357_1.method27749(1285578807) + "%";
			this.aString190 = Class653.aClass357_1.method27751((byte) -48);
			if (Class115.anImage3 == null) {
				Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(Class553.width * -1378711501, Class553.height * 2091353777);
			}
			@Pc(282) Graphics local282 = Class115.anImage3.getGraphics();
			local282.setColor(Color.BLACK);
			local282.fillRect(0, 0, Class553.width * -1378711501, Class553.height * 2091353777);
			@Pc(299) Iterator local299 = this.aList20.iterator();
			while (local299.hasNext()) {
				@Pc(306) Class129 local306 = (Class129) local299.next();
				local306.method21476(local282, (byte) -20);
			}
			local246.drawImage(Class115.anImage3, 0, 0, null);
		} catch (@Pc(320) Exception local320) {
			this.aBoolean734 = true;
		}
	}

	@OriginalMember(owner = "client!jm", name = "ai", descriptor = "(Z)V", line = 43)
	@Override
	public void method27929(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean734 && !this.aBoolean731) {
			this.aBoolean731 = true;
			try {
				@Pc(13) String[] local13 = client.method24953(client.aString148, '|', 1885218557);
				if (local13.length < 3) {
					this.aBoolean734 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class125_Sub3.aCanvas1);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = client.method24953(local13[local30].trim(), '=', 1779216387);
						if (local42[0].equals("halign")) {
							this.aBoolean733 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean732 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = client.method24953(local42[1], ',', 1700938706);
								try {
									local88 = this.method27892(local81[0], -818780408);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList20.add(new Class129_Sub2(this, local88, Class616.method32090(local81[1], (byte) 8), Class616.method32090(local81[2], (byte) 8)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = client.method24953(local42[1], ',', 2066863899);
								try {
									local88 = this.method27892(local81[0], 1110397707);
								} catch (@Pc(143) Exception local143) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList20.add(new Class129_Sub2_Sub1(this, local88, Class616.method32090(local81[1], (byte) 8), Class616.method32090(local81[2], (byte) 8), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = client.method24953(local42[1], ',', 1562150473);
								this.aList20.add(new Class129_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class616.method32090(local81[2], (byte) 8), Integer.decode(local81[3]), Class616.method32090(local81[4], (byte) 8), Class616.method32090(local81[5], (byte) 8)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(233) Exception local233) {
				this.aBoolean734 = true;
			}
		}
		if (this.aBoolean734) {
			this.method27897(1658844150);
			return;
		}
		@Pc(246) Graphics local246 = Class125_Sub3.aCanvas1.getGraphics();
		if (local246 == null) {
			Class125_Sub3.aCanvas1.repaint();
			return;
		}
		try {
			this.aString189 = "" + Class653.aClass357_1.method27749(1285578807) + "%";
			this.aString190 = Class653.aClass357_1.method27751((byte) -87);
			if (Class115.anImage3 == null) {
				Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(Class553.width * -1378711501, Class553.height * 2091353777);
			}
			@Pc(282) Graphics local282 = Class115.anImage3.getGraphics();
			local282.setColor(Color.BLACK);
			local282.fillRect(0, 0, Class553.width * -1378711501, Class553.height * 2091353777);
			@Pc(299) Iterator local299 = this.aList20.iterator();
			while (local299.hasNext()) {
				@Pc(306) Class129 local306 = (Class129) local299.next();
				local306.method21476(local282, (byte) 9);
			}
			local246.drawImage(Class115.anImage3, 0, 0, null);
		} catch (@Pc(320) Exception local320) {
			this.aBoolean734 = true;
		}
	}

	@OriginalMember(owner = "client!jm", name = "ac", descriptor = "(Z)V", line = 43)
	@Override
	public void method27935(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean734 && !this.aBoolean731) {
			this.aBoolean731 = true;
			try {
				@Pc(13) String[] local13 = client.method24953(client.aString148, '|', 1680840912);
				if (local13.length < 3) {
					this.aBoolean734 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class125_Sub3.aCanvas1);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = client.method24953(local13[local30].trim(), '=', 2037301180);
						if (local42[0].equals("halign")) {
							this.aBoolean733 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean732 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = client.method24953(local42[1], ',', 2035935230);
								try {
									local88 = this.method27892(local81[0], 649181535);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList20.add(new Class129_Sub2(this, local88, Class616.method32090(local81[1], (byte) 8), Class616.method32090(local81[2], (byte) 8)));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = client.method24953(local42[1], ',', 1971352555);
								try {
									local88 = this.method27892(local81[0], -1118071479);
								} catch (@Pc(143) Exception local143) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList20.add(new Class129_Sub2_Sub1(this, local88, Class616.method32090(local81[1], (byte) 8), Class616.method32090(local81[2], (byte) 8), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = client.method24953(local42[1], ',', 1817015006);
								this.aList20.add(new Class129_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class616.method32090(local81[2], (byte) 8), Integer.decode(local81[3]), Class616.method32090(local81[4], (byte) 8), Class616.method32090(local81[5], (byte) 8)));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(233) Exception local233) {
				this.aBoolean734 = true;
			}
		}
		if (this.aBoolean734) {
			this.method27897(24139173);
			return;
		}
		@Pc(246) Graphics local246 = Class125_Sub3.aCanvas1.getGraphics();
		if (local246 == null) {
			Class125_Sub3.aCanvas1.repaint();
			return;
		}
		try {
			this.aString189 = "" + Class653.aClass357_1.method27749(1285578807) + "%";
			this.aString190 = Class653.aClass357_1.method27751((byte) -94);
			if (Class115.anImage3 == null) {
				Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(Class553.width * -1378711501, Class553.height * 2091353777);
			}
			@Pc(282) Graphics local282 = Class115.anImage3.getGraphics();
			local282.setColor(Color.BLACK);
			local282.fillRect(0, 0, Class553.width * -1378711501, Class553.height * 2091353777);
			@Pc(299) Iterator local299 = this.aList20.iterator();
			while (local299.hasNext()) {
				@Pc(306) Class129 local306 = (Class129) local299.next();
				local306.method21476(local282, (byte) -18);
			}
			local246.drawImage(Class115.anImage3, 0, 0, null);
		} catch (@Pc(320) Exception local320) {
			this.aBoolean734 = true;
		}
	}

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "(II)Z", line = 70)
	public static boolean method27889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27890(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class32_Sub10.applet.getClass().getClassLoader().getResourceAsStream(arg0);
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

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27891(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class32_Sub10.applet.getClass().getClassLoader().getResourceAsStream(arg0);
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

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;", line = 137)
	Image method27892(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class32_Sub10.applet.getClass().getClassLoader().getResourceAsStream(arg0);
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

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27893(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class32_Sub10.applet.getClass().getClassLoader().getResourceAsStream(arg0);
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

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27894(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class32_Sub10.applet.getClass().getClassLoader().getResourceAsStream(arg0);
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

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27895(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class32_Sub10.applet.getClass().getClassLoader().getResourceAsStream(arg0);
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

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "()V", line = 159)
	void method27896() {
		Class597.method31779(Class653.aClass357_1.method27749(1285578807), Class653.aClass357_1.method27751((byte) -1), client.aColorArray1[client.anInt3427 * 182213747], client.aColorArray2[client.anInt3427 * 182213747], client.aColorArray3[client.anInt3427 * 182213747], -886980436);
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V", line = 159)
	void method27897(@OriginalArg(0) int arg0) {
		Class597.method31779(Class653.aClass357_1.method27749(1285578807), Class653.aClass357_1.method27751((byte) -79), client.aColorArray1[client.anInt3427 * 182213747], client.aColorArray2[client.anInt3427 * 182213747], client.aColorArray3[client.anInt3427 * 182213747], -886980436);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "()V", line = 159)
	void method27898() {
		Class597.method31779(Class653.aClass357_1.method27749(1285578807), Class653.aClass357_1.method27751((byte) -88), client.aColorArray1[client.anInt3427 * 182213747], client.aColorArray2[client.anInt3427 * 182213747], client.aColorArray3[client.anInt3427 * 182213747], -886980436);
	}

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "()V", line = 159)
	void method27899() {
		Class597.method31779(Class653.aClass357_1.method27749(1285578807), Class653.aClass357_1.method27751((byte) -94), client.aColorArray1[client.anInt3427 * 182213747], client.aColorArray2[client.anInt3427 * 182213747], client.aColorArray3[client.anInt3427 * 182213747], -886980436);
	}

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "(B)V", line = 163)
	@Override
	public void method27925(@OriginalArg(0) byte arg0) {
		Class110.method20145((byte) -74);
	}

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "()V", line = 163)
	@Override
	public void method27934() {
		Class110.method20145((byte) -53);
	}

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "()V", line = 166)
	@Override
	public void method27931() {
	}

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "(S)V", line = 166)
	@Override
	public void method27923(@OriginalArg(0) short arg0) {
	}

	@OriginalMember(owner = "client!jm", name = "ae", descriptor = "()I", line = 169)
	@Override
	public int method27927() {
		return 100;
	}

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "()I", line = 169)
	@Override
	public int method27928() {
		return 100;
	}

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "(I)I", line = 169)
	@Override
	public int method27932(@OriginalArg(0) int arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!jm", name = "ag", descriptor = "(J)Z", line = 173)
	@Override
	public boolean method27930(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "(J)Z", line = 173)
	@Override
	public boolean method27926(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "(B)I", line = 177)
	@Override
	public int method27922(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "ah", descriptor = "()I", line = 177)
	@Override
	public int method27933() {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "al", descriptor = "()I", line = 177)
	@Override
	public int method27936() {
		return 0;
	}

	@OriginalMember(owner = "client!jm", name = "qr", descriptor = "(Lclient!yf;B)V", line = 7925)
	static final void method27900(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class707.method36752(local11, local14, arg0, 1160214285);
	}
}
