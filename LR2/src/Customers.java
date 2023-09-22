public class Customers {
    private int id;
    private String last_name;
    private String name;
    private String second_name;
    private String address;
    private String card_numb;
    private int cash_numb;



    public Customers(int id, String last_name, String name, String second_name, String address, String card_numb, int cash_numb) {
        this.id = id;
        this.last_name = last_name;
        this.name = name;
        this.second_name = second_name;
        this.address = address;
        this.card_numb = card_numb;
        this.cash_numb = cash_numb;
    }

    @Override
    public String toString() {
        return  " ID: " + id +"\n"+
                " Last name: '" + last_name + '\'' +"\n"+
                " Name: '" + name + '\'' +
                " Second name: '" + second_name + '\'' +"\n"+
                " Address: '" + address + '\'' +"\n"+
                " Card number: " + card_numb +"\n"+
                " Number of money: " + cash_numb +"\n"
                ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard_numb() {
        return card_numb;
    }

    public void setCard_numb(String card_numb) {
        this.card_numb = card_numb;
    }

    public int getCash_numb() {
        return cash_numb;
    }

    public void setCash_numb(int cash_numb) {
        this.cash_numb = cash_numb;
    }
}
