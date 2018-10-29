/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A204519
 */


   
    public class nestedLoops{
        public static void main(String[] args) {
            
            int matrix2[][][] = 
                {
                    {
                                {1,2,3,4,5},
                                {6,7,8},
                                {66,77,88},
                                {16,17,18}
                    },
                    {
                                {10,20,30,40,50},
                                {60,70,80},
                                {600,700,800}
                    }
                };
            
            for (int i = 0; i < matrix2.length; ++i) {
        for(int j = 0; j < matrix2[i].length; ++j) {
            for (int k = 0; k < matrix2[i][j].length; ++k)
           System.out.println(matrix2[i][j][k]);
        }
     }
                
//            for (int[][] array2: matrix2) {
//        for (int[] array1: array2) {
//           for(int item: array1) {
//              System.out.println(item);
//           }
//        }
//     }
            
                

        }
        
    }