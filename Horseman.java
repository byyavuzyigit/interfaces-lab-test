public class Horseman implements Horse,Sword,Human{

    private int memberCount;
    private String name = "Horseman";

    public Horseman(int count){
        memberCount = count;
    }
    public String getName(){
        return name;
    }

    public void setName(String s){
        name = s;
    }

    public int getMemberCount(){
        return memberCount;
    }
    public void setMemberCount(int num){
        memberCount = num;
    }
    public void speak(){
        System.out.println("Riders of Theoden!");
    }

    public void useHorse(){
        System.out.println("Horses were used by " + this.getName());
    }

    public void useSword(Human h){
        System.out.println("Your " + this.getMemberCount() + " " + this.getName() + " used swords against 10 " + h.getName());
    }
}