package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.awt.image.BufferedImage;

@OriginalClass("client!sn")
public final class Class555 {

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "Ljava/awt/Robot;")
	Robot aRobot1 = new Robot();

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class555() throws Exception {
	}

	@OriginalMember(owner = "client!sn", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V")
	public void setcustomcursor(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		if (arg1 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg2, arg3, 2);
			local9.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local9, arg4, null));
		}
	}

	@OriginalMember(owner = "client!sn", name = "movemouse", descriptor = "(II)V")
	public void movemouse(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
