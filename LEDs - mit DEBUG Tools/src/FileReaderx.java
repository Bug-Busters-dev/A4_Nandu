
import java.io.*;

public class FileReaderx {

    public int[] readLineToArray(String file, int zeile) {
        int[] inhalt = {0,0};

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

                for (int p = 0; p < zeile; p++) {

                    String zinhalt = br.readLine();
                
                    if (zinhalt == null) {
                        break;
                    }

                    try {

                        String[] splitValues = zinhalt.split(" ");
                        for (int i = 0; i < splitValues.length; i++) {
                        inhalt[i]  = Integer.parseInt(splitValues[i]); 
                        }

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        System.err.println("Die Datei hat nicht das richtige Format.");
                    }
                
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Datei existiert nicht.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Lesen hat nicht geklappt.");
        }
        return inhalt;
    }
 
    public String[][] redarray(String file, int aZeile, int eZeile, int anzahlSpalten,int anzahlZeilen){
        if (anzahlSpalten < 0 || anzahlZeilen < 0){
            System.err.println("Die Eingabe ist negativ und ungültig.");
        }
            String [][] map = new String[anzahlZeilen][anzahlSpalten];
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            for (int q = 0; q < aZeile; q++) {
                br.readLine();
            }
            for (int p = 0; p < eZeile; p++) {

                    String zinhalt = br.readLine();
                
                    if (zinhalt == null) {
                        break;
                    }

                    StringBuilder sb = new StringBuilder(zinhalt);
                    for (int i = 1; i < sb.length(); i++) {
                        if (sb.charAt(i) == ' ' && sb.charAt(i - 1) == ' ') {
                            sb.deleteCharAt(i - 1);
                            i--;
                        }
                    }

                    zinhalt = sb.toString();

                    String[] splitValues = zinhalt.split(" ");

                    for (int i = 0; i < splitValues.length; i++) {
                        map[p][i]  = splitValues[i]; 
   
                }
                
                }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Datei existiert nicht.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Lesen hat nicht geklappt.");
        }
        return map;
    }
}
