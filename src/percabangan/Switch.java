package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima Kasih Pak\"");
                System.out.println("Dosen : \"Selamat Ya!!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kd dapat A ,pak\"");
                System.out.println("Dosen : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul pak ay, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisalah menjawab ujian\"");
                System.out.println("Mhs   : \"Hihihihi..\"");
                break;
            case 'D':
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                break;
        }
    }

}
