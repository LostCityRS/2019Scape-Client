package jagdx;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DPRESENT_PARAMETERS")
public class D3DPRESENT_PARAMETERS {

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "e", descriptor = "I")
	public static final int e = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "Windowed", descriptor = "Z")
	public boolean Windowed;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "EnableAutoDepthStencil", descriptor = "Z")
	public boolean EnableAutoDepthStencil;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "Flags", descriptor = "I")
	public int Flags;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "FullScreen_RefreshRateInHz", descriptor = "I")
	public int FullScreen_RefreshRateInHz;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferWidth", descriptor = "I")
	public int BackBufferWidth = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferHeight", descriptor = "I")
	public int BackBufferHeight = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferFormat", descriptor = "I")
	public int BackBufferFormat = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferCount", descriptor = "I")
	public int BackBufferCount = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "MultiSampleType", descriptor = "I")
	public int MultiSampleType = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "MultiSampleQuality", descriptor = "I")
	public int MultiSampleQuality = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "SwapEffect", descriptor = "I")
	public int SwapEffect = 1;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "AutoDepthStencilFormat", descriptor = "I")
	public int AutoDepthStencilFormat = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "PresentationInterval", descriptor = "I")
	public int PresentationInterval = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "DeviceWindow", descriptor = "Ljava/awt/Component;")
	public Component DeviceWindow;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 56)
	public D3DPRESENT_PARAMETERS(@OriginalArg(0) Component arg0) {
		this.DeviceWindow = arg0;
	}
}
