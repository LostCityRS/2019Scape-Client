package jagex3;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ats")
public final class Class112_Sub2_Sub2_Sub1 extends Class112_Sub2_Sub2 {

	@OriginalMember(owner = "client!ats", name = "u", descriptor = "Ljava/awt/Image;")
	Image anImage6;

	@OriginalMember(owner = "client!ats", name = "<init>", descriptor = "(Lclient!afg;Ljava/awt/Canvas;II)V")
	Class112_Sub2_Sub2_Sub1(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg1, arg2, arg3);
		new Rectangle();
		this.method23711(1887368484);
	}

	@OriginalMember(owner = "client!ats", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
	}

	@OriginalMember(owner = "client!ats", name = "b", descriptor = "(I)V")
	@Override
	void method23711(@OriginalArg(0) int arg0) {
		super.method23711(1847457931);
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray276, this.anIntArray276.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909), local11, null);
		this.anImage6 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ats", name = "a", descriptor = "()I")
	@Override
	public int method23767() {
		return this.method23766(0, 0);
	}

	@OriginalMember(owner = "client!ats", name = "g", descriptor = "(II)I")
	@Override
	public int method23766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas5.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage6, arg0, arg1, this.aCanvas5);
			return 0;
		}
	}

	@OriginalMember(owner = "client!ats", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
	}

	@OriginalMember(owner = "client!ats", name = "al", descriptor = "()V")
	@Override
	void method23714() {
		super.method23711(2106517909);
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray276, this.anIntArray276.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909), local11, null);
		this.anImage6 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ats", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
	}

	@OriginalMember(owner = "client!ats", name = "ac", descriptor = "()V")
	@Override
	void method23715() {
		super.method23711(1724058410);
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray276, this.anIntArray276.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909), local11, null);
		this.anImage6 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!ats", name = "ae", descriptor = "()I")
	@Override
	public int method23771() {
		return this.method23766(0, 0);
	}

	@OriginalMember(owner = "client!ats", name = "ag", descriptor = "(II)I")
	@Override
	public int method23772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas5.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage6, arg0, arg1, this.aCanvas5);
			return 0;
		}
	}
}
