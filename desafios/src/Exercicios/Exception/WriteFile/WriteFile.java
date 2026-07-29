package Exercicios.Exception.WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String data = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")){
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
