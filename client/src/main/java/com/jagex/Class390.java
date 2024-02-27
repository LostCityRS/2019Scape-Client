package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!kx")
public final class Class390 implements Interface32 {

	@OriginalMember(owner = "client!kx", name = "a", descriptor = "I")
	static int anInt4561;

	@OriginalMember(owner = "client!kx", name = "e", descriptor = "Lclient!cm;")
	Class99 aClass99_33;

	@OriginalMember(owner = "client!kx", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_110;

	@OriginalMember(owner = "client!kx", name = "t", descriptor = "Lclient!lt;")
	final Class405 aClass405_1;

	@OriginalMember(owner = "client!kx", name = "aj", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;B)V")
	public static void method28666(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(2) Graphics local2 = Class454.canvas.getGraphics();
			if (Class540.aFont2 == null) {
				Class540.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(76) int local76;
			@Pc(84) int local84;
			try {
				if (Class407.anImage4 == null) {
					Class407.anImage4 = Class454.canvas.createImage(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
				}
				@Pc(55) Graphics local55 = Class407.anImage4.getGraphics();
				local55.setColor(Color.black);
				local55.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
				local76 = Class80_Sub1_Sub1.anInt254 * -255202897 / 2 - 152;
				local84 = Class80_Sub25.anInt1627 * 167687103 / 2 - 18;
				local55.setColor(arg3);
				local55.drawRect(local76, local84, 303, 33);
				local55.setColor(arg2);
				local55.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(local76 + 1, local84 + 1, 301, 31);
				local55.fillRect(arg0 * 3 + local76 + 2, local84 + 2, 300 - arg0 * 3, 30);
				local55.setFont(Class540.aFont2);
				local55.setColor(arg4);
				local55.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
				if (Class554.aString134 != null) {
					local55.setFont(Class540.aFont2);
					local55.setColor(arg4);
					local55.drawString(Class554.aString134, Class80_Sub1_Sub1.anInt254 * -255202897 / 2 - Class554.aString134.length() * 6 / 2, Class80_Sub25.anInt1627 * 167687103 / 2 - 26);
				}
				local2.drawImage(Class407.anImage4, 0, 0, null);
			} catch (@Pc(200) Exception local200) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
				local76 = Class80_Sub1_Sub1.anInt254 * -255202897 / 2 - 152;
				local84 = Class80_Sub25.anInt1627 * 167687103 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local76, local84, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local76 + 1, local84 + 1, 301, 31);
				local2.fillRect(local76 + 2 + arg0 * 3, local84 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class540.aFont2);
				local2.setColor(arg4);
				if (Class554.aString134 != null) {
					local2.setFont(Class540.aFont2);
					local2.setColor(arg4);
					local2.drawString(Class554.aString134, Class80_Sub1_Sub1.anInt254 * -255202897 / 2 - Class554.aString134.length() * 6 / 2, Class80_Sub25.anInt1627 * 167687103 / 2 - 26);
				}
				local2.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
			}
		} catch (@Pc(338) Exception local338) {
			Class454.canvas.repaint();
		}
	}

