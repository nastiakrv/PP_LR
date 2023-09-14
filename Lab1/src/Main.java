import java.lang.reflect.Field;
import java.util.Scanner;

public class Main
{
    /**
     * Метод для виводу на екран результату пошуку чисел, що задовільняють умову
     * @param arr_cube передає масив кубів чисел
     * @param n визначає розмірність
     * @param arr передає масив чисел Фібоначчі
     */
    public static void Show_res (int[] arr_cube, int n, Fibonacci[] arr){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arr_cube[j]==arr[i].getValue()){
                    System.out.println("\nResult: ");
                    System.out.println(arr[i].getNumber()+"  "+arr[i].getValue());
                    break;
                }
            }
        }
    }
    /**
     * Метод для отримання кількості чисел Фібоначчі
      * @return кількість чисел, задану користувачем
     */
    public static int Get_num(){
        System.out.println("Enter the quantity of numbers: ");
        Scanner ent_num = new Scanner(System.in);
        int n = ent_num.nextInt();
        return n;
    }
    /**
     * Метод для створення масиву чисел Фібоначчіта їх виведення на екран
     * @param n визначає розмірність масиву
     * @return згенерований масив чисел
     */
    public static Fibonacci[] Fib_arr(int n){
        Fibonacci[] arr = new Fibonacci[n];
        for (int i = 0; i < n; i++){
            arr[i] = new Fibonacci();
        }
        arr[0].setNumber(1);
        arr[0].setValue(1);
        arr[1].setNumber(2);
        arr[1].setValue(1);
        for (int i = 2; i < arr.length; ++i) {
            arr[i].setNumber(i+1);
            arr[i].setValue(arr[i-1].getValue()+arr[i-2].getValue());
        }
        System.out.println("Fibonacci numbers: ");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i].getNumber()+"  "+arr[i].getValue());
        }
        return arr;
    }

    /**
     * Метод для генерування маисву кубів чисел
     * @param n визначає розмірність масиву
     * @param arr передає значення чисел Фібоначчі
     * @return сформований масив кубів чисел
     */
    public static int[] Cube_arr(int n, Fibonacci[] arr){
        int[] arr_cube = new int[n];
        for (int i=1; i*i*i+1 <= arr[n-1].getValue() && i<=n; i++){
            int k = i;
            arr_cube[i-1] = k*k*k+1;
        }
        return arr_cube;
    }
    /**
     * Метод для виклику всіх вищезгаданих функцій
     * @param args
     */
    public static void main(String[] args) {
        int n = Get_num();
        Fibonacci[] arr = Fib_arr(n);
        int[] arr_cube = Cube_arr(n, arr);
        Show_res(arr_cube, n, arr);
    }
}