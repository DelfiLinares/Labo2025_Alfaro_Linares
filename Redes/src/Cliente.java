import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host = "localhost"; // O "127.0.0.1"
        int puerto = 5000;

        Socket socket = new Socket(host, puerto);
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        salida.println("Hola desde el cliente!");
        String respuesta = entrada.readLine();
        System.out.println("Servidor responde: " + respuesta);

        socket.close();
    }
}
