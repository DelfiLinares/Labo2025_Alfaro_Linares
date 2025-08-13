import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws IOException {
        int puerto = 5000; // Puerto de escucha
        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Servidor escuchando en puerto " + puerto + "...");

        Socket socket = servidor.accept(); // Espera conexión
        System.out.println("Cliente conectado.");

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

        String mensaje = entrada.readLine();
        System.out.println("Cliente dice: " + mensaje);

        salida.println("Hola desde el servidor!");

        socket.close();
        servidor.close();
    }
}
