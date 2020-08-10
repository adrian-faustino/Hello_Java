// Tutorial reference https://youtu.be/70qy6_gw1Hc

package com.company;

import java.util.HashMap;

public class HashMapTutorial {

    HashMap<String, Integer> myHash = new HashMap();

    public void showHash() {

        myHash.put("a", 10);
        myHash.put("b", 3);

        System.out.println(myHash);
    }

    public HashMap getHash() {
        return myHash;
    }
}
