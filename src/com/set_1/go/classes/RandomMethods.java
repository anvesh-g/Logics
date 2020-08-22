package com.set_1.go.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class RandomMethods {
    public static void main(String[] args) {
//        treeSet();
        Map<String,Set<String>> tables=getTables("C:\\Users\\Anvesh\\Desktop\\Notes\\Tables.txt");
        System.out.println(tables);
    }

    public static void treeSet() {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("aa");
        tree.add("bb");
        tree.add("cc");
        tree.add("ee");
        System.out.println(tree.ceiling("aa"));
        System.out.println(tree.floor("bb"));
//        System.out.println(tree.);

    }

    public static Map<String, Set<String>> getTables(String filePath) {
        Map<String,Set<String>> tables=new HashMap();
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            Set<String> columns=new HashSet<>();
            String tableName="";
            while ((st = br.readLine()) != null){
                if(st.contains("(") && !st.contains(")")){
                    tableName=st;
                    continue;
                }

                if(st.contains(")") && !st.contains("(")){
                    tables.put(tableName,columns);
                    tableName="";
                    columns=new HashSet<>();
                    continue;
                }
                if(!"".equalsIgnoreCase(tableName)){
                    columns.add(st);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tables;
    }

}
