package jagex3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqz")
public final class Class129_Sub2_Sub1 extends Class129_Sub2 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqz", name = "this$0", descriptor = "Lclient!jm;")
	final Class364 aClass364_4;

	@OriginalMember(owner = "client!aqz", name = "k", descriptor = "F")
	float aFloat221;

	@OriginalMember(owner = "client!aqz", name = "f", descriptor = "F")
	float aFloat222;

	@OriginalMember(owner = "client!aqz", name = "m", descriptor = "(IS)Lclient!dt;")
	static Class233 method21493(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(6) Class233 local6 = (Class233) Class107.method18131(Class484.method29973(2071952138), arg0, -1915563430);
		if (local6 == null) {
			local6 = Class233.aClass233_4;
		}
		return local6;
	}

	@OriginalMember(owner = "client!aqz", name = "<init>", descriptor = "(Lclient!jm;Ljava/awt/Image;IIF)V")
	Class129_Sub2_Sub1(@OriginalArg(0) Class364 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		super(arg0, arg1, arg2, arg3);
		this.aClass364_4 = arg0;
		this.aFloat221 = arg4;
		this.aFloat222 = -this.aFloat221;
	}

	@OriginalMember(owner = "client!aqz", name = "m", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21482(@OriginalArg(0) Graphics arg0) {
		this.aFloat222 += this.aFloat221;
		if (this.aFloat222 < 0.0F) {
			this.aFloat222 += 360.0F;
		}
		this.aFloat222 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat222);
		@Pc(33) int local33 = this.anImage5.getWidth(null);
		@Pc(38) int local38 = this.anImage5.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass364_4.method28067(local33, -952955237) + local33 / 2 + this.anInt2994 * -228338075), (double) (this.aClass364_4.method28063(local38, 1676822063) + local38 / 2 + this.anInt2995 * 1110069385));
		local41.translate(this.aClass364_4.method28067(local33, -455556876) + this.anInt2994 * -228338075, this.aClass364_4.method28063(local38, 1676822063) + this.anInt2995 * 1110069385);
		local41.drawImage(this.anImage5, null, null);
		local41.setTransform(this.aClass364_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqz", name = "e", descriptor = "(Ljava/awt/Graphics;B)V")
	@Override
	void method21483(@OriginalArg(0) Graphics arg0, @OriginalArg(1) byte arg1) {
		this.aFloat222 += this.aFloat221;
		if (this.aFloat222 < 0.0F) {
			this.aFloat222 += 360.0F;
		}
		this.aFloat222 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat222);
		@Pc(33) int local33 = this.anImage5.getWidth(null);
		@Pc(38) int local38 = this.anImage5.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass364_4.method28067(local33, -680943117) + local33 / 2 + this.anInt2994 * -228338075), (double) (this.aClass364_4.method28063(local38, 1676822063) + local38 / 2 + this.anInt2995 * 1110069385));
		local41.translate(this.aClass364_4.method28067(local33, -1092151362) + this.anInt2994 * -228338075, this.aClass364_4.method28063(local38, 1676822063) + this.anInt2995 * 1110069385);
		local41.drawImage(this.anImage5, null, null);
		local41.setTransform(this.aClass364_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqz", name = "n", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21484(@OriginalArg(0) Graphics arg0) {
		this.aFloat222 += this.aFloat221;
		if (this.aFloat222 < 0.0F) {
			this.aFloat222 += 360.0F;
		}
		this.aFloat222 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat222);
		@Pc(33) int local33 = this.anImage5.getWidth(null);
		@Pc(38) int local38 = this.anImage5.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass364_4.method28067(local33, -1511193603) + local33 / 2 + this.anInt2994 * -228338075), (double) (this.aClass364_4.method28063(local38, 1676822063) + local38 / 2 + this.anInt2995 * 1110069385));
		local41.translate(this.aClass364_4.method28067(local33, 776983141) + this.anInt2994 * -228338075, this.aClass364_4.method28063(local38, 1676822063) + this.anInt2995 * 1110069385);
		local41.drawImage(this.anImage5, null, null);
		local41.setTransform(this.aClass364_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqz", name = "k", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21486(@OriginalArg(0) Graphics arg0) {
		this.aFloat222 += this.aFloat221;
		if (this.aFloat222 < 0.0F) {
			this.aFloat222 += 360.0F;
		}
		this.aFloat222 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat222);
		@Pc(33) int local33 = this.anImage5.getWidth(null);
		@Pc(38) int local38 = this.anImage5.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass364_4.method28067(local33, 521902705) + local33 / 2 + this.anInt2994 * -228338075), (double) (this.aClass364_4.method28063(local38, 1676822063) + local38 / 2 + this.anInt2995 * 1110069385));
		local41.translate(this.aClass364_4.method28067(local33, -573368859) + this.anInt2994 * -228338075, this.aClass364_4.method28063(local38, 1676822063) + this.anInt2995 * 1110069385);
		local41.drawImage(this.anImage5, null, null);
		local41.setTransform(this.aClass364_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqz", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21487(@OriginalArg(0) Graphics arg0) {
		this.aFloat222 += this.aFloat221;
		if (this.aFloat222 < 0.0F) {
			this.aFloat222 += 360.0F;
		}
		this.aFloat222 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat222);
		@Pc(33) int local33 = this.anImage5.getWidth(null);
		@Pc(38) int local38 = this.anImage5.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass364_4.method28067(local33, 280731219) + local33 / 2 + this.anInt2994 * -228338075), (double) (this.aClass364_4.method28063(local38, 1676822063) + local38 / 2 + this.anInt2995 * 1110069385));
		local41.translate(this.aClass364_4.method28067(local33, -583073332) + this.anInt2994 * -228338075, this.aClass364_4.method28063(local38, 1676822063) + this.anInt2995 * 1110069385);
		local41.drawImage(this.anImage5, null, null);
		local41.setTransform(this.aClass364_4.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aqz", name = "w", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	void method21485(@OriginalArg(0) Graphics arg0) {
		this.aFloat222 += this.aFloat221;
		if (this.aFloat222 < 0.0F) {
			this.aFloat222 += 360.0F;
		}
		this.aFloat222 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat222);
		@Pc(33) int local33 = this.anImage5.getWidth(null);
		@Pc(38) int local38 = this.anImage5.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.aClass364_4.method28067(local33, -1191379798) + local33 / 2 + this.anInt2994 * -228338075), (double) (this.aClass364_4.method28063(local38, 1676822063) + local38 / 2 + this.anInt2995 * 1110069385));
		local41.translate(this.aClass364_4.method28067(local33, -1522737325) + this.anInt2994 * -228338075, this.aClass364_4.method28063(local38, 1676822063) + this.anInt2995 * 1110069385);
		local41.drawImage(this.anImage5, null, null);
		local41.setTransform(this.aClass364_4.anAffineTransform1);
	}
}