	@OriginalMember(owner = "client!kx", name = "ai", descriptor = "(Lclient!yp;B)V")
	static void method28667(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		if (Class688.aBoolean987) {
			Class374.method28434(arg0.anIntArray525[arg0.anInt5778 * 1896589581] != 0, 723809759);
			Class377.method28474(arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] != 0, (byte) 127);
			Class278.method26836(arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2] != 0, -825189621);
		}
	}

	@OriginalMember(owner = "client!kx", name = "akp", descriptor = "(Lclient!yp;B)V")
	static void method28668(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class618.method32299(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, -671912698);
	}

	@OriginalMember(owner = "client!kx", name = "<init>", descriptor = "(Lclient!pf;Lclient!lt;)V")
	Class390(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class405 arg1) {
		this.aClass480_110 = arg0;
		this.aClass405_1 = arg1;
	}

	@OriginalMember(owner = "client!kx", name = "u", descriptor = "(Z)V")
	@Override
	public void method28656(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class80_Sub1_Sub1.anInt254 * -255202897 > client.anInt3510 * 1528239985 ? Class80_Sub1_Sub1.anInt254 * -255202897 : client.anInt3510 * 1528239985;
		@Pc(31) int local31 = Class80_Sub25.anInt1627 * 167687103 > client.anInt3511 * 1764386615 ? Class80_Sub25.anInt1627 * 167687103 : client.anInt3511 * 1764386615;
		@Pc(35) int local35 = this.aClass99_33.method18214();
		@Pc(39) int local39 = this.aClass99_33.method18288();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass99_33.method18228(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!kx", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
		this.aClass99_33 = Class568.method31530(this.aClass480_110, this.aClass405_1.anInt4593 * -423554239, -113638199);
	}

	@OriginalMember(owner = "client!kx", name = "f", descriptor = "(ZB)V")
	@Override
	public void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class80_Sub1_Sub1.anInt254 * -255202897 > client.anInt3510 * 1528239985 ? Class80_Sub1_Sub1.anInt254 * -255202897 : client.anInt3510 * 1528239985;
		@Pc(31) int local31 = Class80_Sub25.anInt1627 * 167687103 > client.anInt3511 * 1764386615 ? Class80_Sub25.anInt1627 * 167687103 : client.anInt3511 * 1764386615;
		@Pc(35) int local35 = this.aClass99_33.method18214();
		@Pc(39) int local39 = this.aClass99_33.method18288();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass99_33.method18228(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!kx", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		return this.aClass480_110.method29945(this.aClass405_1.anInt4593 * -423554239, (byte) 1);
	}

	@OriginalMember(owner = "client!kx", name = "l", descriptor = "(Z)V")
	@Override
	public void method28660(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class80_Sub1_Sub1.anInt254 * -255202897 > client.anInt3510 * 1528239985 ? Class80_Sub1_Sub1.anInt254 * -255202897 : client.anInt3510 * 1528239985;
		@Pc(31) int local31 = Class80_Sub25.anInt1627 * 167687103 > client.anInt3511 * 1764386615 ? Class80_Sub25.anInt1627 * 167687103 : client.anInt3511 * 1764386615;
		@Pc(35) int local35 = this.aClass99_33.method18214();
		@Pc(39) int local39 = this.aClass99_33.method18288();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass99_33.method18228(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!kx", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
		this.aClass99_33 = Class568.method31530(this.aClass480_110, this.aClass405_1.anInt4593 * -423554239, 1498956585);
	}

	@OriginalMember(owner = "client!kx", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		return this.aClass480_110.method29945(this.aClass405_1.anInt4593 * -423554239, (byte) 1);
	}

	@OriginalMember(owner = "client!kx", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
		this.aClass99_33 = Class568.method31530(this.aClass480_110, this.aClass405_1.anInt4593 * -423554239, -1183158133);
	}

	@OriginalMember(owner = "client!kx", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		return this.aClass480_110.method29945(this.aClass405_1.anInt4593 * -423554239, (byte) 1);
	}

	@OriginalMember(owner = "client!kx", name = "g", descriptor = "(Z)V")
	@Override
	public void method28659(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class80_Sub1_Sub1.anInt254 * -255202897 > client.anInt3510 * 1528239985 ? Class80_Sub1_Sub1.anInt254 * -255202897 : client.anInt3510 * 1528239985;
		@Pc(31) int local31 = Class80_Sub25.anInt1627 * 167687103 > client.anInt3511 * 1764386615 ? Class80_Sub25.anInt1627 * 167687103 : client.anInt3511 * 1764386615;
		@Pc(35) int local35 = this.aClass99_33.method18214();
		@Pc(39) int local39 = this.aClass99_33.method18288();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass99_33.method18228(local41, local55, local43, local49);
	}
}
