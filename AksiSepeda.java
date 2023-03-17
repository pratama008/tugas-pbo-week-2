public class AksiSepeda {
    public static void main(String[] args) {
        // ====================================OBJEK PERTAMA
        // MEMBUAT OBJEK
        var sepedaBalap = new Sepeda(2, "Racing", "Polygon");

        // AKSES ATRIBUT DAN METHOD
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaBalap.ngerem();

        System.out.println(" ");
        //=====================================OBJEK KEDUA
        // MEMBUAT OBJEK
        var sepedaAnak = new Sepeda(4, "Pemula / Anak - anak", "Wimcycle");

        // AKSES ATRIBUT DAN METHOD
        int gearSepedaAnak = sepedaAnak.gear + 10;
        System.out.println("Jumlah gear "+gearSepedaAnak);
        sepedaAnak.ngerem();

        System.out.println(" ");
        //=====================================OBJEK KEDUA
        // MEMBUAT OBJEK
        var sepedaFreeStyle = new Sepeda(2, "Free Style", "BMX");

        // // AKSES ATRIBUT DAN METHOD
        int gearSepedaFreeStyle = 18;
        System.out.println("Jumlah gear "+gearSepedaFreeStyle);
        sepedaFreeStyle.ngerem();
    }
}
