package com.singleton;

public class Singletonpatterndemo {

	public static void main(String[] args) 
	{
		SingleObject object = SingleObject.getinstance(); // return an object which is passed to another object
         object.showmessage();
	}

}
