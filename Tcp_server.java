import java.io.*;
import java.net.*;
import java.util.*;

public class Tcp_server{

public static void main(String args[]){
try{
ServerSocket ss=new ServerSocket(1044);

System.out.println("Server Started");
Socket s=ss.accept();
System.out.println("Accepted");

InputStream is=s.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br1=new BufferedReader(isr);

OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

DataInputStream dis=new DataInputStream(is);
DataOutputStream dos=new DataOutputStream(os);


String filename=br1.readLine();
File file=new File(filename);
FileInputStream fis=new FileInputStream(file);

byte [] buffer=new byte[(int)(file.length())];
fis.read(buffer,0,buffer.length);

os.write(buffer);
os.flush();



	

s.close();
ss.close();

}
catch(Exception e){
System.out.println("erroe");

}
}

}