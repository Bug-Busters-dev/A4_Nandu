public class LEDberechner {
    Boolean[] lastonLEDs;
    Boolean[] onLEDs;

    public LEDberechner(int breite,int länge,String[] LEDs){
        int LEDnummer = 1;
        lastonLEDs = new Boolean[breite];
        for(int r = 0; r < lastonLEDs.length;r++){
            lastonLEDs[r] = false;
        }
        for(int i = 0; i < LEDs.length; i++){
            if (LEDs[i].equals("Q" + String.valueOf(LEDnummer))){
                LEDnummer ++;
                lastonLEDs[i] = true;
            }
        }
        onLEDs = new Boolean[breite];
        for(int r = 0; r < onLEDs.length;r++){
            onLEDs[r] = false;
        }
    }

    public Boolean[] berechneonLEDs(String[] zeile){
        for(int i = 0; i < zeile.length; i++){
            if (lastonLEDs[i]){
                if (zeile[i].equals("B")){
                    onLEDs[i] = true;
                } else if (zeile[i].equals("W")){
                    if (zeile[i-1].equals("W")){
                        if (lastonLEDs[i-1]){
                            
                        } else if(!lastonLEDs[i-1]){
                            onLEDs[i-1] = true;
                            onLEDs[i] = true;
                        }
                    } else if (zeile[i+1].equals("W")){
                        if (lastonLEDs[i+1]){
                            
                        } else if(!lastonLEDs[i+1]){
                            onLEDs[i+1] = true;
                            onLEDs[i] = true;
                        }
                    }
                } else if (zeile[i].equals("r")){
                    if (zeile[i-1].equals("R")){
                        if (lastonLEDs[i-1]){
                            
                        } else if(!lastonLEDs[i-1]){
                            onLEDs[i-1] = true;
                            onLEDs[i] = true;
                        }
                    } else if (zeile[i+1].equals("R")){
                        if (lastonLEDs[i+1]){
                            
                        } else if(!lastonLEDs[i+1]){
                            onLEDs[i+1] = true;
                            onLEDs[i] = true;
                        }
                    }
                } else if (zeile[i].startsWith("L")) {
                    onLEDs[i] = true; 
                }
    
            }
    
            if (zeile[i].equals("R") && !lastonLEDs[i]){
                if (zeile[i-1].equals("r")){
                    onLEDs[i-1] = true;
                    onLEDs[i] = true;
                } else if (zeile[i+1].equals("r")){
                    onLEDs[i+1] = true;
                    onLEDs[i] = true;
                }
            } else if (zeile[i].equals("W") && !lastonLEDs[i]){
                if (zeile[i-1].equals("W")){
                    onLEDs[i-1] = true;
                    onLEDs[i] = true;
                } else if (zeile[i+1].equals("W")){
                    onLEDs[i+1] = true;
                    onLEDs[i] = true;
                }
            }
        }
        lastonLEDs = onLEDs.clone();

        for(int r = 0; r < onLEDs.length;r++){
            onLEDs[r] = false;
        }
    
        return lastonLEDs;
    }

}
