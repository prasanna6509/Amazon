package com.mounika;

import java.io.IOException;
import java.util.ArrayList;

import Yashu.Task1;

public class Upload1
{
	
	public static void main(String[] args ) throws IOException, InterruptedException
	{
	Task1 p= new Task1();
	p.open();
	Excel2 excel2= new Excel2();
	excel2.call();
	Xpathforupload Xpathforupload = new Xpathforupload();
	Xpathforupload.path(excel2.userName, excel2.passWord);
	

	}
}
