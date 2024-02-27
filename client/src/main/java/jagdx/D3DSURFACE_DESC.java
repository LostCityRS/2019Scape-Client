package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DSURFACE_DESC")
public final class D3DSURFACE_DESC {

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Format", descriptor = "I")
	public int anInt4368;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Type", descriptor = "I")
	public int anInt4369;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Usage", descriptor = "I")
	public int anInt4370;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Pool", descriptor = "I")
	public int anInt4371;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "MultiSampleType", descriptor = "I")
	public int anInt4372;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "MultiSampleQuality", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Width", descriptor = "I")
	public int anInt4374;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Height", descriptor = "I")
	public int anInt4375;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "<init>", descriptor = "()V")
	private D3DSURFACE_DESC() throws Throwable {
		throw new Error();
	}
}
