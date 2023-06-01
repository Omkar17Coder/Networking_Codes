import java.io.*;

import java.net.*;
import java.util.*;

public class upd_server{

	
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

String x=br.readLine();

InetAddress ia=IntAddress.getByName("localhost");


Calendar cls=new Calendar.getInstance();
String s=cls.get(Calendar.HOUR);
String  h=cls.get(Calendar.MINUTE);
String z=cls.get(Calendar.SECOND);

String time=s=":"+h":"+"z";





byte data[]= time.getBytes();

DatagramPacket dp=new DatagramPacket(data,data.length,ia,dp1.getPort());
ds.send(dp);

}
catch(Exception e){

System.out.println("Something wrong");
}

}

}