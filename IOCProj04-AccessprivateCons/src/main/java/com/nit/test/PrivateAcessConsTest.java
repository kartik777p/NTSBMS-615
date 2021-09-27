package com.nit.test;

import java.lang.reflect.Constructor;

import com.nit.commons.Test;

public class PrivateAcessConsTest
{
    public static void main( String[] args )throws Exception {
    	//load  given class
       Class clazz=Class.forName(args[0]); //get from cmd prompt
       
       //get that classs all constructor
       Constructor cons[]=clazz.getDeclaredConstructors();
       
      //we got private cons now we have to make it acesable
       //cons[0]=non param cons  this is private make it acessable
       cons[0].setAccessible(true); //(Zero param)
        //cons[1]=2 param cons   this is private make it acessable
       cons[1].setAccessible(true); //2 param
       
       //now create obj bcz both cons is acessable now
     Object obj1=cons[0].newInstance();  //create obj using zero param cons
     //type cast to its own obj for calling direct method
     Test t1=(Test)obj1;
     
     //call toString method
     System.out.println(t1.toString());
     System.out.println("****************************************");
     
     //create obj using 2 param cons by passing value
     Object obj2=cons[1].newInstance(20,"Mahesh");  //given that value to cons
     //type cast to its own obj
     Test t2=(Test)obj2;
      //print data
     System.out.println(t2.toString());
       
    }
}
