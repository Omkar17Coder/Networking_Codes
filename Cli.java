import java.io.*;

import java.net.*;
import java.util.*;

public class Cli{


public static void main(String args[]){
try{
DatagramSocket ds=new DatagramSocket();

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter message:");
String x=br.readLine();

InetAddress ia=InetAddress.getByName("localhost");

byte data[]= x.getBytes();

DatagramPacket dp=new DatagramPacket(data,data.length,ia,1334);
ds.send(dp);


byte [] b=new byte[65536];
DatagramPacket dp1=new DatagramPacket(b,b.length);
ds.receive(dp1);

String reply=new String(dp1.getData());

System.out.println(reply);






}
catch(Exception e){

System.out.println("Something wrong");
}

}

}