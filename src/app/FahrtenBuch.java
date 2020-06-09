package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class FahrtenBuch {

    private String filename;

    public FahrtenBuch(String s) {
        filename = s;
    }

    // Öffnen der Datei, Schreiben des Logbucheintrages, schließen der Datei
    public void log(KFZ kfz) {
        try {
            FileWriter fw = new FileWriter(filename,true);
            Date d = new Date(System.currentTimeMillis());
            fw.append(d.toLocaleString() + " " + kfz.getHersteller() + " " + kfz.getLaufleistung() + " km\r\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Kann file " + filename + " nicht schreiben!");
        }
    }

    public String toString() {
        File f = new File(filename);
        String s="";
        try {
            FileInputStream is = new FileInputStream(f);
            Scanner sc = new Scanner(is);
            while (sc.hasNext()) {
                s=s+sc.nextLine()+"\r\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("Kann Log Datei "+filename+" nicht finden!");
        }
        return s;
    }
}