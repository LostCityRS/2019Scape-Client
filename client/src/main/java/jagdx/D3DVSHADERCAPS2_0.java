package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DVSHADERCAPS2_0")
public class D3DVSHADERCAPS2_0 {

	@OriginalMember(owner = "client!jagdx/D3DVSHADERCAPS2_0", name = "Caps", descriptor = "I")
	public int Caps;

	@OriginalMember(owner = "client!jagdx/D3DVSHADERCAPS2_0", name = "DynamicFlowControlDepth", descriptor = "I")
	public int DynamicFlowControlDepth;

	@OriginalMember(owner = "client!jagdx/D3DVSHADERCAPS2_0", name = "NumTemps", descriptor = "I")
	public int NumTemps;

	@OriginalMember(owner = "client!jagdx/D3DVSHADERCAPS2_0", name = "StaticFlowControlDepth", descriptor = "I")
	public int StaticFlowControlDepth;

	@OriginalMember(owner = "client!jagdx/D3DVSHADERCAPS2_0", name = "<init>", descriptor = "()V", line = 20)
	D3DVSHADERCAPS2_0() {
	}
}
