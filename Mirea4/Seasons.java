package com.Mirea4;

public class Seasons {
    enum ESeasons{
        SUMMER(23),
        AUTUMN(5),
        WINTER(-15),
        SPRING(9);
        private int temperature;

        ESeasons(int temperature){
            this.temperature = temperature;
        }

        public int getTemperature() {
            return temperature;
        }
    }

    public static void main(String[] args) {
        ESeasons favorSeason = ESeasons.valueOf("AUTUMN");
        System.out.print(favorSeason + " "+ favorSeason.getTemperature() + " ");
        getDescription(favorSeason);
        System.out.println();
        for (ESeasons seas: ESeasons.values()) {
            System.out.print(seas + " "+ seas.getTemperature() + " ");
            getDescription(seas);
        }
    }
    public static void getDescription(ESeasons seas){
        switch (seas){
            case SUMMER -> System.out.println("Warm season");
            default -> System.out.println("Cold season");
        }
    }
}
