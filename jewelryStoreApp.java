import java.util.Scanner;

public class JewelryStoreApp {
   public JewelryStoreApp() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      CrudManager var2 = new CrudManager();

      while(true) {
         while(true) {
            System.out.println("\n=== Jewelry Store Management System ===");
            System.out.println("1. Add Jewelry");
            System.out.println("2. View All Jewelry");
            System.out.println("3. Update Jewelry");
            System.out.println("4. Delete Jewelry");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int var3 = Integer.parseInt(var1.nextLine());
            switch (var3) {
               case 1:
                  System.out.print("Enter jewelry name: ");
                  String var4 = var1.nextLine();
                  System.out.print("Enter jewelry weight: ");
                  double var5 = Double.parseDouble(var1.nextLine());
                  System.out.print("Enter jewelry type (Ring, Necklace, etc.): ");
                  String var7 = var1.nextLine();
                  Jewelry var8 = new Jewelry(var4, var5, var7);
                  var2.add(var8);
                  break;
               case 2:
                  var2.list();
                  break;
               case 3:
                  System.out.print("Enter jewelry ID to update: ");
                  int var9 = Integer.parseInt(var1.nextLine());
                  System.out.print("Enter new name: ");
                  String var10 = var1.nextLine();
                  System.out.print("Enter new price: ");
                  double var11 = Double.parseDouble(var1.nextLine());
                  System.out.print("Enter new type: ");
                  String var13 = var1.nextLine();
                  var2.update(var9, var10, var11, var13);
                  break;
               case 4:
                  System.out.print("Enter jewelry ID to delete: ");
                  int var14 = Integer.parseInt(var1.nextLine());
                  var2.delete(var14);
                  break;
               case 5:
                  System.out.println("Thank you for using Jewelry Store Management System!");
                  var1.close();
                  System.exit(0);
                  break;
               default:
                  System.out.println("Invalid choice! Try again.");
            }
         }
      }
   }
}
