package jagdx;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DPRESENT_PARAMETERS")
public final class D3DPRESENT_PARAMETERS {

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "e", descriptor = "I")
	public static final int anInt4351 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "Windowed", descriptor = "Z")
	public boolean aBoolean734;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "EnableAutoDepthStencil", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "Flags", descriptor = "I")
	public int anInt4360;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "FullScreen_RefreshRateInHz", descriptor = "I")
	public int anInt4361;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferWidth", descriptor = "I")
	public int anInt4352 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferHeight", descriptor = "I")
	public int anInt4353 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferFormat", descriptor = "I")
	public int anInt4354 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferCount", descriptor = "I")
	public int anInt4355 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "MultiSampleType", descriptor = "I")
	public int anInt4356 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "MultiSampleQuality", descriptor = "I")
	public int anInt4357 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "SwapEffect", descriptor = "I")
	public int anInt4358 = 1;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "AutoDepthStencilFormat", descriptor = "I")
	public int anInt4359 = 0;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "PresentationInterval", descriptor = "I")
	public int anInt4362 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "DeviceWindow", descriptor = "Ljava/awt/Component;")
	public Component aComponent4;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public D3DPRESENT_PARAMETERS(@OriginalArg(0) Component arg0) {
		this.aComponent4 = arg0;
	}
}
