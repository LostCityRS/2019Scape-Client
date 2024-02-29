package com.jagex;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahw")
public class Class129_Sub2 extends Class129 {

	@OriginalMember(owner = "client!ahw", name = "ch", descriptor = "Lclient!aac;")
	static Class5 aClass5_13;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ahw", name = "this$0", descriptor = "Lclient!jm;")
	final Class364 this$0;

	@OriginalMember(owner = "client!ahw", name = "m", descriptor = "Ljava/awt/Image;")
	Image anImage5;

	@OriginalMember(owner = "client!ahw", name = "<init>", descriptor = "(Lclient!jm;Ljava/awt/Image;II)V", line = 195)
	Class129_Sub2(@OriginalArg(0) Class364 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.this$0 = arg0;
		this.anImage5 = arg1;
	}

	@OriginalMember(owner = "client!ahw", name = "e", descriptor = "(Ljava/awt/Graphics;B)V", line = 201)
	@Override
	void method21476(@OriginalArg(0) Graphics arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) int local13 = this.this$0.method27882(this.anImage5.getWidth(null), -2120609387) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.this$0.method27886(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "n", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method21477(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27882(this.anImage5.getWidth(null), -205809796) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.this$0.method27886(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "m", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method21475(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27882(this.anImage5.getWidth(null), -1849776824) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.this$0.method27886(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "k", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method21479(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27882(this.anImage5.getWidth(null), 798333707) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.this$0.method27886(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "f", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method21480(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27882(this.anImage5.getWidth(null), -1116588015) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.this$0.method27886(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "w", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method21478(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27882(this.anImage5.getWidth(null), -1292746115) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.this$0.method27886(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}
}
