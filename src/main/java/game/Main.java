package game;

import game.item.*;
import game.system.*;

public class Main {
    public static void main(String[] args) {
        Inventory inven = new Inventory();

        try{
            inven.addWeapon(new Sword());
            inven.addWeapon(new Bow());
            inven.addWeapon(new Staff());
        }catch(Exception e){
            System.out.println("Error");
        }

        try {
            inven.attackAll();
            inven.useSpecialAbilities();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
