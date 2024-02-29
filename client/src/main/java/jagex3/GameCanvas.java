package jagex3;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atu")
public final class GameCanvas extends Canvas {

	@OriginalMember(owner = "client!atu", name = "e", descriptor = "Ljava/awt/Component;")
	Component aComponent3;

	@OriginalMember(owner = "client!atu", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	GameCanvas(@OriginalArg(0) Component arg0) {
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "client!atu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}

	@OriginalMember(owner = "client!atu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!atu", name = "m", descriptor = "(Ljava/awt/Graphics;)V")
	public void method23744(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}

	@OriginalMember(owner = "client!atu", name = "n", descriptor = "(Ljava/awt/Graphics;)V")
	public void method23745(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}

	@OriginalMember(owner = "client!atu", name = "e", descriptor = "(Ljava/awt/Graphics;)V")
	public void method23746(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}
}
