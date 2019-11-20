import java.util.Scanner;

public class AngkakeKalimatLong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arraySatuan = { "Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan",
                "Sepuluh", "Sebelas", "Dua belas", "Tiga belas", "Empat belas", "Lima belas", "Enam belas",
                "Tujuh belas", "Delapan belas", "Sembilan belas" };
        String[] arrayPuluhan = { "Nol", "Se", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan" };
        long milyar, ratusjuta, puluhjuta, juta, ratusribu, puluhribu, ribu, ratus, puluh, satu;
        long bilangan = input.nextLong();
        while (bilangan > 0) {
            if (bilangan >= 20000000000L) {
                if (bilangan % 1E10 == 0) {
                    milyar = bilangan / 10000000000L;
                    System.out.print(arrayPuluhan[(int) milyar] + " puluh milyar ");
                    bilangan %= milyar * 10000000000L;
                } else {
                    milyar = bilangan / 10000000000L;
                    System.out.print(arrayPuluhan[(int) milyar] + " puluh ");
                    bilangan %= milyar * 10000000000L;
                }
            } else if (bilangan >= 1000000000) {
                milyar = bilangan / 1000000000;
                System.out.print(arraySatuan[(int) milyar] + " milyar ");
                bilangan %= milyar * 1000000000;
            } else if (bilangan >= 100000000) {
                if (bilangan == 100000000) {
                    ratusjuta = bilangan / 100000000;
                    System.out.print(arrayPuluhan[(int) ratusjuta] + " ratus juta");
                    bilangan %= ratusjuta * 100000000;
                } else {
                    ratusjuta = bilangan / 100000000;
                    System.out.print(arrayPuluhan[(int) ratusjuta] + " ratus ");
                    bilangan %= ratusjuta * 100000000;
                }
            } else if (bilangan >= 20000000) {
                puluhjuta = bilangan / 10000000;
                System.out.print(arrayPuluhan[(int) puluhjuta] + " puluh ");
                bilangan %= puluhjuta * 10000000;
            } else if (bilangan >= 10000000) {
                puluhjuta = bilangan / 1000000;
                System.out.print(arraySatuan[(int) puluhjuta] + " juta ");
                bilangan %= puluhjuta * 1000000;
            } else if (bilangan >= 1000000) {
                juta = bilangan / 1000000;
                System.out.print(arraySatuan[(int) juta] + " juta ");
                bilangan %= juta * 1000000;
            } else if (bilangan >= 100000) {
                if (bilangan == 100000) {
                    ratusribu = bilangan / 100000;
                    System.out.print(arrayPuluhan[(int) ratusribu] + " ratus ribu ");
                    bilangan %= ratusribu * 100000;
                } else {
                    ratusribu = bilangan / 100000;
                    System.out.print(arrayPuluhan[(int) ratusribu] + " ratus ");
                    bilangan %= ratusribu * 100000;
                }
            } else if (bilangan >= 20000) {
                puluhribu = bilangan / 10000;
                System.out.print(arrayPuluhan[(int) puluhribu] + " puluh ");
                bilangan %= puluhribu * 10000;
            } else if (bilangan >= 10000) {
                puluhribu = bilangan / 1000;
                System.out.print(arraySatuan[(int) puluhribu] + " ribu ");
                bilangan %= puluhribu * 1000;
            } else if (bilangan >= 2000) {
                ribu = bilangan / 1000;
                System.out.print(arrayPuluhan[(int) ribu] + " ribu ");
                bilangan %= ribu * 1000;
            } else if (bilangan >= 1000) {
                ribu = bilangan / 1000;
                System.out.print(arrayPuluhan[(int) ribu] + " ribu ");
                bilangan %= ribu * 1000;
            } else if (bilangan >= 100) {
                ratus = bilangan / 100;
                System.out.print(arrayPuluhan[(int) ratus] + " ratus ");
                bilangan %= ratus * 100;
            } else if (bilangan >= 20) {
                puluh = bilangan / 10;
                System.out.print(arrayPuluhan[(int) puluh] + " puluh ");
                bilangan %= puluh * 10;
            } else if (bilangan >= 10) {
                puluh = bilangan / 1;
                System.out.print(arraySatuan[(int) puluh]);
                bilangan %= puluh * 1;
            } else if (bilangan >= 1) {
                satu = bilangan / 1;
                System.out.print(arraySatuan[(int) satu]);
                bilangan %= satu * 1;
            }
        }
    }
}