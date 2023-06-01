import java.io.*;
import java.net.*;
import java.util.*;

public class cliennt_1{

public static void main(String args[]){
try{

Socket s=new Socket("localhost",1222);

InputStream is = s.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br1=new BufferedReader(isr);

OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);
DataOutputStream  dos=new DataOutputStream(os);
DataInputStream dis=new DataInputStream(is);


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String into=br1.readLine();
System.out.println(into);

String time=br1.readLine();
System.out.println(time);




System.out.println("Enter file name needed:");
String file=br.readLine();
ps.println(file);

byte [] data =new byte[10000];
File f=new File("lab.txt");

FileOutputStream fos=new FileOutputStream(f);
is.read(data);
fos.write(data,0,data.length);






s.close();
}
catch(Exception e){

System.out.println("Something wrong");
}

}


}