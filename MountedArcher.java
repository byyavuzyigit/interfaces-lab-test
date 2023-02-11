public class MountedArcher implements Horse,Bow,Human{

    private int memberCount;
    private String name = "MountedArcher";

    public MountedArcher(int count){
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
        System.out.println("We must defend Rivendell");
    }

    public void useBow(Human h){
        System.out.println("Your " + this.getMemberCount() + " " + this.getName() + " used bows against 10 " + h.getName());
    }

    public void useHorse(){
        System.out.println("Horses were used by " + this.getName());
    }

}