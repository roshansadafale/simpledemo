package com.singleton;

public class SingleObject 
{
     private static SingleObject instance = new SingleObject();
     
     private SingleObject()
     {
    	 
     }
     public static SingleObject getinstance() 
     {
    	 return instance;
     }
     public void showmessage()
     {
    	 System.out.println("Hello world");
     }
}
