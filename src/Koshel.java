class Koshel {
    private String material;
    private String color;
    private int otsekov;
    private int money;
    String currency;

    public static void main(String[] args) {
        Koshel q= new Koshel("кожа","синий", 3, 150);
        System.out.println(q);
           }

    @Override
    public String toString() {
        return "Кошелёк " +
                "материал" + material +
                ", цвет " + color  +
                ", кармашки " + otsekov +
                ", деньги " + money +
                ".";
    }

    public Koshel(String material, String color, int otsekov, int money) {
        this.material = material;
        this.color = color;
        this.otsekov = otsekov;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
        if (money<0)
            this.money=0;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getOtsekov() {
        return otsekov;
    }
}