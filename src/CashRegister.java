public class CashRegister {

    public static int getKeyboardInput(){
        return Keyboard.getInput();
    }

    public static String[] findInDB(int productID) {
        return ProductRead.findProductInfo(productID);
    }

    public static void postToDisplay(String[] productInfo){
        if(productInfo != null) {
            Display.displayName(productInfo[0]);
            Display.displayPrice(productInfo[1]);
        }
        else{
            System.out.println("Could not find Product ID");
        }
    }
}
