public class apple {
    public static void main (String args[]){
        orange orobj = new orange();
        System.out.println(orobj.standTime());
        orobj.setTime(14,25,8);
        System.out.println(orobj.standTime());
    }
}
