package jagex3;

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
	final Class364 aClass364_3;

	@OriginalMember(owner = "client!ahw", name = "m", descriptor = "Ljava/awt/Image;")
	Image anImage5;

	@OriginalMember(owner = "client!ahw", name = "<init>", descriptor = "(Lclient!jm;Ljava/awt/Image;II)V")
	Class129_Sub2(@OriginalArg(0) Class364 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass364_3 = arg0;
		this.anImage5 = arg1;
	}

	@OriginalMember(owner = "client!ahw", name = "e", descriptor = "(Ljava/awt/Graphics;B)V")
	@Override
	void method21483(@OriginalArg(0) Graphics arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) int local13 = this.aClass364_3.method28067(this.anImage5.getWidth(null), -2120609387) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.aClass364_3.method28063(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "n", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21484(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass364_3.method28067(this.anImage5.getWidth(null), -205809796) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.aClass364_3.method28063(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "m", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21482(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass364_3.method28067(this.anImage5.getWidth(null), -1849776824) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.aClass364_3.method28063(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "k", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21486(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass364_3.method28067(this.anImage5.getWidth(null), 798333707) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.aClass364_3.method28063(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21487(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass364_3.method28067(this.anImage5.getWidth(null), -1116588015) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.aClass364_3.method28063(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}

	@OriginalMember(owner = "client!ahw", name = "w", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21485(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.aClass364_3.method28067(this.anImage5.getWidth(null), -1292746115) + this.anInt2994 * -228338075;
		@Pc(27) int local27 = this.aClass364_3.method28063(this.anImage5.getHeight(null), 1676822063) + this.anInt2995 * 1110069385;
		arg0.drawImage(this.anImage5, local13, local27, null);
	}
}
