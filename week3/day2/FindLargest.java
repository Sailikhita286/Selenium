package week3.day2;

import java.util.Arrays;
import java.util.Collections;


public class FindLargest {
    public static void main(String[] args) {
        
        Integer[] a1 = {3, 2, 11, 4, 6, 7};

        List<Integer> list = Arrays.asList(a1);

        Collections.sort(list);
        
        System.out.println("Ascending order: " +list);

        int FindLargest = list.get(list.size() - 2);

        System.out.println("Second largest: " + FindLargest);
			
			}

		

	

	}


