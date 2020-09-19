public class Fish extends Animal {
  private String name;
  Fish(String nm) {
    name = nm;
  }
  Fish() {
    name = "24601";
  }
  public void changeName(String newName) {
    name = newName;
    System.out.println("Your fish's new name is now " + name);
  }
  public void move() {
    System.out.println("A fish swims.");
  }
  public void move(int x) {
    System.out.println(name + " swam " + x + " feet.");
  }
}
