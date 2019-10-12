package trieunt.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soCanDoc;
        int soChuSo;
        int hangTram, hangChuc, hangDonVi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        soCanDoc = scan.nextInt();
        soChuSo = (int)Math.log10(soCanDoc) + 1;



        if (!(soChuSo < 0 && soChuSo > 3)) {
            hangTram = soCanDoc / 100;
            hangChuc = soCanDoc / 10;
            hangChuc %= 10;
            hangDonVi = soCanDoc % 10;

            if (hangTram == 1) {
                System.out.print("Một trăm ");
            } else if (hangTram == 2) {
                System.out.print("Hai trăm ");
            } else if (hangTram == 3) {
                System.out.print("Ba trăm ");
            } else if (hangTram == 4) {
                System.out.print("Bốn trăm ");
            } else if (hangTram == 5) {
                System.out.print("Năm trăm ");
            } else if (hangTram == 6) {
                System.out.print("Sáu trăm ");
            } else if (hangTram == 7) {
                System.out.print("Bảy trăm ");
            } else if (hangTram == 8) {
                System.out.print("Tám trăm ");
            } else if (hangTram == 9) {
                System.out.print("Chín trăm ");
            }

            if (hangChuc == 0) {
                if (hangTram > 0) {
                    System.out.print("linh ");
                }
            } else if (hangChuc == 1) {
                System.out.print("mười ");
            } else if (hangChuc == 2) {
                System.out.print("hai mươi ");
            } else if (hangChuc == 3) {
                System.out.print("ba mươi ");
            } else if (hangChuc == 4) {
                System.out.print("bốn mươi ");
            } else if (hangChuc == 5) {
                System.out.print("năm mươi ");
            } else if (hangChuc == 6) {
                System.out.print("sáu mươi ");
            } else if (hangChuc == 7) {
                System.out.print("bảy mươi ");
            } else if (hangChuc == 8) {
                System.out.print("tám mươi ");
            } else if (hangChuc == 9) {
                System.out.print("chín mươi ");
            }

            if (hangDonVi == 0) {
                if (hangChuc < 1) {
                    System.out.print("Không ");
                }
            } else if (hangDonVi == 1) {
                System.out.print("một ");
            } else if (hangDonVi == 2) {
                System.out.print("hai ");
            } else if (hangDonVi == 3) {
                System.out.print("ba");
            } else if (hangDonVi == 4) {
                System.out.print("bốn");
            } else if (hangDonVi == 5) {
                if (hangDonVi <= 1 || hangChuc == 0) {
                    System.out.print("năm");
                } else {
                    System.out.print("lăm");
                }
            } else if (hangDonVi == 6) {
                System.out.print("sáu");
            } else if (hangDonVi == 7) {
                System.out.print("bảy");
            } else if (hangDonVi == 8) {
                System.out.print("tám");
            } else if (hangDonVi == 9) {
                System.out.print("chín");
            }


        } else {
            System.out.println("Số cần đọc tối đa 3 chữ số");
        }
    }
}
