public class Printer {

    public void outArray2(String[][] matrix){
    
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j].length() < 2){
                    System.out.print(matrix[i][j]+"  ");    
                } else{
                    System.out.print(matrix[i][j]+" ");
                }   
                }
            System.out.println();
        }
    }

    public void outArray1(String[] matrix){

        for (int i = 0; i < matrix.length; i++){
            if (matrix[i].length() < 1){
                System.out.print(i +": "+matrix[i]+" ");    
            } else{
                System.out.print(i +":"+matrix[i]+" ");
            }   
        }
        System.out.println();
    }

    public void outArray1boll(Boolean[] matrix){

        for (int i = 0; i < matrix.length; i++){
            if (matrix[i]){
                System.out.print(i +": "+matrix[i]+" ");    
            } else{
                System.out.print(i +":"+matrix[i]+" ");
            }
        }
        System.out.println();
    }
} 