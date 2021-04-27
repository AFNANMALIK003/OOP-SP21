/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_LAB9;

/**
 *
 * @author Khurshid Awan
 */
import java.util.*;
public class CustomStringTokenizer
{

    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), finalCount=0;
        String temp;
        boolean flag;
        double dValue;

        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();

            try{
                dValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException e){
                flag=false;
            }

            if(!flag)
                finalCount++;
        }
        return finalCount;
    }

}    
     
