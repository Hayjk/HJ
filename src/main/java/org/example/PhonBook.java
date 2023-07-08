package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhonBook {
    Map<String, String> phonBook = new HashMap<>();

    void addBook(String uid, String nameAndNumber){
        phonBook.put(uid, nameAndNumber);
    }

    String printPhonBook(String uidInput){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: phonBook.entrySet()){
            String uid = entry.getKey();
            String name = entry.getValue();
            if (uid.equals(uidInput)){
                stringBuilder.append(uid);
                stringBuilder.append(" | ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
