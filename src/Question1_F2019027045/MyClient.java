
package Question1_F2019027045;

import java.io.DataOutputStream;
import java.net.Socket;


public class MyClient {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 786);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Hello Arslan");
            
            dout.flush();
            dout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
