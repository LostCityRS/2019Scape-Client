package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DADAPTER_IDENTIFIER")
public class D3DADAPTER_IDENTIFIER {

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "Driver", descriptor = "Ljava/lang/String;")
	public String Driver;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "Description", descriptor = "Ljava/lang/String;")
	public String Description;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "DeviceName", descriptor = "Ljava/lang/String;")
	public String DeviceName;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "DriverVersion", descriptor = "J")
	public long DriverVersion;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "VendorID", descriptor = "I")
	public int VendorID;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "DeviceID", descriptor = "I")
	public int DeviceID;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "SubSysID", descriptor = "I")
	public int SubSysID;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "Revision", descriptor = "I")
	public int Revision;

	@OriginalMember(owner = "client!jagdx/D3DADAPTER_IDENTIFIER", name = "WHQLLevel", descriptor = "I")
	public int WHQLLevel;
}
