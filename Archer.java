public class Archer implements Bow,Human{

    private int memberCount;
    private String name = "Archer";

    public Archer(int count){
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
        System.out.println("To save Lorien");
    }

    public void useBow(Human h){
        System.out.println("Your " + this.getMemberCount() + " " + this.getName() + " used bows against 10 " + h.getName());
    }
}