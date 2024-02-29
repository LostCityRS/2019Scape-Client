package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public class Class377 implements Runnable {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[Lclient!ke;")
	Class376[] aClass376Array1;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Ljava/lang/Thread;")
	Thread aThread7;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Z")
	volatile boolean aBoolean739;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 19)
	Class377() {
	}

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "(I)Lclient!ke;", line = 22)
	Class376 method28048(@OriginalArg(0) int arg0) {
		return this.aClass376Array1 == null || arg0 < 0 || arg0 >= this.aClass376Array1.length ? null : this.aClass376Array1[arg0];
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(II)Lclient!ke;", line = 22)
	Class376 method28049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass376Array1 == null || arg0 < 0 || arg0 >= this.aClass376Array1.length ? null : this.aClass376Array1[arg0];
	}

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "(I)Lclient!ke;", line = 22)
	Class376 method28050(@OriginalArg(0) int arg0) {
		return this.aClass376Array1 == null || arg0 < 0 || arg0 >= this.aClass376Array1.length ? null : this.aClass376Array1[arg0];
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)Lclient!ke;", line = 22)
	Class376 method28051(@OriginalArg(0) int arg0) {
		return this.aClass376Array1 == null || arg0 < 0 || arg0 >= this.aClass376Array1.length ? null : this.aClass376Array1[arg0];
	}

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "(I)Lclient!ke;", line = 22)
	Class376 method28052(@OriginalArg(0) int arg0) {
		return this.aClass376Array1 == null || arg0 < 0 || arg0 >= this.aClass376Array1.length ? null : this.aClass376Array1[arg0];
	}

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "(B)Z", line = 27)
	boolean method28053(@OriginalArg(0) byte arg0) {
		if (this.aBoolean739) {
			return true;
		}
		if (this.aThread7 == null) {
			this.aThread7 = new Thread(this);
			this.aThread7.start();
		}
		return this.aBoolean739;
	}

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "()Z", line = 27)
	boolean method28054() {
		if (this.aBoolean739) {
			return true;
		}
		if (this.aThread7 == null) {
			this.aThread7 = new Thread(this);
			this.aThread7.start();
		}
		return this.aBoolean739;
	}

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "()V", line = 37)
	public void method28055() {
		try {
			@Pc(8) int local8 = Class54.method14852(Class280.aClass693_1, Class703.aClass703_3, Class50.aClass28_3.anInt101 * 2142901097, 42682579);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class50.aClass28_3.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass702_4.anInt5953 * -1111983921)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass376Array1 = new Class376[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass376Array1[local83 / 3] = new Class376(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!kf", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		try {
			@Pc(8) int local8 = Class54.method14852(Class280.aClass693_1, Class703.aClass703_3, Class50.aClass28_3.anInt101 * 2142901097, -1149963884);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class50.aClass28_3.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass702_4.anInt5953 * -1111983921)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass376Array1 = new Class376[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass376Array1[local83 / 3] = new Class376(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 37)
	public void method28056() {
		try {
			@Pc(8) int local8 = Class54.method14852(Class280.aClass693_1, Class703.aClass703_3, Class50.aClass28_3.anInt101 * 2142901097, 777120932);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class50.aClass28_3.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass702_4.anInt5953 * -1111983921)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass376Array1 = new Class376[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass376Array1[local83 / 3] = new Class376(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "()V", line = 37)
	public void method28057() {
		try {
			@Pc(8) int local8 = Class54.method14852(Class280.aClass693_1, Class703.aClass703_3, Class50.aClass28_3.anInt101 * 2142901097, -1155272263);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class50.aClass28_3.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass702_4.anInt5953 * -1111983921)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass376Array1 = new Class376[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass376Array1[local83 / 3] = new Class376(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "()V", line = 37)
	public void method28058() {
		try {
			@Pc(8) int local8 = Class54.method14852(Class280.aClass693_1, Class703.aClass703_3, Class50.aClass28_3.anInt101 * 2142901097, -507551914);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class50.aClass28_3.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass702_4.anInt5953 * -1111983921)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass376Array1 = new Class376[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass376Array1[local83 / 3] = new Class376(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!kf", name = "vw", descriptor = "(Lclient!yf;B)V", line = 8778)
	static final void method28059(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		Class367.method27960(local13, (byte) 62);
	}

	@OriginalMember(owner = "client!kf", name = "aul", descriptor = "(Lclient!yf;B)V", line = 13401)
	static final void method28060(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class78.method1316(Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 109), 200, 1323350560);
	}
}
