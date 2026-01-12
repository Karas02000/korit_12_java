package game.system;

import game.item.*;

public class Inventory {
    Weapon[] weaponsSlot = new Weapon[10];

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
            if (w == null) break;
            w.attack();
        }
    }

    public void useSpecialAbilities() {
        for (Weapon w : weaponsSlot) {
            if (w == null) {
                break;
            } else if (w instanceof Sword sword) {
                sword.parry();
            } else if (w instanceof Bow bow) {
                bow.snipe();
            } else if (w instanceof Staff staff) {
                staff.castSpell();
            }
        }
    }
}
