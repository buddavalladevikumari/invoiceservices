package com.example.demo;

import com.example.demo.service.Invoiceservice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Invoiceservice service = new Invoiceservice(); 
        System.out.println( "Hello World!"+service.getInvoice() );
    }
}
