import java.io.*;
import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseJson {
    public static void main (String [] args){
        String json = "";

        try{

            BufferedReader  br = new BufferedReader (new FileReader("usuarios.json"));


            String linea ="";
            while ((linea = br.readLine()) != null){
                json += linea;
            }



            br.close();

        } catch (FileNotFoundException ex){
            Logger.getLogger(BaseJson.class.getName()).log(Level.SEVERE, null, ex);


        } catch (IOException ex){
            Logger.getLogger(BaseJson.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(json);
        Gson gson = new Gson();
        Cartas c = gson.fromJson(json, Cartas.class);
        System.out.println(c);

    }
}
