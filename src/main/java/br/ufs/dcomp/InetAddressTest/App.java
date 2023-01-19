package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "google.com";
            InetAddress addresses[] = InetAddress.getAllByName(name); 
            System.out.println( "Name:      "+ name);
            for (int i = 0; i < addresses.length; i++) {
                System.out.println( "Address:   "+ addresses[i].getHostAddress());
            };
            
 

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
