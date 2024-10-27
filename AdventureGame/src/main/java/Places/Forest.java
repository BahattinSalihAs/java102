package Places;

import Characters.Charact;
import Monsters.Vampire;
import java.util.Arrays;
public class Forest extends Places{
    private int RANDOM = (int)(Math.random()*4);
    private Vampire[] vampires;
    public Forest() {
        super("Forest", "Firewood");
        while (this.RANDOM == 0){
            this.RANDOM = (int)(Math.random()*4);
        }
        this.vampires = new Vampire[RANDOM];
        for (int i=0; i< this.vampires.length; i++){
            this.vampires[i] = new Vampire();
        }
    }
    public void war(Charact charact) throws InterruptedException {
        System.out.println("Hey " + this.getVampires().length + " adet vampir geldi. Hazır ol!");
        int j = 1;
        for (int i=1; i<=this.getVampires().length; i++){
            System.out.println("Başlangıç sağlıkları => " + charact.getName() + ": " + charact.getHealth() + " Vampir: " + this.getVampires()[i-1].getHealth() );
            while (this.getVampires()[i-1].getHealth() > 0 && charact.getHealth() > 0){
                Thread.sleep(1000);
                if (charact.getHealth() > 0){
                    System.out.println("ROUND " + j);
                    System.out.println(charact.getName() + " vampire vurdu.");
                    this.getVampires()[i-1].setHealth(this.getVampires()[i-1].getHealth() - charact.getDamage());
                    if (this.getVampires()[i-1].getHealth() <= 0){
                        this.getVampires()[i-1].setHealth(0);
                    }
                    System.out.println(charact.getName() + " sağlığı: " + charact.getHealth() + "\n"
                            + i + ". Vampir'in sağlığı: " + this.getVampires()[i-1].getHealth());
                    j++;
                }
                Thread.sleep(1000);
                if (this.getVampires()[i-1].getHealth() > 0){
                    System.out.println("ROUND " + j);
                    System.out.println(i + ". Vampir " + charact.getName() + "'e vurdu.");
                    charact.setHealth(charact.getHealth() - this.getVampires()[i-1].getDamage());
                    if (charact.getHealth() <= 0){
                        charact.setHealth(0);
                    }
                    System.out.println(charact.getName() + " sağlığı: " + charact.getHealth() + "\n"
                            + i + ". vampir'in sağlığı: " + this.getVampires()[i-1].getHealth());
                    j++;
                }
            }
            if (this.getVampires()[i-1].getHealth() <= 0){
                Thread.sleep(1000);
                System.out.println(i + ". vampir öldü...");
                if (i == this.getVampires().length){
                    System.out.println(charact.getName() + " bravo. Oyunu kazandın!");
                    charact.setCash(charact.getCash() + (this.getVampires().length * 7));
                }
            }else if (charact.getHealth() <= 0){
                System.out.println("Oyunu kaybettin " + charact.getName() + " ...");
                break;
            }
        }
    }
    public Vampire[] getVampires() {
        return vampires;
    }
    @Override
    public String toString() {
        return "Forest{" +
                "name='" + this.getName() + '\'' +
                ", furniture='" + this.getFurniture() + '\'' +
                ", monster='" + Arrays.toString(this.getVampires()) + '\'' +
                '}';
    }
}
