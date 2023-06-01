import java.io.*;
import java.net.*;
import java.util.*;

public class server_1{

public static void main(String args[]){
try{
ServerSocket ss=new ServerSocket(1222);
Socket s=ss.accept();
System.out.println("Hop on");

InputStream is = s.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br1=new BufferedReader(isr);

OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);
DataOutputStream dos=new DataOutputStream(os);
DataInputStream dis=new DataInputStream(is);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


ps.println("Connection Esatblished: Hello Client");

Calendar cl=Calendar.getInstance();

String time="**"+cl.get(Calendar.HOUR)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND);

ps.println(time);



String filename=br1.readLine();
System.out.println("Client  Requested this file:"+filename);

File file=new File(filename);
FileInputStream fis=new FileInputStream(file);
byte [] buffer =new byte[(int)(file.length())];

fis.read(buffer,0,buffer.length);

os.write(buffer);


s.close();
ss.close();


}
catch(Exception e){
System.out.println("Something wrong");




}

}


}