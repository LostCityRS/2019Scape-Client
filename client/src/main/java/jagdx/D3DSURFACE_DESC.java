package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DSURFACE_DESC")
public class D3DSURFACE_DESC {

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Format", descriptor = "I")
	public int Format;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Type", descriptor = "I")
	public int Type;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Usage", descriptor = "I")
	public int Usage;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Pool", descriptor = "I")
	public int Pool;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "MultiSampleType", descriptor = "I")
	public int MultiSampleType;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "MultiSampleQuality", descriptor = "I")
	public int MultiSampleQuality;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Width", descriptor = "I")
	public int Width;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "Height", descriptor = "I")
	public int Height;

	@OriginalMember(owner = "client!jagdx/D3DSURFACE_DESC", name = "<init>", descriptor = "()V", line = 32)
	private D3DSURFACE_DESC() throws Throwable {
		throw new Error();
	}
}
