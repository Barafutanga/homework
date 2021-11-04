package ProgramLogic.entities.extens;

public class step10addon {

        public String name;
        public double price;
        public int quantity;
        
        public double merchTotal() {
            return quantity * price; 
        }
        //adição de bens no estoque
        public void addProduct(int quantity) {
            this.quantity += quantity;
        }
        //remoção de bens no estoque
        public void removeProduct(int quantity) {
            this.quantity -= quantity;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String toString() {
            return name 
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, total: $"
                + String.format("%.2f",merchTotal()); 
        }    
}
