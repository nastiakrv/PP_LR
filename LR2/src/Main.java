import java.util.Scanner;

public class Main {
    public static int cust_num (){// введення кількості покупців
        System.out.println("Enter the number of customers: ");
        Scanner cust_num = new Scanner(System.in);
        return cust_num.nextInt();
    }
    public static Customers[] arr_creation(int n){// введення всіх покупців та створення їх масиву
        Customers[] cust_arr = new Customers[n];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<n;i++){
            System.out.println("\nCustomer"+(i+1)+"\n");
            System.out.println("Enter customer's ID: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter customer's last name: ");
            String last_name = scan.nextLine();
            System.out.println("Enter customer's first name: ");
            String first_name = scan.nextLine();
            System.out.println("Enter customer's second name: ");
            String sec_name = scan.nextLine();
            System.out.println("Enter customer's address: ");
            String address = scan.nextLine();
            System.out.println("Enter customer's card number: ");
            String card_num = scan.nextLine();
            System.out.println("Enter customer's number of money: ");
            int money = scan.nextInt();
            cust_arr[i] = new Customers(id,last_name,first_name,sec_name,address,card_num,money);
        }
        return cust_arr;
    }
    public static void arr_print(Customers[] arr, int n){// виведення всіх покупців
        for (int i=0; i<n;i++){
            System.out.println("Customer "+(i+1)+"\n"+arr[i].toString());
        }
    }
    public static void name_cmpr(Customers[] arr, int n){// виведення покупців за заданим ім'ям
        System.out.println("Enter the name of the customer to find: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i=0; i<n;i++){
            if(name.equals(arr[i].getName())){
                System.out.println("Customer "+"\n"+arr[i].toString());
            }
        }
    }

    public static void cust_by_card (Customers[] arr, int n){// виведення покупців з номером карти в заданих межах
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        String low_num = scan.nextLine();
        System.out.println("Enter the larger limit: ");
        String big_num = scan.nextLine();
        long num1 = Long.parseLong(low_num);
        long num2 = Long.parseLong(big_num);
        if(num1>num2){
            long temp = num1;
            num1=num2;
            num2 = temp;
        }
        for(int i=0; i<n;i++){
            long numb = Long.parseLong(arr[i].getCard_numb());
            if(numb>=num1 && numb<=num2){
                System.out.println("Customer "+"\n"+arr[i].toString());
            }
        }

    }

    public static void cust_with_debt (Customers[] arr, int n){// виведення покупців з від'ємним балансом
        int count = 0;
        for(int i=0; i<n;i++){
            if(arr[i].getCash_numb()<0){
                count++;
                System.out.println(count+") "+arr[i].getLast_name()+" "+arr[i].getName()+": "+arr[i].getCash_numb());
            }
        }
        System.out.println("Number of customers: " + count);
    }

    public static void main(String[] args) {
        int n = cust_num();
        Customers[] cust_arr = arr_creation(n);
        //arr_print(cust_arr, n);
        name_cmpr(cust_arr, n);
        //cust_by_card(cust_arr, n);
        //cust_with_debt(cust_arr, n);
    }
}