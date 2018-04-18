package com.example.avdey.italianrestaraun;

public class Pasta {
    private String name;
    private String description;
    private int id;


    public static Pasta[] pastaList = {
            new Pasta("Balaniese", "Паста алла карбонара — спагетти с мелкими кусочками гуанчале, смешанные с соусом из яиц, сыра пармезан и пекорино романо, соли и свежемолотого чёрного перца. Этот соус доходит до полной готовности от тепла только что сваренной пасты", R.drawable.balaniese),
            new Pasta("Carbanara", "Рагу Болонье́зе — мясной соус для итальянской пасты родом из Болоньи. Традиционно готовится жителями Болоньи со свежими тальятелле и зелёной лазаньей. Менее традиционно рагу сервируется с макаронами или другими типами пасты", R.drawable.carbanara),
            new Pasta("Four Cheese", "250гр пасты \n" +
                    "50гр творожного сыра «Рикотта» («Альметте») \n" +
                    "50гр сыра с плесенью «Горгонзолла» («Дор Блю», «Рокфор») \n" +
                    "25гр твердого сыра «Пекорино» («Грюер», «Пармезан») \n" +
                    "50гр мягкого сыра «Моцарелла» \n" +
                    "соль \n" +
                    "горсть грецкого ореха, измельчить в ступке, оставив крупные куски \n" +
                    "свежий тимьян \n" +
                    "2ст.л. нарезанного зеленого лука",R.drawable.fourcheese)
    };

    public Pasta(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
