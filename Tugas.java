class Tugas {
    public static void main(String[] args) {
        System.out.println("run something here...");
    }

    static void getFirstChar() {
        try {
            System.out.print("Input huruf:");
            char n = (char) System.in.read();
            System.out.println("Hasil : " + n);
        } catch (Exception e) {
            printError(e);
        }
    }

    static void getFirst5Char() {
        byte[] b = new byte[5];
        try {
            System.out.print("Input 5 huruf:");
            System.in.read(b);
            System.out.print("Hasil :");
            for (byte c : b) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            printError(e);
        }
    }

    static void tambahDua() {
        byte[] b = new byte[5];
        char[] c = new char[5];
        System.out.print("Input bilangan bulat (Nanti +2):");

        try {
            System.in.read(b);
            for (int i = 0; i < b.length; i++) {
                if (Integer.valueOf(b[i]) >= 48 && Integer.valueOf(b[i]) <= 57) {
                    c[i] = (char) b[i];
                }
            }
            String cString = new String(c).trim();
            System.out.println("Hasil: " + (Integer.valueOf(cString) + 2));
        } catch (NumberFormatException e) {
            System.out.println("Masukin angka yang bener coba!");
        } catch (Exception e) {
            printError(e);
        }
    }

    static void printError(Exception e) {
        System.out.println(e);
        System.out.println("Nih error: " + e.getMessage());
        System.out.println("Stack trace-nya juga: " + e.getStackTrace());
    }

    static void getFirstChar_ori() {
        int n = 0;
        n = System.in.read();
        System.out.println("Hasil: " + (char) n);
    }

    static void getFirst3Char_ori() {
        byte[] b = new byte[5];
        try { System.in.read(); 
        } catch (java.io.Exception e);
        System.out.println("Hasil: " + (char) b[0] + (char) b[1] + (char) b[2]);
    }

    static void tambahDua_ori() {
        byte[] b = new byte[5];
        System.out.println("Input bilangan bulat:");
        try { System.in.read(b);
        } catch (java.io.Exception e);
        int N = Integer.valueOf(b).intValue();
        System.out.println("Hasil: "+(N+2));
    }
}