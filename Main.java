public class Main {
    public static void main(String[] args) {
        int[] list = {2, 8, 22, 16, 6, 13, 11, 5, 4, 32, 3, 7};
        System.out.println(linearSearch(list, 5));
    }

    private static boolean linearSearch(int[] list, int target) {
        for (int x: list) {
            if(x == target){
                return true;
            }
        }
        return false;
    }

}