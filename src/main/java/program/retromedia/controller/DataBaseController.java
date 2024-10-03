package program.retromedia.controller;

import java.io.*;
import java.nio.file.Path;
import java.util.Optional;

public class DataBaseController {

    public void CreateFileDb()  {
       File pathConfig = new File("src/main/resources/config/db_config.json");
       File pathTableDb = new File("src/main/resources/program/retromedia/database/table/pathList.json");
        try {
            if (pathTableDb.createNewFile()) {
                System.out.println("Arquivo:" + pathTableDb.getName() + " criado com sucesso!!!");
                DataPatternDb(pathConfig,pathTableDb);
            } else {
                System.out.println("Arquivo já existe" + pathTableDb.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void DataPatternDb(File readDb, File writeDb) {
        try (BufferedReader ler = new BufferedReader(new FileReader(readDb));
             BufferedWriter escrever = new BufferedWriter(new FileWriter(writeDb));
        ){
            String line;
            while ((line = ler.readLine()) != null) {
                escrever.write(line);
                escrever.newLine();
            }
            System.out.println("Dados padrão do banco de dados copiado");
        } catch (IOException e) {
            System.out.println("Deu ruim");
            throw new RuntimeException(e);
        }
    }
}
