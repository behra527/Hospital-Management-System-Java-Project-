public class Hotal_Management {
    public String HotalName;
    public Room[] room;
    public Hotal_Management() {
        this.HotalName = "TT";
        this.room=room;
    }

    public Hotal_Management(String HotalName,Room[] room) {
        this.HotalName = HotalName;
        this.room=room;
    }
    public void setHotalName(String HotalName) {
        this.HotalName = HotalName;
    }
    public String getHotalName() {
        return HotalName;
    }
    public void display(){
        System.out.println("Hotel Name: "+getHotalName());
        for (int i=0;i<room.length;i++) {
            System.out.println("*******************");
            room[i].display();
            System.out.println("*******************");
        }
    }
}