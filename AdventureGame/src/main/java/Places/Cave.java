package Places;

import Characters.Charact;
import Monsters.Zombie;
import java.util.Arrays;
public class Cave extends Places{
    private int RANDOM = (int)(Math.random()*4);
    private Zombie[] zombies;
    public Cave() {
        super("Cave", "Food");
        while (this.RANDOM == 0){
            this.RANDOM = (int)(Math.random()*4);
        }
        this.zombies = new Zombie[RANDOM];
        for (int i=0; i<this.zombies.length; i++){
            this.zombies[i]= new Zombie();
        }
    }
    public void war(Charact charact) throws InterruptedException {
        System.out.println("Hey " + this.getZombies().length + " adet zombi geldi. Hazır ol!");
        int j = 1;
        for (int i=1; i<=this.getZombies().length; i++){
            System.out.println("Başlangıç sağlıkları => " + charact.getName() + ": " + charact.getHealth() + " Zombi: " + this.getZombies()[i-1].getHealth() );
            while (this.getZombies()[i-1].getHealth() > 0){
                Thread.sleep(1000);
                System.out.println("ROUND " + j);
                System.out.println(charact.getName() + " zombiye vurdu.");
                this.getZombies()[i-1].setHealth(this.getZombies()[i-1].getHealth() - charact.getDamage());
                if (this.getZombies()[i-1].getHealth() <= 0){
                    this.getZombies()[i-1].setHealth(0);
                }
                System.out.println(charact.getName() + " sağlığı: " + charact.getHealth() + "\n"
                        + i + ". Zombi'nin sağlığı: " + this.getZombies()[i-1].getHealth());
                j++;
                Thread.sleep(1000);
                if (this.getZombies()[i-1].getHealth() > 0){
                    System.out.println("ROUND " + j);
                    System.out.println(i + ". Zombi " + charact.getName() + "'e vurdu.");
                    charact.setHealth(charact.getHealth() - this.getZombies()[i-1].getDamage());
                    System.out.println(charact.getName() + " sağlığı: " + charact.getHealth() + "\n"
                            + i + ". Zombi'nin sağlığı: " + this.getZombies()[i-1].getHealth());
                    j++;
                }
            }
            if (this.getZombies()[i-1].getHealth() <= 0){
                Thread.sleep(1000);
                System.out.println(i + ". zombi öldü...");
                if (i == this.getZombies().length){
                    System.out.println(charact.getName() + " bravo. Oyunu kazandın!");
                    charact.setCash(charact.getCash() + (this.getZombies().length * 4));
                }
            }else if (charact.getHealth() <= 0){
                System.out.println("Oyunu kaybettin " + charact.getName() + " ...");
                break;
            }
        }

    }
    public Zombie[] getZombies() {
        return zombies;
    }
    @Override
    public String toString() {
        return "Cave{" +
                "name='" + this.getName() + '\'' +
                ", furniture='" + this.getFurniture() + '\'' +
                ", monster='" + Arrays.toString(this.zombies) + '\'' +
                '}';
    }
}
