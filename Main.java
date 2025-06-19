class Product {
    // Attributes (encapsulated with private access modifiers)
    private String productName;
    private String productID;
    private double pricePerUnit;
    private int stockQuantity;
    private double totalRevenue;

    // Constructor to initialize the product
    public Product(String productName, String productID, double pricePerUnit, int stockQuantity) {
        this.productName = productName;
        this.productID = productID;
        this.pricePerUnit = pricePerUnit;
        this.stockQuantity = stockQuantity;
        this.totalRevenue = 0.0; // Initially no revenue
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    // Method to process a sale
    public void processSale(int unitsSold) {
        if (unitsSold > stockQuantity) {
            System.out.println("Insufficient stock! Sale cannot be processed.");
        } else {
            stockQuantity -= unitsSold; // Reduce stock quantity
            double saleAmount = unitsSold * pricePerUnit; // Calculate sale amount
            totalRevenue += saleAmount; // Add to total revenue
            System.out.println(unitsSold + " units sold. Total sale amount: $" + saleAmount);
        }
    }

    // Method to restock the product
    public void restockProduct(int unitsToRestock) {
        if (unitsToRestock > 0) {
            stockQuantity += unitsToRestock;
            System.out.println("Restocked " + unitsToRestock + " units. Current stock: " + stockQuantity);
        } else {
            System.out.println("Invalid restock amount. Restock must be positive.");
        }
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price per Unit: $" + pricePerUnit);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Total Revenue: $" + totalRevenue);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Product class
        Product product = new Product("Laptop", "P123", 1200.50, 10);

        // Display initial product details
        System.out.println("Initial Product Details:");
        product.displayProductDetails();

        System.out.println("\nProcessing Sales...");
        // Simulate a sale
        product.processSale(3); // Sell 3 units
        product.processSale(5); // Sell 5 units
        product.processSale(8); // Attempt to sell more than available stock

        System.out.println("\nRestocking Product...");
        // Restock the product
        product.restockProduct(10); // Restock 10 units

        System.out.println("\nProcessing More Sales...");
        // Simulate another sale
        product.processSale(8); // Sell 8 units

        // Display final product details
        System.out.println("\nFinal Product Details:");
        product.displayProductDetails();
    }
}

