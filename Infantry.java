public class Infantry implements Sword,Human{

    private int memberCount;
    private String name = "Infantry";

    public Infantry(int count){
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
        System.out.println("We men of Gondor");
    }

    public void useSword(Human h){
        System.out.println("Your " + this.getMemberCount() + " " + this.getName() + " used swords against 10 " + h.getName());
    }

}