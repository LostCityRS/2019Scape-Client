package com.jagex;

import java.applet.Applet;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface Interface60 {

	@OriginalMember(owner = "client!se", name = "stop", descriptor = "()V")
	void stop();

	@OriginalMember(owner = "client!se", name = "init", descriptor = "()V")
	void init();

	@OriginalMember(owner = "client!se", name = "cz", descriptor = "(Ljava/awt/Graphics;)V")
	void method24832(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!se", name = "af", descriptor = "(Ljava/applet/Applet;)V")
	void method24833(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!se", name = "destroy", descriptor = "()V")
	void destroy();

	@OriginalMember(owner = "client!se", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	void update(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!se", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	void paint(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!se", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V")
	void supplyApplet(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "()V")
	void method24834();

	@OriginalMember(owner = "client!se", name = "cs", descriptor = "()V")
	void method24835();

	@OriginalMember(owner = "client!se", name = "cy", descriptor = "()V")
	void method24836();

	@OriginalMember(owner = "client!se", name = "cc", descriptor = "()V")
	void method24837();

	@OriginalMember(owner = "client!se", name = "ck", descriptor = "(Ljava/awt/Graphics;)V")
	void method24838(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!se", name = "start", descriptor = "()V")
	void start();

	@OriginalMember(owner = "client!se", name = "dk", descriptor = "()V")
	void method24839();

	@OriginalMember(owner = "client!se", name = "dn", descriptor = "()V")
	void method24840();
}
