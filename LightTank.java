import java.util.Random;

public class LightTank extends Tank {
    private int viewRange;
    private String classTank = "Лёгкий танк";
    private int numberDetectedEnemies=0;

    public LightTank (String name, int HP, int viewRange){
        super(name, HP);
        this.viewRange=viewRange;
    }

    public int getViewRange(){
        return this.viewRange;
    }

    public void useAbility(){
        Random random = new Random();
        int distanceToTank = random.nextInt((viewRange+viewRange) + 1 - (viewRange-(viewRange/4))) + (viewRange-(viewRange/4));
        if (viewRange>=distanceToTank) {
            System.out.println(this.getName() + " обнаружил врага на расстоянии: " + distanceToTank );
            numberDetectedEnemies+=1;
        }
        else System.out.println(this.getName() + " никого не обнаружил");
    }

    public String toString(){
        String descriptionTank = ("Класс танка: " + classTank + ", название танка: " + this.getName() + ", кол-во очков прочности: " + this.getHPTank() +
                ", дальность обзора: " + this.getViewRange() + " кол-во обнаруженных противников: " + numberDetectedEnemies);
        return descriptionTank;
    }
}
