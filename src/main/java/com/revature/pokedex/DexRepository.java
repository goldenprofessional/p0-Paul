package com.revature.pokedex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static sun.nio.ch.IOUtil.load;

public class DexRepository {
    private List<String> pocketMonsters;
    private File file;

    public DexRepository(String filename){
        this.pocketMonsters = new ArrayList<>();
        this.file = new File(filename);
        load();
    }

    private void load(){
        try {
            Scanner scanner = new Scanner(this.file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                this.pocketMonsters.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<String> getPocketMonsters() {
        return pocketMonsters;
    }
}
