package com.jagex;

import java.applet.*;
import java.awt.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.*;
import java.util.*;

import javax.swing.*;

// ideally you'd use JagexAppletViewer, but this is handy for quick testing
public class ClientApplet extends Applet implements AppletStub {
    public static final String HOST_ADDRESS = "localhost";

    public static Properties client_parameters = new Properties();

    static {
        client_parameters.put("1", "");
        client_parameters.put("2", "false");
        client_parameters.put("3", "0");
        client_parameters.put("5", "false");
        client_parameters.put("6", "xsGopIATutZQ1T4lxf3id4LxiKkqRw7*");
        client_parameters.put("8", "43594");
        client_parameters.put("9", "0");
        client_parameters.put("10", ".runescape.com");
        client_parameters.put("11", "-1782016818");
        client_parameters.put("12", "43594");
        client_parameters.put("13", "");
        client_parameters.put("14", "content.runescape.com");
        client_parameters.put("16", "");
        client_parameters.put("17", "8048");
        client_parameters.put("18", "https://payments.jagex.com/operator/v1/");
        client_parameters.put("19", "443");
        client_parameters.put("20", "110");
        client_parameters.put("22", "https://auth.jagex.com/");
        client_parameters.put("23", "content.runescape.com");
        client_parameters.put("24", "0");
        client_parameters.put("25", "0");
        client_parameters.put("26", "0");
        client_parameters.put("27", "0");
        client_parameters.put("28", "http://" + HOST_ADDRESS);
        client_parameters.put("29", "43594");
        client_parameters.put("30", "443");
        client_parameters.put("31", "false");
        client_parameters.put("32", "1200");
        client_parameters.put("33", "false");
        client_parameters.put("34", "0");
        client_parameters.put("35", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
        client_parameters.put("36", "0");
        client_parameters.put("37", "http://services.runescape.com/m=gamelogspecs/clientstats?data=");
        client_parameters.put("38", "http://" + HOST_ADDRESS);
        client_parameters.put("39", "0");
        client_parameters.put("40", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
        client_parameters.put("41", "443");
        client_parameters.put("42", "false");
        client_parameters.put("43", HOST_ADDRESS);
        client_parameters.put("44", "80");
        client_parameters.put("45", "0");
        client_parameters.put("46", "0");
        client_parameters.put("47", "");
        client_parameters.put("48", "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com");
        client_parameters.put("49", "false");
        client_parameters.put("50", "7");
        client_parameters.put("51", "");
        client_parameters.put("52", "false");
        client_parameters.put("53", "443");
        client_parameters.put("54", "1137");
        client_parameters.put("55", "false");
    }

    public static void main(String[] args) {
        ClientApplet applet = new ClientApplet();
        applet.start();
    }

    public void start() {
        try {
            JFrame frame = new JFrame("RuneScape 3");
            frame.add(this);
            frame.setVisible(true);
            frame.setSize(1280, 720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            client cl = new client();
            cl.supplyApplet(this);
            cl.init();
            cl.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}

	@Override
	public String getParameter(String paramName) {
		return (String) client_parameters.get(paramName);
	}

	@Override
	public URL getDocumentBase() {
        return this.getCodeBase();
	}

    @Override
    public URL getCodeBase() {
        try {
            return new URL("http://" + HOST_ADDRESS);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
