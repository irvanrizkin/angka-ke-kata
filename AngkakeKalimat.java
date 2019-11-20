import java.util.Scanner;

public class AngkakeKalimat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arraySatuan = { "Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan",
                "Sepuluh", "Sebelas", "Dua belas", "Tiga belas", "Empat belas", "Lima belas", "Enam belas",
                "Tujuh belas", "Delapan belas", "Sembilan belas" };
        String[] arrayPuluhan = { "Nol", "Se", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan" };
        int bilangan = 0, milyar, ratusjuta, puluhjuta, juta, ratusribu, puluhribu, ribu, ratus, puluh, satu;
        try {
            bilangan = input.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        while (bilangan > 0) {
            if (bilangan >= 1000000000) {
                milyar = bilangan / 1000000000;
                System.out.print(arraySatuan[milyar] + " milyar ");
                bilangan %= milyar * 1000000000;
            } else if (bilangan >= 100000000) {
                if (bilangan == 100000000) {
                    ratusjuta = bilangan / 100000000;
                    System.out.print(arrayPuluhan[ratusjuta] + " ratus juta");
                    bilangan %= ratusjuta * 100000000;
                } else {
                    ratusjuta = bilangan / 100000000;
                    System.out.print(arrayPuluhan[ratusjuta] + " ratus ");
                    bilangan %= ratusjuta * 100000000;
                }
            } else if (bilangan >= 20000000) {
                puluhjuta = bilangan / 10000000;
                System.out.print(arrayPuluhan[puluhjuta] + " puluh ");
                bilangan %= puluhjuta * 10000000;
            } else if (bilangan >= 10000000) {
                puluhjuta = bilangan / 1000000;
                System.out.print(arraySatuan[puluhjuta] + " juta ");
                bilangan %= puluhjuta * 1000000;
            } else if (bilangan >= 1000000) {
                juta = bilangan / 1000000;
                System.out.print(arraySatuan[juta] + " juta ");
                bilangan %= juta * 1000000;
            } else if (bilangan >= 100000) {
                if (bilangan == 100000) {
                    ratusribu = bilangan / 100000;
                    System.out.print(arrayPuluhan[ratusribu] + " ratus ribu ");
                    bilangan %= ratusribu * 100000;
                } else {
                    ratusribu = bilangan / 100000;
                    System.out.print(arrayPuluhan[ratusribu] + " ratus ");
                    bilangan %= ratusribu * 100000;
                }
            } else if (bilangan >= 20000) {
                puluhribu = bilangan / 10000;
                System.out.print(arrayPuluhan[puluhribu] + " puluh ");
                bilangan %= puluhribu * 10000;
            } else if (bilangan >= 10000) {
                puluhribu = bilangan / 1000;
                System.out.print(arraySatuan[puluhribu] + " ribu ");
                bilangan %= puluhribu * 1000;
            } else if (bilangan >= 2000) {
                ribu = bilangan / 1000;
                System.out.print(arrayPuluhan[ribu] + " ribu ");
                bilangan %= ribu * 1000;
            } else if (bilangan >= 1000) {
                ribu = bilangan / 1000;
                System.out.print(arrayPuluhan[ribu] + " ribu ");
                bilangan %= ribu * 1000;
            } else if (bilangan >= 100) {
                ratus = bilangan / 100;
                System.out.print(arrayPuluhan[ratus] + " ratus ");
                bilangan %= ratus * 100;
            } else if (bilangan >= 20) {
                puluh = bilangan / 10;
                System.out.print(arrayPuluhan[puluh] + " puluh ");
                bilangan %= puluh * 10;
            } else if (bilangan >= 10) {
                puluh = bilangan / 1;
                System.out.print(arraySatuan[puluh]);
                bilangan %= puluh * 1;
            } else if (bilangan >= 1) {
                satu = bilangan / 1;
                System.out.print(arraySatuan[satu]);
                bilangan %= satu * 1;
            }
        }
    }
}