public class apple {
    public static void main (String args[]){
        orange orobj = new orange();
        System.out.println(orobj.standTime());
        orobj.setTime(14,25,8); 
        System.out.println(orobj.standTime());
        System.out.println("Regular Time according to user input");
        System.out.println(orobj.RegularTime()); 
    }
}
