/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnonrepeatednumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vivek
 */
public class PrintNonRepeatedNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer[] inputArray1 = {1,2,2,3,3,3};
       Integer[] inputArray2 = {2,3,3};
       Integer[] inputArray3 = {1,2,3,3,3};
       
       PrintNonRepeatedNumbers instance = new PrintNonRepeatedNumbers();
       instance.printNonRepeatedElements(inputArray1);
       instance.printNonRepeatedElements(inputArray2);
       instance.printNonRepeatedElements(inputArray3);
    }
    
    void printNonRepeatedElements(Integer[] inputArray){
        
    Set<Integer> uniqueSet = new HashSet<Integer>();
    
    uniqueSet.addAll(Arrays.asList(inputArray));
    
    List<Integer> outputArray = new ArrayList<>();
    
    for(int currNumber : inputArray){
        if(uniqueSet.contains(currNumber)){
        outputArray.add(currNumber);
        uniqueSet.remove(currNumber);
        }
        else{
            if(outputArray.contains(currNumber)){
            outputArray.remove(outputArray.indexOf(currNumber));
            }
        }
    }
        System.out.println(outputArray);
    }
    
}
