package game.system;

import game.item.Bow;
import game.item.Staff;
import game.item.Sword;
import game.item.Weapon;

public class Inventory {
    Weapon[] weaponsSlot;

    public void addWeapon(Weapon weapon) {
        boolean isFull = true;
        for (int i=0 ; i<weaponsSlot.length; i++) {
            if (weaponsSlot[i] == null) {
                weaponsSlot[i] = weapon;
                isFull = false;
                break;
            }
        }
        if (isFull) {
            System.out.println("인벤토리가 가득 찼습니다.");
        }
    }

    public void attackAll() {
        for (Weapon w :  weaponsSlot) {
            w.attack();
        }
    }

    public void useSpecialAbilities() {
        for (Weapon w  :  weaponsSlot) {
            if (w instanceof Sword) {
                Sword s = (Sword) w;
                s.parry();
            } else if (w instanceof Bow) {
                Bow b =  (Bow) w;
                b.snipe();
            } else if (w instanceof Staff) {
                Staff t = (Staff) w;
                t.castSpell();
            }
        }
    }
}
