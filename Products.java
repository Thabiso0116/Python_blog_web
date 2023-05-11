package productsPack;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Products {
    private ArrayList<Product> products;
    private Scanner scanner;

    public Products() {
        this.products = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addProducts() {
        String name;
        double price;
        JOptionPanel.showInputDialog("Enter product details. Enter \"ZZZ\" to finish.",JOptionPane.ERROR_MESSAGE);
        do {
            JOptionPanel.showInputDialog("Product name: ",JOptionPane.ERROR_MESSAGE);
            name = scanner.nextLine();
            if (name.equals("ZZZ")) {
                break;
            }
            JOptionPanel.showInputDialog("Price: ",JOptionPane.ERROR_MESSAGE);
            price = Integer.parseInt(scanner.nextDouble());
            scanner.nextLine();
            Product product = new Product(name, price);
            products.add(product);
        } while (true);
        displayProducts();
    }

    public void displayProducts() {
        JOptionPanel.showInputDialog("Products:",JOptionPane.ERROR_MESSAGE);
        for (Product product : products) {
            JOptionPanel.showInputDialog(product);
        }
        JOptionPanel.showInputDialog("\nMenu:");
        JOptionPanel.showInputDialog("1. Add a new product");
        JOptionPanel.showInputDialog("2. Delete a product");
        JOptionPanel.showInputDialog("3. Change a product");
        JOptionPanel.showInputDialog("4. Search for a product");
        JOptionPanel.showInputDialog("5. Display the total price of all the products");
        JOptionPanel.showInputDialog("6. Exit the application");
        JOptionPanel.showInputDialog("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                addProducts();
                break;
            case 2:
                deleteProducts();
                break;
            case 3:
                changeProducts();
                break;
            case 4:
                searchProducts();
                break;
            case 5:
                displayTotalPrice();
                break;
            case 6:
                JOptionPane.showMessageDialog(Null,"Good bye",JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid choice.",JOptionPane.INFORMATION_MESSAGE);
                displayProducts();
                break;
        }
    }

    public void deleteProducts() {
        JOptionPanel.showInputDialog("Delete a product:",JOptionPane.WARNING_MESSAGE);
        for (int i = 0; i < products.size(); i++) {
            JOptionPane.showMessageDialog(i + 1 + ". " + products.get(i));
        }
        JOptionPanel.showInputDialog("Enter the number of the product to delete: ",JOptionPane.WARNING_MESSAGE);
        int choice = Integer.parseInt(scanner.nextInt());
        scanner.nextLine();
        if (choice >= 1 && choice <= products.size()) {
            products.remove(choice - 1);
            JOptionPane.showMessageDialog(null,"Product deleted.",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Invalid choice.",JOptionPane.INFORMATION_MESSAGE);
        }
        displayProducts();
    }

    public void changeProducts() { 
        String name;
        double price;
        JOptionPanel.showInputDialog("Enter the new product name: "" ",JOptionPane.ERROR_MESSAGE);
        do {
            JOptionPanel.showInputDialog("Product name: ",JOptionPane.ERROR_MESSAGE);
            name = scanner.nextLine();
            if (name.equals("ZZZ")) {
                break;
            }
            JOptionPanel.showInputDialog("Enter the price for "+name+ ":",JOptionPane.ERROR_MESSAGE);
            price = Integer.parseInt(scanner.nextDouble());
            scanner.nextLine();
            Product product = new Product(name, price);
            products.add(product);
        } while (true);
        changeProducts();
    }

    public void searchProducts() { 
        String name;
        double price;
        JOptionPanel.showInputDialog("Which product do you want to search for? ",JOptionPane.ERROR_MESSAGE);
        do {
            JOptionPanel.showInputDialog("Which product do you want to search for? ",JOptionPane.ERROR_MESSAGE);
            name = scanner.nextLine();
            if (name.equals(name==-1)) {
                JOptionPane.showMessageDialog(null,"Theres is no such product",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"The price of "+name+" is "+price+,JOptionPane.INFORMATION_MESSAGE);
            }
            Product product = new Product(name);
            products.find(product);
        } while (true);
        searchProducts()
    }
    



}
class {
    public static void main(string[] args){
        ArrayList<String> list= new ArrayList<>(Arrays.list(name,price))
         Products.addProduct()

    }
}