package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.applet.Applet;
import java.awt.*;

@OriginalClass("client!sh")
public interface Interface61 {

	@OriginalMember(owner = "client!sh", name = "cz", descriptor = "()V")
	void method25169();

	@OriginalMember(owner = "client!sh", name = "ew", descriptor = "()V")
	void method25170();

	@OriginalMember(owner = "client!sh", name = "start", descriptor = "()V")
	void start();

	@OriginalMember(owner = "client!sh", name = "stop", descriptor = "()V")
	void stop();

	@OriginalMember(owner = "client!sh", name = "destroy", descriptor = "()V")
	void destroy();

	@OriginalMember(owner = "client!sh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	void update(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sh", name = "bl", descriptor = "(Ljava/applet/Applet;)V")
	void method25171(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!sh", name = "init", descriptor = "()V")
	void init();

	@OriginalMember(owner = "client!sh", name = "bg", descriptor = "(Ljava/applet/Applet;)V")
	void method25172(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!sh", name = "dg", descriptor = "()V")
	void method25173();

	@OriginalMember(owner = "client!sh", name = "co", descriptor = "()V")
	void method25174();

	@OriginalMember(owner = "client!sh", name = "dh", descriptor = "(Ljava/awt/Graphics;)V")
	void method25175(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sh", name = "cq", descriptor = "()V")
	void method25176();

	@OriginalMember(owner = "client!sh", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V")
	void supplyApplet(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!sh", name = "aw", descriptor = "(Ljava/applet/Applet;)V")
	void method25177(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!sh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	void paint(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sh", name = "dc", descriptor = "(Ljava/awt/Graphics;)V")
	void method25178(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sh", name = "dn", descriptor = "(Ljava/awt/Graphics;)V")
	void method25179(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sh", name = "dd", descriptor = "(Ljava/awt/Graphics;)V")
	void method25180(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sh", name = "ee", descriptor = "()V")
	void method25181();
}
