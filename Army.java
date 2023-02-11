public class Army {

    int armyCount = 0;
    Human[] army = new Human[4];
    public void add(Human h){
        if(armyCount<army.length){
            army[armyCount] = h;
            armyCount++;
        }
    }
    public void print(){
        for(int i=0;i<army.length;i++){
            System.out.println(army[i].getMemberCount() + " number of " + army[i].getName() + " were added to your army.");
        }
    }

}