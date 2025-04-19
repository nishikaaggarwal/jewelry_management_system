//jewelry.java
//sourceCode
public class Jewelry {
   private static int counter = 1;
   private int id;
   private String name;
   private double weight;
   private String type;

   public Jewelry(String var1, double var2, String var4) {
      this.id = counter++;
      this.name = var1;
      this.weight = var2;
      this.type = var4;
   }

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public double getWeight() {
      return this.weight;
   }

   public String getType() {
      return this.type;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setWeight(double var1) {
      this.weight = var1;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public String toString() {
      return "ID: " + this.id + " | Name: " + this.name + " | Weight: rs" + this.weight + " | Type: " + this.type;
   }
}
