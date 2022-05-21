import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Customer implements Action {
    private static Scanner in;
    private List<Customer.Item> pickList;
    private Menu presentMenu;
    private int total = 0;

    public Customer(Menu menu) {
        this.presentMenu = menu;
        this.pickList = new ArrayList();
    }

    public void getPresentMenu() {
        this.presentMenu.getListMenu();
    }

    public int getTotal() {
        Customer.Item item;
        for(Iterator var1 = this.pickList.iterator(); var1.hasNext(); this.total += item.getCalculateItem()) {
            item = (Customer.Item)var1.next();
        }

        return this.total;
    }

    public void getPickList() {
        System.out.println("Thành tiền");
        Iterator var1 = this.pickList.iterator();

        while(var1.hasNext()) {
            Customer.Item item = (Customer.Item)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = item.getDish().getDishName();
            var10000.println(var10001 + "(" + item.quantity + "*" + item.dish.getDishPrice() + "$): " + item.getCalculateItem() + "$");
        }

        System.out.println("\nThành tiền: " + this.getTotal() + "$");
    }

    public void addDish() {
        System.out.println("Thêm món");
        this.presentMenu.getListMenu();
        System.out.println("Nhập ID món");

        try {
            int idNew = in.nextInt();
            if (this.presentMenu.getMenu().stream().anyMatch((dish) -> {
                return dish.getDishID() == idNew;
            })) {
                Dish dishNew = (Dish)this.presentMenu.getMenu().get(idNew);
                System.out.println("Mời bạn nhập số lượng " + dishNew.getDishName());
                int qty = in.nextInt();
                Customer.Item item = new Customer.Item(qty, dishNew);
                this.pickList.add(item);
                System.out.println("Thêm món thành công");
            } else {
                System.out.println("ID món không tồn tại");
            }
        } catch (Exception var5) {
            System.out.println("Số lượng và ID phải ở dạng số");
        }

    }

    public void removeDish() {
        System.out.println("Xóa món");
        System.out.println("Nhập ID món cần xóa");

        try {
            int id = in.nextInt();
            this.pickList.removeIf((item) -> {
                return item.dish.getDishID() == id;
            });
            System.out.println("Hoàn tất việc xóa");
        } catch (Exception var2) {
            System.out.println("ID phải ở dạng số");
        }

    }

    public void updateDish() {
        System.out.println("Sửa số lượng");
        System.out.println("Mời bạn nhập ID món cần sửa");

        try {
            int id = in.nextInt();
            if (this.pickList.stream().anyMatch((item) -> {
                return item.dish.getDishID() == id;
            })) {
                System.out.println("Mời bạn nhập số lượng thay đổi");
                int qty = in.nextInt();
                ((Customer.Item)this.pickList.stream().filter((item) -> {
                    return item.dish.getDishID() == id;
                }).findAny().get()).setQuantity(qty);
            } else {
                System.out.println("ID không tồn tại");
            }

            System.out.println("Hoàn tất việc sửa");
        } catch (Exception var3) {
            System.out.println("ID phải ở dạng số");
        }

    }

    static {
        in = new Scanner(System.in);
    }

    private class Item {
        private int quantity;
        private Dish dish;

        public Item(Dish dish) {
            this.dish = dish;
        }

        public Item(int quantity, Dish dish) {
            this.quantity = quantity;
            this.dish = dish;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public Dish getDish() {
            return this.dish;
        }

        public int getCalculateItem() {
            return this.dish.getDishPrice() * this.quantity;
        }
    }
}

