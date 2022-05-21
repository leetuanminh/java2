public class Dish {
    private int dishID;
    private String dishName;
    private int dishPrice;
    private int dishSize;

    public Dish(int dishID, String dishName, int dishPrice, int dishSize) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dishSize = dishSize;
    }

    public Dish(String dishName, int dishPrice) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    public int getDishID() {
        return this.dishID;
    }

    public String getDishName() {
        return this.dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getDishPrice() {
        return this.dishPrice;
    }

    public int getDishSize() {
        return this.dishSize;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    public void setDishID(int dishID) {
        this.dishID = dishID;
    }

    public String toString() {
        return "Dish{dishID=" + this.dishID + ", dishName='" + this.dishName + "', dishPrice=" + this.dishPrice + "}";
    }
}