class Fighter {
    boolean isVulnerable() {
        return true;
    }
    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    boolean isVulnerable(){
        return false;
    }
    @Override
    int getDamagePoints(Fighter wizard){
        if(wizard.isVulnerable()) return 10;
        else return 6;
    }
}
class Wizard extends Fighter{
    boolean vulnerability=true;
    boolean poweredUp=false;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    @Override
    boolean isVulnerable(){
        return this.vulnerability;
    }
    void prepareSpell(){
        this.vulnerability=false;
        this.poweredUp=true;
    }
    @Override
    int getDamagePoints(Fighter warrior){
        if(poweredUp) return 12;
        else return 3;
    }
}
