package com.git.repo;

import java.util.ArrayList;
import java.util.List;

public class GitRepository {
	

	public static void main(String[] args) {


        List<String> verticesposition2 = new ArrayList<String>();

        verticesposition2.add("safdsfVertex");

        verticesposition2.add("safdsfNamesfsd");
     verticesposition2.add("notCONTAINS");
        verticesposition2.add(" shoes");

        for (String str5 : verticesposition2){

            if((str5.contains("Vertex")||str5.contains("Name")||str5.contains("Transmittance")||str5.contains("shoes"))){

                System.out.println(str5);
                
                int num1 =5;
                int num2 =8;
                int num3;
                num3 = num1 + num2;
                System.out.println(num3);
                String hello = "I am new to gitHub";
                System.out.println(hello);



                
  String hi = "I am also coding";
  System.out.println(hi);

                String min = "I am new to gitHub";
                System.out.println(min);
                

       
            }
        }
	
	}
	

}