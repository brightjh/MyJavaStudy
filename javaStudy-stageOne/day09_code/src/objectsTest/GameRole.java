package objectsTest;

import java.util.Random;

public class GameRole {
    private String name;
    private int bloodBar;


    public GameRole() {
        this.name = null;
        this.bloodBar = 0;
    }

    public GameRole(String name, int bloodBar) {
        this.name = name;
        this.bloodBar = bloodBar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBloodBar(int bloodBar) {
        this.bloodBar = bloodBar;
    }

    public int getBloodBar() {
        return this.bloodBar;
    }


    public void attack(GameRole role) {
        Random r = new Random();
        int harm = r.nextInt(25) + 5;
        bloodBar = role.getBloodBar() - harm;
        if (bloodBar < 0) {
            bloodBar = 0;
        }
        role.setBloodBar(bloodBar);
        System.out.println(getName() + "举起拳头打了" + role.getName() + "一下,造成了" +
                    harm + "点伤害," + role.getName() + "还剩下" + bloodBar + "点血");



    }


}
