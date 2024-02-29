package com.jagex;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public class Class551 {

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Ljava/awt/Robot;")
	Robot aRobot1 = new Robot();

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 12)
	public Class551() throws Exception {
	}

	@OriginalMember(owner = "client!si", name = "movemouse", descriptor = "(II)V", line = 18)
	public void movemouse(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "client!si", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V", line = 23)
	public void setcustomcursor(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		if (arg1 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg2, arg3, 2);
			local9.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local9, arg4, null));
		}
	}
}
