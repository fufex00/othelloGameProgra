/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author Kobem
 */
public class Players {
    public ArrayList<Players> twoPlayers = new ArrayList<>();
    public ArrayList<Players> onePlayer = new ArrayList<>();
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
