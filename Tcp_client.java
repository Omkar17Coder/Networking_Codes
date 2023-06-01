import java.io.*;
import java.net.*;

public class Tcp_client{

public static void main(String args[]){




try{
Socket s=new Socket("localhost",1044);

InputStream is=s.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br1=new BufferedReader(isr);

OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

DataOutputStream dos=new DataOutputStream(os);
DataInputStream dis=new DataInputStream(is);


System.out.println("Enter file name you want:");
String name=br.readLine();

ps.println(name);

byte [] data=new byte[1000];

is.read(data);

File f=new File("my.txt");
FileOutputStream fos=new FileOutputStream(f);

fos.write(data,0,data.length);
System.out.println("happy birthday");


s.close();


}
catch(Exception e){
System.out.println("erroe");

}
}

}