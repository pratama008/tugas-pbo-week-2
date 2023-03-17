public class Sepeda {
    // ATRIBUT
    int gear = 5;

    // KONSTRUKTOR
    Sepeda(int jumlahRoda, String jenis, String  merk){
        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }

    // METHOD
    void ngerem(){
        System.out.println("Sepeda direm");
    }
}

