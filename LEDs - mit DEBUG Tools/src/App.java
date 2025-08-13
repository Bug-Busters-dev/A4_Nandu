public class App {
    public static void main(String[] args) throws Exception {
        String dateipfad = "C:\\Users\\Jonathan Salomo\\Documents\\Programiren\\Informatik Wettbewerb\\LEDs\\LEDs\\Ausgabe.text";

        FileReaderx fileReaderx = new FileReaderx();
        //Printer printer = new Printer();

        int[] größe = fileReaderx.readLineToArray(dateipfad,1);

        /* System.out.println("Breite:"+ größe[0]);
        System.out.println("Länge:" + größe[1]); */

        String[][] matrix = fileReaderx.redarray(dateipfad, 1, größe[1], größe[0], größe[1]);

        /* printer.outArray2(matrix); */

        LEDberechner leDberechner = new LEDberechner(größe[0], größe[1], matrix[0]);
        for(int i = 1; i < größe[1]; i++){
            /* if (i+1 == größe[1]){
               System.out.println("Ergebnis:");
               printer.outArray1boll(leDberechner.berechneonLEDs(matrix[i]));
               break;
            } */
            leDberechner.berechneonLEDs(matrix[i]);
        }

        FileCreator fileCreator = new FileCreator(dateipfad);

        System.out.println("Ergebnis:");
        fileCreator.createFile("Ergebnis:");

        int LEDnummer = 0;
        for(int i = 0; i < größe[0]; i++){
            if (matrix[größe[1]-1][i].startsWith("L")){
                LEDnummer ++;
                System.out.println("L"+LEDnummer+": "+leDberechner.lastonLEDs[i]);
                fileCreator.appendData("L"+LEDnummer+": "+leDberechner.lastonLEDs[i], true);
            }
        }
    }
}
