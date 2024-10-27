package Places;

import Characters.*;
public class SafetyHouse {
    public void safe(Charact c) throws InterruptedException {
        System.out.println("Can Yenileniyor...");
        Thread.sleep(2000);
        if (c.getId() == 1){
            c.setHealth(21);
        } else if (c.getId() == 2) {
            c.setHealth(18);
        } else if (c.getId() == 3) {
            c.setHealth(24);
        }
        System.out.println(c.getName() + "'in yeni sağlığı: " + c.getHealth());
    }
}
