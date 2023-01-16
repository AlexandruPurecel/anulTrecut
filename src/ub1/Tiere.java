package ub1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tiere {
    public static void main(String args[]){
        List<Tier> tierList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File("tiere.txt"));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split("#");
                Diat diat = Diat.valueOf(parts[2]);
                Standort standort = Standort.valueOf(parts[3]);
                Tier t = new Tier(parts[0],parts[1],diat,standort);
                tierList.add(t);

            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        List<Tier> sort = tierList.stream().sorted(Comparator.comparing(Tier::getName)).collect(Collectors.toList());
        try(PrintWriter printWriter = new PrintWriter(new File("filtered.txt"))){
            for(Tier t : sort){
                String[] values = {t.getName(),t.getWname(), String.valueOf(t.getDiat()),String.valueOf(t.getStandort())};
                String line = String.join("%",values);
                System.out.println(line);
                printWriter.println(line);

            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        List<Tier> newList = new ArrayList<>();
        List<Tier> filter = tierList.stream().sorted(Comparator.comparing(Tier::getDiat)).collect(Collectors.toList());
        try(PrintWriter printWriter = new PrintWriter(new File("carnivor.txt"))){
            for(Tier t: filter ){
                if(t.getDiat() == Diat.carnivore){
                    newList.add(t);
                }
            }
            for(Tier t: newList){
                String[] values = {t.getName(),t.getWname(), String.valueOf(t.getDiat()),String.valueOf(t.getStandort())};
                String line = String.join("%",values);
                System.out.println(line);
                printWriter.println(line);

            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }


    }
}
