import rs2.client.Client;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

// properly, you'd use JagexAppletViewer, but this is handy for quick testing
public class AppletViewer extends Applet implements AppletStub {
    public static final String HOST_ADDRESS = "127.0.0.1";

    public static Properties client_parameters = new Properties();

    static {
        // General
        client_parameters.put("1", "");
        client_parameters.put("2", "false");
        client_parameters.put("3", "0");
        client_parameters.put("5", "false");
        client_parameters.put("6", "Rxl4woCZsjcFFBT6wt6lwbrHiydCjdD8"); // dynamic
        client_parameters.put("9", "0");
        client_parameters.put("11", "1449949008"); // dynamic
        client_parameters.put("16", "");
        client_parameters.put("17", "14560"); // dynamic
        client_parameters.put("20", "110");
        client_parameters.put("24", "0"); // modewhere
        client_parameters.put("25", "0");
        client_parameters.put("26", "0");
        client_parameters.put("27", "0");
        client_parameters.put("31", "false");
        client_parameters.put("33", "false");
        client_parameters.put("34", "0");
        client_parameters.put("35", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk"); // dynamic
        client_parameters.put("36", "0");
        client_parameters.put("39", "0");
        client_parameters.put("40", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
        client_parameters.put("42", "false");
        client_parameters.put("46", "0");
        client_parameters.put("47", "");
        client_parameters.put("49", "false");
        client_parameters.put("51", "");
        client_parameters.put("52", "false");
        client_parameters.put("55", "false");

        // Connection 1
        client_parameters.put("28", "http://" + HOST_ADDRESS);

        // Connection 2 (content)
        client_parameters.put("23", HOST_ADDRESS);
        client_parameters.put("12", "43594");
        client_parameters.put("30", "443");
        client_parameters.put("32", "1200");

        // Connection 3 (httpContent)
        client_parameters.put("14", HOST_ADDRESS);
        client_parameters.put("44", "80");
        client_parameters.put("53", "443");
        client_parameters.put("45", "0");

        // Connection 4 (lobby)
        client_parameters.put("43", HOST_ADDRESS);
        client_parameters.put("29", "43594");
        client_parameters.put("41", "443");
        client_parameters.put("54", "1132"); // differs

        // Connection 5 (world)
        client_parameters.put("8", "43594");
        client_parameters.put("19", "443");
        client_parameters.put("50", "7");

        // Services
        client_parameters.put("10", HOST_ADDRESS); // .runescape.com
        client_parameters.put("13", "");
        client_parameters.put("18", "http://" + HOST_ADDRESS + "/operator/v1/");
        client_parameters.put("22", "http://" + HOST_ADDRESS +"/");
        client_parameters.put("37", "http://" + HOST_ADDRESS + "/m=gamelogspecs/clientstats?data=");
        client_parameters.put("38", "http://" + HOST_ADDRESS);
        client_parameters.put("48", ""); // 196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com
    }

    public static void main(String[] args) {
        AppletViewer applet = new AppletViewer();
        applet.start();
    }

    public void start() {
        try {
            JFrame frame = new JFrame("RuneScape 3");
            frame.add(this);
            frame.setVisible(true);
            frame.setSize(1280, 720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
            frame.toFront();

            Client cl = new Client();
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
