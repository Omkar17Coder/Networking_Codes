import java.io.*;

import java.net.*;
import java.util.*;

public class Ser{

	
public static void main(String args[]){
try{
DatagramSocket ds=new DatagramSocket(1334);

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



byte [] b=new byte[65536];
DatagramPacket dp1=new DatagramPacket(b,b.length);
ds.receive(dp1);

String reply=new String(dp1.getData());

System.out.println(reply);
System.out.println("enter message:");

Calendar cls=Calendar.getInstance();
String s=""+ (cls.get(Calendar.HOUR));
String  h=""+(cls.get(Calendar.MINUTE));
String z=""+(cls.get(Calendar.SECOND));

String time=s+":"+h+":"+z;


InetAddress ia=InetAddress.getByName("localhost");

byte data[]= time.getBytes();

DatagramPacket dp=new DatagramPacket(data,data.length,ia,dp1.getPort());
ds.send(dp);

}
catch(Exception e){

System.out.println("Something wrong");
}

}

}