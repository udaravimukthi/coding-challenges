public class Abstraction1 {

}

interface Blutooth {
    void pair(); // if samsung company need to change the way of pair

    void share();

    void close();
}

abstract class SamsungBlutooth implements Blutooth {
    public void pair() {
        System.out.println("pair using abc algorithm");
    }
}

class SamsungGalaxyBlutooth extends SamsungBlutooth {
    public void share() {
        System.out.println("share using abcd algo");
    }

    public void close() {
        System.out.println("close using ad algo");
    }
}