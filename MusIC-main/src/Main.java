import java.io.*;

/* Where the program breaks:
 * - multiple voices starting at different spots
 * - //time signatures that aren't 4/4 (just plays at the wrong tempo)// FIXED
 * - uneven subdivisions of notes with a lot of subdivision (9 tuplets don't work but 6 and under work)
 * - tempo markings with notes other than quarter notes
 */

public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("http.agent", "Mozilla/5.0 (X11; Linux x86_64; rv:47.0) Gecko/20100101 Firefox/47.0");
        //File br = new File("MusicXML/Bohemian_Rhapsody.musicxml");
        File output = new File ("aaaa.wav");
        MusicXMLFileHelper.xml2wav(MusicXMLFileHelper.xmlEdit(new File ("MusicXML/Portals.musicxml")),output);
        MusicXMLFileHelper.midi2wav(new File("output.mid"), new File("output.wav"));
    }
}
