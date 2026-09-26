package Revision.Day03_hash_map_set;

import java.util.HashMap;
import java.util.HashSet;

public class Practice {

    public static void main(String [] arg){

        int[] arr = {10,20};
        HashSet <Integer>map =  new HashSet<>();
        boolean duplicatNumber = false;

        for(Integer number : arr) {
            if(map.contains(number)) {
                System.out.print("Duplicate is Present : " + number);
                duplicatNumber =true;
                break;
            }else{
                map.add(number);
            }
            }

        if(!duplicatNumber){
            System.out.print("No Duplicate");
        }
        }

    }

