package com.Mirea4;

public enum EuroSize {
    XXS(32),XS(34),S(36),M(38),L(40);
    private int euroSize;
    EuroSize(int euroSize){
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(){
        if(this == EuroSize.XXS)
            return "Child size";
        else
            return "Adult size";
    }

    @Override
    public String toString() {
        return "EuroSize{" +
                "euroSize=" + euroSize +
                ", " + this.getDescription()+
                '}';
    }
}
