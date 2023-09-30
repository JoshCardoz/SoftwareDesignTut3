 public class Main {
        public static void main(String[] args) {
            int productID = CashRegister.getKeyboardInput();

            String[] productInfo = CashRegister.findInDB(productID);

            CashRegister.postToDisplay(productInfo);
        }
    }
