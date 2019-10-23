package com.ucx.training.sessions.app1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsAndLists {
    public void testMapsAndLists(){
        List<String> names = new ArrayList<>();
        names.add("Lorik");
        names.add("Vjollca");
        names.add("Tina");

        for (String name : names){
            System.out.println(name);
        }
        System.out.println(names.size());
        List<String> names1 = List.of("Nita", "Flaka", "Kushtrim");

        for (String name : names1){
            System.out.println(name);
        }
        System.out.println(names1.get(0));
        System.out.println(names1);

        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Lorik");
        namesMap.put(2, "Tina");
        namesMap.put(3, "Vjollca");

        System.out.println(namesMap);

        Map<Integer, String> namesMap1 = Map.of(1, "Nita", 2, "Flaka", 3, "Kushtrim");

        System.out.println(namesMap1);
        System.out.println(namesMap1.get(3));
        namesMap.put(1,"Fita");
        System.out.println(namesMap);
    }
}
