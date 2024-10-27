package Places;

import Characters.Charact;
import Monsters.Bear;
import java.util.Arrays;
public class River extends Places{
    private int RANDOM = (int)(Math.random()*4);
    private Bear[] bears;
    public River() {
        super("River", "Water");
        while (this.RANDOM == 0){
            this.RANDOM = (int)(Math.random()*4);
        }
        this.bears = new Bear[RANDOM];
        for (int i=0; i<this.bears.length; i++){
            this.bears[i] = new Bear();
        }
    }
    public void war(Charact charact) throws InterruptedException {
        System.out.println("Hey " + this.getBears().length + " adet ayı geldi. Hazır ol!");
        int j = 1;
        for (int i=1; i<=this.getBears().length; i++){
            System.out.println("Başlangıç sağlıkları => " + charact.getName() + ": " + charact.getHealth() + " Ayı: " + this.getBears()[i-1].getHealth() );
            while (this.getBears()[i-1].getHealth() > 0 && charact.getHealth() > 0){
                Thread.sleep(1000);
                if (charact.getHealth() > 0){
                    System.out.println("ROUND " + j);
                    System.out.println(charact.getName() + " ayıya vurdu.");
                    this.getBears()[i-1].setHealth(this.getBears()[i-1].getHealth() - charact.getDamage());
                    if (this.getBears()[i-1].getHealth() <= 0){
                        this.getBears()[i-1].setHealth(0);
                    }
                    System.out.println(charact.getName() + " sağlığı: " + charact.getHealth() + "\n"
                            + i + ". Ayı'nın sağlığı: " + this.getBears()[i-1].getHealth());
                    j++;
                }
                Thread.sleep(1000);
                if (this.getBears()[i-1].getHealth() > 0){
                    System.out.println("ROUND " + j);
                    System.out.println(i + ". Ayı " + charact.getName() + "'e vurdu.");
                    charact.setHealth(charact.getHealth() - this.getBears()[i-1].getDamage());
                    if (charact.getHealth() <= 0){
                        charact.setHealth(0);
                    }
                    System.out.println(charact.getName() + " sağlığı: " + charact.getHealth() + "\n"
                            + i + ". Ayı'nın sağlığı: " + this.getBears()[i-1].getHealth());
                    j++;
                }
            }
            if (this.getBears()[i-1].getHealth() <= 0){
                Thread.sleep(1000);
                System.out.println(i + ". ayı öldü...");
                if (i == this.getBears().length){
                    System.out.println(charact.getName() + " bravo. Oyunu kazandın!");
                    charact.setCash(charact.getCash() + (this.getBears().length * 12));
                }
            }else if (charact.getHealth() <= 0){
                System.out.println("Oyunu kaybettin " + charact.getName() + " ...");
                break;
            }
        }
    }
    public Bear[] getBears() {
        return bears;
    }
    @Override
    public String toString() {
        return "River{" +
                "name='" + this.getName() + '\'' +
                ", furniture='" + this.getFurniture() + '\'' +
                ", monster='" + Arrays.toString(this.bears) + '\'' +
                '}';
    }
}
