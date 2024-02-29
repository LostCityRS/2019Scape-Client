package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DDISPLAYMODE")
public class D3DDISPLAYMODE {

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "Width", descriptor = "I")
	public int Width;

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "Height", descriptor = "I")
	public int Height;

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "RefreshRate", descriptor = "I")
	public int RefreshRate;

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "Format", descriptor = "I")
	public int Format;
}
