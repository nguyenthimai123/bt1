public class bt1 {

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) { // rẽ nhánh
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) { // vòng lặp
            if (n % i == 0) { // rẽ nhánh
                return false;
            }
        }
        return true;
    }

    // Hàm main để chạy thử
    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 4, 5, 10};

        for (int num : testNumbers) {
            System.out.println(num + " is prime? " + isPrime(num));
        }
    }
}
// update statement coverage