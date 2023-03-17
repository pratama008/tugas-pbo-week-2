public class Lampu {
    // ATRIBUT
    boolean nyala = false;

    // METHOD
    void nyalakanLampu(){
        this.nyala = true;
        System.out.println(this.nyala);
    }
    void matikanLampu(){
        this.nyala = false;
        System.out.println(this.nyala);
    }

}
